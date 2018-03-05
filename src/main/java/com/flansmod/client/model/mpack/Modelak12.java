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
/*      */ public class Modelak12
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelak12()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ʋ'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 553, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 1033, 1, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 1073, 1, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 1113, 1, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 1153, 1, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 1521, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 1553, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 1577, 17, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1801, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1921, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1817, 17, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 585, 25, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 673, 25, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 761, 25, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 849, 25, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 1025, 25, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 1113, 25, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 1201, 25, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1561, 25, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 1649, 25, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 1737, 25, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 1897, 25, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 1273, 33, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1361, 33, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 1137, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 1969, 25, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 537, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 617, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 1417, 33, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 1473, 33, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 2001, 25, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 1809, 41, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 1865, 41, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 561, 25, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 1537, 33, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 617, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 761, 49, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 825, 25, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 913, 49, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 1057, 49, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 1553, 49, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 1969, 41, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 1681, 49, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 1449, 33, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 1177, 49, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 593, 49, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 1233, 49, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 1097, 1, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 1329, 1, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 889, 49, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 1905, 49, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 1273, 57, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 1929, 49, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 1369, 65, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 1681, 65, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 649, 25, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 913, 25, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 2001, 57, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 1185, 65, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 1233, 65, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 1809, 65, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 2001, 1, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 809, 73, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 1273, 73, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 745, 49, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 1529, 73, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 1849, 41, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 657, 9, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 1897, 17, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 1097, 25, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 1185, 25, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 1273, 25, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 1305, 25, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 609, 81, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 1521, 81, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 1321, 73, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 1633, 25, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 1041, 49, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 1825, 81, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 1585, 81, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 1145, 81, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 1785, 49, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 1985, 65, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 793, 81, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1233, 81, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 1641, 81, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1377, 57, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 889, 65, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 593, 65, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1145, 73, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 1249, 81, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 1257, 89, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 1097, 1, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 1137, 1, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 1161, 1, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 1329, 1, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 1353, 1, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 1529, 1, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 633, 9, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 1505, 9, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 1529, 9, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 2001, 9, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 569, 25, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 585, 25, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 673, 25, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 745, 25, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 761, 25, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 833, 25, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 849, 25, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 921, 25, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 1897, 25, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1969, 25, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 2009, 25, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 2033, 25, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 569, 33, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 585, 33, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 657, 33, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 673, 33, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 745, 33, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 761, 33, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 833, 33, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 849, 33, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 921, 33, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 1273, 33, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 1425, 33, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 1449, 33, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 1481, 33, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1561, 33, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 1809, 33, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 2033, 33, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 1425, 41, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 593, 49, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 617, 49, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 745, 49, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 889, 49, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 921, 49, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1057, 49, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 1177, 49, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 1681, 49, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 1817, 49, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 1937, 49, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 1969, 49, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1993, 49, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 1065, 57, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 1409, 57, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 1561, 57, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 1521, 65, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 1905, 65, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 1985, 65, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 969, 73, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 1833, 97, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 1817, 105, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 1737, 33, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 1905, 49, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 1305, 73, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 1561, 65, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 1537, 41, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 529, 113, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 689, 113, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 1153, 113, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 1273, 113, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 1417, 113, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 1633, 97, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 1025, 113, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 1033, 9, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1073, 9, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1113, 9, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1913, 97, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 817, 113, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 1545, 113, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1593, 113, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 857, 113, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 1649, 113, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 1689, 113, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 1953, 113, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 1993, 113, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 401, 121, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 889, 121, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 1729, 121, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 161, 129, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 977, 121, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 817, 129, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 1129, 129, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 1177, 129, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 1225, 129, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 1401, 113, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 2025, 81, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 1561, 129, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 673, 121, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 1009, 129, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 1905, 129, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 33, 137, this.textureX, this.textureY);
/*  350 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/*  351 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 1801, 129, this.textureX, this.textureY);
/*  353 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 289, 137, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 529, 89, this.textureX, this.textureY);
/*  355 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 1921, 129, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 305, 137, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 393, 137, this.textureX, this.textureY);
/*  359 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 441, 137, this.textureX, this.textureY);
/*  360 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 681, 137, this.textureX, this.textureY);
/*  361 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 649, 129, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 729, 137, this.textureX, this.textureY);
/*  363 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  365 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 1033, 25, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 1161, 97, this.textureX, this.textureY);
/*  367 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 1273, 97, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 1465, 57, this.textureX, this.textureY);
/*  369 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 1313, 97, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 1361, 97, this.textureX, this.textureY);
/*  371 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 1409, 97, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 1977, 81, this.textureX, this.textureY);
/*  373 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 1953, 97, this.textureX, this.textureY);
/*  374 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/*  375 */     this.gunModel['š'] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/*  377 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 529, 89, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/*  379 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 777, 97, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 889, 97, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 1457, 97, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 1505, 97, this.textureX, this.textureY);
/*  383 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 1553, 97, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 1601, 97, this.textureX, this.textureY);
/*  385 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 1625, 97, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1665, 105, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 1897, 105, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 1913, 105, this.textureX, this.textureY);
/*  389 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  391 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  393 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 385, 113, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 817, 113, this.textureX, this.textureY);
/*  397 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 857, 113, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 1121, 113, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 1401, 113, this.textureX, this.textureY);
/*  400 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 1417, 113, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 1545, 113, this.textureX, this.textureY);
/*  402 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 1585, 113, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 1681, 113, this.textureX, this.textureY);
/*  404 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 1721, 113, this.textureX, this.textureY);
/*  405 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 1897, 113, this.textureX, this.textureY);
/*  406 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 1985, 113, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 2025, 113, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  409 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 281, 121, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 329, 121, this.textureX, this.textureY);
/*  411 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 401, 121, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 433, 121, this.textureX, this.textureY);
/*  414 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 513, 121, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 529, 121, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 657, 121, this.textureX, this.textureY);
/*  418 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 673, 121, this.textureX, this.textureY);
/*  419 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 689, 121, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 889, 121, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 961, 121, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 977, 121, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 1545, 121, this.textureX, this.textureY);
/*  424 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 1585, 121, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 1681, 121, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 1721, 121, this.textureX, this.textureY);
/*  427 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 1801, 121, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 1985, 121, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 2025, 121, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 153, 129, this.textureX, this.textureY);
/*  431 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/*  432 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 841, 129, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 1009, 129, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 1169, 129, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 1217, 129, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 1257, 129, this.textureX, this.textureY);
/*  439 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 1561, 129, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 1585, 129, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1929, 129, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 2033, 129, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 25, 137, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 57, 137, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 313, 137, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 337, 137, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 441, 137, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 713, 137, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 729, 137, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 801, 137, this.textureX, this.textureY);
/*  454 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 921, 137, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 937, 137, this.textureX, this.textureY);
/*      */     
/*  457 */     this.gunModel[0].addShapeBox(25.0F, -5.0F, -8.0F, 58, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  458 */     this.gunModel[0].setRotationPoint(0.0F, -29.0F, 0.0F);
/*      */     
/*  460 */     this.gunModel[1].addShapeBox(25.0F, -5.0F, -8.0F, 50, 16, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  461 */     this.gunModel[1].setRotationPoint(-50.0F, -42.0F, 0.0F);
/*      */     
/*  463 */     this.gunModel[2].addShapeBox(25.0F, -5.0F, -8.0F, 23, 13, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  464 */     this.gunModel[2].setRotationPoint(0.0F, -42.0F, 0.0F);
/*      */     
/*  466 */     this.gunModel[3].addShapeBox(25.0F, -5.0F, -8.0F, 25, 13, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  467 */     this.gunModel[3].setRotationPoint(33.0F, -42.0F, 0.0F);
/*      */     
/*  469 */     this.gunModel[4].addShapeBox(25.0F, -5.0F, -8.0F, 10, 9, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  470 */     this.gunModel[4].setRotationPoint(23.0F, -42.0F, 0.0F);
/*      */     
/*  472 */     this.gunModel[5].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  473 */     this.gunModel[5].setRotationPoint(23.0F, -33.0F, 0.0F);
/*      */     
/*  475 */     this.gunModel[6].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  476 */     this.gunModel[6].setRotationPoint(23.0F, -30.0F, 0.0F);
/*      */     
/*  478 */     this.gunModel[7].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  479 */     this.gunModel[7].setRotationPoint(32.0F, -30.0F, 0.0F);
/*      */     
/*  481 */     this.gunModel[8].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  482 */     this.gunModel[8].setRotationPoint(32.0F, -33.0F, 0.0F);
/*      */     
/*  484 */     this.gunModel[9].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  485 */     this.gunModel[9].setRotationPoint(38.5F, -33.5F, 0.5F);
/*      */     
/*  487 */     this.gunModel[10].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  488 */     this.gunModel[10].setRotationPoint(39.5F, -33.5F, 0.5F);
/*      */     
/*  490 */     this.gunModel[11].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  491 */     this.gunModel[11].setRotationPoint(40.5F, -33.5F, 0.5F);
/*      */     
/*  493 */     this.gunModel[12].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  494 */     this.gunModel[12].setRotationPoint(5.5F, -32.5F, 0.5F);
/*      */     
/*  496 */     this.gunModel[13].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  497 */     this.gunModel[13].setRotationPoint(6.5F, -32.5F, 0.5F);
/*      */     
/*  499 */     this.gunModel[14].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  500 */     this.gunModel[14].setRotationPoint(7.5F, -32.5F, 0.5F);
/*      */     
/*  502 */     this.gunModel[15].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  503 */     this.gunModel[15].setRotationPoint(-12.0F, -29.1F, 0.5F);
/*      */     
/*  505 */     this.gunModel[16].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  506 */     this.gunModel[16].setRotationPoint(-11.0F, -29.1F, 0.5F);
/*      */     
/*  508 */     this.gunModel[17].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  509 */     this.gunModel[17].setRotationPoint(-10.0F, -29.1F, 0.5F);
/*      */     
/*  511 */     this.gunModel[18].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  512 */     this.gunModel[18].setRotationPoint(-44.5F, -31.5F, 0.5F);
/*      */     
/*  514 */     this.gunModel[19].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  515 */     this.gunModel[19].setRotationPoint(-43.5F, -31.5F, 0.5F);
/*      */     
/*  517 */     this.gunModel[20].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  518 */     this.gunModel[20].setRotationPoint(-42.5F, -31.5F, 0.5F);
/*      */     
/*  520 */     this.gunModel[21].addShapeBox(25.0F, -5.0F, -8.0F, 75, 2, 18, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  521 */     this.gunModel[21].setRotationPoint(-50.0F, -44.0F, -1.0F);
/*      */     
/*  523 */     this.gunModel[22].addShapeBox(25.0F, -5.0F, -8.0F, 69, 11, 18, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  524 */     this.gunModel[22].setRotationPoint(-44.0F, -55.0F, -1.0F);
/*      */     
/*  526 */     this.gunModel[23].addShapeBox(25.0F, -5.0F, -8.0F, 6, 11, 18, 0.0F, -6.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, -6.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  527 */     this.gunModel[23].setRotationPoint(-50.0F, -55.0F, -1.0F);
/*      */     
/*  529 */     this.gunModel[24].addShapeBox(25.0F, -5.0F, -8.0F, 122, 2, 6, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  530 */     this.gunModel[24].setRotationPoint(-42.0F, -57.0F, 5.0F);
/*      */     
/*  532 */     this.gunModel[25].addShapeBox(25.0F, -5.0F, -8.0F, 124, 1, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  533 */     this.gunModel[25].setRotationPoint(-44.0F, -56.0F, 4.0F);
/*      */     
/*  535 */     this.gunModel[26].addShapeBox(25.0F, -5.0F, -8.0F, 55, 1, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  536 */     this.gunModel[26].setRotationPoint(25.0F, -55.0F, 3.0F);
/*      */     
/*  538 */     this.gunModel[27].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 11, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -1.6F, 0.0F, 0.0F, -1.6F, 0.0F, 0.0F, 0.3F, -2.0F, 0.0F, 0.3F, -2.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
/*  539 */     this.gunModel[27].setRotationPoint(25.0F, -54.0F, 3.0F);
/*      */     
/*  541 */     this.gunModel[28].addShapeBox(25.0F, -5.0F, -8.0F, 32, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  542 */     this.gunModel[28].setRotationPoint(-48.0F, -26.0F, 1.0F);
/*      */     
/*  544 */     this.gunModel[29].addShapeBox(25.0F, -5.0F, -8.0F, 32, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/*  545 */     this.gunModel[29].setRotationPoint(-48.0F, -24.0F, 1.0F);
/*      */     
/*  547 */     this.gunModel[30].addShapeBox(25.0F, -5.0F, -8.0F, 29, 2, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[30].setRotationPoint(-45.0F, -22.0F, 1.0F);
/*      */     
/*  550 */     this.gunModel[31].addShapeBox(25.0F, -5.0F, -8.0F, 26, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  551 */     this.gunModel[31].setRotationPoint(-42.0F, -20.0F, 1.0F);
/*      */     
/*  553 */     this.gunModel[32].addShapeBox(25.0F, -5.0F, -8.0F, 26, 2, 14, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/*  554 */     this.gunModel[32].setRotationPoint(-42.0F, -18.0F, 1.0F);
/*      */     
/*  556 */     this.gunModel[33].addShapeBox(25.0F, -5.0F, -8.0F, 26, 4, 14, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/*  557 */     this.gunModel[33].setRotationPoint(-42.0F, -16.0F, 1.0F);
/*      */     
/*  559 */     this.gunModel[34].addShapeBox(25.0F, -5.0F, -8.0F, 26, 3, 14, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/*  560 */     this.gunModel[34].setRotationPoint(-42.0F, -12.0F, 1.0F);
/*      */     
/*  562 */     this.gunModel[35].addShapeBox(25.0F, -5.0F, -8.0F, 26, 2, 15, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  563 */     this.gunModel[35].setRotationPoint(-43.0F, -9.0F, 0.5F);
/*      */     
/*  565 */     this.gunModel[36].addShapeBox(25.0F, -5.0F, -8.0F, 26, 2, 15, 0.0F, -1.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[36].setRotationPoint(-44.0F, -7.0F, 0.5F);
/*      */     
/*  568 */     this.gunModel[37].addShapeBox(25.0F, -5.0F, -8.0F, 26, 2, 15, 0.0F, -1.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[37].setRotationPoint(-45.25F, -5.0F, 0.5F);
/*      */     
/*  571 */     this.gunModel[38].addShapeBox(25.0F, -5.0F, -8.0F, 26, 5, 15, 0.0F, -1.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/*  572 */     this.gunModel[38].setRotationPoint(-46.25F, -3.0F, 0.5F);
/*      */     
/*  574 */     this.gunModel[39].addShapeBox(25.0F, -5.0F, -8.0F, 26, 4, 15, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/*  575 */     this.gunModel[39].setRotationPoint(-48.25F, 2.0F, 0.5F);
/*      */     
/*  577 */     this.gunModel[40].addShapeBox(25.0F, -5.0F, -8.0F, 26, 4, 15, 0.0F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[40].setRotationPoint(-51.25F, 6.0F, 0.5F);
/*      */     
/*  580 */     this.gunModel[41].addShapeBox(25.0F, -5.0F, -8.0F, 26, 2, 15, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[41].setRotationPoint(-51.25F, 10.0F, 0.5F);
/*      */     
/*  583 */     this.gunModel[42].addShapeBox(25.0F, -5.0F, -8.0F, 26, 1, 15, 0.0F, -1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  584 */     this.gunModel[42].setRotationPoint(-51.25F, 12.0F, 0.5F);
/*      */     
/*  586 */     this.gunModel[43].addShapeBox(25.0F, -5.0F, -8.0F, 26, 3, 15, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  587 */     this.gunModel[43].setRotationPoint(-51.25F, 13.0F, 0.5F);
/*      */     
/*  589 */     this.gunModel[44].addShapeBox(25.0F, -5.0F, -8.0F, 24, 1, 15, 0.0F, -1.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  590 */     this.gunModel[44].setRotationPoint(-51.25F, 16.0F, 0.5F);
/*      */     
/*  592 */     this.gunModel[45].addShapeBox(25.0F, -5.0F, -8.0F, 26, 3, 15, 0.0F, -1.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[45].setRotationPoint(-51.25F, 17.0F, 0.5F);
/*      */     
/*  595 */     this.gunModel[46].addShapeBox(25.0F, -5.0F, -8.0F, 26, 2, 15, 0.0F, -1.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[46].setRotationPoint(-51.25F, 20.0F, 0.5F);
/*      */     
/*  598 */     this.gunModel[47].addShapeBox(25.0F, -5.0F, -8.0F, 26, 1, 15, 0.0F, -5.0F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F);
/*  599 */     this.gunModel[47].setRotationPoint(-51.25F, 22.0F, 0.5F);
/*      */     
/*  601 */     this.gunModel[48].addShapeBox(25.0F, -5.0F, -8.0F, 21, 1, 15, 0.0F, -5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -10.0F, -0.5F, 0.0F, -7.5F, -0.5F, 0.0F, -7.5F, -0.5F, 0.0F, -10.0F, -0.5F, 0.0F);
/*  602 */     this.gunModel[48].setRotationPoint(-46.25F, 23.0F, 0.5F);
/*      */     
/*  604 */     this.gunModel[49].addShapeBox(25.0F, -5.0F, -8.0F, 7, 4, 9, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, -3.0F, 0.0F);
/*  605 */     this.gunModel[49].setRotationPoint(-17.75F, -13.0F, 3.5F);
/*      */     
/*  607 */     this.gunModel[50].addShapeBox(25.0F, -5.0F, -8.0F, 15, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[50].setRotationPoint(-10.75F, -10.0F, 3.5F);
/*      */     
/*  610 */     this.gunModel[51].addShapeBox(25.0F, -5.0F, -8.0F, 4, 4, 9, 0.0F, 0.0F, -3.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, -3.0F, 0.0F, -1.75F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[51].setRotationPoint(4.25F, -13.0F, 3.5F);
/*      */     
/*  613 */     this.gunModel[52].addShapeBox(25.0F, -5.0F, -8.0F, 4, 14, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[52].setRotationPoint(5.25F, -27.0F, 3.5F);
/*      */     
/*  616 */     this.gunModel[53].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[53].setRotationPoint(5.25F, -13.0F, 3.5F);
/*      */     
/*  619 */     this.gunModel[54].addShapeBox(25.0F, -5.0F, -8.0F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[54].setRotationPoint(6.5F, -13.0F, 3.5F);
/*      */     
/*  622 */     this.gunModel[55].addShapeBox(25.0F, -5.0F, -8.0F, 3, 2, 9, 0.0F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  623 */     this.gunModel[55].setRotationPoint(9.5F, -15.0F, 3.5F);
/*      */     
/*  625 */     this.gunModel[56].addShapeBox(25.0F, -5.0F, -8.0F, 5, 12, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  626 */     this.gunModel[56].setRotationPoint(9.5F, -27.0F, 3.5F);
/*      */     
/*  628 */     this.gunModel[57].addShapeBox(25.0F, -5.0F, -8.0F, 1, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  629 */     this.gunModel[57].setRotationPoint(6.5F, -12.0F, 6.0F);
/*      */     
/*  631 */     this.gunModel[58].addShapeBox(25.0F, -5.0F, -8.0F, 1, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  632 */     this.gunModel[58].setRotationPoint(7.5F, -12.0F, 6.0F);
/*      */     
/*  634 */     this.gunModel[59].addShapeBox(25.0F, -5.0F, -8.0F, 4, 4, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  635 */     this.gunModel[59].setRotationPoint(-11.75F, -26.0F, 6.0F);
/*      */     
/*  637 */     this.gunModel[60].addShapeBox(25.0F, -5.0F, -8.0F, 4, 5, 4, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  638 */     this.gunModel[60].setRotationPoint(-11.75F, -22.0F, 6.0F);
/*      */     
/*  640 */     this.gunModel[61].addShapeBox(25.0F, -5.0F, -8.0F, 4, 2, 4, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  641 */     this.gunModel[61].setRotationPoint(-11.75F, -17.0F, 6.0F);
/*      */     
/*  643 */     this.gunModel[62].addShapeBox(25.0F, -5.0F, -8.0F, 6, 7, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  644 */     this.gunModel[62].setRotationPoint(58.0F, -36.0F, -1.0F);
/*      */     
/*  646 */     this.gunModel[63].addShapeBox(25.0F, -5.0F, -8.0F, 11, 8, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[63].setRotationPoint(58.0F, -44.0F, -1.0F);
/*      */     
/*  649 */     this.gunModel[64].addShapeBox(25.0F, -5.0F, -8.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  650 */     this.gunModel[64].setRotationPoint(69.0F, -44.0F, -1.0F);
/*      */     
/*  652 */     this.gunModel[65].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  653 */     this.gunModel[65].setRotationPoint(69.0F, -38.0F, -1.0F);
/*      */     
/*  655 */     this.gunModel[66].addShapeBox(25.0F, -5.0F, -8.0F, 7, 5, 17, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  656 */     this.gunModel[66].setRotationPoint(69.0F, -43.0F, -0.5F);
/*      */     
/*  658 */     this.gunModel[67].addShapeBox(25.0F, -5.0F, -8.0F, 9, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F);
/*  659 */     this.gunModel[67].setRotationPoint(69.0F, -44.0F, -1.0F);
/*      */     
/*  661 */     this.gunModel[68].addShapeBox(25.0F, -5.0F, -8.0F, 33, 6, 16, 0.0F, 0.0F, -0.5F, -2.0F, 4.0F, -0.5F, -2.0F, 4.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  662 */     this.gunModel[68].setRotationPoint(58.0F, -50.0F, 0.0F);
/*      */     
/*  664 */     this.gunModel[69].addShapeBox(25.0F, -5.0F, -8.0F, 4, 6, 18, 0.0F, -4.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, -4.0F, -0.5F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F);
/*  665 */     this.gunModel[69].setRotationPoint(91.0F, -50.0F, -1.0F);
/*      */     
/*  667 */     this.gunModel[70].addShapeBox(25.0F, -5.0F, -8.0F, 37, 2, 20, 0.0F, -1.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -5.0F, -1.0F, -0.5F, -5.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F);
/*  668 */     this.gunModel[70].setRotationPoint(92.0F, -46.0F, -1.0F);
/*      */     
/*  670 */     this.gunModel[71].addShapeBox(25.0F, -5.0F, -8.0F, 7, 1, 18, 0.0F, -0.3F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  671 */     this.gunModel[71].setRotationPoint(70.0F, -42.0F, -1.0F);
/*      */     
/*  673 */     this.gunModel[72].addShapeBox(25.0F, -5.0F, -8.0F, 6, 1, 18, 0.0F, -0.65F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F);
/*  674 */     this.gunModel[72].setRotationPoint(71.0F, -40.0F, -1.0F);
/*      */     
/*  676 */     this.gunModel[73].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 19, 0.0F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 0.0F, 0.0F, 0.55F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.55F, 0.0F, 0.0F);
/*  677 */     this.gunModel[73].setRotationPoint(77.65F, -42.0F, -2.0F);
/*      */     
/*  679 */     this.gunModel[74].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 19, 0.0F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 0.0F, 0.0F, 0.55F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.55F, 0.0F, 0.0F);
/*  680 */     this.gunModel[74].setRotationPoint(76.75F, -40.0F, -2.0F);
/*      */     
/*  682 */     this.gunModel[75].addShapeBox(25.0F, -5.0F, -8.0F, 1, 5, 16, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[75].setRotationPoint(77.75F, -43.0F, -0.5F);
/*      */     
/*  685 */     this.gunModel[76].addShapeBox(25.0F, -5.0F, -8.0F, 50, 1, 21, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  686 */     this.gunModel[76].setRotationPoint(78.65F, -42.0F, -2.5F);
/*      */     
/*  688 */     this.gunModel[77].addShapeBox(25.0F, -5.0F, -8.0F, 51, 1, 21, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/*  689 */     this.gunModel[77].setRotationPoint(77.65F, -40.0F, -2.5F);
/*      */     
/*  691 */     this.gunModel[78].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/*  692 */     this.gunModel[78].setRotationPoint(78.0F, -44.0F, -1.0F);
/*      */     
/*  694 */     this.gunModel[79].addShapeBox(25.0F, -5.0F, -8.0F, 50, 1, 21, 0.0F, -0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F);
/*  695 */     this.gunModel[79].setRotationPoint(78.65F, -44.0F, -2.5F);
/*      */     
/*  697 */     this.gunModel[80].addShapeBox(25.0F, -5.0F, -8.0F, 50, 5, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  698 */     this.gunModel[80].setRotationPoint(78.75F, -43.0F, -1.0F);
/*      */     
/*  700 */     this.gunModel[81].addShapeBox(25.0F, -5.0F, -8.0F, 51, 1, 21, 0.0F, -0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F);
/*  701 */     this.gunModel[81].setRotationPoint(77.65F, -38.0F, -2.5F);
/*      */     
/*  703 */     this.gunModel[82].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 18, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F);
/*  704 */     this.gunModel[82].setRotationPoint(75.5F, -38.0F, -1.0F);
/*      */     
/*  706 */     this.gunModel[83].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 21, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 1.0F, -1.0F);
/*  707 */     this.gunModel[83].setRotationPoint(76.0F, -38.0F, -2.0F);
/*      */     
/*  709 */     this.gunModel[84].addShapeBox(25.0F, -5.0F, -8.0F, 44, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  710 */     this.gunModel[84].setRotationPoint(95.0F, -48.0F, 2.0F);
/*      */     
/*  712 */     this.gunModel[85].addShapeBox(25.0F, -5.0F, -8.0F, 8, 2, 12, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  713 */     this.gunModel[85].setRotationPoint(95.0F, -50.0F, 2.0F);
/*      */     
/*  715 */     this.gunModel[86].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  716 */     this.gunModel[86].setRotationPoint(102.5F, -50.0F, 2.0F);
/*      */     
/*  718 */     this.gunModel[87].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 12, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  719 */     this.gunModel[87].setRotationPoint(102.5F, -49.0F, 2.0F);
/*      */     
/*  721 */     this.gunModel[88].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  722 */     this.gunModel[88].setRotationPoint(102.5F, -51.0F, 2.0F);
/*      */     
/*  724 */     this.gunModel[89].addShapeBox(25.0F, -5.0F, -8.0F, 12, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  725 */     this.gunModel[89].setRotationPoint(102.5F, -52.0F, 2.0F);
/*      */     
/*  727 */     this.gunModel[90].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  728 */     this.gunModel[90].setRotationPoint(113.5F, -51.0F, 2.0F);
/*      */     
/*  730 */     this.gunModel[91].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 12, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  731 */     this.gunModel[91].setRotationPoint(112.5F, -49.0F, 2.0F);
/*      */     
/*  733 */     this.gunModel[92].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  734 */     this.gunModel[92].setRotationPoint(113.5F, -50.0F, 2.0F);
/*      */     
/*  736 */     this.gunModel[93].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  737 */     this.gunModel[93].setRotationPoint(114.5F, -50.0F, 2.0F);
/*      */     
/*  739 */     this.gunModel[94].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  740 */     this.gunModel[94].setRotationPoint(120.0F, -50.0F, 2.0F);
/*      */     
/*  742 */     this.gunModel[95].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 12, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel[95].setRotationPoint(120.0F, -49.0F, 2.0F);
/*      */     
/*  745 */     this.gunModel[96].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  746 */     this.gunModel[96].setRotationPoint(120.0F, -51.0F, 2.0F);
/*      */     
/*  748 */     this.gunModel[97].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  749 */     this.gunModel[97].setRotationPoint(114.5F, -52.25F, 2.0F);
/*      */     
/*  751 */     this.gunModel[98].addShapeBox(25.0F, -5.0F, -8.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  752 */     this.gunModel[98].setRotationPoint(120.0F, -52.0F, 2.0F);
/*      */     
/*  754 */     this.gunModel[99].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  755 */     this.gunModel[99].setRotationPoint(130.0F, -51.0F, 2.0F);
/*      */     
/*  757 */     this.gunModel[100].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  758 */     this.gunModel[100].setRotationPoint(130.0F, -50.0F, 2.0F);
/*      */     
/*  760 */     this.gunModel[101].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 12, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  761 */     this.gunModel[101].setRotationPoint(129.0F, -49.0F, 2.0F);
/*      */     
/*  763 */     this.gunModel[102].addShapeBox(25.0F, -5.0F, -8.0F, 8, 2, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[102].setRotationPoint(131.0F, -50.0F, 2.0F);
/*      */     
/*  766 */     this.gunModel[103].addShapeBox(25.0F, -5.0F, -8.0F, 8, 2, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  767 */     this.gunModel[103].setRotationPoint(131.0F, -52.5F, 2.0F);
/*      */     
/*  769 */     this.gunModel[104].addShapeBox(25.0F, -5.0F, -8.0F, 44, 2, 12, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  770 */     this.gunModel[104].setRotationPoint(95.0F, -54.25F, 2.0F);
/*      */     
/*  772 */     this.gunModel[105].addShapeBox(25.0F, -5.0F, -8.0F, 44, 2, 8, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  773 */     this.gunModel[105].setRotationPoint(95.0F, -55.25F, 4.0F);
/*      */     
/*  775 */     this.gunModel[106].addShapeBox(25.0F, -5.0F, -8.0F, 8, 7, 18, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, -2.0F, -5.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel[106].setRotationPoint(59.0F, -36.0F, -1.0F);
/*      */     
/*  778 */     this.gunModel[107].addShapeBox(25.0F, -5.0F, -8.0F, 66, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  779 */     this.gunModel[107].setRotationPoint(63.0F, -36.0F, 2.0F);
/*      */     
/*  781 */     this.gunModel[108].addShapeBox(25.0F, -5.0F, -8.0F, 53, 1, 20, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  782 */     this.gunModel[108].setRotationPoint(76.0F, -37.0F, -2.0F);
/*      */     
/*  784 */     this.gunModel[109].addShapeBox(25.0F, -5.0F, -8.0F, 1, 7, 20, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/*  785 */     this.gunModel[109].setRotationPoint(128.25F, -44.0F, -2.0F);
/*      */     
/*  787 */     this.gunModel[110].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 20, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/*  788 */     this.gunModel[110].setRotationPoint(127.9F, -43.0F, -2.0F);
/*      */     
/*  790 */     this.gunModel[111].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 20, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/*  791 */     this.gunModel[111].setRotationPoint(127.9F, -41.0F, -2.0F);
/*      */     
/*  793 */     this.gunModel[112].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 20, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/*  794 */     this.gunModel[112].setRotationPoint(127.9F, -39.0F, -2.0F);
/*      */     
/*  796 */     this.gunModel[113].addShapeBox(25.0F, -5.0F, -8.0F, 66, 1, 8, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.15F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.15F, 0.25F, 0.0F);
/*  797 */     this.gunModel[113].setRotationPoint(63.0F, -32.0F, 4.0F);
/*      */     
/*  799 */     this.gunModel[114].addShapeBox(25.0F, -5.0F, -8.0F, 66, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  800 */     this.gunModel[114].setRotationPoint(63.0F, -30.75F, 3.0F);
/*      */     
/*  802 */     this.gunModel[115].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 14, 0.0F, -1.85F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.85F, 0.0F, 0.0F, -0.65F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, -0.65F, 0.5F, 0.0F);
/*  803 */     this.gunModel[115].setRotationPoint(61.0F, -30.75F, 1.0F);
/*      */     
/*  805 */     this.gunModel[116].addShapeBox(25.0F, -5.0F, -8.0F, 10, 4, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel[116].setRotationPoint(129.0F, -36.0F, 2.0F);
/*      */     
/*  808 */     this.gunModel[117].addShapeBox(25.0F, -5.0F, -8.0F, 10, 11, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel[117].setRotationPoint(129.0F, -46.5F, 2.0F);
/*      */     
/*  811 */     this.gunModel[118].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  812 */     this.gunModel[118].setRotationPoint(129.0F, -32.0F, 2.0F);
/*      */     
/*  814 */     this.gunModel[119].addShapeBox(25.0F, -5.0F, -8.0F, 44, 4, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  815 */     this.gunModel[119].setRotationPoint(95.0F, -58.25F, 5.0F);
/*      */     
/*  817 */     this.gunModel[120].addShapeBox(25.0F, -5.0F, -8.0F, 4, 2, 4, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/*  818 */     this.gunModel[120].setRotationPoint(-11.0F, -15.0F, 6.0F);
/*      */     
/*  820 */     this.gunModel[121].addShapeBox(25.0F, -5.0F, -8.0F, 10, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  821 */     this.gunModel[121].setRotationPoint(23.0F, -33.0F, 1.0F);
/*      */     
/*  823 */     this.gunModel[122].addShapeBox(25.0F, -5.0F, -8.0F, 124, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  824 */     this.gunModel[122].setRotationPoint(-44.0F, -56.0F, 11.0F);
/*      */     
/*  826 */     this.gunModel[123].addShapeBox(25.0F, -5.0F, -8.0F, 38, 12, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  827 */     this.gunModel[123].setRotationPoint(25.0F, -54.0F, 6.5F);
/*      */     
/*  829 */     this.gunModel[124].addShapeBox(25.0F, -5.0F, -8.0F, 8, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  830 */     this.gunModel[124].setRotationPoint(95.0F, -52.0F, 2.0F);
/*      */     
/*  832 */     this.gunModel[125].addShapeBox(25.0F, -5.0F, -8.0F, 6, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  833 */     this.gunModel[125].setRotationPoint(88.0F, -54.0F, 2.0F);
/*      */     
/*  835 */     this.gunModel[126].addShapeBox(25.0F, -5.0F, -8.0F, 66, 4, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  836 */     this.gunModel[126].setRotationPoint(63.0F, -36.0F, 14.0F);
/*      */     
/*  838 */     this.gunModel[127].addShapeBox(25.0F, -5.0F, -8.0F, 29, 4, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel[127].setRotationPoint(102.0F, -52.0F, 4.0F);
/*      */     
/*  841 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 7, 1, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  842 */     this.gunModel[''].setRotationPoint(95.0F, -50.5F, 4.0F);
/*      */     
/*  844 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 8, 1, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  845 */     this.gunModel[''].setRotationPoint(131.0F, -50.5F, 4.0F);
/*      */     
/*  847 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 66, 4, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel[''].setRotationPoint(63.0F, -36.0F, -1.0F);
/*      */     
/*  850 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  851 */     this.gunModel[''].setRotationPoint(129.0F, -41.0F, 14.0F);
/*      */     
/*  853 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  854 */     this.gunModel[''].setRotationPoint(129.0F, -43.0F, 14.0F);
/*      */     
/*  856 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F);
/*  857 */     this.gunModel[''].setRotationPoint(129.0F, -39.0F, 14.0F);
/*      */     
/*  859 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  860 */     this.gunModel[''].setRotationPoint(130.5F, -44.0F, 14.0F);
/*      */     
/*  862 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  863 */     this.gunModel[''].setRotationPoint(136.5F, -44.0F, 14.0F);
/*      */     
/*  865 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  866 */     this.gunModel[''].setRotationPoint(133.5F, -44.0F, 14.0F);
/*      */     
/*  868 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  869 */     this.gunModel[''].setRotationPoint(136.5F, -38.0F, 14.0F);
/*      */     
/*  871 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  872 */     this.gunModel[''].setRotationPoint(133.5F, -38.0F, 14.0F);
/*      */     
/*  874 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  875 */     this.gunModel[''].setRotationPoint(130.5F, -38.0F, 14.0F);
/*      */     
/*  877 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  878 */     this.gunModel[''].setRotationPoint(129.0F, -39.0F, 0.0F);
/*      */     
/*  880 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  881 */     this.gunModel[''].setRotationPoint(129.0F, -41.0F, -0.5F);
/*      */     
/*  883 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 2, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  884 */     this.gunModel[''].setRotationPoint(129.0F, -43.0F, 0.0F);
/*      */     
/*  886 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  887 */     this.gunModel[''].setRotationPoint(136.5F, -44.0F, 0.0F);
/*      */     
/*  889 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  890 */     this.gunModel[''].setRotationPoint(133.5F, -44.0F, 0.0F);
/*      */     
/*  892 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  893 */     this.gunModel[''].setRotationPoint(130.5F, -44.0F, 0.0F);
/*      */     
/*  895 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  896 */     this.gunModel[''].setRotationPoint(136.5F, -38.0F, 0.0F);
/*      */     
/*  898 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  899 */     this.gunModel[''].setRotationPoint(133.5F, -38.0F, 0.0F);
/*      */     
/*  901 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  902 */     this.gunModel[''].setRotationPoint(130.5F, -38.0F, 0.0F);
/*      */     
/*  904 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 37, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel[''].setRotationPoint(92.0F, -46.5F, 2.0F);
/*      */     
/*  907 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 24, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel[''].setRotationPoint(139.0F, -53.0F, 5.0F);
/*      */     
/*  910 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 14, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  911 */     this.gunModel[''].setRotationPoint(161.0F, -53.5F, 4.5F);
/*      */     
/*  913 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 6, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  914 */     this.gunModel[''].setRotationPoint(170.0F, -46.5F, 5.0F);
/*      */     
/*  916 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 10, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  917 */     this.gunModel[''].setRotationPoint(169.0F, -44.5F, 5.0F);
/*      */     
/*  919 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 3, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  920 */     this.gunModel[''].setRotationPoint(139.0F, -43.5F, 4.0F);
/*      */     
/*  922 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 70, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  923 */     this.gunModel[''].setRotationPoint(142.0F, -42.5F, 5.0F);
/*      */     
/*  925 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 18, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  926 */     this.gunModel[''].setRotationPoint(166.0F, -43.0F, 4.5F);
/*      */     
/*  928 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 11, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  929 */     this.gunModel[''].setRotationPoint(212.0F, -43.0F, 4.5F);
/*      */     
/*  931 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 11, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  932 */     this.gunModel[''].setRotationPoint(212.0F, -45.0F, 5.5F);
/*      */     
/*  934 */     this.gunModel[''].addShapeBox(25.0F, -5.0F, -8.0F, 11, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  935 */     this.gunModel[''].setRotationPoint(212.0F, -45.0F, 4.5F);
/*      */     
/*  937 */     this.gunModel[' '].addShapeBox(25.0F, -5.0F, -8.0F, 31, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  938 */     this.gunModel[' '].setRotationPoint(223.0F, -44.0F, 3.5F);
/*      */     
/*  940 */     this.gunModel['¡'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  941 */     this.gunModel['¡'].setRotationPoint(256.5F, -44.0F, 3.5F);
/*      */     
/*  943 */     this.gunModel['¢'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  944 */     this.gunModel['¢'].setRotationPoint(261.0F, -44.0F, 3.5F);
/*      */     
/*  946 */     this.gunModel['£'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  947 */     this.gunModel['£'].setRotationPoint(258.5F, -44.0F, 3.5F);
/*      */     
/*  949 */     this.gunModel['¤'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  950 */     this.gunModel['¤'].setRotationPoint(254.0F, -44.0F, 3.5F);
/*      */     
/*  952 */     this.gunModel['¥'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  953 */     this.gunModel['¥'].setRotationPoint(254.0F, -37.0F, 3.5F);
/*      */     
/*  955 */     this.gunModel['¦'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  956 */     this.gunModel['¦'].setRotationPoint(258.5F, -37.0F, 3.5F);
/*      */     
/*  958 */     this.gunModel['§'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  959 */     this.gunModel['§'].setRotationPoint(263.0F, -43.0F, 4.5F);
/*      */     
/*  961 */     this.gunModel['¨'].addShapeBox(25.0F, -5.0F, -8.0F, 11, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  962 */     this.gunModel['¨'].setRotationPoint(212.0F, -36.0F, 5.5F);
/*      */     
/*  964 */     this.gunModel['©'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  965 */     this.gunModel['©'].setRotationPoint(219.0F, -34.0F, 4.5F);
/*      */     
/*  967 */     this.gunModel['ª'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  968 */     this.gunModel['ª'].setRotationPoint(178.0F, -36.0F, 5.5F);
/*      */     
/*  970 */     this.gunModel['«'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 4, 11, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  971 */     this.gunModel['«'].setRotationPoint(80.0F, -57.5F, 2.5F);
/*      */     
/*  973 */     this.gunModel['¬'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  974 */     this.gunModel['¬'].setRotationPoint(80.0F, -55.5F, 13.0F);
/*      */     
/*  976 */     this.gunModel['­'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  977 */     this.gunModel['­'].setRotationPoint(92.0F, -56.5F, 13.0F);
/*      */     
/*  979 */     this.gunModel['®'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 2, 2, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  980 */     this.gunModel['®'].setRotationPoint(80.0F, -59.5F, 2.75F);
/*      */     
/*  982 */     this.gunModel['¯'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  983 */     this.gunModel['¯'].setRotationPoint(80.0F, -59.5F, 11.25F);
/*      */     
/*  985 */     this.gunModel['°'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  986 */     this.gunModel['°'].setRotationPoint(80.0F, -58.5F, 4.75F);
/*      */     
/*  988 */     this.gunModel['±'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  989 */     this.gunModel['±'].setRotationPoint(80.0F, -59.5F, 4.75F);
/*      */     
/*  991 */     this.gunModel['²'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 1, 1, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  992 */     this.gunModel['²'].setRotationPoint(80.0F, -59.5F, 10.25F);
/*      */     
/*  994 */     this.gunModel['³'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  995 */     this.gunModel['³'].setRotationPoint(90.0F, -58.0F, 13.0F);
/*      */     
/*  997 */     this.gunModel['´'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  998 */     this.gunModel['´'].setRotationPoint(90.0F, -58.0F, 2.25F);
/*      */     
/* 1000 */     this.gunModel['µ'].addShapeBox(25.0F, -5.0F, -8.0F, 14, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1001 */     this.gunModel['µ'].setRotationPoint(80.0F, -55.5F, 1.5F);
/*      */     
/* 1003 */     this.gunModel['¶'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1004 */     this.gunModel['¶'].setRotationPoint(92.0F, -56.5F, 1.5F);
/*      */     
/* 1006 */     this.gunModel['·'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1007 */     this.gunModel['·'].setRotationPoint(81.0F, -56.75F, 13.0F);
/*      */     
/* 1009 */     this.gunModel['¸'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1010 */     this.gunModel['¸'].setRotationPoint(81.0F, -56.75F, 2.25F);
/*      */     
/* 1012 */     this.gunModel['¹'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1013 */     this.gunModel['¹'].setRotationPoint(83.0F, -56.75F, 13.0F);
/*      */     
/* 1015 */     this.gunModel['º'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1016 */     this.gunModel['º'].setRotationPoint(83.0F, -56.75F, 2.25F);
/*      */     
/* 1018 */     this.gunModel['»'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1019 */     this.gunModel['»'].setRotationPoint(-42.75F, -60.0F, 5.0F);
/*      */     
/* 1021 */     this.gunModel['¼'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1022 */     this.gunModel['¼'].setRotationPoint(-42.75F, -60.0F, 9.0F);
/*      */     
/* 1024 */     this.gunModel['½'].addShapeBox(25.0F, -5.0F, -8.0F, 124, 4, 2, 0.0F, 0.0F, -2.5F, 1.45F, 0.0F, -2.5F, 1.45F, 0.0F, -2.5F, 1.45F, 0.0F, -2.5F, 1.45F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1025 */     this.gunModel['½'].setRotationPoint(-42.75F, -61.0F, 7.0F);
/*      */     
/* 1027 */     this.gunModel['¾'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1028 */     this.gunModel['¾'].setRotationPoint(-38.75F, -60.0F, 5.0F);
/*      */     
/* 1030 */     this.gunModel['¿'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1031 */     this.gunModel['¿'].setRotationPoint(-38.75F, -60.0F, 9.0F);
/*      */     
/* 1033 */     this.gunModel['À'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1034 */     this.gunModel['À'].setRotationPoint(-34.75F, -60.0F, 5.0F);
/*      */     
/* 1036 */     this.gunModel['Á'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1037 */     this.gunModel['Á'].setRotationPoint(-34.75F, -60.0F, 9.0F);
/*      */     
/* 1039 */     this.gunModel['Â'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1040 */     this.gunModel['Â'].setRotationPoint(-30.75F, -60.0F, 5.0F);
/*      */     
/* 1042 */     this.gunModel['Ã'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1043 */     this.gunModel['Ã'].setRotationPoint(-30.75F, -60.0F, 9.0F);
/*      */     
/* 1045 */     this.gunModel['Ä'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1046 */     this.gunModel['Ä'].setRotationPoint(-26.75F, -60.0F, 5.0F);
/*      */     
/* 1048 */     this.gunModel['Å'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1049 */     this.gunModel['Å'].setRotationPoint(-26.75F, -60.0F, 9.0F);
/*      */     
/* 1051 */     this.gunModel['Æ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1052 */     this.gunModel['Æ'].setRotationPoint(-22.75F, -60.0F, 5.0F);
/*      */     
/* 1054 */     this.gunModel['Ç'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1055 */     this.gunModel['Ç'].setRotationPoint(-22.75F, -60.0F, 9.0F);
/*      */     
/* 1057 */     this.gunModel['È'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1058 */     this.gunModel['È'].setRotationPoint(-18.75F, -60.0F, 5.0F);
/*      */     
/* 1060 */     this.gunModel['É'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1061 */     this.gunModel['É'].setRotationPoint(-18.75F, -60.0F, 9.0F);
/*      */     
/* 1063 */     this.gunModel['Ê'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1064 */     this.gunModel['Ê'].setRotationPoint(-14.75F, -60.0F, 5.0F);
/*      */     
/* 1066 */     this.gunModel['Ë'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1067 */     this.gunModel['Ë'].setRotationPoint(-14.75F, -60.0F, 9.0F);
/*      */     
/* 1069 */     this.gunModel['Ì'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1070 */     this.gunModel['Ì'].setRotationPoint(-10.75F, -60.0F, 5.0F);
/*      */     
/* 1072 */     this.gunModel['Í'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1073 */     this.gunModel['Í'].setRotationPoint(-10.75F, -60.0F, 9.0F);
/*      */     
/* 1075 */     this.gunModel['Î'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1076 */     this.gunModel['Î'].setRotationPoint(-6.75F, -60.0F, 5.0F);
/*      */     
/* 1078 */     this.gunModel['Ï'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1079 */     this.gunModel['Ï'].setRotationPoint(-6.75F, -60.0F, 9.0F);
/*      */     
/* 1081 */     this.gunModel['Ð'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1082 */     this.gunModel['Ð'].setRotationPoint(-2.75F, -60.0F, 5.0F);
/*      */     
/* 1084 */     this.gunModel['Ñ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1085 */     this.gunModel['Ñ'].setRotationPoint(-2.75F, -60.0F, 9.0F);
/*      */     
/* 1087 */     this.gunModel['Ò'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1088 */     this.gunModel['Ò'].setRotationPoint(1.25F, -60.0F, 5.0F);
/*      */     
/* 1090 */     this.gunModel['Ó'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1091 */     this.gunModel['Ó'].setRotationPoint(1.25F, -60.0F, 9.0F);
/*      */     
/* 1093 */     this.gunModel['Ô'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1094 */     this.gunModel['Ô'].setRotationPoint(5.25F, -60.0F, 5.0F);
/*      */     
/* 1096 */     this.gunModel['Õ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1097 */     this.gunModel['Õ'].setRotationPoint(5.25F, -60.0F, 9.0F);
/*      */     
/* 1099 */     this.gunModel['Ö'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1100 */     this.gunModel['Ö'].setRotationPoint(9.25F, -60.0F, 5.0F);
/*      */     
/* 1102 */     this.gunModel['×'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1103 */     this.gunModel['×'].setRotationPoint(9.25F, -60.0F, 9.0F);
/*      */     
/* 1105 */     this.gunModel['Ø'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1106 */     this.gunModel['Ø'].setRotationPoint(13.25F, -60.0F, 5.0F);
/*      */     
/* 1108 */     this.gunModel['Ù'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1109 */     this.gunModel['Ù'].setRotationPoint(13.25F, -60.0F, 9.0F);
/*      */     
/* 1111 */     this.gunModel['Ú'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1112 */     this.gunModel['Ú'].setRotationPoint(17.25F, -60.0F, 5.0F);
/*      */     
/* 1114 */     this.gunModel['Û'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1115 */     this.gunModel['Û'].setRotationPoint(17.25F, -60.0F, 9.0F);
/*      */     
/* 1117 */     this.gunModel['Ü'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1118 */     this.gunModel['Ü'].setRotationPoint(21.25F, -60.0F, 5.0F);
/*      */     
/* 1120 */     this.gunModel['Ý'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1121 */     this.gunModel['Ý'].setRotationPoint(21.25F, -60.0F, 9.0F);
/*      */     
/* 1123 */     this.gunModel['Þ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1124 */     this.gunModel['Þ'].setRotationPoint(25.25F, -60.0F, 5.0F);
/*      */     
/* 1126 */     this.gunModel['ß'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1127 */     this.gunModel['ß'].setRotationPoint(25.25F, -60.0F, 9.0F);
/*      */     
/* 1129 */     this.gunModel['à'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1130 */     this.gunModel['à'].setRotationPoint(29.25F, -60.0F, 5.0F);
/*      */     
/* 1132 */     this.gunModel['á'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1133 */     this.gunModel['á'].setRotationPoint(29.25F, -60.0F, 9.0F);
/*      */     
/* 1135 */     this.gunModel['â'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1136 */     this.gunModel['â'].setRotationPoint(33.25F, -60.0F, 5.0F);
/*      */     
/* 1138 */     this.gunModel['ã'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1139 */     this.gunModel['ã'].setRotationPoint(33.25F, -60.0F, 9.0F);
/*      */     
/* 1141 */     this.gunModel['ä'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1142 */     this.gunModel['ä'].setRotationPoint(37.25F, -60.0F, 5.0F);
/*      */     
/* 1144 */     this.gunModel['å'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1145 */     this.gunModel['å'].setRotationPoint(37.25F, -60.0F, 9.0F);
/*      */     
/* 1147 */     this.gunModel['æ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1148 */     this.gunModel['æ'].setRotationPoint(41.25F, -60.0F, 5.0F);
/*      */     
/* 1150 */     this.gunModel['ç'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1151 */     this.gunModel['ç'].setRotationPoint(41.25F, -60.0F, 9.0F);
/*      */     
/* 1153 */     this.gunModel['è'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1154 */     this.gunModel['è'].setRotationPoint(45.25F, -60.0F, 5.0F);
/*      */     
/* 1156 */     this.gunModel['é'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1157 */     this.gunModel['é'].setRotationPoint(45.25F, -60.0F, 9.0F);
/*      */     
/* 1159 */     this.gunModel['ê'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1160 */     this.gunModel['ê'].setRotationPoint(49.25F, -60.0F, 5.0F);
/*      */     
/* 1162 */     this.gunModel['ë'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1163 */     this.gunModel['ë'].setRotationPoint(49.25F, -60.0F, 9.0F);
/*      */     
/* 1165 */     this.gunModel['ì'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1166 */     this.gunModel['ì'].setRotationPoint(53.25F, -60.0F, 5.0F);
/*      */     
/* 1168 */     this.gunModel['í'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1169 */     this.gunModel['í'].setRotationPoint(53.25F, -60.0F, 9.0F);
/*      */     
/* 1171 */     this.gunModel['î'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1172 */     this.gunModel['î'].setRotationPoint(57.25F, -60.0F, 5.0F);
/*      */     
/* 1174 */     this.gunModel['ï'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1175 */     this.gunModel['ï'].setRotationPoint(57.25F, -60.0F, 9.0F);
/*      */     
/* 1177 */     this.gunModel['ð'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1178 */     this.gunModel['ð'].setRotationPoint(61.25F, -60.0F, 5.0F);
/*      */     
/* 1180 */     this.gunModel['ñ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1181 */     this.gunModel['ñ'].setRotationPoint(61.25F, -60.0F, 9.0F);
/*      */     
/* 1183 */     this.gunModel['ò'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1184 */     this.gunModel['ò'].setRotationPoint(65.25F, -60.0F, 5.0F);
/*      */     
/* 1186 */     this.gunModel['ó'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1187 */     this.gunModel['ó'].setRotationPoint(65.25F, -60.0F, 9.0F);
/*      */     
/* 1189 */     this.gunModel['ô'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1190 */     this.gunModel['ô'].setRotationPoint(69.25F, -60.0F, 5.0F);
/*      */     
/* 1192 */     this.gunModel['õ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1193 */     this.gunModel['õ'].setRotationPoint(69.25F, -60.0F, 9.0F);
/*      */     
/* 1195 */     this.gunModel['ö'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1196 */     this.gunModel['ö'].setRotationPoint(73.25F, -60.0F, 5.0F);
/*      */     
/* 1198 */     this.gunModel['÷'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1199 */     this.gunModel['÷'].setRotationPoint(73.25F, -60.0F, 9.0F);
/*      */     
/* 1201 */     this.gunModel['ø'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1202 */     this.gunModel['ø'].setRotationPoint(77.25F, -60.0F, 5.0F);
/*      */     
/* 1204 */     this.gunModel['ù'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1205 */     this.gunModel['ù'].setRotationPoint(77.25F, -60.0F, 9.0F);
/*      */     
/* 1207 */     this.gunModel['ú'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1208 */     this.gunModel['ú'].setRotationPoint(95.0F, -60.0F, 5.0F);
/*      */     
/* 1210 */     this.gunModel['û'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1211 */     this.gunModel['û'].setRotationPoint(95.0F, -60.0F, 9.0F);
/*      */     
/* 1213 */     this.gunModel['ü'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1214 */     this.gunModel['ü'].setRotationPoint(99.0F, -60.0F, 5.0F);
/*      */     
/* 1216 */     this.gunModel['ý'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1217 */     this.gunModel['ý'].setRotationPoint(99.0F, -60.0F, 9.0F);
/*      */     
/* 1219 */     this.gunModel['þ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1220 */     this.gunModel['þ'].setRotationPoint(103.0F, -60.0F, 5.0F);
/*      */     
/* 1222 */     this.gunModel['ÿ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1223 */     this.gunModel['ÿ'].setRotationPoint(103.0F, -60.0F, 9.0F);
/*      */     
/* 1225 */     this.gunModel['Ā'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1226 */     this.gunModel['Ā'].setRotationPoint(107.0F, -60.0F, 5.0F);
/*      */     
/* 1228 */     this.gunModel['ā'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1229 */     this.gunModel['ā'].setRotationPoint(107.0F, -60.0F, 9.0F);
/*      */     
/* 1231 */     this.gunModel['Ă'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1232 */     this.gunModel['Ă'].setRotationPoint(111.0F, -60.0F, 5.0F);
/*      */     
/* 1234 */     this.gunModel['ă'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1235 */     this.gunModel['ă'].setRotationPoint(111.0F, -60.0F, 9.0F);
/*      */     
/* 1237 */     this.gunModel['Ą'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1238 */     this.gunModel['Ą'].setRotationPoint(115.0F, -60.0F, 5.0F);
/*      */     
/* 1240 */     this.gunModel['ą'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1241 */     this.gunModel['ą'].setRotationPoint(115.0F, -60.0F, 9.0F);
/*      */     
/* 1243 */     this.gunModel['Ć'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1244 */     this.gunModel['Ć'].setRotationPoint(119.0F, -60.0F, 5.0F);
/*      */     
/* 1246 */     this.gunModel['ć'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1247 */     this.gunModel['ć'].setRotationPoint(119.0F, -60.0F, 9.0F);
/*      */     
/* 1249 */     this.gunModel['Ĉ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1250 */     this.gunModel['Ĉ'].setRotationPoint(123.0F, -60.0F, 5.0F);
/*      */     
/* 1252 */     this.gunModel['ĉ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1253 */     this.gunModel['ĉ'].setRotationPoint(123.0F, -60.0F, 9.0F);
/*      */     
/* 1255 */     this.gunModel['Ċ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1256 */     this.gunModel['Ċ'].setRotationPoint(127.0F, -60.0F, 5.0F);
/*      */     
/* 1258 */     this.gunModel['ċ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1259 */     this.gunModel['ċ'].setRotationPoint(127.0F, -60.0F, 9.0F);
/*      */     
/* 1261 */     this.gunModel['Č'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1262 */     this.gunModel['Č'].setRotationPoint(131.0F, -60.0F, 5.0F);
/*      */     
/* 1264 */     this.gunModel['č'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1265 */     this.gunModel['č'].setRotationPoint(131.0F, -60.0F, 9.0F);
/*      */     
/* 1267 */     this.gunModel['Ď'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1268 */     this.gunModel['Ď'].setRotationPoint(135.0F, -60.0F, 5.0F);
/*      */     
/* 1270 */     this.gunModel['ď'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1271 */     this.gunModel['ď'].setRotationPoint(135.0F, -60.0F, 9.0F);
/*      */     
/* 1273 */     this.gunModel['Đ'].addShapeBox(25.0F, -5.0F, -8.0F, 44, 4, 2, 0.0F, 0.0F, -2.5F, 1.45F, 0.0F, -2.5F, 1.45F, 0.0F, -2.5F, 1.45F, 0.0F, -2.5F, 1.45F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1274 */     this.gunModel['Đ'].setRotationPoint(95.0F, -61.0F, 7.0F);
/*      */     
/* 1276 */     this.gunModel['đ'].addShapeBox(25.0F, -5.0F, -8.0F, 31, 14, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1277 */     this.gunModel['đ'].setRotationPoint(-81.0F, -40.0F, 1.0F);
/*      */     
/* 1279 */     this.gunModel['Ē'].addShapeBox(25.0F, -5.0F, -8.0F, 31, 2, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1280 */     this.gunModel['Ē'].setRotationPoint(-81.0F, -42.0F, 1.0F);
/*      */     
/* 1282 */     this.gunModel['ē'].addShapeBox(25.0F, -5.0F, -8.0F, 31, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1283 */     this.gunModel['ē'].setRotationPoint(-81.0F, -43.0F, 2.0F);
/*      */     
/* 1285 */     this.gunModel['Ĕ'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1286 */     this.gunModel['Ĕ'].setRotationPoint(-53.0F, -42.0F, 14.0F);
/*      */     
/* 1288 */     this.gunModel['ĕ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1289 */     this.gunModel['ĕ'].setRotationPoint(-52.5F, -39.0F, 14.5F);
/*      */     
/* 1291 */     this.gunModel['Ė'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1292 */     this.gunModel['Ė'].setRotationPoint(-53.0F, -37.0F, 14.0F);
/*      */     
/* 1294 */     this.gunModel['ė'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1295 */     this.gunModel['ė'].setRotationPoint(-52.5F, -32.0F, 14.5F);
/*      */     
/* 1297 */     this.gunModel['Ę'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1298 */     this.gunModel['Ę'].setRotationPoint(-53.0F, -30.0F, 14.0F);
/*      */     
/* 1300 */     this.gunModel['ę'].addShapeBox(25.0F, -5.0F, -8.0F, 54, 14, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1301 */     this.gunModel['ę'].setRotationPoint(-135.0F, -40.0F, 1.0F);
/*      */     
/* 1303 */     this.gunModel['Ě'].addShapeBox(25.0F, -5.0F, -8.0F, 54, 2, 14, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1304 */     this.gunModel['Ě'].setRotationPoint(-135.0F, -42.0F, 1.0F);
/*      */     
/* 1306 */     this.gunModel['ě'].addShapeBox(25.0F, -5.0F, -8.0F, 54, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1307 */     this.gunModel['ě'].setRotationPoint(-135.0F, -43.0F, 2.0F);
/*      */     
/* 1309 */     this.gunModel['Ĝ'].addShapeBox(25.0F, -5.0F, -8.0F, 52, 1, 14, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1310 */     this.gunModel['Ĝ'].setRotationPoint(-134.0F, -46.0F, 1.0F);
/*      */     
/* 1312 */     this.gunModel['ĝ'].addShapeBox(25.0F, -5.0F, -8.0F, 52, 3, 16, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1313 */     this.gunModel['ĝ'].setRotationPoint(-134.0F, -45.0F, 0.0F);
/*      */     
/* 1315 */     this.gunModel['Ğ'].addShapeBox(25.0F, -5.0F, -8.0F, 52, 12, 18, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 1316 */     this.gunModel['Ğ'].setRotationPoint(-134.0F, -42.0F, -1.0F);
/*      */     
/* 1318 */     this.gunModel['ğ'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 14, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1319 */     this.gunModel['ğ'].setRotationPoint(-82.0F, -40.0F, 2.0F);
/*      */     
/* 1321 */     this.gunModel['Ġ'].addShapeBox(25.0F, -5.0F, -8.0F, 38, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, -5.5F, 0.0F, -1.0F, -5.5F, 0.0F, -1.0F, -5.0F, 0.0F, -1.0F);
/* 1322 */     this.gunModel['Ġ'].setRotationPoint(-127.0F, -30.0F, -1.0F);
/*      */     
/* 1324 */     this.gunModel['ġ'].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1325 */     this.gunModel['ġ'].setRotationPoint(-68.5F, -37.0F, 14.75F);
/*      */     
/* 1327 */     this.gunModel['Ģ'].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1328 */     this.gunModel['Ģ'].setRotationPoint(-68.5F, -35.0F, 14.75F);
/*      */     
/* 1330 */     this.gunModel['ģ'].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1331 */     this.gunModel['ģ'].setRotationPoint(-68.5F, -33.0F, 14.75F);
/*      */     
/* 1333 */     this.gunModel['Ĥ'].addShapeBox(25.0F, -5.0F, -8.0F, 9, 14, 14, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1334 */     this.gunModel['Ĥ'].setRotationPoint(-144.0F, -40.0F, 1.0F);
/*      */     
/* 1336 */     this.gunModel['ĥ'].addShapeBox(25.0F, -5.0F, -8.0F, 11, 2, 14, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1337 */     this.gunModel['ĥ'].setRotationPoint(-146.0F, -42.0F, 1.0F);
/*      */     
/* 1339 */     this.gunModel['Ħ'].addShapeBox(25.0F, -5.0F, -8.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1340 */     this.gunModel['Ħ'].setRotationPoint(-146.0F, -43.0F, 2.0F);
/*      */     
/* 1342 */     this.gunModel['ħ'].addShapeBox(25.0F, -5.0F, -8.0F, 9, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1343 */     this.gunModel['ħ'].setRotationPoint(-144.0F, -26.0F, 1.0F);
/*      */     
/* 1345 */     this.gunModel['Ĩ'].addShapeBox(25.0F, -5.0F, -8.0F, 9, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1346 */     this.gunModel['Ĩ'].setRotationPoint(-144.0F, -25.0F, 1.0F);
/*      */     
/* 1348 */     this.gunModel['ĩ'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1349 */     this.gunModel['ĩ'].setRotationPoint(-144.0F, -23.0F, 1.0F);
/*      */     
/* 1351 */     this.gunModel['Ī'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1352 */     this.gunModel['Ī'].setRotationPoint(-144.0F, -21.0F, 1.0F);
/*      */     
/* 1354 */     this.gunModel['ī'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 22, 14, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 1355 */     this.gunModel['ī'].setRotationPoint(-144.0F, -19.0F, 1.0F);
/*      */     
/* 1357 */     this.gunModel['Ĭ'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 22, 14, 0.0F, 1.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F);
/* 1358 */     this.gunModel['Ĭ'].setRotationPoint(-147.5F, -19.0F, 1.0F);
/*      */     
/* 1360 */     this.gunModel['ĭ'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 7, 14, 0.0F, 2.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
/* 1361 */     this.gunModel['ĭ'].setRotationPoint(-147.5F, -26.0F, 1.0F);
/*      */     
/* 1363 */     this.gunModel['Į'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 14, 14, 0.0F, 4.0F, 0.0F, -2.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F);
/* 1364 */     this.gunModel['Į'].setRotationPoint(-147.5F, -40.0F, 1.0F);
/*      */     
/* 1366 */     this.gunModel['į'].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 14, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1367 */     this.gunModel['į'].setRotationPoint(-151.5F, -42.0F, 1.0F);
/*      */     
/* 1369 */     this.gunModel['İ'].addShapeBox(25.0F, -5.0F, -8.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1370 */     this.gunModel['İ'].setRotationPoint(-151.5F, -43.0F, 2.0F);
/*      */     
/* 1372 */     this.gunModel['ı'].addShapeBox(25.0F, -5.0F, -8.0F, 30, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1373 */     this.gunModel['ı'].setRotationPoint(-142.0F, -26.0F, 3.0F);
/*      */     
/* 1375 */     this.gunModel['Ĳ'].addShapeBox(25.0F, -5.0F, -8.0F, 29, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1376 */     this.gunModel['Ĳ'].setRotationPoint(-142.0F, -24.0F, 3.0F);
/*      */     
/* 1378 */     this.gunModel['ĳ'].addShapeBox(25.0F, -5.0F, -8.0F, 25, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1379 */     this.gunModel['ĳ'].setRotationPoint(-142.0F, -22.0F, 3.0F);
/*      */     
/* 1381 */     this.gunModel['Ĵ'].addShapeBox(25.0F, -5.0F, -8.0F, 22, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1382 */     this.gunModel['Ĵ'].setRotationPoint(-142.0F, -20.0F, 3.0F);
/*      */     
/* 1384 */     this.gunModel['ĵ'].addShapeBox(25.0F, -5.0F, -8.0F, 13, 15, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1385 */     this.gunModel['ĵ'].setRotationPoint(-142.0F, -19.0F, 3.0F);
/*      */     
/* 1387 */     this.gunModel['Ķ'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1388 */     this.gunModel['Ķ'].setRotationPoint(-126.0F, -19.0F, 3.0F);
/*      */     
/* 1390 */     this.gunModel['ķ'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 10, 10, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1391 */     this.gunModel['ķ'].setRotationPoint(-130.0F, -19.0F, 3.0F);
/*      */     
/* 1393 */     this.gunModel['ĸ'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 6, 10, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1394 */     this.gunModel['ĸ'].setRotationPoint(-134.0F, -9.0F, 3.0F);
/*      */     
/* 1396 */     this.gunModel['Ĺ'].addShapeBox(25.0F, -5.0F, -8.0F, 6, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1397 */     this.gunModel['Ĺ'].setRotationPoint(-130.0F, -9.0F, 3.0F);
/*      */     
/* 1399 */     this.gunModel['ĺ'].addShapeBox(25.0F, -5.0F, -8.0F, 12, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1400 */     this.gunModel['ĺ'].setRotationPoint(-138.5F, -3.0F, 3.0F);
/*      */     
/* 1402 */     this.gunModel['Ļ'].addShapeBox(25.0F, -5.0F, -8.0F, 11, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1403 */     this.gunModel['Ļ'].setRotationPoint(-138.5F, -1.0F, 3.0F);
/*      */     
/* 1405 */     this.gunModel['ļ'].addShapeBox(25.0F, -5.0F, -8.0F, 10, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1406 */     this.gunModel['ļ'].setRotationPoint(-138.5F, 1.0F, 3.0F);
/*      */     
/* 1408 */     this.gunModel['Ľ'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1409 */     this.gunModel['Ľ'].setRotationPoint(-138.5F, -4.0F, 3.0F);
/*      */     
/* 1411 */     this.gunModel['ľ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 1412 */     this.gunModel['ľ'].setRotationPoint(-128.0F, -19.0F, 3.0F);
/*      */     
/* 1414 */     this.gunModel['Ŀ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1415 */     this.gunModel['Ŀ'].setRotationPoint(-112.0F, -24.0F, 4.0F);
/*      */     
/* 1417 */     this.gunModel['ŀ'].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 4.0F, 0.5F, 0.0F);
/* 1418 */     this.gunModel['ŀ'].setRotationPoint(-115.0F, -22.0F, 4.0F);
/*      */     
/* 1420 */     this.gunModel['Ł'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 8, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1421 */     this.gunModel['Ł'].setRotationPoint(-112.0F, -26.0F, 4.0F);
/*      */     
/* 1423 */     this.gunModel['ł'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1424 */     this.gunModel['ł'].setRotationPoint(-108.5F, -26.0F, 3.0F);
/*      */     
/* 1426 */     this.gunModel['Ń'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F);
/* 1427 */     this.gunModel['Ń'].setRotationPoint(-105.5F, -26.0F, 3.0F);
/*      */     
/* 1429 */     this.gunModel['ń'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 7, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F);
/* 1430 */     this.gunModel['ń'].setRotationPoint(-110.5F, -26.0F, 3.0F);
/*      */     
/* 1432 */     this.gunModel['Ņ'].addShapeBox(25.0F, -5.0F, -8.0F, 6, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1433 */     this.gunModel['Ņ'].setRotationPoint(-102.5F, -26.0F, 3.0F);
/*      */     
/* 1435 */     this.gunModel['ņ'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1436 */     this.gunModel['ņ'].setRotationPoint(-96.5F, -26.0F, 3.0F);
/*      */     
/* 1438 */     this.gunModel['Ň'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1439 */     this.gunModel['Ň'].setRotationPoint(-92.5F, -26.0F, 3.0F);
/*      */     
/* 1441 */     this.gunModel['ň'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1442 */     this.gunModel['ň'].setRotationPoint(-82.0F, -42.0F, 2.0F);
/*      */     
/* 1444 */     this.gunModel['ŉ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 10, 0.0F, -0.5F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1445 */     this.gunModel['ŉ'].setRotationPoint(-82.0F, -43.0F, 3.0F);
/*      */     
/* 1447 */     this.gunModel['Ŋ'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 14, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1448 */     this.gunModel['Ŋ'].setRotationPoint(-136.0F, -40.0F, 2.0F);
/*      */     
/* 1450 */     this.gunModel['ŋ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1451 */     this.gunModel['ŋ'].setRotationPoint(-136.0F, -42.0F, 2.0F);
/*      */     
/* 1453 */     this.gunModel['Ō'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 10, 0.0F, -0.5F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1454 */     this.gunModel['Ō'].setRotationPoint(-136.0F, -43.0F, 3.0F);
/*      */     
/* 1456 */     this.gunModel['ō'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 18, 0.0F, -3.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -3.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/* 1457 */     this.gunModel['ō'].setRotationPoint(-22.0F, -57.25F, -1.0F);
/* 1458 */     this.gunModel['ō'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1460 */     this.gunModel['Ŏ'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 18, 0.0F, 0.0F, -0.5F, -0.25F, -3.0F, -0.5F, -0.25F, -3.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1461 */     this.gunModel['Ŏ'].setRotationPoint(-19.6F, -54.8F, -1.0F);
/* 1462 */     this.gunModel['Ŏ'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1464 */     this.gunModel['ŏ'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 18, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 1465 */     this.gunModel['ŏ'].setRotationPoint(-20.3F, -55.5F, -1.0F);
/* 1466 */     this.gunModel['ŏ'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1468 */     this.gunModel['Ő'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 1, 18, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1469 */     this.gunModel['Ő'].setRotationPoint(-23.45F, -54.45F, -1.0F);
/* 1470 */     this.gunModel['Ő'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1472 */     this.gunModel['ő'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 2, 18, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1473 */     this.gunModel['ő'].setRotationPoint(-22.05F, -52.35F, -1.0F);
/* 1474 */     this.gunModel['ő'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1476 */     this.gunModel['Œ'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 2, 18, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/* 1477 */     this.gunModel['Œ'].setRotationPoint(-24.45F, -54.75F, -1.0F);
/* 1478 */     this.gunModel['Œ'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1480 */     this.gunModel['œ'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 18, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 1481 */     this.gunModel['œ'].setRotationPoint(-22.7F, -53.0F, -1.0F);
/* 1482 */     this.gunModel['œ'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1484 */     this.gunModel['Ŕ'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 6, 18, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 1485 */     this.gunModel['Ŕ'].setRotationPoint(-24.5F, -52.0F, -1.0F);
/* 1486 */     this.gunModel['Ŕ'].rotateAngleZ = -0.7853982F;
/*      */     
/* 1488 */     this.gunModel['ŕ'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1489 */     this.gunModel['ŕ'].setRotationPoint(-24.0F, -62.0F, 2.0F);
/*      */     
/* 1491 */     this.gunModel['Ŗ'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1492 */     this.gunModel['Ŗ'].setRotationPoint(-23.0F, -62.0F, 2.0F);
/*      */     
/* 1494 */     this.gunModel['ŗ'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1495 */     this.gunModel['ŗ'].setRotationPoint(-22.0F, -62.0F, 2.0F);
/*      */     
/* 1497 */     this.gunModel['Ř'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, -3.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -3.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/* 1498 */     this.gunModel['Ř'].setRotationPoint(-15.0F, -67.0F, -1.0F);
/* 1499 */     this.gunModel['Ř'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1501 */     this.gunModel['ř'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, -0.5F, -0.25F, -3.0F, -0.5F, -0.25F, -3.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1502 */     this.gunModel['ř'].setRotationPoint(-15.0F, -63.5F, -1.0F);
/* 1503 */     this.gunModel['ř'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1505 */     this.gunModel['Ś'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 3, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 1506 */     this.gunModel['Ś'].setRotationPoint(-15.0F, -64.5F, -1.0F);
/* 1507 */     this.gunModel['Ś'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1509 */     this.gunModel['ś'].addShapeBox(25.0F, -5.0F, -8.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1510 */     this.gunModel['ś'].setRotationPoint(-18.0F, -66.0F, -1.0F);
/* 1511 */     this.gunModel['ś'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1513 */     this.gunModel['Ŝ'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 2, 3, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1514 */     this.gunModel['Ŝ'].setRotationPoint(-18.5F, -63.5F, -1.0F);
/* 1515 */     this.gunModel['Ŝ'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1517 */     this.gunModel['ŝ'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 2, 3, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/* 1518 */     this.gunModel['ŝ'].setRotationPoint(-18.5F, -67.0F, -1.0F);
/* 1519 */     this.gunModel['ŝ'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1521 */     this.gunModel['Ş'].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 3, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 1522 */     this.gunModel['Ş'].setRotationPoint(-18.5F, -64.5F, -1.0F);
/* 1523 */     this.gunModel['Ş'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1525 */     this.gunModel['ş'].addShapeBox(25.0F, -5.0F, -8.0F, 3, 6, 3, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 1526 */     this.gunModel['ş'].setRotationPoint(-20.5F, -65.0F, -1.0F);
/* 1527 */     this.gunModel['ş'].rotateAngleZ = -1.5707964F;
/*      */     
/* 1529 */     this.gunModel['Š'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1530 */     this.gunModel['Š'].setRotationPoint(-40.75F, -60.0F, 5.0F);
/*      */     
/* 1532 */     this.gunModel['š'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1533 */     this.gunModel['š'].setRotationPoint(-36.75F, -60.0F, 5.0F);
/*      */     
/* 1535 */     this.gunModel['Ţ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1536 */     this.gunModel['Ţ'].setRotationPoint(-32.75F, -60.0F, 5.0F);
/*      */     
/* 1538 */     this.gunModel['ţ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1539 */     this.gunModel['ţ'].setRotationPoint(-28.75F, -60.0F, 5.0F);
/*      */     
/* 1541 */     this.gunModel['Ť'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1542 */     this.gunModel['Ť'].setRotationPoint(-24.75F, -60.0F, 5.0F);
/*      */     
/* 1544 */     this.gunModel['ť'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1545 */     this.gunModel['ť'].setRotationPoint(-20.75F, -60.0F, 5.0F);
/*      */     
/* 1547 */     this.gunModel['Ŧ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1548 */     this.gunModel['Ŧ'].setRotationPoint(-16.75F, -60.0F, 5.0F);
/*      */     
/* 1550 */     this.gunModel['ŧ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1551 */     this.gunModel['ŧ'].setRotationPoint(-12.75F, -60.0F, 5.0F);
/*      */     
/* 1553 */     this.gunModel['Ũ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1554 */     this.gunModel['Ũ'].setRotationPoint(-8.75F, -60.0F, 5.0F);
/*      */     
/* 1556 */     this.gunModel['ũ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1557 */     this.gunModel['ũ'].setRotationPoint(-4.75F, -60.0F, 5.0F);
/*      */     
/* 1559 */     this.gunModel['Ū'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1560 */     this.gunModel['Ū'].setRotationPoint(-0.75F, -60.0F, 5.0F);
/*      */     
/* 1562 */     this.gunModel['ū'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1563 */     this.gunModel['ū'].setRotationPoint(3.25F, -60.0F, 5.0F);
/*      */     
/* 1565 */     this.gunModel['Ŭ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1566 */     this.gunModel['Ŭ'].setRotationPoint(7.25F, -60.0F, 5.0F);
/*      */     
/* 1568 */     this.gunModel['ŭ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1569 */     this.gunModel['ŭ'].setRotationPoint(11.25F, -60.0F, 5.0F);
/*      */     
/* 1571 */     this.gunModel['Ů'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1572 */     this.gunModel['Ů'].setRotationPoint(15.25F, -60.0F, 5.0F);
/*      */     
/* 1574 */     this.gunModel['ů'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1575 */     this.gunModel['ů'].setRotationPoint(19.25F, -60.0F, 5.0F);
/*      */     
/* 1577 */     this.gunModel['Ű'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1578 */     this.gunModel['Ű'].setRotationPoint(23.25F, -60.0F, 5.0F);
/*      */     
/* 1580 */     this.gunModel['ű'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1581 */     this.gunModel['ű'].setRotationPoint(27.25F, -60.0F, 5.0F);
/*      */     
/* 1583 */     this.gunModel['Ų'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1584 */     this.gunModel['Ų'].setRotationPoint(31.25F, -60.0F, 5.0F);
/*      */     
/* 1586 */     this.gunModel['ų'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1587 */     this.gunModel['ų'].setRotationPoint(35.25F, -60.0F, 5.0F);
/*      */     
/* 1589 */     this.gunModel['Ŵ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1590 */     this.gunModel['Ŵ'].setRotationPoint(39.25F, -60.0F, 5.0F);
/*      */     
/* 1592 */     this.gunModel['ŵ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1593 */     this.gunModel['ŵ'].setRotationPoint(43.25F, -60.0F, 5.0F);
/*      */     
/* 1595 */     this.gunModel['Ŷ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1596 */     this.gunModel['Ŷ'].setRotationPoint(47.25F, -60.0F, 5.0F);
/*      */     
/* 1598 */     this.gunModel['ŷ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1599 */     this.gunModel['ŷ'].setRotationPoint(51.25F, -60.0F, 5.0F);
/*      */     
/* 1601 */     this.gunModel['Ÿ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1602 */     this.gunModel['Ÿ'].setRotationPoint(55.25F, -60.0F, 5.0F);
/*      */     
/* 1604 */     this.gunModel['Ź'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1605 */     this.gunModel['Ź'].setRotationPoint(59.25F, -60.0F, 5.0F);
/*      */     
/* 1607 */     this.gunModel['ź'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1608 */     this.gunModel['ź'].setRotationPoint(63.25F, -60.0F, 5.0F);
/*      */     
/* 1610 */     this.gunModel['Ż'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1611 */     this.gunModel['Ż'].setRotationPoint(67.25F, -60.0F, 5.0F);
/*      */     
/* 1613 */     this.gunModel['ż'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1614 */     this.gunModel['ż'].setRotationPoint(71.25F, -60.0F, 5.0F);
/*      */     
/* 1616 */     this.gunModel['Ž'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1617 */     this.gunModel['Ž'].setRotationPoint(75.25F, -60.0F, 5.0F);
/*      */     
/* 1619 */     this.gunModel['ž'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1620 */     this.gunModel['ž'].setRotationPoint(79.25F, -60.0F, 5.0F);
/*      */     
/* 1622 */     this.gunModel['ſ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1623 */     this.gunModel['ſ'].setRotationPoint(-40.75F, -60.0F, 9.0F);
/*      */     
/* 1625 */     this.gunModel['ƀ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1626 */     this.gunModel['ƀ'].setRotationPoint(-36.75F, -60.0F, 9.0F);
/*      */     
/* 1628 */     this.gunModel['Ɓ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1629 */     this.gunModel['Ɓ'].setRotationPoint(-32.75F, -60.0F, 9.0F);
/*      */     
/* 1631 */     this.gunModel['Ƃ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1632 */     this.gunModel['Ƃ'].setRotationPoint(-28.75F, -60.0F, 9.0F);
/*      */     
/* 1634 */     this.gunModel['ƃ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1635 */     this.gunModel['ƃ'].setRotationPoint(-24.75F, -60.0F, 9.0F);
/*      */     
/* 1637 */     this.gunModel['Ƅ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1638 */     this.gunModel['Ƅ'].setRotationPoint(-20.75F, -60.0F, 9.0F);
/*      */     
/* 1640 */     this.gunModel['ƅ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1641 */     this.gunModel['ƅ'].setRotationPoint(-16.75F, -60.0F, 9.0F);
/*      */     
/* 1643 */     this.gunModel['Ɔ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1644 */     this.gunModel['Ɔ'].setRotationPoint(-12.75F, -60.0F, 9.0F);
/*      */     
/* 1646 */     this.gunModel['Ƈ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1647 */     this.gunModel['Ƈ'].setRotationPoint(-8.75F, -60.0F, 9.0F);
/*      */     
/* 1649 */     this.gunModel['ƈ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1650 */     this.gunModel['ƈ'].setRotationPoint(-4.75F, -60.0F, 9.0F);
/*      */     
/* 1652 */     this.gunModel['Ɖ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1653 */     this.gunModel['Ɖ'].setRotationPoint(-0.75F, -60.0F, 9.0F);
/*      */     
/* 1655 */     this.gunModel['Ɗ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1656 */     this.gunModel['Ɗ'].setRotationPoint(3.25F, -60.0F, 9.0F);
/*      */     
/* 1658 */     this.gunModel['Ƌ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1659 */     this.gunModel['Ƌ'].setRotationPoint(7.25F, -60.0F, 9.0F);
/*      */     
/* 1661 */     this.gunModel['ƌ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1662 */     this.gunModel['ƌ'].setRotationPoint(11.25F, -60.0F, 9.0F);
/*      */     
/* 1664 */     this.gunModel['ƍ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1665 */     this.gunModel['ƍ'].setRotationPoint(15.25F, -60.0F, 9.0F);
/*      */     
/* 1667 */     this.gunModel['Ǝ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1668 */     this.gunModel['Ǝ'].setRotationPoint(19.25F, -60.0F, 9.0F);
/*      */     
/* 1670 */     this.gunModel['Ə'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1671 */     this.gunModel['Ə'].setRotationPoint(23.25F, -60.0F, 9.0F);
/*      */     
/* 1673 */     this.gunModel['Ɛ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1674 */     this.gunModel['Ɛ'].setRotationPoint(27.25F, -60.0F, 9.0F);
/*      */     
/* 1676 */     this.gunModel['Ƒ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1677 */     this.gunModel['Ƒ'].setRotationPoint(31.25F, -60.0F, 9.0F);
/*      */     
/* 1679 */     this.gunModel['ƒ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1680 */     this.gunModel['ƒ'].setRotationPoint(35.25F, -60.0F, 9.0F);
/*      */     
/* 1682 */     this.gunModel['Ɠ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1683 */     this.gunModel['Ɠ'].setRotationPoint(39.25F, -60.0F, 9.0F);
/*      */     
/* 1685 */     this.gunModel['Ɣ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1686 */     this.gunModel['Ɣ'].setRotationPoint(43.25F, -60.0F, 9.0F);
/*      */     
/* 1688 */     this.gunModel['ƕ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1689 */     this.gunModel['ƕ'].setRotationPoint(47.25F, -60.0F, 9.0F);
/*      */     
/* 1691 */     this.gunModel['Ɩ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1692 */     this.gunModel['Ɩ'].setRotationPoint(51.25F, -60.0F, 9.0F);
/*      */     
/* 1694 */     this.gunModel['Ɨ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1695 */     this.gunModel['Ɨ'].setRotationPoint(55.25F, -60.0F, 9.0F);
/*      */     
/* 1697 */     this.gunModel['Ƙ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1698 */     this.gunModel['Ƙ'].setRotationPoint(59.25F, -60.0F, 9.0F);
/*      */     
/* 1700 */     this.gunModel['ƙ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1701 */     this.gunModel['ƙ'].setRotationPoint(63.25F, -60.0F, 9.0F);
/*      */     
/* 1703 */     this.gunModel['ƚ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1704 */     this.gunModel['ƚ'].setRotationPoint(67.25F, -60.0F, 9.0F);
/*      */     
/* 1706 */     this.gunModel['ƛ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1707 */     this.gunModel['ƛ'].setRotationPoint(71.25F, -60.0F, 9.0F);
/*      */     
/* 1709 */     this.gunModel['Ɯ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1710 */     this.gunModel['Ɯ'].setRotationPoint(75.25F, -60.0F, 9.0F);
/*      */     
/* 1712 */     this.gunModel['Ɲ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1713 */     this.gunModel['Ɲ'].setRotationPoint(79.25F, -60.0F, 9.0F);
/*      */     
/* 1715 */     this.gunModel['ƞ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1716 */     this.gunModel['ƞ'].setRotationPoint(97.0F, -60.0F, 5.0F);
/*      */     
/* 1718 */     this.gunModel['Ɵ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1719 */     this.gunModel['Ɵ'].setRotationPoint(97.0F, -60.0F, 9.0F);
/*      */     
/* 1721 */     this.gunModel['Ơ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1722 */     this.gunModel['Ơ'].setRotationPoint(101.0F, -60.0F, 5.0F);
/*      */     
/* 1724 */     this.gunModel['ơ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1725 */     this.gunModel['ơ'].setRotationPoint(101.0F, -60.0F, 9.0F);
/*      */     
/* 1727 */     this.gunModel['Ƣ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1728 */     this.gunModel['Ƣ'].setRotationPoint(105.0F, -60.0F, 5.0F);
/*      */     
/* 1730 */     this.gunModel['ƣ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1731 */     this.gunModel['ƣ'].setRotationPoint(105.0F, -60.0F, 9.0F);
/*      */     
/* 1733 */     this.gunModel['Ƥ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1734 */     this.gunModel['Ƥ'].setRotationPoint(109.0F, -60.0F, 5.0F);
/*      */     
/* 1736 */     this.gunModel['ƥ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1737 */     this.gunModel['ƥ'].setRotationPoint(109.0F, -60.0F, 9.0F);
/*      */     
/* 1739 */     this.gunModel['Ʀ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1740 */     this.gunModel['Ʀ'].setRotationPoint(113.0F, -60.0F, 5.0F);
/*      */     
/* 1742 */     this.gunModel['Ƨ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1743 */     this.gunModel['Ƨ'].setRotationPoint(113.0F, -60.0F, 9.0F);
/*      */     
/* 1745 */     this.gunModel['ƨ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1746 */     this.gunModel['ƨ'].setRotationPoint(117.0F, -60.0F, 5.0F);
/*      */     
/* 1748 */     this.gunModel['Ʃ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1749 */     this.gunModel['Ʃ'].setRotationPoint(117.0F, -60.0F, 9.0F);
/*      */     
/* 1751 */     this.gunModel['ƪ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1752 */     this.gunModel['ƪ'].setRotationPoint(121.0F, -60.0F, 5.0F);
/*      */     
/* 1754 */     this.gunModel['ƫ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1755 */     this.gunModel['ƫ'].setRotationPoint(121.0F, -60.0F, 9.0F);
/*      */     
/* 1757 */     this.gunModel['Ƭ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1758 */     this.gunModel['Ƭ'].setRotationPoint(125.0F, -60.0F, 5.0F);
/*      */     
/* 1760 */     this.gunModel['ƭ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1761 */     this.gunModel['ƭ'].setRotationPoint(125.0F, -60.0F, 9.0F);
/*      */     
/* 1763 */     this.gunModel['Ʈ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1764 */     this.gunModel['Ʈ'].setRotationPoint(129.0F, -60.0F, 5.0F);
/*      */     
/* 1766 */     this.gunModel['Ư'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1767 */     this.gunModel['Ư'].setRotationPoint(129.0F, -60.0F, 9.0F);
/*      */     
/* 1769 */     this.gunModel['ư'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1770 */     this.gunModel['ư'].setRotationPoint(133.0F, -60.0F, 5.0F);
/*      */     
/* 1772 */     this.gunModel['Ʊ'].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1773 */     this.gunModel['Ʊ'].setRotationPoint(133.0F, -60.0F, 9.0F);
/*      */     
/*      */ 
/* 1776 */     this.defaultScopeModel = new ModelRendererTurbo[109];
/* 1777 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/* 1778 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 1721, 25, this.textureX, this.textureY);
/* 1779 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 1780 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1809, 25, this.textureX, this.textureY);
/* 1781 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/* 1782 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 633, 49, this.textureX, this.textureY);
/* 1783 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 553, 1, this.textureX, this.textureY);
/* 1784 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 1345, 33, this.textureX, this.textureY);
/* 1785 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/* 1786 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/* 1787 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/* 1788 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/* 1789 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
/* 1790 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 1521, 33, this.textureX, this.textureY);
/* 1791 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 1097, 33, this.textureX, this.textureY);
/* 1792 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/* 1793 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 601, 1, this.textureX, this.textureY);
/* 1794 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 1185, 33, this.textureX, this.textureY);
/* 1795 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/* 1796 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 553, 1, this.textureX, this.textureY);
/* 1797 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/* 1798 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/* 1799 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/* 1800 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 1529, 57, this.textureX, this.textureY);
/* 1801 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/* 1802 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 1217, 49, this.textureX, this.textureY);
/* 1803 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 1721, 33, this.textureX, this.textureY);
/* 1804 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/* 1805 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/* 1806 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/* 1807 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
/* 1808 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/* 1809 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 1521, 41, this.textureX, this.textureY);
/* 1810 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 1033, 1, this.textureX, this.textureY);
/* 1811 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 1073, 1, this.textureX, this.textureY);
/* 1812 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/* 1813 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 1113, 1, this.textureX, this.textureY);
/* 1814 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 593, 9, this.textureX, this.textureY);
/* 1815 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 713, 9, this.textureX, this.textureY);
/* 1816 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 793, 9, this.textureX, this.textureY);
/* 1817 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 833, 9, this.textureX, this.textureY);
/* 1818 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 913, 9, this.textureX, this.textureY);
/* 1819 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 1673, 73, this.textureX, this.textureY);
/* 1820 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 697, 81, this.textureX, this.textureY);
/* 1821 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 585, 17, this.textureX, this.textureY);
/* 1822 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 1633, 81, this.textureX, this.textureY);
/* 1823 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/* 1824 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 1689, 73, this.textureX, this.textureY);
/* 1825 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 625, 17, this.textureX, this.textureY);
/* 1826 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/* 1827 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/* 1828 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/* 1829 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 1017, 41, this.textureX, this.textureY);
/* 1830 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 769, 89, this.textureX, this.textureY);
/* 1831 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/* 1832 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 2041, 1, this.textureX, this.textureY);
/* 1833 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/* 1834 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/* 1835 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 729, 89, this.textureX, this.textureY);
/* 1836 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 1729, 41, this.textureX, this.textureY);
/* 1837 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 841, 89, this.textureX, this.textureY);
/* 1838 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 1081, 89, this.textureX, this.textureY);
/* 1839 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/* 1840 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/* 1841 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/* 1842 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 545, 89, this.textureX, this.textureY);
/* 1843 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 1817, 41, this.textureX, this.textureY);
/* 1844 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 1977, 41, this.textureX, this.textureY);
/* 1845 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 1121, 89, this.textureX, this.textureY);
/* 1846 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 1729, 89, this.textureX, this.textureY);
/* 1847 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 1785, 89, this.textureX, this.textureY);
/* 1848 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 857, 137, this.textureX, this.textureY);
/* 1849 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/* 1850 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 657, 97, this.textureX, this.textureY);
/* 1851 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 929, 97, this.textureX, this.textureY);
/* 1852 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/* 1853 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 1681, 65, this.textureX, this.textureY);
/* 1854 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 617, 57, this.textureX, this.textureY);
/* 1855 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 921, 57, this.textureX, this.textureY);
/* 1856 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 1577, 81, this.textureX, this.textureY);
/* 1857 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 1858 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/* 1859 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/* 1860 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 1649, 97, this.textureX, this.textureY);
/* 1861 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/* 1862 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/* 1863 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 1793, 113, this.textureX, this.textureY);
/* 1864 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 1353, 49, this.textureX, this.textureY);
/* 1865 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 1553, 1, this.textureX, this.textureY);
/* 1866 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 1929, 1, this.textureX, this.textureY);
/* 1867 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/* 1868 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 1869 */     this.defaultScopeModel[92] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/* 1870 */     this.defaultScopeModel[93] = new ModelRendererTurbo(this, 697, 9, this.textureX, this.textureY);
/* 1871 */     this.defaultScopeModel[94] = new ModelRendererTurbo(this, 737, 9, this.textureX, this.textureY);
/* 1872 */     this.defaultScopeModel[95] = new ModelRendererTurbo(this, 761, 9, this.textureX, this.textureY);
/* 1873 */     this.defaultScopeModel[96] = new ModelRendererTurbo(this, 777, 9, this.textureX, this.textureY);
/* 1874 */     this.defaultScopeModel[97] = new ModelRendererTurbo(this, 817, 9, this.textureX, this.textureY);
/* 1875 */     this.defaultScopeModel[98] = new ModelRendererTurbo(this, 857, 9, this.textureX, this.textureY);
/* 1876 */     this.defaultScopeModel[99] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/* 1877 */     this.defaultScopeModel[100] = new ModelRendererTurbo(this, 1001, 121, this.textureX, this.textureY);
/* 1878 */     this.defaultScopeModel[101] = new ModelRendererTurbo(this, 713, 81, this.textureX, this.textureY);
/* 1879 */     this.defaultScopeModel[102] = new ModelRendererTurbo(this, 985, 97, this.textureX, this.textureY);
/* 1880 */     this.defaultScopeModel[103] = new ModelRendererTurbo(this, 665, 17, this.textureX, this.textureY);
/* 1881 */     this.defaultScopeModel[104] = new ModelRendererTurbo(this, 705, 17, this.textureX, this.textureY);
/* 1882 */     this.defaultScopeModel[105] = new ModelRendererTurbo(this, 1809, 81, this.textureX, this.textureY);
/* 1883 */     this.defaultScopeModel[106] = new ModelRendererTurbo(this, 1033, 97, this.textureX, this.textureY);
/* 1884 */     this.defaultScopeModel[107] = new ModelRendererTurbo(this, 1121, 121, this.textureX, this.textureY);
/* 1885 */     this.defaultScopeModel[108] = new ModelRendererTurbo(this, 761, 137, this.textureX, this.textureY);
/*      */     
/* 1887 */     this.defaultScopeModel[0].addShapeBox(25.0F, -5.0F, -8.0F, 2, 6, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1888 */     this.defaultScopeModel[0].setRotationPoint(212.0F, -51.0F, 5.5F);
/*      */     
/* 1890 */     this.defaultScopeModel[1].addShapeBox(25.0F, -5.0F, -8.0F, 9, 6, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1891 */     this.defaultScopeModel[1].setRotationPoint(213.0F, -57.0F, 10.5F);
/*      */     
/* 1893 */     this.defaultScopeModel[2].addShapeBox(25.0F, -5.0F, -8.0F, 8, 5, 1, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1894 */     this.defaultScopeModel[2].setRotationPoint(214.0F, -62.0F, 10.5F);
/*      */     
/* 1896 */     this.defaultScopeModel[3].addShapeBox(25.0F, -5.0F, -8.0F, 7, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1897 */     this.defaultScopeModel[3].setRotationPoint(215.0F, -64.0F, 10.75F);
/*      */     
/* 1899 */     this.defaultScopeModel[4].addShapeBox(25.0F, -5.0F, -8.0F, 7, 1, 1, 0.0F, -1.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1900 */     this.defaultScopeModel[4].setRotationPoint(215.0F, -65.0F, 10.75F);
/*      */     
/* 1902 */     this.defaultScopeModel[5].addShapeBox(25.0F, -5.0F, -8.0F, 1, 17, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1903 */     this.defaultScopeModel[5].setRotationPoint(222.0F, -62.0F, 10.5F);
/*      */     
/* 1905 */     this.defaultScopeModel[6].addShapeBox(25.0F, -5.0F, -8.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1906 */     this.defaultScopeModel[6].setRotationPoint(221.0F, -51.0F, 5.5F);
/*      */     
/* 1908 */     this.defaultScopeModel[7].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1909 */     this.defaultScopeModel[7].setRotationPoint(214.0F, -51.0F, 5.5F);
/*      */     
/* 1911 */     this.defaultScopeModel[8].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F);
/* 1912 */     this.defaultScopeModel[8].setRotationPoint(220.0F, -49.0F, 5.5F);
/*      */     
/* 1914 */     this.defaultScopeModel[9].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1915 */     this.defaultScopeModel[9].setRotationPoint(214.0F, -49.0F, 5.5F);
/*      */     
/* 1917 */     this.defaultScopeModel[10].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1918 */     this.defaultScopeModel[10].setRotationPoint(214.0F, -46.0F, 5.5F);
/*      */     
/* 1920 */     this.defaultScopeModel[11].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1921 */     this.defaultScopeModel[11].setRotationPoint(220.0F, -46.0F, 5.5F);
/*      */     
/* 1923 */     this.defaultScopeModel[12].addShapeBox(25.0F, -5.0F, -8.0F, 2, 6, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1924 */     this.defaultScopeModel[12].setRotationPoint(212.0F, -51.0F, 4.5F);
/*      */     
/* 1926 */     this.defaultScopeModel[13].addShapeBox(25.0F, -5.0F, -8.0F, 9, 6, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1927 */     this.defaultScopeModel[13].setRotationPoint(213.0F, -57.0F, 4.5F);
/*      */     
/* 1929 */     this.defaultScopeModel[14].addShapeBox(25.0F, -5.0F, -8.0F, 8, 5, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1930 */     this.defaultScopeModel[14].setRotationPoint(214.0F, -62.0F, 4.5F);
/*      */     
/* 1932 */     this.defaultScopeModel[15].addShapeBox(25.0F, -5.0F, -8.0F, 1, 17, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1933 */     this.defaultScopeModel[15].setRotationPoint(222.0F, -62.0F, 4.5F);
/*      */     
/* 1935 */     this.defaultScopeModel[16].addShapeBox(25.0F, -5.0F, -8.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1936 */     this.defaultScopeModel[16].setRotationPoint(221.0F, -51.0F, 4.5F);
/*      */     
/* 1938 */     this.defaultScopeModel[17].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1939 */     this.defaultScopeModel[17].setRotationPoint(214.0F, -51.0F, 4.5F);
/*      */     
/* 1941 */     this.defaultScopeModel[18].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1942 */     this.defaultScopeModel[18].setRotationPoint(220.0F, -49.0F, 4.5F);
/*      */     
/* 1944 */     this.defaultScopeModel[19].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1945 */     this.defaultScopeModel[19].setRotationPoint(214.0F, -49.0F, 4.5F);
/*      */     
/* 1947 */     this.defaultScopeModel[20].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1948 */     this.defaultScopeModel[20].setRotationPoint(214.0F, -46.0F, 4.5F);
/*      */     
/* 1950 */     this.defaultScopeModel[21].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1951 */     this.defaultScopeModel[21].setRotationPoint(220.0F, -46.0F, 4.5F);
/*      */     
/* 1953 */     this.defaultScopeModel[22].addShapeBox(25.0F, -5.0F, -8.0F, 1, 6, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1954 */     this.defaultScopeModel[22].setRotationPoint(222.0F, -51.0F, 5.5F);
/*      */     
/* 1956 */     this.defaultScopeModel[23].addShapeBox(25.0F, -5.0F, -8.0F, 9, 4, 5, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F);
/* 1957 */     this.defaultScopeModel[23].setRotationPoint(214.0F, -55.0F, 5.5F);
/*      */     
/* 1959 */     this.defaultScopeModel[24].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 5, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.35F, 0.0F, 0.0F);
/* 1960 */     this.defaultScopeModel[24].setRotationPoint(215.0F, -57.0F, 5.5F);
/*      */     
/* 1962 */     this.defaultScopeModel[25].addShapeBox(25.0F, -5.0F, -8.0F, 8, 4, 5, 0.0F, -0.8F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1963 */     this.defaultScopeModel[25].setRotationPoint(214.0F, -61.0F, 5.5F);
/*      */     
/* 1965 */     this.defaultScopeModel[26].addShapeBox(25.0F, -5.0F, -8.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1966 */     this.defaultScopeModel[26].setRotationPoint(215.0F, -63.0F, 11.0F);
/*      */     
/* 1968 */     this.defaultScopeModel[27].addShapeBox(25.0F, -5.0F, -8.0F, 8, 4, 1, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F);
/* 1969 */     this.defaultScopeModel[27].setRotationPoint(214.0F, -55.0F, 10.0F);
/*      */     
/* 1971 */     this.defaultScopeModel[28].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1972 */     this.defaultScopeModel[28].setRotationPoint(221.0F, -57.0F, 4.5F);
/*      */     
/* 1974 */     this.defaultScopeModel[29].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1975 */     this.defaultScopeModel[29].setRotationPoint(221.0F, -57.0F, 9.5F);
/*      */     
/* 1977 */     this.defaultScopeModel[30].addShapeBox(25.0F, -5.0F, -8.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1978 */     this.defaultScopeModel[30].setRotationPoint(215.0F, -63.0F, 4.0F);
/*      */     
/* 1980 */     this.defaultScopeModel[31].addShapeBox(25.0F, -5.0F, -8.0F, 7, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1981 */     this.defaultScopeModel[31].setRotationPoint(215.0F, -64.0F, 4.25F);
/*      */     
/* 1983 */     this.defaultScopeModel[32].addShapeBox(25.0F, -5.0F, -8.0F, 7, 1, 1, 0.0F, -1.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1984 */     this.defaultScopeModel[32].setRotationPoint(215.0F, -65.0F, 4.25F);
/*      */     
/* 1986 */     this.defaultScopeModel[33].addShapeBox(25.0F, -5.0F, -8.0F, 5, 1, 1, 0.0F, -1.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, 0.75F, -1.5F, 0.5F, 0.75F, -0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1987 */     this.defaultScopeModel[33].setRotationPoint(216.0F, -65.5F, 4.75F);
/*      */     
/* 1989 */     this.defaultScopeModel[34].addShapeBox(25.0F, -5.0F, -8.0F, 5, 1, 1, 0.0F, -1.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, -0.75F, -1.5F, 0.5F, -0.75F, -0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1990 */     this.defaultScopeModel[34].setRotationPoint(216.0F, -65.5F, 10.25F);
/*      */     
/* 1992 */     this.defaultScopeModel[35].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1993 */     this.defaultScopeModel[35].setRotationPoint(217.5F, -64.0F, 7.5F);
/*      */     
/* 1995 */     this.defaultScopeModel[36].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1996 */     this.defaultScopeModel[36].setRotationPoint(215.5F, -61.0F, 10.75F);
/*      */     
/* 1998 */     this.defaultScopeModel[37].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1999 */     this.defaultScopeModel[37].setRotationPoint(215.5F, -59.0F, 10.75F);
/*      */     
/* 2001 */     this.defaultScopeModel[38].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2002 */     this.defaultScopeModel[38].setRotationPoint(215.5F, -57.0F, 10.75F);
/*      */     
/* 2004 */     this.defaultScopeModel[39].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2005 */     this.defaultScopeModel[39].setRotationPoint(215.5F, -61.0F, 4.25F);
/*      */     
/* 2007 */     this.defaultScopeModel[40].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2008 */     this.defaultScopeModel[40].setRotationPoint(215.5F, -59.0F, 4.25F);
/*      */     
/* 2010 */     this.defaultScopeModel[41].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2011 */     this.defaultScopeModel[41].setRotationPoint(215.5F, -57.0F, 4.25F);
/*      */     
/* 2013 */     this.defaultScopeModel[42].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2014 */     this.defaultScopeModel[42].setRotationPoint(-42.5F, -60.5F, 2.5F);
/*      */     
/* 2016 */     this.defaultScopeModel[43].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2017 */     this.defaultScopeModel[43].setRotationPoint(-39.5F, -60.5F, 2.5F);
/*      */     
/* 2019 */     this.defaultScopeModel[44].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2020 */     this.defaultScopeModel[44].setRotationPoint(-34.5F, -60.5F, 2.5F);
/*      */     
/* 2022 */     this.defaultScopeModel[45].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2023 */     this.defaultScopeModel[45].setRotationPoint(-32.5F, -60.5F, 2.5F);
/*      */     
/* 2025 */     this.defaultScopeModel[46].addShapeBox(25.0F, -5.0F, -8.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2026 */     this.defaultScopeModel[46].setRotationPoint(-29.5F, -60.5F, 2.5F);
/*      */     
/* 2028 */     this.defaultScopeModel[47].addShapeBox(25.0F, -5.0F, -8.0F, 2, 5, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2029 */     this.defaultScopeModel[47].setRotationPoint(-25.5F, -62.5F, 2.5F);
/*      */     
/* 2031 */     this.defaultScopeModel[48].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2032 */     this.defaultScopeModel[48].setRotationPoint(-36.5F, -59.5F, 2.5F);
/*      */     
/* 2034 */     this.defaultScopeModel[49].addShapeBox(25.0F, -5.0F, -8.0F, 2, 5, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2035 */     this.defaultScopeModel[49].setRotationPoint(-23.5F, -62.5F, 2.5F);
/*      */     
/* 2037 */     this.defaultScopeModel[50].addShapeBox(25.0F, -5.0F, -8.0F, 2, 5, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2038 */     this.defaultScopeModel[50].setRotationPoint(-21.5F, -62.5F, 2.5F);
/*      */     
/* 2040 */     this.defaultScopeModel[51].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 3, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2041 */     this.defaultScopeModel[51].setRotationPoint(-19.5F, -60.5F, 2.5F);
/*      */     
/* 2043 */     this.defaultScopeModel[52].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2044 */     this.defaultScopeModel[52].setRotationPoint(-18.5F, -59.5F, 2.5F);
/*      */     
/* 2046 */     this.defaultScopeModel[53].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2047 */     this.defaultScopeModel[53].setRotationPoint(-17.5F, -59.5F, 2.5F);
/*      */     
/* 2049 */     this.defaultScopeModel[54].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2050 */     this.defaultScopeModel[54].setRotationPoint(-24.0F, -62.0F, 12.0F);
/*      */     
/* 2052 */     this.defaultScopeModel[55].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2053 */     this.defaultScopeModel[55].setRotationPoint(-23.0F, -62.0F, 12.0F);
/*      */     
/* 2055 */     this.defaultScopeModel[56].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2056 */     this.defaultScopeModel[56].setRotationPoint(-22.0F, -62.0F, 12.0F);
/*      */     
/* 2058 */     this.defaultScopeModel[57].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2059 */     this.defaultScopeModel[57].setRotationPoint(-42.5F, -60.5F, 10.5F);
/*      */     
/* 2061 */     this.defaultScopeModel[58].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2062 */     this.defaultScopeModel[58].setRotationPoint(-39.5F, -60.5F, 10.5F);
/*      */     
/* 2064 */     this.defaultScopeModel[59].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2065 */     this.defaultScopeModel[59].setRotationPoint(-34.5F, -60.5F, 10.5F);
/*      */     
/* 2067 */     this.defaultScopeModel[60].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2068 */     this.defaultScopeModel[60].setRotationPoint(-32.5F, -60.5F, 10.5F);
/*      */     
/* 2070 */     this.defaultScopeModel[61].addShapeBox(25.0F, -5.0F, -8.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2071 */     this.defaultScopeModel[61].setRotationPoint(-29.5F, -60.5F, 10.5F);
/*      */     
/* 2073 */     this.defaultScopeModel[62].addShapeBox(25.0F, -5.0F, -8.0F, 2, 5, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2074 */     this.defaultScopeModel[62].setRotationPoint(-25.5F, -62.5F, 10.5F);
/*      */     
/* 2076 */     this.defaultScopeModel[63].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2077 */     this.defaultScopeModel[63].setRotationPoint(-36.5F, -59.5F, 10.5F);
/*      */     
/* 2079 */     this.defaultScopeModel[64].addShapeBox(25.0F, -5.0F, -8.0F, 2, 5, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2080 */     this.defaultScopeModel[64].setRotationPoint(-23.5F, -62.5F, 10.5F);
/*      */     
/* 2082 */     this.defaultScopeModel[65].addShapeBox(25.0F, -5.0F, -8.0F, 2, 5, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2083 */     this.defaultScopeModel[65].setRotationPoint(-21.5F, -62.5F, 10.5F);
/*      */     
/* 2085 */     this.defaultScopeModel[66].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 3, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2086 */     this.defaultScopeModel[66].setRotationPoint(-19.5F, -60.5F, 10.5F);
/*      */     
/* 2088 */     this.defaultScopeModel[67].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2089 */     this.defaultScopeModel[67].setRotationPoint(-18.5F, -59.5F, 10.5F);
/*      */     
/* 2091 */     this.defaultScopeModel[68].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2092 */     this.defaultScopeModel[68].setRotationPoint(-17.5F, -59.5F, 10.5F);
/*      */     
/* 2094 */     this.defaultScopeModel[69].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2095 */     this.defaultScopeModel[69].setRotationPoint(-42.5F, -60.5F, 5.5F);
/*      */     
/* 2097 */     this.defaultScopeModel[70].addShapeBox(25.0F, -5.0F, -8.0F, 3, 2, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2098 */     this.defaultScopeModel[70].setRotationPoint(-39.5F, -60.5F, 5.5F);
/*      */     
/* 2100 */     this.defaultScopeModel[71].addShapeBox(25.0F, -5.0F, -8.0F, 23, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2101 */     this.defaultScopeModel[71].setRotationPoint(-36.5F, -59.5F, 5.5F);
/*      */     
/* 2103 */     this.defaultScopeModel[72].addShapeBox(25.0F, -5.0F, -8.0F, 3, 3, 5, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2104 */     this.defaultScopeModel[72].setRotationPoint(-13.5F, -60.5F, 5.5F);
/*      */     
/* 2106 */     this.defaultScopeModel[73].addShapeBox(25.0F, -5.0F, -8.0F, 7, 4, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2107 */     this.defaultScopeModel[73].setRotationPoint(-19.5F, -62.5F, 9.5F);
/*      */     
/* 2109 */     this.defaultScopeModel[74].addShapeBox(25.0F, -5.0F, -8.0F, 7, 4, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2110 */     this.defaultScopeModel[74].setRotationPoint(-19.5F, -62.5F, 5.5F);
/*      */     
/* 2112 */     this.defaultScopeModel[75].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2113 */     this.defaultScopeModel[75].setRotationPoint(-19.5F, -64.25F, 9.5F);
/*      */     
/* 2115 */     this.defaultScopeModel[76].addShapeBox(25.0F, -5.0F, -8.0F, 7, 2, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2116 */     this.defaultScopeModel[76].setRotationPoint(-19.5F, -64.25F, 5.5F);
/*      */     
/* 2118 */     this.defaultScopeModel[77].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 1, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2119 */     this.defaultScopeModel[77].setRotationPoint(-18.5F, -65.25F, 9.5F);
/*      */     
/* 2121 */     this.defaultScopeModel[78].addShapeBox(25.0F, -5.0F, -8.0F, 5, 2, 1, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2122 */     this.defaultScopeModel[78].setRotationPoint(-18.5F, -65.25F, 5.5F);
/*      */     
/* 2124 */     this.defaultScopeModel[79].addShapeBox(25.0F, -5.0F, -8.0F, 3, 4, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2125 */     this.defaultScopeModel[79].setRotationPoint(-41.5F, -62.5F, 9.5F);
/*      */     
/* 2127 */     this.defaultScopeModel[80].addShapeBox(25.0F, -5.0F, -8.0F, 3, 4, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2128 */     this.defaultScopeModel[80].setRotationPoint(-41.5F, -62.5F, 5.5F);
/*      */     
/* 2130 */     this.defaultScopeModel[81].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2131 */     this.defaultScopeModel[81].setRotationPoint(-38.5F, -61.5F, 9.5F);
/*      */     
/* 2133 */     this.defaultScopeModel[82].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2134 */     this.defaultScopeModel[82].setRotationPoint(-37.5F, -60.5F, 9.5F);
/*      */     
/* 2136 */     this.defaultScopeModel[83].addShapeBox(25.0F, -5.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2137 */     this.defaultScopeModel[83].setRotationPoint(-35.5F, -60.5F, 9.5F);
/*      */     
/* 2139 */     this.defaultScopeModel[84].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2140 */     this.defaultScopeModel[84].setRotationPoint(-38.5F, -61.5F, 5.5F);
/*      */     
/* 2142 */     this.defaultScopeModel[85].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2143 */     this.defaultScopeModel[85].setRotationPoint(-37.5F, -60.5F, 5.5F);
/*      */     
/* 2145 */     this.defaultScopeModel[86].addShapeBox(25.0F, -5.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2146 */     this.defaultScopeModel[86].setRotationPoint(-35.5F, -60.5F, 5.5F);
/*      */     
/* 2148 */     this.defaultScopeModel[87].addShapeBox(25.0F, -5.0F, -8.0F, 1, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2149 */     this.defaultScopeModel[87].setRotationPoint(-13.5F, -60.5F, 6.5F);
/*      */     
/* 2151 */     this.defaultScopeModel[88].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2152 */     this.defaultScopeModel[88].setRotationPoint(-39.5F, -63.5F, 9.5F);
/*      */     
/* 2154 */     this.defaultScopeModel[89].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2155 */     this.defaultScopeModel[89].setRotationPoint(-39.5F, -63.5F, 5.5F);
/*      */     
/* 2157 */     this.defaultScopeModel[90].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2158 */     this.defaultScopeModel[90].setRotationPoint(-41.5F, -63.5F, 5.5F);
/*      */     
/* 2160 */     this.defaultScopeModel[91].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2161 */     this.defaultScopeModel[91].setRotationPoint(-41.5F, -63.5F, 9.5F);
/*      */     
/* 2163 */     this.defaultScopeModel[92].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2164 */     this.defaultScopeModel[92].setRotationPoint(-41.5F, -65.0F, 9.5F);
/*      */     
/* 2166 */     this.defaultScopeModel[93].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2167 */     this.defaultScopeModel[93].setRotationPoint(-41.5F, -65.0F, 5.5F);
/*      */     
/* 2169 */     this.defaultScopeModel[94].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F);
/* 2170 */     this.defaultScopeModel[94].setRotationPoint(-41.5F, -63.5F, 6.5F);
/*      */     
/* 2172 */     this.defaultScopeModel[95].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 2173 */     this.defaultScopeModel[95].setRotationPoint(-41.5F, -63.5F, 8.5F);
/*      */     
/* 2175 */     this.defaultScopeModel[96].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 2, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F);
/* 2176 */     this.defaultScopeModel[96].setRotationPoint(-41.5F, -63.5F, 7.0F);
/*      */     
/* 2178 */     this.defaultScopeModel[97].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F);
/* 2179 */     this.defaultScopeModel[97].setRotationPoint(-41.5F, -64.25F, 7.0F);
/*      */     
/* 2181 */     this.defaultScopeModel[98].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 1, 0.0F, -0.5F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F);
/* 2182 */     this.defaultScopeModel[98].setRotationPoint(-41.5F, -64.25F, 8.0F);
/*      */     
/* 2184 */     this.defaultScopeModel[99].addShapeBox(25.0F, -5.0F, -8.0F, 2, 1, 4, 0.0F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 2185 */     this.defaultScopeModel[99].setRotationPoint(-41.5F, -61.75F, 5.5F);
/*      */     
/* 2187 */     this.defaultScopeModel[100].addShapeBox(25.0F, -5.0F, -8.0F, 17, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2188 */     this.defaultScopeModel[100].setRotationPoint(-37.5F, -62.5F, 6.5F);
/*      */     
/* 2190 */     this.defaultScopeModel[101].addShapeBox(25.0F, -5.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2191 */     this.defaultScopeModel[101].setRotationPoint(-39.5F, -62.5F, 7.0F);
/*      */     
/* 2193 */     this.defaultScopeModel[102].addShapeBox(25.0F, -5.0F, -8.0F, 6, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2194 */     this.defaultScopeModel[102].setRotationPoint(-20.5F, -61.5F, 7.0F);
/*      */     
/* 2196 */     this.defaultScopeModel[103].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2197 */     this.defaultScopeModel[103].setRotationPoint(-19.0F, -61.0F, 6.0F);
/*      */     
/* 2199 */     this.defaultScopeModel[104].addShapeBox(25.0F, -5.0F, -8.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2200 */     this.defaultScopeModel[104].setRotationPoint(-15.5F, -61.0F, 6.0F);
/*      */     
/* 2202 */     this.defaultScopeModel[105].addShapeBox(25.0F, -5.0F, -8.0F, 8, 1, 2, 0.0F, -1.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.8F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F);
/* 2203 */     this.defaultScopeModel[105].setRotationPoint(214.0F, -62.0F, 8.5F);
/*      */     
/* 2205 */     this.defaultScopeModel[106].addShapeBox(25.0F, -5.0F, -8.0F, 8, 1, 2, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, -0.8F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F);
/* 2206 */     this.defaultScopeModel[106].setRotationPoint(214.0F, -62.0F, 6.5F);
/*      */     
/* 2208 */     this.defaultScopeModel[107].addShapeBox(25.0F, -5.0F, -8.0F, 17, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2209 */     this.defaultScopeModel[107].setRotationPoint(-37.5F, -62.5F, 8.5F);
/*      */     
/* 2211 */     this.defaultScopeModel[108].addShapeBox(25.0F, -5.0F, -8.0F, 17, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2212 */     this.defaultScopeModel[108].setRotationPoint(-37.5F, -62.5F, 7.5F);
/*      */     
/*      */ 
/* 2215 */     this.ammoModel = new ModelRendererTurbo[39];
/* 2216 */     this.ammoModel[0] = new ModelRendererTurbo(this, 2001, 81, this.textureX, this.textureY);
/* 2217 */     this.ammoModel[1] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/* 2218 */     this.ammoModel[2] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/* 2219 */     this.ammoModel[3] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/* 2220 */     this.ammoModel[4] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/* 2221 */     this.ammoModel[5] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/* 2222 */     this.ammoModel[6] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/* 2223 */     this.ammoModel[7] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/* 2224 */     this.ammoModel[8] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/* 2225 */     this.ammoModel[9] = new ModelRendererTurbo(this, 545, 89, this.textureX, this.textureY);
/* 2226 */     this.ammoModel[10] = new ModelRendererTurbo(this, 577, 89, this.textureX, this.textureY);
/* 2227 */     this.ammoModel[11] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/* 2228 */     this.ammoModel[12] = new ModelRendererTurbo(this, 737, 89, this.textureX, this.textureY);
/* 2229 */     this.ammoModel[13] = new ModelRendererTurbo(this, 809, 89, this.textureX, this.textureY);
/* 2230 */     this.ammoModel[14] = new ModelRendererTurbo(this, 849, 89, this.textureX, this.textureY);
/* 2231 */     this.ammoModel[15] = new ModelRendererTurbo(this, 1049, 89, this.textureX, this.textureY);
/* 2232 */     this.ammoModel[16] = new ModelRendererTurbo(this, 1089, 89, this.textureX, this.textureY);
/* 2233 */     this.ammoModel[17] = new ModelRendererTurbo(this, 1177, 89, this.textureX, this.textureY);
/* 2234 */     this.ammoModel[18] = new ModelRendererTurbo(this, 1681, 89, this.textureX, this.textureY);
/* 2235 */     this.ammoModel[19] = new ModelRendererTurbo(this, 1737, 89, this.textureX, this.textureY);
/* 2236 */     this.ammoModel[20] = new ModelRendererTurbo(this, 1793, 89, this.textureX, this.textureY);
/* 2237 */     this.ammoModel[21] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/* 2238 */     this.ammoModel[22] = new ModelRendererTurbo(this, 609, 97, this.textureX, this.textureY);
/* 2239 */     this.ammoModel[23] = new ModelRendererTurbo(this, 1969, 89, this.textureX, this.textureY);
/* 2240 */     this.ammoModel[24] = new ModelRendererTurbo(this, 1905, 65, this.textureX, this.textureY);
/* 2241 */     this.ammoModel[25] = new ModelRendererTurbo(this, 889, 97, this.textureX, this.textureY);
/* 2242 */     this.ammoModel[26] = new ModelRendererTurbo(this, 665, 97, this.textureX, this.textureY);
/* 2243 */     this.ammoModel[27] = new ModelRendererTurbo(this, 937, 97, this.textureX, this.textureY);
/* 2244 */     this.ammoModel[28] = new ModelRendererTurbo(this, 993, 97, this.textureX, this.textureY);
/* 2245 */     this.ammoModel[29] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/* 2246 */     this.ammoModel[30] = new ModelRendererTurbo(this, 1129, 97, this.textureX, this.textureY);
/* 2247 */     this.ammoModel[31] = new ModelRendererTurbo(this, 1241, 97, this.textureX, this.textureY);
/* 2248 */     this.ammoModel[32] = new ModelRendererTurbo(this, 1281, 97, this.textureX, this.textureY);
/* 2249 */     this.ammoModel[33] = new ModelRendererTurbo(this, 1321, 97, this.textureX, this.textureY);
/* 2250 */     this.ammoModel[34] = new ModelRendererTurbo(this, 1369, 97, this.textureX, this.textureY);
/* 2251 */     this.ammoModel[35] = new ModelRendererTurbo(this, 1417, 97, this.textureX, this.textureY);
/* 2252 */     this.ammoModel[36] = new ModelRendererTurbo(this, 1465, 97, this.textureX, this.textureY);
/* 2253 */     this.ammoModel[37] = new ModelRendererTurbo(this, 1513, 97, this.textureX, this.textureY);
/* 2254 */     this.ammoModel[38] = new ModelRendererTurbo(this, 1561, 97, this.textureX, this.textureY);
/*      */     
/* 2256 */     this.ammoModel[0].addShapeBox(25.0F, -5.0F, -8.0F, 5, 14, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 2257 */     this.ammoModel[0].setRotationPoint(16.5F, -29.0F, 2.0F);
/*      */     
/* 2259 */     this.ammoModel[1].addShapeBox(25.0F, -5.0F, -8.0F, 5, 10, 12, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F);
/* 2260 */     this.ammoModel[1].setRotationPoint(16.5F, -15.0F, 2.0F);
/*      */     
/* 2262 */     this.ammoModel[2].addShapeBox(25.0F, -5.0F, -8.0F, 5, 10, 12, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F);
/* 2263 */     this.ammoModel[2].setRotationPoint(19.5F, -5.0F, 2.0F);
/*      */     
/* 2265 */     this.ammoModel[3].addShapeBox(25.0F, -5.0F, -8.0F, 5, 10, 12, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 2266 */     this.ammoModel[3].setRotationPoint(22.5F, 5.0F, 2.0F);
/*      */     
/* 2268 */     this.ammoModel[4].addShapeBox(25.0F, -5.0F, -8.0F, 7, 10, 12, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 2269 */     this.ammoModel[4].setRotationPoint(25.5F, 15.0F, 2.0F);
/*      */     
/* 2271 */     this.ammoModel[5].addShapeBox(25.0F, -5.0F, -8.0F, 8, 10, 12, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 2272 */     this.ammoModel[5].setRotationPoint(30.5F, 25.0F, 2.0F);
/*      */     
/* 2274 */     this.ammoModel[6].addShapeBox(25.0F, -5.0F, -8.0F, 8, 10, 12, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F);
/* 2275 */     this.ammoModel[6].setRotationPoint(35.5F, 35.0F, 2.0F);
/*      */     
/* 2277 */     this.ammoModel[7].addShapeBox(25.0F, -5.0F, -8.0F, 5, 6, 12, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 2278 */     this.ammoModel[7].setRotationPoint(41.5F, 45.0F, 2.0F);
/*      */     
/* 2280 */     this.ammoModel[8].addShapeBox(25.0F, -5.0F, -8.0F, 20, 14, 12, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -20.0F, 0.0F, 0.0F, -20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2281 */     this.ammoModel[8].setRotationPoint(46.5F, 37.0F, 2.0F);
/*      */     
/* 2283 */     this.ammoModel[9].addShapeBox(25.0F, -5.0F, -8.0F, 3, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2284 */     this.ammoModel[9].setRotationPoint(43.5F, 37.0F, 2.0F);
/*      */     
/* 2286 */     this.ammoModel[10].addShapeBox(25.0F, -5.0F, -8.0F, 6, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2287 */     this.ammoModel[10].setRotationPoint(58.5F, 33.0F, 2.0F);
/*      */     
/* 2289 */     this.ammoModel[11].addShapeBox(25.0F, -5.0F, -8.0F, 6, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2290 */     this.ammoModel[11].setRotationPoint(55.5F, 29.0F, 2.0F);
/*      */     
/* 2292 */     this.ammoModel[12].addShapeBox(25.0F, -5.0F, -8.0F, 6, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2293 */     this.ammoModel[12].setRotationPoint(52.5F, 21.0F, 2.0F);
/*      */     
/* 2295 */     this.ammoModel[13].addShapeBox(25.0F, -5.0F, -8.0F, 6, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2296 */     this.ammoModel[13].setRotationPoint(47.5F, 13.0F, 2.0F);
/*      */     
/* 2298 */     this.ammoModel[14].addShapeBox(25.0F, -5.0F, -8.0F, 6, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2299 */     this.ammoModel[14].setRotationPoint(43.5F, 5.0F, 2.0F);
/*      */     
/* 2301 */     this.ammoModel[15].addShapeBox(25.0F, -5.0F, -8.0F, 6, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2302 */     this.ammoModel[15].setRotationPoint(39.5F, -3.0F, 2.0F);
/*      */     
/* 2304 */     this.ammoModel[16].addShapeBox(25.0F, -5.0F, -8.0F, 6, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2305 */     this.ammoModel[16].setRotationPoint(36.5F, -11.0F, 2.0F);
/*      */     
/* 2307 */     this.ammoModel[17].addShapeBox(25.0F, -5.0F, -8.0F, 16, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2308 */     this.ammoModel[17].setRotationPoint(24.5F, -19.0F, 2.0F);
/*      */     
/* 2310 */     this.ammoModel[18].addShapeBox(25.0F, -5.0F, -8.0F, 14, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2311 */     this.ammoModel[18].setRotationPoint(24.5F, -29.0F, 2.0F);
/*      */     
/* 2313 */     this.ammoModel[19].addShapeBox(25.0F, -5.0F, -8.0F, 15, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2314 */     this.ammoModel[19].setRotationPoint(32.5F, 13.0F, 2.0F);
/*      */     
/* 2316 */     this.ammoModel[20].addShapeBox(25.0F, -5.0F, -8.0F, 5, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2317 */     this.ammoModel[20].setRotationPoint(47.5F, 21.0F, 2.0F);
/*      */     
/* 2319 */     this.ammoModel[21].addShapeBox(25.0F, -5.0F, -8.0F, 14, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2320 */     this.ammoModel[21].setRotationPoint(38.5F, 25.0F, 2.0F);
/*      */     
/* 2322 */     this.ammoModel[22].addShapeBox(25.0F, -5.0F, -8.0F, 15, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2323 */     this.ammoModel[22].setRotationPoint(43.5F, 35.0F, 2.0F);
/*      */     
/* 2325 */     this.ammoModel[23].addShapeBox(25.0F, -5.0F, -8.0F, 3, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2326 */     this.ammoModel[23].setRotationPoint(52.5F, 29.0F, 2.0F);
/*      */     
/* 2328 */     this.ammoModel[24].addShapeBox(25.0F, -5.0F, -8.0F, 3, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2329 */     this.ammoModel[24].setRotationPoint(55.5F, 33.0F, 2.0F);
/*      */     
/* 2331 */     this.ammoModel[25].addShapeBox(25.0F, -5.0F, -8.0F, 11, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2332 */     this.ammoModel[25].setRotationPoint(32.5F, 5.0F, 2.0F);
/*      */     
/* 2334 */     this.ammoModel[26].addShapeBox(25.0F, -5.0F, -8.0F, 5, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2335 */     this.ammoModel[26].setRotationPoint(27.5F, 5.0F, 2.0F);
/*      */     
/* 2337 */     this.ammoModel[27].addShapeBox(25.0F, -5.0F, -8.0F, 15, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2338 */     this.ammoModel[27].setRotationPoint(24.5F, -3.0F, 2.0F);
/*      */     
/* 2340 */     this.ammoModel[28].addShapeBox(25.0F, -5.0F, -8.0F, 12, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2341 */     this.ammoModel[28].setRotationPoint(24.5F, -11.0F, 2.0F);
/*      */     
/* 2343 */     this.ammoModel[29].addShapeBox(25.0F, -5.0F, -8.0F, 3, 24, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2344 */     this.ammoModel[29].setRotationPoint(21.5F, -29.0F, 2.0F);
/*      */     
/* 2346 */     this.ammoModel[30].addShapeBox(25.0F, -5.0F, -8.0F, 10, 10, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2347 */     this.ammoModel[30].setRotationPoint(34.5F, -29.0F, 4.5F);
/*      */     
/* 2349 */     this.ammoModel[31].addShapeBox(25.0F, -5.0F, -8.0F, 12, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2350 */     this.ammoModel[31].setRotationPoint(34.5F, -19.0F, 4.5F);
/*      */     
/* 2352 */     this.ammoModel[32].addShapeBox(25.0F, -5.0F, -8.0F, 10, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2353 */     this.ammoModel[32].setRotationPoint(39.5F, -11.0F, 4.5F);
/*      */     
/* 2355 */     this.ammoModel[33].addShapeBox(25.0F, -5.0F, -8.0F, 13, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2356 */     this.ammoModel[33].setRotationPoint(39.5F, -3.0F, 4.5F);
/*      */     
/* 2358 */     this.ammoModel[34].addShapeBox(25.0F, -5.0F, -8.0F, 16, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2359 */     this.ammoModel[34].setRotationPoint(39.5F, 5.0F, 4.5F);
/*      */     
/* 2361 */     this.ammoModel[35].addShapeBox(25.0F, -5.0F, -8.0F, 16, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2362 */     this.ammoModel[35].setRotationPoint(42.5F, 13.0F, 4.5F);
/*      */     
/* 2364 */     this.ammoModel[36].addShapeBox(25.0F, -5.0F, -8.0F, 16, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2365 */     this.ammoModel[36].setRotationPoint(46.5F, 21.0F, 4.5F);
/*      */     
/* 2367 */     this.ammoModel[37].addShapeBox(25.0F, -5.0F, -8.0F, 16, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2368 */     this.ammoModel[37].setRotationPoint(52.5F, 29.0F, 4.5F);
/*      */     
/* 2370 */     this.ammoModel[38].addShapeBox(25.0F, -5.0F, -8.0F, 16, 4, 7, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, -4.25F, 1.25F, 0.0F, -4.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/* 2371 */     this.ammoModel[38].setRotationPoint(52.5F, 32.0F, 4.5F);
/*      */     
/*      */ 
/* 2374 */     this.slideModel = new ModelRendererTurbo[10];
/* 2375 */     this.slideModel[0] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 2376 */     this.slideModel[1] = new ModelRendererTurbo(this, 721, 73, this.textureX, this.textureY);
/* 2377 */     this.slideModel[2] = new ModelRendererTurbo(this, 889, 73, this.textureX, this.textureY);
/* 2378 */     this.slideModel[3] = new ModelRendererTurbo(this, 977, 73, this.textureX, this.textureY);
/* 2379 */     this.slideModel[4] = new ModelRendererTurbo(this, 1065, 73, this.textureX, this.textureY);
/* 2380 */     this.slideModel[5] = new ModelRendererTurbo(this, 777, 97, this.textureX, this.textureY);
/* 2381 */     this.slideModel[6] = new ModelRendererTurbo(this, 1609, 97, this.textureX, this.textureY);
/* 2382 */     this.slideModel[7] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/* 2383 */     this.slideModel[8] = new ModelRendererTurbo(this, 1225, 65, this.textureX, this.textureY);
/* 2384 */     this.slideModel[9] = new ModelRendererTurbo(this, 1897, 49, this.textureX, this.textureY);
/*      */     
/* 2386 */     this.slideModel[0].addShapeBox(25.0F, -5.0F, -8.0F, 33, 2, 7, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2387 */     this.slideModel[0].setRotationPoint(25.0F, -44.0F, 0.25F);
/*      */     
/* 2389 */     this.slideModel[1].addShapeBox(25.0F, -5.0F, -8.0F, 33, 2, 7, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2390 */     this.slideModel[1].setRotationPoint(25.0F, -44.0F, 8.75F);
/*      */     
/* 2392 */     this.slideModel[2].addShapeBox(25.0F, -5.0F, -8.0F, 33, 11, 7, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2393 */     this.slideModel[2].setRotationPoint(25.0F, -55.0F, 8.75F);
/*      */     
/* 2395 */     this.slideModel[3].addShapeBox(25.0F, -5.0F, -8.0F, 33, 11, 7, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2396 */     this.slideModel[3].setRotationPoint(25.0F, -55.0F, 0.25F);
/*      */     
/* 2398 */     this.slideModel[4].addShapeBox(25.0F, -5.0F, -8.0F, 33, 5, 7, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 2399 */     this.slideModel[4].setRotationPoint(55.0F, -54.0F, 4.5F);
/*      */     
/* 2401 */     this.slideModel[5].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2402 */     this.slideModel[5].setRotationPoint(84.5F, -53.0F, 5.5F);
/*      */     
/* 2404 */     this.slideModel[6].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2405 */     this.slideModel[6].setRotationPoint(84.5F, -53.0F, -3.5F);
/*      */     
/* 2407 */     this.slideModel[7].addShapeBox(25.0F, -5.0F, -8.0F, 2, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2408 */     this.slideModel[7].setRotationPoint(84.5F, -53.0F, -4.5F);
/*      */     
/* 2410 */     this.slideModel[8].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2411 */     this.slideModel[8].setRotationPoint(86.5F, -53.0F, -1.5F);
/*      */     
/* 2413 */     this.slideModel[9].addShapeBox(25.0F, -5.0F, -8.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2414 */     this.slideModel[9].setRotationPoint(87.0F, -53.0F, 0.5F);
/*      */     
/*      */ 
/*      */ 
/* 2418 */     this.scopeAttachPoint = new Vector3f(0.9375F, 5.25F, 0.0F);
/* 2419 */     this.gripAttachPoint = new Vector3f(8.1875F, 3.5F, 0.0F);
/*      */     
/* 2421 */     translateAll(0.0F, -22.0F, 0.0F);
/* 2422 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/* 2424 */     this.gunSlideDistance = 0.75F;
/* 2425 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/* 2428 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelak12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */