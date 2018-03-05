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
/*      */ public class Modelxm8
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelxm8()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ȼ'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 185, 65, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 113, 81, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 417, 89, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 169, 97, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 113, 105, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 393, 97, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 153, 105, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 233, 105, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 265, 105, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 481, 105, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 113, 121, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 105, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 121, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 113, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 121, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 121, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 121, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 129, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 129, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 137, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 137, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 137, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 137, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 137, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 137, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 145, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 145, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 201, 145, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 241, 145, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 385, 145, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 161, 153, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 185, 153, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 217, 153, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 257, 153, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 361, 153, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 401, 153, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 433, 153, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 473, 153, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 129, 161, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 201, 161, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 233, 161, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 273, 161, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 297, 161, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 321, 161, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 345, 161, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 377, 161, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 417, 161, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 449, 161, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 489, 161, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 25, 169, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 49, 169, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 73, 169, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 97, 169, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 145, 169, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 169, 169, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 217, 169, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 249, 169, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 361, 169, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 393, 169, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 465, 169, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 113, 177, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 185, 177, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 233, 177, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 265, 177, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 289, 177, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 313, 177, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 337, 177, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 377, 177, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 409, 177, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 449, 177, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 481, 177, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 25, 185, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 49, 185, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 73, 185, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 97, 185, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 129, 185, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 153, 185, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 201, 185, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 249, 185, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 353, 185, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 393, 185, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 425, 185, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 465, 185, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 113, 193, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 169, 193, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 217, 193, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 265, 193, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 289, 193, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 313, 193, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 337, 193, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 369, 193, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 409, 193, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 441, 193, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 481, 193, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 25, 201, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 49, 201, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 73, 201, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 97, 201, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 129, 201, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 153, 201, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 185, 201, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 233, 201, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 353, 201, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 385, 201, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 425, 201, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 457, 201, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 113, 209, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 169, 209, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 201, 209, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 249, 209, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 273, 209, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 297, 209, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 321, 209, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 369, 209, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 401, 209, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 441, 209, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 473, 209, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 1, 217, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 25, 217, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 49, 217, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 73, 217, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 97, 217, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 129, 217, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 153, 217, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 185, 217, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 217, 217, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 337, 217, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 385, 217, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 417, 217, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 457, 217, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 489, 217, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 113, 225, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 169, 225, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 201, 225, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 233, 225, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 257, 225, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 281, 225, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 305, 225, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 353, 225, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 401, 225, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 433, 225, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 473, 225, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 25, 233, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 49, 233, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 73, 233, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 97, 241, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 217, 233, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 321, 233, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 369, 233, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 417, 233, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 449, 233, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 489, 233, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 193, 241, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 233, 241, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 257, 241, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 281, 241, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 305, 241, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 337, 241, this.textureX, this.textureY);
/*  326 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 385, 241, this.textureX, this.textureY);
/*  327 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 433, 241, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 465, 241, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 57, 249, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 81, 249, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 209, 249, this.textureX, this.textureY);
/*  333 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 353, 249, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 321, 249, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 401, 249, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 449, 249, this.textureX, this.textureY);
/*  338 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 481, 249, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 97, 257, this.textureX, this.textureY);
/*  340 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 121, 257, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 145, 257, this.textureX, this.textureY);
/*  342 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 169, 257, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 185, 265, this.textureX, this.textureY);
/*  344 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 305, 257, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 337, 257, this.textureX, this.textureY);
/*  346 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 385, 257, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 425, 257, this.textureX, this.textureY);
/*  348 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 465, 257, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/*  350 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 25, 265, this.textureX, this.textureY);
/*  351 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 49, 265, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 73, 265, this.textureX, this.textureY);
/*  353 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 321, 265, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 353, 265, this.textureX, this.textureY);
/*  355 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 401, 265, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 441, 265, this.textureX, this.textureY);
/*  357 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 481, 265, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 89, 273, this.textureX, this.textureY);
/*  359 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 113, 273, this.textureX, this.textureY);
/*  360 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 137, 273, this.textureX, this.textureY);
/*  361 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 161, 273, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 305, 273, this.textureX, this.textureY);
/*  363 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 337, 273, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 369, 273, this.textureX, this.textureY);
/*  365 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 417, 273, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 457, 273, this.textureX, this.textureY);
/*  367 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 25, 281, this.textureX, this.textureY);
/*  369 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 49, 281, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 73, 281, this.textureX, this.textureY);
/*  371 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 177, 281, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 313, 281, this.textureX, this.textureY);
/*  373 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 345, 281, this.textureX, this.textureY);
/*  374 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 377, 281, this.textureX, this.textureY);
/*  375 */     this.gunModel['š'] = new ModelRendererTurbo(this, 401, 281, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 425, 281, this.textureX, this.textureY);
/*  377 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 465, 281, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 9, 289, this.textureX, this.textureY);
/*  379 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 489, 281, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 57, 289, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 89, 289, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 113, 289, this.textureX, this.textureY);
/*  383 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 137, 289, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 161, 289, this.textureX, this.textureY);
/*  385 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 289, 289, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 329, 289, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 361, 289, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 441, 289, this.textureX, this.textureY);
/*  389 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 25, 297, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 73, 297, this.textureX, this.textureY);
/*  391 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 177, 297, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 209, 297, this.textureX, this.textureY);
/*  393 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 241, 297, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 273, 297, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 305, 297, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 345, 297, this.textureX, this.textureY);
/*  397 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 377, 297, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 401, 297, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 425, 297, this.textureX, this.textureY);
/*  400 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 457, 297, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 481, 297, this.textureX, this.textureY);
/*  402 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 41, 305, this.textureX, this.textureY);
/*  404 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 89, 305, this.textureX, this.textureY);
/*  405 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 113, 305, this.textureX, this.textureY);
/*  406 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 137, 305, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 161, 305, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 193, 305, this.textureX, this.textureY);
/*  409 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 225, 305, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 257, 305, this.textureX, this.textureY);
/*  411 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 289, 305, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 321, 305, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/*  414 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 177, 153, this.textureX, this.textureY);
/*  418 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 289, 161, this.textureX, this.textureY);
/*  419 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 313, 161, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 337, 161, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 17, 169, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 41, 169, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 361, 305, this.textureX, this.textureY);
/*  424 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 441, 305, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  427 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 65, 169, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 17, 313, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 497, 129, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  431 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 57, 313, this.textureX, this.textureY);
/*  432 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 177, 313, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 89, 169, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 161, 169, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 281, 177, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 209, 313, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 241, 313, this.textureX, this.textureY);
/*  439 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 273, 313, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 305, 313, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 377, 313, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 345, 313, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 409, 313, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 457, 313, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 481, 313, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 33, 321, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 289, 105, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 329, 321, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 305, 177, this.textureX, this.textureY);
/*  454 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 329, 177, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 17, 185, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 65, 185, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 89, 185, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 145, 185, this.textureX, this.textureY);
/*  460 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 281, 193, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 305, 193, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 329, 193, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 113, 257, this.textureX, this.textureY);
/*  464 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 137, 257, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 161, 257, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 225, 329, this.textureX, this.textureY);
/*  467 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 1, 337, this.textureX, this.textureY);
/*  468 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 241, 337, this.textureX, this.textureY);
/*  469 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 145, 345, this.textureX, this.textureY);
/*  470 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 185, 345, this.textureX, this.textureY);
/*  471 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 265, 345, this.textureX, this.textureY);
/*  472 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 297, 345, this.textureX, this.textureY);
/*  473 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 329, 337, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 425, 313, this.textureX, this.textureY);
/*  475 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 257, 321, this.textureX, this.textureY);
/*  476 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 353, 337, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 33, 345, this.textureX, this.textureY);
/*  478 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 89, 345, this.textureX, this.textureY);
/*  479 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 217, 345, this.textureX, this.textureY);
/*  480 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 369, 345, this.textureX, this.textureY);
/*  481 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 401, 345, this.textureX, this.textureY);
/*  482 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 433, 345, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 465, 345, this.textureX, this.textureY);
/*  484 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 1, 353, this.textureX, this.textureY);
/*  486 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 57, 353, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 113, 353, this.textureX, this.textureY);
/*  488 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 241, 353, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 329, 353, this.textureX, this.textureY);
/*  490 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 353, 353, this.textureX, this.textureY);
/*  491 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 489, 353, this.textureX, this.textureY);
/*  492 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 17, 361, this.textureX, this.textureY);
/*  493 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 41, 361, this.textureX, this.textureY);
/*  494 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 73, 361, this.textureX, this.textureY);
/*  495 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 137, 361, this.textureX, this.textureY);
/*  496 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 161, 361, this.textureX, this.textureY);
/*  497 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 185, 361, this.textureX, this.textureY);
/*  498 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 265, 361, this.textureX, this.textureY);
/*  499 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  500 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  502 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  504 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 217, 361, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 297, 361, this.textureX, this.textureY);
/*  506 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 385, 345, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*  508 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 417, 345, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 449, 345, this.textureX, this.textureY);
/*  510 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 97, 361, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 113, 145, this.textureX, this.textureY);
/*  512 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 321, 369, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 433, 369, this.textureX, this.textureY);
/*  514 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 177, 369, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 1, 377, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 113, 369, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 249, 369, this.textureX, this.textureY);
/*  518 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 121, 385, this.textureX, this.textureY);
/*  519 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 193, 385, this.textureX, this.textureY);
/*  520 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 273, 385, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/*  525 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 145, 161, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 417, 361, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 273, 377, this.textureX, this.textureY);
/*  530 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 393, 385, this.textureX, this.textureY);
/*  531 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 433, 385, this.textureX, this.textureY);
/*  532 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 473, 385, this.textureX, this.textureY);
/*  533 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 1, 393, this.textureX, this.textureY);
/*  534 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 41, 393, this.textureX, this.textureY);
/*  535 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 273, 393, this.textureX, this.textureY);
/*  536 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 313, 393, this.textureX, this.textureY);
/*  537 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 361, 393, this.textureX, this.textureY);
/*  538 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 401, 393, this.textureX, this.textureY);
/*  539 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 81, 393, this.textureX, this.textureY);
/*  540 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 441, 393, this.textureX, this.textureY);
/*  541 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 1, 401, this.textureX, this.textureY);
/*  542 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 41, 401, this.textureX, this.textureY);
/*  543 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  544 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  545 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  546 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  547 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  548 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  549 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  550 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  551 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  552 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  553 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  554 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  555 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  556 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  557 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  558 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  559 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 73, 401, this.textureX, this.textureY);
/*  560 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 129, 401, this.textureX, this.textureY);
/*  561 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  562 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  563 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  564 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  565 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  566 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  567 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/*  568 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 185, 169, this.textureX, this.textureY);
/*  569 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 201, 177, this.textureX, this.textureY);
/*  570 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 169, 185, this.textureX, this.textureY);
/*  571 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 217, 185, this.textureX, this.textureY);
/*  572 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 129, 177, this.textureX, this.textureY);
/*  573 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  574 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  575 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  576 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*  577 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  578 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/*  579 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/*  580 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  581 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/*  582 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  583 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/*  584 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  585 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*  586 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  587 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*  588 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/*  589 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*  590 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 177, 393, this.textureX, this.textureY);
/*  591 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 473, 393, this.textureX, this.textureY);
/*  592 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 193, 401, this.textureX, this.textureY);
/*  593 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 217, 401, this.textureX, this.textureY);
/*      */     
/*  595 */     this.gunModel[0].addBox(23.0F, -14.0F, -4.0F, 12, 2, 7, 0.0F);
/*  596 */     this.gunModel[0].setRotationPoint(-7.5F, -4.0F, 0.5F);
/*      */     
/*  598 */     this.gunModel[1].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  599 */     this.gunModel[1].setRotationPoint(4.5F, -4.0F, 0.5F);
/*      */     
/*  601 */     this.gunModel[2].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  602 */     this.gunModel[2].setRotationPoint(5.5F, -4.0F, 0.5F);
/*      */     
/*  604 */     this.gunModel[3].addShapeBox(23.0F, -14.0F, -4.0F, 14, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[3].setRotationPoint(-7.5F, -2.0F, 0.5F);
/*      */     
/*  607 */     this.gunModel[4].addShapeBox(23.0F, -14.0F, -4.0F, 14, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.5F, -0.5F, -0.5F, -2.5F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[4].setRotationPoint(-7.5F, 0.0F, 0.5F);
/*      */     
/*  610 */     this.gunModel[5].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  611 */     this.gunModel[5].setRotationPoint(-6.75F, 1.25F, 0.25F);
/*      */     
/*  613 */     this.gunModel[6].addShapeBox(23.0F, -14.0F, -4.0F, 23, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  614 */     this.gunModel[6].setRotationPoint(-18.5F, -6.0F, 0.0F);
/*      */     
/*  616 */     this.gunModel[7].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  617 */     this.gunModel[7].setRotationPoint(4.5F, -6.0F, 0.0F);
/*      */     
/*  619 */     this.gunModel[8].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  620 */     this.gunModel[8].setRotationPoint(5.5F, -5.0F, 0.0F);
/*      */     
/*  622 */     this.gunModel[9].addShapeBox(23.0F, -14.0F, -4.0F, 2, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  623 */     this.gunModel[9].setRotationPoint(6.0F, -4.5F, 0.0F);
/*      */     
/*  625 */     this.gunModel[10].addShapeBox(23.0F, -14.0F, -4.0F, 7, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/*  626 */     this.gunModel[10].setRotationPoint(6.0F, -4.5F, 0.0F);
/*      */     
/*  628 */     this.gunModel[11].addShapeBox(23.0F, -14.0F, -4.0F, 7, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[11].setRotationPoint(6.0F, -5.5F, 0.0F);
/*      */     
/*  631 */     this.gunModel[12].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  632 */     this.gunModel[12].setRotationPoint(13.0F, -4.5F, 0.0F);
/*      */     
/*  634 */     this.gunModel[13].addShapeBox(23.0F, -14.0F, -4.0F, 9, 1, 8, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[13].setRotationPoint(6.0F, -6.5F, 0.0F);
/*      */     
/*  637 */     this.gunModel[14].addShapeBox(23.0F, -14.0F, -4.0F, 12, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  638 */     this.gunModel[14].setRotationPoint(6.0F, -7.5F, 0.0F);
/*      */     
/*  640 */     this.gunModel[15].addShapeBox(23.0F, -14.0F, -4.0F, 26, 2, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  641 */     this.gunModel[15].setRotationPoint(-20.0F, -7.5F, 0.0F);
/*      */     
/*  643 */     this.gunModel[16].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  644 */     this.gunModel[16].setRotationPoint(-18.25F, -8.75F, -0.75F);
/*      */     
/*  646 */     this.gunModel[17].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  647 */     this.gunModel[17].setRotationPoint(-18.25F, -7.0F, -0.75F);
/*      */     
/*  649 */     this.gunModel[18].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  650 */     this.gunModel[18].setRotationPoint(-12.25F, -10.0F, -0.75F);
/*      */     
/*  652 */     this.gunModel[19].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  653 */     this.gunModel[19].setRotationPoint(-8.75F, -10.0F, -0.75F);
/*      */     
/*  655 */     this.gunModel[20].addShapeBox(23.0F, -14.0F, -4.0F, 38, 4, 8, 0.0F, 0.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  656 */     this.gunModel[20].setRotationPoint(-20.0F, -11.5F, 0.0F);
/*      */     
/*  658 */     this.gunModel[21].addShapeBox(23.0F, -14.0F, -4.0F, 38, 10, 6, 0.0F, 0.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  659 */     this.gunModel[21].setRotationPoint(-18.0F, -21.5F, 2.0F);
/*      */     
/*  661 */     this.gunModel[22].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  662 */     this.gunModel[22].setRotationPoint(-19.5F, -6.0F, 0.0F);
/*      */     
/*  664 */     this.gunModel[23].addShapeBox(23.0F, -14.0F, -4.0F, 5, 2, 8, 0.0F, 1.75F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 1.75F, -1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  665 */     this.gunModel[23].setRotationPoint(-24.5F, -6.0F, 0.0F);
/*      */     
/*  667 */     this.gunModel[24].addShapeBox(23.0F, -14.0F, -4.0F, 5, 2, 8, 0.0F, 2.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 2.5F, -1.25F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/*  668 */     this.gunModel[24].setRotationPoint(-24.5F, -6.75F, 0.0F);
/*      */     
/*  670 */     this.gunModel[25].addShapeBox(23.0F, -14.0F, -4.0F, 6, 6, 8, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  671 */     this.gunModel[25].setRotationPoint(-26.5F, -11.5F, 0.0F);
/*      */     
/*  673 */     this.gunModel[26].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  674 */     this.gunModel[26].setRotationPoint(-24.5F, -12.75F, 0.0F);
/*      */     
/*  676 */     this.gunModel[27].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  677 */     this.gunModel[27].setRotationPoint(-23.5F, -13.75F, 0.0F);
/*      */     
/*  679 */     this.gunModel[28].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.55F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.55F, -0.5F, 0.0F);
/*  680 */     this.gunModel[28].setRotationPoint(-21.0F, -13.5F, 0.0F);
/*      */     
/*  682 */     this.gunModel[29].addShapeBox(23.0F, -14.0F, -4.0F, 4, 2, 8, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.5F, 0.0F, -0.55F, -0.5F, 0.0F, -0.55F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  683 */     this.gunModel[29].setRotationPoint(-28.25F, -13.5F, 0.0F);
/*      */     
/*  685 */     this.gunModel[30].addShapeBox(23.0F, -14.0F, -4.0F, 4, 2, 8, 0.0F, 0.5F, -1.25F, 0.0F, 1.0F, -1.25F, 0.0F, 1.0F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  686 */     this.gunModel[30].setRotationPoint(-28.25F, -14.25F, 0.0F);
/*      */     
/*  688 */     this.gunModel[31].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 8, 0.0F, 1.0F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 1.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  689 */     this.gunModel[31].setRotationPoint(-21.0F, -14.25F, 0.0F);
/*      */     
/*  691 */     this.gunModel[32].addShapeBox(23.0F, -14.0F, -4.0F, 10, 9, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  692 */     this.gunModel[32].setRotationPoint(-28.5F, -22.0F, 0.0F);
/*      */     
/*  694 */     this.gunModel[33].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 8, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  695 */     this.gunModel[33].setRotationPoint(-29.75F, -16.0F, 0.0F);
/*      */     
/*  697 */     this.gunModel[34].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/*  698 */     this.gunModel[34].setRotationPoint(-30.75F, -17.0F, 0.0F);
/*      */     
/*  700 */     this.gunModel[35].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/*  701 */     this.gunModel[35].setRotationPoint(-31.75F, -18.0F, 0.0F);
/*      */     
/*  703 */     this.gunModel[36].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 2.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/*  704 */     this.gunModel[36].setRotationPoint(-32.75F, -19.0F, 0.0F);
/*      */     
/*  706 */     this.gunModel[37].addShapeBox(23.0F, -14.0F, -4.0F, 6, 3, 8, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F);
/*  707 */     this.gunModel[37].setRotationPoint(-34.75F, -22.0F, 0.0F);
/*      */     
/*  709 */     this.gunModel[38].addShapeBox(23.0F, -14.0F, -4.0F, 6, 5, 8, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/*  710 */     this.gunModel[38].setRotationPoint(-34.75F, -27.0F, 0.0F);
/*      */     
/*  712 */     this.gunModel[39].addShapeBox(23.0F, -14.0F, -4.0F, 11, 5, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  713 */     this.gunModel[39].setRotationPoint(-28.75F, -27.0F, 0.0F);
/*      */     
/*  715 */     this.gunModel[40].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  716 */     this.gunModel[40].setRotationPoint(-17.75F, -27.0F, 0.0F);
/*      */     
/*  718 */     this.gunModel[41].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  719 */     this.gunModel[41].setRotationPoint(-17.75F, -24.75F, 0.0F);
/*      */     
/*  721 */     this.gunModel[42].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  722 */     this.gunModel[42].setRotationPoint(-17.75F, -22.75F, 0.0F);
/*      */     
/*  724 */     this.gunModel[43].addShapeBox(23.0F, -14.0F, -4.0F, 10, 5, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  725 */     this.gunModel[43].setRotationPoint(-17.75F, -27.0F, 0.0F);
/*      */     
/*  727 */     this.gunModel[44].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  728 */     this.gunModel[44].setRotationPoint(-17.75F, -29.75F, 0.0F);
/*      */     
/*  730 */     this.gunModel[45].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  731 */     this.gunModel[45].setRotationPoint(-17.75F, -32.0F, 0.0F);
/*      */     
/*  733 */     this.gunModel[46].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  734 */     this.gunModel[46].setRotationPoint(-17.75F, -33.0F, 0.0F);
/*      */     
/*  736 */     this.gunModel[47].addShapeBox(23.0F, -14.0F, -4.0F, 12, 1, 8, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  737 */     this.gunModel[47].setRotationPoint(-17.75F, -22.0F, 0.0F);
/*      */     
/*  739 */     this.gunModel[48].addShapeBox(23.0F, -14.0F, -4.0F, 9, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  740 */     this.gunModel[48].setRotationPoint(-17.75F, -33.75F, 0.0F);
/*      */     
/*  742 */     this.gunModel[49].addShapeBox(23.0F, -14.0F, -4.0F, 8, 5, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  743 */     this.gunModel[49].setRotationPoint(-17.75F, -32.5F, 0.0F);
/*      */     
/*  745 */     this.gunModel[50].addShapeBox(23.0F, -14.0F, -4.0F, 17, 6, 8, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  746 */     this.gunModel[50].setRotationPoint(-34.75F, -33.0F, 0.0F);
/*      */     
/*  748 */     this.gunModel[51].addShapeBox(23.0F, -14.0F, -4.0F, 1, 6, 8, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -3.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, -3.25F, 0.0F);
/*  749 */     this.gunModel[51].setRotationPoint(-28.25F, -11.5F, 0.0F);
/*      */     
/*  751 */     this.gunModel[52].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  752 */     this.gunModel[52].setRotationPoint(-22.5F, -4.0F, 1.5F);
/*      */     
/*  754 */     this.gunModel[53].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F);
/*  755 */     this.gunModel[53].setRotationPoint(-23.5F, -4.0F, 1.5F);
/*      */     
/*  757 */     this.gunModel[54].addShapeBox(23.0F, -14.0F, -4.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  758 */     this.gunModel[54].setRotationPoint(-24.0F, -4.0F, 0.0F);
/*      */     
/*  760 */     this.gunModel[55].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 5, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  761 */     this.gunModel[55].setRotationPoint(-23.5F, 2.0F, 1.5F);
/*      */     
/*  763 */     this.gunModel[56].addShapeBox(23.0F, -14.0F, -4.0F, 12, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[56].setRotationPoint(-8.75F, -33.75F, 0.0F);
/*      */     
/*  766 */     this.gunModel[57].addShapeBox(23.0F, -14.0F, -4.0F, 23, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel[57].setRotationPoint(3.25F, -33.75F, 0.0F);
/*      */     
/*  769 */     this.gunModel[58].addShapeBox(23.0F, -14.0F, -4.0F, 15, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel[58].setRotationPoint(26.25F, -32.75F, 0.0F);
/*      */     
/*  772 */     this.gunModel[59].addShapeBox(23.0F, -14.0F, -4.0F, 3, 3, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  773 */     this.gunModel[59].setRotationPoint(-23.0F, 2.0F, 1.5F);
/*      */     
/*  775 */     this.gunModel[60].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  776 */     this.gunModel[60].setRotationPoint(-20.5F, 4.0F, 1.5F);
/*      */     
/*  778 */     this.gunModel[61].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  779 */     this.gunModel[61].setRotationPoint(-18.0F, 4.0F, 1.5F);
/*      */     
/*  781 */     this.gunModel[62].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  782 */     this.gunModel[62].setRotationPoint(-14.5F, 3.5F, 1.5F);
/*      */     
/*  784 */     this.gunModel[63].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  785 */     this.gunModel[63].setRotationPoint(-13.0F, 3.0F, 1.5F);
/*      */     
/*  787 */     this.gunModel[64].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 5, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  788 */     this.gunModel[64].setRotationPoint(-11.5F, 2.5F, 1.5F);
/*      */     
/*  790 */     this.gunModel[65].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 5, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  791 */     this.gunModel[65].setRotationPoint(-9.5F, 2.5F, 1.5F);
/*      */     
/*  793 */     this.gunModel[66].addShapeBox(23.0F, -14.0F, -4.0F, 2, 5, 5, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  794 */     this.gunModel[66].setRotationPoint(-9.5F, -3.0F, 1.5F);
/*      */     
/*  796 */     this.gunModel[67].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 5, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/*  797 */     this.gunModel[67].setRotationPoint(-11.0F, -3.0F, 1.5F);
/*      */     
/*  799 */     this.gunModel[68].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/*  800 */     this.gunModel[68].setRotationPoint(-20.5F, -4.0F, 2.5F);
/*      */     
/*  802 */     this.gunModel[69].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 3, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  803 */     this.gunModel[69].setRotationPoint(-20.5F, -3.5F, 2.5F);
/*      */     
/*  805 */     this.gunModel[70].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  806 */     this.gunModel[70].setRotationPoint(-19.25F, -2.5F, 2.5F);
/*      */     
/*  808 */     this.gunModel[71].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  809 */     this.gunModel[71].setRotationPoint(-19.25F, -1.5F, 2.5F);
/*      */     
/*  811 */     this.gunModel[72].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  812 */     this.gunModel[72].setRotationPoint(-19.25F, 1.5F, 2.5F);
/*      */     
/*  814 */     this.gunModel[73].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  815 */     this.gunModel[73].setRotationPoint(-18.75F, 2.5F, 2.5F);
/*      */     
/*  817 */     this.gunModel[74].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel[74].setRotationPoint(-12.75F, -29.75F, -0.25F);
/*      */     
/*  820 */     this.gunModel[75].addShapeBox(23.0F, -14.0F, -4.0F, 12, 13, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  821 */     this.gunModel[75].setRotationPoint(-35.0F, 4.0F, 0.0F);
/*      */     
/*  823 */     this.gunModel[76].addShapeBox(23.0F, -14.0F, -4.0F, 11, 8, 8, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  824 */     this.gunModel[76].setRotationPoint(-35.0F, -4.0F, 0.0F);
/*      */     
/*  826 */     this.gunModel[77].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  827 */     this.gunModel[77].setRotationPoint(-35.0F, 17.0F, 0.0F);
/*      */     
/*  829 */     this.gunModel[78].addShapeBox(23.0F, -14.0F, -4.0F, 6, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  830 */     this.gunModel[78].setRotationPoint(-41.0F, 14.0F, 0.0F);
/*      */     
/*  832 */     this.gunModel[79].addShapeBox(23.0F, -14.0F, -4.0F, 6, 10, 8, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  833 */     this.gunModel[79].setRotationPoint(-41.0F, 4.0F, 0.0F);
/*      */     
/*  835 */     this.gunModel[80].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F, 1.75F, -1.25F, 0.0F, 1.75F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F);
/*  836 */     this.gunModel[80].setRotationPoint(-29.75F, -4.75F, 0.0F);
/*      */     
/*  838 */     this.gunModel[81].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 2.5F, -1.25F, 0.0F, 2.5F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F);
/*  839 */     this.gunModel[81].setRotationPoint(-29.75F, -5.5F, 0.0F);
/*      */     
/*  841 */     this.gunModel[82].addShapeBox(23.0F, -14.0F, -4.0F, 1, 4, 8, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 1.75F, -0.75F, 0.0F, 1.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  842 */     this.gunModel[82].setRotationPoint(-29.75F, -8.75F, 0.0F);
/*      */     
/*  844 */     this.gunModel[83].addShapeBox(23.0F, -14.0F, -4.0F, 4, 3, 9, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel[83].setRotationPoint(-35.0F, 17.0F, -0.5F);
/*      */     
/*  847 */     this.gunModel[84].addShapeBox(23.0F, -14.0F, -4.0F, 6, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel[84].setRotationPoint(-41.0F, 14.0F, -0.5F);
/*      */     
/*  850 */     this.gunModel[85].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  851 */     this.gunModel[85].setRotationPoint(-31.5F, 19.0F, -0.5F);
/*      */     
/*  853 */     this.gunModel[86].addShapeBox(23.0F, -14.0F, -4.0F, 4, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  854 */     this.gunModel[86].setRotationPoint(-35.0F, 20.0F, -0.5F);
/*      */     
/*  856 */     this.gunModel[87].addShapeBox(23.0F, -14.0F, -4.0F, 6, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  857 */     this.gunModel[87].setRotationPoint(-40.5F, 18.0F, -0.5F);
/*      */     
/*  859 */     this.gunModel[88].addShapeBox(23.0F, -14.0F, -4.0F, 8, 4, 9, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -3.0F, 0.0F);
/*  860 */     this.gunModel[88].setRotationPoint(-48.0F, 19.0F, -0.5F);
/*      */     
/*  862 */     this.gunModel[89].addShapeBox(23.0F, -14.0F, -4.0F, 8, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  863 */     this.gunModel[89].setRotationPoint(-48.0F, 18.0F, -0.5F);
/*      */     
/*  865 */     this.gunModel[90].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  866 */     this.gunModel[90].setRotationPoint(-48.75F, 18.0F, -0.5F);
/*      */     
/*  868 */     this.gunModel[91].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  869 */     this.gunModel[91].setRotationPoint(-48.75F, 19.0F, -0.5F);
/*      */     
/*  871 */     this.gunModel[92].addShapeBox(23.0F, -14.0F, -4.0F, 7, 3, 9, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel[92].setRotationPoint(-48.0F, 15.0F, -0.5F);
/*      */     
/*  874 */     this.gunModel[93].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 9, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  875 */     this.gunModel[93].setRotationPoint(-45.0F, 14.0F, -0.5F);
/*      */     
/*  877 */     this.gunModel[94].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  878 */     this.gunModel[94].setRotationPoint(-43.0F, 13.0F, -0.5F);
/*      */     
/*  880 */     this.gunModel[95].addShapeBox(23.0F, -14.0F, -4.0F, 8, 10, 8, 0.0F, -6.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, -1.0F, -0.25F, -1.0F, -1.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -0.25F, -1.0F, -1.0F);
/*  881 */     this.gunModel[95].setRotationPoint(-43.1F, 4.0F, 0.0F);
/*      */     
/*  883 */     this.gunModel[96].addShapeBox(23.0F, -14.0F, -4.0F, 5, 6, 8, 0.0F, -3.75F, 0.0F, -1.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, -3.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  884 */     this.gunModel[96].setRotationPoint(-37.1F, -2.0F, 0.0F);
/*      */     
/*  886 */     this.gunModel[97].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  887 */     this.gunModel[97].setRotationPoint(-33.35F, -4.0F, 0.0F);
/*      */     
/*  889 */     this.gunModel[98].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, 0.0F, -0.25F, -1.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  890 */     this.gunModel[98].setRotationPoint(-33.35F, -5.0F, 0.0F);
/*      */     
/*  892 */     this.gunModel[99].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 8, 0.0F, 0.5F, -1.25F, -1.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  893 */     this.gunModel[99].setRotationPoint(-33.35F, -6.75F, 0.0F);
/*      */     
/*  895 */     this.gunModel[100].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 8, 0.0F, 1.5F, -1.25F, -1.0F, 0.8F, -1.25F, 0.0F, 0.8F, -1.25F, 0.0F, 1.5F, -1.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F);
/*  896 */     this.gunModel[100].setRotationPoint(-33.35F, -7.75F, 0.0F);
/*      */     
/*  898 */     this.gunModel[101].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 8, 0.0F, 3.5F, -1.5F, -1.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 3.5F, -1.5F, -1.0F, 1.5F, 0.25F, -1.0F, 0.8F, 0.25F, 0.0F, 0.8F, 0.25F, 0.0F, 1.5F, 0.25F, -1.0F);
/*  899 */     this.gunModel[101].setRotationPoint(-33.35F, -8.75F, 0.0F);
/*      */     
/*  901 */     this.gunModel[102].addShapeBox(23.0F, -14.0F, -4.0F, 7, 1, 8, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/*  902 */     this.gunModel[102].setRotationPoint(-36.35F, -8.25F, 0.0F);
/*      */     
/*  904 */     this.gunModel[103].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 0.45F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.45F, 0.5F, 0.0F, 0.6F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.6F, 0.0F, -1.0F);
/*  905 */     this.gunModel[103].setRotationPoint(-40.85F, -8.25F, 0.0F);
/*      */     
/*  907 */     this.gunModel[104].addShapeBox(23.0F, -14.0F, -4.0F, 29, 1, 8, 0.0F, 1.75F, 0.5F, 0.0F, 0.6F, 0.5F, 0.0F, 0.6F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 0.75F, 0.0F, -1.0F, 0.45F, 0.0F, -1.0F, 0.45F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F);
/*  908 */     this.gunModel[104].setRotationPoint(-71.0F, -8.25F, 0.0F);
/*      */     
/*  910 */     this.gunModel[105].addShapeBox(23.0F, -14.0F, -4.0F, 32, 10, 8, 0.0F, 2.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  911 */     this.gunModel[105].setRotationPoint(-73.0F, -18.5F, 0.0F);
/*      */     
/*  913 */     this.gunModel[106].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  914 */     this.gunModel[106].setRotationPoint(-42.0F, -16.5F, -0.75F);
/*      */     
/*  916 */     this.gunModel[107].addShapeBox(23.0F, -14.0F, -4.0F, 13, 1, 8, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  917 */     this.gunModel[107].setRotationPoint(-41.35F, -9.75F, 0.0F);
/*      */     
/*  919 */     this.gunModel[108].addShapeBox(23.0F, -14.0F, -4.0F, 13, 2, 8, 0.0F, -1.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/*  920 */     this.gunModel[108].setRotationPoint(-41.35F, -11.75F, 0.0F);
/*      */     
/*  922 */     this.gunModel[109].addShapeBox(23.0F, -14.0F, -4.0F, 8, 2, 8, 0.0F, -0.7F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  923 */     this.gunModel[109].setRotationPoint(-40.35F, -13.75F, 0.0F);
/*      */     
/*  925 */     this.gunModel[110].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  926 */     this.gunModel[110].setRotationPoint(-32.75F, -12.75F, 0.0F);
/*      */     
/*  928 */     this.gunModel[111].addShapeBox(23.0F, -14.0F, -4.0F, 4, 3, 8, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  929 */     this.gunModel[111].setRotationPoint(-32.75F, -15.75F, 0.0F);
/*      */     
/*  931 */     this.gunModel[112].addShapeBox(23.0F, -14.0F, -4.0F, 7, 2, 8, 0.0F, -0.7F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.7F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/*  932 */     this.gunModel[112].setRotationPoint(-39.75F, -15.75F, 0.0F);
/*      */     
/*  934 */     this.gunModel[113].addShapeBox(23.0F, -14.0F, -4.0F, 9, 1, 8, 0.0F, -0.05F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -0.05F, -0.25F, 0.0F, 0.3F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.3F, 0.25F, 0.0F);
/*  935 */     this.gunModel[113].setRotationPoint(-38.75F, -16.75F, 0.0F);
/*      */     
/*  937 */     this.gunModel[114].addShapeBox(23.0F, -14.0F, -4.0F, 8, 1, 8, 0.0F, -0.4F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.05F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.05F, 0.25F, 0.0F);
/*  938 */     this.gunModel[114].setRotationPoint(-38.75F, -17.75F, 0.0F);
/*      */     
/*  940 */     this.gunModel[115].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.6F, -0.5F, 0.0F, 2.25F, -0.5F, 0.0F, 2.25F, -0.5F, 0.0F, 0.6F, -0.5F, 0.0F);
/*  941 */     this.gunModel[115].setRotationPoint(-37.75F, -18.0F, 0.0F);
/*      */     
/*  943 */     this.gunModel[116].addShapeBox(23.0F, -14.0F, -4.0F, 9, 3, 8, 0.0F, -0.25F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.1F, 0.0F, 1.75F, -0.1F, 0.0F, 1.75F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F);
/*  944 */     this.gunModel[116].setRotationPoint(-48.5F, -21.5F, 0.0F);
/*      */     
/*  946 */     this.gunModel[117].addShapeBox(23.0F, -14.0F, -4.0F, 4, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  947 */     this.gunModel[117].setRotationPoint(-40.25F, -27.25F, 0.0F);
/*      */     
/*  949 */     this.gunModel[118].addShapeBox(23.0F, -14.0F, -4.0F, 3, 5, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  950 */     this.gunModel[118].setRotationPoint(-43.25F, -27.25F, 0.0F);
/*      */     
/*  952 */     this.gunModel[119].addShapeBox(23.0F, -14.0F, -4.0F, 5, 4, 8, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  953 */     this.gunModel[119].setRotationPoint(-48.25F, -26.25F, 0.0F);
/*      */     
/*  955 */     this.gunModel[120].addShapeBox(23.0F, -14.0F, -4.0F, 6, 6, 8, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  956 */     this.gunModel[120].setRotationPoint(-54.25F, -24.75F, 0.0F);
/*      */     
/*  958 */     this.gunModel[121].addShapeBox(23.0F, -14.0F, -4.0F, 7, 4, 8, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  959 */     this.gunModel[121].setRotationPoint(-61.25F, -22.75F, 0.0F);
/*      */     
/*  961 */     this.gunModel[122].addShapeBox(23.0F, -14.0F, -4.0F, 7, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  962 */     this.gunModel[122].setRotationPoint(-68.25F, -20.75F, 0.0F);
/*      */     
/*  964 */     this.gunModel[123].addShapeBox(23.0F, -14.0F, -4.0F, 7, 2, 8, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F);
/*  965 */     this.gunModel[123].setRotationPoint(-75.25F, -20.75F, 0.0F);
/*      */     
/*  967 */     this.gunModel[124].addShapeBox(23.0F, -14.0F, -4.0F, 17, 9, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  968 */     this.gunModel[124].setRotationPoint(-89.5F, -16.75F, 1.0F);
/*      */     
/*  970 */     this.gunModel[125].addShapeBox(23.0F, -14.0F, -4.0F, 9, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel[125].setRotationPoint(-98.5F, -16.75F, 1.0F);
/*      */     
/*  973 */     this.gunModel[126].addShapeBox(23.0F, -14.0F, -4.0F, 19, 2, 6, 0.0F, 0.0F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  974 */     this.gunModel[126].setRotationPoint(-94.5F, -19.75F, 1.0F);
/*      */     
/*  976 */     this.gunModel[127].addShapeBox(23.0F, -14.0F, -4.0F, 22, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  977 */     this.gunModel[127].setRotationPoint(-96.5F, -17.75F, 2.0F);
/*      */     
/*  979 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 5, 12, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  980 */     this.gunModel[''].setRotationPoint(-98.5F, -8.75F, 1.0F);
/*      */     
/*  982 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/*  983 */     this.gunModel[''].setRotationPoint(-9.75F, -33.0F, 0.0F);
/*      */     
/*  985 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 9, 2, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  986 */     this.gunModel[''].setRotationPoint(41.25F, -31.75F, 0.0F);
/*      */     
/*  988 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 8, 2, 8, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  989 */     this.gunModel[''].setRotationPoint(50.25F, -31.0F, 0.0F);
/*      */     
/*  991 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 8, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  992 */     this.gunModel[''].setRotationPoint(58.25F, -29.5F, 0.0F);
/*      */     
/*  994 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 8, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  995 */     this.gunModel[''].setRotationPoint(66.25F, -28.0F, 0.0F);
/*      */     
/*  997 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  998 */     this.gunModel[''].setRotationPoint(-94.0F, -0.75F, 1.0F);
/*      */     
/* 1000 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1001 */     this.gunModel[''].setRotationPoint(-94.0F, 1.5F, 1.0F);
/*      */     
/* 1003 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 5, 2, 6, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1004 */     this.gunModel[''].setRotationPoint(-98.5F, 3.75F, 1.0F);
/*      */     
/* 1006 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 5, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1007 */     this.gunModel[''].setRotationPoint(74.25F, -26.0F, 0.0F);
/*      */     
/* 1009 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 5, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1010 */     this.gunModel[''].setRotationPoint(74.25F, -24.0F, 0.0F);
/*      */     
/* 1012 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 4, 4, 6, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1013 */     this.gunModel[''].setRotationPoint(-97.5F, 6.0F, 1.0F);
/*      */     
/* 1015 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 50, 2, 8, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F);
/* 1016 */     this.gunModel[''].setRotationPoint(24.25F, -22.0F, 0.0F);
/*      */     
/* 1018 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 4, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1019 */     this.gunModel[''].setRotationPoint(79.25F, -24.0F, 0.0F);
/*      */     
/* 1021 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1022 */     this.gunModel[''].setRotationPoint(83.25F, -22.0F, 0.0F);
/*      */     
/* 1024 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 2, 4, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1025 */     this.gunModel[''].setRotationPoint(85.25F, -20.25F, 0.0F);
/*      */     
/* 1027 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1028 */     this.gunModel[''].setRotationPoint(87.25F, -17.5F, 0.0F);
/*      */     
/* 1030 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1031 */     this.gunModel[''].setRotationPoint(88.25F, -15.25F, 0.0F);
/*      */     
/* 1033 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 5, 4, 8, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1034 */     this.gunModel[''].setRotationPoint(80.25F, -20.0F, 0.0F);
/*      */     
/* 1036 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1037 */     this.gunModel[''].setRotationPoint(89.25F, -13.0F, 0.0F);
/*      */     
/* 1039 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -1.75F, -1.0F, -0.5F, -1.75F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/* 1040 */     this.gunModel[''].setRotationPoint(90.25F, -10.75F, 0.0F);
/*      */     
/* 1042 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 4, 2, 8, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/* 1043 */     this.gunModel[''].setRotationPoint(86.25F, -10.75F, 0.0F);
/*      */     
/* 1045 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 8, 1, 8, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 1046 */     this.gunModel[''].setRotationPoint(80.25F, -15.5F, 0.0F);
/*      */     
/* 1048 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F);
/* 1049 */     this.gunModel[''].setRotationPoint(85.25F, -14.5F, 0.0F);
/*      */     
/* 1051 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1052 */     this.gunModel[''].setRotationPoint(85.25F, -13.5F, 0.0F);
/*      */     
/* 1054 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 8, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 1055 */     this.gunModel[''].setRotationPoint(85.25F, -12.5F, 0.0F);
/*      */     
/* 1057 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 60, 1, 8, 0.0F, -0.6F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.3F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.3F, 0.25F, 0.0F);
/* 1058 */     this.gunModel[''].setRotationPoint(20.25F, -15.5F, 0.0F);
/*      */     
/* 1060 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 5, 4, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F);
/* 1061 */     this.gunModel[''].setRotationPoint(44.5F, -20.0F, 0.0F);
/*      */     
/* 1063 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 21, 4, 8, 0.0F, 0.15F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 2.15F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 2.15F, 1.0F, 0.0F);
/* 1064 */     this.gunModel[''].setRotationPoint(23.0F, -20.0F, 0.0F);
/*      */     
/* 1066 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 6, 1, 8, 0.0F, -0.3F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, -0.3F, -0.25F, 0.0F, 0.05F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.05F, 0.25F, 0.0F);
/* 1067 */     this.gunModel[''].setRotationPoint(20.25F, -14.5F, 0.0F);
/*      */     
/* 1069 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 6, 6, 8, 0.0F, 0.05F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.05F, -0.25F, 0.0F, 2.15F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 2.15F, 0.25F, 0.0F);
/* 1070 */     this.gunModel[''].setRotationPoint(20.25F, -13.5F, 0.0F);
/*      */     
/* 1072 */     this.gunModel[''].addShapeBox(23.0F, -14.0F, -4.0F, 6, 1, 8, 0.0F, -0.85F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.85F, -0.25F, 0.0F, -0.85F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.85F, 0.25F, 0.0F);
/* 1073 */     this.gunModel[''].setRotationPoint(17.25F, -7.5F, 0.0F);
/*      */     
/* 1075 */     this.gunModel[' '].addShapeBox(23.0F, -14.0F, -4.0F, 2, 3, 8, 0.0F, -1.0F, 0.3F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.3F, 0.0F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1076 */     this.gunModel[' '].setRotationPoint(39.25F, -29.75F, 0.0F);
/*      */     
/* 1078 */     this.gunModel['¡'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 5, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.45F, 0.25F, 0.0F, -1.45F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1079 */     this.gunModel['¡'].setRotationPoint(38.75F, -26.75F, 1.5F);
/*      */     
/* 1081 */     this.gunModel['¢'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 6, 0.0F, -0.5F, -0.25F, -0.5F, -0.7F, -0.25F, -0.5F, -0.7F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 1.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F);
/* 1082 */     this.gunModel['¢'].setRotationPoint(38.0F, -24.75F, 1.0F);
/*      */     
/* 1084 */     this.gunModel['£'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F);
/* 1085 */     this.gunModel['£'].setRotationPoint(78.25F, -20.0F, -0.5F);
/*      */     
/* 1087 */     this.gunModel['¤'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1088 */     this.gunModel['¤'].setRotationPoint(78.25F, -16.0F, -0.5F);
/*      */     
/* 1090 */     this.gunModel['¥'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1091 */     this.gunModel['¥'].setRotationPoint(74.5F, -16.0F, -0.5F);
/*      */     
/* 1093 */     this.gunModel['¦'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1094 */     this.gunModel['¦'].setRotationPoint(74.5F, -20.0F, -0.5F);
/*      */     
/* 1096 */     this.gunModel['§'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F);
/* 1097 */     this.gunModel['§'].setRotationPoint(70.5F, -20.0F, -0.5F);
/*      */     
/* 1099 */     this.gunModel['¨'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1100 */     this.gunModel['¨'].setRotationPoint(70.5F, -16.0F, -0.5F);
/*      */     
/* 1102 */     this.gunModel['©'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1103 */     this.gunModel['©'].setRotationPoint(66.75F, -16.0F, -0.5F);
/*      */     
/* 1105 */     this.gunModel['ª'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1106 */     this.gunModel['ª'].setRotationPoint(66.75F, -20.0F, -0.5F);
/*      */     
/* 1108 */     this.gunModel['«'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F);
/* 1109 */     this.gunModel['«'].setRotationPoint(62.75F, -20.0F, -0.5F);
/*      */     
/* 1111 */     this.gunModel['¬'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1112 */     this.gunModel['¬'].setRotationPoint(62.75F, -16.0F, -0.5F);
/*      */     
/* 1114 */     this.gunModel['­'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1115 */     this.gunModel['­'].setRotationPoint(59.0F, -16.0F, -0.5F);
/*      */     
/* 1117 */     this.gunModel['®'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1118 */     this.gunModel['®'].setRotationPoint(59.0F, -20.0F, -0.5F);
/*      */     
/* 1120 */     this.gunModel['¯'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F);
/* 1121 */     this.gunModel['¯'].setRotationPoint(55.0F, -20.0F, -0.5F);
/*      */     
/* 1123 */     this.gunModel['°'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1124 */     this.gunModel['°'].setRotationPoint(55.0F, -16.0F, -0.5F);
/*      */     
/* 1126 */     this.gunModel['±'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1127 */     this.gunModel['±'].setRotationPoint(51.25F, -16.0F, -0.5F);
/*      */     
/* 1129 */     this.gunModel['²'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1130 */     this.gunModel['²'].setRotationPoint(51.25F, -20.0F, -0.5F);
/*      */     
/* 1132 */     this.gunModel['³'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1133 */     this.gunModel['³'].setRotationPoint(64.75F, -18.0F, -0.5F);
/*      */     
/* 1135 */     this.gunModel['´'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1136 */     this.gunModel['´'].setRotationPoint(63.75F, -18.0F, -0.5F);
/*      */     
/* 1138 */     this.gunModel['µ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1139 */     this.gunModel['µ'].setRotationPoint(63.75F, -17.0F, -0.5F);
/*      */     
/* 1141 */     this.gunModel['¶'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1142 */     this.gunModel['¶'].setRotationPoint(65.75F, -17.0F, -0.5F);
/*      */     
/* 1144 */     this.gunModel['·'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1145 */     this.gunModel['·'].setRotationPoint(65.75F, -19.0F, -0.5F);
/*      */     
/* 1147 */     this.gunModel['¸'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1148 */     this.gunModel['¸'].setRotationPoint(72.5F, -18.0F, -0.5F);
/*      */     
/* 1150 */     this.gunModel['¹'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1151 */     this.gunModel['¹'].setRotationPoint(71.5F, -18.0F, -0.5F);
/*      */     
/* 1153 */     this.gunModel['º'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1154 */     this.gunModel['º'].setRotationPoint(71.5F, -17.0F, -0.5F);
/*      */     
/* 1156 */     this.gunModel['»'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1157 */     this.gunModel['»'].setRotationPoint(73.5F, -17.0F, -0.5F);
/*      */     
/* 1159 */     this.gunModel['¼'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1160 */     this.gunModel['¼'].setRotationPoint(73.5F, -19.0F, -0.5F);
/*      */     
/* 1162 */     this.gunModel['½'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1163 */     this.gunModel['½'].setRotationPoint(79.25F, -18.0F, -0.5F);
/*      */     
/* 1165 */     this.gunModel['¾'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1166 */     this.gunModel['¾'].setRotationPoint(79.25F, -17.0F, -0.5F);
/*      */     
/* 1168 */     this.gunModel['¿'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1169 */     this.gunModel['¿'].setRotationPoint(57.0F, -18.0F, -0.5F);
/*      */     
/* 1171 */     this.gunModel['À'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1172 */     this.gunModel['À'].setRotationPoint(56.0F, -18.0F, -0.5F);
/*      */     
/* 1174 */     this.gunModel['Á'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1175 */     this.gunModel['Á'].setRotationPoint(56.0F, -17.0F, -0.5F);
/*      */     
/* 1177 */     this.gunModel['Â'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1178 */     this.gunModel['Â'].setRotationPoint(58.0F, -17.0F, -0.5F);
/*      */     
/* 1180 */     this.gunModel['Ã'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1181 */     this.gunModel['Ã'].setRotationPoint(58.0F, -19.0F, -0.5F);
/*      */     
/* 1183 */     this.gunModel['Ä'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1184 */     this.gunModel['Ä'].setRotationPoint(50.25F, -17.0F, -0.5F);
/*      */     
/* 1186 */     this.gunModel['Å'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1187 */     this.gunModel['Å'].setRotationPoint(50.25F, -19.0F, -0.5F);
/*      */     
/* 1189 */     this.gunModel['Æ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1190 */     this.gunModel['Æ'].setRotationPoint(64.75F, -17.0F, -0.5F);
/*      */     
/* 1192 */     this.gunModel['Ç'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1193 */     this.gunModel['Ç'].setRotationPoint(64.75F, -17.0F, -0.5F);
/*      */     
/* 1195 */     this.gunModel['È'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1196 */     this.gunModel['È'].setRotationPoint(64.75F, -19.0F, -0.5F);
/*      */     
/* 1198 */     this.gunModel['É'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/* 1199 */     this.gunModel['É'].setRotationPoint(64.75F, -19.0F, -0.5F);
/*      */     
/* 1201 */     this.gunModel['Ê'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1202 */     this.gunModel['Ê'].setRotationPoint(57.0F, -17.0F, -0.5F);
/*      */     
/* 1204 */     this.gunModel['Ë'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1205 */     this.gunModel['Ë'].setRotationPoint(57.0F, -17.0F, -0.5F);
/*      */     
/* 1207 */     this.gunModel['Ì'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1208 */     this.gunModel['Ì'].setRotationPoint(57.0F, -19.0F, -0.5F);
/*      */     
/* 1210 */     this.gunModel['Í'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/* 1211 */     this.gunModel['Í'].setRotationPoint(57.0F, -19.0F, -0.5F);
/*      */     
/* 1213 */     this.gunModel['Î'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1214 */     this.gunModel['Î'].setRotationPoint(72.5F, -17.0F, -0.5F);
/*      */     
/* 1216 */     this.gunModel['Ï'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1217 */     this.gunModel['Ï'].setRotationPoint(72.5F, -17.0F, -0.5F);
/*      */     
/* 1219 */     this.gunModel['Ð'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1220 */     this.gunModel['Ð'].setRotationPoint(72.5F, -19.0F, -0.5F);
/*      */     
/* 1222 */     this.gunModel['Ñ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/* 1223 */     this.gunModel['Ñ'].setRotationPoint(72.5F, -19.0F, -0.5F);
/*      */     
/* 1225 */     this.gunModel['Ò'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1226 */     this.gunModel['Ò'].setRotationPoint(49.25F, -17.0F, -0.5F);
/*      */     
/* 1228 */     this.gunModel['Ó'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1229 */     this.gunModel['Ó'].setRotationPoint(49.25F, -19.0F, -0.5F);
/*      */     
/* 1231 */     this.gunModel['Ô'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1232 */     this.gunModel['Ô'].setRotationPoint(49.75F, -18.25F, -0.5F);
/*      */     
/* 1234 */     this.gunModel['Õ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1235 */     this.gunModel['Õ'].setRotationPoint(79.75F, -18.25F, -0.5F);
/*      */     
/* 1237 */     this.gunModel['Ö'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1238 */     this.gunModel['Ö'].setRotationPoint(80.25F, -17.0F, -0.5F);
/*      */     
/* 1240 */     this.gunModel['×'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/* 1241 */     this.gunModel['×'].setRotationPoint(80.25F, -19.0F, -0.5F);
/*      */     
/* 1243 */     this.gunModel['Ø'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1244 */     this.gunModel['Ø'].setRotationPoint(74.0F, -20.0F, -0.5F);
/*      */     
/* 1246 */     this.gunModel['Ù'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/* 1247 */     this.gunModel['Ù'].setRotationPoint(77.75F, -20.0F, -0.5F);
/*      */     
/* 1249 */     this.gunModel['Ú'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1250 */     this.gunModel['Ú'].setRotationPoint(77.75F, -16.0F, -0.5F);
/*      */     
/* 1252 */     this.gunModel['Û'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1253 */     this.gunModel['Û'].setRotationPoint(74.0F, -16.0F, -0.5F);
/*      */     
/* 1255 */     this.gunModel['Ü'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1256 */     this.gunModel['Ü'].setRotationPoint(66.25F, -20.0F, -0.5F);
/*      */     
/* 1258 */     this.gunModel['Ý'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/* 1259 */     this.gunModel['Ý'].setRotationPoint(70.0F, -20.0F, -0.5F);
/*      */     
/* 1261 */     this.gunModel['Þ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1262 */     this.gunModel['Þ'].setRotationPoint(70.0F, -16.0F, -0.5F);
/*      */     
/* 1264 */     this.gunModel['ß'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1265 */     this.gunModel['ß'].setRotationPoint(66.25F, -16.0F, -0.5F);
/*      */     
/* 1267 */     this.gunModel['à'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1268 */     this.gunModel['à'].setRotationPoint(58.5F, -20.0F, -0.5F);
/*      */     
/* 1270 */     this.gunModel['á'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/* 1271 */     this.gunModel['á'].setRotationPoint(62.25F, -20.0F, -0.5F);
/*      */     
/* 1273 */     this.gunModel['â'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1274 */     this.gunModel['â'].setRotationPoint(62.25F, -16.0F, -0.5F);
/*      */     
/* 1276 */     this.gunModel['ã'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1277 */     this.gunModel['ã'].setRotationPoint(58.5F, -16.0F, -0.5F);
/*      */     
/* 1279 */     this.gunModel['ä'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1280 */     this.gunModel['ä'].setRotationPoint(50.75F, -20.0F, -0.5F);
/*      */     
/* 1282 */     this.gunModel['å'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/* 1283 */     this.gunModel['å'].setRotationPoint(54.5F, -20.0F, -0.5F);
/*      */     
/* 1285 */     this.gunModel['æ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1286 */     this.gunModel['æ'].setRotationPoint(54.5F, -16.0F, -0.5F);
/*      */     
/* 1288 */     this.gunModel['ç'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1289 */     this.gunModel['ç'].setRotationPoint(50.75F, -16.0F, -0.5F);
/*      */     
/* 1291 */     this.gunModel['è'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/* 1292 */     this.gunModel['è'].setRotationPoint(50.25F, -15.75F, 0.0F);
/*      */     
/* 1294 */     this.gunModel['é'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1295 */     this.gunModel['é'].setRotationPoint(50.75F, -15.5F, 0.0F);
/*      */     
/* 1297 */     this.gunModel['ê'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1298 */     this.gunModel['ê'].setRotationPoint(54.5F, -15.5F, 0.0F);
/*      */     
/* 1300 */     this.gunModel['ë'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1301 */     this.gunModel['ë'].setRotationPoint(62.25F, -15.5F, 0.0F);
/*      */     
/* 1303 */     this.gunModel['ì'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1304 */     this.gunModel['ì'].setRotationPoint(70.0F, -15.5F, 0.0F);
/*      */     
/* 1306 */     this.gunModel['í'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1307 */     this.gunModel['í'].setRotationPoint(77.75F, -15.5F, 0.0F);
/*      */     
/* 1309 */     this.gunModel['î'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1310 */     this.gunModel['î'].setRotationPoint(77.75F, -20.5F, 0.0F);
/*      */     
/* 1312 */     this.gunModel['ï'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -0.25F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1313 */     this.gunModel['ï'].setRotationPoint(70.0F, -20.5F, 0.0F);
/*      */     
/* 1315 */     this.gunModel['ð'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -0.25F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1316 */     this.gunModel['ð'].setRotationPoint(62.25F, -20.5F, 0.0F);
/*      */     
/* 1318 */     this.gunModel['ñ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 8, 0.0F, -0.25F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1319 */     this.gunModel['ñ'].setRotationPoint(54.5F, -20.5F, 0.0F);
/*      */     
/* 1321 */     this.gunModel['ò'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1322 */     this.gunModel['ò'].setRotationPoint(50.75F, -20.5F, 0.0F);
/*      */     
/* 1324 */     this.gunModel['ó'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1325 */     this.gunModel['ó'].setRotationPoint(50.25F, -20.25F, 0.0F);
/*      */     
/* 1327 */     this.gunModel['ô'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1328 */     this.gunModel['ô'].setRotationPoint(79.25F, -20.25F, 0.0F);
/*      */     
/* 1330 */     this.gunModel['õ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1331 */     this.gunModel['õ'].setRotationPoint(79.25F, -15.75F, 0.0F);
/*      */     
/* 1333 */     this.gunModel['ö'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1334 */     this.gunModel['ö'].setRotationPoint(71.5F, -20.25F, 0.0F);
/*      */     
/* 1336 */     this.gunModel['÷'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1337 */     this.gunModel['÷'].setRotationPoint(73.5F, -20.25F, 0.0F);
/*      */     
/* 1339 */     this.gunModel['ø'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1340 */     this.gunModel['ø'].setRotationPoint(63.75F, -20.25F, 0.0F);
/*      */     
/* 1342 */     this.gunModel['ù'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1343 */     this.gunModel['ù'].setRotationPoint(65.75F, -20.25F, 0.0F);
/*      */     
/* 1345 */     this.gunModel['ú'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 1346 */     this.gunModel['ú'].setRotationPoint(56.0F, -20.25F, 0.0F);
/*      */     
/* 1348 */     this.gunModel['û'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1349 */     this.gunModel['û'].setRotationPoint(58.0F, -20.25F, 0.0F);
/*      */     
/* 1351 */     this.gunModel['ü'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1352 */     this.gunModel['ü'].setRotationPoint(71.5F, -15.75F, 0.0F);
/*      */     
/* 1354 */     this.gunModel['ý'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1355 */     this.gunModel['ý'].setRotationPoint(63.75F, -15.75F, 0.0F);
/*      */     
/* 1357 */     this.gunModel['þ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1358 */     this.gunModel['þ'].setRotationPoint(56.0F, -15.75F, 0.0F);
/*      */     
/* 1360 */     this.gunModel['ÿ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1361 */     this.gunModel['ÿ'].setRotationPoint(51.0F, -16.5F, 0.0F);
/*      */     
/* 1363 */     this.gunModel['Ā'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1364 */     this.gunModel['Ā'].setRotationPoint(54.0F, -16.5F, 0.0F);
/*      */     
/* 1366 */     this.gunModel['ā'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1367 */     this.gunModel['ā'].setRotationPoint(51.0F, -19.5F, 0.0F);
/*      */     
/* 1369 */     this.gunModel['Ă'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1370 */     this.gunModel['Ă'].setRotationPoint(54.0F, -19.5F, 0.0F);
/*      */     
/* 1372 */     this.gunModel['ă'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1373 */     this.gunModel['ă'].setRotationPoint(51.0F, -17.5F, 0.0F);
/*      */     
/* 1375 */     this.gunModel['Ą'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1376 */     this.gunModel['Ą'].setRotationPoint(51.0F, -18.5F, 0.0F);
/*      */     
/* 1378 */     this.gunModel['ą'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1379 */     this.gunModel['ą'].setRotationPoint(54.5F, -18.5F, 0.0F);
/*      */     
/* 1381 */     this.gunModel['Ć'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1382 */     this.gunModel['Ć'].setRotationPoint(54.5F, -17.5F, 0.0F);
/*      */     
/* 1384 */     this.gunModel['ć'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1385 */     this.gunModel['ć'].setRotationPoint(58.75F, -16.5F, 0.0F);
/*      */     
/* 1387 */     this.gunModel['Ĉ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1388 */     this.gunModel['Ĉ'].setRotationPoint(61.75F, -16.5F, 0.0F);
/*      */     
/* 1390 */     this.gunModel['ĉ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1391 */     this.gunModel['ĉ'].setRotationPoint(58.75F, -19.5F, 0.0F);
/*      */     
/* 1393 */     this.gunModel['Ċ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1394 */     this.gunModel['Ċ'].setRotationPoint(61.75F, -19.5F, 0.0F);
/*      */     
/* 1396 */     this.gunModel['ċ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1397 */     this.gunModel['ċ'].setRotationPoint(58.75F, -17.5F, 0.0F);
/*      */     
/* 1399 */     this.gunModel['Č'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1400 */     this.gunModel['Č'].setRotationPoint(58.75F, -18.5F, 0.0F);
/*      */     
/* 1402 */     this.gunModel['č'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1403 */     this.gunModel['č'].setRotationPoint(62.25F, -18.5F, 0.0F);
/*      */     
/* 1405 */     this.gunModel['Ď'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1406 */     this.gunModel['Ď'].setRotationPoint(62.25F, -17.5F, 0.0F);
/*      */     
/* 1408 */     this.gunModel['ď'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1409 */     this.gunModel['ď'].setRotationPoint(66.5F, -16.5F, 0.0F);
/*      */     
/* 1411 */     this.gunModel['Đ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1412 */     this.gunModel['Đ'].setRotationPoint(69.5F, -16.5F, 0.0F);
/*      */     
/* 1414 */     this.gunModel['đ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1415 */     this.gunModel['đ'].setRotationPoint(66.5F, -19.5F, 0.0F);
/*      */     
/* 1417 */     this.gunModel['Ē'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1418 */     this.gunModel['Ē'].setRotationPoint(69.5F, -19.5F, 0.0F);
/*      */     
/* 1420 */     this.gunModel['ē'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1421 */     this.gunModel['ē'].setRotationPoint(66.5F, -17.5F, 0.0F);
/*      */     
/* 1423 */     this.gunModel['Ĕ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1424 */     this.gunModel['Ĕ'].setRotationPoint(66.5F, -18.5F, 0.0F);
/*      */     
/* 1426 */     this.gunModel['ĕ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1427 */     this.gunModel['ĕ'].setRotationPoint(70.0F, -18.5F, 0.0F);
/*      */     
/* 1429 */     this.gunModel['Ė'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1430 */     this.gunModel['Ė'].setRotationPoint(70.0F, -17.5F, 0.0F);
/*      */     
/* 1432 */     this.gunModel['ė'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1433 */     this.gunModel['ė'].setRotationPoint(74.25F, -16.5F, 0.0F);
/*      */     
/* 1435 */     this.gunModel['Ę'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1436 */     this.gunModel['Ę'].setRotationPoint(77.25F, -16.5F, 0.0F);
/*      */     
/* 1438 */     this.gunModel['ę'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1439 */     this.gunModel['ę'].setRotationPoint(74.25F, -19.5F, 0.0F);
/*      */     
/* 1441 */     this.gunModel['Ě'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1442 */     this.gunModel['Ě'].setRotationPoint(77.25F, -19.5F, 0.0F);
/*      */     
/* 1444 */     this.gunModel['ě'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1445 */     this.gunModel['ě'].setRotationPoint(74.25F, -17.5F, 0.0F);
/*      */     
/* 1447 */     this.gunModel['Ĝ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1448 */     this.gunModel['Ĝ'].setRotationPoint(74.25F, -18.5F, 0.0F);
/*      */     
/* 1450 */     this.gunModel['ĝ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1451 */     this.gunModel['ĝ'].setRotationPoint(77.75F, -18.5F, 0.0F);
/*      */     
/* 1453 */     this.gunModel['Ğ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1454 */     this.gunModel['Ğ'].setRotationPoint(77.75F, -17.5F, 0.0F);
/*      */     
/* 1456 */     this.gunModel['ğ'].addShapeBox(23.0F, -14.0F, -4.0F, 43, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1457 */     this.gunModel['ğ'].setRotationPoint(49.25F, -17.25F, 2.0F);
/*      */     
/* 1459 */     this.gunModel['Ġ'].addShapeBox(23.0F, -14.0F, -4.0F, 10, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1460 */     this.gunModel['Ġ'].setRotationPoint(92.25F, -17.25F, 2.0F);
/*      */     
/* 1462 */     this.gunModel['ġ'].addShapeBox(23.0F, -14.0F, -4.0F, 10, 2, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1463 */     this.gunModel['ġ'].setRotationPoint(92.25F, -15.25F, 2.0F);
/*      */     
/* 1465 */     this.gunModel['Ģ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1466 */     this.gunModel['Ģ'].setRotationPoint(92.25F, -16.25F, 2.0F);
/*      */     
/* 1468 */     this.gunModel['ģ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1469 */     this.gunModel['ģ'].setRotationPoint(92.25F, -15.25F, 2.0F);
/*      */     
/* 1471 */     this.gunModel['Ĥ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 8, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1472 */     this.gunModel['Ĥ'].setRotationPoint(36.5F, -22.75F, 0.0F);
/*      */     
/* 1474 */     this.gunModel['ĥ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.25F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1475 */     this.gunModel['ĥ'].setRotationPoint(48.5F, -24.0F, 0.0F);
/*      */     
/* 1477 */     this.gunModel['Ħ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, -1.0F, 0.0F, -0.95F);
/* 1478 */     this.gunModel['Ħ'].setRotationPoint(47.25F, -24.5F, 0.0F);
/*      */     
/* 1480 */     this.gunModel['ħ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1481 */     this.gunModel['ħ'].setRotationPoint(47.25F, -23.0F, 0.0F);
/*      */     
/* 1483 */     this.gunModel['Ĩ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1484 */     this.gunModel['Ĩ'].setRotationPoint(40.75F, -23.0F, 0.0F);
/*      */     
/* 1486 */     this.gunModel['ĩ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 1487 */     this.gunModel['ĩ'].setRotationPoint(40.75F, -24.5F, 0.0F);
/*      */     
/* 1489 */     this.gunModel['Ī'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1490 */     this.gunModel['Ī'].setRotationPoint(49.5F, -23.0F, 0.0F);
/*      */     
/* 1492 */     this.gunModel['ī'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 1493 */     this.gunModel['ī'].setRotationPoint(49.5F, -24.5F, 0.0F);
/*      */     
/* 1495 */     this.gunModel['Ĭ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.25F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1496 */     this.gunModel['Ĭ'].setRotationPoint(57.0F, -24.0F, 0.0F);
/*      */     
/* 1498 */     this.gunModel['ĭ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.25F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1499 */     this.gunModel['ĭ'].setRotationPoint(65.75F, -24.0F, 0.0F);
/*      */     
/* 1501 */     this.gunModel['Į'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 8, 0.0F, 0.25F, 0.55F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.55F, -1.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1502 */     this.gunModel['Į'].setRotationPoint(73.25F, -24.0F, 0.0F);
/*      */     
/* 1504 */     this.gunModel['į'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 8, 0.0F, 0.45F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.45F, -0.5F, -1.5F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
/* 1505 */     this.gunModel['į'].setRotationPoint(39.75F, -25.0F, 0.0F);
/*      */     
/* 1507 */     this.gunModel['İ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 8, 0.0F, 0.45F, -2.2F, -1.5F, -0.2F, -0.5F, -1.5F, -0.2F, -0.5F, -1.5F, 0.45F, -2.2F, -1.5F, 0.45F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
/* 1508 */     this.gunModel['İ'].setRotationPoint(38.5F, -25.0F, 0.0F);
/*      */     
/* 1510 */     this.gunModel['ı'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 8, 0.0F, 0.5F, -3.0F, 0.0F, -0.45F, -2.25F, -1.45F, -0.45F, -2.25F, -1.45F, 0.5F, -3.0F, -1.45F, 0.5F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1511 */     this.gunModel['ı'].setRotationPoint(37.5F, -25.0F, 0.0F);
/*      */     
/* 1513 */     this.gunModel['Ĳ'].addShapeBox(23.0F, -14.0F, -4.0F, 22, 3, 5, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.45F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.45F, -0.25F, 0.0F);
/* 1514 */     this.gunModel['Ĳ'].setRotationPoint(39.75F, -27.25F, 1.5F);
/*      */     
/* 1516 */     this.gunModel['ĳ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 3, 5, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1517 */     this.gunModel['ĳ'].setRotationPoint(62.25F, -27.25F, 1.5F);
/*      */     
/* 1519 */     this.gunModel['Ĵ'].addShapeBox(23.0F, -14.0F, -4.0F, 6, 3, 5, 0.0F, 0.5F, -1.25F, 0.0F, 0.25F, -2.7F, 0.0F, 0.25F, -2.7F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1520 */     this.gunModel['Ĵ'].setRotationPoint(66.75F, -27.25F, 1.5F);
/*      */     
/* 1522 */     this.gunModel['ĵ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 3, 8, 0.0F, -1.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1523 */     this.gunModel['ĵ'].setRotationPoint(40.25F, -29.75F, 0.0F);
/*      */     
/* 1525 */     this.gunModel['Ķ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 3, 8, 0.0F, 0.0F, -0.45F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1526 */     this.gunModel['Ķ'].setRotationPoint(47.75F, -29.75F, 0.0F);
/*      */     
/* 1528 */     this.gunModel['ķ'].addShapeBox(23.0F, -14.0F, -4.0F, 8, 3, 8, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1529 */     this.gunModel['ķ'].setRotationPoint(50.25F, -29.75F, 0.0F);
/*      */     
/* 1531 */     this.gunModel['ĸ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 3, 8, 0.0F, 0.0F, -2.25F, 0.0F, 0.5F, -2.9F, 0.0F, 0.5F, -2.9F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1532 */     this.gunModel['ĸ'].setRotationPoint(58.25F, -29.75F, 0.0F);
/*      */     
/* 1534 */     this.gunModel['Ĺ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 4, 8, 0.0F, 0.0F, -2.4F, 0.0F, 0.5F, -3.25F, 0.0F, 0.5F, -3.25F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -1.5F, -1.5F, 0.5F, -0.75F, -1.5F, 0.5F, -0.75F, -1.5F, 0.0F, -1.5F, -1.5F);
/* 1535 */     this.gunModel['Ĺ'].setRotationPoint(61.75F, -29.25F, 0.0F);
/*      */     
/* 1537 */     this.gunModel['ĺ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.5F, 0.25F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1538 */     this.gunModel['ĺ'].setRotationPoint(43.5F, -27.75F, 1.0F);
/*      */     
/* 1540 */     this.gunModel['Ļ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1541 */     this.gunModel['Ļ'].setRotationPoint(43.5F, -29.75F, 1.0F);
/*      */     
/* 1543 */     this.gunModel['ļ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1544 */     this.gunModel['ļ'].setRotationPoint(80.75F, -18.25F, -0.5F);
/*      */     
/* 1546 */     this.gunModel['Ľ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1547 */     this.gunModel['Ľ'].setRotationPoint(48.75F, -18.25F, -0.5F);
/*      */     
/* 1549 */     this.gunModel['ľ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 9, 0.0F, 0.25F, 0.25F, 0.0F, -0.9F, 0.25F, 0.0F, -0.9F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, 0.25F, 0.0F, -0.8F);
/* 1550 */     this.gunModel['ľ'].setRotationPoint(84.25F, -11.0F, -0.5F);
/*      */     
/* 1552 */     this.gunModel['Ŀ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.25F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1553 */     this.gunModel['Ŀ'].setRotationPoint(84.25F, -12.25F, -0.5F);
/*      */     
/* 1555 */     this.gunModel['ŀ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1556 */     this.gunModel['ŀ'].setRotationPoint(83.25F, -13.25F, -0.5F);
/*      */     
/* 1558 */     this.gunModel['Ł'].addShapeBox(23.0F, -14.0F, -4.0F, 54, 1, 9, 0.0F, 0.65F, 0.15F, 0.0F, 0.65F, 0.15F, 0.0F, 0.65F, 0.15F, 0.0F, 0.65F, 0.15F, 0.0F, 2.15F, -0.25F, 0.0F, 1.9F, -0.25F, 0.0F, 1.9F, -0.25F, 0.0F, 2.15F, -0.25F, 0.0F);
/* 1559 */     this.gunModel['Ł'].setRotationPoint(28.5F, -14.0F, -0.5F);
/*      */     
/* 1561 */     this.gunModel['ł'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 7, 0.0F, 0.0F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 1562 */     this.gunModel['ł'].setRotationPoint(83.25F, -9.25F, 0.5F);
/*      */     
/* 1564 */     this.gunModel['Ń'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, -1.0F, -0.1F, -0.25F, -1.0F, -0.1F, -0.25F, -1.0F, 0.25F, -0.25F, -1.0F);
/* 1565 */     this.gunModel['Ń'].setRotationPoint(84.25F, -9.25F, -0.5F);
/*      */     
/* 1567 */     this.gunModel['ń'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F);
/* 1568 */     this.gunModel['ń'].setRotationPoint(81.25F, -9.25F, 0.5F);
/*      */     
/* 1570 */     this.gunModel['Ņ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1571 */     this.gunModel['Ņ'].setRotationPoint(78.25F, -9.25F, 0.5F);
/*      */     
/* 1573 */     this.gunModel['ņ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 1574 */     this.gunModel['ņ'].setRotationPoint(76.25F, -9.25F, 0.5F);
/*      */     
/* 1576 */     this.gunModel['Ň'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1577 */     this.gunModel['Ň'].setRotationPoint(73.25F, -9.25F, 0.5F);
/*      */     
/* 1579 */     this.gunModel['ň'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.5F, -1.25F, -0.2F, 0.0F, -1.25F, -0.2F, 0.0F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 1580 */     this.gunModel['ň'].setRotationPoint(71.25F, -9.25F, 0.5F);
/*      */     
/* 1582 */     this.gunModel['ŉ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, 0.0F, -1.25F, -0.2F, 0.0F, 0.25F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F);
/* 1583 */     this.gunModel['ŉ'].setRotationPoint(68.25F, -9.25F, 0.5F);
/*      */     
/* 1585 */     this.gunModel['Ŋ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.5F, -1.25F, -0.2F, 0.0F, -1.25F, -0.2F, 0.0F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -0.25F, 0.25F, -1.0F);
/* 1586 */     this.gunModel['Ŋ'].setRotationPoint(66.25F, -9.25F, 0.5F);
/*      */     
/* 1588 */     this.gunModel['ŋ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, 0.0F, -1.25F, -0.2F, 0.0F, 0.5F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.25F, -1.0F, 0.0F, 0.5F, -1.0F);
/* 1589 */     this.gunModel['ŋ'].setRotationPoint(63.25F, -9.25F, 0.5F);
/*      */     
/* 1591 */     this.gunModel['Ō'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.5F, -1.5F, -0.35F, 0.0F, -1.5F, -0.35F, 0.0F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, -0.25F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F);
/* 1592 */     this.gunModel['Ō'].setRotationPoint(61.25F, -9.25F, 0.5F);
/*      */     
/* 1594 */     this.gunModel['ō'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, 0.0F, -1.5F, -0.35F, 0.0F, 0.75F, -1.0F, -0.25F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F, 0.0F, 0.75F, -1.0F);
/* 1595 */     this.gunModel['ō'].setRotationPoint(58.25F, -9.25F, 0.5F);
/*      */     
/* 1597 */     this.gunModel['Ŏ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.75F, 0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, -0.75F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, -0.75F, 0.75F, -1.0F);
/* 1598 */     this.gunModel['Ŏ'].setRotationPoint(56.25F, -9.25F, 0.5F);
/*      */     
/* 1600 */     this.gunModel['ŏ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.75F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.75F, -1.75F, -0.5F, 0.75F, 0.75F, -1.0F, -0.75F, 0.75F, -1.0F, -0.75F, 0.75F, -1.0F, 0.75F, 0.75F, -1.0F);
/* 1601 */     this.gunModel['ŏ'].setRotationPoint(54.25F, -9.25F, 0.5F);
/*      */     
/* 1603 */     this.gunModel['Ő'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, -0.75F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, -0.75F, 0.75F, -1.0F);
/* 1604 */     this.gunModel['Ő'].setRotationPoint(51.5F, -9.25F, 0.5F);
/*      */     
/* 1606 */     this.gunModel['ő'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 1.0F, -1.0F, -0.75F, 0.75F, -1.0F, -0.75F, 0.75F, -1.0F, 0.0F, 1.0F, -1.0F);
/* 1607 */     this.gunModel['ő'].setRotationPoint(49.5F, -9.25F, 0.5F);
/*      */     
/* 1609 */     this.gunModel['Œ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 1.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.75F, 1.0F, -2.25F, -0.75F, 0.25F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.25F, 1.0F, -1.0F);
/* 1610 */     this.gunModel['Œ'].setRotationPoint(47.5F, -9.25F, 0.5F);
/*      */     
/* 1612 */     this.gunModel['œ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, -2.25F, -0.75F, 1.0F, -2.25F, -0.75F, 1.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.75F, 0.0F, 1.25F, -1.0F, 0.25F, 1.0F, -1.0F, 0.25F, 1.0F, -1.0F, 0.0F, 1.25F, -1.0F);
/* 1613 */     this.gunModel['œ'].setRotationPoint(43.5F, -9.25F, 0.5F);
/*      */     
/* 1615 */     this.gunModel['Ŕ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 1.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.75F, 1.0F, -2.25F, -0.75F, 0.25F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.25F, 1.25F, -1.0F);
/* 1616 */     this.gunModel['Ŕ'].setRotationPoint(42.5F, -9.25F, 0.5F);
/*      */     
/* 1618 */     this.gunModel['ŕ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 0.0F, -2.25F, -0.75F, 1.0F, -2.25F, -0.75F, 1.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.75F, 0.0F, 1.25F, -1.0F, 0.25F, 1.25F, -1.0F, 0.25F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F);
/* 1619 */     this.gunModel['ŕ'].setRotationPoint(39.5F, -9.25F, 0.5F);
/*      */     
/* 1621 */     this.gunModel['Ŗ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 1.5F, -2.5F, -0.85F, 0.0F, -2.5F, -0.85F, 0.0F, -2.5F, -0.85F, 1.5F, -2.5F, -0.85F, 0.75F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.75F, 1.25F, -1.0F);
/* 1622 */     this.gunModel['Ŗ'].setRotationPoint(38.5F, -9.25F, 0.5F);
/*      */     
/* 1624 */     this.gunModel['ŗ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 0.0F, -2.5F, -0.85F, 1.5F, -2.5F, -0.85F, 1.5F, -2.5F, -0.85F, 0.0F, -2.5F, -0.85F, 0.0F, 1.5F, -1.0F, 0.75F, 1.25F, -1.0F, 0.75F, 1.25F, -1.0F, 0.0F, 1.5F, -1.0F);
/* 1625 */     this.gunModel['ŗ'].setRotationPoint(34.5F, -9.25F, 0.5F);
/*      */     
/* 1627 */     this.gunModel['Ř'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 1.75F, -2.75F, -1.0F, 0.0F, -2.75F, -1.0F, 0.0F, -2.75F, -1.0F, 1.75F, -2.75F, -1.0F, 1.0F, 1.5F, -1.0F, 0.0F, 1.5F, -1.0F, 0.0F, 1.5F, -1.0F, 1.0F, 1.5F, -1.0F);
/* 1628 */     this.gunModel['Ř'].setRotationPoint(33.5F, -9.25F, 0.5F);
/*      */     
/* 1630 */     this.gunModel['ř'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, -1.0F, -2.75F, -1.0F, 1.75F, -2.75F, -1.0F, 1.75F, -2.75F, -1.0F, -1.0F, -2.75F, -1.0F, -1.0F, 1.5F, -1.0F, 1.0F, 1.5F, -1.0F, 1.0F, 1.5F, -1.0F, -1.0F, 1.5F, -1.0F);
/* 1631 */     this.gunModel['ř'].setRotationPoint(29.0F, -9.25F, 0.5F);
/*      */     
/* 1633 */     this.gunModel['Ś'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, 1.75F, -2.75F, -1.0F, 0.0F, -2.75F, -1.0F, 0.0F, -2.75F, -1.0F, 1.75F, -2.75F, -1.0F, 1.0F, 1.5F, -1.0F, 0.0F, 1.5F, -1.0F, 0.0F, 1.5F, -1.0F, 1.0F, 1.5F, -1.0F);
/* 1634 */     this.gunModel['Ś'].setRotationPoint(29.0F, -9.25F, 0.5F);
/*      */     
/* 1636 */     this.gunModel['ś'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 7, 0.0F, -1.0F, -2.75F, -1.0F, 1.75F, -2.75F, -1.0F, 1.75F, -2.75F, -1.0F, -1.0F, -2.75F, -1.0F, -1.0F, 1.75F, -1.0F, 1.0F, 1.5F, -1.0F, 1.0F, 1.5F, -1.0F, -1.0F, 1.75F, -1.0F);
/* 1637 */     this.gunModel['ś'].setRotationPoint(24.5F, -9.25F, 0.5F);
/*      */     
/* 1639 */     this.gunModel['Ŝ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 7, 0.0F, 0.5F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.5F, -3.0F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, -1.0F);
/* 1640 */     this.gunModel['Ŝ'].setRotationPoint(22.5F, -9.25F, 0.5F);
/*      */     
/* 1642 */     this.gunModel['ŝ'].addShapeBox(23.0F, -14.0F, -4.0F, 51, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1643 */     this.gunModel['ŝ'].setRotationPoint(32.25F, -13.25F, -0.5F);
/*      */     
/* 1645 */     this.gunModel['Ş'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F);
/* 1646 */     this.gunModel['Ş'].setRotationPoint(30.25F, -13.25F, -0.5F);
/*      */     
/* 1648 */     this.gunModel['ş'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1649 */     this.gunModel['ş'].setRotationPoint(26.35F, -13.25F, -0.5F);
/*      */     
/* 1651 */     this.gunModel['Š'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, 1.0F, -0.35F, -1.5F, 1.0F, -0.35F, -1.5F, 1.0F, -0.35F, 0.0F, 1.0F, -0.35F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1652 */     this.gunModel['Š'].setRotationPoint(26.35F, -9.25F, -0.5F);
/*      */     
/* 1654 */     this.gunModel['š'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, -1.5F, 1.0F, -0.35F, 0.0F, 1.0F, -0.35F, 0.0F, 1.0F, -0.35F, -1.5F, 1.0F, -0.35F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 1655 */     this.gunModel['š'].setRotationPoint(30.25F, -9.25F, -0.5F);
/*      */     
/* 1657 */     this.gunModel['Ţ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 9, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F);
/* 1658 */     this.gunModel['Ţ'].setRotationPoint(24.35F, -12.25F, -0.5F);
/*      */     
/* 1660 */     this.gunModel['ţ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F);
/* 1661 */     this.gunModel['ţ'].setRotationPoint(32.25F, -11.25F, -0.5F);
/*      */     
/* 1663 */     this.gunModel['Ť'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1664 */     this.gunModel['Ť'].setRotationPoint(34.0F, -10.25F, -0.5F);
/*      */     
/* 1666 */     this.gunModel['ť'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F);
/* 1667 */     this.gunModel['ť'].setRotationPoint(31.25F, -11.25F, -0.5F);
/*      */     
/* 1669 */     this.gunModel['Ŧ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F);
/* 1670 */     this.gunModel['Ŧ'].setRotationPoint(25.85F, -11.25F, -0.5F);
/*      */     
/* 1672 */     this.gunModel['ŧ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1673 */     this.gunModel['ŧ'].setRotationPoint(32.25F, -12.25F, -0.5F);
/*      */     
/* 1675 */     this.gunModel['Ũ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1676 */     this.gunModel['Ũ'].setRotationPoint(33.25F, -12.25F, -0.5F);
/*      */     
/* 1678 */     this.gunModel['ũ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1679 */     this.gunModel['ũ'].setRotationPoint(34.25F, -12.25F, -0.5F);
/*      */     
/* 1681 */     this.gunModel['Ū'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1682 */     this.gunModel['Ū'].setRotationPoint(38.0F, -12.25F, -0.5F);
/*      */     
/* 1684 */     this.gunModel['ū'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1685 */     this.gunModel['ū'].setRotationPoint(39.0F, -12.25F, -0.5F);
/*      */     
/* 1687 */     this.gunModel['Ŭ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1688 */     this.gunModel['Ŭ'].setRotationPoint(38.75F, -10.25F, -0.5F);
/*      */     
/* 1690 */     this.gunModel['ŭ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1691 */     this.gunModel['ŭ'].setRotationPoint(43.75F, -10.25F, -0.5F);
/*      */     
/* 1693 */     this.gunModel['Ů'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1694 */     this.gunModel['Ů'].setRotationPoint(48.75F, -10.25F, -0.5F);
/*      */     
/* 1696 */     this.gunModel['ů'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1697 */     this.gunModel['ů'].setRotationPoint(53.75F, -10.25F, -0.5F);
/*      */     
/* 1699 */     this.gunModel['Ű'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1700 */     this.gunModel['Ű'].setRotationPoint(58.75F, -10.25F, -0.5F);
/*      */     
/* 1702 */     this.gunModel['ű'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1703 */     this.gunModel['ű'].setRotationPoint(63.0F, -10.25F, -0.5F);
/*      */     
/* 1705 */     this.gunModel['Ų'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1706 */     this.gunModel['Ų'].setRotationPoint(68.0F, -10.25F, -0.5F);
/*      */     
/* 1708 */     this.gunModel['ų'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1709 */     this.gunModel['ų'].setRotationPoint(73.0F, -10.25F, -0.5F);
/*      */     
/* 1711 */     this.gunModel['Ŵ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 1712 */     this.gunModel['Ŵ'].setRotationPoint(78.0F, -10.25F, -0.5F);
/*      */     
/* 1714 */     this.gunModel['ŵ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1715 */     this.gunModel['ŵ'].setRotationPoint(42.75F, -12.25F, -0.5F);
/*      */     
/* 1717 */     this.gunModel['Ŷ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1718 */     this.gunModel['Ŷ'].setRotationPoint(43.75F, -12.25F, -0.5F);
/*      */     
/* 1720 */     this.gunModel['ŷ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1721 */     this.gunModel['ŷ'].setRotationPoint(47.75F, -12.25F, -0.5F);
/*      */     
/* 1723 */     this.gunModel['Ÿ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1724 */     this.gunModel['Ÿ'].setRotationPoint(48.75F, -12.25F, -0.5F);
/*      */     
/* 1726 */     this.gunModel['Ź'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1727 */     this.gunModel['Ź'].setRotationPoint(52.75F, -12.25F, -0.5F);
/*      */     
/* 1729 */     this.gunModel['ź'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1730 */     this.gunModel['ź'].setRotationPoint(53.75F, -12.25F, -0.5F);
/*      */     
/* 1732 */     this.gunModel['Ż'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1733 */     this.gunModel['Ż'].setRotationPoint(57.75F, -12.25F, -0.5F);
/*      */     
/* 1735 */     this.gunModel['ż'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1736 */     this.gunModel['ż'].setRotationPoint(58.75F, -12.25F, -0.5F);
/*      */     
/* 1738 */     this.gunModel['Ž'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1739 */     this.gunModel['Ž'].setRotationPoint(67.0F, -12.25F, -0.5F);
/*      */     
/* 1741 */     this.gunModel['ž'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1742 */     this.gunModel['ž'].setRotationPoint(68.0F, -12.25F, -0.5F);
/*      */     
/* 1744 */     this.gunModel['ſ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1745 */     this.gunModel['ſ'].setRotationPoint(72.0F, -12.25F, -0.5F);
/*      */     
/* 1747 */     this.gunModel['ƀ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1748 */     this.gunModel['ƀ'].setRotationPoint(73.0F, -12.25F, -0.5F);
/*      */     
/* 1750 */     this.gunModel['Ɓ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1751 */     this.gunModel['Ɓ'].setRotationPoint(77.0F, -12.25F, -0.5F);
/*      */     
/* 1753 */     this.gunModel['Ƃ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1754 */     this.gunModel['Ƃ'].setRotationPoint(78.0F, -12.25F, -0.5F);
/*      */     
/* 1756 */     this.gunModel['ƃ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1757 */     this.gunModel['ƃ'].setRotationPoint(82.0F, -12.25F, -0.5F);
/*      */     
/* 1759 */     this.gunModel['Ƅ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1760 */     this.gunModel['Ƅ'].setRotationPoint(83.0F, -12.25F, -0.5F);
/*      */     
/* 1762 */     this.gunModel['ƅ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 9, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 1763 */     this.gunModel['ƅ'].setRotationPoint(83.0F, -10.25F, -0.5F);
/*      */     
/* 1765 */     this.gunModel['Ɔ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1766 */     this.gunModel['Ɔ'].setRotationPoint(79.0F, -12.25F, -0.5F);
/*      */     
/* 1768 */     this.gunModel['Ƈ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1769 */     this.gunModel['Ƈ'].setRotationPoint(82.0F, -8.5F, 0.5F);
/*      */     
/* 1771 */     this.gunModel['ƈ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1772 */     this.gunModel['ƈ'].setRotationPoint(81.0F, -8.5F, 0.5F);
/*      */     
/* 1774 */     this.gunModel['Ɖ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1775 */     this.gunModel['Ɖ'].setRotationPoint(77.0F, -8.5F, 0.5F);
/*      */     
/* 1777 */     this.gunModel['Ɗ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1778 */     this.gunModel['Ɗ'].setRotationPoint(76.0F, -8.5F, 0.5F);
/*      */     
/* 1780 */     this.gunModel['Ƌ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1781 */     this.gunModel['Ƌ'].setRotationPoint(72.0F, -8.5F, 0.5F);
/*      */     
/* 1783 */     this.gunModel['ƌ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1784 */     this.gunModel['ƌ'].setRotationPoint(71.0F, -8.5F, 0.5F);
/*      */     
/* 1786 */     this.gunModel['ƍ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1787 */     this.gunModel['ƍ'].setRotationPoint(67.0F, -8.5F, 0.5F);
/*      */     
/* 1789 */     this.gunModel['Ǝ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1790 */     this.gunModel['Ǝ'].setRotationPoint(66.0F, -8.5F, 0.5F);
/*      */     
/* 1792 */     this.gunModel['Ə'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1793 */     this.gunModel['Ə'].setRotationPoint(62.0F, -8.5F, 0.5F);
/*      */     
/* 1795 */     this.gunModel['Ɛ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.6F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.6F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1796 */     this.gunModel['Ɛ'].setRotationPoint(61.0F, -8.5F, 0.5F);
/*      */     
/* 1798 */     this.gunModel['Ƒ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1799 */     this.gunModel['Ƒ'].setRotationPoint(62.0F, -12.25F, -0.5F);
/*      */     
/* 1801 */     this.gunModel['ƒ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 9, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1802 */     this.gunModel['ƒ'].setRotationPoint(63.0F, -12.25F, -0.5F);
/*      */     
/* 1804 */     this.gunModel['Ɠ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1805 */     this.gunModel['Ɠ'].setRotationPoint(-93.5F, -8.75F, 1.0F);
/*      */     
/* 1807 */     this.gunModel['Ɣ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1808 */     this.gunModel['Ɣ'].setRotationPoint(-93.5F, -7.75F, 1.0F);
/*      */     
/* 1810 */     this.gunModel['ƕ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 6, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1811 */     this.gunModel['ƕ'].setRotationPoint(-93.5F, -6.75F, 1.0F);
/*      */     
/* 1813 */     this.gunModel['Ɩ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 4, 6, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1814 */     this.gunModel['Ɩ'].setRotationPoint(-93.5F, -4.75F, 1.0F);
/*      */     
/* 1816 */     this.gunModel['Ɨ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 4, 5, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1817 */     this.gunModel['Ɨ'].setRotationPoint(-91.5F, -7.75F, 1.5F);
/*      */     
/* 1819 */     this.gunModel['Ƙ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 5, 0.0F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.5F, 0.0F, -2.75F, 0.5F, 0.0F, -2.75F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F);
/* 1820 */     this.gunModel['Ƙ'].setRotationPoint(-91.5F, -3.75F, 1.5F);
/*      */     
/* 1822 */     this.gunModel['ƙ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 1, 7, 0.0F, 0.0F, 1.25F, 0.0F, 0.75F, 1.25F, 0.0F, 0.75F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1823 */     this.gunModel['ƙ'].setRotationPoint(-100.25F, -18.75F, 0.5F);
/*      */     
/* 1825 */     this.gunModel['ƚ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1826 */     this.gunModel['ƚ'].setRotationPoint(-94.5F, -21.25F, 2.0F);
/*      */     
/* 1828 */     this.gunModel['ƛ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 7, 0.0F, 0.0F, 1.0F, -1.5F, 0.75F, 0.5F, -1.5F, 0.75F, 0.5F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1829 */     this.gunModel['ƛ'].setRotationPoint(-99.25F, -20.75F, 0.5F);
/*      */     
/* 1831 */     this.gunModel['Ɯ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 1.5F, -1.5F, 0.75F, 1.0F, -1.5F, 0.75F, 1.0F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1832 */     this.gunModel['Ɯ'].setRotationPoint(-101.0F, -20.75F, 0.5F);
/*      */     
/* 1834 */     this.gunModel['Ɲ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1835 */     this.gunModel['Ɲ'].setRotationPoint(-102.25F, -20.75F, 0.5F);
/*      */     
/* 1837 */     this.gunModel['ƞ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 0.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1838 */     this.gunModel['ƞ'].setRotationPoint(-103.5F, -20.75F, 0.5F);
/*      */     
/* 1840 */     this.gunModel['Ɵ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 9, 7, 0.0F, 0.0F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/* 1841 */     this.gunModel['Ɵ'].setRotationPoint(-103.5F, -18.5F, 0.5F);
/*      */     
/* 1843 */     this.gunModel['Ơ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 9, 7, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1844 */     this.gunModel['Ơ'].setRotationPoint(-102.25F, -18.75F, 0.5F);
/*      */     
/* 1846 */     this.gunModel['ơ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 9, 7, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1847 */     this.gunModel['ơ'].setRotationPoint(-102.25F, -8.5F, 0.5F);
/*      */     
/* 1849 */     this.gunModel['Ƣ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 8, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F);
/* 1850 */     this.gunModel['Ƣ'].setRotationPoint(-102.25F, 0.5F, 0.5F);
/*      */     
/* 1852 */     this.gunModel['ƣ'].addShapeBox(23.0F, -14.0F, -4.0F, 7, 1, 7, 0.0F, -0.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.25F, 0.75F, -1.0F, -0.75F, 0.75F, -1.0F, -0.75F, 0.75F, -1.0F, -1.25F, 0.75F, -1.0F);
/* 1853 */     this.gunModel['ƣ'].setRotationPoint(-102.25F, 9.5F, 0.5F);
/*      */     
/* 1855 */     this.gunModel['Ƥ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1856 */     this.gunModel['Ƥ'].setRotationPoint(-98.5F, -17.75F, 1.0F);
/*      */     
/* 1858 */     this.gunModel['ƥ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 19, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1859 */     this.gunModel['ƥ'].setRotationPoint(-100.25F, -17.75F, 1.0F);
/*      */     
/* 1861 */     this.gunModel['Ʀ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1862 */     this.gunModel['Ʀ'].setRotationPoint(-100.25F, -17.75F, 0.5F);
/*      */     
/* 1864 */     this.gunModel['Ƨ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1865 */     this.gunModel['Ƨ'].setRotationPoint(-100.25F, -16.75F, 0.5F);
/*      */     
/* 1867 */     this.gunModel['ƨ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1868 */     this.gunModel['ƨ'].setRotationPoint(-100.25F, -15.25F, 0.5F);
/*      */     
/* 1870 */     this.gunModel['Ʃ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1871 */     this.gunModel['Ʃ'].setRotationPoint(-100.25F, -8.75F, 0.5F);
/*      */     
/* 1873 */     this.gunModel['ƪ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 10, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1874 */     this.gunModel['ƪ'].setRotationPoint(-100.25F, -0.25F, 0.5F);
/*      */     
/* 1876 */     this.gunModel['ƫ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 6, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1877 */     this.gunModel['ƫ'].setRotationPoint(-98.5F, 10.0F, 1.0F);
/*      */     
/* 1879 */     this.gunModel['Ƭ'].addShapeBox(23.0F, -14.0F, -4.0F, 7, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1880 */     this.gunModel['Ƭ'].setRotationPoint(-14.5F, 4.0F, 2.0F);
/*      */     
/* 1882 */     this.gunModel['ƭ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1883 */     this.gunModel['ƭ'].setRotationPoint(-7.75F, 2.5F, 2.0F);
/*      */     
/* 1885 */     this.gunModel['Ʈ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1886 */     this.gunModel['Ʈ'].setRotationPoint(-7.75F, 5.25F, 2.0F);
/*      */     
/* 1888 */     this.gunModel['Ư'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1889 */     this.gunModel['Ư'].setRotationPoint(57.75F, -8.5F, 0.5F);
/*      */     
/* 1891 */     this.gunModel['ư'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1892 */     this.gunModel['ư'].setRotationPoint(56.75F, -8.5F, 0.5F);
/*      */     
/* 1894 */     this.gunModel['Ʊ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1895 */     this.gunModel['Ʊ'].setRotationPoint(52.75F, -8.5F, 0.5F);
/*      */     
/* 1897 */     this.gunModel['Ʋ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1898 */     this.gunModel['Ʋ'].setRotationPoint(51.75F, -8.5F, 0.5F);
/*      */     
/* 1900 */     this.gunModel['Ƴ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1901 */     this.gunModel['Ƴ'].setRotationPoint(47.75F, -8.5F, 0.5F);
/*      */     
/* 1903 */     this.gunModel['ƴ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1904 */     this.gunModel['ƴ'].setRotationPoint(46.75F, -8.5F, 0.5F);
/*      */     
/* 1906 */     this.gunModel['Ƶ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1907 */     this.gunModel['Ƶ'].setRotationPoint(42.75F, -8.5F, 0.5F);
/*      */     
/* 1909 */     this.gunModel['ƶ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1910 */     this.gunModel['ƶ'].setRotationPoint(41.75F, -8.5F, 0.5F);
/*      */     
/* 1912 */     this.gunModel['Ʒ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1913 */     this.gunModel['Ʒ'].setRotationPoint(37.75F, -8.5F, 0.5F);
/*      */     
/* 1915 */     this.gunModel['Ƹ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1916 */     this.gunModel['Ƹ'].setRotationPoint(36.75F, -8.5F, 0.5F);
/*      */     
/* 1918 */     this.gunModel['ƹ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1919 */     this.gunModel['ƹ'].setRotationPoint(33.0F, -8.5F, 0.5F);
/*      */     
/* 1921 */     this.gunModel['ƺ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1922 */     this.gunModel['ƺ'].setRotationPoint(32.0F, -8.5F, 0.5F);
/*      */     
/* 1924 */     this.gunModel['ƻ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 7, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1925 */     this.gunModel['ƻ'].setRotationPoint(82.75F, -9.25F, 0.5F);
/*      */     
/* 1927 */     this.gunModel['Ƽ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 7, 0.0F, -0.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1928 */     this.gunModel['Ƽ'].setRotationPoint(77.75F, -9.25F, 0.5F);
/*      */     
/* 1930 */     this.gunModel['ƽ'].addShapeBox(23.0F, -14.0F, -4.0F, 11, 1, 7, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F);
/* 1931 */     this.gunModel['ƽ'].setRotationPoint(62.75F, -9.0F, 0.5F);
/*      */     
/* 1933 */     this.gunModel['ƾ'].addShapeBox(23.0F, -14.0F, -4.0F, 6, 1, 7, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.25F, -0.35F, -0.5F, 0.25F, -0.35F, -0.5F, 0.25F, -0.35F, -0.5F, 0.25F, -0.35F);
/* 1934 */     this.gunModel['ƾ'].setRotationPoint(57.75F, -9.0F, 0.5F);
/*      */     
/* 1936 */     this.gunModel['ƿ'].addShapeBox(23.0F, -14.0F, -4.0F, 10, 1, 7, 0.0F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F);
/* 1937 */     this.gunModel['ƿ'].setRotationPoint(48.75F, -9.0F, 0.5F);
/*      */     
/* 1939 */     this.gunModel['ǀ'].addShapeBox(23.0F, -14.0F, -4.0F, 11, 1, 7, 0.0F, -0.75F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 1.0F, -0.75F, -0.25F, 1.0F, -0.75F, -0.25F, 1.0F, -0.75F, -0.75F, 1.0F, -0.75F);
/* 1940 */     this.gunModel['ǀ'].setRotationPoint(38.75F, -9.0F, 0.5F);
/*      */     
/* 1942 */     this.gunModel['ǁ'].addShapeBox(23.0F, -14.0F, -4.0F, 6, 1, 7, 0.0F, -0.75F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 1.25F, -0.85F, -0.25F, 1.25F, -0.85F, -0.25F, 1.25F, -0.85F, -0.75F, 1.25F, -0.85F);
/* 1943 */     this.gunModel['ǁ'].setRotationPoint(33.75F, -9.0F, 0.5F);
/*      */     
/* 1945 */     this.gunModel['ǂ'].addShapeBox(23.0F, -14.0F, -4.0F, 10, 1, 7, 0.0F, -0.75F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 1.5F, -1.0F, -0.25F, 1.5F, -1.0F, -0.25F, 1.5F, -1.0F, -0.75F, 1.5F, -1.0F);
/* 1946 */     this.gunModel['ǂ'].setRotationPoint(24.75F, -9.0F, 0.5F);
/*      */     
/* 1948 */     this.gunModel['ǃ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 7, 0.0F, -1.1F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -1.1F, -0.75F, 0.0F, -0.15F, 1.75F, -1.0F, -0.25F, 1.75F, -1.0F, -0.25F, 1.75F, -1.0F, -0.15F, 1.75F, -1.0F);
/* 1949 */     this.gunModel['ǃ'].setRotationPoint(22.75F, -9.0F, 0.5F);
/*      */     
/* 1951 */     this.gunModel['Ǆ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1952 */     this.gunModel['Ǆ'].setRotationPoint(49.75F, -12.25F, -0.5F);
/*      */     
/* 1954 */     this.gunModel['ǅ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1955 */     this.gunModel['ǅ'].setRotationPoint(54.75F, -12.25F, -0.5F);
/*      */     
/* 1957 */     this.gunModel['ǆ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1958 */     this.gunModel['ǆ'].setRotationPoint(59.75F, -12.25F, -0.5F);
/*      */     
/* 1960 */     this.gunModel['Ǉ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1961 */     this.gunModel['Ǉ'].setRotationPoint(64.0F, -12.25F, -0.5F);
/*      */     
/* 1963 */     this.gunModel['ǈ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1964 */     this.gunModel['ǈ'].setRotationPoint(69.0F, -12.25F, -0.5F);
/*      */     
/* 1966 */     this.gunModel['ǉ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1967 */     this.gunModel['ǉ'].setRotationPoint(74.0F, -12.25F, -0.5F);
/*      */     
/* 1969 */     this.gunModel['Ǌ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1970 */     this.gunModel['Ǌ'].setRotationPoint(44.75F, -12.25F, -0.5F);
/*      */     
/* 1972 */     this.gunModel['ǋ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1973 */     this.gunModel['ǋ'].setRotationPoint(39.75F, -12.25F, -0.5F);
/*      */     
/* 1975 */     this.gunModel['ǌ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1976 */     this.gunModel['ǌ'].setRotationPoint(35.0F, -12.25F, -0.5F);
/*      */     
/* 1978 */     this.gunModel['Ǎ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 9, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 1979 */     this.gunModel['Ǎ'].setRotationPoint(23.35F, -10.25F, -0.5F);
/*      */     
/* 1981 */     this.gunModel['ǎ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 6, 0.0F, 0.25F, -1.0F, -0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
/* 1982 */     this.gunModel['ǎ'].setRotationPoint(47.0F, -27.75F, 1.0F);
/*      */     
/* 1984 */     this.gunModel['Ǐ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, -1.0F, 0.0F, -0.95F);
/* 1985 */     this.gunModel['Ǐ'].setRotationPoint(55.75F, -24.5F, 0.0F);
/*      */     
/* 1987 */     this.gunModel['ǐ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 1988 */     this.gunModel['ǐ'].setRotationPoint(58.0F, -24.5F, 0.0F);
/*      */     
/* 1990 */     this.gunModel['Ǒ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, -1.0F, 0.0F, -0.95F);
/* 1991 */     this.gunModel['Ǒ'].setRotationPoint(64.5F, -24.5F, 0.0F);
/*      */     
/* 1993 */     this.gunModel['ǒ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 1994 */     this.gunModel['ǒ'].setRotationPoint(66.75F, -24.5F, 0.0F);
/*      */     
/* 1996 */     this.gunModel['Ǔ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1997 */     this.gunModel['Ǔ'].setRotationPoint(64.5F, -23.0F, 0.0F);
/*      */     
/* 1999 */     this.gunModel['ǔ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2000 */     this.gunModel['ǔ'].setRotationPoint(66.75F, -23.0F, 0.0F);
/*      */     
/* 2002 */     this.gunModel['Ǖ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, -1.0F, 0.0F, -0.95F);
/* 2003 */     this.gunModel['Ǖ'].setRotationPoint(72.0F, -24.5F, 0.0F);
/*      */     
/* 2005 */     this.gunModel['ǖ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2006 */     this.gunModel['ǖ'].setRotationPoint(72.0F, -23.0F, 0.0F);
/*      */     
/* 2008 */     this.gunModel['Ǘ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2009 */     this.gunModel['Ǘ'].setRotationPoint(55.75F, -23.0F, 0.0F);
/*      */     
/* 2011 */     this.gunModel['ǘ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2012 */     this.gunModel['ǘ'].setRotationPoint(58.0F, -23.0F, 0.0F);
/*      */     
/* 2014 */     this.gunModel['Ǚ'].addShapeBox(23.0F, -14.0F, -4.0F, 8, 10, 2, 0.0F, 0.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2015 */     this.gunModel['Ǚ'].setRotationPoint(12.0F, -21.5F, 0.0F);
/*      */     
/* 2017 */     this.gunModel['ǚ'].addShapeBox(23.0F, -14.0F, -4.0F, 7, 10, 2, 0.0F, 0.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2018 */     this.gunModel['ǚ'].setRotationPoint(-18.0F, -21.5F, 0.0F);
/*      */     
/* 2020 */     this.gunModel['Ǜ'].addShapeBox(23.0F, -14.0F, -4.0F, 15, 3, 2, 0.0F, 0.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2021 */     this.gunModel['Ǜ'].setRotationPoint(-7.0F, -21.5F, 0.0F);
/*      */     
/* 2023 */     this.gunModel['ǜ'].addShapeBox(23.0F, -14.0F, -4.0F, 15, 3, 2, 0.0F, 0.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 3.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2024 */     this.gunModel['ǜ'].setRotationPoint(-7.0F, -14.5F, 0.0F);
/*      */     
/* 2026 */     this.gunModel['ǝ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2027 */     this.gunModel['ǝ'].setRotationPoint(-7.5F, -16.0F, 0.0F);
/*      */     
/* 2029 */     this.gunModel['Ǟ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2030 */     this.gunModel['Ǟ'].setRotationPoint(-7.5F, -19.0F, 0.0F);
/*      */     
/* 2032 */     this.gunModel['ǟ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2033 */     this.gunModel['ǟ'].setRotationPoint(10.5F, -19.0F, 0.0F);
/*      */     
/* 2035 */     this.gunModel['Ǡ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2036 */     this.gunModel['Ǡ'].setRotationPoint(10.5F, -16.0F, 0.0F);
/*      */     
/* 2038 */     this.gunModel['ǡ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 5, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2039 */     this.gunModel['ǡ'].setRotationPoint(-8.5F, -19.5F, -3.0F);
/*      */     
/* 2041 */     this.gunModel['Ǣ'].addShapeBox(23.0F, -14.0F, -4.0F, 8, 10, 6, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, -1.0F, -0.25F, -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -0.25F, -1.0F, -1.0F);
/* 2042 */     this.gunModel['Ǣ'].setRotationPoint(-42.1F, 4.0F, 1.0F);
/*      */     
/* 2044 */     this.gunModel['ǣ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 6, 6, 0.0F, -3.75F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, -3.75F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2045 */     this.gunModel['ǣ'].setRotationPoint(-36.1F, -2.0F, 1.0F);
/*      */     
/* 2047 */     this.gunModel['Ǥ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2048 */     this.gunModel['Ǥ'].setRotationPoint(-32.35F, -4.0F, 1.0F);
/*      */     
/* 2050 */     this.gunModel['ǥ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2051 */     this.gunModel['ǥ'].setRotationPoint(-32.35F, -5.0F, 1.0F);
/*      */     
/* 2053 */     this.gunModel['Ǧ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 6, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2054 */     this.gunModel['Ǧ'].setRotationPoint(-32.35F, -6.75F, 1.0F);
/*      */     
/* 2056 */     this.gunModel['ǧ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 6, 0.0F, 1.5F, -1.25F, 0.0F, 0.8F, -1.25F, 0.0F, 0.8F, -1.25F, 0.0F, 1.5F, -1.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F);
/* 2057 */     this.gunModel['ǧ'].setRotationPoint(-32.35F, -7.75F, 1.0F);
/*      */     
/* 2059 */     this.gunModel['Ǩ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 6, 0.0F, 3.5F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 3.5F, -1.5F, -1.0F, 1.5F, 0.25F, 0.0F, 0.8F, 0.25F, 0.0F, 0.8F, 0.25F, 0.0F, 1.5F, 0.25F, -1.0F);
/* 2060 */     this.gunModel['Ǩ'].setRotationPoint(-32.35F, -8.75F, 1.0F);
/*      */     
/* 2062 */     this.gunModel['ǩ'].addShapeBox(23.0F, -14.0F, -4.0F, 7, 1, 6, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/* 2063 */     this.gunModel['ǩ'].setRotationPoint(-35.35F, -8.25F, 1.0F);
/*      */     
/* 2065 */     this.gunModel['Ǫ'].addShapeBox(23.0F, -14.0F, -4.0F, 48, 4, 6, 0.0F, 0.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2066 */     this.gunModel['Ǫ'].setRotationPoint(-29.0F, -12.5F, 1.0F);
/*      */     
/* 2068 */     this.gunModel['ǫ'].addShapeBox(23.0F, -14.0F, -4.0F, 31, 10, 4, 0.0F, 0.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2069 */     this.gunModel['ǫ'].setRotationPoint(-4.0F, -21.5F, 3.0F);
/*      */     
/* 2071 */     this.gunModel['Ǭ'].addShapeBox(23.0F, -14.0F, -4.0F, 12, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2072 */     this.gunModel['Ǭ'].setRotationPoint(10.0F, -8.5F, 1.0F);
/*      */     
/* 2074 */     this.gunModel['ǭ'].addShapeBox(23.0F, -14.0F, -4.0F, 51, 2, 8, 0.0F, -1.0F, 1.25F, 0.0F, 1.0F, 1.25F, 0.0F, 1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/* 2075 */     this.gunModel['ǭ'].setRotationPoint(32.0F, -10.25F, 0.0F);
/*      */     
/* 2077 */     this.gunModel['Ǯ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 4, 8, 0.0F, -1.0F, 1.25F, 0.25F, 1.0F, 1.25F, 0.25F, 1.0F, 1.25F, 0.25F, -1.0F, 1.25F, 0.25F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F);
/* 2078 */     this.gunModel['Ǯ'].setRotationPoint(26.0F, -12.25F, 0.0F);
/*      */     
/* 2080 */     this.gunModel['ǯ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2081 */     this.gunModel['ǯ'].setRotationPoint(28.75F, -11.25F, 0.0F);
/*      */     
/* 2083 */     this.gunModel['ǰ'].addShapeBox(23.0F, -14.0F, -4.0F, 26, 5, 6, 0.0F, 0.5F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 2084 */     this.gunModel['ǰ'].setRotationPoint(-33.75F, -28.0F, 1.0F);
/*      */     
/* 2086 */     this.gunModel['Ǳ'].addShapeBox(23.0F, -14.0F, -4.0F, 32, 5, 6, 0.0F, 2.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2087 */     this.gunModel['Ǳ'].setRotationPoint(-73.0F, -20.5F, 1.0F);
/*      */     
/* 2089 */     this.gunModel['ǲ'].addShapeBox(23.0F, -14.0F, -4.0F, 54, 1, 5, 0.0F, 0.65F, 0.15F, 0.0F, 0.65F, 0.15F, 0.0F, 0.65F, 0.15F, 0.0F, 0.65F, 0.15F, 0.0F, 2.15F, -0.25F, 0.0F, 1.9F, -0.25F, 0.0F, 1.9F, -0.25F, 0.0F, 2.15F, -0.25F, 0.0F);
/* 2090 */     this.gunModel['ǲ'].setRotationPoint(28.5F, -14.0F, 1.5F);
/*      */     
/* 2092 */     this.gunModel['ǳ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 3, 0.0F, 0.5F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.5F, -3.0F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, -1.0F);
/* 2093 */     this.gunModel['ǳ'].setRotationPoint(22.5F, -9.25F, 2.5F);
/*      */     
/* 2095 */     this.gunModel['Ǵ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 5, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F);
/* 2096 */     this.gunModel['Ǵ'].setRotationPoint(24.35F, -12.25F, 1.5F);
/*      */     
/* 2098 */     this.gunModel['ǵ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 3, 0.0F, -1.1F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -1.1F, -0.75F, 0.0F, -0.15F, 1.75F, -1.0F, -0.25F, 1.75F, -1.0F, -0.25F, 1.75F, -1.0F, -0.15F, 1.75F, -1.0F);
/* 2099 */     this.gunModel['ǵ'].setRotationPoint(22.75F, -9.0F, 2.5F);
/*      */     
/* 2101 */     this.gunModel['Ƕ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 2, 5, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2102 */     this.gunModel['Ƕ'].setRotationPoint(23.35F, -10.25F, 1.5F);
/*      */     
/* 2104 */     this.gunModel['Ƿ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 2, 5, 0.0F, 0.25F, 0.25F, 0.0F, -0.9F, 0.25F, 0.0F, -0.9F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, 0.25F, 0.0F, -0.8F);
/* 2105 */     this.gunModel['Ƿ'].setRotationPoint(84.25F, -11.0F, 1.5F);
/*      */     
/* 2107 */     this.gunModel['Ǹ'].addShapeBox(23.0F, -14.0F, -4.0F, 2, 1, 5, 0.0F, 0.25F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2108 */     this.gunModel['Ǹ'].setRotationPoint(84.25F, -12.25F, 1.5F);
/*      */     
/* 2110 */     this.gunModel['ǹ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2111 */     this.gunModel['ǹ'].setRotationPoint(83.25F, -13.25F, 1.5F);
/*      */     
/* 2113 */     this.gunModel['Ǻ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 3, 2, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2114 */     this.gunModel['Ǻ'].setRotationPoint(-34.75F, -36.75F, -1.0F);
/*      */     
/* 2116 */     this.gunModel['ǻ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 3, 2, 0.0F, -0.25F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2117 */     this.gunModel['ǻ'].setRotationPoint(-34.75F, -41.25F, -1.0F);
/*      */     
/* 2119 */     this.gunModel['Ǽ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 3, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F);
/* 2120 */     this.gunModel['Ǽ'].setRotationPoint(-34.75F, -36.75F, 7.0F);
/*      */     
/* 2122 */     this.gunModel['ǽ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 3, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, -0.25F, -0.5F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2123 */     this.gunModel['ǽ'].setRotationPoint(-34.75F, -41.25F, 7.0F);
/*      */     
/* 2125 */     this.gunModel['Ǿ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 2, 2, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2126 */     this.gunModel['Ǿ'].setRotationPoint(-34.75F, -38.75F, -1.0F);
/*      */     
/* 2128 */     this.gunModel['ǿ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 2, 2, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2129 */     this.gunModel['ǿ'].setRotationPoint(-34.75F, -38.75F, 6.5F);
/*      */     
/* 2131 */     this.gunModel['Ȁ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 1, 4, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, -0.25F, -0.5F, -3.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F);
/* 2132 */     this.gunModel['Ȁ'].setRotationPoint(-34.75F, -42.0F, 3.5F);
/*      */     
/* 2134 */     this.gunModel['ȁ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 1, 3, 0.0F, -0.25F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/* 2135 */     this.gunModel['ȁ'].setRotationPoint(-34.75F, -42.0F, 0.5F);
/*      */     
/* 2137 */     this.gunModel['Ȃ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 2, 6, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2138 */     this.gunModel['Ȃ'].setRotationPoint(-34.75F, -40.5F, 1.0F);
/*      */     
/* 2140 */     this.gunModel['ȃ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 4, 1, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2141 */     this.gunModel['ȃ'].setRotationPoint(-34.75F, -38.75F, 1.0F);
/*      */     
/* 2143 */     this.gunModel['Ȅ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 4, 1, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2144 */     this.gunModel['Ȅ'].setRotationPoint(-34.75F, -38.75F, 6.0F);
/*      */     
/* 2146 */     this.gunModel['ȅ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 2147 */     this.gunModel['ȅ'].setRotationPoint(-34.75F, -39.25F, 2.0F);
/*      */     
/* 2149 */     this.gunModel['Ȇ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2150 */     this.gunModel['Ȇ'].setRotationPoint(-34.75F, -36.25F, 2.0F);
/*      */     
/* 2152 */     this.gunModel['ȇ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2153 */     this.gunModel['ȇ'].setRotationPoint(-34.75F, -36.25F, 5.0F);
/*      */     
/* 2155 */     this.gunModel['Ȉ'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2156 */     this.gunModel['Ȉ'].setRotationPoint(-34.75F, -39.25F, 5.0F);
/*      */     
/* 2158 */     this.gunModel['ȉ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2159 */     this.gunModel['ȉ'].setRotationPoint(-35.5F, -36.25F, 1.0F);
/*      */     
/* 2161 */     this.gunModel['Ȋ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2162 */     this.gunModel['Ȋ'].setRotationPoint(-35.5F, -40.25F, 2.0F);
/*      */     
/* 2164 */     this.gunModel['ȋ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2165 */     this.gunModel['ȋ'].setRotationPoint(-35.5F, -40.25F, 5.0F);
/*      */     
/* 2167 */     this.gunModel['Ȍ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2168 */     this.gunModel['Ȍ'].setRotationPoint(-35.5F, -36.25F, 6.0F);
/*      */     
/* 2170 */     this.gunModel['ȍ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2171 */     this.gunModel['ȍ'].setRotationPoint(-35.5F, -38.25F, 6.0F);
/*      */     
/* 2173 */     this.gunModel['Ȏ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2174 */     this.gunModel['Ȏ'].setRotationPoint(-35.5F, -40.25F, 3.0F);
/*      */     
/* 2176 */     this.gunModel['ȏ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2177 */     this.gunModel['ȏ'].setRotationPoint(-35.5F, -38.25F, 1.0F);
/*      */     
/* 2179 */     this.gunModel['Ȑ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2180 */     this.gunModel['Ȑ'].setRotationPoint(-35.5F, -35.25F, 3.0F);
/*      */     
/* 2182 */     this.gunModel['ȑ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2183 */     this.gunModel['ȑ'].setRotationPoint(-35.5F, -36.25F, 2.0F);
/*      */     
/* 2185 */     this.gunModel['Ȓ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2186 */     this.gunModel['Ȓ'].setRotationPoint(-35.5F, -36.25F, 5.0F);
/*      */     
/* 2188 */     this.gunModel['ȓ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2189 */     this.gunModel['ȓ'].setRotationPoint(-35.5F, -35.25F, 2.0F);
/*      */     
/* 2191 */     this.gunModel['Ȕ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2192 */     this.gunModel['Ȕ'].setRotationPoint(-35.5F, -35.25F, 5.0F);
/*      */     
/* 2194 */     this.gunModel['ȕ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2195 */     this.gunModel['ȕ'].setRotationPoint(-35.5F, -39.25F, 6.0F);
/*      */     
/* 2197 */     this.gunModel['Ȗ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2198 */     this.gunModel['Ȗ'].setRotationPoint(-35.5F, -39.25F, 1.0F);
/*      */     
/* 2200 */     this.gunModel['ȗ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2201 */     this.gunModel['ȗ'].setRotationPoint(-35.5F, -39.25F, 2.0F);
/*      */     
/* 2203 */     this.gunModel['Ș'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2204 */     this.gunModel['Ș'].setRotationPoint(-35.5F, -39.25F, 5.0F);
/*      */     
/* 2206 */     this.gunModel['ș'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 2, 8, 0.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2207 */     this.gunModel['ș'].setRotationPoint(-34.75F, -34.0F, 0.0F);
/*      */     
/* 2209 */     this.gunModel['Ț'].addShapeBox(23.0F, -14.0F, -4.0F, 17, 2, 6, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F);
/* 2210 */     this.gunModel['Ț'].setRotationPoint(-34.75F, -34.75F, 1.0F);
/*      */     
/* 2212 */     this.gunModel['ț'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2213 */     this.gunModel['ț'].setRotationPoint(-17.5F, -37.75F, 3.5F);
/*      */     
/* 2215 */     this.gunModel['Ȝ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 2216 */     this.gunModel['Ȝ'].setRotationPoint(-17.5F, -39.75F, 3.5F);
/*      */     
/* 2218 */     this.gunModel['ȝ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 2219 */     this.gunModel['ȝ'].setRotationPoint(-17.5F, -36.25F, 3.5F);
/*      */     
/* 2221 */     this.gunModel['Ȟ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 2222 */     this.gunModel['Ȟ'].setRotationPoint(-17.5F, -37.75F, 1.5F);
/*      */     
/* 2224 */     this.gunModel['ȟ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 2225 */     this.gunModel['ȟ'].setRotationPoint(-17.5F, -37.75F, 5.0F);
/*      */     
/* 2227 */     this.gunModel['Ƞ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 3, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 2228 */     this.gunModel['Ƞ'].setRotationPoint(-22.75F, -36.25F, -0.5F);
/*      */     
/* 2230 */     this.gunModel['ȡ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 4, 3, 0.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2231 */     this.gunModel['ȡ'].setRotationPoint(-22.75F, -38.25F, -3.5F);
/*      */     
/* 2233 */     this.gunModel['Ȣ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 2, 5, 0.0F, -0.25F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2234 */     this.gunModel['Ȣ'].setRotationPoint(-22.75F, -34.25F, -3.5F);
/*      */     
/* 2236 */     this.gunModel['ȣ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 1, 3, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2237 */     this.gunModel['ȣ'].setRotationPoint(-22.75F, -34.75F, -3.5F);
/*      */     
/* 2239 */     this.gunModel['Ȥ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 4, 3, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F);
/* 2240 */     this.gunModel['Ȥ'].setRotationPoint(-22.75F, -38.25F, 8.5F);
/*      */     
/* 2242 */     this.gunModel['ȥ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 1, 3, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2243 */     this.gunModel['ȥ'].setRotationPoint(-22.75F, -34.75F, 7.5F);
/*      */     
/* 2245 */     this.gunModel['Ȧ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 2, 5, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -0.25F, 0.0F, -3.5F);
/* 2246 */     this.gunModel['Ȧ'].setRotationPoint(-22.75F, -34.25F, 6.5F);
/*      */     
/* 2248 */     this.gunModel['ȧ'].addShapeBox(23.0F, -14.0F, -4.0F, 5, 3, 2, 0.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2249 */     this.gunModel['ȧ'].setRotationPoint(-22.75F, -36.25F, 6.5F);
/*      */     
/* 2251 */     this.gunModel['Ȩ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2252 */     this.gunModel['Ȩ'].setRotationPoint(-18.25F, -36.25F, 1.0F);
/*      */     
/* 2254 */     this.gunModel['ȩ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2255 */     this.gunModel['ȩ'].setRotationPoint(-18.25F, -40.25F, 2.0F);
/*      */     
/* 2257 */     this.gunModel['Ȫ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2258 */     this.gunModel['Ȫ'].setRotationPoint(-18.25F, -40.25F, 5.0F);
/*      */     
/* 2260 */     this.gunModel['ȫ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2261 */     this.gunModel['ȫ'].setRotationPoint(-18.25F, -36.25F, 6.0F);
/*      */     
/* 2263 */     this.gunModel['Ȭ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2264 */     this.gunModel['Ȭ'].setRotationPoint(-18.25F, -38.25F, 6.0F);
/*      */     
/* 2266 */     this.gunModel['ȭ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2267 */     this.gunModel['ȭ'].setRotationPoint(-18.25F, -40.25F, 3.0F);
/*      */     
/* 2269 */     this.gunModel['Ȯ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2270 */     this.gunModel['Ȯ'].setRotationPoint(-18.25F, -38.25F, 1.0F);
/*      */     
/* 2272 */     this.gunModel['ȯ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2273 */     this.gunModel['ȯ'].setRotationPoint(-18.25F, -35.25F, 3.0F);
/*      */     
/* 2275 */     this.gunModel['Ȱ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2276 */     this.gunModel['Ȱ'].setRotationPoint(-18.25F, -36.25F, 2.0F);
/*      */     
/* 2278 */     this.gunModel['ȱ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2279 */     this.gunModel['ȱ'].setRotationPoint(-18.25F, -36.25F, 5.0F);
/*      */     
/* 2281 */     this.gunModel['Ȳ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2282 */     this.gunModel['Ȳ'].setRotationPoint(-18.25F, -35.25F, 2.0F);
/*      */     
/* 2284 */     this.gunModel['ȳ'].addShapeBox(23.0F, -14.0F, -4.0F, 3, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2285 */     this.gunModel['ȳ'].setRotationPoint(-18.25F, -35.25F, 5.0F);
/*      */     
/* 2287 */     this.gunModel['ȴ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2288 */     this.gunModel['ȴ'].setRotationPoint(-18.25F, -39.25F, 6.0F);
/*      */     
/* 2290 */     this.gunModel['ȵ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2291 */     this.gunModel['ȵ'].setRotationPoint(-18.25F, -39.25F, 1.0F);
/*      */     
/* 2293 */     this.gunModel['ȶ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2294 */     this.gunModel['ȶ'].setRotationPoint(-18.25F, -39.25F, 2.0F);
/*      */     
/* 2296 */     this.gunModel['ȷ'].addShapeBox(23.0F, -14.0F, -4.0F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2297 */     this.gunModel['ȷ'].setRotationPoint(-18.25F, -39.25F, 5.0F);
/*      */     
/* 2299 */     this.gunModel['ȸ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2300 */     this.gunModel['ȸ'].setRotationPoint(-22.0F, -12.5F, -0.5F);
/*      */     
/* 2302 */     this.gunModel['ȹ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2303 */     this.gunModel['ȹ'].setRotationPoint(-23.0F, -12.5F, -0.5F);
/*      */     
/* 2305 */     this.gunModel['Ⱥ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2306 */     this.gunModel['Ⱥ'].setRotationPoint(-24.0F, -12.5F, -0.5F);
/*      */     
/* 2308 */     this.gunModel['Ȼ'].addShapeBox(23.0F, -14.0F, -4.0F, 1, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2309 */     this.gunModel['Ȼ'].setRotationPoint(-22.0F, -10.5F, -0.5F);
/*      */     
/*      */ 
/* 2312 */     this.ammoModel = new ModelRendererTurbo[10];
/* 2313 */     this.ammoModel[0] = new ModelRendererTurbo(this, 81, 321, this.textureX, this.textureY);
/* 2314 */     this.ammoModel[1] = new ModelRendererTurbo(this, 129, 321, this.textureX, this.textureY);
/* 2315 */     this.ammoModel[2] = new ModelRendererTurbo(this, 169, 329, this.textureX, this.textureY);
/* 2316 */     this.ammoModel[3] = new ModelRendererTurbo(this, 289, 329, this.textureX, this.textureY);
/* 2317 */     this.ammoModel[4] = new ModelRendererTurbo(this, 369, 329, this.textureX, this.textureY);
/* 2318 */     this.ammoModel[5] = new ModelRendererTurbo(this, 417, 329, this.textureX, this.textureY);
/* 2319 */     this.ammoModel[6] = new ModelRendererTurbo(this, 129, 233, this.textureX, this.textureY);
/* 2320 */     this.ammoModel[7] = new ModelRendererTurbo(this, 225, 257, this.textureX, this.textureY);
/* 2321 */     this.ammoModel[8] = new ModelRendererTurbo(this, 465, 329, this.textureX, this.textureY);
/* 2322 */     this.ammoModel[9] = new ModelRendererTurbo(this, 49, 337, this.textureX, this.textureY);
/*      */     
/* 2324 */     this.ammoModel[0].addShapeBox(23.0F, -14.0F, -4.0F, 16, 3, 6, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2325 */     this.ammoModel[0].setRotationPoint(-4.0F, 3.0F, 1.0F);
/*      */     
/* 2327 */     this.ammoModel[1].addShapeBox(23.0F, -14.0F, -4.0F, 16, 3, 6, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2328 */     this.ammoModel[1].setRotationPoint(-3.75F, 6.0F, 1.0F);
/*      */     
/* 2330 */     this.ammoModel[2].addShapeBox(23.0F, -14.0F, -4.0F, 16, 3, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2331 */     this.ammoModel[2].setRotationPoint(-3.25F, 9.0F, 1.0F);
/*      */     
/* 2333 */     this.ammoModel[3].addShapeBox(23.0F, -14.0F, -4.0F, 16, 3, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2334 */     this.ammoModel[3].setRotationPoint(-2.75F, 12.0F, 1.0F);
/*      */     
/* 2336 */     this.ammoModel[4].addShapeBox(23.0F, -14.0F, -4.0F, 16, 3, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2337 */     this.ammoModel[4].setRotationPoint(-2.0F, 15.0F, 1.0F);
/*      */     
/* 2339 */     this.ammoModel[5].addShapeBox(23.0F, -14.0F, -4.0F, 16, 5, 6, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2340 */     this.ammoModel[5].setRotationPoint(-1.0F, 18.0F, 1.0F);
/*      */     
/* 2342 */     this.ammoModel[6].addShapeBox(23.0F, -14.0F, -4.0F, 16, 1, 6, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2343 */     this.ammoModel[6].setRotationPoint(0.25F, 23.0F, 1.0F);
/*      */     
/* 2345 */     this.ammoModel[7].addShapeBox(23.0F, -14.0F, -4.0F, 16, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 4.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -1.0F, 4.5F, 0.0F);
/* 2346 */     this.ammoModel[7].setRotationPoint(0.25F, 24.0F, 1.0F);
/*      */     
/* 2348 */     this.ammoModel[8].addShapeBox(23.0F, -14.0F, -4.0F, 16, 6, 6, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2349 */     this.ammoModel[8].setRotationPoint(-4.0F, -3.0F, 1.0F);
/*      */     
/* 2351 */     this.ammoModel[9].addShapeBox(23.0F, -14.0F, -4.0F, 17, 4, 7, 0.0F, -1.0F, -5.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, -5.5F, 0.0F, -2.0F, 4.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -2.0F, 4.0F, 0.0F);
/* 2352 */     this.ammoModel[9].setRotationPoint(-0.25F, 24.0F, 0.5F);
/*      */     
/*      */ 
/* 2355 */     this.slideModel = new ModelRendererTurbo[6];
/* 2356 */     this.slideModel[0] = new ModelRendererTurbo(this, 105, 337, this.textureX, this.textureY);
/* 2357 */     this.slideModel[1] = new ModelRendererTurbo(this, 273, 137, this.textureX, this.textureY);
/* 2358 */     this.slideModel[2] = new ModelRendererTurbo(this, 273, 257, this.textureX, this.textureY);
/* 2359 */     this.slideModel[3] = new ModelRendererTurbo(this, 377, 361, this.textureX, this.textureY);
/* 2360 */     this.slideModel[4] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/* 2361 */     this.slideModel[5] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*      */     
/* 2363 */     this.slideModel[0].addShapeBox(23.0F, -14.0F, -4.0F, 18, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2364 */     this.slideModel[0].setRotationPoint(-6.75F, -24.5F, 1.5F);
/*      */     
/* 2366 */     this.slideModel[1].addShapeBox(23.0F, -14.0F, -4.0F, 8, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2367 */     this.slideModel[1].setRotationPoint(11.25F, -24.0F, 1.5F);
/*      */     
/* 2369 */     this.slideModel[2].addShapeBox(23.0F, -14.0F, -4.0F, 13, 2, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 2370 */     this.slideModel[2].setRotationPoint(19.25F, -24.0F, 2.0F);
/*      */     
/* 2372 */     this.slideModel[3].addShapeBox(23.0F, -14.0F, -4.0F, 15, 4, 1, 0.0F, 0.5F, 0.5F, 0.5F, 3.5F, 0.5F, 0.5F, 3.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.5F, 3.5F, -0.5F, 0.5F, 3.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2373 */     this.slideModel[3].setRotationPoint(-7.0F, -18.5F, 1.0F);
/*      */     
/* 2375 */     this.slideModel[4].addShapeBox(23.0F, -14.0F, -4.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 2376 */     this.slideModel[4].setRotationPoint(19.25F, -23.75F, 1.0F);
/*      */     
/* 2378 */     this.slideModel[5].addShapeBox(23.0F, -14.0F, -4.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 2379 */     this.slideModel[5].setRotationPoint(19.25F, -23.75F, 5.75F);
/*      */     
/*      */ 
/*      */ 
/* 2383 */     translateAll(0.0F, -6.0F, 0.0F);
/* 2384 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/* 2386 */     this.gunSlideDistance = 1.5F;
/* 2387 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/* 2389 */     this.tiltGun = 8.0F;
/* 2390 */     this.rotateGunVertical = 7.0F;
/* 2391 */     this.translateGun = new Vector3f(0.15F, 0.05F, 0.0F);
/*      */     
/* 2393 */     this.rotateClipVertical = 7.0F;
/* 2394 */     this.translateClip = new Vector3f(0.0F, -75.0F, 0.0F);
/*      */     
/*      */ 
/* 2397 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelxm8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */