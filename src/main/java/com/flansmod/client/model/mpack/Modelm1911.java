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
/*      */ public class Modelm1911
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelm1911()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['¼'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 41, 81, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 81, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 417, 89, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 177, 97, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 201, 97, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 409, 97, this.textureX, this.textureY);
/*      */     
/*  211 */     this.gunModel[0].addShapeBox(3.0F, -13.0F, -4.5F, 50, 3, 7, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  212 */     this.gunModel[0].setRotationPoint(-13.0F, -19.0F, 1.0F);
/*      */     
/*  214 */     this.gunModel[1].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  215 */     this.gunModel[1].setRotationPoint(-14.5F, -22.5F, 3.5F);
/*      */     
/*  217 */     this.gunModel[2].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  218 */     this.gunModel[2].setRotationPoint(-13.5F, -24.0F, 3.5F);
/*      */     
/*  220 */     this.gunModel[3].addBox(3.0F, -13.0F, -4.5F, 47, 2, 1, 0.0F);
/*  221 */     this.gunModel[3].setRotationPoint(-10.0F, -19.5F, 5.5F);
/*      */     
/*  223 */     this.gunModel[4].addShapeBox(3.0F, -13.0F, -4.5F, 27, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  224 */     this.gunModel[4].setRotationPoint(22.0F, -24.2F, 2.5F);
/*      */     
/*  226 */     this.gunModel[5].addBox(3.0F, -13.0F, -4.5F, 11, 6, 6, 0.0F);
/*  227 */     this.gunModel[5].setRotationPoint(-7.0F, -25.2F, 1.5F);
/*      */     
/*  229 */     this.gunModel[6].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  230 */     this.gunModel[6].setRotationPoint(28.0F, -16.0F, 6.75F);
/*      */     
/*  232 */     this.gunModel[7].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F);
/*  233 */     this.gunModel[7].setRotationPoint(28.0F, -14.75F, 4.5F);
/*      */     
/*  235 */     this.gunModel[8].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  236 */     this.gunModel[8].setRotationPoint(28.0F, -14.75F, 3.0F);
/*      */     
/*  238 */     this.gunModel[9].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F);
/*  239 */     this.gunModel[9].setRotationPoint(28.0F, -16.0F, 1.25F);
/*      */     
/*  241 */     this.gunModel[10].addShapeBox(3.0F, -13.0F, -4.5F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  242 */     this.gunModel[10].setRotationPoint(29.0F, -17.75F, 3.0F);
/*      */     
/*  244 */     this.gunModel[11].addShapeBox(3.0F, -13.0F, -4.5F, 36, 2, 7, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  245 */     this.gunModel[11].setRotationPoint(-13.0F, -16.0F, 1.0F);
/*      */     
/*  247 */     this.gunModel[12].addShapeBox(3.0F, -13.0F, -4.5F, 8, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  248 */     this.gunModel[12].setRotationPoint(11.0F, -24.5F, 1.5F);
/*      */     
/*  250 */     this.gunModel[13].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  251 */     this.gunModel[13].setRotationPoint(21.0F, -14.0F, 2.5F);
/*      */     
/*  253 */     this.gunModel[14].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F);
/*  254 */     this.gunModel[14].setRotationPoint(19.0F, -13.0F, 2.5F);
/*      */     
/*  256 */     this.gunModel[15].addShapeBox(3.0F, -13.0F, -4.5F, 1, 4, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  257 */     this.gunModel[15].setRotationPoint(20.0F, -14.0F, 2.5F);
/*      */     
/*  259 */     this.gunModel[16].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  260 */     this.gunModel[16].setRotationPoint(9.0F, -5.0F, 2.5F);
/*      */     
/*  262 */     this.gunModel[17].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  263 */     this.gunModel[17].setRotationPoint(-13.5F, -21.0F, 3.5F);
/*      */     
/*  265 */     this.gunModel[18].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  266 */     this.gunModel[18].setRotationPoint(9.0F, -6.0F, 2.5F);
/*      */     
/*  268 */     this.gunModel[19].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  269 */     this.gunModel[19].setRotationPoint(17.0F, -14.0F, 2.5F);
/*      */     
/*  271 */     this.gunModel[20].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F);
/*  272 */     this.gunModel[20].setRotationPoint(20.0F, -10.5F, 2.5F);
/*      */     
/*  274 */     this.gunModel[21].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/*  275 */     this.gunModel[21].setRotationPoint(19.75F, -9.0F, 2.5F);
/*      */     
/*  277 */     this.gunModel[22].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 2.25F, 1.0F, -0.25F, -2.0F, 1.0F, -0.25F, -2.0F, 1.0F, -0.25F, 2.25F, 1.0F, -0.25F);
/*  278 */     this.gunModel[22].setRotationPoint(19.25F, -7.0F, 2.5F);
/*      */     
/*  280 */     this.gunModel[23].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  281 */     this.gunModel[23].setRotationPoint(23.0F, -16.0F, 6.75F);
/*      */     
/*  283 */     this.gunModel[24].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  284 */     this.gunModel[24].setRotationPoint(23.0F, -14.75F, 4.5F);
/*      */     
/*  286 */     this.gunModel[25].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  287 */     this.gunModel[25].setRotationPoint(23.0F, -14.75F, 3.0F);
/*      */     
/*  289 */     this.gunModel[26].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 1.0F, 0.75F);
/*  290 */     this.gunModel[26].setRotationPoint(23.0F, -16.0F, 1.25F);
/*      */     
/*  292 */     this.gunModel[27].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  293 */     this.gunModel[27].setRotationPoint(27.0F, -17.75F, 3.0F);
/*      */     
/*  295 */     this.gunModel[28].addShapeBox(3.0F, -13.0F, -4.5F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  296 */     this.gunModel[28].setRotationPoint(23.0F, -16.75F, 3.0F);
/*      */     
/*  298 */     this.gunModel[29].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  299 */     this.gunModel[29].setRotationPoint(-14.5F, -23.5F, 3.5F);
/*      */     
/*  301 */     this.gunModel[30].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  302 */     this.gunModel[30].setRotationPoint(-15.5F, -24.5F, 3.5F);
/*      */     
/*  304 */     this.gunModel[31].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  305 */     this.gunModel[31].setRotationPoint(-14.5F, -21.5F, 3.5F);
/*      */     
/*  307 */     this.gunModel[32].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  308 */     this.gunModel[32].setRotationPoint(-16.5F, -22.5F, 3.5F);
/*      */     
/*  310 */     this.gunModel[33].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  311 */     this.gunModel[33].setRotationPoint(-16.5F, -24.5F, 3.5F);
/*      */     
/*  313 */     this.gunModel[34].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  314 */     this.gunModel[34].setRotationPoint(-11.5F, -23.5F, 3.5F);
/*      */     
/*  316 */     this.gunModel[35].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  317 */     this.gunModel[35].setRotationPoint(-9.5F, -22.2F, 5.0F);
/*      */     
/*  319 */     this.gunModel[36].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  320 */     this.gunModel[36].setRotationPoint(-14.0F, -19.0F, 1.0F);
/*      */     
/*  322 */     this.gunModel[37].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 3, 0.0F, -0.25F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/*  323 */     this.gunModel[37].setRotationPoint(-16.0F, -18.0F, 1.0F);
/*      */     
/*  325 */     this.gunModel[38].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, -0.5F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  326 */     this.gunModel[38].setRotationPoint(-16.75F, -17.0F, 1.0F);
/*      */     
/*  328 */     this.gunModel[39].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 3, 0.0F, -1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  329 */     this.gunModel[39].setRotationPoint(-18.0F, -16.0F, 1.0F);
/*      */     
/*  331 */     this.gunModel[40].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 3, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  332 */     this.gunModel[40].setRotationPoint(-18.0F, -15.0F, 1.0F);
/*      */     
/*  334 */     this.gunModel[41].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  335 */     this.gunModel[41].setRotationPoint(-14.0F, -18.0F, 1.0F);
/*      */     
/*  337 */     this.gunModel[42].addShapeBox(3.0F, -13.0F, -4.5F, 5, 2, 7, 0.0F, -0.75F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -1.5F, -0.25F);
/*  338 */     this.gunModel[42].setRotationPoint(-18.0F, -14.5F, 1.0F);
/*      */     
/*  340 */     this.gunModel[43].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F);
/*  341 */     this.gunModel[43].setRotationPoint(-13.0F, -13.0F, 2.0F);
/*      */     
/*  343 */     this.gunModel[44].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 5, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  344 */     this.gunModel[44].setRotationPoint(-11.0F, -12.5F, 2.0F);
/*      */     
/*  346 */     this.gunModel[45].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  347 */     this.gunModel[45].setRotationPoint(-9.0F, -9.0F, 2.0F);
/*      */     
/*  349 */     this.gunModel[46].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 7, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  350 */     this.gunModel[46].setRotationPoint(-13.0F, -13.5F, 1.0F);
/*      */     
/*  352 */     this.gunModel[47].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  353 */     this.gunModel[47].setRotationPoint(-9.0F, -13.0F, 2.0F);
/*      */     
/*  355 */     this.gunModel[48].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  356 */     this.gunModel[48].setRotationPoint(5.0F, -12.5F, 2.0F);
/*      */     
/*  358 */     this.gunModel[49].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, 2.5F, 0.5F, -0.25F, 2.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  359 */     this.gunModel[49].setRotationPoint(5.0F, -13.5F, 2.0F);
/*      */     
/*  361 */     this.gunModel[50].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  362 */     this.gunModel[50].setRotationPoint(5.0F, -11.0F, 2.0F);
/*      */     
/*  364 */     this.gunModel[51].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  365 */     this.gunModel[51].setRotationPoint(5.0F, -7.5F, 2.0F);
/*      */     
/*  367 */     this.gunModel[52].addShapeBox(3.0F, -13.0F, -4.5F, 3, 2, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  368 */     this.gunModel[52].setRotationPoint(5.0F, -10.0F, 2.0F);
/*      */     
/*  370 */     this.gunModel[53].addShapeBox(3.0F, -13.0F, -4.5F, 12, 9, 7, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  371 */     this.gunModel[53].setRotationPoint(-7.0F, -14.0F, 1.0F);
/*      */     
/*  373 */     this.gunModel[54].addShapeBox(3.0F, -13.0F, -4.5F, 4, 2, 5, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  374 */     this.gunModel[54].setRotationPoint(5.0F, -7.0F, 2.0F);
/*      */     
/*  376 */     this.gunModel[55].addShapeBox(3.0F, -13.0F, -4.5F, 2, 10, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  377 */     this.gunModel[55].setRotationPoint(5.0F, -15.0F, 6.0F);
/*      */     
/*  379 */     this.gunModel[56].addShapeBox(3.0F, -13.0F, -4.5F, 2, 10, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  380 */     this.gunModel[56].setRotationPoint(5.0F, -15.0F, 0.5F);
/*      */     
/*  382 */     this.gunModel[57].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/*  383 */     this.gunModel[57].setRotationPoint(7.0F, -7.0F, 6.0F);
/*      */     
/*  385 */     this.gunModel[58].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, -2.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  386 */     this.gunModel[58].setRotationPoint(7.0F, -7.5F, 7.0F);
/*      */     
/*  388 */     this.gunModel[59].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  389 */     this.gunModel[59].setRotationPoint(7.0F, -10.0F, 6.0F);
/*      */     
/*  391 */     this.gunModel[60].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  392 */     this.gunModel[60].setRotationPoint(7.0F, -12.5F, 6.0F);
/*      */     
/*  394 */     this.gunModel[61].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.75F, 2.0F, -1.0F, -0.75F, 0.25F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  395 */     this.gunModel[61].setRotationPoint(7.0F, -14.0F, 6.0F);
/*      */     
/*  397 */     this.gunModel[62].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, -1.0F, -0.75F, 4.5F, -1.0F, -0.75F, 2.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 2.0F, 1.0F, -0.75F, 0.25F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  398 */     this.gunModel[62].setRotationPoint(7.0F, -15.0F, 6.0F);
/*      */     
/*  400 */     this.gunModel[63].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F);
/*  401 */     this.gunModel[63].setRotationPoint(7.0F, -7.0F, 1.0F);
/*      */     
/*  403 */     this.gunModel[64].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.5F, -0.25F, -2.0F, 0.5F, -0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/*  404 */     this.gunModel[64].setRotationPoint(7.0F, -7.5F, 1.0F);
/*      */     
/*  406 */     this.gunModel[65].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  407 */     this.gunModel[65].setRotationPoint(7.0F, -10.0F, 1.0F);
/*      */     
/*  409 */     this.gunModel[66].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  410 */     this.gunModel[66].setRotationPoint(7.0F, -12.5F, 1.0F);
/*      */     
/*  412 */     this.gunModel[67].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F, 2.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F);
/*  413 */     this.gunModel[67].setRotationPoint(7.0F, -14.0F, 1.0F);
/*      */     
/*  415 */     this.gunModel[68].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, -1.0F, -0.25F, 2.0F, -1.0F, -0.25F, 4.5F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 1.0F, -0.25F, 0.25F, 1.0F, -0.25F, 2.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F);
/*  416 */     this.gunModel[68].setRotationPoint(7.0F, -15.0F, 1.0F);
/*      */     
/*  418 */     this.gunModel[69].addShapeBox(3.0F, -13.0F, -4.5F, 3, 2, 3, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  419 */     this.gunModel[69].setRotationPoint(7.5F, -10.5F, 3.0F);
/*      */     
/*  421 */     this.gunModel[70].addShapeBox(3.0F, -13.0F, -4.5F, 3, 3, 3, 0.0F, 0.0F, -0.5F, -0.25F, 1.5F, -0.5F, -0.25F, 1.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  422 */     this.gunModel[70].setRotationPoint(7.5F, -13.25F, 3.0F);
/*      */     
/*  424 */     this.gunModel[71].addShapeBox(3.0F, -13.0F, -4.5F, 3, 3, 3, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  425 */     this.gunModel[71].setRotationPoint(7.5F, -9.0F, 3.0F);
/*      */     
/*  427 */     this.gunModel[72].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 3, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  428 */     this.gunModel[72].setRotationPoint(7.5F, -6.5F, 3.0F);
/*      */     
/*  430 */     this.gunModel[73].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 3, 0.0F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  431 */     this.gunModel[73].setRotationPoint(7.5F, -13.75F, 3.0F);
/*      */     
/*  433 */     this.gunModel[74].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  434 */     this.gunModel[74].setRotationPoint(-14.0F, -19.0F, 5.0F);
/*      */     
/*  436 */     this.gunModel[75].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 3, 0.0F, -0.5F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  437 */     this.gunModel[75].setRotationPoint(-16.0F, -18.0F, 5.0F);
/*      */     
/*  439 */     this.gunModel[76].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, -0.25F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/*  440 */     this.gunModel[76].setRotationPoint(-16.5F, -17.0F, 5.0F);
/*      */     
/*  442 */     this.gunModel[77].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 3, 0.0F, -1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  443 */     this.gunModel[77].setRotationPoint(-18.0F, -16.0F, 5.0F);
/*      */     
/*  445 */     this.gunModel[78].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 4, 0.0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  446 */     this.gunModel[78].setRotationPoint(-18.0F, -15.0F, 4.0F);
/*      */     
/*  448 */     this.gunModel[79].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  449 */     this.gunModel[79].setRotationPoint(-14.0F, -18.0F, 5.0F);
/*      */     
/*  451 */     this.gunModel[80].addShapeBox(3.0F, -13.0F, -4.5F, 13, 2, 5, 0.0F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/*  452 */     this.gunModel[80].setRotationPoint(-8.5F, -5.5F, 2.0F);
/*      */     
/*  454 */     this.gunModel[81].addShapeBox(3.0F, -13.0F, -4.5F, 12, 3, 5, 0.0F, -0.75F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  455 */     this.gunModel[81].setRotationPoint(-9.0F, -4.5F, 2.0F);
/*      */     
/*  457 */     this.gunModel[82].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  458 */     this.gunModel[82].setRotationPoint(7.0F, -6.0F, 6.0F);
/*      */     
/*  460 */     this.gunModel[83].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 6, 0.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  461 */     this.gunModel[83].setRotationPoint(7.0F, -6.0F, 1.0F);
/*      */     
/*  463 */     this.gunModel[84].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -2.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  464 */     this.gunModel[84].setRotationPoint(4.0F, -4.0F, 6.0F);
/*      */     
/*  466 */     this.gunModel[85].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 6, 0.0F, 0.0F, -1.0F, -1.25F, 0.25F, -1.0F, -1.25F, 0.25F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -1.25F, -1.75F, 0.5F, -1.25F, -1.75F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  467 */     this.gunModel[85].setRotationPoint(4.0F, -4.5F, 1.0F);
/*      */     
/*  469 */     this.gunModel[86].addShapeBox(3.0F, -13.0F, -4.5F, 5, 15, 2, 0.0F, 0.5F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.75F, -3.5F, 0.0F, -0.75F, -4.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/*  470 */     this.gunModel[86].setRotationPoint(0.0F, 0.0F, 6.0F);
/*      */     
/*  472 */     this.gunModel[87].addShapeBox(3.0F, -13.0F, -4.5F, 6, 15, 6, 0.0F, -0.5F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -1.25F, -3.5F, 0.0F, -1.25F, -3.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  473 */     this.gunModel[87].setRotationPoint(-1.0F, 0.0F, 1.0F);
/*      */     
/*  475 */     this.gunModel[88].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  476 */     this.gunModel[88].setRotationPoint(4.0F, -4.5F, 1.0F);
/*      */     
/*  478 */     this.gunModel[89].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 7, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F);
/*  479 */     this.gunModel[89].setRotationPoint(2.5F, -4.5F, 1.0F);
/*      */     
/*  481 */     this.gunModel[90].addShapeBox(3.0F, -13.0F, -4.5F, 4, 4, 7, 0.0F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  482 */     this.gunModel[90].setRotationPoint(-0.5F, -4.5F, 1.0F);
/*      */     
/*  484 */     this.gunModel[91].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, -1.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -1.25F, -0.5F, 0.5F, -0.25F);
/*  485 */     this.gunModel[91].setRotationPoint(6.0F, -4.5F, 7.0F);
/*      */     
/*  487 */     this.gunModel[92].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  488 */     this.gunModel[92].setRotationPoint(6.0F, -4.5F, 1.0F);
/*      */     
/*  490 */     this.gunModel[93].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  491 */     this.gunModel[93].setRotationPoint(6.5F, -4.5F, 1.0F);
/*      */     
/*  493 */     this.gunModel[94].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  494 */     this.gunModel[94].setRotationPoint(6.5F, -4.0F, 1.0F);
/*      */     
/*  496 */     this.gunModel[95].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -1.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  497 */     this.gunModel[95].setRotationPoint(4.0F, -4.0F, 1.0F);
/*      */     
/*  499 */     this.gunModel[96].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.0F, 0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F);
/*  500 */     this.gunModel[96].setRotationPoint(6.0F, -4.5F, 1.0F);
/*      */     
/*  502 */     this.gunModel[97].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, 1.0F, -0.75F);
/*  503 */     this.gunModel[97].setRotationPoint(7.0F, -6.0F, 1.0F);
/*      */     
/*  505 */     this.gunModel[98].addShapeBox(3.0F, -13.0F, -4.5F, 5, 15, 2, 0.0F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, -4.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F);
/*  506 */     this.gunModel[98].setRotationPoint(0.0F, 0.0F, 1.0F);
/*      */     
/*  508 */     this.gunModel[99].addShapeBox(3.0F, -13.0F, -4.5F, 7, 20, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  509 */     this.gunModel[99].setRotationPoint(-7.0F, -5.5F, 1.0F);
/*      */     
/*  511 */     this.gunModel[100].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  512 */     this.gunModel[100].setRotationPoint(4.0F, -5.5F, 1.0F);
/*      */     
/*  514 */     this.gunModel[101].addShapeBox(3.0F, -13.0F, -4.5F, 2, 17, 1, 0.0F, -1.0F, -0.5F, -1.25F, 1.0F, -0.5F, -0.25F, 1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 4.0F, 0.0F, -1.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.25F, 4.0F, 0.0F, 0.25F);
/*  515 */     this.gunModel[101].setRotationPoint(-10.0F, -2.0F, 1.0F);
/*      */     
/*  517 */     this.gunModel[102].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  518 */     this.gunModel[102].setRotationPoint(-9.0F, -4.5F, 1.0F);
/*      */     
/*  520 */     this.gunModel[103].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -1.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -1.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F);
/*  521 */     this.gunModel[103].setRotationPoint(-8.5F, -5.5F, 1.0F);
/*      */     
/*  523 */     this.gunModel[104].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.75F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/*  524 */     this.gunModel[104].setRotationPoint(-9.0F, -9.0F, 1.0F);
/*      */     
/*  526 */     this.gunModel[105].addShapeBox(3.0F, -13.0F, -4.5F, 2, 17, 1, 0.0F, -1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -1.25F, 4.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.25F, 4.0F, 0.0F, -1.25F);
/*  527 */     this.gunModel[105].setRotationPoint(-10.0F, -2.0F, 7.0F);
/*      */     
/*  529 */     this.gunModel[106].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, -0.75F, -0.5F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F);
/*  530 */     this.gunModel[106].setRotationPoint(-9.0F, -4.5F, 7.0F);
/*      */     
/*  532 */     this.gunModel[107].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F, -0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -1.25F);
/*  533 */     this.gunModel[107].setRotationPoint(-8.5F, -5.5F, 7.0F);
/*      */     
/*  535 */     this.gunModel[108].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 2.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F);
/*  536 */     this.gunModel[108].setRotationPoint(-9.0F, -11.5F, 1.0F);
/*      */     
/*  538 */     this.gunModel[109].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 4.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F);
/*  539 */     this.gunModel[109].setRotationPoint(-9.0F, -13.0F, 1.0F);
/*      */     
/*  541 */     this.gunModel[110].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 2.0F, -0.5F, -1.25F, -1.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F);
/*  542 */     this.gunModel[110].setRotationPoint(-9.0F, -11.5F, 7.0F);
/*      */     
/*  544 */     this.gunModel[111].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 4.0F, -0.5F, -1.25F, -1.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 2.0F, 0.0F, -1.25F);
/*  545 */     this.gunModel[111].setRotationPoint(-9.0F, -13.0F, 7.0F);
/*      */     
/*  547 */     this.gunModel[112].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -1.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -1.25F);
/*  548 */     this.gunModel[112].setRotationPoint(-9.0F, -9.0F, 7.0F);
/*      */     
/*  550 */     this.gunModel[113].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 4, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  551 */     this.gunModel[113].setRotationPoint(-10.5F, -9.0F, 2.5F);
/*      */     
/*  553 */     this.gunModel[114].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  554 */     this.gunModel[114].setRotationPoint(-12.5F, -12.5F, 2.5F);
/*      */     
/*  556 */     this.gunModel[115].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 4, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  557 */     this.gunModel[115].setRotationPoint(-10.5F, -12.5F, 2.5F);
/*      */     
/*  559 */     this.gunModel[116].addShapeBox(3.0F, -13.0F, -4.5F, 13, 2, 4, 0.0F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/*  560 */     this.gunModel[116].setRotationPoint(-10.0F, -5.5F, 2.5F);
/*      */     
/*  562 */     this.gunModel[117].addShapeBox(3.0F, -13.0F, -4.5F, 12, 3, 4, 0.0F, -0.75F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  563 */     this.gunModel[117].setRotationPoint(-10.5F, -4.5F, 2.5F);
/*      */     
/*  565 */     this.gunModel[118].addShapeBox(3.0F, -13.0F, -4.5F, 12, 5, 4, 0.0F, -1.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F);
/*  566 */     this.gunModel[118].setRotationPoint(-11.5F, -2.0F, 2.5F);
/*      */     
/*  568 */     this.gunModel[119].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  569 */     this.gunModel[119].setRotationPoint(-9.5F, -4.5F, 2.0F);
/*      */     
/*  571 */     this.gunModel[120].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.75F, -1.25F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  572 */     this.gunModel[120].setRotationPoint(-9.0F, -5.5F, 2.0F);
/*      */     
/*  574 */     this.gunModel[121].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/*  575 */     this.gunModel[121].setRotationPoint(-10.0F, -9.0F, 2.0F);
/*      */     
/*  577 */     this.gunModel[122].addShapeBox(3.0F, -13.0F, -4.5F, 1, 17, 1, 0.0F, -1.5F, -0.5F, -1.25F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, 4.0F, 0.0F, -1.25F, -4.0F, 0.0F, -0.75F, -4.0F, 0.0F, 0.25F, 4.0F, 0.0F, 0.25F);
/*  578 */     this.gunModel[122].setRotationPoint(-11.0F, -2.0F, 1.5F);
/*      */     
/*  580 */     this.gunModel[123].addShapeBox(3.0F, -13.0F, -4.5F, 1, 17, 4, 0.0F, -1.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.5F, -0.5F, -0.5F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -0.5F);
/*  581 */     this.gunModel[123].setRotationPoint(-11.0F, -2.0F, 2.75F);
/*      */     
/*  583 */     this.gunModel[124].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  584 */     this.gunModel[124].setRotationPoint(-12.0F, -11.5F, 2.0F);
/*      */     
/*  586 */     this.gunModel[125].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  587 */     this.gunModel[125].setRotationPoint(-14.0F, -13.0F, 2.0F);
/*      */     
/*  589 */     this.gunModel[126].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F);
/*  590 */     this.gunModel[126].setRotationPoint(-9.5F, -4.5F, 6.0F);
/*      */     
/*  592 */     this.gunModel[127].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F, 0.0F, 0.5F, -0.75F);
/*  593 */     this.gunModel[127].setRotationPoint(-9.0F, -5.5F, 6.0F);
/*      */     
/*  595 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F);
/*  596 */     this.gunModel[''].setRotationPoint(-10.0F, -9.0F, 6.0F);
/*      */     
/*  598 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, -2.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.75F);
/*  599 */     this.gunModel[''].setRotationPoint(-12.0F, -11.5F, 6.0F);
/*      */     
/*  601 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, -2.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.75F);
/*  602 */     this.gunModel[''].setRotationPoint(-14.0F, -13.0F, 6.0F);
/*      */     
/*  604 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 3, 0.0F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F);
/*  605 */     this.gunModel[''].setRotationPoint(-14.0F, -13.0F, 3.0F);
/*      */     
/*  607 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 0.25F);
/*  608 */     this.gunModel[''].setRotationPoint(-14.0F, -13.0F, 3.0F);
/*      */     
/*  610 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 15, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  611 */     this.gunModel[''].setRotationPoint(-9.0F, -14.5F, 7.5F);
/*      */     
/*  613 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -8.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  614 */     this.gunModel[''].setRotationPoint(1.0F, -14.5F, 7.5F);
/*      */     
/*  616 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -6.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F);
/*  617 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 7.5F);
/*      */     
/*  619 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -0.25F);
/*  620 */     this.gunModel[''].setRotationPoint(-5.0F, 11.5F, 7.5F);
/*      */     
/*  622 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.5F, -0.25F);
/*  623 */     this.gunModel[''].setRotationPoint(-8.0F, 11.5F, 7.5F);
/*      */     
/*  625 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.5F, 0.75F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  626 */     this.gunModel[''].setRotationPoint(-11.0F, 11.5F, 7.5F);
/*      */     
/*  628 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 1.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  629 */     this.gunModel[''].setRotationPoint(2.0F, -15.5F, 7.5F);
/*      */     
/*  631 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  632 */     this.gunModel[''].setRotationPoint(0.0F, -15.5F, 7.5F);
/*      */     
/*  634 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  635 */     this.gunModel[''].setRotationPoint(-3.0F, -15.5F, 7.5F);
/*      */     
/*  637 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 1.0F, -1.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  638 */     this.gunModel[''].setRotationPoint(-4.0F, -15.5F, 7.5F);
/*      */     
/*  640 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 15, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  641 */     this.gunModel[''].setRotationPoint(-9.0F, -14.5F, 0.5F);
/*      */     
/*  643 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -8.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  644 */     this.gunModel[''].setRotationPoint(1.0F, -14.5F, 0.5F);
/*      */     
/*  646 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -6.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 1.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  647 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 0.5F);
/*      */     
/*  649 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -1.5F, -0.25F, 1.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  650 */     this.gunModel[''].setRotationPoint(2.0F, -15.5F, 0.5F);
/*      */     
/*  652 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  653 */     this.gunModel[''].setRotationPoint(0.0F, -15.5F, 0.5F);
/*      */     
/*  655 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  656 */     this.gunModel[''].setRotationPoint(-3.0F, -15.5F, 0.5F);
/*      */     
/*  658 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.0F, -0.25F, 1.0F, -1.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  659 */     this.gunModel[''].setRotationPoint(-4.0F, -15.5F, 0.5F);
/*      */     
/*  661 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  662 */     this.gunModel[''].setRotationPoint(-5.0F, 11.5F, 0.5F);
/*      */     
/*  664 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.75F, -0.25F);
/*  665 */     this.gunModel[''].setRotationPoint(-8.0F, 11.5F, 0.5F);
/*      */     
/*  667 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.75F, -0.25F, 1.0F, -0.5F, -0.25F);
/*  668 */     this.gunModel[''].setRotationPoint(-11.0F, 11.5F, 0.5F);
/*      */     
/*  670 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  671 */     this.gunModel[''].setRotationPoint(-8.0F, -18.5F, 8.0F);
/*  672 */     this.gunModel[''].rotateAngleZ = -0.6457718F;
/*      */     
/*  674 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  675 */     this.gunModel[''].setRotationPoint(13.15F, -25.05F, 8.0F);
/*  676 */     this.gunModel[''].rotateAngleZ = -3.7873645F;
/*      */     
/*  678 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  679 */     this.gunModel[''].setRotationPoint(-8.0F, -18.5F, 0.5F);
/*  680 */     this.gunModel[''].rotateAngleZ = -0.6457718F;
/*      */     
/*  682 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  683 */     this.gunModel[''].setRotationPoint(13.15F, -25.05F, 0.5F);
/*  684 */     this.gunModel[''].rotateAngleZ = -3.7873645F;
/*      */     
/*  686 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  687 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 7.0F);
/*      */     
/*  689 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  690 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 1.0F);
/*      */     
/*  692 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 2, 0.0F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F);
/*  693 */     this.gunModel[''].setRotationPoint(6.5F, -7.0F, 6.35F);
/*      */     
/*  695 */     this.gunModel[' '].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 2, 0.0F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -1.25F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -1.25F, -0.25F);
/*  696 */     this.gunModel[' '].setRotationPoint(5.5F, -18.5F, 6.35F);
/*      */     
/*  698 */     this.gunModel['¡'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.75F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.25F, 0.75F, -1.25F, -0.25F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F);
/*  699 */     this.gunModel['¡'].setRotationPoint(13.5F, -17.75F, 6.35F);
/*      */     
/*  701 */     this.gunModel['¢'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.25F, -1.5F, -0.75F, -0.5F, -1.5F, -0.75F, -0.5F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/*  702 */     this.gunModel['¢'].setRotationPoint(13.0F, -17.25F, 6.35F);
/*      */     
/*  704 */     this.gunModel['£'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.75F, -1.25F, -0.75F, -1.0F, -1.25F, -0.75F, -1.0F, -1.25F, -0.25F, 0.75F, -1.25F, -0.25F, 0.75F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F);
/*  705 */     this.gunModel['£'].setRotationPoint(13.5F, -18.5F, 6.35F);
/*      */     
/*  707 */     this.gunModel['¤'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/*  708 */     this.gunModel['¤'].setRotationPoint(13.0F, -19.25F, 6.35F);
/*      */     
/*  710 */     this.gunModel['¥'].addShapeBox(3.0F, -13.0F, -4.5F, 4, 3, 2, 0.0F, 0.25F, -0.75F, -1.1F, 0.25F, -0.75F, -1.1F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -1.25F, -1.1F, 0.25F, -0.75F, -1.1F, 0.25F, -1.0F, -0.25F, 0.25F, -1.5F, -0.25F);
/*  711 */     this.gunModel['¥'].setRotationPoint(5.5F, -18.5F, 7.0F);
/*      */     
/*  713 */     this.gunModel['¦'].addShapeBox(3.0F, -13.0F, -4.5F, 9, 2, 2, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  714 */     this.gunModel['¦'].setRotationPoint(-4.5F, -17.75F, 6.35F);
/*      */     
/*  716 */     this.gunModel['§'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 2, 2, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  717 */     this.gunModel['§'].setRotationPoint(-12.5F, -18.75F, 6.35F);
/*      */     
/*  719 */     this.gunModel['¨'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  720 */     this.gunModel['¨'].setRotationPoint(-6.5F, -18.75F, 6.35F);
/*      */     
/*  722 */     this.gunModel['©'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  723 */     this.gunModel['©'].setRotationPoint(-12.5F, -16.75F, 6.35F);
/*      */     
/*  725 */     this.gunModel['ª'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F);
/*  726 */     this.gunModel['ª'].setRotationPoint(-12.5F, -16.25F, 6.35F);
/*      */     
/*  728 */     this.gunModel['«'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  729 */     this.gunModel['«'].setRotationPoint(-11.0F, -15.25F, 6.35F);
/*      */     
/*  731 */     this.gunModel['¬'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -1.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F);
/*  732 */     this.gunModel['¬'].setRotationPoint(-11.0F, -14.25F, 6.35F);
/*      */     
/*  734 */     this.gunModel['­'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  735 */     this.gunModel['­'].setRotationPoint(-6.5F, -17.75F, 6.35F);
/*      */     
/*  737 */     this.gunModel['®'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  738 */     this.gunModel['®'].setRotationPoint(-6.5F, -16.75F, 6.35F);
/*      */     
/*  740 */     this.gunModel['¯'].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.5F, -1.5F, -0.75F, 0.5F, -1.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  741 */     this.gunModel['¯'].setRotationPoint(-10.0F, -14.25F, 6.35F);
/*      */     
/*  743 */     this.gunModel['°'].addShapeBox(3.0F, -13.0F, -4.5F, 4, 2, 2, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
/*  744 */     this.gunModel['°'].setRotationPoint(-10.5F, -16.25F, 6.35F);
/*      */     
/*  746 */     this.gunModel['±'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  747 */     this.gunModel['±'].setRotationPoint(-11.5F, -16.25F, 6.35F);
/*      */     
/*  749 */     this.gunModel['²'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  750 */     this.gunModel['²'].setRotationPoint(-7.0F, -17.25F, 7.35F);
/*      */     
/*  752 */     this.gunModel['³'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/*  753 */     this.gunModel['³'].setRotationPoint(-19.25F, -16.0F, 3.5F);
/*      */     
/*  755 */     this.gunModel['´'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F);
/*  756 */     this.gunModel['´'].setRotationPoint(-19.25F, -17.0F, 3.5F);
/*      */     
/*  758 */     this.gunModel['µ'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/*  759 */     this.gunModel['µ'].setRotationPoint(-19.25F, -17.5F, 3.5F);
/*      */     
/*  761 */     this.gunModel['¶'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -2.1F, 0.45F, -0.25F, 0.0F, 0.45F, -0.25F, 0.0F, 0.45F, -0.25F, -2.1F, 0.45F, -0.25F);
/*  762 */     this.gunModel['¶'].setRotationPoint(-19.25F, -15.5F, 3.5F);
/*      */     
/*  764 */     this.gunModel['·'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  765 */     this.gunModel['·'].setRotationPoint(-12.0F, -4.5F, 0.5F);
/*  766 */     this.gunModel['·'].rotateAngleZ = -0.6457718F;
/*      */     
/*  768 */     this.gunModel['¸'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  769 */     this.gunModel['¸'].setRotationPoint(9.15F, -11.05F, 0.5F);
/*  770 */     this.gunModel['¸'].rotateAngleZ = -3.7873645F;
/*      */     
/*  772 */     this.gunModel['¹'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  773 */     this.gunModel['¹'].setRotationPoint(-12.0F, -4.5F, 8.0F);
/*  774 */     this.gunModel['¹'].rotateAngleZ = -0.6457718F;
/*      */     
/*  776 */     this.gunModel['º'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  777 */     this.gunModel['º'].setRotationPoint(9.15F, -11.05F, 8.0F);
/*  778 */     this.gunModel['º'].rotateAngleZ = -3.7873645F;
/*      */     
/*  780 */     this.gunModel['»'].addShapeBox(3.0F, -13.0F, -4.5F, 10, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  781 */     this.gunModel['»'].setRotationPoint(37.0F, -20.2F, 3.0F);
/*      */     
/*      */ 
/*  784 */     this.ammoModel = new ModelRendererTurbo[2];
/*  785 */     this.ammoModel[0] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  786 */     this.ammoModel[1] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*      */     
/*  788 */     this.ammoModel[0].addShapeBox(3.0F, -13.0F, -4.5F, 9, 17, 5, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 4.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F);
/*  789 */     this.ammoModel[0].setRotationPoint(-9.0F, -2.0F, 2.0F);
/*      */     
/*  791 */     this.ammoModel[1].addShapeBox(3.0F, -13.0F, -4.5F, 9, 25, 5, 0.0F, -1.0F, -0.5F, -0.25F, 5.0F, -0.5F, -0.25F, 5.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 5.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 5.0F, 0.0F, -0.25F);
/*  792 */     this.ammoModel[1].setRotationPoint(-7.5F, -10.5F, 2.0F);
/*      */     
/*      */ 
/*  795 */     this.slideModel = new ModelRendererTurbo[120];
/*  796 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  797 */     this.slideModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  798 */     this.slideModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  799 */     this.slideModel[3] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  800 */     this.slideModel[4] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  801 */     this.slideModel[5] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  802 */     this.slideModel[6] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  803 */     this.slideModel[7] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  804 */     this.slideModel[8] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  805 */     this.slideModel[9] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  806 */     this.slideModel[10] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  807 */     this.slideModel[11] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  808 */     this.slideModel[12] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  809 */     this.slideModel[13] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  810 */     this.slideModel[14] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  811 */     this.slideModel[15] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  812 */     this.slideModel[16] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  813 */     this.slideModel[17] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  814 */     this.slideModel[18] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  815 */     this.slideModel[19] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  816 */     this.slideModel[20] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  817 */     this.slideModel[21] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  818 */     this.slideModel[22] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  819 */     this.slideModel[23] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  820 */     this.slideModel[24] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  821 */     this.slideModel[25] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  822 */     this.slideModel[26] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  823 */     this.slideModel[27] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  824 */     this.slideModel[28] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  825 */     this.slideModel[29] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  826 */     this.slideModel[30] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  827 */     this.slideModel[31] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  828 */     this.slideModel[32] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  829 */     this.slideModel[33] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  830 */     this.slideModel[34] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  831 */     this.slideModel[35] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  832 */     this.slideModel[36] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  833 */     this.slideModel[37] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  834 */     this.slideModel[38] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  835 */     this.slideModel[39] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  836 */     this.slideModel[40] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  837 */     this.slideModel[41] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  838 */     this.slideModel[42] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  839 */     this.slideModel[43] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  840 */     this.slideModel[44] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  841 */     this.slideModel[45] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  842 */     this.slideModel[46] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  843 */     this.slideModel[47] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  844 */     this.slideModel[48] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  845 */     this.slideModel[49] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  846 */     this.slideModel[50] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  847 */     this.slideModel[51] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  848 */     this.slideModel[52] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  849 */     this.slideModel[53] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  850 */     this.slideModel[54] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  851 */     this.slideModel[55] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  852 */     this.slideModel[56] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  853 */     this.slideModel[57] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  854 */     this.slideModel[58] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  855 */     this.slideModel[59] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  856 */     this.slideModel[60] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  857 */     this.slideModel[61] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  858 */     this.slideModel[62] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*  859 */     this.slideModel[63] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*  860 */     this.slideModel[64] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/*  861 */     this.slideModel[65] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  862 */     this.slideModel[66] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  863 */     this.slideModel[67] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  864 */     this.slideModel[68] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*  865 */     this.slideModel[69] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  866 */     this.slideModel[70] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  867 */     this.slideModel[71] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*  868 */     this.slideModel[72] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  869 */     this.slideModel[73] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*  870 */     this.slideModel[74] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/*  871 */     this.slideModel[75] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  872 */     this.slideModel[76] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  873 */     this.slideModel[77] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  874 */     this.slideModel[78] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  875 */     this.slideModel[79] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  876 */     this.slideModel[80] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/*  877 */     this.slideModel[81] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  878 */     this.slideModel[82] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  879 */     this.slideModel[83] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  880 */     this.slideModel[84] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/*  881 */     this.slideModel[85] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  882 */     this.slideModel[86] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  883 */     this.slideModel[87] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  884 */     this.slideModel[88] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  885 */     this.slideModel[89] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  886 */     this.slideModel[90] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*  887 */     this.slideModel[91] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/*  888 */     this.slideModel[92] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/*  889 */     this.slideModel[93] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  890 */     this.slideModel[94] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  891 */     this.slideModel[95] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/*  892 */     this.slideModel[96] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  893 */     this.slideModel[97] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  894 */     this.slideModel[98] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  895 */     this.slideModel[99] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  896 */     this.slideModel[100] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  897 */     this.slideModel[101] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/*  898 */     this.slideModel[102] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  899 */     this.slideModel[103] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/*  900 */     this.slideModel[104] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/*  901 */     this.slideModel[105] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  902 */     this.slideModel[106] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*  903 */     this.slideModel[107] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  904 */     this.slideModel[108] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/*  905 */     this.slideModel[109] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/*  906 */     this.slideModel[110] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/*  907 */     this.slideModel[111] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*  908 */     this.slideModel[112] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  909 */     this.slideModel[113] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/*  910 */     this.slideModel[114] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  911 */     this.slideModel[115] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  912 */     this.slideModel[116] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/*  913 */     this.slideModel[117] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*  914 */     this.slideModel[118] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*  915 */     this.slideModel[119] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/*      */     
/*  917 */     this.slideModel[0].addBox(3.0F, -13.0F, -4.5F, 7, 6, 7, 0.0F);
/*  918 */     this.slideModel[0].setRotationPoint(4.0F, -25.2F, 1.0F);
/*      */     
/*  920 */     this.slideModel[1].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  921 */     this.slideModel[1].setRotationPoint(-6.0F, -25.2F, 7.0F);
/*      */     
/*  923 */     this.slideModel[2].addShapeBox(3.0F, -13.0F, -4.5F, 10, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  924 */     this.slideModel[2].setRotationPoint(37.0F, -21.2F, 2.0F);
/*      */     
/*  926 */     this.slideModel[3].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  927 */     this.slideModel[3].setRotationPoint(43.5F, -27.5F, 4.0F);
/*      */     
/*  929 */     this.slideModel[4].addBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F);
/*  930 */     this.slideModel[4].setRotationPoint(-5.0F, -27.5F, 3.0F);
/*      */     
/*  932 */     this.slideModel[5].addBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F);
/*  933 */     this.slideModel[5].setRotationPoint(-5.0F, -27.5F, 5.0F);
/*      */     
/*  935 */     this.slideModel[6].addBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F);
/*  936 */     this.slideModel[6].setRotationPoint(-5.0F, -27.0F, 4.0F);
/*      */     
/*  938 */     this.slideModel[7].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  939 */     this.slideModel[7].setRotationPoint(-6.0F, -27.5F, 5.0F);
/*      */     
/*  941 */     this.slideModel[8].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  942 */     this.slideModel[8].setRotationPoint(-6.0F, -27.5F, 3.0F);
/*      */     
/*  944 */     this.slideModel[9].addBox(3.0F, -13.0F, -4.5F, 47, 2, 1, 0.0F);
/*  945 */     this.slideModel[9].setRotationPoint(-10.0F, -19.5F, 1.5F);
/*      */     
/*  947 */     this.slideModel[10].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  948 */     this.slideModel[10].setRotationPoint(47.0F, -20.2F, 2.0F);
/*      */     
/*  950 */     this.slideModel[11].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  951 */     this.slideModel[11].setRotationPoint(47.0F, -20.2F, 6.0F);
/*      */     
/*  953 */     this.slideModel[12].addShapeBox(3.0F, -13.0F, -4.5F, 39, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  954 */     this.slideModel[12].setRotationPoint(9.0F, -18.2F, 3.5F);
/*      */     
/*  956 */     this.slideModel[13].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  957 */     this.slideModel[13].setRotationPoint(47.0F, -20.2F, 3.5F);
/*      */     
/*  959 */     this.slideModel[14].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  960 */     this.slideModel[14].setRotationPoint(-5.0F, -25.2F, 7.0F);
/*      */     
/*  962 */     this.slideModel[15].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  963 */     this.slideModel[15].setRotationPoint(-3.0F, -25.2F, 7.0F);
/*      */     
/*  965 */     this.slideModel[16].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  966 */     this.slideModel[16].setRotationPoint(-4.0F, -25.2F, 7.0F);
/*      */     
/*  968 */     this.slideModel[17].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  969 */     this.slideModel[17].setRotationPoint(-2.0F, -25.2F, 7.0F);
/*      */     
/*  971 */     this.slideModel[18].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  972 */     this.slideModel[18].setRotationPoint(1.0F, -25.2F, 7.0F);
/*      */     
/*  974 */     this.slideModel[19].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  975 */     this.slideModel[19].setRotationPoint(0.0F, -25.2F, 7.0F);
/*      */     
/*  977 */     this.slideModel[20].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  978 */     this.slideModel[20].setRotationPoint(-1.0F, -25.2F, 7.0F);
/*      */     
/*  980 */     this.slideModel[21].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  981 */     this.slideModel[21].setRotationPoint(3.0F, -25.2F, 7.0F);
/*      */     
/*  983 */     this.slideModel[22].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  984 */     this.slideModel[22].setRotationPoint(2.0F, -25.2F, 7.0F);
/*      */     
/*  986 */     this.slideModel[23].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  987 */     this.slideModel[23].setRotationPoint(-6.0F, -25.2F, 1.0F);
/*      */     
/*  989 */     this.slideModel[24].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  990 */     this.slideModel[24].setRotationPoint(-5.0F, -25.2F, 1.0F);
/*      */     
/*  992 */     this.slideModel[25].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  993 */     this.slideModel[25].setRotationPoint(-4.0F, -25.2F, 1.0F);
/*      */     
/*  995 */     this.slideModel[26].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  996 */     this.slideModel[26].setRotationPoint(-3.0F, -25.2F, 1.0F);
/*      */     
/*  998 */     this.slideModel[27].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  999 */     this.slideModel[27].setRotationPoint(-2.0F, -25.2F, 1.0F);
/*      */     
/* 1001 */     this.slideModel[28].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1002 */     this.slideModel[28].setRotationPoint(0.0F, -25.2F, 1.0F);
/*      */     
/* 1004 */     this.slideModel[29].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1005 */     this.slideModel[29].setRotationPoint(-1.0F, -25.2F, 1.0F);
/*      */     
/* 1007 */     this.slideModel[30].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1008 */     this.slideModel[30].setRotationPoint(1.0F, -25.2F, 1.0F);
/*      */     
/* 1010 */     this.slideModel[31].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1011 */     this.slideModel[31].setRotationPoint(2.0F, -25.2F, 1.0F);
/*      */     
/* 1013 */     this.slideModel[32].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1014 */     this.slideModel[32].setRotationPoint(3.0F, -25.2F, 1.0F);
/*      */     
/* 1016 */     this.slideModel[33].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1017 */     this.slideModel[33].setRotationPoint(4.0F, -26.2F, 1.0F);
/*      */     
/* 1019 */     this.slideModel[34].addShapeBox(3.0F, -13.0F, -4.5F, 21, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1020 */     this.slideModel[34].setRotationPoint(-10.5F, -26.7F, 2.5F);
/*      */     
/* 1022 */     this.slideModel[35].addShapeBox(3.0F, -13.0F, -4.5F, 21, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1023 */     this.slideModel[35].setRotationPoint(-10.5F, -26.7F, 4.5F);
/*      */     
/* 1025 */     this.slideModel[36].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1026 */     this.slideModel[36].setRotationPoint(4.0F, -26.2F, 6.5F);
/*      */     
/* 1028 */     this.slideModel[37].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1029 */     this.slideModel[37].setRotationPoint(-6.0F, -26.2F, 6.5F);
/*      */     
/* 1031 */     this.slideModel[38].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1032 */     this.slideModel[38].setRotationPoint(-6.0F, -26.2F, 1.0F);
/*      */     
/* 1034 */     this.slideModel[39].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1035 */     this.slideModel[39].setRotationPoint(-5.0F, -26.2F, 1.0F);
/*      */     
/* 1037 */     this.slideModel[40].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1038 */     this.slideModel[40].setRotationPoint(-5.0F, -26.2F, 6.5F);
/*      */     
/* 1040 */     this.slideModel[41].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1041 */     this.slideModel[41].setRotationPoint(-3.0F, -26.2F, 1.0F);
/*      */     
/* 1043 */     this.slideModel[42].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1044 */     this.slideModel[42].setRotationPoint(-3.0F, -26.2F, 6.5F);
/*      */     
/* 1046 */     this.slideModel[43].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1047 */     this.slideModel[43].setRotationPoint(-4.0F, -26.2F, 6.5F);
/*      */     
/* 1049 */     this.slideModel[44].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1050 */     this.slideModel[44].setRotationPoint(-4.0F, -26.2F, 1.0F);
/*      */     
/* 1052 */     this.slideModel[45].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1053 */     this.slideModel[45].setRotationPoint(-1.0F, -26.2F, 1.0F);
/*      */     
/* 1055 */     this.slideModel[46].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1056 */     this.slideModel[46].setRotationPoint(-1.0F, -26.2F, 6.5F);
/*      */     
/* 1058 */     this.slideModel[47].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1059 */     this.slideModel[47].setRotationPoint(-2.0F, -26.2F, 6.5F);
/*      */     
/* 1061 */     this.slideModel[48].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1062 */     this.slideModel[48].setRotationPoint(-2.0F, -26.2F, 1.0F);
/*      */     
/* 1064 */     this.slideModel[49].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1065 */     this.slideModel[49].setRotationPoint(1.0F, -26.2F, 1.0F);
/*      */     
/* 1067 */     this.slideModel[50].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1068 */     this.slideModel[50].setRotationPoint(1.0F, -26.2F, 6.5F);
/*      */     
/* 1070 */     this.slideModel[51].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1071 */     this.slideModel[51].setRotationPoint(0.0F, -26.2F, 6.5F);
/*      */     
/* 1073 */     this.slideModel[52].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1074 */     this.slideModel[52].setRotationPoint(0.0F, -26.2F, 1.0F);
/*      */     
/* 1076 */     this.slideModel[53].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1077 */     this.slideModel[53].setRotationPoint(3.0F, -26.2F, 1.0F);
/*      */     
/* 1079 */     this.slideModel[54].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1080 */     this.slideModel[54].setRotationPoint(3.0F, -26.2F, 6.5F);
/*      */     
/* 1082 */     this.slideModel[55].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1083 */     this.slideModel[55].setRotationPoint(2.0F, -26.2F, 6.5F);
/*      */     
/* 1085 */     this.slideModel[56].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1086 */     this.slideModel[56].setRotationPoint(2.0F, -26.2F, 1.0F);
/*      */     
/* 1088 */     this.slideModel[57].addShapeBox(3.0F, -13.0F, -4.5F, 12, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1089 */     this.slideModel[57].setRotationPoint(-1.0F, -25.2F, 2.5F);
/*      */     
/* 1091 */     this.slideModel[58].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1092 */     this.slideModel[58].setRotationPoint(40.5F, -27.5F, 4.0F);
/*      */     
/* 1094 */     this.slideModel[59].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1095 */     this.slideModel[59].setRotationPoint(42.5F, -27.5F, 4.0F);
/*      */     
/* 1097 */     this.slideModel[60].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1098 */     this.slideModel[60].setRotationPoint(2.5F, -26.2F, 6.5F);
/*      */     
/* 1100 */     this.slideModel[61].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1101 */     this.slideModel[61].setRotationPoint(3.5F, -26.2F, 6.5F);
/*      */     
/* 1103 */     this.slideModel[62].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1104 */     this.slideModel[62].setRotationPoint(1.5F, -26.2F, 6.5F);
/*      */     
/* 1106 */     this.slideModel[63].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1107 */     this.slideModel[63].setRotationPoint(0.5F, -26.2F, 6.5F);
/*      */     
/* 1109 */     this.slideModel[64].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1110 */     this.slideModel[64].setRotationPoint(-2.5F, -26.2F, 6.5F);
/*      */     
/* 1112 */     this.slideModel[65].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1113 */     this.slideModel[65].setRotationPoint(-3.5F, -26.2F, 6.5F);
/*      */     
/* 1115 */     this.slideModel[66].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1116 */     this.slideModel[66].setRotationPoint(-1.5F, -26.2F, 6.5F);
/*      */     
/* 1118 */     this.slideModel[67].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1119 */     this.slideModel[67].setRotationPoint(-0.5F, -26.2F, 6.5F);
/*      */     
/* 1121 */     this.slideModel[68].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1122 */     this.slideModel[68].setRotationPoint(-5.5F, -26.2F, 6.5F);
/*      */     
/* 1124 */     this.slideModel[69].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1125 */     this.slideModel[69].setRotationPoint(-4.5F, -26.2F, 6.5F);
/*      */     
/* 1127 */     this.slideModel[70].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1128 */     this.slideModel[70].setRotationPoint(3.5F, -26.2F, 1.5F);
/*      */     
/* 1130 */     this.slideModel[71].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1131 */     this.slideModel[71].setRotationPoint(2.5F, -26.2F, 1.5F);
/*      */     
/* 1133 */     this.slideModel[72].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1134 */     this.slideModel[72].setRotationPoint(0.5F, -26.2F, 1.5F);
/*      */     
/* 1136 */     this.slideModel[73].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1137 */     this.slideModel[73].setRotationPoint(1.5F, -26.2F, 1.5F);
/*      */     
/* 1139 */     this.slideModel[74].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1140 */     this.slideModel[74].setRotationPoint(-1.5F, -26.2F, 1.5F);
/*      */     
/* 1142 */     this.slideModel[75].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1143 */     this.slideModel[75].setRotationPoint(-0.5F, -26.2F, 1.5F);
/*      */     
/* 1145 */     this.slideModel[76].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1146 */     this.slideModel[76].setRotationPoint(-3.5F, -26.2F, 1.5F);
/*      */     
/* 1148 */     this.slideModel[77].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1149 */     this.slideModel[77].setRotationPoint(-2.5F, -26.2F, 1.5F);
/*      */     
/* 1151 */     this.slideModel[78].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1152 */     this.slideModel[78].setRotationPoint(-5.5F, -26.2F, 1.5F);
/*      */     
/* 1154 */     this.slideModel[79].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1155 */     this.slideModel[79].setRotationPoint(-4.5F, -26.2F, 1.5F);
/*      */     
/* 1157 */     this.slideModel[80].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1158 */     this.slideModel[80].setRotationPoint(-4.0F, -27.5F, 5.0F);
/*      */     
/* 1160 */     this.slideModel[81].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1161 */     this.slideModel[81].setRotationPoint(-4.0F, -27.5F, 3.0F);
/*      */     
/* 1163 */     this.slideModel[82].addShapeBox(3.0F, -13.0F, -4.5F, 11, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1164 */     this.slideModel[82].setRotationPoint(37.0F, -25.2F, 1.0F);
/*      */     
/* 1166 */     this.slideModel[83].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1167 */     this.slideModel[83].setRotationPoint(39.0F, -20.7F, 1.0F);
/*      */     
/* 1169 */     this.slideModel[84].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1170 */     this.slideModel[84].setRotationPoint(-6.5F, -26.2F, 6.5F);
/*      */     
/* 1172 */     this.slideModel[85].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1173 */     this.slideModel[85].setRotationPoint(-6.5F, -26.2F, 1.5F);
/*      */     
/* 1175 */     this.slideModel[86].addShapeBox(3.0F, -13.0F, -4.5F, 4, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1176 */     this.slideModel[86].setRotationPoint(-10.5F, -25.2F, 1.0F);
/*      */     
/* 1178 */     this.slideModel[87].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1179 */     this.slideModel[87].setRotationPoint(-10.5F, -26.2F, 6.5F);
/*      */     
/* 1181 */     this.slideModel[88].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1182 */     this.slideModel[88].setRotationPoint(-10.5F, -26.2F, 1.0F);
/*      */     
/* 1184 */     this.slideModel[89].addBox(3.0F, -13.0F, -4.5F, 10, 1, 3, 0.0F);
/* 1185 */     this.slideModel[89].setRotationPoint(38.0F, -16.2F, 3.0F);
/*      */     
/* 1187 */     this.slideModel[90].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1188 */     this.slideModel[90].setRotationPoint(37.0F, -16.2F, 2.0F);
/*      */     
/* 1190 */     this.slideModel[91].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1191 */     this.slideModel[91].setRotationPoint(37.0F, -16.2F, 6.0F);
/*      */     
/* 1193 */     this.slideModel[92].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1194 */     this.slideModel[92].setRotationPoint(37.0F, -15.2F, 3.0F);
/*      */     
/* 1196 */     this.slideModel[93].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F);
/* 1197 */     this.slideModel[93].setRotationPoint(37.0F, -15.2F, 4.5F);
/*      */     
/* 1199 */     this.slideModel[94].addBox(3.0F, -13.0F, -4.5F, 18, 6, 7, 0.0F);
/* 1200 */     this.slideModel[94].setRotationPoint(19.0F, -25.2F, 1.0F);
/*      */     
/* 1202 */     this.slideModel[95].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1203 */     this.slideModel[95].setRotationPoint(19.0F, -26.2F, 6.5F);
/*      */     
/* 1205 */     this.slideModel[96].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1206 */     this.slideModel[96].setRotationPoint(19.0F, -26.7F, 4.5F);
/*      */     
/* 1208 */     this.slideModel[97].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1209 */     this.slideModel[97].setRotationPoint(19.0F, -26.7F, 2.5F);
/*      */     
/* 1211 */     this.slideModel[98].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1212 */     this.slideModel[98].setRotationPoint(19.0F, -26.2F, 1.0F);
/*      */     
/* 1214 */     this.slideModel[99].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1215 */     this.slideModel[99].setRotationPoint(20.0F, -25.2F, 2.5F);
/*      */     
/* 1217 */     this.slideModel[100].addShapeBox(3.0F, -13.0F, -4.5F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1218 */     this.slideModel[100].setRotationPoint(11.0F, -23.2F, 1.0F);
/*      */     
/* 1220 */     this.slideModel[101].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1221 */     this.slideModel[101].setRotationPoint(11.0F, -26.2F, 6.5F);
/*      */     
/* 1223 */     this.slideModel[102].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, -0.0625F, -0.25F, 0.0F, -0.0625F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1224 */     this.slideModel[102].setRotationPoint(11.0F, -26.7F, 4.5F);
/*      */     
/* 1226 */     this.slideModel[103].addBox(3.0F, -13.0F, -4.5F, 8, 6, 1, 0.0F);
/* 1227 */     this.slideModel[103].setRotationPoint(11.0F, -25.2F, 7.0F);
/*      */     
/* 1229 */     this.slideModel[104].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1230 */     this.slideModel[104].setRotationPoint(11.0F, -26.0F, 3.0F);
/*      */     
/* 1232 */     this.slideModel[105].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1233 */     this.slideModel[105].setRotationPoint(11.0F, -25.5F, 1.5F);
/*      */     
/* 1235 */     this.slideModel[106].addShapeBox(3.0F, -13.0F, -4.5F, 8, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1236 */     this.slideModel[106].setRotationPoint(11.0F, -25.2F, 5.0F);
/*      */     
/* 1238 */     this.slideModel[107].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F);
/* 1239 */     this.slideModel[107].setRotationPoint(-11.5F, -26.2F, 6.5F);
/*      */     
/* 1241 */     this.slideModel[108].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1242 */     this.slideModel[108].setRotationPoint(-11.5F, -26.7F, 4.5F);
/*      */     
/* 1244 */     this.slideModel[109].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1245 */     this.slideModel[109].setRotationPoint(-11.5F, -26.7F, 2.5F);
/*      */     
/* 1247 */     this.slideModel[110].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F);
/* 1248 */     this.slideModel[110].setRotationPoint(-11.5F, -26.2F, 1.0F);
/*      */     
/* 1250 */     this.slideModel[111].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1251 */     this.slideModel[111].setRotationPoint(37.0F, -19.95F, 1.0F);
/*      */     
/* 1253 */     this.slideModel[112].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1254 */     this.slideModel[112].setRotationPoint(37.0F, -20.7F, 1.0F);
/*      */     
/* 1256 */     this.slideModel[113].addShapeBox(3.0F, -13.0F, -4.5F, 1, 4, 2, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 1.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -0.5F, 1.25F, 0.15F, -0.5F);
/* 1257 */     this.slideModel[113].setRotationPoint(-11.5F, -23.2F, 1.0F);
/*      */     
/* 1259 */     this.slideModel[114].addShapeBox(3.0F, -13.0F, -4.5F, 4, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F);
/* 1260 */     this.slideModel[114].setRotationPoint(-10.5F, -21.7F, 1.0F);
/*      */     
/* 1262 */     this.slideModel[115].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1263 */     this.slideModel[115].setRotationPoint(-10.5F, -20.2F, 5.0F);
/*      */     
/* 1265 */     this.slideModel[116].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1266 */     this.slideModel[116].setRotationPoint(-8.5F, -20.2F, 5.0F);
/*      */     
/* 1268 */     this.slideModel[117].addShapeBox(3.0F, -13.0F, -4.5F, 1, 4, 2, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 1.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -0.5F, 1.25F, 0.15F, -0.5F);
/* 1269 */     this.slideModel[117].setRotationPoint(-11.5F, -23.2F, 6.5F);
/*      */     
/* 1271 */     this.slideModel[118].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1272 */     this.slideModel[118].setRotationPoint(-10.5F, -21.2F, 5.0F);
/*      */     
/* 1274 */     this.slideModel[119].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1275 */     this.slideModel[119].setRotationPoint(37.0F, -26.2F, 2.5F);
/*      */     
/*      */ 
/*      */ 
/* 1279 */     translateAll(0.0F, -13.0F, 0.0F);
/* 1280 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*      */     
/*      */ 
/* 1283 */     this.gunSlideDistance = 1.5F;
/* 1284 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 1286 */     this.tiltGun = 7.0F;
/* 1287 */     this.rotateGunVertical = 3.0F;
/* 1288 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*      */     
/* 1290 */     this.rotateClipVertical = 5.0F;
/* 1291 */     this.translateClip = new Vector3f(0.0F, -16.0F, 0.0F);
/*      */     
/*      */ 
/*      */ 
/* 1295 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm1911.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */