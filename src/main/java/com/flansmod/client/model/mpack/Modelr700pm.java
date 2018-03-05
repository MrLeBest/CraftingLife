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
/*      */ public class Modelr700pm
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelr700pm()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ú'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 721, 17, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 561, 41, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 553, 57, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 545, 25, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 817, 41, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 921, 41, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 1001, 17, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 633, 25, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 513, 25, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 681, 25, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 537, 25, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 713, 25, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 905, 41, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1001, 41, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 673, 33, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 697, 33, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 825, 57, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 529, 25, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 649, 25, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 841, 57, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 673, 25, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 905, 57, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 953, 57, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 897, 57, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 545, 81, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 689, 89, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 689, 81, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 833, 89, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 961, 89, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 729, 81, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 545, 105, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 777, 81, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 905, 81, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 609, 105, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 833, 105, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 921, 105, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 937, 57, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 953, 81, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 937, 65, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 89, 113, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 705, 25, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 337, 113, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 689, 113, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 721, 113, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 753, 113, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 89, 121, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 777, 113, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 369, 89, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 553, 57, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 593, 113, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 529, 121, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 609, 121, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 921, 121, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 41, 129, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 337, 129, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 385, 129, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 569, 129, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 649, 129, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 809, 129, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 969, 121, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 857, 129, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 753, 129, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 689, 137, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 729, 137, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 73, 145, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 457, 153, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 121, 161, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 625, 161, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 825, 169, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 297, 177, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 201, 201, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 905, 145, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 969, 137, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 497, 177, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 145, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 169, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 537, 177, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 585, 185, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 201, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 201, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 545, 201, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 617, 201, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 665, 201, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 713, 201, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 761, 201, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 209, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 577, 209, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 793, 209, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1009, 57, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 121, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 25, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 153, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 809, 113, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 209, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 881, 209, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 921, 209, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 945, 209, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 777, 137, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 129, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 145, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 129, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 449, 137, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 713, 137, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 161, 145, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 985, 65, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 969, 209, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 817, 81, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 345, 217, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 401, 225, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 457, 225, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 185, 145, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 521, 225, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 617, 225, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 1001, 137, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 153, 145, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 993, 217, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 841, 153, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 713, 33, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 185, 193, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 649, 121, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 417, 129, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 305, 137, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 881, 153, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 961, 161, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 649, 225, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 705, 225, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 593, 105, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 513, 121, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 745, 225, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 441, 201, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 649, 201, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 57, 153, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 697, 201, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 745, 201, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 913, 57, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 689, 129, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 921, 41, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 601, 105, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 649, 153, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 585, 177, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 777, 113, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 825, 113, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 961, 57, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 841, 57, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 1017, 33, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 897, 57, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 689, 33, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 961, 65, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 825, 209, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 937, 57, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 953, 145, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 937, 65, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 841, 129, this.textureX, this.textureY);
/*      */     
/*  241 */     this.gunModel[0].addShapeBox(118.0F, -16.0F, 0.0F, 235, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  242 */     this.gunModel[0].setRotationPoint(13.0F, -24.5F, 0.0F);
/*      */     
/*  244 */     this.gunModel[1].addShapeBox(118.0F, -16.0F, 0.0F, 235, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  245 */     this.gunModel[1].setRotationPoint(13.0F, -21.5F, 0.0F);
/*      */     
/*  247 */     this.gunModel[2].addShapeBox(118.0F, -16.0F, 0.0F, 235, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  248 */     this.gunModel[2].setRotationPoint(13.0F, -18.5F, 0.0F);
/*      */     
/*  250 */     this.gunModel[3].addShapeBox(118.0F, -16.0F, 0.0F, 125, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/*  251 */     this.gunModel[3].setRotationPoint(-24.0F, -20.0F, 9.0F);
/*      */     
/*  253 */     this.gunModel[4].addShapeBox(118.0F, -16.0F, 0.0F, 127, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  254 */     this.gunModel[4].setRotationPoint(-24.0F, -11.0F, -5.5F);
/*      */     
/*  256 */     this.gunModel[5].addShapeBox(118.0F, -16.0F, 0.0F, 127, 3, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  257 */     this.gunModel[5].setRotationPoint(-24.0F, -14.0F, -5.0F);
/*      */     
/*  259 */     this.gunModel[6].addShapeBox(118.0F, -16.0F, 0.0F, 125, 3, 11, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 2.0F, 0.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  260 */     this.gunModel[6].setRotationPoint(-24.0F, -20.0F, -2.0F);
/*      */     
/*  262 */     this.gunModel[7].addShapeBox(118.0F, -16.0F, 0.0F, 127, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  263 */     this.gunModel[7].setRotationPoint(-24.0F, -17.0F, 9.0F);
/*      */     
/*  265 */     this.gunModel[8].addShapeBox(118.0F, -16.0F, 0.0F, 127, 3, 14, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  266 */     this.gunModel[8].setRotationPoint(-24.0F, -17.0F, -5.0F);
/*      */     
/*  268 */     this.gunModel[9].addShapeBox(118.0F, -16.0F, 0.0F, 127, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, -2.5F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/*  269 */     this.gunModel[9].setRotationPoint(-24.0F, -8.0F, -5.5F);
/*      */     
/*  271 */     this.gunModel[10].addShapeBox(118.0F, -16.0F, 0.0F, 127, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -2.0F, 0.0F, -3.5F, -2.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/*  272 */     this.gunModel[10].setRotationPoint(-24.0F, -5.0F, -3.0F);
/*      */     
/*  274 */     this.gunModel[11].addShapeBox(118.0F, -16.0F, 0.0F, 125, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -2.0F, 0.0F, -3.5F, -2.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/*  275 */     this.gunModel[11].setRotationPoint(-24.0F, -3.0F, 0.5F);
/*      */     
/*  277 */     this.gunModel[12].addShapeBox(118.0F, -16.0F, 0.0F, 39, 3, 9, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  278 */     this.gunModel[12].setRotationPoint(-26.0F, -24.5F, 0.0F);
/*      */     
/*  280 */     this.gunModel[13].addShapeBox(118.0F, -16.0F, 0.0F, 39, 3, 9, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  281 */     this.gunModel[13].setRotationPoint(-26.0F, -21.5F, 0.0F);
/*      */     
/*  283 */     this.gunModel[14].addShapeBox(118.0F, -16.0F, 0.0F, 34, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  284 */     this.gunModel[14].setRotationPoint(-21.0F, -18.5F, 0.0F);
/*      */     
/*  286 */     this.gunModel[15].addShapeBox(118.0F, -16.0F, 0.0F, 7, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  287 */     this.gunModel[15].setRotationPoint(-95.0F, -2.0F, 1.5F);
/*      */     
/*  289 */     this.gunModel[16].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  290 */     this.gunModel[16].setRotationPoint(-94.0F, 0.0F, 1.5F);
/*      */     
/*  292 */     this.gunModel[17].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  293 */     this.gunModel[17].setRotationPoint(-93.0F, 2.0F, 1.5F);
/*      */     
/*  295 */     this.gunModel[18].addShapeBox(118.0F, -16.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  296 */     this.gunModel[18].setRotationPoint(-92.0F, 3.0F, 1.5F);
/*      */     
/*  298 */     this.gunModel[19].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  299 */     this.gunModel[19].setRotationPoint(-112.5F, 7.0F, 1.5F);
/*      */     
/*  301 */     this.gunModel[20].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  302 */     this.gunModel[20].setRotationPoint(-110.5F, 9.0F, 1.5F);
/*      */     
/*  304 */     this.gunModel[21].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  305 */     this.gunModel[21].setRotationPoint(-109.0F, 11.0F, 1.5F);
/*      */     
/*  307 */     this.gunModel[22].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  308 */     this.gunModel[22].setRotationPoint(-96.0F, 12.0F, 1.5F);
/*      */     
/*  310 */     this.gunModel[23].addShapeBox(118.0F, -16.0F, 0.0F, 7, 1, 6, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  311 */     this.gunModel[23].setRotationPoint(-103.0F, 12.0F, 1.5F);
/*      */     
/*  313 */     this.gunModel[24].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  314 */     this.gunModel[24].setRotationPoint(-107.0F, 12.0F, 1.5F);
/*      */     
/*  316 */     this.gunModel[25].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  317 */     this.gunModel[25].setRotationPoint(-94.5F, 11.0F, 1.5F);
/*      */     
/*  319 */     this.gunModel[26].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  320 */     this.gunModel[26].setRotationPoint(-93.0F, 9.0F, 1.5F);
/*      */     
/*  322 */     this.gunModel[27].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  323 */     this.gunModel[27].setRotationPoint(-92.0F, 7.0F, 1.5F);
/*      */     
/*  325 */     this.gunModel[28].addShapeBox(118.0F, -16.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  326 */     this.gunModel[28].setRotationPoint(-113.0F, 3.0F, 1.5F);
/*      */     
/*  328 */     this.gunModel[29].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  329 */     this.gunModel[29].setRotationPoint(-115.0F, 0.0F, 1.5F);
/*      */     
/*  331 */     this.gunModel[30].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 6, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  332 */     this.gunModel[30].setRotationPoint(-113.0F, 2.0F, 1.5F);
/*      */     
/*  334 */     this.gunModel[31].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  335 */     this.gunModel[31].setRotationPoint(-106.0F, -1.0F, 2.5F);
/*      */     
/*  337 */     this.gunModel[32].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  338 */     this.gunModel[32].setRotationPoint(-106.0F, 0.0F, 2.5F);
/*      */     
/*  340 */     this.gunModel[33].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 4, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  341 */     this.gunModel[33].setRotationPoint(-108.0F, 7.0F, 2.5F);
/*      */     
/*  343 */     this.gunModel[34].addShapeBox(118.0F, -16.0F, 0.0F, 2, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  344 */     this.gunModel[34].setRotationPoint(-108.5F, 3.0F, 2.5F);
/*      */     
/*  346 */     this.gunModel[35].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  347 */     this.gunModel[35].setRotationPoint(-108.0F, 2.0F, 2.5F);
/*      */     
/*  349 */     this.gunModel[36].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 4, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  350 */     this.gunModel[36].setRotationPoint(-107.5F, 8.0F, 2.5F);
/*      */     
/*  352 */     this.gunModel[37].addShapeBox(118.0F, -16.0F, 0.0F, 19, 15, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  353 */     this.gunModel[37].setRotationPoint(-43.0F, -20.0F, -0.5F);
/*      */     
/*  355 */     this.gunModel[38].addShapeBox(118.0F, -16.0F, 0.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, -0.5F);
/*  356 */     this.gunModel[38].setRotationPoint(-27.0F, -20.0F, 9.0F);
/*      */     
/*  358 */     this.gunModel[39].addShapeBox(118.0F, -16.0F, 0.0F, 3, 3, 19, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -3.5F, -1.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F);
/*  359 */     this.gunModel[39].setRotationPoint(-27.0F, -17.0F, -5.0F);
/*      */     
/*  361 */     this.gunModel[40].addShapeBox(118.0F, -16.0F, 0.0F, 3, 3, 19, 0.0F, -1.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, -1.5F);
/*  362 */     this.gunModel[40].setRotationPoint(-27.0F, -14.0F, -5.0F);
/*      */     
/*  364 */     this.gunModel[41].addShapeBox(118.0F, -16.0F, 0.0F, 3, 3, 20, 0.0F, -1.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F);
/*  365 */     this.gunModel[41].setRotationPoint(-27.0F, -11.0F, -5.5F);
/*      */     
/*  367 */     this.gunModel[42].addShapeBox(118.0F, -16.0F, 0.0F, 3, 3, 20, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -4.5F);
/*  368 */     this.gunModel[42].setRotationPoint(-27.0F, -8.0F, -5.5F);
/*      */     
/*  370 */     this.gunModel[43].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -5.5F);
/*  371 */     this.gunModel[43].setRotationPoint(-27.0F, -5.0F, -3.0F);
/*      */     
/*  373 */     this.gunModel[44].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 8, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, -0.5F, -3.5F);
/*  374 */     this.gunModel[44].setRotationPoint(-27.0F, -3.0F, 0.5F);
/*      */     
/*  376 */     this.gunModel[45].addShapeBox(118.0F, -16.0F, 0.0F, 60, 2, 10, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 2.0F, -3.0F);
/*  377 */     this.gunModel[45].setRotationPoint(-87.0F, -5.0F, -0.5F);
/*      */     
/*  379 */     this.gunModel[46].addShapeBox(118.0F, -16.0F, 0.0F, 61, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  380 */     this.gunModel[46].setRotationPoint(-87.0F, -11.0F, -3.5F);
/*      */     
/*  382 */     this.gunModel[47].addShapeBox(118.0F, -16.0F, 0.0F, 68, 3, 16, 0.0F, 1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  383 */     this.gunModel[47].setRotationPoint(-94.0F, -14.0F, -3.5F);
/*      */     
/*  385 */     this.gunModel[48].addShapeBox(118.0F, -16.0F, 0.0F, 68, 3, 15, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  386 */     this.gunModel[48].setRotationPoint(-94.0F, -17.0F, -3.0F);
/*      */     
/*  388 */     this.gunModel[49].addShapeBox(118.0F, -16.0F, 0.0F, 60, 3, 16, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 2.0F, -2.5F);
/*  389 */     this.gunModel[49].setRotationPoint(-87.0F, -8.0F, -3.5F);
/*      */     
/*  391 */     this.gunModel[50].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  392 */     this.gunModel[50].setRotationPoint(-44.0F, -20.0F, -1.5F);
/*      */     
/*  394 */     this.gunModel[51].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  395 */     this.gunModel[51].setRotationPoint(-26.0F, -20.0F, -1.5F);
/*      */     
/*  397 */     this.gunModel[52].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  398 */     this.gunModel[52].setRotationPoint(-44.0F, -20.0F, 9.5F);
/*      */     
/*  400 */     this.gunModel[53].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  401 */     this.gunModel[53].setRotationPoint(-26.0F, -20.0F, 9.5F);
/*      */     
/*  403 */     this.gunModel[54].addShapeBox(118.0F, -16.0F, 0.0F, 60, 1, 8, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 1.5F, -3.5F, 0.0F, -0.5F, -3.5F, 0.0F, -0.5F, -3.5F, 0.0F, 1.5F, -3.5F);
/*  404 */     this.gunModel[54].setRotationPoint(-87.0F, -3.0F, 0.5F);
/*      */     
/*  406 */     this.gunModel[55].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  407 */     this.gunModel[55].setRotationPoint(-44.0F, -23.0F, -0.5F);
/*      */     
/*  409 */     this.gunModel[56].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  410 */     this.gunModel[56].setRotationPoint(-44.0F, -26.0F, -0.5F);
/*      */     
/*  412 */     this.gunModel[57].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  413 */     this.gunModel[57].setRotationPoint(-44.0F, -27.5F, 2.5F);
/*      */     
/*  415 */     this.gunModel[58].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  416 */     this.gunModel[58].setRotationPoint(-94.0F, -23.0F, -0.5F);
/*      */     
/*  418 */     this.gunModel[59].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  419 */     this.gunModel[59].setRotationPoint(-94.0F, -26.0F, -0.5F);
/*      */     
/*  421 */     this.gunModel[60].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  422 */     this.gunModel[60].setRotationPoint(-94.0F, -20.0F, -0.5F);
/*      */     
/*  424 */     this.gunModel[61].addShapeBox(118.0F, -16.0F, 0.0F, 18, 3, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  425 */     this.gunModel[61].setRotationPoint(-94.0F, -20.0F, -1.5F);
/*      */     
/*  427 */     this.gunModel[62].addShapeBox(118.0F, -16.0F, 0.0F, 21, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  428 */     this.gunModel[62].setRotationPoint(-65.0F, -20.0F, 9.5F);
/*      */     
/*  430 */     this.gunModel[63].addShapeBox(118.0F, -16.0F, 0.0F, 32, 2, 11, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  431 */     this.gunModel[63].setRotationPoint(-76.0F, -19.0F, -1.5F);
/*      */     
/*  433 */     this.gunModel[64].addShapeBox(118.0F, -16.0F, 0.0F, 9, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  434 */     this.gunModel[64].setRotationPoint(-96.0F, -11.0F, -3.5F);
/*      */     
/*  436 */     this.gunModel[65].addShapeBox(118.0F, -16.0F, 0.0F, 34, 3, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 1.0F, -2.5F);
/*  437 */     this.gunModel[65].setRotationPoint(-121.0F, -6.0F, -3.5F);
/*      */     
/*  439 */     this.gunModel[66].addShapeBox(118.0F, -16.0F, 0.0F, 34, 2, 11, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 1.0F, -3.5F);
/*  440 */     this.gunModel[66].setRotationPoint(-121.0F, -3.0F, -1.0F);
/*      */     
/*  442 */     this.gunModel[67].addShapeBox(118.0F, -16.0F, 0.0F, 34, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.5F, -1.5F);
/*  443 */     this.gunModel[67].setRotationPoint(-121.0F, -1.0F, 2.5F);
/*      */     
/*  445 */     this.gunModel[68].addShapeBox(118.0F, -16.0F, 0.0F, 7, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  446 */     this.gunModel[68].setRotationPoint(-116.0F, -1.0F, 1.5F);
/*      */     
/*  448 */     this.gunModel[69].addShapeBox(118.0F, -16.0F, 0.0F, 32, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  449 */     this.gunModel[69].setRotationPoint(-76.0F, -23.0F, 6.5F);
/*      */     
/*  451 */     this.gunModel[70].addShapeBox(118.0F, -16.0F, 0.0F, 32, 3, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[70].setRotationPoint(-76.0F, -26.0F, 6.5F);
/*      */     
/*  454 */     this.gunModel[71].addShapeBox(118.0F, -16.0F, 0.0F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  455 */     this.gunModel[71].setRotationPoint(-115.0F, -2.0F, 2.0F);
/*      */     
/*  457 */     this.gunModel[72].addShapeBox(118.0F, -16.0F, 0.0F, 30, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  458 */     this.gunModel[72].setRotationPoint(-134.0F, -11.0F, -3.5F);
/*      */     
/*  460 */     this.gunModel[73].addShapeBox(118.0F, -16.0F, 0.0F, 20, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F);
/*  461 */     this.gunModel[73].setRotationPoint(-124.0F, -14.0F, 9.5F);
/*      */     
/*  463 */     this.gunModel[74].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F);
/*  464 */     this.gunModel[74].setRotationPoint(-115.0F, -17.0F, 9.0F);
/*      */     
/*  466 */     this.gunModel[75].addShapeBox(118.0F, -16.0F, 0.0F, 5, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -1.65F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  467 */     this.gunModel[75].setRotationPoint(-115.0F, -20.0F, 9.5F);
/*      */     
/*  469 */     this.gunModel[76].addShapeBox(118.0F, -16.0F, 0.0F, 8, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  470 */     this.gunModel[76].setRotationPoint(-104.0F, -11.0F, 2.5F);
/*      */     
/*  472 */     this.gunModel[77].addShapeBox(118.0F, -16.0F, 0.0F, 9, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  473 */     this.gunModel[77].setRotationPoint(-104.0F, -14.0F, 2.5F);
/*      */     
/*  475 */     this.gunModel[78].addShapeBox(118.0F, -16.0F, 0.0F, 10, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  476 */     this.gunModel[78].setRotationPoint(-104.0F, -17.0F, 2.5F);
/*      */     
/*  478 */     this.gunModel[79].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 1, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.5F);
/*  479 */     this.gunModel[79].setRotationPoint(-68.0F, -20.0F, 9.5F);
/*      */     
/*  481 */     this.gunModel[80].addShapeBox(118.0F, -16.0F, 0.0F, 45, 2, 1, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  482 */     this.gunModel[80].setRotationPoint(-110.0F, -18.5F, 9.5F);
/*      */     
/*  484 */     this.gunModel[81].addShapeBox(118.0F, -16.0F, 0.0F, 16, 2, 7, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  485 */     this.gunModel[81].setRotationPoint(-110.0F, -18.5F, 2.5F);
/*      */     
/*  487 */     this.gunModel[82].addShapeBox(118.0F, -16.0F, 0.0F, 5, 3, 16, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 6.0F, -2.5F);
/*  488 */     this.gunModel[82].setRotationPoint(-126.0F, -5.0F, -3.5F);
/*      */     
/*  490 */     this.gunModel[83].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 11, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 6.0F, -3.5F);
/*  491 */     this.gunModel[83].setRotationPoint(-126.0F, -2.0F, -1.0F);
/*      */     
/*  493 */     this.gunModel[84].addShapeBox(118.0F, -16.0F, 0.0F, 5, 1, 4, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 5.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 5.5F, -1.5F);
/*  494 */     this.gunModel[84].setRotationPoint(-126.0F, 0.0F, 2.5F);
/*      */     
/*  496 */     this.gunModel[85].addShapeBox(118.0F, -16.0F, 0.0F, 34, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  497 */     this.gunModel[85].setRotationPoint(-121.0F, -6.0F, -3.5F);
/*      */     
/*  499 */     this.gunModel[86].addShapeBox(118.0F, -16.0F, 0.0F, 5, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/*  500 */     this.gunModel[86].setRotationPoint(-126.0F, -6.0F, -3.5F);
/*      */     
/*  502 */     this.gunModel[87].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 5.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 5.0F, -1.5F);
/*  503 */     this.gunModel[87].setRotationPoint(-128.0F, 6.0F, 2.5F);
/*      */     
/*  505 */     this.gunModel[88].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 16, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 5.5F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 5.5F, -2.5F);
/*  506 */     this.gunModel[88].setRotationPoint(-128.0F, 1.0F, -3.5F);
/*      */     
/*  508 */     this.gunModel[89].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 11, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 5.5F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 5.5F, -3.5F);
/*  509 */     this.gunModel[89].setRotationPoint(-128.0F, 4.0F, -1.0F);
/*      */     
/*  511 */     this.gunModel[90].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 5.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 5.5F, -1.5F);
/*  512 */     this.gunModel[90].setRotationPoint(-130.0F, 11.5F, 2.5F);
/*      */     
/*  514 */     this.gunModel[91].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 16, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 6.0F, -0.5F);
/*  515 */     this.gunModel[91].setRotationPoint(-130.0F, 6.5F, -3.5F);
/*      */     
/*  517 */     this.gunModel[92].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 11, 0.0F, 0.0F, -6.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 2.0F, 0.0F, 6.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 6.0F, -3.5F);
/*  518 */     this.gunModel[92].setRotationPoint(-130.0F, 9.5F, -1.0F);
/*      */     
/*  520 */     this.gunModel[93].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 16, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 0.0F);
/*  521 */     this.gunModel[93].setRotationPoint(-131.0F, 12.5F, -3.5F);
/*      */     
/*  523 */     this.gunModel[94].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 11, 0.0F, 0.0F, -2.0F, 2.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -2.5F);
/*  524 */     this.gunModel[94].setRotationPoint(-131.0F, 15.5F, -1.0F);
/*      */     
/*  526 */     this.gunModel[95].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, 0.0F, 1.0F, -3.5F);
/*  527 */     this.gunModel[95].setRotationPoint(-138.0F, 20.5F, -1.0F);
/*      */     
/*  529 */     this.gunModel[96].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.0F, 0.5F, -1.5F);
/*  530 */     this.gunModel[96].setRotationPoint(-138.0F, 22.5F, 2.5F);
/*      */     
/*  532 */     this.gunModel[97].addShapeBox(118.0F, -16.0F, 0.0F, 8, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  533 */     this.gunModel[97].setRotationPoint(-138.0F, 12.5F, -3.5F);
/*      */     
/*  535 */     this.gunModel[98].addShapeBox(118.0F, -16.0F, 0.0F, 9, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  536 */     this.gunModel[98].setRotationPoint(-138.0F, 6.5F, -3.5F);
/*      */     
/*  538 */     this.gunModel[99].addShapeBox(118.0F, -16.0F, 0.0F, 11, 5, 16, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  539 */     this.gunModel[99].setRotationPoint(-138.0F, 1.5F, -3.5F);
/*      */     
/*  541 */     this.gunModel[100].addShapeBox(118.0F, -16.0F, 0.0F, 12, 7, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  542 */     this.gunModel[100].setRotationPoint(-138.0F, -6.0F, -3.5F);
/*      */     
/*  544 */     this.gunModel[101].addShapeBox(118.0F, -16.0F, 0.0F, 4, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  545 */     this.gunModel[101].setRotationPoint(-138.0F, -11.0F, -3.5F);
/*      */     
/*  547 */     this.gunModel[102].addShapeBox(118.0F, -16.0F, 0.0F, 4, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/*  548 */     this.gunModel[102].setRotationPoint(-142.0F, 7.0F, -3.5F);
/*      */     
/*  550 */     this.gunModel[103].addShapeBox(118.0F, -16.0F, 0.0F, 4, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/*  551 */     this.gunModel[103].setRotationPoint(-146.0F, 3.0F, -3.5F);
/*      */     
/*  553 */     this.gunModel[104].addShapeBox(118.0F, -16.0F, 0.0F, 4, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  554 */     this.gunModel[104].setRotationPoint(-146.0F, -2.0F, -3.5F);
/*      */     
/*  556 */     this.gunModel[105].addShapeBox(118.0F, -16.0F, 0.0F, 9, 5, 16, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F);
/*  557 */     this.gunModel[105].setRotationPoint(-151.0F, -7.0F, -3.5F);
/*      */     
/*  559 */     this.gunModel[106].addShapeBox(118.0F, -16.0F, 0.0F, 4, 18, 16, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[106].setRotationPoint(-142.0F, -11.0F, -3.5F);
/*      */     
/*  562 */     this.gunModel[107].addShapeBox(118.0F, -16.0F, 0.0F, 12, 2, 11, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, -2.0F, -3.5F);
/*  563 */     this.gunModel[107].setRotationPoint(-150.0F, 20.5F, -1.0F);
/*      */     
/*  565 */     this.gunModel[108].addShapeBox(118.0F, -16.0F, 0.0F, 12, 1, 4, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, -2.5F, -1.5F);
/*  566 */     this.gunModel[108].setRotationPoint(-150.0F, 22.5F, 2.5F);
/*      */     
/*  568 */     this.gunModel[109].addShapeBox(118.0F, -16.0F, 0.0F, 12, 3, 16, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, -3.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F, -3.5F);
/*  569 */     this.gunModel[109].setRotationPoint(-150.0F, 17.5F, -3.5F);
/*      */     
/*  571 */     this.gunModel[110].addShapeBox(118.0F, -16.0F, 0.0F, 12, 5, 16, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F);
/*  572 */     this.gunModel[110].setRotationPoint(-150.0F, 12.5F, -3.5F);
/*      */     
/*  574 */     this.gunModel[111].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, -1.0F, 0.0F, -4.5F, -1.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/*  575 */     this.gunModel[111].setRotationPoint(-131.0F, 17.5F, -3.5F);
/*      */     
/*  577 */     this.gunModel[112].addShapeBox(118.0F, -16.0F, 0.0F, 6, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/*  578 */     this.gunModel[112].setRotationPoint(-138.0F, 17.5F, -3.5F);
/*      */     
/*  580 */     this.gunModel[113].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -0.85F);
/*  581 */     this.gunModel[113].setRotationPoint(-132.0F, 17.5F, -3.5F);
/*      */     
/*  583 */     this.gunModel[114].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, -4.5F, -1.0F, 0.0F, -4.5F, 0.0F, 0.0F, -2.5F);
/*  584 */     this.gunModel[114].setRotationPoint(-132.0F, 18.5F, -3.5F);
/*      */     
/*  586 */     this.gunModel[115].addShapeBox(118.0F, -16.0F, 0.0F, 12, 1, 16, 0.0F, 0.0F, 1.35F, -0.95F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.35F, -0.95F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F);
/*  587 */     this.gunModel[115].setRotationPoint(-150.0F, 11.5F, -3.5F);
/*      */     
/*  589 */     this.gunModel[116].addShapeBox(118.0F, -16.0F, 0.0F, 83, 16, 6, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 5.0F, -3.0F, 0.0F, -14.0F, -3.0F, 0.0F, -14.0F, -3.0F, 0.0F, 5.0F, -3.0F);
/*  590 */     this.gunModel[116].setRotationPoint(-245.0F, 14.0F, 1.5F);
/*      */     
/*  592 */     this.gunModel[117].addShapeBox(118.0F, -16.0F, 0.0F, 83, 19, 12, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 5.0F, -3.0F, 0.0F, -14.0F, -3.0F, 0.0F, -14.0F, -3.0F, 0.0F, 5.0F, -3.0F);
/*  593 */     this.gunModel[117].setRotationPoint(-245.0F, 9.0F, -1.5F);
/*      */     
/*  595 */     this.gunModel[118].addShapeBox(118.0F, -16.0F, 0.0F, 83, 23, 16, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 5.0F, -2.0F, 0.0F, -14.0F, -2.0F, 0.0F, -14.0F, -2.0F, 0.0F, 5.0F, -2.0F);
/*  596 */     this.gunModel[118].setRotationPoint(-245.0F, 0.0F, -3.5F);
/*      */     
/*  598 */     this.gunModel[119].addShapeBox(118.0F, -16.0F, 0.0F, 83, 20, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  599 */     this.gunModel[119].setRotationPoint(-245.0F, -6.0F, -3.5F);
/*      */     
/*  601 */     this.gunModel[120].addShapeBox(118.0F, -16.0F, 0.0F, 83, 7, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  602 */     this.gunModel[120].setRotationPoint(-245.0F, -13.0F, -3.5F);
/*      */     
/*  604 */     this.gunModel[121].addShapeBox(118.0F, -16.0F, 0.0F, 83, 3, 13, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  605 */     this.gunModel[121].setRotationPoint(-245.0F, -16.0F, -2.0F);
/*      */     
/*  607 */     this.gunModel[122].addShapeBox(118.0F, -16.0F, 0.0F, 100, 2, 8, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[122].setRotationPoint(-245.0F, -18.0F, 0.5F);
/*      */     
/*  610 */     this.gunModel[123].addShapeBox(118.0F, -16.0F, 0.0F, 13, 4, 16, 0.0F, 0.0F, 0.0F, -3.35F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F);
/*  611 */     this.gunModel[123].setRotationPoint(-151.0F, 8.0F, -3.5F);
/*      */     
/*  613 */     this.gunModel[124].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 16, 0.0F, -4.0F, 0.0F, -1.45F, 0.0F, 0.0F, -4.35F, 0.0F, 0.0F, -4.35F, -4.0F, 0.0F, -1.45F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -0.85F);
/*  614 */     this.gunModel[124].setRotationPoint(-157.0F, -11.0F, -3.5F);
/*      */     
/*  616 */     this.gunModel[125].addShapeBox(118.0F, -16.0F, 0.0F, 5, 3, 23, 0.0F, 0.0F, 0.0F, -7.0F, -3.0F, 0.0F, -7.0F, -3.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -5.45F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -5.45F);
/*  617 */     this.gunModel[125].setRotationPoint(-144.0F, -14.0F, -7.0F);
/*      */     
/*  619 */     this.gunModel[126].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  620 */     this.gunModel[126].setRotationPoint(-144.0F, -16.0F, -4.0F);
/*      */     
/*  622 */     this.gunModel[127].addShapeBox(118.0F, -16.0F, 0.0F, 7, 5, 21, 0.0F, 0.0F, -4.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -4.0F, -7.0F, 0.0F, 0.0F, -6.85F, 0.0F, 0.0F, -4.45F, 0.0F, 0.0F, -4.45F, 0.0F, 0.0F, -6.85F);
/*  623 */     this.gunModel[127].setRotationPoint(-151.0F, -16.0F, -6.0F);
/*      */     
/*  625 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 5, 3, 15, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  626 */     this.gunModel[''].setRotationPoint(-162.0F, -9.0F, -3.0F);
/*      */     
/*  628 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 13, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, -8.0F, 0.0F, 1.15F, -8.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F);
/*  629 */     this.gunModel[''].setRotationPoint(-162.0F, -13.0F, -1.5F);
/*      */     
/*  631 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 13, 3, 13, 0.0F, 0.0F, 0.0F, -2.5F, 5.0F, 0.0F, -2.5F, 5.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  632 */     this.gunModel[''].setRotationPoint(-162.0F, -16.0F, -2.0F);
/*      */     
/*  634 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 13, 4, 16, 0.0F, 0.0F, 0.0F, -4.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.35F, 0.0F, 0.0F, -3.35F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F);
/*  635 */     this.gunModel[''].setRotationPoint(-151.0F, -11.0F, -3.5F);
/*      */     
/*  637 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 6, 1, 16, 0.0F, -6.0F, 0.0F, -1.75F, 0.0F, 0.0F, -5.6F, 0.0F, 0.0F, -5.6F, -6.0F, 0.0F, -1.75F, -4.0F, 0.0F, -1.45F, 0.0F, 0.0F, -4.35F, 0.0F, 0.0F, -4.35F, -4.0F, 0.0F, -1.45F);
/*  638 */     this.gunModel[''].setRotationPoint(-157.0F, -12.0F, -3.5F);
/*      */     
/*  640 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 16, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -0.3F);
/*  641 */     this.gunModel[''].setRotationPoint(-157.0F, -9.0F, -3.5F);
/*      */     
/*  643 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 4, 5, 16, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  644 */     this.gunModel[''].setRotationPoint(-146.0F, -7.0F, -3.5F);
/*      */     
/*  646 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 5, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[''].setRotationPoint(-162.0F, -6.0F, -3.5F);
/*      */     
/*  649 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 6, 1, 15, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -2.85F, 0.0F, 0.0F, -2.85F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.85F, 0.0F, 0.0F, -2.85F, 0.0F, 0.0F, 0.5F);
/*  650 */     this.gunModel[''].setRotationPoint(-157.0F, -7.0F, -3.0F);
/*      */     
/*  652 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 6, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.0F);
/*  653 */     this.gunModel[''].setRotationPoint(-157.0F, -6.0F, -3.5F);
/*      */     
/*  655 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 5, 5, 16, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F);
/*  656 */     this.gunModel[''].setRotationPoint(-151.0F, -2.0F, -3.5F);
/*      */     
/*  658 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 6, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -0.65F);
/*  659 */     this.gunModel[''].setRotationPoint(-157.0F, 0.0F, -3.5F);
/*      */     
/*  661 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 5, 9, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  662 */     this.gunModel[''].setRotationPoint(-162.0F, 0.0F, -3.5F);
/*      */     
/*  664 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 9, 5, 16, 0.0F, 0.0F, 0.0F, -3.35F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.35F);
/*  665 */     this.gunModel[''].setRotationPoint(-151.0F, 3.0F, -3.5F);
/*      */     
/*  667 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 6, 5, 16, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -3.35F, 0.0F, 0.0F, -1.8F);
/*  668 */     this.gunModel[''].setRotationPoint(-157.0F, 3.0F, -3.5F);
/*      */     
/*  670 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 11, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -2.0F, 0.0F, -2.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, -2.0F, -3.5F);
/*  671 */     this.gunModel[''].setRotationPoint(-152.0F, 18.5F, -1.0F);
/*      */     
/*  673 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -2.5F, -1.5F);
/*  674 */     this.gunModel[''].setRotationPoint(-152.0F, 20.5F, 2.5F);
/*      */     
/*  676 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 11, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, -2.0F, -3.5F);
/*  677 */     this.gunModel[''].setRotationPoint(-153.0F, 16.5F, -1.0F);
/*      */     
/*  679 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 4, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -2.5F, -1.5F);
/*  680 */     this.gunModel[''].setRotationPoint(-153.0F, 18.5F, 2.5F);
/*      */     
/*  682 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 14, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, -3.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F, -3.5F);
/*  683 */     this.gunModel[''].setRotationPoint(-152.0F, 15.5F, -2.5F);
/*      */     
/*  685 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 12, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F, -1.5F);
/*  686 */     this.gunModel[''].setRotationPoint(-153.0F, 13.5F, -1.5F);
/*      */     
/*  688 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 5, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F);
/*  689 */     this.gunModel[''].setRotationPoint(-152.0F, 10.5F, -2.5F);
/*      */     
/*  691 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 5, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  692 */     this.gunModel[''].setRotationPoint(-162.0F, 9.0F, -1.5F);
/*      */     
/*  694 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 5, 16, 6, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -18.5F, 0.0F, 0.0F, -18.5F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 5.0F, -3.0F, 0.0F, 4.5F, -3.0F, 0.0F, 4.5F, -3.0F, 0.0F, 5.0F, -3.0F);
/*  695 */     this.gunModel[''].setRotationPoint(-162.0F, -5.0F, 1.5F);
/*      */     
/*  697 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 16, 6, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 5.0F, -3.0F, 0.0F, 5.0F, -3.0F, 0.0F, 5.0F, -3.0F, 0.0F, 5.0F, -3.0F);
/*  698 */     this.gunModel[''].setRotationPoint(-157.0F, -5.5F, 1.5F);
/*      */     
/*  700 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 16, 6, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -20.0F, 1.5F, 0.0F, -20.0F, 1.5F, 0.0F, -19.0F, 0.0F, 0.0F, 5.0F, -3.0F, 0.0F, 6.0F, -1.0F, 0.0F, 6.0F, -1.0F, 0.0F, 5.0F, -3.0F);
/*  701 */     this.gunModel[''].setRotationPoint(-155.0F, -5.5F, 1.5F);
/*      */     
/*  703 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F);
/*  704 */     this.gunModel[''].setRotationPoint(-157.0F, 9.0F, -1.5F);
/*      */     
/*  706 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 12, 0.0F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.65F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -3.0F);
/*  707 */     this.gunModel[''].setRotationPoint(-155.0F, 11.5F, -1.5F);
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F);
/*  710 */     this.gunModel[''].setRotationPoint(-153.0F, 10.5F, -1.5F);
/*      */     
/*  712 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F);
/*  713 */     this.gunModel[''].setRotationPoint(-155.0F, 10.5F, -0.5F);
/*      */     
/*  715 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F);
/*  716 */     this.gunModel[''].setRotationPoint(-157.0F, 8.0F, -1.5F);
/*      */     
/*  718 */     this.gunModel[''].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 14, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/*  719 */     this.gunModel[''].setRotationPoint(-152.0F, 9.5F, -2.5F);
/*      */     
/*  721 */     this.gunModel[' '].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.65F, 0.05F, 0.0F, -0.65F, 0.05F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  722 */     this.gunModel[' '].setRotationPoint(-151.0F, 9.5F, -2.5F);
/*      */     
/*  724 */     this.gunModel['¡'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 12, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  725 */     this.gunModel['¡'].setRotationPoint(-153.0F, 8.5F, -1.5F);
/*      */     
/*  727 */     this.gunModel['¢'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  728 */     this.gunModel['¢'].setRotationPoint(-155.0F, 8.5F, -1.5F);
/*      */     
/*  730 */     this.gunModel['£'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -2.0F, -2.0F);
/*  731 */     this.gunModel['£'].setRotationPoint(-155.0F, 16.5F, 2.5F);
/*      */     
/*  733 */     this.gunModel['¤'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 14, 0.0F, 0.0F, -0.5F, -1.15F, 0.0F, -0.5F, -1.2F, 0.0F, -0.5F, -1.2F, 0.0F, -0.5F, -1.15F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F);
/*  734 */     this.gunModel['¤'].setRotationPoint(-152.0F, 8.5F, -2.5F);
/*      */     
/*  736 */     this.gunModel['¥'].addShapeBox(118.0F, -16.0F, 0.0F, 10, 2, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  737 */     this.gunModel['¥'].setRotationPoint(-110.0F, -18.5F, -0.5F);
/*      */     
/*  739 */     this.gunModel['¦'].addShapeBox(118.0F, -16.0F, 0.0F, 9, 25, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel['¦'].setRotationPoint(-254.0F, -6.0F, -3.5F);
/*      */     
/*  742 */     this.gunModel['§'].addShapeBox(118.0F, -16.0F, 0.0F, 9, 7, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel['§'].setRotationPoint(-254.0F, -13.0F, -3.5F);
/*      */     
/*  745 */     this.gunModel['¨'].addShapeBox(118.0F, -16.0F, 0.0F, 9, 3, 13, 0.0F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  746 */     this.gunModel['¨'].setRotationPoint(-254.0F, -16.0F, -2.0F);
/*      */     
/*  748 */     this.gunModel['©'].addShapeBox(118.0F, -16.0F, 0.0F, 8, 2, 8, 0.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  749 */     this.gunModel['©'].setRotationPoint(-253.0F, -18.0F, 0.5F);
/*      */     
/*  751 */     this.gunModel['ª'].addShapeBox(118.0F, -16.0F, 0.0F, 7, 9, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F);
/*  752 */     this.gunModel['ª'].setRotationPoint(-252.0F, 19.0F, -3.5F);
/*      */     
/*  754 */     this.gunModel['«'].addShapeBox(118.0F, -16.0F, 0.0F, 6, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F);
/*  755 */     this.gunModel['«'].setRotationPoint(-251.0F, 28.0F, -1.5F);
/*      */     
/*  757 */     this.gunModel['¬'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F);
/*  758 */     this.gunModel['¬'].setRotationPoint(-250.0F, 33.0F, 1.5F);
/*      */     
/*  760 */     this.gunModel['­'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 8, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  761 */     this.gunModel['­'].setRotationPoint(-104.0F, -14.0F, -3.5F);
/*      */     
/*  763 */     this.gunModel['®'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 3, 7, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel['®'].setRotationPoint(-104.0F, -17.0F, -2.5F);
/*      */     
/*  766 */     this.gunModel['¯'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel['¯'].setRotationPoint(-104.0F, -11.0F, -3.5F);
/*      */     
/*  769 */     this.gunModel['°'].addShapeBox(118.0F, -16.0F, 0.0F, 3, 5, 11, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel['°'].setRotationPoint(-99.0F, -11.0F, -3.5F);
/*      */     
/*  772 */     this.gunModel['±'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel['±'].setRotationPoint(-104.0F, -8.0F, -3.5F);
/*      */     
/*  775 */     this.gunModel['²'].addShapeBox(118.0F, -16.0F, 0.0F, 10, 2, 1, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  776 */     this.gunModel['²'].setRotationPoint(-110.0F, -18.5F, -1.5F);
/*      */     
/*  778 */     this.gunModel['³'].addShapeBox(118.0F, -16.0F, 0.0F, 32, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  779 */     this.gunModel['³'].setRotationPoint(-76.0F, -20.0F, 6.5F);
/*      */     
/*  781 */     this.gunModel['´'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  782 */     this.gunModel['´'].setRotationPoint(-94.0F, -27.5F, 6.5F);
/*      */     
/*  784 */     this.gunModel['µ'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  785 */     this.gunModel['µ'].setRotationPoint(-94.0F, -27.5F, 1.5F);
/*      */     
/*  787 */     this.gunModel['¶'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  788 */     this.gunModel['¶'].setRotationPoint(-44.0F, -27.5F, 6.5F);
/*      */     
/*  790 */     this.gunModel['·'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  791 */     this.gunModel['·'].setRotationPoint(-44.0F, -27.5F, 1.5F);
/*      */     
/*  793 */     this.gunModel['¸'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  794 */     this.gunModel['¸'].setRotationPoint(-94.0F, -29.0F, 1.5F);
/*      */     
/*  796 */     this.gunModel['¹'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  797 */     this.gunModel['¹'].setRotationPoint(-94.0F, -27.5F, 2.5F);
/*      */     
/*  799 */     this.gunModel['º'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 5, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/*  800 */     this.gunModel['º'].setRotationPoint(-94.0F, -28.75F, 2.0F);
/*      */     
/*  802 */     this.gunModel['»'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  803 */     this.gunModel['»'].setRotationPoint(-44.0F, -29.0F, 1.5F);
/*      */     
/*  805 */     this.gunModel['¼'].addShapeBox(118.0F, -16.0F, 0.0F, 18, 1, 5, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/*  806 */     this.gunModel['¼'].setRotationPoint(-44.0F, -28.75F, 2.0F);
/*      */     
/*  808 */     this.gunModel['½'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.65F, -0.5F, 0.0F, -1.65F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel['½'].setRotationPoint(-115.0F, -20.0F, -1.5F);
/*      */     
/*  811 */     this.gunModel['¾'].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 9.0F, 0.0F, 0.0F);
/*  812 */     this.gunModel['¾'].setRotationPoint(-115.0F, -17.0F, -3.0F);
/*      */     
/*  814 */     this.gunModel['¿'].addShapeBox(118.0F, -16.0F, 0.0F, 20, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F);
/*  815 */     this.gunModel['¿'].setRotationPoint(-124.0F, -14.0F, -3.5F);
/*      */     
/*  817 */     this.gunModel['À'].addShapeBox(118.0F, -16.0F, 0.0F, 6, 7, 10, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  818 */     this.gunModel['À'].setRotationPoint(-110.0F, -17.15F, -0.5F);
/*      */     
/*  820 */     this.gunModel['Á'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 7, 4, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, 1.2F, -0.15F, 0.0F, 1.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  821 */     this.gunModel['Á'].setRotationPoint(-115.0F, -17.15F, -0.5F);
/*      */     
/*  823 */     this.gunModel['Â'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 7, 4, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 1.2F, 0.0F, 0.0F, 1.2F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F);
/*  824 */     this.gunModel['Â'].setRotationPoint(-115.0F, -17.15F, 5.5F);
/*      */     
/*  826 */     this.gunModel['Ã'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 10, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  827 */     this.gunModel['Ã'].setRotationPoint(-130.0F, -14.0F, -0.5F);
/*      */     
/*  829 */     this.gunModel['Ä'].addShapeBox(118.0F, -16.0F, 0.0F, 7, 5, 4, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 1.85F, -0.15F, -1.0F, -0.2F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.15F, -1.0F, -0.5F, -0.65F);
/*  830 */     this.gunModel['Ä'].setRotationPoint(-122.0F, -15.15F, 5.5F);
/*      */     
/*  832 */     this.gunModel['Å'].addShapeBox(118.0F, -16.0F, 0.0F, 7, 5, 4, 0.0F, -1.0F, -0.2F, -0.65F, 0.0F, 1.85F, -0.15F, 0.0F, 1.85F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  833 */     this.gunModel['Å'].setRotationPoint(-122.0F, -15.15F, -0.5F);
/*      */     
/*  835 */     this.gunModel['Æ'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.35F, -0.5F, 0.0F, 0.95F, -0.5F, 0.0F, 0.95F, -2.5F, 0.0F, 0.35F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -0.5F);
/*  836 */     this.gunModel['Æ'].setRotationPoint(-125.0F, -13.35F, -0.5F);
/*      */     
/*  838 */     this.gunModel['Ç'].addShapeBox(118.0F, -16.0F, 0.0F, 13, 2, 5, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 4.35F, 0.0F, 0.0F, 4.35F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  839 */     this.gunModel['Ç'].setRotationPoint(-123.0F, -13.35F, 2.0F);
/*      */     
/*  841 */     this.gunModel['È'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.35F, -2.0F, 0.0F, 0.95F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  842 */     this.gunModel['È'].setRotationPoint(-125.0F, -13.35F, 0.0F);
/*      */     
/*  844 */     this.gunModel['É'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 5, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  845 */     this.gunModel['É'].setRotationPoint(-125.0F, -13.35F, 2.0F);
/*      */     
/*  847 */     this.gunModel['Ê'].addShapeBox(118.0F, -16.0F, 0.0F, 13, 2, 3, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 4.35F, 0.0F, 0.0F, 4.35F, -0.5F, 0.0F, 0.95F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  848 */     this.gunModel['Ê'].setRotationPoint(-123.0F, -13.35F, 7.0F);
/*      */     
/*  850 */     this.gunModel['Ë'].addShapeBox(118.0F, -16.0F, 0.0F, 13, 2, 3, 0.0F, 0.0F, 0.95F, -0.5F, 0.0F, 4.35F, -0.5F, 0.0F, 4.35F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  851 */     this.gunModel['Ë'].setRotationPoint(-123.0F, -13.35F, -1.0F);
/*      */     
/*  853 */     this.gunModel['Ì'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  854 */     this.gunModel['Ì'].setRotationPoint(-129.0F, -14.0F, 9.0F);
/*      */     
/*  856 */     this.gunModel['Í'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  857 */     this.gunModel['Í'].setRotationPoint(-129.0F, -14.0F, -0.5F);
/*      */     
/*  859 */     this.gunModel['Î'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.35F, -0.5F, 0.0F, 0.95F, -2.5F, 0.0F, 0.95F, -0.5F, 0.0F, 0.35F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  860 */     this.gunModel['Î'].setRotationPoint(-125.0F, -13.35F, 6.5F);
/*      */     
/*  862 */     this.gunModel['Ï'].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, 0.35F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F);
/*  863 */     this.gunModel['Ï'].setRotationPoint(-125.0F, -13.35F, 7.0F);
/*      */     
/*  865 */     this.gunModel['Ð'].addShapeBox(118.0F, -16.0F, 0.0F, 4, 5, 2, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  866 */     this.gunModel['Ð'].setRotationPoint(-122.0F, -16.15F, 3.5F);
/*      */     
/*  868 */     this.gunModel['Ñ'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 5, 1, 0.0F, 0.0F, -1.15F, -0.25F, -0.25F, -0.9F, -1.0F, -0.25F, -0.9F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  869 */     this.gunModel['Ñ'].setRotationPoint(-118.0F, -17.25F, 4.5F);
/*      */     
/*  871 */     this.gunModel['Ò'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 5, 1, 0.0F, 0.0F, -1.15F, 0.0F, -0.25F, -0.9F, 0.0F, -0.25F, -0.9F, -1.0F, 0.0F, -1.15F, -0.25F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -1.0F, 0.0F, -0.5F, -0.25F);
/*  872 */     this.gunModel['Ò'].setRotationPoint(-118.0F, -17.25F, 3.5F);
/*      */     
/*  874 */     this.gunModel['Ó'].addShapeBox(118.0F, -16.0F, 0.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel['Ó'].setRotationPoint(-124.0F, -14.0F, 8.5F);
/*      */     
/*  877 */     this.gunModel['Ô'].addShapeBox(118.0F, -16.0F, 0.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  878 */     this.gunModel['Ô'].setRotationPoint(-124.0F, -14.0F, -0.5F);
/*      */     
/*  880 */     this.gunModel['Õ'].addShapeBox(118.0F, -16.0F, 0.0F, 4, 3, 9, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel['Õ'].setRotationPoint(-129.0F, -14.0F, 0.0F);
/*      */     
/*  883 */     this.gunModel['Ö'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  884 */     this.gunModel['Ö'].setRotationPoint(-107.0F, -19.15F, 1.0F);
/*      */     
/*  886 */     this.gunModel['×'].addShapeBox(118.0F, -16.0F, 0.0F, 10, 2, 1, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  887 */     this.gunModel['×'].setRotationPoint(-110.0F, -18.5F, 1.5F);
/*      */     
/*  889 */     this.gunModel['Ø'].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  890 */     this.gunModel['Ø'].setRotationPoint(-107.0F, -20.15F, 1.0F);
/*      */     
/*  892 */     this.gunModel['Ù'].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 1, 0.0F, 0.5F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  893 */     this.gunModel['Ù'].setRotationPoint(-105.0F, -18.5F, 1.0F);
/*      */     
/*      */ 
/*  896 */     this.defaultScopeModel = new ModelRendererTurbo[102];
/*  897 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 865, 209, this.textureX, this.textureY);
/*  898 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 385, 217, this.textureX, this.textureY);
/*  899 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 441, 225, this.textureX, this.textureY);
/*  900 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 553, 225, this.textureX, this.textureY);
/*  901 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 41, 233, this.textureX, this.textureY);
/*  902 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 73, 233, this.textureX, this.textureY);
/*  903 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 521, 209, this.textureX, this.textureY);
/*  904 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 769, 225, this.textureX, this.textureY);
/*  905 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 105, 233, this.textureX, this.textureY);
/*  906 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 129, 233, this.textureX, this.textureY);
/*  907 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 153, 233, this.textureX, this.textureY);
/*  908 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 177, 233, this.textureX, this.textureY);
/*  909 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 201, 233, this.textureX, this.textureY);
/*  910 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 233, 233, this.textureX, this.textureY);
/*  911 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 569, 121, this.textureX, this.textureY);
/*  912 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 601, 129, this.textureX, this.textureY);
/*  913 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 265, 233, this.textureX, this.textureY);
/*  914 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  915 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 369, 89, this.textureX, this.textureY);
/*  916 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*  917 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 257, 121, this.textureX, this.textureY);
/*  918 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 921, 105, this.textureX, this.textureY);
/*  919 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/*  920 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 753, 113, this.textureX, this.textureY);
/*  921 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  922 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 809, 113, this.textureX, this.textureY);
/*  923 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*  924 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  925 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  926 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/*  927 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 217, 121, this.textureX, this.textureY);
/*  928 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  929 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/*  930 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 969, 121, this.textureX, this.textureY);
/*  931 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 529, 129, this.textureX, this.textureY);
/*  932 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 785, 233, this.textureX, this.textureY);
/*  933 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 889, 241, this.textureX, this.textureY);
/*  934 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  935 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*  936 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 545, 41, this.textureX, this.textureY);
/*  937 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  938 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 905, 129, this.textureX, this.textureY);
/*  939 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 801, 137, this.textureX, this.textureY);
/*  940 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 249, 145, this.textureX, this.textureY);
/*  941 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  942 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  943 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 81, 97, this.textureX, this.textureY);
/*  944 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 305, 233, this.textureX, this.textureY);
/*  945 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 577, 233, this.textureX, this.textureY);
/*  946 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 657, 233, this.textureX, this.textureY);
/*  947 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 681, 233, this.textureX, this.textureY);
/*  948 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 705, 233, this.textureX, this.textureY);
/*  949 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 321, 241, this.textureX, this.textureY);
/*  950 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/*  951 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 545, 145, this.textureX, this.textureY);
/*  952 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 617, 145, this.textureX, this.textureY);
/*  953 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*  954 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 905, 73, this.textureX, this.textureY);
/*  955 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 937, 73, this.textureX, this.textureY);
/*  956 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 569, 129, this.textureX, this.textureY);
/*  957 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 649, 129, this.textureX, this.textureY);
/*  958 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/*  959 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 593, 241, this.textureX, this.textureY);
/*  960 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 721, 241, this.textureX, this.textureY);
/*  961 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 113, 249, this.textureX, this.textureY);
/*  962 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 145, 249, this.textureX, this.textureY);
/*  963 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 185, 249, this.textureX, this.textureY);
/*  964 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 225, 249, this.textureX, this.textureY);
/*  965 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 497, 241, this.textureX, this.textureY);
/*  966 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 1001, 241, this.textureX, this.textureY);
/*  967 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 265, 249, this.textureX, this.textureY);
/*  968 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 289, 249, this.textureX, this.textureY);
/*  969 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 401, 249, this.textureX, this.textureY);
/*  970 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 425, 249, this.textureX, this.textureY);
/*  971 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 441, 249, this.textureX, this.textureY);
/*  972 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 609, 249, this.textureX, this.textureY);
/*  973 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 657, 249, this.textureX, this.textureY);
/*  974 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 561, 249, this.textureX, this.textureY);
/*  975 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 697, 249, this.textureX, this.textureY);
/*  976 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 745, 249, this.textureX, this.textureY);
/*  977 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 777, 249, this.textureX, this.textureY);
/*  978 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 825, 249, this.textureX, this.textureY);
/*  979 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 305, 257, this.textureX, this.textureY);
/*  980 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 481, 257, this.textureX, this.textureY);
/*  981 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 865, 257, this.textureX, this.textureY);
/*  982 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 913, 257, this.textureX, this.textureY);
/*  983 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  984 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  985 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 1017, 9, this.textureX, this.textureY);
/*  986 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 1001, 17, this.textureX, this.textureY);
/*  987 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 1017, 17, this.textureX, this.textureY);
/*  988 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 633, 25, this.textureX, this.textureY);
/*  989 */     this.defaultScopeModel[92] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  990 */     this.defaultScopeModel[93] = new ModelRendererTurbo(this, 337, 113, this.textureX, this.textureY);
/*  991 */     this.defaultScopeModel[94] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  992 */     this.defaultScopeModel[95] = new ModelRendererTurbo(this, 673, 33, this.textureX, this.textureY);
/*  993 */     this.defaultScopeModel[96] = new ModelRendererTurbo(this, 561, 41, this.textureX, this.textureY);
/*  994 */     this.defaultScopeModel[97] = new ModelRendererTurbo(this, 905, 41, this.textureX, this.textureY);
/*  995 */     this.defaultScopeModel[98] = new ModelRendererTurbo(this, 1001, 41, this.textureX, this.textureY);
/*  996 */     this.defaultScopeModel[99] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  997 */     this.defaultScopeModel[100] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/*  998 */     this.defaultScopeModel[101] = new ModelRendererTurbo(this, 369, 129, this.textureX, this.textureY);
/*      */     
/* 1000 */     this.defaultScopeModel[0].addShapeBox(118.0F, -16.0F, 0.0F, 5, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1001 */     this.defaultScopeModel[0].setRotationPoint(-40.0F, -33.0F, 1.0F);
/*      */     
/* 1003 */     this.defaultScopeModel[1].addShapeBox(118.0F, -16.0F, 0.0F, 5, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1004 */     this.defaultScopeModel[1].setRotationPoint(-85.0F, -33.0F, 1.0F);
/*      */     
/* 1006 */     this.defaultScopeModel[2].addShapeBox(118.0F, -16.0F, 0.0F, 5, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1007 */     this.defaultScopeModel[2].setRotationPoint(-40.0F, -38.0F, 0.5F);
/*      */     
/* 1009 */     this.defaultScopeModel[3].addShapeBox(118.0F, -16.0F, 0.0F, 5, 1, 9, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1010 */     this.defaultScopeModel[3].setRotationPoint(-40.0F, -34.0F, 0.0F);
/*      */     
/* 1012 */     this.defaultScopeModel[4].addShapeBox(118.0F, -16.0F, 0.0F, 5, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1013 */     this.defaultScopeModel[4].setRotationPoint(-85.0F, -38.0F, 0.5F);
/*      */     
/* 1015 */     this.defaultScopeModel[5].addShapeBox(118.0F, -16.0F, 0.0F, 5, 1, 9, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1016 */     this.defaultScopeModel[5].setRotationPoint(-85.0F, -34.0F, 0.0F);
/*      */     
/* 1018 */     this.defaultScopeModel[6].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1019 */     this.defaultScopeModel[6].setRotationPoint(-84.0F, -30.5F, 0.5F);
/*      */     
/* 1021 */     this.defaultScopeModel[7].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1022 */     this.defaultScopeModel[7].setRotationPoint(-84.0F, -31.5F, 0.5F);
/*      */     
/* 1024 */     this.defaultScopeModel[8].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 8, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1025 */     this.defaultScopeModel[8].setRotationPoint(-84.0F, -32.5F, 0.5F);
/*      */     
/* 1027 */     this.defaultScopeModel[9].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1028 */     this.defaultScopeModel[9].setRotationPoint(-39.0F, -30.5F, 0.5F);
/*      */     
/* 1030 */     this.defaultScopeModel[10].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1031 */     this.defaultScopeModel[10].setRotationPoint(-39.0F, -31.5F, 0.5F);
/*      */     
/* 1033 */     this.defaultScopeModel[11].addShapeBox(118.0F, -16.0F, 0.0F, 3, 1, 8, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1034 */     this.defaultScopeModel[11].setRotationPoint(-39.0F, -32.5F, 0.5F);
/*      */     
/* 1036 */     this.defaultScopeModel[12].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1037 */     this.defaultScopeModel[12].setRotationPoint(-40.0F, -40.0F, 0.5F);
/*      */     
/* 1039 */     this.defaultScopeModel[13].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1040 */     this.defaultScopeModel[13].setRotationPoint(-85.0F, -40.0F, 0.5F);
/*      */     
/* 1042 */     this.defaultScopeModel[14].addShapeBox(118.0F, -16.0F, 0.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1043 */     this.defaultScopeModel[14].setRotationPoint(-85.0F, -41.0F, 1.5F);
/*      */     
/* 1045 */     this.defaultScopeModel[15].addShapeBox(118.0F, -16.0F, 0.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1046 */     this.defaultScopeModel[15].setRotationPoint(-40.0F, -41.0F, 1.5F);
/*      */     
/* 1048 */     this.defaultScopeModel[16].addShapeBox(118.0F, -16.0F, 0.0F, 8, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1049 */     this.defaultScopeModel[16].setRotationPoint(-63.0F, -38.5F, 0.5F);
/*      */     
/* 1051 */     this.defaultScopeModel[17].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1052 */     this.defaultScopeModel[17].setRotationPoint(-63.0F, -40.5F, 0.5F);
/*      */     
/* 1054 */     this.defaultScopeModel[18].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1055 */     this.defaultScopeModel[18].setRotationPoint(-60.0F, -40.5F, 0.5F);
/*      */     
/* 1057 */     this.defaultScopeModel[19].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1058 */     this.defaultScopeModel[19].setRotationPoint(-58.0F, -40.5F, 0.5F);
/*      */     
/* 1060 */     this.defaultScopeModel[20].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1061 */     this.defaultScopeModel[20].setRotationPoint(-63.0F, -34.5F, 0.5F);
/*      */     
/* 1063 */     this.defaultScopeModel[21].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1064 */     this.defaultScopeModel[21].setRotationPoint(-60.0F, -34.5F, 0.5F);
/*      */     
/* 1066 */     this.defaultScopeModel[22].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1067 */     this.defaultScopeModel[22].setRotationPoint(-58.0F, -34.5F, 0.5F);
/*      */     
/* 1069 */     this.defaultScopeModel[23].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1070 */     this.defaultScopeModel[23].setRotationPoint(-63.0F, -40.5F, 3.5F);
/*      */     
/* 1072 */     this.defaultScopeModel[24].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1073 */     this.defaultScopeModel[24].setRotationPoint(-60.0F, -40.5F, 3.5F);
/*      */     
/* 1075 */     this.defaultScopeModel[25].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1076 */     this.defaultScopeModel[25].setRotationPoint(-58.0F, -40.5F, 3.5F);
/*      */     
/* 1078 */     this.defaultScopeModel[26].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1079 */     this.defaultScopeModel[26].setRotationPoint(-63.0F, -34.5F, 3.5F);
/*      */     
/* 1081 */     this.defaultScopeModel[27].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1082 */     this.defaultScopeModel[27].setRotationPoint(-60.0F, -34.5F, 3.5F);
/*      */     
/* 1084 */     this.defaultScopeModel[28].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1085 */     this.defaultScopeModel[28].setRotationPoint(-58.0F, -34.5F, 3.5F);
/*      */     
/* 1087 */     this.defaultScopeModel[29].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1088 */     this.defaultScopeModel[29].setRotationPoint(-63.0F, -40.5F, 5.5F);
/*      */     
/* 1090 */     this.defaultScopeModel[30].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1091 */     this.defaultScopeModel[30].setRotationPoint(-60.0F, -40.5F, 5.5F);
/*      */     
/* 1093 */     this.defaultScopeModel[31].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1094 */     this.defaultScopeModel[31].setRotationPoint(-58.0F, -40.5F, 5.5F);
/*      */     
/* 1096 */     this.defaultScopeModel[32].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1097 */     this.defaultScopeModel[32].setRotationPoint(-63.0F, -34.5F, 5.5F);
/*      */     
/* 1099 */     this.defaultScopeModel[33].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1100 */     this.defaultScopeModel[33].setRotationPoint(-60.0F, -34.5F, 5.5F);
/*      */     
/* 1102 */     this.defaultScopeModel[34].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1103 */     this.defaultScopeModel[34].setRotationPoint(-58.0F, -34.5F, 5.5F);
/*      */     
/* 1105 */     this.defaultScopeModel[35].addShapeBox(118.0F, -16.0F, 0.0F, 48, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1106 */     this.defaultScopeModel[35].setRotationPoint(-88.0F, -37.5F, 1.0F);
/*      */     
/* 1108 */     this.defaultScopeModel[36].addShapeBox(118.0F, -16.0F, 0.0F, 48, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F);
/* 1109 */     this.defaultScopeModel[36].setRotationPoint(-88.0F, -35.0F, 1.0F);
/*      */     
/* 1111 */     this.defaultScopeModel[37].addShapeBox(118.0F, -16.0F, 0.0F, 48, 2, 7, 0.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1112 */     this.defaultScopeModel[37].setRotationPoint(-88.0F, -40.0F, 1.0F);
/*      */     
/* 1114 */     this.defaultScopeModel[38].addShapeBox(118.0F, -16.0F, 0.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1115 */     this.defaultScopeModel[38].setRotationPoint(-61.0F, -37.0F, 10.5F);
/*      */     
/* 1117 */     this.defaultScopeModel[39].addShapeBox(118.0F, -16.0F, 0.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F);
/* 1118 */     this.defaultScopeModel[39].setRotationPoint(-61.0F, -35.5F, 10.5F);
/*      */     
/* 1120 */     this.defaultScopeModel[40].addShapeBox(118.0F, -16.0F, 0.0F, 4, 1, 1, 0.0F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1121 */     this.defaultScopeModel[40].setRotationPoint(-61.0F, -38.5F, 10.5F);
/*      */     
/* 1123 */     this.defaultScopeModel[41].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1124 */     this.defaultScopeModel[41].setRotationPoint(-62.0F, -37.5F, 8.0F);
/*      */     
/* 1126 */     this.defaultScopeModel[42].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1127 */     this.defaultScopeModel[42].setRotationPoint(-62.0F, -35.5F, 8.0F);
/*      */     
/* 1129 */     this.defaultScopeModel[43].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1130 */     this.defaultScopeModel[43].setRotationPoint(-62.0F, -39.5F, 8.0F);
/*      */     
/* 1132 */     this.defaultScopeModel[44].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1133 */     this.defaultScopeModel[44].setRotationPoint(-62.0F, -37.5F, 11.5F);
/*      */     
/* 1135 */     this.defaultScopeModel[45].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1136 */     this.defaultScopeModel[45].setRotationPoint(-62.0F, -35.5F, 11.5F);
/*      */     
/* 1138 */     this.defaultScopeModel[46].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1139 */     this.defaultScopeModel[46].setRotationPoint(-62.0F, -39.5F, 11.5F);
/*      */     
/* 1141 */     this.defaultScopeModel[47].addShapeBox(118.0F, -16.0F, 0.0F, 2, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1142 */     this.defaultScopeModel[47].setRotationPoint(-58.0F, -44.5F, 1.5F);
/*      */     
/* 1144 */     this.defaultScopeModel[48].addShapeBox(118.0F, -16.0F, 0.0F, 2, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1145 */     this.defaultScopeModel[48].setRotationPoint(-60.0F, -44.5F, 1.5F);
/*      */     
/* 1147 */     this.defaultScopeModel[49].addShapeBox(118.0F, -16.0F, 0.0F, 2, 5, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1148 */     this.defaultScopeModel[49].setRotationPoint(-62.0F, -44.5F, 1.5F);
/*      */     
/* 1150 */     this.defaultScopeModel[50].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 7, 0.0F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, -2.25F, 0.25F, 0.5F, -2.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -2.25F, 0.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.25F);
/* 1151 */     this.defaultScopeModel[50].setRotationPoint(-57.5F, -45.0F, 1.0F);
/*      */     
/* 1153 */     this.defaultScopeModel[51].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 7, 0.0F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 1154 */     this.defaultScopeModel[51].setRotationPoint(-60.0F, -45.0F, 1.0F);
/*      */     
/* 1156 */     this.defaultScopeModel[52].addShapeBox(118.0F, -16.0F, 0.0F, 2, 1, 7, 0.0F, 0.25F, 0.5F, -2.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, -2.25F, 0.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -2.25F);
/* 1157 */     this.defaultScopeModel[52].setRotationPoint(-62.5F, -45.0F, 1.0F);
/*      */     
/* 1159 */     this.defaultScopeModel[53].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1160 */     this.defaultScopeModel[53].setRotationPoint(-62.0F, -37.5F, -2.5F);
/*      */     
/* 1162 */     this.defaultScopeModel[54].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1163 */     this.defaultScopeModel[54].setRotationPoint(-62.0F, -35.5F, -2.5F);
/*      */     
/* 1165 */     this.defaultScopeModel[55].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1166 */     this.defaultScopeModel[55].setRotationPoint(-62.0F, -39.5F, -2.5F);
/*      */     
/* 1168 */     this.defaultScopeModel[56].addShapeBox(118.0F, -16.0F, 0.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1169 */     this.defaultScopeModel[56].setRotationPoint(-61.0F, -37.0F, -3.0F);
/*      */     
/* 1171 */     this.defaultScopeModel[57].addShapeBox(118.0F, -16.0F, 0.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F);
/* 1172 */     this.defaultScopeModel[57].setRotationPoint(-61.0F, -35.5F, -3.0F);
/*      */     
/* 1174 */     this.defaultScopeModel[58].addShapeBox(118.0F, -16.0F, 0.0F, 4, 1, 1, 0.0F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1175 */     this.defaultScopeModel[58].setRotationPoint(-61.0F, -38.5F, -3.0F);
/*      */     
/* 1177 */     this.defaultScopeModel[59].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1178 */     this.defaultScopeModel[59].setRotationPoint(-62.0F, -37.5F, -4.0F);
/*      */     
/* 1180 */     this.defaultScopeModel[60].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1181 */     this.defaultScopeModel[60].setRotationPoint(-62.0F, -35.5F, -4.0F);
/*      */     
/* 1183 */     this.defaultScopeModel[61].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1184 */     this.defaultScopeModel[61].setRotationPoint(-62.0F, -39.5F, -4.0F);
/*      */     
/* 1186 */     this.defaultScopeModel[62].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1187 */     this.defaultScopeModel[62].setRotationPoint(-35.0F, -37.5F, 1.0F);
/*      */     
/* 1189 */     this.defaultScopeModel[63].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F);
/* 1190 */     this.defaultScopeModel[63].setRotationPoint(-35.0F, -35.0F, 1.0F);
/*      */     
/* 1192 */     this.defaultScopeModel[64].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 7, 0.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1193 */     this.defaultScopeModel[64].setRotationPoint(-35.0F, -40.0F, 1.0F);
/*      */     
/* 1195 */     this.defaultScopeModel[65].addShapeBox(118.0F, -16.0F, 0.0F, 7, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1196 */     this.defaultScopeModel[65].setRotationPoint(-97.75F, -38.0F, 0.0F);
/*      */     
/* 1198 */     this.defaultScopeModel[66].addShapeBox(118.0F, -16.0F, 0.0F, 7, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1199 */     this.defaultScopeModel[66].setRotationPoint(-97.75F, -35.0F, 0.0F);
/*      */     
/* 1201 */     this.defaultScopeModel[67].addShapeBox(118.0F, -16.0F, 0.0F, 7, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1202 */     this.defaultScopeModel[67].setRotationPoint(-97.75F, -41.0F, 0.0F);
/*      */     
/* 1204 */     this.defaultScopeModel[68].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 1.0F);
/* 1205 */     this.defaultScopeModel[68].setRotationPoint(-90.5F, -37.5F, 1.0F);
/*      */     
/* 1207 */     this.defaultScopeModel[69].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 1.0F, -2.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 1.0F, -2.0F);
/* 1208 */     this.defaultScopeModel[69].setRotationPoint(-90.5F, -35.0F, 1.0F);
/*      */     
/* 1210 */     this.defaultScopeModel[70].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, 1.0F, -2.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 1.0F, -2.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.0F, 1.0F);
/* 1211 */     this.defaultScopeModel[70].setRotationPoint(-90.5F, -40.0F, 1.0F);
/*      */     
/* 1213 */     this.defaultScopeModel[71].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.25F, 0.25F);
/* 1214 */     this.defaultScopeModel[71].setRotationPoint(-100.0F, -37.5F, 1.0F);
/*      */     
/* 1216 */     this.defaultScopeModel[72].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -2.25F, 0.25F, 1.0F, -2.0F, 0.25F, 1.0F, -2.0F, 0.25F, 0.25F, -2.25F);
/* 1217 */     this.defaultScopeModel[72].setRotationPoint(-100.0F, -35.0F, 1.0F);
/*      */     
/* 1219 */     this.defaultScopeModel[73].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, 0.25F, -2.25F, 0.25F, 1.0F, -2.0F, 0.25F, 1.0F, -2.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.25F, 0.25F);
/* 1220 */     this.defaultScopeModel[73].setRotationPoint(-100.0F, -40.0F, 1.0F);
/*      */     
/* 1222 */     this.defaultScopeModel[74].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 10, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F);
/* 1223 */     this.defaultScopeModel[74].setRotationPoint(-118.0F, -34.5F, -0.5F);
/*      */     
/* 1225 */     this.defaultScopeModel[75].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 10, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1226 */     this.defaultScopeModel[75].setRotationPoint(-118.0F, -38.0F, -0.5F);
/*      */     
/* 1228 */     this.defaultScopeModel[76].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 10, 0.0F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1229 */     this.defaultScopeModel[76].setRotationPoint(-118.0F, -41.5F, -0.5F);
/*      */     
/* 1231 */     this.defaultScopeModel[77].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 7, 0.0F, 0.25F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 1.75F, 0.25F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 1.75F);
/* 1232 */     this.defaultScopeModel[77].setRotationPoint(-106.5F, -37.5F, 1.0F);
/*      */     
/* 1234 */     this.defaultScopeModel[78].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 7, 0.0F, 0.25F, 0.25F, 1.75F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 1.75F, 0.25F, 1.25F, -1.75F, 0.25F, -0.25F, -2.25F, 0.25F, -0.25F, -2.25F, 0.25F, 1.25F, -1.75F);
/* 1235 */     this.defaultScopeModel[78].setRotationPoint(-106.5F, -34.5F, 1.0F);
/*      */     
/* 1237 */     this.defaultScopeModel[79].addShapeBox(118.0F, -16.0F, 0.0F, 6, 2, 7, 0.0F, 0.25F, 1.25F, -1.75F, 0.25F, -0.25F, -2.25F, 0.25F, -0.25F, -2.25F, 0.25F, 1.25F, -1.75F, 0.25F, 0.25F, 1.75F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 1.75F);
/* 1238 */     this.defaultScopeModel[79].setRotationPoint(-106.5F, -40.5F, 1.0F);
/*      */     
/* 1240 */     this.defaultScopeModel[80].addShapeBox(118.0F, -16.0F, 0.0F, 15, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 1.75F, 0.25F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 1.75F, 0.25F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F);
/* 1241 */     this.defaultScopeModel[80].setRotationPoint(-29.5F, -37.5F, 1.0F);
/*      */     
/* 1243 */     this.defaultScopeModel[81].addShapeBox(118.0F, -16.0F, 0.0F, 15, 2, 7, 0.0F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 1.75F, 0.25F, 0.25F, 1.75F, 0.25F, 0.75F, 0.25F, 0.25F, -0.25F, -2.25F, 0.25F, 1.25F, -1.75F, 0.25F, 1.25F, -1.75F, 0.25F, -0.25F, -2.25F);
/* 1244 */     this.defaultScopeModel[81].setRotationPoint(-29.5F, -34.5F, 1.0F);
/*      */     
/* 1246 */     this.defaultScopeModel[82].addShapeBox(118.0F, -16.0F, 0.0F, 15, 2, 7, 0.0F, 0.25F, -0.25F, -2.25F, 0.25F, 1.25F, -1.75F, 0.25F, 1.25F, -1.75F, 0.25F, -0.25F, -2.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 1.75F, 0.25F, 0.25F, 1.75F, 0.25F, 0.75F, 0.25F);
/* 1247 */     this.defaultScopeModel[82].setRotationPoint(-29.5F, -40.5F, 1.0F);
/*      */     
/* 1249 */     this.defaultScopeModel[83].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 10, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F);
/* 1250 */     this.defaultScopeModel[83].setRotationPoint(-14.0F, -34.5F, -0.5F);
/*      */     
/* 1252 */     this.defaultScopeModel[84].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 10, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1253 */     this.defaultScopeModel[84].setRotationPoint(-14.0F, -38.0F, -0.5F);
/*      */     
/* 1255 */     this.defaultScopeModel[85].addShapeBox(118.0F, -16.0F, 0.0F, 11, 3, 10, 0.0F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1256 */     this.defaultScopeModel[85].setRotationPoint(-14.0F, -41.5F, -0.5F);
/*      */     
/* 1258 */     this.defaultScopeModel[86].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1259 */     this.defaultScopeModel[86].setRotationPoint(-119.25F, -38.0F, -0.75F);
/*      */     
/* 1261 */     this.defaultScopeModel[87].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1262 */     this.defaultScopeModel[87].setRotationPoint(-119.25F, -38.0F, 8.75F);
/*      */     
/* 1264 */     this.defaultScopeModel[88].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -3.5F, 0.0F, 0.25F, -3.5F, 0.0F, 0.25F, 3.5F, -0.75F, 0.25F, 3.5F);
/* 1265 */     this.defaultScopeModel[88].setRotationPoint(-119.25F, -34.5F, -0.75F);
/*      */     
/* 1267 */     this.defaultScopeModel[89].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 3.5F, 0.0F, 0.25F, 3.5F, 0.0F, 0.25F, -3.5F, -0.75F, 0.25F, -3.5F);
/* 1268 */     this.defaultScopeModel[89].setRotationPoint(-119.25F, -34.5F, 8.75F);
/*      */     
/* 1270 */     this.defaultScopeModel[90].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 3.5F, 0.0F, 0.25F, 3.5F, 0.0F, 0.25F, -3.5F, -0.75F, 0.25F, -3.5F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1271 */     this.defaultScopeModel[90].setRotationPoint(-119.25F, -41.5F, 8.75F);
/*      */     
/* 1273 */     this.defaultScopeModel[91].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, -3.5F, 0.0F, 0.25F, -3.5F, 0.0F, 0.25F, 3.5F, -0.75F, 0.25F, 3.5F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1274 */     this.defaultScopeModel[91].setRotationPoint(-119.25F, -41.5F, -0.75F);
/*      */     
/* 1276 */     this.defaultScopeModel[92].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 3, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F);
/* 1277 */     this.defaultScopeModel[92].setRotationPoint(-119.25F, -32.5F, 2.75F);
/*      */     
/* 1279 */     this.defaultScopeModel[93].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 3, 0.0F, -0.75F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F);
/* 1280 */     this.defaultScopeModel[93].setRotationPoint(-119.25F, -41.5F, 2.75F);
/*      */     
/* 1282 */     this.defaultScopeModel[94].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1283 */     this.defaultScopeModel[94].setRotationPoint(-3.5F, -38.0F, -0.75F);
/*      */     
/* 1285 */     this.defaultScopeModel[95].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1286 */     this.defaultScopeModel[95].setRotationPoint(-3.5F, -38.0F, 8.75F);
/*      */     
/* 1288 */     this.defaultScopeModel[96].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -3.5F, 0.0F, 0.25F, -3.5F, 0.0F, 0.25F, 3.5F, -0.75F, 0.25F, 3.5F);
/* 1289 */     this.defaultScopeModel[96].setRotationPoint(-3.5F, -34.5F, -0.75F);
/*      */     
/* 1291 */     this.defaultScopeModel[97].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 3.5F, 0.0F, 0.25F, 3.5F, 0.0F, 0.25F, -3.5F, -0.75F, 0.25F, -3.5F);
/* 1292 */     this.defaultScopeModel[97].setRotationPoint(-3.5F, -34.5F, 8.75F);
/*      */     
/* 1294 */     this.defaultScopeModel[98].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, 3.5F, 0.0F, 0.25F, 3.5F, 0.0F, 0.25F, -3.5F, -0.75F, 0.25F, -3.5F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1295 */     this.defaultScopeModel[98].setRotationPoint(-3.5F, -41.5F, 8.75F);
/*      */     
/* 1297 */     this.defaultScopeModel[99].addShapeBox(118.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, -0.75F, 0.25F, -3.5F, 0.0F, 0.25F, -3.5F, 0.0F, 0.25F, 3.5F, -0.75F, 0.25F, 3.5F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1298 */     this.defaultScopeModel[99].setRotationPoint(-3.5F, -41.5F, -0.75F);
/*      */     
/* 1300 */     this.defaultScopeModel[100].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 3, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F);
/* 1301 */     this.defaultScopeModel[100].setRotationPoint(-3.5F, -32.5F, 2.75F);
/*      */     
/* 1303 */     this.defaultScopeModel[101].addShapeBox(118.0F, -16.0F, 0.0F, 1, 1, 3, 0.0F, -0.75F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F);
/* 1304 */     this.defaultScopeModel[101].setRotationPoint(-3.5F, -41.5F, 2.75F);
/*      */     
/*      */ 
/* 1307 */     this.ammoModel = new ModelRendererTurbo[20];
/* 1308 */     this.ammoModel[0] = new ModelRendererTurbo(this, 953, 257, this.textureX, this.textureY);
/* 1309 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/* 1310 */     this.ammoModel[2] = new ModelRendererTurbo(this, 57, 265, this.textureX, this.textureY);
/* 1311 */     this.ammoModel[3] = new ModelRendererTurbo(this, 729, 137, this.textureX, this.textureY);
/* 1312 */     this.ammoModel[4] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 1313 */     this.ammoModel[5] = new ModelRendererTurbo(this, 1009, 153, this.textureX, this.textureY);
/* 1314 */     this.ammoModel[6] = new ModelRendererTurbo(this, 825, 169, this.textureX, this.textureY);
/* 1315 */     this.ammoModel[7] = new ModelRendererTurbo(this, 1009, 169, this.textureX, this.textureY);
/* 1316 */     this.ammoModel[8] = new ModelRendererTurbo(this, 537, 177, this.textureX, this.textureY);
/* 1317 */     this.ammoModel[9] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/* 1318 */     this.ammoModel[10] = new ModelRendererTurbo(this, 553, 89, this.textureX, this.textureY);
/* 1319 */     this.ammoModel[11] = new ModelRendererTurbo(this, 169, 249, this.textureX, this.textureY);
/* 1320 */     this.ammoModel[12] = new ModelRendererTurbo(this, 209, 249, this.textureX, this.textureY);
/* 1321 */     this.ammoModel[13] = new ModelRendererTurbo(this, 649, 249, this.textureX, this.textureY);
/* 1322 */     this.ammoModel[14] = new ModelRendererTurbo(this, 521, 257, this.textureX, this.textureY);
/* 1323 */     this.ammoModel[15] = new ModelRendererTurbo(this, 545, 257, this.textureX, this.textureY);
/* 1324 */     this.ammoModel[16] = new ModelRendererTurbo(this, 585, 257, this.textureX, this.textureY);
/* 1325 */     this.ammoModel[17] = new ModelRendererTurbo(this, 721, 257, this.textureX, this.textureY);
/* 1326 */     this.ammoModel[18] = new ModelRendererTurbo(this, 113, 265, this.textureX, this.textureY);
/* 1327 */     this.ammoModel[19] = new ModelRendererTurbo(this, 145, 265, this.textureX, this.textureY);
/*      */     
/* 1329 */     this.ammoModel[0].addShapeBox(118.0F, -16.0F, 0.0F, 18, 2, 6, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1330 */     this.ammoModel[0].setRotationPoint(-74.75F, -24.5F, 1.0F);
/*      */     
/* 1332 */     this.ammoModel[1].addShapeBox(118.0F, -16.0F, 0.0F, 18, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1333 */     this.ammoModel[1].setRotationPoint(-74.75F, -22.5F, 1.0F);
/*      */     
/* 1335 */     this.ammoModel[2].addShapeBox(118.0F, -16.0F, 0.0F, 18, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F);
/* 1336 */     this.ammoModel[2].setRotationPoint(-74.75F, -20.5F, 1.0F);
/*      */     
/* 1338 */     this.ammoModel[3].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, -0.5F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1339 */     this.ammoModel[3].setRotationPoint(-76.5F, -24.5F, 1.0F);
/*      */     
/* 1341 */     this.ammoModel[4].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1342 */     this.ammoModel[4].setRotationPoint(-76.5F, -22.5F, 1.0F);
/*      */     
/* 1344 */     this.ammoModel[5].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F);
/* 1345 */     this.ammoModel[5].setRotationPoint(-76.5F, -20.5F, 1.0F);
/*      */     
/* 1347 */     this.ammoModel[6].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, -0.25F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, -0.25F, -0.75F, -2.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F);
/* 1348 */     this.ammoModel[6].setRotationPoint(-75.75F, -24.5F, 1.0F);
/*      */     
/* 1350 */     this.ammoModel[7].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F);
/* 1351 */     this.ammoModel[7].setRotationPoint(-75.75F, -22.5F, 1.0F);
/*      */     
/* 1353 */     this.ammoModel[8].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, -0.25F, -0.75F, -2.0F);
/* 1354 */     this.ammoModel[8].setRotationPoint(-75.75F, -20.5F, 1.0F);
/*      */     
/* 1356 */     this.ammoModel[9].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1357 */     this.ammoModel[9].setRotationPoint(-76.5F, -22.5F, 5.0F);
/*      */     
/* 1359 */     this.ammoModel[10].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 2, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/* 1360 */     this.ammoModel[10].setRotationPoint(-76.5F, -22.5F, 3.0F);
/*      */     
/* 1362 */     this.ammoModel[11].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F);
/* 1363 */     this.ammoModel[11].setRotationPoint(-56.75F, -24.5F, 1.0F);
/*      */     
/* 1365 */     this.ammoModel[12].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F);
/* 1366 */     this.ammoModel[12].setRotationPoint(-56.75F, -22.5F, 1.0F);
/*      */     
/* 1368 */     this.ammoModel[13].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.5F, -2.0F);
/* 1369 */     this.ammoModel[13].setRotationPoint(-56.75F, -20.5F, 1.0F);
/*      */     
/* 1371 */     this.ammoModel[14].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1372 */     this.ammoModel[14].setRotationPoint(-54.75F, -24.5F, 1.0F);
/*      */     
/* 1374 */     this.ammoModel[15].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1375 */     this.ammoModel[15].setRotationPoint(-54.75F, -22.5F, 1.0F);
/*      */     
/* 1377 */     this.ammoModel[16].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 1378 */     this.ammoModel[16].setRotationPoint(-54.75F, -20.5F, 1.0F);
/*      */     
/* 1380 */     this.ammoModel[17].addShapeBox(118.0F, -16.0F, 0.0F, 8, 2, 6, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -1.25F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -1.25F);
/* 1381 */     this.ammoModel[17].setRotationPoint(-52.75F, -24.5F, 1.0F);
/*      */     
/* 1383 */     this.ammoModel[18].addShapeBox(118.0F, -16.0F, 0.0F, 8, 2, 6, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.25F);
/* 1384 */     this.ammoModel[18].setRotationPoint(-52.75F, -22.5F, 1.0F);
/*      */     
/* 1386 */     this.ammoModel[19].addShapeBox(118.0F, -16.0F, 0.0F, 8, 2, 6, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, -1.25F, -2.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -1.25F, -2.0F);
/* 1387 */     this.ammoModel[19].setRotationPoint(-52.75F, -20.5F, 1.0F);
/*      */     
/*      */ 
/* 1390 */     this.pumpModel = new ModelRendererTurbo[26];
/* 1391 */     this.pumpModel[0] = new ModelRendererTurbo(this, 1, 217, this.textureX, this.textureY);
/* 1392 */     this.pumpModel[1] = new ModelRendererTurbo(this, 121, 217, this.textureX, this.textureY);
/* 1393 */     this.pumpModel[2] = new ModelRendererTurbo(this, 241, 217, this.textureX, this.textureY);
/* 1394 */     this.pumpModel[3] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/* 1395 */     this.pumpModel[4] = new ModelRendererTurbo(this, 41, 153, this.textureX, this.textureY);
/* 1396 */     this.pumpModel[5] = new ModelRendererTurbo(this, 377, 153, this.textureX, this.textureY);
/* 1397 */     this.pumpModel[6] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/* 1398 */     this.pumpModel[7] = new ModelRendererTurbo(this, 185, 105, this.textureX, this.textureY);
/* 1399 */     this.pumpModel[8] = new ModelRendererTurbo(this, 633, 145, this.textureX, this.textureY);
/* 1400 */     this.pumpModel[9] = new ModelRendererTurbo(this, 865, 153, this.textureX, this.textureY);
/* 1401 */     this.pumpModel[10] = new ModelRendererTurbo(this, 433, 161, this.textureX, this.textureY);
/* 1402 */     this.pumpModel[11] = new ModelRendererTurbo(this, 89, 169, this.textureX, this.textureY);
/* 1403 */     this.pumpModel[12] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/* 1404 */     this.pumpModel[13] = new ModelRendererTurbo(this, 1009, 89, this.textureX, this.textureY);
/* 1405 */     this.pumpModel[14] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/* 1406 */     this.pumpModel[15] = new ModelRendererTurbo(this, 1009, 65, this.textureX, this.textureY);
/* 1407 */     this.pumpModel[16] = new ModelRendererTurbo(this, 537, 89, this.textureX, this.textureY);
/* 1408 */     this.pumpModel[17] = new ModelRendererTurbo(this, 689, 89, this.textureX, this.textureY);
/* 1409 */     this.pumpModel[18] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/* 1410 */     this.pumpModel[19] = new ModelRendererTurbo(this, 649, 33, this.textureX, this.textureY);
/* 1411 */     this.pumpModel[20] = new ModelRendererTurbo(this, 553, 49, this.textureX, this.textureY);
/* 1412 */     this.pumpModel[21] = new ModelRendererTurbo(this, 1001, 33, this.textureX, this.textureY);
/* 1413 */     this.pumpModel[22] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/* 1414 */     this.pumpModel[23] = new ModelRendererTurbo(this, 409, 113, this.textureX, this.textureY);
/* 1415 */     this.pumpModel[24] = new ModelRendererTurbo(this, 481, 177, this.textureX, this.textureY);
/* 1416 */     this.pumpModel[25] = new ModelRendererTurbo(this, 497, 185, this.textureX, this.textureY);
/*      */     
/* 1418 */     this.pumpModel[0].addShapeBox(118.0F, -16.0F, 0.0F, 52, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1419 */     this.pumpModel[0].setRotationPoint(-95.0F, -24.5F, 1.0F);
/*      */     
/* 1421 */     this.pumpModel[1].addShapeBox(118.0F, -16.0F, 0.0F, 52, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1422 */     this.pumpModel[1].setRotationPoint(-95.0F, -22.5F, 1.0F);
/*      */     
/* 1424 */     this.pumpModel[2].addShapeBox(118.0F, -16.0F, 0.0F, 52, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1425 */     this.pumpModel[2].setRotationPoint(-95.0F, -20.5F, 1.0F);
/*      */     
/* 1427 */     this.pumpModel[3].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1428 */     this.pumpModel[3].setRotationPoint(-99.0F, -22.5F, 1.0F);
/*      */     
/* 1430 */     this.pumpModel[4].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F);
/* 1431 */     this.pumpModel[4].setRotationPoint(-99.0F, -20.0F, 1.0F);
/*      */     
/* 1433 */     this.pumpModel[5].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 7, 0.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1434 */     this.pumpModel[5].setRotationPoint(-99.0F, -25.0F, 1.0F);
/*      */     
/* 1436 */     this.pumpModel[6].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, -0.25F, -1.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, -1.5F, 0.25F, -0.25F, -1.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, -1.5F);
/* 1437 */     this.pumpModel[6].setRotationPoint(-106.5F, -22.5F, 1.0F);
/*      */     
/* 1439 */     this.pumpModel[7].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, 0.75F, -1.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, -1.5F, 0.25F, -1.5F, -2.5F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, -1.5F, -2.5F);
/* 1440 */     this.pumpModel[7].setRotationPoint(-106.5F, -20.0F, 1.0F);
/*      */     
/* 1442 */     this.pumpModel[8].addShapeBox(118.0F, -16.0F, 0.0F, 2, 2, 7, 0.0F, 0.25F, -1.5F, -2.5F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, -1.5F, -2.5F, 0.25F, 0.75F, -1.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, -1.5F);
/* 1443 */     this.pumpModel[8].setRotationPoint(-106.5F, -25.0F, 1.0F);
/*      */     
/* 1445 */     this.pumpModel[9].addShapeBox(118.0F, -16.0F, 0.0F, 4, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1446 */     this.pumpModel[9].setRotationPoint(-104.0F, -22.5F, 1.0F);
/*      */     
/* 1448 */     this.pumpModel[10].addShapeBox(118.0F, -16.0F, 0.0F, 4, 2, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F);
/* 1449 */     this.pumpModel[10].setRotationPoint(-104.0F, -20.0F, 1.0F);
/*      */     
/* 1451 */     this.pumpModel[11].addShapeBox(118.0F, -16.0F, 0.0F, 4, 2, 7, 0.0F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1452 */     this.pumpModel[11].setRotationPoint(-104.0F, -25.0F, 1.0F);
/*      */     
/* 1454 */     this.pumpModel[12].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1455 */     this.pumpModel[12].setRotationPoint(-100.0F, -24.5F, 1.0F);
/*      */     
/* 1457 */     this.pumpModel[13].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1458 */     this.pumpModel[13].setRotationPoint(-100.0F, -22.5F, 1.0F);
/*      */     
/* 1460 */     this.pumpModel[14].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1461 */     this.pumpModel[14].setRotationPoint(-100.0F, -20.5F, 1.0F);
/*      */     
/* 1463 */     this.pumpModel[15].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1464 */     this.pumpModel[15].setRotationPoint(-109.75F, -22.25F, 2.5F);
/*      */     
/* 1466 */     this.pumpModel[16].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 4, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1467 */     this.pumpModel[16].setRotationPoint(-109.75F, -21.5F, 2.5F);
/*      */     
/* 1469 */     this.pumpModel[17].addShapeBox(118.0F, -16.0F, 0.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1470 */     this.pumpModel[17].setRotationPoint(-109.75F, -23.5F, 2.5F);
/*      */     
/* 1472 */     this.pumpModel[18].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -1.0F);
/* 1473 */     this.pumpModel[18].setRotationPoint(-110.75F, -22.25F, 2.5F);
/*      */     
/* 1475 */     this.pumpModel[19].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 4, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.1F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.1F, -1.5F);
/* 1476 */     this.pumpModel[19].setRotationPoint(-110.75F, -21.5F, 2.5F);
/*      */     
/* 1478 */     this.pumpModel[20].addShapeBox(118.0F, -16.0F, 0.0F, 1, 2, 4, 0.0F, 0.0F, -1.1F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.1F, -1.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1479 */     this.pumpModel[20].setRotationPoint(-110.75F, -23.5F, 2.5F);
/*      */     
/* 1481 */     this.pumpModel[21].addShapeBox(118.0F, -16.0F, 0.0F, 5, 2, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1482 */     this.pumpModel[21].setRotationPoint(-99.0F, -22.5F, -0.25F);
/*      */     
/* 1484 */     this.pumpModel[22].addShapeBox(118.0F, -16.0F, 0.0F, 4, 1, 3, 0.0F, 0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, -2.0F, 0.25F, 0.25F, -2.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F);
/* 1485 */     this.pumpModel[22].setRotationPoint(-99.0F, -20.0F, -0.25F);
/*      */     
/* 1487 */     this.pumpModel[23].addShapeBox(118.0F, -16.0F, 0.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 4.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F, -4.0F, 1.5F, 0.0F, -4.0F);
/* 1488 */     this.pumpModel[23].setRotationPoint(-99.25F, -18.25F, 0.75F);
/*      */     
/* 1490 */     this.pumpModel[24].addShapeBox(118.0F, -16.0F, 0.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 6.0F, -1.5F, 0.0F, 6.0F, -1.5F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F);
/* 1491 */     this.pumpModel[24].setRotationPoint(-100.75F, -13.25F, -3.25F);
/*      */     
/* 1493 */     this.pumpModel[25].addShapeBox(118.0F, -16.0F, 0.0F, 5, 5, 5, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1494 */     this.pumpModel[25].setRotationPoint(-102.55F, -19.25F, -19.85F);
/* 1495 */     this.pumpModel[25].rotateAngleX = -0.9599311F;
/*      */     
/*      */ 
/*      */ 
/* 1499 */     translateAll(0.0F, -20.0F, 0.0F);
/* 1500 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/* 1502 */     this.gunSlideDistance = 0.0F;
/* 1503 */     this.animationType = EnumAnimationType.RIFLE_TOP;this.gunSlideDistance = 1.0F;
/* 1504 */     this.pumpDelayAfterReload = 1;
/* 1505 */     this.pumpDelay = 8;
/* 1506 */     this.pumpTime = 30;
/* 1507 */     this.animationType = EnumAnimationType.RIFLE_TOP;
/*      */     
/* 1509 */     this.numBulletsInReloadAnimation = 3.0F;
/* 1510 */     this.tiltGunTime = 0.25F;
/* 1511 */     this.unloadClipTime = 0.0F;
/* 1512 */     this.loadClipTime = 0.5F;
/* 1513 */     this.untiltGunTime = 0.5F;this.pumpHandleDistance = 3.0F;
/*      */     
/* 1515 */     this.pumpHandleDistance = 0.1F;
/*      */     
/*      */ 
/* 1518 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelr700pm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */