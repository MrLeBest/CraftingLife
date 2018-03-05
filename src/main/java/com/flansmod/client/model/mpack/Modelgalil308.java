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
/*      */ public class Modelgalil308
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelgalil308()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ŕ'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 241, 81, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 17, 89, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 89, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 89, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 457, 89, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 65, 97, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 169, 97, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 209, 105, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 313, 105, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 249, 97, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 241, 113, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 361, 113, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 401, 113, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 41, 121, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 17, 97, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 497, 97, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 289, 105, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 481, 113, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 497, 113, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 137, 121, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 209, 121, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 329, 121, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 409, 121, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 41, 129, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 489, 121, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 129, 129, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 161, 129, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 177, 129, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 457, 129, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 489, 129, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 25, 137, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 49, 137, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 73, 137, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 129, 137, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 161, 137, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 97, 137, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 41, 97, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 17, 105, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 145, 97, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 505, 121, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 249, 137, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 393, 129, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 393, 137, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 409, 137, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 441, 137, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 33, 145, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 129, 145, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 505, 137, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 17, 145, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 249, 145, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 425, 145, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 49, 153, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 121, 153, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 177, 161, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 249, 161, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 17, 153, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 481, 153, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 33, 161, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 393, 161, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 417, 161, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 441, 161, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 465, 161, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 49, 169, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 73, 169, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 97, 169, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 121, 169, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 145, 169, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 481, 169, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 17, 177, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 161, 177, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 25, 145, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 33, 145, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 185, 177, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 209, 177, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 233, 177, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 257, 177, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 281, 177, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 305, 177, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 345, 177, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 377, 177, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 385, 137, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 241, 145, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 249, 145, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 305, 145, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 313, 145, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 425, 145, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 433, 113, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 401, 177, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 425, 177, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 449, 177, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 33, 185, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 57, 185, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 81, 185, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 105, 185, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 401, 145, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 481, 145, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 489, 145, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 497, 145, this.textureX, this.textureY);
/*  350 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 113, 153, this.textureX, this.textureY);
/*  351 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 417, 153, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 497, 153, this.textureX, this.textureY);
/*  353 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 241, 161, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 17, 169, this.textureX, this.textureY);
/*  355 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 305, 161, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 329, 57, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 433, 161, this.textureX, this.textureY);
/*  359 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 129, 193, this.textureX, this.textureY);
/*  360 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 185, 193, this.textureX, this.textureY);
/*  361 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 225, 193, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/*      */     
/*  364 */     this.gunModel[0].addShapeBox(-7.0F, 6.0F, -2.5F, 9, 13, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  365 */     this.gunModel[0].setRotationPoint(-1.0F, -14.0F, -0.5F);
/*      */     
/*  367 */     this.gunModel[1].addShapeBox(-7.0F, 6.0F, -2.5F, 12, 3, 6, 0.0F, 0.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, -1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.75F, -1.5F, 0.0F);
/*  368 */     this.gunModel[1].setRotationPoint(-6.0F, 0.0F, -0.5F);
/*      */     
/*  370 */     this.gunModel[2].addShapeBox(-7.0F, 6.0F, -2.5F, 9, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  371 */     this.gunModel[2].setRotationPoint(-6.0F, -1.0F, -0.5F);
/*      */     
/*  373 */     this.gunModel[3].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 13, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  374 */     this.gunModel[3].setRotationPoint(7.0F, -14.0F, -1.5F);
/*      */     
/*  376 */     this.gunModel[4].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  377 */     this.gunModel[4].setRotationPoint(2.0F, -1.0F, -1.5F);
/*      */     
/*  379 */     this.gunModel[5].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.3F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.25F, -0.3F, 0.0F);
/*  380 */     this.gunModel[5].setRotationPoint(2.0F, 0.0F, -1.5F);
/*      */     
/*  382 */     this.gunModel[6].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 13, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  383 */     this.gunModel[6].setRotationPoint(-1.0F, -14.0F, -1.5F);
/*      */     
/*  385 */     this.gunModel[7].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 13, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  386 */     this.gunModel[7].setRotationPoint(0.0F, -14.0F, -1.5F);
/*      */     
/*  388 */     this.gunModel[8].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  389 */     this.gunModel[8].setRotationPoint(-5.0F, -1.0F, -1.5F);
/*      */     
/*  391 */     this.gunModel[9].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  392 */     this.gunModel[9].setRotationPoint(-6.0F, -1.0F, -1.5F);
/*      */     
/*  394 */     this.gunModel[10].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, -0.5F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  395 */     this.gunModel[10].setRotationPoint(-6.0F, 0.0F, -1.5F);
/*      */     
/*  397 */     this.gunModel[11].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 13, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, -1.0F);
/*  398 */     this.gunModel[11].setRotationPoint(-1.0F, -14.0F, 5.5F);
/*      */     
/*  400 */     this.gunModel[12].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F);
/*  401 */     this.gunModel[12].setRotationPoint(-6.0F, -1.0F, 5.5F);
/*      */     
/*  403 */     this.gunModel[13].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.5F, -1.0F);
/*  404 */     this.gunModel[13].setRotationPoint(-6.0F, 0.0F, 5.5F);
/*      */     
/*  406 */     this.gunModel[14].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  407 */     this.gunModel[14].setRotationPoint(-5.0F, 0.0F, -1.5F);
/*      */     
/*  409 */     this.gunModel[15].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  410 */     this.gunModel[15].setRotationPoint(-5.0F, 0.0F, 5.5F);
/*      */     
/*  412 */     this.gunModel[16].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.3F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.25F, -0.3F, 0.0F);
/*  413 */     this.gunModel[16].setRotationPoint(2.0F, 0.0F, 5.5F);
/*      */     
/*  415 */     this.gunModel[17].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F);
/*  416 */     this.gunModel[17].setRotationPoint(2.0F, -1.0F, 5.5F);
/*      */     
/*  418 */     this.gunModel[18].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 13, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 0.0F);
/*  419 */     this.gunModel[18].setRotationPoint(7.0F, -14.0F, 5.5F);
/*      */     
/*  421 */     this.gunModel[19].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 13, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  422 */     this.gunModel[19].setRotationPoint(0.0F, -14.0F, 5.5F);
/*      */     
/*  424 */     this.gunModel[20].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  425 */     this.gunModel[20].setRotationPoint(-5.0F, -1.0F, 5.5F);
/*      */     
/*  427 */     this.gunModel[21].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 4, 6, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  428 */     this.gunModel[21].setRotationPoint(-1.0F, -20.0F, -0.5F);
/*      */     
/*  430 */     this.gunModel[22].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  431 */     this.gunModel[22].setRotationPoint(-1.0F, -16.0F, -0.5F);
/*      */     
/*  433 */     this.gunModel[23].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  434 */     this.gunModel[23].setRotationPoint(-1.0F, -16.0F, -1.5F);
/*      */     
/*  436 */     this.gunModel[24].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 4, 1, 0.0F, 2.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  437 */     this.gunModel[24].setRotationPoint(-1.0F, -20.0F, -1.5F);
/*      */     
/*  439 */     this.gunModel[25].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  440 */     this.gunModel[25].setRotationPoint(-1.0F, -16.0F, 5.5F);
/*      */     
/*  442 */     this.gunModel[26].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 4, 1, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/*  443 */     this.gunModel[26].setRotationPoint(-1.0F, -20.0F, 5.5F);
/*      */     
/*  445 */     this.gunModel[27].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  446 */     this.gunModel[27].setRotationPoint(8.0F, -17.0F, -1.5F);
/*      */     
/*  448 */     this.gunModel[28].addShapeBox(-7.0F, 6.0F, -2.5F, 8, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  449 */     this.gunModel[28].setRotationPoint(0.0F, -20.0F, -1.5F);
/*      */     
/*  451 */     this.gunModel[29].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[29].setRotationPoint(8.0F, -20.0F, -1.5F);
/*      */     
/*  454 */     this.gunModel[30].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 11, 9, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F);
/*  455 */     this.gunModel[30].setRotationPoint(-9.0F, -30.0F, -2.0F);
/*      */     
/*  457 */     this.gunModel[31].addShapeBox(-7.0F, 6.0F, -2.5F, 30, 11, 9, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  458 */     this.gunModel[31].setRotationPoint(-2.0F, -30.0F, -2.0F);
/*      */     
/*  460 */     this.gunModel[32].addBox(-7.0F, 6.0F, -2.5F, 2, 1, 6, 0.0F);
/*  461 */     this.gunModel[32].setRotationPoint(-3.5F, -21.0F, 0.0F);
/*      */     
/*  463 */     this.gunModel[33].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 4, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  464 */     this.gunModel[33].setRotationPoint(10.0F, -16.0F, 0.5F);
/*      */     
/*  466 */     this.gunModel[34].addShapeBox(-7.0F, 6.0F, -2.5F, 24, 10, 9, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -4.5F, 0.25F, 0.0F, -4.5F, 0.25F, 0.0F, -0.25F, 0.25F);
/*  467 */     this.gunModel[34].setRotationPoint(28.0F, -30.0F, -2.0F);
/*      */     
/*  469 */     this.gunModel[35].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  470 */     this.gunModel[35].setRotationPoint(11.0F, -13.0F, 0.5F);
/*      */     
/*  472 */     this.gunModel[36].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  473 */     this.gunModel[36].setRotationPoint(11.0F, -12.0F, 0.5F);
/*      */     
/*  475 */     this.gunModel[37].addShapeBox(-7.0F, 6.0F, -2.5F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  476 */     this.gunModel[37].setRotationPoint(14.0F, -12.0F, 0.5F);
/*      */     
/*  478 */     this.gunModel[38].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 6, 5, 0.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F);
/*  479 */     this.gunModel[38].setRotationPoint(22.5F, -20.0F, 0.0F);
/*      */     
/*  481 */     this.gunModel[39].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F);
/*  482 */     this.gunModel[39].setRotationPoint(21.0F, -14.5F, 0.0F);
/*      */     
/*  484 */     this.gunModel[40].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 5, 0.0F, -1.25F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, -0.5F, 0.25F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -1.25F, -0.5F, 0.25F);
/*  485 */     this.gunModel[40].setRotationPoint(21.5F, -14.5F, 0.0F);
/*      */     
/*  487 */     this.gunModel[41].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 4, 5, 0.0F, 0.25F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F);
/*  488 */     this.gunModel[41].setRotationPoint(21.0F, -13.0F, 0.0F);
/*      */     
/*  490 */     this.gunModel[42].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 5, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F);
/*  491 */     this.gunModel[42].setRotationPoint(25.5F, -15.0F, 0.0F);
/*      */     
/*  493 */     this.gunModel[43].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 5, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -0.25F, -0.75F, 0.25F);
/*  494 */     this.gunModel[43].setRotationPoint(20.75F, -9.5F, 0.0F);
/*      */     
/*  496 */     this.gunModel[44].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 5, 0.0F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -1.0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, -0.25F, -1.0F, 0.25F);
/*  497 */     this.gunModel[44].setRotationPoint(19.75F, -9.5F, 0.0F);
/*      */     
/*  499 */     this.gunModel[45].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  500 */     this.gunModel[45].setRotationPoint(23.0F, -14.5F, 1.0F);
/*      */     
/*  502 */     this.gunModel[46].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  503 */     this.gunModel[46].setRotationPoint(24.25F, -12.5F, 1.0F);
/*      */     
/*  505 */     this.gunModel[47].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  506 */     this.gunModel[47].setRotationPoint(22.5F, -20.5F, 0.0F);
/*      */     
/*  508 */     this.gunModel[48].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  509 */     this.gunModel[48].setRotationPoint(25.0F, -13.5F, 1.0F);
/*      */     
/*  511 */     this.gunModel[49].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  512 */     this.gunModel[49].setRotationPoint(26.0F, -14.5F, 1.0F);
/*      */     
/*  514 */     this.gunModel[50].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  515 */     this.gunModel[50].setRotationPoint(25.0F, -14.5F, 1.0F);
/*      */     
/*  517 */     this.gunModel[51].addShapeBox(-7.0F, 6.0F, -2.5F, 61, 2, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  518 */     this.gunModel[51].setRotationPoint(-9.0F, -31.5F, -2.25F);
/*      */     
/*  520 */     this.gunModel[52].addShapeBox(-7.0F, 6.0F, -2.5F, 27, 2, 2, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  521 */     this.gunModel[52].setRotationPoint(-5.0F, -33.5F, -2.25F);
/*      */     
/*  523 */     this.gunModel[53].addShapeBox(-7.0F, 6.0F, -2.5F, 61, 2, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  524 */     this.gunModel[53].setRotationPoint(-9.0F, -31.5F, 5.75F);
/*      */     
/*  526 */     this.gunModel[54].addShapeBox(-7.0F, 6.0F, -2.5F, 54, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  527 */     this.gunModel[54].setRotationPoint(-5.0F, -33.5F, 5.75F);
/*      */     
/*  529 */     this.gunModel[55].addShapeBox(-7.0F, 6.0F, -2.5F, 54, 2, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  530 */     this.gunModel[55].setRotationPoint(-5.0F, -35.5F, 3.0F);
/*      */     
/*  532 */     this.gunModel[56].addShapeBox(-7.0F, 6.0F, -2.5F, 52, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  533 */     this.gunModel[56].setRotationPoint(-3.0F, -37.5F, 2.5F);
/*      */     
/*  535 */     this.gunModel[57].addShapeBox(-7.0F, 6.0F, -2.5F, 51, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  536 */     this.gunModel[57].setRotationPoint(-2.0F, -38.5F, 2.75F);
/*      */     
/*  538 */     this.gunModel[58].addShapeBox(-7.0F, 6.0F, -2.5F, 27, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  539 */     this.gunModel[58].setRotationPoint(-5.0F, -35.5F, -0.5F);
/*      */     
/*  541 */     this.gunModel[59].addShapeBox(-7.0F, 6.0F, -2.5F, 49, 2, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  542 */     this.gunModel[59].setRotationPoint(-3.0F, -37.5F, 0.0F);
/*      */     
/*  544 */     this.gunModel[60].addShapeBox(-7.0F, 6.0F, -2.5F, 51, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  545 */     this.gunModel[60].setRotationPoint(-2.0F, -38.5F, 0.75F);
/*      */     
/*  547 */     this.gunModel[61].addShapeBox(-7.0F, 6.0F, -2.5F, 41, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[61].setRotationPoint(8.0F, -39.5F, 2.5F);
/*      */     
/*  550 */     this.gunModel[62].addShapeBox(-7.0F, 6.0F, -2.5F, 41, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[62].setRotationPoint(8.0F, -39.5F, 1.5F);
/*      */     
/*  553 */     this.gunModel[63].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 14, 3, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 1.5F, 0.1F, 0.0F, 1.5F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F);
/*  554 */     this.gunModel[63].setRotationPoint(52.0F, -35.0F, -2.5F);
/*      */     
/*  556 */     this.gunModel[64].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 5, 9, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  557 */     this.gunModel[64].setRotationPoint(49.0F, -36.5F, -2.0F);
/*      */     
/*  559 */     this.gunModel[65].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 2, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[65].setRotationPoint(49.0F, -39.0F, -2.0F);
/*      */     
/*  562 */     this.gunModel[66].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  563 */     this.gunModel[66].setRotationPoint(49.0F, -39.0F, 5.0F);
/*      */     
/*  565 */     this.gunModel[67].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  566 */     this.gunModel[67].setRotationPoint(49.0F, -38.5F, 0.0F);
/*      */     
/*  568 */     this.gunModel[68].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 1, 2, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[68].setRotationPoint(49.0F, -40.0F, 3.0F);
/*      */     
/*  571 */     this.gunModel[69].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  572 */     this.gunModel[69].setRotationPoint(49.0F, -40.0F, 0.0F);
/*      */     
/*  574 */     this.gunModel[70].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 2, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  575 */     this.gunModel[70].setRotationPoint(52.0F, -37.5F, 1.5F);
/*      */     
/*  577 */     this.gunModel[71].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[71].setRotationPoint(52.0F, -38.75F, 0.25F);
/*      */     
/*  580 */     this.gunModel[72].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[72].setRotationPoint(52.0F, -35.25F, 0.25F);
/*      */     
/*  583 */     this.gunModel[73].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  584 */     this.gunModel[73].setRotationPoint(52.0F, -38.75F, 3.75F);
/*      */     
/*  586 */     this.gunModel[74].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 2, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  587 */     this.gunModel[74].setRotationPoint(52.0F, -37.5F, 3.75F);
/*      */     
/*  589 */     this.gunModel[75].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  590 */     this.gunModel[75].setRotationPoint(52.0F, -35.25F, 1.5F);
/*      */     
/*  592 */     this.gunModel[76].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  593 */     this.gunModel[76].setRotationPoint(52.0F, -35.25F, 3.75F);
/*      */     
/*  595 */     this.gunModel[77].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 2, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  596 */     this.gunModel[77].setRotationPoint(52.0F, -37.5F, 0.25F);
/*      */     
/*  598 */     this.gunModel[78].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  599 */     this.gunModel[78].setRotationPoint(52.0F, -38.75F, 1.5F);
/*      */     
/*  601 */     this.gunModel[79].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  602 */     this.gunModel[79].setRotationPoint(52.0F, -34.25F, 2.75F);
/*      */     
/*  604 */     this.gunModel[80].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  605 */     this.gunModel[80].setRotationPoint(52.0F, -34.25F, 1.25F);
/*      */     
/*  607 */     this.gunModel[81].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[81].setRotationPoint(52.0F, -36.25F, -0.75F);
/*      */     
/*  610 */     this.gunModel[82].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[82].setRotationPoint(52.0F, -37.5F, -0.75F);
/*      */     
/*  613 */     this.gunModel[83].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 15, 3, 0.0F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F);
/*  614 */     this.gunModel[83].setRotationPoint(54.0F, -36.0F, -2.5F);
/*      */     
/*  616 */     this.gunModel[84].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 5, 2, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -1.1F, 0.75F, 0.0F, -1.1F, 0.75F, 0.0F, 0.5F, 0.75F);
/*  617 */     this.gunModel[84].setRotationPoint(55.0F, -26.0F, -2.5F);
/*      */     
/*  619 */     this.gunModel[85].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 13, 8, 0.0F, 0.5F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F, -3.5F, 0.75F, 0.0F, -3.5F, 0.75F, 0.0F, -3.5F, 0.75F, 0.5F, -3.5F, 0.75F);
/*  620 */     this.gunModel[85].setRotationPoint(85.5F, -36.0F, -1.5F);
/*      */     
/*  622 */     this.gunModel[86].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  623 */     this.gunModel[86].setRotationPoint(52.0F, -36.25F, 4.25F);
/*      */     
/*  625 */     this.gunModel[87].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[87].setRotationPoint(52.0F, -37.5F, 4.25F);
/*      */     
/*  628 */     this.gunModel[88].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  629 */     this.gunModel[88].setRotationPoint(52.0F, -39.25F, 2.75F);
/*      */     
/*  631 */     this.gunModel[89].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  632 */     this.gunModel[89].setRotationPoint(52.0F, -39.25F, 1.5F);
/*      */     
/*  634 */     this.gunModel[90].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[90].setRotationPoint(99.0F, -37.5F, 0.5F);
/*      */     
/*  637 */     this.gunModel[91].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[91].setRotationPoint(99.0F, -38.5F, 0.5F);
/*      */     
/*  640 */     this.gunModel[92].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[92].setRotationPoint(99.0F, -38.5F, 3.5F);
/*      */     
/*  643 */     this.gunModel[93].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  644 */     this.gunModel[93].setRotationPoint(99.0F, -38.5F, 1.5F);
/*      */     
/*  646 */     this.gunModel[94].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[94].setRotationPoint(99.0F, -35.5F, 1.5F);
/*      */     
/*  649 */     this.gunModel[95].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  650 */     this.gunModel[95].setRotationPoint(99.0F, -35.5F, 0.5F);
/*      */     
/*  652 */     this.gunModel[96].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  653 */     this.gunModel[96].setRotationPoint(99.0F, -35.5F, 3.5F);
/*      */     
/*  655 */     this.gunModel[97].addBox(-7.0F, 6.0F, -2.5F, 1, 4, 8, 0.0F);
/*  656 */     this.gunModel[97].setRotationPoint(86.5F, -33.0F, -1.5F);
/*      */     
/*  658 */     this.gunModel[98].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  659 */     this.gunModel[98].setRotationPoint(86.5F, -29.0F, -1.5F);
/*      */     
/*  661 */     this.gunModel[99].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  662 */     this.gunModel[99].setRotationPoint(86.5F, -26.0F, -0.5F);
/*      */     
/*  664 */     this.gunModel[100].addShapeBox(-7.0F, 6.0F, -2.5F, 47, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  665 */     this.gunModel[100].setRotationPoint(87.5F, -31.0F, 0.5F);
/*      */     
/*  667 */     this.gunModel[101].addShapeBox(-7.0F, 6.0F, -2.5F, 12, 4, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  668 */     this.gunModel[101].setRotationPoint(134.5F, -31.0F, 0.5F);
/*      */     
/*  670 */     this.gunModel[102].addShapeBox(-7.0F, 6.0F, -2.5F, 10, 4, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  671 */     this.gunModel[102].setRotationPoint(100.5F, -31.0F, 0.5F);
/*      */     
/*  673 */     this.gunModel[103].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 5, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  674 */     this.gunModel[103].setRotationPoint(87.5F, -32.0F, 0.5F);
/*      */     
/*  676 */     this.gunModel[104].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 2, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/*  677 */     this.gunModel[104].setRotationPoint(106.5F, -33.0F, 0.5F);
/*      */     
/*  679 */     this.gunModel[105].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 2, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 2.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 2.0F, -0.25F, 0.25F);
/*  680 */     this.gunModel[105].setRotationPoint(102.5F, -33.0F, 0.5F);
/*      */     
/*  682 */     this.gunModel[106].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 3, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/*  683 */     this.gunModel[106].setRotationPoint(102.5F, -36.0F, 0.5F);
/*      */     
/*  685 */     this.gunModel[107].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 3, 3, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F);
/*  686 */     this.gunModel[107].setRotationPoint(101.5F, -39.0F, 1.0F);
/*      */     
/*  688 */     this.gunModel[108].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 3, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  689 */     this.gunModel[108].setRotationPoint(101.5F, -42.0F, 1.5F);
/*      */     
/*  691 */     this.gunModel[109].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -1.0F, 0.5F);
/*  692 */     this.gunModel[109].setRotationPoint(100.5F, -42.0F, 1.5F);
/*      */     
/*  694 */     this.gunModel[110].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  695 */     this.gunModel[110].setRotationPoint(100.5F, -42.25F, 0.5F);
/*      */     
/*  697 */     this.gunModel[111].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  698 */     this.gunModel[111].setRotationPoint(100.5F, -43.25F, -0.5F);
/*      */     
/*  700 */     this.gunModel[112].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  701 */     this.gunModel[112].setRotationPoint(100.5F, -43.25F, 1.0F);
/*      */     
/*  703 */     this.gunModel[113].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/*  704 */     this.gunModel[113].setRotationPoint(100.5F, -44.75F, 1.0F);
/*      */     
/*  706 */     this.gunModel[114].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  707 */     this.gunModel[114].setRotationPoint(100.5F, -45.75F, 0.5F);
/*      */     
/*  709 */     this.gunModel[115].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  710 */     this.gunModel[115].setRotationPoint(100.5F, -44.75F, -0.5F);
/*      */     
/*  712 */     this.gunModel[116].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  713 */     this.gunModel[116].setRotationPoint(100.5F, -46.75F, 1.5F);
/*      */     
/*  715 */     this.gunModel[117].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  716 */     this.gunModel[117].setRotationPoint(100.5F, -45.75F, 1.5F);
/*      */     
/*  718 */     this.gunModel[118].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  719 */     this.gunModel[118].setRotationPoint(100.5F, -45.75F, 2.75F);
/*      */     
/*  721 */     this.gunModel[119].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  722 */     this.gunModel[119].setRotationPoint(100.5F, -46.75F, 2.75F);
/*      */     
/*  724 */     this.gunModel[120].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  725 */     this.gunModel[120].setRotationPoint(100.5F, -45.75F, 4.0F);
/*      */     
/*  727 */     this.gunModel[121].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/*  728 */     this.gunModel[121].setRotationPoint(100.5F, -44.75F, 4.5F);
/*      */     
/*  730 */     this.gunModel[122].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/*  731 */     this.gunModel[122].setRotationPoint(100.5F, -43.5F, 4.5F);
/*      */     
/*  733 */     this.gunModel[123].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  734 */     this.gunModel[123].setRotationPoint(100.5F, -42.25F, 4.0F);
/*      */     
/*  736 */     this.gunModel[124].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  737 */     this.gunModel[124].setRotationPoint(100.5F, -43.25F, 4.5F);
/*      */     
/*  739 */     this.gunModel[125].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[125].setRotationPoint(100.5F, -44.5F, 4.5F);
/*      */     
/*  742 */     this.gunModel[126].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 2, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  743 */     this.gunModel[126].setRotationPoint(101.5F, -44.0F, 2.0F);
/*      */     
/*  745 */     this.gunModel[127].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 3, 0.0F, 0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, 0.5F, 0.85F, 0.75F, 0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, 0.5F, 1.65F, 0.75F);
/*  746 */     this.gunModel[127].setRotationPoint(56.5F, -31.15F, -2.5F);
/*      */     
/*  748 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 3, 0.0F, 0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, 0.5F, 0.85F, 0.75F, 0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, 0.5F, 1.65F, 0.75F);
/*  749 */     this.gunModel[''].setRotationPoint(55.5F, -31.15F, -2.5F);
/*      */     
/*  751 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 28, 1, 2, 0.0F, 0.5F, 0.35F, 0.75F, -0.5F, 0.35F, 0.75F, -0.5F, 0.35F, 0.75F, 0.5F, 0.35F, 0.75F, 0.5F, 1.15F, 0.75F, -0.5F, 1.15F, 0.75F, -0.5F, 1.15F, 0.75F, 0.5F, 1.15F, 0.75F);
/*  752 */     this.gunModel[''].setRotationPoint(57.5F, -36.15F, -1.5F);
/*      */     
/*  754 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  755 */     this.gunModel[''].setRotationPoint(-3.0F, -38.5F, 2.75F);
/*      */     
/*  757 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  758 */     this.gunModel[''].setRotationPoint(-3.0F, -38.5F, 0.75F);
/*      */     
/*  760 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 3, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  761 */     this.gunModel[''].setRotationPoint(-7.0F, -35.5F, -0.5F);
/*      */     
/*  763 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[''].setRotationPoint(-7.0F, -33.5F, -2.25F);
/*      */     
/*  766 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  767 */     this.gunModel[''].setRotationPoint(-7.0F, -32.5F, -0.25F);
/*      */     
/*  769 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel[''].setRotationPoint(-7.0F, -33.5F, 5.75F);
/*      */     
/*  772 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 3, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel[''].setRotationPoint(-7.0F, -35.5F, 3.0F);
/*      */     
/*  775 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  776 */     this.gunModel[''].setRotationPoint(-5.0F, -37.5F, 2.5F);
/*      */     
/*  778 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 2, 0.0F, -2.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  779 */     this.gunModel[''].setRotationPoint(-5.0F, -37.5F, 0.0F);
/*      */     
/*  781 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  782 */     this.gunModel[''].setRotationPoint(-9.0F, -33.5F, 5.75F);
/*      */     
/*  784 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 6, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  785 */     this.gunModel[''].setRotationPoint(-9.0F, -33.5F, -0.25F);
/*      */     
/*  787 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 2, 0.0F, -2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  788 */     this.gunModel[''].setRotationPoint(-9.0F, -33.5F, -2.25F);
/*      */     
/*  790 */     this.gunModel[''].addBox(-7.0F, 6.0F, -2.5F, 5, 6, 1, 0.0F);
/*  791 */     this.gunModel[''].setRotationPoint(-2.0F, -41.0F, 0.5F);
/*      */     
/*  793 */     this.gunModel[''].addBox(-7.0F, 6.0F, -2.5F, 5, 6, 1, 0.0F);
/*  794 */     this.gunModel[''].setRotationPoint(-2.0F, -41.0F, 3.5F);
/*      */     
/*  796 */     this.gunModel[''].addBox(-7.0F, 6.0F, -2.5F, 5, 1, 2, 0.0F);
/*  797 */     this.gunModel[''].setRotationPoint(-2.0F, -39.65F, 1.5F);
/*      */     
/*  799 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 2, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.15F, 0.0F, 0.75F, 0.15F, 0.0F, 0.75F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  800 */     this.gunModel[''].setRotationPoint(3.0F, -39.65F, 1.5F);
/*      */     
/*  802 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 1, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  803 */     this.gunModel[''].setRotationPoint(-2.0F, -43.0F, 3.5F);
/*      */     
/*  805 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel[''].setRotationPoint(1.0F, -43.0F, 3.5F);
/*      */     
/*  808 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel[''].setRotationPoint(0.0F, -43.0F, 3.5F);
/*      */     
/*  811 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  812 */     this.gunModel[''].setRotationPoint(1.0F, -43.0F, 0.5F);
/*      */     
/*  814 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  815 */     this.gunModel[''].setRotationPoint(0.0F, -43.0F, 0.5F);
/*      */     
/*  817 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 1, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel[''].setRotationPoint(-2.0F, -43.0F, 0.5F);
/*      */     
/*  820 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -0.7F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  821 */     this.gunModel[''].setRotationPoint(0.5F, -44.5F, 0.5F);
/*      */     
/*  823 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  824 */     this.gunModel[''].setRotationPoint(-0.25F, -44.5F, 0.5F);
/*      */     
/*  826 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -0.7F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  827 */     this.gunModel[''].setRotationPoint(0.5F, -44.5F, 3.5F);
/*      */     
/*  829 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  830 */     this.gunModel[''].setRotationPoint(-0.25F, -44.5F, 3.5F);
/*      */     
/*  832 */     this.gunModel[''].addBox(-7.0F, 6.0F, -2.5F, 1, 1, 2, 0.0F);
/*  833 */     this.gunModel[''].setRotationPoint(0.25F, -41.0F, 1.5F);
/*      */     
/*  835 */     this.gunModel[''].addBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F);
/*  836 */     this.gunModel[''].setRotationPoint(0.25F, -42.0F, 2.0F);
/*      */     
/*  838 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  839 */     this.gunModel[''].setRotationPoint(7.0F, -41.0F, 1.5F);
/*      */     
/*  841 */     this.gunModel[''].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  842 */     this.gunModel[''].setRotationPoint(6.0F, -41.0F, 1.5F);
/*      */     
/*  844 */     this.gunModel[' '].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  845 */     this.gunModel[' '].setRotationPoint(7.0F, -41.0F, 3.25F);
/*      */     
/*  847 */     this.gunModel['¡'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  848 */     this.gunModel['¡'].setRotationPoint(6.0F, -41.0F, 3.25F);
/*      */     
/*  850 */     this.gunModel['¢'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  851 */     this.gunModel['¢'].setRotationPoint(6.5F, -42.0F, 2.0F);
/*      */     
/*  853 */     this.gunModel['£'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  854 */     this.gunModel['£'].setRotationPoint(6.5F, -43.5F, 1.0F);
/*      */     
/*  856 */     this.gunModel['¤'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  857 */     this.gunModel['¤'].setRotationPoint(6.5F, -42.0F, 1.0F);
/*      */     
/*  859 */     this.gunModel['¥'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  860 */     this.gunModel['¥'].setRotationPoint(6.5F, -43.5F, 3.0F);
/*      */     
/*  862 */     this.gunModel['¦'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.35F, 0.5F, -0.5F, -0.35F);
/*  863 */     this.gunModel['¦'].setRotationPoint(6.5F, -42.0F, 3.0F);
/*      */     
/*  865 */     this.gunModel['§'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.5F, -0.25F, -0.35F, 0.0F, -0.25F, -0.35F, 0.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/*  866 */     this.gunModel['§'].setRotationPoint(6.5F, -44.5F, 3.0F);
/*      */     
/*  868 */     this.gunModel['¨'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F);
/*  869 */     this.gunModel['¨'].setRotationPoint(6.5F, -44.5F, 3.75F);
/*      */     
/*  871 */     this.gunModel['©'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.6F, 0.5F, -0.25F, -0.6F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/*  872 */     this.gunModel['©'].setRotationPoint(6.5F, -44.5F, 1.25F);
/*      */     
/*  874 */     this.gunModel['ª'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F);
/*  875 */     this.gunModel['ª'].setRotationPoint(6.5F, -44.5F, 1.0F);
/*      */     
/*  877 */     this.gunModel['«'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  878 */     this.gunModel['«'].setRotationPoint(6.5F, -40.85F, 1.0F);
/*      */     
/*  880 */     this.gunModel['¬'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  881 */     this.gunModel['¬'].setRotationPoint(6.5F, -40.85F, 2.25F);
/*      */     
/*  883 */     this.gunModel['­'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 5, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  884 */     this.gunModel['­'].setRotationPoint(-12.0F, -27.0F, -1.9F);
/*      */     
/*  886 */     this.gunModel['®'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 4, 3, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  887 */     this.gunModel['®'].setRotationPoint(-12.0F, -31.0F, -1.9F);
/*      */     
/*  889 */     this.gunModel['¯'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 5, 3, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  890 */     this.gunModel['¯'].setRotationPoint(-17.0F, -27.0F, -1.9F);
/*      */     
/*  892 */     this.gunModel['°'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 9, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/*  893 */     this.gunModel['°'].setRotationPoint(-12.0F, -31.0F, 1.35F);
/*      */     
/*  895 */     this.gunModel['±'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  896 */     this.gunModel['±'].setRotationPoint(-16.0F, -29.0F, 1.35F);
/*      */     
/*  898 */     this.gunModel['²'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 3, 4, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  899 */     this.gunModel['²'].setRotationPoint(-16.0F, -26.0F, 1.35F);
/*      */     
/*  901 */     this.gunModel['³'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  902 */     this.gunModel['³'].setRotationPoint(-53.0F, -30.0F, 1.35F);
/*      */     
/*  904 */     this.gunModel['´'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel['´'].setRotationPoint(-16.0F, -23.0F, 1.35F);
/*      */     
/*  907 */     this.gunModel['µ'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel['µ'].setRotationPoint(-53.0F, -31.0F, 1.35F);
/*      */     
/*  910 */     this.gunModel['¶'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  911 */     this.gunModel['¶'].setRotationPoint(-53.0F, -32.0F, 2.35F);
/*      */     
/*  913 */     this.gunModel['·'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  914 */     this.gunModel['·'].setRotationPoint(-53.0F, -32.0F, 3.35F);
/*      */     
/*  916 */     this.gunModel['¸'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  917 */     this.gunModel['¸'].setRotationPoint(-53.0F, -31.0F, 4.35F);
/*      */     
/*  919 */     this.gunModel['¹'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  920 */     this.gunModel['¹'].setRotationPoint(-53.0F, -31.0F, 2.35F);
/*      */     
/*  922 */     this.gunModel['º'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  923 */     this.gunModel['º'].setRotationPoint(-13.0F, -27.0F, 1.35F);
/*      */     
/*  925 */     this.gunModel['»'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  926 */     this.gunModel['»'].setRotationPoint(-53.0F, -28.0F, 4.35F);
/*      */     
/*  928 */     this.gunModel['¼'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  929 */     this.gunModel['¼'].setRotationPoint(-53.0F, -28.0F, 1.35F);
/*      */     
/*  931 */     this.gunModel['½'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  932 */     this.gunModel['½'].setRotationPoint(-53.0F, -28.0F, 2.35F);
/*      */     
/*  934 */     this.gunModel['¾'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  935 */     this.gunModel['¾'].setRotationPoint(-53.0F, -27.0F, 3.35F);
/*      */     
/*  937 */     this.gunModel['¿'].addShapeBox(-7.0F, 6.0F, -2.5F, 37, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  938 */     this.gunModel['¿'].setRotationPoint(-53.0F, -27.0F, 2.35F);
/*      */     
/*  940 */     this.gunModel['À'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  941 */     this.gunModel['À'].setRotationPoint(-32.0F, -23.5F, 1.35F);
/*      */     
/*  943 */     this.gunModel['Á'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  944 */     this.gunModel['Á'].setRotationPoint(-32.0F, -24.5F, 1.35F);
/*      */     
/*  946 */     this.gunModel['Â'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  947 */     this.gunModel['Â'].setRotationPoint(-32.0F, -25.5F, 2.35F);
/*      */     
/*  949 */     this.gunModel['Ã'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  950 */     this.gunModel['Ã'].setRotationPoint(-32.0F, -25.5F, 3.35F);
/*      */     
/*  952 */     this.gunModel['Ä'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  953 */     this.gunModel['Ä'].setRotationPoint(-32.0F, -24.5F, 4.35F);
/*      */     
/*  955 */     this.gunModel['Å'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  956 */     this.gunModel['Å'].setRotationPoint(-32.0F, -24.5F, 2.35F);
/*      */     
/*  958 */     this.gunModel['Æ'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  959 */     this.gunModel['Æ'].setRotationPoint(-32.0F, -21.5F, 4.35F);
/*      */     
/*  961 */     this.gunModel['Ç'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  962 */     this.gunModel['Ç'].setRotationPoint(-32.0F, -21.5F, 1.35F);
/*      */     
/*  964 */     this.gunModel['È'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  965 */     this.gunModel['È'].setRotationPoint(-32.0F, -21.5F, 2.35F);
/*      */     
/*  967 */     this.gunModel['É'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  968 */     this.gunModel['É'].setRotationPoint(-32.0F, -20.5F, 3.35F);
/*      */     
/*  970 */     this.gunModel['Ê'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  971 */     this.gunModel['Ê'].setRotationPoint(-32.0F, -20.5F, 2.35F);
/*      */     
/*  973 */     this.gunModel['Ë'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 2, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  974 */     this.gunModel['Ë'].setRotationPoint(-37.0F, -23.5F, 1.35F);
/*      */     
/*  976 */     this.gunModel['Ì'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  977 */     this.gunModel['Ì'].setRotationPoint(-37.0F, -24.5F, 1.35F);
/*      */     
/*  979 */     this.gunModel['Í'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  980 */     this.gunModel['Í'].setRotationPoint(-37.0F, -25.5F, 2.35F);
/*      */     
/*  982 */     this.gunModel['Î'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  983 */     this.gunModel['Î'].setRotationPoint(-37.0F, -25.5F, 3.35F);
/*      */     
/*  985 */     this.gunModel['Ï'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  986 */     this.gunModel['Ï'].setRotationPoint(-37.0F, -24.5F, 4.35F);
/*      */     
/*  988 */     this.gunModel['Ð'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  989 */     this.gunModel['Ð'].setRotationPoint(-37.0F, -24.5F, 2.35F);
/*      */     
/*  991 */     this.gunModel['Ñ'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F);
/*  992 */     this.gunModel['Ñ'].setRotationPoint(-37.0F, -21.5F, 4.35F);
/*      */     
/*  994 */     this.gunModel['Ò'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  995 */     this.gunModel['Ò'].setRotationPoint(-37.0F, -21.5F, 1.35F);
/*      */     
/*  997 */     this.gunModel['Ó'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  998 */     this.gunModel['Ó'].setRotationPoint(-37.0F, -21.5F, 2.35F);
/*      */     
/* 1000 */     this.gunModel['Ô'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1001 */     this.gunModel['Ô'].setRotationPoint(-37.0F, -20.5F, 3.35F);
/*      */     
/* 1003 */     this.gunModel['Õ'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1004 */     this.gunModel['Õ'].setRotationPoint(-37.0F, -20.5F, 2.35F);
/*      */     
/* 1006 */     this.gunModel['Ö'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 2, 4, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1007 */     this.gunModel['Ö'].setRotationPoint(-53.0F, -22.5F, 1.35F);
/*      */     
/* 1009 */     this.gunModel['×'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 8.0F, -1.0F);
/* 1010 */     this.gunModel['×'].setRotationPoint(-53.0F, -20.5F, 4.35F);
/*      */     
/* 1012 */     this.gunModel['Ø'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 7.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 7.0F, 0.0F);
/* 1013 */     this.gunModel['Ø'].setRotationPoint(-53.0F, -19.5F, 3.35F);
/*      */     
/* 1015 */     this.gunModel['Ù'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 7.25F, 0.0F);
/* 1016 */     this.gunModel['Ù'].setRotationPoint(-53.0F, -19.5F, 2.35F);
/*      */     
/* 1018 */     this.gunModel['Ú'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 2, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1019 */     this.gunModel['Ú'].setRotationPoint(-53.0F, -20.5F, 2.35F);
/*      */     
/* 1021 */     this.gunModel['Û'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1022 */     this.gunModel['Û'].setRotationPoint(-53.0F, -20.5F, 1.35F);
/*      */     
/* 1024 */     this.gunModel['Ü'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -8.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1025 */     this.gunModel['Ü'].setRotationPoint(-53.0F, -23.5F, 1.35F);
/*      */     
/* 1027 */     this.gunModel['Ý'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 2, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1028 */     this.gunModel['Ý'].setRotationPoint(-53.0F, -23.5F, 2.35F);
/*      */     
/* 1030 */     this.gunModel['Þ'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -8.0F, -1.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1031 */     this.gunModel['Þ'].setRotationPoint(-53.0F, -23.5F, 4.35F);
/*      */     
/* 1033 */     this.gunModel['ß'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -8.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1034 */     this.gunModel['ß'].setRotationPoint(-53.0F, -24.5F, 3.35F);
/*      */     
/* 1036 */     this.gunModel['à'].addShapeBox(-7.0F, 6.0F, -2.5F, 16, 1, 1, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -8.75F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1037 */     this.gunModel['à'].setRotationPoint(-53.0F, -24.5F, 2.35F);
/*      */     
/* 1039 */     this.gunModel['á'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1040 */     this.gunModel['á'].setRotationPoint(-16.0F, -31.0F, 1.35F);
/*      */     
/* 1042 */     this.gunModel['â'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 19, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1043 */     this.gunModel['â'].setRotationPoint(-56.0F, -31.0F, 1.35F);
/*      */     
/* 1045 */     this.gunModel['ã'].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1046 */     this.gunModel['ã'].setRotationPoint(-28.0F, -26.5F, 2.35F);
/*      */     
/* 1048 */     this.gunModel['ä'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 2, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1049 */     this.gunModel['ä'].setRotationPoint(46.0F, -33.5F, -2.25F);
/*      */     
/* 1051 */     this.gunModel['å'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1052 */     this.gunModel['å'].setRotationPoint(46.0F, -35.5F, -0.5F);
/*      */     
/* 1054 */     this.gunModel['æ'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 2, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1055 */     this.gunModel['æ'].setRotationPoint(46.0F, -37.5F, 0.0F);
/*      */     
/* 1057 */     this.gunModel['ç'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 2, 6, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1058 */     this.gunModel['ç'].setRotationPoint(23.0F, -33.5F, -0.25F);
/*      */     
/* 1060 */     this.gunModel['è'].addShapeBox(-7.0F, 6.0F, -2.5F, 10, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1061 */     this.gunModel['è'].setRotationPoint(22.0F, -35.5F, -0.5F);
/*      */     
/* 1063 */     this.gunModel['é'].addShapeBox(-7.0F, 6.0F, -2.5F, 12, 2, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1064 */     this.gunModel['é'].setRotationPoint(22.0F, -33.5F, -3.25F);
/*      */     
/* 1066 */     this.gunModel['ê'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1067 */     this.gunModel['ê'].setRotationPoint(46.0F, -33.5F, -3.25F);
/*      */     
/* 1069 */     this.gunModel['ë'].addShapeBox(-7.0F, 6.0F, -2.5F, 10, 2, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1070 */     this.gunModel['ë'].setRotationPoint(22.0F, -33.5F, -2.25F);
/*      */     
/* 1072 */     this.gunModel['ì'].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1073 */     this.gunModel['ì'].setRotationPoint(11.0F, -20.0F, 0.7F);
/*      */     
/* 1075 */     this.gunModel['í'].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1076 */     this.gunModel['í'].setRotationPoint(11.0F, -19.0F, 0.7F);
/*      */     
/* 1078 */     this.gunModel['î'].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 1, 4, 0.0F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 1079 */     this.gunModel['î'].setRotationPoint(11.0F, -18.0F, 0.7F);
/*      */     
/* 1081 */     this.gunModel['ï'].addShapeBox(-7.0F, 6.0F, -2.5F, 6, 1, 4, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1082 */     this.gunModel['ï'].setRotationPoint(12.0F, -17.0F, 0.7F);
/*      */     
/* 1084 */     this.gunModel['ð'].addShapeBox(-7.0F, 6.0F, -2.5F, 6, 1, 4, 0.0F, -2.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -3.75F, 0.5F, 0.0F);
/* 1085 */     this.gunModel['ð'].setRotationPoint(12.5F, -16.0F, 0.7F);
/*      */     
/* 1087 */     this.gunModel['ñ'].addShapeBox(-7.0F, 6.0F, -2.5F, 12, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1088 */     this.gunModel['ñ'].setRotationPoint(7.0F, -26.0F, -3.0F);
/*      */     
/* 1090 */     this.gunModel['ò'].addShapeBox(-7.0F, 6.0F, -2.5F, 10, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1091 */     this.gunModel['ò'].setRotationPoint(9.0F, -28.0F, -3.0F);
/*      */     
/* 1093 */     this.gunModel['ó'].addShapeBox(-7.0F, 6.0F, -2.5F, 4, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1094 */     this.gunModel['ó'].setRotationPoint(3.0F, -26.0F, -3.0F);
/*      */     
/* 1096 */     this.gunModel['ô'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1097 */     this.gunModel['ô'].setRotationPoint(1.0F, -26.0F, -3.0F);
/*      */     
/* 1099 */     this.gunModel['õ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1100 */     this.gunModel['õ'].setRotationPoint(0.0F, -26.0F, -3.0F);
/*      */     
/* 1102 */     this.gunModel['ö'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 1, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1103 */     this.gunModel['ö'].setRotationPoint(-2.0F, -26.0F, -3.0F);
/*      */     
/* 1105 */     this.gunModel['÷'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1106 */     this.gunModel['÷'].setRotationPoint(1.0F, -22.0F, -3.0F);
/*      */     
/* 1108 */     this.gunModel['ø'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1109 */     this.gunModel['ø'].setRotationPoint(0.0F, -22.0F, -3.0F);
/*      */     
/* 1111 */     this.gunModel['ù'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1112 */     this.gunModel['ù'].setRotationPoint(-2.0F, -22.0F, -3.0F);
/*      */     
/* 1114 */     this.gunModel['ú'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1115 */     this.gunModel['ú'].setRotationPoint(1.0F, -25.0F, -3.0F);
/*      */     
/* 1117 */     this.gunModel['û'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1118 */     this.gunModel['û'].setRotationPoint(-2.0F, -25.0F, -3.0F);
/*      */     
/* 1120 */     this.gunModel['ü'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1121 */     this.gunModel['ü'].setRotationPoint(5.65F, -44.0F, 3.0F);
/*      */     
/* 1123 */     this.gunModel['ý'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1124 */     this.gunModel['ý'].setRotationPoint(5.65F, -44.0F, 1.0F);
/*      */     
/* 1126 */     this.gunModel['þ'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.1F, 0.75F, 0.0F, -1.5F, 0.75F, 0.0F, -1.5F, 0.75F, 0.0F, -1.1F, 0.75F);
/* 1127 */     this.gunModel['þ'].setRotationPoint(58.0F, -26.0F, -2.5F);
/*      */     
/* 1129 */     this.gunModel['ÿ'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 14, 3, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 1.5F, 0.1F, 0.0F, 1.5F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F);
/* 1130 */     this.gunModel['ÿ'].setRotationPoint(52.0F, -35.0F, 4.5F);
/*      */     
/* 1132 */     this.gunModel['Ā'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 5, 2, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -1.1F, 0.75F, 0.0F, -1.1F, 0.75F, 0.0F, 0.5F, 0.75F);
/* 1133 */     this.gunModel['Ā'].setRotationPoint(55.0F, -26.0F, 5.5F);
/*      */     
/* 1135 */     this.gunModel['ā'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 3, 0.0F, 0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, 0.5F, 0.85F, 0.75F, 0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, 0.5F, 1.65F, 0.75F);
/* 1136 */     this.gunModel['ā'].setRotationPoint(56.5F, -31.15F, 4.5F);
/*      */     
/* 1138 */     this.gunModel['Ă'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 3, 3, 0.0F, 0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, -0.5F, 0.85F, 0.75F, 0.5F, 0.85F, 0.75F, 0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, -0.5F, 1.65F, 0.75F, 0.5F, 1.65F, 0.75F);
/* 1139 */     this.gunModel['Ă'].setRotationPoint(55.5F, -31.15F, 4.5F);
/*      */     
/* 1141 */     this.gunModel['ă'].addShapeBox(-7.0F, 6.0F, -2.5F, 28, 1, 1, 0.0F, 0.5F, 0.35F, 0.75F, -0.5F, 0.35F, 0.75F, -0.5F, 0.35F, 0.75F, 0.5F, 0.35F, 0.75F, 0.5F, 1.15F, 0.75F, -0.5F, 1.15F, 0.75F, -0.5F, 1.15F, 0.75F, 0.5F, 1.15F, 0.75F);
/* 1142 */     this.gunModel['ă'].setRotationPoint(57.5F, -36.15F, 5.5F);
/*      */     
/* 1144 */     this.gunModel['Ą'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.1F, 0.75F, 0.0F, -1.5F, 0.75F, 0.0F, -1.5F, 0.75F, 0.0F, -1.1F, 0.75F);
/* 1145 */     this.gunModel['Ą'].setRotationPoint(58.0F, -26.0F, 5.5F);
/*      */     
/* 1147 */     this.gunModel['ą'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 6, 10, 0.0F, 0.5F, 0.35F, 0.75F, 0.0F, 0.35F, 0.75F, 0.0F, 0.35F, 0.75F, 0.5F, 0.35F, 0.75F, 0.5F, 1.15F, 0.75F, 0.0F, 1.15F, 0.75F, 0.0F, 1.15F, 0.75F, 0.5F, 1.15F, 0.75F);
/* 1148 */     this.gunModel['ą'].setRotationPoint(57.5F, -33.65F, -2.5F);
/*      */     
/* 1150 */     this.gunModel['Ć'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 6, 8, 0.0F, 0.5F, 0.35F, 0.75F, 0.0F, 0.35F, 0.75F, 0.0F, 0.35F, 0.75F, 0.5F, 0.35F, 0.75F, 0.5F, 1.15F, 0.75F, 0.0F, 1.15F, 0.75F, 0.0F, 1.15F, 0.75F, 0.5F, 1.15F, 0.75F);
/* 1151 */     this.gunModel['Ć'].setRotationPoint(83.0F, -33.65F, -1.5F);
/*      */     
/* 1153 */     this.gunModel['ć'].addShapeBox(-7.0F, 6.0F, -2.5F, 25, 5, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.5F, 0.75F, 0.5F, -1.5F, 0.75F, 0.5F, -1.5F, 0.75F, 0.0F, -1.5F, 0.75F);
/* 1154 */     this.gunModel['ć'].setRotationPoint(60.0F, -26.0F, 5.5F);
/*      */     
/* 1156 */     this.gunModel['Ĉ'].addShapeBox(-7.0F, 6.0F, -2.5F, 25, 5, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.5F, 0.75F, 0.5F, -1.5F, 0.75F, 0.5F, -1.5F, 0.75F, 0.0F, -1.5F, 0.75F);
/* 1157 */     this.gunModel['Ĉ'].setRotationPoint(60.0F, -26.0F, -2.5F);
/*      */     
/* 1159 */     this.gunModel['ĉ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 2, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -1.5F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -1.5F, 0.75F);
/* 1160 */     this.gunModel['ĉ'].setRotationPoint(85.5F, -26.0F, 5.5F);
/*      */     
/* 1162 */     this.gunModel['Ċ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 2, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -1.5F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -1.5F, 0.75F);
/* 1163 */     this.gunModel['Ċ'].setRotationPoint(85.5F, -26.0F, -2.5F);
/*      */     
/* 1165 */     this.gunModel['ċ'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1166 */     this.gunModel['ċ'].setRotationPoint(59.5F, -32.75F, -2.5F);
/*      */     
/* 1168 */     this.gunModel['Č'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 9, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1169 */     this.gunModel['Č'].setRotationPoint(59.5F, -33.75F, -2.0F);
/*      */     
/* 1171 */     this.gunModel['č'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 9, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1172 */     this.gunModel['č'].setRotationPoint(59.5F, -31.5F, -2.0F);
/*      */     
/* 1174 */     this.gunModel['Ď'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1175 */     this.gunModel['Ď'].setRotationPoint(59.5F, -30.5F, -2.5F);
/*      */     
/* 1177 */     this.gunModel['ď'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 9, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1178 */     this.gunModel['ď'].setRotationPoint(59.5F, -29.25F, -2.0F);
/*      */     
/* 1180 */     this.gunModel['Đ'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1181 */     this.gunModel['Đ'].setRotationPoint(59.5F, -28.25F, -2.5F);
/*      */     
/* 1183 */     this.gunModel['đ'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 9, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1184 */     this.gunModel['đ'].setRotationPoint(59.5F, -27.0F, -2.0F);
/*      */     
/* 1186 */     this.gunModel['Ē'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 3, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F);
/* 1187 */     this.gunModel['Ē'].setRotationPoint(83.0F, -26.75F, 4.75F);
/*      */     
/* 1189 */     this.gunModel['ē'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1190 */     this.gunModel['ē'].setRotationPoint(58.0F, -26.75F, 4.75F);
/*      */     
/* 1192 */     this.gunModel['Ĕ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 15, 3, 0.0F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.1F);
/* 1193 */     this.gunModel['Ĕ'].setRotationPoint(54.0F, -36.0F, 4.5F);
/*      */     
/* 1195 */     this.gunModel['ĕ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1196 */     this.gunModel['ĕ'].setRotationPoint(59.5F, -33.75F, -2.5F);
/*      */     
/* 1198 */     this.gunModel['Ė'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1199 */     this.gunModel['Ė'].setRotationPoint(59.5F, -34.0F, -2.5F);
/*      */     
/* 1201 */     this.gunModel['ė'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1202 */     this.gunModel['ė'].setRotationPoint(81.5F, -34.0F, -2.5F);
/*      */     
/* 1204 */     this.gunModel['Ę'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1205 */     this.gunModel['Ę'].setRotationPoint(81.5F, -33.75F, -2.5F);
/*      */     
/* 1207 */     this.gunModel['ę'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1208 */     this.gunModel['ę'].setRotationPoint(59.5F, -31.5F, -2.5F);
/*      */     
/* 1210 */     this.gunModel['Ě'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1211 */     this.gunModel['Ě'].setRotationPoint(59.5F, -31.75F, -2.5F);
/*      */     
/* 1213 */     this.gunModel['ě'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1214 */     this.gunModel['ě'].setRotationPoint(81.5F, -31.75F, -2.5F);
/*      */     
/* 1216 */     this.gunModel['Ĝ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1217 */     this.gunModel['Ĝ'].setRotationPoint(81.5F, -31.5F, -2.5F);
/*      */     
/* 1219 */     this.gunModel['ĝ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1220 */     this.gunModel['ĝ'].setRotationPoint(59.5F, -29.25F, -2.5F);
/*      */     
/* 1222 */     this.gunModel['Ğ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1223 */     this.gunModel['Ğ'].setRotationPoint(59.5F, -29.5F, -2.5F);
/*      */     
/* 1225 */     this.gunModel['ğ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1226 */     this.gunModel['ğ'].setRotationPoint(81.5F, -29.5F, -2.5F);
/*      */     
/* 1228 */     this.gunModel['Ġ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1229 */     this.gunModel['Ġ'].setRotationPoint(81.5F, -29.25F, -2.5F);
/*      */     
/* 1231 */     this.gunModel['ġ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1232 */     this.gunModel['ġ'].setRotationPoint(59.5F, -27.0F, -2.5F);
/*      */     
/* 1234 */     this.gunModel['Ģ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1235 */     this.gunModel['Ģ'].setRotationPoint(59.5F, -27.25F, -2.5F);
/*      */     
/* 1237 */     this.gunModel['ģ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1238 */     this.gunModel['ģ'].setRotationPoint(81.5F, -27.25F, -2.5F);
/*      */     
/* 1240 */     this.gunModel['Ĥ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1241 */     this.gunModel['Ĥ'].setRotationPoint(81.5F, -27.0F, -2.5F);
/*      */     
/* 1243 */     this.gunModel['ĥ'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 6, 1, 0.0F, 0.5F, 0.25F, -0.5F, 1.5F, 0.25F, -0.5F, 1.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.75F, -0.5F, 1.5F, -0.75F, -0.5F, 1.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F);
/* 1244 */     this.gunModel['ĥ'].setRotationPoint(83.0F, -31.75F, 6.75F);
/*      */     
/* 1246 */     this.gunModel['Ħ'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 6, 1, 0.0F, 0.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/* 1247 */     this.gunModel['Ħ'].setRotationPoint(83.0F, -31.75F, -3.25F);
/*      */     
/* 1249 */     this.gunModel['ħ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1250 */     this.gunModel['ħ'].setRotationPoint(84.25F, -35.5F, -2.5F);
/*      */     
/* 1252 */     this.gunModel['Ĩ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1253 */     this.gunModel['Ĩ'].setRotationPoint(84.25F, -35.0F, -2.5F);
/*      */     
/* 1255 */     this.gunModel['ĩ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1256 */     this.gunModel['ĩ'].setRotationPoint(83.75F, -35.0F, -2.5F);
/*      */     
/* 1258 */     this.gunModel['Ī'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1259 */     this.gunModel['Ī'].setRotationPoint(83.75F, -35.5F, -2.5F);
/*      */     
/* 1261 */     this.gunModel['ī'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1262 */     this.gunModel['ī'].setRotationPoint(84.25F, -33.5F, -2.5F);
/*      */     
/* 1264 */     this.gunModel['Ĭ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1265 */     this.gunModel['Ĭ'].setRotationPoint(84.25F, -33.0F, -2.5F);
/*      */     
/* 1267 */     this.gunModel['ĭ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1268 */     this.gunModel['ĭ'].setRotationPoint(83.75F, -33.0F, -2.5F);
/*      */     
/* 1270 */     this.gunModel['Į'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1271 */     this.gunModel['Į'].setRotationPoint(83.75F, -33.5F, -2.5F);
/*      */     
/* 1273 */     this.gunModel['į'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1274 */     this.gunModel['į'].setRotationPoint(85.25F, -36.23F, 6.75F);
/*      */     
/* 1276 */     this.gunModel['İ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1277 */     this.gunModel['İ'].setRotationPoint(82.5F, -36.23F, 6.75F);
/*      */     
/* 1279 */     this.gunModel['ı'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1280 */     this.gunModel['ı'].setRotationPoint(83.75F, -36.23F, 6.75F);
/*      */     
/* 1282 */     this.gunModel['Ĳ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1283 */     this.gunModel['Ĳ'].setRotationPoint(83.75F, -34.23F, 6.75F);
/*      */     
/* 1285 */     this.gunModel['ĳ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1286 */     this.gunModel['ĳ'].setRotationPoint(83.75F, -36.23F, 6.75F);
/*      */     
/* 1288 */     this.gunModel['Ĵ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1289 */     this.gunModel['Ĵ'].setRotationPoint(85.25F, -36.23F, -3.75F);
/*      */     
/* 1291 */     this.gunModel['ĵ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1292 */     this.gunModel['ĵ'].setRotationPoint(82.5F, -36.23F, -3.75F);
/*      */     
/* 1294 */     this.gunModel['Ķ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1295 */     this.gunModel['Ķ'].setRotationPoint(83.75F, -36.23F, -3.75F);
/*      */     
/* 1297 */     this.gunModel['ķ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1298 */     this.gunModel['ķ'].setRotationPoint(83.75F, -34.23F, -3.75F);
/*      */     
/* 1300 */     this.gunModel['ĸ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1301 */     this.gunModel['ĸ'].setRotationPoint(83.75F, -36.23F, -3.25F);
/*      */     
/* 1303 */     this.gunModel['Ĺ'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 3, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F);
/* 1304 */     this.gunModel['Ĺ'].setRotationPoint(83.0F, -26.75F, -3.25F);
/*      */     
/* 1306 */     this.gunModel['ĺ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1307 */     this.gunModel['ĺ'].setRotationPoint(58.0F, -26.75F, -3.25F);
/*      */     
/* 1309 */     this.gunModel['Ļ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1310 */     this.gunModel['Ļ'].setRotationPoint(55.5F, -35.5F, -2.5F);
/*      */     
/* 1312 */     this.gunModel['ļ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1313 */     this.gunModel['ļ'].setRotationPoint(55.5F, -35.0F, -2.5F);
/*      */     
/* 1315 */     this.gunModel['Ľ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1316 */     this.gunModel['Ľ'].setRotationPoint(55.0F, -35.0F, -2.5F);
/*      */     
/* 1318 */     this.gunModel['ľ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1319 */     this.gunModel['ľ'].setRotationPoint(55.0F, -35.5F, -2.5F);
/*      */     
/* 1321 */     this.gunModel['Ŀ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F);
/* 1322 */     this.gunModel['Ŀ'].setRotationPoint(55.5F, -33.5F, -2.5F);
/*      */     
/* 1324 */     this.gunModel['ŀ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1325 */     this.gunModel['ŀ'].setRotationPoint(55.5F, -33.0F, -2.5F);
/*      */     
/* 1327 */     this.gunModel['Ł'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1328 */     this.gunModel['Ł'].setRotationPoint(55.0F, -33.0F, -2.5F);
/*      */     
/* 1330 */     this.gunModel['ł'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 1331 */     this.gunModel['ł'].setRotationPoint(55.0F, -33.5F, -2.5F);
/*      */     
/* 1333 */     this.gunModel['Ń'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 12, 0.0F, 0.0F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1334 */     this.gunModel['Ń'].setRotationPoint(55.0F, -36.23F, -4.25F);
/*      */     
/* 1336 */     this.gunModel['ń'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1337 */     this.gunModel['ń'].setRotationPoint(55.0F, -34.23F, 6.75F);
/*      */     
/* 1339 */     this.gunModel['Ņ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1340 */     this.gunModel['Ņ'].setRotationPoint(55.0F, -36.23F, 6.75F);
/*      */     
/* 1342 */     this.gunModel['ņ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1343 */     this.gunModel['ņ'].setRotationPoint(55.0F, -34.23F, -3.75F);
/*      */     
/* 1345 */     this.gunModel['Ň'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1346 */     this.gunModel['Ň'].setRotationPoint(55.0F, -36.23F, -3.25F);
/*      */     
/* 1348 */     this.gunModel['ň'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 3, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1349 */     this.gunModel['ň'].setRotationPoint(56.5F, -36.23F, 4.75F);
/*      */     
/* 1351 */     this.gunModel['ŉ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 5, 3, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1352 */     this.gunModel['ŉ'].setRotationPoint(56.5F, -36.23F, -3.75F);
/*      */     
/* 1354 */     this.gunModel['Ŋ'].addShapeBox(-7.0F, 6.0F, -2.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1355 */     this.gunModel['Ŋ'].setRotationPoint(107.5F, -26.75F, 0.5F);
/*      */     
/* 1357 */     this.gunModel['ŋ'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/* 1358 */     this.gunModel['ŋ'].setRotationPoint(105.5F, -26.75F, 0.5F);
/*      */     
/* 1360 */     this.gunModel['Ō'].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1361 */     this.gunModel['Ō'].setRotationPoint(101.0F, -26.75F, 0.5F);
/*      */     
/* 1363 */     this.gunModel['ō'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 4, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 1.25F, 0.0F);
/* 1364 */     this.gunModel['ō'].setRotationPoint(104.5F, -26.75F, 0.5F);
/*      */     
/* 1366 */     this.gunModel['Ŏ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1367 */     this.gunModel['Ŏ'].setRotationPoint(101.0F, -25.75F, 0.5F);
/*      */     
/* 1369 */     this.gunModel['ŏ'].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1370 */     this.gunModel['ŏ'].setRotationPoint(105.0F, -25.75F, 0.5F);
/*      */     
/* 1372 */     this.gunModel['Ő'].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1373 */     this.gunModel['Ő'].setRotationPoint(102.75F, -25.75F, 0.0F);
/*      */     
/* 1375 */     this.gunModel['ő'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 1, 0.0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 2.5F, 0.0F, -0.75F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 2.5F, 0.0F, -0.75F);
/* 1376 */     this.gunModel['ő'].setRotationPoint(59.5F, -36.5F, -2.5F);
/*      */     
/* 1378 */     this.gunModel['Œ'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 1, 0.0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 2.5F, 0.0F, -0.75F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 2.5F, 0.0F, -0.75F);
/* 1379 */     this.gunModel['Œ'].setRotationPoint(59.5F, -36.5F, 8.0F);
/*      */     
/* 1381 */     this.gunModel['œ'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 10, 0.0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 2.5F, 0.0F, 0.75F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 2.5F, 0.0F, 0.75F);
/* 1382 */     this.gunModel['œ'].setRotationPoint(59.5F, -35.5F, -2.5F);
/*      */     
/* 1384 */     this.gunModel['Ŕ'].addShapeBox(-7.0F, 6.0F, -2.5F, 23, 1, 10, 0.0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 2.5F, 0.0F, 0.75F, 2.5F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 2.5F, -0.5F, 0.75F);
/* 1385 */     this.gunModel['Ŕ'].setRotationPoint(59.5F, -34.5F, -2.5F);
/*      */     
/*      */ 
/* 1388 */     this.ammoModel = new ModelRendererTurbo[13];
/* 1389 */     this.ammoModel[0] = new ModelRendererTurbo(this, 321, 137, this.textureX, this.textureY);
/* 1390 */     this.ammoModel[1] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/* 1391 */     this.ammoModel[2] = new ModelRendererTurbo(this, 473, 185, this.textureX, this.textureY);
/* 1392 */     this.ammoModel[3] = new ModelRendererTurbo(this, 369, 193, this.textureX, this.textureY);
/* 1393 */     this.ammoModel[4] = new ModelRendererTurbo(this, 401, 193, this.textureX, this.textureY);
/* 1394 */     this.ammoModel[5] = new ModelRendererTurbo(this, 441, 193, this.textureX, this.textureY);
/* 1395 */     this.ammoModel[6] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/* 1396 */     this.ammoModel[7] = new ModelRendererTurbo(this, 33, 201, this.textureX, this.textureY);
/* 1397 */     this.ammoModel[8] = new ModelRendererTurbo(this, 57, 201, this.textureX, this.textureY);
/* 1398 */     this.ammoModel[9] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/* 1399 */     this.ammoModel[10] = new ModelRendererTurbo(this, 113, 201, this.textureX, this.textureY);
/* 1400 */     this.ammoModel[11] = new ModelRendererTurbo(this, 137, 201, this.textureX, this.textureY);
/* 1401 */     this.ammoModel[12] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*      */     
/* 1403 */     this.ammoModel[0].addShapeBox(-7.0F, 6.0F, -2.5F, 9, 37, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -0.5F, 0.0F);
/* 1404 */     this.ammoModel[0].setRotationPoint(28.0F, -23.0F, -1.0F);
/*      */     
/* 1406 */     this.ammoModel[1].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 37, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 5.0F, -4.75F, 0.0F, 5.0F, -4.75F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1407 */     this.ammoModel[1].setRotationPoint(37.0F, -23.0F, -1.0F);
/*      */     
/* 1409 */     this.ammoModel[2].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 33, 5, 0.0F, -6.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, -11.0F, -0.75F, 0.0F, 5.5F, -1.25F, 0.0F, 5.5F, -1.25F, 0.0F, -11.0F, -0.75F, 0.0F);
/* 1410 */     this.ammoModel[2].setRotationPoint(35.75F, -23.0F, 0.0F);
/*      */     
/* 1412 */     this.ammoModel[3].addShapeBox(-7.0F, 6.0F, -2.5F, 8, 38, 5, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -10.75F, -1.25F, 0.0F, 4.25F, -1.5F, 0.0F, 4.25F, -1.5F, 0.0F, -10.75F, -1.0F, 0.0F);
/* 1413 */     this.ammoModel[3].setRotationPoint(20.0F, -23.0F, 0.0F);
/*      */     
/* 1415 */     this.ammoModel[4].addShapeBox(-7.0F, 6.0F, -2.5F, 8, 34, 8, 0.0F, -6.0F, 0.95F, 0.0F, 0.5F, 0.95F, 0.0F, 0.5F, 0.95F, 0.0F, -6.0F, 0.95F, 0.0F, -11.0F, -0.6F, 0.0F, 5.5F, -1.25F, 0.0F, 5.5F, -1.25F, 0.0F, -11.0F, -0.6F, 0.0F);
/* 1416 */     this.ammoModel[4].setRotationPoint(28.0F, -22.0F, -1.5F);
/*      */     
/* 1418 */     this.ammoModel[5].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1419 */     this.ammoModel[5].setRotationPoint(32.55F, -5.0F, -1.5F);
/*      */     
/* 1421 */     this.ammoModel[6].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 2, 8, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F);
/* 1422 */     this.ammoModel[6].setRotationPoint(39.0F, 2.0F, -1.5F);
/*      */     
/* 1424 */     this.ammoModel[7].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1425 */     this.ammoModel[7].setRotationPoint(42.0F, -12.0F, -1.5F);
/*      */     
/* 1427 */     this.ammoModel[8].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1428 */     this.ammoModel[8].setRotationPoint(44.0F, 2.0F, -1.5F);
/*      */     
/* 1430 */     this.ammoModel[9].addShapeBox(-7.0F, 6.0F, -2.5F, 5, 2, 8, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 1431 */     this.ammoModel[9].setRotationPoint(37.0F, -12.0F, -1.5F);
/*      */     
/* 1433 */     this.ammoModel[10].addShapeBox(-7.0F, 6.0F, -2.5F, 1, 2, 8, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1434 */     this.ammoModel[10].setRotationPoint(31.55F, -5.0F, -1.5F);
/*      */     
/* 1436 */     this.ammoModel[11].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 34, 8, 0.0F, -6.0F, -0.35F, -0.25F, 0.5F, -0.35F, -0.25F, 0.5F, -0.35F, -0.25F, -6.0F, -0.35F, -0.25F, -11.0F, -0.65F, -0.25F, 5.5F, -1.1F, -0.25F, 5.5F, -1.1F, -0.25F, -11.0F, -0.65F, -0.25F);
/* 1437 */     this.ammoModel[11].setRotationPoint(33.0F, -23.25F, -1.5F);
/*      */     
/* 1439 */     this.ammoModel[12].addShapeBox(-7.0F, 6.0F, -2.5F, 7, 37, 8, 0.0F, -6.0F, -0.35F, -0.25F, 0.5F, -0.35F, -0.25F, 0.5F, -0.35F, -0.25F, -6.0F, -0.35F, -0.25F, -11.0F, -1.15F, -0.25F, 5.5F, -1.6F, -0.25F, 5.5F, -1.6F, -0.25F, -11.0F, -1.15F, -0.25F);
/* 1440 */     this.ammoModel[12].setRotationPoint(24.0F, -23.25F, -1.5F);
/*      */     
/*      */ 
/* 1443 */     this.slideModel = new ModelRendererTurbo[6];
/* 1444 */     this.slideModel[0] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/* 1445 */     this.slideModel[1] = new ModelRendererTurbo(this, 361, 129, this.textureX, this.textureY);
/* 1446 */     this.slideModel[2] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/* 1447 */     this.slideModel[3] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/* 1448 */     this.slideModel[4] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/* 1449 */     this.slideModel[5] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/*      */     
/* 1451 */     this.slideModel[0].addShapeBox(-7.0F, 6.0F, -2.5F, 14, 2, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1452 */     this.slideModel[0].setRotationPoint(32.0F, -33.5F, -2.25F);
/*      */     
/* 1454 */     this.slideModel[1].addShapeBox(-7.0F, 6.0F, -2.5F, 14, 2, 3, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1455 */     this.slideModel[1].setRotationPoint(32.0F, -35.5F, -0.5F);
/*      */     
/* 1457 */     this.slideModel[2].addShapeBox(-7.0F, 6.0F, -2.5F, 14, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1458 */     this.slideModel[2].setRotationPoint(32.0F, -37.5F, 0.0F);
/*      */     
/* 1460 */     this.slideModel[3].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1461 */     this.slideModel[3].setRotationPoint(43.5F, -35.0F, -3.75F);
/*      */     
/* 1463 */     this.slideModel[4].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1464 */     this.slideModel[4].setRotationPoint(43.5F, -39.0F, -3.75F);
/*      */     
/* 1466 */     this.slideModel[5].addShapeBox(-7.0F, 6.0F, -2.5F, 2, 2, 2, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1467 */     this.slideModel[5].setRotationPoint(43.5F, -41.25F, -3.75F);
/*      */     
/*      */ 
/*      */ 
/* 1471 */     translateAll(0.0F, -12.0F, 0.0F);
/* 1472 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.07F, 0.0F);
/*      */     
/* 1474 */     this.gunSlideDistance = 0.75F;
/* 1475 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/* 1478 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelgalil308.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */