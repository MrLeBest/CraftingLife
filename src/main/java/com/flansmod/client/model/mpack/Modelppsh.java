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
/*      */ public class Modelppsh
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelppsh()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ż'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 545, 25, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 593, 25, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 641, 25, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 689, 25, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 833, 25, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 881, 25, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 929, 25, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 521, 49, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 721, 49, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 601, 49, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 913, 49, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 945, 57, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 809, 49, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 641, 65, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 689, 65, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 857, 65, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 513, 73, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 737, 73, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 793, 89, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 905, 81, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 977, 81, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 337, 113, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 521, 25, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 961, 25, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 809, 25, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 593, 121, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 857, 25, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 977, 57, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 769, 73, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 465, 113, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 385, 121, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 857, 121, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 105, 129, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 153, 129, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 329, 129, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 697, 129, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 249, 137, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 465, 137, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 513, 137, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 561, 137, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 361, 145, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 953, 137, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 593, 145, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 633, 145, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 673, 145, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 729, 145, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 841, 145, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 145, 153, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 281, 153, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 321, 153, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 697, 153, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 873, 153, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 921, 153, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 385, 161, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 441, 161, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 537, 145, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 153, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 161, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 561, 161, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 161, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 953, 161, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 169, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 169, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 169, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 593, 169, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 633, 169, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 673, 169, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 169, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 169, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 177, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 905, 177, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 177, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 697, 177, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 753, 177, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 177, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 177, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 537, 177, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 185, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 185, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 185, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 185, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 185, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 185, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 561, 185, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 585, 193, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 193, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 785, 185, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 873, 185, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 273, 201, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 945, 185, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 345, 193, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 833, 201, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 529, 201, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 657, 201, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 569, 9, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 697, 9, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 761, 9, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 385, 225, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 601, 225, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 897, 201, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 489, 137, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 969, 201, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 209, 209, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 241, 225, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 297, 225, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 873, 225, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 201, 233, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 441, 73, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 105, 185, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 745, 201, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 577, 25, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 625, 25, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 41, 209, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 81, 209, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 673, 25, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 689, 25, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 721, 25, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 769, 25, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 857, 25, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 913, 25, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 929, 25, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 673, 33, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 785, 33, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 857, 33, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 913, 33, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 929, 33, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 729, 33, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 993, 33, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 1001, 41, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 801, 225, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 185, 209, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 345, 233, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 241, 209, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 409, 233, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 585, 49, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 473, 233, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 625, 49, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 945, 49, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 673, 65, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 385, 209, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 873, 209, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 1009, 49, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 977, 57, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 641, 65, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 793, 65, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 857, 65, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 513, 65, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 889, 65, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 1009, 65, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 529, 233, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 641, 113, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 105, 153, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 353, 289, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 425, 289, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 137, 289, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 497, 289, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 697, 289, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 929, 289, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 977, 289, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 161, 297, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 521, 297, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 721, 297, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 865, 297, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 105, 201, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 145, 105, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 449, 129, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 49, 305, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 865, 49, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 905, 73, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 577, 73, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 569, 305, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 721, 73, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 185, 289, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 417, 217, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 513, 9, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 953, 297, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 97, 305, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 633, 305, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 673, 305, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 745, 305, this.textureX, this.textureY);
/*  350 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 785, 305, this.textureX, this.textureY);
/*  351 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 569, 217, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 297, 289, this.textureX, this.textureY);
/*  353 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 721, 289, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*  355 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 705, 1, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 857, 73, this.textureX, this.textureY);
/*  359 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 921, 1, this.textureX, this.textureY);
/*  360 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*  361 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 577, 9, this.textureX, this.textureY);
/*  363 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 705, 9, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 769, 9, this.textureX, this.textureY);
/*  365 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 873, 9, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 921, 9, this.textureX, this.textureY);
/*  367 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 969, 9, this.textureX, this.textureY);
/*  369 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  371 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 889, 297, this.textureX, this.textureY);
/*  373 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 809, 305, this.textureX, this.textureY);
/*  374 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/*  375 */     this.gunModel['š'] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 657, 145, this.textureX, this.textureY);
/*  377 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 177, 153, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 305, 153, this.textureX, this.textureY);
/*  379 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 905, 153, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 97, 241, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 905, 81, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 513, 81, this.textureX, this.textureY);
/*  383 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  385 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 793, 97, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1001, 153, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 841, 89, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 185, 313, this.textureX, this.textureY);
/*  389 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 265, 313, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 601, 25, this.textureX, this.textureY);
/*  391 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 753, 169, this.textureX, this.textureY);
/*  393 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 465, 113, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 497, 113, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 889, 25, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 1017, 17, this.textureX, this.textureY);
/*  397 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 521, 25, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 329, 313, this.textureX, this.textureY);
/*  400 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 545, 305, this.textureX, this.textureY);
/*      */     
/*  402 */     this.gunModel[0].addShapeBox(43.0F, -64.0F, -11.0F, 61, 20, 20, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  403 */     this.gunModel[0].setRotationPoint(-45.0F, 16.5F, 1.0F);
/*      */     
/*  405 */     this.gunModel[1].addShapeBox(43.0F, -64.0F, -11.0F, 61, 2, 20, 0.0F, 0.0F, -1.0F, -2.0F, 0.75F, -1.0F, -2.0F, 0.75F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  406 */     this.gunModel[1].setRotationPoint(-45.0F, 15.5F, 1.0F);
/*      */     
/*  408 */     this.gunModel[2].addShapeBox(43.0F, -64.0F, -11.0F, 61, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.75F, -1.0F, -1.0F, 0.75F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/*  409 */     this.gunModel[2].setRotationPoint(-45.0F, 36.5F, 1.0F);
/*      */     
/*  411 */     this.gunModel[3].addShapeBox(43.0F, -64.0F, -11.0F, 10, 3, 18, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 3.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, -1.0F);
/*  412 */     this.gunModel[3].setRotationPoint(-55.0F, 36.5F, 2.0F);
/*      */     
/*  414 */     this.gunModel[4].addShapeBox(43.0F, -64.0F, -11.0F, 10, 3, 18, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 4.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 4.0F, -1.0F);
/*  415 */     this.gunModel[4].setRotationPoint(-65.0F, 40.5F, 2.0F);
/*      */     
/*  417 */     this.gunModel[5].addShapeBox(43.0F, -64.0F, -11.0F, 10, 3, 18, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 7.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 7.0F, -1.0F);
/*  418 */     this.gunModel[5].setRotationPoint(-75.0F, 45.5F, 2.0F);
/*      */     
/*  420 */     this.gunModel[6].addShapeBox(43.0F, -64.0F, -11.0F, 10, 3, 18, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 11.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 11.0F, -1.0F);
/*  421 */     this.gunModel[6].setRotationPoint(-85.0F, 53.5F, 2.0F);
/*      */     
/*  423 */     this.gunModel[7].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  424 */     this.gunModel[7].setRotationPoint(-88.0F, 65.5F, 2.0F);
/*      */     
/*  426 */     this.gunModel[8].addShapeBox(43.0F, -64.0F, -11.0F, 7, 2, 18, 0.0F, -1.0F, 1.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.65F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/*  427 */     this.gunModel[8].setRotationPoint(-95.0F, 65.5F, 2.0F);
/*      */     
/*  429 */     this.gunModel[9].addShapeBox(43.0F, -64.0F, -11.0F, 4, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  430 */     this.gunModel[9].setRotationPoint(-99.0F, 63.5F, 2.0F);
/*      */     
/*  432 */     this.gunModel[10].addShapeBox(43.0F, -64.0F, -11.0F, 4, 4, 18, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  433 */     this.gunModel[10].setRotationPoint(-103.0F, 63.5F, 2.0F);
/*      */     
/*  435 */     this.gunModel[11].addShapeBox(43.0F, -64.0F, -11.0F, 27, 2, 18, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 11.0F, -1.0F);
/*  436 */     this.gunModel[11].setRotationPoint(-130.0F, 65.5F, 2.0F);
/*      */     
/*  438 */     this.gunModel[12].addShapeBox(43.0F, -64.0F, -11.0F, 27, 2, 18, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 9.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 9.0F, -1.0F);
/*  439 */     this.gunModel[12].setRotationPoint(-157.0F, 76.5F, 2.0F);
/*      */     
/*  441 */     this.gunModel[13].addShapeBox(43.0F, -64.0F, -11.0F, 23, 2, 18, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 6.0F, -1.0F);
/*  442 */     this.gunModel[13].setRotationPoint(-180.0F, 85.5F, 2.0F);
/*      */     
/*  444 */     this.gunModel[14].addShapeBox(43.0F, -64.0F, -11.0F, 7, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  445 */     this.gunModel[14].setRotationPoint(-187.0F, 91.5F, 2.0F);
/*      */     
/*  447 */     this.gunModel[15].addShapeBox(43.0F, -64.0F, -11.0F, 4, 2, 18, 0.0F, 0.0F, -5.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -5.0F, -2.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  448 */     this.gunModel[15].setRotationPoint(-59.0F, 15.5F, 2.0F);
/*      */     
/*  450 */     this.gunModel[16].addShapeBox(43.0F, -64.0F, -11.0F, 10, 20, 18, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  451 */     this.gunModel[16].setRotationPoint(-55.0F, 16.5F, 2.0F);
/*      */     
/*  453 */     this.gunModel[17].addShapeBox(43.0F, -64.0F, -11.0F, 4, 2, 18, 0.0F, 0.0F, -5.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -5.5F, -2.0F, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.5F, 0.0F);
/*  454 */     this.gunModel[17].setRotationPoint(-63.0F, 19.5F, 2.0F);
/*      */     
/*  456 */     this.gunModel[18].addShapeBox(43.0F, -64.0F, -11.0F, 4, 2, 18, 0.0F, 0.0F, -3.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -3.5F, -2.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/*  457 */     this.gunModel[18].setRotationPoint(-67.0F, 24.0F, 2.0F);
/*      */     
/*  459 */     this.gunModel[19].addShapeBox(43.0F, -64.0F, -11.0F, 4, 20, 18, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/*  460 */     this.gunModel[19].setRotationPoint(-59.0F, 16.5F, 2.0F);
/*      */     
/*  462 */     this.gunModel[20].addShapeBox(43.0F, -64.0F, -11.0F, 4, 18, 18, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/*  463 */     this.gunModel[20].setRotationPoint(-63.0F, 20.5F, 2.0F);
/*      */     
/*  465 */     this.gunModel[21].addShapeBox(43.0F, -64.0F, -11.0F, 4, 2, 18, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  466 */     this.gunModel[21].setRotationPoint(-71.0F, 26.5F, 2.0F);
/*      */     
/*  468 */     this.gunModel[22].addShapeBox(43.0F, -64.0F, -11.0F, 2, 18, 18, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  469 */     this.gunModel[22].setRotationPoint(-65.0F, 24.5F, 2.0F);
/*      */     
/*  471 */     this.gunModel[23].addShapeBox(43.0F, -64.0F, -11.0F, 2, 17, 18, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.6F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 4.6F, 0.0F);
/*  472 */     this.gunModel[23].setRotationPoint(-67.0F, 25.5F, 2.0F);
/*      */     
/*  474 */     this.gunModel[24].addShapeBox(43.0F, -64.0F, -11.0F, 4, 17, 18, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 7.8F, 0.0F, 0.0F, 4.6F, 0.0F, 0.0F, 4.6F, 0.0F, 0.0F, 7.8F, 0.0F);
/*  475 */     this.gunModel[24].setRotationPoint(-71.0F, 25.5F, 2.0F);
/*      */     
/*  477 */     this.gunModel[25].addShapeBox(43.0F, -64.0F, -11.0F, 6, 2, 18, 0.0F, 0.0F, -3.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -3.5F, -2.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/*  478 */     this.gunModel[25].setRotationPoint(-77.0F, 28.5F, 2.0F);
/*      */     
/*  480 */     this.gunModel[26].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 18, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  481 */     this.gunModel[26].setRotationPoint(-80.0F, 31.0F, 2.0F);
/*      */     
/*  483 */     this.gunModel[27].addShapeBox(43.0F, -64.0F, -11.0F, 5, 2, 18, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  484 */     this.gunModel[27].setRotationPoint(-85.0F, 31.5F, 2.0F);
/*      */     
/*  486 */     this.gunModel[28].addShapeBox(43.0F, -64.0F, -11.0F, 6, 1, 18, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[28].setRotationPoint(-91.0F, 33.0F, 2.0F);
/*      */     
/*  489 */     this.gunModel[29].addShapeBox(43.0F, -64.0F, -11.0F, 5, 1, 18, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  490 */     this.gunModel[29].setRotationPoint(-96.0F, 33.0F, 2.0F);
/*      */     
/*  492 */     this.gunModel[30].addShapeBox(43.0F, -64.0F, -11.0F, 7, 1, 18, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  493 */     this.gunModel[30].setRotationPoint(-103.0F, 31.5F, 2.0F);
/*      */     
/*  495 */     this.gunModel[31].addShapeBox(43.0F, -64.0F, -11.0F, 6, 1, 18, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  496 */     this.gunModel[31].setRotationPoint(-109.0F, 29.5F, 2.0F);
/*      */     
/*  498 */     this.gunModel[32].addShapeBox(43.0F, -64.0F, -11.0F, 23, 1, 18, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  499 */     this.gunModel[32].setRotationPoint(-132.0F, 29.5F, 2.0F);
/*      */     
/*  501 */     this.gunModel[33].addShapeBox(43.0F, -64.0F, -11.0F, 19, 1, 18, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  502 */     this.gunModel[33].setRotationPoint(-151.0F, 32.5F, 2.0F);
/*      */     
/*  504 */     this.gunModel[34].addShapeBox(43.0F, -64.0F, -11.0F, 19, 1, 18, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  505 */     this.gunModel[34].setRotationPoint(-170.0F, 34.5F, 2.0F);
/*      */     
/*  507 */     this.gunModel[35].addShapeBox(43.0F, -64.0F, -11.0F, 16, 1, 18, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  508 */     this.gunModel[35].setRotationPoint(-186.0F, 36.5F, 2.0F);
/*      */     
/*  510 */     this.gunModel[36].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 18, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  511 */     this.gunModel[36].setRotationPoint(-190.0F, 38.5F, 2.0F);
/*      */     
/*  513 */     this.gunModel[37].addShapeBox(43.0F, -64.0F, -11.0F, 1, 49, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  514 */     this.gunModel[37].setRotationPoint(-191.0F, 41.5F, 2.0F);
/*      */     
/*  516 */     this.gunModel[38].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 18, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/*  517 */     this.gunModel[38].setRotationPoint(-190.0F, 91.5F, 2.0F);
/*      */     
/*  519 */     this.gunModel[39].addShapeBox(43.0F, -64.0F, -11.0F, 4, 18, 18, 0.0F, 0.0F, -4.65F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.65F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 4.8F, 0.0F, 0.0F, 4.8F, 0.0F, 0.0F, 8.0F, 0.0F);
/*  520 */     this.gunModel[39].setRotationPoint(-75.0F, 27.5F, 2.0F);
/*      */     
/*  522 */     this.gunModel[40].addShapeBox(43.0F, -64.0F, -11.0F, 2, 21, 18, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -4.65F, 0.0F, 0.0F, -4.65F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 7.4F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 7.4F, 0.0F);
/*  523 */     this.gunModel[40].setRotationPoint(-77.0F, 27.5F, 2.0F);
/*      */     
/*  525 */     this.gunModel[41].addShapeBox(43.0F, -64.0F, -11.0F, 3, 23, 18, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 5.4F, 0.0F, 0.0F, 5.4F, 0.0F, 0.0F, 9.0F, 0.0F);
/*  526 */     this.gunModel[41].setRotationPoint(-80.0F, 27.5F, 2.0F);
/*      */     
/*  528 */     this.gunModel[42].addShapeBox(43.0F, -64.0F, -11.0F, 5, 27, 18, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 11.0F, 0.0F);
/*  529 */     this.gunModel[42].setRotationPoint(-85.0F, 27.5F, 2.0F);
/*      */     
/*  531 */     this.gunModel[43].addShapeBox(43.0F, -64.0F, -11.0F, 3, 31, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  532 */     this.gunModel[43].setRotationPoint(-88.0F, 34.0F, 2.0F);
/*      */     
/*  534 */     this.gunModel[44].addShapeBox(43.0F, -64.0F, -11.0F, 3, 31, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.35F, 0.0F);
/*  535 */     this.gunModel[44].setRotationPoint(-91.0F, 34.0F, 2.0F);
/*      */     
/*  537 */     this.gunModel[45].addShapeBox(43.0F, -64.0F, -11.0F, 3, 31, 18, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.15F, 0.0F);
/*  538 */     this.gunModel[45].setRotationPoint(-94.0F, 34.0F, 2.0F);
/*      */     
/*  540 */     this.gunModel[46].addShapeBox(43.0F, -64.0F, -11.0F, 1, 31, 18, 0.0F, 0.0F, 1.2F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 1.2F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  541 */     this.gunModel[46].setRotationPoint(-95.0F, 34.0F, 2.0F);
/*      */     
/*  543 */     this.gunModel[47].addShapeBox(43.0F, -64.0F, -11.0F, 1, 31, 18, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.2F, 0.0F, 0.0F, 1.2F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  544 */     this.gunModel[47].setRotationPoint(-96.0F, 34.0F, 2.0F);
/*      */     
/*  546 */     this.gunModel[48].addShapeBox(43.0F, -64.0F, -11.0F, 3, 31, 18, 0.0F, 0.0F, 2.35F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.35F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  547 */     this.gunModel[48].setRotationPoint(-99.0F, 34.0F, 2.0F);
/*      */     
/*  549 */     this.gunModel[49].addShapeBox(43.0F, -64.0F, -11.0F, 4, 32, 18, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.35F, 0.0F, 0.0F, 1.35F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  550 */     this.gunModel[49].setRotationPoint(-103.0F, 33.0F, 2.0F);
/*      */     
/*  552 */     this.gunModel[50].addShapeBox(43.0F, -64.0F, -11.0F, 6, 32, 18, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.95F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.95F, 0.0F);
/*  553 */     this.gunModel[50].setRotationPoint(-109.0F, 33.0F, 2.0F);
/*      */     
/*  555 */     this.gunModel[51].addShapeBox(43.0F, -64.0F, -11.0F, 21, 16, 18, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  556 */     this.gunModel[51].setRotationPoint(-130.0F, 33.0F, 2.0F);
/*      */     
/*  558 */     this.gunModel[52].addShapeBox(43.0F, -64.0F, -11.0F, 2, 41, 18, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.15F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 3.15F, 0.0F);
/*  559 */     this.gunModel[52].setRotationPoint(-132.0F, 33.0F, 2.0F);
/*      */     
/*  561 */     this.gunModel[53].addShapeBox(43.0F, -64.0F, -11.0F, 19, 42, 18, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 8.5F, 0.0F);
/*  562 */     this.gunModel[53].setRotationPoint(-151.0F, 33.0F, 2.0F);
/*      */     
/*  564 */     this.gunModel[54].addShapeBox(43.0F, -64.0F, -11.0F, 6, 46, 18, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 4.5F, 0.0F);
/*  565 */     this.gunModel[54].setRotationPoint(-157.0F, 35.0F, 2.0F);
/*      */     
/*  567 */     this.gunModel[55].addShapeBox(43.0F, -64.0F, -11.0F, 13, 49, 18, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 3.9F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.9F, 0.0F);
/*  568 */     this.gunModel[55].setRotationPoint(-170.0F, 36.0F, 2.0F);
/*      */     
/*  570 */     this.gunModel[56].addShapeBox(43.0F, -64.0F, -11.0F, 10, 51, 18, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  571 */     this.gunModel[56].setRotationPoint(-180.0F, 37.5F, 2.0F);
/*      */     
/*  573 */     this.gunModel[57].addShapeBox(43.0F, -64.0F, -11.0F, 6, 51, 18, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  574 */     this.gunModel[57].setRotationPoint(-186.0F, 37.5F, 2.0F);
/*      */     
/*  576 */     this.gunModel[58].addShapeBox(43.0F, -64.0F, -11.0F, 1, 51, 18, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  577 */     this.gunModel[58].setRotationPoint(-187.0F, 37.5F, 2.0F);
/*      */     
/*  579 */     this.gunModel[59].addShapeBox(43.0F, -64.0F, -11.0F, 3, 51, 18, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  580 */     this.gunModel[59].setRotationPoint(-190.0F, 37.5F, 2.0F);
/*      */     
/*  582 */     this.gunModel[60].addShapeBox(43.0F, -64.0F, -11.0F, 2, 3, 10, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  583 */     this.gunModel[60].setRotationPoint(-44.0F, 38.5F, 6.0F);
/*      */     
/*  585 */     this.gunModel[61].addShapeBox(43.0F, -64.0F, -11.0F, 2, 9, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  586 */     this.gunModel[61].setRotationPoint(-43.75F, 41.5F, 6.0F);
/*      */     
/*  588 */     this.gunModel[62].addShapeBox(43.0F, -64.0F, -11.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  589 */     this.gunModel[62].setRotationPoint(-43.75F, 50.5F, 6.0F);
/*      */     
/*  591 */     this.gunModel[63].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/*  592 */     this.gunModel[63].setRotationPoint(-41.75F, 53.5F, 6.0F);
/*      */     
/*  594 */     this.gunModel[64].addShapeBox(43.0F, -64.0F, -11.0F, 19, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[64].setRotationPoint(-39.75F, 54.25F, 6.0F);
/*      */     
/*  597 */     this.gunModel[65].addShapeBox(43.0F, -64.0F, -11.0F, 9, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  598 */     this.gunModel[65].setRotationPoint(-20.75F, 54.25F, 6.0F);
/*      */     
/*  600 */     this.gunModel[66].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  601 */     this.gunModel[66].setRotationPoint(-11.75F, 53.25F, 6.0F);
/*      */     
/*  603 */     this.gunModel[67].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  604 */     this.gunModel[67].setRotationPoint(-9.75F, 52.75F, 6.0F);
/*      */     
/*  606 */     this.gunModel[68].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  607 */     this.gunModel[68].setRotationPoint(-7.75F, 51.25F, 6.0F);
/*      */     
/*  609 */     this.gunModel[69].addShapeBox(43.0F, -64.0F, -11.0F, 1, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  610 */     this.gunModel[69].setRotationPoint(-6.75F, 44.25F, 6.0F);
/*      */     
/*  612 */     this.gunModel[70].addShapeBox(43.0F, -64.0F, -11.0F, 1, 3, 10, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  613 */     this.gunModel[70].setRotationPoint(-6.75F, 41.25F, 6.0F);
/*      */     
/*  615 */     this.gunModel[71].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  616 */     this.gunModel[71].setRotationPoint(-5.25F, 40.25F, 6.0F);
/*      */     
/*  618 */     this.gunModel[72].addShapeBox(43.0F, -64.0F, -11.0F, 7, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[72].setRotationPoint(-2.75F, 38.25F, 6.0F);
/*      */     
/*  621 */     this.gunModel[73].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 10, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  622 */     this.gunModel[73].setRotationPoint(-4.25F, 39.25F, 6.0F);
/*      */     
/*  624 */     this.gunModel[74].addShapeBox(43.0F, -64.0F, -11.0F, 5, 2, 5, 0.0F, 2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[74].setRotationPoint(-35.75F, 38.25F, 8.5F);
/*      */     
/*  627 */     this.gunModel[75].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 5, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  628 */     this.gunModel[75].setRotationPoint(-34.75F, 40.25F, 8.5F);
/*      */     
/*  630 */     this.gunModel[76].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[76].setRotationPoint(-34.75F, 42.25F, 8.5F);
/*      */     
/*  633 */     this.gunModel[77].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  634 */     this.gunModel[77].setRotationPoint(-34.75F, 46.25F, 8.5F);
/*      */     
/*  636 */     this.gunModel[78].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  637 */     this.gunModel[78].setRotationPoint(-34.0F, 48.25F, 8.5F);
/*      */     
/*  639 */     this.gunModel[79].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  640 */     this.gunModel[79].setRotationPoint(-32.75F, 50.25F, 8.5F);
/*      */     
/*  642 */     this.gunModel[80].addShapeBox(43.0F, -64.0F, -11.0F, 21, 5, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  643 */     this.gunModel[80].setRotationPoint(-18.0F, 5.0F, 5.5F);
/*      */     
/*  645 */     this.gunModel[81].addShapeBox(43.0F, -64.0F, -11.0F, 16, 2, 2, 0.0F, -5.0F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  646 */     this.gunModel[81].setRotationPoint(-15.0F, 4.0F, 5.5F);
/*      */     
/*  648 */     this.gunModel[82].addShapeBox(43.0F, -64.0F, -11.0F, 6, 3, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  649 */     this.gunModel[82].setRotationPoint(-10.0F, 1.0F, 5.5F);
/*      */     
/*  651 */     this.gunModel[83].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 2, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  652 */     this.gunModel[83].setRotationPoint(-8.5F, 0.0F, 5.5F);
/*      */     
/*  654 */     this.gunModel[84].addShapeBox(43.0F, -64.0F, -11.0F, 46, 5, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  655 */     this.gunModel[84].setRotationPoint(-21.0F, 11.0F, 7.0F);
/*      */     
/*  657 */     this.gunModel[85].addShapeBox(43.0F, -64.0F, -11.0F, 4, 4, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  658 */     this.gunModel[85].setRotationPoint(96.5F, 14.0F, 3.0F);
/*      */     
/*  660 */     this.gunModel[86].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  661 */     this.gunModel[86].setRotationPoint(96.5F, 13.0F, 3.0F);
/*      */     
/*  663 */     this.gunModel[87].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/*  664 */     this.gunModel[87].setRotationPoint(96.5F, 12.0F, 3.0F);
/*      */     
/*  666 */     this.gunModel[88].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  667 */     this.gunModel[88].setRotationPoint(96.5F, 19.0F, 3.0F);
/*      */     
/*  669 */     this.gunModel[89].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  670 */     this.gunModel[89].setRotationPoint(96.5F, 20.0F, 3.0F);
/*      */     
/*  672 */     this.gunModel[90].addShapeBox(43.0F, -64.0F, -11.0F, 4, 4, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  673 */     this.gunModel[90].setRotationPoint(121.5F, 14.0F, 3.0F);
/*      */     
/*  675 */     this.gunModel[91].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  676 */     this.gunModel[91].setRotationPoint(121.5F, 13.0F, 3.0F);
/*      */     
/*  678 */     this.gunModel[92].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/*  679 */     this.gunModel[92].setRotationPoint(121.5F, 12.0F, 3.0F);
/*      */     
/*  681 */     this.gunModel[93].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  682 */     this.gunModel[93].setRotationPoint(121.5F, 19.0F, 3.0F);
/*      */     
/*  684 */     this.gunModel[94].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[94].setRotationPoint(121.5F, 20.0F, 3.0F);
/*      */     
/*  687 */     this.gunModel[95].addShapeBox(43.0F, -64.0F, -11.0F, 4, 4, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  688 */     this.gunModel[95].setRotationPoint(146.5F, 14.0F, 3.0F);
/*      */     
/*  690 */     this.gunModel[96].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  691 */     this.gunModel[96].setRotationPoint(146.5F, 13.0F, 3.0F);
/*      */     
/*  693 */     this.gunModel[97].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/*  694 */     this.gunModel[97].setRotationPoint(146.5F, 12.0F, 3.0F);
/*      */     
/*  696 */     this.gunModel[98].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  697 */     this.gunModel[98].setRotationPoint(146.5F, 19.0F, 3.0F);
/*      */     
/*  699 */     this.gunModel[99].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  700 */     this.gunModel[99].setRotationPoint(146.5F, 20.0F, 3.0F);
/*      */     
/*  702 */     this.gunModel[100].addShapeBox(43.0F, -64.0F, -11.0F, 4, 4, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  703 */     this.gunModel[100].setRotationPoint(170.5F, 14.0F, 3.0F);
/*      */     
/*  705 */     this.gunModel[101].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  706 */     this.gunModel[101].setRotationPoint(170.5F, 13.0F, 3.0F);
/*      */     
/*  708 */     this.gunModel[102].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/*  709 */     this.gunModel[102].setRotationPoint(170.5F, 12.0F, 3.0F);
/*      */     
/*  711 */     this.gunModel[103].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  712 */     this.gunModel[103].setRotationPoint(170.5F, 19.0F, 3.0F);
/*      */     
/*  714 */     this.gunModel[104].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 16, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 3.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  715 */     this.gunModel[104].setRotationPoint(170.5F, 20.0F, 3.0F);
/*      */     
/*  717 */     this.gunModel[105].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  718 */     this.gunModel[105].setRotationPoint(185.5F, 14.0F, 3.0F);
/*      */     
/*  720 */     this.gunModel[106].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 4, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  721 */     this.gunModel[106].setRotationPoint(185.5F, 13.0F, 3.0F);
/*      */     
/*  723 */     this.gunModel[107].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 4, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/*  724 */     this.gunModel[107].setRotationPoint(185.5F, 12.0F, 3.0F);
/*      */     
/*  726 */     this.gunModel[108].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  727 */     this.gunModel[108].setRotationPoint(185.5F, 19.0F, 3.0F);
/*      */     
/*  729 */     this.gunModel[109].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 14, 0.0F, 0.75F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[109].setRotationPoint(185.5F, 20.0F, 3.0F);
/*      */     
/*  732 */     this.gunModel[110].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  733 */     this.gunModel[110].setRotationPoint(75.75F, 14.0F, 3.0F);
/*      */     
/*  735 */     this.gunModel[111].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  736 */     this.gunModel[111].setRotationPoint(75.75F, 13.0F, 3.0F);
/*      */     
/*  738 */     this.gunModel[112].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  739 */     this.gunModel[112].setRotationPoint(75.75F, 12.0F, 3.0F);
/*      */     
/*  741 */     this.gunModel[113].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  742 */     this.gunModel[113].setRotationPoint(75.75F, 19.0F, 3.0F);
/*      */     
/*  744 */     this.gunModel[114].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  745 */     this.gunModel[114].setRotationPoint(75.75F, 20.0F, 3.0F);
/*      */     
/*  747 */     this.gunModel[115].addShapeBox(43.0F, -64.0F, -11.0F, 20, 3, 16, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  748 */     this.gunModel[115].setRotationPoint(84.5F, 21.5F, 3.0F);
/*      */     
/*  750 */     this.gunModel[116].addShapeBox(43.0F, -64.0F, -11.0F, 1, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  751 */     this.gunModel[116].setRotationPoint(186.5F, 12.0F, 3.0F);
/*      */     
/*  753 */     this.gunModel[117].addShapeBox(43.0F, -64.0F, -11.0F, 60, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  754 */     this.gunModel[117].setRotationPoint(-21.0F, 8.5F, 3.0F);
/*      */     
/*  756 */     this.gunModel[118].addShapeBox(43.0F, -64.0F, -11.0F, 4, 3, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -3.0F);
/*  757 */     this.gunModel[118].setRotationPoint(80.5F, 21.5F, 3.0F);
/*      */     
/*  759 */     this.gunModel[119].addShapeBox(43.0F, -64.0F, -11.0F, 4, 3, 16, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 4.0F, 0.0F);
/*  760 */     this.gunModel[119].setRotationPoint(76.5F, 21.5F, 3.0F);
/*      */     
/*  762 */     this.gunModel[120].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 16, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  763 */     this.gunModel[120].setRotationPoint(80.5F, 21.5F, 3.0F);
/*      */     
/*  765 */     this.gunModel[121].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 16, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  766 */     this.gunModel[121].setRotationPoint(76.5F, 21.5F, 3.0F);
/*      */     
/*  768 */     this.gunModel[122].addShapeBox(43.0F, -64.0F, -11.0F, 6, 7, 16, 0.0F, 0.25F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  769 */     this.gunModel[122].setRotationPoint(69.5F, 21.5F, 3.0F);
/*      */     
/*  771 */     this.gunModel[123].addShapeBox(43.0F, -64.0F, -11.0F, 4, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 1.25F, 0.5F, 0.0F, 1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  772 */     this.gunModel[123].setRotationPoint(70.5F, 12.5F, 3.0F);
/*      */     
/*  774 */     this.gunModel[124].addShapeBox(43.0F, -64.0F, -11.0F, 7, 3, 16, 0.0F, 0.5F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  775 */     this.gunModel[124].setRotationPoint(62.5F, 12.5F, 3.0F);
/*      */     
/*  777 */     this.gunModel[125].addShapeBox(43.0F, -64.0F, -11.0F, 9, 3, 17, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, 1.5F, 0.0F, 1.0F, 1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 1.0F, -4.0F, 0.0F, 1.0F, -4.0F, 0.0F, 0.0F, -1.75F, 0.0F);
/*  778 */     this.gunModel[125].setRotationPoint(25.75F, 16.0F, 2.5F);
/*      */     
/*  780 */     this.gunModel[126].addShapeBox(43.0F, -64.0F, -11.0F, 23, 1, 17, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  781 */     this.gunModel[126].setRotationPoint(35.75F, 14.25F, 2.5F);
/*      */     
/*  783 */     this.gunModel[127].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 17, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  784 */     this.gunModel[127].setRotationPoint(66.5F, 24.5F, 2.5F);
/*      */     
/*  786 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  787 */     this.gunModel[''].setRotationPoint(68.25F, 20.5F, 2.5F);
/*      */     
/*  789 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 17, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  790 */     this.gunModel[''].setRotationPoint(66.5F, 16.5F, 2.5F);
/*      */     
/*  792 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 4, 1, 17, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  793 */     this.gunModel[''].setRotationPoint(62.0F, 15.5F, 2.5F);
/*      */     
/*  795 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  796 */     this.gunModel[''].setRotationPoint(58.75F, 14.0F, 2.5F);
/*      */     
/*  798 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  799 */     this.gunModel[''].setRotationPoint(58.75F, 13.5F, 2.5F);
/*      */     
/*  801 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 6, 16, 0.0F, -0.75F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/*  802 */     this.gunModel[''].setRotationPoint(68.5F, 15.5F, 3.0F);
/*      */     
/*  804 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 3, 3, 16, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  805 */     this.gunModel[''].setRotationPoint(65.25F, 17.5F, 3.0F);
/*      */     
/*  807 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 2, 3, 16, 0.0F, -2.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, -2.75F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  808 */     this.gunModel[''].setRotationPoint(66.5F, 25.5F, 3.0F);
/*      */     
/*  810 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 16, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F);
/*  811 */     this.gunModel[''].setRotationPoint(65.25F, 15.5F, 3.0F);
/*      */     
/*  813 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 2, 16, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -1.5F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.0F);
/*  814 */     this.gunModel[''].setRotationPoint(64.25F, 15.5F, 3.0F);
/*      */     
/*  816 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 16, 0.0F, -0.75F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F);
/*  817 */     this.gunModel[''].setRotationPoint(61.25F, 15.5F, 3.0F);
/*      */     
/*  819 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 16, 0.0F, 0.5F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -2.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.5F, -2.5F, 0.0F);
/*  820 */     this.gunModel[''].setRotationPoint(60.0F, 12.5F, 3.0F);
/*      */     
/*  822 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 16, 0.0F, 0.5F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -3.0F, 0.0F, -0.75F, -2.5F, 0.0F, -0.75F, -2.5F, 0.0F, 0.5F, -3.0F, 0.0F);
/*  823 */     this.gunModel[''].setRotationPoint(59.25F, 12.5F, 3.0F);
/*      */     
/*  825 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 23, 5, 16, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -3.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.5F, -3.0F, 0.0F);
/*  826 */     this.gunModel[''].setRotationPoint(36.25F, 12.5F, 3.0F);
/*      */     
/*  828 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 10, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  829 */     this.gunModel[''].setRotationPoint(25.75F, 12.0F, 3.0F);
/*      */     
/*  831 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 3, 22, 20, 0.0F, 0.25F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F);
/*  832 */     this.gunModel[''].setRotationPoint(17.0F, 15.5F, 1.0F);
/*      */     
/*  834 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 2, 22, 20, 0.0F, 0.25F, -1.0F, 0.0F, 0.75F, -1.0F, -1.5F, 0.75F, -1.0F, -1.5F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.75F, 1.0F, -1.5F, 0.75F, 1.0F, -1.5F, 0.25F, 1.0F, 0.0F);
/*  835 */     this.gunModel[''].setRotationPoint(21.0F, 15.5F, 1.0F);
/*      */     
/*  837 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 7, 4, 17, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  838 */     this.gunModel[''].setRotationPoint(61.0F, 24.5F, 2.5F);
/*      */     
/*  840 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 7, 4, 17, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  841 */     this.gunModel[''].setRotationPoint(61.0F, 20.5F, 2.5F);
/*      */     
/*  843 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 6, 4, 17, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  844 */     this.gunModel[''].setRotationPoint(62.0F, 16.5F, 2.5F);
/*      */     
/*  846 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 2, 6, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel[''].setRotationPoint(58.25F, 28.5F, 2.5F);
/*      */     
/*  849 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  850 */     this.gunModel[''].setRotationPoint(60.25F, 28.5F, 2.5F);
/*      */     
/*  852 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  853 */     this.gunModel[''].setRotationPoint(58.25F, 34.5F, 2.5F);
/*      */     
/*  855 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 3, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  856 */     this.gunModel[''].setRotationPoint(56.25F, 36.5F, 2.5F);
/*      */     
/*  858 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 4, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel[''].setRotationPoint(54.75F, 34.5F, 2.5F);
/*      */     
/*  861 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  862 */     this.gunModel[''].setRotationPoint(54.75F, 36.5F, 2.5F);
/*      */     
/*  864 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 4, 6, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  865 */     this.gunModel[''].setRotationPoint(54.75F, 28.5F, 2.5F);
/*      */     
/*  867 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 6, 8, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  868 */     this.gunModel[''].setRotationPoint(54.75F, 20.5F, 2.5F);
/*      */     
/*  870 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 17, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  871 */     this.gunModel[''].setRotationPoint(61.0F, 16.5F, 2.5F);
/*      */     
/*  873 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 3, 6, 17, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  874 */     this.gunModel[''].setRotationPoint(58.5F, 14.5F, 2.5F);
/*      */     
/*  876 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 23, 6, 17, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  877 */     this.gunModel[''].setRotationPoint(36.0F, 14.5F, 2.5F);
/*      */     
/*  879 */     this.gunModel[''].addShapeBox(43.0F, -64.0F, -11.0F, 10, 6, 17, 0.0F, 0.25F, -2.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -2.75F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  880 */     this.gunModel[''].setRotationPoint(26.0F, 14.5F, 2.5F);
/*      */     
/*  882 */     this.gunModel[' '].addShapeBox(43.0F, -64.0F, -11.0F, 3, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  883 */     this.gunModel[' '].setRotationPoint(51.75F, 21.5F, 2.5F);
/*      */     
/*  885 */     this.gunModel['¡'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel['¡'].setRotationPoint(51.75F, 20.5F, 2.5F);
/*      */     
/*  888 */     this.gunModel['¢'].addShapeBox(43.0F, -64.0F, -11.0F, 17, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  889 */     this.gunModel['¢'].setRotationPoint(34.75F, 20.5F, 2.5F);
/*      */     
/*  891 */     this.gunModel['£'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 16, 17, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  892 */     this.gunModel['£'].setRotationPoint(33.75F, 22.5F, 2.5F);
/*      */     
/*  894 */     this.gunModel['¤'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 22, 17, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  895 */     this.gunModel['¤'].setRotationPoint(24.0F, 16.5F, 2.5F);
/*      */     
/*  897 */     this.gunModel['¥'].addShapeBox(43.0F, -64.0F, -11.0F, 8, 18, 17, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  898 */     this.gunModel['¥'].setRotationPoint(26.0F, 20.5F, 2.5F);
/*      */     
/*  900 */     this.gunModel['¦'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 2, 17, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  901 */     this.gunModel['¦'].setRotationPoint(34.0F, 20.5F, 2.5F);
/*      */     
/*  903 */     this.gunModel['§'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 5, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  904 */     this.gunModel['§'].setRotationPoint(-18.0F, 5.0F, 14.5F);
/*      */     
/*  906 */     this.gunModel['¨'].addShapeBox(43.0F, -64.0F, -11.0F, 16, 2, 2, 0.0F, -5.0F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  907 */     this.gunModel['¨'].setRotationPoint(-15.0F, 4.0F, 14.5F);
/*      */     
/*  909 */     this.gunModel['©'].addShapeBox(43.0F, -64.0F, -11.0F, 6, 3, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  910 */     this.gunModel['©'].setRotationPoint(-10.0F, 1.0F, 14.5F);
/*      */     
/*  912 */     this.gunModel['ª'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 2, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  913 */     this.gunModel['ª'].setRotationPoint(-8.5F, 0.0F, 14.5F);
/*      */     
/*  915 */     this.gunModel['«'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  916 */     this.gunModel['«'].setRotationPoint(186.5F, 12.0F, 15.0F);
/*      */     
/*  918 */     this.gunModel['¬'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 16, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  919 */     this.gunModel['¬'].setRotationPoint(23.75F, 15.75F, 3.0F);
/*      */     
/*  921 */     this.gunModel['­'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  922 */     this.gunModel['­'].setRotationPoint(-95.0F, 63.5F, 2.0F);
/*      */     
/*  924 */     this.gunModel['®'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  925 */     this.gunModel['®'].setRotationPoint(185.5F, 14.0F, 15.0F);
/*      */     
/*  927 */     this.gunModel['¯'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 4, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  928 */     this.gunModel['¯'].setRotationPoint(185.5F, 13.0F, 15.0F);
/*      */     
/*  930 */     this.gunModel['°'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 4, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/*  931 */     this.gunModel['°'].setRotationPoint(185.5F, 12.0F, 15.0F);
/*      */     
/*  933 */     this.gunModel['±'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  934 */     this.gunModel['±'].setRotationPoint(185.5F, 19.0F, 15.0F);
/*      */     
/*  936 */     this.gunModel['²'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 2, 0.0F, 0.75F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  937 */     this.gunModel['²'].setRotationPoint(185.5F, 20.0F, 17.0F);
/*      */     
/*  939 */     this.gunModel['³'].addBox(43.0F, -64.0F, -11.0F, 100, 6, 6, 0.0F);
/*  940 */     this.gunModel['³'].setRotationPoint(76.0F, 13.5F, 7.0F);
/*      */     
/*  942 */     this.gunModel['´'].addShapeBox(43.0F, -64.0F, -11.0F, 100, 2, 5, 0.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  943 */     this.gunModel['´'].setRotationPoint(76.0F, 11.5F, 8.5F);
/*      */     
/*  945 */     this.gunModel['µ'].addShapeBox(43.0F, -64.0F, -11.0F, 100, 2, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.0F);
/*  946 */     this.gunModel['µ'].setRotationPoint(76.0F, 19.5F, 8.5F);
/*      */     
/*  948 */     this.gunModel['¶'].addShapeBox(43.0F, -64.0F, -11.0F, 7, 2, 18, 0.0F, 0.0F, -1.0F, -2.0F, 1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  949 */     this.gunModel['¶'].setRotationPoint(-55.0F, 15.5F, 2.0F);
/*      */     
/*  951 */     this.gunModel['·'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 2, 18, 0.0F, 0.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/*  952 */     this.gunModel['·'].setRotationPoint(-47.0F, 15.5F, 2.0F);
/*      */     
/*  954 */     this.gunModel['¸'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 20, 18, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/*  955 */     this.gunModel['¸'].setRotationPoint(-47.0F, 16.5F, 2.0F);
/*      */     
/*  957 */     this.gunModel['¹'].addShapeBox(43.0F, -64.0F, -11.0F, 6, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  958 */     this.gunModel['¹'].setRotationPoint(184.5F, 8.5F, 3.0F);
/*      */     
/*  960 */     this.gunModel['º'].addShapeBox(43.0F, -64.0F, -11.0F, 11, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  961 */     this.gunModel['º'].setRotationPoint(93.5F, 8.5F, 3.0F);
/*      */     
/*  963 */     this.gunModel['»'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  964 */     this.gunModel['»'].setRotationPoint(118.0F, 8.5F, 3.0F);
/*      */     
/*  966 */     this.gunModel['¼'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  967 */     this.gunModel['¼'].setRotationPoint(143.0F, 8.5F, 3.0F);
/*      */     
/*  969 */     this.gunModel['½'].addShapeBox(43.0F, -64.0F, -11.0F, 10, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  970 */     this.gunModel['½'].setRotationPoint(167.0F, 8.5F, 3.0F);
/*      */     
/*  972 */     this.gunModel['¾'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  973 */     this.gunModel['¾'].setRotationPoint(80.5F, 8.0F, 7.0F);
/*      */     
/*  975 */     this.gunModel['¿'].addShapeBox(43.0F, -64.0F, -11.0F, 14, 4, 4, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  976 */     this.gunModel['¿'].setRotationPoint(79.5F, 8.0F, 3.0F);
/*      */     
/*  978 */     this.gunModel['À'].addShapeBox(43.0F, -64.0F, -11.0F, 14, 4, 4, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  979 */     this.gunModel['À'].setRotationPoint(104.0F, 8.0F, 3.0F);
/*      */     
/*  981 */     this.gunModel['Á'].addShapeBox(43.0F, -64.0F, -11.0F, 13, 4, 4, 0.0F, 0.5F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  982 */     this.gunModel['Á'].setRotationPoint(130.0F, 8.0F, 3.0F);
/*      */     
/*  984 */     this.gunModel['Â'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 4, 4, 0.0F, 0.5F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  985 */     this.gunModel['Â'].setRotationPoint(155.0F, 8.0F, 3.0F);
/*      */     
/*  987 */     this.gunModel['Ã'].addShapeBox(43.0F, -64.0F, -11.0F, 7, 4, 4, 0.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  988 */     this.gunModel['Ã'].setRotationPoint(177.0F, 8.0F, 3.0F);
/*      */     
/*  990 */     this.gunModel['Ä'].addShapeBox(43.0F, -64.0F, -11.0F, 7, 4, 4, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  991 */     this.gunModel['Ä'].setRotationPoint(177.0F, 8.0F, 15.0F);
/*      */     
/*  993 */     this.gunModel['Å'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 4, 4, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  994 */     this.gunModel['Å'].setRotationPoint(155.0F, 8.0F, 15.0F);
/*      */     
/*  996 */     this.gunModel['Æ'].addShapeBox(43.0F, -64.0F, -11.0F, 13, 4, 4, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  997 */     this.gunModel['Æ'].setRotationPoint(130.0F, 8.0F, 15.0F);
/*      */     
/*  999 */     this.gunModel['Ç'].addShapeBox(43.0F, -64.0F, -11.0F, 14, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1000 */     this.gunModel['Ç'].setRotationPoint(104.0F, 8.0F, 15.0F);
/*      */     
/* 1002 */     this.gunModel['È'].addShapeBox(43.0F, -64.0F, -11.0F, 14, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1003 */     this.gunModel['È'].setRotationPoint(79.5F, 8.0F, 15.0F);
/*      */     
/* 1005 */     this.gunModel['É'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1006 */     this.gunModel['É'].setRotationPoint(80.5F, 8.0F, 13.0F);
/*      */     
/* 1008 */     this.gunModel['Ê'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1009 */     this.gunModel['Ê'].setRotationPoint(79.5F, 8.0F, 11.0F);
/*      */     
/* 1011 */     this.gunModel['Ë'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1012 */     this.gunModel['Ë'].setRotationPoint(79.5F, 8.0F, 7.0F);
/*      */     
/* 1014 */     this.gunModel['Ì'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1015 */     this.gunModel['Ì'].setRotationPoint(92.5F, 8.0F, 11.0F);
/*      */     
/* 1017 */     this.gunModel['Í'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1018 */     this.gunModel['Í'].setRotationPoint(92.5F, 8.0F, 7.0F);
/*      */     
/* 1020 */     this.gunModel['Î'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1021 */     this.gunModel['Î'].setRotationPoint(89.5F, 8.0F, 13.0F);
/*      */     
/* 1023 */     this.gunModel['Ï'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1024 */     this.gunModel['Ï'].setRotationPoint(89.5F, 8.0F, 7.0F);
/*      */     
/* 1026 */     this.gunModel['Ð'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel['Ð'].setRotationPoint(105.0F, 8.0F, 7.0F);
/*      */     
/* 1029 */     this.gunModel['Ñ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1030 */     this.gunModel['Ñ'].setRotationPoint(105.0F, 8.0F, 13.0F);
/*      */     
/* 1032 */     this.gunModel['Ò'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel['Ò'].setRotationPoint(104.0F, 8.0F, 11.0F);
/*      */     
/* 1035 */     this.gunModel['Ó'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1036 */     this.gunModel['Ó'].setRotationPoint(104.0F, 8.0F, 7.0F);
/*      */     
/* 1038 */     this.gunModel['Ô'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['Ô'].setRotationPoint(117.0F, 8.0F, 11.0F);
/*      */     
/* 1041 */     this.gunModel['Õ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1042 */     this.gunModel['Õ'].setRotationPoint(117.0F, 8.0F, 7.0F);
/*      */     
/* 1044 */     this.gunModel['Ö'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1045 */     this.gunModel['Ö'].setRotationPoint(114.0F, 8.0F, 13.0F);
/*      */     
/* 1047 */     this.gunModel['×'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1048 */     this.gunModel['×'].setRotationPoint(114.0F, 8.0F, 7.0F);
/*      */     
/* 1050 */     this.gunModel['Ø'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1051 */     this.gunModel['Ø'].setRotationPoint(130.5F, 8.0F, 7.0F);
/*      */     
/* 1053 */     this.gunModel['Ù'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1054 */     this.gunModel['Ù'].setRotationPoint(130.5F, 8.0F, 13.0F);
/*      */     
/* 1056 */     this.gunModel['Ú'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1057 */     this.gunModel['Ú'].setRotationPoint(129.5F, 8.0F, 11.0F);
/*      */     
/* 1059 */     this.gunModel['Û'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1060 */     this.gunModel['Û'].setRotationPoint(129.5F, 8.0F, 7.0F);
/*      */     
/* 1062 */     this.gunModel['Ü'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1063 */     this.gunModel['Ü'].setRotationPoint(142.0F, 8.0F, 11.0F);
/*      */     
/* 1065 */     this.gunModel['Ý'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1066 */     this.gunModel['Ý'].setRotationPoint(142.0F, 8.0F, 7.0F);
/*      */     
/* 1068 */     this.gunModel['Þ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1069 */     this.gunModel['Þ'].setRotationPoint(139.0F, 8.0F, 13.0F);
/*      */     
/* 1071 */     this.gunModel['ß'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1072 */     this.gunModel['ß'].setRotationPoint(139.0F, 8.0F, 7.0F);
/*      */     
/* 1074 */     this.gunModel['à'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1075 */     this.gunModel['à'].setRotationPoint(155.5F, 8.0F, 7.0F);
/*      */     
/* 1077 */     this.gunModel['á'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1078 */     this.gunModel['á'].setRotationPoint(155.5F, 8.0F, 13.0F);
/*      */     
/* 1080 */     this.gunModel['â'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1081 */     this.gunModel['â'].setRotationPoint(154.5F, 8.0F, 11.0F);
/*      */     
/* 1083 */     this.gunModel['ã'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1084 */     this.gunModel['ã'].setRotationPoint(154.5F, 8.0F, 7.0F);
/*      */     
/* 1086 */     this.gunModel['ä'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1087 */     this.gunModel['ä'].setRotationPoint(166.0F, 8.0F, 11.0F);
/*      */     
/* 1089 */     this.gunModel['å'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1090 */     this.gunModel['å'].setRotationPoint(166.0F, 8.0F, 7.0F);
/*      */     
/* 1092 */     this.gunModel['æ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1093 */     this.gunModel['æ'].setRotationPoint(163.0F, 8.0F, 13.0F);
/*      */     
/* 1095 */     this.gunModel['ç'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1096 */     this.gunModel['ç'].setRotationPoint(163.0F, 8.0F, 7.0F);
/*      */     
/* 1098 */     this.gunModel['è'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1099 */     this.gunModel['è'].setRotationPoint(177.5F, 8.0F, 7.0F);
/*      */     
/* 1101 */     this.gunModel['é'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1102 */     this.gunModel['é'].setRotationPoint(177.5F, 8.0F, 13.0F);
/*      */     
/* 1104 */     this.gunModel['ê'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1105 */     this.gunModel['ê'].setRotationPoint(176.5F, 8.0F, 11.0F);
/*      */     
/* 1107 */     this.gunModel['ë'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1108 */     this.gunModel['ë'].setRotationPoint(176.5F, 8.0F, 7.0F);
/*      */     
/* 1110 */     this.gunModel['ì'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1111 */     this.gunModel['ì'].setRotationPoint(183.5F, 8.0F, 7.0F);
/*      */     
/* 1113 */     this.gunModel['í'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1114 */     this.gunModel['í'].setRotationPoint(183.5F, 8.0F, 11.0F);
/*      */     
/* 1116 */     this.gunModel['î'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1117 */     this.gunModel['î'].setRotationPoint(181.5F, 8.0F, 13.0F);
/*      */     
/* 1119 */     this.gunModel['ï'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1120 */     this.gunModel['ï'].setRotationPoint(181.5F, 8.0F, 7.0F);
/*      */     
/* 1122 */     this.gunModel['ð'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 3, 16, 0.0F, -1.0F, 0.5F, 0.0F, 2.25F, 0.5F, 0.0F, 2.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -4.0F, 0.75F, 0.0F, -4.0F, 0.75F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F);
/* 1123 */     this.gunModel['ð'].setRotationPoint(183.5F, 21.5F, 3.0F);
/*      */     
/* 1125 */     this.gunModel['ñ'].addShapeBox(43.0F, -64.0F, -11.0F, 14, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F);
/* 1126 */     this.gunModel['ñ'].setRotationPoint(104.0F, 21.0F, 15.0F);
/*      */     
/* 1128 */     this.gunModel['ò'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 3, 16, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1129 */     this.gunModel['ò'].setRotationPoint(118.0F, 21.5F, 3.0F);
/*      */     
/* 1131 */     this.gunModel['ó'].addShapeBox(43.0F, -64.0F, -11.0F, 13, 4, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F);
/* 1132 */     this.gunModel['ó'].setRotationPoint(130.0F, 21.0F, 15.0F);
/*      */     
/* 1134 */     this.gunModel['ô'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 3, 16, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1135 */     this.gunModel['ô'].setRotationPoint(143.0F, 21.5F, 3.0F);
/*      */     
/* 1137 */     this.gunModel['õ'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 4, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F);
/* 1138 */     this.gunModel['õ'].setRotationPoint(155.0F, 21.0F, 15.0F);
/*      */     
/* 1140 */     this.gunModel['ö'].addShapeBox(43.0F, -64.0F, -11.0F, 10, 3, 16, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1141 */     this.gunModel['ö'].setRotationPoint(167.0F, 21.5F, 3.0F);
/*      */     
/* 1143 */     this.gunModel['÷'].addShapeBox(43.0F, -64.0F, -11.0F, 7, 4, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F);
/* 1144 */     this.gunModel['÷'].setRotationPoint(177.0F, 21.0F, 15.0F);
/*      */     
/* 1146 */     this.gunModel['ø'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1147 */     this.gunModel['ø'].setRotationPoint(177.5F, 20.5F, 7.0F);
/*      */     
/* 1149 */     this.gunModel['ù'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1150 */     this.gunModel['ù'].setRotationPoint(177.5F, 20.5F, 13.0F);
/*      */     
/* 1152 */     this.gunModel['ú'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1153 */     this.gunModel['ú'].setRotationPoint(176.5F, 20.5F, 11.0F);
/*      */     
/* 1155 */     this.gunModel['û'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1156 */     this.gunModel['û'].setRotationPoint(176.5F, 20.5F, 7.0F);
/*      */     
/* 1158 */     this.gunModel['ü'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1159 */     this.gunModel['ü'].setRotationPoint(183.5F, 20.5F, 7.0F);
/*      */     
/* 1161 */     this.gunModel['ý'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1162 */     this.gunModel['ý'].setRotationPoint(183.5F, 20.5F, 11.0F);
/*      */     
/* 1164 */     this.gunModel['þ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1165 */     this.gunModel['þ'].setRotationPoint(181.5F, 20.5F, 13.0F);
/*      */     
/* 1167 */     this.gunModel['ÿ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1168 */     this.gunModel['ÿ'].setRotationPoint(181.5F, 20.5F, 7.0F);
/*      */     
/* 1170 */     this.gunModel['Ā'].addShapeBox(43.0F, -64.0F, -11.0F, 7, 4, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1171 */     this.gunModel['Ā'].setRotationPoint(177.0F, 21.0F, 3.0F);
/*      */     
/* 1173 */     this.gunModel['ā'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 4, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1174 */     this.gunModel['ā'].setRotationPoint(155.0F, 21.0F, 3.0F);
/*      */     
/* 1176 */     this.gunModel['Ă'].addShapeBox(43.0F, -64.0F, -11.0F, 13, 4, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1177 */     this.gunModel['Ă'].setRotationPoint(130.0F, 21.0F, 3.0F);
/*      */     
/* 1179 */     this.gunModel['ă'].addShapeBox(43.0F, -64.0F, -11.0F, 14, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1180 */     this.gunModel['ă'].setRotationPoint(104.0F, 21.0F, 3.0F);
/*      */     
/* 1182 */     this.gunModel['Ą'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1183 */     this.gunModel['Ą'].setRotationPoint(79.5F, 20.5F, 11.0F);
/*      */     
/* 1185 */     this.gunModel['ą'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1186 */     this.gunModel['ą'].setRotationPoint(79.5F, 20.5F, 7.0F);
/*      */     
/* 1188 */     this.gunModel['Ć'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1189 */     this.gunModel['Ć'].setRotationPoint(105.0F, 20.5F, 7.0F);
/*      */     
/* 1191 */     this.gunModel['ć'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1192 */     this.gunModel['ć'].setRotationPoint(105.0F, 20.5F, 13.0F);
/*      */     
/* 1194 */     this.gunModel['Ĉ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1195 */     this.gunModel['Ĉ'].setRotationPoint(104.0F, 20.5F, 11.0F);
/*      */     
/* 1197 */     this.gunModel['ĉ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1198 */     this.gunModel['ĉ'].setRotationPoint(104.0F, 20.5F, 7.0F);
/*      */     
/* 1200 */     this.gunModel['Ċ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1201 */     this.gunModel['Ċ'].setRotationPoint(117.0F, 20.5F, 11.0F);
/*      */     
/* 1203 */     this.gunModel['ċ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1204 */     this.gunModel['ċ'].setRotationPoint(117.0F, 20.5F, 7.0F);
/*      */     
/* 1206 */     this.gunModel['Č'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1207 */     this.gunModel['Č'].setRotationPoint(114.0F, 20.5F, 13.0F);
/*      */     
/* 1209 */     this.gunModel['č'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1210 */     this.gunModel['č'].setRotationPoint(114.0F, 20.5F, 7.0F);
/*      */     
/* 1212 */     this.gunModel['Ď'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1213 */     this.gunModel['Ď'].setRotationPoint(130.5F, 20.5F, 7.0F);
/*      */     
/* 1215 */     this.gunModel['ď'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1216 */     this.gunModel['ď'].setRotationPoint(130.5F, 20.5F, 13.0F);
/*      */     
/* 1218 */     this.gunModel['Đ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1219 */     this.gunModel['Đ'].setRotationPoint(129.5F, 20.5F, 11.0F);
/*      */     
/* 1221 */     this.gunModel['đ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1222 */     this.gunModel['đ'].setRotationPoint(129.5F, 20.5F, 7.0F);
/*      */     
/* 1224 */     this.gunModel['Ē'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1225 */     this.gunModel['Ē'].setRotationPoint(142.0F, 20.5F, 11.0F);
/*      */     
/* 1227 */     this.gunModel['ē'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1228 */     this.gunModel['ē'].setRotationPoint(142.0F, 20.5F, 7.0F);
/*      */     
/* 1230 */     this.gunModel['Ĕ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1231 */     this.gunModel['Ĕ'].setRotationPoint(139.0F, 20.5F, 13.0F);
/*      */     
/* 1233 */     this.gunModel['ĕ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1234 */     this.gunModel['ĕ'].setRotationPoint(139.0F, 20.5F, 7.0F);
/*      */     
/* 1236 */     this.gunModel['Ė'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1237 */     this.gunModel['Ė'].setRotationPoint(155.5F, 20.5F, 7.0F);
/*      */     
/* 1239 */     this.gunModel['ė'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1240 */     this.gunModel['ė'].setRotationPoint(155.5F, 20.5F, 13.0F);
/*      */     
/* 1242 */     this.gunModel['Ę'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1243 */     this.gunModel['Ę'].setRotationPoint(154.5F, 20.5F, 11.0F);
/*      */     
/* 1245 */     this.gunModel['ę'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1246 */     this.gunModel['ę'].setRotationPoint(154.5F, 20.5F, 7.0F);
/*      */     
/* 1248 */     this.gunModel['Ě'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1249 */     this.gunModel['Ě'].setRotationPoint(166.0F, 20.5F, 11.0F);
/*      */     
/* 1251 */     this.gunModel['ě'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1252 */     this.gunModel['ě'].setRotationPoint(166.0F, 20.5F, 7.0F);
/*      */     
/* 1254 */     this.gunModel['Ĝ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.gunModel['Ĝ'].setRotationPoint(163.0F, 20.5F, 13.0F);
/*      */     
/* 1257 */     this.gunModel['ĝ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1258 */     this.gunModel['ĝ'].setRotationPoint(163.0F, 20.5F, 7.0F);
/*      */     
/* 1260 */     this.gunModel['Ğ'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1261 */     this.gunModel['Ğ'].setRotationPoint(59.0F, 8.5F, 3.0F);
/*      */     
/* 1263 */     this.gunModel['ğ'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 3, 4, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1264 */     this.gunModel['ğ'].setRotationPoint(38.5F, 8.5F, 3.0F);
/*      */     
/* 1266 */     this.gunModel['Ġ'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1267 */     this.gunModel['Ġ'].setRotationPoint(38.5F, 8.5F, 15.0F);
/*      */     
/* 1269 */     this.gunModel['ġ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.gunModel['ġ'].setRotationPoint(38.5F, 8.5F, 13.0F);
/*      */     
/* 1272 */     this.gunModel['Ģ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1273 */     this.gunModel['Ģ'].setRotationPoint(38.5F, 8.5F, 7.0F);
/*      */     
/* 1275 */     this.gunModel['ģ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1276 */     this.gunModel['ģ'].setRotationPoint(57.0F, 8.5F, 7.0F);
/*      */     
/* 1278 */     this.gunModel['Ĥ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1279 */     this.gunModel['Ĥ'].setRotationPoint(57.0F, 8.5F, 13.0F);
/*      */     
/* 1281 */     this.gunModel['ĥ'].addShapeBox(43.0F, -64.0F, -11.0F, 19, 2, 16, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1282 */     this.gunModel['ĥ'].setRotationPoint(-41.0F, 9.0F, 3.0F);
/*      */     
/* 1284 */     this.gunModel['Ħ'].addShapeBox(43.0F, -64.0F, -11.0F, 19, 3, 16, 0.0F, 0.0F, -1.0F, -1.5F, 1.0F, -1.0F, -1.5F, 1.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1285 */     this.gunModel['Ħ'].setRotationPoint(-41.0F, 6.5F, 3.0F);
/*      */     
/* 1287 */     this.gunModel['ħ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.gunModel['ħ'].setRotationPoint(62.0F, 21.5F, 2.0F);
/*      */     
/* 1290 */     this.gunModel['Ĩ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.gunModel['Ĩ'].setRotationPoint(64.0F, 21.5F, 2.0F);
/*      */     
/* 1293 */     this.gunModel['ĩ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1294 */     this.gunModel['ĩ'].setRotationPoint(66.0F, 21.5F, 2.0F);
/*      */     
/* 1296 */     this.gunModel['Ī'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1297 */     this.gunModel['Ī'].setRotationPoint(62.0F, 19.5F, 2.0F);
/*      */     
/* 1299 */     this.gunModel['ī'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1300 */     this.gunModel['ī'].setRotationPoint(64.0F, 19.5F, 2.0F);
/*      */     
/* 1302 */     this.gunModel['Ĭ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.gunModel['Ĭ'].setRotationPoint(66.0F, 19.5F, 2.0F);
/*      */     
/* 1305 */     this.gunModel['ĭ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1306 */     this.gunModel['ĭ'].setRotationPoint(62.0F, 23.5F, 2.0F);
/*      */     
/* 1308 */     this.gunModel['Į'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1309 */     this.gunModel['Į'].setRotationPoint(64.0F, 23.5F, 2.0F);
/*      */     
/* 1311 */     this.gunModel['į'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1312 */     this.gunModel['į'].setRotationPoint(66.0F, 23.5F, 2.0F);
/*      */     
/* 1314 */     this.gunModel['İ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1315 */     this.gunModel['İ'].setRotationPoint(-56.0F, 22.5F, 1.5F);
/*      */     
/* 1317 */     this.gunModel['ı'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1318 */     this.gunModel['ı'].setRotationPoint(-55.0F, 21.5F, 1.5F);
/*      */     
/* 1320 */     this.gunModel['Ĳ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 19, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1321 */     this.gunModel['Ĳ'].setRotationPoint(-55.0F, 23.5F, 1.5F);
/*      */     
/* 1323 */     this.gunModel['ĳ'].addShapeBox(43.0F, -64.0F, -11.0F, 6, 7, 16, 0.0F, 0.0F, -1.0F, -2.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.5F, -2.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F);
/* 1324 */     this.gunModel['ĳ'].setRotationPoint(-48.0F, 9.0F, 3.0F);
/*      */     
/* 1326 */     this.gunModel['Ĵ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 7, 12, 0.0F, -0.5F, -1.0F, -4.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -0.5F, -1.0F, -4.0F, -0.5F, 0.5F, -4.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -0.5F, 0.5F, -4.0F);
/* 1327 */     this.gunModel['Ĵ'].setRotationPoint(-50.0F, 9.0F, 5.0F);
/*      */     
/* 1329 */     this.gunModel['ĵ'].addShapeBox(43.0F, -64.0F, -11.0F, 6, 3, 16, 0.0F, 0.0F, -3.0F, -4.5F, 1.0F, -1.0F, -1.5F, 1.0F, -1.0F, -1.5F, 0.0F, -3.0F, -4.5F, 0.0F, 0.5F, -2.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F);
/* 1330 */     this.gunModel['ĵ'].setRotationPoint(-48.0F, 6.5F, 3.0F);
/*      */     
/* 1332 */     this.gunModel['Ķ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 12, 0.0F, -0.5F, -1.5F, -4.0F, 1.0F, -1.0F, -2.5F, 1.0F, -1.0F, -2.5F, -0.5F, -1.5F, -4.0F, -0.5F, 0.5F, -4.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -0.5F, 0.5F, -4.0F);
/* 1333 */     this.gunModel['Ķ'].setRotationPoint(-50.0F, 8.5F, 5.0F);
/*      */     
/* 1335 */     this.gunModel['ķ'].addShapeBox(43.0F, -64.0F, -11.0F, 18, 2, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     this.gunModel['ķ'].setRotationPoint(-40.0F, 5.5F, 10.0F);
/*      */     
/* 1338 */     this.gunModel['ĸ'].addShapeBox(43.0F, -64.0F, -11.0F, 18, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1339 */     this.gunModel['ĸ'].setRotationPoint(-40.0F, 5.5F, 11.0F);
/*      */     
/* 1341 */     this.gunModel['Ĺ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 9, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1342 */     this.gunModel['Ĺ'].setRotationPoint(-8.0F, 0.0F, 7.5F);
/*      */     
/* 1344 */     this.gunModel['ĺ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 9, 3, 0.0F, 0.0F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1345 */     this.gunModel['ĺ'].setRotationPoint(-8.0F, 0.0F, 11.5F);
/*      */     
/* 1347 */     this.gunModel['Ļ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 7, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1348 */     this.gunModel['Ļ'].setRotationPoint(-8.0F, 2.0F, 10.0F);
/*      */     
/* 1350 */     this.gunModel['ļ'].addShapeBox(43.0F, -64.0F, -11.0F, 4, 6, 7, 0.0F, 0.0F, -5.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1351 */     this.gunModel['ļ'].setRotationPoint(-12.5F, 3.0F, 7.5F);
/*      */     
/* 1353 */     this.gunModel['Ľ'].addShapeBox(43.0F, -64.0F, -11.0F, 19, 5, 12, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1354 */     this.gunModel['Ľ'].setRotationPoint(-41.0F, 11.0F, 7.0F);
/*      */     
/* 1356 */     this.gunModel['ľ'].addShapeBox(43.0F, -64.0F, -11.0F, 7, 5, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1357 */     this.gunModel['ľ'].setRotationPoint(18.0F, 11.0F, 3.0F);
/*      */     
/* 1359 */     this.gunModel['Ŀ'].addShapeBox(43.0F, -64.0F, -11.0F, 22, 5, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1360 */     this.gunModel['Ŀ'].setRotationPoint(-41.0F, 11.0F, 3.0F);
/*      */     
/* 1362 */     this.gunModel['ŀ'].addShapeBox(43.0F, -64.0F, -11.0F, 23, 1, 6, 0.0F, -4.0F, 0.75F, 0.0F, -4.5F, 0.75F, 0.0F, -4.5F, 0.75F, 0.0F, -4.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1363 */     this.gunModel['ŀ'].setRotationPoint(145.0F, 7.0F, 8.0F);
/*      */     
/* 1365 */     this.gunModel['Ł'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1366 */     this.gunModel['Ł'].setRotationPoint(156.0F, 3.75F, 10.0F);
/*      */     
/* 1368 */     this.gunModel['ł'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1369 */     this.gunModel['ł'].setRotationPoint(156.0F, 0.75F, 10.5F);
/*      */     
/* 1371 */     this.gunModel['Ń'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1372 */     this.gunModel['Ń'].setRotationPoint(-40.0F, 11.5F, 2.5F);
/*      */     
/* 1374 */     this.gunModel['ń'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1375 */     this.gunModel['ń'].setRotationPoint(-39.0F, 10.5F, 2.5F);
/*      */     
/* 1377 */     this.gunModel['Ņ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 17, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1378 */     this.gunModel['Ņ'].setRotationPoint(-39.0F, 12.5F, 2.5F);
/*      */     
/* 1380 */     this.gunModel['ņ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.gunModel['ņ'].setRotationPoint(72.0F, 25.5F, 2.5F);
/*      */     
/* 1383 */     this.gunModel['Ň'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1384 */     this.gunModel['Ň'].setRotationPoint(73.0F, 24.5F, 2.5F);
/*      */     
/* 1386 */     this.gunModel['ň'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 17, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1387 */     this.gunModel['ň'].setRotationPoint(73.0F, 26.5F, 2.5F);
/*      */     
/* 1389 */     this.gunModel['ŉ'].addShapeBox(43.0F, -64.0F, -11.0F, 36, 5, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1390 */     this.gunModel['ŉ'].setRotationPoint(-19.0F, 11.0F, 6.0F);
/*      */     
/* 1392 */     this.gunModel['Ŋ'].addShapeBox(43.0F, -64.0F, -11.0F, 32, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1393 */     this.gunModel['Ŋ'].setRotationPoint(-15.0F, 13.0F, 4.0F);
/*      */     
/* 1395 */     this.gunModel['ŋ'].addShapeBox(43.0F, -64.0F, -11.0F, 32, 3, 1, 0.0F, 0.0F, -3.5F, -0.5F, 0.75F, -3.5F, -0.5F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.75F, 0.5F, -0.5F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1396 */     this.gunModel['ŋ'].setRotationPoint(-15.0F, 13.0F, 3.0F);
/*      */     
/* 1398 */     this.gunModel['Ō'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1399 */     this.gunModel['Ō'].setRotationPoint(158.5F, 1.75F, 7.0F);
/*      */     
/* 1401 */     this.gunModel['ō'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 1, 0.0F, 1.0F, 0.75F, -0.75F, 0.5F, 0.75F, -0.75F, 0.5F, 0.75F, 1.0F, 1.0F, 0.75F, 1.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F);
/* 1402 */     this.gunModel['ō'].setRotationPoint(157.5F, 0.75F, 7.5F);
/*      */     
/* 1404 */     this.gunModel['Ŏ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.25F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1405 */     this.gunModel['Ŏ'].setRotationPoint(158.5F, 4.0F, 8.0F);
/*      */     
/* 1407 */     this.gunModel['ŏ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 1, 0.0F, 1.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.75F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F);
/* 1408 */     this.gunModel['ŏ'].setRotationPoint(158.5F, 0.75F, 7.5F);
/*      */     
/* 1410 */     this.gunModel['Ő'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 6, 0.0F, 0.0F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1411 */     this.gunModel['Ő'].setRotationPoint(158.5F, -1.0F, 8.25F);
/*      */     
/* 1413 */     this.gunModel['ő'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.25F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1414 */     this.gunModel['ő'].setRotationPoint(158.5F, 4.0F, 13.0F);
/*      */     
/* 1416 */     this.gunModel['Œ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1417 */     this.gunModel['Œ'].setRotationPoint(158.5F, 1.75F, 14.0F);
/*      */     
/* 1419 */     this.gunModel['œ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 1, 0.0F, 1.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.75F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F);
/* 1420 */     this.gunModel['œ'].setRotationPoint(158.5F, 0.75F, 13.5F);
/*      */     
/* 1422 */     this.gunModel['Ŕ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 1, 0.0F, 1.0F, 0.75F, 1.0F, 0.5F, 0.75F, 1.0F, 0.5F, 0.75F, -0.75F, 1.0F, 0.75F, -0.75F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F);
/* 1423 */     this.gunModel['Ŕ'].setRotationPoint(157.5F, 0.75F, 13.5F);
/*      */     
/* 1425 */     this.gunModel['ŕ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1426 */     this.gunModel['ŕ'].setRotationPoint(152.0F, 1.75F, 7.0F);
/*      */     
/* 1428 */     this.gunModel['Ŗ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 1, 0.0F, 0.0F, 0.75F, -0.75F, 1.5F, 0.75F, -0.75F, 1.5F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, -1.25F, 0.0F, 1.0F, -1.25F, 0.0F, 1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1429 */     this.gunModel['Ŗ'].setRotationPoint(152.0F, 0.75F, 7.5F);
/*      */     
/* 1431 */     this.gunModel['ŗ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1432 */     this.gunModel['ŗ'].setRotationPoint(152.0F, 4.0F, 8.0F);
/*      */     
/* 1434 */     this.gunModel['Ř'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 1.25F, 0.0F, 0.5F, 1.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1435 */     this.gunModel['Ř'].setRotationPoint(152.0F, 0.75F, 7.5F);
/*      */     
/* 1437 */     this.gunModel['ř'].addShapeBox(43.0F, -64.0F, -11.0F, 6, 1, 6, 0.0F, 0.0F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1438 */     this.gunModel['ř'].setRotationPoint(152.0F, -1.0F, 8.25F);
/*      */     
/* 1440 */     this.gunModel['Ś'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1441 */     this.gunModel['Ś'].setRotationPoint(152.0F, 4.0F, 13.0F);
/*      */     
/* 1443 */     this.gunModel['ś'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1444 */     this.gunModel['ś'].setRotationPoint(152.0F, 1.75F, 14.0F);
/*      */     
/* 1446 */     this.gunModel['Ŝ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1447 */     this.gunModel['Ŝ'].setRotationPoint(152.0F, 0.75F, 13.5F);
/*      */     
/* 1449 */     this.gunModel['ŝ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 1, 1, 0.0F, 0.0F, 0.75F, 1.0F, 1.5F, 0.75F, 1.0F, 1.5F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, -1.25F, 0.0F, 1.0F, -1.25F, 0.0F, 1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1450 */     this.gunModel['ŝ'].setRotationPoint(152.0F, 0.75F, 13.5F);
/*      */     
/* 1452 */     this.gunModel['Ş'].addShapeBox(43.0F, -64.0F, -11.0F, 14, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1453 */     this.gunModel['Ş'].setRotationPoint(-25.75F, 38.5F, 7.0F);
/*      */     
/* 1455 */     this.gunModel['ş'].addShapeBox(43.0F, -64.0F, -11.0F, 12, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1456 */     this.gunModel['ş'].setRotationPoint(-24.75F, 39.75F, 7.0F);
/*      */     
/* 1458 */     this.gunModel['Š'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 5, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1459 */     this.gunModel['Š'].setRotationPoint(-19.75F, 40.25F, 6.0F);
/*      */     
/* 1461 */     this.gunModel['š'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 8, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/* 1462 */     this.gunModel['š'].setRotationPoint(-20.75F, 45.0F, 6.0F);
/*      */     
/* 1464 */     this.gunModel['Ţ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 8, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F);
/* 1465 */     this.gunModel['Ţ'].setRotationPoint(-20.75F, 46.0F, 6.0F);
/*      */     
/* 1467 */     this.gunModel['ţ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 8, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 1468 */     this.gunModel['ţ'].setRotationPoint(-18.75F, 45.0F, 6.0F);
/*      */     
/* 1470 */     this.gunModel['Ť'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 8, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1471 */     this.gunModel['Ť'].setRotationPoint(-18.75F, 46.0F, 6.0F);
/*      */     
/* 1473 */     this.gunModel['ť'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/* 1474 */     this.gunModel['ť'].setRotationPoint(-19.75F, 47.5F, 6.0F);
/*      */     
/* 1476 */     this.gunModel['Ŧ'].addShapeBox(43.0F, -64.0F, -11.0F, 4, 13, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1477 */     this.gunModel['Ŧ'].setRotationPoint(31.25F, 34.25F, 8.0F);
/*      */     
/* 1479 */     this.gunModel['ŧ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1480 */     this.gunModel['ŧ'].setRotationPoint(31.25F, 47.25F, 8.0F);
/*      */     
/* 1482 */     this.gunModel['Ũ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 1483 */     this.gunModel['Ũ'].setRotationPoint(28.25F, 47.25F, 8.0F);
/*      */     
/* 1485 */     this.gunModel['ũ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1486 */     this.gunModel['ũ'].setRotationPoint(27.0F, 50.25F, 8.0F);
/*      */     
/* 1488 */     this.gunModel['Ū'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 3, 6, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1489 */     this.gunModel['Ū'].setRotationPoint(25.5F, 55.25F, 8.0F);
/*      */     
/* 1491 */     this.gunModel['ū'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 6, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1492 */     this.gunModel['ū'].setRotationPoint(25.5F, 53.25F, 8.0F);
/*      */     
/* 1494 */     this.gunModel['Ŭ'].addShapeBox(43.0F, -64.0F, -11.0F, 5, 2, 6, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/* 1495 */     this.gunModel['Ŭ'].setRotationPoint(24.5F, 58.25F, 8.0F);
/*      */     
/* 1497 */     this.gunModel['ŭ'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 3, 6, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1498 */     this.gunModel['ŭ'].setRotationPoint(27.25F, 55.25F, 8.0F);
/*      */     
/* 1500 */     this.gunModel['Ů'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 15, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 1501 */     this.gunModel['Ů'].setRotationPoint(-130.0F, 59.0F, 2.0F);
/*      */     
/* 1503 */     this.gunModel['ů'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 10, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1504 */     this.gunModel['ů'].setRotationPoint(-130.0F, 49.0F, 2.0F);
/*      */     
/* 1506 */     this.gunModel['Ű'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1507 */     this.gunModel['Ű'].setRotationPoint(-121.0F, 49.0F, 20.0F);
/*      */     
/* 1509 */     this.gunModel['ű'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1510 */     this.gunModel['ű'].setRotationPoint(-130.0F, 47.0F, 20.0F);
/*      */     
/* 1512 */     this.gunModel['Ų'].addShapeBox(43.0F, -64.0F, -11.0F, 21, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1513 */     this.gunModel['Ų'].setRotationPoint(-130.0F, 59.0F, 20.0F);
/*      */     
/* 1515 */     this.gunModel['ų'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 10, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1516 */     this.gunModel['ų'].setRotationPoint(-130.0F, 49.0F, 18.0F);
/*      */     
/* 1518 */     this.gunModel['Ŵ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 10, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1519 */     this.gunModel['Ŵ'].setRotationPoint(-111.0F, 49.0F, 18.0F);
/*      */     
/* 1521 */     this.gunModel['ŵ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1522 */     this.gunModel['ŵ'].setRotationPoint(-109.0F, 47.0F, 20.0F);
/*      */     
/* 1524 */     this.gunModel['Ŷ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1525 */     this.gunModel['Ŷ'].setRotationPoint(-106.0F, 51.0F, 20.0F);
/*      */     
/* 1527 */     this.gunModel['ŷ'].addShapeBox(43.0F, -64.0F, -11.0F, 3, 14, 1, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 1528 */     this.gunModel['ŷ'].setRotationPoint(-133.0F, 47.0F, 20.0F);
/*      */     
/* 1530 */     this.gunModel['Ÿ'].addShapeBox(43.0F, -64.0F, -11.0F, 2, 6, 1, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F);
/* 1531 */     this.gunModel['Ÿ'].setRotationPoint(-135.0F, 51.0F, 20.0F);
/*      */     
/* 1533 */     this.gunModel['Ź'].addShapeBox(43.0F, -64.0F, -11.0F, 18, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1534 */     this.gunModel['Ź'].setRotationPoint(-129.0F, 49.0F, 18.0F);
/*      */     
/* 1536 */     this.gunModel['ź'].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 18, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1537 */     this.gunModel['ź'].setRotationPoint(-191.0F, 40.5F, 2.0F);
/*      */     
/*      */ 
/* 1540 */     this.ammoModel = new ModelRendererTurbo[31];
/* 1541 */     this.ammoModel[0] = new ModelRendererTurbo(this, 553, 233, this.textureX, this.textureY);
/* 1542 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/* 1543 */     this.ammoModel[2] = new ModelRendererTurbo(this, 201, 249, this.textureX, this.textureY);
/* 1544 */     this.ammoModel[3] = new ModelRendererTurbo(this, 657, 233, this.textureX, this.textureY);
/* 1545 */     this.ammoModel[4] = new ModelRendererTurbo(this, 97, 241, this.textureX, this.textureY);
/* 1546 */     this.ammoModel[5] = new ModelRendererTurbo(this, 913, 241, this.textureX, this.textureY);
/* 1547 */     this.ammoModel[6] = new ModelRendererTurbo(this, 745, 249, this.textureX, this.textureY);
/* 1548 */     this.ammoModel[7] = new ModelRendererTurbo(this, 833, 249, this.textureX, this.textureY);
/* 1549 */     this.ammoModel[8] = new ModelRendererTurbo(this, 297, 257, this.textureX, this.textureY);
/* 1550 */     this.ammoModel[9] = new ModelRendererTurbo(this, 745, 233, this.textureX, this.textureY);
/* 1551 */     this.ammoModel[10] = new ModelRendererTurbo(this, 177, 257, this.textureX, this.textureY);
/* 1552 */     this.ammoModel[11] = new ModelRendererTurbo(this, 361, 257, this.textureX, this.textureY);
/* 1553 */     this.ammoModel[12] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/* 1554 */     this.ammoModel[13] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/* 1555 */     this.ammoModel[14] = new ModelRendererTurbo(this, 417, 257, this.textureX, this.textureY);
/* 1556 */     this.ammoModel[15] = new ModelRendererTurbo(this, 473, 257, this.textureX, this.textureY);
/* 1557 */     this.ammoModel[16] = new ModelRendererTurbo(this, 921, 225, this.textureX, this.textureY);
/* 1558 */     this.ammoModel[17] = new ModelRendererTurbo(this, 657, 233, this.textureX, this.textureY);
/* 1559 */     this.ammoModel[18] = new ModelRendererTurbo(this, 977, 241, this.textureX, this.textureY);
/* 1560 */     this.ammoModel[19] = new ModelRendererTurbo(this, 657, 249, this.textureX, this.textureY);
/* 1561 */     this.ammoModel[20] = new ModelRendererTurbo(this, 529, 257, this.textureX, this.textureY);
/* 1562 */     this.ammoModel[21] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 1563 */     this.ammoModel[22] = new ModelRendererTurbo(this, 385, 273, this.textureX, this.textureY);
/* 1564 */     this.ammoModel[23] = new ModelRendererTurbo(this, 441, 273, this.textureX, this.textureY);
/* 1565 */     this.ammoModel[24] = new ModelRendererTurbo(this, 497, 273, this.textureX, this.textureY);
/* 1566 */     this.ammoModel[25] = new ModelRendererTurbo(this, 553, 273, this.textureX, this.textureY);
/* 1567 */     this.ammoModel[26] = new ModelRendererTurbo(this, 945, 273, this.textureX, this.textureY);
/* 1568 */     this.ammoModel[27] = new ModelRendererTurbo(this, 745, 249, this.textureX, this.textureY);
/* 1569 */     this.ammoModel[28] = new ModelRendererTurbo(this, 657, 265, this.textureX, this.textureY);
/* 1570 */     this.ammoModel[29] = new ModelRendererTurbo(this, 745, 265, this.textureX, this.textureY);
/* 1571 */     this.ammoModel[30] = new ModelRendererTurbo(this, 209, 273, this.textureX, this.textureY);
/*      */     
/* 1573 */     this.ammoModel[0].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 58, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1574 */     this.ammoModel[0].setRotationPoint(42.75F, 53.5F, -17.0F);
/* 1575 */     this.ammoModel[0].rotateAngleZ = 0.08726646F;
/*      */     
/* 1577 */     this.ammoModel[1].addShapeBox(43.0F, -64.0F, -11.0F, 19, 8, 54, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1578 */     this.ammoModel[1].setRotationPoint(42.0F, 45.5F, -15.0F);
/* 1579 */     this.ammoModel[1].rotateAngleZ = 0.08726646F;
/*      */     
/* 1581 */     this.ammoModel[2].addShapeBox(43.0F, -64.0F, -11.0F, 19, 8, 54, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1582 */     this.ammoModel[2].setRotationPoint(43.25F, 59.5F, -15.0F);
/* 1583 */     this.ammoModel[2].rotateAngleZ = 0.08726646F;
/*      */     
/* 1585 */     this.ammoModel[3].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 48, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1586 */     this.ammoModel[3].setRotationPoint(44.0F, 67.5F, -12.0F);
/* 1587 */     this.ammoModel[3].rotateAngleZ = 0.08726646F;
/*      */     
/* 1589 */     this.ammoModel[4].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 36, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1590 */     this.ammoModel[4].setRotationPoint(44.5F, 73.5F, -6.0F);
/* 1591 */     this.ammoModel[4].rotateAngleZ = 0.08726646F;
/*      */     
/* 1593 */     this.ammoModel[5].addShapeBox(43.0F, -64.0F, -11.0F, 19, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1594 */     this.ammoModel[5].setRotationPoint(45.0F, 79.5F, 0.0F);
/* 1595 */     this.ammoModel[5].rotateAngleZ = 0.08726646F;
/*      */     
/* 1597 */     this.ammoModel[6].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 48, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1598 */     this.ammoModel[6].setRotationPoint(41.5F, 39.5F, -12.0F);
/* 1599 */     this.ammoModel[6].rotateAngleZ = 0.08726646F;
/*      */     
/* 1601 */     this.ammoModel[7].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 36, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1602 */     this.ammoModel[7].setRotationPoint(41.0F, 33.5F, -6.0F);
/* 1603 */     this.ammoModel[7].rotateAngleZ = 0.08726646F;
/*      */     
/* 1605 */     this.ammoModel[8].addShapeBox(43.0F, -64.0F, -11.0F, 19, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1606 */     this.ammoModel[8].setRotationPoint(40.75F, 30.5F, 0.0F);
/* 1607 */     this.ammoModel[8].rotateAngleZ = 0.08726646F;
/*      */     
/* 1609 */     this.ammoModel[9].addShapeBox(43.0F, -64.0F, -11.0F, 19, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1610 */     this.ammoModel[9].setRotationPoint(45.25F, 82.5F, 8.0F);
/* 1611 */     this.ammoModel[9].rotateAngleZ = 0.08726646F;
/*      */     
/* 1613 */     this.ammoModel[10].addShapeBox(43.0F, -64.0F, -11.0F, 19, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1614 */     this.ammoModel[10].setRotationPoint(45.25F, 82.5F, 0.0F);
/* 1615 */     this.ammoModel[10].rotateAngleZ = 0.08726646F;
/*      */     
/* 1617 */     this.ammoModel[11].addShapeBox(43.0F, -64.0F, -11.0F, 19, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1618 */     this.ammoModel[11].setRotationPoint(45.25F, 82.5F, 16.0F);
/* 1619 */     this.ammoModel[11].rotateAngleZ = 0.08726646F;
/*      */     
/* 1621 */     this.ammoModel[12].addShapeBox(43.0F, -64.0F, -11.0F, 19, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1622 */     this.ammoModel[12].setRotationPoint(45.0F, 79.5F, 24.0F);
/* 1623 */     this.ammoModel[12].rotateAngleZ = 0.08726646F;
/*      */     
/* 1625 */     this.ammoModel[13].addShapeBox(43.0F, -64.0F, -11.0F, 19, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1626 */     this.ammoModel[13].setRotationPoint(45.0F, 79.5F, -6.0F);
/* 1627 */     this.ammoModel[13].rotateAngleZ = 0.08726646F;
/*      */     
/* 1629 */     this.ammoModel[14].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F);
/* 1630 */     this.ammoModel[14].setRotationPoint(44.5F, 73.5F, 30.0F);
/* 1631 */     this.ammoModel[14].rotateAngleZ = 0.08726646F;
/*      */     
/* 1633 */     this.ammoModel[15].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1634 */     this.ammoModel[15].setRotationPoint(44.5F, 73.5F, -12.0F);
/* 1635 */     this.ammoModel[15].rotateAngleZ = 0.08726646F;
/*      */     
/* 1637 */     this.ammoModel[16].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1638 */     this.ammoModel[16].setRotationPoint(44.0F, 67.5F, -15.0F);
/* 1639 */     this.ammoModel[16].rotateAngleZ = 0.08726646F;
/*      */     
/* 1641 */     this.ammoModel[17].addShapeBox(43.0F, -64.0F, -11.0F, 19, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1642 */     this.ammoModel[17].setRotationPoint(43.25F, 59.5F, -17.0F);
/* 1643 */     this.ammoModel[17].rotateAngleZ = 0.08726646F;
/*      */     
/* 1645 */     this.ammoModel[18].addShapeBox(43.0F, -64.0F, -11.0F, 19, 8, 2, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1646 */     this.ammoModel[18].setRotationPoint(42.0F, 45.5F, -17.0F);
/* 1647 */     this.ammoModel[18].rotateAngleZ = 0.08726646F;
/*      */     
/* 1649 */     this.ammoModel[19].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 3, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1650 */     this.ammoModel[19].setRotationPoint(41.5F, 39.5F, -15.0F);
/* 1651 */     this.ammoModel[19].rotateAngleZ = 0.08726646F;
/*      */     
/* 1653 */     this.ammoModel[20].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 6, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1654 */     this.ammoModel[20].setRotationPoint(41.0F, 33.5F, -12.0F);
/* 1655 */     this.ammoModel[20].rotateAngleZ = 0.08726646F;
/*      */     
/* 1657 */     this.ammoModel[21].addShapeBox(43.0F, -64.0F, -11.0F, 19, 3, 6, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1658 */     this.ammoModel[21].setRotationPoint(40.75F, 30.5F, -6.0F);
/* 1659 */     this.ammoModel[21].rotateAngleZ = 0.08726646F;
/*      */     
/* 1661 */     this.ammoModel[22].addShapeBox(43.0F, -64.0F, -11.0F, 19, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1662 */     this.ammoModel[22].setRotationPoint(40.3F, 23.5F, 8.0F);
/* 1663 */     this.ammoModel[22].rotateAngleZ = 0.08726646F;
/*      */     
/* 1665 */     this.ammoModel[23].addShapeBox(43.0F, -64.0F, -11.0F, 19, 2, 8, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1666 */     this.ammoModel[23].setRotationPoint(40.65F, 28.5F, 0.0F);
/* 1667 */     this.ammoModel[23].rotateAngleZ = 0.08726646F;
/*      */     
/* 1669 */     this.ammoModel[24].addShapeBox(43.0F, -64.0F, -11.0F, 19, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1670 */     this.ammoModel[24].setRotationPoint(40.65F, 28.5F, 16.0F);
/* 1671 */     this.ammoModel[24].rotateAngleZ = 0.08726646F;
/*      */     
/* 1673 */     this.ammoModel[25].addShapeBox(43.0F, -64.0F, -11.0F, 19, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1674 */     this.ammoModel[25].setRotationPoint(40.75F, 30.5F, 24.0F);
/* 1675 */     this.ammoModel[25].rotateAngleZ = 0.08726646F;
/*      */     
/* 1677 */     this.ammoModel[26].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1678 */     this.ammoModel[26].setRotationPoint(41.0F, 33.5F, 30.0F);
/* 1679 */     this.ammoModel[26].rotateAngleZ = 0.08726646F;
/*      */     
/* 1681 */     this.ammoModel[27].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1682 */     this.ammoModel[27].setRotationPoint(41.5F, 39.5F, 36.0F);
/* 1683 */     this.ammoModel[27].rotateAngleZ = 0.08726646F;
/*      */     
/* 1685 */     this.ammoModel[28].addShapeBox(43.0F, -64.0F, -11.0F, 19, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1686 */     this.ammoModel[28].setRotationPoint(42.0F, 45.5F, 39.0F);
/* 1687 */     this.ammoModel[28].rotateAngleZ = 0.08726646F;
/*      */     
/* 1689 */     this.ammoModel[29].addShapeBox(43.0F, -64.0F, -11.0F, 19, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F);
/* 1690 */     this.ammoModel[29].setRotationPoint(43.25F, 59.5F, 39.0F);
/* 1691 */     this.ammoModel[29].rotateAngleZ = 0.08726646F;
/*      */     
/* 1693 */     this.ammoModel[30].addShapeBox(43.0F, -64.0F, -11.0F, 19, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F);
/* 1694 */     this.ammoModel[30].setRotationPoint(44.0F, 67.5F, 36.0F);
/* 1695 */     this.ammoModel[30].rotateAngleZ = 0.08726646F;
/*      */     
/*      */ 
/* 1698 */     this.slideModel = new ModelRendererTurbo[11];
/* 1699 */     this.slideModel[0] = new ModelRendererTurbo(this, 233, 113, this.textureX, this.textureY);
/* 1700 */     this.slideModel[1] = new ModelRendererTurbo(this, 1001, 81, this.textureX, this.textureY);
/* 1701 */     this.slideModel[2] = new ModelRendererTurbo(this, 105, 113, this.textureX, this.textureY);
/* 1702 */     this.slideModel[3] = new ModelRendererTurbo(this, 137, 129, this.textureX, this.textureY);
/* 1703 */     this.slideModel[4] = new ModelRendererTurbo(this, 361, 129, this.textureX, this.textureY);
/* 1704 */     this.slideModel[5] = new ModelRendererTurbo(this, 617, 145, this.textureX, this.textureY);
/* 1705 */     this.slideModel[6] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/* 1706 */     this.slideModel[7] = new ModelRendererTurbo(this, 641, 73, this.textureX, this.textureY);
/* 1707 */     this.slideModel[8] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/* 1708 */     this.slideModel[9] = new ModelRendererTurbo(this, 769, 73, this.textureX, this.textureY);
/* 1709 */     this.slideModel[10] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*      */     
/* 1711 */     this.slideModel[0].addShapeBox(43.0F, -64.0F, -11.0F, 5, 3, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1712 */     this.slideModel[0].setRotationPoint(-15.25F, 14.0F, -5.0F);
/*      */     
/* 1714 */     this.slideModel[1].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1715 */     this.slideModel[1].setRotationPoint(-15.25F, 13.0F, -5.0F);
/*      */     
/* 1717 */     this.slideModel[2].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1718 */     this.slideModel[2].setRotationPoint(-11.25F, 13.0F, -5.0F);
/*      */     
/* 1720 */     this.slideModel[3].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1721 */     this.slideModel[3].setRotationPoint(-14.25F, 13.0F, -5.0F);
/*      */     
/* 1723 */     this.slideModel[4].addShapeBox(43.0F, -64.0F, -11.0F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1724 */     this.slideModel[4].setRotationPoint(-11.75F, 13.0F, -5.0F);
/*      */     
/* 1726 */     this.slideModel[5].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 10, 0.0F, 0.1F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, 0.5F, 0.0F, -0.4F, 0.5F, 0.0F, -0.4F, 0.5F, 0.0F, 0.1F, 0.5F, 0.0F);
/* 1727 */     this.slideModel[5].setRotationPoint(-13.5F, 13.0F, -4.85F);
/*      */     
/* 1729 */     this.slideModel[6].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 3, 0.0F, 0.1F, -0.5F, -2.0F, -0.4F, -0.5F, -2.0F, -0.4F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1730 */     this.slideModel[6].setRotationPoint(-13.5F, 10.5F, -4.85F);
/*      */     
/* 1732 */     this.slideModel[7].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 3, 0.0F, 0.1F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, -2.0F, 0.1F, -0.5F, -2.0F, 0.1F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1733 */     this.slideModel[7].setRotationPoint(-13.5F, 10.5F, -1.85F);
/*      */     
/* 1735 */     this.slideModel[8].addShapeBox(43.0F, -64.0F, -11.0F, 2, 2, 2, 0.0F, 0.1F, -1.0F, -1.0F, -0.4F, -1.0F, -1.0F, -0.4F, -1.0F, -1.0F, 0.1F, -1.0F, -1.0F, 0.1F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F);
/* 1736 */     this.slideModel[8].setRotationPoint(-13.5F, 9.5F, -2.85F);
/*      */     
/* 1738 */     this.slideModel[9].addShapeBox(43.0F, -64.0F, -11.0F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1739 */     this.slideModel[9].setRotationPoint(-13.2F, 11.5F, -0.5F);
/*      */     
/* 1741 */     this.slideModel[10].addShapeBox(43.0F, -64.0F, -11.0F, 2, 1, 6, 0.0F, 0.1F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1742 */     this.slideModel[10].setRotationPoint(-13.5F, 12.5F, -4.85F);
/*      */     
/*      */ 
/*      */ 
/* 1746 */     translateAll(0.0F, -29.0F, 0.0F);
/* 1747 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/* 1749 */     this.gunSlideDistance = 0.75F;
/* 1750 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/* 1753 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelppsh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */