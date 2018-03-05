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
/*      */ public class Modelak74
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelak74()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ê'];
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
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 281, 97, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 297, 121, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 313, 121, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 25, 129, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 353, 129, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 121, 129, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 185, 137, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 161, 145, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 289, 145, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 329, 145, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 105, 153, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 185, 161, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 353, 161, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 41, 169, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 121, 169, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 257, 169, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 321, 177, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 393, 177, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 105, 185, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 169, 185, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 233, 185, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 489, 89, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 41, 201, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 217, 201, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 97, 209, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 169, 209, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 169, 217, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 449, 201, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 193, 225, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 385, 225, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 465, 177, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 185, 241, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 249, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 241, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 241, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 193, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 121, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 217, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 481, 113, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 121, 89, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 417, 161, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 465, 193, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 313, 145, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 369, 217, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 353, 121, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 185, 105, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 33, 121, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 257, 161, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 17, 137, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 145, 153, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 497, 201, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 409, 241, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 129, 257, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 201, 257, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 417, 265, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 497, 241, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 105, 169, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 481, 281, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 385, 177, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 97, 185, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 401, 305, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 481, 297, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 489, 265, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 177, 305, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 449, 305, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 337, 313, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 361, 313, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 345, 273, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 433, 337, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 281, 345, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 457, 345, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 1, 353, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 113, 353, this.textureX, this.textureY);
/*      */     
/*  257 */     this.gunModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -2.25F, 2.0F);
/*  258 */     this.gunModel[0].setRotationPoint(22.5F, -10.0F, -13.0F);
/*      */     
/*  260 */     this.gunModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, 1.0F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/*  261 */     this.gunModel[1].setRotationPoint(25.5F, -10.0F, -13.0F);
/*      */     
/*  263 */     this.gunModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 15, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  264 */     this.gunModel[2].setRotationPoint(22.5F, -25.0F, -15.0F);
/*      */     
/*  266 */     this.gunModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 5, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  267 */     this.gunModel[3].setRotationPoint(37.5F, -16.0F, -15.0F);
/*      */     
/*  269 */     this.gunModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 34, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F);
/*  270 */     this.gunModel[4].setRotationPoint(42.5F, -16.0F, -15.0F);
/*      */     
/*  272 */     this.gunModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 3, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.75F, -1.0F);
/*  273 */     this.gunModel[5].setRotationPoint(76.5F, -16.0F, -15.0F);
/*      */     
/*  275 */     this.gunModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.25F, -1.0F);
/*  276 */     this.gunModel[6].setRotationPoint(79.5F, -16.0F, -15.0F);
/*      */     
/*  278 */     this.gunModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 6, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  279 */     this.gunModel[7].setRotationPoint(37.5F, -25.0F, -15.0F);
/*      */     
/*  281 */     this.gunModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 2, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  282 */     this.gunModel[8].setRotationPoint(43.5F, -25.0F, -15.0F);
/*      */     
/*  284 */     this.gunModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 35, 8, 10, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  285 */     this.gunModel[9].setRotationPoint(45.5F, -24.0F, -12.0F);
/*      */     
/*  287 */     this.gunModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 10, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  288 */     this.gunModel[10].setRotationPoint(75.5F, -26.75F, -12.0F);
/*      */     
/*  290 */     this.gunModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 39, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  291 */     this.gunModel[11].setRotationPoint(41.5F, -28.75F, -15.0F);
/*      */     
/*  293 */     this.gunModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 10, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  294 */     this.gunModel[12].setRotationPoint(56.0F, -26.75F, -12.0F);
/*      */     
/*  296 */     this.gunModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  297 */     this.gunModel[13].setRotationPoint(41.5F, -26.75F, -15.0F);
/*      */     
/*  299 */     this.gunModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  300 */     this.gunModel[14].setRotationPoint(41.5F, -36.75F, -13.0F);
/*      */     
/*  302 */     this.gunModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 33, 3, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  303 */     this.gunModel[15].setRotationPoint(42.5F, -36.75F, -13.0F);
/*      */     
/*  305 */     this.gunModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  306 */     this.gunModel[16].setRotationPoint(75.5F, -35.75F, -13.0F);
/*      */     
/*  308 */     this.gunModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 17, 11, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  309 */     this.gunModel[17].setRotationPoint(20.5F, -35.75F, -13.0F);
/*      */     
/*  311 */     this.gunModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 10, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  312 */     this.gunModel[18].setRotationPoint(10.5F, -35.75F, -13.0F);
/*      */     
/*  314 */     this.gunModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 39, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  315 */     this.gunModel[19].setRotationPoint(41.5F, -33.75F, -15.0F);
/*      */     
/*  317 */     this.gunModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 15, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  318 */     this.gunModel[20].setRotationPoint(22.5F, -16.0F, -15.0F);
/*      */     
/*  320 */     this.gunModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  321 */     this.gunModel[21].setRotationPoint(39.5F, -28.75F, -15.0F);
/*      */     
/*  323 */     this.gunModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  324 */     this.gunModel[22].setRotationPoint(39.5F, -33.75F, -15.0F);
/*      */     
/*  326 */     this.gunModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  327 */     this.gunModel[23].setRotationPoint(39.5F, -35.75F, -13.0F);
/*      */     
/*  329 */     this.gunModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  330 */     this.gunModel[24].setRotationPoint(37.5F, -35.25F, -11.5F);
/*      */     
/*  332 */     this.gunModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  333 */     this.gunModel[25].setRotationPoint(37.5F, -29.25F, -11.5F);
/*      */     
/*  335 */     this.gunModel[26].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  336 */     this.gunModel[26].setRotationPoint(37.5F, -32.25F, -11.5F);
/*      */     
/*  338 */     this.gunModel[27].addShapeBox(59.0F, -19.0F, 7.0F, 48, 15, 16, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  339 */     this.gunModel[27].setRotationPoint(-84.5F, -20.75F, -15.0F);
/*      */     
/*  341 */     this.gunModel[28].addShapeBox(59.0F, -19.0F, 7.0F, 44, 4, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.75F, 0.0F, 0.25F, -3.75F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  342 */     this.gunModel[28].setRotationPoint(-24.5F, -9.75F, -15.0F);
/*      */     
/*  344 */     this.gunModel[29].addShapeBox(59.0F, -19.0F, 7.0F, 2, 18, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.75F, 0.0F, 0.75F, -2.5F, 0.0F, 0.75F, -2.5F, 0.0F, 0.0F, -3.75F, 0.0F);
/*  345 */     this.gunModel[29].setRotationPoint(19.75F, -23.75F, -15.0F);
/*      */     
/*  347 */     this.gunModel[30].addShapeBox(59.0F, -19.0F, 7.0F, 12, 15, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  348 */     this.gunModel[30].setRotationPoint(-36.5F, -20.75F, -15.0F);
/*      */     
/*  350 */     this.gunModel[31].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  351 */     this.gunModel[31].setRotationPoint(-36.5F, -7.75F, -15.0F);
/*      */     
/*  353 */     this.gunModel[32].addShapeBox(59.0F, -19.0F, 7.0F, 8, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  354 */     this.gunModel[32].setRotationPoint(-35.5F, -5.75F, -11.0F);
/*      */     
/*  356 */     this.gunModel[33].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  357 */     this.gunModel[33].setRotationPoint(-27.5F, -7.75F, -15.0F);
/*      */     
/*  359 */     this.gunModel[34].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  360 */     this.gunModel[34].setRotationPoint(-26.5F, -7.75F, -15.0F);
/*      */     
/*  362 */     this.gunModel[35].addShapeBox(59.0F, -19.0F, 7.0F, 30, 6, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  363 */     this.gunModel[35].setRotationPoint(-12.5F, -20.75F, -15.0F);
/*      */     
/*  365 */     this.gunModel[36].addShapeBox(59.0F, -19.0F, 7.0F, 30, 3, 16, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  366 */     this.gunModel[36].setRotationPoint(-12.5F, -13.75F, -15.0F);
/*      */     
/*  368 */     this.gunModel[37].addShapeBox(59.0F, -19.0F, 7.0F, 2, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  369 */     this.gunModel[37].setRotationPoint(17.75F, -20.75F, -15.0F);
/*      */     
/*  371 */     this.gunModel[38].addShapeBox(59.0F, -19.0F, 7.0F, 12, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  372 */     this.gunModel[38].setRotationPoint(-24.5F, -20.75F, -15.0F);
/*      */     
/*  374 */     this.gunModel[39].addShapeBox(59.0F, -19.0F, 7.0F, 30, 7, 15, 0.0F, 0.0F, -3.0F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F);
/*  375 */     this.gunModel[39].setRotationPoint(-12.5F, -19.75F, -14.5F);
/*      */     
/*  377 */     this.gunModel[40].addBox(59.0F, -19.0F, 7.0F, 25, 7, 7, 0.0F);
/*  378 */     this.gunModel[40].setRotationPoint(85.0F, -23.75F, -10.5F);
/*      */     
/*  380 */     this.gunModel[41].addBox(59.0F, -19.0F, 7.0F, 3, 8, 9, 0.0F);
/*  381 */     this.gunModel[41].setRotationPoint(82.0F, -24.25F, -11.5F);
/*      */     
/*  383 */     this.gunModel[42].addShapeBox(59.0F, -19.0F, 7.0F, 2, 10, 16, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  384 */     this.gunModel[42].setRotationPoint(80.0F, -25.75F, -15.0F);
/*      */     
/*  386 */     this.gunModel[43].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 16, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F);
/*  387 */     this.gunModel[43].setRotationPoint(80.0F, -15.75F, -15.0F);
/*      */     
/*  389 */     this.gunModel[44].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  390 */     this.gunModel[44].setRotationPoint(80.0F, -28.75F, -15.0F);
/*      */     
/*  392 */     this.gunModel[45].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  393 */     this.gunModel[45].setRotationPoint(80.0F, -33.75F, -15.0F);
/*      */     
/*  395 */     this.gunModel[46].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 12, 0.0F, -0.5F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, -0.5F, 0.5F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  396 */     this.gunModel[46].setRotationPoint(80.0F, -34.75F, -13.0F);
/*      */     
/*  398 */     this.gunModel[47].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F);
/*  399 */     this.gunModel[47].setRotationPoint(82.0F, -16.25F, -11.5F);
/*      */     
/*  401 */     this.gunModel[48].addBox(59.0F, -19.0F, 7.0F, 20, 7, 7, 0.0F);
/*  402 */     this.gunModel[48].setRotationPoint(124.0F, -23.75F, -10.5F);
/*      */     
/*  404 */     this.gunModel[49].addShapeBox(59.0F, -19.0F, 7.0F, 18, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  405 */     this.gunModel[49].setRotationPoint(106.0F, -24.25F, -11.0F);
/*      */     
/*  407 */     this.gunModel[50].addShapeBox(59.0F, -19.0F, 7.0F, 14, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  408 */     this.gunModel[50].setRotationPoint(144.0F, -24.25F, -11.0F);
/*      */     
/*  410 */     this.gunModel[51].addShapeBox(59.0F, -19.0F, 7.0F, 4, 6, 8, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  411 */     this.gunModel[51].setRotationPoint(146.75F, -30.25F, -11.0F);
/*      */     
/*  413 */     this.gunModel[52].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  414 */     this.gunModel[52].setRotationPoint(155.25F, -30.25F, -11.0F);
/*      */     
/*  416 */     this.gunModel[53].addShapeBox(59.0F, -19.0F, 7.0F, 7, 5, 8, 0.0F, -2.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  417 */     this.gunModel[53].setRotationPoint(150.25F, -35.25F, -11.0F);
/*      */     
/*  419 */     this.gunModel[54].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/*  420 */     this.gunModel[54].setRotationPoint(152.25F, -37.75F, -11.0F);
/*      */     
/*  422 */     this.gunModel[55].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/*  423 */     this.gunModel[55].setRotationPoint(152.25F, -37.75F, -4.5F);
/*      */     
/*  425 */     this.gunModel[56].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  426 */     this.gunModel[56].setRotationPoint(152.25F, -37.75F, -7.5F);
/*      */     
/*  428 */     this.gunModel[57].addBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F);
/*  429 */     this.gunModel[57].setRotationPoint(82.0F, -32.25F, -11.5F);
/*      */     
/*  431 */     this.gunModel[58].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  432 */     this.gunModel[58].setRotationPoint(82.0F, -34.25F, -11.5F);
/*      */     
/*  434 */     this.gunModel[59].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  435 */     this.gunModel[59].setRotationPoint(82.0F, -28.25F, -11.5F);
/*      */     
/*  437 */     this.gunModel[60].addShapeBox(59.0F, -19.0F, 7.0F, 27, 7, 7, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  438 */     this.gunModel[60].setRotationPoint(85.0F, -34.25F, -10.5F);
/*      */     
/*  440 */     this.gunModel[61].addShapeBox(59.0F, -19.0F, 7.0F, 6, 2, 6, 0.0F, -1.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/*  441 */     this.gunModel[61].setRotationPoint(112.0F, -26.75F, -10.0F);
/*      */     
/*  443 */     this.gunModel[62].addShapeBox(59.0F, -19.0F, 7.0F, 6, 1, 6, 0.0F, 0.0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 1.25F, -0.75F, 0.25F, 1.0F, -0.75F, 0.25F, 1.0F, -0.75F, 0.25F, 1.25F, -0.75F, 0.25F);
/*  444 */     this.gunModel[62].setRotationPoint(112.0F, -24.75F, -10.0F);
/*      */     
/*  446 */     this.gunModel[63].addShapeBox(59.0F, -19.0F, 7.0F, 33, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  447 */     this.gunModel[63].setRotationPoint(85.0F, -14.75F, -8.5F);
/*      */     
/*  449 */     this.gunModel[64].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  450 */     this.gunModel[64].setRotationPoint(116.0F, -16.25F, -9.5F);
/*      */     
/*  452 */     this.gunModel[65].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  453 */     this.gunModel[65].setRotationPoint(122.0F, -14.75F, -8.5F);
/*      */     
/*  455 */     this.gunModel[66].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  456 */     this.gunModel[66].setRotationPoint(152.0F, -16.25F, -9.5F);
/*      */     
/*  458 */     this.gunModel[67].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F);
/*  459 */     this.gunModel[67].setRotationPoint(149.0F, -16.25F, -9.5F);
/*      */     
/*  461 */     this.gunModel[68].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/*  462 */     this.gunModel[68].setRotationPoint(146.0F, -16.25F, -9.5F);
/*      */     
/*  464 */     this.gunModel[69].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  465 */     this.gunModel[69].setRotationPoint(-35.5F, -0.75F, -11.0F);
/*      */     
/*  467 */     this.gunModel[70].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  468 */     this.gunModel[70].setRotationPoint(-35.5F, 1.25F, -11.0F);
/*      */     
/*  470 */     this.gunModel[71].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  471 */     this.gunModel[71].setRotationPoint(-35.5F, -7.75F, -15.0F);
/*      */     
/*  473 */     this.gunModel[72].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  474 */     this.gunModel[72].setRotationPoint(-29.5F, -0.75F, -9.0F);
/*      */     
/*  476 */     this.gunModel[73].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  477 */     this.gunModel[73].setRotationPoint(-30.0F, 1.25F, -9.0F);
/*      */     
/*  479 */     this.gunModel[74].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  480 */     this.gunModel[74].setRotationPoint(-30.0F, 2.25F, -9.0F);
/*      */     
/*  482 */     this.gunModel[75].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  483 */     this.gunModel[75].setRotationPoint(-28.0F, 3.25F, -9.0F);
/*      */     
/*  485 */     this.gunModel[76].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  486 */     this.gunModel[76].setRotationPoint(-28.0F, 4.25F, -9.0F);
/*      */     
/*  488 */     this.gunModel[77].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  489 */     this.gunModel[77].setRotationPoint(-28.0F, -6.75F, -9.0F);
/*      */     
/*  491 */     this.gunModel[78].addShapeBox(59.0F, -19.0F, 7.0F, 1, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  492 */     this.gunModel[78].setRotationPoint(-36.0F, -6.75F, -9.5F);
/*      */     
/*  494 */     this.gunModel[79].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  495 */     this.gunModel[79].setRotationPoint(-36.0F, 5.25F, -9.5F);
/*      */     
/*  497 */     this.gunModel[80].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 5, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  498 */     this.gunModel[80].setRotationPoint(-53.75F, 7.25F, -9.5F);
/*      */     
/*  500 */     this.gunModel[81].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  501 */     this.gunModel[81].setRotationPoint(-55.5F, 5.25F, -9.5F);
/*      */     
/*  503 */     this.gunModel[82].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  504 */     this.gunModel[82].setRotationPoint(-55.75F, 1.25F, -9.5F);
/*      */     
/*  506 */     this.gunModel[83].addShapeBox(59.0F, -19.0F, 7.0F, 28, 17, 16, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, 8.5F, -1.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 8.5F, -1.0F);
/*  507 */     this.gunModel[83].setRotationPoint(-114.5F, -21.25F, -15.0F);
/*      */     
/*  509 */     this.gunModel[84].addShapeBox(59.0F, -19.0F, 7.0F, 49, 11, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 8.5F, -1.0F, 0.0F, -8.5F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, 8.5F, -1.0F);
/*  510 */     this.gunModel[84].setRotationPoint(-163.5F, 1.75F, -14.0F);
/*      */     
/*  512 */     this.gunModel[85].addShapeBox(59.0F, -19.0F, 7.0F, 10, 4, 14, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F);
/*  513 */     this.gunModel[85].setRotationPoint(-124.5F, -20.25F, -14.0F);
/*      */     
/*  515 */     this.gunModel[86].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.2F, 0.0F, 1.0F, -0.2F, 0.0F, 1.0F, -0.25F);
/*  516 */     this.gunModel[86].setRotationPoint(-126.5F, -20.25F, -14.0F);
/*      */     
/*  518 */     this.gunModel[87].addShapeBox(59.0F, -19.0F, 7.0F, 42, 5, 14, 0.0F, 0.0F, -4.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -4.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F);
/*  519 */     this.gunModel[87].setRotationPoint(-168.5F, -20.25F, -14.0F);
/*      */     
/*  521 */     this.gunModel[88].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  522 */     this.gunModel[88].setRotationPoint(-172.5F, -17.25F, -13.0F);
/*      */     
/*  524 */     this.gunModel[89].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  525 */     this.gunModel[89].setRotationPoint(-172.5F, -13.25F, -13.0F);
/*      */     
/*  527 */     this.gunModel[90].addShapeBox(59.0F, -19.0F, 7.0F, 4, 13, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  528 */     this.gunModel[90].setRotationPoint(-172.5F, -9.25F, -13.0F);
/*      */     
/*  530 */     this.gunModel[91].addShapeBox(59.0F, -19.0F, 7.0F, 4, 17, 12, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  531 */     this.gunModel[91].setRotationPoint(-172.5F, 3.75F, -13.0F);
/*      */     
/*  533 */     this.gunModel[92].addShapeBox(59.0F, -19.0F, 7.0F, 4, 38, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F);
/*  534 */     this.gunModel[92].setRotationPoint(-168.0F, -15.25F, -13.0F);
/*      */     
/*  536 */     this.gunModel[93].addShapeBox(59.0F, -19.0F, 7.0F, 10, 1, 14, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F);
/*  537 */     this.gunModel[93].setRotationPoint(-124.5F, -16.25F, -14.0F);
/*      */     
/*  539 */     this.gunModel[94].addShapeBox(59.0F, -19.0F, 7.0F, 26, 5, 12, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  540 */     this.gunModel[94].setRotationPoint(-80.5F, -6.75F, -13.0F);
/*      */     
/*  542 */     this.gunModel[95].addShapeBox(59.0F, -19.0F, 7.0F, 24, 3, 12, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  543 */     this.gunModel[95].setRotationPoint(-79.5F, -1.75F, -13.0F);
/*      */     
/*  545 */     this.gunModel[96].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/*  546 */     this.gunModel[96].setRotationPoint(-79.5F, 1.25F, -13.0F);
/*      */     
/*  548 */     this.gunModel[97].addShapeBox(59.0F, -19.0F, 7.0F, 24, 1, 12, 0.0F, -1.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  549 */     this.gunModel[97].setRotationPoint(-79.5F, 3.25F, -13.0F);
/*      */     
/*  551 */     this.gunModel[98].addShapeBox(59.0F, -19.0F, 7.0F, 22, 1, 12, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/*  552 */     this.gunModel[98].setRotationPoint(-79.5F, 4.25F, -13.0F);
/*      */     
/*  554 */     this.gunModel[99].addShapeBox(59.0F, -19.0F, 7.0F, 22, 2, 12, 0.0F, -1.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  555 */     this.gunModel[99].setRotationPoint(-79.5F, 5.25F, -13.0F);
/*      */     
/*  557 */     this.gunModel[100].addShapeBox(59.0F, -19.0F, 7.0F, 22, 21, 12, 0.0F, -1.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 6.0F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, 6.0F, -0.25F, 0.0F);
/*  558 */     this.gunModel[100].setRotationPoint(-79.5F, 7.25F, -13.0F);
/*      */     
/*  560 */     this.gunModel[101].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  561 */     this.gunModel[101].setRotationPoint(-87.0F, 28.25F, -13.0F);
/*      */     
/*  563 */     this.gunModel[102].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F);
/*  564 */     this.gunModel[102].setRotationPoint(-87.0F, 30.25F, -13.0F);
/*      */     
/*  566 */     this.gunModel[103].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/*  567 */     this.gunModel[103].setRotationPoint(-87.0F, 32.25F, -13.0F);
/*      */     
/*  569 */     this.gunModel[104].addShapeBox(59.0F, -19.0F, 7.0F, 15, 1, 12, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/*  570 */     this.gunModel[104].setRotationPoint(-84.0F, 34.25F, -13.0F);
/*      */     
/*  572 */     this.gunModel[105].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  573 */     this.gunModel[105].setRotationPoint(-53.0F, -6.75F, -8.5F);
/*      */     
/*  575 */     this.gunModel[106].addShapeBox(59.0F, -19.0F, 7.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  576 */     this.gunModel[106].setRotationPoint(-53.0F, -5.75F, -8.5F);
/*      */     
/*  578 */     this.gunModel[107].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  579 */     this.gunModel[107].setRotationPoint(-52.75F, -4.75F, -8.5F);
/*      */     
/*  581 */     this.gunModel[108].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  582 */     this.gunModel[108].setRotationPoint(-52.75F, -3.75F, -8.5F);
/*      */     
/*  584 */     this.gunModel[109].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  585 */     this.gunModel[109].setRotationPoint(-52.75F, -2.75F, -8.5F);
/*      */     
/*  587 */     this.gunModel[110].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  588 */     this.gunModel[110].setRotationPoint(-52.75F, -1.75F, -8.5F);
/*      */     
/*  590 */     this.gunModel[111].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 3, 0.0F, -1.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/*  591 */     this.gunModel[111].setRotationPoint(-52.75F, 0.25F, -8.5F);
/*      */     
/*  593 */     this.gunModel[112].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 3, 0.0F, -2.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -5.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F);
/*  594 */     this.gunModel[112].setRotationPoint(-51.75F, 3.25F, -8.5F);
/*      */     
/*  596 */     this.gunModel[113].addShapeBox(59.0F, -19.0F, 7.0F, 83, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  597 */     this.gunModel[113].setRotationPoint(-86.5F, -21.75F, 1.0F);
/*      */     
/*  599 */     this.gunModel[114].addShapeBox(59.0F, -19.0F, 7.0F, 83, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  600 */     this.gunModel[114].setRotationPoint(-86.5F, -24.75F, 1.0F);
/*      */     
/*  602 */     this.gunModel[115].addShapeBox(59.0F, -19.0F, 7.0F, 23, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  603 */     this.gunModel[115].setRotationPoint(-3.5F, -24.75F, 0.0F);
/*      */     
/*  605 */     this.gunModel[116].addShapeBox(59.0F, -19.0F, 7.0F, 28, 3, 17, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  606 */     this.gunModel[116].setRotationPoint(-86.5F, -24.75F, -16.0F);
/*      */     
/*  608 */     this.gunModel[117].addShapeBox(59.0F, -19.0F, 7.0F, 27, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  609 */     this.gunModel[117].setRotationPoint(-86.5F, -21.75F, -16.0F);
/*      */     
/*  611 */     this.gunModel[118].addShapeBox(59.0F, -19.0F, 7.0F, 103, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  612 */     this.gunModel[118].setRotationPoint(-83.5F, -26.75F, 0.0F);
/*      */     
/*  614 */     this.gunModel[119].addShapeBox(59.0F, -19.0F, 7.0F, 59, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  615 */     this.gunModel[119].setRotationPoint(-83.5F, -26.75F, -16.0F);
/*      */     
/*  617 */     this.gunModel[120].addShapeBox(59.0F, -19.0F, 7.0F, 14, 2, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  618 */     this.gunModel[120].setRotationPoint(-83.5F, -26.75F, -14.0F);
/*      */     
/*  620 */     this.gunModel[121].addShapeBox(59.0F, -19.0F, 7.0F, 92, 5, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  621 */     this.gunModel[121].setRotationPoint(-81.5F, -31.75F, -3.0F);
/*      */     
/*  623 */     this.gunModel[122].addShapeBox(59.0F, -19.0F, 7.0F, 56, 5, 3, 0.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  624 */     this.gunModel[122].setRotationPoint(-81.5F, -31.75F, -14.0F);
/*      */     
/*  626 */     this.gunModel[123].addShapeBox(59.0F, -19.0F, 7.0F, 12, 5, 8, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  627 */     this.gunModel[123].setRotationPoint(-81.5F, -31.75F, -11.0F);
/*      */     
/*  629 */     this.gunModel[124].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  630 */     this.gunModel[124].setRotationPoint(-77.5F, -34.75F, -5.0F);
/*      */     
/*  632 */     this.gunModel[125].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  633 */     this.gunModel[125].setRotationPoint(-77.5F, -34.75F, -12.0F);
/*      */     
/*  635 */     this.gunModel[126].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 4, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  636 */     this.gunModel[126].setRotationPoint(-77.5F, -34.75F, -9.0F);
/*      */     
/*  638 */     this.gunModel[127].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  639 */     this.gunModel[127].setRotationPoint(-74.5F, -35.75F, -9.0F);
/*      */     
/*  641 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  642 */     this.gunModel[''].setRotationPoint(-74.5F, -35.75F, -7.0F);
/*      */     
/*  644 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 10, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  645 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -13.0F);
/*      */     
/*  647 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  648 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -1.0F);
/*      */     
/*  650 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 5, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  651 */     this.gunModel[''].setRotationPoint(14.5F, -29.25F, -1.0F);
/*      */     
/*  653 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 35, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  654 */     this.gunModel[''].setRotationPoint(-59.5F, -24.75F, -15.0F);
/*      */     
/*  656 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  657 */     this.gunModel[''].setRotationPoint(-57.5F, -24.75F, -17.0F);
/*      */     
/*  659 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -17.0F);
/*      */     
/*  662 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  663 */     this.gunModel[''].setRotationPoint(-67.5F, -14.75F, -15.75F);
/*      */     
/*  665 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  666 */     this.gunModel[''].setRotationPoint(-64.5F, -17.75F, -15.75F);
/*      */     
/*  668 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  669 */     this.gunModel[''].setRotationPoint(-67.5F, -17.75F, -15.75F);
/*      */     
/*  671 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  672 */     this.gunModel[''].setRotationPoint(-67.5F, -11.75F, -15.75F);
/*      */     
/*  674 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  675 */     this.gunModel[''].setRotationPoint(-64.5F, -11.75F, -15.75F);
/*      */     
/*  677 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  678 */     this.gunModel[''].setRotationPoint(-61.5F, -11.75F, -15.75F);
/*      */     
/*  680 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  681 */     this.gunModel[''].setRotationPoint(-61.5F, -14.75F, -15.75F);
/*      */     
/*  683 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 21, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  684 */     this.gunModel[''].setRotationPoint(-58.5F, -16.75F, -15.75F);
/*      */     
/*  686 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  687 */     this.gunModel[''].setRotationPoint(-61.5F, -17.75F, -15.75F);
/*      */     
/*  689 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  690 */     this.gunModel[''].setRotationPoint(-65.0F, -14.25F, -16.0F);
/*      */     
/*  692 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  693 */     this.gunModel[''].setRotationPoint(-65.0F, -15.25F, -16.0F);
/*      */     
/*  695 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  696 */     this.gunModel[''].setRotationPoint(-65.0F, -12.75F, -16.0F);
/*      */     
/*  698 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  699 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -15.0F);
/*      */     
/*  701 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 8, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  702 */     this.gunModel[''].setRotationPoint(14.5F, -29.25F, -15.0F);
/*      */     
/*  704 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, -1.2F, 1.0F, 0.0F, -1.2F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  705 */     this.gunModel[''].setRotationPoint(-25.5F, -29.75F, -14.0F);
/*      */     
/*  707 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  708 */     this.gunModel[''].setRotationPoint(-25.5F, -31.75F, -13.0F);
/*      */     
/*  710 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 57, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  711 */     this.gunModel[''].setRotationPoint(-81.5F, -26.75F, -14.0F);
/*      */     
/*  713 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  714 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -16.0F);
/*      */     
/*  716 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/*  717 */     this.gunModel[''].setRotationPoint(33.5F, -35.75F, -14.0F);
/*      */     
/*  719 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  720 */     this.gunModel[''].setRotationPoint(33.5F, -37.75F, -14.0F);
/*      */     
/*  722 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  723 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -14.0F);
/*      */     
/*  725 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  726 */     this.gunModel[''].setRotationPoint(38.5F, -37.75F, -14.0F);
/*      */     
/*  728 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  729 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -1.0F);
/*      */     
/*  731 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  732 */     this.gunModel[''].setRotationPoint(38.5F, -37.75F, -1.0F);
/*      */     
/*  734 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  735 */     this.gunModel[''].setRotationPoint(28.5F, -37.75F, -3.0F);
/*      */     
/*  737 */     this.gunModel[' '].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/*  738 */     this.gunModel[' '].setRotationPoint(23.5F, -37.75F, -2.0F);
/*      */     
/*  740 */     this.gunModel['¡'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  741 */     this.gunModel['¡'].setRotationPoint(27.5F, -37.75F, -3.0F);
/*      */     
/*  743 */     this.gunModel['¢'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  744 */     this.gunModel['¢'].setRotationPoint(28.5F, -37.75F, -13.0F);
/*      */     
/*  746 */     this.gunModel['£'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/*  747 */     this.gunModel['£'].setRotationPoint(23.5F, -37.75F, -13.0F);
/*      */     
/*  749 */     this.gunModel['¤'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  750 */     this.gunModel['¤'].setRotationPoint(27.5F, -37.75F, -12.0F);
/*      */     
/*  752 */     this.gunModel['¥'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  753 */     this.gunModel['¥'].setRotationPoint(29.0F, -38.75F, -3.0F);
/*      */     
/*  755 */     this.gunModel['¦'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  756 */     this.gunModel['¦'].setRotationPoint(29.0F, -38.75F, -13.0F);
/*      */     
/*  758 */     this.gunModel['§'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  759 */     this.gunModel['§'].setRotationPoint(13.0F, -37.75F, -4.0F);
/*      */     
/*  761 */     this.gunModel['¨'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  762 */     this.gunModel['¨'].setRotationPoint(13.0F, -36.75F, -4.0F);
/*      */     
/*  764 */     this.gunModel['©'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  765 */     this.gunModel['©'].setRotationPoint(13.0F, -35.75F, -1.0F);
/*      */     
/*  767 */     this.gunModel['ª'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  768 */     this.gunModel['ª'].setRotationPoint(13.0F, -37.75F, -15.0F);
/*      */     
/*  770 */     this.gunModel['«'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  771 */     this.gunModel['«'].setRotationPoint(13.0F, -36.75F, -15.0F);
/*      */     
/*  773 */     this.gunModel['¬'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  774 */     this.gunModel['¬'].setRotationPoint(13.0F, -35.75F, -15.0F);
/*      */     
/*  776 */     this.gunModel['­'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  777 */     this.gunModel['­'].setRotationPoint(13.5F, -37.75F, -11.0F);
/*      */     
/*  779 */     this.gunModel['®'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  780 */     this.gunModel['®'].setRotationPoint(13.5F, -37.75F, -6.0F);
/*      */     
/*  782 */     this.gunModel['¯'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  783 */     this.gunModel['¯'].setRotationPoint(33.5F, -37.75F, -6.0F);
/*      */     
/*  785 */     this.gunModel['°'].addShapeBox(59.0F, -19.0F, 7.0F, 23, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  786 */     this.gunModel['°'].setRotationPoint(13.5F, -37.75F, -8.0F);
/*      */     
/*  788 */     this.gunModel['±'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/*  789 */     this.gunModel['±'].setRotationPoint(33.5F, -35.75F, -1.0F);
/*      */     
/*  791 */     this.gunModel['²'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  792 */     this.gunModel['²'].setRotationPoint(-6.5F, -31.75F, -3.0F);
/*      */     
/*  794 */     this.gunModel['³'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  795 */     this.gunModel['³'].setRotationPoint(-6.5F, -34.75F, -4.5F);
/*      */     
/*  797 */     this.gunModel['´'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  798 */     this.gunModel['´'].setRotationPoint(-6.5F, -35.75F, -7.0F);
/*      */     
/*  800 */     this.gunModel['µ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  801 */     this.gunModel['µ'].setRotationPoint(-6.5F, -35.75F, -9.0F);
/*      */     
/*  803 */     this.gunModel['¶'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  804 */     this.gunModel['¶'].setRotationPoint(-6.5F, -34.75F, -12.5F);
/*      */     
/*  806 */     this.gunModel['·'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  807 */     this.gunModel['·'].setRotationPoint(-31.5F, -31.75F, -3.0F);
/*      */     
/*  809 */     this.gunModel['¸'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  810 */     this.gunModel['¸'].setRotationPoint(-31.5F, -34.75F, -4.5F);
/*      */     
/*  812 */     this.gunModel['¹'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  813 */     this.gunModel['¹'].setRotationPoint(-31.5F, -35.75F, -7.0F);
/*      */     
/*  815 */     this.gunModel['º'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  816 */     this.gunModel['º'].setRotationPoint(-31.5F, -35.75F, -9.0F);
/*      */     
/*  818 */     this.gunModel['»'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  819 */     this.gunModel['»'].setRotationPoint(-31.5F, -34.75F, -12.5F);
/*      */     
/*  821 */     this.gunModel['¼'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  822 */     this.gunModel['¼'].setRotationPoint(-59.5F, -31.75F, -3.0F);
/*      */     
/*  824 */     this.gunModel['½'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  825 */     this.gunModel['½'].setRotationPoint(-59.5F, -34.75F, -4.5F);
/*      */     
/*  827 */     this.gunModel['¾'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  828 */     this.gunModel['¾'].setRotationPoint(-59.5F, -35.75F, -7.0F);
/*      */     
/*  830 */     this.gunModel['¿'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  831 */     this.gunModel['¿'].setRotationPoint(-59.5F, -35.75F, -9.0F);
/*      */     
/*  833 */     this.gunModel['À'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  834 */     this.gunModel['À'].setRotationPoint(-59.5F, -34.75F, -12.5F);
/*      */     
/*  836 */     this.gunModel['Á'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  837 */     this.gunModel['Á'].setRotationPoint(-31.5F, -31.75F, -14.0F);
/*      */     
/*  839 */     this.gunModel['Â'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  840 */     this.gunModel['Â'].setRotationPoint(-59.5F, -31.75F, -14.0F);
/*      */     
/*  842 */     this.gunModel['Ã'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 3, 4, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  843 */     this.gunModel['Ã'].setRotationPoint(-84.0F, -29.75F, -9.0F);
/*      */     
/*  845 */     this.gunModel['Ä'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  846 */     this.gunModel['Ä'].setRotationPoint(-79.5F, -16.75F, 0.5F);
/*      */     
/*  848 */     this.gunModel['Å'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  849 */     this.gunModel['Å'].setRotationPoint(-45.5F, -12.75F, 0.5F);
/*      */     
/*  851 */     this.gunModel['Æ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  852 */     this.gunModel['Æ'].setRotationPoint(-28.5F, -12.75F, 0.5F);
/*      */     
/*  854 */     this.gunModel['Ç'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  855 */     this.gunModel['Ç'].setRotationPoint(-15.5F, -18.75F, 0.5F);
/*      */     
/*  857 */     this.gunModel['È'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  858 */     this.gunModel['È'].setRotationPoint(-77.5F, -16.75F, -15.5F);
/*      */     
/*  860 */     this.gunModel['É'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  861 */     this.gunModel['É'].setRotationPoint(-67.5F, -8.75F, -15.5F);
/*      */     
/*  863 */     this.gunModel['Ê'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  864 */     this.gunModel['Ê'].setRotationPoint(-33.5F, -12.75F, -15.5F);
/*      */     
/*  866 */     this.gunModel['Ë'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  867 */     this.gunModel['Ë'].setRotationPoint(-33.5F, -17.75F, -15.5F);
/*      */     
/*  869 */     this.gunModel['Ì'].addShapeBox(59.0F, -19.0F, 7.0F, 18, 4, 1, 0.0F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  870 */     this.gunModel['Ì'].setRotationPoint(-55.5F, -20.75F, -16.0F);
/*      */     
/*  872 */     this.gunModel['Í'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, -2.0F, -0.5F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  873 */     this.gunModel['Í'].setRotationPoint(-37.5F, -20.75F, -16.0F);
/*      */     
/*  875 */     this.gunModel['Î'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  876 */     this.gunModel['Î'].setRotationPoint(75.5F, -25.75F, -15.0F);
/*      */     
/*  878 */     this.gunModel['Ï'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  879 */     this.gunModel['Ï'].setRotationPoint(75.5F, -25.75F, -1.0F);
/*      */     
/*  881 */     this.gunModel['Ð'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -3.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  882 */     this.gunModel['Ð'].setRotationPoint(73.0F, -25.75F, -1.0F);
/*      */     
/*  884 */     this.gunModel['Ñ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  885 */     this.gunModel['Ñ'].setRotationPoint(70.5F, -25.75F, -1.0F);
/*      */     
/*  887 */     this.gunModel['Ò'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F, -0.5F, -6.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  888 */     this.gunModel['Ò'].setRotationPoint(64.0F, -25.75F, -1.0F);
/*      */     
/*  890 */     this.gunModel['Ó'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, -0.5F, -6.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  891 */     this.gunModel['Ó'].setRotationPoint(56.5F, -25.75F, -1.0F);
/*      */     
/*  893 */     this.gunModel['Ô'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 10, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  894 */     this.gunModel['Ô'].setRotationPoint(49.0F, -25.75F, -1.0F);
/*      */     
/*  896 */     this.gunModel['Õ'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  897 */     this.gunModel['Õ'].setRotationPoint(45.5F, -25.75F, -1.0F);
/*      */     
/*  899 */     this.gunModel['Ö'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  900 */     this.gunModel['Ö'].setRotationPoint(151.25F, -30.25F, -10.0F);
/*      */     
/*  902 */     this.gunModel['×'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.35F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.35F, -0.25F, 0.0F);
/*  903 */     this.gunModel['×'].setRotationPoint(148.25F, -26.25F, -10.0F);
/*      */     
/*  905 */     this.gunModel['Ø'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  906 */     this.gunModel['Ø'].setRotationPoint(153.25F, -28.25F, -10.0F);
/*      */     
/*  908 */     this.gunModel['Ù'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  909 */     this.gunModel['Ù'].setRotationPoint(149.25F, -28.25F, -10.0F);
/*      */     
/*  911 */     this.gunModel['Ú'].addShapeBox(59.0F, -19.0F, 7.0F, 15, 8, 8, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F);
/*  912 */     this.gunModel['Ú'].setRotationPoint(158.0F, -24.25F, -11.0F);
/*      */     
/*  914 */     this.gunModel['Û'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 8, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F);
/*  915 */     this.gunModel['Û'].setRotationPoint(176.0F, -24.25F, -11.0F);
/*      */     
/*  917 */     this.gunModel['Ü'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 8, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F);
/*  918 */     this.gunModel['Ü'].setRotationPoint(173.0F, -24.25F, -11.0F);
/*      */     
/*  920 */     this.gunModel['Ý'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 8, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F);
/*  921 */     this.gunModel['Ý'].setRotationPoint(173.0F, -19.25F, -11.0F);
/*      */     
/*  923 */     this.gunModel['Þ'].addBox(59.0F, -19.0F, 7.0F, 3, 7, 7, 0.0F);
/*  924 */     this.gunModel['Þ'].setRotationPoint(178.5F, -23.75F, -10.5F);
/*      */     
/*  926 */     this.gunModel['ß'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 10, 2, 0.0F, -0.5F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  927 */     this.gunModel['ß'].setRotationPoint(73.0F, -25.75F, -15.0F);
/*      */     
/*  929 */     this.gunModel['à'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 10, 2, 0.0F, -0.5F, -5.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  930 */     this.gunModel['à'].setRotationPoint(70.5F, -25.75F, -15.0F);
/*      */     
/*  932 */     this.gunModel['á'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 10, 2, 0.0F, -0.5F, -6.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  933 */     this.gunModel['á'].setRotationPoint(64.0F, -25.75F, -15.0F);
/*      */     
/*  935 */     this.gunModel['â'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 10, 2, 0.0F, -0.5F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  936 */     this.gunModel['â'].setRotationPoint(56.5F, -25.75F, -15.0F);
/*      */     
/*  938 */     this.gunModel['ã'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 10, 2, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/*  939 */     this.gunModel['ã'].setRotationPoint(49.0F, -25.75F, -15.0F);
/*      */     
/*  941 */     this.gunModel['ä'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 10, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  942 */     this.gunModel['ä'].setRotationPoint(45.5F, -25.75F, -15.0F);
/*      */     
/*  944 */     this.gunModel['å'].addShapeBox(59.0F, -19.0F, 7.0F, 11, 7, 7, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/*  945 */     this.gunModel['å'].setRotationPoint(105.0F, -34.25F, -10.5F);
/*      */     
/*  947 */     this.gunModel['æ'].addShapeBox(59.0F, -19.0F, 7.0F, 49, 8, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  948 */     this.gunModel['æ'].setRotationPoint(-163.5F, -15.25F, -14.0F);
/*      */     
/*  950 */     this.gunModel['ç'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 9, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F);
/*  951 */     this.gunModel['ç'].setRotationPoint(-163.5F, -7.25F, -14.0F);
/*      */     
/*  953 */     this.gunModel['è'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 9, 14, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F);
/*  954 */     this.gunModel['è'].setRotationPoint(-123.5F, -7.25F, -14.0F);
/*      */     
/*  956 */     this.gunModel['é'].addShapeBox(59.0F, -19.0F, 7.0F, 34, 9, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  957 */     this.gunModel['é'].setRotationPoint(-157.5F, -7.25F, -13.0F);
/*      */     
/*      */ 
/*  960 */     this.ammoModel = new ModelRendererTurbo[24];
/*  961 */     this.ammoModel[0] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/*  962 */     this.ammoModel[1] = new ModelRendererTurbo(this, 73, 273, this.textureX, this.textureY);
/*  963 */     this.ammoModel[2] = new ModelRendererTurbo(this, 201, 273, this.textureX, this.textureY);
/*  964 */     this.ammoModel[3] = new ModelRendererTurbo(this, 273, 273, this.textureX, this.textureY);
/*  965 */     this.ammoModel[4] = new ModelRendererTurbo(this, 137, 281, this.textureX, this.textureY);
/*  966 */     this.ammoModel[5] = new ModelRendererTurbo(this, 417, 281, this.textureX, this.textureY);
/*  967 */     this.ammoModel[6] = new ModelRendererTurbo(this, 337, 289, this.textureX, this.textureY);
/*  968 */     this.ammoModel[7] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/*  969 */     this.ammoModel[8] = new ModelRendererTurbo(this, 73, 297, this.textureX, this.textureY);
/*  970 */     this.ammoModel[9] = new ModelRendererTurbo(this, 201, 297, this.textureX, this.textureY);
/*  971 */     this.ammoModel[10] = new ModelRendererTurbo(this, 273, 297, this.textureX, this.textureY);
/*  972 */     this.ammoModel[11] = new ModelRendererTurbo(this, 137, 305, this.textureX, this.textureY);
/*  973 */     this.ammoModel[12] = new ModelRendererTurbo(this, 25, 321, this.textureX, this.textureY);
/*  974 */     this.ammoModel[13] = new ModelRendererTurbo(this, 169, 321, this.textureX, this.textureY);
/*  975 */     this.ammoModel[14] = new ModelRendererTurbo(this, 241, 321, this.textureX, this.textureY);
/*  976 */     this.ammoModel[15] = new ModelRendererTurbo(this, 441, 321, this.textureX, this.textureY);
/*  977 */     this.ammoModel[16] = new ModelRendererTurbo(this, 81, 329, this.textureX, this.textureY);
/*  978 */     this.ammoModel[17] = new ModelRendererTurbo(this, 305, 329, this.textureX, this.textureY);
/*  979 */     this.ammoModel[18] = new ModelRendererTurbo(this, 369, 329, this.textureX, this.textureY);
/*  980 */     this.ammoModel[19] = new ModelRendererTurbo(this, 1, 337, this.textureX, this.textureY);
/*  981 */     this.ammoModel[20] = new ModelRendererTurbo(this, 145, 337, this.textureX, this.textureY);
/*  982 */     this.ammoModel[21] = new ModelRendererTurbo(this, 209, 337, this.textureX, this.textureY);
/*  983 */     this.ammoModel[22] = new ModelRendererTurbo(this, 265, 337, this.textureX, this.textureY);
/*  984 */     this.ammoModel[23] = new ModelRendererTurbo(this, 57, 345, this.textureX, this.textureY);
/*      */     
/*  986 */     this.ammoModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 22, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  987 */     this.ammoModel[0].setRotationPoint(-25.5F, -11.75F, -13.0F);
/*      */     
/*  989 */     this.ammoModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 23, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  990 */     this.ammoModel[1].setRotationPoint(-25.5F, -7.75F, -12.5F);
/*      */     
/*  992 */     this.ammoModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  993 */     this.ammoModel[2].setRotationPoint(-25.5F, -1.75F, -12.5F);
/*      */     
/*  995 */     this.ammoModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  996 */     this.ammoModel[3].setRotationPoint(-24.0F, 4.25F, -12.5F);
/*      */     
/*  998 */     this.ammoModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  999 */     this.ammoModel[4].setRotationPoint(-22.0F, 10.25F, -12.5F);
/*      */     
/* 1001 */     this.ammoModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1002 */     this.ammoModel[5].setRotationPoint(-20.0F, 16.25F, -12.5F);
/*      */     
/* 1004 */     this.ammoModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 23, 6, 11, 0.0F, 2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1005 */     this.ammoModel[6].setRotationPoint(-17.0F, 22.25F, -12.5F);
/*      */     
/* 1007 */     this.ammoModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, 2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1008 */     this.ammoModel[7].setRotationPoint(-15.0F, 28.25F, -12.5F);
/*      */     
/* 1010 */     this.ammoModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1011 */     this.ammoModel[8].setRotationPoint(-12.0F, 34.25F, -12.5F);
/*      */     
/* 1013 */     this.ammoModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 11, 0.0F, 5.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1014 */     this.ammoModel[9].setRotationPoint(-8.0F, 40.25F, -12.5F);
/*      */     
/* 1016 */     this.ammoModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 19, 6, 11, 0.0F, 6.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -6.75F, 0.0F, 0.0F, -6.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 1017 */     this.ammoModel[10].setRotationPoint(-3.5F, 46.25F, -12.5F);
/*      */     
/* 1019 */     this.ammoModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 5, 6, 11, 0.0F, 8.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F);
/* 1020 */     this.ammoModel[11].setRotationPoint(2.0F, 52.25F, -12.5F);
/*      */     
/* 1022 */     this.ammoModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1023 */     this.ammoModel[12].setRotationPoint(-22.5F, -7.75F, -10.5F);
/*      */     
/* 1025 */     this.ammoModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 7, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1026 */     this.ammoModel[13].setRotationPoint(-22.5F, -1.75F, -10.5F);
/*      */     
/* 1028 */     this.ammoModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 7, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1029 */     this.ammoModel[14].setRotationPoint(-21.0F, 4.25F, -10.5F);
/*      */     
/* 1031 */     this.ammoModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 7, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1032 */     this.ammoModel[15].setRotationPoint(-19.0F, 10.25F, -10.5F);
/*      */     
/* 1034 */     this.ammoModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 7, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1035 */     this.ammoModel[16].setRotationPoint(-17.0F, 16.25F, -10.5F);
/*      */     
/* 1037 */     this.ammoModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 7, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1038 */     this.ammoModel[17].setRotationPoint(-14.0F, 22.25F, -10.5F);
/*      */     
/* 1040 */     this.ammoModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 25, 6, 7, 0.0F, 2.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1041 */     this.ammoModel[18].setRotationPoint(-12.0F, 28.25F, -10.5F);
/*      */     
/* 1043 */     this.ammoModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 23, 6, 7, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1044 */     this.ammoModel[19].setRotationPoint(-7.0F, 34.25F, -10.5F);
/*      */     
/* 1046 */     this.ammoModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 24, 6, 7, 0.0F, 4.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/* 1047 */     this.ammoModel[20].setRotationPoint(-4.0F, 40.25F, -10.5F);
/*      */     
/* 1049 */     this.ammoModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 19, 6, 7, 0.0F, 6.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 6.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -6.75F, 0.0F, 0.0F, -6.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1050 */     this.ammoModel[21].setRotationPoint(0.5F, 46.25F, -10.5F);
/*      */     
/* 1052 */     this.ammoModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 5, 6, 7, 0.0F, 10.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 10.75F, 0.0F, 0.0F, 7.25F, 0.75F, 0.0F, -7.5F, 0.75F, 0.0F, -7.5F, 0.75F, 0.0F, 7.25F, 0.75F, 0.0F);
/* 1053 */     this.ammoModel[22].setRotationPoint(6.0F, 52.25F, -10.5F);
/*      */     
/* 1055 */     this.ammoModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 23, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1056 */     this.ammoModel[23].setRotationPoint(-21.5F, -11.75F, -11.5F);
/*      */     
/*      */ 
/* 1059 */     this.slideModel = new ModelRendererTurbo[9];
/* 1060 */     this.slideModel[0] = new ModelRendererTurbo(this, 145, 257, this.textureX, this.textureY);
/* 1061 */     this.slideModel[1] = new ModelRendererTurbo(this, 217, 257, this.textureX, this.textureY);
/* 1062 */     this.slideModel[2] = new ModelRendererTurbo(this, 281, 257, this.textureX, this.textureY);
/* 1063 */     this.slideModel[3] = new ModelRendererTurbo(this, 361, 265, this.textureX, this.textureY);
/* 1064 */     this.slideModel[4] = new ModelRendererTurbo(this, 433, 265, this.textureX, this.textureY);
/* 1065 */     this.slideModel[5] = new ModelRendererTurbo(this, 81, 209, this.textureX, this.textureY);
/* 1066 */     this.slideModel[6] = new ModelRendererTurbo(this, 105, 129, this.textureX, this.textureY);
/* 1067 */     this.slideModel[7] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/* 1068 */     this.slideModel[8] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*      */     
/* 1070 */     this.slideModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 17, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1071 */     this.slideModel[0].setRotationPoint(-24.5F, -24.75F, -14.0F);
/*      */     
/* 1073 */     this.slideModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1074 */     this.slideModel[1].setRotationPoint(-24.5F, -25.75F, -13.0F);
/*      */     
/* 1076 */     this.slideModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 35, 5, 9, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1077 */     this.slideModel[2].setRotationPoint(-24.5F, -30.75F, -12.0F);
/*      */     
/* 1079 */     this.slideModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 18, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1080 */     this.slideModel[3].setRotationPoint(-7.5F, -24.75F, -14.0F);
/*      */     
/* 1082 */     this.slideModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1083 */     this.slideModel[4].setRotationPoint(-7.5F, -25.75F, -13.0F);
/*      */     
/* 1085 */     this.slideModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 12, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1086 */     this.slideModel[5].setRotationPoint(7.5F, -25.75F, -20.0F);
/*      */     
/* 1088 */     this.slideModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1089 */     this.slideModel[6].setRotationPoint(8.5F, -25.75F, -15.0F);
/*      */     
/* 1091 */     this.slideModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1092 */     this.slideModel[7].setRotationPoint(8.5F, -25.75F, -16.0F);
/*      */     
/* 1094 */     this.slideModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1095 */     this.slideModel[8].setRotationPoint(8.5F, -25.75F, -18.0F);
/*      */     
/*      */ 
/*      */ 
/* 1099 */     this.gripAttachPoint = new Vector3f(7.0625F, 2.6875F, 0.0F);
/*      */     
/*      */ 
/* 1102 */     translateAll(0.0F, -32.75F, 0.0F);
/* 1103 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/* 1105 */     this.gunSlideDistance = 0.75F;
/* 1106 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/* 1109 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelak74.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */