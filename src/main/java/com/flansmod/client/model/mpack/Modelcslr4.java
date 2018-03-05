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
/*      */ public class Modelcslr4
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelcslr4()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ď'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 553, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 585, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 617, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 977, 9, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 641, 9, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 545, 17, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 745, 17, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 809, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 841, 17, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 873, 17, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 913, 17, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 513, 41, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 945, 9, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 601, 25, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 513, 25, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 769, 25, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 969, 33, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 881, 41, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 929, 49, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 553, 57, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 681, 57, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 721, 57, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 641, 25, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 913, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 753, 57, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 801, 57, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 833, 57, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 969, 57, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 561, 73, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 569, 65, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 753, 73, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 857, 65, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 993, 65, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 673, 73, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 513, 81, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 889, 73, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 697, 81, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 737, 81, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 953, 65, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 769, 81, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 809, 81, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 969, 81, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 841, 89, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 249, 97, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 281, 97, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 409, 97, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 665, 97, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 865, 97, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 937, 97, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 569, 105, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 993, 97, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 617, 105, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 689, 105, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 721, 105, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 25, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 897, 25, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 753, 105, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 105, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 897, 105, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 961, 105, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 113, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 113, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 113, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 641, 105, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 913, 65, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 665, 113, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 921, 113, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 985, 113, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 721, 89, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 177, 97, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 369, 97, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 881, 113, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 257, 121, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 465, 121, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 529, 121, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 553, 121, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 577, 121, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 601, 121, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 633, 121, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 689, 121, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 713, 121, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 737, 121, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 945, 121, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 57, 129, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 313, 129, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 353, 129, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 393, 129, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 425, 129, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 649, 129, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 865, 121, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 753, 129, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 809, 129, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 841, 129, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 889, 129, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 921, 129, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 625, 25, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 961, 129, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 993, 129, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 953, 49, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 17, 137, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 481, 137, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 737, 57, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 513, 137, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 785, 57, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 545, 137, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 577, 137, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 609, 137, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 689, 137, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 145, 137, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 249, 137, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 729, 137, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 209, 145, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 641, 145, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 753, 145, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 873, 145, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 233, 153, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 729, 17, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 897, 17, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 913, 145, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 305, 153, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 657, 153, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 561, 161, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 33, 169, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 993, 145, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 185, 153, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 73, 153, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 481, 153, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 513, 153, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 777, 153, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 745, 1, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 841, 33, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 617, 1, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 321, 177, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 993, 57, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 833, 17, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 865, 17, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 897, 153, this.textureX, this.textureY);
/*      */     
/*  294 */     this.gunModel[0].addShapeBox(12.0F, -18.0F, -5.5F, 48, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  295 */     this.gunModel[0].setRotationPoint(6.5F, -12.0F, -0.25F);
/*      */     
/*  297 */     this.gunModel[1].addBox(12.0F, -18.0F, -5.5F, 2, 11, 12, 0.0F);
/*  298 */     this.gunModel[1].setRotationPoint(14.0F, -8.0F, -0.25F);
/*      */     
/*  300 */     this.gunModel[2].addShapeBox(12.0F, -18.0F, -5.5F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  301 */     this.gunModel[2].setRotationPoint(16.0F, -8.0F, -0.25F);
/*      */     
/*  303 */     this.gunModel[3].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  304 */     this.gunModel[3].setRotationPoint(18.0F, -8.0F, -0.25F);
/*      */     
/*  306 */     this.gunModel[4].addShapeBox(12.0F, -18.0F, -5.5F, 9, 2, 12, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  307 */     this.gunModel[4].setRotationPoint(5.0F, -8.0F, -0.25F);
/*      */     
/*  309 */     this.gunModel[5].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  310 */     this.gunModel[5].setRotationPoint(12.0F, -1.0F, -0.25F);
/*      */     
/*  312 */     this.gunModel[6].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  313 */     this.gunModel[6].setRotationPoint(9.0F, -1.0F, -0.25F);
/*      */     
/*  315 */     this.gunModel[7].addShapeBox(12.0F, -18.0F, -5.5F, 8, 1, 12, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  316 */     this.gunModel[7].setRotationPoint(6.0F, -6.0F, -0.25F);
/*      */     
/*  318 */     this.gunModel[8].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F);
/*  319 */     this.gunModel[8].setRotationPoint(12.0F, -5.0F, -0.25F);
/*      */     
/*  321 */     this.gunModel[9].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  322 */     this.gunModel[9].setRotationPoint(9.0F, -5.0F, -0.25F);
/*      */     
/*  324 */     this.gunModel[10].addShapeBox(12.0F, -18.0F, -5.5F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  325 */     this.gunModel[10].setRotationPoint(8.0F, 0.0F, -0.25F);
/*      */     
/*  327 */     this.gunModel[11].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  328 */     this.gunModel[11].setRotationPoint(11.0F, 1.0F, -0.25F);
/*      */     
/*  330 */     this.gunModel[12].addShapeBox(12.0F, -18.0F, -5.5F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  331 */     this.gunModel[12].setRotationPoint(25.0F, -8.0F, -0.25F);
/*      */     
/*  333 */     this.gunModel[13].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  334 */     this.gunModel[13].setRotationPoint(23.0F, -8.0F, -0.25F);
/*      */     
/*  336 */     this.gunModel[14].addShapeBox(12.0F, -18.0F, -5.5F, 2, 7, 12, 0.0F, -2.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  337 */     this.gunModel[14].setRotationPoint(25.0F, -4.0F, -0.25F);
/*      */     
/*  339 */     this.gunModel[15].addShapeBox(12.0F, -18.0F, -5.5F, 5, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  340 */     this.gunModel[15].setRotationPoint(27.0F, -8.0F, -0.25F);
/*      */     
/*  342 */     this.gunModel[16].addBox(12.0F, -18.0F, -5.5F, 10, 4, 3, 0.0F);
/*  343 */     this.gunModel[16].setRotationPoint(-24.5F, -12.0F, -0.25F);
/*      */     
/*  345 */     this.gunModel[17].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/*  346 */     this.gunModel[17].setRotationPoint(23.0F, 3.0F, -0.25F);
/*      */     
/*  348 */     this.gunModel[18].addShapeBox(12.0F, -18.0F, -5.5F, 14, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  349 */     this.gunModel[18].setRotationPoint(13.5F, 4.0F, -0.25F);
/*      */     
/*  351 */     this.gunModel[19].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  352 */     this.gunModel[19].setRotationPoint(14.0F, 3.0F, -0.25F);
/*      */     
/*  354 */     this.gunModel[20].addShapeBox(12.0F, -18.0F, -5.5F, 3, 5, 12, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  355 */     this.gunModel[20].setRotationPoint(6.0F, -5.0F, -0.25F);
/*      */     
/*  357 */     this.gunModel[21].addBox(12.0F, -18.0F, -5.5F, 8, 1, 12, 0.0F);
/*  358 */     this.gunModel[21].setRotationPoint(-1.5F, -9.0F, -0.25F);
/*      */     
/*  360 */     this.gunModel[22].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  361 */     this.gunModel[22].setRotationPoint(3.5F, -11.0F, -0.25F);
/*      */     
/*  363 */     this.gunModel[23].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  364 */     this.gunModel[23].setRotationPoint(-1.5F, -11.0F, -0.25F);
/*      */     
/*  366 */     this.gunModel[24].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  367 */     this.gunModel[24].setRotationPoint(-1.5F, -12.0F, -0.25F);
/*      */     
/*  369 */     this.gunModel[25].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  370 */     this.gunModel[25].setRotationPoint(5.5F, -12.0F, -0.25F);
/*      */     
/*  372 */     this.gunModel[26].addShapeBox(12.0F, -18.0F, -5.5F, 4, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  373 */     this.gunModel[26].setRotationPoint(-24.5F, -8.0F, -0.25F);
/*      */     
/*  375 */     this.gunModel[27].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  376 */     this.gunModel[27].setRotationPoint(-20.0F, -3.0F, -0.25F);
/*      */     
/*  378 */     this.gunModel[28].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  379 */     this.gunModel[28].setRotationPoint(-20.0F, -8.0F, -0.25F);
/*      */     
/*  381 */     this.gunModel[29].addShapeBox(12.0F, -18.0F, -5.5F, 16, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  382 */     this.gunModel[29].setRotationPoint(-20.0F, -1.0F, -0.25F);
/*      */     
/*  384 */     this.gunModel[30].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  385 */     this.gunModel[30].setRotationPoint(-4.0F, -1.0F, -0.25F);
/*      */     
/*  387 */     this.gunModel[31].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  388 */     this.gunModel[31].setRotationPoint(-2.0F, -1.0F, -0.25F);
/*      */     
/*  390 */     this.gunModel[32].addShapeBox(12.0F, -18.0F, -5.5F, 9, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  391 */     this.gunModel[32].setRotationPoint(2.0F, 6.0F, -0.25F);
/*      */     
/*  393 */     this.gunModel[33].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F);
/*  394 */     this.gunModel[33].setRotationPoint(0.0F, 6.0F, -0.25F);
/*      */     
/*  396 */     this.gunModel[34].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  397 */     this.gunModel[34].setRotationPoint(11.0F, 6.0F, -0.25F);
/*      */     
/*  399 */     this.gunModel[35].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  400 */     this.gunModel[35].setRotationPoint(13.0F, 5.0F, -0.25F);
/*      */     
/*  402 */     this.gunModel[36].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  403 */     this.gunModel[36].setRotationPoint(13.5F, 4.5F, -0.25F);
/*      */     
/*  405 */     this.gunModel[37].addShapeBox(12.0F, -18.0F, -5.5F, 28, 7, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  406 */     this.gunModel[37].setRotationPoint(-52.5F, -7.0F, -0.25F);
/*      */     
/*  408 */     this.gunModel[38].addShapeBox(12.0F, -18.0F, -5.5F, 13, 8, 12, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 4.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 4.0F, -1.0F);
/*  409 */     this.gunModel[38].setRotationPoint(33.0F, -2.0F, -0.25F);
/*      */     
/*  411 */     this.gunModel[39].addShapeBox(12.0F, -18.0F, -5.5F, 3, 5, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  412 */     this.gunModel[39].setRotationPoint(30.0F, 5.0F, -0.25F);
/*      */     
/*  414 */     this.gunModel[40].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/*  415 */     this.gunModel[40].setRotationPoint(27.0F, 6.0F, -0.25F);
/*      */     
/*  417 */     this.gunModel[41].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  418 */     this.gunModel[41].setRotationPoint(27.0F, 4.0F, -0.25F);
/*      */     
/*  420 */     this.gunModel[42].addShapeBox(12.0F, -18.0F, -5.5F, 4, 6, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.5F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, -2.5F, -1.0F);
/*  421 */     this.gunModel[42].setRotationPoint(23.0F, 4.0F, -0.25F);
/*      */     
/*  423 */     this.gunModel[43].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  424 */     this.gunModel[43].setRotationPoint(23.0F, 4.0F, -0.25F);
/*      */     
/*  426 */     this.gunModel[44].addShapeBox(12.0F, -18.0F, -5.5F, 7, 8, 12, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 4.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 4.0F, -1.0F);
/*  427 */     this.gunModel[44].setRotationPoint(46.0F, -7.0F, -0.25F);
/*      */     
/*  429 */     this.gunModel[45].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F);
/*  430 */     this.gunModel[45].setRotationPoint(53.0F, -9.0F, -0.25F);
/*      */     
/*  432 */     this.gunModel[46].addShapeBox(12.0F, -18.0F, -5.5F, 1, 11, 12, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F);
/*  433 */     this.gunModel[46].setRotationPoint(55.0F, -16.0F, -0.25F);
/*      */     
/*  435 */     this.gunModel[47].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  436 */     this.gunModel[47].setRotationPoint(53.0F, -8.0F, -0.25F);
/*      */     
/*  438 */     this.gunModel[48].addShapeBox(12.0F, -18.0F, -5.5F, 180, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  439 */     this.gunModel[48].setRotationPoint(51.5F, -14.5F, 2.25F);
/*      */     
/*  441 */     this.gunModel[49].addShapeBox(12.0F, -18.0F, -5.5F, 180, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F);
/*  442 */     this.gunModel[49].setRotationPoint(51.5F, -12.0F, 2.25F);
/*      */     
/*  444 */     this.gunModel[50].addShapeBox(12.0F, -18.0F, -5.5F, 180, 2, 7, 0.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  445 */     this.gunModel[50].setRotationPoint(51.5F, -17.0F, 2.25F);
/*      */     
/*  447 */     this.gunModel[51].addShapeBox(12.0F, -18.0F, -5.5F, 3, 7, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  448 */     this.gunModel[51].setRotationPoint(53.0F, -3.0F, -0.25F);
/*      */     
/*  450 */     this.gunModel[52].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 12, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, -1.0F, -1.0F, 0.5F, -1.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/*  451 */     this.gunModel[52].setRotationPoint(14.0F, 4.5F, -0.25F);
/*      */     
/*  453 */     this.gunModel[53].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/*  454 */     this.gunModel[53].setRotationPoint(16.0F, 4.5F, -0.25F);
/*      */     
/*  456 */     this.gunModel[54].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  457 */     this.gunModel[54].setRotationPoint(21.0F, 4.0F, -0.25F);
/*      */     
/*  459 */     this.gunModel[55].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/*  460 */     this.gunModel[55].setRotationPoint(21.0F, 4.5F, -0.25F);
/*      */     
/*  462 */     this.gunModel[56].addShapeBox(12.0F, -18.0F, -5.5F, 12, 12, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  463 */     this.gunModel[56].setRotationPoint(15.0F, -8.0F, 0.25F);
/*      */     
/*  465 */     this.gunModel[57].addShapeBox(12.0F, -18.0F, -5.5F, 9, 14, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  466 */     this.gunModel[57].setRotationPoint(30.0F, -8.0F, 0.25F);
/*      */     
/*  468 */     this.gunModel[58].addShapeBox(12.0F, -18.0F, -5.5F, 3, 14, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  469 */     this.gunModel[58].setRotationPoint(27.0F, -8.0F, 0.25F);
/*      */     
/*  471 */     this.gunModel[59].addShapeBox(12.0F, -18.0F, -5.5F, 16, 11, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -6.0F, -0.25F, 0.0F, -6.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  472 */     this.gunModel[59].setRotationPoint(39.0F, -8.0F, 0.25F);
/*      */     
/*  474 */     this.gunModel[60].addShapeBox(12.0F, -18.0F, -5.5F, 11, 14, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  475 */     this.gunModel[60].setRotationPoint(2.0F, -8.0F, 0.25F);
/*      */     
/*  477 */     this.gunModel[61].addShapeBox(12.0F, -18.0F, -5.5F, 5, 14, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -6.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -6.5F, -0.25F);
/*  478 */     this.gunModel[61].setRotationPoint(-3.0F, -8.0F, 0.25F);
/*      */     
/*  480 */     this.gunModel[62].addShapeBox(12.0F, -18.0F, -5.5F, 17, 7, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  481 */     this.gunModel[62].setRotationPoint(-20.0F, -8.0F, 0.25F);
/*      */     
/*  483 */     this.gunModel[63].addShapeBox(12.0F, -18.0F, -5.5F, 65, 2, 2, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  484 */     this.gunModel[63].setRotationPoint(-20.5F, -14.0F, 8.75F);
/*      */     
/*  486 */     this.gunModel[64].addShapeBox(12.0F, -18.0F, -5.5F, 8, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[64].setRotationPoint(-1.5F, -12.0F, 0.75F);
/*      */     
/*  489 */     this.gunModel[65].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 2, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.25F, 4.0F, 0.0F, 0.25F);
/*  490 */     this.gunModel[65].setRotationPoint(-20.5F, -14.0F, 0.75F);
/*      */     
/*  492 */     this.gunModel[66].addShapeBox(12.0F, -18.0F, -5.5F, 1, 13, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  493 */     this.gunModel[66].setRotationPoint(13.0F, -8.0F, 0.25F);
/*      */     
/*  495 */     this.gunModel[67].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 12, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F);
/*  496 */     this.gunModel[67].setRotationPoint(13.0F, 4.5F, -0.25F);
/*      */     
/*  498 */     this.gunModel[68].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F);
/*  499 */     this.gunModel[68].setRotationPoint(11.0F, 7.0F, -0.25F);
/*      */     
/*  501 */     this.gunModel[69].addShapeBox(12.0F, -18.0F, -5.5F, 9, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  502 */     this.gunModel[69].setRotationPoint(2.0F, 7.0F, -0.25F);
/*      */     
/*  504 */     this.gunModel[70].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 12, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  505 */     this.gunModel[70].setRotationPoint(0.0F, 7.0F, -0.25F);
/*      */     
/*  507 */     this.gunModel[71].addShapeBox(12.0F, -18.0F, -5.5F, 2, 6, 12, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F);
/*  508 */     this.gunModel[71].setRotationPoint(-2.0F, 4.0F, -0.25F);
/*      */     
/*  510 */     this.gunModel[72].addShapeBox(12.0F, -18.0F, -5.5F, 2, 6, 12, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -6.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -6.0F, -1.0F);
/*  511 */     this.gunModel[72].setRotationPoint(-4.0F, 3.0F, -0.25F);
/*      */     
/*  513 */     this.gunModel[73].addShapeBox(12.0F, -18.0F, -5.5F, 15, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  514 */     this.gunModel[73].setRotationPoint(-19.0F, 0.0F, -0.25F);
/*      */     
/*  516 */     this.gunModel[74].addShapeBox(12.0F, -18.0F, -5.5F, 4, 3, 10, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  517 */     this.gunModel[74].setRotationPoint(45.75F, -15.0F, 0.75F);
/*      */     
/*  519 */     this.gunModel[75].addShapeBox(12.0F, -18.0F, -5.5F, 4, 3, 10, 0.0F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  520 */     this.gunModel[75].setRotationPoint(45.75F, -18.5F, 0.75F);
/*      */     
/*  522 */     this.gunModel[76].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 7, 0.0F, 0.0F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.0F, 0.75F, 1.75F, 0.0F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.0F, 0.75F, 1.75F);
/*  523 */     this.gunModel[76].setRotationPoint(50.0F, -14.5F, 2.25F);
/*      */     
/*  525 */     this.gunModel[77].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 7, 0.0F, -0.5F, -0.25F, 1.75F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.5F, -0.25F, 1.75F, -0.5F, 1.75F, -1.75F, -0.25F, 0.25F, -2.25F, -0.25F, 0.25F, -2.25F, -0.5F, 1.75F, -1.75F);
/*  526 */     this.gunModel[77].setRotationPoint(49.5F, -12.0F, 2.25F);
/*      */     
/*  528 */     this.gunModel[78].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 7, 0.0F, -0.5F, 1.75F, -1.75F, -0.25F, 0.25F, -2.25F, -0.25F, 0.25F, -2.25F, -0.5F, 1.75F, -1.75F, -0.5F, -0.25F, 1.75F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.5F, -0.25F, 1.75F);
/*  529 */     this.gunModel[78].setRotationPoint(49.5F, -17.0F, 2.25F);
/*      */     
/*  531 */     this.gunModel[79].addShapeBox(12.0F, -18.0F, -5.5F, 55, 3, 3, 0.0F, 0.0F, 0.5F, -2.0F, 1.0F, 0.5F, -2.0F, 1.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  532 */     this.gunModel[79].setRotationPoint(-10.5F, -17.0F, 0.75F);
/*      */     
/*  534 */     this.gunModel[80].addShapeBox(12.0F, -18.0F, -5.5F, 61, 3, 3, 0.0F, 0.0F, 0.5F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 5.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  535 */     this.gunModel[80].setRotationPoint(-16.5F, -17.0F, 7.75F);
/*      */     
/*  537 */     this.gunModel[81].addBox(12.0F, -18.0F, -5.5F, 23, 4, 3, 0.0F);
/*  538 */     this.gunModel[81].setRotationPoint(-24.5F, -12.0F, 8.75F);
/*      */     
/*  540 */     this.gunModel[82].addShapeBox(12.0F, -18.0F, -5.5F, 6, 2, 3, 0.0F, -2.5F, 0.0F, -1.15F, 1.0F, 0.0F, -1.15F, 1.0F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  541 */     this.gunModel[82].setRotationPoint(-21.5F, -16.0F, 0.75F);
/*      */     
/*  543 */     this.gunModel[83].addShapeBox(12.0F, -18.0F, -5.5F, 56, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  544 */     this.gunModel[83].setRotationPoint(-10.5F, -14.0F, 0.75F);
/*      */     
/*  546 */     this.gunModel[84].addShapeBox(12.0F, -18.0F, -5.5F, 55, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  547 */     this.gunModel[84].setRotationPoint(-10.5F, -17.0F, 3.25F);
/*      */     
/*  549 */     this.gunModel[85].addShapeBox(12.0F, -18.0F, -5.5F, 54, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  550 */     this.gunModel[85].setRotationPoint(-8.5F, -19.5F, 3.25F);
/*      */     
/*  552 */     this.gunModel[86].addShapeBox(12.0F, -18.0F, -5.5F, 54, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  553 */     this.gunModel[86].setRotationPoint(-8.5F, -21.0F, 3.25F);
/*      */     
/*  555 */     this.gunModel[87].addShapeBox(12.0F, -18.0F, -5.5F, 54, 1, 5, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  556 */     this.gunModel[87].setRotationPoint(-8.5F, -20.5F, 3.25F);
/*      */     
/*  558 */     this.gunModel[88].addShapeBox(12.0F, -18.0F, -5.5F, 54, 1, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  559 */     this.gunModel[88].setRotationPoint(-8.5F, -21.0F, 2.25F);
/*      */     
/*  561 */     this.gunModel[89].addShapeBox(12.0F, -18.0F, -5.5F, 36, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  562 */     this.gunModel[89].setRotationPoint(97.5F, -18.5F, 3.25F);
/*      */     
/*  564 */     this.gunModel[90].addShapeBox(12.0F, -18.0F, -5.5F, 36, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  565 */     this.gunModel[90].setRotationPoint(97.5F, -20.0F, 3.25F);
/*      */     
/*  567 */     this.gunModel[91].addShapeBox(12.0F, -18.0F, -5.5F, 36, 1, 5, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  568 */     this.gunModel[91].setRotationPoint(97.5F, -19.5F, 3.25F);
/*      */     
/*  570 */     this.gunModel[92].addShapeBox(12.0F, -18.0F, -5.5F, 36, 1, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[92].setRotationPoint(97.5F, -20.0F, 2.25F);
/*      */     
/*  573 */     this.gunModel[93].addShapeBox(12.0F, -18.0F, -5.5F, 2, 8, 12, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.75F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -3.75F, -1.0F);
/*  574 */     this.gunModel[93].setRotationPoint(56.0F, -0.5F, -0.25F);
/*      */     
/*  576 */     this.gunModel[94].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 12, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  577 */     this.gunModel[94].setRotationPoint(58.0F, -16.0F, -0.25F);
/*      */     
/*  579 */     this.gunModel[95].addShapeBox(12.0F, -18.0F, -5.5F, 2, 7, 12, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  580 */     this.gunModel[95].setRotationPoint(56.0F, -16.0F, -0.25F);
/*      */     
/*  582 */     this.gunModel[96].addShapeBox(12.0F, -18.0F, -5.5F, 67, 8, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, 2.0F);
/*  583 */     this.gunModel[96].setRotationPoint(67.0F, -13.0F, -0.25F);
/*      */     
/*  585 */     this.gunModel[97].addShapeBox(12.0F, -18.0F, -5.5F, 61, 4, 12, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.85F, 2.0F, 0.0F, 1.85F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.85F, -1.0F, 0.0F, -1.85F, -1.0F, 0.0F, 1.0F, -1.0F);
/*  586 */     this.gunModel[97].setRotationPoint(67.0F, -3.0F, -0.25F);
/*      */     
/*  588 */     this.gunModel[98].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 12, 0.0F, 0.0F, -0.15F, 2.0F, 0.0F, -0.1F, 2.0F, 0.0F, -0.1F, 2.0F, 0.0F, -0.15F, 2.0F, 0.0F, 0.15F, -1.0F, 0.0F, -1.1F, -1.0F, 0.0F, -1.1F, -1.0F, 0.0F, 0.15F, -1.0F);
/*  589 */     this.gunModel[98].setRotationPoint(128.0F, -5.0F, -0.25F);
/*      */     
/*  591 */     this.gunModel[99].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 12, 0.0F, 0.0F, -0.1F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.1F, 2.0F, 0.0F, -1.1F, -1.0F, 0.0F, -3.1F, -1.0F, 0.0F, -3.1F, -1.0F, 0.0F, -1.1F, -1.0F);
/*  592 */     this.gunModel[99].setRotationPoint(131.0F, -5.0F, -0.25F);
/*      */     
/*  594 */     this.gunModel[100].addShapeBox(12.0F, -18.0F, -5.5F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.1F, -1.0F, -2.0F, -3.1F, -1.0F, -2.0F, -3.1F, -1.0F, 0.0F, -3.1F, -1.0F);
/*  595 */     this.gunModel[100].setRotationPoint(134.0F, -5.0F, -0.25F);
/*      */     
/*  597 */     this.gunModel[101].addShapeBox(12.0F, -18.0F, -5.5F, 1, 8, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F);
/*  598 */     this.gunModel[101].setRotationPoint(134.0F, -13.0F, -0.25F);
/*      */     
/*  600 */     this.gunModel[102].addShapeBox(12.0F, -18.0F, -5.5F, 4, 11, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.5F, 2.0F);
/*  601 */     this.gunModel[102].setRotationPoint(63.0F, -13.0F, -0.25F);
/*      */     
/*  603 */     this.gunModel[103].addShapeBox(12.0F, -18.0F, -5.5F, 2, 12, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.3F, 1.15F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.3F, 1.15F);
/*  604 */     this.gunModel[103].setRotationPoint(61.0F, -13.0F, -0.25F);
/*      */     
/*  606 */     this.gunModel[104].addShapeBox(12.0F, -18.0F, -5.5F, 3, 11, 12, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.3F, 1.15F, 0.0F, 0.3F, 1.15F, 0.0F, 1.5F, 0.0F);
/*  607 */     this.gunModel[104].setRotationPoint(58.0F, -12.0F, -0.25F);
/*      */     
/*  609 */     this.gunModel[105].addShapeBox(12.0F, -18.0F, -5.5F, 2, 8, 12, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  610 */     this.gunModel[105].setRotationPoint(56.0F, -10.0F, -0.25F);
/*      */     
/*  612 */     this.gunModel[106].addShapeBox(12.0F, -18.0F, -5.5F, 4, 4, 12, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F);
/*  613 */     this.gunModel[106].setRotationPoint(63.0F, -2.0F, -0.25F);
/*      */     
/*  615 */     this.gunModel[107].addShapeBox(12.0F, -18.0F, -5.5F, 5, 4, 12, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F);
/*  616 */     this.gunModel[107].setRotationPoint(58.0F, -1.5F, -0.25F);
/*      */     
/*  618 */     this.gunModel[108].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[108].setRotationPoint(-52.5F, 0.0F, -0.25F);
/*      */     
/*  621 */     this.gunModel[109].addShapeBox(12.0F, -18.0F, -5.5F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  622 */     this.gunModel[109].setRotationPoint(-56.5F, 0.0F, -0.25F);
/*      */     
/*  624 */     this.gunModel[110].addShapeBox(12.0F, -18.0F, -5.5F, 4, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[110].setRotationPoint(-60.5F, 0.0F, -0.25F);
/*      */     
/*  627 */     this.gunModel[111].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  628 */     this.gunModel[111].setRotationPoint(-22.0F, 12.0F, -0.25F);
/*      */     
/*  630 */     this.gunModel[112].addShapeBox(12.0F, -18.0F, -5.5F, 3, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[112].setRotationPoint(-25.0F, 5.0F, -0.25F);
/*      */     
/*  633 */     this.gunModel[113].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  634 */     this.gunModel[113].setRotationPoint(-25.0F, 10.0F, -0.25F);
/*      */     
/*  636 */     this.gunModel[114].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  637 */     this.gunModel[114].setRotationPoint(-25.0F, 2.0F, -0.25F);
/*      */     
/*  639 */     this.gunModel[115].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -2.0F);
/*  640 */     this.gunModel[115].setRotationPoint(-22.0F, 0.0F, -0.25F);
/*      */     
/*  642 */     this.gunModel[116].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  643 */     this.gunModel[116].setRotationPoint(-7.0F, 12.0F, -0.25F);
/*      */     
/*  645 */     this.gunModel[117].addShapeBox(12.0F, -18.0F, -5.5F, 3, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  646 */     this.gunModel[117].setRotationPoint(-28.0F, 5.0F, -0.25F);
/*      */     
/*  648 */     this.gunModel[118].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  649 */     this.gunModel[118].setRotationPoint(-28.0F, 10.0F, -0.25F);
/*      */     
/*  651 */     this.gunModel[119].addShapeBox(12.0F, -18.0F, -5.5F, 6, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  652 */     this.gunModel[119].setRotationPoint(-28.0F, 0.0F, -0.25F);
/*      */     
/*  654 */     this.gunModel[120].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  655 */     this.gunModel[120].setRotationPoint(-28.0F, 2.0F, -0.25F);
/*      */     
/*  657 */     this.gunModel[121].addShapeBox(12.0F, -18.0F, -5.5F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  658 */     this.gunModel[121].setRotationPoint(-28.0F, 13.0F, -0.25F);
/*      */     
/*  660 */     this.gunModel[122].addShapeBox(12.0F, -18.0F, -5.5F, 21, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  661 */     this.gunModel[122].setRotationPoint(-28.0F, 14.0F, -0.25F);
/*      */     
/*  663 */     this.gunModel[123].addShapeBox(12.0F, -18.0F, -5.5F, 9, 2, 12, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  664 */     this.gunModel[123].setRotationPoint(-16.0F, 12.0F, -0.25F);
/*      */     
/*  666 */     this.gunModel[124].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  667 */     this.gunModel[124].setRotationPoint(-19.0F, 12.0F, -0.25F);
/*      */     
/*  669 */     this.gunModel[125].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  670 */     this.gunModel[125].setRotationPoint(-7.0F, 13.0F, -0.25F);
/*      */     
/*  672 */     this.gunModel[126].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  673 */     this.gunModel[126].setRotationPoint(-4.0F, 11.5F, -0.25F);
/*      */     
/*  675 */     this.gunModel[127].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  676 */     this.gunModel[127].setRotationPoint(-4.0F, 10.5F, -0.25F);
/*      */     
/*  678 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  679 */     this.gunModel[''].setRotationPoint(-1.0F, 9.5F, -0.25F);
/*      */     
/*  681 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  682 */     this.gunModel[''].setRotationPoint(-1.0F, 10.5F, -0.25F);
/*      */     
/*  684 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[''].setRotationPoint(0.0F, 9.5F, 0.75F);
/*      */     
/*  687 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 12, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  688 */     this.gunModel[''].setRotationPoint(-31.0F, 11.0F, -0.25F);
/*      */     
/*  690 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 3, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  691 */     this.gunModel[''].setRotationPoint(-34.0F, 0.0F, -0.25F);
/*      */     
/*  693 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  694 */     this.gunModel[''].setRotationPoint(-35.0F, 0.0F, -0.25F);
/*      */     
/*  696 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  697 */     this.gunModel[''].setRotationPoint(-37.0F, 0.0F, -0.25F);
/*      */     
/*  699 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  700 */     this.gunModel[''].setRotationPoint(-39.0F, 0.0F, -0.25F);
/*      */     
/*  702 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  703 */     this.gunModel[''].setRotationPoint(-41.0F, 0.0F, -0.25F);
/*      */     
/*  705 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  706 */     this.gunModel[''].setRotationPoint(-14.0F, 3.0F, 3.75F);
/*      */     
/*  708 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 4, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  709 */     this.gunModel[''].setRotationPoint(-14.0F, 4.0F, 3.75F);
/*      */     
/*  711 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 4, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[''].setRotationPoint(-14.0F, 5.0F, 3.75F);
/*      */     
/*  714 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  715 */     this.gunModel[''].setRotationPoint(-14.5F, 9.0F, 3.75F);
/*      */     
/*  717 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  718 */     this.gunModel[''].setRotationPoint(-14.5F, 7.0F, 3.75F);
/*      */     
/*  720 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 4, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  721 */     this.gunModel[''].setRotationPoint(-14.5F, 6.0F, 3.75F);
/*      */     
/*  723 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  724 */     this.gunModel[''].setRotationPoint(-14.0F, 10.0F, 3.75F);
/*      */     
/*  726 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 3, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  727 */     this.gunModel[''].setRotationPoint(-31.0F, 0.0F, -0.25F);
/*      */     
/*  729 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F);
/*  730 */     this.gunModel[''].setRotationPoint(-34.0F, 12.0F, -0.25F);
/*      */     
/*  732 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 12, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F);
/*  733 */     this.gunModel[''].setRotationPoint(-38.0F, 13.0F, -0.25F);
/*      */     
/*  735 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 4, 17, 10, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -2.0F, -7.0F, 0.0F, -2.0F, 7.0F, 0.0F, 0.0F);
/*  736 */     this.gunModel[''].setRotationPoint(-29.0F, 15.0F, 0.75F);
/*      */     
/*  738 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  739 */     this.gunModel[''].setRotationPoint(-36.0F, 32.0F, 0.75F);
/*      */     
/*  741 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 8, 2, 10, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  742 */     this.gunModel[''].setRotationPoint(-44.0F, 32.0F, 0.75F);
/*      */     
/*  744 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 11, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  745 */     this.gunModel[''].setRotationPoint(-49.0F, 28.0F, 0.75F);
/*      */     
/*  747 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 4, 17, 10, 0.0F, 5.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[''].setRotationPoint(-33.0F, 15.0F, 0.75F);
/*      */     
/*  750 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 15, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  751 */     this.gunModel[''].setRotationPoint(-53.0F, 24.0F, 0.75F);
/*      */     
/*  753 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 19, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  754 */     this.gunModel[''].setRotationPoint(-57.0F, 21.0F, 0.75F);
/*      */     
/*  756 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  757 */     this.gunModel[''].setRotationPoint(-57.0F, 20.0F, 0.75F);
/*      */     
/*  759 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 2, 4, 10, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[''].setRotationPoint(-40.0F, 15.0F, 0.75F);
/*      */     
/*  762 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 2, 4, 10, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  763 */     this.gunModel[''].setRotationPoint(-57.0F, 16.0F, 0.75F);
/*      */     
/*  765 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  766 */     this.gunModel[''].setRotationPoint(-40.0F, 19.0F, 0.75F);
/*      */     
/*  768 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 5, 4, 10, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  769 */     this.gunModel[''].setRotationPoint(-58.0F, 12.0F, 0.75F);
/*      */     
/*  771 */     this.gunModel[''].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 10, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  772 */     this.gunModel[''].setRotationPoint(-60.0F, 10.0F, 0.75F);
/*      */     
/*  774 */     this.gunModel[' '].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 10, 0.0F, 4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  775 */     this.gunModel[' '].setRotationPoint(-61.0F, 8.0F, 0.75F);
/*      */     
/*  777 */     this.gunModel['¡'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 1, 10, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  778 */     this.gunModel['¡'].setRotationPoint(-63.5F, 7.0F, 0.75F);
/*      */     
/*  780 */     this.gunModel['¢'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 3, 10, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  781 */     this.gunModel['¢'].setRotationPoint(-60.5F, 5.0F, 0.75F);
/*      */     
/*  783 */     this.gunModel['£'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 4, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  784 */     this.gunModel['£'].setRotationPoint(-56.5F, 4.0F, 0.75F);
/*      */     
/*  786 */     this.gunModel['¤'].addShapeBox(12.0F, -18.0F, -5.5F, 6, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  787 */     this.gunModel['¤'].setRotationPoint(-34.0F, 6.0F, 0.75F);
/*      */     
/*  789 */     this.gunModel['¥'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  790 */     this.gunModel['¥'].setRotationPoint(-36.0F, 6.0F, 0.75F);
/*      */     
/*  792 */     this.gunModel['¦'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
/*  793 */     this.gunModel['¦'].setRotationPoint(-36.0F, 9.0F, 0.75F);
/*      */     
/*  795 */     this.gunModel['§'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 10, 0.0F, 2.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  796 */     this.gunModel['§'].setRotationPoint(-36.0F, 3.0F, 0.75F);
/*      */     
/*  798 */     this.gunModel['¨'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, -0.4F, 0.0F, -2.0F, -0.4F, 0.0F, 2.0F, 0.0F, -2.0F);
/*  799 */     this.gunModel['¨'].setRotationPoint(-37.0F, 12.0F, 0.75F);
/*      */     
/*  801 */     this.gunModel['©'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  802 */     this.gunModel['©'].setRotationPoint(-34.0F, 9.0F, 0.75F);
/*      */     
/*  804 */     this.gunModel['ª'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 10, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  805 */     this.gunModel['ª'].setRotationPoint(-36.0F, 12.0F, 0.75F);
/*      */     
/*  807 */     this.gunModel['«'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 10, 0.0F, 2.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  808 */     this.gunModel['«'].setRotationPoint(-38.0F, 1.0F, 0.75F);
/*      */     
/*  810 */     this.gunModel['¬'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 10, 0.0F, 2.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  811 */     this.gunModel['¬'].setRotationPoint(-40.0F, 0.0F, 0.75F);
/*      */     
/*  813 */     this.gunModel['­'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 10, 0.0F, -2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -0.5F, 0.0F, -2.0F);
/*  814 */     this.gunModel['­'].setRotationPoint(-41.0F, 15.0F, 0.75F);
/*      */     
/*  816 */     this.gunModel['®'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 10, 0.0F, 1.0F, -1.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 1.0F, -1.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  817 */     this.gunModel['®'].setRotationPoint(-42.0F, 18.0F, 0.75F);
/*      */     
/*  819 */     this.gunModel['¯'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 10, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  820 */     this.gunModel['¯'].setRotationPoint(-45.0F, 19.0F, 0.75F);
/*      */     
/*  822 */     this.gunModel['°'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 10, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, -1.0F, -2.0F, 1.0F, -1.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F);
/*  823 */     this.gunModel['°'].setRotationPoint(-48.0F, 18.0F, 0.75F);
/*      */     
/*  825 */     this.gunModel['±'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 10, 0.0F, 1.0F, 1.0F, -2.0F, 1.0F, -3.0F, -2.0F, 1.0F, -3.0F, -2.0F, 1.0F, 1.0F, -2.0F, 1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, -2.0F, 0.0F);
/*  826 */     this.gunModel['±'].setRotationPoint(-52.0F, 15.0F, 0.75F);
/*      */     
/*  828 */     this.gunModel['²'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 10, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 1.0F, -2.0F, 1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, -2.0F, 0.0F);
/*  829 */     this.gunModel['²'].setRotationPoint(-54.0F, 11.0F, 0.75F);
/*      */     
/*  831 */     this.gunModel['³'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 10, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  832 */     this.gunModel['³'].setRotationPoint(-56.0F, 10.0F, 0.75F);
/*      */     
/*  834 */     this.gunModel['´'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  835 */     this.gunModel['´'].setRotationPoint(-55.5F, 6.0F, 0.75F);
/*      */     
/*  837 */     this.gunModel['µ'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 10, 0.0F, -1.0F, 0.0F, 0.0F, 2.5F, 0.0F, -2.0F, 2.5F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  838 */     this.gunModel['µ'].setRotationPoint(-55.5F, 4.0F, 0.75F);
/*      */     
/*  840 */     this.gunModel['¶'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 10, 0.0F, -5.0F, 0.0F, 0.0F, 5.5F, 0.0F, -2.0F, 5.5F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  841 */     this.gunModel['¶'].setRotationPoint(-54.5F, 1.0F, 0.75F);
/*      */     
/*  843 */     this.gunModel['·'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 10, 0.0F, -3.0F, 0.0F, 0.0F, 3.5F, 0.0F, -2.0F, 3.5F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  844 */     this.gunModel['·'].setRotationPoint(-49.5F, 0.0F, 0.75F);
/*      */     
/*  846 */     this.gunModel['¸'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 10, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel['¸'].setRotationPoint(-56.5F, 4.0F, 0.75F);
/*      */     
/*  849 */     this.gunModel['¹'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 10, 0.0F, -5.0F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, 5.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  850 */     this.gunModel['¹'].setRotationPoint(-56.0F, 1.0F, 0.75F);
/*      */     
/*  852 */     this.gunModel['º'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 10, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  853 */     this.gunModel['º'].setRotationPoint(-51.5F, 0.0F, 0.75F);
/*      */     
/*  855 */     this.gunModel['»'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  856 */     this.gunModel['»'].setRotationPoint(-63.5F, 0.0F, -0.25F);
/*      */     
/*  858 */     this.gunModel['¼'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel['¼'].setRotationPoint(-67.5F, 0.0F, -0.25F);
/*      */     
/*  861 */     this.gunModel['½'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  862 */     this.gunModel['½'].setRotationPoint(-71.5F, 0.0F, -0.25F);
/*      */     
/*  864 */     this.gunModel['¾'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F);
/*  865 */     this.gunModel['¾'].setRotationPoint(-75.5F, 0.0F, -0.25F);
/*      */     
/*  867 */     this.gunModel['¿'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  868 */     this.gunModel['¿'].setRotationPoint(-79.5F, 0.0F, -0.25F);
/*      */     
/*  870 */     this.gunModel['À'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 15, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  871 */     this.gunModel['À'].setRotationPoint(-82.5F, 0.0F, -0.25F);
/*      */     
/*  873 */     this.gunModel['Á'].addShapeBox(12.0F, -18.0F, -5.5F, 13, 24, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  874 */     this.gunModel['Á'].setRotationPoint(-95.5F, 0.0F, -0.25F);
/*      */     
/*  876 */     this.gunModel['Â'].addShapeBox(12.0F, -18.0F, -5.5F, 15, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  877 */     this.gunModel['Â'].setRotationPoint(-95.5F, 27.0F, 1.75F);
/*      */     
/*  879 */     this.gunModel['Ã'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  880 */     this.gunModel['Ã'].setRotationPoint(-82.5F, 20.0F, -0.25F);
/*      */     
/*  882 */     this.gunModel['Ä'].addShapeBox(12.0F, -18.0F, -5.5F, 15, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  883 */     this.gunModel['Ä'].setRotationPoint(-95.5F, 24.0F, -0.25F);
/*      */     
/*  885 */     this.gunModel['Å'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 31, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel['Å'].setRotationPoint(-99.5F, -7.0F, 0.75F);
/*      */     
/*  888 */     this.gunModel['Æ'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 31, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  889 */     this.gunModel['Æ'].setRotationPoint(-102.5F, -7.0F, -0.25F);
/*      */     
/*  891 */     this.gunModel['Ç'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  892 */     this.gunModel['Ç'].setRotationPoint(-99.5F, 24.0F, 0.75F);
/*      */     
/*  894 */     this.gunModel['È'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  895 */     this.gunModel['È'].setRotationPoint(-102.5F, 24.0F, -0.25F);
/*      */     
/*  897 */     this.gunModel['É'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F);
/*  898 */     this.gunModel['É'].setRotationPoint(-99.5F, 27.0F, 2.75F);
/*      */     
/*  900 */     this.gunModel['Ê'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  901 */     this.gunModel['Ê'].setRotationPoint(-102.5F, 27.0F, 1.75F);
/*      */     
/*  903 */     this.gunModel['Ë'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 31, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  904 */     this.gunModel['Ë'].setRotationPoint(-105.5F, -7.0F, -0.25F);
/*      */     
/*  906 */     this.gunModel['Ì'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  907 */     this.gunModel['Ì'].setRotationPoint(-105.5F, 24.0F, -0.25F);
/*      */     
/*  909 */     this.gunModel['Í'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  910 */     this.gunModel['Í'].setRotationPoint(-105.5F, 27.0F, 1.75F);
/*      */     
/*  912 */     this.gunModel['Î'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 31, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  913 */     this.gunModel['Î'].setRotationPoint(-108.5F, -7.0F, -0.25F);
/*      */     
/*  915 */     this.gunModel['Ï'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 12, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F);
/*  916 */     this.gunModel['Ï'].setRotationPoint(-109.5F, 24.0F, -0.25F);
/*      */     
/*  918 */     this.gunModel['Ð'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F);
/*  919 */     this.gunModel['Ð'].setRotationPoint(-111.5F, 27.0F, 1.75F);
/*      */     
/*  921 */     this.gunModel['Ñ'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  922 */     this.gunModel['Ñ'].setRotationPoint(-108.5F, 24.0F, -0.25F);
/*      */     
/*  924 */     this.gunModel['Ò'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.75F, 0.0F, -3.0F, 0.75F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  925 */     this.gunModel['Ò'].setRotationPoint(-108.5F, 27.0F, 1.75F);
/*      */     
/*  927 */     this.gunModel['Ó'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 15, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  928 */     this.gunModel['Ó'].setRotationPoint(-111.5F, -1.0F, -0.25F);
/*      */     
/*  930 */     this.gunModel['Ô'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 10, 12, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  931 */     this.gunModel['Ô'].setRotationPoint(-110.5F, 14.0F, -0.25F);
/*      */     
/*  933 */     this.gunModel['Õ'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 4, 12, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  934 */     this.gunModel['Õ'].setRotationPoint(-113.5F, -5.0F, -0.25F);
/*      */     
/*  936 */     this.gunModel['Ö'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  937 */     this.gunModel['Ö'].setRotationPoint(-112.5F, -7.0F, -0.25F);
/*      */     
/*  939 */     this.gunModel['×'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 31, 10, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  940 */     this.gunModel['×'].setRotationPoint(-106.0F, -7.0F, 0.75F);
/*      */     
/*  942 */     this.gunModel['Ø'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  943 */     this.gunModel['Ø'].setRotationPoint(-106.0F, 24.0F, 0.75F);
/*      */     
/*  945 */     this.gunModel['Ù'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F);
/*  946 */     this.gunModel['Ù'].setRotationPoint(-106.0F, 27.0F, 2.75F);
/*      */     
/*  948 */     this.gunModel['Ú'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  949 */     this.gunModel['Ú'].setRotationPoint(-102.5F, -9.0F, -0.25F);
/*      */     
/*  951 */     this.gunModel['Û'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  952 */     this.gunModel['Û'].setRotationPoint(-105.5F, -9.0F, -0.25F);
/*      */     
/*  954 */     this.gunModel['Ü'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 12, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  955 */     this.gunModel['Ü'].setRotationPoint(-108.5F, -9.0F, -0.25F);
/*      */     
/*  957 */     this.gunModel['Ý'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 12, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  958 */     this.gunModel['Ý'].setRotationPoint(-112.5F, -9.0F, -0.25F);
/*      */     
/*  960 */     this.gunModel['Þ'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 10, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  961 */     this.gunModel['Þ'].setRotationPoint(-99.5F, -9.0F, 0.75F);
/*      */     
/*  963 */     this.gunModel['ß'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 10, 0.0F, -0.75F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  964 */     this.gunModel['ß'].setRotationPoint(-106.5F, -9.0F, 0.75F);
/*      */     
/*  966 */     this.gunModel['à'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  967 */     this.gunModel['à'].setRotationPoint(-95.5F, -7.0F, -0.25F);
/*      */     
/*  969 */     this.gunModel['á'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  970 */     this.gunModel['á'].setRotationPoint(-95.5F, -9.0F, -0.25F);
/*      */     
/*  972 */     this.gunModel['â'].addShapeBox(12.0F, -18.0F, -5.5F, 20, 3, 12, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  973 */     this.gunModel['â'].setRotationPoint(-52.5F, -9.0F, -0.25F);
/*      */     
/*  975 */     this.gunModel['ã'].addShapeBox(12.0F, -18.0F, -5.5F, 8, 3, 3, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.3F, 0.0F);
/*  976 */     this.gunModel['ã'].setRotationPoint(-32.5F, -10.0F, -0.25F);
/*      */     
/*  978 */     this.gunModel['ä'].addShapeBox(12.0F, -18.0F, -5.5F, 8, 2, 3, 0.0F, 0.0F, -2.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F);
/*  979 */     this.gunModel['ä'].setRotationPoint(-32.5F, -9.0F, 8.75F);
/*      */     
/*  981 */     this.gunModel['å'].addShapeBox(12.0F, -18.0F, -5.5F, 8, 3, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.3F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.3F, 0.0F);
/*  982 */     this.gunModel['å'].setRotationPoint(-32.5F, -10.0F, 8.75F);
/*      */     
/*  984 */     this.gunModel['æ'].addShapeBox(12.0F, -18.0F, -5.5F, 8, 2, 3, 0.0F, 0.0F, -2.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F);
/*  985 */     this.gunModel['æ'].setRotationPoint(-32.5F, -9.0F, -0.25F);
/*      */     
/*  987 */     this.gunModel['ç'].addShapeBox(12.0F, -18.0F, -5.5F, 8, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  988 */     this.gunModel['ç'].setRotationPoint(-32.5F, -8.0F, 2.75F);
/*      */     
/*  990 */     this.gunModel['è'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 5, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  991 */     this.gunModel['è'].setRotationPoint(-55.5F, -5.0F, -0.25F);
/*      */     
/*  993 */     this.gunModel['é'].addShapeBox(12.0F, -18.0F, -5.5F, 35, 6, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  994 */     this.gunModel['é'].setRotationPoint(-90.5F, -6.0F, -1.75F);
/*      */     
/*  996 */     this.gunModel['ê'].addShapeBox(12.0F, -18.0F, -5.5F, 35, 5, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  997 */     this.gunModel['ê'].setRotationPoint(-90.5F, 0.0F, -1.75F);
/*      */     
/*  999 */     this.gunModel['ë'].addShapeBox(12.0F, -18.0F, -5.5F, 35, 3, 15, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1000 */     this.gunModel['ë'].setRotationPoint(-90.5F, -9.0F, -1.75F);
/*      */     
/* 1002 */     this.gunModel['ì'].addShapeBox(12.0F, -18.0F, -5.5F, 37, 1, 15, 0.0F, 0.0F, 0.5F, -5.0F, 2.0F, 0.5F, -5.0F, 2.0F, 0.5F, -5.0F, 0.0F, 0.5F, -5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1003 */     this.gunModel['ì'].setRotationPoint(-90.5F, -10.0F, -1.75F);
/*      */     
/* 1005 */     this.gunModel['í'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 9, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1006 */     this.gunModel['í'].setRotationPoint(-55.5F, -7.0F, 1.25F);
/*      */     
/* 1008 */     this.gunModel['î'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 31, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1009 */     this.gunModel['î'].setRotationPoint(-99.0F, -7.0F, -0.25F);
/*      */     
/* 1011 */     this.gunModel['ï'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1012 */     this.gunModel['ï'].setRotationPoint(-99.0F, 24.0F, -0.25F);
/*      */     
/* 1014 */     this.gunModel['ð'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1015 */     this.gunModel['ð'].setRotationPoint(-99.0F, 27.0F, 1.75F);
/*      */     
/* 1017 */     this.gunModel['ñ'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1018 */     this.gunModel['ñ'].setRotationPoint(-99.0F, -9.0F, -0.25F);
/*      */     
/* 1020 */     this.gunModel['ò'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 31, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1021 */     this.gunModel['ò'].setRotationPoint(-97.0F, -7.0F, -0.25F);
/*      */     
/* 1023 */     this.gunModel['ó'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1024 */     this.gunModel['ó'].setRotationPoint(-97.0F, 24.0F, -0.25F);
/*      */     
/* 1026 */     this.gunModel['ô'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1027 */     this.gunModel['ô'].setRotationPoint(-97.0F, 27.0F, 1.75F);
/*      */     
/* 1029 */     this.gunModel['õ'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1030 */     this.gunModel['õ'].setRotationPoint(-97.0F, -9.0F, -0.25F);
/*      */     
/* 1032 */     this.gunModel['ö'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel['ö'].setRotationPoint(-1.5F, -16.0F, 3.25F);
/*      */     
/* 1035 */     this.gunModel['÷'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1036 */     this.gunModel['÷'].setRotationPoint(-1.5F, -14.0F, 3.25F);
/*      */     
/* 1038 */     this.gunModel['ø'].addShapeBox(12.0F, -18.0F, -5.5F, 14, 1, 1, 0.0F, 2.15F, 1.0F, -0.5F, 1.0F, 1.0F, -0.5F, 1.0F, 1.0F, 0.0F, 2.15F, 1.0F, 0.0F, 5.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['ø'].setRotationPoint(-16.5F, -15.0F, 7.25F);
/*      */     
/* 1041 */     this.gunModel['ù'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, 3.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 5.15F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 5.15F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['ù'].setRotationPoint(-13.5F, -17.0F, 6.25F);
/*      */     
/* 1044 */     this.gunModel['ú'].addShapeBox(12.0F, -18.0F, -5.5F, 6, 4, 1, 0.0F, 0.0F, -2.65F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1045 */     this.gunModel['ú'].setRotationPoint(-30.5F, -12.0F, 2.5F);
/*      */     
/* 1047 */     this.gunModel['û'].addShapeBox(12.0F, -18.0F, -5.5F, 2, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1048 */     this.gunModel['û'].setRotationPoint(-32.5F, -9.0F, 2.75F);
/*      */     
/* 1050 */     this.gunModel['ü'].addShapeBox(12.0F, -18.0F, -5.5F, 6, 4, 1, 0.0F, 0.0F, -2.65F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1051 */     this.gunModel['ü'].setRotationPoint(-30.5F, -12.0F, 7.75F);
/*      */     
/* 1053 */     this.gunModel['ý'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 1, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.35F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 1054 */     this.gunModel['ý'].setRotationPoint(-27.5F, -12.0F, 3.5F);
/*      */     
/* 1056 */     this.gunModel['þ'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 1, 0.0F, 0.0F, -1.35F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1057 */     this.gunModel['þ'].setRotationPoint(-27.5F, -12.0F, 7.0F);
/*      */     
/* 1059 */     this.gunModel['ÿ'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 1, 0.0F, 0.0F, -1.65F, 1.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1060 */     this.gunModel['ÿ'].setRotationPoint(-30.5F, -11.0F, 7.0F);
/*      */     
/* 1062 */     this.gunModel['Ā'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 1, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -1.65F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F);
/* 1063 */     this.gunModel['Ā'].setRotationPoint(-30.5F, -11.0F, 3.5F);
/*      */     
/* 1065 */     this.gunModel['ā'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 1, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 1.0F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F);
/* 1066 */     this.gunModel['ā'].setRotationPoint(-30.5F, -9.5F, 5.5F);
/*      */     
/* 1068 */     this.gunModel['Ă'].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 1, 0.0F, 0.0F, -1.5F, 1.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 1.5F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F);
/* 1069 */     this.gunModel['Ă'].setRotationPoint(-27.5F, -10.75F, 5.5F);
/*      */     
/* 1071 */     this.gunModel['ă'].addShapeBox(12.0F, -18.0F, -5.5F, 23, 2, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1072 */     this.gunModel['ă'].setRotationPoint(-24.5F, -10.75F, 2.75F);
/*      */     
/* 1074 */     this.gunModel['Ą'].addBox(12.0F, -18.0F, -5.5F, 9, 4, 3, 0.0F);
/* 1075 */     this.gunModel['Ą'].setRotationPoint(-10.5F, -12.0F, -0.25F);
/*      */     
/* 1077 */     this.gunModel['ą'].addBox(12.0F, -18.0F, -5.5F, 4, 1, 3, 0.0F);
/* 1078 */     this.gunModel['ą'].setRotationPoint(-14.5F, -9.0F, -0.25F);
/*      */     
/* 1080 */     this.gunModel['Ć'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1081 */     this.gunModel['Ć'].setRotationPoint(0.5F, -12.5F, 9.75F);
/*      */     
/* 1083 */     this.gunModel['ć'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F);
/* 1084 */     this.gunModel['ć'].setRotationPoint(0.0F, -11.0F, 9.5F);
/*      */     
/* 1086 */     this.gunModel['Ĉ'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 2, 0.0F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1087 */     this.gunModel['Ĉ'].setRotationPoint(0.0F, -14.0F, 9.5F);
/*      */     
/* 1089 */     this.gunModel['ĉ'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1090 */     this.gunModel['ĉ'].setRotationPoint(0.0F, -12.5F, 9.5F);
/*      */     
/* 1092 */     this.gunModel['Ċ'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F);
/* 1093 */     this.gunModel['Ċ'].setRotationPoint(0.0F, -11.0F, 0.0F);
/*      */     
/* 1095 */     this.gunModel['ċ'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 2, 0.0F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1096 */     this.gunModel['ċ'].setRotationPoint(0.0F, -14.0F, 0.0F);
/*      */     
/* 1098 */     this.gunModel['Č'].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1099 */     this.gunModel['Č'].setRotationPoint(0.0F, -12.5F, 0.0F);
/*      */     
/* 1101 */     this.gunModel['č'].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1102 */     this.gunModel['č'].setRotationPoint(0.5F, -12.5F, -0.25F);
/*      */     
/* 1104 */     this.gunModel['Ď'].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 12, 0.0F, 0.25F, -0.75F, -3.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.25F, -0.75F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -3.0F);
/* 1105 */     this.gunModel['Ď'].setRotationPoint(-39.0F, 13.0F, -0.25F);
/*      */     
/*      */ 
/* 1108 */     this.defaultScopeModel = new ModelRendererTurbo[67];
/* 1109 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/* 1110 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/* 1111 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/* 1112 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 713, 57, this.textureX, this.textureY);
/* 1113 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 1114 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/* 1115 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 1116 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/* 1117 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/* 1118 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 1119 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/* 1120 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/* 1121 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/* 1122 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 961, 25, this.textureX, this.textureY);
/* 1123 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/* 1124 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 905, 169, this.textureX, this.textureY);
/* 1125 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/* 1126 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 481, 121, this.textureX, this.textureY);
/* 1127 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 513, 121, this.textureX, this.textureY);
/* 1128 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 825, 57, this.textureX, this.textureY);
/* 1129 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 857, 57, this.textureX, this.textureY);
/* 1130 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 657, 65, this.textureX, this.textureY);
/* 1131 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 441, 73, this.textureX, this.textureY);
/* 1132 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/* 1133 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 1134 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/* 1135 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 513, 9, this.textureX, this.textureY);
/* 1136 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 609, 9, this.textureX, this.textureY);
/* 1137 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 641, 9, this.textureX, this.textureY);
/* 1138 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/* 1139 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/* 1140 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 697, 73, this.textureX, this.textureY);
/* 1141 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 761, 81, this.textureX, this.textureY);
/* 1142 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 833, 81, this.textureX, this.textureY);
/* 1143 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/* 1144 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 177, 89, this.textureX, this.textureY);
/* 1145 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/* 1146 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/* 1147 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 161, 177, this.textureX, this.textureY);
/* 1148 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 385, 177, this.textureX, this.textureY);
/* 1149 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 617, 121, this.textureX, this.textureY);
/* 1150 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 713, 137, this.textureX, this.textureY);
/* 1151 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/* 1152 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/* 1153 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 369, 89, this.textureX, this.textureY);
/* 1154 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/* 1155 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 657, 9, this.textureX, this.textureY);
/* 1156 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 745, 9, this.textureX, this.textureY);
/* 1157 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 777, 9, this.textureX, this.textureY);
/* 1158 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 889, 9, this.textureX, this.textureY);
/* 1159 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 921, 9, this.textureX, this.textureY);
/* 1160 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 945, 9, this.textureX, this.textureY);
/* 1161 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/* 1162 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 937, 17, this.textureX, this.textureY);
/* 1163 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 961, 17, this.textureX, this.textureY);
/* 1164 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 1165 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/* 1166 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/* 1167 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/* 1168 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/* 1169 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/* 1170 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/* 1171 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/* 1172 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 745, 1, this.textureX, this.textureY);
/* 1173 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 865, 89, this.textureX, this.textureY);
/* 1174 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 1001, 89, this.textureX, this.textureY);
/* 1175 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 433, 97, this.textureX, this.textureY);
/*      */     
/* 1177 */     this.defaultScopeModel[0].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1178 */     this.defaultScopeModel[0].setRotationPoint(123.5F, -24.0F, 3.75F);
/*      */     
/* 1180 */     this.defaultScopeModel[1].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1181 */     this.defaultScopeModel[1].setRotationPoint(123.5F, -26.0F, 3.75F);
/*      */     
/* 1183 */     this.defaultScopeModel[2].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1184 */     this.defaultScopeModel[2].setRotationPoint(123.5F, -28.0F, 3.75F);
/*      */     
/* 1186 */     this.defaultScopeModel[3].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1187 */     this.defaultScopeModel[3].setRotationPoint(123.5F, -29.0F, 3.75F);
/*      */     
/* 1189 */     this.defaultScopeModel[4].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1190 */     this.defaultScopeModel[4].setRotationPoint(123.5F, -32.0F, 2.25F);
/*      */     
/* 1192 */     this.defaultScopeModel[5].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1193 */     this.defaultScopeModel[5].setRotationPoint(123.5F, -30.0F, 2.75F);
/*      */     
/* 1195 */     this.defaultScopeModel[6].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1196 */     this.defaultScopeModel[6].setRotationPoint(123.5F, -33.0F, 7.25F);
/*      */     
/* 1198 */     this.defaultScopeModel[7].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1199 */     this.defaultScopeModel[7].setRotationPoint(123.5F, -30.0F, 1.75F);
/*      */     
/* 1201 */     this.defaultScopeModel[8].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1202 */     this.defaultScopeModel[8].setRotationPoint(123.5F, -32.0F, 8.25F);
/*      */     
/* 1204 */     this.defaultScopeModel[9].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1205 */     this.defaultScopeModel[9].setRotationPoint(123.5F, -30.0F, 7.75F);
/*      */     
/* 1207 */     this.defaultScopeModel[10].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1208 */     this.defaultScopeModel[10].setRotationPoint(123.5F, -30.0F, 8.75F);
/*      */     
/* 1210 */     this.defaultScopeModel[11].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1211 */     this.defaultScopeModel[11].setRotationPoint(123.5F, -33.0F, 1.25F);
/*      */     
/* 1213 */     this.defaultScopeModel[12].addShapeBox(12.0F, -18.0F, -5.5F, 2, 3, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1214 */     this.defaultScopeModel[12].setRotationPoint(124.5F, -32.0F, 5.25F);
/*      */     
/* 1216 */     this.defaultScopeModel[13].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1217 */     this.defaultScopeModel[13].setRotationPoint(125.5F, -23.0F, 3.75F);
/*      */     
/* 1219 */     this.defaultScopeModel[14].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1220 */     this.defaultScopeModel[14].setRotationPoint(124.5F, -23.0F, 3.75F);
/*      */     
/* 1222 */     this.defaultScopeModel[15].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1223 */     this.defaultScopeModel[15].setRotationPoint(128.5F, -23.0F, 1.75F);
/*      */     
/* 1225 */     this.defaultScopeModel[16].addShapeBox(12.0F, -18.0F, -5.5F, 1, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1226 */     this.defaultScopeModel[16].setRotationPoint(131.5F, -23.0F, 1.75F);
/*      */     
/* 1228 */     this.defaultScopeModel[17].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1229 */     this.defaultScopeModel[17].setRotationPoint(128.5F, -25.0F, 1.75F);
/*      */     
/* 1231 */     this.defaultScopeModel[18].addShapeBox(12.0F, -18.0F, -5.5F, 6, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1232 */     this.defaultScopeModel[18].setRotationPoint(122.5F, -22.0F, 2.75F);
/*      */     
/* 1234 */     this.defaultScopeModel[19].addShapeBox(12.0F, -18.0F, -5.5F, 3, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1235 */     this.defaultScopeModel[19].setRotationPoint(122.5F, -22.5F, 2.75F);
/*      */     
/* 1237 */     this.defaultScopeModel[20].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 4, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F);
/* 1238 */     this.defaultScopeModel[20].setRotationPoint(123.5F, -21.0F, 0.75F);
/*      */     
/* 1240 */     this.defaultScopeModel[21].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 4, 0.0F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1241 */     this.defaultScopeModel[21].setRotationPoint(123.5F, -24.0F, 0.75F);
/*      */     
/* 1243 */     this.defaultScopeModel[22].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 4, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1244 */     this.defaultScopeModel[22].setRotationPoint(123.5F, -22.5F, 0.75F);
/*      */     
/* 1246 */     this.defaultScopeModel[23].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1247 */     this.defaultScopeModel[23].setRotationPoint(124.75F, -22.0F, 8.25F);
/*      */     
/* 1249 */     this.defaultScopeModel[24].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1250 */     this.defaultScopeModel[24].setRotationPoint(124.75F, -22.5F, 8.25F);
/*      */     
/* 1252 */     this.defaultScopeModel[25].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1253 */     this.defaultScopeModel[25].setRotationPoint(124.75F, -23.0F, 8.25F);
/*      */     
/* 1255 */     this.defaultScopeModel[26].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1256 */     this.defaultScopeModel[26].setRotationPoint(130.25F, -22.0F, 8.25F);
/*      */     
/* 1258 */     this.defaultScopeModel[27].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1259 */     this.defaultScopeModel[27].setRotationPoint(130.25F, -22.5F, 8.25F);
/*      */     
/* 1261 */     this.defaultScopeModel[28].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1262 */     this.defaultScopeModel[28].setRotationPoint(130.25F, -23.0F, 8.25F);
/*      */     
/* 1264 */     this.defaultScopeModel[29].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1265 */     this.defaultScopeModel[29].setRotationPoint(127.5F, -25.0F, 3.75F);
/*      */     
/* 1267 */     this.defaultScopeModel[30].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1268 */     this.defaultScopeModel[30].setRotationPoint(-4.5F, -25.0F, 4.25F);
/*      */     
/* 1270 */     this.defaultScopeModel[31].addShapeBox(12.0F, -18.0F, -5.5F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1271 */     this.defaultScopeModel[31].setRotationPoint(-4.5F, -27.0F, 4.25F);
/*      */     
/* 1273 */     this.defaultScopeModel[32].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1274 */     this.defaultScopeModel[32].setRotationPoint(-4.5F, -28.0F, 4.25F);
/*      */     
/* 1276 */     this.defaultScopeModel[33].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1277 */     this.defaultScopeModel[33].setRotationPoint(-4.5F, -29.0F, 3.25F);
/*      */     
/* 1279 */     this.defaultScopeModel[34].addShapeBox(12.0F, -18.0F, -5.5F, 4, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1280 */     this.defaultScopeModel[34].setRotationPoint(-4.5F, -32.0F, 2.25F);
/*      */     
/* 1282 */     this.defaultScopeModel[35].addShapeBox(12.0F, -18.0F, -5.5F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1283 */     this.defaultScopeModel[35].setRotationPoint(-4.5F, -32.0F, 7.25F);
/*      */     
/* 1285 */     this.defaultScopeModel[36].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1286 */     this.defaultScopeModel[36].setRotationPoint(-2.5F, -24.0F, 3.75F);
/*      */     
/* 1288 */     this.defaultScopeModel[37].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1289 */     this.defaultScopeModel[37].setRotationPoint(-3.5F, -24.0F, 3.75F);
/*      */     
/* 1291 */     this.defaultScopeModel[38].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1292 */     this.defaultScopeModel[38].setRotationPoint(0.5F, -24.0F, 1.75F);
/*      */     
/* 1294 */     this.defaultScopeModel[39].addShapeBox(12.0F, -18.0F, -5.5F, 1, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1295 */     this.defaultScopeModel[39].setRotationPoint(3.5F, -24.0F, 1.75F);
/*      */     
/* 1297 */     this.defaultScopeModel[40].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1298 */     this.defaultScopeModel[40].setRotationPoint(0.5F, -26.0F, 1.75F);
/*      */     
/* 1300 */     this.defaultScopeModel[41].addShapeBox(12.0F, -18.0F, -5.5F, 6, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1301 */     this.defaultScopeModel[41].setRotationPoint(-5.5F, -23.0F, 2.75F);
/*      */     
/* 1303 */     this.defaultScopeModel[42].addShapeBox(12.0F, -18.0F, -5.5F, 3, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1304 */     this.defaultScopeModel[42].setRotationPoint(-5.5F, -23.5F, 2.75F);
/*      */     
/* 1306 */     this.defaultScopeModel[43].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 4, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F);
/* 1307 */     this.defaultScopeModel[43].setRotationPoint(-4.5F, -22.0F, 0.75F);
/*      */     
/* 1309 */     this.defaultScopeModel[44].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 4, 0.0F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1310 */     this.defaultScopeModel[44].setRotationPoint(-4.5F, -25.0F, 0.75F);
/*      */     
/* 1312 */     this.defaultScopeModel[45].addShapeBox(12.0F, -18.0F, -5.5F, 5, 2, 4, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1313 */     this.defaultScopeModel[45].setRotationPoint(-4.5F, -23.5F, 0.75F);
/*      */     
/* 1315 */     this.defaultScopeModel[46].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1316 */     this.defaultScopeModel[46].setRotationPoint(-3.25F, -23.0F, 8.25F);
/*      */     
/* 1318 */     this.defaultScopeModel[47].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1319 */     this.defaultScopeModel[47].setRotationPoint(-3.25F, -23.5F, 8.25F);
/*      */     
/* 1321 */     this.defaultScopeModel[48].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1322 */     this.defaultScopeModel[48].setRotationPoint(-3.25F, -24.0F, 8.25F);
/*      */     
/* 1324 */     this.defaultScopeModel[49].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1325 */     this.defaultScopeModel[49].setRotationPoint(2.25F, -23.0F, 8.25F);
/*      */     
/* 1327 */     this.defaultScopeModel[50].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1328 */     this.defaultScopeModel[50].setRotationPoint(2.25F, -23.5F, 8.25F);
/*      */     
/* 1330 */     this.defaultScopeModel[51].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1331 */     this.defaultScopeModel[51].setRotationPoint(2.25F, -24.0F, 8.25F);
/*      */     
/* 1333 */     this.defaultScopeModel[52].addShapeBox(12.0F, -18.0F, -5.5F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1334 */     this.defaultScopeModel[52].setRotationPoint(-0.5F, -26.0F, 3.75F);
/*      */     
/* 1336 */     this.defaultScopeModel[53].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1337 */     this.defaultScopeModel[53].setRotationPoint(-4.5F, -33.0F, 2.25F);
/*      */     
/* 1339 */     this.defaultScopeModel[54].addShapeBox(12.0F, -18.0F, -5.5F, 4, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1340 */     this.defaultScopeModel[54].setRotationPoint(-4.5F, -33.0F, 7.25F);
/*      */     
/* 1342 */     this.defaultScopeModel[55].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1343 */     this.defaultScopeModel[55].setRotationPoint(-3.0F, -30.2F, 4.25F);
/*      */     
/* 1345 */     this.defaultScopeModel[56].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1346 */     this.defaultScopeModel[56].setRotationPoint(-3.0F, -30.2F, 5.25F);
/*      */     
/* 1348 */     this.defaultScopeModel[57].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1349 */     this.defaultScopeModel[57].setRotationPoint(-3.0F, -31.7F, 4.75F);
/*      */     
/* 1351 */     this.defaultScopeModel[58].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1352 */     this.defaultScopeModel[58].setRotationPoint(-3.0F, -31.7F, 6.25F);
/*      */     
/* 1354 */     this.defaultScopeModel[59].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1355 */     this.defaultScopeModel[59].setRotationPoint(-3.0F, -31.7F, 5.75F);
/*      */     
/* 1357 */     this.defaultScopeModel[60].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, -1.25F, -1.5F, 0.0F, -1.25F, -1.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1358 */     this.defaultScopeModel[60].setRotationPoint(-3.0F, -31.7F, 4.75F);
/*      */     
/* 1360 */     this.defaultScopeModel[61].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, -1.5F, 0.0F, -1.25F, -1.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F);
/* 1361 */     this.defaultScopeModel[61].setRotationPoint(-3.0F, -31.7F, 5.75F);
/*      */     
/* 1363 */     this.defaultScopeModel[62].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, -1.5F, 0.0F, -1.25F, -1.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F);
/* 1364 */     this.defaultScopeModel[62].setRotationPoint(-3.0F, -30.7F, 4.75F);
/*      */     
/* 1366 */     this.defaultScopeModel[63].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, -1.5F, 0.0F, -1.25F, -1.5F);
/* 1367 */     this.defaultScopeModel[63].setRotationPoint(-3.0F, -30.7F, 5.75F);
/*      */     
/* 1369 */     this.defaultScopeModel[64].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 4, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1370 */     this.defaultScopeModel[64].setRotationPoint(-3.5F, -26.75F, 3.75F);
/*      */     
/* 1372 */     this.defaultScopeModel[65].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 4, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1373 */     this.defaultScopeModel[65].setRotationPoint(-3.5F, -27.25F, 3.75F);
/*      */     
/* 1375 */     this.defaultScopeModel[66].addShapeBox(12.0F, -18.0F, -5.5F, 2, 1, 4, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1376 */     this.defaultScopeModel[66].setRotationPoint(-3.5F, -27.75F, 3.75F);
/*      */     
/*      */ 
/* 1379 */     this.ammoModel = new ModelRendererTurbo[20];
/* 1380 */     this.ammoModel[0] = new ModelRendererTurbo(this, 217, 169, this.textureX, this.textureY);
/* 1381 */     this.ammoModel[1] = new ModelRendererTurbo(this, 409, 161, this.textureX, this.textureY);
/* 1382 */     this.ammoModel[2] = new ModelRendererTurbo(this, 873, 161, this.textureX, this.textureY);
/* 1383 */     this.ammoModel[3] = new ModelRendererTurbo(this, 993, 161, this.textureX, this.textureY);
/* 1384 */     this.ammoModel[4] = new ModelRendererTurbo(this, 281, 169, this.textureX, this.textureY);
/* 1385 */     this.ammoModel[5] = new ModelRendererTurbo(this, 937, 161, this.textureX, this.textureY);
/* 1386 */     this.ammoModel[6] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/* 1387 */     this.ammoModel[7] = new ModelRendererTurbo(this, 457, 169, this.textureX, this.textureY);
/* 1388 */     this.ammoModel[8] = new ModelRendererTurbo(this, 793, 25, this.textureX, this.textureY);
/* 1389 */     this.ammoModel[9] = new ModelRendererTurbo(this, 793, 81, this.textureX, this.textureY);
/* 1390 */     this.ammoModel[10] = new ModelRendererTurbo(this, 937, 81, this.textureX, this.textureY);
/* 1391 */     this.ammoModel[11] = new ModelRendererTurbo(this, 553, 105, this.textureX, this.textureY);
/* 1392 */     this.ammoModel[12] = new ModelRendererTurbo(this, 601, 105, this.textureX, this.textureY);
/* 1393 */     this.ammoModel[13] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/* 1394 */     this.ammoModel[14] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/* 1395 */     this.ammoModel[15] = new ModelRendererTurbo(this, 89, 161, this.textureX, this.textureY);
/* 1396 */     this.ammoModel[16] = new ModelRendererTurbo(this, 201, 161, this.textureX, this.textureY);
/* 1397 */     this.ammoModel[17] = new ModelRendererTurbo(this, 513, 169, this.textureX, this.textureY);
/* 1398 */     this.ammoModel[18] = new ModelRendererTurbo(this, 753, 169, this.textureX, this.textureY);
/* 1399 */     this.ammoModel[19] = new ModelRendererTurbo(this, 777, 169, this.textureX, this.textureY);
/*      */     
/* 1401 */     this.ammoModel[0].addShapeBox(12.0F, -18.0F, -5.5F, 21, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1402 */     this.ammoModel[0].setRotationPoint(10.0F, 13.5F, 1.25F);
/*      */     
/* 1404 */     this.ammoModel[1].addShapeBox(12.0F, -18.0F, -5.5F, 1, 15, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1405 */     this.ammoModel[1].setRotationPoint(10.0F, -1.5F, 1.25F);
/*      */     
/* 1407 */     this.ammoModel[2].addShapeBox(12.0F, -18.0F, -5.5F, 3, 15, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.ammoModel[2].setRotationPoint(13.0F, -1.5F, 1.25F);
/*      */     
/* 1410 */     this.ammoModel[3].addShapeBox(12.0F, -18.0F, -5.5F, 5, 15, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1411 */     this.ammoModel[3].setRotationPoint(18.0F, -1.5F, 1.25F);
/*      */     
/* 1413 */     this.ammoModel[4].addShapeBox(12.0F, -18.0F, -5.5F, 7, 15, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1414 */     this.ammoModel[4].setRotationPoint(24.0F, -1.5F, 1.25F);
/*      */     
/* 1416 */     this.ammoModel[5].addShapeBox(12.0F, -18.0F, -5.5F, 2, 15, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1417 */     this.ammoModel[5].setRotationPoint(22.5F, -1.5F, 2.25F);
/*      */     
/* 1419 */     this.ammoModel[6].addShapeBox(12.0F, -18.0F, -5.5F, 2, 15, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.ammoModel[6].setRotationPoint(16.0F, -1.5F, 2.25F);
/*      */     
/* 1422 */     this.ammoModel[7].addShapeBox(12.0F, -18.0F, -5.5F, 2, 15, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1423 */     this.ammoModel[7].setRotationPoint(11.0F, -1.5F, 2.25F);
/*      */     
/* 1425 */     this.ammoModel[8].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 9, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1426 */     this.ammoModel[8].setRotationPoint(17.0F, 12.5F, 1.25F);
/*      */     
/* 1428 */     this.ammoModel[9].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1429 */     this.ammoModel[9].setRotationPoint(16.0F, 12.5F, 1.25F);
/*      */     
/* 1431 */     this.ammoModel[10].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 9, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1432 */     this.ammoModel[10].setRotationPoint(12.0F, 12.5F, 1.25F);
/*      */     
/* 1434 */     this.ammoModel[11].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1435 */     this.ammoModel[11].setRotationPoint(11.0F, 12.5F, 1.25F);
/*      */     
/* 1437 */     this.ammoModel[12].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 9, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1438 */     this.ammoModel[12].setRotationPoint(23.5F, 12.5F, 1.25F);
/*      */     
/* 1440 */     this.ammoModel[13].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1441 */     this.ammoModel[13].setRotationPoint(22.5F, 12.5F, 1.25F);
/*      */     
/* 1443 */     this.ammoModel[14].addShapeBox(12.0F, -18.0F, -5.5F, 17, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1444 */     this.ammoModel[14].setRotationPoint(12.0F, 15.5F, 0.25F);
/*      */     
/* 1446 */     this.ammoModel[15].addShapeBox(12.0F, -18.0F, -5.5F, 17, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1447 */     this.ammoModel[15].setRotationPoint(12.0F, 15.0F, 0.25F);
/*      */     
/* 1449 */     this.ammoModel[16].addShapeBox(12.0F, -18.0F, -5.5F, 17, 1, 1, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1450 */     this.ammoModel[16].setRotationPoint(12.0F, 15.5F, 10.25F);
/*      */     
/* 1452 */     this.ammoModel[17].addShapeBox(12.0F, -18.0F, -5.5F, 17, 1, 1, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1453 */     this.ammoModel[17].setRotationPoint(12.0F, 15.0F, 10.25F);
/*      */     
/* 1455 */     this.ammoModel[18].addShapeBox(12.0F, -18.0F, -5.5F, 1, 18, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1456 */     this.ammoModel[18].setRotationPoint(9.0F, -1.5F, 1.25F);
/*      */     
/* 1458 */     this.ammoModel[19].addShapeBox(12.0F, -18.0F, -5.5F, 1, 18, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1459 */     this.ammoModel[19].setRotationPoint(31.0F, -1.5F, 1.25F);
/*      */     
/*      */ 
/* 1462 */     this.pumpModel = new ModelRendererTurbo[11];
/* 1463 */     this.pumpModel[0] = new ModelRendererTurbo(this, 657, 177, this.textureX, this.textureY);
/* 1464 */     this.pumpModel[1] = new ModelRendererTurbo(this, 801, 177, this.textureX, this.textureY);
/* 1465 */     this.pumpModel[2] = new ModelRendererTurbo(this, 513, 185, this.textureX, this.textureY);
/* 1466 */     this.pumpModel[3] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/* 1467 */     this.pumpModel[4] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/* 1468 */     this.pumpModel[5] = new ModelRendererTurbo(this, 921, 1, this.textureX, this.textureY);
/* 1469 */     this.pumpModel[6] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 1470 */     this.pumpModel[7] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 1471 */     this.pumpModel[8] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 1472 */     this.pumpModel[9] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 1473 */     this.pumpModel[10] = new ModelRendererTurbo(this, 377, 129, this.textureX, this.textureY);
/*      */     
/* 1475 */     this.pumpModel[0].addShapeBox(12.0F, -18.0F, -5.5F, 26, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1476 */     this.pumpModel[0].setRotationPoint(-19.5F, -12.0F, 2.75F);
/*      */     
/* 1478 */     this.pumpModel[1].addShapeBox(12.0F, -18.0F, -5.5F, 26, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1479 */     this.pumpModel[1].setRotationPoint(-19.5F, -14.0F, 2.75F);
/*      */     
/* 1481 */     this.pumpModel[2].addShapeBox(12.0F, -18.0F, -5.5F, 26, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1482 */     this.pumpModel[2].setRotationPoint(-19.5F, -16.0F, 2.75F);
/*      */     
/* 1484 */     this.pumpModel[3].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1485 */     this.pumpModel[3].setRotationPoint(-20.0F, -13.5F, 4.25F);
/*      */     
/* 1487 */     this.pumpModel[4].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1488 */     this.pumpModel[4].setRotationPoint(-20.0F, -14.5F, 4.25F);
/*      */     
/* 1490 */     this.pumpModel[5].addShapeBox(12.0F, -18.0F, -5.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1491 */     this.pumpModel[5].setRotationPoint(-20.0F, -12.5F, 4.25F);
/*      */     
/* 1493 */     this.pumpModel[6].addShapeBox(12.0F, -18.0F, -5.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1494 */     this.pumpModel[6].setRotationPoint(-14.0F, -16.0F, 0.75F);
/*      */     
/* 1496 */     this.pumpModel[7].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F);
/* 1497 */     this.pumpModel[7].setRotationPoint(-14.0F, -14.0F, -1.25F);
/*      */     
/* 1499 */     this.pumpModel[8].addShapeBox(12.0F, -18.0F, -5.5F, 3, 4, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1500 */     this.pumpModel[8].setRotationPoint(-13.5F, -10.0F, -3.25F);
/*      */     
/* 1502 */     this.pumpModel[9].addShapeBox(12.0F, -18.0F, -5.5F, 3, 3, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F);
/* 1503 */     this.pumpModel[9].setRotationPoint(-13.5F, -6.0F, -5.75F);
/*      */     
/* 1505 */     this.pumpModel[10].addShapeBox(12.0F, -18.0F, -5.5F, 5, 5, 5, 0.0F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F);
/* 1506 */     this.pumpModel[10].setRotationPoint(-14.5F, -8.0F, -19.0F);
/* 1507 */     this.pumpModel[10].rotateAngleX = -0.7853982F;
/*      */     
/*      */ 
/* 1510 */     this.scopeAttachPoint = new Vector3f(0.9375F, 3.0F, 0.0F);
/*      */     
/* 1512 */     translateAll(0.0F, -10.0F, -0.35F);
/* 1513 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/* 1515 */     this.gunSlideDistance = 0.0F;
/* 1516 */     this.animationType = EnumAnimationType.CUSTOM;this.tiltGun = 7.0F;
/* 1517 */     this.rotateGunVertical = 3.0F;
/* 1518 */     this.translateGun = new Vector3f(0.15F, 0.05F, 0.0F);
/*      */     
/* 1520 */     this.rotateClipVertical = 5.0F;
/* 1521 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/* 1522 */     this.pumpDelayAfterReload = 50;this.pumpDelay = 10;
/* 1523 */     this.pumpTime = 20;
/* 1524 */     this.gripIsOnPump = false;
/* 1525 */     this.pumpHandleDistance = 0.4F;
/*      */     
/*      */ 
/* 1528 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelcslr4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */