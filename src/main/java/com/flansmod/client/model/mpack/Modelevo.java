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
/*      */ public class Modelevo
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelevo()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ą'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 417, 81, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 257, 89, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 113, 105, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 153, 105, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 385, 105, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 409, 113, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 113, 137, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 265, 145, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 73, 153, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 41, 169, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 241, 169, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 113, 185, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 289, 33, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 193, 185, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 329, 161, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 201, 201, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 337, 185, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 137, 209, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 281, 233, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 281, 209, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 281, 65, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 473, 161, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 481, 193, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 33, 233, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 65, 233, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 97, 233, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 497, 225, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 321, 153, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 169, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 193, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 241, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 249, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 217, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 201, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 9, 65, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 249, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 249, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 97, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 137, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 249, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 217, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 249, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 97, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 257, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 217, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 73, 257, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 297, 257, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 353, 257, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 393, 257, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 441, 257, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 113, 273, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 41, 281, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 153, 281, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 281, 281, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 385, 97, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 441, 217, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 337, 257, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 433, 281, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 377, 257, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 425, 257, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 281, 305, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 81, 281, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 401, 289, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 433, 121, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 177, 105, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 497, 289, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 409, 305, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 25, 313, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 153, 313, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 321, 145, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 209, 313, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 65, 121, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 305, 121, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 377, 129, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 201, 281, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 73, 257, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 121, 297, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 257, 313, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 385, 313, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 265, 329, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 65, 345, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 169, 353, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 273, 361, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 377, 361, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 1, 369, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 89, 377, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 185, 377, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 369, 377, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 1, 385, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 73, 329, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 433, 321, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 217, 321, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 1, 337, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 473, 369, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 433, 345, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 465, 345, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 17, 353, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 265, 385, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 313, 385, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 193, 393, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 57, 265, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 337, 393, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 377, 393, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 417, 393, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 1, 401, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 41, 401, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 49, 233, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 465, 161, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 137, 209, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 441, 385, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 225, 409, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 457, 409, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 201, 417, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 369, 417, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 209, 441, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 297, 449, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 297, 257, this.textureX, this.textureY);
/*      */     
/*  283 */     this.gunModel[0].addShapeBox(60.0F, -19.0F, 9.5F, 91, 16, 3, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  284 */     this.gunModel[0].setRotationPoint(-85.0F, -27.0F, -3.0F);
/*      */     
/*  286 */     this.gunModel[1].addShapeBox(60.0F, -19.0F, 9.5F, 91, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  287 */     this.gunModel[1].setRotationPoint(-85.0F, -33.0F, -5.0F);
/*      */     
/*  289 */     this.gunModel[2].addShapeBox(60.0F, -19.0F, 9.5F, 91, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  290 */     this.gunModel[2].setRotationPoint(-85.0F, -37.0F, -5.0F);
/*      */     
/*  292 */     this.gunModel[3].addShapeBox(60.0F, -19.0F, 9.5F, 6, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  293 */     this.gunModel[3].setRotationPoint(6.0F, -27.0F, -2.0F);
/*      */     
/*  295 */     this.gunModel[4].addShapeBox(60.0F, -19.0F, 9.5F, 5, 15, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  296 */     this.gunModel[4].setRotationPoint(12.0F, -26.0F, -2.0F);
/*      */     
/*  298 */     this.gunModel[5].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 2, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.35F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  299 */     this.gunModel[5].setRotationPoint(6.0F, -30.0F, -2.0F);
/*      */     
/*  301 */     this.gunModel[6].addShapeBox(60.0F, -19.0F, 9.5F, 97, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/*  302 */     this.gunModel[6].setRotationPoint(-85.0F, -11.0F, -2.0F);
/*      */     
/*  304 */     this.gunModel[7].addShapeBox(60.0F, -19.0F, 9.5F, 5, 15, 2, 0.0F, -4.75F, 2.75F, 0.0F, 6.5F, 1.0F, 0.0F, 6.5F, 1.0F, -2.0F, -4.75F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -2.0F, 0.0F, -1.5F, 0.0F);
/*  305 */     this.gunModel[7].setRotationPoint(12.25F, -24.5F, -2.0F);
/*      */     
/*  307 */     this.gunModel[8].addShapeBox(60.0F, -19.0F, 9.5F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/*  308 */     this.gunModel[8].setRotationPoint(12.0F, -11.0F, -3.0F);
/*      */     
/*  310 */     this.gunModel[9].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 2, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, -1.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  311 */     this.gunModel[9].setRotationPoint(12.0F, -28.25F, -2.0F);
/*      */     
/*  313 */     this.gunModel[10].addShapeBox(60.0F, -19.0F, 9.5F, 24, 7, 15, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  314 */     this.gunModel[10].setRotationPoint(6.0F, -31.0F, -17.0F);
/*      */     
/*  316 */     this.gunModel[11].addShapeBox(60.0F, -19.0F, 9.5F, 30, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  317 */     this.gunModel[11].setRotationPoint(31.0F, -31.0F, -3.0F);
/*      */     
/*  319 */     this.gunModel[12].addShapeBox(60.0F, -19.0F, 9.5F, 9, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  320 */     this.gunModel[12].setRotationPoint(62.0F, -31.0F, -3.0F);
/*      */     
/*  322 */     this.gunModel[13].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 15, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  323 */     this.gunModel[13].setRotationPoint(47.0F, -27.0F, -17.0F);
/*      */     
/*  325 */     this.gunModel[14].addShapeBox(60.0F, -19.0F, 9.5F, 24, 16, 15, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  326 */     this.gunModel[14].setRotationPoint(6.0F, -24.0F, -17.0F);
/*      */     
/*  328 */     this.gunModel[15].addShapeBox(60.0F, -19.0F, 9.5F, 40, 15, 15, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  329 */     this.gunModel[15].setRotationPoint(31.0F, -24.0F, -17.0F);
/*      */     
/*  331 */     this.gunModel[16].addShapeBox(60.0F, -19.0F, 9.5F, 5, 19, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  332 */     this.gunModel[16].setRotationPoint(72.0F, -27.5F, -3.0F);
/*      */     
/*  334 */     this.gunModel[17].addShapeBox(60.0F, -19.0F, 9.5F, 4, 3, 15, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  335 */     this.gunModel[17].setRotationPoint(66.75F, -27.0F, -17.0F);
/*      */     
/*  337 */     this.gunModel[18].addShapeBox(60.0F, -19.0F, 9.5F, 34, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  338 */     this.gunModel[18].setRotationPoint(34.0F, -22.5F, -1.5F);
/*      */     
/*  340 */     this.gunModel[19].addShapeBox(60.0F, -19.0F, 9.5F, 63, 2, 13, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, 3.75F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  341 */     this.gunModel[19].setRotationPoint(18.0F, -8.75F, -15.0F);
/*      */     
/*  343 */     this.gunModel[20].addShapeBox(60.0F, -19.0F, 9.5F, 64, 3, 12, 0.0F, 0.0F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  344 */     this.gunModel[20].setRotationPoint(18.0F, -6.75F, -16.0F);
/*      */     
/*  346 */     this.gunModel[21].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 4.0F, 0.0F, 4.0F, 4.0F, 0.0F, 4.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  347 */     this.gunModel[21].setRotationPoint(12.0F, -8.75F, -5.0F);
/*      */     
/*  349 */     this.gunModel[22].addShapeBox(60.0F, -19.0F, 9.5F, 3, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 5.75F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F);
/*  350 */     this.gunModel[22].setRotationPoint(9.0F, -8.75F, -5.0F);
/*      */     
/*  352 */     this.gunModel[23].addShapeBox(60.0F, -19.0F, 9.5F, 4, 3, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 9.25F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 3.25F, 0.0F);
/*  353 */     this.gunModel[23].setRotationPoint(5.0F, -8.75F, -5.0F);
/*      */     
/*  355 */     this.gunModel[24].addShapeBox(60.0F, -19.0F, 9.5F, 3, 6, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, 6.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  356 */     this.gunModel[24].setRotationPoint(2.0F, -8.75F, -5.0F);
/*      */     
/*  358 */     this.gunModel[25].addShapeBox(60.0F, -19.0F, 9.5F, 1, 10, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  359 */     this.gunModel[25].setRotationPoint(1.0F, -8.75F, -5.0F);
/*      */     
/*  361 */     this.gunModel[26].addShapeBox(60.0F, -19.0F, 9.5F, 2, 14, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  362 */     this.gunModel[26].setRotationPoint(-1.0F, -8.75F, -17.0F);
/*      */     
/*  364 */     this.gunModel[27].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  365 */     this.gunModel[27].setRotationPoint(-1.0F, 5.25F, -17.0F);
/*      */     
/*  367 */     this.gunModel[28].addShapeBox(60.0F, -19.0F, 9.5F, 3, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  368 */     this.gunModel[28].setRotationPoint(-2.0F, 7.25F, -17.0F);
/*      */     
/*  370 */     this.gunModel[29].addShapeBox(60.0F, -19.0F, 9.5F, 20, 1, 15, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.25F, 1.5F, 0.0F);
/*  371 */     this.gunModel[29].setRotationPoint(-22.0F, 11.0F, -17.0F);
/*      */     
/*  373 */     this.gunModel[30].addShapeBox(60.0F, -19.0F, 9.5F, 20, 2, 15, 0.0F, 0.25F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  374 */     this.gunModel[30].setRotationPoint(-22.0F, 9.25F, -17.0F);
/*      */     
/*  376 */     this.gunModel[31].addShapeBox(60.0F, -19.0F, 9.5F, 1, 16, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  377 */     this.gunModel[31].setRotationPoint(-2.0F, -8.75F, -17.0F);
/*      */     
/*  379 */     this.gunModel[32].addShapeBox(60.0F, -19.0F, 9.5F, 20, 19, 15, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  380 */     this.gunModel[32].setRotationPoint(-22.0F, -8.75F, -17.0F);
/*      */     
/*  382 */     this.gunModel[33].addShapeBox(60.0F, -19.0F, 9.5F, 3, 4, 15, 0.0F, 0.0F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F);
/*  383 */     this.gunModel[33].setRotationPoint(-26.0F, 7.25F, -17.0F);
/*      */     
/*  385 */     this.gunModel[34].addShapeBox(60.0F, -19.0F, 9.5F, 3, 7, 15, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  386 */     this.gunModel[34].setRotationPoint(-26.0F, 1.25F, -17.0F);
/*      */     
/*  388 */     this.gunModel[35].addShapeBox(60.0F, -19.0F, 9.5F, 49, 10, 15, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  389 */     this.gunModel[35].setRotationPoint(-72.0F, -8.75F, -17.0F);
/*      */     
/*  391 */     this.gunModel[36].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 15, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  392 */     this.gunModel[36].setRotationPoint(-85.5F, -7.75F, -17.0F);
/*      */     
/*  394 */     this.gunModel[37].addShapeBox(60.0F, -19.0F, 9.5F, 8, 6, 15, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -4.5F, 0.0F);
/*  395 */     this.gunModel[37].setRotationPoint(-84.5F, -7.75F, -17.0F);
/*      */     
/*  397 */     this.gunModel[38].addShapeBox(60.0F, -19.0F, 9.5F, 2, 9, 15, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.75F, 0.0F);
/*  398 */     this.gunModel[38].setRotationPoint(-76.5F, -7.75F, -17.0F);
/*      */     
/*  400 */     this.gunModel[39].addShapeBox(60.0F, -19.0F, 9.5F, 2, 11, 15, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -5.0F, 0.0F);
/*  401 */     this.gunModel[39].setRotationPoint(-74.5F, -7.75F, -17.0F);
/*      */     
/*  403 */     this.gunModel[40].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 3, 0.0F, 0.5F, -0.75F, -3.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, -3.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  404 */     this.gunModel[40].setRotationPoint(-72.0F, 1.25F, -17.0F);
/*      */     
/*  406 */     this.gunModel[41].addShapeBox(60.0F, -19.0F, 9.5F, 2, 4, 3, 0.0F, 0.5F, 0.0F, -3.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/*  407 */     this.gunModel[41].setRotationPoint(-72.0F, 4.25F, -17.0F);
/*      */     
/*  409 */     this.gunModel[42].addShapeBox(60.0F, -19.0F, 9.5F, 2, 22, 3, 0.0F, 0.5F, 0.0F, -3.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 16.25F, 0.0F, -3.0F, -14.25F, 0.0F, 0.0F, -14.25F, 0.0F, 0.0F, 16.25F, 0.0F, 0.0F);
/*  410 */     this.gunModel[42].setRotationPoint(-73.75F, 8.25F, -17.0F);
/*      */     
/*  412 */     this.gunModel[43].addShapeBox(60.0F, -19.0F, 9.5F, 7, 6, 17, 0.0F, 0.5F, -6.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  413 */     this.gunModel[43].setRotationPoint(-97.75F, 30.25F, -18.0F);
/*      */     
/*  415 */     this.gunModel[44].addShapeBox(60.0F, -19.0F, 9.5F, 8, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  416 */     this.gunModel[44].setRotationPoint(-98.25F, 36.25F, -18.0F);
/*      */     
/*  418 */     this.gunModel[45].addShapeBox(60.0F, -19.0F, 9.5F, 13, 10, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F);
/*  419 */     this.gunModel[45].setRotationPoint(-98.25F, 38.25F, -18.0F);
/*      */     
/*  421 */     this.gunModel[46].addShapeBox(60.0F, -19.0F, 9.5F, 11, 5, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  422 */     this.gunModel[46].setRotationPoint(-85.25F, 43.25F, -18.0F);
/*      */     
/*  424 */     this.gunModel[47].addShapeBox(60.0F, -19.0F, 9.5F, 2, 8, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  425 */     this.gunModel[47].setRotationPoint(-74.25F, 43.25F, -18.0F);
/*      */     
/*  427 */     this.gunModel[48].addShapeBox(60.0F, -19.0F, 9.5F, 2, 4, 17, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  428 */     this.gunModel[48].setRotationPoint(-72.25F, 47.25F, -18.0F);
/*      */     
/*  430 */     this.gunModel[49].addShapeBox(60.0F, -19.0F, 9.5F, 1, 3, 17, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  431 */     this.gunModel[49].setRotationPoint(-72.25F, 43.25F, -18.0F);
/*      */     
/*  433 */     this.gunModel[50].addShapeBox(60.0F, -19.0F, 9.5F, 2, 1, 17, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  434 */     this.gunModel[50].setRotationPoint(-72.25F, 46.25F, -18.0F);
/*      */     
/*  436 */     this.gunModel[51].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 17, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  437 */     this.gunModel[51].setRotationPoint(-72.25F, 42.25F, -18.0F);
/*      */     
/*  439 */     this.gunModel[52].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 17, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  440 */     this.gunModel[52].setRotationPoint(-73.25F, 42.25F, -18.0F);
/*      */     
/*  442 */     this.gunModel[53].addShapeBox(60.0F, -19.0F, 9.5F, 3, 2, 17, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  443 */     this.gunModel[53].setRotationPoint(-76.25F, 41.25F, -18.0F);
/*      */     
/*  445 */     this.gunModel[54].addShapeBox(60.0F, -19.0F, 9.5F, 3, 2, 17, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  446 */     this.gunModel[54].setRotationPoint(-79.25F, 41.25F, -18.0F);
/*      */     
/*  448 */     this.gunModel[55].addShapeBox(60.0F, -19.0F, 9.5F, 3, 2, 17, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  449 */     this.gunModel[55].setRotationPoint(-82.25F, 41.25F, -18.0F);
/*      */     
/*  451 */     this.gunModel[56].addShapeBox(60.0F, -19.0F, 9.5F, 3, 2, 17, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[56].setRotationPoint(-85.25F, 41.25F, -18.0F);
/*      */     
/*  454 */     this.gunModel[57].addShapeBox(60.0F, -19.0F, 9.5F, 3, 3, 17, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  455 */     this.gunModel[57].setRotationPoint(-88.25F, 35.25F, -18.0F);
/*      */     
/*  457 */     this.gunModel[58].addShapeBox(60.0F, -19.0F, 9.5F, 1, 8, 17, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  458 */     this.gunModel[58].setRotationPoint(-89.25F, 30.25F, -18.0F);
/*      */     
/*  460 */     this.gunModel[59].addShapeBox(60.0F, -19.0F, 9.5F, 36, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  461 */     this.gunModel[59].setRotationPoint(6.0F, -39.0F, -14.0F);
/*      */     
/*  463 */     this.gunModel[60].addShapeBox(60.0F, -19.0F, 9.5F, 12, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  464 */     this.gunModel[60].setRotationPoint(42.0F, -39.0F, -14.0F);
/*      */     
/*  466 */     this.gunModel[61].addShapeBox(60.0F, -19.0F, 9.5F, 35, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 3.75F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  467 */     this.gunModel[61].setRotationPoint(15.0F, -36.0F, -5.0F);
/*      */     
/*  469 */     this.gunModel[62].addShapeBox(60.0F, -19.0F, 9.5F, 49, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  470 */     this.gunModel[62].setRotationPoint(5.0F, -36.5F, -12.5F);
/*      */     
/*  472 */     this.gunModel[63].addShapeBox(60.0F, -19.0F, 9.5F, 6, 3, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  473 */     this.gunModel[63].setRotationPoint(54.0F, -36.0F, -13.0F);
/*      */     
/*  475 */     this.gunModel[64].addShapeBox(60.0F, -19.0F, 9.5F, 4, 5, 5, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  476 */     this.gunModel[64].setRotationPoint(60.0F, -34.0F, -12.0F);
/*      */     
/*  478 */     this.gunModel[65].addShapeBox(60.0F, -19.0F, 9.5F, 6, 10, 3, 0.0F, -4.5F, -0.75F, 0.0F, 2.0F, -0.75F, -3.0F, 2.0F, -0.75F, 0.0F, -4.5F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, -3.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  479 */     this.gunModel[65].setRotationPoint(-56.0F, 1.25F, -17.0F);
/*      */     
/*  481 */     this.gunModel[66].addShapeBox(60.0F, -19.0F, 9.5F, 28, 1, 15, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  482 */     this.gunModel[66].setRotationPoint(-54.5F, 1.0F, -17.0F);
/*      */     
/*  484 */     this.gunModel[67].addShapeBox(60.0F, -19.0F, 9.5F, 5, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  485 */     this.gunModel[67].setRotationPoint(-58.0F, 10.75F, -17.0F);
/*      */     
/*  487 */     this.gunModel[68].addShapeBox(60.0F, -19.0F, 9.5F, 19, 28, 3, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -16.0F, 1.0F, -3.0F, -16.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  488 */     this.gunModel[68].setRotationPoint(-74.0F, 13.75F, -17.0F);
/*      */     
/*  490 */     this.gunModel[69].addShapeBox(60.0F, -19.0F, 9.5F, 5, 17, 5, 0.0F, -0.5F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F);
/*  491 */     this.gunModel[69].setRotationPoint(77.0F, -25.5F, -7.0F);
/*      */     
/*  493 */     this.gunModel[70].addShapeBox(60.0F, -19.0F, 9.5F, 8, 6, 5, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, -3.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.3F, 0.0F);
/*  494 */     this.gunModel[70].setRotationPoint(64.0F, -33.0F, -7.0F);
/*      */     
/*  496 */     this.gunModel[71].addShapeBox(60.0F, -19.0F, 9.5F, 5, 6, 5, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, -3.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, -3.5F, 0.0F);
/*  497 */     this.gunModel[71].setRotationPoint(72.0F, -30.0F, -7.0F);
/*      */     
/*  499 */     this.gunModel[72].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.98F, 0.0F, -1.0F, -0.98F);
/*  500 */     this.gunModel[72].setRotationPoint(77.5F, -28.5F, -7.0F);
/*      */     
/*  502 */     this.gunModel[73].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 5, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.98F, 0.0F, -1.0F, -0.98F, 0.0F, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, -0.8F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  503 */     this.gunModel[73].setRotationPoint(77.5F, -27.5F, -7.0F);
/*      */     
/*  505 */     this.gunModel[74].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 3, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -3.75F, 0.5F, 0.0F, 2.75F, 0.5F, 0.0F, 2.75F, 0.5F, -2.0F, -3.75F, 0.5F, -2.0F);
/*  506 */     this.gunModel[74].setRotationPoint(81.0F, -8.75F, -5.0F);
/*      */     
/*  508 */     this.gunModel[75].addShapeBox(60.0F, -19.0F, 9.5F, 3, 3, 3, 0.0F, -0.5F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -0.5F, -2.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F);
/*  509 */     this.gunModel[75].setRotationPoint(-2.0F, 7.25F, -5.0F);
/*      */     
/*  511 */     this.gunModel[76].addShapeBox(60.0F, -19.0F, 9.5F, 17, 1, 15, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F);
/*  512 */     this.gunModel[76].setRotationPoint(-71.75F, 1.25F, -17.0F);
/*      */     
/*  514 */     this.gunModel[77].addShapeBox(60.0F, -19.0F, 9.5F, 91, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  515 */     this.gunModel[77].setRotationPoint(-85.0F, -39.0F, -14.0F);
/*      */     
/*  517 */     this.gunModel[78].addShapeBox(60.0F, -19.0F, 9.5F, 91, 1, 8, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  518 */     this.gunModel[78].setRotationPoint(-85.0F, -37.5F, -13.25F);
/*      */     
/*  520 */     this.gunModel[79].addShapeBox(60.0F, -19.0F, 9.5F, 91, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  521 */     this.gunModel[79].setRotationPoint(-85.0F, -37.0F, -13.0F);
/*      */     
/*  523 */     this.gunModel[80].addShapeBox(60.0F, -19.0F, 9.5F, 54, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  524 */     this.gunModel[80].setRotationPoint(6.0F, -34.0F, -12.5F);
/*      */     
/*  526 */     this.gunModel[81].addShapeBox(60.0F, -19.0F, 9.5F, 30, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  527 */     this.gunModel[81].setRotationPoint(31.0F, -31.0F, -16.0F);
/*      */     
/*  529 */     this.gunModel[82].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  530 */     this.gunModel[82].setRotationPoint(47.0F, -33.5F, -5.5F);
/*      */     
/*  532 */     this.gunModel[83].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F);
/*  533 */     this.gunModel[83].setRotationPoint(47.0F, -32.0F, -5.5F);
/*      */     
/*  535 */     this.gunModel[84].addShapeBox(60.0F, -19.0F, 9.5F, 1, 4, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  536 */     this.gunModel[84].setRotationPoint(48.5F, -35.0F, -5.5F);
/*      */     
/*  538 */     this.gunModel[85].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  539 */     this.gunModel[85].setRotationPoint(50.0F, -32.0F, -5.5F);
/*      */     
/*  541 */     this.gunModel[86].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  542 */     this.gunModel[86].setRotationPoint(50.0F, -33.5F, -5.5F);
/*      */     
/*  544 */     this.gunModel[87].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  545 */     this.gunModel[87].setRotationPoint(50.0F, -35.0F, -5.5F);
/*      */     
/*  547 */     this.gunModel[88].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  548 */     this.gunModel[88].setRotationPoint(47.0F, -35.0F, -5.5F);
/*      */     
/*  550 */     this.gunModel[89].addShapeBox(60.0F, -19.0F, 9.5F, 6, 2, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  551 */     this.gunModel[89].setRotationPoint(35.0F, -33.5F, -5.5F);
/*      */     
/*  553 */     this.gunModel[90].addShapeBox(60.0F, -19.0F, 9.5F, 3, 3, 4, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  554 */     this.gunModel[90].setRotationPoint(35.0F, -34.5F, -3.65F);
/*      */     
/*  556 */     this.gunModel[91].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 1, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  557 */     this.gunModel[91].setRotationPoint(35.5F, -34.0F, 0.35F);
/*      */     
/*  559 */     this.gunModel[92].addShapeBox(60.0F, -19.0F, 9.5F, 1, 3, 4, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -2.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -2.0F, 0.25F, 0.25F, 0.0F);
/*  560 */     this.gunModel[92].setRotationPoint(38.5F, -34.5F, -3.65F);
/*      */     
/*  562 */     this.gunModel[93].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -2.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -2.0F, 0.25F, 0.25F, 0.0F);
/*  563 */     this.gunModel[93].setRotationPoint(40.0F, -34.5F, -3.65F);
/*      */     
/*  565 */     this.gunModel[94].addShapeBox(60.0F, -19.0F, 9.5F, 1, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.7F, 0.0F, 1.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[94].setRotationPoint(62.0F, -31.0F, -16.0F);
/*      */     
/*  568 */     this.gunModel[95].addShapeBox(60.0F, -19.0F, 9.5F, 64, 2, 9, 0.0F, 0.0F, -1.5F, 0.0F, 3.75F, -1.5F, 0.0F, 3.75F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 3.75F, 0.25F, 0.0F, 3.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  569 */     this.gunModel[95].setRotationPoint(18.0F, -7.75F, -14.0F);
/*      */     
/*  571 */     this.gunModel[96].addShapeBox(60.0F, -19.0F, 9.5F, 65, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  572 */     this.gunModel[96].setRotationPoint(-85.0F, -37.0F, -14.0F);
/*      */     
/*  574 */     this.gunModel[97].addShapeBox(60.0F, -19.0F, 9.5F, 91, 4, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[97].setRotationPoint(-85.0F, -37.0F, -16.0F);
/*      */     
/*  577 */     this.gunModel[98].addShapeBox(60.0F, -19.0F, 9.5F, 65, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  578 */     this.gunModel[98].setRotationPoint(-85.0F, -33.0F, -16.0F);
/*      */     
/*  580 */     this.gunModel[99].addShapeBox(60.0F, -19.0F, 9.5F, 63, 16, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[99].setRotationPoint(-83.0F, -27.0F, -19.0F);
/*      */     
/*  583 */     this.gunModel[100].addShapeBox(60.0F, -19.0F, 9.5F, 65, 20, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  584 */     this.gunModel[100].setRotationPoint(-85.0F, -30.5F, -16.0F);
/*      */     
/*  586 */     this.gunModel[101].addShapeBox(60.0F, -19.0F, 9.5F, 97, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  587 */     this.gunModel[101].setRotationPoint(-85.0F, -11.0F, -17.0F);
/*      */     
/*  589 */     this.gunModel[102].addShapeBox(60.0F, -19.0F, 9.5F, 97, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  590 */     this.gunModel[102].setRotationPoint(-85.0F, -11.0F, -19.0F);
/*      */     
/*  592 */     this.gunModel[103].addShapeBox(60.0F, -19.0F, 9.5F, 3, 3, 3, 0.0F, -0.5F, -2.75F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, -0.5F, -2.75F, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  593 */     this.gunModel[103].setRotationPoint(-2.0F, 7.25F, -17.0F);
/*      */     
/*  595 */     this.gunModel[104].addShapeBox(60.0F, -19.0F, 9.5F, 1, 10, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F);
/*  596 */     this.gunModel[104].setRotationPoint(1.0F, -8.75F, -17.0F);
/*      */     
/*  598 */     this.gunModel[105].addShapeBox(60.0F, -19.0F, 9.5F, 3, 6, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 6.25F, 0.0F, 0.0F, 13.0F, 0.0F);
/*  599 */     this.gunModel[105].setRotationPoint(2.0F, -8.75F, -17.0F);
/*      */     
/*  601 */     this.gunModel[106].addShapeBox(60.0F, -19.0F, 9.5F, 4, 3, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, 9.25F, 0.0F);
/*  602 */     this.gunModel[106].setRotationPoint(5.0F, -8.75F, -17.0F);
/*      */     
/*  604 */     this.gunModel[107].addShapeBox(60.0F, -19.0F, 9.5F, 3, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 5.75F, 0.0F);
/*  605 */     this.gunModel[107].setRotationPoint(9.0F, -8.75F, -17.0F);
/*      */     
/*  607 */     this.gunModel[108].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 4.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 4.0F, 0.5F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  608 */     this.gunModel[108].setRotationPoint(12.0F, -8.75F, -17.0F);
/*      */     
/*  610 */     this.gunModel[109].addShapeBox(60.0F, -19.0F, 9.5F, 4, 19, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[109].setRotationPoint(-2.0F, -8.75F, -14.0F);
/*      */     
/*  613 */     this.gunModel[110].addShapeBox(60.0F, -19.0F, 9.5F, 3, 19, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[110].setRotationPoint(2.0F, -8.75F, -14.0F);
/*      */     
/*  616 */     this.gunModel[111].addShapeBox(60.0F, -19.0F, 9.5F, 4, 13, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  617 */     this.gunModel[111].setRotationPoint(5.0F, -8.75F, -14.0F);
/*      */     
/*  619 */     this.gunModel[112].addShapeBox(60.0F, -19.0F, 9.5F, 3, 8, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  620 */     this.gunModel[112].setRotationPoint(9.0F, -8.75F, -14.0F);
/*      */     
/*  622 */     this.gunModel[113].addShapeBox(60.0F, -19.0F, 9.5F, 6, 8, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  623 */     this.gunModel[113].setRotationPoint(12.0F, -8.75F, -14.0F);
/*      */     
/*  625 */     this.gunModel[114].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 9, 0.0F, -0.5F, -1.0F, 3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 3.0F, -0.5F, -0.25F, 3.0F, -3.5F, -0.25F, 0.0F, -3.5F, -0.25F, 0.0F, -0.5F, -0.25F, 3.0F);
/*  626 */     this.gunModel[114].setRotationPoint(-2.0F, 9.25F, -14.0F);
/*      */     
/*  628 */     this.gunModel[115].addShapeBox(60.0F, -19.0F, 9.5F, 35, 3, 1, 0.0F, 0.0F, 0.25F, 0.5F, 3.75F, 0.25F, 0.5F, 3.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 10.0F, 0.0F, 0.5F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[115].setRotationPoint(15.0F, -36.0F, -6.0F);
/*      */     
/*  631 */     this.gunModel[116].addShapeBox(60.0F, -19.0F, 9.5F, 6, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  632 */     this.gunModel[116].setRotationPoint(6.0F, -27.0F, -19.0F);
/*      */     
/*  634 */     this.gunModel[117].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 2, 0.0F, 0.0F, -0.35F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  635 */     this.gunModel[117].setRotationPoint(6.0F, -30.0F, -19.0F);
/*      */     
/*  637 */     this.gunModel[118].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 2, 0.0F, 0.0F, 0.5F, -2.0F, -1.0F, -1.0F, -2.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  638 */     this.gunModel[118].setRotationPoint(12.0F, -28.25F, -19.0F);
/*      */     
/*  640 */     this.gunModel[119].addShapeBox(60.0F, -19.0F, 9.5F, 5, 15, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[119].setRotationPoint(12.0F, -26.0F, -19.0F);
/*      */     
/*  643 */     this.gunModel[120].addShapeBox(60.0F, -19.0F, 9.5F, 5, 15, 2, 0.0F, -4.75F, 0.0F, 0.0F, 6.5F, 1.0F, -2.0F, 6.5F, 1.0F, 0.0F, -4.75F, 2.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  644 */     this.gunModel[120].setRotationPoint(12.25F, -24.5F, -19.0F);
/*      */     
/*  646 */     this.gunModel[121].addShapeBox(60.0F, -19.0F, 9.5F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -2.25F, -2.0F, 0.25F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  647 */     this.gunModel[121].setRotationPoint(12.0F, -11.0F, -19.0F);
/*      */     
/*  649 */     this.gunModel[122].addShapeBox(60.0F, -19.0F, 9.5F, 30, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  650 */     this.gunModel[122].setRotationPoint(31.0F, -31.0F, -17.0F);
/*      */     
/*  652 */     this.gunModel[123].addShapeBox(60.0F, -19.0F, 9.5F, 8, 6, 5, 0.0F, 0.0F, -0.25F, -3.0F, 0.0F, -2.75F, -3.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.3F, 0.0F);
/*  653 */     this.gunModel[123].setRotationPoint(64.0F, -33.0F, -17.0F);
/*      */     
/*  655 */     this.gunModel[124].addShapeBox(60.0F, -19.0F, 9.5F, 5, 6, 5, 0.0F, 0.0F, 0.25F, -3.0F, 0.5F, -1.5F, -3.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, -3.5F, 0.0F);
/*  656 */     this.gunModel[124].setRotationPoint(72.0F, -30.0F, -17.0F);
/*      */     
/*  658 */     this.gunModel[125].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 5, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.98F, 0.0F, -1.0F, -0.98F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  659 */     this.gunModel[125].setRotationPoint(77.5F, -28.5F, -17.0F);
/*      */     
/*  661 */     this.gunModel[126].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 5, 0.0F, 0.0F, -1.0F, -0.98F, 0.0F, -1.0F, -0.98F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, -2.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  662 */     this.gunModel[126].setRotationPoint(77.5F, -27.5F, -17.0F);
/*      */     
/*  664 */     this.gunModel[127].addShapeBox(60.0F, -19.0F, 9.5F, 5, 6, 5, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, -3.5F, 0.0F);
/*  665 */     this.gunModel[127].setRotationPoint(72.0F, -30.0F, -12.0F);
/*      */     
/*  667 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 8, 6, 5, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.3F, 0.0F);
/*  668 */     this.gunModel[''].setRotationPoint(64.0F, -33.0F, -12.0F);
/*      */     
/*  670 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 9, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.5F, 0.0F, 1.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  671 */     this.gunModel[''].setRotationPoint(62.0F, -31.0F, -17.0F);
/*      */     
/*  673 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 63, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, -2.0F, 3.75F, 0.5F, -2.0F, 3.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  674 */     this.gunModel[''].setRotationPoint(18.0F, -8.75F, -17.0F);
/*      */     
/*  676 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 3, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -3.75F, 0.5F, -2.0F, 2.75F, 0.5F, -2.0F, 2.75F, 0.5F, 0.0F, -3.75F, 0.5F, 0.0F);
/*  677 */     this.gunModel[''].setRotationPoint(81.0F, -8.75F, -17.0F);
/*      */     
/*  679 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 5, 17, 5, 0.0F, -0.5F, 0.0F, 0.0F, -3.25F, 0.0F, -2.0F, -3.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/*  680 */     this.gunModel[''].setRotationPoint(77.0F, -25.5F, -17.0F);
/*      */     
/*  682 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 5, 19, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[''].setRotationPoint(72.0F, -27.5F, -17.0F);
/*      */     
/*  685 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 2, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  686 */     this.gunModel[''].setRotationPoint(82.0F, -8.75F, -7.0F);
/*      */     
/*  688 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 2, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  689 */     this.gunModel[''].setRotationPoint(82.0F, -8.75F, -14.0F);
/*      */     
/*  691 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  692 */     this.gunModel[''].setRotationPoint(77.5F, -28.5F, -12.0F);
/*      */     
/*  694 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 34, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  695 */     this.gunModel[''].setRotationPoint(34.0F, -22.5F, -18.5F);
/*      */     
/*  697 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 35, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 3.75F, 0.25F, 0.0F, 3.75F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  698 */     this.gunModel[''].setRotationPoint(15.0F, -36.0F, -14.0F);
/*      */     
/*  700 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 35, 3, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 3.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  701 */     this.gunModel[''].setRotationPoint(15.0F, -36.0F, -15.0F);
/*      */     
/*  703 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 4, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  704 */     this.gunModel[''].setRotationPoint(48.5F, -35.0F, -15.5F);
/*      */     
/*  706 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  707 */     this.gunModel[''].setRotationPoint(50.0F, -35.0F, -15.5F);
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  710 */     this.gunModel[''].setRotationPoint(50.0F, -33.5F, -15.5F);
/*      */     
/*  712 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  713 */     this.gunModel[''].setRotationPoint(50.0F, -32.0F, -15.5F);
/*      */     
/*  715 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  716 */     this.gunModel[''].setRotationPoint(47.0F, -33.5F, -15.5F);
/*      */     
/*  718 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  719 */     this.gunModel[''].setRotationPoint(47.0F, -35.0F, -15.5F);
/*      */     
/*  721 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F);
/*  722 */     this.gunModel[''].setRotationPoint(47.0F, -32.0F, -15.5F);
/*      */     
/*  724 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 1, 19, 8, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.25F, 0.0F, 0.0F, 5.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  725 */     this.gunModel[''].setRotationPoint(75.75F, -27.0F, -15.0F);
/*      */     
/*  727 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 19, 28, 3, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -16.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -16.0F, 1.0F, 0.0F, -16.0F, 1.0F, -3.0F, 0.0F, 1.0F, 0.0F);
/*  728 */     this.gunModel[''].setRotationPoint(-74.0F, 13.75F, -5.0F);
/*      */     
/*  730 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 5, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/*  731 */     this.gunModel[''].setRotationPoint(-58.0F, 10.75F, -5.0F);
/*      */     
/*  733 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 6, 10, 3, 0.0F, -4.5F, -0.75F, 0.0F, 2.0F, -0.75F, 0.0F, 2.0F, -0.75F, -3.0F, -4.5F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F);
/*  734 */     this.gunModel[''].setRotationPoint(-56.0F, 1.25F, -5.0F);
/*      */     
/*  736 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 19, 28, 9, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -16.0F, 1.0F, 0.0F, -16.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  737 */     this.gunModel[''].setRotationPoint(-74.0F, 13.75F, -14.0F);
/*      */     
/*  739 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 5, 3, 9, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[''].setRotationPoint(-58.0F, 10.75F, -14.0F);
/*      */     
/*  742 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 6, 10, 9, 0.0F, -4.5F, -0.75F, 0.0F, 2.0F, -0.75F, 0.0F, 2.0F, -0.75F, 0.0F, -4.5F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  743 */     this.gunModel[''].setRotationPoint(-56.0F, 1.25F, -14.0F);
/*      */     
/*  745 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 3, 0.0F, 0.5F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.5F, -0.75F, -3.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F);
/*  746 */     this.gunModel[''].setRotationPoint(-72.0F, 1.25F, -5.0F);
/*      */     
/*  748 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 22, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 16.25F, 0.0F, 0.0F, -14.25F, 0.0F, 0.0F, -14.25F, 0.0F, 0.0F, 16.25F, 0.0F, -3.0F);
/*  749 */     this.gunModel[''].setRotationPoint(-73.75F, 8.25F, -5.0F);
/*      */     
/*  751 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 4, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, -3.0F);
/*  752 */     this.gunModel[''].setRotationPoint(-72.0F, 4.25F, -5.0F);
/*      */     
/*  754 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 9, 0.0F, 0.5F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  755 */     this.gunModel[''].setRotationPoint(-72.0F, 1.25F, -14.0F);
/*      */     
/*  757 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 22, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 16.25F, 0.0F, 0.0F, -14.25F, 0.0F, 0.0F, -14.25F, 0.0F, 0.0F, 16.25F, 0.0F, 0.0F);
/*  758 */     this.gunModel[''].setRotationPoint(-73.75F, 8.25F, -14.0F);
/*      */     
/*  760 */     this.gunModel[''].addShapeBox(60.0F, -19.0F, 9.5F, 2, 4, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/*  761 */     this.gunModel[''].setRotationPoint(-72.0F, 4.25F, -14.0F);
/*      */     
/*  763 */     this.gunModel[' '].addShapeBox(60.0F, -19.0F, 9.5F, 10, 2, 15, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[' '].setRotationPoint(-69.25F, 2.25F, -17.0F);
/*      */     
/*  766 */     this.gunModel['¡'].addShapeBox(60.0F, -19.0F, 9.5F, 10, 4, 15, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F);
/*  767 */     this.gunModel['¡'].setRotationPoint(-69.25F, 4.5F, -17.0F);
/*      */     
/*  769 */     this.gunModel['¢'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 22, 15, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 14.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 14.75F, -0.25F, 0.0F);
/*  770 */     this.gunModel['¢'].setRotationPoint(-71.25F, 8.5F, -17.0F);
/*      */     
/*  772 */     this.gunModel['£'].addShapeBox(60.0F, -19.0F, 9.5F, 8, 10, 15, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  773 */     this.gunModel['£'].setRotationPoint(-59.25F, 1.25F, -17.0F);
/*      */     
/*  775 */     this.gunModel['¤'].addShapeBox(60.0F, -19.0F, 9.5F, 11, 2, 15, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F);
/*  776 */     this.gunModel['¤'].setRotationPoint(-70.25F, 8.5F, -17.0F);
/*      */     
/*  778 */     this.gunModel['¥'].addShapeBox(60.0F, -19.0F, 9.5F, 11, 2, 15, 0.0F, 0.75F, 0.75F, 0.0F, 3.25F, 0.75F, 0.0F, 3.25F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F);
/*  779 */     this.gunModel['¥'].setRotationPoint(-70.25F, 11.5F, -17.0F);
/*      */     
/*  781 */     this.gunModel['¦'].addShapeBox(60.0F, -19.0F, 9.5F, 11, 16, 15, 0.0F, 0.75F, 0.75F, 0.0F, 1.25F, 0.75F, 0.0F, 1.25F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  782 */     this.gunModel['¦'].setRotationPoint(-70.25F, 14.5F, -17.0F);
/*      */     
/*  784 */     this.gunModel['§'].addShapeBox(60.0F, -19.0F, 9.5F, 16, 11, 15, 0.0F, 0.75F, 0.75F, 0.0F, 2.0F, 0.75F, 0.0F, 2.0F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  785 */     this.gunModel['§'].setRotationPoint(-85.25F, 31.25F, -17.0F);
/*      */     
/*  787 */     this.gunModel['¨'].addShapeBox(60.0F, -19.0F, 9.5F, 15, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  788 */     this.gunModel['¨'].setRotationPoint(-86.0F, 30.25F, -17.0F);
/*      */     
/*  790 */     this.gunModel['©'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 5, 3, 0.0F, 0.25F, -0.75F, -3.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, -3.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  791 */     this.gunModel['©'].setRotationPoint(-89.75F, 29.5F, -17.0F);
/*      */     
/*  793 */     this.gunModel['ª'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 5, 3, 0.0F, 0.25F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.25F, -0.75F, -3.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/*  794 */     this.gunModel['ª'].setRotationPoint(-89.75F, 29.5F, -5.0F);
/*      */     
/*  796 */     this.gunModel['«'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 5, 9, 0.0F, 0.25F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  797 */     this.gunModel['«'].setRotationPoint(-89.75F, 29.5F, -14.0F);
/*      */     
/*  799 */     this.gunModel['¬'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  800 */     this.gunModel['¬'].setRotationPoint(79.0F, -21.5F, -13.5F);
/*      */     
/*  802 */     this.gunModel['­'].addShapeBox(60.0F, -19.0F, 9.5F, 13, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  803 */     this.gunModel['­'].setRotationPoint(84.0F, -22.0F, -14.0F);
/*      */     
/*  805 */     this.gunModel['®'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 3, 6, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel['®'].setRotationPoint(-55.0F, 10.75F, -12.5F);
/*      */     
/*  808 */     this.gunModel['¯'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 3, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  809 */     this.gunModel['¯'].setRotationPoint(-52.0F, 12.75F, -12.5F);
/*      */     
/*  811 */     this.gunModel['°'].addShapeBox(60.0F, -19.0F, 9.5F, 15, 3, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  812 */     this.gunModel['°'].setRotationPoint(-47.0F, 14.75F, -12.5F);
/*      */     
/*  814 */     this.gunModel['±'].addShapeBox(60.0F, -19.0F, 9.5F, 9, 3, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  815 */     this.gunModel['±'].setRotationPoint(-32.0F, 16.5F, -12.5F);
/*      */     
/*  817 */     this.gunModel['²'].addShapeBox(60.0F, -19.0F, 9.5F, 9, 3, 6, 0.0F, -3.25F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.25F, 1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  818 */     this.gunModel['²'].setRotationPoint(-31.25F, 14.25F, -12.5F);
/*      */     
/*  820 */     this.gunModel['³'].addShapeBox(60.0F, -19.0F, 9.5F, 9, 4, 6, 0.0F, -0.5F, -0.75F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, -3.25F, 1.0F, 0.0F, -3.25F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  821 */     this.gunModel['³'].setRotationPoint(-27.5F, 9.25F, -12.5F);
/*      */     
/*  823 */     this.gunModel['´'].addShapeBox(60.0F, -19.0F, 9.5F, 9, 2, 6, 0.0F, -4.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -4.25F, 0.0F, 0.0F, -3.25F, 1.0F, 0.0F, 0.5F, 0.15F, 0.0F, 0.5F, 0.15F, 0.0F, -3.25F, 1.0F, 0.0F);
/*  824 */     this.gunModel['´'].setRotationPoint(-30.25F, 7.0F, -12.5F);
/*      */     
/*  826 */     this.gunModel['µ'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 2, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  827 */     this.gunModel['µ'].setRotationPoint(-46.5F, 1.75F, -11.5F);
/*      */     
/*  829 */     this.gunModel['¶'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  830 */     this.gunModel['¶'].setRotationPoint(-46.25F, 3.75F, -11.5F);
/*      */     
/*  832 */     this.gunModel['·'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 6, 4, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  833 */     this.gunModel['·'].setRotationPoint(-46.25F, 5.75F, -11.5F);
/*      */     
/*  835 */     this.gunModel['¸'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 4, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  836 */     this.gunModel['¸'].setRotationPoint(-45.25F, 11.75F, -11.5F);
/*      */     
/*  838 */     this.gunModel['¹'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 16, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel['¹'].setRotationPoint(2.0F, -27.0F, -19.0F);
/*      */     
/*  841 */     this.gunModel['º'].addShapeBox(60.0F, -19.0F, 9.5F, 22, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  842 */     this.gunModel['º'].setRotationPoint(-20.0F, -20.0F, -19.0F);
/*      */     
/*  844 */     this.gunModel['»'].addShapeBox(60.0F, -19.0F, 9.5F, 8, 20, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  845 */     this.gunModel['»'].setRotationPoint(2.0F, -30.5F, -16.0F);
/*      */     
/*  847 */     this.gunModel['¼'].addShapeBox(60.0F, -19.0F, 9.5F, 22, 20, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  848 */     this.gunModel['¼'].setRotationPoint(-20.0F, -30.5F, -12.0F);
/*      */     
/*  850 */     this.gunModel['½'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  851 */     this.gunModel['½'].setRotationPoint(2.0F, -33.0F, -16.0F);
/*      */     
/*  853 */     this.gunModel['¾'].addShapeBox(60.0F, -19.0F, 9.5F, 26, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  854 */     this.gunModel['¾'].setRotationPoint(-20.0F, -37.0F, -14.0F);
/*      */     
/*  856 */     this.gunModel['¿'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  857 */     this.gunModel['¿'].setRotationPoint(2.0F, -37.0F, -14.0F);
/*      */     
/*  859 */     this.gunModel['À'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  860 */     this.gunModel['À'].setRotationPoint(-20.0F, -32.0F, -16.0F);
/*      */     
/*  862 */     this.gunModel['Á'].addShapeBox(60.0F, -19.0F, 9.5F, 22, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  863 */     this.gunModel['Á'].setRotationPoint(-20.0F, -33.0F, -16.0F);
/*      */     
/*  865 */     this.gunModel['Â'].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/*  866 */     this.gunModel['Â'].setRotationPoint(0.0F, -32.0F, -16.0F);
/*      */     
/*  868 */     this.gunModel['Ã'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/*  869 */     this.gunModel['Ã'].setRotationPoint(9.0F, -20.0F, -1.0F);
/*      */     
/*  871 */     this.gunModel['Ä'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel['Ä'].setRotationPoint(9.0F, -17.0F, 1.25F);
/*      */     
/*  874 */     this.gunModel['Å'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  875 */     this.gunModel['Å'].setRotationPoint(9.0F, -14.0F, -0.75F);
/*      */     
/*  877 */     this.gunModel['Æ'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  878 */     this.gunModel['Æ'].setRotationPoint(9.0F, -17.0F, -0.75F);
/*      */     
/*  880 */     this.gunModel['Ç'].addShapeBox(60.0F, -19.0F, 9.5F, 10, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel['Ç'].setRotationPoint(4.5F, -14.5F, 0.25F);
/*      */     
/*  883 */     this.gunModel['È'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  884 */     this.gunModel['È'].setRotationPoint(4.5F, -13.5F, 0.25F);
/*      */     
/*  886 */     this.gunModel['É'].addShapeBox(60.0F, -19.0F, 9.5F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  887 */     this.gunModel['É'].setRotationPoint(4.5F, -6.5F, 0.25F);
/*      */     
/*  889 */     this.gunModel['Ê'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  890 */     this.gunModel['Ê'].setRotationPoint(13.5F, -13.5F, 0.25F);
/*      */     
/*  892 */     this.gunModel['Ë'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F);
/*  893 */     this.gunModel['Ë'].setRotationPoint(-70.0F, -34.0F, -4.0F);
/*      */     
/*  895 */     this.gunModel['Ì'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  896 */     this.gunModel['Ì'].setRotationPoint(-70.0F, -32.5F, -1.0F);
/*      */     
/*  898 */     this.gunModel['Í'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  899 */     this.gunModel['Í'].setRotationPoint(-70.0F, -29.5F, -4.0F);
/*      */     
/*  901 */     this.gunModel['Î'].addShapeBox(60.0F, -19.0F, 9.5F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  902 */     this.gunModel['Î'].setRotationPoint(-76.0F, -27.0F, 0.0F);
/*      */     
/*  904 */     this.gunModel['Ï'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel['Ï'].setRotationPoint(-64.0F, -27.0F, 0.0F);
/*      */     
/*  907 */     this.gunModel['Ð'].addShapeBox(60.0F, -19.0F, 9.5F, 12, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel['Ð'].setRotationPoint(-76.0F, -25.0F, 1.0F);
/*      */     
/*  910 */     this.gunModel['Ñ'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  911 */     this.gunModel['Ñ'].setRotationPoint(-76.0F, -25.0F, 0.0F);
/*      */     
/*  913 */     this.gunModel['Ò'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  914 */     this.gunModel['Ò'].setRotationPoint(-76.0F, -14.0F, 0.0F);
/*      */     
/*  916 */     this.gunModel['Ó'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 3, 0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  917 */     this.gunModel['Ó'].setRotationPoint(-70.0F, -29.5F, -19.0F);
/*      */     
/*  919 */     this.gunModel['Ô'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  920 */     this.gunModel['Ô'].setRotationPoint(-70.0F, -32.5F, -20.0F);
/*      */     
/*  922 */     this.gunModel['Õ'].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  923 */     this.gunModel['Õ'].setRotationPoint(-70.0F, -34.0F, -19.0F);
/*      */     
/*  925 */     this.gunModel['Ö'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  926 */     this.gunModel['Ö'].setRotationPoint(-83.0F, -24.0F, -21.0F);
/*      */     
/*  928 */     this.gunModel['×'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  929 */     this.gunModel['×'].setRotationPoint(-88.0F, -33.0F, -21.0F);
/*      */     
/*  931 */     this.gunModel['Ø'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  932 */     this.gunModel['Ø'].setRotationPoint(-87.5F, -29.0F, -20.5F);
/*      */     
/*  934 */     this.gunModel['Ù'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 11, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  935 */     this.gunModel['Ù'].setRotationPoint(-88.0F, -28.0F, -21.0F);
/*      */     
/*  937 */     this.gunModel['Ú'].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  938 */     this.gunModel['Ú'].setRotationPoint(-87.5F, -17.0F, -20.5F);
/*      */     
/*  940 */     this.gunModel['Û'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  941 */     this.gunModel['Û'].setRotationPoint(-88.0F, -16.0F, -21.0F);
/*      */     
/*  943 */     this.gunModel['Ü'].addShapeBox(60.0F, -19.0F, 9.5F, 74, 11, 13, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -2.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.35F, 0.0F, 0.0F);
/*  944 */     this.gunModel['Ü'].setRotationPoint(-159.0F, -19.0F, -16.0F);
/*      */     
/*  946 */     this.gunModel['Ý'].addShapeBox(60.0F, -19.0F, 9.5F, 45, 14, 4, 0.0F, 0.0F, -11.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  947 */     this.gunModel['Ý'].setRotationPoint(-130.0F, -36.5F, -16.0F);
/*      */     
/*  949 */     this.gunModel['Þ'].addShapeBox(60.0F, -19.0F, 9.5F, 45, 18, 5, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  950 */     this.gunModel['Þ'].setRotationPoint(-130.0F, -36.5F, -12.0F);
/*      */     
/*  952 */     this.gunModel['ß'].addShapeBox(60.0F, -19.0F, 9.5F, 45, 14, 4, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -11.0F, -4.0F, 0.0F, 3.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  953 */     this.gunModel['ß'].setRotationPoint(-130.0F, -36.5F, -7.0F);
/*      */     
/*  955 */     this.gunModel['à'].addShapeBox(60.0F, -19.0F, 9.5F, 45, 11, 4, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  956 */     this.gunModel['à'].setRotationPoint(-130.0F, -30.0F, -7.0F);
/*      */     
/*  958 */     this.gunModel['á'].addShapeBox(60.0F, -19.0F, 9.5F, 45, 11, 4, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  959 */     this.gunModel['á'].setRotationPoint(-130.0F, -30.0F, -16.0F);
/*      */     
/*  961 */     this.gunModel['â'].addShapeBox(60.0F, -19.0F, 9.5F, 41, 6, 13, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F);
/*  962 */     this.gunModel['â'].setRotationPoint(-157.0F, -8.0F, -16.0F);
/*      */     
/*  964 */     this.gunModel['ã'].addShapeBox(60.0F, -19.0F, 9.5F, 38, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  965 */     this.gunModel['ã'].setRotationPoint(-168.0F, -25.5F, -7.0F);
/*      */     
/*  967 */     this.gunModel['ä'].addShapeBox(60.0F, -19.0F, 9.5F, 38, 6, 4, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  968 */     this.gunModel['ä'].setRotationPoint(-168.0F, -25.5F, -16.0F);
/*      */     
/*  970 */     this.gunModel['å'].addShapeBox(60.0F, -19.0F, 9.5F, 38, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel['å'].setRotationPoint(-168.0F, -25.5F, -12.0F);
/*      */     
/*  973 */     this.gunModel['æ'].addShapeBox(60.0F, -19.0F, 9.5F, 29, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F);
/*  974 */     this.gunModel['æ'].setRotationPoint(-159.0F, -19.5F, -16.0F);
/*      */     
/*  976 */     this.gunModel['ç'].addShapeBox(60.0F, -19.0F, 9.5F, 28, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -20.0F, 0.0F, 0.0F, -20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  977 */     this.gunModel['ç'].setRotationPoint(-158.0F, -2.0F, -14.5F);
/*      */     
/*  979 */     this.gunModel['è'].addShapeBox(60.0F, -19.0F, 9.5F, 8, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  980 */     this.gunModel['è'].setRotationPoint(-158.0F, 4.0F, -14.5F);
/*      */     
/*  982 */     this.gunModel['é'].addShapeBox(60.0F, -19.0F, 9.5F, 2, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  983 */     this.gunModel['é'].setRotationPoint(-158.0F, 10.0F, -14.5F);
/*      */     
/*  985 */     this.gunModel['ê'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 19, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  986 */     this.gunModel['ê'].setRotationPoint(-164.0F, -2.0F, -14.5F);
/*      */     
/*  988 */     this.gunModel['ë'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  989 */     this.gunModel['ë'].setRotationPoint(-158.0F, -6.0F, -14.5F);
/*      */     
/*  991 */     this.gunModel['ì'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 10, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  992 */     this.gunModel['ì'].setRotationPoint(-164.0F, -6.0F, -14.5F);
/*      */     
/*  994 */     this.gunModel['í'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 1, 10, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  995 */     this.gunModel['í'].setRotationPoint(-161.0F, -7.0F, -14.5F);
/*      */     
/*  997 */     this.gunModel['î'].addShapeBox(60.0F, -19.0F, 9.5F, 12, 31, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  998 */     this.gunModel['î'].setRotationPoint(-169.0F, -19.5F, -14.0F);
/*      */     
/* 1000 */     this.gunModel['ï'].addShapeBox(60.0F, -19.0F, 9.5F, 9, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1001 */     this.gunModel['ï'].setRotationPoint(-171.0F, 11.5F, -14.0F);
/*      */     
/* 1003 */     this.gunModel['ð'].addShapeBox(60.0F, -19.0F, 9.5F, 9, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1004 */     this.gunModel['ð'].setRotationPoint(-171.0F, 19.5F, -14.0F);
/*      */     
/* 1006 */     this.gunModel['ñ'].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 11, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 1007 */     this.gunModel['ñ'].setRotationPoint(-160.0F, -3.0F, -15.0F);
/*      */     
/* 1009 */     this.gunModel['ò'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1010 */     this.gunModel['ò'].setRotationPoint(-174.0F, -23.5F, -16.0F);
/*      */     
/* 1012 */     this.gunModel['ó'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 13, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1013 */     this.gunModel['ó'].setRotationPoint(-174.0F, -27.5F, -16.0F);
/*      */     
/* 1015 */     this.gunModel['ô'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 43, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 1016 */     this.gunModel['ô'].setRotationPoint(-171.0F, -19.5F, -16.0F);
/*      */     
/* 1018 */     this.gunModel['õ'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 25, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1019 */     this.gunModel['õ'].setRotationPoint(-174.0F, -19.5F, -16.0F);
/*      */     
/* 1021 */     this.gunModel['ö'].addShapeBox(60.0F, -19.0F, 9.5F, 3, 25, 13, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1022 */     this.gunModel['ö'].setRotationPoint(-174.0F, 1.5F, -16.0F);
/*      */     
/* 1024 */     this.gunModel['÷'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 11, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1025 */     this.gunModel['÷'].setRotationPoint(-91.0F, -25.0F, -3.0F);
/*      */     
/* 1027 */     this.gunModel['ø'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1028 */     this.gunModel['ø'].setRotationPoint(-25.0F, -10.75F, -2.5F);
/*      */     
/* 1030 */     this.gunModel['ù'].addShapeBox(60.0F, -19.0F, 9.5F, 9, 7, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 1.5F, 0.0F, -0.75F, 1.5F);
/* 1031 */     this.gunModel['ù'].setRotationPoint(-34.0F, -6.0F, -2.5F);
/*      */     
/* 1033 */     this.gunModel['ú'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 1.5F, 0.0F, -0.75F, 1.5F);
/* 1034 */     this.gunModel['ú'].setRotationPoint(-25.0F, -6.0F, -2.5F);
/*      */     
/* 1036 */     this.gunModel['û'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 9, 1, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 1.0F);
/* 1037 */     this.gunModel['û'].setRotationPoint(-50.0F, -8.75F, -2.0F);
/*      */     
/* 1039 */     this.gunModel['ü'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1040 */     this.gunModel['ü'].setRotationPoint(-58.0F, -8.25F, -18.5F);
/*      */     
/* 1042 */     this.gunModel['ý'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 2, 18, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1043 */     this.gunModel['ý'].setRotationPoint(-58.0F, -10.25F, -18.5F);
/*      */     
/* 1045 */     this.gunModel['þ'].addShapeBox(60.0F, -19.0F, 9.5F, 6, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1046 */     this.gunModel['þ'].setRotationPoint(-58.0F, -6.25F, -18.5F);
/*      */     
/* 1048 */     this.gunModel['ÿ'].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 18, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1049 */     this.gunModel['ÿ'].setRotationPoint(-54.0F, -6.25F, -18.5F);
/*      */     
/* 1051 */     this.gunModel['Ā'].addShapeBox(60.0F, -19.0F, 9.5F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1052 */     this.gunModel['Ā'].setRotationPoint(-53.25F, -4.25F, -18.5F);
/*      */     
/* 1054 */     this.gunModel['ā'].addShapeBox(60.0F, -19.0F, 9.5F, 34, 7, 1, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1055 */     this.gunModel['ā'].setRotationPoint(34.0F, -21.5F, -18.0F);
/*      */     
/* 1057 */     this.gunModel['Ă'].addShapeBox(60.0F, -19.0F, 9.5F, 34, 7, 1, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1058 */     this.gunModel['Ă'].setRotationPoint(34.0F, -21.5F, -2.5F);
/*      */     
/* 1060 */     this.gunModel['ă'].addShapeBox(60.0F, -19.0F, 9.5F, 5, 9, 1, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1061 */     this.gunModel['ă'].setRotationPoint(-50.0F, -8.75F, -18.0F);
/*      */     
/*      */ 
/* 1064 */     this.defaultScopeModel = new ModelRendererTurbo[46];
/* 1065 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 225, 137, this.textureX, this.textureY);
/* 1066 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/* 1067 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 1068 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/* 1069 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 377, 137, this.textureX, this.textureY);
/* 1070 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/* 1071 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 1072 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 1073 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 1074 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/* 1075 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 1076 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 1077 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/* 1078 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/* 1079 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/* 1080 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/* 1081 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/* 1082 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/* 1083 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/* 1084 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/* 1085 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/* 1086 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/* 1087 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/* 1088 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 1089 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 1090 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/* 1091 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/* 1092 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/* 1093 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 1094 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/* 1095 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/* 1096 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/* 1097 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 153, 433, this.textureX, this.textureY);
/* 1098 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 385, 153, this.textureX, this.textureY);
/* 1099 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/* 1100 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/* 1101 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 481, 257, this.textureX, this.textureY);
/* 1102 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 113, 265, this.textureX, this.textureY);
/* 1103 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 329, 281, this.textureX, this.textureY);
/* 1104 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 25, 289, this.textureX, this.textureY);
/* 1105 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 273, 289, this.textureX, this.textureY);
/* 1106 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/* 1107 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 1108 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 273, 137, this.textureX, this.textureY);
/* 1109 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 73, 153, this.textureX, this.textureY);
/* 1110 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/*      */     
/* 1112 */     this.defaultScopeModel[0].addShapeBox(60.0F, -19.0F, 9.5F, 17, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1113 */     this.defaultScopeModel[0].setRotationPoint(26.0F, -42.0F, -12.5F);
/*      */     
/* 1115 */     this.defaultScopeModel[1].addShapeBox(60.0F, -19.0F, 9.5F, 13, 5, 1, 0.0F, -10.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -10.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1116 */     this.defaultScopeModel[1].setRotationPoint(26.0F, -47.0F, -6.5F);
/*      */     
/* 1118 */     this.defaultScopeModel[2].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1119 */     this.defaultScopeModel[2].setRotationPoint(32.0F, -41.0F, -6.25F);
/*      */     
/* 1121 */     this.defaultScopeModel[3].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1122 */     this.defaultScopeModel[3].setRotationPoint(39.5F, -41.0F, -6.25F);
/*      */     
/* 1124 */     this.defaultScopeModel[4].addShapeBox(60.0F, -19.0F, 9.5F, 19, 5, 7, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1125 */     this.defaultScopeModel[4].setRotationPoint(-84.5F, -42.0F, -12.5F);
/*      */     
/* 1127 */     this.defaultScopeModel[5].addShapeBox(60.0F, -19.0F, 9.5F, 19, 5, 1, 0.0F, -8.5F, -1.0F, 0.0F, -2.25F, -1.0F, 0.0F, -2.25F, -1.0F, 0.0F, -8.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1128 */     this.defaultScopeModel[5].setRotationPoint(-84.5F, -46.0F, -6.5F);
/*      */     
/* 1130 */     this.defaultScopeModel[6].addShapeBox(60.0F, -19.0F, 9.5F, 8, 1, 1, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1131 */     this.defaultScopeModel[6].setRotationPoint(-75.75F, -46.0F, -6.5F);
/*      */     
/* 1133 */     this.defaultScopeModel[7].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1134 */     this.defaultScopeModel[7].setRotationPoint(-79.0F, -43.75F, -6.25F);
/*      */     
/* 1136 */     this.defaultScopeModel[8].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1137 */     this.defaultScopeModel[8].setRotationPoint(-79.0F, -42.25F, -6.25F);
/*      */     
/* 1139 */     this.defaultScopeModel[9].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F);
/* 1140 */     this.defaultScopeModel[9].setRotationPoint(-79.0F, -40.75F, -6.25F);
/*      */     
/* 1142 */     this.defaultScopeModel[10].addShapeBox(60.0F, -19.0F, 9.5F, 1, 4, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1143 */     this.defaultScopeModel[10].setRotationPoint(-77.5F, -43.75F, -6.25F);
/*      */     
/* 1145 */     this.defaultScopeModel[11].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1146 */     this.defaultScopeModel[11].setRotationPoint(-76.0F, -40.75F, -6.25F);
/*      */     
/* 1148 */     this.defaultScopeModel[12].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1149 */     this.defaultScopeModel[12].setRotationPoint(-76.0F, -42.25F, -6.25F);
/*      */     
/* 1151 */     this.defaultScopeModel[13].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1152 */     this.defaultScopeModel[13].setRotationPoint(-76.0F, -43.75F, -6.25F);
/*      */     
/* 1154 */     this.defaultScopeModel[14].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1155 */     this.defaultScopeModel[14].setRotationPoint(-70.5F, -41.0F, -6.25F);
/*      */     
/* 1157 */     this.defaultScopeModel[15].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1158 */     this.defaultScopeModel[15].setRotationPoint(-82.5F, -41.0F, -6.25F);
/*      */     
/* 1160 */     this.defaultScopeModel[16].addShapeBox(60.0F, -19.0F, 9.5F, 19, 5, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1161 */     this.defaultScopeModel[16].setRotationPoint(-84.5F, -42.0F, -13.5F);
/*      */     
/* 1163 */     this.defaultScopeModel[17].addShapeBox(60.0F, -19.0F, 9.5F, 19, 5, 1, 0.0F, -8.5F, -1.0F, 0.0F, -2.25F, -1.0F, 0.0F, -2.25F, -1.0F, 0.0F, -8.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1164 */     this.defaultScopeModel[17].setRotationPoint(-84.5F, -46.0F, -13.5F);
/*      */     
/* 1166 */     this.defaultScopeModel[18].addShapeBox(60.0F, -19.0F, 9.5F, 8, 1, 1, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1167 */     this.defaultScopeModel[18].setRotationPoint(-75.75F, -46.0F, -13.5F);
/*      */     
/* 1169 */     this.defaultScopeModel[19].addShapeBox(60.0F, -19.0F, 9.5F, 17, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1170 */     this.defaultScopeModel[19].setRotationPoint(26.0F, -42.0F, -13.5F);
/*      */     
/* 1172 */     this.defaultScopeModel[20].addShapeBox(60.0F, -19.0F, 9.5F, 13, 5, 1, 0.0F, -10.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -10.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1173 */     this.defaultScopeModel[20].setRotationPoint(26.0F, -47.0F, -13.5F);
/*      */     
/* 1175 */     this.defaultScopeModel[21].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1176 */     this.defaultScopeModel[21].setRotationPoint(-82.5F, -41.0F, -13.75F);
/*      */     
/* 1178 */     this.defaultScopeModel[22].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1179 */     this.defaultScopeModel[22].setRotationPoint(-70.5F, -41.0F, -13.75F);
/*      */     
/* 1181 */     this.defaultScopeModel[23].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F);
/* 1182 */     this.defaultScopeModel[23].setRotationPoint(-79.0F, -40.75F, -13.75F);
/*      */     
/* 1184 */     this.defaultScopeModel[24].addShapeBox(60.0F, -19.0F, 9.5F, 1, 4, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1185 */     this.defaultScopeModel[24].setRotationPoint(-77.5F, -43.75F, -13.75F);
/*      */     
/* 1187 */     this.defaultScopeModel[25].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1188 */     this.defaultScopeModel[25].setRotationPoint(-76.0F, -40.75F, -13.75F);
/*      */     
/* 1190 */     this.defaultScopeModel[26].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1191 */     this.defaultScopeModel[26].setRotationPoint(-76.0F, -42.25F, -13.75F);
/*      */     
/* 1193 */     this.defaultScopeModel[27].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1194 */     this.defaultScopeModel[27].setRotationPoint(-76.0F, -43.75F, -13.75F);
/*      */     
/* 1196 */     this.defaultScopeModel[28].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1197 */     this.defaultScopeModel[28].setRotationPoint(-79.0F, -43.75F, -13.75F);
/*      */     
/* 1199 */     this.defaultScopeModel[29].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1200 */     this.defaultScopeModel[29].setRotationPoint(-79.0F, -42.25F, -13.75F);
/*      */     
/* 1202 */     this.defaultScopeModel[30].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1203 */     this.defaultScopeModel[30].setRotationPoint(32.0F, -41.0F, -13.75F);
/*      */     
/* 1205 */     this.defaultScopeModel[31].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1206 */     this.defaultScopeModel[31].setRotationPoint(39.5F, -41.0F, -13.75F);
/*      */     
/* 1208 */     this.defaultScopeModel[32].addShapeBox(60.0F, -19.0F, 9.5F, 19, 2, 6, 0.0F, -2.15F, -1.0F, 0.0F, -0.55F, -1.0F, 0.0F, -0.55F, -1.0F, 0.0F, -2.15F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1209 */     this.defaultScopeModel[32].setRotationPoint(-84.5F, -43.0F, -12.5F);
/*      */     
/* 1211 */     this.defaultScopeModel[33].addShapeBox(60.0F, -19.0F, 9.5F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 5.35F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 5.35F, 0.0F, 0.0F);
/* 1212 */     this.defaultScopeModel[33].setRotationPoint(-76.0F, -43.0F, -10.5F);
/*      */     
/* 1214 */     this.defaultScopeModel[34].addShapeBox(60.0F, -19.0F, 9.5F, 8, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.35F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 5.35F, 0.0F, 0.0F);
/* 1215 */     this.defaultScopeModel[34].setRotationPoint(-76.0F, -43.0F, -9.5F);
/*      */     
/* 1217 */     this.defaultScopeModel[35].addShapeBox(60.0F, -19.0F, 9.5F, 8, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.35F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 5.35F, 0.0F, 0.0F);
/* 1218 */     this.defaultScopeModel[35].setRotationPoint(-76.0F, -44.0F, -8.5F);
/*      */     
/* 1220 */     this.defaultScopeModel[36].addShapeBox(60.0F, -19.0F, 9.5F, 8, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 5.35F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 5.35F, 0.0F, 0.0F);
/* 1221 */     this.defaultScopeModel[36].setRotationPoint(-76.0F, -44.0F, -11.5F);
/*      */     
/* 1223 */     this.defaultScopeModel[37].addShapeBox(60.0F, -19.0F, 9.5F, 8, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.35F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 5.35F, 0.0F, 0.0F);
/* 1224 */     this.defaultScopeModel[37].setRotationPoint(-76.0F, -44.0F, -7.5F);
/*      */     
/* 1226 */     this.defaultScopeModel[38].addShapeBox(60.0F, -19.0F, 9.5F, 8, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.35F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 1.95F, 0.0F, 0.0F, 5.35F, 0.0F, 0.0F);
/* 1227 */     this.defaultScopeModel[38].setRotationPoint(-76.0F, -44.0F, -12.5F);
/*      */     
/* 1229 */     this.defaultScopeModel[39].addShapeBox(60.0F, -19.0F, 9.5F, 8, 1, 1, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1230 */     this.defaultScopeModel[39].setRotationPoint(-76.0F, -45.5F, -7.5F);
/*      */     
/* 1232 */     this.defaultScopeModel[40].addShapeBox(60.0F, -19.0F, 9.5F, 8, 1, 1, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1233 */     this.defaultScopeModel[40].setRotationPoint(-76.0F, -45.5F, -12.5F);
/*      */     
/* 1235 */     this.defaultScopeModel[41].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, -1.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1236 */     this.defaultScopeModel[41].setRotationPoint(-78.25F, -44.5F, -7.5F);
/*      */     
/* 1238 */     this.defaultScopeModel[42].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, -1.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1239 */     this.defaultScopeModel[42].setRotationPoint(-78.25F, -44.5F, -12.5F);
/*      */     
/* 1241 */     this.defaultScopeModel[43].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 1, 0.0F, -1.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -1.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 1.0F, 0.0F, 0.1F, 1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 1242 */     this.defaultScopeModel[43].setRotationPoint(35.0F, -44.0F, -10.0F);
/*      */     
/* 1244 */     this.defaultScopeModel[44].addShapeBox(60.0F, -19.0F, 9.5F, 3, 3, 1, 0.0F, -0.75F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F);
/* 1245 */     this.defaultScopeModel[44].setRotationPoint(36.0F, -47.0F, -10.0F);
/*      */     
/* 1247 */     this.defaultScopeModel[45].addShapeBox(60.0F, -19.0F, 9.5F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 1248 */     this.defaultScopeModel[45].setRotationPoint(36.5F, -46.0F, -10.0F);
/*      */     
/*      */ 
/* 1251 */     this.defaultGripModel = new ModelRendererTurbo[9];
/* 1252 */     this.defaultGripModel[0] = new ModelRendererTurbo(this, 217, 289, this.textureX, this.textureY);
/* 1253 */     this.defaultGripModel[1] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/* 1254 */     this.defaultGripModel[2] = new ModelRendererTurbo(this, 481, 265, this.textureX, this.textureY);
/* 1255 */     this.defaultGripModel[3] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/* 1256 */     this.defaultGripModel[4] = new ModelRendererTurbo(this, 329, 289, this.textureX, this.textureY);
/* 1257 */     this.defaultGripModel[5] = new ModelRendererTurbo(this, 377, 289, this.textureX, this.textureY);
/* 1258 */     this.defaultGripModel[6] = new ModelRendererTurbo(this, 465, 289, this.textureX, this.textureY);
/* 1259 */     this.defaultGripModel[7] = new ModelRendererTurbo(this, 97, 297, this.textureX, this.textureY);
/* 1260 */     this.defaultGripModel[8] = new ModelRendererTurbo(this, 129, 297, this.textureX, this.textureY);
/*      */     
/* 1262 */     this.defaultGripModel[0].addShapeBox(60.0F, -19.0F, 9.5F, 17, 6, 14, 0.0F, 0.0F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1263 */     this.defaultGripModel[0].setRotationPoint(64.9F, -6.75F, -17.0F);
/*      */     
/* 1265 */     this.defaultGripModel[1].addShapeBox(60.0F, -19.0F, 9.5F, 2, 2, 14, 0.0F, 0.25F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, -1.5F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1266 */     this.defaultGripModel[1].setRotationPoint(71.9F, -1.5F, -17.0F);
/*      */     
/* 1268 */     this.defaultGripModel[2].addShapeBox(60.0F, -19.0F, 9.5F, 1, 3, 14, 0.0F, -0.5F, -1.5F, 0.0F, 3.75F, -1.5F, 0.0F, 3.75F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -1.25F, 0.75F, -0.5F, 3.75F, 0.75F, -0.5F, 3.75F, 0.75F, -0.5F, -1.25F, 0.75F, -0.5F);
/* 1269 */     this.defaultGripModel[2].setRotationPoint(72.9F, -0.5F, -17.0F);
/*      */     
/* 1271 */     this.defaultGripModel[3].addShapeBox(60.0F, -19.0F, 9.5F, 4, 2, 14, 0.0F, 3.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 3.75F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F);
/* 1272 */     this.defaultGripModel[3].setRotationPoint(81.4F, -1.5F, -17.0F);
/*      */     
/* 1274 */     this.defaultGripModel[4].addShapeBox(60.0F, -19.0F, 9.5F, 4, 3, 14, 0.0F, 3.75F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, 3.75F, -1.25F, 0.0F, 3.75F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, 3.75F, 0.5F, -0.5F);
/* 1275 */     this.defaultGripModel[4].setRotationPoint(81.4F, -0.25F, -17.0F);
/*      */     
/* 1277 */     this.defaultGripModel[5].addShapeBox(60.0F, -19.0F, 9.5F, 3, 5, 14, 0.0F, 3.75F, -1.25F, -0.5F, -1.0F, -1.25F, -0.5F, -1.0F, -1.25F, -0.5F, 3.75F, -1.25F, -0.5F, 3.75F, 0.5F, -1.0F, -3.25F, 0.5F, -1.0F, -3.25F, 0.5F, -1.0F, 3.75F, 0.5F, -1.0F);
/* 1278 */     this.defaultGripModel[5].setRotationPoint(81.4F, 2.0F, -17.0F);
/*      */     
/* 1280 */     this.defaultGripModel[6].addShapeBox(60.0F, -19.0F, 9.5F, 1, 6, 14, 0.0F, -1.25F, -1.75F, -0.5F, 3.75F, -1.75F, -0.5F, 3.75F, -1.75F, -0.5F, -1.25F, -1.75F, -0.5F, -2.0F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, 3.75F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F);
/* 1281 */     this.defaultGripModel[6].setRotationPoint(72.9F, 1.5F, -17.0F);
/*      */     
/* 1283 */     this.defaultGripModel[7].addShapeBox(60.0F, -19.0F, 9.5F, 1, 6, 14, 0.0F, -2.0F, -1.5F, -1.0F, 3.75F, -1.5F, -1.0F, 3.75F, -1.5F, -1.0F, -2.0F, -1.5F, -1.0F, -2.0F, 0.0F, -2.25F, 3.75F, 1.5F, -2.25F, 3.75F, 1.5F, -2.25F, -2.0F, 0.0F, -2.25F);
/* 1284 */     this.defaultGripModel[7].setRotationPoint(72.9F, 6.0F, -17.0F);
/*      */     
/* 1286 */     this.defaultGripModel[8].addShapeBox(60.0F, -19.0F, 9.5F, 1, 8, 14, 0.0F, 4.25F, -1.5F, -1.0F, -1.75F, -1.5F, -1.0F, -1.75F, -1.5F, -1.0F, 4.25F, -1.5F, -1.0F, 4.25F, -0.5F, -2.25F, -4.5F, -0.5F, -2.25F, -4.5F, -0.5F, -2.25F, 4.25F, -0.5F, -2.25F);
/* 1287 */     this.defaultGripModel[8].setRotationPoint(81.9F, 6.0F, -17.0F);
/*      */     
/*      */ 
/* 1290 */     this.ammoModel = new ModelRendererTurbo[4];
/* 1291 */     this.ammoModel[0] = new ModelRendererTurbo(this, 81, 401, this.textureX, this.textureY);
/* 1292 */     this.ammoModel[1] = new ModelRendererTurbo(this, 153, 409, this.textureX, this.textureY);
/* 1293 */     this.ammoModel[2] = new ModelRendererTurbo(this, 297, 417, this.textureX, this.textureY);
/* 1294 */     this.ammoModel[3] = new ModelRendererTurbo(this, 81, 425, this.textureX, this.textureY);
/*      */     
/* 1296 */     this.ammoModel[0].addShapeBox(60.0F, -19.0F, 9.5F, 20, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1297 */     this.ammoModel[0].setRotationPoint(-21.5F, 11.0F, -16.5F);
/*      */     
/* 1299 */     this.ammoModel[1].addShapeBox(60.0F, -19.0F, 9.5F, 20, 11, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1300 */     this.ammoModel[1].setRotationPoint(-20.0F, 21.0F, -16.5F);
/*      */     
/* 1302 */     this.ammoModel[2].addShapeBox(60.0F, -19.0F, 9.5F, 20, 18, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F);
/* 1303 */     this.ammoModel[2].setRotationPoint(-17.5F, 32.0F, -16.5F);
/*      */     
/* 1305 */     this.ammoModel[3].addShapeBox(60.0F, -19.0F, 9.5F, 20, 12, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -10.5F, 5.5F, 0.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -10.5F, 5.5F, 0.0F);
/* 1306 */     this.ammoModel[3].setRotationPoint(-10.0F, 50.0F, -16.5F);
/*      */     
/*      */ 
/* 1309 */     this.slideModel = new ModelRendererTurbo[4];
/* 1310 */     this.slideModel[0] = new ModelRendererTurbo(this, 329, 313, this.textureX, this.textureY);
/* 1311 */     this.slideModel[1] = new ModelRendererTurbo(this, 57, 313, this.textureX, this.textureY);
/* 1312 */     this.slideModel[2] = new ModelRendererTurbo(this, 457, 217, this.textureX, this.textureY);
/* 1313 */     this.slideModel[3] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/*      */     
/* 1315 */     this.slideModel[0].addShapeBox(60.0F, -19.0F, 9.5F, 23, 12, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1316 */     this.slideModel[0].setRotationPoint(-20.0F, -32.0F, -15.5F);
/*      */     
/* 1318 */     this.slideModel[1].addShapeBox(60.0F, -19.0F, 9.5F, 12, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1319 */     this.slideModel[1].setRotationPoint(-20.0F, -28.0F, -18.0F);
/*      */     
/* 1321 */     this.slideModel[2].addShapeBox(60.0F, -19.0F, 9.5F, 6, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1322 */     this.slideModel[2].setRotationPoint(-8.0F, -27.0F, -18.0F);
/*      */     
/* 1324 */     this.slideModel[3].addShapeBox(60.0F, -19.0F, 9.5F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1325 */     this.slideModel[3].setRotationPoint(-8.0F, -23.0F, -18.0F);
/*      */     
/* 1327 */     this.scopeAttachPoint = new Vector3f(0.3125F, 5.3125F, 0.0F);
/* 1328 */     this.gripAttachPoint = new Vector3f(7.0F, 3.1875F, 0.0F);
/*      */     
/* 1330 */     translateAll(2.0F, -30.0F, 0.0F);
/* 1331 */     this.thirdPersonOffset = new Vector3f(-0.02F, -0.1F, 0.0F);
/*      */     
/* 1333 */     this.gunSlideDistance = 0.0F;
/* 1334 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 1336 */     this.tiltGun = 8.0F;
/* 1337 */     this.rotateGunVertical = 7.0F;
/* 1338 */     this.translateGun = new Vector3f(0.15F, 0.05F, 0.0F);
/*      */     
/* 1340 */     this.rotateClipVertical = 7.0F;
/* 1341 */     this.translateClip = new Vector3f(0.0F, -75.0F, 0.0F);
/*      */     
/*      */ 
/* 1344 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelevo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */