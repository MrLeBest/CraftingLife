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
/*      */ public class Modelstiker
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelstiker()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ø'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 601, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 801, 17, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 601, 17, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 937, 17, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 601, 33, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 649, 65, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 737, 73, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 833, 73, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 929, 73, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 601, 49, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 937, 49, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 793, 17, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 817, 17, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 697, 9, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 697, 25, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 793, 33, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 817, 33, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 681, 41, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 577, 81, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 673, 89, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 305, 81, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 809, 41, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 833, 41, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 833, 33, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 809, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 833, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 689, 33, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 697, 41, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 745, 89, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 921, 89, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 809, 89, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 977, 89, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 1001, 89, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 617, 97, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 577, 97, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 825, 97, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 865, 97, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 41, 105, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 273, 105, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 433, 105, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 665, 105, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 705, 105, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 745, 105, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 785, 105, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 905, 105, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 945, 105, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 297, 121, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 553, 121, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 233, 113, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 353, 129, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 625, 129, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 689, 129, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 809, 129, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 873, 129, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 737, 137, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 145, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 945, 129, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 145, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 1009, 49, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 681, 9, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 145, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 153, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 849, 97, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 153, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 801, 89, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 521, 153, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 889, 97, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 609, 153, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 697, 153, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 153, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 161, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 161, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 753, 161, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 161, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 169, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 169, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 169, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 553, 169, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 913, 169, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 977, 169, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 33, 185, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 281, 177, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 329, 177, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 601, 177, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 649, 177, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 697, 177, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 729, 185, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 377, 193, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 241, 201, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 457, 201, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 905, 193, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 953, 193, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 657, 201, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 185, 209, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 233, 209, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 281, 209, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 345, 217, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 689, 209, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 985, 129, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 65, 105, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 689, 105, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 729, 105, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 769, 105, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 929, 105, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 969, 105, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 537, 121, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 769, 121, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 929, 121, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 721, 209, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 785, 209, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 849, 209, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 593, 217, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 897, 217, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 57, 129, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 953, 217, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 721, 225, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 777, 225, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 673, 129, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 857, 129, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 937, 57, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 361, 153, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 377, 65, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 329, 145, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1001, 145, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 313, 177, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 985, 193, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 737, 65, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1009, 161, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 1017, 65, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 633, 177, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 137, 233, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 681, 177, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 681, 153, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 657, 225, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 33, 169, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 937, 193, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 409, 169, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 761, 65, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 273, 233, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 473, 169, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 809, 225, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 289, 233, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 321, 233, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 345, 233, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 377, 233, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 577, 73, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 105, 177, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 665, 81, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 345, 209, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 417, 233, this.textureX, this.textureY);
/*      */     
/*  271 */     this.gunModel[0].addBox(26.0F, -1.0F, 2.0F, 40, 4, 48, 0.0F);
/*  272 */     this.gunModel[0].setRotationPoint(-3.0F, -38.0F, -25.0F);
/*      */     
/*  274 */     this.gunModel[1].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 7, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  275 */     this.gunModel[1].setRotationPoint(-1.0F, -46.0F, -25.0F);
/*      */     
/*  277 */     this.gunModel[2].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  278 */     this.gunModel[2].setRotationPoint(-1.0F, -40.0F, -28.0F);
/*      */     
/*  280 */     this.gunModel[3].addShapeBox(26.0F, -1.0F, 2.0F, 40, 8, 54, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  281 */     this.gunModel[3].setRotationPoint(-3.0F, -34.0F, -28.0F);
/*      */     
/*  283 */     this.gunModel[4].addShapeBox(26.0F, -1.0F, 2.0F, 38, 8, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  284 */     this.gunModel[4].setRotationPoint(-1.0F, -34.0F, -30.0F);
/*      */     
/*  286 */     this.gunModel[5].addShapeBox(26.0F, -1.0F, 2.0F, 40, 6, 58, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  287 */     this.gunModel[5].setRotationPoint(-3.0F, -26.0F, -30.0F);
/*      */     
/*  289 */     this.gunModel[6].addShapeBox(26.0F, -1.0F, 2.0F, 40, 8, 54, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  290 */     this.gunModel[6].setRotationPoint(-3.0F, -20.0F, -28.0F);
/*      */     
/*  292 */     this.gunModel[7].addShapeBox(26.0F, -1.0F, 2.0F, 38, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  293 */     this.gunModel[7].setRotationPoint(-1.0F, -20.0F, -30.0F);
/*      */     
/*  295 */     this.gunModel[8].addBox(26.0F, -1.0F, 2.0F, 40, 6, 48, 0.0F);
/*  296 */     this.gunModel[8].setRotationPoint(-3.0F, -12.0F, -25.0F);
/*      */     
/*  298 */     this.gunModel[9].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  299 */     this.gunModel[9].setRotationPoint(-1.0F, -12.0F, -28.0F);
/*      */     
/*  301 */     this.gunModel[10].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  302 */     this.gunModel[10].setRotationPoint(-1.0F, -6.0F, -25.0F);
/*      */     
/*  304 */     this.gunModel[11].addShapeBox(26.0F, -1.0F, 2.0F, 38, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  305 */     this.gunModel[11].setRotationPoint(-1.0F, 0.0F, -19.0F);
/*      */     
/*  307 */     this.gunModel[12].addShapeBox(26.0F, -1.0F, 2.0F, 38, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  308 */     this.gunModel[12].setRotationPoint(-1.0F, 3.0F, -13.0F);
/*      */     
/*  310 */     this.gunModel[13].addShapeBox(26.0F, -1.0F, 2.0F, 40, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  311 */     this.gunModel[13].setRotationPoint(-3.0F, 3.0F, -5.0F);
/*      */     
/*  313 */     this.gunModel[14].addShapeBox(26.0F, -1.0F, 2.0F, 37, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  314 */     this.gunModel[14].setRotationPoint(0.0F, 3.0F, 3.0F);
/*      */     
/*  316 */     this.gunModel[15].addShapeBox(26.0F, -1.0F, 2.0F, 38, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  317 */     this.gunModel[15].setRotationPoint(-1.0F, 0.0F, 11.0F);
/*      */     
/*  319 */     this.gunModel[16].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  320 */     this.gunModel[16].setRotationPoint(-1.0F, -6.0F, 17.0F);
/*      */     
/*  322 */     this.gunModel[17].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  323 */     this.gunModel[17].setRotationPoint(-1.0F, -12.0F, 23.0F);
/*      */     
/*  325 */     this.gunModel[18].addShapeBox(26.0F, -1.0F, 2.0F, 38, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  326 */     this.gunModel[18].setRotationPoint(-1.0F, -20.0F, 26.0F);
/*      */     
/*  328 */     this.gunModel[19].addShapeBox(26.0F, -1.0F, 2.0F, 38, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  329 */     this.gunModel[19].setRotationPoint(-1.0F, -34.0F, 26.0F);
/*      */     
/*  331 */     this.gunModel[20].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  332 */     this.gunModel[20].setRotationPoint(-1.0F, -40.0F, 23.0F);
/*      */     
/*  334 */     this.gunModel[21].addShapeBox(26.0F, -1.0F, 2.0F, 38, 2, 8, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  335 */     this.gunModel[21].setRotationPoint(-1.0F, -51.0F, -13.0F);
/*      */     
/*  337 */     this.gunModel[22].addShapeBox(26.0F, -1.0F, 2.0F, 40, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  338 */     this.gunModel[22].setRotationPoint(-3.0F, -51.0F, -5.0F);
/*      */     
/*  340 */     this.gunModel[23].addShapeBox(26.0F, -1.0F, 2.0F, 38, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  341 */     this.gunModel[23].setRotationPoint(-1.0F, -51.0F, 3.0F);
/*      */     
/*  343 */     this.gunModel[24].addShapeBox(26.0F, -1.0F, 2.0F, 38, 3, 6, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  344 */     this.gunModel[24].setRotationPoint(-1.0F, -49.0F, -19.0F);
/*      */     
/*  346 */     this.gunModel[25].addShapeBox(26.0F, -1.0F, 2.0F, 38, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  347 */     this.gunModel[25].setRotationPoint(-1.0F, -49.0F, 11.0F);
/*      */     
/*  349 */     this.gunModel[26].addShapeBox(26.0F, -1.0F, 2.0F, 40, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  350 */     this.gunModel[26].setRotationPoint(-3.0F, -49.0F, -13.0F);
/*      */     
/*  352 */     this.gunModel[27].addShapeBox(26.0F, -1.0F, 2.0F, 40, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  353 */     this.gunModel[27].setRotationPoint(-3.0F, 0.0F, -13.0F);
/*      */     
/*  355 */     this.gunModel[28].addShapeBox(26.0F, -1.0F, 2.0F, 40, 6, 36, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  356 */     this.gunModel[28].setRotationPoint(-3.0F, -6.0F, -19.0F);
/*      */     
/*  358 */     this.gunModel[29].addShapeBox(26.0F, -1.0F, 2.0F, 38, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  359 */     this.gunModel[29].setRotationPoint(-1.0F, -46.0F, 16.0F);
/*      */     
/*  361 */     this.gunModel[30].addShapeBox(26.0F, -1.0F, 2.0F, 39, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  362 */     this.gunModel[30].setRotationPoint(-2.0F, -46.0F, -18.0F);
/*      */     
/*  364 */     this.gunModel[31].addBox(26.0F, -1.0F, 2.0F, 40, 2, 7, 0.0F);
/*  365 */     this.gunModel[31].setRotationPoint(-3.0F, -40.0F, -25.0F);
/*      */     
/*  367 */     this.gunModel[32].addBox(26.0F, -1.0F, 2.0F, 40, 8, 26, 0.0F);
/*  368 */     this.gunModel[32].setRotationPoint(-3.0F, -46.0F, -10.0F);
/*      */     
/*  370 */     this.gunModel[33].addBox(26.0F, -1.0F, 2.0F, 40, 2, 7, 0.0F);
/*  371 */     this.gunModel[33].setRotationPoint(-3.0F, -40.0F, 16.0F);
/*      */     
/*  373 */     this.gunModel[34].addShapeBox(26.0F, -1.0F, 2.0F, 36, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  374 */     this.gunModel[34].setRotationPoint(-3.0F, -39.0F, -18.0F);
/*      */     
/*  376 */     this.gunModel[35].addShapeBox(26.0F, -1.0F, 2.0F, 36, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  377 */     this.gunModel[35].setRotationPoint(-3.0F, -39.0F, -11.5F);
/*      */     
/*  379 */     this.gunModel[36].addShapeBox(26.0F, -1.0F, 2.0F, 36, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  380 */     this.gunModel[36].setRotationPoint(-3.0F, -45.5F, -11.5F);
/*      */     
/*  382 */     this.gunModel[37].addShapeBox(26.0F, -1.0F, 2.0F, 36, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  383 */     this.gunModel[37].setRotationPoint(-3.0F, -45.5F, -18.0F);
/*      */     
/*  385 */     this.gunModel[38].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  386 */     this.gunModel[38].setRotationPoint(-3.0F, -12.0F, -28.0F);
/*      */     
/*  388 */     this.gunModel[39].addShapeBox(26.0F, -1.0F, 2.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  389 */     this.gunModel[39].setRotationPoint(-3.0F, -20.0F, -30.0F);
/*      */     
/*  391 */     this.gunModel[40].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  392 */     this.gunModel[40].setRotationPoint(-3.0F, -26.0F, -31.0F);
/*      */     
/*  394 */     this.gunModel[41].addShapeBox(26.0F, -1.0F, 2.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  395 */     this.gunModel[41].setRotationPoint(-3.0F, -34.0F, -30.0F);
/*      */     
/*  397 */     this.gunModel[42].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  398 */     this.gunModel[42].setRotationPoint(-3.0F, -40.0F, -28.0F);
/*      */     
/*  400 */     this.gunModel[43].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 7, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  401 */     this.gunModel[43].setRotationPoint(-3.0F, -46.0F, -25.0F);
/*      */     
/*  403 */     this.gunModel[44].addShapeBox(26.0F, -1.0F, 2.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  404 */     this.gunModel[44].setRotationPoint(-3.0F, -49.0F, -19.0F);
/*      */     
/*  406 */     this.gunModel[45].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 8, 0.0F, 0.0F, 1.0F, -8.0F, 0.0F, 1.0F, -8.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  407 */     this.gunModel[45].setRotationPoint(-3.0F, -51.0F, -13.0F);
/*      */     
/*  409 */     this.gunModel[46].addShapeBox(26.0F, -1.0F, 2.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  410 */     this.gunModel[46].setRotationPoint(-3.0F, -52.0F, -5.0F);
/*      */     
/*  412 */     this.gunModel[47].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 8, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -8.0F, 0.0F, 1.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  413 */     this.gunModel[47].setRotationPoint(-3.0F, -51.0F, 3.0F);
/*      */     
/*  415 */     this.gunModel[48].addShapeBox(26.0F, -1.0F, 2.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  416 */     this.gunModel[48].setRotationPoint(-3.0F, -49.0F, 11.0F);
/*      */     
/*  418 */     this.gunModel[49].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  419 */     this.gunModel[49].setRotationPoint(-3.0F, -46.0F, 16.0F);
/*      */     
/*  421 */     this.gunModel[50].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  422 */     this.gunModel[50].setRotationPoint(-3.0F, -40.0F, 23.0F);
/*      */     
/*  424 */     this.gunModel[51].addShapeBox(26.0F, -1.0F, 2.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  425 */     this.gunModel[51].setRotationPoint(-3.0F, -34.0F, 26.0F);
/*      */     
/*  427 */     this.gunModel[52].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  428 */     this.gunModel[52].setRotationPoint(-3.0F, -26.0F, 28.0F);
/*      */     
/*  430 */     this.gunModel[53].addShapeBox(26.0F, -1.0F, 2.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  431 */     this.gunModel[53].setRotationPoint(-3.0F, -20.0F, 26.0F);
/*      */     
/*  433 */     this.gunModel[54].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  434 */     this.gunModel[54].setRotationPoint(-3.0F, -12.0F, 23.0F);
/*      */     
/*  436 */     this.gunModel[55].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/*  437 */     this.gunModel[55].setRotationPoint(-3.0F, -6.0F, 17.0F);
/*      */     
/*  439 */     this.gunModel[56].addShapeBox(26.0F, -1.0F, 2.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/*  440 */     this.gunModel[56].setRotationPoint(-3.0F, 0.0F, 11.0F);
/*      */     
/*  442 */     this.gunModel[57].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F);
/*  443 */     this.gunModel[57].setRotationPoint(-3.0F, 3.0F, 3.0F);
/*      */     
/*  445 */     this.gunModel[58].addShapeBox(26.0F, -1.0F, 2.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  446 */     this.gunModel[58].setRotationPoint(-3.0F, 5.0F, -5.0F);
/*      */     
/*  448 */     this.gunModel[59].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -8.0F, 0.0F, 1.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  449 */     this.gunModel[59].setRotationPoint(-3.0F, 3.0F, -13.0F);
/*      */     
/*  451 */     this.gunModel[60].addShapeBox(26.0F, -1.0F, 2.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[60].setRotationPoint(-3.0F, 0.0F, -19.0F);
/*      */     
/*  454 */     this.gunModel[61].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  455 */     this.gunModel[61].setRotationPoint(-3.0F, -6.0F, -25.0F);
/*      */     
/*  457 */     this.gunModel[62].addShapeBox(26.0F, -1.0F, 2.0F, 36, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  458 */     this.gunModel[62].setRotationPoint(-3.0F, -46.0F, -18.0F);
/*      */     
/*  460 */     this.gunModel[63].addShapeBox(26.0F, -1.0F, 2.0F, 36, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/*  461 */     this.gunModel[63].setRotationPoint(-3.0F, -45.5F, -10.5F);
/*      */     
/*  463 */     this.gunModel[64].addShapeBox(26.0F, -1.0F, 2.0F, 1, 19, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  464 */     this.gunModel[64].setRotationPoint(37.0F, -27.0F, -8.0F);
/*      */     
/*  466 */     this.gunModel[65].addShapeBox(26.0F, -1.0F, 2.0F, 1, 9, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  467 */     this.gunModel[65].setRotationPoint(-4.0F, -21.0F, -22.0F);
/*      */     
/*  469 */     this.gunModel[66].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  470 */     this.gunModel[66].setRotationPoint(-5.0F, -21.0F, -22.0F);
/*      */     
/*  472 */     this.gunModel[67].addShapeBox(26.0F, -1.0F, 2.0F, 1, 5, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  473 */     this.gunModel[67].setRotationPoint(-5.0F, -19.0F, -22.0F);
/*      */     
/*  475 */     this.gunModel[68].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  476 */     this.gunModel[68].setRotationPoint(-5.0F, -14.0F, -22.0F);
/*      */     
/*  478 */     this.gunModel[69].addShapeBox(26.0F, -1.0F, 2.0F, 7, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  479 */     this.gunModel[69].setRotationPoint(38.0F, -20.0F, -3.5F);
/*      */     
/*  481 */     this.gunModel[70].addShapeBox(26.0F, -1.0F, 2.0F, 1, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  482 */     this.gunModel[70].setRotationPoint(45.0F, -20.0F, -3.5F);
/*      */     
/*  484 */     this.gunModel[71].addShapeBox(26.0F, -1.0F, 2.0F, 2, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  485 */     this.gunModel[71].setRotationPoint(41.0F, -24.5F, -2.0F);
/*      */     
/*  487 */     this.gunModel[72].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  488 */     this.gunModel[72].setRotationPoint(41.0F, -26.5F, -2.0F);
/*      */     
/*  490 */     this.gunModel[73].addShapeBox(26.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  491 */     this.gunModel[73].setRotationPoint(43.0F, -27.5F, -2.0F);
/*      */     
/*  493 */     this.gunModel[74].addShapeBox(26.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  494 */     this.gunModel[74].setRotationPoint(45.0F, -27.5F, -2.0F);
/*      */     
/*  496 */     this.gunModel[75].addShapeBox(26.0F, -1.0F, 2.0F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  497 */     this.gunModel[75].setRotationPoint(47.0F, -26.5F, -2.0F);
/*      */     
/*  499 */     this.gunModel[76].addShapeBox(26.0F, -1.0F, 2.0F, 6, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  500 */     this.gunModel[76].setRotationPoint(43.0F, -21.5F, -2.0F);
/*      */     
/*  502 */     this.gunModel[77].addShapeBox(26.0F, -1.0F, 2.0F, 4, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  503 */     this.gunModel[77].setRotationPoint(43.0F, -26.5F, -2.0F);
/*      */     
/*  505 */     this.gunModel[78].addShapeBox(26.0F, -1.0F, 2.0F, 7, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  506 */     this.gunModel[78].setRotationPoint(43.0F, -18.5F, -2.0F);
/*      */     
/*  508 */     this.gunModel[79].addShapeBox(26.0F, -1.0F, 2.0F, 6, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  509 */     this.gunModel[79].setRotationPoint(43.0F, -14.5F, -2.0F);
/*      */     
/*  511 */     this.gunModel[80].addShapeBox(26.0F, -1.0F, 2.0F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  512 */     this.gunModel[80].setRotationPoint(47.0F, -11.5F, -2.0F);
/*      */     
/*  514 */     this.gunModel[81].addShapeBox(26.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  515 */     this.gunModel[81].setRotationPoint(43.0F, -6.5F, -2.0F);
/*      */     
/*  517 */     this.gunModel[82].addShapeBox(26.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  518 */     this.gunModel[82].setRotationPoint(45.0F, -6.5F, -2.0F);
/*      */     
/*  520 */     this.gunModel[83].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  521 */     this.gunModel[83].setRotationPoint(41.0F, -8.5F, -2.0F);
/*      */     
/*  523 */     this.gunModel[84].addShapeBox(26.0F, -1.0F, 2.0F, 4, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  524 */     this.gunModel[84].setRotationPoint(43.0F, -11.5F, -2.0F);
/*      */     
/*  526 */     this.gunModel[85].addShapeBox(26.0F, -1.0F, 2.0F, 1, 15, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  527 */     this.gunModel[85].setRotationPoint(-4.0F, -23.0F, -6.0F);
/*      */     
/*  529 */     this.gunModel[86].addShapeBox(26.0F, -1.0F, 2.0F, 21, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  530 */     this.gunModel[86].setRotationPoint(-24.0F, -24.0F, -6.0F);
/*      */     
/*  532 */     this.gunModel[87].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  533 */     this.gunModel[87].setRotationPoint(-5.5F, -23.0F, -6.0F);
/*      */     
/*  535 */     this.gunModel[88].addShapeBox(26.0F, -1.0F, 2.0F, 16, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  536 */     this.gunModel[88].setRotationPoint(-20.5F, -9.0F, -6.0F);
/*      */     
/*  538 */     this.gunModel[89].addShapeBox(26.0F, -1.0F, 2.0F, 3, 1, 10, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  539 */     this.gunModel[89].setRotationPoint(-23.5F, -9.0F, -6.0F);
/*      */     
/*  541 */     this.gunModel[90].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  542 */     this.gunModel[90].setRotationPoint(-24.0F, -23.0F, -6.0F);
/*      */     
/*  544 */     this.gunModel[91].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  545 */     this.gunModel[91].setRotationPoint(-25.0F, -22.0F, -6.0F);
/*      */     
/*  547 */     this.gunModel[92].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[92].setRotationPoint(-25.0F, -24.0F, -6.0F);
/*      */     
/*  550 */     this.gunModel[93].addShapeBox(26.0F, -1.0F, 2.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[93].setRotationPoint(-25.0F, -19.0F, -6.0F);
/*      */     
/*  553 */     this.gunModel[94].addShapeBox(26.0F, -1.0F, 2.0F, 2, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  554 */     this.gunModel[94].setRotationPoint(-25.0F, -16.0F, -6.0F);
/*      */     
/*  556 */     this.gunModel[95].addShapeBox(26.0F, -1.0F, 2.0F, 2, 12, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  557 */     this.gunModel[95].setRotationPoint(-27.0F, -25.0F, -9.0F);
/*      */     
/*  559 */     this.gunModel[96].addShapeBox(26.0F, -1.0F, 2.0F, 11, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[96].setRotationPoint(-22.75F, -23.25F, -4.5F);
/*      */     
/*  562 */     this.gunModel[97].addShapeBox(26.0F, -1.0F, 2.0F, 2, 13, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  563 */     this.gunModel[97].setRotationPoint(-29.0F, -24.5F, -9.0F);
/*      */     
/*  565 */     this.gunModel[98].addShapeBox(26.0F, -1.0F, 2.0F, 2, 15, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[98].setRotationPoint(-31.0F, -24.5F, -9.0F);
/*      */     
/*  568 */     this.gunModel[99].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[99].setRotationPoint(-31.0F, -9.5F, -9.0F);
/*      */     
/*  571 */     this.gunModel[100].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  572 */     this.gunModel[100].setRotationPoint(-31.0F, -6.5F, -9.0F);
/*      */     
/*  574 */     this.gunModel[101].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[101].setRotationPoint(-31.0F, -7.5F, -9.0F);
/*      */     
/*  577 */     this.gunModel[102].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[102].setRotationPoint(-31.0F, -3.5F, -9.0F);
/*      */     
/*  580 */     this.gunModel[103].addShapeBox(26.0F, -1.0F, 2.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[103].setRotationPoint(-31.0F, -4.5F, -9.0F);
/*      */     
/*  583 */     this.gunModel[104].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  584 */     this.gunModel[104].setRotationPoint(-31.25F, -1.5F, -9.0F);
/*      */     
/*  586 */     this.gunModel[105].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  587 */     this.gunModel[105].setRotationPoint(-31.25F, 1.5F, -9.0F);
/*      */     
/*  589 */     this.gunModel[106].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  590 */     this.gunModel[106].setRotationPoint(-31.25F, 0.5F, -9.0F);
/*      */     
/*  592 */     this.gunModel[107].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[107].setRotationPoint(-31.25F, 2.5F, -9.0F);
/*      */     
/*  595 */     this.gunModel[108].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[108].setRotationPoint(-31.25F, 4.5F, -9.0F);
/*      */     
/*  598 */     this.gunModel[109].addShapeBox(26.0F, -1.0F, 2.0F, 1, 8, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  599 */     this.gunModel[109].setRotationPoint(-32.25F, -1.5F, -9.0F);
/*      */     
/*  601 */     this.gunModel[110].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  602 */     this.gunModel[110].setRotationPoint(-32.25F, 6.5F, -9.0F);
/*      */     
/*  604 */     this.gunModel[111].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[111].setRotationPoint(-32.25F, 7.5F, -9.0F);
/*      */     
/*  607 */     this.gunModel[112].addShapeBox(26.0F, -1.0F, 2.0F, 19, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[112].setRotationPoint(-50.25F, 8.5F, -9.0F);
/*      */     
/*  610 */     this.gunModel[113].addShapeBox(26.0F, -1.0F, 2.0F, 19, 1, 16, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[113].setRotationPoint(-49.25F, 10.5F, -9.0F);
/*      */     
/*  613 */     this.gunModel[114].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[114].setRotationPoint(-25.0F, -24.5F, -9.0F);
/*      */     
/*  616 */     this.gunModel[115].addShapeBox(26.0F, -1.0F, 2.0F, 28, 11, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[115].setRotationPoint(-31.0F, -35.5F, -9.0F);
/*      */     
/*  619 */     this.gunModel[116].addShapeBox(26.0F, -1.0F, 2.0F, 5, 3, 6, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[116].setRotationPoint(-18.75F, -20.25F, -4.5F);
/*      */     
/*  622 */     this.gunModel[117].addShapeBox(26.0F, -1.0F, 2.0F, 3, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  623 */     this.gunModel[117].setRotationPoint(-15.25F, -17.25F, -4.5F);
/*      */     
/*  625 */     this.gunModel[118].addShapeBox(26.0F, -1.0F, 2.0F, 18, 5, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[118].setRotationPoint(-50.25F, 3.5F, -9.0F);
/*      */     
/*  628 */     this.gunModel[119].addShapeBox(26.0F, -1.0F, 2.0F, 17, 9, 16, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  629 */     this.gunModel[119].setRotationPoint(-49.25F, -5.5F, -9.0F);
/*      */     
/*  631 */     this.gunModel[120].addShapeBox(26.0F, -1.0F, 2.0F, 16, 6, 16, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  632 */     this.gunModel[120].setRotationPoint(-46.75F, -11.5F, -9.0F);
/*      */     
/*  634 */     this.gunModel[121].addShapeBox(26.0F, -1.0F, 2.0F, 1, 4, 16, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  635 */     this.gunModel[121].setRotationPoint(-32.0F, -5.5F, -9.0F);
/*      */     
/*  637 */     this.gunModel[122].addShapeBox(26.0F, -1.0F, 2.0F, 14, 3, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  638 */     this.gunModel[122].setRotationPoint(-45.0F, -14.5F, -9.0F);
/*      */     
/*  640 */     this.gunModel[123].addShapeBox(26.0F, -1.0F, 2.0F, 13, 3, 16, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  641 */     this.gunModel[123].setRotationPoint(-44.0F, -17.5F, -9.0F);
/*      */     
/*  643 */     this.gunModel[124].addShapeBox(26.0F, -1.0F, 2.0F, 13, 4, 16, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  644 */     this.gunModel[124].setRotationPoint(-44.0F, -21.5F, -9.0F);
/*      */     
/*  646 */     this.gunModel[125].addShapeBox(26.0F, -1.0F, 2.0F, 14, 4, 16, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  647 */     this.gunModel[125].setRotationPoint(-45.0F, -25.5F, -9.0F);
/*      */     
/*  649 */     this.gunModel[126].addShapeBox(26.0F, -1.0F, 2.0F, 18, 9, 16, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  650 */     this.gunModel[126].setRotationPoint(-49.0F, -34.5F, -9.0F);
/*      */     
/*  652 */     this.gunModel[127].addShapeBox(26.0F, -1.0F, 2.0F, 28, 8, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  653 */     this.gunModel[127].setRotationPoint(-31.0F, -43.5F, -8.0F);
/*      */     
/*  655 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  656 */     this.gunModel[''].setRotationPoint(-31.0F, -37.5F, -9.0F);
/*      */     
/*  658 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  659 */     this.gunModel[''].setRotationPoint(-31.0F, -43.5F, -9.0F);
/*      */     
/*  661 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 28, 11, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  662 */     this.gunModel[''].setRotationPoint(-31.0F, -54.5F, -9.0F);
/*      */     
/*  664 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 9, 20, 16, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  665 */     this.gunModel[''].setRotationPoint(-40.0F, -54.5F, -9.0F);
/*      */     
/*  667 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 9, 11, 16, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  668 */     this.gunModel[''].setRotationPoint(-48.75F, -54.5F, -9.0F);
/*      */     
/*  670 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 9, 9, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  671 */     this.gunModel[''].setRotationPoint(-48.75F, -43.5F, -9.0F);
/*      */     
/*  673 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 6, 5, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  674 */     this.gunModel[''].setRotationPoint(-3.0F, -57.5F, -9.0F);
/*      */     
/*  676 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  677 */     this.gunModel[''].setRotationPoint(3.0F, -57.5F, -9.0F);
/*      */     
/*  679 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 30, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  680 */     this.gunModel[''].setRotationPoint(4.0F, -57.5F, -9.0F);
/*      */     
/*  682 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 3, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  683 */     this.gunModel[''].setRotationPoint(34.0F, -57.5F, -9.0F);
/*      */     
/*  685 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  686 */     this.gunModel[''].setRotationPoint(37.0F, -54.5F, -9.0F);
/*      */     
/*  688 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 1, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  689 */     this.gunModel[''].setRotationPoint(37.0F, -51.5F, -9.0F);
/*      */     
/*  691 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 4, 11, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  692 */     this.gunModel[''].setRotationPoint(37.0F, -43.5F, -9.0F);
/*      */     
/*  694 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 4, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -2.5F, -0.5F, -1.0F, -2.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  695 */     this.gunModel[''].setRotationPoint(37.0F, -32.5F, -9.0F);
/*      */     
/*  697 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 6, 5, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  698 */     this.gunModel[''].setRotationPoint(-3.0F, -57.5F, 4.0F);
/*      */     
/*  700 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  701 */     this.gunModel[''].setRotationPoint(3.0F, -57.5F, 4.0F);
/*      */     
/*  703 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 30, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  704 */     this.gunModel[''].setRotationPoint(4.0F, -57.5F, 4.0F);
/*      */     
/*  706 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 3, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  707 */     this.gunModel[''].setRotationPoint(34.0F, -57.5F, 4.0F);
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  710 */     this.gunModel[''].setRotationPoint(37.0F, -54.5F, 4.0F);
/*      */     
/*  712 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 38, 4, 10, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  713 */     this.gunModel[''].setRotationPoint(-3.0F, -56.5F, -6.0F);
/*      */     
/*  715 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 3, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  716 */     this.gunModel[''].setRotationPoint(35.0F, -54.5F, -6.0F);
/*      */     
/*  718 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 24, 3, 16, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  719 */     this.gunModel[''].setRotationPoint(38.0F, -47.5F, -8.0F);
/*      */     
/*  721 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 11, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  722 */     this.gunModel[''].setRotationPoint(41.0F, -44.5F, -6.0F);
/*      */     
/*  724 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  725 */     this.gunModel[''].setRotationPoint(52.5F, -38.5F, -6.0F);
/*      */     
/*  727 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  728 */     this.gunModel[''].setRotationPoint(52.5F, -44.5F, -6.0F);
/*      */     
/*  730 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 7, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  731 */     this.gunModel[''].setRotationPoint(68.0F, -44.5F, -6.0F);
/*      */     
/*  733 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  734 */     this.gunModel[''].setRotationPoint(75.5F, -38.5F, -6.0F);
/*      */     
/*  736 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  737 */     this.gunModel[''].setRotationPoint(75.5F, -44.5F, -6.0F);
/*      */     
/*  739 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 14, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[''].setRotationPoint(91.0F, -44.5F, -6.0F);
/*      */     
/*  742 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel[''].setRotationPoint(128.5F, -38.5F, -6.0F);
/*      */     
/*  745 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  746 */     this.gunModel[''].setRotationPoint(128.5F, -44.5F, -6.0F);
/*      */     
/*  748 */     this.gunModel[''].addShapeBox(26.0F, -1.0F, 2.0F, 7, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  749 */     this.gunModel[''].setRotationPoint(121.0F, -44.5F, -6.0F);
/*      */     
/*  751 */     this.gunModel[' '].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  752 */     this.gunModel[' '].setRotationPoint(105.5F, -38.5F, -6.0F);
/*      */     
/*  754 */     this.gunModel['¡'].addShapeBox(26.0F, -1.0F, 2.0F, 15, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  755 */     this.gunModel['¡'].setRotationPoint(105.5F, -44.5F, -6.0F);
/*      */     
/*  757 */     this.gunModel['¢'].addShapeBox(26.0F, -1.0F, 2.0F, 8, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  758 */     this.gunModel['¢'].setRotationPoint(144.0F, -44.5F, -6.0F);
/*      */     
/*  760 */     this.gunModel['£'].addShapeBox(26.0F, -1.0F, 2.0F, 113, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  761 */     this.gunModel['£'].setRotationPoint(38.0F, -48.5F, -6.0F);
/*      */     
/*  763 */     this.gunModel['¤'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel['¤'].setRotationPoint(75.0F, -47.5F, -8.0F);
/*      */     
/*  766 */     this.gunModel['¥'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel['¥'].setRotationPoint(95.0F, -47.5F, -8.0F);
/*      */     
/*  769 */     this.gunModel['¦'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel['¦'].setRotationPoint(115.0F, -47.5F, -8.0F);
/*      */     
/*  772 */     this.gunModel['§'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel['§'].setRotationPoint(136.0F, -47.5F, -8.0F);
/*      */     
/*  775 */     this.gunModel['¨'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel['¨'].setRotationPoint(144.5F, -47.5F, -8.0F);
/*      */     
/*  778 */     this.gunModel['©'].addShapeBox(26.0F, -1.0F, 2.0F, 77, 3, 16, 0.0F, 0.0F, 0.0F, -2.75F, 1.5F, 0.0F, -2.75F, 1.5F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.75F, 1.5F, 0.0F, -0.75F, 1.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  779 */     this.gunModel['©'].setRotationPoint(59.5F, -47.5F, -8.0F);
/*      */     
/*  781 */     this.gunModel['ª'].addShapeBox(26.0F, -1.0F, 2.0F, 114, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  782 */     this.gunModel['ª'].setRotationPoint(38.5F, -44.5F, -8.0F);
/*      */     
/*  784 */     this.gunModel['«'].addShapeBox(26.0F, -1.0F, 2.0F, 109, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  785 */     this.gunModel['«'].setRotationPoint(41.5F, -42.0F, -7.0F);
/*      */     
/*  787 */     this.gunModel['¬'].addShapeBox(26.0F, -1.0F, 2.0F, 111, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  788 */     this.gunModel['¬'].setRotationPoint(41.5F, -37.5F, -8.0F);
/*      */     
/*  790 */     this.gunModel['­'].addShapeBox(26.0F, -1.0F, 2.0F, 95, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F);
/*  791 */     this.gunModel['­'].setRotationPoint(51.5F, -41.5F, -6.0F);
/*      */     
/*  793 */     this.gunModel['®'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  794 */     this.gunModel['®'].setRotationPoint(144.5F, -35.5F, -8.0F);
/*      */     
/*  796 */     this.gunModel['¯'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  797 */     this.gunModel['¯'].setRotationPoint(136.0F, -35.5F, -8.0F);
/*      */     
/*  799 */     this.gunModel['°'].addShapeBox(26.0F, -1.0F, 2.0F, 74, 3, 16, 0.0F, 0.0F, 0.0F, -0.75F, 1.5F, 0.0F, -0.75F, 1.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.75F, 1.5F, 0.0F, -2.75F, 1.5F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F);
/*  800 */     this.gunModel['°'].setRotationPoint(61.5F, -35.5F, -8.0F);
/*      */     
/*  802 */     this.gunModel['±'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  803 */     this.gunModel['±'].setRotationPoint(115.0F, -35.5F, -8.0F);
/*      */     
/*  805 */     this.gunModel['²'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  806 */     this.gunModel['²'].setRotationPoint(95.0F, -35.5F, -8.0F);
/*      */     
/*  808 */     this.gunModel['³'].addShapeBox(26.0F, -1.0F, 2.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  809 */     this.gunModel['³'].setRotationPoint(75.0F, -35.5F, -8.0F);
/*      */     
/*  811 */     this.gunModel['´'].addShapeBox(26.0F, -1.0F, 2.0F, 21, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  812 */     this.gunModel['´'].setRotationPoint(41.0F, -35.5F, -8.0F);
/*      */     
/*  814 */     this.gunModel['µ'].addShapeBox(26.0F, -1.0F, 2.0F, 110, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  815 */     this.gunModel['µ'].setRotationPoint(41.0F, -32.5F, -6.0F);
/*      */     
/*  817 */     this.gunModel['¶'].addShapeBox(26.0F, -1.0F, 2.0F, 4, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel['¶'].setRotationPoint(148.5F, -42.0F, -8.0F);
/*      */     
/*  820 */     this.gunModel['·'].addShapeBox(26.0F, -1.0F, 2.0F, 4, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  821 */     this.gunModel['·'].setRotationPoint(37.0F, -47.5F, -9.0F);
/*      */     
/*  823 */     this.gunModel['¸'].addShapeBox(26.0F, -1.0F, 2.0F, 5, 3, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  824 */     this.gunModel['¸'].setRotationPoint(97.0F, -33.0F, -6.5F);
/*      */     
/*  826 */     this.gunModel['¹'].addShapeBox(26.0F, -1.0F, 2.0F, 3, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  827 */     this.gunModel['¹'].setRotationPoint(94.0F, -32.5F, -6.5F);
/*      */     
/*  829 */     this.gunModel['º'].addShapeBox(26.0F, -1.0F, 2.0F, 2, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  830 */     this.gunModel['º'].setRotationPoint(92.0F, -32.5F, -6.5F);
/*      */     
/*  832 */     this.gunModel['»'].addShapeBox(26.0F, -1.0F, 2.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  833 */     this.gunModel['»'].setRotationPoint(92.0F, -26.5F, -6.5F);
/*      */     
/*  835 */     this.gunModel['¼'].addShapeBox(26.0F, -1.0F, 2.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  836 */     this.gunModel['¼'].setRotationPoint(92.0F, -21.5F, -6.5F);
/*      */     
/*  838 */     this.gunModel['½'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel['½'].setRotationPoint(92.0F, -23.5F, -6.5F);
/*      */     
/*  841 */     this.gunModel['¾'].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  842 */     this.gunModel['¾'].setRotationPoint(92.0F, -16.5F, -6.5F);
/*      */     
/*  844 */     this.gunModel['¿'].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel['¿'].setRotationPoint(92.0F, -18.5F, -6.5F);
/*      */     
/*  847 */     this.gunModel['À'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel['À'].setRotationPoint(90.75F, -14.5F, -6.5F);
/*      */     
/*  850 */     this.gunModel['Á'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel['Á'].setRotationPoint(90.75F, -10.5F, -6.5F);
/*      */     
/*  853 */     this.gunModel['Â'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  854 */     this.gunModel['Â'].setRotationPoint(90.75F, -11.5F, -6.5F);
/*      */     
/*  856 */     this.gunModel['Ã'].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  857 */     this.gunModel['Ã'].setRotationPoint(90.75F, -8.5F, -6.5F);
/*      */     
/*  859 */     this.gunModel['Ä'].addShapeBox(26.0F, -1.0F, 2.0F, 2, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  860 */     this.gunModel['Ä'].setRotationPoint(90.75F, -6.5F, -6.5F);
/*      */     
/*  862 */     this.gunModel['Å'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  863 */     this.gunModel['Å'].setRotationPoint(90.75F, -4.5F, -6.5F);
/*      */     
/*  865 */     this.gunModel['Æ'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  866 */     this.gunModel['Æ'].setRotationPoint(90.75F, -3.5F, -6.5F);
/*      */     
/*  868 */     this.gunModel['Ç'].addShapeBox(26.0F, -1.0F, 2.0F, 19, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel['Ç'].setRotationPoint(72.75F, -2.5F, -6.5F);
/*      */     
/*  871 */     this.gunModel['È'].addShapeBox(26.0F, -1.0F, 2.0F, 19, 1, 11, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel['È'].setRotationPoint(73.75F, 0.5F, -6.5F);
/*      */     
/*  874 */     this.gunModel['É'].addShapeBox(26.0F, -1.0F, 2.0F, 18, 5, 11, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel['É'].setRotationPoint(72.75F, -7.5F, -6.5F);
/*      */     
/*  877 */     this.gunModel['Ê'].addShapeBox(26.0F, -1.0F, 2.0F, 17, 9, 11, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  878 */     this.gunModel['Ê'].setRotationPoint(73.75F, -16.5F, -6.5F);
/*      */     
/*  880 */     this.gunModel['Ë'].addShapeBox(26.0F, -1.0F, 2.0F, 16, 6, 11, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel['Ë'].setRotationPoint(76.25F, -22.5F, -6.5F);
/*      */     
/*  883 */     this.gunModel['Ì'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 2, 11, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  884 */     this.gunModel['Ì'].setRotationPoint(91.0F, -16.5F, -6.5F);
/*      */     
/*  886 */     this.gunModel['Í'].addShapeBox(26.0F, -1.0F, 2.0F, 14, 3, 11, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  887 */     this.gunModel['Í'].setRotationPoint(78.0F, -25.5F, -6.5F);
/*      */     
/*  889 */     this.gunModel['Î'].addShapeBox(26.0F, -1.0F, 2.0F, 13, 3, 11, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  890 */     this.gunModel['Î'].setRotationPoint(79.0F, -28.5F, -6.5F);
/*      */     
/*  892 */     this.gunModel['Ï'].addShapeBox(26.0F, -1.0F, 2.0F, 14, 4, 11, 0.0F, 6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  893 */     this.gunModel['Ï'].setRotationPoint(78.0F, -32.5F, -6.5F);
/*      */     
/*  895 */     this.gunModel['Ð'].addShapeBox(26.0F, -1.0F, 2.0F, 10, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  896 */     this.gunModel['Ð'].setRotationPoint(-41.75F, -54.5F, -10.0F);
/*      */     
/*  898 */     this.gunModel['Ñ'].addShapeBox(26.0F, -1.0F, 2.0F, 9, 14, 1, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  899 */     this.gunModel['Ñ'].setRotationPoint(-50.75F, -54.5F, -10.0F);
/*      */     
/*  901 */     this.gunModel['Ò'].addShapeBox(26.0F, -1.0F, 2.0F, 19, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  902 */     this.gunModel['Ò'].setRotationPoint(-50.75F, -40.5F, -10.0F);
/*      */     
/*  904 */     this.gunModel['Ó'].addShapeBox(26.0F, -1.0F, 2.0F, 16, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel['Ó'].setRotationPoint(-50.75F, -36.5F, -10.0F);
/*      */     
/*  907 */     this.gunModel['Ô'].addShapeBox(26.0F, -1.0F, 2.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel['Ô'].setRotationPoint(-50.75F, -29.5F, -10.0F);
/*      */     
/*  910 */     this.gunModel['Õ'].addShapeBox(26.0F, -1.0F, 2.0F, 6, 15, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  911 */     this.gunModel['Õ'].setRotationPoint(-56.75F, -40.5F, -10.0F);
/*      */     
/*  913 */     this.gunModel['Ö'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 12, 1, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  914 */     this.gunModel['Ö'].setRotationPoint(-57.75F, -37.5F, -10.0F);
/*      */     
/*  916 */     this.gunModel['×'].addShapeBox(26.0F, -1.0F, 2.0F, 14, 12, 1, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  917 */     this.gunModel['×'].setRotationPoint(-71.75F, -37.5F, -11.0F);
/*      */     
/*  919 */     this.gunModel['Ø'].addShapeBox(26.0F, -1.0F, 2.0F, 66, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  920 */     this.gunModel['Ø'].setRotationPoint(-137.75F, -32.5F, -11.0F);
/*      */     
/*  922 */     this.gunModel['Ù'].addShapeBox(26.0F, -1.0F, 2.0F, 10, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  923 */     this.gunModel['Ù'].setRotationPoint(-41.75F, -54.5F, 7.0F);
/*      */     
/*  925 */     this.gunModel['Ú'].addShapeBox(26.0F, -1.0F, 2.0F, 9, 14, 1, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  926 */     this.gunModel['Ú'].setRotationPoint(-50.75F, -54.5F, 7.0F);
/*      */     
/*  928 */     this.gunModel['Û'].addShapeBox(26.0F, -1.0F, 2.0F, 19, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  929 */     this.gunModel['Û'].setRotationPoint(-50.75F, -40.5F, 7.0F);
/*      */     
/*  931 */     this.gunModel['Ü'].addShapeBox(26.0F, -1.0F, 2.0F, 16, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  932 */     this.gunModel['Ü'].setRotationPoint(-50.75F, -36.5F, 7.0F);
/*      */     
/*  934 */     this.gunModel['Ý'].addShapeBox(26.0F, -1.0F, 2.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  935 */     this.gunModel['Ý'].setRotationPoint(-50.75F, -29.5F, 7.0F);
/*      */     
/*  937 */     this.gunModel['Þ'].addShapeBox(26.0F, -1.0F, 2.0F, 6, 15, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  938 */     this.gunModel['Þ'].setRotationPoint(-56.75F, -40.5F, 7.0F);
/*      */     
/*  940 */     this.gunModel['ß'].addShapeBox(26.0F, -1.0F, 2.0F, 1, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/*  941 */     this.gunModel['ß'].setRotationPoint(-57.75F, -37.5F, 7.0F);
/*      */     
/*  943 */     this.gunModel['à'].addShapeBox(26.0F, -1.0F, 2.0F, 14, 12, 1, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  944 */     this.gunModel['à'].setRotationPoint(-71.75F, -37.5F, 8.0F);
/*      */     
/*  946 */     this.gunModel['á'].addShapeBox(26.0F, -1.0F, 2.0F, 66, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  947 */     this.gunModel['á'].setRotationPoint(-137.75F, -32.5F, 8.0F);
/*      */     
/*  949 */     this.gunModel['â'].addShapeBox(26.0F, -1.0F, 2.0F, 12, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  950 */     this.gunModel['â'].setRotationPoint(-140.75F, -48.5F, -12.0F);
/*      */     
/*  952 */     this.gunModel['ã'].addShapeBox(26.0F, -1.0F, 2.0F, 12, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  953 */     this.gunModel['ã'].setRotationPoint(-140.75F, -34.5F, -12.0F);
/*      */     
/*  955 */     this.gunModel['ä'].addShapeBox(26.0F, -1.0F, 2.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  956 */     this.gunModel['ä'].setRotationPoint(-128.75F, -34.5F, -12.0F);
/*      */     
/*  958 */     this.gunModel['å'].addShapeBox(26.0F, -1.0F, 2.0F, 3, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  959 */     this.gunModel['å'].setRotationPoint(-128.75F, -29.5F, -12.0F);
/*      */     
/*  961 */     this.gunModel['æ'].addShapeBox(26.0F, -1.0F, 2.0F, 14, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  962 */     this.gunModel['æ'].setRotationPoint(-140.75F, -22.5F, -12.0F);
/*      */     
/*  964 */     this.gunModel['ç'].addShapeBox(26.0F, -1.0F, 2.0F, 8, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  965 */     this.gunModel['ç'].setRotationPoint(-140.75F, -2.5F, -12.0F);
/*      */     
/*  967 */     this.gunModel['è'].addShapeBox(26.0F, -1.0F, 2.0F, 12, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  968 */     this.gunModel['è'].setRotationPoint(-140.75F, -48.5F, 9.0F);
/*      */     
/*  970 */     this.gunModel['é'].addShapeBox(26.0F, -1.0F, 2.0F, 12, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel['é'].setRotationPoint(-140.75F, -34.5F, 9.0F);
/*      */     
/*  973 */     this.gunModel['ê'].addShapeBox(26.0F, -1.0F, 2.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  974 */     this.gunModel['ê'].setRotationPoint(-128.75F, -34.5F, 9.0F);
/*      */     
/*  976 */     this.gunModel['ë'].addShapeBox(26.0F, -1.0F, 2.0F, 3, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  977 */     this.gunModel['ë'].setRotationPoint(-128.75F, -29.5F, 9.0F);
/*      */     
/*  979 */     this.gunModel['ì'].addShapeBox(26.0F, -1.0F, 2.0F, 14, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  980 */     this.gunModel['ì'].setRotationPoint(-140.75F, -22.5F, 9.0F);
/*      */     
/*  982 */     this.gunModel['í'].addShapeBox(26.0F, -1.0F, 2.0F, 8, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  983 */     this.gunModel['í'].setRotationPoint(-140.75F, -2.5F, 9.0F);
/*      */     
/*  985 */     this.gunModel['î'].addShapeBox(26.0F, -1.0F, 2.0F, 4, 54, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  986 */     this.gunModel['î'].setRotationPoint(-140.75F, -48.5F, -11.0F);
/*      */     
/*  988 */     this.gunModel['ï'].addShapeBox(26.0F, -1.0F, 2.0F, 4, 3, 22, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  989 */     this.gunModel['ï'].setRotationPoint(-140.75F, -51.5F, -12.0F);
/*      */     
/*  991 */     this.gunModel['ð'].addShapeBox(26.0F, -1.0F, 2.0F, 4, 3, 14, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  992 */     this.gunModel['ð'].setRotationPoint(-140.75F, -54.5F, -8.0F);
/*      */     
/*  994 */     this.gunModel['ñ'].addShapeBox(26.0F, -1.0F, 2.0F, 4, 3, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  995 */     this.gunModel['ñ'].setRotationPoint(-140.75F, 5.5F, -12.0F);
/*      */     
/*  997 */     this.gunModel['ò'].addShapeBox(26.0F, -1.0F, 2.0F, 4, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/*  998 */     this.gunModel['ò'].setRotationPoint(-140.75F, 8.5F, -8.0F);
/*      */     
/* 1000 */     this.gunModel['ó'].addShapeBox(26.0F, -1.0F, 2.0F, 31, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F);
/* 1001 */     this.gunModel['ó'].setRotationPoint(3.0F, -57.5F, -6.0F);
/*      */     
/* 1003 */     this.gunModel['ô'].addShapeBox(26.0F, -1.0F, 2.0F, 32, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 3.0F, 0.75F, 0.5F);
/* 1004 */     this.gunModel['ô'].setRotationPoint(2.0F, -55.5F, -6.0F);
/*      */     
/* 1006 */     this.gunModel['õ'].addShapeBox(26.0F, -1.0F, 2.0F, 31, 1, 2, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F);
/* 1007 */     this.gunModel['õ'].setRotationPoint(3.0F, -57.5F, 2.0F);
/*      */     
/* 1009 */     this.gunModel['ö'].addShapeBox(26.0F, -1.0F, 2.0F, 32, 1, 4, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 3.0F, 0.75F, 0.5F);
/* 1010 */     this.gunModel['ö'].setRotationPoint(2.0F, -55.5F, 0.0F);
/*      */     
/* 1012 */     this.gunModel['÷'].addShapeBox(26.0F, -1.0F, 2.0F, 11, 4, 11, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1013 */     this.gunModel['÷'].setRotationPoint(137.5F, -42.0F, -18.0F);
/*      */     
/*      */ 
/* 1016 */     this.ammoModel = new ModelRendererTurbo[1];
/* 1017 */     this.ammoModel[0] = new ModelRendererTurbo(this, 465, 233, this.textureX, this.textureY);
/*      */     
/* 1019 */     this.ammoModel[0].addShapeBox(26.0F, -1.0F, 2.0F, 18, 7, 7, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1020 */     this.ammoModel[0].setRotationPoint(-1.0F, -45.5F, -17.5F);
/*      */     
/*      */ 
/*      */ 
/* 1024 */     translateAll(0.0F, -21.0F, 0.0F);
/* 1025 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*      */     
/*      */ 
/* 1028 */     this.gunSlideDistance = 0.0F;
/* 1029 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 1031 */     this.tiltGun = 0.0F;
/* 1032 */     this.rotateGunVertical = 0.0F;
/* 1033 */     this.translateGun = new Vector3f(0.0F, -3.0F, 0.0F);
/*      */     
/* 1035 */     this.rotateClipVertical = 0.0F;
/* 1036 */     this.translateClip = new Vector3f(0.0F, -3.0F, 0.0F);
/*      */     
/*      */ 
/* 1039 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelstiker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */