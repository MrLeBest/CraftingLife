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
/*      */ public class Modelmg36TD
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelmg36TD()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ä'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 41, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 41, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 25, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 49, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 329, 49, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 185, 57, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 353, 57, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*      */     
/*  251 */     this.gunModel[0].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 1, 0.0F, 0.7F, 0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.7F, 0.75F, 0.0F, 1.4F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.4F, 0.0F, 0.0F);
/*  252 */     this.gunModel[0].setRotationPoint(8.0F, -10.0F, 1.0F);
/*      */     
/*  254 */     this.gunModel[1].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  255 */     this.gunModel[1].setRotationPoint(9.0F, -10.0F, 1.0F);
/*      */     
/*  257 */     this.gunModel[2].addShapeBox(-6.0F, 6.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  258 */     this.gunModel[2].setRotationPoint(10.5F, -9.25F, 1.0F);
/*      */     
/*  260 */     this.gunModel[3].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 4, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.1F, 0.0F);
/*  261 */     this.gunModel[3].setRotationPoint(15.25F, -13.5F, 1.0F);
/*      */     
/*  263 */     this.gunModel[4].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 4, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.5F, 0.0F);
/*  264 */     this.gunModel[4].setRotationPoint(15.75F, -14.5F, -0.5F);
/*      */     
/*  266 */     this.gunModel[5].addShapeBox(-6.0F, 6.0F, -1.5F, 13, 5, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  267 */     this.gunModel[5].setRotationPoint(16.25F, -14.5F, -0.5F);
/*      */     
/*  269 */     this.gunModel[6].addShapeBox(-6.0F, 6.0F, -1.5F, 11, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  270 */     this.gunModel[6].setRotationPoint(18.25F, -17.5F, -0.5F);
/*      */     
/*  272 */     this.gunModel[7].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  273 */     this.gunModel[7].setRotationPoint(16.25F, -16.0F, -0.5F);
/*      */     
/*  275 */     this.gunModel[8].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  276 */     this.gunModel[8].setRotationPoint(17.25F, -17.0F, -0.5F);
/*      */     
/*  278 */     this.gunModel[9].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  279 */     this.gunModel[9].setRotationPoint(16.25F, -15.0F, -0.5F);
/*      */     
/*  281 */     this.gunModel[10].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  282 */     this.gunModel[10].setRotationPoint(17.25F, -16.0F, -0.5F);
/*      */     
/*  284 */     this.gunModel[11].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  285 */     this.gunModel[11].setRotationPoint(29.25F, -15.5F, -0.5F);
/*      */     
/*  287 */     this.gunModel[12].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  288 */     this.gunModel[12].setRotationPoint(30.25F, -18.0F, -0.5F);
/*      */     
/*  290 */     this.gunModel[13].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  291 */     this.gunModel[13].setRotationPoint(31.25F, -17.5F, -0.5F);
/*      */     
/*  293 */     this.gunModel[14].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  294 */     this.gunModel[14].setRotationPoint(29.25F, -17.5F, -0.5F);
/*      */     
/*  296 */     this.gunModel[15].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  297 */     this.gunModel[15].setRotationPoint(29.25F, -18.0F, -0.5F);
/*      */     
/*  299 */     this.gunModel[16].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  300 */     this.gunModel[16].setRotationPoint(29.25F, -16.5F, -0.5F);
/*      */     
/*  302 */     this.gunModel[17].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  303 */     this.gunModel[17].setRotationPoint(16.25F, -16.1F, -0.5F);
/*      */     
/*  305 */     this.gunModel[18].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  306 */     this.gunModel[18].setRotationPoint(17.25F, -16.35F, -0.5F);
/*      */     
/*  308 */     this.gunModel[19].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  309 */     this.gunModel[19].setRotationPoint(17.25F, -17.35F, -0.5F);
/*      */     
/*  311 */     this.gunModel[20].addShapeBox(-6.0F, 6.0F, -1.5F, 32, 3, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  312 */     this.gunModel[20].setRotationPoint(0.25F, -20.65F, -0.5F);
/*      */     
/*  314 */     this.gunModel[21].addShapeBox(-6.0F, 6.0F, -1.5F, 32, 3, 4, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F);
/*  315 */     this.gunModel[21].setRotationPoint(0.25F, -22.65F, -0.5F);
/*      */     
/*  317 */     this.gunModel[22].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  318 */     this.gunModel[22].setRotationPoint(18.25F, -20.65F, -0.5F);
/*      */     
/*  320 */     this.gunModel[23].addShapeBox(-6.0F, 6.0F, -1.5F, 18, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  321 */     this.gunModel[23].setRotationPoint(0.25F, -22.65F, -0.5F);
/*      */     
/*  323 */     this.gunModel[24].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/*  324 */     this.gunModel[24].setRotationPoint(18.25F, -21.45F, -0.5F);
/*      */     
/*  326 */     this.gunModel[25].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  327 */     this.gunModel[25].setRotationPoint(29.25F, -22.65F, -0.5F);
/*      */     
/*  329 */     this.gunModel[26].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F);
/*  330 */     this.gunModel[26].setRotationPoint(26.25F, -20.65F, -0.5F);
/*      */     
/*  332 */     this.gunModel[27].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/*  333 */     this.gunModel[27].setRotationPoint(26.25F, -21.45F, -0.5F);
/*      */     
/*  335 */     this.gunModel[28].addShapeBox(-6.0F, 6.0F, -1.5F, 0, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  336 */     this.gunModel[28].setRotationPoint(32.25F, -22.65F, 3.1F);
/*      */     
/*  338 */     this.gunModel[29].addShapeBox(-6.0F, 6.0F, -1.5F, 32, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  339 */     this.gunModel[29].setRotationPoint(0.25F, -22.65F, 3.1F);
/*      */     
/*  341 */     this.gunModel[30].addShapeBox(-6.0F, 6.0F, -1.5F, 16, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.85F, -0.25F, 0.0F, -0.85F, -0.25F, 0.0F, -0.85F, -0.25F, 0.0F, -0.85F, -0.25F);
/*  342 */     this.gunModel[30].setRotationPoint(18.25F, -17.65F, -0.5F);
/*      */     
/*  344 */     this.gunModel[31].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.3F, -0.25F, -0.9F, 0.3F, -0.25F, -0.9F, 0.3F, -0.25F, 0.0F, 0.3F, -0.25F, 0.0F, 0.0F, -0.25F, -0.9F, 0.0F, -0.25F, -0.9F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  345 */     this.gunModel[31].setRotationPoint(18.15F, -17.35F, -0.5F);
/*      */     
/*  347 */     this.gunModel[32].addShapeBox(-6.0F, 6.0F, -1.5F, 32, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  348 */     this.gunModel[32].setRotationPoint(0.25F, -23.65F, -0.5F);
/*      */     
/*  350 */     this.gunModel[33].addShapeBox(-6.0F, 6.0F, -1.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F);
/*  351 */     this.gunModel[33].setRotationPoint(18.25F, -22.65F, -0.5F);
/*      */     
/*  353 */     this.gunModel[34].addShapeBox(-6.0F, 6.0F, -1.5F, 6, 4, 4, 0.0F, 0.5F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.5F, 1.55F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  354 */     this.gunModel[34].setRotationPoint(10.25F, -16.1F, -0.5F);
/*      */     
/*  356 */     this.gunModel[35].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  357 */     this.gunModel[35].setRotationPoint(16.25F, -17.35F, -0.5F);
/*      */     
/*  359 */     this.gunModel[36].addShapeBox(-6.0F, 6.0F, -1.5F, 37, 1, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  360 */     this.gunModel[36].setRotationPoint(0.25F, -24.65F, -0.5F);
/*      */     
/*  362 */     this.gunModel[37].addShapeBox(-6.0F, 6.0F, -1.5F, 16, 2, 4, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  363 */     this.gunModel[37].setRotationPoint(0.25F, -26.15F, -0.5F);
/*      */     
/*  365 */     this.gunModel[38].addShapeBox(-6.0F, 6.0F, -1.5F, 16, 1, 4, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  366 */     this.gunModel[38].setRotationPoint(0.25F, -26.65F, -0.5F);
/*      */     
/*  368 */     this.gunModel[39].addShapeBox(-6.0F, 6.0F, -1.5F, 21, 1, 4, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
/*  369 */     this.gunModel[39].setRotationPoint(16.25F, -25.15F, -0.5F);
/*      */     
/*  371 */     this.gunModel[40].addShapeBox(-3.0F, 1.0F, 0.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  372 */     this.gunModel[40].setRotationPoint(14.0F, -9.0F, -3.0F);
/*      */     
/*  374 */     this.gunModel[41].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.75F, -0.5F, -1.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  375 */     this.gunModel[41].setRotationPoint(16.0F, -9.0F, -3.0F);
/*      */     
/*  377 */     this.gunModel[42].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  378 */     this.gunModel[42].setRotationPoint(13.0F, -9.0F, -3.0F);
/*      */     
/*  380 */     this.gunModel[43].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  381 */     this.gunModel[43].setRotationPoint(13.0F, -8.0F, -3.0F);
/*      */     
/*  383 */     this.gunModel[44].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  384 */     this.gunModel[44].setRotationPoint(13.0F, -8.5F, -3.0F);
/*      */     
/*  386 */     this.gunModel[45].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  387 */     this.gunModel[45].setRotationPoint(14.0F, -8.5F, -3.5F);
/*      */     
/*  389 */     this.gunModel[46].addShapeBox(-6.0F, 6.0F, -1.5F, 11, 2, 4, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F);
/*  390 */     this.gunModel[46].setRotationPoint(5.25F, -28.55F, -0.5F);
/*      */     
/*  392 */     this.gunModel[47].addShapeBox(-6.0F, 6.0F, -1.5F, 11, 3, 4, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  393 */     this.gunModel[47].setRotationPoint(5.25F, -30.55F, -0.5F);
/*      */     
/*  395 */     this.gunModel[48].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  396 */     this.gunModel[48].setRotationPoint(6.25F, -27.25F, 0.0F);
/*      */     
/*  398 */     this.gunModel[49].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  399 */     this.gunModel[49].setRotationPoint(14.25F, -27.25F, 0.0F);
/*      */     
/*  401 */     this.gunModel[50].addShapeBox(-6.0F, 6.0F, -1.5F, 9, 2, 4, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  402 */     this.gunModel[50].setRotationPoint(5.25F, -31.55F, -0.5F);
/*      */     
/*  404 */     this.gunModel[51].addShapeBox(-6.0F, 6.0F, -1.5F, 9, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  405 */     this.gunModel[51].setRotationPoint(5.25F, -32.05F, 1.25F);
/*      */     
/*  407 */     this.gunModel[52].addShapeBox(-6.0F, 6.0F, -1.5F, 9, 1, 1, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  408 */     this.gunModel[52].setRotationPoint(5.25F, -32.05F, 0.5F);
/*      */     
/*  410 */     this.gunModel[53].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  411 */     this.gunModel[53].setRotationPoint(4.25F, -29.55F, 1.0F);
/*      */     
/*  413 */     this.gunModel[54].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.6F, 1.0F, -0.2F, -0.6F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 1.0F, 0.0F, -0.6F);
/*  414 */     this.gunModel[54].setRotationPoint(28.25F, -21.65F, -0.5F);
/*      */     
/*  416 */     this.gunModel[55].addShapeBox(-6.0F, 6.0F, -1.5F, 18, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  417 */     this.gunModel[55].setRotationPoint(15.25F, -31.55F, -0.5F);
/*      */     
/*  419 */     this.gunModel[56].addShapeBox(-6.0F, 6.0F, -1.5F, 18, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  420 */     this.gunModel[56].setRotationPoint(15.25F, -31.55F, 2.25F);
/*      */     
/*  422 */     this.gunModel[57].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 4, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  423 */     this.gunModel[57].setRotationPoint(14.25F, -31.55F, -0.5F);
/*      */     
/*  425 */     this.gunModel[58].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  426 */     this.gunModel[58].setRotationPoint(15.25F, -31.55F, 0.5F);
/*      */     
/*  428 */     this.gunModel[59].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  429 */     this.gunModel[59].setRotationPoint(16.25F, -30.55F, -0.5F);
/*      */     
/*  431 */     this.gunModel[60].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  432 */     this.gunModel[60].setRotationPoint(17.25F, -30.55F, -0.5F);
/*      */     
/*  434 */     this.gunModel[61].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  435 */     this.gunModel[61].setRotationPoint(16.25F, -30.55F, 2.25F);
/*      */     
/*  437 */     this.gunModel[62].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  438 */     this.gunModel[62].setRotationPoint(17.25F, -30.55F, 2.25F);
/*      */     
/*  440 */     this.gunModel[63].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 2, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  441 */     this.gunModel[63].setRotationPoint(19.25F, -31.55F, 0.5F);
/*      */     
/*  443 */     this.gunModel[64].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  444 */     this.gunModel[64].setRotationPoint(19.25F, -31.55F, 0.5F);
/*      */     
/*  446 */     this.gunModel[65].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  447 */     this.gunModel[65].setRotationPoint(19.25F, -31.55F, 2.0F);
/*      */     
/*  449 */     this.gunModel[66].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 2, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  450 */     this.gunModel[66].setRotationPoint(24.75F, -31.55F, 0.5F);
/*      */     
/*  452 */     this.gunModel[67].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.5F, -1.0F, -0.7F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/*  453 */     this.gunModel[67].setRotationPoint(23.75F, -31.55F, 0.5F);
/*      */     
/*  455 */     this.gunModel[68].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/*  456 */     this.gunModel[68].setRotationPoint(21.75F, -31.55F, 0.5F);
/*      */     
/*  458 */     this.gunModel[69].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/*  459 */     this.gunModel[69].setRotationPoint(21.75F, -31.55F, 2.0F);
/*      */     
/*  461 */     this.gunModel[70].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, -1.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/*  462 */     this.gunModel[70].setRotationPoint(23.75F, -31.55F, 2.0F);
/*      */     
/*  464 */     this.gunModel[71].addShapeBox(-6.0F, 6.0F, -1.5F, 6, 2, 2, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  465 */     this.gunModel[71].setRotationPoint(27.75F, -31.55F, 0.5F);
/*      */     
/*  467 */     this.gunModel[72].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 1, 0.0F, 0.25F, -0.7F, -0.25F, -0.5F, -0.7F, -0.25F, -0.5F, -0.7F, -0.25F, 0.25F, -0.7F, -0.25F, 0.25F, -0.65F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.65F, -0.25F);
/*  468 */     this.gunModel[72].setRotationPoint(31.75F, -31.55F, 1.0F);
/*      */     
/*  470 */     this.gunModel[73].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  471 */     this.gunModel[73].setRotationPoint(31.75F, -17.5F, -0.5F);
/*      */     
/*  473 */     this.gunModel[74].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  474 */     this.gunModel[74].setRotationPoint(29.75F, -17.5F, -0.5F);
/*      */     
/*  476 */     this.gunModel[75].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 7, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  477 */     this.gunModel[75].setRotationPoint(32.25F, -24.65F, -0.5F);
/*      */     
/*  479 */     this.gunModel[76].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 2.0F, 0.5F, 0.5F);
/*  480 */     this.gunModel[76].setRotationPoint(34.25F, -23.65F, -1.0F);
/*      */     
/*  482 */     this.gunModel[77].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  483 */     this.gunModel[77].setRotationPoint(17.3F, -16.35F, -0.5F);
/*      */     
/*  485 */     this.gunModel[78].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  486 */     this.gunModel[78].setRotationPoint(16.3F, -16.35F, -0.5F);
/*      */     
/*  488 */     this.gunModel[79].addShapeBox(-6.0F, 6.0F, -1.5F, 27, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  489 */     this.gunModel[79].setRotationPoint(36.25F, -23.65F, -1.0F);
/*      */     
/*  491 */     this.gunModel[80].addShapeBox(-5.0F, 6.0F, -1.5F, 2, 2, 5, 0.0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  492 */     this.gunModel[80].setRotationPoint(36.25F, -25.65F, -1.0F);
/*      */     
/*  494 */     this.gunModel[81].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  495 */     this.gunModel[81].setRotationPoint(60.75F, -25.65F, 2.5F);
/*      */     
/*  497 */     this.gunModel[82].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F);
/*  498 */     this.gunModel[82].setRotationPoint(58.75F, -25.65F, 2.5F);
/*      */     
/*  500 */     this.gunModel[83].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, -1.0F, 0.25F, -0.15F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  501 */     this.gunModel[83].setRotationPoint(58.75F, -24.15F, 2.5F);
/*      */     
/*  503 */     this.gunModel[84].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F);
/*  504 */     this.gunModel[84].setRotationPoint(55.75F, -25.65F, 2.5F);
/*      */     
/*  506 */     this.gunModel[85].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, -1.0F, 0.25F, -0.15F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  507 */     this.gunModel[85].setRotationPoint(55.75F, -24.15F, 2.5F);
/*      */     
/*  509 */     this.gunModel[86].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  510 */     this.gunModel[86].setRotationPoint(57.75F, -25.65F, 2.5F);
/*      */     
/*  512 */     this.gunModel[87].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  513 */     this.gunModel[87].setRotationPoint(54.75F, -25.65F, 2.5F);
/*      */     
/*  515 */     this.gunModel[88].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  516 */     this.gunModel[88].setRotationPoint(51.75F, -25.65F, 2.5F);
/*      */     
/*  518 */     this.gunModel[89].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, -1.0F, 0.25F, -0.15F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  519 */     this.gunModel[89].setRotationPoint(52.75F, -24.15F, 2.5F);
/*      */     
/*  521 */     this.gunModel[90].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F);
/*  522 */     this.gunModel[90].setRotationPoint(52.75F, -25.65F, 2.5F);
/*      */     
/*  524 */     this.gunModel[91].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  525 */     this.gunModel[91].setRotationPoint(48.75F, -25.65F, 2.5F);
/*      */     
/*  527 */     this.gunModel[92].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, -1.0F, 0.25F, -0.15F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  528 */     this.gunModel[92].setRotationPoint(49.75F, -24.15F, 2.5F);
/*      */     
/*  530 */     this.gunModel[93].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F);
/*  531 */     this.gunModel[93].setRotationPoint(49.75F, -25.65F, 2.5F);
/*      */     
/*  533 */     this.gunModel[94].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  534 */     this.gunModel[94].setRotationPoint(45.75F, -25.65F, 2.5F);
/*      */     
/*  536 */     this.gunModel[95].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, -1.0F, 0.25F, -0.15F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  537 */     this.gunModel[95].setRotationPoint(46.75F, -24.15F, 2.5F);
/*      */     
/*  539 */     this.gunModel[96].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F);
/*  540 */     this.gunModel[96].setRotationPoint(46.75F, -25.65F, 2.5F);
/*      */     
/*  542 */     this.gunModel[97].addShapeBox(-6.0F, 6.0F, -1.5F, 6, 2, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.4F, -1.5F, 0.0F, -0.4F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  543 */     this.gunModel[97].setRotationPoint(38.25F, -25.65F, 2.5F);
/*      */     
/*  545 */     this.gunModel[98].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, -1.0F, 0.25F, -0.15F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  546 */     this.gunModel[98].setRotationPoint(43.75F, -24.15F, 2.5F);
/*      */     
/*  548 */     this.gunModel[99].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F);
/*  549 */     this.gunModel[99].setRotationPoint(43.75F, -25.65F, 2.5F);
/*      */     
/*  551 */     this.gunModel[100].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.5F, 0.0F, -0.4F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  552 */     this.gunModel[100].setRotationPoint(60.75F, -25.65F, -0.5F);
/*      */     
/*  554 */     this.gunModel[101].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  555 */     this.gunModel[101].setRotationPoint(58.75F, -24.15F, -0.5F);
/*      */     
/*  557 */     this.gunModel[102].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  558 */     this.gunModel[102].setRotationPoint(58.75F, -25.65F, -0.5F);
/*      */     
/*  560 */     this.gunModel[103].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  561 */     this.gunModel[103].setRotationPoint(57.75F, -25.65F, -0.5F);
/*      */     
/*  563 */     this.gunModel[104].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  564 */     this.gunModel[104].setRotationPoint(54.75F, -25.65F, -0.5F);
/*      */     
/*  566 */     this.gunModel[105].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  567 */     this.gunModel[105].setRotationPoint(55.75F, -24.15F, -0.5F);
/*      */     
/*  569 */     this.gunModel[106].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  570 */     this.gunModel[106].setRotationPoint(55.75F, -25.65F, -0.5F);
/*      */     
/*  572 */     this.gunModel[107].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  573 */     this.gunModel[107].setRotationPoint(51.75F, -25.65F, -0.5F);
/*      */     
/*  575 */     this.gunModel[108].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  576 */     this.gunModel[108].setRotationPoint(52.75F, -24.15F, -0.5F);
/*      */     
/*  578 */     this.gunModel[109].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  579 */     this.gunModel[109].setRotationPoint(52.75F, -25.65F, -0.5F);
/*      */     
/*  581 */     this.gunModel[110].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  582 */     this.gunModel[110].setRotationPoint(48.75F, -25.65F, -0.5F);
/*      */     
/*  584 */     this.gunModel[111].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  585 */     this.gunModel[111].setRotationPoint(49.75F, -24.15F, -0.5F);
/*      */     
/*  587 */     this.gunModel[112].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  588 */     this.gunModel[112].setRotationPoint(49.75F, -25.65F, -0.5F);
/*      */     
/*  590 */     this.gunModel[113].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  591 */     this.gunModel[113].setRotationPoint(45.75F, -25.65F, -0.5F);
/*      */     
/*  593 */     this.gunModel[114].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  594 */     this.gunModel[114].setRotationPoint(46.75F, -24.15F, -0.5F);
/*      */     
/*  596 */     this.gunModel[115].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  597 */     this.gunModel[115].setRotationPoint(46.75F, -25.65F, -0.5F);
/*      */     
/*  599 */     this.gunModel[116].addShapeBox(-6.0F, 6.0F, -1.5F, 6, 2, 1, 0.0F, -1.5F, 0.0F, -0.4F, 0.5F, 0.0F, -0.4F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  600 */     this.gunModel[116].setRotationPoint(38.25F, -25.65F, -0.5F);
/*      */     
/*  602 */     this.gunModel[117].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  603 */     this.gunModel[117].setRotationPoint(43.75F, -24.15F, -0.5F);
/*      */     
/*  605 */     this.gunModel[118].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  606 */     this.gunModel[118].setRotationPoint(43.75F, -25.65F, -0.5F);
/*      */     
/*  608 */     this.gunModel[119].addShapeBox(-6.0F, 6.0F, -1.5F, 23, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  609 */     this.gunModel[119].setRotationPoint(39.75F, -25.65F, 0.5F);
/*      */     
/*  611 */     this.gunModel[120].addShapeBox(-6.0F, 6.0F, -1.5F, 23, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  612 */     this.gunModel[120].setRotationPoint(39.75F, -26.65F, 2.1F);
/*      */     
/*  614 */     this.gunModel[121].addShapeBox(-6.0F, 6.0F, -1.5F, 23, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  615 */     this.gunModel[121].setRotationPoint(39.75F, -26.65F, -0.1F);
/*      */     
/*  617 */     this.gunModel[122].addShapeBox(-6.0F, 6.0F, -1.5F, 23, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
/*  618 */     this.gunModel[122].setRotationPoint(39.75F, -26.65F, 0.9F);
/*      */     
/*  620 */     this.gunModel[123].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  621 */     this.gunModel[123].setRotationPoint(32.25F, -19.65F, -0.5F);
/*      */     
/*  623 */     this.gunModel[124].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.1F, 0.0F);
/*  624 */     this.gunModel[124].setRotationPoint(33.75F, -19.15F, -0.5F);
/*      */     
/*  626 */     this.gunModel[125].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  627 */     this.gunModel[125].setRotationPoint(62.75F, -23.65F, -1.0F);
/*      */     
/*  629 */     this.gunModel[126].addShapeBox(-6.0F, 6.0F, -1.5F, 34, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  630 */     this.gunModel[126].setRotationPoint(32.25F, -19.15F, -1.5F);
/*      */     
/*  632 */     this.gunModel[127].addShapeBox(-6.0F, 6.0F, -1.5F, 34, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  633 */     this.gunModel[127].setRotationPoint(32.25F, -19.15F, -0.5F);
/*      */     
/*  635 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 32, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  636 */     this.gunModel[''].setRotationPoint(33.75F, -19.15F, 0.5F);
/*      */     
/*  638 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 29, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/*  639 */     this.gunModel[''].setRotationPoint(36.75F, -19.15F, 2.5F);
/*      */     
/*  641 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 29, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/*  642 */     this.gunModel[''].setRotationPoint(36.75F, -19.15F, -1.0F);
/*      */     
/*  644 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  645 */     this.gunModel[''].setRotationPoint(62.75F, -22.25F, 0.5F);
/*      */     
/*  647 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 5, 2, 2, 0.0F, -0.5F, 0.25F, 0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F);
/*  648 */     this.gunModel[''].setRotationPoint(74.75F, -22.25F, 0.5F);
/*      */     
/*  650 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 2, 0.0F, -0.5F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/*  651 */     this.gunModel[''].setRotationPoint(67.75F, -22.25F, 0.5F);
/*      */     
/*  653 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 4, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 3.5F, -0.25F, 0.0F, 3.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  654 */     this.gunModel[''].setRotationPoint(33.25F, -31.55F, -0.5F);
/*      */     
/*  656 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.55F, -1.5F, -0.25F, -0.55F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, -0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  657 */     this.gunModel[''].setRotationPoint(37.25F, -27.55F, -0.5F);
/*      */     
/*  659 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 3, 0.0F, 0.0F, 0.0F, -0.25F, -0.55F, -1.5F, -0.25F, -0.55F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, -0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[''].setRotationPoint(37.25F, -27.55F, 0.25F);
/*      */     
/*  662 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 4, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 3.5F, -0.25F, 0.0F, 3.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  663 */     this.gunModel[''].setRotationPoint(33.25F, -31.55F, 2.25F);
/*      */     
/*  665 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 4, 4, 0.0F, 1.5F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 1.5F, 1.55F, 0.0F, 1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.25F, 0.0F);
/*  666 */     this.gunModel[''].setRotationPoint(8.75F, -16.1F, -0.5F);
/*      */     
/*  668 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 4, 4, 0.0F, 0.5F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.5F, 1.55F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  669 */     this.gunModel[''].setRotationPoint(5.25F, -16.1F, -0.5F);
/*      */     
/*  671 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 3, 4, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  672 */     this.gunModel[''].setRotationPoint(0.25F, -16.1F, -0.5F);
/*      */     
/*  674 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 4, 4, 0.0F, 0.0F, 1.55F, 0.0F, 0.5F, 1.55F, 0.0F, 0.5F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  675 */     this.gunModel[''].setRotationPoint(2.25F, -16.1F, -0.5F);
/*      */     
/*  677 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 4, 4, 0.0F, -2.0F, 1.55F, 0.0F, 1.0F, 1.55F, 0.0F, 1.0F, 1.55F, 0.0F, -2.0F, 1.55F, 0.0F, -2.0F, -1.5F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, -2.0F, -1.5F, 0.0F);
/*  678 */     this.gunModel[''].setRotationPoint(-0.75F, -16.1F, -0.5F);
/*      */     
/*  680 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 4.5F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.5F, -0.5F, 0.0F);
/*  681 */     this.gunModel[''].setRotationPoint(5.25F, -12.1F, -0.25F);
/*      */     
/*  683 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 4.5F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.5F, -0.5F, 0.0F);
/*  684 */     this.gunModel[''].setRotationPoint(5.25F, -12.1F, 2.25F);
/*      */     
/*  686 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 4.5F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, 4.5F, -0.5F, 0.5F);
/*  687 */     this.gunModel[''].setRotationPoint(5.25F, -12.1F, 0.75F);
/*      */     
/*  689 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 7, 1, 0.0F, 0.5F, 0.0F, -1.0F, -1.28F, 0.0F, 0.0F, -1.28F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 4.0F, -1.0F, -1.0F, -4.0F, -0.65F, 0.0F, -4.0F, -0.65F, 0.0F, 4.0F, -1.0F, 0.0F);
/*  690 */     this.gunModel[''].setRotationPoint(0.75F, -9.1F, -0.25F);
/*      */     
/*  692 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 1, 0.0F, -0.5F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F, -0.42F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  693 */     this.gunModel[''].setRotationPoint(0.75F, -11.1F, -0.25F);
/*      */     
/*  695 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -0.65F, -0.5F, -1.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.65F, -0.5F, 0.0F, -0.5F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  696 */     this.gunModel[''].setRotationPoint(0.75F, -12.1F, -0.25F);
/*      */     
/*  698 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, 1.0F, 0.5F, -1.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.6F, 0.0F, -1.0F, -1.45F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F);
/*  699 */     this.gunModel[''].setRotationPoint(2.0F, -12.6F, -0.25F);
/*      */     
/*  701 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 7, 1, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 4.0F, -1.0F, 0.0F, -4.0F, -0.65F, 0.0F, -4.0F, -0.65F, 0.5F, 4.0F, -1.0F, 0.5F);
/*  702 */     this.gunModel[''].setRotationPoint(0.75F, -9.1F, 0.75F);
/*      */     
/*  704 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/*  705 */     this.gunModel[''].setRotationPoint(0.75F, -11.1F, 0.75F);
/*      */     
/*  707 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -0.65F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.5F, -0.65F, -0.5F, 0.5F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  708 */     this.gunModel[''].setRotationPoint(0.75F, -12.1F, 0.75F);
/*      */     
/*  710 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, 1.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 0.6F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.6F, 0.0F, 0.5F);
/*  711 */     this.gunModel[''].setRotationPoint(2.0F, -12.6F, 0.75F);
/*      */     
/*  713 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 7, 1, 0.0F, 0.5F, 0.0F, 0.0F, -1.28F, 0.0F, 0.0F, -1.28F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 4.0F, -1.0F, 0.0F, -4.0F, -0.65F, 0.0F, -4.0F, -0.65F, 0.0F, 4.0F, -1.0F, -1.0F);
/*  714 */     this.gunModel[''].setRotationPoint(0.75F, -9.1F, 2.25F);
/*      */     
/*  716 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.42F, 0.0F, 0.0F, -0.42F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -1.28F, 0.0F, 0.0F, -1.28F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/*  717 */     this.gunModel[''].setRotationPoint(0.75F, -11.1F, 2.25F);
/*      */     
/*  719 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, -0.65F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.65F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F);
/*  720 */     this.gunModel[''].setRotationPoint(0.75F, -12.1F, 2.25F);
/*      */     
/*  722 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, 1.0F, 0.5F, 0.0F, -0.7F, 0.5F, 0.0F, -0.7F, 0.5F, 0.0F, 1.0F, 0.5F, -1.0F, 0.6F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.48F, 0.0F, 0.0F, 0.6F, 0.0F, -1.0F);
/*  723 */     this.gunModel[''].setRotationPoint(2.0F, -12.6F, 2.25F);
/*      */     
/*  725 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 10, 3, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 4.5F, -0.65F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.5F, 4.5F, -0.65F, 0.5F);
/*  726 */     this.gunModel[''].setRotationPoint(4.25F, -12.1F, -0.25F);
/*      */     
/*  728 */     this.gunModel[''].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  729 */     this.gunModel[''].setRotationPoint(4.25F, -2.35F, -0.25F);
/*      */     
/*  731 */     this.gunModel[' '].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F);
/*  732 */     this.gunModel[' '].setRotationPoint(4.25F, -3.1F, -0.25F);
/*      */     
/*  734 */     this.gunModel['¡'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F);
/*  735 */     this.gunModel['¡'].setRotationPoint(4.25F, -3.1F, 0.75F);
/*      */     
/*  737 */     this.gunModel['¢'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  738 */     this.gunModel['¢'].setRotationPoint(4.25F, -2.35F, 0.75F);
/*      */     
/*  740 */     this.gunModel['£'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F);
/*  741 */     this.gunModel['£'].setRotationPoint(4.25F, -3.1F, 1.75F);
/*      */     
/*  743 */     this.gunModel['¤'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  744 */     this.gunModel['¤'].setRotationPoint(4.25F, -2.35F, 1.75F);
/*      */     
/*  746 */     this.gunModel['¥'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F);
/*  747 */     this.gunModel['¥'].setRotationPoint(4.25F, -3.1F, 2.75F);
/*      */     
/*  749 */     this.gunModel['¦'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/*  750 */     this.gunModel['¦'].setRotationPoint(4.25F, -2.35F, 2.75F);
/*      */     
/*  752 */     this.gunModel['§'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.4F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  753 */     this.gunModel['§'].setRotationPoint(3.75F, -13.1F, -0.25F);
/*      */     
/*  755 */     this.gunModel['¨'].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, 1.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.75F, -0.75F, 0.5F, 1.25F, 1.0F, 0.5F, 0.5F, 1.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.75F, -1.5F, -0.5F, 1.25F, 1.0F, -0.5F, 0.5F);
/*  756 */     this.gunModel['¨'].setRotationPoint(2.0F, -13.6F, 0.75F);
/*      */     
/*  758 */     this.gunModel['©'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 5, 3, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  759 */     this.gunModel['©'].setRotationPoint(-11.5F, -21.6F, 0.0F);
/*      */     
/*  761 */     this.gunModel['ª'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  762 */     this.gunModel['ª'].setRotationPoint(-11.5F, -17.1F, 0.0F);
/*      */     
/*  764 */     this.gunModel['«'].addShapeBox(-6.0F, 6.0F, -1.5F, 7, 2, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  765 */     this.gunModel['«'].setRotationPoint(-18.75F, -16.1F, 0.0F);
/*      */     
/*  767 */     this.gunModel['¬'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  768 */     this.gunModel['¬'].setRotationPoint(-20.75F, -14.1F, 0.0F);
/*      */     
/*  770 */     this.gunModel['­'].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 6, 3, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  771 */     this.gunModel['­'].setRotationPoint(-23.75F, -14.1F, 0.0F);
/*      */     
/*  773 */     this.gunModel['®'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 8, 3, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/*  774 */     this.gunModel['®'].setRotationPoint(-25.75F, -14.1F, 0.0F);
/*      */     
/*  776 */     this.gunModel['¯'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 19, 3, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  777 */     this.gunModel['¯'].setRotationPoint(-26.75F, -22.1F, 0.0F);
/*      */     
/*  779 */     this.gunModel['°'].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  780 */     this.gunModel['°'].setRotationPoint(-11.75F, -16.1F, 0.0F);
/*      */     
/*  782 */     this.gunModel['±'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  783 */     this.gunModel['±'].setRotationPoint(-4.5F, -17.1F, 0.0F);
/*      */     
/*  785 */     this.gunModel['²'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 5, 3, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  786 */     this.gunModel['²'].setRotationPoint(-4.5F, -21.6F, 0.0F);
/*      */     
/*  788 */     this.gunModel['³'].addShapeBox(-6.0F, 6.0F, -1.5F, 4, 6, 3, 0.0F, 0.0F, 1.55F, 0.0F, -0.25F, 1.55F, 0.0F, -0.25F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  789 */     this.gunModel['³'].setRotationPoint(-3.5F, -21.6F, 0.0F);
/*      */     
/*  791 */     this.gunModel['´'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  792 */     this.gunModel['´'].setRotationPoint(-10.5F, -20.1F, 0.0F);
/*      */     
/*  794 */     this.gunModel['µ'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  795 */     this.gunModel['µ'].setRotationPoint(-5.0F, -20.1F, 0.0F);
/*      */     
/*  797 */     this.gunModel['¶'].addShapeBox(-6.0F, 6.0F, -1.5F, 5, 2, 3, 0.0F, -0.5F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, -0.5F, 1.55F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  798 */     this.gunModel['¶'].setRotationPoint(-9.5F, -21.6F, 0.0F);
/*      */     
/*  800 */     this.gunModel['·'].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 3, 1, 0.0F, 0.0F, -1.25F, 1.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -1.25F, 1.0F, 0.0F, 0.05F, 1.0F, -0.25F, 0.05F, 1.0F, -0.25F, 0.05F, 1.0F, 0.0F, 0.05F, 1.0F);
/*  801 */     this.gunModel['·'].setRotationPoint(-2.5F, -26.2F, 1.0F);
/*      */     
/*  803 */     this.gunModel['¸'].addShapeBox(-6.0F, 6.0F, -1.5F, 4, 3, 3, 0.0F, 0.0F, -2.5F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F);
/*  804 */     this.gunModel['¸'].setRotationPoint(-6.25F, -26.2F, 0.0F);
/*      */     
/*  806 */     this.gunModel['¹'].addShapeBox(-6.0F, 6.0F, -1.5F, 3, 3, 3, 0.0F, 0.0F, -3.05F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.0F, -3.05F, 0.0F, 0.0F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F);
/*  807 */     this.gunModel['¹'].setRotationPoint(-9.0F, -26.2F, 0.0F);
/*      */     
/*  809 */     this.gunModel['º'].addShapeBox(-6.0F, 6.0F, -1.5F, 15, 3, 3, 0.0F, 0.0F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  810 */     this.gunModel['º'].setRotationPoint(-25.75F, -24.15F, 0.0F);
/*      */     
/*  812 */     this.gunModel['»'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.45F, 0.0F, 0.5F, 0.55F, 0.0F, 0.5F, 0.55F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.55F, 0.0F, 0.5F, -0.55F, 0.0F, 0.5F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F);
/*  813 */     this.gunModel['»'].setRotationPoint(-11.5F, -22.6F, 0.0F);
/*      */     
/*  815 */     this.gunModel['¼'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 3, 0.0F, -0.5F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, -0.5F, 1.55F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  816 */     this.gunModel['¼'].setRotationPoint(-11.0F, -20.6F, 0.0F);
/*      */     
/*  818 */     this.gunModel['½'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  819 */     this.gunModel['½'].setRotationPoint(-25.75F, -14.1F, 0.0F);
/*      */     
/*  821 */     this.gunModel['¾'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  822 */     this.gunModel['¾'].setRotationPoint(-25.75F, -21.15F, 0.0F);
/*      */     
/*  824 */     this.gunModel['¿'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  825 */     this.gunModel['¿'].setRotationPoint(-12.5F, -21.15F, 0.0F);
/*      */     
/*  827 */     this.gunModel['À'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 18, 3, 0.0F, 0.0F, -0.95F, 0.1F, 0.0F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F, 0.0F, -0.95F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F);
/*  828 */     this.gunModel['À'].setRotationPoint(-27.75F, -22.1F, 0.0F);
/*      */     
/*  830 */     this.gunModel['Á'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 17, 3, 0.0F, -0.5F, -1.95F, 0.1F, 0.0F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F, -0.5F, -1.95F, 0.1F, -0.5F, -1.45F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, -0.5F, -1.45F, 0.1F);
/*  831 */     this.gunModel['Á'].setRotationPoint(-28.75F, -21.1F, 0.0F);
/*      */     
/*  833 */     this.gunModel['Â'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 7, 3, 0.0F, -1.0F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F, -1.0F, -0.2F, 0.1F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F);
/*  834 */     this.gunModel['Â'].setRotationPoint(-29.25F, -19.35F, 0.0F);
/*      */     
/*  836 */     this.gunModel['Ã'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 7, 3, 0.0F, -0.5F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F, -0.5F, 0.05F, 0.1F, -1.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, -1.0F, -0.25F, 0.1F);
/*  837 */     this.gunModel['Ã'].setRotationPoint(-29.25F, -12.3F, 0.0F);
/*      */     
/*  839 */     this.gunModel['Ä'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F);
/*  840 */     this.gunModel['Ä'].setRotationPoint(-27.75F, -4.6F, 0.0F);
/*      */     
/*  842 */     this.gunModel['Å'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, -0.75F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.5F, -0.75F, 0.1F);
/*  843 */     this.gunModel['Å'].setRotationPoint(-28.25F, -4.6F, 0.0F);
/*      */     
/*  845 */     this.gunModel['Æ'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  846 */     this.gunModel['Æ'].setRotationPoint(-0.5F, -23.6F, -1.0F);
/*      */     
/*  848 */     this.gunModel['Ç'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F);
/*  849 */     this.gunModel['Ç'].setRotationPoint(-0.47F, -21.15F, -0.85F);
/*      */     
/*  851 */     this.gunModel['È'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 1, 0.0F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  852 */     this.gunModel['È'].setRotationPoint(-0.5F, -19.8F, -1.0F);
/*      */     
/*  854 */     this.gunModel['É'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, -0.05F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F);
/*  855 */     this.gunModel['É'].setRotationPoint(-0.47F, -17.35F, -0.85F);
/*      */     
/*  857 */     this.gunModel['Ê'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  858 */     this.gunModel['Ê'].setRotationPoint(-0.5F, -16.0F, -1.0F);
/*      */     
/*  860 */     this.gunModel['Ë'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  861 */     this.gunModel['Ë'].setRotationPoint(4.25F, -30.35F, 1.0F);
/*      */     
/*  863 */     this.gunModel['Ì'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  864 */     this.gunModel['Ì'].setRotationPoint(4.25F, -28.75F, 1.0F);
/*      */     
/*  866 */     this.gunModel['Í'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  867 */     this.gunModel['Í'].setRotationPoint(4.25F, -29.55F, 0.2F);
/*      */     
/*  869 */     this.gunModel['Î'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  870 */     this.gunModel['Î'].setRotationPoint(4.25F, -29.55F, 1.8F);
/*      */     
/*  872 */     this.gunModel['Ï'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.9F, -0.1F, -0.75F, -0.9F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  873 */     this.gunModel['Ï'].setRotationPoint(4.25F, -30.35F, 1.8F);
/*      */     
/*  875 */     this.gunModel['Ð'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.9F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  876 */     this.gunModel['Ð'].setRotationPoint(4.25F, -30.35F, 0.2F);
/*      */     
/*  878 */     this.gunModel['Ñ'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.9F, -0.1F, -0.75F, -0.9F, -0.1F);
/*  879 */     this.gunModel['Ñ'].setRotationPoint(4.25F, -28.75F, 1.8F);
/*      */     
/*  881 */     this.gunModel['Ò'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.9F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F);
/*  882 */     this.gunModel['Ò'].setRotationPoint(4.25F, -28.75F, 0.2F);
/*      */     
/*  884 */     this.gunModel['Ó'].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  885 */     this.gunModel['Ó'].setRotationPoint(14.0F, -8.5F, 1.65F);
/*      */     
/*  887 */     this.gunModel['Ô'].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  888 */     this.gunModel['Ô'].setRotationPoint(13.0F, -9.0F, 1.5F);
/*      */     
/*  890 */     this.gunModel['Õ'].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  891 */     this.gunModel['Õ'].setRotationPoint(13.0F, -8.0F, 1.5F);
/*      */     
/*  893 */     this.gunModel['Ö'].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  894 */     this.gunModel['Ö'].setRotationPoint(13.0F, -8.5F, 1.5F);
/*      */     
/*  896 */     this.gunModel['×'].addShapeBox(-3.0F, 1.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F);
/*  897 */     this.gunModel['×'].setRotationPoint(16.0F, -9.0F, 1.5F);
/*      */     
/*  899 */     this.gunModel['Ø'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  900 */     this.gunModel['Ø'].setRotationPoint(10.5F, -12.5F, 1.0F);
/*      */     
/*  902 */     this.gunModel['Ù'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  903 */     this.gunModel['Ù'].setRotationPoint(10.5F, -11.5F, 1.0F);
/*      */     
/*  905 */     this.gunModel['Ú'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 1, 1, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F);
/*  906 */     this.gunModel['Ú'].setRotationPoint(10.5F, -10.5F, 1.0F);
/*      */     
/*  908 */     this.gunModel['Û'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  909 */     this.gunModel['Û'].setRotationPoint(16.75F, -10.0F, 0.5F);
/*      */     
/*  911 */     this.gunModel['Ü'].addShapeBox(-6.0F, 6.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  912 */     this.gunModel['Ü'].setRotationPoint(-10.5F, -17.1F, 1.0F);
/*      */     
/*  914 */     this.gunModel['Ý'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 11, 1, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  915 */     this.gunModel['Ý'].setRotationPoint(-25.75F, -23.1F, 1.0F);
/*      */     
/*  917 */     this.gunModel['Þ'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  918 */     this.gunModel['Þ'].setRotationPoint(-24.0F, -14.1F, 1.0F);
/*      */     
/*  920 */     this.gunModel['ß'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  921 */     this.gunModel['ß'].setRotationPoint(-24.0F, -14.85F, 1.0F);
/*      */     
/*  923 */     this.gunModel['à'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  924 */     this.gunModel['à'].setRotationPoint(-24.0F, -15.6F, 1.0F);
/*      */     
/*  926 */     this.gunModel['á'].addShapeBox(-6.0F, 6.0F, -1.5F, 1, 1, 1, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F);
/*  927 */     this.gunModel['á'].setRotationPoint(-24.5F, -14.85F, 1.0F);
/*      */     
/*  929 */     this.gunModel['â'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 22, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  930 */     this.gunModel['â'].setRotationPoint(61.25F, -19.25F, 1.0F);
/*  931 */     this.gunModel['â'].rotateAngleX = -0.34906584F;
/*  932 */     this.gunModel['â'].rotateAngleZ = 0.34906584F;
/*      */     
/*  934 */     this.gunModel['ã'].addShapeBox(-6.0F, 6.0F, -1.5F, 2, 22, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  935 */     this.gunModel['ã'].setRotationPoint(61.25F, -19.25F, -0.5F);
/*  936 */     this.gunModel['ã'].rotateAngleX = 0.34906584F;
/*  937 */     this.gunModel['ã'].rotateAngleZ = 0.34906584F;
/*      */     
/*      */ 
/*  940 */     this.ammoModel = new ModelRendererTurbo[26];
/*  941 */     this.ammoModel[0] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/*  942 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  943 */     this.ammoModel[2] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/*  944 */     this.ammoModel[3] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*  945 */     this.ammoModel[4] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  946 */     this.ammoModel[5] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*  947 */     this.ammoModel[6] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/*  948 */     this.ammoModel[7] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/*  949 */     this.ammoModel[8] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/*  950 */     this.ammoModel[9] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/*  951 */     this.ammoModel[10] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/*  952 */     this.ammoModel[11] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/*  953 */     this.ammoModel[12] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/*  954 */     this.ammoModel[13] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/*  955 */     this.ammoModel[14] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/*  956 */     this.ammoModel[15] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  957 */     this.ammoModel[16] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  958 */     this.ammoModel[17] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/*  959 */     this.ammoModel[18] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  960 */     this.ammoModel[19] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/*  961 */     this.ammoModel[20] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  962 */     this.ammoModel[21] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  963 */     this.ammoModel[22] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/*  964 */     this.ammoModel[23] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*  965 */     this.ammoModel[24] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/*  966 */     this.ammoModel[25] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/*      */     
/*  968 */     this.ammoModel[0].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  969 */     this.ammoModel[0].setRotationPoint(17.25F, -10.5F, -2.5F);
/*      */     
/*  971 */     this.ammoModel[1].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 8, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  972 */     this.ammoModel[1].setRotationPoint(17.25F, -10.5F, -7.5F);
/*      */     
/*  974 */     this.ammoModel[2].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  975 */     this.ammoModel[2].setRotationPoint(17.25F, -10.5F, -9.0F);
/*      */     
/*  977 */     this.ammoModel[3].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  978 */     this.ammoModel[3].setRotationPoint(17.25F, -4.0F, -2.5F);
/*      */     
/*  980 */     this.ammoModel[4].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  981 */     this.ammoModel[4].setRotationPoint(17.25F, -4.0F, -9.0F);
/*      */     
/*  983 */     this.ammoModel[5].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  984 */     this.ammoModel[5].setRotationPoint(17.25F, -8.5F, -9.0F);
/*      */     
/*  986 */     this.ammoModel[6].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  987 */     this.ammoModel[6].setRotationPoint(17.25F, -8.5F, -2.5F);
/*      */     
/*  989 */     this.ammoModel[7].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  990 */     this.ammoModel[7].setRotationPoint(17.25F, -10.5F, 3.5F);
/*      */     
/*  992 */     this.ammoModel[8].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  993 */     this.ammoModel[8].setRotationPoint(17.25F, -10.5F, 5.5F);
/*      */     
/*  995 */     this.ammoModel[9].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  996 */     this.ammoModel[9].setRotationPoint(17.25F, -4.0F, 3.5F);
/*      */     
/*  998 */     this.ammoModel[10].addShapeBox(-6.0F, 6.0F, 9.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  999 */     this.ammoModel[10].setRotationPoint(17.25F, -4.0F, -1.0F);
/*      */     
/* 1001 */     this.ammoModel[11].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1002 */     this.ammoModel[11].setRotationPoint(17.25F, -10.5F, 10.0F);
/*      */     
/* 1004 */     this.ammoModel[12].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1005 */     this.ammoModel[12].setRotationPoint(17.25F, -8.5F, 10.0F);
/*      */     
/* 1007 */     this.ammoModel[13].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1008 */     this.ammoModel[13].setRotationPoint(17.25F, -11.5F, 0.0F);
/*      */     
/* 1010 */     this.ammoModel[14].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -2.25F, 0.0F, -1.5F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1011 */     this.ammoModel[14].setRotationPoint(17.25F, -12.5F, 8.0F);
/*      */     
/* 1013 */     this.ammoModel[15].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, -2.25F, 0.0F, 0.5F, -2.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1014 */     this.ammoModel[15].setRotationPoint(17.25F, -12.5F, 5.5F);
/*      */     
/* 1016 */     this.ammoModel[16].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -2.25F, 0.0F, -1.5F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1017 */     this.ammoModel[16].setRotationPoint(17.25F, -12.5F, -4.5F);
/*      */     
/* 1019 */     this.ammoModel[17].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, -2.25F, 0.0F, 0.5F, -2.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1020 */     this.ammoModel[17].setRotationPoint(17.25F, -12.5F, -7.0F);
/*      */     
/* 1022 */     this.ammoModel[18].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 2.0F, -2.25F, 0.0F, 2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, -1.5F, 0.0F, -1.75F, -1.5F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1023 */     this.ammoModel[18].setRotationPoint(17.25F, -8.5F, -11.25F);
/*      */     
/* 1025 */     this.ammoModel[19].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, 1.75F, -1.5F, 0.0F, 1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.5F, -2.25F, 0.0F, -1.5F, -2.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 1026 */     this.ammoModel[19].setRotationPoint(17.25F, -6.5F, -11.25F);
/*      */     
/* 1028 */     this.ammoModel[20].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 2.0F, -1.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -1.5F, 0.0F, -1.75F, -1.5F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1029 */     this.ammoModel[20].setRotationPoint(17.25F, -8.5F, 10.5F);
/*      */     
/* 1031 */     this.ammoModel[21].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, 1.75F, -1.5F, 0.0F, 1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1032 */     this.ammoModel[21].setRotationPoint(17.25F, -6.5F, 10.5F);
/*      */     
/* 1034 */     this.ammoModel[22].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, -2.0F, -2.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1035 */     this.ammoModel[22].setRotationPoint(17.25F, -3.5F, -7.0F);
/*      */     
/* 1037 */     this.ammoModel[23].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1038 */     this.ammoModel[23].setRotationPoint(17.25F, -3.5F, -4.75F);
/*      */     
/* 1040 */     this.ammoModel[24].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, -2.0F, -2.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1041 */     this.ammoModel[24].setRotationPoint(17.25F, -3.5F, 5.5F);
/*      */     
/* 1043 */     this.ammoModel[25].addShapeBox(-6.0F, 6.0F, -1.5F, 12, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1044 */     this.ammoModel[25].setRotationPoint(17.25F, -3.5F, 7.75F);
/*      */     
/*      */ 
/* 1047 */     this.slideModel = new ModelRendererTurbo[2];
/* 1048 */     this.slideModel[0] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/* 1049 */     this.slideModel[1] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*      */     
/* 1051 */     this.slideModel[0].addShapeBox(-6.0F, 6.0F, -1.5F, 10, 1, 4, 0.0F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F);
/* 1052 */     this.slideModel[0].setRotationPoint(16.25F, -25.5F, -0.5F);
/*      */     
/* 1054 */     this.slideModel[1].addShapeBox(-6.0F, 6.0F, -1.5F, 9, 1, 4, 0.0F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -1.05F, 0.0F, -0.1F, -1.05F, 0.0F, -0.1F, -1.05F, 0.0F, -0.1F, -1.05F, 0.0F, -0.05F, -1.05F);
/* 1055 */     this.slideModel[1].setRotationPoint(26.25F, -25.5F, -0.5F);
/*      */     
/*      */ 
/*      */ 
/* 1059 */     translateAll(0.0F, -3.75F, 0.0F);
/* 1060 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*      */     
/* 1062 */     this.gunSlideDistance = 0.35F;
/* 1063 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/* 1066 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmg36TD.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */