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
/*      */ public class Modelqbz95
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 4096;
/*   17 */   int textureY = 4096;
/*      */   
/*      */   public Modelqbz95()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ǜ'];
/*   22 */     this.ammoModel = new ModelRendererTurbo[13];
/*   23 */     this.slideModel = new ModelRendererTurbo[13];
/*      */     
/*   25 */     initgunModel_1();
/*   26 */     initammoModel_1();
/*   27 */     initslideModel_1();
/*      */     
/*   29 */     translateAll(0.0F, 0.0F, 0.0F);
/*      */     
/*      */ 
/*   32 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   37 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[1] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[2] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*   40 */     this.gunModel[3] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*   41 */     this.gunModel[4] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*   42 */     this.gunModel[5] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*   43 */     this.gunModel[6] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*   44 */     this.gunModel[7] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[8] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[9] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[10] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[11] = new ModelRendererTurbo(this, 1041, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[12] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[13] = new ModelRendererTurbo(this, 1105, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[14] = new ModelRendererTurbo(this, 1137, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[15] = new ModelRendererTurbo(this, 1153, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[16] = new ModelRendererTurbo(this, 1169, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[17] = new ModelRendererTurbo(this, 1185, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[18] = new ModelRendererTurbo(this, 1233, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[19] = new ModelRendererTurbo(this, 1249, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[20] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[21] = new ModelRendererTurbo(this, 1297, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[22] = new ModelRendererTurbo(this, 1313, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[23] = new ModelRendererTurbo(this, 1361, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[24] = new ModelRendererTurbo(this, 1377, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[25] = new ModelRendererTurbo(this, 1393, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[26] = new ModelRendererTurbo(this, 1425, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[27] = new ModelRendererTurbo(this, 1441, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[28] = new ModelRendererTurbo(this, 1457, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[29] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[30] = new ModelRendererTurbo(this, 1521, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[31] = new ModelRendererTurbo(this, 1537, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[32] = new ModelRendererTurbo(this, 1569, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[33] = new ModelRendererTurbo(this, 1585, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[34] = new ModelRendererTurbo(this, 1601, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[35] = new ModelRendererTurbo(this, 1649, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[36] = new ModelRendererTurbo(this, 1665, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[37] = new ModelRendererTurbo(this, 1681, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[38] = new ModelRendererTurbo(this, 1729, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[39] = new ModelRendererTurbo(this, 2545, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[40] = new ModelRendererTurbo(this, 2841, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[41] = new ModelRendererTurbo(this, 2929, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[42] = new ModelRendererTurbo(this, 3241, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[43] = new ModelRendererTurbo(this, 3553, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[44] = new ModelRendererTurbo(this, 849, 17, this.textureX, this.textureY);
/*   82 */     this.gunModel[45] = new ModelRendererTurbo(this, 3601, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[46] = new ModelRendererTurbo(this, 3617, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[47] = new ModelRendererTurbo(this, 3633, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[48] = new ModelRendererTurbo(this, 3681, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[49] = new ModelRendererTurbo(this, 3697, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[50] = new ModelRendererTurbo(this, 3729, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[51] = new ModelRendererTurbo(this, 3745, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[52] = new ModelRendererTurbo(this, 3761, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[53] = new ModelRendererTurbo(this, 3809, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[54] = new ModelRendererTurbo(this, 3825, 1, this.textureX, this.textureY);
/*   92 */     this.gunModel[55] = new ModelRendererTurbo(this, 3841, 1, this.textureX, this.textureY);
/*   93 */     this.gunModel[56] = new ModelRendererTurbo(this, 3857, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[57] = new ModelRendererTurbo(this, 3889, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[58] = new ModelRendererTurbo(this, 3905, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[59] = new ModelRendererTurbo(this, 3921, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[60] = new ModelRendererTurbo(this, 3969, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[61] = new ModelRendererTurbo(this, 3985, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[62] = new ModelRendererTurbo(this, 4017, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[63] = new ModelRendererTurbo(this, 4033, 1, this.textureX, this.textureY);
/*  101 */     this.gunModel[64] = new ModelRendererTurbo(this, 4049, 1, this.textureX, this.textureY);
/*  102 */     this.gunModel[65] = new ModelRendererTurbo(this, 2545, 9, this.textureX, this.textureY);
/*  103 */     this.gunModel[66] = new ModelRendererTurbo(this, 4065, 1, this.textureX, this.textureY);
/*  104 */     this.gunModel[67] = new ModelRendererTurbo(this, 2593, 9, this.textureX, this.textureY);
/*  105 */     this.gunModel[68] = new ModelRendererTurbo(this, 4081, 1, this.textureX, this.textureY);
/*  106 */     this.gunModel[69] = new ModelRendererTurbo(this, 889, 9, this.textureX, this.textureY);
/*  107 */     this.gunModel[70] = new ModelRendererTurbo(this, 905, 9, this.textureX, this.textureY);
/*  108 */     this.gunModel[71] = new ModelRendererTurbo(this, 2625, 9, this.textureX, this.textureY);
/*  109 */     this.gunModel[72] = new ModelRendererTurbo(this, 921, 9, this.textureX, this.textureY);
/*  110 */     this.gunModel[73] = new ModelRendererTurbo(this, 2673, 9, this.textureX, this.textureY);
/*  111 */     this.gunModel[74] = new ModelRendererTurbo(this, 937, 9, this.textureX, this.textureY);
/*  112 */     this.gunModel[75] = new ModelRendererTurbo(this, 993, 9, this.textureX, this.textureY);
/*  113 */     this.gunModel[76] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/*  114 */     this.gunModel[77] = new ModelRendererTurbo(this, 2705, 9, this.textureX, this.textureY);
/*  115 */     this.gunModel[78] = new ModelRendererTurbo(this, 1025, 9, this.textureX, this.textureY);
/*  116 */     this.gunModel[79] = new ModelRendererTurbo(this, 1041, 9, this.textureX, this.textureY);
/*  117 */     this.gunModel[80] = new ModelRendererTurbo(this, 1665, 17, this.textureX, this.textureY);
/*  118 */     this.gunModel[81] = new ModelRendererTurbo(this, 2753, 9, this.textureX, this.textureY);
/*  119 */     this.gunModel[82] = new ModelRendererTurbo(this, 2945, 9, this.textureX, this.textureY);
/*  120 */     this.gunModel[83] = new ModelRendererTurbo(this, 3025, 9, this.textureX, this.textureY);
/*  121 */     this.gunModel[84] = new ModelRendererTurbo(this, 3121, 9, this.textureX, this.textureY);
/*  122 */     this.gunModel[85] = new ModelRendererTurbo(this, 4001, 9, this.textureX, this.textureY);
/*  123 */     this.gunModel[86] = new ModelRendererTurbo(this, 2185, 17, this.textureX, this.textureY);
/*  124 */     this.gunModel[87] = new ModelRendererTurbo(this, 2273, 17, this.textureX, this.textureY);
/*  125 */     this.gunModel[88] = new ModelRendererTurbo(this, 3193, 17, this.textureX, this.textureY);
/*  126 */     this.gunModel[89] = new ModelRendererTurbo(this, 2345, 17, this.textureX, this.textureY);
/*  127 */     this.gunModel[90] = new ModelRendererTurbo(this, 2409, 17, this.textureX, this.textureY);
/*  128 */     this.gunModel[91] = new ModelRendererTurbo(this, 2473, 17, this.textureX, this.textureY);
/*  129 */     this.gunModel[92] = new ModelRendererTurbo(this, 3441, 17, this.textureX, this.textureY);
/*  130 */     this.gunModel[93] = new ModelRendererTurbo(this, 3793, 9, this.textureX, this.textureY);
/*  131 */     this.gunModel[94] = new ModelRendererTurbo(this, 3505, 17, this.textureX, this.textureY);
/*  132 */     this.gunModel[95] = new ModelRendererTurbo(this, 3569, 17, this.textureX, this.textureY);
/*  133 */     this.gunModel[96] = new ModelRendererTurbo(this, 3633, 17, this.textureX, this.textureY);
/*  134 */     this.gunModel[97] = new ModelRendererTurbo(this, 3673, 17, this.textureX, this.textureY);
/*  135 */     this.gunModel[98] = new ModelRendererTurbo(this, 3873, 17, this.textureX, this.textureY);
/*  136 */     this.gunModel[99] = new ModelRendererTurbo(this, 3937, 17, this.textureX, this.textureY);
/*  137 */     this.gunModel[100] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  138 */     this.gunModel[101] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  139 */     this.gunModel[102] = new ModelRendererTurbo(this, 3745, 17, this.textureX, this.textureY);
/*  140 */     this.gunModel[103] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*  141 */     this.gunModel[104] = new ModelRendererTurbo(this, 865, 33, this.textureX, this.textureY);
/*  142 */     this.gunModel[105] = new ModelRendererTurbo(this, 2537, 25, this.textureX, this.textureY);
/*  143 */     this.gunModel[106] = new ModelRendererTurbo(this, 2617, 25, this.textureX, this.textureY);
/*  144 */     this.gunModel[107] = new ModelRendererTurbo(this, 1169, 33, this.textureX, this.textureY);
/*  145 */     this.gunModel[108] = new ModelRendererTurbo(this, 1273, 33, this.textureX, this.textureY);
/*  146 */     this.gunModel[109] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  147 */     this.gunModel[110] = new ModelRendererTurbo(this, 1337, 33, this.textureX, this.textureY);
/*  148 */     this.gunModel[111] = new ModelRendererTurbo(this, 1441, 33, this.textureX, this.textureY);
/*  149 */     this.gunModel[112] = new ModelRendererTurbo(this, 1521, 33, this.textureX, this.textureY);
/*  150 */     this.gunModel[113] = new ModelRendererTurbo(this, 1609, 33, this.textureX, this.textureY);
/*  151 */     this.gunModel[114] = new ModelRendererTurbo(this, 1713, 33, this.textureX, this.textureY);
/*  152 */     this.gunModel[115] = new ModelRendererTurbo(this, 1817, 33, this.textureX, this.textureY);
/*  153 */     this.gunModel[116] = new ModelRendererTurbo(this, 1913, 33, this.textureX, this.textureY);
/*  154 */     this.gunModel[117] = new ModelRendererTurbo(this, 2705, 25, this.textureX, this.textureY);
/*  155 */     this.gunModel[118] = new ModelRendererTurbo(this, 1969, 33, this.textureX, this.textureY);
/*  156 */     this.gunModel[119] = new ModelRendererTurbo(this, 3753, 33, this.textureX, this.textureY);
/*  157 */     this.gunModel[120] = new ModelRendererTurbo(this, 2041, 33, this.textureX, this.textureY);
/*  158 */     this.gunModel[121] = new ModelRendererTurbo(this, 2345, 33, this.textureX, this.textureY);
/*  159 */     this.gunModel[122] = new ModelRendererTurbo(this, 2105, 33, this.textureX, this.textureY);
/*  160 */     this.gunModel[123] = new ModelRendererTurbo(this, 1137, 9, this.textureX, this.textureY);
/*  161 */     this.gunModel[124] = new ModelRendererTurbo(this, 1281, 9, this.textureX, this.textureY);
/*  162 */     this.gunModel[125] = new ModelRendererTurbo(this, 2921, 33, this.textureX, this.textureY);
/*  163 */     this.gunModel[126] = new ModelRendererTurbo(this, 3025, 9, this.textureX, this.textureY);
/*  164 */     this.gunModel[127] = new ModelRendererTurbo(this, 2817, 25, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 2017, 33, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 2489, 33, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 3105, 9, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 2761, 33, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 3449, 33, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 3169, 33, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 3121, 9, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 3473, 33, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 3513, 33, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 3537, 33, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 3193, 9, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 3577, 33, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 3617, 33, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 3641, 33, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 4073, 9, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 4057, 33, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 2257, 17, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 2273, 17, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 2705, 25, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 2041, 33, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 41, this.textureX, this.textureY);
/*  197 */     this.gunModel[' '] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*  198 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 593, 41, this.textureX, this.textureY);
/*  199 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 2089, 33, this.textureX, this.textureY);
/*  200 */     this.gunModel['£'] = new ModelRendererTurbo(this, 633, 41, this.textureX, this.textureY);
/*  201 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 673, 41, this.textureX, this.textureY);
/*  202 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 697, 41, this.textureX, this.textureY);
/*  203 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 2105, 33, this.textureX, this.textureY);
/*  204 */     this.gunModel['§'] = new ModelRendererTurbo(this, 737, 41, this.textureX, this.textureY);
/*  205 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 777, 41, this.textureX, this.textureY);
/*  206 */     this.gunModel['©'] = new ModelRendererTurbo(this, 801, 41, this.textureX, this.textureY);
/*  207 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 2145, 33, this.textureX, this.textureY);
/*  208 */     this.gunModel['«'] = new ModelRendererTurbo(this, 841, 41, this.textureX, this.textureY);
/*  209 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 2529, 41, this.textureX, this.textureY);
/*  210 */     this.gunModel['­'] = new ModelRendererTurbo(this, 2553, 41, this.textureX, this.textureY);
/*  211 */     this.gunModel['®'] = new ModelRendererTurbo(this, 2161, 33, this.textureX, this.textureY);
/*  212 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 2593, 41, this.textureX, this.textureY);
/*  213 */     this.gunModel['°'] = new ModelRendererTurbo(this, 2857, 41, this.textureX, this.textureY);
/*  214 */     this.gunModel['±'] = new ModelRendererTurbo(this, 2881, 41, this.textureX, this.textureY);
/*  215 */     this.gunModel['²'] = new ModelRendererTurbo(this, 2465, 33, this.textureX, this.textureY);
/*  216 */     this.gunModel['³'] = new ModelRendererTurbo(this, 3209, 41, this.textureX, this.textureY);
/*  217 */     this.gunModel['´'] = new ModelRendererTurbo(this, 3249, 41, this.textureX, this.textureY);
/*  218 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 3273, 41, this.textureX, this.textureY);
/*  219 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 2801, 33, this.textureX, this.textureY);
/*  220 */     this.gunModel['·'] = new ModelRendererTurbo(this, 3313, 41, this.textureX, this.textureY);
/*  221 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 3353, 41, this.textureX, this.textureY);
/*  222 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 3377, 41, this.textureX, this.textureY);
/*  223 */     this.gunModel['º'] = new ModelRendererTurbo(this, 4041, 33, this.textureX, this.textureY);
/*  224 */     this.gunModel['»'] = new ModelRendererTurbo(this, 881, 49, this.textureX, this.textureY);
/*  225 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 3417, 41, this.textureX, this.textureY);
/*  226 */     this.gunModel['½'] = new ModelRendererTurbo(this, 921, 49, this.textureX, this.textureY);
/*  227 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 961, 57, this.textureX, this.textureY);
/*  228 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 1601, 57, this.textureX, this.textureY);
/*  229 */     this.gunModel['À'] = new ModelRendererTurbo(this, 2865, 65, this.textureX, this.textureY);
/*  230 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 3425, 65, this.textureX, this.textureY);
/*  231 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 1473, 49, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 1897, 49, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 2265, 49, this.textureX, this.textureY);
/*  234 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  235 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 513, 41, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  237 */     this.gunModel['È'] = new ModelRendererTurbo(this, 2793, 49, this.textureX, this.textureY);
/*  238 */     this.gunModel['É'] = new ModelRendererTurbo(this, 3673, 49, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 2145, 41, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 945, 49, this.textureX, this.textureY);
/*  241 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1001, 49, this.textureX, this.textureY);
/*  242 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 1257, 33, this.textureX, this.textureY);
/*  243 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 1201, 57, this.textureX, this.textureY);
/*  244 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 1945, 49, this.textureX, this.textureY);
/*  245 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1257, 57, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 2281, 49, this.textureX, this.textureY);
/*  247 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1817, 57, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 2217, 57, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 2489, 57, this.textureX, this.textureY);
/*  250 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 3713, 49, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 825, 81, this.textureX, this.textureY);
/*  252 */     this.gunModel['×'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 2921, 41, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1441, 49, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 1281, 57, this.textureX, this.textureY);
/*  256 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 2489, 89, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 1345, 89, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 2633, 57, this.textureX, this.textureY);
/*  259 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 3089, 73, this.textureX, this.textureY);
/*  260 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 1537, 65, this.textureX, this.textureY);
/*  261 */     this.gunModel['à'] = new ModelRendererTurbo(this, 2761, 57, this.textureX, this.textureY);
/*  262 */     this.gunModel['á'] = new ModelRendererTurbo(this, 4057, 57, this.textureX, this.textureY);
/*  263 */     this.gunModel['â'] = new ModelRendererTurbo(this, 2545, 65, this.textureX, this.textureY);
/*  264 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 3777, 73, this.textureX, this.textureY);
/*  265 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 2041, 81, this.textureX, this.textureY);
/*  266 */     this.gunModel['å'] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  267 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 3377, 65, this.textureX, this.textureY);
/*  268 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 2785, 65, this.textureX, this.textureY);
/*  269 */     this.gunModel['è'] = new ModelRendererTurbo(this, 2825, 65, this.textureX, this.textureY);
/*  270 */     this.gunModel['é'] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  271 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 3401, 65, this.textureX, this.textureY);
/*  272 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1913, 73, this.textureX, this.textureY);
/*  273 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 3777, 73, this.textureX, this.textureY);
/*  274 */     this.gunModel['í'] = new ModelRendererTurbo(this, 2329, 49, this.textureX, this.textureY);
/*  275 */     this.gunModel['î'] = new ModelRendererTurbo(this, 3689, 65, this.textureX, this.textureY);
/*  276 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 2137, 81, this.textureX, this.textureY);
/*  277 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 2177, 81, this.textureX, this.textureY);
/*  278 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1321, 57, this.textureX, this.textureY);
/*  279 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 2041, 81, this.textureX, this.textureY);
/*  280 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 2241, 81, this.textureX, this.textureY);
/*  281 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 2345, 81, this.textureX, this.textureY);
/*  282 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 1881, 57, this.textureX, this.textureY);
/*  283 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 2385, 81, this.textureX, this.textureY);
/*  284 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 2409, 81, this.textureX, this.textureY);
/*  285 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 2449, 81, this.textureX, this.textureY);
/*  286 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 2689, 57, this.textureX, this.textureY);
/*  287 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 4049, 81, this.textureX, this.textureY);
/*  288 */     this.gunModel['û'] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/*  289 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/*  290 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 3193, 57, this.textureX, this.textureY);
/*  291 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 4073, 81, this.textureX, this.textureY);
/*  292 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 513, 89, this.textureX, this.textureY);
/*  293 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 553, 89, this.textureX, this.textureY);
/*  294 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 2329, 65, this.textureX, this.textureY);
/*  295 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 593, 89, this.textureX, this.textureY);
/*  296 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 617, 89, this.textureX, this.textureY);
/*  297 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  298 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 2617, 65, this.textureX, this.textureY);
/*  299 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/*  300 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 721, 89, this.textureX, this.textureY);
/*  301 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 761, 89, this.textureX, this.textureY);
/*  302 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 1345, 73, this.textureX, this.textureY);
/*  303 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 801, 89, this.textureX, this.textureY);
/*  304 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 1777, 89, this.textureX, this.textureY);
/*  305 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 3033, 89, this.textureX, this.textureY);
/*  306 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1361, 73, this.textureX, this.textureY);
/*  307 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 3417, 89, this.textureX, this.textureY);
/*  308 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 3073, 89, this.textureX, this.textureY);
/*  309 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 3441, 89, this.textureX, this.textureY);
/*  310 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 1377, 73, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 3481, 89, this.textureX, this.textureY);
/*  312 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 3505, 89, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 3545, 89, this.textureX, this.textureY);
/*  314 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 1393, 73, this.textureX, this.textureY);
/*  315 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 3585, 89, this.textureX, this.textureY);
/*  316 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 3609, 89, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 3649, 89, this.textureX, this.textureY);
/*  318 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 1409, 73, this.textureX, this.textureY);
/*  319 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 825, 97, this.textureX, this.textureY);
/*  320 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 849, 97, this.textureX, this.textureY);
/*  321 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 889, 97, this.textureX, this.textureY);
/*  322 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 1425, 73, this.textureX, this.textureY);
/*  323 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 929, 97, this.textureX, this.textureY);
/*  324 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 953, 97, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 993, 97, this.textureX, this.textureY);
/*  326 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 1441, 73, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1033, 97, this.textureX, this.textureY);
/*  328 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1057, 97, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1097, 97, this.textureX, this.textureY);
/*  330 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 1137, 97, this.textureX, this.textureY);
/*  332 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 1185, 97, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1817, 97, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 1345, 105, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 2169, 113, this.textureX, this.textureY);
/*  336 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 1145, 121, this.textureX, this.textureY);
/*  338 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  339 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 1425, 121, this.textureX, this.textureY);
/*  340 */     this.gunModel['į'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  341 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 761, 129, this.textureX, this.textureY);
/*  342 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 1841, 97, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 1457, 73, this.textureX, this.textureY);
/*  344 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 1697, 33, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 1801, 33, this.textureX, this.textureY);
/*  346 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 761, 137, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 1921, 97, this.textureX, this.textureY);
/*  348 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 1249, 97, this.textureX, this.textureY);
/*  349 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1897, 33, this.textureX, this.textureY);
/*  350 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 3561, 33, this.textureX, this.textureY);
/*  351 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 2489, 97, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/*  353 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 1361, 9, this.textureX, this.textureY);
/*  355 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 1505, 9, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 1569, 9, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 1649, 9, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 2417, 105, this.textureX, this.textureY);
/*  359 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 3409, 137, this.textureX, this.textureY);
/*  360 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 1881, 73, this.textureX, this.textureY);
/*  361 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 2481, 33, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*  363 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 3433, 113, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 1425, 137, this.textureX, this.textureY);
/*  365 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  366 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 3665, 97, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 1505, 73, this.textureX, this.textureY);
/*  368 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 2625, 73, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 2665, 73, this.textureX, this.textureY);
/*  370 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 1169, 9, this.textureX, this.textureY);
/*  372 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 3209, 9, this.textureX, this.textureY);
/*  373 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 3601, 9, this.textureX, this.textureY);
/*  374 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 1057, 49, this.textureX, this.textureY);
/*  375 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 3537, 57, this.textureX, this.textureY);
/*  376 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 3497, 113, this.textureX, this.textureY);
/*  377 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 3529, 113, this.textureX, this.textureY);
/*  378 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 1961, 145, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 3081, 145, this.textureX, this.textureY);
/*  380 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 2201, 97, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 2465, 105, this.textureX, this.textureY);
/*  382 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 4081, 113, this.textureX, this.textureY);
/*  384 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 1825, 121, this.textureX, this.textureY);
/*  385 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/*  386 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 3841, 137, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 3833, 137, this.textureX, this.textureY);
/*  388 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 3913, 137, this.textureX, this.textureY);
/*  389 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 1929, 89, this.textureX, this.textureY);
/*  390 */     this.gunModel['š'] = new ModelRendererTurbo(this, 2281, 97, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 3081, 153, this.textureX, this.textureY);
/*  392 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 1961, 153, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 3545, 153, this.textureX, this.textureY);
/*  394 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 697, 161, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 1433, 161, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 3057, 169, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  398 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 1017, 177, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 2449, 177, this.textureX, this.textureY);
/*  400 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 3361, 185, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 2305, 145, this.textureX, this.textureY);
/*  402 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 3977, 137, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 265, 177, this.textureX, this.textureY);
/*  404 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 2345, 153, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 3681, 153, this.textureX, this.textureY);
/*  406 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 457, 177, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 3753, 169, this.textureX, this.textureY);
/*  408 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 1281, 177, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 1769, 201, this.textureX, this.textureY);
/*  410 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 2769, 177, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 3913, 169, this.textureX, this.textureY);
/*  412 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 417, 177, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 4025, 161, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  415 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 737, 209, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 3945, 185, this.textureX, this.textureY);
/*  417 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 145, 193, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 1057, 193, this.textureX, this.textureY);
/*  419 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 1129, 193, this.textureX, this.textureY);
/*  420 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 2121, 201, this.textureX, this.textureY);
/*  421 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 3009, 201, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 3169, 201, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 1409, 209, this.textureX, this.textureY);
/*  424 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 1569, 209, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 3697, 217, this.textureX, this.textureY);
/*  426 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 1209, 201, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 113, 193, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 3377, 97, this.textureX, this.textureY);
/*  429 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 3777, 97, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 3833, 209, this.textureX, this.textureY);
/*  431 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 417, 225, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 593, 225, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 1281, 225, this.textureX, this.textureY);
/*  434 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 1585, 105, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 2041, 129, this.textureX, this.textureY);
/*  436 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 2785, 225, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 2289, 225, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 1689, 225, this.textureX, this.textureY);
/*  439 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 3313, 217, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 769, 233, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 929, 233, this.textureX, this.textureY);
/*  442 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 113, 241, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 3897, 209, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 561, 225, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 3793, 225, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 1145, 233, this.textureX, this.textureY);
/*  447 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 241, 241, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 1761, 161, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 3369, 241, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 3513, 241, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 3945, 241, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 313, 241, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 1073, 249, this.textureX, this.textureY);
/*  454 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 1193, 249, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 1409, 249, this.textureX, this.textureY);
/*  456 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1473, 249, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 2289, 193, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 1537, 249, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 2089, 249, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 2409, 241, this.textureX, this.textureY);
/*  461 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 2953, 241, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 2193, 249, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 2481, 249, this.textureX, this.textureY);
/*  464 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 2617, 249, this.textureX, this.textureY);
/*  465 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 3137, 249, this.textureX, this.textureY);
/*  466 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 3633, 249, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 1769, 257, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  469 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 1217, 257, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 1945, 257, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 313, 273, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 3001, 265, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 3241, 257, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 449, 273, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 553, 273, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 2833, 9, this.textureX, this.textureY);
/*  478 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 4089, 9, this.textureX, this.textureY);
/*  479 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 2745, 25, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 4089, 25, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 553, 65, this.textureX, this.textureY);
/*  483 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 3673, 153, this.textureX, this.textureY);
/*  484 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 3753, 153, this.textureX, this.textureY);
/*  485 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 1689, 105, this.textureX, this.textureY);
/*  486 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 3561, 113, this.textureX, this.textureY);
/*  487 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/*  488 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 3033, 113, this.textureX, this.textureY);
/*  490 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 1729, 105, this.textureX, this.textureY);
/*  491 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 2185, 57, this.textureX, this.textureY);
/*  492 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 2753, 73, this.textureX, this.textureY);
/*  493 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 3665, 1, this.textureX, this.textureY);
/*  494 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 3881, 137, this.textureX, this.textureY);
/*  495 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 3497, 289, this.textureX, this.textureY);
/*  496 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 1057, 289, this.textureX, this.textureY);
/*  497 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 2289, 289, this.textureX, this.textureY);
/*  498 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 121, 297, this.textureX, this.textureY);
/*  499 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 745, 113, this.textureX, this.textureY);
/*  500 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 713, 145, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 1161, 137, this.textureX, this.textureY);
/*  502 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 2513, 33, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 577, 41, this.textureX, this.textureY);
/*  504 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 1129, 49, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 617, 41, this.textureX, this.textureY);
/*  506 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 721, 41, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 4065, 201, this.textureX, this.textureY);
/*  508 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 825, 41, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 2577, 41, this.textureX, this.textureY);
/*  510 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 4073, 249, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 1329, 257, this.textureX, this.textureY);
/*      */     
/*  513 */     this.gunModel[0].addBox(-86.0F, -67.0F, -19.0F, 260, 9, 9, 0.0F);
/*  514 */     this.gunModel[0].setRotationPoint(7.0F, -68.0F, 0.0F);
/*      */     
/*  516 */     this.gunModel[1].addShapeBox(-86.0F, -67.0F, -19.0F, 149, 6, 30, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  517 */     this.gunModel[1].setRotationPoint(259.0F, -74.0F, 0.0F);
/*      */     
/*  519 */     this.gunModel[2].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  520 */     this.gunModel[2].setRotationPoint(267.0F, -68.0F, 0.0F);
/*      */     
/*  522 */     this.gunModel[3].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  523 */     this.gunModel[3].setRotationPoint(267.0F, -60.0F, 0.0F);
/*      */     
/*  525 */     this.gunModel[4].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  526 */     this.gunModel[4].setRotationPoint(267.0F, -65.0F, 0.0F);
/*      */     
/*  528 */     this.gunModel[5].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  529 */     this.gunModel[5].setRotationPoint(281.0F, -65.0F, 0.0F);
/*      */     
/*  531 */     this.gunModel[6].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  532 */     this.gunModel[6].setRotationPoint(281.0F, -60.0F, 0.0F);
/*      */     
/*  534 */     this.gunModel[7].addBox(-86.0F, -67.0F, -19.0F, 6, 9, 6, 0.0F);
/*  535 */     this.gunModel[7].setRotationPoint(282.0F, -68.0F, 0.0F);
/*      */     
/*  537 */     this.gunModel[8].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  538 */     this.gunModel[8].setRotationPoint(288.0F, -60.0F, 0.0F);
/*      */     
/*  540 */     this.gunModel[9].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  541 */     this.gunModel[9].setRotationPoint(288.0F, -65.0F, 0.0F);
/*      */     
/*  543 */     this.gunModel[10].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  544 */     this.gunModel[10].setRotationPoint(302.0F, -60.0F, 0.0F);
/*      */     
/*  546 */     this.gunModel[11].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  547 */     this.gunModel[11].setRotationPoint(302.0F, -65.0F, 0.0F);
/*      */     
/*  549 */     this.gunModel[12].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  550 */     this.gunModel[12].setRotationPoint(288.0F, -68.0F, 0.0F);
/*      */     
/*  552 */     this.gunModel[13].addBox(-86.0F, -67.0F, -19.0F, 9, 9, 6, 0.0F);
/*  553 */     this.gunModel[13].setRotationPoint(303.0F, -68.0F, 0.0F);
/*      */     
/*  555 */     this.gunModel[14].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  556 */     this.gunModel[14].setRotationPoint(326.0F, -60.0F, 0.0F);
/*      */     
/*  558 */     this.gunModel[15].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  559 */     this.gunModel[15].setRotationPoint(312.0F, -60.0F, 0.0F);
/*      */     
/*  561 */     this.gunModel[16].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  562 */     this.gunModel[16].setRotationPoint(312.0F, -65.0F, 0.0F);
/*      */     
/*  564 */     this.gunModel[17].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  565 */     this.gunModel[17].setRotationPoint(312.0F, -68.0F, 0.0F);
/*      */     
/*  567 */     this.gunModel[18].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  568 */     this.gunModel[18].setRotationPoint(326.0F, -65.0F, 0.0F);
/*      */     
/*  570 */     this.gunModel[19].addBox(-86.0F, -67.0F, -19.0F, 6, 9, 6, 0.0F);
/*  571 */     this.gunModel[19].setRotationPoint(327.0F, -68.0F, 0.0F);
/*      */     
/*  573 */     this.gunModel[20].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  574 */     this.gunModel[20].setRotationPoint(347.0F, -60.0F, 0.0F);
/*      */     
/*  576 */     this.gunModel[21].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  577 */     this.gunModel[21].setRotationPoint(347.0F, -65.0F, 0.0F);
/*      */     
/*  579 */     this.gunModel[22].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  580 */     this.gunModel[22].setRotationPoint(333.0F, -68.0F, 0.0F);
/*      */     
/*  582 */     this.gunModel[23].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  583 */     this.gunModel[23].setRotationPoint(333.0F, -65.0F, 0.0F);
/*      */     
/*  585 */     this.gunModel[24].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  586 */     this.gunModel[24].setRotationPoint(333.0F, -60.0F, 0.0F);
/*      */     
/*  588 */     this.gunModel[25].addBox(-86.0F, -67.0F, -19.0F, 9, 9, 6, 0.0F);
/*  589 */     this.gunModel[25].setRotationPoint(348.0F, -68.0F, 0.0F);
/*      */     
/*  591 */     this.gunModel[26].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  592 */     this.gunModel[26].setRotationPoint(357.0F, -60.0F, 0.0F);
/*      */     
/*  594 */     this.gunModel[27].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[27].setRotationPoint(357.0F, -65.0F, 0.0F);
/*      */     
/*  597 */     this.gunModel[28].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  598 */     this.gunModel[28].setRotationPoint(357.0F, -68.0F, 0.0F);
/*      */     
/*  600 */     this.gunModel[29].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  601 */     this.gunModel[29].setRotationPoint(371.0F, -60.0F, 0.0F);
/*      */     
/*  603 */     this.gunModel[30].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  604 */     this.gunModel[30].setRotationPoint(371.0F, -65.0F, 0.0F);
/*      */     
/*  606 */     this.gunModel[31].addBox(-86.0F, -67.0F, -19.0F, 6, 9, 6, 0.0F);
/*  607 */     this.gunModel[31].setRotationPoint(372.0F, -68.0F, 0.0F);
/*      */     
/*  609 */     this.gunModel[32].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  610 */     this.gunModel[32].setRotationPoint(378.0F, -60.0F, 0.0F);
/*      */     
/*  612 */     this.gunModel[33].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  613 */     this.gunModel[33].setRotationPoint(378.0F, -65.0F, 0.0F);
/*      */     
/*  615 */     this.gunModel[34].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  616 */     this.gunModel[34].setRotationPoint(378.0F, -68.0F, 0.0F);
/*      */     
/*  618 */     this.gunModel[35].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[35].setRotationPoint(392.0F, -65.0F, 0.0F);
/*      */     
/*  621 */     this.gunModel[36].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  622 */     this.gunModel[36].setRotationPoint(392.0F, -60.0F, 0.0F);
/*      */     
/*  624 */     this.gunModel[37].addBox(-86.0F, -67.0F, -19.0F, 15, 9, 6, 0.0F);
/*  625 */     this.gunModel[37].setRotationPoint(393.0F, -68.0F, 0.0F);
/*      */     
/*  627 */     this.gunModel[38].addBox(-86.0F, -67.0F, -19.0F, 401, 3, 6, 0.0F);
/*  628 */     this.gunModel[38].setRotationPoint(7.0F, -59.0F, 0.0F);
/*      */     
/*  630 */     this.gunModel[39].addShapeBox(-86.0F, -67.0F, -19.0F, 149, 2, 4, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[39].setRotationPoint(259.0F, -76.0F, 6.0F);
/*      */     
/*  633 */     this.gunModel[40].addShapeBox(-86.0F, -67.0F, -19.0F, 34, 20, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  634 */     this.gunModel[40].setRotationPoint(374.0F, -76.0F, 10.0F);
/*      */     
/*  636 */     this.gunModel[41].addShapeBox(-86.0F, -67.0F, -19.0F, 149, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  637 */     this.gunModel[41].setRotationPoint(259.0F, -76.0F, 26.0F);
/*      */     
/*  639 */     this.gunModel[42].addShapeBox(-86.0F, -67.0F, -19.0F, 149, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  640 */     this.gunModel[42].setRotationPoint(259.0F, -74.0F, 30.0F);
/*      */     
/*  642 */     this.gunModel[43].addBox(-86.0F, -67.0F, -19.0F, 15, 9, 6, 0.0F);
/*  643 */     this.gunModel[43].setRotationPoint(393.0F, -68.0F, 30.0F);
/*      */     
/*  645 */     this.gunModel[44].addBox(-86.0F, -67.0F, -19.0F, 401, 3, 6, 0.0F);
/*  646 */     this.gunModel[44].setRotationPoint(7.0F, -59.0F, 30.0F);
/*      */     
/*  648 */     this.gunModel[45].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  649 */     this.gunModel[45].setRotationPoint(392.0F, -60.0F, 30.0F);
/*      */     
/*  651 */     this.gunModel[46].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  652 */     this.gunModel[46].setRotationPoint(392.0F, -65.0F, 30.0F);
/*      */     
/*  654 */     this.gunModel[47].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  655 */     this.gunModel[47].setRotationPoint(378.0F, -68.0F, 30.0F);
/*      */     
/*  657 */     this.gunModel[48].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  658 */     this.gunModel[48].setRotationPoint(378.0F, -65.0F, 30.0F);
/*      */     
/*  660 */     this.gunModel[49].addBox(-86.0F, -67.0F, -19.0F, 6, 9, 6, 0.0F);
/*  661 */     this.gunModel[49].setRotationPoint(372.0F, -68.0F, 30.0F);
/*      */     
/*  663 */     this.gunModel[50].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  664 */     this.gunModel[50].setRotationPoint(371.0F, -60.0F, 30.0F);
/*      */     
/*  666 */     this.gunModel[51].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  667 */     this.gunModel[51].setRotationPoint(378.0F, -60.0F, 30.0F);
/*      */     
/*  669 */     this.gunModel[52].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  670 */     this.gunModel[52].setRotationPoint(357.0F, -68.0F, 30.0F);
/*      */     
/*  672 */     this.gunModel[53].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  673 */     this.gunModel[53].setRotationPoint(371.0F, -65.0F, 30.0F);
/*      */     
/*  675 */     this.gunModel[54].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  676 */     this.gunModel[54].setRotationPoint(357.0F, -65.0F, 30.0F);
/*      */     
/*  678 */     this.gunModel[55].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  679 */     this.gunModel[55].setRotationPoint(357.0F, -60.0F, 30.0F);
/*      */     
/*  681 */     this.gunModel[56].addBox(-86.0F, -67.0F, -19.0F, 9, 9, 6, 0.0F);
/*  682 */     this.gunModel[56].setRotationPoint(348.0F, -68.0F, 30.0F);
/*      */     
/*  684 */     this.gunModel[57].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[57].setRotationPoint(347.0F, -60.0F, 30.0F);
/*      */     
/*  687 */     this.gunModel[58].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  688 */     this.gunModel[58].setRotationPoint(347.0F, -65.0F, 30.0F);
/*      */     
/*  690 */     this.gunModel[59].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  691 */     this.gunModel[59].setRotationPoint(333.0F, -68.0F, 30.0F);
/*      */     
/*  693 */     this.gunModel[60].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  694 */     this.gunModel[60].setRotationPoint(333.0F, -65.0F, 30.0F);
/*      */     
/*  696 */     this.gunModel[61].addBox(-86.0F, -67.0F, -19.0F, 6, 9, 6, 0.0F);
/*  697 */     this.gunModel[61].setRotationPoint(327.0F, -68.0F, 30.0F);
/*      */     
/*  699 */     this.gunModel[62].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  700 */     this.gunModel[62].setRotationPoint(333.0F, -60.0F, 30.0F);
/*      */     
/*  702 */     this.gunModel[63].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  703 */     this.gunModel[63].setRotationPoint(326.0F, -60.0F, 30.0F);
/*      */     
/*  705 */     this.gunModel[64].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  706 */     this.gunModel[64].setRotationPoint(326.0F, -65.0F, 30.0F);
/*      */     
/*  708 */     this.gunModel[65].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  709 */     this.gunModel[65].setRotationPoint(312.0F, -68.0F, 30.0F);
/*      */     
/*  711 */     this.gunModel[66].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[66].setRotationPoint(312.0F, -65.0F, 30.0F);
/*      */     
/*  714 */     this.gunModel[67].addBox(-86.0F, -67.0F, -19.0F, 9, 9, 6, 0.0F);
/*  715 */     this.gunModel[67].setRotationPoint(303.0F, -68.0F, 30.0F);
/*      */     
/*  717 */     this.gunModel[68].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  718 */     this.gunModel[68].setRotationPoint(312.0F, -60.0F, 30.0F);
/*      */     
/*  720 */     this.gunModel[69].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  721 */     this.gunModel[69].setRotationPoint(302.0F, -60.0F, 30.0F);
/*      */     
/*  723 */     this.gunModel[70].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  724 */     this.gunModel[70].setRotationPoint(302.0F, -65.0F, 30.0F);
/*      */     
/*  726 */     this.gunModel[71].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  727 */     this.gunModel[71].setRotationPoint(288.0F, -68.0F, 30.0F);
/*      */     
/*  729 */     this.gunModel[72].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[72].setRotationPoint(288.0F, -65.0F, 30.0F);
/*      */     
/*  732 */     this.gunModel[73].addBox(-86.0F, -67.0F, -19.0F, 6, 9, 6, 0.0F);
/*  733 */     this.gunModel[73].setRotationPoint(282.0F, -68.0F, 30.0F);
/*      */     
/*  735 */     this.gunModel[74].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  736 */     this.gunModel[74].setRotationPoint(288.0F, -60.0F, 30.0F);
/*      */     
/*  738 */     this.gunModel[75].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  739 */     this.gunModel[75].setRotationPoint(281.0F, -60.0F, 30.0F);
/*      */     
/*  741 */     this.gunModel[76].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  742 */     this.gunModel[76].setRotationPoint(281.0F, -65.0F, 30.0F);
/*      */     
/*  744 */     this.gunModel[77].addBox(-86.0F, -67.0F, -19.0F, 15, 3, 6, 0.0F);
/*  745 */     this.gunModel[77].setRotationPoint(267.0F, -68.0F, 30.0F);
/*      */     
/*  747 */     this.gunModel[78].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[78].setRotationPoint(267.0F, -65.0F, 30.0F);
/*      */     
/*  750 */     this.gunModel[79].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  751 */     this.gunModel[79].setRotationPoint(267.0F, -60.0F, 30.0F);
/*      */     
/*  753 */     this.gunModel[80].addBox(-86.0F, -67.0F, -19.0F, 260, 9, 6, 0.0F);
/*  754 */     this.gunModel[80].setRotationPoint(7.0F, -68.0F, 30.0F);
/*      */     
/*  756 */     this.gunModel[81].addShapeBox(-86.0F, -67.0F, -19.0F, 34, 18, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  757 */     this.gunModel[81].setRotationPoint(374.0F, -74.0F, 6.0F);
/*      */     
/*  759 */     this.gunModel[82].addShapeBox(-86.0F, -67.0F, -19.0F, 34, 18, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[82].setRotationPoint(374.0F, -74.0F, 26.0F);
/*      */     
/*  762 */     this.gunModel[83].addShapeBox(-86.0F, -67.0F, -19.0F, 31, 4, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  763 */     this.gunModel[83].setRotationPoint(377.0F, -80.0F, 10.0F);
/*      */     
/*  765 */     this.gunModel[84].addShapeBox(-86.0F, -67.0F, -19.0F, 26, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  766 */     this.gunModel[84].setRotationPoint(382.0F, -84.0F, 10.0F);
/*      */     
/*  768 */     this.gunModel[85].addShapeBox(-86.0F, -67.0F, -19.0F, 26, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  769 */     this.gunModel[85].setRotationPoint(382.0F, -86.0F, 10.0F);
/*      */     
/*  771 */     this.gunModel[86].addShapeBox(-86.0F, -67.0F, -19.0F, 26, 17, 16, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  772 */     this.gunModel[86].setRotationPoint(382.0F, -103.0F, 10.0F);
/*      */     
/*  774 */     this.gunModel[87].addShapeBox(-86.0F, -67.0F, -19.0F, 26, 10, 16, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  775 */     this.gunModel[87].setRotationPoint(388.0F, -113.0F, 10.0F);
/*      */     
/*  777 */     this.gunModel[88].addShapeBox(-86.0F, -67.0F, -19.0F, 114, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  778 */     this.gunModel[88].setRotationPoint(259.0F, -76.0F, 10.0F);
/*      */     
/*  780 */     this.gunModel[89].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 6, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  781 */     this.gunModel[89].setRotationPoint(392.0F, -119.0F, 4.0F);
/*      */     
/*  783 */     this.gunModel[90].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  784 */     this.gunModel[90].setRotationPoint(392.0F, -128.0F, -2.0F);
/*      */     
/*  786 */     this.gunModel[91].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  787 */     this.gunModel[91].setRotationPoint(392.0F, -137.0F, -2.0F);
/*      */     
/*  789 */     this.gunModel[92].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 6, 6, 0.0F, 0.5F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  790 */     this.gunModel[92].setRotationPoint(392.0F, -143.0F, 4.0F);
/*      */     
/*  792 */     this.gunModel[93].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 6, 16, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  793 */     this.gunModel[93].setRotationPoint(392.0F, -143.0F, 10.0F);
/*      */     
/*  795 */     this.gunModel[94].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 6, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.5F, 0.0F, -6.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  796 */     this.gunModel[94].setRotationPoint(392.0F, -143.0F, 26.0F);
/*      */     
/*  798 */     this.gunModel[95].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  799 */     this.gunModel[95].setRotationPoint(392.0F, -137.0F, 30.0F);
/*      */     
/*  801 */     this.gunModel[96].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F);
/*  802 */     this.gunModel[96].setRotationPoint(392.0F, -128.0F, 30.0F);
/*      */     
/*  804 */     this.gunModel[97].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 6, 22, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.5F, 0.0F, -6.0F);
/*  805 */     this.gunModel[97].setRotationPoint(392.0F, -119.0F, 10.0F);
/*      */     
/*  807 */     this.gunModel[98].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  808 */     this.gunModel[98].setRotationPoint(392.0F, -128.0F, 4.0F);
/*      */     
/*  810 */     this.gunModel[99].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F);
/*  811 */     this.gunModel[99].setRotationPoint(392.0F, -137.0F, 4.0F);
/*      */     
/*  813 */     this.gunModel[100].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  814 */     this.gunModel[100].setRotationPoint(392.0F, -128.0F, 26.0F);
/*      */     
/*  816 */     this.gunModel[101].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 9, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  817 */     this.gunModel[101].setRotationPoint(392.0F, -137.0F, 26.0F);
/*      */     
/*  819 */     this.gunModel[102].addShapeBox(-86.0F, -67.0F, -19.0F, 18, 10, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  820 */     this.gunModel[102].setRotationPoint(394.0F, -129.0F, 16.0F);
/*      */     
/*  822 */     this.gunModel[103].addShapeBox(-86.0F, -67.0F, -19.0F, 148, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  823 */     this.gunModel[103].setRotationPoint(259.0F, -78.0F, 18.0F);
/*      */     
/*  825 */     this.gunModel[104].addShapeBox(-86.0F, -67.0F, -19.0F, 148, 2, 8, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel[104].setRotationPoint(259.0F, -78.0F, 10.0F);
/*      */     
/*  828 */     this.gunModel[105].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  829 */     this.gunModel[105].setRotationPoint(373.0F, -56.0F, 33.0F);
/*      */     
/*  831 */     this.gunModel[106].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  832 */     this.gunModel[106].setRotationPoint(373.0F, -44.0F, 33.0F);
/*      */     
/*  834 */     this.gunModel[107].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  835 */     this.gunModel[107].setRotationPoint(373.0F, -24.0F, 33.0F);
/*      */     
/*  837 */     this.gunModel[108].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  838 */     this.gunModel[108].setRotationPoint(373.0F, -14.0F, 33.0F);
/*      */     
/*  840 */     this.gunModel[109].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 4, 37, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  841 */     this.gunModel[109].setRotationPoint(376.0F, -5.0F, 6.0F);
/*      */     
/*  843 */     this.gunModel[110].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 4, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, -5.0F, 0.0F, -6.5F);
/*  844 */     this.gunModel[110].setRotationPoint(376.0F, -1.0F, 6.0F);
/*      */     
/*  846 */     this.gunModel[111].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel[111].setRotationPoint(373.0F, -56.0F, 0.0F);
/*      */     
/*  849 */     this.gunModel[112].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  850 */     this.gunModel[112].setRotationPoint(373.0F, -44.0F, -3.0F);
/*      */     
/*  852 */     this.gunModel[113].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  853 */     this.gunModel[113].setRotationPoint(373.0F, -24.0F, -10.0F);
/*      */     
/*  855 */     this.gunModel[114].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  856 */     this.gunModel[114].setRotationPoint(373.0F, -14.0F, -10.0F);
/*      */     
/*  858 */     this.gunModel[115].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 4, 13, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel[115].setRotationPoint(376.0F, -5.0F, -7.0F);
/*      */     
/*  861 */     this.gunModel[116].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  862 */     this.gunModel[116].setRotationPoint(376.0F, -1.0F, -4.0F);
/*      */     
/*  864 */     this.gunModel[117].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 39, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  865 */     this.gunModel[117].setRotationPoint(398.0F, -56.0F, 10.5F);
/*      */     
/*  867 */     this.gunModel[118].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 51, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  868 */     this.gunModel[118].setRotationPoint(393.0F, -56.0F, 3.0F);
/*      */     
/*  870 */     this.gunModel[119].addShapeBox(-86.0F, -67.0F, -19.0F, 133, 16, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  871 */     this.gunModel[119].setRotationPoint(408.0F, -40.0F, 10.5F);
/*      */     
/*  873 */     this.gunModel[120].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 20, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  874 */     this.gunModel[120].setRotationPoint(417.0F, -42.0F, 8.5F);
/*      */     
/*  876 */     this.gunModel[121].addShapeBox(-86.0F, -67.0F, -19.0F, 48, 20, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  877 */     this.gunModel[121].setRotationPoint(515.0F, -42.0F, 8.5F);
/*      */     
/*  879 */     this.gunModel[122].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 18, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  880 */     this.gunModel[122].setRotationPoint(448.0F, -41.0F, 9.5F);
/*      */     
/*  882 */     this.gunModel[123].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  883 */     this.gunModel[123].setRotationPoint(398.0F, -56.0F, 8.5F);
/*      */     
/*  885 */     this.gunModel[124].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  886 */     this.gunModel[124].setRotationPoint(398.0F, -56.0F, 26.0F);
/*      */     
/*  888 */     this.gunModel[125].addBox(-86.0F, -67.0F, -19.0F, 111, 3, 24, 0.0F);
/*  889 */     this.gunModel[125].setRotationPoint(261.0F, -59.0F, 6.0F);
/*      */     
/*  891 */     this.gunModel[126].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  892 */     this.gunModel[126].setRotationPoint(366.0F, -56.0F, 33.0F);
/*      */     
/*  894 */     this.gunModel[127].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  895 */     this.gunModel[127].setRotationPoint(366.0F, -24.0F, 33.0F);
/*      */     
/*  897 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  898 */     this.gunModel[''].setRotationPoint(366.0F, -44.0F, 33.0F);
/*      */     
/*  900 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  901 */     this.gunModel[''].setRotationPoint(366.0F, -14.0F, 33.0F);
/*      */     
/*  903 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  904 */     this.gunModel[''].setRotationPoint(359.0F, -56.0F, 33.0F);
/*      */     
/*  906 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  907 */     this.gunModel[''].setRotationPoint(359.0F, -24.0F, 33.0F);
/*      */     
/*  909 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  910 */     this.gunModel[''].setRotationPoint(359.0F, -44.0F, 33.0F);
/*      */     
/*  912 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  913 */     this.gunModel[''].setRotationPoint(359.0F, -14.0F, 33.0F);
/*      */     
/*  915 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  916 */     this.gunModel[''].setRotationPoint(352.0F, -56.0F, 33.0F);
/*      */     
/*  918 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  919 */     this.gunModel[''].setRotationPoint(352.0F, -24.0F, 33.0F);
/*      */     
/*  921 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  922 */     this.gunModel[''].setRotationPoint(352.0F, -44.0F, 33.0F);
/*      */     
/*  924 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  925 */     this.gunModel[''].setRotationPoint(352.0F, -14.0F, 33.0F);
/*      */     
/*  927 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  928 */     this.gunModel[''].setRotationPoint(345.0F, -56.0F, 33.0F);
/*      */     
/*  930 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  931 */     this.gunModel[''].setRotationPoint(345.0F, -24.0F, 33.0F);
/*      */     
/*  933 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  934 */     this.gunModel[''].setRotationPoint(345.0F, -44.0F, 33.0F);
/*      */     
/*  936 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  937 */     this.gunModel[''].setRotationPoint(345.0F, -14.0F, 33.0F);
/*      */     
/*  939 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  940 */     this.gunModel[''].setRotationPoint(338.0F, -56.0F, 33.0F);
/*      */     
/*  942 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  943 */     this.gunModel[''].setRotationPoint(338.0F, -24.0F, 33.0F);
/*      */     
/*  945 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  946 */     this.gunModel[''].setRotationPoint(338.0F, -44.0F, 33.0F);
/*      */     
/*  948 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  949 */     this.gunModel[''].setRotationPoint(338.0F, -14.0F, 33.0F);
/*      */     
/*  951 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  952 */     this.gunModel[''].setRotationPoint(331.0F, -56.0F, 33.0F);
/*      */     
/*  954 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  955 */     this.gunModel[''].setRotationPoint(331.0F, -24.0F, 33.0F);
/*      */     
/*  957 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  958 */     this.gunModel[''].setRotationPoint(331.0F, -44.0F, 33.0F);
/*      */     
/*  960 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  961 */     this.gunModel[''].setRotationPoint(331.0F, -14.0F, 33.0F);
/*      */     
/*  963 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  964 */     this.gunModel[''].setRotationPoint(324.0F, -56.0F, 33.0F);
/*      */     
/*  966 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  967 */     this.gunModel[''].setRotationPoint(324.0F, -24.0F, 33.0F);
/*      */     
/*  969 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  970 */     this.gunModel[''].setRotationPoint(324.0F, -44.0F, 33.0F);
/*      */     
/*  972 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  973 */     this.gunModel[''].setRotationPoint(324.0F, -14.0F, 33.0F);
/*      */     
/*  975 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  976 */     this.gunModel[''].setRotationPoint(317.0F, -56.0F, 33.0F);
/*      */     
/*  978 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  979 */     this.gunModel[''].setRotationPoint(317.0F, -24.0F, 33.0F);
/*      */     
/*  981 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  982 */     this.gunModel[''].setRotationPoint(317.0F, -44.0F, 33.0F);
/*      */     
/*  984 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  985 */     this.gunModel[''].setRotationPoint(317.0F, -14.0F, 33.0F);
/*      */     
/*  987 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/*  988 */     this.gunModel[''].setRotationPoint(310.0F, -56.0F, 33.0F);
/*      */     
/*  990 */     this.gunModel[''].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  991 */     this.gunModel[''].setRotationPoint(310.0F, -24.0F, 33.0F);
/*      */     
/*  993 */     this.gunModel[' '].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/*  994 */     this.gunModel[' '].setRotationPoint(310.0F, -44.0F, 33.0F);
/*      */     
/*  996 */     this.gunModel['¡'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  997 */     this.gunModel['¡'].setRotationPoint(310.0F, -14.0F, 33.0F);
/*      */     
/*  999 */     this.gunModel['¢'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1000 */     this.gunModel['¢'].setRotationPoint(303.0F, -56.0F, 33.0F);
/*      */     
/* 1002 */     this.gunModel['£'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1003 */     this.gunModel['£'].setRotationPoint(303.0F, -24.0F, 33.0F);
/*      */     
/* 1005 */     this.gunModel['¤'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1006 */     this.gunModel['¤'].setRotationPoint(303.0F, -44.0F, 33.0F);
/*      */     
/* 1008 */     this.gunModel['¥'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1009 */     this.gunModel['¥'].setRotationPoint(303.0F, -14.0F, 33.0F);
/*      */     
/* 1011 */     this.gunModel['¦'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1012 */     this.gunModel['¦'].setRotationPoint(296.0F, -56.0F, 33.0F);
/*      */     
/* 1014 */     this.gunModel['§'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1015 */     this.gunModel['§'].setRotationPoint(296.0F, -24.0F, 33.0F);
/*      */     
/* 1017 */     this.gunModel['¨'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1018 */     this.gunModel['¨'].setRotationPoint(296.0F, -44.0F, 33.0F);
/*      */     
/* 1020 */     this.gunModel['©'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1021 */     this.gunModel['©'].setRotationPoint(296.0F, -14.0F, 33.0F);
/*      */     
/* 1023 */     this.gunModel['ª'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1024 */     this.gunModel['ª'].setRotationPoint(289.0F, -56.0F, 33.0F);
/*      */     
/* 1026 */     this.gunModel['«'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel['«'].setRotationPoint(289.0F, -24.0F, 33.0F);
/*      */     
/* 1029 */     this.gunModel['¬'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1030 */     this.gunModel['¬'].setRotationPoint(289.0F, -44.0F, 33.0F);
/*      */     
/* 1032 */     this.gunModel['­'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1033 */     this.gunModel['­'].setRotationPoint(289.0F, -14.0F, 33.0F);
/*      */     
/* 1035 */     this.gunModel['®'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1036 */     this.gunModel['®'].setRotationPoint(282.0F, -56.0F, 33.0F);
/*      */     
/* 1038 */     this.gunModel['¯'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['¯'].setRotationPoint(282.0F, -24.0F, 33.0F);
/*      */     
/* 1041 */     this.gunModel['°'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1042 */     this.gunModel['°'].setRotationPoint(282.0F, -44.0F, 33.0F);
/*      */     
/* 1044 */     this.gunModel['±'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1045 */     this.gunModel['±'].setRotationPoint(282.0F, -14.0F, 33.0F);
/*      */     
/* 1047 */     this.gunModel['²'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1048 */     this.gunModel['²'].setRotationPoint(275.0F, -56.0F, 33.0F);
/*      */     
/* 1050 */     this.gunModel['³'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1051 */     this.gunModel['³'].setRotationPoint(275.0F, -24.0F, 33.0F);
/*      */     
/* 1053 */     this.gunModel['´'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1054 */     this.gunModel['´'].setRotationPoint(275.0F, -44.0F, 33.0F);
/*      */     
/* 1056 */     this.gunModel['µ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1057 */     this.gunModel['µ'].setRotationPoint(275.0F, -14.0F, 33.0F);
/*      */     
/* 1059 */     this.gunModel['¶'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1060 */     this.gunModel['¶'].setRotationPoint(268.0F, -56.0F, 33.0F);
/*      */     
/* 1062 */     this.gunModel['·'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1063 */     this.gunModel['·'].setRotationPoint(268.0F, -24.0F, 33.0F);
/*      */     
/* 1065 */     this.gunModel['¸'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1066 */     this.gunModel['¸'].setRotationPoint(268.0F, -44.0F, 33.0F);
/*      */     
/* 1068 */     this.gunModel['¹'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1069 */     this.gunModel['¹'].setRotationPoint(268.0F, -14.0F, 33.0F);
/*      */     
/* 1071 */     this.gunModel['º'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1072 */     this.gunModel['º'].setRotationPoint(261.0F, -56.0F, 33.0F);
/*      */     
/* 1074 */     this.gunModel['»'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1075 */     this.gunModel['»'].setRotationPoint(261.0F, -24.0F, 33.0F);
/*      */     
/* 1077 */     this.gunModel['¼'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1078 */     this.gunModel['¼'].setRotationPoint(261.0F, -44.0F, 33.0F);
/*      */     
/* 1080 */     this.gunModel['½'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1081 */     this.gunModel['½'].setRotationPoint(261.0F, -14.0F, 33.0F);
/*      */     
/* 1083 */     this.gunModel['¾'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 1084 */     this.gunModel['¾'].setRotationPoint(257.0F, -56.0F, 33.0F);
/*      */     
/* 1086 */     this.gunModel['¿'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F);
/* 1087 */     this.gunModel['¿'].setRotationPoint(257.0F, -44.0F, 33.0F);
/*      */     
/* 1089 */     this.gunModel['À'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1090 */     this.gunModel['À'].setRotationPoint(257.0F, -24.0F, 33.0F);
/*      */     
/* 1092 */     this.gunModel['Á'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -4.0F, 0.0F, 0.25F, -4.0F);
/* 1093 */     this.gunModel['Á'].setRotationPoint(257.0F, -14.0F, 33.0F);
/*      */     
/* 1095 */     this.gunModel['Â'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 9, 13, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1096 */     this.gunModel['Â'].setRotationPoint(241.0F, -14.0F, 33.0F);
/*      */     
/* 1098 */     this.gunModel['Ã'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 10, 13, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1099 */     this.gunModel['Ã'].setRotationPoint(241.0F, -24.0F, 33.0F);
/*      */     
/* 1101 */     this.gunModel['Ä'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 20, 6, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F);
/* 1102 */     this.gunModel['Ä'].setRotationPoint(241.0F, -44.0F, 33.0F);
/*      */     
/* 1104 */     this.gunModel['Å'].addShapeBox(-86.0F, -67.0F, -19.0F, 250, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1105 */     this.gunModel['Å'].setRotationPoint(7.0F, -56.0F, 33.0F);
/*      */     
/* 1107 */     this.gunModel['Æ'].addShapeBox(-86.0F, -67.0F, -19.0F, 21, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1108 */     this.gunModel['Æ'].setRotationPoint(235.0F, -76.0F, 32.0F);
/*      */     
/* 1110 */     this.gunModel['Ç'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1111 */     this.gunModel['Ç'].setRotationPoint(251.0F, -76.0F, 10.0F);
/*      */     
/* 1113 */     this.gunModel['È'].addShapeBox(-86.0F, -67.0F, -19.0F, 23, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1114 */     this.gunModel['È'].setRotationPoint(236.0F, -78.0F, 18.0F);
/*      */     
/* 1116 */     this.gunModel['É'].addShapeBox(-86.0F, -67.0F, -19.0F, 23, 2, 8, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1117 */     this.gunModel['É'].setRotationPoint(236.0F, -78.0F, 10.0F);
/*      */     
/* 1119 */     this.gunModel['Ê'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 6, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1120 */     this.gunModel['Ê'].setRotationPoint(256.0F, -74.0F, 0.0F);
/*      */     
/* 1122 */     this.gunModel['Ë'].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 2, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1123 */     this.gunModel['Ë'].setRotationPoint(237.0F, -76.0F, 6.0F);
/*      */     
/* 1125 */     this.gunModel['Ì'].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1126 */     this.gunModel['Ì'].setRotationPoint(237.0F, -76.0F, 26.0F);
/*      */     
/* 1128 */     this.gunModel['Í'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1129 */     this.gunModel['Í'].setRotationPoint(256.0F, -74.0F, 30.0F);
/*      */     
/* 1131 */     this.gunModel['Î'].addShapeBox(-86.0F, -67.0F, -19.0F, 21, 15, 4, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1132 */     this.gunModel['Î'].setRotationPoint(235.0F, -91.0F, 32.0F);
/*      */     
/* 1134 */     this.gunModel['Ï'].addShapeBox(-86.0F, -67.0F, -19.0F, 21, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1135 */     this.gunModel['Ï'].setRotationPoint(235.0F, -76.0F, 0.0F);
/*      */     
/* 1137 */     this.gunModel['Ð'].addShapeBox(-86.0F, -67.0F, -19.0F, 21, 15, 4, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1138 */     this.gunModel['Ð'].setRotationPoint(235.0F, -91.0F, 0.0F);
/*      */     
/* 1140 */     this.gunModel['Ñ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 11, 32, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1141 */     this.gunModel['Ñ'].setRotationPoint(229.0F, -85.0F, 0.0F);
/*      */     
/* 1143 */     this.gunModel['Ò'].addShapeBox(-86.0F, -67.0F, -19.0F, 12, 6, 32, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1144 */     this.gunModel['Ò'].setRotationPoint(223.0F, -74.0F, 0.0F);
/*      */     
/* 1146 */     this.gunModel['Ó'].addShapeBox(-86.0F, -67.0F, -19.0F, 14, 32, 4, 0.0F, 15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1147 */     this.gunModel['Ó'].setRotationPoint(235.0F, -123.0F, 32.0F);
/*      */     
/* 1149 */     this.gunModel['Ô'].addShapeBox(-86.0F, -67.0F, -19.0F, 14, 32, 4, 0.0F, 15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1150 */     this.gunModel['Ô'].setRotationPoint(235.0F, -123.0F, 0.0F);
/*      */     
/* 1152 */     this.gunModel['Õ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 32, 28, 0.0F, 15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1153 */     this.gunModel['Õ'].setRotationPoint(235.0F, -123.0F, 4.0F);
/*      */     
/* 1155 */     this.gunModel['Ö'].addShapeBox(-86.0F, -67.0F, -19.0F, 215, 6, 4, 0.0F, 11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F);
/* 1156 */     this.gunModel['Ö'].setRotationPoint(19.0F, -129.0F, 32.0F);
/*      */     
/* 1158 */     this.gunModel['×'].addShapeBox(-86.0F, -67.0F, -19.0F, 215, 6, 4, 0.0F, 11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F);
/* 1159 */     this.gunModel['×'].setRotationPoint(19.0F, -129.0F, 0.0F);
/*      */     
/* 1161 */     this.gunModel['Ø'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 11, 4, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1162 */     this.gunModel['Ø'].setRotationPoint(229.0F, -85.0F, 32.0F);
/*      */     
/* 1164 */     this.gunModel['Ù'].addShapeBox(-86.0F, -67.0F, -19.0F, 12, 6, 4, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1165 */     this.gunModel['Ù'].setRotationPoint(223.0F, -74.0F, 32.0F);
/*      */     
/* 1167 */     this.gunModel['Ú'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 23, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1168 */     this.gunModel['Ú'].setRotationPoint(235.0F, -91.0F, 4.0F);
/*      */     
/* 1170 */     this.gunModel['Û'].addShapeBox(-86.0F, -67.0F, -19.0F, 250, 39, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1171 */     this.gunModel['Û'].setRotationPoint(7.0F, -44.0F, -3.0F);
/*      */     
/* 1173 */     this.gunModel['Ü'].addBox(-86.0F, -67.0F, -19.0F, 208, 8, 6, 0.0F);
/* 1174 */     this.gunModel['Ü'].setRotationPoint(7.0F, -68.0F, 36.0F);
/*      */     
/* 1176 */     this.gunModel['Ý'].addShapeBox(-86.0F, -67.0F, -19.0F, 19, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 1177 */     this.gunModel['Ý'].setRotationPoint(215.0F, -68.0F, 36.0F);
/*      */     
/* 1179 */     this.gunModel['Þ'].addShapeBox(-86.0F, -67.0F, -19.0F, 119, 25, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -25.0F, 0.0F, 0.0F, -25.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1180 */     this.gunModel['Þ'].setRotationPoint(122.0F, -5.0F, -3.0F);
/*      */     
/* 1182 */     this.gunModel['ß'].addShapeBox(-86.0F, -67.0F, -19.0F, 24, 9, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F);
/* 1183 */     this.gunModel['ß'].setRotationPoint(87.0F, -5.0F, 33.0F);
/*      */     
/* 1185 */     this.gunModel['à'].addShapeBox(-86.0F, -67.0F, -19.0F, 9, 9, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F);
/* 1186 */     this.gunModel['à'].setRotationPoint(111.0F, -5.0F, 33.0F);
/*      */     
/* 1188 */     this.gunModel['á'].addShapeBox(-86.0F, -67.0F, -19.0F, 7, 14, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 1189 */     this.gunModel['á'].setRotationPoint(113.0F, 4.0F, 33.0F);
/*      */     
/* 1191 */     this.gunModel['â'].addShapeBox(-86.0F, -67.0F, -19.0F, 26, 9, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/* 1192 */     this.gunModel['â'].setRotationPoint(61.0F, -5.0F, 33.0F);
/*      */     
/* 1194 */     this.gunModel['ã'].addShapeBox(-86.0F, -67.0F, -19.0F, 115, 23, 36, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1195 */     this.gunModel['ã'].setRotationPoint(7.0F, -5.0F, -3.0F);
/*      */     
/* 1197 */     this.gunModel['ä'].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 12, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -26.0F, 0.0F, 0.0F, -26.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1198 */     this.gunModel['ä'].setRotationPoint(255.0F, -7.0F, 3.0F);
/*      */     
/* 1200 */     this.gunModel['å'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1201 */     this.gunModel['å'].setRotationPoint(366.0F, -56.0F, 0.0F);
/*      */     
/* 1203 */     this.gunModel['æ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1204 */     this.gunModel['æ'].setRotationPoint(366.0F, -44.0F, -3.0F);
/*      */     
/* 1206 */     this.gunModel['ç'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1207 */     this.gunModel['ç'].setRotationPoint(366.0F, -24.0F, -10.0F);
/*      */     
/* 1209 */     this.gunModel['è'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1210 */     this.gunModel['è'].setRotationPoint(366.0F, -14.0F, -10.0F);
/*      */     
/* 1212 */     this.gunModel['é'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1213 */     this.gunModel['é'].setRotationPoint(359.0F, -56.0F, 0.0F);
/*      */     
/* 1215 */     this.gunModel['ê'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1216 */     this.gunModel['ê'].setRotationPoint(359.0F, -44.0F, -3.0F);
/*      */     
/* 1218 */     this.gunModel['ë'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1219 */     this.gunModel['ë'].setRotationPoint(359.0F, -24.0F, -10.0F);
/*      */     
/* 1221 */     this.gunModel['ì'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1222 */     this.gunModel['ì'].setRotationPoint(359.0F, -14.0F, -10.0F);
/*      */     
/* 1224 */     this.gunModel['í'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1225 */     this.gunModel['í'].setRotationPoint(352.0F, -56.0F, 0.0F);
/*      */     
/* 1227 */     this.gunModel['î'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1228 */     this.gunModel['î'].setRotationPoint(352.0F, -44.0F, -3.0F);
/*      */     
/* 1230 */     this.gunModel['ï'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1231 */     this.gunModel['ï'].setRotationPoint(352.0F, -24.0F, -10.0F);
/*      */     
/* 1233 */     this.gunModel['ð'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1234 */     this.gunModel['ð'].setRotationPoint(352.0F, -14.0F, -10.0F);
/*      */     
/* 1236 */     this.gunModel['ñ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1237 */     this.gunModel['ñ'].setRotationPoint(345.0F, -56.0F, 0.0F);
/*      */     
/* 1239 */     this.gunModel['ò'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1240 */     this.gunModel['ò'].setRotationPoint(345.0F, -44.0F, -3.0F);
/*      */     
/* 1242 */     this.gunModel['ó'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1243 */     this.gunModel['ó'].setRotationPoint(345.0F, -24.0F, -10.0F);
/*      */     
/* 1245 */     this.gunModel['ô'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1246 */     this.gunModel['ô'].setRotationPoint(345.0F, -14.0F, -10.0F);
/*      */     
/* 1248 */     this.gunModel['õ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1249 */     this.gunModel['õ'].setRotationPoint(338.0F, -56.0F, 0.0F);
/*      */     
/* 1251 */     this.gunModel['ö'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1252 */     this.gunModel['ö'].setRotationPoint(338.0F, -44.0F, -3.0F);
/*      */     
/* 1254 */     this.gunModel['÷'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.gunModel['÷'].setRotationPoint(338.0F, -24.0F, -10.0F);
/*      */     
/* 1257 */     this.gunModel['ø'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1258 */     this.gunModel['ø'].setRotationPoint(338.0F, -14.0F, -10.0F);
/*      */     
/* 1260 */     this.gunModel['ù'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1261 */     this.gunModel['ù'].setRotationPoint(331.0F, -56.0F, 0.0F);
/*      */     
/* 1263 */     this.gunModel['ú'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1264 */     this.gunModel['ú'].setRotationPoint(331.0F, -44.0F, -3.0F);
/*      */     
/* 1266 */     this.gunModel['û'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1267 */     this.gunModel['û'].setRotationPoint(331.0F, -24.0F, -10.0F);
/*      */     
/* 1269 */     this.gunModel['ü'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.gunModel['ü'].setRotationPoint(331.0F, -14.0F, -10.0F);
/*      */     
/* 1272 */     this.gunModel['ý'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1273 */     this.gunModel['ý'].setRotationPoint(324.0F, -56.0F, 0.0F);
/*      */     
/* 1275 */     this.gunModel['þ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1276 */     this.gunModel['þ'].setRotationPoint(324.0F, -44.0F, -3.0F);
/*      */     
/* 1278 */     this.gunModel['ÿ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1279 */     this.gunModel['ÿ'].setRotationPoint(324.0F, -24.0F, -10.0F);
/*      */     
/* 1281 */     this.gunModel['Ā'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1282 */     this.gunModel['Ā'].setRotationPoint(324.0F, -14.0F, -10.0F);
/*      */     
/* 1284 */     this.gunModel['ā'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1285 */     this.gunModel['ā'].setRotationPoint(317.0F, -56.0F, 0.0F);
/*      */     
/* 1287 */     this.gunModel['Ă'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.gunModel['Ă'].setRotationPoint(317.0F, -44.0F, -3.0F);
/*      */     
/* 1290 */     this.gunModel['ă'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.gunModel['ă'].setRotationPoint(317.0F, -24.0F, -10.0F);
/*      */     
/* 1293 */     this.gunModel['Ą'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1294 */     this.gunModel['Ą'].setRotationPoint(317.0F, -14.0F, -10.0F);
/*      */     
/* 1296 */     this.gunModel['ą'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1297 */     this.gunModel['ą'].setRotationPoint(310.0F, -56.0F, 0.0F);
/*      */     
/* 1299 */     this.gunModel['Ć'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1300 */     this.gunModel['Ć'].setRotationPoint(310.0F, -44.0F, -3.0F);
/*      */     
/* 1302 */     this.gunModel['ć'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.gunModel['ć'].setRotationPoint(310.0F, -24.0F, -10.0F);
/*      */     
/* 1305 */     this.gunModel['Ĉ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1306 */     this.gunModel['Ĉ'].setRotationPoint(310.0F, -14.0F, -10.0F);
/*      */     
/* 1308 */     this.gunModel['ĉ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1309 */     this.gunModel['ĉ'].setRotationPoint(303.0F, -56.0F, 0.0F);
/*      */     
/* 1311 */     this.gunModel['Ċ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1312 */     this.gunModel['Ċ'].setRotationPoint(303.0F, -44.0F, -3.0F);
/*      */     
/* 1314 */     this.gunModel['ċ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1315 */     this.gunModel['ċ'].setRotationPoint(303.0F, -24.0F, -10.0F);
/*      */     
/* 1317 */     this.gunModel['Č'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1318 */     this.gunModel['Č'].setRotationPoint(303.0F, -14.0F, -10.0F);
/*      */     
/* 1320 */     this.gunModel['č'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1321 */     this.gunModel['č'].setRotationPoint(296.0F, -56.0F, 0.0F);
/*      */     
/* 1323 */     this.gunModel['Ď'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1324 */     this.gunModel['Ď'].setRotationPoint(296.0F, -44.0F, -3.0F);
/*      */     
/* 1326 */     this.gunModel['ď'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1327 */     this.gunModel['ď'].setRotationPoint(296.0F, -24.0F, -10.0F);
/*      */     
/* 1329 */     this.gunModel['Đ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1330 */     this.gunModel['Đ'].setRotationPoint(296.0F, -14.0F, -10.0F);
/*      */     
/* 1332 */     this.gunModel['đ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1333 */     this.gunModel['đ'].setRotationPoint(289.0F, -56.0F, 0.0F);
/*      */     
/* 1335 */     this.gunModel['Ē'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     this.gunModel['Ē'].setRotationPoint(289.0F, -44.0F, -3.0F);
/*      */     
/* 1338 */     this.gunModel['ē'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1339 */     this.gunModel['ē'].setRotationPoint(289.0F, -24.0F, -10.0F);
/*      */     
/* 1341 */     this.gunModel['Ĕ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1342 */     this.gunModel['Ĕ'].setRotationPoint(289.0F, -14.0F, -10.0F);
/*      */     
/* 1344 */     this.gunModel['ĕ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1345 */     this.gunModel['ĕ'].setRotationPoint(282.0F, -56.0F, 0.0F);
/*      */     
/* 1347 */     this.gunModel['Ė'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1348 */     this.gunModel['Ė'].setRotationPoint(282.0F, -44.0F, -3.0F);
/*      */     
/* 1350 */     this.gunModel['ė'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1351 */     this.gunModel['ė'].setRotationPoint(282.0F, -24.0F, -10.0F);
/*      */     
/* 1353 */     this.gunModel['Ę'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1354 */     this.gunModel['Ę'].setRotationPoint(282.0F, -14.0F, -10.0F);
/*      */     
/* 1356 */     this.gunModel['ę'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1357 */     this.gunModel['ę'].setRotationPoint(275.0F, -56.0F, 0.0F);
/*      */     
/* 1359 */     this.gunModel['Ě'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1360 */     this.gunModel['Ě'].setRotationPoint(275.0F, -44.0F, -3.0F);
/*      */     
/* 1362 */     this.gunModel['ě'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1363 */     this.gunModel['ě'].setRotationPoint(275.0F, -24.0F, -10.0F);
/*      */     
/* 1365 */     this.gunModel['Ĝ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1366 */     this.gunModel['Ĝ'].setRotationPoint(275.0F, -14.0F, -10.0F);
/*      */     
/* 1368 */     this.gunModel['ĝ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1369 */     this.gunModel['ĝ'].setRotationPoint(268.0F, -56.0F, 0.0F);
/*      */     
/* 1371 */     this.gunModel['Ğ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1372 */     this.gunModel['Ğ'].setRotationPoint(268.0F, -44.0F, -3.0F);
/*      */     
/* 1374 */     this.gunModel['ğ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1375 */     this.gunModel['ğ'].setRotationPoint(268.0F, -24.0F, -10.0F);
/*      */     
/* 1377 */     this.gunModel['Ġ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1378 */     this.gunModel['Ġ'].setRotationPoint(268.0F, -14.0F, -10.0F);
/*      */     
/* 1380 */     this.gunModel['ġ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.gunModel['ġ'].setRotationPoint(261.0F, -56.0F, 0.0F);
/*      */     
/* 1383 */     this.gunModel['Ģ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1384 */     this.gunModel['Ģ'].setRotationPoint(261.0F, -44.0F, -3.0F);
/*      */     
/* 1386 */     this.gunModel['ģ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1387 */     this.gunModel['ģ'].setRotationPoint(261.0F, -24.0F, -10.0F);
/*      */     
/* 1389 */     this.gunModel['Ĥ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1390 */     this.gunModel['Ĥ'].setRotationPoint(261.0F, -14.0F, -10.0F);
/*      */     
/* 1392 */     this.gunModel['ĥ'].addShapeBox(-86.0F, -67.0F, -19.0F, 250, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1393 */     this.gunModel['ĥ'].setRotationPoint(7.0F, -56.0F, 0.0F);
/*      */     
/* 1395 */     this.gunModel['Ħ'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1396 */     this.gunModel['Ħ'].setRotationPoint(241.0F, -44.0F, -3.0F);
/*      */     
/* 1398 */     this.gunModel['ħ'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1399 */     this.gunModel['ħ'].setRotationPoint(241.0F, -24.0F, -10.0F);
/*      */     
/* 1401 */     this.gunModel['Ĩ'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1402 */     this.gunModel['Ĩ'].setRotationPoint(241.0F, -14.0F, -10.0F);
/*      */     
/* 1404 */     this.gunModel['ĩ'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 12, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1405 */     this.gunModel['ĩ'].setRotationPoint(257.0F, -56.0F, 0.0F);
/*      */     
/* 1407 */     this.gunModel['Ī'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 20, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.gunModel['Ī'].setRotationPoint(257.0F, -44.0F, -3.0F);
/*      */     
/* 1410 */     this.gunModel['ī'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 10, 13, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1411 */     this.gunModel['ī'].setRotationPoint(257.0F, -24.0F, -10.0F);
/*      */     
/* 1413 */     this.gunModel['Ĭ'].addShapeBox(-86.0F, -67.0F, -19.0F, 116, 9, 43, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -4.0F, 0.0F, 0.25F, -4.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1414 */     this.gunModel['Ĭ'].setRotationPoint(257.0F, -14.0F, -10.0F);
/*      */     
/* 1416 */     this.gunModel['ĭ'].addShapeBox(-86.0F, -67.0F, -19.0F, 204, 2, 4, 0.0F, 11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F);
/* 1417 */     this.gunModel['ĭ'].setRotationPoint(19.0F, -131.0F, 32.0F);
/*      */     
/* 1419 */     this.gunModel['Į'].addShapeBox(-86.0F, -67.0F, -19.0F, 193, 6, 4, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F);
/* 1420 */     this.gunModel['Į'].setRotationPoint(19.0F, -137.0F, 32.0F);
/*      */     
/* 1422 */     this.gunModel['į'].addShapeBox(-86.0F, -67.0F, -19.0F, 193, 6, 4, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F);
/* 1423 */     this.gunModel['į'].setRotationPoint(19.0F, -137.0F, 0.0F);
/*      */     
/* 1425 */     this.gunModel['İ'].addShapeBox(-86.0F, -67.0F, -19.0F, 204, 2, 4, 0.0F, 11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F);
/* 1426 */     this.gunModel['İ'].setRotationPoint(19.0F, -131.0F, 0.0F);
/*      */     
/* 1428 */     this.gunModel['ı'].addBox(-86.0F, -67.0F, -19.0F, 16, 60, 42, 0.0F);
/* 1429 */     this.gunModel['ı'].setRotationPoint(7.0F, -128.0F, 0.0F);
/*      */     
/* 1431 */     this.gunModel['Ĳ'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 5, 6, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1432 */     this.gunModel['Ĳ'].setRotationPoint(7.0F, -133.0F, 36.0F);
/*      */     
/* 1434 */     this.gunModel['ĳ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 2, 6, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1435 */     this.gunModel['ĳ'].setRotationPoint(11.0F, -135.0F, 36.0F);
/*      */     
/* 1437 */     this.gunModel['Ĵ'].addShapeBox(-86.0F, -67.0F, -19.0F, 8, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1438 */     this.gunModel['Ĵ'].setRotationPoint(15.0F, -135.0F, 36.0F);
/*      */     
/* 1440 */     this.gunModel['ĵ'].addShapeBox(-86.0F, -67.0F, -19.0F, 190, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F);
/* 1441 */     this.gunModel['ĵ'].setRotationPoint(33.0F, -135.0F, 36.0F);
/*      */     
/* 1443 */     this.gunModel['Ķ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1444 */     this.gunModel['Ķ'].setRotationPoint(23.0F, -135.0F, 36.0F);
/*      */     
/* 1446 */     this.gunModel['ķ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1447 */     this.gunModel['ķ'].setRotationPoint(23.0F, -120.0F, 36.0F);
/*      */     
/* 1449 */     this.gunModel['ĸ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1450 */     this.gunModel['ĸ'].setRotationPoint(29.0F, -123.0F, 36.0F);
/*      */     
/* 1452 */     this.gunModel['Ĺ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1453 */     this.gunModel['Ĺ'].setRotationPoint(23.0F, -123.0F, 36.0F);
/*      */     
/* 1455 */     this.gunModel['ĺ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1456 */     this.gunModel['ĺ'].setRotationPoint(23.0F, -120.0F, -6.0F);
/*      */     
/* 1458 */     this.gunModel['Ļ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1459 */     this.gunModel['Ļ'].setRotationPoint(29.0F, -123.0F, -6.0F);
/*      */     
/* 1461 */     this.gunModel['ļ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1462 */     this.gunModel['ļ'].setRotationPoint(23.0F, -123.0F, -6.0F);
/*      */     
/* 1464 */     this.gunModel['Ľ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1465 */     this.gunModel['Ľ'].setRotationPoint(398.0F, -56.0F, 3.0F);
/*      */     
/* 1467 */     this.gunModel['ľ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1468 */     this.gunModel['ľ'].setRotationPoint(398.0F, -56.0F, 31.0F);
/*      */     
/* 1470 */     this.gunModel['Ŀ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1471 */     this.gunModel['Ŀ'].setRotationPoint(398.0F, -7.0F, 31.0F);
/*      */     
/* 1473 */     this.gunModel['ŀ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1474 */     this.gunModel['ŀ'].setRotationPoint(398.0F, -7.0F, 3.0F);
/*      */     
/* 1476 */     this.gunModel['Ł'].addBox(-86.0F, -67.0F, -19.0F, 16, 60, 6, 0.0F);
/* 1477 */     this.gunModel['Ł'].setRotationPoint(7.0F, -128.0F, -6.0F);
/*      */     
/* 1479 */     this.gunModel['ł'].addBox(-86.0F, -67.0F, -19.0F, 208, 8, 6, 0.0F);
/* 1480 */     this.gunModel['ł'].setRotationPoint(7.0F, -68.0F, -6.0F);
/*      */     
/* 1482 */     this.gunModel['Ń'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 5, 6, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1483 */     this.gunModel['Ń'].setRotationPoint(7.0F, -133.0F, -6.0F);
/*      */     
/* 1485 */     this.gunModel['ń'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 2, 6, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1486 */     this.gunModel['ń'].setRotationPoint(11.0F, -135.0F, -6.0F);
/*      */     
/* 1488 */     this.gunModel['Ņ'].addShapeBox(-86.0F, -67.0F, -19.0F, 8, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1489 */     this.gunModel['Ņ'].setRotationPoint(15.0F, -135.0F, -6.0F);
/*      */     
/* 1491 */     this.gunModel['ņ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1492 */     this.gunModel['ņ'].setRotationPoint(23.0F, -135.0F, -6.0F);
/*      */     
/* 1494 */     this.gunModel['Ň'].addShapeBox(-86.0F, -67.0F, -19.0F, 190, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -6.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1495 */     this.gunModel['Ň'].setRotationPoint(33.0F, -135.0F, -6.0F);
/*      */     
/* 1497 */     this.gunModel['ň'].addShapeBox(-86.0F, -67.0F, -19.0F, 205, 2, 28, 0.0F, 19.0F, 0.0F, 0.0F, -25.0F, 0.0F, 0.0F, -25.0F, 0.0F, 0.0F, 19.0F, 0.0F, 0.0F, 19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 0.0F, 0.0F);
/* 1498 */     this.gunModel['ň'].setRotationPoint(17.0F, -125.0F, 4.0F);
/*      */     
/* 1500 */     this.gunModel['ŉ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1501 */     this.gunModel['ŉ'].setRotationPoint(30.0F, -129.0F, 4.0F);
/*      */     
/* 1503 */     this.gunModel['Ŋ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1504 */     this.gunModel['Ŋ'].setRotationPoint(30.0F, -129.0F, 24.0F);
/*      */     
/* 1506 */     this.gunModel['ŋ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 4, 8, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1507 */     this.gunModel['ŋ'].setRotationPoint(30.0F, -133.0F, 24.0F);
/*      */     
/* 1509 */     this.gunModel['Ō'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 4, 8, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1510 */     this.gunModel['Ō'].setRotationPoint(30.0F, -133.0F, 4.0F);
/*      */     
/* 1512 */     this.gunModel['ō'].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 3, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1513 */     this.gunModel['ō'].setRotationPoint(29.0F, -131.0F, 27.0F);
/*      */     
/* 1515 */     this.gunModel['Ŏ'].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 3, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1516 */     this.gunModel['Ŏ'].setRotationPoint(29.0F, -131.0F, 6.0F);
/*      */     
/* 1518 */     this.gunModel['ŏ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 1, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1519 */     this.gunModel['ŏ'].setRotationPoint(30.0F, -130.0F, 12.0F);
/*      */     
/* 1521 */     this.gunModel['Ő'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 1, 6, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1522 */     this.gunModel['Ő'].setRotationPoint(30.0F, -130.0F, 18.0F);
/*      */     
/* 1524 */     this.gunModel['ő'].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1525 */     this.gunModel['ő'].setRotationPoint(-2.0F, -127.0F, 30.0F);
/*      */     
/* 1527 */     this.gunModel['Œ'].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1528 */     this.gunModel['Œ'].setRotationPoint(-2.0F, -127.0F, 4.0F);
/*      */     
/* 1530 */     this.gunModel['œ'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1531 */     this.gunModel['œ'].setRotationPoint(40.0F, -136.0F, 24.0F);
/*      */     
/* 1533 */     this.gunModel['Ŕ'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1534 */     this.gunModel['Ŕ'].setRotationPoint(40.0F, -136.0F, 4.0F);
/*      */     
/* 1536 */     this.gunModel['ŕ'].addShapeBox(-86.0F, -67.0F, -19.0F, 161, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1537 */     this.gunModel['ŕ'].setRotationPoint(36.0F, -127.0F, 4.0F);
/*      */     
/* 1539 */     this.gunModel['Ŗ'].addShapeBox(-86.0F, -67.0F, -19.0F, 161, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1540 */     this.gunModel['Ŗ'].setRotationPoint(36.0F, -127.0F, 30.0F);
/*      */     
/* 1542 */     this.gunModel['ŗ'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1543 */     this.gunModel['ŗ'].setRotationPoint(40.0F, -129.0F, 12.0F);
/*      */     
/* 1545 */     this.gunModel['Ř'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 72, 4, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1546 */     this.gunModel['Ř'].setRotationPoint(2.0F, -137.0F, 32.0F);
/*      */     
/* 1548 */     this.gunModel['ř'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 72, 4, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1549 */     this.gunModel['ř'].setRotationPoint(2.0F, -137.0F, 0.0F);
/*      */     
/* 1551 */     this.gunModel['Ś'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 69, 4, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1552 */     this.gunModel['Ś'].setRotationPoint(-1.0F, -134.0F, 32.0F);
/*      */     
/* 1554 */     this.gunModel['ś'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 69, 4, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1555 */     this.gunModel['ś'].setRotationPoint(-1.0F, -134.0F, 0.0F);
/*      */     
/* 1557 */     this.gunModel['Ŝ'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 25, 4, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1558 */     this.gunModel['Ŝ'].setRotationPoint(-6.0F, -129.0F, 0.0F);
/*      */     
/* 1560 */     this.gunModel['ŝ'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 25, 4, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1561 */     this.gunModel['ŝ'].setRotationPoint(-6.0F, -129.0F, 32.0F);
/*      */     
/* 1563 */     this.gunModel['Ş'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 39, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F);
/* 1564 */     this.gunModel['Ş'].setRotationPoint(-6.0F, -104.0F, 0.0F);
/*      */     
/* 1566 */     this.gunModel['ş'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 39, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F);
/* 1567 */     this.gunModel['ş'].setRotationPoint(-6.0F, -104.0F, 32.0F);
/*      */     
/* 1569 */     this.gunModel['Š'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 20, 28, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1570 */     this.gunModel['Š'].setRotationPoint(-6.0F, -124.0F, 4.0F);
/*      */     
/* 1572 */     this.gunModel['š'].addShapeBox(-86.0F, -67.0F, -19.0F, 19, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1573 */     this.gunModel['š'].setRotationPoint(215.0F, -68.0F, -6.0F);
/*      */     
/* 1575 */     this.gunModel['Ţ'].addShapeBox(-86.0F, -67.0F, -19.0F, 225, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1576 */     this.gunModel['Ţ'].setRotationPoint(-218.0F, -56.0F, 33.0F);
/*      */     
/* 1578 */     this.gunModel['ţ'].addShapeBox(-86.0F, -67.0F, -19.0F, 138, 12, 33, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1579 */     this.gunModel['ţ'].setRotationPoint(-218.0F, -56.0F, 0.0F);
/*      */     
/* 1581 */     this.gunModel['Ť'].addShapeBox(-86.0F, -67.0F, -19.0F, 54, 23, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1582 */     this.gunModel['Ť'].setRotationPoint(7.0F, -5.0F, 33.0F);
/*      */     
/* 1584 */     this.gunModel['ť'].addBox(-86.0F, -67.0F, -19.0F, 138, 9, 36, 0.0F);
/* 1585 */     this.gunModel['ť'].setRotationPoint(-218.0F, -65.0F, 0.0F);
/*      */     
/* 1587 */     this.gunModel['Ŧ'].addShapeBox(-86.0F, -67.0F, -19.0F, 145, 10, 36, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1588 */     this.gunModel['Ŧ'].setRotationPoint(-157.0F, -75.0F, 0.0F);
/*      */     
/* 1590 */     this.gunModel['ŧ'].addShapeBox(-86.0F, -67.0F, -19.0F, 145, 4, 24, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1591 */     this.gunModel['ŧ'].setRotationPoint(-157.0F, -79.0F, 6.0F);
/*      */     
/* 1593 */     this.gunModel['Ũ'].addShapeBox(-86.0F, -67.0F, -19.0F, 145, 2, 6, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1594 */     this.gunModel['Ũ'].setRotationPoint(-157.0F, -81.0F, 12.0F);
/*      */     
/* 1596 */     this.gunModel['ũ'].addShapeBox(-86.0F, -67.0F, -19.0F, 145, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1597 */     this.gunModel['ũ'].setRotationPoint(-157.0F, -81.0F, 18.0F);
/*      */     
/* 1599 */     this.gunModel['Ū'].addShapeBox(-86.0F, -67.0F, -19.0F, 138, 24, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1600 */     this.gunModel['Ū'].setRotationPoint(-218.0F, -44.0F, -3.0F);
/*      */     
/* 1602 */     this.gunModel['ū'].addShapeBox(-86.0F, -67.0F, -19.0F, 140, 16, 36, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1603 */     this.gunModel['ū'].setRotationPoint(-133.0F, -20.0F, 3.0F);
/*      */     
/* 1605 */     this.gunModel['Ŭ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 7, 36, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1606 */     this.gunModel['Ŭ'].setRotationPoint(-167.0F, -20.0F, 3.0F);
/*      */     
/* 1608 */     this.gunModel['ŭ'].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 10, 36, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1609 */     this.gunModel['ŭ'].setRotationPoint(-168.0F, -13.0F, 3.0F);
/*      */     
/* 1611 */     this.gunModel['Ů'].addShapeBox(-86.0F, -67.0F, -19.0F, 51, 17, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1612 */     this.gunModel['Ů'].setRotationPoint(-218.0F, -20.0F, -3.0F);
/*      */     
/* 1614 */     this.gunModel['ů'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 22, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1615 */     this.gunModel['ů'].setRotationPoint(1.0F, -4.0F, -3.0F);
/*      */     
/* 1617 */     this.gunModel['Ű'].addShapeBox(-86.0F, -67.0F, -19.0F, 12, 4, 42, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/* 1618 */     this.gunModel['Ű'].setRotationPoint(-11.0F, 14.0F, -3.0F);
/*      */     
/* 1620 */     this.gunModel['ű'].addShapeBox(-86.0F, -67.0F, -19.0F, 95, 4, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1621 */     this.gunModel['ű'].setRotationPoint(-106.0F, 19.0F, -3.0F);
/*      */     
/* 1623 */     this.gunModel['Ų'].addShapeBox(-86.0F, -67.0F, -19.0F, 12, 4, 42, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 1624 */     this.gunModel['Ų'].setRotationPoint(-118.0F, 14.0F, -3.0F);
/*      */     
/* 1626 */     this.gunModel['ų'].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 4, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1627 */     this.gunModel['ų'].setRotationPoint(-153.0F, 10.0F, -3.0F);
/*      */     
/* 1629 */     this.gunModel['Ŵ'].addShapeBox(-86.0F, -67.0F, -19.0F, 140, 19, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1630 */     this.gunModel['Ŵ'].setRotationPoint(-133.0F, -9.0F, 1.0F);
/*      */     
/* 1632 */     this.gunModel['ŵ'].addShapeBox(-86.0F, -67.0F, -19.0F, 107, 9, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1633 */     this.gunModel['ŵ'].setRotationPoint(-110.0F, 10.0F, 1.0F);
/*      */     
/* 1635 */     this.gunModel['Ŷ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 7, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1636 */     this.gunModel['Ŷ'].setRotationPoint(-3.0F, 10.0F, 1.0F);
/*      */     
/* 1638 */     this.gunModel['ŷ'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 6, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1639 */     this.gunModel['ŷ'].setRotationPoint(-115.0F, 10.0F, 1.0F);
/*      */     
/* 1641 */     this.gunModel['Ÿ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 3, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1642 */     this.gunModel['Ÿ'].setRotationPoint(-118.0F, 10.0F, 1.0F);
/*      */     
/* 1644 */     this.gunModel['Ź'].addShapeBox(-86.0F, -67.0F, -19.0F, 36, 31, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1645 */     this.gunModel['Ź'].setRotationPoint(-169.0F, -21.0F, 1.0F);
/*      */     
/* 1647 */     this.gunModel['ź'].addShapeBox(-86.0F, -67.0F, -19.0F, 174, 17, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1648 */     this.gunModel['ź'].setRotationPoint(-167.0F, -20.0F, -3.0F);
/*      */     
/* 1650 */     this.gunModel['Ż'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 11, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1651 */     this.gunModel['Ż'].setRotationPoint(-183.0F, -3.0F, -3.0F);
/*      */     
/* 1653 */     this.gunModel['ż'].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 3, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1654 */     this.gunModel['ż'].setRotationPoint(-183.0F, 8.0F, -3.0F);
/*      */     
/* 1656 */     this.gunModel['Ž'].addShapeBox(-86.0F, -67.0F, -19.0F, 14, 3, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1657 */     this.gunModel['Ž'].setRotationPoint(-183.0F, 11.0F, -3.0F);
/*      */     
/* 1659 */     this.gunModel['ž'].addShapeBox(-86.0F, -67.0F, -19.0F, 22, 4, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1660 */     this.gunModel['ž'].setRotationPoint(-175.0F, 10.0F, 1.0F);
/*      */     
/* 1662 */     this.gunModel['ſ'].addShapeBox(-86.0F, -67.0F, -19.0F, 66, 8, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1663 */     this.gunModel['ſ'].setRotationPoint(-218.0F, 14.0F, 1.0F);
/*      */     
/* 1665 */     this.gunModel['ƀ'].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 17, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1666 */     this.gunModel['ƀ'].setRotationPoint(-218.0F, -3.0F, -3.0F);
/*      */     
/* 1668 */     this.gunModel['Ɓ'].addShapeBox(-86.0F, -67.0F, -19.0F, 53, 10, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1669 */     this.gunModel['Ɓ'].setRotationPoint(-218.0F, 22.0F, 1.0F);
/*      */     
/* 1671 */     this.gunModel['Ƃ'].addShapeBox(-86.0F, -67.0F, -19.0F, 45, 7, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1672 */     this.gunModel['Ƃ'].setRotationPoint(-218.0F, 32.0F, 1.0F);
/*      */     
/* 1674 */     this.gunModel['ƃ'].addShapeBox(-86.0F, -67.0F, -19.0F, 40, 4, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -1.5F, 0.0F, -5.0F, -1.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/* 1675 */     this.gunModel['ƃ'].setRotationPoint(-218.0F, 39.0F, 1.0F);
/*      */     
/* 1677 */     this.gunModel['Ƅ'].addShapeBox(-86.0F, -67.0F, -19.0F, 38, 2, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.5F, 0.0F, -8.0F, 0.5F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F);
/* 1678 */     this.gunModel['Ƅ'].setRotationPoint(-218.0F, 43.0F, 6.0F);
/*      */     
/* 1680 */     this.gunModel['ƅ'].addShapeBox(-86.0F, -67.0F, -19.0F, 11, 10, 36, 0.0F, 0.0F, 5.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 5.0F, -6.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/* 1681 */     this.gunModel['ƅ'].setRotationPoint(-168.0F, -75.0F, 0.0F);
/*      */     
/* 1683 */     this.gunModel['Ɔ'].addShapeBox(-86.0F, -67.0F, -19.0F, 11, 4, 24, 0.0F, 0.0F, 5.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 5.0F, -6.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/* 1684 */     this.gunModel['Ɔ'].setRotationPoint(-168.0F, -79.0F, 6.0F);
/*      */     
/* 1686 */     this.gunModel['Ƈ'].addShapeBox(-86.0F, -67.0F, -19.0F, 11, 2, 6, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/* 1687 */     this.gunModel['Ƈ'].setRotationPoint(-168.0F, -81.0F, 18.0F);
/*      */     
/* 1689 */     this.gunModel['ƈ'].addShapeBox(-86.0F, -67.0F, -19.0F, 11, 2, 6, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/* 1690 */     this.gunModel['ƈ'].setRotationPoint(-168.0F, -81.0F, 12.0F);
/*      */     
/* 1692 */     this.gunModel['Ɖ'].addShapeBox(-86.0F, -67.0F, -19.0F, 11, 5, 36, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1693 */     this.gunModel['Ɖ'].setRotationPoint(-168.0F, -70.0F, 0.0F);
/*      */     
/* 1695 */     this.gunModel['Ɗ'].addShapeBox(-86.0F, -67.0F, -19.0F, 50, 5, 36, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1696 */     this.gunModel['Ɗ'].setRotationPoint(-218.0F, -70.0F, 0.0F);
/*      */     
/* 1698 */     this.gunModel['Ƌ'].addShapeBox(-86.0F, -67.0F, -19.0F, 50, 10, 36, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1699 */     this.gunModel['Ƌ'].setRotationPoint(-218.0F, -80.0F, 0.0F);
/*      */     
/* 1701 */     this.gunModel['ƌ'].addShapeBox(-86.0F, -67.0F, -19.0F, 50, 4, 24, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1702 */     this.gunModel['ƌ'].setRotationPoint(-218.0F, -84.0F, 6.0F);
/*      */     
/* 1704 */     this.gunModel['ƍ'].addShapeBox(-86.0F, -67.0F, -19.0F, 50, 2, 6, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1705 */     this.gunModel['ƍ'].setRotationPoint(-218.0F, -86.0F, 12.0F);
/*      */     
/* 1707 */     this.gunModel['Ǝ'].addShapeBox(-86.0F, -67.0F, -19.0F, 50, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1708 */     this.gunModel['Ǝ'].setRotationPoint(-218.0F, -86.0F, 18.0F);
/*      */     
/* 1710 */     this.gunModel['Ə'].addShapeBox(-86.0F, -67.0F, -19.0F, 65, 11, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1711 */     this.gunModel['Ə'].setRotationPoint(190.0F, -6.0F, 3.0F);
/*      */     
/* 1713 */     this.gunModel['Ɛ'].addShapeBox(-86.0F, -67.0F, -19.0F, 43, 11, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1714 */     this.gunModel['Ɛ'].setRotationPoint(213.0F, 10.0F, 3.0F);
/*      */     
/* 1716 */     this.gunModel['Ƒ'].addShapeBox(-86.0F, -67.0F, -19.0F, 21, 9, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F);
/* 1717 */     this.gunModel['Ƒ'].setRotationPoint(192.0F, 5.0F, 3.0F);
/*      */     
/* 1719 */     this.gunModel['ƒ'].addShapeBox(-86.0F, -67.0F, -19.0F, 7, 7, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 1720 */     this.gunModel['ƒ'].setRotationPoint(206.0F, 14.0F, 3.0F);
/*      */     
/* 1722 */     this.gunModel['Ɠ'].addShapeBox(-86.0F, -67.0F, -19.0F, 48, 5, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1723 */     this.gunModel['Ɠ'].setRotationPoint(213.0F, 5.0F, 3.0F);
/*      */     
/* 1725 */     this.gunModel['Ɣ'].addShapeBox(-86.0F, -67.0F, -19.0F, 39, 43, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F);
/* 1726 */     this.gunModel['Ɣ'].setRotationPoint(211.0F, 21.0F, 3.0F);
/*      */     
/* 1728 */     this.gunModel['ƕ'].addShapeBox(-86.0F, -67.0F, -19.0F, 33, 18, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1729 */     this.gunModel['ƕ'].setRotationPoint(202.0F, 64.0F, 3.0F);
/*      */     
/* 1731 */     this.gunModel['Ɩ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 5, 30, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1732 */     this.gunModel['Ɩ'].setRotationPoint(235.0F, 65.0F, 3.0F);
/*      */     
/* 1734 */     this.gunModel['Ɨ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 5, 30, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1735 */     this.gunModel['Ɨ'].setRotationPoint(239.0F, 70.0F, 3.0F);
/*      */     
/* 1737 */     this.gunModel['Ƙ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 12, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1738 */     this.gunModel['Ƙ'].setRotationPoint(235.0F, 70.0F, 3.0F);
/*      */     
/* 1740 */     this.gunModel['ƙ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 5, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1741 */     this.gunModel['ƙ'].setRotationPoint(239.0F, 75.0F, 3.0F);
/*      */     
/* 1743 */     this.gunModel['ƚ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 14, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 2.0F, -4.0F, 0.0F);
/* 1744 */     this.gunModel['ƚ'].setRotationPoint(198.0F, 64.0F, 3.0F);
/*      */     
/* 1746 */     this.gunModel['ƛ'].addShapeBox(-86.0F, -67.0F, -19.0F, 9, 9, 21, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1747 */     this.gunModel['ƛ'].setRotationPoint(192.5F, 51.0F, 8.0F);
/*      */     
/* 1749 */     this.gunModel['Ɯ'].addShapeBox(-86.0F, -67.0F, -19.0F, 50, 5, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1750 */     this.gunModel['Ɯ'].setRotationPoint(149.5F, 60.0F, 8.0F);
/*      */     
/* 1752 */     this.gunModel['Ɲ'].addShapeBox(-86.0F, -67.0F, -19.0F, 52, 14, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F);
/* 1753 */     this.gunModel['Ɲ'].setRotationPoint(149.5F, 65.0F, 8.0F);
/*      */     
/* 1755 */     this.gunModel['ƞ'].addShapeBox(-86.0F, -67.0F, -19.0F, 42, 9, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1756 */     this.gunModel['ƞ'].setRotationPoint(149.5F, 51.0F, 8.0F);
/*      */     
/* 1758 */     this.gunModel['Ɵ'].addShapeBox(-86.0F, -67.0F, -19.0F, 25, 10, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F);
/* 1759 */     this.gunModel['Ɵ'].setRotationPoint(124.5F, 55.0F, 8.0F);
/*      */     
/* 1761 */     this.gunModel['Ơ'].addShapeBox(-86.0F, -67.0F, -19.0F, 25, 7, 21, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1762 */     this.gunModel['Ơ'].setRotationPoint(124.5F, 48.0F, 8.0F);
/*      */     
/* 1764 */     this.gunModel['ơ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 24, 21, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 1765 */     this.gunModel['ơ'].setRotationPoint(114.5F, 37.0F, 8.0F);
/*      */     
/* 1767 */     this.gunModel['Ƣ'].addShapeBox(-86.0F, -67.0F, -19.0F, 9, 29, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1768 */     this.gunModel['Ƣ'].setRotationPoint(105.5F, 35.0F, 8.0F);
/*      */     
/* 1770 */     this.gunModel['ƣ'].addShapeBox(-86.0F, -67.0F, -19.0F, 9, 17, 21, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1771 */     this.gunModel['ƣ'].setRotationPoint(105.5F, 18.0F, 8.0F);
/*      */     
/* 1773 */     this.gunModel['Ƥ'].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 5, 21, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1774 */     this.gunModel['Ƥ'].setRotationPoint(105.5F, 64.0F, 8.0F);
/*      */     
/* 1776 */     this.gunModel['ƥ'].addShapeBox(-86.0F, -67.0F, -19.0F, 52, 95, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1777 */     this.gunModel['ƥ'].setRotationPoint(61.0F, 18.0F, 3.0F);
/*      */     
/* 1779 */     this.gunModel['Ʀ'].addShapeBox(-86.0F, -67.0F, -19.0F, 18, 10, 30, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F);
/* 1780 */     this.gunModel['Ʀ'].setRotationPoint(43.0F, 18.0F, 3.0F);
/*      */     
/* 1782 */     this.gunModel['Ƨ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 12, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 1783 */     this.gunModel['Ƨ'].setRotationPoint(57.0F, 28.0F, 3.0F);
/*      */     
/* 1785 */     this.gunModel['ƨ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 20, 30, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1786 */     this.gunModel['ƨ'].setRotationPoint(55.0F, 43.0F, 3.0F);
/*      */     
/* 1788 */     this.gunModel['Ʃ'].addShapeBox(-86.0F, -67.0F, -19.0F, 14, 59, 30, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1789 */     this.gunModel['Ʃ'].setRotationPoint(47.0F, 63.0F, 3.0F);
/*      */     
/* 1791 */     this.gunModel['ƪ'].addShapeBox(-86.0F, -67.0F, -19.0F, 37, 3, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1792 */     this.gunModel['ƪ'].setRotationPoint(61.0F, 113.0F, 3.0F);
/*      */     
/* 1794 */     this.gunModel['ƫ'].addShapeBox(-86.0F, -67.0F, -19.0F, 39, 2, 30, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1795 */     this.gunModel['ƫ'].setRotationPoint(61.0F, 116.0F, 3.0F);
/*      */     
/* 1797 */     this.gunModel['Ƭ'].addShapeBox(-86.0F, -67.0F, -19.0F, 39, 2, 30, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1798 */     this.gunModel['Ƭ'].setRotationPoint(61.0F, 120.0F, 3.0F);
/*      */     
/* 1800 */     this.gunModel['ƭ'].addShapeBox(-86.0F, -67.0F, -19.0F, 39, 2, 30, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1801 */     this.gunModel['ƭ'].setRotationPoint(61.0F, 118.0F, 3.0F);
/*      */     
/* 1803 */     this.gunModel['Ʈ'].addShapeBox(-86.0F, -67.0F, -19.0F, 54, 9, 30, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, -7.5F, -6.0F, 0.0F, -7.5F, -6.0F, 0.0F, 0.0F, -9.0F, 0.0F);
/* 1804 */     this.gunModel['Ʈ'].setRotationPoint(44.0F, 122.0F, 3.0F);
/*      */     
/* 1806 */     this.gunModel['Ư'].addShapeBox(-86.0F, -67.0F, -19.0F, 33, 12, 33, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1807 */     this.gunModel['Ư'].setRotationPoint(-26.0F, -56.0F, 0.0F);
/*      */     
/* 1809 */     this.gunModel['ư'].addShapeBox(-86.0F, -67.0F, -19.0F, 33, 24, 42, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1810 */     this.gunModel['ư'].setRotationPoint(-26.0F, -44.0F, -3.0F);
/*      */     
/* 1812 */     this.gunModel['Ʊ'].addShapeBox(-86.0F, -67.0F, -19.0F, 54, 24, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1813 */     this.gunModel['Ʊ'].setRotationPoint(-80.0F, -44.0F, 24.0F);
/*      */     
/* 1815 */     this.gunModel['Ʋ'].addShapeBox(-86.0F, -67.0F, -19.0F, 54, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1816 */     this.gunModel['Ʋ'].setRotationPoint(-80.0F, -56.0F, 24.0F);
/*      */     
/* 1818 */     this.gunModel['Ƴ'].addShapeBox(-86.0F, -67.0F, -19.0F, 54, 20, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1819 */     this.gunModel['Ƴ'].setRotationPoint(-80.0F, -40.0F, -3.0F);
/*      */     
/* 1821 */     this.gunModel['ƴ'].addBox(-86.0F, -67.0F, -19.0F, 33, 9, 36, 0.0F);
/* 1822 */     this.gunModel['ƴ'].setRotationPoint(-26.0F, -65.0F, 0.0F);
/*      */     
/* 1824 */     this.gunModel['Ƶ'].addShapeBox(-86.0F, -67.0F, -19.0F, 54, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1825 */     this.gunModel['Ƶ'].setRotationPoint(-80.0F, -65.0F, 24.0F);
/*      */     
/* 1827 */     this.gunModel['ƶ'].addBox(-86.0F, -67.0F, -19.0F, 54, 4, 36, 0.0F);
/* 1828 */     this.gunModel['ƶ'].setRotationPoint(-80.0F, -65.0F, 0.0F);
/*      */     
/* 1830 */     this.gunModel['Ʒ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1831 */     this.gunModel['Ʒ'].setRotationPoint(-82.0F, -44.0F, -4.0F);
/*      */     
/* 1833 */     this.gunModel['Ƹ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1834 */     this.gunModel['Ƹ'].setRotationPoint(-82.0F, -56.0F, -1.0F);
/*      */     
/* 1836 */     this.gunModel['ƹ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1837 */     this.gunModel['ƹ'].setRotationPoint(-82.0F, -63.0F, -1.0F);
/*      */     
/* 1839 */     this.gunModel['ƺ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1840 */     this.gunModel['ƺ'].setRotationPoint(-26.0F, -44.0F, -4.0F);
/*      */     
/* 1842 */     this.gunModel['ƻ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1843 */     this.gunModel['ƻ'].setRotationPoint(-26.0F, -56.0F, -1.0F);
/*      */     
/* 1845 */     this.gunModel['Ƽ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1846 */     this.gunModel['Ƽ'].setRotationPoint(-26.0F, -63.0F, -1.0F);
/*      */     
/* 1848 */     this.gunModel['ƽ'].addShapeBox(-86.0F, -67.0F, -19.0F, 54, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1849 */     this.gunModel['ƽ'].setRotationPoint(-80.0F, -63.0F, -1.0F);
/*      */     
/* 1851 */     this.gunModel['ƾ'].addShapeBox(-86.0F, -67.0F, -19.0F, 10, 13, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 1852 */     this.gunModel['ƾ'].setRotationPoint(135.5F, 13.0F, 13.0F);
/*      */     
/* 1854 */     this.gunModel['ƿ'].addShapeBox(-86.0F, -67.0F, -19.0F, 6, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 1855 */     this.gunModel['ƿ'].setRotationPoint(139.5F, 26.0F, 13.0F);
/*      */     
/* 1857 */     this.gunModel['ǀ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 1858 */     this.gunModel['ǀ'].setRotationPoint(143.5F, 34.0F, 13.0F);
/*      */     
/* 1860 */     this.gunModel['ǁ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1861 */     this.gunModel['ǁ'].setRotationPoint(145.5F, 13.0F, 13.0F);
/*      */     
/* 1863 */     this.gunModel['ǂ'].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1864 */     this.gunModel['ǂ'].setRotationPoint(145.5F, 22.0F, 13.0F);
/*      */     
/* 1866 */     this.gunModel['ǃ'].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1867 */     this.gunModel['ǃ'].setRotationPoint(145.5F, 24.0F, 13.0F);
/*      */     
/* 1869 */     this.gunModel['Ǆ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1870 */     this.gunModel['Ǆ'].setRotationPoint(145.5F, 29.0F, 13.0F);
/*      */     
/* 1872 */     this.gunModel['ǅ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1873 */     this.gunModel['ǅ'].setRotationPoint(147.5F, 36.0F, 13.0F);
/*      */     
/* 1875 */     this.gunModel['ǆ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1876 */     this.gunModel['ǆ'].setRotationPoint(145.5F, 33.0F, 13.0F);
/*      */     
/* 1878 */     this.gunModel['Ǉ'].addShapeBox(-86.0F, -67.0F, -19.0F, 3, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1879 */     this.gunModel['Ǉ'].setRotationPoint(148.0F, 33.0F, 13.0F);
/*      */     
/* 1881 */     this.gunModel['ǈ'].addShapeBox(-86.0F, -67.0F, -19.0F, 1, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1882 */     this.gunModel['ǈ'].setRotationPoint(147.5F, 34.0F, 13.0F);
/*      */     
/* 1884 */     this.gunModel['ǉ'].addShapeBox(-86.0F, -67.0F, -19.0F, 2, 23, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1885 */     this.gunModel['ǉ'].setRotationPoint(120.0F, -5.0F, 33.0F);
/*      */     
/* 1887 */     this.gunModel['Ǌ'].addBox(-86.0F, -67.0F, -19.0F, 260, 9, 3, 0.0F);
/* 1888 */     this.gunModel['Ǌ'].setRotationPoint(7.0F, -68.0F, 27.0F);
/*      */     
/* 1890 */     this.gunModel['ǋ'].addBox(-86.0F, -67.0F, -19.0F, 52, 9, 18, 0.0F);
/* 1891 */     this.gunModel['ǋ'].setRotationPoint(23.0F, -68.0F, 9.0F);
/*      */     
/* 1893 */     this.gunModel['ǌ'].addBox(-86.0F, -67.0F, -19.0F, 140, 3, 18, 0.0F);
/* 1894 */     this.gunModel['ǌ'].setRotationPoint(70.0F, -62.0F, 9.0F);
/*      */     
/* 1896 */     this.gunModel['Ǎ'].addBox(-86.0F, -67.0F, -19.0F, 53, 9, 18, 0.0F);
/* 1897 */     this.gunModel['Ǎ'].setRotationPoint(200.0F, -68.0F, 9.0F);
/*      */     
/* 1899 */     this.gunModel['ǎ'].addShapeBox(-86.0F, -67.0F, -19.0F, 21, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1900 */     this.gunModel['ǎ'].setRotationPoint(235.0F, -74.0F, 4.0F);
/*      */     
/* 1902 */     this.gunModel['Ǐ'].addShapeBox(-86.0F, -67.0F, -19.0F, 21, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1903 */     this.gunModel['Ǐ'].setRotationPoint(235.0F, -74.0F, 30.0F);
/*      */     
/* 1905 */     this.gunModel['ǐ'].addShapeBox(-86.0F, -67.0F, -19.0F, 7, 21, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1906 */     this.gunModel['ǐ'].setRotationPoint(-154.5F, -16.0F, 32.0F);
/*      */     
/* 1908 */     this.gunModel['Ǒ'].addShapeBox(-86.0F, -67.0F, -19.0F, 7, 7, 3, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F);
/* 1909 */     this.gunModel['Ǒ'].setRotationPoint(-147.5F, -9.0F, 32.0F);
/*      */     
/* 1911 */     this.gunModel['ǒ'].addShapeBox(-86.0F, -67.0F, -19.0F, 7, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1912 */     this.gunModel['ǒ'].setRotationPoint(-161.5F, -9.0F, 32.0F);
/*      */     
/* 1914 */     this.gunModel['Ǔ'].addShapeBox(-86.0F, -67.0F, -19.0F, 17, 5, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F);
/* 1915 */     this.gunModel['Ǔ'].setRotationPoint(-157.5F, -8.0F, 35.0F);
/*      */     
/* 1917 */     this.gunModel['ǔ'].addShapeBox(-86.0F, -67.0F, -19.0F, 7, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1918 */     this.gunModel['ǔ'].setRotationPoint(23.0F, -74.0F, 37.0F);
/*      */     
/* 1920 */     this.gunModel['Ǖ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1921 */     this.gunModel['Ǖ'].setRotationPoint(23.0F, -80.0F, 37.0F);
/*      */     
/* 1923 */     this.gunModel['ǖ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 40, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1924 */     this.gunModel['ǖ'].setRotationPoint(23.0F, -120.0F, 37.0F);
/*      */     
/* 1926 */     this.gunModel['Ǘ'].addShapeBox(-86.0F, -67.0F, -19.0F, 7, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1927 */     this.gunModel['Ǘ'].setRotationPoint(23.0F, -74.0F, -5.0F);
/*      */     
/* 1929 */     this.gunModel['ǘ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1930 */     this.gunModel['ǘ'].setRotationPoint(23.0F, -80.0F, -5.0F);
/*      */     
/* 1932 */     this.gunModel['Ǚ'].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 40, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1933 */     this.gunModel['Ǚ'].setRotationPoint(23.0F, -120.0F, -5.0F);
/*      */     
/* 1935 */     this.gunModel['ǚ'].addShapeBox(-86.0F, -67.0F, -19.0F, 15, 20, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1936 */     this.gunModel['ǚ'].setRotationPoint(-112.0F, 18.0F, 8.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 1941 */     this.ammoModel[0] = new ModelRendererTurbo(this, 2577, 289, this.textureX, this.textureY);
/* 1942 */     this.ammoModel[1] = new ModelRendererTurbo(this, 3137, 289, this.textureX, this.textureY);
/* 1943 */     this.ammoModel[2] = new ModelRendererTurbo(this, 417, 297, this.textureX, this.textureY);
/* 1944 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1705, 297, this.textureX, this.textureY);
/* 1945 */     this.ammoModel[4] = new ModelRendererTurbo(this, 1841, 297, this.textureX, this.textureY);
/* 1946 */     this.ammoModel[5] = new ModelRendererTurbo(this, 1977, 297, this.textureX, this.textureY);
/* 1947 */     this.ammoModel[6] = new ModelRendererTurbo(this, 833, 281, this.textureX, this.textureY);
/* 1948 */     this.ammoModel[7] = new ModelRendererTurbo(this, 2873, 297, this.textureX, this.textureY);
/* 1949 */     this.ammoModel[8] = new ModelRendererTurbo(this, 3993, 273, this.textureX, this.textureY);
/* 1950 */     this.ammoModel[9] = new ModelRendererTurbo(this, 233, 305, this.textureX, this.textureY);
/* 1951 */     this.ammoModel[10] = new ModelRendererTurbo(this, 3505, 305, this.textureX, this.textureY);
/* 1952 */     this.ammoModel[11] = new ModelRendererTurbo(this, 1337, 305, this.textureX, this.textureY);
/* 1953 */     this.ammoModel[12] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/*      */     
/* 1955 */     this.ammoModel[0].addShapeBox(-86.0F, -67.0F, -19.0F, 44, 26, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1956 */     this.ammoModel[0].setRotationPoint(-96.0F, 22.0F, 1.0F);
/*      */     
/* 1958 */     this.ammoModel[1].addShapeBox(-86.0F, -67.0F, -19.0F, 32, 26, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1959 */     this.ammoModel[1].setRotationPoint(-52.0F, 22.0F, 1.0F);
/*      */     
/* 1961 */     this.ammoModel[2].addShapeBox(-86.0F, -67.0F, -19.0F, 41, 26, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1962 */     this.ammoModel[2].setRotationPoint(-93.0F, 48.0F, 1.0F);
/*      */     
/* 1964 */     this.ammoModel[3].addShapeBox(-86.0F, -67.0F, -19.0F, 34, 26, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1965 */     this.ammoModel[3].setRotationPoint(-52.0F, 48.0F, 1.0F);
/*      */     
/* 1967 */     this.ammoModel[4].addShapeBox(-86.0F, -67.0F, -19.0F, 35, 31, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F);
/* 1968 */     this.ammoModel[4].setRotationPoint(-87.0F, 74.0F, 1.0F);
/*      */     
/* 1970 */     this.ammoModel[5].addShapeBox(-86.0F, -67.0F, -19.0F, 39, 26, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1971 */     this.ammoModel[5].setRotationPoint(-52.0F, 74.0F, 1.0F);
/*      */     
/* 1973 */     this.ammoModel[6].addShapeBox(-86.0F, -67.0F, -19.0F, 24, 26, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F);
/* 1974 */     this.ammoModel[6].setRotationPoint(-76.0F, 105.0F, 1.0F);
/*      */     
/* 1976 */     this.ammoModel[7].addShapeBox(-86.0F, -67.0F, -19.0F, 47, 26, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1977 */     this.ammoModel[7].setRotationPoint(-52.0F, 100.0F, 1.0F);
/*      */     
/* 1979 */     this.ammoModel[8].addShapeBox(-86.0F, -67.0F, -19.0F, 13, 19, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F);
/* 1980 */     this.ammoModel[8].setRotationPoint(-65.0F, 131.0F, 1.0F);
/*      */     
/* 1982 */     this.ammoModel[9].addShapeBox(-86.0F, -67.0F, -19.0F, 59, 14, 32, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1983 */     this.ammoModel[9].setRotationPoint(-52.0F, 126.0F, 1.0F);
/*      */     
/* 1985 */     this.ammoModel[10].addShapeBox(-86.0F, -67.0F, -19.0F, 71, 10, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1986 */     this.ammoModel[10].setRotationPoint(-52.0F, 140.0F, 1.0F);
/*      */     
/* 1988 */     this.ammoModel[11].addShapeBox(-86.0F, -67.0F, -19.0F, 57, 36, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -36.0F, 0.0F, 0.0F, -36.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1989 */     this.ammoModel[11].setRotationPoint(-24.0F, 150.0F, 1.0F);
/*      */     
/* 1991 */     this.ammoModel[12].addShapeBox(-86.0F, -67.0F, -19.0F, 30, 36, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, 0.0F);
/* 1992 */     this.ammoModel[12].setRotationPoint(-54.0F, 150.0F, 1.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 1997 */     this.slideModel[0] = new ModelRendererTurbo(this, 3937, 137, this.textureX, this.textureY);
/* 1998 */     this.slideModel[1] = new ModelRendererTurbo(this, 497, 145, this.textureX, this.textureY);
/* 1999 */     this.slideModel[2] = new ModelRendererTurbo(this, 3593, 113, this.textureX, this.textureY);
/* 2000 */     this.slideModel[3] = new ModelRendererTurbo(this, 1985, 121, this.textureX, this.textureY);
/* 2001 */     this.slideModel[4] = new ModelRendererTurbo(this, 3713, 113, this.textureX, this.textureY);
/* 2002 */     this.slideModel[5] = new ModelRendererTurbo(this, 4017, 137, this.textureX, this.textureY);
/* 2003 */     this.slideModel[6] = new ModelRendererTurbo(this, 577, 145, this.textureX, this.textureY);
/* 2004 */     this.slideModel[7] = new ModelRendererTurbo(this, 625, 145, this.textureX, this.textureY);
/* 2005 */     this.slideModel[8] = new ModelRendererTurbo(this, 673, 145, this.textureX, this.textureY);
/* 2006 */     this.slideModel[9] = new ModelRendererTurbo(this, 2273, 145, this.textureX, this.textureY);
/* 2007 */     this.slideModel[10] = new ModelRendererTurbo(this, 705, 273, this.textureX, this.textureY);
/* 2008 */     this.slideModel[11] = new ModelRendererTurbo(this, 2729, 273, this.textureX, this.textureY);
/* 2009 */     this.slideModel[12] = new ModelRendererTurbo(this, 3353, 273, this.textureX, this.textureY);
/*      */     
/* 2011 */     this.slideModel[0].addShapeBox(-86.0F, -67.0F, -19.0F, 18, 13, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2012 */     this.slideModel[0].setRotationPoint(175.0F, -77.0F, 9.0F);
/*      */     
/* 2014 */     this.slideModel[1].addShapeBox(-86.0F, -67.0F, -19.0F, 18, 10, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2015 */     this.slideModel[1].setRotationPoint(175.0F, -87.0F, 9.0F);
/*      */     
/* 2017 */     this.slideModel[2].addShapeBox(-86.0F, -67.0F, -19.0F, 18, 4, 18, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2018 */     this.slideModel[2].setRotationPoint(175.0F, -91.0F, 9.0F);
/*      */     
/* 2020 */     this.slideModel[3].addShapeBox(-86.0F, -67.0F, -19.0F, 16, 2, 18, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2021 */     this.slideModel[3].setRotationPoint(177.0F, -93.0F, 9.0F);
/*      */     
/* 2023 */     this.slideModel[4].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2024 */     this.slideModel[4].setRotationPoint(193.0F, -92.5F, 9.0F);
/*      */     
/* 2026 */     this.slideModel[5].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2027 */     this.slideModel[5].setRotationPoint(193.0F, -90.5F, 9.0F);
/*      */     
/* 2029 */     this.slideModel[6].addShapeBox(-86.0F, -67.0F, -19.0F, 4, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2030 */     this.slideModel[6].setRotationPoint(193.0F, -88.5F, 9.0F);
/*      */     
/* 2032 */     this.slideModel[7].addShapeBox(-86.0F, -67.0F, -19.0F, 5, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2033 */     this.slideModel[7].setRotationPoint(193.0F, -84.5F, 9.0F);
/*      */     
/* 2035 */     this.slideModel[8].addShapeBox(-86.0F, -67.0F, -19.0F, 9, 6, 18, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2036 */     this.slideModel[8].setRotationPoint(193.0F, -78.5F, 9.0F);
/*      */     
/* 2038 */     this.slideModel[9].addShapeBox(-86.0F, -67.0F, -19.0F, 9, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2039 */     this.slideModel[9].setRotationPoint(193.0F, -72.5F, 9.0F);
/*      */     
/* 2041 */     this.slideModel[10].addShapeBox(-86.0F, -67.0F, -19.0F, 52, 4, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2042 */     this.slideModel[10].setRotationPoint(-80.0F, -44.0F, -3.0F);
/*      */     
/* 2044 */     this.slideModel[11].addShapeBox(-86.0F, -67.0F, -19.0F, 52, 12, 31, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2045 */     this.slideModel[11].setRotationPoint(-80.0F, -56.0F, 0.0F);
/*      */     
/* 2047 */     this.slideModel[12].addBox(-86.0F, -67.0F, -19.0F, 52, 5, 34, 0.0F);
/* 2048 */     this.slideModel[12].setRotationPoint(-80.0F, -61.0F, 0.0F);
/*      */     
/* 2050 */     translateAll(-0.5F, -35.0F, 0.0F);
/* 2051 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.01F, 0.0F);
/*      */     
/* 2053 */     this.gunSlideDistance = 5.0F;
/* 2054 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 2056 */     this.tiltGun = 5.0F;
/* 2057 */     this.rotateGunVertical = 40.0F;
/* 2058 */     this.rotateGunHorizontal = 0.0F;
/* 2059 */     this.translateGun = new Vector3f(0.5F, 0.0F, 0.0F);
/*      */     
/* 2061 */     this.rotateClipVertical = 5.0F;
/* 2062 */     this.translateClip = new Vector3f(-5.0F, -22.0F, 0.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelqbz95.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */