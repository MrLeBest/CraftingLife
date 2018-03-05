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
/*      */ public class Modellebman
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modellebman()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['â'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 41, 81, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 81, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 417, 89, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 177, 97, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 201, 97, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 65, 97, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 17, 105, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 41, 105, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 145, 105, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 33, 113, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 217, 113, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 41, 121, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 281, 121, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 481, 113, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 409, 113, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 425, 121, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 465, 121, this.textureX, this.textureY);
/*      */     
/*  249 */     this.gunModel[0].addShapeBox(3.0F, -13.0F, -4.5F, 50, 3, 7, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  250 */     this.gunModel[0].setRotationPoint(-13.0F, -19.0F, 1.0F);
/*      */     
/*  252 */     this.gunModel[1].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  253 */     this.gunModel[1].setRotationPoint(-14.5F, -22.5F, 3.5F);
/*      */     
/*  255 */     this.gunModel[2].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  256 */     this.gunModel[2].setRotationPoint(-13.5F, -24.0F, 3.5F);
/*      */     
/*  258 */     this.gunModel[3].addBox(3.0F, -13.0F, -4.5F, 47, 2, 1, 0.0F);
/*  259 */     this.gunModel[3].setRotationPoint(-10.0F, -19.5F, 5.5F);
/*      */     
/*  261 */     this.gunModel[4].addShapeBox(3.0F, -13.0F, -4.5F, 27, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  262 */     this.gunModel[4].setRotationPoint(22.0F, -24.2F, 2.5F);
/*      */     
/*  264 */     this.gunModel[5].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  265 */     this.gunModel[5].setRotationPoint(28.0F, -16.0F, 6.75F);
/*      */     
/*  267 */     this.gunModel[6].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F);
/*  268 */     this.gunModel[6].setRotationPoint(28.0F, -14.75F, 4.5F);
/*      */     
/*  270 */     this.gunModel[7].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  271 */     this.gunModel[7].setRotationPoint(28.0F, -14.75F, 3.0F);
/*      */     
/*  273 */     this.gunModel[8].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F);
/*  274 */     this.gunModel[8].setRotationPoint(28.0F, -16.0F, 1.25F);
/*      */     
/*  276 */     this.gunModel[9].addShapeBox(3.0F, -13.0F, -4.5F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  277 */     this.gunModel[9].setRotationPoint(29.0F, -17.75F, 3.0F);
/*      */     
/*  279 */     this.gunModel[10].addShapeBox(3.0F, -13.0F, -4.5F, 36, 2, 7, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  280 */     this.gunModel[10].setRotationPoint(-13.0F, -16.0F, 1.0F);
/*      */     
/*  282 */     this.gunModel[11].addShapeBox(3.0F, -13.0F, -4.5F, 8, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  283 */     this.gunModel[11].setRotationPoint(11.0F, -24.5F, 1.5F);
/*      */     
/*  285 */     this.gunModel[12].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  286 */     this.gunModel[12].setRotationPoint(21.0F, -14.0F, 2.5F);
/*      */     
/*  288 */     this.gunModel[13].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F);
/*  289 */     this.gunModel[13].setRotationPoint(19.0F, -13.0F, 2.5F);
/*      */     
/*  291 */     this.gunModel[14].addShapeBox(3.0F, -13.0F, -4.5F, 1, 4, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  292 */     this.gunModel[14].setRotationPoint(20.0F, -14.0F, 2.5F);
/*      */     
/*  294 */     this.gunModel[15].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  295 */     this.gunModel[15].setRotationPoint(9.0F, -5.0F, 2.5F);
/*      */     
/*  297 */     this.gunModel[16].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  298 */     this.gunModel[16].setRotationPoint(-13.5F, -21.0F, 3.5F);
/*      */     
/*  300 */     this.gunModel[17].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  301 */     this.gunModel[17].setRotationPoint(9.0F, -6.0F, 2.5F);
/*      */     
/*  303 */     this.gunModel[18].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  304 */     this.gunModel[18].setRotationPoint(17.0F, -14.0F, 2.5F);
/*      */     
/*  306 */     this.gunModel[19].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F);
/*  307 */     this.gunModel[19].setRotationPoint(20.0F, -10.5F, 2.5F);
/*      */     
/*  309 */     this.gunModel[20].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/*  310 */     this.gunModel[20].setRotationPoint(19.75F, -9.0F, 2.5F);
/*      */     
/*  312 */     this.gunModel[21].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 2.25F, 1.0F, -0.25F, -2.0F, 1.0F, -0.25F, -2.0F, 1.0F, -0.25F, 2.25F, 1.0F, -0.25F);
/*  313 */     this.gunModel[21].setRotationPoint(19.25F, -7.0F, 2.5F);
/*      */     
/*  315 */     this.gunModel[22].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  316 */     this.gunModel[22].setRotationPoint(23.0F, -16.0F, 6.75F);
/*      */     
/*  318 */     this.gunModel[23].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  319 */     this.gunModel[23].setRotationPoint(23.0F, -14.75F, 4.5F);
/*      */     
/*  321 */     this.gunModel[24].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  322 */     this.gunModel[24].setRotationPoint(23.0F, -14.75F, 3.0F);
/*      */     
/*  324 */     this.gunModel[25].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 1.0F, 0.75F);
/*  325 */     this.gunModel[25].setRotationPoint(23.0F, -16.0F, 1.25F);
/*      */     
/*  327 */     this.gunModel[26].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  328 */     this.gunModel[26].setRotationPoint(27.0F, -17.75F, 3.0F);
/*      */     
/*  330 */     this.gunModel[27].addShapeBox(3.0F, -13.0F, -4.5F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  331 */     this.gunModel[27].setRotationPoint(23.0F, -16.75F, 3.0F);
/*      */     
/*  333 */     this.gunModel[28].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  334 */     this.gunModel[28].setRotationPoint(-14.5F, -23.5F, 3.5F);
/*      */     
/*  336 */     this.gunModel[29].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  337 */     this.gunModel[29].setRotationPoint(-15.5F, -24.5F, 3.5F);
/*      */     
/*  339 */     this.gunModel[30].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  340 */     this.gunModel[30].setRotationPoint(-14.5F, -21.5F, 3.5F);
/*      */     
/*  342 */     this.gunModel[31].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  343 */     this.gunModel[31].setRotationPoint(-16.5F, -22.5F, 3.5F);
/*      */     
/*  345 */     this.gunModel[32].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  346 */     this.gunModel[32].setRotationPoint(-16.5F, -24.5F, 3.5F);
/*      */     
/*  348 */     this.gunModel[33].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  349 */     this.gunModel[33].setRotationPoint(-11.5F, -23.5F, 3.5F);
/*      */     
/*  351 */     this.gunModel[34].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  352 */     this.gunModel[34].setRotationPoint(-9.5F, -22.2F, 5.0F);
/*      */     
/*  354 */     this.gunModel[35].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  355 */     this.gunModel[35].setRotationPoint(-14.0F, -19.0F, 1.0F);
/*      */     
/*  357 */     this.gunModel[36].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 3, 0.0F, -0.25F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/*  358 */     this.gunModel[36].setRotationPoint(-16.0F, -18.0F, 1.0F);
/*      */     
/*  360 */     this.gunModel[37].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, -0.5F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  361 */     this.gunModel[37].setRotationPoint(-16.75F, -17.0F, 1.0F);
/*      */     
/*  363 */     this.gunModel[38].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 3, 0.0F, -1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  364 */     this.gunModel[38].setRotationPoint(-18.0F, -16.0F, 1.0F);
/*      */     
/*  366 */     this.gunModel[39].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 3, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  367 */     this.gunModel[39].setRotationPoint(-18.0F, -15.0F, 1.0F);
/*      */     
/*  369 */     this.gunModel[40].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  370 */     this.gunModel[40].setRotationPoint(-14.0F, -18.0F, 1.0F);
/*      */     
/*  372 */     this.gunModel[41].addShapeBox(3.0F, -13.0F, -4.5F, 5, 2, 7, 0.0F, -0.75F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -1.5F, -0.25F);
/*  373 */     this.gunModel[41].setRotationPoint(-18.0F, -14.5F, 1.0F);
/*      */     
/*  375 */     this.gunModel[42].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F);
/*  376 */     this.gunModel[42].setRotationPoint(-13.0F, -13.0F, 2.0F);
/*      */     
/*  378 */     this.gunModel[43].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 5, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  379 */     this.gunModel[43].setRotationPoint(-11.0F, -12.5F, 2.0F);
/*      */     
/*  381 */     this.gunModel[44].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  382 */     this.gunModel[44].setRotationPoint(-9.0F, -9.0F, 2.0F);
/*      */     
/*  384 */     this.gunModel[45].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 7, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  385 */     this.gunModel[45].setRotationPoint(-13.0F, -13.5F, 1.0F);
/*      */     
/*  387 */     this.gunModel[46].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  388 */     this.gunModel[46].setRotationPoint(-9.0F, -13.0F, 2.0F);
/*      */     
/*  390 */     this.gunModel[47].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  391 */     this.gunModel[47].setRotationPoint(5.0F, -12.5F, 2.0F);
/*      */     
/*  393 */     this.gunModel[48].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, 2.5F, 0.5F, -0.25F, 2.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  394 */     this.gunModel[48].setRotationPoint(5.0F, -13.5F, 2.0F);
/*      */     
/*  396 */     this.gunModel[49].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  397 */     this.gunModel[49].setRotationPoint(5.0F, -11.0F, 2.0F);
/*      */     
/*  399 */     this.gunModel[50].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 5, 0.0F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  400 */     this.gunModel[50].setRotationPoint(5.0F, -7.5F, 2.0F);
/*      */     
/*  402 */     this.gunModel[51].addShapeBox(3.0F, -13.0F, -4.5F, 3, 2, 5, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  403 */     this.gunModel[51].setRotationPoint(5.0F, -10.0F, 2.0F);
/*      */     
/*  405 */     this.gunModel[52].addShapeBox(3.0F, -13.0F, -4.5F, 12, 9, 7, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  406 */     this.gunModel[52].setRotationPoint(-7.0F, -14.0F, 1.0F);
/*      */     
/*  408 */     this.gunModel[53].addShapeBox(3.0F, -13.0F, -4.5F, 4, 2, 5, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  409 */     this.gunModel[53].setRotationPoint(5.0F, -7.0F, 2.0F);
/*      */     
/*  411 */     this.gunModel[54].addShapeBox(3.0F, -13.0F, -4.5F, 2, 10, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  412 */     this.gunModel[54].setRotationPoint(5.0F, -15.0F, 6.0F);
/*      */     
/*  414 */     this.gunModel[55].addShapeBox(3.0F, -13.0F, -4.5F, 2, 10, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  415 */     this.gunModel[55].setRotationPoint(5.0F, -15.0F, 0.5F);
/*      */     
/*  417 */     this.gunModel[56].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/*  418 */     this.gunModel[56].setRotationPoint(7.0F, -7.0F, 6.0F);
/*      */     
/*  420 */     this.gunModel[57].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, -2.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  421 */     this.gunModel[57].setRotationPoint(7.0F, -7.5F, 7.0F);
/*      */     
/*  423 */     this.gunModel[58].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  424 */     this.gunModel[58].setRotationPoint(7.0F, -10.0F, 6.0F);
/*      */     
/*  426 */     this.gunModel[59].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  427 */     this.gunModel[59].setRotationPoint(7.0F, -12.5F, 6.0F);
/*      */     
/*  429 */     this.gunModel[60].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.75F, 2.0F, -1.0F, -0.75F, 0.25F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  430 */     this.gunModel[60].setRotationPoint(7.0F, -14.0F, 6.0F);
/*      */     
/*  432 */     this.gunModel[61].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, -1.0F, -0.75F, 4.5F, -1.0F, -0.75F, 2.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 2.0F, 1.0F, -0.75F, 0.25F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  433 */     this.gunModel[61].setRotationPoint(7.0F, -15.0F, 6.0F);
/*      */     
/*  435 */     this.gunModel[62].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F);
/*  436 */     this.gunModel[62].setRotationPoint(7.0F, -7.0F, 1.0F);
/*      */     
/*  438 */     this.gunModel[63].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.5F, -0.25F, -2.0F, 0.5F, -0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/*  439 */     this.gunModel[63].setRotationPoint(7.0F, -7.5F, 1.0F);
/*      */     
/*  441 */     this.gunModel[64].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  442 */     this.gunModel[64].setRotationPoint(7.0F, -10.0F, 1.0F);
/*      */     
/*  444 */     this.gunModel[65].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  445 */     this.gunModel[65].setRotationPoint(7.0F, -12.5F, 1.0F);
/*      */     
/*  447 */     this.gunModel[66].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F, 2.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F);
/*  448 */     this.gunModel[66].setRotationPoint(7.0F, -14.0F, 1.0F);
/*      */     
/*  450 */     this.gunModel[67].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, 0.0F, -1.0F, -0.25F, 2.0F, -1.0F, -0.25F, 4.5F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 1.0F, -0.25F, 0.25F, 1.0F, -0.25F, 2.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F);
/*  451 */     this.gunModel[67].setRotationPoint(7.0F, -15.0F, 1.0F);
/*      */     
/*  453 */     this.gunModel[68].addShapeBox(3.0F, -13.0F, -4.5F, 3, 2, 3, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  454 */     this.gunModel[68].setRotationPoint(7.5F, -10.5F, 3.0F);
/*      */     
/*  456 */     this.gunModel[69].addShapeBox(3.0F, -13.0F, -4.5F, 3, 3, 3, 0.0F, 0.0F, -0.5F, -0.25F, 1.5F, -0.5F, -0.25F, 1.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  457 */     this.gunModel[69].setRotationPoint(7.5F, -13.25F, 3.0F);
/*      */     
/*  459 */     this.gunModel[70].addShapeBox(3.0F, -13.0F, -4.5F, 3, 3, 3, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  460 */     this.gunModel[70].setRotationPoint(7.5F, -9.0F, 3.0F);
/*      */     
/*  462 */     this.gunModel[71].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 3, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  463 */     this.gunModel[71].setRotationPoint(7.5F, -6.5F, 3.0F);
/*      */     
/*  465 */     this.gunModel[72].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 3, 0.0F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  466 */     this.gunModel[72].setRotationPoint(7.5F, -13.75F, 3.0F);
/*      */     
/*  468 */     this.gunModel[73].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  469 */     this.gunModel[73].setRotationPoint(-14.0F, -19.0F, 5.0F);
/*      */     
/*  471 */     this.gunModel[74].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 3, 0.0F, -0.5F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  472 */     this.gunModel[74].setRotationPoint(-16.0F, -18.0F, 5.0F);
/*      */     
/*  474 */     this.gunModel[75].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 3, 0.0F, -0.25F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/*  475 */     this.gunModel[75].setRotationPoint(-16.5F, -17.0F, 5.0F);
/*      */     
/*  477 */     this.gunModel[76].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 3, 0.0F, -1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  478 */     this.gunModel[76].setRotationPoint(-18.0F, -16.0F, 5.0F);
/*      */     
/*  480 */     this.gunModel[77].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 4, 0.0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  481 */     this.gunModel[77].setRotationPoint(-18.0F, -15.0F, 4.0F);
/*      */     
/*  483 */     this.gunModel[78].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  484 */     this.gunModel[78].setRotationPoint(-14.0F, -18.0F, 5.0F);
/*      */     
/*  486 */     this.gunModel[79].addShapeBox(3.0F, -13.0F, -4.5F, 13, 2, 5, 0.0F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/*  487 */     this.gunModel[79].setRotationPoint(-8.5F, -5.5F, 2.0F);
/*      */     
/*  489 */     this.gunModel[80].addShapeBox(3.0F, -13.0F, -4.5F, 12, 3, 5, 0.0F, -0.75F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  490 */     this.gunModel[80].setRotationPoint(-9.0F, -4.5F, 2.0F);
/*      */     
/*  492 */     this.gunModel[81].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  493 */     this.gunModel[81].setRotationPoint(7.0F, -6.0F, 6.0F);
/*      */     
/*  495 */     this.gunModel[82].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 6, 0.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, 1.0F, -0.25F);
/*  496 */     this.gunModel[82].setRotationPoint(7.0F, -6.0F, 1.0F);
/*      */     
/*  498 */     this.gunModel[83].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -2.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  499 */     this.gunModel[83].setRotationPoint(4.0F, -4.0F, 6.0F);
/*      */     
/*  501 */     this.gunModel[84].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 6, 0.0F, 0.0F, -1.0F, -1.25F, 0.25F, -1.0F, -1.25F, 0.25F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -1.25F, -1.75F, 0.5F, -1.25F, -1.75F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  502 */     this.gunModel[84].setRotationPoint(4.0F, -4.5F, 1.0F);
/*      */     
/*  504 */     this.gunModel[85].addShapeBox(3.0F, -13.0F, -4.5F, 5, 15, 2, 0.0F, 0.5F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.75F, -3.5F, 0.0F, -0.75F, -4.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/*  505 */     this.gunModel[85].setRotationPoint(0.0F, 0.0F, 6.0F);
/*      */     
/*  507 */     this.gunModel[86].addShapeBox(3.0F, -13.0F, -4.5F, 6, 15, 6, 0.0F, -0.5F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -1.25F, -3.5F, 0.0F, -1.25F, -3.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  508 */     this.gunModel[86].setRotationPoint(-1.0F, 0.0F, 1.0F);
/*      */     
/*  510 */     this.gunModel[87].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  511 */     this.gunModel[87].setRotationPoint(4.0F, -4.5F, 1.0F);
/*      */     
/*  513 */     this.gunModel[88].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 7, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F);
/*  514 */     this.gunModel[88].setRotationPoint(2.5F, -4.5F, 1.0F);
/*      */     
/*  516 */     this.gunModel[89].addShapeBox(3.0F, -13.0F, -4.5F, 4, 4, 7, 0.0F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  517 */     this.gunModel[89].setRotationPoint(-0.5F, -4.5F, 1.0F);
/*      */     
/*  519 */     this.gunModel[90].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, -1.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -1.25F, -0.5F, 0.5F, -0.25F);
/*  520 */     this.gunModel[90].setRotationPoint(6.0F, -4.5F, 7.0F);
/*      */     
/*  522 */     this.gunModel[91].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  523 */     this.gunModel[91].setRotationPoint(6.0F, -4.5F, 1.0F);
/*      */     
/*  525 */     this.gunModel[92].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  526 */     this.gunModel[92].setRotationPoint(6.5F, -4.5F, 1.0F);
/*      */     
/*  528 */     this.gunModel[93].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  529 */     this.gunModel[93].setRotationPoint(6.5F, -4.0F, 1.0F);
/*      */     
/*  531 */     this.gunModel[94].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 2, 0.0F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -1.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  532 */     this.gunModel[94].setRotationPoint(4.0F, -4.0F, 1.0F);
/*      */     
/*  534 */     this.gunModel[95].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.0F, 0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F);
/*  535 */     this.gunModel[95].setRotationPoint(6.0F, -4.5F, 1.0F);
/*      */     
/*  537 */     this.gunModel[96].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, 1.0F, -0.75F);
/*  538 */     this.gunModel[96].setRotationPoint(7.0F, -6.0F, 1.0F);
/*      */     
/*  540 */     this.gunModel[97].addShapeBox(3.0F, -13.0F, -4.5F, 5, 15, 2, 0.0F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, -4.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F);
/*  541 */     this.gunModel[97].setRotationPoint(0.0F, 0.0F, 1.0F);
/*      */     
/*  543 */     this.gunModel[98].addShapeBox(3.0F, -13.0F, -4.5F, 7, 20, 7, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  544 */     this.gunModel[98].setRotationPoint(-7.0F, -5.5F, 1.0F);
/*      */     
/*  546 */     this.gunModel[99].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  547 */     this.gunModel[99].setRotationPoint(4.0F, -5.5F, 1.0F);
/*      */     
/*  549 */     this.gunModel[100].addShapeBox(3.0F, -13.0F, -4.5F, 2, 17, 1, 0.0F, -1.0F, -0.5F, -1.25F, 1.0F, -0.5F, -0.25F, 1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 4.0F, 0.0F, -1.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 0.25F, 4.0F, 0.0F, 0.25F);
/*  550 */     this.gunModel[100].setRotationPoint(-10.0F, -2.0F, 1.0F);
/*      */     
/*  552 */     this.gunModel[101].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  553 */     this.gunModel[101].setRotationPoint(-9.0F, -4.5F, 1.0F);
/*      */     
/*  555 */     this.gunModel[102].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -1.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -1.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F);
/*  556 */     this.gunModel[102].setRotationPoint(-8.5F, -5.5F, 1.0F);
/*      */     
/*  558 */     this.gunModel[103].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.75F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/*  559 */     this.gunModel[103].setRotationPoint(-9.0F, -9.0F, 1.0F);
/*      */     
/*  561 */     this.gunModel[104].addShapeBox(3.0F, -13.0F, -4.5F, 2, 17, 1, 0.0F, -1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -1.25F, 4.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.25F, 4.0F, 0.0F, -1.25F);
/*  562 */     this.gunModel[104].setRotationPoint(-10.0F, -2.0F, 7.0F);
/*      */     
/*  564 */     this.gunModel[105].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, -0.75F, -0.5F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F);
/*  565 */     this.gunModel[105].setRotationPoint(-9.0F, -4.5F, 7.0F);
/*      */     
/*  567 */     this.gunModel[106].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F, -0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -1.25F);
/*  568 */     this.gunModel[106].setRotationPoint(-8.5F, -5.5F, 7.0F);
/*      */     
/*  570 */     this.gunModel[107].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 2.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F);
/*  571 */     this.gunModel[107].setRotationPoint(-9.0F, -11.5F, 1.0F);
/*      */     
/*  573 */     this.gunModel[108].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 4.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F);
/*  574 */     this.gunModel[108].setRotationPoint(-9.0F, -13.0F, 1.0F);
/*      */     
/*  576 */     this.gunModel[109].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 2.0F, -0.5F, -1.25F, -1.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F);
/*  577 */     this.gunModel[109].setRotationPoint(-9.0F, -11.5F, 7.0F);
/*      */     
/*  579 */     this.gunModel[110].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 4.0F, -0.5F, -1.25F, -1.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 2.0F, 0.0F, -1.25F);
/*  580 */     this.gunModel[110].setRotationPoint(-9.0F, -13.0F, 7.0F);
/*      */     
/*  582 */     this.gunModel[111].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -1.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -1.25F);
/*  583 */     this.gunModel[111].setRotationPoint(-9.0F, -9.0F, 7.0F);
/*      */     
/*  585 */     this.gunModel[112].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 4, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/*  586 */     this.gunModel[112].setRotationPoint(-10.5F, -9.0F, 2.5F);
/*      */     
/*  588 */     this.gunModel[113].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  589 */     this.gunModel[113].setRotationPoint(-12.5F, -12.5F, 2.5F);
/*      */     
/*  591 */     this.gunModel[114].addShapeBox(3.0F, -13.0F, -4.5F, 3, 4, 4, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  592 */     this.gunModel[114].setRotationPoint(-10.5F, -12.5F, 2.5F);
/*      */     
/*  594 */     this.gunModel[115].addShapeBox(3.0F, -13.0F, -4.5F, 13, 2, 4, 0.0F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/*  595 */     this.gunModel[115].setRotationPoint(-10.0F, -5.5F, 2.5F);
/*      */     
/*  597 */     this.gunModel[116].addShapeBox(3.0F, -13.0F, -4.5F, 12, 3, 4, 0.0F, -0.75F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  598 */     this.gunModel[116].setRotationPoint(-10.5F, -4.5F, 2.5F);
/*      */     
/*  600 */     this.gunModel[117].addShapeBox(3.0F, -13.0F, -4.5F, 12, 5, 4, 0.0F, -1.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F);
/*  601 */     this.gunModel[117].setRotationPoint(-11.5F, -2.0F, 2.5F);
/*      */     
/*  603 */     this.gunModel[118].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  604 */     this.gunModel[118].setRotationPoint(-9.5F, -4.5F, 2.0F);
/*      */     
/*  606 */     this.gunModel[119].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.75F, -1.25F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  607 */     this.gunModel[119].setRotationPoint(-9.0F, -5.5F, 2.0F);
/*      */     
/*  609 */     this.gunModel[120].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/*  610 */     this.gunModel[120].setRotationPoint(-10.0F, -9.0F, 2.0F);
/*      */     
/*  612 */     this.gunModel[121].addShapeBox(3.0F, -13.0F, -4.5F, 1, 17, 1, 0.0F, -1.5F, -0.5F, -1.25F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, 4.0F, 0.0F, -1.25F, -4.0F, 0.0F, -0.75F, -4.0F, 0.0F, 0.25F, 4.0F, 0.0F, 0.25F);
/*  613 */     this.gunModel[121].setRotationPoint(-11.0F, -2.0F, 1.5F);
/*      */     
/*  615 */     this.gunModel[122].addShapeBox(3.0F, -13.0F, -4.5F, 1, 17, 4, 0.0F, -1.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.5F, -0.5F, -0.5F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -0.5F);
/*  616 */     this.gunModel[122].setRotationPoint(-11.0F, -2.0F, 2.75F);
/*      */     
/*  618 */     this.gunModel[123].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  619 */     this.gunModel[123].setRotationPoint(-12.0F, -11.5F, 2.0F);
/*      */     
/*  621 */     this.gunModel[124].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  622 */     this.gunModel[124].setRotationPoint(-14.0F, -13.0F, 2.0F);
/*      */     
/*  624 */     this.gunModel[125].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F);
/*  625 */     this.gunModel[125].setRotationPoint(-9.5F, -4.5F, 6.0F);
/*      */     
/*  627 */     this.gunModel[126].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F, 0.0F, 0.5F, -0.75F);
/*  628 */     this.gunModel[126].setRotationPoint(-9.0F, -5.5F, 6.0F);
/*      */     
/*  630 */     this.gunModel[127].addShapeBox(3.0F, -13.0F, -4.5F, 2, 4, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F);
/*  631 */     this.gunModel[127].setRotationPoint(-10.0F, -9.0F, 6.0F);
/*      */     
/*  633 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, -2.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.75F);
/*  634 */     this.gunModel[''].setRotationPoint(-12.0F, -11.5F, 6.0F);
/*      */     
/*  636 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, -2.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.75F);
/*  637 */     this.gunModel[''].setRotationPoint(-14.0F, -13.0F, 6.0F);
/*      */     
/*  639 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 2, 3, 0.0F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F);
/*  640 */     this.gunModel[''].setRotationPoint(-14.0F, -13.0F, 3.0F);
/*      */     
/*  642 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 0.25F);
/*  643 */     this.gunModel[''].setRotationPoint(-14.0F, -13.0F, 3.0F);
/*      */     
/*  645 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 15, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  646 */     this.gunModel[''].setRotationPoint(-9.0F, -14.5F, 7.5F);
/*      */     
/*  648 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -8.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  649 */     this.gunModel[''].setRotationPoint(1.0F, -14.5F, 7.5F);
/*      */     
/*  651 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -6.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F);
/*  652 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 7.5F);
/*      */     
/*  654 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -0.25F);
/*  655 */     this.gunModel[''].setRotationPoint(-5.0F, 11.5F, 7.5F);
/*      */     
/*  657 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.5F, -0.25F);
/*  658 */     this.gunModel[''].setRotationPoint(-8.0F, 11.5F, 7.5F);
/*      */     
/*  660 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.5F, 0.75F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  661 */     this.gunModel[''].setRotationPoint(-11.0F, 11.5F, 7.5F);
/*      */     
/*  663 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 1.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  664 */     this.gunModel[''].setRotationPoint(2.0F, -15.5F, 7.5F);
/*      */     
/*  666 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  667 */     this.gunModel[''].setRotationPoint(0.0F, -15.5F, 7.5F);
/*      */     
/*  669 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  670 */     this.gunModel[''].setRotationPoint(-3.0F, -15.5F, 7.5F);
/*      */     
/*  672 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 1.0F, -1.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  673 */     this.gunModel[''].setRotationPoint(-4.0F, -15.5F, 7.5F);
/*      */     
/*  675 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 15, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  676 */     this.gunModel[''].setRotationPoint(-9.0F, -14.5F, 0.5F);
/*      */     
/*  678 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -8.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  679 */     this.gunModel[''].setRotationPoint(1.0F, -14.5F, 0.5F);
/*      */     
/*  681 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -6.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 1.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  682 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 0.5F);
/*      */     
/*  684 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -1.5F, -0.25F, 1.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  685 */     this.gunModel[''].setRotationPoint(2.0F, -15.5F, 0.5F);
/*      */     
/*  687 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  688 */     this.gunModel[''].setRotationPoint(0.0F, -15.5F, 0.5F);
/*      */     
/*  690 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  691 */     this.gunModel[''].setRotationPoint(-3.0F, -15.5F, 0.5F);
/*      */     
/*  693 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.0F, -0.25F, 1.0F, -1.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  694 */     this.gunModel[''].setRotationPoint(-4.0F, -15.5F, 0.5F);
/*      */     
/*  696 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/*  697 */     this.gunModel[''].setRotationPoint(-5.0F, 11.5F, 0.5F);
/*      */     
/*  699 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.75F, -0.25F);
/*  700 */     this.gunModel[''].setRotationPoint(-8.0F, 11.5F, 0.5F);
/*      */     
/*  702 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.75F, -0.25F, 1.0F, -0.5F, -0.25F);
/*  703 */     this.gunModel[''].setRotationPoint(-11.0F, 11.5F, 0.5F);
/*      */     
/*  705 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  706 */     this.gunModel[''].setRotationPoint(-8.0F, -18.5F, 8.0F);
/*  707 */     this.gunModel[''].rotateAngleZ = -0.6457718F;
/*      */     
/*  709 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  710 */     this.gunModel[''].setRotationPoint(13.15F, -25.05F, 8.0F);
/*  711 */     this.gunModel[''].rotateAngleZ = -3.7873645F;
/*      */     
/*  713 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  714 */     this.gunModel[''].setRotationPoint(-8.0F, -18.5F, 0.5F);
/*  715 */     this.gunModel[''].rotateAngleZ = -0.6457718F;
/*      */     
/*  717 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  718 */     this.gunModel[''].setRotationPoint(13.15F, -25.05F, 0.5F);
/*  719 */     this.gunModel[''].rotateAngleZ = -3.7873645F;
/*      */     
/*  721 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  722 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 7.0F);
/*      */     
/*  724 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 6, 26, 1, 0.0F, -5.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -5.0F, -0.5F, -0.25F, 2.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, -7.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F);
/*  725 */     this.gunModel[''].setRotationPoint(-10.0F, -14.5F, 1.0F);
/*      */     
/*  727 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 2, 0.0F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F);
/*  728 */     this.gunModel[''].setRotationPoint(6.5F, -7.0F, 6.35F);
/*      */     
/*  730 */     this.gunModel[''].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 2, 0.0F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -1.25F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -1.25F, -0.25F);
/*  731 */     this.gunModel[''].setRotationPoint(5.5F, -18.5F, 6.35F);
/*      */     
/*  733 */     this.gunModel[' '].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.75F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.25F, 0.75F, -1.25F, -0.25F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F);
/*  734 */     this.gunModel[' '].setRotationPoint(13.5F, -17.75F, 6.35F);
/*      */     
/*  736 */     this.gunModel['¡'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.25F, -1.5F, -0.75F, -0.5F, -1.5F, -0.75F, -0.5F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/*  737 */     this.gunModel['¡'].setRotationPoint(13.0F, -17.25F, 6.35F);
/*      */     
/*  739 */     this.gunModel['¢'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.75F, -1.25F, -0.75F, -1.0F, -1.25F, -0.75F, -1.0F, -1.25F, -0.25F, 0.75F, -1.25F, -0.25F, 0.75F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F);
/*  740 */     this.gunModel['¢'].setRotationPoint(13.5F, -18.5F, 6.35F);
/*      */     
/*  742 */     this.gunModel['£'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/*  743 */     this.gunModel['£'].setRotationPoint(13.0F, -19.25F, 6.35F);
/*      */     
/*  745 */     this.gunModel['¤'].addShapeBox(3.0F, -13.0F, -4.5F, 4, 3, 2, 0.0F, 0.25F, -0.75F, -1.1F, 0.25F, -0.75F, -1.1F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -1.25F, -1.1F, 0.25F, -0.75F, -1.1F, 0.25F, -1.0F, -0.25F, 0.25F, -1.5F, -0.25F);
/*  746 */     this.gunModel['¤'].setRotationPoint(5.5F, -18.5F, 7.0F);
/*      */     
/*  748 */     this.gunModel['¥'].addShapeBox(3.0F, -13.0F, -4.5F, 9, 2, 2, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  749 */     this.gunModel['¥'].setRotationPoint(-4.5F, -17.75F, 6.35F);
/*      */     
/*  751 */     this.gunModel['¦'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 2, 2, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  752 */     this.gunModel['¦'].setRotationPoint(-12.5F, -18.75F, 6.35F);
/*      */     
/*  754 */     this.gunModel['§'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  755 */     this.gunModel['§'].setRotationPoint(-6.5F, -18.75F, 6.35F);
/*      */     
/*  757 */     this.gunModel['¨'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  758 */     this.gunModel['¨'].setRotationPoint(-12.5F, -16.75F, 6.35F);
/*      */     
/*  760 */     this.gunModel['©'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F);
/*  761 */     this.gunModel['©'].setRotationPoint(-12.5F, -16.25F, 6.35F);
/*      */     
/*  763 */     this.gunModel['ª'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  764 */     this.gunModel['ª'].setRotationPoint(-11.0F, -15.25F, 6.35F);
/*      */     
/*  766 */     this.gunModel['«'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -1.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F);
/*  767 */     this.gunModel['«'].setRotationPoint(-11.0F, -14.25F, 6.35F);
/*      */     
/*  769 */     this.gunModel['¬'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  770 */     this.gunModel['¬'].setRotationPoint(-6.5F, -17.75F, 6.35F);
/*      */     
/*  772 */     this.gunModel['­'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  773 */     this.gunModel['­'].setRotationPoint(-6.5F, -16.75F, 6.35F);
/*      */     
/*  775 */     this.gunModel['®'].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 2, 0.0F, 0.0F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.5F, -1.5F, -0.75F, 0.5F, -1.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  776 */     this.gunModel['®'].setRotationPoint(-10.0F, -14.25F, 6.35F);
/*      */     
/*  778 */     this.gunModel['¯'].addShapeBox(3.0F, -13.0F, -4.5F, 4, 2, 2, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
/*  779 */     this.gunModel['¯'].setRotationPoint(-10.5F, -16.25F, 6.35F);
/*      */     
/*  781 */     this.gunModel['°'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  782 */     this.gunModel['°'].setRotationPoint(-11.5F, -16.25F, 6.35F);
/*      */     
/*  784 */     this.gunModel['±'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  785 */     this.gunModel['±'].setRotationPoint(-7.0F, -17.25F, 7.35F);
/*      */     
/*  787 */     this.gunModel['²'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/*  788 */     this.gunModel['²'].setRotationPoint(-19.25F, -16.0F, 3.5F);
/*      */     
/*  790 */     this.gunModel['³'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F);
/*  791 */     this.gunModel['³'].setRotationPoint(-19.25F, -17.0F, 3.5F);
/*      */     
/*  793 */     this.gunModel['´'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/*  794 */     this.gunModel['´'].setRotationPoint(-19.25F, -17.5F, 3.5F);
/*      */     
/*  796 */     this.gunModel['µ'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -2.1F, 0.45F, -0.25F, 0.0F, 0.45F, -0.25F, 0.0F, 0.45F, -0.25F, -2.1F, 0.45F, -0.25F);
/*  797 */     this.gunModel['µ'].setRotationPoint(-19.25F, -15.5F, 3.5F);
/*      */     
/*  799 */     this.gunModel['¶'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  800 */     this.gunModel['¶'].setRotationPoint(-12.0F, -4.5F, 0.5F);
/*  801 */     this.gunModel['¶'].rotateAngleZ = -0.6457718F;
/*      */     
/*  803 */     this.gunModel['·'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  804 */     this.gunModel['·'].setRotationPoint(9.15F, -11.05F, 0.5F);
/*  805 */     this.gunModel['·'].rotateAngleZ = -3.7873645F;
/*      */     
/*  807 */     this.gunModel['¸'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  808 */     this.gunModel['¸'].setRotationPoint(-12.0F, -4.5F, 8.0F);
/*  809 */     this.gunModel['¸'].rotateAngleZ = -0.6457718F;
/*      */     
/*  811 */     this.gunModel['¹'].addShapeBox(3.0F, -13.0F, -4.5F, 7, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  812 */     this.gunModel['¹'].setRotationPoint(9.15F, -11.05F, 8.0F);
/*  813 */     this.gunModel['¹'].rotateAngleZ = -3.7873645F;
/*      */     
/*  815 */     this.gunModel['º'].addShapeBox(3.0F, -13.0F, -4.5F, 25, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  816 */     this.gunModel['º'].setRotationPoint(22.0F, -15.2F, 2.0F);
/*      */     
/*  818 */     this.gunModel['»'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  819 */     this.gunModel['»'].setRotationPoint(22.0F, -10.7F, 2.0F);
/*      */     
/*  821 */     this.gunModel['¼'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  822 */     this.gunModel['¼'].setRotationPoint(23.0F, -7.2F, 2.0F);
/*      */     
/*  824 */     this.gunModel['½'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  825 */     this.gunModel['½'].setRotationPoint(24.0F, -7.2F, 2.0F);
/*      */     
/*  827 */     this.gunModel['¾'].addShapeBox(3.0F, -13.0F, -4.5F, 3, 1, 5, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  828 */     this.gunModel['¾'].setRotationPoint(26.0F, -8.2F, 2.0F);
/*      */     
/*  830 */     this.gunModel['¿'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  831 */     this.gunModel['¿'].setRotationPoint(29.0F, -9.2F, 2.0F);
/*      */     
/*  833 */     this.gunModel['À'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  834 */     this.gunModel['À'].setRotationPoint(31.0F, -8.2F, 2.0F);
/*      */     
/*  836 */     this.gunModel['Á'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 5, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  837 */     this.gunModel['Á'].setRotationPoint(31.0F, -6.2F, 2.0F);
/*      */     
/*  839 */     this.gunModel['Â'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  840 */     this.gunModel['Â'].setRotationPoint(30.0F, -5.2F, 2.0F);
/*      */     
/*  842 */     this.gunModel['Ã'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 10, 5, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  843 */     this.gunModel['Ã'].setRotationPoint(25.0F, -4.2F, 2.0F);
/*      */     
/*  845 */     this.gunModel['Ä'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  846 */     this.gunModel['Ä'].setRotationPoint(25.0F, 5.8F, 2.0F);
/*      */     
/*  848 */     this.gunModel['Å'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  849 */     this.gunModel['Å'].setRotationPoint(25.0F, 8.8F, 2.0F);
/*      */     
/*  851 */     this.gunModel['Æ'].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  852 */     this.gunModel['Æ'].setRotationPoint(25.5F, 11.8F, 2.0F);
/*      */     
/*  854 */     this.gunModel['Ç'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/*  855 */     this.gunModel['Ç'].setRotationPoint(28.5F, 13.8F, 2.0F);
/*      */     
/*  857 */     this.gunModel['È'].addShapeBox(3.0F, -13.0F, -4.5F, 5, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  858 */     this.gunModel['È'].setRotationPoint(34.5F, 10.8F, 2.0F);
/*      */     
/*  860 */     this.gunModel['É'].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  861 */     this.gunModel['É'].setRotationPoint(30.5F, 9.8F, 2.0F);
/*      */     
/*  863 */     this.gunModel['Ê'].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  864 */     this.gunModel['Ê'].setRotationPoint(26.5F, 12.8F, 2.0F);
/*      */     
/*  866 */     this.gunModel['Ë'].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  867 */     this.gunModel['Ë'].setRotationPoint(30.5F, 8.8F, 2.0F);
/*      */     
/*  869 */     this.gunModel['Ì'].addShapeBox(3.0F, -13.0F, -4.5F, 9, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  870 */     this.gunModel['Ì'].setRotationPoint(31.0F, 7.8F, 2.0F);
/*      */     
/*  872 */     this.gunModel['Í'].addShapeBox(3.0F, -13.0F, -4.5F, 10, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  873 */     this.gunModel['Í'].setRotationPoint(31.0F, 6.3F, 2.0F);
/*      */     
/*  875 */     this.gunModel['Î'].addShapeBox(3.0F, -13.0F, -4.5F, 10, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  876 */     this.gunModel['Î'].setRotationPoint(31.0F, 5.3F, 2.0F);
/*      */     
/*  878 */     this.gunModel['Ï'].addShapeBox(3.0F, -13.0F, -4.5F, 10, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  879 */     this.gunModel['Ï'].setRotationPoint(31.0F, 4.3F, 2.0F);
/*      */     
/*  881 */     this.gunModel['Ð'].addShapeBox(3.0F, -13.0F, -4.5F, 10, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  882 */     this.gunModel['Ð'].setRotationPoint(31.0F, 3.3F, 2.0F);
/*      */     
/*  884 */     this.gunModel['Ñ'].addShapeBox(3.0F, -13.0F, -4.5F, 12, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  885 */     this.gunModel['Ñ'].setRotationPoint(31.0F, 2.3F, 2.0F);
/*      */     
/*  887 */     this.gunModel['Ò'].addShapeBox(3.0F, -13.0F, -4.5F, 12, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  888 */     this.gunModel['Ò'].setRotationPoint(31.0F, 0.3F, 2.0F);
/*      */     
/*  890 */     this.gunModel['Ó'].addShapeBox(3.0F, -13.0F, -4.5F, 12, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  891 */     this.gunModel['Ó'].setRotationPoint(31.0F, -0.7F, 2.0F);
/*      */     
/*  893 */     this.gunModel['Ô'].addShapeBox(3.0F, -13.0F, -4.5F, 13, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  894 */     this.gunModel['Ô'].setRotationPoint(31.0F, -1.7F, 2.0F);
/*      */     
/*  896 */     this.gunModel['Õ'].addShapeBox(3.0F, -13.0F, -4.5F, 14, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  897 */     this.gunModel['Õ'].setRotationPoint(31.0F, -2.7F, 2.0F);
/*      */     
/*  899 */     this.gunModel['Ö'].addShapeBox(3.0F, -13.0F, -4.5F, 13, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  900 */     this.gunModel['Ö'].setRotationPoint(32.0F, -4.7F, 2.0F);
/*      */     
/*  902 */     this.gunModel['×'].addShapeBox(3.0F, -13.0F, -4.5F, 13, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  903 */     this.gunModel['×'].setRotationPoint(32.0F, -6.7F, 2.0F);
/*      */     
/*  905 */     this.gunModel['Ø'].addShapeBox(3.0F, -13.0F, -4.5F, 13, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  906 */     this.gunModel['Ø'].setRotationPoint(32.0F, -9.7F, 2.0F);
/*      */     
/*  908 */     this.gunModel['Ù'].addShapeBox(3.0F, -13.0F, -4.5F, 21, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  909 */     this.gunModel['Ù'].setRotationPoint(24.0F, -10.7F, 2.0F);
/*      */     
/*  911 */     this.gunModel['Ú'].addShapeBox(3.0F, -13.0F, -4.5F, 6, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  912 */     this.gunModel['Ú'].setRotationPoint(30.5F, 13.8F, 2.0F);
/*      */     
/*  914 */     this.gunModel['Û'].addShapeBox(3.0F, -13.0F, -4.5F, 4, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  915 */     this.gunModel['Û'].setRotationPoint(30.5F, 10.8F, 2.0F);
/*      */     
/*  917 */     this.gunModel['Ü'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  918 */     this.gunModel['Ü'].setRotationPoint(31.0F, -4.7F, 2.0F);
/*      */     
/*  920 */     this.gunModel['Ý'].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  921 */     this.gunModel['Ý'].setRotationPoint(31.0F, -9.2F, 2.0F);
/*      */     
/*  923 */     this.gunModel['Þ'].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  924 */     this.gunModel['Þ'].setRotationPoint(24.0F, -9.2F, 2.0F);
/*      */     
/*  926 */     this.gunModel['ß'].addShapeBox(3.0F, -13.0F, -4.5F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  927 */     this.gunModel['ß'].setRotationPoint(26.0F, -9.7F, 2.0F);
/*      */     
/*  929 */     this.gunModel['à'].addShapeBox(3.0F, -13.0F, -4.5F, 12, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  930 */     this.gunModel['à'].setRotationPoint(51.0F, -24.7F, 2.0F);
/*      */     
/*  932 */     this.gunModel['á'].addShapeBox(3.0F, -13.0F, -4.5F, 3, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  933 */     this.gunModel['á'].setRotationPoint(49.0F, -25.2F, 1.5F);
/*      */     
/*      */ 
/*  936 */     this.ammoModel = new ModelRendererTurbo[2];
/*  937 */     this.ammoModel[0] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  938 */     this.ammoModel[1] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*      */     
/*  940 */     this.ammoModel[0].addShapeBox(3.0F, -13.0F, -4.5F, 9, 17, 5, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 4.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F);
/*  941 */     this.ammoModel[0].setRotationPoint(-10.0F, -2.0F, 2.0F);
/*      */     
/*  943 */     this.ammoModel[1].addShapeBox(3.0F, -13.0F, -4.5F, 7, 42, 5, 0.0F, -1.0F, -0.5F, -0.25F, 5.0F, -0.5F, -0.25F, 5.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 11.0F, 0.0F, -0.25F, -6.0F, 0.0F, -0.25F, -6.0F, 0.0F, -0.25F, 11.0F, 0.0F, -0.25F);
/*  944 */     this.ammoModel[1].setRotationPoint(-7.0F, -4.5F, 2.0F);
/*      */     
/*      */ 
/*  947 */     this.slideModel = new ModelRendererTurbo[122];
/*  948 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  949 */     this.slideModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  950 */     this.slideModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  951 */     this.slideModel[3] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  952 */     this.slideModel[4] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  953 */     this.slideModel[5] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  954 */     this.slideModel[6] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  955 */     this.slideModel[7] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  956 */     this.slideModel[8] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  957 */     this.slideModel[9] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  958 */     this.slideModel[10] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  959 */     this.slideModel[11] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  960 */     this.slideModel[12] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  961 */     this.slideModel[13] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  962 */     this.slideModel[14] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  963 */     this.slideModel[15] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  964 */     this.slideModel[16] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  965 */     this.slideModel[17] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  966 */     this.slideModel[18] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  967 */     this.slideModel[19] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  968 */     this.slideModel[20] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  969 */     this.slideModel[21] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  970 */     this.slideModel[22] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  971 */     this.slideModel[23] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  972 */     this.slideModel[24] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  973 */     this.slideModel[25] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  974 */     this.slideModel[26] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  975 */     this.slideModel[27] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  976 */     this.slideModel[28] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  977 */     this.slideModel[29] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  978 */     this.slideModel[30] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  979 */     this.slideModel[31] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  980 */     this.slideModel[32] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  981 */     this.slideModel[33] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  982 */     this.slideModel[34] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  983 */     this.slideModel[35] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  984 */     this.slideModel[36] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  985 */     this.slideModel[37] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  986 */     this.slideModel[38] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  987 */     this.slideModel[39] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  988 */     this.slideModel[40] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  989 */     this.slideModel[41] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  990 */     this.slideModel[42] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  991 */     this.slideModel[43] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  992 */     this.slideModel[44] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  993 */     this.slideModel[45] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  994 */     this.slideModel[46] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  995 */     this.slideModel[47] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  996 */     this.slideModel[48] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  997 */     this.slideModel[49] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  998 */     this.slideModel[50] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  999 */     this.slideModel[51] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/* 1000 */     this.slideModel[52] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/* 1001 */     this.slideModel[53] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 1002 */     this.slideModel[54] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/* 1003 */     this.slideModel[55] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 1004 */     this.slideModel[56] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 1005 */     this.slideModel[57] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/* 1006 */     this.slideModel[58] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 1007 */     this.slideModel[59] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 1008 */     this.slideModel[60] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 1009 */     this.slideModel[61] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 1010 */     this.slideModel[62] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 1011 */     this.slideModel[63] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/* 1012 */     this.slideModel[64] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 1013 */     this.slideModel[65] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 1014 */     this.slideModel[66] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 1015 */     this.slideModel[67] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 1016 */     this.slideModel[68] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 1017 */     this.slideModel[69] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 1018 */     this.slideModel[70] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/* 1019 */     this.slideModel[71] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 1020 */     this.slideModel[72] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 1021 */     this.slideModel[73] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/* 1022 */     this.slideModel[74] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 1023 */     this.slideModel[75] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/* 1024 */     this.slideModel[76] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 1025 */     this.slideModel[77] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/* 1026 */     this.slideModel[78] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 1027 */     this.slideModel[79] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 1028 */     this.slideModel[80] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 1029 */     this.slideModel[81] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/* 1030 */     this.slideModel[82] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 1031 */     this.slideModel[83] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 1032 */     this.slideModel[84] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/* 1033 */     this.slideModel[85] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/* 1034 */     this.slideModel[86] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/* 1035 */     this.slideModel[87] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/* 1036 */     this.slideModel[88] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 1037 */     this.slideModel[89] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 1038 */     this.slideModel[90] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/* 1039 */     this.slideModel[91] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/* 1040 */     this.slideModel[92] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/* 1041 */     this.slideModel[93] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/* 1042 */     this.slideModel[94] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/* 1043 */     this.slideModel[95] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/* 1044 */     this.slideModel[96] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/* 1045 */     this.slideModel[97] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/* 1046 */     this.slideModel[98] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/* 1047 */     this.slideModel[99] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/* 1048 */     this.slideModel[100] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 1049 */     this.slideModel[101] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/* 1050 */     this.slideModel[102] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/* 1051 */     this.slideModel[103] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/* 1052 */     this.slideModel[104] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/* 1053 */     this.slideModel[105] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/* 1054 */     this.slideModel[106] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/* 1055 */     this.slideModel[107] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/* 1056 */     this.slideModel[108] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/* 1057 */     this.slideModel[109] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/* 1058 */     this.slideModel[110] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/* 1059 */     this.slideModel[111] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/* 1060 */     this.slideModel[112] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/* 1061 */     this.slideModel[113] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/* 1062 */     this.slideModel[114] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/* 1063 */     this.slideModel[115] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/* 1064 */     this.slideModel[116] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/* 1065 */     this.slideModel[117] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/* 1066 */     this.slideModel[118] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/* 1067 */     this.slideModel[119] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/* 1068 */     this.slideModel[120] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 1069 */     this.slideModel[121] = new ModelRendererTurbo(this, 409, 97, this.textureX, this.textureY);
/*      */     
/* 1071 */     this.slideModel[0].addBox(3.0F, -13.0F, -4.5F, 7, 6, 7, 0.0F);
/* 1072 */     this.slideModel[0].setRotationPoint(4.0F, -25.2F, 1.0F);
/*      */     
/* 1074 */     this.slideModel[1].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1075 */     this.slideModel[1].setRotationPoint(-6.0F, -25.2F, 7.0F);
/*      */     
/* 1077 */     this.slideModel[2].addShapeBox(3.0F, -13.0F, -4.5F, 10, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1078 */     this.slideModel[2].setRotationPoint(37.0F, -21.2F, 2.0F);
/*      */     
/* 1080 */     this.slideModel[3].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1081 */     this.slideModel[3].setRotationPoint(43.5F, -27.5F, 4.0F);
/*      */     
/* 1083 */     this.slideModel[4].addBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F);
/* 1084 */     this.slideModel[4].setRotationPoint(-5.0F, -27.5F, 3.0F);
/*      */     
/* 1086 */     this.slideModel[5].addBox(3.0F, -13.0F, -4.5F, 1, 2, 1, 0.0F);
/* 1087 */     this.slideModel[5].setRotationPoint(-5.0F, -27.5F, 5.0F);
/*      */     
/* 1089 */     this.slideModel[6].addBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F);
/* 1090 */     this.slideModel[6].setRotationPoint(-5.0F, -27.0F, 4.0F);
/*      */     
/* 1092 */     this.slideModel[7].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1093 */     this.slideModel[7].setRotationPoint(-6.0F, -27.5F, 5.0F);
/*      */     
/* 1095 */     this.slideModel[8].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1096 */     this.slideModel[8].setRotationPoint(-6.0F, -27.5F, 3.0F);
/*      */     
/* 1098 */     this.slideModel[9].addBox(3.0F, -13.0F, -4.5F, 47, 2, 1, 0.0F);
/* 1099 */     this.slideModel[9].setRotationPoint(-10.0F, -19.5F, 1.5F);
/*      */     
/* 1101 */     this.slideModel[10].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1102 */     this.slideModel[10].setRotationPoint(47.0F, -20.2F, 2.0F);
/*      */     
/* 1104 */     this.slideModel[11].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1105 */     this.slideModel[11].setRotationPoint(47.0F, -20.2F, 6.0F);
/*      */     
/* 1107 */     this.slideModel[12].addShapeBox(3.0F, -13.0F, -4.5F, 39, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1108 */     this.slideModel[12].setRotationPoint(9.0F, -18.2F, 3.5F);
/*      */     
/* 1110 */     this.slideModel[13].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1111 */     this.slideModel[13].setRotationPoint(47.0F, -20.2F, 3.5F);
/*      */     
/* 1113 */     this.slideModel[14].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1114 */     this.slideModel[14].setRotationPoint(-5.0F, -25.2F, 7.0F);
/*      */     
/* 1116 */     this.slideModel[15].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1117 */     this.slideModel[15].setRotationPoint(-3.0F, -25.2F, 7.0F);
/*      */     
/* 1119 */     this.slideModel[16].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1120 */     this.slideModel[16].setRotationPoint(-4.0F, -25.2F, 7.0F);
/*      */     
/* 1122 */     this.slideModel[17].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1123 */     this.slideModel[17].setRotationPoint(-2.0F, -25.2F, 7.0F);
/*      */     
/* 1125 */     this.slideModel[18].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1126 */     this.slideModel[18].setRotationPoint(1.0F, -25.2F, 7.0F);
/*      */     
/* 1128 */     this.slideModel[19].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1129 */     this.slideModel[19].setRotationPoint(0.0F, -25.2F, 7.0F);
/*      */     
/* 1131 */     this.slideModel[20].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1132 */     this.slideModel[20].setRotationPoint(-1.0F, -25.2F, 7.0F);
/*      */     
/* 1134 */     this.slideModel[21].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1135 */     this.slideModel[21].setRotationPoint(3.0F, -25.2F, 7.0F);
/*      */     
/* 1137 */     this.slideModel[22].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1138 */     this.slideModel[22].setRotationPoint(2.0F, -25.2F, 7.0F);
/*      */     
/* 1140 */     this.slideModel[23].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1141 */     this.slideModel[23].setRotationPoint(-6.0F, -25.2F, 1.0F);
/*      */     
/* 1143 */     this.slideModel[24].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1144 */     this.slideModel[24].setRotationPoint(-5.0F, -25.2F, 1.0F);
/*      */     
/* 1146 */     this.slideModel[25].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1147 */     this.slideModel[25].setRotationPoint(-4.0F, -25.2F, 1.0F);
/*      */     
/* 1149 */     this.slideModel[26].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1150 */     this.slideModel[26].setRotationPoint(-3.0F, -25.2F, 1.0F);
/*      */     
/* 1152 */     this.slideModel[27].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1153 */     this.slideModel[27].setRotationPoint(-2.0F, -25.2F, 1.0F);
/*      */     
/* 1155 */     this.slideModel[28].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1156 */     this.slideModel[28].setRotationPoint(0.0F, -25.2F, 1.0F);
/*      */     
/* 1158 */     this.slideModel[29].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1159 */     this.slideModel[29].setRotationPoint(-1.0F, -25.2F, 1.0F);
/*      */     
/* 1161 */     this.slideModel[30].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1162 */     this.slideModel[30].setRotationPoint(1.0F, -25.2F, 1.0F);
/*      */     
/* 1164 */     this.slideModel[31].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1165 */     this.slideModel[31].setRotationPoint(2.0F, -25.2F, 1.0F);
/*      */     
/* 1167 */     this.slideModel[32].addShapeBox(3.0F, -13.0F, -4.5F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1168 */     this.slideModel[32].setRotationPoint(3.0F, -25.2F, 1.0F);
/*      */     
/* 1170 */     this.slideModel[33].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1171 */     this.slideModel[33].setRotationPoint(4.0F, -26.2F, 1.0F);
/*      */     
/* 1173 */     this.slideModel[34].addShapeBox(3.0F, -13.0F, -4.5F, 21, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1174 */     this.slideModel[34].setRotationPoint(-10.5F, -26.7F, 2.5F);
/*      */     
/* 1176 */     this.slideModel[35].addShapeBox(3.0F, -13.0F, -4.5F, 21, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1177 */     this.slideModel[35].setRotationPoint(-10.5F, -26.7F, 4.5F);
/*      */     
/* 1179 */     this.slideModel[36].addShapeBox(3.0F, -13.0F, -4.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1180 */     this.slideModel[36].setRotationPoint(4.0F, -26.2F, 6.5F);
/*      */     
/* 1182 */     this.slideModel[37].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1183 */     this.slideModel[37].setRotationPoint(-6.0F, -26.2F, 6.5F);
/*      */     
/* 1185 */     this.slideModel[38].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1186 */     this.slideModel[38].setRotationPoint(-6.0F, -26.2F, 1.0F);
/*      */     
/* 1188 */     this.slideModel[39].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1189 */     this.slideModel[39].setRotationPoint(-5.0F, -26.2F, 1.0F);
/*      */     
/* 1191 */     this.slideModel[40].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1192 */     this.slideModel[40].setRotationPoint(-5.0F, -26.2F, 6.5F);
/*      */     
/* 1194 */     this.slideModel[41].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1195 */     this.slideModel[41].setRotationPoint(-3.0F, -26.2F, 1.0F);
/*      */     
/* 1197 */     this.slideModel[42].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1198 */     this.slideModel[42].setRotationPoint(-3.0F, -26.2F, 6.5F);
/*      */     
/* 1200 */     this.slideModel[43].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1201 */     this.slideModel[43].setRotationPoint(-4.0F, -26.2F, 6.5F);
/*      */     
/* 1203 */     this.slideModel[44].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1204 */     this.slideModel[44].setRotationPoint(-4.0F, -26.2F, 1.0F);
/*      */     
/* 1206 */     this.slideModel[45].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1207 */     this.slideModel[45].setRotationPoint(-1.0F, -26.2F, 1.0F);
/*      */     
/* 1209 */     this.slideModel[46].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1210 */     this.slideModel[46].setRotationPoint(-1.0F, -26.2F, 6.5F);
/*      */     
/* 1212 */     this.slideModel[47].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1213 */     this.slideModel[47].setRotationPoint(-2.0F, -26.2F, 6.5F);
/*      */     
/* 1215 */     this.slideModel[48].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1216 */     this.slideModel[48].setRotationPoint(-2.0F, -26.2F, 1.0F);
/*      */     
/* 1218 */     this.slideModel[49].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1219 */     this.slideModel[49].setRotationPoint(1.0F, -26.2F, 1.0F);
/*      */     
/* 1221 */     this.slideModel[50].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1222 */     this.slideModel[50].setRotationPoint(1.0F, -26.2F, 6.5F);
/*      */     
/* 1224 */     this.slideModel[51].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1225 */     this.slideModel[51].setRotationPoint(0.0F, -26.2F, 6.5F);
/*      */     
/* 1227 */     this.slideModel[52].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1228 */     this.slideModel[52].setRotationPoint(0.0F, -26.2F, 1.0F);
/*      */     
/* 1230 */     this.slideModel[53].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1231 */     this.slideModel[53].setRotationPoint(3.0F, -26.2F, 1.0F);
/*      */     
/* 1233 */     this.slideModel[54].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1234 */     this.slideModel[54].setRotationPoint(3.0F, -26.2F, 6.5F);
/*      */     
/* 1236 */     this.slideModel[55].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1237 */     this.slideModel[55].setRotationPoint(2.0F, -26.2F, 6.5F);
/*      */     
/* 1239 */     this.slideModel[56].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1240 */     this.slideModel[56].setRotationPoint(2.0F, -26.2F, 1.0F);
/*      */     
/* 1242 */     this.slideModel[57].addShapeBox(3.0F, -13.0F, -4.5F, 12, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1243 */     this.slideModel[57].setRotationPoint(-1.0F, -25.2F, 2.5F);
/*      */     
/* 1245 */     this.slideModel[58].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1246 */     this.slideModel[58].setRotationPoint(40.5F, -27.5F, 4.0F);
/*      */     
/* 1248 */     this.slideModel[59].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1249 */     this.slideModel[59].setRotationPoint(42.5F, -27.5F, 4.0F);
/*      */     
/* 1251 */     this.slideModel[60].addBox(3.0F, -13.0F, -4.5F, 11, 6, 6, 0.0F);
/* 1252 */     this.slideModel[60].setRotationPoint(-7.0F, -25.2F, 1.5F);
/*      */     
/* 1254 */     this.slideModel[61].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.slideModel[61].setRotationPoint(2.5F, -26.2F, 6.5F);
/*      */     
/* 1257 */     this.slideModel[62].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1258 */     this.slideModel[62].setRotationPoint(3.5F, -26.2F, 6.5F);
/*      */     
/* 1260 */     this.slideModel[63].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1261 */     this.slideModel[63].setRotationPoint(1.5F, -26.2F, 6.5F);
/*      */     
/* 1263 */     this.slideModel[64].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1264 */     this.slideModel[64].setRotationPoint(0.5F, -26.2F, 6.5F);
/*      */     
/* 1266 */     this.slideModel[65].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1267 */     this.slideModel[65].setRotationPoint(-2.5F, -26.2F, 6.5F);
/*      */     
/* 1269 */     this.slideModel[66].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.slideModel[66].setRotationPoint(-3.5F, -26.2F, 6.5F);
/*      */     
/* 1272 */     this.slideModel[67].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1273 */     this.slideModel[67].setRotationPoint(-1.5F, -26.2F, 6.5F);
/*      */     
/* 1275 */     this.slideModel[68].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1276 */     this.slideModel[68].setRotationPoint(-0.5F, -26.2F, 6.5F);
/*      */     
/* 1278 */     this.slideModel[69].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1279 */     this.slideModel[69].setRotationPoint(-5.5F, -26.2F, 6.5F);
/*      */     
/* 1281 */     this.slideModel[70].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1282 */     this.slideModel[70].setRotationPoint(-4.5F, -26.2F, 6.5F);
/*      */     
/* 1284 */     this.slideModel[71].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1285 */     this.slideModel[71].setRotationPoint(3.5F, -26.2F, 1.5F);
/*      */     
/* 1287 */     this.slideModel[72].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.slideModel[72].setRotationPoint(2.5F, -26.2F, 1.5F);
/*      */     
/* 1290 */     this.slideModel[73].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.slideModel[73].setRotationPoint(0.5F, -26.2F, 1.5F);
/*      */     
/* 1293 */     this.slideModel[74].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1294 */     this.slideModel[74].setRotationPoint(1.5F, -26.2F, 1.5F);
/*      */     
/* 1296 */     this.slideModel[75].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1297 */     this.slideModel[75].setRotationPoint(-1.5F, -26.2F, 1.5F);
/*      */     
/* 1299 */     this.slideModel[76].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1300 */     this.slideModel[76].setRotationPoint(-0.5F, -26.2F, 1.5F);
/*      */     
/* 1302 */     this.slideModel[77].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.slideModel[77].setRotationPoint(-3.5F, -26.2F, 1.5F);
/*      */     
/* 1305 */     this.slideModel[78].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1306 */     this.slideModel[78].setRotationPoint(-2.5F, -26.2F, 1.5F);
/*      */     
/* 1308 */     this.slideModel[79].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1309 */     this.slideModel[79].setRotationPoint(-5.5F, -26.2F, 1.5F);
/*      */     
/* 1311 */     this.slideModel[80].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1312 */     this.slideModel[80].setRotationPoint(-4.5F, -26.2F, 1.5F);
/*      */     
/* 1314 */     this.slideModel[81].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1315 */     this.slideModel[81].setRotationPoint(-4.0F, -27.5F, 5.0F);
/*      */     
/* 1317 */     this.slideModel[82].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1318 */     this.slideModel[82].setRotationPoint(-4.0F, -27.5F, 3.0F);
/*      */     
/* 1320 */     this.slideModel[83].addShapeBox(3.0F, -13.0F, -4.5F, 11, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1321 */     this.slideModel[83].setRotationPoint(37.0F, -25.2F, 1.0F);
/*      */     
/* 1323 */     this.slideModel[84].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1324 */     this.slideModel[84].setRotationPoint(39.0F, -20.7F, 1.0F);
/*      */     
/* 1326 */     this.slideModel[85].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1327 */     this.slideModel[85].setRotationPoint(-6.5F, -26.2F, 6.5F);
/*      */     
/* 1329 */     this.slideModel[86].addShapeBox(3.0F, -13.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.666F, 0.0F, -0.5F, -0.666F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1330 */     this.slideModel[86].setRotationPoint(-6.5F, -26.2F, 1.5F);
/*      */     
/* 1332 */     this.slideModel[87].addShapeBox(3.0F, -13.0F, -4.5F, 4, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1333 */     this.slideModel[87].setRotationPoint(-10.5F, -25.2F, 1.0F);
/*      */     
/* 1335 */     this.slideModel[88].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1336 */     this.slideModel[88].setRotationPoint(-10.5F, -26.2F, 6.5F);
/*      */     
/* 1338 */     this.slideModel[89].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1339 */     this.slideModel[89].setRotationPoint(-10.5F, -26.2F, 1.0F);
/*      */     
/* 1341 */     this.slideModel[90].addBox(3.0F, -13.0F, -4.5F, 10, 1, 3, 0.0F);
/* 1342 */     this.slideModel[90].setRotationPoint(38.0F, -16.2F, 3.0F);
/*      */     
/* 1344 */     this.slideModel[91].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1345 */     this.slideModel[91].setRotationPoint(37.0F, -16.2F, 2.0F);
/*      */     
/* 1347 */     this.slideModel[92].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1348 */     this.slideModel[92].setRotationPoint(37.0F, -16.2F, 6.0F);
/*      */     
/* 1350 */     this.slideModel[93].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1351 */     this.slideModel[93].setRotationPoint(37.0F, -15.2F, 3.0F);
/*      */     
/* 1353 */     this.slideModel[94].addShapeBox(3.0F, -13.0F, -4.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F);
/* 1354 */     this.slideModel[94].setRotationPoint(37.0F, -15.2F, 4.5F);
/*      */     
/* 1356 */     this.slideModel[95].addBox(3.0F, -13.0F, -4.5F, 18, 6, 7, 0.0F);
/* 1357 */     this.slideModel[95].setRotationPoint(19.0F, -25.2F, 1.0F);
/*      */     
/* 1359 */     this.slideModel[96].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1360 */     this.slideModel[96].setRotationPoint(19.0F, -26.2F, 6.5F);
/*      */     
/* 1362 */     this.slideModel[97].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1363 */     this.slideModel[97].setRotationPoint(19.0F, -26.7F, 4.5F);
/*      */     
/* 1365 */     this.slideModel[98].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1366 */     this.slideModel[98].setRotationPoint(19.0F, -26.7F, 2.5F);
/*      */     
/* 1368 */     this.slideModel[99].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1369 */     this.slideModel[99].setRotationPoint(19.0F, -26.2F, 1.0F);
/*      */     
/* 1371 */     this.slideModel[100].addShapeBox(3.0F, -13.0F, -4.5F, 29, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1372 */     this.slideModel[100].setRotationPoint(19.0F, -25.2F, 2.5F);
/*      */     
/* 1374 */     this.slideModel[101].addShapeBox(3.0F, -13.0F, -4.5F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1375 */     this.slideModel[101].setRotationPoint(11.0F, -23.2F, 1.0F);
/*      */     
/* 1377 */     this.slideModel[102].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1378 */     this.slideModel[102].setRotationPoint(11.0F, -26.2F, 6.5F);
/*      */     
/* 1380 */     this.slideModel[103].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, -0.0625F, -0.25F, 0.0F, -0.0625F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.slideModel[103].setRotationPoint(11.0F, -26.7F, 4.5F);
/*      */     
/* 1383 */     this.slideModel[104].addBox(3.0F, -13.0F, -4.5F, 8, 6, 1, 0.0F);
/* 1384 */     this.slideModel[104].setRotationPoint(11.0F, -25.2F, 7.0F);
/*      */     
/* 1386 */     this.slideModel[105].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1387 */     this.slideModel[105].setRotationPoint(11.0F, -26.0F, 3.0F);
/*      */     
/* 1389 */     this.slideModel[106].addShapeBox(3.0F, -13.0F, -4.5F, 8, 1, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1390 */     this.slideModel[106].setRotationPoint(11.0F, -25.5F, 1.5F);
/*      */     
/* 1392 */     this.slideModel[107].addShapeBox(3.0F, -13.0F, -4.5F, 8, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1393 */     this.slideModel[107].setRotationPoint(11.0F, -25.2F, 5.0F);
/*      */     
/* 1395 */     this.slideModel[108].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F);
/* 1396 */     this.slideModel[108].setRotationPoint(-11.5F, -26.2F, 6.5F);
/*      */     
/* 1398 */     this.slideModel[109].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1399 */     this.slideModel[109].setRotationPoint(-11.5F, -26.7F, 4.5F);
/*      */     
/* 1401 */     this.slideModel[110].addShapeBox(3.0F, -13.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1402 */     this.slideModel[110].setRotationPoint(-11.5F, -26.7F, 2.5F);
/*      */     
/* 1404 */     this.slideModel[111].addShapeBox(3.0F, -13.0F, -4.5F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F);
/* 1405 */     this.slideModel[111].setRotationPoint(-11.5F, -26.2F, 1.0F);
/*      */     
/* 1407 */     this.slideModel[112].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.slideModel[112].setRotationPoint(37.0F, -19.95F, 1.0F);
/*      */     
/* 1410 */     this.slideModel[113].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1411 */     this.slideModel[113].setRotationPoint(37.0F, -20.7F, 1.0F);
/*      */     
/* 1413 */     this.slideModel[114].addShapeBox(3.0F, -13.0F, -4.5F, 1, 4, 2, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 1.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -0.5F, 1.25F, 0.15F, -0.5F);
/* 1414 */     this.slideModel[114].setRotationPoint(-11.5F, -23.2F, 1.0F);
/*      */     
/* 1416 */     this.slideModel[115].addShapeBox(3.0F, -13.0F, -4.5F, 4, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F);
/* 1417 */     this.slideModel[115].setRotationPoint(-10.5F, -21.7F, 1.0F);
/*      */     
/* 1419 */     this.slideModel[116].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.slideModel[116].setRotationPoint(-10.5F, -20.2F, 5.0F);
/*      */     
/* 1422 */     this.slideModel[117].addShapeBox(3.0F, -13.0F, -4.5F, 2, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1423 */     this.slideModel[117].setRotationPoint(-8.5F, -20.2F, 5.0F);
/*      */     
/* 1425 */     this.slideModel[118].addShapeBox(3.0F, -13.0F, -4.5F, 1, 4, 2, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 1.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -0.5F, 1.25F, 0.15F, -0.5F);
/* 1426 */     this.slideModel[118].setRotationPoint(-11.5F, -23.2F, 6.5F);
/*      */     
/* 1428 */     this.slideModel[119].addShapeBox(3.0F, -13.0F, -4.5F, 4, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1429 */     this.slideModel[119].setRotationPoint(-10.5F, -21.2F, 5.0F);
/*      */     
/* 1431 */     this.slideModel[120].addShapeBox(3.0F, -13.0F, -4.5F, 0, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1432 */     this.slideModel[120].setRotationPoint(37.0F, -26.2F, 2.5F);
/*      */     
/* 1434 */     this.slideModel[121].addShapeBox(3.0F, -13.0F, -4.5F, 10, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1435 */     this.slideModel[121].setRotationPoint(40.0F, -20.2F, 3.0F);
/*      */     
/*      */ 
/*      */ 
/* 1439 */     translateAll(0.0F, -13.0F, 0.0F);
/* 1440 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*      */     
/*      */ 
/* 1443 */     this.gunSlideDistance = 1.5F;
/* 1444 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 1446 */     this.tiltGun = 7.0F;
/* 1447 */     this.rotateGunVertical = 3.0F;
/* 1448 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*      */     
/* 1450 */     this.rotateClipVertical = 5.0F;
/* 1451 */     this.translateClip = new Vector3f(0.0F, -24.0F, 0.0F);
/*      */     
/*      */ 
/* 1454 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modellebman.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */