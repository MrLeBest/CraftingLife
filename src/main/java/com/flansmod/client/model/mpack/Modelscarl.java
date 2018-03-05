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
/*      */ public class Modelscarl
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelscarl()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ȗ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[92];
/*   23 */     this.ammoModel = new ModelRendererTurbo[50];
/*   24 */     this.slideModel = new ModelRendererTurbo[44];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initgunModel_2();
/*   28 */     initdefaultScopeModel_1();
/*   29 */     initammoModel_1();
/*   30 */     initslideModel_1();
/*      */     
/*   32 */     this.gripAttachPoint = new Vector3f(8.1875F, 3.5F, 0.0F);
/*   33 */     this.scopeAttachPoint = new Vector3f(0.625F, 5.4375F, 0.0F);
/*      */     
/*   35 */     translateAll(-0.5F, -15.0F, 0.0F);
/*   36 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*      */     
/*   38 */     this.gunSlideDistance = 2.75F;
/*   39 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   42 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   47 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[1] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[2] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[3] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[4] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[5] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[6] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[7] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[8] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[9] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[10] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[11] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[12] = new ModelRendererTurbo(this, 1193, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[13] = new ModelRendererTurbo(this, 1225, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[14] = new ModelRendererTurbo(this, 1257, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[15] = new ModelRendererTurbo(this, 1353, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[16] = new ModelRendererTurbo(this, 1537, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[17] = new ModelRendererTurbo(this, 1641, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[18] = new ModelRendererTurbo(this, 1745, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[19] = new ModelRendererTurbo(this, 1777, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[20] = new ModelRendererTurbo(this, 1817, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[21] = new ModelRendererTurbo(this, 1937, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[22] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*   70 */     this.gunModel[23] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[24] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[25] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*   73 */     this.gunModel[26] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[27] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[28] = new ModelRendererTurbo(this, 2009, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[29] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[30] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[31] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[32] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[33] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[34] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[35] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[36] = new ModelRendererTurbo(this, 1185, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[37] = new ModelRendererTurbo(this, 1209, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[38] = new ModelRendererTurbo(this, 1241, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[39] = new ModelRendererTurbo(this, 1337, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[40] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/*   88 */     this.gunModel[41] = new ModelRendererTurbo(this, 1625, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[42] = new ModelRendererTurbo(this, 1521, 9, this.textureX, this.textureY);
/*   90 */     this.gunModel[43] = new ModelRendererTurbo(this, 1729, 9, this.textureX, this.textureY);
/*   91 */     this.gunModel[44] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*   92 */     this.gunModel[45] = new ModelRendererTurbo(this, 1801, 9, this.textureX, this.textureY);
/*   93 */     this.gunModel[46] = new ModelRendererTurbo(this, 1921, 9, this.textureX, this.textureY);
/*   94 */     this.gunModel[47] = new ModelRendererTurbo(this, 1993, 9, this.textureX, this.textureY);
/*   95 */     this.gunModel[48] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*   96 */     this.gunModel[49] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*   97 */     this.gunModel[50] = new ModelRendererTurbo(this, 889, 17, this.textureX, this.textureY);
/*   98 */     this.gunModel[51] = new ModelRendererTurbo(this, 1129, 25, this.textureX, this.textureY);
/*   99 */     this.gunModel[52] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  100 */     this.gunModel[53] = new ModelRendererTurbo(this, 1537, 25, this.textureX, this.textureY);
/*  101 */     this.gunModel[54] = new ModelRendererTurbo(this, 1713, 25, this.textureX, this.textureY);
/*  102 */     this.gunModel[55] = new ModelRendererTurbo(this, 897, 41, this.textureX, this.textureY);
/*  103 */     this.gunModel[56] = new ModelRendererTurbo(this, 1537, 41, this.textureX, this.textureY);
/*  104 */     this.gunModel[57] = new ModelRendererTurbo(this, 1721, 41, this.textureX, this.textureY);
/*  105 */     this.gunModel[58] = new ModelRendererTurbo(this, 1905, 25, this.textureX, this.textureY);
/*  106 */     this.gunModel[59] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  107 */     this.gunModel[60] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  108 */     this.gunModel[61] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*  109 */     this.gunModel[62] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  110 */     this.gunModel[63] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  111 */     this.gunModel[64] = new ModelRendererTurbo(this, 1089, 41, this.textureX, this.textureY);
/*  112 */     this.gunModel[65] = new ModelRendererTurbo(this, 1113, 41, this.textureX, this.textureY);
/*  113 */     this.gunModel[66] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  114 */     this.gunModel[67] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*  115 */     this.gunModel[68] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*  116 */     this.gunModel[69] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/*  117 */     this.gunModel[70] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/*  118 */     this.gunModel[71] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  119 */     this.gunModel[72] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*  120 */     this.gunModel[73] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/*  121 */     this.gunModel[74] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  122 */     this.gunModel[75] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  123 */     this.gunModel[76] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*  124 */     this.gunModel[77] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  125 */     this.gunModel[78] = new ModelRendererTurbo(this, 529, 49, this.textureX, this.textureY);
/*  126 */     this.gunModel[79] = new ModelRendererTurbo(this, 553, 49, this.textureX, this.textureY);
/*  127 */     this.gunModel[80] = new ModelRendererTurbo(this, 721, 49, this.textureX, this.textureY);
/*  128 */     this.gunModel[81] = new ModelRendererTurbo(this, 745, 49, this.textureX, this.textureY);
/*  129 */     this.gunModel[82] = new ModelRendererTurbo(this, 1129, 49, this.textureX, this.textureY);
/*  130 */     this.gunModel[83] = new ModelRendererTurbo(this, 761, 57, this.textureX, this.textureY);
/*  131 */     this.gunModel[84] = new ModelRendererTurbo(this, 1905, 49, this.textureX, this.textureY);
/*  132 */     this.gunModel[85] = new ModelRendererTurbo(this, 921, 57, this.textureX, this.textureY);
/*  133 */     this.gunModel[86] = new ModelRendererTurbo(this, 2009, 49, this.textureX, this.textureY);
/*  134 */     this.gunModel[87] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*  135 */     this.gunModel[88] = new ModelRendererTurbo(this, 1729, 57, this.textureX, this.textureY);
/*  136 */     this.gunModel[89] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/*  137 */     this.gunModel[90] = new ModelRendererTurbo(this, 1073, 65, this.textureX, this.textureY);
/*  138 */     this.gunModel[91] = new ModelRendererTurbo(this, 513, 73, this.textureX, this.textureY);
/*  139 */     this.gunModel[92] = new ModelRendererTurbo(this, 1473, 73, this.textureX, this.textureY);
/*  140 */     this.gunModel[93] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  141 */     this.gunModel[94] = new ModelRendererTurbo(this, 1881, 65, this.textureX, this.textureY);
/*  142 */     this.gunModel[95] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  143 */     this.gunModel[96] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/*  144 */     this.gunModel[97] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*  145 */     this.gunModel[98] = new ModelRendererTurbo(this, 929, 73, this.textureX, this.textureY);
/*  146 */     this.gunModel[99] = new ModelRendererTurbo(this, 953, 73, this.textureX, this.textureY);
/*  147 */     this.gunModel[100] = new ModelRendererTurbo(this, 977, 73, this.textureX, this.textureY);
/*  148 */     this.gunModel[101] = new ModelRendererTurbo(this, 889, 17, this.textureX, this.textureY);
/*  149 */     this.gunModel[102] = new ModelRendererTurbo(this, 1001, 73, this.textureX, this.textureY);
/*  150 */     this.gunModel[103] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  151 */     this.gunModel[104] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  152 */     this.gunModel[105] = new ModelRendererTurbo(this, 1041, 81, this.textureX, this.textureY);
/*  153 */     this.gunModel[106] = new ModelRendererTurbo(this, 1857, 73, this.textureX, this.textureY);
/*  154 */     this.gunModel[107] = new ModelRendererTurbo(this, 1073, 81, this.textureX, this.textureY);
/*  155 */     this.gunModel[108] = new ModelRendererTurbo(this, 1105, 81, this.textureX, this.textureY);
/*  156 */     this.gunModel[109] = new ModelRendererTurbo(this, 905, 73, this.textureX, this.textureY);
/*  157 */     this.gunModel[110] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/*  158 */     this.gunModel[111] = new ModelRendererTurbo(this, 1137, 81, this.textureX, this.textureY);
/*  159 */     this.gunModel[112] = new ModelRendererTurbo(this, 1161, 81, this.textureX, this.textureY);
/*  160 */     this.gunModel[113] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/*  161 */     this.gunModel[114] = new ModelRendererTurbo(this, 961, 81, this.textureX, this.textureY);
/*  162 */     this.gunModel[115] = new ModelRendererTurbo(this, 1185, 81, this.textureX, this.textureY);
/*  163 */     this.gunModel[116] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  164 */     this.gunModel[117] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*  165 */     this.gunModel[118] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[119] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  167 */     this.gunModel[120] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  168 */     this.gunModel[121] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  169 */     this.gunModel[122] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  170 */     this.gunModel[123] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  171 */     this.gunModel[124] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  172 */     this.gunModel[125] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  173 */     this.gunModel[126] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  174 */     this.gunModel[127] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 1257, 1, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1201, 81, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 1241, 81, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 1281, 81, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 1321, 81, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 1361, 81, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 1385, 81, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 1425, 81, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 1465, 81, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 1225, 81, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 1265, 81, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 1305, 81, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 1505, 81, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 1545, 81, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 1585, 81, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 1609, 81, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 1657, 81, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 2009, 1, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 2025, 1, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 625, 9, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 1537, 9, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 1729, 9, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 1185, 9, this.textureX, this.textureY);
/*  207 */     this.gunModel[' '] = new ModelRendererTurbo(this, 825, 9, this.textureX, this.textureY);
/*  208 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 1241, 9, this.textureX, this.textureY);
/*  209 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 1337, 9, this.textureX, this.textureY);
/*  210 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1705, 81, this.textureX, this.textureY);
/*  211 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 1345, 81, this.textureX, this.textureY);
/*  212 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1897, 25, this.textureX, this.textureY);
/*  213 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 1097, 81, this.textureX, this.textureY);
/*  214 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1409, 81, this.textureX, this.textureY);
/*  215 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 1081, 41, this.textureX, this.textureY);
/*  216 */     this.gunModel['©'] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/*  217 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1449, 81, this.textureX, this.textureY);
/*  218 */     this.gunModel['«'] = new ModelRendererTurbo(this, 1489, 81, this.textureX, this.textureY);
/*  219 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1769, 81, this.textureX, this.textureY);
/*  220 */     this.gunModel['­'] = new ModelRendererTurbo(this, 561, 17, this.textureX, this.textureY);
/*  221 */     this.gunModel['®'] = new ModelRendererTurbo(this, 585, 17, this.textureX, this.textureY);
/*  222 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 609, 17, this.textureX, this.textureY);
/*  223 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1817, 81, this.textureX, this.textureY);
/*  224 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1881, 81, this.textureX, this.textureY);
/*  225 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1905, 81, this.textureX, this.textureY);
/*  226 */     this.gunModel['³'] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/*  227 */     this.gunModel['´'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  228 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/*  229 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 161, 89, this.textureX, this.textureY);
/*  230 */     this.gunModel['·'] = new ModelRendererTurbo(this, 2009, 81, this.textureX, this.textureY);
/*  231 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 177, 89, this.textureX, this.textureY);
/*  232 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  233 */     this.gunModel['º'] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*  234 */     this.gunModel['»'] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  235 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/*  236 */     this.gunModel['½'] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  237 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/*  238 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 505, 89, this.textureX, this.textureY);
/*  239 */     this.gunModel['À'] = new ModelRendererTurbo(this, 545, 89, this.textureX, this.textureY);
/*  240 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/*  241 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 617, 89, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/*  244 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 737, 89, this.textureX, this.textureY);
/*  245 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 777, 89, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 817, 89, this.textureX, this.textureY);
/*  247 */     this.gunModel['È'] = new ModelRendererTurbo(this, 393, 97, this.textureX, this.textureY);
/*  248 */     this.gunModel['É'] = new ModelRendererTurbo(this, 841, 97, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 913, 97, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 985, 97, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1833, 89, this.textureX, this.textureY);
/*  252 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/*  253 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1857, 89, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1041, 97, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 601, 89, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 641, 89, this.textureX, this.textureY);
/*  260 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 1065, 97, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 1121, 97, this.textureX, this.textureY);
/*  262 */     this.gunModel['×'] = new ModelRendererTurbo(this, 1385, 97, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 681, 89, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 1745, 81, this.textureX, this.textureY);
/*  266 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 721, 89, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 761, 89, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 1793, 81, this.textureX, this.textureY);
/*  269 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 801, 89, this.textureX, this.textureY);
/*  270 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 1977, 89, this.textureX, this.textureY);
/*  271 */     this.gunModel['à'] = new ModelRendererTurbo(this, 1449, 97, this.textureX, this.textureY);
/*  272 */     this.gunModel['á'] = new ModelRendererTurbo(this, 1489, 97, this.textureX, this.textureY);
/*  273 */     this.gunModel['â'] = new ModelRendererTurbo(this, 1521, 97, this.textureX, this.textureY);
/*  274 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 145, 97, this.textureX, this.textureY);
/*  275 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 897, 97, this.textureX, this.textureY);
/*  276 */     this.gunModel['å'] = new ModelRendererTurbo(this, 969, 97, this.textureX, this.textureY);
/*  277 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 1177, 97, this.textureX, this.textureY);
/*  278 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 1593, 97, this.textureX, this.textureY);
/*  279 */     this.gunModel['è'] = new ModelRendererTurbo(this, 1633, 97, this.textureX, this.textureY);
/*  280 */     this.gunModel['é'] = new ModelRendererTurbo(this, 1673, 97, this.textureX, this.textureY);
/*  281 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 1713, 97, this.textureX, this.textureY);
/*  282 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  283 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 2033, 9, this.textureX, this.textureY);
/*  284 */     this.gunModel['í'] = new ModelRendererTurbo(this, 2041, 9, this.textureX, this.textureY);
/*  285 */     this.gunModel['î'] = new ModelRendererTurbo(this, 1801, 9, this.textureX, this.textureY);
/*  286 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 1817, 9, this.textureX, this.textureY);
/*  287 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 1921, 9, this.textureX, this.textureY);
/*  288 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1937, 9, this.textureX, this.textureY);
/*  289 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 1993, 9, this.textureX, this.textureY);
/*  290 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 1177, 17, this.textureX, this.textureY);
/*  291 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 1353, 17, this.textureX, this.textureY);
/*  292 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 761, 49, this.textureX, this.textureY);
/*  293 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 697, 105, this.textureX, this.textureY);
/*  294 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  295 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  296 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1193, 17, this.textureX, this.textureY);
/*  297 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 1209, 17, this.textureX, this.textureY);
/*  298 */     this.gunModel['û'] = new ModelRendererTurbo(this, 1449, 17, this.textureX, this.textureY);
/*  299 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 1465, 17, this.textureX, this.textureY);
/*  300 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 1481, 17, this.textureX, this.textureY);
/*  301 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 1497, 17, this.textureX, this.textureY);
/*  302 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1953, 17, this.textureX, this.textureY);
/*  303 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 1777, 17, this.textureX, this.textureY);
/*  304 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  305 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  306 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  307 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 1513, 17, this.textureX, this.textureY);
/*  308 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 1793, 17, this.textureX, this.textureY);
/*  309 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1985, 17, this.textureX, this.textureY);
/*  310 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  312 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 857, 49, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 1529, 49, this.textureX, this.textureY);
/*  314 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*  315 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/*  316 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1937, 17, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*  318 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*  319 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  320 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 1129, 25, this.textureX, this.textureY);
/*  321 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/*  322 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*  323 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 1089, 57, this.textureX, this.textureY);
/*  324 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 1105, 41, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  326 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  328 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 1873, 57, this.textureX, this.textureY);
/*  330 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 889, 17, this.textureX, this.textureY);
/*  332 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 2025, 49, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 905, 57, this.textureX, this.textureY);
/*  334 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 521, 65, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 545, 65, this.textureX, this.textureY);
/*  336 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 569, 65, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 593, 65, this.textureX, this.textureY);
/*  338 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 617, 65, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 641, 65, this.textureX, this.textureY);
/*  340 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 577, 17, this.textureX, this.textureY);
/*  342 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 601, 17, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1713, 25, this.textureX, this.textureY);
/*  344 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 1881, 97, this.textureX, this.textureY);
/*  346 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 1569, 97, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 1897, 97, this.textureX, this.textureY);
/*  348 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 1921, 97, this.textureX, this.textureY);
/*  349 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 625, 17, this.textureX, this.textureY);
/*  350 */     this.gunModel['į'] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/*  351 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 1993, 97, this.textureX, this.textureY);
/*  352 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 105, 105, this.textureX, this.textureY);
/*  353 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/*  354 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 1633, 17, this.textureX, this.textureY);
/*  355 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 1537, 25, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*  358 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 1897, 25, this.textureX, this.textureY);
/*  359 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1721, 41, this.textureX, this.textureY);
/*  360 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 1937, 97, this.textureX, this.textureY);
/*  361 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 785, 105, this.textureX, this.textureY);
/*  363 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 1649, 97, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 1201, 105, this.textureX, this.textureY);
/*  365 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 1249, 105, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 1737, 105, this.textureX, this.textureY);
/*  367 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 353, 113, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 833, 113, this.textureX, this.textureY);
/*  369 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 1273, 105, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 953, 113, this.textureX, this.textureY);
/*  371 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 681, 121, this.textureX, this.textureY);
/*  373 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 1433, 113, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 1977, 113, this.textureX, this.textureY);
/*  375 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  376 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/*  377 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 1233, 105, this.textureX, this.textureY);
/*  378 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 705, 49, this.textureX, this.textureY);
/*  380 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 937, 81, this.textureX, this.textureY);
/*  382 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 1025, 121, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 1281, 121, this.textureX, this.textureY);
/*  384 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/*  385 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 553, 121, this.textureX, this.textureY);
/*  386 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 1617, 113, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 1697, 105, this.textureX, this.textureY);
/*  388 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 1105, 97, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 1433, 97, this.textureX, this.textureY);
/*  390 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 1361, 105, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 1857, 105, this.textureX, this.textureY);
/*  392 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 1177, 121, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 1385, 121, this.textureX, this.textureY);
/*  394 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 817, 105, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 1873, 113, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 1513, 121, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 1921, 113, this.textureX, this.textureY);
/*  398 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 1617, 97, this.textureX, this.textureY);
/*  399 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 1497, 113, this.textureX, this.textureY);
/*  400 */     this.gunModel['š'] = new ModelRendererTurbo(this, 1897, 121, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 1937, 121, this.textureX, this.textureY);
/*  402 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 153, 129, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 313, 129, this.textureX, this.textureY);
/*  404 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 633, 129, this.textureX, this.textureY);
/*  406 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 817, 129, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 865, 129, this.textureX, this.textureY);
/*  408 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 913, 129, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 945, 129, this.textureX, this.textureY);
/*  410 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 969, 129, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1193, 129, this.textureX, this.textureY);
/*  412 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 1233, 129, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 1401, 129, this.textureX, this.textureY);
/*  414 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/*  416 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  418 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  420 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 521, 49, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*  422 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 849, 129, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 673, 65, this.textureX, this.textureY);
/*  424 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 705, 65, this.textureX, this.textureY);
/*  425 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 1009, 137, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 1729, 137, this.textureX, this.textureY);
/*  427 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 1473, 65, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  429 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 1273, 137, this.textureX, this.textureY);
/*  430 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/*  431 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 137, 145, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 681, 145, this.textureX, this.textureY);
/*  433 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 1601, 65, this.textureX, this.textureY);
/*  434 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 1849, 145, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 257, 153, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 865, 153, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 985, 153, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 1097, 153, this.textureX, this.textureY);
/*  439 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 1545, 121, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 233, 105, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 897, 129, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 529, 89, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 873, 49, this.textureX, this.textureY);
/*  444 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 737, 65, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 1649, 137, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 1345, 105, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/*  452 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 1033, 73, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 841, 89, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 1161, 129, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*  456 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 1265, 9, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 1977, 137, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 545, 49, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/*  461 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 737, 49, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 793, 17, this.textureX, this.textureY);
/*  463 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 2033, 57, this.textureX, this.textureY);
/*  464 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 841, 17, this.textureX, this.textureY);
/*  465 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 1177, 81, this.textureX, this.textureY);
/*  466 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 2025, 97, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/*  468 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*  471 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 2041, 25, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 721, 49, this.textureX, this.textureY);
/*  474 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 2009, 49, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 17, 65, this.textureX, this.textureY);
/*  476 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 561, 89, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 873, 89, this.textureX, this.textureY);
/*  479 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 1697, 97, this.textureX, this.textureY);
/*  480 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 833, 105, this.textureX, this.textureY);
/*  482 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 993, 89, this.textureX, this.textureY);
/*  483 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
/*  485 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 889, 49, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 2001, 49, this.textureX, this.textureY);
/*  488 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 1593, 65, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 913, 73, this.textureX, this.textureY);
/*  490 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 945, 73, this.textureX, this.textureY);
/*  491 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 969, 73, this.textureX, this.textureY);
/*  492 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 993, 73, this.textureX, this.textureY);
/*  493 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 1057, 73, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 1073, 73, this.textureX, this.textureY);
/*  495 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  496 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/*  497 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/*  498 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 1129, 81, this.textureX, this.textureY);
/*  499 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 1153, 81, this.textureX, this.textureY);
/*  500 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 1201, 81, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 1129, 137, this.textureX, this.textureY);
/*  502 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 1545, 137, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 2017, 137, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 521, 145, this.textureX, this.textureY);
/*  505 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 793, 145, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 1433, 145, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 1465, 145, this.textureX, this.textureY);
/*  508 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 1361, 81, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 1225, 81, this.textureX, this.textureY);
/*  510 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 1265, 81, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 1305, 81, this.textureX, this.textureY);
/*  512 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 1697, 81, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 1385, 81, this.textureX, this.textureY);
/*  514 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 1161, 105, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 1081, 41, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 1361, 9, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 2033, 81, this.textureX, this.textureY);
/*  518 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 1593, 97, this.textureX, this.textureY);
/*  519 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 1673, 97, this.textureX, this.textureY);
/*  520 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 145, 113, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 1081, 57, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 1121, 57, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 1425, 81, this.textureX, this.textureY);
/*  524 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 1465, 81, this.textureX, this.textureY);
/*  525 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 1505, 81, this.textureX, this.textureY);
/*  526 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 1633, 9, this.textureX, this.textureY);
/*  527 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  528 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 1737, 17, this.textureX, this.textureY);
/*  529 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*  530 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  531 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 1721, 65, this.textureX, this.textureY);
/*  532 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 1841, 81, this.textureX, this.textureY);
/*  533 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/*  534 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 681, 161, this.textureX, this.textureY);
/*  535 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 913, 161, this.textureX, this.textureY);
/*  536 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 1025, 161, this.textureX, this.textureY);
/*  537 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 465, 169, this.textureX, this.textureY);
/*  538 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 289, 161, this.textureX, this.textureY);
/*  539 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 313, 161, this.textureX, this.textureY);
/*  540 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 337, 161, this.textureX, this.textureY);
/*  541 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 641, 161, this.textureX, this.textureY);
/*  542 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 1137, 161, this.textureX, this.textureY);
/*  543 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  544 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/*  545 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 1233, 105, this.textureX, this.textureY);
/*  546 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 737, 89, this.textureX, this.textureY);
/*      */     
/*  548 */     this.gunModel[0].addBox(50.0F, -23.0F, -6.5F, 86, 5, 13, 0.0F);
/*  549 */     this.gunModel[0].setRotationPoint(-58.0F, -22.0F, 0.0F);
/*      */     
/*  551 */     this.gunModel[1].addShapeBox(50.0F, -23.0F, -6.5F, 1, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  552 */     this.gunModel[1].setRotationPoint(28.0F, -22.0F, 0.0F);
/*      */     
/*  554 */     this.gunModel[2].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  555 */     this.gunModel[2].setRotationPoint(28.0F, -17.0F, 0.0F);
/*      */     
/*  557 */     this.gunModel[3].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  558 */     this.gunModel[3].setRotationPoint(27.0F, -15.0F, 0.0F);
/*      */     
/*  560 */     this.gunModel[4].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  561 */     this.gunModel[4].setRotationPoint(24.0F, -15.0F, 0.0F);
/*      */     
/*  563 */     this.gunModel[5].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  564 */     this.gunModel[5].setRotationPoint(23.0F, -15.0F, 0.0F);
/*      */     
/*  566 */     this.gunModel[6].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  567 */     this.gunModel[6].setRotationPoint(21.0F, -14.0F, 0.0F);
/*      */     
/*  569 */     this.gunModel[7].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  570 */     this.gunModel[7].setRotationPoint(20.0F, -13.0F, 0.0F);
/*      */     
/*  572 */     this.gunModel[8].addShapeBox(50.0F, -23.0F, -6.5F, 86, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  573 */     this.gunModel[8].setRotationPoint(-58.0F, -17.0F, 0.0F);
/*      */     
/*  575 */     this.gunModel[9].addShapeBox(50.0F, -23.0F, -6.5F, 80, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  576 */     this.gunModel[9].setRotationPoint(-58.0F, -15.0F, 0.0F);
/*      */     
/*  578 */     this.gunModel[10].addShapeBox(50.0F, -23.0F, -6.5F, 78, 1, 13, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  579 */     this.gunModel[10].setRotationPoint(-57.0F, -14.0F, 0.0F);
/*      */     
/*  581 */     this.gunModel[11].addShapeBox(50.0F, -23.0F, -6.5F, 78, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  582 */     this.gunModel[11].setRotationPoint(-58.0F, -13.0F, 0.0F);
/*      */     
/*  584 */     this.gunModel[12].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  585 */     this.gunModel[12].setRotationPoint(18.5F, -11.0F, 0.0F);
/*      */     
/*  587 */     this.gunModel[13].addShapeBox(50.0F, -23.0F, -6.5F, 1, 10, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  588 */     this.gunModel[13].setRotationPoint(18.5F, -9.0F, 0.0F);
/*      */     
/*  590 */     this.gunModel[14].addShapeBox(50.0F, -23.0F, -6.5F, 33, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 9.0F, 0.0F);
/*  591 */     this.gunModel[14].setRotationPoint(-15.0F, -8.0F, 0.0F);
/*      */     
/*  593 */     this.gunModel[15].addShapeBox(50.0F, -23.0F, -6.5F, 76, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  594 */     this.gunModel[15].setRotationPoint(-57.5F, -11.0F, 0.0F);
/*      */     
/*  596 */     this.gunModel[16].addShapeBox(50.0F, -23.0F, -6.5F, 33, 2, 15, 0.0F, 0.0F, -6.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, 5.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 5.5F, 0.0F);
/*  597 */     this.gunModel[16].setRotationPoint(-15.0F, 4.0F, -1.0F);
/*      */     
/*  599 */     this.gunModel[17].addShapeBox(50.0F, -23.0F, -6.5F, 33, 1, 15, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/*  600 */     this.gunModel[17].setRotationPoint(-15.0F, 5.0F, -1.0F);
/*      */     
/*  602 */     this.gunModel[18].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  603 */     this.gunModel[18].setRotationPoint(-17.0F, -1.0F, 0.0F);
/*      */     
/*  605 */     this.gunModel[19].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  606 */     this.gunModel[19].setRotationPoint(-19.0F, -2.0F, 0.0F);
/*      */     
/*  608 */     this.gunModel[20].addShapeBox(50.0F, -23.0F, -6.5F, 43, 7, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  609 */     this.gunModel[20].setRotationPoint(-58.0F, -9.0F, 0.0F);
/*      */     
/*  611 */     this.gunModel[21].addShapeBox(50.0F, -23.0F, -6.5F, 19, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  612 */     this.gunModel[21].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/*  614 */     this.gunModel[22].addBox(50.0F, -23.0F, -6.5F, 16, 9, 13, 0.0F);
/*  615 */     this.gunModel[22].setRotationPoint(-74.0F, -22.0F, 0.0F);
/*      */     
/*  617 */     this.gunModel[23].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 9, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  618 */     this.gunModel[23].setRotationPoint(-17.0F, 9.0F, 2.0F);
/*      */     
/*  620 */     this.gunModel[24].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  621 */     this.gunModel[24].setRotationPoint(-19.0F, 11.0F, 2.0F);
/*      */     
/*  623 */     this.gunModel[25].addShapeBox(50.0F, -23.0F, -6.5F, 25, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  624 */     this.gunModel[25].setRotationPoint(-44.0F, 11.0F, 2.0F);
/*      */     
/*  626 */     this.gunModel[26].addShapeBox(50.0F, -23.0F, -6.5F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  627 */     this.gunModel[26].setRotationPoint(-42.0F, 9.0F, 2.0F);
/*      */     
/*  629 */     this.gunModel[27].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  630 */     this.gunModel[27].setRotationPoint(-41.0F, 11.0F, 2.0F);
/*      */     
/*  632 */     this.gunModel[28].addShapeBox(50.0F, -23.0F, -6.5F, 2, 11, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  633 */     this.gunModel[28].setRotationPoint(-44.0F, 1.0F, 2.0F);
/*      */     
/*  635 */     this.gunModel[29].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  636 */     this.gunModel[29].setRotationPoint(-42.0F, -1.0F, 2.0F);
/*      */     
/*  638 */     this.gunModel[30].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  639 */     this.gunModel[30].setRotationPoint(-44.0F, -1.0F, 2.0F);
/*      */     
/*  641 */     this.gunModel[31].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  642 */     this.gunModel[31].setRotationPoint(-45.0F, -1.0F, 2.0F);
/*      */     
/*  644 */     this.gunModel[32].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  645 */     this.gunModel[32].setRotationPoint(-47.0F, -1.0F, 2.0F);
/*      */     
/*  647 */     this.gunModel[33].addShapeBox(50.0F, -23.0F, -6.5F, 9, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  648 */     this.gunModel[33].setRotationPoint(-36.0F, -2.0F, 5.0F);
/*      */     
/*  650 */     this.gunModel[34].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  651 */     this.gunModel[34].setRotationPoint(-35.0F, -1.0F, 5.0F);
/*      */     
/*  653 */     this.gunModel[35].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  654 */     this.gunModel[35].setRotationPoint(-35.0F, 1.0F, 5.0F);
/*      */     
/*  656 */     this.gunModel[36].addShapeBox(50.0F, -23.0F, -6.5F, 4, 3, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  657 */     this.gunModel[36].setRotationPoint(-35.0F, 3.0F, 5.0F);
/*      */     
/*  659 */     this.gunModel[37].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[37].setRotationPoint(-35.0F, 6.0F, 5.0F);
/*      */     
/*  662 */     this.gunModel[38].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  663 */     this.gunModel[38].setRotationPoint(-34.0F, 8.0F, 5.0F);
/*      */     
/*  665 */     this.gunModel[39].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  666 */     this.gunModel[39].setRotationPoint(-33.0F, 10.0F, 5.0F);
/*      */     
/*  668 */     this.gunModel[40].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F);
/*  669 */     this.gunModel[40].setRotationPoint(18.5F, 1.0F, 0.0F);
/*      */     
/*  671 */     this.gunModel[41].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  672 */     this.gunModel[41].setRotationPoint(19.5F, 3.0F, 0.0F);
/*      */     
/*  674 */     this.gunModel[42].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  675 */     this.gunModel[42].setRotationPoint(18.0F, 1.0F, 0.0F);
/*      */     
/*  677 */     this.gunModel[43].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  678 */     this.gunModel[43].setRotationPoint(18.0F, 3.0F, 0.0F);
/*      */     
/*  680 */     this.gunModel[44].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F);
/*  681 */     this.gunModel[44].setRotationPoint(18.0F, 5.0F, -1.0F);
/*      */     
/*  683 */     this.gunModel[45].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.5F, 1.0F);
/*  684 */     this.gunModel[45].setRotationPoint(18.0F, 4.0F, 0.0F);
/*      */     
/*  686 */     this.gunModel[46].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.2F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.0F, 0.1F, 0.2F);
/*  687 */     this.gunModel[46].setRotationPoint(19.0F, 4.0F, 0.0F);
/*      */     
/*  689 */     this.gunModel[47].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -1.0F, -2.0F, 0.5F, -1.0F, -2.0F, 0.0F, 0.0F, 0.25F);
/*  690 */     this.gunModel[47].setRotationPoint(19.0F, 4.5F, 0.0F);
/*      */     
/*  692 */     this.gunModel[48].addBox(50.0F, -23.0F, -6.5F, 52, 11, 17, 0.0F);
/*  693 */     this.gunModel[48].setRotationPoint(-77.0F, -34.0F, -2.0F);
/*      */     
/*  695 */     this.gunModel[49].addShapeBox(50.0F, -23.0F, -6.5F, 193, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  696 */     this.gunModel[49].setRotationPoint(-77.0F, -37.0F, -2.0F);
/*      */     
/*  698 */     this.gunModel[50].addShapeBox(50.0F, -23.0F, -6.5F, 108, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  699 */     this.gunModel[50].setRotationPoint(-77.0F, -23.0F, -2.0F);
/*      */     
/*  701 */     this.gunModel[51].addShapeBox(50.0F, -23.0F, -6.5F, 193, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  702 */     this.gunModel[51].setRotationPoint(-77.0F, -39.0F, -1.0F);
/*      */     
/*  704 */     this.gunModel[52].addShapeBox(50.0F, -23.0F, -6.5F, 84, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  705 */     this.gunModel[52].setRotationPoint(33.0F, -23.0F, -1.5F);
/*      */     
/*  707 */     this.gunModel[53].addShapeBox(50.0F, -23.0F, -6.5F, 84, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  708 */     this.gunModel[53].setRotationPoint(33.0F, -18.5F, 3.0F);
/*      */     
/*  710 */     this.gunModel[54].addShapeBox(50.0F, -23.0F, -6.5F, 84, 1, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  711 */     this.gunModel[54].setRotationPoint(33.0F, -16.5F, 1.5F);
/*      */     
/*  713 */     this.gunModel[55].addShapeBox(50.0F, -23.0F, -6.5F, 84, 1, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  714 */     this.gunModel[55].setRotationPoint(33.0F, -20.0F, 1.0F);
/*      */     
/*  716 */     this.gunModel[56].addShapeBox(50.0F, -23.0F, -6.5F, 84, 2, 14, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  717 */     this.gunModel[56].setRotationPoint(33.0F, -22.0F, -0.5F);
/*      */     
/*  719 */     this.gunModel[57].addShapeBox(50.0F, -23.0F, -6.5F, 84, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  720 */     this.gunModel[57].setRotationPoint(33.0F, -15.5F, 1.5F);
/*      */     
/*  722 */     this.gunModel[58].addShapeBox(50.0F, -23.0F, -6.5F, 61, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  723 */     this.gunModel[58].setRotationPoint(-77.0F, -47.0F, 1.5F);
/*      */     
/*  725 */     this.gunModel[59].addShapeBox(50.0F, -23.0F, -6.5F, 14, 8, 10, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  726 */     this.gunModel[59].setRotationPoint(102.0F, -47.0F, 1.5F);
/*      */     
/*  728 */     this.gunModel[60].addShapeBox(50.0F, -23.0F, -6.5F, 46, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  729 */     this.gunModel[60].setRotationPoint(56.0F, -47.0F, 1.5F);
/*      */     
/*  731 */     this.gunModel[61].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  732 */     this.gunModel[61].setRotationPoint(56.0F, -43.5F, 1.5F);
/*      */     
/*  734 */     this.gunModel[62].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  735 */     this.gunModel[62].setRotationPoint(71.75F, -43.5F, 1.5F);
/*      */     
/*  737 */     this.gunModel[63].addShapeBox(50.0F, -23.0F, -6.5F, 12, 1, 10, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  738 */     this.gunModel[63].setRotationPoint(59.75F, -40.5F, 1.5F);
/*      */     
/*  740 */     this.gunModel[64].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  741 */     this.gunModel[64].setRotationPoint(59.5F, -41.5F, 1.5F);
/*      */     
/*  743 */     this.gunModel[65].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  744 */     this.gunModel[65].setRotationPoint(59.5F, -43.5F, 1.5F);
/*      */     
/*  746 */     this.gunModel[66].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  747 */     this.gunModel[66].setRotationPoint(70.75F, -43.5F, 1.5F);
/*      */     
/*  749 */     this.gunModel[67].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  750 */     this.gunModel[67].setRotationPoint(70.75F, -41.5F, 1.5F);
/*      */     
/*  752 */     this.gunModel[68].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  753 */     this.gunModel[68].setRotationPoint(87.0F, -43.5F, 1.5F);
/*      */     
/*  755 */     this.gunModel[69].addShapeBox(50.0F, -23.0F, -6.5F, 12, 1, 10, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  756 */     this.gunModel[69].setRotationPoint(75.0F, -40.5F, 1.5F);
/*      */     
/*  758 */     this.gunModel[70].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  759 */     this.gunModel[70].setRotationPoint(74.75F, -41.5F, 1.5F);
/*      */     
/*  761 */     this.gunModel[71].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  762 */     this.gunModel[71].setRotationPoint(74.75F, -43.5F, 1.5F);
/*      */     
/*  764 */     this.gunModel[72].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  765 */     this.gunModel[72].setRotationPoint(86.0F, -43.5F, 1.5F);
/*      */     
/*  767 */     this.gunModel[73].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  768 */     this.gunModel[73].setRotationPoint(86.0F, -41.5F, 1.5F);
/*      */     
/*  770 */     this.gunModel[74].addShapeBox(50.0F, -23.0F, -6.5F, 12, 1, 10, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  771 */     this.gunModel[74].setRotationPoint(90.25F, -40.5F, 1.5F);
/*      */     
/*  773 */     this.gunModel[75].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  774 */     this.gunModel[75].setRotationPoint(90.0F, -41.5F, 1.5F);
/*      */     
/*  776 */     this.gunModel[76].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  777 */     this.gunModel[76].setRotationPoint(90.0F, -43.5F, 1.5F);
/*      */     
/*  779 */     this.gunModel[77].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  780 */     this.gunModel[77].setRotationPoint(101.25F, -43.5F, 1.5F);
/*      */     
/*  782 */     this.gunModel[78].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  783 */     this.gunModel[78].setRotationPoint(101.25F, -41.5F, 1.5F);
/*      */     
/*  785 */     this.gunModel[79].addShapeBox(50.0F, -23.0F, -6.5F, 72, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  786 */     this.gunModel[79].setRotationPoint(-16.0F, -47.0F, 1.5F);
/*      */     
/*  788 */     this.gunModel[80].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  789 */     this.gunModel[80].setRotationPoint(-16.0F, -44.5F, 1.5F);
/*      */     
/*  791 */     this.gunModel[81].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  792 */     this.gunModel[81].setRotationPoint(-16.0F, -40.5F, 1.5F);
/*      */     
/*  794 */     this.gunModel[82].addShapeBox(50.0F, -23.0F, -6.5F, 193, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  795 */     this.gunModel[82].setRotationPoint(-77.0F, -39.5F, 1.5F);
/*      */     
/*  797 */     this.gunModel[83].addShapeBox(50.0F, -23.0F, -6.5F, 66, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  798 */     this.gunModel[83].setRotationPoint(-13.0F, -40.5F, 1.5F);
/*      */     
/*  800 */     this.gunModel[84].addShapeBox(50.0F, -23.0F, -6.5F, 44, 3, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  801 */     this.gunModel[84].setRotationPoint(59.75F, -43.5F, 3.0F);
/*      */     
/*  803 */     this.gunModel[85].addShapeBox(50.0F, -23.0F, -6.5F, 73, 5, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  804 */     this.gunModel[85].setRotationPoint(-16.25F, -44.5F, 3.0F);
/*      */     
/*  806 */     this.gunModel[86].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  807 */     this.gunModel[86].setRotationPoint(55.0F, -40.5F, 1.5F);
/*      */     
/*  809 */     this.gunModel[87].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  810 */     this.gunModel[87].setRotationPoint(55.0F, -44.5F, 1.5F);
/*      */     
/*  812 */     this.gunModel[88].addShapeBox(50.0F, -23.0F, -6.5F, 66, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  813 */     this.gunModel[88].setRotationPoint(-13.0F, -44.5F, 1.5F);
/*      */     
/*  815 */     this.gunModel[89].addShapeBox(50.0F, -23.0F, -6.5F, 193, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  816 */     this.gunModel[89].setRotationPoint(-77.0F, -49.5F, 2.5F);
/*      */     
/*  818 */     this.gunModel[90].addShapeBox(50.0F, -23.0F, -6.5F, 193, 1, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  819 */     this.gunModel[90].setRotationPoint(-77.0F, -50.0F, 1.0F);
/*      */     
/*  821 */     this.gunModel[91].addShapeBox(50.0F, -23.0F, -6.5F, 193, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  822 */     this.gunModel[91].setRotationPoint(-77.0F, -51.0F, 1.0F);
/*      */     
/*  824 */     this.gunModel[92].addShapeBox(50.0F, -23.0F, -6.5F, 193, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  825 */     this.gunModel[92].setRotationPoint(-77.0F, -47.5F, 10.5F);
/*      */     
/*  827 */     this.gunModel[93].addShapeBox(50.0F, -23.0F, -6.5F, 193, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  828 */     this.gunModel[93].setRotationPoint(-77.0F, -47.5F, 1.5F);
/*      */     
/*  830 */     this.gunModel[94].addShapeBox(50.0F, -23.0F, -6.5F, 74, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  831 */     this.gunModel[94].setRotationPoint(116.0F, -31.0F, 3.0F);
/*      */     
/*  833 */     this.gunModel[95].addShapeBox(50.0F, -23.0F, -6.5F, 4, 7, 7, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  834 */     this.gunModel[95].setRotationPoint(118.0F, -31.0F, 3.0F);
/*      */     
/*  836 */     this.gunModel[96].addShapeBox(50.0F, -23.0F, -6.5F, 16, 7, 7, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F);
/*  837 */     this.gunModel[96].setRotationPoint(122.0F, -31.0F, 3.0F);
/*      */     
/*  839 */     this.gunModel[97].addShapeBox(50.0F, -23.0F, -6.5F, 2, 7, 7, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F);
/*  840 */     this.gunModel[97].setRotationPoint(138.0F, -31.0F, 3.0F);
/*      */     
/*  842 */     this.gunModel[98].addShapeBox(50.0F, -23.0F, -6.5F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/*  843 */     this.gunModel[98].setRotationPoint(120.0F, -31.0F, 3.0F);
/*      */     
/*  845 */     this.gunModel[99].addShapeBox(50.0F, -23.0F, -6.5F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F);
/*  846 */     this.gunModel[99].setRotationPoint(190.0F, -31.0F, 3.0F);
/*      */     
/*  848 */     this.gunModel[100].addShapeBox(50.0F, -23.0F, -6.5F, 3, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F);
/*  849 */     this.gunModel[100].setRotationPoint(192.0F, -31.0F, 3.0F);
/*      */     
/*  851 */     this.gunModel[101].addShapeBox(50.0F, -23.0F, -6.5F, 1, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F);
/*  852 */     this.gunModel[101].setRotationPoint(195.0F, -31.0F, 3.0F);
/*      */     
/*  854 */     this.gunModel[102].addShapeBox(50.0F, -23.0F, -6.5F, 9, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  855 */     this.gunModel[102].setRotationPoint(196.0F, -32.0F, 2.0F);
/*      */     
/*  857 */     this.gunModel[103].addShapeBox(50.0F, -23.0F, -6.5F, 17, 6, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  858 */     this.gunModel[103].setRotationPoint(205.0F, -29.0F, 2.0F);
/*      */     
/*  860 */     this.gunModel[104].addShapeBox(50.0F, -23.0F, -6.5F, 17, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  861 */     this.gunModel[104].setRotationPoint(205.0F, -32.0F, 2.0F);
/*      */     
/*  863 */     this.gunModel[105].addShapeBox(50.0F, -23.0F, -6.5F, 17, 6, 4, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  864 */     this.gunModel[105].setRotationPoint(205.0F, -29.0F, 7.0F);
/*      */     
/*  866 */     this.gunModel[106].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  867 */     this.gunModel[106].setRotationPoint(109.0F, -45.0F, 1.0F);
/*      */     
/*  869 */     this.gunModel[107].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  870 */     this.gunModel[107].setRotationPoint(109.0F, -43.0F, 1.0F);
/*      */     
/*  872 */     this.gunModel[108].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  873 */     this.gunModel[108].setRotationPoint(109.0F, -44.0F, 1.0F);
/*      */     
/*  875 */     this.gunModel[109].addShapeBox(50.0F, -23.0F, -6.5F, 1, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  876 */     this.gunModel[109].setRotationPoint(116.0F, -37.0F, -2.0F);
/*      */     
/*  878 */     this.gunModel[110].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  879 */     this.gunModel[110].setRotationPoint(116.0F, -39.0F, -1.0F);
/*      */     
/*  881 */     this.gunModel[111].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  882 */     this.gunModel[111].setRotationPoint(116.0F, -39.5F, 1.5F);
/*      */     
/*  884 */     this.gunModel[112].addShapeBox(50.0F, -23.0F, -6.5F, 1, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  885 */     this.gunModel[112].setRotationPoint(116.0F, -47.0F, 1.5F);
/*      */     
/*  887 */     this.gunModel[113].addShapeBox(50.0F, -23.0F, -6.5F, 1, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  888 */     this.gunModel[113].setRotationPoint(116.0F, -49.5F, 2.5F);
/*      */     
/*  890 */     this.gunModel[114].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  891 */     this.gunModel[114].setRotationPoint(116.0F, -50.0F, 1.0F);
/*      */     
/*  893 */     this.gunModel[115].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  894 */     this.gunModel[115].setRotationPoint(116.0F, -51.0F, 1.0F);
/*      */     
/*  896 */     this.gunModel[116].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  897 */     this.gunModel[116].setRotationPoint(116.0F, -47.5F, 10.5F);
/*      */     
/*  899 */     this.gunModel[117].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  900 */     this.gunModel[117].setRotationPoint(116.0F, -47.5F, 1.5F);
/*      */     
/*  902 */     this.gunModel[118].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  903 */     this.gunModel[118].setRotationPoint(114.5F, -45.25F, 14.5F);
/*      */     
/*  905 */     this.gunModel[119].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  906 */     this.gunModel[119].setRotationPoint(114.5F, -45.0F, 13.5F);
/*      */     
/*  908 */     this.gunModel[120].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  909 */     this.gunModel[120].setRotationPoint(114.5F, -42.0F, 12.0F);
/*      */     
/*  911 */     this.gunModel[121].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  912 */     this.gunModel[121].setRotationPoint(114.5F, -40.5F, 11.5F);
/*      */     
/*  914 */     this.gunModel[122].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  915 */     this.gunModel[122].setRotationPoint(114.5F, -45.25F, 12.75F);
/*      */     
/*  917 */     this.gunModel[123].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 4, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F);
/*  918 */     this.gunModel[123].setRotationPoint(114.5F, -46.5F, 10.0F);
/*      */     
/*  920 */     this.gunModel[124].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  921 */     this.gunModel[124].setRotationPoint(114.5F, -42.0F, 10.25F);
/*      */     
/*  923 */     this.gunModel[125].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  924 */     this.gunModel[125].setRotationPoint(114.5F, -45.25F, 11.5F);
/*      */     
/*  926 */     this.gunModel[126].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/*  927 */     this.gunModel[126].setRotationPoint(114.5F, -40.5F, -0.5F);
/*      */     
/*  929 */     this.gunModel[127].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  930 */     this.gunModel[127].setRotationPoint(114.5F, -42.0F, -2.0F);
/*      */     
/*  932 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  933 */     this.gunModel[''].setRotationPoint(114.5F, -45.0F, -2.5F);
/*      */     
/*  935 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  936 */     this.gunModel[''].setRotationPoint(114.5F, -45.25F, -0.75F);
/*      */     
/*  938 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/*  939 */     this.gunModel[''].setRotationPoint(114.5F, -45.25F, -2.5F);
/*      */     
/*  941 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 4, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/*  942 */     this.gunModel[''].setRotationPoint(114.5F, -46.5F, -1.0F);
/*      */     
/*  944 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  945 */     this.gunModel[''].setRotationPoint(114.5F, -42.0F, -0.25F);
/*      */     
/*  947 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  948 */     this.gunModel[''].setRotationPoint(114.5F, -45.25F, 0.5F);
/*      */     
/*  950 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  951 */     this.gunModel[''].setRotationPoint(-44.0F, -16.0F, -1.5F);
/*      */     
/*  953 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 6, 16, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  954 */     this.gunModel[''].setRotationPoint(-48.0F, -16.0F, -1.5F);
/*      */     
/*  956 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  957 */     this.gunModel[''].setRotationPoint(-46.0F, -16.0F, -1.5F);
/*      */     
/*  959 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 16, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  960 */     this.gunModel[''].setRotationPoint(-46.0F, -17.0F, -1.5F);
/*      */     
/*  962 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  963 */     this.gunModel[''].setRotationPoint(-46.0F, -10.0F, -1.5F);
/*      */     
/*  965 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  966 */     this.gunModel[''].setRotationPoint(-36.5F, -7.5F, -0.5F);
/*      */     
/*  968 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  969 */     this.gunModel[''].setRotationPoint(-36.5F, -5.5F, -0.5F);
/*      */     
/*  971 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  972 */     this.gunModel[''].setRotationPoint(-36.5F, -6.5F, -0.5F);
/*      */     
/*  974 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  975 */     this.gunModel[''].setRotationPoint(-26.0F, -14.5F, 1.5F);
/*      */     
/*  977 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  978 */     this.gunModel[''].setRotationPoint(-26.0F, -12.5F, 1.5F);
/*      */     
/*  980 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  981 */     this.gunModel[''].setRotationPoint(-26.0F, -13.5F, 1.5F);
/*      */     
/*  983 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  984 */     this.gunModel[''].setRotationPoint(-52.5F, -20.0F, -0.5F);
/*      */     
/*  986 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  987 */     this.gunModel[''].setRotationPoint(-52.5F, -18.0F, -0.5F);
/*      */     
/*  989 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  990 */     this.gunModel[''].setRotationPoint(-52.5F, -19.0F, -0.5F);
/*      */     
/*  992 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 16, 1, 9, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  993 */     this.gunModel[''].setRotationPoint(122.0F, -33.0F, 2.0F);
/*      */     
/*  995 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 16, 1, 6, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/*  996 */     this.gunModel[''].setRotationPoint(122.0F, -35.0F, 3.5F);
/*      */     
/*  998 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 16, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  999 */     this.gunModel[''].setRotationPoint(122.0F, -34.0F, 3.0F);
/*      */     
/* 1001 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1002 */     this.gunModel[''].setRotationPoint(128.0F, -32.0F, 2.0F);
/*      */     
/* 1004 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 7, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.2F);
/* 1005 */     this.gunModel[''].setRotationPoint(131.0F, -36.0F, 9.0F);
/*      */     
/* 1007 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1008 */     this.gunModel[''].setRotationPoint(128.0F, -36.0F, 9.0F);
/*      */     
/* 1010 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1011 */     this.gunModel[''].setRotationPoint(131.0F, -34.5F, 9.0F);
/*      */     
/* 1013 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1014 */     this.gunModel[''].setRotationPoint(128.0F, -36.0F, 10.0F);
/*      */     
/* 1016 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1017 */     this.gunModel[''].setRotationPoint(131.0F, -34.5F, 2.0F);
/*      */     
/* 1019 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1020 */     this.gunModel[''].setRotationPoint(128.0F, -36.0F, 2.0F);
/*      */     
/* 1022 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1023 */     this.gunModel[''].setRotationPoint(128.0F, -32.0F, 10.0F);
/*      */     
/* 1025 */     this.gunModel[''].addShapeBox(50.0F, -23.0F, -6.5F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/* 1026 */     this.gunModel[''].setRotationPoint(131.0F, -36.0F, 2.0F);
/*      */     
/* 1028 */     this.gunModel[' '].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/* 1029 */     this.gunModel[' '].setRotationPoint(128.0F, -36.0F, 3.0F);
/*      */     
/* 1031 */     this.gunModel['¡'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1032 */     this.gunModel['¡'].setRotationPoint(122.0F, -36.0F, 9.0F);
/*      */     
/* 1034 */     this.gunModel['¢'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/* 1035 */     this.gunModel['¢'].setRotationPoint(122.0F, -36.0F, 3.0F);
/*      */     
/* 1037 */     this.gunModel['£'].addShapeBox(50.0F, -23.0F, -6.5F, 21, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1038 */     this.gunModel['£'].setRotationPoint(118.0F, -42.0F, 3.0F);
/*      */     
/* 1040 */     this.gunModel['¤'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1041 */     this.gunModel['¤'].setRotationPoint(117.0F, -41.5F, 3.5F);
/*      */     
/* 1043 */     this.gunModel['¥'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1044 */     this.gunModel['¥'].setRotationPoint(139.0F, -37.0F, 3.0F);
/*      */     
/* 1046 */     this.gunModel['¦'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1047 */     this.gunModel['¦'].setRotationPoint(139.0F, -42.0F, 3.0F);
/*      */     
/* 1049 */     this.gunModel['§'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1050 */     this.gunModel['§'].setRotationPoint(140.0F, -42.0F, 3.0F);
/*      */     
/* 1052 */     this.gunModel['¨'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1053 */     this.gunModel['¨'].setRotationPoint(140.0F, -37.0F, 3.0F);
/*      */     
/* 1055 */     this.gunModel['©'].addShapeBox(50.0F, -23.0F, -6.5F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 3.0F, -0.4F, 0.0F, 3.0F, -0.4F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1056 */     this.gunModel['©'].setRotationPoint(132.0F, -43.0F, 3.0F);
/*      */     
/* 1058 */     this.gunModel['ª'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1059 */     this.gunModel['ª'].setRotationPoint(119.0F, -39.0F, 2.5F);
/*      */     
/* 1061 */     this.gunModel['«'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1062 */     this.gunModel['«'].setRotationPoint(136.0F, -39.0F, 2.5F);
/*      */     
/* 1064 */     this.gunModel['¬'].addShapeBox(50.0F, -23.0F, -6.5F, 11, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1065 */     this.gunModel['¬'].setRotationPoint(120.0F, -47.0F, 2.0F);
/*      */     
/* 1067 */     this.gunModel['­'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1068 */     this.gunModel['­'].setRotationPoint(120.5F, -44.5F, 10.0F);
/*      */     
/* 1070 */     this.gunModel['®'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1071 */     this.gunModel['®'].setRotationPoint(120.5F, -46.5F, 10.0F);
/*      */     
/* 1073 */     this.gunModel['¯'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1074 */     this.gunModel['¯'].setRotationPoint(120.5F, -42.5F, 10.0F);
/*      */     
/* 1076 */     this.gunModel['°'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1077 */     this.gunModel['°'].setRotationPoint(122.0F, -54.0F, 2.5F);
/*      */     
/* 1079 */     this.gunModel['±'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1080 */     this.gunModel['±'].setRotationPoint(128.0F, -53.0F, 2.5F);
/*      */     
/* 1082 */     this.gunModel['²'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1083 */     this.gunModel['²'].setRotationPoint(126.0F, -54.0F, 2.5F);
/*      */     
/* 1085 */     this.gunModel['³'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1086 */     this.gunModel['³'].setRotationPoint(124.5F, -52.5F, 1.5F);
/*      */     
/* 1088 */     this.gunModel['´'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1089 */     this.gunModel['´'].setRotationPoint(124.5F, -53.5F, 1.5F);
/*      */     
/* 1091 */     this.gunModel['µ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1092 */     this.gunModel['µ'].setRotationPoint(123.0F, -29.0F, 1.5F);
/*      */     
/* 1094 */     this.gunModel['¶'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1095 */     this.gunModel['¶'].setRotationPoint(135.0F, -29.0F, 1.5F);
/*      */     
/* 1097 */     this.gunModel['·'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1098 */     this.gunModel['·'].setRotationPoint(-47.0F, -2.0F, 0.0F);
/*      */     
/* 1100 */     this.gunModel['¸'].addShapeBox(50.0F, -23.0F, -6.5F, 11, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1101 */     this.gunModel['¸'].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/* 1103 */     this.gunModel['¹'].addShapeBox(50.0F, -23.0F, -6.5F, 11, 1, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1104 */     this.gunModel['¹'].setRotationPoint(-58.0F, -2.5F, 2.0F);
/*      */     
/* 1106 */     this.gunModel['º'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1107 */     this.gunModel['º'].setRotationPoint(-45.0F, -0.5F, 0.0F);
/*      */     
/* 1109 */     this.gunModel['»'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 13, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1110 */     this.gunModel['»'].setRotationPoint(-45.0F, 1.0F, 0.0F);
/*      */     
/* 1112 */     this.gunModel['¼'].addShapeBox(50.0F, -23.0F, -6.5F, 13, 15, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1113 */     this.gunModel['¼'].setRotationPoint(-58.0F, -0.5F, 0.0F);
/*      */     
/* 1115 */     this.gunModel['½'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 5, 13, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1116 */     this.gunModel['½'].setRotationPoint(-61.0F, -1.0F, 0.0F);
/*      */     
/* 1118 */     this.gunModel['¾'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 5, 9, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1119 */     this.gunModel['¾'].setRotationPoint(-62.0F, -1.0F, 2.0F);
/*      */     
/* 1121 */     this.gunModel['¿'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 35, 13, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 24.0F, 0.0F, -2.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -2.0F);
/* 1122 */     this.gunModel['¿'].setRotationPoint(-61.0F, 4.5F, 0.0F);
/*      */     
/* 1124 */     this.gunModel['À'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 35, 9, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 24.0F, 0.0F, -3.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -3.0F);
/* 1125 */     this.gunModel['À'].setRotationPoint(-62.0F, 4.5F, 2.0F);
/*      */     
/* 1127 */     this.gunModel['Á'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 10, 13, 0.0F, -7.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -7.0F, 0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1128 */     this.gunModel['Á'].setRotationPoint(-65.0F, 4.5F, 0.0F);
/*      */     
/* 1130 */     this.gunModel['Â'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 24, 13, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, -10.0F, 0.0F, -2.0F, -10.0F, 0.0F, -2.0F, 11.0F, 0.0F, 0.0F);
/* 1131 */     this.gunModel['Â'].setRotationPoint(-51.5F, 14.5F, 0.0F);
/*      */     
/* 1133 */     this.gunModel['Ã'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 24, 13, 0.0F, -2.4F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F);
/* 1134 */     this.gunModel['Ã'].setRotationPoint(-67.5F, 14.5F, 0.0F);
/*      */     
/* 1136 */     this.gunModel['Ä'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1137 */     this.gunModel['Ä'].setRotationPoint(-62.5F, 38.5F, 0.0F);
/*      */     
/* 1139 */     this.gunModel['Å'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F);
/* 1140 */     this.gunModel['Å'].setRotationPoint(-62.5F, 39.5F, 0.0F);
/*      */     
/* 1142 */     this.gunModel['Æ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1143 */     this.gunModel['Æ'].setRotationPoint(-60.5F, 41.5F, 0.0F);
/*      */     
/* 1145 */     this.gunModel['Ç'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/* 1146 */     this.gunModel['Ç'].setRotationPoint(-60.5F, 43.5F, 0.0F);
/*      */     
/* 1148 */     this.gunModel['È'].addShapeBox(50.0F, -23.0F, -6.5F, 21, 2, 13, 0.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -4.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.5F, 0.0F);
/* 1149 */     this.gunModel['È'].setRotationPoint(-81.5F, 43.5F, 0.0F);
/*      */     
/* 1151 */     this.gunModel['É'].addShapeBox(50.0F, -23.0F, -6.5F, 20, 2, 13, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 1152 */     this.gunModel['É'].setRotationPoint(-80.5F, 41.5F, 0.0F);
/*      */     
/* 1154 */     this.gunModel['Ê'].addShapeBox(50.0F, -23.0F, -6.5F, 20, 2, 13, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1155 */     this.gunModel['Ê'].setRotationPoint(-80.5F, 39.5F, 0.0F);
/*      */     
/* 1157 */     this.gunModel['Ë'].addShapeBox(50.0F, -23.0F, -6.5F, 18, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1158 */     this.gunModel['Ë'].setRotationPoint(-80.5F, 38.5F, 0.0F);
/*      */     
/* 1160 */     this.gunModel['Ì'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1161 */     this.gunModel['Ì'].setRotationPoint(-82.5F, 39.5F, 0.0F);
/*      */     
/* 1163 */     this.gunModel['Í'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 13, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, -2.0F);
/* 1164 */     this.gunModel['Í'].setRotationPoint(-85.0F, 39.5F, 0.0F);
/*      */     
/* 1166 */     this.gunModel['Î'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.5F, -3.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -3.0F);
/* 1167 */     this.gunModel['Î'].setRotationPoint(-86.0F, 39.5F, 2.0F);
/*      */     
/* 1169 */     this.gunModel['Ï'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 13, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1170 */     this.gunModel['Ï'].setRotationPoint(-81.5F, 38.5F, 0.0F);
/*      */     
/* 1172 */     this.gunModel['Ð'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1173 */     this.gunModel['Ð'].setRotationPoint(-52.5F, 21.0F, 2.0F);
/*      */     
/* 1175 */     this.gunModel['Ñ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1176 */     this.gunModel['Ñ'].setRotationPoint(-52.5F, 23.0F, 2.0F);
/*      */     
/* 1178 */     this.gunModel['Ò'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1179 */     this.gunModel['Ò'].setRotationPoint(-52.5F, 25.0F, 2.0F);
/*      */     
/* 1181 */     this.gunModel['Ó'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1182 */     this.gunModel['Ó'].setRotationPoint(-52.5F, 26.0F, 2.0F);
/*      */     
/* 1184 */     this.gunModel['Ô'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1185 */     this.gunModel['Ô'].setRotationPoint(-49.5F, 20.0F, 2.0F);
/*      */     
/* 1187 */     this.gunModel['Õ'].addShapeBox(50.0F, -23.0F, -6.5F, 11, 4, 14, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1188 */     this.gunModel['Õ'].setRotationPoint(-62.0F, 8.5F, -0.5F);
/*      */     
/* 1190 */     this.gunModel['Ö'].addShapeBox(50.0F, -23.0F, -6.5F, 11, 21, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F);
/* 1191 */     this.gunModel['Ö'].setRotationPoint(-62.0F, 12.5F, -0.5F);
/*      */     
/* 1193 */     this.gunModel['×'].addShapeBox(50.0F, -23.0F, -6.5F, 16, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F);
/* 1194 */     this.gunModel['×'].setRotationPoint(-76.0F, 33.5F, -0.5F);
/*      */     
/* 1196 */     this.gunModel['Ø'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 9, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F);
/* 1197 */     this.gunModel['Ø'].setRotationPoint(-61.0F, -2.5F, 2.0F);
/*      */     
/* 1199 */     this.gunModel['Ù'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 5, 0.0F, -0.25F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, -2.0F, -0.25F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F);
/* 1200 */     this.gunModel['Ù'].setRotationPoint(-62.0F, -2.5F, 4.0F);
/*      */     
/* 1202 */     this.gunModel['Ú'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 17, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/* 1203 */     this.gunModel['Ú'].setRotationPoint(-61.0F, -4.5F, -2.0F);
/*      */     
/* 1205 */     this.gunModel['Û'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 3, 9, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1206 */     this.gunModel['Û'].setRotationPoint(-62.0F, -4.5F, 2.0F);
/*      */     
/* 1208 */     this.gunModel['Ü'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 9, 0.0F, 1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1209 */     this.gunModel['Ü'].setRotationPoint(-63.0F, -6.5F, 2.0F);
/*      */     
/* 1211 */     this.gunModel['Ý'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 17, 0.0F, 1.0F, 0.0F, -4.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 1.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/* 1212 */     this.gunModel['Ý'].setRotationPoint(-62.0F, -6.5F, -2.0F);
/*      */     
/* 1214 */     this.gunModel['Þ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 9, 0.0F, 2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1215 */     this.gunModel['Þ'].setRotationPoint(-64.5F, -7.5F, 2.0F);
/*      */     
/* 1217 */     this.gunModel['ß'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 9, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F);
/* 1218 */     this.gunModel['ß'].setRotationPoint(-63.5F, -7.5F, 2.0F);
/*      */     
/* 1220 */     this.gunModel['à'].addShapeBox(50.0F, -23.0F, -6.5F, 11, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1221 */     this.gunModel['à'].setRotationPoint(-76.5F, -10.5F, 0.0F);
/*      */     
/* 1223 */     this.gunModel['á'].addShapeBox(50.0F, -23.0F, -6.5F, 10, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1224 */     this.gunModel['á'].setRotationPoint(-76.5F, -8.5F, 2.0F);
/*      */     
/* 1226 */     this.gunModel['â'].addShapeBox(50.0F, -23.0F, -6.5F, 19, 3, 13, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1227 */     this.gunModel['â'].setRotationPoint(-76.5F, -13.5F, 0.0F);
/*      */     
/* 1229 */     this.gunModel['ã'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1230 */     this.gunModel['ã'].setRotationPoint(-67.0F, -8.5F, 2.0F);
/*      */     
/* 1232 */     this.gunModel['ä'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1233 */     this.gunModel['ä'].setRotationPoint(-65.5F, -8.5F, 2.0F);
/*      */     
/* 1235 */     this.gunModel['å'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 9, 0.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1236 */     this.gunModel['å'].setRotationPoint(-65.5F, -10.5F, 2.0F);
/*      */     
/* 1238 */     this.gunModel['æ'].addShapeBox(50.0F, -23.0F, -6.5F, 5, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1239 */     this.gunModel['æ'].setRotationPoint(-63.5F, -10.5F, 0.0F);
/*      */     
/* 1241 */     this.gunModel['ç'].addShapeBox(50.0F, -23.0F, -6.5F, 5, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1242 */     this.gunModel['ç'].setRotationPoint(-63.5F, -7.5F, 0.0F);
/*      */     
/* 1244 */     this.gunModel['è'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1245 */     this.gunModel['è'].setRotationPoint(-61.5F, -6.5F, 0.0F);
/*      */     
/* 1247 */     this.gunModel['é'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 13, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1248 */     this.gunModel['é'].setRotationPoint(-61.5F, -4.5F, 0.0F);
/*      */     
/* 1250 */     this.gunModel['ê'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1251 */     this.gunModel['ê'].setRotationPoint(-65.5F, -10.5F, 0.0F);
/*      */     
/* 1253 */     this.gunModel['ë'].addShapeBox(50.0F, -23.0F, -6.5F, 49, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1254 */     this.gunModel['ë'].setRotationPoint(67.0F, -33.0F, 15.5F);
/*      */     
/* 1256 */     this.gunModel['ì'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1257 */     this.gunModel['ì'].setRotationPoint(66.0F, -33.0F, 15.5F);
/*      */     
/* 1259 */     this.gunModel['í'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1260 */     this.gunModel['í'].setRotationPoint(116.0F, -33.0F, 15.5F);
/*      */     
/* 1262 */     this.gunModel['î'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1263 */     this.gunModel['î'].setRotationPoint(110.0F, -29.5F, 16.0F);
/*      */     
/* 1265 */     this.gunModel['ï'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1266 */     this.gunModel['ï'].setRotationPoint(110.0F, -27.5F, 16.0F);
/*      */     
/* 1268 */     this.gunModel['ð'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1269 */     this.gunModel['ð'].setRotationPoint(110.0F, -28.5F, 16.0F);
/*      */     
/* 1271 */     this.gunModel['ñ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1272 */     this.gunModel['ñ'].setRotationPoint(69.0F, -29.5F, 16.0F);
/*      */     
/* 1274 */     this.gunModel['ò'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1275 */     this.gunModel['ò'].setRotationPoint(69.0F, -27.5F, 16.0F);
/*      */     
/* 1277 */     this.gunModel['ó'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1278 */     this.gunModel['ó'].setRotationPoint(69.0F, -28.5F, 16.0F);
/*      */     
/* 1280 */     this.gunModel['ô'].addShapeBox(50.0F, -23.0F, -6.5F, 43, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1281 */     this.gunModel['ô'].setRotationPoint(69.5F, -31.0F, 14.5F);
/*      */     
/* 1283 */     this.gunModel['õ'].addShapeBox(50.0F, -23.0F, -6.5F, 43, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1284 */     this.gunModel['õ'].setRotationPoint(69.5F, -31.0F, -2.5F);
/*      */     
/* 1286 */     this.gunModel['ö'].addShapeBox(50.0F, -23.0F, -6.5F, 49, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1287 */     this.gunModel['ö'].setRotationPoint(67.0F, -33.0F, -4.5F);
/*      */     
/* 1289 */     this.gunModel['÷'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1290 */     this.gunModel['÷'].setRotationPoint(66.0F, -33.0F, -4.5F);
/*      */     
/* 1292 */     this.gunModel['ø'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1293 */     this.gunModel['ø'].setRotationPoint(116.0F, -33.0F, -4.5F);
/*      */     
/* 1295 */     this.gunModel['ù'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1296 */     this.gunModel['ù'].setRotationPoint(110.0F, -29.5F, -5.0F);
/*      */     
/* 1298 */     this.gunModel['ú'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1299 */     this.gunModel['ú'].setRotationPoint(110.0F, -27.5F, -5.0F);
/*      */     
/* 1301 */     this.gunModel['û'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1302 */     this.gunModel['û'].setRotationPoint(110.0F, -28.5F, -5.0F);
/*      */     
/* 1304 */     this.gunModel['ü'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1305 */     this.gunModel['ü'].setRotationPoint(69.0F, -29.5F, -5.0F);
/*      */     
/* 1307 */     this.gunModel['ý'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1308 */     this.gunModel['ý'].setRotationPoint(69.0F, -27.5F, -5.0F);
/*      */     
/* 1310 */     this.gunModel['þ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1311 */     this.gunModel['þ'].setRotationPoint(69.0F, -28.5F, -5.0F);
/*      */     
/* 1313 */     this.gunModel['ÿ'].addShapeBox(50.0F, -23.0F, -6.5F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1314 */     this.gunModel['ÿ'].setRotationPoint(25.0F, -31.5F, 14.5F);
/*      */     
/* 1316 */     this.gunModel['Ā'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1317 */     this.gunModel['Ā'].setRotationPoint(22.0F, -31.5F, 14.5F);
/*      */     
/* 1319 */     this.gunModel['ā'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1320 */     this.gunModel['ā'].setRotationPoint(21.0F, -29.5F, 14.5F);
/*      */     
/* 1322 */     this.gunModel['Ă'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1323 */     this.gunModel['Ă'].setRotationPoint(37.0F, -30.5F, 14.5F);
/*      */     
/* 1325 */     this.gunModel['ă'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1326 */     this.gunModel['ă'].setRotationPoint(39.0F, -29.5F, 14.5F);
/*      */     
/* 1328 */     this.gunModel['Ą'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1329 */     this.gunModel['Ą'].setRotationPoint(40.0F, -29.5F, 14.5F);
/*      */     
/* 1331 */     this.gunModel['ą'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 1332 */     this.gunModel['ą'].setRotationPoint(40.0F, -28.5F, 14.5F);
/*      */     
/* 1334 */     this.gunModel['Ć'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F);
/* 1335 */     this.gunModel['Ć'].setRotationPoint(39.0F, -27.5F, 14.5F);
/*      */     
/* 1337 */     this.gunModel['ć'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1338 */     this.gunModel['ć'].setRotationPoint(37.0F, -32.5F, -3.5F);
/*      */     
/* 1340 */     this.gunModel['Ĉ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1341 */     this.gunModel['Ĉ'].setRotationPoint(40.0F, -30.5F, 14.5F);
/*      */     
/* 1343 */     this.gunModel['ĉ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1344 */     this.gunModel['ĉ'].setRotationPoint(39.0F, -31.5F, 14.5F);
/*      */     
/* 1346 */     this.gunModel['Ċ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1347 */     this.gunModel['Ċ'].setRotationPoint(37.0F, -26.5F, 14.5F);
/*      */     
/* 1349 */     this.gunModel['ċ'].addShapeBox(50.0F, -23.0F, -6.5F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1350 */     this.gunModel['ċ'].setRotationPoint(25.0F, -32.5F, 14.5F);
/*      */     
/* 1352 */     this.gunModel['Č'].addShapeBox(50.0F, -23.0F, -6.5F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1353 */     this.gunModel['Č'].setRotationPoint(25.0F, -26.5F, 14.5F);
/*      */     
/* 1355 */     this.gunModel['č'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1356 */     this.gunModel['č'].setRotationPoint(22.0F, -32.5F, 14.5F);
/*      */     
/* 1358 */     this.gunModel['Ď'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/* 1359 */     this.gunModel['Ď'].setRotationPoint(22.0F, -26.5F, 14.5F);
/*      */     
/* 1361 */     this.gunModel['ď'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1362 */     this.gunModel['ď'].setRotationPoint(21.0F, -31.5F, 14.5F);
/*      */     
/* 1364 */     this.gunModel['Đ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1365 */     this.gunModel['Đ'].setRotationPoint(21.0F, -28.5F, 14.5F);
/*      */     
/* 1367 */     this.gunModel['đ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1368 */     this.gunModel['đ'].setRotationPoint(30.0F, -30.5F, 15.0F);
/*      */     
/* 1370 */     this.gunModel['Ē'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1371 */     this.gunModel['Ē'].setRotationPoint(30.0F, -28.5F, 15.0F);
/*      */     
/* 1373 */     this.gunModel['ē'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1374 */     this.gunModel['ē'].setRotationPoint(30.0F, -29.5F, 15.0F);
/*      */     
/* 1376 */     this.gunModel['Ĕ'].addShapeBox(50.0F, -23.0F, -6.5F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1377 */     this.gunModel['Ĕ'].setRotationPoint(25.0F, -31.5F, -3.5F);
/*      */     
/* 1379 */     this.gunModel['ĕ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 5, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1380 */     this.gunModel['ĕ'].setRotationPoint(22.0F, -31.5F, -3.5F);
/*      */     
/* 1382 */     this.gunModel['Ė'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1383 */     this.gunModel['Ė'].setRotationPoint(21.0F, -29.5F, -2.5F);
/*      */     
/* 1385 */     this.gunModel['ė'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1386 */     this.gunModel['ė'].setRotationPoint(21.0F, -31.5F, -2.5F);
/*      */     
/* 1388 */     this.gunModel['Ę'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1389 */     this.gunModel['Ę'].setRotationPoint(21.0F, -28.5F, -2.5F);
/*      */     
/* 1391 */     this.gunModel['ę'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1392 */     this.gunModel['ę'].setRotationPoint(22.0F, -32.5F, -3.5F);
/*      */     
/* 1394 */     this.gunModel['Ě'].addShapeBox(50.0F, -23.0F, -6.5F, 12, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1395 */     this.gunModel['Ě'].setRotationPoint(25.0F, -32.5F, -3.5F);
/*      */     
/* 1397 */     this.gunModel['ě'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1398 */     this.gunModel['ě'].setRotationPoint(37.0F, -30.5F, -3.5F);
/*      */     
/* 1400 */     this.gunModel['Ĝ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1401 */     this.gunModel['Ĝ'].setRotationPoint(39.0F, -29.5F, -3.5F);
/*      */     
/* 1403 */     this.gunModel['ĝ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1404 */     this.gunModel['ĝ'].setRotationPoint(37.0F, -32.5F, 14.5F);
/*      */     
/* 1406 */     this.gunModel['Ğ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1407 */     this.gunModel['Ğ'].setRotationPoint(39.0F, -31.5F, -3.5F);
/*      */     
/* 1409 */     this.gunModel['ğ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1410 */     this.gunModel['ğ'].setRotationPoint(40.0F, -30.5F, -3.5F);
/*      */     
/* 1412 */     this.gunModel['Ġ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1413 */     this.gunModel['Ġ'].setRotationPoint(40.0F, -29.5F, -3.5F);
/*      */     
/* 1415 */     this.gunModel['ġ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1416 */     this.gunModel['ġ'].setRotationPoint(40.0F, -28.5F, -3.5F);
/*      */     
/* 1418 */     this.gunModel['Ģ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1419 */     this.gunModel['Ģ'].setRotationPoint(39.0F, -27.5F, -3.5F);
/*      */     
/* 1421 */     this.gunModel['ģ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1422 */     this.gunModel['ģ'].setRotationPoint(37.0F, -26.5F, -3.5F);
/*      */     
/* 1424 */     this.gunModel['Ĥ'].addShapeBox(50.0F, -23.0F, -6.5F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1425 */     this.gunModel['Ĥ'].setRotationPoint(25.0F, -26.5F, -3.5F);
/*      */     
/* 1427 */     this.gunModel['ĥ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1428 */     this.gunModel['ĥ'].setRotationPoint(22.0F, -26.5F, -3.5F);
/*      */     
/* 1430 */     this.gunModel['Ħ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1431 */     this.gunModel['Ħ'].setRotationPoint(30.0F, -30.5F, -4.0F);
/*      */     
/* 1433 */     this.gunModel['ħ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1434 */     this.gunModel['ħ'].setRotationPoint(30.0F, -28.5F, -4.0F);
/*      */     
/* 1436 */     this.gunModel['Ĩ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1437 */     this.gunModel['Ĩ'].setRotationPoint(30.0F, -29.5F, -4.0F);
/*      */     
/* 1439 */     this.gunModel['ĩ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 10, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1440 */     this.gunModel['ĩ'].setRotationPoint(-76.5F, -23.0F, -2.5F);
/*      */     
/* 1442 */     this.gunModel['Ī'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 13, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1443 */     this.gunModel['Ī'].setRotationPoint(-76.5F, -14.0F, 0.0F);
/*      */     
/* 1445 */     this.gunModel['ī'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 35, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1446 */     this.gunModel['ī'].setRotationPoint(-78.5F, -47.0F, -2.5F);
/*      */     
/* 1448 */     this.gunModel['Ĭ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 5, 15, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1449 */     this.gunModel['Ĭ'].setRotationPoint(-78.5F, -12.5F, -1.0F);
/*      */     
/* 1451 */     this.gunModel['ĭ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1452 */     this.gunModel['ĭ'].setRotationPoint(-78.5F, -48.5F, 0.5F);
/*      */     
/* 1454 */     this.gunModel['Į'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1455 */     this.gunModel['Į'].setRotationPoint(-78.5F, -48.0F, 12.5F);
/*      */     
/* 1457 */     this.gunModel['į'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1458 */     this.gunModel['į'].setRotationPoint(-78.5F, -48.0F, -0.5F);
/*      */     
/* 1460 */     this.gunModel['İ'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 1, 12, 0.0F, 0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1461 */     this.gunModel['İ'].setRotationPoint(-84.5F, -49.5F, 0.5F);
/*      */     
/* 1463 */     this.gunModel['ı'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F);
/* 1464 */     this.gunModel['ı'].setRotationPoint(-83.5F, -51.5F, 0.5F);
/*      */     
/* 1466 */     this.gunModel['Ĳ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 1467 */     this.gunModel['Ĳ'].setRotationPoint(-83.5F, -50.5F, -0.5F);
/*      */     
/* 1469 */     this.gunModel['ĳ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1470 */     this.gunModel['ĳ'].setRotationPoint(-78.5F, -46.0F, 15.5F);
/*      */     
/* 1472 */     this.gunModel['Ĵ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1473 */     this.gunModel['Ĵ'].setRotationPoint(-78.5F, -45.0F, 16.5F);
/*      */     
/* 1475 */     this.gunModel['ĵ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1476 */     this.gunModel['ĵ'].setRotationPoint(-78.5F, -40.0F, 15.5F);
/*      */     
/* 1478 */     this.gunModel['Ķ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1479 */     this.gunModel['Ķ'].setRotationPoint(-78.5F, -32.0F, 15.5F);
/*      */     
/* 1481 */     this.gunModel['ķ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1482 */     this.gunModel['ķ'].setRotationPoint(-78.5F, -31.0F, 16.5F);
/*      */     
/* 1484 */     this.gunModel['ĸ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1485 */     this.gunModel['ĸ'].setRotationPoint(-78.5F, -26.0F, 15.5F);
/*      */     
/* 1487 */     this.gunModel['Ĺ'].addShapeBox(50.0F, -23.0F, -6.5F, 10, 5, 15, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1488 */     this.gunModel['Ĺ'].setRotationPoint(-88.5F, -12.5F, -1.0F);
/*      */     
/* 1490 */     this.gunModel['ĺ'].addShapeBox(50.0F, -23.0F, -6.5F, 9, 18, 18, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1491 */     this.gunModel['ĺ'].setRotationPoint(-87.5F, -30.0F, -2.5F);
/*      */     
/* 1493 */     this.gunModel['Ļ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 17, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1494 */     this.gunModel['Ļ'].setRotationPoint(-81.5F, -47.0F, -2.5F);
/*      */     
/* 1496 */     this.gunModel['ļ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 15, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1497 */     this.gunModel['ļ'].setRotationPoint(-83.5F, -47.0F, -2.5F);
/*      */     
/* 1499 */     this.gunModel['Ľ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1500 */     this.gunModel['Ľ'].setRotationPoint(-87.5F, -32.0F, -2.5F);
/*      */     
/* 1502 */     this.gunModel['ľ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1503 */     this.gunModel['ľ'].setRotationPoint(-83.5F, -32.0F, -2.5F);
/*      */     
/* 1505 */     this.gunModel['Ŀ'].addShapeBox(50.0F, -23.0F, -6.5F, 52, 12, 14, 0.0F, 3.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1506 */     this.gunModel['Ŀ'].setRotationPoint(-139.5F, -25.0F, -0.5F);
/*      */     
/* 1508 */     this.gunModel['ŀ'].addShapeBox(50.0F, -23.0F, -6.5F, 52, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1509 */     this.gunModel['ŀ'].setRotationPoint(-139.5F, -13.0F, -0.5F);
/*      */     
/* 1511 */     this.gunModel['Ł'].addShapeBox(50.0F, -23.0F, -6.5F, 52, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1512 */     this.gunModel['Ł'].setRotationPoint(-139.5F, -10.0F, 0.5F);
/*      */     
/* 1514 */     this.gunModel['ł'].addShapeBox(50.0F, -23.0F, -6.5F, 28, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1515 */     this.gunModel['ł'].setRotationPoint(-167.5F, -13.0F, 0.5F);
/*      */     
/* 1517 */     this.gunModel['Ń'].addShapeBox(50.0F, -23.0F, -6.5F, 28, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1518 */     this.gunModel['Ń'].setRotationPoint(-167.5F, -10.0F, 1.5F);
/*      */     
/* 1520 */     this.gunModel['ń'].addShapeBox(50.0F, -23.0F, -6.5F, 38, 11, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1521 */     this.gunModel['ń'].setRotationPoint(-177.5F, -24.0F, 0.5F);
/*      */     
/* 1523 */     this.gunModel['Ņ'].addShapeBox(50.0F, -23.0F, -6.5F, 38, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1524 */     this.gunModel['Ņ'].setRotationPoint(-177.5F, -32.0F, 0.5F);
/*      */     
/* 1526 */     this.gunModel['ņ'].addShapeBox(50.0F, -23.0F, -6.5F, 24, 11, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1527 */     this.gunModel['ņ'].setRotationPoint(-198.5F, -24.0F, 0.0F);
/*      */     
/* 1529 */     this.gunModel['Ň'].addShapeBox(50.0F, -23.0F, -6.5F, 22, 7, 13, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1530 */     this.gunModel['Ň'].setRotationPoint(-199.5F, -31.0F, 0.0F);
/*      */     
/* 1532 */     this.gunModel['ň'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 13, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1533 */     this.gunModel['ň'].setRotationPoint(-180.5F, -34.0F, 0.0F);
/*      */     
/* 1535 */     this.gunModel['ŉ'].addShapeBox(50.0F, -23.0F, -6.5F, 18, 2, 11, 0.0F, 0.0F, 0.5F, -3.0F, 2.25F, 0.5F, -3.0F, 2.25F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1536 */     this.gunModel['ŉ'].setRotationPoint(-197.0F, -36.0F, 1.0F);
/*      */     
/* 1538 */     this.gunModel['Ŋ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 13, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1539 */     this.gunModel['Ŋ'].setRotationPoint(-199.0F, -34.0F, 0.0F);
/*      */     
/* 1541 */     this.gunModel['ŋ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1542 */     this.gunModel['ŋ'].setRotationPoint(-181.5F, -33.0F, 0.0F);
/*      */     
/* 1544 */     this.gunModel['Ō'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1545 */     this.gunModel['Ō'].setRotationPoint(-196.0F, -34.0F, 0.0F);
/*      */     
/* 1547 */     this.gunModel['ō'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 1548 */     this.gunModel['ō'].setRotationPoint(-181.5F, -34.0F, 0.0F);
/*      */     
/* 1550 */     this.gunModel['Ŏ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 13, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1551 */     this.gunModel['Ŏ'].setRotationPoint(-196.0F, -33.0F, 0.0F);
/*      */     
/* 1553 */     this.gunModel['ŏ'].addShapeBox(50.0F, -23.0F, -6.5F, 38, 2, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1554 */     this.gunModel['ŏ'].setRotationPoint(-177.5F, -34.0F, 0.5F);
/*      */     
/* 1556 */     this.gunModel['Ő'].addShapeBox(50.0F, -23.0F, -6.5F, 38, 2, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1557 */     this.gunModel['Ő'].setRotationPoint(-177.5F, -36.0F, 1.5F);
/*      */     
/* 1559 */     this.gunModel['ő'].addShapeBox(50.0F, -23.0F, -6.5F, 24, 4, 13, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1560 */     this.gunModel['ő'].setRotationPoint(-198.5F, -13.0F, 0.0F);
/*      */     
/* 1562 */     this.gunModel['Œ'].addShapeBox(50.0F, -23.0F, -6.5F, 23, 30, 13, 0.0F, 0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1563 */     this.gunModel['Œ'].setRotationPoint(-200.5F, -9.0F, 0.0F);
/*      */     
/* 1565 */     this.gunModel['œ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 28, 11, 0.0F, 0.15F, 0.0F, 1.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 1.0F, 16.0F, 0.0F, 1.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 16.0F, 0.0F, 1.0F);
/* 1566 */     this.gunModel['œ'].setRotationPoint(-174.5F, -7.0F, 1.0F);
/*      */     
/* 1568 */     this.gunModel['Ŕ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 28, 11, 0.0F, 0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -3.0F, -0.15F, 0.0F, -3.0F, 0.15F, 0.0F, 0.0F, 16.0F, 0.0F, 0.0F, -16.0F, 0.0F, -3.0F, -16.0F, 0.0F, -3.0F, 16.0F, 0.0F, 0.0F);
/* 1569 */     this.gunModel['Ŕ'].setRotationPoint(-171.5F, -7.0F, 1.0F);
/*      */     
/* 1571 */     this.gunModel['ŕ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 11, 0.0F, -2.15F, 0.0F, 0.0F, 2.15F, 0.0F, -3.5F, 2.15F, 0.0F, -3.5F, -2.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1572 */     this.gunModel['ŕ'].setRotationPoint(-171.65F, -9.0F, 1.0F);
/*      */     
/* 1574 */     this.gunModel['Ŗ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 10, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F);
/* 1575 */     this.gunModel['Ŗ'].setRotationPoint(-169.5F, -10.0F, 1.5F);
/*      */     
/* 1577 */     this.gunModel['ŗ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 12, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F);
/* 1578 */     this.gunModel['ŗ'].setRotationPoint(-170.5F, -13.0F, 0.5F);
/*      */     
/* 1580 */     this.gunModel['Ř'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 11, 0.0F, -2.15F, 0.0F, 1.0F, 2.15F, 0.0F, 0.0F, 2.15F, 0.0F, 0.0F, -2.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 1581 */     this.gunModel['Ř'].setRotationPoint(-174.65F, -9.0F, 1.0F);
/*      */     
/* 1583 */     this.gunModel['ř'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 11, 0.0F, -2.15F, -0.5F, 1.0F, 2.15F, -0.5F, -0.5F, 2.15F, -0.5F, -0.5F, -2.15F, -0.5F, 1.0F, -0.15F, 0.0F, 1.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 1.0F);
/* 1584 */     this.gunModel['ř'].setRotationPoint(-172.65F, -11.0F, 1.0F);
/*      */     
/* 1586 */     this.gunModel['Ś'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 11, 0.0F, -2.9F, -0.5F, 1.0F, 2.15F, -0.5F, 1.0F, 2.15F, -0.5F, 1.0F, -2.9F, -0.5F, 1.0F, -2.15F, 0.0F, 1.0F, 0.15F, 0.0F, 1.0F, 0.15F, 0.0F, 1.0F, -2.15F, 0.0F, 1.0F);
/* 1587 */     this.gunModel['Ś'].setRotationPoint(-175.65F, -11.0F, 1.0F);
/*      */     
/* 1589 */     this.gunModel['ś'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 11, 0.0F, -2.15F, 0.0F, 1.0F, 2.15F, 0.0F, 1.0F, 2.15F, 0.0F, 1.0F, -2.15F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/* 1590 */     this.gunModel['ś'].setRotationPoint(-175.65F, -9.0F, 1.0F);
/*      */     
/* 1592 */     this.gunModel['Ŝ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 13, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1593 */     this.gunModel['Ŝ'].setRotationPoint(-170.5F, -13.5F, 0.0F);
/*      */     
/* 1595 */     this.gunModel['ŝ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 8, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1596 */     this.gunModel['ŝ'].setRotationPoint(-87.5F, -40.0F, -2.5F);
/*      */     
/* 1598 */     this.gunModel['Ş'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -3.0F, -4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 0.0F);
/* 1599 */     this.gunModel['Ş'].setRotationPoint(-187.5F, 21.0F, 1.0F);
/*      */     
/* 1601 */     this.gunModel['ş'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1602 */     this.gunModel['ş'].setRotationPoint(-191.5F, 27.0F, 1.0F);
/*      */     
/* 1604 */     this.gunModel['Š'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F);
/* 1605 */     this.gunModel['Š'].setRotationPoint(-194.5F, 27.0F, 1.0F);
/*      */     
/* 1607 */     this.gunModel['š'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 6, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 1.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F);
/* 1608 */     this.gunModel['š'].setRotationPoint(-190.5F, 21.0F, 1.0F);
/*      */     
/* 1610 */     this.gunModel['Ţ'].addShapeBox(50.0F, -23.0F, -6.5F, 9, 6, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1611 */     this.gunModel['Ţ'].setRotationPoint(-199.5F, 21.0F, 0.0F);
/*      */     
/* 1613 */     this.gunModel['ţ'].addShapeBox(50.0F, -23.0F, -6.5F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1614 */     this.gunModel['ţ'].setRotationPoint(-199.5F, 27.0F, 1.0F);
/*      */     
/* 1616 */     this.gunModel['Ť'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 6, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1617 */     this.gunModel['Ť'].setRotationPoint(-207.5F, 21.0F, -1.0F);
/*      */     
/* 1619 */     this.gunModel['ť'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 21, 15, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1620 */     this.gunModel['ť'].setRotationPoint(-207.5F, 0.0F, -1.0F);
/*      */     
/* 1622 */     this.gunModel['Ŧ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 13, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1623 */     this.gunModel['Ŧ'].setRotationPoint(-204.5F, -13.0F, -1.0F);
/*      */     
/* 1625 */     this.gunModel['ŧ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 13, 15, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1626 */     this.gunModel['ŧ'].setRotationPoint(-204.5F, -26.0F, -1.0F);
/*      */     
/* 1628 */     this.gunModel['Ũ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 7, 15, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1629 */     this.gunModel['Ũ'].setRotationPoint(-205.5F, -33.0F, -1.0F);
/*      */     
/* 1631 */     this.gunModel['ũ'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 3, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1632 */     this.gunModel['ũ'].setRotationPoint(-206.5F, -36.0F, -1.0F);
/*      */     
/* 1634 */     this.gunModel['Ū'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 3, 11, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1635 */     this.gunModel['Ū'].setRotationPoint(-206.5F, -39.0F, 1.0F);
/*      */     
/* 1637 */     this.gunModel['ū'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1638 */     this.gunModel['ū'].setRotationPoint(-198.5F, -36.0F, -1.0F);
/*      */     
/* 1640 */     this.gunModel['Ŭ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1641 */     this.gunModel['Ŭ'].setRotationPoint(-198.5F, -33.0F, -1.0F);
/*      */     
/* 1643 */     this.gunModel['ŭ'].addShapeBox(50.0F, -23.0F, -6.5F, 10, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1644 */     this.gunModel['ŭ'].setRotationPoint(-208.0F, 27.0F, -1.0F);
/*      */     
/* 1646 */     this.gunModel['Ů'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 15, 0.0F, 0.5F, 0.0F, 0.0F, -4.5F, 2.0F, 0.0F, -4.5F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1647 */     this.gunModel['Ů'].setRotationPoint(-199.0F, 25.0F, -1.0F);
/*      */     
/* 1649 */     this.gunModel['ů'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/* 1650 */     this.gunModel['ů'].setRotationPoint(-197.5F, -12.0F, 13.0F);
/*      */     
/* 1652 */     this.gunModel['Ű'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F);
/* 1653 */     this.gunModel['Ű'].setRotationPoint(-197.5F, -16.0F, 13.0F);
/*      */     
/* 1655 */     this.gunModel['ű'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 5, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1656 */     this.gunModel['ű'].setRotationPoint(-197.5F, -20.0F, 13.0F);
/*      */     
/* 1658 */     this.gunModel['Ų'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1659 */     this.gunModel['Ų'].setRotationPoint(-196.5F, -22.0F, 13.0F);
/*      */     
/* 1661 */     this.gunModel['ų'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 3, 0.0F, 0.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F);
/* 1662 */     this.gunModel['ų'].setRotationPoint(-184.5F, -16.0F, 13.0F);
/*      */     
/* 1664 */     this.gunModel['Ŵ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F);
/* 1665 */     this.gunModel['Ŵ'].setRotationPoint(-184.5F, -12.0F, 13.0F);
/*      */     
/* 1667 */     this.gunModel['ŵ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 5, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1668 */     this.gunModel['ŵ'].setRotationPoint(-185.25F, -20.0F, 13.0F);
/*      */     
/* 1670 */     this.gunModel['Ŷ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1671 */     this.gunModel['Ŷ'].setRotationPoint(-184.25F, -22.0F, 13.0F);
/*      */     
/* 1673 */     this.gunModel['ŷ'].addShapeBox(50.0F, -23.0F, -6.5F, 11, 5, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1674 */     this.gunModel['ŷ'].setRotationPoint(-195.5F, -20.0F, 12.5F);
/*      */     
/* 1676 */     this.gunModel['Ÿ'].addShapeBox(50.0F, -23.0F, -6.5F, 10, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1677 */     this.gunModel['Ÿ'].setRotationPoint(-194.5F, -22.0F, 12.5F);
/*      */     
/* 1679 */     this.gunModel['Ź'].addShapeBox(50.0F, -23.0F, -6.5F, 12, 4, 3, 0.0F, 0.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.5F, -0.25F, 0.5F, -2.5F);
/* 1680 */     this.gunModel['Ź'].setRotationPoint(-195.5F, -16.0F, 12.5F);
/*      */     
/* 1682 */     this.gunModel['ź'].addShapeBox(50.0F, -23.0F, -6.5F, 52, 9, 5, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1683 */     this.gunModel['ź'].setRotationPoint(-146.5F, -34.0F, -2.5F);
/*      */     
/* 1685 */     this.gunModel['Ż'].addShapeBox(50.0F, -23.0F, -6.5F, 57, 3, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1686 */     this.gunModel['Ż'].setRotationPoint(-149.5F, -37.0F, -2.5F);
/*      */     
/* 1688 */     this.gunModel['ż'].addShapeBox(50.0F, -23.0F, -6.5F, 57, 2, 5, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1689 */     this.gunModel['ż'].setRotationPoint(-149.5F, -39.0F, -2.5F);
/*      */     
/* 1691 */     this.gunModel['Ž'].addShapeBox(50.0F, -23.0F, -6.5F, 56, 3, 10, 0.0F, -13.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1692 */     this.gunModel['Ž'].setRotationPoint(-148.5F, -42.0F, -2.0F);
/*      */     
/* 1694 */     this.gunModel['ž'].addShapeBox(50.0F, -23.0F, -6.5F, 51, 3, 12, 0.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/* 1695 */     this.gunModel['ž'].setRotationPoint(-135.5F, -45.0F, 0.5F);
/*      */     
/* 1697 */     this.gunModel['ſ'].addShapeBox(50.0F, -23.0F, -6.5F, 17, 1, 12, 0.0F, -17.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, -17.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1698 */     this.gunModel['ſ'].setRotationPoint(-111.5F, -46.0F, 0.5F);
/*      */     
/* 1700 */     this.gunModel['ƀ'].addShapeBox(50.0F, -23.0F, -6.5F, 53, 9, 5, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1701 */     this.gunModel['ƀ'].setRotationPoint(-146.5F, -34.0F, 10.5F);
/*      */     
/* 1703 */     this.gunModel['Ɓ'].addShapeBox(50.0F, -23.0F, -6.5F, 55, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1704 */     this.gunModel['Ɓ'].setRotationPoint(-149.5F, -37.0F, 10.5F);
/*      */     
/* 1706 */     this.gunModel['Ƃ'].addShapeBox(50.0F, -23.0F, -6.5F, 55, 2, 5, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1707 */     this.gunModel['Ƃ'].setRotationPoint(-149.5F, -39.0F, 10.5F);
/*      */     
/* 1709 */     this.gunModel['ƃ'].addShapeBox(50.0F, -23.0F, -6.5F, 54, 3, 7, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -13.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1710 */     this.gunModel['ƃ'].setRotationPoint(-148.5F, -42.0F, 8.0F);
/*      */     
/* 1712 */     this.gunModel['Ƅ'].addShapeBox(50.0F, -23.0F, -6.5F, 55, 2, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1713 */     this.gunModel['Ƅ'].setRotationPoint(-149.5F, -39.0F, 2.5F);
/*      */     
/* 1715 */     this.gunModel['ƅ'].addShapeBox(50.0F, -23.0F, -6.5F, 55, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1716 */     this.gunModel['ƅ'].setRotationPoint(-149.5F, -37.0F, 2.5F);
/*      */     
/* 1718 */     this.gunModel['Ɔ'].addShapeBox(50.0F, -23.0F, -6.5F, 55, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1719 */     this.gunModel['Ɔ'].setRotationPoint(-149.5F, -37.0F, 9.5F);
/*      */     
/* 1721 */     this.gunModel['Ƈ'].addShapeBox(50.0F, -23.0F, -6.5F, 55, 2, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1722 */     this.gunModel['Ƈ'].setRotationPoint(-149.5F, -39.0F, 6.5F);
/*      */     
/* 1724 */     this.gunModel['ƈ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1725 */     this.gunModel['ƈ'].setRotationPoint(-146.5F, -39.0F, 2.5F);
/*      */     
/* 1727 */     this.gunModel['Ɖ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 9, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1728 */     this.gunModel['Ɖ'].setRotationPoint(-94.5F, -34.0F, -2.5F);
/*      */     
/* 1730 */     this.gunModel['Ɗ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1731 */     this.gunModel['Ɗ'].setRotationPoint(-92.5F, -34.0F, -2.5F);
/*      */     
/* 1733 */     this.gunModel['Ƌ'].addShapeBox(50.0F, -23.0F, -6.5F, 5, 3, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1734 */     this.gunModel['Ƌ'].setRotationPoint(-92.5F, -37.0F, -2.5F);
/*      */     
/* 1736 */     this.gunModel['ƌ'].addShapeBox(50.0F, -23.0F, -6.5F, 5, 2, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1737 */     this.gunModel['ƌ'].setRotationPoint(-92.5F, -39.0F, -2.5F);
/*      */     
/* 1739 */     this.gunModel['ƍ'].addShapeBox(50.0F, -23.0F, -6.5F, 5, 1, 5, 0.0F, 0.0F, 0.0F, -1.15F, 0.5F, 0.0F, -1.15F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1740 */     this.gunModel['ƍ'].setRotationPoint(-92.5F, -40.0F, -2.5F);
/*      */     
/* 1742 */     this.gunModel['Ǝ'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 2, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1743 */     this.gunModel['Ǝ'].setRotationPoint(-92.5F, -42.0F, -2.5F);
/*      */     
/* 1745 */     this.gunModel['Ə'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -1.5F, 0.0F, 2.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1746 */     this.gunModel['Ə'].setRotationPoint(-94.5F, -47.0F, 0.5F);
/*      */     
/* 1748 */     this.gunModel['Ɛ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 4, 12, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1749 */     this.gunModel['Ɛ'].setRotationPoint(-88.5F, -49.0F, 0.5F);
/*      */     
/* 1751 */     this.gunModel['Ƒ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 9, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1752 */     this.gunModel['Ƒ'].setRotationPoint(-93.5F, -34.0F, 10.5F);
/*      */     
/* 1754 */     this.gunModel['ƒ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1755 */     this.gunModel['ƒ'].setRotationPoint(-91.5F, -34.0F, 10.5F);
/*      */     
/* 1757 */     this.gunModel['Ɠ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1758 */     this.gunModel['Ɠ'].setRotationPoint(-94.5F, -37.0F, 10.5F);
/*      */     
/* 1760 */     this.gunModel['Ɣ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 2, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1761 */     this.gunModel['Ɣ'].setRotationPoint(-94.5F, -39.0F, 10.5F);
/*      */     
/* 1763 */     this.gunModel['ƕ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1764 */     this.gunModel['ƕ'].setRotationPoint(-94.5F, -40.0F, 10.5F);
/*      */     
/* 1766 */     this.gunModel['Ɩ'].addShapeBox(50.0F, -23.0F, -6.5F, 10, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F);
/* 1767 */     this.gunModel['Ɩ'].setRotationPoint(-94.5F, -42.0F, 10.5F);
/*      */     
/* 1769 */     this.gunModel['Ɨ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1770 */     this.gunModel['Ɨ'].setRotationPoint(-84.75F, -48.5F, 0.5F);
/*      */     
/* 1772 */     this.gunModel['Ƙ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1773 */     this.gunModel['Ƙ'].setRotationPoint(-81.4F, -48.5F, 0.5F);
/*      */     
/* 1775 */     this.gunModel['ƙ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1776 */     this.gunModel['ƙ'].setRotationPoint(-81.4F, -48.0F, 12.5F);
/*      */     
/* 1778 */     this.gunModel['ƚ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1779 */     this.gunModel['ƚ'].setRotationPoint(-81.4F, -48.0F, -0.5F);
/*      */     
/* 1781 */     this.gunModel['ƛ'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 18, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1782 */     this.gunModel['ƛ'].setRotationPoint(-94.5F, -42.0F, 1.5F);
/*      */     
/* 1784 */     this.gunModel['Ɯ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 4, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1785 */     this.gunModel['Ɯ'].setRotationPoint(-91.5F, -28.0F, 12.5F);
/*      */     
/* 1787 */     this.gunModel['Ɲ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 3, 4, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1788 */     this.gunModel['Ɲ'].setRotationPoint(-92.5F, -27.0F, 12.5F);
/*      */     
/* 1790 */     this.gunModel['ƞ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1791 */     this.gunModel['ƞ'].setRotationPoint(-91.5F, -25.0F, 12.5F);
/*      */     
/* 1793 */     this.gunModel['Ɵ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 3, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -3.0F, 0.0F);
/* 1794 */     this.gunModel['Ɵ'].setRotationPoint(-92.5F, -22.0F, 12.5F);
/*      */     
/* 1796 */     this.gunModel['Ơ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F);
/* 1797 */     this.gunModel['Ơ'].setRotationPoint(-91.5F, -21.0F, 12.5F);
/*      */     
/* 1799 */     this.gunModel['ơ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1800 */     this.gunModel['ơ'].setRotationPoint(-92.5F, -24.0F, 12.5F);
/*      */     
/* 1802 */     this.gunModel['Ƣ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1803 */     this.gunModel['Ƣ'].setRotationPoint(-92.5F, -26.0F, -2.5F);
/*      */     
/* 1805 */     this.gunModel['ƣ'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1806 */     this.gunModel['ƣ'].setRotationPoint(-98.5F, -40.5F, 13.5F);
/*      */     
/* 1808 */     this.gunModel['Ƥ'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1809 */     this.gunModel['Ƥ'].setRotationPoint(-98.5F, -41.5F, 13.0F);
/*      */     
/* 1811 */     this.gunModel['ƥ'].addShapeBox(50.0F, -23.0F, -6.5F, 8, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1812 */     this.gunModel['ƥ'].setRotationPoint(-98.5F, -34.5F, 13.5F);
/*      */     
/* 1814 */     this.gunModel['Ʀ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1815 */     this.gunModel['Ʀ'].setRotationPoint(-99.5F, -40.5F, 13.25F);
/*      */     
/* 1817 */     this.gunModel['Ƨ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F);
/* 1818 */     this.gunModel['Ƨ'].setRotationPoint(-105.5F, -40.5F, 13.25F);
/*      */     
/* 1820 */     this.gunModel['ƨ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1821 */     this.gunModel['ƨ'].setRotationPoint(-99.5F, -41.5F, 13.75F);
/*      */     
/* 1823 */     this.gunModel['Ʃ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1824 */     this.gunModel['Ʃ'].setRotationPoint(-98.5F, -42.5F, 12.75F);
/*      */     
/* 1826 */     this.gunModel['ƪ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1827 */     this.gunModel['ƪ'].setRotationPoint(-90.5F, -41.5F, 12.75F);
/*      */     
/* 1829 */     this.gunModel['ƫ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1830 */     this.gunModel['ƫ'].setRotationPoint(-90.5F, -40.5F, 13.25F);
/*      */     
/* 1832 */     this.gunModel['Ƭ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1833 */     this.gunModel['Ƭ'].setRotationPoint(-90.5F, -34.5F, 13.25F);
/*      */     
/* 1835 */     this.gunModel['ƭ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1836 */     this.gunModel['ƭ'].setRotationPoint(-99.5F, -34.5F, 13.25F);
/*      */     
/* 1838 */     this.gunModel['Ʈ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1839 */     this.gunModel['Ʈ'].setRotationPoint(-98.5F, -33.5F, 13.25F);
/*      */     
/* 1841 */     this.gunModel['Ư'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F);
/* 1842 */     this.gunModel['Ư'].setRotationPoint(-105.5F, -34.5F, 13.25F);
/*      */     
/* 1844 */     this.gunModel['ư'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F);
/* 1845 */     this.gunModel['ư'].setRotationPoint(-104.5F, -33.5F, 13.25F);
/*      */     
/* 1847 */     this.gunModel['Ʊ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 1848 */     this.gunModel['Ʊ'].setRotationPoint(-105.5F, -41.5F, 13.25F);
/*      */     
/* 1850 */     this.gunModel['Ʋ'].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F);
/* 1851 */     this.gunModel['Ʋ'].setRotationPoint(-104.5F, -42.5F, 13.25F);
/*      */     
/* 1853 */     this.gunModel['Ƴ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 18, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1854 */     this.gunModel['Ƴ'].setRotationPoint(-87.5F, -30.0F, 15.5F);
/*      */     
/* 1856 */     this.gunModel['ƴ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 18, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F);
/* 1857 */     this.gunModel['ƴ'].setRotationPoint(-87.5F, -30.0F, 16.5F);
/*      */     
/* 1859 */     this.gunModel['Ƶ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1860 */     this.gunModel['Ƶ'].setRotationPoint(-86.5F, -27.0F, 15.0F);
/*      */     
/* 1862 */     this.gunModel['ƶ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1863 */     this.gunModel['ƶ'].setRotationPoint(-87.0F, -21.0F, 15.0F);
/*      */     
/* 1865 */     this.gunModel['Ʒ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1866 */     this.gunModel['Ʒ'].setRotationPoint(-36.0F, -32.5F, 14.25F);
/*      */     
/* 1868 */     this.gunModel['Ƹ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1869 */     this.gunModel['Ƹ'].setRotationPoint(-36.0F, -30.5F, 14.25F);
/*      */     
/* 1871 */     this.gunModel['ƹ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1872 */     this.gunModel['ƹ'].setRotationPoint(-36.0F, -31.5F, 14.25F);
/*      */     
/* 1874 */     this.gunModel['ƺ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1875 */     this.gunModel['ƺ'].setRotationPoint(-64.0F, -32.5F, 14.25F);
/*      */     
/* 1877 */     this.gunModel['ƻ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1878 */     this.gunModel['ƻ'].setRotationPoint(-64.0F, -30.5F, 14.25F);
/*      */     
/* 1880 */     this.gunModel['Ƽ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1881 */     this.gunModel['Ƽ'].setRotationPoint(-64.0F, -31.5F, 14.25F);
/*      */     
/* 1883 */     this.gunModel['ƽ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1884 */     this.gunModel['ƽ'].setRotationPoint(-70.0F, -30.5F, 14.25F);
/*      */     
/* 1886 */     this.gunModel['ƾ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1887 */     this.gunModel['ƾ'].setRotationPoint(-70.0F, -28.5F, 14.25F);
/*      */     
/* 1889 */     this.gunModel['ƿ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1890 */     this.gunModel['ƿ'].setRotationPoint(-70.0F, -29.5F, 14.25F);
/*      */     
/* 1892 */     this.gunModel['ǀ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1893 */     this.gunModel['ǀ'].setRotationPoint(-75.0F, -30.5F, 14.25F);
/*      */     
/* 1895 */     this.gunModel['ǁ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1896 */     this.gunModel['ǁ'].setRotationPoint(-75.0F, -28.5F, 14.25F);
/*      */     
/* 1898 */     this.gunModel['ǂ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1899 */     this.gunModel['ǂ'].setRotationPoint(-75.0F, -29.5F, 14.25F);
/*      */     
/* 1901 */     this.gunModel['ǃ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1902 */     this.gunModel['ǃ'].setRotationPoint(-3.0F, -32.5F, 14.25F);
/*      */     
/* 1904 */     this.gunModel['Ǆ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1905 */     this.gunModel['Ǆ'].setRotationPoint(-3.0F, -30.5F, 14.25F);
/*      */     
/* 1907 */     this.gunModel['ǅ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1908 */     this.gunModel['ǅ'].setRotationPoint(-3.0F, -31.5F, 14.25F);
/*      */     
/* 1910 */     this.gunModel['ǆ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1911 */     this.gunModel['ǆ'].setRotationPoint(24.75F, -18.5F, -0.5F);
/*      */     
/* 1913 */     this.gunModel['Ǉ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1914 */     this.gunModel['Ǉ'].setRotationPoint(25.0F, -17.75F, -0.5F);
/*      */     
/* 1916 */     this.gunModel['ǈ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1917 */     this.gunModel['ǈ'].setRotationPoint(25.0F, -19.25F, -0.5F);
/*      */     
/* 1919 */     this.gunModel['ǉ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 14, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1920 */     this.gunModel['ǉ'].setRotationPoint(24.25F, -19.25F, -0.5F);
/*      */     
/* 1922 */     this.gunModel['Ǌ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 14, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1923 */     this.gunModel['Ǌ'].setRotationPoint(25.5F, -19.25F, -0.5F);
/*      */     
/* 1925 */     this.gunModel['ǋ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1926 */     this.gunModel['ǋ'].setRotationPoint(24.25F, -18.0F, -0.5F);
/*      */     
/* 1928 */     this.gunModel['ǌ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 14, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1929 */     this.gunModel['ǌ'].setRotationPoint(25.5F, -18.0F, -0.5F);
/*      */     
/* 1931 */     this.gunModel['Ǎ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1932 */     this.gunModel['Ǎ'].setRotationPoint(-20.0F, -5.5F, 12.0F);
/*      */     
/* 1934 */     this.gunModel['ǎ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1935 */     this.gunModel['ǎ'].setRotationPoint(-16.0F, -5.5F, 12.0F);
/*      */     
/* 1937 */     this.gunModel['Ǐ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1938 */     this.gunModel['Ǐ'].setRotationPoint(-14.0F, -7.5F, 12.0F);
/*      */     
/* 1940 */     this.gunModel['ǐ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1941 */     this.gunModel['ǐ'].setRotationPoint(-14.0F, -15.5F, 12.0F);
/*      */     
/* 1943 */     this.gunModel['Ǒ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1944 */     this.gunModel['Ǒ'].setRotationPoint(-20.0F, -15.5F, 12.0F);
/*      */     
/* 1946 */     this.gunModel['ǒ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1947 */     this.gunModel['ǒ'].setRotationPoint(-16.0F, -15.5F, 12.0F);
/*      */     
/* 1949 */     this.gunModel['Ǔ'].addShapeBox(50.0F, -23.0F, -6.5F, 10, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1950 */     this.gunModel['Ǔ'].setRotationPoint(-13.0F, -11.5F, 12.5F);
/*      */     
/* 1952 */     this.gunModel['ǔ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1953 */     this.gunModel['ǔ'].setRotationPoint(-3.0F, -11.5F, 12.5F);
/*      */     
/* 1955 */     this.gunModel['Ǖ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1956 */     this.gunModel['Ǖ'].setRotationPoint(-1.5F, -11.0F, 12.5F);
/*      */     
/* 1958 */     this.gunModel['ǖ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1959 */     this.gunModel['ǖ'].setRotationPoint(-19.0F, -14.5F, 12.25F);
/*      */     
/* 1961 */     this.gunModel['Ǘ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1962 */     this.gunModel['Ǘ'].setRotationPoint(-16.0F, -14.5F, 12.25F);
/*      */     
/* 1964 */     this.gunModel['ǘ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 9, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1965 */     this.gunModel['ǘ'].setRotationPoint(-22.0F, -14.5F, 12.25F);
/*      */     
/* 1967 */     this.gunModel['Ǚ'].addShapeBox(50.0F, -23.0F, -6.5F, 9, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1968 */     this.gunModel['Ǚ'].setRotationPoint(-12.0F, -20.0F, 12.5F);
/*      */     
/* 1970 */     this.gunModel['ǚ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1971 */     this.gunModel['ǚ'].setRotationPoint(-20.5F, -22.0F, 12.0F);
/*      */     
/* 1973 */     this.gunModel['Ǜ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1974 */     this.gunModel['Ǜ'].setRotationPoint(-15.5F, -22.0F, 12.0F);
/*      */     
/* 1976 */     this.gunModel['ǜ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1977 */     this.gunModel['ǜ'].setRotationPoint(-19.5F, -22.0F, 12.5F);
/*      */     
/* 1979 */     this.gunModel['ǝ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1980 */     this.gunModel['ǝ'].setRotationPoint(-19.5F, -18.0F, 12.5F);
/*      */     
/* 1982 */     this.gunModel['Ǟ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1983 */     this.gunModel['Ǟ'].setRotationPoint(-19.0F, -16.5F, 12.5F);
/*      */     
/* 1985 */     this.gunModel['ǟ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1986 */     this.gunModel['ǟ'].setRotationPoint(-18.0F, -18.0F, 14.25F);
/*      */     
/* 1988 */     this.gunModel['Ǡ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1989 */     this.gunModel['Ǡ'].setRotationPoint(-18.0F, -21.0F, 14.25F);
/*      */     
/* 1991 */     this.gunModel['ǡ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1992 */     this.gunModel['ǡ'].setRotationPoint(-18.0F, -19.0F, 14.25F);
/*      */     
/* 1994 */     this.gunModel['Ǣ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 1, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1995 */     this.gunModel['Ǣ'].setRotationPoint(-18.0F, -23.0F, 14.25F);
/*      */     
/* 1997 */     this.gunModel['ǣ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1998 */     this.gunModel['ǣ'].setRotationPoint(-18.5F, -24.0F, 14.5F);
/*      */     
/* 2000 */     this.gunModel['Ǥ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2001 */     this.gunModel['Ǥ'].setRotationPoint(-18.5F, -26.0F, 14.5F);
/*      */     
/* 2003 */     this.gunModel['ǥ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2004 */     this.gunModel['ǥ'].setRotationPoint(-19.5F, -29.0F, 14.5F);
/*      */     
/* 2006 */     this.gunModel['Ǧ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2007 */     this.gunModel['Ǧ'].setRotationPoint(-18.5F, -30.0F, 14.5F);
/*      */     
/* 2009 */     this.gunModel['ǧ'].addBox(50.0F, -23.0F, -6.5F, 96, 11, 17, 0.0F);
/* 2010 */     this.gunModel['ǧ'].setRotationPoint(21.0F, -34.0F, -2.0F);
/*      */     
/* 2012 */     this.gunModel['Ǩ'].addBox(50.0F, -23.0F, -6.5F, 46, 11, 9, 0.0F);
/* 2013 */     this.gunModel['Ǩ'].setRotationPoint(-25.0F, -34.0F, 6.0F);
/*      */     
/* 2015 */     this.gunModel['ǩ'].addBox(50.0F, -23.0F, -6.5F, 46, 3, 8, 0.0F);
/* 2016 */     this.gunModel['ǩ'].setRotationPoint(-25.0F, -26.0F, -2.0F);
/*      */     
/* 2018 */     this.gunModel['Ǫ'].addBox(50.0F, -23.0F, -6.5F, 46, 2, 8, 0.0F);
/* 2019 */     this.gunModel['Ǫ'].setRotationPoint(-25.0F, -34.0F, -2.0F);
/*      */     
/* 2021 */     this.gunModel['ǫ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2022 */     this.gunModel['ǫ'].setRotationPoint(-25.0F, -32.0F, -2.0F);
/*      */     
/* 2024 */     this.gunModel['Ǭ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2025 */     this.gunModel['Ǭ'].setRotationPoint(-25.0F, -27.0F, -2.0F);
/*      */     
/* 2027 */     this.gunModel['ǭ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 8, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2028 */     this.gunModel['ǭ'].setRotationPoint(19.0F, -27.0F, -2.0F);
/*      */     
/* 2030 */     this.gunModel['Ǯ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2031 */     this.gunModel['Ǯ'].setRotationPoint(19.0F, -32.0F, -2.0F);
/*      */     
/* 2033 */     this.gunModel['ǯ'].addShapeBox(50.0F, -23.0F, -6.5F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2034 */     this.gunModel['ǯ'].setRotationPoint(20.0F, -32.0F, -2.0F);
/*      */     
/* 2036 */     this.gunModel['ǰ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2037 */     this.gunModel['ǰ'].setRotationPoint(-14.5F, -6.5F, -2.5F);
/*      */     
/* 2039 */     this.gunModel['Ǳ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2040 */     this.gunModel['Ǳ'].setRotationPoint(-11.5F, -6.5F, -2.5F);
/*      */     
/* 2042 */     this.gunModel['ǲ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2043 */     this.gunModel['ǲ'].setRotationPoint(-11.5F, -14.5F, -2.5F);
/*      */     
/* 2045 */     this.gunModel['ǳ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2046 */     this.gunModel['ǳ'].setRotationPoint(-11.5F, -16.5F, -2.5F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2051 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 777, 89, this.textureX, this.textureY);
/* 2052 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 1009, 129, this.textureX, this.textureY);
/* 2053 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 153, 161, this.textureX, this.textureY);
/* 2054 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 521, 161, this.textureX, this.textureY);
/* 2055 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 897, 161, this.textureX, this.textureY);
/* 2056 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 1153, 161, this.textureX, this.textureY);
/* 2057 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 1177, 161, this.textureX, this.textureY);
/* 2058 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 1433, 161, this.textureX, this.textureY);
/* 2059 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 1513, 129, this.textureX, this.textureY);
/* 2060 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 537, 137, this.textureX, this.textureY);
/* 2061 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 1193, 137, this.textureX, this.textureY);
/* 2062 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 817, 89, this.textureX, this.textureY);
/* 2063 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 1225, 89, this.textureX, this.textureY);
/* 2064 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 1265, 89, this.textureX, this.textureY);
/* 2065 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 1305, 89, this.textureX, this.textureY);
/* 2066 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 1385, 89, this.textureX, this.textureY);
/* 2067 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 569, 97, this.textureX, this.textureY);
/* 2068 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 841, 97, this.textureX, this.textureY);
/* 2069 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 913, 97, this.textureX, this.textureY);
/* 2070 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 1449, 97, this.textureX, this.textureY);
/* 2071 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 1521, 97, this.textureX, this.textureY);
/* 2072 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 1617, 97, this.textureX, this.textureY);
/* 2073 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 1633, 97, this.textureX, this.textureY);
/* 2074 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 641, 89, this.textureX, this.textureY);
/* 2075 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 681, 89, this.textureX, this.textureY);
/* 2076 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 721, 89, this.textureX, this.textureY);
/* 2077 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 761, 89, this.textureX, this.textureY);
/* 2078 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 1457, 161, this.textureX, this.textureY);
/* 2079 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/* 2080 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 1577, 161, this.textureX, this.textureY);
/* 2081 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 521, 145, this.textureX, this.textureY);
/* 2082 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 1601, 161, this.textureX, this.textureY);
/* 2083 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 1649, 161, this.textureX, this.textureY);
/* 2084 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 305, 161, this.textureX, this.textureY);
/*      */     
/* 2086 */     this.gunModel['Ǵ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2087 */     this.gunModel['Ǵ'].setRotationPoint(-14.5F, -16.5F, -2.5F);
/*      */     
/* 2089 */     this.gunModel['ǵ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2090 */     this.gunModel['ǵ'].setRotationPoint(-19.5F, -16.5F, -1.0F);
/*      */     
/* 2092 */     this.gunModel['Ƕ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2093 */     this.gunModel['Ƕ'].setRotationPoint(-25.5F, -16.5F, -1.0F);
/*      */     
/* 2095 */     this.gunModel['Ƿ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2096 */     this.gunModel['Ƿ'].setRotationPoint(-25.5F, -14.5F, -1.0F);
/*      */     
/* 2098 */     this.gunModel['Ǹ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2099 */     this.gunModel['Ǹ'].setRotationPoint(-25.5F, -11.5F, -1.0F);
/*      */     
/* 2101 */     this.gunModel['ǹ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2102 */     this.gunModel['ǹ'].setRotationPoint(-18.5F, -11.5F, -1.5F);
/*      */     
/* 2104 */     this.gunModel['Ǻ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2105 */     this.gunModel['Ǻ'].setRotationPoint(-18.5F, -13.5F, -1.5F);
/*      */     
/* 2107 */     this.gunModel['ǻ'].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2108 */     this.gunModel['ǻ'].setRotationPoint(-18.5F, -9.5F, -1.5F);
/*      */     
/* 2110 */     this.gunModel['Ǽ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2111 */     this.gunModel['Ǽ'].setRotationPoint(-24.0F, -14.5F, -1.5F);
/*      */     
/* 2113 */     this.gunModel['ǽ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2114 */     this.gunModel['ǽ'].setRotationPoint(-24.0F, -12.5F, -1.5F);
/*      */     
/* 2116 */     this.gunModel['Ǿ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2117 */     this.gunModel['Ǿ'].setRotationPoint(-24.0F, -13.5F, -1.5F);
/*      */     
/* 2119 */     this.gunModel['ǿ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2120 */     this.gunModel['ǿ'].setRotationPoint(-69.0F, -31.0F, -2.5F);
/*      */     
/* 2122 */     this.gunModel['Ȁ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2123 */     this.gunModel['Ȁ'].setRotationPoint(-69.0F, -29.0F, -2.5F);
/*      */     
/* 2125 */     this.gunModel['ȁ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2126 */     this.gunModel['ȁ'].setRotationPoint(-69.0F, -30.0F, -2.5F);
/*      */     
/* 2128 */     this.gunModel['Ȃ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2129 */     this.gunModel['Ȃ'].setRotationPoint(-74.5F, -31.0F, -2.5F);
/*      */     
/* 2131 */     this.gunModel['ȃ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2132 */     this.gunModel['ȃ'].setRotationPoint(-74.5F, -29.0F, -2.5F);
/*      */     
/* 2134 */     this.gunModel['Ȅ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2135 */     this.gunModel['Ȅ'].setRotationPoint(-74.5F, -30.0F, -2.5F);
/*      */     
/* 2137 */     this.gunModel['ȅ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2138 */     this.gunModel['ȅ'].setRotationPoint(-30.0F, -31.0F, -2.5F);
/*      */     
/* 2140 */     this.gunModel['Ȇ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2141 */     this.gunModel['Ȇ'].setRotationPoint(-30.0F, -29.0F, -2.5F);
/*      */     
/* 2143 */     this.gunModel['ȇ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2144 */     this.gunModel['ȇ'].setRotationPoint(-30.0F, -30.0F, -2.5F);
/*      */     
/* 2146 */     this.gunModel['Ȉ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2147 */     this.gunModel['Ȉ'].setRotationPoint(-35.5F, -31.0F, -2.5F);
/*      */     
/* 2149 */     this.gunModel['ȉ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2150 */     this.gunModel['ȉ'].setRotationPoint(-35.5F, -29.0F, -2.5F);
/*      */     
/* 2152 */     this.gunModel['Ȋ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2153 */     this.gunModel['Ȋ'].setRotationPoint(-35.5F, -30.0F, -2.5F);
/*      */     
/* 2155 */     this.gunModel['ȋ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2156 */     this.gunModel['ȋ'].setRotationPoint(-27.0F, -31.0F, -4.0F);
/*      */     
/* 2158 */     this.gunModel['Ȍ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2159 */     this.gunModel['Ȍ'].setRotationPoint(-27.0F, -33.0F, -4.0F);
/*      */     
/* 2161 */     this.gunModel['ȍ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2162 */     this.gunModel['ȍ'].setRotationPoint(-27.0F, -34.0F, -3.0F);
/*      */     
/* 2164 */     this.gunModel['Ȏ'].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2165 */     this.gunModel['Ȏ'].setRotationPoint(-27.0F, -27.0F, -3.0F);
/*      */     
/* 2167 */     this.gunModel['ȏ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2168 */     this.gunModel['ȏ'].setRotationPoint(-85.5F, -44.0F, -4.5F);
/* 2169 */     this.gunModel['ȏ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2171 */     this.gunModel['Ȑ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2172 */     this.gunModel['Ȑ'].setRotationPoint(-85.35F, -40.0F, -4.0F);
/* 2173 */     this.gunModel['Ȑ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2175 */     this.gunModel['ȑ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2176 */     this.gunModel['ȑ'].setRotationPoint(-86.1F, -38.0F, -4.5F);
/* 2177 */     this.gunModel['ȑ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2179 */     this.gunModel['Ȓ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2180 */     this.gunModel['Ȓ'].setRotationPoint(-86.35F, -30.0F, -4.0F);
/* 2181 */     this.gunModel['Ȓ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2183 */     this.gunModel['ȓ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2184 */     this.gunModel['ȓ'].setRotationPoint(-87.2F, -27.15F, -4.5F);
/* 2185 */     this.gunModel['ȓ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2187 */     this.gunModel['Ȕ'].addShapeBox(50.0F, -23.0F, -6.5F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2188 */     this.gunModel['Ȕ'].setRotationPoint(-88.0F, -17.15F, -4.5F);
/* 2189 */     this.gunModel['Ȕ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2191 */     this.gunModel['ȕ'].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2192 */     this.gunModel['ȕ'].setRotationPoint(-87.25F, -20.0F, -4.0F);
/* 2193 */     this.gunModel['ȕ'].rotateAngleZ = -0.08726646F;
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2198 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 1529, 81, this.textureX, this.textureY);
/* 2199 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 1569, 81, this.textureX, this.textureY);
/* 2200 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 1929, 81, this.textureX, this.textureY);
/* 2201 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1961, 81, this.textureX, this.textureY);
/* 2202 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 1769, 9, this.textureX, this.textureY);
/* 2203 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 633, 17, this.textureX, this.textureY);
/* 2204 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/* 2205 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 681, 17, this.textureX, this.textureY);
/* 2206 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 705, 17, this.textureX, this.textureY);
/* 2207 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 729, 17, this.textureX, this.textureY);
/* 2208 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 753, 17, this.textureX, this.textureY);
/* 2209 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 777, 17, this.textureX, this.textureY);
/* 2210 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 801, 17, this.textureX, this.textureY);
/* 2211 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 825, 17, this.textureX, this.textureY);
/* 2212 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 849, 17, this.textureX, this.textureY);
/* 2213 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 865, 17, this.textureX, this.textureY);
/* 2214 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 1129, 17, this.textureX, this.textureY);
/* 2215 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 1153, 17, this.textureX, this.textureY);
/* 2216 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 1745, 9, this.textureX, this.textureY);
/* 2217 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 1993, 81, this.textureX, this.textureY);
/* 2218 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 2219 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/* 2220 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/* 2221 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 1369, 121, this.textureX, this.textureY);
/* 2222 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 1969, 121, this.textureX, this.textureY);
/* 2223 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 105, 137, this.textureX, this.textureY);
/* 2224 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 129, 137, this.textureX, this.textureY);
/* 2225 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 409, 137, this.textureX, this.textureY);
/* 2226 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 1985, 81, this.textureX, this.textureY);
/* 2227 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/* 2228 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 121, 89, this.textureX, this.textureY);
/* 2229 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 1609, 81, this.textureX, this.textureY);
/* 2230 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 1769, 81, this.textureX, this.textureY);
/* 2231 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/* 2232 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 1393, 137, this.textureX, this.textureY);
/* 2233 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 1201, 105, this.textureX, this.textureY);
/* 2234 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/* 2235 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 1673, 137, this.textureX, this.textureY);
/* 2236 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 1801, 81, this.textureX, this.textureY);
/* 2237 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 1953, 81, this.textureX, this.textureY);
/* 2238 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 1849, 137, this.textureX, this.textureY);
/* 2239 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 1873, 137, this.textureX, this.textureY);
/* 2240 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 1785, 153, this.textureX, this.textureY);
/* 2241 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 1809, 153, this.textureX, this.textureY);
/* 2242 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 2017, 153, this.textureX, this.textureY);
/* 2243 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/* 2244 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 25, 161, this.textureX, this.textureY);
/* 2245 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 49, 161, this.textureX, this.textureY);
/* 2246 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 73, 161, this.textureX, this.textureY);
/* 2247 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 1289, 153, this.textureX, this.textureY);
/* 2248 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 1361, 89, this.textureX, this.textureY);
/* 2249 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 1825, 153, this.textureX, this.textureY);
/* 2250 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 97, 161, this.textureX, this.textureY);
/* 2251 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 129, 161, this.textureX, this.textureY);
/* 2252 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 169, 161, this.textureX, this.textureY);
/* 2253 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 2254 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 193, 161, this.textureX, this.textureY);
/* 2255 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 217, 161, this.textureX, this.textureY);
/* 2256 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 177, 89, this.textureX, this.textureY);
/* 2257 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/* 2258 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/* 2259 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 2041, 65, this.textureX, this.textureY);
/* 2260 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 929, 73, this.textureX, this.textureY);
/* 2261 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/* 2262 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 1097, 81, this.textureX, this.textureY);
/* 2263 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 1409, 81, this.textureX, this.textureY);
/* 2264 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 1449, 81, this.textureX, this.textureY);
/* 2265 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 121, 161, this.textureX, this.textureY);
/* 2266 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 241, 161, this.textureX, this.textureY);
/* 2267 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 265, 161, this.textureX, this.textureY);
/* 2268 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 505, 89, this.textureX, this.textureY);
/* 2269 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/* 2270 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 1489, 81, this.textureX, this.textureY);
/* 2271 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 1657, 81, this.textureX, this.textureY);
/* 2272 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 1817, 81, this.textureX, this.textureY);
/* 2273 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/* 2274 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 1857, 81, this.textureX, this.textureY);
/* 2275 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 1881, 81, this.textureX, this.textureY);
/* 2276 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 1977, 105, this.textureX, this.textureY);
/* 2277 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 1409, 121, this.textureX, this.textureY);
/* 2278 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/* 2279 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/* 2280 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 1001, 73, this.textureX, this.textureY);
/* 2281 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/* 2282 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 545, 89, this.textureX, this.textureY);
/* 2283 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/* 2284 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 713, 49, this.textureX, this.textureY);
/* 2285 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 601, 89, this.textureX, this.textureY);
/* 2286 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/* 2287 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 737, 65, this.textureX, this.textureY);
/* 2288 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 1473, 65, this.textureX, this.textureY);
/* 2289 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/*      */     
/* 2291 */     this.defaultScopeModel[0].addShapeBox(50.0F, -23.0F, -6.5F, 5, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2292 */     this.defaultScopeModel[0].setRotationPoint(123.0F, -55.0F, 2.0F);
/*      */     
/* 2294 */     this.defaultScopeModel[1].addShapeBox(50.0F, -23.0F, -6.5F, 5, 4, 9, 0.0F, 0.0F, -0.5F, -1.5F, 2.0F, -0.5F, -1.5F, 2.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2295 */     this.defaultScopeModel[1].setRotationPoint(123.0F, -59.0F, 2.0F);
/*      */     
/* 2297 */     this.defaultScopeModel[2].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2298 */     this.defaultScopeModel[2].setRotationPoint(123.0F, -61.5F, 3.0F);
/*      */     
/* 2300 */     this.defaultScopeModel[3].addShapeBox(50.0F, -23.0F, -6.5F, 7, 5, 5, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2301 */     this.defaultScopeModel[3].setRotationPoint(123.0F, -66.5F, 4.0F);
/*      */     
/* 2303 */     this.defaultScopeModel[4].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F);
/* 2304 */     this.defaultScopeModel[4].setRotationPoint(123.0F, -66.5F, 9.0F);
/*      */     
/* 2306 */     this.defaultScopeModel[5].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 1, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.2F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
/* 2307 */     this.defaultScopeModel[5].setRotationPoint(123.0F, -66.5F, 3.0F);
/*      */     
/* 2309 */     this.defaultScopeModel[6].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2310 */     this.defaultScopeModel[6].setRotationPoint(123.0F, -69.5F, 9.0F);
/*      */     
/* 2312 */     this.defaultScopeModel[7].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2313 */     this.defaultScopeModel[7].setRotationPoint(123.0F, -69.5F, 2.0F);
/*      */     
/* 2315 */     this.defaultScopeModel[8].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 1, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F);
/* 2316 */     this.defaultScopeModel[8].setRotationPoint(123.0F, -72.5F, 9.0F);
/*      */     
/* 2318 */     this.defaultScopeModel[9].addShapeBox(50.0F, -23.0F, -6.5F, 7, 3, 1, 0.0F, 0.2F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2319 */     this.defaultScopeModel[9].setRotationPoint(123.0F, -72.5F, 3.0F);
/*      */     
/* 2321 */     this.defaultScopeModel[10].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F);
/* 2322 */     this.defaultScopeModel[10].setRotationPoint(123.0F, -73.5F, 7.0F);
/*      */     
/* 2324 */     this.defaultScopeModel[11].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 1, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2325 */     this.defaultScopeModel[11].setRotationPoint(123.0F, -73.5F, 5.0F);
/*      */     
/* 2327 */     this.defaultScopeModel[12].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2328 */     this.defaultScopeModel[12].setRotationPoint(123.0F, -73.5F, 6.0F);
/*      */     
/* 2330 */     this.defaultScopeModel[13].addShapeBox(50.0F, -23.0F, -6.5F, 7, 2, 1, 0.0F, 0.35F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2331 */     this.defaultScopeModel[13].setRotationPoint(123.0F, -71.0F, 8.0F);
/*      */     
/* 2333 */     this.defaultScopeModel[14].addShapeBox(50.0F, -23.0F, -6.5F, 7, 2, 1, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F);
/* 2334 */     this.defaultScopeModel[14].setRotationPoint(123.0F, -71.0F, 4.0F);
/*      */     
/* 2336 */     this.defaultScopeModel[15].addShapeBox(50.0F, -23.0F, -6.5F, 7, 1, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.35F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.35F, 0.5F, 0.0F);
/* 2337 */     this.defaultScopeModel[15].setRotationPoint(123.0F, -72.5F, 4.0F);
/*      */     
/* 2339 */     this.defaultScopeModel[16].addShapeBox(50.0F, -23.0F, -6.5F, 7, 2, 1, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/* 2340 */     this.defaultScopeModel[16].setRotationPoint(123.0F, -68.0F, 4.0F);
/*      */     
/* 2342 */     this.defaultScopeModel[17].addShapeBox(50.0F, -23.0F, -6.5F, 7, 2, 1, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2343 */     this.defaultScopeModel[17].setRotationPoint(123.0F, -68.0F, 8.0F);
/*      */     
/* 2345 */     this.defaultScopeModel[18].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2346 */     this.defaultScopeModel[18].setRotationPoint(124.5F, -69.0F, 6.0F);
/*      */     
/* 2348 */     this.defaultScopeModel[19].addShapeBox(50.0F, -23.0F, -6.5F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2349 */     this.defaultScopeModel[19].setRotationPoint(123.0F, -53.0F, 2.0F);
/*      */     
/* 2351 */     this.defaultScopeModel[20].addShapeBox(50.0F, -23.0F, -6.5F, 5, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2352 */     this.defaultScopeModel[20].setRotationPoint(123.0F, -52.0F, 2.0F);
/*      */     
/* 2354 */     this.defaultScopeModel[21].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2355 */     this.defaultScopeModel[21].setRotationPoint(124.5F, -54.5F, 1.5F);
/*      */     
/* 2357 */     this.defaultScopeModel[22].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2358 */     this.defaultScopeModel[22].setRotationPoint(-73.5F, -59.0F, 1.0F);
/*      */     
/* 2360 */     this.defaultScopeModel[23].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2361 */     this.defaultScopeModel[23].setRotationPoint(-73.5F, -56.0F, 1.0F);
/*      */     
/* 2363 */     this.defaultScopeModel[24].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2364 */     this.defaultScopeModel[24].setRotationPoint(-73.5F, -53.0F, 1.0F);
/*      */     
/* 2366 */     this.defaultScopeModel[25].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2367 */     this.defaultScopeModel[25].setRotationPoint(-73.5F, -59.0F, 11.0F);
/*      */     
/* 2369 */     this.defaultScopeModel[26].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2370 */     this.defaultScopeModel[26].setRotationPoint(-73.5F, -56.0F, 11.0F);
/*      */     
/* 2372 */     this.defaultScopeModel[27].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2373 */     this.defaultScopeModel[27].setRotationPoint(-73.5F, -53.0F, 11.0F);
/*      */     
/* 2375 */     this.defaultScopeModel[28].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2376 */     this.defaultScopeModel[28].setRotationPoint(-72.0F, -55.5F, 12.0F);
/*      */     
/* 2378 */     this.defaultScopeModel[29].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2379 */     this.defaultScopeModel[29].setRotationPoint(-72.0F, -57.5F, 12.0F);
/*      */     
/* 2381 */     this.defaultScopeModel[30].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2382 */     this.defaultScopeModel[30].setRotationPoint(-72.0F, -53.5F, 12.0F);
/*      */     
/* 2384 */     this.defaultScopeModel[31].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2385 */     this.defaultScopeModel[31].setRotationPoint(-70.0F, -58.5F, 12.0F);
/*      */     
/* 2387 */     this.defaultScopeModel[32].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2388 */     this.defaultScopeModel[32].setRotationPoint(-70.0F, -51.0F, 12.0F);
/*      */     
/* 2390 */     this.defaultScopeModel[33].addShapeBox(50.0F, -23.0F, -6.5F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2391 */     this.defaultScopeModel[33].setRotationPoint(-74.75F, -59.0F, 12.0F);
/*      */     
/* 2393 */     this.defaultScopeModel[34].addShapeBox(50.0F, -23.0F, -6.5F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2394 */     this.defaultScopeModel[34].setRotationPoint(-72.25F, -59.0F, 12.0F);
/*      */     
/* 2396 */     this.defaultScopeModel[35].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2397 */     this.defaultScopeModel[35].setRotationPoint(-72.0F, -55.5F, -1.0F);
/*      */     
/* 2399 */     this.defaultScopeModel[36].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2400 */     this.defaultScopeModel[36].setRotationPoint(-72.0F, -57.5F, -1.0F);
/*      */     
/* 2402 */     this.defaultScopeModel[37].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2403 */     this.defaultScopeModel[37].setRotationPoint(-72.0F, -53.5F, -1.0F);
/*      */     
/* 2405 */     this.defaultScopeModel[38].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2406 */     this.defaultScopeModel[38].setRotationPoint(-70.0F, -58.5F, -0.7F);
/*      */     
/* 2408 */     this.defaultScopeModel[39].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2409 */     this.defaultScopeModel[39].setRotationPoint(-70.0F, -51.0F, -0.7F);
/*      */     
/* 2411 */     this.defaultScopeModel[40].addShapeBox(50.0F, -23.0F, -6.5F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2412 */     this.defaultScopeModel[40].setRotationPoint(-74.75F, -59.0F, -0.7F);
/*      */     
/* 2414 */     this.defaultScopeModel[41].addShapeBox(50.0F, -23.0F, -6.5F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2415 */     this.defaultScopeModel[41].setRotationPoint(-72.25F, -59.0F, -0.7F);
/*      */     
/* 2417 */     this.defaultScopeModel[42].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 2, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2418 */     this.defaultScopeModel[42].setRotationPoint(-73.5F, -58.0F, 9.0F);
/*      */     
/* 2420 */     this.defaultScopeModel[43].addShapeBox(50.0F, -23.0F, -6.5F, 9, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2421 */     this.defaultScopeModel[43].setRotationPoint(-73.5F, -55.0F, 9.0F);
/*      */     
/* 2423 */     this.defaultScopeModel[44].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2424 */     this.defaultScopeModel[44].setRotationPoint(-73.5F, -53.0F, 9.0F);
/*      */     
/* 2426 */     this.defaultScopeModel[45].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 2, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2427 */     this.defaultScopeModel[45].setRotationPoint(-73.5F, -58.0F, 2.0F);
/*      */     
/* 2429 */     this.defaultScopeModel[46].addShapeBox(50.0F, -23.0F, -6.5F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2430 */     this.defaultScopeModel[46].setRotationPoint(-73.5F, -55.0F, 2.0F);
/*      */     
/* 2432 */     this.defaultScopeModel[47].addShapeBox(50.0F, -23.0F, -6.5F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F);
/* 2433 */     this.defaultScopeModel[47].setRotationPoint(-73.5F, -53.0F, 2.0F);
/*      */     
/* 2435 */     this.defaultScopeModel[48].addShapeBox(50.0F, -23.0F, -6.5F, 6, 15, 2, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2436 */     this.defaultScopeModel[48].setRotationPoint(-72.0F, -66.0F, 3.5F);
/*      */     
/* 2438 */     this.defaultScopeModel[49].addShapeBox(50.0F, -23.0F, -6.5F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2439 */     this.defaultScopeModel[49].setRotationPoint(-65.5F, -55.0F, 3.5F);
/*      */     
/* 2441 */     this.defaultScopeModel[50].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2442 */     this.defaultScopeModel[50].setRotationPoint(-65.5F, -56.0F, 3.5F);
/*      */     
/* 2444 */     this.defaultScopeModel[51].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2445 */     this.defaultScopeModel[51].setRotationPoint(-66.5F, -55.0F, 1.5F);
/*      */     
/* 2447 */     this.defaultScopeModel[52].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2448 */     this.defaultScopeModel[52].setRotationPoint(-63.5F, -55.0F, 1.5F);
/*      */     
/* 2450 */     this.defaultScopeModel[53].addShapeBox(50.0F, -23.0F, -6.5F, 6, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2451 */     this.defaultScopeModel[53].setRotationPoint(-63.5F, -53.0F, 1.5F);
/*      */     
/* 2453 */     this.defaultScopeModel[54].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2454 */     this.defaultScopeModel[54].setRotationPoint(-57.5F, -53.0F, 1.5F);
/*      */     
/* 2456 */     this.defaultScopeModel[55].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2457 */     this.defaultScopeModel[55].setRotationPoint(-57.5F, -53.0F, 9.5F);
/*      */     
/* 2459 */     this.defaultScopeModel[56].addShapeBox(50.0F, -23.0F, -6.5F, 6, 15, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2460 */     this.defaultScopeModel[56].setRotationPoint(-72.0F, -66.0F, 5.5F);
/*      */     
/* 2462 */     this.defaultScopeModel[57].addShapeBox(50.0F, -23.0F, -6.5F, 6, 15, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2463 */     this.defaultScopeModel[57].setRotationPoint(-72.0F, -66.0F, 7.5F);
/*      */     
/* 2465 */     this.defaultScopeModel[58].addShapeBox(50.0F, -23.0F, -6.5F, 3, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2466 */     this.defaultScopeModel[58].setRotationPoint(-62.0F, -54.0F, 10.5F);
/*      */     
/* 2468 */     this.defaultScopeModel[59].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2469 */     this.defaultScopeModel[59].setRotationPoint(-62.0F, -51.0F, 10.5F);
/*      */     
/* 2471 */     this.defaultScopeModel[60].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2472 */     this.defaultScopeModel[60].setRotationPoint(-61.15F, -53.25F, 11.0F);
/*      */     
/* 2474 */     this.defaultScopeModel[61].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2475 */     this.defaultScopeModel[61].setRotationPoint(-60.9F, -52.5F, 11.0F);
/*      */     
/* 2477 */     this.defaultScopeModel[62].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2478 */     this.defaultScopeModel[62].setRotationPoint(-60.9F, -54.0F, 11.0F);
/*      */     
/* 2480 */     this.defaultScopeModel[63].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2481 */     this.defaultScopeModel[63].setRotationPoint(-61.65F, -54.0F, 11.0F);
/*      */     
/* 2483 */     this.defaultScopeModel[64].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2484 */     this.defaultScopeModel[64].setRotationPoint(-60.4F, -54.0F, 11.0F);
/*      */     
/* 2486 */     this.defaultScopeModel[65].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2487 */     this.defaultScopeModel[65].setRotationPoint(-61.65F, -52.75F, 11.0F);
/*      */     
/* 2489 */     this.defaultScopeModel[66].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2490 */     this.defaultScopeModel[66].setRotationPoint(-60.4F, -52.75F, 11.0F);
/*      */     
/* 2492 */     this.defaultScopeModel[67].addShapeBox(50.0F, -23.0F, -6.5F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2493 */     this.defaultScopeModel[67].setRotationPoint(-72.15F, -63.0F, 5.35F);
/*      */     
/* 2495 */     this.defaultScopeModel[68].addShapeBox(50.0F, -23.0F, -6.5F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F);
/* 2496 */     this.defaultScopeModel[68].setRotationPoint(-72.15F, -63.0F, 7.6F);
/*      */     
/* 2498 */     this.defaultScopeModel[69].addShapeBox(50.0F, -23.0F, -6.5F, 6, 6, 2, 0.0F, -1.75F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2499 */     this.defaultScopeModel[69].setRotationPoint(-72.15F, -63.0F, 3.1F);
/*      */     
/* 2501 */     this.defaultScopeModel[70].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2502 */     this.defaultScopeModel[70].setRotationPoint(-71.0F, -67.5F, 5.0F);
/*      */     
/* 2504 */     this.defaultScopeModel[71].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2505 */     this.defaultScopeModel[71].setRotationPoint(-71.0F, -69.0F, 4.5F);
/*      */     
/* 2507 */     this.defaultScopeModel[72].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2508 */     this.defaultScopeModel[72].setRotationPoint(-71.0F, -70.0F, 4.5F);
/*      */     
/* 2510 */     this.defaultScopeModel[73].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2511 */     this.defaultScopeModel[73].setRotationPoint(-71.0F, -70.0F, 7.5F);
/*      */     
/* 2513 */     this.defaultScopeModel[74].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2514 */     this.defaultScopeModel[74].setRotationPoint(-71.0F, -69.0F, 7.5F);
/*      */     
/* 2516 */     this.defaultScopeModel[75].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2517 */     this.defaultScopeModel[75].setRotationPoint(-71.0F, -70.5F, 5.5F);
/*      */     
/* 2519 */     this.defaultScopeModel[76].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 2520 */     this.defaultScopeModel[76].setRotationPoint(-71.0F, -70.0F, 5.5F);
/*      */     
/* 2522 */     this.defaultScopeModel[77].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2523 */     this.defaultScopeModel[77].setRotationPoint(-71.0F, -70.0F, 6.5F);
/*      */     
/* 2525 */     this.defaultScopeModel[78].addShapeBox(50.0F, -23.0F, -6.5F, 6, 3, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2526 */     this.defaultScopeModel[78].setRotationPoint(-72.0F, -69.5F, 8.5F);
/*      */     
/* 2528 */     this.defaultScopeModel[79].addShapeBox(50.0F, -23.0F, -6.5F, 6, 3, 1, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2529 */     this.defaultScopeModel[79].setRotationPoint(-72.0F, -69.5F, 3.5F);
/*      */     
/* 2531 */     this.defaultScopeModel[80].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2532 */     this.defaultScopeModel[80].setRotationPoint(-71.0F, -68.0F, 6.5F);
/*      */     
/* 2534 */     this.defaultScopeModel[81].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 2535 */     this.defaultScopeModel[81].setRotationPoint(-71.0F, -68.0F, 5.5F);
/*      */     
/* 2537 */     this.defaultScopeModel[82].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2538 */     this.defaultScopeModel[82].setRotationPoint(-69.25F, -67.5F, 5.0F);
/*      */     
/* 2540 */     this.defaultScopeModel[83].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2541 */     this.defaultScopeModel[83].setRotationPoint(-68.5F, -67.5F, 4.5F);
/*      */     
/* 2543 */     this.defaultScopeModel[84].addShapeBox(50.0F, -23.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2544 */     this.defaultScopeModel[84].setRotationPoint(-68.5F, -67.5F, 7.5F);
/*      */     
/* 2546 */     this.defaultScopeModel[85].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F);
/* 2547 */     this.defaultScopeModel[85].setRotationPoint(-67.0F, -67.5F, 7.5F);
/*      */     
/* 2549 */     this.defaultScopeModel[86].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2550 */     this.defaultScopeModel[86].setRotationPoint(-67.0F, -67.5F, 4.5F);
/*      */     
/* 2552 */     this.defaultScopeModel[87].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2553 */     this.defaultScopeModel[87].setRotationPoint(-67.0F, -67.5F, 5.5F);
/*      */     
/* 2555 */     this.defaultScopeModel[88].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2556 */     this.defaultScopeModel[88].setRotationPoint(-68.75F, -67.5F, 6.5F);
/*      */     
/* 2558 */     this.defaultScopeModel[89].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F);
/* 2559 */     this.defaultScopeModel[89].setRotationPoint(-68.75F, -67.5F, 5.5F);
/*      */     
/* 2561 */     this.defaultScopeModel[90].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2562 */     this.defaultScopeModel[90].setRotationPoint(-67.5F, -67.5F, 6.5F);
/*      */     
/* 2564 */     this.defaultScopeModel[91].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F);
/* 2565 */     this.defaultScopeModel[91].setRotationPoint(-67.5F, -67.5F, 5.5F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2570 */     this.ammoModel[0] = new ModelRendererTurbo(this, 369, 153, this.textureX, this.textureY);
/* 2571 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1209, 153, this.textureX, this.textureY);
/* 2572 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1297, 153, this.textureX, this.textureY);
/* 2573 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1489, 153, this.textureX, this.textureY);
/* 2574 */     this.ammoModel[4] = new ModelRendererTurbo(this, 257, 145, this.textureX, this.textureY);
/* 2575 */     this.ammoModel[5] = new ModelRendererTurbo(this, 569, 113, this.textureX, this.textureY);
/* 2576 */     this.ammoModel[6] = new ModelRendererTurbo(this, 633, 129, this.textureX, this.textureY);
/* 2577 */     this.ammoModel[7] = new ModelRendererTurbo(this, 1577, 97, this.textureX, this.textureY);
/* 2578 */     this.ammoModel[8] = new ModelRendererTurbo(this, 897, 89, this.textureX, this.textureY);
/* 2579 */     this.ammoModel[9] = new ModelRendererTurbo(this, 1689, 145, this.textureX, this.textureY);
/* 2580 */     this.ammoModel[10] = new ModelRendererTurbo(this, 1217, 129, this.textureX, this.textureY);
/* 2581 */     this.ammoModel[11] = new ModelRendererTurbo(this, 1921, 97, this.textureX, this.textureY);
/* 2582 */     this.ammoModel[12] = new ModelRendererTurbo(this, 1729, 113, this.textureX, this.textureY);
/* 2583 */     this.ammoModel[13] = new ModelRendererTurbo(this, 1385, 153, this.textureX, this.textureY);
/* 2584 */     this.ammoModel[14] = new ModelRendererTurbo(this, 1897, 81, this.textureX, this.textureY);
/* 2585 */     this.ammoModel[15] = new ModelRendererTurbo(this, 665, 129, this.textureX, this.textureY);
/* 2586 */     this.ammoModel[16] = new ModelRendererTurbo(this, 1249, 81, this.textureX, this.textureY);
/* 2587 */     this.ammoModel[17] = new ModelRendererTurbo(this, 1073, 97, this.textureX, this.textureY);
/* 2588 */     this.ammoModel[18] = new ModelRendererTurbo(this, 1713, 145, this.textureX, this.textureY);
/* 2589 */     this.ammoModel[19] = new ModelRendererTurbo(this, 1529, 81, this.textureX, this.textureY);
/* 2590 */     this.ammoModel[20] = new ModelRendererTurbo(this, 993, 129, this.textureX, this.textureY);
/* 2591 */     this.ammoModel[21] = new ModelRendererTurbo(this, 1289, 81, this.textureX, this.textureY);
/* 2592 */     this.ammoModel[22] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/* 2593 */     this.ammoModel[23] = new ModelRendererTurbo(this, 457, 153, this.textureX, this.textureY);
/* 2594 */     this.ammoModel[24] = new ModelRendererTurbo(this, 1105, 97, this.textureX, this.textureY);
/* 2595 */     this.ammoModel[25] = new ModelRendererTurbo(this, 1569, 153, this.textureX, this.textureY);
/* 2596 */     this.ammoModel[26] = new ModelRendererTurbo(this, 1025, 113, this.textureX, this.textureY);
/* 2597 */     this.ammoModel[27] = new ModelRendererTurbo(this, 1457, 145, this.textureX, this.textureY);
/* 2598 */     this.ammoModel[28] = new ModelRendererTurbo(this, 1657, 97, this.textureX, this.textureY);
/* 2599 */     this.ammoModel[29] = new ModelRendererTurbo(this, 1745, 105, this.textureX, this.textureY);
/* 2600 */     this.ammoModel[30] = new ModelRendererTurbo(this, 1409, 153, this.textureX, this.textureY);
/* 2601 */     this.ammoModel[31] = new ModelRendererTurbo(this, 1625, 153, this.textureX, this.textureY);
/* 2602 */     this.ammoModel[32] = new ModelRendererTurbo(this, 105, 105, this.textureX, this.textureY);
/* 2603 */     this.ammoModel[33] = new ModelRendererTurbo(this, 1425, 121, this.textureX, this.textureY);
/* 2604 */     this.ammoModel[34] = new ModelRendererTurbo(this, 1729, 153, this.textureX, this.textureY);
/* 2605 */     this.ammoModel[35] = new ModelRendererTurbo(this, 1921, 81, this.textureX, this.textureY);
/* 2606 */     this.ammoModel[36] = new ModelRendererTurbo(this, 1129, 137, this.textureX, this.textureY);
/* 2607 */     this.ammoModel[37] = new ModelRendererTurbo(this, 1329, 81, this.textureX, this.textureY);
/* 2608 */     this.ammoModel[38] = new ModelRendererTurbo(this, 345, 129, this.textureX, this.textureY);
/* 2609 */     this.ammoModel[39] = new ModelRendererTurbo(this, 1753, 153, this.textureX, this.textureY);
/* 2610 */     this.ammoModel[40] = new ModelRendererTurbo(this, 1569, 81, this.textureX, this.textureY);
/* 2611 */     this.ammoModel[41] = new ModelRendererTurbo(this, 2017, 137, this.textureX, this.textureY);
/* 2612 */     this.ammoModel[42] = new ModelRendererTurbo(this, 313, 89, this.textureX, this.textureY);
/* 2613 */     this.ammoModel[43] = new ModelRendererTurbo(this, 921, 129, this.textureX, this.textureY);
/* 2614 */     this.ammoModel[44] = new ModelRendererTurbo(this, 1769, 153, this.textureX, this.textureY);
/* 2615 */     this.ammoModel[45] = new ModelRendererTurbo(this, 1121, 97, this.textureX, this.textureY);
/* 2616 */     this.ammoModel[46] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 2617 */     this.ammoModel[47] = new ModelRendererTurbo(this, 1497, 137, this.textureX, this.textureY);
/* 2618 */     this.ammoModel[48] = new ModelRendererTurbo(this, 617, 153, this.textureX, this.textureY);
/* 2619 */     this.ammoModel[49] = new ModelRendererTurbo(this, 665, 153, this.textureX, this.textureY);
/*      */     
/* 2621 */     this.ammoModel[0].addShapeBox(50.0F, -23.0F, -6.5F, 31, 17, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2622 */     this.ammoModel[0].setRotationPoint(-13.0F, -3.0F, 1.0F);
/*      */     
/* 2624 */     this.ammoModel[1].addShapeBox(50.0F, -23.0F, -6.5F, 31, 12, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2625 */     this.ammoModel[1].setRotationPoint(-13.0F, 14.0F, 1.0F);
/*      */     
/* 2627 */     this.ammoModel[2].addShapeBox(50.0F, -23.0F, -6.5F, 31, 21, 11, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -6.0F, 4.0F, 0.0F, 5.0F, -3.5F, 0.0F, 5.0F, -3.5F, 0.0F, -6.0F, 4.0F, 0.0F);
/* 2628 */     this.ammoModel[2].setRotationPoint(-10.0F, 36.0F, 1.0F);
/*      */     
/* 2630 */     this.ammoModel[3].addShapeBox(50.0F, -23.0F, -6.5F, 31, 10, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2631 */     this.ammoModel[3].setRotationPoint(-12.0F, 26.0F, 1.0F);
/*      */     
/* 2633 */     this.ammoModel[4].addShapeBox(50.0F, -23.0F, -6.5F, 24, 5, 1, 0.0F, 2.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, -0.5F, 0.0F, 2.5F, -0.5F);
/* 2634 */     this.ammoModel[4].setRotationPoint(2.0F, 52.0F, 0.5F);
/*      */     
/* 2636 */     this.ammoModel[5].addShapeBox(50.0F, -23.0F, -6.5F, 17, 4, 1, 0.0F, 1.35F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, 1.35F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2637 */     this.ammoModel[5].setRotationPoint(8.0F, 48.0F, 0.5F);
/*      */     
/* 2639 */     this.ammoModel[6].addShapeBox(50.0F, -23.0F, -6.5F, 6, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2640 */     this.ammoModel[6].setRotationPoint(17.0F, 36.0F, 0.5F);
/*      */     
/* 2642 */     this.ammoModel[7].addShapeBox(50.0F, -23.0F, -6.5F, 3, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2643 */     this.ammoModel[7].setRotationPoint(17.0F, 26.0F, 0.5F);
/*      */     
/* 2645 */     this.ammoModel[8].addShapeBox(50.0F, -23.0F, -6.5F, 1, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2646 */     this.ammoModel[8].setRotationPoint(17.0F, 14.0F, 0.5F);
/*      */     
/* 2648 */     this.ammoModel[9].addShapeBox(50.0F, -23.0F, -6.5F, 7, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2649 */     this.ammoModel[9].setRotationPoint(11.0F, -3.0F, 0.5F);
/*      */     
/* 2651 */     this.ammoModel[10].addShapeBox(50.0F, -23.0F, -6.5F, 7, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2652 */     this.ammoModel[10].setRotationPoint(6.0F, 36.0F, 0.5F);
/*      */     
/* 2654 */     this.ammoModel[11].addShapeBox(50.0F, -23.0F, -6.5F, 4, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2655 */     this.ammoModel[11].setRotationPoint(6.0F, 26.0F, 0.5F);
/*      */     
/* 2657 */     this.ammoModel[12].addShapeBox(50.0F, -23.0F, -6.5F, 2, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2658 */     this.ammoModel[12].setRotationPoint(6.0F, 14.0F, 0.5F);
/*      */     
/* 2660 */     this.ammoModel[13].addShapeBox(50.0F, -23.0F, -6.5F, 8, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2661 */     this.ammoModel[13].setRotationPoint(0.0F, -3.0F, 0.5F);
/*      */     
/* 2663 */     this.ammoModel[14].addShapeBox(50.0F, -23.0F, -6.5F, 5, 4, 1, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F);
/* 2664 */     this.ammoModel[14].setRotationPoint(-1.0F, 48.0F, 0.5F);
/*      */     
/* 2666 */     this.ammoModel[15].addShapeBox(50.0F, -23.0F, -6.5F, 5, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2667 */     this.ammoModel[15].setRotationPoint(-2.0F, 36.0F, 0.5F);
/*      */     
/* 2669 */     this.ammoModel[16].addShapeBox(50.0F, -23.0F, -6.5F, 2, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2670 */     this.ammoModel[16].setRotationPoint(-2.0F, 26.0F, 0.5F);
/*      */     
/* 2672 */     this.ammoModel[17].addShapeBox(50.0F, -23.0F, -6.5F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2673 */     this.ammoModel[17].setRotationPoint(-3.0F, 14.0F, 0.5F);
/*      */     
/* 2675 */     this.ammoModel[18].addShapeBox(50.0F, -23.0F, -6.5F, 6, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2676 */     this.ammoModel[18].setRotationPoint(-8.0F, -3.0F, 0.5F);
/*      */     
/* 2678 */     this.ammoModel[19].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F);
/* 2679 */     this.ammoModel[19].setRotationPoint(-6.5F, 48.0F, 0.5F);
/*      */     
/* 2681 */     this.ammoModel[20].addShapeBox(50.0F, -23.0F, -6.5F, 3, 12, 1, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 2682 */     this.ammoModel[20].setRotationPoint(-7.5F, 36.0F, 0.5F);
/*      */     
/* 2684 */     this.ammoModel[21].addShapeBox(50.0F, -23.0F, -6.5F, 1, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F);
/* 2685 */     this.ammoModel[21].setRotationPoint(-7.5F, 26.0F, 0.5F);
/*      */     
/* 2687 */     this.ammoModel[22].addShapeBox(50.0F, -23.0F, -6.5F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2688 */     this.ammoModel[22].setRotationPoint(-8.5F, 14.0F, 0.5F);
/*      */     
/* 2690 */     this.ammoModel[23].addShapeBox(50.0F, -23.0F, -6.5F, 4, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2691 */     this.ammoModel[23].setRotationPoint(-13.5F, -3.0F, 0.5F);
/*      */     
/* 2693 */     this.ammoModel[24].addShapeBox(50.0F, -23.0F, -6.5F, 3, 9, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 3.25F, -1.2F, 0.0F, 3.25F, -1.2F, -0.5F, -1.5F, 0.0F, -0.5F);
/* 2694 */     this.ammoModel[24].setRotationPoint(-5.5F, 52.0F, 0.5F);
/*      */     
/* 2696 */     this.ammoModel[25].addShapeBox(50.0F, -23.0F, -6.5F, 24, 5, 1, 0.0F, 2.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, -0.5F, 0.0F, 2.5F, -0.5F);
/* 2697 */     this.ammoModel[25].setRotationPoint(2.0F, 52.0F, 12.0F);
/*      */     
/* 2699 */     this.ammoModel[26].addShapeBox(50.0F, -23.0F, -6.5F, 17, 4, 1, 0.0F, 1.35F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, 1.35F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2700 */     this.ammoModel[26].setRotationPoint(8.0F, 48.0F, 12.0F);
/*      */     
/* 2702 */     this.ammoModel[27].addShapeBox(50.0F, -23.0F, -6.5F, 6, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2703 */     this.ammoModel[27].setRotationPoint(17.0F, 36.0F, 12.0F);
/*      */     
/* 2705 */     this.ammoModel[28].addShapeBox(50.0F, -23.0F, -6.5F, 3, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2706 */     this.ammoModel[28].setRotationPoint(17.0F, 26.0F, 12.0F);
/*      */     
/* 2708 */     this.ammoModel[29].addShapeBox(50.0F, -23.0F, -6.5F, 1, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2709 */     this.ammoModel[29].setRotationPoint(17.0F, 14.0F, 12.0F);
/*      */     
/* 2711 */     this.ammoModel[30].addShapeBox(50.0F, -23.0F, -6.5F, 7, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2712 */     this.ammoModel[30].setRotationPoint(11.0F, -3.0F, 12.0F);
/*      */     
/* 2714 */     this.ammoModel[31].addShapeBox(50.0F, -23.0F, -6.5F, 7, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2715 */     this.ammoModel[31].setRotationPoint(6.0F, 36.0F, 12.0F);
/*      */     
/* 2717 */     this.ammoModel[32].addShapeBox(50.0F, -23.0F, -6.5F, 4, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2718 */     this.ammoModel[32].setRotationPoint(6.0F, 26.0F, 12.0F);
/*      */     
/* 2720 */     this.ammoModel[33].addShapeBox(50.0F, -23.0F, -6.5F, 2, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2721 */     this.ammoModel[33].setRotationPoint(6.0F, 14.0F, 12.0F);
/*      */     
/* 2723 */     this.ammoModel[34].addShapeBox(50.0F, -23.0F, -6.5F, 8, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2724 */     this.ammoModel[34].setRotationPoint(0.0F, -3.0F, 12.0F);
/*      */     
/* 2726 */     this.ammoModel[35].addShapeBox(50.0F, -23.0F, -6.5F, 5, 4, 1, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F);
/* 2727 */     this.ammoModel[35].setRotationPoint(-1.0F, 48.0F, 12.0F);
/*      */     
/* 2729 */     this.ammoModel[36].addShapeBox(50.0F, -23.0F, -6.5F, 5, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2730 */     this.ammoModel[36].setRotationPoint(-2.0F, 36.0F, 12.0F);
/*      */     
/* 2732 */     this.ammoModel[37].addShapeBox(50.0F, -23.0F, -6.5F, 2, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2733 */     this.ammoModel[37].setRotationPoint(-2.0F, 26.0F, 12.0F);
/*      */     
/* 2735 */     this.ammoModel[38].addShapeBox(50.0F, -23.0F, -6.5F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2736 */     this.ammoModel[38].setRotationPoint(-3.0F, 14.0F, 12.0F);
/*      */     
/* 2738 */     this.ammoModel[39].addShapeBox(50.0F, -23.0F, -6.5F, 6, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2739 */     this.ammoModel[39].setRotationPoint(-8.0F, -3.0F, 12.0F);
/*      */     
/* 2741 */     this.ammoModel[40].addShapeBox(50.0F, -23.0F, -6.5F, 3, 4, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F);
/* 2742 */     this.ammoModel[40].setRotationPoint(-6.5F, 48.0F, 12.0F);
/*      */     
/* 2744 */     this.ammoModel[41].addShapeBox(50.0F, -23.0F, -6.5F, 3, 12, 1, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 2745 */     this.ammoModel[41].setRotationPoint(-7.5F, 36.0F, 12.0F);
/*      */     
/* 2747 */     this.ammoModel[42].addShapeBox(50.0F, -23.0F, -6.5F, 1, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F);
/* 2748 */     this.ammoModel[42].setRotationPoint(-7.5F, 26.0F, 12.0F);
/*      */     
/* 2750 */     this.ammoModel[43].addShapeBox(50.0F, -23.0F, -6.5F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2751 */     this.ammoModel[43].setRotationPoint(-8.5F, 14.0F, 12.0F);
/*      */     
/* 2753 */     this.ammoModel[44].addShapeBox(50.0F, -23.0F, -6.5F, 4, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2754 */     this.ammoModel[44].setRotationPoint(-13.5F, -3.0F, 12.0F);
/*      */     
/* 2756 */     this.ammoModel[45].addShapeBox(50.0F, -23.0F, -6.5F, 3, 9, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 3.25F, -1.2F, 0.0F, 3.25F, -1.2F, -0.5F, -1.5F, 0.0F, -0.5F);
/* 2757 */     this.ammoModel[45].setRotationPoint(-5.5F, 52.0F, 12.0F);
/*      */     
/* 2759 */     this.ammoModel[46].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 12, 0.0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2760 */     this.ammoModel[46].setRotationPoint(5.5F, 51.0F, 0.5F);
/*      */     
/* 2762 */     this.ammoModel[47].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 12, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2763 */     this.ammoModel[47].setRotationPoint(7.25F, 51.0F, 0.5F);
/*      */     
/* 2765 */     this.ammoModel[48].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 12, 0.0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 2766 */     this.ammoModel[48].setRotationPoint(14.25F, 47.0F, 0.5F);
/*      */     
/* 2768 */     this.ammoModel[49].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 12, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2769 */     this.ammoModel[49].setRotationPoint(17.0F, 47.0F, 0.5F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 2774 */     this.slideModel[0] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/* 2775 */     this.slideModel[1] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/* 2776 */     this.slideModel[2] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 2777 */     this.slideModel[3] = new ModelRendererTurbo(this, 1353, 1, this.textureX, this.textureY);
/* 2778 */     this.slideModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 2779 */     this.slideModel[5] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 2780 */     this.slideModel[6] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 2781 */     this.slideModel[7] = new ModelRendererTurbo(this, 1521, 1, this.textureX, this.textureY);
/* 2782 */     this.slideModel[8] = new ModelRendererTurbo(this, 1729, 1, this.textureX, this.textureY);
/* 2783 */     this.slideModel[9] = new ModelRendererTurbo(this, 1769, 1, this.textureX, this.textureY);
/* 2784 */     this.slideModel[10] = new ModelRendererTurbo(this, 1537, 1, this.textureX, this.textureY);
/* 2785 */     this.slideModel[11] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/* 2786 */     this.slideModel[12] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/* 2787 */     this.slideModel[13] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/* 2788 */     this.slideModel[14] = new ModelRendererTurbo(this, 1625, 1, this.textureX, this.textureY);
/* 2789 */     this.slideModel[15] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/* 2790 */     this.slideModel[16] = new ModelRendererTurbo(this, 1233, 1, this.textureX, this.textureY);
/* 2791 */     this.slideModel[17] = new ModelRendererTurbo(this, 1265, 1, this.textureX, this.textureY);
/* 2792 */     this.slideModel[18] = new ModelRendererTurbo(this, 1521, 1, this.textureX, this.textureY);
/* 2793 */     this.slideModel[19] = new ModelRendererTurbo(this, 1641, 1, this.textureX, this.textureY);
/* 2794 */     this.slideModel[20] = new ModelRendererTurbo(this, 1649, 1, this.textureX, this.textureY);
/* 2795 */     this.slideModel[21] = new ModelRendererTurbo(this, 1729, 1, this.textureX, this.textureY);
/* 2796 */     this.slideModel[22] = new ModelRendererTurbo(this, 1745, 1, this.textureX, this.textureY);
/* 2797 */     this.slideModel[23] = new ModelRendererTurbo(this, 1753, 1, this.textureX, this.textureY);
/* 2798 */     this.slideModel[24] = new ModelRendererTurbo(this, 1769, 1, this.textureX, this.textureY);
/* 2799 */     this.slideModel[25] = new ModelRendererTurbo(this, 1785, 1, this.textureX, this.textureY);
/* 2800 */     this.slideModel[26] = new ModelRendererTurbo(this, 1801, 1, this.textureX, this.textureY);
/* 2801 */     this.slideModel[27] = new ModelRendererTurbo(this, 1809, 1, this.textureX, this.textureY);
/* 2802 */     this.slideModel[28] = new ModelRendererTurbo(this, 1817, 1, this.textureX, this.textureY);
/* 2803 */     this.slideModel[29] = new ModelRendererTurbo(this, 1825, 1, this.textureX, this.textureY);
/* 2804 */     this.slideModel[30] = new ModelRendererTurbo(this, 1921, 1, this.textureX, this.textureY);
/* 2805 */     this.slideModel[31] = new ModelRendererTurbo(this, 1929, 1, this.textureX, this.textureY);
/* 2806 */     this.slideModel[32] = new ModelRendererTurbo(this, 1937, 1, this.textureX, this.textureY);
/* 2807 */     this.slideModel[33] = new ModelRendererTurbo(this, 1945, 1, this.textureX, this.textureY);
/* 2808 */     this.slideModel[34] = new ModelRendererTurbo(this, 1993, 1, this.textureX, this.textureY);
/* 2809 */     this.slideModel[35] = new ModelRendererTurbo(this, 2001, 1, this.textureX, this.textureY);
/* 2810 */     this.slideModel[36] = new ModelRendererTurbo(this, 1209, 9, this.textureX, this.textureY);
/* 2811 */     this.slideModel[37] = new ModelRendererTurbo(this, 1257, 9, this.textureX, this.textureY);
/* 2812 */     this.slideModel[38] = new ModelRendererTurbo(this, 1353, 9, this.textureX, this.textureY);
/* 2813 */     this.slideModel[39] = new ModelRendererTurbo(this, 1521, 9, this.textureX, this.textureY);
/* 2814 */     this.slideModel[40] = new ModelRendererTurbo(this, 1625, 9, this.textureX, this.textureY);
/* 2815 */     this.slideModel[41] = new ModelRendererTurbo(this, 1641, 9, this.textureX, this.textureY);
/* 2816 */     this.slideModel[42] = new ModelRendererTurbo(this, 1649, 9, this.textureX, this.textureY);
/* 2817 */     this.slideModel[43] = new ModelRendererTurbo(this, 1849, 161, this.textureX, this.textureY);
/*      */     
/* 2819 */     this.slideModel[0].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2820 */     this.slideModel[0].setRotationPoint(53.5F, -44.25F, 11.5F);
/*      */     
/* 2822 */     this.slideModel[1].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2823 */     this.slideModel[1].setRotationPoint(51.75F, -44.25F, 11.5F);
/*      */     
/* 2825 */     this.slideModel[2].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2826 */     this.slideModel[2].setRotationPoint(55.25F, -44.25F, 11.5F);
/*      */     
/* 2828 */     this.slideModel[3].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2829 */     this.slideModel[3].setRotationPoint(52.0F, -42.5F, 11.5F);
/*      */     
/* 2831 */     this.slideModel[4].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2832 */     this.slideModel[4].setRotationPoint(55.25F, -41.0F, 11.5F);
/*      */     
/* 2834 */     this.slideModel[5].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2835 */     this.slideModel[5].setRotationPoint(53.5F, -40.75F, 11.5F);
/*      */     
/* 2837 */     this.slideModel[6].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2838 */     this.slideModel[6].setRotationPoint(51.75F, -41.0F, 11.5F);
/*      */     
/* 2840 */     this.slideModel[7].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2841 */     this.slideModel[7].setRotationPoint(52.6F, -42.65F, 12.5F);
/*      */     
/* 2843 */     this.slideModel[8].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2844 */     this.slideModel[8].setRotationPoint(52.6F, -41.65F, 12.5F);
/*      */     
/* 2846 */     this.slideModel[9].addShapeBox(50.0F, -23.0F, -6.5F, 3, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2847 */     this.slideModel[9].setRotationPoint(52.6F, -43.65F, 12.5F);
/*      */     
/* 2849 */     this.slideModel[10].addShapeBox(50.0F, -23.0F, -6.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2850 */     this.slideModel[10].setRotationPoint(53.1F, -43.15F, 9.5F);
/*      */     
/* 2852 */     this.slideModel[11].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2853 */     this.slideModel[11].setRotationPoint(53.5F, -44.25F, 18.5F);
/*      */     
/* 2855 */     this.slideModel[12].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2856 */     this.slideModel[12].setRotationPoint(51.75F, -44.25F, 18.5F);
/*      */     
/* 2858 */     this.slideModel[13].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2859 */     this.slideModel[13].setRotationPoint(55.25F, -44.25F, 18.5F);
/*      */     
/* 2861 */     this.slideModel[14].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2862 */     this.slideModel[14].setRotationPoint(52.0F, -42.5F, 18.5F);
/*      */     
/* 2864 */     this.slideModel[15].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2865 */     this.slideModel[15].setRotationPoint(55.25F, -41.0F, 18.5F);
/*      */     
/* 2867 */     this.slideModel[16].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2868 */     this.slideModel[16].setRotationPoint(53.5F, -40.75F, 18.5F);
/*      */     
/* 2870 */     this.slideModel[17].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2871 */     this.slideModel[17].setRotationPoint(51.75F, -41.0F, 18.5F);
/*      */     
/* 2873 */     this.slideModel[18].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2874 */     this.slideModel[18].setRotationPoint(53.5F, -44.25F, 17.5F);
/*      */     
/* 2876 */     this.slideModel[19].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2877 */     this.slideModel[19].setRotationPoint(51.75F, -44.25F, 17.5F);
/*      */     
/* 2879 */     this.slideModel[20].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2880 */     this.slideModel[20].setRotationPoint(55.25F, -44.25F, 17.5F);
/*      */     
/* 2882 */     this.slideModel[21].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2883 */     this.slideModel[21].setRotationPoint(55.25F, -41.0F, 17.5F);
/*      */     
/* 2885 */     this.slideModel[22].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2886 */     this.slideModel[22].setRotationPoint(53.5F, -40.75F, 17.5F);
/*      */     
/* 2888 */     this.slideModel[23].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2889 */     this.slideModel[23].setRotationPoint(51.75F, -41.0F, 17.5F);
/*      */     
/* 2891 */     this.slideModel[24].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2892 */     this.slideModel[24].setRotationPoint(53.5F, -42.5F, 16.5F);
/*      */     
/* 2894 */     this.slideModel[25].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2895 */     this.slideModel[25].setRotationPoint(51.75F, -42.5F, 17.5F);
/*      */     
/* 2897 */     this.slideModel[26].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2898 */     this.slideModel[26].setRotationPoint(55.5F, -42.5F, 17.5F);
/*      */     
/* 2900 */     this.slideModel[27].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F);
/* 2901 */     this.slideModel[27].setRotationPoint(55.5F, -42.5F, 12.5F);
/*      */     
/* 2903 */     this.slideModel[28].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F);
/* 2904 */     this.slideModel[28].setRotationPoint(55.25F, -44.25F, 12.5F);
/*      */     
/* 2906 */     this.slideModel[29].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2907 */     this.slideModel[29].setRotationPoint(53.5F, -42.5F, 12.5F);
/*      */     
/* 2909 */     this.slideModel[30].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2910 */     this.slideModel[30].setRotationPoint(51.75F, -44.25F, 12.5F);
/*      */     
/* 2912 */     this.slideModel[31].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2913 */     this.slideModel[31].setRotationPoint(53.5F, -44.25F, 12.5F);
/*      */     
/* 2915 */     this.slideModel[32].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2916 */     this.slideModel[32].setRotationPoint(51.75F, -42.5F, 12.5F);
/*      */     
/* 2918 */     this.slideModel[33].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F);
/* 2919 */     this.slideModel[33].setRotationPoint(51.75F, -41.0F, 12.5F);
/*      */     
/* 2921 */     this.slideModel[34].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/* 2922 */     this.slideModel[34].setRotationPoint(53.5F, -40.75F, 12.5F);
/*      */     
/* 2924 */     this.slideModel[35].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F);
/* 2925 */     this.slideModel[35].setRotationPoint(55.25F, -41.0F, 12.5F);
/*      */     
/* 2927 */     this.slideModel[36].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2928 */     this.slideModel[36].setRotationPoint(124.0F, -46.0F, 1.0F);
/*      */     
/* 2930 */     this.slideModel[37].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2931 */     this.slideModel[37].setRotationPoint(122.25F, -46.0F, 1.0F);
/*      */     
/* 2933 */     this.slideModel[38].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2934 */     this.slideModel[38].setRotationPoint(125.75F, -46.0F, 1.0F);
/*      */     
/* 2936 */     this.slideModel[39].addShapeBox(50.0F, -23.0F, -6.5F, 4, 1, 2, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2937 */     this.slideModel[39].setRotationPoint(122.5F, -44.25F, 1.0F);
/*      */     
/* 2939 */     this.slideModel[40].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2940 */     this.slideModel[40].setRotationPoint(125.75F, -42.75F, 1.0F);
/*      */     
/* 2942 */     this.slideModel[41].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2943 */     this.slideModel[41].setRotationPoint(124.0F, -42.5F, 1.0F);
/*      */     
/* 2945 */     this.slideModel[42].addShapeBox(50.0F, -23.0F, -6.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2946 */     this.slideModel[42].setRotationPoint(122.25F, -42.75F, 1.0F);
/*      */     
/* 2948 */     this.slideModel[43].addBox(50.0F, -23.0F, -6.5F, 46, 8, 7, 0.0F);
/* 2949 */     this.slideModel[43].setRotationPoint(-25.0F, -34.0F, -1.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelscarl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */