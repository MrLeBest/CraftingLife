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
/*      */ public class Modelm249
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelm249()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ɟ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[73];
/*   23 */     this.ammoModel = new ModelRendererTurbo['Ġ'];
/*      */     
/*   25 */     initgunModel_1();
/*   26 */     initgunModel_2();
/*   27 */     initdefaultScopeModel_1();
/*   28 */     initammoModel_1();
/*      */     
/*   30 */     this.scopeAttachPoint = new Vector3f(-0.015625F, 0.8125F, 0.00125F);
/*      */     
/*   32 */     translateAll(0.0F, -3.35F, -0.02F);
/*   33 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/*   35 */     this.gunSlideDistance = 0.0F;
/*   36 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   39 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   44 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[2] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[3] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[4] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[5] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[6] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[7] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[8] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[9] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[10] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[11] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*   56 */     this.gunModel[12] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*   57 */     this.gunModel[13] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*   58 */     this.gunModel[14] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[15] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*   60 */     this.gunModel[16] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*   61 */     this.gunModel[17] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*   62 */     this.gunModel[18] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*   63 */     this.gunModel[19] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*   64 */     this.gunModel[20] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*   65 */     this.gunModel[21] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*   66 */     this.gunModel[22] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*   67 */     this.gunModel[23] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*   68 */     this.gunModel[24] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*   69 */     this.gunModel[25] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*   70 */     this.gunModel[26] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*   71 */     this.gunModel[27] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*   72 */     this.gunModel[28] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*   73 */     this.gunModel[29] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*   74 */     this.gunModel[30] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*   75 */     this.gunModel[31] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*   76 */     this.gunModel[32] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*   77 */     this.gunModel[33] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*   78 */     this.gunModel[34] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*   79 */     this.gunModel[35] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*   80 */     this.gunModel[36] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*   81 */     this.gunModel[37] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*   82 */     this.gunModel[38] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*   83 */     this.gunModel[39] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*   84 */     this.gunModel[40] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   85 */     this.gunModel[41] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/*   86 */     this.gunModel[42] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*   87 */     this.gunModel[43] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*   88 */     this.gunModel[44] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*   89 */     this.gunModel[45] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*   90 */     this.gunModel[46] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*   91 */     this.gunModel[47] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*   92 */     this.gunModel[48] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*   93 */     this.gunModel[49] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*   94 */     this.gunModel[50] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*   95 */     this.gunModel[51] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*   96 */     this.gunModel[52] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*   97 */     this.gunModel[53] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*   98 */     this.gunModel[54] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*   99 */     this.gunModel[55] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  100 */     this.gunModel[56] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  101 */     this.gunModel[57] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[58] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  103 */     this.gunModel[59] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[60] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[61] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  106 */     this.gunModel[62] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  107 */     this.gunModel[63] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*  108 */     this.gunModel[64] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  109 */     this.gunModel[65] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  110 */     this.gunModel[66] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  111 */     this.gunModel[67] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*  112 */     this.gunModel[68] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  113 */     this.gunModel[69] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  114 */     this.gunModel[70] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  115 */     this.gunModel[71] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/*  116 */     this.gunModel[72] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  117 */     this.gunModel[73] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  118 */     this.gunModel[74] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  119 */     this.gunModel[75] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  120 */     this.gunModel[76] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/*  121 */     this.gunModel[77] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*  122 */     this.gunModel[78] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/*  123 */     this.gunModel[79] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  124 */     this.gunModel[80] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  125 */     this.gunModel[81] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  126 */     this.gunModel[82] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  127 */     this.gunModel[83] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  128 */     this.gunModel[84] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*  129 */     this.gunModel[85] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/*  130 */     this.gunModel[86] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*  131 */     this.gunModel[87] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/*  132 */     this.gunModel[88] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/*  133 */     this.gunModel[89] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/*  134 */     this.gunModel[90] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*  135 */     this.gunModel[91] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  136 */     this.gunModel[92] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  137 */     this.gunModel[93] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  138 */     this.gunModel[94] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*  139 */     this.gunModel[95] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  140 */     this.gunModel[96] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/*  141 */     this.gunModel[97] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/*  142 */     this.gunModel[98] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/*  143 */     this.gunModel[99] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  144 */     this.gunModel[100] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/*  145 */     this.gunModel[101] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  146 */     this.gunModel[102] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*  147 */     this.gunModel[103] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/*  148 */     this.gunModel[104] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/*  149 */     this.gunModel[105] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  150 */     this.gunModel[106] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  151 */     this.gunModel[107] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/*  152 */     this.gunModel[108] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/*  153 */     this.gunModel[109] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*  154 */     this.gunModel[110] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*  155 */     this.gunModel[111] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*  156 */     this.gunModel[112] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  157 */     this.gunModel[113] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/*  158 */     this.gunModel[114] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  159 */     this.gunModel[115] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  160 */     this.gunModel[116] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  161 */     this.gunModel[117] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*  162 */     this.gunModel[118] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  163 */     this.gunModel[119] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*  164 */     this.gunModel[120] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*  165 */     this.gunModel[121] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  166 */     this.gunModel[122] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  167 */     this.gunModel[123] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  168 */     this.gunModel[124] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*  169 */     this.gunModel[125] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  170 */     this.gunModel[126] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
/*  171 */     this.gunModel[127] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 33, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  204 */     this.gunModel[' '] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  205 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*  206 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  207 */     this.gunModel['£'] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/*  208 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  209 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/*  210 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  211 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  212 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
/*  213 */     this.gunModel['©'] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/*  214 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/*  215 */     this.gunModel['«'] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/*  216 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/*  217 */     this.gunModel['­'] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/*  218 */     this.gunModel['®'] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  219 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*  220 */     this.gunModel['°'] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/*  221 */     this.gunModel['±'] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/*  222 */     this.gunModel['²'] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*  223 */     this.gunModel['³'] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*  224 */     this.gunModel['´'] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/*  225 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  226 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/*  227 */     this.gunModel['·'] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/*  228 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*  229 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  230 */     this.gunModel['º'] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/*  231 */     this.gunModel['»'] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/*  232 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/*  233 */     this.gunModel['½'] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*  234 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*  235 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*  236 */     this.gunModel['À'] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  237 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
/*  238 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*  241 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/*  242 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*  244 */     this.gunModel['È'] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*  245 */     this.gunModel['É'] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*  247 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/*  249 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 385, 41, this.textureX, this.textureY);
/*  250 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/*  257 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/*  259 */     this.gunModel['×'] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*  263 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  266 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  267 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*  268 */     this.gunModel['à'] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  269 */     this.gunModel['á'] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  270 */     this.gunModel['â'] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/*  271 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/*  272 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*  273 */     this.gunModel['å'] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/*  274 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/*  275 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  276 */     this.gunModel['è'] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/*  277 */     this.gunModel['é'] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*  278 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  279 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*  280 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  281 */     this.gunModel['í'] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*  282 */     this.gunModel['î'] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/*  283 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/*  284 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  285 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*  286 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*  287 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  288 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*  289 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  290 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*  291 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*  292 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  293 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*  294 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  295 */     this.gunModel['û'] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*  296 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*  297 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*  298 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  299 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*  301 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/*  303 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  305 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*  307 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*  309 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  311 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  312 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/*  313 */     this.gunModel['č'] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*  315 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  316 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  317 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 9, 57, this.textureX, this.textureY);
/*  319 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/*  321 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  323 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  324 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/*  325 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/*  327 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*  331 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 129, 57, this.textureX, this.textureY);
/*  333 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/*  335 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/*  337 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/*  339 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*  341 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*  343 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  345 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  346 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*  347 */     this.gunModel['į'] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/*  348 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*  349 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  350 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  351 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  353 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 9, 65, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 17, 65, this.textureX, this.textureY);
/*  355 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/*  358 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*  360 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*  362 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/*  364 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  366 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/*  368 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*  370 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 185, 65, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  372 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  373 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/*  375 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  377 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 281, 65, this.textureX, this.textureY);
/*  379 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/*  381 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 385, 97, this.textureX, this.textureY);
/*  382 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 393, 97, this.textureX, this.textureY);
/*  383 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 409, 97, this.textureX, this.textureY);
/*  385 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 417, 97, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 425, 97, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 433, 97, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  389 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/*  391 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 465, 97, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/*  393 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 489, 97, this.textureX, this.textureY);
/*  395 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 497, 97, this.textureX, this.textureY);
/*  396 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/*  397 */     this.gunModel['š'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 9, 105, this.textureX, this.textureY);
/*  399 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 17, 105, this.textureX, this.textureY);
/*  400 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/*  401 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 33, 105, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 41, 105, this.textureX, this.textureY);
/*  403 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/*  404 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*  405 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 65, 105, this.textureX, this.textureY);
/*  406 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 73, 105, this.textureX, this.textureY);
/*  407 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 89, 105, this.textureX, this.textureY);
/*  409 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 97, 105, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 105, 105, this.textureX, this.textureY);
/*  411 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 113, 105, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 121, 105, this.textureX, this.textureY);
/*  413 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*  415 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 145, 105, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 153, 105, this.textureX, this.textureY);
/*  417 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/*  419 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 177, 105, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 185, 105, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  422 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 201, 105, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 209, 105, this.textureX, this.textureY);
/*  424 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 217, 105, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 225, 105, this.textureX, this.textureY);
/*  426 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 233, 105, this.textureX, this.textureY);
/*  427 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 241, 105, this.textureX, this.textureY);
/*  428 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 249, 105, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 257, 105, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 265, 105, this.textureX, this.textureY);
/*  431 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 273, 105, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 281, 105, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 289, 105, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 297, 105, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 305, 105, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 313, 105, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 321, 105, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 329, 105, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/*  440 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 385, 105, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 401, 105, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/*  453 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 433, 105, this.textureX, this.textureY);
/*  454 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 441, 105, this.textureX, this.textureY);
/*  455 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 457, 105, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 465, 105, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 481, 105, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/*  461 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 505, 105, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 9, 113, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 17, 113, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 33, 113, this.textureX, this.textureY);
/*  468 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 41, 113, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 49, 113, this.textureX, this.textureY);
/*  470 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/*  471 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 65, 113, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 73, 113, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 89, 113, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  476 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 105, 113, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 113, 113, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 145, 113, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 153, 113, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  485 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*  486 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/*  487 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/*  490 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 217, 113, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  492 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 233, 113, this.textureX, this.textureY);
/*  493 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 241, 113, this.textureX, this.textureY);
/*  494 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  495 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*  496 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 265, 113, this.textureX, this.textureY);
/*  497 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/*  498 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  499 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/*  500 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 305, 113, this.textureX, this.textureY);
/*  502 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  505 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 337, 113, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  507 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 353, 113, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 361, 113, this.textureX, this.textureY);
/*  509 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/*  511 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 385, 113, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 393, 113, this.textureX, this.textureY);
/*  513 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 401, 113, this.textureX, this.textureY);
/*  514 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 409, 113, this.textureX, this.textureY);
/*  515 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/*  516 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 425, 113, this.textureX, this.textureY);
/*  517 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 433, 113, this.textureX, this.textureY);
/*  518 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/*  519 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  520 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 457, 113, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 465, 113, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 473, 113, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 497, 113, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 505, 113, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 9, 121, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 17, 121, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 33, 121, this.textureX, this.textureY);
/*  530 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 41, 121, this.textureX, this.textureY);
/*  531 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/*  532 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 57, 121, this.textureX, this.textureY);
/*  533 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 65, 121, this.textureX, this.textureY);
/*  534 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/*  535 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/*  536 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 89, 121, this.textureX, this.textureY);
/*  537 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*  538 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/*  539 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 113, 121, this.textureX, this.textureY);
/*  540 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  541 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 129, 121, this.textureX, this.textureY);
/*  542 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 137, 121, this.textureX, this.textureY);
/*  543 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 145, 121, this.textureX, this.textureY);
/*      */     
/*  545 */     this.gunModel[0].addShapeBox(-2.0F, -1.0F, -0.75F, 17, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  546 */     this.gunModel[0].setRotationPoint(-5.0F, -8.0F, 0.0F);
/*      */     
/*  548 */     this.gunModel[1].addShapeBox(-2.0F, -1.0F, -0.75F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  549 */     this.gunModel[1].setRotationPoint(-5.0F, -8.0F, -1.0F);
/*      */     
/*  551 */     this.gunModel[2].addShapeBox(-2.0F, -1.0F, -0.75F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  552 */     this.gunModel[2].setRotationPoint(-5.0F, -8.0F, 1.0F);
/*      */     
/*  554 */     this.gunModel[3].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F);
/*  555 */     this.gunModel[3].setRotationPoint(4.0F, -8.0F, 2.0F);
/*      */     
/*  557 */     this.gunModel[4].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  558 */     this.gunModel[4].setRotationPoint(8.0F, -8.0F, 1.5F);
/*      */     
/*  560 */     this.gunModel[5].addShapeBox(-2.0F, -1.0F, -0.75F, 19, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  561 */     this.gunModel[5].setRotationPoint(-5.0F, -6.0F, 1.0F);
/*      */     
/*  563 */     this.gunModel[6].addShapeBox(-2.0F, -1.0F, -0.75F, 17, 2, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  564 */     this.gunModel[6].setRotationPoint(-5.0F, -6.0F, -1.0F);
/*      */     
/*  566 */     this.gunModel[7].addShapeBox(-2.0F, -1.0F, -0.75F, 31, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  567 */     this.gunModel[7].setRotationPoint(-5.0F, -4.5F, -1.0F);
/*      */     
/*  569 */     this.gunModel[8].addShapeBox(-2.0F, -1.0F, -0.75F, 31, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  570 */     this.gunModel[8].setRotationPoint(-5.0F, -4.5F, 1.0F);
/*      */     
/*  572 */     this.gunModel[9].addShapeBox(-2.0F, -1.0F, -0.75F, 30, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  573 */     this.gunModel[9].setRotationPoint(14.0F, -6.25F, 0.25F);
/*      */     
/*  575 */     this.gunModel[10].addShapeBox(-2.0F, -1.0F, -0.75F, 33, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  576 */     this.gunModel[10].setRotationPoint(-5.0F, -3.0F, 0.0F);
/*      */     
/*  578 */     this.gunModel[11].addShapeBox(-2.0F, -1.0F, -0.75F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, -0.125F, 0.0F, -1.0F, -0.125F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -1.0F, -0.125F, -0.5F, -1.0F, -0.125F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  579 */     this.gunModel[11].setRotationPoint(14.0F, -6.0F, 1.0F);
/*      */     
/*  581 */     this.gunModel[12].addShapeBox(-2.0F, -1.0F, -0.75F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  582 */     this.gunModel[12].setRotationPoint(14.0F, -6.0F, -1.0F);
/*      */     
/*  584 */     this.gunModel[13].addShapeBox(-2.0F, -1.0F, -0.75F, 14, 1, 1, 0.0F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.625F, -0.125F, -0.25F, 0.625F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.625F, -0.125F, -0.5F, 0.625F);
/*  585 */     this.gunModel[13].setRotationPoint(-2.0F, -8.5F, 0.0F);
/*      */     
/*  587 */     this.gunModel[14].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  588 */     this.gunModel[14].setRotationPoint(30.0F, -6.25F, -1.0F);
/*      */     
/*  590 */     this.gunModel[15].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/*  591 */     this.gunModel[15].setRotationPoint(30.0F, -6.25F, 1.0F);
/*      */     
/*  593 */     this.gunModel[16].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  594 */     this.gunModel[16].setRotationPoint(30.0F, -7.5F, -0.5F);
/*      */     
/*  596 */     this.gunModel[17].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F);
/*  597 */     this.gunModel[17].setRotationPoint(30.0F, -6.25F, 1.25F);
/*      */     
/*  599 */     this.gunModel[18].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/*  600 */     this.gunModel[18].setRotationPoint(30.0F, -6.25F, -0.75F);
/*      */     
/*  602 */     this.gunModel[19].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.25F, 0.0F, -0.625F, -0.25F);
/*  603 */     this.gunModel[19].setRotationPoint(30.0F, -5.0F, -0.5F);
/*      */     
/*  605 */     this.gunModel[20].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  606 */     this.gunModel[20].setRotationPoint(28.0F, -4.0F, -1.0F);
/*      */     
/*  608 */     this.gunModel[21].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F);
/*  609 */     this.gunModel[21].setRotationPoint(28.0F, -4.0F, 1.0F);
/*      */     
/*  611 */     this.gunModel[22].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.375F, 0.0F, 0.25F);
/*  612 */     this.gunModel[22].setRotationPoint(28.0F, -5.25F, -0.5F);
/*      */     
/*  614 */     this.gunModel[23].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.375F, 0.0F, 0.25F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F);
/*  615 */     this.gunModel[23].setRotationPoint(28.0F, -2.75F, -0.5F);
/*      */     
/*  617 */     this.gunModel[24].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F);
/*  618 */     this.gunModel[24].setRotationPoint(28.0F, -4.0F, 1.25F);
/*      */     
/*  620 */     this.gunModel[25].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F);
/*  621 */     this.gunModel[25].setRotationPoint(28.0F, -4.0F, -0.75F);
/*      */     
/*  623 */     this.gunModel[26].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.375F, -0.875F, -1.25F, 0.0F, -0.875F, -1.25F, 0.0F, -0.875F, -0.75F, -0.375F, -0.875F, -0.75F, -0.375F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/*  624 */     this.gunModel[26].setRotationPoint(28.0F, -5.5F, -0.5F);
/*      */     
/*  626 */     this.gunModel[27].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  627 */     this.gunModel[27].setRotationPoint(29.0F, -4.25F, 0.25F);
/*      */     
/*  629 */     this.gunModel[28].addShapeBox(-2.0F, -1.0F, -0.75F, 9, 1, 2, 0.0F, 0.0F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F);
/*  630 */     this.gunModel[28].setRotationPoint(-3.0F, -2.5F, -0.25F);
/*      */     
/*  632 */     this.gunModel[29].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F);
/*  633 */     this.gunModel[29].setRotationPoint(30.0F, -4.88F, -0.5F);
/*      */     
/*  635 */     this.gunModel[30].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.5F, -0.625F, 0.0F, -0.5F, -0.625F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F);
/*  636 */     this.gunModel[30].setRotationPoint(30.0F, -4.38F, -0.5F);
/*      */     
/*  638 */     this.gunModel[31].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, -0.25F, -0.625F, 0.0F, -0.25F, -0.625F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F);
/*  639 */     this.gunModel[31].setRotationPoint(30.0F, -3.88F, -0.5F);
/*      */     
/*  641 */     this.gunModel[32].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.25F, -0.625F, 0.0F, 0.25F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, 0.0F, -1.0F, -0.875F, 0.0F, -1.0F, -0.875F, 0.0F, -1.0F, -0.375F, 0.0F, -1.0F, -0.375F);
/*  642 */     this.gunModel[32].setRotationPoint(30.0F, -2.88F, -0.5F);
/*      */     
/*  644 */     this.gunModel[33].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 6, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  645 */     this.gunModel[33].setRotationPoint(16.0F, -6.0F, 1.25F);
/*      */     
/*  647 */     this.gunModel[34].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 6, 1, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  648 */     this.gunModel[34].setRotationPoint(14.0F, -6.0F, 1.25F);
/*      */     
/*  650 */     this.gunModel[35].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -1.5F, -1.0F, 0.125F, -1.125F, -1.0F, 0.125F, -1.125F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.125F, -0.5F, -1.0F, 0.125F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  651 */     this.gunModel[35].setRotationPoint(14.0F, -6.25F, 1.25F);
/*      */     
/*  653 */     this.gunModel[36].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.125F, -1.625F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, -0.125F, -1.625F, 0.25F, -0.125F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F);
/*  654 */     this.gunModel[36].setRotationPoint(15.0F, -6.75F, 1.25F);
/*      */     
/*  656 */     this.gunModel[37].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  657 */     this.gunModel[37].setRotationPoint(22.0F, -6.0F, 1.25F);
/*      */     
/*  659 */     this.gunModel[38].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  660 */     this.gunModel[38].setRotationPoint(22.0F, -4.0F, 1.25F);
/*      */     
/*  662 */     this.gunModel[39].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  663 */     this.gunModel[39].setRotationPoint(23.0F, -5.0F, 1.25F);
/*      */     
/*  665 */     this.gunModel[40].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  666 */     this.gunModel[40].setRotationPoint(22.0F, -5.0F, 1.25F);
/*      */     
/*  668 */     this.gunModel[41].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F);
/*  669 */     this.gunModel[41].setRotationPoint(23.0F, -4.0F, 1.25F);
/*      */     
/*  671 */     this.gunModel[42].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  672 */     this.gunModel[42].setRotationPoint(22.0F, -4.75F, 1.25F);
/*      */     
/*  674 */     this.gunModel[43].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -1.5F, -1.0F, 0.125F, -1.125F, -1.0F, 0.125F, -1.125F, 0.375F, 0.0F, -1.5F, 0.375F, 0.0F, -0.125F, -1.0F, 0.125F, -0.5F, -1.0F, 0.125F, -0.5F, 0.0F, 0.0F, -0.125F, 0.0F);
/*  675 */     this.gunModel[43].setRotationPoint(14.0F, -6.25F, 1.75F);
/*      */     
/*  677 */     this.gunModel[44].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.125F, -1.625F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.375F, -0.125F, -1.625F, 0.375F, -0.125F, 0.0F, -1.0F, 0.375F, -1.0F, -1.0F, 0.375F, -1.0F, 0.0F, -0.125F, 0.0F, 0.0F);
/*  678 */     this.gunModel[44].setRotationPoint(15.0F, -6.75F, 1.75F);
/*      */     
/*  680 */     this.gunModel[45].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F);
/*  681 */     this.gunModel[45].setRotationPoint(16.0F, -6.0F, 1.5F);
/*      */     
/*  683 */     this.gunModel[46].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 6, 1, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  684 */     this.gunModel[46].setRotationPoint(14.0F, -6.0F, 1.5F);
/*      */     
/*  686 */     this.gunModel[47].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.125F, -1.625F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, -0.125F, -1.625F, 0.25F, -0.125F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F);
/*  687 */     this.gunModel[47].setRotationPoint(15.0F, -6.75F, 1.5F);
/*      */     
/*  689 */     this.gunModel[48].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  690 */     this.gunModel[48].setRotationPoint(22.0F, -6.0F, 1.5F);
/*      */     
/*  692 */     this.gunModel[49].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  693 */     this.gunModel[49].setRotationPoint(22.0F, -4.75F, 1.5F);
/*      */     
/*  695 */     this.gunModel[50].addShapeBox(-2.0F, -1.0F, -0.75F, 7, 2, 1, 0.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F);
/*  696 */     this.gunModel[50].setRotationPoint(15.0F, -4.75F, 1.5F);
/*      */     
/*  698 */     this.gunModel[51].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  699 */     this.gunModel[51].setRotationPoint(15.0F, -2.0F, 1.5F);
/*      */     
/*  701 */     this.gunModel[52].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 2, 1, 0.0F, 0.0F, -0.125F, -1.0F, 0.5F, -0.125F, -1.0F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.125F, -1.0F, 0.5F, -1.125F, -1.0F, 0.5F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F);
/*  702 */     this.gunModel[52].setRotationPoint(15.0F, -3.38F, 1.5F);
/*      */     
/*  704 */     this.gunModel[53].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.12F, -1.0F, 0.0F, -1.12F, -1.0F, 0.0F, -1.12F, 0.25F, 0.0F, -1.12F, 0.25F);
/*  705 */     this.gunModel[53].setRotationPoint(16.0F, -5.26F, 1.5F);
/*      */     
/*  707 */     this.gunModel[54].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.37F, -1.0F, 0.0F, -0.37F, -1.0F, 0.0F, -0.37F, 0.25F, 0.0F, -0.37F, 0.25F, 0.0F, -1.125F, -1.0F, 0.0F, -1.125F, -1.0F, 0.0F, -1.125F, 0.25F, 0.0F, -1.125F, 0.25F);
/*  708 */     this.gunModel[54].setRotationPoint(15.0F, -5.25F, 1.5F);
/*      */     
/*  710 */     this.gunModel[55].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 3, 1, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.995F, -1.0F, 0.0F, -0.995F, -1.0F, 0.0F, -0.995F, 0.25F, -0.5F, -0.995F, 0.25F);
/*  711 */     this.gunModel[55].setRotationPoint(21.0F, -4.0F, 1.5F);
/*      */     
/*  713 */     this.gunModel[56].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  714 */     this.gunModel[56].setRotationPoint(14.0F, -2.0F, 1.75F);
/*      */     
/*  716 */     this.gunModel[57].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  717 */     this.gunModel[57].setRotationPoint(14.0F, -1.5F, 1.75F);
/*      */     
/*  719 */     this.gunModel[58].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  720 */     this.gunModel[58].setRotationPoint(14.0F, -2.0F, 1.75F);
/*      */     
/*  722 */     this.gunModel[59].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  723 */     this.gunModel[59].setRotationPoint(14.5F, -2.0F, 1.75F);
/*      */     
/*  725 */     this.gunModel[60].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, 0.5F);
/*  726 */     this.gunModel[60].setRotationPoint(19.0F, -2.0F, 1.75F);
/*      */     
/*  728 */     this.gunModel[61].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, 0.5F);
/*  729 */     this.gunModel[61].setRotationPoint(19.0F, -1.5F, 1.75F);
/*      */     
/*  731 */     this.gunModel[62].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.5F);
/*  732 */     this.gunModel[62].setRotationPoint(19.0F, -2.0F, 1.75F);
/*      */     
/*  734 */     this.gunModel[63].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 6, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  735 */     this.gunModel[63].setRotationPoint(19.0F, -6.0F, 1.25F);
/*      */     
/*  737 */     this.gunModel[64].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 2, 1, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -0.5F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -1.0F, -0.5F, 0.25F);
/*  738 */     this.gunModel[64].setRotationPoint(18.0F, -2.0F, 1.5F);
/*      */     
/*  740 */     this.gunModel[65].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/*  741 */     this.gunModel[65].setRotationPoint(22.0F, -2.5F, 1.25F);
/*      */     
/*  743 */     this.gunModel[66].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  744 */     this.gunModel[66].setRotationPoint(22.0F, -2.5F, 2.0F);
/*      */     
/*  746 */     this.gunModel[67].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  747 */     this.gunModel[67].setRotationPoint(22.0F, -2.0F, 2.0F);
/*      */     
/*  749 */     this.gunModel[68].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  750 */     this.gunModel[68].setRotationPoint(22.0F, -1.5F, 2.0F);
/*      */     
/*  752 */     this.gunModel[69].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 6, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  753 */     this.gunModel[69].setRotationPoint(15.0F, -6.0F, -2.0F);
/*      */     
/*  755 */     this.gunModel[70].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -1.5F, -1.0F, -0.5F, -1.125F, -1.0F, -0.5F, -1.125F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  756 */     this.gunModel[70].setRotationPoint(14.0F, -6.25F, -2.25F);
/*      */     
/*  758 */     this.gunModel[71].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  759 */     this.gunModel[71].setRotationPoint(22.0F, -6.0F, -2.0F);
/*      */     
/*  761 */     this.gunModel[72].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  762 */     this.gunModel[72].setRotationPoint(22.0F, -4.0F, -2.75F);
/*      */     
/*  764 */     this.gunModel[73].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  765 */     this.gunModel[73].setRotationPoint(23.0F, -5.0F, -2.5F);
/*      */     
/*  767 */     this.gunModel[74].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  768 */     this.gunModel[74].setRotationPoint(22.0F, -5.0F, -2.5F);
/*      */     
/*  770 */     this.gunModel[75].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F);
/*  771 */     this.gunModel[75].setRotationPoint(23.0F, -4.0F, -2.5F);
/*      */     
/*  773 */     this.gunModel[76].addShapeBox(-2.0F, -1.0F, -0.75F, 7, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F);
/*  774 */     this.gunModel[76].setRotationPoint(15.0F, -6.0F, -2.25F);
/*      */     
/*  776 */     this.gunModel[77].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 6, 1, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  777 */     this.gunModel[77].setRotationPoint(14.0F, -6.0F, -2.0F);
/*      */     
/*  779 */     this.gunModel[78].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  780 */     this.gunModel[78].setRotationPoint(22.0F, -6.0F, -2.25F);
/*      */     
/*  782 */     this.gunModel[79].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  783 */     this.gunModel[79].setRotationPoint(22.0F, -4.75F, -2.25F);
/*      */     
/*  785 */     this.gunModel[80].addShapeBox(-2.0F, -1.0F, -0.75F, 7, 2, 1, 0.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F);
/*  786 */     this.gunModel[80].setRotationPoint(15.0F, -4.75F, -2.25F);
/*      */     
/*  788 */     this.gunModel[81].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.125F, 0.25F, 0.0F, -0.125F, 0.25F, 0.0F, -1.25F, -1.0F, 0.5F, -1.25F, -1.0F, 0.5F, -1.125F, 0.25F, 0.0F, -1.125F, 0.25F);
/*  789 */     this.gunModel[81].setRotationPoint(15.0F, -3.38F, -2.25F);
/*      */     
/*  791 */     this.gunModel[82].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 3, 1, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.995F, -1.0F, 0.0F, -0.995F, -1.0F, 0.0F, -0.995F, 0.25F, -0.5F, -0.995F, 0.25F);
/*  792 */     this.gunModel[82].setRotationPoint(21.0F, -4.0F, -2.25F);
/*      */     
/*  794 */     this.gunModel[83].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  795 */     this.gunModel[83].setRotationPoint(14.0F, -2.0F, -1.25F);
/*      */     
/*  797 */     this.gunModel[84].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  798 */     this.gunModel[84].setRotationPoint(14.0F, -1.5F, -1.25F);
/*      */     
/*  800 */     this.gunModel[85].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  801 */     this.gunModel[85].setRotationPoint(14.0F, -2.0F, -2.75F);
/*      */     
/*  803 */     this.gunModel[86].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  804 */     this.gunModel[86].setRotationPoint(14.5F, -2.0F, -2.25F);
/*      */     
/*  806 */     this.gunModel[87].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.375F, 0.0F, -0.125F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  807 */     this.gunModel[87].setRotationPoint(19.0F, -2.0F, -1.25F);
/*      */     
/*  809 */     this.gunModel[88].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.375F, 0.0F, -0.125F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  810 */     this.gunModel[88].setRotationPoint(19.0F, -1.5F, -1.25F);
/*      */     
/*  812 */     this.gunModel[89].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  813 */     this.gunModel[89].setRotationPoint(19.0F, -2.0F, -1.25F);
/*      */     
/*  815 */     this.gunModel[90].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 6, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  816 */     this.gunModel[90].setRotationPoint(19.0F, -6.0F, -2.0F);
/*      */     
/*  818 */     this.gunModel[91].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 2, 1, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -0.5F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -1.0F, -0.5F, 0.25F);
/*  819 */     this.gunModel[91].setRotationPoint(18.0F, -2.0F, -2.25F);
/*      */     
/*  821 */     this.gunModel[92].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/*  822 */     this.gunModel[92].setRotationPoint(22.0F, -2.5F, -2.5F);
/*      */     
/*  824 */     this.gunModel[93].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  825 */     this.gunModel[93].setRotationPoint(22.0F, -2.5F, -1.5F);
/*      */     
/*  827 */     this.gunModel[94].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  828 */     this.gunModel[94].setRotationPoint(22.0F, -2.0F, -1.5F);
/*      */     
/*  830 */     this.gunModel[95].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  831 */     this.gunModel[95].setRotationPoint(22.0F, -1.5F, -1.5F);
/*      */     
/*  833 */     this.gunModel[96].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  834 */     this.gunModel[96].setRotationPoint(15.0F, -2.0F, -2.25F);
/*      */     
/*  836 */     this.gunModel[97].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 6, 1, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  837 */     this.gunModel[97].setRotationPoint(14.0F, -6.0F, -2.25F);
/*      */     
/*  839 */     this.gunModel[98].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.12F, -1.0F, 0.0F, -1.12F, -1.0F, 0.0F, -1.12F, 0.25F, 0.0F, -1.12F, 0.25F);
/*  840 */     this.gunModel[98].setRotationPoint(15.0F, -5.26F, -2.25F);
/*      */     
/*  842 */     this.gunModel[99].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -1.5F, -1.0F, -0.5F, -1.5F, -1.0F, -0.5F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, -1.0F, -0.5F, -1.5F, -1.0F, -0.5F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F);
/*  843 */     this.gunModel[99].setRotationPoint(14.5F, -6.25F, -2.25F);
/*      */     
/*  845 */     this.gunModel[100].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  846 */     this.gunModel[100].setRotationPoint(25.0F, -6.0F, 1.25F);
/*      */     
/*  848 */     this.gunModel[101].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  849 */     this.gunModel[101].setRotationPoint(25.0F, -6.0F, 1.5F);
/*      */     
/*  851 */     this.gunModel[102].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  852 */     this.gunModel[102].setRotationPoint(25.0F, -6.0F, -2.0F);
/*      */     
/*  854 */     this.gunModel[103].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  855 */     this.gunModel[103].setRotationPoint(25.0F, -6.0F, -2.25F);
/*      */     
/*  857 */     this.gunModel[104].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  858 */     this.gunModel[104].setRotationPoint(12.0F, -6.0F, -1.0F);
/*      */     
/*  860 */     this.gunModel[105].addShapeBox(-2.0F, -1.0F, -0.75F, 17, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F);
/*  861 */     this.gunModel[105].setRotationPoint(-5.0F, -6.0F, -1.5F);
/*      */     
/*  863 */     this.gunModel[106].addShapeBox(-2.0F, -1.0F, -0.75F, 17, 1, 1, 0.0F, 0.0F, 0.125F, -0.75F, 0.0F, 0.125F, -0.75F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  864 */     this.gunModel[106].setRotationPoint(-5.0F, -4.75F, -1.5F);
/*      */     
/*  866 */     this.gunModel[107].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F);
/*  867 */     this.gunModel[107].setRotationPoint(7.0F, -5.75F, -1.5F);
/*      */     
/*  869 */     this.gunModel[108].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F);
/*  870 */     this.gunModel[108].setRotationPoint(10.0F, -5.75F, -1.5F);
/*      */     
/*  872 */     this.gunModel[109].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F);
/*  873 */     this.gunModel[109].setRotationPoint(10.0F, -5.75F, -1.37F);
/*      */     
/*  875 */     this.gunModel[110].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, -0.125F, -0.333F, 0.0F, -0.125F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, -0.125F, 0.0F, -0.666F, -0.125F);
/*  876 */     this.gunModel[110].setRotationPoint(11.0F, -5.75F, -2.87F);
/*      */     
/*  878 */     this.gunModel[111].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, -0.125F, 0.0F, -0.666F, -0.125F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, -0.125F, -0.333F, 0.0F, -0.125F);
/*  879 */     this.gunModel[111].setRotationPoint(11.0F, -5.75F, -2.87F);
/*      */     
/*  881 */     this.gunModel[112].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, -0.125F, 0.0F, -0.666F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F);
/*  882 */     this.gunModel[112].setRotationPoint(11.0F, -6.08F, -2.87F);
/*      */     
/*  884 */     this.gunModel[113].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, -0.75F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F);
/*  885 */     this.gunModel[113].setRotationPoint(5.0F, -1.5F, -0.25F);
/*      */     
/*  887 */     this.gunModel[114].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 2, 0.0F, -0.25F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F);
/*  888 */     this.gunModel[114].setRotationPoint(2.0F, 0.5F, -0.25F);
/*      */     
/*  890 */     this.gunModel[115].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.375F, -0.25F, 0.5F, -0.375F, -0.25F, 0.5F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -0.75F, -0.375F);
/*  891 */     this.gunModel[115].setRotationPoint(5.0F, 0.5F, -0.25F);
/*      */     
/*  893 */     this.gunModel[116].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, -1.0F, 0.0F, 0.0F);
/*  894 */     this.gunModel[116].setRotationPoint(0.5F, -1.5F, -0.25F);
/*      */     
/*  896 */     this.gunModel[117].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 5, 2, 0.0F, -0.95F, 0.0F, 0.0F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, -1.0F, 0.0F, 0.0F, 1.0F, -0.12F, 0.0F, -1.4F, 0.03F, -0.375F, -1.4F, 0.03F, -0.375F, 1.0F, -0.12F, 0.0F);
/*  897 */     this.gunModel[117].setRotationPoint(0.5F, -0.5F, -0.25F);
/*      */     
/*  899 */     this.gunModel[118].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5714286F, 0.0F, -1.5F, -0.125F, 0.0F, -1.5F, -0.125F, 0.0F, 2.0F, -0.5714286F, 0.0F);
/*  900 */     this.gunModel[118].setRotationPoint(-1.0F, -0.5F, -0.25F);
/*      */     
/*  902 */     this.gunModel[119].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 5, 2, 0.0F, -2.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.75F, -0.74142855F, -0.5F, -1.5F, -0.5714286F, 0.0F, -1.5F, -0.5714286F, 0.0F, 0.75F, -0.74642855F, -0.5F);
/*  903 */     this.gunModel[119].setRotationPoint(-3.5F, -0.5F, -0.25F);
/*      */     
/*  905 */     this.gunModel[120].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  906 */     this.gunModel[120].setRotationPoint(-1.0F, -1.5F, -0.25F);
/*      */     
/*  908 */     this.gunModel[121].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -1.125F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.125F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.75F, -0.5F, -0.5F);
/*  909 */     this.gunModel[121].setRotationPoint(-3.5F, -1.5F, -0.25F);
/*      */     
/*  911 */     this.gunModel[122].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -1.75F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, -2.0F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -2.0F, -0.5F, -0.5F);
/*  912 */     this.gunModel[122].setRotationPoint(-3.5F, -1.0F, -0.25F);
/*      */     
/*  914 */     this.gunModel[123].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  915 */     this.gunModel[123].setRotationPoint(12.0F, -7.0F, -0.75F);
/*      */     
/*  917 */     this.gunModel[124].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  918 */     this.gunModel[124].setRotationPoint(12.0F, -7.75F, 1.25F);
/*      */     
/*  920 */     this.gunModel[125].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  921 */     this.gunModel[125].setRotationPoint(12.0F, -7.75F, -0.75F);
/*      */     
/*  923 */     this.gunModel[126].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  924 */     this.gunModel[126].setRotationPoint(12.0F, -7.75F, -0.5F);
/*      */     
/*  926 */     this.gunModel[127].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  927 */     this.gunModel[127].setRotationPoint(13.0F, -8.0F, -0.25F);
/*      */     
/*  929 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  930 */     this.gunModel[''].setRotationPoint(13.0F, -8.0F, 0.5F);
/*      */     
/*  932 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  933 */     this.gunModel[''].setRotationPoint(13.0F, -8.25F, -0.25F);
/*      */     
/*  935 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  936 */     this.gunModel[''].setRotationPoint(13.0F, -8.25F, 0.75F);
/*      */     
/*  938 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.25F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F, 0.0F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  939 */     this.gunModel[''].setRotationPoint(12.0F, -8.0F, -0.5F);
/*      */     
/*  941 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.375F, -0.875F, -0.25F, -0.375F, -0.875F, -0.25F, -0.375F, -0.875F, 0.0F, -0.375F, -0.875F, 0.0F, -0.25F, -0.005F, -0.25F, 0.0F, -0.005F, -0.25F, 0.0F, -0.005F, 0.0F, -0.25F, -0.005F, 0.0F);
/*  942 */     this.gunModel[''].setRotationPoint(12.0F, -8.87F, -0.5F);
/*      */     
/*  944 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -0.25F, -0.625F, -0.125F, -0.25F, -0.625F, -0.125F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.625F, -0.625F, -0.25F, -0.625F, -0.625F, -0.25F, -0.125F, -0.5F, -0.25F);
/*  945 */     this.gunModel[''].setRotationPoint(12.5F, -8.0F, -1.0F);
/*      */     
/*  947 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  948 */     this.gunModel[''].setRotationPoint(12.0F, -8.0F, -1.0F);
/*      */     
/*  950 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -0.5F, -0.625F, -0.125F, -0.5F, -0.625F, -0.125F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.5F, -0.5F, -0.625F, -0.625F, -0.5F, -0.625F, -0.625F, 0.0F, -0.125F, -0.5F, 0.0F);
/*  951 */     this.gunModel[''].setRotationPoint(12.5F, -8.0F, 1.75F);
/*      */     
/*  953 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  954 */     this.gunModel[''].setRotationPoint(12.0F, -8.0F, 1.75F);
/*      */     
/*  956 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.375F, -0.125F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.625F, -0.375F, -0.125F, -0.625F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.625F, -0.25F, -0.25F, -0.625F);
/*  957 */     this.gunModel[''].setRotationPoint(13.0F, -8.5F, 0.0F);
/*      */     
/*  959 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.375F, -0.125F, -0.375F, 0.125F, -0.375F, -0.375F, 0.125F, -0.375F, -0.5F, -0.375F, -0.125F, -0.5F, -0.25F, -0.25F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  960 */     this.gunModel[''].setRotationPoint(13.0F, -8.5F, 0.5F);
/*      */     
/*  962 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.375F, -0.125F, -0.125F, 0.125F, -0.375F, -0.125F, 0.125F, -0.375F, -0.375F, -0.375F, -0.125F, -0.375F, -0.36F, -0.75F, -0.125F, 0.1F, -0.5F, -0.125F, 0.1F, -0.5F, -0.375F, -0.36F, -0.75F, -0.375F);
/*  963 */     this.gunModel[''].setRotationPoint(13.0F, -8.5F, 0.25F);
/*      */     
/*  965 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.625F, -0.25F, -0.125F, 0.125F, -0.375F, -0.125F, 0.125F, -0.375F, 0.25F, -0.625F, -0.25F, 0.25F, -0.61F, -0.625F, -0.125F, 0.1F, -0.5F, -0.125F, 0.1F, -0.5F, 0.25F, -0.61F, -0.625F, 0.25F);
/*  966 */     this.gunModel[''].setRotationPoint(13.0F, -8.67F, 0.13F);
/*      */     
/*  968 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.625F, -0.25F, -0.125F, 0.125F, -0.375F, -0.125F, 0.125F, -0.375F, -0.75F, -0.625F, -0.25F, -0.75F, -0.485F, 0.25F, -0.125F, -0.025F, 0.25F, -0.125F, -0.025F, 0.25F, -0.75F, -0.485F, 0.25F, -0.75F);
/*  969 */     this.gunModel[''].setRotationPoint(13.0F, -8.67F, 2.25F);
/*      */     
/*  971 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.86F, 0.25F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.75F, -0.86F, 0.25F, -0.75F);
/*  972 */     this.gunModel[''].setRotationPoint(13.0F, -7.67F, 2.25F);
/*      */     
/*  974 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.875F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -1.235F, 0.25F, -0.125F, 0.35F, 0.25F, -0.125F, 0.35F, 0.25F, -0.5F, -1.235F, 0.25F, -0.5F);
/*  975 */     this.gunModel[''].setRotationPoint(12.5F, -7.67F, 2.25F);
/*      */     
/*  977 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.875F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.075F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -1.235F, 0.25F, -0.25F, 0.35F, 0.25F, -0.25F, 0.275F, 0.0F, -0.5F, -1.16F, 0.0F, -0.5F);
/*  978 */     this.gunModel[''].setRotationPoint(12.5F, -7.67F, 2.5F);
/*      */     
/*  980 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, 0.5F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.5F, -0.125F, 0.5F, -0.5F, -0.125F, 0.5F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F);
/*  981 */     this.gunModel[''].setRotationPoint(8.5F, -8.5F, 1.5F);
/*      */     
/*  983 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.625F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.375F, -0.625F, -0.25F, -0.875F, -0.625F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.375F, -0.625F, -0.5F, -0.875F);
/*  984 */     this.gunModel[''].setRotationPoint(7.5F, -8.5F, 1.5F);
/*      */     
/*  986 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.125F, -0.625F, -0.25F, -0.125F, -0.625F, -0.25F, -0.875F, 0.0F, -0.25F, -0.375F, 0.0F, -0.5F, 0.125F, -0.625F, -0.5F, 0.125F, -0.625F, -0.5F, -0.875F, 0.0F, -0.5F, -0.375F);
/*  987 */     this.gunModel[''].setRotationPoint(10.0F, -8.5F, 1.5F);
/*      */     
/*  989 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  990 */     this.gunModel[''].setRotationPoint(8.0F, -8.0F, -1.0F);
/*      */     
/*  992 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  993 */     this.gunModel[''].setRotationPoint(10.0F, -8.0F, -1.0F);
/*      */     
/*  995 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.5F, 0.125F, 0.5F, -0.5F, 0.125F, 0.5F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F);
/*  996 */     this.gunModel[''].setRotationPoint(8.5F, -8.5F, -1.0F);
/*      */     
/*  998 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.625F, -0.25F, -0.875F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, -0.125F, -0.625F, -0.25F, -0.125F, -0.625F, -0.5F, -0.875F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F);
/*  999 */     this.gunModel[''].setRotationPoint(7.5F, -8.5F, -1.0F);
/*      */     
/* 1001 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.375F, -0.625F, -0.25F, -0.875F, -0.625F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.5F, -0.375F, -0.625F, -0.5F, -0.875F, -0.625F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F);
/* 1002 */     this.gunModel[''].setRotationPoint(10.0F, -8.5F, -1.0F);
/*      */     
/* 1004 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1005 */     this.gunModel[''].setRotationPoint(10.5F, -8.0F, -1.0F);
/*      */     
/* 1007 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1008 */     this.gunModel[''].setRotationPoint(8.5F, -8.0F, -1.0F);
/*      */     
/* 1010 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 1011 */     this.gunModel[''].setRotationPoint(8.5F, -7.5F, -1.0F);
/*      */     
/* 1013 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1014 */     this.gunModel[''].setRotationPoint(7.5F, -8.0F, -1.5F);
/*      */     
/* 1016 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1017 */     this.gunModel[''].setRotationPoint(10.0F, -8.0F, -1.75F);
/*      */     
/* 1019 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 1.0F, -0.875F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1020 */     this.gunModel[''].setRotationPoint(-4.0F, -6.75F, -1.5F);
/*      */     
/* 1022 */     this.gunModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 17, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1023 */     this.gunModel[''].setRotationPoint(-5.0F, -7.0F, 1.0F);
/*      */     
/* 1025 */     this.gunModel[' '].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F);
/* 1026 */     this.gunModel[' '].setRotationPoint(7.0F, -6.5F, -1.5F);
/*      */     
/* 1028 */     this.gunModel['¡'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.625F, -0.5F, -1.0F, -0.625F, -0.5F, -1.0F, -0.625F, -0.25F, 0.0F, -0.625F, -0.25F, 0.0F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F);
/* 1029 */     this.gunModel['¡'].setRotationPoint(7.5F, -6.5F, -1.5F);
/*      */     
/* 1031 */     this.gunModel['¢'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1032 */     this.gunModel['¢'].setRotationPoint(7.0F, -7.25F, -1.5F);
/*      */     
/* 1034 */     this.gunModel['£'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 1.0F, -0.875F, -0.25F, 0.125F, -0.875F, -0.25F, 0.125F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1035 */     this.gunModel['£'].setRotationPoint(1.0F, -6.75F, -1.5F);
/*      */     
/* 1037 */     this.gunModel['¤'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.25F, 0.125F, -0.875F, 0.0F, 0.125F, -0.875F, 0.0F, 0.125F, 0.0F, 0.25F, 0.125F, 0.0F, 0.25F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1038 */     this.gunModel['¤'].setRotationPoint(3.0F, -6.75F, -1.5F);
/*      */     
/* 1040 */     this.gunModel['¥'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1041 */     this.gunModel['¥'].setRotationPoint(5.5F, -7.75F, -1.5F);
/*      */     
/* 1043 */     this.gunModel['¦'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.25F, 0.125F, -0.875F, 0.0F, 1.0F, -0.875F, 0.0F, 1.0F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1044 */     this.gunModel['¦'].setRotationPoint(3.75F, -6.75F, -1.5F);
/*      */     
/* 1046 */     this.gunModel['§'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.875F, 0.5F, -0.75F, -0.875F, 0.5F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -0.875F, 0.5F, -1.0F, -0.875F, 0.5F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1047 */     this.gunModel['§'].setRotationPoint(6.25F, -7.75F, -1.5F);
/*      */     
/* 1049 */     this.gunModel['¨'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.375F, -0.5F, 0.0F, 0.375F, -0.5F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, -0.625F, 0.375F, -0.5F, -0.625F, 0.375F, -0.5F, -0.625F, 0.375F, 0.0F, -0.625F, 0.375F);
/* 1050 */     this.gunModel['¨'].setRotationPoint(5.5F, -2.5F, -0.25F);
/*      */     
/* 1052 */     this.gunModel['©'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, 0.125F, 0.375F, 0.125F, 0.125F, 0.375F, 0.125F, 0.125F, 0.375F, 0.0F, 0.125F, 0.375F, 0.0F, -1.0F, 0.375F, 0.125F, -1.0F, 0.375F, 0.125F, -1.0F, 0.375F, 0.0F, -1.0F, 0.375F);
/* 1053 */     this.gunModel['©'].setRotationPoint(5.5F, -2.0F, -0.25F);
/*      */     
/* 1055 */     this.gunModel['ª'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.375F, 0.125F, 0.0F, 0.375F, 0.125F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, -0.375F, -0.625F, 0.375F, -0.25F, -0.625F, 0.375F, -0.25F, -0.625F, 0.375F, -0.375F, -0.625F, 0.375F);
/* 1056 */     this.gunModel['ª'].setRotationPoint(5.5F, -2.0F, -0.25F);
/*      */     
/* 1058 */     this.gunModel['«'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F);
/* 1059 */     this.gunModel['«'].setRotationPoint(-5.0F, -2.5F, -0.25F);
/*      */     
/* 1061 */     this.gunModel['¬'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.75F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, -0.75F, -1.25F, -0.125F, 0.0F, -1.0F, -0.125F, 0.0F, -1.0F, -0.125F, -0.75F, -1.25F, -0.125F);
/* 1062 */     this.gunModel['¬'].setRotationPoint(-4.0F, -1.5F, -0.25F);
/*      */     
/* 1064 */     this.gunModel['­'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, 0.5F, -0.875F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, 0.5F, 0.5F, -0.875F, 0.5F, 0.375F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.375F, -0.125F, 0.5F);
/* 1065 */     this.gunModel['­'].setRotationPoint(-6.0F, -8.0F, -0.25F);
/*      */     
/* 1067 */     this.gunModel['®'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, 0.375F, 0.125F, 0.75F, 0.0F, 0.125F, 0.75F, 0.0F, 0.125F, 0.75F, 0.375F, 0.125F, 0.75F, 0.125F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.125F, -0.25F, 0.75F);
/* 1068 */     this.gunModel['®'].setRotationPoint(-6.0F, -6.0F, -0.25F);
/*      */     
/* 1070 */     this.gunModel['¯'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, 0.125F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.125F, -0.75F, 0.5F, -0.125F, 0.625F, 0.5F, 0.0F, 0.625F, 0.5F, 0.0F, 0.625F, 0.5F, -0.125F, 0.625F, 0.5F);
/* 1071 */     this.gunModel['¯'].setRotationPoint(-6.0F, -5.0F, -0.25F);
/*      */     
/* 1073 */     this.gunModel['°'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.125F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F, -0.125F, -0.625F, 0.25F, -0.25F, 0.375F, 0.25F, 0.0F, 0.375F, 0.25F, 0.0F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F);
/* 1074 */     this.gunModel['°'].setRotationPoint(-6.0F, -3.0F, -0.25F);
/*      */     
/* 1076 */     this.gunModel['±'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.5F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F);
/* 1077 */     this.gunModel['±'].setRotationPoint(-8.0F, -3.25F, -0.25F);
/*      */     
/* 1079 */     this.gunModel['²'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.5F, -0.5F, -0.375F, -0.45F, 0.875F, -0.375F, -0.45F, 0.875F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, 0.25F, 0.125F, -0.2F, -1.25F, 0.125F, -0.2F, -1.25F, 0.125F, 0.5F, 0.25F, 0.125F);
/* 1080 */     this.gunModel['²'].setRotationPoint(-8.0F, -6.0F, -0.25F);
/*      */     
/* 1082 */     this.gunModel['³'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 2, 0.0F, 0.0F, -0.25F, 0.125F, 0.0F, 0.75F, 0.125F, 0.0F, 0.75F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, 0.0F, -0.375F, 0.0F, -1.0F, -0.375F, 0.0F, -1.0F, -0.375F, 0.0F, 0.0F, -0.375F);
/* 1083 */     this.gunModel['³'].setRotationPoint(-13.5F, -2.25F, -0.25F);
/*      */     
/* 1085 */     this.gunModel['´'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, -0.25F, 0.125F);
/* 1086 */     this.gunModel['´'].setRotationPoint(-14.5F, -6.0F, -0.25F);
/*      */     
/* 1088 */     this.gunModel['µ'].addShapeBox(-2.0F, -1.0F, -0.75F, 8, 1, 2, 0.0F, 0.0F, -0.75F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, 0.5F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 0.5F, 0.125F);
/* 1089 */     this.gunModel['µ'].setRotationPoint(-22.5F, -7.5F, -0.25F);
/*      */     
/* 1091 */     this.gunModel['¶'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 2, 0.0F, 0.0F, -1.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -1.0F, -0.375F, 0.0F, 0.75F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, 0.75F, 0.125F);
/* 1092 */     this.gunModel['¶'].setRotationPoint(-13.5F, -5.5F, -0.25F);
/*      */     
/* 1094 */     this.gunModel['·'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 2, 2, 0.0F, 0.0F, -1.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -1.0F, 0.125F, 0.0F, 0.75F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, 0.75F, 0.125F);
/* 1095 */     this.gunModel['·'].setRotationPoint(-13.5F, -4.75F, -0.25F);
/*      */     
/* 1097 */     this.gunModel['¸'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.5F, -0.5F, 0.125F, -0.225F, 1.0F, 0.125F, -0.175F, 1.0F, 0.125F, 0.5F, -0.5F, 0.125F, 0.5F, 1.25F, 0.125F, 0.05F, 1.25F, 0.125F, 0.05F, 1.25F, 0.125F, 0.5F, 1.25F, 0.125F);
/* 1098 */     this.gunModel['¸'].setRotationPoint(-8.0F, -5.25F, -0.25F);
/*      */     
/* 1100 */     this.gunModel['¹'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 0.0F, 0.125F, -0.5F, -1.0F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, -0.5F, -1.0F, -0.375F);
/* 1101 */     this.gunModel['¹'].setRotationPoint(-14.5F, -0.75F, -0.25F);
/*      */     
/* 1103 */     this.gunModel['º'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.5F, -0.75F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, -0.5F, -0.75F, -0.375F, 0.0F, -0.25F, 0.125F, -0.5F, 0.5F, 0.125F, -0.5F, 0.5F, 0.125F, 0.0F, -0.25F, 0.125F);
/* 1104 */     this.gunModel['º'].setRotationPoint(-14.5F, -1.0F, -0.25F);
/*      */     
/* 1106 */     this.gunModel['»'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.5F, -1.0F, -0.375F, -0.5F, -1.5F, -0.375F, -0.5F, -1.5F, -0.375F, -0.5F, -1.0F, -0.375F, 0.0F, 0.0F, 0.125F, -1.0F, 0.5F, 0.125F, -1.0F, 0.5F, 0.125F, 0.0F, 0.0F, 0.125F);
/* 1107 */     this.gunModel['»'].setRotationPoint(-14.5F, -1.75F, -0.25F);
/*      */     
/* 1109 */     this.gunModel['¼'].addShapeBox(-2.0F, -1.0F, -0.75F, 8, 1, 2, 0.0F, 0.0F, 0.5F, 0.125F, 0.5F, 1.25F, 0.125F, 0.5F, 1.25F, 0.125F, 0.0F, 0.5F, 0.125F, 0.0F, -0.75F, -0.375F, 0.5F, -1.5F, -0.375F, 0.5F, -1.5F, -0.375F, 0.0F, -0.75F, -0.375F);
/* 1110 */     this.gunModel['¼'].setRotationPoint(-22.5F, 1.75F, -0.25F);
/*      */     
/* 1112 */     this.gunModel['½'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.5F, -1.0F, -0.375F, 0.0F, -1.625F, -0.375F, 0.0F, -1.625F, -0.375F, -0.5F, -1.0F, -0.375F, 0.0F, 0.0F, 0.125F, -1.0F, 0.75F, -0.375F, -1.0F, 0.75F, -0.375F, 0.0F, 0.0F, 0.125F);
/* 1113 */     this.gunModel['½'].setRotationPoint(-14.0F, -0.5F, -0.25F);
/*      */     
/* 1115 */     this.gunModel['¾'].addShapeBox(-2.0F, -1.0F, -0.75F, 8, 6, 2, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F, 2.0F, 0.125F, 0.0F, 1.3F, 0.125F, 0.0F, 1.3F, 0.125F, 0.0F, 2.0F, 0.125F);
/* 1116 */     this.gunModel['¾'].setRotationPoint(-22.5F, -6.75F, -0.25F);
/*      */     
/* 1118 */     this.gunModel['¿'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 2.5F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 2.5F, 0.125F);
/* 1119 */     this.gunModel['¿'].setRotationPoint(-14.5F, -5.25F, -0.25F);
/*      */     
/* 1121 */     this.gunModel['À'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.5F, -0.75F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -1.5F, 0.125F, -0.5F, -0.75F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, 0.55F, 0.125F, -0.5F, 0.55F, 0.125F, -0.5F, -0.25F, 0.125F);
/* 1122 */     this.gunModel['À'].setRotationPoint(-15.0F, -1.0F, -0.25F);
/*      */     
/* 1124 */     this.gunModel['Á'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F);
/* 1125 */     this.gunModel['Á'].setRotationPoint(24.25F, -3.0F, -1.0F);
/*      */     
/* 1127 */     this.gunModel['Â'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.25F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F);
/* 1128 */     this.gunModel['Â'].setRotationPoint(24.0F, -1.75F, -1.0F);
/*      */     
/* 1130 */     this.gunModel['Ã'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/* 1131 */     this.gunModel['Ã'].setRotationPoint(25.25F, -1.75F, -1.0F);
/*      */     
/* 1133 */     this.gunModel['Ä'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1134 */     this.gunModel['Ä'].setRotationPoint(24.25F, -2.0F, -1.0F);
/*      */     
/* 1136 */     this.gunModel['Å'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F);
/* 1137 */     this.gunModel['Å'].setRotationPoint(24.25F, -3.0F, 2.0F);
/*      */     
/* 1139 */     this.gunModel['Æ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.25F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F);
/* 1140 */     this.gunModel['Æ'].setRotationPoint(24.0F, -1.75F, 2.0F);
/*      */     
/* 1142 */     this.gunModel['Ç'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/* 1143 */     this.gunModel['Ç'].setRotationPoint(25.25F, -1.75F, 2.0F);
/*      */     
/* 1145 */     this.gunModel['È'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1146 */     this.gunModel['È'].setRotationPoint(24.25F, -2.0F, 2.0F);
/*      */     
/* 1148 */     this.gunModel['É'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, 0.0F, 0.75F, 0.75F, -0.75F, 0.75F, 0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1149 */     this.gunModel['É'].setRotationPoint(25.0F, -1.75F, -0.5F);
/*      */     
/* 1151 */     this.gunModel['Ê'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, 0.0F, 0.75F, 0.75F, -0.75F, 0.75F, 0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1152 */     this.gunModel['Ê'].setRotationPoint(24.25F, -1.75F, -0.5F);
/*      */     
/* 1154 */     this.gunModel['Ë'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, 0.0F, 0.75F, 0.75F, -0.5F, 0.75F, 0.75F, -0.5F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -1.5F, 0.75F, -0.5F, -1.5F, 0.75F, -0.5F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F);
/* 1155 */     this.gunModel['Ë'].setRotationPoint(24.5F, -1.75F, -0.5F);
/*      */     
/* 1157 */     this.gunModel['Ì'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, 0.0F, 0.75F, 0.75F, -0.5F, 0.75F, 0.75F, -0.5F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -1.5F, 0.75F, -0.5F, -1.5F, 0.75F, -0.5F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F);
/* 1158 */     this.gunModel['Ì'].setRotationPoint(24.5F, -1.0F, -0.5F);
/*      */     
/* 1160 */     this.gunModel['Í'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.125F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.125F, 0.0F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/* 1161 */     this.gunModel['Í'].setRotationPoint(27.0F, -6.0F, 1.0F);
/*      */     
/* 1163 */     this.gunModel['Î'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.375F, -1.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F);
/* 1164 */     this.gunModel['Î'].setRotationPoint(27.0F, -5.5F, 1.0F);
/*      */     
/* 1166 */     this.gunModel['Ï'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.125F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, 0.125F, -0.125F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/* 1167 */     this.gunModel['Ï'].setRotationPoint(27.0F, -5.0F, 1.0F);
/*      */     
/* 1169 */     this.gunModel['Ð'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F);
/* 1170 */     this.gunModel['Ð'].setRotationPoint(27.0F, -4.5F, 1.0F);
/*      */     
/* 1172 */     this.gunModel['Ñ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.625F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F);
/* 1173 */     this.gunModel['Ñ'].setRotationPoint(26.0F, -4.5F, 1.0F);
/*      */     
/* 1175 */     this.gunModel['Ò'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1176 */     this.gunModel['Ò'].setRotationPoint(26.0F, -3.5F, 1.0F);
/*      */     
/* 1178 */     this.gunModel['Ó'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1179 */     this.gunModel['Ó'].setRotationPoint(26.0F, -4.5F, 1.0F);
/*      */     
/* 1181 */     this.gunModel['Ô'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1182 */     this.gunModel['Ô'].setRotationPoint(26.75F, -4.5F, 1.0F);
/*      */     
/* 1184 */     this.gunModel['Õ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F);
/* 1185 */     this.gunModel['Õ'].setRotationPoint(27.0F, -4.5F, -1.0F);
/*      */     
/* 1187 */     this.gunModel['Ö'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.625F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F);
/* 1188 */     this.gunModel['Ö'].setRotationPoint(26.0F, -4.5F, -1.0F);
/*      */     
/* 1190 */     this.gunModel['×'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1191 */     this.gunModel['×'].setRotationPoint(26.0F, -3.5F, -1.0F);
/*      */     
/* 1193 */     this.gunModel['Ø'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1194 */     this.gunModel['Ø'].setRotationPoint(26.0F, -4.5F, -1.0F);
/*      */     
/* 1196 */     this.gunModel['Ù'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1197 */     this.gunModel['Ù'].setRotationPoint(26.75F, -4.5F, -1.0F);
/*      */     
/* 1199 */     this.gunModel['Ú'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.125F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.125F, 0.0F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/* 1200 */     this.gunModel['Ú'].setRotationPoint(27.0F, -6.0F, -1.75F);
/*      */     
/* 1202 */     this.gunModel['Û'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.375F, -1.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F);
/* 1203 */     this.gunModel['Û'].setRotationPoint(27.0F, -5.5F, -1.75F);
/*      */     
/* 1205 */     this.gunModel['Ü'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.125F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, 0.125F, -0.125F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/* 1206 */     this.gunModel['Ü'].setRotationPoint(27.0F, -5.0F, -1.75F);
/*      */     
/* 1208 */     this.gunModel['Ý'].addShapeBox(-2.0F, -1.0F, -0.75F, 9, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1209 */     this.gunModel['Ý'].setRotationPoint(14.0F, -2.5F, -0.75F);
/*      */     
/* 1211 */     this.gunModel['Þ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1212 */     this.gunModel['Þ'].setRotationPoint(27.25F, -4.5F, 1.5F);
/*      */     
/* 1214 */     this.gunModel['ß'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1215 */     this.gunModel['ß'].setRotationPoint(27.25F, -4.5F, -1.5F);
/*      */     
/* 1217 */     this.gunModel['à'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 4, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.125F, -0.75F, -0.5F, 0.125F, -0.75F, -0.5F, 0.125F, -0.75F, 0.0F, -0.125F, -0.75F, 0.0F);
/* 1218 */     this.gunModel['à'].setRotationPoint(27.25F, -2.5F, -1.5F);
/*      */     
/* 1220 */     this.gunModel['á'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 3, 0.0F, -0.75F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1221 */     this.gunModel['á'].setRotationPoint(27.25F, -4.5F, -1.0F);
/*      */     
/* 1223 */     this.gunModel['â'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, -0.75F, -0.625F, -0.625F, 0.125F, -0.625F, -0.625F, 0.125F, -0.625F, -0.125F, -0.75F, -0.625F, -0.125F, -0.75F, 0.0F, -0.625F, 0.125F, 0.0F, -0.625F, 0.125F, 0.0F, -0.125F, -0.75F, 0.0F, -0.125F);
/* 1224 */     this.gunModel['â'].setRotationPoint(27.25F, -5.5F, -1.0F);
/*      */     
/* 1226 */     this.gunModel['ã'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.625F, -0.625F, 0.125F, -0.625F, -0.625F, 0.125F, -0.625F, -0.375F, -0.75F, -0.625F, -0.375F, -0.75F, 0.125F, -0.625F, 0.125F, 0.125F, -0.625F, 0.125F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F);
/* 1227 */     this.gunModel['ã'].setRotationPoint(27.25F, -6.0F, -1.0F);
/*      */     
/* 1229 */     this.gunModel['ä'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.625F, -0.375F, 0.125F, -0.625F, -0.375F, 0.125F, -0.625F, -0.625F, -0.75F, -0.625F, -0.625F, -0.75F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, -0.625F, -0.75F, 0.125F, -0.625F);
/* 1230 */     this.gunModel['ä'].setRotationPoint(27.25F, -6.0F, 1.5F);
/*      */     
/* 1232 */     this.gunModel['å'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.375F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.125F, -0.375F, 0.0F, -0.125F, -0.375F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.125F, -0.375F, -0.375F, -0.125F);
/* 1233 */     this.gunModel['å'].setRotationPoint(27.0F, -2.25F, -1.5F);
/*      */     
/* 1235 */     this.gunModel['æ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.375F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.375F, -0.625F, 0.0F, -0.375F, -0.625F, 0.0F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F);
/* 1236 */     this.gunModel['æ'].setRotationPoint(27.0F, -2.25F, 1.5F);
/*      */     
/* 1238 */     this.gunModel['ç'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 5, 0.0F, -0.5F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
/* 1239 */     this.gunModel['ç'].setRotationPoint(27.0F, -2.25F, -2.0F);
/*      */     
/* 1241 */     this.gunModel['è'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.375F, 0.0F, 0.25F);
/* 1242 */     this.gunModel['è'].setRotationPoint(28.0F, -3.25F, -0.5F);
/*      */     
/* 1244 */     this.gunModel['é'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/* 1245 */     this.gunModel['é'].setRotationPoint(28.0F, -3.0F, 0.75F);
/*      */     
/* 1247 */     this.gunModel['ê'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F);
/* 1248 */     this.gunModel['ê'].setRotationPoint(28.0F, -3.0F, -0.25F);
/*      */     
/* 1250 */     this.gunModel['ë'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/* 1251 */     this.gunModel['ë'].setRotationPoint(28.0F, -2.75F, 0.75F);
/*      */     
/* 1253 */     this.gunModel['ì'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F);
/* 1254 */     this.gunModel['ì'].setRotationPoint(28.0F, -2.75F, -0.25F);
/*      */     
/* 1256 */     this.gunModel['í'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/* 1257 */     this.gunModel['í'].setRotationPoint(28.0F, -2.5F, 0.75F);
/*      */     
/* 1259 */     this.gunModel['î'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F);
/* 1260 */     this.gunModel['î'].setRotationPoint(28.0F, -2.5F, -0.25F);
/*      */     
/* 1262 */     this.gunModel['ï'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F);
/* 1263 */     this.gunModel['ï'].setRotationPoint(28.0F, -2.25F, 0.75F);
/*      */     
/* 1265 */     this.gunModel['ð'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.75F, -0.375F, 0.25F, -0.75F);
/* 1266 */     this.gunModel['ð'].setRotationPoint(28.0F, -2.25F, -0.25F);
/*      */     
/* 1268 */     this.gunModel['ñ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.125F, -0.75F, 0.0F, -0.125F, -0.75F, 0.0F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F);
/* 1269 */     this.gunModel['ñ'].setRotationPoint(28.0F, -1.75F, 0.75F);
/*      */     
/* 1271 */     this.gunModel['ò'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.75F, -0.375F, -0.125F, -0.75F);
/* 1272 */     this.gunModel['ò'].setRotationPoint(28.0F, -1.75F, -0.25F);
/*      */     
/* 1274 */     this.gunModel['ó'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, 0.0F, -0.375F, -0.625F, 0.0F, -0.375F, 0.125F, -0.75F, -0.25F, 0.125F, -0.75F, -0.25F, 0.125F, 0.0F, -0.375F, 0.125F, 0.0F);
/* 1275 */     this.gunModel['ó'].setRotationPoint(28.0F, -1.5F, 0.75F);
/*      */     
/* 1277 */     this.gunModel['ô'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.375F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, -0.75F, -0.375F, -0.625F, -0.75F, -0.375F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F);
/* 1278 */     this.gunModel['ô'].setRotationPoint(28.0F, -1.5F, -0.25F);
/*      */     
/* 1280 */     this.gunModel['õ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.625F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F);
/* 1281 */     this.gunModel['õ'].setRotationPoint(28.0F, -1.5F, -0.5F);
/*      */     
/* 1283 */     this.gunModel['ö'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.875F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0.0F, -0.875F, -0.75F, 0.0F, -0.625F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F);
/* 1284 */     this.gunModel['ö'].setRotationPoint(28.0F, -1.75F, -0.5F);
/*      */     
/* 1286 */     this.gunModel['÷'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F);
/* 1287 */     this.gunModel['÷'].setRotationPoint(28.0F, -1.0F, -0.5F);
/*      */     
/* 1289 */     this.gunModel['ø'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1290 */     this.gunModel['ø'].setRotationPoint(29.25F, -1.0F, -0.5F);
/*      */     
/* 1292 */     this.gunModel['ù'].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, -0.75F, 0.0F, -0.125F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F);
/* 1293 */     this.gunModel['ù'].setRotationPoint(8.0F, -8.0F, 3.0F);
/*      */     
/* 1295 */     this.gunModel['ú'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.425F, -0.125F, -0.25F, -0.275F, -0.125F, -0.25F, -0.275F, -0.125F, 0.0F, -0.425F, -0.125F, 0.0F, -0.425F, -0.575F, -0.25F, -0.275F, -0.575F, -0.25F, -0.275F, -0.575F, 0.0F, -0.425F, -0.575F, 0.0F);
/* 1296 */     this.gunModel['ú'].setRotationPoint(12.0F, -8.0F, 1.25F);
/*      */     
/* 1298 */     this.gunModel['û'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 1299 */     this.gunModel['û'].setRotationPoint(29.25F, -0.25F, -0.5F);
/*      */     
/* 1301 */     this.gunModel['ü'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F);
/* 1302 */     this.gunModel['ü'].setRotationPoint(28.0F, -0.25F, -0.5F);
/*      */     
/* 1304 */     this.gunModel['ý'].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F);
/* 1305 */     this.gunModel['ý'].setRotationPoint(8.0F, -2.5F, -0.5F);
/*      */     
/* 1307 */     this.gunModel['þ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1308 */     this.gunModel['þ'].setRotationPoint(7.75F, -2.25F, -0.5F);
/*      */     
/* 1310 */     this.gunModel['ÿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1311 */     this.gunModel['ÿ'].setRotationPoint(10.75F, -2.25F, -0.5F);
/*      */     
/* 1313 */     this.gunModel['Ā'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 10, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.5F, 4.0F, -0.625F, 0.5F, 4.0F, -0.625F, 0.5F, -5.0F, -0.5F, 0.5F, -5.0F);
/* 1314 */     this.gunModel['Ā'].setRotationPoint(28.25F, -1.0F, -0.5F);
/*      */     
/* 1316 */     this.gunModel['ā'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 10, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.5F, -5.0F, -0.625F, 0.5F, -5.0F, -0.625F, 0.5F, 4.0F, -0.5F, 0.5F, 4.0F);
/* 1317 */     this.gunModel['ā'].setRotationPoint(28.25F, -1.0F, 0.0F);
/*      */     
/* 1319 */     this.gunModel['Ă'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1320 */     this.gunModel['Ă'].setRotationPoint(27.75F, 9.5F, 5.0F);
/*      */     
/* 1322 */     this.gunModel['ă'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F);
/* 1323 */     this.gunModel['ă'].setRotationPoint(29.75F, 9.5F, 5.0F);
/*      */     
/* 1325 */     this.gunModel['Ą'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F);
/* 1326 */     this.gunModel['Ą'].setRotationPoint(27.75F, 9.5F, -5.5F);
/*      */     
/* 1328 */     this.gunModel['ą'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F);
/* 1329 */     this.gunModel['ą'].setRotationPoint(29.75F, 9.5F, -5.5F);
/*      */     
/* 1331 */     this.gunModel['Ć'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1332 */     this.gunModel['Ć'].setRotationPoint(32.0F, -4.0F, 0.25F);
/*      */     
/* 1334 */     this.gunModel['ć'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1335 */     this.gunModel['ć'].setRotationPoint(32.0F, -4.5F, -0.25F);
/*      */     
/* 1337 */     this.gunModel['Ĉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/* 1338 */     this.gunModel['Ĉ'].setRotationPoint(32.5F, -4.0F, 0.25F);
/*      */     
/* 1340 */     this.gunModel['ĉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F);
/* 1341 */     this.gunModel['ĉ'].setRotationPoint(32.5F, -4.0F, 1.75F);
/*      */     
/* 1343 */     this.gunModel['Ċ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/* 1344 */     this.gunModel['Ċ'].setRotationPoint(32.5F, -4.0F, -1.25F);
/*      */     
/* 1346 */     this.gunModel['ċ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F);
/* 1347 */     this.gunModel['ċ'].setRotationPoint(32.5F, -2.75F, 0.5F);
/*      */     
/* 1349 */     this.gunModel['Č'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1350 */     this.gunModel['Č'].setRotationPoint(32.5F, -5.25F, 0.5F);
/*      */     
/* 1352 */     this.gunModel['č'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -1.25F, -0.5F, -0.75F, -1.25F);
/* 1353 */     this.gunModel['č'].setRotationPoint(32.75F, -4.0F, 0.25F);
/*      */     
/* 1355 */     this.gunModel['Ď'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, -0.75F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F);
/* 1356 */     this.gunModel['Ď'].setRotationPoint(32.75F, -4.0F, 0.25F);
/*      */     
/* 1358 */     this.gunModel['ď'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -1.25F, -0.5F, -0.75F, -1.25F, -0.5F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F);
/* 1359 */     this.gunModel['ď'].setRotationPoint(32.75F, -4.0F, 0.25F);
/*      */     
/* 1361 */     this.gunModel['Đ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/* 1362 */     this.gunModel['Đ'].setRotationPoint(32.75F, -4.0F, 0.25F);
/*      */     
/* 1364 */     this.gunModel['đ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/* 1365 */     this.gunModel['đ'].setRotationPoint(32.75F, -4.0F, 0.23F);
/*      */     
/* 1367 */     this.gunModel['Ē'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/* 1368 */     this.gunModel['Ē'].setRotationPoint(32.5F, -4.0F, -1.5F);
/*      */     
/* 1370 */     this.gunModel['ē'].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -0.625F, 0.5F, 0.0F, -0.625F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.625F, 0.5F, -0.75F, -0.625F, 0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/* 1371 */     this.gunModel['ē'].setRotationPoint(8.0F, -6.5F, 0.5F);
/*      */     
/* 1373 */     this.gunModel['Ĕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.125F, 0.0F, -0.75F, -0.125F);
/* 1374 */     this.gunModel['Ĕ'].setRotationPoint(8.0F, -6.5F, -0.5F);
/*      */     
/* 1376 */     this.gunModel['ĕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.25F, -0.125F, 0.5F, 0.25F, -0.125F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.125F, 0.5F, -0.75F, -0.125F, 0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1377 */     this.gunModel['ĕ'].setRotationPoint(10.0F, -6.5F, -0.5F);
/*      */     
/* 1379 */     this.gunModel['Ė'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 4, 0.0F, -0.75F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 1380 */     this.gunModel['Ė'].setRotationPoint(7.0F, -6.5F, -0.75F);
/*      */     
/* 1382 */     this.gunModel['ė'].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.125F, -0.5F, 0.5F, -0.125F, -0.5F, 0.5F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F);
/* 1383 */     this.gunModel['ė'].setRotationPoint(8.0F, -6.5F, 2.5F);
/*      */     
/* 1385 */     this.gunModel['Ę'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F);
/* 1386 */     this.gunModel['Ę'].setRotationPoint(10.0F, -6.5F, -1.0F);
/*      */     
/* 1388 */     this.gunModel['ę'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, -0.75F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.25F);
/* 1389 */     this.gunModel['ę'].setRotationPoint(7.0F, -6.5F, 2.5F);
/*      */     
/* 1391 */     this.gunModel['Ě'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.25F, -0.75F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F);
/* 1392 */     this.gunModel['Ě'].setRotationPoint(7.0F, -6.25F, 2.5F);
/*      */     
/* 1394 */     this.gunModel['ě'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 4, 0.0F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1395 */     this.gunModel['ě'].setRotationPoint(11.5F, -6.5F, -0.75F);
/*      */     
/* 1397 */     this.gunModel['Ĝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.25F, 0.0F, -1.0F, -0.5F);
/* 1398 */     this.gunModel['Ĝ'].setRotationPoint(11.5F, -6.5F, 2.5F);
/*      */     
/* 1400 */     this.gunModel['ĝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 1401 */     this.gunModel['ĝ'].setRotationPoint(11.5F, -6.25F, 2.5F);
/*      */     
/* 1403 */     this.gunModel['Ğ'].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.0625F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.0625F, 0.0F, 0.25F, -1.0F);
/* 1404 */     this.gunModel['Ğ'].setRotationPoint(4.0F, -7.5F, 2.0F);
/*      */     
/* 1406 */     this.gunModel['ğ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 1407 */     this.gunModel['ğ'].setRotationPoint(6.5F, -6.5F, 2.5F);
/*      */     
/* 1409 */     this.gunModel['Ġ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 1410 */     this.gunModel['Ġ'].setRotationPoint(11.0F, -6.5F, 2.5F);
/*      */     
/* 1412 */     this.gunModel['ġ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -1.375F, -0.5F, 0.0F, -1.375F, -0.5F, 0.0F, -1.375F, -0.25F, -0.75F, -1.375F, -0.25F);
/* 1413 */     this.gunModel['ġ'].setRotationPoint(7.0F, -5.25F, 2.5F);
/*      */     
/* 1415 */     this.gunModel['Ģ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.375F, -0.5F, -0.75F, -1.375F, -0.5F, -0.75F, -1.375F, -0.25F, 0.0F, -1.375F, -0.25F);
/* 1416 */     this.gunModel['Ģ'].setRotationPoint(11.5F, -5.25F, 2.5F);
/*      */     
/* 1418 */     this.gunModel['ģ'].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 2, 0.0F, 0.375F, 0.0F, -0.5F, 0.375F, 0.0F, -0.5F, 0.375F, -1.125F, 0.25F, 0.375F, -1.125F, 0.25F, 0.375F, -0.75F, -0.5F, 0.375F, -0.75F, -0.5F, 0.375F, 0.375F, 0.15F, 0.375F, 0.375F, 0.15F);
/* 1419 */     this.gunModel['ģ'].setRotationPoint(7.75F, -6.0F, 1.75F);
/*      */     
/* 1421 */     this.gunModel['Ĥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.375F, 0.925F, -0.25F, -1.125F, 0.925F, -0.25F, -1.125F, -0.375F, 0.15F, 0.375F, -0.375F, 0.15F, 0.375F, -0.2F, -0.25F, -1.125F, -0.2F, -0.25F, -1.125F, 0.625F, -0.35F, 0.375F, 0.625F, -0.35F);
/* 1422 */     this.gunModel['Ĥ'].setRotationPoint(7.75F, -5.0F, 1.75F);
/*      */     
/* 1424 */     this.gunModel['ĥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 2, 0.0F, 0.375F, 0.2F, -0.5F, 0.375F, 0.2F, -0.5F, 0.375F, -0.6F, -0.075F, 0.375F, -0.6F, -0.075F, 0.375F, -0.95F, -0.5F, 0.375F, -0.95F, -0.5F, 0.375F, -0.125F, -0.2F, 0.375F, -0.125F, -0.2F);
/* 1425 */     this.gunModel['ĥ'].setRotationPoint(7.75F, -4.0F, 1.5F);
/*      */     
/* 1427 */     this.gunModel['Ħ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.375F, 0.925F, -0.25F, -1.125F, 0.925F, -0.25F, -1.125F, -0.375F, 0.15F, 0.375F, -0.375F, 0.15F, 0.375F, -0.2F, -0.25F, -1.125F, -0.2F, -0.25F, -1.125F, 0.625F, -0.35F, 0.375F, 0.625F, -0.35F);
/* 1428 */     this.gunModel['Ħ'].setRotationPoint(12.25F, -5.0F, 1.75F);
/*      */     
/* 1430 */     this.gunModel['ħ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 2, 0.0F, 0.375F, 0.925F, -0.25F, -1.125F, 0.925F, -0.25F, -1.125F, -0.375F, 0.025F, 0.375F, -0.375F, 0.025F, 0.375F, -0.2F, -0.25F, -1.125F, -0.2F, -0.25F, -1.125F, 0.625F, -0.475F, 0.375F, 0.625F, -0.475F);
/* 1431 */     this.gunModel['ħ'].setRotationPoint(8.0F, -5.0F, 1.75F);
/*      */     
/* 1433 */     this.gunModel['Ĩ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.375F, 0.625F, -0.4F, -1.125F, 0.625F, -0.4F, -1.325F, 0.225F, -1.0F, 0.575F, 0.225F, -1.0F, 0.375F, -0.375F, 0.125F, -1.125F, -0.375F, 0.125F, -1.325F, 0.0F, -1.5F, 0.575F, 0.0F, -1.5F);
/* 1434 */     this.gunModel['Ĩ'].setRotationPoint(7.75F, -4.0F, 3.5F);
/*      */     
/* 1436 */     this.gunModel['ĩ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, -1.125F, 0.625F, -0.4F, 0.375F, 0.625F, -0.4F, 0.575F, 0.225F, -1.0F, -1.325F, 0.225F, -1.0F, -1.125F, -0.375F, 0.125F, 0.375F, -0.375F, 0.125F, 0.575F, 0.0F, -1.5F, -1.325F, 0.0F, -1.5F);
/* 1437 */     this.gunModel['ĩ'].setRotationPoint(10.75F, -4.0F, 3.5F);
/*      */     
/* 1439 */     this.gunModel['Ī'].addShapeBox(-2.0F, -1.0F, -0.75F, 17, 2, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1440 */     this.gunModel['Ī'].setRotationPoint(-5.0F, -6.0F, 0.0F);
/*      */     
/* 1442 */     this.gunModel['ī'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F);
/* 1443 */     this.gunModel['ī'].setRotationPoint(26.5F, -5.5F, 1.0F);
/*      */     
/* 1445 */     this.gunModel['Ĭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F);
/* 1446 */     this.gunModel['Ĭ'].setRotationPoint(26.75F, -5.5F, 1.0F);
/*      */     
/* 1448 */     this.gunModel['ĭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F);
/* 1449 */     this.gunModel['ĭ'].setRotationPoint(26.5F, -5.75F, 1.0F);
/*      */     
/* 1451 */     this.gunModel['Į'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F);
/* 1452 */     this.gunModel['Į'].setRotationPoint(26.75F, -5.75F, 1.0F);
/*      */     
/* 1454 */     this.gunModel['į'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F);
/* 1455 */     this.gunModel['į'].setRotationPoint(26.5F, -5.5F, -1.75F);
/*      */     
/* 1457 */     this.gunModel['İ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F);
/* 1458 */     this.gunModel['İ'].setRotationPoint(26.75F, -5.5F, -1.75F);
/*      */     
/* 1460 */     this.gunModel['ı'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F);
/* 1461 */     this.gunModel['ı'].setRotationPoint(26.5F, -5.75F, -1.75F);
/*      */     
/* 1463 */     this.gunModel['Ĳ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F);
/* 1464 */     this.gunModel['Ĳ'].setRotationPoint(26.75F, -5.75F, -1.75F);
/*      */     
/* 1466 */     this.gunModel['ĳ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F);
/* 1467 */     this.gunModel['ĳ'].setRotationPoint(25.75F, -4.25F, 0.75F);
/*      */     
/* 1469 */     this.gunModel['Ĵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F);
/* 1470 */     this.gunModel['Ĵ'].setRotationPoint(26.0F, -4.25F, 0.75F);
/*      */     
/* 1472 */     this.gunModel['ĵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1473 */     this.gunModel['ĵ'].setRotationPoint(25.75F, -4.5F, 0.75F);
/*      */     
/* 1475 */     this.gunModel['Ķ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F);
/* 1476 */     this.gunModel['Ķ'].setRotationPoint(26.0F, -4.5F, 0.75F);
/*      */     
/* 1478 */     this.gunModel['ķ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F);
/* 1479 */     this.gunModel['ķ'].setRotationPoint(25.75F, -4.25F, -1.5F);
/*      */     
/* 1481 */     this.gunModel['ĸ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F);
/* 1482 */     this.gunModel['ĸ'].setRotationPoint(26.0F, -4.25F, -1.5F);
/*      */     
/* 1484 */     this.gunModel['Ĺ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1485 */     this.gunModel['Ĺ'].setRotationPoint(25.75F, -4.5F, -1.5F);
/*      */     
/* 1487 */     this.gunModel['ĺ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F);
/* 1488 */     this.gunModel['ĺ'].setRotationPoint(26.0F, -4.5F, -1.5F);
/*      */     
/* 1490 */     this.gunModel['Ļ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, 0.0F, 0.125F, 0.75F, -0.25F, 0.125F, 0.75F, -0.25F, 0.125F, 0.75F, 0.0F, 0.125F, 0.75F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F);
/* 1491 */     this.gunModel['Ļ'].setRotationPoint(-5.0F, -6.0F, -0.25F);
/*      */     
/* 1493 */     this.gunModel['ļ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, 0.0F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.625F, 0.5F, -0.25F, 0.625F, 0.5F, -0.25F, 0.625F, 0.5F, 0.0F, 0.625F, 0.5F);
/* 1494 */     this.gunModel['ļ'].setRotationPoint(-5.0F, -5.0F, -0.25F);
/*      */     
/* 1496 */     this.gunModel['Ľ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 2, 0.0F, 0.0F, -0.625F, 0.25F, -0.25F, -0.625F, 0.25F, -0.25F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F, 0.0F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, 0.0F, 0.375F, 0.25F);
/* 1497 */     this.gunModel['Ľ'].setRotationPoint(-5.0F, -3.0F, -0.25F);
/*      */     
/* 1499 */     this.gunModel['ľ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 2, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F);
/* 1500 */     this.gunModel['ľ'].setRotationPoint(-4.25F, -5.0F, -0.25F);
/*      */     
/* 1502 */     this.gunModel['Ŀ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.875F, 0.5F, -0.25F, -0.875F, 0.5F, -0.25F, -0.875F, -1.25F, 0.0F, -0.875F, -1.25F, 0.0F, -0.125F, 0.5F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, -1.25F, 0.0F, -0.125F, -1.25F);
/* 1503 */     this.gunModel['Ŀ'].setRotationPoint(-5.0F, -8.0F, -0.25F);
/*      */     
/* 1505 */     this.gunModel['ŀ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.875F, 0.5F, -0.25F, -0.875F, 0.5F, -0.25F, -0.875F, -1.25F, 0.0F, -0.875F, -1.25F, 0.0F, -0.125F, 0.5F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, -1.25F, 0.0F, -0.125F, -1.25F);
/* 1506 */     this.gunModel['ŀ'].setRotationPoint(-5.0F, -8.0F, 2.5F);
/*      */     
/* 1508 */     this.gunModel['Ł'].addShapeBox(-2.0F, -1.0F, -0.75F, 13, 1, 1, 0.0F, 0.375F, -0.25F, 0.0F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F, 0.5F, 0.375F, -0.25F, 0.5F, 0.375F, -0.25F, 0.0F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F, 0.5F, 0.375F, -0.25F, 0.5F);
/* 1509 */     this.gunModel['Ł'].setRotationPoint(-1.0F, -9.0F, 0.0F);
/*      */     
/* 1511 */     this.gunModel['ł'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.9F, 0.0F, -0.6F, -0.9F, 0.0F, -0.6F, -0.9F, -0.5F, -0.25F, -0.9F, -0.5F, -0.05F, 0.125F, 0.0F, -0.4F, 0.125F, 0.0F, -0.4F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F);
/* 1512 */     this.gunModel['ł'].setRotationPoint(-5.0F, -8.25F, 2.0F);
/*      */     
/* 1514 */     this.gunModel['Ń'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.9F, 0.0F, -0.6F, -0.9F, 0.0F, -0.6F, -0.9F, -0.5F, -0.25F, -0.9F, -0.5F, -0.05F, 0.125F, 0.0F, -0.4F, 0.125F, 0.0F, -0.4F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F);
/* 1515 */     this.gunModel['Ń'].setRotationPoint(-5.0F, -8.25F, -1.0F);
/*      */     
/* 1517 */     this.gunModel['ń'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1518 */     this.gunModel['ń'].setRotationPoint(7.0F, -3.75F, -1.5F);
/*      */     
/* 1520 */     this.gunModel['Ņ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.375F, -0.875F, -0.875F, -0.375F, -0.875F, -0.875F, -0.375F, -0.875F, 0.0F, -0.375F, -0.875F, 0.0F);
/* 1521 */     this.gunModel['Ņ'].setRotationPoint(7.0F, -2.75F, -1.5F);
/*      */     
/* 1523 */     this.gunModel['ņ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, -0.375F, -0.625F, -0.875F, -0.375F, -0.625F, -0.875F, -0.375F, -0.625F, 0.0F, -0.375F, -0.625F, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1524 */     this.gunModel['ņ'].setRotationPoint(7.0F, -5.0F, -1.5F);
/*      */     
/* 1526 */     this.gunModel['Ň'].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 1, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F);
/* 1527 */     this.gunModel['Ň'].setRotationPoint(7.0F, -5.0F, -1.5F);
/*      */     
/* 1529 */     this.gunModel['ň'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 0.375F, 0.0F, 0.25F, 0.375F, 0.0F, -1.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.375F, 0.0F, -1.0F, 0.375F);
/* 1530 */     this.gunModel['ň'].setRotationPoint(7.5F, -3.75F, -2.0F);
/*      */     
/* 1532 */     this.gunModel['ŉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.375F, 0.0F, 0.25F, 0.375F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.375F, 0.0F, -1.0F, 0.375F);
/* 1533 */     this.gunModel['ŉ'].setRotationPoint(9.5F, -3.25F, -2.0F);
/*      */     
/* 1535 */     this.gunModel['Ŋ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -1.26F, -0.1F, 0.25F, -1.26F, -0.1F, 0.25F, 0.375F, 0.0F, -0.25F, 0.375F, -0.1F, -0.5F, -1.26F, 0.0F, -1.0F, -1.26F, 0.0F, -1.0F, 0.375F, -0.1F, -0.5F, 0.375F);
/* 1536 */     this.gunModel['Ŋ'].setRotationPoint(7.5F, -3.75F, -2.0F);
/*      */     
/* 1538 */     this.gunModel['ŋ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.375F, -0.75F, 0.25F, 0.375F, -0.75F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.375F, -0.75F, -1.0F, 0.375F);
/* 1539 */     this.gunModel['ŋ'].setRotationPoint(9.5F, -4.05F, -2.0F);
/*      */     
/* 1541 */     this.gunModel['Ō'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.375F, -0.75F, 0.25F, 0.375F, -0.75F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.375F, -0.75F, -1.0F, 0.375F);
/* 1542 */     this.gunModel['Ō'].setRotationPoint(9.0F, -4.05F, -2.0F);
/*      */     
/* 1544 */     this.gunModel['ō'].addShapeBox(-2.0F, -1.0F, -0.75F, 10, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1545 */     this.gunModel['ō'].setRotationPoint(16.0F, -7.0F, 1.25F);
/*      */     
/* 1547 */     this.gunModel['Ŏ'].addShapeBox(-2.0F, -1.0F, -0.75F, 10, 1, 1, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1548 */     this.gunModel['Ŏ'].setRotationPoint(16.0F, -7.0F, -0.75F);
/*      */     
/* 1550 */     this.gunModel['ŏ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1551 */     this.gunModel['ŏ'].setRotationPoint(16.0F, -7.75F, -0.75F);
/*      */     
/* 1553 */     this.gunModel['Ő'].addShapeBox(-2.0F, -1.0F, -0.75F, 10, 2, 1, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1554 */     this.gunModel['Ő'].setRotationPoint(16.0F, -8.75F, -0.75F);
/*      */     
/* 1556 */     this.gunModel['ő'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1557 */     this.gunModel['ő'].setRotationPoint(16.0F, -8.25F, -0.75F);
/*      */     
/* 1559 */     this.gunModel['Œ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1560 */     this.gunModel['Œ'].setRotationPoint(25.5F, -7.75F, -0.75F);
/*      */     
/* 1562 */     this.gunModel['œ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1563 */     this.gunModel['œ'].setRotationPoint(25.5F, -8.25F, -0.75F);
/*      */     
/* 1565 */     this.gunModel['Ŕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1566 */     this.gunModel['Ŕ'].setRotationPoint(20.5F, -7.75F, -0.75F);
/*      */     
/* 1568 */     this.gunModel['ŕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1569 */     this.gunModel['ŕ'].setRotationPoint(20.5F, -8.25F, -0.75F);
/*      */     
/* 1571 */     this.gunModel['Ŗ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1572 */     this.gunModel['Ŗ'].setRotationPoint(16.5F, -7.75F, -0.75F);
/*      */     
/* 1574 */     this.gunModel['ŗ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1575 */     this.gunModel['ŗ'].setRotationPoint(16.5F, -8.25F, -0.75F);
/*      */     
/* 1577 */     this.gunModel['Ř'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1578 */     this.gunModel['Ř'].setRotationPoint(17.5F, -7.75F, -0.75F);
/*      */     
/* 1580 */     this.gunModel['ř'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1581 */     this.gunModel['ř'].setRotationPoint(17.5F, -8.25F, -0.75F);
/*      */     
/* 1583 */     this.gunModel['Ś'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1584 */     this.gunModel['Ś'].setRotationPoint(18.5F, -7.75F, -0.75F);
/*      */     
/* 1586 */     this.gunModel['ś'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1587 */     this.gunModel['ś'].setRotationPoint(18.5F, -8.25F, -0.75F);
/*      */     
/* 1589 */     this.gunModel['Ŝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1590 */     this.gunModel['Ŝ'].setRotationPoint(19.5F, -7.75F, -0.75F);
/*      */     
/* 1592 */     this.gunModel['ŝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1593 */     this.gunModel['ŝ'].setRotationPoint(19.5F, -8.25F, -0.75F);
/*      */     
/* 1595 */     this.gunModel['Ş'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1596 */     this.gunModel['Ş'].setRotationPoint(16.75F, -7.5F, -1.5F);
/*      */     
/* 1598 */     this.gunModel['ş'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1599 */     this.gunModel['ş'].setRotationPoint(16.75F, -8.0F, -1.25F);
/*      */     
/* 1601 */     this.gunModel['Š'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1602 */     this.gunModel['Š'].setRotationPoint(17.75F, -7.5F, -1.5F);
/*      */     
/* 1604 */     this.gunModel['š'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1605 */     this.gunModel['š'].setRotationPoint(17.75F, -8.0F, -1.25F);
/*      */     
/* 1607 */     this.gunModel['Ţ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1608 */     this.gunModel['Ţ'].setRotationPoint(18.75F, -7.5F, -1.5F);
/*      */     
/* 1610 */     this.gunModel['ţ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1611 */     this.gunModel['ţ'].setRotationPoint(18.75F, -8.0F, -1.25F);
/*      */     
/* 1613 */     this.gunModel['Ť'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1614 */     this.gunModel['Ť'].setRotationPoint(19.75F, -7.5F, -1.5F);
/*      */     
/* 1616 */     this.gunModel['ť'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1617 */     this.gunModel['ť'].setRotationPoint(19.75F, -8.0F, -1.25F);
/*      */     
/* 1619 */     this.gunModel['Ŧ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1620 */     this.gunModel['Ŧ'].setRotationPoint(22.0F, -7.75F, -0.75F);
/*      */     
/* 1622 */     this.gunModel['ŧ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1623 */     this.gunModel['ŧ'].setRotationPoint(22.0F, -8.25F, -0.75F);
/*      */     
/* 1625 */     this.gunModel['Ũ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1626 */     this.gunModel['Ũ'].setRotationPoint(23.0F, -7.75F, -0.75F);
/*      */     
/* 1628 */     this.gunModel['ũ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1629 */     this.gunModel['ũ'].setRotationPoint(23.0F, -8.25F, -0.75F);
/*      */     
/* 1631 */     this.gunModel['Ū'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1632 */     this.gunModel['Ū'].setRotationPoint(24.0F, -7.75F, -0.75F);
/*      */     
/* 1634 */     this.gunModel['ū'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1635 */     this.gunModel['ū'].setRotationPoint(24.0F, -8.25F, -0.75F);
/*      */     
/* 1637 */     this.gunModel['Ŭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1638 */     this.gunModel['Ŭ'].setRotationPoint(21.25F, -7.5F, -1.5F);
/*      */     
/* 1640 */     this.gunModel['ŭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1641 */     this.gunModel['ŭ'].setRotationPoint(21.25F, -8.0F, -1.25F);
/*      */     
/* 1643 */     this.gunModel['Ů'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1644 */     this.gunModel['Ů'].setRotationPoint(22.25F, -7.5F, -1.5F);
/*      */     
/* 1646 */     this.gunModel['ů'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1647 */     this.gunModel['ů'].setRotationPoint(22.25F, -8.0F, -1.25F);
/*      */     
/* 1649 */     this.gunModel['Ű'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1650 */     this.gunModel['Ű'].setRotationPoint(23.25F, -7.5F, -1.5F);
/*      */     
/* 1652 */     this.gunModel['ű'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1653 */     this.gunModel['ű'].setRotationPoint(23.25F, -8.0F, -1.25F);
/*      */     
/* 1655 */     this.gunModel['Ų'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1656 */     this.gunModel['Ų'].setRotationPoint(24.25F, -7.5F, -1.5F);
/*      */     
/* 1658 */     this.gunModel['ų'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 1659 */     this.gunModel['ų'].setRotationPoint(24.25F, -8.0F, -1.25F);
/*      */     
/* 1661 */     this.gunModel['Ŵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1662 */     this.gunModel['Ŵ'].setRotationPoint(25.0F, -7.75F, -0.75F);
/*      */     
/* 1664 */     this.gunModel['ŵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1665 */     this.gunModel['ŵ'].setRotationPoint(25.0F, -8.25F, -0.75F);
/*      */     
/* 1667 */     this.gunModel['Ŷ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1668 */     this.gunModel['Ŷ'].setRotationPoint(16.75F, -7.75F, -1.35F);
/*      */     
/* 1670 */     this.gunModel['ŷ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1671 */     this.gunModel['ŷ'].setRotationPoint(16.75F, -7.75F, -1.35F);
/*      */     
/* 1673 */     this.gunModel['Ÿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1674 */     this.gunModel['Ÿ'].setRotationPoint(16.75F, -7.75F, -0.95F);
/*      */     
/* 1676 */     this.gunModel['Ź'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1677 */     this.gunModel['Ź'].setRotationPoint(16.75F, -7.75F, -0.95F);
/*      */     
/* 1679 */     this.gunModel['ź'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1680 */     this.gunModel['ź'].setRotationPoint(17.75F, -7.75F, -1.35F);
/*      */     
/* 1682 */     this.gunModel['Ż'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1683 */     this.gunModel['Ż'].setRotationPoint(17.75F, -7.75F, -1.35F);
/*      */     
/* 1685 */     this.gunModel['ż'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1686 */     this.gunModel['ż'].setRotationPoint(17.75F, -7.75F, -0.95F);
/*      */     
/* 1688 */     this.gunModel['Ž'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1689 */     this.gunModel['Ž'].setRotationPoint(17.75F, -7.75F, -0.95F);
/*      */     
/* 1691 */     this.gunModel['ž'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1692 */     this.gunModel['ž'].setRotationPoint(18.75F, -7.75F, -1.35F);
/*      */     
/* 1694 */     this.gunModel['ſ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1695 */     this.gunModel['ſ'].setRotationPoint(18.75F, -7.75F, -1.35F);
/*      */     
/* 1697 */     this.gunModel['ƀ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1698 */     this.gunModel['ƀ'].setRotationPoint(18.75F, -7.75F, -0.95F);
/*      */     
/* 1700 */     this.gunModel['Ɓ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1701 */     this.gunModel['Ɓ'].setRotationPoint(18.75F, -7.75F, -0.95F);
/*      */     
/* 1703 */     this.gunModel['Ƃ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1704 */     this.gunModel['Ƃ'].setRotationPoint(19.75F, -7.75F, -1.35F);
/*      */     
/* 1706 */     this.gunModel['ƃ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1707 */     this.gunModel['ƃ'].setRotationPoint(19.75F, -7.75F, -1.35F);
/*      */     
/* 1709 */     this.gunModel['Ƅ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1710 */     this.gunModel['Ƅ'].setRotationPoint(19.75F, -7.75F, -0.95F);
/*      */     
/* 1712 */     this.gunModel['ƅ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1713 */     this.gunModel['ƅ'].setRotationPoint(19.75F, -7.75F, -0.95F);
/*      */     
/* 1715 */     this.gunModel['Ɔ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1716 */     this.gunModel['Ɔ'].setRotationPoint(21.25F, -7.75F, -1.35F);
/*      */     
/* 1718 */     this.gunModel['Ƈ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1719 */     this.gunModel['Ƈ'].setRotationPoint(21.25F, -7.75F, -1.35F);
/*      */     
/* 1721 */     this.gunModel['ƈ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1722 */     this.gunModel['ƈ'].setRotationPoint(21.25F, -7.75F, -0.95F);
/*      */     
/* 1724 */     this.gunModel['Ɖ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1725 */     this.gunModel['Ɖ'].setRotationPoint(21.25F, -7.75F, -0.95F);
/*      */     
/* 1727 */     this.gunModel['Ɗ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1728 */     this.gunModel['Ɗ'].setRotationPoint(22.25F, -7.75F, -1.35F);
/*      */     
/* 1730 */     this.gunModel['Ƌ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1731 */     this.gunModel['Ƌ'].setRotationPoint(22.25F, -7.75F, -1.35F);
/*      */     
/* 1733 */     this.gunModel['ƌ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1734 */     this.gunModel['ƌ'].setRotationPoint(22.25F, -7.75F, -0.95F);
/*      */     
/* 1736 */     this.gunModel['ƍ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1737 */     this.gunModel['ƍ'].setRotationPoint(22.25F, -7.75F, -0.95F);
/*      */     
/* 1739 */     this.gunModel['Ǝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1740 */     this.gunModel['Ǝ'].setRotationPoint(23.25F, -7.75F, -1.35F);
/*      */     
/* 1742 */     this.gunModel['Ə'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1743 */     this.gunModel['Ə'].setRotationPoint(23.25F, -7.75F, -1.35F);
/*      */     
/* 1745 */     this.gunModel['Ɛ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1746 */     this.gunModel['Ɛ'].setRotationPoint(23.25F, -7.75F, -0.95F);
/*      */     
/* 1748 */     this.gunModel['Ƒ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1749 */     this.gunModel['Ƒ'].setRotationPoint(23.25F, -7.75F, -0.95F);
/*      */     
/* 1751 */     this.gunModel['ƒ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1752 */     this.gunModel['ƒ'].setRotationPoint(24.25F, -7.75F, -1.35F);
/*      */     
/* 1754 */     this.gunModel['Ɠ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1755 */     this.gunModel['Ɠ'].setRotationPoint(24.25F, -7.75F, -1.35F);
/*      */     
/* 1757 */     this.gunModel['Ɣ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F);
/* 1758 */     this.gunModel['Ɣ'].setRotationPoint(24.25F, -7.75F, -0.95F);
/*      */     
/* 1760 */     this.gunModel['ƕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F);
/* 1761 */     this.gunModel['ƕ'].setRotationPoint(24.25F, -7.75F, -0.95F);
/*      */     
/* 1763 */     this.gunModel['Ɩ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1764 */     this.gunModel['Ɩ'].setRotationPoint(25.0F, -7.5F, -0.5F);
/*      */     
/* 1766 */     this.gunModel['Ɨ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1767 */     this.gunModel['Ɨ'].setRotationPoint(16.0F, -7.5F, -0.5F);
/*      */     
/* 1769 */     this.gunModel['Ƙ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1770 */     this.gunModel['Ƙ'].setRotationPoint(16.0F, -7.75F, 1.25F);
/*      */     
/* 1772 */     this.gunModel['ƙ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1773 */     this.gunModel['ƙ'].setRotationPoint(16.0F, -8.25F, 1.25F);
/*      */     
/* 1775 */     this.gunModel['ƚ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1776 */     this.gunModel['ƚ'].setRotationPoint(16.5F, -7.75F, 1.25F);
/*      */     
/* 1778 */     this.gunModel['ƛ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1779 */     this.gunModel['ƛ'].setRotationPoint(16.5F, -8.25F, 1.25F);
/*      */     
/* 1781 */     this.gunModel['Ɯ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1782 */     this.gunModel['Ɯ'].setRotationPoint(16.75F, -7.5F, 2.0F);
/*      */     
/* 1784 */     this.gunModel['Ɲ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1785 */     this.gunModel['Ɲ'].setRotationPoint(16.75F, -8.0F, 1.75F);
/*      */     
/* 1787 */     this.gunModel['ƞ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1788 */     this.gunModel['ƞ'].setRotationPoint(17.5F, -7.75F, 1.25F);
/*      */     
/* 1790 */     this.gunModel['Ɵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1791 */     this.gunModel['Ɵ'].setRotationPoint(17.5F, -8.25F, 1.25F);
/*      */     
/* 1793 */     this.gunModel['Ơ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1794 */     this.gunModel['Ơ'].setRotationPoint(16.75F, -7.75F, 1.45F);
/*      */     
/* 1796 */     this.gunModel['ơ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1797 */     this.gunModel['ơ'].setRotationPoint(16.75F, -7.75F, 1.45F);
/*      */     
/* 1799 */     this.gunModel['Ƣ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1800 */     this.gunModel['Ƣ'].setRotationPoint(16.75F, -7.75F, 1.85F);
/*      */     
/* 1802 */     this.gunModel['ƣ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1803 */     this.gunModel['ƣ'].setRotationPoint(16.75F, -7.75F, 1.85F);
/*      */     
/* 1805 */     this.gunModel['Ƥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1806 */     this.gunModel['Ƥ'].setRotationPoint(17.75F, -7.5F, 2.0F);
/*      */     
/* 1808 */     this.gunModel['ƥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1809 */     this.gunModel['ƥ'].setRotationPoint(17.75F, -8.0F, 1.75F);
/*      */     
/* 1811 */     this.gunModel['Ʀ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1812 */     this.gunModel['Ʀ'].setRotationPoint(18.5F, -7.75F, 1.25F);
/*      */     
/* 1814 */     this.gunModel['Ƨ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1815 */     this.gunModel['Ƨ'].setRotationPoint(18.5F, -8.25F, 1.25F);
/*      */     
/* 1817 */     this.gunModel['ƨ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1818 */     this.gunModel['ƨ'].setRotationPoint(17.75F, -7.75F, 1.45F);
/*      */     
/* 1820 */     this.gunModel['Ʃ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1821 */     this.gunModel['Ʃ'].setRotationPoint(17.75F, -7.75F, 1.45F);
/*      */     
/* 1823 */     this.gunModel['ƪ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1824 */     this.gunModel['ƪ'].setRotationPoint(17.75F, -7.75F, 1.85F);
/*      */     
/* 1826 */     this.gunModel['ƫ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1827 */     this.gunModel['ƫ'].setRotationPoint(17.75F, -7.75F, 1.85F);
/*      */     
/* 1829 */     this.gunModel['Ƭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1830 */     this.gunModel['Ƭ'].setRotationPoint(18.75F, -7.5F, 2.0F);
/*      */     
/* 1832 */     this.gunModel['ƭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1833 */     this.gunModel['ƭ'].setRotationPoint(18.75F, -8.0F, 1.75F);
/*      */     
/* 1835 */     this.gunModel['Ʈ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1836 */     this.gunModel['Ʈ'].setRotationPoint(19.5F, -7.75F, 1.25F);
/*      */     
/* 1838 */     this.gunModel['Ư'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1839 */     this.gunModel['Ư'].setRotationPoint(19.5F, -8.25F, 1.25F);
/*      */     
/* 1841 */     this.gunModel['ư'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1842 */     this.gunModel['ư'].setRotationPoint(18.75F, -7.75F, 1.45F);
/*      */     
/* 1844 */     this.gunModel['Ʊ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1845 */     this.gunModel['Ʊ'].setRotationPoint(18.75F, -7.75F, 1.45F);
/*      */     
/* 1847 */     this.gunModel['Ʋ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1848 */     this.gunModel['Ʋ'].setRotationPoint(18.75F, -7.75F, 1.85F);
/*      */     
/* 1850 */     this.gunModel['Ƴ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1851 */     this.gunModel['Ƴ'].setRotationPoint(18.75F, -7.75F, 1.85F);
/*      */     
/* 1853 */     this.gunModel['ƴ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1854 */     this.gunModel['ƴ'].setRotationPoint(19.75F, -7.5F, 2.0F);
/*      */     
/* 1856 */     this.gunModel['Ƶ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1857 */     this.gunModel['Ƶ'].setRotationPoint(19.75F, -8.0F, 1.75F);
/*      */     
/* 1859 */     this.gunModel['ƶ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1860 */     this.gunModel['ƶ'].setRotationPoint(19.75F, -7.75F, 1.45F);
/*      */     
/* 1862 */     this.gunModel['Ʒ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1863 */     this.gunModel['Ʒ'].setRotationPoint(19.75F, -7.75F, 1.45F);
/*      */     
/* 1865 */     this.gunModel['Ƹ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1866 */     this.gunModel['Ƹ'].setRotationPoint(19.75F, -7.75F, 1.85F);
/*      */     
/* 1868 */     this.gunModel['ƹ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1869 */     this.gunModel['ƹ'].setRotationPoint(19.75F, -7.75F, 1.85F);
/*      */     
/* 1871 */     this.gunModel['ƺ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1872 */     this.gunModel['ƺ'].setRotationPoint(20.5F, -7.75F, 1.25F);
/*      */     
/* 1874 */     this.gunModel['ƻ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1875 */     this.gunModel['ƻ'].setRotationPoint(20.5F, -8.25F, 1.25F);
/*      */     
/* 1877 */     this.gunModel['Ƽ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1878 */     this.gunModel['Ƽ'].setRotationPoint(25.0F, -7.75F, 1.25F);
/*      */     
/* 1880 */     this.gunModel['ƽ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1881 */     this.gunModel['ƽ'].setRotationPoint(25.0F, -8.25F, 1.25F);
/*      */     
/* 1883 */     this.gunModel['ƾ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1884 */     this.gunModel['ƾ'].setRotationPoint(25.5F, -7.75F, 1.25F);
/*      */     
/* 1886 */     this.gunModel['ƿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1887 */     this.gunModel['ƿ'].setRotationPoint(25.5F, -8.25F, 1.25F);
/*      */     
/* 1889 */     this.gunModel['ǀ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1890 */     this.gunModel['ǀ'].setRotationPoint(21.25F, -7.5F, 2.0F);
/*      */     
/* 1892 */     this.gunModel['ǁ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1893 */     this.gunModel['ǁ'].setRotationPoint(21.25F, -8.0F, 1.75F);
/*      */     
/* 1895 */     this.gunModel['ǂ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1896 */     this.gunModel['ǂ'].setRotationPoint(22.0F, -7.75F, 1.25F);
/*      */     
/* 1898 */     this.gunModel['ǃ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1899 */     this.gunModel['ǃ'].setRotationPoint(22.0F, -8.25F, 1.25F);
/*      */     
/* 1901 */     this.gunModel['Ǆ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1902 */     this.gunModel['Ǆ'].setRotationPoint(21.25F, -7.75F, 1.45F);
/*      */     
/* 1904 */     this.gunModel['ǅ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1905 */     this.gunModel['ǅ'].setRotationPoint(21.25F, -7.75F, 1.45F);
/*      */     
/* 1907 */     this.gunModel['ǆ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1908 */     this.gunModel['ǆ'].setRotationPoint(21.25F, -7.75F, 1.85F);
/*      */     
/* 1910 */     this.gunModel['Ǉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1911 */     this.gunModel['Ǉ'].setRotationPoint(21.25F, -7.75F, 1.85F);
/*      */     
/* 1913 */     this.gunModel['ǈ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1914 */     this.gunModel['ǈ'].setRotationPoint(22.25F, -7.5F, 2.0F);
/*      */     
/* 1916 */     this.gunModel['ǉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1917 */     this.gunModel['ǉ'].setRotationPoint(22.25F, -8.0F, 1.75F);
/*      */     
/* 1919 */     this.gunModel['Ǌ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1920 */     this.gunModel['Ǌ'].setRotationPoint(23.0F, -7.75F, 1.25F);
/*      */     
/* 1922 */     this.gunModel['ǋ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1923 */     this.gunModel['ǋ'].setRotationPoint(23.0F, -8.25F, 1.25F);
/*      */     
/* 1925 */     this.gunModel['ǌ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1926 */     this.gunModel['ǌ'].setRotationPoint(22.25F, -7.75F, 1.45F);
/*      */     
/* 1928 */     this.gunModel['Ǎ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1929 */     this.gunModel['Ǎ'].setRotationPoint(22.25F, -7.75F, 1.45F);
/*      */     
/* 1931 */     this.gunModel['ǎ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1932 */     this.gunModel['ǎ'].setRotationPoint(22.25F, -7.75F, 1.85F);
/*      */     
/* 1934 */     this.gunModel['Ǐ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1935 */     this.gunModel['Ǐ'].setRotationPoint(22.25F, -7.75F, 1.85F);
/*      */     
/* 1937 */     this.gunModel['ǐ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1938 */     this.gunModel['ǐ'].setRotationPoint(23.25F, -7.5F, 2.0F);
/*      */     
/* 1940 */     this.gunModel['Ǒ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1941 */     this.gunModel['Ǒ'].setRotationPoint(23.25F, -8.0F, 1.75F);
/*      */     
/* 1943 */     this.gunModel['ǒ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1944 */     this.gunModel['ǒ'].setRotationPoint(24.0F, -7.75F, 1.25F);
/*      */     
/* 1946 */     this.gunModel['Ǔ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1947 */     this.gunModel['Ǔ'].setRotationPoint(24.0F, -8.25F, 1.25F);
/*      */     
/* 1949 */     this.gunModel['ǔ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1950 */     this.gunModel['ǔ'].setRotationPoint(23.25F, -7.75F, 1.45F);
/*      */     
/* 1952 */     this.gunModel['Ǖ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1953 */     this.gunModel['Ǖ'].setRotationPoint(23.25F, -7.75F, 1.45F);
/*      */     
/* 1955 */     this.gunModel['ǖ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1956 */     this.gunModel['ǖ'].setRotationPoint(23.25F, -7.75F, 1.85F);
/*      */     
/* 1958 */     this.gunModel['Ǘ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1959 */     this.gunModel['Ǘ'].setRotationPoint(23.25F, -7.75F, 1.85F);
/*      */     
/* 1961 */     this.gunModel['ǘ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1962 */     this.gunModel['ǘ'].setRotationPoint(24.25F, -7.5F, 2.0F);
/*      */     
/* 1964 */     this.gunModel['Ǚ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1965 */     this.gunModel['Ǚ'].setRotationPoint(24.25F, -8.0F, 1.75F);
/*      */     
/* 1967 */     this.gunModel['ǚ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F);
/* 1968 */     this.gunModel['ǚ'].setRotationPoint(24.25F, -7.75F, 1.45F);
/*      */     
/* 1970 */     this.gunModel['Ǜ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.05F, -0.75F, -0.6F, -0.05F);
/* 1971 */     this.gunModel['Ǜ'].setRotationPoint(24.25F, -7.75F, 1.45F);
/*      */     
/* 1973 */     this.gunModel['ǜ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.25F, -0.75F, -0.6F, -0.25F, -0.75F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1974 */     this.gunModel['ǜ'].setRotationPoint(24.25F, -7.75F, 1.85F);
/*      */     
/* 1976 */     this.gunModel['ǝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.6F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.6F, -0.3F, -0.75F, -0.6F, -0.3F, -0.6F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F);
/* 1977 */     this.gunModel['ǝ'].setRotationPoint(24.25F, -7.75F, 1.85F);
/*      */     
/* 1979 */     this.gunModel['Ǟ'].addShapeBox(-2.0F, -1.0F, -0.75F, 10, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1980 */     this.gunModel['Ǟ'].setRotationPoint(16.0F, -8.75F, 1.0F);
/*      */     
/* 1982 */     this.gunModel['ǟ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1983 */     this.gunModel['ǟ'].setRotationPoint(16.0F, -8.75F, 0.25F);
/*      */     
/* 1985 */     this.gunModel['Ǡ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 1986 */     this.gunModel['Ǡ'].setRotationPoint(17.0F, -8.75F, 0.25F);
/*      */     
/* 1988 */     this.gunModel['ǡ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 1989 */     this.gunModel['ǡ'].setRotationPoint(18.0F, -8.75F, 0.25F);
/*      */     
/* 1991 */     this.gunModel['Ǣ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 1992 */     this.gunModel['Ǣ'].setRotationPoint(19.0F, -8.75F, 0.25F);
/*      */     
/* 1994 */     this.gunModel['ǣ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 2, 1, 0.0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 1995 */     this.gunModel['ǣ'].setRotationPoint(20.0F, -8.75F, 0.25F);
/*      */     
/* 1997 */     this.gunModel['Ǥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 1998 */     this.gunModel['Ǥ'].setRotationPoint(21.5F, -8.75F, 0.25F);
/*      */     
/* 2000 */     this.gunModel['ǥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2001 */     this.gunModel['ǥ'].setRotationPoint(22.5F, -8.75F, 0.25F);
/*      */     
/* 2003 */     this.gunModel['Ǧ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2004 */     this.gunModel['Ǧ'].setRotationPoint(23.5F, -8.75F, 0.25F);
/*      */     
/* 2006 */     this.gunModel['ǧ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2007 */     this.gunModel['ǧ'].setRotationPoint(25.0F, -8.75F, 0.25F);
/*      */     
/* 2009 */     this.gunModel['Ǩ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2010 */     this.gunModel['Ǩ'].setRotationPoint(19.5F, -8.75F, 0.25F);
/*      */     
/* 2012 */     this.gunModel['ǩ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2013 */     this.gunModel['ǩ'].setRotationPoint(20.0F, -8.75F, 0.25F);
/*      */     
/* 2015 */     this.gunModel['Ǫ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2016 */     this.gunModel['Ǫ'].setRotationPoint(20.0F, -8.75F, 0.25F);
/*      */     
/* 2018 */     this.gunModel['ǫ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2019 */     this.gunModel['ǫ'].setRotationPoint(19.5F, -8.75F, 0.25F);
/*      */     
/* 2021 */     this.gunModel['Ǭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2022 */     this.gunModel['Ǭ'].setRotationPoint(18.5F, -8.75F, 0.25F);
/*      */     
/* 2024 */     this.gunModel['ǭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2025 */     this.gunModel['ǭ'].setRotationPoint(19.0F, -8.75F, 0.25F);
/*      */     
/* 2027 */     this.gunModel['Ǯ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2028 */     this.gunModel['Ǯ'].setRotationPoint(19.0F, -8.75F, 0.25F);
/*      */     
/* 2030 */     this.gunModel['ǯ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2031 */     this.gunModel['ǯ'].setRotationPoint(18.5F, -8.75F, 0.25F);
/*      */     
/* 2033 */     this.gunModel['ǰ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2034 */     this.gunModel['ǰ'].setRotationPoint(17.5F, -8.75F, 0.25F);
/*      */     
/* 2036 */     this.gunModel['Ǳ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2037 */     this.gunModel['Ǳ'].setRotationPoint(18.0F, -8.75F, 0.25F);
/*      */     
/* 2039 */     this.gunModel['ǲ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2040 */     this.gunModel['ǲ'].setRotationPoint(18.0F, -8.75F, 0.25F);
/*      */     
/* 2042 */     this.gunModel['ǳ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2043 */     this.gunModel['ǳ'].setRotationPoint(17.5F, -8.75F, 0.25F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2048 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/* 2049 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/* 2050 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/* 2051 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/* 2052 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/* 2053 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/* 2054 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/* 2055 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 209, 121, this.textureX, this.textureY);
/* 2056 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 217, 121, this.textureX, this.textureY);
/* 2057 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/* 2058 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/* 2059 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/* 2060 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/* 2061 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 257, 121, this.textureX, this.textureY);
/* 2062 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/* 2063 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 273, 121, this.textureX, this.textureY);
/* 2064 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 281, 121, this.textureX, this.textureY);
/* 2065 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/* 2066 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 297, 121, this.textureX, this.textureY);
/* 2067 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 305, 121, this.textureX, this.textureY);
/* 2068 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/* 2069 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 409, 129, this.textureX, this.textureY);
/* 2070 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 425, 129, this.textureX, this.textureY);
/* 2071 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/* 2072 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 457, 129, this.textureX, this.textureY);
/* 2073 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/* 2074 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 313, 129, this.textureX, this.textureY);
/* 2075 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/* 2076 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 481, 129, this.textureX, this.textureY);
/* 2077 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 489, 129, this.textureX, this.textureY);
/* 2078 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 497, 129, this.textureX, this.textureY);
/* 2079 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/* 2080 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 2081 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 9, 137, this.textureX, this.textureY);
/* 2082 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 17, 137, this.textureX, this.textureY);
/* 2083 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 25, 137, this.textureX, this.textureY);
/* 2084 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 33, 137, this.textureX, this.textureY);
/* 2085 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/* 2086 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 49, 137, this.textureX, this.textureY);
/* 2087 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 57, 137, this.textureX, this.textureY);
/* 2088 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/* 2089 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 73, 137, this.textureX, this.textureY);
/* 2090 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 81, 137, this.textureX, this.textureY);
/* 2091 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 89, 137, this.textureX, this.textureY);
/* 2092 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 97, 137, this.textureX, this.textureY);
/* 2093 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 105, 137, this.textureX, this.textureY);
/* 2094 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 113, 137, this.textureX, this.textureY);
/* 2095 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 121, 137, this.textureX, this.textureY);
/* 2096 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 129, 137, this.textureX, this.textureY);
/* 2097 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/* 2098 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 145, 137, this.textureX, this.textureY);
/* 2099 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 153, 137, this.textureX, this.textureY);
/* 2100 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 161, 137, this.textureX, this.textureY);
/* 2101 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 169, 137, this.textureX, this.textureY);
/* 2102 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 177, 137, this.textureX, this.textureY);
/* 2103 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 185, 137, this.textureX, this.textureY);
/* 2104 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 193, 137, this.textureX, this.textureY);
/* 2105 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 201, 137, this.textureX, this.textureY);
/* 2106 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 209, 137, this.textureX, this.textureY);
/* 2107 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 217, 137, this.textureX, this.textureY);
/* 2108 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 225, 137, this.textureX, this.textureY);
/* 2109 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/* 2110 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 241, 137, this.textureX, this.textureY);
/* 2111 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 249, 137, this.textureX, this.textureY);
/* 2112 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/* 2113 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 265, 137, this.textureX, this.textureY);
/* 2114 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 273, 137, this.textureX, this.textureY);
/* 2115 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 281, 137, this.textureX, this.textureY);
/* 2116 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 289, 137, this.textureX, this.textureY);
/* 2117 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 297, 137, this.textureX, this.textureY);
/* 2118 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 305, 137, this.textureX, this.textureY);
/* 2119 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 313, 137, this.textureX, this.textureY);
/* 2120 */     this.gunModel['ȼ'] = new ModelRendererTurbo(this, 321, 137, this.textureX, this.textureY);
/* 2121 */     this.gunModel['Ƚ'] = new ModelRendererTurbo(this, 329, 137, this.textureX, this.textureY);
/* 2122 */     this.gunModel['Ⱦ'] = new ModelRendererTurbo(this, 337, 137, this.textureX, this.textureY);
/* 2123 */     this.gunModel['ȿ'] = new ModelRendererTurbo(this, 345, 137, this.textureX, this.textureY);
/* 2124 */     this.gunModel['ɀ'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/* 2125 */     this.gunModel['Ɂ'] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/* 2126 */     this.gunModel['ɂ'] = new ModelRendererTurbo(this, 369, 137, this.textureX, this.textureY);
/* 2127 */     this.gunModel['Ƀ'] = new ModelRendererTurbo(this, 377, 137, this.textureX, this.textureY);
/* 2128 */     this.gunModel['Ʉ'] = new ModelRendererTurbo(this, 385, 137, this.textureX, this.textureY);
/* 2129 */     this.gunModel['Ʌ'] = new ModelRendererTurbo(this, 393, 137, this.textureX, this.textureY);
/* 2130 */     this.gunModel['Ɇ'] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/* 2131 */     this.gunModel['ɇ'] = new ModelRendererTurbo(this, 409, 137, this.textureX, this.textureY);
/* 2132 */     this.gunModel['Ɉ'] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/* 2133 */     this.gunModel['ɉ'] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/* 2134 */     this.gunModel['Ɋ'] = new ModelRendererTurbo(this, 433, 137, this.textureX, this.textureY);
/* 2135 */     this.gunModel['ɋ'] = new ModelRendererTurbo(this, 441, 137, this.textureX, this.textureY);
/* 2136 */     this.gunModel['Ɍ'] = new ModelRendererTurbo(this, 449, 137, this.textureX, this.textureY);
/* 2137 */     this.gunModel['ɍ'] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/* 2138 */     this.gunModel['Ɏ'] = new ModelRendererTurbo(this, 465, 137, this.textureX, this.textureY);
/* 2139 */     this.gunModel['ɏ'] = new ModelRendererTurbo(this, 473, 137, this.textureX, this.textureY);
/* 2140 */     this.gunModel['ɐ'] = new ModelRendererTurbo(this, 481, 137, this.textureX, this.textureY);
/* 2141 */     this.gunModel['ɑ'] = new ModelRendererTurbo(this, 489, 137, this.textureX, this.textureY);
/* 2142 */     this.gunModel['ɒ'] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/* 2143 */     this.gunModel['ɓ'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/* 2144 */     this.gunModel['ɔ'] = new ModelRendererTurbo(this, 17, 145, this.textureX, this.textureY);
/* 2145 */     this.gunModel['ɕ'] = new ModelRendererTurbo(this, 33, 145, this.textureX, this.textureY);
/* 2146 */     this.gunModel['ɖ'] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/* 2147 */     this.gunModel['ɗ'] = new ModelRendererTurbo(this, 65, 145, this.textureX, this.textureY);
/* 2148 */     this.gunModel['ɘ'] = new ModelRendererTurbo(this, 81, 145, this.textureX, this.textureY);
/* 2149 */     this.gunModel['ə'] = new ModelRendererTurbo(this, 97, 145, this.textureX, this.textureY);
/* 2150 */     this.gunModel['ɚ'] = new ModelRendererTurbo(this, 113, 145, this.textureX, this.textureY);
/* 2151 */     this.gunModel['ɛ'] = new ModelRendererTurbo(this, 129, 145, this.textureX, this.textureY);
/* 2152 */     this.gunModel['ɜ'] = new ModelRendererTurbo(this, 145, 145, this.textureX, this.textureY);
/* 2153 */     this.gunModel['ɝ'] = new ModelRendererTurbo(this, 161, 145, this.textureX, this.textureY);
/* 2154 */     this.gunModel['ɞ'] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/*      */     
/* 2156 */     this.gunModel['Ǵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2157 */     this.gunModel['Ǵ'].setRotationPoint(16.5F, -8.75F, 0.25F);
/*      */     
/* 2159 */     this.gunModel['ǵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2160 */     this.gunModel['ǵ'].setRotationPoint(17.0F, -8.75F, 0.25F);
/*      */     
/* 2162 */     this.gunModel['Ƕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2163 */     this.gunModel['Ƕ'].setRotationPoint(17.0F, -8.75F, 0.25F);
/*      */     
/* 2165 */     this.gunModel['Ƿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2166 */     this.gunModel['Ƿ'].setRotationPoint(16.5F, -8.75F, 0.25F);
/*      */     
/* 2168 */     this.gunModel['Ǹ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2169 */     this.gunModel['Ǹ'].setRotationPoint(21.0F, -8.75F, 0.25F);
/*      */     
/* 2171 */     this.gunModel['ǹ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2172 */     this.gunModel['ǹ'].setRotationPoint(21.5F, -8.75F, 0.25F);
/*      */     
/* 2174 */     this.gunModel['Ǻ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2175 */     this.gunModel['Ǻ'].setRotationPoint(21.5F, -8.75F, 0.25F);
/*      */     
/* 2177 */     this.gunModel['ǻ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2178 */     this.gunModel['ǻ'].setRotationPoint(21.0F, -8.75F, 0.25F);
/*      */     
/* 2180 */     this.gunModel['Ǽ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2181 */     this.gunModel['Ǽ'].setRotationPoint(22.0F, -8.75F, 0.25F);
/*      */     
/* 2183 */     this.gunModel['ǽ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2184 */     this.gunModel['ǽ'].setRotationPoint(22.5F, -8.75F, 0.25F);
/*      */     
/* 2186 */     this.gunModel['Ǿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2187 */     this.gunModel['Ǿ'].setRotationPoint(22.5F, -8.75F, 0.25F);
/*      */     
/* 2189 */     this.gunModel['ǿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2190 */     this.gunModel['ǿ'].setRotationPoint(22.0F, -8.75F, 0.25F);
/*      */     
/* 2192 */     this.gunModel['Ȁ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2193 */     this.gunModel['Ȁ'].setRotationPoint(24.0F, -8.75F, 0.25F);
/*      */     
/* 2195 */     this.gunModel['ȁ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2196 */     this.gunModel['ȁ'].setRotationPoint(24.5F, -8.75F, 0.25F);
/*      */     
/* 2198 */     this.gunModel['Ȃ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2199 */     this.gunModel['Ȃ'].setRotationPoint(24.5F, -8.75F, 0.25F);
/*      */     
/* 2201 */     this.gunModel['ȃ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2202 */     this.gunModel['ȃ'].setRotationPoint(24.0F, -8.75F, 0.25F);
/*      */     
/* 2204 */     this.gunModel['Ȅ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F);
/* 2205 */     this.gunModel['Ȅ'].setRotationPoint(23.0F, -8.75F, 0.25F);
/*      */     
/* 2207 */     this.gunModel['ȅ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F);
/* 2208 */     this.gunModel['ȅ'].setRotationPoint(23.5F, -8.75F, 0.25F);
/*      */     
/* 2210 */     this.gunModel['Ȇ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.6F, -1.0F, -0.75F, -0.6F, -0.85F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2211 */     this.gunModel['Ȇ'].setRotationPoint(23.5F, -8.75F, 0.25F);
/*      */     
/* 2213 */     this.gunModel['ȇ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F, -1.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.75F, -0.25F, -0.85F, -0.75F, -0.25F);
/* 2214 */     this.gunModel['ȇ'].setRotationPoint(23.0F, -8.75F, 0.25F);
/*      */     
/* 2216 */     this.gunModel['Ȉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 3, 2, 0.0F, -0.75F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, -1.0F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.75F, -1.0F, -0.375F);
/* 2217 */     this.gunModel['Ȉ'].setRotationPoint(1.25F, -1.5F, -0.25F);
/*      */     
/* 2219 */     this.gunModel['ȉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.375F);
/* 2220 */     this.gunModel['ȉ'].setRotationPoint(2.25F, -1.5F, -0.25F);
/*      */     
/* 2222 */     this.gunModel['Ȋ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F);
/* 2223 */     this.gunModel['Ȋ'].setRotationPoint(2.25F, -1.25F, -0.25F);
/*      */     
/* 2225 */     this.gunModel['ȋ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -1.0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -1.0F, -0.5F, -0.375F);
/* 2226 */     this.gunModel['ȋ'].setRotationPoint(2.25F, -0.5F, -0.25F);
/*      */     
/* 2228 */     this.gunModel['Ȍ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -1.0F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, -1.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -1.25F, -0.75F, -0.375F);
/* 2229 */     this.gunModel['Ȍ'].setRotationPoint(2.25F, 0.0F, -0.25F);
/*      */     
/* 2231 */     this.gunModel['ȍ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 3, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 2232 */     this.gunModel['ȍ'].setRotationPoint(0.35F, -2.12F, -0.55F);
/*      */     
/* 2234 */     this.gunModel['Ȏ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 3, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 2235 */     this.gunModel['Ȏ'].setRotationPoint(0.35F, -2.37F, -0.55F);
/*      */     
/* 2237 */     this.gunModel['ȏ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 3, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 2238 */     this.gunModel['ȏ'].setRotationPoint(0.35F, -1.87F, -0.55F);
/*      */     
/* 2240 */     this.gunModel['Ȑ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, 0.75F, 0.75F, -0.5F, 0.75F, 0.75F, -0.5F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 2241 */     this.gunModel['Ȑ'].setRotationPoint(14.75F, -7.25F, -0.5F);
/*      */     
/* 2243 */     this.gunModel['ȑ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2244 */     this.gunModel['ȑ'].setRotationPoint(14.5F, -8.5F, -1.5F);
/*      */     
/* 2246 */     this.gunModel['Ȓ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.625F, 0.25F, -0.5F, -0.625F, 0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.625F, 0.25F, -0.5F, -0.625F, 0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2247 */     this.gunModel['Ȓ'].setRotationPoint(14.5F, -8.5F, -2.0F);
/*      */     
/* 2249 */     this.gunModel['ȓ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.625F, 0.0F, -0.5F, -0.625F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.625F, 0.0F, -0.5F, -0.625F);
/* 2250 */     this.gunModel['ȓ'].setRotationPoint(14.5F, -8.5F, -1.0F);
/*      */     
/* 2252 */     this.gunModel['Ȕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.625F, -0.5F, 0.25F, -0.625F, -0.5F, 0.25F, -0.625F, -0.5F, 0.0F, -0.625F, -0.5F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2253 */     this.gunModel['Ȕ'].setRotationPoint(14.5F, -9.0F, -1.5F);
/*      */     
/* 2255 */     this.gunModel['ȕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.625F, -0.5F, 0.25F, -0.625F, -0.5F, 0.25F, -0.625F, -0.5F, 0.0F, -0.625F, -0.5F);
/* 2256 */     this.gunModel['ȕ'].setRotationPoint(14.5F, -8.0F, -1.5F);
/*      */     
/* 2258 */     this.gunModel['Ȗ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2259 */     this.gunModel['Ȗ'].setRotationPoint(15.5F, -8.5F, -1.5F);
/*      */     
/* 2261 */     this.gunModel['ȗ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.55F, -0.5F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, -0.5F, 0.0F, -0.55F, -0.5F);
/* 2262 */     this.gunModel['ȗ'].setRotationPoint(15.5F, -8.25F, -1.5F);
/*      */     
/* 2264 */     this.gunModel['Ș'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.55F, -0.5F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, -0.5F, 0.0F, -0.55F, -0.5F, 0.0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2265 */     this.gunModel['Ș'].setRotationPoint(15.5F, -8.75F, -1.5F);
/*      */     
/* 2267 */     this.gunModel['ș'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.5F, -0.55F, 0.0F, -0.5F, -0.55F, 0.0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.5F, -0.55F, 0.0F, -0.5F, -0.55F);
/* 2268 */     this.gunModel['ș'].setRotationPoint(15.5F, -8.5F, -1.25F);
/*      */     
/* 2270 */     this.gunModel['Ț'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.25F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.25F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2271 */     this.gunModel['Ț'].setRotationPoint(15.5F, -8.5F, -1.75F);
/*      */     
/* 2273 */     this.gunModel['ț'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.375F, -0.5F, -0.125F, -0.375F, -0.5F, -0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.55F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.5F, -0.25F, -0.55F, -0.5F);
/* 2274 */     this.gunModel['ț'].setRotationPoint(17.5F, -8.25F, -1.5F);
/*      */     
/* 2276 */     this.gunModel['Ȝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.5F, -0.55F, -0.25F, -1.0F, -0.55F, -0.25F, -0.875F, -0.375F, -0.25F, -0.375F, -0.375F);
/* 2277 */     this.gunModel['Ȝ'].setRotationPoint(17.5F, -8.5F, -1.75F);
/*      */     
/* 2279 */     this.gunModel['ȝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.0F, -0.55F, -0.25F, -0.5F, -0.55F, -0.25F, -0.375F, -0.375F, -0.25F, -0.875F, -0.375F, -0.25F, -1.0F, -0.55F, -0.25F, -0.5F, -0.55F);
/* 2280 */     this.gunModel['ȝ'].setRotationPoint(17.5F, -8.5F, -1.25F);
/*      */     
/* 2282 */     this.gunModel['Ȟ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.8F, -0.5F, -0.25F, -0.55F, -0.5F, -0.25F, -0.55F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.5F, -0.125F, -0.375F);
/* 2283 */     this.gunModel['Ȟ'].setRotationPoint(17.25F, -9.0F, -1.5F);
/*      */     
/* 2285 */     this.gunModel['ȟ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 2, 1, 0.0F, -0.25F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.25F, -0.625F, -0.375F);
/* 2286 */     this.gunModel['ȟ'].setRotationPoint(17.75F, -9.75F, -1.5F);
/*      */     
/* 2288 */     this.gunModel['Ƞ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.375F, -0.5F, -0.125F, -0.375F, -0.5F, -0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.55F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.5F, -0.25F, -0.55F, -0.5F);
/* 2289 */     this.gunModel['Ƞ'].setRotationPoint(17.75F, -8.5F, -1.5F);
/*      */     
/* 2291 */     this.gunModel['ȡ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.0F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F);
/* 2292 */     this.gunModel['ȡ'].setRotationPoint(15.63F, -8.63F, -1.75F);
/* 2293 */     this.gunModel['ȡ'].rotateAngleZ = -1.5707964F;
/*      */     
/* 2295 */     this.gunModel['Ȣ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.25F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F, -0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.5F, -0.55F, -0.25F, -0.5F, -0.55F);
/* 2296 */     this.gunModel['Ȣ'].setRotationPoint(15.63F, -8.63F, -1.25F);
/* 2297 */     this.gunModel['Ȣ'].rotateAngleZ = -1.5707964F;
/*      */     
/* 2299 */     this.gunModel['ȣ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F);
/* 2300 */     this.gunModel['ȣ'].setRotationPoint(16.12F, -8.63F, -2.25F);
/* 2301 */     this.gunModel['ȣ'].rotateAngleX = -1.5707964F;
/* 2302 */     this.gunModel['ȣ'].rotateAngleZ = -1.5707964F;
/*      */     
/* 2304 */     this.gunModel['Ȥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.5F, -0.55F, 0.25F, -0.5F, -0.55F, 0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F);
/* 2305 */     this.gunModel['Ȥ'].setRotationPoint(16.13F, -8.63F, -1.25F);
/* 2306 */     this.gunModel['Ȥ'].rotateAngleX = 1.5707964F;
/* 2307 */     this.gunModel['Ȥ'].rotateAngleZ = -1.5707964F;
/*      */     
/* 2309 */     this.gunModel['ȥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2310 */     this.gunModel['ȥ'].setRotationPoint(17.1F, -11.42F, -1.63F);
/* 2311 */     this.gunModel['ȥ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2313 */     this.gunModel['Ȧ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F);
/* 2314 */     this.gunModel['Ȧ'].setRotationPoint(17.0F, -11.2F, -1.63F);
/* 2315 */     this.gunModel['Ȧ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2317 */     this.gunModel['ȧ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F);
/* 2318 */     this.gunModel['ȧ'].setRotationPoint(17.2F, -11.64F, -1.63F);
/* 2319 */     this.gunModel['ȧ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2321 */     this.gunModel['Ȩ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.5F, -0.3F, -0.6F, -0.5F, -0.45F, -0.6F, -0.5F, -0.2F, -0.2F, -0.5F, -0.05F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F);
/* 2322 */     this.gunModel['Ȩ'].setRotationPoint(17.09F, -11.97F, -1.63F);
/* 2323 */     this.gunModel['Ȩ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2325 */     this.gunModel['ȩ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.5F, -0.3F, -0.55F, -0.5F, -0.3F, -0.55F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2326 */     this.gunModel['ȩ'].setRotationPoint(16.99F, -11.75F, -1.63F);
/* 2327 */     this.gunModel['ȩ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2329 */     this.gunModel['Ȫ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.25F, -0.05F, -0.6F, -0.25F, -0.05F, -0.6F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F);
/* 2330 */     this.gunModel['Ȫ'].setRotationPoint(16.78F, -11.89F, -1.38F);
/* 2331 */     this.gunModel['Ȫ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2333 */     this.gunModel['ȫ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.6F, -0.05F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.45F, -0.3F, -0.6F, -0.3F, -0.3F, -0.25F, -0.05F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.45F, -0.3F, -0.25F, -0.3F);
/* 2334 */     this.gunModel['ȫ'].setRotationPoint(16.82F, -11.98F, -1.38F);
/* 2335 */     this.gunModel['ȫ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2337 */     this.gunModel['Ȭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.6F, -0.2F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.3F, -0.2F, -0.6F, -0.45F, -0.2F, -0.25F, -0.2F, -0.6F, -0.25F, -0.05F, -0.6F, -0.25F, -0.3F, -0.2F, -0.25F, -0.45F);
/* 2338 */     this.gunModel['Ȭ'].setRotationPoint(16.72F, -11.77F, -1.38F);
/* 2339 */     this.gunModel['Ȭ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2341 */     this.gunModel['ȭ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.5F, -0.45F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.05F, -0.6F, -0.5F, -0.2F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F);
/* 2342 */     this.gunModel['ȭ'].setRotationPoint(16.78F, -11.3F, -1.63F);
/* 2343 */     this.gunModel['ȭ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2345 */     this.gunModel['Ȯ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.45F, -0.25F, -0.4F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F, -0.45F, -0.25F, -0.15F, -0.6F, -0.5F, -0.45F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.05F, -0.6F, -0.5F, -0.2F);
/* 2346 */     this.gunModel['Ȯ'].setRotationPoint(16.64F, -11.35F, -1.63F);
/* 2347 */     this.gunModel['Ȯ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2349 */     this.gunModel['ȯ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.3F, -0.5F, -0.3F, -0.55F, -0.5F, -0.3F, -0.55F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F);
/* 2350 */     this.gunModel['ȯ'].setRotationPoint(16.85F, -11.8F, -1.63F);
/* 2351 */     this.gunModel['ȯ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2353 */     this.gunModel['Ȱ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.15F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F, -0.2F, -0.5F, -0.3F, -0.6F, -0.5F, -0.45F, -0.6F, -0.5F, -0.2F, -0.2F, -0.5F, -0.05F);
/* 2354 */     this.gunModel['Ȱ'].setRotationPoint(16.95F, -12.03F, -1.63F);
/* 2355 */     this.gunModel['Ȱ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2357 */     this.gunModel['ȱ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.4F, -0.45F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.05F, -0.6F, -0.4F, -0.2F, -0.45F, -0.25F, -0.4F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F, -0.45F, -0.25F, -0.15F);
/* 2358 */     this.gunModel['ȱ'].setRotationPoint(16.19F, -11.57F, -1.63F);
/* 2359 */     this.gunModel['ȱ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2361 */     this.gunModel['Ȳ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.25F, -0.25F, -0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F);
/* 2362 */     this.gunModel['Ȳ'].setRotationPoint(16.4F, -12.02F, -1.63F);
/* 2363 */     this.gunModel['Ȳ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2365 */     this.gunModel['ȳ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.4F, -0.3F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.05F, -0.25F, -0.25F, -0.15F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F);
/* 2366 */     this.gunModel['ȳ'].setRotationPoint(16.5F, -12.24F, -1.63F);
/* 2367 */     this.gunModel['ȳ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2369 */     this.gunModel['ȴ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.4F, -0.15F, -0.35F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, 0.15F, -0.4F, -0.15F, -0.1F, -0.6F, -0.5F, -0.45F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.05F, -0.6F, -0.5F, -0.2F);
/* 2370 */     this.gunModel['ȴ'].setRotationPoint(15.13F, -12.06F, -1.63F);
/* 2371 */     this.gunModel['ȴ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2373 */     this.gunModel['ȵ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.15F, -0.1F, -0.45F, -0.15F, -0.1F, -0.45F, -0.15F, 0.15F, -0.2F, -0.15F, 0.15F, -0.3F, -0.5F, -0.3F, -0.55F, -0.5F, -0.3F, -0.55F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F);
/* 2374 */     this.gunModel['ȵ'].setRotationPoint(15.34F, -12.51F, -1.63F);
/* 2375 */     this.gunModel['ȵ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2377 */     this.gunModel['ȶ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.15F, -0.1F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F, -0.1F, -0.3F, -0.15F, 0.15F, -0.2F, -0.5F, -0.3F, -0.6F, -0.5F, -0.45F, -0.6F, -0.5F, -0.2F, -0.2F, -0.5F, -0.05F);
/* 2378 */     this.gunModel['ȶ'].setRotationPoint(15.45F, -12.73F, -1.63F);
/* 2379 */     this.gunModel['ȶ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2381 */     this.gunModel['ȷ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.15F, -0.55F, 0.15F, -0.5F, -0.55F, 0.15F, -0.5F, -0.55F, -0.1F, -0.15F, -0.55F, -0.1F, -0.15F, -0.25F, 0.15F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, -0.1F, -0.15F, -0.25F, -0.1F);
/* 2382 */     this.gunModel['ȷ'].setRotationPoint(14.82F, -12.8F, -1.38F);
/* 2383 */     this.gunModel['ȷ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2385 */     this.gunModel['ȸ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.55F, 0.15F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.45F, -0.3F, -0.55F, -0.1F, -0.3F, -0.25F, 0.15F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.1F);
/* 2386 */     this.gunModel['ȸ'].setRotationPoint(14.91F, -12.98F, -1.38F);
/* 2387 */     this.gunModel['ȸ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2389 */     this.gunModel['ȹ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.55F, -0.2F, -0.5F, -0.55F, 0.15F, -0.5F, -0.55F, -0.1F, -0.2F, -0.55F, -0.45F, -0.2F, -0.25F, -0.1F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, -0.1F, -0.2F, -0.25F, -0.35F);
/* 2390 */     this.gunModel['ȹ'].setRotationPoint(14.67F, -12.49F, -1.38F);
/* 2391 */     this.gunModel['ȹ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2393 */     this.gunModel['Ⱥ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.4F, -0.3F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.05F, -0.3F, -0.25F, -0.1F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.2F, -0.3F, -0.25F, 0.15F);
/* 2394 */     this.gunModel['Ⱥ'].setRotationPoint(14.73F, -13.06F, -1.63F);
/* 2395 */     this.gunModel['Ⱥ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2397 */     this.gunModel['Ȼ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.4F, -0.45F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.05F, -0.6F, -0.4F, -0.2F, -0.4F, -0.25F, -0.45F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, 0.15F, -0.4F, -0.25F, -0.2F);
/* 2398 */     this.gunModel['Ȼ'].setRotationPoint(14.41F, -12.39F, -1.63F);
/* 2399 */     this.gunModel['Ȼ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2401 */     this.gunModel['ȼ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.2F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F);
/* 2402 */     this.gunModel['ȼ'].setRotationPoint(14.62F, -12.84F, -1.63F);
/* 2403 */     this.gunModel['ȼ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2405 */     this.gunModel['Ƚ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.05F, -0.05F, -0.6F, -0.05F, -0.05F, -0.6F, -0.05F, -0.3F, -0.25F, -0.05F, -0.3F);
/* 2406 */     this.gunModel['Ƚ'].setRotationPoint(14.15F, -13.12F, -1.38F);
/* 2407 */     this.gunModel['Ƚ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2409 */     this.gunModel['Ⱦ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.6F, -0.05F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.45F, -0.3F, -0.6F, -0.3F, -0.3F, -0.05F, -0.05F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.45F, -0.3F, -0.05F, -0.3F);
/* 2410 */     this.gunModel['Ⱦ'].setRotationPoint(14.19F, -13.2F, -1.38F);
/* 2411 */     this.gunModel['Ⱦ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2413 */     this.gunModel['ȿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.6F, -0.2F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.3F, -0.2F, -0.6F, -0.45F, -0.2F, -0.05F, -0.2F, -0.6F, -0.05F, -0.05F, -0.6F, -0.05F, -0.3F, -0.2F, -0.05F, -0.45F);
/* 2414 */     this.gunModel['ȿ'].setRotationPoint(14.08F, -12.99F, -1.38F);
/* 2415 */     this.gunModel['ȿ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2417 */     this.gunModel['ɀ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, 0.15F, -0.4F, -0.25F, -0.1F, -0.6F, -0.4F, -0.45F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.05F, -0.6F, -0.4F, -0.2F);
/* 2418 */     this.gunModel['ɀ'].setRotationPoint(13.91F, -12.63F, -1.63F);
/* 2419 */     this.gunModel['ɀ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2421 */     this.gunModel['Ɂ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.3F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F);
/* 2422 */     this.gunModel['Ɂ'].setRotationPoint(14.13F, -13.07F, -1.63F);
/* 2423 */     this.gunModel['Ɂ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2425 */     this.gunModel['ɂ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.25F, -0.1F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.1F, -0.3F, -0.25F, 0.15F, -0.2F, -0.4F, -0.3F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.05F);
/* 2426 */     this.gunModel['ɂ'].setRotationPoint(14.23F, -13.29F, -1.63F);
/* 2427 */     this.gunModel['ɂ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2429 */     this.gunModel['Ƀ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.05F, -0.6F, -0.5F, -0.05F, -0.6F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.25F, -0.05F, -0.6F, -0.25F, -0.05F, -0.6F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F);
/* 2430 */     this.gunModel['Ƀ'].setRotationPoint(16.1F, -12.21F, -1.37F);
/* 2431 */     this.gunModel['Ƀ'].rotateAngleY = -0.01745329F;
/* 2432 */     this.gunModel['Ƀ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2434 */     this.gunModel['Ʉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.5F, -0.05F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.45F, -0.3F, -0.5F, -0.3F, -0.3F, -0.25F, -0.05F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.45F, -0.3F, -0.25F, -0.3F);
/* 2435 */     this.gunModel['Ʉ'].setRotationPoint(16.15F, -12.3F, -1.38F);
/* 2436 */     this.gunModel['Ʉ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2438 */     this.gunModel['Ʌ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.5F, -0.2F, -0.6F, -0.5F, -0.05F, -0.6F, -0.5F, -0.3F, -0.2F, -0.5F, -0.45F, -0.2F, -0.25F, -0.2F, -0.6F, -0.25F, -0.05F, -0.6F, -0.25F, -0.3F, -0.2F, -0.25F, -0.45F);
/* 2439 */     this.gunModel['Ʌ'].setRotationPoint(16.05F, -12.08F, -1.38F);
/* 2440 */     this.gunModel['Ʌ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2442 */     this.gunModel['Ɇ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.45F, -0.25F, -0.4F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F, -0.45F, -0.25F, -0.15F, -0.6F, -0.5F, -0.45F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.05F, -0.6F, -0.5F, -0.2F);
/* 2443 */     this.gunModel['Ɇ'].setRotationPoint(15.89F, -11.71F, -1.63F);
/* 2444 */     this.gunModel['Ɇ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2446 */     this.gunModel['ɇ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.3F, -0.5F, -0.3F, -0.55F, -0.5F, -0.3F, -0.55F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F);
/* 2447 */     this.gunModel['ɇ'].setRotationPoint(16.1F, -12.16F, -1.63F);
/* 2448 */     this.gunModel['ɇ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2450 */     this.gunModel['Ɉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.15F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F, -0.2F, -0.5F, -0.3F, -0.6F, -0.5F, -0.45F, -0.6F, -0.5F, -0.2F, -0.2F, -0.5F, -0.05F);
/* 2451 */     this.gunModel['Ɉ'].setRotationPoint(16.2F, -12.39F, -1.63F);
/* 2452 */     this.gunModel['Ɉ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2454 */     this.gunModel['ɉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.6F, -0.4F, -0.45F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.05F, -0.6F, -0.4F, -0.2F, -0.45F, -0.25F, -0.4F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F, -0.45F, -0.25F, -0.15F);
/* 2455 */     this.gunModel['ɉ'].setRotationPoint(15.44F, -11.92F, -1.63F);
/* 2456 */     this.gunModel['ɉ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2458 */     this.gunModel['Ɋ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.25F, -0.25F, -0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F);
/* 2459 */     this.gunModel['Ɋ'].setRotationPoint(15.65F, -12.37F, -1.63F);
/* 2460 */     this.gunModel['Ɋ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2462 */     this.gunModel['ɋ'].addShapeBox(-2.0F, -3.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.4F, -0.3F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.05F, -0.25F, -0.25F, -0.15F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.15F, -0.25F, -0.25F, 0.1F);
/* 2463 */     this.gunModel['ɋ'].setRotationPoint(17.56F, -11.75F, -1.63F);
/* 2464 */     this.gunModel['ɋ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2466 */     this.gunModel['Ɍ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.05F, -0.6F, -0.5F, -0.05F, -0.6F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.25F, -0.05F, -0.6F, -0.25F, -0.05F, -0.6F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F);
/* 2467 */     this.gunModel['Ɍ'].setRotationPoint(15.36F, -12.56F, -1.38F);
/* 2468 */     this.gunModel['Ɍ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2470 */     this.gunModel['ɍ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.5F, -0.05F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.45F, -0.3F, -0.5F, -0.3F, -0.3F, -0.25F, -0.05F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.45F, -0.3F, -0.25F, -0.3F);
/* 2471 */     this.gunModel['ɍ'].setRotationPoint(15.4F, -12.65F, -1.38F);
/* 2472 */     this.gunModel['ɍ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2474 */     this.gunModel['Ɏ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.5F, -0.2F, -0.6F, -0.5F, -0.05F, -0.6F, -0.5F, -0.3F, -0.2F, -0.5F, -0.45F, -0.2F, -0.25F, -0.2F, -0.6F, -0.25F, -0.05F, -0.6F, -0.25F, -0.3F, -0.2F, -0.25F, -0.45F);
/* 2475 */     this.gunModel['Ɏ'].setRotationPoint(15.3F, -12.43F, -1.38F);
/* 2476 */     this.gunModel['Ɏ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2478 */     this.gunModel['ɏ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.15F, -0.55F, 0.15F, -0.5F, -0.55F, 0.15F, -0.5F, -0.55F, -0.1F, -0.15F, -0.55F, -0.1F, -0.15F, -0.25F, 0.15F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, -0.1F, -0.15F, -0.25F, -0.1F);
/* 2479 */     this.gunModel['ɏ'].setRotationPoint(13.7F, -13.32F, -1.38F);
/* 2480 */     this.gunModel['ɏ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2482 */     this.gunModel['ɐ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.3F, -0.55F, 0.15F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.45F, -0.3F, -0.55F, -0.1F, -0.3F, -0.25F, 0.15F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.1F);
/* 2483 */     this.gunModel['ɐ'].setRotationPoint(13.78F, -13.5F, -1.38F);
/* 2484 */     this.gunModel['ɐ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2486 */     this.gunModel['ɑ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.55F, -0.2F, -0.5F, -0.55F, 0.15F, -0.5F, -0.55F, -0.1F, -0.2F, -0.55F, -0.45F, -0.2F, -0.25F, -0.1F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, -0.1F, -0.2F, -0.25F, -0.35F);
/* 2487 */     this.gunModel['ɑ'].setRotationPoint(13.54F, -13.02F, -1.38F);
/* 2488 */     this.gunModel['ɑ'].rotateAngleZ = 1.134464F;
/*      */     
/* 2490 */     this.gunModel['ɒ'].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 1, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 2491 */     this.gunModel['ɒ'].setRotationPoint(15.0F, -2.5F, 1.5F);
/*      */     
/* 2493 */     this.gunModel['ɓ'].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 2494 */     this.gunModel['ɓ'].setRotationPoint(15.0F, -4.25F, 1.5F);
/*      */     
/* 2496 */     this.gunModel['ɔ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 2497 */     this.gunModel['ɔ'].setRotationPoint(17.0F, -5.5F, 1.5F);
/*      */     
/* 2499 */     this.gunModel['ɕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F);
/* 2500 */     this.gunModel['ɕ'].setRotationPoint(17.0F, -4.75F, 1.5F);
/*      */     
/* 2502 */     this.gunModel['ɖ'].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 2503 */     this.gunModel['ɖ'].setRotationPoint(16.0F, -5.5F, -1.0F);
/*      */     
/* 2505 */     this.gunModel['ɗ'].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 1, 1, 0.0F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, -1.0F);
/* 2506 */     this.gunModel['ɗ'].setRotationPoint(16.0F, -4.75F, -1.0F);
/*      */     
/* 2508 */     this.gunModel['ɘ'].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 2509 */     this.gunModel['ɘ'].setRotationPoint(15.0F, -2.5F, -1.0F);
/*      */     
/* 2511 */     this.gunModel['ə'].addShapeBox(-2.0F, -1.0F, -0.75F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 2512 */     this.gunModel['ə'].setRotationPoint(15.0F, -4.25F, -1.0F);
/*      */     
/* 2514 */     this.gunModel['ɚ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2515 */     this.gunModel['ɚ'].setRotationPoint(14.5F, -2.0F, -2.5F);
/*      */     
/* 2517 */     this.gunModel['ɛ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.375F, -1.0F, -0.5F, -0.375F, -1.0F, -0.5F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F);
/* 2518 */     this.gunModel['ɛ'].setRotationPoint(14.5F, -2.0F, 2.0F);
/*      */     
/* 2520 */     this.gunModel['ɜ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.875F, -1.0F, -0.5F, -0.875F, -1.0F, -0.5F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2521 */     this.gunModel['ɜ'].setRotationPoint(14.5F, -2.0F, 2.0F);
/*      */     
/* 2523 */     this.gunModel['ɝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -1.0F, 0.0F, -0.375F, -1.0F);
/* 2524 */     this.gunModel['ɝ'].setRotationPoint(14.5F, -2.0F, -1.5F);
/*      */     
/* 2526 */     this.gunModel['ɞ'].addShapeBox(-2.0F, -1.0F, -0.75F, 5, 1, 1, 0.0F, 0.0F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, -1.0F, 0.0F, -0.875F, -1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2527 */     this.gunModel['ɞ'].setRotationPoint(14.5F, -2.0F, -1.5F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2532 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 313, 121, this.textureX, this.textureY);
/* 2533 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 329, 121, this.textureX, this.textureY);
/* 2534 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/* 2535 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 345, 121, this.textureX, this.textureY);
/* 2536 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 353, 121, this.textureX, this.textureY);
/* 2537 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/* 2538 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/* 2539 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 377, 121, this.textureX, this.textureY);
/* 2540 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 385, 121, this.textureX, this.textureY);
/* 2541 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 393, 121, this.textureX, this.textureY);
/* 2542 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 401, 121, this.textureX, this.textureY);
/* 2543 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 409, 121, this.textureX, this.textureY);
/* 2544 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 417, 121, this.textureX, this.textureY);
/* 2545 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 425, 121, this.textureX, this.textureY);
/* 2546 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 433, 121, this.textureX, this.textureY);
/* 2547 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 441, 121, this.textureX, this.textureY);
/* 2548 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/* 2549 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/* 2550 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 465, 121, this.textureX, this.textureY);
/* 2551 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/* 2552 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 481, 121, this.textureX, this.textureY);
/* 2553 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 489, 121, this.textureX, this.textureY);
/* 2554 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/* 2555 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 505, 121, this.textureX, this.textureY);
/* 2556 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 2557 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 9, 129, this.textureX, this.textureY);
/* 2558 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 17, 129, this.textureX, this.textureY);
/* 2559 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 25, 129, this.textureX, this.textureY);
/* 2560 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 33, 129, this.textureX, this.textureY);
/* 2561 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 41, 129, this.textureX, this.textureY);
/* 2562 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 49, 129, this.textureX, this.textureY);
/* 2563 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 57, 129, this.textureX, this.textureY);
/* 2564 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 65, 129, this.textureX, this.textureY);
/* 2565 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/* 2566 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/* 2567 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/* 2568 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/* 2569 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 105, 129, this.textureX, this.textureY);
/* 2570 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/* 2571 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 121, 129, this.textureX, this.textureY);
/* 2572 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 129, 129, this.textureX, this.textureY);
/* 2573 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 137, 129, this.textureX, this.textureY);
/* 2574 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/* 2575 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 153, 129, this.textureX, this.textureY);
/* 2576 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 161, 129, this.textureX, this.textureY);
/* 2577 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 169, 129, this.textureX, this.textureY);
/* 2578 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 177, 129, this.textureX, this.textureY);
/* 2579 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/* 2580 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 193, 129, this.textureX, this.textureY);
/* 2581 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 201, 129, this.textureX, this.textureY);
/* 2582 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/* 2583 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/* 2584 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 225, 129, this.textureX, this.textureY);
/* 2585 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/* 2586 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/* 2587 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/* 2588 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 249, 129, this.textureX, this.textureY);
/* 2589 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/* 2590 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/* 2591 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/* 2592 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/* 2593 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/* 2594 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/* 2595 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/* 2596 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 329, 129, this.textureX, this.textureY);
/* 2597 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 337, 129, this.textureX, this.textureY);
/* 2598 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 345, 129, this.textureX, this.textureY);
/* 2599 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 353, 129, this.textureX, this.textureY);
/* 2600 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 361, 129, this.textureX, this.textureY);
/* 2601 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 369, 129, this.textureX, this.textureY);
/* 2602 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 377, 129, this.textureX, this.textureY);
/* 2603 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 385, 129, this.textureX, this.textureY);
/* 2604 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 393, 129, this.textureX, this.textureY);
/*      */     
/* 2606 */     this.defaultScopeModel[0].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, -0.5F, 0.25F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F);
/* 2607 */     this.defaultScopeModel[0].setRotationPoint(29.75F, -7.75F, -0.25F);
/*      */     
/* 2609 */     this.defaultScopeModel[1].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F, -0.5F, 0.25F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F);
/* 2610 */     this.defaultScopeModel[1].setRotationPoint(29.75F, -9.0F, 0.25F);
/*      */     
/* 2612 */     this.defaultScopeModel[2].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.6F, -0.65F, 0.0F, -0.6F, -0.65F, 0.0F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F);
/* 2613 */     this.defaultScopeModel[2].setRotationPoint(29.75F, -9.0F, 0.5F);
/*      */     
/* 2615 */     this.defaultScopeModel[3].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, -0.6F, -0.65F, -0.5F, -0.6F, -0.65F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F);
/* 2616 */     this.defaultScopeModel[3].setRotationPoint(29.75F, -9.0F, 0.0F);
/*      */     
/* 2618 */     this.defaultScopeModel[4].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.3F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F);
/* 2619 */     this.defaultScopeModel[4].setRotationPoint(30.25F, -10.0F, 0.25F);
/*      */     
/* 2621 */     this.defaultScopeModel[5].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F);
/* 2622 */     this.defaultScopeModel[5].setRotationPoint(29.75F, -9.55F, 0.85F);
/*      */     
/* 2624 */     this.defaultScopeModel[6].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 2625 */     this.defaultScopeModel[6].setRotationPoint(29.75F, -10.05F, 0.85F);
/*      */     
/* 2627 */     this.defaultScopeModel[7].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 2628 */     this.defaultScopeModel[7].setRotationPoint(29.75F, -10.5F, 0.85F);
/*      */     
/* 2630 */     this.defaultScopeModel[8].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 2631 */     this.defaultScopeModel[8].setRotationPoint(29.75F, -9.55F, -0.35F);
/*      */     
/* 2633 */     this.defaultScopeModel[9].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.25F, -0.35F, 0.0F, -0.25F, -0.35F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/* 2634 */     this.defaultScopeModel[9].setRotationPoint(29.75F, -10.05F, -0.4F);
/*      */     
/* 2636 */     this.defaultScopeModel[10].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 2637 */     this.defaultScopeModel[10].setRotationPoint(29.75F, -10.5F, -0.35F);
/*      */     
/* 2639 */     this.defaultScopeModel[11].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
/* 2640 */     this.defaultScopeModel[11].setRotationPoint(29.75F, -10.5F, 0.4F);
/*      */     
/* 2642 */     this.defaultScopeModel[12].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.35F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.1F, 0.35F, -0.25F, 0.1F, 0.35F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, 0.35F, 0.0F, 0.1F);
/* 2643 */     this.defaultScopeModel[12].setRotationPoint(-2.25F, -9.0F, 0.75F);
/*      */     
/* 2645 */     this.defaultScopeModel[13].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.1F, -0.25F, -0.75F, 0.1F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 2646 */     this.defaultScopeModel[13].setRotationPoint(-2.25F, -9.75F, 0.75F);
/*      */     
/* 2648 */     this.defaultScopeModel[14].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0.1F, -0.25F, -0.75F, 0.1F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 2649 */     this.defaultScopeModel[14].setRotationPoint(-2.25F, -10.0F, 0.75F);
/*      */     
/* 2651 */     this.defaultScopeModel[15].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.4F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.4F, 0.0F, 0.1F);
/* 2652 */     this.defaultScopeModel[15].setRotationPoint(-3.0F, -9.75F, 0.75F);
/*      */     
/* 2654 */     this.defaultScopeModel[16].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 2655 */     this.defaultScopeModel[16].setRotationPoint(-4.0F, -10.25F, 0.75F);
/*      */     
/* 2657 */     this.defaultScopeModel[17].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.15F, -0.25F, -0.75F, 0.15F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 2658 */     this.defaultScopeModel[17].setRotationPoint(-5.0F, -9.0F, 0.75F);
/*      */     
/* 2660 */     this.defaultScopeModel[18].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, 0.15F, -0.5F, -0.75F, 0.15F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, 0.0F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 2661 */     this.defaultScopeModel[18].setRotationPoint(-5.0F, -9.75F, 0.75F);
/*      */     
/* 2663 */     this.defaultScopeModel[19].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 2664 */     this.defaultScopeModel[19].setRotationPoint(-5.0F, -10.25F, 0.75F);
/*      */     
/* 2666 */     this.defaultScopeModel[20].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.1F, -1.0F, -0.75F, 0.1F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F);
/* 2667 */     this.defaultScopeModel[20].setRotationPoint(-5.0F, -10.5F, 0.75F);
/*      */     
/* 2669 */     this.defaultScopeModel[21].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 2670 */     this.defaultScopeModel[21].setRotationPoint(-4.25F, -10.25F, 0.75F);
/*      */     
/* 2672 */     this.defaultScopeModel[22].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.75F, -0.1F, -0.25F, -0.75F, -0.1F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F);
/* 2673 */     this.defaultScopeModel[22].setRotationPoint(-4.35F, -9.5F, 0.75F);
/*      */     
/* 2675 */     this.defaultScopeModel[23].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F, -0.5F, -0.25F, -0.75F, -0.1F, -0.25F, -0.75F, -0.1F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F);
/* 2676 */     this.defaultScopeModel[23].setRotationPoint(-4.35F, -8.9F, 0.75F);
/*      */     
/* 2678 */     this.defaultScopeModel[24].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.1F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.1F, -0.1F, -0.25F, 0.1F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F);
/* 2679 */     this.defaultScopeModel[24].setRotationPoint(-3.1F, -9.5F, 0.75F);
/*      */     
/* 2681 */     this.defaultScopeModel[25].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F, -0.1F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.1F, -0.1F, -0.25F, 0.1F);
/* 2682 */     this.defaultScopeModel[25].setRotationPoint(-3.1F, -8.9F, 0.75F);
/*      */     
/* 2684 */     this.defaultScopeModel[26].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.75F, 0.25F, -0.65F, -0.75F, 0.25F, -0.65F, 0.1F, 0.0F, -0.65F, 0.1F, 0.0F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F);
/* 2685 */     this.defaultScopeModel[26].setRotationPoint(-3.85F, -8.8F, 0.75F);
/*      */     
/* 2687 */     this.defaultScopeModel[27].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.35F, -0.25F, -0.65F, 0.0F, -0.25F, -0.65F, 0.0F, -0.25F, 0.0F, 0.35F, -0.25F, 0.0F, 0.35F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
/* 2688 */     this.defaultScopeModel[27].setRotationPoint(-2.25F, -9.0F, -1.0F);
/*      */     
/* 2690 */     this.defaultScopeModel[28].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.65F, -0.25F, -0.75F, -0.65F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2691 */     this.defaultScopeModel[28].setRotationPoint(-2.25F, -9.75F, -1.0F);
/*      */     
/* 2693 */     this.defaultScopeModel[29].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.65F, -0.75F, -0.75F, -0.65F, -0.75F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2694 */     this.defaultScopeModel[29].setRotationPoint(-2.25F, -10.0F, -1.0F);
/*      */     
/* 2696 */     this.defaultScopeModel[30].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.4F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 2697 */     this.defaultScopeModel[30].setRotationPoint(-3.0F, -9.75F, -1.0F);
/*      */     
/* 2699 */     this.defaultScopeModel[31].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2700 */     this.defaultScopeModel[31].setRotationPoint(-4.0F, -10.25F, -1.0F);
/*      */     
/* 2702 */     this.defaultScopeModel[32].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.65F, 0.15F, -0.25F, -0.65F, 0.15F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2703 */     this.defaultScopeModel[32].setRotationPoint(-5.0F, -9.0F, -1.0F);
/*      */     
/* 2705 */     this.defaultScopeModel[33].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.65F, 0.15F, -0.5F, -0.65F, 0.15F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2706 */     this.defaultScopeModel[33].setRotationPoint(-5.0F, -9.75F, -1.0F);
/*      */     
/* 2708 */     this.defaultScopeModel[34].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.65F, 0.0F, -0.75F, -0.65F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2709 */     this.defaultScopeModel[34].setRotationPoint(-5.0F, -10.25F, -1.0F);
/*      */     
/* 2711 */     this.defaultScopeModel[35].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.65F, 0.0F, -0.75F, -0.65F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2712 */     this.defaultScopeModel[35].setRotationPoint(-5.0F, -10.5F, -1.0F);
/*      */     
/* 2714 */     this.defaultScopeModel[36].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2715 */     this.defaultScopeModel[36].setRotationPoint(-4.25F, -10.25F, -1.0F);
/*      */     
/* 2717 */     this.defaultScopeModel[37].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.65F, -0.1F, -0.25F, -0.65F, -0.1F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F);
/* 2718 */     this.defaultScopeModel[37].setRotationPoint(-4.35F, -9.5F, -1.0F);
/*      */     
/* 2720 */     this.defaultScopeModel[38].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.25F, -0.65F, -0.1F, -0.25F, -0.65F, -0.1F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2721 */     this.defaultScopeModel[38].setRotationPoint(-4.35F, -8.9F, -1.0F);
/*      */     
/* 2723 */     this.defaultScopeModel[39].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.1F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F);
/* 2724 */     this.defaultScopeModel[39].setRotationPoint(-3.1F, -9.5F, -1.0F);
/*      */     
/* 2726 */     this.defaultScopeModel[40].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.1F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F);
/* 2727 */     this.defaultScopeModel[40].setRotationPoint(-3.1F, -8.9F, -1.0F);
/*      */     
/* 2729 */     this.defaultScopeModel[41].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.2F, -0.65F, 0.25F, -0.2F, -0.65F, 0.25F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
/* 2730 */     this.defaultScopeModel[41].setRotationPoint(-3.85F, -8.8F, -1.0F);
/*      */     
/* 2732 */     this.defaultScopeModel[42].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2733 */     this.defaultScopeModel[42].setRotationPoint(-5.25F, -8.75F, 1.5F);
/*      */     
/* 2735 */     this.defaultScopeModel[43].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2736 */     this.defaultScopeModel[43].setRotationPoint(-5.25F, -9.0F, 1.5F);
/*      */     
/* 2738 */     this.defaultScopeModel[44].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2739 */     this.defaultScopeModel[44].setRotationPoint(-5.25F, -8.5F, 1.5F);
/*      */     
/* 2741 */     this.defaultScopeModel[45].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2742 */     this.defaultScopeModel[45].setRotationPoint(-2.75F, -8.75F, 1.5F);
/*      */     
/* 2744 */     this.defaultScopeModel[46].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2745 */     this.defaultScopeModel[46].setRotationPoint(-2.75F, -9.0F, 1.5F);
/*      */     
/* 2747 */     this.defaultScopeModel[47].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2748 */     this.defaultScopeModel[47].setRotationPoint(-2.75F, -8.5F, 1.5F);
/*      */     
/* 2750 */     this.defaultScopeModel[48].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2751 */     this.defaultScopeModel[48].setRotationPoint(-5.25F, -8.75F, -0.5F);
/*      */     
/* 2753 */     this.defaultScopeModel[49].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2754 */     this.defaultScopeModel[49].setRotationPoint(-5.25F, -9.0F, -0.5F);
/*      */     
/* 2756 */     this.defaultScopeModel[50].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2757 */     this.defaultScopeModel[50].setRotationPoint(-5.25F, -8.5F, -0.5F);
/*      */     
/* 2759 */     this.defaultScopeModel[51].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2760 */     this.defaultScopeModel[51].setRotationPoint(-5.25F, -8.75F, 1.0F);
/*      */     
/* 2762 */     this.defaultScopeModel[52].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2763 */     this.defaultScopeModel[52].setRotationPoint(-5.25F, -9.0F, 1.0F);
/*      */     
/* 2765 */     this.defaultScopeModel[53].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2766 */     this.defaultScopeModel[53].setRotationPoint(-5.25F, -8.5F, 1.0F);
/*      */     
/* 2768 */     this.defaultScopeModel[54].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/* 2769 */     this.defaultScopeModel[54].setRotationPoint(-5.25F, -8.75F, 0.25F);
/*      */     
/* 2771 */     this.defaultScopeModel[55].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 3, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/* 2772 */     this.defaultScopeModel[55].setRotationPoint(-2.75F, -8.75F, -1.25F);
/*      */     
/* 2774 */     this.defaultScopeModel[56].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.65F, 0.1F, -0.75F, -0.9F, 0.1F, -0.75F, -0.9F, 0.1F, 0.2F, -0.65F, 0.1F, 0.2F, -0.65F, -0.6F, -0.75F, -0.9F, -0.6F, -0.75F, -0.9F, -0.6F, 0.2F, -0.65F, -0.6F, 0.2F);
/* 2775 */     this.defaultScopeModel[56].setRotationPoint(-2.75F, -8.8F, -0.75F);
/*      */     
/* 2777 */     this.defaultScopeModel[57].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.65F, 0.1F, -0.75F, -0.9F, 0.1F, -0.75F, -0.9F, 0.1F, 0.2F, -0.65F, 0.1F, 0.2F, -0.65F, -0.6F, -0.75F, -0.9F, -0.6F, -0.75F, -0.9F, -0.6F, 0.2F, -0.65F, -0.6F, 0.2F);
/* 2778 */     this.defaultScopeModel[57].setRotationPoint(-2.75F, -8.8F, 0.3F);
/*      */     
/* 2780 */     this.defaultScopeModel[58].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.35F, -0.05F, -0.75F, -0.9F, 0.1F, -0.75F, -0.9F, 0.1F, 0.2F, -0.35F, -0.05F, -0.25F, -0.35F, -0.6F, -0.75F, -0.9F, -0.6F, -0.75F, -0.9F, -0.6F, 0.2F, -0.35F, -0.6F, -0.25F);
/* 2781 */     this.defaultScopeModel[58].setRotationPoint(-3.2F, -8.8F, 0.3F);
/*      */     
/* 2783 */     this.defaultScopeModel[59].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.35F, -0.05F, -0.25F, -0.9F, 0.1F, 0.2F, -0.9F, 0.1F, -0.75F, -0.35F, -0.05F, -0.75F, -0.35F, -0.6F, -0.25F, -0.9F, -0.6F, 0.2F, -0.9F, -0.6F, -0.75F, -0.35F, -0.6F, -0.75F);
/* 2784 */     this.defaultScopeModel[59].setRotationPoint(-3.2F, -8.8F, 0.2F);
/*      */     
/* 2786 */     this.defaultScopeModel[60].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.55F, -0.05F, 0.2F, -1.1F, 0.02F, 0.2F, -1.1F, 0.02F, -0.6F, -0.55F, -0.05F, -0.6F, -0.55F, -0.6F, 0.2F, -1.1F, -0.6F, 0.2F, -1.1F, -0.6F, -0.6F, -0.55F, -0.6F, -0.6F);
/* 2787 */     this.defaultScopeModel[60].setRotationPoint(-3.4F, -8.8F, 0.65F);
/*      */     
/* 2789 */     this.defaultScopeModel[61].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, -0.8F, 0.2F, 0.1F, -1.1F, -0.05F, 0.2F, -1.1F, -0.05F, -0.6F, -0.8F, 0.2F, -0.7F, -0.8F, -0.85F, 0.1F, -1.1F, -0.6F, 0.2F, -1.1F, -0.6F, -0.6F, -0.8F, -0.85F, -0.7F);
/* 2790 */     this.defaultScopeModel[61].setRotationPoint(-4.75F, -8.8F, 0.65F);
/*      */     
/* 2792 */     this.defaultScopeModel[62].addShapeBox(-2.0F, -1.0F, -0.75F, 3, 1, 1, 0.0F, -1.05F, 0.2F, 0.1F, -1.2F, 0.2F, 0.1F, -1.2F, 0.2F, -0.7F, -1.05F, 0.2F, -0.7F, -1.05F, -1.0F, 0.1F, -1.2F, -0.85F, 0.1F, -1.2F, -0.85F, -0.7F, -1.05F, -1.0F, -0.7F);
/* 2793 */     this.defaultScopeModel[62].setRotationPoint(-5.75F, -8.8F, 0.65F);
/*      */     
/* 2795 */     this.defaultScopeModel[63].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.05F, -0.75F, -0.75F, -0.05F, -0.75F, -0.75F, -0.85F, 0.0F, -0.75F, -0.85F, 0.0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.85F, 0.0F, -0.05F, -0.85F);
/* 2796 */     this.defaultScopeModel[63].setRotationPoint(-4.35F, -10.4F, 0.8F);
/*      */     
/* 2798 */     this.defaultScopeModel[64].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.1F, -0.75F, -0.75F, -0.1F, -0.75F, -0.75F, -0.8F, 0.0F, -0.75F, -0.8F, 0.0F, -0.05F, -0.1F, -0.75F, -0.05F, -0.1F, -0.75F, -0.05F, -0.8F, 0.0F, -0.05F, -0.8F);
/* 2799 */     this.defaultScopeModel[64].setRotationPoint(-4.35F, -10.4F, 0.45F);
/*      */     
/* 2801 */     this.defaultScopeModel[65].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.55F, -0.1F, -0.75F, -0.55F, -0.1F, -0.75F, -0.55F, -0.5F, 0.0F, -0.55F, -0.5F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2802 */     this.defaultScopeModel[65].setRotationPoint(-4.35F, -10.0F, 0.45F);
/*      */     
/* 2804 */     this.defaultScopeModel[66].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.95F, -0.1F, -0.75F, -0.95F, -0.1F, -0.75F, -0.85F, -0.8F, 0.0F, -0.85F, -0.8F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
/* 2805 */     this.defaultScopeModel[66].setRotationPoint(-4.35F, -10.65F, 0.45F);
/*      */     
/* 2807 */     this.defaultScopeModel[67].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.15F, -0.75F, -0.85F, -0.15F, -0.75F, -0.95F, -0.75F, 0.0F, -0.95F, -0.75F, 0.0F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2808 */     this.defaultScopeModel[67].setRotationPoint(-4.35F, -10.65F, 0.7F);
/*      */     
/* 2810 */     this.defaultScopeModel[68].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.07F, -0.75F, -0.75F, -0.07F, -0.75F, -0.75F, -0.85F, 0.0F, -0.75F, -0.85F, 0.0F, -0.17F, -0.15F, -0.75F, -0.17F, -0.15F, -0.75F, -0.17F, -0.85F, 0.0F, -0.17F, -0.85F);
/* 2811 */     this.defaultScopeModel[68].setRotationPoint(-4.35F, -10.4F, 0.7F);
/*      */     
/* 2813 */     this.defaultScopeModel[69].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.77F, -0.15F, -0.75F, -0.77F, -0.15F, -0.75F, -0.77F, -0.85F, 0.0F, -0.77F, -0.85F, 0.0F, -0.15F, -0.07F, -0.75F, -0.15F, -0.07F, -0.75F, -0.15F, -0.85F, 0.0F, -0.15F, -0.85F);
/* 2814 */     this.defaultScopeModel[69].setRotationPoint(-4.35F, -10.3F, 0.7F);
/*      */     
/* 2816 */     this.defaultScopeModel[70].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.77F, -0.85F, -0.75F, -0.77F, -0.85F, -0.75F, -0.77F, -0.15F, 0.0F, -0.77F, -0.15F, 0.0F, -0.15F, -0.85F, -0.75F, -0.15F, -0.85F, -0.75F, -0.15F, -0.07F, 0.0F, -0.15F, -0.07F);
/* 2817 */     this.defaultScopeModel[70].setRotationPoint(-4.35F, -10.3F, -0.2F);
/*      */     
/* 2819 */     this.defaultScopeModel[71].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.85F, -0.75F, -0.75F, -0.85F, -0.75F, -0.75F, -0.07F, 0.0F, -0.75F, -0.07F, 0.0F, -0.17F, -0.85F, -0.75F, -0.17F, -0.85F, -0.75F, -0.17F, -0.15F, 0.0F, -0.17F, -0.15F);
/* 2820 */     this.defaultScopeModel[71].setRotationPoint(-4.35F, -10.4F, -0.2F);
/*      */     
/* 2822 */     this.defaultScopeModel[72].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.05F, -0.75F, -0.85F, -0.05F, -0.75F, -0.85F, -0.75F, 0.0F, -0.85F, -0.75F, 0.0F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2823 */     this.defaultScopeModel[72].setRotationPoint(-4.35F, -10.65F, 0.6F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2828 */     this.ammoModel[0] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/* 2829 */     this.ammoModel[1] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/* 2830 */     this.ammoModel[2] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 2831 */     this.ammoModel[3] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/* 2832 */     this.ammoModel[4] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 2833 */     this.ammoModel[5] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/* 2834 */     this.ammoModel[6] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/* 2835 */     this.ammoModel[7] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 2836 */     this.ammoModel[8] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/* 2837 */     this.ammoModel[9] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/* 2838 */     this.ammoModel[10] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/* 2839 */     this.ammoModel[11] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/* 2840 */     this.ammoModel[12] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/* 2841 */     this.ammoModel[13] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/* 2842 */     this.ammoModel[14] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/* 2843 */     this.ammoModel[15] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/* 2844 */     this.ammoModel[16] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/* 2845 */     this.ammoModel[17] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 2846 */     this.ammoModel[18] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/* 2847 */     this.ammoModel[19] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/* 2848 */     this.ammoModel[20] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/* 2849 */     this.ammoModel[21] = new ModelRendererTurbo(this, 329, 57, this.textureX, this.textureY);
/* 2850 */     this.ammoModel[22] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 2851 */     this.ammoModel[23] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 2852 */     this.ammoModel[24] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 2853 */     this.ammoModel[25] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/* 2854 */     this.ammoModel[26] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/* 2855 */     this.ammoModel[27] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/* 2856 */     this.ammoModel[28] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/* 2857 */     this.ammoModel[29] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/* 2858 */     this.ammoModel[30] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/* 2859 */     this.ammoModel[31] = new ModelRendererTurbo(this, 377, 65, this.textureX, this.textureY);
/* 2860 */     this.ammoModel[32] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/* 2861 */     this.ammoModel[33] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/* 2862 */     this.ammoModel[34] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/* 2863 */     this.ammoModel[35] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/* 2864 */     this.ammoModel[36] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/* 2865 */     this.ammoModel[37] = new ModelRendererTurbo(this, 425, 65, this.textureX, this.textureY);
/* 2866 */     this.ammoModel[38] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/* 2867 */     this.ammoModel[39] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/* 2868 */     this.ammoModel[40] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/* 2869 */     this.ammoModel[41] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/* 2870 */     this.ammoModel[42] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/* 2871 */     this.ammoModel[43] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/* 2872 */     this.ammoModel[44] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/* 2873 */     this.ammoModel[45] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/* 2874 */     this.ammoModel[46] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 2875 */     this.ammoModel[47] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/* 2876 */     this.ammoModel[48] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 2877 */     this.ammoModel[49] = new ModelRendererTurbo(this, 9, 73, this.textureX, this.textureY);
/* 2878 */     this.ammoModel[50] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/* 2879 */     this.ammoModel[51] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/* 2880 */     this.ammoModel[52] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/* 2881 */     this.ammoModel[53] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/* 2882 */     this.ammoModel[54] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/* 2883 */     this.ammoModel[55] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/* 2884 */     this.ammoModel[56] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/* 2885 */     this.ammoModel[57] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/* 2886 */     this.ammoModel[58] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/* 2887 */     this.ammoModel[59] = new ModelRendererTurbo(this, 89, 73, this.textureX, this.textureY);
/* 2888 */     this.ammoModel[60] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/* 2889 */     this.ammoModel[61] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/* 2890 */     this.ammoModel[62] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/* 2891 */     this.ammoModel[63] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/* 2892 */     this.ammoModel[64] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/* 2893 */     this.ammoModel[65] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/* 2894 */     this.ammoModel[66] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/* 2895 */     this.ammoModel[67] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/* 2896 */     this.ammoModel[68] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/* 2897 */     this.ammoModel[69] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/* 2898 */     this.ammoModel[70] = new ModelRendererTurbo(this, 177, 73, this.textureX, this.textureY);
/* 2899 */     this.ammoModel[71] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/* 2900 */     this.ammoModel[72] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/* 2901 */     this.ammoModel[73] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/* 2902 */     this.ammoModel[74] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/* 2903 */     this.ammoModel[75] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/* 2904 */     this.ammoModel[76] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/* 2905 */     this.ammoModel[77] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/* 2906 */     this.ammoModel[78] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/* 2907 */     this.ammoModel[79] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/* 2908 */     this.ammoModel[80] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/* 2909 */     this.ammoModel[81] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/* 2910 */     this.ammoModel[82] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/* 2911 */     this.ammoModel[83] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/* 2912 */     this.ammoModel[84] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/* 2913 */     this.ammoModel[85] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/* 2914 */     this.ammoModel[86] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/* 2915 */     this.ammoModel[87] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/* 2916 */     this.ammoModel[88] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/* 2917 */     this.ammoModel[89] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 2918 */     this.ammoModel[90] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/* 2919 */     this.ammoModel[91] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/* 2920 */     this.ammoModel[92] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/* 2921 */     this.ammoModel[93] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/* 2922 */     this.ammoModel[94] = new ModelRendererTurbo(this, 369, 73, this.textureX, this.textureY);
/* 2923 */     this.ammoModel[95] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/* 2924 */     this.ammoModel[96] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 2925 */     this.ammoModel[97] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/* 2926 */     this.ammoModel[98] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/* 2927 */     this.ammoModel[99] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
/* 2928 */     this.ammoModel[100] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/* 2929 */     this.ammoModel[101] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/* 2930 */     this.ammoModel[102] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/* 2931 */     this.ammoModel[103] = new ModelRendererTurbo(this, 441, 73, this.textureX, this.textureY);
/* 2932 */     this.ammoModel[104] = new ModelRendererTurbo(this, 449, 73, this.textureX, this.textureY);
/* 2933 */     this.ammoModel[105] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/* 2934 */     this.ammoModel[106] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/* 2935 */     this.ammoModel[107] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/* 2936 */     this.ammoModel[108] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/* 2937 */     this.ammoModel[109] = new ModelRendererTurbo(this, 489, 73, this.textureX, this.textureY);
/* 2938 */     this.ammoModel[110] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/* 2939 */     this.ammoModel[111] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/* 2940 */     this.ammoModel[112] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 2941 */     this.ammoModel[113] = new ModelRendererTurbo(this, 9, 81, this.textureX, this.textureY);
/* 2942 */     this.ammoModel[114] = new ModelRendererTurbo(this, 17, 81, this.textureX, this.textureY);
/* 2943 */     this.ammoModel[115] = new ModelRendererTurbo(this, 25, 81, this.textureX, this.textureY);
/* 2944 */     this.ammoModel[116] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/* 2945 */     this.ammoModel[117] = new ModelRendererTurbo(this, 41, 81, this.textureX, this.textureY);
/* 2946 */     this.ammoModel[118] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/* 2947 */     this.ammoModel[119] = new ModelRendererTurbo(this, 57, 81, this.textureX, this.textureY);
/* 2948 */     this.ammoModel[120] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/* 2949 */     this.ammoModel[121] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/* 2950 */     this.ammoModel[122] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/* 2951 */     this.ammoModel[123] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY);
/* 2952 */     this.ammoModel[124] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/* 2953 */     this.ammoModel[125] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/* 2954 */     this.ammoModel[126] = new ModelRendererTurbo(this, 113, 81, this.textureX, this.textureY);
/* 2955 */     this.ammoModel[127] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/* 2956 */     this.ammoModel[''] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/* 2957 */     this.ammoModel[''] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/* 2958 */     this.ammoModel[''] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
/* 2959 */     this.ammoModel[''] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/* 2960 */     this.ammoModel[''] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/* 2961 */     this.ammoModel[''] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/* 2962 */     this.ammoModel[''] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/* 2963 */     this.ammoModel[''] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/* 2964 */     this.ammoModel[''] = new ModelRendererTurbo(this, 193, 81, this.textureX, this.textureY);
/* 2965 */     this.ammoModel[''] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/* 2966 */     this.ammoModel[''] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/* 2967 */     this.ammoModel[''] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/* 2968 */     this.ammoModel[''] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/* 2969 */     this.ammoModel[''] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/* 2970 */     this.ammoModel[''] = new ModelRendererTurbo(this, 241, 81, this.textureX, this.textureY);
/* 2971 */     this.ammoModel[''] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/* 2972 */     this.ammoModel[''] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/* 2973 */     this.ammoModel[''] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/* 2974 */     this.ammoModel[''] = new ModelRendererTurbo(this, 273, 81, this.textureX, this.textureY);
/* 2975 */     this.ammoModel[''] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/* 2976 */     this.ammoModel[''] = new ModelRendererTurbo(this, 289, 81, this.textureX, this.textureY);
/* 2977 */     this.ammoModel[''] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/* 2978 */     this.ammoModel[''] = new ModelRendererTurbo(this, 305, 81, this.textureX, this.textureY);
/* 2979 */     this.ammoModel[''] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/* 2980 */     this.ammoModel[''] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/* 2981 */     this.ammoModel[''] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/* 2982 */     this.ammoModel[''] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/* 2983 */     this.ammoModel[''] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/* 2984 */     this.ammoModel[''] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/* 2985 */     this.ammoModel[''] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/* 2986 */     this.ammoModel[''] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/* 2987 */     this.ammoModel[''] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/* 2988 */     this.ammoModel[' '] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/* 2989 */     this.ammoModel['¡'] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/* 2990 */     this.ammoModel['¢'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/* 2991 */     this.ammoModel['£'] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/* 2992 */     this.ammoModel['¤'] = new ModelRendererTurbo(this, 417, 81, this.textureX, this.textureY);
/* 2993 */     this.ammoModel['¥'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/* 2994 */     this.ammoModel['¦'] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/* 2995 */     this.ammoModel['§'] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/* 2996 */     this.ammoModel['¨'] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/* 2997 */     this.ammoModel['©'] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/* 2998 */     this.ammoModel['ª'] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/* 2999 */     this.ammoModel['«'] = new ModelRendererTurbo(this, 473, 81, this.textureX, this.textureY);
/* 3000 */     this.ammoModel['¬'] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/* 3001 */     this.ammoModel['­'] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/* 3002 */     this.ammoModel['®'] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/* 3003 */     this.ammoModel['¯'] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/* 3004 */     this.ammoModel['°'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 3005 */     this.ammoModel['±'] = new ModelRendererTurbo(this, 9, 89, this.textureX, this.textureY);
/* 3006 */     this.ammoModel['²'] = new ModelRendererTurbo(this, 17, 89, this.textureX, this.textureY);
/* 3007 */     this.ammoModel['³'] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/* 3008 */     this.ammoModel['´'] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/* 3009 */     this.ammoModel['µ'] = new ModelRendererTurbo(this, 41, 89, this.textureX, this.textureY);
/* 3010 */     this.ammoModel['¶'] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/* 3011 */     this.ammoModel['·'] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
/* 3012 */     this.ammoModel['¸'] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/* 3013 */     this.ammoModel['¹'] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/* 3014 */     this.ammoModel['º'] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 3015 */     this.ammoModel['»'] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/* 3016 */     this.ammoModel['¼'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/* 3017 */     this.ammoModel['½'] = new ModelRendererTurbo(this, 105, 89, this.textureX, this.textureY);
/* 3018 */     this.ammoModel['¾'] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/* 3019 */     this.ammoModel['¿'] = new ModelRendererTurbo(this, 121, 89, this.textureX, this.textureY);
/* 3020 */     this.ammoModel['À'] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/* 3021 */     this.ammoModel['Á'] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/* 3022 */     this.ammoModel['Â'] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/* 3023 */     this.ammoModel['Ã'] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/* 3024 */     this.ammoModel['Ä'] = new ModelRendererTurbo(this, 161, 89, this.textureX, this.textureY);
/* 3025 */     this.ammoModel['Å'] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/* 3026 */     this.ammoModel['Æ'] = new ModelRendererTurbo(this, 177, 89, this.textureX, this.textureY);
/* 3027 */     this.ammoModel['Ç'] = new ModelRendererTurbo(this, 185, 89, this.textureX, this.textureY);
/* 3028 */     this.ammoModel['È'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/* 3029 */     this.ammoModel['É'] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/* 3030 */     this.ammoModel['Ê'] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/* 3031 */     this.ammoModel['Ë'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/* 3032 */     this.ammoModel['Ì'] = new ModelRendererTurbo(this, 225, 89, this.textureX, this.textureY);
/* 3033 */     this.ammoModel['Í'] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/* 3034 */     this.ammoModel['Î'] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/* 3035 */     this.ammoModel['Ï'] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/* 3036 */     this.ammoModel['Ð'] = new ModelRendererTurbo(this, 257, 89, this.textureX, this.textureY);
/* 3037 */     this.ammoModel['Ñ'] = new ModelRendererTurbo(this, 265, 89, this.textureX, this.textureY);
/* 3038 */     this.ammoModel['Ò'] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/* 3039 */     this.ammoModel['Ó'] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/* 3040 */     this.ammoModel['Ô'] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/* 3041 */     this.ammoModel['Õ'] = new ModelRendererTurbo(this, 297, 89, this.textureX, this.textureY);
/* 3042 */     this.ammoModel['Ö'] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/* 3043 */     this.ammoModel['×'] = new ModelRendererTurbo(this, 313, 89, this.textureX, this.textureY);
/* 3044 */     this.ammoModel['Ø'] = new ModelRendererTurbo(this, 321, 89, this.textureX, this.textureY);
/* 3045 */     this.ammoModel['Ù'] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/* 3046 */     this.ammoModel['Ú'] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/* 3047 */     this.ammoModel['Û'] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/* 3048 */     this.ammoModel['Ü'] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/* 3049 */     this.ammoModel['Ý'] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/* 3050 */     this.ammoModel['Þ'] = new ModelRendererTurbo(this, 369, 89, this.textureX, this.textureY);
/* 3051 */     this.ammoModel['ß'] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/* 3052 */     this.ammoModel['à'] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/* 3053 */     this.ammoModel['á'] = new ModelRendererTurbo(this, 393, 89, this.textureX, this.textureY);
/* 3054 */     this.ammoModel['â'] = new ModelRendererTurbo(this, 401, 89, this.textureX, this.textureY);
/* 3055 */     this.ammoModel['ã'] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/* 3056 */     this.ammoModel['ä'] = new ModelRendererTurbo(this, 417, 89, this.textureX, this.textureY);
/* 3057 */     this.ammoModel['å'] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/* 3058 */     this.ammoModel['æ'] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/* 3059 */     this.ammoModel['ç'] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/* 3060 */     this.ammoModel['è'] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/* 3061 */     this.ammoModel['é'] = new ModelRendererTurbo(this, 457, 89, this.textureX, this.textureY);
/* 3062 */     this.ammoModel['ê'] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/* 3063 */     this.ammoModel['ë'] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/* 3064 */     this.ammoModel['ì'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/* 3065 */     this.ammoModel['í'] = new ModelRendererTurbo(this, 489, 89, this.textureX, this.textureY);
/* 3066 */     this.ammoModel['î'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/* 3067 */     this.ammoModel['ï'] = new ModelRendererTurbo(this, 505, 89, this.textureX, this.textureY);
/* 3068 */     this.ammoModel['ð'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 3069 */     this.ammoModel['ñ'] = new ModelRendererTurbo(this, 9, 97, this.textureX, this.textureY);
/* 3070 */     this.ammoModel['ò'] = new ModelRendererTurbo(this, 17, 97, this.textureX, this.textureY);
/* 3071 */     this.ammoModel['ó'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/* 3072 */     this.ammoModel['ô'] = new ModelRendererTurbo(this, 33, 97, this.textureX, this.textureY);
/* 3073 */     this.ammoModel['õ'] = new ModelRendererTurbo(this, 41, 97, this.textureX, this.textureY);
/* 3074 */     this.ammoModel['ö'] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/* 3075 */     this.ammoModel['÷'] = new ModelRendererTurbo(this, 57, 97, this.textureX, this.textureY);
/* 3076 */     this.ammoModel['ø'] = new ModelRendererTurbo(this, 65, 97, this.textureX, this.textureY);
/* 3077 */     this.ammoModel['ù'] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/* 3078 */     this.ammoModel['ú'] = new ModelRendererTurbo(this, 81, 97, this.textureX, this.textureY);
/* 3079 */     this.ammoModel['û'] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/* 3080 */     this.ammoModel['ü'] = new ModelRendererTurbo(this, 97, 97, this.textureX, this.textureY);
/* 3081 */     this.ammoModel['ý'] = new ModelRendererTurbo(this, 105, 97, this.textureX, this.textureY);
/* 3082 */     this.ammoModel['þ'] = new ModelRendererTurbo(this, 113, 97, this.textureX, this.textureY);
/* 3083 */     this.ammoModel['ÿ'] = new ModelRendererTurbo(this, 121, 97, this.textureX, this.textureY);
/* 3084 */     this.ammoModel['Ā'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/* 3085 */     this.ammoModel['ā'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/* 3086 */     this.ammoModel['Ă'] = new ModelRendererTurbo(this, 145, 97, this.textureX, this.textureY);
/* 3087 */     this.ammoModel['ă'] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
/* 3088 */     this.ammoModel['Ą'] = new ModelRendererTurbo(this, 161, 97, this.textureX, this.textureY);
/* 3089 */     this.ammoModel['ą'] = new ModelRendererTurbo(this, 169, 97, this.textureX, this.textureY);
/* 3090 */     this.ammoModel['Ć'] = new ModelRendererTurbo(this, 177, 97, this.textureX, this.textureY);
/* 3091 */     this.ammoModel['ć'] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
/* 3092 */     this.ammoModel['Ĉ'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/* 3093 */     this.ammoModel['ĉ'] = new ModelRendererTurbo(this, 201, 97, this.textureX, this.textureY);
/* 3094 */     this.ammoModel['Ċ'] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/* 3095 */     this.ammoModel['ċ'] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/* 3096 */     this.ammoModel['Č'] = new ModelRendererTurbo(this, 225, 97, this.textureX, this.textureY);
/* 3097 */     this.ammoModel['č'] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/* 3098 */     this.ammoModel['Ď'] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/* 3099 */     this.ammoModel['ď'] = new ModelRendererTurbo(this, 249, 97, this.textureX, this.textureY);
/* 3100 */     this.ammoModel['Đ'] = new ModelRendererTurbo(this, 257, 97, this.textureX, this.textureY);
/* 3101 */     this.ammoModel['đ'] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/* 3102 */     this.ammoModel['Ē'] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/* 3103 */     this.ammoModel['ē'] = new ModelRendererTurbo(this, 281, 97, this.textureX, this.textureY);
/* 3104 */     this.ammoModel['Ĕ'] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/* 3105 */     this.ammoModel['ĕ'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/* 3106 */     this.ammoModel['Ė'] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/* 3107 */     this.ammoModel['ė'] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/* 3108 */     this.ammoModel['Ę'] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/* 3109 */     this.ammoModel['ę'] = new ModelRendererTurbo(this, 329, 97, this.textureX, this.textureY);
/* 3110 */     this.ammoModel['Ě'] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/* 3111 */     this.ammoModel['ě'] = new ModelRendererTurbo(this, 345, 97, this.textureX, this.textureY);
/* 3112 */     this.ammoModel['Ĝ'] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/* 3113 */     this.ammoModel['ĝ'] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/* 3114 */     this.ammoModel['Ğ'] = new ModelRendererTurbo(this, 369, 97, this.textureX, this.textureY);
/* 3115 */     this.ammoModel['ğ'] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*      */     
/* 3117 */     this.ammoModel[0].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 9, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3118 */     this.ammoModel[0].setRotationPoint(8.0F, -1.75F, -0.5F);
/*      */     
/* 3120 */     this.ammoModel[1].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 9, 4, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3121 */     this.ammoModel[1].setRotationPoint(8.0F, -1.75F, -4.5F);
/*      */     
/* 3123 */     this.ammoModel[2].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 8, 3, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 3124 */     this.ammoModel[2].setRotationPoint(8.0F, -0.75F, 2.5F);
/*      */     
/* 3126 */     this.ammoModel[3].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 9, 3, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 3127 */     this.ammoModel[3].setRotationPoint(7.75F, -1.75F, 2.5F);
/*      */     
/* 3129 */     this.ammoModel[4].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 9, 3, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 3130 */     this.ammoModel[4].setRotationPoint(12.0F, -1.75F, 2.5F);
/*      */     
/* 3132 */     this.ammoModel[5].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 7, 1, 0.0F, 0.75F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, -0.75F, 0.75F, 1.0F, -0.75F, 0.75F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, -0.75F, 0.75F, 1.0F, -0.75F);
/* 3133 */     this.ammoModel[5].setRotationPoint(8.0F, -0.75F, 6.0F);
/*      */     
/* 3135 */     this.ammoModel[6].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 1, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 0.75F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -0.75F, 0.75F, -1.0F, -0.75F);
/* 3136 */     this.ammoModel[6].setRotationPoint(8.0F, -1.75F, 6.0F);
/*      */     
/* 3138 */     this.ammoModel[7].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 1, 0.0F, 0.75F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -0.75F, 0.75F, -1.0F, -0.75F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F);
/* 3139 */     this.ammoModel[7].setRotationPoint(8.0F, 6.25F, 6.0F);
/*      */     
/* 3141 */     this.ammoModel[8].addShapeBox(-2.0F, -1.0F, -0.75F, 4, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F);
/* 3142 */     this.ammoModel[8].setRotationPoint(8.0F, -2.5F, -0.5F);
/*      */     
/* 3144 */     this.ammoModel[9].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3145 */     this.ammoModel[9].setRotationPoint(9.15F, -7.5F, 1.5F);
/*      */     
/* 3147 */     this.ammoModel[10].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F);
/* 3148 */     this.ammoModel[10].setRotationPoint(7.8F, -7.5F, 1.5F);
/*      */     
/* 3150 */     this.ammoModel[11].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3151 */     this.ammoModel[11].setRotationPoint(9.15F, -7.5F, 2.5F);
/*      */     
/* 3153 */     this.ammoModel[12].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.775F, -0.375F, 0.0F, -0.775F, -0.375F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.075F, -0.525F, 0.0F, -0.075F, -0.525F);
/* 3154 */     this.ammoModel[12].setRotationPoint(9.15F, -7.5F, 3.5F);
/*      */     
/* 3156 */     this.ammoModel[13].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.775F, -0.375F, -0.9F, -0.775F, -0.375F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.075F, -0.525F, -0.9F, -0.075F, -0.525F);
/* 3157 */     this.ammoModel[13].setRotationPoint(7.8F, -7.5F, 3.5F);
/*      */     
/* 3159 */     this.ammoModel[14].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.675F, -0.475F, 0.0F, -0.675F, -0.475F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.325F, -0.675F, 0.0F, -0.325F, -0.675F);
/* 3160 */     this.ammoModel[14].setRotationPoint(9.15F, -6.5F, 4.3F);
/*      */     
/* 3162 */     this.ammoModel[15].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.675F, -0.475F, -0.9F, -0.675F, -0.475F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.325F, -0.675F, -0.9F, -0.325F, -0.675F);
/* 3163 */     this.ammoModel[15].setRotationPoint(7.8F, -6.5F, 4.3F);
/*      */     
/* 3165 */     this.ammoModel[16].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.725F, -0.575F, 0.0F, -0.725F, -0.575F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.275F, -0.825F, 0.0F, -0.275F, -0.825F);
/* 3166 */     this.ammoModel[16].setRotationPoint(9.15F, -5.5F, 4.7F);
/*      */     
/* 3168 */     this.ammoModel[17].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.725F, -0.575F, -0.9F, -0.725F, -0.575F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.275F, -0.825F, -0.9F, -0.275F, -0.825F);
/* 3169 */     this.ammoModel[17].setRotationPoint(7.8F, -5.5F, 4.7F);
/*      */     
/* 3171 */     this.ammoModel[18].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.725F, -0.575F, 0.0F, -0.725F, -0.575F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.275F, -0.825F, 0.0F, -0.275F, -0.825F);
/* 3172 */     this.ammoModel[18].setRotationPoint(9.15F, -4.5F, 4.95F);
/*      */     
/* 3174 */     this.ammoModel[19].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.725F, -0.575F, -0.9F, -0.725F, -0.575F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.275F, -0.825F, -0.9F, -0.275F, -0.825F);
/* 3175 */     this.ammoModel[19].setRotationPoint(7.8F, -4.5F, 4.95F);
/*      */     
/* 3177 */     this.ammoModel[20].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.725F, -0.575F, 0.0F, -0.725F, -0.575F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.275F, -0.825F, 0.0F, -0.275F, -0.825F);
/* 3178 */     this.ammoModel[20].setRotationPoint(9.15F, -3.5F, 5.2F);
/*      */     
/* 3180 */     this.ammoModel[21].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.725F, -0.575F, -0.9F, -0.725F, -0.575F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.275F, -0.825F, -0.9F, -0.275F, -0.825F);
/* 3181 */     this.ammoModel[21].setRotationPoint(7.8F, -3.5F, 5.2F);
/*      */     
/* 3183 */     this.ammoModel[22].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, 0.05F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, 0.05F, -0.675F, -0.375F);
/* 3184 */     this.ammoModel[22].setRotationPoint(9.15F, -2.1F, 5.0F);
/*      */     
/* 3186 */     this.ammoModel[23].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.9F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F);
/* 3187 */     this.ammoModel[23].setRotationPoint(7.8F, -2.1F, 5.0F);
/*      */     
/* 3189 */     this.ammoModel[24].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, 0.05F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, 0.05F, -0.675F, -0.375F);
/* 3190 */     this.ammoModel[24].setRotationPoint(9.15F, -1.1F, 5.0F);
/*      */     
/* 3192 */     this.ammoModel[25].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.9F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F);
/* 3193 */     this.ammoModel[25].setRotationPoint(7.8F, -1.1F, 5.0F);
/*      */     
/* 3195 */     this.ammoModel[26].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3196 */     this.ammoModel[26].setRotationPoint(8.0F, -4.85F, 4.75F);
/*      */     
/* 3198 */     this.ammoModel[27].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3199 */     this.ammoModel[27].setRotationPoint(8.0F, -5.1F, 4.5F);
/*      */     
/* 3201 */     this.ammoModel[28].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3202 */     this.ammoModel[28].setRotationPoint(8.0F, -4.6F, 4.5F);
/*      */     
/* 3204 */     this.ammoModel[29].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3205 */     this.ammoModel[29].setRotationPoint(8.0F, -4.85F, 4.5F);
/*      */     
/* 3207 */     this.ammoModel[30].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3208 */     this.ammoModel[30].setRotationPoint(8.0F, -4.85F, 4.25F);
/*      */     
/* 3210 */     this.ammoModel[31].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3211 */     this.ammoModel[31].setRotationPoint(8.0F, -4.85F, 4.25F);
/*      */     
/* 3213 */     this.ammoModel[32].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3214 */     this.ammoModel[32].setRotationPoint(8.0F, -5.1F, 4.5F);
/*      */     
/* 3216 */     this.ammoModel[33].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3217 */     this.ammoModel[33].setRotationPoint(8.0F, -4.6F, 4.5F);
/*      */     
/* 3219 */     this.ammoModel[34].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3220 */     this.ammoModel[34].setRotationPoint(8.1F, -4.85F, 4.75F);
/*      */     
/* 3222 */     this.ammoModel[35].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3223 */     this.ammoModel[35].setRotationPoint(8.1F, -4.6F, 4.5F);
/*      */     
/* 3225 */     this.ammoModel[36].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3226 */     this.ammoModel[36].setRotationPoint(8.1F, -5.1F, 4.5F);
/*      */     
/* 3228 */     this.ammoModel[37].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3229 */     this.ammoModel[37].setRotationPoint(9.35F, -5.1F, 4.5F);
/*      */     
/* 3231 */     this.ammoModel[38].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3232 */     this.ammoModel[38].setRotationPoint(9.35F, -4.85F, 4.75F);
/*      */     
/* 3234 */     this.ammoModel[39].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3235 */     this.ammoModel[39].setRotationPoint(9.35F, -4.6F, 4.5F);
/*      */     
/* 3237 */     this.ammoModel[40].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3238 */     this.ammoModel[40].setRotationPoint(9.7F, -4.6F, 4.5F);
/*      */     
/* 3240 */     this.ammoModel[41].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3241 */     this.ammoModel[41].setRotationPoint(9.7F, -4.85F, 4.75F);
/*      */     
/* 3243 */     this.ammoModel[42].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3244 */     this.ammoModel[42].setRotationPoint(9.7F, -5.1F, 4.5F);
/*      */     
/* 3246 */     this.ammoModel[43].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3247 */     this.ammoModel[43].setRotationPoint(9.95F, -5.1F, 4.5F);
/*      */     
/* 3249 */     this.ammoModel[44].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3250 */     this.ammoModel[44].setRotationPoint(9.95F, -4.85F, 4.25F);
/*      */     
/* 3252 */     this.ammoModel[45].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3253 */     this.ammoModel[45].setRotationPoint(9.95F, -4.6F, 4.5F);
/*      */     
/* 3255 */     this.ammoModel[46].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3256 */     this.ammoModel[46].setRotationPoint(8.5F, -5.1F, 4.5F);
/*      */     
/* 3258 */     this.ammoModel[47].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3259 */     this.ammoModel[47].setRotationPoint(8.5F, -4.6F, 4.5F);
/*      */     
/* 3261 */     this.ammoModel[48].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3262 */     this.ammoModel[48].setRotationPoint(8.1F, -5.1F, 4.5F);
/*      */     
/* 3264 */     this.ammoModel[49].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3265 */     this.ammoModel[49].setRotationPoint(8.1F, -4.6F, 4.5F);
/*      */     
/* 3267 */     this.ammoModel[50].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3268 */     this.ammoModel[50].setRotationPoint(9.15F, -5.1F, 4.5F);
/*      */     
/* 3270 */     this.ammoModel[51].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3271 */     this.ammoModel[51].setRotationPoint(9.15F, -4.6F, 4.5F);
/*      */     
/* 3273 */     this.ammoModel[52].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3274 */     this.ammoModel[52].setRotationPoint(8.0F, -6.9F, 4.12F);
/*      */     
/* 3276 */     this.ammoModel[53].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3277 */     this.ammoModel[53].setRotationPoint(8.0F, -7.15F, 3.87F);
/*      */     
/* 3279 */     this.ammoModel[54].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3280 */     this.ammoModel[54].setRotationPoint(8.0F, -6.65F, 3.87F);
/*      */     
/* 3282 */     this.ammoModel[55].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3283 */     this.ammoModel[55].setRotationPoint(8.0F, -6.9F, 3.87F);
/*      */     
/* 3285 */     this.ammoModel[56].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3286 */     this.ammoModel[56].setRotationPoint(8.0F, -6.9F, 3.62F);
/*      */     
/* 3288 */     this.ammoModel[57].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3289 */     this.ammoModel[57].setRotationPoint(8.0F, -6.9F, 3.62F);
/*      */     
/* 3291 */     this.ammoModel[58].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3292 */     this.ammoModel[58].setRotationPoint(8.0F, -7.15F, 3.87F);
/*      */     
/* 3294 */     this.ammoModel[59].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3295 */     this.ammoModel[59].setRotationPoint(8.0F, -6.65F, 3.87F);
/*      */     
/* 3297 */     this.ammoModel[60].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3298 */     this.ammoModel[60].setRotationPoint(8.1F, -6.9F, 4.12F);
/*      */     
/* 3300 */     this.ammoModel[61].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3301 */     this.ammoModel[61].setRotationPoint(8.1F, -6.65F, 3.87F);
/*      */     
/* 3303 */     this.ammoModel[62].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3304 */     this.ammoModel[62].setRotationPoint(8.1F, -7.15F, 3.87F);
/*      */     
/* 3306 */     this.ammoModel[63].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3307 */     this.ammoModel[63].setRotationPoint(9.35F, -7.15F, 3.87F);
/*      */     
/* 3309 */     this.ammoModel[64].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3310 */     this.ammoModel[64].setRotationPoint(9.35F, -6.9F, 4.12F);
/*      */     
/* 3312 */     this.ammoModel[65].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3313 */     this.ammoModel[65].setRotationPoint(9.35F, -6.65F, 3.87F);
/*      */     
/* 3315 */     this.ammoModel[66].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3316 */     this.ammoModel[66].setRotationPoint(9.7F, -6.65F, 3.87F);
/*      */     
/* 3318 */     this.ammoModel[67].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3319 */     this.ammoModel[67].setRotationPoint(9.7F, -6.9F, 4.12F);
/*      */     
/* 3321 */     this.ammoModel[68].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3322 */     this.ammoModel[68].setRotationPoint(9.7F, -7.15F, 3.87F);
/*      */     
/* 3324 */     this.ammoModel[69].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3325 */     this.ammoModel[69].setRotationPoint(9.95F, -7.15F, 3.87F);
/*      */     
/* 3327 */     this.ammoModel[70].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3328 */     this.ammoModel[70].setRotationPoint(9.95F, -6.9F, 3.62F);
/*      */     
/* 3330 */     this.ammoModel[71].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3331 */     this.ammoModel[71].setRotationPoint(9.95F, -6.65F, 3.87F);
/*      */     
/* 3333 */     this.ammoModel[72].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3334 */     this.ammoModel[72].setRotationPoint(8.5F, -6.9F, 4.12F);
/*      */     
/* 3336 */     this.ammoModel[73].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3337 */     this.ammoModel[73].setRotationPoint(8.5F, -7.15F, 3.87F);
/*      */     
/* 3339 */     this.ammoModel[74].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3340 */     this.ammoModel[74].setRotationPoint(8.5F, -6.65F, 3.87F);
/*      */     
/* 3342 */     this.ammoModel[75].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3343 */     this.ammoModel[75].setRotationPoint(8.1F, -6.9F, 4.12F);
/*      */     
/* 3345 */     this.ammoModel[76].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3346 */     this.ammoModel[76].setRotationPoint(8.1F, -7.15F, 3.87F);
/*      */     
/* 3348 */     this.ammoModel[77].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3349 */     this.ammoModel[77].setRotationPoint(8.1F, -6.65F, 3.87F);
/*      */     
/* 3351 */     this.ammoModel[78].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3352 */     this.ammoModel[78].setRotationPoint(9.15F, -6.9F, 4.12F);
/*      */     
/* 3354 */     this.ammoModel[79].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3355 */     this.ammoModel[79].setRotationPoint(9.15F, -7.15F, 3.87F);
/*      */     
/* 3357 */     this.ammoModel[80].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3358 */     this.ammoModel[80].setRotationPoint(9.15F, -6.65F, 3.87F);
/*      */     
/* 3360 */     this.ammoModel[81].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3361 */     this.ammoModel[81].setRotationPoint(8.0F, -5.9F, 4.5F);
/*      */     
/* 3363 */     this.ammoModel[82].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3364 */     this.ammoModel[82].setRotationPoint(8.0F, -6.15F, 4.25F);
/*      */     
/* 3366 */     this.ammoModel[83].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3367 */     this.ammoModel[83].setRotationPoint(8.0F, -5.65F, 4.25F);
/*      */     
/* 3369 */     this.ammoModel[84].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3370 */     this.ammoModel[84].setRotationPoint(8.0F, -5.9F, 4.25F);
/*      */     
/* 3372 */     this.ammoModel[85].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3373 */     this.ammoModel[85].setRotationPoint(8.0F, -5.9F, 4.0F);
/*      */     
/* 3375 */     this.ammoModel[86].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3376 */     this.ammoModel[86].setRotationPoint(8.0F, -5.9F, 4.0F);
/*      */     
/* 3378 */     this.ammoModel[87].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3379 */     this.ammoModel[87].setRotationPoint(8.0F, -6.15F, 4.25F);
/*      */     
/* 3381 */     this.ammoModel[88].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3382 */     this.ammoModel[88].setRotationPoint(8.0F, -5.65F, 4.25F);
/*      */     
/* 3384 */     this.ammoModel[89].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3385 */     this.ammoModel[89].setRotationPoint(8.1F, -5.9F, 4.5F);
/*      */     
/* 3387 */     this.ammoModel[90].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3388 */     this.ammoModel[90].setRotationPoint(8.1F, -5.65F, 4.25F);
/*      */     
/* 3390 */     this.ammoModel[91].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3391 */     this.ammoModel[91].setRotationPoint(8.1F, -6.15F, 4.25F);
/*      */     
/* 3393 */     this.ammoModel[92].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3394 */     this.ammoModel[92].setRotationPoint(9.35F, -6.15F, 4.25F);
/*      */     
/* 3396 */     this.ammoModel[93].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3397 */     this.ammoModel[93].setRotationPoint(9.35F, -5.9F, 4.5F);
/*      */     
/* 3399 */     this.ammoModel[94].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3400 */     this.ammoModel[94].setRotationPoint(9.35F, -5.65F, 4.25F);
/*      */     
/* 3402 */     this.ammoModel[95].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3403 */     this.ammoModel[95].setRotationPoint(9.7F, -5.65F, 4.25F);
/*      */     
/* 3405 */     this.ammoModel[96].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3406 */     this.ammoModel[96].setRotationPoint(9.7F, -5.9F, 4.5F);
/*      */     
/* 3408 */     this.ammoModel[97].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3409 */     this.ammoModel[97].setRotationPoint(9.7F, -6.15F, 4.25F);
/*      */     
/* 3411 */     this.ammoModel[98].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3412 */     this.ammoModel[98].setRotationPoint(9.95F, -6.15F, 4.25F);
/*      */     
/* 3414 */     this.ammoModel[99].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3415 */     this.ammoModel[99].setRotationPoint(9.95F, -5.9F, 4.0F);
/*      */     
/* 3417 */     this.ammoModel[100].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3418 */     this.ammoModel[100].setRotationPoint(9.95F, -5.65F, 4.25F);
/*      */     
/* 3420 */     this.ammoModel[101].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3421 */     this.ammoModel[101].setRotationPoint(8.5F, -6.15F, 4.25F);
/*      */     
/* 3423 */     this.ammoModel[102].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3424 */     this.ammoModel[102].setRotationPoint(8.5F, -5.65F, 4.25F);
/*      */     
/* 3426 */     this.ammoModel[103].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3427 */     this.ammoModel[103].setRotationPoint(8.1F, -6.15F, 4.25F);
/*      */     
/* 3429 */     this.ammoModel[104].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3430 */     this.ammoModel[104].setRotationPoint(8.1F, -5.65F, 4.25F);
/*      */     
/* 3432 */     this.ammoModel[105].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3433 */     this.ammoModel[105].setRotationPoint(9.15F, -6.15F, 4.25F);
/*      */     
/* 3435 */     this.ammoModel[106].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3436 */     this.ammoModel[106].setRotationPoint(9.15F, -5.65F, 4.25F);
/*      */     
/* 3438 */     this.ammoModel[107].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3439 */     this.ammoModel[107].setRotationPoint(8.5F, -5.9F, 4.5F);
/*      */     
/* 3441 */     this.ammoModel[108].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3442 */     this.ammoModel[108].setRotationPoint(8.1F, -5.9F, 4.5F);
/*      */     
/* 3444 */     this.ammoModel[109].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3445 */     this.ammoModel[109].setRotationPoint(9.15F, -5.9F, 4.5F);
/*      */     
/* 3447 */     this.ammoModel[110].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3448 */     this.ammoModel[110].setRotationPoint(8.5F, -4.85F, 4.75F);
/*      */     
/* 3450 */     this.ammoModel[111].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3451 */     this.ammoModel[111].setRotationPoint(8.1F, -4.85F, 4.75F);
/*      */     
/* 3453 */     this.ammoModel[112].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3454 */     this.ammoModel[112].setRotationPoint(9.15F, -4.85F, 4.75F);
/*      */     
/* 3456 */     this.ammoModel[113].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3457 */     this.ammoModel[113].setRotationPoint(8.0F, -7.5F, 3.25F);
/*      */     
/* 3459 */     this.ammoModel[114].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3460 */     this.ammoModel[114].setRotationPoint(8.0F, -7.75F, 3.0F);
/*      */     
/* 3462 */     this.ammoModel[115].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3463 */     this.ammoModel[115].setRotationPoint(8.0F, -7.25F, 3.0F);
/*      */     
/* 3465 */     this.ammoModel[116].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3466 */     this.ammoModel[116].setRotationPoint(8.0F, -7.5F, 3.0F);
/*      */     
/* 3468 */     this.ammoModel[117].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3469 */     this.ammoModel[117].setRotationPoint(8.0F, -7.5F, 2.75F);
/*      */     
/* 3471 */     this.ammoModel[118].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3472 */     this.ammoModel[118].setRotationPoint(8.0F, -7.5F, 2.75F);
/*      */     
/* 3474 */     this.ammoModel[119].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3475 */     this.ammoModel[119].setRotationPoint(8.0F, -7.75F, 3.0F);
/*      */     
/* 3477 */     this.ammoModel[120].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3478 */     this.ammoModel[120].setRotationPoint(8.0F, -7.25F, 3.0F);
/*      */     
/* 3480 */     this.ammoModel[121].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3481 */     this.ammoModel[121].setRotationPoint(8.1F, -7.5F, 3.25F);
/*      */     
/* 3483 */     this.ammoModel[122].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3484 */     this.ammoModel[122].setRotationPoint(8.1F, -7.25F, 3.0F);
/*      */     
/* 3486 */     this.ammoModel[123].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3487 */     this.ammoModel[123].setRotationPoint(8.1F, -7.75F, 3.0F);
/*      */     
/* 3489 */     this.ammoModel[124].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3490 */     this.ammoModel[124].setRotationPoint(9.35F, -7.75F, 3.0F);
/*      */     
/* 3492 */     this.ammoModel[125].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3493 */     this.ammoModel[125].setRotationPoint(9.35F, -7.5F, 3.25F);
/*      */     
/* 3495 */     this.ammoModel[126].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3496 */     this.ammoModel[126].setRotationPoint(9.35F, -7.25F, 3.0F);
/*      */     
/* 3498 */     this.ammoModel[127].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3499 */     this.ammoModel[127].setRotationPoint(9.7F, -7.25F, 3.0F);
/*      */     
/* 3501 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3502 */     this.ammoModel[''].setRotationPoint(9.7F, -7.5F, 3.25F);
/*      */     
/* 3504 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3505 */     this.ammoModel[''].setRotationPoint(9.7F, -7.75F, 3.0F);
/*      */     
/* 3507 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3508 */     this.ammoModel[''].setRotationPoint(9.95F, -7.75F, 3.0F);
/*      */     
/* 3510 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3511 */     this.ammoModel[''].setRotationPoint(9.95F, -7.5F, 2.75F);
/*      */     
/* 3513 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3514 */     this.ammoModel[''].setRotationPoint(9.95F, -7.25F, 3.0F);
/*      */     
/* 3516 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3517 */     this.ammoModel[''].setRotationPoint(8.5F, -7.5F, 3.25F);
/*      */     
/* 3519 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3520 */     this.ammoModel[''].setRotationPoint(8.5F, -7.75F, 3.0F);
/*      */     
/* 3522 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3523 */     this.ammoModel[''].setRotationPoint(8.5F, -7.25F, 3.0F);
/*      */     
/* 3525 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3526 */     this.ammoModel[''].setRotationPoint(8.1F, -7.5F, 3.25F);
/*      */     
/* 3528 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3529 */     this.ammoModel[''].setRotationPoint(8.1F, -7.75F, 3.0F);
/*      */     
/* 3531 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3532 */     this.ammoModel[''].setRotationPoint(8.1F, -7.25F, 3.0F);
/*      */     
/* 3534 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3535 */     this.ammoModel[''].setRotationPoint(9.15F, -7.5F, 3.25F);
/*      */     
/* 3537 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3538 */     this.ammoModel[''].setRotationPoint(9.15F, -7.75F, 3.0F);
/*      */     
/* 3540 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3541 */     this.ammoModel[''].setRotationPoint(9.15F, -7.25F, 3.0F);
/*      */     
/* 3543 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3544 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 2.25F);
/*      */     
/* 3546 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3547 */     this.ammoModel[''].setRotationPoint(8.0F, -7.75F, 2.0F);
/*      */     
/* 3549 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3550 */     this.ammoModel[''].setRotationPoint(8.0F, -7.25F, 2.0F);
/*      */     
/* 3552 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3553 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 2.0F);
/*      */     
/* 3555 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3556 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 1.75F);
/*      */     
/* 3558 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3559 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 1.75F);
/*      */     
/* 3561 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3562 */     this.ammoModel[''].setRotationPoint(8.0F, -7.75F, 2.0F);
/*      */     
/* 3564 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3565 */     this.ammoModel[''].setRotationPoint(8.0F, -7.25F, 2.0F);
/*      */     
/* 3567 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3568 */     this.ammoModel[''].setRotationPoint(8.1F, -7.5F, 2.25F);
/*      */     
/* 3570 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3571 */     this.ammoModel[''].setRotationPoint(8.1F, -7.25F, 2.0F);
/*      */     
/* 3573 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3574 */     this.ammoModel[''].setRotationPoint(8.1F, -7.75F, 2.0F);
/*      */     
/* 3576 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3577 */     this.ammoModel[''].setRotationPoint(9.35F, -7.75F, 2.0F);
/*      */     
/* 3579 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3580 */     this.ammoModel[''].setRotationPoint(9.35F, -7.5F, 2.25F);
/*      */     
/* 3582 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3583 */     this.ammoModel[''].setRotationPoint(9.35F, -7.25F, 2.0F);
/*      */     
/* 3585 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3586 */     this.ammoModel[''].setRotationPoint(9.7F, -7.25F, 2.0F);
/*      */     
/* 3588 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3589 */     this.ammoModel[''].setRotationPoint(9.7F, -7.5F, 2.25F);
/*      */     
/* 3591 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3592 */     this.ammoModel[''].setRotationPoint(9.7F, -7.75F, 2.0F);
/*      */     
/* 3594 */     this.ammoModel[''].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3595 */     this.ammoModel[''].setRotationPoint(9.95F, -7.75F, 2.0F);
/*      */     
/* 3597 */     this.ammoModel[' '].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3598 */     this.ammoModel[' '].setRotationPoint(9.95F, -7.5F, 1.75F);
/*      */     
/* 3600 */     this.ammoModel['¡'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3601 */     this.ammoModel['¡'].setRotationPoint(9.95F, -7.25F, 2.0F);
/*      */     
/* 3603 */     this.ammoModel['¢'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3604 */     this.ammoModel['¢'].setRotationPoint(8.5F, -7.5F, 2.25F);
/*      */     
/* 3606 */     this.ammoModel['£'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3607 */     this.ammoModel['£'].setRotationPoint(8.5F, -7.75F, 2.0F);
/*      */     
/* 3609 */     this.ammoModel['¤'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3610 */     this.ammoModel['¤'].setRotationPoint(8.5F, -7.25F, 2.0F);
/*      */     
/* 3612 */     this.ammoModel['¥'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3613 */     this.ammoModel['¥'].setRotationPoint(8.1F, -7.5F, 2.25F);
/*      */     
/* 3615 */     this.ammoModel['¦'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3616 */     this.ammoModel['¦'].setRotationPoint(8.1F, -7.75F, 2.0F);
/*      */     
/* 3618 */     this.ammoModel['§'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3619 */     this.ammoModel['§'].setRotationPoint(8.1F, -7.25F, 2.0F);
/*      */     
/* 3621 */     this.ammoModel['¨'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3622 */     this.ammoModel['¨'].setRotationPoint(9.15F, -7.5F, 2.25F);
/*      */     
/* 3624 */     this.ammoModel['©'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3625 */     this.ammoModel['©'].setRotationPoint(9.15F, -7.75F, 2.0F);
/*      */     
/* 3627 */     this.ammoModel['ª'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3628 */     this.ammoModel['ª'].setRotationPoint(9.15F, -7.25F, 2.0F);
/*      */     
/* 3630 */     this.ammoModel['«'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3631 */     this.ammoModel['«'].setRotationPoint(8.0F, -7.5F, 1.25F);
/*      */     
/* 3633 */     this.ammoModel['¬'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3634 */     this.ammoModel['¬'].setRotationPoint(8.0F, -7.75F, 1.0F);
/*      */     
/* 3636 */     this.ammoModel['­'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3637 */     this.ammoModel['­'].setRotationPoint(8.0F, -7.25F, 1.0F);
/*      */     
/* 3639 */     this.ammoModel['®'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3640 */     this.ammoModel['®'].setRotationPoint(8.0F, -7.5F, 1.0F);
/*      */     
/* 3642 */     this.ammoModel['¯'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3643 */     this.ammoModel['¯'].setRotationPoint(8.0F, -7.5F, 0.75F);
/*      */     
/* 3645 */     this.ammoModel['°'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3646 */     this.ammoModel['°'].setRotationPoint(8.0F, -7.5F, 0.75F);
/*      */     
/* 3648 */     this.ammoModel['±'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3649 */     this.ammoModel['±'].setRotationPoint(8.0F, -7.75F, 1.0F);
/*      */     
/* 3651 */     this.ammoModel['²'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3652 */     this.ammoModel['²'].setRotationPoint(8.0F, -7.25F, 1.0F);
/*      */     
/* 3654 */     this.ammoModel['³'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3655 */     this.ammoModel['³'].setRotationPoint(8.1F, -7.5F, 1.25F);
/*      */     
/* 3657 */     this.ammoModel['´'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3658 */     this.ammoModel['´'].setRotationPoint(8.1F, -7.25F, 1.0F);
/*      */     
/* 3660 */     this.ammoModel['µ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3661 */     this.ammoModel['µ'].setRotationPoint(8.1F, -7.75F, 1.0F);
/*      */     
/* 3663 */     this.ammoModel['¶'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3664 */     this.ammoModel['¶'].setRotationPoint(9.35F, -7.75F, 1.0F);
/*      */     
/* 3666 */     this.ammoModel['·'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3667 */     this.ammoModel['·'].setRotationPoint(9.35F, -7.5F, 1.25F);
/*      */     
/* 3669 */     this.ammoModel['¸'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3670 */     this.ammoModel['¸'].setRotationPoint(9.35F, -7.25F, 1.0F);
/*      */     
/* 3672 */     this.ammoModel['¹'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3673 */     this.ammoModel['¹'].setRotationPoint(9.7F, -7.25F, 1.0F);
/*      */     
/* 3675 */     this.ammoModel['º'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3676 */     this.ammoModel['º'].setRotationPoint(9.7F, -7.5F, 1.25F);
/*      */     
/* 3678 */     this.ammoModel['»'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3679 */     this.ammoModel['»'].setRotationPoint(9.7F, -7.75F, 1.0F);
/*      */     
/* 3681 */     this.ammoModel['¼'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3682 */     this.ammoModel['¼'].setRotationPoint(9.95F, -7.75F, 1.0F);
/*      */     
/* 3684 */     this.ammoModel['½'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3685 */     this.ammoModel['½'].setRotationPoint(9.95F, -7.5F, 0.75F);
/*      */     
/* 3687 */     this.ammoModel['¾'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3688 */     this.ammoModel['¾'].setRotationPoint(9.95F, -7.25F, 1.0F);
/*      */     
/* 3690 */     this.ammoModel['¿'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3691 */     this.ammoModel['¿'].setRotationPoint(8.5F, -7.5F, 1.25F);
/*      */     
/* 3693 */     this.ammoModel['À'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3694 */     this.ammoModel['À'].setRotationPoint(8.5F, -7.75F, 1.0F);
/*      */     
/* 3696 */     this.ammoModel['Á'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3697 */     this.ammoModel['Á'].setRotationPoint(8.5F, -7.25F, 1.0F);
/*      */     
/* 3699 */     this.ammoModel['Â'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3700 */     this.ammoModel['Â'].setRotationPoint(8.1F, -7.5F, 1.25F);
/*      */     
/* 3702 */     this.ammoModel['Ã'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3703 */     this.ammoModel['Ã'].setRotationPoint(8.1F, -7.75F, 1.0F);
/*      */     
/* 3705 */     this.ammoModel['Ä'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3706 */     this.ammoModel['Ä'].setRotationPoint(8.1F, -7.25F, 1.0F);
/*      */     
/* 3708 */     this.ammoModel['Å'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3709 */     this.ammoModel['Å'].setRotationPoint(9.15F, -7.5F, 1.25F);
/*      */     
/* 3711 */     this.ammoModel['Æ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3712 */     this.ammoModel['Æ'].setRotationPoint(9.15F, -7.75F, 1.0F);
/*      */     
/* 3714 */     this.ammoModel['Ç'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3715 */     this.ammoModel['Ç'].setRotationPoint(9.15F, -7.25F, 1.0F);
/*      */     
/* 3717 */     this.ammoModel['È'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F);
/* 3718 */     this.ammoModel['È'].setRotationPoint(7.8F, -7.5F, 2.5F);
/*      */     
/* 3720 */     this.ammoModel['É'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3721 */     this.ammoModel['É'].setRotationPoint(8.0F, -3.85F, 5.0F);
/*      */     
/* 3723 */     this.ammoModel['Ê'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3724 */     this.ammoModel['Ê'].setRotationPoint(8.0F, -4.1F, 4.75F);
/*      */     
/* 3726 */     this.ammoModel['Ë'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3727 */     this.ammoModel['Ë'].setRotationPoint(8.0F, -3.6F, 4.75F);
/*      */     
/* 3729 */     this.ammoModel['Ì'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3730 */     this.ammoModel['Ì'].setRotationPoint(8.0F, -3.85F, 4.75F);
/*      */     
/* 3732 */     this.ammoModel['Í'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3733 */     this.ammoModel['Í'].setRotationPoint(8.0F, -3.85F, 4.5F);
/*      */     
/* 3735 */     this.ammoModel['Î'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3736 */     this.ammoModel['Î'].setRotationPoint(8.0F, -3.85F, 4.5F);
/*      */     
/* 3738 */     this.ammoModel['Ï'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3739 */     this.ammoModel['Ï'].setRotationPoint(8.0F, -4.1F, 4.75F);
/*      */     
/* 3741 */     this.ammoModel['Ð'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3742 */     this.ammoModel['Ð'].setRotationPoint(8.0F, -3.6F, 4.75F);
/*      */     
/* 3744 */     this.ammoModel['Ñ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3745 */     this.ammoModel['Ñ'].setRotationPoint(8.1F, -3.85F, 5.0F);
/*      */     
/* 3747 */     this.ammoModel['Ò'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3748 */     this.ammoModel['Ò'].setRotationPoint(8.1F, -3.6F, 4.75F);
/*      */     
/* 3750 */     this.ammoModel['Ó'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3751 */     this.ammoModel['Ó'].setRotationPoint(8.1F, -4.1F, 4.75F);
/*      */     
/* 3753 */     this.ammoModel['Ô'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3754 */     this.ammoModel['Ô'].setRotationPoint(9.35F, -4.1F, 4.75F);
/*      */     
/* 3756 */     this.ammoModel['Õ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3757 */     this.ammoModel['Õ'].setRotationPoint(9.35F, -3.85F, 5.0F);
/*      */     
/* 3759 */     this.ammoModel['Ö'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3760 */     this.ammoModel['Ö'].setRotationPoint(9.35F, -3.6F, 4.75F);
/*      */     
/* 3762 */     this.ammoModel['×'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3763 */     this.ammoModel['×'].setRotationPoint(9.7F, -3.6F, 4.75F);
/*      */     
/* 3765 */     this.ammoModel['Ø'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3766 */     this.ammoModel['Ø'].setRotationPoint(9.7F, -3.85F, 5.0F);
/*      */     
/* 3768 */     this.ammoModel['Ù'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3769 */     this.ammoModel['Ù'].setRotationPoint(9.7F, -4.1F, 4.75F);
/*      */     
/* 3771 */     this.ammoModel['Ú'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3772 */     this.ammoModel['Ú'].setRotationPoint(9.95F, -4.1F, 4.75F);
/*      */     
/* 3774 */     this.ammoModel['Û'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3775 */     this.ammoModel['Û'].setRotationPoint(9.95F, -3.85F, 4.5F);
/*      */     
/* 3777 */     this.ammoModel['Ü'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3778 */     this.ammoModel['Ü'].setRotationPoint(9.95F, -3.6F, 4.75F);
/*      */     
/* 3780 */     this.ammoModel['Ý'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3781 */     this.ammoModel['Ý'].setRotationPoint(8.5F, -4.1F, 4.75F);
/*      */     
/* 3783 */     this.ammoModel['Þ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3784 */     this.ammoModel['Þ'].setRotationPoint(8.5F, -3.6F, 4.75F);
/*      */     
/* 3786 */     this.ammoModel['ß'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3787 */     this.ammoModel['ß'].setRotationPoint(8.1F, -4.1F, 4.75F);
/*      */     
/* 3789 */     this.ammoModel['à'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3790 */     this.ammoModel['à'].setRotationPoint(8.1F, -3.6F, 4.75F);
/*      */     
/* 3792 */     this.ammoModel['á'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3793 */     this.ammoModel['á'].setRotationPoint(9.15F, -4.1F, 4.75F);
/*      */     
/* 3795 */     this.ammoModel['â'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3796 */     this.ammoModel['â'].setRotationPoint(9.15F, -3.6F, 4.75F);
/*      */     
/* 3798 */     this.ammoModel['ã'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3799 */     this.ammoModel['ã'].setRotationPoint(8.5F, -3.85F, 5.0F);
/*      */     
/* 3801 */     this.ammoModel['ä'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3802 */     this.ammoModel['ä'].setRotationPoint(8.1F, -3.85F, 5.0F);
/*      */     
/* 3804 */     this.ammoModel['å'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3805 */     this.ammoModel['å'].setRotationPoint(9.15F, -3.85F, 5.0F);
/*      */     
/* 3807 */     this.ammoModel['æ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3808 */     this.ammoModel['æ'].setRotationPoint(8.0F, -2.85F, 5.25F);
/*      */     
/* 3810 */     this.ammoModel['ç'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3811 */     this.ammoModel['ç'].setRotationPoint(8.0F, -3.1F, 5.0F);
/*      */     
/* 3813 */     this.ammoModel['è'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3814 */     this.ammoModel['è'].setRotationPoint(8.0F, -2.6F, 5.0F);
/*      */     
/* 3816 */     this.ammoModel['é'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3817 */     this.ammoModel['é'].setRotationPoint(8.0F, -2.85F, 5.0F);
/*      */     
/* 3819 */     this.ammoModel['ê'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3820 */     this.ammoModel['ê'].setRotationPoint(8.0F, -2.85F, 4.75F);
/*      */     
/* 3822 */     this.ammoModel['ë'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3823 */     this.ammoModel['ë'].setRotationPoint(8.0F, -2.85F, 4.75F);
/*      */     
/* 3825 */     this.ammoModel['ì'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3826 */     this.ammoModel['ì'].setRotationPoint(8.0F, -3.1F, 5.0F);
/*      */     
/* 3828 */     this.ammoModel['í'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3829 */     this.ammoModel['í'].setRotationPoint(8.0F, -2.6F, 5.0F);
/*      */     
/* 3831 */     this.ammoModel['î'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3832 */     this.ammoModel['î'].setRotationPoint(8.1F, -2.85F, 5.25F);
/*      */     
/* 3834 */     this.ammoModel['ï'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3835 */     this.ammoModel['ï'].setRotationPoint(8.1F, -2.6F, 5.0F);
/*      */     
/* 3837 */     this.ammoModel['ð'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3838 */     this.ammoModel['ð'].setRotationPoint(8.1F, -3.1F, 5.0F);
/*      */     
/* 3840 */     this.ammoModel['ñ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3841 */     this.ammoModel['ñ'].setRotationPoint(9.35F, -3.1F, 5.0F);
/*      */     
/* 3843 */     this.ammoModel['ò'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3844 */     this.ammoModel['ò'].setRotationPoint(9.35F, -2.85F, 5.25F);
/*      */     
/* 3846 */     this.ammoModel['ó'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3847 */     this.ammoModel['ó'].setRotationPoint(9.35F, -2.6F, 5.0F);
/*      */     
/* 3849 */     this.ammoModel['ô'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3850 */     this.ammoModel['ô'].setRotationPoint(9.7F, -2.6F, 5.0F);
/*      */     
/* 3852 */     this.ammoModel['õ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3853 */     this.ammoModel['õ'].setRotationPoint(9.7F, -2.85F, 5.25F);
/*      */     
/* 3855 */     this.ammoModel['ö'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3856 */     this.ammoModel['ö'].setRotationPoint(9.7F, -3.1F, 5.0F);
/*      */     
/* 3858 */     this.ammoModel['÷'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3859 */     this.ammoModel['÷'].setRotationPoint(9.95F, -3.1F, 5.0F);
/*      */     
/* 3861 */     this.ammoModel['ø'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3862 */     this.ammoModel['ø'].setRotationPoint(9.95F, -2.85F, 4.75F);
/*      */     
/* 3864 */     this.ammoModel['ù'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3865 */     this.ammoModel['ù'].setRotationPoint(9.95F, -2.6F, 5.0F);
/*      */     
/* 3867 */     this.ammoModel['ú'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3868 */     this.ammoModel['ú'].setRotationPoint(8.5F, -3.1F, 5.0F);
/*      */     
/* 3870 */     this.ammoModel['û'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3871 */     this.ammoModel['û'].setRotationPoint(8.5F, -2.6F, 5.0F);
/*      */     
/* 3873 */     this.ammoModel['ü'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3874 */     this.ammoModel['ü'].setRotationPoint(8.1F, -3.1F, 5.0F);
/*      */     
/* 3876 */     this.ammoModel['ý'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3877 */     this.ammoModel['ý'].setRotationPoint(8.1F, -2.6F, 5.0F);
/*      */     
/* 3879 */     this.ammoModel['þ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3880 */     this.ammoModel['þ'].setRotationPoint(9.15F, -3.1F, 5.0F);
/*      */     
/* 3882 */     this.ammoModel['ÿ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3883 */     this.ammoModel['ÿ'].setRotationPoint(9.15F, -2.6F, 5.0F);
/*      */     
/* 3885 */     this.ammoModel['Ā'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3886 */     this.ammoModel['Ā'].setRotationPoint(8.5F, -2.85F, 5.25F);
/*      */     
/* 3888 */     this.ammoModel['ā'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3889 */     this.ammoModel['ā'].setRotationPoint(8.1F, -2.85F, 5.25F);
/*      */     
/* 3891 */     this.ammoModel['Ă'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3892 */     this.ammoModel['Ă'].setRotationPoint(9.15F, -2.85F, 5.25F);
/*      */     
/* 3894 */     this.ammoModel['ă'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3895 */     this.ammoModel['ă'].setRotationPoint(8.0F, -1.85F, 5.25F);
/*      */     
/* 3897 */     this.ammoModel['Ą'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3898 */     this.ammoModel['Ą'].setRotationPoint(8.0F, -2.1F, 5.0F);
/*      */     
/* 3900 */     this.ammoModel['ą'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3901 */     this.ammoModel['ą'].setRotationPoint(8.0F, -1.6F, 5.0F);
/*      */     
/* 3903 */     this.ammoModel['Ć'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3904 */     this.ammoModel['Ć'].setRotationPoint(8.0F, -1.85F, 5.0F);
/*      */     
/* 3906 */     this.ammoModel['ć'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3907 */     this.ammoModel['ć'].setRotationPoint(8.0F, -1.85F, 4.75F);
/*      */     
/* 3909 */     this.ammoModel['Ĉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3910 */     this.ammoModel['Ĉ'].setRotationPoint(8.0F, -1.85F, 4.75F);
/*      */     
/* 3912 */     this.ammoModel['ĉ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3913 */     this.ammoModel['ĉ'].setRotationPoint(8.0F, -2.1F, 5.0F);
/*      */     
/* 3915 */     this.ammoModel['Ċ'].addShapeBox(-2.0F, -1.0F, -0.75F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3916 */     this.ammoModel['Ċ'].setRotationPoint(8.0F, -1.6F, 5.0F);
/*      */     
/* 3918 */     this.ammoModel['ċ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3919 */     this.ammoModel['ċ'].setRotationPoint(8.1F, -1.85F, 5.25F);
/*      */     
/* 3921 */     this.ammoModel['Č'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3922 */     this.ammoModel['Č'].setRotationPoint(8.1F, -1.6F, 5.0F);
/*      */     
/* 3924 */     this.ammoModel['č'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3925 */     this.ammoModel['č'].setRotationPoint(8.1F, -2.1F, 5.0F);
/*      */     
/* 3927 */     this.ammoModel['Ď'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3928 */     this.ammoModel['Ď'].setRotationPoint(9.35F, -2.1F, 5.0F);
/*      */     
/* 3930 */     this.ammoModel['ď'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3931 */     this.ammoModel['ď'].setRotationPoint(9.35F, -1.85F, 5.25F);
/*      */     
/* 3933 */     this.ammoModel['Đ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3934 */     this.ammoModel['Đ'].setRotationPoint(9.35F, -1.6F, 5.0F);
/*      */     
/* 3936 */     this.ammoModel['đ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3937 */     this.ammoModel['đ'].setRotationPoint(9.7F, -1.6F, 5.0F);
/*      */     
/* 3939 */     this.ammoModel['Ē'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3940 */     this.ammoModel['Ē'].setRotationPoint(9.7F, -1.85F, 5.25F);
/*      */     
/* 3942 */     this.ammoModel['ē'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3943 */     this.ammoModel['ē'].setRotationPoint(9.7F, -2.1F, 5.0F);
/*      */     
/* 3945 */     this.ammoModel['Ĕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3946 */     this.ammoModel['Ĕ'].setRotationPoint(9.95F, -2.1F, 5.0F);
/*      */     
/* 3948 */     this.ammoModel['ĕ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3949 */     this.ammoModel['ĕ'].setRotationPoint(9.95F, -1.85F, 4.75F);
/*      */     
/* 3951 */     this.ammoModel['Ė'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3952 */     this.ammoModel['Ė'].setRotationPoint(9.95F, -1.6F, 5.0F);
/*      */     
/* 3954 */     this.ammoModel['ė'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3955 */     this.ammoModel['ė'].setRotationPoint(8.5F, -2.1F, 5.0F);
/*      */     
/* 3957 */     this.ammoModel['Ę'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3958 */     this.ammoModel['Ę'].setRotationPoint(8.5F, -1.6F, 5.0F);
/*      */     
/* 3960 */     this.ammoModel['ę'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3961 */     this.ammoModel['ę'].setRotationPoint(8.1F, -2.1F, 5.0F);
/*      */     
/* 3963 */     this.ammoModel['Ě'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3964 */     this.ammoModel['Ě'].setRotationPoint(8.1F, -1.6F, 5.0F);
/*      */     
/* 3966 */     this.ammoModel['ě'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3967 */     this.ammoModel['ě'].setRotationPoint(9.15F, -2.1F, 5.0F);
/*      */     
/* 3969 */     this.ammoModel['Ĝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3970 */     this.ammoModel['Ĝ'].setRotationPoint(9.15F, -1.6F, 5.0F);
/*      */     
/* 3972 */     this.ammoModel['ĝ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3973 */     this.ammoModel['ĝ'].setRotationPoint(8.5F, -1.85F, 5.25F);
/*      */     
/* 3975 */     this.ammoModel['Ğ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3976 */     this.ammoModel['Ğ'].setRotationPoint(8.1F, -1.85F, 5.25F);
/*      */     
/* 3978 */     this.ammoModel['ğ'].addShapeBox(-2.0F, -1.0F, -0.75F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3979 */     this.ammoModel['ğ'].setRotationPoint(9.15F, -1.85F, 5.25F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm249.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */