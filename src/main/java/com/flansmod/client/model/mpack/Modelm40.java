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
/*      */ public class Modelm40
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelm40()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['´'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 585, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 841, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 1049, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 1145, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 1225, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 1305, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 1385, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 1465, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 1545, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 1625, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 1721, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 1817, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 1913, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 1969, 9, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 569, 41, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 1105, 41, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 1201, 49, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 617, 49, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 1681, 49, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 1777, 49, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 1873, 49, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 913, 57, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 1009, 57, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1593, 57, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1929, 57, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 1033, 129, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 1041, 185, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 553, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 713, 81, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 1113, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 1193, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 1641, 97, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 1785, 97, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1897, 137, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 1625, 145, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 577, 209, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 729, 209, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 857, 209, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 1897, 105, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 1041, 113, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 1777, 217, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 1905, 225, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 761, 241, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 1273, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 1721, 145, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 857, 241, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 1353, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 137, 153, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 225, 153, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 537, 153, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 881, 153, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 897, 249, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 1089, 249, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 1281, 249, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 1369, 249, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 1457, 249, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 1537, 249, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 585, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 665, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 841, 1, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 89, 257, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 305, 257, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 393, 257, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 529, 41, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 1873, 257, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 1161, 41, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 1937, 265, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 737, 273, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 569, 281, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 633, 281, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 1553, 49, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 1737, 49, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 833, 281, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 1833, 49, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 969, 57, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 1257, 289, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 1977, 57, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 65, 297, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 1065, 57, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 1641, 57, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 1673, 65, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 1753, 97, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 537, 209, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 1321, 289, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 1057, 249, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 1505, 297, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 1249, 249, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 1849, 289, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 1593, 113, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 1337, 249, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 345, 297, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 1065, 297, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 913, 313, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 1889, 313, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 1, 337, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 161, 337, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 321, 337, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 609, 337, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 1049, 337, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 1209, 337, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 729, 361, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 1369, 297, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 1785, 297, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 481, 305, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 1785, 353, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 1329, 345, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 1425, 313, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 1001, 353, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 537, 369, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 377, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 1089, 377, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 1185, 377, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 1249, 385, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 1313, 393, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 1409, 393, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 1969, 369, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 673, 377, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 1505, 393, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 1585, 393, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 1665, 393, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 401, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 401, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1713, 401, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 1, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 1425, 249, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 257, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 1513, 249, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 1761, 401, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 257, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 1841, 249, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 1569, 105, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 257, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 969, 353, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 633, 369, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 505, 105, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 1625, 17, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1465, 9, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 1833, 401, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1921, 401, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 953, 409, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 489, 425, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 641, 425, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 1185, 425, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1, 433, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 233, 377, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 1153, 377, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1489, 433, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 249, 441, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1377, 393, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1473, 393, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1553, 393, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1929, 121, this.textureX, this.textureY);
/*      */     
/*  203 */     this.gunModel[0].addBox(153.0F, -21.0F, -16.0F, 220, 40, 34, 0.0F);
/*  204 */     this.gunModel[0].setRotationPoint(0.0F, -58.0F, 0.0F);
/*      */     
/*  206 */     this.gunModel[1].addShapeBox(153.0F, -21.0F, -16.0F, 5, 6, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F);
/*  207 */     this.gunModel[1].setRotationPoint(-5.0F, -18.0F, 3.0F);
/*      */     
/*  209 */     this.gunModel[2].addShapeBox(153.0F, -21.0F, -16.0F, 6, 2, 34, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F);
/*  210 */     this.gunModel[2].setRotationPoint(-6.0F, -20.0F, 0.0F);
/*      */     
/*  212 */     this.gunModel[3].addShapeBox(153.0F, -21.0F, -16.0F, 47, 38, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  213 */     this.gunModel[3].setRotationPoint(-47.0F, -58.0F, 0.0F);
/*      */     
/*  215 */     this.gunModel[4].addBox(153.0F, -21.0F, -16.0F, 18, 40, 34, 0.0F);
/*  216 */     this.gunModel[4].setRotationPoint(232.0F, -58.0F, 0.0F);
/*      */     
/*  218 */     this.gunModel[5].addShapeBox(153.0F, -21.0F, -16.0F, 12, 17, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  219 */     this.gunModel[5].setRotationPoint(220.0F, -58.0F, 0.0F);
/*      */     
/*  221 */     this.gunModel[6].addShapeBox(153.0F, -21.0F, -16.0F, 12, 16, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  222 */     this.gunModel[6].setRotationPoint(220.0F, -34.0F, 0.0F);
/*      */     
/*  224 */     this.gunModel[7].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  225 */     this.gunModel[7].setRotationPoint(222.0F, -37.0F, 0.0F);
/*      */     
/*  227 */     this.gunModel[8].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  228 */     this.gunModel[8].setRotationPoint(227.0F, -37.0F, 0.0F);
/*      */     
/*  230 */     this.gunModel[9].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  231 */     this.gunModel[9].setRotationPoint(227.0F, -41.0F, 0.0F);
/*      */     
/*  233 */     this.gunModel[10].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  234 */     this.gunModel[10].setRotationPoint(222.0F, -41.0F, 0.0F);
/*      */     
/*  236 */     this.gunModel[11].addShapeBox(153.0F, -21.0F, -16.0F, 2, 9, 34, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  237 */     this.gunModel[11].setRotationPoint(220.0F, -42.0F, 0.0F);
/*      */     
/*  239 */     this.gunModel[12].addShapeBox(153.0F, -21.0F, -16.0F, 2, 9, 34, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  240 */     this.gunModel[12].setRotationPoint(230.0F, -42.0F, 0.0F);
/*      */     
/*  242 */     this.gunModel[13].addShapeBox(153.0F, -21.0F, -16.0F, 8, 15, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  243 */     this.gunModel[13].setRotationPoint(211.0F, -45.0F, -1.5F);
/*      */     
/*  245 */     this.gunModel[14].addShapeBox(153.0F, -21.0F, -16.0F, 8, 7, 37, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  246 */     this.gunModel[14].setRotationPoint(211.0F, -52.0F, -1.5F);
/*      */     
/*  248 */     this.gunModel[15].addShapeBox(153.0F, -21.0F, -16.0F, 8, 3, 37, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  249 */     this.gunModel[15].setRotationPoint(203.0F, -55.0F, -1.5F);
/*      */     
/*  251 */     this.gunModel[16].addShapeBox(153.0F, -21.0F, -16.0F, 8, 7, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  252 */     this.gunModel[16].setRotationPoint(211.0F, -30.0F, -1.5F);
/*      */     
/*  254 */     this.gunModel[17].addShapeBox(153.0F, -21.0F, -16.0F, 8, 3, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  255 */     this.gunModel[17].setRotationPoint(203.0F, -23.0F, -1.5F);
/*      */     
/*  257 */     this.gunModel[18].addShapeBox(153.0F, -21.0F, -16.0F, 2, 7, 37, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  258 */     this.gunModel[18].setRotationPoint(219.0F, -37.0F, -1.5F);
/*      */     
/*  260 */     this.gunModel[19].addShapeBox(153.0F, -21.0F, -16.0F, 2, 7, 37, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  261 */     this.gunModel[19].setRotationPoint(219.0F, -45.0F, -1.5F);
/*      */     
/*  263 */     this.gunModel[20].addShapeBox(153.0F, -21.0F, -16.0F, 8, 29, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  264 */     this.gunModel[20].setRotationPoint(203.0F, -52.0F, -1.5F);
/*      */     
/*  266 */     this.gunModel[21].addShapeBox(153.0F, -21.0F, -16.0F, 156, 35, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  267 */     this.gunModel[21].setRotationPoint(47.0F, -55.0F, -1.5F);
/*      */     
/*  269 */     this.gunModel[22].addShapeBox(153.0F, -21.0F, -16.0F, 8, 29, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  270 */     this.gunModel[22].setRotationPoint(39.0F, -52.0F, -1.5F);
/*      */     
/*  272 */     this.gunModel[23].addShapeBox(153.0F, -21.0F, -16.0F, 8, 3, 37, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  273 */     this.gunModel[23].setRotationPoint(39.0F, -55.0F, -1.5F);
/*      */     
/*  275 */     this.gunModel[24].addShapeBox(153.0F, -21.0F, -16.0F, 8, 3, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F);
/*  276 */     this.gunModel[24].setRotationPoint(39.0F, -23.0F, -1.5F);
/*      */     
/*  278 */     this.gunModel[25].addShapeBox(153.0F, -21.0F, -16.0F, 8, 7, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F);
/*  279 */     this.gunModel[25].setRotationPoint(31.0F, -30.0F, -1.5F);
/*      */     
/*  281 */     this.gunModel[26].addShapeBox(153.0F, -21.0F, -16.0F, 8, 15, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  282 */     this.gunModel[26].setRotationPoint(31.0F, -45.0F, -1.5F);
/*      */     
/*  284 */     this.gunModel[27].addShapeBox(153.0F, -21.0F, -16.0F, 8, 7, 37, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  285 */     this.gunModel[27].setRotationPoint(31.0F, -52.0F, -1.5F);
/*      */     
/*  287 */     this.gunModel[28].addShapeBox(153.0F, -21.0F, -16.0F, 2, 7, 37, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  288 */     this.gunModel[28].setRotationPoint(29.0F, -37.0F, -1.5F);
/*      */     
/*  290 */     this.gunModel[29].addShapeBox(153.0F, -21.0F, -16.0F, 2, 7, 37, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  291 */     this.gunModel[29].setRotationPoint(29.0F, -45.0F, -1.5F);
/*      */     
/*  293 */     this.gunModel[30].addShapeBox(153.0F, -21.0F, -16.0F, 508, 7, 21, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  294 */     this.gunModel[30].setRotationPoint(-47.0F, -75.0F, 6.5F);
/*      */     
/*  296 */     this.gunModel[31].addShapeBox(153.0F, -21.0F, -16.0F, 260, 6, 34, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  297 */     this.gunModel[31].setRotationPoint(-10.0F, -64.0F, 0.0F);
/*      */     
/*  299 */     this.gunModel[32].addShapeBox(153.0F, -21.0F, -16.0F, 508, 7, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  300 */     this.gunModel[32].setRotationPoint(-47.0F, -68.0F, 6.5F);
/*      */     
/*  302 */     this.gunModel[33].addShapeBox(153.0F, -21.0F, -16.0F, 471, 7, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  303 */     this.gunModel[33].setRotationPoint(-10.0F, -61.0F, 6.5F);
/*      */     
/*  305 */     this.gunModel[34].addShapeBox(153.0F, -21.0F, -16.0F, 250, 6, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  306 */     this.gunModel[34].setRotationPoint(0.0F, -18.0F, 0.0F);
/*      */     
/*  308 */     this.gunModel[35].addShapeBox(153.0F, -21.0F, -16.0F, 3, 7, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  309 */     this.gunModel[35].setRotationPoint(-10.0F, -69.0F, 5.5F);
/*      */     
/*  311 */     this.gunModel[36].addShapeBox(153.0F, -21.0F, -16.0F, 3, 7, 23, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  312 */     this.gunModel[36].setRotationPoint(-10.0F, -76.0F, 5.5F);
/*      */     
/*  314 */     this.gunModel[37].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  315 */     this.gunModel[37].setRotationPoint(460.0F, -61.5F, 8.0F);
/*      */     
/*  317 */     this.gunModel[38].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  318 */     this.gunModel[38].setRotationPoint(460.0F, -67.5F, 8.0F);
/*      */     
/*  320 */     this.gunModel[39].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  321 */     this.gunModel[39].setRotationPoint(460.0F, -73.5F, 8.0F);
/*      */     
/*  323 */     this.gunModel[40].addShapeBox(153.0F, -21.0F, -16.0F, 78, 7, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  324 */     this.gunModel[40].setRotationPoint(464.0F, -68.0F, 6.5F);
/*      */     
/*  326 */     this.gunModel[41].addShapeBox(153.0F, -21.0F, -16.0F, 78, 7, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  327 */     this.gunModel[41].setRotationPoint(464.0F, -61.0F, 6.5F);
/*      */     
/*  329 */     this.gunModel[42].addShapeBox(153.0F, -21.0F, -16.0F, 78, 7, 21, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  330 */     this.gunModel[42].setRotationPoint(464.0F, -75.0F, 6.5F);
/*      */     
/*  332 */     this.gunModel[43].addShapeBox(153.0F, -21.0F, -16.0F, 4, 8, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  333 */     this.gunModel[43].setRotationPoint(463.0F, -69.0F, 4.0F);
/*      */     
/*  335 */     this.gunModel[44].addShapeBox(153.0F, -21.0F, -16.0F, 4, 8, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  336 */     this.gunModel[44].setRotationPoint(463.0F, -61.0F, 4.0F);
/*      */     
/*  338 */     this.gunModel[45].addShapeBox(153.0F, -21.0F, -16.0F, 4, 8, 25, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  339 */     this.gunModel[45].setRotationPoint(463.0F, -77.0F, 4.0F);
/*      */     
/*  341 */     this.gunModel[46].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 34, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  342 */     this.gunModel[46].setRotationPoint(-47.0F, -64.0F, 0.0F);
/*      */     
/*  344 */     this.gunModel[47].addShapeBox(153.0F, -21.0F, -16.0F, 37, 38, 34, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  345 */     this.gunModel[47].setRotationPoint(-141.0F, -58.0F, 0.0F);
/*      */     
/*  347 */     this.gunModel[48].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 34, 0.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  348 */     this.gunModel[48].setRotationPoint(-141.0F, -64.0F, 0.0F);
/*      */     
/*  350 */     this.gunModel[49].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  351 */     this.gunModel[49].setRotationPoint(-47.0F, -71.0F, 5.0F);
/*      */     
/*  353 */     this.gunModel[50].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 24, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  354 */     this.gunModel[50].setRotationPoint(-47.0F, -77.0F, 5.0F);
/*      */     
/*  356 */     this.gunModel[51].addShapeBox(153.0F, -21.0F, -16.0F, 57, 35, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  357 */     this.gunModel[51].setRotationPoint(-104.0F, -55.0F, 0.0F);
/*      */     
/*  359 */     this.gunModel[52].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  360 */     this.gunModel[52].setRotationPoint(-141.0F, -71.0F, 5.0F);
/*      */     
/*  362 */     this.gunModel[53].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 24, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  363 */     this.gunModel[53].setRotationPoint(-141.0F, -77.0F, 5.0F);
/*      */     
/*  365 */     this.gunModel[54].addShapeBox(153.0F, -21.0F, -16.0F, 57, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  366 */     this.gunModel[54].setRotationPoint(-104.0F, -64.0F, 26.0F);
/*      */     
/*  368 */     this.gunModel[55].addShapeBox(153.0F, -21.0F, -16.0F, 57, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  369 */     this.gunModel[55].setRotationPoint(-104.0F, -58.0F, 26.0F);
/*      */     
/*  371 */     this.gunModel[56].addShapeBox(153.0F, -21.0F, -16.0F, 57, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  372 */     this.gunModel[56].setRotationPoint(-104.0F, -71.0F, 21.0F);
/*      */     
/*  374 */     this.gunModel[57].addShapeBox(153.0F, -21.0F, -16.0F, 57, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  375 */     this.gunModel[57].setRotationPoint(-104.0F, -77.0F, 11.0F);
/*      */     
/*  377 */     this.gunModel[58].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  378 */     this.gunModel[58].setRotationPoint(-141.0F, -65.0F, 5.0F);
/*      */     
/*  380 */     this.gunModel[59].addShapeBox(153.0F, -21.0F, -16.0F, 37, 6, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  381 */     this.gunModel[59].setRotationPoint(-47.0F, -65.0F, 5.0F);
/*      */     
/*  383 */     this.gunModel[60].addShapeBox(153.0F, -21.0F, -16.0F, 57, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  384 */     this.gunModel[60].setRotationPoint(-104.0F, -65.0F, 21.0F);
/*      */     
/*  386 */     this.gunModel[61].addShapeBox(153.0F, -21.0F, -16.0F, 8, 3, 17, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  387 */     this.gunModel[61].setRotationPoint(-104.0F, -58.0F, 0.0F);
/*      */     
/*  389 */     this.gunModel[62].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 31, 0.0F, 0.0F, 0.0F, -3.0F, -4.0F, 0.0F, -3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  390 */     this.gunModel[62].setRotationPoint(-104.0F, -64.0F, 0.0F);
/*      */     
/*  392 */     this.gunModel[63].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 31, 0.0F, -4.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  393 */     this.gunModel[63].setRotationPoint(-51.0F, -64.0F, 0.0F);
/*      */     
/*  395 */     this.gunModel[64].addShapeBox(153.0F, -21.0F, -16.0F, 8, 3, 17, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  396 */     this.gunModel[64].setRotationPoint(-55.0F, -58.0F, 0.0F);
/*      */     
/*  398 */     this.gunModel[65].addShapeBox(153.0F, -21.0F, -16.0F, 37, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  399 */     this.gunModel[65].setRotationPoint(-141.0F, -86.0F, 11.0F);
/*      */     
/*  401 */     this.gunModel[66].addShapeBox(153.0F, -21.0F, -16.0F, 153, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  402 */     this.gunModel[66].setRotationPoint(-141.0F, -87.0F, 12.0F);
/*      */     
/*  404 */     this.gunModel[67].addShapeBox(153.0F, -21.0F, -16.0F, 153, 3, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  405 */     this.gunModel[67].setRotationPoint(-141.0F, -90.0F, 8.5F);
/*      */     
/*  407 */     this.gunModel[68].addShapeBox(153.0F, -21.0F, -16.0F, 37, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  408 */     this.gunModel[68].setRotationPoint(-47.0F, -86.0F, 11.0F);
/*      */     
/*  410 */     this.gunModel[69].addShapeBox(153.0F, -21.0F, -16.0F, 60, 20, 34, 0.0F, 0.5F, -5.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.5F, -5.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  411 */     this.gunModel[69].setRotationPoint(-213.0F, -38.0F, 0.0F);
/*      */     
/*  413 */     this.gunModel[70].addShapeBox(153.0F, -21.0F, -16.0F, 60, 6, 34, 0.0F, 0.5F, -15.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, -15.0F, -3.0F, 0.5F, 15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 15.0F, 0.0F);
/*  414 */     this.gunModel[70].setRotationPoint(-213.0F, -54.0F, 0.0F);
/*      */     
/*  416 */     this.gunModel[71].addShapeBox(153.0F, -21.0F, -16.0F, 8, 1, 34, 0.0F, 0.5F, 7.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.5F, 7.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F);
/*  417 */     this.gunModel[71].setRotationPoint(-221.5F, -21.0F, 0.0F);
/*      */     
/*  419 */     this.gunModel[72].addShapeBox(153.0F, -21.0F, -16.0F, 8, 6, 34, 0.0F, 0.5F, -5.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, -5.0F, -3.0F, 0.5F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 5.0F, 0.0F);
/*  420 */     this.gunModel[72].setRotationPoint(-221.5F, -39.0F, 0.0F);
/*      */     
/*  422 */     this.gunModel[73].addShapeBox(153.0F, -21.0F, -16.0F, 11, 30, 26, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  423 */     this.gunModel[73].setRotationPoint(-152.5F, -48.0F, 8.0F);
/*      */     
/*  425 */     this.gunModel[74].addShapeBox(153.0F, -21.0F, -16.0F, 133, 7, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  426 */     this.gunModel[74].setRotationPoint(-141.5F, -20.0F, 0.0F);
/*      */     
/*  428 */     this.gunModel[75].addShapeBox(153.0F, -21.0F, -16.0F, 2, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  429 */     this.gunModel[75].setRotationPoint(-104.0F, -86.0F, 11.0F);
/*      */     
/*  431 */     this.gunModel[76].addShapeBox(153.0F, -21.0F, -16.0F, 3, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  432 */     this.gunModel[76].setRotationPoint(-102.0F, -86.0F, 11.0F);
/*      */     
/*  434 */     this.gunModel[77].addShapeBox(153.0F, -21.0F, -16.0F, 2, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/*  435 */     this.gunModel[77].setRotationPoint(-49.0F, -86.0F, 11.0F);
/*      */     
/*  437 */     this.gunModel[78].addShapeBox(153.0F, -21.0F, -16.0F, 4, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  438 */     this.gunModel[78].setRotationPoint(-53.0F, -86.0F, 11.0F);
/*      */     
/*  440 */     this.gunModel[79].addShapeBox(153.0F, -21.0F, -16.0F, 2, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  441 */     this.gunModel[79].setRotationPoint(-10.0F, -86.0F, 12.0F);
/*      */     
/*  443 */     this.gunModel[80].addShapeBox(153.0F, -21.0F, -16.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  444 */     this.gunModel[80].setRotationPoint(-8.0F, -86.0F, 12.0F);
/*      */     
/*  446 */     this.gunModel[81].addShapeBox(153.0F, -21.0F, -16.0F, 8, 8, 34, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F);
/*  447 */     this.gunModel[81].setRotationPoint(-221.5F, -21.0F, 0.0F);
/*      */     
/*  449 */     this.gunModel[82].addShapeBox(153.0F, -21.0F, -16.0F, 71, 2, 34, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F);
/*  450 */     this.gunModel[82].setRotationPoint(-212.5F, -13.0F, 0.0F);
/*      */     
/*  452 */     this.gunModel[83].addShapeBox(153.0F, -21.0F, -16.0F, 7, 5, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  453 */     this.gunModel[83].setRotationPoint(-213.5F, -18.0F, 0.0F);
/*      */     
/*  455 */     this.gunModel[84].addShapeBox(153.0F, -21.0F, -16.0F, 65, 5, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  456 */     this.gunModel[84].setRotationPoint(-206.5F, -18.0F, 0.0F);
/*      */     
/*  458 */     this.gunModel[85].addShapeBox(153.0F, -21.0F, -16.0F, 11, 6, 26, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  459 */     this.gunModel[85].setRotationPoint(-152.5F, -54.0F, 8.0F);
/*      */     
/*  461 */     this.gunModel[86].addShapeBox(153.0F, -21.0F, -16.0F, 23, 7, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  462 */     this.gunModel[86].setRotationPoint(-202.5F, -13.0F, 6.0F);
/*      */     
/*  464 */     this.gunModel[87].addShapeBox(153.0F, -21.0F, -16.0F, 8, 10, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  465 */     this.gunModel[87].setRotationPoint(-210.5F, -13.0F, 6.0F);
/*      */     
/*  467 */     this.gunModel[88].addShapeBox(153.0F, -21.0F, -16.0F, 17, 12, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/*  468 */     this.gunModel[88].setRotationPoint(-227.5F, -15.0F, 3.0F);
/*      */     
/*  470 */     this.gunModel[89].addShapeBox(153.0F, -21.0F, -16.0F, 17, 46, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -17.0F, 0.0F, -5.0F, -17.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/*  471 */     this.gunModel[89].setRotationPoint(-227.5F, -3.0F, 3.0F);
/*      */     
/*  473 */     this.gunModel[90].addShapeBox(153.0F, -21.0F, -16.0F, 3, 46, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/*  474 */     this.gunModel[90].setRotationPoint(-230.5F, -3.0F, 3.0F);
/*      */     
/*  476 */     this.gunModel[91].addShapeBox(153.0F, -21.0F, -16.0F, 9, 17, 28, 0.0F, 0.0F, -8.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  477 */     this.gunModel[91].setRotationPoint(-231.5F, -32.0F, 3.0F);
/*      */     
/*  479 */     this.gunModel[92].addShapeBox(153.0F, -21.0F, -16.0F, 9, 6, 28, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 3.0F, 0.0F, 0.5F, 3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  480 */     this.gunModel[92].setRotationPoint(-241.0F, -21.0F, 3.0F);
/*      */     
/*  482 */     this.gunModel[93].addShapeBox(153.0F, -21.0F, -16.0F, 10, 7, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  483 */     this.gunModel[93].setRotationPoint(-222.0F, -22.0F, 3.0F);
/*      */     
/*  485 */     this.gunModel[94].addShapeBox(153.0F, -21.0F, -16.0F, 10, 46, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/*  486 */     this.gunModel[94].setRotationPoint(-240.5F, -3.0F, 3.0F);
/*      */     
/*  488 */     this.gunModel[95].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 28, 0.0F, 0.0F, 0.0F, 4.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F);
/*  489 */     this.gunModel[95].setRotationPoint(-246.5F, -20.0F, 3.0F);
/*      */     
/*  491 */     this.gunModel[96].addShapeBox(153.0F, -21.0F, -16.0F, 4, 7, 28, 0.0F, 0.5F, 3.0F, 0.0F, 1.0F, -2.0F, 3.95F, 1.0F, -2.0F, 3.95F, 0.5F, 3.0F, 0.0F, 0.5F, 0.0F, 1.9F, 1.0F, 0.0F, 5.0F, 1.0F, 0.0F, 5.0F, 0.5F, 0.0F, 1.9F);
/*  492 */     this.gunModel[96].setRotationPoint(-251.5F, -22.0F, 3.0F);
/*      */     
/*  494 */     this.gunModel[97].addShapeBox(153.0F, -21.0F, -16.0F, 3, 10, 28, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 1.95F, 0.5F, 0.0F, 0.0F);
/*  495 */     this.gunModel[97].setRotationPoint(-255.0F, -25.0F, 3.0F);
/*      */     
/*  497 */     this.gunModel[98].addShapeBox(153.0F, -21.0F, -16.0F, 3, 8, 28, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  498 */     this.gunModel[98].setRotationPoint(-255.0F, -33.0F, 3.0F);
/*      */     
/*  500 */     this.gunModel[99].addShapeBox(153.0F, -21.0F, -16.0F, 111, 6, 28, 0.0F, -0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  501 */     this.gunModel[99].setRotationPoint(-366.0F, -39.0F, 3.0F);
/*      */     
/*  503 */     this.gunModel[100].addShapeBox(153.0F, -21.0F, -16.0F, 9, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  504 */     this.gunModel[100].setRotationPoint(-236.5F, 43.0F, 8.0F);
/*      */     
/*  506 */     this.gunModel[101].addShapeBox(153.0F, -21.0F, -16.0F, 6, 2, 18, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, -2.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 5.0F);
/*  507 */     this.gunModel[101].setRotationPoint(-246.5F, 43.0F, 8.0F);
/*      */     
/*  509 */     this.gunModel[102].addShapeBox(153.0F, -21.0F, -16.0F, 4, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  510 */     this.gunModel[102].setRotationPoint(-240.5F, 43.0F, 8.0F);
/*      */     
/*  512 */     this.gunModel[103].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/*  513 */     this.gunModel[103].setRotationPoint(-250.5F, 39.0F, 3.0F);
/*      */     
/*  515 */     this.gunModel[104].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/*  516 */     this.gunModel[104].setRotationPoint(-255.5F, 34.0F, 3.0F);
/*      */     
/*  518 */     this.gunModel[105].addShapeBox(153.0F, -21.0F, -16.0F, 9, 12, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F);
/*  519 */     this.gunModel[105].setRotationPoint(-255.5F, -15.0F, 3.0F);
/*      */     
/*  521 */     this.gunModel[106].addShapeBox(153.0F, -21.0F, -16.0F, 4, 5, 28, 0.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F);
/*  522 */     this.gunModel[106].setRotationPoint(-250.5F, 34.0F, 3.0F);
/*      */     
/*  524 */     this.gunModel[107].addShapeBox(153.0F, -21.0F, -16.0F, 110, 67, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  525 */     this.gunModel[107].setRotationPoint(-365.5F, -33.0F, 3.0F);
/*      */     
/*  527 */     this.gunModel[108].addShapeBox(153.0F, -21.0F, -16.0F, 7, 6, 24, 0.0F, 0.0F, -2.0F, -1.5F, 0.0F, -6.0F, -4.0F, 0.0F, -6.0F, -4.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  528 */     this.gunModel[108].setRotationPoint(-307.5F, 45.0F, 5.0F);
/*      */     
/*  530 */     this.gunModel[109].addShapeBox(153.0F, -21.0F, -16.0F, 3, 9, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -3.5F, 0.0F, -5.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  531 */     this.gunModel[109].setRotationPoint(-310.5F, 42.0F, 3.0F);
/*      */     
/*  533 */     this.gunModel[110].addShapeBox(153.0F, -21.0F, -16.0F, 6, 2, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  534 */     this.gunModel[110].setRotationPoint(-310.5F, 34.0F, 3.0F);
/*      */     
/*  536 */     this.gunModel[111].addShapeBox(153.0F, -21.0F, -16.0F, 2, 3, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  537 */     this.gunModel[111].setRotationPoint(-310.5F, 36.0F, 3.0F);
/*      */     
/*  539 */     this.gunModel[112].addShapeBox(153.0F, -21.0F, -16.0F, 55, 9, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  540 */     this.gunModel[112].setRotationPoint(-365.5F, 42.0F, 3.0F);
/*      */     
/*  542 */     this.gunModel[113].addShapeBox(153.0F, -21.0F, -16.0F, 55, 8, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  543 */     this.gunModel[113].setRotationPoint(-365.5F, 34.0F, 3.0F);
/*      */     
/*  545 */     this.gunModel[114].addShapeBox(153.0F, -21.0F, -16.0F, 50, 8, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  546 */     this.gunModel[114].setRotationPoint(-416.5F, 34.0F, 3.0F);
/*      */     
/*  548 */     this.gunModel[115].addShapeBox(153.0F, -21.0F, -16.0F, 50, 9, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  549 */     this.gunModel[115].setRotationPoint(-416.5F, 42.0F, 3.0F);
/*      */     
/*  551 */     this.gunModel[116].addShapeBox(153.0F, -21.0F, -16.0F, 50, 67, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  552 */     this.gunModel[116].setRotationPoint(-416.5F, -33.0F, 3.0F);
/*      */     
/*  554 */     this.gunModel[117].addShapeBox(153.0F, -21.0F, -16.0F, 50, 6, 28, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  555 */     this.gunModel[117].setRotationPoint(-416.5F, -39.0F, 3.0F);
/*      */     
/*  557 */     this.gunModel[118].addShapeBox(153.0F, -21.0F, -16.0F, 50, 67, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  558 */     this.gunModel[118].setRotationPoint(-400.5F, -33.0F, 4.0F);
/*      */     
/*  560 */     this.gunModel[119].addShapeBox(153.0F, -21.0F, -16.0F, 50, 5, 26, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  561 */     this.gunModel[119].setRotationPoint(-387.5F, -38.0F, 4.0F);
/*      */     
/*  563 */     this.gunModel[120].addShapeBox(153.0F, -21.0F, -16.0F, 50, 8, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  564 */     this.gunModel[120].setRotationPoint(-404.5F, 34.0F, 4.0F);
/*      */     
/*  566 */     this.gunModel[121].addShapeBox(153.0F, -21.0F, -16.0F, 50, 8, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  567 */     this.gunModel[121].setRotationPoint(-402.5F, 42.0F, 4.0F);
/*      */     
/*  569 */     this.gunModel[122].addShapeBox(153.0F, -21.0F, -16.0F, 99, 9, 34, 0.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  570 */     this.gunModel[122].setRotationPoint(-361.0F, -42.0F, 0.0F);
/*      */     
/*  572 */     this.gunModel[123].addShapeBox(153.0F, -21.0F, -16.0F, 7, 9, 34, 0.0F, 0.0F, 0.0F, -5.0F, 7.0F, 0.0F, -5.0F, 7.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  573 */     this.gunModel[123].setRotationPoint(-262.0F, -42.0F, 0.0F);
/*      */     
/*  575 */     this.gunModel[124].addShapeBox(153.0F, -21.0F, -16.0F, 14, 10, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  576 */     this.gunModel[124].setRotationPoint(-272.0F, -33.0F, 0.0F);
/*      */     
/*  578 */     this.gunModel[125].addShapeBox(153.0F, -21.0F, -16.0F, 8, 33, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  579 */     this.gunModel[125].setRotationPoint(-272.0F, -23.0F, 0.0F);
/*      */     
/*  581 */     this.gunModel[126].addShapeBox(153.0F, -21.0F, -16.0F, 73, 8, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  582 */     this.gunModel[126].setRotationPoint(-344.0F, 10.0F, 0.0F);
/*      */     
/*  584 */     this.gunModel[127].addShapeBox(153.0F, -21.0F, -16.0F, 8, 8, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F);
/*  585 */     this.gunModel[127].setRotationPoint(-352.0F, 10.0F, 0.0F);
/*      */     
/*  587 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 38, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  588 */     this.gunModel[''].setRotationPoint(-361.0F, -33.0F, 0.0F);
/*      */     
/*  590 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 6, 45, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F);
/*  591 */     this.gunModel[''].setRotationPoint(-358.0F, -33.0F, 0.0F);
/*      */     
/*  593 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 30, 43, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  594 */     this.gunModel[''].setRotationPoint(-302.0F, -33.0F, 0.0F);
/*      */     
/*  596 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 16, 43, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  597 */     this.gunModel[''].setRotationPoint(-352.0F, -33.0F, 0.0F);
/*      */     
/*  599 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 12, 43, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  600 */     this.gunModel[''].setRotationPoint(-325.0F, -33.0F, 0.0F);
/*      */     
/*  602 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 11, 7, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  603 */     this.gunModel[''].setRotationPoint(-313.0F, -33.0F, 0.0F);
/*      */     
/*  605 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 11, 7, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  606 */     this.gunModel[''].setRotationPoint(-336.0F, -33.0F, 0.0F);
/*      */     
/*  608 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 11, 7, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  609 */     this.gunModel[''].setRotationPoint(-313.0F, 3.0F, 0.0F);
/*      */     
/*  611 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 11, 7, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  612 */     this.gunModel[''].setRotationPoint(-336.0F, 3.0F, 0.0F);
/*      */     
/*  614 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  615 */     this.gunModel[''].setRotationPoint(-313.0F, 0.0F, 0.0F);
/*      */     
/*  617 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  618 */     this.gunModel[''].setRotationPoint(-305.0F, 0.0F, 0.0F);
/*      */     
/*  620 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  621 */     this.gunModel[''].setRotationPoint(-305.0F, -26.0F, 0.0F);
/*      */     
/*  623 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  624 */     this.gunModel[''].setRotationPoint(-313.0F, -26.0F, 0.0F);
/*      */     
/*  626 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  627 */     this.gunModel[''].setRotationPoint(-336.0F, -26.0F, 0.0F);
/*      */     
/*  629 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  630 */     this.gunModel[''].setRotationPoint(-328.0F, -26.0F, 0.0F);
/*      */     
/*  632 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  633 */     this.gunModel[''].setRotationPoint(-328.0F, 0.0F, 0.0F);
/*      */     
/*  635 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 3, 3, 34, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  636 */     this.gunModel[''].setRotationPoint(-336.0F, 0.0F, 0.0F);
/*      */     
/*  638 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  639 */     this.gunModel[''].setRotationPoint(-338.0F, -25.0F, -1.0F);
/*      */     
/*  641 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  642 */     this.gunModel[''].setRotationPoint(-333.0F, -30.0F, -1.0F);
/*      */     
/*  644 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 2, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  645 */     this.gunModel[''].setRotationPoint(-328.0F, -25.0F, -1.0F);
/*      */     
/*  647 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  648 */     this.gunModel[''].setRotationPoint(-310.0F, -30.0F, -1.0F);
/*      */     
/*  650 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  651 */     this.gunModel[''].setRotationPoint(-315.0F, -25.0F, -1.0F);
/*      */     
/*  653 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 2, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  654 */     this.gunModel[''].setRotationPoint(-305.0F, -25.0F, -1.0F);
/*      */     
/*  656 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 20, 0.0F, 6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  657 */     this.gunModel[''].setRotationPoint(-182.5F, -12.5F, 7.0F);
/*      */     
/*  659 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 13, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[''].setRotationPoint(-182.5F, -7.5F, 7.0F);
/*      */     
/*  662 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  663 */     this.gunModel[''].setRotationPoint(-176.5F, 5.5F, 7.0F);
/*      */     
/*  665 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 27, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  666 */     this.gunModel[''].setRotationPoint(-171.5F, 5.5F, 7.0F);
/*      */     
/*  668 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 8, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  669 */     this.gunModel[''].setRotationPoint(-144.5F, 5.5F, 7.0F);
/*      */     
/*  671 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 5, 20, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/*  672 */     this.gunModel[''].setRotationPoint(-135.5F, 0.5F, 7.0F);
/*      */     
/*  674 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  675 */     this.gunModel[''].setRotationPoint(-137.5F, -2.5F, 7.0F);
/*      */     
/*  677 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 5, 4, 20, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  678 */     this.gunModel[''].setRotationPoint(-137.5F, -6.5F, 7.0F);
/*      */     
/*  680 */     this.gunModel[''].addShapeBox(153.0F, -21.0F, -16.0F, 12, 5, 20, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  681 */     this.gunModel[''].setRotationPoint(-144.5F, -11.5F, 7.0F);
/*      */     
/*  683 */     this.gunModel[' '].addShapeBox(153.0F, -21.0F, -16.0F, 4, 13, 20, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  684 */     this.gunModel[' '].setRotationPoint(-132.5F, -12.5F, 7.0F);
/*      */     
/*  686 */     this.gunModel['¡'].addShapeBox(153.0F, -21.0F, -16.0F, 17, 3, 10, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/*  687 */     this.gunModel['¡'].setRotationPoint(-173.5F, -11.5F, 13.0F);
/*      */     
/*  689 */     this.gunModel['¢'].addShapeBox(153.0F, -21.0F, -16.0F, 7, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  690 */     this.gunModel['¢'].setRotationPoint(-167.5F, -8.5F, 13.0F);
/*      */     
/*  692 */     this.gunModel['£'].addShapeBox(153.0F, -21.0F, -16.0F, 5, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  693 */     this.gunModel['£'].setRotationPoint(-162.5F, -2.5F, 13.0F);
/*      */     
/*  695 */     this.gunModel['¤'].addShapeBox(153.0F, -21.0F, -16.0F, 13, 12, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  696 */     this.gunModel['¤'].setRotationPoint(-240.5F, -15.0F, 3.0F);
/*      */     
/*  698 */     this.gunModel['¥'].addShapeBox(153.0F, -21.0F, -16.0F, 6, 46, 28, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
/*  699 */     this.gunModel['¥'].setRotationPoint(-246.5F, -3.0F, 3.0F);
/*      */     
/*  701 */     this.gunModel['¦'].addShapeBox(153.0F, -21.0F, -16.0F, 6, 12, 28, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F);
/*  702 */     this.gunModel['¦'].setRotationPoint(-246.5F, -15.0F, 3.0F);
/*      */     
/*  704 */     this.gunModel['§'].addShapeBox(153.0F, -21.0F, -16.0F, 9, 37, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/*  705 */     this.gunModel['§'].setRotationPoint(-255.5F, -3.0F, 3.0F);
/*      */     
/*  707 */     this.gunModel['¨'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 9, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  708 */     this.gunModel['¨'].setRotationPoint(236.0F, -73.0F, 3.0F);
/*      */     
/*  710 */     this.gunModel['©'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 9, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  711 */     this.gunModel['©'].setRotationPoint(214.0F, -73.0F, 3.0F);
/*      */     
/*  713 */     this.gunModel['ª'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 9, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  714 */     this.gunModel['ª'].setRotationPoint(190.0F, -73.0F, 3.0F);
/*      */     
/*  716 */     this.gunModel['«'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 24, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  717 */     this.gunModel['«'].setRotationPoint(236.0F, -81.0F, 5.0F);
/*      */     
/*  719 */     this.gunModel['¬'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 24, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  720 */     this.gunModel['¬'].setRotationPoint(214.0F, -81.0F, 5.0F);
/*      */     
/*  722 */     this.gunModel['­'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 24, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  723 */     this.gunModel['­'].setRotationPoint(190.0F, -81.0F, 5.0F);
/*      */     
/*  725 */     this.gunModel['®'].addShapeBox(153.0F, -21.0F, -16.0F, 50, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  726 */     this.gunModel['®'].setRotationPoint(190.0F, -82.5F, 11.0F);
/*      */     
/*  728 */     this.gunModel['¯'].addShapeBox(153.0F, -21.0F, -16.0F, 51, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  729 */     this.gunModel['¯'].setRotationPoint(190.0F, -86.0F, 8.0F);
/*      */     
/*  731 */     this.gunModel['°'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 28, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  732 */     this.gunModel['°'].setRotationPoint(236.0F, -77.0F, 3.0F);
/*      */     
/*  734 */     this.gunModel['±'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 28, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  735 */     this.gunModel['±'].setRotationPoint(214.0F, -77.0F, 3.0F);
/*      */     
/*  737 */     this.gunModel['²'].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 28, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  738 */     this.gunModel['²'].setRotationPoint(190.0F, -77.0F, 3.0F);
/*      */     
/*  740 */     this.gunModel['³'].addShapeBox(153.0F, -21.0F, -16.0F, 43, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  741 */     this.gunModel['³'].setRotationPoint(193.0F, -81.0F, 13.0F);
/*      */     
/*      */ 
/*  744 */     this.defaultScopeModel = new ModelRendererTurbo[63];
/*  745 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 801, 273, this.textureX, this.textureY);
/*  746 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 985, 153, this.textureX, this.textureY);
/*  747 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 681, 281, this.textureX, this.textureY);
/*  748 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 833, 209, this.textureX, this.textureY);
/*  749 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 609, 281, this.textureX, this.textureY);
/*  750 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 73, 433, this.textureX, this.textureY);
/*  751 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 1297, 289, this.textureX, this.textureY);
/*  752 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 1889, 289, this.textureX, this.textureY);
/*  753 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 393, 433, this.textureX, this.textureY);
/*  754 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 321, 297, this.textureX, this.textureY);
/*  755 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 1233, 449, this.textureX, this.textureY);
/*  756 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 1513, 449, this.textureX, this.textureY);
/*  757 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 121, 465, this.textureX, this.textureY);
/*  758 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 953, 17, this.textureX, this.textureY);
/*  759 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 617, 41, this.textureX, this.textureY);
/*  760 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 1001, 433, this.textureX, this.textureY);
/*  761 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 1761, 297, this.textureX, this.textureY);
/*  762 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 1177, 337, this.textureX, this.textureY);
/*  763 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 489, 377, this.textureX, this.textureY);
/*  764 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 569, 449, this.textureX, this.textureY);
/*  765 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 1793, 449, this.textureX, this.textureY);
/*  766 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 1073, 457, this.textureX, this.textureY);
/*  767 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 641, 465, this.textureX, this.textureY);
/*  768 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 937, 465, this.textureX, this.textureY);
/*  769 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 1145, 465, this.textureX, this.textureY);
/*  770 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 1857, 457, this.textureX, this.textureY);
/*  771 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 1, 473, this.textureX, this.textureY);
/*  772 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 1009, 465, this.textureX, this.textureY);
/*  773 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 1969, 457, this.textureX, this.textureY);
/*  774 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 433, 465, this.textureX, this.textureY);
/*  775 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 1465, 1, this.textureX, this.textureY);
/*  776 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  777 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 585, 1, this.textureX, this.textureY);
/*  778 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 1273, 25, this.textureX, this.textureY);
/*  779 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 1113, 1, this.textureX, this.textureY);
/*  780 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 1153, 1, this.textureX, this.textureY);
/*  781 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 1353, 25, this.textureX, this.textureY);
/*  782 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 1193, 1, this.textureX, this.textureY);
/*  783 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 1233, 1, this.textureX, this.textureY);
/*  784 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 1721, 1, this.textureX, this.textureY);
/*  785 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 665, 1, this.textureX, this.textureY);
/*  786 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 841, 1, this.textureX, this.textureY);
/*  787 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 1969, 25, this.textureX, this.textureY);
/*  788 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 1201, 41, this.textureX, this.textureY);
/*  789 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 1873, 49, this.textureX, this.textureY);
/*  790 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 897, 81, this.textureX, this.textureY);
/*  791 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 561, 105, this.textureX, this.textureY);
/*  792 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/*  793 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 2001, 257, this.textureX, this.textureY);
/*  794 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 1209, 297, this.textureX, this.textureY);
/*  795 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 137, 337, this.textureX, this.textureY);
/*  796 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 297, 337, this.textureX, this.textureY);
/*  797 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 1633, 393, this.textureX, this.textureY);
/*  798 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 1889, 401, this.textureX, this.textureY);
/*  799 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 1993, 409, this.textureX, this.textureY);
/*  800 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 681, 417, this.textureX, this.textureY);
/*  801 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 41, 433, this.textureX, this.textureY);
/*  802 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 113, 433, this.textureX, this.textureY);
/*  803 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 89, 473, this.textureX, this.textureY);
/*  804 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 385, 473, this.textureX, this.textureY);
/*  805 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 721, 481, this.textureX, this.textureY);
/*  806 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 1225, 481, this.textureX, this.textureY);
/*  807 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 1353, 481, this.textureX, this.textureY);
/*      */     
/*  809 */     this.defaultScopeModel[0].addShapeBox(153.0F, -21.0F, -16.0F, 6, 6, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  810 */     this.defaultScopeModel[0].setRotationPoint(-108.0F, -95.0F, 7.0F);
/*      */     
/*  812 */     this.defaultScopeModel[1].addShapeBox(153.0F, -21.0F, -16.0F, 2, 2, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  813 */     this.defaultScopeModel[1].setRotationPoint(-106.0F, -93.0F, 6.5F);
/*      */     
/*  815 */     this.defaultScopeModel[2].addShapeBox(153.0F, -21.0F, -16.0F, 6, 6, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  816 */     this.defaultScopeModel[2].setRotationPoint(-21.0F, -95.0F, 7.0F);
/*      */     
/*  818 */     this.defaultScopeModel[3].addShapeBox(153.0F, -21.0F, -16.0F, 2, 2, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  819 */     this.defaultScopeModel[3].setRotationPoint(-19.0F, -93.0F, 6.5F);
/*      */     
/*  821 */     this.defaultScopeModel[4].addShapeBox(153.0F, -21.0F, -16.0F, 6, 3, 18, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  822 */     this.defaultScopeModel[4].setRotationPoint(-21.0F, -98.0F, 8.0F);
/*      */     
/*  824 */     this.defaultScopeModel[5].addShapeBox(153.0F, -21.0F, -16.0F, 6, 12, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  825 */     this.defaultScopeModel[5].setRotationPoint(-21.0F, -110.0F, 4.0F);
/*      */     
/*  827 */     this.defaultScopeModel[6].addShapeBox(153.0F, -21.0F, -16.0F, 6, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F);
/*  828 */     this.defaultScopeModel[6].setRotationPoint(-21.0F, -114.0F, 8.0F);
/*      */     
/*  830 */     this.defaultScopeModel[7].addShapeBox(153.0F, -21.0F, -16.0F, 6, 3, 18, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  831 */     this.defaultScopeModel[7].setRotationPoint(-108.0F, -98.0F, 8.0F);
/*      */     
/*  833 */     this.defaultScopeModel[8].addShapeBox(153.0F, -21.0F, -16.0F, 6, 12, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  834 */     this.defaultScopeModel[8].setRotationPoint(-108.0F, -110.0F, 4.0F);
/*      */     
/*  836 */     this.defaultScopeModel[9].addShapeBox(153.0F, -21.0F, -16.0F, 6, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F);
/*  837 */     this.defaultScopeModel[9].setRotationPoint(-108.0F, -114.0F, 8.0F);
/*      */     
/*  839 */     this.defaultScopeModel[10].addShapeBox(153.0F, -21.0F, -16.0F, 121, 6, 18, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  840 */     this.defaultScopeModel[10].setRotationPoint(-132.0F, -114.0F, 6.5F);
/*      */     
/*  842 */     this.defaultScopeModel[11].addShapeBox(153.0F, -21.0F, -16.0F, 121, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  843 */     this.defaultScopeModel[11].setRotationPoint(-132.0F, -108.0F, 6.5F);
/*      */     
/*  845 */     this.defaultScopeModel[12].addShapeBox(153.0F, -21.0F, -16.0F, 121, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  846 */     this.defaultScopeModel[12].setRotationPoint(-132.0F, -102.0F, 6.5F);
/*      */     
/*  848 */     this.defaultScopeModel[13].addShapeBox(153.0F, -21.0F, -16.0F, 6, 3, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F);
/*  849 */     this.defaultScopeModel[13].setRotationPoint(-108.0F, -117.0F, 12.0F);
/*      */     
/*  851 */     this.defaultScopeModel[14].addShapeBox(153.0F, -21.0F, -16.0F, 6, 3, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F);
/*  852 */     this.defaultScopeModel[14].setRotationPoint(-21.0F, -117.0F, 12.0F);
/*      */     
/*  854 */     this.defaultScopeModel[15].addShapeBox(153.0F, -21.0F, -16.0F, 21, 4, 21, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  855 */     this.defaultScopeModel[15].setRotationPoint(-73.5F, -115.5F, 5.0F);
/*      */     
/*  857 */     this.defaultScopeModel[16].addShapeBox(153.0F, -21.0F, -16.0F, 8, 6, 18, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  858 */     this.defaultScopeModel[16].setRotationPoint(-11.0F, -114.0F, 6.5F);
/*      */     
/*  860 */     this.defaultScopeModel[17].addShapeBox(153.0F, -21.0F, -16.0F, 8, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  861 */     this.defaultScopeModel[17].setRotationPoint(-11.0F, -108.0F, 6.5F);
/*      */     
/*  863 */     this.defaultScopeModel[18].addShapeBox(153.0F, -21.0F, -16.0F, 8, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  864 */     this.defaultScopeModel[18].setRotationPoint(-11.0F, -102.0F, 6.5F);
/*      */     
/*  866 */     this.defaultScopeModel[19].addShapeBox(153.0F, -21.0F, -16.0F, 24, 6, 18, 0.0F, 0.0F, 2.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 2.0F);
/*  867 */     this.defaultScopeModel[19].setRotationPoint(-3.0F, -114.0F, 6.5F);
/*      */     
/*  869 */     this.defaultScopeModel[20].addShapeBox(153.0F, -21.0F, -16.0F, 24, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 2.0F);
/*  870 */     this.defaultScopeModel[20].setRotationPoint(-3.0F, -108.0F, 6.5F);
/*      */     
/*  872 */     this.defaultScopeModel[21].addShapeBox(153.0F, -21.0F, -16.0F, 24, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 2.0F, -6.0F);
/*  873 */     this.defaultScopeModel[21].setRotationPoint(-3.0F, -102.0F, 6.5F);
/*      */     
/*  875 */     this.defaultScopeModel[22].addShapeBox(153.0F, -21.0F, -16.0F, 30, 6, 18, 0.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F);
/*  876 */     this.defaultScopeModel[22].setRotationPoint(21.0F, -114.0F, 6.5F);
/*      */     
/*  878 */     this.defaultScopeModel[23].addShapeBox(153.0F, -21.0F, -16.0F, 30, 6, 18, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F);
/*  879 */     this.defaultScopeModel[23].setRotationPoint(21.0F, -108.0F, 6.5F);
/*      */     
/*  881 */     this.defaultScopeModel[24].addShapeBox(153.0F, -21.0F, -16.0F, 30, 6, 18, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F, 0.0F, 6.0F, -6.0F);
/*  882 */     this.defaultScopeModel[24].setRotationPoint(21.0F, -102.0F, 6.5F);
/*      */     
/*  884 */     this.defaultScopeModel[25].addShapeBox(153.0F, -21.0F, -16.0F, 21, 13, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  885 */     this.defaultScopeModel[25].setRotationPoint(-73.5F, -111.5F, 5.0F);
/*      */     
/*  887 */     this.defaultScopeModel[26].addShapeBox(153.0F, -21.0F, -16.0F, 21, 4, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/*  888 */     this.defaultScopeModel[26].setRotationPoint(-73.5F, -98.5F, 5.0F);
/*      */     
/*  890 */     this.defaultScopeModel[27].addShapeBox(153.0F, -21.0F, -16.0F, 15, 5, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  891 */     this.defaultScopeModel[27].setRotationPoint(-71.0F, -107.5F, 2.5F);
/*      */     
/*  893 */     this.defaultScopeModel[28].addShapeBox(153.0F, -21.0F, -16.0F, 7, 5, 26, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  894 */     this.defaultScopeModel[28].setRotationPoint(-67.0F, -112.5F, 2.5F);
/*      */     
/*  896 */     this.defaultScopeModel[29].addShapeBox(153.0F, -21.0F, -16.0F, 7, 5, 26, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  897 */     this.defaultScopeModel[29].setRotationPoint(-67.0F, -102.5F, 2.5F);
/*      */     
/*  899 */     this.defaultScopeModel[30].addShapeBox(153.0F, -21.0F, -16.0F, 12, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  900 */     this.defaultScopeModel[30].setRotationPoint(-69.5F, -107.0F, 28.5F);
/*      */     
/*  902 */     this.defaultScopeModel[31].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  903 */     this.defaultScopeModel[31].setRotationPoint(-65.5F, -111.0F, 28.5F);
/*      */     
/*  905 */     this.defaultScopeModel[32].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 1, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  906 */     this.defaultScopeModel[32].setRotationPoint(-65.5F, -103.0F, 28.5F);
/*      */     
/*  908 */     this.defaultScopeModel[33].addShapeBox(153.0F, -21.0F, -16.0F, 15, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  909 */     this.defaultScopeModel[33].setRotationPoint(-71.0F, -107.5F, 29.5F);
/*      */     
/*  911 */     this.defaultScopeModel[34].addShapeBox(153.0F, -21.0F, -16.0F, 7, 5, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  912 */     this.defaultScopeModel[34].setRotationPoint(-67.0F, -112.5F, 29.5F);
/*      */     
/*  914 */     this.defaultScopeModel[35].addShapeBox(153.0F, -21.0F, -16.0F, 7, 5, 4, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  915 */     this.defaultScopeModel[35].setRotationPoint(-67.0F, -102.5F, 29.5F);
/*      */     
/*  917 */     this.defaultScopeModel[36].addShapeBox(153.0F, -21.0F, -16.0F, 15, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  918 */     this.defaultScopeModel[36].setRotationPoint(-71.0F, -107.5F, -2.5F);
/*      */     
/*  920 */     this.defaultScopeModel[37].addShapeBox(153.0F, -21.0F, -16.0F, 7, 5, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  921 */     this.defaultScopeModel[37].setRotationPoint(-67.0F, -112.5F, -2.5F);
/*      */     
/*  923 */     this.defaultScopeModel[38].addShapeBox(153.0F, -21.0F, -16.0F, 7, 5, 4, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  924 */     this.defaultScopeModel[38].setRotationPoint(-67.0F, -102.5F, -2.5F);
/*      */     
/*  926 */     this.defaultScopeModel[39].addShapeBox(153.0F, -21.0F, -16.0F, 12, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  927 */     this.defaultScopeModel[39].setRotationPoint(-69.5F, -107.0F, 1.5F);
/*      */     
/*  929 */     this.defaultScopeModel[40].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  930 */     this.defaultScopeModel[40].setRotationPoint(-65.5F, -111.0F, 1.5F);
/*      */     
/*  932 */     this.defaultScopeModel[41].addShapeBox(153.0F, -21.0F, -16.0F, 4, 4, 1, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  933 */     this.defaultScopeModel[41].setRotationPoint(-65.5F, -103.0F, 1.5F);
/*      */     
/*  935 */     this.defaultScopeModel[42].addShapeBox(153.0F, -21.0F, -16.0F, 12, 8, 4, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  936 */     this.defaultScopeModel[42].setRotationPoint(-69.5F, -123.5F, 9.5F);
/*      */     
/*  938 */     this.defaultScopeModel[43].addShapeBox(153.0F, -21.0F, -16.0F, 12, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  939 */     this.defaultScopeModel[43].setRotationPoint(-69.5F, -123.5F, 13.5F);
/*      */     
/*  941 */     this.defaultScopeModel[44].addShapeBox(153.0F, -21.0F, -16.0F, 12, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  942 */     this.defaultScopeModel[44].setRotationPoint(-69.5F, -123.5F, 17.5F);
/*      */     
/*  944 */     this.defaultScopeModel[45].addShapeBox(153.0F, -21.0F, -16.0F, 15, 7, 4, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  945 */     this.defaultScopeModel[45].setRotationPoint(-71.0F, -127.5F, 8.5F);
/*      */     
/*  947 */     this.defaultScopeModel[46].addShapeBox(153.0F, -21.0F, -16.0F, 15, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  948 */     this.defaultScopeModel[46].setRotationPoint(-71.0F, -127.5F, 12.5F);
/*      */     
/*  950 */     this.defaultScopeModel[47].addShapeBox(153.0F, -21.0F, -16.0F, 15, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  951 */     this.defaultScopeModel[47].setRotationPoint(-71.0F, -127.5F, 17.5F);
/*      */     
/*  953 */     this.defaultScopeModel[48].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  954 */     this.defaultScopeModel[48].setRotationPoint(-123.0F, -114.0F, 6.5F);
/*      */     
/*  956 */     this.defaultScopeModel[49].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  957 */     this.defaultScopeModel[49].setRotationPoint(-123.0F, -108.0F, 6.5F);
/*      */     
/*  959 */     this.defaultScopeModel[50].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F);
/*  960 */     this.defaultScopeModel[50].setRotationPoint(-123.0F, -102.0F, 6.5F);
/*      */     
/*  962 */     this.defaultScopeModel[51].addShapeBox(153.0F, -21.0F, -16.0F, 3, 6, 18, 0.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  963 */     this.defaultScopeModel[51].setRotationPoint(-126.0F, -114.0F, 6.5F);
/*      */     
/*  965 */     this.defaultScopeModel[52].addShapeBox(153.0F, -21.0F, -16.0F, 3, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  966 */     this.defaultScopeModel[52].setRotationPoint(-126.0F, -108.0F, 6.5F);
/*      */     
/*  968 */     this.defaultScopeModel[53].addShapeBox(153.0F, -21.0F, -16.0F, 3, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F);
/*  969 */     this.defaultScopeModel[53].setRotationPoint(-126.0F, -102.0F, 6.5F);
/*      */     
/*  971 */     this.defaultScopeModel[54].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  972 */     this.defaultScopeModel[54].setRotationPoint(-130.0F, -114.0F, 6.5F);
/*      */     
/*  974 */     this.defaultScopeModel[55].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  975 */     this.defaultScopeModel[55].setRotationPoint(-130.0F, -108.0F, 6.5F);
/*      */     
/*  977 */     this.defaultScopeModel[56].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  978 */     this.defaultScopeModel[56].setRotationPoint(-130.0F, -102.0F, 6.5F);
/*      */     
/*  980 */     this.defaultScopeModel[57].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  981 */     this.defaultScopeModel[57].setRotationPoint(-136.0F, -114.0F, 6.5F);
/*      */     
/*  983 */     this.defaultScopeModel[58].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  984 */     this.defaultScopeModel[58].setRotationPoint(-136.0F, -108.0F, 6.5F);
/*      */     
/*  986 */     this.defaultScopeModel[59].addShapeBox(153.0F, -21.0F, -16.0F, 4, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, -6.0F);
/*  987 */     this.defaultScopeModel[59].setRotationPoint(-136.0F, -102.0F, 6.5F);
/*      */     
/*  989 */     this.defaultScopeModel[60].addShapeBox(153.0F, -21.0F, -16.0F, 44, 6, 18, 0.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  990 */     this.defaultScopeModel[60].setRotationPoint(-180.0F, -114.0F, 6.5F);
/*      */     
/*  992 */     this.defaultScopeModel[61].addShapeBox(153.0F, -21.0F, -16.0F, 44, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  993 */     this.defaultScopeModel[61].setRotationPoint(-180.0F, -108.0F, 6.5F);
/*      */     
/*  995 */     this.defaultScopeModel[62].addShapeBox(153.0F, -21.0F, -16.0F, 44, 6, 18, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F, 0.0F, 2.0F, -6.0F);
/*  996 */     this.defaultScopeModel[62].setRotationPoint(-180.0F, -102.0F, 6.5F);
/*      */     
/*      */ 
/*  999 */     this.ammoModel = new ModelRendererTurbo[1];
/* 1000 */     this.ammoModel[0] = new ModelRendererTurbo(this, 729, 409, this.textureX, this.textureY);
/*      */     
/* 1002 */     this.ammoModel[0].addShapeBox(153.0F, -21.0F, -16.0F, 85, 44, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 1003 */     this.ammoModel[0].setRotationPoint(-123.5F, -29.0F, 5.0F);
/*      */     
/*      */ 
/* 1006 */     this.pumpModel = new ModelRendererTurbo[18];
/* 1007 */     this.pumpModel[0] = new ModelRendererTurbo(this, 985, 217, this.textureX, this.textureY);
/* 1008 */     this.pumpModel[1] = new ModelRendererTurbo(this, 1249, 217, this.textureX, this.textureY);
/* 1009 */     this.pumpModel[2] = new ModelRendererTurbo(this, 1513, 217, this.textureX, this.textureY);
/* 1010 */     this.pumpModel[3] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/* 1011 */     this.pumpModel[4] = new ModelRendererTurbo(this, 1433, 1, this.textureX, this.textureY);
/* 1012 */     this.pumpModel[5] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/* 1013 */     this.pumpModel[6] = new ModelRendererTurbo(this, 1585, 1, this.textureX, this.textureY);
/* 1014 */     this.pumpModel[7] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/* 1015 */     this.pumpModel[8] = new ModelRendererTurbo(this, 1681, 1, this.textureX, this.textureY);
/* 1016 */     this.pumpModel[9] = new ModelRendererTurbo(this, 1521, 1, this.textureX, this.textureY);
/* 1017 */     this.pumpModel[10] = new ModelRendererTurbo(this, 1777, 1, this.textureX, this.textureY);
/* 1018 */     this.pumpModel[11] = new ModelRendererTurbo(this, 1873, 1, this.textureX, this.textureY);
/* 1019 */     this.pumpModel[12] = new ModelRendererTurbo(this, 1809, 1, this.textureX, this.textureY);
/* 1020 */     this.pumpModel[13] = new ModelRendererTurbo(this, 1713, 9, this.textureX, this.textureY);
/* 1021 */     this.pumpModel[14] = new ModelRendererTurbo(this, 1905, 1, this.textureX, this.textureY);
/* 1022 */     this.pumpModel[15] = new ModelRendererTurbo(this, 1625, 1, this.textureX, this.textureY);
/* 1023 */     this.pumpModel[16] = new ModelRendererTurbo(this, 1969, 1, this.textureX, this.textureY);
/* 1024 */     this.pumpModel[17] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*      */     
/* 1026 */     this.pumpModel[0].addShapeBox(153.0F, -21.0F, -16.0F, 107, 7, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.pumpModel[0].setRotationPoint(-153.0F, -68.0F, 6.5F);
/*      */     
/* 1029 */     this.pumpModel[1].addShapeBox(153.0F, -21.0F, -16.0F, 107, 7, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/* 1030 */     this.pumpModel[1].setRotationPoint(-153.0F, -61.0F, 6.5F);
/*      */     
/* 1032 */     this.pumpModel[2].addShapeBox(153.0F, -21.0F, -16.0F, 107, 7, 21, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.pumpModel[2].setRotationPoint(-153.0F, -75.0F, 6.5F);
/*      */     
/* 1035 */     this.pumpModel[3].addShapeBox(153.0F, -21.0F, -16.0F, 11, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1036 */     this.pumpModel[3].setRotationPoint(-153.0F, -61.0F, 6.5F);
/*      */     
/* 1038 */     this.pumpModel[4].addShapeBox(153.0F, -21.0F, -16.0F, 11, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1039 */     this.pumpModel[4].setRotationPoint(-153.0F, -54.0F, 3.5F);
/*      */     
/* 1041 */     this.pumpModel[5].addShapeBox(153.0F, -21.0F, -16.0F, 11, 7, 7, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.5F, 0.5F, 0.0F, 8.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1042 */     this.pumpModel[5].setRotationPoint(-153.0F, -47.0F, 1.0F);
/*      */     
/* 1044 */     this.pumpModel[6].addShapeBox(153.0F, -21.0F, -16.0F, 11, 18, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1045 */     this.pumpModel[6].setRotationPoint(-153.0F, -36.0F, 0.0F);
/*      */     
/* 1047 */     this.pumpModel[7].addShapeBox(153.0F, -21.0F, -16.0F, 11, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 8.5F, 0.0F, 0.0F, 8.5F, 0.0F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F);
/* 1048 */     this.pumpModel[7].setRotationPoint(-153.0F, -40.0F, -7.5F);
/*      */     
/* 1050 */     this.pumpModel[8].addShapeBox(153.0F, -21.0F, -16.0F, 13, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1051 */     this.pumpModel[8].setRotationPoint(-153.5F, -53.5F, -4.0F);
/* 1052 */     this.pumpModel[8].rotateAngleX = 0.7853982F;
/*      */     
/* 1054 */     this.pumpModel[9].addShapeBox(153.0F, -21.0F, -16.0F, 4, 7, 21, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, -3.0F, -6.0F);
/* 1055 */     this.pumpModel[9].setRotationPoint(-157.0F, -61.0F, 6.5F);
/*      */     
/* 1057 */     this.pumpModel[10].addShapeBox(153.0F, -21.0F, -16.0F, 4, 7, 21, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1058 */     this.pumpModel[10].setRotationPoint(-157.0F, -68.0F, 6.5F);
/*      */     
/* 1060 */     this.pumpModel[11].addShapeBox(153.0F, -21.0F, -16.0F, 4, 7, 21, 0.0F, 0.0F, -3.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, -3.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1061 */     this.pumpModel[11].setRotationPoint(-157.0F, -75.0F, 6.5F);
/*      */     
/* 1063 */     this.pumpModel[12].addShapeBox(153.0F, -21.0F, -16.0F, 6, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F);
/* 1064 */     this.pumpModel[12].setRotationPoint(-163.0F, -61.0F, 9.5F);
/*      */     
/* 1066 */     this.pumpModel[13].addShapeBox(153.0F, -21.0F, -16.0F, 6, 7, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1067 */     this.pumpModel[13].setRotationPoint(-163.0F, -68.0F, 9.5F);
/*      */     
/* 1069 */     this.pumpModel[14].addShapeBox(153.0F, -21.0F, -16.0F, 6, 4, 16, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1070 */     this.pumpModel[14].setRotationPoint(-163.0F, -72.0F, 9.5F);
/*      */     
/* 1072 */     this.pumpModel[15].addShapeBox(153.0F, -21.0F, -16.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1073 */     this.pumpModel[15].setRotationPoint(-165.0F, -62.0F, 11.5F);
/*      */     
/* 1075 */     this.pumpModel[16].addShapeBox(153.0F, -21.0F, -16.0F, 2, 5, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1076 */     this.pumpModel[16].setRotationPoint(-165.0F, -67.0F, 11.5F);
/*      */     
/* 1078 */     this.pumpModel[17].addShapeBox(153.0F, -21.0F, -16.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1079 */     this.pumpModel[17].setRotationPoint(-165.0F, -70.0F, 11.5F);
/*      */     
/*      */ 
/*      */ 
/* 1083 */     translateAll(0.0F, -25.0F, 0.0F);
/* 1084 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/* 1086 */     this.gunSlideDistance = 0.0F;
/* 1087 */     this.animationType = EnumAnimationType.CUSTOM;this.tiltGun = 7.0F;
/* 1088 */     this.rotateGunVertical = 3.0F;
/* 1089 */     this.translateGun = new Vector3f(0.15F, 0.05F, 0.0F);
/*      */     
/* 1091 */     this.rotateClipVertical = 5.0F;
/* 1092 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/* 1093 */     this.pumpDelayAfterReload = 50;this.pumpDelay = 10;
/* 1094 */     this.pumpTime = 25;
/* 1095 */     this.gripIsOnPump = false;
/* 1096 */     this.pumpHandleDistance = 0.5F;
/*      */     
/*      */ 
/* 1099 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */