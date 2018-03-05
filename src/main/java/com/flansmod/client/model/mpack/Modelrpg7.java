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
/*      */ public class Modelrpg7
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelrpg7()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ý'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 17, 49, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 129, 57, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 97, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 97, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 97, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 97, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 73, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 97, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 105, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 377, 121, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 201, 129, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 489, 121, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 225, 105, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 489, 113, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 145, 185, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 345, 145, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 113, 161, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 417, 129, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 209, 145, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 257, 169, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 9, 73, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 417, 177, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 489, 137, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 33, 161, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 73, 161, this.textureX, this.textureY);
/*      */     
/*  276 */     this.gunModel[0].addBox(-25.0F, -16.0F, 1.0F, 16, 2, 5, 0.0F);
/*  277 */     this.gunModel[0].setRotationPoint(-19.0F, 1.0F, -4.0F);
/*      */     
/*  279 */     this.gunModel[1].addShapeBox(-25.0F, -16.0F, 1.0F, 16, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  280 */     this.gunModel[1].setRotationPoint(-19.0F, 3.0F, -4.0F);
/*      */     
/*  282 */     this.gunModel[2].addShapeBox(-25.0F, -16.0F, 1.0F, 12, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  283 */     this.gunModel[2].setRotationPoint(-17.0F, 5.0F, -4.0F);
/*      */     
/*  285 */     this.gunModel[3].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  286 */     this.gunModel[3].setRotationPoint(-16.0F, 6.0F, -4.0F);
/*      */     
/*  288 */     this.gunModel[4].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/*  289 */     this.gunModel[4].setRotationPoint(-16.0F, 24.0F, -4.0F);
/*      */     
/*  291 */     this.gunModel[5].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 9, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  292 */     this.gunModel[5].setRotationPoint(-16.0F, 15.0F, -4.0F);
/*      */     
/*  294 */     this.gunModel[6].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  295 */     this.gunModel[6].setRotationPoint(-16.0F, 13.0F, -4.0F);
/*      */     
/*  297 */     this.gunModel[7].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 5, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  298 */     this.gunModel[7].setRotationPoint(-9.0F, 13.0F, -4.0F);
/*      */     
/*  300 */     this.gunModel[8].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  301 */     this.gunModel[8].setRotationPoint(-10.5F, 13.0F, -4.0F);
/*      */     
/*  303 */     this.gunModel[9].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  304 */     this.gunModel[9].setRotationPoint(-11.5F, 13.0F, -4.0F);
/*      */     
/*  306 */     this.gunModel[10].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  307 */     this.gunModel[10].setRotationPoint(-11.5F, 14.0F, -4.0F);
/*      */     
/*  309 */     this.gunModel[11].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 5, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  310 */     this.gunModel[11].setRotationPoint(-10.5F, 14.0F, -4.0F);
/*      */     
/*  312 */     this.gunModel[12].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 9, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  313 */     this.gunModel[12].setRotationPoint(20.0F, 15.0F, -4.0F);
/*      */     
/*  315 */     this.gunModel[13].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 6, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  316 */     this.gunModel[13].setRotationPoint(20.0F, 24.0F, -4.0F);
/*      */     
/*  318 */     this.gunModel[14].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 5, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/*  319 */     this.gunModel[14].setRotationPoint(20.0F, 30.0F, -4.0F);
/*      */     
/*  321 */     this.gunModel[15].addShapeBox(-25.0F, -16.0F, 1.0F, 9, 18, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  322 */     this.gunModel[15].setRotationPoint(20.25F, -3.0F, -4.5F);
/*      */     
/*  324 */     this.gunModel[16].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  325 */     this.gunModel[16].setRotationPoint(18.25F, 13.0F, -4.5F);
/*      */     
/*  327 */     this.gunModel[17].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 6, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  328 */     this.gunModel[17].setRotationPoint(16.25F, 11.0F, -4.5F);
/*      */     
/*  330 */     this.gunModel[18].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 1, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  331 */     this.gunModel[18].setRotationPoint(16.25F, 10.25F, -4.5F);
/*      */     
/*  333 */     this.gunModel[19].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 1, 6, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  334 */     this.gunModel[19].setRotationPoint(16.25F, 9.75F, -4.5F);
/*      */     
/*  336 */     this.gunModel[20].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 3, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  337 */     this.gunModel[20].setRotationPoint(18.25F, 7.75F, -4.5F);
/*      */     
/*  339 */     this.gunModel[21].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 11, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  340 */     this.gunModel[21].setRotationPoint(18.25F, -3.0F, -4.5F);
/*      */     
/*  342 */     this.gunModel[22].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 3, 6, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  343 */     this.gunModel[22].setRotationPoint(29.5F, 12.0F, -4.5F);
/*      */     
/*  345 */     this.gunModel[23].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  346 */     this.gunModel[23].setRotationPoint(29.5F, 3.0F, -4.5F);
/*      */     
/*  348 */     this.gunModel[24].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  349 */     this.gunModel[24].setRotationPoint(29.5F, 11.0F, -4.5F);
/*      */     
/*  351 */     this.gunModel[25].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  352 */     this.gunModel[25].setRotationPoint(29.5F, 11.5F, -4.5F);
/*      */     
/*  354 */     this.gunModel[26].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 4, 6, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  355 */     this.gunModel[26].setRotationPoint(33.5F, 8.5F, -4.5F);
/*      */     
/*  357 */     this.gunModel[27].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  358 */     this.gunModel[27].setRotationPoint(39.5F, 8.5F, -4.5F);
/*      */     
/*  360 */     this.gunModel[28].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  361 */     this.gunModel[28].setRotationPoint(39.5F, 2.5F, -4.5F);
/*      */     
/*  363 */     this.gunModel[29].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 6, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  364 */     this.gunModel[29].setRotationPoint(37.5F, 0.5F, -4.5F);
/*      */     
/*  366 */     this.gunModel[30].addShapeBox(-25.0F, -16.0F, 1.0F, 12, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  367 */     this.gunModel[30].setRotationPoint(29.5F, -3.0F, -4.5F);
/*      */     
/*  369 */     this.gunModel[31].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 6, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  370 */     this.gunModel[31].setRotationPoint(29.5F, 1.0F, -4.5F);
/*      */     
/*  372 */     this.gunModel[32].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 6, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  373 */     this.gunModel[32].setRotationPoint(31.5F, 1.0F, -4.5F);
/*      */     
/*  375 */     this.gunModel[33].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 6, 0.0F, 0.0F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  376 */     this.gunModel[33].setRotationPoint(33.5F, 1.0F, -4.5F);
/*      */     
/*  378 */     this.gunModel[34].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 4, 8, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/*  379 */     this.gunModel[34].setRotationPoint(37.5F, -3.0F, -5.5F);
/*      */     
/*  381 */     this.gunModel[35].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 8, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/*  382 */     this.gunModel[35].setRotationPoint(37.5F, 0.0F, -5.5F);
/*      */     
/*  384 */     this.gunModel[36].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 4, 8, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/*  385 */     this.gunModel[36].setRotationPoint(15.25F, -3.0F, -5.5F);
/*      */     
/*  387 */     this.gunModel[37].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 8, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/*  388 */     this.gunModel[37].setRotationPoint(15.25F, 0.0F, -5.5F);
/*      */     
/*  390 */     this.gunModel[38].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 3, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/*  391 */     this.gunModel[38].setRotationPoint(13.25F, -3.0F, -4.5F);
/*      */     
/*  393 */     this.gunModel[39].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 1, 6, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F);
/*  394 */     this.gunModel[39].setRotationPoint(13.25F, 0.0F, -4.5F);
/*      */     
/*  396 */     this.gunModel[40].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 4, 4, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  397 */     this.gunModel[40].setRotationPoint(15.25F, 1.5F, -3.5F);
/*      */     
/*  399 */     this.gunModel[41].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 1, 4, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  400 */     this.gunModel[41].setRotationPoint(15.25F, 5.5F, -3.5F);
/*      */     
/*  402 */     this.gunModel[42].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 4, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -2.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F);
/*  403 */     this.gunModel[42].setRotationPoint(16.25F, 6.5F, -3.5F);
/*      */     
/*  405 */     this.gunModel[43].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  406 */     this.gunModel[43].setRotationPoint(14.25F, 4.5F, -3.5F);
/*      */     
/*  408 */     this.gunModel[44].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 3, 3, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  409 */     this.gunModel[44].setRotationPoint(30.25F, 2.5F, -3.0F);
/*      */     
/*  411 */     this.gunModel[45].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 3, 3, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  412 */     this.gunModel[45].setRotationPoint(30.25F, 5.0F, -3.0F);
/*      */     
/*  414 */     this.gunModel[46].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 1, 3, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  415 */     this.gunModel[46].setRotationPoint(30.25F, 8.0F, -3.0F);
/*      */     
/*  417 */     this.gunModel[47].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 3, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  418 */     this.gunModel[47].setRotationPoint(32.25F, 7.0F, -3.0F);
/*      */     
/*  420 */     this.gunModel[48].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 3, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  421 */     this.gunModel[48].setRotationPoint(33.25F, 8.0F, -3.0F);
/*      */     
/*  423 */     this.gunModel[49].addShapeBox(-25.0F, -16.0F, 1.0F, 17, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  424 */     this.gunModel[49].setRotationPoint(20.5F, -11.0F, 1.5F);
/*      */     
/*  426 */     this.gunModel[50].addShapeBox(-25.0F, -16.0F, 1.0F, 17, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  427 */     this.gunModel[50].setRotationPoint(20.5F, -13.0F, 1.5F);
/*      */     
/*  429 */     this.gunModel[51].addShapeBox(-25.0F, -16.0F, 1.0F, 17, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  430 */     this.gunModel[51].setRotationPoint(20.5F, -5.0F, 1.5F);
/*      */     
/*  432 */     this.gunModel[52].addShapeBox(-25.0F, -16.0F, 1.0F, 17, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  433 */     this.gunModel[52].setRotationPoint(20.5F, -13.0F, -4.5F);
/*      */     
/*  435 */     this.gunModel[53].addShapeBox(-25.0F, -16.0F, 1.0F, 17, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  436 */     this.gunModel[53].setRotationPoint(20.5F, -5.0F, -6.5F);
/*      */     
/*  438 */     this.gunModel[54].addShapeBox(-25.0F, -16.0F, 1.0F, 17, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  439 */     this.gunModel[54].setRotationPoint(20.5F, -11.0F, -6.5F);
/*      */     
/*  441 */     this.gunModel[55].addShapeBox(-25.0F, -16.0F, 1.0F, 17, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  442 */     this.gunModel[55].setRotationPoint(20.5F, -13.0F, -6.5F);
/*      */     
/*  444 */     this.gunModel[56].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  445 */     this.gunModel[56].setRotationPoint(-11.5F, 13.0F, -3.5F);
/*      */     
/*  447 */     this.gunModel[57].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 10, 6, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  448 */     this.gunModel[57].setRotationPoint(37.5F, -13.0F, -4.5F);
/*      */     
/*  450 */     this.gunModel[58].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  451 */     this.gunModel[58].setRotationPoint(37.5F, -13.25F, 1.75F);
/*      */     
/*  453 */     this.gunModel[59].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  454 */     this.gunModel[59].setRotationPoint(37.5F, -11.5F, 1.75F);
/*      */     
/*  456 */     this.gunModel[60].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  457 */     this.gunModel[60].setRotationPoint(37.5F, -4.75F, 1.75F);
/*      */     
/*  459 */     this.gunModel[61].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  460 */     this.gunModel[61].setRotationPoint(37.5F, -4.75F, -6.75F);
/*      */     
/*  462 */     this.gunModel[62].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  463 */     this.gunModel[62].setRotationPoint(37.5F, -11.5F, -6.75F);
/*      */     
/*  465 */     this.gunModel[63].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  466 */     this.gunModel[63].setRotationPoint(37.5F, -13.25F, -6.75F);
/*      */     
/*  468 */     this.gunModel[64].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  469 */     this.gunModel[64].setRotationPoint(13.5F, -11.5F, -6.75F);
/*      */     
/*  471 */     this.gunModel[65].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  472 */     this.gunModel[65].setRotationPoint(13.5F, -4.75F, -6.75F);
/*      */     
/*  474 */     this.gunModel[66].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  475 */     this.gunModel[66].setRotationPoint(13.5F, -11.5F, 1.75F);
/*      */     
/*  477 */     this.gunModel[67].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  478 */     this.gunModel[67].setRotationPoint(13.5F, -13.25F, 1.75F);
/*      */     
/*  480 */     this.gunModel[68].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 10, 6, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  481 */     this.gunModel[68].setRotationPoint(13.5F, -13.0F, -4.5F);
/*      */     
/*  483 */     this.gunModel[69].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  484 */     this.gunModel[69].setRotationPoint(13.5F, -13.25F, -6.75F);
/*      */     
/*  486 */     this.gunModel[70].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  487 */     this.gunModel[70].setRotationPoint(13.5F, -4.75F, 1.75F);
/*      */     
/*  489 */     this.gunModel[71].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  490 */     this.gunModel[71].setRotationPoint(42.5F, -5.0F, 1.5F);
/*      */     
/*  492 */     this.gunModel[72].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  493 */     this.gunModel[72].setRotationPoint(42.5F, -11.0F, 1.5F);
/*      */     
/*  495 */     this.gunModel[73].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  496 */     this.gunModel[73].setRotationPoint(42.5F, -13.0F, 1.5F);
/*      */     
/*  498 */     this.gunModel[74].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  499 */     this.gunModel[74].setRotationPoint(42.5F, -13.0F, -4.5F);
/*      */     
/*  501 */     this.gunModel[75].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  502 */     this.gunModel[75].setRotationPoint(42.5F, -13.0F, -6.5F);
/*      */     
/*  504 */     this.gunModel[76].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  505 */     this.gunModel[76].setRotationPoint(42.5F, -11.0F, -6.5F);
/*      */     
/*  507 */     this.gunModel[77].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  508 */     this.gunModel[77].setRotationPoint(42.5F, -5.0F, -6.5F);
/*      */     
/*  510 */     this.gunModel[78].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  511 */     this.gunModel[78].setRotationPoint(52.5F, -4.75F, 1.75F);
/*      */     
/*  513 */     this.gunModel[79].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  514 */     this.gunModel[79].setRotationPoint(52.5F, -11.5F, 1.75F);
/*      */     
/*  516 */     this.gunModel[80].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  517 */     this.gunModel[80].setRotationPoint(52.5F, -13.25F, 1.75F);
/*      */     
/*  519 */     this.gunModel[81].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 10, 6, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  520 */     this.gunModel[81].setRotationPoint(52.5F, -13.0F, -4.5F);
/*      */     
/*  522 */     this.gunModel[82].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  523 */     this.gunModel[82].setRotationPoint(52.5F, -13.25F, -6.75F);
/*      */     
/*  525 */     this.gunModel[83].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  526 */     this.gunModel[83].setRotationPoint(52.5F, -11.5F, -6.75F);
/*      */     
/*  528 */     this.gunModel[84].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  529 */     this.gunModel[84].setRotationPoint(52.5F, -4.75F, -6.75F);
/*      */     
/*  531 */     this.gunModel[85].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  532 */     this.gunModel[85].setRotationPoint(57.5F, -11.0F, -6.5F);
/*      */     
/*  534 */     this.gunModel[86].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  535 */     this.gunModel[86].setRotationPoint(57.5F, -5.0F, -6.5F);
/*      */     
/*  537 */     this.gunModel[87].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  538 */     this.gunModel[87].setRotationPoint(57.5F, -13.0F, -4.5F);
/*      */     
/*  540 */     this.gunModel[88].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  541 */     this.gunModel[88].setRotationPoint(57.5F, -5.0F, 1.5F);
/*      */     
/*  543 */     this.gunModel[89].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  544 */     this.gunModel[89].setRotationPoint(57.5F, -11.0F, 1.5F);
/*      */     
/*  546 */     this.gunModel[90].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  547 */     this.gunModel[90].setRotationPoint(57.5F, -13.0F, 1.5F);
/*      */     
/*  549 */     this.gunModel[91].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  550 */     this.gunModel[91].setRotationPoint(57.5F, -13.0F, -6.5F);
/*      */     
/*  552 */     this.gunModel[92].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  553 */     this.gunModel[92].setRotationPoint(63.5F, -4.75F, 1.75F);
/*      */     
/*  555 */     this.gunModel[93].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  556 */     this.gunModel[93].setRotationPoint(63.5F, -11.5F, 1.75F);
/*      */     
/*  558 */     this.gunModel[94].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  559 */     this.gunModel[94].setRotationPoint(63.5F, -13.25F, 1.75F);
/*      */     
/*  561 */     this.gunModel[95].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 10, 6, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  562 */     this.gunModel[95].setRotationPoint(63.5F, -13.0F, -4.5F);
/*      */     
/*  564 */     this.gunModel[96].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  565 */     this.gunModel[96].setRotationPoint(63.5F, -13.25F, -6.75F);
/*      */     
/*  567 */     this.gunModel[97].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  568 */     this.gunModel[97].setRotationPoint(63.5F, -11.5F, -6.75F);
/*      */     
/*  570 */     this.gunModel[98].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[98].setRotationPoint(63.5F, -4.75F, -6.75F);
/*      */     
/*  573 */     this.gunModel[99].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  574 */     this.gunModel[99].setRotationPoint(67.5F, -11.0F, -6.5F);
/*      */     
/*  576 */     this.gunModel[100].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  577 */     this.gunModel[100].setRotationPoint(67.5F, -5.0F, -6.5F);
/*      */     
/*  579 */     this.gunModel[101].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  580 */     this.gunModel[101].setRotationPoint(67.5F, -13.0F, -4.5F);
/*      */     
/*  582 */     this.gunModel[102].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  583 */     this.gunModel[102].setRotationPoint(67.5F, -5.0F, 1.5F);
/*      */     
/*  585 */     this.gunModel[103].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  586 */     this.gunModel[103].setRotationPoint(67.5F, -11.0F, 1.5F);
/*      */     
/*  588 */     this.gunModel[104].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  589 */     this.gunModel[104].setRotationPoint(67.5F, -13.0F, 1.5F);
/*      */     
/*  591 */     this.gunModel[105].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 2.75F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  592 */     this.gunModel[105].setRotationPoint(9.5F, -13.25F, -6.75F);
/*      */     
/*  594 */     this.gunModel[106].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 7, 2, 0.0F, 0.0F, -0.25F, 3.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 3.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  595 */     this.gunModel[106].setRotationPoint(9.5F, -11.5F, -6.75F);
/*      */     
/*  597 */     this.gunModel[107].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, 0.0F);
/*  598 */     this.gunModel[107].setRotationPoint(9.5F, -4.75F, -6.75F);
/*      */     
/*  600 */     this.gunModel[108].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 2.75F, 0.5F);
/*  601 */     this.gunModel[108].setRotationPoint(9.5F, -4.75F, -4.75F);
/*      */     
/*  603 */     this.gunModel[109].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 7, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 3.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 3.5F);
/*  604 */     this.gunModel[109].setRotationPoint(9.5F, -11.5F, 1.75F);
/*      */     
/*  606 */     this.gunModel[110].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.75F, -2.0F);
/*  607 */     this.gunModel[110].setRotationPoint(9.5F, -4.75F, 1.75F);
/*      */     
/*  609 */     this.gunModel[111].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.75F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F);
/*  610 */     this.gunModel[111].setRotationPoint(9.5F, -13.25F, 1.75F);
/*      */     
/*  612 */     this.gunModel[112].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 6, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 2.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  613 */     this.gunModel[112].setRotationPoint(9.5F, -13.25F, -4.75F);
/*      */     
/*  615 */     this.gunModel[113].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 6, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  616 */     this.gunModel[113].setRotationPoint(9.5F, -10.75F, -4.75F);
/*      */     
/*  618 */     this.gunModel[114].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 7, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F);
/*  619 */     this.gunModel[114].setRotationPoint(-16.5F, -11.5F, 1.75F);
/*      */     
/*  621 */     this.gunModel[115].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 7, 3, 0.0F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  622 */     this.gunModel[115].setRotationPoint(-16.5F, -11.5F, -7.75F);
/*      */     
/*  624 */     this.gunModel[116].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 15, 7, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[116].setRotationPoint(-16.5F, -15.0F, -5.25F);
/*      */     
/*  627 */     this.gunModel[117].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 2.75F, -2.0F, 0.0F, 2.75F, -2.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  628 */     this.gunModel[117].setRotationPoint(-16.5F, -13.25F, -6.75F);
/*      */     
/*  630 */     this.gunModel[118].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, -2.0F, 0.0F, 2.75F, -2.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F);
/*  631 */     this.gunModel[118].setRotationPoint(-16.5F, -4.75F, -6.75F);
/*      */     
/*  633 */     this.gunModel[119].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, -2.0F, 0.0F, 2.75F, -2.0F);
/*  634 */     this.gunModel[119].setRotationPoint(-16.5F, -4.75F, 1.75F);
/*      */     
/*  636 */     this.gunModel[120].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, -2.0F, 0.0F, 2.75F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F);
/*  637 */     this.gunModel[120].setRotationPoint(-16.5F, -13.25F, 1.75F);
/*      */     
/*  639 */     this.gunModel[121].addBox(-25.0F, -16.0F, 1.0F, 10, 2, 3, 0.0F);
/*  640 */     this.gunModel[121].setRotationPoint(-16.0F, -1.0F, -3.0F);
/*      */     
/*  642 */     this.gunModel[122].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 7, 3, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F);
/*  643 */     this.gunModel[122].setRotationPoint(-18.5F, -11.5F, 1.75F);
/*      */     
/*  645 */     this.gunModel[123].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F);
/*  646 */     this.gunModel[123].setRotationPoint(-18.5F, -11.5F, -10.75F);
/*      */     
/*  648 */     this.gunModel[124].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 17, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  649 */     this.gunModel[124].setRotationPoint(-18.5F, -16.5F, -4.75F);
/*      */     
/*  651 */     this.gunModel[125].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 7, 3, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F);
/*  652 */     this.gunModel[125].setRotationPoint(-21.5F, -11.5F, 1.75F);
/*      */     
/*  654 */     this.gunModel[126].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 17, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  655 */     this.gunModel[126].setRotationPoint(-21.5F, -16.5F, -4.75F);
/*      */     
/*  657 */     this.gunModel[127].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F);
/*  658 */     this.gunModel[127].setRotationPoint(-21.5F, -11.5F, -10.75F);
/*      */     
/*  660 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 7, 3, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F);
/*  661 */     this.gunModel[''].setRotationPoint(-23.5F, -11.5F, 1.75F);
/*      */     
/*  663 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 17, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  664 */     this.gunModel[''].setRotationPoint(-23.5F, -16.5F, -4.75F);
/*      */     
/*  666 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F);
/*  667 */     this.gunModel[''].setRotationPoint(-23.5F, -11.5F, -10.75F);
/*      */     
/*  669 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 41, 7, 3, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.0F, 0.25F, 3.0F);
/*  670 */     this.gunModel[''].setRotationPoint(-64.5F, -11.5F, 1.75F);
/*      */     
/*  672 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 41, 17, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  673 */     this.gunModel[''].setRotationPoint(-64.5F, -16.5F, -4.75F);
/*      */     
/*  675 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 41, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, 5.0F, 3.0F);
/*  676 */     this.gunModel[''].setRotationPoint(-64.5F, -11.5F, -10.75F);
/*      */     
/*  678 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 17, 7, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.5F, -0.5F);
/*  679 */     this.gunModel[''].setRotationPoint(-74.5F, -16.5F, -4.75F);
/*      */     
/*  681 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 17, 6, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -6.0F, -2.5F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -6.0F, -2.5F);
/*  682 */     this.gunModel[''].setRotationPoint(-74.5F, -16.5F, 1.75F);
/*      */     
/*  684 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  685 */     this.gunModel[''].setRotationPoint(-80.5F, -10.5F, -8.25F);
/*      */     
/*  687 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 17, 6, 0.0F, 0.0F, -6.0F, -2.5F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -6.0F, -2.5F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  688 */     this.gunModel[''].setRotationPoint(-74.5F, -16.5F, -10.75F);
/*      */     
/*  690 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 5, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, 4.0F);
/*  691 */     this.gunModel[''].setRotationPoint(-80.5F, -14.5F, -4.75F);
/*      */     
/*  693 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 6, 5, 6, 0.0F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, 4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  694 */     this.gunModel[''].setRotationPoint(-80.5F, -6.5F, -4.75F);
/*      */     
/*  696 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 5, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F);
/*  697 */     this.gunModel[''].setRotationPoint(-83.5F, -10.5F, -8.25F);
/*      */     
/*  699 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 5, 6, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 4.25F, 0.0F, -1.0F, 4.25F);
/*  700 */     this.gunModel[''].setRotationPoint(-83.5F, -14.75F, -4.75F);
/*      */     
/*  702 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 5, 6, 0.0F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 4.25F, 0.0F, -1.0F, 4.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/*  703 */     this.gunModel[''].setRotationPoint(-83.5F, -6.25F, -4.75F);
/*      */     
/*  705 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  706 */     this.gunModel[''].setRotationPoint(-83.5F, -17.25F, -2.5F);
/*      */     
/*  708 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  709 */     this.gunModel[''].setRotationPoint(-82.5F, -16.25F, -3.0F);
/*      */     
/*  711 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[''].setRotationPoint(-23.0F, -18.25F, -3.0F);
/*      */     
/*  714 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  715 */     this.gunModel[''].setRotationPoint(-23.5F, -19.25F, -2.5F);
/*      */     
/*  717 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 5, 6, 0.0F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, 4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  718 */     this.gunModel[''].setRotationPoint(-114.5F, -6.5F, -4.75F);
/*      */     
/*  720 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  721 */     this.gunModel[''].setRotationPoint(-114.5F, -10.5F, -8.25F);
/*      */     
/*  723 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 5, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, 4.0F);
/*  724 */     this.gunModel[''].setRotationPoint(-114.5F, -14.5F, -4.75F);
/*      */     
/*  726 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 6, 0.0F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 4.25F, 0.0F, -1.0F, 4.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/*  727 */     this.gunModel[''].setRotationPoint(-116.5F, -6.25F, -4.75F);
/*      */     
/*  729 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F);
/*  730 */     this.gunModel[''].setRotationPoint(-116.5F, -10.5F, -8.25F);
/*      */     
/*  732 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 6, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 4.25F, 0.0F, -1.0F, 4.25F);
/*  733 */     this.gunModel[''].setRotationPoint(-116.5F, -14.75F, -4.75F);
/*      */     
/*  735 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  736 */     this.gunModel[''].setRotationPoint(-116.5F, -17.25F, -2.5F);
/*      */     
/*  738 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  739 */     this.gunModel[''].setRotationPoint(-116.0F, -16.25F, -3.0F);
/*      */     
/*  741 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 6, 0.0F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, 4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  742 */     this.gunModel[''].setRotationPoint(-118.5F, -6.5F, -4.75F);
/*      */     
/*  744 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  745 */     this.gunModel[''].setRotationPoint(-118.5F, -10.5F, -8.25F);
/*      */     
/*  747 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, 4.0F);
/*  748 */     this.gunModel[''].setRotationPoint(-118.5F, -14.5F, -4.75F);
/*      */     
/*  750 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 36, 5, 13, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.5F, 2.0F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.5F, 2.0F);
/*  751 */     this.gunModel[''].setRotationPoint(-154.5F, -10.5F, -8.25F);
/*      */     
/*  753 */     this.gunModel[''].addShapeBox(-25.0F, -16.0F, 1.0F, 36, 5, 6, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 1.5F, 2.0F, 0.0F, -2.5F, 5.0F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -2.5F, 5.5F);
/*  754 */     this.gunModel[''].setRotationPoint(-154.5F, -14.5F, -4.75F);
/*      */     
/*  756 */     this.gunModel[' '].addShapeBox(-25.0F, -16.0F, 1.0F, 36, 5, 6, 0.0F, 0.0F, -2.5F, 5.0F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 4.0F, 0.0F, -2.5F, 5.5F, 0.0F, 1.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 1.5F, 2.0F);
/*  757 */     this.gunModel[' '].setRotationPoint(-154.5F, -6.5F, -4.75F);
/*      */     
/*  759 */     this.gunModel['¡'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 6, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.5F, 2.0F, 0.0F, -0.5F, 7.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 7.0F);
/*  760 */     this.gunModel['¡'].setRotationPoint(-156.5F, -16.5F, -4.75F);
/*      */     
/*  762 */     this.gunModel['¢'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 6, 0.0F, 0.0F, -0.5F, 7.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 7.0F, 0.0F, 1.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.5F, 2.0F);
/*  763 */     this.gunModel['¢'].setRotationPoint(-156.5F, -4.5F, -4.75F);
/*      */     
/*  765 */     this.gunModel['£'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 7, 6, 0.0F, 0.0F, -0.5F, 7.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 7.0F, 0.0F, 1.5F, 7.0F, 0.0F, 1.5F, 5.0F, 0.0F, 1.5F, 5.5F, 0.0F, 1.5F, 7.0F);
/*  766 */     this.gunModel['£'].setRotationPoint(-156.5F, -12.5F, -4.75F);
/*      */     
/*  768 */     this.gunModel['¤'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 7, 9, 0.0F, 0.0F, -0.5F, 7.0F, 0.0F, -0.5F, 5.0F, 0.0F, -0.5F, 6.0F, 0.0F, -0.5F, 7.5F, 0.0F, 1.5F, 7.0F, 0.0F, 1.5F, 5.0F, 0.0F, 1.5F, 6.0F, 0.0F, 1.5F, 7.5F);
/*  769 */     this.gunModel['¤'].setRotationPoint(-158.5F, -12.5F, -6.75F);
/*      */     
/*  771 */     this.gunModel['¥'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 9, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.5F, 7.0F, 0.0F, 1.5F, 5.0F, 0.0F, 1.5F, 6.0F, 0.0F, 1.5F, 7.5F);
/*  772 */     this.gunModel['¥'].setRotationPoint(-158.5F, -18.5F, -6.75F);
/*      */     
/*  774 */     this.gunModel['¦'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 5, 9, 0.0F, 0.0F, 1.5F, 7.0F, 0.0F, 1.5F, 5.0F, 0.0F, 1.5F, 6.0F, 0.0F, 1.5F, 7.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  775 */     this.gunModel['¦'].setRotationPoint(-158.5F, -2.5F, -6.75F);
/*      */     
/*  777 */     this.gunModel['§'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 17, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  778 */     this.gunModel['§'].setRotationPoint(-160.5F, -17.0F, -14.75F);
/*      */     
/*  780 */     this.gunModel['¨'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 4, 25, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  781 */     this.gunModel['¨'].setRotationPoint(-160.5F, -21.0F, -14.75F);
/*      */     
/*  783 */     this.gunModel['©'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 4, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/*  784 */     this.gunModel['©'].setRotationPoint(-160.5F, 0.0F, -14.75F);
/*      */     
/*  786 */     this.gunModel['ª'].addShapeBox(-25.0F, -16.0F, 1.0F, 15, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  787 */     this.gunModel['ª'].setRotationPoint(-7.5F, -5.5F, 7.25F);
/*      */     
/*  789 */     this.gunModel['«'].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  790 */     this.gunModel['«'].setRotationPoint(3.5F, -5.0F, 3.25F);
/*      */     
/*  792 */     this.gunModel['¬'].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  793 */     this.gunModel['¬'].setRotationPoint(-7.5F, -5.0F, 3.25F);
/*      */     
/*  795 */     this.gunModel['­'].addShapeBox(-25.0F, -16.0F, 1.0F, 15, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  796 */     this.gunModel['­'].setRotationPoint(-7.5F, -2.5F, 7.25F);
/*      */     
/*  798 */     this.gunModel['®'].addShapeBox(-25.0F, -16.0F, 1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  799 */     this.gunModel['®'].setRotationPoint(-2.5F, -4.0F, 7.25F);
/*      */     
/*  801 */     this.gunModel['¯'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  802 */     this.gunModel['¯'].setRotationPoint(5.5F, -4.0F, 7.25F);
/*      */     
/*  804 */     this.gunModel['°'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  805 */     this.gunModel['°'].setRotationPoint(-7.5F, -4.0F, 7.25F);
/*      */     
/*  807 */     this.gunModel['±'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  808 */     this.gunModel['±'].setRotationPoint(67.5F, -13.0F, -6.5F);
/*      */     
/*  810 */     this.gunModel['²'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 6, 9, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  811 */     this.gunModel['²'].setRotationPoint(70.5F, -11.0F, -5.5F);
/*      */     
/*  813 */     this.gunModel['³'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  814 */     this.gunModel['³'].setRotationPoint(70.5F, -12.5F, 1.5F);
/*      */     
/*  816 */     this.gunModel['´'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F);
/*  817 */     this.gunModel['´'].setRotationPoint(70.5F, -5.5F, 1.5F);
/*      */     
/*  819 */     this.gunModel['µ'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  820 */     this.gunModel['µ'].setRotationPoint(70.5F, -12.5F, -6.0F);
/*      */     
/*  822 */     this.gunModel['¶'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  823 */     this.gunModel['¶'].setRotationPoint(70.5F, -5.5F, -6.0F);
/*      */     
/*  825 */     this.gunModel['·'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 5, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel['·'].setRotationPoint(70.5F, -5.5F, -3.5F);
/*      */     
/*  828 */     this.gunModel['¸'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 5, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  829 */     this.gunModel['¸'].setRotationPoint(70.5F, -12.75F, -3.5F);
/*      */     
/*  831 */     this.gunModel['¹'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  832 */     this.gunModel['¹'].setRotationPoint(53.5F, -13.5F, 1.75F);
/*      */     
/*  834 */     this.gunModel['º'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  835 */     this.gunModel['º'].setRotationPoint(64.0F, -13.5F, 1.75F);
/*      */     
/*  837 */     this.gunModel['»'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F);
/*  838 */     this.gunModel['»'].setRotationPoint(53.5F, -14.5F, 1.75F);
/*      */     
/*  840 */     this.gunModel['¼'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F);
/*  841 */     this.gunModel['¼'].setRotationPoint(64.0F, -14.5F, 1.75F);
/*      */     
/*  843 */     this.gunModel['½'].addShapeBox(-25.0F, -16.0F, 1.0F, 14, 1, 6, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  844 */     this.gunModel['½'].setRotationPoint(53.0F, -15.25F, -0.25F);
/*      */     
/*  846 */     this.gunModel['¾'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 4, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  847 */     this.gunModel['¾'].setRotationPoint(53.5F, -18.25F, 4.75F);
/*      */     
/*  849 */     this.gunModel['¿'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 4, 1, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  850 */     this.gunModel['¿'].setRotationPoint(64.0F, -18.25F, 4.75F);
/*      */     
/*  852 */     this.gunModel['À'].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  853 */     this.gunModel['À'].setRotationPoint(57.0F, -15.25F, 4.75F);
/*      */     
/*  855 */     this.gunModel['Á'].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  856 */     this.gunModel['Á'].setRotationPoint(57.0F, -18.25F, 4.75F);
/*      */     
/*  858 */     this.gunModel['Â'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  859 */     this.gunModel['Â'].setRotationPoint(59.5F, -17.0F, 4.75F);
/*      */     
/*  861 */     this.gunModel['Ã'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  862 */     this.gunModel['Ã'].setRotationPoint(58.0F, -17.0F, 4.75F);
/*      */     
/*  864 */     this.gunModel['Ä'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  865 */     this.gunModel['Ä'].setRotationPoint(58.0F, -16.0F, 4.75F);
/*      */     
/*  867 */     this.gunModel['Å'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  868 */     this.gunModel['Å'].setRotationPoint(57.0F, -16.0F, 4.75F);
/*      */     
/*  870 */     this.gunModel['Æ'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  871 */     this.gunModel['Æ'].setRotationPoint(57.0F, -17.0F, 4.75F);
/*      */     
/*  873 */     this.gunModel['Ç'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  874 */     this.gunModel['Ç'].setRotationPoint(62.5F, -17.0F, 4.75F);
/*      */     
/*  876 */     this.gunModel['È'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  877 */     this.gunModel['È'].setRotationPoint(62.5F, -16.0F, 4.75F);
/*      */     
/*  879 */     this.gunModel['É'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  880 */     this.gunModel['É'].setRotationPoint(61.5F, -16.0F, 4.75F);
/*      */     
/*  882 */     this.gunModel['Ê'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  883 */     this.gunModel['Ê'].setRotationPoint(61.5F, -17.0F, 4.75F);
/*      */     
/*  885 */     this.gunModel['Ë'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel['Ë'].setRotationPoint(56.5F, -17.0F, 4.75F);
/*      */     
/*  888 */     this.gunModel['Ì'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  889 */     this.gunModel['Ì'].setRotationPoint(56.5F, -17.0F, 4.75F);
/*      */     
/*  891 */     this.gunModel['Í'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  892 */     this.gunModel['Í'].setRotationPoint(61.0F, -17.0F, 4.75F);
/*      */     
/*  894 */     this.gunModel['Î'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 4, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  895 */     this.gunModel['Î'].setRotationPoint(53.5F, -18.25F, -0.25F);
/*      */     
/*  897 */     this.gunModel['Ï'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 4, 1, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  898 */     this.gunModel['Ï'].setRotationPoint(64.0F, -18.25F, -0.25F);
/*      */     
/*  900 */     this.gunModel['Ð'].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  901 */     this.gunModel['Ð'].setRotationPoint(57.0F, -15.25F, -0.25F);
/*      */     
/*  903 */     this.gunModel['Ñ'].addShapeBox(-25.0F, -16.0F, 1.0F, 7, 1, 1, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  904 */     this.gunModel['Ñ'].setRotationPoint(57.0F, -18.25F, -0.25F);
/*      */     
/*  906 */     this.gunModel['Ò'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  907 */     this.gunModel['Ò'].setRotationPoint(59.5F, -17.0F, -0.25F);
/*      */     
/*  909 */     this.gunModel['Ó'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  910 */     this.gunModel['Ó'].setRotationPoint(58.0F, -17.0F, -0.25F);
/*      */     
/*  912 */     this.gunModel['Ô'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  913 */     this.gunModel['Ô'].setRotationPoint(58.0F, -16.0F, -0.25F);
/*      */     
/*  915 */     this.gunModel['Õ'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  916 */     this.gunModel['Õ'].setRotationPoint(57.0F, -16.0F, -0.25F);
/*      */     
/*  918 */     this.gunModel['Ö'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  919 */     this.gunModel['Ö'].setRotationPoint(57.0F, -17.0F, -0.25F);
/*      */     
/*  921 */     this.gunModel['×'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  922 */     this.gunModel['×'].setRotationPoint(62.5F, -17.0F, -0.25F);
/*      */     
/*  924 */     this.gunModel['Ø'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  925 */     this.gunModel['Ø'].setRotationPoint(62.5F, -16.0F, -0.25F);
/*      */     
/*  927 */     this.gunModel['Ù'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  928 */     this.gunModel['Ù'].setRotationPoint(61.5F, -16.0F, -0.25F);
/*      */     
/*  930 */     this.gunModel['Ú'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  931 */     this.gunModel['Ú'].setRotationPoint(61.5F, -17.0F, -0.25F);
/*      */     
/*  933 */     this.gunModel['Û'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  934 */     this.gunModel['Û'].setRotationPoint(56.5F, -17.0F, -0.25F);
/*      */     
/*  936 */     this.gunModel['Ü'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  937 */     this.gunModel['Ü'].setRotationPoint(56.5F, -17.0F, -0.25F);
/*      */     
/*  939 */     this.gunModel['Ý'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  940 */     this.gunModel['Ý'].setRotationPoint(61.0F, -17.0F, -0.25F);
/*      */     
/*  942 */     this.gunModel['Þ'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 8, 3, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  943 */     this.gunModel['Þ'].setRotationPoint(64.0F, -22.25F, 1.25F);
/*      */     
/*  945 */     this.gunModel['ß'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F);
/*  946 */     this.gunModel['ß'].setRotationPoint(64.0F, -25.0F, 1.25F);
/*      */     
/*  948 */     this.gunModel['à'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  949 */     this.gunModel['à'].setRotationPoint(64.0F, -25.0F, 3.25F);
/*      */     
/*  951 */     this.gunModel['á'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 3, 0.0F, -0.5F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, -0.5F, -0.75F, -1.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/*  952 */     this.gunModel['á'].setRotationPoint(64.0F, -26.75F, 1.25F);
/*      */     
/*  954 */     this.gunModel['â'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  955 */     this.gunModel['â'].setRotationPoint(64.0F, -25.0F, 2.25F);
/*      */     
/*  957 */     this.gunModel['ã'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 6, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  958 */     this.gunModel['ã'].setRotationPoint(-11.0F, -22.25F, 1.25F);
/*      */     
/*  960 */     this.gunModel['ä'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  961 */     this.gunModel['ä'].setRotationPoint(-10.0F, -25.0F, 3.25F);
/*      */     
/*  963 */     this.gunModel['å'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  964 */     this.gunModel['å'].setRotationPoint(-10.0F, -25.0F, 1.25F);
/*      */     
/*  966 */     this.gunModel['æ'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  967 */     this.gunModel['æ'].setRotationPoint(-10.0F, -26.0F, 1.25F);
/*      */     
/*  969 */     this.gunModel['ç'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 3, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  970 */     this.gunModel['ç'].setRotationPoint(-10.0F, -21.25F, 0.75F);
/*      */     
/*  972 */     this.gunModel['è'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/*  973 */     this.gunModel['è'].setRotationPoint(-11.0F, -21.25F, 0.75F);
/*      */     
/*  975 */     this.gunModel['é'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/*  976 */     this.gunModel['é'].setRotationPoint(-11.0F, -21.25F, 4.25F);
/*      */     
/*  978 */     this.gunModel['ê'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  979 */     this.gunModel['ê'].setRotationPoint(-10.5F, -20.75F, -0.25F);
/*      */     
/*  981 */     this.gunModel['ë'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  982 */     this.gunModel['ë'].setRotationPoint(-11.0F, -23.25F, 1.25F);
/*      */     
/*  984 */     this.gunModel['ì'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  985 */     this.gunModel['ì'].setRotationPoint(-11.0F, -23.25F, 3.25F);
/*      */     
/*  987 */     this.gunModel['í'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  988 */     this.gunModel['í'].setRotationPoint(-10.5F, -21.25F, -0.25F);
/*      */     
/*  990 */     this.gunModel['î'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  991 */     this.gunModel['î'].setRotationPoint(-10.5F, -20.25F, -0.25F);
/*      */     
/*  993 */     this.gunModel['ï'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 6, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/*  994 */     this.gunModel['ï'].setRotationPoint(-10.0F, -20.75F, -0.25F);
/*      */     
/*  996 */     this.gunModel['ð'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 1, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  997 */     this.gunModel['ð'].setRotationPoint(-11.0F, -20.75F, -0.25F);
/*      */     
/*  999 */     this.gunModel['ñ'].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 3, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F);
/* 1000 */     this.gunModel['ñ'].setRotationPoint(-12.0F, -16.25F, 1.25F);
/*      */     
/* 1002 */     this.gunModel['ò'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 3, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1003 */     this.gunModel['ò'].setRotationPoint(-10.0F, -19.25F, 1.25F);
/*      */     
/* 1005 */     this.gunModel['ó'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1006 */     this.gunModel['ó'].setRotationPoint(-12.0F, -18.5F, 4.25F);
/*      */     
/* 1008 */     this.gunModel['ô'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 0.0F);
/* 1009 */     this.gunModel['ô'].setRotationPoint(-10.0F, -18.5F, 4.25F);
/*      */     
/* 1011 */     this.gunModel['õ'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1012 */     this.gunModel['õ'].setRotationPoint(-9.0F, -18.5F, 5.25F);
/*      */     
/* 1014 */     this.gunModel['ö'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F);
/* 1015 */     this.gunModel['ö'].setRotationPoint(-6.0F, -18.5F, 5.25F);
/*      */     
/* 1017 */     this.gunModel['÷'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1018 */     this.gunModel['÷'].setRotationPoint(-4.0F, -18.5F, 4.25F);
/*      */     
/* 1020 */     this.gunModel['ø'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1021 */     this.gunModel['ø'].setRotationPoint(-12.0F, -18.5F, 0.25F);
/*      */     
/* 1023 */     this.gunModel['ù'].addShapeBox(-25.0F, -16.0F, 1.0F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1024 */     this.gunModel['ù'].setRotationPoint(-10.0F, -18.5F, 0.25F);
/*      */     
/* 1026 */     this.gunModel['ú'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel['ú'].setRotationPoint(-9.0F, -18.5F, -0.75F);
/*      */     
/* 1029 */     this.gunModel['û'].addShapeBox(-25.0F, -16.0F, 1.0F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/* 1030 */     this.gunModel['û'].setRotationPoint(-6.0F, -18.5F, -0.75F);
/*      */     
/* 1032 */     this.gunModel['ü'].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel['ü'].setRotationPoint(-4.0F, -18.5F, 0.25F);
/*      */     
/*      */ 
/* 1036 */     this.ammoModel = new ModelRendererTurbo[49];
/* 1037 */     this.ammoModel[0] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/* 1038 */     this.ammoModel[1] = new ModelRendererTurbo(this, 433, 129, this.textureX, this.textureY);
/* 1039 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 1040 */     this.ammoModel[3] = new ModelRendererTurbo(this, 33, 137, this.textureX, this.textureY);
/* 1041 */     this.ammoModel[4] = new ModelRendererTurbo(this, 169, 137, this.textureX, this.textureY);
/* 1042 */     this.ammoModel[5] = new ModelRendererTurbo(this, 225, 137, this.textureX, this.textureY);
/* 1043 */     this.ammoModel[6] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/* 1044 */     this.ammoModel[7] = new ModelRendererTurbo(this, 57, 145, this.textureX, this.textureY);
/* 1045 */     this.ammoModel[8] = new ModelRendererTurbo(this, 121, 145, this.textureX, this.textureY);
/* 1046 */     this.ammoModel[9] = new ModelRendererTurbo(this, 281, 145, this.textureX, this.textureY);
/* 1047 */     this.ammoModel[10] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 1048 */     this.ammoModel[11] = new ModelRendererTurbo(this, 65, 153, this.textureX, this.textureY);
/* 1049 */     this.ammoModel[12] = new ModelRendererTurbo(this, 129, 153, this.textureX, this.textureY);
/* 1050 */     this.ammoModel[13] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/* 1051 */     this.ammoModel[14] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/* 1052 */     this.ammoModel[15] = new ModelRendererTurbo(this, 41, 161, this.textureX, this.textureY);
/* 1053 */     this.ammoModel[16] = new ModelRendererTurbo(this, 81, 161, this.textureX, this.textureY);
/* 1054 */     this.ammoModel[17] = new ModelRendererTurbo(this, 185, 161, this.textureX, this.textureY);
/* 1055 */     this.ammoModel[18] = new ModelRendererTurbo(this, 273, 161, this.textureX, this.textureY);
/* 1056 */     this.ammoModel[19] = new ModelRendererTurbo(this, 409, 161, this.textureX, this.textureY);
/* 1057 */     this.ammoModel[20] = new ModelRendererTurbo(this, 449, 161, this.textureX, this.textureY);
/* 1058 */     this.ammoModel[21] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/* 1059 */     this.ammoModel[22] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/* 1060 */     this.ammoModel[23] = new ModelRendererTurbo(this, 185, 177, this.textureX, this.textureY);
/* 1061 */     this.ammoModel[24] = new ModelRendererTurbo(this, 265, 177, this.textureX, this.textureY);
/* 1062 */     this.ammoModel[25] = new ModelRendererTurbo(this, 345, 177, this.textureX, this.textureY);
/* 1063 */     this.ammoModel[26] = new ModelRendererTurbo(this, 73, 185, this.textureX, this.textureY);
/* 1064 */     this.ammoModel[27] = new ModelRendererTurbo(this, 153, 193, this.textureX, this.textureY);
/* 1065 */     this.ammoModel[28] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/* 1066 */     this.ammoModel[29] = new ModelRendererTurbo(this, 161, 65, this.textureX, this.textureY);
/* 1067 */     this.ammoModel[30] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 1068 */     this.ammoModel[31] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/* 1069 */     this.ammoModel[32] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/* 1070 */     this.ammoModel[33] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/* 1071 */     this.ammoModel[34] = new ModelRendererTurbo(this, 465, 129, this.textureX, this.textureY);
/* 1072 */     this.ammoModel[35] = new ModelRendererTurbo(this, 193, 145, this.textureX, this.textureY);
/* 1073 */     this.ammoModel[36] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/* 1074 */     this.ammoModel[37] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/* 1075 */     this.ammoModel[38] = new ModelRendererTurbo(this, 105, 97, this.textureX, this.textureY);
/* 1076 */     this.ammoModel[39] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/* 1077 */     this.ammoModel[40] = new ModelRendererTurbo(this, 153, 113, this.textureX, this.textureY);
/* 1078 */     this.ammoModel[41] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/* 1079 */     this.ammoModel[42] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/* 1080 */     this.ammoModel[43] = new ModelRendererTurbo(this, 305, 161, this.textureX, this.textureY);
/* 1081 */     this.ammoModel[44] = new ModelRendererTurbo(this, 481, 161, this.textureX, this.textureY);
/* 1082 */     this.ammoModel[45] = new ModelRendererTurbo(this, 225, 169, this.textureX, this.textureY);
/* 1083 */     this.ammoModel[46] = new ModelRendererTurbo(this, 313, 169, this.textureX, this.textureY);
/* 1084 */     this.ammoModel[47] = new ModelRendererTurbo(this, 73, 177, this.textureX, this.textureY);
/* 1085 */     this.ammoModel[48] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/*      */     
/* 1087 */     this.ammoModel[0].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1088 */     this.ammoModel[0].setRotationPoint(72.5F, -5.0F, 1.5F);
/*      */     
/* 1090 */     this.ammoModel[1].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1091 */     this.ammoModel[1].setRotationPoint(72.5F, -11.0F, 1.5F);
/*      */     
/* 1093 */     this.ammoModel[2].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1094 */     this.ammoModel[2].setRotationPoint(72.5F, -13.0F, 1.5F);
/*      */     
/* 1096 */     this.ammoModel[3].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1097 */     this.ammoModel[3].setRotationPoint(72.5F, -11.0F, -6.5F);
/*      */     
/* 1099 */     this.ammoModel[4].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1100 */     this.ammoModel[4].setRotationPoint(72.5F, -13.0F, -6.5F);
/*      */     
/* 1102 */     this.ammoModel[5].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1103 */     this.ammoModel[5].setRotationPoint(72.5F, -5.0F, -6.5F);
/*      */     
/* 1105 */     this.ammoModel[6].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1106 */     this.ammoModel[6].setRotationPoint(72.5F, -13.0F, -4.5F);
/*      */     
/* 1108 */     this.ammoModel[7].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F);
/* 1109 */     this.ammoModel[7].setRotationPoint(82.5F, -13.0F, 1.5F);
/*      */     
/* 1111 */     this.ammoModel[8].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1112 */     this.ammoModel[8].setRotationPoint(82.5F, -5.0F, 1.5F);
/*      */     
/* 1114 */     this.ammoModel[9].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F);
/* 1115 */     this.ammoModel[9].setRotationPoint(82.5F, -11.0F, 1.5F);
/*      */     
/* 1117 */     this.ammoModel[10].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 6.0F, -2.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1118 */     this.ammoModel[10].setRotationPoint(82.5F, -13.0F, -6.5F);
/*      */     
/* 1120 */     this.ammoModel[11].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 6.0F, -2.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1121 */     this.ammoModel[11].setRotationPoint(82.5F, -5.0F, -6.5F);
/*      */     
/* 1123 */     this.ammoModel[12].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1124 */     this.ammoModel[12].setRotationPoint(82.5F, -11.0F, -6.5F);
/*      */     
/* 1126 */     this.ammoModel[13].addShapeBox(-25.0F, -16.0F, 1.0F, 26, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1127 */     this.ammoModel[13].setRotationPoint(82.5F, -13.0F, -4.5F);
/*      */     
/* 1129 */     this.ammoModel[14].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1130 */     this.ammoModel[14].setRotationPoint(108.5F, -11.0F, 1.5F);
/*      */     
/* 1132 */     this.ammoModel[15].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1133 */     this.ammoModel[15].setRotationPoint(108.5F, -11.0F, -12.5F);
/*      */     
/* 1135 */     this.ammoModel[16].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 7, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1136 */     this.ammoModel[16].setRotationPoint(108.5F, -18.5F, 1.5F);
/*      */     
/* 1138 */     this.ammoModel[17].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 7, 8, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1139 */     this.ammoModel[17].setRotationPoint(108.5F, -18.5F, -12.5F);
/*      */     
/* 1141 */     this.ammoModel[18].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 7, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, -8.0F);
/* 1142 */     this.ammoModel[18].setRotationPoint(108.5F, -4.5F, 1.5F);
/*      */     
/* 1144 */     this.ammoModel[19].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 7, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1145 */     this.ammoModel[19].setRotationPoint(108.5F, -4.5F, -12.5F);
/*      */     
/* 1147 */     this.ammoModel[20].addShapeBox(-25.0F, -16.0F, 1.0F, 11, 22, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1148 */     this.ammoModel[20].setRotationPoint(108.5F, -19.0F, -4.5F);
/*      */     
/* 1150 */     this.ammoModel[21].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 7, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, -8.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F);
/* 1151 */     this.ammoModel[21].setRotationPoint(119.5F, -18.5F, 1.5F);
/*      */     
/* 1153 */     this.ammoModel[22].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 7, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, -8.0F, 0.0F, 0.5F, -8.0F);
/* 1154 */     this.ammoModel[22].setRotationPoint(119.5F, -4.5F, 1.5F);
/*      */     
/* 1156 */     this.ammoModel[23].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 5, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F);
/* 1157 */     this.ammoModel[23].setRotationPoint(119.5F, -10.5F, 1.5F);
/*      */     
/* 1159 */     this.ammoModel[24].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 5, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1160 */     this.ammoModel[24].setRotationPoint(119.5F, -10.5F, -12.5F);
/*      */     
/* 1162 */     this.ammoModel[25].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 7, 8, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, -5.5F, -8.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1163 */     this.ammoModel[25].setRotationPoint(119.5F, -18.5F, -12.5F);
/*      */     
/* 1165 */     this.ammoModel[26].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 7, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, -5.5F, -8.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1166 */     this.ammoModel[26].setRotationPoint(119.5F, -4.5F, -12.5F);
/*      */     
/* 1168 */     this.ammoModel[27].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 22, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1169 */     this.ammoModel[27].setRotationPoint(119.5F, -19.0F, -4.5F);
/*      */     
/* 1171 */     this.ammoModel[28].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1172 */     this.ammoModel[28].setRotationPoint(150.5F, -12.0F, -3.5F);
/*      */     
/* 1174 */     this.ammoModel[29].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1175 */     this.ammoModel[29].setRotationPoint(150.5F, -12.0F, 0.5F);
/*      */     
/* 1177 */     this.ammoModel[30].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1178 */     this.ammoModel[30].setRotationPoint(150.5F, -6.0F, 0.5F);
/*      */     
/* 1180 */     this.ammoModel[31].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1181 */     this.ammoModel[31].setRotationPoint(150.5F, -6.0F, -5.5F);
/*      */     
/* 1183 */     this.ammoModel[32].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1184 */     this.ammoModel[32].setRotationPoint(150.5F, -12.0F, -5.5F);
/*      */     
/* 1186 */     this.ammoModel[33].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1187 */     this.ammoModel[33].setRotationPoint(150.5F, -10.0F, -5.5F);
/*      */     
/* 1189 */     this.ammoModel[34].addShapeBox(-25.0F, -16.0F, 1.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1190 */     this.ammoModel[34].setRotationPoint(150.5F, -10.0F, 0.5F);
/*      */     
/* 1192 */     this.ammoModel[35].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1193 */     this.ammoModel[35].setRotationPoint(153.5F, -11.5F, -3.0F);
/*      */     
/* 1195 */     this.ammoModel[36].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1196 */     this.ammoModel[36].setRotationPoint(153.5F, -11.5F, 0.0F);
/*      */     
/* 1198 */     this.ammoModel[37].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1199 */     this.ammoModel[37].setRotationPoint(153.5F, -6.5F, 0.0F);
/*      */     
/* 1201 */     this.ammoModel[38].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1202 */     this.ammoModel[38].setRotationPoint(153.5F, -6.5F, -5.0F);
/*      */     
/* 1204 */     this.ammoModel[39].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1205 */     this.ammoModel[39].setRotationPoint(153.5F, -11.5F, -5.0F);
/*      */     
/* 1207 */     this.ammoModel[40].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1208 */     this.ammoModel[40].setRotationPoint(153.5F, -9.5F, -5.0F);
/*      */     
/* 1210 */     this.ammoModel[41].addShapeBox(-25.0F, -16.0F, 1.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1211 */     this.ammoModel[41].setRotationPoint(153.5F, -9.5F, 0.0F);
/*      */     
/* 1213 */     this.ammoModel[42].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1214 */     this.ammoModel[42].setRotationPoint(72.5F, -16.0F, -2.5F);
/*      */     
/* 1216 */     this.ammoModel[43].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1217 */     this.ammoModel[43].setRotationPoint(72.5F, -3.0F, -2.5F);
/*      */     
/* 1219 */     this.ammoModel[44].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1220 */     this.ammoModel[44].setRotationPoint(72.5F, -10.0F, -7.9F);
/* 1221 */     this.ammoModel[44].rotateAngleX = -0.7853982F;
/*      */     
/* 1223 */     this.ammoModel[45].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1224 */     this.ammoModel[45].setRotationPoint(72.5F, -16.75F, 13.35F);
/* 1225 */     this.ammoModel[45].rotateAngleX = 0.7853982F;
/*      */     
/* 1227 */     this.ammoModel[46].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1228 */     this.ammoModel[46].setRotationPoint(72.5F, -37.85F, 6.75F);
/* 1229 */     this.ammoModel[46].rotateAngleX = 2.3561945F;
/*      */     
/* 1231 */     this.ammoModel[47].addShapeBox(-25.0F, -16.0F, 1.0F, 10, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1232 */     this.ammoModel[47].setRotationPoint(72.5F, -31.25F, -14.3F);
/* 1233 */     this.ammoModel[47].rotateAngleX = -2.3561945F;
/*      */     
/* 1235 */     this.ammoModel[48].addShapeBox(-25.0F, -16.0F, 1.0F, 31, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1236 */     this.ammoModel[48].setRotationPoint(41.5F, -11.0F, -4.5F);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 1241 */     translateAll(0.0F, -5.0F, -3.75F);
/* 1242 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/*      */ 
/* 1245 */     this.gunSlideDistance = 0.0F;
/* 1246 */     this.animationType = EnumAnimationType.END_LOADED;
/*      */     
/* 1248 */     this.tiltGunTime = 0.4F;
/* 1249 */     this.unloadClipTime = 0.1F;
/* 1250 */     this.loadClipTime = 0.1F;
/* 1251 */     this.untiltGunTime = 0.4F;
/*      */     
/*      */ 
/* 1254 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelrpg7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */