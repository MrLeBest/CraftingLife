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
/*      */ public class Modelvector
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelvector()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ø'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 89, 73, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 313, 89, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 137, 41, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 41, 89, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 161, 97, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 313, 105, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 489, 97, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 401, 105, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 145, 113, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 473, 113, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 297, 121, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 329, 121, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 393, 121, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 425, 121, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 249, 129, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 113, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 137, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 137, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 137, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 145, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 145, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 145, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 145, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 153, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 65, 153, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 89, 153, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 113, 153, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 321, 145, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 145, 153, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 185, 153, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 265, 153, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 297, 153, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 361, 153, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 385, 153, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 417, 153, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 433, 153, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 465, 153, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 329, 169, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 353, 169, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 441, 105, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 217, 113, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 241, 113, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 265, 113, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 321, 121, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 145, 177, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 353, 121, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 385, 121, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 417, 121, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 137, 129, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/*      */     
/*  271 */     this.gunModel[0].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 7, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F);
/*  272 */     this.gunModel[0].setRotationPoint(-18.0F, -19.0F, 1.0F);
/*      */     
/*  274 */     this.gunModel[1].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 7, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F);
/*  275 */     this.gunModel[1].setRotationPoint(-17.0F, -17.0F, 1.0F);
/*      */     
/*  277 */     this.gunModel[2].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 7, 0.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  278 */     this.gunModel[2].setRotationPoint(-18.0F, -15.0F, 1.0F);
/*      */     
/*  280 */     this.gunModel[3].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 7, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  281 */     this.gunModel[3].setRotationPoint(-19.0F, -13.0F, 1.0F);
/*      */     
/*  283 */     this.gunModel[4].addShapeBox(12.0F, 2.0F, -4.5F, 4, 2, 7, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  284 */     this.gunModel[4].setRotationPoint(-20.0F, -11.0F, 1.0F);
/*      */     
/*  286 */     this.gunModel[5].addShapeBox(12.0F, 2.0F, -4.5F, 5, 2, 7, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  287 */     this.gunModel[5].setRotationPoint(-21.0F, -9.0F, 1.0F);
/*      */     
/*  289 */     this.gunModel[6].addShapeBox(12.0F, 2.0F, -4.5F, 6, 2, 7, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F);
/*  290 */     this.gunModel[6].setRotationPoint(-22.0F, -7.0F, 1.0F);
/*      */     
/*  292 */     this.gunModel[7].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 7, 0.0F, -1.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F);
/*  293 */     this.gunModel[7].setRotationPoint(-23.0F, -5.0F, 1.0F);
/*      */     
/*  295 */     this.gunModel[8].addShapeBox(12.0F, 2.0F, -4.5F, 8, 3, 7, 0.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F);
/*  296 */     this.gunModel[8].setRotationPoint(-24.0F, -3.0F, 1.0F);
/*      */     
/*  298 */     this.gunModel[9].addShapeBox(12.0F, 2.0F, -4.5F, 9, 3, 7, 0.0F, -1.75F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F);
/*  299 */     this.gunModel[9].setRotationPoint(-25.0F, 0.0F, 1.0F);
/*      */     
/*  301 */     this.gunModel[10].addShapeBox(12.0F, 2.0F, -4.5F, 9, 2, 7, 0.0F, -1.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F);
/*  302 */     this.gunModel[10].setRotationPoint(-25.0F, 3.0F, 1.0F);
/*      */     
/*  304 */     this.gunModel[11].addShapeBox(12.0F, 2.0F, -4.5F, 9, 26, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  305 */     this.gunModel[11].setRotationPoint(-16.0F, -19.0F, 1.0F);
/*      */     
/*  307 */     this.gunModel[12].addShapeBox(12.0F, 2.0F, -4.5F, 4, 2, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -1.25F, -1.0F);
/*  308 */     this.gunModel[12].setRotationPoint(-24.0F, 5.0F, 1.0F);
/*      */     
/*  310 */     this.gunModel[13].addShapeBox(12.0F, 2.0F, -4.5F, 4, 4, 7, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -0.5F);
/*  311 */     this.gunModel[13].setRotationPoint(-20.0F, 5.0F, 1.0F);
/*      */     
/*  313 */     this.gunModel[14].addShapeBox(12.0F, 2.0F, -4.5F, 3, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  314 */     this.gunModel[14].setRotationPoint(-16.0F, 7.0F, 1.0F);
/*      */     
/*  316 */     this.gunModel[15].addShapeBox(12.0F, 2.0F, -4.5F, 7, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  317 */     this.gunModel[15].setRotationPoint(-12.5F, 7.0F, 1.0F);
/*      */     
/*  319 */     this.gunModel[16].addShapeBox(12.0F, 2.0F, -4.5F, 5, 3, 9, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  320 */     this.gunModel[16].setRotationPoint(-5.0F, 10.5F, 0.0F);
/*      */     
/*  322 */     this.gunModel[17].addShapeBox(12.0F, 2.0F, -4.5F, 5, 3, 9, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  323 */     this.gunModel[17].setRotationPoint(-5.0F, 7.5F, 0.0F);
/*      */     
/*  325 */     this.gunModel[18].addShapeBox(12.0F, 2.0F, -4.5F, 3, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  326 */     this.gunModel[18].setRotationPoint(0.0F, 10.5F, 0.0F);
/*      */     
/*  328 */     this.gunModel[19].addShapeBox(12.0F, 2.0F, -4.5F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  329 */     this.gunModel[19].setRotationPoint(0.0F, 7.5F, 0.0F);
/*      */     
/*  331 */     this.gunModel[20].addShapeBox(12.0F, 2.0F, -4.5F, 10, 21, 9, 0.0F, -8.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  332 */     this.gunModel[20].setRotationPoint(0.0F, -13.5F, 0.0F);
/*      */     
/*  334 */     this.gunModel[21].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 9, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  335 */     this.gunModel[21].setRotationPoint(8.0F, -15.5F, 0.0F);
/*      */     
/*  337 */     this.gunModel[22].addShapeBox(12.0F, 2.0F, -4.5F, 8, 1, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  338 */     this.gunModel[22].setRotationPoint(9.0F, -16.5F, 0.0F);
/*      */     
/*  340 */     this.gunModel[23].addShapeBox(12.0F, 2.0F, -4.5F, 9, 1, 9, 0.0F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  341 */     this.gunModel[23].setRotationPoint(9.0F, -17.5F, 0.0F);
/*      */     
/*  343 */     this.gunModel[24].addShapeBox(12.0F, 2.0F, -4.5F, 12, 1, 9, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  344 */     this.gunModel[24].setRotationPoint(8.0F, -18.5F, 0.0F);
/*      */     
/*  346 */     this.gunModel[25].addShapeBox(12.0F, 2.0F, -4.5F, 38, 7, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  347 */     this.gunModel[25].setRotationPoint(-18.0F, -25.5F, 0.0F);
/*      */     
/*  349 */     this.gunModel[26].addShapeBox(12.0F, 2.0F, -4.5F, 10, 7, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  350 */     this.gunModel[26].setRotationPoint(20.0F, -24.5F, 0.0F);
/*      */     
/*  352 */     this.gunModel[27].addShapeBox(12.0F, 2.0F, -4.5F, 11, 2, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  353 */     this.gunModel[27].setRotationPoint(30.0F, -24.5F, 3.0F);
/*      */     
/*  355 */     this.gunModel[28].addShapeBox(12.0F, 2.0F, -4.5F, 15, 5, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  356 */     this.gunModel[28].setRotationPoint(49.5F, -24.5F, 0.0F);
/*      */     
/*  358 */     this.gunModel[29].addShapeBox(12.0F, 2.0F, -4.5F, 59, 1, 9, 0.0F, 0.0F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  359 */     this.gunModel[29].setRotationPoint(-18.0F, -26.0F, 0.0F);
/*      */     
/*  361 */     this.gunModel[30].addShapeBox(12.0F, 2.0F, -4.5F, 15, 1, 9, 0.0F, 0.0F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  362 */     this.gunModel[30].setRotationPoint(49.5F, -26.0F, 0.0F);
/*      */     
/*  364 */     this.gunModel[31].addShapeBox(12.0F, 2.0F, -4.5F, 10, 21, 9, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F);
/*  365 */     this.gunModel[31].setRotationPoint(9.6F, -13.5F, 0.0F);
/*      */     
/*  367 */     this.gunModel[32].addShapeBox(12.0F, 2.0F, -4.5F, 6, 2, 9, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  368 */     this.gunModel[32].setRotationPoint(14.0F, -15.5F, 0.0F);
/*      */     
/*  370 */     this.gunModel[33].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 9, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  371 */     this.gunModel[33].setRotationPoint(15.75F, -16.5F, 0.0F);
/*      */     
/*  373 */     this.gunModel[34].addShapeBox(12.0F, 2.0F, -4.5F, 2, 1, 9, 0.0F, -0.75F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.75F, -0.1F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/*  374 */     this.gunModel[34].setRotationPoint(19.75F, -17.5F, 0.0F);
/*      */     
/*  376 */     this.gunModel[35].addShapeBox(12.0F, 2.0F, -4.5F, 3, 3, 9, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  377 */     this.gunModel[35].setRotationPoint(8.1F, 7.5F, 0.0F);
/*      */     
/*  379 */     this.gunModel[36].addShapeBox(12.0F, 2.0F, -4.5F, 3, 5, 9, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  380 */     this.gunModel[36].setRotationPoint(5.9F, 10.0F, 0.0F);
/*      */     
/*  382 */     this.gunModel[37].addShapeBox(12.0F, 2.0F, -4.5F, 8, 4, 9, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  383 */     this.gunModel[37].setRotationPoint(41.5F, -23.5F, 0.0F);
/*      */     
/*  385 */     this.gunModel[38].addShapeBox(12.0F, 2.0F, -4.5F, 9, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  386 */     this.gunModel[38].setRotationPoint(11.1F, 7.5F, 0.0F);
/*      */     
/*  388 */     this.gunModel[39].addShapeBox(12.0F, 2.0F, -4.5F, 11, 4, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  389 */     this.gunModel[39].setRotationPoint(9.1F, 10.5F, 0.0F);
/*      */     
/*  391 */     this.gunModel[40].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  392 */     this.gunModel[40].setRotationPoint(20.35F, 11.5F, 0.0F);
/*      */     
/*  394 */     this.gunModel[41].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  395 */     this.gunModel[41].setRotationPoint(20.35F, 10.5F, 0.0F);
/*      */     
/*  397 */     this.gunModel[42].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  398 */     this.gunModel[42].setRotationPoint(24.35F, 10.5F, 0.0F);
/*      */     
/*  400 */     this.gunModel[43].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 9, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  401 */     this.gunModel[43].setRotationPoint(24.85F, 11.5F, 0.0F);
/*      */     
/*  403 */     this.gunModel[44].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/*  404 */     this.gunModel[44].setRotationPoint(26.85F, 12.5F, 0.0F);
/*      */     
/*  406 */     this.gunModel[45].addShapeBox(12.0F, 2.0F, -4.5F, 12, 15, 9, 0.0F, -7.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, -1.0F, -8.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  407 */     this.gunModel[45].setRotationPoint(28.1F, -4.5F, 0.0F);
/*      */     
/*  409 */     this.gunModel[46].addShapeBox(12.0F, 2.0F, -4.5F, 4, 4, 9, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, -2.75F, 0.5F, -1.0F, -2.75F, 0.5F, -1.0F, 0.25F, 0.5F, 0.0F);
/*  410 */     this.gunModel[46].setRotationPoint(28.35F, 10.5F, 0.0F);
/*      */     
/*  412 */     this.gunModel[47].addShapeBox(12.0F, 2.0F, -4.5F, 4, 3, 9, 0.0F, 0.0F, -0.5F, 0.0F, 3.0F, -0.5F, -1.0F, 3.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  413 */     this.gunModel[47].setRotationPoint(35.1F, -7.5F, 0.0F);
/*      */     
/*  415 */     this.gunModel[48].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  416 */     this.gunModel[48].setRotationPoint(35.1F, -9.0F, 0.0F);
/*      */     
/*  418 */     this.gunModel[49].addShapeBox(12.0F, 2.0F, -4.5F, 4, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  419 */     this.gunModel[49].setRotationPoint(42.1F, -9.0F, 0.0F);
/*      */     
/*  421 */     this.gunModel[50].addShapeBox(12.0F, 2.0F, -4.5F, 11, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  422 */     this.gunModel[50].setRotationPoint(35.1F, -11.5F, 0.0F);
/*      */     
/*  424 */     this.gunModel[51].addShapeBox(12.0F, 2.0F, -4.5F, 4, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  425 */     this.gunModel[51].setRotationPoint(46.1F, -11.5F, 0.0F);
/*      */     
/*  427 */     this.gunModel[52].addShapeBox(12.0F, 2.0F, -4.5F, 15, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  428 */     this.gunModel[52].setRotationPoint(50.1F, -11.5F, 0.0F);
/*      */     
/*  430 */     this.gunModel[53].addShapeBox(12.0F, 2.0F, -4.5F, 43, 6, 9, 0.0F, 0.0F, -0.1F, 0.0F, 0.35F, -0.1F, 0.0F, 0.35F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  431 */     this.gunModel[53].setRotationPoint(21.75F, -17.5F, 0.0F);
/*      */     
/*  433 */     this.gunModel[54].addShapeBox(12.0F, 2.0F, -4.5F, 16, 3, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  434 */     this.gunModel[54].setRotationPoint(19.1F, -11.5F, 0.0F);
/*      */     
/*  436 */     this.gunModel[55].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  437 */     this.gunModel[55].setRotationPoint(19.1F, -13.5F, 0.0F);
/*      */     
/*  439 */     this.gunModel[56].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 9, 0.0F, -0.9F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/*  440 */     this.gunModel[56].setRotationPoint(19.1F, -16.5F, 0.0F);
/*      */     
/*  442 */     this.gunModel[57].addShapeBox(12.0F, 2.0F, -4.5F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  443 */     this.gunModel[57].setRotationPoint(20.1F, 7.5F, 0.0F);
/*      */     
/*  445 */     this.gunModel[58].addShapeBox(12.0F, 2.0F, -4.5F, 3, 16, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  446 */     this.gunModel[58].setRotationPoint(20.1F, -8.5F, 0.0F);
/*      */     
/*  448 */     this.gunModel[59].addShapeBox(12.0F, 2.0F, -4.5F, 7, 14, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  449 */     this.gunModel[59].setRotationPoint(23.1F, -6.5F, 0.0F);
/*      */     
/*  451 */     this.gunModel[60].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[60].setRotationPoint(23.1F, -8.5F, 0.0F);
/*      */     
/*  454 */     this.gunModel[61].addShapeBox(12.0F, 2.0F, -4.5F, 1, 3, 9, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  455 */     this.gunModel[61].setRotationPoint(34.1F, -8.5F, 0.0F);
/*      */     
/*  457 */     this.gunModel[62].addShapeBox(12.0F, 2.0F, -4.5F, 1, 3, 9, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  458 */     this.gunModel[62].setRotationPoint(22.1F, 7.5F, 0.0F);
/*      */     
/*  460 */     this.gunModel[63].addShapeBox(12.0F, 2.0F, -4.5F, 1, 3, 9, 0.0F, -2.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  461 */     this.gunModel[63].setRotationPoint(27.1F, 7.5F, 0.0F);
/*      */     
/*  463 */     this.gunModel[64].addShapeBox(12.0F, 2.0F, -4.5F, 14, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  464 */     this.gunModel[64].setRotationPoint(51.0F, -19.5F, 0.0F);
/*      */     
/*  466 */     this.gunModel[65].addShapeBox(12.0F, 2.0F, -4.5F, 8, 1, 9, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/*  467 */     this.gunModel[65].setRotationPoint(41.5F, -26.0F, 0.0F);
/*      */     
/*  469 */     this.gunModel[66].addShapeBox(12.0F, 2.0F, -4.5F, 9, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  470 */     this.gunModel[66].setRotationPoint(64.75F, -16.5F, 2.5F);
/*      */     
/*  472 */     this.gunModel[67].addShapeBox(12.0F, 2.0F, -4.5F, 4, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  473 */     this.gunModel[67].setRotationPoint(73.75F, -17.0F, 2.0F);
/*      */     
/*  475 */     this.gunModel[68].addShapeBox(12.0F, 2.0F, -4.5F, 82, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  476 */     this.gunModel[68].setRotationPoint(-18.0F, -27.5F, 2.0F);
/*      */     
/*  478 */     this.gunModel[69].addShapeBox(12.0F, 2.0F, -4.5F, 82, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  479 */     this.gunModel[69].setRotationPoint(-18.0F, -29.0F, 1.0F);
/*      */     
/*  481 */     this.gunModel[70].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.88F, 0.0F, 0.0F, 0.88F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  482 */     this.gunModel[70].setRotationPoint(-0.25F, -10.5F, 2.0F);
/*      */     
/*  484 */     this.gunModel[71].addShapeBox(12.0F, 2.0F, -4.5F, 4, 2, 5, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  485 */     this.gunModel[71].setRotationPoint(-4.25F, -10.5F, 2.0F);
/*      */     
/*  487 */     this.gunModel[72].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  488 */     this.gunModel[72].setRotationPoint(-7.25F, -11.5F, 2.0F);
/*      */     
/*  490 */     this.gunModel[73].addShapeBox(12.0F, 2.0F, -4.5F, 2, 1, 5, 0.0F, -0.75F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/*  491 */     this.gunModel[73].setRotationPoint(-6.25F, -12.5F, 2.0F);
/*      */     
/*  493 */     this.gunModel[74].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 5, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.1F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.1F, 0.5F, 0.0F);
/*  494 */     this.gunModel[74].setRotationPoint(-7.25F, -9.5F, 2.0F);
/*      */     
/*  496 */     this.gunModel[75].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  497 */     this.gunModel[75].setRotationPoint(-0.5F, -18.5F, 3.0F);
/*      */     
/*  499 */     this.gunModel[76].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  500 */     this.gunModel[76].setRotationPoint(-2.0F, -16.5F, 3.0F);
/*      */     
/*  502 */     this.gunModel[77].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  503 */     this.gunModel[77].setRotationPoint(-2.0F, -14.0F, 3.0F);
/*      */     
/*  505 */     this.gunModel[78].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  506 */     this.gunModel[78].setRotationPoint(-0.5F, -12.0F, 3.0F);
/*      */     
/*  508 */     this.gunModel[79].addShapeBox(12.0F, 2.0F, -4.5F, 6, 1, 3, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  509 */     this.gunModel[79].setRotationPoint(-6.5F, -12.5F, 3.0F);
/*      */     
/*  511 */     this.gunModel[80].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  512 */     this.gunModel[80].setRotationPoint(-0.5F, -12.5F, 3.0F);
/*      */     
/*  514 */     this.gunModel[81].addShapeBox(12.0F, 2.0F, -4.5F, 14, 19, 8, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  515 */     this.gunModel[81].setRotationPoint(22.1F, -8.5F, 0.5F);
/*      */     
/*  517 */     this.gunModel[82].addShapeBox(12.0F, 2.0F, -4.5F, 10, 26, 7, 0.0F, -8.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -8.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, -8.5F, -0.5F, -1.0F, -8.5F, -0.5F, -1.0F, 0.75F, -0.5F, 0.0F);
/*  518 */     this.gunModel[82].setRotationPoint(-14.75F, -18.5F, 1.0F);
/*      */     
/*  520 */     this.gunModel[83].addShapeBox(12.0F, 2.0F, -4.5F, 19, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  521 */     this.gunModel[83].setRotationPoint(46.1F, -9.75F, 1.5F);
/*      */     
/*  523 */     this.gunModel[84].addShapeBox(12.0F, 2.0F, -4.5F, 19, 1, 6, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  524 */     this.gunModel[84].setRotationPoint(46.1F, -8.75F, 1.5F);
/*      */     
/*  526 */     this.gunModel[85].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  527 */     this.gunModel[85].setRotationPoint(60.1F, -12.0F, -0.5F);
/*      */     
/*  529 */     this.gunModel[86].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  530 */     this.gunModel[86].setRotationPoint(61.1F, -13.0F, -0.5F);
/*      */     
/*  532 */     this.gunModel[87].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  533 */     this.gunModel[87].setRotationPoint(61.1F, -11.0F, -0.5F);
/*      */     
/*  535 */     this.gunModel[88].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  536 */     this.gunModel[88].setRotationPoint(48.1F, -11.0F, -0.5F);
/*      */     
/*  538 */     this.gunModel[89].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  539 */     this.gunModel[89].setRotationPoint(47.1F, -12.0F, -0.5F);
/*      */     
/*  541 */     this.gunModel[90].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  542 */     this.gunModel[90].setRotationPoint(48.1F, -13.0F, -0.5F);
/*      */     
/*  544 */     this.gunModel[91].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  545 */     this.gunModel[91].setRotationPoint(30.0F, -19.5F, 0.0F);
/*      */     
/*  547 */     this.gunModel[92].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[92].setRotationPoint(48.1F, -21.0F, -0.5F);
/*      */     
/*  550 */     this.gunModel[93].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[93].setRotationPoint(47.1F, -22.0F, -0.5F);
/*      */     
/*  553 */     this.gunModel[94].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  554 */     this.gunModel[94].setRotationPoint(48.1F, -23.0F, -0.5F);
/*      */     
/*  556 */     this.gunModel[95].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  557 */     this.gunModel[95].setRotationPoint(16.1F, 12.0F, -0.5F);
/*      */     
/*  559 */     this.gunModel[96].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[96].setRotationPoint(17.1F, 13.0F, -0.5F);
/*      */     
/*  562 */     this.gunModel[97].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  563 */     this.gunModel[97].setRotationPoint(17.1F, 11.0F, -0.5F);
/*      */     
/*  565 */     this.gunModel[98].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[98].setRotationPoint(0.6F, 12.0F, -0.5F);
/*      */     
/*  568 */     this.gunModel[99].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[99].setRotationPoint(1.6F, 13.0F, -0.5F);
/*      */     
/*  571 */     this.gunModel[100].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  572 */     this.gunModel[100].setRotationPoint(1.6F, 11.0F, -0.5F);
/*      */     
/*  574 */     this.gunModel[101].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[101].setRotationPoint(8.6F, -22.5F, -0.5F);
/*      */     
/*  577 */     this.gunModel[102].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[102].setRotationPoint(9.6F, -23.5F, -0.5F);
/*      */     
/*  580 */     this.gunModel[103].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[103].setRotationPoint(9.6F, -21.5F, -0.5F);
/*      */     
/*  583 */     this.gunModel[104].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  584 */     this.gunModel[104].setRotationPoint(19.8F, 6.5F, -0.65F);
/*      */     
/*  586 */     this.gunModel[105].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  587 */     this.gunModel[105].setRotationPoint(20.8F, 7.5F, -0.65F);
/*      */     
/*  589 */     this.gunModel[106].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  590 */     this.gunModel[106].setRotationPoint(20.8F, 5.5F, -0.65F);
/*      */     
/*  592 */     this.gunModel[107].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[107].setRotationPoint(27.4F, -6.5F, -0.65F);
/*      */     
/*  595 */     this.gunModel[108].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 10, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[108].setRotationPoint(26.4F, -7.5F, -0.65F);
/*      */     
/*  598 */     this.gunModel[109].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  599 */     this.gunModel[109].setRotationPoint(27.4F, -8.5F, -0.65F);
/*      */     
/*  601 */     this.gunModel[110].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 2, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  602 */     this.gunModel[110].setRotationPoint(31.0F, -21.0F, 7.35F);
/*      */     
/*  604 */     this.gunModel[111].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[111].setRotationPoint(30.0F, -22.0F, 7.35F);
/*      */     
/*  607 */     this.gunModel[112].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[112].setRotationPoint(31.0F, -23.0F, 7.35F);
/*      */     
/*  610 */     this.gunModel[113].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 2, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[113].setRotationPoint(39.0F, -24.0F, 7.35F);
/*      */     
/*  613 */     this.gunModel[114].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[114].setRotationPoint(38.0F, -25.0F, 7.35F);
/*      */     
/*  616 */     this.gunModel[115].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[115].setRotationPoint(39.0F, -26.0F, 7.35F);
/*      */     
/*  619 */     this.gunModel[116].addShapeBox(12.0F, 2.0F, -4.5F, 30, 7, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[116].setRotationPoint(-54.0F, -24.5F, 0.5F);
/*      */     
/*  622 */     this.gunModel[117].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 10, 0.0F, -3.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -3.0F, -0.5F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  623 */     this.gunModel[117].setRotationPoint(-57.0F, -25.0F, -0.5F);
/*      */     
/*  625 */     this.gunModel[118].addShapeBox(12.0F, 2.0F, -4.5F, 5, 4, 10, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  626 */     this.gunModel[118].setRotationPoint(-59.0F, -22.5F, -0.5F);
/*      */     
/*  628 */     this.gunModel[119].addShapeBox(12.0F, 2.0F, -4.5F, 5, 3, 10, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[119].setRotationPoint(-59.0F, -19.5F, -0.5F);
/*      */     
/*  631 */     this.gunModel[120].addShapeBox(12.0F, 2.0F, -4.5F, 5, 2, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  632 */     this.gunModel[120].setRotationPoint(-54.0F, -18.5F, 0.5F);
/*      */     
/*  634 */     this.gunModel[121].addShapeBox(12.0F, 2.0F, -4.5F, 23, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[121].setRotationPoint(-54.0F, -23.0F, -0.5F);
/*      */     
/*  637 */     this.gunModel[122].addShapeBox(12.0F, 2.0F, -4.5F, 23, 2, 10, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[122].setRotationPoint(-54.0F, -25.0F, -0.5F);
/*      */     
/*  640 */     this.gunModel[123].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 10, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[123].setRotationPoint(-57.0F, -23.5F, -0.5F);
/*      */     
/*  643 */     this.gunModel[124].addShapeBox(12.0F, 2.0F, -4.5F, 3, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  644 */     this.gunModel[124].setRotationPoint(-54.0F, -20.0F, -0.5F);
/*      */     
/*  646 */     this.gunModel[125].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[125].setRotationPoint(-24.0F, -19.5F, 0.5F);
/*      */     
/*  649 */     this.gunModel[126].addShapeBox(12.0F, 2.0F, -4.5F, 6, 5, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  650 */     this.gunModel[126].setRotationPoint(-24.0F, -24.5F, 0.5F);
/*      */     
/*  652 */     this.gunModel[127].addShapeBox(12.0F, 2.0F, -4.5F, 4, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  653 */     this.gunModel[127].setRotationPoint(-22.0F, -19.5F, 0.5F);
/*      */     
/*  655 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 3, 3, 8, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  656 */     this.gunModel[''].setRotationPoint(-30.0F, -27.5F, 0.5F);
/*      */     
/*  658 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 8, 0.0F, -3.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -3.0F, -0.5F, -1.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F);
/*  659 */     this.gunModel[''].setRotationPoint(-27.0F, -28.2F, 0.5F);
/*      */     
/*  661 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 9, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  662 */     this.gunModel[''].setRotationPoint(-27.0F, -27.0F, 0.5F);
/*      */     
/*  664 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 6, 1, 8, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F);
/*  665 */     this.gunModel[''].setRotationPoint(-24.0F, -28.2F, 0.5F);
/*      */     
/*  667 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 6, 1, 4, 0.0F, -2.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -2.5F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  668 */     this.gunModel[''].setRotationPoint(-24.0F, -28.7F, 2.5F);
/*      */     
/*  670 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  671 */     this.gunModel[''].setRotationPoint(-19.0F, -20.5F, -1.0F);
/*      */     
/*  673 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  674 */     this.gunModel[''].setRotationPoint(-18.5F, -21.5F, -0.5F);
/*      */     
/*  676 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  677 */     this.gunModel[''].setRotationPoint(-19.0F, -24.5F, -1.0F);
/*      */     
/*  679 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  680 */     this.gunModel[''].setRotationPoint(-18.5F, -26.0F, -0.5F);
/*      */     
/*  682 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[''].setRotationPoint(-19.0F, -28.0F, -1.0F);
/*      */     
/*  685 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 4, 3, 8, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F);
/*  686 */     this.gunModel[''].setRotationPoint(-58.0F, -17.5F, 0.5F);
/*      */     
/*  688 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  689 */     this.gunModel[''].setRotationPoint(-54.0F, -17.5F, 0.5F);
/*      */     
/*  691 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 7, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  692 */     this.gunModel[''].setRotationPoint(-58.75F, -15.5F, 0.5F);
/*      */     
/*  694 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 12, 3, 3, 0.0F, 0.0F, 0.0F, -2.5F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  695 */     this.gunModel[''].setRotationPoint(-72.5F, -15.5F, 0.5F);
/*      */     
/*  697 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 12, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  698 */     this.gunModel[''].setRotationPoint(-72.5F, -15.5F, 5.5F);
/*      */     
/*  700 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  701 */     this.gunModel[''].setRotationPoint(-60.75F, -15.5F, 5.5F);
/*      */     
/*  703 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  704 */     this.gunModel[''].setRotationPoint(-60.75F, -15.5F, 0.5F);
/*      */     
/*  706 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 14, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  707 */     this.gunModel[''].setRotationPoint(-72.5F, -15.5F, 3.0F);
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 14, 1, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  710 */     this.gunModel[''].setRotationPoint(-72.5F, -12.5F, 0.5F);
/*      */     
/*  712 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 18, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  713 */     this.gunModel[''].setRotationPoint(-72.5F, -11.5F, 3.0F);
/*      */     
/*  715 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 18, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.5F, -1.5F, 0.0F, -2.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  716 */     this.gunModel[''].setRotationPoint(-72.5F, -11.5F, 0.5F);
/*      */     
/*  718 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 18, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/*  719 */     this.gunModel[''].setRotationPoint(-72.5F, -11.5F, 5.5F);
/*      */     
/*  721 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 6, 10, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  722 */     this.gunModel[''].setRotationPoint(-62.5F, -8.5F, 3.0F);
/*      */     
/*  724 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 13, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/*  725 */     this.gunModel[''].setRotationPoint(-72.5F, 5.5F, 5.5F);
/*      */     
/*  727 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 13, 1, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  728 */     this.gunModel[''].setRotationPoint(-72.5F, 4.5F, 0.5F);
/*      */     
/*  730 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 14, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  731 */     this.gunModel[''].setRotationPoint(-73.5F, 5.5F, 3.0F);
/*      */     
/*  733 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 13, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, -2.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  734 */     this.gunModel[''].setRotationPoint(-72.5F, 5.5F, 0.5F);
/*      */     
/*  736 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 11, 3, 3, 0.0F, 0.0F, 0.0F, -2.5F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  737 */     this.gunModel[''].setRotationPoint(-72.5F, 1.5F, 0.5F);
/*      */     
/*  739 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 14, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  740 */     this.gunModel[''].setRotationPoint(-73.5F, 1.5F, 3.0F);
/*      */     
/*  742 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 11, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  743 */     this.gunModel[''].setRotationPoint(-72.5F, 1.5F, 5.5F);
/*      */     
/*  745 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  746 */     this.gunModel[''].setRotationPoint(-61.75F, 1.5F, 5.5F);
/*      */     
/*  748 */     this.gunModel[''].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  749 */     this.gunModel[''].setRotationPoint(-61.75F, 1.5F, 0.5F);
/*      */     
/*  751 */     this.gunModel[' '].addShapeBox(12.0F, 2.0F, -4.5F, 2, 9, 3, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/*  752 */     this.gunModel[' '].setRotationPoint(-64.5F, -7.5F, 3.0F);
/*      */     
/*  754 */     this.gunModel['¡'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F);
/*  755 */     this.gunModel['¡'].setRotationPoint(-65.5F, -8.5F, 3.0F);
/*      */     
/*  757 */     this.gunModel['¢'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 7, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  758 */     this.gunModel['¢'].setRotationPoint(-75.25F, -16.5F, 0.5F);
/*      */     
/*  760 */     this.gunModel['£'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 22, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  761 */     this.gunModel['£'].setRotationPoint(-75.25F, -9.0F, 0.5F);
/*      */     
/*  763 */     this.gunModel['¤'].addShapeBox(12.0F, 2.0F, -4.5F, 4, 30, 8, 0.0F, -0.25F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, -2.0F, -0.25F, -0.5F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -0.5F, -2.0F);
/*  764 */     this.gunModel['¤'].setRotationPoint(-79.25F, -17.0F, 0.5F);
/*      */     
/*  766 */     this.gunModel['¥'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 15, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel['¥'].setRotationPoint(-80.0F, -16.0F, 2.5F);
/*      */     
/*  769 */     this.gunModel['¦'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 14, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel['¦'].setRotationPoint(-80.0F, -1.5F, 2.5F);
/*      */     
/*  772 */     this.gunModel['§'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel['§'].setRotationPoint(-63.5F, 8.0F, 3.0F);
/*      */     
/*  775 */     this.gunModel['¨'].addShapeBox(12.0F, 2.0F, -4.5F, 8, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel['¨'].setRotationPoint(-71.5F, 10.0F, 3.0F);
/*      */     
/*  778 */     this.gunModel['©'].addShapeBox(12.0F, 2.0F, -4.5F, 8, 1, 3, 0.0F, -8.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -8.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  779 */     this.gunModel['©'].setRotationPoint(-71.5F, 9.0F, 3.0F);
/*      */     
/*  781 */     this.gunModel['ª'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  782 */     this.gunModel['ª'].setRotationPoint(-71.5F, 9.0F, 3.0F);
/*      */     
/*  784 */     this.gunModel['«'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 4, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  785 */     this.gunModel['«'].setRotationPoint(-72.5F, 8.0F, 3.0F);
/*      */     
/*  787 */     this.gunModel['¬'].addShapeBox(12.0F, 2.0F, -4.5F, 10, 21, 8, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F);
/*  788 */     this.gunModel['¬'].setRotationPoint(8.6F, -13.5F, 0.5F);
/*      */     
/*  790 */     this.gunModel['­'].addShapeBox(12.0F, 2.0F, -4.5F, 4, 2, 8, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  791 */     this.gunModel['­'].setRotationPoint(12.0F, -15.5F, 0.9F);
/*      */     
/*  793 */     this.gunModel['®'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 5, 8, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 2.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 2.0F, -0.1F, 0.0F);
/*  794 */     this.gunModel['®'].setRotationPoint(4.9F, 10.0F, 0.5F);
/*      */     
/*  796 */     this.gunModel['¯'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 3, 8, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/*  797 */     this.gunModel['¯'].setRotationPoint(7.1F, 7.5F, 0.5F);
/*      */     
/*  799 */     this.gunModel['°'].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 8, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  800 */     this.gunModel['°'].setRotationPoint(13.75F, -16.5F, 0.5F);
/*      */     
/*  802 */     this.gunModel['±'].addShapeBox(12.0F, 2.0F, -4.5F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  803 */     this.gunModel['±'].setRotationPoint(41.0F, -18.25F, 9.0F);
/*      */     
/*  805 */     this.gunModel['²'].addShapeBox(12.0F, 2.0F, -4.5F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel['²'].setRotationPoint(41.0F, -18.25F, 8.0F);
/*      */     
/*  808 */     this.gunModel['³'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel['³'].setRotationPoint(49.0F, -19.25F, 10.0F);
/*      */     
/*  811 */     this.gunModel['´'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  812 */     this.gunModel['´'].setRotationPoint(49.0F, -19.5F, 9.0F);
/*      */     
/*  814 */     this.gunModel['µ'].addShapeBox(12.0F, 2.0F, -4.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  815 */     this.gunModel['µ'].setRotationPoint(51.0F, -19.25F, 9.0F);
/*      */     
/*  817 */     this.gunModel['¶'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel['¶'].setRotationPoint(57.0F, -19.25F, 11.0F);
/*      */     
/*  820 */     this.gunModel['·'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  821 */     this.gunModel['·'].setRotationPoint(57.0F, -19.25F, 9.0F);
/*      */     
/*  823 */     this.gunModel['¸'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  824 */     this.gunModel['¸'].setRotationPoint(59.0F, -19.25F, 11.0F);
/*      */     
/*  826 */     this.gunModel['¹'].addShapeBox(12.0F, 2.0F, -4.5F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  827 */     this.gunModel['¹'].setRotationPoint(41.0F, -18.25F, 7.0F);
/*      */     
/*  829 */     this.gunModel['º'].addShapeBox(12.0F, 2.0F, -4.5F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  830 */     this.gunModel['º'].setRotationPoint(41.0F, -19.5F, 0.0F);
/*      */     
/*  832 */     this.gunModel['»'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 5, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  833 */     this.gunModel['»'].setRotationPoint(30.0F, -24.5F, 0.0F);
/*      */     
/*  835 */     this.gunModel['¼'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 5, 2, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  836 */     this.gunModel['¼'].setRotationPoint(40.5F, -24.5F, 0.0F);
/*      */     
/*  838 */     this.gunModel['½'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel['½'].setRotationPoint(32.0F, -22.5F, 0.0F);
/*      */     
/*  841 */     this.gunModel['¾'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  842 */     this.gunModel['¾'].setRotationPoint(32.0F, -25.0F, 0.0F);
/*      */     
/*  844 */     this.gunModel['¿'].addShapeBox(12.0F, 2.0F, -4.5F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel['¿'].setRotationPoint(34.0F, -25.0F, 0.0F);
/*      */     
/*  847 */     this.gunModel['À'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel['À'].setRotationPoint(39.0F, -25.0F, 0.0F);
/*      */     
/*  850 */     this.gunModel['Á'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 1, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel['Á'].setRotationPoint(39.0F, -22.5F, 0.0F);
/*      */     
/*  853 */     this.gunModel['Â'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  854 */     this.gunModel['Â'].setRotationPoint(39.0F, -22.5F, 1.0F);
/*      */     
/*  856 */     this.gunModel['Ã'].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  857 */     this.gunModel['Ã'].setRotationPoint(32.0F, -24.5F, 1.0F);
/*      */     
/*  859 */     this.gunModel['Ä'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  860 */     this.gunModel['Ä'].setRotationPoint(32.0F, -22.5F, 1.0F);
/*      */     
/*  862 */     this.gunModel['Å'].addShapeBox(12.0F, 2.0F, -4.5F, 11, 3, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  863 */     this.gunModel['Å'].setRotationPoint(30.0F, -22.0F, 3.0F);
/*      */     
/*  865 */     this.gunModel['Æ'].addShapeBox(12.0F, 2.0F, -4.5F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  866 */     this.gunModel['Æ'].setRotationPoint(27.0F, -17.25F, 9.0F);
/*      */     
/*  868 */     this.gunModel['Ç'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel['Ç'].setRotationPoint(40.0F, -15.75F, 9.0F);
/*      */     
/*  871 */     this.gunModel['È'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel['È'].setRotationPoint(40.0F, -14.0F, 9.0F);
/*      */     
/*  874 */     this.gunModel['É'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel['É'].setRotationPoint(40.0F, -12.5F, 9.0F);
/*      */     
/*  877 */     this.gunModel['Ê'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  878 */     this.gunModel['Ê'].setRotationPoint(40.0F, -13.25F, 9.0F);
/*      */     
/*  880 */     this.gunModel['Ë'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel['Ë'].setRotationPoint(40.0F, -15.0F, 9.0F);
/*      */     
/*  883 */     this.gunModel['Ì'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  884 */     this.gunModel['Ì'].setRotationPoint(40.0F, -16.75F, 9.0F);
/*      */     
/*  886 */     this.gunModel['Í'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  887 */     this.gunModel['Í'].setRotationPoint(31.0F, -15.75F, 9.0F);
/*      */     
/*  889 */     this.gunModel['Î'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  890 */     this.gunModel['Î'].setRotationPoint(31.0F, -14.0F, 9.0F);
/*      */     
/*  892 */     this.gunModel['Ï'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  893 */     this.gunModel['Ï'].setRotationPoint(31.0F, -15.0F, 9.0F);
/*      */     
/*  895 */     this.gunModel['Ð'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  896 */     this.gunModel['Ð'].setRotationPoint(31.0F, -16.75F, 9.0F);
/*      */     
/*  898 */     this.gunModel['Ñ'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  899 */     this.gunModel['Ñ'].setRotationPoint(37.75F, -16.0F, 9.0F);
/*      */     
/*  901 */     this.gunModel['Ò'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/*  902 */     this.gunModel['Ò'].setRotationPoint(35.25F, -15.0F, 9.0F);
/*      */     
/*  904 */     this.gunModel['Ó'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 1, 1, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/*  905 */     this.gunModel['Ó'].setRotationPoint(32.75F, -15.0F, 9.0F);
/*      */     
/*  907 */     this.gunModel['Ô'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.1F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.5F, 0.0F, -0.4F, 0.5F, 0.0F, -0.4F, 0.5F, -0.25F, 0.1F, 0.5F, -0.25F);
/*  908 */     this.gunModel['Ô'].setRotationPoint(35.4F, -16.5F, 9.0F);
/*      */     
/*  910 */     this.gunModel['Õ'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.1F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.5F, 0.0F, -0.4F, 0.5F, 0.0F, -0.4F, 0.5F, -0.25F, 0.1F, 0.5F, -0.25F);
/*  911 */     this.gunModel['Õ'].setRotationPoint(35.4F, -14.25F, 9.0F);
/*      */     
/*  913 */     this.gunModel['Ö'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F);
/*  914 */     this.gunModel['Ö'].setRotationPoint(34.3F, -12.75F, 9.0F);
/*      */     
/*  916 */     this.gunModel['×'].addShapeBox(12.0F, 2.0F, -4.5F, 11, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  917 */     this.gunModel['×'].setRotationPoint(31.0F, -18.25F, 3.0F);
/*      */     
/*  919 */     this.gunModel['Ø'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  920 */     this.gunModel['Ø'].setRotationPoint(40.0F, -11.0F, 9.0F);
/*      */     
/*  922 */     this.gunModel['Ù'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  923 */     this.gunModel['Ù'].setRotationPoint(40.0F, -11.75F, 9.0F);
/*      */     
/*  925 */     this.gunModel['Ú'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  926 */     this.gunModel['Ú'].setRotationPoint(-16.0F, -13.0F, 6.25F);
/*      */     
/*  928 */     this.gunModel['Û'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  929 */     this.gunModel['Û'].setRotationPoint(-15.0F, -13.5F, 6.25F);
/*      */     
/*  931 */     this.gunModel['Ü'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  932 */     this.gunModel['Ü'].setRotationPoint(-14.0F, -13.0F, 6.25F);
/*      */     
/*  934 */     this.gunModel['Ý'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  935 */     this.gunModel['Ý'].setRotationPoint(-11.0F, -13.0F, 6.25F);
/*      */     
/*  937 */     this.gunModel['Þ'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  938 */     this.gunModel['Þ'].setRotationPoint(-10.0F, -13.0F, 6.25F);
/*      */     
/*  940 */     this.gunModel['ß'].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  941 */     this.gunModel['ß'].setRotationPoint(-16.0F, -12.0F, 6.25F);
/*      */     
/*  943 */     this.gunModel['à'].addShapeBox(12.0F, 2.0F, -4.5F, 7, 15, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  944 */     this.gunModel['à'].setRotationPoint(-16.0F, -11.0F, 6.25F);
/*      */     
/*  946 */     this.gunModel['á'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  947 */     this.gunModel['á'].setRotationPoint(-16.0F, 3.0F, 6.25F);
/*      */     
/*  949 */     this.gunModel['â'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.15F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  950 */     this.gunModel['â'].setRotationPoint(-17.0F, 4.0F, 6.25F);
/*      */     
/*  952 */     this.gunModel['ã'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.15F, 0.0F, -1.0F, -0.5F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F);
/*  953 */     this.gunModel['ã'].setRotationPoint(-19.0F, 4.0F, 6.25F);
/*      */     
/*  955 */     this.gunModel['ä'].addShapeBox(12.0F, 2.0F, -4.5F, 5, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F);
/*  956 */     this.gunModel['ä'].setRotationPoint(-21.0F, 3.0F, 6.25F);
/*      */     
/*  958 */     this.gunModel['å'].addShapeBox(12.0F, 2.0F, -4.5F, 5, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  959 */     this.gunModel['å'].setRotationPoint(-21.0F, 0.0F, 6.25F);
/*      */     
/*  961 */     this.gunModel['æ'].addShapeBox(12.0F, 2.0F, -4.5F, 5, 3, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  962 */     this.gunModel['æ'].setRotationPoint(-21.0F, -3.0F, 6.25F);
/*      */     
/*  964 */     this.gunModel['ç'].addShapeBox(12.0F, 2.0F, -4.5F, 4, 3, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  965 */     this.gunModel['ç'].setRotationPoint(-20.0F, -6.0F, 6.25F);
/*      */     
/*  967 */     this.gunModel['è'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 5, 2, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F);
/*  968 */     this.gunModel['è'].setRotationPoint(-19.0F, -11.0F, 6.25F);
/*      */     
/*  970 */     this.gunModel['é'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel['é'].setRotationPoint(-16.0F, -13.0F, 0.75F);
/*      */     
/*  973 */     this.gunModel['ê'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  974 */     this.gunModel['ê'].setRotationPoint(-15.0F, -13.5F, 0.75F);
/*      */     
/*  976 */     this.gunModel['ë'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  977 */     this.gunModel['ë'].setRotationPoint(-14.0F, -13.0F, 0.75F);
/*      */     
/*  979 */     this.gunModel['ì'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  980 */     this.gunModel['ì'].setRotationPoint(-11.0F, -13.0F, 0.75F);
/*      */     
/*  982 */     this.gunModel['í'].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  983 */     this.gunModel['í'].setRotationPoint(-10.0F, -13.0F, 0.75F);
/*      */     
/*  985 */     this.gunModel['î'].addShapeBox(12.0F, 2.0F, -4.5F, 7, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  986 */     this.gunModel['î'].setRotationPoint(-16.0F, -12.0F, 0.75F);
/*      */     
/*  988 */     this.gunModel['ï'].addShapeBox(12.0F, 2.0F, -4.5F, 7, 15, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  989 */     this.gunModel['ï'].setRotationPoint(-16.0F, -11.0F, 0.75F);
/*      */     
/*  991 */     this.gunModel['ð'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  992 */     this.gunModel['ð'].setRotationPoint(-16.0F, 3.0F, 0.75F);
/*      */     
/*  994 */     this.gunModel['ñ'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.15F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  995 */     this.gunModel['ñ'].setRotationPoint(-17.0F, 4.0F, 0.75F);
/*      */     
/*  997 */     this.gunModel['ò'].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.15F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  998 */     this.gunModel['ò'].setRotationPoint(-19.0F, 4.0F, 0.75F);
/*      */     
/* 1000 */     this.gunModel['ó'].addShapeBox(12.0F, 2.0F, -4.5F, 5, 2, 2, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1001 */     this.gunModel['ó'].setRotationPoint(-21.0F, 3.0F, 0.75F);
/*      */     
/* 1003 */     this.gunModel['ô'].addShapeBox(12.0F, 2.0F, -4.5F, 5, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1004 */     this.gunModel['ô'].setRotationPoint(-21.0F, 0.0F, 0.75F);
/*      */     
/* 1006 */     this.gunModel['õ'].addShapeBox(12.0F, 2.0F, -4.5F, 5, 3, 2, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1007 */     this.gunModel['õ'].setRotationPoint(-21.0F, -3.0F, 0.75F);
/*      */     
/* 1009 */     this.gunModel['ö'].addShapeBox(12.0F, 2.0F, -4.5F, 4, 3, 2, 0.0F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1010 */     this.gunModel['ö'].setRotationPoint(-20.0F, -6.0F, 0.75F);
/*      */     
/* 1012 */     this.gunModel['÷'].addShapeBox(12.0F, 2.0F, -4.5F, 3, 5, 2, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1013 */     this.gunModel['÷'].setRotationPoint(-19.0F, -11.0F, 0.75F);
/*      */     
/*      */ 
/* 1016 */     this.defaultScopeModel = new ModelRendererTurbo[43];
/* 1017 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 25, 161, this.textureX, this.textureY);
/* 1018 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 225, 161, this.textureX, this.textureY);
/* 1019 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 385, 161, this.textureX, this.textureY);
/* 1020 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/* 1021 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/* 1022 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/* 1023 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/* 1024 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/* 1025 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/* 1026 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/* 1027 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 1028 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/* 1029 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/* 1030 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 1031 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/* 1032 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/* 1033 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 1034 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/* 1035 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/* 1036 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 161, 161, this.textureX, this.textureY);
/* 1037 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 465, 161, this.textureX, this.textureY);
/* 1038 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 281, 161, this.textureX, this.textureY);
/* 1039 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 409, 161, this.textureX, this.textureY);
/* 1040 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/* 1041 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 49, 169, this.textureX, this.textureY);
/* 1042 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 249, 169, this.textureX, this.textureY);
/* 1043 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/* 1044 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 1045 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
/* 1046 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 177, 97, this.textureX, this.textureY);
/* 1047 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/* 1048 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/* 1049 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 257, 97, this.textureX, this.textureY);
/* 1050 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/* 1051 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/* 1052 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/* 1053 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/* 1054 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 1055 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 1056 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 1057 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/* 1058 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/* 1059 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/*      */     
/* 1061 */     this.defaultScopeModel[0].addShapeBox(12.0F, 2.0F, -4.5F, 7, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1062 */     this.defaultScopeModel[0].setRotationPoint(55.0F, -30.5F, 0.5F);
/*      */     
/* 1064 */     this.defaultScopeModel[1].addShapeBox(12.0F, 2.0F, -4.5F, 7, 1, 8, 0.0F, 0.0F, 0.75F, 0.0F, -4.5F, 0.75F, 0.0F, -4.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1065 */     this.defaultScopeModel[1].setRotationPoint(55.0F, -31.75F, 0.5F);
/*      */     
/* 1067 */     this.defaultScopeModel[2].addShapeBox(12.0F, 2.0F, -4.5F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1068 */     this.defaultScopeModel[2].setRotationPoint(55.0F, -30.75F, 1.0F);
/*      */     
/* 1070 */     this.defaultScopeModel[3].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1071 */     this.defaultScopeModel[3].setRotationPoint(54.5F, -31.5F, 3.0F);
/*      */     
/* 1073 */     this.defaultScopeModel[4].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1074 */     this.defaultScopeModel[4].setRotationPoint(53.5F, -32.5F, 3.0F);
/*      */     
/* 1076 */     this.defaultScopeModel[5].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1077 */     this.defaultScopeModel[5].setRotationPoint(54.5F, -32.5F, 3.0F);
/*      */     
/* 1079 */     this.defaultScopeModel[6].addShapeBox(12.0F, 2.0F, -4.5F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1080 */     this.defaultScopeModel[6].setRotationPoint(54.0F, -35.5F, 3.0F);
/*      */     
/* 1082 */     this.defaultScopeModel[7].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1083 */     this.defaultScopeModel[7].setRotationPoint(54.0F, -35.5F, 6.0F);
/*      */     
/* 1085 */     this.defaultScopeModel[8].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1086 */     this.defaultScopeModel[8].setRotationPoint(54.0F, -35.5F, 2.0F);
/*      */     
/* 1088 */     this.defaultScopeModel[9].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1089 */     this.defaultScopeModel[9].setRotationPoint(54.0F, -36.5F, 7.0F);
/*      */     
/* 1091 */     this.defaultScopeModel[10].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1092 */     this.defaultScopeModel[10].setRotationPoint(54.0F, -36.5F, 1.0F);
/*      */     
/* 1094 */     this.defaultScopeModel[11].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1095 */     this.defaultScopeModel[11].setRotationPoint(54.0F, -36.5F, 1.5F);
/*      */     
/* 1097 */     this.defaultScopeModel[12].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1098 */     this.defaultScopeModel[12].setRotationPoint(54.0F, -36.5F, 5.5F);
/*      */     
/* 1100 */     this.defaultScopeModel[13].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1101 */     this.defaultScopeModel[13].setRotationPoint(54.0F, -37.5F, 1.75F);
/*      */     
/* 1103 */     this.defaultScopeModel[14].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1104 */     this.defaultScopeModel[14].setRotationPoint(54.0F, -37.5F, 6.25F);
/*      */     
/* 1106 */     this.defaultScopeModel[15].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1107 */     this.defaultScopeModel[15].setRotationPoint(54.0F, -38.5F, 6.25F);
/*      */     
/* 1109 */     this.defaultScopeModel[16].addShapeBox(12.0F, 2.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1110 */     this.defaultScopeModel[16].setRotationPoint(54.0F, -38.5F, 1.75F);
/*      */     
/* 1112 */     this.defaultScopeModel[17].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1113 */     this.defaultScopeModel[17].setRotationPoint(55.0F, -37.5F, 4.0F);
/*      */     
/* 1115 */     this.defaultScopeModel[18].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1116 */     this.defaultScopeModel[18].setRotationPoint(60.5F, -29.5F, 0.0F);
/*      */     
/* 1118 */     this.defaultScopeModel[19].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1119 */     this.defaultScopeModel[19].setRotationPoint(55.5F, -29.5F, 0.0F);
/*      */     
/* 1121 */     this.defaultScopeModel[20].addShapeBox(12.0F, 2.0F, -4.5F, 7, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1122 */     this.defaultScopeModel[20].setRotationPoint(-9.0F, -30.5F, 0.5F);
/*      */     
/* 1124 */     this.defaultScopeModel[21].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1125 */     this.defaultScopeModel[21].setRotationPoint(-3.5F, -29.5F, 0.0F);
/*      */     
/* 1127 */     this.defaultScopeModel[22].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1128 */     this.defaultScopeModel[22].setRotationPoint(-8.5F, -29.5F, 0.0F);
/*      */     
/* 1130 */     this.defaultScopeModel[23].addShapeBox(12.0F, 2.0F, -4.5F, 7, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1131 */     this.defaultScopeModel[23].setRotationPoint(-9.0F, -31.75F, 0.5F);
/*      */     
/* 1133 */     this.defaultScopeModel[24].addShapeBox(12.0F, 2.0F, -4.5F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1134 */     this.defaultScopeModel[24].setRotationPoint(-9.0F, -30.75F, 1.0F);
/*      */     
/* 1136 */     this.defaultScopeModel[25].addShapeBox(12.0F, 2.0F, -4.5F, 7, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1137 */     this.defaultScopeModel[25].setRotationPoint(-9.0F, -32.75F, 0.5F);
/*      */     
/* 1139 */     this.defaultScopeModel[26].addShapeBox(12.0F, 2.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1140 */     this.defaultScopeModel[26].setRotationPoint(-6.5F, -33.0F, 3.5F);
/*      */     
/* 1142 */     this.defaultScopeModel[27].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1143 */     this.defaultScopeModel[27].setRotationPoint(-7.5F, -38.0F, 7.5F);
/*      */     
/* 1145 */     this.defaultScopeModel[28].addShapeBox(12.0F, 2.0F, -4.5F, 4, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1146 */     this.defaultScopeModel[28].setRotationPoint(-7.5F, -36.5F, 6.5F);
/*      */     
/* 1148 */     this.defaultScopeModel[29].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 1149 */     this.defaultScopeModel[29].setRotationPoint(-7.5F, -33.5F, 7.5F);
/*      */     
/* 1151 */     this.defaultScopeModel[30].addShapeBox(12.0F, 2.0F, -4.5F, 4, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1152 */     this.defaultScopeModel[30].setRotationPoint(-7.5F, -36.5F, 0.5F);
/*      */     
/* 1154 */     this.defaultScopeModel[31].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 1, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1155 */     this.defaultScopeModel[31].setRotationPoint(-7.5F, -38.0F, 0.5F);
/*      */     
/* 1157 */     this.defaultScopeModel[32].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1158 */     this.defaultScopeModel[32].setRotationPoint(-7.5F, -33.5F, 0.5F);
/*      */     
/* 1160 */     this.defaultScopeModel[33].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1161 */     this.defaultScopeModel[33].setRotationPoint(-7.5F, -38.0F, 1.5F);
/*      */     
/* 1163 */     this.defaultScopeModel[34].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 1, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1164 */     this.defaultScopeModel[34].setRotationPoint(-7.5F, -38.0F, 6.5F);
/*      */     
/* 1166 */     this.defaultScopeModel[35].addShapeBox(12.0F, 2.0F, -4.5F, 2, 1, 6, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1167 */     this.defaultScopeModel[35].setRotationPoint(-6.5F, -33.5F, 1.5F);
/*      */     
/* 1169 */     this.defaultScopeModel[36].addShapeBox(12.0F, 2.0F, -4.5F, 4, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1170 */     this.defaultScopeModel[36].setRotationPoint(-7.5F, -34.5F, 2.5F);
/*      */     
/* 1172 */     this.defaultScopeModel[37].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 4, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1173 */     this.defaultScopeModel[37].setRotationPoint(-6.0F, -35.25F, 2.5F);
/*      */     
/* 1175 */     this.defaultScopeModel[38].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 1, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/* 1176 */     this.defaultScopeModel[38].setRotationPoint(-6.0F, -37.25F, 2.75F);
/*      */     
/* 1178 */     this.defaultScopeModel[39].addShapeBox(12.0F, 2.0F, -4.5F, 1, 2, 1, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/* 1179 */     this.defaultScopeModel[39].setRotationPoint(-6.0F, -37.25F, 4.75F);
/*      */     
/* 1181 */     this.defaultScopeModel[40].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 2, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1182 */     this.defaultScopeModel[40].setRotationPoint(-6.0F, -37.5F, 3.25F);
/*      */     
/* 1184 */     this.defaultScopeModel[41].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1185 */     this.defaultScopeModel[41].setRotationPoint(-6.0F, -35.5F, 0.0F);
/*      */     
/* 1187 */     this.defaultScopeModel[42].addShapeBox(12.0F, 2.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1188 */     this.defaultScopeModel[42].setRotationPoint(-6.0F, -35.5F, 8.0F);
/*      */     
/*      */ 
/* 1191 */     this.ammoModel = new ModelRendererTurbo[2];
/* 1192 */     this.ammoModel[0] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 1193 */     this.ammoModel[1] = new ModelRendererTurbo(this, 297, 169, this.textureX, this.textureY);
/*      */     
/* 1195 */     this.ammoModel[0].addShapeBox(12.0F, 2.0F, -4.5F, 11, 26, 7, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F);
/* 1196 */     this.ammoModel[0].setRotationPoint(18.35F, 10.5F, 1.0F);
/*      */     
/* 1198 */     this.ammoModel[1].addShapeBox(12.0F, 2.0F, -4.5F, 11, 26, 7, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F);
/* 1199 */     this.ammoModel[1].setRotationPoint(29.35F, -10.5F, 1.0F);
/*      */     
/*      */ 
/* 1202 */     this.scopeAttachPoint = new Vector3f(0.1875F, 2.375F, 0.0F);
/* 1203 */     this.gripAttachPoint = new Vector3f(4.125F, 1.0F, 0.0F);
/*      */     
/*      */ 
/* 1206 */     translateAll(0.0F, -11.75F, 0.0F);
/* 1207 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*      */     
/* 1209 */     this.gunSlideDistance = 0.0F;
/* 1210 */     this.animationType = EnumAnimationType.CUSTOM;this.tiltGun = 7.0F;
/* 1211 */     this.rotateGunVertical = 1.0F;
/* 1212 */     this.translateGun = new Vector3f(0.15F, 0.07F, 0.0F);
/*      */     
/* 1214 */     this.rotateClipVertical = 5.0F;
/* 1215 */     this.translateClip = new Vector3f(-2.0F, -12.0F, 0.0F);
/*      */     
/*      */ 
/* 1218 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelvector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */