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
/*      */ public class Modelmp40
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelmp40()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ā'];
/*   22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   24 */     this.gunModel[2] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   25 */     this.gunModel[3] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   26 */     this.gunModel[4] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   27 */     this.gunModel[5] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   28 */     this.gunModel[6] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   29 */     this.gunModel[7] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   30 */     this.gunModel[8] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   31 */     this.gunModel[9] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   32 */     this.gunModel[10] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   33 */     this.gunModel[11] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   34 */     this.gunModel[12] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   35 */     this.gunModel[13] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*   36 */     this.gunModel[14] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   37 */     this.gunModel[15] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*   38 */     this.gunModel[16] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*   39 */     this.gunModel[17] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*   40 */     this.gunModel[18] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*   41 */     this.gunModel[19] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*   42 */     this.gunModel[20] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   43 */     this.gunModel[21] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*   44 */     this.gunModel[22] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*   45 */     this.gunModel[23] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[24] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   47 */     this.gunModel[25] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*   48 */     this.gunModel[26] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*   49 */     this.gunModel[27] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*   50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   51 */     this.gunModel[29] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*   52 */     this.gunModel[30] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*   53 */     this.gunModel[31] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*   54 */     this.gunModel[32] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*   55 */     this.gunModel[33] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/*   56 */     this.gunModel[34] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*   57 */     this.gunModel[35] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*   58 */     this.gunModel[36] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*   59 */     this.gunModel[37] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*   60 */     this.gunModel[38] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/*   61 */     this.gunModel[39] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/*   62 */     this.gunModel[40] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/*   63 */     this.gunModel[41] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/*   64 */     this.gunModel[42] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*   65 */     this.gunModel[43] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*   66 */     this.gunModel[44] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/*   67 */     this.gunModel[45] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/*   68 */     this.gunModel[46] = new ModelRendererTurbo(this, 313, 89, this.textureX, this.textureY);
/*   69 */     this.gunModel[47] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[48] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[49] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*   72 */     this.gunModel[50] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[51] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*   74 */     this.gunModel[52] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*   75 */     this.gunModel[53] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/*   76 */     this.gunModel[54] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[55] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*   78 */     this.gunModel[56] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*   79 */     this.gunModel[57] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*   80 */     this.gunModel[58] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*   81 */     this.gunModel[59] = new ModelRendererTurbo(this, 393, 89, this.textureX, this.textureY);
/*   82 */     this.gunModel[60] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/*   83 */     this.gunModel[61] = new ModelRendererTurbo(this, 457, 89, this.textureX, this.textureY);
/*   84 */     this.gunModel[62] = new ModelRendererTurbo(this, 489, 89, this.textureX, this.textureY);
/*   85 */     this.gunModel[63] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*   86 */     this.gunModel[64] = new ModelRendererTurbo(this, 33, 97, this.textureX, this.textureY);
/*   87 */     this.gunModel[65] = new ModelRendererTurbo(this, 57, 97, this.textureX, this.textureY);
/*   88 */     this.gunModel[66] = new ModelRendererTurbo(this, 81, 97, this.textureX, this.textureY);
/*   89 */     this.gunModel[67] = new ModelRendererTurbo(this, 113, 97, this.textureX, this.textureY);
/*   90 */     this.gunModel[68] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*   91 */     this.gunModel[69] = new ModelRendererTurbo(this, 169, 97, this.textureX, this.textureY);
/*   92 */     this.gunModel[70] = new ModelRendererTurbo(this, 201, 97, this.textureX, this.textureY);
/*   93 */     this.gunModel[71] = new ModelRendererTurbo(this, 225, 105, this.textureX, this.textureY);
/*   94 */     this.gunModel[72] = new ModelRendererTurbo(this, 257, 105, this.textureX, this.textureY);
/*   95 */     this.gunModel[73] = new ModelRendererTurbo(this, 289, 105, this.textureX, this.textureY);
/*   96 */     this.gunModel[74] = new ModelRendererTurbo(this, 321, 105, this.textureX, this.textureY);
/*   97 */     this.gunModel[75] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/*   98 */     this.gunModel[76] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/*   99 */     this.gunModel[77] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  100 */     this.gunModel[78] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*  101 */     this.gunModel[79] = new ModelRendererTurbo(this, 457, 105, this.textureX, this.textureY);
/*  102 */     this.gunModel[80] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  103 */     this.gunModel[81] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/*  104 */     this.gunModel[82] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/*  105 */     this.gunModel[83] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/*  106 */     this.gunModel[84] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  107 */     this.gunModel[85] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  108 */     this.gunModel[86] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/*  109 */     this.gunModel[87] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  110 */     this.gunModel[88] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[89] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  112 */     this.gunModel[90] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/*  113 */     this.gunModel[91] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  114 */     this.gunModel[92] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/*  115 */     this.gunModel[93] = new ModelRendererTurbo(this, 393, 113, this.textureX, this.textureY);
/*  116 */     this.gunModel[94] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/*  117 */     this.gunModel[95] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/*  118 */     this.gunModel[96] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  119 */     this.gunModel[97] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/*  120 */     this.gunModel[98] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  121 */     this.gunModel[99] = new ModelRendererTurbo(this, 145, 137, this.textureX, this.textureY);
/*  122 */     this.gunModel[100] = new ModelRendererTurbo(this, 377, 121, this.textureX, this.textureY);
/*  123 */     this.gunModel[101] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/*  124 */     this.gunModel[102] = new ModelRendererTurbo(this, 281, 137, this.textureX, this.textureY);
/*  125 */     this.gunModel[103] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  126 */     this.gunModel[104] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  127 */     this.gunModel[105] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[106] = new ModelRendererTurbo(this, 409, 129, this.textureX, this.textureY);
/*  129 */     this.gunModel[107] = new ModelRendererTurbo(this, 497, 129, this.textureX, this.textureY);
/*  130 */     this.gunModel[108] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  131 */     this.gunModel[109] = new ModelRendererTurbo(this, 433, 137, this.textureX, this.textureY);
/*  132 */     this.gunModel[110] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  133 */     this.gunModel[111] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/*  134 */     this.gunModel[112] = new ModelRendererTurbo(this, 145, 145, this.textureX, this.textureY);
/*  135 */     this.gunModel[113] = new ModelRendererTurbo(this, 193, 145, this.textureX, this.textureY);
/*  136 */     this.gunModel[114] = new ModelRendererTurbo(this, 233, 145, this.textureX, this.textureY);
/*  137 */     this.gunModel[115] = new ModelRendererTurbo(this, 305, 145, this.textureX, this.textureY);
/*  138 */     this.gunModel[116] = new ModelRendererTurbo(this, 353, 145, this.textureX, this.textureY);
/*  139 */     this.gunModel[117] = new ModelRendererTurbo(this, 145, 153, this.textureX, this.textureY);
/*  140 */     this.gunModel[118] = new ModelRendererTurbo(this, 465, 145, this.textureX, this.textureY);
/*  141 */     this.gunModel[119] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  142 */     this.gunModel[120] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  143 */     this.gunModel[121] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[122] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[123] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  146 */     this.gunModel[124] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  147 */     this.gunModel[125] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*  148 */     this.gunModel[126] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  149 */     this.gunModel[127] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*  150 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/*  151 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/*  152 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  153 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  154 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*  155 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*  156 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  157 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 153, this.textureX, this.textureY);
/*  158 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 153, this.textureX, this.textureY);
/*  159 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  160 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/*  161 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 153, this.textureX, this.textureY);
/*  162 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  163 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 153, this.textureX, this.textureY);
/*  164 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  165 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  167 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 145, this.textureX, this.textureY);
/*  168 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 153, this.textureX, this.textureY);
/*  169 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 153, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 153, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 161, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 161, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 161, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 161, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 161, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/*  182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/*  183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/*  186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/*  187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/*  189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*  190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 145, 169, this.textureX, this.textureY);
/*  191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 345, 161, this.textureX, this.textureY);
/*  192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 241, 169, this.textureX, this.textureY);
/*  193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 305, 169, this.textureX, this.textureY);
/*  194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 345, 169, this.textureX, this.textureY);
/*  195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/*  196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 393, 169, this.textureX, this.textureY);
/*  197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 497, 161, this.textureX, this.textureY);
/*  198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 417, 169, this.textureX, this.textureY);
/*  199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 441, 169, this.textureX, this.textureY);
/*  200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 473, 169, this.textureX, this.textureY);
/*  201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 33, 177, this.textureX, this.textureY);
/*  203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 65, 177, this.textureX, this.textureY);
/*  204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/*  205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 105, 97, this.textureX, this.textureY);
/*  206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 161, 97, this.textureX, this.textureY);
/*  208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 249, 161, this.textureX, this.textureY);
/*  209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 273, 161, this.textureX, this.textureY);
/*  210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 89, 177, this.textureX, this.textureY);
/*  211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/*  212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 249, 105, this.textureX, this.textureY);
/*  213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 281, 105, this.textureX, this.textureY);
/*  214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 313, 105, this.textureX, this.textureY);
/*  215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 233, 177, this.textureX, this.textureY);
/*  217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*  226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/*  227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 265, 177, this.textureX, this.textureY);
/*  228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 281, 177, this.textureX, this.textureY);
/*  229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 89, 185, this.textureX, this.textureY);
/*  230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 153, 185, this.textureX, this.textureY);
/*  231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 177, 185, this.textureX, this.textureY);
/*  232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 201, 185, this.textureX, this.textureY);
/*  233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 225, 185, this.textureX, this.textureY);
/*  234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 249, 185, this.textureX, this.textureY);
/*  235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 401, 177, this.textureX, this.textureY);
/*  236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 489, 177, this.textureX, this.textureY);
/*  237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 105, 185, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 265, 185, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 305, 185, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 329, 185, this.textureX, this.textureY);
/*  241 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 353, 185, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 377, 185, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 417, 185, this.textureX, this.textureY);
/*  244 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  245 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 129, 193, this.textureX, this.textureY);
/*  246 */     this.gunModel['à'] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/*  247 */     this.gunModel['á'] = new ModelRendererTurbo(this, 321, 185, this.textureX, this.textureY);
/*  248 */     this.gunModel['â'] = new ModelRendererTurbo(this, 417, 81, this.textureX, this.textureY);
/*  249 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  250 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 345, 185, this.textureX, this.textureY);
/*  251 */     this.gunModel['å'] = new ModelRendererTurbo(this, 225, 97, this.textureX, this.textureY);
/*  252 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  253 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  254 */     this.gunModel['è'] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  255 */     this.gunModel['é'] = new ModelRendererTurbo(this, 369, 185, this.textureX, this.textureY);
/*  256 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*  257 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/*  258 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 433, 185, this.textureX, this.textureY);
/*  259 */     this.gunModel['í'] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*  260 */     this.gunModel['î'] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/*  261 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 449, 185, this.textureX, this.textureY);
/*  262 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/*  263 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 481, 105, this.textureX, this.textureY);
/*  264 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 49, 113, this.textureX, this.textureY);
/*  265 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 465, 185, this.textureX, this.textureY);
/*  266 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*  267 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 225, 193, this.textureX, this.textureY);
/*  268 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 89, 113, this.textureX, this.textureY);
/*  269 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/*  270 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/*  271 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 153, 113, this.textureX, this.textureY);
/*  272 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 241, 193, this.textureX, this.textureY);
/*  273 */     this.gunModel['û'] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*  274 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 89, 193, this.textureX, this.textureY);
/*  275 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 281, 193, this.textureX, this.textureY);
/*  276 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 393, 193, this.textureX, this.textureY);
/*  277 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 473, 193, this.textureX, this.textureY);
/*      */     
/*  279 */     this.gunModel[0].addShapeBox(56.0F, -3.0F, -4.0F, 15, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  280 */     this.gunModel[0].setRotationPoint(-1.0F, -7.5F, 0.0F);
/*      */     
/*  282 */     this.gunModel[1].addShapeBox(56.0F, -3.0F, -4.0F, 13, 15, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  283 */     this.gunModel[1].setRotationPoint(-1.0F, -22.5F, 0.0F);
/*      */     
/*  285 */     this.gunModel[2].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  286 */     this.gunModel[2].setRotationPoint(12.0F, -21.5F, 0.0F);
/*      */     
/*  288 */     this.gunModel[3].addShapeBox(56.0F, -3.0F, -4.0F, 4, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  289 */     this.gunModel[3].setRotationPoint(12.0F, -22.5F, 0.0F);
/*      */     
/*  291 */     this.gunModel[4].addShapeBox(56.0F, -3.0F, -4.0F, 24, 1, 8, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  292 */     this.gunModel[4].setRotationPoint(-8.0F, -23.5F, 0.0F);
/*      */     
/*  294 */     this.gunModel[5].addShapeBox(56.0F, -3.0F, -4.0F, 8, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  295 */     this.gunModel[5].setRotationPoint(-9.0F, -22.5F, 0.0F);
/*      */     
/*  297 */     this.gunModel[6].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  298 */     this.gunModel[6].setRotationPoint(-9.0F, -18.5F, 0.0F);
/*      */     
/*  300 */     this.gunModel[7].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  301 */     this.gunModel[7].setRotationPoint(-7.0F, -15.5F, 0.0F);
/*      */     
/*  303 */     this.gunModel[8].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  304 */     this.gunModel[8].setRotationPoint(-6.0F, -14.5F, 0.0F);
/*      */     
/*  306 */     this.gunModel[9].addShapeBox(56.0F, -3.0F, -4.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  307 */     this.gunModel[9].setRotationPoint(-4.0F, -15.5F, 0.0F);
/*      */     
/*  309 */     this.gunModel[10].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  310 */     this.gunModel[10].setRotationPoint(-5.0F, -15.5F, 0.0F);
/*      */     
/*  312 */     this.gunModel[11].addShapeBox(56.0F, -3.0F, -4.0F, 5, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  313 */     this.gunModel[11].setRotationPoint(-6.0F, -18.5F, 0.0F);
/*      */     
/*  315 */     this.gunModel[12].addShapeBox(56.0F, -3.0F, -4.0F, 11, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  316 */     this.gunModel[12].setRotationPoint(0.0F, -5.5F, -0.5F);
/*      */     
/*  318 */     this.gunModel[13].addShapeBox(56.0F, -3.0F, -4.0F, 9, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  319 */     this.gunModel[13].setRotationPoint(1.0F, -9.5F, -0.5F);
/*      */     
/*  321 */     this.gunModel[14].addShapeBox(56.0F, -3.0F, -4.0F, 9, 1, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  322 */     this.gunModel[14].setRotationPoint(1.0F, -13.5F, -0.5F);
/*      */     
/*  324 */     this.gunModel[15].addShapeBox(56.0F, -3.0F, -4.0F, 9, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  325 */     this.gunModel[15].setRotationPoint(1.0F, -17.5F, -0.5F);
/*      */     
/*  327 */     this.gunModel[16].addShapeBox(56.0F, -3.0F, -4.0F, 9, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  328 */     this.gunModel[16].setRotationPoint(1.0F, -21.5F, -0.5F);
/*      */     
/*  330 */     this.gunModel[17].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  331 */     this.gunModel[17].setRotationPoint(-2.0F, -13.5F, 0.0F);
/*      */     
/*  333 */     this.gunModel[18].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  334 */     this.gunModel[18].setRotationPoint(-5.0F, -19.0F, -0.5F);
/*      */     
/*  336 */     this.gunModel[19].addShapeBox(56.0F, -3.0F, -4.0F, 65, 5, 11, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  337 */     this.gunModel[19].setRotationPoint(-75.0F, -26.5F, -1.5F);
/*      */     
/*  339 */     this.gunModel[20].addShapeBox(56.0F, -3.0F, -4.0F, 49, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  340 */     this.gunModel[20].setRotationPoint(-76.0F, -21.5F, -1.5F);
/*      */     
/*  342 */     this.gunModel[21].addShapeBox(56.0F, -3.0F, -4.0F, 10, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  343 */     this.gunModel[21].setRotationPoint(-20.0F, -21.5F, -1.5F);
/*      */     
/*  345 */     this.gunModel[22].addShapeBox(56.0F, -3.0F, -4.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -1.0F);
/*  346 */     this.gunModel[22].setRotationPoint(-25.0F, -21.5F, -1.5F);
/*      */     
/*  348 */     this.gunModel[23].addShapeBox(56.0F, -3.0F, -4.0F, 2, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 0.0F);
/*  349 */     this.gunModel[23].setRotationPoint(-27.0F, -21.5F, -1.5F);
/*      */     
/*  351 */     this.gunModel[24].addShapeBox(56.0F, -3.0F, -4.0F, 17, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  352 */     this.gunModel[24].setRotationPoint(-27.0F, -20.5F, 0.5F);
/*      */     
/*  354 */     this.gunModel[25].addShapeBox(56.0F, -3.0F, -4.0F, 66, 3, 7, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  355 */     this.gunModel[25].setRotationPoint(-76.0F, -17.5F, 0.5F);
/*      */     
/*  357 */     this.gunModel[26].addShapeBox(56.0F, -3.0F, -4.0F, 17, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  358 */     this.gunModel[26].setRotationPoint(-28.0F, -14.5F, 0.5F);
/*      */     
/*  360 */     this.gunModel[27].addShapeBox(56.0F, -3.0F, -4.0F, 16, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  361 */     this.gunModel[27].setRotationPoint(-28.0F, -12.5F, 0.5F);
/*      */     
/*  363 */     this.gunModel[28].addShapeBox(56.0F, -3.0F, -4.0F, 49, 2, 11, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  364 */     this.gunModel[28].setRotationPoint(-76.0F, -17.5F, -1.5F);
/*      */     
/*  366 */     this.gunModel[29].addShapeBox(56.0F, -3.0F, -4.0F, 4, 2, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  367 */     this.gunModel[29].setRotationPoint(-32.0F, -9.5F, 0.5F);
/*      */     
/*  369 */     this.gunModel[30].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 7, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  370 */     this.gunModel[30].setRotationPoint(-39.0F, -9.5F, 0.5F);
/*      */     
/*  372 */     this.gunModel[31].addShapeBox(56.0F, -3.0F, -4.0F, 11, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  373 */     this.gunModel[31].setRotationPoint(-28.0F, -8.5F, 0.5F);
/*      */     
/*  375 */     this.gunModel[32].addShapeBox(56.0F, -3.0F, -4.0F, 45, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  376 */     this.gunModel[32].setRotationPoint(-73.0F, -14.5F, 0.5F);
/*      */     
/*  378 */     this.gunModel[33].addShapeBox(56.0F, -3.0F, -4.0F, 45, 3, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F);
/*  379 */     this.gunModel[33].setRotationPoint(-73.0F, -11.5F, 0.5F);
/*      */     
/*  381 */     this.gunModel[34].addShapeBox(56.0F, -3.0F, -4.0F, 45, 2, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  382 */     this.gunModel[34].setRotationPoint(-73.0F, -13.0F, 0.5F);
/*      */     
/*  384 */     this.gunModel[35].addShapeBox(56.0F, -3.0F, -4.0F, 4, 2, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -1.5F, 0.0F);
/*  385 */     this.gunModel[35].setRotationPoint(-77.0F, -16.0F, 0.5F);
/*      */     
/*  387 */     this.gunModel[36].addShapeBox(56.0F, -3.0F, -4.0F, 25, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  388 */     this.gunModel[36].setRotationPoint(-40.5F, -9.5F, 0.0F);
/*      */     
/*  390 */     this.gunModel[37].addShapeBox(56.0F, -3.0F, -4.0F, 26, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  391 */     this.gunModel[37].setRotationPoint(-40.5F, -10.5F, 0.0F);
/*      */     
/*  393 */     this.gunModel[38].addShapeBox(56.0F, -3.0F, -4.0F, 27, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  394 */     this.gunModel[38].setRotationPoint(-40.5F, -11.5F, 0.0F);
/*      */     
/*  396 */     this.gunModel[39].addShapeBox(56.0F, -3.0F, -4.0F, 28, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  397 */     this.gunModel[39].setRotationPoint(-40.5F, -12.5F, 0.0F);
/*      */     
/*  399 */     this.gunModel[40].addShapeBox(56.0F, -3.0F, -4.0F, 28, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.5F, -0.75F, -0.35F, 0.5F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  400 */     this.gunModel[40].setRotationPoint(-40.5F, -13.5F, 0.0F);
/*      */     
/*  402 */     this.gunModel[41].addShapeBox(56.0F, -3.0F, -4.0F, 29, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  403 */     this.gunModel[41].setRotationPoint(-40.5F, -14.5F, 0.0F);
/*      */     
/*  405 */     this.gunModel[42].addShapeBox(56.0F, -3.0F, -4.0F, 30, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, -0.5F, -0.75F, -0.35F, -0.5F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  406 */     this.gunModel[42].setRotationPoint(-40.5F, -15.5F, 0.0F);
/*      */     
/*  408 */     this.gunModel[43].addShapeBox(56.0F, -3.0F, -4.0F, 28, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  409 */     this.gunModel[43].setRotationPoint(-38.5F, -16.5F, 0.0F);
/*      */     
/*  411 */     this.gunModel[44].addShapeBox(56.0F, -3.0F, -4.0F, 28, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.25F, 0.0F, -0.35F, 0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.25F, -0.75F, -0.35F, 0.25F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  412 */     this.gunModel[44].setRotationPoint(-38.5F, -17.5F, 0.0F);
/*      */     
/*  414 */     this.gunModel[45].addShapeBox(56.0F, -3.0F, -4.0F, 28, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.25F, 0.0F, -0.35F, 0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.25F, -0.75F, -0.35F, 0.25F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  415 */     this.gunModel[45].setRotationPoint(-38.5F, -18.5F, 0.0F);
/*      */     
/*  417 */     this.gunModel[46].addShapeBox(56.0F, -3.0F, -4.0F, 28, 1, 8, 0.0F, 0.0F, 0.0F, -0.35F, 0.25F, 0.0F, -0.35F, 0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.75F, -0.35F, 0.25F, -0.75F, -0.35F, 0.25F, -0.75F, -0.35F, 0.0F, -0.75F, -0.35F);
/*  418 */     this.gunModel[46].setRotationPoint(-38.5F, -19.5F, 0.0F);
/*      */     
/*  420 */     this.gunModel[47].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 6, 0.0F, 2.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  421 */     this.gunModel[47].setRotationPoint(-53.0F, -9.5F, 1.0F);
/*      */     
/*  423 */     this.gunModel[48].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 6, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  424 */     this.gunModel[48].setRotationPoint(-52.0F, -7.5F, 1.0F);
/*      */     
/*  426 */     this.gunModel[49].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  427 */     this.gunModel[49].setRotationPoint(-50.5F, -9.5F, 1.0F);
/*      */     
/*  429 */     this.gunModel[50].addShapeBox(56.0F, -3.0F, -4.0F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  430 */     this.gunModel[50].setRotationPoint(-50.5F, -8.0F, 1.0F);
/*      */     
/*  432 */     this.gunModel[51].addShapeBox(56.0F, -3.0F, -4.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  433 */     this.gunModel[51].setRotationPoint(-52.0F, -6.0F, 1.0F);
/*      */     
/*  435 */     this.gunModel[52].addShapeBox(56.0F, -3.0F, -4.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  436 */     this.gunModel[52].setRotationPoint(-52.5F, -4.0F, 1.0F);
/*      */     
/*  438 */     this.gunModel[53].addShapeBox(56.0F, -3.0F, -4.0F, 9, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  439 */     this.gunModel[53].setRotationPoint(-62.0F, -2.0F, 1.0F);
/*      */     
/*  441 */     this.gunModel[54].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  442 */     this.gunModel[54].setRotationPoint(-64.0F, -2.0F, 1.0F);
/*      */     
/*  444 */     this.gunModel[55].addShapeBox(56.0F, -3.0F, -4.0F, 1, 2, 6, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  445 */     this.gunModel[55].setRotationPoint(-65.0F, -3.0F, 1.0F);
/*      */     
/*  447 */     this.gunModel[56].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  448 */     this.gunModel[56].setRotationPoint(-65.0F, -9.0F, 1.0F);
/*      */     
/*  450 */     this.gunModel[57].addShapeBox(56.0F, -3.0F, -4.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  451 */     this.gunModel[57].setRotationPoint(-65.0F, -8.0F, 1.0F);
/*      */     
/*  453 */     this.gunModel[58].addShapeBox(56.0F, -3.0F, -4.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  454 */     this.gunModel[58].setRotationPoint(-66.0F, -9.0F, 1.0F);
/*      */     
/*  456 */     this.gunModel[59].addShapeBox(56.0F, -3.0F, -4.0F, 9, 11, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  457 */     this.gunModel[59].setRotationPoint(-75.0F, -1.5F, 0.5F);
/*      */     
/*  459 */     this.gunModel[60].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  460 */     this.gunModel[60].setRotationPoint(-72.0F, 9.5F, 0.5F);
/*      */     
/*  462 */     this.gunModel[61].addShapeBox(56.0F, -3.0F, -4.0F, 8, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  463 */     this.gunModel[61].setRotationPoint(-80.0F, 9.5F, 0.5F);
/*      */     
/*  465 */     this.gunModel[62].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  466 */     this.gunModel[62].setRotationPoint(-81.0F, 8.5F, 0.5F);
/*      */     
/*  468 */     this.gunModel[63].addShapeBox(56.0F, -3.0F, -4.0F, 6, 12, 7, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  469 */     this.gunModel[63].setRotationPoint(-81.0F, -3.5F, 0.5F);
/*      */     
/*  471 */     this.gunModel[64].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  472 */     this.gunModel[64].setRotationPoint(-72.0F, 11.5F, 0.5F);
/*      */     
/*  474 */     this.gunModel[65].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  475 */     this.gunModel[65].setRotationPoint(-72.0F, 12.0F, 0.5F);
/*      */     
/*  477 */     this.gunModel[66].addShapeBox(56.0F, -3.0F, -4.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  478 */     this.gunModel[66].setRotationPoint(-80.0F, 8.5F, 0.5F);
/*      */     
/*  480 */     this.gunModel[67].addShapeBox(56.0F, -3.0F, -4.0F, 3, 6, 7, 0.0F, -2.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.75F, -0.75F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  481 */     this.gunModel[67].setRotationPoint(-76.5F, -9.75F, 0.5F);
/*      */     
/*  483 */     this.gunModel[68].addShapeBox(56.0F, -3.0F, -4.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  484 */     this.gunModel[68].setRotationPoint(-74.5F, -3.5F, 0.5F);
/*      */     
/*  486 */     this.gunModel[69].addShapeBox(56.0F, -3.0F, -4.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[69].setRotationPoint(-74.5F, -2.5F, 0.5F);
/*      */     
/*  489 */     this.gunModel[70].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  490 */     this.gunModel[70].setRotationPoint(-73.5F, -4.5F, 0.5F);
/*      */     
/*  492 */     this.gunModel[71].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  493 */     this.gunModel[71].setRotationPoint(-73.5F, -5.5F, 0.5F);
/*      */     
/*  495 */     this.gunModel[72].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  496 */     this.gunModel[72].setRotationPoint(-73.5F, -6.5F, 0.5F);
/*      */     
/*  498 */     this.gunModel[73].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  499 */     this.gunModel[73].setRotationPoint(-73.5F, -7.5F, 0.5F);
/*      */     
/*  501 */     this.gunModel[74].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 7, 0.0F, 0.0F, 0.5F, 0.0F, 2.4F, 0.5F, 0.0F, 2.4F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  502 */     this.gunModel[74].setRotationPoint(-73.5F, -8.5F, 0.5F);
/*      */     
/*  504 */     this.gunModel[75].addShapeBox(56.0F, -3.0F, -4.0F, 1, 2, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  505 */     this.gunModel[75].setRotationPoint(-75.5F, -3.5F, 0.5F);
/*      */     
/*  507 */     this.gunModel[76].addShapeBox(56.0F, -3.0F, -4.0F, 6, 12, 6, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  508 */     this.gunModel[76].setRotationPoint(-81.5F, -3.5F, 1.0F);
/*      */     
/*  510 */     this.gunModel[77].addShapeBox(56.0F, -3.0F, -4.0F, 4, 5, 6, 0.0F, -1.5F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, -1.5F, -1.75F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  511 */     this.gunModel[77].setRotationPoint(-77.0F, -8.75F, 1.0F);
/*      */     
/*  513 */     this.gunModel[78].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  514 */     this.gunModel[78].setRotationPoint(-82.0F, 8.5F, 1.0F);
/*      */     
/*  516 */     this.gunModel[79].addShapeBox(56.0F, -3.0F, -4.0F, 6, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  517 */     this.gunModel[79].setRotationPoint(-74.5F, -16.0F, 1.0F);
/*      */     
/*  519 */     this.gunModel[80].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  520 */     this.gunModel[80].setRotationPoint(-78.5F, -10.0F, 1.0F);
/*      */     
/*  522 */     this.gunModel[81].addShapeBox(56.0F, -3.0F, -4.0F, 7, 2, 6, 0.0F, 0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  523 */     this.gunModel[81].setRotationPoint(-79.5F, -11.0F, 1.0F);
/*      */     
/*  525 */     this.gunModel[82].addShapeBox(56.0F, -3.0F, -4.0F, 12, 2, 6, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  526 */     this.gunModel[82].setRotationPoint(-82.5F, -12.75F, 1.0F);
/*      */     
/*  528 */     this.gunModel[83].addShapeBox(56.0F, -3.0F, -4.0F, 10, 1, 6, 0.0F, -2.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  529 */     this.gunModel[83].setRotationPoint(-80.5F, -13.25F, 1.0F);
/*      */     
/*  531 */     this.gunModel[84].addShapeBox(56.0F, -3.0F, -4.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F);
/*  532 */     this.gunModel[84].setRotationPoint(-82.0F, -14.0F, 1.0F);
/*      */     
/*  534 */     this.gunModel[85].addShapeBox(56.0F, -3.0F, -4.0F, 6, 5, 6, 0.0F, -2.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F);
/*  535 */     this.gunModel[85].setRotationPoint(-80.5F, -17.25F, 1.0F);
/*      */     
/*  537 */     this.gunModel[86].addShapeBox(56.0F, -3.0F, -4.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  538 */     this.gunModel[86].setRotationPoint(-82.0F, -16.5F, 1.0F);
/*      */     
/*  540 */     this.gunModel[87].addShapeBox(56.0F, -3.0F, -4.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  541 */     this.gunModel[87].setRotationPoint(-62.0F, -9.0F, 2.0F);
/*      */     
/*  543 */     this.gunModel[88].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  544 */     this.gunModel[88].setRotationPoint(-62.0F, -8.0F, 2.0F);
/*      */     
/*  546 */     this.gunModel[89].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 4, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  547 */     this.gunModel[89].setRotationPoint(-61.0F, -5.0F, 2.0F);
/*      */     
/*  549 */     this.gunModel[90].addShapeBox(56.0F, -3.0F, -4.0F, 6, 3, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  550 */     this.gunModel[90].setRotationPoint(-82.0F, -20.0F, 1.0F);
/*      */     
/*  552 */     this.gunModel[91].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 6, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F);
/*  553 */     this.gunModel[91].setRotationPoint(-76.5F, -9.5F, 1.0F);
/*      */     
/*  555 */     this.gunModel[92].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 6, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  556 */     this.gunModel[92].setRotationPoint(-76.5F, -8.5F, 1.0F);
/*      */     
/*  558 */     this.gunModel[93].addShapeBox(56.0F, -3.0F, -4.0F, 8, 4, 6, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  559 */     this.gunModel[93].setRotationPoint(-81.0F, -24.5F, 1.0F);
/*      */     
/*  561 */     this.gunModel[94].addShapeBox(56.0F, -3.0F, -4.0F, 3, 4, 6, 0.0F, -2.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -2.5F, -2.25F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F);
/*  562 */     this.gunModel[94].setRotationPoint(-76.5F, -33.5F, 1.0F);
/*      */     
/*  564 */     this.gunModel[95].addShapeBox(56.0F, -3.0F, -4.0F, 64, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  565 */     this.gunModel[95].setRotationPoint(-72.0F, -30.65F, -1.5F);
/*      */     
/*  567 */     this.gunModel[96].addShapeBox(56.0F, -3.0F, -4.0F, 66, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  568 */     this.gunModel[96].setRotationPoint(-74.0F, -33.65F, -1.5F);
/*      */     
/*  570 */     this.gunModel[97].addShapeBox(56.0F, -3.0F, -4.0F, 21, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[97].setRotationPoint(-74.0F, -33.65F, 6.5F);
/*      */     
/*  573 */     this.gunModel[98].addShapeBox(56.0F, -3.0F, -4.0F, 66, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  574 */     this.gunModel[98].setRotationPoint(-74.0F, -34.65F, 1.5F);
/*      */     
/*  576 */     this.gunModel[99].addShapeBox(56.0F, -3.0F, -4.0F, 66, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  577 */     this.gunModel[99].setRotationPoint(-74.0F, -34.65F, 4.5F);
/*      */     
/*  579 */     this.gunModel[100].addShapeBox(56.0F, -3.0F, -4.0F, 2, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  580 */     this.gunModel[100].setRotationPoint(-74.0F, -30.65F, -1.5F);
/*      */     
/*  582 */     this.gunModel[101].addShapeBox(56.0F, -3.0F, -4.0F, 7, 5, 6, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  583 */     this.gunModel[101].setRotationPoint(-78.5F, -30.0F, 1.0F);
/*      */     
/*  585 */     this.gunModel[102].addShapeBox(56.0F, -3.0F, -4.0F, 59, 1, 6, 0.0F, 0.0F, -0.6F, -0.1F, 0.0F, -0.6F, -0.1F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  586 */     this.gunModel[102].setRotationPoint(-69.0F, -27.25F, -0.5F);
/*      */     
/*  588 */     this.gunModel[103].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  589 */     this.gunModel[103].setRotationPoint(-10.0F, -26.65F, -1.5F);
/*      */     
/*  591 */     this.gunModel[104].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  592 */     this.gunModel[104].setRotationPoint(-10.0F, -26.65F, 6.5F);
/*      */     
/*  594 */     this.gunModel[105].addShapeBox(56.0F, -3.0F, -4.0F, 4, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[105].setRotationPoint(-12.0F, -30.65F, 7.5F);
/*      */     
/*  597 */     this.gunModel[106].addShapeBox(56.0F, -3.0F, -4.0F, 9, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  598 */     this.gunModel[106].setRotationPoint(-72.0F, -28.65F, 5.5F);
/*      */     
/*  600 */     this.gunModel[107].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  601 */     this.gunModel[107].setRotationPoint(-10.0F, -26.65F, 1.5F);
/*      */     
/*  603 */     this.gunModel[108].addShapeBox(56.0F, -3.0F, -4.0F, 66, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  604 */     this.gunModel[108].setRotationPoint(-74.0F, -33.65F, 1.5F);
/*      */     
/*  606 */     this.gunModel[109].addShapeBox(56.0F, -3.0F, -4.0F, 5, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  607 */     this.gunModel[109].setRotationPoint(-6.0F, -30.65F, -1.5F);
/*      */     
/*  609 */     this.gunModel[110].addShapeBox(56.0F, -3.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  610 */     this.gunModel[110].setRotationPoint(-6.0F, -33.65F, -1.5F);
/*      */     
/*  612 */     this.gunModel[111].addShapeBox(56.0F, -3.0F, -4.0F, 20, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  613 */     this.gunModel[111].setRotationPoint(-6.0F, -33.65F, 6.5F);
/*      */     
/*  615 */     this.gunModel[112].addShapeBox(56.0F, -3.0F, -4.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  616 */     this.gunModel[112].setRotationPoint(-6.0F, -34.65F, 1.5F);
/*      */     
/*  618 */     this.gunModel[113].addShapeBox(56.0F, -3.0F, -4.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[113].setRotationPoint(-6.0F, -34.65F, 4.5F);
/*      */     
/*  621 */     this.gunModel[114].addShapeBox(56.0F, -3.0F, -4.0F, 28, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  622 */     this.gunModel[114].setRotationPoint(-6.0F, -33.65F, 1.5F);
/*      */     
/*  624 */     this.gunModel[115].addShapeBox(56.0F, -3.0F, -4.0F, 20, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -1.5F, 0.0F, 0.15F, -1.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  625 */     this.gunModel[115].setRotationPoint(-6.0F, -26.65F, -1.5F);
/*      */     
/*  627 */     this.gunModel[116].addShapeBox(56.0F, -3.0F, -4.0F, 20, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -1.5F, 0.0F, 0.15F, -1.5F);
/*  628 */     this.gunModel[116].setRotationPoint(-6.0F, -26.65F, 6.5F);
/*      */     
/*  630 */     this.gunModel[117].addShapeBox(56.0F, -3.0F, -4.0F, 27, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  631 */     this.gunModel[117].setRotationPoint(-5.0F, -26.65F, 1.5F);
/*      */     
/*  633 */     this.gunModel[118].addShapeBox(56.0F, -3.0F, -4.0F, 20, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  634 */     this.gunModel[118].setRotationPoint(-6.0F, -30.65F, 7.5F);
/*      */     
/*  636 */     this.gunModel[119].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  637 */     this.gunModel[119].setRotationPoint(-8.5F, -26.65F, -1.5F);
/*      */     
/*  639 */     this.gunModel[120].addShapeBox(56.0F, -3.0F, -4.0F, 3, 4, 9, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  640 */     this.gunModel[120].setRotationPoint(-8.5F, -30.65F, -1.5F);
/*      */     
/*  642 */     this.gunModel[121].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  643 */     this.gunModel[121].setRotationPoint(-8.5F, -33.65F, -1.5F);
/*      */     
/*  645 */     this.gunModel[122].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  646 */     this.gunModel[122].setRotationPoint(-8.5F, -34.65F, 1.5F);
/*      */     
/*  648 */     this.gunModel[123].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F);
/*  649 */     this.gunModel[123].setRotationPoint(-8.5F, -26.65F, 6.5F);
/*      */     
/*  651 */     this.gunModel[124].addShapeBox(56.0F, -3.0F, -4.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  652 */     this.gunModel[124].setRotationPoint(-8.5F, -30.65F, 7.5F);
/*      */     
/*  654 */     this.gunModel[125].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  655 */     this.gunModel[125].setRotationPoint(-8.5F, -33.65F, 6.5F);
/*      */     
/*  657 */     this.gunModel[126].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  658 */     this.gunModel[126].setRotationPoint(-8.5F, -34.65F, 4.5F);
/*      */     
/*  660 */     this.gunModel[127].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  661 */     this.gunModel[127].setRotationPoint(14.0F, -26.65F, -1.5F);
/*      */     
/*  663 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 4, 9, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  664 */     this.gunModel[''].setRotationPoint(14.0F, -30.65F, -1.5F);
/*      */     
/*  666 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  667 */     this.gunModel[''].setRotationPoint(14.0F, -33.65F, -1.5F);
/*      */     
/*  669 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  670 */     this.gunModel[''].setRotationPoint(14.0F, -34.65F, 1.5F);
/*      */     
/*  672 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F);
/*  673 */     this.gunModel[''].setRotationPoint(14.0F, -26.65F, 6.5F);
/*      */     
/*  675 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  676 */     this.gunModel[''].setRotationPoint(14.0F, -30.65F, 7.5F);
/*      */     
/*  678 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  679 */     this.gunModel[''].setRotationPoint(14.0F, -33.65F, 6.5F);
/*      */     
/*  681 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  682 */     this.gunModel[''].setRotationPoint(14.0F, -34.65F, 4.5F);
/*      */     
/*  684 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 18, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[''].setRotationPoint(-4.0F, -30.65F, -0.5F);
/*      */     
/*  687 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 2, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  688 */     this.gunModel[''].setRotationPoint(12.0F, -30.65F, -1.5F);
/*      */     
/*  690 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  691 */     this.gunModel[''].setRotationPoint(12.0F, -33.65F, -1.5F);
/*      */     
/*  693 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 13, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -1.25F, 0.0F, -1.25F, -1.25F, 0.0F, -1.25F, -1.25F, 0.0F, -1.25F, -1.25F);
/*  694 */     this.gunModel[''].setRotationPoint(-1.0F, -33.65F, -1.5F);
/*      */     
/*  696 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 18, 2, 7, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  697 */     this.gunModel[''].setRotationPoint(-4.0F, -32.65F, -0.5F);
/*      */     
/*  699 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 35, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F);
/*  700 */     this.gunModel[''].setRotationPoint(-47.0F, -30.65F, 7.5F);
/*      */     
/*  702 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 20, 4, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  703 */     this.gunModel[''].setRotationPoint(-74.0F, -30.65F, 7.5F);
/*      */     
/*  705 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 38, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  706 */     this.gunModel[''].setRotationPoint(-46.0F, -33.65F, 6.5F);
/*      */     
/*  708 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 1, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  709 */     this.gunModel[''].setRotationPoint(-47.0F, -32.65F, 7.5F);
/*      */     
/*  711 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[''].setRotationPoint(-53.0F, -33.65F, 6.5F);
/*      */     
/*  714 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  715 */     this.gunModel[''].setRotationPoint(-53.0F, -32.65F, 6.5F);
/*      */     
/*  717 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  718 */     this.gunModel[''].setRotationPoint(17.0F, -30.65F, -1.5F);
/*      */     
/*  720 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  721 */     this.gunModel[''].setRotationPoint(17.0F, -33.65F, -1.5F);
/*      */     
/*  723 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  724 */     this.gunModel[''].setRotationPoint(17.0F, -33.65F, 6.5F);
/*      */     
/*  726 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  727 */     this.gunModel[''].setRotationPoint(17.0F, -34.65F, 1.5F);
/*      */     
/*  729 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[''].setRotationPoint(17.0F, -34.65F, 4.5F);
/*      */     
/*  732 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -3.0F, 0.0F, 0.15F, -3.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  733 */     this.gunModel[''].setRotationPoint(17.0F, -26.65F, -1.5F);
/*      */     
/*  735 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -3.0F, 0.0F, 0.15F, -3.0F);
/*  736 */     this.gunModel[''].setRotationPoint(17.0F, -26.65F, 6.5F);
/*      */     
/*  738 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  739 */     this.gunModel[''].setRotationPoint(17.0F, -30.65F, 7.5F);
/*      */     
/*  741 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  742 */     this.gunModel[''].setRotationPoint(17.0F, -23.5F, 1.5F);
/*      */     
/*  744 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  745 */     this.gunModel[''].setRotationPoint(17.0F, -23.5F, 4.5F);
/*      */     
/*  747 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[''].setRotationPoint(22.0F, -33.65F, 1.5F);
/*      */     
/*  750 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  751 */     this.gunModel[''].setRotationPoint(22.0F, -26.65F, 1.5F);
/*      */     
/*  753 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  754 */     this.gunModel[''].setRotationPoint(22.0F, -30.65F, -1.5F);
/*      */     
/*  756 */     this.gunModel[''].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  757 */     this.gunModel[''].setRotationPoint(22.0F, -33.65F, -1.5F);
/*      */     
/*  759 */     this.gunModel[' '].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[' '].setRotationPoint(22.0F, -33.65F, 6.5F);
/*      */     
/*  762 */     this.gunModel['¡'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  763 */     this.gunModel['¡'].setRotationPoint(22.0F, -34.65F, 1.5F);
/*      */     
/*  765 */     this.gunModel['¢'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  766 */     this.gunModel['¢'].setRotationPoint(22.0F, -34.65F, 4.5F);
/*      */     
/*  768 */     this.gunModel['£'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -3.0F, 0.0F, -0.85F, -3.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  769 */     this.gunModel['£'].setRotationPoint(22.0F, -26.65F, -1.5F);
/*      */     
/*  771 */     this.gunModel['¤'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, -3.0F, 0.0F, 0.15F, -3.0F);
/*  772 */     this.gunModel['¤'].setRotationPoint(22.0F, -26.65F, 6.5F);
/*      */     
/*  774 */     this.gunModel['¥'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  775 */     this.gunModel['¥'].setRotationPoint(22.0F, -30.65F, 7.5F);
/*      */     
/*  777 */     this.gunModel['¦'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  778 */     this.gunModel['¦'].setRotationPoint(22.0F, -23.5F, 1.5F);
/*      */     
/*  780 */     this.gunModel['§'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  781 */     this.gunModel['§'].setRotationPoint(22.0F, -23.5F, 4.5F);
/*      */     
/*  783 */     this.gunModel['¨'].addShapeBox(56.0F, -3.0F, -4.0F, 33, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  784 */     this.gunModel['¨'].setRotationPoint(25.0F, -32.0F, 0.5F);
/*      */     
/*  786 */     this.gunModel['©'].addShapeBox(56.0F, -3.0F, -4.0F, 33, 1, 5, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, -1.5F, 0.0F, -0.75F, 1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.75F, 1.5F, -1.0F);
/*  787 */     this.gunModel['©'].setRotationPoint(25.0F, -25.9F, 1.5F);
/*      */     
/*  789 */     this.gunModel['ª'].addShapeBox(56.0F, -3.0F, -4.0F, 31, 1, 3, 0.0F, 0.0F, -1.0F, 0.75F, 0.0F, -0.9F, 0.75F, 0.0F, -0.9F, -0.25F, 0.0F, -1.0F, 0.75F, 0.0F, 1.5F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.5F, 0.75F);
/*  790 */     this.gunModel['ª'].setRotationPoint(27.0F, -26.9F, 2.5F);
/*      */     
/*  792 */     this.gunModel['«'].addShapeBox(56.0F, -3.0F, -4.0F, 10, 7, 7, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/*  793 */     this.gunModel['«'].setRotationPoint(58.0F, -32.0F, 0.5F);
/*      */     
/*  795 */     this.gunModel['¬'].addShapeBox(56.0F, -3.0F, -4.0F, 14, 7, 7, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/*  796 */     this.gunModel['¬'].setRotationPoint(67.0F, -32.0F, 0.5F);
/*      */     
/*  798 */     this.gunModel['­'].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 6, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/*  799 */     this.gunModel['­'].setRotationPoint(65.0F, -27.0F, 1.0F);
/*      */     
/*  801 */     this.gunModel['®'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 4, 6, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  802 */     this.gunModel['®'].setRotationPoint(63.0F, -27.0F, 1.0F);
/*      */     
/*  804 */     this.gunModel['¯'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 5, 6, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  805 */     this.gunModel['¯'].setRotationPoint(62.0F, -27.0F, 1.0F);
/*      */     
/*  807 */     this.gunModel['°'].addShapeBox(56.0F, -3.0F, -4.0F, 4, 5, 6, 0.0F, 2.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 2.0F, -1.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F);
/*  808 */     this.gunModel['°'].setRotationPoint(58.0F, -27.0F, 1.0F);
/*      */     
/*  810 */     this.gunModel['±'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 6, 7, 0.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F);
/*  811 */     this.gunModel['±'].setRotationPoint(72.0F, -36.0F, 0.5F);
/*      */     
/*  813 */     this.gunModel['²'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 4, 7, 0.0F, 0.0F, -2.5F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -2.5F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F);
/*  814 */     this.gunModel['²'].setRotationPoint(70.0F, -34.0F, 0.5F);
/*      */     
/*  816 */     this.gunModel['³'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 4, 7, 0.0F, 0.0F, -2.5F, -1.25F, 0.0F, -2.5F, -1.25F, 0.0F, -2.5F, -1.25F, 0.0F, -2.5F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F);
/*  817 */     this.gunModel['³'].setRotationPoint(64.0F, -34.0F, 0.5F);
/*      */     
/*  819 */     this.gunModel['´'].addShapeBox(56.0F, -3.0F, -4.0F, 8, 7, 7, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  820 */     this.gunModel['´'].setRotationPoint(79.0F, -32.0F, 0.5F);
/*      */     
/*  822 */     this.gunModel['µ'].addShapeBox(56.0F, -3.0F, -4.0F, 5, 4, 6, 0.0F, -1.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -1.5F, -2.25F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F);
/*  823 */     this.gunModel['µ'].setRotationPoint(-75.5F, -33.5F, 1.0F);
/*      */     
/*  825 */     this.gunModel['¶'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  826 */     this.gunModel['¶'].setRotationPoint(72.0F, -36.0F, 6.25F);
/*      */     
/*  828 */     this.gunModel['·'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  829 */     this.gunModel['·'].setRotationPoint(72.0F, -38.0F, 6.25F);
/*      */     
/*  831 */     this.gunModel['¸'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  832 */     this.gunModel['¸'].setRotationPoint(72.0F, -40.0F, 6.25F);
/*      */     
/*  834 */     this.gunModel['¹'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  835 */     this.gunModel['¹'].setRotationPoint(72.0F, -38.0F, 0.75F);
/*      */     
/*  837 */     this.gunModel['º'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  838 */     this.gunModel['º'].setRotationPoint(72.0F, -40.0F, 2.0F);
/*      */     
/*  840 */     this.gunModel['»'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 2, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  841 */     this.gunModel['»'].setRotationPoint(72.0F, -41.0F, 4.25F);
/*      */     
/*  843 */     this.gunModel['¼'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  844 */     this.gunModel['¼'].setRotationPoint(72.0F, -41.0F, 1.75F);
/*      */     
/*  846 */     this.gunModel['½'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel['½'].setRotationPoint(72.0F, -36.0F, 5.25F);
/*      */     
/*  849 */     this.gunModel['¾'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  850 */     this.gunModel['¾'].setRotationPoint(72.0F, -39.0F, 5.25F);
/*      */     
/*  852 */     this.gunModel['¿'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  853 */     this.gunModel['¿'].setRotationPoint(72.0F, -39.0F, 1.75F);
/*      */     
/*  855 */     this.gunModel['À'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  856 */     this.gunModel['À'].setRotationPoint(72.0F, -36.0F, 1.75F);
/*      */     
/*  858 */     this.gunModel['Á'].addShapeBox(56.0F, -3.0F, -4.0F, 6, 2, 1, 0.0F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
/*  859 */     this.gunModel['Á'].setRotationPoint(72.0F, -37.0F, 3.5F);
/*      */     
/*  861 */     this.gunModel['Â'].addShapeBox(56.0F, -3.0F, -4.0F, 8, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  862 */     this.gunModel['Â'].setRotationPoint(-37.0F, -34.75F, 1.5F);
/*      */     
/*  864 */     this.gunModel['Ã'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/*  865 */     this.gunModel['Ã'].setRotationPoint(-31.0F, -36.25F, 1.5F);
/*      */     
/*  867 */     this.gunModel['Ä'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  868 */     this.gunModel['Ä'].setRotationPoint(-31.0F, -36.75F, 1.5F);
/*      */     
/*  870 */     this.gunModel['Å'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  871 */     this.gunModel['Å'].setRotationPoint(-31.0F, -36.75F, 5.0F);
/*      */     
/*  873 */     this.gunModel['Æ'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  874 */     this.gunModel['Æ'].setRotationPoint(-33.0F, -36.25F, 2.0F);
/*      */     
/*  876 */     this.gunModel['Ç'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  877 */     this.gunModel['Ç'].setRotationPoint(-33.0F, -36.25F, 5.0F);
/*      */     
/*  879 */     this.gunModel['È'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  880 */     this.gunModel['È'].setRotationPoint(-32.0F, -36.25F, 3.0F);
/*      */     
/*  882 */     this.gunModel['É'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  883 */     this.gunModel['É'].setRotationPoint(-31.0F, -36.75F, 3.5F);
/*      */     
/*  885 */     this.gunModel['Ê'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel['Ê'].setRotationPoint(-74.0F, -26.65F, -1.5F);
/*      */     
/*  888 */     this.gunModel['Ë'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  889 */     this.gunModel['Ë'].setRotationPoint(-74.0F, -26.65F, 6.5F);
/*      */     
/*  891 */     this.gunModel['Ì'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  892 */     this.gunModel['Ì'].setRotationPoint(-74.0F, -28.65F, 6.5F);
/*      */     
/*  894 */     this.gunModel['Í'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 3, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/*  895 */     this.gunModel['Í'].setRotationPoint(-71.0F, -26.65F, -1.5F);
/*      */     
/*  897 */     this.gunModel['Î'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 4, 9, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  898 */     this.gunModel['Î'].setRotationPoint(-71.0F, -30.65F, -1.5F);
/*      */     
/*  900 */     this.gunModel['Ï'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 3, 3, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  901 */     this.gunModel['Ï'].setRotationPoint(-71.0F, -33.65F, -1.5F);
/*      */     
/*  903 */     this.gunModel['Ð'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 2, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  904 */     this.gunModel['Ð'].setRotationPoint(-71.0F, -34.65F, 1.5F);
/*      */     
/*  906 */     this.gunModel['Ñ'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F);
/*  907 */     this.gunModel['Ñ'].setRotationPoint(-71.0F, -26.65F, 6.5F);
/*      */     
/*  909 */     this.gunModel['Ò'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  910 */     this.gunModel['Ò'].setRotationPoint(-71.0F, -30.65F, 7.5F);
/*      */     
/*  912 */     this.gunModel['Ó'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  913 */     this.gunModel['Ó'].setRotationPoint(-71.0F, -33.65F, 6.5F);
/*      */     
/*  915 */     this.gunModel['Ô'].addShapeBox(56.0F, -3.0F, -4.0F, 7, 1, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  916 */     this.gunModel['Ô'].setRotationPoint(-71.0F, -34.65F, 4.5F);
/*      */     
/*  918 */     this.gunModel['Õ'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.75F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F);
/*  919 */     this.gunModel['Õ'].setRotationPoint(-79.5F, -15.25F, -0.75F);
/*      */     
/*  921 */     this.gunModel['Ö'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.75F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F);
/*  922 */     this.gunModel['Ö'].setRotationPoint(-79.5F, -17.25F, -0.75F);
/*      */     
/*  924 */     this.gunModel['×'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.75F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F);
/*  925 */     this.gunModel['×'].setRotationPoint(-79.5F, -13.75F, -0.75F);
/*      */     
/*  927 */     this.gunModel['Ø'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, -1.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 1.0F);
/*  928 */     this.gunModel['Ø'].setRotationPoint(-81.5F, -17.25F, -0.75F);
/*      */     
/*  930 */     this.gunModel['Ù'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 1.0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 1.0F);
/*  931 */     this.gunModel['Ù'].setRotationPoint(-81.5F, -15.25F, -0.75F);
/*      */     
/*  933 */     this.gunModel['Ú'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 1.0F, -1.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F);
/*  934 */     this.gunModel['Ú'].setRotationPoint(-81.5F, -13.75F, -0.75F);
/*      */     
/*  936 */     this.gunModel['Û'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, -1.25F, 0.25F, -0.5F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  937 */     this.gunModel['Û'].setRotationPoint(-78.0F, -13.75F, -0.75F);
/*      */     
/*  939 */     this.gunModel['Ü'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.25F, 0.25F, -0.5F, -1.25F, 0.25F, -0.5F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  940 */     this.gunModel['Ü'].setRotationPoint(-78.0F, -17.25F, -0.75F);
/*      */     
/*  942 */     this.gunModel['Ý'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 9, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  943 */     this.gunModel['Ý'].setRotationPoint(-78.0F, -15.25F, -0.75F);
/*      */     
/*  945 */     this.gunModel['Þ'].addShapeBox(56.0F, -3.0F, -4.0F, 44, 1, 2, 0.0F, 0.25F, -2.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.5F, 0.25F, -2.25F, 0.5F, 0.25F, 3.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 3.25F, 0.5F);
/*  946 */     this.gunModel['Þ'].setRotationPoint(-126.0F, -15.25F, -1.75F);
/*      */     
/*  948 */     this.gunModel['ß'].addShapeBox(56.0F, -3.0F, -4.0F, 44, 1, 2, 0.0F, 0.25F, -2.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.5F, 0.25F, -2.25F, 0.5F, 0.25F, 3.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 3.25F, 0.5F);
/*  949 */     this.gunModel['ß'].setRotationPoint(-126.0F, -15.25F, 6.75F);
/*      */     
/*  951 */     this.gunModel['à'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  952 */     this.gunModel['à'].setRotationPoint(-128.5F, -12.75F, -1.25F);
/*      */     
/*  954 */     this.gunModel['á'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  955 */     this.gunModel['á'].setRotationPoint(-128.5F, -21.75F, -1.25F);
/*      */     
/*  957 */     this.gunModel['â'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  958 */     this.gunModel['â'].setRotationPoint(-128.5F, -15.75F, -1.25F);
/*      */     
/*  960 */     this.gunModel['ã'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  961 */     this.gunModel['ã'].setRotationPoint(-128.5F, -12.75F, 7.25F);
/*      */     
/*  963 */     this.gunModel['ä'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  964 */     this.gunModel['ä'].setRotationPoint(-128.5F, -21.75F, 7.25F);
/*      */     
/*  966 */     this.gunModel['å'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  967 */     this.gunModel['å'].setRotationPoint(-128.5F, -15.75F, 7.25F);
/*      */     
/*  969 */     this.gunModel['æ'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, 0.25F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  970 */     this.gunModel['æ'].setRotationPoint(-128.5F, -24.75F, -1.25F);
/*      */     
/*  972 */     this.gunModel['ç'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  973 */     this.gunModel['ç'].setRotationPoint(-128.5F, -24.75F, 7.25F);
/*      */     
/*  975 */     this.gunModel['è'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  976 */     this.gunModel['è'].setRotationPoint(-128.5F, -10.75F, -1.25F);
/*      */     
/*  978 */     this.gunModel['é'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  979 */     this.gunModel['é'].setRotationPoint(-128.5F, -8.25F, -1.25F);
/*      */     
/*  981 */     this.gunModel['ê'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  982 */     this.gunModel['ê'].setRotationPoint(-128.5F, -2.25F, -1.25F);
/*      */     
/*  984 */     this.gunModel['ë'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  985 */     this.gunModel['ë'].setRotationPoint(-128.5F, -10.75F, 7.25F);
/*      */     
/*  987 */     this.gunModel['ì'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  988 */     this.gunModel['ì'].setRotationPoint(-128.5F, -8.25F, 7.25F);
/*      */     
/*  990 */     this.gunModel['í'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F);
/*  991 */     this.gunModel['í'].setRotationPoint(-128.5F, -2.25F, 7.25F);
/*      */     
/*  993 */     this.gunModel['î'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  994 */     this.gunModel['î'].setRotationPoint(-130.0F, -2.25F, -1.25F);
/*      */     
/*  996 */     this.gunModel['ï'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/*  997 */     this.gunModel['ï'].setRotationPoint(-131.0F, -8.25F, -1.25F);
/*      */     
/*  999 */     this.gunModel['ð'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1000 */     this.gunModel['ð'].setRotationPoint(-131.0F, -10.75F, -1.25F);
/*      */     
/* 1002 */     this.gunModel['ñ'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1003 */     this.gunModel['ñ'].setRotationPoint(-131.0F, -12.75F, -1.25F);
/*      */     
/* 1005 */     this.gunModel['ò'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1006 */     this.gunModel['ò'].setRotationPoint(-131.0F, -15.75F, -1.25F);
/*      */     
/* 1008 */     this.gunModel['ó'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1009 */     this.gunModel['ó'].setRotationPoint(-131.0F, -21.75F, -1.25F);
/*      */     
/* 1011 */     this.gunModel['ô'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, -0.5F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1012 */     this.gunModel['ô'].setRotationPoint(-130.0F, -24.75F, -1.25F);
/*      */     
/* 1014 */     this.gunModel['õ'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1015 */     this.gunModel['õ'].setRotationPoint(-131.0F, -21.75F, 7.25F);
/*      */     
/* 1017 */     this.gunModel['ö'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1018 */     this.gunModel['ö'].setRotationPoint(-131.0F, -15.75F, 7.25F);
/*      */     
/* 1020 */     this.gunModel['÷'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1021 */     this.gunModel['÷'].setRotationPoint(-130.0F, -24.75F, 7.25F);
/*      */     
/* 1023 */     this.gunModel['ø'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1024 */     this.gunModel['ø'].setRotationPoint(-131.0F, -12.75F, 7.25F);
/*      */     
/* 1026 */     this.gunModel['ù'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1027 */     this.gunModel['ù'].setRotationPoint(-131.0F, -10.75F, 7.25F);
/*      */     
/* 1029 */     this.gunModel['ú'].addShapeBox(56.0F, -3.0F, -4.0F, 2, 6, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1030 */     this.gunModel['ú'].setRotationPoint(-131.0F, -8.25F, 7.25F);
/*      */     
/* 1032 */     this.gunModel['û'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 3, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F);
/* 1033 */     this.gunModel['û'].setRotationPoint(-130.0F, -2.25F, 7.25F);
/*      */     
/* 1035 */     this.gunModel['ü'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1036 */     this.gunModel['ü'].setRotationPoint(-129.5F, -25.0F, 0.25F);
/*      */     
/* 1038 */     this.gunModel['ý'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['ý'].setRotationPoint(-129.5F, 0.0F, 0.25F);
/*      */     
/* 1041 */     this.gunModel['þ'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['þ'].setRotationPoint(-129.5F, -26.0F, -0.25F);
/*      */     
/* 1044 */     this.gunModel['ÿ'].addShapeBox(56.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F, 0.5F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F);
/* 1045 */     this.gunModel['ÿ'].setRotationPoint(-129.5F, 1.0F, -0.25F);
/*      */     
/*      */ 
/* 1048 */     this.ammoModel = new ModelRendererTurbo[1];
/* 1049 */     this.ammoModel[0] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*      */     
/* 1051 */     this.ammoModel[0].addShapeBox(56.0F, -3.0F, -4.0F, 11, 53, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1052 */     this.ammoModel[0].setRotationPoint(0.0F, -17.5F, 0.5F);
/*      */     
/*      */ 
/* 1055 */     this.slideModel = new ModelRendererTurbo[2];
/* 1056 */     this.slideModel[0] = new ModelRendererTurbo(this, 481, 121, this.textureX, this.textureY);
/* 1057 */     this.slideModel[1] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*      */     
/* 1059 */     this.slideModel[0].addShapeBox(56.0F, -3.0F, -4.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1060 */     this.slideModel[0].setRotationPoint(-14.0F, -28.65F, 5.5F);
/*      */     
/* 1062 */     this.slideModel[1].addShapeBox(56.0F, -3.0F, -4.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1063 */     this.slideModel[1].setRotationPoint(-14.5F, -29.15F, 11.0F);
/*      */     
/*      */ 
/*      */ 
/* 1067 */     translateAll(0.0F, -17.0F, 0.0F);
/* 1068 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.07F, 0.0F);
/*      */     
/* 1070 */     this.gunSlideDistance = 1.5F;
/* 1071 */     this.animationType = EnumAnimationType.CUSTOM;this.tiltGun = 7.0F;
/* 1072 */     this.rotateGunVertical = 3.0F;
/* 1073 */     this.translateGun = new Vector3f(0.15F, 0.05F, 0.0F);
/*      */     
/* 1075 */     this.rotateClipVertical = 5.0F;
/* 1076 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/*      */     
/*      */ 
/* 1079 */     flipAll();
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmp40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */