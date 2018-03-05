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
/*      */ public class Modelvz58
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelvz58()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ů'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 513, 25, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 633, 33, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 889, 25, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 777, 33, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 825, 33, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 921, 33, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 953, 41, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 985, 25, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 577, 49, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 865, 49, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 625, 57, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 753, 57, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 809, 57, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 905, 65, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 945, 65, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 513, 73, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 745, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 969, 65, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 721, 73, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 793, 73, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 849, 73, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 401, 89, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 881, 81, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 529, 89, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 977, 81, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 177, 89, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 585, 89, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 633, 89, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 681, 89, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 729, 89, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 777, 89, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 33, 97, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 225, 97, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 809, 105, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 105, 105, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 313, 105, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 937, 97, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 385, 113, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 457, 113, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 513, 113, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 561, 113, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 713, 113, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 609, 113, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 649, 121, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 761, 121, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 49, 129, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 761, 33, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 137, 129, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 689, 121, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 801, 129, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 841, 129, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 881, 129, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 153, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 145, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 673, 145, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 745, 153, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 161, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 145, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 169, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 9, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 9, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 33, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 641, 25, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 689, 25, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 897, 57, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 345, 153, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 617, 145, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 529, 169, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 609, 169, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 945, 169, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 561, 49, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 609, 49, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 745, 1, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 985, 49, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 1001, 57, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 921, 81, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 513, 89, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 673, 177, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 369, 169, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 161, 185, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 393, 177, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 433, 177, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 921, 25, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 761, 9, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 369, 97, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 993, 113, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 825, 33, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 953, 41, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 897, 49, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 1001, 49, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 633, 9, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 833, 177, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 313, 185, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 913, 185, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 337, 193, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 457, 193, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 497, 193, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 537, 193, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 577, 193, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 809, 89, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 673, 121, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 777, 73, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 617, 193, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 937, 193, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 641, 153, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 537, 145, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 617, 89, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 977, 193, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 73, 201, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 113, 201, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 153, 201, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 193, 201, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 233, 201, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 361, 201, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 273, 201, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 433, 201, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 681, 201, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 745, 201, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 793, 201, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 857, 201, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 297, 209, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 881, 209, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 321, 217, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 457, 217, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 857, 57, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 937, 57, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 497, 217, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 881, 73, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 665, 89, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 713, 89, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 761, 89, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 281, 121, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 833, 89, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 945, 89, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 969, 89, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 745, 57, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 801, 57, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 681, 225, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 817, 233, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 257, 241, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 353, 241, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1009, 73, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 497, 113, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 961, 225, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 561, 233, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 809, 177, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 593, 201, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 545, 113, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 609, 233, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 481, 241, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 657, 201, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 249, 209, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 409, 209, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 593, 113, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 529, 241, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 833, 209, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 657, 233, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 49, 249, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 689, 249, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 73, 249, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 793, 249, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 97, 257, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 841, 9, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 633, 121, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 745, 121, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 785, 121, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 137, 257, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 185, 257, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 593, 233, this.textureX, this.textureY);
/*  350 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 225, 257, this.textureX, this.textureY);
/*  351 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 273, 257, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 313, 257, this.textureX, this.textureY);
/*  353 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 641, 33, this.textureX, this.textureY);
/*  355 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 761, 33, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 121, 129, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 561, 257, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 641, 257, this.textureX, this.textureY);
/*  359 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 585, 257, this.textureX, this.textureY);
/*  360 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 785, 33, this.textureX, this.textureY);
/*  361 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 945, 25, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*  363 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 953, 257, this.textureX, this.textureY);
/*  365 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 353, 265, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 401, 265, this.textureX, this.textureY);
/*  367 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 817, 265, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 49, 161, this.textureX, this.textureY);
/*  369 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 345, 225, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 385, 225, this.textureX, this.textureY);
/*  371 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 665, 257, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 441, 265, this.textureX, this.textureY);
/*  373 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 481, 265, this.textureX, this.textureY);
/*  374 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/*  375 */     this.gunModel['š'] = new ModelRendererTurbo(this, 865, 33, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  377 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 833, 97, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/*  379 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 649, 337, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 705, 337, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 785, 337, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 857, 337, this.textureX, this.textureY);
/*  383 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 25, 345, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 89, 345, this.textureX, this.textureY);
/*  385 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 577, 49, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
/*      */     
/*  390 */     this.gunModel[0].addBox(55.0F, -23.0F, -8.0F, 5, 11, 18, 0.0F);
/*  391 */     this.gunModel[0].setRotationPoint(16.0F, -17.75F, -1.0F);
/*      */     
/*  393 */     this.gunModel[1].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  394 */     this.gunModel[1].setRotationPoint(16.0F, -6.75F, -1.0F);
/*      */     
/*  396 */     this.gunModel[2].addShapeBox(55.0F, -23.0F, -8.0F, 3, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  397 */     this.gunModel[2].setRotationPoint(21.0F, -6.75F, -1.0F);
/*      */     
/*  399 */     this.gunModel[3].addShapeBox(55.0F, -23.0F, -8.0F, 3, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -1.5F, -4.0F, 0.0F, -1.5F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  400 */     this.gunModel[3].setRotationPoint(24.0F, -8.25F, -1.0F);
/*      */     
/*  402 */     this.gunModel[4].addShapeBox(55.0F, -23.0F, -8.0F, 5, 15, 18, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  403 */     this.gunModel[4].setRotationPoint(27.0F, -24.25F, -1.0F);
/*      */     
/*  405 */     this.gunModel[5].addShapeBox(55.0F, -23.0F, -8.0F, 15, 3, 18, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  406 */     this.gunModel[5].setRotationPoint(32.0F, -9.25F, -1.0F);
/*      */     
/*  408 */     this.gunModel[6].addShapeBox(55.0F, -23.0F, -8.0F, 15, 3, 18, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  409 */     this.gunModel[6].setRotationPoint(47.0F, -9.75F, -1.0F);
/*      */     
/*  411 */     this.gunModel[7].addShapeBox(55.0F, -23.0F, -8.0F, 15, 3, 18, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.25F, -4.0F);
/*  412 */     this.gunModel[7].setRotationPoint(62.0F, -10.5F, -1.0F);
/*      */     
/*  414 */     this.gunModel[8].addShapeBox(55.0F, -23.0F, -8.0F, 15, 11, 18, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.75F, 0.0F);
/*  415 */     this.gunModel[8].setRotationPoint(77.0F, -24.5F, -1.0F);
/*      */     
/*  417 */     this.gunModel[9].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 18, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.42F, 0.0F, 0.0F, 2.42F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.25F, -4.0F, 0.0F, -1.25F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  418 */     this.gunModel[9].setRotationPoint(92.0F, -10.25F, -1.0F);
/*      */     
/*  420 */     this.gunModel[10].addShapeBox(55.0F, -23.0F, -8.0F, 5, 4, 18, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  421 */     this.gunModel[10].setRotationPoint(16.0F, -21.75F, -1.0F);
/*      */     
/*  423 */     this.gunModel[11].addShapeBox(55.0F, -23.0F, -8.0F, 4, 3, 18, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  424 */     this.gunModel[11].setRotationPoint(17.0F, -24.25F, -1.0F);
/*      */     
/*  426 */     this.gunModel[12].addShapeBox(55.0F, -23.0F, -8.0F, 24, 1, 18, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.05F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.05F, -0.25F, 0.0F);
/*  427 */     this.gunModel[12].setRotationPoint(19.0F, -24.75F, -1.0F);
/*      */     
/*  429 */     this.gunModel[13].addShapeBox(55.0F, -23.0F, -8.0F, 15, 13, 18, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  430 */     this.gunModel[13].setRotationPoint(47.0F, -22.75F, -1.0F);
/*      */     
/*  432 */     this.gunModel[14].addShapeBox(55.0F, -23.0F, -8.0F, 15, 13, 18, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  433 */     this.gunModel[14].setRotationPoint(32.0F, -22.25F, -1.0F);
/*      */     
/*  435 */     this.gunModel[15].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  436 */     this.gunModel[15].setRotationPoint(27.0F, -9.25F, -1.0F);
/*      */     
/*  438 */     this.gunModel[16].addShapeBox(55.0F, -23.0F, -8.0F, 3, 16, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  439 */     this.gunModel[16].setRotationPoint(24.0F, -23.75F, -1.0F);
/*      */     
/*  441 */     this.gunModel[17].addShapeBox(55.0F, -23.0F, -8.0F, 3, 17, 18, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  442 */     this.gunModel[17].setRotationPoint(21.0F, -22.75F, -1.0F);
/*      */     
/*  444 */     this.gunModel[18].addShapeBox(55.0F, -23.0F, -8.0F, 15, 12, 18, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  445 */     this.gunModel[18].setRotationPoint(62.0F, -24.5F, -1.0F);
/*      */     
/*  447 */     this.gunModel[19].addShapeBox(55.0F, -23.0F, -8.0F, 15, 3, 18, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.75F, -4.0F, 0.0F, -0.75F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  448 */     this.gunModel[19].setRotationPoint(77.0F, -10.5F, -1.0F);
/*      */     
/*  450 */     this.gunModel[20].addShapeBox(55.0F, -23.0F, -8.0F, 6, 11, 18, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  451 */     this.gunModel[20].setRotationPoint(92.0F, -25.25F, -1.0F);
/*      */     
/*  453 */     this.gunModel[21].addShapeBox(55.0F, -23.0F, -8.0F, 53, 4, 18, 0.0F, -0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  454 */     this.gunModel[21].setRotationPoint(45.0F, -32.25F, -1.0F);
/*      */     
/*  456 */     this.gunModel[22].addShapeBox(55.0F, -23.0F, -8.0F, 53, 3, 15, 0.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  457 */     this.gunModel[22].setRotationPoint(45.0F, -35.25F, 0.5F);
/*      */     
/*  459 */     this.gunModel[23].addShapeBox(55.0F, -23.0F, -8.0F, 53, 2, 18, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  460 */     this.gunModel[23].setRotationPoint(45.0F, -28.25F, -1.0F);
/*      */     
/*  462 */     this.gunModel[24].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 18, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  463 */     this.gunModel[24].setRotationPoint(77.0F, -26.25F, -1.0F);
/*      */     
/*  465 */     this.gunModel[25].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 18, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  466 */     this.gunModel[25].setRotationPoint(77.0F, -25.25F, -1.0F);
/*      */     
/*  468 */     this.gunModel[26].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 18, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  469 */     this.gunModel[26].setRotationPoint(63.0F, -25.25F, -1.0F);
/*      */     
/*  471 */     this.gunModel[27].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 18, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  472 */     this.gunModel[27].setRotationPoint(63.0F, -26.25F, -1.0F);
/*      */     
/*  474 */     this.gunModel[28].addShapeBox(55.0F, -23.0F, -8.0F, 8, 1, 18, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  475 */     this.gunModel[28].setRotationPoint(90.0F, -26.25F, -1.0F);
/*      */     
/*  477 */     this.gunModel[29].addShapeBox(55.0F, -23.0F, -8.0F, 6, 1, 18, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  478 */     this.gunModel[29].setRotationPoint(91.0F, -25.25F, -1.0F);
/*      */     
/*  480 */     this.gunModel[30].addShapeBox(55.0F, -23.0F, -8.0F, 8, 1, 18, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  481 */     this.gunModel[30].setRotationPoint(45.0F, -26.25F, -1.0F);
/*      */     
/*  483 */     this.gunModel[31].addShapeBox(55.0F, -23.0F, -8.0F, 6, 1, 18, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  484 */     this.gunModel[31].setRotationPoint(46.0F, -25.25F, -1.0F);
/*      */     
/*  486 */     this.gunModel[32].addShapeBox(55.0F, -23.0F, -8.0F, 6, 3, 16, 0.0F, 0.0F, 0.0F, -3.0F, -1.25F, 0.0F, -3.0F, -1.25F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[32].setRotationPoint(-102.0F, -23.75F, 0.0F);
/*      */     
/*  489 */     this.gunModel[33].addShapeBox(55.0F, -23.0F, -8.0F, 6, 3, 16, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  490 */     this.gunModel[33].setRotationPoint(-108.0F, -23.75F, 0.0F);
/*      */     
/*  492 */     this.gunModel[34].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 16, 0.0F, 0.0F, -1.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.25F, -3.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  493 */     this.gunModel[34].setRotationPoint(-113.0F, -23.0F, 0.0F);
/*      */     
/*  495 */     this.gunModel[35].addShapeBox(55.0F, -23.0F, -8.0F, 7, 3, 16, 0.0F, 0.0F, -2.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.25F, -3.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F);
/*  496 */     this.gunModel[35].setRotationPoint(-120.0F, -21.75F, 0.0F);
/*      */     
/*  498 */     this.gunModel[36].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 16, 0.0F, 0.0F, -1.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.25F, -3.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  499 */     this.gunModel[36].setRotationPoint(-125.0F, -19.5F, 0.0F);
/*      */     
/*  501 */     this.gunModel[37].addShapeBox(55.0F, -23.0F, -8.0F, 17, 3, 16, 0.0F, 0.0F, -1.5F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, -1.5F, -3.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  502 */     this.gunModel[37].setRotationPoint(-142.0F, -18.0F, 0.0F);
/*      */     
/*  504 */     this.gunModel[38].addShapeBox(55.0F, -23.0F, -8.0F, 1, 3, 18, 0.0F, 0.0F, 2.42F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.42F, 0.0F, 0.0F, -1.25F, -4.0F, 0.0F, -1.75F, -4.0F, 0.0F, -1.75F, -4.0F, 0.0F, -1.25F, -4.0F);
/*  505 */     this.gunModel[38].setRotationPoint(97.0F, -10.25F, -1.0F);
/*      */     
/*  507 */     this.gunModel[39].addShapeBox(55.0F, -23.0F, -8.0F, 35, 3, 16, 0.0F, 0.0F, -3.75F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, -3.75F, -3.0F, 0.0F, 3.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 3.75F, 0.0F);
/*  508 */     this.gunModel[39].setRotationPoint(-177.0F, -16.25F, 0.0F);
/*      */     
/*  510 */     this.gunModel[40].addShapeBox(55.0F, -23.0F, -8.0F, 24, 3, 16, 0.0F, 0.0F, -2.75F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.75F, -3.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, 0.0F);
/*  511 */     this.gunModel[40].setRotationPoint(-201.0F, -12.5F, 0.0F);
/*      */     
/*  513 */     this.gunModel[41].addShapeBox(55.0F, -23.0F, -8.0F, 7, 3, 16, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.5F, -3.0F);
/*  514 */     this.gunModel[41].setRotationPoint(-103.0F, -7.75F, 0.0F);
/*      */     
/*  516 */     this.gunModel[42].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 16, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.5F, -3.0F);
/*  517 */     this.gunModel[42].setRotationPoint(-108.0F, -7.25F, 0.0F);
/*      */     
/*  519 */     this.gunModel[43].addShapeBox(55.0F, -23.0F, -8.0F, 53, 1, 9, 0.0F, -0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  520 */     this.gunModel[43].setRotationPoint(45.0F, -36.25F, 3.5F);
/*      */     
/*  522 */     this.gunModel[44].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  523 */     this.gunModel[44].setRotationPoint(16.0F, -4.25F, 3.0F);
/*      */     
/*  525 */     this.gunModel[45].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  526 */     this.gunModel[45].setRotationPoint(21.0F, -4.25F, 3.0F);
/*      */     
/*  528 */     this.gunModel[46].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -1.5F, -4.0F, 0.0F, -1.5F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  529 */     this.gunModel[46].setRotationPoint(24.0F, -5.75F, 3.0F);
/*      */     
/*  531 */     this.gunModel[47].addShapeBox(55.0F, -23.0F, -8.0F, 15, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  532 */     this.gunModel[47].setRotationPoint(32.0F, -6.75F, 3.0F);
/*      */     
/*  534 */     this.gunModel[48].addShapeBox(55.0F, -23.0F, -8.0F, 15, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  535 */     this.gunModel[48].setRotationPoint(47.0F, -7.25F, 3.0F);
/*      */     
/*  537 */     this.gunModel[49].addShapeBox(55.0F, -23.0F, -8.0F, 15, 1, 10, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.25F, -4.0F);
/*  538 */     this.gunModel[49].setRotationPoint(62.0F, -8.0F, 3.0F);
/*      */     
/*  540 */     this.gunModel[50].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.25F, -4.0F, 0.0F, -1.25F, -4.0F, 0.0F, -1.0F, -4.0F);
/*  541 */     this.gunModel[50].setRotationPoint(92.0F, -7.75F, 3.0F);
/*      */     
/*  543 */     this.gunModel[51].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  544 */     this.gunModel[51].setRotationPoint(27.0F, -6.75F, 3.0F);
/*      */     
/*  546 */     this.gunModel[52].addShapeBox(55.0F, -23.0F, -8.0F, 15, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.75F, -4.0F, 0.0F, -0.75F, -4.0F, 0.0F, -0.5F, -4.0F);
/*  547 */     this.gunModel[52].setRotationPoint(77.0F, -8.0F, 3.0F);
/*      */     
/*  549 */     this.gunModel[53].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 10, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, -4.0F, 0.0F, -1.75F, -4.0F, 0.0F, -1.75F, -4.0F, 0.0F, -1.25F, -4.0F);
/*  550 */     this.gunModel[53].setRotationPoint(97.0F, -7.75F, 3.0F);
/*      */     
/*  552 */     this.gunModel[54].addShapeBox(55.0F, -23.0F, -8.0F, 2, 11, 18, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  553 */     this.gunModel[54].setRotationPoint(98.25F, -25.25F, -1.0F);
/*      */     
/*  555 */     this.gunModel[55].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.75F, -4.0F, 0.0F, -3.5F, -4.0F, 0.0F, -3.5F, -4.0F, 0.0F, -1.75F, -4.0F);
/*  556 */     this.gunModel[55].setRotationPoint(98.25F, -10.25F, -1.0F);
/*      */     
/*  558 */     this.gunModel[56].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 10, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, -4.0F, 0.0F, -2.75F, -4.0F, 0.0F, -2.75F, -4.0F, 0.0F, -1.25F, -4.0F);
/*  559 */     this.gunModel[56].setRotationPoint(98.25F, -8.25F, 3.0F);
/*      */     
/*  561 */     this.gunModel[57].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  562 */     this.gunModel[57].setRotationPoint(98.25F, -29.25F, -1.0F);
/*      */     
/*  564 */     this.gunModel[58].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  565 */     this.gunModel[58].setRotationPoint(98.25F, -33.25F, -1.0F);
/*      */     
/*  567 */     this.gunModel[59].addShapeBox(55.0F, -23.0F, -8.0F, 2, 2, 15, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  568 */     this.gunModel[59].setRotationPoint(98.25F, -36.25F, 0.5F);
/*      */     
/*  570 */     this.gunModel[60].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[60].setRotationPoint(98.25F, -36.25F, 3.5F);
/*      */     
/*  573 */     this.gunModel[61].addShapeBox(55.0F, -23.0F, -8.0F, 1, 3, 16, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -0.75F, 1.5F, 0.0F);
/*  574 */     this.gunModel[61].setRotationPoint(97.25F, -29.25F, 0.0F);
/*      */     
/*  576 */     this.gunModel[62].addShapeBox(55.0F, -23.0F, -8.0F, 1, 3, 16, 0.0F, -0.75F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, -0.75F, -1.0F, -1.5F, -0.75F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.75F, 2.0F, 0.0F);
/*  577 */     this.gunModel[62].setRotationPoint(97.25F, -33.25F, 0.0F);
/*      */     
/*  579 */     this.gunModel[63].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 13, 0.0F, -0.75F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, -0.75F, -1.0F, -3.0F, -0.75F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.75F, 2.0F, 0.0F);
/*  580 */     this.gunModel[63].setRotationPoint(97.25F, -36.25F, 1.5F);
/*      */     
/*  582 */     this.gunModel[64].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 7, 0.0F, -0.75F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, -0.75F, -0.25F, -4.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  583 */     this.gunModel[64].setRotationPoint(97.25F, -36.25F, 4.5F);
/*      */     
/*  585 */     this.gunModel[65].addShapeBox(55.0F, -23.0F, -8.0F, 1, 11, 16, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F);
/*  586 */     this.gunModel[65].setRotationPoint(97.25F, -24.75F, 0.0F);
/*      */     
/*  588 */     this.gunModel[66].addShapeBox(55.0F, -23.0F, -8.0F, 1, 3, 16, 0.0F, -0.75F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -0.75F, 2.5F, 0.0F, -0.75F, -1.75F, -4.0F, 0.0F, -1.75F, -4.0F, 0.0F, -1.75F, -4.0F, -0.75F, -1.75F, -4.0F);
/*  589 */     this.gunModel[66].setRotationPoint(97.25F, -10.25F, 0.0F);
/*      */     
/*  591 */     this.gunModel[67].addShapeBox(55.0F, -23.0F, -8.0F, 97, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  592 */     this.gunModel[67].setRotationPoint(102.25F, -22.25F, 5.0F);
/*      */     
/*  594 */     this.gunModel[68].addShapeBox(55.0F, -23.0F, -8.0F, 9, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[68].setRotationPoint(100.25F, -33.25F, 4.5F);
/*      */     
/*  597 */     this.gunModel[69].addShapeBox(55.0F, -23.0F, -8.0F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  598 */     this.gunModel[69].setRotationPoint(100.25F, -22.75F, 4.5F);
/*      */     
/*  600 */     this.gunModel[70].addShapeBox(55.0F, -23.0F, -8.0F, 8, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  601 */     this.gunModel[70].setRotationPoint(104.25F, -23.25F, 4.0F);
/*      */     
/*  603 */     this.gunModel[71].addShapeBox(55.0F, -23.0F, -8.0F, 1, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  604 */     this.gunModel[71].setRotationPoint(110.25F, -30.25F, 4.5F);
/*      */     
/*  606 */     this.gunModel[72].addShapeBox(55.0F, -23.0F, -8.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  607 */     this.gunModel[72].setRotationPoint(111.25F, -28.25F, 4.5F);
/*      */     
/*  609 */     this.gunModel[73].addShapeBox(55.0F, -23.0F, -8.0F, 12, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  610 */     this.gunModel[73].setRotationPoint(112.25F, -22.75F, 4.5F);
/*      */     
/*  612 */     this.gunModel[74].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  613 */     this.gunModel[74].setRotationPoint(167.25F, -22.75F, 4.5F);
/*      */     
/*  615 */     this.gunModel[75].addShapeBox(55.0F, -23.0F, -8.0F, 24, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  616 */     this.gunModel[75].setRotationPoint(169.25F, -23.25F, 4.0F);
/*      */     
/*  618 */     this.gunModel[76].addShapeBox(55.0F, -23.0F, -8.0F, 24, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[76].setRotationPoint(169.25F, -17.25F, 4.0F);
/*      */     
/*  621 */     this.gunModel[77].addShapeBox(55.0F, -23.0F, -8.0F, 4, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  622 */     this.gunModel[77].setRotationPoint(169.25F, -21.25F, 4.0F);
/*      */     
/*  624 */     this.gunModel[78].addShapeBox(55.0F, -23.0F, -8.0F, 4, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[78].setRotationPoint(189.25F, -21.25F, 4.0F);
/*      */     
/*  627 */     this.gunModel[79].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  628 */     this.gunModel[79].setRotationPoint(173.25F, -18.25F, 4.0F);
/*      */     
/*  630 */     this.gunModel[80].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[80].setRotationPoint(173.25F, -21.25F, 4.0F);
/*      */     
/*  633 */     this.gunModel[81].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  634 */     this.gunModel[81].setRotationPoint(188.25F, -21.25F, 4.0F);
/*      */     
/*  636 */     this.gunModel[82].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  637 */     this.gunModel[82].setRotationPoint(188.25F, -18.25F, 4.0F);
/*      */     
/*  639 */     this.gunModel[83].addShapeBox(55.0F, -23.0F, -8.0F, 16, 2, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  640 */     this.gunModel[83].setRotationPoint(173.25F, -20.25F, 4.0F);
/*      */     
/*  642 */     this.gunModel[84].addShapeBox(55.0F, -23.0F, -8.0F, 3, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  643 */     this.gunModel[84].setRotationPoint(191.25F, -22.75F, 4.5F);
/*      */     
/*  645 */     this.gunModel[85].addShapeBox(55.0F, -23.0F, -8.0F, 7, 3, 16, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 3.0F, -3.0F);
/*  646 */     this.gunModel[85].setRotationPoint(-115.0F, -5.75F, 0.0F);
/*      */     
/*  648 */     this.gunModel[86].addShapeBox(55.0F, -23.0F, -8.0F, 44, 3, 16, 0.0F, 0.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, 0.0F, 27.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 27.0F, -3.0F);
/*  649 */     this.gunModel[86].setRotationPoint(-159.0F, -2.75F, 0.0F);
/*      */     
/*  651 */     this.gunModel[87].addShapeBox(55.0F, -23.0F, -8.0F, 19, 3, 16, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 11.0F, -3.0F);
/*  652 */     this.gunModel[87].setRotationPoint(-178.0F, 24.25F, 0.0F);
/*      */     
/*  654 */     this.gunModel[88].addShapeBox(55.0F, -23.0F, -8.0F, 10, 3, 16, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 5.0F, -3.0F);
/*  655 */     this.gunModel[88].setRotationPoint(-188.0F, 35.25F, 0.0F);
/*      */     
/*  657 */     this.gunModel[89].addShapeBox(55.0F, -23.0F, -8.0F, 4, 3, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F);
/*  658 */     this.gunModel[89].setRotationPoint(-192.0F, 40.25F, 0.0F);
/*      */     
/*  660 */     this.gunModel[90].addShapeBox(55.0F, -23.0F, -8.0F, 9, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  661 */     this.gunModel[90].setRotationPoint(-201.0F, 41.25F, 0.0F);
/*      */     
/*  663 */     this.gunModel[91].addShapeBox(55.0F, -23.0F, -8.0F, 6, 13, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F);
/*  664 */     this.gunModel[91].setRotationPoint(-102.0F, -20.75F, 0.0F);
/*      */     
/*  666 */     this.gunModel[92].addShapeBox(55.0F, -23.0F, -8.0F, 6, 13, 16, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  667 */     this.gunModel[92].setRotationPoint(-108.0F, -20.75F, 0.0F);
/*      */     
/*  669 */     this.gunModel[93].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  670 */     this.gunModel[93].setRotationPoint(-108.0F, -7.25F, 0.0F);
/*      */     
/*  672 */     this.gunModel[94].addShapeBox(55.0F, -23.0F, -8.0F, 5, 12, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  673 */     this.gunModel[94].setRotationPoint(-113.0F, -19.75F, 0.0F);
/*      */     
/*  675 */     this.gunModel[95].addShapeBox(55.0F, -23.0F, -8.0F, 7, 12, 16, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  676 */     this.gunModel[95].setRotationPoint(-120.0F, -19.75F, 0.0F);
/*      */     
/*  678 */     this.gunModel[96].addShapeBox(55.0F, -23.0F, -8.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  679 */     this.gunModel[96].setRotationPoint(-115.0F, -7.25F, 0.0F);
/*      */     
/*  681 */     this.gunModel[97].addShapeBox(55.0F, -23.0F, -8.0F, 5, 9, 16, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  682 */     this.gunModel[97].setRotationPoint(-125.0F, -16.5F, 0.0F);
/*      */     
/*  684 */     this.gunModel[98].addShapeBox(55.0F, -23.0F, -8.0F, 17, 8, 16, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  685 */     this.gunModel[98].setRotationPoint(-142.0F, -15.0F, 0.0F);
/*      */     
/*  687 */     this.gunModel[99].addShapeBox(55.0F, -23.0F, -8.0F, 35, 7, 16, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  688 */     this.gunModel[99].setRotationPoint(-177.0F, -13.25F, 0.0F);
/*      */     
/*  690 */     this.gunModel[100].addShapeBox(55.0F, -23.0F, -8.0F, 44, 5, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 27.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 27.0F, 0.0F);
/*  691 */     this.gunModel[100].setRotationPoint(-159.0F, -7.75F, 0.0F);
/*      */     
/*  693 */     this.gunModel[101].addShapeBox(55.0F, -23.0F, -8.0F, 24, 2, 16, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  694 */     this.gunModel[101].setRotationPoint(-201.0F, -9.5F, 0.0F);
/*      */     
/*  696 */     this.gunModel[102].addShapeBox(55.0F, -23.0F, -8.0F, 19, 31, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F);
/*  697 */     this.gunModel[102].setRotationPoint(-178.0F, -6.75F, 0.0F);
/*      */     
/*  699 */     this.gunModel[103].addShapeBox(55.0F, -23.0F, -8.0F, 10, 42, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  700 */     this.gunModel[103].setRotationPoint(-188.0F, -6.75F, 0.0F);
/*      */     
/*  702 */     this.gunModel[104].addShapeBox(55.0F, -23.0F, -8.0F, 4, 47, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  703 */     this.gunModel[104].setRotationPoint(-192.0F, -6.75F, 0.0F);
/*      */     
/*  705 */     this.gunModel[105].addShapeBox(55.0F, -23.0F, -8.0F, 18, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  706 */     this.gunModel[105].setRotationPoint(-177.0F, -7.25F, 0.0F);
/*      */     
/*  708 */     this.gunModel[106].addShapeBox(55.0F, -23.0F, -8.0F, 9, 9, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  709 */     this.gunModel[106].setRotationPoint(-201.0F, -6.75F, 0.0F);
/*      */     
/*  711 */     this.gunModel[107].addShapeBox(55.0F, -23.0F, -8.0F, 7, 8, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[107].setRotationPoint(-199.0F, 2.25F, 0.0F);
/*      */     
/*  714 */     this.gunModel[108].addShapeBox(55.0F, -23.0F, -8.0F, 6, 12, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  715 */     this.gunModel[108].setRotationPoint(-198.0F, 10.25F, 0.0F);
/*      */     
/*  717 */     this.gunModel[109].addShapeBox(55.0F, -23.0F, -8.0F, 7, 8, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  718 */     this.gunModel[109].setRotationPoint(-199.0F, 22.25F, 0.0F);
/*      */     
/*  720 */     this.gunModel[110].addShapeBox(55.0F, -23.0F, -8.0F, 9, 11, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  721 */     this.gunModel[110].setRotationPoint(-201.0F, 30.25F, 0.0F);
/*      */     
/*  723 */     this.gunModel[111].addShapeBox(55.0F, -23.0F, -8.0F, 4, 9, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  724 */     this.gunModel[111].setRotationPoint(-204.0F, -6.75F, 0.0F);
/*      */     
/*  726 */     this.gunModel[112].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  727 */     this.gunModel[112].setRotationPoint(-202.0F, 2.25F, 0.0F);
/*      */     
/*  729 */     this.gunModel[113].addShapeBox(55.0F, -23.0F, -8.0F, 3, 12, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[113].setRotationPoint(-201.0F, 10.25F, 0.0F);
/*      */     
/*  732 */     this.gunModel[114].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 16, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  733 */     this.gunModel[114].setRotationPoint(-202.0F, 22.25F, 0.0F);
/*      */     
/*  735 */     this.gunModel[115].addShapeBox(55.0F, -23.0F, -8.0F, 4, 11, 16, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  736 */     this.gunModel[115].setRotationPoint(-204.0F, 30.25F, 0.0F);
/*      */     
/*  738 */     this.gunModel[116].addShapeBox(55.0F, -23.0F, -8.0F, 3, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  739 */     this.gunModel[116].setRotationPoint(-204.0F, 41.25F, 0.0F);
/*      */     
/*  741 */     this.gunModel[117].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  742 */     this.gunModel[117].setRotationPoint(-204.0F, 43.25F, 3.0F);
/*      */     
/*  744 */     this.gunModel[118].addShapeBox(55.0F, -23.0F, -8.0F, 3, 3, 16, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  745 */     this.gunModel[118].setRotationPoint(-204.0F, -9.75F, 0.0F);
/*      */     
/*  747 */     this.gunModel[119].addShapeBox(55.0F, -23.0F, -8.0F, 2, 4, 18, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[119].setRotationPoint(43.0F, -32.25F, -1.0F);
/*      */     
/*  750 */     this.gunModel[120].addShapeBox(55.0F, -23.0F, -8.0F, 2, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  751 */     this.gunModel[120].setRotationPoint(43.0F, -28.25F, -1.0F);
/*      */     
/*  753 */     this.gunModel[121].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 15, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  754 */     this.gunModel[121].setRotationPoint(43.0F, -35.25F, 0.5F);
/*      */     
/*  756 */     this.gunModel[122].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  757 */     this.gunModel[122].setRotationPoint(43.0F, -36.25F, 3.5F);
/*      */     
/*  759 */     this.gunModel[123].addShapeBox(55.0F, -23.0F, -8.0F, 1, 4, 16, 0.0F, 0.0F, 0.0F, -1.5F, -0.75F, 0.0F, -1.5F, -0.75F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[123].setRotationPoint(45.0F, -32.25F, 0.0F);
/*      */     
/*  762 */     this.gunModel[124].addShapeBox(55.0F, -23.0F, -8.0F, 1, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  763 */     this.gunModel[124].setRotationPoint(45.0F, -28.25F, 0.0F);
/*      */     
/*  765 */     this.gunModel[125].addShapeBox(55.0F, -23.0F, -8.0F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  766 */     this.gunModel[125].setRotationPoint(45.0F, -35.25F, 1.5F);
/*      */     
/*  768 */     this.gunModel[126].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  769 */     this.gunModel[126].setRotationPoint(45.0F, -36.25F, 4.5F);
/*      */     
/*  771 */     this.gunModel[127].addBox(55.0F, -23.0F, -8.0F, 22, 12, 16, 0.0F);
/*  772 */     this.gunModel[127].setRotationPoint(-6.0F, -17.75F, 0.0F);
/*      */     
/*  774 */     this.gunModel[''].addBox(55.0F, -23.0F, -8.0F, 86, 2, 16, 0.0F);
/*  775 */     this.gunModel[''].setRotationPoint(-92.0F, -7.75F, 0.0F);
/*      */     
/*  777 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 20, 2, 16, 0.0F, 2.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  778 */     this.gunModel[''].setRotationPoint(-4.0F, -19.75F, 0.0F);
/*      */     
/*  780 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 22, 1, 18, 0.0F, 0.0F, 0.5F, 0.0F, -1.45F, 0.5F, 0.0F, -1.45F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  781 */     this.gunModel[''].setRotationPoint(-4.0F, -20.75F, -1.0F);
/*      */     
/*  783 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 23, 2, 18, 0.0F, 0.0F, 0.5F, 0.0F, -0.45F, 0.5F, 0.0F, -0.45F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  784 */     this.gunModel[''].setRotationPoint(-4.0F, -23.25F, -1.0F);
/*      */     
/*  786 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 85, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  787 */     this.gunModel[''].setRotationPoint(-89.0F, -24.75F, -1.0F);
/*      */     
/*  789 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 23, 1, 18, 0.0F, 0.0F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  790 */     this.gunModel[''].setRotationPoint(-4.0F, -24.25F, -1.0F);
/*      */     
/*  792 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 4, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  793 */     this.gunModel[''].setRotationPoint(16.0F, -24.25F, 0.0F);
/*      */     
/*  795 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 20, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  796 */     this.gunModel[''].setRotationPoint(23.0F, -34.75F, 3.0F);
/*      */     
/*  798 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 6, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  799 */     this.gunModel[''].setRotationPoint(37.0F, -29.25F, 13.0F);
/*      */     
/*  801 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  802 */     this.gunModel[''].setRotationPoint(37.0F, -31.25F, 13.0F);
/*      */     
/*  804 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  805 */     this.gunModel[''].setRotationPoint(37.0F, -33.25F, 13.0F);
/*      */     
/*  807 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  808 */     this.gunModel[''].setRotationPoint(39.0F, -30.75F, 13.5F);
/*      */     
/*  810 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  811 */     this.gunModel[''].setRotationPoint(39.0F, -31.75F, 13.5F);
/*      */     
/*  813 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  814 */     this.gunModel[''].setRotationPoint(39.0F, -32.75F, 13.5F);
/*      */     
/*  816 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  817 */     this.gunModel[''].setRotationPoint(39.0F, -30.75F, 0.5F);
/*      */     
/*  819 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  820 */     this.gunModel[''].setRotationPoint(39.0F, -31.75F, 0.5F);
/*      */     
/*  822 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  823 */     this.gunModel[''].setRotationPoint(39.0F, -32.75F, 0.5F);
/*      */     
/*  825 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 6, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel[''].setRotationPoint(37.0F, -29.25F, 2.0F);
/*      */     
/*  828 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  829 */     this.gunModel[''].setRotationPoint(37.0F, -31.25F, 2.0F);
/*      */     
/*  831 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  832 */     this.gunModel[''].setRotationPoint(37.0F, -33.25F, 2.0F);
/*      */     
/*  834 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  835 */     this.gunModel[''].setRotationPoint(36.0F, -37.75F, 11.0F);
/*      */     
/*  837 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  838 */     this.gunModel[''].setRotationPoint(36.0F, -37.75F, 3.0F);
/*      */     
/*  840 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  841 */     this.gunModel[''].setRotationPoint(41.0F, -36.75F, 3.0F);
/*      */     
/*  843 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  844 */     this.gunModel[''].setRotationPoint(41.0F, -37.75F, 3.0F);
/*      */     
/*  846 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel[''].setRotationPoint(35.0F, -37.75F, 11.0F);
/*      */     
/*  849 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  850 */     this.gunModel[''].setRotationPoint(32.0F, -35.75F, 3.0F);
/*      */     
/*  852 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  853 */     this.gunModel[''].setRotationPoint(35.0F, -37.75F, 3.0F);
/*      */     
/*  855 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  856 */     this.gunModel[''].setRotationPoint(35.0F, -35.75F, 3.0F);
/*      */     
/*  858 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel[''].setRotationPoint(35.0F, -35.75F, 11.0F);
/*      */     
/*  861 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  862 */     this.gunModel[''].setRotationPoint(31.0F, -35.75F, 3.0F);
/*      */     
/*  864 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  865 */     this.gunModel[''].setRotationPoint(30.0F, -35.5F, 3.0F);
/*      */     
/*  867 */     this.gunModel[''].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  868 */     this.gunModel[''].setRotationPoint(26.5F, -35.75F, 3.0F);
/*      */     
/*  870 */     this.gunModel[' '].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  871 */     this.gunModel[' '].setRotationPoint(29.0F, -35.5F, 3.0F);
/*      */     
/*  873 */     this.gunModel['¡'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  874 */     this.gunModel['¡'].setRotationPoint(32.0F, -35.75F, 11.0F);
/*      */     
/*  876 */     this.gunModel['¢'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  877 */     this.gunModel['¢'].setRotationPoint(31.0F, -35.75F, 11.0F);
/*      */     
/*  879 */     this.gunModel['£'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  880 */     this.gunModel['£'].setRotationPoint(30.0F, -35.5F, 11.0F);
/*      */     
/*  882 */     this.gunModel['¤'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  883 */     this.gunModel['¤'].setRotationPoint(26.5F, -35.75F, 11.0F);
/*      */     
/*  885 */     this.gunModel['¥'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  886 */     this.gunModel['¥'].setRotationPoint(29.0F, -35.5F, 11.0F);
/*      */     
/*  888 */     this.gunModel['¦'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  889 */     this.gunModel['¦'].setRotationPoint(23.0F, -35.75F, 3.0F);
/*      */     
/*  891 */     this.gunModel['§'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  892 */     this.gunModel['§'].setRotationPoint(23.0F, -36.25F, 3.0F);
/*      */     
/*  894 */     this.gunModel['¨'].addShapeBox(55.0F, -23.0F, -8.0F, 19, 1, 2, 0.0F, 0.0F, 2.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F);
/*  895 */     this.gunModel['¨'].setRotationPoint(22.0F, -36.0F, 5.5F);
/*      */     
/*  897 */     this.gunModel['©'].addShapeBox(55.0F, -23.0F, -8.0F, 19, 1, 2, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 2.25F, -0.25F, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -1.75F, -0.25F);
/*  898 */     this.gunModel['©'].setRotationPoint(22.0F, -36.0F, 8.5F);
/*      */     
/*  900 */     this.gunModel['ª'].addShapeBox(55.0F, -23.0F, -8.0F, 19, 1, 1, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F);
/*  901 */     this.gunModel['ª'].setRotationPoint(22.0F, -36.0F, 7.5F);
/*      */     
/*  903 */     this.gunModel['«'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 9, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  904 */     this.gunModel['«'].setRotationPoint(-92.0F, -17.75F, 0.0F);
/*      */     
/*  906 */     this.gunModel['¬'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  907 */     this.gunModel['¬'].setRotationPoint(-7.0F, -8.75F, 0.0F);
/*      */     
/*  909 */     this.gunModel['­'].addShapeBox(55.0F, -23.0F, -8.0F, 22, 1, 16, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  910 */     this.gunModel['­'].setRotationPoint(-29.0F, -8.75F, 0.0F);
/*      */     
/*  912 */     this.gunModel['®'].addShapeBox(55.0F, -23.0F, -8.0F, 22, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  913 */     this.gunModel['®'].setRotationPoint(-29.0F, -17.75F, 1.0F);
/*      */     
/*  915 */     this.gunModel['¯'].addShapeBox(55.0F, -23.0F, -8.0F, 25, 2, 14, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  916 */     this.gunModel['¯'].setRotationPoint(-29.0F, -19.75F, 1.0F);
/*      */     
/*  918 */     this.gunModel['°'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  919 */     this.gunModel['°'].setRotationPoint(22.25F, -37.0F, 4.5F);
/*      */     
/*  921 */     this.gunModel['±'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  922 */     this.gunModel['±'].setRotationPoint(22.25F, -38.0F, 4.5F);
/*      */     
/*  924 */     this.gunModel['²'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  925 */     this.gunModel['²'].setRotationPoint(22.25F, -39.0F, 4.5F);
/*      */     
/*  927 */     this.gunModel['³'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  928 */     this.gunModel['³'].setRotationPoint(29.0F, -36.75F, 7.5F);
/*      */     
/*  930 */     this.gunModel['´'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  931 */     this.gunModel['´'].setRotationPoint(21.5F, -39.0F, 4.0F);
/*      */     
/*  933 */     this.gunModel['µ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  934 */     this.gunModel['µ'].setRotationPoint(21.5F, -41.0F, 4.0F);
/*      */     
/*  936 */     this.gunModel['¶'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  937 */     this.gunModel['¶'].setRotationPoint(21.5F, -41.0F, 10.0F);
/*      */     
/*  939 */     this.gunModel['·'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  940 */     this.gunModel['·'].setRotationPoint(21.5F, -41.0F, 6.0F);
/*      */     
/*  942 */     this.gunModel['¸'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  943 */     this.gunModel['¸'].setRotationPoint(21.5F, -41.0F, 9.0F);
/*      */     
/*  945 */     this.gunModel['¹'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  946 */     this.gunModel['¹'].setRotationPoint(21.5F, -41.0F, 7.0F);
/*      */     
/*  948 */     this.gunModel['º'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  949 */     this.gunModel['º'].setRotationPoint(21.5F, -37.0F, 4.0F);
/*      */     
/*  951 */     this.gunModel['»'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  952 */     this.gunModel['»'].setRotationPoint(33.0F, -35.75F, 4.5F);
/*      */     
/*  954 */     this.gunModel['¼'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  955 */     this.gunModel['¼'].setRotationPoint(33.0F, -36.75F, 4.5F);
/*      */     
/*  957 */     this.gunModel['½'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  958 */     this.gunModel['½'].setRotationPoint(33.0F, -37.75F, 4.5F);
/*      */     
/*  960 */     this.gunModel['¾'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  961 */     this.gunModel['¾'].setRotationPoint(22.75F, -38.5F, 3.5F);
/*      */     
/*  963 */     this.gunModel['¿'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  964 */     this.gunModel['¿'].setRotationPoint(22.75F, -38.0F, 3.5F);
/*      */     
/*  966 */     this.gunModel['À'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/*  967 */     this.gunModel['À'].setRotationPoint(22.75F, -37.5F, 3.5F);
/*      */     
/*  969 */     this.gunModel['Á'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  970 */     this.gunModel['Á'].setRotationPoint(33.5F, -37.25F, 3.5F);
/*      */     
/*  972 */     this.gunModel['Â'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  973 */     this.gunModel['Â'].setRotationPoint(33.5F, -36.75F, 3.5F);
/*      */     
/*  975 */     this.gunModel['Ã'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/*  976 */     this.gunModel['Ã'].setRotationPoint(33.5F, -36.25F, 3.5F);
/*      */     
/*  978 */     this.gunModel['Ä'].addShapeBox(55.0F, -23.0F, -8.0F, 65, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  979 */     this.gunModel['Ä'].setRotationPoint(-93.0F, -18.75F, 1.5F);
/*      */     
/*  981 */     this.gunModel['Å'].addShapeBox(55.0F, -23.0F, -8.0F, 61, 1, 16, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  982 */     this.gunModel['Å'].setRotationPoint(-91.0F, -8.75F, 0.0F);
/*      */     
/*  984 */     this.gunModel['Æ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  985 */     this.gunModel['Æ'].setRotationPoint(-92.0F, -8.75F, 0.0F);
/*      */     
/*  987 */     this.gunModel['Ç'].addShapeBox(55.0F, -23.0F, -8.0F, 60, 1, 14, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  988 */     this.gunModel['Ç'].setRotationPoint(-89.0F, -19.75F, 1.0F);
/*      */     
/*  990 */     this.gunModel['È'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 16, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  991 */     this.gunModel['È'].setRotationPoint(-6.0F, -18.75F, 0.0F);
/*      */     
/*  993 */     this.gunModel['É'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  994 */     this.gunModel['É'].setRotationPoint(-7.0F, -18.75F, 0.0F);
/*      */     
/*  996 */     this.gunModel['Ê'].addShapeBox(55.0F, -23.0F, -8.0F, 14, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  997 */     this.gunModel['Ê'].setRotationPoint(169.25F, -26.25F, 5.0F);
/*      */     
/*  999 */     this.gunModel['Ë'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -0.35F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1000 */     this.gunModel['Ë'].setRotationPoint(183.25F, -26.25F, 5.0F);
/*      */     
/* 1002 */     this.gunModel['Ì'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 15, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1003 */     this.gunModel['Ì'].setRotationPoint(185.25F, -37.25F, 5.0F);
/*      */     
/* 1005 */     this.gunModel['Í'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 5, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1006 */     this.gunModel['Í'].setRotationPoint(188.5F, -41.25F, 7.5F);
/*      */     
/* 1008 */     this.gunModel['Î'].addShapeBox(55.0F, -23.0F, -8.0F, 14, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1009 */     this.gunModel['Î'].setRotationPoint(169.25F, -26.25F, 10.0F);
/*      */     
/* 1011 */     this.gunModel['Ï'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.35F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1012 */     this.gunModel['Ï'].setRotationPoint(183.25F, -26.25F, 10.0F);
/*      */     
/* 1014 */     this.gunModel['Ð'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1015 */     this.gunModel['Ð'].setRotationPoint(185.25F, -38.25F, 8.0F);
/*      */     
/* 1017 */     this.gunModel['Ñ'].addShapeBox(55.0F, -23.0F, -8.0F, 14, 3, 4, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1018 */     this.gunModel['Ñ'].setRotationPoint(169.25F, -26.25F, 6.0F);
/*      */     
/* 1020 */     this.gunModel['Ò'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1021 */     this.gunModel['Ò'].setRotationPoint(183.25F, -26.25F, 6.0F);
/*      */     
/* 1023 */     this.gunModel['Ó'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 15, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1024 */     this.gunModel['Ó'].setRotationPoint(185.25F, -37.25F, 6.0F);
/*      */     
/* 1026 */     this.gunModel['Ô'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 15, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel['Ô'].setRotationPoint(185.25F, -37.25F, 10.0F);
/*      */     
/* 1029 */     this.gunModel['Õ'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1030 */     this.gunModel['Õ'].setRotationPoint(185.25F, -38.25F, 10.0F);
/*      */     
/* 1032 */     this.gunModel['Ö'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel['Ö'].setRotationPoint(185.25F, -40.25F, 5.0F);
/*      */     
/* 1035 */     this.gunModel['×'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1036 */     this.gunModel['×'].setRotationPoint(185.25F, -40.25F, 4.0F);
/*      */     
/* 1038 */     this.gunModel['Ø'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['Ø'].setRotationPoint(185.25F, -38.25F, 5.0F);
/*      */     
/* 1041 */     this.gunModel['Ù'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['Ù'].setRotationPoint(185.25F, -40.25F, 10.0F);
/*      */     
/* 1044 */     this.gunModel['Ú'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1045 */     this.gunModel['Ú'].setRotationPoint(185.25F, -40.25F, 11.0F);
/*      */     
/* 1047 */     this.gunModel['Û'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1048 */     this.gunModel['Û'].setRotationPoint(185.25F, -38.25F, 6.0F);
/*      */     
/* 1050 */     this.gunModel['Ü'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1051 */     this.gunModel['Ü'].setRotationPoint(185.25F, -41.25F, 4.0F);
/*      */     
/* 1053 */     this.gunModel['Ý'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1054 */     this.gunModel['Ý'].setRotationPoint(185.25F, -41.25F, 10.0F);
/*      */     
/* 1056 */     this.gunModel['Þ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1057 */     this.gunModel['Þ'].setRotationPoint(188.5F, -41.25F, 8.25F);
/*      */     
/* 1059 */     this.gunModel['ß'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 5, 1, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1060 */     this.gunModel['ß'].setRotationPoint(188.5F, -41.25F, 6.75F);
/*      */     
/* 1062 */     this.gunModel['à'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1063 */     this.gunModel['à'].setRotationPoint(188.5F, -38.25F, 8.75F);
/*      */     
/* 1065 */     this.gunModel['á'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1066 */     this.gunModel['á'].setRotationPoint(188.5F, -38.25F, 6.25F);
/*      */     
/* 1068 */     this.gunModel['â'].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1069 */     this.gunModel['â'].setRotationPoint(144.25F, -22.75F, 4.5F);
/*      */     
/* 1071 */     this.gunModel['ã'].addBox(55.0F, -23.0F, -8.0F, 30, 2, 14, 0.0F);
/* 1072 */     this.gunModel['ã'].setRotationPoint(-84.0F, -5.75F, 1.0F);
/*      */     
/* 1074 */     this.gunModel['ä'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 3, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F);
/* 1075 */     this.gunModel['ä'].setRotationPoint(-84.0F, -3.75F, 1.0F);
/*      */     
/* 1077 */     this.gunModel['å'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 2, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F);
/* 1078 */     this.gunModel['å'].setRotationPoint(-81.0F, -0.75F, 1.0F);
/*      */     
/* 1080 */     this.gunModel['æ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 4, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1081 */     this.gunModel['æ'].setRotationPoint(-80.5F, 1.25F, 1.0F);
/*      */     
/* 1083 */     this.gunModel['ç'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 5, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.5F, 0.0F, -2.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.5F, 0.0F, -2.0F);
/* 1084 */     this.gunModel['ç'].setRotationPoint(-80.5F, 5.25F, 1.0F);
/*      */     
/* 1086 */     this.gunModel['è'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 5, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F);
/* 1087 */     this.gunModel['è'].setRotationPoint(-84.0F, 10.25F, 1.0F);
/*      */     
/* 1089 */     this.gunModel['é'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F);
/* 1090 */     this.gunModel['é'].setRotationPoint(-87.0F, 15.25F, 1.0F);
/*      */     
/* 1092 */     this.gunModel['ê'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 10, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F);
/* 1093 */     this.gunModel['ê'].setRotationPoint(-90.0F, 23.25F, 1.0F);
/*      */     
/* 1095 */     this.gunModel['ë'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1096 */     this.gunModel['ë'].setRotationPoint(-93.0F, 33.25F, 1.0F);
/*      */     
/* 1098 */     this.gunModel['ì'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 14, 0.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.35F);
/* 1099 */     this.gunModel['ì'].setRotationPoint(-92.0F, 34.25F, 1.0F);
/*      */     
/* 1101 */     this.gunModel['í'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1102 */     this.gunModel['í'].setRotationPoint(-69.0F, 34.25F, 2.5F);
/*      */     
/* 1104 */     this.gunModel['î'].addShapeBox(55.0F, -23.0F, -8.0F, 14, 10, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1105 */     this.gunModel['î'].setRotationPoint(-87.0F, 23.25F, 1.0F);
/*      */     
/* 1107 */     this.gunModel['ï'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1108 */     this.gunModel['ï'].setRotationPoint(-71.0F, 25.25F, 1.0F);
/*      */     
/* 1110 */     this.gunModel['ð'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1111 */     this.gunModel['ð'].setRotationPoint(-71.0F, 33.25F, 1.0F);
/*      */     
/* 1113 */     this.gunModel['ñ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F);
/* 1114 */     this.gunModel['ñ'].setRotationPoint(-71.0F, 34.25F, 1.0F);
/*      */     
/* 1116 */     this.gunModel['ò'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F);
/* 1117 */     this.gunModel['ò'].setRotationPoint(-93.0F, 34.25F, 2.5F);
/*      */     
/* 1119 */     this.gunModel['ó'].addShapeBox(55.0F, -23.0F, -8.0F, 19, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1120 */     this.gunModel['ó'].setRotationPoint(-90.0F, 33.25F, 1.0F);
/*      */     
/* 1122 */     this.gunModel['ô'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 6, 14, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1123 */     this.gunModel['ô'].setRotationPoint(-71.0F, 19.25F, 1.0F);
/*      */     
/* 1125 */     this.gunModel['õ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1126 */     this.gunModel['õ'].setRotationPoint(-73.0F, 25.25F, 1.0F);
/*      */     
/* 1128 */     this.gunModel['ö'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 6, 14, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1129 */     this.gunModel['ö'].setRotationPoint(-70.0F, 13.25F, 1.0F);
/*      */     
/* 1131 */     this.gunModel['÷'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 6, 14, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1132 */     this.gunModel['÷'].setRotationPoint(-67.0F, 7.25F, 1.0F);
/*      */     
/* 1134 */     this.gunModel['ø'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 3, 14, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1135 */     this.gunModel['ø'].setRotationPoint(-63.0F, 4.25F, 1.0F);
/*      */     
/* 1137 */     this.gunModel['ù'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1138 */     this.gunModel['ù'].setRotationPoint(-59.0F, -3.75F, 1.0F);
/*      */     
/* 1140 */     this.gunModel['ú'].addShapeBox(55.0F, -23.0F, -8.0F, 19, 8, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1141 */     this.gunModel['ú'].setRotationPoint(-78.0F, -3.75F, 1.0F);
/*      */     
/* 1143 */     this.gunModel['û'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1144 */     this.gunModel['û'].setRotationPoint(-78.0F, -0.75F, 1.0F);
/*      */     
/* 1146 */     this.gunModel['ü'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1147 */     this.gunModel['ü'].setRotationPoint(-81.0F, -3.75F, 1.0F);
/*      */     
/* 1149 */     this.gunModel['ý'].addShapeBox(55.0F, -23.0F, -8.0F, 15, 3, 14, 0.0F, -0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1150 */     this.gunModel['ý'].setRotationPoint(-78.0F, 4.25F, 1.0F);
/*      */     
/* 1152 */     this.gunModel['þ'].addShapeBox(55.0F, -23.0F, -8.0F, 8, 6, 14, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1153 */     this.gunModel['þ'].setRotationPoint(-78.0F, 13.25F, 1.0F);
/*      */     
/* 1155 */     this.gunModel['ÿ'].addShapeBox(55.0F, -23.0F, -8.0F, 14, 6, 14, 0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 1156 */     this.gunModel['ÿ'].setRotationPoint(-81.0F, 7.25F, 1.0F);
/*      */     
/* 1158 */     this.gunModel['Ā'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F);
/* 1159 */     this.gunModel['Ā'].setRotationPoint(-77.5F, 5.25F, 1.0F);
/*      */     
/* 1161 */     this.gunModel['ā'].addShapeBox(55.0F, -23.0F, -8.0F, 4, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1162 */     this.gunModel['ā'].setRotationPoint(-81.0F, 10.25F, 1.0F);
/*      */     
/* 1164 */     this.gunModel['Ă'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 8, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1165 */     this.gunModel['Ă'].setRotationPoint(-84.0F, 15.25F, 1.0F);
/*      */     
/* 1167 */     this.gunModel['ă'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 6, 14, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1168 */     this.gunModel['ă'].setRotationPoint(-73.0F, 19.25F, 1.0F);
/*      */     
/* 1170 */     this.gunModel['Ą'].addShapeBox(55.0F, -23.0F, -8.0F, 4, 4, 14, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1171 */     this.gunModel['Ą'].setRotationPoint(-77.0F, 19.25F, 1.0F);
/*      */     
/* 1173 */     this.gunModel['ą'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1174 */     this.gunModel['ą'].setRotationPoint(187.25F, -32.25F, 5.0F);
/*      */     
/* 1176 */     this.gunModel['Ć'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1177 */     this.gunModel['Ć'].setRotationPoint(187.25F, -33.25F, 5.0F);
/*      */     
/* 1179 */     this.gunModel['ć'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1180 */     this.gunModel['ć'].setRotationPoint(187.25F, -34.25F, 5.0F);
/*      */     
/* 1182 */     this.gunModel['Ĉ'].addShapeBox(55.0F, -23.0F, -8.0F, 24, 1, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 1183 */     this.gunModel['Ĉ'].setRotationPoint(19.0F, -24.25F, 0.0F);
/*      */     
/* 1185 */     this.gunModel['ĉ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 5, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1186 */     this.gunModel['ĉ'].setRotationPoint(110.25F, -28.25F, 5.5F);
/*      */     
/* 1188 */     this.gunModel['Ċ'].addShapeBox(55.0F, -23.0F, -8.0F, 8, 1, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -0.5F, 1.0F, 0.25F, -0.5F, 1.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1189 */     this.gunModel['Ċ'].setRotationPoint(109.25F, -31.25F, 5.5F);
/*      */     
/* 1191 */     this.gunModel['ċ'].addShapeBox(55.0F, -23.0F, -8.0F, 8, 1, 3, 0.0F, 0.0F, -0.5F, -1.5F, 0.25F, -0.5F, -1.5F, 0.25F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1192 */     this.gunModel['ċ'].setRotationPoint(109.25F, -32.25F, 6.5F);
/*      */     
/* 1194 */     this.gunModel['Č'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1195 */     this.gunModel['Č'].setRotationPoint(-56.0F, -3.75F, 5.0F);
/*      */     
/* 1197 */     this.gunModel['č'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F);
/* 1198 */     this.gunModel['č'].setRotationPoint(-32.0F, 4.25F, 5.0F);
/*      */     
/* 1200 */     this.gunModel['Ď'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1201 */     this.gunModel['Ď'].setRotationPoint(-53.0F, 8.25F, 5.0F);
/*      */     
/* 1203 */     this.gunModel['ď'].addShapeBox(55.0F, -23.0F, -8.0F, 15, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1204 */     this.gunModel['ď'].setRotationPoint(-51.0F, 8.25F, 5.0F);
/*      */     
/* 1206 */     this.gunModel['Đ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1207 */     this.gunModel['Đ'].setRotationPoint(-56.0F, 4.25F, 5.0F);
/*      */     
/* 1209 */     this.gunModel['đ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1210 */     this.gunModel['đ'].setRotationPoint(-32.0F, -5.75F, 5.0F);
/*      */     
/* 1212 */     this.gunModel['Ē'].addShapeBox(55.0F, -23.0F, -8.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1213 */     this.gunModel['Ē'].setRotationPoint(-51.0F, -5.75F, 5.0F);
/*      */     
/* 1215 */     this.gunModel['ē'].addShapeBox(55.0F, -23.0F, -8.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1216 */     this.gunModel['ē'].setRotationPoint(-51.0F, -3.75F, 5.0F);
/*      */     
/* 1218 */     this.gunModel['Ĕ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 4, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1219 */     this.gunModel['Ĕ'].setRotationPoint(-49.0F, -1.75F, 5.0F);
/*      */     
/* 1221 */     this.gunModel['ĕ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1222 */     this.gunModel['ĕ'].setRotationPoint(-49.0F, 2.25F, 5.0F);
/*      */     
/* 1224 */     this.gunModel['Ė'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1225 */     this.gunModel['Ė'].setRotationPoint(-47.0F, 5.25F, 5.0F);
/*      */     
/* 1227 */     this.gunModel['ė'].addShapeBox(55.0F, -23.0F, -8.0F, 6, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1228 */     this.gunModel['ė'].setRotationPoint(-30.0F, -5.75F, 5.5F);
/*      */     
/* 1230 */     this.gunModel['Ę'].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1231 */     this.gunModel['Ę'].setRotationPoint(-29.0F, -4.75F, 5.5F);
/*      */     
/* 1233 */     this.gunModel['ę'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 1234 */     this.gunModel['ę'].setRotationPoint(-26.0F, -3.75F, 5.5F);
/*      */     
/* 1236 */     this.gunModel['Ě'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F);
/* 1237 */     this.gunModel['Ě'].setRotationPoint(-28.0F, -3.75F, 5.5F);
/*      */     
/* 1239 */     this.gunModel['ě'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 6, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1240 */     this.gunModel['ě'].setRotationPoint(-27.0F, -5.25F, 5.0F);
/*      */     
/* 1242 */     this.gunModel['Ĝ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1243 */     this.gunModel['Ĝ'].setRotationPoint(-27.0F, -4.75F, 5.0F);
/*      */     
/* 1245 */     this.gunModel['ĝ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1246 */     this.gunModel['ĝ'].setRotationPoint(-27.0F, -4.25F, 5.0F);
/*      */     
/* 1248 */     this.gunModel['Ğ'].addShapeBox(55.0F, -23.0F, -8.0F, 55, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1249 */     this.gunModel['Ğ'].setRotationPoint(-89.0F, -27.0F, -1.0F);
/*      */     
/* 1251 */     this.gunModel['ğ'].addShapeBox(55.0F, -23.0F, -8.0F, 53, 8, 18, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1252 */     this.gunModel['ğ'].setRotationPoint(-87.0F, -35.0F, -1.0F);
/*      */     
/* 1254 */     this.gunModel['Ġ'].addShapeBox(55.0F, -23.0F, -8.0F, 48, 2, 8, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.gunModel['Ġ'].setRotationPoint(-82.0F, -37.0F, 4.0F);
/*      */     
/* 1257 */     this.gunModel['ġ'].addShapeBox(55.0F, -23.0F, -8.0F, 55, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1258 */     this.gunModel['ġ'].setRotationPoint(-89.0F, -25.0F, -0.5F);
/*      */     
/* 1260 */     this.gunModel['Ģ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 9, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1261 */     this.gunModel['Ģ'].setRotationPoint(20.0F, -33.75F, 5.0F);
/*      */     
/* 1263 */     this.gunModel['ģ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1264 */     this.gunModel['ģ'].setRotationPoint(20.0F, -33.75F, 4.0F);
/*      */     
/* 1266 */     this.gunModel['Ĥ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1267 */     this.gunModel['Ĥ'].setRotationPoint(20.0F, -33.75F, 11.0F);
/*      */     
/* 1269 */     this.gunModel['ĥ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 10, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.gunModel['ĥ'].setRotationPoint(-45.0F, -38.0F, 3.0F);
/*      */     
/* 1272 */     this.gunModel['Ħ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 20, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1273 */     this.gunModel['Ħ'].setRotationPoint(-45.0F, -35.0F, -2.0F);
/*      */     
/* 1275 */     this.gunModel['ħ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1276 */     this.gunModel['ħ'].setRotationPoint(-45.0F, -27.0F, -2.0F);
/*      */     
/* 1278 */     this.gunModel['Ĩ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1279 */     this.gunModel['Ĩ'].setRotationPoint(-45.0F, -26.0F, -2.0F);
/*      */     
/* 1281 */     this.gunModel['ĩ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1282 */     this.gunModel['ĩ'].setRotationPoint(-43.5F, -26.0F, -2.0F);
/*      */     
/* 1284 */     this.gunModel['Ī'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1285 */     this.gunModel['Ī'].setRotationPoint(-44.5F, -26.0F, -2.0F);
/*      */     
/* 1287 */     this.gunModel['ī'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 10, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.gunModel['ī'].setRotationPoint(-50.0F, -38.0F, 3.0F);
/*      */     
/* 1290 */     this.gunModel['Ĭ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 20, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.gunModel['Ĭ'].setRotationPoint(-50.0F, -35.0F, -2.0F);
/*      */     
/* 1293 */     this.gunModel['ĭ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1294 */     this.gunModel['ĭ'].setRotationPoint(-50.0F, -27.0F, -2.0F);
/*      */     
/* 1296 */     this.gunModel['Į'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1297 */     this.gunModel['Į'].setRotationPoint(-50.0F, -26.0F, -2.0F);
/*      */     
/* 1299 */     this.gunModel['į'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1300 */     this.gunModel['į'].setRotationPoint(-48.5F, -26.0F, -2.0F);
/*      */     
/* 1302 */     this.gunModel['İ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1303 */     this.gunModel['İ'].setRotationPoint(-49.5F, -26.0F, -2.0F);
/*      */     
/* 1305 */     this.gunModel['ı'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 3, 10, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1306 */     this.gunModel['ı'].setRotationPoint(-39.0F, -38.0F, 3.0F);
/*      */     
/* 1308 */     this.gunModel['Ĳ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 20, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1309 */     this.gunModel['Ĳ'].setRotationPoint(-39.0F, -35.0F, -2.0F);
/*      */     
/* 1311 */     this.gunModel['ĳ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1312 */     this.gunModel['ĳ'].setRotationPoint(-39.0F, -27.0F, -2.0F);
/*      */     
/* 1314 */     this.gunModel['Ĵ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1315 */     this.gunModel['Ĵ'].setRotationPoint(-39.0F, -26.0F, -2.0F);
/*      */     
/* 1317 */     this.gunModel['ĵ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1318 */     this.gunModel['ĵ'].setRotationPoint(-37.5F, -26.0F, -2.0F);
/*      */     
/* 1320 */     this.gunModel['Ķ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1321 */     this.gunModel['Ķ'].setRotationPoint(-38.5F, -26.0F, -2.0F);
/*      */     
/* 1323 */     this.gunModel['ķ'].addShapeBox(55.0F, -23.0F, -8.0F, 33, 2, 16, 0.0F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 1324 */     this.gunModel['ķ'].setRotationPoint(-83.0F, -32.5F, 0.0F);
/*      */     
/* 1326 */     this.gunModel['ĸ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 16, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F);
/* 1327 */     this.gunModel['ĸ'].setRotationPoint(-85.0F, -31.5F, 0.0F);
/*      */     
/* 1329 */     this.gunModel['Ĺ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 16, 0.0F, -1.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, -1.0F, 0.0F, -1.4F, 0.0F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 1330 */     this.gunModel['Ĺ'].setRotationPoint(-85.0F, -32.5F, 0.0F);
/*      */     
/* 1332 */     this.gunModel['ĺ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1333 */     this.gunModel['ĺ'].setRotationPoint(-85.0F, -32.0F, 0.0F);
/*      */     
/* 1335 */     this.gunModel['Ļ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1336 */     this.gunModel['Ļ'].setRotationPoint(21.5F, -41.0F, 9.5F);
/*      */     
/* 1338 */     this.gunModel['ļ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1339 */     this.gunModel['ļ'].setRotationPoint(21.5F, -41.0F, 6.0F);
/*      */     
/* 1341 */     this.gunModel['Ľ'].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 5, 0.0F, 0.0F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1342 */     this.gunModel['Ľ'].setRotationPoint(113.25F, -26.5F, 5.5F);
/*      */     
/* 1344 */     this.gunModel['ľ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1345 */     this.gunModel['ľ'].setRotationPoint(111.25F, -28.25F, 4.5F);
/*      */     
/* 1347 */     this.gunModel['Ŀ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1348 */     this.gunModel['Ŀ'].setRotationPoint(110.25F, -28.25F, 4.5F);
/*      */     
/* 1350 */     this.gunModel['ŀ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1351 */     this.gunModel['ŀ'].setRotationPoint(110.25F, -29.25F, 4.5F);
/*      */     
/* 1353 */     this.gunModel['Ł'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1354 */     this.gunModel['Ł'].setRotationPoint(111.25F, -29.25F, 4.5F);
/*      */     
/* 1356 */     this.gunModel['ł'].addShapeBox(55.0F, -23.0F, -8.0F, 4, 2, 5, 0.0F, 0.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.75F, 1.75F, 0.0F, 0.75F, 1.75F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1357 */     this.gunModel['ł'].setRotationPoint(113.25F, -29.25F, 5.5F);
/*      */     
/* 1359 */     this.gunModel['Ń'].addShapeBox(55.0F, -23.0F, -8.0F, 6, 1, 5, 0.0F, 0.25F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 1.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1360 */     this.gunModel['Ń'].setRotationPoint(113.0F, -24.75F, 5.5F);
/*      */     
/* 1362 */     this.gunModel['ń'].addShapeBox(55.0F, -23.0F, -8.0F, 8, 1, 5, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1363 */     this.gunModel['ń'].setRotationPoint(112.25F, -23.75F, 5.5F);
/*      */     
/* 1365 */     this.gunModel['Ņ'].addShapeBox(55.0F, -23.0F, -8.0F, 4, 15, 16, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
/* 1366 */     this.gunModel['Ņ'].setRotationPoint(-96.0F, -20.75F, 0.0F);
/*      */     
/* 1368 */     this.gunModel['ņ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 9, 16, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 1369 */     this.gunModel['ņ'].setRotationPoint(-7.0F, -17.75F, 0.0F);
/*      */     
/* 1371 */     this.gunModel['Ň'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1372 */     this.gunModel['Ň'].setRotationPoint(-30.0F, -8.75F, 0.0F);
/*      */     
/* 1374 */     this.gunModel['ň'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 18, 0.0F, 0.0F, -3.0F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, -3.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1375 */     this.gunModel['ň'].setRotationPoint(-91.0F, -35.0F, -1.0F);
/*      */     
/* 1377 */     this.gunModel['ŉ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 5, 18, 0.0F, 0.0F, -2.5F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -2.5F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1378 */     this.gunModel['ŉ'].setRotationPoint(-92.0F, -32.0F, -1.0F);
/*      */     
/* 1380 */     this.gunModel['Ŋ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 8, 18, 0.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.gunModel['Ŋ'].setRotationPoint(-88.0F, -35.0F, -1.0F);
/*      */     
/* 1383 */     this.gunModel['ŋ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1384 */     this.gunModel['ŋ'].setRotationPoint(-84.5F, -35.5F, 6.5F);
/*      */     
/* 1386 */     this.gunModel['Ō'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1387 */     this.gunModel['Ō'].setRotationPoint(-86.5F, -35.5F, 6.5F);
/*      */     
/* 1389 */     this.gunModel['ō'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1390 */     this.gunModel['ō'].setRotationPoint(-85.5F, -35.5F, 6.5F);
/*      */     
/* 1392 */     this.gunModel['Ŏ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 8, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1393 */     this.gunModel['Ŏ'].setRotationPoint(-83.0F, -37.0F, 4.0F);
/*      */     
/* 1395 */     this.gunModel['ŏ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1396 */     this.gunModel['ŏ'].setRotationPoint(-90.0F, -27.0F, -1.0F);
/*      */     
/* 1398 */     this.gunModel['Ő'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1399 */     this.gunModel['Ő'].setRotationPoint(-92.0F, -27.0F, -1.0F);
/*      */     
/* 1401 */     this.gunModel['ő'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1402 */     this.gunModel['ő'].setRotationPoint(-92.0F, -27.0F, 0.5F);
/*      */     
/* 1404 */     this.gunModel['Œ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1405 */     this.gunModel['Œ'].setRotationPoint(-92.0F, -26.0F, 15.5F);
/*      */     
/* 1407 */     this.gunModel['œ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 1, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.gunModel['œ'].setRotationPoint(-91.0F, -26.75F, 15.5F);
/*      */     
/* 1410 */     this.gunModel['Ŕ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1411 */     this.gunModel['Ŕ'].setRotationPoint(-92.0F, -26.0F, -0.5F);
/*      */     
/* 1413 */     this.gunModel['ŕ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 1, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1414 */     this.gunModel['ŕ'].setRotationPoint(-91.0F, -26.75F, -0.5F);
/*      */     
/* 1416 */     this.gunModel['Ŗ'].addShapeBox(55.0F, -23.0F, -8.0F, 5, 6, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1417 */     this.gunModel['Ŗ'].setRotationPoint(-94.0F, -24.75F, 1.5F);
/*      */     
/* 1419 */     this.gunModel['ŗ'].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 16, 0.0F, 0.25F, 0.0F, -3.0F, -1.5F, 0.0F, -3.0F, -1.5F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.gunModel['ŗ'].setRotationPoint(-97.0F, -23.75F, 0.0F);
/*      */     
/* 1422 */     this.gunModel['Ř'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 12, 16, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F);
/* 1423 */     this.gunModel['Ř'].setRotationPoint(-93.0F, -17.75F, 0.0F);
/*      */     
/* 1425 */     this.gunModel['ř'].addShapeBox(55.0F, -23.0F, -8.0F, 55, 1, 13, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F);
/* 1426 */     this.gunModel['ř'].setRotationPoint(-93.0F, -25.0F, 1.5F);
/*      */     
/* 1428 */     this.gunModel['Ś'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1429 */     this.gunModel['Ś'].setRotationPoint(-92.5F, -22.0F, 1.0F);
/*      */     
/* 1431 */     this.gunModel['ś'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1432 */     this.gunModel['ś'].setRotationPoint(-92.5F, -23.0F, 1.0F);
/*      */     
/* 1434 */     this.gunModel['Ŝ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1435 */     this.gunModel['Ŝ'].setRotationPoint(-92.5F, -24.0F, 1.0F);
/*      */     
/* 1437 */     this.gunModel['ŝ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1438 */     this.gunModel['ŝ'].setRotationPoint(-63.0F, -9.0F, 0.5F);
/*      */     
/* 1440 */     this.gunModel['Ş'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1441 */     this.gunModel['Ş'].setRotationPoint(-63.0F, -10.0F, 0.5F);
/*      */     
/* 1443 */     this.gunModel['ş'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 15, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1444 */     this.gunModel['ş'].setRotationPoint(-63.0F, -11.0F, 0.5F);
/*      */     
/* 1446 */     this.gunModel['Š'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1447 */     this.gunModel['Š'].setRotationPoint(109.25F, -33.25F, 4.5F);
/*      */     
/* 1449 */     this.gunModel['š'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 1450 */     this.gunModel['š'].setRotationPoint(111.25F, -29.25F, 9.5F);
/*      */     
/* 1452 */     this.gunModel['Ţ'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 2, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 1453 */     this.gunModel['Ţ'].setRotationPoint(110.25F, -29.25F, 9.5F);
/*      */     
/* 1455 */     this.gunModel['ţ'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1456 */     this.gunModel['ţ'].setRotationPoint(185.25F, -42.25F, 4.0F);
/*      */     
/* 1458 */     this.gunModel['Ť'].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1459 */     this.gunModel['Ť'].setRotationPoint(185.25F, -42.25F, 10.0F);
/*      */     
/* 1461 */     this.gunModel['ť'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 15, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F);
/* 1462 */     this.gunModel['ť'].setRotationPoint(-49.5F, -9.25F, 0.5F);
/*      */     
/* 1464 */     this.gunModel['Ŧ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 15, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F);
/* 1465 */     this.gunModel['Ŧ'].setRotationPoint(-49.5F, -8.75F, 0.5F);
/*      */     
/* 1467 */     this.gunModel['ŧ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 15, 0.0F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F);
/* 1468 */     this.gunModel['ŧ'].setRotationPoint(-49.5F, -9.75F, 0.5F);
/*      */     
/* 1470 */     this.gunModel['Ũ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 16, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F);
/* 1471 */     this.gunModel['Ũ'].setRotationPoint(-26.5F, -9.25F, 0.0F);
/*      */     
/* 1473 */     this.gunModel['ũ'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 16, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F);
/* 1474 */     this.gunModel['ũ'].setRotationPoint(-26.5F, -8.75F, 0.0F);
/*      */     
/* 1476 */     this.gunModel['Ū'].addShapeBox(55.0F, -23.0F, -8.0F, 2, 1, 16, 0.0F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F);
/* 1477 */     this.gunModel['Ū'].setRotationPoint(-26.5F, -9.75F, 0.0F);
/*      */     
/* 1479 */     this.gunModel['ū'].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 2, 0.0F, 0.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F);
/* 1480 */     this.gunModel['ū'].setRotationPoint(-71.0F, -12.5F, 0.5F);
/*      */     
/* 1482 */     this.gunModel['Ŭ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 1483 */     this.gunModel['Ŭ'].setRotationPoint(-69.0F, -11.0F, 0.5F);
/*      */     
/* 1485 */     this.gunModel['ŭ'].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1486 */     this.gunModel['ŭ'].setRotationPoint(-69.0F, -14.0F, 0.5F);
/*      */     
/* 1488 */     this.gunModel['Ů'].addShapeBox(55.0F, -23.0F, -8.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1489 */     this.gunModel['Ů'].setRotationPoint(-72.25F, -12.5F, 0.5F);
/*      */     
/*      */ 
/* 1492 */     this.ammoModel = new ModelRendererTurbo[94];
/* 1493 */     this.ammoModel[0] = new ModelRendererTurbo(this, 993, 217, this.textureX, this.textureY);
/* 1494 */     this.ammoModel[1] = new ModelRendererTurbo(this, 641, 233, this.textureX, this.textureY);
/* 1495 */     this.ammoModel[2] = new ModelRendererTurbo(this, 865, 129, this.textureX, this.textureY);
/* 1496 */     this.ammoModel[3] = new ModelRendererTurbo(this, 513, 241, this.textureX, this.textureY);
/* 1497 */     this.ammoModel[4] = new ModelRendererTurbo(this, 993, 257, this.textureX, this.textureY);
/* 1498 */     this.ammoModel[5] = new ModelRendererTurbo(this, 33, 249, this.textureX, this.textureY);
/* 1499 */     this.ammoModel[6] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 1500 */     this.ammoModel[7] = new ModelRendererTurbo(this, 33, 273, this.textureX, this.textureY);
/* 1501 */     this.ammoModel[8] = new ModelRendererTurbo(this, 257, 257, this.textureX, this.textureY);
/* 1502 */     this.ammoModel[9] = new ModelRendererTurbo(this, 617, 265, this.textureX, this.textureY);
/* 1503 */     this.ammoModel[10] = new ModelRendererTurbo(this, 65, 273, this.textureX, this.textureY);
/* 1504 */     this.ammoModel[11] = new ModelRendererTurbo(this, 513, 273, this.textureX, this.textureY);
/* 1505 */     this.ammoModel[12] = new ModelRendererTurbo(this, 697, 273, this.textureX, this.textureY);
/* 1506 */     this.ammoModel[13] = new ModelRendererTurbo(this, 729, 273, this.textureX, this.textureY);
/* 1507 */     this.ammoModel[14] = new ModelRendererTurbo(this, 761, 273, this.textureX, this.textureY);
/* 1508 */     this.ammoModel[15] = new ModelRendererTurbo(this, 793, 273, this.textureX, this.textureY);
/* 1509 */     this.ammoModel[16] = new ModelRendererTurbo(this, 89, 281, this.textureX, this.textureY);
/* 1510 */     this.ammoModel[17] = new ModelRendererTurbo(this, 257, 281, this.textureX, this.textureY);
/* 1511 */     this.ammoModel[18] = new ModelRendererTurbo(this, 537, 281, this.textureX, this.textureY);
/* 1512 */     this.ammoModel[19] = new ModelRendererTurbo(this, 289, 281, this.textureX, this.textureY);
/* 1513 */     this.ammoModel[20] = new ModelRendererTurbo(this, 577, 281, this.textureX, this.textureY);
/* 1514 */     this.ammoModel[21] = new ModelRendererTurbo(this, 641, 281, this.textureX, this.textureY);
/* 1515 */     this.ammoModel[22] = new ModelRendererTurbo(this, 825, 281, this.textureX, this.textureY);
/* 1516 */     this.ammoModel[23] = new ModelRendererTurbo(this, 857, 281, this.textureX, this.textureY);
/* 1517 */     this.ammoModel[24] = new ModelRendererTurbo(this, 889, 281, this.textureX, this.textureY);
/* 1518 */     this.ammoModel[25] = new ModelRendererTurbo(this, 921, 281, this.textureX, this.textureY);
/* 1519 */     this.ammoModel[26] = new ModelRendererTurbo(this, 953, 281, this.textureX, this.textureY);
/* 1520 */     this.ammoModel[27] = new ModelRendererTurbo(this, 121, 289, this.textureX, this.textureY);
/* 1521 */     this.ammoModel[28] = new ModelRendererTurbo(this, 1001, 121, this.textureX, this.textureY);
/* 1522 */     this.ammoModel[29] = new ModelRendererTurbo(this, 297, 257, this.textureX, this.textureY);
/* 1523 */     this.ammoModel[30] = new ModelRendererTurbo(this, 905, 129, this.textureX, this.textureY);
/* 1524 */     this.ammoModel[31] = new ModelRendererTurbo(this, 169, 281, this.textureX, this.textureY);
/* 1525 */     this.ammoModel[32] = new ModelRendererTurbo(this, 673, 281, this.textureX, this.textureY);
/* 1526 */     this.ammoModel[33] = new ModelRendererTurbo(this, 985, 281, this.textureX, this.textureY);
/* 1527 */     this.ammoModel[34] = new ModelRendererTurbo(this, 193, 289, this.textureX, this.textureY);
/* 1528 */     this.ammoModel[35] = new ModelRendererTurbo(this, 217, 289, this.textureX, this.textureY);
/* 1529 */     this.ammoModel[36] = new ModelRendererTurbo(this, 313, 289, this.textureX, this.textureY);
/* 1530 */     this.ammoModel[37] = new ModelRendererTurbo(this, 353, 289, this.textureX, this.textureY);
/* 1531 */     this.ammoModel[38] = new ModelRendererTurbo(this, 425, 289, this.textureX, this.textureY);
/* 1532 */     this.ammoModel[39] = new ModelRendererTurbo(this, 465, 289, this.textureX, this.textureY);
/* 1533 */     this.ammoModel[40] = new ModelRendererTurbo(this, 601, 289, this.textureX, this.textureY);
/* 1534 */     this.ammoModel[41] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/* 1535 */     this.ammoModel[42] = new ModelRendererTurbo(this, 41, 297, this.textureX, this.textureY);
/* 1536 */     this.ammoModel[43] = new ModelRendererTurbo(this, 393, 297, this.textureX, this.textureY);
/* 1537 */     this.ammoModel[44] = new ModelRendererTurbo(this, 505, 297, this.textureX, this.textureY);
/* 1538 */     this.ammoModel[45] = new ModelRendererTurbo(this, 689, 297, this.textureX, this.textureY);
/* 1539 */     this.ammoModel[46] = new ModelRendererTurbo(this, 753, 297, this.textureX, this.textureY);
/* 1540 */     this.ammoModel[47] = new ModelRendererTurbo(this, 337, 257, this.textureX, this.textureY);
/* 1541 */     this.ammoModel[48] = new ModelRendererTurbo(this, 65, 305, this.textureX, this.textureY);
/* 1542 */     this.ammoModel[49] = new ModelRendererTurbo(this, 233, 305, this.textureX, this.textureY);
/* 1543 */     this.ammoModel[50] = new ModelRendererTurbo(this, 273, 305, this.textureX, this.textureY);
/* 1544 */     this.ammoModel[51] = new ModelRendererTurbo(this, 537, 305, this.textureX, this.textureY);
/* 1545 */     this.ammoModel[52] = new ModelRendererTurbo(this, 577, 305, this.textureX, this.textureY);
/* 1546 */     this.ammoModel[53] = new ModelRendererTurbo(this, 633, 305, this.textureX, this.textureY);
/* 1547 */     this.ammoModel[54] = new ModelRendererTurbo(this, 721, 305, this.textureX, this.textureY);
/* 1548 */     this.ammoModel[55] = new ModelRendererTurbo(this, 785, 305, this.textureX, this.textureY);
/* 1549 */     this.ammoModel[56] = new ModelRendererTurbo(this, 849, 305, this.textureX, this.textureY);
/* 1550 */     this.ammoModel[57] = new ModelRendererTurbo(this, 945, 305, this.textureX, this.textureY);
/* 1551 */     this.ammoModel[58] = new ModelRendererTurbo(this, 977, 305, this.textureX, this.textureY);
/* 1552 */     this.ammoModel[59] = new ModelRendererTurbo(this, 25, 313, this.textureX, this.textureY);
/* 1553 */     this.ammoModel[60] = new ModelRendererTurbo(this, 89, 313, this.textureX, this.textureY);
/* 1554 */     this.ammoModel[61] = new ModelRendererTurbo(this, 169, 313, this.textureX, this.textureY);
/* 1555 */     this.ammoModel[62] = new ModelRendererTurbo(this, 313, 313, this.textureX, this.textureY);
/* 1556 */     this.ammoModel[63] = new ModelRendererTurbo(this, 353, 313, this.textureX, this.textureY);
/* 1557 */     this.ammoModel[64] = new ModelRendererTurbo(this, 809, 313, this.textureX, this.textureY);
/* 1558 */     this.ammoModel[65] = new ModelRendererTurbo(this, 881, 313, this.textureX, this.textureY);
/* 1559 */     this.ammoModel[66] = new ModelRendererTurbo(this, 913, 209, this.textureX, this.textureY);
/* 1560 */     this.ammoModel[67] = new ModelRendererTurbo(this, 665, 313, this.textureX, this.textureY);
/* 1561 */     this.ammoModel[68] = new ModelRendererTurbo(this, 121, 321, this.textureX, this.textureY);
/* 1562 */     this.ammoModel[69] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/* 1563 */     this.ammoModel[70] = new ModelRendererTurbo(this, 393, 321, this.textureX, this.textureY);
/* 1564 */     this.ammoModel[71] = new ModelRendererTurbo(this, 441, 321, this.textureX, this.textureY);
/* 1565 */     this.ammoModel[72] = new ModelRendererTurbo(this, 41, 321, this.textureX, this.textureY);
/* 1566 */     this.ammoModel[73] = new ModelRendererTurbo(this, 825, 129, this.textureX, this.textureY);
/* 1567 */     this.ammoModel[74] = new ModelRendererTurbo(this, 209, 257, this.textureX, this.textureY);
/* 1568 */     this.ammoModel[75] = new ModelRendererTurbo(this, 489, 321, this.textureX, this.textureY);
/* 1569 */     this.ammoModel[76] = new ModelRendererTurbo(this, 745, 321, this.textureX, this.textureY);
/* 1570 */     this.ammoModel[77] = new ModelRendererTurbo(this, 209, 321, this.textureX, this.textureY);
/* 1571 */     this.ammoModel[78] = new ModelRendererTurbo(this, 601, 321, this.textureX, this.textureY);
/* 1572 */     this.ammoModel[79] = new ModelRendererTurbo(this, 681, 321, this.textureX, this.textureY);
/* 1573 */     this.ammoModel[80] = new ModelRendererTurbo(this, 905, 321, this.textureX, this.textureY);
/* 1574 */     this.ammoModel[81] = new ModelRendererTurbo(this, 65, 329, this.textureX, this.textureY);
/* 1575 */     this.ammoModel[82] = new ModelRendererTurbo(this, 225, 329, this.textureX, this.textureY);
/* 1576 */     this.ammoModel[83] = new ModelRendererTurbo(this, 625, 329, this.textureX, this.textureY);
/* 1577 */     this.ammoModel[84] = new ModelRendererTurbo(this, 833, 329, this.textureX, this.textureY);
/* 1578 */     this.ammoModel[85] = new ModelRendererTurbo(this, 945, 329, this.textureX, this.textureY);
/* 1579 */     this.ammoModel[86] = new ModelRendererTurbo(this, 985, 329, this.textureX, this.textureY);
/* 1580 */     this.ammoModel[87] = new ModelRendererTurbo(this, 1, 337, this.textureX, this.textureY);
/* 1581 */     this.ammoModel[88] = new ModelRendererTurbo(this, 153, 337, this.textureX, this.textureY);
/* 1582 */     this.ammoModel[89] = new ModelRendererTurbo(this, 265, 337, this.textureX, this.textureY);
/* 1583 */     this.ammoModel[90] = new ModelRendererTurbo(this, 425, 337, this.textureX, this.textureY);
/* 1584 */     this.ammoModel[91] = new ModelRendererTurbo(this, 465, 337, this.textureX, this.textureY);
/* 1585 */     this.ammoModel[92] = new ModelRendererTurbo(this, 537, 337, this.textureX, this.textureY);
/* 1586 */     this.ammoModel[93] = new ModelRendererTurbo(this, 577, 337, this.textureX, this.textureY);
/*      */     
/* 1588 */     this.ammoModel[0].addShapeBox(55.0F, -23.0F, -8.0F, 4, 10, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1589 */     this.ammoModel[0].setRotationPoint(-24.0F, -8.75F, 3.5F);
/*      */     
/* 1591 */     this.ammoModel[1].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1592 */     this.ammoModel[1].setRotationPoint(-24.0F, 1.25F, 3.5F);
/*      */     
/* 1594 */     this.ammoModel[2].addShapeBox(55.0F, -23.0F, -8.0F, 4, 6, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1595 */     this.ammoModel[2].setRotationPoint(-23.5F, 8.25F, 3.5F);
/*      */     
/* 1597 */     this.ammoModel[3].addShapeBox(55.0F, -23.0F, -8.0F, 4, 9, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 1598 */     this.ammoModel[3].setRotationPoint(-22.0F, 14.25F, 3.5F);
/*      */     
/* 1600 */     this.ammoModel[4].addShapeBox(55.0F, -23.0F, -8.0F, 4, 13, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1601 */     this.ammoModel[4].setRotationPoint(-19.0F, 23.25F, 3.5F);
/*      */     
/* 1603 */     this.ammoModel[5].addShapeBox(55.0F, -23.0F, -8.0F, 4, 10, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1604 */     this.ammoModel[5].setRotationPoint(-13.5F, 36.25F, 3.5F);
/*      */     
/* 1606 */     this.ammoModel[6].addShapeBox(55.0F, -23.0F, -8.0F, 4, 13, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F);
/* 1607 */     this.ammoModel[6].setRotationPoint(-8.0F, 46.25F, 3.5F);
/*      */     
/* 1609 */     this.ammoModel[7].addShapeBox(55.0F, -23.0F, -8.0F, 4, 13, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F);
/* 1610 */     this.ammoModel[7].setRotationPoint(1.5F, 59.25F, 3.5F);
/*      */     
/* 1612 */     this.ammoModel[8].addShapeBox(55.0F, -23.0F, -8.0F, 4, 8, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F);
/* 1613 */     this.ammoModel[8].setRotationPoint(14.0F, 72.25F, 3.5F);
/*      */     
/* 1615 */     this.ammoModel[9].addShapeBox(55.0F, -23.0F, -8.0F, 3, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1616 */     this.ammoModel[9].setRotationPoint(-20.0F, -8.75F, 2.0F);
/*      */     
/* 1618 */     this.ammoModel[10].addShapeBox(55.0F, -23.0F, -8.0F, 3, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1619 */     this.ammoModel[10].setRotationPoint(-20.0F, 1.25F, 2.0F);
/*      */     
/* 1621 */     this.ammoModel[11].addShapeBox(55.0F, -23.0F, -8.0F, 3, 6, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1622 */     this.ammoModel[11].setRotationPoint(-19.5F, 8.25F, 2.0F);
/*      */     
/* 1624 */     this.ammoModel[12].addShapeBox(55.0F, -23.0F, -8.0F, 3, 9, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 1625 */     this.ammoModel[12].setRotationPoint(-18.0F, 14.25F, 2.0F);
/*      */     
/* 1627 */     this.ammoModel[13].addShapeBox(55.0F, -23.0F, -8.0F, 3, 13, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1628 */     this.ammoModel[13].setRotationPoint(-15.0F, 23.25F, 2.0F);
/*      */     
/* 1630 */     this.ammoModel[14].addShapeBox(55.0F, -23.0F, -8.0F, 3, 10, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1631 */     this.ammoModel[14].setRotationPoint(-9.5F, 36.25F, 2.0F);
/*      */     
/* 1633 */     this.ammoModel[15].addShapeBox(55.0F, -23.0F, -8.0F, 3, 13, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F);
/* 1634 */     this.ammoModel[15].setRotationPoint(-4.0F, 46.25F, 2.0F);
/*      */     
/* 1636 */     this.ammoModel[16].addShapeBox(55.0F, -23.0F, -8.0F, 3, 13, 12, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F);
/* 1637 */     this.ammoModel[16].setRotationPoint(5.5F, 59.25F, 2.0F);
/*      */     
/* 1639 */     this.ammoModel[17].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 12, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 13.0F, -4.0F, 0.0F, 13.0F, -4.0F, 0.0F, -11.0F, 0.0F, 0.0F);
/* 1640 */     this.ammoModel[17].setRotationPoint(18.0F, 72.25F, 2.0F);
/*      */     
/* 1642 */     this.ammoModel[18].addShapeBox(55.0F, -23.0F, -8.0F, 6, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1643 */     this.ammoModel[18].setRotationPoint(-15.0F, -8.75F, 2.0F);
/*      */     
/* 1645 */     this.ammoModel[19].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1646 */     this.ammoModel[19].setRotationPoint(-15.0F, 1.25F, 2.0F);
/*      */     
/* 1648 */     this.ammoModel[20].addShapeBox(55.0F, -23.0F, -8.0F, 3, 6, 12, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1649 */     this.ammoModel[20].setRotationPoint(-14.5F, 8.25F, 2.0F);
/*      */     
/* 1651 */     this.ammoModel[21].addShapeBox(55.0F, -23.0F, -8.0F, 3, 9, 12, 0.0F, -0.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 1652 */     this.ammoModel[21].setRotationPoint(-13.0F, 14.25F, 2.0F);
/*      */     
/* 1654 */     this.ammoModel[22].addShapeBox(55.0F, -23.0F, -8.0F, 3, 13, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1655 */     this.ammoModel[22].setRotationPoint(-10.0F, 23.25F, 2.0F);
/*      */     
/* 1657 */     this.ammoModel[23].addShapeBox(55.0F, -23.0F, -8.0F, 3, 10, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1658 */     this.ammoModel[23].setRotationPoint(-4.5F, 36.25F, 2.0F);
/*      */     
/* 1660 */     this.ammoModel[24].addShapeBox(55.0F, -23.0F, -8.0F, 3, 13, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.5F, 0.0F, 0.0F, 11.5F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F);
/* 1661 */     this.ammoModel[24].setRotationPoint(1.0F, 46.25F, 2.0F);
/*      */     
/* 1663 */     this.ammoModel[25].addShapeBox(55.0F, -23.0F, -8.0F, 3, 13, 12, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F);
/* 1664 */     this.ammoModel[25].setRotationPoint(10.5F, 59.25F, 2.0F);
/*      */     
/* 1666 */     this.ammoModel[26].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 12, 0.0F, -0.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -11.0F, -4.0F, 0.0F, 11.0F, -8.0F, 0.0F, 11.0F, -8.0F, 0.0F, -11.0F, -4.0F, 0.0F);
/* 1667 */     this.ammoModel[26].setRotationPoint(23.0F, 72.25F, 2.0F);
/*      */     
/* 1669 */     this.ammoModel[27].addShapeBox(55.0F, -23.0F, -8.0F, 16, 17, 12, 0.0F, -12.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1670 */     this.ammoModel[27].setRotationPoint(30.5F, 55.25F, 2.0F);
/*      */     
/* 1672 */     this.ammoModel[28].addShapeBox(55.0F, -23.0F, -8.0F, 2, 10, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1673 */     this.ammoModel[28].setRotationPoint(-17.0F, -8.75F, 3.5F);
/*      */     
/* 1675 */     this.ammoModel[29].addShapeBox(55.0F, -23.0F, -8.0F, 2, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1676 */     this.ammoModel[29].setRotationPoint(-17.0F, 1.25F, 3.5F);
/*      */     
/* 1678 */     this.ammoModel[30].addShapeBox(55.0F, -23.0F, -8.0F, 2, 6, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1679 */     this.ammoModel[30].setRotationPoint(-16.5F, 8.25F, 3.5F);
/*      */     
/* 1681 */     this.ammoModel[31].addShapeBox(55.0F, -23.0F, -8.0F, 2, 9, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 1682 */     this.ammoModel[31].setRotationPoint(-15.0F, 14.25F, 3.5F);
/*      */     
/* 1684 */     this.ammoModel[32].addShapeBox(55.0F, -23.0F, -8.0F, 2, 13, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1685 */     this.ammoModel[32].setRotationPoint(-12.0F, 23.25F, 3.5F);
/*      */     
/* 1687 */     this.ammoModel[33].addShapeBox(55.0F, -23.0F, -8.0F, 2, 10, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 1688 */     this.ammoModel[33].setRotationPoint(-6.5F, 36.25F, 3.5F);
/*      */     
/* 1690 */     this.ammoModel[34].addShapeBox(55.0F, -23.0F, -8.0F, 2, 13, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 11.5F, 0.0F, 0.0F, 11.5F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F);
/* 1691 */     this.ammoModel[34].setRotationPoint(-1.0F, 46.25F, 3.5F);
/*      */     
/* 1693 */     this.ammoModel[35].addShapeBox(55.0F, -23.0F, -8.0F, 2, 13, 9, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 15.5F, 0.0F, 0.0F, 15.5F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F);
/* 1694 */     this.ammoModel[35].setRotationPoint(8.5F, 59.25F, 3.5F);
/*      */     
/* 1696 */     this.ammoModel[36].addShapeBox(55.0F, -23.0F, -8.0F, 6, 7, 12, 0.0F, 11.5F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 1697 */     this.ammoModel[36].setRotationPoint(43.0F, 48.25F, 2.0F);
/*      */     
/* 1699 */     this.ammoModel[37].addShapeBox(55.0F, -23.0F, -8.0F, 6, 9, 12, 0.0F, 8.5F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1700 */     this.ammoModel[37].setRotationPoint(31.5F, 39.25F, 2.0F);
/*      */     
/* 1702 */     this.ammoModel[38].addShapeBox(55.0F, -23.0F, -8.0F, 6, 12, 12, 0.0F, 8.0F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1703 */     this.ammoModel[38].setRotationPoint(22.5F, 27.25F, 2.0F);
/*      */     
/* 1705 */     this.ammoModel[39].addShapeBox(55.0F, -23.0F, -8.0F, 6, 14, 12, 0.0F, 5.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1706 */     this.ammoModel[39].setRotationPoint(13.5F, 13.25F, 2.0F);
/*      */     
/* 1708 */     this.ammoModel[40].addShapeBox(55.0F, -23.0F, -8.0F, 6, 14, 12, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1709 */     this.ammoModel[40].setRotationPoint(6.5F, -0.75F, 2.0F);
/*      */     
/* 1711 */     this.ammoModel[41].addShapeBox(55.0F, -23.0F, -8.0F, 4, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1712 */     this.ammoModel[41].setRotationPoint(5.5F, -8.75F, 2.0F);
/*      */     
/* 1714 */     this.ammoModel[42].addShapeBox(55.0F, -23.0F, -8.0F, 5, 7, 9, 0.0F, 11.5F, 0.0F, 0.0F, -13.5F, 0.0F, 0.0F, -13.5F, 0.0F, 0.0F, 11.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F);
/* 1715 */     this.ammoModel[42].setRotationPoint(40.0F, 48.25F, 3.5F);
/*      */     
/* 1717 */     this.ammoModel[43].addShapeBox(55.0F, -23.0F, -8.0F, 5, 9, 9, 0.0F, 8.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1718 */     this.ammoModel[43].setRotationPoint(28.5F, 39.25F, 3.5F);
/*      */     
/* 1720 */     this.ammoModel[44].addShapeBox(55.0F, -23.0F, -8.0F, 5, 12, 9, 0.0F, 8.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1721 */     this.ammoModel[44].setRotationPoint(19.5F, 27.25F, 3.5F);
/*      */     
/* 1723 */     this.ammoModel[45].addShapeBox(55.0F, -23.0F, -8.0F, 5, 14, 9, 0.0F, 5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1724 */     this.ammoModel[45].setRotationPoint(10.5F, 13.25F, 3.5F);
/*      */     
/* 1726 */     this.ammoModel[46].addShapeBox(55.0F, -23.0F, -8.0F, 5, 14, 9, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1727 */     this.ammoModel[46].setRotationPoint(3.5F, -0.75F, 3.5F);
/*      */     
/* 1729 */     this.ammoModel[47].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1730 */     this.ammoModel[47].setRotationPoint(2.5F, -8.75F, 3.5F);
/*      */     
/* 1732 */     this.ammoModel[48].addShapeBox(55.0F, -23.0F, -8.0F, 5, 7, 12, 0.0F, 12.5F, 0.0F, 0.0F, -13.5F, 0.0F, 0.0F, -13.5F, 0.0F, 0.0F, 12.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F);
/* 1733 */     this.ammoModel[48].setRotationPoint(37.0F, 48.25F, 2.0F);
/*      */     
/* 1735 */     this.ammoModel[49].addShapeBox(55.0F, -23.0F, -8.0F, 5, 9, 12, 0.0F, 8.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1736 */     this.ammoModel[49].setRotationPoint(25.5F, 39.25F, 2.0F);
/*      */     
/* 1738 */     this.ammoModel[50].addShapeBox(55.0F, -23.0F, -8.0F, 5, 12, 12, 0.0F, 8.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1739 */     this.ammoModel[50].setRotationPoint(16.5F, 27.25F, 2.0F);
/*      */     
/* 1741 */     this.ammoModel[51].addShapeBox(55.0F, -23.0F, -8.0F, 5, 14, 12, 0.0F, 5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1742 */     this.ammoModel[51].setRotationPoint(7.5F, 13.25F, 2.0F);
/*      */     
/* 1744 */     this.ammoModel[52].addShapeBox(55.0F, -23.0F, -8.0F, 5, 14, 12, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1745 */     this.ammoModel[52].setRotationPoint(0.5F, -0.75F, 2.0F);
/*      */     
/* 1747 */     this.ammoModel[53].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1748 */     this.ammoModel[53].setRotationPoint(-0.5F, -8.75F, 2.0F);
/*      */     
/* 1750 */     this.ammoModel[54].addShapeBox(55.0F, -23.0F, -8.0F, 5, 7, 9, 0.0F, 14.0F, 0.0F, 0.0F, -14.5F, 0.0F, 0.0F, -14.5F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/* 1751 */     this.ammoModel[54].setRotationPoint(34.0F, 48.25F, 3.5F);
/*      */     
/* 1753 */     this.ammoModel[55].addShapeBox(55.0F, -23.0F, -8.0F, 5, 9, 9, 0.0F, 9.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 9.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 1754 */     this.ammoModel[55].setRotationPoint(22.5F, 39.25F, 3.5F);
/*      */     
/* 1756 */     this.ammoModel[56].addShapeBox(55.0F, -23.0F, -8.0F, 5, 12, 9, 0.0F, 8.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1757 */     this.ammoModel[56].setRotationPoint(13.5F, 27.25F, 3.5F);
/*      */     
/* 1759 */     this.ammoModel[57].addShapeBox(55.0F, -23.0F, -8.0F, 5, 14, 9, 0.0F, 5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1760 */     this.ammoModel[57].setRotationPoint(4.5F, 13.25F, 3.5F);
/*      */     
/* 1762 */     this.ammoModel[58].addShapeBox(55.0F, -23.0F, -8.0F, 5, 14, 9, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1763 */     this.ammoModel[58].setRotationPoint(-2.5F, -0.75F, 3.5F);
/*      */     
/* 1765 */     this.ammoModel[59].addShapeBox(55.0F, -23.0F, -8.0F, 3, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1766 */     this.ammoModel[59].setRotationPoint(-3.5F, -8.75F, 3.5F);
/*      */     
/* 1768 */     this.ammoModel[60].addShapeBox(55.0F, -23.0F, -8.0F, 8, 7, 12, 0.0F, 19.8F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 19.8F, 0.0F, 0.0F, 13.9F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 13.9F, 0.0F, 0.0F);
/* 1769 */     this.ammoModel[60].setRotationPoint(26.0F, 48.25F, 2.0F);
/*      */     
/* 1771 */     this.ammoModel[61].addShapeBox(55.0F, -23.0F, -8.0F, 7, 9, 12, 0.0F, 8.35F, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F, 8.35F, 0.0F, 0.0F, 8.35F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 8.35F, 0.0F, 0.0F);
/* 1772 */     this.ammoModel[61].setRotationPoint(15.5F, 39.25F, 2.0F);
/*      */     
/* 1774 */     this.ammoModel[62].addShapeBox(55.0F, -23.0F, -8.0F, 4, 12, 12, 0.0F, 8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F);
/* 1775 */     this.ammoModel[62].setRotationPoint(9.5F, 27.25F, 2.0F);
/*      */     
/* 1777 */     this.ammoModel[63].addShapeBox(55.0F, -23.0F, -8.0F, 5, 14, 12, 0.0F, 4.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1778 */     this.ammoModel[63].setRotationPoint(-0.5F, 13.25F, 2.0F);
/*      */     
/* 1780 */     this.ammoModel[64].addShapeBox(55.0F, -23.0F, -8.0F, 6, 14, 12, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1781 */     this.ammoModel[64].setRotationPoint(-8.5F, -0.75F, 2.0F);
/*      */     
/* 1783 */     this.ammoModel[65].addShapeBox(55.0F, -23.0F, -8.0F, 6, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1784 */     this.ammoModel[65].setRotationPoint(-9.5F, -8.75F, 2.0F);
/*      */     
/* 1786 */     this.ammoModel[66].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1787 */     this.ammoModel[66].setRotationPoint(-9.5F, 13.25F, 2.0F);
/*      */     
/* 1789 */     this.ammoModel[67].addShapeBox(55.0F, -23.0F, -8.0F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F);
/* 1790 */     this.ammoModel[67].setRotationPoint(-6.5F, 23.25F, 2.0F);
/*      */     
/* 1792 */     this.ammoModel[68].addShapeBox(55.0F, -23.0F, -8.0F, 7, 9, 12, 0.0F, -0.05F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F);
/* 1793 */     this.ammoModel[68].setRotationPoint(-4.85F, 27.25F, 2.0F);
/*      */     
/* 1795 */     this.ammoModel[69].addShapeBox(55.0F, -23.0F, -8.0F, 5, 3, 12, 0.0F, -1.85F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 1796 */     this.ammoModel[69].setRotationPoint(-2.85F, 36.25F, 2.0F);
/*      */     
/* 1798 */     this.ammoModel[70].addShapeBox(55.0F, -23.0F, -8.0F, 9, 7, 12, 0.0F, -1.85F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -5.7F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -5.7F, 0.0F, 0.0F);
/* 1799 */     this.ammoModel[70].setRotationPoint(-1.2F, 39.25F, 2.0F);
/*      */     
/* 1801 */     this.ammoModel[71].addShapeBox(55.0F, -23.0F, -8.0F, 8, 2, 12, 0.0F, -4.7F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -4.7F, 0.0F, 0.0F, -6.4F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -6.4F, 0.0F, 0.0F);
/* 1802 */     this.ammoModel[71].setRotationPoint(-0.2F, 46.25F, 2.0F);
/*      */     
/* 1804 */     this.ammoModel[72].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.1F, 0.0F, 5.0F, -4.1F, 0.0F, 5.0F, -4.1F, 0.0F, -6.0F, 0.1F, 0.0F);
/* 1805 */     this.ammoModel[72].setRotationPoint(31.5F, 55.25F, 2.0F);
/*      */     
/* 1807 */     this.ammoModel[73].addShapeBox(55.0F, -23.0F, -8.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/* 1808 */     this.ammoModel[73].setRotationPoint(40.5F, 55.25F, 2.0F);
/*      */     
/* 1810 */     this.ammoModel[74].addShapeBox(55.0F, -23.0F, -8.0F, 7, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1811 */     this.ammoModel[74].setRotationPoint(35.0F, 55.25F, 3.5F);
/*      */     
/* 1813 */     this.ammoModel[75].addShapeBox(55.0F, -23.0F, -8.0F, 15, 4, 12, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.85F, 0.0F, 0.0F, 3.85F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 1814 */     this.ammoModel[75].setRotationPoint(12.0F, 55.25F, 2.0F);
/*      */     
/* 1816 */     this.ammoModel[76].addShapeBox(55.0F, -23.0F, -8.0F, 13, 13, 12, 0.0F, 17.0F, 0.0F, 0.0F, -14.65F, 0.0F, 0.0F, -14.65F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -9.5F, -7.75F, 0.0F, -9.5F, -7.75F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1817 */     this.ammoModel[76].setRotationPoint(32.5F, 59.25F, 2.0F);
/*      */     
/* 1819 */     this.ammoModel[77].addShapeBox(55.0F, -23.0F, -8.0F, 5, 10, 9, 0.0F, 14.0F, 0.0F, 0.0F, -14.5F, 0.0F, 0.0F, -14.5F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/* 1820 */     this.ammoModel[77].setRotationPoint(41.0F, 55.25F, 3.5F);
/*      */     
/* 1822 */     this.ammoModel[78].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 14, 0.0F, 12.5F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 12.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F);
/* 1823 */     this.ammoModel[78].setRotationPoint(25.5F, 48.25F, 1.0F);
/*      */     
/* 1825 */     this.ammoModel[79].addShapeBox(55.0F, -23.0F, -8.0F, 4, 9, 14, 0.0F, 8.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1826 */     this.ammoModel[79].setRotationPoint(15.0F, 39.25F, 1.0F);
/*      */     
/* 1828 */     this.ammoModel[80].addShapeBox(55.0F, -23.0F, -8.0F, 4, 12, 14, 0.0F, 8.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1829 */     this.ammoModel[80].setRotationPoint(7.0F, 27.25F, 1.0F);
/*      */     
/* 1831 */     this.ammoModel[81].addShapeBox(55.0F, -23.0F, -8.0F, 4, 14, 14, 0.0F, 5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1832 */     this.ammoModel[81].setRotationPoint(-2.0F, 13.25F, 1.0F);
/*      */     
/* 1834 */     this.ammoModel[82].addShapeBox(55.0F, -23.0F, -8.0F, 4, 14, 14, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1835 */     this.ammoModel[82].setRotationPoint(-9.0F, -0.75F, 1.0F);
/*      */     
/* 1837 */     this.ammoModel[83].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1838 */     this.ammoModel[83].setRotationPoint(-10.0F, -8.75F, 1.0F);
/*      */     
/* 1840 */     this.ammoModel[84].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 14, 0.0F, 12.5F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 12.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F);
/* 1841 */     this.ammoModel[84].setRotationPoint(31.5F, 55.25F, 1.0F);
/*      */     
/* 1843 */     this.ammoModel[85].addShapeBox(55.0F, -23.0F, -8.0F, 4, 6, 14, 0.0F, 12.5F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 12.5F, 0.0F, 0.0F, 4.5F, 1.0F, 0.0F, -8.0F, -2.0F, 0.0F, -8.0F, -2.0F, 0.0F, 4.5F, 1.0F, 0.0F);
/* 1844 */     this.ammoModel[85].setRotationPoint(38.5F, 62.25F, 1.0F);
/*      */     
/* 1846 */     this.ammoModel[86].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 14, 0.0F, 12.5F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 12.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F);
/* 1847 */     this.ammoModel[86].setRotationPoint(21.5F, 48.25F, 1.0F);
/*      */     
/* 1849 */     this.ammoModel[87].addShapeBox(55.0F, -23.0F, -8.0F, 4, 9, 14, 0.0F, 8.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1850 */     this.ammoModel[87].setRotationPoint(11.0F, 39.25F, 1.0F);
/*      */     
/* 1852 */     this.ammoModel[88].addShapeBox(55.0F, -23.0F, -8.0F, 4, 12, 14, 0.0F, 8.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1853 */     this.ammoModel[88].setRotationPoint(3.0F, 27.25F, 1.0F);
/*      */     
/* 1855 */     this.ammoModel[89].addShapeBox(55.0F, -23.0F, -8.0F, 4, 14, 14, 0.0F, 5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1856 */     this.ammoModel[89].setRotationPoint(-6.0F, 13.25F, 1.0F);
/*      */     
/* 1858 */     this.ammoModel[90].addShapeBox(55.0F, -23.0F, -8.0F, 4, 14, 14, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1859 */     this.ammoModel[90].setRotationPoint(-13.0F, -0.75F, 1.0F);
/*      */     
/* 1861 */     this.ammoModel[91].addShapeBox(55.0F, -23.0F, -8.0F, 2, 8, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1862 */     this.ammoModel[91].setRotationPoint(-14.0F, -8.75F, 1.0F);
/*      */     
/* 1864 */     this.ammoModel[92].addShapeBox(55.0F, -23.0F, -8.0F, 4, 7, 14, 0.0F, 12.5F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 12.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F);
/* 1865 */     this.ammoModel[92].setRotationPoint(27.5F, 55.25F, 1.0F);
/*      */     
/* 1867 */     this.ammoModel[93].addShapeBox(55.0F, -23.0F, -8.0F, 4, 9, 14, 0.0F, 12.5F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 12.5F, 0.0F, 0.0F, 2.5F, 1.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, -2.0F, 0.0F, 2.5F, 1.0F, 0.0F);
/* 1868 */     this.ammoModel[93].setRotationPoint(34.5F, 62.25F, 1.0F);
/*      */     
/*      */ 
/* 1871 */     this.slideModel = new ModelRendererTurbo[20];
/* 1872 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/* 1873 */     this.slideModel[1] = new ModelRendererTurbo(this, 129, 225, this.textureX, this.textureY);
/* 1874 */     this.slideModel[2] = new ModelRendererTurbo(this, 145, 177, this.textureX, this.textureY);
/* 1875 */     this.slideModel[3] = new ModelRendererTurbo(this, 569, 225, this.textureX, this.textureY);
/* 1876 */     this.slideModel[4] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/* 1877 */     this.slideModel[5] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/* 1878 */     this.slideModel[6] = new ModelRendererTurbo(this, 481, 209, this.textureX, this.textureY);
/* 1879 */     this.slideModel[7] = new ModelRendererTurbo(this, 929, 97, this.textureX, this.textureY);
/* 1880 */     this.slideModel[8] = new ModelRendererTurbo(this, 393, 97, this.textureX, this.textureY);
/* 1881 */     this.slideModel[9] = new ModelRendererTurbo(this, 809, 89, this.textureX, this.textureY);
/* 1882 */     this.slideModel[10] = new ModelRendererTurbo(this, 945, 217, this.textureX, this.textureY);
/* 1883 */     this.slideModel[11] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/* 1884 */     this.slideModel[12] = new ModelRendererTurbo(this, 849, 97, this.textureX, this.textureY);
/* 1885 */     this.slideModel[13] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/* 1886 */     this.slideModel[14] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/* 1887 */     this.slideModel[15] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/* 1888 */     this.slideModel[16] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/* 1889 */     this.slideModel[17] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/* 1890 */     this.slideModel[18] = new ModelRendererTurbo(this, 745, 113, this.textureX, this.textureY);
/* 1891 */     this.slideModel[19] = new ModelRendererTurbo(this, 217, 121, this.textureX, this.textureY);
/*      */     
/* 1893 */     this.slideModel[0].addShapeBox(55.0F, -23.0F, -8.0F, 47, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1894 */     this.slideModel[0].setRotationPoint(-34.0F, -26.0F, 0.0F);
/*      */     
/* 1896 */     this.slideModel[1].addShapeBox(55.0F, -23.0F, -8.0F, 47, 8, 16, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1897 */     this.slideModel[1].setRotationPoint(-34.0F, -34.0F, 0.0F);
/*      */     
/* 1899 */     this.slideModel[2].addShapeBox(55.0F, -23.0F, -8.0F, 57, 1, 4, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1900 */     this.slideModel[2].setRotationPoint(-34.0F, -36.0F, 6.0F);
/*      */     
/* 1902 */     this.slideModel[3].addShapeBox(55.0F, -23.0F, -8.0F, 57, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1903 */     this.slideModel[3].setRotationPoint(-34.0F, -35.0F, 5.0F);
/*      */     
/* 1905 */     this.slideModel[4].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1906 */     this.slideModel[4].setRotationPoint(13.0F, -26.0F, 11.0F);
/*      */     
/* 1908 */     this.slideModel[5].addShapeBox(55.0F, -23.0F, -8.0F, 7, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1909 */     this.slideModel[5].setRotationPoint(13.0F, -31.0F, 5.0F);
/*      */     
/* 1911 */     this.slideModel[6].addShapeBox(55.0F, -23.0F, -8.0F, 1, 8, 11, 0.0F, 0.0F, 0.0F, -3.25F, 8.0F, 0.0F, -3.25F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1912 */     this.slideModel[6].setRotationPoint(13.25F, -34.0F, 0.0F);
/*      */     
/* 1914 */     this.slideModel[7].addShapeBox(55.0F, -23.0F, -8.0F, 5, 8, 5, 0.0F, -4.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1915 */     this.slideModel[7].setRotationPoint(18.25F, -34.0F, 0.0F);
/*      */     
/* 1917 */     this.slideModel[8].addShapeBox(55.0F, -23.0F, -8.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1918 */     this.slideModel[8].setRotationPoint(18.25F, -26.0F, 11.0F);
/*      */     
/* 1920 */     this.slideModel[9].addShapeBox(55.0F, -23.0F, -8.0F, 1, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1921 */     this.slideModel[9].setRotationPoint(13.25F, -34.0F, 11.0F);
/*      */     
/* 1923 */     this.slideModel[10].addShapeBox(55.0F, -23.0F, -8.0F, 1, 8, 16, 0.0F, 0.0F, 0.0F, -5.0F, -0.75F, 0.0F, -5.0F, -0.75F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1924 */     this.slideModel[10].setRotationPoint(13.0F, -34.0F, 0.0F);
/*      */     
/* 1926 */     this.slideModel[11].addShapeBox(55.0F, -23.0F, -8.0F, 5, 8, 5, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, -4.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1927 */     this.slideModel[11].setRotationPoint(18.25F, -34.0F, 11.0F);
/*      */     
/* 1929 */     this.slideModel[12].addShapeBox(55.0F, -23.0F, -8.0F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1930 */     this.slideModel[12].setRotationPoint(13.0F, -26.0F, 0.0F);
/*      */     
/* 1932 */     this.slideModel[13].addShapeBox(55.0F, -23.0F, -8.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1933 */     this.slideModel[13].setRotationPoint(18.25F, -26.0F, 0.0F);
/*      */     
/* 1935 */     this.slideModel[14].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1936 */     this.slideModel[14].setRotationPoint(18.0F, -32.65F, -13.77F);
/* 1937 */     this.slideModel[14].rotateAngleX = -0.43633232F;
/*      */     
/* 1939 */     this.slideModel[15].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 1940 */     this.slideModel[15].setRotationPoint(18.0F, -31.29F, -14.4F);
/* 1941 */     this.slideModel[15].rotateAngleX = -0.43633232F;
/*      */     
/* 1943 */     this.slideModel[16].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1944 */     this.slideModel[16].setRotationPoint(18.0F, -34.0F, -13.14F);
/* 1945 */     this.slideModel[16].rotateAngleX = -0.43633232F;
/*      */     
/* 1947 */     this.slideModel[17].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1948 */     this.slideModel[17].setRotationPoint(18.0F, -32.15F, -12.77F);
/* 1949 */     this.slideModel[17].rotateAngleX = -0.43633232F;
/*      */     
/* 1951 */     this.slideModel[18].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1952 */     this.slideModel[18].setRotationPoint(18.0F, -31.25F, -13.19F);
/* 1953 */     this.slideModel[18].rotateAngleX = -0.43633232F;
/*      */     
/* 1955 */     this.slideModel[19].addShapeBox(55.0F, -23.0F, -8.0F, 3, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1956 */     this.slideModel[19].setRotationPoint(18.0F, -33.05F, -12.34F);
/* 1957 */     this.slideModel[19].rotateAngleX = -0.43633232F;
/*      */     
/*      */ 
/* 1960 */     translateAll(0.0F, -28.0F, 0.0F);
/* 1961 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/* 1963 */     this.gunSlideDistance = 3.0F;
/* 1964 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/* 1967 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelvz58.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */