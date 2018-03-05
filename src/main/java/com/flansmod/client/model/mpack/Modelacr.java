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
/*      */ public class Modelacr
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelacr()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ž'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo['Ù'];
/*   23 */     this.ammoModel = new ModelRendererTurbo[49];
/*   24 */     this.slideModel = new ModelRendererTurbo[2];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initdefaultScopeModel_1();
/*   28 */     initammoModel_1();
/*   29 */     initslideModel_1();
/*      */     
/*      */ 
/*   32 */     this.scopeAttachPoint = new Vector3f(0.625F, 2.8125F, 0.003125F);
/*      */     
/*   34 */     this.gripAttachPoint = new Vector3f(5.3125F, 1.625F, 0.0F);
/*      */     
/*   36 */     translateAll(0.0F, -6.5F, -0.05F);
/*   37 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.06F, 0.0F);
/*      */     
/*   39 */     this.gunSlideDistance = 1.5F;
/*   40 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*   42 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   47 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[1] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[2] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[3] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[4] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*   52 */     this.gunModel[5] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   53 */     this.gunModel[6] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*   54 */     this.gunModel[7] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[8] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*   56 */     this.gunModel[9] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/*   57 */     this.gunModel[10] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*   58 */     this.gunModel[11] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*   59 */     this.gunModel[12] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   60 */     this.gunModel[13] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[14] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[15] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[16] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*   64 */     this.gunModel[17] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*   65 */     this.gunModel[18] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*   66 */     this.gunModel[19] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*   67 */     this.gunModel[20] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*   68 */     this.gunModel[21] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*   69 */     this.gunModel[22] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*   70 */     this.gunModel[23] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*   71 */     this.gunModel[24] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*   72 */     this.gunModel[25] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[26] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[27] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[28] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[29] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[30] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   78 */     this.gunModel[31] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/*   79 */     this.gunModel[32] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*   80 */     this.gunModel[33] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/*   81 */     this.gunModel[34] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*   82 */     this.gunModel[35] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*   83 */     this.gunModel[36] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*   84 */     this.gunModel[37] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/*   85 */     this.gunModel[38] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*   86 */     this.gunModel[39] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[40] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[41] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*   89 */     this.gunModel[42] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*   90 */     this.gunModel[43] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   91 */     this.gunModel[44] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*   92 */     this.gunModel[45] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*   93 */     this.gunModel[46] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*   94 */     this.gunModel[47] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*   95 */     this.gunModel[48] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*   96 */     this.gunModel[49] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*   97 */     this.gunModel[50] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/*   98 */     this.gunModel[51] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[52] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  100 */     this.gunModel[53] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*  101 */     this.gunModel[54] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  102 */     this.gunModel[55] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/*  103 */     this.gunModel[56] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*  104 */     this.gunModel[57] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/*  105 */     this.gunModel[58] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/*  106 */     this.gunModel[59] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*  107 */     this.gunModel[60] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  108 */     this.gunModel[61] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  109 */     this.gunModel[62] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  110 */     this.gunModel[63] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  111 */     this.gunModel[64] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  112 */     this.gunModel[65] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/*  113 */     this.gunModel[66] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/*  114 */     this.gunModel[67] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*  115 */     this.gunModel[68] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*  116 */     this.gunModel[69] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  117 */     this.gunModel[70] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  118 */     this.gunModel[71] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  119 */     this.gunModel[72] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  120 */     this.gunModel[73] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  121 */     this.gunModel[74] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  122 */     this.gunModel[75] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/*  123 */     this.gunModel[76] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/*  124 */     this.gunModel[77] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  125 */     this.gunModel[78] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  126 */     this.gunModel[79] = new ModelRendererTurbo(this, 441, 73, this.textureX, this.textureY);
/*  127 */     this.gunModel[80] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  128 */     this.gunModel[81] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*  129 */     this.gunModel[82] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*  130 */     this.gunModel[83] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/*  131 */     this.gunModel[84] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  132 */     this.gunModel[85] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  133 */     this.gunModel[86] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*  134 */     this.gunModel[87] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*  135 */     this.gunModel[88] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  136 */     this.gunModel[89] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*  137 */     this.gunModel[90] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*  138 */     this.gunModel[91] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/*  139 */     this.gunModel[92] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/*  140 */     this.gunModel[93] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/*  141 */     this.gunModel[94] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/*  142 */     this.gunModel[95] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/*  143 */     this.gunModel[96] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  144 */     this.gunModel[97] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/*  145 */     this.gunModel[98] = new ModelRendererTurbo(this, 17, 81, this.textureX, this.textureY);
/*  146 */     this.gunModel[99] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  147 */     this.gunModel[100] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  148 */     this.gunModel[101] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  149 */     this.gunModel[102] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  150 */     this.gunModel[103] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  151 */     this.gunModel[104] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/*  152 */     this.gunModel[105] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/*  153 */     this.gunModel[106] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/*  154 */     this.gunModel[107] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  155 */     this.gunModel[108] = new ModelRendererTurbo(this, 409, 97, this.textureX, this.textureY);
/*  156 */     this.gunModel[109] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/*  157 */     this.gunModel[110] = new ModelRendererTurbo(this, 145, 97, this.textureX, this.textureY);
/*  158 */     this.gunModel[111] = new ModelRendererTurbo(this, 41, 97, this.textureX, this.textureY);
/*  159 */     this.gunModel[112] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  160 */     this.gunModel[113] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  161 */     this.gunModel[114] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*  162 */     this.gunModel[115] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  163 */     this.gunModel[116] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  164 */     this.gunModel[117] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/*  165 */     this.gunModel[118] = new ModelRendererTurbo(this, 329, 97, this.textureX, this.textureY);
/*  166 */     this.gunModel[119] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  167 */     this.gunModel[120] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/*  168 */     this.gunModel[121] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/*  169 */     this.gunModel[122] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  170 */     this.gunModel[123] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  171 */     this.gunModel[124] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  172 */     this.gunModel[125] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  173 */     this.gunModel[126] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  174 */     this.gunModel[127] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 113, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 121, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*  207 */     this.gunModel[' '] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*  208 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/*  209 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  210 */     this.gunModel['£'] = new ModelRendererTurbo(this, 121, 129, this.textureX, this.textureY);
/*  211 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 249, 129, this.textureX, this.textureY);
/*  212 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 377, 129, this.textureX, this.textureY);
/*  213 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  214 */     this.gunModel['§'] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/*  215 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/*  216 */     this.gunModel['©'] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/*  217 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/*  218 */     this.gunModel['«'] = new ModelRendererTurbo(this, 129, 137, this.textureX, this.textureY);
/*  219 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  220 */     this.gunModel['­'] = new ModelRendererTurbo(this, 385, 137, this.textureX, this.textureY);
/*  221 */     this.gunModel['®'] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  222 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  223 */     this.gunModel['°'] = new ModelRendererTurbo(this, 33, 145, this.textureX, this.textureY);
/*  224 */     this.gunModel['±'] = new ModelRendererTurbo(this, 97, 145, this.textureX, this.textureY);
/*  225 */     this.gunModel['²'] = new ModelRendererTurbo(this, 217, 145, this.textureX, this.textureY);
/*  226 */     this.gunModel['³'] = new ModelRendererTurbo(this, 345, 145, this.textureX, this.textureY);
/*  227 */     this.gunModel['´'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  228 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 129, 153, this.textureX, this.textureY);
/*  229 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/*  230 */     this.gunModel['·'] = new ModelRendererTurbo(this, 257, 153, this.textureX, this.textureY);
/*  231 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 385, 153, this.textureX, this.textureY);
/*  232 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  233 */     this.gunModel['º'] = new ModelRendererTurbo(this, 121, 161, this.textureX, this.textureY);
/*  234 */     this.gunModel['»'] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/*  235 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  236 */     this.gunModel['½'] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  237 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/*  238 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  239 */     this.gunModel['À'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  240 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  241 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 17, 65, this.textureX, this.textureY);
/*  244 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/*  245 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/*  247 */     this.gunModel['È'] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  248 */     this.gunModel['É'] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 249, 161, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 377, 161, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 257, 169, this.textureX, this.textureY);
/*  252 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 385, 169, this.textureX, this.textureY);
/*  253 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/*  260 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  262 */     this.gunModel['×'] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 65, 169, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 105, 169, this.textureX, this.textureY);
/*  266 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 121, 177, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 145, 177, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 161, 177, this.textureX, this.textureY);
/*  269 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 297, 177, this.textureX, this.textureY);
/*  270 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 361, 177, this.textureX, this.textureY);
/*  271 */     this.gunModel['à'] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/*  272 */     this.gunModel['á'] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/*  273 */     this.gunModel['â'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  274 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 161, 185, this.textureX, this.textureY);
/*  275 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/*  276 */     this.gunModel['å'] = new ModelRendererTurbo(this, 497, 97, this.textureX, this.textureY);
/*  277 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 393, 177, this.textureX, this.textureY);
/*  278 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  279 */     this.gunModel['è'] = new ModelRendererTurbo(this, 393, 185, this.textureX, this.textureY);
/*  280 */     this.gunModel['é'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  281 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/*  282 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/*  283 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/*  284 */     this.gunModel['í'] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/*  285 */     this.gunModel['î'] = new ModelRendererTurbo(this, 441, 73, this.textureX, this.textureY);
/*  286 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  287 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 417, 185, this.textureX, this.textureY);
/*  288 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/*  289 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 17, 105, this.textureX, this.textureY);
/*  290 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 449, 185, this.textureX, this.textureY);
/*  291 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  292 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/*  293 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 465, 185, this.textureX, this.textureY);
/*  294 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 489, 185, this.textureX, this.textureY);
/*  295 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 129, 193, this.textureX, this.textureY);
/*  296 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  297 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  298 */     this.gunModel['û'] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/*  299 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/*  300 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 465, 193, this.textureX, this.textureY);
/*  301 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 185, 201, this.textureX, this.textureY);
/*  302 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  303 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 33, 225, this.textureX, this.textureY);
/*  304 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 481, 217, this.textureX, this.textureY);
/*  305 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 81, 225, this.textureX, this.textureY);
/*  306 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 345, 225, this.textureX, this.textureY);
/*  307 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 369, 225, this.textureX, this.textureY);
/*  308 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 393, 225, this.textureX, this.textureY);
/*  309 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 481, 225, this.textureX, this.textureY);
/*  310 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 169, 225, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/*  312 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 209, 201, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 361, 209, this.textureX, this.textureY);
/*  314 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/*  315 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 369, 209, this.textureX, this.textureY);
/*  316 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 185, 233, this.textureX, this.textureY);
/*  318 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 241, 233, this.textureX, this.textureY);
/*  319 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 145, 233, this.textureX, this.textureY);
/*  320 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 289, 233, this.textureX, this.textureY);
/*  321 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 337, 233, this.textureX, this.textureY);
/*  322 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  323 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 377, 233, this.textureX, this.textureY);
/*  324 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 409, 233, this.textureX, this.textureY);
/*  326 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 441, 233, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 481, 233, this.textureX, this.textureY);
/*  328 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 33, 241, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 65, 241, this.textureX, this.textureY);
/*  330 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  332 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 161, 177, this.textureX, this.textureY);
/*  334 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 361, 177, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 449, 185, this.textureX, this.textureY);
/*  336 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 97, 241, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 321, 233, this.textureX, this.textureY);
/*  338 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 121, 249, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 169, 249, this.textureX, this.textureY);
/*  340 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 361, 233, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 465, 233, this.textureX, this.textureY);
/*  342 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 121, 241, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 241, 217, this.textureX, this.textureY);
/*  344 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 201, 249, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 417, 209, this.textureX, this.textureY);
/*  346 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 401, 233, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 409, 225, this.textureX, this.textureY);
/*  348 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 433, 233, this.textureX, this.textureY);
/*  349 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 57, 241, this.textureX, this.textureY);
/*  350 */     this.gunModel['į'] = new ModelRendererTurbo(this, 225, 249, this.textureX, this.textureY);
/*  351 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 249, 249, this.textureX, this.textureY);
/*  352 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 273, 249, this.textureX, this.textureY);
/*  353 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 321, 249, this.textureX, this.textureY);
/*  354 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 353, 249, this.textureX, this.textureY);
/*  355 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 465, 241, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 385, 249, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 417, 249, this.textureX, this.textureY);
/*  358 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 401, 249, this.textureX, this.textureY);
/*  359 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  360 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 89, 257, this.textureX, this.textureY);
/*  361 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 433, 249, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 289, 257, this.textureX, this.textureY);
/*  363 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 129, 265, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 161, 265, this.textureX, this.textureY);
/*  365 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 201, 265, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 505, 217, this.textureX, this.textureY);
/*  367 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 505, 225, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  369 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 241, 233, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 321, 233, this.textureX, this.textureY);
/*  371 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 337, 233, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 97, 97, this.textureX, this.textureY);
/*  373 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*  375 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  376 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/*  377 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 25, 145, this.textureX, this.textureY);
/*  378 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 441, 185, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 481, 185, this.textureX, this.textureY);
/*  380 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 505, 185, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 121, 193, this.textureX, this.textureY);
/*  382 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 233, 273, this.textureX, this.textureY);
/*  384 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 305, 273, this.textureX, this.textureY);
/*  385 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 233, 257, this.textureX, this.textureY);
/*  386 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 409, 265, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 481, 257, this.textureX, this.textureY);
/*  388 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 425, 265, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 89, 273, this.textureX, this.textureY);
/*  390 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 369, 273, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 449, 273, this.textureX, this.textureY);
/*  392 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 113, 281, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 73, 273, this.textureX, this.textureY);
/*  394 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 153, 281, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 185, 281, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 449, 257, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 217, 281, this.textureX, this.textureY);
/*  398 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 393, 281, this.textureX, this.textureY);
/*  399 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 1, 289, this.textureX, this.textureY);
/*  400 */     this.gunModel['š'] = new ModelRendererTurbo(this, 41, 289, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 113, 265, this.textureX, this.textureY);
/*  402 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 73, 289, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 249, 289, this.textureX, this.textureY);
/*  404 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 281, 289, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 313, 289, this.textureX, this.textureY);
/*  406 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 345, 289, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 409, 289, this.textureX, this.textureY);
/*  408 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 449, 289, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 377, 289, this.textureX, this.textureY);
/*  410 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 25, 297, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 89, 297, this.textureX, this.textureY);
/*  412 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 121, 297, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 233, 297, this.textureX, this.textureY);
/*  414 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 473, 297, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 265, 297, this.textureX, this.textureY);
/*  416 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 297, 297, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 329, 297, this.textureX, this.textureY);
/*  418 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  420 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  422 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  424 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  425 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  427 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*      */     
/*  429 */     this.gunModel[0].addBox(46.0F, -18.0F, -4.0F, 35, 4, 10, 0.0F);
/*  430 */     this.gunModel[0].setRotationPoint(-38.0F, -8.5F, -1.0F);
/*      */     
/*  432 */     this.gunModel[1].addShapeBox(46.0F, -18.0F, -4.0F, 15, 6, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F);
/*  433 */     this.gunModel[1].setRotationPoint(-53.0F, -10.5F, -1.0F);
/*      */     
/*  435 */     this.gunModel[2].addShapeBox(46.0F, -18.0F, -4.0F, 56, 3, 11, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F);
/*  436 */     this.gunModel[2].setRotationPoint(-60.0F, -18.5F, -1.5F);
/*      */     
/*  438 */     this.gunModel[3].addShapeBox(46.0F, -18.0F, -4.0F, 92, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/*  439 */     this.gunModel[3].setRotationPoint(-60.0F, -20.0F, 0.75F);
/*      */     
/*  441 */     this.gunModel[4].addShapeBox(46.0F, -18.0F, -4.0F, 116, 1, 9, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  442 */     this.gunModel[4].setRotationPoint(-60.0F, -20.75F, -0.75F);
/*      */     
/*  444 */     this.gunModel[5].addShapeBox(46.0F, -18.0F, -4.0F, 32, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  445 */     this.gunModel[5].setRotationPoint(-60.0F, -11.0F, -1.0F);
/*      */     
/*  447 */     this.gunModel[6].addShapeBox(46.0F, -18.0F, 1.0F, 32, 5, 11, 0.0F, 0.0F, -1.25F, 0.5F, -0.5F, -1.25F, 0.5F, -0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  448 */     this.gunModel[6].setRotationPoint(-60.0F, -16.0F, -6.5F);
/*      */     
/*  450 */     this.gunModel[7].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 13, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  451 */     this.gunModel[7].setRotationPoint(-58.15F, -14.5F, -2.5F);
/*      */     
/*  453 */     this.gunModel[8].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 13, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  454 */     this.gunModel[8].setRotationPoint(-58.65F, -14.5F, -2.5F);
/*      */     
/*  456 */     this.gunModel[9].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 13, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  457 */     this.gunModel[9].setRotationPoint(-57.65F, -14.5F, -2.5F);
/*      */     
/*  459 */     this.gunModel[10].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 13, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  460 */     this.gunModel[10].setRotationPoint(-48.85F, -14.0F, -2.5F);
/*      */     
/*  462 */     this.gunModel[11].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 13, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  463 */     this.gunModel[11].setRotationPoint(-49.35F, -14.0F, -2.5F);
/*      */     
/*  465 */     this.gunModel[12].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 13, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  466 */     this.gunModel[12].setRotationPoint(-48.35F, -14.0F, -2.5F);
/*      */     
/*  468 */     this.gunModel[13].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  469 */     this.gunModel[13].setRotationPoint(-35.0F, -15.0F, -2.75F);
/*      */     
/*  471 */     this.gunModel[14].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  472 */     this.gunModel[14].setRotationPoint(-36.0F, -15.0F, -2.75F);
/*      */     
/*  474 */     this.gunModel[15].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  475 */     this.gunModel[15].setRotationPoint(-34.0F, -15.0F, -2.75F);
/*      */     
/*  477 */     this.gunModel[16].addShapeBox(46.0F, -18.0F, -4.0F, 4, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  478 */     this.gunModel[16].setRotationPoint(-7.0F, -11.0F, -1.0F);
/*      */     
/*  480 */     this.gunModel[17].addShapeBox(46.0F, -18.0F, -4.0F, 3, 5, 11, 0.0F, 0.0F, -1.25F, 0.5F, 4.0F, -1.25F, 0.5F, 4.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  481 */     this.gunModel[17].setRotationPoint(-7.0F, -16.0F, -1.5F);
/*      */     
/*  483 */     this.gunModel[18].addShapeBox(46.0F, -18.0F, -4.0F, 15, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  484 */     this.gunModel[18].setRotationPoint(-53.0F, -9.75F, -1.0F);
/*      */     
/*  486 */     this.gunModel[19].addShapeBox(46.0F, -18.0F, -4.0F, 7, 9, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  487 */     this.gunModel[19].setRotationPoint(-60.0F, -9.75F, -1.0F);
/*      */     
/*  489 */     this.gunModel[20].addShapeBox(46.0F, -18.0F, -4.0F, 15, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  490 */     this.gunModel[20].setRotationPoint(-53.0F, -3.75F, -1.0F);
/*      */     
/*  492 */     this.gunModel[21].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  493 */     this.gunModel[21].setRotationPoint(-55.0F, -0.75F, -1.0F);
/*      */     
/*  495 */     this.gunModel[22].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  496 */     this.gunModel[22].setRotationPoint(-52.0F, -0.75F, -1.0F);
/*      */     
/*  498 */     this.gunModel[23].addShapeBox(46.0F, -18.0F, -4.0F, 3, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  499 */     this.gunModel[23].setRotationPoint(-49.0F, -0.75F, -1.0F);
/*      */     
/*  501 */     this.gunModel[24].addShapeBox(46.0F, -18.0F, -4.0F, 8, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  502 */     this.gunModel[24].setRotationPoint(-46.0F, -0.75F, -1.0F);
/*      */     
/*  504 */     this.gunModel[25].addShapeBox(46.0F, -18.0F, -4.0F, 1, 6, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  505 */     this.gunModel[25].setRotationPoint(-32.5F, -14.5F, -3.5F);
/*      */     
/*  507 */     this.gunModel[26].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 3, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  508 */     this.gunModel[26].setRotationPoint(-35.0F, -11.5F, -3.5F);
/*      */     
/*  510 */     this.gunModel[27].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.25F, -1.0F, -1.0F, 0.25F, -0.5F, -0.4F, 0.25F, -0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.4F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  511 */     this.gunModel[27].setRotationPoint(-35.0F, -12.5F, -3.5F);
/*      */     
/*  513 */     this.gunModel[28].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.4F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  514 */     this.gunModel[28].setRotationPoint(-33.75F, -12.5F, -3.5F);
/*      */     
/*  516 */     this.gunModel[29].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, -0.5F, -0.2F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.2F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  517 */     this.gunModel[29].setRotationPoint(-33.25F, -14.5F, -3.5F);
/*      */     
/*  519 */     this.gunModel[30].addShapeBox(46.0F, -18.0F, -4.0F, 1, 6, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  520 */     this.gunModel[30].setRotationPoint(-31.0F, -14.5F, -3.5F);
/*      */     
/*  522 */     this.gunModel[31].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 10, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  523 */     this.gunModel[31].setRotationPoint(-38.0F, -10.5F, -1.0F);
/*      */     
/*  525 */     this.gunModel[32].addShapeBox(46.0F, -18.0F, -4.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  526 */     this.gunModel[32].setRotationPoint(-60.0F, -9.5F, -2.0F);
/*      */     
/*  528 */     this.gunModel[33].addShapeBox(46.0F, -18.0F, -4.0F, 1, 4, 10, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  529 */     this.gunModel[33].setRotationPoint(-55.75F, -9.5F, -2.0F);
/*      */     
/*  531 */     this.gunModel[34].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  532 */     this.gunModel[34].setRotationPoint(-55.25F, -7.5F, -2.0F);
/*      */     
/*  534 */     this.gunModel[35].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 10, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  535 */     this.gunModel[35].setRotationPoint(-54.25F, -7.5F, -2.0F);
/*      */     
/*  537 */     this.gunModel[36].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 10, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  538 */     this.gunModel[36].setRotationPoint(-51.25F, -7.5F, -2.0F);
/*      */     
/*  540 */     this.gunModel[37].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  541 */     this.gunModel[37].setRotationPoint(-55.75F, -5.5F, -2.0F);
/*      */     
/*  543 */     this.gunModel[38].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  544 */     this.gunModel[38].setRotationPoint(-56.75F, -5.5F, -2.0F);
/*      */     
/*  546 */     this.gunModel[39].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 1, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  547 */     this.gunModel[39].setRotationPoint(-59.75F, -5.5F, -2.0F);
/*      */     
/*  549 */     this.gunModel[40].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  550 */     this.gunModel[40].setRotationPoint(-58.25F, -8.0F, -2.0F);
/*      */     
/*  552 */     this.gunModel[41].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  553 */     this.gunModel[41].setRotationPoint(-59.25F, -8.0F, -2.0F);
/*      */     
/*  555 */     this.gunModel[42].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  556 */     this.gunModel[42].setRotationPoint(-57.25F, -8.0F, -2.0F);
/*      */     
/*  558 */     this.gunModel[43].addShapeBox(46.0F, -18.0F, -4.0F, 4, 2, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  559 */     this.gunModel[43].setRotationPoint(-7.0F, -10.5F, -1.0F);
/*      */     
/*  561 */     this.gunModel[44].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 4, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  562 */     this.gunModel[44].setRotationPoint(-8.0F, -10.5F, -1.0F);
/*      */     
/*  564 */     this.gunModel[45].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F);
/*  565 */     this.gunModel[45].setRotationPoint(-8.0F, -14.75F, -1.5F);
/*      */     
/*  567 */     this.gunModel[46].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  568 */     this.gunModel[46].setRotationPoint(-28.5F, -14.75F, -1.5F);
/*      */     
/*  570 */     this.gunModel[47].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[47].setRotationPoint(-28.5F, -10.5F, -1.0F);
/*      */     
/*  573 */     this.gunModel[48].addShapeBox(46.0F, -18.0F, -4.0F, 20, 2, 4, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  574 */     this.gunModel[48].setRotationPoint(-27.5F, -10.5F, -1.0F);
/*      */     
/*  576 */     this.gunModel[49].addShapeBox(46.0F, -18.0F, -4.0F, 20, 2, 2, 0.0F, 0.0F, -1.75F, 0.5F, -0.5F, -1.75F, 0.5F, -0.5F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  577 */     this.gunModel[49].setRotationPoint(-27.5F, -16.5F, -1.5F);
/*      */     
/*  579 */     this.gunModel[50].addShapeBox(46.0F, -18.0F, -4.0F, 33, 7, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  580 */     this.gunModel[50].setRotationPoint(-38.0F, -4.75F, -1.0F);
/*      */     
/*  582 */     this.gunModel[51].addShapeBox(46.0F, -18.0F, -4.0F, 8, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  583 */     this.gunModel[51].setRotationPoint(-46.0F, 2.25F, 0.0F);
/*      */     
/*  585 */     this.gunModel[52].addShapeBox(46.0F, -18.0F, -4.0F, 6, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  586 */     this.gunModel[52].setRotationPoint(-46.0F, 4.25F, 0.0F);
/*      */     
/*  588 */     this.gunModel[53].addShapeBox(46.0F, -18.0F, -4.0F, 6, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  589 */     this.gunModel[53].setRotationPoint(-46.0F, 7.25F, 0.0F);
/*      */     
/*  591 */     this.gunModel[54].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  592 */     this.gunModel[54].setRotationPoint(-46.0F, 6.25F, 0.0F);
/*      */     
/*  594 */     this.gunModel[55].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 8, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  595 */     this.gunModel[55].setRotationPoint(-41.0F, 9.25F, 0.0F);
/*      */     
/*  597 */     this.gunModel[56].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  598 */     this.gunModel[56].setRotationPoint(-39.0F, 10.25F, 0.0F);
/*      */     
/*  600 */     this.gunModel[57].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  601 */     this.gunModel[57].setRotationPoint(-37.0F, 11.0F, 0.0F);
/*      */     
/*  603 */     this.gunModel[58].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  604 */     this.gunModel[58].setRotationPoint(-35.0F, 11.0F, 0.0F);
/*      */     
/*  606 */     this.gunModel[59].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  607 */     this.gunModel[59].setRotationPoint(-32.0F, 11.0F, 0.0F);
/*      */     
/*  609 */     this.gunModel[60].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  610 */     this.gunModel[60].setRotationPoint(-30.0F, 10.75F, 0.0F);
/*      */     
/*  612 */     this.gunModel[61].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  613 */     this.gunModel[61].setRotationPoint(-28.0F, 10.25F, 0.0F);
/*      */     
/*  615 */     this.gunModel[62].addShapeBox(46.0F, -18.0F, -4.0F, 3, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  616 */     this.gunModel[62].setRotationPoint(-26.75F, 4.75F, 0.0F);
/*      */     
/*  618 */     this.gunModel[63].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[63].setRotationPoint(-26.75F, 3.75F, 0.0F);
/*      */     
/*  621 */     this.gunModel[64].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 8, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  622 */     this.gunModel[64].setRotationPoint(-26.75F, 2.75F, 0.0F);
/*      */     
/*  624 */     this.gunModel[65].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[65].setRotationPoint(-42.0F, 10.25F, 0.0F);
/*      */     
/*  627 */     this.gunModel[66].addShapeBox(46.0F, -18.0F, -4.0F, 3, 3, 8, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.25F, 0.5F, 0.0F);
/*  628 */     this.gunModel[66].setRotationPoint(-44.0F, 10.25F, 0.0F);
/*      */     
/*  630 */     this.gunModel[67].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  631 */     this.gunModel[67].setRotationPoint(-46.0F, 10.75F, 0.0F);
/*      */     
/*  633 */     this.gunModel[68].addShapeBox(46.0F, -18.0F, -4.0F, 2, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/*  634 */     this.gunModel[68].setRotationPoint(-48.25F, 10.75F, 0.0F);
/*      */     
/*  636 */     this.gunModel[69].addShapeBox(46.0F, -18.0F, -4.0F, 14, 8, 8, 0.0F, -4.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  637 */     this.gunModel[69].setRotationPoint(-62.5F, 15.75F, 0.0F);
/*      */     
/*  639 */     this.gunModel[70].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  640 */     this.gunModel[70].setRotationPoint(-50.5F, 23.75F, 0.0F);
/*      */     
/*  642 */     this.gunModel[71].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  643 */     this.gunModel[71].setRotationPoint(-50.5F, 26.25F, 0.0F);
/*      */     
/*  645 */     this.gunModel[72].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  646 */     this.gunModel[72].setRotationPoint(-50.5F, 28.25F, 0.0F);
/*      */     
/*  648 */     this.gunModel[73].addShapeBox(46.0F, -18.0F, -4.0F, 12, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -11.5F, -0.5F, 0.0F);
/*  649 */     this.gunModel[73].setRotationPoint(-62.5F, 23.75F, 0.0F);
/*      */     
/*  651 */     this.gunModel[74].addShapeBox(46.0F, -18.0F, -4.0F, 9, 5, 8, 0.0F, -2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  652 */     this.gunModel[74].setRotationPoint(-57.5F, 10.75F, 0.0F);
/*      */     
/*  654 */     this.gunModel[75].addShapeBox(46.0F, -18.0F, -4.0F, 8, 2, 8, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  655 */     this.gunModel[75].setRotationPoint(-54.5F, 8.75F, 0.0F);
/*      */     
/*  657 */     this.gunModel[76].addShapeBox(46.0F, -18.0F, -4.0F, 7, 3, 8, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  658 */     this.gunModel[76].setRotationPoint(-53.5F, 5.75F, 0.0F);
/*      */     
/*  660 */     this.gunModel[77].addShapeBox(46.0F, -18.0F, -4.0F, 5, 2, 8, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  661 */     this.gunModel[77].setRotationPoint(-51.5F, 3.75F, 0.0F);
/*      */     
/*  663 */     this.gunModel[78].addShapeBox(46.0F, -18.0F, -4.0F, 5, 2, 8, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  664 */     this.gunModel[78].setRotationPoint(-51.5F, 1.75F, 0.0F);
/*      */     
/*  666 */     this.gunModel[79].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 8, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  667 */     this.gunModel[79].setRotationPoint(-52.5F, -0.25F, 0.0F);
/*      */     
/*  669 */     this.gunModel[80].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 8, 0.0F, 3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/*  670 */     this.gunModel[80].setRotationPoint(-54.5F, -0.75F, 0.0F);
/*      */     
/*  672 */     this.gunModel[81].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  673 */     this.gunModel[81].setRotationPoint(-25.0F, -4.75F, -2.0F);
/*      */     
/*  675 */     this.gunModel[82].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  676 */     this.gunModel[82].setRotationPoint(-15.0F, -4.75F, -2.0F);
/*      */     
/*  678 */     this.gunModel[83].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  679 */     this.gunModel[83].setRotationPoint(-15.0F, -3.25F, -2.0F);
/*      */     
/*  681 */     this.gunModel[84].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  682 */     this.gunModel[84].setRotationPoint(-34.75F, 2.75F, 3.0F);
/*      */     
/*  684 */     this.gunModel[85].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  685 */     this.gunModel[85].setRotationPoint(-35.5F, 3.75F, 3.0F);
/*      */     
/*  687 */     this.gunModel[86].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  688 */     this.gunModel[86].setRotationPoint(-36.25F, 4.75F, 3.0F);
/*      */     
/*  690 */     this.gunModel[87].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  691 */     this.gunModel[87].setRotationPoint(-36.25F, 5.75F, 3.0F);
/*      */     
/*  693 */     this.gunModel[88].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  694 */     this.gunModel[88].setRotationPoint(-36.25F, 7.75F, 3.0F);
/*      */     
/*  696 */     this.gunModel[89].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F);
/*  697 */     this.gunModel[89].setRotationPoint(-35.75F, 8.75F, 3.0F);
/*      */     
/*  699 */     this.gunModel[90].addShapeBox(46.0F, -18.0F, -4.0F, 18, 4, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.5F, 0.0F);
/*  700 */     this.gunModel[90].setRotationPoint(-23.0F, 2.25F, -1.0F);
/*      */     
/*  702 */     this.gunModel[91].addShapeBox(46.0F, -18.0F, -4.0F, 1, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  703 */     this.gunModel[91].setRotationPoint(-23.5F, 4.75F, 0.0F);
/*      */     
/*  705 */     this.gunModel[92].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  706 */     this.gunModel[92].setRotationPoint(-23.5F, 2.75F, -1.0F);
/*      */     
/*  708 */     this.gunModel[93].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  709 */     this.gunModel[93].setRotationPoint(-24.5F, 2.75F, -1.0F);
/*      */     
/*  711 */     this.gunModel[94].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[94].setRotationPoint(-24.5F, 2.75F, 0.0F);
/*      */     
/*  714 */     this.gunModel[95].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 8, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  715 */     this.gunModel[95].setRotationPoint(-24.0F, 2.75F, 0.0F);
/*      */     
/*  717 */     this.gunModel[96].addShapeBox(46.0F, -18.0F, -4.0F, 19, 1, 1, 0.0F, -0.5F, -3.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.5F, 0.0F);
/*  718 */     this.gunModel[96].setRotationPoint(-23.5F, 6.25F, -1.5F);
/*      */     
/*  720 */     this.gunModel[97].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 11, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  721 */     this.gunModel[97].setRotationPoint(-5.0F, -4.75F, -2.0F);
/*      */     
/*  723 */     this.gunModel[98].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 11, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  724 */     this.gunModel[98].setRotationPoint(-3.0F, -4.75F, -2.0F);
/*      */     
/*  726 */     this.gunModel[99].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  727 */     this.gunModel[99].setRotationPoint(-6.0F, -1.75F, -2.0F);
/*      */     
/*  729 */     this.gunModel[100].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[100].setRotationPoint(-4.5F, -3.5F, -2.25F);
/*      */     
/*  732 */     this.gunModel[101].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  733 */     this.gunModel[101].setRotationPoint(-5.5F, -3.5F, -2.25F);
/*      */     
/*  735 */     this.gunModel[102].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  736 */     this.gunModel[102].setRotationPoint(-3.5F, -3.5F, -2.25F);
/*      */     
/*  738 */     this.gunModel[103].addShapeBox(46.0F, -18.0F, -4.0F, 9, 5, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  739 */     this.gunModel[103].setRotationPoint(-15.0F, 1.25F, -1.5F);
/*      */     
/*  741 */     this.gunModel[104].addShapeBox(46.0F, -18.0F, -4.0F, 9, 2, 11, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  742 */     this.gunModel[104].setRotationPoint(-15.0F, -0.25F, -1.5F);
/*      */     
/*  744 */     this.gunModel[105].addShapeBox(46.0F, -18.0F, -4.0F, 116, 1, 9, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  745 */     this.gunModel[105].setRotationPoint(-60.0F, -21.25F, -0.75F);
/*      */     
/*  747 */     this.gunModel[106].addShapeBox(46.0F, -18.0F, -4.0F, 21, 2, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[106].setRotationPoint(-28.5F, -10.5F, 1.0F);
/*      */     
/*  750 */     this.gunModel[107].addShapeBox(46.0F, -18.0F, -4.0F, 21, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  751 */     this.gunModel[107].setRotationPoint(-28.5F, -11.0F, 1.0F);
/*      */     
/*  753 */     this.gunModel[108].addShapeBox(46.0F, -18.0F, -4.0F, 21, 5, 8, 0.0F, 0.0F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  754 */     this.gunModel[108].setRotationPoint(-28.5F, -16.0F, 1.5F);
/*      */     
/*  756 */     this.gunModel[109].addShapeBox(46.0F, -18.0F, -4.0F, 4, 3, 8, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.75F, 3.5F, 0.0F, 0.75F, 3.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F);
/*  757 */     this.gunModel[109].setRotationPoint(23.0F, -18.5F, 1.5F);
/*      */     
/*  759 */     this.gunModel[110].addShapeBox(46.0F, -18.0F, -4.0F, 29, 2, 3, 0.0F, 0.0F, 0.5F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, 0.5F, -1.45F, 0.0F, 0.5F, -1.45F, 0.0F, 0.75F, -2.25F, 0.0F, 0.75F, -2.25F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F);
/*  760 */     this.gunModel[110].setRotationPoint(27.0F, -17.5F, 6.5F);
/*      */     
/*  762 */     this.gunModel[111].addShapeBox(46.0F, -18.0F, -4.0F, 10, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/*  763 */     this.gunModel[111].setRotationPoint(46.0F, -20.0F, 0.75F);
/*      */     
/*  765 */     this.gunModel[112].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/*  766 */     this.gunModel[112].setRotationPoint(38.0F, -20.0F, -0.25F);
/*      */     
/*  768 */     this.gunModel[113].addShapeBox(46.0F, -18.0F, -4.0F, 92, 1, 2, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F);
/*  769 */     this.gunModel[113].setRotationPoint(-60.0F, -20.0F, 6.75F);
/*      */     
/*  771 */     this.gunModel[114].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F);
/*  772 */     this.gunModel[114].setRotationPoint(38.0F, -20.0F, 6.75F);
/*      */     
/*  774 */     this.gunModel[115].addShapeBox(46.0F, -18.0F, -4.0F, 10, 1, 2, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F);
/*  775 */     this.gunModel[115].setRotationPoint(46.0F, -20.0F, 6.75F);
/*      */     
/*  777 */     this.gunModel[116].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.3F, -0.25F, 0.0F, 0.3F);
/*  778 */     this.gunModel[116].setRotationPoint(45.0F, -19.0F, 6.75F);
/*      */     
/*  780 */     this.gunModel[117].addShapeBox(46.0F, -18.0F, -4.0F, 27, 1, 10, 0.0F, 0.0F, 0.25F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F, 0.25F, -0.7F, 0.0F, 0.25F, -0.7F, 0.0F, 0.75F, 1.5F, 0.0F, 0.75F, 1.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F);
/*  781 */     this.gunModel[117].setRotationPoint(-4.0F, -16.5F, -0.5F);
/*      */     
/*  783 */     this.gunModel[118].addShapeBox(46.0F, -18.0F, -4.0F, 10, 1, 3, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -1.2F);
/*  784 */     this.gunModel[118].setRotationPoint(46.0F, -19.25F, 6.25F);
/*      */     
/*  786 */     this.gunModel[119].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 3, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -1.2F);
/*  787 */     this.gunModel[119].setRotationPoint(38.0F, -19.25F, 6.25F);
/*      */     
/*  789 */     this.gunModel[120].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 10, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.25F, -0.7F, 0.0F, 0.25F, -0.7F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -1.2F);
/*  790 */     this.gunModel[120].setRotationPoint(27.0F, -19.25F, -0.75F);
/*      */     
/*  792 */     this.gunModel[121].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F);
/*  793 */     this.gunModel[121].setRotationPoint(40.0F, -19.0F, 6.75F);
/*      */     
/*  795 */     this.gunModel[122].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  796 */     this.gunModel[122].setRotationPoint(40.0F, -19.75F, 0.75F);
/*      */     
/*  798 */     this.gunModel[123].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F);
/*  799 */     this.gunModel[123].setRotationPoint(45.0F, -19.75F, 0.75F);
/*      */     
/*  801 */     this.gunModel[124].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.3F, -0.25F, 0.0F, 0.3F);
/*  802 */     this.gunModel[124].setRotationPoint(37.0F, -19.0F, 6.75F);
/*      */     
/*  804 */     this.gunModel[125].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F);
/*  805 */     this.gunModel[125].setRotationPoint(32.0F, -19.0F, -0.25F);
/*      */     
/*  807 */     this.gunModel[126].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  808 */     this.gunModel[126].setRotationPoint(32.0F, -19.75F, 0.75F);
/*      */     
/*  810 */     this.gunModel[127].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F);
/*  811 */     this.gunModel[127].setRotationPoint(37.0F, -19.75F, 0.75F);
/*      */     
/*  813 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/*  814 */     this.gunModel[''].setRotationPoint(-4.0F, -17.75F, 6.65F);
/*      */     
/*  816 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.15F, -1.0F, -0.5F, -0.15F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F);
/*  817 */     this.gunModel[''].setRotationPoint(22.0F, -16.75F, 5.65F);
/*      */     
/*  819 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  820 */     this.gunModel[''].setRotationPoint(-7.5F, -14.75F, 9.25F);
/*      */     
/*  822 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  823 */     this.gunModel[''].setRotationPoint(-8.5F, -14.75F, 9.25F);
/*      */     
/*  825 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel[''].setRotationPoint(-6.5F, -14.75F, 9.25F);
/*      */     
/*  828 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.55F, -1.0F, -0.5F, 0.55F);
/*  829 */     this.gunModel[''].setRotationPoint(22.0F, -18.25F, 4.65F);
/*      */     
/*  831 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 32, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  832 */     this.gunModel[''].setRotationPoint(-60.0F, -11.0F, -2.0F);
/*      */     
/*  834 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 56, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  835 */     this.gunModel[''].setRotationPoint(-60.0F, -11.0F, 9.0F);
/*      */     
/*  837 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  838 */     this.gunModel[''].setRotationPoint(-7.0F, -11.0F, -2.0F);
/*      */     
/*  840 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  841 */     this.gunModel[''].setRotationPoint(-29.0F, -14.5F, 9.25F);
/*      */     
/*  843 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  844 */     this.gunModel[''].setRotationPoint(-30.0F, -14.5F, 9.25F);
/*      */     
/*  846 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel[''].setRotationPoint(-28.0F, -14.5F, 9.25F);
/*      */     
/*  849 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  850 */     this.gunModel[''].setRotationPoint(-25.0F, -4.75F, 8.5F);
/*      */     
/*  852 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  853 */     this.gunModel[''].setRotationPoint(-15.0F, -4.75F, 8.5F);
/*      */     
/*  855 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/*  856 */     this.gunModel[''].setRotationPoint(-15.0F, -3.25F, 8.5F);
/*      */     
/*  858 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel[''].setRotationPoint(-5.0F, -4.75F, 8.5F);
/*      */     
/*  861 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  862 */     this.gunModel[''].setRotationPoint(-3.0F, -4.75F, 8.5F);
/*      */     
/*  864 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  865 */     this.gunModel[''].setRotationPoint(-4.5F, -3.5F, 8.75F);
/*      */     
/*  867 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  868 */     this.gunModel[''].setRotationPoint(-3.5F, -3.5F, 8.75F);
/*      */     
/*  870 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  871 */     this.gunModel[''].setRotationPoint(-5.5F, -3.5F, 8.75F);
/*      */     
/*  873 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.55F, 0.0F, -0.5F, 0.55F);
/*  874 */     this.gunModel[''].setRotationPoint(-4.0F, -18.25F, 5.65F);
/*      */     
/*  876 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 27, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F);
/*  877 */     this.gunModel[''].setRotationPoint(-4.0F, -18.25F, 4.65F);
/*      */     
/*  879 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 27, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  880 */     this.gunModel[''].setRotationPoint(-4.0F, -18.75F, 5.65F);
/*      */     
/*  882 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  883 */     this.gunModel[''].setRotationPoint(-60.0F, -9.5F, 8.5F);
/*      */     
/*  885 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel[''].setRotationPoint(-55.75F, -9.5F, 8.5F);
/*      */     
/*  888 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  889 */     this.gunModel[''].setRotationPoint(-55.25F, -7.5F, 8.5F);
/*      */     
/*  891 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  892 */     this.gunModel[''].setRotationPoint(-54.25F, -7.5F, 8.5F);
/*      */     
/*  894 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  895 */     this.gunModel[''].setRotationPoint(-55.75F, -5.5F, 8.5F);
/*      */     
/*  897 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  898 */     this.gunModel[''].setRotationPoint(-56.75F, -5.5F, 8.5F);
/*      */     
/*  900 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 1, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/*  901 */     this.gunModel[''].setRotationPoint(-59.75F, -5.5F, 8.5F);
/*      */     
/*  903 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/*  904 */     this.gunModel[''].setRotationPoint(-51.25F, -7.5F, 9.0F);
/*      */     
/*  906 */     this.gunModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  907 */     this.gunModel[''].setRotationPoint(-58.25F, -8.0F, 8.0F);
/*      */     
/*  909 */     this.gunModel[' '].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  910 */     this.gunModel[' '].setRotationPoint(-59.25F, -8.0F, 8.0F);
/*      */     
/*  912 */     this.gunModel['¡'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  913 */     this.gunModel['¡'].setRotationPoint(-57.25F, -8.0F, 8.0F);
/*      */     
/*  915 */     this.gunModel['¢'].addShapeBox(46.0F, -18.0F, -4.0F, 58, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  916 */     this.gunModel['¢'].setRotationPoint(-2.0F, -14.75F, 9.5F);
/*      */     
/*  918 */     this.gunModel['£'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 3, 1, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  919 */     this.gunModel['£'].setRotationPoint(-4.0F, -14.0F, 9.5F);
/*      */     
/*  921 */     this.gunModel['¤'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  922 */     this.gunModel['¤'].setRotationPoint(-4.0F, -12.5F, 10.5F);
/*      */     
/*  924 */     this.gunModel['¥'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  925 */     this.gunModel['¥'].setRotationPoint(-4.0F, -11.5F, 9.5F);
/*      */     
/*  927 */     this.gunModel['¦'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  928 */     this.gunModel['¦'].setRotationPoint(-4.0F, -11.0F, 10.0F);
/*      */     
/*  930 */     this.gunModel['§'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 3, 2, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
/*  931 */     this.gunModel['§'].setRotationPoint(50.0F, -8.5F, 9.0F);
/*      */     
/*  933 */     this.gunModel['¨'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 3, 2, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
/*  934 */     this.gunModel['¨'].setRotationPoint(36.0F, -8.5F, 9.0F);
/*      */     
/*  936 */     this.gunModel['©'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 3, 2, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
/*  937 */     this.gunModel['©'].setRotationPoint(22.0F, -8.5F, 9.0F);
/*      */     
/*  939 */     this.gunModel['ª'].addShapeBox(46.0F, -18.0F, -4.0F, 17, 3, 2, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
/*  940 */     this.gunModel['ª'].setRotationPoint(-4.0F, -8.5F, 9.0F);
/*      */     
/*  942 */     this.gunModel['«'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  943 */     this.gunModel['«'].setRotationPoint(-4.0F, -7.0F, 8.5F);
/*      */     
/*  945 */     this.gunModel['¬'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 1, 2, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  946 */     this.gunModel['¬'].setRotationPoint(-4.0F, -6.0F, 6.5F);
/*      */     
/*  948 */     this.gunModel['­'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  949 */     this.gunModel['­'].setRotationPoint(-4.0F, -5.5F, 7.0F);
/*      */     
/*  951 */     this.gunModel['®'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 1, 2, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/*  952 */     this.gunModel['®'].setRotationPoint(46.0F, -20.0F, -0.75F);
/*      */     
/*  954 */     this.gunModel['¯'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 1, 3, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -1.2F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/*  955 */     this.gunModel['¯'].setRotationPoint(46.0F, -19.25F, -1.25F);
/*      */     
/*  957 */     this.gunModel['°'].addShapeBox(46.0F, -18.0F, -4.0F, 29, 2, 3, 0.0F, 0.0F, 0.5F, -1.45F, 0.0F, 0.5F, -1.45F, 0.0F, 0.5F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, -2.25F, 0.0F, 0.75F, -2.25F);
/*  958 */     this.gunModel['°'].setRotationPoint(27.0F, -17.5F, -1.5F);
/*      */     
/*  960 */     this.gunModel['±'].addShapeBox(46.0F, -18.0F, -4.0F, 58, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  961 */     this.gunModel['±'].setRotationPoint(-2.0F, -14.75F, -2.5F);
/*      */     
/*  963 */     this.gunModel['²'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 3, 1, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  964 */     this.gunModel['²'].setRotationPoint(-4.0F, -14.0F, -2.5F);
/*      */     
/*  966 */     this.gunModel['³'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  967 */     this.gunModel['³'].setRotationPoint(-4.0F, -11.5F, -3.5F);
/*      */     
/*  969 */     this.gunModel['´'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  970 */     this.gunModel['´'].setRotationPoint(-4.0F, -12.5F, -2.75F);
/*      */     
/*  972 */     this.gunModel['µ'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  973 */     this.gunModel['µ'].setRotationPoint(-4.0F, -11.0F, -3.5F);
/*      */     
/*  975 */     this.gunModel['¶'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  976 */     this.gunModel['¶'].setRotationPoint(50.0F, -8.5F, -3.5F);
/*      */     
/*  978 */     this.gunModel['·'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  979 */     this.gunModel['·'].setRotationPoint(-4.0F, -7.0F, -2.0F);
/*      */     
/*  981 */     this.gunModel['¸'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 1, 2, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  982 */     this.gunModel['¸'].setRotationPoint(-4.0F, -6.0F, -1.5F);
/*      */     
/*  984 */     this.gunModel['¹'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  985 */     this.gunModel['¹'].setRotationPoint(-4.0F, -5.5F, -0.5F);
/*      */     
/*  987 */     this.gunModel['º'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 2, 6, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  988 */     this.gunModel['º'].setRotationPoint(-4.0F, -4.25F, 1.0F);
/*      */     
/*  990 */     this.gunModel['»'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F);
/*  991 */     this.gunModel['»'].setRotationPoint(41.0F, -7.5F, 8.6F);
/*      */     
/*  993 */     this.gunModel['¼'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/*  994 */     this.gunModel['¼'].setRotationPoint(41.0F, -7.5F, -3.1F);
/*      */     
/*  996 */     this.gunModel['½'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.35F);
/*  997 */     this.gunModel['½'].setRotationPoint(49.0F, -7.5F, 8.6F);
/*      */     
/*  999 */     this.gunModel['¾'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1000 */     this.gunModel['¾'].setRotationPoint(36.0F, -8.5F, -3.5F);
/*      */     
/* 1002 */     this.gunModel['¿'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.65F);
/* 1003 */     this.gunModel['¿'].setRotationPoint(49.0F, -7.5F, -3.1F);
/*      */     
/* 1005 */     this.gunModel['À'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1006 */     this.gunModel['À'].setRotationPoint(49.0F, -7.0F, 8.0F);
/*      */     
/* 1008 */     this.gunModel['Á'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1009 */     this.gunModel['Á'].setRotationPoint(41.0F, -7.0F, 8.0F);
/*      */     
/* 1011 */     this.gunModel['Â'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F);
/* 1012 */     this.gunModel['Â'].setRotationPoint(27.0F, -7.5F, 8.6F);
/*      */     
/* 1014 */     this.gunModel['Ã'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.35F);
/* 1015 */     this.gunModel['Ã'].setRotationPoint(35.0F, -7.5F, 8.6F);
/*      */     
/* 1017 */     this.gunModel['Ä'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1018 */     this.gunModel['Ä'].setRotationPoint(35.0F, -7.0F, 8.0F);
/*      */     
/* 1020 */     this.gunModel['Å'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1021 */     this.gunModel['Å'].setRotationPoint(27.0F, -7.0F, 8.0F);
/*      */     
/* 1023 */     this.gunModel['Æ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F);
/* 1024 */     this.gunModel['Æ'].setRotationPoint(13.0F, -7.5F, 8.6F);
/*      */     
/* 1026 */     this.gunModel['Ç'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.35F);
/* 1027 */     this.gunModel['Ç'].setRotationPoint(21.0F, -7.5F, 8.6F);
/*      */     
/* 1029 */     this.gunModel['È'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1030 */     this.gunModel['È'].setRotationPoint(21.0F, -7.0F, 8.0F);
/*      */     
/* 1032 */     this.gunModel['É'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1033 */     this.gunModel['É'].setRotationPoint(13.0F, -7.0F, 8.0F);
/*      */     
/* 1035 */     this.gunModel['Ê'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 1036 */     this.gunModel['Ê'].setRotationPoint(-4.0F, -11.25F, 11.0F);
/*      */     
/* 1038 */     this.gunModel['Ë'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 5, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1039 */     this.gunModel['Ë'].setRotationPoint(-4.0F, -12.25F, 11.5F);
/*      */     
/* 1041 */     this.gunModel['Ì'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 1042 */     this.gunModel['Ì'].setRotationPoint(-4.0F, -11.25F, -4.0F);
/*      */     
/* 1044 */     this.gunModel['Í'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 5, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1045 */     this.gunModel['Í'].setRotationPoint(-4.0F, -12.25F, -5.0F);
/*      */     
/* 1047 */     this.gunModel['Î'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1048 */     this.gunModel['Î'].setRotationPoint(-4.5F, -14.75F, -2.75F);
/*      */     
/* 1050 */     this.gunModel['Ï'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1051 */     this.gunModel['Ï'].setRotationPoint(-5.5F, -14.75F, -2.75F);
/*      */     
/* 1053 */     this.gunModel['Ð'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1054 */     this.gunModel['Ð'].setRotationPoint(-3.5F, -14.75F, -2.75F);
/*      */     
/* 1056 */     this.gunModel['Ñ'].addShapeBox(46.0F, -18.0F, -4.0F, 27, 2, 5, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1057 */     this.gunModel['Ñ'].setRotationPoint(-4.0F, -18.75F, 0.65F);
/*      */     
/* 1059 */     this.gunModel['Ò'].addShapeBox(46.0F, -18.0F, -4.0F, 27, 1, 5, 0.0F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1060 */     this.gunModel['Ò'].setRotationPoint(-4.0F, -18.25F, 0.35F);
/*      */     
/* 1062 */     this.gunModel['Ó'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.55F, -1.0F, -0.5F, 0.55F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1063 */     this.gunModel['Ó'].setRotationPoint(-4.0F, -18.25F, 0.35F);
/*      */     
/* 1065 */     this.gunModel['Ô'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.15F, -1.0F, -0.5F, -0.15F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1066 */     this.gunModel['Ô'].setRotationPoint(-4.0F, -17.75F, -0.65F);
/*      */     
/* 1068 */     this.gunModel['Õ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1069 */     this.gunModel['Õ'].setRotationPoint(22.0F, -17.75F, -0.65F);
/*      */     
/* 1071 */     this.gunModel['Ö'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, -0.5F, 0.55F, 0.0F, -0.5F, 0.55F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1072 */     this.gunModel['Ö'].setRotationPoint(22.0F, -18.25F, 0.35F);
/*      */     
/* 1074 */     this.gunModel['×'].addShapeBox(46.0F, -18.0F, -4.0F, 17, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1075 */     this.gunModel['×'].setRotationPoint(-4.0F, -8.5F, -3.5F);
/*      */     
/* 1077 */     this.gunModel['Ø'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1078 */     this.gunModel['Ø'].setRotationPoint(22.0F, -8.5F, -3.5F);
/*      */     
/* 1080 */     this.gunModel['Ù'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 8, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1081 */     this.gunModel['Ù'].setRotationPoint(-3.0F, -4.0F, 0.0F);
/*      */     
/* 1083 */     this.gunModel['Ú'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1084 */     this.gunModel['Ú'].setRotationPoint(7.0F, -2.0F, 0.0F);
/*      */     
/* 1086 */     this.gunModel['Û'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1087 */     this.gunModel['Û'].setRotationPoint(7.0F, -2.5F, 0.0F);
/*      */     
/* 1089 */     this.gunModel['Ü'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1090 */     this.gunModel['Ü'].setRotationPoint(7.0F, -3.5F, 0.0F);
/*      */     
/* 1092 */     this.gunModel['Ý'].addShapeBox(46.0F, -18.0F, -4.0F, 60, 1, 6, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1093 */     this.gunModel['Ý'].setRotationPoint(-4.0F, -2.25F, 1.0F);
/*      */     
/* 1095 */     this.gunModel['Þ'].addShapeBox(46.0F, -18.0F, -4.0F, 24, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1096 */     this.gunModel['Þ'].setRotationPoint(60.0F, -11.75F, 2.25F);
/*      */     
/* 1098 */     this.gunModel['ß'].addShapeBox(46.0F, -18.0F, -4.0F, 13, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1099 */     this.gunModel['ß'].setRotationPoint(84.0F, -12.25F, 1.75F);
/*      */     
/* 1101 */     this.gunModel['à'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1102 */     this.gunModel['à'].setRotationPoint(77.0F, -12.25F, 1.75F);
/*      */     
/* 1104 */     this.gunModel['á'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 5, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.75F, 0.0F);
/* 1105 */     this.gunModel['á'].setRotationPoint(96.0F, -12.75F, 1.75F);
/*      */     
/* 1107 */     this.gunModel['â'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 5, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1108 */     this.gunModel['â'].setRotationPoint(97.0F, -12.75F, 1.75F);
/*      */     
/* 1110 */     this.gunModel['ã'].addShapeBox(46.0F, -18.0F, -4.0F, 62, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1111 */     this.gunModel['ã'].setRotationPoint(-6.0F, -12.25F, 1.75F);
/*      */     
/* 1113 */     this.gunModel['ä'].addShapeBox(46.0F, -18.0F, -4.0F, 4, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1114 */     this.gunModel['ä'].setRotationPoint(56.0F, -11.25F, 2.75F);
/*      */     
/* 1116 */     this.gunModel['å'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 5, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1117 */     this.gunModel['å'].setRotationPoint(82.0F, -12.25F, 1.75F);
/*      */     
/* 1119 */     this.gunModel['æ'].addShapeBox(46.0F, -18.0F, -4.0F, 58, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F);
/* 1120 */     this.gunModel['æ'].setRotationPoint(-2.0F, -14.75F, -1.5F);
/*      */     
/* 1122 */     this.gunModel['ç'].addShapeBox(46.0F, -18.0F, -4.0F, 58, 2, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1123 */     this.gunModel['ç'].setRotationPoint(-2.0F, -14.75F, 8.5F);
/*      */     
/* 1125 */     this.gunModel['è'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1126 */     this.gunModel['è'].setRotationPoint(-3.0F, -11.5F, -1.0F);
/*      */     
/* 1128 */     this.gunModel['é'].addShapeBox(46.0F, -18.0F, -4.0F, 92, 1, 2, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1129 */     this.gunModel['é'].setRotationPoint(-60.0F, -20.0F, -0.75F);
/*      */     
/* 1131 */     this.gunModel['ê'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1132 */     this.gunModel['ê'].setRotationPoint(38.0F, -20.0F, -0.75F);
/*      */     
/* 1134 */     this.gunModel['ë'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 3, 0.0F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1135 */     this.gunModel['ë'].setRotationPoint(38.0F, -19.25F, -1.5F);
/*      */     
/* 1137 */     this.gunModel['ì'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.3F, -1.0F, -0.5F, 0.3F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.3F, -0.25F, 0.0F, 0.3F, -0.25F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 1138 */     this.gunModel['ì'].setRotationPoint(32.0F, -19.0F, 7.25F);
/*      */     
/* 1140 */     this.gunModel['í'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.25F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1141 */     this.gunModel['í'].setRotationPoint(37.0F, -19.0F, 0.25F);
/*      */     
/* 1143 */     this.gunModel['î'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F);
/* 1144 */     this.gunModel['î'].setRotationPoint(40.0F, -19.0F, -0.25F);
/*      */     
/* 1146 */     this.gunModel['ï'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.25F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1147 */     this.gunModel['ï'].setRotationPoint(45.0F, -19.0F, 0.25F);
/*      */     
/* 1149 */     this.gunModel['ð'].addShapeBox(46.0F, -18.0F, -4.0F, 9, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1150 */     this.gunModel['ð'].setRotationPoint(55.0F, -17.0F, 2.75F);
/*      */     
/* 1152 */     this.gunModel['ñ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 5, 0.0F, -1.0F, 0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1153 */     this.gunModel['ñ'].setRotationPoint(96.0F, -8.75F, 1.75F);
/*      */     
/* 1155 */     this.gunModel['ò'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 5, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1156 */     this.gunModel['ò'].setRotationPoint(97.0F, -8.75F, 1.75F);
/*      */     
/* 1158 */     this.gunModel['ó'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1159 */     this.gunModel['ó'].setRotationPoint(57.0F, -12.25F, 1.75F);
/*      */     
/* 1161 */     this.gunModel['ô'].addShapeBox(46.0F, -18.0F, -4.0F, 57, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1162 */     this.gunModel['ô'].setRotationPoint(-1.0F, -17.0F, 2.75F);
/*      */     
/* 1164 */     this.gunModel['õ'].addShapeBox(46.0F, -18.0F, -4.0F, 4, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1165 */     this.gunModel['õ'].setRotationPoint(58.0F, -17.0F, 2.75F);
/*      */     
/* 1167 */     this.gunModel['ö'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1168 */     this.gunModel['ö'].setRotationPoint(63.0F, -17.0F, 2.75F);
/*      */     
/* 1170 */     this.gunModel['÷'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 1171 */     this.gunModel['÷'].setRotationPoint(57.0F, -13.0F, 2.75F);
/*      */     
/* 1173 */     this.gunModel['ø'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1174 */     this.gunModel['ø'].setRotationPoint(57.0F, -14.0F, 2.75F);
/*      */     
/* 1176 */     this.gunModel['ù'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1177 */     this.gunModel['ù'].setRotationPoint(68.0F, -17.25F, 3.75F);
/*      */     
/* 1179 */     this.gunModel['ú'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1180 */     this.gunModel['ú'].setRotationPoint(68.0F, -14.75F, 3.75F);
/*      */     
/* 1182 */     this.gunModel['û'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1183 */     this.gunModel['û'].setRotationPoint(69.0F, -16.25F, 3.75F);
/*      */     
/* 1185 */     this.gunModel['ü'].addShapeBox(46.0F, -18.0F, -4.0F, 33, 2, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1186 */     this.gunModel['ü'].setRotationPoint(-38.0F, -5.75F, 1.0F);
/*      */     
/* 1188 */     this.gunModel['ý'].addShapeBox(46.0F, -18.0F, -4.0F, 15, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1189 */     this.gunModel['ý'].setRotationPoint(-53.0F, -10.75F, 1.0F);
/*      */     
/* 1191 */     this.gunModel['þ'].addShapeBox(46.0F, -18.0F, -4.0F, 7, 1, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1192 */     this.gunModel['þ'].setRotationPoint(-60.0F, -10.75F, 1.0F);
/*      */     
/* 1194 */     this.gunModel['ÿ'].addShapeBox(46.0F, -18.0F, -4.0F, 19, 1, 1, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 3.5F, 0.0F);
/* 1195 */     this.gunModel['ÿ'].setRotationPoint(-23.5F, 6.25F, 8.5F);
/*      */     
/* 1197 */     this.gunModel['Ā'].addShapeBox(46.0F, -18.0F, -4.0F, 19, 1, 9, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.5F, 0.0F);
/* 1198 */     this.gunModel['Ā'].setRotationPoint(-23.5F, 6.25F, -0.5F);
/*      */     
/* 1200 */     this.gunModel['ā'].addShapeBox(46.0F, -18.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F);
/* 1201 */     this.gunModel['ā'].setRotationPoint(41.0F, -8.0F, 9.65F);
/*      */     
/* 1203 */     this.gunModel['Ă'].addShapeBox(46.0F, -18.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F);
/* 1204 */     this.gunModel['Ă'].setRotationPoint(27.0F, -8.0F, 9.65F);
/*      */     
/* 1206 */     this.gunModel['ă'].addShapeBox(46.0F, -18.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F);
/* 1207 */     this.gunModel['ă'].setRotationPoint(13.0F, -8.0F, 9.65F);
/*      */     
/* 1209 */     this.gunModel['Ą'].addShapeBox(46.0F, -18.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1210 */     this.gunModel['Ą'].setRotationPoint(13.0F, -8.0F, -3.15F);
/*      */     
/* 1212 */     this.gunModel['ą'].addShapeBox(46.0F, -18.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1213 */     this.gunModel['ą'].setRotationPoint(27.0F, -8.0F, -3.15F);
/*      */     
/* 1215 */     this.gunModel['Ć'].addShapeBox(46.0F, -18.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1216 */     this.gunModel['Ć'].setRotationPoint(41.0F, -8.0F, -3.15F);
/*      */     
/* 1218 */     this.gunModel['ć'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1219 */     this.gunModel['ć'].setRotationPoint(20.0F, -18.0F, -1.5F);
/*      */     
/* 1221 */     this.gunModel['Ĉ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/* 1222 */     this.gunModel['Ĉ'].setRotationPoint(20.0F, -19.0F, 8.5F);
/*      */     
/* 1224 */     this.gunModel['ĉ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, 0.0F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, -1.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/* 1225 */     this.gunModel['ĉ'].setRotationPoint(22.0F, -19.0F, 9.5F);
/*      */     
/* 1227 */     this.gunModel['Ċ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1228 */     this.gunModel['Ċ'].setRotationPoint(22.0F, -18.0F, 8.0F);
/*      */     
/* 1230 */     this.gunModel['ċ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, 0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.15F, -0.5F, 0.25F, -0.15F, -0.5F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.9F, -0.5F, 0.25F, 0.9F, -0.5F);
/* 1231 */     this.gunModel['ċ'].setRotationPoint(19.0F, -18.0F, 8.0F);
/*      */     
/* 1233 */     this.gunModel['Č'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.25F, 0.35F, -0.5F, 0.0F, 0.35F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.4F, -0.5F, 0.0F, 0.4F, -0.5F, 0.0F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F);
/* 1234 */     this.gunModel['Č'].setRotationPoint(19.0F, -17.5F, 10.0F);
/*      */     
/* 1236 */     this.gunModel['č'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1237 */     this.gunModel['č'].setRotationPoint(-106.0F, -9.75F, -1.0F);
/*      */     
/* 1239 */     this.gunModel['Ď'].addShapeBox(46.0F, -18.0F, -4.0F, 20, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1240 */     this.gunModel['Ď'].setRotationPoint(-98.0F, -3.75F, -1.0F);
/*      */     
/* 1242 */     this.gunModel['ď'].addShapeBox(46.0F, -18.0F, -4.0F, 20, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1243 */     this.gunModel['ď'].setRotationPoint(-98.0F, -1.75F, 0.0F);
/*      */     
/* 1245 */     this.gunModel['Đ'].addShapeBox(46.0F, -18.0F, -4.0F, 4, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/* 1246 */     this.gunModel['Đ'].setRotationPoint(-96.0F, -9.75F, -1.0F);
/*      */     
/* 1248 */     this.gunModel['đ'].addShapeBox(46.0F, -18.0F, -4.0F, 8, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1249 */     this.gunModel['đ'].setRotationPoint(-86.0F, -9.75F, -2.0F);
/*      */     
/* 1251 */     this.gunModel['Ē'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1252 */     this.gunModel['Ē'].setRotationPoint(-91.0F, -9.75F, -2.0F);
/*      */     
/* 1254 */     this.gunModel['ē'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1255 */     this.gunModel['ē'].setRotationPoint(-91.5F, -8.75F, -2.0F);
/*      */     
/* 1257 */     this.gunModel['Ĕ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1258 */     this.gunModel['Ĕ'].setRotationPoint(-91.5F, -9.25F, -2.0F);
/*      */     
/* 1260 */     this.gunModel['ĕ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 12, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/* 1261 */     this.gunModel['ĕ'].setRotationPoint(-87.0F, -8.75F, -2.0F);
/*      */     
/* 1263 */     this.gunModel['Ė'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 12, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1264 */     this.gunModel['Ė'].setRotationPoint(-88.0F, -9.25F, -2.0F);
/*      */     
/* 1266 */     this.gunModel['ė'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1267 */     this.gunModel['ė'].setRotationPoint(-91.5F, -8.75F, -1.0F);
/*      */     
/* 1269 */     this.gunModel['Ę'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 3, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1270 */     this.gunModel['Ę'].setRotationPoint(-90.25F, -7.5F, -1.5F);
/*      */     
/* 1272 */     this.gunModel['ę'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 11, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1273 */     this.gunModel['ę'].setRotationPoint(-90.25F, -8.25F, -1.5F);
/*      */     
/* 1275 */     this.gunModel['Ě'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1276 */     this.gunModel['Ě'].setRotationPoint(-90.25F, -4.75F, -1.5F);
/*      */     
/* 1278 */     this.gunModel['ě'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 1279 */     this.gunModel['ě'].setRotationPoint(-89.75F, -7.5F, 9.5F);
/*      */     
/* 1281 */     this.gunModel['Ĝ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 1282 */     this.gunModel['Ĝ'].setRotationPoint(-88.25F, -7.5F, 9.5F);
/*      */     
/* 1284 */     this.gunModel['ĝ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 1285 */     this.gunModel['ĝ'].setRotationPoint(-89.0F, -7.5F, 9.5F);
/*      */     
/* 1287 */     this.gunModel['Ğ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 1288 */     this.gunModel['Ğ'].setRotationPoint(-89.75F, -7.5F, -1.75F);
/*      */     
/* 1290 */     this.gunModel['ğ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 1291 */     this.gunModel['ğ'].setRotationPoint(-88.25F, -7.5F, -1.75F);
/*      */     
/* 1293 */     this.gunModel['Ġ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 1294 */     this.gunModel['Ġ'].setRotationPoint(-89.0F, -7.5F, -1.75F);
/*      */     
/* 1296 */     this.gunModel['ġ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1297 */     this.gunModel['ġ'].setRotationPoint(-101.0F, -3.75F, -1.0F);
/*      */     
/* 1299 */     this.gunModel['Ģ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, -1.0F);
/* 1300 */     this.gunModel['Ģ'].setRotationPoint(-101.0F, -1.75F, 0.0F);
/*      */     
/* 1302 */     this.gunModel['ģ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.gunModel['ģ'].setRotationPoint(-106.0F, -3.75F, -1.0F);
/*      */     
/* 1305 */     this.gunModel['Ĥ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1306 */     this.gunModel['Ĥ'].setRotationPoint(-106.0F, -1.75F, -1.0F);
/*      */     
/* 1308 */     this.gunModel['ĥ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 1309 */     this.gunModel['ĥ'].setRotationPoint(-106.0F, 2.25F, 1.0F);
/*      */     
/* 1311 */     this.gunModel['Ħ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.2F, -0.75F, 0.0F, -0.2F, -0.75F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 1312 */     this.gunModel['Ħ'].setRotationPoint(-106.0F, 4.25F, 1.0F);
/*      */     
/* 1314 */     this.gunModel['ħ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, -0.2F, -0.75F, 0.0F, -0.2F, -0.75F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1315 */     this.gunModel['ħ'].setRotationPoint(-106.0F, 5.25F, 1.0F);
/*      */     
/* 1317 */     this.gunModel['Ĩ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 6, 0.0F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.25F, 0.0F, -0.3F);
/* 1318 */     this.gunModel['Ĩ'].setRotationPoint(-104.0F, 6.25F, 1.0F);
/*      */     
/* 1320 */     this.gunModel['ĩ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 7, 6, 0.0F, 0.25F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.25F, 0.0F, -0.3F, 2.25F, 0.0F, -0.8F, -3.25F, 0.0F, -0.8F, -3.25F, 0.0F, -0.8F, 2.25F, 0.0F, -0.8F);
/* 1321 */     this.gunModel['ĩ'].setRotationPoint(-104.0F, 7.25F, 1.0F);
/*      */     
/* 1323 */     this.gunModel['Ī'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 4, 0.0F, 0.25F, 0.0F, 0.2F, -1.25F, 0.0F, 0.2F, -1.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.25F, 0.1F, -2.0F, 0.25F, 0.1F, -2.0F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F);
/* 1324 */     this.gunModel['Ī'].setRotationPoint(-106.0F, 14.25F, 2.0F);
/*      */     
/* 1326 */     this.gunModel['ī'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.1F, 0.0F, 0.5F, 0.0F);
/* 1327 */     this.gunModel['ī'].setRotationPoint(-110.0F, 15.5F, 2.0F);
/*      */     
/* 1329 */     this.gunModel['Ĭ'].addShapeBox(46.0F, -18.0F, -4.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.25F, -0.9F, -0.25F, 0.25F, -0.9F, -0.25F, 0.25F, -0.9F, 0.0F, 0.25F, -0.9F);
/* 1330 */     this.gunModel['Ĭ'].setRotationPoint(-110.0F, 14.25F, 1.0F);
/*      */     
/* 1332 */     this.gunModel['ĭ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.8F, 1.0F, 0.25F, -0.8F, 1.0F, 0.25F, -0.8F, 0.0F, 0.25F, -0.8F);
/* 1333 */     this.gunModel['ĭ'].setRotationPoint(-110.0F, 13.0F, 1.0F);
/*      */     
/* 1335 */     this.gunModel['Į'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, -0.65F, 0.5F, 0.0F, -0.65F, 0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1336 */     this.gunModel['Į'].setRotationPoint(-110.0F, 12.0F, 1.0F);
/*      */     
/* 1338 */     this.gunModel['į'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 6, 6, 0.0F, 0.0F, -0.25F, -0.25F, 2.5F, -0.25F, -0.25F, 2.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.65F, 0.5F, 0.0F, -0.65F, 0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1339 */     this.gunModel['į'].setRotationPoint(-110.0F, 6.0F, 1.0F);
/*      */     
/* 1341 */     this.gunModel['İ'].addShapeBox(46.0F, -18.0F, -4.0F, 4, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1342 */     this.gunModel['İ'].setRotationPoint(-110.0F, 2.25F, 1.0F);
/*      */     
/* 1344 */     this.gunModel['ı'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 15, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F);
/* 1345 */     this.gunModel['ı'].setRotationPoint(-111.0F, 2.25F, 1.0F);
/*      */     
/* 1347 */     this.gunModel['Ĳ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 4, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/* 1348 */     this.gunModel['Ĳ'].setRotationPoint(-111.0F, -1.75F, -1.0F);
/*      */     
/* 1350 */     this.gunModel['ĳ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 8, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1351 */     this.gunModel['ĳ'].setRotationPoint(-111.0F, -9.75F, -1.0F);
/*      */     
/* 1353 */     this.gunModel['Ĵ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 16, 10, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1354 */     this.gunModel['Ĵ'].setRotationPoint(-113.5F, -2.0F, -1.0F);
/*      */     
/* 1356 */     this.gunModel['ĵ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1357 */     this.gunModel['ĵ'].setRotationPoint(-113.5F, -9.75F, -1.0F);
/*      */     
/* 1359 */     this.gunModel['Ķ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1360 */     this.gunModel['Ķ'].setRotationPoint(-113.5F, 14.0F, -1.0F);
/*      */     
/* 1362 */     this.gunModel['ķ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1363 */     this.gunModel['ķ'].setRotationPoint(-113.5F, 16.0F, 0.0F);
/*      */     
/* 1365 */     this.gunModel['ĸ'].addShapeBox(46.0F, -18.0F, -4.0F, 40, 2, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1366 */     this.gunModel['ĸ'].setRotationPoint(-107.0F, -11.25F, 0.5F);
/*      */     
/* 1368 */     this.gunModel['Ĺ'].addShapeBox(46.0F, -18.0F, -4.0F, 7, 5, 10, 0.0F, 0.5F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1369 */     this.gunModel['Ĺ'].setRotationPoint(-113.0F, -14.75F, -1.0F);
/*      */     
/* 1371 */     this.gunModel['ĺ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1372 */     this.gunModel['ĺ'].setRotationPoint(-113.0F, -15.75F, 0.0F);
/*      */     
/* 1374 */     this.gunModel['Ļ'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1375 */     this.gunModel['Ļ'].setRotationPoint(-78.0F, -3.75F, -0.5F);
/*      */     
/* 1377 */     this.gunModel['ļ'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
/* 1378 */     this.gunModel['ļ'].setRotationPoint(-78.0F, -2.25F, 0.5F);
/*      */     
/* 1380 */     this.gunModel['Ľ'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 4, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.gunModel['Ľ'].setRotationPoint(-78.0F, -7.75F, -0.5F);
/*      */     
/* 1383 */     this.gunModel['ľ'].addShapeBox(46.0F, -18.0F, -4.0F, 10, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1384 */     this.gunModel['ľ'].setRotationPoint(-78.0F, -9.25F, -1.0F);
/*      */     
/* 1386 */     this.gunModel['Ŀ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1387 */     this.gunModel['Ŀ'].setRotationPoint(-78.0F, -8.25F, -1.0F);
/*      */     
/* 1389 */     this.gunModel['ŀ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1390 */     this.gunModel['ŀ'].setRotationPoint(-74.5F, -8.25F, -1.0F);
/*      */     
/* 1392 */     this.gunModel['Ł'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1393 */     this.gunModel['Ł'].setRotationPoint(-71.0F, -8.25F, -1.0F);
/*      */     
/* 1395 */     this.gunModel['ł'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1396 */     this.gunModel['ł'].setRotationPoint(-78.0F, -8.25F, 8.0F);
/*      */     
/* 1398 */     this.gunModel['Ń'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1399 */     this.gunModel['Ń'].setRotationPoint(-74.5F, -8.25F, 8.0F);
/*      */     
/* 1401 */     this.gunModel['ń'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1402 */     this.gunModel['ń'].setRotationPoint(-71.0F, -8.25F, 8.0F);
/*      */     
/* 1404 */     this.gunModel['Ņ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1405 */     this.gunModel['Ņ'].setRotationPoint(-75.5F, -8.25F, 8.0F);
/*      */     
/* 1407 */     this.gunModel['ņ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1408 */     this.gunModel['ņ'].setRotationPoint(-76.0F, -8.25F, 8.0F);
/*      */     
/* 1410 */     this.gunModel['Ň'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1411 */     this.gunModel['Ň'].setRotationPoint(-72.0F, -8.25F, 8.0F);
/*      */     
/* 1413 */     this.gunModel['ň'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1414 */     this.gunModel['ň'].setRotationPoint(-72.5F, -8.25F, 8.0F);
/*      */     
/* 1416 */     this.gunModel['ŉ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1417 */     this.gunModel['ŉ'].setRotationPoint(-69.0F, -8.25F, 8.0F);
/*      */     
/* 1419 */     this.gunModel['Ŋ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1420 */     this.gunModel['Ŋ'].setRotationPoint(-75.5F, -8.25F, -1.0F);
/*      */     
/* 1422 */     this.gunModel['ŋ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1423 */     this.gunModel['ŋ'].setRotationPoint(-76.0F, -8.25F, -1.0F);
/*      */     
/* 1425 */     this.gunModel['Ō'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1426 */     this.gunModel['Ō'].setRotationPoint(-72.0F, -8.25F, -1.0F);
/*      */     
/* 1428 */     this.gunModel['ō'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1429 */     this.gunModel['ō'].setRotationPoint(-72.5F, -8.25F, -1.0F);
/*      */     
/* 1431 */     this.gunModel['Ŏ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1432 */     this.gunModel['Ŏ'].setRotationPoint(-69.0F, -8.25F, -1.0F);
/*      */     
/* 1434 */     this.gunModel['ŏ'].addShapeBox(46.0F, -18.0F, -4.0F, 29, 1, 11, 0.0F, 0.75F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1435 */     this.gunModel['ŏ'].setRotationPoint(-98.0F, -10.75F, -1.5F);
/*      */     
/* 1437 */     this.gunModel['Ő'].addShapeBox(46.0F, -18.0F, -4.0F, 28, 3, 11, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 2.5F, -1.5F, 0.0F, 2.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1438 */     this.gunModel['Ő'].setRotationPoint(-98.0F, -14.25F, -1.5F);
/*      */     
/* 1440 */     this.gunModel['ő'].addShapeBox(46.0F, -18.0F, -4.0F, 28, 1, 8, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1441 */     this.gunModel['ő'].setRotationPoint(-98.0F, -16.25F, 0.0F);
/*      */     
/* 1443 */     this.gunModel['Œ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 11, 0.0F, 2.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 2.0F, 0.5F, -1.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1444 */     this.gunModel['Œ'].setRotationPoint(-99.0F, -14.25F, -1.5F);
/*      */     
/* 1446 */     this.gunModel['œ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 8, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1447 */     this.gunModel['œ'].setRotationPoint(-101.0F, -16.75F, 0.0F);
/*      */     
/* 1449 */     this.gunModel['Ŕ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1450 */     this.gunModel['Ŕ'].setRotationPoint(-62.0F, -14.75F, -2.0F);
/*      */     
/* 1452 */     this.gunModel['ŕ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 12, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1453 */     this.gunModel['ŕ'].setRotationPoint(-62.0F, -19.75F, -2.0F);
/*      */     
/* 1455 */     this.gunModel['Ŗ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 12, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1456 */     this.gunModel['Ŗ'].setRotationPoint(-64.25F, -18.75F, -2.0F);
/*      */     
/* 1458 */     this.gunModel['ŗ'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 4, 11, 0.0F, 0.0F, -0.75F, -1.05F, 0.0F, -0.75F, -1.05F, 0.0F, -0.75F, -1.05F, 0.0F, -0.75F, -1.05F, 0.0F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1459 */     this.gunModel['ŗ'].setRotationPoint(-70.0F, -15.75F, -1.5F);
/*      */     
/* 1461 */     this.gunModel['Ř'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 11, 0.0F, 0.0F, -0.75F, -1.25F, 0.5F, -0.75F, -1.25F, 0.5F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 0.5F, -1.05F, 0.0F, 0.5F, -1.05F, 0.0F, 0.5F, -1.05F, 0.0F, 0.5F, -1.05F);
/* 1462 */     this.gunModel['Ř'].setRotationPoint(-70.0F, -16.5F, -1.5F);
/*      */     
/* 1464 */     this.gunModel['ř'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1465 */     this.gunModel['ř'].setRotationPoint(-70.0F, -16.75F, -1.5F);
/*      */     
/* 1467 */     this.gunModel['Ś'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 8, 0.0F, 0.0F, 0.5F, -2.0F, 0.5F, 0.5F, -2.0F, 0.5F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1468 */     this.gunModel['Ś'].setRotationPoint(-70.0F, -17.75F, 0.0F);
/*      */     
/* 1470 */     this.gunModel['ś'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 12, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1471 */     this.gunModel['ś'].setRotationPoint(-64.25F, -14.75F, -2.0F);
/*      */     
/* 1473 */     this.gunModel['Ŝ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 6, 12, 0.0F, -0.25F, 1.0F, 0.0F, 0.5F, 6.0F, 0.0F, 0.5F, 6.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1474 */     this.gunModel['Ŝ'].setRotationPoint(-68.25F, -8.75F, -2.0F);
/*      */     
/* 1476 */     this.gunModel['ŝ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 12, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.25F, -1.2F, -0.5F, 0.25F, -1.2F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1477 */     this.gunModel['ŝ'].setRotationPoint(-64.75F, -15.75F, -2.0F);
/*      */     
/* 1479 */     this.gunModel['Ş'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 14, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F);
/* 1480 */     this.gunModel['Ş'].setRotationPoint(-63.25F, -14.75F, -1.0F);
/*      */     
/* 1482 */     this.gunModel['ş'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 10, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1483 */     this.gunModel['ş'].setRotationPoint(-63.25F, -18.75F, -1.0F);
/*      */     
/* 1485 */     this.gunModel['Š'].addShapeBox(46.0F, -18.0F, -4.0F, 5, 2, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 1486 */     this.gunModel['Š'].setRotationPoint(-67.25F, -2.75F, -2.0F);
/*      */     
/* 1488 */     this.gunModel['š'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 12, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 1489 */     this.gunModel['š'].setRotationPoint(-61.5F, -2.75F, -2.0F);
/*      */     
/* 1491 */     this.gunModel['Ţ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1492 */     this.gunModel['Ţ'].setRotationPoint(-44.25F, -2.5F, -1.5F);
/*      */     
/* 1494 */     this.gunModel['ţ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 11, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1495 */     this.gunModel['ţ'].setRotationPoint(-45.25F, -2.5F, -1.5F);
/*      */     
/* 1497 */     this.gunModel['Ť'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1498 */     this.gunModel['Ť'].setRotationPoint(-43.25F, -2.5F, -1.5F);
/*      */     
/* 1500 */     this.gunModel['ť'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1501 */     this.gunModel['ť'].setRotationPoint(-47.25F, -1.5F, -1.5F);
/*      */     
/* 1503 */     this.gunModel['Ŧ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 11, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 1504 */     this.gunModel['Ŧ'].setRotationPoint(-34.25F, -4.0F, -1.5F);
/*      */     
/* 1506 */     this.gunModel['ŧ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 11, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 1507 */     this.gunModel['ŧ'].setRotationPoint(-34.25F, 1.5F, -1.5F);
/*      */     
/* 1509 */     this.gunModel['Ũ'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1510 */     this.gunModel['Ũ'].setRotationPoint(-32.25F, 1.5F, -1.5F);
/*      */     
/* 1512 */     this.gunModel['ũ'].addShapeBox(46.0F, -18.0F, -4.0F, 6, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1513 */     this.gunModel['ũ'].setRotationPoint(-32.25F, -4.0F, -1.5F);
/*      */     
/* 1515 */     this.gunModel['Ū'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1516 */     this.gunModel['Ū'].setRotationPoint(-25.75F, -4.0F, -1.5F);
/*      */     
/* 1518 */     this.gunModel['ū'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1519 */     this.gunModel['ū'].setRotationPoint(-25.75F, 1.5F, -1.5F);
/*      */     
/* 1521 */     this.gunModel['Ŭ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 5, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1522 */     this.gunModel['Ŭ'].setRotationPoint(-25.75F, -3.5F, -1.5F);
/*      */     
/* 1524 */     this.gunModel['ŭ'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1525 */     this.gunModel['ŭ'].setRotationPoint(-29.25F, -2.5F, -1.5F);
/*      */     
/* 1527 */     this.gunModel['Ů'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 11, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1528 */     this.gunModel['Ů'].setRotationPoint(-29.25F, 0.0F, -1.5F);
/*      */     
/* 1530 */     this.gunModel['ů'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1531 */     this.gunModel['ů'].setRotationPoint(-29.5F, -1.0F, -1.5F);
/*      */     
/* 1533 */     this.gunModel['Ű'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 12, 0.0F, 0.0F, 0.5F, -0.6F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
/* 1534 */     this.gunModel['Ű'].setRotationPoint(-29.25F, -1.5F, -2.25F);
/*      */     
/* 1536 */     this.gunModel['ű'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 12, 0.0F, 0.0F, 0.5F, -0.6F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
/* 1537 */     this.gunModel['ű'].setRotationPoint(-27.25F, -1.5F, -2.25F);
/*      */     
/* 1539 */     this.gunModel['Ų'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 12, 0.0F, 0.0F, 0.5F, -0.6F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
/* 1540 */     this.gunModel['Ų'].setRotationPoint(-28.25F, -1.5F, -2.25F);
/*      */     
/* 1542 */     this.gunModel['ų'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 1543 */     this.gunModel['ų'].setRotationPoint(27.0F, -7.5F, -3.1F);
/*      */     
/* 1545 */     this.gunModel['Ŵ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.65F);
/* 1546 */     this.gunModel['Ŵ'].setRotationPoint(35.0F, -7.5F, -3.1F);
/*      */     
/* 1548 */     this.gunModel['ŵ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.35F, -1.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 1549 */     this.gunModel['ŵ'].setRotationPoint(13.0F, -7.5F, -3.1F);
/*      */     
/* 1551 */     this.gunModel['Ŷ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.65F, -1.0F, -0.5F, -0.65F);
/* 1552 */     this.gunModel['Ŷ'].setRotationPoint(21.0F, -7.5F, -3.1F);
/*      */     
/* 1554 */     this.gunModel['ŷ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.85F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1555 */     this.gunModel['ŷ'].setRotationPoint(49.0F, -7.0F, -2.5F);
/*      */     
/* 1557 */     this.gunModel['Ÿ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1558 */     this.gunModel['Ÿ'].setRotationPoint(41.0F, -7.0F, -2.5F);
/*      */     
/* 1560 */     this.gunModel['Ź'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.85F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1561 */     this.gunModel['Ź'].setRotationPoint(35.0F, -7.0F, -2.5F);
/*      */     
/* 1563 */     this.gunModel['ź'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1564 */     this.gunModel['ź'].setRotationPoint(27.0F, -7.0F, -2.5F);
/*      */     
/* 1566 */     this.gunModel['Ż'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.85F, -1.0F, -0.5F, -0.85F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1567 */     this.gunModel['Ż'].setRotationPoint(21.0F, -7.0F, -2.5F);
/*      */     
/* 1569 */     this.gunModel['ż'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1570 */     this.gunModel['ż'].setRotationPoint(13.0F, -7.0F, -2.5F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 1575 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 505, 233, this.textureX, this.textureY);
/* 1576 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 89, 241, this.textureX, this.textureY);
/* 1577 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 97, 241, this.textureX, this.textureY);
/* 1578 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 177, 241, this.textureX, this.textureY);
/* 1579 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 193, 249, this.textureX, this.textureY);
/* 1580 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 217, 249, this.textureX, this.textureY);
/* 1581 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 401, 241, this.textureX, this.textureY);
/* 1582 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 241, 249, this.textureX, this.textureY);
/* 1583 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 265, 249, this.textureX, this.textureY);
/* 1584 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 409, 241, this.textureX, this.textureY);
/* 1585 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 137, 185, this.textureX, this.textureY);
/* 1586 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 345, 249, this.textureX, this.textureY);
/* 1587 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 353, 249, this.textureX, this.textureY);
/* 1588 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 377, 249, this.textureX, this.textureY);
/* 1589 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 385, 249, this.textureX, this.textureY);
/* 1590 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 401, 249, this.textureX, this.textureY);
/* 1591 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 417, 249, this.textureX, this.textureY);
/* 1592 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 433, 241, this.textureX, this.textureY);
/* 1593 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 433, 249, this.textureX, this.textureY);
/* 1594 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 449, 249, this.textureX, this.textureY);
/* 1595 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 457, 249, this.textureX, this.textureY);
/* 1596 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 289, 201, this.textureX, this.textureY);
/* 1597 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 1598 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 145, 193, this.textureX, this.textureY);
/* 1599 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/* 1600 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 497, 249, this.textureX, this.textureY);
/* 1601 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 65, 113, this.textureX, this.textureY);
/* 1602 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 153, 257, this.textureX, this.textureY);
/* 1603 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 193, 265, this.textureX, this.textureY);
/* 1604 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 201, 217, this.textureX, this.textureY);
/* 1605 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 217, 225, this.textureX, this.textureY);
/* 1606 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 89, 257, this.textureX, this.textureY);
/* 1607 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 257, 225, this.textureX, this.textureY);
/* 1608 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 289, 257, this.textureX, this.textureY);
/* 1609 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 505, 249, this.textureX, this.textureY);
/* 1610 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 329, 265, this.textureX, this.textureY);
/* 1611 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/* 1612 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 505, 257, this.textureX, this.textureY);
/* 1613 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 129, 265, this.textureX, this.textureY);
/* 1614 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 137, 281, this.textureX, this.textureY);
/* 1615 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 393, 273, this.textureX, this.textureY);
/* 1616 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 177, 281, this.textureX, this.textureY);
/* 1617 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 209, 281, this.textureX, this.textureY);
/* 1618 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 409, 281, this.textureX, this.textureY);
/* 1619 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 25, 289, this.textureX, this.textureY);
/* 1620 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 65, 289, this.textureX, this.textureY);
/* 1621 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 161, 265, this.textureX, this.textureY);
/* 1622 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 265, 265, this.textureX, this.textureY);
/* 1623 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 265, 289, this.textureX, this.textureY);
/* 1624 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 297, 289, this.textureX, this.textureY);
/* 1625 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 465, 193, this.textureX, this.textureY);
/* 1626 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 361, 233, this.textureX, this.textureY);
/* 1627 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 433, 233, this.textureX, this.textureY);
/* 1628 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 465, 233, this.textureX, this.textureY);
/* 1629 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 329, 289, this.textureX, this.textureY);
/* 1630 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 361, 289, this.textureX, this.textureY);
/* 1631 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 433, 289, this.textureX, this.textureY);
/* 1632 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 497, 289, this.textureX, this.textureY);
/* 1633 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 473, 289, this.textureX, this.textureY);
/* 1634 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 57, 241, this.textureX, this.textureY);
/* 1635 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 121, 241, this.textureX, this.textureY);
/* 1636 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 481, 241, this.textureX, this.textureY);
/* 1637 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 505, 241, this.textureX, this.textureY);
/* 1638 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 57, 249, this.textureX, this.textureY);
/* 1639 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 65, 249, this.textureX, this.textureY);
/* 1640 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 89, 249, this.textureX, this.textureY);
/* 1641 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 105, 297, this.textureX, this.textureY);
/* 1642 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/* 1643 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 201, 249, this.textureX, this.textureY);
/* 1644 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 225, 249, this.textureX, this.textureY);
/* 1645 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 249, 249, this.textureX, this.textureY);
/* 1646 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 273, 249, this.textureX, this.textureY);
/* 1647 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 233, 265, this.textureX, this.textureY);
/* 1648 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 249, 265, this.textureX, this.textureY);
/* 1649 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 257, 265, this.textureX, this.textureY);
/* 1650 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 329, 265, this.textureX, this.textureY);
/* 1651 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 345, 265, this.textureX, this.textureY);
/* 1652 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 425, 265, this.textureX, this.textureY);
/* 1653 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 449, 265, this.textureX, this.textureY);
/* 1654 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 505, 265, this.textureX, this.textureY);
/* 1655 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 1656 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 73, 273, this.textureX, this.textureY);
/* 1657 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 113, 273, this.textureX, this.textureY);
/* 1658 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 305, 273, this.textureX, this.textureY);
/* 1659 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 393, 273, this.textureX, this.textureY);
/* 1660 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 449, 273, this.textureX, this.textureY);
/* 1661 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 473, 273, this.textureX, this.textureY);
/* 1662 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 113, 281, this.textureX, this.textureY);
/* 1663 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 137, 281, this.textureX, this.textureY);
/* 1664 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/* 1665 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 153, 281, this.textureX, this.textureY);
/* 1666 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 1, 289, this.textureX, this.textureY);
/* 1667 */     this.defaultScopeModel[92] = new ModelRendererTurbo(this, 233, 281, this.textureX, this.textureY);
/* 1668 */     this.defaultScopeModel[93] = new ModelRendererTurbo(this, 41, 289, this.textureX, this.textureY);
/* 1669 */     this.defaultScopeModel[94] = new ModelRendererTurbo(this, 393, 281, this.textureX, this.textureY);
/* 1670 */     this.defaultScopeModel[95] = new ModelRendererTurbo(this, 49, 305, this.textureX, this.textureY);
/* 1671 */     this.defaultScopeModel[96] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/* 1672 */     this.defaultScopeModel[97] = new ModelRendererTurbo(this, 177, 289, this.textureX, this.textureY);
/* 1673 */     this.defaultScopeModel[98] = new ModelRendererTurbo(this, 185, 289, this.textureX, this.textureY);
/* 1674 */     this.defaultScopeModel[99] = new ModelRendererTurbo(this, 209, 289, this.textureX, this.textureY);
/* 1675 */     this.defaultScopeModel[100] = new ModelRendererTurbo(this, 249, 289, this.textureX, this.textureY);
/* 1676 */     this.defaultScopeModel[101] = new ModelRendererTurbo(this, 281, 289, this.textureX, this.textureY);
/* 1677 */     this.defaultScopeModel[102] = new ModelRendererTurbo(this, 313, 289, this.textureX, this.textureY);
/* 1678 */     this.defaultScopeModel[103] = new ModelRendererTurbo(this, 345, 289, this.textureX, this.textureY);
/* 1679 */     this.defaultScopeModel[104] = new ModelRendererTurbo(this, 377, 289, this.textureX, this.textureY);
/* 1680 */     this.defaultScopeModel[105] = new ModelRendererTurbo(this, 449, 289, this.textureX, this.textureY);
/* 1681 */     this.defaultScopeModel[106] = new ModelRendererTurbo(this, 489, 289, this.textureX, this.textureY);
/* 1682 */     this.defaultScopeModel[107] = new ModelRendererTurbo(this, 121, 297, this.textureX, this.textureY);
/* 1683 */     this.defaultScopeModel[108] = new ModelRendererTurbo(this, 137, 297, this.textureX, this.textureY);
/* 1684 */     this.defaultScopeModel[109] = new ModelRendererTurbo(this, 145, 297, this.textureX, this.textureY);
/* 1685 */     this.defaultScopeModel[110] = new ModelRendererTurbo(this, 17, 305, this.textureX, this.textureY);
/* 1686 */     this.defaultScopeModel[111] = new ModelRendererTurbo(this, 65, 305, this.textureX, this.textureY);
/* 1687 */     this.defaultScopeModel[112] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/* 1688 */     this.defaultScopeModel[113] = new ModelRendererTurbo(this, 73, 305, this.textureX, this.textureY);
/* 1689 */     this.defaultScopeModel[114] = new ModelRendererTurbo(this, 81, 305, this.textureX, this.textureY);
/* 1690 */     this.defaultScopeModel[115] = new ModelRendererTurbo(this, 25, 297, this.textureX, this.textureY);
/* 1691 */     this.defaultScopeModel[116] = new ModelRendererTurbo(this, 297, 225, this.textureX, this.textureY);
/* 1692 */     this.defaultScopeModel[117] = new ModelRendererTurbo(this, 185, 305, this.textureX, this.textureY);
/* 1693 */     this.defaultScopeModel[118] = new ModelRendererTurbo(this, 193, 305, this.textureX, this.textureY);
/* 1694 */     this.defaultScopeModel[119] = new ModelRendererTurbo(this, 201, 305, this.textureX, this.textureY);
/* 1695 */     this.defaultScopeModel[120] = new ModelRendererTurbo(this, 209, 305, this.textureX, this.textureY);
/* 1696 */     this.defaultScopeModel[121] = new ModelRendererTurbo(this, 361, 305, this.textureX, this.textureY);
/* 1697 */     this.defaultScopeModel[122] = new ModelRendererTurbo(this, 369, 305, this.textureX, this.textureY);
/* 1698 */     this.defaultScopeModel[123] = new ModelRendererTurbo(this, 41, 297, this.textureX, this.textureY);
/* 1699 */     this.defaultScopeModel[124] = new ModelRendererTurbo(this, 377, 305, this.textureX, this.textureY);
/* 1700 */     this.defaultScopeModel[125] = new ModelRendererTurbo(this, 385, 305, this.textureX, this.textureY);
/* 1701 */     this.defaultScopeModel[126] = new ModelRendererTurbo(this, 65, 297, this.textureX, this.textureY);
/* 1702 */     this.defaultScopeModel[127] = new ModelRendererTurbo(this, 337, 225, this.textureX, this.textureY);
/* 1703 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/* 1704 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 177, 281, this.textureX, this.textureY);
/* 1705 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 209, 281, this.textureX, this.textureY);
/* 1706 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 393, 305, this.textureX, this.textureY);
/* 1707 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 249, 137, this.textureX, this.textureY);
/* 1708 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 265, 305, this.textureX, this.textureY);
/* 1709 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 281, 305, this.textureX, this.textureY);
/* 1710 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 401, 305, this.textureX, this.textureY);
/* 1711 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 417, 305, this.textureX, this.textureY);
/* 1712 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 433, 305, this.textureX, this.textureY);
/* 1713 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 449, 305, this.textureX, this.textureY);
/* 1714 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 465, 305, this.textureX, this.textureY);
/* 1715 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 1, 313, this.textureX, this.textureY);
/* 1716 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 505, 305, this.textureX, this.textureY);
/* 1717 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 25, 313, this.textureX, this.textureY);
/* 1718 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 33, 313, this.textureX, this.textureY);
/* 1719 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 33, 313, this.textureX, this.textureY);
/* 1720 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 57, 313, this.textureX, this.textureY);
/* 1721 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 73, 313, this.textureX, this.textureY);
/* 1722 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 113, 313, this.textureX, this.textureY);
/* 1723 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 129, 313, this.textureX, this.textureY);
/* 1724 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 145, 313, this.textureX, this.textureY);
/* 1725 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 161, 313, this.textureX, this.textureY);
/* 1726 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 297, 305, this.textureX, this.textureY);
/* 1727 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 313, 305, this.textureX, this.textureY);
/* 1728 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 177, 313, this.textureX, this.textureY);
/* 1729 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 193, 313, this.textureX, this.textureY);
/* 1730 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 409, 281, this.textureX, this.textureY);
/* 1731 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 473, 281, this.textureX, this.textureY);
/* 1732 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 25, 289, this.textureX, this.textureY);
/* 1733 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 65, 289, this.textureX, this.textureY);
/* 1734 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 209, 313, this.textureX, this.textureY);
/* 1735 */     this.defaultScopeModel[' '] = new ModelRendererTurbo(this, 225, 313, this.textureX, this.textureY);
/* 1736 */     this.defaultScopeModel['¡'] = new ModelRendererTurbo(this, 241, 313, this.textureX, this.textureY);
/* 1737 */     this.defaultScopeModel['¢'] = new ModelRendererTurbo(this, 257, 313, this.textureX, this.textureY);
/* 1738 */     this.defaultScopeModel['£'] = new ModelRendererTurbo(this, 273, 313, this.textureX, this.textureY);
/* 1739 */     this.defaultScopeModel['¤'] = new ModelRendererTurbo(this, 265, 289, this.textureX, this.textureY);
/* 1740 */     this.defaultScopeModel['¥'] = new ModelRendererTurbo(this, 297, 289, this.textureX, this.textureY);
/* 1741 */     this.defaultScopeModel['¦'] = new ModelRendererTurbo(this, 329, 289, this.textureX, this.textureY);
/* 1742 */     this.defaultScopeModel['§'] = new ModelRendererTurbo(this, 361, 289, this.textureX, this.textureY);
/* 1743 */     this.defaultScopeModel['¨'] = new ModelRendererTurbo(this, 433, 289, this.textureX, this.textureY);
/* 1744 */     this.defaultScopeModel['©'] = new ModelRendererTurbo(this, 473, 289, this.textureX, this.textureY);
/* 1745 */     this.defaultScopeModel['ª'] = new ModelRendererTurbo(this, 497, 289, this.textureX, this.textureY);
/* 1746 */     this.defaultScopeModel['«'] = new ModelRendererTurbo(this, 289, 313, this.textureX, this.textureY);
/* 1747 */     this.defaultScopeModel['¬'] = new ModelRendererTurbo(this, 313, 313, this.textureX, this.textureY);
/* 1748 */     this.defaultScopeModel['­'] = new ModelRendererTurbo(this, 73, 297, this.textureX, this.textureY);
/* 1749 */     this.defaultScopeModel['®'] = new ModelRendererTurbo(this, 89, 297, this.textureX, this.textureY);
/* 1750 */     this.defaultScopeModel['¯'] = new ModelRendererTurbo(this, 105, 297, this.textureX, this.textureY);
/* 1751 */     this.defaultScopeModel['°'] = new ModelRendererTurbo(this, 249, 297, this.textureX, this.textureY);
/* 1752 */     this.defaultScopeModel['±'] = new ModelRendererTurbo(this, 265, 297, this.textureX, this.textureY);
/* 1753 */     this.defaultScopeModel['²'] = new ModelRendererTurbo(this, 281, 297, this.textureX, this.textureY);
/* 1754 */     this.defaultScopeModel['³'] = new ModelRendererTurbo(this, 297, 297, this.textureX, this.textureY);
/* 1755 */     this.defaultScopeModel['´'] = new ModelRendererTurbo(this, 313, 297, this.textureX, this.textureY);
/* 1756 */     this.defaultScopeModel['µ'] = new ModelRendererTurbo(this, 329, 297, this.textureX, this.textureY);
/* 1757 */     this.defaultScopeModel['¶'] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/* 1758 */     this.defaultScopeModel['·'] = new ModelRendererTurbo(this, 345, 297, this.textureX, this.textureY);
/* 1759 */     this.defaultScopeModel['¸'] = new ModelRendererTurbo(this, 321, 305, this.textureX, this.textureY);
/* 1760 */     this.defaultScopeModel['¹'] = new ModelRendererTurbo(this, 377, 297, this.textureX, this.textureY);
/* 1761 */     this.defaultScopeModel['º'] = new ModelRendererTurbo(this, 393, 297, this.textureX, this.textureY);
/* 1762 */     this.defaultScopeModel['»'] = new ModelRendererTurbo(this, 401, 297, this.textureX, this.textureY);
/* 1763 */     this.defaultScopeModel['¼'] = new ModelRendererTurbo(this, 409, 297, this.textureX, this.textureY);
/* 1764 */     this.defaultScopeModel['½'] = new ModelRendererTurbo(this, 449, 297, this.textureX, this.textureY);
/* 1765 */     this.defaultScopeModel['¾'] = new ModelRendererTurbo(this, 473, 297, this.textureX, this.textureY);
/* 1766 */     this.defaultScopeModel['¿'] = new ModelRendererTurbo(this, 329, 305, this.textureX, this.textureY);
/* 1767 */     this.defaultScopeModel['À'] = new ModelRendererTurbo(this, 345, 305, this.textureX, this.textureY);
/* 1768 */     this.defaultScopeModel['Á'] = new ModelRendererTurbo(this, 353, 305, this.textureX, this.textureY);
/* 1769 */     this.defaultScopeModel['Â'] = new ModelRendererTurbo(this, 25, 305, this.textureX, this.textureY);
/* 1770 */     this.defaultScopeModel['Ã'] = new ModelRendererTurbo(this, 41, 305, this.textureX, this.textureY);
/* 1771 */     this.defaultScopeModel['Ä'] = new ModelRendererTurbo(this, 49, 313, this.textureX, this.textureY);
/* 1772 */     this.defaultScopeModel['Å'] = new ModelRendererTurbo(this, 89, 305, this.textureX, this.textureY);
/* 1773 */     this.defaultScopeModel['Æ'] = new ModelRendererTurbo(this, 305, 313, this.textureX, this.textureY);
/* 1774 */     this.defaultScopeModel['Ç'] = new ModelRendererTurbo(this, 121, 305, this.textureX, this.textureY);
/* 1775 */     this.defaultScopeModel['È'] = new ModelRendererTurbo(this, 337, 313, this.textureX, this.textureY);
/* 1776 */     this.defaultScopeModel['É'] = new ModelRendererTurbo(this, 49, 305, this.textureX, this.textureY);
/* 1777 */     this.defaultScopeModel['Ê'] = new ModelRendererTurbo(this, 137, 305, this.textureX, this.textureY);
/* 1778 */     this.defaultScopeModel['Ë'] = new ModelRendererTurbo(this, 145, 305, this.textureX, this.textureY);
/* 1779 */     this.defaultScopeModel['Ì'] = new ModelRendererTurbo(this, 249, 305, this.textureX, this.textureY);
/* 1780 */     this.defaultScopeModel['Í'] = new ModelRendererTurbo(this, 257, 305, this.textureX, this.textureY);
/* 1781 */     this.defaultScopeModel['Î'] = new ModelRendererTurbo(this, 409, 305, this.textureX, this.textureY);
/* 1782 */     this.defaultScopeModel['Ï'] = new ModelRendererTurbo(this, 441, 305, this.textureX, this.textureY);
/* 1783 */     this.defaultScopeModel['Ð'] = new ModelRendererTurbo(this, 473, 305, this.textureX, this.textureY);
/* 1784 */     this.defaultScopeModel['Ñ'] = new ModelRendererTurbo(this, 497, 305, this.textureX, this.textureY);
/* 1785 */     this.defaultScopeModel['Ò'] = new ModelRendererTurbo(this, 1, 313, this.textureX, this.textureY);
/* 1786 */     this.defaultScopeModel['Ó'] = new ModelRendererTurbo(this, 17, 313, this.textureX, this.textureY);
/* 1787 */     this.defaultScopeModel['Ô'] = new ModelRendererTurbo(this, 73, 313, this.textureX, this.textureY);
/* 1788 */     this.defaultScopeModel['Õ'] = new ModelRendererTurbo(this, 113, 313, this.textureX, this.textureY);
/* 1789 */     this.defaultScopeModel['Ö'] = new ModelRendererTurbo(this, 129, 313, this.textureX, this.textureY);
/* 1790 */     this.defaultScopeModel['×'] = new ModelRendererTurbo(this, 145, 313, this.textureX, this.textureY);
/* 1791 */     this.defaultScopeModel['Ø'] = new ModelRendererTurbo(this, 161, 313, this.textureX, this.textureY);
/*      */     
/* 1793 */     this.defaultScopeModel[0].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1794 */     this.defaultScopeModel[0].setRotationPoint(-52.5F, -23.0F, 0.0F);
/*      */     
/* 1796 */     this.defaultScopeModel[1].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1797 */     this.defaultScopeModel[1].setRotationPoint(-53.0F, -23.0F, 0.0F);
/*      */     
/* 1799 */     this.defaultScopeModel[2].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1800 */     this.defaultScopeModel[2].setRotationPoint(-52.0F, -23.0F, 0.0F);
/*      */     
/* 1802 */     this.defaultScopeModel[3].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 1803 */     this.defaultScopeModel[3].setRotationPoint(-52.0F, -22.0F, 0.0F);
/*      */     
/* 1805 */     this.defaultScopeModel[4].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1806 */     this.defaultScopeModel[4].setRotationPoint(-52.0F, -24.0F, 0.0F);
/*      */     
/* 1808 */     this.defaultScopeModel[5].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 1809 */     this.defaultScopeModel[5].setRotationPoint(-51.0F, -23.5F, 0.0F);
/*      */     
/* 1811 */     this.defaultScopeModel[6].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 1812 */     this.defaultScopeModel[6].setRotationPoint(-51.75F, -22.5F, 0.0F);
/*      */     
/* 1814 */     this.defaultScopeModel[7].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.75F, -1.25F, -0.5F, -0.75F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 1815 */     this.defaultScopeModel[7].setRotationPoint(-50.5F, -23.0F, 0.0F);
/*      */     
/* 1817 */     this.defaultScopeModel[8].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, 0.5F, -1.25F, -0.5F, 0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 1818 */     this.defaultScopeModel[8].setRotationPoint(-50.5F, -24.5F, 0.0F);
/*      */     
/* 1820 */     this.defaultScopeModel[9].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1821 */     this.defaultScopeModel[9].setRotationPoint(-50.5F, -23.0F, 0.0F);
/*      */     
/* 1823 */     this.defaultScopeModel[10].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1824 */     this.defaultScopeModel[10].setRotationPoint(-52.5F, -22.5F, -0.5F);
/*      */     
/* 1826 */     this.defaultScopeModel[11].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 1827 */     this.defaultScopeModel[11].setRotationPoint(-52.5F, -23.0F, 6.0F);
/*      */     
/* 1829 */     this.defaultScopeModel[12].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F);
/* 1830 */     this.defaultScopeModel[12].setRotationPoint(-53.0F, -23.0F, 6.0F);
/*      */     
/* 1832 */     this.defaultScopeModel[13].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 1833 */     this.defaultScopeModel[13].setRotationPoint(-52.0F, -23.0F, 6.0F);
/*      */     
/* 1835 */     this.defaultScopeModel[14].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 1836 */     this.defaultScopeModel[14].setRotationPoint(-52.0F, -22.0F, 6.0F);
/*      */     
/* 1838 */     this.defaultScopeModel[15].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F);
/* 1839 */     this.defaultScopeModel[15].setRotationPoint(-52.0F, -24.0F, 6.0F);
/*      */     
/* 1841 */     this.defaultScopeModel[16].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 1842 */     this.defaultScopeModel[16].setRotationPoint(-51.0F, -23.5F, 6.0F);
/*      */     
/* 1844 */     this.defaultScopeModel[17].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F);
/* 1845 */     this.defaultScopeModel[17].setRotationPoint(-51.75F, -22.5F, 6.0F);
/*      */     
/* 1847 */     this.defaultScopeModel[18].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 1848 */     this.defaultScopeModel[18].setRotationPoint(-50.5F, -23.0F, 6.0F);
/*      */     
/* 1850 */     this.defaultScopeModel[19].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 1851 */     this.defaultScopeModel[19].setRotationPoint(-50.5F, -24.5F, 6.0F);
/*      */     
/* 1853 */     this.defaultScopeModel[20].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 1854 */     this.defaultScopeModel[20].setRotationPoint(-50.5F, -23.0F, 6.0F);
/*      */     
/* 1856 */     this.defaultScopeModel[21].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F);
/* 1857 */     this.defaultScopeModel[21].setRotationPoint(-52.5F, -22.5F, 5.5F);
/*      */     
/* 1859 */     this.defaultScopeModel[22].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 4, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 1860 */     this.defaultScopeModel[22].setRotationPoint(-50.5F, -24.5F, 2.0F);
/*      */     
/* 1862 */     this.defaultScopeModel[23].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F);
/* 1863 */     this.defaultScopeModel[23].setRotationPoint(-50.5F, -23.0F, 2.0F);
/*      */     
/* 1865 */     this.defaultScopeModel[24].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1866 */     this.defaultScopeModel[24].setRotationPoint(-50.5F, -23.0F, 5.0F);
/*      */     
/* 1868 */     this.defaultScopeModel[25].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, -0.35F, 0.0F, -1.25F, -0.35F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F);
/* 1869 */     this.defaultScopeModel[25].setRotationPoint(-51.5F, -24.75F, 5.5F);
/*      */     
/* 1871 */     this.defaultScopeModel[26].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 4, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 1872 */     this.defaultScopeModel[26].setRotationPoint(-51.0F, -23.5F, 2.0F);
/*      */     
/* 1874 */     this.defaultScopeModel[27].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F);
/* 1875 */     this.defaultScopeModel[27].setRotationPoint(-53.5F, -23.0F, 5.5F);
/*      */     
/* 1877 */     this.defaultScopeModel[28].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1878 */     this.defaultScopeModel[28].setRotationPoint(-53.5F, -23.0F, 0.5F);
/*      */     
/* 1880 */     this.defaultScopeModel[29].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 3, 0.0F, 0.0F, -1.25F, -0.15F, -1.0F, -1.25F, -0.15F, -1.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F);
/* 1881 */     this.defaultScopeModel[29].setRotationPoint(-51.5F, -24.75F, 2.5F);
/*      */     
/* 1883 */     this.defaultScopeModel[30].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F);
/* 1884 */     this.defaultScopeModel[30].setRotationPoint(-51.5F, -23.0F, 2.5F);
/*      */     
/* 1886 */     this.defaultScopeModel[31].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.35F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.5F);
/* 1887 */     this.defaultScopeModel[31].setRotationPoint(-53.5F, -24.75F, 5.5F);
/*      */     
/* 1889 */     this.defaultScopeModel[32].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1890 */     this.defaultScopeModel[32].setRotationPoint(-53.5F, -24.75F, 2.5F);
/*      */     
/* 1892 */     this.defaultScopeModel[33].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, -0.35F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1893 */     this.defaultScopeModel[33].setRotationPoint(-53.5F, -24.75F, 0.5F);
/*      */     
/* 1895 */     this.defaultScopeModel[34].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, -1.25F, -0.35F, -1.0F, -1.25F, -0.35F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1896 */     this.defaultScopeModel[34].setRotationPoint(-51.5F, -24.75F, 0.5F);
/*      */     
/* 1898 */     this.defaultScopeModel[35].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 5, 0.0F, -0.75F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1899 */     this.defaultScopeModel[35].setRotationPoint(-55.75F, -22.5F, 1.5F);
/*      */     
/* 1901 */     this.defaultScopeModel[36].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F);
/* 1902 */     this.defaultScopeModel[36].setRotationPoint(-54.5F, -24.75F, 5.5F);
/*      */     
/* 1904 */     this.defaultScopeModel[37].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.5F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F);
/* 1905 */     this.defaultScopeModel[37].setRotationPoint(-54.5F, -24.75F, 0.5F);
/*      */     
/* 1907 */     this.defaultScopeModel[38].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F);
/* 1908 */     this.defaultScopeModel[38].setRotationPoint(-54.5F, -24.75F, 3.0F);
/*      */     
/* 1910 */     this.defaultScopeModel[39].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 7, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F);
/* 1911 */     this.defaultScopeModel[39].setRotationPoint(-55.5F, -23.0F, 0.5F);
/*      */     
/* 1913 */     this.defaultScopeModel[40].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F);
/* 1914 */     this.defaultScopeModel[40].setRotationPoint(-54.5F, -22.75F, 1.0F);
/*      */     
/* 1916 */     this.defaultScopeModel[41].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1917 */     this.defaultScopeModel[41].setRotationPoint(-55.0F, -22.5F, 1.0F);
/*      */     
/* 1919 */     this.defaultScopeModel[42].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1920 */     this.defaultScopeModel[42].setRotationPoint(-55.25F, -21.75F, 1.0F);
/*      */     
/* 1922 */     this.defaultScopeModel[43].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1923 */     this.defaultScopeModel[43].setRotationPoint(-55.75F, -21.75F, 1.0F);
/*      */     
/* 1925 */     this.defaultScopeModel[44].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 1926 */     this.defaultScopeModel[44].setRotationPoint(-55.75F, -22.0F, 1.0F);
/*      */     
/* 1928 */     this.defaultScopeModel[45].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.25F, 0.5F, 0.5F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F);
/* 1929 */     this.defaultScopeModel[45].setRotationPoint(-55.5F, -22.0F, 1.0F);
/*      */     
/* 1931 */     this.defaultScopeModel[46].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 1932 */     this.defaultScopeModel[46].setRotationPoint(-54.25F, -22.5F, 5.5F);
/*      */     
/* 1934 */     this.defaultScopeModel[47].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1935 */     this.defaultScopeModel[47].setRotationPoint(-54.25F, -22.5F, 0.5F);
/*      */     
/* 1937 */     this.defaultScopeModel[48].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F);
/* 1938 */     this.defaultScopeModel[48].setRotationPoint(-56.5F, -22.0F, 1.0F);
/*      */     
/* 1940 */     this.defaultScopeModel[49].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1941 */     this.defaultScopeModel[49].setRotationPoint(-57.0F, -22.5F, 1.0F);
/*      */     
/* 1943 */     this.defaultScopeModel[50].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1944 */     this.defaultScopeModel[50].setRotationPoint(-56.25F, -22.0F, -0.75F);
/*      */     
/* 1946 */     this.defaultScopeModel[51].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1947 */     this.defaultScopeModel[51].setRotationPoint(-56.25F, -22.0F, -0.5F);
/*      */     
/* 1949 */     this.defaultScopeModel[52].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F);
/* 1950 */     this.defaultScopeModel[52].setRotationPoint(-56.25F, -22.0F, 7.5F);
/*      */     
/* 1952 */     this.defaultScopeModel[53].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1953 */     this.defaultScopeModel[53].setRotationPoint(-56.25F, -22.0F, 7.75F);
/*      */     
/* 1955 */     this.defaultScopeModel[54].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.3F, -0.55F, 0.5F);
/* 1956 */     this.defaultScopeModel[54].setRotationPoint(-56.5F, -22.5F, 1.0F);
/*      */     
/* 1958 */     this.defaultScopeModel[55].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 6, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F);
/* 1959 */     this.defaultScopeModel[55].setRotationPoint(-56.0F, -23.5F, 1.0F);
/*      */     
/* 1961 */     this.defaultScopeModel[56].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 6, 0.0F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F);
/* 1962 */     this.defaultScopeModel[56].setRotationPoint(-57.0F, -24.0F, 1.0F);
/*      */     
/* 1964 */     this.defaultScopeModel[57].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 6, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F);
/* 1965 */     this.defaultScopeModel[57].setRotationPoint(-56.5F, -23.5F, 1.0F);
/*      */     
/* 1967 */     this.defaultScopeModel[58].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.5F, -0.7F, 0.5F, -0.25F, -0.7F, 0.5F, -0.25F, -0.7F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, 0.7F, 0.5F, -0.25F, 0.2F, 0.5F, -0.25F, 0.2F, 0.5F, -0.5F, 0.7F, 0.5F);
/* 1968 */     this.defaultScopeModel[58].setRotationPoint(-55.75F, -24.25F, 1.0F);
/*      */     
/* 1970 */     this.defaultScopeModel[59].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.25F, -0.3F, 0.5F);
/* 1971 */     this.defaultScopeModel[59].setRotationPoint(-57.5F, -22.5F, 1.0F);
/*      */     
/* 1973 */     this.defaultScopeModel[60].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F);
/* 1974 */     this.defaultScopeModel[60].setRotationPoint(-57.5F, -23.5F, 1.0F);
/*      */     
/* 1976 */     this.defaultScopeModel[61].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, -1.05F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.3F, -1.05F, 0.5F);
/* 1977 */     this.defaultScopeModel[61].setRotationPoint(-57.55F, -21.75F, 1.0F);
/*      */     
/* 1979 */     this.defaultScopeModel[62].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.2F, -1.05F, 0.5F);
/* 1980 */     this.defaultScopeModel[62].setRotationPoint(-58.0F, -22.25F, 1.0F);
/*      */     
/* 1982 */     this.defaultScopeModel[63].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 1983 */     this.defaultScopeModel[63].setRotationPoint(-58.0F, -22.5F, 1.0F);
/*      */     
/* 1985 */     this.defaultScopeModel[64].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 1986 */     this.defaultScopeModel[64].setRotationPoint(-58.0F, -22.75F, 1.0F);
/*      */     
/* 1988 */     this.defaultScopeModel[65].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.5F, 0.55F, 0.5F, -0.5F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F);
/* 1989 */     this.defaultScopeModel[65].setRotationPoint(-58.0F, -23.0F, 1.0F);
/*      */     
/* 1991 */     this.defaultScopeModel[66].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 6, 0.0F, -0.5F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F);
/* 1992 */     this.defaultScopeModel[66].setRotationPoint(-57.25F, -24.75F, 1.0F);
/*      */     
/* 1994 */     this.defaultScopeModel[67].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 5, 0.0F, -0.45F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.45F, 0.5F, 0.5F, -0.45F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, -0.45F, -0.5F, 0.5F);
/* 1995 */     this.defaultScopeModel[67].setRotationPoint(-58.25F, -26.75F, 1.5F);
/*      */     
/* 1997 */     this.defaultScopeModel[68].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 1998 */     this.defaultScopeModel[68].setRotationPoint(-58.3F, -25.75F, 0.5F);
/*      */     
/* 2000 */     this.defaultScopeModel[69].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 2001 */     this.defaultScopeModel[69].setRotationPoint(-57.8F, -25.75F, 0.5F);
/*      */     
/* 2003 */     this.defaultScopeModel[70].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2004 */     this.defaultScopeModel[70].setRotationPoint(-55.5F, -25.75F, 0.5F);
/*      */     
/* 2006 */     this.defaultScopeModel[71].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2007 */     this.defaultScopeModel[71].setRotationPoint(-56.0F, -25.75F, 0.5F);
/*      */     
/* 2009 */     this.defaultScopeModel[72].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 2010 */     this.defaultScopeModel[72].setRotationPoint(-58.3F, -25.75F, 7.0F);
/*      */     
/* 2012 */     this.defaultScopeModel[73].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 2013 */     this.defaultScopeModel[73].setRotationPoint(-57.8F, -25.75F, 7.0F);
/*      */     
/* 2015 */     this.defaultScopeModel[74].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2016 */     this.defaultScopeModel[74].setRotationPoint(-55.5F, -25.75F, 7.0F);
/*      */     
/* 2018 */     this.defaultScopeModel[75].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2019 */     this.defaultScopeModel[75].setRotationPoint(-56.0F, -25.75F, 7.0F);
/*      */     
/* 2021 */     this.defaultScopeModel[76].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F);
/* 2022 */     this.defaultScopeModel[76].setRotationPoint(-58.0F, -24.5F, 1.0F);
/*      */     
/* 2024 */     this.defaultScopeModel[77].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.2F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.2F, -0.75F, 0.5F, -0.2F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F);
/* 2025 */     this.defaultScopeModel[77].setRotationPoint(-58.0F, -26.0F, 1.0F);
/*      */     
/* 2027 */     this.defaultScopeModel[78].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.25F, -0.3F, 0.5F);
/* 2028 */     this.defaultScopeModel[78].setRotationPoint(-57.5F, -22.5F, 6.0F);
/*      */     
/* 2030 */     this.defaultScopeModel[79].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F);
/* 2031 */     this.defaultScopeModel[79].setRotationPoint(-57.5F, -23.5F, 6.0F);
/*      */     
/* 2033 */     this.defaultScopeModel[80].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, -1.05F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.3F, -1.05F, 0.5F);
/* 2034 */     this.defaultScopeModel[80].setRotationPoint(-57.55F, -21.75F, 6.0F);
/*      */     
/* 2036 */     this.defaultScopeModel[81].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.2F, -1.05F, 0.5F);
/* 2037 */     this.defaultScopeModel[81].setRotationPoint(-58.0F, -22.25F, 6.0F);
/*      */     
/* 2039 */     this.defaultScopeModel[82].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 2040 */     this.defaultScopeModel[82].setRotationPoint(-58.0F, -22.5F, 6.0F);
/*      */     
/* 2042 */     this.defaultScopeModel[83].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 2043 */     this.defaultScopeModel[83].setRotationPoint(-58.0F, -22.75F, 6.0F);
/*      */     
/* 2045 */     this.defaultScopeModel[84].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.5F, 0.55F, 0.5F, -0.5F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F);
/* 2046 */     this.defaultScopeModel[84].setRotationPoint(-58.0F, -23.0F, 6.0F);
/*      */     
/* 2048 */     this.defaultScopeModel[85].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F);
/* 2049 */     this.defaultScopeModel[85].setRotationPoint(-58.0F, -24.5F, 6.0F);
/*      */     
/* 2051 */     this.defaultScopeModel[86].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.2F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.2F, -0.75F, 0.5F, -0.2F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F);
/* 2052 */     this.defaultScopeModel[86].setRotationPoint(-58.0F, -26.0F, 6.0F);
/*      */     
/* 2054 */     this.defaultScopeModel[87].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 1, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.5F, 0.45F, 0.5F);
/* 2055 */     this.defaultScopeModel[87].setRotationPoint(-58.0F, -26.0F, 6.0F);
/*      */     
/* 2057 */     this.defaultScopeModel[88].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 1, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.5F, 0.45F, 0.5F);
/* 2058 */     this.defaultScopeModel[88].setRotationPoint(-58.0F, -26.0F, 1.0F);
/*      */     
/* 2060 */     this.defaultScopeModel[89].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, -0.2F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, 0.0F, -0.2F, -0.75F, 0.0F, -0.2F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F);
/* 2061 */     this.defaultScopeModel[89].setRotationPoint(-58.0F, -26.0F, 2.0F);
/*      */     
/* 2063 */     this.defaultScopeModel[90].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, -0.2F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.5F, -0.2F, -0.75F, -0.5F, -0.2F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F);
/* 2064 */     this.defaultScopeModel[90].setRotationPoint(-58.0F, -26.0F, 5.0F);
/*      */     
/* 2066 */     this.defaultScopeModel[91].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 1, 0.0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F);
/* 2067 */     this.defaultScopeModel[91].setRotationPoint(-58.25F, -28.5F, 1.5F);
/*      */     
/* 2069 */     this.defaultScopeModel[92].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 1, 0.0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F);
/* 2070 */     this.defaultScopeModel[92].setRotationPoint(-58.25F, -30.0F, 1.0F);
/*      */     
/* 2072 */     this.defaultScopeModel[93].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 1, 0.0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F);
/* 2073 */     this.defaultScopeModel[93].setRotationPoint(-58.25F, -28.5F, 6.25F);
/*      */     
/* 2075 */     this.defaultScopeModel[94].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 1, 0.0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F);
/* 2076 */     this.defaultScopeModel[94].setRotationPoint(-58.25F, -30.0F, 5.75F);
/*      */     
/* 2078 */     this.defaultScopeModel[95].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 5, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 2079 */     this.defaultScopeModel[95].setRotationPoint(-58.5F, -22.5F, 1.5F);
/*      */     
/* 2081 */     this.defaultScopeModel[96].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2082 */     this.defaultScopeModel[96].setRotationPoint(-56.75F, -28.25F, 1.25F);
/*      */     
/* 2084 */     this.defaultScopeModel[97].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2085 */     this.defaultScopeModel[97].setRotationPoint(-56.75F, -28.25F, 3.0F);
/*      */     
/* 2087 */     this.defaultScopeModel[98].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2088 */     this.defaultScopeModel[98].setRotationPoint(-56.75F, -29.5F, 3.0F);
/*      */     
/* 2090 */     this.defaultScopeModel[99].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.35F, 0.0F, -0.25F, -1.35F);
/* 2091 */     this.defaultScopeModel[99].setRotationPoint(-56.75F, -29.25F, 3.0F);
/*      */     
/* 2093 */     this.defaultScopeModel[100].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F);
/* 2094 */     this.defaultScopeModel[100].setRotationPoint(-56.75F, -29.25F, 4.25F);
/*      */     
/* 2096 */     this.defaultScopeModel[101].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2097 */     this.defaultScopeModel[101].setRotationPoint(-56.75F, -29.75F, 3.0F);
/*      */     
/* 2099 */     this.defaultScopeModel[102].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F);
/* 2100 */     this.defaultScopeModel[102].setRotationPoint(-56.75F, -29.25F, 3.85F);
/*      */     
/* 2102 */     this.defaultScopeModel[103].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2103 */     this.defaultScopeModel[103].setRotationPoint(-56.75F, -29.5F, 3.85F);
/*      */     
/* 2105 */     this.defaultScopeModel[104].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
/* 2106 */     this.defaultScopeModel[104].setRotationPoint(-56.75F, -29.5F, 2.15F);
/*      */     
/* 2108 */     this.defaultScopeModel[105].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F);
/* 2109 */     this.defaultScopeModel[105].setRotationPoint(-56.75F, -29.25F, 2.15F);
/*      */     
/* 2111 */     this.defaultScopeModel[106].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2112 */     this.defaultScopeModel[106].setRotationPoint(47.5F, -23.0F, 0.0F);
/*      */     
/* 2114 */     this.defaultScopeModel[107].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2115 */     this.defaultScopeModel[107].setRotationPoint(47.0F, -23.0F, 0.0F);
/*      */     
/* 2117 */     this.defaultScopeModel[108].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2118 */     this.defaultScopeModel[108].setRotationPoint(48.0F, -23.0F, 0.0F);
/*      */     
/* 2120 */     this.defaultScopeModel[109].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2121 */     this.defaultScopeModel[109].setRotationPoint(48.0F, -22.0F, 0.0F);
/*      */     
/* 2123 */     this.defaultScopeModel[110].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2124 */     this.defaultScopeModel[110].setRotationPoint(48.0F, -24.0F, 0.0F);
/*      */     
/* 2126 */     this.defaultScopeModel[111].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2127 */     this.defaultScopeModel[111].setRotationPoint(49.0F, -23.5F, 0.0F);
/*      */     
/* 2129 */     this.defaultScopeModel[112].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 2130 */     this.defaultScopeModel[112].setRotationPoint(48.25F, -22.5F, 0.0F);
/*      */     
/* 2132 */     this.defaultScopeModel[113].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.75F, -1.25F, -0.5F, -0.75F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2133 */     this.defaultScopeModel[113].setRotationPoint(49.5F, -23.0F, 0.0F);
/*      */     
/* 2135 */     this.defaultScopeModel[114].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, 0.5F, -1.25F, -0.5F, 0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2136 */     this.defaultScopeModel[114].setRotationPoint(49.5F, -24.5F, 0.0F);
/*      */     
/* 2138 */     this.defaultScopeModel[115].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2139 */     this.defaultScopeModel[115].setRotationPoint(49.5F, -23.0F, 0.0F);
/*      */     
/* 2141 */     this.defaultScopeModel[116].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2142 */     this.defaultScopeModel[116].setRotationPoint(47.5F, -22.5F, -0.5F);
/*      */     
/* 2144 */     this.defaultScopeModel[117].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 2145 */     this.defaultScopeModel[117].setRotationPoint(47.5F, -23.0F, 6.0F);
/*      */     
/* 2147 */     this.defaultScopeModel[118].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F);
/* 2148 */     this.defaultScopeModel[118].setRotationPoint(47.0F, -23.0F, 6.0F);
/*      */     
/* 2150 */     this.defaultScopeModel[119].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 2151 */     this.defaultScopeModel[119].setRotationPoint(48.0F, -23.0F, 6.0F);
/*      */     
/* 2153 */     this.defaultScopeModel[120].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 2154 */     this.defaultScopeModel[120].setRotationPoint(48.0F, -22.0F, 6.0F);
/*      */     
/* 2156 */     this.defaultScopeModel[121].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F);
/* 2157 */     this.defaultScopeModel[121].setRotationPoint(48.0F, -24.0F, 6.0F);
/*      */     
/* 2159 */     this.defaultScopeModel[122].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 2, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 2160 */     this.defaultScopeModel[122].setRotationPoint(49.0F, -23.5F, 6.0F);
/*      */     
/* 2162 */     this.defaultScopeModel[123].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F);
/* 2163 */     this.defaultScopeModel[123].setRotationPoint(48.25F, -22.5F, 6.0F);
/*      */     
/* 2165 */     this.defaultScopeModel[124].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 2166 */     this.defaultScopeModel[124].setRotationPoint(49.5F, -23.0F, 6.0F);
/*      */     
/* 2168 */     this.defaultScopeModel[125].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F);
/* 2169 */     this.defaultScopeModel[125].setRotationPoint(49.5F, -24.5F, 6.0F);
/*      */     
/* 2171 */     this.defaultScopeModel[126].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 2172 */     this.defaultScopeModel[126].setRotationPoint(49.5F, -23.0F, 6.0F);
/*      */     
/* 2174 */     this.defaultScopeModel[127].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 3, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F);
/* 2175 */     this.defaultScopeModel[127].setRotationPoint(47.5F, -22.5F, 5.5F);
/*      */     
/* 2177 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 4, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2178 */     this.defaultScopeModel[''].setRotationPoint(49.5F, -24.5F, 2.0F);
/*      */     
/* 2180 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F);
/* 2181 */     this.defaultScopeModel[''].setRotationPoint(49.5F, -23.0F, 2.0F);
/*      */     
/* 2183 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2184 */     this.defaultScopeModel[''].setRotationPoint(49.5F, -23.0F, 5.0F);
/*      */     
/* 2186 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, -0.35F, 0.0F, -1.25F, -0.35F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F);
/* 2187 */     this.defaultScopeModel[''].setRotationPoint(48.5F, -24.75F, 5.5F);
/*      */     
/* 2189 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 4, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2190 */     this.defaultScopeModel[''].setRotationPoint(49.0F, -23.5F, 2.0F);
/*      */     
/* 2192 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F);
/* 2193 */     this.defaultScopeModel[''].setRotationPoint(46.5F, -23.0F, 5.5F);
/*      */     
/* 2195 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2196 */     this.defaultScopeModel[''].setRotationPoint(46.5F, -23.0F, 0.5F);
/*      */     
/* 2198 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 3, 0.0F, 0.0F, -1.25F, -0.15F, -1.0F, -1.25F, -0.15F, -1.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F);
/* 2199 */     this.defaultScopeModel[''].setRotationPoint(48.5F, -24.75F, 2.5F);
/*      */     
/* 2201 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.35F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.5F);
/* 2202 */     this.defaultScopeModel[''].setRotationPoint(46.5F, -24.75F, 5.5F);
/*      */     
/* 2204 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 2205 */     this.defaultScopeModel[''].setRotationPoint(46.5F, -24.75F, 2.5F);
/*      */     
/* 2207 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 2, 3, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, -0.35F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 2208 */     this.defaultScopeModel[''].setRotationPoint(46.5F, -24.75F, 0.5F);
/*      */     
/* 2210 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.0F, -1.25F, -0.35F, -1.0F, -1.25F, -0.35F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 2211 */     this.defaultScopeModel[''].setRotationPoint(48.5F, -24.75F, 0.5F);
/*      */     
/* 2213 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 5, 1, 5, 0.0F, -0.75F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 2214 */     this.defaultScopeModel[''].setRotationPoint(44.25F, -22.5F, 1.5F);
/*      */     
/* 2216 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F);
/* 2217 */     this.defaultScopeModel[''].setRotationPoint(45.5F, -24.75F, 5.5F);
/*      */     
/* 2219 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.5F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F);
/* 2220 */     this.defaultScopeModel[''].setRotationPoint(45.5F, -24.75F, 0.5F);
/*      */     
/* 2222 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 3, 2, 0.0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F);
/* 2223 */     this.defaultScopeModel[''].setRotationPoint(45.5F, -24.75F, 3.0F);
/*      */     
/* 2225 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 7, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F);
/* 2226 */     this.defaultScopeModel[''].setRotationPoint(44.5F, -23.0F, 0.5F);
/*      */     
/* 2228 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F);
/* 2229 */     this.defaultScopeModel[''].setRotationPoint(45.5F, -22.75F, 1.0F);
/*      */     
/* 2231 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 2232 */     this.defaultScopeModel[''].setRotationPoint(45.0F, -22.5F, 1.0F);
/*      */     
/* 2234 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 2235 */     this.defaultScopeModel[''].setRotationPoint(44.75F, -21.75F, 1.0F);
/*      */     
/* 2237 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 2238 */     this.defaultScopeModel[''].setRotationPoint(44.25F, -21.75F, 1.0F);
/*      */     
/* 2240 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 2241 */     this.defaultScopeModel[''].setRotationPoint(44.25F, -22.0F, 1.0F);
/*      */     
/* 2243 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.25F, 0.5F, 0.5F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F);
/* 2244 */     this.defaultScopeModel[''].setRotationPoint(44.5F, -22.0F, 1.0F);
/*      */     
/* 2246 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 2247 */     this.defaultScopeModel[''].setRotationPoint(45.75F, -22.5F, 5.5F);
/*      */     
/* 2249 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2250 */     this.defaultScopeModel[''].setRotationPoint(45.75F, -22.5F, 0.5F);
/*      */     
/* 2252 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F);
/* 2253 */     this.defaultScopeModel[''].setRotationPoint(43.5F, -22.0F, 1.0F);
/*      */     
/* 2255 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 2256 */     this.defaultScopeModel[''].setRotationPoint(43.0F, -22.5F, 1.0F);
/*      */     
/* 2258 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 2259 */     this.defaultScopeModel[''].setRotationPoint(43.75F, -22.0F, -0.75F);
/*      */     
/* 2261 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2262 */     this.defaultScopeModel[''].setRotationPoint(43.75F, -22.0F, -0.5F);
/*      */     
/* 2264 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F);
/* 2265 */     this.defaultScopeModel[''].setRotationPoint(43.75F, -22.0F, 7.5F);
/*      */     
/* 2267 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2268 */     this.defaultScopeModel[''].setRotationPoint(43.75F, -22.0F, 7.75F);
/*      */     
/* 2270 */     this.defaultScopeModel[''].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.3F, -0.55F, 0.5F);
/* 2271 */     this.defaultScopeModel[''].setRotationPoint(43.5F, -22.5F, 1.0F);
/*      */     
/* 2273 */     this.defaultScopeModel[' '].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 6, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F);
/* 2274 */     this.defaultScopeModel[' '].setRotationPoint(44.0F, -23.5F, 1.0F);
/*      */     
/* 2276 */     this.defaultScopeModel['¡'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 6, 0.0F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F);
/* 2277 */     this.defaultScopeModel['¡'].setRotationPoint(43.0F, -24.0F, 1.0F);
/*      */     
/* 2279 */     this.defaultScopeModel['¢'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 6, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F);
/* 2280 */     this.defaultScopeModel['¢'].setRotationPoint(43.5F, -23.5F, 1.0F);
/*      */     
/* 2282 */     this.defaultScopeModel['£'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 6, 0.0F, -0.5F, -0.7F, 0.5F, -0.25F, -0.7F, 0.5F, -0.25F, -0.7F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, 0.7F, 0.5F, -0.25F, 0.2F, 0.5F, -0.25F, 0.2F, 0.5F, -0.5F, 0.7F, 0.5F);
/* 2283 */     this.defaultScopeModel['£'].setRotationPoint(44.25F, -24.25F, 1.0F);
/*      */     
/* 2285 */     this.defaultScopeModel['¤'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.25F, -0.3F, 0.5F);
/* 2286 */     this.defaultScopeModel['¤'].setRotationPoint(42.5F, -22.5F, 1.0F);
/*      */     
/* 2288 */     this.defaultScopeModel['¥'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F);
/* 2289 */     this.defaultScopeModel['¥'].setRotationPoint(42.5F, -23.5F, 1.0F);
/*      */     
/* 2291 */     this.defaultScopeModel['¦'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, -1.05F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.3F, -1.05F, 0.5F);
/* 2292 */     this.defaultScopeModel['¦'].setRotationPoint(42.45F, -21.75F, 1.0F);
/*      */     
/* 2294 */     this.defaultScopeModel['§'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.2F, -1.05F, 0.5F);
/* 2295 */     this.defaultScopeModel['§'].setRotationPoint(42.0F, -22.25F, 1.0F);
/*      */     
/* 2297 */     this.defaultScopeModel['¨'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 2298 */     this.defaultScopeModel['¨'].setRotationPoint(42.0F, -22.5F, 1.0F);
/*      */     
/* 2300 */     this.defaultScopeModel['©'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 2301 */     this.defaultScopeModel['©'].setRotationPoint(42.0F, -22.75F, 1.0F);
/*      */     
/* 2303 */     this.defaultScopeModel['ª'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.5F, 0.55F, 0.5F, -0.5F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F);
/* 2304 */     this.defaultScopeModel['ª'].setRotationPoint(42.0F, -23.0F, 1.0F);
/*      */     
/* 2306 */     this.defaultScopeModel['«'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 6, 0.0F, -0.5F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F);
/* 2307 */     this.defaultScopeModel['«'].setRotationPoint(42.75F, -24.75F, 1.0F);
/*      */     
/* 2309 */     this.defaultScopeModel['¬'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 5, 0.0F, -0.45F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.45F, 0.5F, 0.5F, -0.45F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, -0.45F, -0.5F, 0.5F);
/* 2310 */     this.defaultScopeModel['¬'].setRotationPoint(41.75F, -26.75F, 1.5F);
/*      */     
/* 2312 */     this.defaultScopeModel['­'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 2313 */     this.defaultScopeModel['­'].setRotationPoint(41.7F, -25.75F, 0.5F);
/*      */     
/* 2315 */     this.defaultScopeModel['®'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 2316 */     this.defaultScopeModel['®'].setRotationPoint(42.2F, -25.75F, 0.5F);
/*      */     
/* 2318 */     this.defaultScopeModel['¯'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2319 */     this.defaultScopeModel['¯'].setRotationPoint(44.5F, -25.75F, 0.5F);
/*      */     
/* 2321 */     this.defaultScopeModel['°'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2322 */     this.defaultScopeModel['°'].setRotationPoint(44.0F, -25.75F, 0.5F);
/*      */     
/* 2324 */     this.defaultScopeModel['±'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 2325 */     this.defaultScopeModel['±'].setRotationPoint(41.7F, -25.75F, 7.0F);
/*      */     
/* 2327 */     this.defaultScopeModel['²'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 2328 */     this.defaultScopeModel['²'].setRotationPoint(42.2F, -25.75F, 7.0F);
/*      */     
/* 2330 */     this.defaultScopeModel['³'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2331 */     this.defaultScopeModel['³'].setRotationPoint(44.5F, -25.75F, 7.0F);
/*      */     
/* 2333 */     this.defaultScopeModel['´'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2334 */     this.defaultScopeModel['´'].setRotationPoint(44.0F, -25.75F, 7.0F);
/*      */     
/* 2336 */     this.defaultScopeModel['µ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F);
/* 2337 */     this.defaultScopeModel['µ'].setRotationPoint(42.0F, -24.5F, 1.0F);
/*      */     
/* 2339 */     this.defaultScopeModel['¶'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.2F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.2F, -0.75F, 0.5F, -0.2F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F);
/* 2340 */     this.defaultScopeModel['¶'].setRotationPoint(42.0F, -26.0F, 1.0F);
/*      */     
/* 2342 */     this.defaultScopeModel['·'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.25F, -0.3F, 0.5F);
/* 2343 */     this.defaultScopeModel['·'].setRotationPoint(42.5F, -22.5F, 6.0F);
/*      */     
/* 2345 */     this.defaultScopeModel['¸'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F);
/* 2346 */     this.defaultScopeModel['¸'].setRotationPoint(42.5F, -23.5F, 6.0F);
/*      */     
/* 2348 */     this.defaultScopeModel['¹'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, -1.05F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.3F, -1.05F, 0.5F);
/* 2349 */     this.defaultScopeModel['¹'].setRotationPoint(42.45F, -21.75F, 6.0F);
/*      */     
/* 2351 */     this.defaultScopeModel['º'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.2F, -1.05F, 0.5F);
/* 2352 */     this.defaultScopeModel['º'].setRotationPoint(42.0F, -22.25F, 6.0F);
/*      */     
/* 2354 */     this.defaultScopeModel['»'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 2355 */     this.defaultScopeModel['»'].setRotationPoint(42.0F, -22.5F, 6.0F);
/*      */     
/* 2357 */     this.defaultScopeModel['¼'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F);
/* 2358 */     this.defaultScopeModel['¼'].setRotationPoint(42.0F, -22.75F, 6.0F);
/*      */     
/* 2360 */     this.defaultScopeModel['½'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.5F, 0.55F, 0.5F, -0.5F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F);
/* 2361 */     this.defaultScopeModel['½'].setRotationPoint(42.0F, -23.0F, 6.0F);
/*      */     
/* 2363 */     this.defaultScopeModel['¾'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.2F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F);
/* 2364 */     this.defaultScopeModel['¾'].setRotationPoint(42.0F, -24.5F, 6.0F);
/*      */     
/* 2366 */     this.defaultScopeModel['¿'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, -0.2F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.2F, -0.75F, 0.5F, -0.2F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F);
/* 2367 */     this.defaultScopeModel['¿'].setRotationPoint(42.0F, -26.0F, 6.0F);
/*      */     
/* 2369 */     this.defaultScopeModel['À'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 1, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.5F, 0.45F, 0.5F);
/* 2370 */     this.defaultScopeModel['À'].setRotationPoint(42.0F, -26.0F, 6.0F);
/*      */     
/* 2372 */     this.defaultScopeModel['Á'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 1, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.5F, 0.45F, 0.5F);
/* 2373 */     this.defaultScopeModel['Á'].setRotationPoint(42.0F, -26.0F, 1.0F);
/*      */     
/* 2375 */     this.defaultScopeModel['Â'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, -0.2F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, 0.0F, -0.2F, -0.75F, 0.0F, -0.2F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F);
/* 2376 */     this.defaultScopeModel['Â'].setRotationPoint(42.0F, -26.0F, 2.0F);
/*      */     
/* 2378 */     this.defaultScopeModel['Ã'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, -0.2F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.5F, -0.2F, -0.75F, -0.5F, -0.2F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F);
/* 2379 */     this.defaultScopeModel['Ã'].setRotationPoint(42.0F, -26.0F, 5.0F);
/*      */     
/* 2381 */     this.defaultScopeModel['Ä'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 1, 0.0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F);
/* 2382 */     this.defaultScopeModel['Ä'].setRotationPoint(41.75F, -28.5F, 1.5F);
/*      */     
/* 2384 */     this.defaultScopeModel['Å'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 1, 0.0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F);
/* 2385 */     this.defaultScopeModel['Å'].setRotationPoint(41.75F, -30.0F, 1.0F);
/*      */     
/* 2387 */     this.defaultScopeModel['Æ'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 2, 1, 0.0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F);
/* 2388 */     this.defaultScopeModel['Æ'].setRotationPoint(41.75F, -28.5F, 6.25F);
/*      */     
/* 2390 */     this.defaultScopeModel['Ç'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 1, 0.0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F);
/* 2391 */     this.defaultScopeModel['Ç'].setRotationPoint(41.75F, -30.0F, 5.75F);
/*      */     
/* 2393 */     this.defaultScopeModel['È'].addShapeBox(46.0F, -18.0F, -4.0F, 3, 1, 5, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 2394 */     this.defaultScopeModel['È'].setRotationPoint(41.5F, -22.5F, 1.5F);
/*      */     
/* 2396 */     this.defaultScopeModel['É'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.75F);
/* 2397 */     this.defaultScopeModel['É'].setRotationPoint(-57.5F, -26.5F, 7.0F);
/*      */     
/* 2399 */     this.defaultScopeModel['Ê'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2400 */     this.defaultScopeModel['Ê'].setRotationPoint(-56.75F, -26.5F, 7.0F);
/*      */     
/* 2402 */     this.defaultScopeModel['Ë'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2403 */     this.defaultScopeModel['Ë'].setRotationPoint(-56.0F, -26.5F, 7.0F);
/*      */     
/* 2405 */     this.defaultScopeModel['Ì'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2406 */     this.defaultScopeModel['Ì'].setRotationPoint(-57.5F, -27.25F, 7.0F);
/*      */     
/* 2408 */     this.defaultScopeModel['Í'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2409 */     this.defaultScopeModel['Í'].setRotationPoint(-56.0F, -27.75F, 7.0F);
/*      */     
/* 2411 */     this.defaultScopeModel['Î'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2412 */     this.defaultScopeModel['Î'].setRotationPoint(-56.75F, -28.0F, 7.0F);
/*      */     
/* 2414 */     this.defaultScopeModel['Ï'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2415 */     this.defaultScopeModel['Ï'].setRotationPoint(-57.5F, -27.75F, 7.0F);
/*      */     
/* 2417 */     this.defaultScopeModel['Ð'].addShapeBox(46.0F, -18.0F, -4.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2418 */     this.defaultScopeModel['Ð'].setRotationPoint(-57.5F, -27.25F, 0.0F);
/*      */     
/* 2420 */     this.defaultScopeModel['Ñ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2421 */     this.defaultScopeModel['Ñ'].setRotationPoint(-57.5F, -27.75F, 0.0F);
/*      */     
/* 2423 */     this.defaultScopeModel['Ò'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2424 */     this.defaultScopeModel['Ò'].setRotationPoint(-56.75F, -28.0F, 0.0F);
/*      */     
/* 2426 */     this.defaultScopeModel['Ó'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2427 */     this.defaultScopeModel['Ó'].setRotationPoint(-56.0F, -27.75F, 0.0F);
/*      */     
/* 2429 */     this.defaultScopeModel['Ô'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 2430 */     this.defaultScopeModel['Ô'].setRotationPoint(-57.5F, -26.5F, 0.0F);
/*      */     
/* 2432 */     this.defaultScopeModel['Õ'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2433 */     this.defaultScopeModel['Õ'].setRotationPoint(-56.75F, -26.5F, 0.0F);
/*      */     
/* 2435 */     this.defaultScopeModel['Ö'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2436 */     this.defaultScopeModel['Ö'].setRotationPoint(-56.0F, -26.5F, 0.0F);
/*      */     
/* 2438 */     this.defaultScopeModel['×'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 1, 0.0F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2439 */     this.defaultScopeModel['×'].setRotationPoint(43.25F, -29.25F, 3.5F);
/*      */     
/* 2441 */     this.defaultScopeModel['Ø'].addShapeBox(46.0F, -18.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2442 */     this.defaultScopeModel['Ø'].setRotationPoint(43.0F, -28.25F, 3.5F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2447 */     this.ammoModel[0] = new ModelRendererTurbo(this, 209, 201, this.textureX, this.textureY);
/* 2448 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/* 2449 */     this.ammoModel[2] = new ModelRendererTurbo(this, 57, 209, this.textureX, this.textureY);
/* 2450 */     this.ammoModel[3] = new ModelRendererTurbo(this, 113, 209, this.textureX, this.textureY);
/* 2451 */     this.ammoModel[4] = new ModelRendererTurbo(this, 257, 209, this.textureX, this.textureY);
/* 2452 */     this.ammoModel[5] = new ModelRendererTurbo(this, 313, 209, this.textureX, this.textureY);
/* 2453 */     this.ammoModel[6] = new ModelRendererTurbo(this, 369, 209, this.textureX, this.textureY);
/* 2454 */     this.ammoModel[7] = new ModelRendererTurbo(this, 425, 209, this.textureX, this.textureY);
/* 2455 */     this.ammoModel[8] = new ModelRendererTurbo(this, 369, 193, this.textureX, this.textureY);
/* 2456 */     this.ammoModel[9] = new ModelRendererTurbo(this, 417, 193, this.textureX, this.textureY);
/* 2457 */     this.ammoModel[10] = new ModelRendererTurbo(this, 257, 201, this.textureX, this.textureY);
/* 2458 */     this.ammoModel[11] = new ModelRendererTurbo(this, 161, 209, this.textureX, this.textureY);
/* 2459 */     this.ammoModel[12] = new ModelRendererTurbo(this, 473, 209, this.textureX, this.textureY);
/* 2460 */     this.ammoModel[13] = new ModelRendererTurbo(this, 169, 217, this.textureX, this.textureY);
/* 2461 */     this.ammoModel[14] = new ModelRendererTurbo(this, 209, 217, this.textureX, this.textureY);
/* 2462 */     this.ammoModel[15] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/* 2463 */     this.ammoModel[16] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/* 2464 */     this.ammoModel[17] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/* 2465 */     this.ammoModel[18] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/* 2466 */     this.ammoModel[19] = new ModelRendererTurbo(this, 33, 105, this.textureX, this.textureY);
/* 2467 */     this.ammoModel[20] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/* 2468 */     this.ammoModel[21] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 2469 */     this.ammoModel[22] = new ModelRendererTurbo(this, 465, 97, this.textureX, this.textureY);
/* 2470 */     this.ammoModel[23] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/* 2471 */     this.ammoModel[24] = new ModelRendererTurbo(this, 505, 161, this.textureX, this.textureY);
/* 2472 */     this.ammoModel[25] = new ModelRendererTurbo(this, 97, 169, this.textureX, this.textureY);
/* 2473 */     this.ammoModel[26] = new ModelRendererTurbo(this, 137, 177, this.textureX, this.textureY);
/* 2474 */     this.ammoModel[27] = new ModelRendererTurbo(this, 65, 169, this.textureX, this.textureY);
/* 2475 */     this.ammoModel[28] = new ModelRendererTurbo(this, 433, 193, this.textureX, this.textureY);
/* 2476 */     this.ammoModel[29] = new ModelRendererTurbo(this, 97, 225, this.textureX, this.textureY);
/* 2477 */     this.ammoModel[30] = new ModelRendererTurbo(this, 145, 177, this.textureX, this.textureY);
/* 2478 */     this.ammoModel[31] = new ModelRendererTurbo(this, 353, 185, this.textureX, this.textureY);
/* 2479 */     this.ammoModel[32] = new ModelRendererTurbo(this, 289, 177, this.textureX, this.textureY);
/* 2480 */     this.ammoModel[33] = new ModelRendererTurbo(this, 441, 201, this.textureX, this.textureY);
/* 2481 */     this.ammoModel[34] = new ModelRendererTurbo(this, 49, 209, this.textureX, this.textureY);
/* 2482 */     this.ammoModel[35] = new ModelRendererTurbo(this, 153, 193, this.textureX, this.textureY);
/* 2483 */     this.ammoModel[36] = new ModelRendererTurbo(this, 385, 193, this.textureX, this.textureY);
/* 2484 */     this.ammoModel[37] = new ModelRendererTurbo(this, 457, 201, this.textureX, this.textureY);
/* 2485 */     this.ammoModel[38] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/* 2486 */     this.ammoModel[39] = new ModelRendererTurbo(this, 505, 193, this.textureX, this.textureY);
/* 2487 */     this.ammoModel[40] = new ModelRendererTurbo(this, 105, 209, this.textureX, this.textureY);
/* 2488 */     this.ammoModel[41] = new ModelRendererTurbo(this, 201, 209, this.textureX, this.textureY);
/* 2489 */     this.ammoModel[42] = new ModelRendererTurbo(this, 353, 177, this.textureX, this.textureY);
/* 2490 */     this.ammoModel[43] = new ModelRendererTurbo(this, 305, 209, this.textureX, this.textureY);
/* 2491 */     this.ammoModel[44] = new ModelRendererTurbo(this, 145, 225, this.textureX, this.textureY);
/* 2492 */     this.ammoModel[45] = new ModelRendererTurbo(this, 185, 225, this.textureX, this.textureY);
/* 2493 */     this.ammoModel[46] = new ModelRendererTurbo(this, 225, 225, this.textureX, this.textureY);
/* 2494 */     this.ammoModel[47] = new ModelRendererTurbo(this, 265, 225, this.textureX, this.textureY);
/* 2495 */     this.ammoModel[48] = new ModelRendererTurbo(this, 305, 225, this.textureX, this.textureY);
/*      */     
/* 2497 */     this.ammoModel[0].addShapeBox(46.0F, -18.0F, -4.0F, 17, 5, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2498 */     this.ammoModel[0].setRotationPoint(-22.5F, 6.25F, 0.0F);
/*      */     
/* 2500 */     this.ammoModel[1].addShapeBox(46.0F, -18.0F, -4.0F, 17, 5, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2501 */     this.ammoModel[1].setRotationPoint(-22.5F, 11.25F, 0.0F);
/*      */     
/* 2503 */     this.ammoModel[2].addShapeBox(46.0F, -18.0F, -4.0F, 17, 5, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2504 */     this.ammoModel[2].setRotationPoint(-21.5F, 16.25F, 0.0F);
/*      */     
/* 2506 */     this.ammoModel[3].addShapeBox(46.0F, -18.0F, -4.0F, 17, 4, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2507 */     this.ammoModel[3].setRotationPoint(-20.5F, 21.25F, 0.0F);
/*      */     
/* 2509 */     this.ammoModel[4].addShapeBox(46.0F, -18.0F, -4.0F, 18, 4, 8, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2510 */     this.ammoModel[4].setRotationPoint(-20.25F, 25.25F, 0.0F);
/*      */     
/* 2512 */     this.ammoModel[5].addShapeBox(46.0F, -18.0F, -4.0F, 18, 4, 8, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 2513 */     this.ammoModel[5].setRotationPoint(-19.25F, 29.25F, 0.0F);
/*      */     
/* 2515 */     this.ammoModel[6].addShapeBox(46.0F, -18.0F, -4.0F, 17, 6, 8, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, -4.5F, 0.0F, -0.25F, -4.5F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2516 */     this.ammoModel[6].setRotationPoint(-17.25F, 33.25F, 0.0F);
/*      */     
/* 2518 */     this.ammoModel[7].addShapeBox(46.0F, -18.0F, -4.0F, 17, 7, 9, 0.0F, -0.25F, -5.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -5.25F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2519 */     this.ammoModel[7].setRotationPoint(-16.5F, 34.15F, -0.5F);
/*      */     
/* 2521 */     this.ammoModel[8].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.55F, 0.0F);
/* 2522 */     this.ammoModel[8].setRotationPoint(-0.5F, 33.25F, -0.5F);
/*      */     
/* 2524 */     this.ammoModel[9].addShapeBox(46.0F, -18.0F, -4.0F, 1, 2, 9, 0.0F, -0.65F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.25F, -0.6F, 0.0F, 0.2F, -0.87F, 0.0F, 0.2F, -0.87F, 0.0F, -0.25F, -0.6F, 0.0F);
/* 2525 */     this.ammoModel[9].setRotationPoint(-16.5F, 38.0F, -0.5F);
/*      */     
/* 2527 */     this.ammoModel[10].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, 0.35F, -5.0F, -0.3F, -0.45F, 0.0F, -0.3F, -0.95F, 0.0F, -0.2F, -0.15F, -5.0F, -0.2F, 0.05F, 5.0F, -0.3F, -0.15F, 0.0F, -0.3F, -0.65F, 0.0F, -0.2F, -0.45F, 5.0F, -0.2F);
/* 2528 */     this.ammoModel[10].setRotationPoint(-16.25F, 29.5F, 7.65F);
/*      */     
/* 2530 */     this.ammoModel[11].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, 0.8F, -5.0F, -0.3F, -0.85F, 0.0F, -0.3F, -1.35F, 0.0F, -0.2F, 0.3F, -5.0F, -0.2F, 0.5F, 5.0F, -0.3F, -0.6F, 0.0F, -0.3F, -1.1F, 0.0F, -0.2F, -0.05F, 5.0F, -0.2F);
/* 2531 */     this.ammoModel[11].setRotationPoint(-17.5F, 24.0F, 7.65F);
/*      */     
/* 2533 */     this.ammoModel[12].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, 1.0F, -4.5F, -0.3F, -0.7F, -0.5F, -0.3F, -1.2F, -0.5F, -0.2F, 0.5F, -4.5F, -0.2F, 0.7F, 4.5F, -0.3F, -0.5F, 0.5F, -0.3F, -1.0F, 0.5F, -0.2F, 0.2F, 4.5F, -0.2F);
/* 2534 */     this.ammoModel[12].setRotationPoint(-18.75F, 18.75F, 7.65F);
/*      */     
/* 2536 */     this.ammoModel[13].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, 1.15F, -4.0F, -0.3F, -0.4F, -1.0F, -0.3F, -1.4F, -1.0F, -0.2F, 0.65F, -4.0F, -0.2F, 0.95F, 4.0F, -0.3F, -0.25F, 1.0F, -0.3F, -1.25F, 1.0F, -0.2F, 0.45F, 4.0F, -0.2F);
/* 2537 */     this.ammoModel[13].setRotationPoint(-20.0F, 12.75F, 7.65F);
/*      */     
/* 2539 */     this.ammoModel[14].addShapeBox(46.0F, -18.0F, -4.0F, 16, 1, 1, 0.0F, 0.25F, -2.5F, -0.3F, 0.25F, 0.0F, -0.3F, -0.25F, 0.0F, -0.2F, -0.25F, -2.5F, -0.2F, 0.25F, 2.5F, -0.3F, 0.25F, 0.0F, -0.3F, -0.25F, 0.0F, -0.2F, -0.25F, 2.5F, -0.2F);
/* 2540 */     this.ammoModel[14].setRotationPoint(-22.0F, 7.75F, 7.65F);
/*      */     
/* 2542 */     this.ammoModel[15].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2543 */     this.ammoModel[15].setRotationPoint(-19.5F, 11.25F, 7.4F);
/*      */     
/* 2545 */     this.ammoModel[16].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2546 */     this.ammoModel[16].setRotationPoint(-18.5F, 16.25F, 7.4F);
/*      */     
/* 2548 */     this.ammoModel[17].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2549 */     this.ammoModel[17].setRotationPoint(-17.5F, 21.25F, 7.4F);
/*      */     
/* 2551 */     this.ammoModel[18].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2552 */     this.ammoModel[18].setRotationPoint(-17.25F, 25.25F, 7.4F);
/*      */     
/* 2554 */     this.ammoModel[19].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 2555 */     this.ammoModel[19].setRotationPoint(-16.25F, 29.25F, 7.4F);
/*      */     
/* 2557 */     this.ammoModel[20].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2558 */     this.ammoModel[20].setRotationPoint(-19.5F, 7.25F, 7.4F);
/*      */     
/* 2560 */     this.ammoModel[21].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.5F, 1.25F, 0.0F, 2.25F, 0.5F, 0.0F, 2.25F, 0.5F, 0.0F, -2.5F, 1.25F, 0.0F);
/* 2561 */     this.ammoModel[21].setRotationPoint(-14.25F, 33.25F, 7.4F);
/*      */     
/* 2563 */     this.ammoModel[22].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2564 */     this.ammoModel[22].setRotationPoint(-10.5F, 11.25F, 7.4F);
/*      */     
/* 2566 */     this.ammoModel[23].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2567 */     this.ammoModel[23].setRotationPoint(-9.5F, 16.25F, 7.4F);
/*      */     
/* 2569 */     this.ammoModel[24].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2570 */     this.ammoModel[24].setRotationPoint(-8.5F, 21.25F, 7.4F);
/*      */     
/* 2572 */     this.ammoModel[25].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 2573 */     this.ammoModel[25].setRotationPoint(-7.25F, 29.25F, 7.4F);
/*      */     
/* 2575 */     this.ammoModel[26].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2576 */     this.ammoModel[26].setRotationPoint(-10.5F, 6.25F, 7.4F);
/*      */     
/* 2578 */     this.ammoModel[27].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 1.25F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, -2.0F, 1.25F, 0.0F);
/* 2579 */     this.ammoModel[27].setRotationPoint(-5.25F, 33.25F, 7.4F);
/*      */     
/* 2581 */     this.ammoModel[28].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2582 */     this.ammoModel[28].setRotationPoint(-8.25F, 25.25F, 7.4F);
/*      */     
/* 2584 */     this.ammoModel[29].addShapeBox(46.0F, -18.0F, -4.0F, 16, 2, 9, 0.0F, -0.85F, -4.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, -4.75F, 0.0F, -1.2F, 3.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.2F, 3.85F, 0.0F);
/* 2585 */     this.ammoModel[29].setRotationPoint(-16.5F, 33.25F, -0.5F);
/*      */     
/* 2587 */     this.ammoModel[30].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2588 */     this.ammoModel[30].setRotationPoint(-19.5F, 11.25F, -0.45F);
/*      */     
/* 2590 */     this.ammoModel[31].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2591 */     this.ammoModel[31].setRotationPoint(-18.5F, 16.25F, -0.45F);
/*      */     
/* 2593 */     this.ammoModel[32].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2594 */     this.ammoModel[32].setRotationPoint(-17.5F, 21.25F, -0.45F);
/*      */     
/* 2596 */     this.ammoModel[33].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2597 */     this.ammoModel[33].setRotationPoint(-17.25F, 25.25F, -0.45F);
/*      */     
/* 2599 */     this.ammoModel[34].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 2600 */     this.ammoModel[34].setRotationPoint(-16.25F, 29.25F, -0.45F);
/*      */     
/* 2602 */     this.ammoModel[35].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2603 */     this.ammoModel[35].setRotationPoint(-19.5F, 7.25F, -0.45F);
/*      */     
/* 2605 */     this.ammoModel[36].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.5F, 1.25F, 0.0F, 2.25F, 0.5F, 0.0F, 2.25F, 0.5F, 0.0F, -2.5F, 1.25F, 0.0F);
/* 2606 */     this.ammoModel[36].setRotationPoint(-14.25F, 33.25F, -0.45F);
/*      */     
/* 2608 */     this.ammoModel[37].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2609 */     this.ammoModel[37].setRotationPoint(-10.5F, 11.25F, -0.45F);
/*      */     
/* 2611 */     this.ammoModel[38].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2612 */     this.ammoModel[38].setRotationPoint(-9.5F, 16.25F, -0.45F);
/*      */     
/* 2614 */     this.ammoModel[39].addShapeBox(46.0F, -18.0F, -4.0F, 2, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2615 */     this.ammoModel[39].setRotationPoint(-8.5F, 21.25F, -0.45F);
/*      */     
/* 2617 */     this.ammoModel[40].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 2618 */     this.ammoModel[40].setRotationPoint(-7.25F, 29.25F, -0.45F);
/*      */     
/* 2620 */     this.ammoModel[41].addShapeBox(46.0F, -18.0F, -4.0F, 2, 5, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2621 */     this.ammoModel[41].setRotationPoint(-10.5F, 6.25F, -0.45F);
/*      */     
/* 2623 */     this.ammoModel[42].addShapeBox(46.0F, -18.0F, -4.0F, 2, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 1.25F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, -2.0F, 1.25F, 0.0F);
/* 2624 */     this.ammoModel[42].setRotationPoint(-5.25F, 33.25F, -0.45F);
/*      */     
/* 2626 */     this.ammoModel[43].addShapeBox(46.0F, -18.0F, -4.0F, 3, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2627 */     this.ammoModel[43].setRotationPoint(-8.25F, 25.25F, -0.45F);
/*      */     
/* 2629 */     this.ammoModel[44].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, -0.15F, -5.0F, -0.2F, -0.95F, 0.0F, -0.2F, -0.45F, 0.0F, 0.0F, 0.35F, -5.0F, 0.0F, -0.45F, 5.0F, -0.2F, -0.65F, 0.0F, -0.2F, -0.15F, 0.0F, 0.0F, 0.05F, 5.0F, 0.0F);
/* 2630 */     this.ammoModel[44].setRotationPoint(-16.25F, 29.5F, -1.0F);
/*      */     
/* 2632 */     this.ammoModel[45].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, 0.3F, -5.0F, -0.2F, -1.35F, 0.0F, -0.2F, -0.85F, 0.0F, 0.0F, 0.8F, -5.0F, 0.0F, 0.0F, 5.0F, -0.2F, -1.1F, 0.0F, -0.2F, -0.6F, 0.0F, 0.0F, 0.5F, 5.0F, 0.0F);
/* 2633 */     this.ammoModel[45].setRotationPoint(-17.5F, 24.0F, -1.0F);
/*      */     
/* 2635 */     this.ammoModel[46].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, 0.5F, -4.5F, -0.2F, -1.2F, -0.5F, -0.2F, -0.7F, -0.5F, 0.0F, 1.0F, -4.5F, 0.0F, 0.2F, 4.5F, -0.2F, -1.0F, 0.5F, -0.2F, -0.5F, 0.5F, 0.0F, 0.7F, 4.5F, 0.0F);
/* 2636 */     this.ammoModel[46].setRotationPoint(-18.75F, 18.75F, -1.0F);
/*      */     
/* 2638 */     this.ammoModel[47].addShapeBox(46.0F, -18.0F, -4.0F, 15, 1, 1, 0.0F, 0.65F, -4.0F, -0.5F, -0.9F, -1.0F, -0.5F, -0.4F, -1.0F, 0.0F, 1.15F, -4.0F, 0.0F, 0.45F, 4.0F, -0.5F, -0.75F, 1.0F, -0.5F, -0.25F, 1.0F, 0.0F, 0.95F, 4.0F, 0.0F);
/* 2639 */     this.ammoModel[47].setRotationPoint(-20.0F, 12.75F, -1.0F);
/*      */     
/* 2641 */     this.ammoModel[48].addShapeBox(46.0F, -18.0F, -4.0F, 16, 1, 1, 0.0F, -0.25F, -2.5F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, -0.25F, 2.5F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 2.5F, 0.0F);
/* 2642 */     this.ammoModel[48].setRotationPoint(-22.0F, 7.75F, -1.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 2647 */     this.slideModel[0] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/* 2648 */     this.slideModel[1] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*      */     
/* 2650 */     this.slideModel[0].addShapeBox(46.0F, -18.0F, -4.0F, 22, 5, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2651 */     this.slideModel[0].setRotationPoint(-28.5F, -16.0F, -1.25F);
/*      */     
/* 2653 */     this.slideModel[1].addShapeBox(46.0F, -18.0F, -4.0F, 23, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2654 */     this.slideModel[1].setRotationPoint(-29.0F, -10.5F, -1.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelacr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */