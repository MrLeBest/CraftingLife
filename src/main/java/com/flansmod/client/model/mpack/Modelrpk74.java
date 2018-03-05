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
/*      */ public class Modelrpk74
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelrpk74()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ą'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 145, 97, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 201, 105, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 433, 105, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 41, 121, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 145, 137, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 89, 73, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 457, 105, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 281, 137, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 433, 129, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 377, 137, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 129, 145, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 201, 153, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 401, 161, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 121, 169, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 201, 169, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 265, 177, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 337, 177, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 401, 177, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 65, 185, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 369, 89, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 369, 97, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 185, 105, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 337, 193, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 153, 193, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 321, 201, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 1, 217, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 121, 185, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 393, 201, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 193, 225, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 465, 177, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 313, 225, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 313, 233, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 185, 241, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 457, 201, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 345, 241, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 105, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 161, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 249, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 145, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 225, 105, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 65, 177, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 17, 137, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 129, 193, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 137, 121, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 441, 201, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 121, 145, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 489, 241, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 297, 249, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 465, 161, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 185, 169, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 329, 177, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 393, 177, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 481, 289, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 73, 321, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 121, 337, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 457, 329, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 201, 265, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 217, 345, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 345, 345, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 1, 353, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 41, 353, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 73, 353, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 89, 121, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 449, 353, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 481, 353, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 265, 161, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 481, 273, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 97, 361, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 129, 361, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 161, 361, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 185, 361, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 65, 369, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 273, 265, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 209, 369, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 345, 265, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 249, 185, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 393, 201, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 457, 129, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 377, 137, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 265, 153, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 369, 169, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 385, 169, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 249, 369, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 497, 201, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 337, 345, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 481, 369, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 457, 177, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 41, 377, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 49, 193, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 57, 209, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 105, 377, this.textureX, this.textureY);
/*      */     
/*  283 */     this.gunModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -2.25F, 2.0F);
/*  284 */     this.gunModel[0].setRotationPoint(22.5F, -10.0F, -13.0F);
/*      */     
/*  286 */     this.gunModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, 1.0F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/*  287 */     this.gunModel[1].setRotationPoint(25.5F, -10.0F, -13.0F);
/*      */     
/*  289 */     this.gunModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 15, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  290 */     this.gunModel[2].setRotationPoint(22.5F, -25.0F, -15.0F);
/*      */     
/*  292 */     this.gunModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 5, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  293 */     this.gunModel[3].setRotationPoint(37.5F, -16.0F, -15.0F);
/*      */     
/*  295 */     this.gunModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 34, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F);
/*  296 */     this.gunModel[4].setRotationPoint(42.5F, -16.0F, -15.0F);
/*      */     
/*  298 */     this.gunModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 3, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.75F, -1.0F);
/*  299 */     this.gunModel[5].setRotationPoint(76.5F, -16.0F, -15.0F);
/*      */     
/*  301 */     this.gunModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.25F, -1.0F);
/*  302 */     this.gunModel[6].setRotationPoint(79.5F, -16.0F, -15.0F);
/*      */     
/*  304 */     this.gunModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 6, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  305 */     this.gunModel[7].setRotationPoint(37.5F, -25.0F, -15.0F);
/*      */     
/*  307 */     this.gunModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 2, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  308 */     this.gunModel[8].setRotationPoint(43.5F, -25.0F, -15.0F);
/*      */     
/*  310 */     this.gunModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 35, 7, 10, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  311 */     this.gunModel[9].setRotationPoint(45.5F, -23.0F, -12.0F);
/*      */     
/*  313 */     this.gunModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 15, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  314 */     this.gunModel[10].setRotationPoint(73.5F, -26.75F, -15.0F);
/*      */     
/*  316 */     this.gunModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 39, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  317 */     this.gunModel[11].setRotationPoint(41.5F, -28.75F, -15.0F);
/*      */     
/*  319 */     this.gunModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 16, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  320 */     this.gunModel[12].setRotationPoint(56.0F, -26.75F, -15.0F);
/*      */     
/*  322 */     this.gunModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  323 */     this.gunModel[13].setRotationPoint(41.5F, -26.75F, -15.0F);
/*      */     
/*  325 */     this.gunModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  326 */     this.gunModel[14].setRotationPoint(41.5F, -36.75F, -13.0F);
/*      */     
/*  328 */     this.gunModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 33, 3, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  329 */     this.gunModel[15].setRotationPoint(42.5F, -36.75F, -13.0F);
/*      */     
/*  331 */     this.gunModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  332 */     this.gunModel[16].setRotationPoint(75.5F, -35.75F, -13.0F);
/*      */     
/*  334 */     this.gunModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 17, 11, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  335 */     this.gunModel[17].setRotationPoint(20.5F, -35.75F, -13.0F);
/*      */     
/*  337 */     this.gunModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 10, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  338 */     this.gunModel[18].setRotationPoint(10.5F, -35.75F, -13.0F);
/*      */     
/*  340 */     this.gunModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 39, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  341 */     this.gunModel[19].setRotationPoint(41.5F, -33.75F, -15.0F);
/*      */     
/*  343 */     this.gunModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 15, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  344 */     this.gunModel[20].setRotationPoint(22.5F, -16.0F, -15.0F);
/*      */     
/*  346 */     this.gunModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  347 */     this.gunModel[21].setRotationPoint(39.5F, -28.75F, -15.0F);
/*      */     
/*  349 */     this.gunModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  350 */     this.gunModel[22].setRotationPoint(39.5F, -33.75F, -15.0F);
/*      */     
/*  352 */     this.gunModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  353 */     this.gunModel[23].setRotationPoint(39.5F, -35.75F, -13.0F);
/*      */     
/*  355 */     this.gunModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  356 */     this.gunModel[24].setRotationPoint(37.5F, -35.25F, -11.5F);
/*      */     
/*  358 */     this.gunModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  359 */     this.gunModel[25].setRotationPoint(37.5F, -29.25F, -11.5F);
/*      */     
/*  361 */     this.gunModel[26].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  362 */     this.gunModel[26].setRotationPoint(37.5F, -32.25F, -11.5F);
/*      */     
/*  364 */     this.gunModel[27].addShapeBox(59.0F, -19.0F, 7.0F, 48, 15, 16, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  365 */     this.gunModel[27].setRotationPoint(-84.5F, -20.75F, -15.0F);
/*      */     
/*  367 */     this.gunModel[28].addShapeBox(59.0F, -19.0F, 7.0F, 44, 4, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.75F, 0.0F, 0.25F, -3.75F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  368 */     this.gunModel[28].setRotationPoint(-24.5F, -9.75F, -15.0F);
/*      */     
/*  370 */     this.gunModel[29].addShapeBox(59.0F, -19.0F, 7.0F, 2, 18, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.75F, 0.0F, 0.75F, -2.5F, 0.0F, 0.75F, -2.5F, 0.0F, 0.0F, -3.75F, 0.0F);
/*  371 */     this.gunModel[29].setRotationPoint(19.75F, -23.75F, -15.0F);
/*      */     
/*  373 */     this.gunModel[30].addShapeBox(59.0F, -19.0F, 7.0F, 12, 15, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  374 */     this.gunModel[30].setRotationPoint(-36.5F, -20.75F, -15.0F);
/*      */     
/*  376 */     this.gunModel[31].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  377 */     this.gunModel[31].setRotationPoint(-36.5F, -7.75F, -15.0F);
/*      */     
/*  379 */     this.gunModel[32].addShapeBox(59.0F, -19.0F, 7.0F, 8, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  380 */     this.gunModel[32].setRotationPoint(-35.5F, -5.75F, -11.0F);
/*      */     
/*  382 */     this.gunModel[33].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  383 */     this.gunModel[33].setRotationPoint(-27.5F, -7.75F, -15.0F);
/*      */     
/*  385 */     this.gunModel[34].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  386 */     this.gunModel[34].setRotationPoint(-26.5F, -7.75F, -15.0F);
/*      */     
/*  388 */     this.gunModel[35].addShapeBox(59.0F, -19.0F, 7.0F, 30, 6, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  389 */     this.gunModel[35].setRotationPoint(-12.5F, -20.75F, -15.0F);
/*      */     
/*  391 */     this.gunModel[36].addShapeBox(59.0F, -19.0F, 7.0F, 30, 3, 16, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  392 */     this.gunModel[36].setRotationPoint(-12.5F, -13.75F, -15.0F);
/*      */     
/*  394 */     this.gunModel[37].addShapeBox(59.0F, -19.0F, 7.0F, 2, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  395 */     this.gunModel[37].setRotationPoint(17.75F, -20.75F, -15.0F);
/*      */     
/*  397 */     this.gunModel[38].addShapeBox(59.0F, -19.0F, 7.0F, 12, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  398 */     this.gunModel[38].setRotationPoint(-24.5F, -20.75F, -15.0F);
/*      */     
/*  400 */     this.gunModel[39].addShapeBox(59.0F, -19.0F, 7.0F, 30, 7, 15, 0.0F, 0.0F, -3.0F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F);
/*  401 */     this.gunModel[39].setRotationPoint(-12.5F, -19.75F, -14.5F);
/*      */     
/*  403 */     this.gunModel[40].addBox(59.0F, -19.0F, 7.0F, 25, 7, 7, 0.0F);
/*  404 */     this.gunModel[40].setRotationPoint(85.0F, -23.75F, -10.5F);
/*      */     
/*  406 */     this.gunModel[41].addBox(59.0F, -19.0F, 7.0F, 3, 8, 9, 0.0F);
/*  407 */     this.gunModel[41].setRotationPoint(82.0F, -24.25F, -11.5F);
/*      */     
/*  409 */     this.gunModel[42].addShapeBox(59.0F, -19.0F, 7.0F, 2, 10, 16, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  410 */     this.gunModel[42].setRotationPoint(80.0F, -25.75F, -15.0F);
/*      */     
/*  412 */     this.gunModel[43].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 16, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F);
/*  413 */     this.gunModel[43].setRotationPoint(80.0F, -15.75F, -15.0F);
/*      */     
/*  415 */     this.gunModel[44].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  416 */     this.gunModel[44].setRotationPoint(80.0F, -28.75F, -15.0F);
/*      */     
/*  418 */     this.gunModel[45].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  419 */     this.gunModel[45].setRotationPoint(80.0F, -33.75F, -15.0F);
/*      */     
/*  421 */     this.gunModel[46].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 12, 0.0F, -0.5F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, -0.5F, 0.5F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  422 */     this.gunModel[46].setRotationPoint(80.0F, -34.75F, -13.0F);
/*      */     
/*  424 */     this.gunModel[47].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F);
/*  425 */     this.gunModel[47].setRotationPoint(82.0F, -16.25F, -11.5F);
/*      */     
/*  427 */     this.gunModel[48].addBox(59.0F, -19.0F, 7.0F, 60, 7, 7, 0.0F);
/*  428 */     this.gunModel[48].setRotationPoint(124.0F, -23.75F, -10.5F);
/*      */     
/*  430 */     this.gunModel[49].addShapeBox(59.0F, -19.0F, 7.0F, 18, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  431 */     this.gunModel[49].setRotationPoint(106.0F, -24.25F, -11.0F);
/*      */     
/*  433 */     this.gunModel[50].addShapeBox(59.0F, -19.0F, 7.0F, 14, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  434 */     this.gunModel[50].setRotationPoint(184.0F, -24.25F, -11.0F);
/*      */     
/*  436 */     this.gunModel[51].addShapeBox(59.0F, -19.0F, 7.0F, 4, 6, 8, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  437 */     this.gunModel[51].setRotationPoint(186.75F, -30.25F, -11.0F);
/*      */     
/*  439 */     this.gunModel[52].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  440 */     this.gunModel[52].setRotationPoint(195.25F, -30.25F, -11.0F);
/*      */     
/*  442 */     this.gunModel[53].addShapeBox(59.0F, -19.0F, 7.0F, 7, 5, 8, 0.0F, -2.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  443 */     this.gunModel[53].setRotationPoint(190.25F, -35.25F, -11.0F);
/*      */     
/*  445 */     this.gunModel[54].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/*  446 */     this.gunModel[54].setRotationPoint(192.25F, -37.75F, -11.0F);
/*      */     
/*  448 */     this.gunModel[55].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/*  449 */     this.gunModel[55].setRotationPoint(192.25F, -37.75F, -4.5F);
/*      */     
/*  451 */     this.gunModel[56].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  452 */     this.gunModel[56].setRotationPoint(192.25F, -37.75F, -7.5F);
/*      */     
/*  454 */     this.gunModel[57].addBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F);
/*  455 */     this.gunModel[57].setRotationPoint(82.0F, -32.25F, -11.5F);
/*      */     
/*  457 */     this.gunModel[58].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  458 */     this.gunModel[58].setRotationPoint(82.0F, -34.25F, -11.5F);
/*      */     
/*  460 */     this.gunModel[59].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  461 */     this.gunModel[59].setRotationPoint(82.0F, -28.25F, -11.5F);
/*      */     
/*  463 */     this.gunModel[60].addShapeBox(59.0F, -19.0F, 7.0F, 27, 7, 7, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  464 */     this.gunModel[60].setRotationPoint(85.0F, -34.25F, -10.5F);
/*      */     
/*  466 */     this.gunModel[61].addShapeBox(59.0F, -19.0F, 7.0F, 6, 2, 6, 0.0F, -1.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/*  467 */     this.gunModel[61].setRotationPoint(112.0F, -26.75F, -10.0F);
/*      */     
/*  469 */     this.gunModel[62].addShapeBox(59.0F, -19.0F, 7.0F, 6, 1, 6, 0.0F, 0.0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 1.25F, -0.75F, 0.25F, 1.0F, -0.75F, 0.25F, 1.0F, -0.75F, 0.25F, 1.25F, -0.75F, 0.25F);
/*  470 */     this.gunModel[62].setRotationPoint(112.0F, -24.75F, -10.0F);
/*      */     
/*  472 */     this.gunModel[63].addShapeBox(59.0F, -19.0F, 7.0F, 33, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  473 */     this.gunModel[63].setRotationPoint(85.0F, -14.75F, -8.5F);
/*      */     
/*  475 */     this.gunModel[64].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  476 */     this.gunModel[64].setRotationPoint(116.0F, -16.25F, -9.5F);
/*      */     
/*  478 */     this.gunModel[65].addShapeBox(59.0F, -19.0F, 7.0F, 71, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  479 */     this.gunModel[65].setRotationPoint(122.0F, -14.75F, -8.5F);
/*      */     
/*  481 */     this.gunModel[66].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  482 */     this.gunModel[66].setRotationPoint(192.0F, -16.25F, -9.5F);
/*      */     
/*  484 */     this.gunModel[67].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F);
/*  485 */     this.gunModel[67].setRotationPoint(189.0F, -16.25F, -9.5F);
/*      */     
/*  487 */     this.gunModel[68].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/*  488 */     this.gunModel[68].setRotationPoint(192.0F, -16.25F, -9.5F);
/*      */     
/*  490 */     this.gunModel[69].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  491 */     this.gunModel[69].setRotationPoint(-35.5F, -0.75F, -11.0F);
/*      */     
/*  493 */     this.gunModel[70].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  494 */     this.gunModel[70].setRotationPoint(-35.5F, 1.25F, -11.0F);
/*      */     
/*  496 */     this.gunModel[71].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  497 */     this.gunModel[71].setRotationPoint(-35.5F, -7.75F, -15.0F);
/*      */     
/*  499 */     this.gunModel[72].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  500 */     this.gunModel[72].setRotationPoint(-29.5F, -0.75F, -9.0F);
/*      */     
/*  502 */     this.gunModel[73].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  503 */     this.gunModel[73].setRotationPoint(-30.0F, 1.25F, -9.0F);
/*      */     
/*  505 */     this.gunModel[74].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  506 */     this.gunModel[74].setRotationPoint(-30.0F, 2.25F, -9.0F);
/*      */     
/*  508 */     this.gunModel[75].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  509 */     this.gunModel[75].setRotationPoint(-28.0F, 3.25F, -9.0F);
/*      */     
/*  511 */     this.gunModel[76].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  512 */     this.gunModel[76].setRotationPoint(-28.0F, 4.25F, -9.0F);
/*      */     
/*  514 */     this.gunModel[77].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  515 */     this.gunModel[77].setRotationPoint(-28.0F, -6.75F, -9.0F);
/*      */     
/*  517 */     this.gunModel[78].addShapeBox(59.0F, -19.0F, 7.0F, 1, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  518 */     this.gunModel[78].setRotationPoint(-36.0F, -6.75F, -9.5F);
/*      */     
/*  520 */     this.gunModel[79].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  521 */     this.gunModel[79].setRotationPoint(-36.0F, 5.25F, -9.5F);
/*      */     
/*  523 */     this.gunModel[80].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 5, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  524 */     this.gunModel[80].setRotationPoint(-53.75F, 7.25F, -9.5F);
/*      */     
/*  526 */     this.gunModel[81].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  527 */     this.gunModel[81].setRotationPoint(-55.5F, 5.25F, -9.5F);
/*      */     
/*  529 */     this.gunModel[82].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  530 */     this.gunModel[82].setRotationPoint(-55.75F, 1.25F, -9.5F);
/*      */     
/*  532 */     this.gunModel[83].addShapeBox(59.0F, -19.0F, 7.0F, 28, 17, 16, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 3.0F, -1.0F);
/*  533 */     this.gunModel[83].setRotationPoint(-114.5F, -21.25F, -15.0F);
/*      */     
/*  535 */     this.gunModel[84].addShapeBox(59.0F, -19.0F, 7.0F, 49, 14, 14, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  536 */     this.gunModel[84].setRotationPoint(-163.5F, -15.25F, -14.0F);
/*      */     
/*  538 */     this.gunModel[85].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  539 */     this.gunModel[85].setRotationPoint(-170.0F, -11.25F, -13.0F);
/*      */     
/*  541 */     this.gunModel[86].addShapeBox(59.0F, -19.0F, 7.0F, 2, 13, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  542 */     this.gunModel[86].setRotationPoint(-170.0F, -9.25F, -13.0F);
/*      */     
/*  544 */     this.gunModel[87].addShapeBox(59.0F, -19.0F, 7.0F, 4, 17, 12, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  545 */     this.gunModel[87].setRotationPoint(-172.0F, 3.75F, -13.0F);
/*      */     
/*  547 */     this.gunModel[88].addShapeBox(59.0F, -19.0F, 7.0F, 26, 5, 12, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[88].setRotationPoint(-80.5F, -6.75F, -13.0F);
/*      */     
/*  550 */     this.gunModel[89].addShapeBox(59.0F, -19.0F, 7.0F, 24, 3, 12, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  551 */     this.gunModel[89].setRotationPoint(-79.5F, -1.75F, -13.0F);
/*      */     
/*  553 */     this.gunModel[90].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/*  554 */     this.gunModel[90].setRotationPoint(-79.5F, 1.25F, -13.0F);
/*      */     
/*  556 */     this.gunModel[91].addShapeBox(59.0F, -19.0F, 7.0F, 24, 1, 12, 0.0F, -1.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  557 */     this.gunModel[91].setRotationPoint(-79.5F, 3.25F, -13.0F);
/*      */     
/*  559 */     this.gunModel[92].addShapeBox(59.0F, -19.0F, 7.0F, 22, 1, 12, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/*  560 */     this.gunModel[92].setRotationPoint(-79.5F, 4.25F, -13.0F);
/*      */     
/*  562 */     this.gunModel[93].addShapeBox(59.0F, -19.0F, 7.0F, 22, 2, 12, 0.0F, -1.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  563 */     this.gunModel[93].setRotationPoint(-79.5F, 5.25F, -13.0F);
/*      */     
/*  565 */     this.gunModel[94].addShapeBox(59.0F, -19.0F, 7.0F, 22, 21, 12, 0.0F, -1.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 6.0F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, 6.0F, -0.25F, 0.0F);
/*  566 */     this.gunModel[94].setRotationPoint(-79.5F, 7.25F, -13.0F);
/*      */     
/*  568 */     this.gunModel[95].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  569 */     this.gunModel[95].setRotationPoint(-87.0F, 28.25F, -13.0F);
/*      */     
/*  571 */     this.gunModel[96].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F);
/*  572 */     this.gunModel[96].setRotationPoint(-87.0F, 30.25F, -13.0F);
/*      */     
/*  574 */     this.gunModel[97].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/*  575 */     this.gunModel[97].setRotationPoint(-87.0F, 32.25F, -13.0F);
/*      */     
/*  577 */     this.gunModel[98].addShapeBox(59.0F, -19.0F, 7.0F, 15, 1, 12, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/*  578 */     this.gunModel[98].setRotationPoint(-84.0F, 34.25F, -13.0F);
/*      */     
/*  580 */     this.gunModel[99].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[99].setRotationPoint(-53.0F, -6.75F, -8.5F);
/*      */     
/*  583 */     this.gunModel[100].addShapeBox(59.0F, -19.0F, 7.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  584 */     this.gunModel[100].setRotationPoint(-53.0F, -5.75F, -8.5F);
/*      */     
/*  586 */     this.gunModel[101].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  587 */     this.gunModel[101].setRotationPoint(-52.75F, -4.75F, -8.5F);
/*      */     
/*  589 */     this.gunModel[102].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  590 */     this.gunModel[102].setRotationPoint(-52.75F, -3.75F, -8.5F);
/*      */     
/*  592 */     this.gunModel[103].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  593 */     this.gunModel[103].setRotationPoint(-52.75F, -2.75F, -8.5F);
/*      */     
/*  595 */     this.gunModel[104].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  596 */     this.gunModel[104].setRotationPoint(-52.75F, -1.75F, -8.5F);
/*      */     
/*  598 */     this.gunModel[105].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 3, 0.0F, -1.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/*  599 */     this.gunModel[105].setRotationPoint(-52.75F, 0.25F, -8.5F);
/*      */     
/*  601 */     this.gunModel[106].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 3, 0.0F, -2.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -5.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F);
/*  602 */     this.gunModel[106].setRotationPoint(-51.75F, 3.25F, -8.5F);
/*      */     
/*  604 */     this.gunModel[107].addShapeBox(59.0F, -19.0F, 7.0F, 83, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[107].setRotationPoint(-86.5F, -21.75F, 1.0F);
/*      */     
/*  607 */     this.gunModel[108].addShapeBox(59.0F, -19.0F, 7.0F, 83, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[108].setRotationPoint(-86.5F, -24.75F, 1.0F);
/*      */     
/*  610 */     this.gunModel[109].addShapeBox(59.0F, -19.0F, 7.0F, 23, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  611 */     this.gunModel[109].setRotationPoint(-3.5F, -24.75F, 0.0F);
/*      */     
/*  613 */     this.gunModel[110].addShapeBox(59.0F, -19.0F, 7.0F, 28, 3, 17, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[110].setRotationPoint(-86.5F, -24.75F, -16.0F);
/*      */     
/*  616 */     this.gunModel[111].addShapeBox(59.0F, -19.0F, 7.0F, 27, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[111].setRotationPoint(-86.5F, -21.75F, -16.0F);
/*      */     
/*  619 */     this.gunModel[112].addShapeBox(59.0F, -19.0F, 7.0F, 103, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[112].setRotationPoint(-83.5F, -26.75F, 0.0F);
/*      */     
/*  622 */     this.gunModel[113].addShapeBox(59.0F, -19.0F, 7.0F, 59, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[113].setRotationPoint(-83.5F, -26.75F, -16.0F);
/*      */     
/*  625 */     this.gunModel[114].addShapeBox(59.0F, -19.0F, 7.0F, 14, 2, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[114].setRotationPoint(-83.5F, -26.75F, -14.0F);
/*      */     
/*  628 */     this.gunModel[115].addShapeBox(59.0F, -19.0F, 7.0F, 92, 5, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[115].setRotationPoint(-81.5F, -31.75F, -3.0F);
/*      */     
/*  631 */     this.gunModel[116].addShapeBox(59.0F, -19.0F, 7.0F, 56, 5, 3, 0.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  632 */     this.gunModel[116].setRotationPoint(-81.5F, -31.75F, -14.0F);
/*      */     
/*  634 */     this.gunModel[117].addShapeBox(59.0F, -19.0F, 7.0F, 12, 5, 8, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[117].setRotationPoint(-81.5F, -31.75F, -11.0F);
/*      */     
/*  637 */     this.gunModel[118].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[118].setRotationPoint(-77.5F, -34.75F, -5.0F);
/*      */     
/*  640 */     this.gunModel[119].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[119].setRotationPoint(-77.5F, -34.75F, -12.0F);
/*      */     
/*  643 */     this.gunModel[120].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 4, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  644 */     this.gunModel[120].setRotationPoint(-77.5F, -34.75F, -9.0F);
/*      */     
/*  646 */     this.gunModel[121].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[121].setRotationPoint(-74.5F, -35.75F, -9.0F);
/*      */     
/*  649 */     this.gunModel[122].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  650 */     this.gunModel[122].setRotationPoint(-74.5F, -35.75F, -7.0F);
/*      */     
/*  652 */     this.gunModel[123].addShapeBox(59.0F, -19.0F, 7.0F, 10, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  653 */     this.gunModel[123].setRotationPoint(10.5F, -29.25F, -13.0F);
/*      */     
/*  655 */     this.gunModel[124].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  656 */     this.gunModel[124].setRotationPoint(10.5F, -29.25F, -1.0F);
/*      */     
/*  658 */     this.gunModel[125].addShapeBox(59.0F, -19.0F, 7.0F, 5, 5, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  659 */     this.gunModel[125].setRotationPoint(14.5F, -29.25F, -1.0F);
/*      */     
/*  661 */     this.gunModel[126].addShapeBox(59.0F, -19.0F, 7.0F, 35, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  662 */     this.gunModel[126].setRotationPoint(-59.5F, -24.75F, -15.0F);
/*      */     
/*  664 */     this.gunModel[127].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  665 */     this.gunModel[127].setRotationPoint(-57.5F, -24.75F, -17.0F);
/*      */     
/*  667 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  668 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -17.0F);
/*      */     
/*  670 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  671 */     this.gunModel[''].setRotationPoint(-67.5F, -14.75F, -15.75F);
/*      */     
/*  673 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  674 */     this.gunModel[''].setRotationPoint(-64.5F, -17.75F, -15.75F);
/*      */     
/*  676 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  677 */     this.gunModel[''].setRotationPoint(-67.5F, -17.75F, -15.75F);
/*      */     
/*  679 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  680 */     this.gunModel[''].setRotationPoint(-67.5F, -11.75F, -15.75F);
/*      */     
/*  682 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[''].setRotationPoint(-64.5F, -11.75F, -15.75F);
/*      */     
/*  685 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  686 */     this.gunModel[''].setRotationPoint(-61.5F, -11.75F, -15.75F);
/*      */     
/*  688 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  689 */     this.gunModel[''].setRotationPoint(-61.5F, -14.75F, -15.75F);
/*      */     
/*  691 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 21, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  692 */     this.gunModel[''].setRotationPoint(-58.5F, -16.75F, -15.75F);
/*      */     
/*  694 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  695 */     this.gunModel[''].setRotationPoint(-61.5F, -17.75F, -15.75F);
/*      */     
/*  697 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  698 */     this.gunModel[''].setRotationPoint(-65.0F, -14.25F, -16.0F);
/*      */     
/*  700 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  701 */     this.gunModel[''].setRotationPoint(-65.0F, -15.25F, -16.0F);
/*      */     
/*  703 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  704 */     this.gunModel[''].setRotationPoint(-65.0F, -12.75F, -16.0F);
/*      */     
/*  706 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  707 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -15.0F);
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 8, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  710 */     this.gunModel[''].setRotationPoint(14.5F, -29.25F, -15.0F);
/*      */     
/*  712 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, -1.2F, 1.0F, 0.0F, -1.2F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  713 */     this.gunModel[''].setRotationPoint(-25.5F, -29.75F, -14.0F);
/*      */     
/*  715 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  716 */     this.gunModel[''].setRotationPoint(-25.5F, -31.75F, -13.0F);
/*      */     
/*  718 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 57, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  719 */     this.gunModel[''].setRotationPoint(-81.5F, -26.75F, -14.0F);
/*      */     
/*  721 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  722 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -16.0F);
/*      */     
/*  724 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/*  725 */     this.gunModel[''].setRotationPoint(33.5F, -35.75F, -14.0F);
/*      */     
/*  727 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  728 */     this.gunModel[''].setRotationPoint(33.5F, -37.75F, -14.0F);
/*      */     
/*  730 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  731 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -14.0F);
/*      */     
/*  733 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  734 */     this.gunModel[''].setRotationPoint(38.5F, -37.75F, -14.0F);
/*      */     
/*  736 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  737 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -1.0F);
/*      */     
/*  739 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[''].setRotationPoint(38.5F, -37.75F, -1.0F);
/*      */     
/*  742 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel[''].setRotationPoint(28.5F, -37.75F, -3.0F);
/*      */     
/*  745 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/*  746 */     this.gunModel[''].setRotationPoint(23.5F, -37.75F, -2.0F);
/*      */     
/*  748 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  749 */     this.gunModel[''].setRotationPoint(27.5F, -37.75F, -3.0F);
/*      */     
/*  751 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  752 */     this.gunModel[''].setRotationPoint(28.5F, -37.75F, -13.0F);
/*      */     
/*  754 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/*  755 */     this.gunModel[''].setRotationPoint(23.5F, -37.75F, -13.0F);
/*      */     
/*  757 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  758 */     this.gunModel[''].setRotationPoint(27.5F, -37.75F, -12.0F);
/*      */     
/*  760 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  761 */     this.gunModel[''].setRotationPoint(29.0F, -38.75F, -3.0F);
/*      */     
/*  763 */     this.gunModel[' '].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[' '].setRotationPoint(29.0F, -38.75F, -13.0F);
/*      */     
/*  766 */     this.gunModel['¡'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel['¡'].setRotationPoint(13.0F, -37.75F, -4.0F);
/*      */     
/*  769 */     this.gunModel['¢'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel['¢'].setRotationPoint(13.0F, -36.75F, -4.0F);
/*      */     
/*  772 */     this.gunModel['£'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel['£'].setRotationPoint(13.0F, -35.75F, -1.0F);
/*      */     
/*  775 */     this.gunModel['¤'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel['¤'].setRotationPoint(13.0F, -37.75F, -15.0F);
/*      */     
/*  778 */     this.gunModel['¥'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  779 */     this.gunModel['¥'].setRotationPoint(13.0F, -36.75F, -15.0F);
/*      */     
/*  781 */     this.gunModel['¦'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  782 */     this.gunModel['¦'].setRotationPoint(13.0F, -35.75F, -15.0F);
/*      */     
/*  784 */     this.gunModel['§'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  785 */     this.gunModel['§'].setRotationPoint(13.5F, -37.75F, -11.0F);
/*      */     
/*  787 */     this.gunModel['¨'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  788 */     this.gunModel['¨'].setRotationPoint(13.5F, -37.75F, -6.0F);
/*      */     
/*  790 */     this.gunModel['©'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  791 */     this.gunModel['©'].setRotationPoint(33.5F, -37.75F, -6.0F);
/*      */     
/*  793 */     this.gunModel['ª'].addShapeBox(59.0F, -19.0F, 7.0F, 23, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  794 */     this.gunModel['ª'].setRotationPoint(13.5F, -37.75F, -8.0F);
/*      */     
/*  796 */     this.gunModel['«'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/*  797 */     this.gunModel['«'].setRotationPoint(33.5F, -35.75F, -1.0F);
/*      */     
/*  799 */     this.gunModel['¬'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  800 */     this.gunModel['¬'].setRotationPoint(-6.5F, -31.75F, -3.0F);
/*      */     
/*  802 */     this.gunModel['­'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  803 */     this.gunModel['­'].setRotationPoint(-6.5F, -34.75F, -4.5F);
/*      */     
/*  805 */     this.gunModel['®'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel['®'].setRotationPoint(-6.5F, -35.75F, -7.0F);
/*      */     
/*  808 */     this.gunModel['¯'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel['¯'].setRotationPoint(-6.5F, -35.75F, -9.0F);
/*      */     
/*  811 */     this.gunModel['°'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  812 */     this.gunModel['°'].setRotationPoint(-6.5F, -34.75F, -12.5F);
/*      */     
/*  814 */     this.gunModel['±'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  815 */     this.gunModel['±'].setRotationPoint(-31.5F, -31.75F, -3.0F);
/*      */     
/*  817 */     this.gunModel['²'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel['²'].setRotationPoint(-31.5F, -34.75F, -4.5F);
/*      */     
/*  820 */     this.gunModel['³'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  821 */     this.gunModel['³'].setRotationPoint(-31.5F, -35.75F, -7.0F);
/*      */     
/*  823 */     this.gunModel['´'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  824 */     this.gunModel['´'].setRotationPoint(-31.5F, -35.75F, -9.0F);
/*      */     
/*  826 */     this.gunModel['µ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  827 */     this.gunModel['µ'].setRotationPoint(-31.5F, -34.75F, -12.5F);
/*      */     
/*  829 */     this.gunModel['¶'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  830 */     this.gunModel['¶'].setRotationPoint(-59.5F, -31.75F, -3.0F);
/*      */     
/*  832 */     this.gunModel['·'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  833 */     this.gunModel['·'].setRotationPoint(-59.5F, -34.75F, -4.5F);
/*      */     
/*  835 */     this.gunModel['¸'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  836 */     this.gunModel['¸'].setRotationPoint(-59.5F, -35.75F, -7.0F);
/*      */     
/*  838 */     this.gunModel['¹'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel['¹'].setRotationPoint(-59.5F, -35.75F, -9.0F);
/*      */     
/*  841 */     this.gunModel['º'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  842 */     this.gunModel['º'].setRotationPoint(-59.5F, -34.75F, -12.5F);
/*      */     
/*  844 */     this.gunModel['»'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel['»'].setRotationPoint(-31.5F, -31.75F, -14.0F);
/*      */     
/*  847 */     this.gunModel['¼'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel['¼'].setRotationPoint(-59.5F, -31.75F, -14.0F);
/*      */     
/*  850 */     this.gunModel['½'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 3, 4, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel['½'].setRotationPoint(-84.0F, -29.75F, -9.0F);
/*      */     
/*  853 */     this.gunModel['¾'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  854 */     this.gunModel['¾'].setRotationPoint(-79.5F, -16.75F, 0.5F);
/*      */     
/*  856 */     this.gunModel['¿'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  857 */     this.gunModel['¿'].setRotationPoint(-45.5F, -12.75F, 0.5F);
/*      */     
/*  859 */     this.gunModel['À'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  860 */     this.gunModel['À'].setRotationPoint(-28.5F, -12.75F, 0.5F);
/*      */     
/*  862 */     this.gunModel['Á'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  863 */     this.gunModel['Á'].setRotationPoint(-15.5F, -18.75F, 0.5F);
/*      */     
/*  865 */     this.gunModel['Â'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  866 */     this.gunModel['Â'].setRotationPoint(-77.5F, -16.75F, -15.5F);
/*      */     
/*  868 */     this.gunModel['Ã'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel['Ã'].setRotationPoint(-67.5F, -8.75F, -15.5F);
/*      */     
/*  871 */     this.gunModel['Ä'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel['Ä'].setRotationPoint(-33.5F, -12.75F, -15.5F);
/*      */     
/*  874 */     this.gunModel['Å'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel['Å'].setRotationPoint(-33.5F, -17.75F, -15.5F);
/*      */     
/*  877 */     this.gunModel['Æ'].addShapeBox(59.0F, -19.0F, 7.0F, 18, 4, 1, 0.0F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  878 */     this.gunModel['Æ'].setRotationPoint(-55.5F, -20.75F, -16.0F);
/*      */     
/*  880 */     this.gunModel['Ç'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, -2.0F, -0.5F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel['Ç'].setRotationPoint(-37.5F, -20.75F, -16.0F);
/*      */     
/*  883 */     this.gunModel['È'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  884 */     this.gunModel['È'].setRotationPoint(75.5F, -25.75F, -15.0F);
/*      */     
/*  886 */     this.gunModel['É'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 8, 3, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  887 */     this.gunModel['É'].setRotationPoint(75.5F, -23.75F, -2.0F);
/*      */     
/*  889 */     this.gunModel['Ê'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 8, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  890 */     this.gunModel['Ê'].setRotationPoint(73.0F, -23.75F, -2.0F);
/*      */     
/*  892 */     this.gunModel['Ë'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  893 */     this.gunModel['Ë'].setRotationPoint(55.0F, -25.75F, -1.0F);
/*      */     
/*  895 */     this.gunModel['Ì'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 9, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  896 */     this.gunModel['Ì'].setRotationPoint(45.5F, -24.75F, -2.0F);
/*      */     
/*  898 */     this.gunModel['Í'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  899 */     this.gunModel['Í'].setRotationPoint(191.25F, -30.25F, -10.0F);
/*      */     
/*  901 */     this.gunModel['Î'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.35F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.35F, -0.25F, 0.0F);
/*  902 */     this.gunModel['Î'].setRotationPoint(188.25F, -26.25F, -10.0F);
/*      */     
/*  904 */     this.gunModel['Ï'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel['Ï'].setRotationPoint(193.25F, -28.25F, -10.0F);
/*      */     
/*  907 */     this.gunModel['Ð'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  908 */     this.gunModel['Ð'].setRotationPoint(189.25F, -28.25F, -10.0F);
/*      */     
/*  910 */     this.gunModel['Ñ'].addBox(59.0F, -19.0F, 7.0F, 6, 7, 7, 0.0F);
/*  911 */     this.gunModel['Ñ'].setRotationPoint(195.5F, -23.75F, -10.5F);
/*      */     
/*  913 */     this.gunModel['Ò'].addShapeBox(59.0F, -19.0F, 7.0F, 11, 7, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  914 */     this.gunModel['Ò'].setRotationPoint(105.0F, -34.25F, -10.5F);
/*      */     
/*  916 */     this.gunModel['Ó'].addShapeBox(59.0F, -19.0F, 7.0F, 40, 4, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  917 */     this.gunModel['Ó'].setRotationPoint(-163.5F, 6.75F, -14.0F);
/*      */     
/*  919 */     this.gunModel['Ô'].addShapeBox(59.0F, -19.0F, 7.0F, 18, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  920 */     this.gunModel['Ô'].setRotationPoint(146.0F, -24.25F, -11.0F);
/*      */     
/*  922 */     this.gunModel['Õ'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  923 */     this.gunModel['Õ'].setRotationPoint(152.0F, -16.25F, -9.5F);
/*      */     
/*  925 */     this.gunModel['Ö'].addShapeBox(59.0F, -19.0F, 7.0F, 49, 8, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  926 */     this.gunModel['Ö'].setRotationPoint(-163.5F, -1.25F, -14.0F);
/*      */     
/*  928 */     this.gunModel['×'].addShapeBox(59.0F, -19.0F, 7.0F, 37, 10, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  929 */     this.gunModel['×'].setRotationPoint(-163.5F, 10.75F, -14.0F);
/*      */     
/*  931 */     this.gunModel['Ø'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 35, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  932 */     this.gunModel['Ø'].setRotationPoint(-167.5F, -14.25F, -13.0F);
/*      */     
/*  934 */     this.gunModel['Ù'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 12, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  935 */     this.gunModel['Ù'].setRotationPoint(-170.0F, -15.25F, -13.0F);
/*      */     
/*  937 */     this.gunModel['Ú'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  938 */     this.gunModel['Ú'].setRotationPoint(45.5F, -25.25F, -2.0F);
/*      */     
/*  940 */     this.gunModel['Û'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  941 */     this.gunModel['Û'].setRotationPoint(53.5F, -25.25F, -2.0F);
/*      */     
/*  943 */     this.gunModel['Ü'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 9, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  944 */     this.gunModel['Ü'].setRotationPoint(63.0F, -24.75F, -2.0F);
/*      */     
/*  946 */     this.gunModel['Ý'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  947 */     this.gunModel['Ý'].setRotationPoint(63.0F, -25.25F, -2.0F);
/*      */     
/*  949 */     this.gunModel['Þ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  950 */     this.gunModel['Þ'].setRotationPoint(72.0F, -25.25F, -2.0F);
/*      */     
/*  952 */     this.gunModel['ß'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 8, 8, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F);
/*  953 */     this.gunModel['ß'].setRotationPoint(181.0F, -24.25F, -11.0F);
/*      */     
/*  955 */     this.gunModel['à'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  956 */     this.gunModel['à'].setRotationPoint(181.0F, -14.25F, -4.0F);
/*      */     
/*  958 */     this.gunModel['á'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F);
/*  959 */     this.gunModel['á'].setRotationPoint(181.0F, -14.25F, -11.0F);
/*      */     
/*  961 */     this.gunModel['â'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  962 */     this.gunModel['â'].setRotationPoint(185.0F, -14.25F, -4.0F);
/*      */     
/*  964 */     this.gunModel['ã'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F);
/*  965 */     this.gunModel['ã'].setRotationPoint(185.0F, -14.25F, -11.0F);
/*      */     
/*  967 */     this.gunModel['ä'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  968 */     this.gunModel['ä'].setRotationPoint(181.0F, -7.25F, -11.0F);
/*      */     
/*  970 */     this.gunModel['å'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel['å'].setRotationPoint(183.0F, -8.25F, -12.0F);
/*      */     
/*  973 */     this.gunModel['æ'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 2, 8, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  974 */     this.gunModel['æ'].setRotationPoint(181.0F, -4.25F, -11.0F);
/*      */     
/*  976 */     this.gunModel['ç'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 7, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  977 */     this.gunModel['ç'].setRotationPoint(181.0F, -2.25F, -13.0F);
/*      */     
/*  979 */     this.gunModel['è'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  980 */     this.gunModel['è'].setRotationPoint(181.0F, -2.25F, -7.0F);
/*      */     
/*  982 */     this.gunModel['é'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 100, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  983 */     this.gunModel['é'].setRotationPoint(182.0F, -6.25F, -15.0F);
/*  984 */     this.gunModel['é'].rotateAngleX = -0.27925268F;
/*      */     
/*  986 */     this.gunModel['ê'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 100, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  987 */     this.gunModel['ê'].setRotationPoint(182.0F, -6.25F, -4.0F);
/*  988 */     this.gunModel['ê'].rotateAngleX = 0.27925268F;
/*      */     
/*  990 */     this.gunModel['ë'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  991 */     this.gunModel['ë'].setRotationPoint(179.75F, 88.75F, 21.0F);
/*  992 */     this.gunModel['ë'].rotateAngleX = 0.27925268F;
/*      */     
/*  994 */     this.gunModel['ì'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  995 */     this.gunModel['ì'].setRotationPoint(187.75F, 88.75F, 21.0F);
/*  996 */     this.gunModel['ì'].rotateAngleX = 0.27925268F;
/*      */     
/*  998 */     this.gunModel['í'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  999 */     this.gunModel['í'].setRotationPoint(179.75F, 88.75F, -44.0F);
/* 1000 */     this.gunModel['í'].rotateAngleX = -0.27925268F;
/*      */     
/* 1002 */     this.gunModel['î'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1003 */     this.gunModel['î'].setRotationPoint(187.75F, 88.75F, -44.0F);
/* 1004 */     this.gunModel['î'].rotateAngleX = -0.27925268F;
/*      */     
/* 1006 */     this.gunModel['ï'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1007 */     this.gunModel['ï'].setRotationPoint(182.75F, 83.75F, 23.0F);
/* 1008 */     this.gunModel['ï'].rotateAngleX = 0.27925268F;
/*      */     
/* 1010 */     this.gunModel['ð'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1011 */     this.gunModel['ð'].setRotationPoint(182.75F, 83.75F, -42.0F);
/* 1012 */     this.gunModel['ð'].rotateAngleX = -0.27925268F;
/*      */     
/* 1014 */     this.gunModel['ñ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 1015 */     this.gunModel['ñ'].setRotationPoint(182.5F, 6.75F, -10.5F);
/*      */     
/* 1017 */     this.gunModel['ò'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1018 */     this.gunModel['ò'].setRotationPoint(182.5F, 6.75F, -5.5F);
/*      */     
/* 1020 */     this.gunModel['ó'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1021 */     this.gunModel['ó'].setRotationPoint(182.5F, 9.75F, -6.5F);
/*      */     
/* 1023 */     this.gunModel['ô'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1024 */     this.gunModel['ô'].setRotationPoint(182.5F, 9.75F, -8.5F);
/*      */     
/* 1026 */     this.gunModel['õ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel['õ'].setRotationPoint(182.5F, 10.75F, -7.5F);
/*      */     
/* 1029 */     this.gunModel['ö'].addBox(59.0F, -19.0F, 7.0F, 3, 2, 2, 0.0F);
/* 1030 */     this.gunModel['ö'].setRotationPoint(201.5F, -23.75F, -10.5F);
/*      */     
/* 1032 */     this.gunModel['÷'].addBox(59.0F, -19.0F, 7.0F, 3, 2, 2, 0.0F);
/* 1033 */     this.gunModel['÷'].setRotationPoint(201.5F, -23.75F, -5.5F);
/*      */     
/* 1035 */     this.gunModel['ø'].addBox(59.0F, -19.0F, 7.0F, 3, 2, 2, 0.0F);
/* 1036 */     this.gunModel['ø'].setRotationPoint(201.5F, -18.75F, -10.5F);
/*      */     
/* 1038 */     this.gunModel['ù'].addBox(59.0F, -19.0F, 7.0F, 3, 2, 2, 0.0F);
/* 1039 */     this.gunModel['ù'].setRotationPoint(201.5F, -18.75F, -5.5F);
/*      */     
/* 1041 */     this.gunModel['ú'].addBox(59.0F, -19.0F, 7.0F, 3, 7, 7, 0.0F);
/* 1042 */     this.gunModel['ú'].setRotationPoint(204.5F, -23.75F, -10.5F);
/*      */     
/* 1044 */     this.gunModel['û'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 8, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1045 */     this.gunModel['û'].setRotationPoint(73.0F, -23.75F, -15.0F);
/*      */     
/* 1047 */     this.gunModel['ü'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1048 */     this.gunModel['ü'].setRotationPoint(55.0F, -24.75F, -14.0F);
/*      */     
/* 1050 */     this.gunModel['ý'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 9, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1051 */     this.gunModel['ý'].setRotationPoint(45.5F, -24.75F, -15.0F);
/*      */     
/* 1053 */     this.gunModel['þ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1054 */     this.gunModel['þ'].setRotationPoint(45.5F, -25.25F, -15.0F);
/*      */     
/* 1056 */     this.gunModel['ÿ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1057 */     this.gunModel['ÿ'].setRotationPoint(53.5F, -25.25F, -15.0F);
/*      */     
/* 1059 */     this.gunModel['Ā'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 9, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1060 */     this.gunModel['Ā'].setRotationPoint(63.0F, -24.75F, -15.0F);
/*      */     
/* 1062 */     this.gunModel['ā'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1063 */     this.gunModel['ā'].setRotationPoint(63.0F, -25.25F, -15.0F);
/*      */     
/* 1065 */     this.gunModel['Ă'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1066 */     this.gunModel['Ă'].setRotationPoint(72.0F, -25.25F, -15.0F);
/*      */     
/* 1068 */     this.gunModel['ă'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1069 */     this.gunModel['ă'].setRotationPoint(55.0F, -25.75F, -15.0F);
/*      */     
/*      */ 
/* 1072 */     this.ammoModel = new ModelRendererTurbo[26];
/* 1073 */     this.ammoModel[0] = new ModelRendererTurbo(this, 289, 265, this.textureX, this.textureY);
/* 1074 */     this.ammoModel[1] = new ModelRendererTurbo(this, 361, 265, this.textureX, this.textureY);
/* 1075 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 1076 */     this.ammoModel[3] = new ModelRendererTurbo(this, 73, 273, this.textureX, this.textureY);
/* 1077 */     this.ammoModel[4] = new ModelRendererTurbo(this, 417, 273, this.textureX, this.textureY);
/* 1078 */     this.ammoModel[5] = new ModelRendererTurbo(this, 201, 281, this.textureX, this.textureY);
/* 1079 */     this.ammoModel[6] = new ModelRendererTurbo(this, 273, 281, this.textureX, this.textureY);
/* 1080 */     this.ammoModel[7] = new ModelRendererTurbo(this, 137, 289, this.textureX, this.textureY);
/* 1081 */     this.ammoModel[8] = new ModelRendererTurbo(this, 329, 289, this.textureX, this.textureY);
/* 1082 */     this.ammoModel[9] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/* 1083 */     this.ammoModel[10] = new ModelRendererTurbo(this, 393, 297, this.textureX, this.textureY);
/* 1084 */     this.ammoModel[11] = new ModelRendererTurbo(this, 81, 297, this.textureX, this.textureY);
/* 1085 */     this.ammoModel[12] = new ModelRendererTurbo(this, 201, 305, this.textureX, this.textureY);
/* 1086 */     this.ammoModel[13] = new ModelRendererTurbo(this, 265, 305, this.textureX, this.textureY);
/* 1087 */     this.ammoModel[14] = new ModelRendererTurbo(this, 121, 313, this.textureX, this.textureY);
/* 1088 */     this.ammoModel[15] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/* 1089 */     this.ammoModel[16] = new ModelRendererTurbo(this, 193, 321, this.textureX, this.textureY);
/* 1090 */     this.ammoModel[17] = new ModelRendererTurbo(this, 337, 313, this.textureX, this.textureY);
/* 1091 */     this.ammoModel[18] = new ModelRendererTurbo(this, 393, 321, this.textureX, this.textureY);
/* 1092 */     this.ammoModel[19] = new ModelRendererTurbo(this, 257, 329, this.textureX, this.textureY);
/* 1093 */     this.ammoModel[20] = new ModelRendererTurbo(this, 329, 329, this.textureX, this.textureY);
/* 1094 */     this.ammoModel[21] = new ModelRendererTurbo(this, 1, 337, this.textureX, this.textureY);
/* 1095 */     this.ammoModel[22] = new ModelRendererTurbo(this, 473, 305, this.textureX, this.textureY);
/* 1096 */     this.ammoModel[23] = new ModelRendererTurbo(this, 73, 337, this.textureX, this.textureY);
/* 1097 */     this.ammoModel[24] = new ModelRendererTurbo(this, 273, 369, this.textureX, this.textureY);
/* 1098 */     this.ammoModel[25] = new ModelRendererTurbo(this, 305, 369, this.textureX, this.textureY);
/*      */     
/* 1100 */     this.ammoModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 22, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1101 */     this.ammoModel[0].setRotationPoint(-25.5F, -11.75F, -12.5F);
/*      */     
/* 1103 */     this.ammoModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 22, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1104 */     this.ammoModel[1].setRotationPoint(-25.5F, -7.75F, -12.5F);
/*      */     
/* 1106 */     this.ammoModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 23, 9, 11, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1107 */     this.ammoModel[2].setRotationPoint(-25.5F, -1.75F, -12.5F);
/*      */     
/* 1109 */     this.ammoModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 23, 9, 11, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1110 */     this.ammoModel[3].setRotationPoint(-24.0F, 7.25F, -12.5F);
/*      */     
/* 1112 */     this.ammoModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 23, 8, 11, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1113 */     this.ammoModel[4].setRotationPoint(-22.0F, 16.25F, -12.5F);
/*      */     
/* 1115 */     this.ammoModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 23, 7, 11, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1116 */     this.ammoModel[5].setRotationPoint(-20.0F, 24.25F, -12.5F);
/*      */     
/* 1118 */     this.ammoModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 22, 6, 11, 0.0F, 2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1119 */     this.ammoModel[6].setRotationPoint(-17.0F, 31.25F, -12.5F);
/*      */     
/* 1121 */     this.ammoModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, 2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1122 */     this.ammoModel[7].setRotationPoint(-15.0F, 37.25F, -12.5F);
/*      */     
/* 1124 */     this.ammoModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 11, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1125 */     this.ammoModel[8].setRotationPoint(-12.0F, 43.25F, -12.5F);
/*      */     
/* 1127 */     this.ammoModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 27, 6, 11, 0.0F, 5.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1128 */     this.ammoModel[9].setRotationPoint(-8.0F, 49.25F, -12.5F);
/*      */     
/* 1130 */     this.ammoModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 11, 0.0F, 6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 1131 */     this.ammoModel[10].setRotationPoint(-3.5F, 55.25F, -12.5F);
/*      */     
/* 1133 */     this.ammoModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 11, 6, 11, 0.0F, 8.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F);
/* 1134 */     this.ammoModel[11].setRotationPoint(2.0F, 61.25F, -12.5F);
/*      */     
/* 1136 */     this.ammoModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1137 */     this.ammoModel[12].setRotationPoint(-23.5F, -7.75F, -10.5F);
/*      */     
/* 1139 */     this.ammoModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 25, 9, 7, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1140 */     this.ammoModel[13].setRotationPoint(-23.5F, -1.75F, -10.5F);
/*      */     
/* 1142 */     this.ammoModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 25, 9, 7, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1143 */     this.ammoModel[14].setRotationPoint(-22.0F, 7.25F, -10.5F);
/*      */     
/* 1145 */     this.ammoModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 25, 8, 7, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1146 */     this.ammoModel[15].setRotationPoint(-20.0F, 16.25F, -10.5F);
/*      */     
/* 1148 */     this.ammoModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 25, 7, 7, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1149 */     this.ammoModel[16].setRotationPoint(-18.0F, 24.25F, -10.5F);
/*      */     
/* 1151 */     this.ammoModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 7, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1152 */     this.ammoModel[17].setRotationPoint(-15.0F, 31.25F, -10.5F);
/*      */     
/* 1154 */     this.ammoModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 26, 6, 7, 0.0F, 2.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1155 */     this.ammoModel[18].setRotationPoint(-13.0F, 37.25F, -10.5F);
/*      */     
/* 1157 */     this.ammoModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 7, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1158 */     this.ammoModel[19].setRotationPoint(-8.0F, 43.25F, -10.5F);
/*      */     
/* 1160 */     this.ammoModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 28, 6, 7, 0.0F, 4.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/* 1161 */     this.ammoModel[20].setRotationPoint(-5.0F, 49.25F, -10.5F);
/*      */     
/* 1163 */     this.ammoModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 26, 6, 7, 0.0F, 6.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, -6.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1164 */     this.ammoModel[21].setRotationPoint(-0.5F, 55.25F, -10.5F);
/*      */     
/* 1166 */     this.ammoModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 11, 6, 7, 0.0F, 10.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 10.75F, 0.0F, 0.0F, 5.25F, 0.75F, 0.0F, -8.0F, 0.75F, 0.0F, -8.0F, 0.75F, 0.0F, 5.25F, 0.75F, 0.0F);
/* 1167 */     this.ammoModel[22].setRotationPoint(6.0F, 61.25F, -10.5F);
/*      */     
/* 1169 */     this.ammoModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 23, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1170 */     this.ammoModel[23].setRotationPoint(-22.5F, -11.75F, -10.5F);
/*      */     
/* 1172 */     this.ammoModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 11, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1173 */     this.ammoModel[24].setRotationPoint(-1.0F, 67.25F, -12.5F);
/*      */     
/* 1175 */     this.ammoModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 9, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1176 */     this.ammoModel[25].setRotationPoint(0.0F, 68.0F, -10.5F);
/*      */     
/*      */ 
/* 1179 */     this.slideModel = new ModelRendererTurbo[9];
/* 1180 */     this.slideModel[0] = new ModelRendererTurbo(this, 433, 249, this.textureX, this.textureY);
/* 1181 */     this.slideModel[1] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/* 1182 */     this.slideModel[2] = new ModelRendererTurbo(this, 65, 257, this.textureX, this.textureY);
/* 1183 */     this.slideModel[3] = new ModelRendererTurbo(this, 145, 265, this.textureX, this.textureY);
/* 1184 */     this.slideModel[4] = new ModelRendererTurbo(this, 217, 265, this.textureX, this.textureY);
/* 1185 */     this.slideModel[5] = new ModelRendererTurbo(this, 233, 185, this.textureX, this.textureY);
/* 1186 */     this.slideModel[6] = new ModelRendererTurbo(this, 241, 209, this.textureX, this.textureY);
/* 1187 */     this.slideModel[7] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 1188 */     this.slideModel[8] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*      */     
/* 1190 */     this.slideModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 17, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1191 */     this.slideModel[0].setRotationPoint(-24.5F, -24.75F, -14.0F);
/*      */     
/* 1193 */     this.slideModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1194 */     this.slideModel[1].setRotationPoint(-24.5F, -25.75F, -13.0F);
/*      */     
/* 1196 */     this.slideModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 35, 5, 9, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1197 */     this.slideModel[2].setRotationPoint(-24.5F, -30.75F, -12.0F);
/*      */     
/* 1199 */     this.slideModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 18, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1200 */     this.slideModel[3].setRotationPoint(-7.5F, -24.75F, -14.0F);
/*      */     
/* 1202 */     this.slideModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1203 */     this.slideModel[4].setRotationPoint(-7.5F, -25.75F, -13.0F);
/*      */     
/* 1205 */     this.slideModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 12, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1206 */     this.slideModel[5].setRotationPoint(7.5F, -25.75F, -20.0F);
/*      */     
/* 1208 */     this.slideModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1209 */     this.slideModel[6].setRotationPoint(8.5F, -25.75F, -15.0F);
/*      */     
/* 1211 */     this.slideModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1212 */     this.slideModel[7].setRotationPoint(8.5F, -25.75F, -16.0F);
/*      */     
/* 1214 */     this.slideModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1215 */     this.slideModel[8].setRotationPoint(8.5F, -25.75F, -18.0F);
/*      */     
/*      */ 
/*      */ 
/* 1219 */     this.gripAttachPoint = new Vector3f(7.0625F, 2.6875F, 0.0F);
/*      */     
/*      */ 
/* 1222 */     translateAll(0.0F, -32.75F, 0.0F);
/* 1223 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/* 1225 */     this.gunSlideDistance = 0.75F;
/* 1226 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/* 1229 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelrpk74.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */