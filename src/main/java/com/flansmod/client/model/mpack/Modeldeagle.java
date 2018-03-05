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
/*      */ public class Modeldeagle
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modeldeagle()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ğ'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 937, 49, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 1329, 57, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 1777, 9, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 1441, 57, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 745, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 801, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 1553, 33, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 1665, 33, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 1737, 65, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 1017, 73, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 1465, 81, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 1081, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1137, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 1193, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1249, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1305, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 1833, 33, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 1889, 33, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 1945, 33, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 2001, 33, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 1481, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 1537, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 1593, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 1657, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 1833, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 1889, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1961, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 1321, 41, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 1361, 65, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1905, 65, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 857, 49, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 1193, 73, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 185, 65, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 1673, 65, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 1417, 73, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 1697, 73, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 1937, 73, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 537, 81, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 585, 81, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 641, 81, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 865, 81, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 1225, 81, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 1961, 81, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 673, 89, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 961, 81, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 737, 89, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 785, 89, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 833, 89, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 1649, 89, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 1721, 89, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 1785, 89, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 1849, 89, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 1993, 89, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 985, 89, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 1313, 89, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 489, 89, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 1017, 97, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 1065, 97, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 1145, 97, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 1193, 97, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 1393, 97, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 1889, 97, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 1689, 97, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 121, 105, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 617, 89, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 937, 89, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 1441, 89, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 713, 97, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 521, 105, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 537, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 1361, 1, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 1465, 105, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 569, 105, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 1569, 105, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 865, 105, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 609, 113, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 737, 113, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 929, 113, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 113, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 1225, 113, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 1297, 113, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 1721, 113, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 1785, 113, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 113, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 1425, 113, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 113, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 1649, 113, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 1849, 113, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 1929, 113, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 1985, 113, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 673, 121, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 121, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 1041, 121, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 1097, 121, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1153, 121, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 1345, 121, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 1889, 121, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 129, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 521, 129, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 129, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 1385, 129, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 1465, 129, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 1529, 129, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 1593, 129, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 1689, 121, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 129, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 1193, 129, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 33, 137, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 225, 137, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 409, 137, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 913, 49, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 2009, 65, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 569, 81, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 561, 137, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 1761, 89, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1465, 41, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 1273, 121, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 593, 137, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 713, 137, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1425, 1, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1681, 1, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1745, 1, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1801, 1, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1857, 1, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 1401, 33, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 137, 41, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 1913, 1, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 1777, 41, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 1393, 73, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 1729, 41, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 1441, 41, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 809, 137, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 905, 137, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 953, 137, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 1225, 137, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 1297, 137, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 1425, 137, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 1633, 137, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 1721, 137, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 649, 137, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 1505, 137, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 1817, 137, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 65, 145, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 985, 145, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 1033, 145, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 1081, 145, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 1129, 145, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1865, 137, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 265, 145, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 1329, 145, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1665, 145, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 1889, 145, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1961, 145, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 1257, 145, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 193, 153, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 369, 153, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 497, 153, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 745, 153, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 1529, 153, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 841, 153, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 1161, 153, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 1385, 153, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1457, 153, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 521, 161, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 665, 161, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 769, 161, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 1705, 169, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 89, 177, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 401, 161, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 593, 161, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 873, 161, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 913, 169, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 1057, 169, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 1193, 169, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1281, 161, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 1417, 161, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 1625, 161, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 1481, 169, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 1865, 169, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1889, 169, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 1961, 169, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 1985, 169, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 1009, 153, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 313, 161, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 1793, 145, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1841, 145, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 369, 177, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 489, 177, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 1153, 177, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 1313, 177, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 1345, 177, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1505, 185, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 1449, 177, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 1657, 177, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 393, 193, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 513, 201, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 649, 201, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 849, 185, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 985, 185, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 1025, 185, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 1273, 193, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 73, 209, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 1057, 209, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1985, 9, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 761, 201, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 889, 185, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 809, 201, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 1425, 17, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 1833, 17, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 745, 1, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 801, 1, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 1889, 17, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 537, 41, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 985, 49, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 1249, 1, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 113, 153, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 1985, 201, this.textureX, this.textureY);
/*      */     
/*  310 */     this.gunModel[0].addShapeBox(51.0F, -25.0F, -15.0F, 13, 6, 20, 0.0F, 0.5F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.5F, 0.9F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  311 */     this.gunModel[0].setRotationPoint(-22.0F, -21.5F, 5.0F);
/*      */     
/*  313 */     this.gunModel[1].addShapeBox(51.0F, -25.0F, -15.0F, 3, 6, 20, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  314 */     this.gunModel[1].setRotationPoint(-9.0F, -21.5F, 5.0F);
/*      */     
/*  316 */     this.gunModel[2].addShapeBox(51.0F, -25.0F, -15.0F, 2, 6, 20, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  317 */     this.gunModel[2].setRotationPoint(-6.0F, -21.5F, 5.0F);
/*      */     
/*  319 */     this.gunModel[3].addShapeBox(51.0F, -25.0F, -15.0F, 1, 10, 20, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  320 */     this.gunModel[3].setRotationPoint(-4.0F, -21.5F, 5.0F);
/*      */     
/*  322 */     this.gunModel[4].addShapeBox(51.0F, -25.0F, -15.0F, 1, 6, 20, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  323 */     this.gunModel[4].setRotationPoint(-3.0F, -17.5F, 5.0F);
/*      */     
/*  325 */     this.gunModel[5].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  326 */     this.gunModel[5].setRotationPoint(-2.0F, -18.5F, 5.0F);
/*      */     
/*  328 */     this.gunModel[6].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  329 */     this.gunModel[6].setRotationPoint(1.75F, -18.5F, 5.0F);
/*      */     
/*  331 */     this.gunModel[7].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  332 */     this.gunModel[7].setRotationPoint(-0.5F, -17.25F, 5.0F);
/*      */     
/*  334 */     this.gunModel[8].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 20, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  335 */     this.gunModel[8].setRotationPoint(3.75F, -17.5F, 5.0F);
/*      */     
/*  337 */     this.gunModel[9].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  338 */     this.gunModel[9].setRotationPoint(1.75F, -10.5F, 5.0F);
/*      */     
/*  340 */     this.gunModel[10].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  341 */     this.gunModel[10].setRotationPoint(-2.0F, -10.5F, 5.0F);
/*      */     
/*  343 */     this.gunModel[11].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 20, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  344 */     this.gunModel[11].setRotationPoint(-0.75F, -10.5F, 5.0F);
/*      */     
/*  346 */     this.gunModel[12].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  347 */     this.gunModel[12].setRotationPoint(3.75F, -12.5F, 5.0F);
/*      */     
/*  349 */     this.gunModel[13].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  350 */     this.gunModel[13].setRotationPoint(4.75F, -13.5F, 5.0F);
/*      */     
/*  352 */     this.gunModel[14].addShapeBox(51.0F, -25.0F, -15.0F, 2, 7, 20, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  353 */     this.gunModel[14].setRotationPoint(4.75F, -20.5F, 5.0F);
/*      */     
/*  355 */     this.gunModel[15].addShapeBox(51.0F, -25.0F, -15.0F, 2, 7, 20, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  356 */     this.gunModel[15].setRotationPoint(6.75F, -20.5F, 5.0F);
/*      */     
/*  358 */     this.gunModel[16].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, 3.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  359 */     this.gunModel[16].setRotationPoint(9.75F, -15.0F, 5.0F);
/*      */     
/*  361 */     this.gunModel[17].addShapeBox(51.0F, -25.0F, -15.0F, 1, 7, 20, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  362 */     this.gunModel[17].setRotationPoint(8.75F, -20.5F, 5.0F);
/*      */     
/*  364 */     this.gunModel[18].addShapeBox(51.0F, -25.0F, -15.0F, 5, 1, 20, 0.0F, 0.0F, 2.9F, 0.0F, 0.25F, 2.9F, 0.0F, 0.25F, 2.9F, 0.0F, 0.0F, 2.9F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  365 */     this.gunModel[18].setRotationPoint(9.75F, -20.5F, 5.0F);
/*      */     
/*  367 */     this.gunModel[19].addShapeBox(51.0F, -25.0F, -15.0F, 8, 1, 20, 0.0F, 0.0F, 1.9F, 0.0F, -3.75F, 1.9F, 0.0F, -3.75F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  368 */     this.gunModel[19].setRotationPoint(15.0F, -20.5F, 5.0F);
/*      */     
/*  370 */     this.gunModel[20].addShapeBox(51.0F, -25.0F, -15.0F, 73, 1, 18, 0.0F, 0.0F, 1.9F, 0.0F, -0.5F, 1.9F, 0.0F, -0.5F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  371 */     this.gunModel[20].setRotationPoint(19.25F, -20.5F, 6.0F);
/*      */     
/*  373 */     this.gunModel[21].addShapeBox(51.0F, -25.0F, -15.0F, 82, 1, 16, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  374 */     this.gunModel[21].setRotationPoint(9.75F, -18.5F, 7.0F);
/*      */     
/*  376 */     this.gunModel[22].addShapeBox(51.0F, -25.0F, -15.0F, 80, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  377 */     this.gunModel[22].setRotationPoint(9.75F, -16.5F, 5.0F);
/*      */     
/*  379 */     this.gunModel[23].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  380 */     this.gunModel[23].setRotationPoint(15.75F, -14.5F, 5.0F);
/*      */     
/*  382 */     this.gunModel[24].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  383 */     this.gunModel[24].setRotationPoint(23.5F, -14.5F, 5.0F);
/*      */     
/*  385 */     this.gunModel[25].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  386 */     this.gunModel[25].setRotationPoint(31.25F, -14.5F, 5.0F);
/*      */     
/*  388 */     this.gunModel[26].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  389 */     this.gunModel[26].setRotationPoint(39.0F, -14.5F, 5.0F);
/*      */     
/*  391 */     this.gunModel[27].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  392 */     this.gunModel[27].setRotationPoint(46.75F, -14.5F, 5.0F);
/*      */     
/*  394 */     this.gunModel[28].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  395 */     this.gunModel[28].setRotationPoint(54.5F, -14.5F, 5.0F);
/*      */     
/*  397 */     this.gunModel[29].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  398 */     this.gunModel[29].setRotationPoint(62.25F, -14.5F, 5.0F);
/*      */     
/*  400 */     this.gunModel[30].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  401 */     this.gunModel[30].setRotationPoint(70.0F, -14.5F, 5.0F);
/*      */     
/*  403 */     this.gunModel[31].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  404 */     this.gunModel[31].setRotationPoint(77.75F, -14.5F, 5.0F);
/*      */     
/*  406 */     this.gunModel[32].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.0F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, -0.25F, -1.0F, -4.0F, -0.25F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  407 */     this.gunModel[32].setRotationPoint(85.5F, -14.5F, 5.0F);
/*      */     
/*  409 */     this.gunModel[33].addShapeBox(51.0F, -25.0F, -15.0F, 3, 13, 12, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  410 */     this.gunModel[33].setRotationPoint(-0.75F, -9.25F, 9.0F);
/*      */     
/*  412 */     this.gunModel[34].addShapeBox(51.0F, -25.0F, -15.0F, 2, 6, 12, 0.0F, -0.25F, 0.25F, 4.0F, 0.5F, 0.25F, 4.0F, 0.5F, 0.25F, 4.0F, -0.25F, 0.25F, 4.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  413 */     this.gunModel[34].setRotationPoint(2.0F, -9.25F, 9.0F);
/*      */     
/*  415 */     this.gunModel[35].addShapeBox(51.0F, -25.0F, -15.0F, 3, 3, 20, 0.0F, -2.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  416 */     this.gunModel[35].setRotationPoint(3.25F, -12.25F, 5.0F);
/*      */     
/*  418 */     this.gunModel[36].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 20, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  419 */     this.gunModel[36].setRotationPoint(5.25F, -13.25F, 5.0F);
/*      */     
/*  421 */     this.gunModel[37].addShapeBox(51.0F, -25.0F, -15.0F, 1, 4, 16, 0.0F, 0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  422 */     this.gunModel[37].setRotationPoint(-1.25F, -10.25F, 7.0F);
/*      */     
/*  424 */     this.gunModel[38].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 12, 0.0F, -0.25F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  425 */     this.gunModel[38].setRotationPoint(-0.75F, 4.0F, 9.0F);
/*      */     
/*  427 */     this.gunModel[39].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 12, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  428 */     this.gunModel[39].setRotationPoint(-0.75F, 3.0F, 9.0F);
/*      */     
/*  430 */     this.gunModel[40].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 12, 0.0F, -0.25F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  431 */     this.gunModel[40].setRotationPoint(-0.75F, 5.0F, 9.0F);
/*      */     
/*  433 */     this.gunModel[41].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 12, 0.0F, -0.25F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/*  434 */     this.gunModel[41].setRotationPoint(-0.75F, 6.0F, 9.0F);
/*      */     
/*  436 */     this.gunModel[42].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 12, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F);
/*  437 */     this.gunModel[42].setRotationPoint(-1.25F, 3.0F, 9.0F);
/*      */     
/*  439 */     this.gunModel[43].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 12, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  440 */     this.gunModel[43].setRotationPoint(-1.25F, 1.0F, 9.0F);
/*      */     
/*  442 */     this.gunModel[44].addShapeBox(51.0F, -25.0F, -15.0F, 18, 3, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  443 */     this.gunModel[44].setRotationPoint(-18.75F, 5.0F, 9.0F);
/*      */     
/*  445 */     this.gunModel[45].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 12, 0.0F, 1.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 1.25F, -0.75F, 0.0F, 2.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 2.5F, -0.75F, 0.0F);
/*  446 */     this.gunModel[45].setRotationPoint(-1.25F, 4.0F, 9.0F);
/*      */     
/*  448 */     this.gunModel[46].addShapeBox(51.0F, -25.0F, -15.0F, 4, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  449 */     this.gunModel[46].setRotationPoint(-22.75F, 5.0F, 9.0F);
/*      */     
/*  451 */     this.gunModel[47].addShapeBox(51.0F, -25.0F, -15.0F, 4, 31, 20, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, -4.0F, 1.25F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.25F, 0.0F, -4.0F, -4.25F, 0.0F, -4.0F, 5.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[47].setRotationPoint(-38.75F, 16.0F, 6.0F);
/*      */     
/*  454 */     this.gunModel[48].addShapeBox(51.0F, -25.0F, -15.0F, 4, 7, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -4.0F, 0.75F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 3.5F, 0.0F, -4.0F, 3.5F, 0.0F, -4.0F, -2.75F, 0.0F, 0.0F);
/*  455 */     this.gunModel[48].setRotationPoint(-43.75F, 47.0F, 5.0F);
/*      */     
/*  457 */     this.gunModel[49].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F);
/*  458 */     this.gunModel[49].setRotationPoint(-40.75F, 54.0F, 5.0F);
/*      */     
/*  460 */     this.gunModel[50].addShapeBox(51.0F, -25.0F, -15.0F, 4, 4, 20, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, -4.0F, 1.75F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F);
/*  461 */     this.gunModel[50].setRotationPoint(-37.75F, 12.0F, 5.0F);
/*      */     
/*  463 */     this.gunModel[51].addShapeBox(51.0F, -25.0F, -15.0F, 4, 3, 20, 0.0F, -1.5F, 0.0F, 0.0F, 3.5F, 0.0F, -4.0F, 3.5F, 0.0F, -4.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F);
/*  464 */     this.gunModel[51].setRotationPoint(-36.25F, 9.0F, 5.0F);
/*      */     
/*  466 */     this.gunModel[52].addShapeBox(51.0F, -25.0F, -15.0F, 4, 2, 20, 0.0F, -0.75F, -0.75F, 0.0F, 4.25F, -0.75F, -4.0F, 4.25F, -0.75F, -4.0F, -0.75F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, -4.0F, 1.5F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F);
/*  467 */     this.gunModel[52].setRotationPoint(-34.25F, 7.0F, 5.0F);
/*      */     
/*  469 */     this.gunModel[53].addShapeBox(51.0F, -25.0F, -15.0F, 4, 2, 21, 0.0F, -2.5F, -0.75F, -0.5F, 3.25F, -0.75F, -4.5F, 3.25F, -0.75F, -4.5F, -2.5F, -0.75F, -0.5F, 0.25F, -0.25F, -0.5F, 3.25F, -0.25F, -4.5F, 3.25F, -0.25F, -4.5F, 0.25F, -0.25F, -0.5F);
/*  470 */     this.gunModel[53].setRotationPoint(-33.25F, 6.0F, 4.5F);
/*      */     
/*  472 */     this.gunModel[54].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 20, 0.0F, -2.0F, -0.75F, 0.0F, 3.5F, -0.75F, -4.0F, 3.5F, -0.75F, -4.0F, -2.0F, -0.75F, 0.0F, 0.25F, -0.25F, 0.0F, 3.5F, -0.25F, -4.0F, 3.5F, -0.25F, -4.0F, 0.25F, -0.25F, 0.0F);
/*  473 */     this.gunModel[54].setRotationPoint(-30.5F, 5.0F, 5.0F);
/*      */     
/*  475 */     this.gunModel[55].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 20, 0.0F, -2.75F, -0.75F, 0.0F, 3.5F, -0.75F, -4.0F, 3.5F, -0.75F, -4.0F, -2.75F, -0.75F, 0.0F, -2.0F, -0.25F, 0.0F, 3.5F, -0.25F, -4.0F, 3.5F, -0.25F, -4.0F, -2.0F, -0.25F, 0.0F);
/*  476 */     this.gunModel[55].setRotationPoint(-30.5F, 4.0F, 5.0F);
/*      */     
/*  478 */     this.gunModel[56].addShapeBox(51.0F, -25.0F, -15.0F, 3, 3, 12, 0.0F, 0.0F, 2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  479 */     this.gunModel[56].setRotationPoint(-26.0F, 5.0F, 9.0F);
/*      */     
/*  481 */     this.gunModel[57].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -2.75F, -1.0F, 0.0F, 3.5F, -1.0F, -4.0F, 3.5F, -1.0F, -4.0F, -2.75F, -1.0F, 0.0F, -2.75F, -0.25F, 0.0F, 3.5F, -0.25F, -4.0F, 3.5F, -0.25F, -4.0F, -2.75F, -0.25F, 0.0F);
/*  482 */     this.gunModel[57].setRotationPoint(-30.5F, 2.0F, 5.0F);
/*      */     
/*  484 */     this.gunModel[58].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 20, 0.0F, -2.75F, -1.0F, 0.0F, 2.75F, -1.0F, -4.0F, 2.75F, -1.0F, -4.0F, -2.75F, -1.0F, 0.0F, -2.75F, 0.0F, 0.0F, 3.5F, 0.0F, -4.0F, 3.5F, 0.0F, -4.0F, -2.75F, 0.0F, 0.0F);
/*  485 */     this.gunModel[58].setRotationPoint(-30.5F, 1.0F, 5.0F);
/*      */     
/*  487 */     this.gunModel[59].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -1.0F, -1.0F, 0.0F, 2.0F, -1.0F, -4.0F, 2.0F, -1.0F, -4.0F, -1.0F, -1.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.75F, 0.0F, -4.0F, 2.75F, 0.0F, -4.0F, -2.75F, 0.0F, 0.0F);
/*  488 */     this.gunModel[59].setRotationPoint(-30.5F, -1.0F, 5.0F);
/*      */     
/*  490 */     this.gunModel[60].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 20, 0.0F, -1.0F, -1.0F, 0.0F, 2.0F, -1.0F, -4.0F, 2.0F, -1.0F, -4.0F, -1.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F);
/*  491 */     this.gunModel[60].setRotationPoint(-31.5F, -2.0F, 5.0F);
/*      */     
/*  493 */     this.gunModel[61].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -1.0F, -4.0F, 2.0F, -1.0F, -4.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F);
/*  494 */     this.gunModel[61].setRotationPoint(-32.5F, -4.0F, 5.0F);
/*      */     
/*  496 */     this.gunModel[62].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -0.5F, -1.0F, 0.0F, 2.75F, -1.0F, -4.0F, 2.75F, -1.0F, -4.0F, -0.5F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F);
/*  497 */     this.gunModel[62].setRotationPoint(-33.5F, -6.0F, 5.0F);
/*      */     
/*  499 */     this.gunModel[63].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -0.75F, -1.0F, 0.0F, 3.25F, -1.0F, -4.0F, 3.25F, -1.0F, -4.0F, -0.75F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, -4.0F, 3.25F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F);
/*  500 */     this.gunModel[63].setRotationPoint(-34.0F, -8.0F, 5.0F);
/*      */     
/*  502 */     this.gunModel[64].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -1.0F, -1.0F, 0.0F, 3.75F, -1.0F, -4.0F, 3.75F, -1.0F, -4.0F, -1.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 3.25F, 0.0F, -4.0F, 3.25F, 0.0F, -4.0F, -0.75F, 0.0F, 0.0F);
/*  503 */     this.gunModel[64].setRotationPoint(-34.0F, -10.0F, 5.0F);
/*      */     
/*  505 */     this.gunModel[65].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -1.5F, -1.0F, 0.0F, 4.25F, -1.0F, -4.0F, 4.25F, -1.0F, -4.0F, -1.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.25F, 0.0F, -4.0F, 3.25F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F);
/*  506 */     this.gunModel[65].setRotationPoint(-33.5F, -12.0F, 5.0F);
/*      */     
/*  508 */     this.gunModel[66].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -2.0F, -1.0F, 0.0F, 5.5F, -1.0F, -4.0F, 5.5F, -1.0F, -4.0F, -2.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.25F, 0.0F, -4.0F, 3.25F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F);
/*  509 */     this.gunModel[66].setRotationPoint(-32.5F, -14.0F, 5.0F);
/*      */     
/*  511 */     this.gunModel[67].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, -2.0F, -1.0F, 0.0F, 5.5F, -1.0F, -4.0F, 5.5F, -1.0F, -4.0F, -2.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F);
/*  512 */     this.gunModel[67].setRotationPoint(-31.0F, -15.0F, 5.0F);
/*      */     
/*  514 */     this.gunModel[68].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 20, 0.0F, -4.0F, -1.0F, 0.0F, 6.5F, -1.0F, -4.0F, 6.5F, -1.0F, -4.0F, -4.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F);
/*  515 */     this.gunModel[68].setRotationPoint(-29.5F, -16.0F, 5.0F);
/*      */     
/*  517 */     this.gunModel[69].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 21, 0.0F, -8.0F, -1.0F, -0.5F, 6.5F, -1.0F, -4.0F, 6.5F, -1.0F, -4.0F, -8.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, -0.5F, 0.0F, -0.5F);
/*  518 */     this.gunModel[69].setRotationPoint(-26.0F, -17.0F, 4.5F);
/*      */     
/*  520 */     this.gunModel[70].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 20, 0.0F, 5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, -1.0F, 0.0F, -8.0F, -1.0F, 0.0F, -8.0F, -1.0F, 0.0F, 5.0F, -1.0F, 0.0F);
/*  521 */     this.gunModel[70].setRotationPoint(-20.5F, -16.0F, 5.0F);
/*      */     
/*  523 */     this.gunModel[71].addShapeBox(51.0F, -25.0F, -15.0F, 24, 2, 20, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  524 */     this.gunModel[71].setRotationPoint(-46.5F, -21.5F, 5.0F);
/*      */     
/*  526 */     this.gunModel[72].addShapeBox(51.0F, -25.0F, -15.0F, 32, 4, 20, 0.0F, 0.0F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  527 */     this.gunModel[72].setRotationPoint(-53.75F, -18.5F, 5.0F);
/*      */     
/*  529 */     this.gunModel[73].addShapeBox(51.0F, -25.0F, -15.0F, 2, 7, 20, 0.0F, 0.25F, 0.9F, 0.0F, 0.75F, 0.9F, 0.0F, 0.75F, 0.9F, 0.0F, 0.25F, 0.9F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  530 */     this.gunModel[73].setRotationPoint(-56.5F, -21.5F, 5.0F);
/*      */     
/*  532 */     this.gunModel[74].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  533 */     this.gunModel[74].setRotationPoint(-55.5F, -14.25F, 5.0F);
/*      */     
/*  535 */     this.gunModel[75].addShapeBox(51.0F, -25.0F, -15.0F, 18, 1, 20, 0.0F, 0.0F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  536 */     this.gunModel[75].setRotationPoint(-53.75F, -14.25F, 5.0F);
/*      */     
/*  538 */     this.gunModel[76].addShapeBox(51.0F, -25.0F, -15.0F, 6, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  539 */     this.gunModel[76].setRotationPoint(-35.0F, -14.25F, 5.0F);
/*      */     
/*  541 */     this.gunModel[77].addShapeBox(51.0F, -25.0F, -15.0F, 8, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  542 */     this.gunModel[77].setRotationPoint(-35.0F, -15.25F, 5.0F);
/*      */     
/*  544 */     this.gunModel[78].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, 4.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F);
/*  545 */     this.gunModel[78].setRotationPoint(-31.0F, -13.0F, 5.0F);
/*      */     
/*  547 */     this.gunModel[79].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 3.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F);
/*  548 */     this.gunModel[79].setRotationPoint(-32.5F, -11.0F, 5.0F);
/*      */     
/*  550 */     this.gunModel[80].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, -1.0F, -1.0F, 0.0F, 2.5F, -1.0F, 0.0F, 2.5F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[80].setRotationPoint(-36.5F, -10.0F, 5.0F);
/*      */     
/*  553 */     this.gunModel[81].addShapeBox(51.0F, -25.0F, -15.0F, 2, 3, 20, 0.0F, 1.95F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 2.3F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 2.3F, -1.0F, 0.0F);
/*  554 */     this.gunModel[81].setRotationPoint(-34.0F, -7.0F, 5.0F);
/*      */     
/*  556 */     this.gunModel[82].addShapeBox(51.0F, -25.0F, -15.0F, 2, 3, 20, 0.0F, 2.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.3F, 0.0F, 0.0F, 2.7F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 2.7F, -1.0F, 0.0F);
/*  557 */     this.gunModel[82].setRotationPoint(-34.0F, -5.0F, 5.0F);
/*      */     
/*  559 */     this.gunModel[83].addShapeBox(51.0F, -25.0F, -15.0F, 4, 3, 20, 0.0F, 2.2F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.2F, 0.0F, 0.0F, 2.55F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.55F, -1.0F, 0.0F);
/*  560 */     this.gunModel[83].setRotationPoint(-34.5F, -3.0F, 5.0F);
/*      */     
/*  562 */     this.gunModel[84].addShapeBox(51.0F, -25.0F, -15.0F, 6, 2, 20, 0.0F, 2.55F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.55F, 0.0F, 0.0F, 2.75F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 2.75F, -1.0F, 0.0F);
/*  563 */     this.gunModel[84].setRotationPoint(-34.5F, -1.0F, 5.0F);
/*      */     
/*  565 */     this.gunModel[85].addShapeBox(51.0F, -25.0F, -15.0F, 8, 3, 20, 0.0F, 2.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.85F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 2.85F, -1.0F, 0.0F);
/*  566 */     this.gunModel[85].setRotationPoint(-34.75F, 0.0F, 5.0F);
/*      */     
/*  568 */     this.gunModel[86].addShapeBox(51.0F, -25.0F, -15.0F, 11, 3, 20, 0.0F, -0.9F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.35F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F);
/*  569 */     this.gunModel[86].setRotationPoint(-38.5F, 2.0F, 5.0F);
/*      */     
/*  571 */     this.gunModel[87].addShapeBox(51.0F, -25.0F, -15.0F, 9, 2, 20, 0.0F, 3.15F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, 3.15F, -0.25F, 0.0F, 3.3F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, 3.3F, -0.75F, 0.0F);
/*  572 */     this.gunModel[87].setRotationPoint(-35.0F, 4.5F, 5.0F);
/*      */     
/*  574 */     this.gunModel[88].addShapeBox(51.0F, -25.0F, -15.0F, 6, 2, 20, 0.0F, 3.3F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 3.3F, -0.25F, 0.0F, 3.5F, -0.75F, 0.0F, -1.75F, -0.75F, 0.0F, -1.75F, -0.75F, 0.0F, 3.5F, -0.75F, 0.0F);
/*  575 */     this.gunModel[88].setRotationPoint(-35.0F, 5.5F, 5.0F);
/*      */     
/*  577 */     this.gunModel[89].addShapeBox(51.0F, -25.0F, -15.0F, 4, 2, 20, 0.0F, 3.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 3.25F, -0.25F, 0.0F, 3.45F, -0.75F, 0.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.75F, 0.0F, 3.45F, -0.75F, 0.0F);
/*  578 */     this.gunModel[89].setRotationPoint(-35.25F, 6.5F, 5.0F);
/*      */     
/*  580 */     this.gunModel[90].addShapeBox(51.0F, -25.0F, -15.0F, 5, 2, 20, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.45F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, 0.45F, -0.75F, 0.0F);
/*  581 */     this.gunModel[90].setRotationPoint(-38.5F, 7.75F, 5.0F);
/*      */     
/*  583 */     this.gunModel[91].addShapeBox(51.0F, -25.0F, -15.0F, 3, 3, 20, 0.0F, 0.7F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/*  584 */     this.gunModel[91].setRotationPoint(-38.25F, 9.0F, 5.0F);
/*      */     
/*  586 */     this.gunModel[92].addShapeBox(51.0F, -25.0F, -15.0F, 2, 4, 20, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  587 */     this.gunModel[92].setRotationPoint(-39.25F, 12.0F, 5.0F);
/*      */     
/*  589 */     this.gunModel[93].addShapeBox(51.0F, -25.0F, -15.0F, 1, 31, 20, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F);
/*  590 */     this.gunModel[93].setRotationPoint(-40.5F, 16.0F, 5.0F);
/*      */     
/*  592 */     this.gunModel[94].addShapeBox(51.0F, -25.0F, -15.0F, 1, 59, 11, 0.0F, -1.0F, 0.0F, 2.5F, 1.75F, 0.0F, -0.5F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 10.0F, 0.0F, 2.5F, -9.25F, 0.0F, -0.5F, -9.25F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[94].setRotationPoint(-38.5F, -8.0F, 4.5F);
/*      */     
/*  595 */     this.gunModel[95].addShapeBox(51.0F, -25.0F, -15.0F, 2, 3, 20, 0.0F, 0.0F, 0.0F, 3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F);
/*  596 */     this.gunModel[95].setRotationPoint(-37.5F, -11.0F, 5.0F);
/*      */     
/*  598 */     this.gunModel[96].addShapeBox(51.0F, -25.0F, -15.0F, 18, 1, 20, 0.0F, 0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 3.0F);
/*  599 */     this.gunModel[96].setRotationPoint(-55.25F, -12.0F, 5.0F);
/*      */     
/*  601 */     this.gunModel[97].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F);
/*  602 */     this.gunModel[97].setRotationPoint(-37.5F, -12.0F, 5.0F);
/*      */     
/*  604 */     this.gunModel[98].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, -0.5F, 2.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -1.25F, 3.0F, -0.25F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F, -0.5F, -1.25F, 3.0F);
/*  605 */     this.gunModel[98].setRotationPoint(-57.25F, -12.0F, 5.0F);
/*      */     
/*  607 */     this.gunModel[99].addShapeBox(51.0F, -25.0F, -15.0F, 2, 5, 20, 0.0F, 0.0F, 1.0F, 3.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, 3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F);
/*  608 */     this.gunModel[99].setRotationPoint(-58.5F, -19.0F, 5.0F);
/*      */     
/*  610 */     this.gunModel[100].addShapeBox(51.0F, -25.0F, -15.0F, 6, 1, 20, 0.0F, 0.5F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F);
/*  611 */     this.gunModel[100].setRotationPoint(-63.5F, -21.0F, 5.0F);
/*      */     
/*  613 */     this.gunModel[101].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F);
/*  614 */     this.gunModel[101].setRotationPoint(-58.5F, -21.0F, 5.0F);
/*      */     
/*  616 */     this.gunModel[102].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, 0.75F, 3.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 3.0F, 0.0F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  617 */     this.gunModel[102].setRotationPoint(-58.5F, -13.25F, 5.0F);
/*      */     
/*  619 */     this.gunModel[103].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 21, 0.0F, 0.0F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 2.5F, -0.75F, 0.0F, 2.5F, 0.5F, 0.0F, -0.5F);
/*  620 */     this.gunModel[103].setRotationPoint(-65.25F, -21.0F, 4.5F);
/*      */     
/*  622 */     this.gunModel[104].addShapeBox(51.0F, -25.0F, -15.0F, 2, 22, 20, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, 0.75F, 3.0F, -0.25F, 0.75F, 3.0F, 0.0F, 0.75F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 3.0F, -7.0F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[104].setRotationPoint(-65.75F, -19.25F, 5.0F);
/*      */     
/*  625 */     this.gunModel[105].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 20, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F);
/*  626 */     this.gunModel[105].setRotationPoint(-36.5F, -8.0F, 5.0F);
/*      */     
/*  628 */     this.gunModel[106].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 20, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  629 */     this.gunModel[106].setRotationPoint(-36.5F, -9.0F, 5.0F);
/*      */     
/*  631 */     this.gunModel[107].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 20, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  632 */     this.gunModel[107].setRotationPoint(-36.5F, -11.0F, 5.0F);
/*      */     
/*  634 */     this.gunModel[108].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 20, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  635 */     this.gunModel[108].setRotationPoint(-36.5F, -13.0F, 5.0F);
/*      */     
/*  637 */     this.gunModel[109].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F);
/*  638 */     this.gunModel[109].setRotationPoint(-57.25F, -14.25F, 5.0F);
/*      */     
/*  640 */     this.gunModel[110].addShapeBox(51.0F, -25.0F, -15.0F, 7, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[110].setRotationPoint(-25.75F, -15.25F, 12.0F);
/*      */     
/*  643 */     this.gunModel[111].addShapeBox(51.0F, -25.0F, -15.0F, 6, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  644 */     this.gunModel[111].setRotationPoint(-25.75F, -13.0F, 12.0F);
/*      */     
/*  646 */     this.gunModel[112].addShapeBox(51.0F, -25.0F, -15.0F, 5, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  647 */     this.gunModel[112].setRotationPoint(-25.75F, -11.0F, 12.0F);
/*      */     
/*  649 */     this.gunModel[113].addShapeBox(51.0F, -25.0F, -15.0F, 5, 4, 6, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  650 */     this.gunModel[113].setRotationPoint(-25.75F, -9.0F, 12.0F);
/*      */     
/*  652 */     this.gunModel[114].addShapeBox(51.0F, -25.0F, -15.0F, 5, 2, 6, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  653 */     this.gunModel[114].setRotationPoint(-25.75F, -5.0F, 12.0F);
/*      */     
/*  655 */     this.gunModel[115].addShapeBox(51.0F, -25.0F, -15.0F, 5, 2, 6, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  656 */     this.gunModel[115].setRotationPoint(-25.25F, -3.0F, 12.0F);
/*      */     
/*  658 */     this.gunModel[116].addShapeBox(51.0F, -25.0F, -15.0F, 5, 2, 6, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  659 */     this.gunModel[116].setRotationPoint(-24.25F, -1.0F, 12.0F);
/*      */     
/*  661 */     this.gunModel[117].addShapeBox(51.0F, -25.0F, -15.0F, 5, 2, 6, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  662 */     this.gunModel[117].setRotationPoint(-23.25F, 1.0F, 12.0F);
/*      */     
/*  664 */     this.gunModel[118].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  665 */     this.gunModel[118].setRotationPoint(-20.25F, 3.0F, 12.0F);
/*      */     
/*  667 */     this.gunModel[119].addShapeBox(51.0F, -25.0F, -15.0F, 26, 1, 22, 0.0F, 0.0F, 0.9F, 0.0F, 0.75F, 0.9F, 0.0F, 0.75F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  668 */     this.gunModel[119].setRotationPoint(-83.5F, -21.5F, 4.0F);
/*      */     
/*  670 */     this.gunModel[120].addShapeBox(51.0F, -25.0F, -15.0F, 6, 4, 21, 0.0F, 0.25F, 0.9F, 0.0F, 1.0F, 0.9F, 0.0F, 1.0F, 0.9F, 0.0F, 0.25F, 0.9F, 0.0F, 0.25F, -1.75F, 0.0F, 1.0F, -1.75F, 0.0F, 1.0F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F);
/*  671 */     this.gunModel[120].setRotationPoint(-53.5F, -21.5F, 5.0F);
/*      */     
/*  673 */     this.gunModel[121].addShapeBox(51.0F, -25.0F, -15.0F, 28, 2, 20, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  674 */     this.gunModel[121].setRotationPoint(-53.75F, -15.5F, 5.0F);
/*      */     
/*  676 */     this.gunModel[122].addShapeBox(51.0F, -25.0F, -15.0F, 18, 1, 20, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F);
/*  677 */     this.gunModel[122].setRotationPoint(-83.75F, -21.75F, 5.0F);
/*      */     
/*  679 */     this.gunModel[123].addShapeBox(51.0F, -25.0F, -15.0F, 18, 1, 20, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  680 */     this.gunModel[123].setRotationPoint(-83.75F, -20.0F, 5.0F);
/*      */     
/*  682 */     this.gunModel[124].addShapeBox(51.0F, -25.0F, -15.0F, 18, 1, 20, 0.0F, -0.25F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  683 */     this.gunModel[124].setRotationPoint(-83.75F, -19.0F, 5.0F);
/*      */     
/*  685 */     this.gunModel[125].addShapeBox(51.0F, -25.0F, -15.0F, 18, 1, 20, 0.0F, -0.25F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  686 */     this.gunModel[125].setRotationPoint(-83.75F, -18.0F, 5.0F);
/*      */     
/*  688 */     this.gunModel[126].addShapeBox(51.0F, -25.0F, -15.0F, 17, 1, 20, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  689 */     this.gunModel[126].setRotationPoint(-82.75F, -17.0F, 5.0F);
/*      */     
/*  691 */     this.gunModel[127].addShapeBox(51.0F, -25.0F, -15.0F, 15, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  692 */     this.gunModel[127].setRotationPoint(-80.75F, -16.0F, 5.0F);
/*      */     
/*  694 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 13, 1, 20, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  695 */     this.gunModel[''].setRotationPoint(-78.75F, -15.0F, 5.0F);
/*      */     
/*  697 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 12, 1, 20, 0.0F, -0.5F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  698 */     this.gunModel[''].setRotationPoint(-77.75F, -14.0F, 5.0F);
/*      */     
/*  700 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 12, 1, 20, 0.0F, -1.25F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  701 */     this.gunModel[''].setRotationPoint(-77.75F, -13.0F, 5.0F);
/*      */     
/*  703 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 11, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/*  704 */     this.gunModel[''].setRotationPoint(-76.75F, -12.0F, 5.0F);
/*      */     
/*  706 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 10, 1, 20, 0.0F, -0.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.05F, 0.0F, 0.0F, -3.05F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  707 */     this.gunModel[''].setRotationPoint(-75.75F, -11.0F, 5.0F);
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 9, 1, 20, 0.0F, -0.25F, 0.0F, 0.0F, -3.05F, 0.0F, 0.0F, -3.05F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  710 */     this.gunModel[''].setRotationPoint(-74.75F, -10.0F, 5.0F);
/*      */     
/*  712 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 8, 1, 20, 0.0F, 0.25F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.65F, 0.0F, 0.0F, -3.65F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  713 */     this.gunModel[''].setRotationPoint(-73.75F, -9.0F, 5.0F);
/*      */     
/*  715 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, 0.25F, 0.0F, 0.0F, -3.15F, 0.0F, 0.0F, -3.15F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  716 */     this.gunModel[''].setRotationPoint(-73.25F, -8.0F, 5.0F);
/*      */     
/*  718 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.8F, 0.0F, 0.0F, -3.8F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  719 */     this.gunModel[''].setRotationPoint(-73.25F, -7.0F, 5.0F);
/*      */     
/*  721 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -0.25F, 0.0F, 0.0F, -3.8F, 0.0F, 0.0F, -3.8F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -4.1F, 0.0F, 0.0F, -4.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  722 */     this.gunModel[''].setRotationPoint(-73.25F, -6.0F, 5.0F);
/*      */     
/*  724 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 7, 20, 0.0F, -0.5F, 0.0F, 0.0F, -4.1F, 0.0F, 0.0F, -4.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  725 */     this.gunModel[''].setRotationPoint(-73.25F, -5.0F, 5.0F);
/*      */     
/*  727 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 4, 20, 0.0F, -3.75F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.75F, 0.0F, -5.0F, -3.75F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.75F, 0.0F, -5.0F);
/*  728 */     this.gunModel[''].setRotationPoint(-79.25F, -5.0F, 5.0F);
/*      */     
/*  730 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 2, 20, 0.0F, -3.75F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.75F, 0.0F, -5.0F, -3.75F, -0.5F, -5.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.75F, -0.5F, -5.0F);
/*  731 */     this.gunModel[''].setRotationPoint(-79.25F, -1.0F, 5.0F);
/*      */     
/*  733 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -3.75F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.75F, 0.0F, -5.0F, -3.25F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.25F, 0.0F, -5.0F);
/*  734 */     this.gunModel[''].setRotationPoint(-79.25F, 0.5F, 5.0F);
/*      */     
/*  736 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -3.25F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.25F, 0.0F, -5.0F, -4.75F, -0.5F, -5.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -4.75F, -0.5F, -5.0F);
/*  737 */     this.gunModel[''].setRotationPoint(-79.25F, 1.5F, 5.0F);
/*      */     
/*  739 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -3.65F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.65F, 0.0F, -5.0F, -4.0F, 0.0F, -5.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -4.0F, 0.0F, -5.0F);
/*  740 */     this.gunModel[''].setRotationPoint(-79.5F, -6.0F, 5.0F);
/*      */     
/*  742 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -3.75F, 0.0F, -5.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.75F, 0.0F, -5.0F, -4.15F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.15F, 0.0F, -5.0F);
/*  743 */     this.gunModel[''].setRotationPoint(-80.0F, -7.0F, 5.0F);
/*      */     
/*  745 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 6, 1, 20, 0.0F, -2.85F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.85F, 0.0F, -5.0F, -3.25F, 0.0F, -5.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.25F, 0.0F, -5.0F);
/*  746 */     this.gunModel[''].setRotationPoint(-79.5F, -8.0F, 5.0F);
/*      */     
/*  748 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 6, 1, 20, 0.0F, -2.65F, 0.0F, -5.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.65F, 0.0F, -5.0F, -3.1F, 0.0F, -5.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.1F, 0.0F, -5.0F);
/*  749 */     this.gunModel[''].setRotationPoint(-79.75F, -9.0F, 5.0F);
/*      */     
/*  751 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -2.95F, 0.0F, -5.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.95F, 0.0F, -5.0F, -3.65F, 0.0F, -5.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.65F, 0.0F, -5.0F);
/*  752 */     this.gunModel[''].setRotationPoint(-80.75F, -10.0F, 5.0F);
/*      */     
/*  754 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -2.15F, 0.0F, -5.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -2.15F, 0.0F, -5.0F, -2.95F, 0.0F, -5.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.95F, 0.0F, -5.0F);
/*  755 */     this.gunModel[''].setRotationPoint(-80.75F, -11.0F, 5.0F);
/*      */     
/*  757 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -1.4F, 0.0F, -5.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.4F, 0.0F, -5.0F, -2.4F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.4F, 0.0F, -5.0F);
/*  758 */     this.gunModel[''].setRotationPoint(-81.0F, -12.0F, 5.0F);
/*      */     
/*  760 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, -0.8F, 0.0F, -5.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.8F, 0.0F, -5.0F, -1.9F, 0.0F, -5.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.9F, 0.0F, -5.0F);
/*  761 */     this.gunModel[''].setRotationPoint(-81.5F, -13.0F, 5.0F);
/*      */     
/*  763 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 6, 1, 20, 0.0F, 0.1F, 0.0F, -5.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.1F, 0.0F, -5.0F, -1.3F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.3F, 0.0F, -5.0F);
/*  764 */     this.gunModel[''].setRotationPoint(-82.0F, -14.0F, 5.0F);
/*      */     
/*  766 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 20, 0.0F, 0.15F, 0.0F, -5.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.15F, 0.0F, -5.0F, -1.65F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.65F, 0.0F, -5.0F);
/*  767 */     this.gunModel[''].setRotationPoint(-83.75F, -15.0F, 5.0F);
/*      */     
/*  769 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 8, 1, 20, 0.0F, 1.65F, 0.0F, -5.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.65F, 0.0F, -5.0F, -1.35F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.35F, 0.0F, -5.0F);
/*  770 */     this.gunModel[''].setRotationPoint(-85.25F, -16.0F, 5.0F);
/*      */     
/*  772 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 10, 1, 20, 0.0F, -1.35F, 0.0F, -3.35F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.35F, 0.0F, -3.35F, -1.35F, 0.0F, -5.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.35F, 0.0F, -5.0F);
/*  773 */     this.gunModel[''].setRotationPoint(-88.25F, -17.0F, 5.0F);
/*      */     
/*  775 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 6, 1, 20, 0.0F, -0.1F, 0.0F, -1.7F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.1F, 0.0F, -1.7F, -0.1F, 0.0F, -3.35F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.1F, 0.0F, -3.35F);
/*  776 */     this.gunModel[''].setRotationPoint(-87.0F, -18.0F, 5.0F);
/*      */     
/*  778 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  779 */     this.gunModel[''].setRotationPoint(-85.5F, -19.0F, 5.0F);
/*      */     
/*  781 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -1.7F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.1F, 0.0F, -1.7F);
/*  782 */     this.gunModel[''].setRotationPoint(-87.0F, -19.0F, 5.0F);
/*      */     
/*  784 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F);
/*  785 */     this.gunModel[''].setRotationPoint(-85.5F, -19.0F, 5.0F);
/*      */     
/*  787 */     this.gunModel[''].addShapeBox(51.0F, -25.0F, -15.0F, 4, 3, 20, 0.0F, -0.1F, 0.4F, -2.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.1F, 0.4F, -2.0F, -0.1F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, -2.0F);
/*  788 */     this.gunModel[''].setRotationPoint(-92.0F, -22.0F, 5.0F);
/*      */     
/*  790 */     this.gunModel[' '].addShapeBox(51.0F, -25.0F, -15.0F, 9, 3, 16, 0.0F, -0.1F, -1.85F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.1F, -1.85F, 0.0F, -0.1F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F);
/*  791 */     this.gunModel[' '].setRotationPoint(-100.4F, -22.0F, 7.0F);
/*      */     
/*  793 */     this.gunModel['¡'].addShapeBox(51.0F, -25.0F, -15.0F, 5, 3, 18, 0.0F, -0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -5.0F, 0.1F, 0.0F, -5.0F, 0.1F, 0.0F, -5.0F, -0.1F, 0.0F, -5.0F);
/*  794 */     this.gunModel['¡'].setRotationPoint(-92.0F, -19.0F, 6.0F);
/*      */     
/*  796 */     this.gunModel['¢'].addShapeBox(51.0F, -25.0F, -15.0F, 8, 3, 18, 0.0F, 0.3F, 0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.3F, 0.5F, 0.0F, 0.3F, 0.0F, -5.0F, 0.1F, 0.0F, -5.0F, 0.1F, 0.0F, -5.0F, 0.3F, 0.0F, -5.0F);
/*  797 */     this.gunModel['¢'].setRotationPoint(-100.0F, -19.0F, 6.0F);
/*      */     
/*  799 */     this.gunModel['£'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 3, 18, 0.0F, -0.1F, 0.5F, -1.0F, 0.2F, 0.5F, 0.0F, 0.2F, 0.5F, 0.0F, -0.1F, 0.5F, -1.0F, -0.1F, 0.0F, -5.0F, 0.2F, 0.0F, -5.0F, 0.2F, 0.0F, -5.0F, -0.1F, 0.0F, -5.0F);
/*  800 */     this.gunModel['£'].setRotationPoint(-103.5F, -19.0F, 6.0F);
/*      */     
/*  802 */     this.gunModel['¤'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 16, 0.0F, 0.0F, -1.5F, -0.5F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F);
/*  803 */     this.gunModel['¤'].setRotationPoint(-101.8F, -21.0F, 7.0F);
/*      */     
/*  805 */     this.gunModel['¥'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 18, 0.0F, -0.85F, 0.0F, -2.75F, 0.1F, 0.0F, -2.75F, 0.1F, 0.0F, -2.75F, -0.85F, 0.0F, -2.75F, -2.1F, 0.0F, -5.0F, 0.1F, 0.0F, -5.0F, 0.1F, 0.0F, -5.0F, -2.1F, 0.0F, -5.0F);
/*  806 */     this.gunModel['¥'].setRotationPoint(-105.5F, -18.0F, 6.0F);
/*      */     
/*  808 */     this.gunModel['¦'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 16, 0.0F, -2.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, -2.1F, -0.5F, 0.0F, -0.85F, 0.0F, -1.75F, 0.1F, 0.0F, -1.75F, 0.1F, 0.0F, -1.75F, -0.85F, 0.0F, -1.75F);
/*  809 */     this.gunModel['¦'].setRotationPoint(-105.5F, -20.0F, 7.0F);
/*      */     
/*  811 */     this.gunModel['§'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 3, 16, 0.0F, -0.5F, -0.75F, -5.5F, 0.0F, -0.25F, -5.0F, 0.0F, -0.25F, -5.0F, -0.5F, -0.75F, -5.5F, -0.5F, -0.85F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -0.85F, -0.5F);
/*  812 */     this.gunModel['§'].setRotationPoint(-102.3F, -21.65F, 7.0F);
/*      */     
/*  814 */     this.gunModel['¨'].addShapeBox(51.0F, -25.0F, -15.0F, 9, 3, 16, 0.0F, -0.5F, -2.15F, -5.0F, -0.1F, 0.0F, -5.0F, -0.1F, 0.0F, -5.0F, -0.5F, -2.15F, -5.0F, -0.5F, 0.4F, 0.0F, -0.1F, -1.85F, 0.0F, -0.1F, -1.85F, 0.0F, -0.5F, 0.4F, 0.0F);
/*  815 */     this.gunModel['¨'].setRotationPoint(-100.8F, -23.55F, 7.0F);
/*      */     
/*  817 */     this.gunModel['©'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 16, 0.0F, -0.4F, -1.85F, -5.0F, 0.0F, -0.6F, -5.5F, 0.0F, -0.6F, -5.5F, -0.4F, -1.85F, -5.0F, -0.4F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.4F, 0.0F, -1.0F);
/*  818 */     this.gunModel['©'].setRotationPoint(-103.8F, -21.5F, 7.0F);
/*      */     
/*  820 */     this.gunModel['ª'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 16, 0.0F, -0.1F, 0.3F, -5.0F, -0.5F, 0.3F, -5.0F, -0.5F, 0.3F, -5.0F, -0.1F, 0.3F, -5.0F, -0.1F, -0.15F, 0.0F, -0.5F, -0.15F, 2.0F, -0.5F, -0.15F, 2.0F, -0.1F, -0.15F, 0.0F);
/*  821 */     this.gunModel['ª'].setRotationPoint(-92.0F, -23.25F, 7.0F);
/*      */     
/*  823 */     this.gunModel['«'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 20, 0.0F, 0.0F, 0.3F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, 0.25F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.15F, 0.0F, -0.4F, -0.15F, 0.0F, -0.4F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F);
/*  824 */     this.gunModel['«'].setRotationPoint(-88.5F, -23.25F, 5.0F);
/*      */     
/*  826 */     this.gunModel['¬'].addShapeBox(51.0F, -25.0F, -15.0F, 5, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F);
/*  827 */     this.gunModel['¬'].setRotationPoint(-87.9F, -23.25F, 5.0F);
/*      */     
/*  829 */     this.gunModel['­'].addShapeBox(51.0F, -25.0F, -15.0F, 5, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  830 */     this.gunModel['­'].setRotationPoint(-87.9F, -23.75F, 5.0F);
/*      */     
/*  832 */     this.gunModel['®'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  833 */     this.gunModel['®'].setRotationPoint(-90.0F, -45.5F, 10.5F);
/*      */     
/*  835 */     this.gunModel['¯'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  836 */     this.gunModel['¯'].setRotationPoint(-90.0F, -46.5F, 10.5F);
/*      */     
/*  838 */     this.gunModel['°'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 9, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  839 */     this.gunModel['°'].setRotationPoint(-89.0F, -47.5F, 10.5F);
/*      */     
/*  841 */     this.gunModel['±'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  842 */     this.gunModel['±'].setRotationPoint(-86.0F, -47.5F, 10.5F);
/*      */     
/*  844 */     this.gunModel['²'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel['²'].setRotationPoint(-87.0F, -47.5F, 10.5F);
/*      */     
/*  847 */     this.gunModel['³'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel['³'].setRotationPoint(-86.0F, -46.5F, 10.5F);
/*      */     
/*  850 */     this.gunModel['´'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel['´'].setRotationPoint(-84.5F, -46.5F, 10.5F);
/*      */     
/*  853 */     this.gunModel['µ'].addShapeBox(51.0F, -25.0F, -15.0F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  854 */     this.gunModel['µ'].setRotationPoint(-86.0F, -45.5F, 10.5F);
/*      */     
/*  856 */     this.gunModel['¶'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  857 */     this.gunModel['¶'].setRotationPoint(-81.0F, -45.5F, 10.5F);
/*      */     
/*  859 */     this.gunModel['·'].addShapeBox(51.0F, -25.0F, -15.0F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  860 */     this.gunModel['·'].setRotationPoint(-90.0F, -44.5F, 10.5F);
/*      */     
/*  862 */     this.gunModel['¸'].addShapeBox(51.0F, -25.0F, -15.0F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  863 */     this.gunModel['¸'].setRotationPoint(-89.5F, -43.5F, 10.5F);
/*      */     
/*  865 */     this.gunModel['¹'].addShapeBox(51.0F, -25.0F, -15.0F, 11, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  866 */     this.gunModel['¹'].setRotationPoint(-88.75F, -42.5F, 10.5F);
/*      */     
/*  868 */     this.gunModel['º'].addShapeBox(51.0F, -25.0F, -15.0F, 8, 4, 9, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel['º'].setRotationPoint(-87.0F, -41.5F, 10.5F);
/*      */     
/*  871 */     this.gunModel['»'].addShapeBox(51.0F, -25.0F, -15.0F, 6, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  872 */     this.gunModel['»'].setRotationPoint(-85.0F, -37.5F, 10.5F);
/*      */     
/*  874 */     this.gunModel['¼'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  875 */     this.gunModel['¼'].setRotationPoint(21.5F, -49.5F, 5.5F);
/*      */     
/*  877 */     this.gunModel['½'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  878 */     this.gunModel['½'].setRotationPoint(29.75F, -49.5F, 5.5F);
/*      */     
/*  880 */     this.gunModel['¾'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  881 */     this.gunModel['¾'].setRotationPoint(38.0F, -49.5F, 5.5F);
/*      */     
/*  883 */     this.gunModel['¿'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  884 */     this.gunModel['¿'].setRotationPoint(46.25F, -49.5F, 5.5F);
/*      */     
/*  886 */     this.gunModel['À'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  887 */     this.gunModel['À'].setRotationPoint(54.5F, -49.5F, 5.5F);
/*      */     
/*  889 */     this.gunModel['Á'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  890 */     this.gunModel['Á'].setRotationPoint(62.75F, -49.5F, 5.5F);
/*      */     
/*  892 */     this.gunModel['Â'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  893 */     this.gunModel['Â'].setRotationPoint(71.0F, -49.5F, 5.5F);
/*      */     
/*  895 */     this.gunModel['Ã'].addShapeBox(51.0F, -25.0F, -15.0F, 25, 1, 19, 0.0F, 0.0F, 2.0F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  896 */     this.gunModel['Ã'].setRotationPoint(79.25F, -49.5F, 5.5F);
/*      */     
/*  898 */     this.gunModel['Ä'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 28, 20, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 3.0F, 1.25F, 0.0F, 3.0F, -0.25F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, -9.25F, 0.0F, 3.0F, -9.25F, 0.0F, 3.0F, 10.5F, 0.0F, 0.0F);
/*  899 */     this.gunModel['Ä'].setRotationPoint(-73.0F, 2.75F, 5.0F);
/*      */     
/*  901 */     this.gunModel['Å'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 8, 20, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 3.0F, 1.25F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.75F, 0.0F, 3.0F, -1.75F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F);
/*  902 */     this.gunModel['Å'].setRotationPoint(-83.5F, 30.75F, 5.0F);
/*      */     
/*  904 */     this.gunModel['Æ'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 8, 20, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 3.0F, 1.25F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 3.0F, 1.25F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel['Æ'].setRotationPoint(-86.5F, 38.75F, 5.0F);
/*      */     
/*  907 */     this.gunModel['Ç'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 28, 20, 0.0F, -0.25F, 0.0F, -7.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, -7.0F, 11.25F, 0.0F, -7.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 11.25F, 0.0F, -7.0F);
/*  908 */     this.gunModel['Ç'].setRotationPoint(-76.5F, 2.75F, 5.0F);
/*      */     
/*  910 */     this.gunModel['È'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 8, 20, 0.0F, -0.75F, 0.0F, -7.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.75F, 0.0F, -7.0F, 1.25F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, -7.0F);
/*  911 */     this.gunModel['È'].setRotationPoint(-88.5F, 30.75F, 5.0F);
/*      */     
/*  913 */     this.gunModel['É'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 8, 20, 0.0F, 0.0F, 0.0F, -7.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 1.0F, 0.0F, -7.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, -7.0F);
/*  914 */     this.gunModel['É'].setRotationPoint(-89.75F, 38.75F, 5.0F);
/*      */     
/*  916 */     this.gunModel['Ê'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, 1.0F, 0.0F, -7.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, -7.0F, 1.0F, 0.0F, -7.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, -7.0F);
/*  917 */     this.gunModel['Ê'].setRotationPoint(-89.75F, 46.75F, 5.0F);
/*      */     
/*  919 */     this.gunModel['Ë'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, 1.0F, 0.0F, -7.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, -7.0F, -2.0F, 0.25F, -2.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.25F, -2.0F);
/*  920 */     this.gunModel['Ë'].setRotationPoint(-89.75F, 48.75F, 5.0F);
/*      */     
/*  922 */     this.gunModel['Ì'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 3.0F, 1.25F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, -1.25F, 0.0F, 1.25F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  923 */     this.gunModel['Ì'].setRotationPoint(-86.5F, 46.75F, 5.0F);
/*      */     
/*  925 */     this.gunModel['Í'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 4, 20, 0.0F, 0.0F, 0.25F, 3.0F, 1.25F, 0.25F, 3.0F, 1.25F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F, 0.0F, -1.25F, 0.0F, 1.25F, -2.0F, 0.0F, 1.25F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  926 */     this.gunModel['Í'].setRotationPoint(-84.25F, 46.75F, 5.0F);
/*      */     
/*  928 */     this.gunModel['Î'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 4, 20, 0.0F, 0.0F, 0.25F, 3.0F, 1.25F, 0.5F, 3.0F, 1.25F, 0.5F, 3.0F, 0.0F, 0.25F, 3.0F, 0.0F, -2.0F, 0.0F, 1.25F, -2.25F, 0.0F, 1.25F, -2.25F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  929 */     this.gunModel['Î'].setRotationPoint(-82.0F, 46.75F, 5.0F);
/*      */     
/*  931 */     this.gunModel['Ï'].addShapeBox(51.0F, -25.0F, -15.0F, 16, 4, 20, 0.0F, 0.0F, 0.5F, 3.0F, 1.25F, 0.5F, 3.0F, 1.25F, 0.5F, 3.0F, 0.0F, 0.5F, 3.0F, 0.0F, -2.25F, 0.0F, 1.25F, -2.25F, 0.0F, 1.25F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/*  932 */     this.gunModel['Ï'].setRotationPoint(-79.75F, 46.75F, 5.0F);
/*      */     
/*  934 */     this.gunModel['Ð'].addShapeBox(51.0F, -25.0F, -15.0F, 13, 4, 20, 0.0F, 0.0F, 0.5F, 3.0F, 1.4F, -2.0F, 3.0F, 1.4F, -2.0F, 3.0F, 0.0F, 0.5F, 3.0F, 0.0F, -2.25F, 0.0F, 1.0F, 0.25F, 3.0F, 1.0F, 0.25F, 3.0F, 0.0F, -2.25F, 0.0F);
/*  935 */     this.gunModel['Ð'].setRotationPoint(-62.5F, 46.75F, 5.0F);
/*      */     
/*  937 */     this.gunModel['Ñ'].addShapeBox(51.0F, -25.0F, -15.0F, 14, 2, 20, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 3.0F, 0.0F, -2.25F, 3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/*  938 */     this.gunModel['Ñ'].setRotationPoint(-62.5F, 48.75F, 5.0F);
/*      */     
/*  940 */     this.gunModel['Ò'].addShapeBox(51.0F, -25.0F, -15.0F, 17, 2, 20, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/*  941 */     this.gunModel['Ò'].setRotationPoint(-79.5F, 48.75F, 5.0F);
/*      */     
/*  943 */     this.gunModel['Ó'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/*  944 */     this.gunModel['Ó'].setRotationPoint(-81.75F, 48.75F, 5.0F);
/*      */     
/*  946 */     this.gunModel['Ô'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/*  947 */     this.gunModel['Ô'].setRotationPoint(-84.0F, 48.75F, 5.0F);
/*      */     
/*  949 */     this.gunModel['Õ'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 20, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/*  950 */     this.gunModel['Õ'].setRotationPoint(-86.25F, 48.75F, 5.0F);
/*      */     
/*  952 */     this.gunModel['Ö'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 20, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 1.0F, 0.0F, 2.3F, 1.0F, 0.0F, 2.3F, 1.0F, 0.0F, 1.25F, 1.0F, 0.0F);
/*  953 */     this.gunModel['Ö'].setRotationPoint(-45.5F, 47.0F, 5.0F);
/*      */     
/*  955 */     this.gunModel['×'].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 20, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, -4.0F, -1.75F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F);
/*  956 */     this.gunModel['×'].setRotationPoint(-40.75F, 55.0F, 5.0F);
/*      */     
/*  958 */     this.gunModel['Ø'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 20, 0.0F, 1.25F, 0.0F, 1.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 1.25F, 0.0F, 1.0F, 1.25F, 1.0F, 1.0F, 1.55F, 1.0F, 0.0F, 1.55F, 1.0F, 0.0F, 1.25F, 1.0F, 1.0F);
/*  959 */     this.gunModel['Ø'].setRotationPoint(-45.5F, 51.0F, 5.0F);
/*      */     
/*  961 */     this.gunModel['Ù'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 20, 0.0F, 1.25F, 0.0F, 1.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.25F, 0.0F, 1.0F, 1.25F, 1.5F, 1.0F, 1.55F, 1.0F, 0.0F, 1.55F, 1.0F, 0.0F, 1.25F, 1.5F, 1.0F);
/*  962 */     this.gunModel['Ù'].setRotationPoint(-45.5F, 54.0F, 5.0F);
/*      */     
/*  964 */     this.gunModel['Ú'].addShapeBox(51.0F, -25.0F, -15.0F, 35, 5, 20, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F);
/*  965 */     this.gunModel['Ú'].setRotationPoint(-81.75F, 51.0F, 5.0F);
/*      */     
/*  967 */     this.gunModel['Û'].addShapeBox(51.0F, -25.0F, -15.0F, 5, 5, 20, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, -0.25F, -2.5F, 0.0F);
/*  968 */     this.gunModel['Û'].setRotationPoint(-86.75F, 51.0F, 5.0F);
/*      */     
/*  970 */     this.gunModel['Ü'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 20, 0.0F, -0.5F, 1.75F, -3.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 1.75F, -4.0F, -0.5F, -1.75F, -3.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, -1.75F, -4.0F);
/*  971 */     this.gunModel['Ü'].setRotationPoint(-89.75F, 51.0F, 5.0F);
/*      */     
/*  973 */     this.gunModel['Ý'].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 19, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  974 */     this.gunModel['Ý'].setRotationPoint(10.5F, -49.5F, 5.5F);
/*      */     
/*  976 */     this.gunModel['Þ'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 19, 0.0F, 0.1F, 4.0F, -3.05F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.1F, 4.0F, -3.05F, 0.1F, -0.25F, 1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.1F, -0.25F, 1.5F);
/*  977 */     this.gunModel['Þ'].setRotationPoint(7.5F, -49.5F, 5.5F);
/*      */     
/*  979 */     this.gunModel['ß'].addShapeBox(51.0F, -25.0F, -15.0F, 21, 10, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  980 */     this.gunModel['ß'].setRotationPoint(81.0F, -32.5F, 2.0F);
/*      */     
/*  982 */     this.gunModel['à'].addShapeBox(51.0F, -25.0F, -15.0F, 21, 5, 28, 0.0F, 0.0F, 0.0F, -3.0F, 2.5F, 0.0F, -3.0F, 2.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  983 */     this.gunModel['à'].setRotationPoint(81.0F, -37.5F, 1.0F);
/*      */     
/*  985 */     this.gunModel['á'].addShapeBox(51.0F, -25.0F, -15.0F, 21, 10, 28, 0.0F, 0.0F, 0.0F, -8.0F, 2.5F, 0.0F, -8.0F, 2.5F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -3.0F, 2.5F, 0.0F, -3.0F, 2.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  986 */     this.gunModel['á'].setRotationPoint(81.0F, -47.5F, 1.0F);
/*      */     
/*  988 */     this.gunModel['â'].addShapeBox(51.0F, -25.0F, -15.0F, 62, 10, 28, 0.0F, 0.0F, 0.0F, -8.0F, 2.0F, 0.0F, -8.0F, 2.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, -0.5F, -3.2F, 2.0F, -0.5F, -3.2F, 2.0F, -0.5F, -3.2F, 0.0F, -0.5F, -3.2F);
/*  989 */     this.gunModel['â'].setRotationPoint(17.0F, -47.5F, 1.0F);
/*      */     
/*  991 */     this.gunModel['ã'].addShapeBox(51.0F, -25.0F, -15.0F, 92, 2, 24, 0.0F, 0.0F, 0.0F, -2.5F, 2.5F, 0.0F, -2.5F, 2.5F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -6.0F, 2.5F, 0.0F, -6.0F, 2.5F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  992 */     this.gunModel['ã'].setRotationPoint(10.0F, -49.5F, 3.0F);
/*      */     
/*  994 */     this.gunModel['ä'].addShapeBox(51.0F, -25.0F, -15.0F, 6, 3, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  995 */     this.gunModel['ä'].setRotationPoint(92.0F, -23.0F, 4.5F);
/*      */     
/*  997 */     this.gunModel['å'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 21, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  998 */     this.gunModel['å'].setRotationPoint(90.0F, -23.0F, 4.5F);
/*      */     
/* 1000 */     this.gunModel['æ'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 21, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1001 */     this.gunModel['æ'].setRotationPoint(90.0F, -21.0F, 4.5F);
/*      */     
/* 1003 */     this.gunModel['ç'].addShapeBox(51.0F, -25.0F, -15.0F, 8, 1, 21, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1004 */     this.gunModel['ç'].setRotationPoint(81.5F, -23.0F, 4.5F);
/*      */     
/* 1006 */     this.gunModel['è'].addShapeBox(51.0F, -25.0F, -15.0F, 24, 5, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -5.0F, 0.0F, 0.25F, -5.0F, 0.0F, 0.25F, -5.0F, 0.0F, 0.25F, -5.0F);
/* 1007 */     this.gunModel['è'].setRotationPoint(-17.0F, -41.5F, 4.0F);
/*      */     
/* 1009 */     this.gunModel['é'].addShapeBox(51.0F, -25.0F, -15.0F, 24, 7, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.4F, 0.25F, 0.0F, 0.4F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1010 */     this.gunModel['é'].setRotationPoint(-17.0F, -48.75F, 4.0F);
/*      */     
/* 1012 */     this.gunModel['ê'].addShapeBox(51.0F, -25.0F, -15.0F, 24, 5, 22, 0.0F, 0.0F, 0.25F, -5.0F, 0.4F, 0.25F, -5.0F, 0.4F, 0.25F, -5.0F, 0.0F, 0.25F, -5.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1013 */     this.gunModel['ê'].setRotationPoint(-17.0F, -53.75F, 4.0F);
/*      */     
/* 1015 */     this.gunModel['ë'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 22, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.4F, 0.25F, 0.0F);
/* 1016 */     this.gunModel['ë'].setRotationPoint(7.0F, -43.75F, 4.0F);
/*      */     
/* 1018 */     this.gunModel['ì'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -5.0F, 0.0F, 0.25F, -5.0F, 0.0F, 0.25F, -5.0F, 0.0F, 0.25F, -5.0F);
/* 1019 */     this.gunModel['ì'].setRotationPoint(7.0F, -41.5F, 4.0F);
/*      */     
/* 1021 */     this.gunModel['í'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -1.2F);
/* 1022 */     this.gunModel['í'].setRotationPoint(8.0F, -41.5F, 4.0F);
/*      */     
/* 1024 */     this.gunModel['î'].addShapeBox(51.0F, -25.0F, -15.0F, 17, 1, 19, 0.0F, -2.75F, 2.0F, 0.0F, -0.75F, 2.0F, 0.0F, -0.75F, 2.0F, 0.0F, -2.75F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1025 */     this.gunModel['î'].setRotationPoint(87.25F, -51.5F, 5.5F);
/*      */     
/* 1027 */     this.gunModel['ï'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 22, 0.0F, 0.0F, 0.0F, -1.2F, -1.0F, 0.0F, -1.2F, -1.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.25F, -2.4F, 0.5F, 0.25F, -2.4F, 0.5F, 0.25F, -2.4F, 0.0F, 0.25F, -2.4F);
/* 1028 */     this.gunModel['ï'].setRotationPoint(8.0F, -40.25F, 4.0F);
/*      */     
/* 1030 */     this.gunModel['ð'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 22, 0.0F, 0.0F, 0.0F, -2.4F, 0.5F, 0.0F, -2.4F, 0.5F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.25F, -3.6F, 2.5F, 0.25F, -3.6F, 2.5F, 0.25F, -3.6F, 0.0F, 0.25F, -3.6F);
/* 1031 */     this.gunModel['ð'].setRotationPoint(8.0F, -39.0F, 4.0F);
/*      */     
/* 1033 */     this.gunModel['ñ'].addShapeBox(51.0F, -25.0F, -15.0F, 6, 8, 26, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F);
/* 1034 */     this.gunModel['ñ'].setRotationPoint(-64.5F, -20.0F, 2.0F);
/*      */     
/* 1036 */     this.gunModel['ò'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 59, 10, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -1.0F, 0.0F, 2.5F, 10.0F, 0.0F, 0.0F, -9.25F, 0.0F, 0.0F, -9.25F, 0.0F, -0.5F, 10.0F, 0.0F, 2.5F);
/* 1037 */     this.gunModel['ò'].setRotationPoint(-38.5F, -8.0F, 15.5F);
/*      */     
/* 1039 */     this.gunModel['ó'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 6, 5, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -0.25F, 0.0F, -5.0F);
/* 1040 */     this.gunModel['ó'].setRotationPoint(-0.75F, -9.25F, 21.0F);
/*      */     
/* 1042 */     this.gunModel['ô'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 6, 5, 0.0F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1043 */     this.gunModel['ô'].setRotationPoint(-0.75F, -9.25F, 4.0F);
/*      */     
/* 1045 */     this.gunModel['õ'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 5, 21, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1046 */     this.gunModel['õ'].setRotationPoint(-0.75F, -15.75F, 5.0F);
/*      */     
/* 1048 */     this.gunModel['ö'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 21, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.5F, -1.25F, -0.5F, 0.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -1.75F, -0.5F);
/* 1049 */     this.gunModel['ö'].setRotationPoint(-1.5F, -15.75F, 5.0F);
/*      */     
/* 1051 */     this.gunModel['÷'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 21, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, -1.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1052 */     this.gunModel['÷'].setRotationPoint(2.25F, -15.75F, 5.0F);
/*      */     
/* 1054 */     this.gunModel['ø'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 3.0F, -0.5F);
/* 1055 */     this.gunModel['ø'].setRotationPoint(3.75F, -23.5F, 5.0F);
/*      */     
/* 1057 */     this.gunModel['ù'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, -0.5F, 0.0F, 1.0F, -0.5F);
/* 1058 */     this.gunModel['ù'].setRotationPoint(-3.0F, -23.5F, 5.0F);
/*      */     
/* 1060 */     this.gunModel['ú'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 6, 21, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1061 */     this.gunModel['ú'].setRotationPoint(2.25F, -23.5F, 5.0F);
/*      */     
/* 1063 */     this.gunModel['û'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 6, 21, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, -1.0F, -0.5F);
/* 1064 */     this.gunModel['û'].setRotationPoint(-2.5F, -23.5F, 5.0F);
/*      */     
/* 1066 */     this.gunModel['ü'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 6, 21, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F);
/* 1067 */     this.gunModel['ü'].setRotationPoint(-0.75F, -23.5F, 5.0F);
/*      */     
/* 1069 */     this.gunModel['ý'].addShapeBox(51.0F, -25.0F, -15.0F, 6, 3, 20, 0.0F, -0.6F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.6F, 0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/* 1070 */     this.gunModel['ý'].setRotationPoint(-89.0F, -22.0F, 5.0F);
/*      */     
/* 1072 */     this.gunModel['þ'].addShapeBox(51.0F, -25.0F, -15.0F, 11, 1, 26, 0.0F, -0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F);
/* 1073 */     this.gunModel['þ'].setRotationPoint(-66.5F, -12.0F, 2.0F);
/*      */     
/* 1075 */     this.gunModel['ÿ'].addShapeBox(51.0F, -25.0F, -15.0F, 30, 3, 26, 0.0F, 0.15F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.15F, 0.25F, 0.0F, 1.05F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.05F, -0.25F, 0.0F);
/* 1076 */     this.gunModel['ÿ'].setRotationPoint(-66.5F, -10.75F, 2.0F);
/*      */     
/* 1078 */     this.gunModel['Ā'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 22, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1079 */     this.gunModel['Ā'].setRotationPoint(7.25F, -14.5F, 4.0F);
/*      */     
/* 1081 */     this.gunModel['ā'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 22, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1082 */     this.gunModel['ā'].setRotationPoint(8.25F, -14.0F, 4.0F);
/*      */     
/* 1084 */     this.gunModel['Ă'].addShapeBox(51.0F, -25.0F, -15.0F, 32, 11, 26, 0.0F, -2.95F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -2.95F, 0.25F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1085 */     this.gunModel['Ă'].setRotationPoint(-70.5F, -7.75F, 2.0F);
/*      */     
/* 1087 */     this.gunModel['ă'].addShapeBox(51.0F, -25.0F, -15.0F, 41, 28, 26, 0.0F, -10.7F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -10.7F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -4.2F, -0.25F, 0.0F, -4.2F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1088 */     this.gunModel['ă'].setRotationPoint(-81.5F, 3.0F, 2.0F);
/*      */     
/* 1090 */     this.gunModel['Ą'].addShapeBox(51.0F, -25.0F, -15.0F, 40, 8, 26, 0.0F, -3.25F, 0.25F, 0.0F, -0.2F, 0.25F, 0.0F, -0.2F, 0.25F, 0.0F, -3.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1091 */     this.gunModel['Ą'].setRotationPoint(-84.5F, 31.0F, 2.0F);
/*      */     
/* 1093 */     this.gunModel['ą'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 8, 26, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1094 */     this.gunModel['ą'].setRotationPoint(-84.5F, 38.75F, 2.0F);
/*      */     
/* 1096 */     this.gunModel['Ć'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 8, 26, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1097 */     this.gunModel['Ć'].setRotationPoint(-82.25F, 38.75F, 2.0F);
/*      */     
/* 1099 */     this.gunModel['ć'].addShapeBox(51.0F, -25.0F, -15.0F, 18, 8, 26, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1100 */     this.gunModel['ć'].setRotationPoint(-80.0F, 38.75F, 2.0F);
/*      */     
/* 1102 */     this.gunModel['Ĉ'].addShapeBox(51.0F, -25.0F, -15.0F, 17, 8, 26, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -2.3F, 2.0F, 0.0F, -2.3F, 2.0F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1103 */     this.gunModel['Ĉ'].setRotationPoint(-62.75F, 38.75F, 2.0F);
/*      */     
/* 1105 */     this.gunModel['ĉ'].addShapeBox(51.0F, -25.0F, -15.0F, 8, 10, 15, 0.0F, 0.0F, 0.0F, 1.25F, 1.6F, 0.0F, -1.5F, 1.6F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, -0.5F, 0.0F, 1.6F, -0.5F, 3.3F, 1.6F, -0.5F, 3.3F, 0.0F, -0.5F, 0.0F);
/* 1106 */     this.gunModel['ĉ'].setRotationPoint(7.4F, -47.5F, 7.5F);
/*      */     
/* 1108 */     this.gunModel['Ċ'].addShapeBox(51.0F, -25.0F, -15.0F, 10, 2, 15, 0.0F, 0.0F, 0.0F, 2.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, -1.45F, -0.5F, 0.0F, -1.45F, 0.0F, 0.0F, 1.25F);
/* 1109 */     this.gunModel['Ċ'].setRotationPoint(7.4F, -49.5F, 7.5F);
/*      */     
/* 1111 */     this.gunModel['ċ'].addShapeBox(51.0F, -25.0F, -15.0F, 62, 1, 19, 0.0F, 0.0F, 0.5F, -0.7F, 0.0F, 0.5F, -0.7F, 0.0F, 0.5F, -0.7F, 0.0F, 0.5F, -0.7F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1112 */     this.gunModel['ċ'].setRotationPoint(17.5F, -49.5F, 5.5F);
/*      */     
/* 1114 */     this.gunModel['Č'].addShapeBox(51.0F, -25.0F, -15.0F, 76, 1, 20, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -1.1F, 0.0F, 0.5F, -1.1F, 0.0F, 0.5F, -1.1F, 0.0F, 0.5F, -1.1F);
/* 1115 */     this.gunModel['Č'].setRotationPoint(12.5F, -17.5F, 5.0F);
/*      */     
/* 1117 */     this.gunModel['č'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1118 */     this.gunModel['č'].setRotationPoint(-88.0F, -47.5F, 10.5F);
/*      */     
/* 1120 */     this.gunModel['Ď'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 5, 20, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1121 */     this.gunModel['Ď'].setRotationPoint(-32.75F, 1.0F, 6.0F);
/*      */     
/* 1123 */     this.gunModel['ď'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 20, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F);
/* 1124 */     this.gunModel['ď'].setRotationPoint(-33.5F, 1.0F, 6.0F);
/*      */     
/* 1126 */     this.gunModel['Đ'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 20, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1127 */     this.gunModel['Đ'].setRotationPoint(-29.75F, 1.0F, 6.0F);
/*      */     
/* 1129 */     this.gunModel['đ'].addShapeBox(51.0F, -25.0F, -15.0F, 11, 1, 1, 0.0F, -2.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1130 */     this.gunModel['đ'].setRotationPoint(-9.5F, -20.75F, 4.0F);
/*      */     
/* 1132 */     this.gunModel['Ē'].addShapeBox(51.0F, -25.0F, -15.0F, 11, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1133 */     this.gunModel['Ē'].setRotationPoint(-9.5F, -19.25F, 4.0F);
/*      */     
/* 1135 */     this.gunModel['ē'].addShapeBox(51.0F, -25.0F, -15.0F, 20, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1136 */     this.gunModel['ē'].setRotationPoint(-46.5F, -19.5F, 25.25F);
/*      */     
/* 1138 */     this.gunModel['Ĕ'].addShapeBox(51.0F, -25.0F, -15.0F, 6, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1139 */     this.gunModel['Ĕ'].setRotationPoint(-52.5F, -22.5F, 24.5F);
/*      */     
/* 1141 */     this.gunModel['ĕ'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1142 */     this.gunModel['ĕ'].setRotationPoint(-53.5F, -22.5F, 24.5F);
/*      */     
/* 1144 */     this.gunModel['Ė'].addShapeBox(51.0F, -25.0F, -15.0F, 3, 5, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1145 */     this.gunModel['Ė'].setRotationPoint(-26.25F, -19.0F, 25.25F);
/*      */     
/* 1147 */     this.gunModel['ė'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 2, 0.0F, 0.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F);
/* 1148 */     this.gunModel['ė'].setRotationPoint(-27.0F, -19.0F, 25.25F);
/*      */     
/* 1150 */     this.gunModel['Ę'].addShapeBox(51.0F, -25.0F, -15.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1151 */     this.gunModel['Ę'].setRotationPoint(-23.75F, -19.0F, 25.25F);
/*      */     
/* 1153 */     this.gunModel['ę'].addShapeBox(51.0F, -25.0F, -15.0F, 14, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 6.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 6.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1154 */     this.gunModel['ę'].setRotationPoint(-52.5F, -15.5F, 26.25F);
/*      */     
/* 1156 */     this.gunModel['Ě'].addShapeBox(51.0F, -25.0F, -15.0F, 15, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1157 */     this.gunModel['Ě'].setRotationPoint(-52.5F, -16.75F, 26.25F);
/*      */     
/* 1159 */     this.gunModel['ě'].addShapeBox(51.0F, -25.0F, -15.0F, 17, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1160 */     this.gunModel['ě'].setRotationPoint(-52.5F, -17.75F, 26.25F);
/*      */     
/* 1162 */     this.gunModel['Ĝ'].addShapeBox(51.0F, -25.0F, -15.0F, 2, 3, 3, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 1.5F, -0.5F);
/* 1163 */     this.gunModel['Ĝ'].setRotationPoint(-50.75F, -46.5F, 1.75F);
/*      */     
/* 1165 */     this.gunModel['ĝ'].addShapeBox(51.0F, -25.0F, -15.0F, 7, 11, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 1166 */     this.gunModel['ĝ'].setRotationPoint(-84.25F, -34.5F, 10.5F);
/*      */     
/* 1168 */     this.gunModel['Ğ'].addShapeBox(51.0F, -25.0F, -15.0F, 21, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1169 */     this.gunModel['Ğ'].setRotationPoint(83.55F, -47.0F, 10.5F);
/*      */     
/*      */ 
/* 1172 */     this.defaultScopeModel = new ModelRendererTurbo[19];
/* 1173 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/* 1174 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 1585, 33, this.textureX, this.textureY);
/* 1175 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/* 1176 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1721, 1, this.textureX, this.textureY);
/* 1177 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 1777, 1, this.textureX, this.textureY);
/* 1178 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 1985, 1, this.textureX, this.textureY);
/* 1179 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 1180 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 1181 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/* 1182 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 817, 89, this.textureX, this.textureY);
/* 1183 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 1184 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/* 1185 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/* 1186 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/* 1187 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/* 1188 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 1189 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 665, 1, this.textureX, this.textureY);
/* 1190 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/* 1191 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*      */     
/* 1193 */     this.defaultScopeModel[0].addShapeBox(51.0F, -25.0F, -15.0F, 3, 6, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1194 */     this.defaultScopeModel[0].setRotationPoint(-69.0F, -58.5F, 3.5F);
/*      */     
/* 1196 */     this.defaultScopeModel[1].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 9, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1197 */     this.defaultScopeModel[1].setRotationPoint(-69.0F, -59.5F, 3.5F);
/*      */     
/* 1199 */     this.defaultScopeModel[2].addShapeBox(51.0F, -25.0F, -15.0F, 4, 6, 6, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1200 */     this.defaultScopeModel[2].setRotationPoint(-65.5F, -58.5F, 3.5F);
/*      */     
/* 1202 */     this.defaultScopeModel[3].addShapeBox(51.0F, -25.0F, -15.0F, 6, 2, 5, 0.0F, -1.25F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, -1.25F, 2.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F);
/* 1203 */     this.defaultScopeModel[3].setRotationPoint(94.5F, -56.5F, 12.5F);
/*      */     
/* 1205 */     this.defaultScopeModel[4].addShapeBox(51.0F, -25.0F, -15.0F, 6, 1, 5, 0.0F, -3.0F, 2.0F, 0.0F, -0.75F, 2.0F, 0.0F, -0.75F, 2.0F, 0.0F, -3.0F, 2.0F, 0.0F, -1.25F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F);
/* 1206 */     this.defaultScopeModel[4].setRotationPoint(94.5F, -57.5F, 12.5F);
/*      */     
/* 1208 */     this.defaultScopeModel[5].addShapeBox(51.0F, -25.0F, -15.0F, 6, 2, 5, 0.0F, 2.0F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 3.25F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 3.25F, -2.0F, 0.0F);
/* 1209 */     this.defaultScopeModel[5].setRotationPoint(94.5F, -53.5F, 12.5F);
/*      */     
/* 1211 */     this.defaultScopeModel[6].addShapeBox(51.0F, -25.0F, -15.0F, 3, 6, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1212 */     this.defaultScopeModel[6].setRotationPoint(-69.0F, -58.5F, 20.5F);
/*      */     
/* 1214 */     this.defaultScopeModel[7].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 9, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1215 */     this.defaultScopeModel[7].setRotationPoint(-69.0F, -59.5F, 17.5F);
/*      */     
/* 1217 */     this.defaultScopeModel[8].addShapeBox(51.0F, -25.0F, -15.0F, 4, 6, 6, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1218 */     this.defaultScopeModel[8].setRotationPoint(-65.5F, -58.5F, 20.5F);
/*      */     
/* 1220 */     this.defaultScopeModel[9].addShapeBox(51.0F, -25.0F, -15.0F, 6, 3, 11, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1221 */     this.defaultScopeModel[9].setRotationPoint(-69.0F, -55.5F, 9.5F);
/*      */     
/* 1223 */     this.defaultScopeModel[10].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 11, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1224 */     this.defaultScopeModel[10].setRotationPoint(-62.0F, -55.5F, 9.5F);
/*      */     
/* 1226 */     this.defaultScopeModel[11].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1227 */     this.defaultScopeModel[11].setRotationPoint(-69.0F, -58.5F, 9.5F);
/*      */     
/* 1229 */     this.defaultScopeModel[12].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1230 */     this.defaultScopeModel[12].setRotationPoint(-69.0F, -58.5F, 17.5F);
/*      */     
/* 1232 */     this.defaultScopeModel[13].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1233 */     this.defaultScopeModel[13].setRotationPoint(-69.0F, -57.5F, 12.5F);
/*      */     
/* 1235 */     this.defaultScopeModel[14].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1236 */     this.defaultScopeModel[14].setRotationPoint(-69.0F, -57.75F, 16.75F);
/*      */     
/* 1238 */     this.defaultScopeModel[15].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1239 */     this.defaultScopeModel[15].setRotationPoint(-69.0F, -57.75F, 12.25F);
/*      */     
/* 1241 */     this.defaultScopeModel[16].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1242 */     this.defaultScopeModel[16].setRotationPoint(-69.25F, -58.0F, 18.5F);
/*      */     
/* 1244 */     this.defaultScopeModel[17].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1245 */     this.defaultScopeModel[17].setRotationPoint(-69.25F, -58.0F, 10.5F);
/*      */     
/* 1247 */     this.defaultScopeModel[18].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 1, 0.0F, -0.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F);
/* 1248 */     this.defaultScopeModel[18].setRotationPoint(94.75F, -58.0F, 14.5F);
/*      */     
/*      */ 
/* 1251 */     this.ammoModel = new ModelRendererTurbo[7];
/* 1252 */     this.ammoModel[0] = new ModelRendererTurbo(this, 1689, 209, this.textureX, this.textureY);
/* 1253 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1233, 201, this.textureX, this.textureY);
/* 1254 */     this.ammoModel[2] = new ModelRendererTurbo(this, 553, 105, this.textureX, this.textureY);
/* 1255 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1793, 209, this.textureX, this.textureY);
/* 1256 */     this.ammoModel[4] = new ModelRendererTurbo(this, 1449, 201, this.textureX, this.textureY);
/* 1257 */     this.ammoModel[5] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/* 1258 */     this.ammoModel[6] = new ModelRendererTurbo(this, 1489, 217, this.textureX, this.textureY);
/*      */     
/* 1260 */     this.ammoModel[0].addShapeBox(51.0F, -25.0F, -15.0F, 31, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1261 */     this.ammoModel[0].setRotationPoint(-76.75F, 56.0F, 5.5F);
/*      */     
/* 1263 */     this.ammoModel[1].addShapeBox(51.0F, -25.0F, -15.0F, 7, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1264 */     this.ammoModel[1].setRotationPoint(-45.75F, 56.0F, 5.5F);
/*      */     
/* 1266 */     this.ammoModel[2].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F);
/* 1267 */     this.ammoModel[2].setRotationPoint(-38.75F, 56.0F, 7.5F);
/*      */     
/* 1269 */     this.ammoModel[3].addShapeBox(51.0F, -25.0F, -15.0F, 31, 1, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.ammoModel[3].setRotationPoint(-76.75F, 58.0F, 4.5F);
/*      */     
/* 1272 */     this.ammoModel[4].addShapeBox(51.0F, -25.0F, -15.0F, 7, 1, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1273 */     this.ammoModel[4].setRotationPoint(-45.75F, 58.0F, 4.5F);
/*      */     
/* 1275 */     this.ammoModel[5].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F);
/* 1276 */     this.ammoModel[5].setRotationPoint(-38.75F, 58.0F, 6.5F);
/*      */     
/* 1278 */     this.ammoModel[6].addShapeBox(51.0F, -25.0F, -15.0F, 38, 53, 20, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1279 */     this.ammoModel[6].setRotationPoint(-77.75F, 3.0F, 4.5F);
/*      */     
/*      */ 
/* 1282 */     this.slideModel = new ModelRendererTurbo[110];
/* 1283 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 1284 */     this.slideModel[1] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/* 1285 */     this.slideModel[2] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/* 1286 */     this.slideModel[3] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 1287 */     this.slideModel[4] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/* 1288 */     this.slideModel[5] = new ModelRendererTurbo(this, 537, 1, this.textureX, this.textureY);
/* 1289 */     this.slideModel[6] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/* 1290 */     this.slideModel[7] = new ModelRendererTurbo(this, 649, 1, this.textureX, this.textureY);
/* 1291 */     this.slideModel[8] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/* 1292 */     this.slideModel[9] = new ModelRendererTurbo(this, 769, 1, this.textureX, this.textureY);
/* 1293 */     this.slideModel[10] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/* 1294 */     this.slideModel[11] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/* 1295 */     this.slideModel[12] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/* 1296 */     this.slideModel[13] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/* 1297 */     this.slideModel[14] = new ModelRendererTurbo(this, 1049, 1, this.textureX, this.textureY);
/* 1298 */     this.slideModel[15] = new ModelRendererTurbo(this, 1105, 1, this.textureX, this.textureY);
/* 1299 */     this.slideModel[16] = new ModelRendererTurbo(this, 1161, 1, this.textureX, this.textureY);
/* 1300 */     this.slideModel[17] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/* 1301 */     this.slideModel[18] = new ModelRendererTurbo(this, 1273, 1, this.textureX, this.textureY);
/* 1302 */     this.slideModel[19] = new ModelRendererTurbo(this, 1329, 1, this.textureX, this.textureY);
/* 1303 */     this.slideModel[20] = new ModelRendererTurbo(this, 1385, 1, this.textureX, this.textureY);
/* 1304 */     this.slideModel[21] = new ModelRendererTurbo(this, 1425, 1, this.textureX, this.textureY);
/* 1305 */     this.slideModel[22] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/* 1306 */     this.slideModel[23] = new ModelRendererTurbo(this, 1561, 1, this.textureX, this.textureY);
/* 1307 */     this.slideModel[24] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 1308 */     this.slideModel[25] = new ModelRendererTurbo(this, 1617, 1, this.textureX, this.textureY);
/* 1309 */     this.slideModel[26] = new ModelRendererTurbo(this, 1681, 1, this.textureX, this.textureY);
/* 1310 */     this.slideModel[27] = new ModelRendererTurbo(this, 1745, 1, this.textureX, this.textureY);
/* 1311 */     this.slideModel[28] = new ModelRendererTurbo(this, 1801, 1, this.textureX, this.textureY);
/* 1312 */     this.slideModel[29] = new ModelRendererTurbo(this, 1857, 1, this.textureX, this.textureY);
/* 1313 */     this.slideModel[30] = new ModelRendererTurbo(this, 1913, 1, this.textureX, this.textureY);
/* 1314 */     this.slideModel[31] = new ModelRendererTurbo(this, 1985, 1, this.textureX, this.textureY);
/* 1315 */     this.slideModel[32] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 1316 */     this.slideModel[33] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/* 1317 */     this.slideModel[34] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/* 1318 */     this.slideModel[35] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 1319 */     this.slideModel[36] = new ModelRendererTurbo(this, 1481, 33, this.textureX, this.textureY);
/* 1320 */     this.slideModel[37] = new ModelRendererTurbo(this, 1361, 33, this.textureX, this.textureY);
/* 1321 */     this.slideModel[38] = new ModelRendererTurbo(this, 1585, 33, this.textureX, this.textureY);
/* 1322 */     this.slideModel[39] = new ModelRendererTurbo(this, 1713, 9, this.textureX, this.textureY);
/* 1323 */     this.slideModel[40] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/* 1324 */     this.slideModel[41] = new ModelRendererTurbo(this, 1745, 33, this.textureX, this.textureY);
/* 1325 */     this.slideModel[42] = new ModelRendererTurbo(this, 1801, 33, this.textureX, this.textureY);
/* 1326 */     this.slideModel[43] = new ModelRendererTurbo(this, 1857, 33, this.textureX, this.textureY);
/* 1327 */     this.slideModel[44] = new ModelRendererTurbo(this, 1913, 33, this.textureX, this.textureY);
/* 1328 */     this.slideModel[45] = new ModelRendererTurbo(this, 1969, 33, this.textureX, this.textureY);
/* 1329 */     this.slideModel[46] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 1330 */     this.slideModel[47] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/* 1331 */     this.slideModel[48] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/* 1332 */     this.slideModel[49] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/* 1333 */     this.slideModel[50] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/* 1334 */     this.slideModel[51] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/* 1335 */     this.slideModel[52] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/* 1336 */     this.slideModel[53] = new ModelRendererTurbo(this, 1025, 41, this.textureX, this.textureY);
/* 1337 */     this.slideModel[54] = new ModelRendererTurbo(this, 537, 49, this.textureX, this.textureY);
/* 1338 */     this.slideModel[55] = new ModelRendererTurbo(this, 697, 49, this.textureX, this.textureY);
/* 1339 */     this.slideModel[56] = new ModelRendererTurbo(this, 1225, 41, this.textureX, this.textureY);
/* 1340 */     this.slideModel[57] = new ModelRendererTurbo(this, 1401, 41, this.textureX, this.textureY);
/* 1341 */     this.slideModel[58] = new ModelRendererTurbo(this, 1697, 41, this.textureX, this.textureY);
/* 1342 */     this.slideModel[59] = new ModelRendererTurbo(this, 881, 49, this.textureX, this.textureY);
/* 1343 */     this.slideModel[60] = new ModelRendererTurbo(this, 769, 89, this.textureX, this.textureY);
/* 1344 */     this.slideModel[61] = new ModelRendererTurbo(this, 433, 137, this.textureX, this.textureY);
/* 1345 */     this.slideModel[62] = new ModelRendererTurbo(this, 745, 137, this.textureX, this.textureY);
/* 1346 */     this.slideModel[63] = new ModelRendererTurbo(this, 1593, 185, this.textureX, this.textureY);
/* 1347 */     this.slideModel[64] = new ModelRendererTurbo(this, 1833, 89, this.textureX, this.textureY);
/* 1348 */     this.slideModel[65] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/* 1349 */     this.slideModel[66] = new ModelRendererTurbo(this, 625, 193, this.textureX, this.textureY);
/* 1350 */     this.slideModel[67] = new ModelRendererTurbo(this, 1425, 193, this.textureX, this.textureY);
/* 1351 */     this.slideModel[68] = new ModelRendererTurbo(this, 1049, 97, this.textureX, this.textureY);
/* 1352 */     this.slideModel[69] = new ModelRendererTurbo(this, 913, 201, this.textureX, this.textureY);
/* 1353 */     this.slideModel[70] = new ModelRendererTurbo(this, 1593, 201, this.textureX, this.textureY);
/* 1354 */     this.slideModel[71] = new ModelRendererTurbo(this, 1225, 41, this.textureX, this.textureY);
/* 1355 */     this.slideModel[72] = new ModelRendererTurbo(this, 697, 49, this.textureX, this.textureY);
/* 1356 */     this.slideModel[73] = new ModelRendererTurbo(this, 1129, 97, this.textureX, this.textureY);
/* 1357 */     this.slideModel[74] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/* 1358 */     this.slideModel[75] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 1359 */     this.slideModel[76] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/* 1360 */     this.slideModel[77] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/* 1361 */     this.slideModel[78] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/* 1362 */     this.slideModel[79] = new ModelRendererTurbo(this, 729, 1, this.textureX, this.textureY);
/* 1363 */     this.slideModel[80] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/* 1364 */     this.slideModel[81] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/* 1365 */     this.slideModel[82] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/* 1366 */     this.slideModel[83] = new ModelRendererTurbo(this, 1017, 57, this.textureX, this.textureY);
/* 1367 */     this.slideModel[84] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/* 1368 */     this.slideModel[85] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/* 1369 */     this.slideModel[86] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/* 1370 */     this.slideModel[87] = new ModelRendererTurbo(this, 1081, 1, this.textureX, this.textureY);
/* 1371 */     this.slideModel[88] = new ModelRendererTurbo(this, 1113, 1, this.textureX, this.textureY);
/* 1372 */     this.slideModel[89] = new ModelRendererTurbo(this, 1137, 1, this.textureX, this.textureY);
/* 1373 */     this.slideModel[90] = new ModelRendererTurbo(this, 1169, 1, this.textureX, this.textureY);
/* 1374 */     this.slideModel[91] = new ModelRendererTurbo(this, 1193, 1, this.textureX, this.textureY);
/* 1375 */     this.slideModel[92] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 1376 */     this.slideModel[93] = new ModelRendererTurbo(this, 1225, 1, this.textureX, this.textureY);
/* 1377 */     this.slideModel[94] = new ModelRendererTurbo(this, 1721, 73, this.textureX, this.textureY);
/* 1378 */     this.slideModel[95] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/* 1379 */     this.slideModel[96] = new ModelRendererTurbo(this, 1305, 1, this.textureX, this.textureY);
/* 1380 */     this.slideModel[97] = new ModelRendererTurbo(this, 1297, 201, this.textureX, this.textureY);
/* 1381 */     this.slideModel[98] = new ModelRendererTurbo(this, 1337, 1, this.textureX, this.textureY);
/* 1382 */     this.slideModel[99] = new ModelRendererTurbo(this, 1537, 1, this.textureX, this.textureY);
/* 1383 */     this.slideModel[100] = new ModelRendererTurbo(this, 1569, 1, this.textureX, this.textureY);
/* 1384 */     this.slideModel[101] = new ModelRendererTurbo(this, 1385, 1, this.textureX, this.textureY);
/* 1385 */     this.slideModel[102] = new ModelRendererTurbo(this, 1417, 1, this.textureX, this.textureY);
/* 1386 */     this.slideModel[103] = new ModelRendererTurbo(this, 1425, 1, this.textureX, this.textureY);
/* 1387 */     this.slideModel[104] = new ModelRendererTurbo(this, 1593, 1, this.textureX, this.textureY);
/* 1388 */     this.slideModel[105] = new ModelRendererTurbo(this, 1625, 1, this.textureX, this.textureY);
/* 1389 */     this.slideModel[106] = new ModelRendererTurbo(this, 1657, 1, this.textureX, this.textureY);
/* 1390 */     this.slideModel[107] = new ModelRendererTurbo(this, 1441, 1, this.textureX, this.textureY);
/* 1391 */     this.slideModel[108] = new ModelRendererTurbo(this, 1481, 1, this.textureX, this.textureY);
/* 1392 */     this.slideModel[109] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/*      */     
/* 1394 */     this.slideModel[0].addShapeBox(51.0F, -25.0F, -15.0F, 16, 10, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1395 */     this.slideModel[0].setRotationPoint(-13.0F, -32.5F, 2.0F);
/*      */     
/* 1397 */     this.slideModel[1].addShapeBox(51.0F, -25.0F, -15.0F, 12, 9, 26, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1398 */     this.slideModel[1].setRotationPoint(3.0F, -32.5F, 2.0F);
/*      */     
/* 1400 */     this.slideModel[2].addShapeBox(51.0F, -25.0F, -15.0F, 65, 10, 26, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 1401 */     this.slideModel[2].setRotationPoint(15.0F, -32.5F, 2.0F);
/*      */     
/* 1403 */     this.slideModel[3].addShapeBox(51.0F, -25.0F, -15.0F, 30, 1, 26, 0.0F, 0.0F, -1.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1404 */     this.slideModel[3].setRotationPoint(50.0F, -33.5F, 2.0F);
/*      */     
/* 1406 */     this.slideModel[4].addShapeBox(51.0F, -25.0F, -15.0F, 2, 10, 26, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1407 */     this.slideModel[4].setRotationPoint(-15.0F, -32.5F, 2.0F);
/*      */     
/* 1409 */     this.slideModel[5].addShapeBox(51.0F, -25.0F, -15.0F, 1, 12, 26, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1410 */     this.slideModel[5].setRotationPoint(-16.0F, -34.5F, 2.0F);
/*      */     
/* 1412 */     this.slideModel[6].addShapeBox(51.0F, -25.0F, -15.0F, 1, 14, 26, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1413 */     this.slideModel[6].setRotationPoint(-17.0F, -36.5F, 2.0F);
/*      */     
/* 1415 */     this.slideModel[7].addShapeBox(51.0F, -25.0F, -15.0F, 5, 18, 26, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1416 */     this.slideModel[7].setRotationPoint(-22.0F, -40.5F, 2.0F);
/*      */     
/* 1418 */     this.slideModel[8].addShapeBox(51.0F, -25.0F, -15.0F, 1, 18, 26, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1419 */     this.slideModel[8].setRotationPoint(-26.0F, -40.5F, 2.0F);
/*      */     
/* 1421 */     this.slideModel[9].addShapeBox(51.0F, -25.0F, -15.0F, 1, 18, 26, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1422 */     this.slideModel[9].setRotationPoint(-30.0F, -40.5F, 2.0F);
/*      */     
/* 1424 */     this.slideModel[10].addShapeBox(51.0F, -25.0F, -15.0F, 1, 18, 26, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1425 */     this.slideModel[10].setRotationPoint(-34.0F, -40.5F, 2.0F);
/*      */     
/* 1427 */     this.slideModel[11].addShapeBox(51.0F, -25.0F, -15.0F, 1, 18, 26, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1428 */     this.slideModel[11].setRotationPoint(-38.0F, -40.5F, 2.0F);
/*      */     
/* 1430 */     this.slideModel[12].addShapeBox(51.0F, -25.0F, -15.0F, 1, 18, 26, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1431 */     this.slideModel[12].setRotationPoint(-42.0F, -40.5F, 2.0F);
/*      */     
/* 1433 */     this.slideModel[13].addShapeBox(51.0F, -25.0F, -15.0F, 1, 18, 26, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1434 */     this.slideModel[13].setRotationPoint(-46.0F, -40.5F, 2.0F);
/*      */     
/* 1436 */     this.slideModel[14].addShapeBox(51.0F, -25.0F, -15.0F, 1, 10, 26, 0.0F, 2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.5F, -0.5F, 0.0F);
/* 1437 */     this.slideModel[14].setRotationPoint(-50.0F, -32.5F, 2.0F);
/*      */     
/* 1439 */     this.slideModel[15].addShapeBox(51.0F, -25.0F, -15.0F, 1, 10, 26, 0.0F, 2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, 4.75F, -0.5F, 0.0F);
/* 1440 */     this.slideModel[15].setRotationPoint(-54.0F, -32.5F, 2.0F);
/*      */     
/* 1442 */     this.slideModel[16].addShapeBox(51.0F, -25.0F, -15.0F, 1, 10, 26, 0.0F, 1.5F, 2.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, 2.0F, 0.0F, 1.5F, 2.0F, 0.0F, 4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, 4.75F, -0.5F, 0.0F);
/* 1443 */     this.slideModel[16].setRotationPoint(-58.0F, -32.5F, 2.0F);
/*      */     
/* 1445 */     this.slideModel[17].addShapeBox(51.0F, -25.0F, -15.0F, 1, 10, 26, 0.0F, 1.75F, 2.5F, 0.0F, -1.75F, 2.5F, 0.0F, -1.75F, 2.5F, 0.0F, 1.75F, 2.5F, 0.0F, 4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, 4.75F, -0.5F, 0.0F);
/* 1446 */     this.slideModel[17].setRotationPoint(-62.0F, -32.5F, 2.0F);
/*      */     
/* 1448 */     this.slideModel[18].addShapeBox(51.0F, -25.0F, -15.0F, 1, 10, 26, 0.0F, 1.75F, 3.0F, 0.0F, -1.75F, 3.0F, 0.0F, -1.75F, 3.0F, 0.0F, 1.75F, 3.0F, 0.0F, 4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, 4.75F, -0.5F, 0.0F);
/* 1449 */     this.slideModel[18].setRotationPoint(-66.0F, -32.5F, 2.0F);
/*      */     
/* 1451 */     this.slideModel[19].addShapeBox(51.0F, -25.0F, -15.0F, 1, 12, 26, 0.0F, 1.25F, 3.0F, 0.0F, -1.25F, 3.0F, 0.0F, -1.25F, 3.0F, 0.0F, 1.25F, 3.0F, 0.0F, 4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, 4.75F, -0.5F, 0.0F);
/* 1452 */     this.slideModel[19].setRotationPoint(-70.0F, -34.5F, 2.0F);
/*      */     
/* 1454 */     this.slideModel[20].addShapeBox(51.0F, -25.0F, -15.0F, 11, 22, 8, 0.0F, -5.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -0.5F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F, -5.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F);
/* 1455 */     this.slideModel[20].setRotationPoint(-84.0F, -44.5F, 2.0F);
/*      */     
/* 1457 */     this.slideModel[21].addShapeBox(51.0F, -25.0F, -15.0F, 11, 8, 26, 0.0F, -7.5F, 0.0F, -1.0F, -3.5F, 0.0F, -1.0F, -3.5F, 0.0F, -1.0F, -7.5F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1458 */     this.slideModel[21].setRotationPoint(-79.0F, -52.0F, 2.0F);
/*      */     
/* 1460 */     this.slideModel[22].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 24, 0.0F, -0.7F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.55F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1461 */     this.slideModel[22].setRotationPoint(-73.0F, -46.0F, 3.0F);
/*      */     
/* 1463 */     this.slideModel[23].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 24, 0.0F, 0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.3F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.3F, -0.5F, 0.0F);
/* 1464 */     this.slideModel[23].setRotationPoint(-72.0F, -47.5F, 3.0F);
/*      */     
/* 1466 */     this.slideModel[24].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 24, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.1F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F);
/* 1467 */     this.slideModel[24].setRotationPoint(-72.0F, -48.0F, 3.0F);
/*      */     
/* 1469 */     this.slideModel[25].addShapeBox(51.0F, -25.0F, -15.0F, 6, 2, 24, 0.0F, -0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1470 */     this.slideModel[25].setRotationPoint(-72.0F, -50.0F, 3.0F);
/*      */     
/* 1472 */     this.slideModel[26].addShapeBox(51.0F, -25.0F, -15.0F, 4, 2, 24, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1473 */     this.slideModel[26].setRotationPoint(-72.0F, -52.0F, 3.0F);
/*      */     
/* 1475 */     this.slideModel[27].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 24, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1476 */     this.slideModel[27].setRotationPoint(-61.5F, -52.0F, 3.0F);
/*      */     
/* 1478 */     this.slideModel[28].addShapeBox(51.0F, -25.0F, -15.0F, 2, 2, 24, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1479 */     this.slideModel[28].setRotationPoint(-65.5F, -50.0F, 3.0F);
/*      */     
/* 1481 */     this.slideModel[29].addShapeBox(51.0F, -25.0F, -15.0F, 3, 2, 24, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1482 */     this.slideModel[29].setRotationPoint(-63.5F, -50.0F, 3.0F);
/*      */     
/* 1484 */     this.slideModel[30].addShapeBox(51.0F, -25.0F, -15.0F, 10, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1485 */     this.slideModel[30].setRotationPoint(-60.5F, -52.0F, 3.0F);
/*      */     
/* 1487 */     this.slideModel[31].addShapeBox(51.0F, -25.0F, -15.0F, 2, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1488 */     this.slideModel[31].setRotationPoint(-50.5F, -52.0F, 3.0F);
/*      */     
/* 1490 */     this.slideModel[32].addShapeBox(51.0F, -25.0F, -15.0F, 3, 1, 24, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1491 */     this.slideModel[32].setRotationPoint(-53.5F, -53.0F, 3.0F);
/*      */     
/* 1493 */     this.slideModel[33].addShapeBox(51.0F, -25.0F, -15.0F, 2, 1, 24, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1494 */     this.slideModel[33].setRotationPoint(-50.5F, -53.0F, 3.0F);
/*      */     
/* 1496 */     this.slideModel[34].addShapeBox(51.0F, -25.0F, -15.0F, 8, 9, 24, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1497 */     this.slideModel[34].setRotationPoint(-48.5F, -53.0F, 3.0F);
/*      */     
/* 1499 */     this.slideModel[35].addShapeBox(51.0F, -25.0F, -15.0F, 1, 9, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -1.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1500 */     this.slideModel[35].setRotationPoint(-40.5F, -53.0F, 24.0F);
/*      */     
/* 1502 */     this.slideModel[36].addShapeBox(51.0F, -25.0F, -15.0F, 22, 9, 26, 0.0F, 0.0F, -0.5F, -3.0F, 0.5F, -0.5F, -3.0F, 0.5F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1503 */     this.slideModel[36].setRotationPoint(-39.5F, -53.0F, 2.0F);
/*      */     
/* 1505 */     this.slideModel[37].addShapeBox(51.0F, -25.0F, -15.0F, 5, 3, 26, 0.0F, -0.25F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1506 */     this.slideModel[37].setRotationPoint(-22.0F, -43.5F, 2.0F);
/*      */     
/* 1508 */     this.slideModel[38].addShapeBox(51.0F, -25.0F, -15.0F, 26, 21, 26, 0.0F, 0.5F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F);
/* 1509 */     this.slideModel[38].setRotationPoint(-48.0F, -43.5F, 2.0F);
/*      */     
/* 1511 */     this.slideModel[39].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 26, 0.0F, -1.0F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1512 */     this.slideModel[39].setRotationPoint(-26.0F, -44.0F, 2.0F);
/*      */     
/* 1514 */     this.slideModel[40].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 26, 0.0F, -1.0F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1515 */     this.slideModel[40].setRotationPoint(-30.0F, -44.0F, 2.0F);
/*      */     
/* 1517 */     this.slideModel[41].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 26, 0.0F, -1.0F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1518 */     this.slideModel[41].setRotationPoint(-38.0F, -44.0F, 2.0F);
/*      */     
/* 1520 */     this.slideModel[42].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 26, 0.0F, -1.0F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1521 */     this.slideModel[42].setRotationPoint(-34.0F, -44.0F, 2.0F);
/*      */     
/* 1523 */     this.slideModel[43].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 26, 0.0F, -1.0F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1524 */     this.slideModel[43].setRotationPoint(-46.0F, -44.0F, 2.0F);
/*      */     
/* 1526 */     this.slideModel[44].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 26, 0.0F, -1.0F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1527 */     this.slideModel[44].setRotationPoint(-42.0F, -44.0F, 2.0F);
/*      */     
/* 1529 */     this.slideModel[45].addShapeBox(51.0F, -25.0F, -15.0F, 1, 15, 26, 0.0F, 0.0F, -3.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1530 */     this.slideModel[45].setRotationPoint(-50.0F, -37.5F, 2.0F);
/*      */     
/* 1532 */     this.slideModel[46].addShapeBox(51.0F, -25.0F, -15.0F, 1, 13, 26, 0.0F, 0.0F, -2.75F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -2.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1533 */     this.slideModel[46].setRotationPoint(-51.0F, -35.5F, 2.0F);
/*      */     
/* 1535 */     this.slideModel[47].addShapeBox(51.0F, -25.0F, -15.0F, 15, 13, 26, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -2.75F, -0.5F, 0.0F, -2.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1536 */     this.slideModel[47].setRotationPoint(-66.0F, -35.5F, 2.0F);
/*      */     
/* 1538 */     this.slideModel[48].addShapeBox(51.0F, -25.0F, -15.0F, 2, 13, 26, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1539 */     this.slideModel[48].setRotationPoint(-68.0F, -35.5F, 2.0F);
/*      */     
/* 1541 */     this.slideModel[49].addShapeBox(51.0F, -25.0F, -15.0F, 3, 13, 26, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1542 */     this.slideModel[49].setRotationPoint(-71.0F, -35.5F, 2.0F);
/*      */     
/* 1544 */     this.slideModel[50].addShapeBox(51.0F, -25.0F, -15.0F, 2, 15, 26, 0.0F, -0.5F, 2.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 2.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 1545 */     this.slideModel[50].setRotationPoint(-73.0F, -37.5F, 2.0F);
/*      */     
/* 1547 */     this.slideModel[51].addShapeBox(51.0F, -25.0F, -15.0F, 2, 23, 8, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F);
/* 1548 */     this.slideModel[51].setRotationPoint(-74.5F, -45.5F, 2.0F);
/*      */     
/* 1550 */     this.slideModel[52].addShapeBox(51.0F, -25.0F, -15.0F, 5, 17, 26, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 1551 */     this.slideModel[52].setRotationPoint(-78.5F, -39.5F, 2.0F);
/*      */     
/* 1553 */     this.slideModel[53].addShapeBox(51.0F, -25.0F, -15.0F, 86, 1, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1554 */     this.slideModel[53].setRotationPoint(-83.5F, -23.0F, 2.0F);
/*      */     
/* 1556 */     this.slideModel[54].addShapeBox(51.0F, -25.0F, -15.0F, 65, 1, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.75F, -0.5F, -1.0F, 0.75F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1557 */     this.slideModel[54].setRotationPoint(15.0F, -23.0F, 2.0F);
/*      */     
/* 1559 */     this.slideModel[55].addShapeBox(51.0F, -25.0F, -15.0F, 63, 5, 28, 0.0F, 0.0F, 0.25F, -3.05F, 0.5F, 0.25F, -3.05F, 0.5F, 0.25F, -3.05F, 0.0F, 0.25F, -3.05F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1560 */     this.slideModel[55].setRotationPoint(-13.0F, -37.5F, 1.0F);
/*      */     
/* 1562 */     this.slideModel[56].addShapeBox(51.0F, -25.0F, -15.0F, 30, 5, 28, 0.0F, 0.0F, 0.25F, -3.1F, 0.25F, 0.25F, -3.1F, 0.25F, 0.25F, -3.1F, 0.0F, 0.25F, -3.1F, 0.0F, 0.0F, -1.25F, 0.25F, -1.0F, -1.25F, 0.25F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1563 */     this.slideModel[56].setRotationPoint(50.5F, -37.5F, 1.0F);
/*      */     
/* 1565 */     this.slideModel[57].addShapeBox(51.0F, -25.0F, -15.0F, 3, 5, 26, 0.0F, 0.5F, 2.5F, -1.0F, 0.0F, 0.25F, -2.05F, 0.0F, 0.25F, -2.05F, 0.5F, 2.5F, -1.0F, 0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.1F);
/* 1566 */     this.slideModel[57].setRotationPoint(-16.0F, -37.5F, 2.0F);
/*      */     
/* 1568 */     this.slideModel[58].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 26, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1569 */     this.slideModel[58].setRotationPoint(-17.0F, -40.0F, 2.0F);
/*      */     
/* 1571 */     this.slideModel[59].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 26, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1572 */     this.slideModel[59].setRotationPoint(-17.0F, -42.5F, 2.0F);
/*      */     
/* 1574 */     this.slideModel[60].addShapeBox(51.0F, -25.0F, -15.0F, 7, 10, 9, 0.0F, -5.25F, -2.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -5.25F, -2.25F, -8.5F, -3.25F, -0.75F, -0.5F, -1.65F, -0.75F, -0.5F, -1.65F, -0.75F, 0.0F, -3.25F, -0.75F, -8.5F);
/* 1575 */     this.slideModel[60].setRotationPoint(-86.0F, -44.5F, 19.0F);
/*      */     
/* 1577 */     this.slideModel[61].addShapeBox(51.0F, -25.0F, -15.0F, 8, 1, 23, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1578 */     this.slideModel[61].setRotationPoint(-68.5F, -51.75F, 3.5F);
/*      */     
/* 1580 */     this.slideModel[62].addShapeBox(51.0F, -25.0F, -15.0F, 29, 3, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -9.0F, 0.0F, -0.5F, -9.0F, 4.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 4.0F, -0.5F, 0.0F);
/* 1581 */     this.slideModel[62].setRotationPoint(-46.5F, -55.0F, 15.0F);
/*      */     
/* 1583 */     this.slideModel[63].addShapeBox(51.0F, -25.0F, -15.0F, 29, 3, 10, 0.0F, 0.0F, -0.5F, -9.0F, 0.5F, -0.5F, -9.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 4.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 4.0F, -0.5F, 0.0F);
/* 1584 */     this.slideModel[63].setRotationPoint(-46.5F, -55.0F, 5.0F);
/*      */     
/* 1586 */     this.slideModel[64].addShapeBox(51.0F, -25.0F, -15.0F, 7, 10, 9, 0.0F, -5.25F, -2.25F, -8.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -5.25F, -2.25F, -0.5F, -3.25F, -0.75F, -8.5F, -1.65F, -0.75F, 0.0F, -1.65F, -0.75F, -0.5F, -3.25F, -0.75F, -0.5F);
/* 1587 */     this.slideModel[64].setRotationPoint(-86.0F, -44.5F, 2.0F);
/*      */     
/* 1589 */     this.slideModel[65].addShapeBox(51.0F, -25.0F, -15.0F, 1, 9, 4, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -1.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1590 */     this.slideModel[65].setRotationPoint(-40.5F, -53.0F, 2.0F);
/*      */     
/* 1592 */     this.slideModel[66].addShapeBox(51.0F, -25.0F, -15.0F, 11, 22, 8, 0.0F, -5.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -0.5F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F, -5.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F);
/* 1593 */     this.slideModel[66].setRotationPoint(-84.0F, -44.5F, 19.5F);
/*      */     
/* 1595 */     this.slideModel[67].addShapeBox(51.0F, -25.0F, -15.0F, 2, 23, 8, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F);
/* 1596 */     this.slideModel[67].setRotationPoint(-74.5F, -45.5F, 19.0F);
/*      */     
/* 1598 */     this.slideModel[68].addShapeBox(51.0F, -25.0F, -15.0F, 7, 9, 9, 0.0F, -6.0F, 0.0F, -0.5F, 0.6F, 0.0F, -0.5F, 0.6F, 0.0F, 0.0F, -5.5F, 0.0F, -8.5F, -5.2F, 0.5F, -0.5F, -1.65F, 0.5F, -0.5F, -1.65F, 0.5F, 0.0F, -4.5F, 0.5F, -8.5F);
/* 1599 */     this.slideModel[68].setRotationPoint(-88.25F, -35.25F, 19.0F);
/*      */     
/* 1601 */     this.slideModel[69].addShapeBox(51.0F, -25.0F, -15.0F, 24, 16, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1602 */     this.slideModel[69].setRotationPoint(-73.0F, -48.5F, 3.5F);
/*      */     
/* 1604 */     this.slideModel[70].addShapeBox(51.0F, -25.0F, -15.0F, 30, 1, 25, 0.0F, 0.0F, 0.25F, -3.5F, 0.5F, 0.25F, -3.5F, 0.5F, 0.25F, -3.5F, 0.0F, 0.25F, -3.5F, 0.0F, -0.25F, -1.45F, 0.5F, -0.25F, -1.45F, 0.5F, -0.25F, -1.45F, 0.0F, -0.25F, -1.45F);
/* 1605 */     this.slideModel[70].setRotationPoint(-13.0F, -38.5F, 2.5F);
/*      */     
/* 1607 */     this.slideModel[71].addShapeBox(51.0F, -25.0F, -15.0F, 4, 2, 9, 0.0F, -2.25F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, -0.5F, -3.1F, 0.5F, -0.5F, -0.1F, -0.25F, 0.0F, -1.35F, -0.25F, 0.0F, -1.35F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F);
/* 1608 */     this.slideModel[71].setRotationPoint(-86.0F, -25.25F, 19.5F);
/*      */     
/* 1610 */     this.slideModel[72].addShapeBox(51.0F, -25.0F, -15.0F, 4, 2, 9, 0.0F, -3.1F, 0.5F, -0.5F, -0.85F, 0.5F, -0.5F, -0.85F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, -0.1F, -0.25F, -0.5F, -1.35F, -0.25F, -0.5F, -1.35F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F);
/* 1611 */     this.slideModel[72].setRotationPoint(-86.0F, -25.25F, 1.5F);
/*      */     
/* 1613 */     this.slideModel[73].addShapeBox(51.0F, -25.0F, -15.0F, 7, 9, 9, 0.0F, -5.5F, 0.0F, -8.5F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, -0.5F, -6.0F, 0.0F, -0.5F, -4.5F, 0.5F, -8.5F, -1.65F, 0.5F, 0.0F, -1.65F, 0.5F, -0.5F, -5.2F, 0.5F, -0.5F);
/* 1614 */     this.slideModel[73].setRotationPoint(-88.25F, -35.25F, 2.0F);
/*      */     
/* 1616 */     this.slideModel[74].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1617 */     this.slideModel[74].setRotationPoint(-72.0F, -42.5F, 26.0F);
/*      */     
/* 1619 */     this.slideModel[75].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1620 */     this.slideModel[75].setRotationPoint(-72.0F, -43.5F, 26.0F);
/*      */     
/* 1622 */     this.slideModel[76].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1623 */     this.slideModel[76].setRotationPoint(-71.0F, -45.5F, 26.0F);
/*      */     
/* 1625 */     this.slideModel[77].addShapeBox(51.0F, -25.0F, -15.0F, 2, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1626 */     this.slideModel[77].setRotationPoint(-70.0F, -46.5F, 26.0F);
/*      */     
/* 1628 */     this.slideModel[78].addShapeBox(51.0F, -25.0F, -15.0F, 3, 11, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1629 */     this.slideModel[78].setRotationPoint(-68.0F, -47.5F, 26.0F);
/*      */     
/* 1631 */     this.slideModel[79].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 3, 0.0F, 0.0F, 1.25F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1632 */     this.slideModel[79].setRotationPoint(-65.0F, -46.5F, 26.0F);
/*      */     
/* 1634 */     this.slideModel[80].addShapeBox(51.0F, -25.0F, -15.0F, 14, 3, 3, 0.0F, -0.5F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1635 */     this.slideModel[80].setRotationPoint(-64.0F, -46.5F, 26.0F);
/*      */     
/* 1637 */     this.slideModel[81].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 3, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1638 */     this.slideModel[81].setRotationPoint(-64.5F, -46.5F, 26.0F);
/*      */     
/* 1640 */     this.slideModel[82].addShapeBox(51.0F, -25.0F, -15.0F, 2, 3, 3, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 1.5F, -0.5F);
/* 1641 */     this.slideModel[82].setRotationPoint(-50.75F, -46.5F, 26.0F);
/*      */     
/* 1643 */     this.slideModel[83].addShapeBox(51.0F, -25.0F, -15.0F, 12, 5, 3, 0.0F, -0.5F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, -0.5F, 0.0F, -0.25F, -4.75F, 0.0F, -0.25F, -4.75F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 1644 */     this.slideModel[83].setRotationPoint(-62.0F, -42.25F, 26.0F);
/*      */     
/* 1646 */     this.slideModel[84].addShapeBox(51.0F, -25.0F, -15.0F, 3, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1647 */     this.slideModel[84].setRotationPoint(-71.0F, -42.5F, 26.0F);
/*      */     
/* 1649 */     this.slideModel[85].addShapeBox(51.0F, -25.0F, -15.0F, 3, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1650 */     this.slideModel[85].setRotationPoint(-65.0F, -43.25F, 26.0F);
/*      */     
/* 1652 */     this.slideModel[86].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1653 */     this.slideModel[86].setRotationPoint(-72.0F, -42.5F, 1.75F);
/*      */     
/* 1655 */     this.slideModel[87].addShapeBox(51.0F, -25.0F, -15.0F, 1, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1656 */     this.slideModel[87].setRotationPoint(-72.0F, -43.5F, 1.75F);
/*      */     
/* 1658 */     this.slideModel[88].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1659 */     this.slideModel[88].setRotationPoint(-71.0F, -45.5F, 1.75F);
/*      */     
/* 1661 */     this.slideModel[89].addShapeBox(51.0F, -25.0F, -15.0F, 2, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1662 */     this.slideModel[89].setRotationPoint(-70.0F, -46.5F, 1.75F);
/*      */     
/* 1664 */     this.slideModel[90].addShapeBox(51.0F, -25.0F, -15.0F, 3, 11, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1665 */     this.slideModel[90].setRotationPoint(-68.0F, -47.5F, 1.75F);
/*      */     
/* 1667 */     this.slideModel[91].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 3, 0.0F, 0.0F, 1.25F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1668 */     this.slideModel[91].setRotationPoint(-65.0F, -46.5F, 1.75F);
/*      */     
/* 1670 */     this.slideModel[92].addShapeBox(51.0F, -25.0F, -15.0F, 14, 3, 3, 0.0F, -0.5F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1671 */     this.slideModel[92].setRotationPoint(-64.0F, -46.5F, 1.75F);
/*      */     
/* 1673 */     this.slideModel[93].addShapeBox(51.0F, -25.0F, -15.0F, 1, 3, 3, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1674 */     this.slideModel[93].setRotationPoint(-64.5F, -46.5F, 1.75F);
/*      */     
/* 1676 */     this.slideModel[94].addShapeBox(51.0F, -25.0F, -15.0F, 12, 5, 3, 0.0F, -0.5F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, -0.5F, 0.0F, -0.25F, -4.75F, 0.0F, -0.25F, -4.75F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 1677 */     this.slideModel[94].setRotationPoint(-62.0F, -42.25F, 1.75F);
/*      */     
/* 1679 */     this.slideModel[95].addShapeBox(51.0F, -25.0F, -15.0F, 3, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1680 */     this.slideModel[95].setRotationPoint(-71.0F, -42.5F, 1.75F);
/*      */     
/* 1682 */     this.slideModel[96].addShapeBox(51.0F, -25.0F, -15.0F, 3, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1683 */     this.slideModel[96].setRotationPoint(-65.0F, -43.25F, 1.75F);
/*      */     
/* 1685 */     this.slideModel[97].addShapeBox(51.0F, -25.0F, -15.0F, 3, 3, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1686 */     this.slideModel[97].setRotationPoint(-68.0F, -44.5F, 1.0F);
/*      */     
/* 1688 */     this.slideModel[98].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1689 */     this.slideModel[98].setRotationPoint(-52.75F, -47.0F, 27.5F);
/*      */     
/* 1691 */     this.slideModel[99].addShapeBox(51.0F, -25.0F, -15.0F, 4, 6, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1692 */     this.slideModel[99].setRotationPoint(-52.75F, -46.0F, 27.5F);
/*      */     
/* 1694 */     this.slideModel[100].addShapeBox(51.0F, -25.0F, -15.0F, 4, 6, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, -1.5F, 0.0F, -3.75F, -0.5F, 0.0F, -3.75F, -0.5F, 0.0F, 1.25F, -1.5F, 0.0F);
/* 1695 */     this.slideModel[100].setRotationPoint(-52.75F, -40.0F, 27.5F);
/*      */     
/* 1697 */     this.slideModel[101].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1698 */     this.slideModel[101].setRotationPoint(-48.75F, -46.0F, 27.5F);
/*      */     
/* 1700 */     this.slideModel[102].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1701 */     this.slideModel[102].setRotationPoint(-48.75F, -42.0F, 27.5F);
/*      */     
/* 1703 */     this.slideModel[103].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1704 */     this.slideModel[103].setRotationPoint(-48.75F, -44.0F, 27.5F);
/*      */     
/* 1706 */     this.slideModel[104].addShapeBox(51.0F, -25.0F, -15.0F, 4, 1, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1707 */     this.slideModel[104].setRotationPoint(-52.75F, -47.0F, 0.75F);
/*      */     
/* 1709 */     this.slideModel[105].addShapeBox(51.0F, -25.0F, -15.0F, 4, 6, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1710 */     this.slideModel[105].setRotationPoint(-52.75F, -46.0F, 0.75F);
/*      */     
/* 1712 */     this.slideModel[106].addShapeBox(51.0F, -25.0F, -15.0F, 4, 6, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, -1.5F, 0.0F, -3.75F, -0.5F, 0.0F, -3.75F, -0.5F, 0.0F, 1.25F, -1.5F, 0.0F);
/* 1713 */     this.slideModel[106].setRotationPoint(-52.75F, -40.0F, 0.75F);
/*      */     
/* 1715 */     this.slideModel[107].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1716 */     this.slideModel[107].setRotationPoint(-48.75F, -46.0F, 0.75F);
/*      */     
/* 1718 */     this.slideModel[108].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1719 */     this.slideModel[108].setRotationPoint(-48.75F, -42.0F, 0.75F);
/*      */     
/* 1721 */     this.slideModel[109].addShapeBox(51.0F, -25.0F, -15.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1722 */     this.slideModel[109].setRotationPoint(-48.75F, -44.0F, 0.75F);
/*      */     
/*      */ 
/*      */ 
/* 1726 */     this.scopeAttachPoint = new Vector3f(6.0F, 7.4375F, 0.0F);
/*      */     
/*      */ 
/* 1729 */     translateAll(0.0F, -44.5F, 0.0F);
/* 1730 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*      */     
/*      */ 
/* 1733 */     this.gunSlideDistance = 2.5F;
/* 1734 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 1736 */     this.tiltGun = 4.0F;
/* 1737 */     this.rotateGunVertical = 12.0F;
/* 1738 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*      */     
/* 1740 */     this.rotateClipVertical = 13.0F;
/* 1741 */     this.translateClip = new Vector3f(0.0F, -18.0F, 0.0F);
/*      */     
/*      */ 
/* 1744 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modeldeagle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */