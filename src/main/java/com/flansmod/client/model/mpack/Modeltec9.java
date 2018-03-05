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
/*      */ public class Modeltec9
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modeltec9()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ň'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 185, 57, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 57, 81, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 121, 97, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 97, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 89, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 105, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 113, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 121, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 113, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 73, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 129, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 129, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 425, 97, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 217, 113, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 497, 97, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 249, 129, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 385, 129, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 481, 129, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 201, 137, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 225, 137, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 25, 145, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 137, 145, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 161, 145, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 185, 145, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 297, 145, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 313, 145, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 369, 145, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 25, 81, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 17, 97, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 249, 105, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 305, 105, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 489, 73, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 353, 57, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 305, 121, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 321, 121, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 345, 129, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 129, 129, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 489, 145, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 41, 153, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 65, 153, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 89, 153, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 113, 153, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 201, 153, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 225, 153, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 249, 153, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 241, 81, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 313, 153, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 17, 105, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 89, 105, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 361, 153, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 385, 153, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 409, 153, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 433, 153, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 217, 137, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 17, 145, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 153, 145, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 257, 89, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 289, 145, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 57, 153, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 81, 153, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 105, 153, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 121, 97, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 217, 153, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 241, 153, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 329, 153, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 353, 153, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 377, 153, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 305, 113, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 497, 129, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 401, 153, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 249, 129, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 425, 153, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 449, 153, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 129, 153, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 265, 153, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 465, 153, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 9, 161, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 473, 153, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 129, 161, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 161, 161, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 177, 161, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 457, 113, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 505, 113, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 281, 153, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 41, 169, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 385, 129, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 97, 137, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 201, 137, this.textureX, this.textureY);
/*      */     
/*  350 */     this.gunModel[0].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  351 */     this.gunModel[0].setRotationPoint(-39.0F, -20.0F, 0.0F);
/*      */     
/*  353 */     this.gunModel[1].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  354 */     this.gunModel[1].setRotationPoint(-39.0F, -19.0F, 0.0F);
/*      */     
/*  356 */     this.gunModel[2].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  357 */     this.gunModel[2].setRotationPoint(-39.0F, -18.0F, 0.0F);
/*      */     
/*  359 */     this.gunModel[3].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  360 */     this.gunModel[3].setRotationPoint(-39.0F, -17.0F, 0.0F);
/*      */     
/*  362 */     this.gunModel[4].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -3.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  363 */     this.gunModel[4].setRotationPoint(-39.0F, -16.0F, 0.0F);
/*      */     
/*  365 */     this.gunModel[5].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  366 */     this.gunModel[5].setRotationPoint(-39.0F, -15.0F, 0.0F);
/*      */     
/*  368 */     this.gunModel[6].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/*  369 */     this.gunModel[6].setRotationPoint(-39.0F, -14.0F, 0.0F);
/*      */     
/*  371 */     this.gunModel[7].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  372 */     this.gunModel[7].setRotationPoint(-39.0F, -13.0F, 0.0F);
/*      */     
/*  374 */     this.gunModel[8].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  375 */     this.gunModel[8].setRotationPoint(-39.0F, -12.0F, 0.0F);
/*      */     
/*  377 */     this.gunModel[9].addShapeBox(26.0F, 0.0F, -4.5F, 20, 1, 9, 0.0F, -1.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  378 */     this.gunModel[9].setRotationPoint(-39.0F, -11.0F, 0.0F);
/*      */     
/*  380 */     this.gunModel[10].addShapeBox(26.0F, 0.0F, -4.5F, 18, 1, 9, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  381 */     this.gunModel[10].setRotationPoint(-39.0F, -10.0F, 0.0F);
/*      */     
/*  383 */     this.gunModel[11].addShapeBox(26.0F, 0.0F, -4.5F, 18, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  384 */     this.gunModel[11].setRotationPoint(-39.0F, -9.0F, 0.0F);
/*      */     
/*  386 */     this.gunModel[12].addShapeBox(26.0F, 0.0F, -4.5F, 18, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/*  387 */     this.gunModel[12].setRotationPoint(-39.0F, -8.0F, 0.0F);
/*      */     
/*  389 */     this.gunModel[13].addShapeBox(26.0F, 0.0F, -4.5F, 18, 8, 9, 0.0F, 1.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  390 */     this.gunModel[13].setRotationPoint(-39.0F, -7.0F, 0.0F);
/*      */     
/*  392 */     this.gunModel[14].addShapeBox(26.0F, 0.0F, -4.5F, 18, 7, 9, 0.0F, 2.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F);
/*  393 */     this.gunModel[14].setRotationPoint(-42.0F, 1.0F, 0.0F);
/*      */     
/*  395 */     this.gunModel[15].addShapeBox(26.0F, 0.0F, -4.5F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  396 */     this.gunModel[15].setRotationPoint(-42.0F, 8.0F, 0.0F);
/*      */     
/*  398 */     this.gunModel[16].addShapeBox(26.0F, 0.0F, -4.5F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  399 */     this.gunModel[16].setRotationPoint(-42.0F, 8.0F, 0.0F);
/*      */     
/*  401 */     this.gunModel[17].addShapeBox(26.0F, 0.0F, -4.5F, 4, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  402 */     this.gunModel[17].setRotationPoint(-46.5F, 8.0F, 0.0F);
/*      */     
/*  404 */     this.gunModel[18].addShapeBox(26.0F, 0.0F, -4.5F, 10, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  405 */     this.gunModel[18].setRotationPoint(-42.0F, 9.0F, 0.0F);
/*      */     
/*  407 */     this.gunModel[19].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  408 */     this.gunModel[19].setRotationPoint(-32.0F, 9.0F, 0.0F);
/*      */     
/*  410 */     this.gunModel[20].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  411 */     this.gunModel[20].setRotationPoint(-30.0F, 9.0F, 0.0F);
/*      */     
/*  413 */     this.gunModel[21].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  414 */     this.gunModel[21].setRotationPoint(-30.0F, 9.5F, 0.0F);
/*      */     
/*  416 */     this.gunModel[22].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  417 */     this.gunModel[22].setRotationPoint(-22.25F, -10.0F, 0.0F);
/*      */     
/*  419 */     this.gunModel[23].addShapeBox(26.0F, 0.0F, -4.5F, 17, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  420 */     this.gunModel[23].setRotationPoint(-19.75F, -10.0F, 0.0F);
/*      */     
/*  422 */     this.gunModel[24].addShapeBox(26.0F, 0.0F, -4.5F, 6, 1, 9, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  423 */     this.gunModel[24].setRotationPoint(-25.0F, -11.0F, 0.0F);
/*      */     
/*  425 */     this.gunModel[25].addShapeBox(26.0F, 0.0F, -4.5F, 15, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/*  426 */     this.gunModel[25].setRotationPoint(-18.75F, -20.0F, 0.0F);
/*      */     
/*  428 */     this.gunModel[26].addShapeBox(26.0F, 0.0F, -4.5F, 38, 4, 9, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  429 */     this.gunModel[26].setRotationPoint(-41.75F, -24.0F, 0.0F);
/*      */     
/*  431 */     this.gunModel[27].addShapeBox(26.0F, 0.0F, -4.5F, 1, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  432 */     this.gunModel[27].setRotationPoint(-43.75F, -24.0F, 0.0F);
/*      */     
/*  434 */     this.gunModel[28].addShapeBox(26.0F, 0.0F, -4.5F, 12, 1, 9, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  435 */     this.gunModel[28].setRotationPoint(-15.75F, -25.0F, 0.0F);
/*      */     
/*  437 */     this.gunModel[29].addShapeBox(26.0F, 0.0F, -4.5F, 7, 5, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  438 */     this.gunModel[29].setRotationPoint(-3.75F, -25.0F, 0.0F);
/*      */     
/*  440 */     this.gunModel[30].addShapeBox(26.0F, 0.0F, -4.5F, 2, 5, 9, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  441 */     this.gunModel[30].setRotationPoint(4.25F, -25.0F, 0.0F);
/*      */     
/*  443 */     this.gunModel[31].addShapeBox(26.0F, 0.0F, -4.5F, 9, 15, 9, 0.0F, 0.0F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  444 */     this.gunModel[31].setRotationPoint(-3.0F, -22.0F, 0.0F);
/*      */     
/*  446 */     this.gunModel[32].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  447 */     this.gunModel[32].setRotationPoint(-31.75F, -18.0F, -0.5F);
/*      */     
/*  449 */     this.gunModel[33].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  450 */     this.gunModel[33].setRotationPoint(-31.75F, -16.5F, -0.5F);
/*      */     
/*  452 */     this.gunModel[34].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F);
/*  453 */     this.gunModel[34].setRotationPoint(-31.75F, -15.0F, -0.5F);
/*      */     
/*  455 */     this.gunModel[35].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  456 */     this.gunModel[35].setRotationPoint(-30.25F, -15.0F, -0.5F);
/*      */     
/*  458 */     this.gunModel[36].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  459 */     this.gunModel[36].setRotationPoint(-30.25F, -16.5F, -0.5F);
/*      */     
/*  461 */     this.gunModel[37].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  462 */     this.gunModel[37].setRotationPoint(-30.25F, -18.0F, -0.5F);
/*      */     
/*  464 */     this.gunModel[38].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  465 */     this.gunModel[38].setRotationPoint(-28.75F, -18.0F, -0.5F);
/*      */     
/*  467 */     this.gunModel[39].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  468 */     this.gunModel[39].setRotationPoint(-28.75F, -16.5F, -0.5F);
/*      */     
/*  470 */     this.gunModel[40].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  471 */     this.gunModel[40].setRotationPoint(-28.75F, -15.0F, -0.5F);
/*      */     
/*  473 */     this.gunModel[41].addShapeBox(26.0F, 0.0F, -4.5F, 8, 14, 10, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -6.75F, -0.25F, 0.0F, -6.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  474 */     this.gunModel[41].setRotationPoint(-35.25F, -6.5F, -0.5F);
/*      */     
/*  476 */     this.gunModel[42].addShapeBox(26.0F, 0.0F, -4.5F, 8, 13, 10, 0.0F, -5.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -5.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  477 */     this.gunModel[42].setRotationPoint(-42.75F, -6.5F, -0.5F);
/*      */     
/*  479 */     this.gunModel[43].addShapeBox(26.0F, 0.0F, -4.5F, 8, 2, 10, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  480 */     this.gunModel[43].setRotationPoint(-42.75F, 6.0F, -0.5F);
/*      */     
/*  482 */     this.gunModel[44].addShapeBox(26.0F, 0.0F, -4.5F, 7, 1, 10, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.5F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.5F, -0.5F, 0.0F);
/*  483 */     this.gunModel[44].setRotationPoint(-41.75F, 7.5F, -0.5F);
/*      */     
/*  485 */     this.gunModel[45].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  486 */     this.gunModel[45].setRotationPoint(-35.0F, 7.25F, -0.5F);
/*      */     
/*  488 */     this.gunModel[46].addShapeBox(26.0F, 0.0F, -4.5F, 9, 2, 10, 0.0F, -2.5F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  489 */     this.gunModel[46].setRotationPoint(-37.75F, -8.0F, -0.5F);
/*      */     
/*  491 */     this.gunModel[47].addShapeBox(26.0F, 0.0F, -4.5F, 8, 1, 10, 0.0F, -5.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -5.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  492 */     this.gunModel[47].setRotationPoint(-35.75F, -8.75F, -0.5F);
/*      */     
/*  494 */     this.gunModel[48].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  495 */     this.gunModel[48].setRotationPoint(-15.75F, -19.0F, 2.5F);
/*      */     
/*  497 */     this.gunModel[49].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  498 */     this.gunModel[49].setRotationPoint(-15.75F, -18.0F, 2.5F);
/*      */     
/*  500 */     this.gunModel[50].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  501 */     this.gunModel[50].setRotationPoint(-15.75F, -16.0F, 2.5F);
/*      */     
/*  503 */     this.gunModel[51].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  504 */     this.gunModel[51].setRotationPoint(-15.25F, -15.0F, 2.5F);
/*      */     
/*  506 */     this.gunModel[52].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/*  507 */     this.gunModel[52].setRotationPoint(-14.5F, -14.0F, 2.5F);
/*      */     
/*  509 */     this.gunModel[53].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  510 */     this.gunModel[53].setRotationPoint(-7.0F, -24.0F, 0.25F);
/*      */     
/*  512 */     this.gunModel[54].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  513 */     this.gunModel[54].setRotationPoint(-6.0F, -24.0F, 0.25F);
/*      */     
/*  515 */     this.gunModel[55].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  516 */     this.gunModel[55].setRotationPoint(-6.5F, -24.0F, 0.25F);
/*      */     
/*  518 */     this.gunModel[56].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  519 */     this.gunModel[56].setRotationPoint(-7.0F, -23.5F, 0.25F);
/*      */     
/*  521 */     this.gunModel[57].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  522 */     this.gunModel[57].setRotationPoint(-6.0F, -23.5F, 0.25F);
/*      */     
/*  524 */     this.gunModel[58].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  525 */     this.gunModel[58].setRotationPoint(-6.5F, -23.5F, 0.25F);
/*      */     
/*  527 */     this.gunModel[59].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  528 */     this.gunModel[59].setRotationPoint(-7.0F, -24.5F, 0.25F);
/*      */     
/*  530 */     this.gunModel[60].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  531 */     this.gunModel[60].setRotationPoint(-6.0F, -24.5F, 0.25F);
/*      */     
/*  533 */     this.gunModel[61].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  534 */     this.gunModel[61].setRotationPoint(-6.5F, -24.5F, 0.25F);
/*      */     
/*  536 */     this.gunModel[62].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  537 */     this.gunModel[62].setRotationPoint(-17.0F, -23.0F, 0.25F);
/*      */     
/*  539 */     this.gunModel[63].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  540 */     this.gunModel[63].setRotationPoint(-16.0F, -23.0F, 0.25F);
/*      */     
/*  542 */     this.gunModel[64].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  543 */     this.gunModel[64].setRotationPoint(-16.5F, -23.0F, 0.25F);
/*      */     
/*  545 */     this.gunModel[65].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  546 */     this.gunModel[65].setRotationPoint(-17.0F, -22.5F, 0.25F);
/*      */     
/*  548 */     this.gunModel[66].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  549 */     this.gunModel[66].setRotationPoint(-16.0F, -22.5F, 0.25F);
/*      */     
/*  551 */     this.gunModel[67].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  552 */     this.gunModel[67].setRotationPoint(-16.5F, -22.5F, 0.25F);
/*      */     
/*  554 */     this.gunModel[68].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  555 */     this.gunModel[68].setRotationPoint(-17.0F, -23.5F, 0.25F);
/*      */     
/*  557 */     this.gunModel[69].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  558 */     this.gunModel[69].setRotationPoint(-16.0F, -23.5F, 0.25F);
/*      */     
/*  560 */     this.gunModel[70].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  561 */     this.gunModel[70].setRotationPoint(-16.5F, -23.5F, 0.25F);
/*      */     
/*  563 */     this.gunModel[71].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/*  564 */     this.gunModel[71].setRotationPoint(-3.5F, -20.0F, 0.0F);
/*      */     
/*  566 */     this.gunModel[72].addShapeBox(26.0F, 0.0F, -4.5F, 1, 12, 9, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/*  567 */     this.gunModel[72].setRotationPoint(-3.5F, -19.0F, 0.0F);
/*      */     
/*  569 */     this.gunModel[73].addShapeBox(26.0F, 0.0F, -4.5F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  570 */     this.gunModel[73].setRotationPoint(-8.0F, -19.0F, 1.0F);
/*      */     
/*  572 */     this.gunModel[74].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  573 */     this.gunModel[74].setRotationPoint(-7.0F, -18.0F, 1.0F);
/*      */     
/*  575 */     this.gunModel[75].addShapeBox(26.0F, 0.0F, -4.5F, 3, 10, 7, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  576 */     this.gunModel[75].setRotationPoint(-7.0F, -17.0F, 1.0F);
/*      */     
/*  578 */     this.gunModel[76].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 9, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  579 */     this.gunModel[76].setRotationPoint(-6.75F, -7.0F, 0.0F);
/*      */     
/*  581 */     this.gunModel[77].addShapeBox(26.0F, 0.0F, -4.5F, 4, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  582 */     this.gunModel[77].setRotationPoint(-6.75F, -8.0F, 0.0F);
/*      */     
/*  584 */     this.gunModel[78].addShapeBox(26.0F, 0.0F, -4.5F, 1, 16, 9, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F);
/*  585 */     this.gunModel[78].setRotationPoint(6.5F, -23.0F, 0.0F);
/*      */     
/*  587 */     this.gunModel[79].addShapeBox(26.0F, 0.0F, -4.5F, 1, 15, 7, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F);
/*  588 */     this.gunModel[79].setRotationPoint(7.25F, -22.0F, 1.0F);
/*      */     
/*  590 */     this.gunModel[80].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/*  591 */     this.gunModel[80].setRotationPoint(-4.0F, -7.0F, -1.0F);
/*      */     
/*  593 */     this.gunModel[81].addShapeBox(26.0F, 0.0F, -4.5F, 10, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  594 */     this.gunModel[81].setRotationPoint(-3.0F, -7.0F, -1.0F);
/*      */     
/*  596 */     this.gunModel[82].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/*  597 */     this.gunModel[82].setRotationPoint(7.0F, -7.0F, -1.0F);
/*      */     
/*  599 */     this.gunModel[83].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  600 */     this.gunModel[83].setRotationPoint(8.0F, -7.0F, 0.0F);
/*      */     
/*  602 */     this.gunModel[84].addShapeBox(26.0F, 0.0F, -4.5F, 4, 6, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  603 */     this.gunModel[84].setRotationPoint(8.25F, -21.0F, 3.0F);
/*      */     
/*  605 */     this.gunModel[85].addShapeBox(26.0F, 0.0F, -4.5F, 7, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  606 */     this.gunModel[85].setRotationPoint(7.25F, -20.0F, 2.0F);
/*      */     
/*  608 */     this.gunModel[86].addShapeBox(26.0F, 0.0F, -4.5F, 8, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  609 */     this.gunModel[86].setRotationPoint(6.25F, -23.0F, 1.0F);
/*      */     
/*  611 */     this.gunModel[87].addShapeBox(26.0F, 0.0F, -4.5F, 6, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  612 */     this.gunModel[87].setRotationPoint(15.25F, -32.0F, -1.5F);
/*      */     
/*  614 */     this.gunModel[88].addShapeBox(26.0F, 0.0F, -4.5F, 4, 4, 12, 0.0F, 0.5F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  615 */     this.gunModel[88].setRotationPoint(14.25F, -36.0F, -1.5F);
/*      */     
/*  617 */     this.gunModel[89].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  618 */     this.gunModel[89].setRotationPoint(15.25F, -28.0F, -1.5F);
/*      */     
/*  620 */     this.gunModel[90].addShapeBox(26.0F, 0.0F, -4.5F, 39, 2, 9, 0.0F, 1.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 1.0F, 0.0F, 0.7F, 1.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 1.0F, 0.0F, -0.45F);
/*  621 */     this.gunModel[90].setRotationPoint(-42.75F, -26.0F, 0.0F);
/*      */     
/*  623 */     this.gunModel[91].addShapeBox(26.0F, 0.0F, -4.5F, 19, 3, 9, 0.0F, 1.0F, 0.5F, 1.0F, -0.25F, 0.5F, 1.0F, -0.25F, 0.5F, 1.0F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F);
/*  624 */     this.gunModel[91].setRotationPoint(-2.75F, -26.0F, 0.0F);
/*      */     
/*  626 */     this.gunModel[92].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  627 */     this.gunModel[92].setRotationPoint(24.25F, -32.0F, -1.5F);
/*      */     
/*  629 */     this.gunModel[93].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  630 */     this.gunModel[93].setRotationPoint(29.75F, -32.0F, -1.5F);
/*      */     
/*  632 */     this.gunModel[94].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  633 */     this.gunModel[94].setRotationPoint(21.25F, -31.5F, -1.5F);
/*      */     
/*  635 */     this.gunModel[95].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  636 */     this.gunModel[95].setRotationPoint(21.25F, -29.5F, -1.5F);
/*      */     
/*  638 */     this.gunModel[96].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  639 */     this.gunModel[96].setRotationPoint(23.25F, -31.5F, -1.5F);
/*      */     
/*  641 */     this.gunModel[97].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  642 */     this.gunModel[97].setRotationPoint(23.25F, -29.5F, -1.5F);
/*      */     
/*  644 */     this.gunModel[98].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  645 */     this.gunModel[98].setRotationPoint(26.75F, -31.5F, -1.5F);
/*      */     
/*  647 */     this.gunModel[99].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  648 */     this.gunModel[99].setRotationPoint(26.75F, -29.5F, -1.5F);
/*      */     
/*  650 */     this.gunModel[100].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  651 */     this.gunModel[100].setRotationPoint(28.75F, -31.5F, -1.5F);
/*      */     
/*  653 */     this.gunModel[101].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  654 */     this.gunModel[101].setRotationPoint(28.75F, -29.5F, -1.5F);
/*      */     
/*  656 */     this.gunModel[102].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  657 */     this.gunModel[102].setRotationPoint(32.25F, -31.5F, -1.5F);
/*      */     
/*  659 */     this.gunModel[103].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[103].setRotationPoint(32.25F, -29.5F, -1.5F);
/*      */     
/*  662 */     this.gunModel[104].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  663 */     this.gunModel[104].setRotationPoint(34.25F, -31.5F, -1.5F);
/*      */     
/*  665 */     this.gunModel[105].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  666 */     this.gunModel[105].setRotationPoint(34.25F, -29.5F, -1.5F);
/*      */     
/*  668 */     this.gunModel[106].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  669 */     this.gunModel[106].setRotationPoint(35.25F, -32.0F, -1.5F);
/*      */     
/*  671 */     this.gunModel[107].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  672 */     this.gunModel[107].setRotationPoint(37.75F, -31.5F, -1.5F);
/*      */     
/*  674 */     this.gunModel[108].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  675 */     this.gunModel[108].setRotationPoint(37.75F, -29.5F, -1.5F);
/*      */     
/*  677 */     this.gunModel[109].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  678 */     this.gunModel[109].setRotationPoint(39.75F, -31.5F, -1.5F);
/*      */     
/*  680 */     this.gunModel[110].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  681 */     this.gunModel[110].setRotationPoint(39.75F, -29.5F, -1.5F);
/*      */     
/*  683 */     this.gunModel[111].addShapeBox(26.0F, 0.0F, -4.5F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  684 */     this.gunModel[111].setRotationPoint(40.75F, -32.0F, -1.5F);
/*      */     
/*  686 */     this.gunModel[112].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  687 */     this.gunModel[112].setRotationPoint(37.75F, -32.0F, -1.5F);
/*      */     
/*  689 */     this.gunModel[113].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  690 */     this.gunModel[113].setRotationPoint(32.25F, -32.0F, -1.5F);
/*      */     
/*  692 */     this.gunModel[114].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  693 */     this.gunModel[114].setRotationPoint(37.75F, -28.5F, -1.5F);
/*      */     
/*  695 */     this.gunModel[115].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  696 */     this.gunModel[115].setRotationPoint(32.25F, -28.5F, -1.5F);
/*      */     
/*  698 */     this.gunModel[116].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  699 */     this.gunModel[116].setRotationPoint(26.75F, -32.0F, -1.5F);
/*      */     
/*  701 */     this.gunModel[117].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  702 */     this.gunModel[117].setRotationPoint(21.25F, -32.0F, -1.5F);
/*      */     
/*  704 */     this.gunModel[118].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  705 */     this.gunModel[118].setRotationPoint(26.75F, -28.5F, -1.5F);
/*      */     
/*  707 */     this.gunModel[119].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  708 */     this.gunModel[119].setRotationPoint(21.25F, -28.5F, -1.5F);
/*      */     
/*  710 */     this.gunModel[120].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  711 */     this.gunModel[120].setRotationPoint(35.25F, -35.0F, -1.5F);
/*      */     
/*  713 */     this.gunModel[121].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  714 */     this.gunModel[121].setRotationPoint(35.25F, -33.0F, -1.5F);
/*      */     
/*  716 */     this.gunModel[122].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F);
/*  717 */     this.gunModel[122].setRotationPoint(37.25F, -35.0F, -1.5F);
/*      */     
/*  719 */     this.gunModel[123].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  720 */     this.gunModel[123].setRotationPoint(37.25F, -33.0F, -1.5F);
/*      */     
/*  722 */     this.gunModel[124].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  723 */     this.gunModel[124].setRotationPoint(35.25F, -36.0F, 1.5F);
/*      */     
/*  725 */     this.gunModel[125].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  726 */     this.gunModel[125].setRotationPoint(29.5F, -36.0F, 1.5F);
/*      */     
/*  728 */     this.gunModel[126].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  729 */     this.gunModel[126].setRotationPoint(24.0F, -36.0F, 1.5F);
/*      */     
/*  731 */     this.gunModel[127].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  732 */     this.gunModel[127].setRotationPoint(18.5F, -36.0F, 1.5F);
/*      */     
/*  734 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 5, 4, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, -0.5F, 0.0F, 4.0F);
/*  735 */     this.gunModel[''].setRotationPoint(37.75F, -28.0F, -1.5F);
/*      */     
/*  737 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  738 */     this.gunModel[''].setRotationPoint(37.25F, -26.0F, -1.5F);
/*      */     
/*  740 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  741 */     this.gunModel[''].setRotationPoint(35.25F, -26.0F, -1.5F);
/*      */     
/*  743 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/*  744 */     this.gunModel[''].setRotationPoint(37.25F, -28.0F, -1.5F);
/*      */     
/*  746 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  747 */     this.gunModel[''].setRotationPoint(35.25F, -28.0F, -1.5F);
/*      */     
/*  749 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  750 */     this.gunModel[''].setRotationPoint(35.25F, -25.0F, 1.5F);
/*      */     
/*  752 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  753 */     this.gunModel[''].setRotationPoint(29.5F, -25.0F, 1.5F);
/*      */     
/*  755 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  756 */     this.gunModel[''].setRotationPoint(24.0F, -25.0F, 1.5F);
/*      */     
/*  758 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  759 */     this.gunModel[''].setRotationPoint(18.5F, -25.0F, 1.5F);
/*      */     
/*  761 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 28, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  762 */     this.gunModel[''].setRotationPoint(20.75F, -32.0F, 2.5F);
/*      */     
/*  764 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 4, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  765 */     this.gunModel[''].setRotationPoint(5.25F, -36.0F, -1.5F);
/*      */     
/*  767 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 58, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  768 */     this.gunModel[''].setRotationPoint(-42.75F, -31.0F, -1.5F);
/*      */     
/*  770 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 10, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  771 */     this.gunModel[''].setRotationPoint(5.25F, -32.0F, -1.5F);
/*      */     
/*  773 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 50, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/*  774 */     this.gunModel[''].setRotationPoint(-33.75F, -28.0F, -2.5F);
/*      */     
/*  776 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 50, 1, 14, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F);
/*  777 */     this.gunModel[''].setRotationPoint(-33.75F, -27.25F, -2.5F);
/*      */     
/*  779 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 17, 4, 8, 0.0F, 0.0F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  780 */     this.gunModel[''].setRotationPoint(-23.75F, -36.0F, -1.5F);
/*      */     
/*  782 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 17, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  783 */     this.gunModel[''].setRotationPoint(-23.75F, -32.0F, -1.5F);
/*      */     
/*  785 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 7, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  786 */     this.gunModel[''].setRotationPoint(-6.75F, -32.0F, -1.5F);
/*      */     
/*  788 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 7, 0.0F, -0.25F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  789 */     this.gunModel[''].setRotationPoint(-6.75F, -33.0F, -1.5F);
/*      */     
/*  791 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  792 */     this.gunModel[''].setRotationPoint(3.5F, -32.0F, -1.5F);
/*      */     
/*  794 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 7, 0.0F, -1.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  795 */     this.gunModel[''].setRotationPoint(3.5F, -33.0F, -1.5F);
/*      */     
/*  797 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 4, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  798 */     this.gunModel[''].setRotationPoint(-6.75F, -35.75F, 1.5F);
/*      */     
/*  800 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 2, 1, 4, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/*  801 */     this.gunModel[''].setRotationPoint(3.5F, -35.75F, 1.5F);
/*      */     
/*  803 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 13, 1, 5, 0.0F, -1.0F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  804 */     this.gunModel[''].setRotationPoint(-7.5F, -36.75F, 1.5F);
/*      */     
/*  806 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  807 */     this.gunModel[''].setRotationPoint(36.75F, -36.5F, 3.0F);
/*      */     
/*  809 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  810 */     this.gunModel[''].setRotationPoint(35.75F, -36.5F, 3.0F);
/*      */     
/*  812 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  813 */     this.gunModel[''].setRotationPoint(39.75F, -36.5F, 3.0F);
/*      */     
/*  815 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 3, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  816 */     this.gunModel[''].setRotationPoint(36.75F, -38.5F, 4.0F);
/*      */     
/*  818 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 19, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  819 */     this.gunModel[''].setRotationPoint(-42.75F, -36.0F, -1.5F);
/*      */     
/*  821 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 19, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  822 */     this.gunModel[''].setRotationPoint(-42.75F, -32.0F, -1.5F);
/*      */     
/*  824 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 10, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/*  825 */     this.gunModel[''].setRotationPoint(-43.75F, -28.0F, -2.5F);
/*      */     
/*  827 */     this.gunModel[''].addShapeBox(26.0F, 0.0F, -4.5F, 10, 1, 14, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F);
/*  828 */     this.gunModel[''].setRotationPoint(-43.75F, -27.25F, -2.5F);
/*      */     
/*  830 */     this.gunModel[' '].addShapeBox(26.0F, 0.0F, -4.5F, 8, 1, 13, 0.0F, 0.5F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 3.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  831 */     this.gunModel[' '].setRotationPoint(-41.75F, -29.0F, -2.0F);
/*      */     
/*  833 */     this.gunModel['¡'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 13, 0.0F, -0.25F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, -0.25F, 3.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  834 */     this.gunModel['¡'].setRotationPoint(-43.25F, -29.0F, -2.0F);
/*      */     
/*  836 */     this.gunModel['¢'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 13, 0.0F, 0.0F, 3.0F, 0.0F, -0.25F, 3.5F, 0.0F, -0.25F, 3.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  837 */     this.gunModel['¢'].setRotationPoint(-43.75F, -29.0F, -2.0F);
/*      */     
/*  839 */     this.gunModel['£'].addShapeBox(26.0F, 0.0F, -4.5F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  840 */     this.gunModel['£'].setRotationPoint(-23.75F, -36.0F, 6.5F);
/*      */     
/*  842 */     this.gunModel['¤'].addShapeBox(26.0F, 0.0F, -4.5F, 29, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  843 */     this.gunModel['¤'].setRotationPoint(-23.75F, -32.0F, 6.5F);
/*      */     
/*  845 */     this.gunModel['¥'].addShapeBox(26.0F, 0.0F, -4.5F, 12, 5, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  846 */     this.gunModel['¥'].setRotationPoint(-6.5F, -36.0F, 5.5F);
/*      */     
/*  848 */     this.gunModel['¦'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  849 */     this.gunModel['¦'].setRotationPoint(12.25F, -36.0F, 5.0F);
/*      */     
/*  851 */     this.gunModel['§'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  852 */     this.gunModel['§'].setRotationPoint(9.25F, -36.0F, 5.0F);
/*      */     
/*  854 */     this.gunModel['¨'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  855 */     this.gunModel['¨'].setRotationPoint(10.75F, -36.0F, -1.5F);
/*      */     
/*  857 */     this.gunModel['©'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 4, 7, 0.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  858 */     this.gunModel['©'].setRotationPoint(9.25F, -36.0F, -1.5F);
/*      */     
/*  860 */     this.gunModel['ª'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 4, 7, 0.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  861 */     this.gunModel['ª'].setRotationPoint(12.25F, -36.0F, -1.5F);
/*      */     
/*  863 */     this.gunModel['«'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  864 */     this.gunModel['«'].setRotationPoint(-6.9F, -17.5F, 0.5F);
/*      */     
/*  866 */     this.gunModel['¬'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  867 */     this.gunModel['¬'].setRotationPoint(-6.9F, -16.0F, 0.5F);
/*      */     
/*  869 */     this.gunModel['­'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F);
/*  870 */     this.gunModel['­'].setRotationPoint(-6.9F, -14.5F, 0.5F);
/*      */     
/*  872 */     this.gunModel['®'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  873 */     this.gunModel['®'].setRotationPoint(-5.4F, -14.5F, 0.5F);
/*      */     
/*  875 */     this.gunModel['¯'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  876 */     this.gunModel['¯'].setRotationPoint(-5.4F, -16.0F, 0.5F);
/*      */     
/*  878 */     this.gunModel['°'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  879 */     this.gunModel['°'].setRotationPoint(-5.4F, -17.5F, 0.5F);
/*      */     
/*  881 */     this.gunModel['±'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  882 */     this.gunModel['±'].setRotationPoint(-3.9F, -17.5F, 0.5F);
/*      */     
/*  884 */     this.gunModel['²'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  885 */     this.gunModel['²'].setRotationPoint(-3.9F, -16.0F, 0.5F);
/*      */     
/*  887 */     this.gunModel['³'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  888 */     this.gunModel['³'].setRotationPoint(-3.9F, -14.5F, 0.5F);
/*      */     
/*  890 */     this.gunModel['´'].addShapeBox(26.0F, 0.0F, -4.5F, 22, 2, 4, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  891 */     this.gunModel['´'].setRotationPoint(-16.5F, -34.0F, 6.5F);
/*      */     
/*  893 */     this.gunModel['µ'].addShapeBox(26.0F, 0.0F, -4.5F, 25, 2, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -3.25F, 0.0F, -0.75F, -3.25F);
/*  894 */     this.gunModel['µ'].setRotationPoint(-19.5F, -36.5F, 6.5F);
/*      */     
/*  896 */     this.gunModel['¶'].addShapeBox(26.0F, 0.0F, -4.5F, 25, 3, 4, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -4.0F, 0.0F, -0.75F, -4.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/*  897 */     this.gunModel['¶'].setRotationPoint(-19.5F, -36.0F, 6.5F);
/*      */     
/*  899 */     this.gunModel['·'].addShapeBox(26.0F, 0.0F, -4.5F, 5, 4, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F);
/*  900 */     this.gunModel['·'].setRotationPoint(37.75F, -28.0F, 8.5F);
/*      */     
/*  902 */     this.gunModel['¸'].addShapeBox(26.0F, 0.0F, -4.5F, 5, 2, 2, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  903 */     this.gunModel['¸'].setRotationPoint(37.75F, -26.0F, 3.5F);
/*      */     
/*  905 */     this.gunModel['¹'].addShapeBox(26.0F, 0.0F, -4.5F, 5, 4, 2, 0.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, -0.5F, 0.0F, 4.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  906 */     this.gunModel['¹'].setRotationPoint(37.75F, -36.0F, -1.5F);
/*      */     
/*  908 */     this.gunModel['º'].addShapeBox(26.0F, 0.0F, -4.5F, 5, 4, 2, 0.0F, -0.5F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  909 */     this.gunModel['º'].setRotationPoint(37.75F, -36.0F, 8.5F);
/*      */     
/*  911 */     this.gunModel['»'].addShapeBox(26.0F, 0.0F, -4.5F, 5, 2, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  912 */     this.gunModel['»'].setRotationPoint(37.75F, -36.0F, 3.5F);
/*      */     
/*  914 */     this.gunModel['¼'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  915 */     this.gunModel['¼'].setRotationPoint(40.75F, -32.0F, 8.5F);
/*      */     
/*  917 */     this.gunModel['½'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F);
/*  918 */     this.gunModel['½'].setRotationPoint(32.23F, -28.0F, -1.5F);
/*      */     
/*  920 */     this.gunModel['¾'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F);
/*  921 */     this.gunModel['¾'].setRotationPoint(32.23F, -28.0F, 8.5F);
/*      */     
/*  923 */     this.gunModel['¿'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 2, 2, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/*  924 */     this.gunModel['¿'].setRotationPoint(32.23F, -26.0F, 3.5F);
/*      */     
/*  926 */     this.gunModel['À'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F);
/*  927 */     this.gunModel['À'].setRotationPoint(3.75F, -37.5F, 6.0F);
/*  928 */     this.gunModel['À'].rotateAngleX = 0.7853982F;
/*      */     
/*  930 */     this.gunModel['Á'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, 0.3F, 0.0F, 0.5F, 0.3F);
/*  931 */     this.gunModel['Á'].setRotationPoint(4.75F, -37.5F, 6.0F);
/*  932 */     this.gunModel['Á'].rotateAngleX = 0.7853982F;
/*      */     
/*  934 */     this.gunModel['Â'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, 0.3F, 0.0F, -0.5F, 0.3F);
/*  935 */     this.gunModel['Â'].setRotationPoint(2.75F, -37.5F, 6.0F);
/*  936 */     this.gunModel['Â'].rotateAngleX = 0.7853982F;
/*      */     
/*  938 */     this.gunModel['Ã'].addShapeBox(26.0F, 0.0F, -4.5F, 6, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  939 */     this.gunModel['Ã'].setRotationPoint(15.25F, -32.0F, 8.5F);
/*      */     
/*  941 */     this.gunModel['Ä'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  942 */     this.gunModel['Ä'].setRotationPoint(24.25F, -32.0F, 8.5F);
/*      */     
/*  944 */     this.gunModel['Å'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  945 */     this.gunModel['Å'].setRotationPoint(29.75F, -32.0F, 8.5F);
/*      */     
/*  947 */     this.gunModel['Æ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  948 */     this.gunModel['Æ'].setRotationPoint(21.25F, -31.5F, 8.5F);
/*      */     
/*  950 */     this.gunModel['Ç'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  951 */     this.gunModel['Ç'].setRotationPoint(21.25F, -29.5F, 8.5F);
/*      */     
/*  953 */     this.gunModel['È'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  954 */     this.gunModel['È'].setRotationPoint(23.25F, -29.5F, 8.5F);
/*      */     
/*  956 */     this.gunModel['É'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  957 */     this.gunModel['É'].setRotationPoint(26.75F, -31.5F, 8.5F);
/*      */     
/*  959 */     this.gunModel['Ê'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  960 */     this.gunModel['Ê'].setRotationPoint(26.75F, -29.5F, 8.5F);
/*      */     
/*  962 */     this.gunModel['Ë'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  963 */     this.gunModel['Ë'].setRotationPoint(28.75F, -31.5F, 8.5F);
/*      */     
/*  965 */     this.gunModel['Ì'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  966 */     this.gunModel['Ì'].setRotationPoint(28.75F, -29.5F, 8.5F);
/*      */     
/*  968 */     this.gunModel['Í'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  969 */     this.gunModel['Í'].setRotationPoint(32.25F, -31.5F, 8.5F);
/*      */     
/*  971 */     this.gunModel['Î'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  972 */     this.gunModel['Î'].setRotationPoint(32.25F, -29.5F, 8.5F);
/*      */     
/*  974 */     this.gunModel['Ï'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  975 */     this.gunModel['Ï'].setRotationPoint(34.25F, -31.5F, 8.5F);
/*      */     
/*  977 */     this.gunModel['Ð'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  978 */     this.gunModel['Ð'].setRotationPoint(34.25F, -29.5F, 8.5F);
/*      */     
/*  980 */     this.gunModel['Ñ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  981 */     this.gunModel['Ñ'].setRotationPoint(35.25F, -32.0F, 8.5F);
/*      */     
/*  983 */     this.gunModel['Ò'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  984 */     this.gunModel['Ò'].setRotationPoint(37.75F, -31.5F, 8.5F);
/*      */     
/*  986 */     this.gunModel['Ó'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  987 */     this.gunModel['Ó'].setRotationPoint(37.75F, -29.5F, 8.5F);
/*      */     
/*  989 */     this.gunModel['Ô'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  990 */     this.gunModel['Ô'].setRotationPoint(39.75F, -31.5F, 8.5F);
/*      */     
/*  992 */     this.gunModel['Õ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  993 */     this.gunModel['Õ'].setRotationPoint(39.75F, -29.5F, 8.5F);
/*      */     
/*  995 */     this.gunModel['Ö'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  996 */     this.gunModel['Ö'].setRotationPoint(37.75F, -32.0F, 8.5F);
/*      */     
/*  998 */     this.gunModel['×'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  999 */     this.gunModel['×'].setRotationPoint(32.25F, -32.0F, 8.5F);
/*      */     
/* 1001 */     this.gunModel['Ø'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1002 */     this.gunModel['Ø'].setRotationPoint(37.75F, -28.5F, 8.5F);
/*      */     
/* 1004 */     this.gunModel['Ù'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1005 */     this.gunModel['Ù'].setRotationPoint(32.25F, -28.5F, 8.5F);
/*      */     
/* 1007 */     this.gunModel['Ú'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1008 */     this.gunModel['Ú'].setRotationPoint(26.75F, -32.0F, 8.5F);
/*      */     
/* 1010 */     this.gunModel['Û'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1011 */     this.gunModel['Û'].setRotationPoint(21.25F, -32.0F, 8.5F);
/*      */     
/* 1013 */     this.gunModel['Ü'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1014 */     this.gunModel['Ü'].setRotationPoint(26.75F, -28.5F, 8.5F);
/*      */     
/* 1016 */     this.gunModel['Ý'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1017 */     this.gunModel['Ý'].setRotationPoint(21.25F, -28.5F, 8.5F);
/*      */     
/* 1019 */     this.gunModel['Þ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F);
/* 1020 */     this.gunModel['Þ'].setRotationPoint(3.75F, -38.0F, 6.5F);
/* 1021 */     this.gunModel['Þ'].rotateAngleX = 0.7853982F;
/*      */     
/* 1023 */     this.gunModel['ß'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, -0.6F, 0.0F, -0.5F, -0.6F, -0.5F, -0.5F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.5F, -0.6F, 0.0F, -0.5F, -0.6F, -0.5F, -0.5F, 0.35F, 0.0F, 0.0F, 0.35F);
/* 1024 */     this.gunModel['ß'].setRotationPoint(4.75F, -38.0F, 6.5F);
/* 1025 */     this.gunModel['ß'].rotateAngleX = 0.7853982F;
/*      */     
/* 1027 */     this.gunModel['à'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.35F, -0.5F, -0.5F, 0.35F, 0.0F, -0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.35F, -0.5F, -0.5F, 0.35F);
/* 1028 */     this.gunModel['à'].setRotationPoint(2.75F, -38.0F, 6.5F);
/* 1029 */     this.gunModel['à'].rotateAngleX = 0.7853982F;
/*      */     
/* 1031 */     this.gunModel['á'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F);
/* 1032 */     this.gunModel['á'].setRotationPoint(3.75F, -38.0F, 6.5F);
/* 1033 */     this.gunModel['á'].rotateAngleX = 0.7853982F;
/*      */     
/* 1035 */     this.gunModel['â'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, 0.35F, 0.0F, 0.0F, 0.35F);
/* 1036 */     this.gunModel['â'].setRotationPoint(4.75F, -38.0F, 6.5F);
/* 1037 */     this.gunModel['â'].rotateAngleX = 0.7853982F;
/*      */     
/* 1039 */     this.gunModel['ã'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 2, 0.0F, -0.5F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.35F, -0.5F, -0.5F, 0.35F, -0.5F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.35F, -0.5F, -0.5F, 0.35F);
/* 1040 */     this.gunModel['ã'].setRotationPoint(2.75F, -38.0F, 6.5F);
/* 1041 */     this.gunModel['ã'].rotateAngleX = 0.7853982F;
/*      */     
/* 1043 */     this.gunModel['ä'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, -0.5F, -0.5F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.5F, -0.6F, 0.0F, -0.5F, -0.6F, -0.5F, -0.5F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.5F, -0.6F, 0.0F, -0.5F, -0.6F);
/* 1044 */     this.gunModel['ä'].setRotationPoint(2.75F, -39.75F, 8.25F);
/* 1045 */     this.gunModel['ä'].rotateAngleX = 0.7853982F;
/*      */     
/* 1047 */     this.gunModel['å'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.35F, -0.5F, -0.5F, 0.35F, 0.0F, -0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.35F, -0.5F, -0.5F, 0.35F, 0.0F, -0.5F, -0.6F, 0.0F, 0.5F, -0.6F);
/* 1048 */     this.gunModel['å'].setRotationPoint(4.75F, -39.75F, 8.25F);
/* 1049 */     this.gunModel['å'].rotateAngleX = 0.7853982F;
/*      */     
/* 1051 */     this.gunModel['æ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F);
/* 1052 */     this.gunModel['æ'].setRotationPoint(3.75F, -39.75F, 8.25F);
/* 1053 */     this.gunModel['æ'].rotateAngleX = 0.7853982F;
/*      */     
/* 1055 */     this.gunModel['ç'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F);
/* 1056 */     this.gunModel['ç'].setRotationPoint(3.75F, -39.5F, 8.0F);
/* 1057 */     this.gunModel['ç'].rotateAngleX = 0.7853982F;
/*      */     
/* 1059 */     this.gunModel['è'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.3F, 0.0F, 0.5F, 0.3F);
/* 1060 */     this.gunModel['è'].setRotationPoint(4.75F, -39.5F, 8.0F);
/* 1061 */     this.gunModel['è'].rotateAngleX = 0.7853982F;
/*      */     
/* 1063 */     this.gunModel['é'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.3F, 0.0F, -0.5F, 0.3F);
/* 1064 */     this.gunModel['é'].setRotationPoint(2.75F, -39.5F, 8.0F);
/* 1065 */     this.gunModel['é'].rotateAngleX = 0.7853982F;
/*      */     
/* 1067 */     this.gunModel['ê'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1068 */     this.gunModel['ê'].setRotationPoint(3.25F, -36.5F, 5.0F);
/* 1069 */     this.gunModel['ê'].rotateAngleX = 0.7853982F;
/*      */     
/* 1071 */     this.gunModel['ë'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1072 */     this.gunModel['ë'].setRotationPoint(32.25F, -36.0F, -1.5F);
/*      */     
/* 1074 */     this.gunModel['ì'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1075 */     this.gunModel['ì'].setRotationPoint(32.25F, -36.0F, 8.5F);
/*      */     
/* 1077 */     this.gunModel['í'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 2, 2, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F);
/* 1078 */     this.gunModel['í'].setRotationPoint(32.25F, -36.0F, 3.5F);
/*      */     
/* 1080 */     this.gunModel['î'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1081 */     this.gunModel['î'].setRotationPoint(26.75F, -36.0F, -1.5F);
/*      */     
/* 1083 */     this.gunModel['ï'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1084 */     this.gunModel['ï'].setRotationPoint(26.75F, -36.0F, 8.5F);
/*      */     
/* 1086 */     this.gunModel['ð'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 2, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1087 */     this.gunModel['ð'].setRotationPoint(26.5F, -36.0F, 3.5F);
/*      */     
/* 1089 */     this.gunModel['ñ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1090 */     this.gunModel['ñ'].setRotationPoint(21.25F, -36.0F, -1.5F);
/*      */     
/* 1092 */     this.gunModel['ò'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1093 */     this.gunModel['ò'].setRotationPoint(21.25F, -36.0F, 8.5F);
/*      */     
/* 1095 */     this.gunModel['ó'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 2, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1096 */     this.gunModel['ó'].setRotationPoint(21.0F, -36.0F, 3.5F);
/*      */     
/* 1098 */     this.gunModel['ô'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1099 */     this.gunModel['ô'].setRotationPoint(29.5F, -35.0F, -1.5F);
/*      */     
/* 1101 */     this.gunModel['õ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1102 */     this.gunModel['õ'].setRotationPoint(29.5F, -33.0F, -1.5F);
/*      */     
/* 1104 */     this.gunModel['ö'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F);
/* 1105 */     this.gunModel['ö'].setRotationPoint(31.5F, -35.0F, -1.5F);
/*      */     
/* 1107 */     this.gunModel['÷'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1108 */     this.gunModel['÷'].setRotationPoint(31.5F, -33.0F, -1.5F);
/*      */     
/* 1110 */     this.gunModel['ø'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1111 */     this.gunModel['ø'].setRotationPoint(24.0F, -35.0F, -1.5F);
/*      */     
/* 1113 */     this.gunModel['ù'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1114 */     this.gunModel['ù'].setRotationPoint(24.0F, -33.0F, -1.5F);
/*      */     
/* 1116 */     this.gunModel['ú'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F);
/* 1117 */     this.gunModel['ú'].setRotationPoint(26.0F, -35.0F, -1.5F);
/*      */     
/* 1119 */     this.gunModel['û'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1120 */     this.gunModel['û'].setRotationPoint(26.0F, -33.0F, -1.5F);
/*      */     
/* 1122 */     this.gunModel['ü'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1123 */     this.gunModel['ü'].setRotationPoint(18.5F, -35.0F, -1.5F);
/*      */     
/* 1125 */     this.gunModel['ý'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1126 */     this.gunModel['ý'].setRotationPoint(18.5F, -33.0F, -1.5F);
/*      */     
/* 1128 */     this.gunModel['þ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F);
/* 1129 */     this.gunModel['þ'].setRotationPoint(20.5F, -35.0F, -1.5F);
/*      */     
/* 1131 */     this.gunModel['ÿ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1132 */     this.gunModel['ÿ'].setRotationPoint(20.5F, -33.0F, -1.5F);
/*      */     
/* 1134 */     this.gunModel['Ā'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1135 */     this.gunModel['Ā'].setRotationPoint(37.25F, -33.0F, 6.5F);
/*      */     
/* 1137 */     this.gunModel['ā'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1138 */     this.gunModel['ā'].setRotationPoint(35.25F, -33.0F, 6.5F);
/*      */     
/* 1140 */     this.gunModel['Ă'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1141 */     this.gunModel['Ă'].setRotationPoint(35.25F, -35.0F, 2.5F);
/*      */     
/* 1143 */     this.gunModel['ă'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F);
/* 1144 */     this.gunModel['ă'].setRotationPoint(37.25F, -35.0F, 2.5F);
/*      */     
/* 1146 */     this.gunModel['Ą'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1147 */     this.gunModel['Ą'].setRotationPoint(31.5F, -33.0F, 6.5F);
/*      */     
/* 1149 */     this.gunModel['ą'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1150 */     this.gunModel['ą'].setRotationPoint(29.5F, -33.0F, 6.5F);
/*      */     
/* 1152 */     this.gunModel['Ć'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1153 */     this.gunModel['Ć'].setRotationPoint(29.5F, -35.0F, 2.5F);
/*      */     
/* 1155 */     this.gunModel['ć'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F);
/* 1156 */     this.gunModel['ć'].setRotationPoint(31.5F, -35.0F, 2.5F);
/*      */     
/* 1158 */     this.gunModel['Ĉ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1159 */     this.gunModel['Ĉ'].setRotationPoint(26.0F, -33.0F, 6.5F);
/*      */     
/* 1161 */     this.gunModel['ĉ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1162 */     this.gunModel['ĉ'].setRotationPoint(24.0F, -33.0F, 6.5F);
/*      */     
/* 1164 */     this.gunModel['Ċ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1165 */     this.gunModel['Ċ'].setRotationPoint(24.0F, -35.0F, 2.5F);
/*      */     
/* 1167 */     this.gunModel['ċ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F);
/* 1168 */     this.gunModel['ċ'].setRotationPoint(26.0F, -35.0F, 2.5F);
/*      */     
/* 1170 */     this.gunModel['Č'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1171 */     this.gunModel['Č'].setRotationPoint(20.5F, -33.0F, 6.5F);
/*      */     
/* 1173 */     this.gunModel['č'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1174 */     this.gunModel['č'].setRotationPoint(18.5F, -33.0F, 6.5F);
/*      */     
/* 1176 */     this.gunModel['Ď'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1177 */     this.gunModel['Ď'].setRotationPoint(18.5F, -35.0F, 2.5F);
/*      */     
/* 1179 */     this.gunModel['ď'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F);
/* 1180 */     this.gunModel['ď'].setRotationPoint(20.5F, -35.0F, 2.5F);
/*      */     
/* 1182 */     this.gunModel['Đ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1183 */     this.gunModel['Đ'].setRotationPoint(31.5F, -26.0F, -1.5F);
/*      */     
/* 1185 */     this.gunModel['đ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1186 */     this.gunModel['đ'].setRotationPoint(29.5F, -26.0F, -1.5F);
/*      */     
/* 1188 */     this.gunModel['Ē'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/* 1189 */     this.gunModel['Ē'].setRotationPoint(31.5F, -28.0F, -1.5F);
/*      */     
/* 1191 */     this.gunModel['ē'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1192 */     this.gunModel['ē'].setRotationPoint(29.5F, -28.0F, -1.5F);
/*      */     
/* 1194 */     this.gunModel['Ĕ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1195 */     this.gunModel['Ĕ'].setRotationPoint(26.0F, -26.0F, -1.5F);
/*      */     
/* 1197 */     this.gunModel['ĕ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1198 */     this.gunModel['ĕ'].setRotationPoint(24.0F, -26.0F, -1.5F);
/*      */     
/* 1200 */     this.gunModel['Ė'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/* 1201 */     this.gunModel['Ė'].setRotationPoint(26.0F, -28.0F, -1.5F);
/*      */     
/* 1203 */     this.gunModel['ė'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1204 */     this.gunModel['ė'].setRotationPoint(24.0F, -28.0F, -1.5F);
/*      */     
/* 1206 */     this.gunModel['Ę'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1207 */     this.gunModel['Ę'].setRotationPoint(20.5F, -26.0F, -1.5F);
/*      */     
/* 1209 */     this.gunModel['ę'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1210 */     this.gunModel['ę'].setRotationPoint(18.5F, -26.0F, -1.5F);
/*      */     
/* 1212 */     this.gunModel['Ě'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/* 1213 */     this.gunModel['Ě'].setRotationPoint(20.5F, -28.0F, -1.5F);
/*      */     
/* 1215 */     this.gunModel['ě'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1216 */     this.gunModel['ě'].setRotationPoint(18.5F, -28.0F, -1.5F);
/*      */     
/* 1218 */     this.gunModel['Ĝ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1219 */     this.gunModel['Ĝ'].setRotationPoint(37.25F, -26.0F, 4.5F);
/*      */     
/* 1221 */     this.gunModel['ĝ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 1222 */     this.gunModel['ĝ'].setRotationPoint(37.25F, -28.0F, 8.5F);
/*      */     
/* 1224 */     this.gunModel['Ğ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1225 */     this.gunModel['Ğ'].setRotationPoint(35.25F, -26.0F, 4.5F);
/*      */     
/* 1227 */     this.gunModel['ğ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1228 */     this.gunModel['ğ'].setRotationPoint(35.25F, -28.0F, 8.5F);
/*      */     
/* 1230 */     this.gunModel['Ġ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1231 */     this.gunModel['Ġ'].setRotationPoint(31.5F, -26.0F, 4.5F);
/*      */     
/* 1233 */     this.gunModel['ġ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 1234 */     this.gunModel['ġ'].setRotationPoint(31.5F, -28.0F, 8.5F);
/*      */     
/* 1236 */     this.gunModel['Ģ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1237 */     this.gunModel['Ģ'].setRotationPoint(29.5F, -26.0F, 4.5F);
/*      */     
/* 1239 */     this.gunModel['ģ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1240 */     this.gunModel['ģ'].setRotationPoint(29.5F, -28.0F, 8.5F);
/*      */     
/* 1242 */     this.gunModel['Ĥ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1243 */     this.gunModel['Ĥ'].setRotationPoint(26.0F, -26.0F, 4.5F);
/*      */     
/* 1245 */     this.gunModel['ĥ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 1246 */     this.gunModel['ĥ'].setRotationPoint(26.0F, -28.0F, 8.5F);
/*      */     
/* 1248 */     this.gunModel['Ħ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1249 */     this.gunModel['Ħ'].setRotationPoint(24.0F, -26.0F, 4.5F);
/*      */     
/* 1251 */     this.gunModel['ħ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1252 */     this.gunModel['ħ'].setRotationPoint(24.0F, -28.0F, 8.5F);
/*      */     
/* 1254 */     this.gunModel['Ĩ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1255 */     this.gunModel['Ĩ'].setRotationPoint(20.5F, -26.0F, 4.5F);
/*      */     
/* 1257 */     this.gunModel['ĩ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 1258 */     this.gunModel['ĩ'].setRotationPoint(20.5F, -28.0F, 8.5F);
/*      */     
/* 1260 */     this.gunModel['Ī'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1261 */     this.gunModel['Ī'].setRotationPoint(18.5F, -26.0F, 4.5F);
/*      */     
/* 1263 */     this.gunModel['ī'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1264 */     this.gunModel['ī'].setRotationPoint(18.5F, -28.0F, 8.5F);
/*      */     
/* 1266 */     this.gunModel['Ĭ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F);
/* 1267 */     this.gunModel['Ĭ'].setRotationPoint(26.75F, -28.0F, -1.5F);
/*      */     
/* 1269 */     this.gunModel['ĭ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F);
/* 1270 */     this.gunModel['ĭ'].setRotationPoint(26.75F, -28.0F, 8.5F);
/*      */     
/* 1272 */     this.gunModel['Į'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 2, 2, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 1273 */     this.gunModel['Į'].setRotationPoint(26.75F, -26.0F, 3.5F);
/*      */     
/* 1275 */     this.gunModel['į'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F);
/* 1276 */     this.gunModel['į'].setRotationPoint(21.25F, -28.0F, -1.5F);
/*      */     
/* 1278 */     this.gunModel['İ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 4, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, -4.0F, -0.25F, 0.0F, -4.0F);
/* 1279 */     this.gunModel['İ'].setRotationPoint(21.25F, -28.0F, 8.5F);
/*      */     
/* 1281 */     this.gunModel['ı'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 2, 2, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 1282 */     this.gunModel['ı'].setRotationPoint(21.25F, -26.0F, 3.5F);
/*      */     
/* 1284 */     this.gunModel['Ĳ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 4, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1285 */     this.gunModel['Ĳ'].setRotationPoint(-19.5F, -34.0F, 6.5F);
/*      */     
/* 1287 */     this.gunModel['ĳ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 4, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -1.25F, 0.0F, -1.75F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.gunModel['ĳ'].setRotationPoint(-18.5F, -34.0F, 6.5F);
/*      */     
/* 1290 */     this.gunModel['Ĵ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 4, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.25F, 0.0F, -1.75F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.gunModel['Ĵ'].setRotationPoint(-17.5F, -34.0F, 6.5F);
/*      */     
/* 1293 */     this.gunModel['ĵ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, -1.0F, 0.75F);
/* 1294 */     this.gunModel['ĵ'].setRotationPoint(-19.5F, -35.25F, 6.5F);
/*      */     
/* 1296 */     this.gunModel['Ķ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 3, 4, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 1297 */     this.gunModel['Ķ'].setRotationPoint(-19.5F, -34.0F, 6.5F);
/*      */     
/* 1299 */     this.gunModel['ķ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 5, 10, 0.0F, 0.0F, -2.0F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1300 */     this.gunModel['ķ'].setRotationPoint(10.75F, -27.0F, -0.5F);
/*      */     
/* 1302 */     this.gunModel['ĸ'].addShapeBox(26.0F, 0.0F, -4.5F, 3, 3, 8, 0.0F, 0.0F, -2.0F, -0.25F, -0.5F, -2.0F, -0.25F, -0.5F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, -1.0F, 0.5F, -1.25F, -1.5F, 0.5F, -1.25F, -1.5F, 0.5F, -1.25F, -1.0F, 0.5F, -1.25F);
/* 1303 */     this.gunModel['ĸ'].setRotationPoint(10.75F, -24.0F, 0.5F);
/*      */     
/* 1305 */     this.gunModel['Ĺ'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1306 */     this.gunModel['Ĺ'].setRotationPoint(11.15F, -24.5F, -0.5F);
/*      */     
/* 1308 */     this.gunModel['ĺ'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 5, 5, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F);
/* 1309 */     this.gunModel['ĺ'].setRotationPoint(-45.75F, -26.0F, 2.0F);
/*      */     
/* 1311 */     this.gunModel['Ļ'].addShapeBox(26.0F, 0.0F, -4.5F, 2, 5, 5, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1312 */     this.gunModel['Ļ'].setRotationPoint(-45.75F, -31.0F, 2.0F);
/*      */     
/* 1314 */     this.gunModel['ļ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1315 */     this.gunModel['ļ'].setRotationPoint(-4.0F, -6.0F, 3.0F);
/*      */     
/* 1317 */     this.gunModel['Ľ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1318 */     this.gunModel['Ľ'].setRotationPoint(-4.5F, -5.0F, 3.0F);
/*      */     
/* 1320 */     this.gunModel['ľ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1321 */     this.gunModel['ľ'].setRotationPoint(-5.5F, -4.5F, 3.0F);
/*      */     
/* 1323 */     this.gunModel['Ŀ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1324 */     this.gunModel['Ŀ'].setRotationPoint(-5.5F, -5.5F, 3.0F);
/*      */     
/* 1326 */     this.gunModel['ŀ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 13, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1327 */     this.gunModel['ŀ'].setRotationPoint(-44.75F, -31.0F, -2.0F);
/*      */     
/* 1329 */     this.gunModel['Ł'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 13, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1330 */     this.gunModel['Ł'].setRotationPoint(-44.75F, -29.0F, -2.0F);
/*      */     
/* 1332 */     this.gunModel['ł'].addShapeBox(26.0F, 0.0F, -4.5F, 19, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1333 */     this.gunModel['ł'].setRotationPoint(-36.75F, -37.0F, 2.5F);
/*      */     
/* 1335 */     this.gunModel['Ń'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     this.gunModel['Ń'].setRotationPoint(-37.75F, -38.0F, 2.5F);
/*      */     
/* 1338 */     this.gunModel['ń'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1339 */     this.gunModel['ń'].setRotationPoint(-37.75F, -39.0F, 2.5F);
/*      */     
/* 1341 */     this.gunModel['Ņ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1342 */     this.gunModel['Ņ'].setRotationPoint(-37.75F, -39.0F, 5.0F);
/*      */     
/* 1344 */     this.gunModel['ņ'].addShapeBox(26.0F, 0.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1345 */     this.gunModel['ņ'].setRotationPoint(23.25F, -31.5F, 8.5F);
/*      */     
/*      */ 
/* 1348 */     this.ammoModel = new ModelRendererTurbo[1];
/* 1349 */     this.ammoModel[0] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/*      */     
/* 1351 */     this.ammoModel[0].addShapeBox(26.0F, 0.0F, -4.5F, 9, 50, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1352 */     this.ammoModel[0].setRotationPoint(-2.5F, -18.0F, 1.0F);
/*      */     
/*      */ 
/* 1355 */     this.slideModel = new ModelRendererTurbo[3];
/* 1356 */     this.slideModel[0] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/* 1357 */     this.slideModel[1] = new ModelRendererTurbo(this, 105, 137, this.textureX, this.textureY);
/* 1358 */     this.slideModel[2] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*      */     
/* 1360 */     this.slideModel[0].addShapeBox(26.0F, 0.0F, -4.5F, 12, 2, 6, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.95F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1361 */     this.slideModel[0].setRotationPoint(-6.75F, -33.0F, -0.5F);
/*      */     
/* 1363 */     this.slideModel[1].addShapeBox(26.0F, 0.0F, -4.5F, 12, 2, 6, 0.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1364 */     this.slideModel[1].setRotationPoint(-6.75F, -35.0F, -0.5F);
/*      */     
/* 1366 */     this.slideModel[2].addShapeBox(26.0F, 0.0F, -4.5F, 12, 1, 6, 0.0F, -0.25F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1367 */     this.slideModel[2].setRotationPoint(-6.75F, -35.75F, -0.5F);
/*      */     
/*      */ 
/*      */ 
/* 1371 */     translateAll(0.0F, -19.5F, 0.0F);
/* 1372 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*      */     
/* 1374 */     this.gunSlideDistance = 0.55F;
/* 1375 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 1377 */     this.tiltGun = 7.0F;
/* 1378 */     this.rotateGunVertical = 1.0F;
/* 1379 */     this.translateGun = new Vector3f(0.15F, 0.0F, 0.0F);
/*      */     
/* 1381 */     this.rotateClipVertical = 5.0F;
/* 1382 */     this.translateClip = new Vector3f(0.0F, -5.0F, 0.0F);
/*      */     
/*      */ 
/* 1385 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modeltec9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */