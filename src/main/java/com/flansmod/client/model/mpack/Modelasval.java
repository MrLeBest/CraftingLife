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
/*      */ public class Modelasval
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelasval()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ƴ'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 177, 73, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 449, 73, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 241, 81, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 41, 105, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 113, 121, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 137, 129, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 481, 121, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 249, 129, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 345, 121, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 313, 129, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 361, 129, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 409, 129, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 49, 137, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 329, 137, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 457, 129, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 481, 137, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 81, 145, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 113, 145, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 209, 145, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 241, 145, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 361, 145, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 305, 145, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 57, 153, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 361, 161, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 473, 153, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 57, 169, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 81, 169, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 409, 169, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 177, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 81, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 121, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 177, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 177, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 185, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 177, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 185, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 185, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 185, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 185, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 185, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 193, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 193, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 137, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 153, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 185, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 97, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 97, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 249, 105, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 489, 113, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 145, 153, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 265, 185, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 193, 145, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 449, 169, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 177, 129, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 129, 185, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 185, 193, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 217, 193, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 241, 193, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 321, 193, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 345, 193, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 361, 193, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 385, 193, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 409, 193, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 433, 193, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 457, 193, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 481, 193, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 33, 201, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 57, 201, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 113, 201, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 145, 201, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 257, 201, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 281, 201, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 449, 129, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 353, 201, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 377, 201, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 401, 201, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 425, 201, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 449, 201, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 481, 201, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 49, 209, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 105, 209, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 185, 209, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 209, 209, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 233, 209, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 297, 209, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 321, 209, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 1, 217, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 65, 217, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 137, 217, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 249, 217, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 25, 217, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 89, 217, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 73, 169, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 241, 81, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 81, 97, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 121, 97, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 329, 97, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 345, 97, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 505, 121, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 329, 129, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 337, 129, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 313, 217, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 273, 217, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 449, 217, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 473, 217, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 49, 153, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 449, 73, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 33, 113, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 305, 81, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 105, 129, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 505, 137, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 129, 145, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 401, 145, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 465, 145, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 321, 145, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 73, 153, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 161, 217, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 177, 233, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 489, 217, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 49, 225, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 113, 225, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 449, 225, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 473, 225, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 65, 233, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 129, 233, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 321, 233, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 473, 153, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 233, 153, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 497, 153, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 161, 161, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 225, 161, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 345, 233, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  350 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 385, 177, this.textureX, this.textureY);
/*  351 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  353 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  355 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 369, 233, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 393, 233, this.textureX, this.textureY);
/*  359 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 417, 233, this.textureX, this.textureY);
/*  360 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 17, 241, this.textureX, this.textureY);
/*  361 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 89, 241, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 425, 169, this.textureX, this.textureY);
/*  363 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  365 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 65, 225, this.textureX, this.textureY);
/*  367 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 441, 241, this.textureX, this.textureY);
/*  369 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  371 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 217, 177, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 225, 225, this.textureX, this.textureY);
/*  373 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 65, 209, this.textureX, this.textureY);
/*  374 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 489, 233, this.textureX, this.textureY);
/*  375 */     this.gunModel['š'] = new ModelRendererTurbo(this, 145, 241, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 473, 241, this.textureX, this.textureY);
/*  377 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 177, 225, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 281, 225, this.textureX, this.textureY);
/*  379 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 73, 249, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 105, 249, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 353, 161, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 273, 201, this.textureX, this.textureY);
/*  383 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*  385 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 313, 201, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 169, 153, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 505, 161, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 73, 169, this.textureX, this.textureY);
/*  389 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 97, 169, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  391 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 129, 249, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 161, 249, this.textureX, this.textureY);
/*  393 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 209, 193, this.textureX, this.textureY);
/*  397 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 233, 193, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 177, 249, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 201, 249, this.textureX, this.textureY);
/*  400 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 225, 249, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 249, 249, this.textureX, this.textureY);
/*  402 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 273, 249, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 297, 249, this.textureX, this.textureY);
/*  404 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 321, 249, this.textureX, this.textureY);
/*  405 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 345, 249, this.textureX, this.textureY);
/*  406 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 369, 249, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 17, 257, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 177, 257, this.textureX, this.textureY);
/*  409 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 273, 257, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 385, 257, this.textureX, this.textureY);
/*  411 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 145, 233, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 433, 233, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 465, 225, this.textureX, this.textureY);
/*  414 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 393, 249, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 433, 249, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 113, 265, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 153, 265, this.textureX, this.textureY);
/*  418 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 185, 265, this.textureX, this.textureY);
/*  419 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 489, 249, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 241, 265, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 337, 201, this.textureX, this.textureY);
/*  424 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 369, 201, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 25, 209, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  427 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  431 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 113, 257, this.textureX, this.textureY);
/*  432 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 65, 273, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 313, 193, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 393, 201, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 417, 201, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 337, 193, this.textureX, this.textureY);
/*  439 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 505, 193, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 505, 209, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 57, 169, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 497, 257, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 121, 273, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 441, 201, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 105, 201, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 505, 169, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 169, 273, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/*  454 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 9, 89, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/*      */     
/*  459 */     this.gunModel[0].addShapeBox(25.0F, -6.0F, -7.0F, 21, 10, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  460 */     this.gunModel[0].setRotationPoint(3.0F, -15.0F, 1.5F);
/*      */     
/*  462 */     this.gunModel[1].addShapeBox(25.0F, -6.0F, -7.0F, 21, 3, 11, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  463 */     this.gunModel[1].setRotationPoint(3.0F, -18.0F, 1.5F);
/*      */     
/*  465 */     this.gunModel[2].addShapeBox(25.0F, -6.0F, -7.0F, 59, 6, 11, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/*  466 */     this.gunModel[2].setRotationPoint(-37.0F, -24.0F, 1.5F);
/*      */     
/*  468 */     this.gunModel[3].addShapeBox(25.0F, -6.0F, -7.0F, 5, 2, 11, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  469 */     this.gunModel[3].setRotationPoint(-2.0F, -18.0F, 1.5F);
/*      */     
/*  471 */     this.gunModel[4].addShapeBox(25.0F, -6.0F, -7.0F, 2, 11, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  472 */     this.gunModel[4].setRotationPoint(1.0F, -16.0F, 1.5F);
/*      */     
/*  474 */     this.gunModel[5].addShapeBox(25.0F, -6.0F, -7.0F, 2, 6, 11, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/*  475 */     this.gunModel[5].setRotationPoint(22.0F, -24.0F, 1.5F);
/*      */     
/*  477 */     this.gunModel[6].addShapeBox(25.0F, -6.0F, -7.0F, 27, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  478 */     this.gunModel[6].setRotationPoint(24.0F, -28.0F, 0.0F);
/*      */     
/*  480 */     this.gunModel[7].addShapeBox(25.0F, -6.0F, -7.0F, 31, 8, 14, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, -6.0F, -2.5F, 0.0F, -6.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/*  481 */     this.gunModel[7].setRotationPoint(24.0F, -19.0F, 0.0F);
/*      */     
/*  483 */     this.gunModel[8].addShapeBox(25.0F, -6.0F, -7.0F, 31, 1, 14, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  484 */     this.gunModel[8].setRotationPoint(24.0F, -29.0F, 0.0F);
/*      */     
/*  486 */     this.gunModel[9].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[9].setRotationPoint(51.0F, -28.0F, 0.0F);
/*      */     
/*  489 */     this.gunModel[10].addShapeBox(25.0F, -6.0F, -7.0F, 31, 6, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  490 */     this.gunModel[10].setRotationPoint(24.0F, -19.0F, 0.0F);
/*      */     
/*  492 */     this.gunModel[11].addShapeBox(25.0F, -6.0F, -7.0F, 31, 2, 10, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F);
/*  493 */     this.gunModel[11].setRotationPoint(24.0F, -30.5F, 2.0F);
/*      */     
/*  495 */     this.gunModel[12].addShapeBox(25.0F, -6.0F, -7.0F, 4, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  496 */     this.gunModel[12].setRotationPoint(51.0F, -27.0F, 1.0F);
/*      */     
/*  498 */     this.gunModel[13].addShapeBox(25.0F, -6.0F, -7.0F, 31, 3, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/*  499 */     this.gunModel[13].setRotationPoint(24.0F, -34.0F, 3.5F);
/*      */     
/*  501 */     this.gunModel[14].addShapeBox(25.0F, -6.0F, -7.0F, 31, 2, 7, 0.0F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  502 */     this.gunModel[14].setRotationPoint(24.0F, -35.5F, 3.5F);
/*      */     
/*  504 */     this.gunModel[15].addShapeBox(25.0F, -6.0F, -7.0F, 47, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  505 */     this.gunModel[15].setRotationPoint(97.0F, -27.0F, 1.5F);
/*      */     
/*  507 */     this.gunModel[16].addShapeBox(25.0F, -6.0F, -7.0F, 47, 4, 11, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  508 */     this.gunModel[16].setRotationPoint(97.0F, -31.0F, 1.5F);
/*      */     
/*  510 */     this.gunModel[17].addShapeBox(25.0F, -6.0F, -7.0F, 47, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  511 */     this.gunModel[17].setRotationPoint(97.0F, -23.0F, 1.5F);
/*      */     
/*  513 */     this.gunModel[18].addShapeBox(25.0F, -6.0F, -7.0F, 37, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  514 */     this.gunModel[18].setRotationPoint(59.0F, -27.0F, 1.5F);
/*      */     
/*  516 */     this.gunModel[19].addShapeBox(25.0F, -6.0F, -7.0F, 37, 4, 11, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  517 */     this.gunModel[19].setRotationPoint(59.0F, -31.0F, 1.5F);
/*      */     
/*  519 */     this.gunModel[20].addShapeBox(25.0F, -6.0F, -7.0F, 37, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  520 */     this.gunModel[20].setRotationPoint(59.0F, -23.0F, 1.5F);
/*      */     
/*  522 */     this.gunModel[21].addShapeBox(25.0F, -6.0F, -7.0F, 19, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  523 */     this.gunModel[21].setRotationPoint(145.0F, -27.0F, 1.5F);
/*      */     
/*  525 */     this.gunModel[22].addShapeBox(25.0F, -6.0F, -7.0F, 19, 4, 11, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  526 */     this.gunModel[22].setRotationPoint(145.0F, -31.0F, 1.5F);
/*      */     
/*  528 */     this.gunModel[23].addShapeBox(25.0F, -6.0F, -7.0F, 19, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  529 */     this.gunModel[23].setRotationPoint(145.0F, -23.0F, 1.5F);
/*      */     
/*  531 */     this.gunModel[24].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  532 */     this.gunModel[24].setRotationPoint(144.0F, -27.0F, 1.5F);
/*      */     
/*  534 */     this.gunModel[25].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F);
/*  535 */     this.gunModel[25].setRotationPoint(144.0F, -23.5F, 1.5F);
/*      */     
/*  537 */     this.gunModel[26].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  538 */     this.gunModel[26].setRotationPoint(144.0F, -30.5F, 1.5F);
/*      */     
/*  540 */     this.gunModel[27].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  541 */     this.gunModel[27].setRotationPoint(96.0F, -27.0F, 1.5F);
/*      */     
/*  543 */     this.gunModel[28].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F);
/*  544 */     this.gunModel[28].setRotationPoint(96.0F, -23.5F, 1.5F);
/*      */     
/*  546 */     this.gunModel[29].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  547 */     this.gunModel[29].setRotationPoint(96.0F, -30.5F, 1.5F);
/*      */     
/*  549 */     this.gunModel[30].addShapeBox(25.0F, -6.0F, -7.0F, 3, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F);
/*  550 */     this.gunModel[30].setRotationPoint(55.0F, -22.5F, 0.5F);
/*      */     
/*  552 */     this.gunModel[31].addShapeBox(25.0F, -6.0F, -7.0F, 3, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  553 */     this.gunModel[31].setRotationPoint(55.0F, -27.0F, 0.5F);
/*      */     
/*  555 */     this.gunModel[32].addShapeBox(25.0F, -6.0F, -7.0F, 3, 4, 13, 0.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  556 */     this.gunModel[32].setRotationPoint(55.0F, -31.5F, 0.5F);
/*      */     
/*  558 */     this.gunModel[33].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F);
/*  559 */     this.gunModel[33].setRotationPoint(58.0F, -27.0F, 0.5F);
/*      */     
/*  561 */     this.gunModel[34].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F);
/*  562 */     this.gunModel[34].setRotationPoint(58.0F, -22.5F, 0.5F);
/*      */     
/*  564 */     this.gunModel[35].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F);
/*  565 */     this.gunModel[35].setRotationPoint(58.0F, -31.5F, 0.5F);
/*      */     
/*  567 */     this.gunModel[36].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  568 */     this.gunModel[36].setRotationPoint(51.0F, -27.0F, 5.0F);
/*      */     
/*  570 */     this.gunModel[37].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[37].setRotationPoint(51.0F, -20.0F, 5.0F);
/*      */     
/*  573 */     this.gunModel[38].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F);
/*  574 */     this.gunModel[38].setRotationPoint(76.0F, -22.5F, 0.5F);
/*      */     
/*  576 */     this.gunModel[39].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  577 */     this.gunModel[39].setRotationPoint(76.0F, -27.0F, 0.5F);
/*      */     
/*  579 */     this.gunModel[40].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 13, 0.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  580 */     this.gunModel[40].setRotationPoint(76.0F, -31.5F, 0.5F);
/*      */     
/*  582 */     this.gunModel[41].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F);
/*  583 */     this.gunModel[41].setRotationPoint(84.0F, -27.0F, 0.5F);
/*      */     
/*  585 */     this.gunModel[42].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F);
/*  586 */     this.gunModel[42].setRotationPoint(84.0F, -22.5F, 0.5F);
/*      */     
/*  588 */     this.gunModel[43].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F);
/*  589 */     this.gunModel[43].setRotationPoint(84.0F, -31.5F, 0.5F);
/*      */     
/*  591 */     this.gunModel[44].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F);
/*  592 */     this.gunModel[44].setRotationPoint(75.0F, -27.0F, 0.5F);
/*      */     
/*  594 */     this.gunModel[45].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F);
/*  595 */     this.gunModel[45].setRotationPoint(75.0F, -22.5F, 0.5F);
/*      */     
/*  597 */     this.gunModel[46].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F);
/*  598 */     this.gunModel[46].setRotationPoint(75.0F, -31.5F, 0.5F);
/*      */     
/*  600 */     this.gunModel[47].addShapeBox(25.0F, -6.0F, -7.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  601 */     this.gunModel[47].setRotationPoint(76.0F, -18.25F, 5.0F);
/*      */     
/*  603 */     this.gunModel[48].addShapeBox(25.0F, -6.0F, -7.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  604 */     this.gunModel[48].setRotationPoint(76.0F, -17.75F, 5.0F);
/*      */     
/*  606 */     this.gunModel[49].addShapeBox(25.0F, -6.0F, -7.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  607 */     this.gunModel[49].setRotationPoint(76.0F, -17.25F, 5.0F);
/*      */     
/*  609 */     this.gunModel[50].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F);
/*  610 */     this.gunModel[50].setRotationPoint(118.0F, -22.5F, 0.5F);
/*      */     
/*  612 */     this.gunModel[51].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  613 */     this.gunModel[51].setRotationPoint(118.0F, -27.0F, 0.5F);
/*      */     
/*  615 */     this.gunModel[52].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 13, 0.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  616 */     this.gunModel[52].setRotationPoint(118.0F, -31.5F, 0.5F);
/*      */     
/*  618 */     this.gunModel[53].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F);
/*  619 */     this.gunModel[53].setRotationPoint(126.0F, -27.0F, 0.5F);
/*      */     
/*  621 */     this.gunModel[54].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F);
/*  622 */     this.gunModel[54].setRotationPoint(126.0F, -22.5F, 0.5F);
/*      */     
/*  624 */     this.gunModel[55].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F);
/*  625 */     this.gunModel[55].setRotationPoint(126.0F, -31.5F, 0.5F);
/*      */     
/*  627 */     this.gunModel[56].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -1.0F);
/*  628 */     this.gunModel[56].setRotationPoint(117.0F, -27.0F, 0.5F);
/*      */     
/*  630 */     this.gunModel[57].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F);
/*  631 */     this.gunModel[57].setRotationPoint(117.0F, -22.5F, 0.5F);
/*      */     
/*  633 */     this.gunModel[58].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 13, 0.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.25F, -4.25F, 0.0F, 0.25F, -4.25F, 0.0F, -0.5F, -5.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, -1.0F);
/*  634 */     this.gunModel[58].setRotationPoint(117.0F, -31.5F, 0.5F);
/*      */     
/*  636 */     this.gunModel[59].addShapeBox(25.0F, -6.0F, -7.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  637 */     this.gunModel[59].setRotationPoint(118.0F, -18.25F, 5.0F);
/*      */     
/*  639 */     this.gunModel[60].addShapeBox(25.0F, -6.0F, -7.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  640 */     this.gunModel[60].setRotationPoint(118.0F, -17.75F, 5.0F);
/*      */     
/*  642 */     this.gunModel[61].addShapeBox(25.0F, -6.0F, -7.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  643 */     this.gunModel[61].setRotationPoint(118.0F, -17.25F, 5.0F);
/*      */     
/*  645 */     this.gunModel[62].addShapeBox(25.0F, -6.0F, -7.0F, 58, 1, 7, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/*  646 */     this.gunModel[62].setRotationPoint(71.0F, -15.25F, 3.5F);
/*      */     
/*  648 */     this.gunModel[63].addShapeBox(25.0F, -6.0F, -7.0F, 58, 1, 7, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  649 */     this.gunModel[63].setRotationPoint(71.0F, -15.75F, 3.5F);
/*      */     
/*  651 */     this.gunModel[64].addShapeBox(25.0F, -6.0F, -7.0F, 58, 1, 7, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  652 */     this.gunModel[64].setRotationPoint(71.0F, -16.25F, 3.5F);
/*      */     
/*  654 */     this.gunModel[65].addShapeBox(25.0F, -6.0F, -7.0F, 8, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  655 */     this.gunModel[65].setRotationPoint(118.0F, -26.5F, 13.75F);
/*      */     
/*  657 */     this.gunModel[66].addShapeBox(25.0F, -6.0F, -7.0F, 11, 5, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  658 */     this.gunModel[66].setRotationPoint(116.5F, -27.5F, 14.75F);
/*      */     
/*  660 */     this.gunModel[67].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 1, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  661 */     this.gunModel[67].setRotationPoint(116.0F, -27.5F, 14.75F);
/*      */     
/*  663 */     this.gunModel[68].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  664 */     this.gunModel[68].setRotationPoint(127.0F, -27.5F, 14.75F);
/*      */     
/*  666 */     this.gunModel[69].addShapeBox(25.0F, -6.0F, -7.0F, 8, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  667 */     this.gunModel[69].setRotationPoint(118.0F, -26.5F, -0.25F);
/*      */     
/*  669 */     this.gunModel[70].addShapeBox(25.0F, -6.0F, -7.0F, 11, 5, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  670 */     this.gunModel[70].setRotationPoint(116.5F, -27.5F, -1.25F);
/*      */     
/*  672 */     this.gunModel[71].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 1, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  673 */     this.gunModel[71].setRotationPoint(116.0F, -27.5F, -1.25F);
/*      */     
/*  675 */     this.gunModel[72].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  676 */     this.gunModel[72].setRotationPoint(127.0F, -27.5F, -1.25F);
/*      */     
/*  678 */     this.gunModel[73].addShapeBox(25.0F, -6.0F, -7.0F, 19, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/*  679 */     this.gunModel[73].setRotationPoint(-38.0F, -30.0F, 2.5F);
/*      */     
/*  681 */     this.gunModel[74].addShapeBox(25.0F, -6.0F, -7.0F, 19, 3, 7, 0.0F, -2.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  682 */     this.gunModel[74].setRotationPoint(-38.0F, -33.0F, 3.5F);
/*      */     
/*  684 */     this.gunModel[75].addShapeBox(25.0F, -6.0F, -7.0F, 19, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[75].setRotationPoint(-38.0F, -25.0F, 1.0F);
/*      */     
/*  687 */     this.gunModel[76].addShapeBox(25.0F, -6.0F, -7.0F, 59, 1, 4, 0.0F, -2.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, -2.0F, -0.25F, -1.75F, 1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F);
/*  688 */     this.gunModel[76].setRotationPoint(-35.0F, -34.0F, 5.0F);
/*      */     
/*  690 */     this.gunModel[77].addShapeBox(25.0F, -6.0F, -7.0F, 7, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  691 */     this.gunModel[77].setRotationPoint(-26.0F, -13.0F, 2.5F);
/*      */     
/*  693 */     this.gunModel[78].addShapeBox(25.0F, -6.0F, -7.0F, 13, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  694 */     this.gunModel[78].setRotationPoint(-34.0F, -13.0F, 2.0F);
/*      */     
/*  696 */     this.gunModel[79].addShapeBox(25.0F, -6.0F, -7.0F, 5, 3, 10, 0.0F, -1.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F);
/*  697 */     this.gunModel[79].setRotationPoint(-39.0F, -13.0F, 2.0F);
/*      */     
/*  699 */     this.gunModel[80].addShapeBox(25.0F, -6.0F, -7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  700 */     this.gunModel[80].setRotationPoint(-36.0F, -10.0F, 2.0F);
/*      */     
/*  702 */     this.gunModel[81].addShapeBox(25.0F, -6.0F, -7.0F, 3, 2, 10, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  703 */     this.gunModel[81].setRotationPoint(-37.0F, -7.0F, 2.0F);
/*      */     
/*  705 */     this.gunModel[82].addShapeBox(25.0F, -6.0F, -7.0F, 3, 3, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  706 */     this.gunModel[82].setRotationPoint(-37.0F, -13.0F, 2.0F);
/*      */     
/*  708 */     this.gunModel[83].addShapeBox(25.0F, -6.0F, -7.0F, 4, 2, 10, 0.0F, -3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F, -2.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F);
/*  709 */     this.gunModel[83].setRotationPoint(-39.0F, -7.0F, 2.0F);
/*      */     
/*  711 */     this.gunModel[84].addShapeBox(25.0F, -6.0F, -7.0F, 4, 4, 10, 0.0F, -3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F);
/*  712 */     this.gunModel[84].setRotationPoint(-39.5F, -5.0F, 2.0F);
/*      */     
/*  714 */     this.gunModel[85].addShapeBox(25.0F, -6.0F, -7.0F, 4, 4, 10, 0.0F, -3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F);
/*  715 */     this.gunModel[85].setRotationPoint(-41.0F, -1.0F, 2.0F);
/*      */     
/*  717 */     this.gunModel[86].addShapeBox(25.0F, -6.0F, -7.0F, 4, 6, 10, 0.0F, -3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F);
/*  718 */     this.gunModel[86].setRotationPoint(-42.0F, 3.0F, 2.0F);
/*      */     
/*  720 */     this.gunModel[87].addShapeBox(25.0F, -6.0F, -7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F);
/*  721 */     this.gunModel[87].setRotationPoint(-40.5F, 9.0F, 2.0F);
/*      */     
/*  723 */     this.gunModel[88].addShapeBox(25.0F, -6.0F, -7.0F, 2, 4, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  724 */     this.gunModel[88].setRotationPoint(-41.0F, 12.0F, 2.0F);
/*      */     
/*  726 */     this.gunModel[89].addShapeBox(25.0F, -6.0F, -7.0F, 12, 4, 10, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  727 */     this.gunModel[89].setRotationPoint(-37.5F, -5.0F, 2.0F);
/*      */     
/*  729 */     this.gunModel[90].addShapeBox(25.0F, -6.0F, -7.0F, 12, 4, 10, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[90].setRotationPoint(-39.0F, -1.0F, 2.0F);
/*      */     
/*  732 */     this.gunModel[91].addShapeBox(25.0F, -6.0F, -7.0F, 12, 6, 10, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  733 */     this.gunModel[91].setRotationPoint(-40.0F, 3.0F, 2.0F);
/*      */     
/*  735 */     this.gunModel[92].addShapeBox(25.0F, -6.0F, -7.0F, 10, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  736 */     this.gunModel[92].setRotationPoint(-38.5F, 9.0F, 2.0F);
/*      */     
/*  738 */     this.gunModel[93].addShapeBox(25.0F, -6.0F, -7.0F, 10, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  739 */     this.gunModel[93].setRotationPoint(-39.0F, 12.0F, 2.0F);
/*      */     
/*  741 */     this.gunModel[94].addShapeBox(25.0F, -6.0F, -7.0F, 4, 4, 10, 0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F);
/*  742 */     this.gunModel[94].setRotationPoint(-27.5F, -5.0F, 2.0F);
/*      */     
/*  744 */     this.gunModel[95].addShapeBox(25.0F, -6.0F, -7.0F, 4, 4, 10, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F);
/*  745 */     this.gunModel[95].setRotationPoint(-29.0F, -1.0F, 2.0F);
/*      */     
/*  747 */     this.gunModel[96].addShapeBox(25.0F, -6.0F, -7.0F, 4, 6, 10, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[96].setRotationPoint(-30.0F, 3.0F, 2.0F);
/*      */     
/*  750 */     this.gunModel[97].addShapeBox(25.0F, -6.0F, -7.0F, 2, 3, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  751 */     this.gunModel[97].setRotationPoint(-28.5F, 9.0F, 2.0F);
/*      */     
/*  753 */     this.gunModel[98].addShapeBox(25.0F, -6.0F, -7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  754 */     this.gunModel[98].setRotationPoint(-28.5F, 12.0F, 2.0F);
/*      */     
/*  756 */     this.gunModel[99].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F);
/*  757 */     this.gunModel[99].setRotationPoint(-28.5F, 15.0F, 2.0F);
/*      */     
/*  759 */     this.gunModel[100].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[100].setRotationPoint(-28.5F, 15.0F, 2.0F);
/*      */     
/*  762 */     this.gunModel[101].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  763 */     this.gunModel[101].setRotationPoint(-27.5F, 16.0F, 2.0F);
/*      */     
/*  765 */     this.gunModel[102].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -4.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -4.5F, 0.0F, -2.0F);
/*  766 */     this.gunModel[102].setRotationPoint(-39.5F, 17.0F, 2.0F);
/*      */     
/*  768 */     this.gunModel[103].addShapeBox(25.0F, -6.0F, -7.0F, 11, 1, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  769 */     this.gunModel[103].setRotationPoint(-38.5F, 16.0F, 2.0F);
/*      */     
/*  771 */     this.gunModel[104].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  772 */     this.gunModel[104].setRotationPoint(-41.0F, 16.0F, 2.0F);
/*      */     
/*  774 */     this.gunModel[105].addShapeBox(25.0F, -6.0F, -7.0F, 19, 1, 12, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  775 */     this.gunModel[105].setRotationPoint(-38.0F, -25.5F, 1.0F);
/*      */     
/*  777 */     this.gunModel[106].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  778 */     this.gunModel[106].setRotationPoint(-27.5F, 17.0F, 2.0F);
/*      */     
/*  780 */     this.gunModel[107].addShapeBox(25.0F, -6.0F, -7.0F, 17, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  781 */     this.gunModel[107].setRotationPoint(-19.0F, -6.0F, 3.0F);
/*      */     
/*  783 */     this.gunModel[108].addShapeBox(25.0F, -6.0F, -7.0F, 5, 11, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  784 */     this.gunModel[108].setRotationPoint(-2.0F, -18.0F, 2.5F);
/*      */     
/*  786 */     this.gunModel[109].addShapeBox(25.0F, -6.0F, -7.0F, 3, 2, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  787 */     this.gunModel[109].setRotationPoint(-14.5F, -18.0F, 5.5F);
/*      */     
/*  789 */     this.gunModel[110].addShapeBox(25.0F, -6.0F, -7.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  790 */     this.gunModel[110].setRotationPoint(-15.25F, -14.0F, 5.5F);
/*      */     
/*  792 */     this.gunModel[111].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  793 */     this.gunModel[111].setRotationPoint(-15.25F, -11.0F, 5.5F);
/*      */     
/*  795 */     this.gunModel[112].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  796 */     this.gunModel[112].setRotationPoint(-14.75F, -9.0F, 5.5F);
/*      */     
/*  798 */     this.gunModel[113].addShapeBox(25.0F, -6.0F, -7.0F, 3, 2, 3, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  799 */     this.gunModel[113].setRotationPoint(-15.0F, -16.0F, 5.5F);
/*      */     
/*  801 */     this.gunModel[114].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  802 */     this.gunModel[114].setRotationPoint(-2.0F, -7.0F, 2.5F);
/*      */     
/*  804 */     this.gunModel[115].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  805 */     this.gunModel[115].setRotationPoint(0.0F, -7.0F, 2.5F);
/*      */     
/*  807 */     this.gunModel[116].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  808 */     this.gunModel[116].setRotationPoint(2.0F, -7.0F, 2.5F);
/*      */     
/*  810 */     this.gunModel[117].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  811 */     this.gunModel[117].setRotationPoint(-19.5F, -10.0F, 5.0F);
/*      */     
/*  813 */     this.gunModel[118].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  814 */     this.gunModel[118].setRotationPoint(-19.5F, -9.0F, 5.0F);
/*      */     
/*  816 */     this.gunModel[119].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 3, 0.0F, 0.0F, -0.5F, 0.0F, 2.25F, -0.5F, 0.0F, 2.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  817 */     this.gunModel[119].setRotationPoint(-19.5F, -16.0F, 5.5F);
/*      */     
/*  819 */     this.gunModel[120].addShapeBox(25.0F, -6.0F, -7.0F, 3, 2, 3, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  820 */     this.gunModel[120].setRotationPoint(-19.5F, -17.5F, 5.5F);
/*      */     
/*  822 */     this.gunModel[121].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  823 */     this.gunModel[121].setRotationPoint(-19.5F, -18.0F, 5.5F);
/*      */     
/*  825 */     this.gunModel[122].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 10, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/*  826 */     this.gunModel[122].setRotationPoint(-1.0F, -10.5F, 2.0F);
/*      */     
/*  828 */     this.gunModel[123].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 10, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  829 */     this.gunModel[123].setRotationPoint(-1.0F, -11.0F, 2.0F);
/*      */     
/*  831 */     this.gunModel[124].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 10, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  832 */     this.gunModel[124].setRotationPoint(-1.0F, -11.5F, 2.0F);
/*      */     
/*  834 */     this.gunModel[125].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 4, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  835 */     this.gunModel[125].setRotationPoint(-1.0F, -5.0F, 5.0F);
/*      */     
/*  837 */     this.gunModel[126].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 4, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F);
/*  838 */     this.gunModel[126].setRotationPoint(-2.25F, -3.0F, 5.0F);
/*      */     
/*  840 */     this.gunModel[127].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 4, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  841 */     this.gunModel[127].setRotationPoint(-1.0F, -6.0F, 5.0F);
/*      */     
/*  843 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 19, 5, 9, 0.0F, 0.0F, -0.1F, 1.0F, 0.0F, -0.1F, 1.0F, 0.0F, -0.1F, 1.0F, 0.0F, -0.1F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  844 */     this.gunModel[''].setRotationPoint(-38.0F, -18.0F, 2.5F);
/*      */     
/*  846 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  847 */     this.gunModel[''].setRotationPoint(-88.0F, -20.0F, 5.0F);
/*      */     
/*  849 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  850 */     this.gunModel[''].setRotationPoint(-88.0F, -18.5F, 5.0F);
/*      */     
/*  852 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  853 */     this.gunModel[''].setRotationPoint(-88.0F, -17.0F, 5.0F);
/*      */     
/*  855 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 22, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 2.25F, -1.25F, 0.0F, 2.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  856 */     this.gunModel[''].setRotationPoint(-76.0F, -20.0F, 5.0F);
/*      */     
/*  858 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 22, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 2.25F, 0.25F, 0.0F, 2.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  859 */     this.gunModel[''].setRotationPoint(-76.0F, -18.5F, 5.0F);
/*      */     
/*  861 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 22, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 2.25F, 0.25F, 0.0F, 2.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, -1.75F, -1.25F, 0.0F, -1.75F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  862 */     this.gunModel[''].setRotationPoint(-76.0F, -17.0F, 5.0F);
/*      */     
/*  864 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 16, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  865 */     this.gunModel[''].setRotationPoint(-125.0F, -19.0F, 5.0F);
/*      */     
/*  867 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 16, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  868 */     this.gunModel[''].setRotationPoint(-125.0F, -17.5F, 5.0F);
/*      */     
/*  870 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 16, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  871 */     this.gunModel[''].setRotationPoint(-125.0F, -16.0F, 5.0F);
/*      */     
/*  873 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 15, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  874 */     this.gunModel[''].setRotationPoint(-109.0F, -19.0F, 5.0F);
/*      */     
/*  876 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 15, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  877 */     this.gunModel[''].setRotationPoint(-109.0F, -17.5F, 5.0F);
/*      */     
/*  879 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 15, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  880 */     this.gunModel[''].setRotationPoint(-109.0F, -16.0F, 5.0F);
/*      */     
/*  882 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, -0.5F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/*  883 */     this.gunModel[''].setRotationPoint(-126.0F, 9.75F, 5.0F);
/*      */     
/*  885 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/*  886 */     this.gunModel[''].setRotationPoint(-126.0F, 11.25F, 5.0F);
/*      */     
/*  888 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F);
/*  889 */     this.gunModel[''].setRotationPoint(-126.0F, 12.75F, 5.0F);
/*      */     
/*  891 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  892 */     this.gunModel[''].setRotationPoint(-121.0F, 9.75F, 5.0F);
/*      */     
/*  894 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  895 */     this.gunModel[''].setRotationPoint(-121.0F, 11.25F, 5.0F);
/*      */     
/*  897 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  898 */     this.gunModel[''].setRotationPoint(-121.0F, 12.75F, 5.0F);
/*      */     
/*  900 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 26, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 10.75F, -1.25F, 0.0F, 10.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, -10.25F, 0.25F, 0.0F, -10.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  901 */     this.gunModel[''].setRotationPoint(-117.0F, 9.25F, 5.0F);
/*      */     
/*  903 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 26, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 10.75F, 0.25F, 0.0F, 10.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -10.25F, 0.25F, 0.0F, -10.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  904 */     this.gunModel[''].setRotationPoint(-117.0F, 10.75F, 5.0F);
/*      */     
/*  906 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 26, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 10.75F, 0.25F, 0.0F, 10.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, -10.25F, -1.25F, 0.0F, -10.25F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  907 */     this.gunModel[''].setRotationPoint(-117.0F, 12.25F, 5.0F);
/*      */     
/*  909 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, -0.75F, -1.25F, 0.0F, 5.25F, -1.25F, 0.0F, 5.25F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 1.25F, 0.25F, 0.0F, -4.75F, 0.25F, 0.0F, -4.75F, 0.25F, 0.0F, 1.25F, 0.25F);
/*  910 */     this.gunModel[''].setRotationPoint(-85.0F, -6.0F, 5.0F);
/*      */     
/*  912 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, 5.25F, 0.25F, 0.0F, 5.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -4.75F, 0.25F, 0.0F, -4.75F, 0.25F, 0.0F, 1.25F, 0.25F);
/*  913 */     this.gunModel[''].setRotationPoint(-85.0F, -4.5F, 5.0F);
/*      */     
/*  915 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, 5.25F, 0.25F, 0.0F, 5.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 1.25F, -1.25F, 0.0F, -4.75F, -1.25F, 0.0F, -4.75F, -1.25F, 0.0F, 1.25F, -1.25F);
/*  916 */     this.gunModel[''].setRotationPoint(-85.0F, -3.0F, 5.0F);
/*      */     
/*  918 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 3.25F, -1.25F, 0.0F, 3.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  919 */     this.gunModel[''].setRotationPoint(-73.0F, -11.0F, 5.0F);
/*      */     
/*  921 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 3.25F, 0.25F, 0.0F, 3.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  922 */     this.gunModel[''].setRotationPoint(-73.0F, -9.5F, 5.0F);
/*      */     
/*  924 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 3.25F, 0.25F, 0.0F, 3.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, -2.75F, -1.25F, 0.0F, -2.75F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  925 */     this.gunModel[''].setRotationPoint(-73.0F, -8.0F, 5.0F);
/*      */     
/*  927 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 1.25F, -1.25F, 0.0F, 1.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  928 */     this.gunModel[''].setRotationPoint(-66.0F, -14.0F, 5.0F);
/*      */     
/*  930 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  931 */     this.gunModel[''].setRotationPoint(-66.0F, -12.5F, 5.0F);
/*      */     
/*  933 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  934 */     this.gunModel[''].setRotationPoint(-66.0F, -11.0F, 5.0F);
/*      */     
/*  936 */     this.gunModel[''].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 4, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  937 */     this.gunModel[''].setRotationPoint(-61.0F, -15.0F, 5.0F);
/*      */     
/*  939 */     this.gunModel[' '].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  940 */     this.gunModel[' '].setRotationPoint(-61.0F, -13.5F, 5.0F);
/*      */     
/*  942 */     this.gunModel['¡'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 4, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.25F, -1.25F);
/*  943 */     this.gunModel['¡'].setRotationPoint(-61.0F, -12.0F, 5.0F);
/*      */     
/*  945 */     this.gunModel['¢'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  946 */     this.gunModel['¢'].setRotationPoint(-131.0F, -18.25F, 2.25F);
/*      */     
/*  948 */     this.gunModel['£'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  949 */     this.gunModel['£'].setRotationPoint(-130.5F, -4.25F, 1.25F);
/*      */     
/*  951 */     this.gunModel['¤'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 1, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.5F, -2.0F, -1.0F, 0.5F, -2.0F, -1.0F, 0.5F, -1.5F, -1.0F, 0.5F, -1.5F);
/*  952 */     this.gunModel['¤'].setRotationPoint(-131.5F, 13.25F, 4.25F);
/*      */     
/*  954 */     this.gunModel['¥'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 2, 7, 0.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  955 */     this.gunModel['¥'].setRotationPoint(-131.0F, -20.25F, 2.25F);
/*      */     
/*  957 */     this.gunModel['¦'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  958 */     this.gunModel['¦'].setRotationPoint(-131.5F, 9.25F, 2.25F);
/*      */     
/*  960 */     this.gunModel['§'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  961 */     this.gunModel['§'].setRotationPoint(-131.0F, -18.25F, 9.75F);
/*      */     
/*  963 */     this.gunModel['¨'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  964 */     this.gunModel['¨'].setRotationPoint(-131.0F, -14.25F, 2.25F);
/*      */     
/*  966 */     this.gunModel['©'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  967 */     this.gunModel['©'].setRotationPoint(-131.0F, -9.25F, 1.75F);
/*      */     
/*  969 */     this.gunModel['ª'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  970 */     this.gunModel['ª'].setRotationPoint(-130.5F, -4.25F, 10.75F);
/*      */     
/*  972 */     this.gunModel['«'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 5, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  973 */     this.gunModel['«'].setRotationPoint(-130.5F, -0.25F, 1.75F);
/*      */     
/*  975 */     this.gunModel['¬'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 5, 2, 0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 1.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/*  976 */     this.gunModel['¬'].setRotationPoint(-130.5F, 4.75F, 2.25F);
/*      */     
/*  978 */     this.gunModel['­'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 2, 3, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  979 */     this.gunModel['­'].setRotationPoint(-131.0F, -20.25F, 8.75F);
/*      */     
/*  981 */     this.gunModel['®'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  982 */     this.gunModel['®'].setRotationPoint(-131.5F, 9.25F, 4.75F);
/*      */     
/*  984 */     this.gunModel['¯'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 4, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  985 */     this.gunModel['¯'].setRotationPoint(-131.0F, -18.25F, 4.75F);
/*      */     
/*  987 */     this.gunModel['°'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 5, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  988 */     this.gunModel['°'].setRotationPoint(-131.0F, -14.25F, 4.75F);
/*      */     
/*  990 */     this.gunModel['±'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 5, 5, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F);
/*  991 */     this.gunModel['±'].setRotationPoint(-131.0F, -9.25F, 4.75F);
/*      */     
/*  993 */     this.gunModel['²'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 4, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  994 */     this.gunModel['²'].setRotationPoint(-130.5F, -4.25F, 3.75F);
/*      */     
/*  996 */     this.gunModel['³'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 5, 5, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/*  997 */     this.gunModel['³'].setRotationPoint(-130.5F, -0.25F, 4.75F);
/*      */     
/*  999 */     this.gunModel['´'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 5, 5, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 1.0F, -0.5F, 0.5F, 2.0F, -0.5F, 0.5F, 2.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1000 */     this.gunModel['´'].setRotationPoint(-130.5F, 4.75F, 4.75F);
/*      */     
/* 1002 */     this.gunModel['µ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1003 */     this.gunModel['µ'].setRotationPoint(-19.5F, -14.0F, 4.5F);
/*      */     
/* 1005 */     this.gunModel['¶'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F);
/* 1006 */     this.gunModel['¶'].setRotationPoint(-18.5F, -14.0F, 4.5F);
/*      */     
/* 1008 */     this.gunModel['·'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 1, 4, 0.0F, 0.0F, -0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1009 */     this.gunModel['·'].setRotationPoint(-94.0F, -20.0F, 5.0F);
/*      */     
/* 1011 */     this.gunModel['¸'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 1, 4, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1012 */     this.gunModel['¸'].setRotationPoint(-94.0F, -18.5F, 5.0F);
/*      */     
/* 1014 */     this.gunModel['¹'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 1, 4, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.75F, -1.25F);
/* 1015 */     this.gunModel['¹'].setRotationPoint(-94.0F, -17.0F, 5.0F);
/*      */     
/* 1017 */     this.gunModel['º'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 1, 4, 0.0F, 0.0F, -3.5F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, -3.5F, -1.25F, 0.0F, 4.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 4.0F, 0.25F);
/* 1018 */     this.gunModel['º'].setRotationPoint(-91.0F, -5.0F, 5.0F);
/*      */     
/* 1020 */     this.gunModel['»'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 1, 4, 0.0F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 4.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 4.0F, 0.25F);
/* 1021 */     this.gunModel['»'].setRotationPoint(-91.0F, -3.5F, 5.0F);
/*      */     
/* 1023 */     this.gunModel['¼'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 1, 4, 0.0F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 4.0F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 4.0F, -1.25F);
/* 1024 */     this.gunModel['¼'].setRotationPoint(-91.0F, -2.0F, 5.0F);
/*      */     
/* 1026 */     this.gunModel['½'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 6, 2, 0.0F, 1.5F, 0.25F, -1.5F, 0.75F, 1.25F, -1.5F, 0.75F, 1.25F, 1.5F, 1.5F, 0.25F, 1.5F, -0.5F, 3.75F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -0.5F, 3.75F, 0.0F);
/* 1027 */     this.gunModel['½'].setRotationPoint(-90.5F, -8.25F, 8.75F);
/*      */     
/* 1029 */     this.gunModel['¾'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 3.75F, 0.0F, 1.75F, 3.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 2.5F, -3.75F, -2.0F, 2.5F, -3.75F, -2.0F, -0.5F, 0.0F, -2.0F);
/* 1030 */     this.gunModel['¾'].setRotationPoint(-90.0F, 1.5F, 3.75F);
/*      */     
/* 1032 */     this.gunModel['¿'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 9, 2, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, -0.25F, -1.5F, 0.75F, -1.25F, -1.5F, 0.75F, -1.25F, 1.5F, -0.5F, -0.25F, 1.5F);
/* 1033 */     this.gunModel['¿'].setRotationPoint(-92.5F, -17.25F, 8.75F);
/*      */     
/* 1035 */     this.gunModel['À'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1036 */     this.gunModel['À'].setRotationPoint(-131.0F, -14.25F, 9.75F);
/*      */     
/* 1038 */     this.gunModel['Á'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/* 1039 */     this.gunModel['Á'].setRotationPoint(-131.0F, -9.25F, 10.25F);
/*      */     
/* 1041 */     this.gunModel['Â'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 5, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['Â'].setRotationPoint(-130.5F, -0.25F, 10.25F);
/*      */     
/* 1044 */     this.gunModel['Ã'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 5, 2, 0.0F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 1.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1045 */     this.gunModel['Ã'].setRotationPoint(-130.5F, 4.75F, 9.75F);
/*      */     
/* 1047 */     this.gunModel['Ä'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 2, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1048 */     this.gunModel['Ä'].setRotationPoint(-93.5F, -19.25F, 3.75F);
/*      */     
/* 1050 */     this.gunModel['Å'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 2, 5, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1051 */     this.gunModel['Å'].setRotationPoint(-93.5F, -21.25F, 4.75F);
/*      */     
/* 1053 */     this.gunModel['Æ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 6, 2, 0.0F, 1.5F, 0.25F, 1.5F, 0.75F, 1.25F, 1.5F, 0.75F, 1.25F, -1.5F, 1.5F, 0.25F, -1.5F, -0.5F, 3.75F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -0.5F, 3.75F, 0.0F);
/* 1054 */     this.gunModel['Æ'].setRotationPoint(-90.5F, -8.25F, 3.75F);
/*      */     
/* 1056 */     this.gunModel['Ç'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 9, 2, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, -0.25F, 1.5F, 0.75F, -1.25F, 1.5F, 0.75F, -1.25F, -1.5F, -0.5F, -0.25F, -1.5F);
/* 1057 */     this.gunModel['Ç'].setRotationPoint(-92.5F, -17.25F, 3.75F);
/*      */     
/* 1059 */     this.gunModel['È'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1060 */     this.gunModel['È'].setRotationPoint(-90.0F, -9.5F, 3.75F);
/*      */     
/* 1062 */     this.gunModel['É'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1063 */     this.gunModel['É'].setRotationPoint(-90.0F, -9.0F, 3.75F);
/*      */     
/* 1065 */     this.gunModel['Ê'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1066 */     this.gunModel['Ê'].setRotationPoint(-90.0F, -10.0F, 3.75F);
/*      */     
/* 1068 */     this.gunModel['Ë'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1069 */     this.gunModel['Ë'].setRotationPoint(-92.0F, -10.5F, 5.25F);
/*      */     
/* 1071 */     this.gunModel['Ì'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F);
/* 1072 */     this.gunModel['Ì'].setRotationPoint(-94.0F, -10.5F, 5.25F);
/*      */     
/* 1074 */     this.gunModel['Í'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1075 */     this.gunModel['Í'].setRotationPoint(-88.0F, -10.5F, 5.25F);
/*      */     
/* 1077 */     this.gunModel['Î'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1078 */     this.gunModel['Î'].setRotationPoint(-54.0F, -14.5F, 3.5F);
/*      */     
/* 1080 */     this.gunModel['Ï'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1081 */     this.gunModel['Ï'].setRotationPoint(-54.0F, -12.0F, 3.5F);
/*      */     
/* 1083 */     this.gunModel['Ð'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 7, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1084 */     this.gunModel['Ð'].setRotationPoint(-54.0F, -16.5F, 3.5F);
/*      */     
/* 1086 */     this.gunModel['Ñ'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 1, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1087 */     this.gunModel['Ñ'].setRotationPoint(-54.0F, -17.0F, 3.5F);
/*      */     
/* 1089 */     this.gunModel['Ò'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1090 */     this.gunModel['Ò'].setRotationPoint(-51.0F, -18.0F, 3.5F);
/*      */     
/* 1092 */     this.gunModel['Ó'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 1, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1093 */     this.gunModel['Ó'].setRotationPoint(-54.0F, -22.5F, 3.5F);
/*      */     
/* 1095 */     this.gunModel['Ô'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1096 */     this.gunModel['Ô'].setRotationPoint(-54.0F, -21.5F, 3.5F);
/*      */     
/* 1098 */     this.gunModel['Õ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1099 */     this.gunModel['Õ'].setRotationPoint(-54.0F, -22.5F, 3.5F);
/*      */     
/* 1101 */     this.gunModel['Ö'].addShapeBox(25.0F, -6.0F, -7.0F, 10, 1, 7, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1102 */     this.gunModel['Ö'].setRotationPoint(-52.0F, -23.5F, 3.5F);
/*      */     
/* 1104 */     this.gunModel['×'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1105 */     this.gunModel['×'].setRotationPoint(-54.0F, -23.5F, 3.5F);
/*      */     
/* 1107 */     this.gunModel['Ø'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 10, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1108 */     this.gunModel['Ø'].setRotationPoint(-42.0F, -23.0F, 3.5F);
/*      */     
/* 1110 */     this.gunModel['Ù'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 3, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1111 */     this.gunModel['Ù'].setRotationPoint(-43.0F, -16.0F, 3.5F);
/*      */     
/* 1113 */     this.gunModel['Ú'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 7, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1114 */     this.gunModel['Ú'].setRotationPoint(-43.0F, -16.5F, 3.5F);
/*      */     
/* 1116 */     this.gunModel['Û'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1117 */     this.gunModel['Û'].setRotationPoint(-44.0F, -17.5F, 3.5F);
/*      */     
/* 1119 */     this.gunModel['Ü'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 2, 5, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1120 */     this.gunModel['Ü'].setRotationPoint(-51.0F, -16.5F, 4.5F);
/*      */     
/* 1122 */     this.gunModel['Ý'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 2, 5, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1123 */     this.gunModel['Ý'].setRotationPoint(-51.0F, -15.0F, 4.5F);
/*      */     
/* 1125 */     this.gunModel['Þ'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 2, 5, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.5F, -0.5F, -1.0F);
/* 1126 */     this.gunModel['Þ'].setRotationPoint(-51.0F, -14.0F, 4.5F);
/*      */     
/* 1128 */     this.gunModel['ß'].addShapeBox(25.0F, -6.0F, -7.0F, 11, 5, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1129 */     this.gunModel['ß'].setRotationPoint(-53.5F, -22.5F, 4.5F);
/*      */     
/* 1131 */     this.gunModel['à'].addShapeBox(25.0F, -6.0F, -7.0F, 8, 4, 7, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1132 */     this.gunModel['à'].setRotationPoint(-50.0F, -22.5F, 3.5F);
/*      */     
/* 1134 */     this.gunModel['á'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1135 */     this.gunModel['á'].setRotationPoint(-52.0F, -22.0F, 5.5F);
/*      */     
/* 1137 */     this.gunModel['â'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 4, 5, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1138 */     this.gunModel['â'].setRotationPoint(-53.0F, -22.0F, 5.5F);
/*      */     
/* 1140 */     this.gunModel['ã'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 13, 9, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1141 */     this.gunModel['ã'].setRotationPoint(-39.0F, -26.0F, 2.5F);
/*      */     
/* 1143 */     this.gunModel['ä'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 13, 9, 0.0F, 0.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F);
/* 1144 */     this.gunModel['ä'].setRotationPoint(-40.25F, -26.0F, 2.5F);
/*      */     
/* 1146 */     this.gunModel['å'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1147 */     this.gunModel['å'].setRotationPoint(-42.0F, -24.0F, 3.5F);
/*      */     
/* 1149 */     this.gunModel['æ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1150 */     this.gunModel['æ'].setRotationPoint(-24.5F, -32.0F, 9.5F);
/*      */     
/* 1152 */     this.gunModel['ç'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1153 */     this.gunModel['ç'].setRotationPoint(-10.5F, -32.0F, 9.5F);
/*      */     
/* 1155 */     this.gunModel['è'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1156 */     this.gunModel['è'].setRotationPoint(2.5F, -32.0F, 9.5F);
/*      */     
/* 1158 */     this.gunModel['é'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1159 */     this.gunModel['é'].setRotationPoint(-24.5F, -33.0F, 7.0F);
/*      */     
/* 1161 */     this.gunModel['ê'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1162 */     this.gunModel['ê'].setRotationPoint(-10.5F, -33.0F, 7.0F);
/*      */     
/* 1164 */     this.gunModel['ë'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1165 */     this.gunModel['ë'].setRotationPoint(2.5F, -33.0F, 7.0F);
/*      */     
/* 1167 */     this.gunModel['ì'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1168 */     this.gunModel['ì'].setRotationPoint(16.5F, -33.0F, 3.0F);
/*      */     
/* 1170 */     this.gunModel['í'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1171 */     this.gunModel['í'].setRotationPoint(-24.5F, -34.0F, 7.0F);
/*      */     
/* 1173 */     this.gunModel['î'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1174 */     this.gunModel['î'].setRotationPoint(-10.5F, -34.0F, 7.0F);
/*      */     
/* 1176 */     this.gunModel['ï'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1177 */     this.gunModel['ï'].setRotationPoint(2.5F, -34.0F, 7.0F);
/*      */     
/* 1179 */     this.gunModel['ð'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1180 */     this.gunModel['ð'].setRotationPoint(16.5F, -34.0F, 4.0F);
/*      */     
/* 1182 */     this.gunModel['ñ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1183 */     this.gunModel['ñ'].setRotationPoint(-24.5F, -27.0F, 9.5F);
/*      */     
/* 1185 */     this.gunModel['ò'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1186 */     this.gunModel['ò'].setRotationPoint(-10.5F, -27.0F, 9.5F);
/*      */     
/* 1188 */     this.gunModel['ó'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1189 */     this.gunModel['ó'].setRotationPoint(2.5F, -27.0F, 9.5F);
/*      */     
/* 1191 */     this.gunModel['ô'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1192 */     this.gunModel['ô'].setRotationPoint(16.5F, -27.0F, 9.5F);
/*      */     
/* 1194 */     this.gunModel['õ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1195 */     this.gunModel['õ'].setRotationPoint(-24.5F, -34.75F, 5.0F);
/*      */     
/* 1197 */     this.gunModel['ö'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1198 */     this.gunModel['ö'].setRotationPoint(-24.5F, -34.75F, 6.0F);
/*      */     
/* 1200 */     this.gunModel['÷'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1201 */     this.gunModel['÷'].setRotationPoint(-10.5F, -34.75F, 5.0F);
/*      */     
/* 1203 */     this.gunModel['ø'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1204 */     this.gunModel['ø'].setRotationPoint(-10.5F, -34.75F, 6.0F);
/*      */     
/* 1206 */     this.gunModel['ù'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1207 */     this.gunModel['ù'].setRotationPoint(2.5F, -34.75F, 5.0F);
/*      */     
/* 1209 */     this.gunModel['ú'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1210 */     this.gunModel['ú'].setRotationPoint(2.5F, -34.75F, 6.0F);
/*      */     
/* 1212 */     this.gunModel['û'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1213 */     this.gunModel['û'].setRotationPoint(16.5F, -34.75F, 5.0F);
/*      */     
/* 1215 */     this.gunModel['ü'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1216 */     this.gunModel['ü'].setRotationPoint(16.5F, -34.75F, 6.0F);
/*      */     
/* 1218 */     this.gunModel['ý'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1219 */     this.gunModel['ý'].setRotationPoint(16.5F, -32.0F, 9.5F);
/*      */     
/* 1221 */     this.gunModel['þ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1222 */     this.gunModel['þ'].setRotationPoint(16.5F, -33.0F, 7.0F);
/*      */     
/* 1224 */     this.gunModel['ÿ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1225 */     this.gunModel['ÿ'].setRotationPoint(16.5F, -34.0F, 7.0F);
/*      */     
/* 1227 */     this.gunModel['Ā'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1228 */     this.gunModel['Ā'].setRotationPoint(2.5F, -33.0F, 3.0F);
/*      */     
/* 1230 */     this.gunModel['ā'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1231 */     this.gunModel['ā'].setRotationPoint(2.5F, -34.0F, 4.0F);
/*      */     
/* 1233 */     this.gunModel['Ă'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1234 */     this.gunModel['Ă'].setRotationPoint(-10.5F, -31.0F, 2.0F);
/*      */     
/* 1236 */     this.gunModel['ă'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1237 */     this.gunModel['ă'].setRotationPoint(-10.5F, -34.0F, 4.0F);
/*      */     
/* 1239 */     this.gunModel['Ą'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1240 */     this.gunModel['Ą'].setRotationPoint(-39.25F, -27.0F, 10.0F);
/*      */     
/* 1242 */     this.gunModel['ą'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1243 */     this.gunModel['ą'].setRotationPoint(-40.25F, -27.0F, 10.0F);
/*      */     
/* 1245 */     this.gunModel['Ć'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1246 */     this.gunModel['Ć'].setRotationPoint(-41.25F, -27.0F, 10.0F);
/*      */     
/* 1248 */     this.gunModel['ć'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1249 */     this.gunModel['ć'].setRotationPoint(-40.25F, -26.25F, 10.5F);
/*      */     
/* 1251 */     this.gunModel['Ĉ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F);
/* 1252 */     this.gunModel['Ĉ'].setRotationPoint(-40.75F, -26.25F, 10.5F);
/*      */     
/* 1254 */     this.gunModel['ĉ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F);
/* 1255 */     this.gunModel['ĉ'].setRotationPoint(-39.75F, -26.25F, 10.5F);
/*      */     
/* 1257 */     this.gunModel['Ċ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 2, 0.0F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F);
/* 1258 */     this.gunModel['Ċ'].setRotationPoint(-41.15F, -26.0F, 10.35F);
/*      */     
/* 1260 */     this.gunModel['ċ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F);
/* 1261 */     this.gunModel['ċ'].setRotationPoint(-39.4F, -26.0F, 10.35F);
/*      */     
/* 1263 */     this.gunModel['Č'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F);
/* 1264 */     this.gunModel['Č'].setRotationPoint(-40.4F, -26.0F, 10.35F);
/*      */     
/* 1266 */     this.gunModel['č'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1267 */     this.gunModel['č'].setRotationPoint(-39.25F, -14.5F, 10.0F);
/*      */     
/* 1269 */     this.gunModel['Ď'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.gunModel['Ď'].setRotationPoint(-40.25F, -14.5F, 10.0F);
/*      */     
/* 1272 */     this.gunModel['ď'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1273 */     this.gunModel['ď'].setRotationPoint(-41.25F, -14.5F, 10.0F);
/*      */     
/* 1275 */     this.gunModel['Đ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1276 */     this.gunModel['Đ'].setRotationPoint(-40.25F, -21.25F, 10.5F);
/*      */     
/* 1278 */     this.gunModel['đ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F);
/* 1279 */     this.gunModel['đ'].setRotationPoint(-40.75F, -21.25F, 10.5F);
/*      */     
/* 1281 */     this.gunModel['Ē'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F);
/* 1282 */     this.gunModel['Ē'].setRotationPoint(-39.75F, -21.25F, 10.5F);
/*      */     
/* 1284 */     this.gunModel['ē'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1285 */     this.gunModel['ē'].setRotationPoint(-39.25F, -20.5F, 10.0F);
/*      */     
/* 1287 */     this.gunModel['Ĕ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.gunModel['Ĕ'].setRotationPoint(-40.25F, -20.5F, 10.0F);
/*      */     
/* 1290 */     this.gunModel['ĕ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1291 */     this.gunModel['ĕ'].setRotationPoint(-41.25F, -20.5F, 10.0F);
/*      */     
/* 1293 */     this.gunModel['Ė'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1294 */     this.gunModel['Ė'].setRotationPoint(-40.25F, -19.75F, 10.5F);
/*      */     
/* 1296 */     this.gunModel['ė'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F);
/* 1297 */     this.gunModel['ė'].setRotationPoint(-40.75F, -19.75F, 10.5F);
/*      */     
/* 1299 */     this.gunModel['Ę'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F);
/* 1300 */     this.gunModel['Ę'].setRotationPoint(-39.75F, -19.75F, 10.5F);
/*      */     
/* 1302 */     this.gunModel['ę'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 2, 0.0F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F);
/* 1303 */     this.gunModel['ę'].setRotationPoint(-41.15F, -19.5F, 10.35F);
/*      */     
/* 1305 */     this.gunModel['Ě'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F);
/* 1306 */     this.gunModel['Ě'].setRotationPoint(-39.4F, -19.5F, 10.35F);
/*      */     
/* 1308 */     this.gunModel['ě'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F);
/* 1309 */     this.gunModel['ě'].setRotationPoint(-40.4F, -19.5F, 10.35F);
/*      */     
/* 1311 */     this.gunModel['Ĝ'].addShapeBox(25.0F, -6.0F, -7.0F, 60, 1, 9, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/* 1312 */     this.gunModel['Ĝ'].setRotationPoint(-38.0F, -18.05F, 2.5F);
/*      */     
/* 1314 */     this.gunModel['ĝ'].addShapeBox(25.0F, -6.0F, -7.0F, 9, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1315 */     this.gunModel['ĝ'].setRotationPoint(-37.0F, -24.25F, 11.5F);
/*      */     
/* 1317 */     this.gunModel['Ğ'].addShapeBox(25.0F, -6.0F, -7.0F, 9, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1318 */     this.gunModel['Ğ'].setRotationPoint(-23.5F, -20.25F, 11.5F);
/*      */     
/* 1320 */     this.gunModel['ğ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1321 */     this.gunModel['ğ'].setRotationPoint(-11.0F, -24.25F, 11.5F);
/*      */     
/* 1323 */     this.gunModel['Ġ'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1324 */     this.gunModel['Ġ'].setRotationPoint(-0.5F, -20.25F, 11.5F);
/*      */     
/* 1326 */     this.gunModel['ġ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1327 */     this.gunModel['ġ'].setRotationPoint(5.5F, -20.25F, 11.5F);
/*      */     
/* 1329 */     this.gunModel['Ģ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1330 */     this.gunModel['Ģ'].setRotationPoint(14.5F, -24.25F, 11.5F);
/*      */     
/* 1332 */     this.gunModel['ģ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1333 */     this.gunModel['ģ'].setRotationPoint(21.5F, -24.25F, 11.5F);
/*      */     
/* 1335 */     this.gunModel['Ĥ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     this.gunModel['Ĥ'].setRotationPoint(14.0F, -24.25F, 11.5F);
/*      */     
/* 1338 */     this.gunModel['ĥ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1339 */     this.gunModel['ĥ'].setRotationPoint(-23.5F, -20.75F, 11.25F);
/*      */     
/* 1341 */     this.gunModel['Ħ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 2, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/* 1342 */     this.gunModel['Ħ'].setRotationPoint(-16.5F, -20.75F, 11.25F);
/*      */     
/* 1344 */     this.gunModel['ħ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 1345 */     this.gunModel['ħ'].setRotationPoint(4.5F, -20.75F, 11.25F);
/*      */     
/* 1347 */     this.gunModel['Ĩ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1348 */     this.gunModel['Ĩ'].setRotationPoint(-1.5F, -20.25F, 11.5F);
/*      */     
/* 1350 */     this.gunModel['ĩ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 1351 */     this.gunModel['ĩ'].setRotationPoint(-0.5F, -20.75F, 11.25F);
/*      */     
/* 1353 */     this.gunModel['Ī'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F);
/* 1354 */     this.gunModel['Ī'].setRotationPoint(-5.0F, -22.25F, 11.25F);
/*      */     
/* 1356 */     this.gunModel['ī'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1357 */     this.gunModel['ī'].setRotationPoint(-11.0F, -22.25F, 11.25F);
/*      */     
/* 1359 */     this.gunModel['Ĭ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1360 */     this.gunModel['Ĭ'].setRotationPoint(14.0F, -22.25F, 11.25F);
/*      */     
/* 1362 */     this.gunModel['ĭ'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1363 */     this.gunModel['ĭ'].setRotationPoint(19.5F, -22.25F, 11.5F);
/*      */     
/* 1365 */     this.gunModel['Į'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F);
/* 1366 */     this.gunModel['Į'].setRotationPoint(19.5F, -20.25F, 11.25F);
/*      */     
/* 1368 */     this.gunModel['į'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1369 */     this.gunModel['į'].setRotationPoint(-29.0F, -22.25F, 11.25F);
/*      */     
/* 1371 */     this.gunModel['İ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1372 */     this.gunModel['İ'].setRotationPoint(-37.0F, -22.25F, 11.25F);
/*      */     
/* 1374 */     this.gunModel['ı'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1375 */     this.gunModel['ı'].setRotationPoint(-38.0F, -24.0F, 1.5F);
/*      */     
/* 1377 */     this.gunModel['Ĳ'].addShapeBox(25.0F, -6.0F, -7.0F, 60, 6, 9, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1378 */     this.gunModel['Ĳ'].setRotationPoint(-37.5F, -24.0F, 2.5F);
/*      */     
/* 1380 */     this.gunModel['ĳ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 8, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1381 */     this.gunModel['ĳ'].setRotationPoint(-22.0F, -15.5F, 4.25F);
/*      */     
/* 1383 */     this.gunModel['Ĵ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F);
/* 1384 */     this.gunModel['Ĵ'].setRotationPoint(-22.0F, -16.0F, 4.25F);
/*      */     
/* 1386 */     this.gunModel['ĵ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 8, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1387 */     this.gunModel['ĵ'].setRotationPoint(-22.0F, -16.5F, 4.25F);
/*      */     
/* 1389 */     this.gunModel['Ķ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 8, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1390 */     this.gunModel['Ķ'].setRotationPoint(-24.5F, -15.5F, 4.25F);
/*      */     
/* 1392 */     this.gunModel['ķ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F);
/* 1393 */     this.gunModel['ķ'].setRotationPoint(-24.5F, -16.0F, 4.25F);
/*      */     
/* 1395 */     this.gunModel['ĸ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 8, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1396 */     this.gunModel['ĸ'].setRotationPoint(-24.5F, -16.5F, 4.25F);
/*      */     
/* 1398 */     this.gunModel['Ĺ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 8, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.3F);
/* 1399 */     this.gunModel['Ĺ'].setRotationPoint(-23.25F, -13.5F, 4.0F);
/*      */     
/* 1401 */     this.gunModel['ĺ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F);
/* 1402 */     this.gunModel['ĺ'].setRotationPoint(-23.25F, -14.0F, 4.0F);
/*      */     
/* 1404 */     this.gunModel['Ļ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 8, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F);
/* 1405 */     this.gunModel['Ļ'].setRotationPoint(-23.25F, -14.5F, 4.0F);
/*      */     
/* 1407 */     this.gunModel['ļ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.gunModel['ļ'].setRotationPoint(-24.5F, -32.0F, 1.5F);
/*      */     
/* 1410 */     this.gunModel['Ľ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1411 */     this.gunModel['Ľ'].setRotationPoint(-24.5F, -33.0F, 3.0F);
/*      */     
/* 1413 */     this.gunModel['ľ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1414 */     this.gunModel['ľ'].setRotationPoint(-24.5F, -34.0F, 4.0F);
/*      */     
/* 1416 */     this.gunModel['Ŀ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1417 */     this.gunModel['Ŀ'].setRotationPoint(-24.5F, -27.0F, 1.5F);
/*      */     
/* 1419 */     this.gunModel['ŀ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.gunModel['ŀ'].setRotationPoint(-10.5F, -33.0F, 3.0F);
/*      */     
/* 1422 */     this.gunModel['Ł'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1423 */     this.gunModel['Ł'].setRotationPoint(-10.5F, -32.0F, 2.0F);
/*      */     
/* 1425 */     this.gunModel['ł'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1426 */     this.gunModel['ł'].setRotationPoint(157.0F, -33.0F, 4.0F);
/*      */     
/* 1428 */     this.gunModel['Ń'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1429 */     this.gunModel['Ń'].setRotationPoint(157.0F, -35.0F, 9.0F);
/*      */     
/* 1431 */     this.gunModel['ń'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1432 */     this.gunModel['ń'].setRotationPoint(157.0F, -36.0F, 9.0F);
/*      */     
/* 1434 */     this.gunModel['Ņ'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1435 */     this.gunModel['Ņ'].setRotationPoint(157.0F, -36.5F, 9.0F);
/*      */     
/* 1437 */     this.gunModel['ņ'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1438 */     this.gunModel['ņ'].setRotationPoint(157.0F, -36.0F, 4.0F);
/*      */     
/* 1440 */     this.gunModel['Ň'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, -1.0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1441 */     this.gunModel['Ň'].setRotationPoint(157.0F, -36.5F, 4.0F);
/*      */     
/* 1443 */     this.gunModel['ň'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1444 */     this.gunModel['ň'].setRotationPoint(157.0F, -34.0F, 4.0F);
/*      */     
/* 1446 */     this.gunModel['ŉ'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1447 */     this.gunModel['ŉ'].setRotationPoint(157.0F, -35.0F, 4.5F);
/*      */     
/* 1449 */     this.gunModel['Ŋ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1450 */     this.gunModel['Ŋ'].setRotationPoint(158.25F, -35.0F, 6.5F);
/*      */     
/* 1452 */     this.gunModel['ŋ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1453 */     this.gunModel['ŋ'].setRotationPoint(158.25F, -35.0F, 7.0F);
/*      */     
/* 1455 */     this.gunModel['Ō'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 1, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1456 */     this.gunModel['Ō'].setRotationPoint(158.25F, -35.0F, 6.0F);
/*      */     
/* 1458 */     this.gunModel['ō'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
/* 1459 */     this.gunModel['ō'].setRotationPoint(158.75F, -36.5F, 6.5F);
/*      */     
/* 1461 */     this.gunModel['Ŏ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1462 */     this.gunModel['Ŏ'].setRotationPoint(158.45F, -36.35F, 6.5F);
/*      */     
/* 1464 */     this.gunModel['ŏ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1465 */     this.gunModel['ŏ'].setRotationPoint(158.25F, -32.5F, 3.5F);
/*      */     
/* 1467 */     this.gunModel['Ő'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1468 */     this.gunModel['Ő'].setRotationPoint(158.25F, -32.0F, 3.5F);
/*      */     
/* 1470 */     this.gunModel['ő'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1471 */     this.gunModel['ő'].setRotationPoint(158.25F, -33.25F, 3.5F);
/*      */     
/* 1473 */     this.gunModel['Œ'].addShapeBox(25.0F, -6.0F, -7.0F, 18, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1474 */     this.gunModel['Œ'].setRotationPoint(58.0F, -32.0F, 4.0F);
/*      */     
/* 1476 */     this.gunModel['œ'].addShapeBox(25.0F, -6.0F, -7.0F, 15, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1477 */     this.gunModel['œ'].setRotationPoint(61.0F, -34.0F, 4.0F);
/*      */     
/* 1479 */     this.gunModel['Ŕ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1480 */     this.gunModel['Ŕ'].setRotationPoint(69.0F, -35.0F, 4.0F);
/*      */     
/* 1482 */     this.gunModel['ŕ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1483 */     this.gunModel['ŕ'].setRotationPoint(70.0F, -36.0F, 4.0F);
/*      */     
/* 1485 */     this.gunModel['Ŗ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1486 */     this.gunModel['Ŗ'].setRotationPoint(60.0F, -34.0F, 4.0F);
/*      */     
/* 1488 */     this.gunModel['ŗ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 5, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1489 */     this.gunModel['ŗ'].setRotationPoint(59.5F, -33.0F, 4.0F);
/*      */     
/* 1491 */     this.gunModel['Ř'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1492 */     this.gunModel['Ř'].setRotationPoint(69.0F, -35.0F, 9.0F);
/*      */     
/* 1494 */     this.gunModel['ř'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1495 */     this.gunModel['ř'].setRotationPoint(70.0F, -36.0F, 9.0F);
/*      */     
/* 1497 */     this.gunModel['Ś'].addShapeBox(25.0F, -6.0F, -7.0F, 15, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1498 */     this.gunModel['Ś'].setRotationPoint(61.0F, -34.0F, 9.0F);
/*      */     
/* 1500 */     this.gunModel['ś'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1501 */     this.gunModel['ś'].setRotationPoint(60.0F, -34.0F, 9.0F);
/*      */     
/* 1503 */     this.gunModel['Ŝ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1504 */     this.gunModel['Ŝ'].setRotationPoint(59.5F, -33.0F, 9.0F);
/*      */     
/* 1506 */     this.gunModel['ŝ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1507 */     this.gunModel['ŝ'].setRotationPoint(71.0F, -34.0F, 5.0F);
/*      */     
/* 1509 */     this.gunModel['Ş'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1510 */     this.gunModel['Ş'].setRotationPoint(60.5F, -33.0F, 5.0F);
/*      */     
/* 1512 */     this.gunModel['ş'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 2, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1513 */     this.gunModel['ş'].setRotationPoint(67.0F, -34.0F, 5.0F);
/*      */     
/* 1515 */     this.gunModel['Š'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1516 */     this.gunModel['Š'].setRotationPoint(58.0F, -34.0F, 3.5F);
/*      */     
/* 1518 */     this.gunModel['š'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1519 */     this.gunModel['š'].setRotationPoint(58.0F, -33.5F, 3.5F);
/*      */     
/* 1521 */     this.gunModel['Ţ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1522 */     this.gunModel['Ţ'].setRotationPoint(58.0F, -34.75F, 3.5F);
/*      */     
/* 1524 */     this.gunModel['ţ'].addShapeBox(25.0F, -6.0F, -7.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1525 */     this.gunModel['ţ'].setRotationPoint(59.75F, -34.0F, 5.5F);
/*      */     
/* 1527 */     this.gunModel['Ť'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 1, 4, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1528 */     this.gunModel['Ť'].setRotationPoint(72.0F, -35.0F, 5.0F);
/*      */     
/* 1530 */     this.gunModel['ť'].addShapeBox(25.0F, -6.0F, -7.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1531 */     this.gunModel['ť'].setRotationPoint(59.75F, -34.0F, 7.5F);
/*      */     
/* 1533 */     this.gunModel['Ŧ'].addShapeBox(25.0F, -6.0F, -7.0F, 14, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1534 */     this.gunModel['Ŧ'].setRotationPoint(59.75F, -34.0F, 6.5F);
/*      */     
/* 1536 */     this.gunModel['ŧ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1537 */     this.gunModel['ŧ'].setRotationPoint(57.0F, -34.0F, 5.0F);
/*      */     
/* 1539 */     this.gunModel['Ũ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1540 */     this.gunModel['Ũ'].setRotationPoint(57.0F, -35.0F, 5.0F);
/*      */     
/* 1542 */     this.gunModel['ũ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1543 */     this.gunModel['ũ'].setRotationPoint(57.0F, -37.0F, 4.25F);
/*      */     
/* 1545 */     this.gunModel['Ū'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1546 */     this.gunModel['Ū'].setRotationPoint(57.0F, -37.0F, 8.75F);
/*      */     
/* 1548 */     this.gunModel['ū'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1549 */     this.gunModel['ū'].setRotationPoint(57.0F, -36.0F, 5.25F);
/*      */     
/* 1551 */     this.gunModel['Ŭ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1552 */     this.gunModel['Ŭ'].setRotationPoint(57.0F, -37.0F, 6.75F);
/*      */     
/* 1554 */     this.gunModel['ŭ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
/* 1555 */     this.gunModel['ŭ'].setRotationPoint(57.0F, -37.0F, 5.25F);
/*      */     
/* 1557 */     this.gunModel['Ů'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1558 */     this.gunModel['Ů'].setRotationPoint(57.0F, -37.0F, 6.25F);
/*      */     
/* 1560 */     this.gunModel['ů'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
/* 1561 */     this.gunModel['ů'].setRotationPoint(57.0F, -37.0F, 5.75F);
/*      */     
/* 1563 */     this.gunModel['Ű'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1564 */     this.gunModel['Ű'].setRotationPoint(71.0F, -34.5F, 3.5F);
/*      */     
/* 1566 */     this.gunModel['ű'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1567 */     this.gunModel['ű'].setRotationPoint(71.0F, -34.0F, 3.5F);
/*      */     
/* 1569 */     this.gunModel['Ų'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1570 */     this.gunModel['Ų'].setRotationPoint(71.0F, -35.25F, 3.5F);
/*      */     
/* 1572 */     this.gunModel['ų'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1573 */     this.gunModel['ų'].setRotationPoint(56.65F, -36.5F, 4.75F);
/*      */     
/* 1575 */     this.gunModel['Ŵ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1576 */     this.gunModel['Ŵ'].setRotationPoint(56.65F, -36.5F, 8.25F);
/*      */     
/* 1578 */     this.gunModel['ŵ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1579 */     this.gunModel['ŵ'].setRotationPoint(-30.5F, -34.5F, 6.5F);
/*      */     
/* 1581 */     this.gunModel['Ŷ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1582 */     this.gunModel['Ŷ'].setRotationPoint(-30.5F, -34.5F, 7.0F);
/*      */     
/* 1584 */     this.gunModel['ŷ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 2, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1585 */     this.gunModel['ŷ'].setRotationPoint(-30.5F, -34.5F, 6.0F);
/*      */     
/* 1587 */     this.gunModel['Ÿ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1588 */     this.gunModel['Ÿ'].setRotationPoint(-20.5F, -34.5F, 6.5F);
/*      */     
/* 1590 */     this.gunModel['Ź'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1591 */     this.gunModel['Ź'].setRotationPoint(-20.5F, -34.5F, 7.0F);
/*      */     
/* 1593 */     this.gunModel['ź'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1594 */     this.gunModel['ź'].setRotationPoint(-20.5F, -34.5F, 6.0F);
/*      */     
/* 1596 */     this.gunModel['Ż'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1597 */     this.gunModel['Ż'].setRotationPoint(-7.0F, -34.5F, 6.5F);
/*      */     
/* 1599 */     this.gunModel['ż'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1600 */     this.gunModel['ż'].setRotationPoint(-7.0F, -34.5F, 7.0F);
/*      */     
/* 1602 */     this.gunModel['Ž'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1603 */     this.gunModel['Ž'].setRotationPoint(-7.0F, -34.5F, 6.0F);
/*      */     
/* 1605 */     this.gunModel['ž'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1606 */     this.gunModel['ž'].setRotationPoint(6.5F, -34.5F, 6.5F);
/*      */     
/* 1608 */     this.gunModel['ſ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1609 */     this.gunModel['ſ'].setRotationPoint(6.5F, -34.5F, 7.0F);
/*      */     
/* 1611 */     this.gunModel['ƀ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1612 */     this.gunModel['ƀ'].setRotationPoint(6.5F, -34.5F, 6.0F);
/*      */     
/* 1614 */     this.gunModel['Ɓ'].addShapeBox(25.0F, -6.0F, -7.0F, 43, 5, 5, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 1615 */     this.gunModel['Ɓ'].setRotationPoint(-19.0F, -30.0F, 6.5F);
/*      */     
/* 1617 */     this.gunModel['Ƃ'].addShapeBox(25.0F, -6.0F, -7.0F, 44, 3, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1618 */     this.gunModel['Ƃ'].setRotationPoint(-19.0F, -33.0F, 6.5F);
/*      */     
/* 1620 */     this.gunModel['ƃ'].addShapeBox(25.0F, -6.0F, -7.0F, 44, 1, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1621 */     this.gunModel['ƃ'].setRotationPoint(-19.0F, -25.0F, 5.0F);
/*      */     
/* 1623 */     this.gunModel['Ƅ'].addShapeBox(25.0F, -6.0F, -7.0F, 44, 1, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1624 */     this.gunModel['Ƅ'].setRotationPoint(-19.0F, -25.5F, 5.0F);
/*      */     
/* 1626 */     this.gunModel['ƅ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1627 */     this.gunModel['ƅ'].setRotationPoint(-19.0F, -25.0F, 1.0F);
/*      */     
/* 1629 */     this.gunModel['Ɔ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 4, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1630 */     this.gunModel['Ɔ'].setRotationPoint(-19.0F, -25.5F, 1.0F);
/*      */     
/* 1632 */     this.gunModel['Ƈ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1633 */     this.gunModel['Ƈ'].setRotationPoint(-19.0F, -30.0F, 2.5F);
/*      */     
/* 1635 */     this.gunModel['ƈ'].addShapeBox(25.0F, -6.0F, -7.0F, 17, 3, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1636 */     this.gunModel['ƈ'].setRotationPoint(-19.0F, -33.0F, 3.5F);
/*      */     
/* 1638 */     this.gunModel['Ɖ'].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1639 */     this.gunModel['Ɖ'].setRotationPoint(-14.0F, -27.0F, 1.0F);
/*      */     
/* 1641 */     this.gunModel['Ɗ'].addShapeBox(25.0F, -6.0F, -7.0F, 12, 1, 4, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1642 */     this.gunModel['Ɗ'].setRotationPoint(-14.0F, -27.5F, 1.0F);
/*      */     
/* 1644 */     this.gunModel['Ƌ'].addShapeBox(25.0F, -6.0F, -7.0F, 12, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.25F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, 1.0F, 0.0F, -1.0F, 1.0F);
/* 1645 */     this.gunModel['Ƌ'].setRotationPoint(-14.0F, -30.0F, 2.5F);
/*      */     
/* 1647 */     this.gunModel['ƌ'].addShapeBox(25.0F, -6.0F, -7.0F, 26, 2, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/* 1648 */     this.gunModel['ƌ'].setRotationPoint(-2.0F, -33.0F, 3.5F);
/*      */     
/* 1650 */     this.gunModel['ƍ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 3, 4, 0.0F, 0.0F, -2.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, -2.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1651 */     this.gunModel['ƍ'].setRotationPoint(-19.0F, -27.0F, 1.5F);
/*      */     
/* 1653 */     this.gunModel['Ǝ'].addShapeBox(25.0F, -6.0F, -7.0F, 12, 3, 4, 0.0F, 0.0F, -1.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, -1.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1654 */     this.gunModel['Ǝ'].setRotationPoint(-14.0F, -27.0F, 1.5F);
/*      */     
/* 1656 */     this.gunModel['Ə'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.9F, 0.5F, 0.0F, -0.9F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, -0.6F, -0.5F, -1.5F, -0.6F, -0.5F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F);
/* 1657 */     this.gunModel['Ə'].setRotationPoint(-2.0F, -31.5F, 2.5F);
/*      */     
/* 1659 */     this.gunModel['Ɛ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.1F, -0.5F, 0.0F, -1.1F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, -0.8F, -1.0F, -1.5F, -0.8F, -1.0F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F);
/* 1660 */     this.gunModel['Ɛ'].setRotationPoint(-2.0F, -31.0F, 2.0F);
/*      */     
/* 1662 */     this.gunModel['Ƒ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1663 */     this.gunModel['Ƒ'].setRotationPoint(-2.0F, -28.5F, 1.0F);
/*      */     
/* 1665 */     this.gunModel['ƒ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1666 */     this.gunModel['ƒ'].setRotationPoint(-2.0F, -28.0F, 1.0F);
/*      */     
/* 1668 */     this.gunModel['Ɠ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1669 */     this.gunModel['Ɠ'].setRotationPoint(-2.0F, -27.0F, 1.5F);
/*      */     
/* 1671 */     this.gunModel['Ɣ'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1672 */     this.gunModel['Ɣ'].setRotationPoint(-20.0F, -20.25F, 0.5F);
/*      */     
/* 1674 */     this.gunModel['ƕ'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1675 */     this.gunModel['ƕ'].setRotationPoint(-20.0F, -19.25F, 0.5F);
/*      */     
/* 1677 */     this.gunModel['Ɩ'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1678 */     this.gunModel['Ɩ'].setRotationPoint(-20.0F, -21.25F, 0.5F);
/*      */     
/* 1680 */     this.gunModel['Ɨ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1681 */     this.gunModel['Ɨ'].setRotationPoint(-17.0F, -20.25F, 0.5F);
/*      */     
/* 1683 */     this.gunModel['Ƙ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 1, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1684 */     this.gunModel['Ƙ'].setRotationPoint(-17.0F, -21.25F, 0.5F);
/*      */     
/* 1686 */     this.gunModel['ƙ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1687 */     this.gunModel['ƙ'].setRotationPoint(-12.0F, -24.25F, 0.5F);
/*      */     
/* 1689 */     this.gunModel['ƚ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1690 */     this.gunModel['ƚ'].setRotationPoint(-5.0F, -25.25F, 0.5F);
/*      */     
/* 1692 */     this.gunModel['ƛ'].addShapeBox(25.0F, -6.0F, -7.0F, 12, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1693 */     this.gunModel['ƛ'].setRotationPoint(-18.0F, -20.75F, 1.0F);
/*      */     
/* 1695 */     this.gunModel['Ɯ'].addShapeBox(25.0F, -6.0F, -7.0F, 5, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1696 */     this.gunModel['Ɯ'].setRotationPoint(-6.0F, -25.75F, 1.0F);
/*      */     
/* 1698 */     this.gunModel['Ɲ'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1699 */     this.gunModel['Ɲ'].setRotationPoint(-18.0F, -22.75F, 1.0F);
/*      */     
/* 1701 */     this.gunModel['ƞ'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1702 */     this.gunModel['ƞ'].setRotationPoint(-12.0F, -25.75F, 1.0F);
/*      */     
/* 1704 */     this.gunModel['Ɵ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1705 */     this.gunModel['Ɵ'].setRotationPoint(-19.0F, -22.25F, 1.0F);
/*      */     
/* 1707 */     this.gunModel['Ơ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1708 */     this.gunModel['Ơ'].setRotationPoint(-37.25F, -32.75F, 6.0F);
/*      */     
/* 1710 */     this.gunModel['ơ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 6, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1711 */     this.gunModel['ơ'].setRotationPoint(51.5F, -26.0F, 11.5F);
/*      */     
/* 1713 */     this.gunModel['Ƣ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 6, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1714 */     this.gunModel['Ƣ'].setRotationPoint(53.5F, -26.0F, 11.5F);
/*      */     
/* 1716 */     this.gunModel['ƣ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1717 */     this.gunModel['ƣ'].setRotationPoint(52.0F, -25.0F, 11.5F);
/*      */     
/* 1719 */     this.gunModel['Ƥ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 1720 */     this.gunModel['Ƥ'].setRotationPoint(52.0F, -25.0F, 13.5F);
/*      */     
/* 1722 */     this.gunModel['ƥ'].addShapeBox(25.0F, -6.0F, -7.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1723 */     this.gunModel['ƥ'].setRotationPoint(51.0F, -27.0F, 0.0F);
/*      */     
/* 1725 */     this.gunModel['Ʀ'].addShapeBox(25.0F, -6.0F, -7.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1726 */     this.gunModel['Ʀ'].setRotationPoint(-54.0F, -18.5F, 3.5F);
/*      */     
/* 1728 */     this.gunModel['Ƨ'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 3, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1729 */     this.gunModel['Ƨ'].setRotationPoint(-54.0F, -21.5F, 3.5F);
/*      */     
/* 1731 */     this.gunModel['ƨ'].addShapeBox(25.0F, -6.0F, -7.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1732 */     this.gunModel['ƨ'].setRotationPoint(-54.0F, -18.5F, 3.5F);
/*      */     
/* 1734 */     this.gunModel['Ʃ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1735 */     this.gunModel['Ʃ'].setRotationPoint(-53.0F, -22.5F, 2.0F);
/*      */     
/* 1737 */     this.gunModel['ƪ'].addShapeBox(25.0F, -6.0F, -7.0F, 7, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F);
/* 1738 */     this.gunModel['ƪ'].setRotationPoint(-56.0F, -18.75F, 2.25F);
/*      */     
/* 1740 */     this.gunModel['ƫ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1741 */     this.gunModel['ƫ'].setRotationPoint(-56.0F, -21.75F, 2.25F);
/*      */     
/* 1743 */     this.gunModel['Ƭ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1744 */     this.gunModel['Ƭ'].setRotationPoint(-49.5F, -21.75F, 2.25F);
/*      */     
/* 1746 */     this.gunModel['ƭ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, -1.0F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, -1.0F, -1.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/* 1747 */     this.gunModel['ƭ'].setRotationPoint(-50.0F, -20.25F, 2.25F);
/*      */     
/* 1749 */     this.gunModel['Ʈ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, 0.5F, -1.25F, -0.25F, -1.0F, -1.25F, -0.25F, -1.0F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1750 */     this.gunModel['Ʈ'].setRotationPoint(-56.0F, -20.25F, 2.25F);
/*      */     
/* 1752 */     this.gunModel['Ư'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F);
/* 1753 */     this.gunModel['Ư'].setRotationPoint(-49.0F, -20.75F, 2.25F);
/*      */     
/* 1755 */     this.gunModel['ư'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F);
/* 1756 */     this.gunModel['ư'].setRotationPoint(-56.5F, -20.75F, 2.25F);
/*      */     
/* 1758 */     this.gunModel['Ʊ'].addShapeBox(25.0F, -6.0F, -7.0F, 6, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F);
/* 1759 */     this.gunModel['Ʊ'].setRotationPoint(-55.5F, -22.25F, 2.25F);
/*      */     
/* 1761 */     this.gunModel['Ʋ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -1.0F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, -1.0F, -1.25F, -0.25F);
/* 1762 */     this.gunModel['Ʋ'].setRotationPoint(-50.0F, -21.25F, 2.25F);
/*      */     
/* 1764 */     this.gunModel['Ƴ'].addShapeBox(25.0F, -6.0F, -7.0F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.5F, -1.25F, -0.25F, -1.0F, -1.25F, -0.25F, -1.0F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F);
/* 1765 */     this.gunModel['Ƴ'].setRotationPoint(-56.0F, -21.25F, 2.25F);
/*      */     
/*      */ 
/* 1768 */     this.ammoModel = new ModelRendererTurbo[23];
/* 1769 */     this.ammoModel[0] = new ModelRendererTurbo(this, 409, 145, this.textureX, this.textureY);
/* 1770 */     this.ammoModel[1] = new ModelRendererTurbo(this, 105, 161, this.textureX, this.textureY);
/* 1771 */     this.ammoModel[2] = new ModelRendererTurbo(this, 169, 161, this.textureX, this.textureY);
/* 1772 */     this.ammoModel[3] = new ModelRendererTurbo(this, 233, 161, this.textureX, this.textureY);
/* 1773 */     this.ammoModel[4] = new ModelRendererTurbo(this, 297, 161, this.textureX, this.textureY);
/* 1774 */     this.ammoModel[5] = new ModelRendererTurbo(this, 161, 177, this.textureX, this.textureY);
/* 1775 */     this.ammoModel[6] = new ModelRendererTurbo(this, 89, 273, this.textureX, this.textureY);
/* 1776 */     this.ammoModel[7] = new ModelRendererTurbo(this, 137, 273, this.textureX, this.textureY);
/* 1777 */     this.ammoModel[8] = new ModelRendererTurbo(this, 185, 273, this.textureX, this.textureY);
/* 1778 */     this.ammoModel[9] = new ModelRendererTurbo(this, 233, 273, this.textureX, this.textureY);
/* 1779 */     this.ammoModel[10] = new ModelRendererTurbo(this, 273, 273, this.textureX, this.textureY);
/* 1780 */     this.ammoModel[11] = new ModelRendererTurbo(this, 321, 273, this.textureX, this.textureY);
/* 1781 */     this.ammoModel[12] = new ModelRendererTurbo(this, 361, 273, this.textureX, this.textureY);
/* 1782 */     this.ammoModel[13] = new ModelRendererTurbo(this, 409, 273, this.textureX, this.textureY);
/* 1783 */     this.ammoModel[14] = new ModelRendererTurbo(this, 449, 273, this.textureX, this.textureY);
/* 1784 */     this.ammoModel[15] = new ModelRendererTurbo(this, 49, 281, this.textureX, this.textureY);
/* 1785 */     this.ammoModel[16] = new ModelRendererTurbo(this, 1, 289, this.textureX, this.textureY);
/* 1786 */     this.ammoModel[17] = new ModelRendererTurbo(this, 81, 289, this.textureX, this.textureY);
/* 1787 */     this.ammoModel[18] = new ModelRendererTurbo(this, 121, 289, this.textureX, this.textureY);
/* 1788 */     this.ammoModel[19] = new ModelRendererTurbo(this, 169, 289, this.textureX, this.textureY);
/* 1789 */     this.ammoModel[20] = new ModelRendererTurbo(this, 209, 289, this.textureX, this.textureY);
/* 1790 */     this.ammoModel[21] = new ModelRendererTurbo(this, 257, 289, this.textureX, this.textureY);
/* 1791 */     this.ammoModel[22] = new ModelRendererTurbo(this, 297, 289, this.textureX, this.textureY);
/*      */     
/* 1793 */     this.ammoModel[0].addShapeBox(25.0F, -6.0F, -7.0F, 21, 10, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1794 */     this.ammoModel[0].setRotationPoint(4.5F, -1.0F, 3.0F);
/*      */     
/* 1796 */     this.ammoModel[1].addShapeBox(25.0F, -6.0F, -7.0F, 21, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1797 */     this.ammoModel[1].setRotationPoint(6.5F, 9.0F, 3.0F);
/*      */     
/* 1799 */     this.ammoModel[2].addShapeBox(25.0F, -6.0F, -7.0F, 21, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 7.5F, 0.0F, 3.25F, 0.5F, 0.0F, 3.25F, 0.5F, 0.0F, -3.0F, 7.5F, 0.0F);
/* 1800 */     this.ammoModel[2].setRotationPoint(8.5F, 17.0F, 3.0F);
/*      */     
/* 1802 */     this.ammoModel[3].addShapeBox(25.0F, -6.0F, -7.0F, 21, 10, 8, 0.0F, 2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1803 */     this.ammoModel[3].setRotationPoint(4.5F, -11.0F, 3.0F);
/*      */     
/* 1805 */     this.ammoModel[4].addShapeBox(25.0F, -6.0F, -7.0F, 21, 5, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1806 */     this.ammoModel[4].setRotationPoint(2.5F, -16.0F, 3.0F);
/*      */     
/* 1808 */     this.ammoModel[5].addShapeBox(25.0F, -6.0F, -7.0F, 22, 4, 9, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, -1.5F, 8.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 8.0F, 0.0F);
/* 1809 */     this.ammoModel[5].setRotationPoint(11.0F, 20.5F, 2.5F);
/*      */     
/* 1811 */     this.ammoModel[6].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1812 */     this.ammoModel[6].setRotationPoint(10.5F, -7.0F, 2.5F);
/*      */     
/* 1814 */     this.ammoModel[7].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1815 */     this.ammoModel[7].setRotationPoint(4.5F, -4.5F, 2.5F);
/*      */     
/* 1817 */     this.ammoModel[8].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, 0.75F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 1.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1818 */     this.ammoModel[8].setRotationPoint(11.5F, -3.0F, 2.5F);
/*      */     
/* 1820 */     this.ammoModel[9].addShapeBox(25.0F, -6.0F, -7.0F, 10, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.25F, 0.0F, 1.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -2.75F, 0.0F, 1.0F, -2.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1821 */     this.ammoModel[9].setRotationPoint(5.5F, -0.5F, 2.5F);
/*      */     
/* 1823 */     this.ammoModel[10].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, 2.25F, 0.0F, 1.0F, 2.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -2.75F, 0.0F, 1.0F, -2.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1824 */     this.ammoModel[10].setRotationPoint(11.5F, 0.0F, 2.5F);
/*      */     
/* 1826 */     this.ammoModel[11].addShapeBox(25.0F, -6.0F, -7.0F, 10, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.5F, 0.0F, 1.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1827 */     this.ammoModel[11].setRotationPoint(6.5F, 3.5F, 2.5F);
/*      */     
/* 1829 */     this.ammoModel[12].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.75F, 0.0F, 1.0F, 1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.25F, 0.0F, 1.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1830 */     this.ammoModel[12].setRotationPoint(12.5F, 3.5F, 2.5F);
/*      */     
/* 1832 */     this.ammoModel[13].addShapeBox(25.0F, -6.0F, -7.0F, 10, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.25F, 0.0F, 1.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -2.75F, 0.0F, 1.0F, -2.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1833 */     this.ammoModel[13].setRotationPoint(7.5F, 7.0F, 2.5F);
/*      */     
/* 1835 */     this.ammoModel[14].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, 2.5F, 0.0F, 1.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1836 */     this.ammoModel[14].setRotationPoint(13.5F, 7.5F, 2.5F);
/*      */     
/* 1838 */     this.ammoModel[15].addShapeBox(25.0F, -6.0F, -7.0F, 10, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.75F, 0.0F, 1.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1839 */     this.ammoModel[15].setRotationPoint(8.5F, 11.0F, 2.5F);
/*      */     
/* 1841 */     this.ammoModel[16].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, 2.75F, 0.0F, 1.0F, 2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1842 */     this.ammoModel[16].setRotationPoint(14.5F, 11.0F, 2.5F);
/*      */     
/* 1844 */     this.ammoModel[17].addShapeBox(25.0F, -6.0F, -7.0F, 10, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1845 */     this.ammoModel[17].setRotationPoint(9.5F, 15.0F, 2.5F);
/*      */     
/* 1847 */     this.ammoModel[18].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, 2.75F, 0.0F, 1.0F, 2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1848 */     this.ammoModel[18].setRotationPoint(15.5F, 15.0F, 2.5F);
/*      */     
/* 1850 */     this.ammoModel[19].addShapeBox(25.0F, -6.0F, -7.0F, 10, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1851 */     this.ammoModel[19].setRotationPoint(10.5F, 19.0F, 2.5F);
/*      */     
/* 1853 */     this.ammoModel[20].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 3.5F, 0.0F, 1.0F, 3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -4.0F, 0.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1854 */     this.ammoModel[20].setRotationPoint(17.5F, 19.0F, 2.5F);
/*      */     
/* 1856 */     this.ammoModel[21].addShapeBox(25.0F, -6.0F, -7.0F, 10, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 3.25F, 0.0F, 1.0F, 3.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.75F, 0.0F, 1.0F, -3.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1857 */     this.ammoModel[21].setRotationPoint(11.5F, 23.0F, 2.5F);
/*      */     
/* 1859 */     this.ammoModel[22].addShapeBox(25.0F, -6.0F, -7.0F, 11, 2, 9, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, 3.25F, 0.0F, 1.0F, 3.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, -3.75F, 0.0F, 1.0F, -3.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1860 */     this.ammoModel[22].setRotationPoint(18.5F, 22.5F, 2.5F);
/*      */     
/*      */ 
/* 1863 */     this.slideModel = new ModelRendererTurbo[7];
/* 1864 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 1865 */     this.slideModel[1] = new ModelRendererTurbo(this, 169, 161, this.textureX, this.textureY);
/* 1866 */     this.slideModel[2] = new ModelRendererTurbo(this, 233, 161, this.textureX, this.textureY);
/* 1867 */     this.slideModel[3] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/* 1868 */     this.slideModel[4] = new ModelRendererTurbo(this, 257, 193, this.textureX, this.textureY);
/* 1869 */     this.slideModel[5] = new ModelRendererTurbo(this, 361, 161, this.textureX, this.textureY);
/* 1870 */     this.slideModel[6] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*      */     
/* 1872 */     this.slideModel[0].addShapeBox(25.0F, -6.0F, -7.0F, 26, 7, 2, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1873 */     this.slideModel[0].setRotationPoint(-2.0F, -31.0F, 2.5F);
/*      */     
/* 1875 */     this.slideModel[1].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1876 */     this.slideModel[1].setRotationPoint(21.0F, -26.5F, 1.5F);
/*      */     
/* 1878 */     this.slideModel[2].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 1, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1879 */     this.slideModel[2].setRotationPoint(21.0F, -26.5F, 0.5F);
/*      */     
/* 1881 */     this.slideModel[3].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1882 */     this.slideModel[3].setRotationPoint(19.0F, -26.5F, -1.5F);
/*      */     
/* 1884 */     this.slideModel[4].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1885 */     this.slideModel[4].setRotationPoint(19.0F, -26.5F, -3.0F);
/*      */     
/* 1887 */     this.slideModel[5].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1888 */     this.slideModel[5].setRotationPoint(18.0F, -26.5F, -1.5F);
/*      */     
/* 1890 */     this.slideModel[6].addShapeBox(25.0F, -6.0F, -7.0F, 2, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1891 */     this.slideModel[6].setRotationPoint(20.0F, -26.5F, -3.5F);
/*      */     
/*      */ 
/* 1894 */     this.stockAttachPoint = new Vector3f(6.5F, 1.5625F, -0.0625F);
/*      */     
/* 1896 */     this.scopeAttachPoint = new Vector3f(-2.0F, 2.0625F, 0.4375F);
/*      */     
/* 1898 */     this.gripAttachPoint = new Vector3f(8.5F, 2.5F, 0.0F);
/*      */     
/*      */ 
/* 1901 */     translateAll(0.0F, -20.0F, 0.0F);
/* 1902 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.08F, 0.0F);
/*      */     
/* 1904 */     this.gunSlideDistance = 1.5F;
/* 1905 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*      */ 
/* 1909 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelasval.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */