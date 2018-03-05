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
/*      */ public class Modelfamas
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelfamas()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ĉ'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 329, 49, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 321, 89, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 33, 97, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 65, 105, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 489, 89, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 105, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 105, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 97, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 81, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 113, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 113, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 121, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 121, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 121, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 273, 121, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 305, 121, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 145, 121, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 393, 121, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 425, 121, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 465, 121, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 161, 129, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 201, 129, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 393, 129, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 417, 129, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 129, 137, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 193, 137, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 281, 137, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 305, 137, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 329, 137, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 209, 137, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 385, 137, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 409, 137, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 433, 137, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 465, 137, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 489, 137, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 153, 145, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 241, 145, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 185, 145, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 297, 145, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 313, 145, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 337, 145, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 209, 153, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 353, 153, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 121, 153, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 385, 153, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 417, 153, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 241, 161, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 297, 161, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 65, 169, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 161, 169, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 225, 169, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 353, 169, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 377, 169, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 401, 169, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 425, 169, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 441, 169, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 457, 169, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 169, 185, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 289, 177, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 65, 161, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 265, 185, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 417, 89, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 249, 193, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 457, 185, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 393, 193, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/*      */     
/*  288 */     this.gunModel[0].addShapeBox(10.0F, -16.0F, -4.25F, 6, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  289 */     this.gunModel[0].setRotationPoint(-4.6F, -2.7F, -1.0F);
/*      */     
/*  291 */     this.gunModel[1].addShapeBox(10.0F, -16.0F, -4.25F, 11, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  292 */     this.gunModel[1].setRotationPoint(-15.6F, -2.7F, -1.0F);
/*      */     
/*  294 */     this.gunModel[2].addShapeBox(10.0F, -16.0F, -4.25F, 11, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  295 */     this.gunModel[2].setRotationPoint(-15.6F, 2.3F, -1.0F);
/*      */     
/*  297 */     this.gunModel[3].addShapeBox(10.0F, -16.0F, -4.25F, 11, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  298 */     this.gunModel[3].setRotationPoint(1.4F, -2.7F, -1.0F);
/*      */     
/*  300 */     this.gunModel[4].addShapeBox(10.0F, -16.0F, -4.25F, 3, 3, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  301 */     this.gunModel[4].setRotationPoint(12.4F, 1.3F, -1.0F);
/*      */     
/*  303 */     this.gunModel[5].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/*  304 */     this.gunModel[5].setRotationPoint(15.4F, 1.3F, -1.0F);
/*      */     
/*  306 */     this.gunModel[6].addShapeBox(10.0F, -16.0F, -4.25F, 4, 4, 4, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  307 */     this.gunModel[6].setRotationPoint(19.4F, 0.3F, -1.0F);
/*      */     
/*  309 */     this.gunModel[7].addShapeBox(10.0F, -16.0F, -4.25F, 4, 4, 4, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  310 */     this.gunModel[7].setRotationPoint(24.4F, 0.3F, -1.0F);
/*      */     
/*  312 */     this.gunModel[8].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 4, 0.0F, 0.0F, 1.25F, 0.0F, 1.0F, 1.25F, 0.0F, 1.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  313 */     this.gunModel[8].setRotationPoint(28.4F, 0.3F, -1.0F);
/*      */     
/*  315 */     this.gunModel[9].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 4, 0.0F, 2.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 2.0F, 1.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  316 */     this.gunModel[9].setRotationPoint(33.4F, 0.3F, -1.0F);
/*      */     
/*  318 */     this.gunModel[10].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 4, 0.0F, 0.0F, 0.75F, 0.0F, 1.5F, 0.75F, 0.0F, 1.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  319 */     this.gunModel[10].setRotationPoint(35.4F, 0.3F, -1.0F);
/*      */     
/*  321 */     this.gunModel[11].addShapeBox(10.0F, -16.0F, -4.25F, 3, 4, 4, 0.0F, 2.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 2.5F, 0.75F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/*  322 */     this.gunModel[11].setRotationPoint(41.4F, 0.3F, -1.0F);
/*      */     
/*  324 */     this.gunModel[12].addShapeBox(10.0F, -16.0F, -4.25F, 3, 4, 4, 0.0F, 0.0F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  325 */     this.gunModel[12].setRotationPoint(44.4F, 0.3F, -1.0F);
/*      */     
/*  327 */     this.gunModel[13].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 4, 0.0F, 1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  328 */     this.gunModel[13].setRotationPoint(50.4F, 0.3F, -1.0F);
/*      */     
/*  330 */     this.gunModel[14].addShapeBox(10.0F, -16.0F, -4.25F, 7, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  331 */     this.gunModel[14].setRotationPoint(12.4F, -2.7F, -1.0F);
/*      */     
/*  333 */     this.gunModel[15].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  334 */     this.gunModel[15].setRotationPoint(19.4F, -2.7F, -1.0F);
/*      */     
/*  336 */     this.gunModel[16].addShapeBox(10.0F, -16.0F, -4.25F, 7, 2, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  337 */     this.gunModel[16].setRotationPoint(28.4F, -3.7F, -1.0F);
/*      */     
/*  339 */     this.gunModel[17].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 4, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  340 */     this.gunModel[17].setRotationPoint(35.4F, -2.7F, -1.0F);
/*      */     
/*  342 */     this.gunModel[18].addShapeBox(10.0F, -16.0F, -4.25F, 8, 3, 4, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  343 */     this.gunModel[18].setRotationPoint(44.4F, -2.7F, -1.0F);
/*      */     
/*  345 */     this.gunModel[19].addShapeBox(10.0F, -16.0F, -4.25F, 2, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  346 */     this.gunModel[19].setRotationPoint(52.4F, -2.7F, -1.0F);
/*      */     
/*  348 */     this.gunModel[20].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  349 */     this.gunModel[20].setRotationPoint(54.4F, 2.3F, -1.0F);
/*      */     
/*  351 */     this.gunModel[21].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  352 */     this.gunModel[21].setRotationPoint(54.4F, 0.3F, -1.0F);
/*      */     
/*  354 */     this.gunModel[22].addShapeBox(10.0F, -16.0F, -4.25F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  355 */     this.gunModel[22].setRotationPoint(54.4F, -2.7F, -1.0F);
/*      */     
/*  357 */     this.gunModel[23].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 4, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  358 */     this.gunModel[23].setRotationPoint(19.4F, -3.95F, -1.0F);
/*      */     
/*  360 */     this.gunModel[24].addShapeBox(10.0F, -16.0F, -4.25F, 7, 1, 4, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  361 */     this.gunModel[24].setRotationPoint(12.4F, -3.95F, -1.0F);
/*      */     
/*  363 */     this.gunModel[25].addShapeBox(10.0F, -16.0F, -4.25F, 11, 1, 4, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  364 */     this.gunModel[25].setRotationPoint(1.4F, -3.95F, -1.0F);
/*      */     
/*  366 */     this.gunModel[26].addShapeBox(10.0F, -16.0F, -4.25F, 6, 1, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  367 */     this.gunModel[26].setRotationPoint(-4.6F, -3.95F, -1.0F);
/*      */     
/*  369 */     this.gunModel[27].addShapeBox(10.0F, -16.0F, -4.25F, 11, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  370 */     this.gunModel[27].setRotationPoint(-15.6F, -3.95F, -1.0F);
/*      */     
/*  372 */     this.gunModel[28].addShapeBox(10.0F, -16.0F, -4.25F, 6, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  373 */     this.gunModel[28].setRotationPoint(-12.4F, 5.3F, 0.5F);
/*      */     
/*  375 */     this.gunModel[29].addShapeBox(10.0F, -16.0F, -4.25F, 6, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/*  376 */     this.gunModel[29].setRotationPoint(-12.4F, 7.3F, 0.5F);
/*      */     
/*  378 */     this.gunModel[30].addShapeBox(10.0F, -16.0F, -4.25F, 7, 2, 7, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/*  379 */     this.gunModel[30].setRotationPoint(-13.4F, 9.3F, 0.5F);
/*      */     
/*  381 */     this.gunModel[31].addShapeBox(10.0F, -16.0F, -4.25F, 9, 4, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/*  382 */     this.gunModel[31].setRotationPoint(-15.4F, 11.3F, 0.5F);
/*      */     
/*  384 */     this.gunModel[32].addShapeBox(10.0F, -16.0F, -4.25F, 8, 4, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  385 */     this.gunModel[32].setRotationPoint(-17.4F, 15.3F, 0.5F);
/*      */     
/*  387 */     this.gunModel[33].addShapeBox(10.0F, -16.0F, -4.25F, 7, 4, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  388 */     this.gunModel[33].setRotationPoint(-18.4F, 19.3F, 0.5F);
/*      */     
/*  390 */     this.gunModel[34].addShapeBox(10.0F, -16.0F, -4.25F, 7, 3, 7, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  391 */     this.gunModel[34].setRotationPoint(-18.4F, 23.3F, 0.5F);
/*      */     
/*  393 */     this.gunModel[35].addShapeBox(10.0F, -16.0F, -4.25F, 6, 1, 7, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  394 */     this.gunModel[35].setRotationPoint(-17.4F, 26.3F, 0.5F);
/*      */     
/*  396 */     this.gunModel[36].addShapeBox(10.0F, -16.0F, -4.25F, 7, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  397 */     this.gunModel[36].setRotationPoint(-18.4F, 27.3F, 0.5F);
/*      */     
/*  399 */     this.gunModel[37].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  400 */     this.gunModel[37].setRotationPoint(-10.9F, 27.3F, 0.5F);
/*      */     
/*  402 */     this.gunModel[38].addShapeBox(10.0F, -16.0F, -4.25F, 2, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  403 */     this.gunModel[38].setRotationPoint(-10.9F, 24.3F, 0.5F);
/*      */     
/*  405 */     this.gunModel[39].addShapeBox(10.0F, -16.0F, -4.25F, 3, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  406 */     this.gunModel[39].setRotationPoint(-10.9F, 22.3F, 0.5F);
/*      */     
/*  408 */     this.gunModel[40].addShapeBox(10.0F, -16.0F, -4.25F, 5, 2, 7, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  409 */     this.gunModel[40].setRotationPoint(-10.9F, 20.3F, 0.5F);
/*      */     
/*  411 */     this.gunModel[41].addShapeBox(10.0F, -16.0F, -4.25F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  412 */     this.gunModel[41].setRotationPoint(-10.9F, 19.3F, 0.5F);
/*      */     
/*  414 */     this.gunModel[42].addShapeBox(10.0F, -16.0F, -4.25F, 5, 2, 7, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  415 */     this.gunModel[42].setRotationPoint(-8.9F, 17.3F, 0.5F);
/*      */     
/*  417 */     this.gunModel[43].addShapeBox(10.0F, -16.0F, -4.25F, 5, 1, 7, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  418 */     this.gunModel[43].setRotationPoint(-8.9F, 15.8F, 0.5F);
/*      */     
/*  420 */     this.gunModel[44].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  421 */     this.gunModel[44].setRotationPoint(-5.9F, 14.3F, 0.5F);
/*      */     
/*  423 */     this.gunModel[45].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  424 */     this.gunModel[45].setRotationPoint(-5.9F, 12.3F, 0.5F);
/*      */     
/*  426 */     this.gunModel[46].addShapeBox(10.0F, -16.0F, -4.25F, 3, 1, 7, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  427 */     this.gunModel[46].setRotationPoint(-5.9F, 11.3F, 0.5F);
/*      */     
/*  429 */     this.gunModel[47].addShapeBox(10.0F, -16.0F, -4.25F, 5, 1, 7, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  430 */     this.gunModel[47].setRotationPoint(-5.9F, 10.8F, 0.5F);
/*      */     
/*  432 */     this.gunModel[48].addShapeBox(10.0F, -16.0F, -4.25F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  433 */     this.gunModel[48].setRotationPoint(-5.9F, 10.3F, 0.5F);
/*      */     
/*  435 */     this.gunModel[49].addShapeBox(10.0F, -16.0F, -4.25F, 3, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  436 */     this.gunModel[49].setRotationPoint(-5.9F, 7.3F, 0.5F);
/*      */     
/*  438 */     this.gunModel[50].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 7, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  439 */     this.gunModel[50].setRotationPoint(-4.6F, 5.3F, 0.5F);
/*      */     
/*  441 */     this.gunModel[51].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 7, 0.0F, 0.0F, 0.75F, 0.0F, 0.3F, 0.5F, 0.0F, 0.3F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  442 */     this.gunModel[51].setRotationPoint(-5.9F, 5.3F, 0.5F);
/*      */     
/*  444 */     this.gunModel[52].addShapeBox(10.0F, -16.0F, -4.25F, 6, 2, 7, 0.0F, 0.0F, -0.08F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, -0.08F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  445 */     this.gunModel[52].setRotationPoint(-12.4F, 3.3F, 0.5F);
/*      */     
/*  447 */     this.gunModel[53].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  448 */     this.gunModel[53].setRotationPoint(-13.9F, 4.3F, 0.5F);
/*      */     
/*  450 */     this.gunModel[54].addShapeBox(10.0F, -16.0F, -4.25F, 3, 1, 7, 0.0F, -0.3F, 0.5F, 0.0F, 0.5F, -0.08F, 0.0F, 0.5F, -0.08F, 0.0F, -0.3F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  451 */     this.gunModel[54].setRotationPoint(-15.9F, 3.3F, 0.5F);
/*      */     
/*  453 */     this.gunModel[55].addShapeBox(10.0F, -16.0F, -4.25F, 10, 4, 10, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  454 */     this.gunModel[55].setRotationPoint(-25.6F, -2.7F, -1.0F);
/*      */     
/*  456 */     this.gunModel[56].addShapeBox(10.0F, -16.0F, -4.25F, 4, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  457 */     this.gunModel[56].setRotationPoint(-19.6F, 1.3F, -1.0F);
/*      */     
/*  459 */     this.gunModel[57].addShapeBox(10.0F, -16.0F, -4.25F, 7, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F);
/*  460 */     this.gunModel[57].setRotationPoint(-26.6F, 1.3F, -1.0F);
/*      */     
/*  462 */     this.gunModel[58].addShapeBox(10.0F, -16.0F, -4.25F, 4, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  463 */     this.gunModel[58].setRotationPoint(-30.6F, 1.3F, -1.0F);
/*      */     
/*  465 */     this.gunModel[59].addShapeBox(10.0F, -16.0F, -4.25F, 3, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  466 */     this.gunModel[59].setRotationPoint(-33.6F, 11.3F, -1.0F);
/*      */     
/*  468 */     this.gunModel[60].addShapeBox(10.0F, -16.0F, -4.25F, 3, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  469 */     this.gunModel[60].setRotationPoint(-33.6F, 1.3F, -1.0F);
/*      */     
/*  471 */     this.gunModel[61].addShapeBox(10.0F, -16.0F, -4.25F, 10, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F);
/*  472 */     this.gunModel[61].setRotationPoint(-47.6F, 7.3F, 0.0F);
/*      */     
/*  474 */     this.gunModel[62].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  475 */     this.gunModel[62].setRotationPoint(55.15F, -6.7F, -1.0F);
/*      */     
/*  477 */     this.gunModel[63].addShapeBox(10.0F, -16.0F, -4.25F, 8, 3, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  478 */     this.gunModel[63].setRotationPoint(57.15F, -5.7F, 2.5F);
/*      */     
/*  480 */     this.gunModel[64].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 3, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  481 */     this.gunModel[64].setRotationPoint(71.15F, -5.7F, 2.5F);
/*      */     
/*  483 */     this.gunModel[65].addShapeBox(10.0F, -16.0F, -4.25F, 6, 4, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  484 */     this.gunModel[65].setRotationPoint(65.15F, -6.65F, 2.0F);
/*      */     
/*  486 */     this.gunModel[66].addShapeBox(10.0F, -16.0F, -4.25F, 12, 4, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  487 */     this.gunModel[66].setRotationPoint(78.15F, -6.65F, 2.0F);
/*      */     
/*  489 */     this.gunModel[67].addShapeBox(10.0F, -16.0F, -4.25F, 3, 4, 4, 0.0F, 0.25F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.25F, 0.0F, -0.1F, 0.25F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F);
/*  490 */     this.gunModel[67].setRotationPoint(75.15F, -6.55F, 2.0F);
/*      */     
/*  492 */     this.gunModel[68].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 8, 0.0F, -1.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  493 */     this.gunModel[68].setRotationPoint(-38.6F, 13.3F, 0.0F);
/*      */     
/*  495 */     this.gunModel[69].addShapeBox(10.0F, -16.0F, -4.25F, 2, 6, 8, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 1.95F, -0.25F, 0.0F, 1.95F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  496 */     this.gunModel[69].setRotationPoint(-38.6F, 7.3F, 0.0F);
/*      */     
/*  498 */     this.gunModel[70].addShapeBox(10.0F, -16.0F, -4.25F, 12, 1, 10, 0.0F, -1.0F, -0.05F, 0.0F, 1.0F, -0.05F, 0.0F, 1.0F, -0.05F, 0.0F, -1.0F, 0.05F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  499 */     this.gunModel[70].setRotationPoint(-48.6F, 6.3F, -1.0F);
/*      */     
/*  501 */     this.gunModel[71].addShapeBox(10.0F, -16.0F, -4.25F, 11, 1, 10, 0.0F, -1.0F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 0.05F, 0.0F, 1.0F, 0.05F, 0.0F, 1.0F, 0.05F, 0.0F, -1.0F, 0.05F, 0.0F);
/*  502 */     this.gunModel[71].setRotationPoint(-47.6F, 5.3F, -1.0F);
/*      */     
/*  504 */     this.gunModel[72].addShapeBox(10.0F, -16.0F, -4.25F, 1, 6, 10, 0.0F, 2.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 1.05F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.05F, -0.25F, 0.0F);
/*  505 */     this.gunModel[72].setRotationPoint(-33.6F, 7.3F, -1.0F);
/*      */     
/*  507 */     this.gunModel[73].addShapeBox(10.0F, -16.0F, -4.25F, 3, 2, 10, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  508 */     this.gunModel[73].setRotationPoint(-49.6F, 4.6F, -1.0F);
/*      */     
/*  510 */     this.gunModel[74].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 10, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F);
/*  511 */     this.gunModel[74].setRotationPoint(-51.6F, 4.6F, -1.0F);
/*      */     
/*  513 */     this.gunModel[75].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  514 */     this.gunModel[75].setRotationPoint(-49.6F, 6.35F, -1.0F);
/*      */     
/*  516 */     this.gunModel[76].addShapeBox(10.0F, -16.0F, -4.25F, 18, 2, 8, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 3.5F, 0.0F);
/*  517 */     this.gunModel[76].setRotationPoint(-69.6F, 8.0F, 0.0F);
/*      */     
/*  519 */     this.gunModel[77].addShapeBox(10.0F, -16.0F, -4.25F, 7, 2, 8, 0.0F, -1.5F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -1.5F, -0.15F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  520 */     this.gunModel[77].setRotationPoint(-76.6F, 13.25F, 0.0F);
/*      */     
/*  522 */     this.gunModel[78].addShapeBox(10.0F, -16.0F, -4.25F, 7, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.2F, 0.0F, 0.75F, -0.2F, 0.0F, 0.75F, -0.2F, 0.0F, 1.0F, -0.2F, 0.0F);
/*  523 */     this.gunModel[78].setRotationPoint(-66.6F, 6.35F, 0.0F);
/*      */     
/*  525 */     this.gunModel[79].addShapeBox(10.0F, -16.0F, -4.25F, 6, 5, 8, 0.0F, -6.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -6.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  526 */     this.gunModel[79].setRotationPoint(-75.6F, 8.4F, 0.0F);
/*      */     
/*  528 */     this.gunModel[80].addShapeBox(10.0F, -16.0F, -4.25F, 2, 3, 10, 0.0F, -0.2F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.8F, -1.15F, 0.0F, -0.8F, -1.15F, 0.0F, -0.2F, 0.0F, 0.0F);
/*  529 */     this.gunModel[80].setRotationPoint(-78.3F, 13.4F, -1.0F);
/*      */     
/*  531 */     this.gunModel[81].addShapeBox(10.0F, -16.0F, -4.25F, 6, 3, 11, 0.0F, 0.75F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  532 */     this.gunModel[81].setRotationPoint(-87.3F, 13.4F, -1.5F);
/*      */     
/*  534 */     this.gunModel[82].addShapeBox(10.0F, -16.0F, -4.25F, 5, 3, 10, 0.0F, 0.25F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  535 */     this.gunModel[82].setRotationPoint(-82.3F, 10.4F, -1.0F);
/*      */     
/*  537 */     this.gunModel[83].addShapeBox(10.0F, -16.0F, -4.25F, 5, 3, 10, 0.0F, -0.75F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  538 */     this.gunModel[83].setRotationPoint(-82.3F, 7.4F, -1.0F);
/*      */     
/*  540 */     this.gunModel[84].addShapeBox(10.0F, -16.0F, -4.25F, 5, 3, 10, 0.0F, -1.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  541 */     this.gunModel[84].setRotationPoint(-82.3F, 4.4F, -1.0F);
/*      */     
/*  543 */     this.gunModel[85].addShapeBox(10.0F, -16.0F, -4.25F, 5, 3, 10, 0.0F, -1.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  544 */     this.gunModel[85].setRotationPoint(-82.3F, 1.4F, -1.0F);
/*      */     
/*  546 */     this.gunModel[86].addShapeBox(10.0F, -16.0F, -4.25F, 5, 3, 10, 0.0F, -0.5F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  547 */     this.gunModel[86].setRotationPoint(-82.3F, -1.6F, -1.0F);
/*      */     
/*  549 */     this.gunModel[87].addShapeBox(10.0F, -16.0F, -4.25F, 5, 2, 10, 0.0F, -0.5F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  550 */     this.gunModel[87].setRotationPoint(-82.3F, -3.6F, -1.0F);
/*      */     
/*  552 */     this.gunModel[88].addShapeBox(10.0F, -16.0F, -4.25F, 54, 4, 10, 0.0F, -0.2F, 0.5F, 0.0F, -0.8F, 0.5F, 0.0F, -0.8F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
/*  553 */     this.gunModel[88].setRotationPoint(-78.3F, -2.6F, -1.0F);
/*      */     
/*  555 */     this.gunModel[89].addShapeBox(10.0F, -16.0F, -4.25F, 45, 3, 10, 0.0F, -0.2F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F);
/*  556 */     this.gunModel[89].setRotationPoint(-78.3F, 1.4F, -1.0F);
/*      */     
/*  558 */     this.gunModel[90].addShapeBox(10.0F, -16.0F, -4.25F, 6, 3, 11, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F);
/*  559 */     this.gunModel[90].setRotationPoint(-87.3F, 10.4F, -1.5F);
/*      */     
/*  561 */     this.gunModel[91].addShapeBox(10.0F, -16.0F, -4.25F, 7, 3, 11, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F);
/*  562 */     this.gunModel[91].setRotationPoint(-88.76F, 7.4F, -1.5F);
/*      */     
/*  564 */     this.gunModel[92].addShapeBox(10.0F, -16.0F, -4.25F, 7, 3, 11, 0.0F, 0.85F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  565 */     this.gunModel[92].setRotationPoint(-88.76F, 4.4F, -1.5F);
/*      */     
/*  567 */     this.gunModel[93].addShapeBox(10.0F, -16.0F, -4.25F, 10, 3, 11, 0.0F, -0.6F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/*  568 */     this.gunModel[93].setRotationPoint(-90.5F, 1.4F, -1.5F);
/*      */     
/*  570 */     this.gunModel[94].addShapeBox(10.0F, -16.0F, -4.25F, 10, 3, 11, 0.0F, -0.6F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/*  571 */     this.gunModel[94].setRotationPoint(-90.5F, -1.6F, -1.5F);
/*      */     
/*  573 */     this.gunModel[95].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 11, 0.0F, -0.1F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/*  574 */     this.gunModel[95].setRotationPoint(-90.0F, -3.6F, -1.5F);
/*      */     
/*  576 */     this.gunModel[96].addShapeBox(10.0F, -16.0F, -4.25F, 5, 3, 11, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  577 */     this.gunModel[96].setRotationPoint(-90.15F, -6.1F, -1.5F);
/*      */     
/*  579 */     this.gunModel[97].addShapeBox(10.0F, -16.0F, -4.25F, 5, 5, 11, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  580 */     this.gunModel[97].setRotationPoint(-90.15F, -11.1F, -1.5F);
/*      */     
/*  582 */     this.gunModel[98].addShapeBox(10.0F, -16.0F, -4.25F, 5, 2, 11, 0.0F, -2.0F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -2.0F, -0.5F, -1.5F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  583 */     this.gunModel[98].setRotationPoint(-90.15F, -13.1F, -1.5F);
/*      */     
/*  585 */     this.gunModel[99].addShapeBox(10.0F, -16.0F, -4.25F, 4, 1, 9, 0.0F, -2.0F, -0.5F, -2.0F, -0.25F, -0.5F, -2.0F, -0.25F, -0.5F, -2.0F, -2.0F, -0.5F, -2.0F, -1.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F);
/*  586 */     this.gunModel[99].setRotationPoint(-89.15F, -14.1F, -0.5F);
/*      */     
/*  588 */     this.gunModel[100].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 11, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  589 */     this.gunModel[100].setRotationPoint(-85.65F, -6.1F, -1.5F);
/*      */     
/*  591 */     this.gunModel[101].addShapeBox(10.0F, -16.0F, -4.25F, 3, 3, 11, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  592 */     this.gunModel[101].setRotationPoint(-85.65F, -9.1F, -1.5F);
/*      */     
/*  594 */     this.gunModel[102].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 11, 0.0F, -0.25F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  595 */     this.gunModel[102].setRotationPoint(-85.65F, -11.1F, -1.5F);
/*      */     
/*  597 */     this.gunModel[103].addShapeBox(10.0F, -16.0F, -4.25F, 6, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -6.0F, 0.25F, 0.0F, -6.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  598 */     this.gunModel[103].setRotationPoint(-75.1F, 8.15F, -1.0F);
/*      */     
/*  600 */     this.gunModel[104].addShapeBox(10.0F, -16.0F, -4.25F, 3, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  601 */     this.gunModel[104].setRotationPoint(-78.1F, 8.15F, -1.0F);
/*      */     
/*  603 */     this.gunModel[105].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 10, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.1F, 0.0F);
/*  604 */     this.gunModel[105].setRotationPoint(-77.1F, 13.15F, -1.0F);
/*      */     
/*  606 */     this.gunModel[106].addShapeBox(10.0F, -16.0F, -4.25F, 24, 3, 10, 0.0F, -0.2F, 0.1F, 0.0F, -0.3F, 0.1F, 0.0F, -0.3F, 0.1F, 0.0F, -0.2F, 0.1F, 0.0F, -0.2F, -0.55F, 0.0F, -0.3F, -0.55F, 0.0F, -0.3F, -0.55F, 0.0F, -0.2F, -0.55F, 0.0F);
/*  607 */     this.gunModel[106].setRotationPoint(-78.3F, 4.4F, -1.0F);
/*      */     
/*  609 */     this.gunModel[107].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 10, 0.0F, 1.25F, -0.2F, 0.0F, 1.25F, -0.2F, 0.0F, 1.25F, -0.2F, 0.0F, 1.25F, -0.2F, 0.0F, 1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F);
/*  610 */     this.gunModel[107].setRotationPoint(-76.85F, 6.65F, -1.0F);
/*      */     
/*  612 */     this.gunModel[108].addShapeBox(10.0F, -16.0F, -4.25F, 3, 2, 10, 0.0F, 1.25F, -0.2F, 0.0F, 1.25F, -0.2F, 0.0F, 1.25F, -0.2F, 0.0F, 1.25F, -0.2F, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  613 */     this.gunModel[108].setRotationPoint(-58.85F, 6.65F, -1.0F);
/*      */     
/*  615 */     this.gunModel[109].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 10, 0.0F, 0.0F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  616 */     this.gunModel[109].setRotationPoint(-52.1F, 4.15F, -1.0F);
/*      */     
/*  618 */     this.gunModel[110].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 10, 0.0F, 0.0F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[110].setRotationPoint(-54.6F, 4.15F, -1.0F);
/*      */     
/*  621 */     this.gunModel[111].addShapeBox(10.0F, -16.0F, -4.25F, 5, 1, 10, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F);
/*  622 */     this.gunModel[111].setRotationPoint(-54.6F, 3.65F, -1.0F);
/*      */     
/*  624 */     this.gunModel[112].addShapeBox(10.0F, -16.0F, -4.25F, 3, 1, 10, 0.0F, 1.0F, 0.05F, 0.0F, -1.0F, 0.05F, 0.0F, -1.0F, 0.05F, 0.0F, 1.0F, 0.05F, 0.0F, -1.25F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F);
/*  625 */     this.gunModel[112].setRotationPoint(-36.85F, 4.35F, -1.0F);
/*      */     
/*  627 */     this.gunModel[113].addShapeBox(10.0F, -16.0F, -4.25F, 1, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  628 */     this.gunModel[113].setRotationPoint(-34.85F, 4.3F, -1.0F);
/*      */     
/*  630 */     this.gunModel[114].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 10, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  631 */     this.gunModel[114].setRotationPoint(-35.85F, 6.3F, -1.0F);
/*      */     
/*  633 */     this.gunModel[115].addShapeBox(10.0F, -16.0F, -4.25F, 8, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  634 */     this.gunModel[115].setRotationPoint(48.25F, -17.7F, -1.0F);
/*      */     
/*  636 */     this.gunModel[116].addShapeBox(10.0F, -16.0F, -4.25F, 1, 4, 2, 0.0F, 0.1F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/*  637 */     this.gunModel[116].setRotationPoint(55.25F, -10.7F, -1.0F);
/*      */     
/*  639 */     this.gunModel[117].addShapeBox(10.0F, -16.0F, -4.25F, 8, 2, 2, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  640 */     this.gunModel[117].setRotationPoint(48.25F, -19.95F, -1.0F);
/*      */     
/*  642 */     this.gunModel[118].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 2, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F);
/*  643 */     this.gunModel[118].setRotationPoint(47.25F, -21.25F, -1.0F);
/*      */     
/*  645 */     this.gunModel[119].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 2, 0.0F, 2.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 2.25F, 0.25F, 0.0F);
/*  646 */     this.gunModel[119].setRotationPoint(47.25F, -23.5F, -1.0F);
/*      */     
/*  648 */     this.gunModel[120].addShapeBox(10.0F, -16.0F, -4.25F, 8, 2, 2, 0.0F, 2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/*  649 */     this.gunModel[120].setRotationPoint(47.25F, -25.5F, -1.0F);
/*      */     
/*  651 */     this.gunModel[121].addShapeBox(10.0F, -16.0F, -4.25F, 59, 4, 2, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  652 */     this.gunModel[121].setRotationPoint(-13.75F, -25.5F, -1.0F);
/*      */     
/*  654 */     this.gunModel[122].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  655 */     this.gunModel[122].setRotationPoint(-24.75F, -25.5F, -1.0F);
/*      */     
/*  657 */     this.gunModel[123].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 2, 0.0F, -2.25F, 0.0F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -2.25F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F);
/*  658 */     this.gunModel[123].setRotationPoint(-24.75F, -26.5F, -1.0F);
/*      */     
/*  660 */     this.gunModel[124].addShapeBox(10.0F, -16.0F, -4.25F, 9, 3, 2, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/*  661 */     this.gunModel[124].setRotationPoint(-24.75F, -23.5F, -1.0F);
/*      */     
/*  663 */     this.gunModel[125].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F);
/*  664 */     this.gunModel[125].setRotationPoint(-25.25F, -20.25F, -1.0F);
/*      */     
/*  666 */     this.gunModel[126].addShapeBox(10.0F, -16.0F, -4.25F, 7, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.3F, 0.0F, 1.5F, 0.3F, 0.0F, 1.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F);
/*  667 */     this.gunModel[126].setRotationPoint(-25.25F, -18.95F, -1.0F);
/*      */     
/*  669 */     this.gunModel[127].addShapeBox(10.0F, -16.0F, -4.25F, 8, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  670 */     this.gunModel[127].setRotationPoint(-25.75F, -17.7F, -1.0F);
/*      */     
/*  672 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 26, 3, 10, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  673 */     this.gunModel[''].setRotationPoint(-82.4F, -6.1F, -1.0F);
/*      */     
/*  675 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 27, 3, 9, 0.0F, 0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  676 */     this.gunModel[''].setRotationPoint(-83.4F, -9.1F, -1.0F);
/*      */     
/*  678 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 18, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  679 */     this.gunModel[''].setRotationPoint(-84.65F, -11.1F, 1.0F);
/*      */     
/*  681 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 20, 2, 6, 0.0F, -1.5F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  682 */     this.gunModel[''].setRotationPoint(-86.9F, -13.1F, 1.0F);
/*      */     
/*  684 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 5, 4, 6, 0.0F, -1.5F, 0.5F, -1.0F, -0.25F, -3.5F, -1.0F, -0.25F, -3.5F, -1.0F, -1.5F, 0.5F, -1.0F, -1.5F, -0.5F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -1.5F, -0.5F, 0.0F);
/*  685 */     this.gunModel[''].setRotationPoint(-68.6F, -13.1F, 1.0F);
/*      */     
/*  687 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 11, 5, 3, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  688 */     this.gunModel[''].setRotationPoint(1.4F, -10.7F, -1.0F);
/*      */     
/*  690 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 3, 6, 7, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  691 */     this.gunModel[''].setRotationPoint(-28.0F, -9.1F, -1.0F);
/*      */     
/*  693 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 28, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.1F, 0.25F, 0.0F);
/*  694 */     this.gunModel[''].setRotationPoint(-56.75F, -8.6F, 0.0F);
/*      */     
/*  696 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 7, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  697 */     this.gunModel[''].setRotationPoint(-29.0F, -10.1F, -1.0F);
/*      */     
/*  699 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 7, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  700 */     this.gunModel[''].setRotationPoint(-27.0F, -10.1F, -1.0F);
/*      */     
/*  702 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 7, 0.0F, -0.5F, -1.65F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, -0.5F, -1.65F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/*  703 */     this.gunModel[''].setRotationPoint(-29.0F, -11.1F, -1.0F);
/*      */     
/*  705 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 7, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  706 */     this.gunModel[''].setRotationPoint(-27.0F, -11.1F, -1.0F);
/*      */     
/*  708 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 39, 1, 6, 0.0F, -0.5F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  709 */     this.gunModel[''].setRotationPoint(-67.6F, -10.1F, 1.0F);
/*      */     
/*  711 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 28, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  712 */     this.gunModel[''].setRotationPoint(-56.65F, -9.1F, 0.0F);
/*      */     
/*  714 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 1, 0.0F, -0.1F, -0.05F, -1.0F, 0.0F, -0.05F, -1.0F, 0.0F, -0.05F, 0.0F, -0.1F, -0.05F, 0.0F, -0.1F, 0.25F, -0.25F, -3.5F, 0.25F, -0.25F, -3.5F, 0.25F, 0.0F, -0.1F, 0.25F, 0.0F);
/*  715 */     this.gunModel[''].setRotationPoint(-54.75F, -7.4F, -1.0F);
/*      */     
/*  717 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/*  718 */     this.gunModel[''].setRotationPoint(-56.65F, -7.35F, -1.0F);
/*      */     
/*  720 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 1, 0.0F, -0.1F, 0.05F, -0.25F, -0.5F, 0.05F, -0.25F, -0.5F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/*  721 */     this.gunModel[''].setRotationPoint(-54.75F, -4.1F, -1.0F);
/*      */     
/*  723 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 5, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, -0.05F, 0.0F, -1.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.05F, 0.25F, 0.0F, -0.05F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  724 */     this.gunModel[''].setRotationPoint(-33.65F, -7.35F, -1.0F);
/*      */     
/*  726 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  727 */     this.gunModel[''].setRotationPoint(-34.65F, -7.35F, -1.0F);
/*      */     
/*  729 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 1, 0.0F, -0.25F, -1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/*  730 */     this.gunModel[''].setRotationPoint(-35.65F, -4.35F, -1.0F);
/*      */     
/*  732 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  733 */     this.gunModel[''].setRotationPoint(54.4F, 2.3F, 3.0F);
/*      */     
/*  735 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  736 */     this.gunModel[''].setRotationPoint(54.4F, 0.3F, 3.0F);
/*      */     
/*  738 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  739 */     this.gunModel[''].setRotationPoint(54.4F, -2.7F, 3.0F);
/*      */     
/*  741 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 8, 3, 6, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  742 */     this.gunModel[''].setRotationPoint(44.4F, -2.7F, 3.0F);
/*      */     
/*  744 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  745 */     this.gunModel[''].setRotationPoint(52.4F, -2.7F, 3.0F);
/*      */     
/*  747 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 6, 0.0F, 1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  748 */     this.gunModel[''].setRotationPoint(50.4F, 0.3F, 3.0F);
/*      */     
/*  750 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 3, 4, 6, 0.0F, 0.0F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  751 */     this.gunModel[''].setRotationPoint(44.4F, 0.3F, 3.0F);
/*      */     
/*  753 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 3, 4, 6, 0.0F, 2.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 2.5F, 0.75F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/*  754 */     this.gunModel[''].setRotationPoint(41.4F, 0.3F, 3.0F);
/*      */     
/*  756 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  757 */     this.gunModel[''].setRotationPoint(35.4F, -2.7F, 3.0F);
/*      */     
/*  759 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 6, 0.0F, 0.0F, 0.75F, 0.0F, 1.5F, 0.75F, 0.0F, 1.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[''].setRotationPoint(35.4F, 0.3F, 3.0F);
/*      */     
/*  762 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 6, 0.0F, 2.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 2.0F, 1.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  763 */     this.gunModel[''].setRotationPoint(33.4F, 0.3F, 3.0F);
/*      */     
/*  765 */     this.gunModel[''].addShapeBox(10.0F, -16.0F, -4.25F, 7, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  766 */     this.gunModel[''].setRotationPoint(28.4F, -3.7F, 3.0F);
/*      */     
/*  768 */     this.gunModel[' '].addShapeBox(10.0F, -16.0F, -4.25F, 2, 4, 6, 0.0F, 0.0F, 1.25F, 0.0F, 1.0F, 1.25F, 0.0F, 1.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  769 */     this.gunModel[' '].setRotationPoint(28.4F, 0.3F, 3.0F);
/*      */     
/*  771 */     this.gunModel['¡'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 4, 6, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  772 */     this.gunModel['¡'].setRotationPoint(24.4F, 0.3F, 3.0F);
/*      */     
/*  774 */     this.gunModel['¢'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  775 */     this.gunModel['¢'].setRotationPoint(19.4F, -2.7F, 3.0F);
/*      */     
/*  777 */     this.gunModel['£'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 6, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  778 */     this.gunModel['£'].setRotationPoint(19.4F, -3.95F, 3.0F);
/*      */     
/*  780 */     this.gunModel['¤'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 4, 6, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  781 */     this.gunModel['¤'].setRotationPoint(19.4F, 0.3F, 3.0F);
/*      */     
/*  783 */     this.gunModel['¥'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  784 */     this.gunModel['¥'].setRotationPoint(12.4F, 1.3F, 3.0F);
/*      */     
/*  786 */     this.gunModel['¦'].addShapeBox(10.0F, -16.0F, -4.25F, 7, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  787 */     this.gunModel['¦'].setRotationPoint(12.4F, -2.7F, 3.0F);
/*      */     
/*  789 */     this.gunModel['§'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/*  790 */     this.gunModel['§'].setRotationPoint(15.4F, 1.3F, 3.0F);
/*      */     
/*  792 */     this.gunModel['¨'].addShapeBox(10.0F, -16.0F, -4.25F, 7, 1, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  793 */     this.gunModel['¨'].setRotationPoint(12.4F, -3.95F, 3.0F);
/*      */     
/*  795 */     this.gunModel['©'].addShapeBox(10.0F, -16.0F, -4.25F, 11, 1, 6, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  796 */     this.gunModel['©'].setRotationPoint(1.4F, -3.95F, 3.0F);
/*      */     
/*  798 */     this.gunModel['ª'].addShapeBox(10.0F, -16.0F, -4.25F, 11, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  799 */     this.gunModel['ª'].setRotationPoint(1.4F, -2.7F, 3.0F);
/*      */     
/*  801 */     this.gunModel['«'].addShapeBox(10.0F, -16.0F, -4.25F, 6, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  802 */     this.gunModel['«'].setRotationPoint(-4.6F, -2.7F, 3.0F);
/*      */     
/*  804 */     this.gunModel['¬'].addShapeBox(10.0F, -16.0F, -4.25F, 6, 1, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  805 */     this.gunModel['¬'].setRotationPoint(-4.6F, -3.95F, 3.0F);
/*      */     
/*  807 */     this.gunModel['­'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, -0.5F, -1.65F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, -0.5F, -1.65F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/*  808 */     this.gunModel['­'].setRotationPoint(-29.0F, -11.1F, 6.0F);
/*      */     
/*  810 */     this.gunModel['®'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  811 */     this.gunModel['®'].setRotationPoint(-29.0F, -10.1F, 6.0F);
/*      */     
/*  813 */     this.gunModel['¯'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  814 */     this.gunModel['¯'].setRotationPoint(-27.0F, -10.1F, 6.0F);
/*      */     
/*  816 */     this.gunModel['°'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  817 */     this.gunModel['°'].setRotationPoint(-27.0F, -11.1F, 6.0F);
/*      */     
/*  819 */     this.gunModel['±'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 6, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  820 */     this.gunModel['±'].setRotationPoint(-28.0F, -9.1F, 6.0F);
/*      */     
/*  822 */     this.gunModel['²'].addShapeBox(10.0F, -16.0F, -4.25F, 8, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  823 */     this.gunModel['²'].setRotationPoint(48.25F, -17.7F, 7.0F);
/*      */     
/*  825 */     this.gunModel['³'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 4, 2, 0.0F, 0.1F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/*  826 */     this.gunModel['³'].setRotationPoint(55.25F, -10.7F, 7.0F);
/*      */     
/*  828 */     this.gunModel['´'].addShapeBox(10.0F, -16.0F, -4.25F, 8, 2, 2, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  829 */     this.gunModel['´'].setRotationPoint(48.25F, -19.95F, 7.0F);
/*      */     
/*  831 */     this.gunModel['µ'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 2, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F);
/*  832 */     this.gunModel['µ'].setRotationPoint(47.25F, -21.25F, 7.0F);
/*      */     
/*  834 */     this.gunModel['¶'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 2, 0.0F, 2.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 2.25F, 0.25F, 0.0F);
/*  835 */     this.gunModel['¶'].setRotationPoint(47.25F, -23.5F, 7.0F);
/*      */     
/*  837 */     this.gunModel['·'].addShapeBox(10.0F, -16.0F, -4.25F, 8, 2, 2, 0.0F, 2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/*  838 */     this.gunModel['·'].setRotationPoint(47.25F, -25.5F, 7.0F);
/*      */     
/*  840 */     this.gunModel['¸'].addShapeBox(10.0F, -16.0F, -4.25F, 59, 4, 2, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  841 */     this.gunModel['¸'].setRotationPoint(-13.75F, -25.5F, 7.0F);
/*      */     
/*  843 */     this.gunModel['¹'].addShapeBox(10.0F, -16.0F, -4.25F, 8, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  844 */     this.gunModel['¹'].setRotationPoint(-25.75F, -17.7F, 7.0F);
/*      */     
/*  846 */     this.gunModel['º'].addShapeBox(10.0F, -16.0F, -4.25F, 7, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.3F, 0.0F, 1.5F, 0.3F, 0.0F, 1.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F);
/*  847 */     this.gunModel['º'].setRotationPoint(-25.25F, -18.95F, 7.0F);
/*      */     
/*  849 */     this.gunModel['»'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F);
/*  850 */     this.gunModel['»'].setRotationPoint(-25.25F, -20.25F, 7.0F);
/*      */     
/*  852 */     this.gunModel['¼'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 3, 2, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/*  853 */     this.gunModel['¼'].setRotationPoint(-24.75F, -23.5F, 7.0F);
/*      */     
/*  855 */     this.gunModel['½'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  856 */     this.gunModel['½'].setRotationPoint(-24.75F, -25.5F, 7.0F);
/*      */     
/*  858 */     this.gunModel['¾'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 2, 2, 0.0F, -2.25F, 0.0F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -2.25F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F);
/*  859 */     this.gunModel['¾'].setRotationPoint(-24.75F, -26.5F, 7.0F);
/*      */     
/*  861 */     this.gunModel['¿'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 10, 0.0F, -3.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  862 */     this.gunModel['¿'].setRotationPoint(-37.6F, 13.3F, -1.0F);
/*      */     
/*  864 */     this.gunModel['À'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 10, 0.0F, 0.75F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  865 */     this.gunModel['À'].setRotationPoint(-81.3F, 13.4F, -1.0F);
/*      */     
/*  867 */     this.gunModel['Á'].addShapeBox(10.0F, -16.0F, -4.25F, 11, 5, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  868 */     this.gunModel['Á'].setRotationPoint(1.4F, -10.7F, 6.0F);
/*      */     
/*  870 */     this.gunModel['Â'].addShapeBox(10.0F, -16.0F, -4.25F, 7, 5, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  871 */     this.gunModel['Â'].setRotationPoint(12.4F, -10.7F, 6.0F);
/*      */     
/*  873 */     this.gunModel['Ã'].addShapeBox(10.0F, -16.0F, -4.25F, 7, 5, 3, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  874 */     this.gunModel['Ã'].setRotationPoint(12.4F, -10.7F, -1.0F);
/*      */     
/*  876 */     this.gunModel['Ä'].addShapeBox(10.0F, -16.0F, -4.25F, 40, 6, 8, 0.0F, 0.0F, 0.5F, 0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.5F, 0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -1.5F, 0.15F, 0.0F, -1.5F, 0.15F, 0.0F, -0.5F, 0.15F);
/*  877 */     this.gunModel['Ä'].setRotationPoint(12.4F, -0.7F, 0.0F);
/*      */     
/*  879 */     this.gunModel['Å'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 6, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  880 */     this.gunModel['Å'].setRotationPoint(19.4F, -10.7F, 6.0F);
/*      */     
/*  882 */     this.gunModel['Æ'].addShapeBox(10.0F, -16.0F, -4.25F, 7, 6, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  883 */     this.gunModel['Æ'].setRotationPoint(28.4F, -9.95F, 6.0F);
/*      */     
/*  885 */     this.gunModel['Ç'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 6, 3, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel['Ç'].setRotationPoint(19.4F, -10.7F, -1.0F);
/*      */     
/*  888 */     this.gunModel['È'].addShapeBox(10.0F, -16.0F, -4.25F, 7, 6, 3, 0.0F, 0.0F, 1.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  889 */     this.gunModel['È'].setRotationPoint(28.4F, -9.95F, -1.0F);
/*      */     
/*  891 */     this.gunModel['É'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  892 */     this.gunModel['É'].setRotationPoint(52.4F, -3.7F, -1.0F);
/*      */     
/*  894 */     this.gunModel['Ê'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 5, 3, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -2.5F, 0.0F, 1.25F, -2.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  895 */     this.gunModel['Ê'].setRotationPoint(35.4F, -9.7F, 6.0F);
/*      */     
/*  897 */     this.gunModel['Ë'].addShapeBox(10.0F, -16.0F, -4.25F, 9, 5, 3, 0.0F, 0.0F, 1.25F, -2.5F, 0.0F, 1.25F, -2.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  898 */     this.gunModel['Ë'].setRotationPoint(35.4F, -9.7F, -1.0F);
/*      */     
/*  900 */     this.gunModel['Ì'].addShapeBox(10.0F, -16.0F, -4.25F, 8, 7, 3, 0.0F, 0.0F, 1.25F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  901 */     this.gunModel['Ì'].setRotationPoint(44.4F, -9.7F, -1.0F);
/*      */     
/*  903 */     this.gunModel['Í'].addShapeBox(10.0F, -16.0F, -4.25F, 8, 7, 3, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -2.5F, 0.0F, 1.25F, -2.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  904 */     this.gunModel['Í'].setRotationPoint(44.4F, -9.7F, 6.0F);
/*      */     
/*  906 */     this.gunModel['Î'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 7, 3, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.5F, 0.0F, 1.0F, -2.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  907 */     this.gunModel['Î'].setRotationPoint(52.4F, -9.7F, 6.0F);
/*      */     
/*  909 */     this.gunModel['Ï'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 7, 3, 0.0F, 0.0F, 1.0F, -2.5F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  910 */     this.gunModel['Ï'].setRotationPoint(52.4F, -9.7F, -1.0F);
/*      */     
/*  912 */     this.gunModel['Ð'].addShapeBox(10.0F, -16.0F, -4.25F, 6, 4, 2, 0.0F, 0.0F, -0.05F, 0.0F, 0.9F, -0.05F, 0.0F, 0.9F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.25F, 0.0F, 0.9F, 0.25F, 0.0F, 0.9F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F);
/*  913 */     this.gunModel['Ð'].setRotationPoint(48.25F, -10.5F, 7.0F);
/*      */     
/*  915 */     this.gunModel['Ñ'].addShapeBox(10.0F, -16.0F, -4.25F, 6, 4, 2, 0.0F, 0.0F, -0.05F, 0.0F, 0.9F, -0.05F, 0.0F, 0.9F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.25F, -2.0F, 0.9F, 0.25F, -2.0F, 0.9F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  916 */     this.gunModel['Ñ'].setRotationPoint(48.25F, -10.5F, -1.0F);
/*      */     
/*  918 */     this.gunModel['Ò'].addShapeBox(10.0F, -16.0F, -4.25F, 6, 6, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  919 */     this.gunModel['Ò'].setRotationPoint(-4.6F, -10.7F, 6.0F);
/*      */     
/*  921 */     this.gunModel['Ó'].addShapeBox(10.0F, -16.0F, -4.25F, 6, 6, 3, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  922 */     this.gunModel['Ó'].setRotationPoint(-4.6F, -10.7F, -1.0F);
/*      */     
/*  924 */     this.gunModel['Ô'].addShapeBox(10.0F, -16.0F, -4.25F, 11, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  925 */     this.gunModel['Ô'].setRotationPoint(-15.6F, -10.7F, 6.0F);
/*      */     
/*  927 */     this.gunModel['Õ'].addShapeBox(10.0F, -16.0F, -4.25F, 11, 7, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  928 */     this.gunModel['Õ'].setRotationPoint(-15.6F, -10.7F, -1.0F);
/*      */     
/*  930 */     this.gunModel['Ö'].addShapeBox(10.0F, -16.0F, -4.25F, 10, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  931 */     this.gunModel['Ö'].setRotationPoint(-25.0F, -10.95F, -1.0F);
/*      */     
/*  933 */     this.gunModel['×'].addShapeBox(10.0F, -16.0F, -4.25F, 8, 1, 10, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/*  934 */     this.gunModel['×'].setRotationPoint(-25.0F, -11.1F, -1.0F);
/*      */     
/*  936 */     this.gunModel['Ø'].addShapeBox(10.0F, -16.0F, -4.25F, 28, 3, 6, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  937 */     this.gunModel['Ø'].setRotationPoint(-56.4F, -6.1F, 3.0F);
/*      */     
/*  939 */     this.gunModel['Ù'].addShapeBox(10.0F, -16.0F, -4.25F, 28, 3, 5, 0.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  940 */     this.gunModel['Ù'].setRotationPoint(-56.4F, -9.1F, 3.0F);
/*      */     
/*  942 */     this.gunModel['Ú'].addShapeBox(10.0F, -16.0F, -4.25F, 25, 4, 1, 0.0F, 0.0F, 0.0F, -1.0F, -0.05F, 0.0F, -1.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.05F, 0.25F, 0.0F, -0.05F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  943 */     this.gunModel['Ú'].setRotationPoint(-54.65F, -7.35F, 0.0F);
/*      */     
/*  945 */     this.gunModel['Û'].addShapeBox(10.0F, -16.0F, -4.25F, 24, 3, 5, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
/*  946 */     this.gunModel['Û'].setRotationPoint(-54.4F, -6.6F, 5.0F);
/*      */     
/*  948 */     this.gunModel['Ü'].addShapeBox(10.0F, -16.0F, -4.25F, 24, 3, 5, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
/*  949 */     this.gunModel['Ü'].setRotationPoint(-54.4F, -9.6F, 4.0F);
/*      */     
/*  951 */     this.gunModel['Ý'].addShapeBox(10.0F, -16.0F, -4.25F, 24, 6, 7, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -9.75F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, -0.5F, -9.75F, 0.0F, -0.5F);
/*  952 */     this.gunModel['Ý'].setRotationPoint(-54.4F, -3.6F, 3.0F);
/*      */     
/*  954 */     this.gunModel['Þ'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F);
/*  955 */     this.gunModel['Þ'].setRotationPoint(-44.4F, 2.4F, 3.0F);
/*      */     
/*  957 */     this.gunModel['ß'].addShapeBox(10.0F, -16.0F, -4.25F, 24, 1, 7, 0.0F, 0.25F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, -1.5F, 0.25F, -0.5F, -1.5F, 0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F);
/*  958 */     this.gunModel['ß'].setRotationPoint(-54.4F, -10.6F, 2.0F);
/*      */     
/*  960 */     this.gunModel['à'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 6, 5, 0.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  961 */     this.gunModel['à'].setRotationPoint(-33.65F, -9.6F, -0.5F);
/*      */     
/*  963 */     this.gunModel['á'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 1, 5, 0.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, 1.75F, 0.5F, 1.0F, -0.75F, 0.5F, 1.0F, -0.75F, 0.5F, -0.5F, 1.75F, 0.5F, -0.5F);
/*  964 */     this.gunModel['á'].setRotationPoint(-33.65F, -3.1F, -0.5F);
/*      */     
/*  966 */     this.gunModel['â'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 5, 5, 0.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.5F, 1.0F, -3.75F, 0.5F, 1.0F, -3.75F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  967 */     this.gunModel['â'].setRotationPoint(-35.65F, -1.6F, -0.5F);
/*      */     
/*  969 */     this.gunModel['ã'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 2, 5, 0.0F, -3.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.5F, -3.25F, 0.0F, -1.5F, 0.75F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, -0.5F, 0.75F, 0.5F, -0.5F);
/*  970 */     this.gunModel['ã'].setRotationPoint(-38.65F, -1.6F, -0.5F);
/*      */     
/*  972 */     this.gunModel['ä'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 3, 5, 0.0F, 0.0F, 0.2F, 1.0F, 0.0F, 0.2F, 1.0F, 0.0F, 0.2F, -1.5F, 0.0F, 0.2F, -1.5F, 0.0F, -0.2F, 1.0F, 0.0F, -0.2F, 1.0F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F);
/*  973 */     this.gunModel['ä'].setRotationPoint(-39.4F, 1.1F, -0.5F);
/*      */     
/*  975 */     this.gunModel['å'].addShapeBox(10.0F, -16.0F, -4.25F, 5, 1, 5, 0.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, -1.5F, 0.0F, 0.7F, -1.5F, 0.0F, -0.2F, 1.0F, 0.0F, -0.2F, 1.0F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F);
/*  976 */     this.gunModel['å'].setRotationPoint(-44.4F, 3.1F, -0.5F);
/*      */     
/*  978 */     this.gunModel['æ'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 5, 0.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, -1.5F, 0.0F, 0.7F, -1.5F, 0.0F, -0.7F, 1.0F, -1.5F, -0.7F, 1.0F, -1.5F, -0.7F, -0.5F, 0.0F, -0.7F, -0.5F);
/*  979 */     this.gunModel['æ'].setRotationPoint(-37.4F, 4.6F, -0.5F);
/*      */     
/*  981 */     this.gunModel['ç'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 5, 0.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, -1.5F, 0.0F, 0.7F, -1.5F, -1.5F, -0.7F, 1.0F, 0.0F, -0.7F, 1.0F, 0.0F, -0.7F, -0.5F, -1.5F, -0.7F, -0.5F);
/*  982 */     this.gunModel['ç'].setRotationPoint(-39.4F, 4.6F, -0.5F);
/*      */     
/*  984 */     this.gunModel['è'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 5, 0.0F, -1.0F, 0.7F, 1.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, -1.5F, -1.0F, 0.7F, -1.5F, 0.0F, -0.2F, 1.0F, 0.0F, -0.2F, 1.0F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F);
/*  985 */     this.gunModel['è'].setRotationPoint(-40.4F, 1.6F, -0.5F);
/*      */     
/*  987 */     this.gunModel['é'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 15, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  988 */     this.gunModel['é'].setRotationPoint(54.25F, -21.7F, 1.0F);
/*      */     
/*  990 */     this.gunModel['ê'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  991 */     this.gunModel['ê'].setRotationPoint(54.25F, -23.45F, 1.0F);
/*      */     
/*  993 */     this.gunModel['ë'].addShapeBox(10.0F, -16.0F, -4.25F, 77, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  994 */     this.gunModel['ë'].setRotationPoint(-22.75F, -23.45F, 1.0F);
/*      */     
/*  996 */     this.gunModel['ì'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/*  997 */     this.gunModel['ì'].setRotationPoint(-24.25F, -23.45F, 1.0F);
/*      */     
/*  999 */     this.gunModel['í'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 14, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1000 */     this.gunModel['í'].setRotationPoint(-24.75F, -20.7F, 1.0F);
/*      */     
/* 1002 */     this.gunModel['î'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 3, 2, 0.0F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, 0.4F, -0.25F, 0.0F, 0.4F, -0.25F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, -0.25F);
/* 1003 */     this.gunModel['î'].setRotationPoint(-23.75F, -25.95F, 1.25F);
/*      */     
/* 1005 */     this.gunModel['ï'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 3, 2, 0.0F, 0.0F, 0.4F, -0.25F, 0.0F, 0.4F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, -0.25F);
/* 1006 */     this.gunModel['ï'].setRotationPoint(-23.75F, -25.95F, 4.75F);
/*      */     
/* 1008 */     this.gunModel['ð'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 3, 0.0F, 0.0F, 0.4F, -0.5F, 0.0F, 0.4F, -0.5F, 0.0F, 0.4F, -0.5F, 0.0F, 0.4F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F);
/* 1009 */     this.gunModel['ð'].setRotationPoint(-23.75F, -25.95F, 2.5F);
/*      */     
/* 1011 */     this.gunModel['ñ'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 3, 3, 0.0F, 0.5F, 0.9F, -1.05F, 0.0F, 0.9F, -1.05F, 0.0F, 0.9F, -1.05F, 0.5F, 0.9F, -1.05F, 0.25F, -0.85F, -1.05F, 0.25F, -0.85F, -1.05F, 0.25F, -0.85F, -1.05F, 0.25F, -0.85F, -1.05F);
/* 1012 */     this.gunModel['ñ'].setRotationPoint(52.25F, -24.95F, 2.5F);
/*      */     
/* 1014 */     this.gunModel['ò'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 8, 0.0F, 0.25F, 0.15F, -1.05F, 0.0F, 0.15F, -1.05F, 0.0F, 0.15F, -1.05F, 0.25F, 0.15F, -1.05F, 0.0F, -0.85F, -1.05F, 0.0F, -0.85F, -1.05F, 0.0F, -0.85F, -1.05F, 0.0F, -0.85F, -1.05F);
/* 1015 */     this.gunModel['ò'].setRotationPoint(52.25F, -23.95F, 0.0F);
/*      */     
/* 1017 */     this.gunModel['ó'].addShapeBox(10.0F, -16.0F, -4.25F, 17, 7, 4, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.75F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, -0.4F, 0.75F, 0.0F);
/* 1018 */     this.gunModel['ó'].setRotationPoint(-16.0F, -10.95F, 2.0F);
/*      */     
/* 1020 */     this.gunModel['ô'].addShapeBox(10.0F, -16.0F, -4.25F, 32, 7, 4, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.75F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, -0.4F, 0.75F, 0.0F);
/* 1021 */     this.gunModel['ô'].setRotationPoint(23.0F, -10.95F, 2.0F);
/*      */     
/* 1023 */     this.gunModel['õ'].addShapeBox(10.0F, -16.0F, -4.25F, 25, 6, 4, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.75F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, -0.4F, 0.75F, 0.0F);
/* 1024 */     this.gunModel['õ'].setRotationPoint(-1.0F, -9.95F, 2.0F);
/*      */     
/* 1026 */     this.gunModel['ö'].addShapeBox(10.0F, -16.0F, -4.25F, 24, 1, 1, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.75F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, -0.5F, -0.4F, 0.75F, -0.5F);
/* 1027 */     this.gunModel['ö'].setRotationPoint(0.0F, -10.95F, 2.0F);
/*      */     
/* 1029 */     this.gunModel['÷'].addShapeBox(10.0F, -16.0F, -4.25F, 24, 1, 1, 0.0F, -0.4F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.75F, -0.5F, -0.6F, 0.5F, -0.5F, -0.6F, 0.5F, 0.0F, -0.4F, 0.75F, 0.0F);
/* 1030 */     this.gunModel['÷'].setRotationPoint(0.0F, -10.95F, 5.0F);
/*      */     
/* 1032 */     this.gunModel['ø'].addShapeBox(10.0F, -16.0F, -4.25F, 6, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel['ø'].setRotationPoint(-4.1F, 11.35F, 1.5F);
/*      */     
/* 1035 */     this.gunModel['ù'].addShapeBox(10.0F, -16.0F, -4.25F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1036 */     this.gunModel['ù'].setRotationPoint(1.9F, 11.35F, 1.5F);
/*      */     
/* 1038 */     this.gunModel['ú'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['ú'].setRotationPoint(5.9F, 10.85F, 1.5F);
/*      */     
/* 1041 */     this.gunModel['û'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 2, 5, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['û'].setRotationPoint(6.65F, 9.1F, 1.5F);
/*      */     
/* 1044 */     this.gunModel['ü'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1045 */     this.gunModel['ü'].setRotationPoint(6.65F, 6.1F, 1.5F);
/*      */     
/* 1047 */     this.gunModel['ý'].addShapeBox(10.0F, -16.0F, -4.25F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1048 */     this.gunModel['ý'].setRotationPoint(5.9F, 4.35F, 1.5F);
/*      */     
/* 1050 */     this.gunModel['þ'].addShapeBox(10.0F, -16.0F, -4.25F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1051 */     this.gunModel['þ'].setRotationPoint(-2.1F, 4.8F, 3.0F);
/*      */     
/* 1053 */     this.gunModel['ÿ'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1054 */     this.gunModel['ÿ'].setRotationPoint(-1.1F, 5.8F, 3.0F);
/*      */     
/* 1056 */     this.gunModel['Ā'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -1.0F, 0.25F, 0.0F);
/* 1057 */     this.gunModel['Ā'].setRotationPoint(-0.1F, 7.8F, 3.0F);
/*      */     
/* 1059 */     this.gunModel['ā'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1060 */     this.gunModel['ā'].setRotationPoint(40.4F, -9.2F, 6.8F);
/*      */     
/* 1062 */     this.gunModel['Ă'].addShapeBox(10.0F, -16.0F, -4.25F, 35, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F);
/* 1063 */     this.gunModel['Ă'].setRotationPoint(5.4F, -9.2F, 6.8F);
/*      */     
/* 1065 */     this.gunModel['ă'].addShapeBox(10.0F, -16.0F, -4.25F, 18, 3, 2, 0.0F, 0.0F, -2.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, 0.0F, -2.5F, 1.7F, 0.0F, 1.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.35F, 0.0F, 1.5F, 1.85F);
/* 1066 */     this.gunModel['ă'].setRotationPoint(-12.6F, -9.2F, 6.8F);
/*      */     
/* 1068 */     this.gunModel['Ą'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1069 */     this.gunModel['Ą'].setRotationPoint(-14.6F, -8.2F, 7.8F);
/*      */     
/* 1071 */     this.gunModel['ą'].addShapeBox(10.0F, -16.0F, -4.25F, 3, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1072 */     this.gunModel['ą'].setRotationPoint(40.4F, -9.2F, -1.2F);
/*      */     
/* 1074 */     this.gunModel['Ć'].addShapeBox(10.0F, -16.0F, -4.25F, 35, 3, 2, 0.0F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1075 */     this.gunModel['Ć'].setRotationPoint(5.4F, -9.2F, -1.2F);
/*      */     
/* 1077 */     this.gunModel['ć'].addShapeBox(10.0F, -16.0F, -4.25F, 18, 3, 2, 0.0F, 0.0F, -2.5F, 1.7F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, -2.0F, 0.0F, 1.5F, 1.85F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -2.0F);
/* 1078 */     this.gunModel['ć'].setRotationPoint(-12.6F, -9.2F, -1.2F);
/*      */     
/* 1080 */     this.gunModel['Ĉ'].addShapeBox(10.0F, -16.0F, -4.25F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1081 */     this.gunModel['Ĉ'].setRotationPoint(-14.6F, -8.2F, -3.2F);
/*      */     
/*      */ 
/* 1084 */     this.ammoModel = new ModelRendererTurbo[1];
/* 1085 */     this.ammoModel[0] = new ModelRendererTurbo(this, 345, 185, this.textureX, this.textureY);
/*      */     
/* 1087 */     this.ammoModel[0].addShapeBox(10.0F, -16.0F, -4.25F, 16, 30, 7, 0.0F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 6.0F, 0.15F, -0.5F, 1.0F, 0.15F, -0.5F, 1.0F, 0.15F, 0.0F, 6.0F, 0.15F);
/* 1088 */     this.ammoModel[0].setRotationPoint(-49.6F, 3.3F, 0.5F);
/*      */     
/*      */ 
/* 1091 */     this.slideModel = new ModelRendererTurbo[14];
/* 1092 */     this.slideModel[0] = new ModelRendererTurbo(this, 169, 161, this.textureX, this.textureY);
/* 1093 */     this.slideModel[1] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/* 1094 */     this.slideModel[2] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/* 1095 */     this.slideModel[3] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/* 1096 */     this.slideModel[4] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/* 1097 */     this.slideModel[5] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/* 1098 */     this.slideModel[6] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/* 1099 */     this.slideModel[7] = new ModelRendererTurbo(this, 121, 177, this.textureX, this.textureY);
/* 1100 */     this.slideModel[8] = new ModelRendererTurbo(this, 249, 185, this.textureX, this.textureY);
/* 1101 */     this.slideModel[9] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/* 1102 */     this.slideModel[10] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/* 1103 */     this.slideModel[11] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/* 1104 */     this.slideModel[12] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/* 1105 */     this.slideModel[13] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*      */     
/* 1107 */     this.slideModel[0].addShapeBox(10.0F, -16.0F, -4.25F, 11, 2, 3, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.75F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, -0.4F, 0.75F, 0.0F);
/* 1108 */     this.slideModel[0].setRotationPoint(13.0F, -11.95F, 2.5F);
/*      */     
/* 1110 */     this.slideModel[1].addShapeBox(10.0F, -16.0F, -4.25F, 3, 4, 3, 0.0F, -1.15F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 1111 */     this.slideModel[1].setRotationPoint(13.0F, -15.95F, 2.5F);
/*      */     
/* 1113 */     this.slideModel[2].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 3, 0.0F, -0.9F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 1114 */     this.slideModel[2].setRotationPoint(14.0F, -17.95F, 2.5F);
/*      */     
/* 1116 */     this.slideModel[3].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 3, 0.0F, -1.4F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -1.4F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1117 */     this.slideModel[3].setRotationPoint(15.0F, -19.95F, 2.5F);
/*      */     
/* 1119 */     this.slideModel[4].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, -1.4F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -1.4F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1120 */     this.slideModel[4].setRotationPoint(16.5F, -20.45F, 2.5F);
/*      */     
/* 1122 */     this.slideModel[5].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.75F, 0.0F, -1.35F, 0.5F, 0.0F, -1.35F, 0.5F, 0.0F, -0.4F, 0.75F, 0.0F);
/* 1123 */     this.slideModel[5].setRotationPoint(23.0F, -11.95F, 2.5F);
/*      */     
/* 1125 */     this.slideModel[6].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, -0.4F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 1126 */     this.slideModel[6].setRotationPoint(23.0F, -12.95F, 2.5F);
/*      */     
/* 1128 */     this.slideModel[7].addShapeBox(10.0F, -16.0F, -4.25F, 9, 1, 3, 0.0F, -0.4F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 1129 */     this.slideModel[7].setRotationPoint(15.0F, -12.95F, 2.5F);
/*      */     
/* 1131 */     this.slideModel[8].addShapeBox(10.0F, -16.0F, -4.25F, 7, 1, 3, 0.0F, -0.4F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 1132 */     this.slideModel[8].setRotationPoint(15.0F, -13.7F, 2.5F);
/*      */     
/* 1134 */     this.slideModel[9].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 3, 0.0F, -0.6F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/* 1135 */     this.slideModel[9].setRotationPoint(14.8F, -17.95F, 2.5F);
/*      */     
/* 1137 */     this.slideModel[10].addShapeBox(10.0F, -16.0F, -4.25F, 2, 1, 3, 0.0F, -0.6F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/* 1138 */     this.slideModel[10].setRotationPoint(14.8F, -15.95F, 2.5F);
/*      */     
/* 1140 */     this.slideModel[11].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 3, 0.0F, -0.6F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F);
/* 1141 */     this.slideModel[11].setRotationPoint(14.8F, -14.95F, 2.5F);
/*      */     
/* 1143 */     this.slideModel[12].addShapeBox(10.0F, -16.0F, -4.25F, 2, 2, 3, 0.0F, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -1.8F, -0.5F, 0.0F, -1.8F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F);
/* 1144 */     this.slideModel[12].setRotationPoint(16.5F, -19.45F, 2.5F);
/*      */     
/* 1146 */     this.slideModel[13].addShapeBox(10.0F, -16.0F, -4.25F, 1, 1, 3, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1147 */     this.slideModel[13].setRotationPoint(16.15F, -18.95F, 2.5F);
/*      */     
/*      */ 
/*      */ 
/* 1151 */     translateAll(-0.5F, -8.75F, 0.0F);
/* 1152 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.01F, 0.0F);
/*      */     
/* 1154 */     this.gunSlideDistance = 0.75F;
/* 1155 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 1157 */     this.tiltGun = 5.0F;
/* 1158 */     this.rotateGunVertical = 40.0F;
/* 1159 */     this.rotateGunHorizontal = 10.0F;
/* 1160 */     this.translateGun = new Vector3f(0.5F, 0.0F, 0.0F);
/*      */     
/* 1162 */     this.rotateClipVertical = 5.0F;
/* 1163 */     this.translateClip = new Vector3f(-5.0F, -25.0F, 0.0F);
/*      */     
/*      */ 
/* 1166 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelfamas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */