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
/*      */ public class Modelpython
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelpython()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ý'];
/*   22 */     this.ammoModel = new ModelRendererTurbo['Ņ'];
/*   23 */     this.revolverBarrelModel = new ModelRendererTurbo['È'];
/*      */     
/*   25 */     initgunModel_1();
/*   26 */     initammoModel_1();
/*   27 */     initrevolverBarrelModel_1();
/*      */     
/*   29 */     translateAll(0.0F, 0.0F, 0.0F);
/*      */     
/*      */ 
/*   32 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   37 */     this.gunModel[0] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*   38 */     this.gunModel[1] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*   39 */     this.gunModel[2] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*   40 */     this.gunModel[3] = new ModelRendererTurbo(this, 633, 145, this.textureX, this.textureY);
/*   41 */     this.gunModel[4] = new ModelRendererTurbo(this, 1241, 153, this.textureX, this.textureY);
/*   42 */     this.gunModel[5] = new ModelRendererTurbo(this, 1449, 153, this.textureX, this.textureY);
/*   43 */     this.gunModel[6] = new ModelRendererTurbo(this, 1577, 153, this.textureX, this.textureY);
/*   44 */     this.gunModel[7] = new ModelRendererTurbo(this, 641, 153, this.textureX, this.textureY);
/*   45 */     this.gunModel[8] = new ModelRendererTurbo(this, 1777, 153, this.textureX, this.textureY);
/*   46 */     this.gunModel[9] = new ModelRendererTurbo(this, 921, 153, this.textureX, this.textureY);
/*   47 */     this.gunModel[10] = new ModelRendererTurbo(this, 1641, 153, this.textureX, this.textureY);
/*   48 */     this.gunModel[11] = new ModelRendererTurbo(this, 1841, 153, this.textureX, this.textureY);
/*   49 */     this.gunModel[12] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*   50 */     this.gunModel[13] = new ModelRendererTurbo(this, 1329, 153, this.textureX, this.textureY);
/*   51 */     this.gunModel[14] = new ModelRendererTurbo(this, 1889, 153, this.textureX, this.textureY);
/*   52 */     this.gunModel[15] = new ModelRendererTurbo(this, 1905, 153, this.textureX, this.textureY);
/*   53 */     this.gunModel[16] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/*   54 */     this.gunModel[17] = new ModelRendererTurbo(this, 937, 153, this.textureX, this.textureY);
/*   55 */     this.gunModel[18] = new ModelRendererTurbo(this, 1153, 153, this.textureX, this.textureY);
/*   56 */     this.gunModel[19] = new ModelRendererTurbo(this, 2025, 153, this.textureX, this.textureY);
/*   57 */     this.gunModel[20] = new ModelRendererTurbo(this, 81, 161, this.textureX, this.textureY);
/*   58 */     this.gunModel[21] = new ModelRendererTurbo(this, 97, 161, this.textureX, this.textureY);
/*   59 */     this.gunModel[22] = new ModelRendererTurbo(this, 113, 161, this.textureX, this.textureY);
/*   60 */     this.gunModel[23] = new ModelRendererTurbo(this, 657, 153, this.textureX, this.textureY);
/*   61 */     this.gunModel[24] = new ModelRendererTurbo(this, 1257, 137, this.textureX, this.textureY);
/*   62 */     this.gunModel[25] = new ModelRendererTurbo(this, 1273, 137, this.textureX, this.textureY);
/*   63 */     this.gunModel[26] = new ModelRendererTurbo(this, 129, 161, this.textureX, this.textureY);
/*   64 */     this.gunModel[27] = new ModelRendererTurbo(this, 273, 161, this.textureX, this.textureY);
/*   65 */     this.gunModel[28] = new ModelRendererTurbo(this, 305, 161, this.textureX, this.textureY);
/*   66 */     this.gunModel[29] = new ModelRendererTurbo(this, 345, 161, this.textureX, this.textureY);
/*   67 */     this.gunModel[30] = new ModelRendererTurbo(this, 465, 161, this.textureX, this.textureY);
/*   68 */     this.gunModel[31] = new ModelRendererTurbo(this, 505, 161, this.textureX, this.textureY);
/*   69 */     this.gunModel[32] = new ModelRendererTurbo(this, 545, 161, this.textureX, this.textureY);
/*   70 */     this.gunModel[33] = new ModelRendererTurbo(this, 585, 161, this.textureX, this.textureY);
/*   71 */     this.gunModel[34] = new ModelRendererTurbo(this, 737, 161, this.textureX, this.textureY);
/*   72 */     this.gunModel[35] = new ModelRendererTurbo(this, 873, 161, this.textureX, this.textureY);
/*   73 */     this.gunModel[36] = new ModelRendererTurbo(this, 985, 161, this.textureX, this.textureY);
/*   74 */     this.gunModel[37] = new ModelRendererTurbo(this, 1201, 161, this.textureX, this.textureY);
/*   75 */     this.gunModel[38] = new ModelRendererTurbo(this, 1369, 161, this.textureX, this.textureY);
/*   76 */     this.gunModel[39] = new ModelRendererTurbo(this, 1009, 177, this.textureX, this.textureY);
/*   77 */     this.gunModel[40] = new ModelRendererTurbo(this, 1449, 177, this.textureX, this.textureY);
/*   78 */     this.gunModel[41] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*   79 */     this.gunModel[42] = new ModelRendererTurbo(this, 337, 185, this.textureX, this.textureY);
/*   80 */     this.gunModel[43] = new ModelRendererTurbo(this, 161, 169, this.textureX, this.textureY);
/*   81 */     this.gunModel[44] = new ModelRendererTurbo(this, 1705, 169, this.textureX, this.textureY);
/*   82 */     this.gunModel[45] = new ModelRendererTurbo(this, 1025, 169, this.textureX, this.textureY);
/*   83 */     this.gunModel[46] = new ModelRendererTurbo(this, 505, 185, this.textureX, this.textureY);
/*   84 */     this.gunModel[47] = new ModelRendererTurbo(this, 665, 185, this.textureX, this.textureY);
/*   85 */     this.gunModel[48] = new ModelRendererTurbo(this, 825, 185, this.textureX, this.textureY);
/*   86 */     this.gunModel[49] = new ModelRendererTurbo(this, 1185, 185, this.textureX, this.textureY);
/*   87 */     this.gunModel[50] = new ModelRendererTurbo(this, 1401, 185, this.textureX, this.textureY);
/*   88 */     this.gunModel[51] = new ModelRendererTurbo(this, 1945, 161, this.textureX, this.textureY);
/*   89 */     this.gunModel[52] = new ModelRendererTurbo(this, 1689, 161, this.textureX, this.textureY);
/*   90 */     this.gunModel[53] = new ModelRendererTurbo(this, 1953, 177, this.textureX, this.textureY);
/*   91 */     this.gunModel[54] = new ModelRendererTurbo(this, 377, 169, this.textureX, this.textureY);
/*   92 */     this.gunModel[55] = new ModelRendererTurbo(this, 777, 161, this.textureX, this.textureY);
/*   93 */     this.gunModel[56] = new ModelRendererTurbo(this, 1593, 177, this.textureX, this.textureY);
/*   94 */     this.gunModel[57] = new ModelRendererTurbo(this, 145, 185, this.textureX, this.textureY);
/*   95 */     this.gunModel[58] = new ModelRendererTurbo(this, 1801, 169, this.textureX, this.textureY);
/*   96 */     this.gunModel[59] = new ModelRendererTurbo(this, 1329, 177, this.textureX, this.textureY);
/*   97 */     this.gunModel[60] = new ModelRendererTurbo(this, 177, 185, this.textureX, this.textureY);
/*   98 */     this.gunModel[61] = new ModelRendererTurbo(this, 233, 185, this.textureX, this.textureY);
/*   99 */     this.gunModel[62] = new ModelRendererTurbo(this, 961, 185, this.textureX, this.textureY);
/*  100 */     this.gunModel[63] = new ModelRendererTurbo(this, 1705, 185, this.textureX, this.textureY);
/*  101 */     this.gunModel[64] = new ModelRendererTurbo(this, 1553, 185, this.textureX, this.textureY);
/*  102 */     this.gunModel[65] = new ModelRendererTurbo(this, 1905, 185, this.textureX, this.textureY);
/*  103 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  104 */     this.gunModel[67] = new ModelRendererTurbo(this, 65, 193, this.textureX, this.textureY);
/*  105 */     this.gunModel[68] = new ModelRendererTurbo(this, 489, 193, this.textureX, this.textureY);
/*  106 */     this.gunModel[69] = new ModelRendererTurbo(this, 553, 193, this.textureX, this.textureY);
/*  107 */     this.gunModel[70] = new ModelRendererTurbo(this, 617, 193, this.textureX, this.textureY);
/*  108 */     this.gunModel[71] = new ModelRendererTurbo(this, 681, 193, this.textureX, this.textureY);
/*  109 */     this.gunModel[72] = new ModelRendererTurbo(this, 273, 185, this.textureX, this.textureY);
/*  110 */     this.gunModel[73] = new ModelRendererTurbo(this, 753, 193, this.textureX, this.textureY);
/*  111 */     this.gunModel[74] = new ModelRendererTurbo(this, 41, 193, this.textureX, this.textureY);
/*  112 */     this.gunModel[75] = new ModelRendererTurbo(this, 105, 193, this.textureX, this.textureY);
/*  113 */     this.gunModel[76] = new ModelRendererTurbo(this, 801, 193, this.textureX, this.textureY);
/*  114 */     this.gunModel[77] = new ModelRendererTurbo(this, 873, 193, this.textureX, this.textureY);
/*  115 */     this.gunModel[78] = new ModelRendererTurbo(this, 1185, 193, this.textureX, this.textureY);
/*  116 */     this.gunModel[79] = new ModelRendererTurbo(this, 609, 161, this.textureX, this.textureY);
/*  117 */     this.gunModel[80] = new ModelRendererTurbo(this, 1217, 193, this.textureX, this.textureY);
/*  118 */     this.gunModel[81] = new ModelRendererTurbo(this, 1977, 193, this.textureX, this.textureY);
/*  119 */     this.gunModel[82] = new ModelRendererTurbo(this, 297, 201, this.textureX, this.textureY);
/*  120 */     this.gunModel[83] = new ModelRendererTurbo(this, 529, 193, this.textureX, this.textureY);
/*  121 */     this.gunModel[84] = new ModelRendererTurbo(this, 593, 193, this.textureX, this.textureY);
/*  122 */     this.gunModel[85] = new ModelRendererTurbo(this, 657, 193, this.textureX, this.textureY);
/*  123 */     this.gunModel[86] = new ModelRendererTurbo(this, 337, 209, this.textureX, this.textureY);
/*  124 */     this.gunModel[87] = new ModelRendererTurbo(this, 1249, 193, this.textureX, this.textureY);
/*  125 */     this.gunModel[88] = new ModelRendererTurbo(this, 1017, 225, this.textureX, this.textureY);
/*  126 */     this.gunModel[89] = new ModelRendererTurbo(this, 401, 209, this.textureX, this.textureY);
/*  127 */     this.gunModel[90] = new ModelRendererTurbo(this, 1785, 193, this.textureX, this.textureY);
/*  128 */     this.gunModel[91] = new ModelRendererTurbo(this, 1377, 209, this.textureX, this.textureY);
/*  129 */     this.gunModel[92] = new ModelRendererTurbo(this, 1457, 209, this.textureX, this.textureY);
/*  130 */     this.gunModel[93] = new ModelRendererTurbo(this, 785, 217, this.textureX, this.textureY);
/*  131 */     this.gunModel[94] = new ModelRendererTurbo(this, 425, 169, this.textureX, this.textureY);
/*  132 */     this.gunModel[95] = new ModelRendererTurbo(this, 769, 161, this.textureX, this.textureY);
/*  133 */     this.gunModel[96] = new ModelRendererTurbo(this, 465, 145, this.textureX, this.textureY);
/*  134 */     this.gunModel[97] = new ModelRendererTurbo(this, 737, 145, this.textureX, this.textureY);
/*  135 */     this.gunModel[98] = new ModelRendererTurbo(this, 617, 241, this.textureX, this.textureY);
/*  136 */     this.gunModel[99] = new ModelRendererTurbo(this, 1017, 241, this.textureX, this.textureY);
/*  137 */     this.gunModel[100] = new ModelRendererTurbo(this, 289, 249, this.textureX, this.textureY);
/*  138 */     this.gunModel[101] = new ModelRendererTurbo(this, 569, 249, this.textureX, this.textureY);
/*  139 */     this.gunModel[102] = new ModelRendererTurbo(this, 1017, 249, this.textureX, this.textureY);
/*  140 */     this.gunModel[103] = new ModelRendererTurbo(this, 289, 257, this.textureX, this.textureY);
/*  141 */     this.gunModel[104] = new ModelRendererTurbo(this, 1625, 257, this.textureX, this.textureY);
/*  142 */     this.gunModel[105] = new ModelRendererTurbo(this, 233, 265, this.textureX, this.textureY);
/*  143 */     this.gunModel[106] = new ModelRendererTurbo(this, 513, 265, this.textureX, this.textureY);
/*  144 */     this.gunModel[107] = new ModelRendererTurbo(this, 793, 265, this.textureX, this.textureY);
/*  145 */     this.gunModel[108] = new ModelRendererTurbo(this, 1625, 265, this.textureX, this.textureY);
/*  146 */     this.gunModel[109] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/*  147 */     this.gunModel[110] = new ModelRendererTurbo(this, 1073, 265, this.textureX, this.textureY);
/*  148 */     this.gunModel[111] = new ModelRendererTurbo(this, 281, 273, this.textureX, this.textureY);
/*  149 */     this.gunModel[112] = new ModelRendererTurbo(this, 505, 273, this.textureX, this.textureY);
/*  150 */     this.gunModel[113] = new ModelRendererTurbo(this, 729, 273, this.textureX, this.textureY);
/*  151 */     this.gunModel[114] = new ModelRendererTurbo(this, 961, 273, this.textureX, this.textureY);
/*  152 */     this.gunModel[115] = new ModelRendererTurbo(this, 1625, 273, this.textureX, this.textureY);
/*  153 */     this.gunModel[116] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/*  154 */     this.gunModel[117] = new ModelRendererTurbo(this, 225, 281, this.textureX, this.textureY);
/*  155 */     this.gunModel[118] = new ModelRendererTurbo(this, 449, 281, this.textureX, this.textureY);
/*  156 */     this.gunModel[119] = new ModelRendererTurbo(this, 1185, 281, this.textureX, this.textureY);
/*  157 */     this.gunModel[120] = new ModelRendererTurbo(this, 217, 289, this.textureX, this.textureY);
/*  158 */     this.gunModel[121] = new ModelRendererTurbo(this, 497, 289, this.textureX, this.textureY);
/*  159 */     this.gunModel[122] = new ModelRendererTurbo(this, 777, 289, this.textureX, this.textureY);
/*  160 */     this.gunModel[123] = new ModelRendererTurbo(this, 1057, 289, this.textureX, this.textureY);
/*  161 */     this.gunModel[124] = new ModelRendererTurbo(this, 1625, 289, this.textureX, this.textureY);
/*  162 */     this.gunModel[125] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/*  163 */     this.gunModel[126] = new ModelRendererTurbo(this, 225, 297, this.textureX, this.textureY);
/*  164 */     this.gunModel[127] = new ModelRendererTurbo(this, 505, 297, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 297, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1073, 297, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 305, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 217, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 217, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 1377, 233, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 1785, 225, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 1977, 225, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 1017, 209, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 1089, 209, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 177, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 665, 177, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 1457, 233, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 913, 177, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 1241, 225, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 233, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 849, 249, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 1241, 233, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 305, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 1625, 305, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 313, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 313, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 721, 313, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 929, 313, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 1161, 313, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 1625, 313, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 321, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 257, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 241, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 1593, 169, this.textureX, this.textureY);
/*  197 */     this.gunModel[' '] = new ModelRendererTurbo(this, 1377, 257, this.textureX, this.textureY);
/*  198 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 1457, 273, this.textureX, this.textureY);
/*  199 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 353, 241, this.textureX, this.textureY);
/*  200 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1353, 289, this.textureX, this.textureY);
/*  201 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 921, 193, this.textureX, this.textureY);
/*  202 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 897, 241, this.textureX, this.textureY);
/*  203 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 1457, 257, this.textureX, this.textureY);
/*  204 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1833, 249, this.textureX, this.textureY);
/*  205 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 1977, 257, this.textureX, this.textureY);
/*  206 */     this.gunModel['©'] = new ModelRendererTurbo(this, 1425, 297, this.textureX, this.textureY);
/*  207 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1161, 321, this.textureX, this.textureY);
/*  208 */     this.gunModel['«'] = new ModelRendererTurbo(this, 1617, 321, this.textureX, this.textureY);
/*  209 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1961, 313, this.textureX, this.textureY);
/*  210 */     this.gunModel['­'] = new ModelRendererTurbo(this, 1841, 313, this.textureX, this.textureY);
/*  211 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1289, 201, this.textureX, this.textureY);
/*  212 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1369, 321, this.textureX, this.textureY);
/*  213 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1849, 273, this.textureX, this.textureY);
/*  214 */     this.gunModel['±'] = new ModelRendererTurbo(this, 921, 257, this.textureX, this.textureY);
/*  215 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1977, 273, this.textureX, this.textureY);
/*  216 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1489, 297, this.textureX, this.textureY);
/*  217 */     this.gunModel['´'] = new ModelRendererTurbo(this, 433, 321, this.textureX, this.textureY);
/*  218 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 1425, 321, this.textureX, this.textureY);
/*  219 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 1, 329, this.textureX, this.textureY);
/*  220 */     this.gunModel['·'] = new ModelRendererTurbo(this, 65, 329, this.textureX, this.textureY);
/*  221 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 137, 329, this.textureX, this.textureY);
/*  222 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 497, 329, this.textureX, this.textureY);
/*  223 */     this.gunModel['º'] = new ModelRendererTurbo(this, 569, 329, this.textureX, this.textureY);
/*  224 */     this.gunModel['»'] = new ModelRendererTurbo(this, 641, 329, this.textureX, this.textureY);
/*  225 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 721, 329, this.textureX, this.textureY);
/*  226 */     this.gunModel['½'] = new ModelRendererTurbo(this, 785, 329, this.textureX, this.textureY);
/*  227 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 849, 329, this.textureX, this.textureY);
/*  228 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 1153, 329, this.textureX, this.textureY);
/*  229 */     this.gunModel['À'] = new ModelRendererTurbo(this, 1225, 329, this.textureX, this.textureY);
/*  230 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 1529, 329, this.textureX, this.textureY);
/*  231 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 121, 257, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 217, 185, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 145, 169, this.textureX, this.textureY);
/*  234 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 41, 329, this.textureX, this.textureY);
/*  235 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 1953, 193, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 729, 193, this.textureX, this.textureY);
/*  237 */     this.gunModel['È'] = new ModelRendererTurbo(this, 921, 201, this.textureX, this.textureY);
/*  238 */     this.gunModel['É'] = new ModelRendererTurbo(this, 753, 225, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 105, 329, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 1289, 249, this.textureX, this.textureY);
/*  241 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1289, 265, this.textureX, this.textureY);
/*  242 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 537, 329, this.textureX, this.textureY);
/*  243 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 1281, 329, this.textureX, this.textureY);
/*  244 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 1377, 193, this.textureX, this.textureY);
/*  245 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1161, 209, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 1769, 185, this.textureX, this.textureY);
/*  247 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1905, 185, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 1601, 329, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 2009, 225, this.textureX, this.textureY);
/*  250 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 169, 329, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  252 */     this.gunModel['×'] = new ModelRendererTurbo(this, 473, 329, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 617, 329, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1521, 209, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 697, 329, this.textureX, this.textureY);
/*  256 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 505, 185, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 505, 185, this.textureX, this.textureY);
/*      */     
/*  259 */     this.gunModel[0].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  260 */     this.gunModel[0].setRotationPoint(-1.0F, -110.75F, -19.25F);
/*      */     
/*  262 */     this.gunModel[1].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/*  263 */     this.gunModel[1].setRotationPoint(-1.0F, -107.75F, -19.25F);
/*      */     
/*  265 */     this.gunModel[2].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/*  266 */     this.gunModel[2].setRotationPoint(-1.0F, -121.5F, 5.5F);
/*      */     
/*  268 */     this.gunModel[3].addShapeBox(59.0F, 10.0F, -3.0F, 22, 2, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  269 */     this.gunModel[3].setRotationPoint(21.0F, -120.75F, -4.75F);
/*      */     
/*  271 */     this.gunModel[4].addShapeBox(59.0F, 10.0F, -3.0F, 31, 9, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  272 */     this.gunModel[4].setRotationPoint(-13.0F, -137.0F, -5.25F);
/*      */     
/*  274 */     this.gunModel[5].addShapeBox(59.0F, 10.0F, -3.0F, 56, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  275 */     this.gunModel[5].setRotationPoint(18.0F, -137.0F, -2.25F);
/*      */     
/*  277 */     this.gunModel[6].addShapeBox(59.0F, 10.0F, -3.0F, 36, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  278 */     this.gunModel[6].setRotationPoint(29.0F, -137.0F, 11.75F);
/*      */     
/*  280 */     this.gunModel[7].addShapeBox(59.0F, 10.0F, -3.0F, 11, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  281 */     this.gunModel[7].setRotationPoint(18.0F, -137.0F, 11.75F);
/*      */     
/*  283 */     this.gunModel[8].addShapeBox(59.0F, 10.0F, -3.0F, 36, 9, 3, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  284 */     this.gunModel[8].setRotationPoint(29.0F, -137.0F, -5.25F);
/*      */     
/*  286 */     this.gunModel[9].addShapeBox(59.0F, 10.0F, -3.0F, 11, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  287 */     this.gunModel[9].setRotationPoint(18.0F, -137.0F, -5.25F);
/*      */     
/*  289 */     this.gunModel[10].addShapeBox(59.0F, 10.0F, -3.0F, 11, 81, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  290 */     this.gunModel[10].setRotationPoint(-24.0F, -132.0F, -5.25F);
/*      */     
/*  292 */     this.gunModel[11].addShapeBox(59.0F, 10.0F, -3.0F, 10, 70, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  293 */     this.gunModel[11].setRotationPoint(-13.0F, -128.0F, -5.25F);
/*      */     
/*  295 */     this.gunModel[12].addShapeBox(59.0F, 10.0F, -3.0F, 31, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  296 */     this.gunModel[12].setRotationPoint(1.0F, -138.0F, -0.25F);
/*      */     
/*  298 */     this.gunModel[13].addShapeBox(59.0F, 10.0F, -3.0F, 11, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  299 */     this.gunModel[13].setRotationPoint(-14.0F, -139.0F, -0.25F);
/*      */     
/*  301 */     this.gunModel[14].addShapeBox(59.0F, 10.0F, -3.0F, 4, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  302 */     this.gunModel[14].setRotationPoint(-3.0F, -139.0F, -0.25F);
/*      */     
/*  304 */     this.gunModel[15].addShapeBox(59.0F, 10.0F, -3.0F, 6, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  305 */     this.gunModel[15].setRotationPoint(-20.0F, -139.0F, -5.25F);
/*      */     
/*  307 */     this.gunModel[16].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  308 */     this.gunModel[16].setRotationPoint(-15.0F, -141.0F, -5.25F);
/*      */     
/*  310 */     this.gunModel[17].addShapeBox(59.0F, 10.0F, -3.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  311 */     this.gunModel[17].setRotationPoint(-17.0F, -141.0F, -5.25F);
/*      */     
/*  313 */     this.gunModel[18].addShapeBox(59.0F, 10.0F, -3.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  314 */     this.gunModel[18].setRotationPoint(-20.0F, -141.0F, -5.25F);
/*      */     
/*  316 */     this.gunModel[19].addShapeBox(59.0F, 10.0F, -3.0F, 2, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  317 */     this.gunModel[19].setRotationPoint(-17.0F, -145.0F, -5.25F);
/*      */     
/*  319 */     this.gunModel[20].addShapeBox(59.0F, 10.0F, -3.0F, 2, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  320 */     this.gunModel[20].setRotationPoint(-17.0F, -145.0F, 9.75F);
/*      */     
/*  322 */     this.gunModel[21].addShapeBox(59.0F, 10.0F, -3.0F, 2, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  323 */     this.gunModel[21].setRotationPoint(-20.0F, -145.0F, -5.25F);
/*      */     
/*  325 */     this.gunModel[22].addShapeBox(59.0F, 10.0F, -3.0F, 2, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  326 */     this.gunModel[22].setRotationPoint(-20.0F, -145.0F, 9.75F);
/*      */     
/*  328 */     this.gunModel[23].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  329 */     this.gunModel[23].setRotationPoint(-18.0F, -141.0F, -2.25F);
/*      */     
/*  331 */     this.gunModel[24].addShapeBox(59.0F, 10.0F, -3.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  332 */     this.gunModel[24].setRotationPoint(-18.0F, -145.0F, -2.25F);
/*      */     
/*  334 */     this.gunModel[25].addShapeBox(59.0F, 10.0F, -3.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  335 */     this.gunModel[25].setRotationPoint(-18.0F, -145.0F, 6.75F);
/*      */     
/*  337 */     this.gunModel[26].addShapeBox(59.0F, 10.0F, -3.0F, 9, 13, 3, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  338 */     this.gunModel[26].setRotationPoint(65.0F, -137.0F, -5.25F);
/*      */     
/*  340 */     this.gunModel[27].addShapeBox(59.0F, 10.0F, -3.0F, 9, 13, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  341 */     this.gunModel[27].setRotationPoint(65.0F, -137.0F, 11.75F);
/*      */     
/*  343 */     this.gunModel[28].addShapeBox(59.0F, 10.0F, -3.0F, 10, 28, 9, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  344 */     this.gunModel[28].setRotationPoint(-13.0F, -112.0F, 14.75F);
/*      */     
/*  346 */     this.gunModel[29].addShapeBox(59.0F, 10.0F, -3.0F, 10, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  347 */     this.gunModel[29].setRotationPoint(-13.0F, -121.0F, 14.75F);
/*      */     
/*  349 */     this.gunModel[30].addShapeBox(59.0F, 10.0F, -3.0F, 10, 9, 9, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F);
/*  350 */     this.gunModel[30].setRotationPoint(-13.0F, -84.0F, 14.75F);
/*      */     
/*  352 */     this.gunModel[31].addShapeBox(59.0F, 10.0F, -3.0F, 10, 14, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F);
/*  353 */     this.gunModel[31].setRotationPoint(-13.0F, -98.0F, 23.75F);
/*      */     
/*  355 */     this.gunModel[32].addShapeBox(59.0F, 10.0F, -3.0F, 10, 14, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/*  356 */     this.gunModel[32].setRotationPoint(-13.0F, -112.0F, 23.75F);
/*      */     
/*  358 */     this.gunModel[33].addShapeBox(59.0F, 10.0F, -3.0F, 10, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  359 */     this.gunModel[33].setRotationPoint(-13.0F, -113.0F, -14.25F);
/*      */     
/*  361 */     this.gunModel[34].addShapeBox(59.0F, 10.0F, -3.0F, 10, 9, 9, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  362 */     this.gunModel[34].setRotationPoint(-13.0F, -122.0F, -14.25F);
/*      */     
/*  364 */     this.gunModel[35].addShapeBox(59.0F, 10.0F, -3.0F, 10, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  365 */     this.gunModel[35].setRotationPoint(-13.0F, -85.0F, -14.25F);
/*      */     
/*  367 */     this.gunModel[36].addShapeBox(59.0F, 10.0F, -3.0F, 10, 14, 9, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  368 */     this.gunModel[36].setRotationPoint(-13.0F, -99.0F, -23.25F);
/*      */     
/*  370 */     this.gunModel[37].addShapeBox(59.0F, 10.0F, -3.0F, 10, 14, 9, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  371 */     this.gunModel[37].setRotationPoint(-13.0F, -113.0F, -23.25F);
/*      */     
/*  373 */     this.gunModel[38].addShapeBox(59.0F, 10.0F, -3.0F, 10, 19, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  374 */     this.gunModel[38].setRotationPoint(-13.0F, -104.0F, -14.25F);
/*      */     
/*  376 */     this.gunModel[39].addShapeBox(59.0F, 10.0F, -3.0F, 73, 6, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  377 */     this.gunModel[39].setRotationPoint(-3.0F, -67.0F, -5.25F);
/*      */     
/*  379 */     this.gunModel[40].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  380 */     this.gunModel[40].setRotationPoint(-3.0F, -70.0F, 11.75F);
/*      */     
/*  382 */     this.gunModel[41].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  383 */     this.gunModel[41].setRotationPoint(-3.0F, -70.0F, -5.25F);
/*      */     
/*  385 */     this.gunModel[42].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  386 */     this.gunModel[42].setRotationPoint(-3.0F, -70.0F, -2.25F);
/*      */     
/*  388 */     this.gunModel[43].addShapeBox(59.0F, 10.0F, -3.0F, 48, 3, 5, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  389 */     this.gunModel[43].setRotationPoint(-3.0F, -73.0F, 6.75F);
/*      */     
/*  391 */     this.gunModel[44].addShapeBox(59.0F, 10.0F, -3.0F, 48, 3, 5, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  392 */     this.gunModel[44].setRotationPoint(-3.0F, -73.0F, -2.25F);
/*      */     
/*  394 */     this.gunModel[45].addShapeBox(59.0F, 10.0F, -3.0F, 48, 3, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  395 */     this.gunModel[45].setRotationPoint(-3.0F, -73.0F, 2.75F);
/*      */     
/*  397 */     this.gunModel[46].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  398 */     this.gunModel[46].setRotationPoint(-3.0F, -67.0F, 14.75F);
/*      */     
/*  400 */     this.gunModel[47].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  401 */     this.gunModel[47].setRotationPoint(-3.0F, -64.0F, 14.75F);
/*      */     
/*  403 */     this.gunModel[48].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  404 */     this.gunModel[48].setRotationPoint(-3.0F, -61.0F, 11.75F);
/*      */     
/*  406 */     this.gunModel[49].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  407 */     this.gunModel[49].setRotationPoint(-3.0F, -61.0F, -5.25F);
/*      */     
/*  409 */     this.gunModel[50].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  410 */     this.gunModel[50].setRotationPoint(-3.0F, -61.0F, -2.25F);
/*      */     
/*  412 */     this.gunModel[51].addShapeBox(59.0F, 10.0F, -3.0F, 34, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  413 */     this.gunModel[51].setRotationPoint(36.0F, -58.0F, -2.25F);
/*      */     
/*  415 */     this.gunModel[52].addShapeBox(59.0F, 10.0F, -3.0F, 34, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  416 */     this.gunModel[52].setRotationPoint(36.0F, -58.0F, 2.75F);
/*      */     
/*  418 */     this.gunModel[53].addShapeBox(59.0F, 10.0F, -3.0F, 34, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  419 */     this.gunModel[53].setRotationPoint(36.0F, -58.0F, 6.75F);
/*      */     
/*  421 */     this.gunModel[54].addShapeBox(59.0F, 10.0F, -3.0F, 15, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  422 */     this.gunModel[54].setRotationPoint(21.0F, -58.0F, -2.25F);
/*      */     
/*  424 */     this.gunModel[55].addShapeBox(59.0F, 10.0F, -3.0F, 4, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  425 */     this.gunModel[55].setRotationPoint(32.0F, -57.0F, -2.25F);
/*      */     
/*  427 */     this.gunModel[56].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  428 */     this.gunModel[56].setRotationPoint(24.0F, -57.0F, -2.25F);
/*      */     
/*  430 */     this.gunModel[57].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  431 */     this.gunModel[57].setRotationPoint(24.0F, -54.0F, -2.25F);
/*      */     
/*  433 */     this.gunModel[58].addShapeBox(59.0F, 10.0F, -3.0F, 4, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  434 */     this.gunModel[58].setRotationPoint(32.0F, -54.0F, -2.25F);
/*      */     
/*  436 */     this.gunModel[59].addShapeBox(59.0F, 10.0F, -3.0F, 3, 83, 20, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  437 */     this.gunModel[59].setRotationPoint(-27.0F, -132.0F, -5.25F);
/*      */     
/*  439 */     this.gunModel[60].addShapeBox(59.0F, 10.0F, -3.0F, 6, 65, 20, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  440 */     this.gunModel[60].setRotationPoint(-33.0F, -120.25F, -5.25F);
/*      */     
/*  442 */     this.gunModel[61].addShapeBox(59.0F, 10.0F, -3.0F, 6, 53, 20, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  443 */     this.gunModel[61].setRotationPoint(-39.0F, -110.25F, -5.25F);
/*      */     
/*  445 */     this.gunModel[62].addShapeBox(59.0F, 10.0F, -3.0F, 6, 47, 20, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  446 */     this.gunModel[62].setRotationPoint(-45.0F, -103.25F, -5.25F);
/*      */     
/*  448 */     this.gunModel[63].addShapeBox(59.0F, 10.0F, -3.0F, 18, 45, 20, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  449 */     this.gunModel[63].setRotationPoint(-63.0F, -101.25F, -5.25F);
/*      */     
/*  451 */     this.gunModel[64].addShapeBox(59.0F, 10.0F, -3.0F, 7, 114, 25, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[64].setRotationPoint(-70.0F, -99.25F, -8.0F);
/*      */     
/*  454 */     this.gunModel[65].addShapeBox(59.0F, 10.0F, -3.0F, 8, 113, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  455 */     this.gunModel[65].setRotationPoint(-63.0F, -99.25F, -8.0F);
/*      */     
/*  457 */     this.gunModel[66].addShapeBox(59.0F, 10.0F, -3.0F, 6, 42, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  458 */     this.gunModel[66].setRotationPoint(-55.0F, -97.25F, -8.0F);
/*      */     
/*  460 */     this.gunModel[67].addShapeBox(59.0F, 10.0F, -3.0F, 4, 38, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  461 */     this.gunModel[67].setRotationPoint(-49.0F, -93.25F, -8.0F);
/*      */     
/*  463 */     this.gunModel[68].addShapeBox(59.0F, 10.0F, -3.0F, 5, 28, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  464 */     this.gunModel[68].setRotationPoint(-45.0F, -83.25F, -8.0F);
/*      */     
/*  466 */     this.gunModel[69].addShapeBox(59.0F, 10.0F, -3.0F, 5, 25, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  467 */     this.gunModel[69].setRotationPoint(-40.0F, -80.25F, -8.0F);
/*      */     
/*  469 */     this.gunModel[70].addShapeBox(59.0F, 10.0F, -3.0F, 5, 20, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  470 */     this.gunModel[70].setRotationPoint(-35.0F, -75.25F, -8.0F);
/*      */     
/*  472 */     this.gunModel[71].addShapeBox(59.0F, 10.0F, -3.0F, 9, 19, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  473 */     this.gunModel[71].setRotationPoint(-30.0F, -60.25F, -8.0F);
/*      */     
/*  475 */     this.gunModel[72].addShapeBox(59.0F, 10.0F, -3.0F, 8, 2, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  476 */     this.gunModel[72].setRotationPoint(25.0F, -51.0F, -2.25F);
/*      */     
/*  478 */     this.gunModel[73].addShapeBox(59.0F, 10.0F, -3.0F, 8, 12, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  479 */     this.gunModel[73].setRotationPoint(25.0F, -49.0F, -2.25F);
/*      */     
/*  481 */     this.gunModel[74].addShapeBox(59.0F, 10.0F, -3.0F, 8, 7, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F);
/*  482 */     this.gunModel[74].setRotationPoint(21.0F, -37.0F, -2.25F);
/*      */     
/*  484 */     this.gunModel[75].addShapeBox(59.0F, 10.0F, -3.0F, 10, 3, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F);
/*  485 */     this.gunModel[75].setRotationPoint(13.0F, -30.0F, -2.25F);
/*      */     
/*  487 */     this.gunModel[76].addShapeBox(59.0F, 10.0F, -3.0F, 18, 2, 14, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  488 */     this.gunModel[76].setRotationPoint(-1.0F, -27.0F, -2.25F);
/*      */     
/*  490 */     this.gunModel[77].addShapeBox(59.0F, 10.0F, -3.0F, 14, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  491 */     this.gunModel[77].setRotationPoint(7.0F, -58.0F, -2.25F);
/*      */     
/*  493 */     this.gunModel[78].addShapeBox(59.0F, 10.0F, -3.0F, 11, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  494 */     this.gunModel[78].setRotationPoint(-4.0F, -58.0F, -2.25F);
/*      */     
/*  496 */     this.gunModel[79].addShapeBox(59.0F, 10.0F, -3.0F, 5, 2, 21, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  497 */     this.gunModel[79].setRotationPoint(-8.0F, -58.0F, -6.25F);
/*      */     
/*  499 */     this.gunModel[80].addShapeBox(59.0F, 10.0F, -3.0F, 5, 7, 21, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  500 */     this.gunModel[80].setRotationPoint(-13.0F, -58.0F, -6.25F);
/*      */     
/*  502 */     this.gunModel[81].addShapeBox(59.0F, 10.0F, -3.0F, 11, 5, 21, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  503 */     this.gunModel[81].setRotationPoint(-24.0F, -51.0F, -6.25F);
/*      */     
/*  505 */     this.gunModel[82].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 21, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  506 */     this.gunModel[82].setRotationPoint(-24.0F, -46.0F, -6.25F);
/*      */     
/*  508 */     this.gunModel[83].addShapeBox(59.0F, 10.0F, -3.0F, 10, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/*  509 */     this.gunModel[83].setRotationPoint(-13.0F, -30.0F, -2.25F);
/*      */     
/*  511 */     this.gunModel[84].addShapeBox(59.0F, 10.0F, -3.0F, 8, 7, 14, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/*  512 */     this.gunModel[84].setRotationPoint(-19.0F, -37.0F, -2.25F);
/*      */     
/*  514 */     this.gunModel[85].addShapeBox(59.0F, 10.0F, -3.0F, 8, 6, 14, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  515 */     this.gunModel[85].setRotationPoint(-23.0F, -43.0F, -2.25F);
/*      */     
/*  517 */     this.gunModel[86].addShapeBox(59.0F, 10.0F, -3.0F, 20, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  518 */     this.gunModel[86].setRotationPoint(45.0F, -128.0F, -5.25F);
/*      */     
/*  520 */     this.gunModel[87].addShapeBox(59.0F, 10.0F, -3.0F, 9, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  521 */     this.gunModel[87].setRotationPoint(65.0F, -128.0F, -2.25F);
/*      */     
/*  523 */     this.gunModel[88].addShapeBox(59.0F, 10.0F, -3.0F, 105, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  524 */     this.gunModel[88].setRotationPoint(74.0F, -137.0F, 1.25F);
/*      */     
/*  526 */     this.gunModel[89].addShapeBox(59.0F, 10.0F, -3.0F, 23, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  527 */     this.gunModel[89].setRotationPoint(147.0F, -129.0F, -1.75F);
/*      */     
/*  529 */     this.gunModel[90].addShapeBox(59.0F, 10.0F, -3.0F, 9, 12, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  530 */     this.gunModel[90].setRotationPoint(170.0F, -136.0F, -1.75F);
/*      */     
/*  532 */     this.gunModel[91].addShapeBox(59.0F, 10.0F, -3.0F, 23, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  533 */     this.gunModel[91].setRotationPoint(147.0F, -136.0F, -1.75F);
/*      */     
/*  535 */     this.gunModel[92].addShapeBox(59.0F, 10.0F, -3.0F, 23, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  536 */     this.gunModel[92].setRotationPoint(115.0F, -136.0F, -1.75F);
/*      */     
/*  538 */     this.gunModel[93].addShapeBox(59.0F, 10.0F, -3.0F, 23, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  539 */     this.gunModel[93].setRotationPoint(83.0F, -136.0F, -1.75F);
/*      */     
/*  541 */     this.gunModel[94].addShapeBox(59.0F, 10.0F, -3.0F, 13, 5, 3, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  542 */     this.gunModel[94].setRotationPoint(154.0F, -144.0F, 3.75F);
/*      */     
/*  544 */     this.gunModel[95].addShapeBox(59.0F, 10.0F, -3.0F, 6, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  545 */     this.gunModel[95].setRotationPoint(167.0F, -144.0F, 3.75F);
/*      */     
/*  547 */     this.gunModel[96].addShapeBox(59.0F, 10.0F, -3.0F, 5, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[96].setRotationPoint(173.0F, -141.0F, 3.75F);
/*      */     
/*  550 */     this.gunModel[97].addShapeBox(59.0F, 10.0F, -3.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[97].setRotationPoint(173.0F, -144.0F, 3.75F);
/*      */     
/*  553 */     this.gunModel[98].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  554 */     this.gunModel[98].setRotationPoint(45.0F, -117.75F, -1.25F);
/*      */     
/*  556 */     this.gunModel[99].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/*  557 */     this.gunModel[99].setRotationPoint(45.0F, -114.75F, -1.25F);
/*      */     
/*  559 */     this.gunModel[100].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[100].setRotationPoint(45.0F, -111.75F, -0.5F);
/*      */     
/*  562 */     this.gunModel[101].addShapeBox(59.0F, 10.0F, -3.0F, 134, 5, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  563 */     this.gunModel[101].setRotationPoint(45.0F, -111.0F, 2.5F);
/*      */     
/*  565 */     this.gunModel[102].addShapeBox(59.0F, 10.0F, -3.0F, 134, 5, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  566 */     this.gunModel[102].setRotationPoint(45.0F, -111.0F, 5.5F);
/*      */     
/*  568 */     this.gunModel[103].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[103].setRotationPoint(45.0F, -111.75F, 8.5F);
/*      */     
/*  571 */     this.gunModel[104].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  572 */     this.gunModel[104].setRotationPoint(45.0F, -114.75F, 9.25F);
/*      */     
/*  574 */     this.gunModel[105].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[105].setRotationPoint(45.0F, -117.75F, 9.25F);
/*      */     
/*  577 */     this.gunModel[106].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[106].setRotationPoint(45.0F, -120.75F, 8.5F);
/*      */     
/*  580 */     this.gunModel[107].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/*  581 */     this.gunModel[107].setRotationPoint(45.0F, -121.5F, 5.5F);
/*      */     
/*  583 */     this.gunModel[108].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  584 */     this.gunModel[108].setRotationPoint(45.0F, -121.5F, 2.5F);
/*      */     
/*  586 */     this.gunModel[109].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  587 */     this.gunModel[109].setRotationPoint(45.0F, -120.75F, -0.5F);
/*      */     
/*  589 */     this.gunModel[110].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  590 */     this.gunModel[110].setRotationPoint(73.0F, -108.75F, 11.5F);
/*      */     
/*  592 */     this.gunModel[111].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[111].setRotationPoint(73.0F, -108.75F, -3.5F);
/*      */     
/*  595 */     this.gunModel[112].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[112].setRotationPoint(73.0F, -123.75F, -3.5F);
/*      */     
/*  598 */     this.gunModel[113].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  599 */     this.gunModel[113].setRotationPoint(73.0F, -105.75F, -0.5F);
/*      */     
/*  601 */     this.gunModel[114].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  602 */     this.gunModel[114].setRotationPoint(73.0F, -105.75F, 5.5F);
/*      */     
/*  604 */     this.gunModel[115].addShapeBox(59.0F, 10.0F, -3.0F, 106, 6, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[115].setRotationPoint(73.0F, -120.75F, -6.5F);
/*      */     
/*  607 */     this.gunModel[116].addShapeBox(59.0F, 10.0F, -3.0F, 106, 6, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[116].setRotationPoint(73.0F, -114.75F, -6.5F);
/*      */     
/*  610 */     this.gunModel[117].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[117].setRotationPoint(73.0F, -123.75F, 11.5F);
/*      */     
/*  613 */     this.gunModel[118].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[118].setRotationPoint(45.0F, -120.75F, -3.5F);
/*      */     
/*  616 */     this.gunModel[119].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[119].setRotationPoint(45.0F, -111.75F, -3.5F);
/*      */     
/*  619 */     this.gunModel[120].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[120].setRotationPoint(45.0F, -108.75F, -0.5F);
/*      */     
/*  622 */     this.gunModel[121].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[121].setRotationPoint(45.0F, -108.75F, 8.5F);
/*      */     
/*  625 */     this.gunModel[122].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[122].setRotationPoint(45.0F, -111.75F, 11.5F);
/*      */     
/*  628 */     this.gunModel[123].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[123].setRotationPoint(45.0F, -120.75F, 11.5F);
/*      */     
/*  631 */     this.gunModel[124].addShapeBox(59.0F, 10.0F, -3.0F, 106, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  632 */     this.gunModel[124].setRotationPoint(73.0F, -120.75F, 14.5F);
/*      */     
/*  634 */     this.gunModel[125].addShapeBox(59.0F, 10.0F, -3.0F, 106, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  635 */     this.gunModel[125].setRotationPoint(73.0F, -114.75F, 14.5F);
/*      */     
/*  637 */     this.gunModel[126].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[126].setRotationPoint(45.0F, -123.75F, 8.5F);
/*      */     
/*  640 */     this.gunModel[127].addShapeBox(59.0F, 10.0F, -3.0F, 134, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[127].setRotationPoint(45.0F, -123.75F, -0.5F);
/*      */     
/*  643 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 134, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  644 */     this.gunModel[''].setRotationPoint(45.0F, -123.75F, 2.5F);
/*      */     
/*  646 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 134, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  647 */     this.gunModel[''].setRotationPoint(45.0F, -117.75F, -3.5F);
/*      */     
/*  649 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 134, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  650 */     this.gunModel[''].setRotationPoint(45.0F, -117.75F, 12.25F);
/*      */     
/*  652 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 23, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  653 */     this.gunModel[''].setRotationPoint(115.0F, -129.0F, -1.75F);
/*      */     
/*  655 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 9, 12, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  656 */     this.gunModel[''].setRotationPoint(138.0F, -136.0F, -1.75F);
/*      */     
/*  658 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 23, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  659 */     this.gunModel[''].setRotationPoint(83.0F, -129.0F, -1.75F);
/*      */     
/*  661 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 9, 12, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  662 */     this.gunModel[''].setRotationPoint(106.0F, -136.0F, -1.75F);
/*      */     
/*  664 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 9, 12, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  665 */     this.gunModel[''].setRotationPoint(74.0F, -136.0F, -1.75F);
/*      */     
/*  667 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 3, 3, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  668 */     this.gunModel[''].setRotationPoint(45.0F, -124.25F, -6.0F);
/*      */     
/*  670 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 7, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  671 */     this.gunModel[''].setRotationPoint(45.0F, -121.25F, -8.5F);
/*      */     
/*  673 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 7, 5, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  674 */     this.gunModel[''].setRotationPoint(45.0F, -114.25F, -9.0F);
/*      */     
/*  676 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  677 */     this.gunModel[''].setRotationPoint(45.0F, -107.25F, -6.0F);
/*      */     
/*  679 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  680 */     this.gunModel[''].setRotationPoint(45.0F, -124.25F, -3.0F);
/*      */     
/*  682 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 4, 16, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[''].setRotationPoint(45.0F, -108.25F, -2.25F);
/*      */     
/*  685 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  686 */     this.gunModel[''].setRotationPoint(45.0F, -124.25F, 13.75F);
/*      */     
/*  688 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  689 */     this.gunModel[''].setRotationPoint(45.0F, -124.25F, 10.75F);
/*      */     
/*  691 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/*  692 */     this.gunModel[''].setRotationPoint(45.0F, -121.25F, 12.75F);
/*      */     
/*  694 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/*  695 */     this.gunModel[''].setRotationPoint(45.0F, -114.25F, 13.75F);
/*      */     
/*  697 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F);
/*  698 */     this.gunModel[''].setRotationPoint(45.0F, -107.25F, 13.75F);
/*      */     
/*  700 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  701 */     this.gunModel[''].setRotationPoint(73.0F, -94.25F, 9.5F);
/*      */     
/*  703 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  704 */     this.gunModel[''].setRotationPoint(73.0F, -94.25F, -1.5F);
/*      */     
/*  706 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  707 */     this.gunModel[''].setRotationPoint(73.0F, -105.25F, -1.5F);
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  710 */     this.gunModel[''].setRotationPoint(73.0F, -94.25F, 1.5F);
/*      */     
/*  712 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  713 */     this.gunModel[''].setRotationPoint(73.0F, -94.25F, 5.5F);
/*      */     
/*  715 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 4, 17, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  716 */     this.gunModel[''].setRotationPoint(73.0F, -102.25F, -4.5F);
/*      */     
/*  718 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 4, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  719 */     this.gunModel[''].setRotationPoint(73.0F, -98.25F, -4.5F);
/*      */     
/*  721 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  722 */     this.gunModel[''].setRotationPoint(73.0F, -105.25F, 9.5F);
/*      */     
/*  724 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  725 */     this.gunModel[''].setRotationPoint(73.0F, -102.25F, 12.5F);
/*      */     
/*  727 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 106, 4, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  728 */     this.gunModel[''].setRotationPoint(73.0F, -98.25F, -1.5F);
/*      */     
/*  730 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  731 */     this.gunModel[''].setRotationPoint(45.0F, -113.25F, -4.0F);
/*      */     
/*  733 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  734 */     this.gunModel[''].setRotationPoint(45.0F, -103.25F, -4.0F);
/*      */     
/*  736 */     this.gunModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 28, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  737 */     this.gunModel[''].setRotationPoint(45.0F, -104.25F, -3.0F);
/*      */     
/*  739 */     this.gunModel[' '].addShapeBox(59.0F, 10.0F, -3.0F, 28, 4, 19, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[' '].setRotationPoint(45.0F, -101.25F, -6.0F);
/*      */     
/*  742 */     this.gunModel['¡'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 4, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel['¡'].setRotationPoint(45.0F, -97.25F, -6.0F);
/*      */     
/*  745 */     this.gunModel['¢'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  746 */     this.gunModel['¢'].setRotationPoint(45.0F, -93.25F, -4.0F);
/*      */     
/*  748 */     this.gunModel['£'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  749 */     this.gunModel['£'].setRotationPoint(45.0F, -93.25F, -2.0F);
/*      */     
/*  751 */     this.gunModel['¤'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  752 */     this.gunModel['¤'].setRotationPoint(45.0F, -104.25F, 12.75F);
/*      */     
/*  754 */     this.gunModel['¥'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  755 */     this.gunModel['¥'].setRotationPoint(45.0F, -103.25F, 12.75F);
/*      */     
/*  757 */     this.gunModel['¦'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 4, 6, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  758 */     this.gunModel['¦'].setRotationPoint(45.0F, -97.25F, 10.75F);
/*      */     
/*  760 */     this.gunModel['§'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  761 */     this.gunModel['§'].setRotationPoint(45.0F, -93.25F, 12.75F);
/*      */     
/*  763 */     this.gunModel['¨'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  764 */     this.gunModel['¨'].setRotationPoint(45.0F, -101.25F, 11.75F);
/*      */     
/*  766 */     this.gunModel['©'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  767 */     this.gunModel['©'].setRotationPoint(45.0F, -104.25F, -2.0F);
/*      */     
/*  769 */     this.gunModel['ª'].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel['ª'].setRotationPoint(73.0F, -105.25F, 1.5F);
/*      */     
/*  772 */     this.gunModel['«'].addShapeBox(59.0F, 10.0F, -3.0F, 106, 3, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel['«'].setRotationPoint(73.0F, -105.25F, 5.5F);
/*      */     
/*  775 */     this.gunModel['¬'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 5, 12, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  776 */     this.gunModel['¬'].setRotationPoint(45.0F, -91.0F, -1.5F);
/*      */     
/*  778 */     this.gunModel['­'].addShapeBox(59.0F, 10.0F, -3.0F, 23, 8, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  779 */     this.gunModel['­'].setRotationPoint(45.0F, -77.0F, -2.5F);
/*      */     
/*  781 */     this.gunModel['®'].addShapeBox(59.0F, 10.0F, -3.0F, 5, 8, 14, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, -3.0F, 0.0F, 1.25F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  782 */     this.gunModel['®'].setRotationPoint(68.0F, -77.0F, -2.0F);
/*      */     
/*  784 */     this.gunModel['¯'].addShapeBox(59.0F, 10.0F, -3.0F, 23, 9, 15, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  785 */     this.gunModel['¯'].setRotationPoint(45.0F, -86.0F, -2.5F);
/*      */     
/*  787 */     this.gunModel['°'].addShapeBox(59.0F, 10.0F, -3.0F, 5, 9, 15, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F);
/*  788 */     this.gunModel['°'].setRotationPoint(68.0F, -86.0F, -2.0F);
/*      */     
/*  790 */     this.gunModel['±'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 5, 1, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  791 */     this.gunModel['±'].setRotationPoint(45.0F, -91.0F, 11.5F);
/*      */     
/*  793 */     this.gunModel['²'].addShapeBox(59.0F, 10.0F, -3.0F, 4, 14, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  794 */     this.gunModel['²'].setRotationPoint(-34.0F, -55.25F, -8.0F);
/*      */     
/*  796 */     this.gunModel['³'].addShapeBox(59.0F, 10.0F, -3.0F, 4, 14, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  797 */     this.gunModel['³'].setRotationPoint(-38.0F, -55.25F, -8.0F);
/*      */     
/*  799 */     this.gunModel['´'].addShapeBox(59.0F, 10.0F, -3.0F, 5, 16, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  800 */     this.gunModel['´'].setRotationPoint(-43.0F, -55.25F, -8.0F);
/*      */     
/*  802 */     this.gunModel['µ'].addShapeBox(59.0F, 10.0F, -3.0F, 5, 20, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  803 */     this.gunModel['µ'].setRotationPoint(-48.0F, -55.25F, -8.0F);
/*      */     
/*  805 */     this.gunModel['¶'].addShapeBox(59.0F, 10.0F, -3.0F, 5, 37, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel['¶'].setRotationPoint(-53.0F, -55.25F, -8.0F);
/*      */     
/*  808 */     this.gunModel['·'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 33, 25, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel['·'].setRotationPoint(-53.0F, -18.25F, -8.0F);
/*      */     
/*  811 */     this.gunModel['¸'].addShapeBox(59.0F, 10.0F, -3.0F, 2, 70, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  812 */     this.gunModel['¸'].setRotationPoint(-55.0F, -55.25F, -8.0F);
/*      */     
/*  814 */     this.gunModel['¹'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 110, 25, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  815 */     this.gunModel['¹'].setRotationPoint(-77.0F, -95.25F, -8.0F);
/*      */     
/*  817 */     this.gunModel['º'].addShapeBox(59.0F, 10.0F, -3.0F, 10, 100, 25, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel['º'].setRotationPoint(-87.0F, -85.25F, -8.0F);
/*      */     
/*  820 */     this.gunModel['»'].addShapeBox(59.0F, 10.0F, -3.0F, 12, 84, 25, 0.0F, 0.0F, -23.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  821 */     this.gunModel['»'].setRotationPoint(-99.0F, -69.25F, -8.0F);
/*      */     
/*  823 */     this.gunModel['¼'].addShapeBox(59.0F, 10.0F, -3.0F, 6, 60, 25, 0.0F, -0.75F, -25.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.75F, -25.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  824 */     this.gunModel['¼'].setRotationPoint(-105.0F, -45.25F, -8.0F);
/*      */     
/*  826 */     this.gunModel['½'].addShapeBox(59.0F, 10.0F, -3.0F, 6, 33, 25, 0.0F, -1.75F, -33.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.75F, -33.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/*  827 */     this.gunModel['½'].setRotationPoint(-110.25F, -18.25F, -8.0F);
/*      */     
/*  829 */     this.gunModel['¾'].addShapeBox(59.0F, 10.0F, -3.0F, 20, 3, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  830 */     this.gunModel['¾'].setRotationPoint(-66.0F, 14.75F, -8.0F);
/*      */     
/*  832 */     this.gunModel['¿'].addShapeBox(59.0F, 10.0F, -3.0F, 9, 5, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.75F, 0.0F);
/*  833 */     this.gunModel['¿'].setRotationPoint(-75.0F, 14.75F, -8.0F);
/*      */     
/*  835 */     this.gunModel['À'].addShapeBox(59.0F, 10.0F, -3.0F, 12, 5, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  836 */     this.gunModel['À'].setRotationPoint(-87.0F, 14.75F, -8.0F);
/*      */     
/*  838 */     this.gunModel['Á'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 3, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  839 */     this.gunModel['Á'].setRotationPoint(-109.0F, 14.75F, -8.0F);
/*      */     
/*  841 */     this.gunModel['Â'].addShapeBox(59.0F, 10.0F, -3.0F, 16, 3, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  842 */     this.gunModel['Â'].setRotationPoint(-2.6F, -58.0F, -0.25F);
/*      */     
/*  844 */     this.gunModel['Ã'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel['Ã'].setRotationPoint(1.4F, -52.0F, -0.25F);
/*      */     
/*  847 */     this.gunModel['Ä'].addShapeBox(59.0F, 10.0F, -3.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  848 */     this.gunModel['Ä'].setRotationPoint(-3.6F, -58.0F, -0.25F);
/*      */     
/*  850 */     this.gunModel['Å'].addShapeBox(59.0F, 10.0F, -3.0F, 14, 3, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel['Å'].setRotationPoint(-2.6F, -55.0F, -0.25F);
/*      */     
/*  853 */     this.gunModel['Æ'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  854 */     this.gunModel['Æ'].setRotationPoint(2.4F, -47.0F, -0.25F);
/*      */     
/*  856 */     this.gunModel['Ç'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  857 */     this.gunModel['Ç'].setRotationPoint(4.4F, -42.0F, -0.25F);
/*      */     
/*  859 */     this.gunModel['È'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F);
/*  860 */     this.gunModel['È'].setRotationPoint(5.4F, -40.0F, -0.25F);
/*      */     
/*  862 */     this.gunModel['É'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 4, 10, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  863 */     this.gunModel['É'].setRotationPoint(-32.0F, -128.25F, -0.25F);
/*      */     
/*  865 */     this.gunModel['Ê'].addShapeBox(59.0F, 10.0F, -3.0F, 10, 4, 10, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  866 */     this.gunModel['Ê'].setRotationPoint(-35.0F, -124.25F, -0.25F);
/*      */     
/*  868 */     this.gunModel['Ë'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 5, 10, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel['Ë'].setRotationPoint(-42.0F, -120.25F, -0.25F);
/*      */     
/*  871 */     this.gunModel['Ì'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 5, 10, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel['Ì'].setRotationPoint(-49.0F, -123.75F, -0.25F);
/*      */     
/*  874 */     this.gunModel['Í'].addShapeBox(59.0F, 10.0F, -3.0F, 10, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel['Í'].setRotationPoint(-35.0F, -120.25F, -0.25F);
/*      */     
/*  877 */     this.gunModel['Î'].addShapeBox(59.0F, 10.0F, -3.0F, 19, 3, 10, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  878 */     this.gunModel['Î'].setRotationPoint(-69.5F, -128.75F, -0.25F);
/*      */     
/*  880 */     this.gunModel['Ï'].addShapeBox(59.0F, 10.0F, -3.0F, 6, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel['Ï'].setRotationPoint(-59.0F, -130.75F, -0.25F);
/*      */     
/*  883 */     this.gunModel['Ð'].addShapeBox(59.0F, 10.0F, -3.0F, 6, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  884 */     this.gunModel['Ð'].setRotationPoint(-65.0F, -130.75F, -0.25F);
/*      */     
/*  886 */     this.gunModel['Ñ'].addShapeBox(59.0F, 10.0F, -3.0F, 4, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  887 */     this.gunModel['Ñ'].setRotationPoint(-69.0F, -130.75F, -0.25F);
/*      */     
/*  889 */     this.gunModel['Ò'].addShapeBox(59.0F, 10.0F, -3.0F, 2, 4, 10, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  890 */     this.gunModel['Ò'].setRotationPoint(-71.0F, -129.75F, -0.25F);
/*      */     
/*  892 */     this.gunModel['Ó'].addShapeBox(59.0F, 10.0F, -3.0F, 16, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  893 */     this.gunModel['Ó'].setRotationPoint(-71.0F, -125.75F, -0.25F);
/*      */     
/*  895 */     this.gunModel['Ô'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 2, 10, 0.0F, -1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  896 */     this.gunModel['Ô'].setRotationPoint(-56.0F, -125.75F, -0.25F);
/*      */     
/*  898 */     this.gunModel['Õ'].addShapeBox(59.0F, 10.0F, -3.0F, 7, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -5.0F, 0.0F);
/*  899 */     this.gunModel['Õ'].setRotationPoint(-49.0F, -118.75F, -0.25F);
/*      */     
/*  901 */     this.gunModel['Ö'].addShapeBox(59.0F, 10.0F, -3.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  902 */     this.gunModel['Ö'].setRotationPoint(-42.0F, -115.25F, -0.25F);
/*      */     
/*  904 */     this.gunModel['×'].addShapeBox(59.0F, 10.0F, -3.0F, 9, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel['×'].setRotationPoint(-40.0F, -113.25F, -0.25F);
/*      */     
/*  907 */     this.gunModel['Ø'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel['Ø'].setRotationPoint(-40.0F, -110.25F, -0.25F);
/*      */     
/*  910 */     this.gunModel['Ù'].addShapeBox(59.0F, 10.0F, -3.0F, 5, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  911 */     this.gunModel['Ù'].setRotationPoint(-40.0F, -115.25F, -0.25F);
/*      */     
/*  913 */     this.gunModel['Ú'].addShapeBox(59.0F, 10.0F, -3.0F, 12, 7, 10, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  914 */     this.gunModel['Ú'].setRotationPoint(-47.0F, -107.25F, -0.25F);
/*      */     
/*  916 */     this.gunModel['Û'].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  917 */     this.gunModel['Û'].setRotationPoint(-3.0F, -67.0F, -6.25F);
/*      */     
/*  919 */     this.gunModel['Ü'].addShapeBox(59.0F, 10.0F, -3.0F, 73, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  920 */     this.gunModel['Ü'].setRotationPoint(-3.0F, -64.0F, -6.25F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/*  925 */     this.ammoModel[0] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  926 */     this.ammoModel[1] = new ModelRendererTurbo(this, 921, 89, this.textureX, this.textureY);
/*  927 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1001, 89, this.textureX, this.textureY);
/*  928 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1705, 57, this.textureX, this.textureY);
/*  929 */     this.ammoModel[4] = new ModelRendererTurbo(this, 969, 73, this.textureX, this.textureY);
/*  930 */     this.ammoModel[5] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/*  931 */     this.ammoModel[6] = new ModelRendererTurbo(this, 625, 97, this.textureX, this.textureY);
/*  932 */     this.ammoModel[7] = new ModelRendererTurbo(this, 1361, 97, this.textureX, this.textureY);
/*  933 */     this.ammoModel[8] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  934 */     this.ammoModel[9] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  935 */     this.ammoModel[10] = new ModelRendererTurbo(this, 289, 105, this.textureX, this.textureY);
/*  936 */     this.ammoModel[11] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/*  937 */     this.ammoModel[12] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/*  938 */     this.ammoModel[13] = new ModelRendererTurbo(this, 529, 105, this.textureX, this.textureY);
/*  939 */     this.ammoModel[14] = new ModelRendererTurbo(this, 609, 105, this.textureX, this.textureY);
/*  940 */     this.ammoModel[15] = new ModelRendererTurbo(this, 2025, 1, this.textureX, this.textureY);
/*  941 */     this.ammoModel[16] = new ModelRendererTurbo(this, 865, 9, this.textureX, this.textureY);
/*  942 */     this.ammoModel[17] = new ModelRendererTurbo(this, 1233, 9, this.textureX, this.textureY);
/*  943 */     this.ammoModel[18] = new ModelRendererTurbo(this, 2025, 9, this.textureX, this.textureY);
/*  944 */     this.ammoModel[19] = new ModelRendererTurbo(this, 865, 17, this.textureX, this.textureY);
/*  945 */     this.ammoModel[20] = new ModelRendererTurbo(this, 1089, 25, this.textureX, this.textureY);
/*  946 */     this.ammoModel[21] = new ModelRendererTurbo(this, 1193, 25, this.textureX, this.textureY);
/*  947 */     this.ammoModel[22] = new ModelRendererTurbo(this, 1745, 25, this.textureX, this.textureY);
/*  948 */     this.ammoModel[23] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*  949 */     this.ammoModel[24] = new ModelRendererTurbo(this, 2041, 1, this.textureX, this.textureY);
/*  950 */     this.ammoModel[25] = new ModelRendererTurbo(this, 1073, 9, this.textureX, this.textureY);
/*  951 */     this.ammoModel[26] = new ModelRendererTurbo(this, 2041, 9, this.textureX, this.textureY);
/*  952 */     this.ammoModel[27] = new ModelRendererTurbo(this, 1961, 25, this.textureX, this.textureY);
/*  953 */     this.ammoModel[28] = new ModelRendererTurbo(this, 2033, 25, this.textureX, this.textureY);
/*  954 */     this.ammoModel[29] = new ModelRendererTurbo(this, 985, 33, this.textureX, this.textureY);
/*  955 */     this.ammoModel[30] = new ModelRendererTurbo(this, 1193, 33, this.textureX, this.textureY);
/*  956 */     this.ammoModel[31] = new ModelRendererTurbo(this, 2033, 33, this.textureX, this.textureY);
/*  957 */     this.ammoModel[32] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*  958 */     this.ammoModel[33] = new ModelRendererTurbo(this, 1089, 41, this.textureX, this.textureY);
/*  959 */     this.ammoModel[34] = new ModelRendererTurbo(this, 1201, 41, this.textureX, this.textureY);
/*  960 */     this.ammoModel[35] = new ModelRendererTurbo(this, 1569, 41, this.textureX, this.textureY);
/*  961 */     this.ammoModel[36] = new ModelRendererTurbo(this, 1553, 81, this.textureX, this.textureY);
/*  962 */     this.ammoModel[37] = new ModelRendererTurbo(this, 1073, 97, this.textureX, this.textureY);
/*  963 */     this.ammoModel[38] = new ModelRendererTurbo(this, 1097, 97, this.textureX, this.textureY);
/*  964 */     this.ammoModel[39] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/*  965 */     this.ammoModel[40] = new ModelRendererTurbo(this, 1113, 97, this.textureX, this.textureY);
/*  966 */     this.ammoModel[41] = new ModelRendererTurbo(this, 1129, 97, this.textureX, this.textureY);
/*  967 */     this.ammoModel[42] = new ModelRendererTurbo(this, 1993, 65, this.textureX, this.textureY);
/*  968 */     this.ammoModel[43] = new ModelRendererTurbo(this, 2017, 65, this.textureX, this.textureY);
/*  969 */     this.ammoModel[44] = new ModelRendererTurbo(this, 689, 73, this.textureX, this.textureY);
/*  970 */     this.ammoModel[45] = new ModelRendererTurbo(this, 713, 73, this.textureX, this.textureY);
/*  971 */     this.ammoModel[46] = new ModelRendererTurbo(this, 737, 73, this.textureX, this.textureY);
/*  972 */     this.ammoModel[47] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/*  973 */     this.ammoModel[48] = new ModelRendererTurbo(this, 185, 105, this.textureX, this.textureY);
/*  974 */     this.ammoModel[49] = new ModelRendererTurbo(this, 929, 105, this.textureX, this.textureY);
/*  975 */     this.ammoModel[50] = new ModelRendererTurbo(this, 953, 105, this.textureX, this.textureY);
/*  976 */     this.ammoModel[51] = new ModelRendererTurbo(this, 977, 105, this.textureX, this.textureY);
/*  977 */     this.ammoModel[52] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/*  978 */     this.ammoModel[53] = new ModelRendererTurbo(this, 1025, 105, this.textureX, this.textureY);
/*  979 */     this.ammoModel[54] = new ModelRendererTurbo(this, 1545, 97, this.textureX, this.textureY);
/*  980 */     this.ammoModel[55] = new ModelRendererTurbo(this, 1145, 105, this.textureX, this.textureY);
/*  981 */     this.ammoModel[56] = new ModelRendererTurbo(this, 1225, 105, this.textureX, this.textureY);
/*  982 */     this.ammoModel[57] = new ModelRendererTurbo(this, 1305, 105, this.textureX, this.textureY);
/*  983 */     this.ammoModel[58] = new ModelRendererTurbo(this, 1385, 105, this.textureX, this.textureY);
/*  984 */     this.ammoModel[59] = new ModelRendererTurbo(this, 1465, 105, this.textureX, this.textureY);
/*  985 */     this.ammoModel[60] = new ModelRendererTurbo(this, 1761, 105, this.textureX, this.textureY);
/*  986 */     this.ammoModel[61] = new ModelRendererTurbo(this, 1841, 105, this.textureX, this.textureY);
/*  987 */     this.ammoModel[62] = new ModelRendererTurbo(this, 1921, 105, this.textureX, this.textureY);
/*  988 */     this.ammoModel[63] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  989 */     this.ammoModel[64] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  990 */     this.ammoModel[65] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  991 */     this.ammoModel[66] = new ModelRendererTurbo(this, 241, 113, this.textureX, this.textureY);
/*  992 */     this.ammoModel[67] = new ModelRendererTurbo(this, 1585, 41, this.textureX, this.textureY);
/*  993 */     this.ammoModel[68] = new ModelRendererTurbo(this, 2033, 41, this.textureX, this.textureY);
/*  994 */     this.ammoModel[69] = new ModelRendererTurbo(this, 777, 49, this.textureX, this.textureY);
/*  995 */     this.ammoModel[70] = new ModelRendererTurbo(this, 953, 49, this.textureX, this.textureY);
/*  996 */     this.ammoModel[71] = new ModelRendererTurbo(this, 1305, 49, this.textureX, this.textureY);
/*  997 */     this.ammoModel[72] = new ModelRendererTurbo(this, 1505, 49, this.textureX, this.textureY);
/*  998 */     this.ammoModel[73] = new ModelRendererTurbo(this, 1569, 57, this.textureX, this.textureY);
/*  999 */     this.ammoModel[74] = new ModelRendererTurbo(this, 857, 65, this.textureX, this.textureY);
/* 1000 */     this.ammoModel[75] = new ModelRendererTurbo(this, 1849, 17, this.textureX, this.textureY);
/* 1001 */     this.ammoModel[76] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/* 1002 */     this.ammoModel[77] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/* 1003 */     this.ammoModel[78] = new ModelRendererTurbo(this, 785, 41, this.textureX, this.textureY);
/* 1004 */     this.ammoModel[79] = new ModelRendererTurbo(this, 1153, 65, this.textureX, this.textureY);
/* 1005 */     this.ammoModel[80] = new ModelRendererTurbo(this, 1361, 65, this.textureX, this.textureY);
/* 1006 */     this.ammoModel[81] = new ModelRendererTurbo(this, 1865, 73, this.textureX, this.textureY);
/* 1007 */     this.ammoModel[82] = new ModelRendererTurbo(this, 1153, 81, this.textureX, this.textureY);
/* 1008 */     this.ammoModel[83] = new ModelRendererTurbo(this, 1977, 81, this.textureX, this.textureY);
/* 1009 */     this.ammoModel[84] = new ModelRendererTurbo(this, 809, 89, this.textureX, this.textureY);
/* 1010 */     this.ammoModel[85] = new ModelRendererTurbo(this, 1145, 97, this.textureX, this.textureY);
/* 1011 */     this.ammoModel[86] = new ModelRendererTurbo(this, 1857, 97, this.textureX, this.textureY);
/* 1012 */     this.ammoModel[87] = new ModelRendererTurbo(this, 689, 105, this.textureX, this.textureY);
/* 1013 */     this.ammoModel[88] = new ModelRendererTurbo(this, 1049, 105, this.textureX, this.textureY);
/* 1014 */     this.ammoModel[89] = new ModelRendererTurbo(this, 689, 105, this.textureX, this.textureY);
/* 1015 */     this.ammoModel[90] = new ModelRendererTurbo(this, 2001, 105, this.textureX, this.textureY);
/* 1016 */     this.ammoModel[91] = new ModelRendererTurbo(this, 2017, 105, this.textureX, this.textureY);
/* 1017 */     this.ammoModel[92] = new ModelRendererTurbo(this, 2033, 105, this.textureX, this.textureY);
/* 1018 */     this.ammoModel[93] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/* 1019 */     this.ammoModel[94] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/* 1020 */     this.ammoModel[95] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/* 1021 */     this.ammoModel[96] = new ModelRendererTurbo(this, 393, 113, this.textureX, this.textureY);
/* 1022 */     this.ammoModel[97] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/* 1023 */     this.ammoModel[98] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/* 1024 */     this.ammoModel[99] = new ModelRendererTurbo(this, 465, 113, this.textureX, this.textureY);
/* 1025 */     this.ammoModel[100] = new ModelRendererTurbo(this, 489, 113, this.textureX, this.textureY);
/* 1026 */     this.ammoModel[101] = new ModelRendererTurbo(this, 513, 113, this.textureX, this.textureY);
/* 1027 */     this.ammoModel[102] = new ModelRendererTurbo(this, 537, 113, this.textureX, this.textureY);
/* 1028 */     this.ammoModel[103] = new ModelRendererTurbo(this, 561, 113, this.textureX, this.textureY);
/* 1029 */     this.ammoModel[104] = new ModelRendererTurbo(this, 585, 113, this.textureX, this.textureY);
/* 1030 */     this.ammoModel[105] = new ModelRendererTurbo(this, 609, 113, this.textureX, this.textureY);
/* 1031 */     this.ammoModel[106] = new ModelRendererTurbo(this, 713, 113, this.textureX, this.textureY);
/* 1032 */     this.ammoModel[107] = new ModelRendererTurbo(this, 793, 113, this.textureX, this.textureY);
/* 1033 */     this.ammoModel[108] = new ModelRendererTurbo(this, 873, 113, this.textureX, this.textureY);
/* 1034 */     this.ammoModel[109] = new ModelRendererTurbo(this, 953, 113, this.textureX, this.textureY);
/* 1035 */     this.ammoModel[110] = new ModelRendererTurbo(this, 1065, 113, this.textureX, this.textureY);
/* 1036 */     this.ammoModel[111] = new ModelRendererTurbo(this, 1145, 113, this.textureX, this.textureY);
/* 1037 */     this.ammoModel[112] = new ModelRendererTurbo(this, 1225, 113, this.textureX, this.textureY);
/* 1038 */     this.ammoModel[113] = new ModelRendererTurbo(this, 1305, 113, this.textureX, this.textureY);
/* 1039 */     this.ammoModel[114] = new ModelRendererTurbo(this, 1385, 113, this.textureX, this.textureY);
/* 1040 */     this.ammoModel[115] = new ModelRendererTurbo(this, 1465, 113, this.textureX, this.textureY);
/* 1041 */     this.ammoModel[116] = new ModelRendererTurbo(this, 1545, 113, this.textureX, this.textureY);
/* 1042 */     this.ammoModel[117] = new ModelRendererTurbo(this, 1625, 113, this.textureX, this.textureY);
/* 1043 */     this.ammoModel[118] = new ModelRendererTurbo(this, 633, 113, this.textureX, this.textureY);
/* 1044 */     this.ammoModel[119] = new ModelRendererTurbo(this, 649, 113, this.textureX, this.textureY);
/* 1045 */     this.ammoModel[120] = new ModelRendererTurbo(this, 665, 113, this.textureX, this.textureY);
/* 1046 */     this.ammoModel[121] = new ModelRendererTurbo(this, 1033, 113, this.textureX, this.textureY);
/* 1047 */     this.ammoModel[122] = new ModelRendererTurbo(this, 1705, 113, this.textureX, this.textureY);
/* 1048 */     this.ammoModel[123] = new ModelRendererTurbo(this, 1721, 113, this.textureX, this.textureY);
/* 1049 */     this.ammoModel[124] = new ModelRendererTurbo(this, 1737, 113, this.textureX, this.textureY);
/* 1050 */     this.ammoModel[125] = new ModelRendererTurbo(this, 1753, 113, this.textureX, this.textureY);
/* 1051 */     this.ammoModel[126] = new ModelRendererTurbo(this, 1305, 41, this.textureX, this.textureY);
/* 1052 */     this.ammoModel[127] = new ModelRendererTurbo(this, 1513, 41, this.textureX, this.textureY);
/* 1053 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1977, 41, this.textureX, this.textureY);
/* 1054 */     this.ammoModel[''] = new ModelRendererTurbo(this, 577, 49, this.textureX, this.textureY);
/* 1055 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1769, 113, this.textureX, this.textureY);
/* 1056 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1785, 113, this.textureX, this.textureY);
/* 1057 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1801, 113, this.textureX, this.textureY);
/* 1058 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1817, 113, this.textureX, this.textureY);
/* 1059 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1833, 113, this.textureX, this.textureY);
/* 1060 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1849, 113, this.textureX, this.textureY);
/* 1061 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1865, 113, this.textureX, this.textureY);
/* 1062 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1881, 113, this.textureX, this.textureY);
/* 1063 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1897, 113, this.textureX, this.textureY);
/* 1064 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1913, 113, this.textureX, this.textureY);
/* 1065 */     this.ammoModel[''] = new ModelRendererTurbo(this, 633, 113, this.textureX, this.textureY);
/* 1066 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1929, 113, this.textureX, this.textureY);
/* 1067 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1945, 113, this.textureX, this.textureY);
/* 1068 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1961, 113, this.textureX, this.textureY);
/* 1069 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1977, 113, this.textureX, this.textureY);
/* 1070 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/* 1071 */     this.ammoModel[''] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/* 1072 */     this.ammoModel[''] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/* 1073 */     this.ammoModel[''] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/* 1074 */     this.ammoModel[''] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/* 1075 */     this.ammoModel[''] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/* 1076 */     this.ammoModel[''] = new ModelRendererTurbo(this, 145, 121, this.textureX, this.textureY);
/* 1077 */     this.ammoModel[''] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/* 1078 */     this.ammoModel[''] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/* 1079 */     this.ammoModel[''] = new ModelRendererTurbo(this, 217, 121, this.textureX, this.textureY);
/* 1080 */     this.ammoModel[''] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/* 1081 */     this.ammoModel[''] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/* 1082 */     this.ammoModel[''] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/* 1083 */     this.ammoModel[''] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/* 1084 */     this.ammoModel[''] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/* 1085 */     this.ammoModel[' '] = new ModelRendererTurbo(this, 529, 121, this.textureX, this.textureY);
/* 1086 */     this.ammoModel['¡'] = new ModelRendererTurbo(this, 657, 121, this.textureX, this.textureY);
/* 1087 */     this.ammoModel['¢'] = new ModelRendererTurbo(this, 737, 121, this.textureX, this.textureY);
/* 1088 */     this.ammoModel['£'] = new ModelRendererTurbo(this, 817, 121, this.textureX, this.textureY);
/* 1089 */     this.ammoModel['¤'] = new ModelRendererTurbo(this, 897, 121, this.textureX, this.textureY);
/* 1090 */     this.ammoModel['¥'] = new ModelRendererTurbo(this, 977, 121, this.textureX, this.textureY);
/* 1091 */     this.ammoModel['¦'] = new ModelRendererTurbo(this, 1057, 121, this.textureX, this.textureY);
/* 1092 */     this.ammoModel['§'] = new ModelRendererTurbo(this, 1137, 121, this.textureX, this.textureY);
/* 1093 */     this.ammoModel['¨'] = new ModelRendererTurbo(this, 1217, 121, this.textureX, this.textureY);
/* 1094 */     this.ammoModel['©'] = new ModelRendererTurbo(this, 1297, 121, this.textureX, this.textureY);
/* 1095 */     this.ammoModel['ª'] = new ModelRendererTurbo(this, 1313, 121, this.textureX, this.textureY);
/* 1096 */     this.ammoModel['«'] = new ModelRendererTurbo(this, 1329, 121, this.textureX, this.textureY);
/* 1097 */     this.ammoModel['¬'] = new ModelRendererTurbo(this, 1345, 121, this.textureX, this.textureY);
/* 1098 */     this.ammoModel['­'] = new ModelRendererTurbo(this, 1361, 121, this.textureX, this.textureY);
/* 1099 */     this.ammoModel['®'] = new ModelRendererTurbo(this, 1377, 121, this.textureX, this.textureY);
/* 1100 */     this.ammoModel['¯'] = new ModelRendererTurbo(this, 1393, 121, this.textureX, this.textureY);
/* 1101 */     this.ammoModel['°'] = new ModelRendererTurbo(this, 1409, 121, this.textureX, this.textureY);
/* 1102 */     this.ammoModel['±'] = new ModelRendererTurbo(this, 2041, 49, this.textureX, this.textureY);
/* 1103 */     this.ammoModel['²'] = new ModelRendererTurbo(this, 1057, 57, this.textureX, this.textureY);
/* 1104 */     this.ammoModel['³'] = new ModelRendererTurbo(this, 1161, 57, this.textureX, this.textureY);
/* 1105 */     this.ammoModel['´'] = new ModelRendererTurbo(this, 1465, 65, this.textureX, this.textureY);
/* 1106 */     this.ammoModel['µ'] = new ModelRendererTurbo(this, 1425, 121, this.textureX, this.textureY);
/* 1107 */     this.ammoModel['¶'] = new ModelRendererTurbo(this, 1441, 121, this.textureX, this.textureY);
/* 1108 */     this.ammoModel['·'] = new ModelRendererTurbo(this, 1457, 121, this.textureX, this.textureY);
/* 1109 */     this.ammoModel['¸'] = new ModelRendererTurbo(this, 1473, 121, this.textureX, this.textureY);
/* 1110 */     this.ammoModel['¹'] = new ModelRendererTurbo(this, 1489, 121, this.textureX, this.textureY);
/* 1111 */     this.ammoModel['º'] = new ModelRendererTurbo(this, 1505, 121, this.textureX, this.textureY);
/* 1112 */     this.ammoModel['»'] = new ModelRendererTurbo(this, 1521, 121, this.textureX, this.textureY);
/* 1113 */     this.ammoModel['¼'] = new ModelRendererTurbo(this, 1537, 121, this.textureX, this.textureY);
/* 1114 */     this.ammoModel['½'] = new ModelRendererTurbo(this, 1553, 121, this.textureX, this.textureY);
/* 1115 */     this.ammoModel['¾'] = new ModelRendererTurbo(this, 1569, 121, this.textureX, this.textureY);
/* 1116 */     this.ammoModel['¿'] = new ModelRendererTurbo(this, 1705, 113, this.textureX, this.textureY);
/* 1117 */     this.ammoModel['À'] = new ModelRendererTurbo(this, 1585, 121, this.textureX, this.textureY);
/* 1118 */     this.ammoModel['Á'] = new ModelRendererTurbo(this, 1601, 121, this.textureX, this.textureY);
/* 1119 */     this.ammoModel['Â'] = new ModelRendererTurbo(this, 1617, 121, this.textureX, this.textureY);
/* 1120 */     this.ammoModel['Ã'] = new ModelRendererTurbo(this, 1633, 121, this.textureX, this.textureY);
/* 1121 */     this.ammoModel['Ä'] = new ModelRendererTurbo(this, 1657, 121, this.textureX, this.textureY);
/* 1122 */     this.ammoModel['Å'] = new ModelRendererTurbo(this, 1681, 121, this.textureX, this.textureY);
/* 1123 */     this.ammoModel['Æ'] = new ModelRendererTurbo(this, 1729, 121, this.textureX, this.textureY);
/* 1124 */     this.ammoModel['Ç'] = new ModelRendererTurbo(this, 1753, 121, this.textureX, this.textureY);
/* 1125 */     this.ammoModel['È'] = new ModelRendererTurbo(this, 1777, 121, this.textureX, this.textureY);
/* 1126 */     this.ammoModel['É'] = new ModelRendererTurbo(this, 1801, 121, this.textureX, this.textureY);
/* 1127 */     this.ammoModel['Ê'] = new ModelRendererTurbo(this, 1825, 121, this.textureX, this.textureY);
/* 1128 */     this.ammoModel['Ë'] = new ModelRendererTurbo(this, 1849, 121, this.textureX, this.textureY);
/* 1129 */     this.ammoModel['Ì'] = new ModelRendererTurbo(this, 1873, 121, this.textureX, this.textureY);
/* 1130 */     this.ammoModel['Í'] = new ModelRendererTurbo(this, 1977, 121, this.textureX, this.textureY);
/* 1131 */     this.ammoModel['Î'] = new ModelRendererTurbo(this, 2001, 121, this.textureX, this.textureY);
/* 1132 */     this.ammoModel['Ï'] = new ModelRendererTurbo(this, 1897, 121, this.textureX, this.textureY);
/* 1133 */     this.ammoModel['Ð'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 1134 */     this.ammoModel['Ñ'] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/* 1135 */     this.ammoModel['Ò'] = new ModelRendererTurbo(this, 161, 129, this.textureX, this.textureY);
/* 1136 */     this.ammoModel['Ó'] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/* 1137 */     this.ammoModel['Ô'] = new ModelRendererTurbo(this, 369, 129, this.textureX, this.textureY);
/* 1138 */     this.ammoModel['Õ'] = new ModelRendererTurbo(this, 449, 129, this.textureX, this.textureY);
/* 1139 */     this.ammoModel['Ö'] = new ModelRendererTurbo(this, 529, 129, this.textureX, this.textureY);
/* 1140 */     this.ammoModel['×'] = new ModelRendererTurbo(this, 609, 129, this.textureX, this.textureY);
/* 1141 */     this.ammoModel['Ø'] = new ModelRendererTurbo(this, 689, 129, this.textureX, this.textureY);
/* 1142 */     this.ammoModel['Ù'] = new ModelRendererTurbo(this, 769, 129, this.textureX, this.textureY);
/* 1143 */     this.ammoModel['Ú'] = new ModelRendererTurbo(this, 849, 129, this.textureX, this.textureY);
/* 1144 */     this.ammoModel['Û'] = new ModelRendererTurbo(this, 929, 129, this.textureX, this.textureY);
/* 1145 */     this.ammoModel['Ü'] = new ModelRendererTurbo(this, 2025, 121, this.textureX, this.textureY);
/* 1146 */     this.ammoModel['Ý'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/* 1147 */     this.ammoModel['Þ'] = new ModelRendererTurbo(this, 1009, 129, this.textureX, this.textureY);
/* 1148 */     this.ammoModel['ß'] = new ModelRendererTurbo(this, 1025, 129, this.textureX, this.textureY);
/* 1149 */     this.ammoModel['à'] = new ModelRendererTurbo(this, 1041, 129, this.textureX, this.textureY);
/* 1150 */     this.ammoModel['á'] = new ModelRendererTurbo(this, 1057, 129, this.textureX, this.textureY);
/* 1151 */     this.ammoModel['â'] = new ModelRendererTurbo(this, 1073, 129, this.textureX, this.textureY);
/* 1152 */     this.ammoModel['ã'] = new ModelRendererTurbo(this, 1089, 129, this.textureX, this.textureY);
/* 1153 */     this.ammoModel['ä'] = new ModelRendererTurbo(this, 1873, 65, this.textureX, this.textureY);
/* 1154 */     this.ammoModel['å'] = new ModelRendererTurbo(this, 1977, 65, this.textureX, this.textureY);
/* 1155 */     this.ammoModel['æ'] = new ModelRendererTurbo(this, 1985, 65, this.textureX, this.textureY);
/* 1156 */     this.ammoModel['ç'] = new ModelRendererTurbo(this, 2041, 65, this.textureX, this.textureY);
/* 1157 */     this.ammoModel['è'] = new ModelRendererTurbo(this, 1105, 129, this.textureX, this.textureY);
/* 1158 */     this.ammoModel['é'] = new ModelRendererTurbo(this, 1121, 129, this.textureX, this.textureY);
/* 1159 */     this.ammoModel['ê'] = new ModelRendererTurbo(this, 1137, 129, this.textureX, this.textureY);
/* 1160 */     this.ammoModel['ë'] = new ModelRendererTurbo(this, 1153, 129, this.textureX, this.textureY);
/* 1161 */     this.ammoModel['ì'] = new ModelRendererTurbo(this, 1169, 129, this.textureX, this.textureY);
/* 1162 */     this.ammoModel['í'] = new ModelRendererTurbo(this, 1185, 129, this.textureX, this.textureY);
/* 1163 */     this.ammoModel['î'] = new ModelRendererTurbo(this, 1201, 129, this.textureX, this.textureY);
/* 1164 */     this.ammoModel['ï'] = new ModelRendererTurbo(this, 1217, 129, this.textureX, this.textureY);
/* 1165 */     this.ammoModel['ð'] = new ModelRendererTurbo(this, 1233, 129, this.textureX, this.textureY);
/* 1166 */     this.ammoModel['ñ'] = new ModelRendererTurbo(this, 1249, 129, this.textureX, this.textureY);
/* 1167 */     this.ammoModel['ò'] = new ModelRendererTurbo(this, 1297, 121, this.textureX, this.textureY);
/* 1168 */     this.ammoModel['ó'] = new ModelRendererTurbo(this, 1265, 129, this.textureX, this.textureY);
/* 1169 */     this.ammoModel['ô'] = new ModelRendererTurbo(this, 1281, 129, this.textureX, this.textureY);
/* 1170 */     this.ammoModel['õ'] = new ModelRendererTurbo(this, 1313, 129, this.textureX, this.textureY);
/* 1171 */     this.ammoModel['ö'] = new ModelRendererTurbo(this, 1329, 129, this.textureX, this.textureY);
/* 1172 */     this.ammoModel['÷'] = new ModelRendererTurbo(this, 1353, 129, this.textureX, this.textureY);
/* 1173 */     this.ammoModel['ø'] = new ModelRendererTurbo(this, 1377, 129, this.textureX, this.textureY);
/* 1174 */     this.ammoModel['ù'] = new ModelRendererTurbo(this, 1401, 129, this.textureX, this.textureY);
/* 1175 */     this.ammoModel['ú'] = new ModelRendererTurbo(this, 1425, 129, this.textureX, this.textureY);
/* 1176 */     this.ammoModel['û'] = new ModelRendererTurbo(this, 1449, 129, this.textureX, this.textureY);
/* 1177 */     this.ammoModel['ü'] = new ModelRendererTurbo(this, 1473, 129, this.textureX, this.textureY);
/* 1178 */     this.ammoModel['ý'] = new ModelRendererTurbo(this, 1497, 129, this.textureX, this.textureY);
/* 1179 */     this.ammoModel['þ'] = new ModelRendererTurbo(this, 1521, 129, this.textureX, this.textureY);
/* 1180 */     this.ammoModel['ÿ'] = new ModelRendererTurbo(this, 1545, 129, this.textureX, this.textureY);
/* 1181 */     this.ammoModel['Ā'] = new ModelRendererTurbo(this, 1633, 129, this.textureX, this.textureY);
/* 1182 */     this.ammoModel['ā'] = new ModelRendererTurbo(this, 1657, 129, this.textureX, this.textureY);
/* 1183 */     this.ammoModel['Ă'] = new ModelRendererTurbo(this, 1681, 129, this.textureX, this.textureY);
/* 1184 */     this.ammoModel['ă'] = new ModelRendererTurbo(this, 1705, 129, this.textureX, this.textureY);
/* 1185 */     this.ammoModel['Ą'] = new ModelRendererTurbo(this, 1785, 129, this.textureX, this.textureY);
/* 1186 */     this.ammoModel['ą'] = new ModelRendererTurbo(this, 1921, 129, this.textureX, this.textureY);
/* 1187 */     this.ammoModel['Ć'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 1188 */     this.ammoModel['ć'] = new ModelRendererTurbo(this, 81, 137, this.textureX, this.textureY);
/* 1189 */     this.ammoModel['Ĉ'] = new ModelRendererTurbo(this, 161, 137, this.textureX, this.textureY);
/* 1190 */     this.ammoModel['ĉ'] = new ModelRendererTurbo(this, 241, 137, this.textureX, this.textureY);
/* 1191 */     this.ammoModel['Ċ'] = new ModelRendererTurbo(this, 321, 137, this.textureX, this.textureY);
/* 1192 */     this.ammoModel['ċ'] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/* 1193 */     this.ammoModel['Č'] = new ModelRendererTurbo(this, 481, 137, this.textureX, this.textureY);
/* 1194 */     this.ammoModel['č'] = new ModelRendererTurbo(this, 561, 137, this.textureX, this.textureY);
/* 1195 */     this.ammoModel['Ď'] = new ModelRendererTurbo(this, 641, 137, this.textureX, this.textureY);
/* 1196 */     this.ammoModel['ď'] = new ModelRendererTurbo(this, 1865, 129, this.textureX, this.textureY);
/* 1197 */     this.ammoModel['Đ'] = new ModelRendererTurbo(this, 1881, 129, this.textureX, this.textureY);
/* 1198 */     this.ammoModel['đ'] = new ModelRendererTurbo(this, 2001, 129, this.textureX, this.textureY);
/* 1199 */     this.ammoModel['Ē'] = new ModelRendererTurbo(this, 2017, 129, this.textureX, this.textureY);
/* 1200 */     this.ammoModel['ē'] = new ModelRendererTurbo(this, 2033, 129, this.textureX, this.textureY);
/* 1201 */     this.ammoModel['Ĕ'] = new ModelRendererTurbo(this, 721, 137, this.textureX, this.textureY);
/* 1202 */     this.ammoModel['ĕ'] = new ModelRendererTurbo(this, 737, 137, this.textureX, this.textureY);
/* 1203 */     this.ammoModel['Ė'] = new ModelRendererTurbo(this, 753, 137, this.textureX, this.textureY);
/* 1204 */     this.ammoModel['ė'] = new ModelRendererTurbo(this, 1049, 73, this.textureX, this.textureY);
/* 1205 */     this.ammoModel['Ę'] = new ModelRendererTurbo(this, 1761, 73, this.textureX, this.textureY);
/* 1206 */     this.ammoModel['ę'] = new ModelRendererTurbo(this, 2041, 73, this.textureX, this.textureY);
/* 1207 */     this.ammoModel['Ě'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 1208 */     this.ammoModel['ě'] = new ModelRendererTurbo(this, 769, 137, this.textureX, this.textureY);
/* 1209 */     this.ammoModel['Ĝ'] = new ModelRendererTurbo(this, 785, 137, this.textureX, this.textureY);
/* 1210 */     this.ammoModel['ĝ'] = new ModelRendererTurbo(this, 801, 137, this.textureX, this.textureY);
/* 1211 */     this.ammoModel['Ğ'] = new ModelRendererTurbo(this, 817, 137, this.textureX, this.textureY);
/* 1212 */     this.ammoModel['ğ'] = new ModelRendererTurbo(this, 833, 137, this.textureX, this.textureY);
/* 1213 */     this.ammoModel['Ġ'] = new ModelRendererTurbo(this, 865, 137, this.textureX, this.textureY);
/* 1214 */     this.ammoModel['ġ'] = new ModelRendererTurbo(this, 881, 137, this.textureX, this.textureY);
/* 1215 */     this.ammoModel['Ģ'] = new ModelRendererTurbo(this, 897, 137, this.textureX, this.textureY);
/* 1216 */     this.ammoModel['ģ'] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/* 1217 */     this.ammoModel['Ĥ'] = new ModelRendererTurbo(this, 1009, 129, this.textureX, this.textureY);
/* 1218 */     this.ammoModel['ĥ'] = new ModelRendererTurbo(this, 929, 137, this.textureX, this.textureY);
/* 1219 */     this.ammoModel['Ħ'] = new ModelRendererTurbo(this, 945, 137, this.textureX, this.textureY);
/* 1220 */     this.ammoModel['ħ'] = new ModelRendererTurbo(this, 961, 137, this.textureX, this.textureY);
/* 1221 */     this.ammoModel['Ĩ'] = new ModelRendererTurbo(this, 977, 137, this.textureX, this.textureY);
/* 1222 */     this.ammoModel['ĩ'] = new ModelRendererTurbo(this, 1033, 137, this.textureX, this.textureY);
/* 1223 */     this.ammoModel['Ī'] = new ModelRendererTurbo(this, 1057, 137, this.textureX, this.textureY);
/* 1224 */     this.ammoModel['ī'] = new ModelRendererTurbo(this, 1081, 137, this.textureX, this.textureY);
/* 1225 */     this.ammoModel['Ĭ'] = new ModelRendererTurbo(this, 1105, 137, this.textureX, this.textureY);
/* 1226 */     this.ammoModel['ĭ'] = new ModelRendererTurbo(this, 1129, 137, this.textureX, this.textureY);
/* 1227 */     this.ammoModel['Į'] = new ModelRendererTurbo(this, 1153, 137, this.textureX, this.textureY);
/* 1228 */     this.ammoModel['į'] = new ModelRendererTurbo(this, 1177, 137, this.textureX, this.textureY);
/* 1229 */     this.ammoModel['İ'] = new ModelRendererTurbo(this, 1201, 137, this.textureX, this.textureY);
/* 1230 */     this.ammoModel['ı'] = new ModelRendererTurbo(this, 1225, 137, this.textureX, this.textureY);
/* 1231 */     this.ammoModel['Ĳ'] = new ModelRendererTurbo(this, 1329, 137, this.textureX, this.textureY);
/* 1232 */     this.ammoModel['ĳ'] = new ModelRendererTurbo(this, 1353, 137, this.textureX, this.textureY);
/* 1233 */     this.ammoModel['Ĵ'] = new ModelRendererTurbo(this, 1297, 137, this.textureX, this.textureY);
/* 1234 */     this.ammoModel['ĵ'] = new ModelRendererTurbo(this, 1377, 137, this.textureX, this.textureY);
/* 1235 */     this.ammoModel['Ķ'] = new ModelRendererTurbo(this, 1465, 137, this.textureX, this.textureY);
/* 1236 */     this.ammoModel['ķ'] = new ModelRendererTurbo(this, 1545, 137, this.textureX, this.textureY);
/* 1237 */     this.ammoModel['ĸ'] = new ModelRendererTurbo(this, 1625, 137, this.textureX, this.textureY);
/* 1238 */     this.ammoModel['Ĺ'] = new ModelRendererTurbo(this, 1697, 137, this.textureX, this.textureY);
/* 1239 */     this.ammoModel['ĺ'] = new ModelRendererTurbo(this, 1785, 137, this.textureX, this.textureY);
/* 1240 */     this.ammoModel['Ļ'] = new ModelRendererTurbo(this, 1865, 137, this.textureX, this.textureY);
/* 1241 */     this.ammoModel['ļ'] = new ModelRendererTurbo(this, 1641, 137, this.textureX, this.textureY);
/* 1242 */     this.ammoModel['Ľ'] = new ModelRendererTurbo(this, 1945, 137, this.textureX, this.textureY);
/* 1243 */     this.ammoModel['ľ'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/* 1244 */     this.ammoModel['Ŀ'] = new ModelRendererTurbo(this, 81, 145, this.textureX, this.textureY);
/* 1245 */     this.ammoModel['ŀ'] = new ModelRendererTurbo(this, 1657, 137, this.textureX, this.textureY);
/* 1246 */     this.ammoModel['Ł'] = new ModelRendererTurbo(this, 161, 145, this.textureX, this.textureY);
/* 1247 */     this.ammoModel['ł'] = new ModelRendererTurbo(this, 249, 145, this.textureX, this.textureY);
/* 1248 */     this.ammoModel['Ń'] = new ModelRendererTurbo(this, 329, 145, this.textureX, this.textureY);
/* 1249 */     this.ammoModel['ń'] = new ModelRendererTurbo(this, 2033, 137, this.textureX, this.textureY);
/*      */     
/* 1251 */     this.ammoModel[0].addShapeBox(59.0F, 10.0F, -3.0F, 35, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1252 */     this.ammoModel[0].setRotationPoint(0.0F, -113.75F, -15.5F);
/*      */     
/* 1254 */     this.ammoModel[1].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.ammoModel[1].setRotationPoint(0.0F, -110.75F, -18.5F);
/*      */     
/* 1257 */     this.ammoModel[2].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1258 */     this.ammoModel[2].setRotationPoint(0.0F, -110.75F, -9.5F);
/*      */     
/* 1260 */     this.ammoModel[3].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1261 */     this.ammoModel[3].setRotationPoint(0.0F, -113.75F, -18.5F);
/*      */     
/* 1263 */     this.ammoModel[4].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1264 */     this.ammoModel[4].setRotationPoint(0.0F, -104.75F, -18.5F);
/*      */     
/* 1266 */     this.ammoModel[5].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1267 */     this.ammoModel[5].setRotationPoint(0.0F, -113.75F, -9.5F);
/*      */     
/* 1269 */     this.ammoModel[6].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1270 */     this.ammoModel[6].setRotationPoint(0.0F, -104.75F, -9.5F);
/*      */     
/* 1272 */     this.ammoModel[7].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1273 */     this.ammoModel[7].setRotationPoint(0.0F, -101.75F, -12.5F);
/*      */     
/* 1275 */     this.ammoModel[8].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1276 */     this.ammoModel[8].setRotationPoint(0.0F, -101.75F, -15.5F);
/*      */     
/* 1278 */     this.ammoModel[9].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1279 */     this.ammoModel[9].setRotationPoint(0.0F, -107.75F, -21.5F);
/*      */     
/* 1281 */     this.ammoModel[10].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1282 */     this.ammoModel[10].setRotationPoint(0.0F, -107.75F, -6.5F);
/*      */     
/* 1284 */     this.ammoModel[11].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1285 */     this.ammoModel[11].setRotationPoint(0.0F, -110.75F, -6.5F);
/*      */     
/* 1287 */     this.ammoModel[12].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.ammoModel[12].setRotationPoint(0.0F, -116.75F, -12.5F);
/*      */     
/* 1290 */     this.ammoModel[13].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.ammoModel[13].setRotationPoint(0.0F, -116.75F, -15.5F);
/*      */     
/* 1293 */     this.ammoModel[14].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1294 */     this.ammoModel[14].setRotationPoint(0.0F, -110.75F, -21.5F);
/*      */     
/* 1296 */     this.ammoModel[15].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1297 */     this.ammoModel[15].setRotationPoint(-1.0F, -116.25F, -15.5F);
/*      */     
/* 1299 */     this.ammoModel[16].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1300 */     this.ammoModel[16].setRotationPoint(-1.0F, -116.25F, -12.5F);
/*      */     
/* 1302 */     this.ammoModel[17].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.ammoModel[17].setRotationPoint(-1.0F, -110.75F, -21.0F);
/*      */     
/* 1305 */     this.ammoModel[18].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1306 */     this.ammoModel[18].setRotationPoint(-1.0F, -107.75F, -21.0F);
/*      */     
/* 1308 */     this.ammoModel[19].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1309 */     this.ammoModel[19].setRotationPoint(-1.0F, -102.25F, -15.5F);
/*      */     
/* 1311 */     this.ammoModel[20].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1312 */     this.ammoModel[20].setRotationPoint(-1.0F, -102.25F, -12.5F);
/*      */     
/* 1314 */     this.ammoModel[21].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1315 */     this.ammoModel[21].setRotationPoint(-1.0F, -107.75F, -7.0F);
/*      */     
/* 1317 */     this.ammoModel[22].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1318 */     this.ammoModel[22].setRotationPoint(-1.0F, -110.75F, -7.0F);
/*      */     
/* 1320 */     this.ammoModel[23].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1321 */     this.ammoModel[23].setRotationPoint(-1.0F, -113.25F, -9.5F);
/*      */     
/* 1323 */     this.ammoModel[24].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 1324 */     this.ammoModel[24].setRotationPoint(-1.0F, -104.75F, -9.5F);
/*      */     
/* 1326 */     this.ammoModel[25].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1327 */     this.ammoModel[25].setRotationPoint(-1.0F, -113.25F, -17.5F);
/*      */     
/* 1329 */     this.ammoModel[26].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1330 */     this.ammoModel[26].setRotationPoint(-1.0F, -104.75F, -17.5F);
/*      */     
/* 1332 */     this.ammoModel[27].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1333 */     this.ammoModel[27].setRotationPoint(-2.0F, -117.25F, -15.5F);
/*      */     
/* 1335 */     this.ammoModel[28].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     this.ammoModel[28].setRotationPoint(-2.0F, -117.25F, -12.5F);
/*      */     
/* 1338 */     this.ammoModel[29].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1339 */     this.ammoModel[29].setRotationPoint(-2.0F, -110.75F, -22.0F);
/*      */     
/* 1341 */     this.ammoModel[30].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1342 */     this.ammoModel[30].setRotationPoint(-2.0F, -107.75F, -22.0F);
/*      */     
/* 1344 */     this.ammoModel[31].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1345 */     this.ammoModel[31].setRotationPoint(-2.0F, -101.25F, -15.5F);
/*      */     
/* 1347 */     this.ammoModel[32].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1348 */     this.ammoModel[32].setRotationPoint(-2.0F, -101.25F, -12.5F);
/*      */     
/* 1350 */     this.ammoModel[33].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1351 */     this.ammoModel[33].setRotationPoint(-2.0F, -107.75F, -6.0F);
/*      */     
/* 1353 */     this.ammoModel[34].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1354 */     this.ammoModel[34].setRotationPoint(-2.0F, -110.75F, -6.0F);
/*      */     
/* 1356 */     this.ammoModel[35].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1357 */     this.ammoModel[35].setRotationPoint(-2.0F, -113.75F, -18.5F);
/*      */     
/* 1359 */     this.ammoModel[36].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1360 */     this.ammoModel[36].setRotationPoint(-2.0F, -110.75F, -18.5F);
/*      */     
/* 1362 */     this.ammoModel[37].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1363 */     this.ammoModel[37].setRotationPoint(-2.0F, -113.75F, -15.5F);
/*      */     
/* 1365 */     this.ammoModel[38].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F);
/* 1366 */     this.ammoModel[38].setRotationPoint(-2.0F, -110.75F, -9.5F);
/*      */     
/* 1368 */     this.ammoModel[39].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1369 */     this.ammoModel[39].setRotationPoint(-2.0F, -104.25F, -15.5F);
/*      */     
/* 1371 */     this.ammoModel[40].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1372 */     this.ammoModel[40].setRotationPoint(-1.0F, -110.75F, -15.5F);
/*      */     
/* 1374 */     this.ammoModel[41].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1375 */     this.ammoModel[41].setRotationPoint(-2.0F, -110.75F, -15.5F);
/*      */     
/* 1377 */     this.ammoModel[42].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1378 */     this.ammoModel[42].setRotationPoint(35.0F, -113.75F, -18.5F);
/*      */     
/* 1380 */     this.ammoModel[43].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.ammoModel[43].setRotationPoint(35.0F, -104.75F, -18.5F);
/*      */     
/* 1383 */     this.ammoModel[44].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1384 */     this.ammoModel[44].setRotationPoint(35.0F, -113.75F, -9.5F);
/*      */     
/* 1386 */     this.ammoModel[45].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F);
/* 1387 */     this.ammoModel[45].setRotationPoint(35.0F, -104.75F, -9.5F);
/*      */     
/* 1389 */     this.ammoModel[46].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1390 */     this.ammoModel[46].setRotationPoint(35.0F, -101.75F, -12.5F);
/*      */     
/* 1392 */     this.ammoModel[47].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1393 */     this.ammoModel[47].setRotationPoint(35.0F, -101.75F, -15.5F);
/*      */     
/* 1395 */     this.ammoModel[48].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1396 */     this.ammoModel[48].setRotationPoint(35.0F, -107.75F, -21.5F);
/*      */     
/* 1398 */     this.ammoModel[49].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F);
/* 1399 */     this.ammoModel[49].setRotationPoint(35.0F, -107.75F, -6.5F);
/*      */     
/* 1401 */     this.ammoModel[50].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F);
/* 1402 */     this.ammoModel[50].setRotationPoint(35.0F, -110.75F, -6.5F);
/*      */     
/* 1404 */     this.ammoModel[51].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1405 */     this.ammoModel[51].setRotationPoint(35.0F, -116.75F, -12.5F);
/*      */     
/* 1407 */     this.ammoModel[52].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.ammoModel[52].setRotationPoint(35.0F, -116.75F, -15.5F);
/*      */     
/* 1410 */     this.ammoModel[53].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1411 */     this.ammoModel[53].setRotationPoint(35.0F, -110.75F, -21.5F);
/*      */     
/* 1413 */     this.ammoModel[54].addShapeBox(59.0F, 10.0F, -3.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1414 */     this.ammoModel[54].setRotationPoint(41.0F, -110.75F, -15.5F);
/*      */     
/* 1416 */     this.ammoModel[55].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1417 */     this.ammoModel[55].setRotationPoint(0.0F, -98.75F, -18.5F);
/*      */     
/* 1419 */     this.ammoModel[56].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.ammoModel[56].setRotationPoint(0.0F, -89.75F, -18.5F);
/*      */     
/* 1422 */     this.ammoModel[57].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1423 */     this.ammoModel[57].setRotationPoint(0.0F, -98.75F, -9.5F);
/*      */     
/* 1425 */     this.ammoModel[58].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1426 */     this.ammoModel[58].setRotationPoint(0.0F, -89.75F, -9.5F);
/*      */     
/* 1428 */     this.ammoModel[59].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1429 */     this.ammoModel[59].setRotationPoint(0.0F, -86.75F, -12.5F);
/*      */     
/* 1431 */     this.ammoModel[60].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1432 */     this.ammoModel[60].setRotationPoint(0.0F, -86.75F, -15.5F);
/*      */     
/* 1434 */     this.ammoModel[61].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1435 */     this.ammoModel[61].setRotationPoint(0.0F, -92.75F, -21.5F);
/*      */     
/* 1437 */     this.ammoModel[62].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1438 */     this.ammoModel[62].setRotationPoint(0.0F, -92.75F, -6.5F);
/*      */     
/* 1440 */     this.ammoModel[63].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1441 */     this.ammoModel[63].setRotationPoint(0.0F, -95.75F, -6.5F);
/*      */     
/* 1443 */     this.ammoModel[64].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1444 */     this.ammoModel[64].setRotationPoint(0.0F, -101.75F, -12.5F);
/*      */     
/* 1446 */     this.ammoModel[65].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1447 */     this.ammoModel[65].setRotationPoint(0.0F, -101.75F, -15.5F);
/*      */     
/* 1449 */     this.ammoModel[66].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1450 */     this.ammoModel[66].setRotationPoint(0.0F, -95.75F, -21.5F);
/*      */     
/* 1452 */     this.ammoModel[67].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1453 */     this.ammoModel[67].setRotationPoint(-1.0F, -101.25F, -15.5F);
/*      */     
/* 1455 */     this.ammoModel[68].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1456 */     this.ammoModel[68].setRotationPoint(-1.0F, -101.25F, -12.5F);
/*      */     
/* 1458 */     this.ammoModel[69].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1459 */     this.ammoModel[69].setRotationPoint(-1.0F, -95.75F, -21.0F);
/*      */     
/* 1461 */     this.ammoModel[70].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1462 */     this.ammoModel[70].setRotationPoint(-1.0F, -92.75F, -21.0F);
/*      */     
/* 1464 */     this.ammoModel[71].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1465 */     this.ammoModel[71].setRotationPoint(-1.0F, -87.25F, -15.5F);
/*      */     
/* 1467 */     this.ammoModel[72].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1468 */     this.ammoModel[72].setRotationPoint(-1.0F, -87.25F, -12.5F);
/*      */     
/* 1470 */     this.ammoModel[73].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1471 */     this.ammoModel[73].setRotationPoint(-1.0F, -92.75F, -7.0F);
/*      */     
/* 1473 */     this.ammoModel[74].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1474 */     this.ammoModel[74].setRotationPoint(-1.0F, -95.75F, -7.0F);
/*      */     
/* 1476 */     this.ammoModel[75].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1477 */     this.ammoModel[75].setRotationPoint(-1.0F, -98.25F, -9.5F);
/*      */     
/* 1479 */     this.ammoModel[76].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 1480 */     this.ammoModel[76].setRotationPoint(-1.0F, -89.75F, -9.5F);
/*      */     
/* 1482 */     this.ammoModel[77].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1483 */     this.ammoModel[77].setRotationPoint(-1.0F, -98.25F, -17.5F);
/*      */     
/* 1485 */     this.ammoModel[78].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1486 */     this.ammoModel[78].setRotationPoint(-1.0F, -89.75F, -17.5F);
/*      */     
/* 1488 */     this.ammoModel[79].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1489 */     this.ammoModel[79].setRotationPoint(-2.0F, -102.25F, -15.5F);
/*      */     
/* 1491 */     this.ammoModel[80].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1492 */     this.ammoModel[80].setRotationPoint(-2.0F, -102.25F, -12.5F);
/*      */     
/* 1494 */     this.ammoModel[81].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1495 */     this.ammoModel[81].setRotationPoint(-2.0F, -95.75F, -22.0F);
/*      */     
/* 1497 */     this.ammoModel[82].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1498 */     this.ammoModel[82].setRotationPoint(-2.0F, -92.75F, -22.0F);
/*      */     
/* 1500 */     this.ammoModel[83].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1501 */     this.ammoModel[83].setRotationPoint(-2.0F, -86.25F, -15.5F);
/*      */     
/* 1503 */     this.ammoModel[84].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1504 */     this.ammoModel[84].setRotationPoint(-2.0F, -86.25F, -12.5F);
/*      */     
/* 1506 */     this.ammoModel[85].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1507 */     this.ammoModel[85].setRotationPoint(-2.0F, -92.75F, -6.0F);
/*      */     
/* 1509 */     this.ammoModel[86].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1510 */     this.ammoModel[86].setRotationPoint(-2.0F, -95.75F, -6.0F);
/*      */     
/* 1512 */     this.ammoModel[87].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1513 */     this.ammoModel[87].setRotationPoint(-2.0F, -98.75F, -18.5F);
/*      */     
/* 1515 */     this.ammoModel[88].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1516 */     this.ammoModel[88].setRotationPoint(-2.0F, -95.75F, -18.5F);
/*      */     
/* 1518 */     this.ammoModel[89].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1519 */     this.ammoModel[89].setRotationPoint(-2.0F, -98.75F, -15.5F);
/*      */     
/* 1521 */     this.ammoModel[90].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F);
/* 1522 */     this.ammoModel[90].setRotationPoint(-2.0F, -95.75F, -9.5F);
/*      */     
/* 1524 */     this.ammoModel[91].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1525 */     this.ammoModel[91].setRotationPoint(-2.0F, -89.25F, -15.5F);
/*      */     
/* 1527 */     this.ammoModel[92].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1528 */     this.ammoModel[92].setRotationPoint(-2.0F, -95.75F, -15.5F);
/*      */     
/* 1530 */     this.ammoModel[93].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1531 */     this.ammoModel[93].setRotationPoint(35.0F, -98.75F, -18.5F);
/*      */     
/* 1533 */     this.ammoModel[94].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1534 */     this.ammoModel[94].setRotationPoint(35.0F, -89.75F, -18.5F);
/*      */     
/* 1536 */     this.ammoModel[95].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1537 */     this.ammoModel[95].setRotationPoint(35.0F, -98.75F, -9.5F);
/*      */     
/* 1539 */     this.ammoModel[96].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F);
/* 1540 */     this.ammoModel[96].setRotationPoint(35.0F, -89.75F, -9.5F);
/*      */     
/* 1542 */     this.ammoModel[97].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1543 */     this.ammoModel[97].setRotationPoint(35.0F, -86.75F, -12.5F);
/*      */     
/* 1545 */     this.ammoModel[98].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1546 */     this.ammoModel[98].setRotationPoint(35.0F, -86.75F, -15.5F);
/*      */     
/* 1548 */     this.ammoModel[99].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1549 */     this.ammoModel[99].setRotationPoint(35.0F, -92.75F, -21.5F);
/*      */     
/* 1551 */     this.ammoModel[100].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F);
/* 1552 */     this.ammoModel[100].setRotationPoint(35.0F, -92.75F, -6.5F);
/*      */     
/* 1554 */     this.ammoModel[101].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F);
/* 1555 */     this.ammoModel[101].setRotationPoint(35.0F, -95.75F, -6.5F);
/*      */     
/* 1557 */     this.ammoModel[102].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1558 */     this.ammoModel[102].setRotationPoint(35.0F, -101.75F, -12.5F);
/*      */     
/* 1560 */     this.ammoModel[103].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1561 */     this.ammoModel[103].setRotationPoint(35.0F, -101.75F, -15.5F);
/*      */     
/* 1563 */     this.ammoModel[104].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1564 */     this.ammoModel[104].setRotationPoint(35.0F, -95.75F, -21.5F);
/*      */     
/* 1566 */     this.ammoModel[105].addShapeBox(59.0F, 10.0F, -3.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1567 */     this.ammoModel[105].setRotationPoint(41.0F, -95.75F, -15.5F);
/*      */     
/* 1569 */     this.ammoModel[106].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1570 */     this.ammoModel[106].setRotationPoint(0.0F, -90.25F, -0.5F);
/*      */     
/* 1572 */     this.ammoModel[107].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1573 */     this.ammoModel[107].setRotationPoint(0.0F, -81.25F, -0.5F);
/*      */     
/* 1575 */     this.ammoModel[108].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1576 */     this.ammoModel[108].setRotationPoint(0.0F, -90.25F, 8.5F);
/*      */     
/* 1578 */     this.ammoModel[109].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1579 */     this.ammoModel[109].setRotationPoint(0.0F, -81.25F, 8.5F);
/*      */     
/* 1581 */     this.ammoModel[110].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1582 */     this.ammoModel[110].setRotationPoint(0.0F, -78.25F, 5.5F);
/*      */     
/* 1584 */     this.ammoModel[111].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1585 */     this.ammoModel[111].setRotationPoint(0.0F, -78.25F, 2.5F);
/*      */     
/* 1587 */     this.ammoModel[112].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1588 */     this.ammoModel[112].setRotationPoint(0.0F, -84.25F, -3.5F);
/*      */     
/* 1590 */     this.ammoModel[113].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1591 */     this.ammoModel[113].setRotationPoint(0.0F, -84.25F, 11.5F);
/*      */     
/* 1593 */     this.ammoModel[114].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1594 */     this.ammoModel[114].setRotationPoint(0.0F, -87.25F, 11.5F);
/*      */     
/* 1596 */     this.ammoModel[115].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1597 */     this.ammoModel[115].setRotationPoint(0.0F, -93.25F, 5.5F);
/*      */     
/* 1599 */     this.ammoModel[116].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1600 */     this.ammoModel[116].setRotationPoint(0.0F, -93.25F, 2.5F);
/*      */     
/* 1602 */     this.ammoModel[117].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1603 */     this.ammoModel[117].setRotationPoint(0.0F, -87.25F, -3.5F);
/*      */     
/* 1605 */     this.ammoModel[118].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1606 */     this.ammoModel[118].setRotationPoint(-1.0F, -92.75F, 2.5F);
/*      */     
/* 1608 */     this.ammoModel[119].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1609 */     this.ammoModel[119].setRotationPoint(-1.0F, -92.75F, 5.5F);
/*      */     
/* 1611 */     this.ammoModel[120].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1612 */     this.ammoModel[120].setRotationPoint(-1.0F, -87.25F, -3.0F);
/*      */     
/* 1614 */     this.ammoModel[121].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1615 */     this.ammoModel[121].setRotationPoint(-1.0F, -84.25F, -3.0F);
/*      */     
/* 1617 */     this.ammoModel[122].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1618 */     this.ammoModel[122].setRotationPoint(-1.0F, -78.75F, 2.5F);
/*      */     
/* 1620 */     this.ammoModel[123].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1621 */     this.ammoModel[123].setRotationPoint(-1.0F, -78.75F, 5.5F);
/*      */     
/* 1623 */     this.ammoModel[124].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1624 */     this.ammoModel[124].setRotationPoint(-1.0F, -84.25F, 11.0F);
/*      */     
/* 1626 */     this.ammoModel[125].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1627 */     this.ammoModel[125].setRotationPoint(-1.0F, -87.25F, 11.0F);
/*      */     
/* 1629 */     this.ammoModel[126].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1630 */     this.ammoModel[126].setRotationPoint(-1.0F, -89.75F, 8.5F);
/*      */     
/* 1632 */     this.ammoModel[127].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 1633 */     this.ammoModel[127].setRotationPoint(-1.0F, -81.25F, 8.5F);
/*      */     
/* 1635 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1636 */     this.ammoModel[''].setRotationPoint(-1.0F, -89.75F, 0.5F);
/*      */     
/* 1638 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1639 */     this.ammoModel[''].setRotationPoint(-1.0F, -81.25F, 0.5F);
/*      */     
/* 1641 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1642 */     this.ammoModel[''].setRotationPoint(-2.0F, -93.75F, 2.5F);
/*      */     
/* 1644 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1645 */     this.ammoModel[''].setRotationPoint(-2.0F, -93.75F, 5.5F);
/*      */     
/* 1647 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1648 */     this.ammoModel[''].setRotationPoint(-2.0F, -87.25F, -4.0F);
/*      */     
/* 1650 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1651 */     this.ammoModel[''].setRotationPoint(-2.0F, -84.25F, -4.0F);
/*      */     
/* 1653 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1654 */     this.ammoModel[''].setRotationPoint(-2.0F, -77.75F, 2.5F);
/*      */     
/* 1656 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1657 */     this.ammoModel[''].setRotationPoint(-2.0F, -77.75F, 5.5F);
/*      */     
/* 1659 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1660 */     this.ammoModel[''].setRotationPoint(-2.0F, -84.25F, 12.0F);
/*      */     
/* 1662 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1663 */     this.ammoModel[''].setRotationPoint(-2.0F, -87.25F, 12.0F);
/*      */     
/* 1665 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1666 */     this.ammoModel[''].setRotationPoint(-2.0F, -90.25F, -0.5F);
/*      */     
/* 1668 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1669 */     this.ammoModel[''].setRotationPoint(-2.0F, -87.25F, -0.5F);
/*      */     
/* 1671 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1672 */     this.ammoModel[''].setRotationPoint(-2.0F, -90.25F, 2.5F);
/*      */     
/* 1674 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F);
/* 1675 */     this.ammoModel[''].setRotationPoint(-2.0F, -87.25F, 8.5F);
/*      */     
/* 1677 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1678 */     this.ammoModel[''].setRotationPoint(-2.0F, -80.75F, 2.5F);
/*      */     
/* 1680 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1681 */     this.ammoModel[''].setRotationPoint(-2.0F, -87.25F, 2.5F);
/*      */     
/* 1683 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1684 */     this.ammoModel[''].setRotationPoint(35.0F, -90.25F, -0.5F);
/*      */     
/* 1686 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1687 */     this.ammoModel[''].setRotationPoint(35.0F, -81.25F, -0.5F);
/*      */     
/* 1689 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1690 */     this.ammoModel[''].setRotationPoint(35.0F, -90.25F, 8.5F);
/*      */     
/* 1692 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F);
/* 1693 */     this.ammoModel[''].setRotationPoint(35.0F, -81.25F, 8.5F);
/*      */     
/* 1695 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1696 */     this.ammoModel[''].setRotationPoint(35.0F, -78.25F, 5.5F);
/*      */     
/* 1698 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1699 */     this.ammoModel[''].setRotationPoint(35.0F, -78.25F, 2.5F);
/*      */     
/* 1701 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1702 */     this.ammoModel[''].setRotationPoint(35.0F, -84.25F, -3.5F);
/*      */     
/* 1704 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F);
/* 1705 */     this.ammoModel[''].setRotationPoint(35.0F, -84.25F, 11.5F);
/*      */     
/* 1707 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F);
/* 1708 */     this.ammoModel[''].setRotationPoint(35.0F, -87.25F, 11.5F);
/*      */     
/* 1710 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1711 */     this.ammoModel[''].setRotationPoint(35.0F, -93.25F, 5.5F);
/*      */     
/* 1713 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1714 */     this.ammoModel[''].setRotationPoint(35.0F, -93.25F, 2.5F);
/*      */     
/* 1716 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1717 */     this.ammoModel[''].setRotationPoint(35.0F, -87.25F, -3.5F);
/*      */     
/* 1719 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1720 */     this.ammoModel[''].setRotationPoint(41.0F, -87.25F, 2.5F);
/*      */     
/* 1722 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1723 */     this.ammoModel[''].setRotationPoint(0.0F, -113.75F, 16.0F);
/*      */     
/* 1725 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1726 */     this.ammoModel[''].setRotationPoint(0.0F, -104.75F, 16.0F);
/*      */     
/* 1728 */     this.ammoModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1729 */     this.ammoModel[''].setRotationPoint(0.0F, -113.75F, 25.0F);
/*      */     
/* 1731 */     this.ammoModel[' '].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1732 */     this.ammoModel[' '].setRotationPoint(0.0F, -104.75F, 25.0F);
/*      */     
/* 1734 */     this.ammoModel['¡'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1735 */     this.ammoModel['¡'].setRotationPoint(0.0F, -101.75F, 22.0F);
/*      */     
/* 1737 */     this.ammoModel['¢'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1738 */     this.ammoModel['¢'].setRotationPoint(0.0F, -101.75F, 19.0F);
/*      */     
/* 1740 */     this.ammoModel['£'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1741 */     this.ammoModel['£'].setRotationPoint(0.0F, -107.75F, 13.0F);
/*      */     
/* 1743 */     this.ammoModel['¤'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1744 */     this.ammoModel['¤'].setRotationPoint(0.0F, -107.75F, 28.0F);
/*      */     
/* 1746 */     this.ammoModel['¥'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1747 */     this.ammoModel['¥'].setRotationPoint(0.0F, -110.75F, 28.0F);
/*      */     
/* 1749 */     this.ammoModel['¦'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1750 */     this.ammoModel['¦'].setRotationPoint(0.0F, -116.75F, 22.0F);
/*      */     
/* 1752 */     this.ammoModel['§'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1753 */     this.ammoModel['§'].setRotationPoint(0.0F, -116.75F, 19.0F);
/*      */     
/* 1755 */     this.ammoModel['¨'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1756 */     this.ammoModel['¨'].setRotationPoint(0.0F, -110.75F, 13.0F);
/*      */     
/* 1758 */     this.ammoModel['©'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1759 */     this.ammoModel['©'].setRotationPoint(-1.0F, -116.25F, 19.0F);
/*      */     
/* 1761 */     this.ammoModel['ª'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1762 */     this.ammoModel['ª'].setRotationPoint(-1.0F, -116.25F, 22.0F);
/*      */     
/* 1764 */     this.ammoModel['«'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1765 */     this.ammoModel['«'].setRotationPoint(-1.0F, -110.75F, 13.5F);
/*      */     
/* 1767 */     this.ammoModel['¬'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1768 */     this.ammoModel['¬'].setRotationPoint(-1.0F, -107.75F, 13.5F);
/*      */     
/* 1770 */     this.ammoModel['­'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1771 */     this.ammoModel['­'].setRotationPoint(-1.0F, -102.25F, 19.0F);
/*      */     
/* 1773 */     this.ammoModel['®'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1774 */     this.ammoModel['®'].setRotationPoint(-1.0F, -102.25F, 22.0F);
/*      */     
/* 1776 */     this.ammoModel['¯'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1777 */     this.ammoModel['¯'].setRotationPoint(-1.0F, -107.75F, 27.5F);
/*      */     
/* 1779 */     this.ammoModel['°'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1780 */     this.ammoModel['°'].setRotationPoint(-1.0F, -110.75F, 27.5F);
/*      */     
/* 1782 */     this.ammoModel['±'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1783 */     this.ammoModel['±'].setRotationPoint(-1.0F, -113.25F, 25.0F);
/*      */     
/* 1785 */     this.ammoModel['²'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 1786 */     this.ammoModel['²'].setRotationPoint(-1.0F, -104.75F, 25.0F);
/*      */     
/* 1788 */     this.ammoModel['³'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1789 */     this.ammoModel['³'].setRotationPoint(-1.0F, -113.25F, 17.0F);
/*      */     
/* 1791 */     this.ammoModel['´'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1792 */     this.ammoModel['´'].setRotationPoint(-1.0F, -104.75F, 17.0F);
/*      */     
/* 1794 */     this.ammoModel['µ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1795 */     this.ammoModel['µ'].setRotationPoint(-2.0F, -117.25F, 19.0F);
/*      */     
/* 1797 */     this.ammoModel['¶'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1798 */     this.ammoModel['¶'].setRotationPoint(-2.0F, -117.25F, 22.0F);
/*      */     
/* 1800 */     this.ammoModel['·'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1801 */     this.ammoModel['·'].setRotationPoint(-2.0F, -110.75F, 12.5F);
/*      */     
/* 1803 */     this.ammoModel['¸'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1804 */     this.ammoModel['¸'].setRotationPoint(-2.0F, -107.75F, 12.5F);
/*      */     
/* 1806 */     this.ammoModel['¹'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1807 */     this.ammoModel['¹'].setRotationPoint(-2.0F, -101.25F, 19.0F);
/*      */     
/* 1809 */     this.ammoModel['º'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1810 */     this.ammoModel['º'].setRotationPoint(-2.0F, -101.25F, 22.0F);
/*      */     
/* 1812 */     this.ammoModel['»'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1813 */     this.ammoModel['»'].setRotationPoint(-2.0F, -107.75F, 28.5F);
/*      */     
/* 1815 */     this.ammoModel['¼'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1816 */     this.ammoModel['¼'].setRotationPoint(-2.0F, -110.75F, 28.5F);
/*      */     
/* 1818 */     this.ammoModel['½'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1819 */     this.ammoModel['½'].setRotationPoint(-2.0F, -113.75F, 16.0F);
/*      */     
/* 1821 */     this.ammoModel['¾'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1822 */     this.ammoModel['¾'].setRotationPoint(-2.0F, -110.75F, 16.0F);
/*      */     
/* 1824 */     this.ammoModel['¿'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1825 */     this.ammoModel['¿'].setRotationPoint(-2.0F, -113.75F, 19.0F);
/*      */     
/* 1827 */     this.ammoModel['À'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F);
/* 1828 */     this.ammoModel['À'].setRotationPoint(-2.0F, -110.75F, 25.0F);
/*      */     
/* 1830 */     this.ammoModel['Á'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1831 */     this.ammoModel['Á'].setRotationPoint(-2.0F, -104.25F, 19.0F);
/*      */     
/* 1833 */     this.ammoModel['Â'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1834 */     this.ammoModel['Â'].setRotationPoint(-2.0F, -110.75F, 19.0F);
/*      */     
/* 1836 */     this.ammoModel['Ã'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1837 */     this.ammoModel['Ã'].setRotationPoint(35.0F, -113.75F, 16.0F);
/*      */     
/* 1839 */     this.ammoModel['Ä'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1840 */     this.ammoModel['Ä'].setRotationPoint(35.0F, -104.75F, 16.0F);
/*      */     
/* 1842 */     this.ammoModel['Å'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1843 */     this.ammoModel['Å'].setRotationPoint(35.0F, -113.75F, 25.0F);
/*      */     
/* 1845 */     this.ammoModel['Æ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F);
/* 1846 */     this.ammoModel['Æ'].setRotationPoint(35.0F, -104.75F, 25.0F);
/*      */     
/* 1848 */     this.ammoModel['Ç'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1849 */     this.ammoModel['Ç'].setRotationPoint(35.0F, -101.75F, 22.0F);
/*      */     
/* 1851 */     this.ammoModel['È'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1852 */     this.ammoModel['È'].setRotationPoint(35.0F, -101.75F, 19.0F);
/*      */     
/* 1854 */     this.ammoModel['É'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1855 */     this.ammoModel['É'].setRotationPoint(35.0F, -107.75F, 13.0F);
/*      */     
/* 1857 */     this.ammoModel['Ê'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F);
/* 1858 */     this.ammoModel['Ê'].setRotationPoint(35.0F, -107.75F, 28.0F);
/*      */     
/* 1860 */     this.ammoModel['Ë'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F);
/* 1861 */     this.ammoModel['Ë'].setRotationPoint(35.0F, -110.75F, 28.0F);
/*      */     
/* 1863 */     this.ammoModel['Ì'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1864 */     this.ammoModel['Ì'].setRotationPoint(35.0F, -116.75F, 22.0F);
/*      */     
/* 1866 */     this.ammoModel['Í'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1867 */     this.ammoModel['Í'].setRotationPoint(35.0F, -116.75F, 19.0F);
/*      */     
/* 1869 */     this.ammoModel['Î'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 1870 */     this.ammoModel['Î'].setRotationPoint(35.0F, -110.75F, 13.0F);
/*      */     
/* 1872 */     this.ammoModel['Ï'].addShapeBox(59.0F, 10.0F, -3.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1873 */     this.ammoModel['Ï'].setRotationPoint(41.0F, -110.75F, 19.0F);
/*      */     
/* 1875 */     this.ammoModel['Ð'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1876 */     this.ammoModel['Ð'].setRotationPoint(0.0F, -120.75F, -0.5F);
/*      */     
/* 1878 */     this.ammoModel['Ñ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1879 */     this.ammoModel['Ñ'].setRotationPoint(0.0F, -111.75F, -0.5F);
/*      */     
/* 1881 */     this.ammoModel['Ò'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1882 */     this.ammoModel['Ò'].setRotationPoint(0.0F, -120.75F, 8.5F);
/*      */     
/* 1884 */     this.ammoModel['Ó'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1885 */     this.ammoModel['Ó'].setRotationPoint(0.0F, -111.75F, 8.5F);
/*      */     
/* 1887 */     this.ammoModel['Ô'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1888 */     this.ammoModel['Ô'].setRotationPoint(0.0F, -108.75F, 5.5F);
/*      */     
/* 1890 */     this.ammoModel['Õ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1891 */     this.ammoModel['Õ'].setRotationPoint(0.0F, -108.75F, 2.5F);
/*      */     
/* 1893 */     this.ammoModel['Ö'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1894 */     this.ammoModel['Ö'].setRotationPoint(0.0F, -114.75F, -3.5F);
/*      */     
/* 1896 */     this.ammoModel['×'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1897 */     this.ammoModel['×'].setRotationPoint(0.0F, -114.75F, 11.5F);
/*      */     
/* 1899 */     this.ammoModel['Ø'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1900 */     this.ammoModel['Ø'].setRotationPoint(0.0F, -117.75F, 11.5F);
/*      */     
/* 1902 */     this.ammoModel['Ù'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1903 */     this.ammoModel['Ù'].setRotationPoint(0.0F, -123.75F, 5.5F);
/*      */     
/* 1905 */     this.ammoModel['Ú'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1906 */     this.ammoModel['Ú'].setRotationPoint(0.0F, -123.75F, 2.5F);
/*      */     
/* 1908 */     this.ammoModel['Û'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1909 */     this.ammoModel['Û'].setRotationPoint(0.0F, -117.75F, -3.5F);
/*      */     
/* 1911 */     this.ammoModel['Ü'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1912 */     this.ammoModel['Ü'].setRotationPoint(-1.0F, -123.25F, 2.5F);
/*      */     
/* 1914 */     this.ammoModel['Ý'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1915 */     this.ammoModel['Ý'].setRotationPoint(-1.0F, -123.25F, 5.5F);
/*      */     
/* 1917 */     this.ammoModel['Þ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1918 */     this.ammoModel['Þ'].setRotationPoint(-1.0F, -117.75F, -3.0F);
/*      */     
/* 1920 */     this.ammoModel['ß'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1921 */     this.ammoModel['ß'].setRotationPoint(-1.0F, -114.75F, -3.0F);
/*      */     
/* 1923 */     this.ammoModel['à'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1924 */     this.ammoModel['à'].setRotationPoint(-1.0F, -109.25F, 2.5F);
/*      */     
/* 1926 */     this.ammoModel['á'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1927 */     this.ammoModel['á'].setRotationPoint(-1.0F, -109.25F, 5.5F);
/*      */     
/* 1929 */     this.ammoModel['â'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1930 */     this.ammoModel['â'].setRotationPoint(-1.0F, -114.75F, 11.0F);
/*      */     
/* 1932 */     this.ammoModel['ã'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1933 */     this.ammoModel['ã'].setRotationPoint(-1.0F, -117.75F, 11.0F);
/*      */     
/* 1935 */     this.ammoModel['ä'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1936 */     this.ammoModel['ä'].setRotationPoint(-1.0F, -120.25F, 8.5F);
/*      */     
/* 1938 */     this.ammoModel['å'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 1939 */     this.ammoModel['å'].setRotationPoint(-1.0F, -111.75F, 8.5F);
/*      */     
/* 1941 */     this.ammoModel['æ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1942 */     this.ammoModel['æ'].setRotationPoint(-1.0F, -120.25F, 0.5F);
/*      */     
/* 1944 */     this.ammoModel['ç'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1945 */     this.ammoModel['ç'].setRotationPoint(-1.0F, -111.75F, 0.5F);
/*      */     
/* 1947 */     this.ammoModel['è'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1948 */     this.ammoModel['è'].setRotationPoint(-2.0F, -124.25F, 2.5F);
/*      */     
/* 1950 */     this.ammoModel['é'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1951 */     this.ammoModel['é'].setRotationPoint(-2.0F, -124.25F, 5.5F);
/*      */     
/* 1953 */     this.ammoModel['ê'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1954 */     this.ammoModel['ê'].setRotationPoint(-2.0F, -117.75F, -4.0F);
/*      */     
/* 1956 */     this.ammoModel['ë'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1957 */     this.ammoModel['ë'].setRotationPoint(-2.0F, -114.75F, -4.0F);
/*      */     
/* 1959 */     this.ammoModel['ì'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 1960 */     this.ammoModel['ì'].setRotationPoint(-2.0F, -108.25F, 2.5F);
/*      */     
/* 1962 */     this.ammoModel['í'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1963 */     this.ammoModel['í'].setRotationPoint(-2.0F, -108.25F, 5.5F);
/*      */     
/* 1965 */     this.ammoModel['î'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1966 */     this.ammoModel['î'].setRotationPoint(-2.0F, -114.75F, 12.0F);
/*      */     
/* 1968 */     this.ammoModel['ï'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 1969 */     this.ammoModel['ï'].setRotationPoint(-2.0F, -117.75F, 12.0F);
/*      */     
/* 1971 */     this.ammoModel['ð'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1972 */     this.ammoModel['ð'].setRotationPoint(-2.0F, -120.75F, -0.5F);
/*      */     
/* 1974 */     this.ammoModel['ñ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1975 */     this.ammoModel['ñ'].setRotationPoint(-2.0F, -117.75F, -0.5F);
/*      */     
/* 1977 */     this.ammoModel['ò'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1978 */     this.ammoModel['ò'].setRotationPoint(-2.0F, -120.75F, 2.5F);
/*      */     
/* 1980 */     this.ammoModel['ó'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F);
/* 1981 */     this.ammoModel['ó'].setRotationPoint(-2.0F, -117.75F, 8.5F);
/*      */     
/* 1983 */     this.ammoModel['ô'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1984 */     this.ammoModel['ô'].setRotationPoint(-2.0F, -111.25F, 2.5F);
/*      */     
/* 1986 */     this.ammoModel['õ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1987 */     this.ammoModel['õ'].setRotationPoint(-2.0F, -117.75F, 2.5F);
/*      */     
/* 1989 */     this.ammoModel['ö'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1990 */     this.ammoModel['ö'].setRotationPoint(35.0F, -120.75F, -0.5F);
/*      */     
/* 1992 */     this.ammoModel['÷'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1993 */     this.ammoModel['÷'].setRotationPoint(35.0F, -111.75F, -0.5F);
/*      */     
/* 1995 */     this.ammoModel['ø'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1996 */     this.ammoModel['ø'].setRotationPoint(35.0F, -120.75F, 8.5F);
/*      */     
/* 1998 */     this.ammoModel['ù'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F);
/* 1999 */     this.ammoModel['ù'].setRotationPoint(35.0F, -111.75F, 8.5F);
/*      */     
/* 2001 */     this.ammoModel['ú'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2002 */     this.ammoModel['ú'].setRotationPoint(35.0F, -108.75F, 5.5F);
/*      */     
/* 2004 */     this.ammoModel['û'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2005 */     this.ammoModel['û'].setRotationPoint(35.0F, -108.75F, 2.5F);
/*      */     
/* 2007 */     this.ammoModel['ü'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 2008 */     this.ammoModel['ü'].setRotationPoint(35.0F, -114.75F, -3.5F);
/*      */     
/* 2010 */     this.ammoModel['ý'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F);
/* 2011 */     this.ammoModel['ý'].setRotationPoint(35.0F, -114.75F, 11.5F);
/*      */     
/* 2013 */     this.ammoModel['þ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F);
/* 2014 */     this.ammoModel['þ'].setRotationPoint(35.0F, -117.75F, 11.5F);
/*      */     
/* 2016 */     this.ammoModel['ÿ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2017 */     this.ammoModel['ÿ'].setRotationPoint(35.0F, -123.75F, 5.5F);
/*      */     
/* 2019 */     this.ammoModel['Ā'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2020 */     this.ammoModel['Ā'].setRotationPoint(35.0F, -123.75F, 2.5F);
/*      */     
/* 2022 */     this.ammoModel['ā'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 2023 */     this.ammoModel['ā'].setRotationPoint(35.0F, -117.75F, -3.5F);
/*      */     
/* 2025 */     this.ammoModel['Ă'].addShapeBox(59.0F, 10.0F, -3.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2026 */     this.ammoModel['Ă'].setRotationPoint(41.0F, -117.75F, 2.5F);
/*      */     
/* 2028 */     this.ammoModel['ă'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2029 */     this.ammoModel['ă'].setRotationPoint(0.0F, -98.75F, 16.0F);
/*      */     
/* 2031 */     this.ammoModel['Ą'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2032 */     this.ammoModel['Ą'].setRotationPoint(0.0F, -89.75F, 16.0F);
/*      */     
/* 2034 */     this.ammoModel['ą'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2035 */     this.ammoModel['ą'].setRotationPoint(0.0F, -98.75F, 25.0F);
/*      */     
/* 2037 */     this.ammoModel['Ć'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2038 */     this.ammoModel['Ć'].setRotationPoint(0.0F, -89.75F, 25.0F);
/*      */     
/* 2040 */     this.ammoModel['ć'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2041 */     this.ammoModel['ć'].setRotationPoint(0.0F, -86.75F, 22.0F);
/*      */     
/* 2043 */     this.ammoModel['Ĉ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2044 */     this.ammoModel['Ĉ'].setRotationPoint(0.0F, -86.75F, 19.0F);
/*      */     
/* 2046 */     this.ammoModel['ĉ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2047 */     this.ammoModel['ĉ'].setRotationPoint(0.0F, -92.75F, 13.0F);
/*      */     
/* 2049 */     this.ammoModel['Ċ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2050 */     this.ammoModel['Ċ'].setRotationPoint(0.0F, -92.75F, 28.0F);
/*      */     
/* 2052 */     this.ammoModel['ċ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2053 */     this.ammoModel['ċ'].setRotationPoint(0.0F, -95.75F, 28.0F);
/*      */     
/* 2055 */     this.ammoModel['Č'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2056 */     this.ammoModel['Č'].setRotationPoint(0.0F, -101.75F, 22.0F);
/*      */     
/* 2058 */     this.ammoModel['č'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2059 */     this.ammoModel['č'].setRotationPoint(0.0F, -101.75F, 19.0F);
/*      */     
/* 2061 */     this.ammoModel['Ď'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2062 */     this.ammoModel['Ď'].setRotationPoint(0.0F, -95.75F, 13.0F);
/*      */     
/* 2064 */     this.ammoModel['ď'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2065 */     this.ammoModel['ď'].setRotationPoint(-1.0F, -101.25F, 19.0F);
/*      */     
/* 2067 */     this.ammoModel['Đ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2068 */     this.ammoModel['Đ'].setRotationPoint(-1.0F, -101.25F, 22.0F);
/*      */     
/* 2070 */     this.ammoModel['đ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2071 */     this.ammoModel['đ'].setRotationPoint(-1.0F, -95.75F, 13.5F);
/*      */     
/* 2073 */     this.ammoModel['Ē'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2074 */     this.ammoModel['Ē'].setRotationPoint(-1.0F, -92.75F, 13.5F);
/*      */     
/* 2076 */     this.ammoModel['ē'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2077 */     this.ammoModel['ē'].setRotationPoint(-1.0F, -87.25F, 19.0F);
/*      */     
/* 2079 */     this.ammoModel['Ĕ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2080 */     this.ammoModel['Ĕ'].setRotationPoint(-1.0F, -87.25F, 22.0F);
/*      */     
/* 2082 */     this.ammoModel['ĕ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2083 */     this.ammoModel['ĕ'].setRotationPoint(-1.0F, -92.75F, 27.5F);
/*      */     
/* 2085 */     this.ammoModel['Ė'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2086 */     this.ammoModel['Ė'].setRotationPoint(-1.0F, -95.75F, 27.5F);
/*      */     
/* 2088 */     this.ammoModel['ė'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 2089 */     this.ammoModel['ė'].setRotationPoint(-1.0F, -98.25F, 25.0F);
/*      */     
/* 2091 */     this.ammoModel['Ę'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 2092 */     this.ammoModel['Ę'].setRotationPoint(-1.0F, -89.75F, 25.0F);
/*      */     
/* 2094 */     this.ammoModel['ę'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2095 */     this.ammoModel['ę'].setRotationPoint(-1.0F, -98.25F, 17.0F);
/*      */     
/* 2097 */     this.ammoModel['Ě'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2098 */     this.ammoModel['Ě'].setRotationPoint(-1.0F, -89.75F, 17.0F);
/*      */     
/* 2100 */     this.ammoModel['ě'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2101 */     this.ammoModel['ě'].setRotationPoint(-2.0F, -102.25F, 19.0F);
/*      */     
/* 2103 */     this.ammoModel['Ĝ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2104 */     this.ammoModel['Ĝ'].setRotationPoint(-2.0F, -102.25F, 22.0F);
/*      */     
/* 2106 */     this.ammoModel['ĝ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2107 */     this.ammoModel['ĝ'].setRotationPoint(-2.0F, -95.75F, 12.5F);
/*      */     
/* 2109 */     this.ammoModel['Ğ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2110 */     this.ammoModel['Ğ'].setRotationPoint(-2.0F, -92.75F, 12.5F);
/*      */     
/* 2112 */     this.ammoModel['ğ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2113 */     this.ammoModel['ğ'].setRotationPoint(-2.0F, -86.25F, 19.0F);
/*      */     
/* 2115 */     this.ammoModel['Ġ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2116 */     this.ammoModel['Ġ'].setRotationPoint(-2.0F, -92.75F, 28.5F);
/*      */     
/* 2118 */     this.ammoModel['ġ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2119 */     this.ammoModel['ġ'].setRotationPoint(-2.0F, -95.75F, 28.5F);
/*      */     
/* 2121 */     this.ammoModel['Ģ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2122 */     this.ammoModel['Ģ'].setRotationPoint(-2.0F, -98.75F, 16.0F);
/*      */     
/* 2124 */     this.ammoModel['ģ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2125 */     this.ammoModel['ģ'].setRotationPoint(-2.0F, -95.75F, 16.0F);
/*      */     
/* 2127 */     this.ammoModel['Ĥ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2128 */     this.ammoModel['Ĥ'].setRotationPoint(-2.0F, -98.75F, 19.0F);
/*      */     
/* 2130 */     this.ammoModel['ĥ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F);
/* 2131 */     this.ammoModel['ĥ'].setRotationPoint(-2.0F, -95.75F, 25.0F);
/*      */     
/* 2133 */     this.ammoModel['Ħ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2134 */     this.ammoModel['Ħ'].setRotationPoint(-2.0F, -89.25F, 19.0F);
/*      */     
/* 2136 */     this.ammoModel['ħ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2137 */     this.ammoModel['ħ'].setRotationPoint(-2.0F, -95.75F, 19.0F);
/*      */     
/* 2139 */     this.ammoModel['Ĩ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2140 */     this.ammoModel['Ĩ'].setRotationPoint(35.0F, -98.75F, 16.0F);
/*      */     
/* 2142 */     this.ammoModel['ĩ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2143 */     this.ammoModel['ĩ'].setRotationPoint(35.0F, -89.75F, 16.0F);
/*      */     
/* 2145 */     this.ammoModel['Ī'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 2146 */     this.ammoModel['Ī'].setRotationPoint(35.0F, -98.75F, 25.0F);
/*      */     
/* 2148 */     this.ammoModel['ī'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F);
/* 2149 */     this.ammoModel['ī'].setRotationPoint(35.0F, -89.75F, 25.0F);
/*      */     
/* 2151 */     this.ammoModel['Ĭ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2152 */     this.ammoModel['Ĭ'].setRotationPoint(35.0F, -86.75F, 22.0F);
/*      */     
/* 2154 */     this.ammoModel['ĭ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2155 */     this.ammoModel['ĭ'].setRotationPoint(35.0F, -86.75F, 19.0F);
/*      */     
/* 2157 */     this.ammoModel['Į'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 2158 */     this.ammoModel['Į'].setRotationPoint(35.0F, -92.75F, 13.0F);
/*      */     
/* 2160 */     this.ammoModel['į'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F);
/* 2161 */     this.ammoModel['į'].setRotationPoint(35.0F, -92.75F, 28.0F);
/*      */     
/* 2163 */     this.ammoModel['İ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F);
/* 2164 */     this.ammoModel['İ'].setRotationPoint(35.0F, -95.75F, 28.0F);
/*      */     
/* 2166 */     this.ammoModel['ı'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2167 */     this.ammoModel['ı'].setRotationPoint(35.0F, -101.75F, 22.0F);
/*      */     
/* 2169 */     this.ammoModel['Ĳ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2170 */     this.ammoModel['Ĳ'].setRotationPoint(35.0F, -101.75F, 19.0F);
/*      */     
/* 2172 */     this.ammoModel['ĳ'].addShapeBox(59.0F, 10.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
/* 2173 */     this.ammoModel['ĳ'].setRotationPoint(35.0F, -95.75F, 13.0F);
/*      */     
/* 2175 */     this.ammoModel['Ĵ'].addShapeBox(59.0F, 10.0F, -3.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2176 */     this.ammoModel['Ĵ'].setRotationPoint(41.0F, -95.75F, 19.0F);
/*      */     
/* 2178 */     this.ammoModel['ĵ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2179 */     this.ammoModel['ĵ'].setRotationPoint(0.0F, -98.75F, -15.5F);
/*      */     
/* 2181 */     this.ammoModel['Ķ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2182 */     this.ammoModel['Ķ'].setRotationPoint(0.0F, -95.75F, -18.5F);
/*      */     
/* 2184 */     this.ammoModel['ķ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2185 */     this.ammoModel['ķ'].setRotationPoint(0.0F, -95.75F, -9.5F);
/*      */     
/* 2187 */     this.ammoModel['ĸ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2188 */     this.ammoModel['ĸ'].setRotationPoint(-1.0F, -95.75F, -15.5F);
/*      */     
/* 2190 */     this.ammoModel['Ĺ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2191 */     this.ammoModel['Ĺ'].setRotationPoint(0.0F, -90.25F, 2.5F);
/*      */     
/* 2193 */     this.ammoModel['ĺ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2194 */     this.ammoModel['ĺ'].setRotationPoint(0.0F, -87.25F, -0.5F);
/*      */     
/* 2196 */     this.ammoModel['Ļ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2197 */     this.ammoModel['Ļ'].setRotationPoint(0.0F, -87.25F, 8.5F);
/*      */     
/* 2199 */     this.ammoModel['ļ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2200 */     this.ammoModel['ļ'].setRotationPoint(-1.0F, -87.25F, 2.5F);
/*      */     
/* 2202 */     this.ammoModel['Ľ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2203 */     this.ammoModel['Ľ'].setRotationPoint(0.0F, -120.75F, 2.5F);
/*      */     
/* 2205 */     this.ammoModel['ľ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2206 */     this.ammoModel['ľ'].setRotationPoint(0.0F, -117.75F, -0.5F);
/*      */     
/* 2208 */     this.ammoModel['Ŀ'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2209 */     this.ammoModel['Ŀ'].setRotationPoint(0.0F, -117.75F, 8.5F);
/*      */     
/* 2211 */     this.ammoModel['ŀ'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2212 */     this.ammoModel['ŀ'].setRotationPoint(-1.0F, -117.75F, 2.5F);
/*      */     
/* 2214 */     this.ammoModel['Ł'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2215 */     this.ammoModel['Ł'].setRotationPoint(0.0F, -113.75F, 21.5F);
/*      */     
/* 2217 */     this.ammoModel['ł'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2218 */     this.ammoModel['ł'].setRotationPoint(0.0F, -110.75F, 18.5F);
/*      */     
/* 2220 */     this.ammoModel['Ń'].addShapeBox(59.0F, 10.0F, -3.0F, 35, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2221 */     this.ammoModel['Ń'].setRotationPoint(0.0F, -110.75F, 27.5F);
/*      */     
/* 2223 */     this.ammoModel['ń'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2224 */     this.ammoModel['ń'].setRotationPoint(-1.0F, -110.75F, 21.5F);
/*      */   }
/*      */   
/*      */   private void initrevolverBarrelModel_1()
/*      */   {
/* 2229 */     this.revolverBarrelModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 2230 */     this.revolverBarrelModel[1] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/* 2231 */     this.revolverBarrelModel[2] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/* 2232 */     this.revolverBarrelModel[3] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/* 2233 */     this.revolverBarrelModel[4] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/* 2234 */     this.revolverBarrelModel[5] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 2235 */     this.revolverBarrelModel[6] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/* 2236 */     this.revolverBarrelModel[7] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/* 2237 */     this.revolverBarrelModel[8] = new ModelRendererTurbo(this, 769, 1, this.textureX, this.textureY);
/* 2238 */     this.revolverBarrelModel[9] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/* 2239 */     this.revolverBarrelModel[10] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/* 2240 */     this.revolverBarrelModel[11] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/* 2241 */     this.revolverBarrelModel[12] = new ModelRendererTurbo(this, 1153, 1, this.textureX, this.textureY);
/* 2242 */     this.revolverBarrelModel[13] = new ModelRendererTurbo(this, 1249, 1, this.textureX, this.textureY);
/* 2243 */     this.revolverBarrelModel[14] = new ModelRendererTurbo(this, 1353, 1, this.textureX, this.textureY);
/* 2244 */     this.revolverBarrelModel[15] = new ModelRendererTurbo(this, 1449, 1, this.textureX, this.textureY);
/* 2245 */     this.revolverBarrelModel[16] = new ModelRendererTurbo(this, 1545, 1, this.textureX, this.textureY);
/* 2246 */     this.revolverBarrelModel[17] = new ModelRendererTurbo(this, 1641, 1, this.textureX, this.textureY);
/* 2247 */     this.revolverBarrelModel[18] = new ModelRendererTurbo(this, 1737, 1, this.textureX, this.textureY);
/* 2248 */     this.revolverBarrelModel[19] = new ModelRendererTurbo(this, 1833, 1, this.textureX, this.textureY);
/* 2249 */     this.revolverBarrelModel[20] = new ModelRendererTurbo(this, 1929, 1, this.textureX, this.textureY);
/* 2250 */     this.revolverBarrelModel[21] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 2251 */     this.revolverBarrelModel[22] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/* 2252 */     this.revolverBarrelModel[23] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 2253 */     this.revolverBarrelModel[24] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/* 2254 */     this.revolverBarrelModel[25] = new ModelRendererTurbo(this, 577, 9, this.textureX, this.textureY);
/* 2255 */     this.revolverBarrelModel[26] = new ModelRendererTurbo(this, 673, 9, this.textureX, this.textureY);
/* 2256 */     this.revolverBarrelModel[27] = new ModelRendererTurbo(this, 745, 9, this.textureX, this.textureY);
/* 2257 */     this.revolverBarrelModel[28] = new ModelRendererTurbo(this, 865, 9, this.textureX, this.textureY);
/* 2258 */     this.revolverBarrelModel[29] = new ModelRendererTurbo(this, 977, 9, this.textureX, this.textureY);
/* 2259 */     this.revolverBarrelModel[30] = new ModelRendererTurbo(this, 1081, 9, this.textureX, this.textureY);
/* 2260 */     this.revolverBarrelModel[31] = new ModelRendererTurbo(this, 1353, 9, this.textureX, this.textureY);
/* 2261 */     this.revolverBarrelModel[32] = new ModelRendererTurbo(this, 1449, 9, this.textureX, this.textureY);
/* 2262 */     this.revolverBarrelModel[33] = new ModelRendererTurbo(this, 1545, 9, this.textureX, this.textureY);
/* 2263 */     this.revolverBarrelModel[34] = new ModelRendererTurbo(this, 1641, 9, this.textureX, this.textureY);
/* 2264 */     this.revolverBarrelModel[35] = new ModelRendererTurbo(this, 1737, 9, this.textureX, this.textureY);
/* 2265 */     this.revolverBarrelModel[36] = new ModelRendererTurbo(this, 1833, 9, this.textureX, this.textureY);
/* 2266 */     this.revolverBarrelModel[37] = new ModelRendererTurbo(this, 1929, 9, this.textureX, this.textureY);
/* 2267 */     this.revolverBarrelModel[38] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/* 2268 */     this.revolverBarrelModel[39] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/* 2269 */     this.revolverBarrelModel[40] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 2270 */     this.revolverBarrelModel[41] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/* 2271 */     this.revolverBarrelModel[42] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 2272 */     this.revolverBarrelModel[43] = new ModelRendererTurbo(this, 577, 17, this.textureX, this.textureY);
/* 2273 */     this.revolverBarrelModel[44] = new ModelRendererTurbo(this, 673, 17, this.textureX, this.textureY);
/* 2274 */     this.revolverBarrelModel[45] = new ModelRendererTurbo(this, 1081, 17, this.textureX, this.textureY);
/* 2275 */     this.revolverBarrelModel[46] = new ModelRendererTurbo(this, 1177, 17, this.textureX, this.textureY);
/* 2276 */     this.revolverBarrelModel[47] = new ModelRendererTurbo(this, 1273, 17, this.textureX, this.textureY);
/* 2277 */     this.revolverBarrelModel[48] = new ModelRendererTurbo(this, 1369, 17, this.textureX, this.textureY);
/* 2278 */     this.revolverBarrelModel[49] = new ModelRendererTurbo(this, 1465, 17, this.textureX, this.textureY);
/* 2279 */     this.revolverBarrelModel[50] = new ModelRendererTurbo(this, 1561, 17, this.textureX, this.textureY);
/* 2280 */     this.revolverBarrelModel[51] = new ModelRendererTurbo(this, 1657, 17, this.textureX, this.textureY);
/* 2281 */     this.revolverBarrelModel[52] = new ModelRendererTurbo(this, 1753, 17, this.textureX, this.textureY);
/* 2282 */     this.revolverBarrelModel[53] = new ModelRendererTurbo(this, 1857, 17, this.textureX, this.textureY);
/* 2283 */     this.revolverBarrelModel[54] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 2284 */     this.revolverBarrelModel[55] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 2285 */     this.revolverBarrelModel[56] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/* 2286 */     this.revolverBarrelModel[57] = new ModelRendererTurbo(this, 1953, 17, this.textureX, this.textureY);
/* 2287 */     this.revolverBarrelModel[58] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/* 2288 */     this.revolverBarrelModel[59] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/* 2289 */     this.revolverBarrelModel[60] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/* 2290 */     this.revolverBarrelModel[61] = new ModelRendererTurbo(this, 577, 25, this.textureX, this.textureY);
/* 2291 */     this.revolverBarrelModel[62] = new ModelRendererTurbo(this, 969, 25, this.textureX, this.textureY);
/* 2292 */     this.revolverBarrelModel[63] = new ModelRendererTurbo(this, 1089, 25, this.textureX, this.textureY);
/* 2293 */     this.revolverBarrelModel[64] = new ModelRendererTurbo(this, 1201, 25, this.textureX, this.textureY);
/* 2294 */     this.revolverBarrelModel[65] = new ModelRendererTurbo(this, 673, 25, this.textureX, this.textureY);
/* 2295 */     this.revolverBarrelModel[66] = new ModelRendererTurbo(this, 1305, 25, this.textureX, this.textureY);
/* 2296 */     this.revolverBarrelModel[67] = new ModelRendererTurbo(this, 1401, 25, this.textureX, this.textureY);
/* 2297 */     this.revolverBarrelModel[68] = new ModelRendererTurbo(this, 1497, 25, this.textureX, this.textureY);
/* 2298 */     this.revolverBarrelModel[69] = new ModelRendererTurbo(this, 1593, 25, this.textureX, this.textureY);
/* 2299 */     this.revolverBarrelModel[70] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 2300 */     this.revolverBarrelModel[71] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/* 2301 */     this.revolverBarrelModel[72] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/* 2302 */     this.revolverBarrelModel[73] = new ModelRendererTurbo(this, 289, 33, this.textureX, this.textureY);
/* 2303 */     this.revolverBarrelModel[74] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/* 2304 */     this.revolverBarrelModel[75] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/* 2305 */     this.revolverBarrelModel[76] = new ModelRendererTurbo(this, 585, 33, this.textureX, this.textureY);
/* 2306 */     this.revolverBarrelModel[77] = new ModelRendererTurbo(this, 889, 33, this.textureX, this.textureY);
/* 2307 */     this.revolverBarrelModel[78] = new ModelRendererTurbo(this, 1305, 33, this.textureX, this.textureY);
/* 2308 */     this.revolverBarrelModel[79] = new ModelRendererTurbo(this, 1401, 33, this.textureX, this.textureY);
/* 2309 */     this.revolverBarrelModel[80] = new ModelRendererTurbo(this, 1497, 33, this.textureX, this.textureY);
/* 2310 */     this.revolverBarrelModel[81] = new ModelRendererTurbo(this, 1577, 33, this.textureX, this.textureY);
/* 2311 */     this.revolverBarrelModel[82] = new ModelRendererTurbo(this, 1689, 33, this.textureX, this.textureY);
/* 2312 */     this.revolverBarrelModel[83] = new ModelRendererTurbo(this, 1785, 33, this.textureX, this.textureY);
/* 2313 */     this.revolverBarrelModel[84] = new ModelRendererTurbo(this, 1881, 33, this.textureX, this.textureY);
/* 2314 */     this.revolverBarrelModel[85] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 2315 */     this.revolverBarrelModel[86] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/* 2316 */     this.revolverBarrelModel[87] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/* 2317 */     this.revolverBarrelModel[88] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/* 2318 */     this.revolverBarrelModel[89] = new ModelRendererTurbo(this, 593, 41, this.textureX, this.textureY);
/* 2319 */     this.revolverBarrelModel[90] = new ModelRendererTurbo(this, 689, 41, this.textureX, this.textureY);
/* 2320 */     this.revolverBarrelModel[91] = new ModelRendererTurbo(this, 793, 41, this.textureX, this.textureY);
/* 2321 */     this.revolverBarrelModel[92] = new ModelRendererTurbo(this, 1097, 41, this.textureX, this.textureY);
/* 2322 */     this.revolverBarrelModel[93] = new ModelRendererTurbo(this, 1201, 41, this.textureX, this.textureY);
/* 2323 */     this.revolverBarrelModel[94] = new ModelRendererTurbo(this, 1313, 41, this.textureX, this.textureY);
/* 2324 */     this.revolverBarrelModel[95] = new ModelRendererTurbo(this, 1417, 41, this.textureX, this.textureY);
/* 2325 */     this.revolverBarrelModel[96] = new ModelRendererTurbo(this, 897, 41, this.textureX, this.textureY);
/* 2326 */     this.revolverBarrelModel[97] = new ModelRendererTurbo(this, 1689, 41, this.textureX, this.textureY);
/* 2327 */     this.revolverBarrelModel[98] = new ModelRendererTurbo(this, 1785, 41, this.textureX, this.textureY);
/* 2328 */     this.revolverBarrelModel[99] = new ModelRendererTurbo(this, 1881, 41, this.textureX, this.textureY);
/* 2329 */     this.revolverBarrelModel[100] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 2330 */     this.revolverBarrelModel[101] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/* 2331 */     this.revolverBarrelModel[102] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/* 2332 */     this.revolverBarrelModel[103] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/* 2333 */     this.revolverBarrelModel[104] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/* 2334 */     this.revolverBarrelModel[105] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 2335 */     this.revolverBarrelModel[106] = new ModelRendererTurbo(this, 585, 49, this.textureX, this.textureY);
/* 2336 */     this.revolverBarrelModel[107] = new ModelRendererTurbo(this, 681, 49, this.textureX, this.textureY);
/* 2337 */     this.revolverBarrelModel[108] = new ModelRendererTurbo(this, 1409, 49, this.textureX, this.textureY);
/* 2338 */     this.revolverBarrelModel[109] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 2339 */     this.revolverBarrelModel[110] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/* 2340 */     this.revolverBarrelModel[111] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 2341 */     this.revolverBarrelModel[112] = new ModelRendererTurbo(this, 577, 57, this.textureX, this.textureY);
/* 2342 */     this.revolverBarrelModel[113] = new ModelRendererTurbo(this, 673, 57, this.textureX, this.textureY);
/* 2343 */     this.revolverBarrelModel[114] = new ModelRendererTurbo(this, 769, 57, this.textureX, this.textureY);
/* 2344 */     this.revolverBarrelModel[115] = new ModelRendererTurbo(this, 865, 57, this.textureX, this.textureY);
/* 2345 */     this.revolverBarrelModel[116] = new ModelRendererTurbo(this, 1785, 49, this.textureX, this.textureY);
/* 2346 */     this.revolverBarrelModel[117] = new ModelRendererTurbo(this, 961, 57, this.textureX, this.textureY);
/* 2347 */     this.revolverBarrelModel[118] = new ModelRendererTurbo(this, 1065, 57, this.textureX, this.textureY);
/* 2348 */     this.revolverBarrelModel[119] = new ModelRendererTurbo(this, 1169, 57, this.textureX, this.textureY);
/* 2349 */     this.revolverBarrelModel[120] = new ModelRendererTurbo(this, 1265, 57, this.textureX, this.textureY);
/* 2350 */     this.revolverBarrelModel[121] = new ModelRendererTurbo(this, 1873, 57, this.textureX, this.textureY);
/* 2351 */     this.revolverBarrelModel[122] = new ModelRendererTurbo(this, 185, 65, this.textureX, this.textureY);
/* 2352 */     this.revolverBarrelModel[123] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/* 2353 */     this.revolverBarrelModel[124] = new ModelRendererTurbo(this, 761, 65, this.textureX, this.textureY);
/* 2354 */     this.revolverBarrelModel[125] = new ModelRendererTurbo(this, 865, 65, this.textureX, this.textureY);
/* 2355 */     this.revolverBarrelModel[126] = new ModelRendererTurbo(this, 1057, 65, this.textureX, this.textureY);
/* 2356 */     this.revolverBarrelModel[127] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/* 2357 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1257, 65, this.textureX, this.textureY);
/* 2358 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1369, 65, this.textureX, this.textureY);
/* 2359 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1473, 65, this.textureX, this.textureY);
/* 2360 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1569, 65, this.textureX, this.textureY);
/* 2361 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1673, 65, this.textureX, this.textureY);
/* 2362 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1777, 65, this.textureX, this.textureY);
/* 2363 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 2364 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/* 2365 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 593, 73, this.textureX, this.textureY);
/* 2366 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1161, 73, this.textureX, this.textureY);
/* 2367 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1473, 73, this.textureX, this.textureY);
/* 2368 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1569, 73, this.textureX, this.textureY);
/* 2369 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1665, 73, this.textureX, this.textureY);
/* 2370 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1761, 73, this.textureX, this.textureY);
/* 2371 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 2372 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/* 2373 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/* 2374 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1977, 25, this.textureX, this.textureY);
/* 2375 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 513, 81, this.textureX, this.textureY);
/* 2376 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 609, 81, this.textureX, this.textureY);
/* 2377 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 705, 81, this.textureX, this.textureY);
/* 2378 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 801, 81, this.textureX, this.textureY);
/* 2379 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 2380 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 897, 81, this.textureX, this.textureY);
/* 2381 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 993, 81, this.textureX, this.textureY);
/* 2382 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1177, 9, this.textureX, this.textureY);
/* 2383 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1257, 81, this.textureX, this.textureY);
/* 2384 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1353, 81, this.textureX, this.textureY);
/* 2385 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1441, 81, this.textureX, this.textureY);
/* 2386 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 1873, 81, this.textureX, this.textureY);
/* 2387 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/* 2388 */     this.revolverBarrelModel[''] = new ModelRendererTurbo(this, 521, 89, this.textureX, this.textureY);
/* 2389 */     this.revolverBarrelModel[' '] = new ModelRendererTurbo(this, 617, 89, this.textureX, this.textureY);
/* 2390 */     this.revolverBarrelModel['¡'] = new ModelRendererTurbo(this, 705, 89, this.textureX, this.textureY);
/* 2391 */     this.revolverBarrelModel['¢'] = new ModelRendererTurbo(this, 817, 89, this.textureX, this.textureY);
/* 2392 */     this.revolverBarrelModel['£'] = new ModelRendererTurbo(this, 1689, 25, this.textureX, this.textureY);
/* 2393 */     this.revolverBarrelModel['¤'] = new ModelRendererTurbo(this, 1513, 41, this.textureX, this.textureY);
/* 2394 */     this.revolverBarrelModel['¥'] = new ModelRendererTurbo(this, 1977, 49, this.textureX, this.textureY);
/* 2395 */     this.revolverBarrelModel['¦'] = new ModelRendererTurbo(this, 681, 33, this.textureX, this.textureY);
/* 2396 */     this.revolverBarrelModel['§'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 2397 */     this.revolverBarrelModel['¨'] = new ModelRendererTurbo(this, 1985, 41, this.textureX, this.textureY);
/* 2398 */     this.revolverBarrelModel['©'] = new ModelRendererTurbo(this, 889, 49, this.textureX, this.textureY);
/* 2399 */     this.revolverBarrelModel['ª'] = new ModelRendererTurbo(this, 1985, 73, this.textureX, this.textureY);
/* 2400 */     this.revolverBarrelModel['«'] = new ModelRendererTurbo(this, 1081, 81, this.textureX, this.textureY);
/* 2401 */     this.revolverBarrelModel['¬'] = new ModelRendererTurbo(this, 1361, 57, this.textureX, this.textureY);
/* 2402 */     this.revolverBarrelModel['­'] = new ModelRendererTurbo(this, 1505, 57, this.textureX, this.textureY);
/* 2403 */     this.revolverBarrelModel['®'] = new ModelRendererTurbo(this, 1153, 89, this.textureX, this.textureY);
/* 2404 */     this.revolverBarrelModel['¯'] = new ModelRendererTurbo(this, 1241, 89, this.textureX, this.textureY);
/* 2405 */     this.revolverBarrelModel['°'] = new ModelRendererTurbo(this, 1345, 89, this.textureX, this.textureY);
/* 2406 */     this.revolverBarrelModel['±'] = new ModelRendererTurbo(this, 1985, 89, this.textureX, this.textureY);
/* 2407 */     this.revolverBarrelModel['²'] = new ModelRendererTurbo(this, 521, 97, this.textureX, this.textureY);
/* 2408 */     this.revolverBarrelModel['³'] = new ModelRendererTurbo(this, 1761, 97, this.textureX, this.textureY);
/* 2409 */     this.revolverBarrelModel['´'] = new ModelRendererTurbo(this, 849, 137, this.textureX, this.textureY);
/* 2410 */     this.revolverBarrelModel['µ'] = new ModelRendererTurbo(this, 409, 145, this.textureX, this.textureY);
/* 2411 */     this.revolverBarrelModel['¶'] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/* 2412 */     this.revolverBarrelModel['·'] = new ModelRendererTurbo(this, 529, 145, this.textureX, this.textureY);
/* 2413 */     this.revolverBarrelModel['¸'] = new ModelRendererTurbo(this, 577, 145, this.textureX, this.textureY);
/* 2414 */     this.revolverBarrelModel['¹'] = new ModelRendererTurbo(this, 681, 145, this.textureX, this.textureY);
/* 2415 */     this.revolverBarrelModel['º'] = new ModelRendererTurbo(this, 745, 145, this.textureX, this.textureY);
/* 2416 */     this.revolverBarrelModel['»'] = new ModelRendererTurbo(this, 801, 145, this.textureX, this.textureY);
/* 2417 */     this.revolverBarrelModel['¼'] = new ModelRendererTurbo(this, 969, 145, this.textureX, this.textureY);
/* 2418 */     this.revolverBarrelModel['½'] = new ModelRendererTurbo(this, 1033, 145, this.textureX, this.textureY);
/* 2419 */     this.revolverBarrelModel['¾'] = new ModelRendererTurbo(this, 1097, 145, this.textureX, this.textureY);
/* 2420 */     this.revolverBarrelModel['¿'] = new ModelRendererTurbo(this, 1185, 145, this.textureX, this.textureY);
/* 2421 */     this.revolverBarrelModel['À'] = new ModelRendererTurbo(this, 801, 153, this.textureX, this.textureY);
/* 2422 */     this.revolverBarrelModel['Á'] = new ModelRendererTurbo(this, 1321, 145, this.textureX, this.textureY);
/* 2423 */     this.revolverBarrelModel['Â'] = new ModelRendererTurbo(this, 865, 153, this.textureX, this.textureY);
/* 2424 */     this.revolverBarrelModel['Ã'] = new ModelRendererTurbo(this, 1105, 153, this.textureX, this.textureY);
/* 2425 */     this.revolverBarrelModel['Ä'] = new ModelRendererTurbo(this, 1249, 145, this.textureX, this.textureY);
/* 2426 */     this.revolverBarrelModel['Å'] = new ModelRendererTurbo(this, 1097, 145, this.textureX, this.textureY);
/* 2427 */     this.revolverBarrelModel['Æ'] = new ModelRendererTurbo(this, 1153, 89, this.textureX, this.textureY);
/* 2428 */     this.revolverBarrelModel['Ç'] = new ModelRendererTurbo(this, 1153, 89, this.textureX, this.textureY);
/*      */     
/* 2430 */     this.revolverBarrelModel[0].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2431 */     this.revolverBarrelModel[0].setRotationPoint(-1.0F, -90.75F, -0.5F);
/*      */     
/* 2433 */     this.revolverBarrelModel[1].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2434 */     this.revolverBarrelModel[1].setRotationPoint(-1.0F, -91.5F, 2.5F);
/*      */     
/* 2436 */     this.revolverBarrelModel[2].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2437 */     this.revolverBarrelModel[2].setRotationPoint(-1.0F, -91.5F, 5.5F);
/*      */     
/* 2439 */     this.revolverBarrelModel[3].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2440 */     this.revolverBarrelModel[3].setRotationPoint(-1.0F, -90.75F, 8.5F);
/*      */     
/* 2442 */     this.revolverBarrelModel[4].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2443 */     this.revolverBarrelModel[4].setRotationPoint(-1.0F, -87.75F, 9.25F);
/*      */     
/* 2445 */     this.revolverBarrelModel[5].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2446 */     this.revolverBarrelModel[5].setRotationPoint(-1.0F, -84.75F, 9.25F);
/*      */     
/* 2448 */     this.revolverBarrelModel[6].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2449 */     this.revolverBarrelModel[6].setRotationPoint(-1.0F, -81.75F, 8.5F);
/*      */     
/* 2451 */     this.revolverBarrelModel[7].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2452 */     this.revolverBarrelModel[7].setRotationPoint(-1.0F, -81.0F, 5.5F);
/*      */     
/* 2454 */     this.revolverBarrelModel[8].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2455 */     this.revolverBarrelModel[8].setRotationPoint(-1.0F, -81.0F, 2.5F);
/*      */     
/* 2457 */     this.revolverBarrelModel[9].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2458 */     this.revolverBarrelModel[9].setRotationPoint(-1.0F, -81.75F, -0.5F);
/*      */     
/* 2460 */     this.revolverBarrelModel[10].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2461 */     this.revolverBarrelModel[10].setRotationPoint(-1.0F, -84.75F, -1.25F);
/*      */     
/* 2463 */     this.revolverBarrelModel[11].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2464 */     this.revolverBarrelModel[11].setRotationPoint(-1.0F, -87.75F, -1.25F);
/*      */     
/* 2466 */     this.revolverBarrelModel[12].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2467 */     this.revolverBarrelModel[12].setRotationPoint(-1.0F, -95.75F, 15.25F);
/*      */     
/* 2469 */     this.revolverBarrelModel[13].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 6, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2470 */     this.revolverBarrelModel[13].setRotationPoint(-1.0F, -92.75F, 12.25F);
/*      */     
/* 2472 */     this.revolverBarrelModel[14].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2473 */     this.revolverBarrelModel[14].setRotationPoint(-1.0F, -89.75F, 16.0F);
/*      */     
/* 2475 */     this.revolverBarrelModel[15].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2476 */     this.revolverBarrelModel[15].setRotationPoint(-1.0F, -89.0F, 19.0F);
/*      */     
/* 2478 */     this.revolverBarrelModel[16].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2479 */     this.revolverBarrelModel[16].setRotationPoint(-1.0F, -89.0F, 22.0F);
/*      */     
/* 2481 */     this.revolverBarrelModel[17].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2482 */     this.revolverBarrelModel[17].setRotationPoint(-1.0F, -89.75F, 25.0F);
/*      */     
/* 2484 */     this.revolverBarrelModel[18].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2485 */     this.revolverBarrelModel[18].setRotationPoint(-1.0F, -92.75F, 25.75F);
/*      */     
/* 2487 */     this.revolverBarrelModel[19].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2488 */     this.revolverBarrelModel[19].setRotationPoint(-1.0F, -95.75F, 25.75F);
/*      */     
/* 2490 */     this.revolverBarrelModel[20].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2491 */     this.revolverBarrelModel[20].setRotationPoint(-1.0F, -98.75F, 25.0F);
/*      */     
/* 2493 */     this.revolverBarrelModel[21].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2494 */     this.revolverBarrelModel[21].setRotationPoint(-1.0F, -99.5F, 22.0F);
/*      */     
/* 2496 */     this.revolverBarrelModel[22].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2497 */     this.revolverBarrelModel[22].setRotationPoint(-1.0F, -99.5F, 19.0F);
/*      */     
/* 2499 */     this.revolverBarrelModel[23].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2500 */     this.revolverBarrelModel[23].setRotationPoint(-1.0F, -98.75F, 16.0F);
/*      */     
/* 2502 */     this.revolverBarrelModel[24].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2503 */     this.revolverBarrelModel[24].setRotationPoint(-1.0F, -104.75F, -18.5F);
/*      */     
/* 2505 */     this.revolverBarrelModel[25].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2506 */     this.revolverBarrelModel[25].setRotationPoint(-1.0F, -104.0F, -15.5F);
/*      */     
/* 2508 */     this.revolverBarrelModel[26].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2509 */     this.revolverBarrelModel[26].setRotationPoint(-1.0F, -104.0F, -12.5F);
/*      */     
/* 2511 */     this.revolverBarrelModel[27].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 25, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2512 */     this.revolverBarrelModel[27].setRotationPoint(-1.0F, -104.75F, -9.5F);
/*      */     
/* 2514 */     this.revolverBarrelModel[28].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 20, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2515 */     this.revolverBarrelModel[28].setRotationPoint(-1.0F, -107.75F, -8.75F);
/*      */     
/* 2517 */     this.revolverBarrelModel[29].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 6, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2518 */     this.revolverBarrelModel[29].setRotationPoint(-1.0F, -110.75F, -8.75F);
/*      */     
/* 2520 */     this.revolverBarrelModel[30].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2521 */     this.revolverBarrelModel[30].setRotationPoint(-1.0F, -113.75F, -9.5F);
/*      */     
/* 2523 */     this.revolverBarrelModel[31].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2524 */     this.revolverBarrelModel[31].setRotationPoint(-1.0F, -114.5F, -12.5F);
/*      */     
/* 2526 */     this.revolverBarrelModel[32].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2527 */     this.revolverBarrelModel[32].setRotationPoint(-1.0F, -114.5F, -15.5F);
/*      */     
/* 2529 */     this.revolverBarrelModel[33].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2530 */     this.revolverBarrelModel[33].setRotationPoint(-1.0F, -113.75F, -18.5F);
/*      */     
/* 2532 */     this.revolverBarrelModel[34].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2533 */     this.revolverBarrelModel[34].setRotationPoint(-1.0F, -117.75F, -1.25F);
/*      */     
/* 2535 */     this.revolverBarrelModel[35].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2536 */     this.revolverBarrelModel[35].setRotationPoint(-1.0F, -114.75F, -1.25F);
/*      */     
/* 2538 */     this.revolverBarrelModel[36].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2539 */     this.revolverBarrelModel[36].setRotationPoint(-1.0F, -111.75F, -0.5F);
/*      */     
/* 2541 */     this.revolverBarrelModel[37].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2542 */     this.revolverBarrelModel[37].setRotationPoint(-1.0F, -111.0F, 2.5F);
/*      */     
/* 2544 */     this.revolverBarrelModel[38].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2545 */     this.revolverBarrelModel[38].setRotationPoint(-1.0F, -111.0F, 5.5F);
/*      */     
/* 2547 */     this.revolverBarrelModel[39].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2548 */     this.revolverBarrelModel[39].setRotationPoint(-1.0F, -111.75F, 8.5F);
/*      */     
/* 2550 */     this.revolverBarrelModel[40].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2551 */     this.revolverBarrelModel[40].setRotationPoint(-1.0F, -114.75F, 9.25F);
/*      */     
/* 2553 */     this.revolverBarrelModel[41].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2554 */     this.revolverBarrelModel[41].setRotationPoint(-1.0F, -117.75F, 9.25F);
/*      */     
/* 2556 */     this.revolverBarrelModel[42].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2557 */     this.revolverBarrelModel[42].setRotationPoint(-1.0F, -120.75F, 8.5F);
/*      */     
/* 2559 */     this.revolverBarrelModel[43].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2560 */     this.revolverBarrelModel[43].setRotationPoint(-1.0F, -121.5F, 2.5F);
/*      */     
/* 2562 */     this.revolverBarrelModel[44].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2563 */     this.revolverBarrelModel[44].setRotationPoint(-1.0F, -120.75F, -0.5F);
/*      */     
/* 2565 */     this.revolverBarrelModel[45].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2566 */     this.revolverBarrelModel[45].setRotationPoint(-1.0F, -113.75F, 25.0F);
/*      */     
/* 2568 */     this.revolverBarrelModel[46].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2569 */     this.revolverBarrelModel[46].setRotationPoint(-1.0F, -110.75F, 25.75F);
/*      */     
/* 2571 */     this.revolverBarrelModel[47].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2572 */     this.revolverBarrelModel[47].setRotationPoint(-1.0F, -107.75F, 25.75F);
/*      */     
/* 2574 */     this.revolverBarrelModel[48].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2575 */     this.revolverBarrelModel[48].setRotationPoint(-1.0F, -104.75F, 25.0F);
/*      */     
/* 2577 */     this.revolverBarrelModel[49].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2578 */     this.revolverBarrelModel[49].setRotationPoint(-1.0F, -104.0F, 22.0F);
/*      */     
/* 2580 */     this.revolverBarrelModel[50].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2581 */     this.revolverBarrelModel[50].setRotationPoint(-1.0F, -104.0F, 19.0F);
/*      */     
/* 2583 */     this.revolverBarrelModel[51].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2584 */     this.revolverBarrelModel[51].setRotationPoint(-1.0F, -104.75F, 16.0F);
/*      */     
/* 2586 */     this.revolverBarrelModel[52].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2587 */     this.revolverBarrelModel[52].setRotationPoint(-1.0F, -107.75F, 12.25F);
/*      */     
/* 2589 */     this.revolverBarrelModel[53].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2590 */     this.revolverBarrelModel[53].setRotationPoint(-1.0F, -110.75F, 12.25F);
/*      */     
/* 2592 */     this.revolverBarrelModel[54].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2593 */     this.revolverBarrelModel[54].setRotationPoint(-1.0F, -113.75F, 16.0F);
/*      */     
/* 2595 */     this.revolverBarrelModel[55].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2596 */     this.revolverBarrelModel[55].setRotationPoint(-1.0F, -114.5F, 19.0F);
/*      */     
/* 2598 */     this.revolverBarrelModel[56].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2599 */     this.revolverBarrelModel[56].setRotationPoint(-1.0F, -114.5F, 22.0F);
/*      */     
/* 2601 */     this.revolverBarrelModel[57].addBox(59.0F, 10.0F, -3.0F, 44, 1, 3, 0.0F);
/* 2602 */     this.revolverBarrelModel[57].setRotationPoint(-1.0F, -108.75F, -0.5F);
/*      */     
/* 2604 */     this.revolverBarrelModel[58].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2605 */     this.revolverBarrelModel[58].setRotationPoint(-1.0F, -111.75F, -1.5F);
/*      */     
/* 2607 */     this.revolverBarrelModel[59].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2608 */     this.revolverBarrelModel[59].setRotationPoint(-1.0F, -111.75F, 11.25F);
/*      */     
/* 2610 */     this.revolverBarrelModel[60].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2611 */     this.revolverBarrelModel[60].setRotationPoint(-1.0F, -108.75F, 9.0F);
/*      */     
/* 2613 */     this.revolverBarrelModel[61].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2614 */     this.revolverBarrelModel[61].setRotationPoint(-1.0F, -108.75F, 2.5F);
/*      */     
/* 2616 */     this.revolverBarrelModel[62].addBox(59.0F, 10.0F, -3.0F, 44, 3, 26, 0.0F);
/* 2617 */     this.revolverBarrelModel[62].setRotationPoint(-1.0F, -101.75F, -7.0F);
/*      */     
/* 2619 */     this.revolverBarrelModel[63].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2620 */     this.revolverBarrelModel[63].setRotationPoint(-1.0F, -100.75F, -18.5F);
/*      */     
/* 2622 */     this.revolverBarrelModel[64].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2623 */     this.revolverBarrelModel[64].setRotationPoint(-1.0F, -100.75F, 19.0F);
/*      */     
/* 2625 */     this.revolverBarrelModel[65].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2626 */     this.revolverBarrelModel[65].setRotationPoint(-1.0F, -101.75F, 25.0F);
/*      */     
/* 2628 */     this.revolverBarrelModel[66].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2629 */     this.revolverBarrelModel[66].setRotationPoint(-1.0F, -101.75F, -18.5F);
/*      */     
/* 2631 */     this.revolverBarrelModel[67].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2632 */     this.revolverBarrelModel[67].setRotationPoint(-1.0F, -99.5F, 25.0F);
/*      */     
/* 2634 */     this.revolverBarrelModel[68].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2635 */     this.revolverBarrelModel[68].setRotationPoint(-1.0F, -99.5F, -18.5F);
/*      */     
/* 2637 */     this.revolverBarrelModel[69].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2638 */     this.revolverBarrelModel[69].setRotationPoint(-1.0F, -98.75F, -18.5F);
/*      */     
/* 2640 */     this.revolverBarrelModel[70].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2641 */     this.revolverBarrelModel[70].setRotationPoint(-1.0F, -99.5F, -15.5F);
/*      */     
/* 2643 */     this.revolverBarrelModel[71].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F);
/* 2644 */     this.revolverBarrelModel[71].setRotationPoint(-1.0F, -99.5F, -12.5F);
/*      */     
/* 2646 */     this.revolverBarrelModel[72].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2647 */     this.revolverBarrelModel[72].setRotationPoint(-1.0F, -98.75F, -9.5F);
/*      */     
/* 2649 */     this.revolverBarrelModel[73].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2650 */     this.revolverBarrelModel[73].setRotationPoint(-1.0F, -95.75F, -8.75F);
/*      */     
/* 2652 */     this.revolverBarrelModel[74].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 6, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2653 */     this.revolverBarrelModel[74].setRotationPoint(-1.0F, -92.75F, -8.75F);
/*      */     
/* 2655 */     this.revolverBarrelModel[75].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2656 */     this.revolverBarrelModel[75].setRotationPoint(-1.0F, -89.75F, -9.5F);
/*      */     
/* 2658 */     this.revolverBarrelModel[76].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2659 */     this.revolverBarrelModel[76].setRotationPoint(-1.0F, -89.0F, -12.5F);
/*      */     
/* 2661 */     this.revolverBarrelModel[77].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2662 */     this.revolverBarrelModel[77].setRotationPoint(-1.0F, -89.0F, -15.5F);
/*      */     
/* 2664 */     this.revolverBarrelModel[78].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2665 */     this.revolverBarrelModel[78].setRotationPoint(-1.0F, -89.75F, -18.5F);
/*      */     
/* 2667 */     this.revolverBarrelModel[79].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2668 */     this.revolverBarrelModel[79].setRotationPoint(-1.0F, -92.75F, -19.25F);
/*      */     
/* 2670 */     this.revolverBarrelModel[80].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2671 */     this.revolverBarrelModel[80].setRotationPoint(-1.0F, -95.75F, -19.25F);
/*      */     
/* 2673 */     this.revolverBarrelModel[81].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2674 */     this.revolverBarrelModel[81].setRotationPoint(-1.0F, -98.75F, -3.25F);
/*      */     
/* 2676 */     this.revolverBarrelModel[82].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2677 */     this.revolverBarrelModel[82].setRotationPoint(-1.0F, -98.75F, -6.75F);
/*      */     
/* 2679 */     this.revolverBarrelModel[83].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2680 */     this.revolverBarrelModel[83].setRotationPoint(-1.0F, -98.75F, 15.0F);
/*      */     
/* 2682 */     this.revolverBarrelModel[84].addBox(59.0F, 10.0F, -3.0F, 44, 2, 3, 0.0F);
/* 2683 */     this.revolverBarrelModel[84].setRotationPoint(-1.0F, -92.75F, 8.5F);
/*      */     
/* 2685 */     this.revolverBarrelModel[85].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2686 */     this.revolverBarrelModel[85].setRotationPoint(-1.0F, -92.75F, -0.25F);
/*      */     
/* 2688 */     this.revolverBarrelModel[86].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2689 */     this.revolverBarrelModel[86].setRotationPoint(-1.0F, -92.75F, 2.5F);
/*      */     
/* 2691 */     this.revolverBarrelModel[87].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2692 */     this.revolverBarrelModel[87].setRotationPoint(-1.0F, -89.75F, -4.0F);
/*      */     
/* 2694 */     this.revolverBarrelModel[88].addBox(59.0F, 10.0F, -3.0F, 44, 2, 4, 0.0F);
/* 2695 */     this.revolverBarrelModel[88].setRotationPoint(-1.0F, -89.75F, 12.0F);
/*      */     
/* 2697 */     this.revolverBarrelModel[89].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2698 */     this.revolverBarrelModel[89].setRotationPoint(-1.0F, -111.75F, 12.0F);
/*      */     
/* 2700 */     this.revolverBarrelModel[90].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 6, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2701 */     this.revolverBarrelModel[90].setRotationPoint(-1.0F, -111.75F, -7.25F);
/*      */     
/* 2703 */     this.revolverBarrelModel[91].addShapeBox(59.0F, 10.0F, -3.0F, 44, 4, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2704 */     this.revolverBarrelModel[91].setRotationPoint(-1.0F, -115.75F, -4.25F);
/*      */     
/* 2706 */     this.revolverBarrelModel[92].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2707 */     this.revolverBarrelModel[92].setRotationPoint(-1.0F, -118.75F, -13.75F);
/*      */     
/* 2709 */     this.revolverBarrelModel[93].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 9, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2710 */     this.revolverBarrelModel[93].setRotationPoint(-1.0F, -118.75F, 11.75F);
/*      */     
/* 2712 */     this.revolverBarrelModel[94].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2713 */     this.revolverBarrelModel[94].setRotationPoint(-1.0F, -117.75F, 12.5F);
/*      */     
/* 2715 */     this.revolverBarrelModel[95].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2716 */     this.revolverBarrelModel[95].setRotationPoint(-1.0F, -115.75F, -9.0F);
/*      */     
/* 2718 */     this.revolverBarrelModel[96].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2719 */     this.revolverBarrelModel[96].setRotationPoint(-1.0F, -115.75F, 16.0F);
/*      */     
/* 2721 */     this.revolverBarrelModel[97].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2722 */     this.revolverBarrelModel[97].setRotationPoint(-1.0F, -115.75F, -15.5F);
/*      */     
/* 2724 */     this.revolverBarrelModel[98].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2725 */     this.revolverBarrelModel[98].setRotationPoint(-1.0F, -115.75F, -18.5F);
/*      */     
/* 2727 */     this.revolverBarrelModel[99].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2728 */     this.revolverBarrelModel[99].setRotationPoint(-1.0F, -115.75F, 19.0F);
/*      */     
/* 2730 */     this.revolverBarrelModel[100].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2731 */     this.revolverBarrelModel[100].setRotationPoint(-1.0F, -115.75F, 25.0F);
/*      */     
/* 2733 */     this.revolverBarrelModel[101].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2734 */     this.revolverBarrelModel[101].setRotationPoint(-1.0F, -81.75F, -1.25F);
/*      */     
/* 2736 */     this.revolverBarrelModel[102].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2737 */     this.revolverBarrelModel[102].setRotationPoint(-1.0F, -81.75F, 12.0F);
/*      */     
/* 2739 */     this.revolverBarrelModel[103].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2740 */     this.revolverBarrelModel[103].setRotationPoint(-1.0F, -86.75F, 16.0F);
/*      */     
/* 2742 */     this.revolverBarrelModel[104].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2743 */     this.revolverBarrelModel[104].setRotationPoint(-1.0F, -87.75F, -4.0F);
/*      */     
/* 2745 */     this.revolverBarrelModel[105].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2746 */     this.revolverBarrelModel[105].setRotationPoint(-1.0F, -86.75F, -9.5F);
/*      */     
/* 2748 */     this.revolverBarrelModel[106].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 5, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2749 */     this.revolverBarrelModel[106].setRotationPoint(-1.0F, -121.75F, -2.25F);
/*      */     
/* 2751 */     this.revolverBarrelModel[107].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 3, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2752 */     this.revolverBarrelModel[107].setRotationPoint(-1.0F, -121.75F, 8.75F);
/*      */     
/* 2754 */     this.revolverBarrelModel[108].addShapeBox(59.0F, 10.0F, -3.0F, 44, 5, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2755 */     this.revolverBarrelModel[108].setRotationPoint(-1.0F, -115.75F, 25.75F);
/*      */     
/* 2757 */     this.revolverBarrelModel[109].addShapeBox(59.0F, 10.0F, -3.0F, 44, 5, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2758 */     this.revolverBarrelModel[109].setRotationPoint(-1.0F, -115.75F, -21.5F);
/*      */     
/* 2760 */     this.revolverBarrelModel[110].addShapeBox(59.0F, 10.0F, -3.0F, 44, 9, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2761 */     this.revolverBarrelModel[110].setRotationPoint(-1.0F, -104.75F, -21.5F);
/*      */     
/* 2763 */     this.revolverBarrelModel[111].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2764 */     this.revolverBarrelModel[111].setRotationPoint(-1.0F, -89.75F, -21.5F);
/*      */     
/* 2766 */     this.revolverBarrelModel[112].addShapeBox(59.0F, 10.0F, -3.0F, 44, 9, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2767 */     this.revolverBarrelModel[112].setRotationPoint(-1.0F, -104.75F, 25.75F);
/*      */     
/* 2769 */     this.revolverBarrelModel[113].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 3, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2770 */     this.revolverBarrelModel[113].setRotationPoint(-1.0F, -89.75F, 25.75F);
/*      */     
/* 2772 */     this.revolverBarrelModel[114].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2773 */     this.revolverBarrelModel[114].setRotationPoint(-1.0F, -86.75F, 25.0F);
/*      */     
/* 2775 */     this.revolverBarrelModel[115].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2776 */     this.revolverBarrelModel[115].setRotationPoint(-1.0F, -86.75F, -18.5F);
/*      */     
/* 2778 */     this.revolverBarrelModel[116].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2779 */     this.revolverBarrelModel[116].setRotationPoint(-1.0F, -86.0F, -15.5F);
/*      */     
/* 2781 */     this.revolverBarrelModel[117].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2782 */     this.revolverBarrelModel[117].setRotationPoint(-1.0F, -86.0F, 19.0F);
/*      */     
/* 2784 */     this.revolverBarrelModel[118].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 5, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2785 */     this.revolverBarrelModel[118].setRotationPoint(-1.0F, -78.75F, -2.5F);
/*      */     
/* 2787 */     this.revolverBarrelModel[119].addShapeBox(59.0F, 10.0F, -3.0F, 44, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2788 */     this.revolverBarrelModel[119].setRotationPoint(-1.0F, -87.75F, 12.75F);
/*      */     
/* 2790 */     this.revolverBarrelModel[120].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 2791 */     this.revolverBarrelModel[120].setRotationPoint(-1.0F, -78.75F, 8.75F);
/*      */     
/* 2793 */     this.revolverBarrelModel[121].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 15, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2794 */     this.revolverBarrelModel[121].setRotationPoint(-1.0F, -78.0F, -2.0F);
/*      */     
/* 2796 */     this.revolverBarrelModel[122].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 14, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2797 */     this.revolverBarrelModel[122].setRotationPoint(-1.0F, -124.5F, -1.75F);
/*      */     
/* 2799 */     this.revolverBarrelModel[123].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 12, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2800 */     this.revolverBarrelModel[123].setRotationPoint(-1.0F, -117.75F, -13.25F);
/*      */     
/* 2802 */     this.revolverBarrelModel[124].addShapeBox(59.0F, 10.0F, -3.0F, 44, 7, 7, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2803 */     this.revolverBarrelModel[124].setRotationPoint(-1.0F, -122.75F, -20.25F);
/*      */     
/* 2805 */     this.revolverBarrelModel[125].addShapeBox(59.0F, 10.0F, -3.0F, 44, 7, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -7.0F, -0.25F, 0.0F, -7.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2806 */     this.revolverBarrelModel[125].setRotationPoint(-1.0F, -122.75F, 23.0F);
/*      */     
/* 2808 */     this.revolverBarrelModel[126].addShapeBox(59.0F, 10.0F, -3.0F, 44, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2809 */     this.revolverBarrelModel[126].setRotationPoint(-1.0F, -84.0F, -20.25F);
/*      */     
/* 2811 */     this.revolverBarrelModel[127].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2812 */     this.revolverBarrelModel[127].setRotationPoint(-1.0F, -84.75F, -4.0F);
/*      */     
/* 2814 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 2815 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -84.0F, -13.25F);
/*      */     
/* 2817 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, -0.25F, 0.0F, -7.0F, -0.25F);
/* 2818 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -84.0F, 23.0F);
/*      */     
/* 2820 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 2821 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -87.75F, 15.0F);
/*      */     
/* 2823 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2824 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -84.0F, 19.0F);
/*      */     
/* 2826 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 2827 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -117.75F, 15.75F);
/*      */     
/* 2829 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2830 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -113.75F, -6.0F);
/*      */     
/* 2832 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2833 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -110.75F, -2.25F);
/*      */     
/* 2835 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2836 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -89.75F, -6.5F);
/*      */     
/* 2838 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2839 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -92.75F, -2.0F);
/*      */     
/* 2841 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2842 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -98.75F, -5.25F);
/*      */     
/* 2844 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2845 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -101.75F, -9.5F);
/*      */     
/* 2847 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 32, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2848 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -115.75F, -22.25F);
/*      */     
/* 2850 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 32, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2851 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -115.75F, 26.75F);
/*      */     
/* 2853 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 12, 8, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2854 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -96.0F, -28.25F);
/*      */     
/* 2856 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 12, 8, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2857 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -116.0F, -28.25F);
/*      */     
/* 2859 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 9, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F);
/* 2860 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -75.0F, -5.25F);
/*      */     
/* 2862 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 9, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F);
/* 2863 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -75.0F, 4.75F);
/*      */     
/* 2865 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 25, 11, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2866 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -89.75F, -5.0F);
/*      */     
/* 2868 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2869 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -92.75F, -3.0F);
/*      */     
/* 2871 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2872 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -98.75F, -6.25F);
/*      */     
/* 2874 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2875 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -101.75F, -8.0F);
/*      */     
/* 2877 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2878 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -110.75F, -3.25F);
/*      */     
/* 2880 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2881 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -111.75F, -1.75F);
/*      */     
/* 2883 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2884 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -113.75F, -7.0F);
/*      */     
/* 2886 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2887 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -115.75F, -10.0F);
/*      */     
/* 2889 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 22, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 2890 */     this.revolverBarrelModel[''].setRotationPoint(21.0F, -122.5F, -14.0F);
/*      */     
/* 2892 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2893 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -104.75F, 15.0F);
/*      */     
/* 2895 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2896 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -107.75F, 11.25F);
/*      */     
/* 2898 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 12, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F);
/* 2899 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -96.0F, 29.75F);
/*      */     
/* 2901 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 12, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 2902 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -116.0F, 29.75F);
/*      */     
/* 2904 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2905 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -81.75F, 11.0F);
/*      */     
/* 2907 */     this.revolverBarrelModel[''].addShapeBox(59.0F, 10.0F, -3.0F, 44, 6, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2908 */     this.revolverBarrelModel[''].setRotationPoint(-1.0F, -87.75F, 11.75F);
/*      */     
/* 2910 */     this.revolverBarrelModel[' '].addShapeBox(59.0F, 10.0F, -3.0F, 44, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2911 */     this.revolverBarrelModel[' '].setRotationPoint(-1.0F, -92.75F, 11.0F);
/*      */     
/* 2913 */     this.revolverBarrelModel['¡'].addShapeBox(59.0F, 10.0F, -3.0F, 44, 9, 10, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2914 */     this.revolverBarrelModel['¡'].setRotationPoint(-1.0F, -133.5F, 4.75F);
/*      */     
/* 2916 */     this.revolverBarrelModel['¢'].addShapeBox(59.0F, 10.0F, -3.0F, 44, 9, 10, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2917 */     this.revolverBarrelModel['¢'].setRotationPoint(-1.0F, -133.5F, -5.25F);
/*      */     
/* 2919 */     this.revolverBarrelModel['£'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2920 */     this.revolverBarrelModel['£'].setRotationPoint(21.0F, -124.5F, -5.0F);
/*      */     
/* 2922 */     this.revolverBarrelModel['¤'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 2, 8, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2923 */     this.revolverBarrelModel['¤'].setRotationPoint(21.0F, -120.75F, -11.75F);
/*      */     
/* 2925 */     this.revolverBarrelModel['¥'].addShapeBox(59.0F, 10.0F, -3.0F, 27, 2, 8, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2926 */     this.revolverBarrelModel['¥'].setRotationPoint(16.0F, -120.75F, 13.5F);
/*      */     
/* 2928 */     this.revolverBarrelModel['¦'].addShapeBox(59.0F, 10.0F, -3.0F, 27, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 2929 */     this.revolverBarrelModel['¦'].setRotationPoint(16.0F, -124.5F, 11.5F);
/*      */     
/* 2931 */     this.revolverBarrelModel['§'].addShapeBox(59.0F, 10.0F, -3.0F, 27, 4, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 2932 */     this.revolverBarrelModel['§'].setRotationPoint(16.0F, -122.5F, 21.5F);
/*      */     
/* 2934 */     this.revolverBarrelModel['¨'].addShapeBox(59.0F, 10.0F, -3.0F, 20, 4, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2935 */     this.revolverBarrelModel['¨'].setRotationPoint(23.0F, -78.75F, -5.0F);
/*      */     
/* 2937 */     this.revolverBarrelModel['©'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 2938 */     this.revolverBarrelModel['©'].setRotationPoint(15.0F, -78.75F, 11.5F);
/*      */     
/* 2940 */     this.revolverBarrelModel['ª'].addShapeBox(59.0F, 10.0F, -3.0F, 20, 2, 8, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2941 */     this.revolverBarrelModel['ª'].setRotationPoint(23.0F, -80.75F, -11.5F);
/*      */     
/* 2943 */     this.revolverBarrelModel['«'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 2, 8, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 2944 */     this.revolverBarrelModel['«'].setRotationPoint(15.0F, -80.75F, 13.5F);
/*      */     
/* 2946 */     this.revolverBarrelModel['¬'].addShapeBox(59.0F, 10.0F, -3.0F, 20, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F);
/* 2947 */     this.revolverBarrelModel['¬'].setRotationPoint(23.0F, -80.75F, -13.75F);
/*      */     
/* 2949 */     this.revolverBarrelModel['­'].addShapeBox(59.0F, 10.0F, -3.0F, 28, 4, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 2950 */     this.revolverBarrelModel['­'].setRotationPoint(15.0F, -80.75F, 21.5F);
/*      */     
/* 2952 */     this.revolverBarrelModel['®'].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2953 */     this.revolverBarrelModel['®'].setRotationPoint(-1.0F, -80.75F, 13.0F);
/*      */     
/* 2955 */     this.revolverBarrelModel['¯'].addShapeBox(59.0F, 10.0F, -3.0F, 44, 1, 12, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, -2.25F, 0.0F, -0.75F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 2956 */     this.revolverBarrelModel['¯'].setRotationPoint(-1.0F, -81.75F, 13.0F);
/*      */     
/* 2958 */     this.revolverBarrelModel['°'].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 2959 */     this.revolverBarrelModel['°'].setRotationPoint(-1.0F, -84.0F, 22.5F);
/*      */     
/* 2961 */     this.revolverBarrelModel['±'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2962 */     this.revolverBarrelModel['±'].setRotationPoint(-1.0F, -120.75F, -5.75F);
/*      */     
/* 2964 */     this.revolverBarrelModel['²'].addShapeBox(59.0F, 10.0F, -3.0F, 44, 2, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2965 */     this.revolverBarrelModel['²'].setRotationPoint(-1.0F, -120.75F, 11.0F);
/*      */     
/* 2967 */     this.revolverBarrelModel['³'].addShapeBox(59.0F, 10.0F, -3.0F, 44, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 2968 */     this.revolverBarrelModel['³'].setRotationPoint(-1.0F, -118.75F, 20.75F);
/*      */     
/* 2970 */     this.revolverBarrelModel['´'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2971 */     this.revolverBarrelModel['´'].setRotationPoint(-2.0F, -86.25F, 22.0F);
/*      */     
/* 2973 */     this.revolverBarrelModel['µ'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 8, 8, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2974 */     this.revolverBarrelModel['µ'].setRotationPoint(-1.0F, -104.0F, -28.25F);
/*      */     
/* 2976 */     this.revolverBarrelModel['¶'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 2, 9, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2977 */     this.revolverBarrelModel['¶'].setRotationPoint(-1.0F, -124.5F, -13.75F);
/*      */     
/* 2979 */     this.revolverBarrelModel['·'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 4, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 2980 */     this.revolverBarrelModel['·'].setRotationPoint(-1.0F, -124.5F, -5.75F);
/*      */     
/* 2982 */     this.revolverBarrelModel['¸'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 4, 9, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2983 */     this.revolverBarrelModel['¸'].setRotationPoint(-1.0F, -122.5F, -14.0F);
/*      */     
/* 2985 */     this.revolverBarrelModel['¹'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 8, 8, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2986 */     this.revolverBarrelModel['¹'].setRotationPoint(-1.0F, -104.0F, 25.25F);
/*      */     
/* 2988 */     this.revolverBarrelModel['º'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 4, 9, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2989 */     this.revolverBarrelModel['º'].setRotationPoint(-1.0F, -122.5F, 14.25F);
/*      */     
/* 2991 */     this.revolverBarrelModel['»'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 3, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2992 */     this.revolverBarrelModel['»'].setRotationPoint(-1.0F, -123.75F, 12.0F);
/*      */     
/* 2994 */     this.revolverBarrelModel['¼'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 2, 9, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2995 */     this.revolverBarrelModel['¼'].setRotationPoint(-1.0F, -124.5F, 14.5F);
/*      */     
/* 2997 */     this.revolverBarrelModel['½'].addShapeBox(59.0F, 10.0F, -3.0F, 25, 9, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -9.0F, 0.25F, 0.0F, -9.0F, 0.25F);
/* 2998 */     this.revolverBarrelModel['½'].setRotationPoint(-1.0F, -77.0F, 14.75F);
/*      */     
/* 3000 */     this.revolverBarrelModel['¾'].addShapeBox(59.0F, 10.0F, -3.0F, 25, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3001 */     this.revolverBarrelModel['¾'].setRotationPoint(-1.0F, -78.75F, 12.75F);
/*      */     
/* 3003 */     this.revolverBarrelModel['¿'].addShapeBox(59.0F, 10.0F, -3.0F, 25, 4, 10, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/* 3004 */     this.revolverBarrelModel['¿'].setRotationPoint(-1.0F, -80.75F, 15.0F);
/*      */     
/* 3006 */     this.revolverBarrelModel['À'].addShapeBox(59.0F, 10.0F, -3.0F, 25, 12, 8, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -7.0F, 0.25F, 0.0F, -7.0F, 0.25F);
/* 3007 */     this.revolverBarrelModel['À'].setRotationPoint(-1.0F, -80.0F, -13.25F);
/*      */     
/* 3009 */     this.revolverBarrelModel['Á'].addShapeBox(59.0F, 10.0F, -3.0F, 25, 3, 2, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 3010 */     this.revolverBarrelModel['Á'].setRotationPoint(-1.0F, -78.0F, -4.5F);
/*      */     
/* 3012 */     this.revolverBarrelModel['Â'].addShapeBox(59.0F, 10.0F, -3.0F, 25, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3013 */     this.revolverBarrelModel['Â'].setRotationPoint(-1.0F, -80.75F, -5.5F);
/*      */     
/* 3015 */     this.revolverBarrelModel['Ã'].addShapeBox(59.0F, 10.0F, -3.0F, 29, 9, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3016 */     this.revolverBarrelModel['Ã'].setRotationPoint(14.0F, -89.75F, -5.0F);
/*      */     
/* 3018 */     this.revolverBarrelModel['Ä'].addShapeBox(59.0F, 10.0F, -3.0F, 1, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3019 */     this.revolverBarrelModel['Ä'].setRotationPoint(-2.0F, -102.25F, 3.5F);
/*      */     
/* 3021 */     this.revolverBarrelModel['Å'].addShapeBox(59.0F, 10.0F, -3.0F, 22, 3, 3, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3022 */     this.revolverBarrelModel['Å'].setRotationPoint(0.0F, -78.75F, 12.5F);
/*      */     
/* 3024 */     this.revolverBarrelModel['Æ'].addShapeBox(59.0F, 10.0F, -3.0F, 25, 2, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 3025 */     this.revolverBarrelModel['Æ'].setRotationPoint(-1.0F, -80.75F, 21.0F);
/*      */     
/* 3027 */     this.revolverBarrelModel['Ç'].addShapeBox(59.0F, 10.0F, -3.0F, 21, 2, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F);
/* 3028 */     this.revolverBarrelModel['Ç'].setRotationPoint(-1.0F, -80.75F, 14.0F);
/*      */     
/* 3030 */     translateAll(0.0F, -78.0F, 0.0F);
/* 3031 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*      */     
/*      */ 
/* 3034 */     this.gunSlideDistance = 0.0F;
/* 3035 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 3037 */     this.tiltGun = 0.0F;
/* 3038 */     this.rotateGunVertical = 0.0F;
/* 3039 */     this.translateGun = new Vector3f(0.0F, -3.0F, 0.0F);
/*      */     
/* 3041 */     this.rotateClipVertical = 0.0F;
/* 3042 */     this.translateClip = new Vector3f(0.0F, -3.0F, 0.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelpython.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */