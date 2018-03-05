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
/*      */ public class Modelintervention
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelintervention()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['İ'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 177, 73, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 17, 81, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 81, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 81, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 81, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 89, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 97, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 105, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 105, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 321, 105, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 385, 105, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 65, 113, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 97, 97, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 121, 97, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 201, 97, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 233, 113, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 305, 113, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 401, 113, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 425, 113, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 481, 113, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 225, 97, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 41, 121, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 65, 121, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 153, 113, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 113, 121, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 217, 121, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 281, 121, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 313, 121, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 345, 121, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 377, 121, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 409, 121, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 433, 121, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 465, 121, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 489, 121, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 121, 129, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 169, 129, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 25, 129, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 193, 129, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 225, 129, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 113, 97, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 345, 129, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 361, 129, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 89, 137, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 113, 137, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 161, 137, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 185, 137, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 209, 137, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 281, 137, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 305, 137, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 329, 137, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 377, 137, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 449, 137, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 473, 137, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 25, 145, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 73, 145, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 97, 145, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/*  278 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 121, 145, this.textureX, this.textureY);
/*  279 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 137, 145, this.textureX, this.textureY);
/*  280 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 153, 145, this.textureX, this.textureY);
/*  281 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/*  282 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 185, 145, this.textureX, this.textureY);
/*  283 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 201, 145, this.textureX, this.textureY);
/*  284 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 217, 145, this.textureX, this.textureY);
/*  285 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 233, 145, this.textureX, this.textureY);
/*  286 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 249, 145, this.textureX, this.textureY);
/*  287 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 265, 145, this.textureX, this.textureY);
/*  288 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 281, 145, this.textureX, this.textureY);
/*  289 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 297, 145, this.textureX, this.textureY);
/*  290 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 305, 145, this.textureX, this.textureY);
/*  291 */     this.gunModel['č'] = new ModelRendererTurbo(this, 337, 145, this.textureX, this.textureY);
/*  292 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 369, 145, this.textureX, this.textureY);
/*  293 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 401, 145, this.textureX, this.textureY);
/*  294 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/*  295 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 465, 145, this.textureX, this.textureY);
/*  296 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  297 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 33, 153, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 65, 153, this.textureX, this.textureY);
/*  299 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 105, 153, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 145, 153, this.textureX, this.textureY);
/*  301 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 177, 153, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 497, 145, this.textureX, this.textureY);
/*  303 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 209, 153, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 225, 153, this.textureX, this.textureY);
/*  305 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 241, 153, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 257, 153, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 273, 153, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/*  309 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 305, 153, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 321, 153, this.textureX, this.textureY);
/*  311 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 353, 153, this.textureX, this.textureY);
/*  313 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 369, 153, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 385, 153, this.textureX, this.textureY);
/*  315 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 409, 153, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 433, 153, this.textureX, this.textureY);
/*  317 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 457, 153, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 481, 153, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 25, 161, this.textureX, this.textureY);
/*  321 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 49, 161, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 81, 161, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 105, 161, this.textureX, this.textureY);
/*  324 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 129, 161, this.textureX, this.textureY);
/*  325 */     this.gunModel['į'] = new ModelRendererTurbo(this, 153, 161, this.textureX, this.textureY);
/*      */     
/*  327 */     this.gunModel[0].addShapeBox(16.0F, 9.0F, -4.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  328 */     this.gunModel[0].setRotationPoint(-18.0F, -29.0F, 0.0F);
/*      */     
/*  330 */     this.gunModel[1].addShapeBox(16.0F, 9.0F, -4.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  331 */     this.gunModel[1].setRotationPoint(-18.0F, -32.0F, 0.0F);
/*      */     
/*  333 */     this.gunModel[2].addShapeBox(16.0F, 9.0F, -4.0F, 42, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  334 */     this.gunModel[2].setRotationPoint(-20.0F, -25.5F, 0.0F);
/*      */     
/*  336 */     this.gunModel[3].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  337 */     this.gunModel[3].setRotationPoint(-18.0F, -33.0F, 1.5F);
/*      */     
/*  339 */     this.gunModel[4].addShapeBox(16.0F, 9.0F, -4.0F, 22, 2, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  340 */     this.gunModel[4].setRotationPoint(-9.0F, -32.0F, 0.0F);
/*      */     
/*  342 */     this.gunModel[5].addShapeBox(16.0F, 9.0F, -4.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  343 */     this.gunModel[5].setRotationPoint(13.0F, -32.0F, 0.0F);
/*      */     
/*  345 */     this.gunModel[6].addShapeBox(16.0F, 9.0F, -4.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  346 */     this.gunModel[6].setRotationPoint(13.0F, -29.0F, 0.0F);
/*      */     
/*  348 */     this.gunModel[7].addShapeBox(16.0F, 9.0F, -4.0F, 42, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  349 */     this.gunModel[7].setRotationPoint(-20.0F, -23.5F, 1.5F);
/*      */     
/*  351 */     this.gunModel[8].addShapeBox(16.0F, 9.0F, -4.0F, 40, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  352 */     this.gunModel[8].setRotationPoint(-18.0F, -35.0F, 3.0F);
/*      */     
/*  354 */     this.gunModel[9].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  355 */     this.gunModel[9].setRotationPoint(-18.0F, -35.0F, 2.0F);
/*      */     
/*  357 */     this.gunModel[10].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/*  358 */     this.gunModel[10].setRotationPoint(-18.0F, -35.0F, 5.5F);
/*      */     
/*  360 */     this.gunModel[11].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  361 */     this.gunModel[11].setRotationPoint(-18.0F, -33.0F, 6.0F);
/*      */     
/*  363 */     this.gunModel[12].addShapeBox(16.0F, 9.0F, -4.0F, 40, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  364 */     this.gunModel[12].setRotationPoint(-18.0F, -32.0F, 7.0F);
/*      */     
/*  366 */     this.gunModel[13].addShapeBox(16.0F, 9.0F, -4.0F, 42, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  367 */     this.gunModel[13].setRotationPoint(-20.0F, -25.5F, 2.0F);
/*      */     
/*  369 */     this.gunModel[14].addShapeBox(16.0F, 9.0F, -4.0F, 40, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  370 */     this.gunModel[14].setRotationPoint(-18.0F, -29.0F, 7.0F);
/*      */     
/*  372 */     this.gunModel[15].addBox(16.0F, 9.0F, -4.0F, 40, 1, 5, 0.0F);
/*  373 */     this.gunModel[15].setRotationPoint(-18.0F, -32.0F, 2.0F);
/*      */     
/*  375 */     this.gunModel[16].addBox(16.0F, 9.0F, -4.0F, 4, 1, 3, 0.0F);
/*  376 */     this.gunModel[16].setRotationPoint(18.0F, -33.0F, 3.0F);
/*      */     
/*  378 */     this.gunModel[17].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  379 */     this.gunModel[17].setRotationPoint(-18.0F, -27.0F, 2.25F);
/*      */     
/*  381 */     this.gunModel[18].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  382 */     this.gunModel[18].setRotationPoint(-18.0F, -28.0F, 2.0F);
/*      */     
/*  384 */     this.gunModel[19].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  385 */     this.gunModel[19].setRotationPoint(-18.0F, -26.75F, 3.25F);
/*      */     
/*  387 */     this.gunModel[20].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  388 */     this.gunModel[20].setRotationPoint(-18.0F, -26.75F, 4.75F);
/*      */     
/*  390 */     this.gunModel[21].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  391 */     this.gunModel[21].setRotationPoint(-18.0F, -27.0F, 5.75F);
/*      */     
/*  393 */     this.gunModel[22].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  394 */     this.gunModel[22].setRotationPoint(-18.0F, -28.0F, 6.0F);
/*      */     
/*  396 */     this.gunModel[23].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  397 */     this.gunModel[23].setRotationPoint(-18.0F, -29.25F, 2.0F);
/*      */     
/*  399 */     this.gunModel[24].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  400 */     this.gunModel[24].setRotationPoint(-18.0F, -30.5F, 2.25F);
/*      */     
/*  402 */     this.gunModel[25].addShapeBox(16.0F, 9.0F, -4.0F, 31, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/*  403 */     this.gunModel[25].setRotationPoint(-18.0F, -31.5F, 3.25F);
/*      */     
/*  405 */     this.gunModel[26].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  406 */     this.gunModel[26].setRotationPoint(-18.0F, -29.25F, 6.0F);
/*      */     
/*  408 */     this.gunModel[27].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  409 */     this.gunModel[27].setRotationPoint(-18.0F, -30.5F, 5.75F);
/*      */     
/*  411 */     this.gunModel[28].addShapeBox(16.0F, 9.0F, -4.0F, 31, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  412 */     this.gunModel[28].setRotationPoint(-18.0F, -31.5F, 4.5F);
/*      */     
/*  414 */     this.gunModel[29].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  415 */     this.gunModel[29].setRotationPoint(-18.0F, -30.5F, 6.0F);
/*      */     
/*  417 */     this.gunModel[30].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  418 */     this.gunModel[30].setRotationPoint(-18.0F, -26.5F, 1.25F);
/*      */     
/*  420 */     this.gunModel[31].addShapeBox(16.0F, 9.0F, -4.0F, 40, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  421 */     this.gunModel[31].setRotationPoint(-18.0F, -26.5F, 6.0F);
/*      */     
/*  423 */     this.gunModel[32].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  424 */     this.gunModel[32].setRotationPoint(-18.0F, -30.5F, 1.25F);
/*      */     
/*  426 */     this.gunModel[33].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  427 */     this.gunModel[33].setRotationPoint(13.0F, -31.5F, 4.5F);
/*      */     
/*  429 */     this.gunModel[34].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/*  430 */     this.gunModel[34].setRotationPoint(13.0F, -31.5F, 3.25F);
/*      */     
/*  432 */     this.gunModel[35].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  433 */     this.gunModel[35].setRotationPoint(13.0F, -30.5F, 2.25F);
/*      */     
/*  435 */     this.gunModel[36].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  436 */     this.gunModel[36].setRotationPoint(13.0F, -30.5F, 1.25F);
/*      */     
/*  438 */     this.gunModel[37].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  439 */     this.gunModel[37].setRotationPoint(13.0F, -29.25F, 2.0F);
/*      */     
/*  441 */     this.gunModel[38].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  442 */     this.gunModel[38].setRotationPoint(13.0F, -28.0F, 2.0F);
/*      */     
/*  444 */     this.gunModel[39].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  445 */     this.gunModel[39].setRotationPoint(13.0F, -26.5F, 1.25F);
/*      */     
/*  447 */     this.gunModel[40].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  448 */     this.gunModel[40].setRotationPoint(13.0F, -27.0F, 2.25F);
/*      */     
/*  450 */     this.gunModel[41].addShapeBox(16.0F, 9.0F, -4.0F, 22, 1, 3, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  451 */     this.gunModel[41].setRotationPoint(-9.0F, -26.75F, 0.0F);
/*      */     
/*  453 */     this.gunModel[42].addShapeBox(16.0F, 9.0F, -4.0F, 22, 1, 2, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  454 */     this.gunModel[42].setRotationPoint(-9.0F, -30.5F, 1.25F);
/*      */     
/*  456 */     this.gunModel[43].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  457 */     this.gunModel[43].setRotationPoint(22.0F, -33.0F, 0.0F);
/*      */     
/*  459 */     this.gunModel[44].addShapeBox(16.0F, 9.0F, -4.0F, 2, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  460 */     this.gunModel[44].setRotationPoint(22.0F, -33.0F, 3.0F);
/*      */     
/*  462 */     this.gunModel[45].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  463 */     this.gunModel[45].setRotationPoint(22.0F, -33.0F, 6.0F);
/*      */     
/*  465 */     this.gunModel[46].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  466 */     this.gunModel[46].setRotationPoint(22.0F, -30.0F, 0.0F);
/*      */     
/*  468 */     this.gunModel[47].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  469 */     this.gunModel[47].setRotationPoint(22.0F, -30.0F, 6.0F);
/*      */     
/*  471 */     this.gunModel[48].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  472 */     this.gunModel[48].setRotationPoint(22.0F, -27.0F, 6.0F);
/*      */     
/*  474 */     this.gunModel[49].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  475 */     this.gunModel[49].setRotationPoint(22.0F, -27.0F, 0.0F);
/*      */     
/*  477 */     this.gunModel[50].addShapeBox(16.0F, 9.0F, -4.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  478 */     this.gunModel[50].setRotationPoint(35.85F, -30.0F, 6.0F);
/*      */     
/*  480 */     this.gunModel[51].addShapeBox(16.0F, 9.0F, -4.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  481 */     this.gunModel[51].setRotationPoint(35.85F, -27.0F, 6.0F);
/*      */     
/*  483 */     this.gunModel[52].addShapeBox(16.0F, 9.0F, -4.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  484 */     this.gunModel[52].setRotationPoint(35.85F, -33.0F, 6.0F);
/*      */     
/*  486 */     this.gunModel[53].addShapeBox(16.0F, 9.0F, -4.0F, 8, 12, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[53].setRotationPoint(35.85F, -33.0F, 3.0F);
/*      */     
/*  489 */     this.gunModel[54].addShapeBox(16.0F, 9.0F, -4.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  490 */     this.gunModel[54].setRotationPoint(35.85F, -33.0F, 0.0F);
/*      */     
/*  492 */     this.gunModel[55].addShapeBox(16.0F, 9.0F, -4.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  493 */     this.gunModel[55].setRotationPoint(35.85F, -30.0F, 0.0F);
/*      */     
/*  495 */     this.gunModel[56].addShapeBox(16.0F, 9.0F, -4.0F, 8, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  496 */     this.gunModel[56].setRotationPoint(35.85F, -27.0F, 0.0F);
/*      */     
/*  498 */     this.gunModel[57].addShapeBox(16.0F, 9.0F, -4.0F, 11, 2, 2, 0.0F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  499 */     this.gunModel[57].setRotationPoint(24.45F, -32.4F, 0.6F);
/*      */     
/*  501 */     this.gunModel[58].addShapeBox(16.0F, 9.0F, -4.0F, 11, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  502 */     this.gunModel[58].setRotationPoint(24.45F, -29.5F, 0.6F);
/*      */     
/*  504 */     this.gunModel[59].addShapeBox(16.0F, 9.0F, -4.0F, 11, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  505 */     this.gunModel[59].setRotationPoint(24.45F, -26.62F, 0.6F);
/*      */     
/*  507 */     this.gunModel[60].addShapeBox(16.0F, 9.0F, -4.0F, 11, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  508 */     this.gunModel[60].setRotationPoint(24.45F, -29.5F, 6.42F);
/*      */     
/*  510 */     this.gunModel[61].addShapeBox(16.0F, 9.0F, -4.0F, 11, 8, 2, 0.0F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  511 */     this.gunModel[61].setRotationPoint(24.45F, -32.6F, 3.52F);
/*      */     
/*  513 */     this.gunModel[62].addShapeBox(16.0F, 9.0F, -4.0F, 11, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F);
/*  514 */     this.gunModel[62].setRotationPoint(24.45F, -26.6F, 6.42F);
/*      */     
/*  516 */     this.gunModel[63].addShapeBox(16.0F, 9.0F, -4.0F, 11, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  517 */     this.gunModel[63].setRotationPoint(24.45F, -32.4F, 6.42F);
/*      */     
/*  519 */     this.gunModel[64].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  520 */     this.gunModel[64].setRotationPoint(44.35F, -29.5F, 0.6F);
/*      */     
/*  522 */     this.gunModel[65].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 2, 0.0F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  523 */     this.gunModel[65].setRotationPoint(44.35F, -32.4F, 0.6F);
/*      */     
/*  525 */     this.gunModel[66].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  526 */     this.gunModel[66].setRotationPoint(44.35F, -26.62F, 0.6F);
/*      */     
/*  528 */     this.gunModel[67].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F);
/*  529 */     this.gunModel[67].setRotationPoint(44.35F, -26.6F, 6.42F);
/*      */     
/*  531 */     this.gunModel[68].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  532 */     this.gunModel[68].setRotationPoint(44.35F, -29.5F, 6.42F);
/*      */     
/*  534 */     this.gunModel[69].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 2, 0.0F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, -2.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  535 */     this.gunModel[69].setRotationPoint(44.35F, -32.4F, 6.42F);
/*      */     
/*  537 */     this.gunModel[70].addShapeBox(16.0F, 9.0F, -4.0F, 16, 8, 2, 0.0F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  538 */     this.gunModel[70].setRotationPoint(44.35F, -32.6F, 3.52F);
/*      */     
/*  540 */     this.gunModel[71].addShapeBox(16.0F, 9.0F, -4.0F, 63, 2, 2, 0.0F, 0.95F, 1.2F, 1.2F, 0.95F, 1.2F, 1.2F, 0.95F, 1.2F, 1.2F, 0.95F, 1.2F, 1.2F, 0.95F, 1.2F, 1.2F, 0.95F, 1.2F, 1.2F, 0.95F, 1.2F, 1.2F, 0.95F, 1.2F, 1.2F);
/*  541 */     this.gunModel[71].setRotationPoint(52.35F, -29.5F, 3.42F);
/*      */     
/*  543 */     this.gunModel[72].addShapeBox(16.0F, 9.0F, -4.0F, 6, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  544 */     this.gunModel[72].setRotationPoint(60.85F, -30.0F, 0.0F);
/*      */     
/*  546 */     this.gunModel[73].addShapeBox(16.0F, 9.0F, -4.0F, 6, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  547 */     this.gunModel[73].setRotationPoint(60.85F, -33.0F, 0.0F);
/*      */     
/*  549 */     this.gunModel[74].addShapeBox(16.0F, 9.0F, -4.0F, 6, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  550 */     this.gunModel[74].setRotationPoint(60.85F, -33.0F, 3.0F);
/*      */     
/*  552 */     this.gunModel[75].addShapeBox(16.0F, 9.0F, -4.0F, 6, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  553 */     this.gunModel[75].setRotationPoint(60.85F, -33.0F, 6.0F);
/*      */     
/*  555 */     this.gunModel[76].addShapeBox(16.0F, 9.0F, -4.0F, 6, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  556 */     this.gunModel[76].setRotationPoint(60.85F, -27.0F, 6.0F);
/*      */     
/*  558 */     this.gunModel[77].addShapeBox(16.0F, 9.0F, -4.0F, 6, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  559 */     this.gunModel[77].setRotationPoint(60.85F, -30.0F, 6.0F);
/*      */     
/*  561 */     this.gunModel[78].addShapeBox(16.0F, 9.0F, -4.0F, 6, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  562 */     this.gunModel[78].setRotationPoint(60.85F, -27.0F, 0.0F);
/*      */     
/*  564 */     this.gunModel[79].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  565 */     this.gunModel[79].setRotationPoint(35.85F, -21.0F, 2.5F);
/*      */     
/*  567 */     this.gunModel[80].addShapeBox(16.0F, 9.0F, -4.0F, 1, 2, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  568 */     this.gunModel[80].setRotationPoint(42.85F, -19.5F, 2.5F);
/*      */     
/*  570 */     this.gunModel[81].addShapeBox(16.0F, 9.0F, -4.0F, 1, 6, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  571 */     this.gunModel[81].setRotationPoint(36.35F, -19.5F, 2.5F);
/*      */     
/*  573 */     this.gunModel[82].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 4, 0.0F, 0.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  574 */     this.gunModel[82].setRotationPoint(37.85F, -14.5F, 2.5F);
/*      */     
/*  576 */     this.gunModel[83].addShapeBox(16.0F, 9.0F, -4.0F, 3, 2, 4, 0.0F, -2.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  577 */     this.gunModel[83].setRotationPoint(40.35F, -17.0F, 2.5F);
/*      */     
/*  579 */     this.gunModel[84].addBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F);
/*  580 */     this.gunModel[84].setRotationPoint(37.0F, -23.0F, 2.5F);
/*      */     
/*  582 */     this.gunModel[85].addBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F);
/*  583 */     this.gunModel[85].setRotationPoint(42.0F, -23.0F, 2.5F);
/*      */     
/*  585 */     this.gunModel[86].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 4, 0.0F, 0.35F, 1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 0.35F, 1.0F, 0.0F, 0.35F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
/*  586 */     this.gunModel[86].setRotationPoint(20.35F, -14.5F, 2.5F);
/*      */     
/*  588 */     this.gunModel[87].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  589 */     this.gunModel[87].setRotationPoint(34.85F, -16.75F, 2.5F);
/*      */     
/*  591 */     this.gunModel[88].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  592 */     this.gunModel[88].setRotationPoint(33.85F, -16.5F, 2.5F);
/*      */     
/*  594 */     this.gunModel[89].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[89].setRotationPoint(33.85F, -16.5F, 2.5F);
/*      */     
/*  597 */     this.gunModel[90].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  598 */     this.gunModel[90].setRotationPoint(32.85F, -16.75F, 2.5F);
/*      */     
/*  600 */     this.gunModel[91].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  601 */     this.gunModel[91].setRotationPoint(31.85F, -16.75F, 2.5F);
/*      */     
/*  603 */     this.gunModel[92].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  604 */     this.gunModel[92].setRotationPoint(28.6F, -16.75F, 2.5F);
/*      */     
/*  606 */     this.gunModel[93].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  607 */     this.gunModel[93].setRotationPoint(29.6F, -16.75F, 2.5F);
/*      */     
/*  609 */     this.gunModel[94].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  610 */     this.gunModel[94].setRotationPoint(30.6F, -16.5F, 2.5F);
/*      */     
/*  612 */     this.gunModel[95].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  613 */     this.gunModel[95].setRotationPoint(30.6F, -16.5F, 2.5F);
/*      */     
/*  615 */     this.gunModel[96].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  616 */     this.gunModel[96].setRotationPoint(31.6F, -16.75F, 2.5F);
/*      */     
/*  618 */     this.gunModel[97].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  619 */     this.gunModel[97].setRotationPoint(25.35F, -16.75F, 2.5F);
/*      */     
/*  621 */     this.gunModel[98].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  622 */     this.gunModel[98].setRotationPoint(26.35F, -16.75F, 2.5F);
/*      */     
/*  624 */     this.gunModel[99].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[99].setRotationPoint(27.35F, -16.5F, 2.5F);
/*      */     
/*  627 */     this.gunModel[100].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  628 */     this.gunModel[100].setRotationPoint(27.35F, -16.5F, 2.5F);
/*      */     
/*  630 */     this.gunModel[101].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[101].setRotationPoint(28.35F, -16.75F, 2.5F);
/*      */     
/*  633 */     this.gunModel[102].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 4, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/*  634 */     this.gunModel[102].setRotationPoint(21.1F, -16.75F, 2.5F);
/*      */     
/*  636 */     this.gunModel[103].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  637 */     this.gunModel[103].setRotationPoint(23.1F, -16.75F, 2.5F);
/*      */     
/*  639 */     this.gunModel[104].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  640 */     this.gunModel[104].setRotationPoint(24.1F, -16.5F, 2.5F);
/*      */     
/*  642 */     this.gunModel[105].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  643 */     this.gunModel[105].setRotationPoint(24.1F, -16.5F, 2.5F);
/*      */     
/*  645 */     this.gunModel[106].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  646 */     this.gunModel[106].setRotationPoint(25.1F, -16.75F, 2.5F);
/*      */     
/*  648 */     this.gunModel[107].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F);
/*  649 */     this.gunModel[107].setRotationPoint(25.35F, -15.75F, 2.5F);
/*      */     
/*  651 */     this.gunModel[108].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F);
/*  652 */     this.gunModel[108].setRotationPoint(28.6F, -15.75F, 2.5F);
/*      */     
/*  654 */     this.gunModel[109].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F);
/*  655 */     this.gunModel[109].setRotationPoint(31.85F, -15.75F, 2.5F);
/*      */     
/*  657 */     this.gunModel[110].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F);
/*  658 */     this.gunModel[110].setRotationPoint(33.85F, -15.75F, 2.5F);
/*      */     
/*  660 */     this.gunModel[111].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 4, 0.0F, -1.15F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, -0.75F, 0.0F, 1.25F, -0.75F, 0.0F, 1.25F, -0.75F, 0.0F, -1.15F, -0.75F, 0.0F);
/*  661 */     this.gunModel[111].setRotationPoint(20.85F, -15.75F, 2.5F);
/*      */     
/*  663 */     this.gunModel[112].addShapeBox(16.0F, 9.0F, -4.0F, 1, 2, 2, 0.0F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.25F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F, 0.45F);
/*  664 */     this.gunModel[112].setRotationPoint(29.45F, -24.6F, 3.52F);
/*      */     
/*  666 */     this.gunModel[113].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/*  667 */     this.gunModel[113].setRotationPoint(29.45F, -23.65F, 3.03F);
/*      */     
/*  669 */     this.gunModel[114].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  670 */     this.gunModel[114].setRotationPoint(14.0F, -20.0F, 2.0F);
/*      */     
/*  672 */     this.gunModel[115].addShapeBox(16.0F, 9.0F, -4.0F, 3, 2, 3, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  673 */     this.gunModel[115].setRotationPoint(19.0F, -21.0F, -0.5F);
/*      */     
/*  675 */     this.gunModel[116].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, 0.25F, -0.5F, -0.25F, -0.26F, -0.5F, -0.25F, -0.26F, -0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.5F, -0.25F, -0.26F, -0.5F, -0.25F, -0.26F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  676 */     this.gunModel[116].setRotationPoint(19.25F, -22.0F, 0.5F);
/*      */     
/*  678 */     this.gunModel[117].addShapeBox(16.0F, 9.0F, -4.0F, 2, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  679 */     this.gunModel[117].setRotationPoint(20.0F, -18.5F, 3.0F);
/*      */     
/*  681 */     this.gunModel[118].addShapeBox(16.0F, 9.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  682 */     this.gunModel[118].setRotationPoint(20.0F, -18.5F, 2.0F);
/*      */     
/*  684 */     this.gunModel[119].addShapeBox(16.0F, 9.0F, -4.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  685 */     this.gunModel[119].setRotationPoint(20.0F, -18.5F, 6.0F);
/*      */     
/*  687 */     this.gunModel[120].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/*  688 */     this.gunModel[120].setRotationPoint(22.1F, -17.75F, 2.5F);
/*      */     
/*  690 */     this.gunModel[121].addShapeBox(16.0F, 9.0F, -4.0F, 2, 4, 4, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, -0.75F, 0.0F);
/*  691 */     this.gunModel[121].setRotationPoint(18.0F, -16.75F, 2.5F);
/*      */     
/*  693 */     this.gunModel[122].addShapeBox(16.0F, 9.0F, -4.0F, 3, 2, 3, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  694 */     this.gunModel[122].setRotationPoint(19.0F, -21.0F, 6.5F);
/*      */     
/*  696 */     this.gunModel[123].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, 0.25F, -0.05F, -0.25F, -0.26F, -0.05F, -0.25F, -0.26F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.25F, -0.26F, -0.5F, -0.25F, -0.26F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  697 */     this.gunModel[123].setRotationPoint(19.25F, -22.0F, 7.25F);
/*      */     
/*  699 */     this.gunModel[124].addShapeBox(16.0F, 9.0F, -4.0F, 5, 6, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  700 */     this.gunModel[124].setRotationPoint(-8.0F, -20.0F, 2.0F);
/*      */     
/*  702 */     this.gunModel[125].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  703 */     this.gunModel[125].setRotationPoint(-4.0F, -14.0F, 2.0F);
/*      */     
/*  705 */     this.gunModel[126].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  706 */     this.gunModel[126].setRotationPoint(-7.0F, -14.0F, 2.0F);
/*      */     
/*  708 */     this.gunModel[127].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/*  709 */     this.gunModel[127].setRotationPoint(-8.0F, -14.0F, 2.0F);
/*      */     
/*  711 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  712 */     this.gunModel[''].setRotationPoint(-15.0F, -14.0F, 2.5F);
/*      */     
/*  714 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 3, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  715 */     this.gunModel[''].setRotationPoint(-25.0F, -20.0F, -0.5F);
/*      */     
/*  717 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 16, 2, 3, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, -0.01F, 0.5F, -0.25F, -0.01F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  718 */     this.gunModel[''].setRotationPoint(-25.0F, -20.0F, 6.5F);
/*      */     
/*  720 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 2, 5, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  721 */     this.gunModel[''].setRotationPoint(-20.0F, -30.5F, 0.5F);
/*      */     
/*  723 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, -1.13F, 0.0F, -0.5F, -1.13F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  724 */     this.gunModel[''].setRotationPoint(-22.0F, -24.5F, 0.0F);
/*      */     
/*  726 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 6, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  727 */     this.gunModel[''].setRotationPoint(-26.0F, -22.5F, 1.5F);
/*      */     
/*  729 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  730 */     this.gunModel[''].setRotationPoint(-26.0F, -23.5F, 1.5F);
/*      */     
/*  732 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 2, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  733 */     this.gunModel[''].setRotationPoint(-26.0F, -24.5F, 0.0F);
/*      */     
/*  735 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  736 */     this.gunModel[''].setRotationPoint(-26.0F, -23.5F, 7.0F);
/*      */     
/*  738 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  739 */     this.gunModel[''].setRotationPoint(-26.0F, -24.5F, 7.0F);
/*      */     
/*  741 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  742 */     this.gunModel[''].setRotationPoint(-26.0F, -23.5F, 2.0F);
/*      */     
/*  744 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  745 */     this.gunModel[''].setRotationPoint(-26.0F, -23.5F, 6.0F);
/*      */     
/*  747 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 3, 2, 4, 0.0F, -0.75F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F);
/*  748 */     this.gunModel[''].setRotationPoint(-11.0F, -19.0F, 2.5F);
/*      */     
/*  750 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.55F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.55F, -0.5F, 0.25F);
/*  751 */     this.gunModel[''].setRotationPoint(-9.0F, -17.0F, 2.5F);
/*      */     
/*  753 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 4, 0.0F, -1.55F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -1.55F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  754 */     this.gunModel[''].setRotationPoint(-10.0F, -16.0F, 2.5F);
/*      */     
/*  756 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 2, 4, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  757 */     this.gunModel[''].setRotationPoint(-16.0F, -18.0F, 2.0F);
/*      */     
/*  759 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 12, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/*  760 */     this.gunModel[''].setRotationPoint(-20.0F, -20.0F, 2.5F);
/*      */     
/*  762 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 10, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  763 */     this.gunModel[''].setRotationPoint(-28.0F, -17.5F, 2.5F);
/*      */     
/*  765 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  766 */     this.gunModel[''].setRotationPoint(-28.0F, -15.0F, 2.5F);
/*      */     
/*  768 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  769 */     this.gunModel[''].setRotationPoint(-28.0F, -14.5F, 2.5F);
/*      */     
/*  771 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  772 */     this.gunModel[''].setRotationPoint(-27.75F, -14.0F, 2.5F);
/*      */     
/*  774 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  775 */     this.gunModel[''].setRotationPoint(-29.0F, -14.0F, 2.5F);
/*      */     
/*  777 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/*  778 */     this.gunModel[''].setRotationPoint(-28.75F, -13.0F, 2.5F);
/*      */     
/*  780 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  781 */     this.gunModel[''].setRotationPoint(-55.0F, -19.5F, 8.0F);
/*      */     
/*  783 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F);
/*  784 */     this.gunModel[''].setRotationPoint(-54.75F, -18.75F, 8.75F);
/*      */     
/*  786 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  787 */     this.gunModel[''].setRotationPoint(-54.75F, -20.25F, 7.25F);
/*      */     
/*  789 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  790 */     this.gunModel[''].setRotationPoint(-54.75F, -18.75F, 7.25F);
/*      */     
/*  792 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  793 */     this.gunModel[''].setRotationPoint(-54.75F, -20.25F, 8.75F);
/*      */     
/*  795 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F);
/*  796 */     this.gunModel[''].setRotationPoint(-54.75F, -20.25F, 7.75F);
/*      */     
/*  798 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F);
/*  799 */     this.gunModel[''].setRotationPoint(-54.75F, -18.75F, 7.75F);
/*      */     
/*  801 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  802 */     this.gunModel[''].setRotationPoint(-55.0F, -19.5F, 0.25F);
/*      */     
/*  804 */     this.gunModel[''].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F);
/*  805 */     this.gunModel[''].setRotationPoint(-54.75F, -18.75F, 1.0F);
/*      */     
/*  807 */     this.gunModel[' '].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  808 */     this.gunModel[' '].setRotationPoint(-54.75F, -20.25F, -0.5F);
/*      */     
/*  810 */     this.gunModel['¡'].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  811 */     this.gunModel['¡'].setRotationPoint(-54.75F, -18.75F, -0.5F);
/*      */     
/*  813 */     this.gunModel['¢'].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F);
/*  814 */     this.gunModel['¢'].setRotationPoint(-54.75F, -20.25F, 1.0F);
/*      */     
/*  816 */     this.gunModel['£'].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F);
/*  817 */     this.gunModel['£'].setRotationPoint(-54.75F, -20.25F, 0.0F);
/*      */     
/*  819 */     this.gunModel['¤'].addShapeBox(16.0F, 9.0F, -4.0F, 30, 1, 1, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F);
/*  820 */     this.gunModel['¤'].setRotationPoint(-54.75F, -18.75F, 0.0F);
/*      */     
/*  822 */     this.gunModel['¥'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  823 */     this.gunModel['¥'].setRotationPoint(-62.0F, -20.5F, 8.0F);
/*      */     
/*  825 */     this.gunModel['¦'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 6, 6, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel['¦'].setRotationPoint(-62.0F, -26.5F, 2.0F);
/*      */     
/*  828 */     this.gunModel['§'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  829 */     this.gunModel['§'].setRotationPoint(-62.0F, -20.5F, 9.0F);
/*      */     
/*  831 */     this.gunModel['¨'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  832 */     this.gunModel['¨'].setRotationPoint(-62.0F, -19.5F, 9.0F);
/*      */     
/*  834 */     this.gunModel['©'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  835 */     this.gunModel['©'].setRotationPoint(-62.0F, -18.5F, 9.0F);
/*      */     
/*  837 */     this.gunModel['ª'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  838 */     this.gunModel['ª'].setRotationPoint(-62.0F, -19.5F, 2.25F);
/*      */     
/*  840 */     this.gunModel['«'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  841 */     this.gunModel['«'].setRotationPoint(-62.0F, -20.5F, 0.25F);
/*      */     
/*  843 */     this.gunModel['¬'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  844 */     this.gunModel['¬'].setRotationPoint(-62.0F, -20.5F, -0.75F);
/*      */     
/*  846 */     this.gunModel['­'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel['­'].setRotationPoint(-62.0F, -20.5F, 1.25F);
/*      */     
/*  849 */     this.gunModel['®'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  850 */     this.gunModel['®'].setRotationPoint(-62.0F, -19.5F, 1.25F);
/*      */     
/*  852 */     this.gunModel['¯'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  853 */     this.gunModel['¯'].setRotationPoint(-62.0F, -18.5F, 1.25F);
/*      */     
/*  855 */     this.gunModel['°'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  856 */     this.gunModel['°'].setRotationPoint(-62.0F, -19.5F, -0.75F);
/*      */     
/*  858 */     this.gunModel['±'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel['±'].setRotationPoint(-62.0F, -18.5F, -0.75F);
/*      */     
/*  861 */     this.gunModel['²'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  862 */     this.gunModel['²'].setRotationPoint(-62.0F, -20.5F, 2.25F);
/*      */     
/*  864 */     this.gunModel['³'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, 0.75F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.75F, 0.25F, -1.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F);
/*  865 */     this.gunModel['³'].setRotationPoint(-62.0F, -27.75F, 6.0F);
/*      */     
/*  867 */     this.gunModel['´'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 6, 1, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  868 */     this.gunModel['´'].setRotationPoint(-62.0F, -26.5F, 1.25F);
/*      */     
/*  870 */     this.gunModel['µ'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 3, 0.0F, 0.75F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.5F, 0.75F, 0.25F, 0.5F, 0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F);
/*  871 */     this.gunModel['µ'].setRotationPoint(-62.0F, -27.75F, 2.25F);
/*      */     
/*  873 */     this.gunModel['¶'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.1F, 0.75F, -0.75F, 0.12F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.12F, 0.75F, 0.0F, 0.12F);
/*  874 */     this.gunModel['¶'].setRotationPoint(-62.0F, -29.0F, 3.5F);
/*      */     
/*  876 */     this.gunModel['·'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, 0.75F, -0.75F, 0.15F, 0.0F, -0.75F, 0.13F, 0.0F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.13F, 0.0F, 0.0F, 0.13F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  877 */     this.gunModel['·'].setRotationPoint(-62.0F, -29.0F, 4.75F);
/*      */     
/*  879 */     this.gunModel['¸'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 3, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F);
/*  880 */     this.gunModel['¸'].setRotationPoint(-55.0F, -26.5F, 6.0F);
/*      */     
/*  882 */     this.gunModel['¹'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  883 */     this.gunModel['¹'].setRotationPoint(-55.0F, -28.0F, 3.75F);
/*      */     
/*  885 */     this.gunModel['º'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F);
/*  886 */     this.gunModel['º'].setRotationPoint(-55.0F, -23.0F, 6.0F);
/*      */     
/*  888 */     this.gunModel['»'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
/*  889 */     this.gunModel['»'].setRotationPoint(-62.0F, -17.5F, 1.25F);
/*      */     
/*  891 */     this.gunModel['¼'].addShapeBox(16.0F, 9.0F, -4.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  892 */     this.gunModel['¼'].setRotationPoint(-62.0F, -11.5F, 1.75F);
/*      */     
/*  894 */     this.gunModel['½'].addShapeBox(16.0F, 9.0F, -4.0F, 5, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/*  895 */     this.gunModel['½'].setRotationPoint(-62.0F, -9.5F, 3.75F);
/*      */     
/*  897 */     this.gunModel['¾'].addShapeBox(16.0F, 9.0F, -4.0F, 5, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F);
/*  898 */     this.gunModel['¾'].setRotationPoint(-62.0F, -11.5F, 5.75F);
/*      */     
/*  900 */     this.gunModel['¿'].addShapeBox(16.0F, 9.0F, -4.0F, 5, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F);
/*  901 */     this.gunModel['¿'].setRotationPoint(-62.0F, -9.5F, 4.75F);
/*      */     
/*  903 */     this.gunModel['À'].addShapeBox(16.0F, 9.0F, -4.0F, 5, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  904 */     this.gunModel['À'].setRotationPoint(-62.0F, -11.5F, 3.75F);
/*      */     
/*  906 */     this.gunModel['Á'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.05F, -0.25F, 0.0F, 0.05F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  907 */     this.gunModel['Á'].setRotationPoint(-27.75F, -13.5F, 2.5F);
/*      */     
/*  909 */     this.gunModel['Â'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.05F, 0.25F, 0.0F, 0.05F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.3F, -0.5F, 0.0F, 0.3F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  910 */     this.gunModel['Â'].setRotationPoint(-27.75F, -12.5F, 2.5F);
/*      */     
/*  912 */     this.gunModel['Ã'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.3F, 0.25F, 0.0F, 0.3F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.3F, -0.75F, 0.0F, 0.3F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  913 */     this.gunModel['Ã'].setRotationPoint(-27.75F, -11.75F, 2.5F);
/*      */     
/*  915 */     this.gunModel['Ä'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  916 */     this.gunModel['Ä'].setRotationPoint(-27.75F, -11.5F, 2.5F);
/*      */     
/*  918 */     this.gunModel['Å'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.25F, 0.0F, -0.45F, 0.25F, 0.0F, -0.45F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.9F, -0.25F, 0.0F, -0.9F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  919 */     this.gunModel['Å'].setRotationPoint(-27.75F, -10.5F, 2.5F);
/*      */     
/*  921 */     this.gunModel['Æ'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.25F, 0.0F, -0.9F, 0.25F, 0.0F, -0.9F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  922 */     this.gunModel['Æ'].setRotationPoint(-27.75F, -9.5F, 2.5F);
/*      */     
/*  924 */     this.gunModel['Ç'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  925 */     this.gunModel['Ç'].setRotationPoint(-27.75F, -9.0F, 2.5F);
/*      */     
/*  927 */     this.gunModel['È'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  928 */     this.gunModel['È'].setRotationPoint(-27.75F, -8.5F, 2.5F);
/*      */     
/*  930 */     this.gunModel['É'].addShapeBox(16.0F, 9.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.35F, -0.25F, 0.0F, -1.35F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  931 */     this.gunModel['É'].setRotationPoint(-27.75F, -8.0F, 2.5F);
/*      */     
/*  933 */     this.gunModel['Ê'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, 0.25F, 0.0F, -0.35F, 0.25F, 0.0F, -0.35F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.9F, -0.25F, 0.0F, -0.9F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  934 */     this.gunModel['Ê'].setRotationPoint(-27.75F, -7.0F, 2.5F);
/*      */     
/*  936 */     this.gunModel['Ë'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  937 */     this.gunModel['Ë'].setRotationPoint(-27.75F, -6.25F, 2.5F);
/*      */     
/*  939 */     this.gunModel['Ì'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  940 */     this.gunModel['Ì'].setRotationPoint(-27.75F, -5.5F, 2.5F);
/*      */     
/*  942 */     this.gunModel['Í'].addShapeBox(16.0F, 9.0F, -4.0F, 6, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.8F, -0.75F, 0.0F, 0.8F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  943 */     this.gunModel['Í'].setRotationPoint(-27.75F, -5.0F, 2.5F);
/*      */     
/*  945 */     this.gunModel['Î'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.15F, -0.25F, 0.0F, -1.15F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  946 */     this.gunModel['Î'].setRotationPoint(-27.75F, -4.75F, 2.5F);
/*      */     
/*  948 */     this.gunModel['Ï'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.45F, -0.25F, 0.0F, -1.45F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  949 */     this.gunModel['Ï'].setRotationPoint(-27.75F, -4.0F, 2.5F);
/*      */     
/*  951 */     this.gunModel['Ð'].addShapeBox(16.0F, 9.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.15F, -0.25F, 0.0F, -1.15F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  952 */     this.gunModel['Ð'].setRotationPoint(-27.75F, -3.25F, 2.5F);
/*      */     
/*  954 */     this.gunModel['Ñ'].addShapeBox(16.0F, 9.0F, -4.0F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 1.25F, -0.75F, 0.0F, 1.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  955 */     this.gunModel['Ñ'].setRotationPoint(-27.75F, -2.5F, 2.5F);
/*      */     
/*  957 */     this.gunModel['Ò'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  958 */     this.gunModel['Ò'].setRotationPoint(-28.75F, -11.5F, 2.5F);
/*      */     
/*  960 */     this.gunModel['Ó'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 4, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  961 */     this.gunModel['Ó'].setRotationPoint(-29.75F, -10.75F, 2.5F);
/*      */     
/*  963 */     this.gunModel['Ô'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 4, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.15F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F);
/*  964 */     this.gunModel['Ô'].setRotationPoint(-29.75F, -8.0F, 2.5F);
/*      */     
/*  966 */     this.gunModel['Õ'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 4, 0.0F, -0.15F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.15F, 0.25F, 0.0F, -0.15F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.15F, -1.0F, 0.0F);
/*  967 */     this.gunModel['Õ'].setRotationPoint(-29.75F, -6.25F, 2.5F);
/*      */     
/*  969 */     this.gunModel['Ö'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 3, 4, 0.0F, -0.15F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.15F, 0.25F, 0.0F, -0.65F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F);
/*  970 */     this.gunModel['Ö'].setRotationPoint(-29.75F, -5.0F, 2.5F);
/*      */     
/*  972 */     this.gunModel['×'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 4, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -1.7F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.7F, -0.25F, 0.0F);
/*  973 */     this.gunModel['×'].setRotationPoint(-29.75F, -2.75F, 2.5F);
/*      */     
/*  975 */     this.gunModel['Ø'].addShapeBox(16.0F, 9.0F, -4.0F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  976 */     this.gunModel['Ø'].setRotationPoint(-27.75F, -2.25F, 2.5F);
/*      */     
/*  978 */     this.gunModel['Ù'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  979 */     this.gunModel['Ù'].setRotationPoint(-29.0F, -15.0F, 2.5F);
/*      */     
/*  981 */     this.gunModel['Ú'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 4, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  982 */     this.gunModel['Ú'].setRotationPoint(-30.5F, -16.0F, 2.5F);
/*      */     
/*  984 */     this.gunModel['Û'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 0, 4, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  985 */     this.gunModel['Û'].setRotationPoint(-29.0F, -15.0F, 2.5F);
/*      */     
/*  987 */     this.gunModel['Ü'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 4, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  988 */     this.gunModel['Ü'].setRotationPoint(-31.0F, -17.0F, 2.5F);
/*      */     
/*  990 */     this.gunModel['Ý'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 6, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  991 */     this.gunModel['Ý'].setRotationPoint(-28.0F, -23.0F, 3.0F);
/*      */     
/*  993 */     this.gunModel['Þ'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 6, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F);
/*  994 */     this.gunModel['Þ'].setRotationPoint(-28.25F, -23.0F, 3.0F);
/*      */     
/*  996 */     this.gunModel['ß'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 6, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/*  997 */     this.gunModel['ß'].setRotationPoint(-28.25F, -23.0F, 4.5F);
/*      */     
/*  999 */     this.gunModel['à'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 3, 4, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/* 1000 */     this.gunModel['à'].setRotationPoint(-14.0F, -19.0F, 2.5F);
/*      */     
/* 1002 */     this.gunModel['á'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/* 1003 */     this.gunModel['á'].setRotationPoint(-13.5F, -16.25F, 2.5F);
/*      */     
/* 1005 */     this.gunModel['â'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F);
/* 1006 */     this.gunModel['â'].setRotationPoint(-16.0F, -14.0F, 2.5F);
/*      */     
/* 1008 */     this.gunModel['ã'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1009 */     this.gunModel['ã'].setRotationPoint(-17.0F, -18.0F, 2.5F);
/*      */     
/* 1011 */     this.gunModel['ä'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1012 */     this.gunModel['ä'].setRotationPoint(-18.0F, -18.0F, 2.5F);
/*      */     
/* 1014 */     this.gunModel['å'].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 4, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1015 */     this.gunModel['å'].setRotationPoint(-19.0F, -15.0F, 2.5F);
/*      */     
/* 1017 */     this.gunModel['æ'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1018 */     this.gunModel['æ'].setRotationPoint(-8.0F, -38.5F, 3.5F);
/*      */     
/* 1020 */     this.gunModel['ç'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1021 */     this.gunModel['ç'].setRotationPoint(-2.05F, -41.45F, 3.55F);
/*      */     
/* 1023 */     this.gunModel['è'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1024 */     this.gunModel['è'].setRotationPoint(-6.05F, -42.35F, 3.55F);
/*      */     
/* 1026 */     this.gunModel['é'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1027 */     this.gunModel['é'].setRotationPoint(-2.05F, -41.45F, 4.45F);
/*      */     
/* 1029 */     this.gunModel['ê'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1030 */     this.gunModel['ê'].setRotationPoint(-6.05F, -42.35F, 4.45F);
/*      */     
/* 1032 */     this.gunModel['ë'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1033 */     this.gunModel['ë'].setRotationPoint(-6.05F, -41.45F, 2.65F);
/*      */     
/* 1035 */     this.gunModel['ì'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1036 */     this.gunModel['ì'].setRotationPoint(-6.05F, -41.45F, 5.35F);
/*      */     
/* 1038 */     this.gunModel['í'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1039 */     this.gunModel['í'].setRotationPoint(-2.05F, -40.55F, 5.35F);
/*      */     
/* 1041 */     this.gunModel['î'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F);
/* 1042 */     this.gunModel['î'].setRotationPoint(-6.05F, -38.75F, 5.35F);
/*      */     
/* 1044 */     this.gunModel['ï'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1045 */     this.gunModel['ï'].setRotationPoint(-2.05F, -40.55F, 4.45F);
/*      */     
/* 1047 */     this.gunModel['ð'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1048 */     this.gunModel['ð'].setRotationPoint(-2.05F, -40.55F, 3.55F);
/*      */     
/* 1050 */     this.gunModel['ñ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1051 */     this.gunModel['ñ'].setRotationPoint(-2.05F, -40.55F, 2.65F);
/*      */     
/* 1053 */     this.gunModel['ò'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1054 */     this.gunModel['ò'].setRotationPoint(-2.05F, -39.65F, 5.35F);
/*      */     
/* 1056 */     this.gunModel['ó'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1057 */     this.gunModel['ó'].setRotationPoint(-2.05F, -39.65F, 4.45F);
/*      */     
/* 1059 */     this.gunModel['ô'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F);
/* 1060 */     this.gunModel['ô'].setRotationPoint(-6.05F, -39.65F, 6.25F);
/*      */     
/* 1062 */     this.gunModel['õ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F);
/* 1063 */     this.gunModel['õ'].setRotationPoint(-6.05F, -40.55F, 6.25F);
/*      */     
/* 1065 */     this.gunModel['ö'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1066 */     this.gunModel['ö'].setRotationPoint(-2.05F, -38.75F, 4.45F);
/*      */     
/* 1068 */     this.gunModel['÷'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1069 */     this.gunModel['÷'].setRotationPoint(-2.05F, -38.75F, 3.55F);
/*      */     
/* 1071 */     this.gunModel['ø'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1072 */     this.gunModel['ø'].setRotationPoint(-6.05F, -38.75F, 2.65F);
/*      */     
/* 1074 */     this.gunModel['ù'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1075 */     this.gunModel['ù'].setRotationPoint(-2.05F, -39.65F, 2.65F);
/*      */     
/* 1077 */     this.gunModel['ú'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1078 */     this.gunModel['ú'].setRotationPoint(-2.05F, -39.65F, 3.55F);
/*      */     
/* 1080 */     this.gunModel['û'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1081 */     this.gunModel['û'].setRotationPoint(-6.05F, -40.55F, 1.75F);
/*      */     
/* 1083 */     this.gunModel['ü'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1084 */     this.gunModel['ü'].setRotationPoint(-6.05F, -39.65F, 1.75F);
/*      */     
/* 1086 */     this.gunModel['ý'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F);
/* 1087 */     this.gunModel['ý'].setRotationPoint(-6.05F, -37.85F, 3.55F);
/*      */     
/* 1089 */     this.gunModel['þ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F);
/* 1090 */     this.gunModel['þ'].setRotationPoint(-6.05F, -37.85F, 4.45F);
/*      */     
/* 1092 */     this.gunModel['ÿ'].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 2, 0.0F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.15F, -0.05F, -0.75F, -0.15F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.15F, -0.05F, -0.05F, -0.15F);
/* 1093 */     this.gunModel['ÿ'].setRotationPoint(-2.55F, -43.35F, 3.55F);
/*      */     
/* 1095 */     this.gunModel['Ā'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1096 */     this.gunModel['Ā'].setRotationPoint(4.85F, -42.35F, 3.55F);
/*      */     
/* 1098 */     this.gunModel['ā'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1099 */     this.gunModel['ā'].setRotationPoint(4.85F, -42.35F, 4.45F);
/*      */     
/* 1101 */     this.gunModel['Ă'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1102 */     this.gunModel['Ă'].setRotationPoint(4.85F, -41.45F, 2.65F);
/*      */     
/* 1104 */     this.gunModel['ă'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1105 */     this.gunModel['ă'].setRotationPoint(4.85F, -41.45F, 5.35F);
/*      */     
/* 1107 */     this.gunModel['Ą'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F);
/* 1108 */     this.gunModel['Ą'].setRotationPoint(4.85F, -38.75F, 5.35F);
/*      */     
/* 1110 */     this.gunModel['ą'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F);
/* 1111 */     this.gunModel['ą'].setRotationPoint(4.85F, -39.65F, 6.25F);
/*      */     
/* 1113 */     this.gunModel['Ć'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F);
/* 1114 */     this.gunModel['Ć'].setRotationPoint(4.85F, -40.55F, 6.25F);
/*      */     
/* 1116 */     this.gunModel['ć'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1117 */     this.gunModel['ć'].setRotationPoint(4.85F, -38.75F, 2.65F);
/*      */     
/* 1119 */     this.gunModel['Ĉ'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1120 */     this.gunModel['Ĉ'].setRotationPoint(4.85F, -40.55F, 1.75F);
/*      */     
/* 1122 */     this.gunModel['ĉ'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1123 */     this.gunModel['ĉ'].setRotationPoint(4.85F, -39.65F, 1.75F);
/*      */     
/* 1125 */     this.gunModel['Ċ'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F);
/* 1126 */     this.gunModel['Ċ'].setRotationPoint(4.85F, -37.85F, 3.55F);
/*      */     
/* 1128 */     this.gunModel['ċ'].addShapeBox(16.0F, 9.0F, -4.0F, 3, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F);
/* 1129 */     this.gunModel['ċ'].setRotationPoint(4.85F, -37.85F, 4.45F);
/*      */     
/* 1131 */     this.gunModel['Č'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 3, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F);
/* 1132 */     this.gunModel['Č'].setRotationPoint(7.75F, -41.45F, 2.65F);
/*      */     
/* 1134 */     this.gunModel['č'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, 0.95F, -0.05F, 0.45F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1135 */     this.gunModel['č'].setRotationPoint(7.75F, -42.35F, 3.55F);
/*      */     
/* 1137 */     this.gunModel['Ď'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1138 */     this.gunModel['Ď'].setRotationPoint(7.75F, -40.55F, 1.75F);
/*      */     
/* 1140 */     this.gunModel['ď'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1141 */     this.gunModel['ď'].setRotationPoint(7.75F, -39.65F, 1.75F);
/*      */     
/* 1143 */     this.gunModel['Đ'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1144 */     this.gunModel['Đ'].setRotationPoint(7.75F, -38.75F, 2.65F);
/*      */     
/* 1146 */     this.gunModel['đ'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, 0.95F, -0.05F, 0.45F, -0.05F, -0.05F, -0.55F, -0.05F);
/* 1147 */     this.gunModel['đ'].setRotationPoint(7.75F, -37.85F, 3.55F);
/*      */     
/* 1149 */     this.gunModel['Ē'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.95F, 0.95F, -0.05F, -0.95F, -0.05F);
/* 1150 */     this.gunModel['Ē'].setRotationPoint(7.75F, -37.85F, 4.45F);
/*      */     
/* 1152 */     this.gunModel['ē'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 3, 0.0F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F);
/* 1153 */     this.gunModel['ē'].setRotationPoint(7.75F, -38.75F, 3.35F);
/*      */     
/* 1155 */     this.gunModel['Ĕ'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 5, 0.0F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F);
/* 1156 */     this.gunModel['Ĕ'].setRotationPoint(7.75F, -39.65F, 2.25F);
/*      */     
/* 1158 */     this.gunModel['ĕ'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 5, 0.0F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.55F);
/* 1159 */     this.gunModel['ĕ'].setRotationPoint(7.75F, -40.55F, 2.25F);
/*      */     
/* 1161 */     this.gunModel['Ė'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F);
/* 1162 */     this.gunModel['Ė'].setRotationPoint(7.75F, -41.45F, 5.35F);
/*      */     
/* 1164 */     this.gunModel['ė'].addShapeBox(16.0F, 9.0F, -4.0F, 14, 1, 1, 0.0F, -0.05F, -0.55F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.95F, 0.95F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F);
/* 1165 */     this.gunModel['ė'].setRotationPoint(7.75F, -42.35F, 4.45F);
/*      */     
/* 1167 */     this.gunModel['Ę'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1168 */     this.gunModel['Ę'].setRotationPoint(-11.95F, -42.35F, 3.55F);
/*      */     
/* 1170 */     this.gunModel['ę'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1171 */     this.gunModel['ę'].setRotationPoint(-11.95F, -42.35F, 4.45F);
/*      */     
/* 1173 */     this.gunModel['Ě'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1174 */     this.gunModel['Ě'].setRotationPoint(-11.95F, -41.45F, 2.65F);
/*      */     
/* 1176 */     this.gunModel['ě'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1177 */     this.gunModel['ě'].setRotationPoint(-11.95F, -41.45F, 5.35F);
/*      */     
/* 1179 */     this.gunModel['Ĝ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F);
/* 1180 */     this.gunModel['Ĝ'].setRotationPoint(-11.95F, -38.75F, 5.35F);
/*      */     
/* 1182 */     this.gunModel['ĝ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F);
/* 1183 */     this.gunModel['ĝ'].setRotationPoint(-11.95F, -40.55F, 6.25F);
/*      */     
/* 1185 */     this.gunModel['Ğ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1186 */     this.gunModel['Ğ'].setRotationPoint(-11.95F, -38.75F, 2.65F);
/*      */     
/* 1188 */     this.gunModel['ğ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1189 */     this.gunModel['ğ'].setRotationPoint(-11.95F, -40.55F, 1.75F);
/*      */     
/* 1191 */     this.gunModel['Ġ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1192 */     this.gunModel['Ġ'].setRotationPoint(-11.95F, -39.65F, 1.75F);
/*      */     
/* 1194 */     this.gunModel['ġ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F);
/* 1195 */     this.gunModel['ġ'].setRotationPoint(-11.95F, -37.85F, 3.55F);
/*      */     
/* 1197 */     this.gunModel['Ģ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F);
/* 1198 */     this.gunModel['Ģ'].setRotationPoint(-11.95F, -37.85F, 4.45F);
/*      */     
/* 1200 */     this.gunModel['ģ'].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F);
/* 1201 */     this.gunModel['ģ'].setRotationPoint(-11.95F, -39.65F, 6.25F);
/*      */     
/* 1203 */     this.gunModel['Ĥ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.95F, 0.95F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, 0.15F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1204 */     this.gunModel['Ĥ'].setRotationPoint(-20.85F, -42.35F, 3.55F);
/*      */     
/* 1206 */     this.gunModel['ĥ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, 0.15F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F);
/* 1207 */     this.gunModel['ĥ'].setRotationPoint(-20.85F, -42.35F, 4.45F);
/*      */     
/* 1209 */     this.gunModel['Ħ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F);
/* 1210 */     this.gunModel['Ħ'].setRotationPoint(-20.85F, -41.45F, 2.65F);
/*      */     
/* 1212 */     this.gunModel['ħ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 3, 0.0F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F);
/* 1213 */     this.gunModel['ħ'].setRotationPoint(-20.85F, -41.45F, 3.35F);
/*      */     
/* 1215 */     this.gunModel['Ĩ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F);
/* 1216 */     this.gunModel['Ĩ'].setRotationPoint(-20.85F, -38.75F, 5.35F);
/*      */     
/* 1218 */     this.gunModel['ĩ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, 0.45F);
/* 1219 */     this.gunModel['ĩ'].setRotationPoint(-20.85F, -40.55F, 6.25F);
/*      */     
/* 1221 */     this.gunModel['Ī'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 3, 0.0F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.25F, -0.05F, -0.05F, -0.25F);
/* 1222 */     this.gunModel['Ī'].setRotationPoint(-20.85F, -38.75F, 2.65F);
/*      */     
/* 1224 */     this.gunModel['ī'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 5, 0.0F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F);
/* 1225 */     this.gunModel['ī'].setRotationPoint(-20.85F, -40.55F, 1.75F);
/*      */     
/* 1227 */     this.gunModel['Ĭ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 5, 0.0F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.45F, -0.05F, -0.05F, -0.45F);
/* 1228 */     this.gunModel['Ĭ'].setRotationPoint(-20.85F, -39.65F, 1.75F);
/*      */     
/* 1230 */     this.gunModel['ĭ'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, 0.95F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, 0.95F, -0.05F, -0.95F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, 0.15F, -0.05F);
/* 1231 */     this.gunModel['ĭ'].setRotationPoint(-20.85F, -37.85F, 3.55F);
/*      */     
/* 1233 */     this.gunModel['Į'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -1.05F, -0.05F, 0.15F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, 0.95F);
/* 1234 */     this.gunModel['Į'].setRotationPoint(-20.85F, -37.85F, 4.45F);
/*      */     
/* 1236 */     this.gunModel['į'].addShapeBox(16.0F, 9.0F, -4.0F, 9, 1, 1, 0.0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.55F, -0.05F, -0.05F, 0.45F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0.05F);
/* 1237 */     this.gunModel['į'].setRotationPoint(-20.85F, -39.65F, 6.25F);
/*      */     
/*      */ 
/* 1240 */     this.defaultScopeModel = new ModelRendererTurbo[63];
/* 1241 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 313, 129, this.textureX, this.textureY);
/* 1242 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 329, 129, this.textureX, this.textureY);
/* 1243 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 1244 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/* 1245 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/* 1246 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/* 1247 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/* 1248 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/* 1249 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/* 1250 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/* 1251 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/* 1252 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/* 1253 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/* 1254 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/* 1255 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/* 1256 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 369, 73, this.textureX, this.textureY);
/* 1257 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 1258 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/* 1259 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/* 1260 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 489, 73, this.textureX, this.textureY);
/* 1261 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 9, 81, this.textureX, this.textureY);
/* 1262 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/* 1263 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/* 1264 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/* 1265 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/* 1266 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/* 1267 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/* 1268 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/* 1269 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 297, 89, this.textureX, this.textureY);
/* 1270 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/* 1271 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/* 1272 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/* 1273 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/* 1274 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/* 1275 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 209, 121, this.textureX, this.textureY);
/* 1276 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/* 1277 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 305, 121, this.textureX, this.textureY);
/* 1278 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/* 1279 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/* 1280 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 401, 121, this.textureX, this.textureY);
/* 1281 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/* 1282 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/* 1283 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/* 1284 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 353, 129, this.textureX, this.textureY);
/* 1285 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 369, 129, this.textureX, this.textureY);
/* 1286 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/* 1287 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 449, 129, this.textureX, this.textureY);
/* 1288 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 385, 129, this.textureX, this.textureY);
/* 1289 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/* 1290 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 417, 129, this.textureX, this.textureY);
/* 1291 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 433, 129, this.textureX, this.textureY);
/* 1292 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 457, 129, this.textureX, this.textureY);
/* 1293 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 465, 129, this.textureX, this.textureY);
/* 1294 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/* 1295 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 481, 129, this.textureX, this.textureY);
/* 1296 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 489, 129, this.textureX, this.textureY);
/* 1297 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 497, 129, this.textureX, this.textureY);
/* 1298 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/* 1299 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 1300 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 9, 137, this.textureX, this.textureY);
/* 1301 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 17, 137, this.textureX, this.textureY);
/* 1302 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 25, 137, this.textureX, this.textureY);
/* 1303 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 33, 137, this.textureX, this.textureY);
/*      */     
/* 1305 */     this.defaultScopeModel[0].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1306 */     this.defaultScopeModel[0].setRotationPoint(-8.0F, -36.0F, 2.5F);
/*      */     
/* 1308 */     this.defaultScopeModel[1].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1309 */     this.defaultScopeModel[1].setRotationPoint(2.9F, -36.0F, 2.5F);
/*      */     
/* 1311 */     this.defaultScopeModel[2].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1312 */     this.defaultScopeModel[2].setRotationPoint(-8.0F, -37.0F, 2.5F);
/*      */     
/* 1314 */     this.defaultScopeModel[3].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1315 */     this.defaultScopeModel[3].setRotationPoint(-8.0F, -37.0F, 5.5F);
/*      */     
/* 1317 */     this.defaultScopeModel[4].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1318 */     this.defaultScopeModel[4].setRotationPoint(2.9F, -37.0F, 2.5F);
/*      */     
/* 1320 */     this.defaultScopeModel[5].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1321 */     this.defaultScopeModel[5].setRotationPoint(2.9F, -37.0F, 5.5F);
/*      */     
/* 1323 */     this.defaultScopeModel[6].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1324 */     this.defaultScopeModel[6].setRotationPoint(2.9F, -38.5F, 5.5F);
/*      */     
/* 1326 */     this.defaultScopeModel[7].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1327 */     this.defaultScopeModel[7].setRotationPoint(2.9F, -39.5F, 6.5F);
/*      */     
/* 1329 */     this.defaultScopeModel[8].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1330 */     this.defaultScopeModel[8].setRotationPoint(-8.0F, -38.5F, 5.5F);
/*      */     
/* 1332 */     this.defaultScopeModel[9].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1333 */     this.defaultScopeModel[9].setRotationPoint(-8.0F, -39.5F, 6.5F);
/*      */     
/* 1335 */     this.defaultScopeModel[10].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     this.defaultScopeModel[10].setRotationPoint(2.9F, -38.5F, 2.5F);
/*      */     
/* 1338 */     this.defaultScopeModel[11].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1339 */     this.defaultScopeModel[11].setRotationPoint(-8.0F, -37.0F, 3.5F);
/*      */     
/* 1341 */     this.defaultScopeModel[12].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1342 */     this.defaultScopeModel[12].setRotationPoint(2.9F, -37.0F, 3.5F);
/*      */     
/* 1344 */     this.defaultScopeModel[13].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1345 */     this.defaultScopeModel[13].setRotationPoint(2.9F, -40.5F, 6.5F);
/*      */     
/* 1347 */     this.defaultScopeModel[14].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1348 */     this.defaultScopeModel[14].setRotationPoint(2.9F, -41.5F, 5.5F);
/*      */     
/* 1350 */     this.defaultScopeModel[15].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1351 */     this.defaultScopeModel[15].setRotationPoint(2.9F, -42.5F, 4.5F);
/*      */     
/* 1353 */     this.defaultScopeModel[16].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1354 */     this.defaultScopeModel[16].setRotationPoint(2.9F, -42.5F, 3.5F);
/*      */     
/* 1356 */     this.defaultScopeModel[17].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1357 */     this.defaultScopeModel[17].setRotationPoint(2.9F, -41.5F, 2.5F);
/*      */     
/* 1359 */     this.defaultScopeModel[18].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1360 */     this.defaultScopeModel[18].setRotationPoint(2.9F, -39.5F, 1.5F);
/*      */     
/* 1362 */     this.defaultScopeModel[19].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1363 */     this.defaultScopeModel[19].setRotationPoint(2.9F, -40.5F, 1.5F);
/*      */     
/* 1365 */     this.defaultScopeModel[20].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1366 */     this.defaultScopeModel[20].setRotationPoint(-8.0F, -38.5F, 2.5F);
/*      */     
/* 1368 */     this.defaultScopeModel[21].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1369 */     this.defaultScopeModel[21].setRotationPoint(-8.0F, -40.5F, 6.5F);
/*      */     
/* 1371 */     this.defaultScopeModel[22].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1372 */     this.defaultScopeModel[22].setRotationPoint(-8.0F, -41.5F, 5.5F);
/*      */     
/* 1374 */     this.defaultScopeModel[23].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1375 */     this.defaultScopeModel[23].setRotationPoint(-8.0F, -42.5F, 4.5F);
/*      */     
/* 1377 */     this.defaultScopeModel[24].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1378 */     this.defaultScopeModel[24].setRotationPoint(-8.0F, -42.5F, 3.5F);
/*      */     
/* 1380 */     this.defaultScopeModel[25].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.defaultScopeModel[25].setRotationPoint(-8.0F, -41.5F, 2.5F);
/*      */     
/* 1383 */     this.defaultScopeModel[26].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1384 */     this.defaultScopeModel[26].setRotationPoint(-8.0F, -39.5F, 1.5F);
/*      */     
/* 1386 */     this.defaultScopeModel[27].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1387 */     this.defaultScopeModel[27].setRotationPoint(-8.0F, -40.5F, 1.5F);
/*      */     
/* 1389 */     this.defaultScopeModel[28].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1390 */     this.defaultScopeModel[28].setRotationPoint(-4.0F, -39.5F, 5.0F);
/*      */     
/* 1392 */     this.defaultScopeModel[29].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1393 */     this.defaultScopeModel[29].setRotationPoint(-4.0F, -40.5F, 5.0F);
/*      */     
/* 1395 */     this.defaultScopeModel[30].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1396 */     this.defaultScopeModel[30].setRotationPoint(-8.0F, -38.5F, 4.5F);
/*      */     
/* 1398 */     this.defaultScopeModel[31].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1399 */     this.defaultScopeModel[31].setRotationPoint(-8.0F, -40.5F, 5.5F);
/*      */     
/* 1401 */     this.defaultScopeModel[32].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1402 */     this.defaultScopeModel[32].setRotationPoint(-4.0F, -39.5F, 2.5F);
/*      */     
/* 1404 */     this.defaultScopeModel[33].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1405 */     this.defaultScopeModel[33].setRotationPoint(-4.0F, -40.5F, 2.5F);
/*      */     
/* 1407 */     this.defaultScopeModel[34].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.defaultScopeModel[34].setRotationPoint(-8.0F, -40.5F, 2.0F);
/*      */     
/* 1410 */     this.defaultScopeModel[35].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1411 */     this.defaultScopeModel[35].setRotationPoint(-8.0F, -41.5F, 4.5F);
/*      */     
/* 1413 */     this.defaultScopeModel[36].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1414 */     this.defaultScopeModel[36].setRotationPoint(-8.0F, -41.5F, 3.5F);
/*      */     
/* 1416 */     this.defaultScopeModel[37].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1417 */     this.defaultScopeModel[37].setRotationPoint(6.9F, -39.5F, 5.0F);
/*      */     
/* 1419 */     this.defaultScopeModel[38].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.defaultScopeModel[38].setRotationPoint(6.9F, -40.5F, 5.0F);
/*      */     
/* 1422 */     this.defaultScopeModel[39].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1423 */     this.defaultScopeModel[39].setRotationPoint(2.9F, -38.5F, 4.5F);
/*      */     
/* 1425 */     this.defaultScopeModel[40].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1426 */     this.defaultScopeModel[40].setRotationPoint(2.9F, -38.5F, 3.5F);
/*      */     
/* 1428 */     this.defaultScopeModel[41].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1429 */     this.defaultScopeModel[41].setRotationPoint(6.9F, -39.5F, 2.5F);
/*      */     
/* 1431 */     this.defaultScopeModel[42].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1432 */     this.defaultScopeModel[42].setRotationPoint(6.9F, -40.5F, 2.5F);
/*      */     
/* 1434 */     this.defaultScopeModel[43].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1435 */     this.defaultScopeModel[43].setRotationPoint(2.9F, -41.5F, 4.5F);
/*      */     
/* 1437 */     this.defaultScopeModel[44].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1438 */     this.defaultScopeModel[44].setRotationPoint(2.9F, -41.5F, 3.5F);
/*      */     
/* 1440 */     this.defaultScopeModel[45].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1441 */     this.defaultScopeModel[45].setRotationPoint(2.9F, -40.5F, 5.5F);
/*      */     
/* 1443 */     this.defaultScopeModel[46].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1444 */     this.defaultScopeModel[46].setRotationPoint(2.9F, -40.5F, 2.0F);
/*      */     
/* 1446 */     this.defaultScopeModel[47].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1447 */     this.defaultScopeModel[47].setRotationPoint(-4.0F, -39.5F, 4.5F);
/*      */     
/* 1449 */     this.defaultScopeModel[48].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1450 */     this.defaultScopeModel[48].setRotationPoint(-4.0F, -39.5F, 3.5F);
/*      */     
/* 1452 */     this.defaultScopeModel[49].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1453 */     this.defaultScopeModel[49].setRotationPoint(-4.0F, -40.5F, 3.5F);
/*      */     
/* 1455 */     this.defaultScopeModel[50].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1456 */     this.defaultScopeModel[50].setRotationPoint(-4.0F, -40.5F, 4.5F);
/*      */     
/* 1458 */     this.defaultScopeModel[51].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1459 */     this.defaultScopeModel[51].setRotationPoint(-4.0F, -40.5F, 5.0F);
/*      */     
/* 1461 */     this.defaultScopeModel[52].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1462 */     this.defaultScopeModel[52].setRotationPoint(-4.0F, -39.5F, 5.0F);
/*      */     
/* 1464 */     this.defaultScopeModel[53].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1465 */     this.defaultScopeModel[53].setRotationPoint(-4.0F, -39.5F, 2.5F);
/*      */     
/* 1467 */     this.defaultScopeModel[54].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1468 */     this.defaultScopeModel[54].setRotationPoint(-4.0F, -40.5F, 2.5F);
/*      */     
/* 1470 */     this.defaultScopeModel[55].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1471 */     this.defaultScopeModel[55].setRotationPoint(6.9F, -39.5F, 4.5F);
/*      */     
/* 1473 */     this.defaultScopeModel[56].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1474 */     this.defaultScopeModel[56].setRotationPoint(6.9F, -39.5F, 3.5F);
/*      */     
/* 1476 */     this.defaultScopeModel[57].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1477 */     this.defaultScopeModel[57].setRotationPoint(6.9F, -40.5F, 3.5F);
/*      */     
/* 1479 */     this.defaultScopeModel[58].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1480 */     this.defaultScopeModel[58].setRotationPoint(6.9F, -40.5F, 4.5F);
/*      */     
/* 1482 */     this.defaultScopeModel[59].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1483 */     this.defaultScopeModel[59].setRotationPoint(6.9F, -40.5F, 5.0F);
/*      */     
/* 1485 */     this.defaultScopeModel[60].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1486 */     this.defaultScopeModel[60].setRotationPoint(6.9F, -39.5F, 5.0F);
/*      */     
/* 1488 */     this.defaultScopeModel[61].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1489 */     this.defaultScopeModel[61].setRotationPoint(6.9F, -39.5F, 2.5F);
/*      */     
/* 1491 */     this.defaultScopeModel[62].addShapeBox(16.0F, 9.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1492 */     this.defaultScopeModel[62].setRotationPoint(6.9F, -40.5F, 2.5F);
/*      */     
/*      */ 
/* 1495 */     this.ammoModel = new ModelRendererTurbo[9];
/* 1496 */     this.ammoModel[0] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/* 1497 */     this.ammoModel[1] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/* 1498 */     this.ammoModel[2] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
/* 1499 */     this.ammoModel[3] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/* 1500 */     this.ammoModel[4] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/* 1501 */     this.ammoModel[5] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/* 1502 */     this.ammoModel[6] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/* 1503 */     this.ammoModel[7] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/* 1504 */     this.ammoModel[8] = new ModelRendererTurbo(this, 193, 81, this.textureX, this.textureY);
/*      */     
/* 1506 */     this.ammoModel[0].addShapeBox(16.0F, 9.0F, -4.0F, 17, 16, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1507 */     this.ammoModel[0].setRotationPoint(-4.0F, -20.0F, 2.5F);
/*      */     
/* 1509 */     this.ammoModel[1].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.3F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.3F, -0.25F);
/* 1510 */     this.ammoModel[1].setRotationPoint(-4.0F, -20.0F, 2.0F);
/*      */     
/* 1512 */     this.ammoModel[2].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.8F, -0.25F);
/* 1513 */     this.ammoModel[2].setRotationPoint(1.0F, -20.0F, 2.0F);
/*      */     
/* 1515 */     this.ammoModel[3].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.3F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.3F, -0.25F);
/* 1516 */     this.ammoModel[3].setRotationPoint(6.0F, -20.0F, 2.0F);
/*      */     
/* 1518 */     this.ammoModel[4].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.75F, -0.25F);
/* 1519 */     this.ammoModel[4].setRotationPoint(11.0F, -20.0F, 2.0F);
/*      */     
/* 1521 */     this.ammoModel[5].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.75F, -0.25F);
/* 1522 */     this.ammoModel[5].setRotationPoint(11.0F, -20.0F, 6.0F);
/*      */     
/* 1524 */     this.ammoModel[6].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.3F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.3F, -0.25F);
/* 1525 */     this.ammoModel[6].setRotationPoint(6.0F, -20.0F, 6.0F);
/*      */     
/* 1527 */     this.ammoModel[7].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.8F, -0.25F);
/* 1528 */     this.ammoModel[7].setRotationPoint(1.0F, -20.0F, 6.0F);
/*      */     
/* 1530 */     this.ammoModel[8].addShapeBox(16.0F, 9.0F, -4.0F, 2, 16, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.3F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.3F, -0.25F);
/* 1531 */     this.ammoModel[8].setRotationPoint(-4.0F, -20.0F, 6.0F);
/*      */     
/*      */ 
/* 1534 */     this.pumpModel = new ModelRendererTurbo[28];
/* 1535 */     this.pumpModel[0] = new ModelRendererTurbo(this, 137, 41, this.textureX, this.textureY);
/* 1536 */     this.pumpModel[1] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/* 1537 */     this.pumpModel[2] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/* 1538 */     this.pumpModel[3] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/* 1539 */     this.pumpModel[4] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/* 1540 */     this.pumpModel[5] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 1541 */     this.pumpModel[6] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/* 1542 */     this.pumpModel[7] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/* 1543 */     this.pumpModel[8] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/* 1544 */     this.pumpModel[9] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/* 1545 */     this.pumpModel[10] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/* 1546 */     this.pumpModel[11] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/* 1547 */     this.pumpModel[12] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/* 1548 */     this.pumpModel[13] = new ModelRendererTurbo(this, 113, 81, this.textureX, this.textureY);
/* 1549 */     this.pumpModel[14] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/* 1550 */     this.pumpModel[15] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 1551 */     this.pumpModel[16] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/* 1552 */     this.pumpModel[17] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/* 1553 */     this.pumpModel[18] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/* 1554 */     this.pumpModel[19] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/* 1555 */     this.pumpModel[20] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/* 1556 */     this.pumpModel[21] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/* 1557 */     this.pumpModel[22] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 1558 */     this.pumpModel[23] = new ModelRendererTurbo(this, 377, 129, this.textureX, this.textureY);
/* 1559 */     this.pumpModel[24] = new ModelRendererTurbo(this, 393, 129, this.textureX, this.textureY);
/* 1560 */     this.pumpModel[25] = new ModelRendererTurbo(this, 409, 129, this.textureX, this.textureY);
/* 1561 */     this.pumpModel[26] = new ModelRendererTurbo(this, 425, 129, this.textureX, this.textureY);
/* 1562 */     this.pumpModel[27] = new ModelRendererTurbo(this, 505, 153, this.textureX, this.textureY);
/*      */     
/* 1564 */     this.pumpModel[0].addShapeBox(16.0F, 9.0F, -4.0F, 33, 3, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1565 */     this.pumpModel[0].setRotationPoint(-20.0F, -29.25F, 4.75F);
/*      */     
/* 1567 */     this.pumpModel[1].addShapeBox(16.0F, 9.0F, -4.0F, 33, 3, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1568 */     this.pumpModel[1].setRotationPoint(-20.0F, -29.25F, 3.5F);
/*      */     
/* 1570 */     this.pumpModel[2].addShapeBox(16.0F, 9.0F, -4.0F, 33, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1571 */     this.pumpModel[2].setRotationPoint(-20.0F, -28.5F, 2.25F);
/*      */     
/* 1573 */     this.pumpModel[3].addShapeBox(16.0F, 9.0F, -4.0F, 33, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1574 */     this.pumpModel[3].setRotationPoint(-20.0F, -28.0F, 2.0F);
/*      */     
/* 1576 */     this.pumpModel[4].addShapeBox(16.0F, 9.0F, -4.0F, 33, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1577 */     this.pumpModel[4].setRotationPoint(-20.0F, -29.25F, 2.0F);
/*      */     
/* 1579 */     this.pumpModel[5].addShapeBox(16.0F, 9.0F, -4.0F, 33, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1580 */     this.pumpModel[5].setRotationPoint(-20.0F, -30.0F, 2.25F);
/*      */     
/* 1582 */     this.pumpModel[6].addShapeBox(16.0F, 9.0F, -4.0F, 33, 3, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1583 */     this.pumpModel[6].setRotationPoint(-20.0F, -31.25F, 3.25F);
/*      */     
/* 1585 */     this.pumpModel[7].addShapeBox(16.0F, 9.0F, -4.0F, 33, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1586 */     this.pumpModel[7].setRotationPoint(-20.0F, -31.25F, 4.5F);
/*      */     
/* 1588 */     this.pumpModel[8].addShapeBox(16.0F, 9.0F, -4.0F, 33, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1589 */     this.pumpModel[8].setRotationPoint(-20.0F, -28.5F, 5.75F);
/*      */     
/* 1591 */     this.pumpModel[9].addShapeBox(16.0F, 9.0F, -4.0F, 33, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1592 */     this.pumpModel[9].setRotationPoint(-20.0F, -30.0F, 5.75F);
/*      */     
/* 1594 */     this.pumpModel[10].addShapeBox(16.0F, 9.0F, -4.0F, 33, 1, 1, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1595 */     this.pumpModel[10].setRotationPoint(-20.0F, -28.0F, 6.0F);
/*      */     
/* 1597 */     this.pumpModel[11].addShapeBox(16.0F, 9.0F, -4.0F, 33, 1, 1, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1598 */     this.pumpModel[11].setRotationPoint(-20.0F, -29.25F, 6.0F);
/*      */     
/* 1600 */     this.pumpModel[12].addShapeBox(16.0F, 9.0F, -4.0F, 2, 8, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1601 */     this.pumpModel[12].setRotationPoint(-22.0F, -30.5F, 3.0F);
/*      */     
/* 1603 */     this.pumpModel[13].addShapeBox(16.0F, 9.0F, -4.0F, 4, 2, 2, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1604 */     this.pumpModel[13].setRotationPoint(-24.0F, -30.0F, 0.5F);
/*      */     
/* 1606 */     this.pumpModel[14].addShapeBox(16.0F, 9.0F, -4.0F, 4, 2, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1607 */     this.pumpModel[14].setRotationPoint(-24.0F, -27.0F, 0.5F);
/*      */     
/* 1609 */     this.pumpModel[15].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1610 */     this.pumpModel[15].setRotationPoint(-22.0F, -26.5F, -1.0F);
/*      */     
/* 1612 */     this.pumpModel[16].addShapeBox(16.0F, 9.0F, -4.0F, 4, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1613 */     this.pumpModel[16].setRotationPoint(-24.0F, -30.0F, 6.0F);
/*      */     
/* 1615 */     this.pumpModel[17].addShapeBox(16.0F, 9.0F, -4.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1616 */     this.pumpModel[17].setRotationPoint(-24.0F, -26.0F, 6.0F);
/*      */     
/* 1618 */     this.pumpModel[18].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1619 */     this.pumpModel[18].setRotationPoint(-24.0F, -24.0F, 6.5F);
/*      */     
/* 1621 */     this.pumpModel[19].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1622 */     this.pumpModel[19].setRotationPoint(-24.0F, -24.0F, 2.0F);
/*      */     
/* 1624 */     this.pumpModel[20].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1625 */     this.pumpModel[20].setRotationPoint(-24.0F, -25.0F, 1.5F);
/*      */     
/* 1627 */     this.pumpModel[21].addShapeBox(16.0F, 9.0F, -4.0F, 4, 1, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1628 */     this.pumpModel[21].setRotationPoint(-24.0F, -27.0F, 6.0F);
/*      */     
/* 1630 */     this.pumpModel[22].addShapeBox(16.0F, 9.0F, -4.0F, 2, 7, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1631 */     this.pumpModel[22].setRotationPoint(-24.0F, -29.5F, 3.0F);
/*      */     
/* 1633 */     this.pumpModel[23].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 3, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1634 */     this.pumpModel[23].setRotationPoint(-22.0F, -25.5F, -4.0F);
/*      */     
/* 1636 */     this.pumpModel[24].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 3, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1637 */     this.pumpModel[24].setRotationPoint(-21.0F, -25.5F, -4.0F);
/*      */     
/* 1639 */     this.pumpModel[25].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 3, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1640 */     this.pumpModel[25].setRotationPoint(-22.0F, -24.5F, -4.0F);
/*      */     
/* 1642 */     this.pumpModel[26].addShapeBox(16.0F, 9.0F, -4.0F, 1, 1, 3, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1643 */     this.pumpModel[26].setRotationPoint(-21.0F, -24.5F, -4.0F);
/*      */     
/* 1645 */     this.pumpModel[27].addShapeBox(16.0F, 9.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F);
/* 1646 */     this.pumpModel[27].setRotationPoint(-22.0F, -23.0F, -5.5F);
/*      */     
/*      */ 
/*      */ 
/* 1650 */     translateAll(0.0F, -7.0F, 0.0F);
/* 1651 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/* 1653 */     this.gunSlideDistance = 0.0F;
/* 1654 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;this.pumpDelayAfterReload = 60;this.pumpDelay = 12;
/* 1655 */     this.pumpTime = 30;
/* 1656 */     this.gripIsOnPump = false;
/* 1657 */     this.pumpHandleDistance = 0.15F;
/*      */     
/*      */ 
/*      */ 
/* 1661 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelintervention.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */