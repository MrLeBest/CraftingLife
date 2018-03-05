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
/*      */ public class Modelmpx
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelmpx()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ő'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 377, 65, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 105, 89, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 297, 89, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 97, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 25, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 65, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 105, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 105, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 153, 105, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 321, 121, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 217, 145, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 25, 81, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 17, 89, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 321, 89, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 113, 113, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 337, 113, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 353, 113, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 385, 113, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 145, 121, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 201, 145, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 281, 145, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 89, 153, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 113, 153, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 137, 153, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 297, 153, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 321, 153, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 345, 153, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 449, 145, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 369, 153, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 361, 113, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 433, 113, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 169, 161, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 393, 161, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 81, 169, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 161, 169, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 241, 169, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 329, 137, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 361, 153, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 321, 169, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 401, 169, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 105, 153, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 129, 153, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 153, 153, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 465, 153, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 249, 161, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 473, 161, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 273, 161, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 25, 177, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 49, 177, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 73, 177, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 81, 153, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 313, 153, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 97, 177, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 121, 177, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 145, 177, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 169, 177, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 185, 177, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 209, 177, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 233, 177, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 257, 177, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 281, 177, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 305, 177, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 329, 177, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 353, 177, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 377, 177, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 401, 177, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 425, 177, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 177, 129, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 393, 137, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 449, 177, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 473, 177, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 25, 185, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 49, 185, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 73, 185, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 97, 185, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 121, 185, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 145, 185, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 169, 185, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 489, 185, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 185, 193, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 233, 193, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 265, 193, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 281, 193, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 393, 113, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 465, 161, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 201, 177, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 225, 177, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 305, 193, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 249, 177, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 273, 177, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 321, 193, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 377, 193, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 137, 209, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 65, 185, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 137, 201, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 281, 201, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 89, 185, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 113, 185, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 161, 201, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 401, 201, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/*  350 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/*  351 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 137, 185, this.textureX, this.textureY);
/*  353 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 433, 193, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 473, 193, this.textureX, this.textureY);
/*  355 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 249, 201, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 337, 201, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 361, 209, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 433, 209, this.textureX, this.textureY);
/*      */     
/*  360 */     this.gunModel[0].addShapeBox(7.0F, 2.0F, -2.0F, 12, 4, 7, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/*  361 */     this.gunModel[0].setRotationPoint(-19.0F, -3.0F, -1.5F);
/*      */     
/*  363 */     this.gunModel[1].addShapeBox(7.0F, 2.0F, -2.0F, 13, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  364 */     this.gunModel[1].setRotationPoint(-21.5F, 1.0F, -1.5F);
/*      */     
/*  366 */     this.gunModel[2].addShapeBox(7.0F, 2.0F, -2.0F, 2, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  367 */     this.gunModel[2].setRotationPoint(-12.5F, 5.0F, -1.5F);
/*      */     
/*  369 */     this.gunModel[3].addShapeBox(7.0F, 2.0F, -2.0F, 12, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  370 */     this.gunModel[3].setRotationPoint(-24.5F, 9.0F, -1.5F);
/*      */     
/*  372 */     this.gunModel[4].addShapeBox(7.0F, 2.0F, -2.0F, 11, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  373 */     this.gunModel[4].setRotationPoint(-23.5F, 5.0F, -1.5F);
/*      */     
/*  375 */     this.gunModel[5].addShapeBox(7.0F, 2.0F, -2.0F, 11, 2, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  376 */     this.gunModel[5].setRotationPoint(-23.5F, 7.0F, -1.5F);
/*      */     
/*  378 */     this.gunModel[6].addShapeBox(7.0F, 2.0F, -2.0F, 12, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  379 */     this.gunModel[6].setRotationPoint(-24.5F, 10.0F, -1.5F);
/*      */     
/*  381 */     this.gunModel[7].addShapeBox(7.0F, 2.0F, -2.0F, 12, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  382 */     this.gunModel[7].setRotationPoint(-24.5F, 12.0F, -1.5F);
/*      */     
/*  384 */     this.gunModel[8].addShapeBox(7.0F, 2.0F, -2.0F, 13, 4, 7, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  385 */     this.gunModel[8].setRotationPoint(-19.0F, -7.0F, -1.5F);
/*      */     
/*  387 */     this.gunModel[9].addShapeBox(7.0F, 2.0F, -2.0F, 11, 2, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  388 */     this.gunModel[9].setRotationPoint(-16.75F, -9.0F, -1.5F);
/*      */     
/*  390 */     this.gunModel[10].addShapeBox(7.0F, 2.0F, -2.0F, 11, 1, 7, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  391 */     this.gunModel[10].setRotationPoint(-16.75F, -10.0F, -1.5F);
/*      */     
/*  393 */     this.gunModel[11].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  394 */     this.gunModel[11].setRotationPoint(-16.75F, -12.0F, -2.0F);
/*      */     
/*  396 */     this.gunModel[12].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 8, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  397 */     this.gunModel[12].setRotationPoint(-17.75F, -14.0F, -2.0F);
/*      */     
/*  399 */     this.gunModel[13].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 8, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  400 */     this.gunModel[13].setRotationPoint(-17.75F, -15.0F, -2.0F);
/*      */     
/*  402 */     this.gunModel[14].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  403 */     this.gunModel[14].setRotationPoint(-15.0F, -14.0F, -2.0F);
/*      */     
/*  405 */     this.gunModel[15].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  406 */     this.gunModel[15].setRotationPoint(-14.75F, -12.0F, -2.0F);
/*      */     
/*  408 */     this.gunModel[16].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.9F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.9F, -0.15F, 0.0F);
/*  409 */     this.gunModel[16].setRotationPoint(-13.5F, -12.0F, -2.0F);
/*      */     
/*  411 */     this.gunModel[17].addShapeBox(7.0F, 2.0F, -2.0F, 16, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F);
/*  412 */     this.gunModel[17].setRotationPoint(-11.5F, -12.0F, -2.0F);
/*      */     
/*  414 */     this.gunModel[18].addShapeBox(7.0F, 2.0F, -2.0F, 19, 2, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  415 */     this.gunModel[18].setRotationPoint(-14.35F, -14.0F, -2.0F);
/*      */     
/*  417 */     this.gunModel[19].addShapeBox(7.0F, 2.0F, -2.0F, 21, 1, 8, 0.0F, 0.75F, 0.15F, 0.0F, -0.4F, 0.15F, 0.0F, -0.4F, 0.15F, 0.0F, 0.75F, 0.15F, 0.0F, -0.75F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  418 */     this.gunModel[19].setRotationPoint(-15.6F, -15.0F, -2.0F);
/*      */     
/*  420 */     this.gunModel[20].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 8, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  421 */     this.gunModel[20].setRotationPoint(-19.95F, -15.15F, -2.0F);
/*      */     
/*  423 */     this.gunModel[21].addShapeBox(7.0F, 2.0F, -2.0F, 25, 2, 8, 0.0F, 4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F);
/*  424 */     this.gunModel[21].setRotationPoint(-20.5F, -17.0F, -2.0F);
/*      */     
/*  426 */     this.gunModel[22].addShapeBox(7.0F, 2.0F, -2.0F, 29, 1, 8, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  427 */     this.gunModel[22].setRotationPoint(-24.5F, -18.0F, -2.0F);
/*      */     
/*  429 */     this.gunModel[23].addShapeBox(7.0F, 2.0F, -2.0F, 9, 1, 8, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  430 */     this.gunModel[23].setRotationPoint(-26.5F, -19.0F, -2.0F);
/*      */     
/*  432 */     this.gunModel[24].addShapeBox(7.0F, 2.0F, -2.0F, 32, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  433 */     this.gunModel[24].setRotationPoint(-26.5F, -19.5F, -3.0F);
/*      */     
/*  435 */     this.gunModel[25].addShapeBox(7.0F, 2.0F, -2.0F, 27, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  436 */     this.gunModel[25].setRotationPoint(-21.5F, -23.0F, -3.0F);
/*      */     
/*  438 */     this.gunModel[26].addShapeBox(7.0F, 2.0F, -2.0F, 88, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  439 */     this.gunModel[26].setRotationPoint(-25.5F, -28.0F, -3.0F);
/*      */     
/*  441 */     this.gunModel[27].addShapeBox(7.0F, 2.0F, -2.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  442 */     this.gunModel[27].setRotationPoint(9.5F, -23.0F, -3.0F);
/*      */     
/*  444 */     this.gunModel[28].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  445 */     this.gunModel[28].setRotationPoint(5.5F, -23.0F, -3.0F);
/*      */     
/*  447 */     this.gunModel[29].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  448 */     this.gunModel[29].setRotationPoint(5.5F, -21.5F, 4.0F);
/*      */     
/*  450 */     this.gunModel[30].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  451 */     this.gunModel[30].setRotationPoint(8.5F, -21.5F, 4.0F);
/*      */     
/*  453 */     this.gunModel[31].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  454 */     this.gunModel[31].setRotationPoint(7.5F, -21.5F, 4.0F);
/*      */     
/*  456 */     this.gunModel[32].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  457 */     this.gunModel[32].setRotationPoint(6.5F, -21.5F, 4.0F);
/*      */     
/*  459 */     this.gunModel[33].addShapeBox(7.0F, 2.0F, -2.0F, 20, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  460 */     this.gunModel[33].setRotationPoint(9.5F, -19.5F, -3.0F);
/*      */     
/*  462 */     this.gunModel[34].addShapeBox(7.0F, 2.0F, -2.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  463 */     this.gunModel[34].setRotationPoint(7.5F, -26.5F, -3.0F);
/*      */     
/*  465 */     this.gunModel[35].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  466 */     this.gunModel[35].setRotationPoint(5.5F, -23.5F, -3.0F);
/*      */     
/*  468 */     this.gunModel[36].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  469 */     this.gunModel[36].setRotationPoint(5.5F, -27.0F, -3.0F);
/*      */     
/*  471 */     this.gunModel[37].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  472 */     this.gunModel[37].setRotationPoint(6.5F, -23.5F, -3.0F);
/*      */     
/*  474 */     this.gunModel[38].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  475 */     this.gunModel[38].setRotationPoint(6.5F, -24.25F, -3.0F);
/*      */     
/*  477 */     this.gunModel[39].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  478 */     this.gunModel[39].setRotationPoint(6.5F, -26.25F, -3.0F);
/*      */     
/*  480 */     this.gunModel[40].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  481 */     this.gunModel[40].setRotationPoint(6.5F, -25.5F, -3.0F);
/*      */     
/*  483 */     this.gunModel[41].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  484 */     this.gunModel[41].setRotationPoint(6.5F, -26.25F, -3.0F);
/*      */     
/*  486 */     this.gunModel[42].addShapeBox(7.0F, 2.0F, -2.0F, 55, 1, 10, 0.0F, 0.0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[42].setRotationPoint(-25.5F, -29.0F, -3.0F);
/*      */     
/*  489 */     this.gunModel[43].addShapeBox(7.0F, 2.0F, -2.0F, 55, 1, 8, 0.0F, 0.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  490 */     this.gunModel[43].setRotationPoint(-25.5F, -29.75F, -2.0F);
/*      */     
/*  492 */     this.gunModel[44].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 9, 0.0F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  493 */     this.gunModel[44].setRotationPoint(58.5F, -29.0F, -2.0F);
/*      */     
/*  495 */     this.gunModel[45].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 6, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 2.0F, -0.25F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/*  496 */     this.gunModel[45].setRotationPoint(58.5F, -29.75F, 0.0F);
/*      */     
/*  498 */     this.gunModel[46].addShapeBox(7.0F, 2.0F, -2.0F, 6, 1, 5, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  499 */     this.gunModel[46].setRotationPoint(56.5F, -30.5F, -0.5F);
/*      */     
/*  501 */     this.gunModel[47].addShapeBox(7.0F, 2.0F, -2.0F, 48, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  502 */     this.gunModel[47].setRotationPoint(-19.5F, -30.5F, -0.5F);
/*      */     
/*  504 */     this.gunModel[48].addShapeBox(7.0F, 2.0F, -2.0F, 82, 1, 6, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  505 */     this.gunModel[48].setRotationPoint(-19.5F, -31.5F, -1.0F);
/*      */     
/*  507 */     this.gunModel[49].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 10, 0.0F, 0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  508 */     this.gunModel[49].setRotationPoint(53.5F, -29.0F, -3.0F);
/*      */     
/*  510 */     this.gunModel[50].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 1.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -1.0F, 1.5F, -0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/*  511 */     this.gunModel[50].setRotationPoint(53.0F, -29.75F, 0.0F);
/*      */     
/*  513 */     this.gunModel[51].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 5, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  514 */     this.gunModel[51].setRotationPoint(51.5F, -30.5F, -0.5F);
/*      */     
/*  516 */     this.gunModel[52].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 10, 0.0F, 0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  517 */     this.gunModel[52].setRotationPoint(48.5F, -29.0F, -3.0F);
/*      */     
/*  519 */     this.gunModel[53].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 5, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  520 */     this.gunModel[53].setRotationPoint(46.5F, -30.5F, -0.5F);
/*      */     
/*  522 */     this.gunModel[54].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 1.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -1.0F, 1.5F, -0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/*  523 */     this.gunModel[54].setRotationPoint(48.0F, -29.75F, 0.0F);
/*      */     
/*  525 */     this.gunModel[55].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 1.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -1.0F, 1.5F, -0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/*  526 */     this.gunModel[55].setRotationPoint(43.0F, -29.75F, 0.0F);
/*      */     
/*  528 */     this.gunModel[56].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 5, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  529 */     this.gunModel[56].setRotationPoint(41.5F, -30.5F, -0.5F);
/*      */     
/*  531 */     this.gunModel[57].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 1.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -1.0F, 1.5F, -0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/*  532 */     this.gunModel[57].setRotationPoint(38.0F, -29.75F, 0.0F);
/*      */     
/*  534 */     this.gunModel[58].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 5, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  535 */     this.gunModel[58].setRotationPoint(36.5F, -30.5F, -0.5F);
/*      */     
/*  537 */     this.gunModel[59].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 1.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -1.0F, 1.5F, -0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/*  538 */     this.gunModel[59].setRotationPoint(33.0F, -29.75F, 0.0F);
/*      */     
/*  540 */     this.gunModel[60].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 5, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  541 */     this.gunModel[60].setRotationPoint(31.5F, -30.5F, -0.5F);
/*      */     
/*  543 */     this.gunModel[61].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 2, 0.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  544 */     this.gunModel[61].setRotationPoint(58.5F, -29.5F, -2.0F);
/*      */     
/*  546 */     this.gunModel[62].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 2, 0.0F, 1.5F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  547 */     this.gunModel[62].setRotationPoint(53.0F, -29.75F, -2.0F);
/*      */     
/*  549 */     this.gunModel[63].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 2, 0.0F, 1.5F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  550 */     this.gunModel[63].setRotationPoint(48.0F, -29.75F, -2.0F);
/*      */     
/*  552 */     this.gunModel[64].addShapeBox(7.0F, 2.0F, -2.0F, 42, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  553 */     this.gunModel[64].setRotationPoint(20.5F, -27.0F, 7.0F);
/*      */     
/*  555 */     this.gunModel[65].addShapeBox(7.0F, 2.0F, -2.0F, 42, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  556 */     this.gunModel[65].setRotationPoint(20.5F, -21.0F, 7.0F);
/*      */     
/*  558 */     this.gunModel[66].addShapeBox(7.0F, 2.0F, -2.0F, 42, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  559 */     this.gunModel[66].setRotationPoint(20.5F, -26.0F, 8.0F);
/*      */     
/*  561 */     this.gunModel[67].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 0.0F, 0.15F, 0.0F, 1.25F, 0.15F, 0.0F, 1.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  562 */     this.gunModel[67].setRotationPoint(-5.75F, -10.0F, -1.0F);
/*      */     
/*  564 */     this.gunModel[68].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  565 */     this.gunModel[68].setRotationPoint(-5.75F, -9.0F, -1.0F);
/*      */     
/*  567 */     this.gunModel[69].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  568 */     this.gunModel[69].setRotationPoint(-5.75F, -8.0F, -1.0F);
/*      */     
/*  570 */     this.gunModel[70].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[70].setRotationPoint(-5.75F, -5.5F, -1.0F);
/*      */     
/*  573 */     this.gunModel[71].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  574 */     this.gunModel[71].setRotationPoint(-5.75F, -4.5F, -1.0F);
/*      */     
/*  576 */     this.gunModel[72].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  577 */     this.gunModel[72].setRotationPoint(-5.75F, -3.5F, -1.0F);
/*      */     
/*  579 */     this.gunModel[73].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  580 */     this.gunModel[73].setRotationPoint(-2.5F, -3.5F, -1.0F);
/*      */     
/*  582 */     this.gunModel[74].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  583 */     this.gunModel[74].setRotationPoint(-1.0F, -2.75F, -1.0F);
/*      */     
/*  585 */     this.gunModel[75].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  586 */     this.gunModel[75].setRotationPoint(0.5F, -2.5F, -1.0F);
/*      */     
/*  588 */     this.gunModel[76].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  589 */     this.gunModel[76].setRotationPoint(4.5F, -2.75F, -1.0F);
/*      */     
/*  591 */     this.gunModel[77].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  592 */     this.gunModel[77].setRotationPoint(5.5F, -3.5F, -1.0F);
/*      */     
/*  594 */     this.gunModel[78].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[78].setRotationPoint(6.5F, -3.5F, -1.0F);
/*      */     
/*  597 */     this.gunModel[79].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  598 */     this.gunModel[79].setRotationPoint(6.5F, -4.75F, -1.0F);
/*      */     
/*  600 */     this.gunModel[80].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 6, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  601 */     this.gunModel[80].setRotationPoint(7.5F, -5.75F, -1.0F);
/*      */     
/*  603 */     this.gunModel[81].addShapeBox(7.0F, 2.0F, -2.0F, 1, 5, 6, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  604 */     this.gunModel[81].setRotationPoint(8.0F, -9.75F, -1.0F);
/*      */     
/*  606 */     this.gunModel[82].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 6, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  607 */     this.gunModel[82].setRotationPoint(7.5F, -9.75F, -1.0F);
/*      */     
/*  609 */     this.gunModel[83].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 6, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, -2.4F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -2.4F, 0.0F);
/*  610 */     this.gunModel[83].setRotationPoint(5.0F, -9.75F, -1.0F);
/*      */     
/*  612 */     this.gunModel[84].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  613 */     this.gunModel[84].setRotationPoint(-1.5F, -10.65F, 0.5F);
/*      */     
/*  615 */     this.gunModel[85].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  616 */     this.gunModel[85].setRotationPoint(-1.5F, -9.9F, 0.5F);
/*      */     
/*  618 */     this.gunModel[86].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  619 */     this.gunModel[86].setRotationPoint(-1.5F, -9.15F, 0.5F);
/*      */     
/*  621 */     this.gunModel[87].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  622 */     this.gunModel[87].setRotationPoint(-1.5F, -7.4F, 0.5F);
/*      */     
/*  624 */     this.gunModel[88].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.2F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  625 */     this.gunModel[88].setRotationPoint(-0.8F, -5.65F, 0.5F);
/*      */     
/*  627 */     this.gunModel[89].addShapeBox(7.0F, 2.0F, -2.0F, 4, 6, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F);
/*  628 */     this.gunModel[89].setRotationPoint(5.0F, -16.25F, -2.0F);
/*      */     
/*  630 */     this.gunModel[90].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 8, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  631 */     this.gunModel[90].setRotationPoint(9.0F, -15.75F, -2.0F);
/*      */     
/*  633 */     this.gunModel[91].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.4F, 0.25F, -1.75F, -0.4F, 0.25F, -1.75F, -0.4F, 0.25F, 0.0F, -0.4F, 0.25F);
/*  634 */     this.gunModel[91].setRotationPoint(9.0F, -10.75F, -2.0F);
/*      */     
/*  636 */     this.gunModel[92].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/*  637 */     this.gunModel[92].setRotationPoint(9.0F, -13.5F, -2.0F);
/*      */     
/*  639 */     this.gunModel[93].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  640 */     this.gunModel[93].setRotationPoint(12.0F, -15.75F, -2.0F);
/*      */     
/*  642 */     this.gunModel[94].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  643 */     this.gunModel[94].setRotationPoint(13.0F, -15.75F, -2.0F);
/*      */     
/*  645 */     this.gunModel[95].addShapeBox(7.0F, 2.0F, -2.0F, 10, 2, 8, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  646 */     this.gunModel[95].setRotationPoint(14.0F, -15.75F, -2.0F);
/*      */     
/*  648 */     this.gunModel[96].addShapeBox(7.0F, 2.0F, -2.0F, 10, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  649 */     this.gunModel[96].setRotationPoint(12.0F, -17.75F, 0.0F);
/*      */     
/*  651 */     this.gunModel[97].addShapeBox(7.0F, 2.0F, -2.0F, 13, 2, 8, 0.0F, 0.1F, 0.15F, 0.5F, 0.0F, 0.15F, 0.5F, 0.0F, 0.15F, 0.5F, 0.1F, 0.15F, 0.5F, 0.1F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.1F, -0.85F, 0.5F);
/*  652 */     this.gunModel[97].setRotationPoint(5.0F, -17.5F, -2.0F);
/*      */     
/*  654 */     this.gunModel[98].addShapeBox(7.0F, 2.0F, -2.0F, 13, 8, 8, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/*  655 */     this.gunModel[98].setRotationPoint(8.5F, -10.15F, -2.0F);
/*      */     
/*  657 */     this.gunModel[99].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.75F, 0.0F, 0.1F);
/*  658 */     this.gunModel[99].setRotationPoint(8.5F, -2.15F, -2.0F);
/*      */     
/*  660 */     this.gunModel[100].addShapeBox(7.0F, 2.0F, -2.0F, 10, 1, 8, 0.0F, 0.0F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.25F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.0F, 0.25F, 0.1F);
/*  661 */     this.gunModel[100].setRotationPoint(11.25F, -2.15F, -2.0F);
/*      */     
/*  663 */     this.gunModel[101].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.05F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.0F, -0.05F, 0.1F);
/*  664 */     this.gunModel[101].setRotationPoint(21.5F, -3.15F, -2.0F);
/*      */     
/*  666 */     this.gunModel[102].addShapeBox(7.0F, 2.0F, -2.0F, 3, 7, 8, 0.0F, 0.0F, 0.0F, 0.1F, -1.25F, 0.0F, 0.1F, -1.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/*  667 */     this.gunModel[102].setRotationPoint(21.5F, -10.15F, -2.0F);
/*      */     
/*  669 */     this.gunModel[103].addShapeBox(7.0F, 2.0F, -2.0F, 7, 2, 8, 0.0F, 0.25F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F);
/*  670 */     this.gunModel[103].setRotationPoint(15.5F, -12.15F, -2.0F);
/*      */     
/*  672 */     this.gunModel[104].addShapeBox(7.0F, 2.0F, -2.0F, 8, 2, 8, 0.0F, 0.0F, 0.1F, 0.1F, 1.5F, 0.1F, 0.1F, 1.5F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/*  673 */     this.gunModel[104].setRotationPoint(14.5F, -14.15F, -2.0F);
/*      */     
/*  675 */     this.gunModel[105].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 8, 0.0F, -1.75F, -0.4F, 0.1F, 0.05F, -0.4F, 0.1F, 0.05F, -0.4F, 0.1F, -1.75F, -0.4F, 0.1F, 0.0F, 0.3F, 0.1F, 0.05F, 0.3F, 0.1F, 0.05F, 0.3F, 0.1F, 0.0F, 0.3F, 0.1F);
/*  676 */     this.gunModel[105].setRotationPoint(11.2F, -11.45F, -2.0F);
/*      */     
/*  678 */     this.gunModel[106].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 8, 0.0F, 0.25F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F);
/*  679 */     this.gunModel[106].setRotationPoint(13.25F, -12.05F, -2.0F);
/*      */     
/*  681 */     this.gunModel[107].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 8, 0.0F, 0.25F, 1.35F, 0.1F, 0.25F, 1.35F, 0.1F, 0.25F, 1.35F, 0.1F, 0.25F, 1.35F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F);
/*  682 */     this.gunModel[107].setRotationPoint(13.25F, -13.15F, -2.0F);
/*      */     
/*  684 */     this.gunModel[108].addShapeBox(7.0F, 2.0F, -2.0F, 7, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[108].setRotationPoint(5.0F, -21.75F, 0.0F);
/*      */     
/*  687 */     this.gunModel[109].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 8, 0.0F, 0.0F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  688 */     this.gunModel[109].setRotationPoint(24.0F, -14.75F, -2.0F);
/*      */     
/*  690 */     this.gunModel[110].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 8, 0.0F, 0.0F, 0.25F, 0.5F, 3.0F, 0.25F, 0.5F, 3.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  691 */     this.gunModel[110].setRotationPoint(24.0F, -15.75F, -2.0F);
/*      */     
/*  693 */     this.gunModel[111].addShapeBox(7.0F, 2.0F, -2.0F, 5, 2, 9, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  694 */     this.gunModel[111].setRotationPoint(24.0F, -17.75F, -3.0F);
/*      */     
/*  696 */     this.gunModel[112].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  697 */     this.gunModel[112].setRotationPoint(22.0F, -17.75F, 0.0F);
/*      */     
/*  699 */     this.gunModel[113].addShapeBox(7.0F, 2.0F, -2.0F, 3, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  700 */     this.gunModel[113].setRotationPoint(60.5F, -24.5F, 0.0F);
/*      */     
/*  702 */     this.gunModel[114].addShapeBox(7.0F, 2.0F, -2.0F, 1, 5, 5, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  703 */     this.gunModel[114].setRotationPoint(63.75F, -25.0F, -0.5F);
/*      */     
/*  705 */     this.gunModel[115].addShapeBox(7.0F, 2.0F, -2.0F, 6, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  706 */     this.gunModel[115].setRotationPoint(64.5F, -24.5F, 0.0F);
/*      */     
/*  708 */     this.gunModel[116].addShapeBox(7.0F, 2.0F, -2.0F, 6, 5, 5, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  709 */     this.gunModel[116].setRotationPoint(70.0F, -25.0F, -0.5F);
/*      */     
/*  711 */     this.gunModel[117].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  712 */     this.gunModel[117].setRotationPoint(-26.6F, -28.0F, -3.0F);
/*      */     
/*  714 */     this.gunModel[118].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  715 */     this.gunModel[118].setRotationPoint(-26.6F, -29.0F, -3.0F);
/*      */     
/*  717 */     this.gunModel[119].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 8, 0.0F, -1.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/*  718 */     this.gunModel[119].setRotationPoint(-26.6F, -29.75F, -2.0F);
/*      */     
/*  720 */     this.gunModel[120].addShapeBox(7.0F, 2.0F, -2.0F, 1, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  721 */     this.gunModel[120].setRotationPoint(-25.5F, -23.0F, -3.0F);
/*      */     
/*  723 */     this.gunModel[121].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 10, 0.0F, 0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  724 */     this.gunModel[121].setRotationPoint(43.5F, -29.0F, -3.0F);
/*      */     
/*  726 */     this.gunModel[122].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 10, 0.0F, 0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  727 */     this.gunModel[122].setRotationPoint(38.5F, -29.0F, -3.0F);
/*      */     
/*  729 */     this.gunModel[123].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 10, 0.0F, 0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[123].setRotationPoint(33.5F, -29.0F, -3.0F);
/*      */     
/*  732 */     this.gunModel[124].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 2, 0.0F, 1.5F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  733 */     this.gunModel[124].setRotationPoint(43.0F, -29.75F, -2.0F);
/*      */     
/*  735 */     this.gunModel[125].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 2, 0.0F, 1.5F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  736 */     this.gunModel[125].setRotationPoint(38.0F, -29.75F, -2.0F);
/*      */     
/*  738 */     this.gunModel[126].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 2, 0.0F, 1.5F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  739 */     this.gunModel[126].setRotationPoint(33.0F, -29.75F, -2.0F);
/*      */     
/*  741 */     this.gunModel[127].addShapeBox(7.0F, 2.0F, -2.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  742 */     this.gunModel[127].setRotationPoint(59.5F, -19.5F, 5.0F);
/*      */     
/*  744 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  745 */     this.gunModel[''].setRotationPoint(59.5F, -16.0F, -1.0F);
/*      */     
/*  747 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 2.25F);
/*  748 */     this.gunModel[''].setRotationPoint(59.5F, -19.5F, -3.0F);
/*      */     
/*  750 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 32, 1, 6, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  751 */     this.gunModel[''].setRotationPoint(27.5F, -16.0F, -1.0F);
/*      */     
/*  753 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 32, 1, 4, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  754 */     this.gunModel[''].setRotationPoint(27.5F, -17.0F, 0.0F);
/*      */     
/*  756 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  757 */     this.gunModel[''].setRotationPoint(29.0F, -19.5F, 5.0F);
/*      */     
/*  759 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 2.25F);
/*  760 */     this.gunModel[''].setRotationPoint(29.0F, -19.5F, -3.0F);
/*      */     
/*  762 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 4.0F, -0.5F, 0.0F, 4.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.75F, -0.5F, -0.5F, 1.75F, -0.5F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  763 */     this.gunModel[''].setRotationPoint(59.5F, -19.5F, 3.0F);
/*      */     
/*  765 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F);
/*  766 */     this.gunModel[''].setRotationPoint(32.0F, -19.75F, 3.5F);
/*      */     
/*  768 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/*  769 */     this.gunModel[''].setRotationPoint(32.0F, -18.25F, 3.5F);
/*      */     
/*  771 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F);
/*  772 */     this.gunModel[''].setRotationPoint(39.0F, -18.25F, 3.5F);
/*      */     
/*  774 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.85F, 1.5F, -0.5F, -0.85F);
/*  775 */     this.gunModel[''].setRotationPoint(41.0F, -19.75F, 3.5F);
/*      */     
/*  777 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/*  778 */     this.gunModel[''].setRotationPoint(43.0F, -18.25F, 3.5F);
/*      */     
/*  780 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F);
/*  781 */     this.gunModel[''].setRotationPoint(43.0F, -19.75F, 3.5F);
/*      */     
/*  783 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F);
/*  784 */     this.gunModel[''].setRotationPoint(47.0F, -18.25F, 3.5F);
/*      */     
/*  786 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.85F, 1.5F, -0.5F, -0.85F);
/*  787 */     this.gunModel[''].setRotationPoint(49.0F, -19.75F, 3.5F);
/*      */     
/*  789 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.85F, 1.5F, -0.5F, -0.85F);
/*  790 */     this.gunModel[''].setRotationPoint(58.0F, -19.75F, 3.5F);
/*      */     
/*  792 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F);
/*  793 */     this.gunModel[''].setRotationPoint(56.0F, -18.25F, 3.5F);
/*      */     
/*  795 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/*  796 */     this.gunModel[''].setRotationPoint(51.0F, -18.25F, 3.5F);
/*      */     
/*  798 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F);
/*  799 */     this.gunModel[''].setRotationPoint(51.0F, -19.75F, 3.5F);
/*      */     
/*  801 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.05F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.05F, -0.5F, -0.6F);
/*  802 */     this.gunModel[''].setRotationPoint(54.5F, -20.25F, 3.5F);
/*      */     
/*  804 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.0F, -0.5F, -0.6F);
/*  805 */     this.gunModel[''].setRotationPoint(46.05F, -20.25F, 3.5F);
/*      */     
/*  807 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.0F, -0.5F, -0.6F);
/*  808 */     this.gunModel[''].setRotationPoint(44.5F, -20.25F, 3.5F);
/*      */     
/*  810 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.0F, -0.5F, -0.6F);
/*  811 */     this.gunModel[''].setRotationPoint(42.95F, -20.25F, 3.5F);
/*      */     
/*  813 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 10, 0.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  814 */     this.gunModel[''].setRotationPoint(24.25F, -16.5F, -2.5F);
/*      */     
/*  816 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  817 */     this.gunModel[''].setRotationPoint(22.5F, -24.0F, 8.5F);
/*      */     
/*  819 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  820 */     this.gunModel[''].setRotationPoint(58.5F, -24.0F, 8.5F);
/*      */     
/*  822 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 26, 4, 1, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.75F, 0.0F, -0.5F, 1.75F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  823 */     this.gunModel[''].setRotationPoint(32.5F, -19.5F, 3.5F);
/*      */     
/*  825 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 42, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel[''].setRotationPoint(20.5F, -27.0F, -4.0F);
/*      */     
/*  828 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 42, 2, 1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  829 */     this.gunModel[''].setRotationPoint(20.5F, -21.0F, -4.0F);
/*      */     
/*  831 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 42, 6, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  832 */     this.gunModel[''].setRotationPoint(20.5F, -26.0F, -5.0F);
/*      */     
/*  834 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  835 */     this.gunModel[''].setRotationPoint(58.5F, -24.0F, -5.0F);
/*      */     
/*  837 */     this.gunModel[''].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  838 */     this.gunModel[''].setRotationPoint(22.5F, -24.0F, -5.0F);
/*      */     
/*  840 */     this.gunModel[' '].addShapeBox(7.0F, 2.0F, -2.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  841 */     this.gunModel[' '].setRotationPoint(7.0F, -21.0F, 6.0F);
/*      */     
/*  843 */     this.gunModel['¡'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  844 */     this.gunModel['¡'].setRotationPoint(6.0F, -20.0F, 6.0F);
/*      */     
/*  846 */     this.gunModel['¢'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel['¢'].setRotationPoint(8.0F, -20.0F, 6.0F);
/*      */     
/*  849 */     this.gunModel['£'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 9, 0.0F, -0.3F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.7F, 0.0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.7F, 0.0F, 0.25F);
/*  850 */     this.gunModel['£'].setRotationPoint(8.5F, -1.15F, -2.5F);
/*      */     
/*  852 */     this.gunModel['¤'].addShapeBox(7.0F, 2.0F, -2.0F, 10, 1, 9, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  853 */     this.gunModel['¤'].setRotationPoint(11.25F, -1.15F, -2.5F);
/*      */     
/*  855 */     this.gunModel['¥'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 9, 0.0F, 0.0F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.25F, -1.95F, 0.25F, 0.25F, -1.95F, 0.25F, 0.0F, -0.75F, 0.25F);
/*  856 */     this.gunModel['¥'].setRotationPoint(21.5F, -2.15F, -2.5F);
/*      */     
/*  858 */     this.gunModel['¦'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel['¦'].setRotationPoint(5.5F, -21.5F, -3.0F);
/*      */     
/*  861 */     this.gunModel['§'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  862 */     this.gunModel['§'].setRotationPoint(5.5F, -19.5F, -3.0F);
/*      */     
/*  864 */     this.gunModel['¨'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  865 */     this.gunModel['¨'].setRotationPoint(5.0F, -18.0F, -2.0F);
/*      */     
/*  867 */     this.gunModel['©'].addShapeBox(7.0F, 2.0F, -2.0F, 10, 2, 4, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  868 */     this.gunModel['©'].setRotationPoint(12.0F, -17.75F, -2.0F);
/*      */     
/*  870 */     this.gunModel['ª'].addShapeBox(7.0F, 2.0F, -2.0F, 53, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  871 */     this.gunModel['ª'].setRotationPoint(9.5F, -23.0F, 5.0F);
/*      */     
/*  873 */     this.gunModel['«'].addShapeBox(7.0F, 2.0F, -2.0F, 52, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  874 */     this.gunModel['«'].setRotationPoint(9.5F, -23.0F, -1.0F);
/*      */     
/*  876 */     this.gunModel['¬'].addShapeBox(7.0F, 2.0F, -2.0F, 55, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  877 */     this.gunModel['¬'].setRotationPoint(7.5F, -26.5F, 5.0F);
/*      */     
/*  879 */     this.gunModel['­'].addShapeBox(7.0F, 2.0F, -2.0F, 54, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  880 */     this.gunModel['­'].setRotationPoint(7.5F, -26.5F, -1.0F);
/*      */     
/*  882 */     this.gunModel['®'].addShapeBox(7.0F, 2.0F, -2.0F, 88, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  883 */     this.gunModel['®'].setRotationPoint(-25.5F, -28.0F, 5.0F);
/*      */     
/*  885 */     this.gunModel['¯'].addShapeBox(7.0F, 2.0F, -2.0F, 85, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  886 */     this.gunModel['¯'].setRotationPoint(-23.5F, -28.0F, -1.0F);
/*      */     
/*  888 */     this.gunModel['°'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 2, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  889 */     this.gunModel['°'].setRotationPoint(22.0F, -17.75F, -2.0F);
/*      */     
/*  891 */     this.gunModel['±'].addShapeBox(7.0F, 2.0F, -2.0F, 9, 2, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  892 */     this.gunModel['±'].setRotationPoint(-15.25F, -12.0F, -1.5F);
/*      */     
/*  894 */     this.gunModel['²'].addShapeBox(7.0F, 2.0F, -2.0F, 8, 2, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  895 */     this.gunModel['²'].setRotationPoint(-16.25F, -14.0F, -1.5F);
/*      */     
/*  897 */     this.gunModel['³'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.0F, -0.5F, -0.6F);
/*  898 */     this.gunModel['³'].setRotationPoint(53.0F, -20.25F, 3.5F);
/*      */     
/*  900 */     this.gunModel['´'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.0F, -0.5F, -0.6F);
/*  901 */     this.gunModel['´'].setRotationPoint(51.45F, -20.25F, 3.5F);
/*      */     
/*  903 */     this.gunModel['µ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.05F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.05F, -0.5F, -0.6F);
/*  904 */     this.gunModel['µ'].setRotationPoint(37.5F, -20.25F, 3.5F);
/*      */     
/*  906 */     this.gunModel['¶'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.0F, -0.5F, -0.6F);
/*  907 */     this.gunModel['¶'].setRotationPoint(36.0F, -20.25F, 3.5F);
/*      */     
/*  909 */     this.gunModel['·'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, -0.6F, -1.0F, -0.5F, -0.6F);
/*  910 */     this.gunModel['·'].setRotationPoint(34.45F, -20.25F, 3.5F);
/*      */     
/*  912 */     this.gunModel['¸'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 2, 0.0F, -0.35F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.85F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/*  913 */     this.gunModel['¸'].setRotationPoint(51.0F, -17.25F, 3.5F);
/*      */     
/*  915 */     this.gunModel['¹'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 2, 0.0F, -0.35F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.85F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/*  916 */     this.gunModel['¹'].setRotationPoint(43.0F, -17.25F, 3.5F);
/*      */     
/*  918 */     this.gunModel['º'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 2, 0.0F, -0.35F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.85F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/*  919 */     this.gunModel['º'].setRotationPoint(34.0F, -17.25F, 3.5F);
/*      */     
/*  921 */     this.gunModel['»'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 2, 0.0F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  922 */     this.gunModel['»'].setRotationPoint(56.0F, -18.25F, -1.5F);
/*      */     
/*  924 */     this.gunModel['¼'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/*  925 */     this.gunModel['¼'].setRotationPoint(58.0F, -19.75F, -2.5F);
/*      */     
/*  927 */     this.gunModel['½'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  928 */     this.gunModel['½'].setRotationPoint(51.0F, -18.25F, -1.5F);
/*      */     
/*  930 */     this.gunModel['¾'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  931 */     this.gunModel['¾'].setRotationPoint(51.0F, -19.75F, -2.5F);
/*      */     
/*  933 */     this.gunModel['¿'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 2, 0.0F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  934 */     this.gunModel['¿'].setRotationPoint(47.0F, -18.25F, -1.5F);
/*      */     
/*  936 */     this.gunModel['À'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/*  937 */     this.gunModel['À'].setRotationPoint(49.0F, -19.75F, -2.5F);
/*      */     
/*  939 */     this.gunModel['Á'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  940 */     this.gunModel['Á'].setRotationPoint(43.0F, -18.25F, -1.5F);
/*      */     
/*  942 */     this.gunModel['Â'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  943 */     this.gunModel['Â'].setRotationPoint(43.0F, -19.75F, -2.5F);
/*      */     
/*  945 */     this.gunModel['Ã'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 2, 0.0F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  946 */     this.gunModel['Ã'].setRotationPoint(39.0F, -18.25F, -1.5F);
/*      */     
/*  948 */     this.gunModel['Ä'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/*  949 */     this.gunModel['Ä'].setRotationPoint(41.0F, -19.75F, -2.5F);
/*      */     
/*  951 */     this.gunModel['Å'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  952 */     this.gunModel['Å'].setRotationPoint(32.0F, -18.25F, -1.5F);
/*      */     
/*  954 */     this.gunModel['Æ'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  955 */     this.gunModel['Æ'].setRotationPoint(32.0F, -19.75F, -2.5F);
/*      */     
/*  957 */     this.gunModel['Ç'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 2, 0.0F, -0.35F, 0.0F, -0.45F, 0.85F, 0.0F, -0.45F, 0.85F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  958 */     this.gunModel['Ç'].setRotationPoint(51.0F, -17.25F, -1.5F);
/*      */     
/*  960 */     this.gunModel['È'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 2, 0.0F, -0.35F, 0.0F, -0.45F, 0.85F, 0.0F, -0.45F, 0.85F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  961 */     this.gunModel['È'].setRotationPoint(43.0F, -17.25F, -1.5F);
/*      */     
/*  963 */     this.gunModel['É'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.05F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.05F, -0.5F, 0.0F);
/*  964 */     this.gunModel['É'].setRotationPoint(54.5F, -20.25F, -2.5F);
/*      */     
/*  966 */     this.gunModel['Ê'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  967 */     this.gunModel['Ê'].setRotationPoint(53.0F, -20.25F, -2.5F);
/*      */     
/*  969 */     this.gunModel['Ë'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  970 */     this.gunModel['Ë'].setRotationPoint(51.45F, -20.25F, -2.5F);
/*      */     
/*  972 */     this.gunModel['Ì'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 2, 0.0F, -0.35F, 0.0F, -0.45F, 0.85F, 0.0F, -0.45F, 0.85F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  973 */     this.gunModel['Ì'].setRotationPoint(34.0F, -17.25F, -1.5F);
/*      */     
/*  975 */     this.gunModel['Í'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.05F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.05F, -0.5F, 0.0F);
/*  976 */     this.gunModel['Í'].setRotationPoint(37.5F, -20.25F, -2.5F);
/*      */     
/*  978 */     this.gunModel['Î'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  979 */     this.gunModel['Î'].setRotationPoint(36.0F, -20.25F, -2.5F);
/*      */     
/*  981 */     this.gunModel['Ï'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  982 */     this.gunModel['Ï'].setRotationPoint(34.45F, -20.25F, -2.5F);
/*      */     
/*  984 */     this.gunModel['Ð'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  985 */     this.gunModel['Ð'].setRotationPoint(44.5F, -20.25F, -2.5F);
/*      */     
/*  987 */     this.gunModel['Ñ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  988 */     this.gunModel['Ñ'].setRotationPoint(46.05F, -20.25F, -2.5F);
/*      */     
/*  990 */     this.gunModel['Ò'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.6F, 0.55F, -0.5F, -0.6F, 0.55F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  991 */     this.gunModel['Ò'].setRotationPoint(42.95F, -20.25F, -2.5F);
/*      */     
/*  993 */     this.gunModel['Ó'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  994 */     this.gunModel['Ó'].setRotationPoint(-26.5F, -26.5F, -1.0F);
/*      */     
/*  996 */     this.gunModel['Ô'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  997 */     this.gunModel['Ô'].setRotationPoint(-23.5F, -20.0F, -3.0F);
/*      */     
/*  999 */     this.gunModel['Õ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1000 */     this.gunModel['Õ'].setRotationPoint(-24.5F, -21.0F, -3.0F);
/*      */     
/* 1002 */     this.gunModel['Ö'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1003 */     this.gunModel['Ö'].setRotationPoint(-23.5F, -21.65F, -3.0F);
/*      */     
/* 1005 */     this.gunModel['×'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1006 */     this.gunModel['×'].setRotationPoint(-24.5F, -22.15F, -3.0F);
/*      */     
/* 1008 */     this.gunModel['Ø'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 10, 0.0F, -0.05F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.05F, -0.65F, 0.0F, -0.05F, -1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, -1.35F, 0.0F);
/* 1009 */     this.gunModel['Ø'].setRotationPoint(-25.5F, -23.65F, -3.0F);
/*      */     
/* 1011 */     this.gunModel['Ù'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F);
/* 1012 */     this.gunModel['Ù'].setRotationPoint(-23.5F, -23.5F, -3.0F);
/*      */     
/* 1014 */     this.gunModel['Ú'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 10, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1015 */     this.gunModel['Ú'].setRotationPoint(-24.5F, -23.15F, -3.0F);
/*      */     
/* 1017 */     this.gunModel['Û'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1018 */     this.gunModel['Û'].setRotationPoint(-26.5F, -23.0F, -3.0F);
/*      */     
/* 1020 */     this.gunModel['Ü'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1021 */     this.gunModel['Ü'].setRotationPoint(-25.9F, -28.0F, -2.5F);
/*      */     
/* 1023 */     this.gunModel['Ý'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.35F, -1.0F, 0.0F, -0.35F, -1.0F, 0.0F, -0.35F, -1.0F, -0.25F, -0.35F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1024 */     this.gunModel['Ý'].setRotationPoint(-25.9F, -29.75F, -1.5F);
/*      */     
/* 1026 */     this.gunModel['Þ'].addShapeBox(7.0F, 2.0F, -2.0F, 0, 3, 8, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1027 */     this.gunModel['Þ'].setRotationPoint(-26.5F, -22.5F, -2.0F);
/*      */     
/* 1029 */     this.gunModel['ß'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1030 */     this.gunModel['ß'].setRotationPoint(-22.5F, -31.5F, 0.5F);
/*      */     
/* 1032 */     this.gunModel['à'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F);
/* 1033 */     this.gunModel['à'].setRotationPoint(-23.25F, -31.5F, 0.5F);
/*      */     
/* 1035 */     this.gunModel['á'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F);
/* 1036 */     this.gunModel['á'].setRotationPoint(-22.5F, -30.5F, 3.0F);
/*      */     
/* 1038 */     this.gunModel['â'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['â'].setRotationPoint(-22.5F, -30.5F, 0.0F);
/*      */     
/* 1041 */     this.gunModel['ã'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['ã'].setRotationPoint(-24.5F, -30.5F, -0.5F);
/*      */     
/* 1044 */     this.gunModel['ä'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1045 */     this.gunModel['ä'].setRotationPoint(-24.75F, -31.5F, 1.0F);
/*      */     
/* 1047 */     this.gunModel['å'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1048 */     this.gunModel['å'].setRotationPoint(-24.75F, -31.5F, 2.75F);
/*      */     
/* 1050 */     this.gunModel['æ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, -0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1051 */     this.gunModel['æ'].setRotationPoint(-24.75F, -31.5F, 0.25F);
/*      */     
/* 1053 */     this.gunModel['ç'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 3, 0.0F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1054 */     this.gunModel['ç'].setRotationPoint(-25.75F, -31.5F, 0.75F);
/*      */     
/* 1056 */     this.gunModel['è'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1057 */     this.gunModel['è'].setRotationPoint(-25.75F, -31.5F, 3.5F);
/*      */     
/* 1059 */     this.gunModel['é'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1060 */     this.gunModel['é'].setRotationPoint(-25.75F, -31.5F, 4.5F);
/*      */     
/* 1062 */     this.gunModel['ê'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1063 */     this.gunModel['ê'].setRotationPoint(-24.25F, -31.5F, 4.5F);
/*      */     
/* 1065 */     this.gunModel['ë'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1066 */     this.gunModel['ë'].setRotationPoint(-25.75F, -31.5F, -0.5F);
/*      */     
/* 1068 */     this.gunModel['ì'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1069 */     this.gunModel['ì'].setRotationPoint(-25.75F, -31.5F, -1.5F);
/*      */     
/* 1071 */     this.gunModel['í'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 1, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1072 */     this.gunModel['í'].setRotationPoint(-24.25F, -31.5F, -1.5F);
/*      */     
/* 1074 */     this.gunModel['î'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 1075 */     this.gunModel['î'].setRotationPoint(-23.5F, -30.5F, 4.5F);
/*      */     
/* 1077 */     this.gunModel['ï'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1078 */     this.gunModel['ï'].setRotationPoint(-67.5F, -26.25F, 4.0F);
/*      */     
/* 1080 */     this.gunModel['ð'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1081 */     this.gunModel['ð'].setRotationPoint(-67.5F, -26.25F, 5.0F);
/*      */     
/* 1083 */     this.gunModel['ñ'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1084 */     this.gunModel['ñ'].setRotationPoint(-67.5F, -26.25F, 6.0F);
/*      */     
/* 1086 */     this.gunModel['ò'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1087 */     this.gunModel['ò'].setRotationPoint(-67.5F, -26.25F, -3.0F);
/*      */     
/* 1089 */     this.gunModel['ó'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1090 */     this.gunModel['ó'].setRotationPoint(-67.5F, -26.25F, -2.0F);
/*      */     
/* 1092 */     this.gunModel['ô'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1093 */     this.gunModel['ô'].setRotationPoint(-67.5F, -26.25F, -1.0F);
/*      */     
/* 1095 */     this.gunModel['õ'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1096 */     this.gunModel['õ'].setRotationPoint(-32.5F, -26.25F, 4.0F);
/*      */     
/* 1098 */     this.gunModel['ö'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1099 */     this.gunModel['ö'].setRotationPoint(-32.5F, -26.25F, 5.0F);
/*      */     
/* 1101 */     this.gunModel['÷'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1102 */     this.gunModel['÷'].setRotationPoint(-32.5F, -26.25F, 6.0F);
/*      */     
/* 1104 */     this.gunModel['ø'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1105 */     this.gunModel['ø'].setRotationPoint(-32.5F, -26.25F, -3.0F);
/*      */     
/* 1107 */     this.gunModel['ù'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1108 */     this.gunModel['ù'].setRotationPoint(-32.5F, -26.25F, -2.0F);
/*      */     
/* 1110 */     this.gunModel['ú'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1111 */     this.gunModel['ú'].setRotationPoint(-32.5F, -26.25F, -1.0F);
/*      */     
/* 1113 */     this.gunModel['û'].addShapeBox(7.0F, 2.0F, -2.0F, 34, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1114 */     this.gunModel['û'].setRotationPoint(-25.5F, -24.0F, 4.0F);
/*      */     
/* 1116 */     this.gunModel['ü'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1117 */     this.gunModel['ü'].setRotationPoint(-26.5F, -26.5F, 5.0F);
/*      */     
/* 1119 */     this.gunModel['ý'].addShapeBox(7.0F, 2.0F, -2.0F, 34, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1120 */     this.gunModel['ý'].setRotationPoint(-26.5F, -24.0F, 5.0F);
/*      */     
/* 1122 */     this.gunModel['þ'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1123 */     this.gunModel['þ'].setRotationPoint(-33.5F, -28.0F, 7.0F);
/*      */     
/* 1125 */     this.gunModel['ÿ'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 5, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1126 */     this.gunModel['ÿ'].setRotationPoint(-33.5F, -28.0F, -4.0F);
/*      */     
/* 1128 */     this.gunModel['Ā'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 2, 0.0F, -0.15F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, -0.15F, 0.0F, 1.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.15F, 0.0F, 1.0F);
/* 1129 */     this.gunModel['Ā'].setRotationPoint(-33.6F, -29.0F, -3.0F);
/*      */     
/* 1131 */     this.gunModel['ā'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 2, 0.0F, -0.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, -0.15F, 0.0F, -2.0F, -0.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 1132 */     this.gunModel['ā'].setRotationPoint(-33.6F, -29.0F, 5.0F);
/*      */     
/* 1134 */     this.gunModel['Ă'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 2, 0.0F, -0.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 1135 */     this.gunModel['Ă'].setRotationPoint(-33.6F, -29.0F, 2.0F);
/*      */     
/* 1137 */     this.gunModel['ă'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 2, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 1138 */     this.gunModel['ă'].setRotationPoint(-33.6F, -29.0F, 0.0F);
/*      */     
/* 1140 */     this.gunModel['Ą'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1141 */     this.gunModel['Ą'].setRotationPoint(-33.5F, -28.0F, -3.0F);
/*      */     
/* 1143 */     this.gunModel['ą'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 2, 0.0F, -0.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, -0.15F, 0.0F, -1.5F);
/* 1144 */     this.gunModel['ą'].setRotationPoint(-33.6F, -23.0F, 5.0F);
/*      */     
/* 1146 */     this.gunModel['Ć'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 2, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.15F, 0.0F, 1.0F, -0.15F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, -0.15F, 0.0F, 1.0F);
/* 1147 */     this.gunModel['Ć'].setRotationPoint(-33.6F, -23.0F, -2.0F);
/*      */     
/* 1149 */     this.gunModel['ć'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 2, 0.0F, -0.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 1150 */     this.gunModel['ć'].setRotationPoint(-33.6F, -23.0F, 2.0F);
/*      */     
/* 1152 */     this.gunModel['Ĉ'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 1, 3, 0.0F, -0.15F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, -0.15F, 0.0F, 1.0F, -1.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F);
/* 1153 */     this.gunModel['Ĉ'].setRotationPoint(-33.6F, -22.0F, 1.5F);
/*      */     
/* 1155 */     this.gunModel['ĉ'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 3, 0.0F, -0.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -3.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -3.15F, 0.0F, 0.0F);
/* 1156 */     this.gunModel['ĉ'].setRotationPoint(-32.6F, -21.0F, 1.5F);
/*      */     
/* 1158 */     this.gunModel['Ċ'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1159 */     this.gunModel['Ċ'].setRotationPoint(-68.5F, -26.75F, 6.5F);
/*      */     
/* 1161 */     this.gunModel['ċ'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 4, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1162 */     this.gunModel['ċ'].setRotationPoint(-68.5F, -26.75F, -3.5F);
/*      */     
/* 1164 */     this.gunModel['Č'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1165 */     this.gunModel['Č'].setRotationPoint(-68.5F, -26.75F, -2.5F);
/*      */     
/* 1167 */     this.gunModel['č'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1168 */     this.gunModel['č'].setRotationPoint(-68.5F, -26.75F, -0.5F);
/*      */     
/* 1170 */     this.gunModel['Ď'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 4, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1171 */     this.gunModel['Ď'].setRotationPoint(-68.5F, -26.75F, 3.5F);
/*      */     
/* 1173 */     this.gunModel['ď'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1174 */     this.gunModel['ď'].setRotationPoint(-68.5F, -26.75F, 4.5F);
/*      */     
/* 1176 */     this.gunModel['Đ'].addShapeBox(7.0F, 2.0F, -2.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1177 */     this.gunModel['Đ'].setRotationPoint(-68.5F, -25.75F, 0.5F);
/*      */     
/* 1179 */     this.gunModel['đ'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1180 */     this.gunModel['đ'].setRotationPoint(-71.5F, -25.75F, -2.0F);
/*      */     
/* 1182 */     this.gunModel['Ē'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 18, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F);
/* 1183 */     this.gunModel['Ē'].setRotationPoint(-73.5F, -23.75F, -2.0F);
/*      */     
/* 1185 */     this.gunModel['ē'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 1186 */     this.gunModel['ē'].setRotationPoint(-70.5F, -5.75F, -2.0F);
/*      */     
/* 1188 */     this.gunModel['Ĕ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1189 */     this.gunModel['Ĕ'].setRotationPoint(-73.5F, -25.75F, -2.0F);
/*      */     
/* 1191 */     this.gunModel['ĕ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F);
/* 1192 */     this.gunModel['ĕ'].setRotationPoint(-69.5F, -3.75F, -2.0F);
/*      */     
/* 1194 */     this.gunModel['Ė'].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1195 */     this.gunModel['Ė'].setRotationPoint(-67.5F, -3.75F, -2.0F);
/*      */     
/* 1197 */     this.gunModel['ė'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.25F, -0.5F, -2.0F, -1.25F, -0.5F, -2.0F, 0.0F, 0.0F, -1.0F);
/* 1198 */     this.gunModel['ė'].setRotationPoint(-64.5F, -3.75F, -2.0F);
/*      */     
/* 1200 */     this.gunModel['Ę'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 20, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 1201 */     this.gunModel['Ę'].setRotationPoint(-63.5F, -23.75F, -1.0F);
/*      */     
/* 1203 */     this.gunModel['ę'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1204 */     this.gunModel['ę'].setRotationPoint(-71.5F, -23.75F, -1.0F);
/*      */     
/* 1206 */     this.gunModel['Ě'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 6, 0.0F, 0.17F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.17F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 1207 */     this.gunModel['Ě'].setRotationPoint(-70.0F, -15.75F, -1.0F);
/*      */     
/* 1209 */     this.gunModel['ě'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 8, 0.0F, 0.25F, 0.0F, -1.0F, 0.1F, 0.0F, -1.0F, 0.1F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F);
/* 1210 */     this.gunModel['ě'].setRotationPoint(-66.0F, -15.75F, -2.0F);
/*      */     
/* 1212 */     this.gunModel['Ĝ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1213 */     this.gunModel['Ĝ'].setRotationPoint(-68.0F, -15.75F, -0.5F);
/*      */     
/* 1215 */     this.gunModel['ĝ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 5, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1216 */     this.gunModel['ĝ'].setRotationPoint(-68.0F, -14.5F, -0.5F);
/*      */     
/* 1218 */     this.gunModel['Ğ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1219 */     this.gunModel['Ğ'].setRotationPoint(-68.0F, -15.7F, -1.5F);
/*      */     
/* 1221 */     this.gunModel['ğ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1222 */     this.gunModel['ğ'].setRotationPoint(-68.0F, -14.7F, -1.5F);
/*      */     
/* 1224 */     this.gunModel['Ġ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1225 */     this.gunModel['Ġ'].setRotationPoint(-67.0F, -15.7F, -1.5F);
/*      */     
/* 1227 */     this.gunModel['ġ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1228 */     this.gunModel['ġ'].setRotationPoint(-67.0F, -14.7F, -1.5F);
/*      */     
/* 1230 */     this.gunModel['Ģ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1231 */     this.gunModel['Ģ'].setRotationPoint(-68.5F, -16.2F, -1.5F);
/*      */     
/* 1233 */     this.gunModel['ģ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1234 */     this.gunModel['ģ'].setRotationPoint(-66.5F, -16.2F, -1.5F);
/*      */     
/* 1236 */     this.gunModel['Ĥ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1237 */     this.gunModel['Ĥ'].setRotationPoint(-66.5F, -14.2F, -1.5F);
/*      */     
/* 1239 */     this.gunModel['ĥ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1240 */     this.gunModel['ĥ'].setRotationPoint(-68.5F, -14.2F, -1.5F);
/*      */     
/* 1242 */     this.gunModel['Ħ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1243 */     this.gunModel['Ħ'].setRotationPoint(-68.0F, -14.2F, -1.5F);
/*      */     
/* 1245 */     this.gunModel['ħ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1246 */     this.gunModel['ħ'].setRotationPoint(-68.0F, -16.2F, -1.5F);
/*      */     
/* 1248 */     this.gunModel['Ĩ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1249 */     this.gunModel['Ĩ'].setRotationPoint(-66.5F, -15.7F, -1.5F);
/*      */     
/* 1251 */     this.gunModel['ĩ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1252 */     this.gunModel['ĩ'].setRotationPoint(-68.5F, -15.7F, -1.5F);
/*      */     
/* 1254 */     this.gunModel['Ī'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.gunModel['Ī'].setRotationPoint(-69.5F, -23.75F, -1.0F);
/*      */     
/* 1257 */     this.gunModel['ī'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1258 */     this.gunModel['ī'].setRotationPoint(-64.5F, -20.75F, -1.0F);
/*      */     
/* 1260 */     this.gunModel['Ĭ'].addShapeBox(7.0F, 2.0F, -2.0F, 5, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1261 */     this.gunModel['Ĭ'].setRotationPoint(-69.5F, -16.75F, -1.0F);
/*      */     
/* 1263 */     this.gunModel['ĭ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1264 */     this.gunModel['ĭ'].setRotationPoint(-69.5F, -17.25F, -1.0F);
/*      */     
/* 1266 */     this.gunModel['Į'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1267 */     this.gunModel['Į'].setRotationPoint(-65.5F, -17.25F, -1.0F);
/*      */     
/* 1269 */     this.gunModel['į'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 1270 */     this.gunModel['į'].setRotationPoint(-65.5F, -20.25F, -1.0F);
/*      */     
/* 1272 */     this.gunModel['İ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1273 */     this.gunModel['İ'].setRotationPoint(-69.5F, -20.25F, -1.0F);
/*      */     
/* 1275 */     this.gunModel['ı'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 10, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1276 */     this.gunModel['ı'].setRotationPoint(-64.5F, -13.75F, -1.0F);
/*      */     
/* 1278 */     this.gunModel['Ĳ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1279 */     this.gunModel['Ĳ'].setRotationPoint(-65.5F, -4.75F, -1.0F);
/*      */     
/* 1281 */     this.gunModel['ĳ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 1282 */     this.gunModel['ĳ'].setRotationPoint(-65.5F, -12.75F, -1.0F);
/*      */     
/* 1284 */     this.gunModel['Ĵ'].addShapeBox(7.0F, 2.0F, -2.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1285 */     this.gunModel['Ĵ'].setRotationPoint(-69.5F, -20.75F, -1.0F);
/*      */     
/* 1287 */     this.gunModel['ĵ'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1288 */     this.gunModel['ĵ'].setRotationPoint(-70.5F, -13.75F, -1.0F);
/*      */     
/* 1290 */     this.gunModel['Ķ'].addShapeBox(7.0F, 2.0F, -2.0F, 42, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1291 */     this.gunModel['Ķ'].setRotationPoint(20.5F, -23.0F, -3.0F);
/*      */     
/* 1293 */     this.gunModel['ķ'].addShapeBox(7.0F, 2.0F, -2.0F, 42, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1294 */     this.gunModel['ķ'].setRotationPoint(20.5F, -26.5F, -3.0F);
/*      */     
/* 1296 */     this.gunModel['ĸ'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1297 */     this.gunModel['ĸ'].setRotationPoint(10.5F, -26.5F, -3.0F);
/*      */     
/* 1299 */     this.gunModel['Ĺ'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1300 */     this.gunModel['Ĺ'].setRotationPoint(16.5F, -26.5F, -3.0F);
/*      */     
/* 1302 */     this.gunModel['ĺ'].addShapeBox(7.0F, 2.0F, -2.0F, 10, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.gunModel['ĺ'].setRotationPoint(10.5F, -20.5F, -3.0F);
/*      */     
/* 1305 */     this.gunModel['Ļ'].addShapeBox(7.0F, 2.0F, -2.0F, 10, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1306 */     this.gunModel['Ļ'].setRotationPoint(10.5F, -20.75F, -3.5F);
/*      */     
/* 1308 */     this.gunModel['ļ'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 1309 */     this.gunModel['ļ'].setRotationPoint(16.5F, -17.75F, -4.0F);
/*      */     
/* 1311 */     this.gunModel['Ľ'].addShapeBox(7.0F, 2.0F, -2.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -3.0F, -0.25F);
/* 1312 */     this.gunModel['Ľ'].setRotationPoint(10.5F, -17.75F, -4.0F);
/*      */     
/* 1314 */     this.gunModel['ľ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 1315 */     this.gunModel['ľ'].setRotationPoint(14.5F, -17.75F, -4.0F);
/*      */     
/* 1317 */     this.gunModel['Ŀ'].addShapeBox(7.0F, 2.0F, -2.0F, 10, 1, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1318 */     this.gunModel['Ŀ'].setRotationPoint(10.5F, -22.0F, -3.5F);
/*      */     
/* 1320 */     this.gunModel['ŀ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1321 */     this.gunModel['ŀ'].setRotationPoint(19.5F, -23.25F, -3.0F);
/*      */     
/* 1323 */     this.gunModel['Ł'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1324 */     this.gunModel['Ł'].setRotationPoint(10.5F, -23.25F, -3.0F);
/*      */     
/* 1326 */     this.gunModel['ł'].addShapeBox(7.0F, 2.0F, -2.0F, 10, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1327 */     this.gunModel['ł'].setRotationPoint(10.5F, -21.25F, -3.0F);
/*      */     
/* 1329 */     this.gunModel['Ń'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1330 */     this.gunModel['Ń'].setRotationPoint(9.0F, -14.75F, -2.0F);
/*      */     
/* 1332 */     this.gunModel['ń'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1333 */     this.gunModel['ń'].setRotationPoint(9.0F, -16.0F, -2.0F);
/*      */     
/* 1335 */     this.gunModel['Ņ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 1336 */     this.gunModel['Ņ'].setRotationPoint(9.0F, -12.0F, -2.0F);
/*      */     
/* 1338 */     this.gunModel['ņ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1339 */     this.gunModel['ņ'].setRotationPoint(7.0F, -14.75F, -2.0F);
/*      */     
/* 1341 */     this.gunModel['Ň'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1342 */     this.gunModel['Ň'].setRotationPoint(9.0F, -14.75F, 5.0F);
/*      */     
/* 1344 */     this.gunModel['ň'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1345 */     this.gunModel['ň'].setRotationPoint(9.0F, -16.0F, 5.0F);
/*      */     
/* 1347 */     this.gunModel['ŉ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 1348 */     this.gunModel['ŉ'].setRotationPoint(9.0F, -12.0F, 5.0F);
/*      */     
/* 1350 */     this.gunModel['Ŋ'].addShapeBox(7.0F, 2.0F, -2.0F, 6, 1, 1, 0.0F, -0.25F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F);
/* 1351 */     this.gunModel['Ŋ'].setRotationPoint(5.0F, -13.75F, 5.0F);
/*      */     
/* 1353 */     this.gunModel['ŋ'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1354 */     this.gunModel['ŋ'].setRotationPoint(-12.0F, -15.0F, -2.65F);
/*      */     
/* 1356 */     this.gunModel['Ō'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 2, 9, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1357 */     this.gunModel['Ō'].setRotationPoint(-10.0F, -15.0F, -2.65F);
/*      */     
/* 1359 */     this.gunModel['ō'].addShapeBox(7.0F, 2.0F, -2.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1360 */     this.gunModel['ō'].setRotationPoint(-11.0F, -16.0F, -2.65F);
/*      */     
/* 1362 */     this.gunModel['Ŏ'].addShapeBox(7.0F, 2.0F, -2.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1363 */     this.gunModel['Ŏ'].setRotationPoint(-9.0F, -15.0F, -2.65F);
/*      */     
/* 1365 */     this.gunModel['ŏ'].addShapeBox(7.0F, 2.0F, -2.0F, 34, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1366 */     this.gunModel['ŏ'].setRotationPoint(-26.5F, -24.0F, -2.0F);
/*      */     
/* 1368 */     this.gunModel['Ő'].addShapeBox(7.0F, 2.0F, -2.0F, 35, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1369 */     this.gunModel['Ő'].setRotationPoint(-26.5F, -26.5F, -2.0F);
/*      */     
/*      */ 
/* 1372 */     this.defaultScopeModel = new ModelRendererTurbo[33];
/* 1373 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/* 1374 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 489, 177, this.textureX, this.textureY);
/* 1375 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 401, 193, this.textureX, this.textureY);
/* 1376 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 425, 193, this.textureX, this.textureY);
/* 1377 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 449, 193, this.textureX, this.textureY);
/* 1378 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 313, 129, this.textureX, this.textureY);
/* 1379 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/* 1380 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/* 1381 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/* 1382 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/* 1383 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 241, 145, this.textureX, this.textureY);
/* 1384 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 297, 177, this.textureX, this.textureY);
/* 1385 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 321, 177, this.textureX, this.textureY);
/* 1386 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 345, 177, this.textureX, this.textureY);
/* 1387 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/* 1388 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 465, 193, this.textureX, this.textureY);
/* 1389 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/* 1390 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 25, 201, this.textureX, this.textureY);
/* 1391 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 49, 201, this.textureX, this.textureY);
/* 1392 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 73, 201, this.textureX, this.textureY);
/* 1393 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 97, 201, this.textureX, this.textureY);
/* 1394 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 121, 201, this.textureX, this.textureY);
/* 1395 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 369, 177, this.textureX, this.textureY);
/* 1396 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 393, 177, this.textureX, this.textureY);
/* 1397 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 417, 177, this.textureX, this.textureY);
/* 1398 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 441, 177, this.textureX, this.textureY);
/* 1399 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 465, 177, this.textureX, this.textureY);
/* 1400 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 17, 185, this.textureX, this.textureY);
/* 1401 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/* 1402 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/* 1403 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/* 1404 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/* 1405 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 393, 169, this.textureX, this.textureY);
/*      */     
/* 1407 */     this.defaultScopeModel[0].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 1408 */     this.defaultScopeModel[0].setRotationPoint(53.0F, -33.5F, -1.75F);
/*      */     
/* 1410 */     this.defaultScopeModel[1].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1411 */     this.defaultScopeModel[1].setRotationPoint(53.0F, -35.5F, -1.75F);
/*      */     
/* 1413 */     this.defaultScopeModel[2].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1414 */     this.defaultScopeModel[2].setRotationPoint(53.0F, -33.5F, 3.75F);
/*      */     
/* 1416 */     this.defaultScopeModel[3].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, -1.5F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1417 */     this.defaultScopeModel[3].setRotationPoint(53.0F, -35.5F, 3.75F);
/*      */     
/* 1419 */     this.defaultScopeModel[4].addShapeBox(7.0F, 2.0F, -2.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1420 */     this.defaultScopeModel[4].setRotationPoint(54.25F, -36.5F, 0.5F);
/*      */     
/* 1422 */     this.defaultScopeModel[5].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 3, 0.0F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -1.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -1.25F, -0.25F);
/* 1423 */     this.defaultScopeModel[5].setRotationPoint(52.75F, -37.0F, 0.5F);
/*      */     
/* 1425 */     this.defaultScopeModel[6].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1426 */     this.defaultScopeModel[6].setRotationPoint(53.25F, -37.0F, -0.5F);
/*      */     
/* 1428 */     this.defaultScopeModel[7].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1429 */     this.defaultScopeModel[7].setRotationPoint(53.25F, -39.0F, -1.25F);
/*      */     
/* 1431 */     this.defaultScopeModel[8].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 1, 0.0F, 0.0F, 0.25F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1432 */     this.defaultScopeModel[8].setRotationPoint(53.25F, -39.5F, -0.75F);
/*      */     
/* 1434 */     this.defaultScopeModel[9].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1435 */     this.defaultScopeModel[9].setRotationPoint(53.25F, -39.0F, -0.5F);
/*      */     
/* 1437 */     this.defaultScopeModel[10].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F);
/* 1438 */     this.defaultScopeModel[10].setRotationPoint(53.25F, -37.0F, 3.5F);
/*      */     
/* 1440 */     this.defaultScopeModel[11].addShapeBox(7.0F, 2.0F, -2.0F, 4, 2, 1, 0.0F, 0.0F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1441 */     this.defaultScopeModel[11].setRotationPoint(53.25F, -39.0F, 4.25F);
/*      */     
/* 1443 */     this.defaultScopeModel[12].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1444 */     this.defaultScopeModel[12].setRotationPoint(53.25F, -39.0F, 3.5F);
/*      */     
/* 1446 */     this.defaultScopeModel[13].addShapeBox(7.0F, 2.0F, -2.0F, 4, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 1447 */     this.defaultScopeModel[13].setRotationPoint(53.25F, -39.5F, 3.75F);
/*      */     
/* 1449 */     this.defaultScopeModel[14].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1450 */     this.defaultScopeModel[14].setRotationPoint(54.25F, -39.0F, 1.5F);
/*      */     
/* 1452 */     this.defaultScopeModel[15].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 1453 */     this.defaultScopeModel[15].setRotationPoint(-19.0F, -33.5F, -1.75F);
/*      */     
/* 1455 */     this.defaultScopeModel[16].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1456 */     this.defaultScopeModel[16].setRotationPoint(-19.0F, -35.5F, -1.75F);
/*      */     
/* 1458 */     this.defaultScopeModel[17].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1459 */     this.defaultScopeModel[17].setRotationPoint(-19.0F, -33.5F, 3.75F);
/*      */     
/* 1461 */     this.defaultScopeModel[18].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 2, 0.0F, -1.5F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1462 */     this.defaultScopeModel[18].setRotationPoint(-19.0F, -35.5F, 3.75F);
/*      */     
/* 1464 */     this.defaultScopeModel[19].addShapeBox(7.0F, 2.0F, -2.0F, 6, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1465 */     this.defaultScopeModel[19].setRotationPoint(-19.0F, -33.5F, 0.0F);
/*      */     
/* 1467 */     this.defaultScopeModel[20].addShapeBox(7.0F, 2.0F, -2.0F, 6, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 1468 */     this.defaultScopeModel[20].setRotationPoint(53.0F, -32.5F, -0.25F);
/*      */     
/* 1470 */     this.defaultScopeModel[21].addShapeBox(7.0F, 2.0F, -2.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1471 */     this.defaultScopeModel[21].setRotationPoint(-17.75F, -36.5F, 0.5F);
/*      */     
/* 1473 */     this.defaultScopeModel[22].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1474 */     this.defaultScopeModel[22].setRotationPoint(-17.5F, -37.0F, -0.5F);
/*      */     
/* 1476 */     this.defaultScopeModel[23].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F);
/* 1477 */     this.defaultScopeModel[23].setRotationPoint(-17.5F, -37.0F, 3.5F);
/*      */     
/* 1479 */     this.defaultScopeModel[24].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1480 */     this.defaultScopeModel[24].setRotationPoint(-17.5F, -39.0F, -0.5F);
/*      */     
/* 1482 */     this.defaultScopeModel[25].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1483 */     this.defaultScopeModel[25].setRotationPoint(-17.5F, -39.0F, 3.0F);
/*      */     
/* 1485 */     this.defaultScopeModel[26].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1486 */     this.defaultScopeModel[26].setRotationPoint(-17.5F, -40.0F, 3.0F);
/*      */     
/* 1488 */     this.defaultScopeModel[27].addShapeBox(7.0F, 2.0F, -2.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1489 */     this.defaultScopeModel[27].setRotationPoint(-17.5F, -40.0F, -0.5F);
/*      */     
/* 1491 */     this.defaultScopeModel[28].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 1, 0.0F, -0.75F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F);
/* 1492 */     this.defaultScopeModel[28].setRotationPoint(-17.25F, -38.0F, 1.5F);
/*      */     
/* 1494 */     this.defaultScopeModel[29].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1495 */     this.defaultScopeModel[29].setRotationPoint(-16.5F, -39.25F, 1.0F);
/*      */     
/* 1497 */     this.defaultScopeModel[30].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1498 */     this.defaultScopeModel[30].setRotationPoint(-16.5F, -39.25F, 2.5F);
/*      */     
/* 1500 */     this.defaultScopeModel[31].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1501 */     this.defaultScopeModel[31].setRotationPoint(-16.5F, -39.75F, 1.5F);
/*      */     
/* 1503 */     this.defaultScopeModel[32].addShapeBox(7.0F, 2.0F, -2.0F, 1, 1, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1504 */     this.defaultScopeModel[32].setRotationPoint(-16.75F, -38.0F, 0.5F);
/*      */     
/*      */ 
/* 1507 */     this.defaultGripModel = new ModelRendererTurbo[4];
/* 1508 */     this.defaultGripModel[0] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/* 1509 */     this.defaultGripModel[1] = new ModelRendererTurbo(this, 249, 145, this.textureX, this.textureY);
/* 1510 */     this.defaultGripModel[2] = new ModelRendererTurbo(this, 265, 145, this.textureX, this.textureY);
/* 1511 */     this.defaultGripModel[3] = new ModelRendererTurbo(this, 497, 113, this.textureX, this.textureY);
/*      */     
/* 1513 */     this.defaultGripModel[0].addShapeBox(7.0F, 2.0F, -2.0F, 2, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1514 */     this.defaultGripModel[0].setRotationPoint(60.5F, -16.0F, -0.5F);
/*      */     
/* 1516 */     this.defaultGripModel[1].addShapeBox(7.0F, 2.0F, -2.0F, 2, 3, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.0F, 0.0F);
/* 1517 */     this.defaultGripModel[1].setRotationPoint(58.0F, -16.0F, -0.5F);
/*      */     
/* 1519 */     this.defaultGripModel[2].addShapeBox(7.0F, 2.0F, -2.0F, 1, 6, 5, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F);
/* 1520 */     this.defaultGripModel[2].setRotationPoint(59.5F, -16.0F, -0.5F);
/*      */     
/* 1522 */     this.defaultGripModel[3].addShapeBox(7.0F, 2.0F, -2.0F, 2, 2, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F);
/* 1523 */     this.defaultGripModel[3].setRotationPoint(56.5F, -16.0F, -0.5F);
/*      */     
/*      */ 
/* 1526 */     this.ammoModel = new ModelRendererTurbo[13];
/* 1527 */     this.ammoModel[0] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/* 1528 */     this.ammoModel[1] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/* 1529 */     this.ammoModel[2] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/* 1530 */     this.ammoModel[3] = new ModelRendererTurbo(this, 225, 129, this.textureX, this.textureY);
/* 1531 */     this.ammoModel[4] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/* 1532 */     this.ammoModel[5] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/* 1533 */     this.ammoModel[6] = new ModelRendererTurbo(this, 297, 137, this.textureX, this.textureY);
/* 1534 */     this.ammoModel[7] = new ModelRendererTurbo(this, 481, 105, this.textureX, this.textureY);
/* 1535 */     this.ammoModel[8] = new ModelRendererTurbo(this, 337, 137, this.textureX, this.textureY);
/* 1536 */     this.ammoModel[9] = new ModelRendererTurbo(this, 369, 137, this.textureX, this.textureY);
/* 1537 */     this.ammoModel[10] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/* 1538 */     this.ammoModel[11] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/* 1539 */     this.ammoModel[12] = new ModelRendererTurbo(this, 473, 137, this.textureX, this.textureY);
/*      */     
/* 1541 */     this.ammoModel[0].addShapeBox(7.0F, 2.0F, -2.0F, 10, 5, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1542 */     this.ammoModel[0].setRotationPoint(12.25F, -0.15F, -1.5F);
/*      */     
/* 1544 */     this.ammoModel[1].addShapeBox(7.0F, 2.0F, -2.0F, 10, 4, 7, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1545 */     this.ammoModel[1].setRotationPoint(13.25F, 4.85F, -1.5F);
/*      */     
/* 1547 */     this.ammoModel[2].addShapeBox(7.0F, 2.0F, -2.0F, 10, 4, 7, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1548 */     this.ammoModel[2].setRotationPoint(14.25F, 8.85F, -1.5F);
/*      */     
/* 1550 */     this.ammoModel[3].addShapeBox(7.0F, 2.0F, -2.0F, 10, 4, 7, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1551 */     this.ammoModel[3].setRotationPoint(15.25F, 12.85F, -1.5F);
/*      */     
/* 1553 */     this.ammoModel[4].addShapeBox(7.0F, 2.0F, -2.0F, 10, 4, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1554 */     this.ammoModel[4].setRotationPoint(16.25F, 16.85F, -1.5F);
/*      */     
/* 1556 */     this.ammoModel[5].addShapeBox(7.0F, 2.0F, -2.0F, 10, 4, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1557 */     this.ammoModel[5].setRotationPoint(17.25F, 20.85F, -1.5F);
/*      */     
/* 1559 */     this.ammoModel[6].addShapeBox(7.0F, 2.0F, -2.0F, 10, 4, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1560 */     this.ammoModel[6].setRotationPoint(18.75F, 24.85F, -1.5F);
/*      */     
/* 1562 */     this.ammoModel[7].addShapeBox(7.0F, 2.0F, -2.0F, 2, 5, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1563 */     this.ammoModel[7].setRotationPoint(20.25F, 28.85F, -1.5F);
/*      */     
/* 1565 */     this.ammoModel[8].addShapeBox(7.0F, 2.0F, -2.0F, 7, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1566 */     this.ammoModel[8].setRotationPoint(22.25F, 28.85F, -1.5F);
/*      */     
/* 1568 */     this.ammoModel[9].addShapeBox(7.0F, 2.0F, -2.0F, 7, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1569 */     this.ammoModel[9].setRotationPoint(22.0F, 33.85F, -1.5F);
/*      */     
/* 1571 */     this.ammoModel[10].addShapeBox(7.0F, 2.0F, -2.0F, 3, 2, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1572 */     this.ammoModel[10].setRotationPoint(29.25F, 31.85F, -1.5F);
/*      */     
/* 1574 */     this.ammoModel[11].addShapeBox(7.0F, 2.0F, -2.0F, 3, 3, 7, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1575 */     this.ammoModel[11].setRotationPoint(29.25F, 28.85F, -1.5F);
/*      */     
/* 1577 */     this.ammoModel[12].addShapeBox(7.0F, 2.0F, -2.0F, 10, 5, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1578 */     this.ammoModel[12].setRotationPoint(12.25F, -5.15F, -1.5F);
/*      */     
/*      */ 
/* 1581 */     this.slideModel = new ModelRendererTurbo[1];
/* 1582 */     this.slideModel[0] = new ModelRendererTurbo(this, 321, 201, this.textureX, this.textureY);
/*      */     
/* 1584 */     this.slideModel[0].addShapeBox(7.0F, 2.0F, -2.0F, 10, 6, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1585 */     this.slideModel[0].setRotationPoint(10.5F, -26.5F, -3.0F);
/*      */     
/*      */ 
/*      */ 
/* 1589 */     this.gripAttachPoint = new Vector3f(3.4375F, 1.5625F, 0.0F);
/* 1590 */     this.scopeAttachPoint = new Vector3f(0.0F, 2.5625F, 0.0F);
/*      */     
/* 1592 */     translateAll(0.0F, -12.0F, 0.0F);
/* 1593 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/*      */ 
/* 1596 */     this.gunSlideDistance = 0.25F;
/* 1597 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/* 1599 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */