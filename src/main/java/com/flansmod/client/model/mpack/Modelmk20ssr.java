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
/*      */ public class Modelmk20ssr
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelmk20ssr()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ǩ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[125];
/*   23 */     this.ammoModel = new ModelRendererTurbo[14];
/*   24 */     this.slideModel = new ModelRendererTurbo[37];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initdefaultScopeModel_1();
/*   28 */     initammoModel_1();
/*   29 */     initslideModel_1();
/*      */     
/*   31 */     this.gripAttachPoint = new Vector3f(10.3125F, 3.375F, 0.0F);
/*   32 */     this.scopeAttachPoint = new Vector3f(0.625F, 5.4375F, 0.0F);
/*      */     
/*   34 */     translateAll(-0.5F, -18.0F, -0.5F);
/*   35 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.07F, 0.0F);
/*      */     
/*   37 */     this.gunSlideDistance = 3.0F;
/*   38 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   41 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   46 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[1] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[2] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[3] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[4] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[5] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[6] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[7] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[8] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[9] = new ModelRendererTurbo(this, 649, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[10] = new ModelRendererTurbo(this, 833, 9, this.textureX, this.textureY);
/*   57 */     this.gunModel[11] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*   58 */     this.gunModel[12] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*   59 */     this.gunModel[13] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*   60 */     this.gunModel[14] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   61 */     this.gunModel[15] = new ModelRendererTurbo(this, 561, 17, this.textureX, this.textureY);
/*   62 */     this.gunModel[16] = new ModelRendererTurbo(this, 745, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   64 */     this.gunModel[18] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*   65 */     this.gunModel[19] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*   66 */     this.gunModel[20] = new ModelRendererTurbo(this, 833, 25, this.textureX, this.textureY);
/*   67 */     this.gunModel[21] = new ModelRendererTurbo(this, 953, 25, this.textureX, this.textureY);
/*   68 */     this.gunModel[22] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*   69 */     this.gunModel[23] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[24] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[25] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/*   72 */     this.gunModel[26] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[27] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[28] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*   75 */     this.gunModel[29] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[30] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[31] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[32] = new ModelRendererTurbo(this, 545, 17, this.textureX, this.textureY);
/*   79 */     this.gunModel[33] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[34] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[35] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[36] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[37] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[38] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[39] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[40] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*   87 */     this.gunModel[41] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*   88 */     this.gunModel[42] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*   89 */     this.gunModel[43] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*   90 */     this.gunModel[44] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[45] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*   92 */     this.gunModel[46] = new ModelRendererTurbo(this, 545, 33, this.textureX, this.textureY);
/*   93 */     this.gunModel[47] = new ModelRendererTurbo(this, 577, 33, this.textureX, this.textureY);
/*   94 */     this.gunModel[48] = new ModelRendererTurbo(this, 593, 33, this.textureX, this.textureY);
/*   95 */     this.gunModel[49] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   96 */     this.gunModel[50] = new ModelRendererTurbo(this, 721, 49, this.textureX, this.textureY);
/*   97 */     this.gunModel[51] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/*   98 */     this.gunModel[52] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*   99 */     this.gunModel[53] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  100 */     this.gunModel[54] = new ModelRendererTurbo(this, 593, 97, this.textureX, this.textureY);
/*  101 */     this.gunModel[55] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  102 */     this.gunModel[56] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/*  103 */     this.gunModel[57] = new ModelRendererTurbo(this, 585, 113, this.textureX, this.textureY);
/*  104 */     this.gunModel[58] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  105 */     this.gunModel[59] = new ModelRendererTurbo(this, 961, 41, this.textureX, this.textureY);
/*  106 */     this.gunModel[60] = new ModelRendererTurbo(this, 825, 73, this.textureX, this.textureY);
/*  107 */     this.gunModel[61] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/*  108 */     this.gunModel[62] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  109 */     this.gunModel[63] = new ModelRendererTurbo(this, 737, 17, this.textureX, this.textureY);
/*  110 */     this.gunModel[64] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/*  111 */     this.gunModel[65] = new ModelRendererTurbo(this, 593, 129, this.textureX, this.textureY);
/*  112 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  113 */     this.gunModel[67] = new ModelRendererTurbo(this, 161, 137, this.textureX, this.textureY);
/*  114 */     this.gunModel[68] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*  115 */     this.gunModel[69] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*  116 */     this.gunModel[70] = new ModelRendererTurbo(this, 329, 137, this.textureX, this.textureY);
/*  117 */     this.gunModel[71] = new ModelRendererTurbo(this, 481, 145, this.textureX, this.textureY);
/*  118 */     this.gunModel[72] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  119 */     this.gunModel[73] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  120 */     this.gunModel[74] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  121 */     this.gunModel[75] = new ModelRendererTurbo(this, 513, 193, this.textureX, this.textureY);
/*  122 */     this.gunModel[76] = new ModelRendererTurbo(this, 529, 161, this.textureX, this.textureY);
/*  123 */     this.gunModel[77] = new ModelRendererTurbo(this, 721, 33, this.textureX, this.textureY);
/*  124 */     this.gunModel[78] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*  125 */     this.gunModel[79] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  126 */     this.gunModel[80] = new ModelRendererTurbo(this, 553, 49, this.textureX, this.textureY);
/*  127 */     this.gunModel[81] = new ModelRendererTurbo(this, 977, 65, this.textureX, this.textureY);
/*  128 */     this.gunModel[82] = new ModelRendererTurbo(this, 929, 81, this.textureX, this.textureY);
/*  129 */     this.gunModel[83] = new ModelRendererTurbo(this, 889, 89, this.textureX, this.textureY);
/*  130 */     this.gunModel[84] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  131 */     this.gunModel[85] = new ModelRendererTurbo(this, 561, 33, this.textureX, this.textureY);
/*  132 */     this.gunModel[86] = new ModelRendererTurbo(this, 985, 81, this.textureX, this.textureY);
/*  133 */     this.gunModel[87] = new ModelRendererTurbo(this, 921, 97, this.textureX, this.textureY);
/*  134 */     this.gunModel[88] = new ModelRendererTurbo(this, 961, 97, this.textureX, this.textureY);
/*  135 */     this.gunModel[89] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  136 */     this.gunModel[90] = new ModelRendererTurbo(this, 1001, 97, this.textureX, this.textureY);
/*  137 */     this.gunModel[91] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*  138 */     this.gunModel[92] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  139 */     this.gunModel[93] = new ModelRendererTurbo(this, 945, 97, this.textureX, this.textureY);
/*  140 */     this.gunModel[94] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  141 */     this.gunModel[95] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*  142 */     this.gunModel[96] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  143 */     this.gunModel[97] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[98] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[99] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  146 */     this.gunModel[100] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  147 */     this.gunModel[101] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  148 */     this.gunModel[102] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  149 */     this.gunModel[103] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  150 */     this.gunModel[104] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  151 */     this.gunModel[105] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  152 */     this.gunModel[106] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[107] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  154 */     this.gunModel[108] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  155 */     this.gunModel[109] = new ModelRendererTurbo(this, 649, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[110] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[111] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[112] = new ModelRendererTurbo(this, 889, 105, this.textureX, this.textureY);
/*  159 */     this.gunModel[113] = new ModelRendererTurbo(this, 985, 145, this.textureX, this.textureY);
/*  160 */     this.gunModel[114] = new ModelRendererTurbo(this, 681, 161, this.textureX, this.textureY);
/*  161 */     this.gunModel[115] = new ModelRendererTurbo(this, 721, 161, this.textureX, this.textureY);
/*  162 */     this.gunModel[116] = new ModelRendererTurbo(this, 761, 161, this.textureX, this.textureY);
/*  163 */     this.gunModel[117] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  164 */     this.gunModel[118] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/*  165 */     this.gunModel[119] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/*  166 */     this.gunModel[120] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/*  167 */     this.gunModel[121] = new ModelRendererTurbo(this, 993, 129, this.textureX, this.textureY);
/*  168 */     this.gunModel[122] = new ModelRendererTurbo(this, 705, 161, this.textureX, this.textureY);
/*  169 */     this.gunModel[123] = new ModelRendererTurbo(this, 785, 161, this.textureX, this.textureY);
/*  170 */     this.gunModel[124] = new ModelRendererTurbo(this, 825, 161, this.textureX, this.textureY);
/*  171 */     this.gunModel[125] = new ModelRendererTurbo(this, 865, 161, this.textureX, this.textureY);
/*  172 */     this.gunModel[126] = new ModelRendererTurbo(this, 745, 161, this.textureX, this.textureY);
/*  173 */     this.gunModel[127] = new ModelRendererTurbo(this, 905, 161, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 945, 161, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 577, 57, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 193, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 169, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 113, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 201, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 201, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 201, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 201, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 177, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 177, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 593, 177, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 633, 177, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 177, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 857, 177, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 201, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 201, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 929, 177, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 201, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 969, 81, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 657, 177, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 201, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 201, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 145, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 529, 201, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 585, 201, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 641, 201, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 809, 161, this.textureX, this.textureY);
/*  206 */     this.gunModel[' '] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  207 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 705, 201, this.textureX, this.textureY);
/*  208 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 849, 161, this.textureX, this.textureY);
/*  209 */     this.gunModel['£'] = new ModelRendererTurbo(this, 889, 161, this.textureX, this.textureY);
/*  210 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 753, 201, this.textureX, this.textureY);
/*  211 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1001, 169, this.textureX, this.textureY);
/*  212 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 537, 177, this.textureX, this.textureY);
/*  213 */     this.gunModel['§'] = new ModelRendererTurbo(this, 777, 201, this.textureX, this.textureY);
/*  214 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 729, 201, this.textureX, this.textureY);
/*  215 */     this.gunModel['©'] = new ModelRendererTurbo(this, 833, 201, this.textureX, this.textureY);
/*  216 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 577, 177, this.textureX, this.textureY);
/*  217 */     this.gunModel['«'] = new ModelRendererTurbo(this, 617, 177, this.textureX, this.textureY);
/*  218 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 841, 177, this.textureX, this.textureY);
/*  219 */     this.gunModel['­'] = new ModelRendererTurbo(this, 905, 201, this.textureX, this.textureY);
/*  220 */     this.gunModel['®'] = new ModelRendererTurbo(this, 945, 201, this.textureX, this.textureY);
/*  221 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 985, 201, this.textureX, this.textureY);
/*  222 */     this.gunModel['°'] = new ModelRendererTurbo(this, 465, 209, this.textureX, this.textureY);
/*  223 */     this.gunModel['±'] = new ModelRendererTurbo(this, 249, 217, this.textureX, this.textureY);
/*  224 */     this.gunModel['²'] = new ModelRendererTurbo(this, 273, 217, this.textureX, this.textureY);
/*  225 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/*  226 */     this.gunModel['´'] = new ModelRendererTurbo(this, 1017, 9, this.textureX, this.textureY);
/*  227 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  228 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  229 */     this.gunModel['·'] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  230 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  231 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 561, 17, this.textureX, this.textureY);
/*  232 */     this.gunModel['º'] = new ModelRendererTurbo(this, 833, 17, this.textureX, this.textureY);
/*  233 */     this.gunModel['»'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  234 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  235 */     this.gunModel['½'] = new ModelRendererTurbo(this, 641, 225, this.textureX, this.textureY);
/*  236 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  237 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/*  238 */     this.gunModel['À'] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  239 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  240 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*  241 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/*  243 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  244 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*  245 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 953, 25, this.textureX, this.textureY);
/*  246 */     this.gunModel['È'] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  247 */     this.gunModel['É'] = new ModelRendererTurbo(this, 545, 17, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 737, 17, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 513, 41, this.textureX, this.textureY);
/*  251 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 537, 41, this.textureX, this.textureY);
/*  252 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 745, 41, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 769, 41, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 793, 41, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 1001, 41, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 593, 65, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 833, 25, this.textureX, this.textureY);
/*  259 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 753, 17, this.textureX, this.textureY);
/*  261 */     this.gunModel['×'] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  265 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 641, 65, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/*  268 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/*  269 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 569, 25, this.textureX, this.textureY);
/*  270 */     this.gunModel['à'] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  271 */     this.gunModel['á'] = new ModelRendererTurbo(this, 929, 73, this.textureX, this.textureY);
/*  272 */     this.gunModel['â'] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*  273 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*  274 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*  275 */     this.gunModel['å'] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*  276 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 689, 65, this.textureX, this.textureY);
/*  277 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/*  278 */     this.gunModel['è'] = new ModelRendererTurbo(this, 841, 89, this.textureX, this.textureY);
/*  279 */     this.gunModel['é'] = new ModelRendererTurbo(this, 865, 89, this.textureX, this.textureY);
/*  280 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 985, 97, this.textureX, this.textureY);
/*  281 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 929, 121, this.textureX, this.textureY);
/*  282 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 561, 33, this.textureX, this.textureY);
/*  283 */     this.gunModel['í'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  284 */     this.gunModel['î'] = new ModelRendererTurbo(this, 593, 33, this.textureX, this.textureY);
/*  285 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 1009, 33, this.textureX, this.textureY);
/*  286 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 809, 201, this.textureX, this.textureY);
/*  287 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 369, 217, this.textureX, this.textureY);
/*  288 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 881, 201, this.textureX, this.textureY);
/*  289 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 385, 217, this.textureX, this.textureY);
/*  290 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 409, 217, this.textureX, this.textureY);
/*  291 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  292 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 721, 33, this.textureX, this.textureY);
/*  293 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 937, 217, this.textureX, this.textureY);
/*  294 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 985, 217, this.textureX, this.textureY);
/*  295 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 121, 225, this.textureX, this.textureY);
/*  296 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 737, 33, this.textureX, this.textureY);
/*  297 */     this.gunModel['û'] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/*  298 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*  299 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 593, 41, this.textureX, this.textureY);
/*  300 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  301 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 817, 41, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 425, 217, this.textureX, this.textureY);
/*  303 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 481, 225, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 777, 217, this.textureX, this.textureY);
/*  305 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 185, 225, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 537, 225, this.textureX, this.textureY);
/*  307 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 833, 225, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  309 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 153, 233, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 961, 177, this.textureX, this.textureY);
/*  311 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  313 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 1017, 49, this.textureX, this.textureY);
/*  314 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 1017, 81, this.textureX, this.textureY);
/*  315 */     this.gunModel['č'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  317 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*  318 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 561, 41, this.textureX, this.textureY);
/*  319 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 953, 41, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*  321 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 545, 49, this.textureX, this.textureY);
/*  324 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  325 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 825, 73, this.textureX, this.textureY);
/*  327 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/*  329 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 985, 81, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 985, 89, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 521, 225, this.textureX, this.textureY);
/*  333 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 737, 225, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 233, 233, this.textureX, this.textureY);
/*  335 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 265, 233, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 297, 233, this.textureX, this.textureY);
/*  337 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 329, 233, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 361, 233, this.textureX, this.textureY);
/*  339 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 961, 97, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*  341 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 713, 65, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 945, 97, this.textureX, this.textureY);
/*  343 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 913, 105, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  345 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 881, 113, this.textureX, this.textureY);
/*  346 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/*  347 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  348 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 1009, 145, this.textureX, this.textureY);
/*  349 */     this.gunModel['į'] = new ModelRendererTurbo(this, 745, 161, this.textureX, this.textureY);
/*  350 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 785, 161, this.textureX, this.textureY);
/*  351 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 145, 137, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 585, 49, this.textureX, this.textureY);
/*  353 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/*  355 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/*  357 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  358 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 585, 33, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*  360 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 1009, 81, this.textureX, this.textureY);
/*  362 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 593, 97, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/*  364 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 1009, 89, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 121, 273, this.textureX, this.textureY);
/*  366 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 233, 249, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 713, 257, this.textureX, this.textureY);
/*  368 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 473, 265, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 193, 201, this.textureX, this.textureY);
/*  370 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 233, 201, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 305, 201, this.textureX, this.textureY);
/*  372 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 377, 201, this.textureX, this.textureY);
/*  373 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 33, 233, this.textureX, this.textureY);
/*  374 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 825, 161, this.textureX, this.textureY);
/*  375 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 705, 161, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 929, 177, this.textureX, this.textureY);
/*  377 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 865, 161, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 905, 161, this.textureX, this.textureY);
/*  379 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 689, 185, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 705, 185, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 729, 185, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 753, 185, this.textureX, this.textureY);
/*  383 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 777, 185, this.textureX, this.textureY);
/*  384 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 433, 201, this.textureX, this.textureY);
/*  385 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 465, 201, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 1009, 185, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 569, 201, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 625, 201, this.textureX, this.textureY);
/*  389 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 705, 169, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  391 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 553, 177, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 593, 177, this.textureX, this.textureY);
/*  393 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 633, 177, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 857, 177, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 977, 177, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  397 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*  398 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 209, 201, this.textureX, this.textureY);
/*  399 */     this.gunModel['š'] = new ModelRendererTurbo(this, 249, 201, this.textureX, this.textureY);
/*  400 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 321, 201, this.textureX, this.textureY);
/*  401 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 809, 161, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 849, 161, this.textureX, this.textureY);
/*  403 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 729, 161, this.textureX, this.textureY);
/*  404 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 769, 161, this.textureX, this.textureY);
/*  405 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 529, 201, this.textureX, this.textureY);
/*  406 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 585, 201, this.textureX, this.textureY);
/*  407 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 641, 201, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 889, 161, this.textureX, this.textureY);
/*  409 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 945, 161, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  411 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 873, 257, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 673, 273, this.textureX, this.textureY);
/*  413 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 745, 273, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/*  415 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 345, 249, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 673, 249, this.textureX, this.textureY);
/*  417 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 929, 201, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 969, 201, this.textureX, this.textureY);
/*  419 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 721, 241, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/*  421 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 145, 257, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 33, 249, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 449, 273, this.textureX, this.textureY);
/*  424 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 65, 281, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 473, 281, this.textureX, this.textureY);
/*  426 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 513, 281, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 873, 281, this.textureX, this.textureY);
/*  428 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 529, 289, this.textureX, this.textureY);
/*  429 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 953, 289, this.textureX, this.textureY);
/*  430 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/*  431 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 785, 281, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 81, 289, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 449, 297, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 577, 297, this.textureX, this.textureY);
/*  435 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 657, 297, this.textureX, this.textureY);
/*  436 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 697, 297, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 121, 305, this.textureX, this.textureY);
/*  438 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 193, 305, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 257, 305, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 321, 321, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 529, 321, this.textureX, this.textureY);
/*  442 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 825, 297, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 737, 321, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 49, 313, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 193, 321, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 97, 329, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 513, 337, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 153, 329, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 249, 329, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 841, 297, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 289, 329, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 945, 329, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 657, 337, this.textureX, this.textureY);
/*  455 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 185, 345, this.textureX, this.textureY);
/*  456 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 57, 337, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 321, 345, this.textureX, this.textureY);
/*  458 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 353, 345, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 401, 345, this.textureX, this.textureY);
/*  460 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 113, 361, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 465, 353, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 705, 345, this.textureX, this.textureY);
/*  463 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 321, 305, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 521, 361, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 569, 361, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 593, 361, this.textureX, this.textureY);
/*  467 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 761, 361, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 289, 369, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 849, 369, this.textureX, this.textureY);
/*  470 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 97, 385, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 185, 369, this.textureX, this.textureY);
/*  472 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 225, 369, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 385, 369, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 425, 369, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 513, 305, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 545, 369, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 1, 377, this.textureX, this.textureY);
/*  478 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 201, 377, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 673, 377, this.textureX, this.textureY);
/*  480 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 401, 377, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 241, 385, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 521, 385, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 545, 393, this.textureX, this.textureY);
/*  484 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 737, 385, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 761, 385, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 929, 385, this.textureX, this.textureY);
/*  487 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 385, 305, this.textureX, this.textureY);
/*  488 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 769, 305, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 873, 305, this.textureX, this.textureY);
/*  490 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 801, 385, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 961, 385, this.textureX, this.textureY);
/*  492 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 849, 393, this.textureX, this.textureY);
/*  493 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 41, 393, this.textureX, this.textureY);
/*  494 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 889, 393, this.textureX, this.textureY);
/*  495 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 177, 401, this.textureX, this.textureY);
/*  496 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 369, 401, this.textureX, this.textureY);
/*  497 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 417, 401, this.textureX, this.textureY);
/*  498 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 673, 401, this.textureX, this.textureY);
/*  499 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 825, 401, this.textureX, this.textureY);
/*  500 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 969, 401, this.textureX, this.textureY);
/*  501 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 89, 409, this.textureX, this.textureY);
/*  502 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 137, 409, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 209, 409, this.textureX, this.textureY);
/*  504 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 257, 409, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 281, 409, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 337, 409, this.textureX, this.textureY);
/*  507 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 449, 409, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 113, 409, this.textureX, this.textureY);
/*  509 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 233, 409, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 481, 409, this.textureX, this.textureY);
/*  511 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 929, 321, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 937, 409, this.textureX, this.textureY);
/*  513 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 1, 401, this.textureX, this.textureY);
/*  514 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 705, 401, this.textureX, this.textureY);
/*  515 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 313, 409, this.textureX, this.textureY);
/*  516 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 537, 417, this.textureX, this.textureY);
/*  517 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 585, 417, this.textureX, this.textureY);
/*  518 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 633, 417, this.textureX, this.textureY);
/*  519 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 697, 417, this.textureX, this.textureY);
/*  520 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 161, 425, this.textureX, this.textureY);
/*  521 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 369, 425, this.textureX, this.textureY);
/*  522 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 721, 417, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 393, 425, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 481, 425, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 657, 425, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 801, 425, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 961, 425, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 833, 425, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 425, 433, this.textureX, this.textureY);
/*  530 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 337, 441, this.textureX, this.textureY);
/*  531 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 513, 441, this.textureX, this.textureY);
/*  532 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 561, 441, this.textureX, this.textureY);
/*  533 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 609, 441, this.textureX, this.textureY);
/*      */     
/*  535 */     this.gunModel[0].addBox(44.0F, -20.0F, -6.0F, 88, 5, 13, 0.0F);
/*  536 */     this.gunModel[0].setRotationPoint(-58.0F, -22.0F, 0.0F);
/*      */     
/*  538 */     this.gunModel[1].addShapeBox(44.0F, -20.0F, -6.0F, 1, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  539 */     this.gunModel[1].setRotationPoint(30.0F, -22.0F, 0.0F);
/*      */     
/*  541 */     this.gunModel[2].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  542 */     this.gunModel[2].setRotationPoint(30.0F, -17.0F, 0.0F);
/*      */     
/*  544 */     this.gunModel[3].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  545 */     this.gunModel[3].setRotationPoint(29.0F, -15.0F, 0.0F);
/*      */     
/*  547 */     this.gunModel[4].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  548 */     this.gunModel[4].setRotationPoint(26.0F, -15.0F, 0.0F);
/*      */     
/*  550 */     this.gunModel[5].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  551 */     this.gunModel[5].setRotationPoint(25.0F, -15.0F, 0.0F);
/*      */     
/*  553 */     this.gunModel[6].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  554 */     this.gunModel[6].setRotationPoint(23.0F, -14.0F, 0.0F);
/*      */     
/*  556 */     this.gunModel[7].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  557 */     this.gunModel[7].setRotationPoint(22.0F, -13.0F, 0.0F);
/*      */     
/*  559 */     this.gunModel[8].addShapeBox(44.0F, -20.0F, -6.0F, 88, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[8].setRotationPoint(-58.0F, -17.0F, 0.0F);
/*      */     
/*  562 */     this.gunModel[9].addShapeBox(44.0F, -20.0F, -6.0F, 82, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  563 */     this.gunModel[9].setRotationPoint(-58.0F, -15.0F, 0.0F);
/*      */     
/*  565 */     this.gunModel[10].addShapeBox(44.0F, -20.0F, -6.0F, 80, 1, 13, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[10].setRotationPoint(-57.0F, -14.0F, 0.0F);
/*      */     
/*  568 */     this.gunModel[11].addShapeBox(44.0F, -20.0F, -6.0F, 80, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[11].setRotationPoint(-58.0F, -13.0F, 0.0F);
/*      */     
/*  571 */     this.gunModel[12].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  572 */     this.gunModel[12].setRotationPoint(20.5F, -11.0F, 0.0F);
/*      */     
/*  574 */     this.gunModel[13].addShapeBox(44.0F, -20.0F, -6.0F, 1, 10, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  575 */     this.gunModel[13].setRotationPoint(20.5F, -9.0F, 0.0F);
/*      */     
/*  577 */     this.gunModel[14].addShapeBox(44.0F, -20.0F, -6.0F, 35, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 9.0F, 0.0F);
/*  578 */     this.gunModel[14].setRotationPoint(-15.0F, -9.0F, 0.0F);
/*      */     
/*  580 */     this.gunModel[15].addShapeBox(44.0F, -20.0F, -6.0F, 78, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  581 */     this.gunModel[15].setRotationPoint(-57.5F, -11.0F, 0.0F);
/*      */     
/*  583 */     this.gunModel[16].addShapeBox(44.0F, -20.0F, -6.0F, 35, 2, 15, 0.0F, 0.0F, -6.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, 5.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 5.5F, 0.0F);
/*  584 */     this.gunModel[16].setRotationPoint(-15.0F, 4.0F, -1.0F);
/*      */     
/*  586 */     this.gunModel[17].addShapeBox(44.0F, -20.0F, -6.0F, 35, 1, 15, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/*  587 */     this.gunModel[17].setRotationPoint(-15.0F, 5.0F, -1.0F);
/*      */     
/*  589 */     this.gunModel[18].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  590 */     this.gunModel[18].setRotationPoint(-17.0F, -1.0F, 0.0F);
/*      */     
/*  592 */     this.gunModel[19].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[19].setRotationPoint(-19.0F, -2.0F, 0.0F);
/*      */     
/*  595 */     this.gunModel[20].addShapeBox(44.0F, -20.0F, -6.0F, 43, 7, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[20].setRotationPoint(-58.0F, -9.0F, 0.0F);
/*      */     
/*  598 */     this.gunModel[21].addShapeBox(44.0F, -20.0F, -6.0F, 19, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  599 */     this.gunModel[21].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/*  601 */     this.gunModel[22].addBox(44.0F, -20.0F, -6.0F, 16, 9, 13, 0.0F);
/*  602 */     this.gunModel[22].setRotationPoint(-74.0F, -22.0F, 0.0F);
/*      */     
/*  604 */     this.gunModel[23].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  605 */     this.gunModel[23].setRotationPoint(-17.0F, 9.0F, 2.0F);
/*      */     
/*  607 */     this.gunModel[24].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  608 */     this.gunModel[24].setRotationPoint(-19.0F, 11.0F, 2.0F);
/*      */     
/*  610 */     this.gunModel[25].addShapeBox(44.0F, -20.0F, -6.0F, 25, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  611 */     this.gunModel[25].setRotationPoint(-44.0F, 11.0F, 2.0F);
/*      */     
/*  613 */     this.gunModel[26].addShapeBox(44.0F, -20.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[26].setRotationPoint(-42.0F, 9.0F, 2.0F);
/*      */     
/*  616 */     this.gunModel[27].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[27].setRotationPoint(-41.0F, 11.0F, 2.0F);
/*      */     
/*  619 */     this.gunModel[28].addShapeBox(44.0F, -20.0F, -6.0F, 2, 11, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[28].setRotationPoint(-44.0F, 1.0F, 2.0F);
/*      */     
/*  622 */     this.gunModel[29].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[29].setRotationPoint(-42.0F, -1.0F, 2.0F);
/*      */     
/*  625 */     this.gunModel[30].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[30].setRotationPoint(-44.0F, -1.0F, 2.0F);
/*      */     
/*  628 */     this.gunModel[31].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  629 */     this.gunModel[31].setRotationPoint(-45.0F, -1.0F, 2.0F);
/*      */     
/*  631 */     this.gunModel[32].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  632 */     this.gunModel[32].setRotationPoint(-47.0F, -1.0F, 2.0F);
/*      */     
/*  634 */     this.gunModel[33].addShapeBox(44.0F, -20.0F, -6.0F, 9, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[33].setRotationPoint(-36.0F, -2.0F, 5.0F);
/*      */     
/*  637 */     this.gunModel[34].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[34].setRotationPoint(-35.0F, -1.0F, 5.0F);
/*      */     
/*  640 */     this.gunModel[35].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[35].setRotationPoint(-35.0F, 1.0F, 5.0F);
/*      */     
/*  643 */     this.gunModel[36].addShapeBox(44.0F, -20.0F, -6.0F, 4, 3, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  644 */     this.gunModel[36].setRotationPoint(-35.0F, 3.0F, 5.0F);
/*      */     
/*  646 */     this.gunModel[37].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[37].setRotationPoint(-35.0F, 6.0F, 5.0F);
/*      */     
/*  649 */     this.gunModel[38].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  650 */     this.gunModel[38].setRotationPoint(-34.0F, 8.0F, 5.0F);
/*      */     
/*  652 */     this.gunModel[39].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  653 */     this.gunModel[39].setRotationPoint(-33.0F, 10.0F, 5.0F);
/*      */     
/*  655 */     this.gunModel[40].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F);
/*  656 */     this.gunModel[40].setRotationPoint(20.5F, 1.0F, 0.0F);
/*      */     
/*  658 */     this.gunModel[41].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  659 */     this.gunModel[41].setRotationPoint(21.5F, 3.0F, 0.0F);
/*      */     
/*  661 */     this.gunModel[42].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  662 */     this.gunModel[42].setRotationPoint(20.0F, 1.0F, 0.0F);
/*      */     
/*  664 */     this.gunModel[43].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  665 */     this.gunModel[43].setRotationPoint(20.0F, 3.0F, 0.0F);
/*      */     
/*  667 */     this.gunModel[44].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F);
/*  668 */     this.gunModel[44].setRotationPoint(20.0F, 5.0F, -1.0F);
/*      */     
/*  670 */     this.gunModel[45].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.5F, 1.0F);
/*  671 */     this.gunModel[45].setRotationPoint(20.0F, 4.0F, 0.0F);
/*      */     
/*  673 */     this.gunModel[46].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.2F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.0F, 0.1F, 0.2F);
/*  674 */     this.gunModel[46].setRotationPoint(21.0F, 4.0F, 0.0F);
/*      */     
/*  676 */     this.gunModel[47].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -1.0F, -2.0F, 0.5F, -1.0F, -2.0F, 0.0F, 0.0F, 0.25F);
/*  677 */     this.gunModel[47].setRotationPoint(21.0F, 4.5F, 0.0F);
/*      */     
/*  679 */     this.gunModel[48].addBox(44.0F, -20.0F, -6.0F, 52, 11, 17, 0.0F);
/*  680 */     this.gunModel[48].setRotationPoint(-77.0F, -34.0F, -2.0F);
/*      */     
/*  682 */     this.gunModel[49].addShapeBox(44.0F, -20.0F, -6.0F, 195, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[49].setRotationPoint(-77.0F, -37.0F, -2.0F);
/*      */     
/*  685 */     this.gunModel[50].addShapeBox(44.0F, -20.0F, -6.0F, 110, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  686 */     this.gunModel[50].setRotationPoint(-77.0F, -23.0F, -2.0F);
/*      */     
/*  688 */     this.gunModel[51].addShapeBox(44.0F, -20.0F, -6.0F, 195, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  689 */     this.gunModel[51].setRotationPoint(-77.0F, -39.0F, -1.0F);
/*      */     
/*  691 */     this.gunModel[52].addShapeBox(44.0F, -20.0F, -6.0F, 139, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  692 */     this.gunModel[52].setRotationPoint(36.0F, -23.0F, -1.5F);
/*      */     
/*  694 */     this.gunModel[53].addShapeBox(44.0F, -20.0F, -6.0F, 139, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  695 */     this.gunModel[53].setRotationPoint(36.0F, -18.5F, 3.0F);
/*      */     
/*  697 */     this.gunModel[54].addShapeBox(44.0F, -20.0F, -6.0F, 139, 1, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  698 */     this.gunModel[54].setRotationPoint(36.0F, -16.5F, 1.5F);
/*      */     
/*  700 */     this.gunModel[55].addShapeBox(44.0F, -20.0F, -6.0F, 139, 1, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  701 */     this.gunModel[55].setRotationPoint(36.0F, -20.0F, 1.0F);
/*      */     
/*  703 */     this.gunModel[56].addShapeBox(44.0F, -20.0F, -6.0F, 139, 2, 14, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  704 */     this.gunModel[56].setRotationPoint(36.0F, -22.0F, -0.5F);
/*      */     
/*  706 */     this.gunModel[57].addShapeBox(44.0F, -20.0F, -6.0F, 139, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  707 */     this.gunModel[57].setRotationPoint(36.0F, -15.5F, 1.5F);
/*      */     
/*  709 */     this.gunModel[58].addShapeBox(44.0F, -20.0F, -6.0F, 61, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  710 */     this.gunModel[58].setRotationPoint(-77.0F, -47.0F, 1.5F);
/*      */     
/*  712 */     this.gunModel[59].addShapeBox(44.0F, -20.0F, -6.0F, 14, 8, 10, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  713 */     this.gunModel[59].setRotationPoint(104.0F, -47.0F, 1.5F);
/*      */     
/*  715 */     this.gunModel[60].addShapeBox(44.0F, -20.0F, -6.0F, 46, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  716 */     this.gunModel[60].setRotationPoint(58.0F, -47.0F, 1.5F);
/*      */     
/*  718 */     this.gunModel[61].addShapeBox(44.0F, -20.0F, -6.0F, 46, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  719 */     this.gunModel[61].setRotationPoint(58.0F, -43.5F, 1.5F);
/*      */     
/*  721 */     this.gunModel[62].addShapeBox(44.0F, -20.0F, -6.0F, 74, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  722 */     this.gunModel[62].setRotationPoint(-16.0F, -47.0F, 1.5F);
/*      */     
/*  724 */     this.gunModel[63].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  725 */     this.gunModel[63].setRotationPoint(-16.0F, -44.5F, 1.5F);
/*      */     
/*  727 */     this.gunModel[64].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  728 */     this.gunModel[64].setRotationPoint(-16.0F, -40.5F, 1.5F);
/*      */     
/*  730 */     this.gunModel[65].addShapeBox(44.0F, -20.0F, -6.0F, 195, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  731 */     this.gunModel[65].setRotationPoint(-77.0F, -39.5F, 1.5F);
/*      */     
/*  733 */     this.gunModel[66].addShapeBox(44.0F, -20.0F, -6.0F, 66, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  734 */     this.gunModel[66].setRotationPoint(-13.0F, -40.5F, 1.5F);
/*      */     
/*  736 */     this.gunModel[67].addShapeBox(44.0F, -20.0F, -6.0F, 75, 5, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  737 */     this.gunModel[67].setRotationPoint(-16.25F, -44.5F, 3.0F);
/*      */     
/*  739 */     this.gunModel[68].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[68].setRotationPoint(57.0F, -40.5F, 1.5F);
/*      */     
/*  742 */     this.gunModel[69].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel[69].setRotationPoint(57.0F, -44.5F, 1.5F);
/*      */     
/*  745 */     this.gunModel[70].addShapeBox(44.0F, -20.0F, -6.0F, 66, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  746 */     this.gunModel[70].setRotationPoint(-13.0F, -44.5F, 1.5F);
/*      */     
/*  748 */     this.gunModel[71].addShapeBox(44.0F, -20.0F, -6.0F, 251, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  749 */     this.gunModel[71].setRotationPoint(-77.0F, -49.5F, 2.5F);
/*      */     
/*  751 */     this.gunModel[72].addShapeBox(44.0F, -20.0F, -6.0F, 251, 1, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  752 */     this.gunModel[72].setRotationPoint(-77.0F, -50.0F, 1.0F);
/*      */     
/*  754 */     this.gunModel[73].addShapeBox(44.0F, -20.0F, -6.0F, 251, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  755 */     this.gunModel[73].setRotationPoint(-77.0F, -51.0F, 1.0F);
/*      */     
/*  757 */     this.gunModel[74].addShapeBox(44.0F, -20.0F, -6.0F, 251, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  758 */     this.gunModel[74].setRotationPoint(-77.0F, -47.5F, 10.5F);
/*      */     
/*  760 */     this.gunModel[75].addShapeBox(44.0F, -20.0F, -6.0F, 251, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  761 */     this.gunModel[75].setRotationPoint(-77.0F, -47.5F, 1.5F);
/*      */     
/*  763 */     this.gunModel[76].addShapeBox(44.0F, -20.0F, -6.0F, 74, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[76].setRotationPoint(159.0F, -31.0F, 3.0F);
/*      */     
/*  766 */     this.gunModel[77].addShapeBox(44.0F, -20.0F, -6.0F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel[77].setRotationPoint(233.0F, -31.0F, 3.0F);
/*      */     
/*  769 */     this.gunModel[78].addShapeBox(44.0F, -20.0F, -6.0F, 3, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F);
/*  770 */     this.gunModel[78].setRotationPoint(235.0F, -31.0F, 3.0F);
/*      */     
/*  772 */     this.gunModel[79].addShapeBox(44.0F, -20.0F, -6.0F, 1, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F);
/*  773 */     this.gunModel[79].setRotationPoint(238.0F, -31.0F, 3.0F);
/*      */     
/*  775 */     this.gunModel[80].addShapeBox(44.0F, -20.0F, -6.0F, 9, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel[80].setRotationPoint(239.0F, -32.0F, 2.0F);
/*      */     
/*  778 */     this.gunModel[81].addShapeBox(44.0F, -20.0F, -6.0F, 17, 6, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  779 */     this.gunModel[81].setRotationPoint(248.0F, -29.0F, 2.0F);
/*      */     
/*  781 */     this.gunModel[82].addShapeBox(44.0F, -20.0F, -6.0F, 17, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  782 */     this.gunModel[82].setRotationPoint(248.0F, -32.0F, 2.0F);
/*      */     
/*  784 */     this.gunModel[83].addShapeBox(44.0F, -20.0F, -6.0F, 17, 6, 4, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  785 */     this.gunModel[83].setRotationPoint(248.0F, -29.0F, 7.0F);
/*      */     
/*  787 */     this.gunModel[84].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  788 */     this.gunModel[84].setRotationPoint(109.0F, -45.0F, 1.0F);
/*      */     
/*  790 */     this.gunModel[85].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  791 */     this.gunModel[85].setRotationPoint(109.0F, -43.0F, 1.0F);
/*      */     
/*  793 */     this.gunModel[86].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  794 */     this.gunModel[86].setRotationPoint(109.0F, -44.0F, 1.0F);
/*      */     
/*  796 */     this.gunModel[87].addShapeBox(44.0F, -20.0F, -6.0F, 1, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  797 */     this.gunModel[87].setRotationPoint(174.0F, -37.0F, -2.0F);
/*      */     
/*  799 */     this.gunModel[88].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  800 */     this.gunModel[88].setRotationPoint(174.0F, -39.0F, -1.0F);
/*      */     
/*  802 */     this.gunModel[89].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  803 */     this.gunModel[89].setRotationPoint(174.0F, -39.5F, 1.5F);
/*      */     
/*  805 */     this.gunModel[90].addShapeBox(44.0F, -20.0F, -6.0F, 1, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  806 */     this.gunModel[90].setRotationPoint(174.0F, -47.0F, 1.5F);
/*      */     
/*  808 */     this.gunModel[91].addShapeBox(44.0F, -20.0F, -6.0F, 1, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  809 */     this.gunModel[91].setRotationPoint(174.0F, -49.5F, 2.5F);
/*      */     
/*  811 */     this.gunModel[92].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  812 */     this.gunModel[92].setRotationPoint(174.0F, -50.0F, 1.0F);
/*      */     
/*  814 */     this.gunModel[93].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  815 */     this.gunModel[93].setRotationPoint(174.0F, -51.0F, 1.0F);
/*      */     
/*  817 */     this.gunModel[94].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  818 */     this.gunModel[94].setRotationPoint(174.0F, -47.5F, 10.5F);
/*      */     
/*  820 */     this.gunModel[95].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  821 */     this.gunModel[95].setRotationPoint(174.0F, -47.5F, 1.5F);
/*      */     
/*  823 */     this.gunModel[96].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  824 */     this.gunModel[96].setRotationPoint(171.5F, -45.25F, 14.5F);
/*      */     
/*  826 */     this.gunModel[97].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  827 */     this.gunModel[97].setRotationPoint(171.5F, -45.0F, 13.5F);
/*      */     
/*  829 */     this.gunModel[98].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  830 */     this.gunModel[98].setRotationPoint(171.5F, -42.0F, 12.0F);
/*      */     
/*  832 */     this.gunModel[99].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  833 */     this.gunModel[99].setRotationPoint(171.5F, -40.5F, 11.5F);
/*      */     
/*  835 */     this.gunModel[100].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  836 */     this.gunModel[100].setRotationPoint(171.5F, -45.25F, 12.75F);
/*      */     
/*  838 */     this.gunModel[101].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F);
/*  839 */     this.gunModel[101].setRotationPoint(171.5F, -46.5F, 10.0F);
/*      */     
/*  841 */     this.gunModel[102].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  842 */     this.gunModel[102].setRotationPoint(171.5F, -42.0F, 10.25F);
/*      */     
/*  844 */     this.gunModel[103].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  845 */     this.gunModel[103].setRotationPoint(171.5F, -45.25F, 11.5F);
/*      */     
/*  847 */     this.gunModel[104].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/*  848 */     this.gunModel[104].setRotationPoint(171.5F, -40.5F, -0.5F);
/*      */     
/*  850 */     this.gunModel[105].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  851 */     this.gunModel[105].setRotationPoint(171.5F, -42.0F, -2.0F);
/*      */     
/*  853 */     this.gunModel[106].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  854 */     this.gunModel[106].setRotationPoint(171.5F, -45.0F, -2.5F);
/*      */     
/*  856 */     this.gunModel[107].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  857 */     this.gunModel[107].setRotationPoint(171.5F, -45.25F, -0.75F);
/*      */     
/*  859 */     this.gunModel[108].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/*  860 */     this.gunModel[108].setRotationPoint(171.5F, -45.25F, -2.5F);
/*      */     
/*  862 */     this.gunModel[109].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/*  863 */     this.gunModel[109].setRotationPoint(171.5F, -46.5F, -1.0F);
/*      */     
/*  865 */     this.gunModel[110].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  866 */     this.gunModel[110].setRotationPoint(171.5F, -42.0F, -0.25F);
/*      */     
/*  868 */     this.gunModel[111].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  869 */     this.gunModel[111].setRotationPoint(171.5F, -45.25F, 0.5F);
/*      */     
/*  871 */     this.gunModel[112].addShapeBox(44.0F, -20.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel[112].setRotationPoint(-44.0F, -16.0F, -1.5F);
/*      */     
/*  874 */     this.gunModel[113].addShapeBox(44.0F, -20.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  875 */     this.gunModel[113].setRotationPoint(-48.0F, -16.0F, -1.5F);
/*      */     
/*  877 */     this.gunModel[114].addShapeBox(44.0F, -20.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  878 */     this.gunModel[114].setRotationPoint(-46.0F, -16.0F, -1.5F);
/*      */     
/*  880 */     this.gunModel[115].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 16, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel[115].setRotationPoint(-46.0F, -17.0F, -1.5F);
/*      */     
/*  883 */     this.gunModel[116].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  884 */     this.gunModel[116].setRotationPoint(-46.0F, -10.0F, -1.5F);
/*      */     
/*  886 */     this.gunModel[117].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  887 */     this.gunModel[117].setRotationPoint(-36.5F, -7.5F, -0.5F);
/*      */     
/*  889 */     this.gunModel[118].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  890 */     this.gunModel[118].setRotationPoint(-36.5F, -5.5F, -0.5F);
/*      */     
/*  892 */     this.gunModel[119].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  893 */     this.gunModel[119].setRotationPoint(-36.5F, -6.5F, -0.5F);
/*      */     
/*  895 */     this.gunModel[120].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  896 */     this.gunModel[120].setRotationPoint(-26.0F, -14.5F, 1.5F);
/*      */     
/*  898 */     this.gunModel[121].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  899 */     this.gunModel[121].setRotationPoint(-26.0F, -12.5F, 1.5F);
/*      */     
/*  901 */     this.gunModel[122].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  902 */     this.gunModel[122].setRotationPoint(-26.0F, -13.5F, 1.5F);
/*      */     
/*  904 */     this.gunModel[123].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel[123].setRotationPoint(-52.5F, -20.0F, -0.5F);
/*      */     
/*  907 */     this.gunModel[124].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel[124].setRotationPoint(-52.5F, -18.0F, -0.5F);
/*      */     
/*  910 */     this.gunModel[125].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  911 */     this.gunModel[125].setRotationPoint(-52.5F, -19.0F, -0.5F);
/*      */     
/*  913 */     this.gunModel[126].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  914 */     this.gunModel[126].setRotationPoint(-47.0F, -2.0F, 0.0F);
/*      */     
/*  916 */     this.gunModel[127].addShapeBox(44.0F, -20.0F, -6.0F, 11, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  917 */     this.gunModel[127].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/*  919 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 11, 1, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  920 */     this.gunModel[''].setRotationPoint(-58.0F, -2.5F, 2.0F);
/*      */     
/*  922 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  923 */     this.gunModel[''].setRotationPoint(-45.0F, -0.5F, 0.0F);
/*      */     
/*  925 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 1, 13, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  926 */     this.gunModel[''].setRotationPoint(-45.0F, 1.0F, 0.0F);
/*      */     
/*  928 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 13, 15, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  929 */     this.gunModel[''].setRotationPoint(-58.0F, -0.5F, 0.0F);
/*      */     
/*  931 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 3, 5, 13, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  932 */     this.gunModel[''].setRotationPoint(-61.0F, -1.0F, 0.0F);
/*      */     
/*  934 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 1, 5, 9, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/*  935 */     this.gunModel[''].setRotationPoint(-62.0F, -1.0F, 2.0F);
/*      */     
/*  937 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 3, 35, 13, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 24.0F, 0.0F, -2.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -2.0F);
/*  938 */     this.gunModel[''].setRotationPoint(-61.0F, 4.5F, 0.0F);
/*      */     
/*  940 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 1, 35, 9, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 24.0F, 0.0F, -3.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -3.0F);
/*  941 */     this.gunModel[''].setRotationPoint(-62.0F, 4.5F, 2.0F);
/*      */     
/*  943 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 7, 10, 13, 0.0F, -7.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -7.0F, 0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/*  944 */     this.gunModel[''].setRotationPoint(-65.0F, 4.5F, 0.0F);
/*      */     
/*  946 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 3, 24, 13, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, -10.0F, 0.0F, -2.0F, -10.0F, 0.0F, -2.0F, 11.0F, 0.0F, 0.0F);
/*  947 */     this.gunModel[''].setRotationPoint(-51.5F, 14.5F, 0.0F);
/*      */     
/*  949 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 3, 24, 13, 0.0F, -2.4F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F);
/*  950 */     this.gunModel[''].setRotationPoint(-67.5F, 14.5F, 0.0F);
/*      */     
/*  952 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  953 */     this.gunModel[''].setRotationPoint(-62.5F, 38.5F, 0.0F);
/*      */     
/*  955 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F);
/*  956 */     this.gunModel[''].setRotationPoint(-62.5F, 39.5F, 0.0F);
/*      */     
/*  958 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  959 */     this.gunModel[''].setRotationPoint(-60.5F, 41.5F, 0.0F);
/*      */     
/*  961 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  962 */     this.gunModel[''].setRotationPoint(-60.5F, 43.5F, 0.0F);
/*      */     
/*  964 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 21, 2, 13, 0.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -4.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.5F, 0.0F);
/*  965 */     this.gunModel[''].setRotationPoint(-81.5F, 43.5F, 0.0F);
/*      */     
/*  967 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 13, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/*  968 */     this.gunModel[''].setRotationPoint(-80.5F, 41.5F, 0.0F);
/*      */     
/*  970 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 13, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  971 */     this.gunModel[''].setRotationPoint(-80.5F, 39.5F, 0.0F);
/*      */     
/*  973 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 18, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  974 */     this.gunModel[''].setRotationPoint(-80.5F, 38.5F, 0.0F);
/*      */     
/*  976 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  977 */     this.gunModel[''].setRotationPoint(-82.5F, 39.5F, 0.0F);
/*      */     
/*  979 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 3, 2, 13, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, -2.0F);
/*  980 */     this.gunModel[''].setRotationPoint(-85.0F, 39.5F, 0.0F);
/*      */     
/*  982 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.5F, -3.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -3.0F);
/*  983 */     this.gunModel[''].setRotationPoint(-86.0F, 39.5F, 2.0F);
/*      */     
/*  985 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 13, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  986 */     this.gunModel[''].setRotationPoint(-81.5F, 38.5F, 0.0F);
/*      */     
/*  988 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  989 */     this.gunModel[''].setRotationPoint(-52.5F, 21.0F, 2.0F);
/*      */     
/*  991 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  992 */     this.gunModel[''].setRotationPoint(-52.5F, 23.0F, 2.0F);
/*      */     
/*  994 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 6, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  995 */     this.gunModel[''].setRotationPoint(-52.5F, 25.0F, 2.0F);
/*      */     
/*  997 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  998 */     this.gunModel[''].setRotationPoint(-52.5F, 26.0F, 2.0F);
/*      */     
/* 1000 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1001 */     this.gunModel[''].setRotationPoint(-49.5F, 20.0F, 2.0F);
/*      */     
/* 1003 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 11, 4, 14, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1004 */     this.gunModel[''].setRotationPoint(-62.0F, 8.5F, -0.5F);
/*      */     
/* 1006 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 11, 21, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F);
/* 1007 */     this.gunModel[''].setRotationPoint(-62.0F, 12.5F, -0.5F);
/*      */     
/* 1009 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 16, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F);
/* 1010 */     this.gunModel[''].setRotationPoint(-76.0F, 33.5F, -0.5F);
/*      */     
/* 1012 */     this.gunModel[''].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F);
/* 1013 */     this.gunModel[''].setRotationPoint(-61.0F, -2.5F, 2.0F);
/*      */     
/* 1015 */     this.gunModel[' '].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 5, 0.0F, -0.25F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, -2.0F, -0.25F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F);
/* 1016 */     this.gunModel[' '].setRotationPoint(-62.0F, -2.5F, 4.0F);
/*      */     
/* 1018 */     this.gunModel['¡'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 3, 17, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/* 1019 */     this.gunModel['¡'].setRotationPoint(-61.0F, -4.5F, -2.0F);
/*      */     
/* 1021 */     this.gunModel['¢'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 3, 9, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1022 */     this.gunModel['¢'].setRotationPoint(-62.0F, -4.5F, 2.0F);
/*      */     
/* 1024 */     this.gunModel['£'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 9, 0.0F, 1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1025 */     this.gunModel['£'].setRotationPoint(-63.0F, -6.5F, 2.0F);
/*      */     
/* 1027 */     this.gunModel['¤'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 2, 17, 0.0F, 1.0F, 0.0F, -4.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 1.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/* 1028 */     this.gunModel['¤'].setRotationPoint(-62.0F, -6.5F, -2.0F);
/*      */     
/* 1030 */     this.gunModel['¥'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 9, 0.0F, 2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1031 */     this.gunModel['¥'].setRotationPoint(-64.5F, -7.5F, 2.0F);
/*      */     
/* 1033 */     this.gunModel['¦'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 9, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F);
/* 1034 */     this.gunModel['¦'].setRotationPoint(-63.5F, -7.5F, 2.0F);
/*      */     
/* 1036 */     this.gunModel['§'].addShapeBox(44.0F, -20.0F, -6.0F, 11, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1037 */     this.gunModel['§'].setRotationPoint(-76.5F, -10.5F, 0.0F);
/*      */     
/* 1039 */     this.gunModel['¨'].addShapeBox(44.0F, -20.0F, -6.0F, 10, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1040 */     this.gunModel['¨'].setRotationPoint(-76.5F, -8.5F, 2.0F);
/*      */     
/* 1042 */     this.gunModel['©'].addShapeBox(44.0F, -20.0F, -6.0F, 19, 3, 13, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1043 */     this.gunModel['©'].setRotationPoint(-76.5F, -13.5F, 0.0F);
/*      */     
/* 1045 */     this.gunModel['ª'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1046 */     this.gunModel['ª'].setRotationPoint(-67.0F, -8.5F, 2.0F);
/*      */     
/* 1048 */     this.gunModel['«'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1049 */     this.gunModel['«'].setRotationPoint(-65.5F, -8.5F, 2.0F);
/*      */     
/* 1051 */     this.gunModel['¬'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 9, 0.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1052 */     this.gunModel['¬'].setRotationPoint(-65.5F, -10.5F, 2.0F);
/*      */     
/* 1054 */     this.gunModel['­'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1055 */     this.gunModel['­'].setRotationPoint(-63.5F, -10.5F, 0.0F);
/*      */     
/* 1057 */     this.gunModel['®'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1058 */     this.gunModel['®'].setRotationPoint(-63.5F, -7.5F, 0.0F);
/*      */     
/* 1060 */     this.gunModel['¯'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1061 */     this.gunModel['¯'].setRotationPoint(-61.5F, -6.5F, 0.0F);
/*      */     
/* 1063 */     this.gunModel['°'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 3, 13, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1064 */     this.gunModel['°'].setRotationPoint(-61.5F, -4.5F, 0.0F);
/*      */     
/* 1066 */     this.gunModel['±'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1067 */     this.gunModel['±'].setRotationPoint(-65.5F, -10.5F, 0.0F);
/*      */     
/* 1069 */     this.gunModel['²'].addShapeBox(44.0F, -20.0F, -6.0F, 51, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1070 */     this.gunModel['²'].setRotationPoint(118.0F, -33.0F, 15.5F);
/*      */     
/* 1072 */     this.gunModel['³'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1073 */     this.gunModel['³'].setRotationPoint(117.0F, -33.0F, 15.5F);
/*      */     
/* 1075 */     this.gunModel['´'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1076 */     this.gunModel['´'].setRotationPoint(169.0F, -33.0F, 15.5F);
/*      */     
/* 1078 */     this.gunModel['µ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1079 */     this.gunModel['µ'].setRotationPoint(163.0F, -29.5F, 16.0F);
/*      */     
/* 1081 */     this.gunModel['¶'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1082 */     this.gunModel['¶'].setRotationPoint(163.0F, -27.5F, 16.0F);
/*      */     
/* 1084 */     this.gunModel['·'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1085 */     this.gunModel['·'].setRotationPoint(163.0F, -28.5F, 16.0F);
/*      */     
/* 1087 */     this.gunModel['¸'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1088 */     this.gunModel['¸'].setRotationPoint(121.0F, -29.5F, 16.0F);
/*      */     
/* 1090 */     this.gunModel['¹'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1091 */     this.gunModel['¹'].setRotationPoint(121.0F, -27.5F, 16.0F);
/*      */     
/* 1093 */     this.gunModel['º'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1094 */     this.gunModel['º'].setRotationPoint(121.0F, -28.5F, 16.0F);
/*      */     
/* 1096 */     this.gunModel['»'].addShapeBox(44.0F, -20.0F, -6.0F, 45, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1097 */     this.gunModel['»'].setRotationPoint(121.0F, -31.0F, 14.5F);
/*      */     
/* 1099 */     this.gunModel['¼'].addShapeBox(44.0F, -20.0F, -6.0F, 45, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1100 */     this.gunModel['¼'].setRotationPoint(121.0F, -31.0F, -2.5F);
/*      */     
/* 1102 */     this.gunModel['½'].addShapeBox(44.0F, -20.0F, -6.0F, 51, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1103 */     this.gunModel['½'].setRotationPoint(118.0F, -33.0F, -4.5F);
/*      */     
/* 1105 */     this.gunModel['¾'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1106 */     this.gunModel['¾'].setRotationPoint(117.0F, -33.0F, -4.5F);
/*      */     
/* 1108 */     this.gunModel['¿'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1109 */     this.gunModel['¿'].setRotationPoint(169.0F, -33.0F, -4.5F);
/*      */     
/* 1111 */     this.gunModel['À'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1112 */     this.gunModel['À'].setRotationPoint(163.0F, -29.5F, -5.0F);
/*      */     
/* 1114 */     this.gunModel['Á'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1115 */     this.gunModel['Á'].setRotationPoint(163.0F, -27.5F, -5.0F);
/*      */     
/* 1117 */     this.gunModel['Â'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1118 */     this.gunModel['Â'].setRotationPoint(163.0F, -28.5F, -5.0F);
/*      */     
/* 1120 */     this.gunModel['Ã'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1121 */     this.gunModel['Ã'].setRotationPoint(121.0F, -29.5F, -5.0F);
/*      */     
/* 1123 */     this.gunModel['Ä'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1124 */     this.gunModel['Ä'].setRotationPoint(121.0F, -27.5F, -5.0F);
/*      */     
/* 1126 */     this.gunModel['Å'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1127 */     this.gunModel['Å'].setRotationPoint(121.0F, -28.5F, -5.0F);
/*      */     
/* 1129 */     this.gunModel['Æ'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1130 */     this.gunModel['Æ'].setRotationPoint(25.0F, -31.5F, 14.5F);
/*      */     
/* 1132 */     this.gunModel['Ç'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1133 */     this.gunModel['Ç'].setRotationPoint(22.0F, -31.5F, 14.5F);
/*      */     
/* 1135 */     this.gunModel['È'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1136 */     this.gunModel['È'].setRotationPoint(21.0F, -29.5F, 14.5F);
/*      */     
/* 1138 */     this.gunModel['É'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1139 */     this.gunModel['É'].setRotationPoint(45.0F, -30.5F, 14.5F);
/*      */     
/* 1141 */     this.gunModel['Ê'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1142 */     this.gunModel['Ê'].setRotationPoint(47.0F, -29.5F, 14.5F);
/*      */     
/* 1144 */     this.gunModel['Ë'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1145 */     this.gunModel['Ë'].setRotationPoint(48.0F, -29.5F, 14.5F);
/*      */     
/* 1147 */     this.gunModel['Ì'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 1148 */     this.gunModel['Ì'].setRotationPoint(48.0F, -28.5F, 14.5F);
/*      */     
/* 1150 */     this.gunModel['Í'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F);
/* 1151 */     this.gunModel['Í'].setRotationPoint(47.0F, -27.5F, 14.5F);
/*      */     
/* 1153 */     this.gunModel['Î'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1154 */     this.gunModel['Î'].setRotationPoint(45.0F, -32.5F, -3.5F);
/*      */     
/* 1156 */     this.gunModel['Ï'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1157 */     this.gunModel['Ï'].setRotationPoint(48.0F, -30.5F, 14.5F);
/*      */     
/* 1159 */     this.gunModel['Ð'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1160 */     this.gunModel['Ð'].setRotationPoint(47.0F, -31.5F, 14.5F);
/*      */     
/* 1162 */     this.gunModel['Ñ'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1163 */     this.gunModel['Ñ'].setRotationPoint(45.0F, -26.5F, 14.5F);
/*      */     
/* 1165 */     this.gunModel['Ò'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1166 */     this.gunModel['Ò'].setRotationPoint(25.0F, -32.5F, 14.5F);
/*      */     
/* 1168 */     this.gunModel['Ó'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1169 */     this.gunModel['Ó'].setRotationPoint(25.0F, -26.5F, 14.5F);
/*      */     
/* 1171 */     this.gunModel['Ô'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1172 */     this.gunModel['Ô'].setRotationPoint(22.0F, -32.5F, 14.5F);
/*      */     
/* 1174 */     this.gunModel['Õ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/* 1175 */     this.gunModel['Õ'].setRotationPoint(22.0F, -26.5F, 14.5F);
/*      */     
/* 1177 */     this.gunModel['Ö'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1178 */     this.gunModel['Ö'].setRotationPoint(21.0F, -31.5F, 14.5F);
/*      */     
/* 1180 */     this.gunModel['×'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1181 */     this.gunModel['×'].setRotationPoint(21.0F, -28.5F, 14.5F);
/*      */     
/* 1183 */     this.gunModel['Ø'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1184 */     this.gunModel['Ø'].setRotationPoint(26.0F, -30.5F, 15.0F);
/*      */     
/* 1186 */     this.gunModel['Ù'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1187 */     this.gunModel['Ù'].setRotationPoint(26.0F, -28.5F, 15.0F);
/*      */     
/* 1189 */     this.gunModel['Ú'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1190 */     this.gunModel['Ú'].setRotationPoint(26.0F, -29.5F, 15.0F);
/*      */     
/* 1192 */     this.gunModel['Û'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1193 */     this.gunModel['Û'].setRotationPoint(25.0F, -31.5F, -3.5F);
/*      */     
/* 1195 */     this.gunModel['Ü'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1196 */     this.gunModel['Ü'].setRotationPoint(22.0F, -31.5F, -3.5F);
/*      */     
/* 1198 */     this.gunModel['Ý'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1199 */     this.gunModel['Ý'].setRotationPoint(21.0F, -29.5F, -2.5F);
/*      */     
/* 1201 */     this.gunModel['Þ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1202 */     this.gunModel['Þ'].setRotationPoint(21.0F, -31.5F, -2.5F);
/*      */     
/* 1204 */     this.gunModel['ß'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1205 */     this.gunModel['ß'].setRotationPoint(21.0F, -28.5F, -2.5F);
/*      */     
/* 1207 */     this.gunModel['à'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1208 */     this.gunModel['à'].setRotationPoint(22.0F, -32.5F, -3.5F);
/*      */     
/* 1210 */     this.gunModel['á'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1211 */     this.gunModel['á'].setRotationPoint(25.0F, -32.5F, -3.5F);
/*      */     
/* 1213 */     this.gunModel['â'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1214 */     this.gunModel['â'].setRotationPoint(45.0F, -30.5F, -3.5F);
/*      */     
/* 1216 */     this.gunModel['ã'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1217 */     this.gunModel['ã'].setRotationPoint(47.0F, -29.5F, -3.5F);
/*      */     
/* 1219 */     this.gunModel['ä'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1220 */     this.gunModel['ä'].setRotationPoint(45.0F, -32.5F, 14.5F);
/*      */     
/* 1222 */     this.gunModel['å'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1223 */     this.gunModel['å'].setRotationPoint(47.0F, -31.5F, -3.5F);
/*      */     
/* 1225 */     this.gunModel['æ'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1226 */     this.gunModel['æ'].setRotationPoint(48.0F, -30.5F, -3.5F);
/*      */     
/* 1228 */     this.gunModel['ç'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1229 */     this.gunModel['ç'].setRotationPoint(48.0F, -29.5F, -3.5F);
/*      */     
/* 1231 */     this.gunModel['è'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1232 */     this.gunModel['è'].setRotationPoint(48.0F, -28.5F, -3.5F);
/*      */     
/* 1234 */     this.gunModel['é'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1235 */     this.gunModel['é'].setRotationPoint(47.0F, -27.5F, -3.5F);
/*      */     
/* 1237 */     this.gunModel['ê'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1238 */     this.gunModel['ê'].setRotationPoint(45.0F, -26.5F, -3.5F);
/*      */     
/* 1240 */     this.gunModel['ë'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1241 */     this.gunModel['ë'].setRotationPoint(25.0F, -26.5F, -3.5F);
/*      */     
/* 1243 */     this.gunModel['ì'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1244 */     this.gunModel['ì'].setRotationPoint(22.0F, -26.5F, -3.5F);
/*      */     
/* 1246 */     this.gunModel['í'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1247 */     this.gunModel['í'].setRotationPoint(26.0F, -30.5F, -4.0F);
/*      */     
/* 1249 */     this.gunModel['î'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1250 */     this.gunModel['î'].setRotationPoint(26.0F, -28.5F, -4.0F);
/*      */     
/* 1252 */     this.gunModel['ï'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1253 */     this.gunModel['ï'].setRotationPoint(26.0F, -29.5F, -4.0F);
/*      */     
/* 1255 */     this.gunModel['ð'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 10, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1256 */     this.gunModel['ð'].setRotationPoint(-76.5F, -23.0F, -2.5F);
/*      */     
/* 1258 */     this.gunModel['ñ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 13, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1259 */     this.gunModel['ñ'].setRotationPoint(-76.5F, -14.0F, 0.0F);
/*      */     
/* 1261 */     this.gunModel['ò'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 35, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1262 */     this.gunModel['ò'].setRotationPoint(-78.5F, -47.0F, -2.5F);
/*      */     
/* 1264 */     this.gunModel['ó'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 5, 15, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1265 */     this.gunModel['ó'].setRotationPoint(-78.5F, -12.5F, -1.0F);
/*      */     
/* 1267 */     this.gunModel['ô'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1268 */     this.gunModel['ô'].setRotationPoint(-78.5F, -48.5F, 0.5F);
/*      */     
/* 1270 */     this.gunModel['õ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1271 */     this.gunModel['õ'].setRotationPoint(-78.5F, -48.0F, 12.5F);
/*      */     
/* 1273 */     this.gunModel['ö'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1274 */     this.gunModel['ö'].setRotationPoint(-78.5F, -48.0F, -0.5F);
/*      */     
/* 1276 */     this.gunModel['÷'].addShapeBox(44.0F, -20.0F, -6.0F, 10, 1, 12, 0.0F, -0.75F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1277 */     this.gunModel['÷'].setRotationPoint(-86.5F, -49.5F, 0.5F);
/*      */     
/* 1279 */     this.gunModel['ø'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F);
/* 1280 */     this.gunModel['ø'].setRotationPoint(-83.5F, -51.5F, 0.5F);
/*      */     
/* 1282 */     this.gunModel['ù'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 1, 14, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1283 */     this.gunModel['ù'].setRotationPoint(-83.5F, -50.5F, -0.5F);
/*      */     
/* 1285 */     this.gunModel['ú'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1286 */     this.gunModel['ú'].setRotationPoint(-78.5F, -46.0F, 15.5F);
/*      */     
/* 1288 */     this.gunModel['û'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1289 */     this.gunModel['û'].setRotationPoint(-78.5F, -45.0F, 16.5F);
/*      */     
/* 1291 */     this.gunModel['ü'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1292 */     this.gunModel['ü'].setRotationPoint(-78.5F, -40.0F, 15.5F);
/*      */     
/* 1294 */     this.gunModel['ý'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1295 */     this.gunModel['ý'].setRotationPoint(-78.5F, -32.0F, 15.5F);
/*      */     
/* 1297 */     this.gunModel['þ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1298 */     this.gunModel['þ'].setRotationPoint(-78.5F, -31.0F, 16.5F);
/*      */     
/* 1300 */     this.gunModel['ÿ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1301 */     this.gunModel['ÿ'].setRotationPoint(-78.5F, -26.0F, 15.5F);
/*      */     
/* 1303 */     this.gunModel['Ā'].addShapeBox(44.0F, -20.0F, -6.0F, 10, 5, 15, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1304 */     this.gunModel['Ā'].setRotationPoint(-88.5F, -12.5F, -1.0F);
/*      */     
/* 1306 */     this.gunModel['ā'].addShapeBox(44.0F, -20.0F, -6.0F, 9, 18, 18, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1307 */     this.gunModel['ā'].setRotationPoint(-87.5F, -30.0F, -2.5F);
/*      */     
/* 1309 */     this.gunModel['Ă'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 17, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1310 */     this.gunModel['Ă'].setRotationPoint(-81.5F, -47.0F, -2.5F);
/*      */     
/* 1312 */     this.gunModel['ă'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 15, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1313 */     this.gunModel['ă'].setRotationPoint(-83.5F, -47.0F, -2.5F);
/*      */     
/* 1315 */     this.gunModel['Ą'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1316 */     this.gunModel['Ą'].setRotationPoint(-87.5F, -32.0F, -2.5F);
/*      */     
/* 1318 */     this.gunModel['ą'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1319 */     this.gunModel['ą'].setRotationPoint(-83.5F, -32.0F, -2.5F);
/*      */     
/* 1321 */     this.gunModel['Ć'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 8, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1322 */     this.gunModel['Ć'].setRotationPoint(-87.5F, -40.0F, -2.5F);
/*      */     
/* 1324 */     this.gunModel['ć'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1325 */     this.gunModel['ć'].setRotationPoint(-84.75F, -48.5F, 0.5F);
/*      */     
/* 1327 */     this.gunModel['Ĉ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1328 */     this.gunModel['Ĉ'].setRotationPoint(-81.4F, -48.5F, 0.5F);
/*      */     
/* 1330 */     this.gunModel['ĉ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1331 */     this.gunModel['ĉ'].setRotationPoint(-81.4F, -48.0F, 12.5F);
/*      */     
/* 1333 */     this.gunModel['Ċ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1334 */     this.gunModel['Ċ'].setRotationPoint(-81.4F, -48.0F, -0.5F);
/*      */     
/* 1336 */     this.gunModel['ċ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 18, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1337 */     this.gunModel['ċ'].setRotationPoint(-87.5F, -30.0F, 15.5F);
/*      */     
/* 1339 */     this.gunModel['Č'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 18, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F);
/* 1340 */     this.gunModel['Č'].setRotationPoint(-87.5F, -30.0F, 16.5F);
/*      */     
/* 1342 */     this.gunModel['č'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1343 */     this.gunModel['č'].setRotationPoint(-86.5F, -27.0F, 15.0F);
/*      */     
/* 1345 */     this.gunModel['Ď'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1346 */     this.gunModel['Ď'].setRotationPoint(-87.0F, -21.0F, 15.0F);
/*      */     
/* 1348 */     this.gunModel['ď'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1349 */     this.gunModel['ď'].setRotationPoint(-36.0F, -32.5F, 14.25F);
/*      */     
/* 1351 */     this.gunModel['Đ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1352 */     this.gunModel['Đ'].setRotationPoint(-36.0F, -30.5F, 14.25F);
/*      */     
/* 1354 */     this.gunModel['đ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1355 */     this.gunModel['đ'].setRotationPoint(-36.0F, -31.5F, 14.25F);
/*      */     
/* 1357 */     this.gunModel['Ē'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1358 */     this.gunModel['Ē'].setRotationPoint(-64.0F, -32.5F, 14.25F);
/*      */     
/* 1360 */     this.gunModel['ē'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1361 */     this.gunModel['ē'].setRotationPoint(-64.0F, -30.5F, 14.25F);
/*      */     
/* 1363 */     this.gunModel['Ĕ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1364 */     this.gunModel['Ĕ'].setRotationPoint(-64.0F, -31.5F, 14.25F);
/*      */     
/* 1366 */     this.gunModel['ĕ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1367 */     this.gunModel['ĕ'].setRotationPoint(-70.0F, -30.5F, 14.25F);
/*      */     
/* 1369 */     this.gunModel['Ė'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1370 */     this.gunModel['Ė'].setRotationPoint(-70.0F, -28.5F, 14.25F);
/*      */     
/* 1372 */     this.gunModel['ė'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1373 */     this.gunModel['ė'].setRotationPoint(-70.0F, -29.5F, 14.25F);
/*      */     
/* 1375 */     this.gunModel['Ę'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1376 */     this.gunModel['Ę'].setRotationPoint(-75.0F, -30.5F, 14.25F);
/*      */     
/* 1378 */     this.gunModel['ę'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1379 */     this.gunModel['ę'].setRotationPoint(-75.0F, -28.5F, 14.25F);
/*      */     
/* 1381 */     this.gunModel['Ě'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1382 */     this.gunModel['Ě'].setRotationPoint(-75.0F, -29.5F, 14.25F);
/*      */     
/* 1384 */     this.gunModel['ě'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1385 */     this.gunModel['ě'].setRotationPoint(-3.0F, -32.5F, 14.25F);
/*      */     
/* 1387 */     this.gunModel['Ĝ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1388 */     this.gunModel['Ĝ'].setRotationPoint(-3.0F, -30.5F, 14.25F);
/*      */     
/* 1390 */     this.gunModel['ĝ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1391 */     this.gunModel['ĝ'].setRotationPoint(-3.0F, -31.5F, 14.25F);
/*      */     
/* 1393 */     this.gunModel['Ğ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1394 */     this.gunModel['Ğ'].setRotationPoint(26.75F, -18.5F, -0.5F);
/*      */     
/* 1396 */     this.gunModel['ğ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1397 */     this.gunModel['ğ'].setRotationPoint(27.0F, -17.75F, -0.5F);
/*      */     
/* 1399 */     this.gunModel['Ġ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1400 */     this.gunModel['Ġ'].setRotationPoint(27.0F, -19.25F, -0.5F);
/*      */     
/* 1402 */     this.gunModel['ġ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1403 */     this.gunModel['ġ'].setRotationPoint(26.25F, -19.25F, -0.5F);
/*      */     
/* 1405 */     this.gunModel['Ģ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 14, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1406 */     this.gunModel['Ģ'].setRotationPoint(27.5F, -19.25F, -0.5F);
/*      */     
/* 1408 */     this.gunModel['ģ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1409 */     this.gunModel['ģ'].setRotationPoint(26.25F, -18.0F, -0.5F);
/*      */     
/* 1411 */     this.gunModel['Ĥ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 14, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1412 */     this.gunModel['Ĥ'].setRotationPoint(27.5F, -18.0F, -0.5F);
/*      */     
/* 1414 */     this.gunModel['ĥ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1415 */     this.gunModel['ĥ'].setRotationPoint(-19.0F, -5.5F, 12.0F);
/*      */     
/* 1417 */     this.gunModel['Ħ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1418 */     this.gunModel['Ħ'].setRotationPoint(-15.0F, -5.5F, 12.0F);
/*      */     
/* 1420 */     this.gunModel['ħ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1421 */     this.gunModel['ħ'].setRotationPoint(-13.0F, -7.5F, 12.0F);
/*      */     
/* 1423 */     this.gunModel['Ĩ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1424 */     this.gunModel['Ĩ'].setRotationPoint(-13.0F, -15.5F, 12.0F);
/*      */     
/* 1426 */     this.gunModel['ĩ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1427 */     this.gunModel['ĩ'].setRotationPoint(-19.0F, -15.5F, 12.0F);
/*      */     
/* 1429 */     this.gunModel['Ī'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1430 */     this.gunModel['Ī'].setRotationPoint(-15.0F, -15.5F, 12.0F);
/*      */     
/* 1432 */     this.gunModel['ī'].addShapeBox(44.0F, -20.0F, -6.0F, 10, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1433 */     this.gunModel['ī'].setRotationPoint(-12.0F, -11.5F, 12.5F);
/*      */     
/* 1435 */     this.gunModel['Ĭ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1436 */     this.gunModel['Ĭ'].setRotationPoint(-2.0F, -11.5F, 12.5F);
/*      */     
/* 1438 */     this.gunModel['ĭ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1439 */     this.gunModel['ĭ'].setRotationPoint(-0.5F, -11.0F, 12.5F);
/*      */     
/* 1441 */     this.gunModel['Į'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1442 */     this.gunModel['Į'].setRotationPoint(-18.0F, -14.5F, 12.25F);
/*      */     
/* 1444 */     this.gunModel['į'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1445 */     this.gunModel['į'].setRotationPoint(-15.0F, -14.5F, 12.25F);
/*      */     
/* 1447 */     this.gunModel['İ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1448 */     this.gunModel['İ'].setRotationPoint(-21.0F, -14.5F, 12.25F);
/*      */     
/* 1450 */     this.gunModel['ı'].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1451 */     this.gunModel['ı'].setRotationPoint(-11.0F, -20.0F, 12.5F);
/*      */     
/* 1453 */     this.gunModel['Ĳ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1454 */     this.gunModel['Ĳ'].setRotationPoint(-19.5F, -22.0F, 12.0F);
/*      */     
/* 1456 */     this.gunModel['ĳ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1457 */     this.gunModel['ĳ'].setRotationPoint(-14.5F, -22.0F, 12.0F);
/*      */     
/* 1459 */     this.gunModel['Ĵ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1460 */     this.gunModel['Ĵ'].setRotationPoint(-18.5F, -22.0F, 12.5F);
/*      */     
/* 1462 */     this.gunModel['ĵ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1463 */     this.gunModel['ĵ'].setRotationPoint(-18.5F, -18.0F, 12.5F);
/*      */     
/* 1465 */     this.gunModel['Ķ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1466 */     this.gunModel['Ķ'].setRotationPoint(-18.0F, -16.5F, 12.5F);
/*      */     
/* 1468 */     this.gunModel['ķ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1469 */     this.gunModel['ķ'].setRotationPoint(-17.0F, -18.0F, 14.25F);
/*      */     
/* 1471 */     this.gunModel['ĸ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1472 */     this.gunModel['ĸ'].setRotationPoint(-17.0F, -21.0F, 14.25F);
/*      */     
/* 1474 */     this.gunModel['Ĺ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1475 */     this.gunModel['Ĺ'].setRotationPoint(-17.0F, -19.0F, 14.25F);
/*      */     
/* 1477 */     this.gunModel['ĺ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 1, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1478 */     this.gunModel['ĺ'].setRotationPoint(-17.0F, -23.0F, 14.25F);
/*      */     
/* 1480 */     this.gunModel['Ļ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1481 */     this.gunModel['Ļ'].setRotationPoint(-17.5F, -24.0F, 14.5F);
/*      */     
/* 1483 */     this.gunModel['ļ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1484 */     this.gunModel['ļ'].setRotationPoint(-17.5F, -26.0F, 14.5F);
/*      */     
/* 1486 */     this.gunModel['Ľ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1487 */     this.gunModel['Ľ'].setRotationPoint(-18.5F, -29.0F, 14.5F);
/*      */     
/* 1489 */     this.gunModel['ľ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1490 */     this.gunModel['ľ'].setRotationPoint(-17.5F, -30.0F, 14.5F);
/*      */     
/* 1492 */     this.gunModel['Ŀ'].addBox(44.0F, -20.0F, -6.0F, 154, 11, 17, 0.0F);
/* 1493 */     this.gunModel['Ŀ'].setRotationPoint(21.0F, -34.0F, -2.0F);
/*      */     
/* 1495 */     this.gunModel['ŀ'].addBox(44.0F, -20.0F, -6.0F, 46, 11, 9, 0.0F);
/* 1496 */     this.gunModel['ŀ'].setRotationPoint(-25.0F, -34.0F, 6.0F);
/*      */     
/* 1498 */     this.gunModel['Ł'].addBox(44.0F, -20.0F, -6.0F, 46, 3, 8, 0.0F);
/* 1499 */     this.gunModel['Ł'].setRotationPoint(-25.0F, -26.0F, -2.0F);
/*      */     
/* 1501 */     this.gunModel['ł'].addBox(44.0F, -20.0F, -6.0F, 46, 2, 8, 0.0F);
/* 1502 */     this.gunModel['ł'].setRotationPoint(-25.0F, -34.0F, -2.0F);
/*      */     
/* 1504 */     this.gunModel['Ń'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1505 */     this.gunModel['Ń'].setRotationPoint(-25.0F, -32.0F, -2.0F);
/*      */     
/* 1507 */     this.gunModel['ń'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1508 */     this.gunModel['ń'].setRotationPoint(-25.0F, -27.0F, -2.0F);
/*      */     
/* 1510 */     this.gunModel['Ņ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1511 */     this.gunModel['Ņ'].setRotationPoint(19.0F, -27.0F, -2.0F);
/*      */     
/* 1513 */     this.gunModel['ņ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1514 */     this.gunModel['ņ'].setRotationPoint(19.0F, -32.0F, -2.0F);
/*      */     
/* 1516 */     this.gunModel['Ň'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1517 */     this.gunModel['Ň'].setRotationPoint(20.0F, -32.0F, -2.0F);
/*      */     
/* 1519 */     this.gunModel['ň'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1520 */     this.gunModel['ň'].setRotationPoint(-14.5F, -6.5F, -2.5F);
/*      */     
/* 1522 */     this.gunModel['ŉ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1523 */     this.gunModel['ŉ'].setRotationPoint(-11.5F, -6.5F, -2.5F);
/*      */     
/* 1525 */     this.gunModel['Ŋ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1526 */     this.gunModel['Ŋ'].setRotationPoint(-11.5F, -14.5F, -2.5F);
/*      */     
/* 1528 */     this.gunModel['ŋ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1529 */     this.gunModel['ŋ'].setRotationPoint(-11.5F, -16.5F, -2.5F);
/*      */     
/* 1531 */     this.gunModel['Ō'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1532 */     this.gunModel['Ō'].setRotationPoint(-14.5F, -16.5F, -2.5F);
/*      */     
/* 1534 */     this.gunModel['ō'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1535 */     this.gunModel['ō'].setRotationPoint(-19.5F, -16.5F, -1.0F);
/*      */     
/* 1537 */     this.gunModel['Ŏ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1538 */     this.gunModel['Ŏ'].setRotationPoint(-25.5F, -16.5F, -1.0F);
/*      */     
/* 1540 */     this.gunModel['ŏ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1541 */     this.gunModel['ŏ'].setRotationPoint(-25.5F, -14.5F, -1.0F);
/*      */     
/* 1543 */     this.gunModel['Ő'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1544 */     this.gunModel['Ő'].setRotationPoint(-25.5F, -11.5F, -1.0F);
/*      */     
/* 1546 */     this.gunModel['ő'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1547 */     this.gunModel['ő'].setRotationPoint(-18.5F, -11.5F, -1.5F);
/*      */     
/* 1549 */     this.gunModel['Œ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1550 */     this.gunModel['Œ'].setRotationPoint(-18.5F, -13.5F, -1.5F);
/*      */     
/* 1552 */     this.gunModel['œ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1553 */     this.gunModel['œ'].setRotationPoint(-18.5F, -9.5F, -1.5F);
/*      */     
/* 1555 */     this.gunModel['Ŕ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1556 */     this.gunModel['Ŕ'].setRotationPoint(-24.0F, -14.5F, -1.5F);
/*      */     
/* 1558 */     this.gunModel['ŕ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1559 */     this.gunModel['ŕ'].setRotationPoint(-24.0F, -12.5F, -1.5F);
/*      */     
/* 1561 */     this.gunModel['Ŗ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1562 */     this.gunModel['Ŗ'].setRotationPoint(-24.0F, -13.5F, -1.5F);
/*      */     
/* 1564 */     this.gunModel['ŗ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1565 */     this.gunModel['ŗ'].setRotationPoint(-69.0F, -31.0F, -2.5F);
/*      */     
/* 1567 */     this.gunModel['Ř'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1568 */     this.gunModel['Ř'].setRotationPoint(-69.0F, -29.0F, -2.5F);
/*      */     
/* 1570 */     this.gunModel['ř'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1571 */     this.gunModel['ř'].setRotationPoint(-69.0F, -30.0F, -2.5F);
/*      */     
/* 1573 */     this.gunModel['Ś'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1574 */     this.gunModel['Ś'].setRotationPoint(-74.5F, -31.0F, -2.5F);
/*      */     
/* 1576 */     this.gunModel['ś'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1577 */     this.gunModel['ś'].setRotationPoint(-74.5F, -29.0F, -2.5F);
/*      */     
/* 1579 */     this.gunModel['Ŝ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1580 */     this.gunModel['Ŝ'].setRotationPoint(-74.5F, -30.0F, -2.5F);
/*      */     
/* 1582 */     this.gunModel['ŝ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1583 */     this.gunModel['ŝ'].setRotationPoint(-30.0F, -31.0F, -2.5F);
/*      */     
/* 1585 */     this.gunModel['Ş'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1586 */     this.gunModel['Ş'].setRotationPoint(-30.0F, -29.0F, -2.5F);
/*      */     
/* 1588 */     this.gunModel['ş'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1589 */     this.gunModel['ş'].setRotationPoint(-30.0F, -30.0F, -2.5F);
/*      */     
/* 1591 */     this.gunModel['Š'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1592 */     this.gunModel['Š'].setRotationPoint(-35.5F, -31.0F, -2.5F);
/*      */     
/* 1594 */     this.gunModel['š'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1595 */     this.gunModel['š'].setRotationPoint(-35.5F, -29.0F, -2.5F);
/*      */     
/* 1597 */     this.gunModel['Ţ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1598 */     this.gunModel['Ţ'].setRotationPoint(-35.5F, -30.0F, -2.5F);
/*      */     
/* 1600 */     this.gunModel['ţ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1601 */     this.gunModel['ţ'].setRotationPoint(-27.0F, -31.0F, -4.0F);
/*      */     
/* 1603 */     this.gunModel['Ť'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1604 */     this.gunModel['Ť'].setRotationPoint(-27.0F, -33.0F, -4.0F);
/*      */     
/* 1606 */     this.gunModel['ť'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1607 */     this.gunModel['ť'].setRotationPoint(-27.0F, -34.0F, -3.0F);
/*      */     
/* 1609 */     this.gunModel['Ŧ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1610 */     this.gunModel['Ŧ'].setRotationPoint(-27.0F, -27.0F, -3.0F);
/*      */     
/* 1612 */     this.gunModel['ŧ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1613 */     this.gunModel['ŧ'].setRotationPoint(43.0F, -30.5F, 15.0F);
/*      */     
/* 1615 */     this.gunModel['Ũ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1616 */     this.gunModel['Ũ'].setRotationPoint(43.0F, -28.5F, 15.0F);
/*      */     
/* 1618 */     this.gunModel['ũ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1619 */     this.gunModel['ũ'].setRotationPoint(43.0F, -29.5F, 15.0F);
/*      */     
/* 1621 */     this.gunModel['Ū'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1622 */     this.gunModel['Ū'].setRotationPoint(43.0F, -30.5F, -4.0F);
/*      */     
/* 1624 */     this.gunModel['ū'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1625 */     this.gunModel['ū'].setRotationPoint(43.0F, -28.5F, -4.0F);
/*      */     
/* 1627 */     this.gunModel['Ŭ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1628 */     this.gunModel['Ŭ'].setRotationPoint(43.0F, -29.5F, -4.0F);
/*      */     
/* 1630 */     this.gunModel['ŭ'].addShapeBox(44.0F, -20.0F, -6.0F, 18, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1631 */     this.gunModel['ŭ'].setRotationPoint(156.0F, -37.0F, -2.0F);
/*      */     
/* 1633 */     this.gunModel['Ů'].addShapeBox(44.0F, -20.0F, -6.0F, 18, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1634 */     this.gunModel['Ů'].setRotationPoint(156.0F, -39.0F, -1.0F);
/*      */     
/* 1636 */     this.gunModel['ů'].addShapeBox(44.0F, -20.0F, -6.0F, 18, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1637 */     this.gunModel['ů'].setRotationPoint(156.0F, -47.0F, 1.5F);
/*      */     
/* 1639 */     this.gunModel['Ű'].addShapeBox(44.0F, -20.0F, -6.0F, 18, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1640 */     this.gunModel['Ű'].setRotationPoint(156.0F, -39.5F, 1.5F);
/*      */     
/* 1642 */     this.gunModel['ű'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 17, 0.0F, 0.0F, 0.0F, -0.85F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1643 */     this.gunModel['ű'].setRotationPoint(118.0F, -36.0F, -2.0F);
/*      */     
/* 1645 */     this.gunModel['Ų'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 17, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1646 */     this.gunModel['Ų'].setRotationPoint(155.0F, -36.0F, -2.0F);
/*      */     
/* 1648 */     this.gunModel['ų'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1649 */     this.gunModel['ų'].setRotationPoint(155.0F, -47.0F, 1.5F);
/*      */     
/* 1651 */     this.gunModel['Ŵ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1652 */     this.gunModel['Ŵ'].setRotationPoint(118.0F, -47.0F, 1.5F);
/*      */     
/* 1654 */     this.gunModel['ŵ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1655 */     this.gunModel['ŵ'].setRotationPoint(116.0F, -43.0F, 2.0F);
/*      */     
/* 1657 */     this.gunModel['Ŷ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1658 */     this.gunModel['Ŷ'].setRotationPoint(116.0F, -40.0F, 2.0F);
/*      */     
/* 1660 */     this.gunModel['ŷ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 2, 9, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F);
/* 1661 */     this.gunModel['ŷ'].setRotationPoint(116.0F, -36.0F, 2.0F);
/*      */     
/* 1663 */     this.gunModel['Ÿ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1664 */     this.gunModel['Ÿ'].setRotationPoint(122.0F, -39.5F, 1.0F);
/*      */     
/* 1666 */     this.gunModel['Ź'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1667 */     this.gunModel['Ź'].setRotationPoint(122.0F, -37.5F, 1.0F);
/*      */     
/* 1669 */     this.gunModel['ź'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1670 */     this.gunModel['ź'].setRotationPoint(122.0F, -38.5F, 1.0F);
/*      */     
/* 1672 */     this.gunModel['Ż'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1673 */     this.gunModel['Ż'].setRotationPoint(116.0F, -37.0F, 2.0F);
/*      */     
/* 1675 */     this.gunModel['ż'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1676 */     this.gunModel['ż'].setRotationPoint(-86.75F, -48.5F, 0.5F);
/*      */     
/* 1678 */     this.gunModel['Ž'].addShapeBox(44.0F, -20.0F, -6.0F, 31, 4, 15, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1679 */     this.gunModel['Ž'].setRotationPoint(-119.5F, -12.5F, -1.0F);
/*      */     
/* 1681 */     this.gunModel['ž'].addShapeBox(44.0F, -20.0F, -6.0F, 16, 4, 15, 0.0F, 0.0F, -14.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -14.0F, 1.5F, 0.0F, 14.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 14.0F, -2.0F);
/* 1682 */     this.gunModel['ž'].setRotationPoint(-135.5F, -12.5F, -1.0F);
/*      */     
/* 1684 */     this.gunModel['ſ'].addShapeBox(44.0F, -20.0F, -6.0F, 15, 22, 17, 0.0F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1685 */     this.gunModel['ſ'].setRotationPoint(-102.5F, -37.5F, -2.0F);
/*      */     
/* 1687 */     this.gunModel['ƀ'].addShapeBox(44.0F, -20.0F, -6.0F, 14, 3, 17, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1688 */     this.gunModel['ƀ'].setRotationPoint(-102.5F, -15.5F, -2.0F);
/*      */     
/* 1690 */     this.gunModel['Ɓ'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 3, 17, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1691 */     this.gunModel['Ɓ'].setRotationPoint(-94.5F, -40.5F, -2.0F);
/*      */     
/* 1693 */     this.gunModel['Ƃ'].addShapeBox(44.0F, -20.0F, -6.0F, 8, 3, 17, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1694 */     this.gunModel['Ƃ'].setRotationPoint(-95.5F, -43.5F, -2.0F);
/*      */     
/* 1696 */     this.gunModel['ƃ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 2, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1697 */     this.gunModel['ƃ'].setRotationPoint(-100.5F, -47.5F, -2.0F);
/*      */     
/* 1699 */     this.gunModel['Ƅ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 2, 17, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1700 */     this.gunModel['Ƅ'].setRotationPoint(-100.5F, -45.5F, -2.0F);
/*      */     
/* 1702 */     this.gunModel['ƅ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 1, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1703 */     this.gunModel['ƅ'].setRotationPoint(-100.5F, -48.5F, -1.0F);
/*      */     
/* 1705 */     this.gunModel['Ɔ'].addShapeBox(44.0F, -20.0F, -6.0F, 26, 2, 17, 0.0F, 0.0F, -22.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -22.0F, 0.5F, 0.0F, 22.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 22.0F, 0.5F);
/* 1706 */     this.gunModel['Ɔ'].setRotationPoint(-126.5F, -45.5F, -2.0F);
/*      */     
/* 1708 */     this.gunModel['Ƈ'].addShapeBox(44.0F, -20.0F, -6.0F, 26, 2, 17, 0.0F, 0.0F, -22.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -22.0F, -1.0F, 0.0F, 22.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 22.0F, 0.5F);
/* 1709 */     this.gunModel['Ƈ'].setRotationPoint(-126.5F, -47.5F, -2.0F);
/*      */     
/* 1711 */     this.gunModel['ƈ'].addShapeBox(44.0F, -20.0F, -6.0F, 26, 1, 13, 0.0F, 0.0F, -22.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -22.0F, -1.0F, 0.0F, 22.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 22.0F, 1.0F);
/* 1712 */     this.gunModel['ƈ'].setRotationPoint(-126.5F, -48.5F, 0.0F);
/*      */     
/* 1714 */     this.gunModel['Ɖ'].addShapeBox(44.0F, -20.0F, -6.0F, 22, 2, 15, 0.0F, 0.0F, -19.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -19.0F, 0.5F, 0.0F, 19.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 19.0F, 0.5F);
/* 1715 */     this.gunModel['Ɖ'].setRotationPoint(-126.5F, -47.5F, -1.0F);
/*      */     
/* 1717 */     this.gunModel['Ɗ'].addShapeBox(44.0F, -20.0F, -6.0F, 87, 2, 15, 0.0F, -0.5F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1718 */     this.gunModel['Ɗ'].setRotationPoint(-189.5F, -49.5F, -1.0F);
/*      */     
/* 1720 */     this.gunModel['Ƌ'].addShapeBox(44.0F, -20.0F, -6.0F, 87, 2, 13, 0.0F, -1.5F, 0.0F, -2.0F, 6.0F, 0.0F, -2.0F, 6.0F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1721 */     this.gunModel['Ƌ'].setRotationPoint(-189.5F, -51.5F, 0.0F);
/*      */     
/* 1723 */     this.gunModel['ƌ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 15, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, -2.0F, 0.5F, 0.5F, -2.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1724 */     this.gunModel['ƌ'].setRotationPoint(-104.5F, -47.5F, -1.0F);
/*      */     
/* 1726 */     this.gunModel['ƍ'].addShapeBox(44.0F, -20.0F, -6.0F, 85, 19, 15, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -22.0F, 0.0F, 0.5F, -22.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1727 */     this.gunModel['ƍ'].setRotationPoint(-189.5F, -47.5F, -1.0F);
/*      */     
/* 1729 */     this.gunModel['Ǝ'].addShapeBox(44.0F, -20.0F, -6.0F, 10, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 8.0F, 0.0F);
/* 1730 */     this.gunModel['Ǝ'].setRotationPoint(-136.5F, -23.5F, -2.5F);
/*      */     
/* 1732 */     this.gunModel['Ə'].addShapeBox(44.0F, -20.0F, -6.0F, 18, 2, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1733 */     this.gunModel['Ə'].setRotationPoint(-144.5F, -25.5F, -2.0F);
/*      */     
/* 1735 */     this.gunModel['Ɛ'].addShapeBox(44.0F, -20.0F, -6.0F, 18, 1, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1736 */     this.gunModel['Ɛ'].setRotationPoint(-144.5F, -26.5F, -1.0F);
/*      */     
/* 1738 */     this.gunModel['Ƒ'].addShapeBox(44.0F, -20.0F, -6.0F, 63, 2, 15, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1739 */     this.gunModel['Ƒ'].setRotationPoint(-189.5F, -28.5F, -1.0F);
/*      */     
/* 1741 */     this.gunModel['ƒ'].addShapeBox(44.0F, -20.0F, -6.0F, 8, 32, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1742 */     this.gunModel['ƒ'].setRotationPoint(-144.5F, -23.5F, -2.5F);
/*      */     
/* 1744 */     this.gunModel['Ɠ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 7, 18, 0.0F, 0.0F, 1.0F, 0.0F, -0.4F, -4.0F, 0.0F, -0.4F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1745 */     this.gunModel['Ɠ'].setRotationPoint(-136.5F, -6.5F, -2.5F);
/*      */     
/* 1747 */     this.gunModel['Ɣ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 32, 20, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1748 */     this.gunModel['Ɣ'].setRotationPoint(-150.5F, -23.5F, -3.5F);
/*      */     
/* 1750 */     this.gunModel['ƕ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 19, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 4.0F, 0.5F);
/* 1751 */     this.gunModel['ƕ'].setRotationPoint(-150.5F, -25.5F, -3.0F);
/*      */     
/* 1753 */     this.gunModel['Ɩ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 1, 17, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 1754 */     this.gunModel['Ɩ'].setRotationPoint(-150.5F, -26.5F, -2.0F);
/*      */     
/* 1756 */     this.gunModel['Ɨ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 28, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1757 */     this.gunModel['Ɨ'].setRotationPoint(-163.5F, -19.5F, -3.5F);
/*      */     
/* 1759 */     this.gunModel['Ƙ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 2, 19, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1760 */     this.gunModel['Ƙ'].setRotationPoint(-163.5F, -21.5F, -3.0F);
/*      */     
/* 1762 */     this.gunModel['ƙ'].addShapeBox(44.0F, -20.0F, -6.0F, 13, 1, 17, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1763 */     this.gunModel['ƙ'].setRotationPoint(-163.5F, -22.5F, -2.0F);
/*      */     
/* 1765 */     this.gunModel['ƚ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 32, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1766 */     this.gunModel['ƚ'].setRotationPoint(-167.5F, -23.5F, -3.5F);
/*      */     
/* 1768 */     this.gunModel['ƛ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 19, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 4.0F, 0.5F, 0.0F, 4.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1769 */     this.gunModel['ƛ'].setRotationPoint(-167.5F, -25.5F, -3.0F);
/*      */     
/* 1771 */     this.gunModel['Ɯ'].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 17, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1772 */     this.gunModel['Ɯ'].setRotationPoint(-167.5F, -26.5F, -2.0F);
/*      */     
/* 1774 */     this.gunModel['Ɲ'].addShapeBox(44.0F, -20.0F, -6.0F, 22, 2, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1775 */     this.gunModel['Ɲ'].setRotationPoint(-189.5F, -25.5F, -2.0F);
/*      */     
/* 1777 */     this.gunModel['ƞ'].addShapeBox(44.0F, -20.0F, -6.0F, 22, 1, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1778 */     this.gunModel['ƞ'].setRotationPoint(-189.5F, -26.5F, -1.0F);
/*      */     
/* 1780 */     this.gunModel['Ɵ'].addShapeBox(44.0F, -20.0F, -6.0F, 9, 32, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1781 */     this.gunModel['Ɵ'].setRotationPoint(-176.5F, -23.5F, -2.5F);
/*      */     
/* 1783 */     this.gunModel['Ơ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 32, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1784 */     this.gunModel['Ơ'].setRotationPoint(-189.5F, -23.5F, -2.5F);
/*      */     
/* 1786 */     this.gunModel['ơ'].addShapeBox(44.0F, -20.0F, -6.0F, 23, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1787 */     this.gunModel['ơ'].setRotationPoint(-167.5F, -26.5F, 1.5F);
/*      */     
/* 1789 */     this.gunModel['Ƣ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1790 */     this.gunModel['Ƣ'].setRotationPoint(-136.5F, 0.5F, -2.5F);
/*      */     
/* 1792 */     this.gunModel['ƣ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F);
/* 1793 */     this.gunModel['ƣ'].setRotationPoint(-136.5F, 1.5F, -2.5F);
/*      */     
/* 1795 */     this.gunModel['Ƥ'].addShapeBox(44.0F, -20.0F, -6.0F, 33, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1796 */     this.gunModel['Ƥ'].setRotationPoint(-132.5F, -22.5F, -1.0F);
/*      */     
/* 1798 */     this.gunModel['ƥ'].addShapeBox(44.0F, -20.0F, -6.0F, 33, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1799 */     this.gunModel['ƥ'].setRotationPoint(-132.5F, -19.5F, -1.0F);
/*      */     
/* 1801 */     this.gunModel['Ʀ'].addShapeBox(44.0F, -20.0F, -6.0F, 33, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1802 */     this.gunModel['Ʀ'].setRotationPoint(-132.5F, -21.5F, 0.0F);
/*      */     
/* 1804 */     this.gunModel['Ƨ'].addShapeBox(44.0F, -20.0F, -6.0F, 33, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1805 */     this.gunModel['Ƨ'].setRotationPoint(-132.5F, -18.5F, -1.0F);
/*      */     
/* 1807 */     this.gunModel['ƨ'].addShapeBox(44.0F, -20.0F, -6.0F, 33, 1, 15, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1808 */     this.gunModel['ƨ'].setRotationPoint(-132.5F, -23.5F, -1.0F);
/*      */     
/* 1810 */     this.gunModel['Ʃ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 9, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F);
/* 1811 */     this.gunModel['Ʃ'].setRotationPoint(-122.5F, -18.5F, -1.0F);
/*      */     
/* 1813 */     this.gunModel['ƪ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1F, 0.5F, 0.0F, 1.1F, 0.5F, 0.0F, 1.1F, 0.5F, 0.0F, -1.1F, 0.5F, 0.0F);
/* 1814 */     this.gunModel['ƪ'].setRotationPoint(-124.5F, -18.5F, 0.0F);
/*      */     
/* 1816 */     this.gunModel['ƫ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 10, 15, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.2F, 0.15F, -1.0F, 1.2F, 0.0F, 0.0F, 1.2F, 0.0F, 0.0F, -1.2F, 0.25F, -1.0F);
/* 1817 */     this.gunModel['ƫ'].setRotationPoint(-125.5F, -18.5F, -1.0F);
/*      */     
/* 1819 */     this.gunModel['Ƭ'].addShapeBox(44.0F, -20.0F, -6.0F, 9, 15, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1820 */     this.gunModel['Ƭ'].setRotationPoint(-136.5F, -17.5F, 2.0F);
/*      */     
/* 1822 */     this.gunModel['ƭ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 15, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -5.0F, 0.0F, 1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1823 */     this.gunModel['ƭ'].setRotationPoint(-127.5F, -17.5F, 2.0F);
/*      */     
/* 1825 */     this.gunModel['Ʈ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 17, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1826 */     this.gunModel['Ʈ'].setRotationPoint(-104.5F, -15.5F, -2.0F);
/*      */     
/* 1828 */     this.gunModel['Ư'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1829 */     this.gunModel['Ư'].setRotationPoint(-183.5F, -23.5F, -2.5F);
/*      */     
/* 1831 */     this.gunModel['ư'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1832 */     this.gunModel['ư'].setRotationPoint(-178.5F, -20.5F, -2.5F);
/*      */     
/* 1834 */     this.gunModel['Ʊ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 2, 21, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1835 */     this.gunModel['Ʊ'].setRotationPoint(-183.5F, 9.5F, -4.0F);
/*      */     
/* 1837 */     this.gunModel['Ʋ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F);
/* 1838 */     this.gunModel['Ʋ'].setRotationPoint(-136.5F, 5.5F, -2.5F);
/*      */     
/* 1840 */     this.gunModel['Ƴ'].addShapeBox(44.0F, -20.0F, -6.0F, 54, 6, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1841 */     this.gunModel['Ƴ'].setRotationPoint(-189.5F, 8.5F, -1.0F);
/*      */     
/* 1843 */     this.gunModel['ƴ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 6, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1844 */     this.gunModel['ƴ'].setRotationPoint(-135.5F, 8.5F, -1.0F);
/*      */     
/* 1846 */     this.gunModel['Ƶ'].addShapeBox(44.0F, -20.0F, -6.0F, 54, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1847 */     this.gunModel['Ƶ'].setRotationPoint(-189.5F, 14.5F, -1.5F);
/*      */     
/* 1849 */     this.gunModel['ƶ'].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1850 */     this.gunModel['ƶ'].setRotationPoint(-183.5F, -20.5F, -2.5F);
/*      */     
/* 1852 */     this.gunModel['Ʒ'].addShapeBox(44.0F, -20.0F, -6.0F, 7, 28, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1853 */     this.gunModel['Ʒ'].setRotationPoint(-183.5F, -18.5F, -4.0F);
/*      */     
/* 1855 */     this.gunModel['Ƹ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 2, 21, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1856 */     this.gunModel['Ƹ'].setRotationPoint(-183.5F, -20.5F, -4.0F);
/*      */     
/* 1858 */     this.gunModel['ƹ'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1859 */     this.gunModel['ƹ'].setRotationPoint(-209.5F, -15.5F, 3.5F);
/*      */     
/* 1861 */     this.gunModel['ƺ'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1862 */     this.gunModel['ƺ'].setRotationPoint(-209.5F, -17.5F, 3.5F);
/*      */     
/* 1864 */     this.gunModel['ƻ'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1865 */     this.gunModel['ƻ'].setRotationPoint(-209.5F, -19.5F, 3.5F);
/*      */     
/* 1867 */     this.gunModel['Ƽ'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1868 */     this.gunModel['Ƽ'].setRotationPoint(-209.5F, 9.5F, 3.5F);
/*      */     
/* 1870 */     this.gunModel['ƽ'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1871 */     this.gunModel['ƽ'].setRotationPoint(-209.5F, 7.5F, 3.5F);
/*      */     
/* 1873 */     this.gunModel['ƾ'].addShapeBox(44.0F, -20.0F, -6.0F, 20, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1874 */     this.gunModel['ƾ'].setRotationPoint(-209.5F, 5.5F, 3.5F);
/*      */     
/* 1876 */     this.gunModel['ƿ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 67, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1877 */     this.gunModel['ƿ'].setRotationPoint(-217.5F, -37.5F, -2.5F);
/*      */     
/* 1879 */     this.gunModel['ǀ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 67, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1880 */     this.gunModel['ǀ'].setRotationPoint(-212.5F, -37.5F, -2.5F);
/*      */     
/* 1882 */     this.gunModel['ǁ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1883 */     this.gunModel['ǁ'].setRotationPoint(-217.5F, 29.5F, -2.5F);
/*      */     
/* 1885 */     this.gunModel['ǂ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1886 */     this.gunModel['ǂ'].setRotationPoint(-212.5F, 29.5F, -2.5F);
/*      */     
/* 1888 */     this.gunModel['ǃ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 4, 18, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1889 */     this.gunModel['ǃ'].setRotationPoint(-217.5F, -41.5F, -2.5F);
/*      */     
/* 1891 */     this.gunModel['Ǆ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 4, 18, 0.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1892 */     this.gunModel['Ǆ'].setRotationPoint(-212.5F, -41.5F, -2.5F);
/*      */     
/* 1894 */     this.gunModel['ǅ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1895 */     this.gunModel['ǅ'].setRotationPoint(-131.0F, -30.5F, -2.0F);
/*      */     
/* 1897 */     this.gunModel['ǆ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1898 */     this.gunModel['ǆ'].setRotationPoint(-131.0F, -28.5F, -2.0F);
/*      */     
/* 1900 */     this.gunModel['Ǉ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1901 */     this.gunModel['Ǉ'].setRotationPoint(-131.0F, -29.5F, -2.0F);
/*      */     
/* 1903 */     this.gunModel['ǈ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1904 */     this.gunModel['ǈ'].setRotationPoint(-186.0F, -30.5F, -2.0F);
/*      */     
/* 1906 */     this.gunModel['ǉ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1907 */     this.gunModel['ǉ'].setRotationPoint(-186.0F, -28.5F, -2.0F);
/*      */     
/* 1909 */     this.gunModel['Ǌ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1910 */     this.gunModel['Ǌ'].setRotationPoint(-186.0F, -29.5F, -2.0F);
/*      */     
/* 1912 */     this.gunModel['ǋ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 67, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1913 */     this.gunModel['ǋ'].setRotationPoint(-222.5F, -37.5F, -3.5F);
/*      */     
/* 1915 */     this.gunModel['ǌ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 4, 20, 0.0F, 3.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1916 */     this.gunModel['ǌ'].setRotationPoint(-222.5F, -41.5F, -3.5F);
/*      */     
/* 1918 */     this.gunModel['Ǎ'].addShapeBox(44.0F, -20.0F, -6.0F, 5, 3, 20, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F);
/* 1919 */     this.gunModel['Ǎ'].setRotationPoint(-222.5F, 29.5F, -3.5F);
/*      */     
/* 1921 */     this.gunModel['ǎ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 34, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1922 */     this.gunModel['ǎ'].setRotationPoint(-223.5F, -4.5F, -3.5F);
/*      */     
/* 1924 */     this.gunModel['Ǐ'].addShapeBox(44.0F, -20.0F, -6.0F, 1, 35, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1925 */     this.gunModel['Ǐ'].setRotationPoint(-223.5F, -37.5F, -3.5F);
/*      */     
/* 1927 */     this.gunModel['ǐ'].addShapeBox(44.0F, -20.0F, -6.0F, 26, 2, 11, 0.0F, 0.0F, -22.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -22.0F, 0.5F, 0.0F, 22.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 22.0F, 0.5F);
/* 1928 */     this.gunModel['ǐ'].setRotationPoint(-126.5F, -43.5F, 1.0F);
/*      */     
/* 1930 */     this.gunModel['Ǒ'].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1931 */     this.gunModel['Ǒ'].setRotationPoint(-100.5F, -43.5F, 1.0F);
/*      */     
/* 1933 */     this.gunModel['ǒ'].addShapeBox(44.0F, -20.0F, -6.0F, 10, 22, 11, 0.0F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -8.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1934 */     this.gunModel['ǒ'].setRotationPoint(-104.5F, -37.5F, 1.0F);
/*      */     
/* 1936 */     this.gunModel['Ǔ'].addShapeBox(44.0F, -20.0F, -6.0F, 8, 3, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1937 */     this.gunModel['Ǔ'].setRotationPoint(-96.5F, -40.5F, 1.0F);
/*      */     
/* 1939 */     this.gunModel['ǔ'].addShapeBox(44.0F, -20.0F, -6.0F, 8, 3, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1940 */     this.gunModel['ǔ'].setRotationPoint(-97.5F, -43.5F, 1.0F);
/*      */     
/* 1942 */     this.gunModel['Ǖ'].addShapeBox(44.0F, -20.0F, -6.0F, 8, 3, 11, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1943 */     this.gunModel['Ǖ'].setRotationPoint(-106.5F, -15.5F, 1.0F);
/*      */     
/* 1945 */     this.gunModel['ǖ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1946 */     this.gunModel['ǖ'].setRotationPoint(-141.0F, 3.5F, -3.0F);
/*      */     
/* 1948 */     this.gunModel['Ǘ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1949 */     this.gunModel['Ǘ'].setRotationPoint(-141.0F, 5.5F, -3.0F);
/*      */     
/* 1951 */     this.gunModel['ǘ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1952 */     this.gunModel['ǘ'].setRotationPoint(-141.0F, 4.5F, -3.0F);
/*      */     
/* 1954 */     this.gunModel['Ǚ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1955 */     this.gunModel['Ǚ'].setRotationPoint(-188.0F, 3.5F, -3.0F);
/*      */     
/* 1957 */     this.gunModel['ǚ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1958 */     this.gunModel['ǚ'].setRotationPoint(-188.0F, 5.5F, -3.0F);
/*      */     
/* 1960 */     this.gunModel['Ǜ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1961 */     this.gunModel['Ǜ'].setRotationPoint(-188.0F, 4.5F, -3.0F);
/*      */     
/* 1963 */     this.gunModel['ǜ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 21, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1964 */     this.gunModel['ǜ'].setRotationPoint(-166.0F, 3.5F, -4.0F);
/*      */     
/* 1966 */     this.gunModel['ǝ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1967 */     this.gunModel['ǝ'].setRotationPoint(-166.0F, 5.5F, -4.0F);
/*      */     
/* 1969 */     this.gunModel['Ǟ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1970 */     this.gunModel['Ǟ'].setRotationPoint(-166.0F, 4.5F, -4.0F);
/*      */     
/* 1972 */     this.gunModel['ǟ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 21, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1973 */     this.gunModel['ǟ'].setRotationPoint(-149.0F, 3.5F, -4.0F);
/*      */     
/* 1975 */     this.gunModel['Ǡ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1976 */     this.gunModel['Ǡ'].setRotationPoint(-149.0F, 5.5F, -4.0F);
/*      */     
/* 1978 */     this.gunModel['ǡ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1979 */     this.gunModel['ǡ'].setRotationPoint(-149.0F, 4.5F, -4.0F);
/*      */     
/* 1981 */     this.gunModel['Ǣ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1982 */     this.gunModel['Ǣ'].setRotationPoint(-92.0F, -19.5F, -3.0F);
/*      */     
/* 1984 */     this.gunModel['ǣ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1985 */     this.gunModel['ǣ'].setRotationPoint(-92.0F, -17.5F, -3.0F);
/*      */     
/* 1987 */     this.gunModel['Ǥ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1988 */     this.gunModel['Ǥ'].setRotationPoint(-92.0F, -18.5F, -3.0F);
/*      */     
/* 1990 */     this.gunModel['ǥ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1991 */     this.gunModel['ǥ'].setRotationPoint(-92.0F, -42.5F, -3.0F);
/*      */     
/* 1993 */     this.gunModel['Ǧ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1994 */     this.gunModel['Ǧ'].setRotationPoint(-92.0F, -40.5F, -3.0F);
/*      */     
/* 1996 */     this.gunModel['ǧ'].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1997 */     this.gunModel['ǧ'].setRotationPoint(-92.0F, -41.5F, -3.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2002 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 473, 137, this.textureX, this.textureY);
/* 2003 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/* 2004 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 521, 137, this.textureX, this.textureY);
/* 2005 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 545, 137, this.textureX, this.textureY);
/* 2006 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 569, 137, this.textureX, this.textureY);
/* 2007 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 2008 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 321, 137, this.textureX, this.textureY);
/* 2009 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 25, 153, this.textureX, this.textureY);
/* 2010 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 49, 153, this.textureX, this.textureY);
/* 2011 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 297, 105, this.textureX, this.textureY);
/* 2012 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 929, 105, this.textureX, this.textureY);
/* 2013 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 73, 153, this.textureX, this.textureY);
/* 2014 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 97, 153, this.textureX, this.textureY);
/* 2015 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 121, 153, this.textureX, this.textureY);
/* 2016 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 169, 153, this.textureX, this.textureY);
/* 2017 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 193, 153, this.textureX, this.textureY);
/* 2018 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 585, 113, this.textureX, this.textureY);
/* 2019 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/* 2020 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 217, 153, this.textureX, this.textureY);
/* 2021 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 241, 153, this.textureX, this.textureY);
/* 2022 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 265, 153, this.textureX, this.textureY);
/* 2023 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/* 2024 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 313, 153, this.textureX, this.textureY);
/* 2025 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/* 2026 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 361, 153, this.textureX, this.textureY);
/* 2027 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 385, 153, this.textureX, this.textureY);
/* 2028 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 857, 225, this.textureX, this.textureY);
/* 2029 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 913, 177, this.textureX, this.textureY);
/* 2030 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 889, 105, this.textureX, this.textureY);
/* 2031 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 641, 241, this.textureX, this.textureY);
/* 2032 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 41, 201, this.textureX, this.textureY);
/* 2033 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 689, 201, this.textureX, this.textureY);
/* 2034 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 153, 201, this.textureX, this.textureY);
/* 2035 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/* 2036 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 673, 241, this.textureX, this.textureY);
/* 2037 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 697, 241, this.textureX, this.textureY);
/* 2038 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/* 2039 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/* 2040 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/* 2041 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 913, 113, this.textureX, this.textureY);
/* 2042 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 977, 121, this.textureX, this.textureY);
/* 2043 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/* 2044 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 1017, 129, this.textureX, this.textureY);
/* 2045 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 2046 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 1017, 137, this.textureX, this.textureY);
/* 2047 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 953, 177, this.textureX, this.textureY);
/* 2048 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/* 2049 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 113, 201, this.textureX, this.textureY);
/* 2050 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 409, 153, this.textureX, this.textureY);
/* 2051 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 945, 105, this.textureX, this.textureY);
/* 2052 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 961, 105, this.textureX, this.textureY);
/* 2053 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 969, 105, this.textureX, this.textureY);
/* 2054 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/* 2055 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 425, 153, this.textureX, this.textureY);
/* 2056 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 993, 145, this.textureX, this.textureY);
/* 2057 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 417, 153, this.textureX, this.textureY);
/* 2058 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 441, 153, this.textureX, this.textureY);
/* 2059 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 457, 153, this.textureX, this.textureY);
/* 2060 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 473, 153, this.textureX, this.textureY);
/* 2061 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/* 2062 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 601, 33, this.textureX, this.textureY);
/* 2063 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 521, 161, this.textureX, this.textureY);
/* 2064 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 529, 161, this.textureX, this.textureY);
/* 2065 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/* 2066 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/* 2067 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 689, 161, this.textureX, this.textureY);
/* 2068 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 585, 41, this.textureX, this.textureY);
/* 2069 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 977, 81, this.textureX, this.textureY);
/* 2070 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/* 2071 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/* 2072 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 569, 209, this.textureX, this.textureY);
/* 2073 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 625, 209, this.textureX, this.textureY);
/* 2074 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 761, 225, this.textureX, this.textureY);
/* 2075 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 257, 233, this.textureX, this.textureY);
/* 2076 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 289, 233, this.textureX, this.textureY);
/* 2077 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 321, 233, this.textureX, this.textureY);
/* 2078 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 977, 217, this.textureX, this.textureY);
/* 2079 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 353, 233, this.textureX, this.textureY);
/* 2080 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 481, 233, this.textureX, this.textureY);
/* 2081 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 1001, 169, this.textureX, this.textureY);
/* 2082 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 537, 177, this.textureX, this.textureY);
/* 2083 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 825, 233, this.textureX, this.textureY);
/* 2084 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 337, 249, this.textureX, this.textureY);
/* 2085 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 257, 241, this.textureX, this.textureY);
/* 2086 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 289, 241, this.textureX, this.textureY);
/* 2087 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 321, 241, this.textureX, this.textureY);
/* 2088 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 577, 177, this.textureX, this.textureY);
/* 2089 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 617, 177, this.textureX, this.textureY);
/* 2090 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 65, 257, this.textureX, this.textureY);
/* 2091 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 89, 257, this.textureX, this.textureY);
/* 2092 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 193, 265, this.textureX, this.textureY);
/* 2093 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 729, 273, this.textureX, this.textureY);
/* 2094 */     this.defaultScopeModel[92] = new ModelRendererTurbo(this, 793, 273, this.textureX, this.textureY);
/* 2095 */     this.defaultScopeModel[93] = new ModelRendererTurbo(this, 49, 281, this.textureX, this.textureY);
/* 2096 */     this.defaultScopeModel[94] = new ModelRendererTurbo(this, 89, 281, this.textureX, this.textureY);
/* 2097 */     this.defaultScopeModel[95] = new ModelRendererTurbo(this, 537, 281, this.textureX, this.textureY);
/* 2098 */     this.defaultScopeModel[96] = new ModelRendererTurbo(this, 873, 257, this.textureX, this.textureY);
/* 2099 */     this.defaultScopeModel[97] = new ModelRendererTurbo(this, 1009, 201, this.textureX, this.textureY);
/* 2100 */     this.defaultScopeModel[98] = new ModelRendererTurbo(this, 49, 297, this.textureX, this.textureY);
/* 2101 */     this.defaultScopeModel[99] = new ModelRendererTurbo(this, 921, 305, this.textureX, this.textureY);
/* 2102 */     this.defaultScopeModel[100] = new ModelRendererTurbo(this, 385, 345, this.textureX, this.textureY);
/* 2103 */     this.defaultScopeModel[101] = new ModelRendererTurbo(this, 1001, 281, this.textureX, this.textureY);
/* 2104 */     this.defaultScopeModel[102] = new ModelRendererTurbo(this, 657, 177, this.textureX, this.textureY);
/* 2105 */     this.defaultScopeModel[103] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/* 2106 */     this.defaultScopeModel[104] = new ModelRendererTurbo(this, 89, 313, this.textureX, this.textureY);
/* 2107 */     this.defaultScopeModel[105] = new ModelRendererTurbo(this, 777, 201, this.textureX, this.textureY);
/* 2108 */     this.defaultScopeModel[106] = new ModelRendererTurbo(this, 833, 201, this.textureX, this.textureY);
/* 2109 */     this.defaultScopeModel[107] = new ModelRendererTurbo(this, 841, 177, this.textureX, this.textureY);
/* 2110 */     this.defaultScopeModel[108] = new ModelRendererTurbo(this, 977, 161, this.textureX, this.textureY);
/* 2111 */     this.defaultScopeModel[109] = new ModelRendererTurbo(this, 729, 169, this.textureX, this.textureY);
/* 2112 */     this.defaultScopeModel[110] = new ModelRendererTurbo(this, 769, 169, this.textureX, this.textureY);
/* 2113 */     this.defaultScopeModel[111] = new ModelRendererTurbo(this, 1017, 169, this.textureX, this.textureY);
/* 2114 */     this.defaultScopeModel[112] = new ModelRendererTurbo(this, 41, 201, this.textureX, this.textureY);
/* 2115 */     this.defaultScopeModel[113] = new ModelRendererTurbo(this, 153, 201, this.textureX, this.textureY);
/* 2116 */     this.defaultScopeModel[114] = new ModelRendererTurbo(this, 345, 257, this.textureX, this.textureY);
/* 2117 */     this.defaultScopeModel[115] = new ModelRendererTurbo(this, 953, 281, this.textureX, this.textureY);
/* 2118 */     this.defaultScopeModel[116] = new ModelRendererTurbo(this, 577, 289, this.textureX, this.textureY);
/* 2119 */     this.defaultScopeModel[117] = new ModelRendererTurbo(this, 153, 225, this.textureX, this.textureY);
/* 2120 */     this.defaultScopeModel[118] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/* 2121 */     this.defaultScopeModel[119] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/* 2122 */     this.defaultScopeModel[120] = new ModelRendererTurbo(this, 929, 225, this.textureX, this.textureY);
/* 2123 */     this.defaultScopeModel[121] = new ModelRendererTurbo(this, 977, 225, this.textureX, this.textureY);
/* 2124 */     this.defaultScopeModel[122] = new ModelRendererTurbo(this, 145, 241, this.textureX, this.textureY);
/* 2125 */     this.defaultScopeModel[123] = new ModelRendererTurbo(this, 873, 161, this.textureX, this.textureY);
/* 2126 */     this.defaultScopeModel[124] = new ModelRendererTurbo(this, 761, 233, this.textureX, this.textureY);
/*      */     
/* 2128 */     this.defaultScopeModel[0].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2129 */     this.defaultScopeModel[0].setRotationPoint(-73.5F, -59.0F, 1.0F);
/*      */     
/* 2131 */     this.defaultScopeModel[1].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2132 */     this.defaultScopeModel[1].setRotationPoint(-73.5F, -56.0F, 1.0F);
/*      */     
/* 2134 */     this.defaultScopeModel[2].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2135 */     this.defaultScopeModel[2].setRotationPoint(-73.5F, -53.0F, 1.0F);
/*      */     
/* 2137 */     this.defaultScopeModel[3].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2138 */     this.defaultScopeModel[3].setRotationPoint(-73.5F, -59.0F, 11.0F);
/*      */     
/* 2140 */     this.defaultScopeModel[4].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2141 */     this.defaultScopeModel[4].setRotationPoint(-73.5F, -56.0F, 11.0F);
/*      */     
/* 2143 */     this.defaultScopeModel[5].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2144 */     this.defaultScopeModel[5].setRotationPoint(-73.5F, -53.0F, 11.0F);
/*      */     
/* 2146 */     this.defaultScopeModel[6].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2147 */     this.defaultScopeModel[6].setRotationPoint(-72.0F, -55.5F, 12.0F);
/*      */     
/* 2149 */     this.defaultScopeModel[7].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2150 */     this.defaultScopeModel[7].setRotationPoint(-72.0F, -57.5F, 12.0F);
/*      */     
/* 2152 */     this.defaultScopeModel[8].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2153 */     this.defaultScopeModel[8].setRotationPoint(-72.0F, -53.5F, 12.0F);
/*      */     
/* 2155 */     this.defaultScopeModel[9].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2156 */     this.defaultScopeModel[9].setRotationPoint(-70.0F, -58.5F, 12.0F);
/*      */     
/* 2158 */     this.defaultScopeModel[10].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2159 */     this.defaultScopeModel[10].setRotationPoint(-70.0F, -51.0F, 12.0F);
/*      */     
/* 2161 */     this.defaultScopeModel[11].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2162 */     this.defaultScopeModel[11].setRotationPoint(-74.75F, -59.0F, 12.0F);
/*      */     
/* 2164 */     this.defaultScopeModel[12].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2165 */     this.defaultScopeModel[12].setRotationPoint(-72.25F, -59.0F, 12.0F);
/*      */     
/* 2167 */     this.defaultScopeModel[13].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2168 */     this.defaultScopeModel[13].setRotationPoint(-72.0F, -55.5F, -1.0F);
/*      */     
/* 2170 */     this.defaultScopeModel[14].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2171 */     this.defaultScopeModel[14].setRotationPoint(-72.0F, -57.5F, -1.0F);
/*      */     
/* 2173 */     this.defaultScopeModel[15].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2174 */     this.defaultScopeModel[15].setRotationPoint(-72.0F, -53.5F, -1.0F);
/*      */     
/* 2176 */     this.defaultScopeModel[16].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2177 */     this.defaultScopeModel[16].setRotationPoint(-70.0F, -58.5F, -0.7F);
/*      */     
/* 2179 */     this.defaultScopeModel[17].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2180 */     this.defaultScopeModel[17].setRotationPoint(-70.0F, -51.0F, -0.7F);
/*      */     
/* 2182 */     this.defaultScopeModel[18].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2183 */     this.defaultScopeModel[18].setRotationPoint(-74.75F, -59.0F, -0.7F);
/*      */     
/* 2185 */     this.defaultScopeModel[19].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2186 */     this.defaultScopeModel[19].setRotationPoint(-72.25F, -59.0F, -0.7F);
/*      */     
/* 2188 */     this.defaultScopeModel[20].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2189 */     this.defaultScopeModel[20].setRotationPoint(-73.5F, -58.0F, 9.0F);
/*      */     
/* 2191 */     this.defaultScopeModel[21].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2192 */     this.defaultScopeModel[21].setRotationPoint(-73.5F, -55.0F, 9.0F);
/*      */     
/* 2194 */     this.defaultScopeModel[22].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2195 */     this.defaultScopeModel[22].setRotationPoint(-73.5F, -53.0F, 9.0F);
/*      */     
/* 2197 */     this.defaultScopeModel[23].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2198 */     this.defaultScopeModel[23].setRotationPoint(-73.5F, -58.0F, 2.0F);
/*      */     
/* 2200 */     this.defaultScopeModel[24].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2201 */     this.defaultScopeModel[24].setRotationPoint(-73.5F, -55.0F, 2.0F);
/*      */     
/* 2203 */     this.defaultScopeModel[25].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F);
/* 2204 */     this.defaultScopeModel[25].setRotationPoint(-73.5F, -53.0F, 2.0F);
/*      */     
/* 2206 */     this.defaultScopeModel[26].addShapeBox(44.0F, -20.0F, -6.0F, 6, 15, 2, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2207 */     this.defaultScopeModel[26].setRotationPoint(-72.0F, -66.0F, 3.5F);
/*      */     
/* 2209 */     this.defaultScopeModel[27].addShapeBox(44.0F, -20.0F, -6.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2210 */     this.defaultScopeModel[27].setRotationPoint(-65.5F, -55.0F, 3.5F);
/*      */     
/* 2212 */     this.defaultScopeModel[28].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2213 */     this.defaultScopeModel[28].setRotationPoint(-65.5F, -56.0F, 3.5F);
/*      */     
/* 2215 */     this.defaultScopeModel[29].addShapeBox(44.0F, -20.0F, -6.0F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2216 */     this.defaultScopeModel[29].setRotationPoint(-66.5F, -55.0F, 1.5F);
/*      */     
/* 2218 */     this.defaultScopeModel[30].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2219 */     this.defaultScopeModel[30].setRotationPoint(-63.5F, -55.0F, 1.5F);
/*      */     
/* 2221 */     this.defaultScopeModel[31].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2222 */     this.defaultScopeModel[31].setRotationPoint(-63.5F, -53.0F, 1.5F);
/*      */     
/* 2224 */     this.defaultScopeModel[32].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2225 */     this.defaultScopeModel[32].setRotationPoint(-57.5F, -53.0F, 1.5F);
/*      */     
/* 2227 */     this.defaultScopeModel[33].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2228 */     this.defaultScopeModel[33].setRotationPoint(-57.5F, -53.0F, 9.5F);
/*      */     
/* 2230 */     this.defaultScopeModel[34].addShapeBox(44.0F, -20.0F, -6.0F, 6, 15, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2231 */     this.defaultScopeModel[34].setRotationPoint(-72.0F, -66.0F, 5.5F);
/*      */     
/* 2233 */     this.defaultScopeModel[35].addShapeBox(44.0F, -20.0F, -6.0F, 6, 15, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2234 */     this.defaultScopeModel[35].setRotationPoint(-72.0F, -66.0F, 7.5F);
/*      */     
/* 2236 */     this.defaultScopeModel[36].addShapeBox(44.0F, -20.0F, -6.0F, 3, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2237 */     this.defaultScopeModel[36].setRotationPoint(-62.0F, -54.0F, 10.5F);
/*      */     
/* 2239 */     this.defaultScopeModel[37].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2240 */     this.defaultScopeModel[37].setRotationPoint(-62.0F, -51.0F, 10.5F);
/*      */     
/* 2242 */     this.defaultScopeModel[38].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2243 */     this.defaultScopeModel[38].setRotationPoint(-61.15F, -53.25F, 11.0F);
/*      */     
/* 2245 */     this.defaultScopeModel[39].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2246 */     this.defaultScopeModel[39].setRotationPoint(-60.9F, -52.5F, 11.0F);
/*      */     
/* 2248 */     this.defaultScopeModel[40].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2249 */     this.defaultScopeModel[40].setRotationPoint(-60.9F, -54.0F, 11.0F);
/*      */     
/* 2251 */     this.defaultScopeModel[41].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2252 */     this.defaultScopeModel[41].setRotationPoint(-61.65F, -54.0F, 11.0F);
/*      */     
/* 2254 */     this.defaultScopeModel[42].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2255 */     this.defaultScopeModel[42].setRotationPoint(-60.4F, -54.0F, 11.0F);
/*      */     
/* 2257 */     this.defaultScopeModel[43].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2258 */     this.defaultScopeModel[43].setRotationPoint(-61.65F, -52.75F, 11.0F);
/*      */     
/* 2260 */     this.defaultScopeModel[44].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2261 */     this.defaultScopeModel[44].setRotationPoint(-60.4F, -52.75F, 11.0F);
/*      */     
/* 2263 */     this.defaultScopeModel[45].addShapeBox(44.0F, -20.0F, -6.0F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2264 */     this.defaultScopeModel[45].setRotationPoint(-72.15F, -63.0F, 5.35F);
/*      */     
/* 2266 */     this.defaultScopeModel[46].addShapeBox(44.0F, -20.0F, -6.0F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F);
/* 2267 */     this.defaultScopeModel[46].setRotationPoint(-72.15F, -63.0F, 7.6F);
/*      */     
/* 2269 */     this.defaultScopeModel[47].addShapeBox(44.0F, -20.0F, -6.0F, 6, 6, 2, 0.0F, -1.75F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2270 */     this.defaultScopeModel[47].setRotationPoint(-72.15F, -63.0F, 3.1F);
/*      */     
/* 2272 */     this.defaultScopeModel[48].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2273 */     this.defaultScopeModel[48].setRotationPoint(-71.0F, -67.5F, 5.0F);
/*      */     
/* 2275 */     this.defaultScopeModel[49].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2276 */     this.defaultScopeModel[49].setRotationPoint(-71.0F, -69.0F, 4.5F);
/*      */     
/* 2278 */     this.defaultScopeModel[50].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2279 */     this.defaultScopeModel[50].setRotationPoint(-71.0F, -70.0F, 4.5F);
/*      */     
/* 2281 */     this.defaultScopeModel[51].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2282 */     this.defaultScopeModel[51].setRotationPoint(-71.0F, -70.0F, 7.5F);
/*      */     
/* 2284 */     this.defaultScopeModel[52].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2285 */     this.defaultScopeModel[52].setRotationPoint(-71.0F, -69.0F, 7.5F);
/*      */     
/* 2287 */     this.defaultScopeModel[53].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2288 */     this.defaultScopeModel[53].setRotationPoint(-71.0F, -70.5F, 5.5F);
/*      */     
/* 2290 */     this.defaultScopeModel[54].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 2291 */     this.defaultScopeModel[54].setRotationPoint(-71.0F, -70.0F, 5.5F);
/*      */     
/* 2293 */     this.defaultScopeModel[55].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2294 */     this.defaultScopeModel[55].setRotationPoint(-71.0F, -70.0F, 6.5F);
/*      */     
/* 2296 */     this.defaultScopeModel[56].addShapeBox(44.0F, -20.0F, -6.0F, 6, 3, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2297 */     this.defaultScopeModel[56].setRotationPoint(-72.0F, -69.5F, 8.5F);
/*      */     
/* 2299 */     this.defaultScopeModel[57].addShapeBox(44.0F, -20.0F, -6.0F, 6, 3, 1, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2300 */     this.defaultScopeModel[57].setRotationPoint(-72.0F, -69.5F, 3.5F);
/*      */     
/* 2302 */     this.defaultScopeModel[58].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2303 */     this.defaultScopeModel[58].setRotationPoint(-71.0F, -68.0F, 6.5F);
/*      */     
/* 2305 */     this.defaultScopeModel[59].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 2306 */     this.defaultScopeModel[59].setRotationPoint(-71.0F, -68.0F, 5.5F);
/*      */     
/* 2308 */     this.defaultScopeModel[60].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2309 */     this.defaultScopeModel[60].setRotationPoint(-69.25F, -67.5F, 5.0F);
/*      */     
/* 2311 */     this.defaultScopeModel[61].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2312 */     this.defaultScopeModel[61].setRotationPoint(-68.5F, -67.5F, 4.5F);
/*      */     
/* 2314 */     this.defaultScopeModel[62].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2315 */     this.defaultScopeModel[62].setRotationPoint(-68.5F, -67.5F, 7.5F);
/*      */     
/* 2317 */     this.defaultScopeModel[63].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F);
/* 2318 */     this.defaultScopeModel[63].setRotationPoint(-67.0F, -67.5F, 7.5F);
/*      */     
/* 2320 */     this.defaultScopeModel[64].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2321 */     this.defaultScopeModel[64].setRotationPoint(-67.0F, -67.5F, 4.5F);
/*      */     
/* 2323 */     this.defaultScopeModel[65].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2324 */     this.defaultScopeModel[65].setRotationPoint(-67.0F, -67.5F, 5.5F);
/*      */     
/* 2326 */     this.defaultScopeModel[66].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2327 */     this.defaultScopeModel[66].setRotationPoint(-68.75F, -67.5F, 6.5F);
/*      */     
/* 2329 */     this.defaultScopeModel[67].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F);
/* 2330 */     this.defaultScopeModel[67].setRotationPoint(-68.75F, -67.5F, 5.5F);
/*      */     
/* 2332 */     this.defaultScopeModel[68].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2333 */     this.defaultScopeModel[68].setRotationPoint(-67.5F, -67.5F, 6.5F);
/*      */     
/* 2335 */     this.defaultScopeModel[69].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F);
/* 2336 */     this.defaultScopeModel[69].setRotationPoint(-67.5F, -67.5F, 5.5F);
/*      */     
/* 2338 */     this.defaultScopeModel[70].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2339 */     this.defaultScopeModel[70].setRotationPoint(152.5F, -59.0F, 1.0F);
/*      */     
/* 2341 */     this.defaultScopeModel[71].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2342 */     this.defaultScopeModel[71].setRotationPoint(152.5F, -56.0F, 1.0F);
/*      */     
/* 2344 */     this.defaultScopeModel[72].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2345 */     this.defaultScopeModel[72].setRotationPoint(152.5F, -53.0F, 1.0F);
/*      */     
/* 2347 */     this.defaultScopeModel[73].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2348 */     this.defaultScopeModel[73].setRotationPoint(152.5F, -59.0F, 11.0F);
/*      */     
/* 2350 */     this.defaultScopeModel[74].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2351 */     this.defaultScopeModel[74].setRotationPoint(152.5F, -56.0F, 11.0F);
/*      */     
/* 2353 */     this.defaultScopeModel[75].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2354 */     this.defaultScopeModel[75].setRotationPoint(152.5F, -53.0F, 11.0F);
/*      */     
/* 2356 */     this.defaultScopeModel[76].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2357 */     this.defaultScopeModel[76].setRotationPoint(154.0F, -55.5F, 12.0F);
/*      */     
/* 2359 */     this.defaultScopeModel[77].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2360 */     this.defaultScopeModel[77].setRotationPoint(154.0F, -57.5F, 12.0F);
/*      */     
/* 2362 */     this.defaultScopeModel[78].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2363 */     this.defaultScopeModel[78].setRotationPoint(154.0F, -53.5F, 12.0F);
/*      */     
/* 2365 */     this.defaultScopeModel[79].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2366 */     this.defaultScopeModel[79].setRotationPoint(156.0F, -58.5F, 12.0F);
/*      */     
/* 2368 */     this.defaultScopeModel[80].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2369 */     this.defaultScopeModel[80].setRotationPoint(156.0F, -51.0F, 12.0F);
/*      */     
/* 2371 */     this.defaultScopeModel[81].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2372 */     this.defaultScopeModel[81].setRotationPoint(151.25F, -59.0F, 12.0F);
/*      */     
/* 2374 */     this.defaultScopeModel[82].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2375 */     this.defaultScopeModel[82].setRotationPoint(153.75F, -59.0F, 12.0F);
/*      */     
/* 2377 */     this.defaultScopeModel[83].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2378 */     this.defaultScopeModel[83].setRotationPoint(154.0F, -55.5F, -1.0F);
/*      */     
/* 2380 */     this.defaultScopeModel[84].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2381 */     this.defaultScopeModel[84].setRotationPoint(154.0F, -57.5F, -1.0F);
/*      */     
/* 2383 */     this.defaultScopeModel[85].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2384 */     this.defaultScopeModel[85].setRotationPoint(154.0F, -53.5F, -1.0F);
/*      */     
/* 2386 */     this.defaultScopeModel[86].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2387 */     this.defaultScopeModel[86].setRotationPoint(156.0F, -58.5F, -0.7F);
/*      */     
/* 2389 */     this.defaultScopeModel[87].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2390 */     this.defaultScopeModel[87].setRotationPoint(156.0F, -51.0F, -0.7F);
/*      */     
/* 2392 */     this.defaultScopeModel[88].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2393 */     this.defaultScopeModel[88].setRotationPoint(151.25F, -59.0F, -0.7F);
/*      */     
/* 2395 */     this.defaultScopeModel[89].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2396 */     this.defaultScopeModel[89].setRotationPoint(153.75F, -59.0F, -0.7F);
/*      */     
/* 2398 */     this.defaultScopeModel[90].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2399 */     this.defaultScopeModel[90].setRotationPoint(152.5F, -58.0F, 9.0F);
/*      */     
/* 2401 */     this.defaultScopeModel[91].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2402 */     this.defaultScopeModel[91].setRotationPoint(152.5F, -55.0F, 9.0F);
/*      */     
/* 2404 */     this.defaultScopeModel[92].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2405 */     this.defaultScopeModel[92].setRotationPoint(152.5F, -53.0F, 9.0F);
/*      */     
/* 2407 */     this.defaultScopeModel[93].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2408 */     this.defaultScopeModel[93].setRotationPoint(152.5F, -58.0F, 2.0F);
/*      */     
/* 2410 */     this.defaultScopeModel[94].addShapeBox(44.0F, -20.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2411 */     this.defaultScopeModel[94].setRotationPoint(152.5F, -55.0F, 2.0F);
/*      */     
/* 2413 */     this.defaultScopeModel[95].addShapeBox(44.0F, -20.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F);
/* 2414 */     this.defaultScopeModel[95].setRotationPoint(152.5F, -53.0F, 2.0F);
/*      */     
/* 2416 */     this.defaultScopeModel[96].addShapeBox(44.0F, -20.0F, -6.0F, 6, 13, 2, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2417 */     this.defaultScopeModel[96].setRotationPoint(154.0F, -64.0F, 3.5F);
/*      */     
/* 2419 */     this.defaultScopeModel[97].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2420 */     this.defaultScopeModel[97].setRotationPoint(160.5F, -56.0F, 3.5F);
/*      */     
/* 2422 */     this.defaultScopeModel[98].addShapeBox(44.0F, -20.0F, -6.0F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2423 */     this.defaultScopeModel[98].setRotationPoint(159.5F, -55.0F, 1.5F);
/*      */     
/* 2425 */     this.defaultScopeModel[99].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2426 */     this.defaultScopeModel[99].setRotationPoint(162.5F, -55.0F, 1.5F);
/*      */     
/* 2428 */     this.defaultScopeModel[100].addShapeBox(44.0F, -20.0F, -6.0F, 6, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2429 */     this.defaultScopeModel[100].setRotationPoint(162.5F, -53.0F, 1.5F);
/*      */     
/* 2431 */     this.defaultScopeModel[101].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2432 */     this.defaultScopeModel[101].setRotationPoint(168.5F, -53.0F, 1.5F);
/*      */     
/* 2434 */     this.defaultScopeModel[102].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2435 */     this.defaultScopeModel[102].setRotationPoint(168.5F, -53.0F, 9.5F);
/*      */     
/* 2437 */     this.defaultScopeModel[103].addShapeBox(44.0F, -20.0F, -6.0F, 6, 13, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2438 */     this.defaultScopeModel[103].setRotationPoint(154.0F, -64.0F, 5.5F);
/*      */     
/* 2440 */     this.defaultScopeModel[104].addShapeBox(44.0F, -20.0F, -6.0F, 6, 13, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2441 */     this.defaultScopeModel[104].setRotationPoint(154.0F, -64.0F, 7.5F);
/*      */     
/* 2443 */     this.defaultScopeModel[105].addShapeBox(44.0F, -20.0F, -6.0F, 3, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2444 */     this.defaultScopeModel[105].setRotationPoint(164.0F, -54.0F, 10.5F);
/*      */     
/* 2446 */     this.defaultScopeModel[106].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2447 */     this.defaultScopeModel[106].setRotationPoint(164.0F, -51.0F, 10.5F);
/*      */     
/* 2449 */     this.defaultScopeModel[107].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2450 */     this.defaultScopeModel[107].setRotationPoint(164.85F, -53.25F, 11.0F);
/*      */     
/* 2452 */     this.defaultScopeModel[108].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2453 */     this.defaultScopeModel[108].setRotationPoint(165.1F, -52.5F, 11.0F);
/*      */     
/* 2455 */     this.defaultScopeModel[109].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2456 */     this.defaultScopeModel[109].setRotationPoint(165.1F, -54.0F, 11.0F);
/*      */     
/* 2458 */     this.defaultScopeModel[110].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2459 */     this.defaultScopeModel[110].setRotationPoint(164.35F, -54.0F, 11.0F);
/*      */     
/* 2461 */     this.defaultScopeModel[111].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2462 */     this.defaultScopeModel[111].setRotationPoint(165.6F, -54.0F, 11.0F);
/*      */     
/* 2464 */     this.defaultScopeModel[112].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2465 */     this.defaultScopeModel[112].setRotationPoint(164.35F, -52.75F, 11.0F);
/*      */     
/* 2467 */     this.defaultScopeModel[113].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2468 */     this.defaultScopeModel[113].setRotationPoint(165.6F, -52.75F, 11.0F);
/*      */     
/* 2470 */     this.defaultScopeModel[114].addShapeBox(44.0F, -20.0F, -6.0F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2471 */     this.defaultScopeModel[114].setRotationPoint(153.85F, -61.0F, 5.35F);
/*      */     
/* 2473 */     this.defaultScopeModel[115].addShapeBox(44.0F, -20.0F, -6.0F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F);
/* 2474 */     this.defaultScopeModel[115].setRotationPoint(153.85F, -61.0F, 7.6F);
/*      */     
/* 2476 */     this.defaultScopeModel[116].addShapeBox(44.0F, -20.0F, -6.0F, 6, 6, 2, 0.0F, -1.75F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2477 */     this.defaultScopeModel[116].setRotationPoint(153.85F, -61.0F, 3.1F);
/*      */     
/* 2479 */     this.defaultScopeModel[117].addShapeBox(44.0F, -20.0F, -6.0F, 2, 1, 5, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 2480 */     this.defaultScopeModel[117].setRotationPoint(156.0F, -66.5F, 4.0F);
/*      */     
/* 2482 */     this.defaultScopeModel[118].addShapeBox(44.0F, -20.0F, -6.0F, 6, 4, 1, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.35F, 0.5F, 0.0F, -1.35F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F);
/* 2483 */     this.defaultScopeModel[118].setRotationPoint(154.0F, -69.5F, 2.5F);
/*      */     
/* 2485 */     this.defaultScopeModel[119].addShapeBox(44.0F, -20.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2486 */     this.defaultScopeModel[119].setRotationPoint(156.5F, -70.5F, 6.0F);
/*      */     
/* 2488 */     this.defaultScopeModel[120].addShapeBox(44.0F, -20.0F, -6.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2489 */     this.defaultScopeModel[120].setRotationPoint(154.0F, -65.5F, 5.5F);
/*      */     
/* 2491 */     this.defaultScopeModel[121].addShapeBox(44.0F, -20.0F, -6.0F, 6, 1, 2, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2492 */     this.defaultScopeModel[121].setRotationPoint(154.0F, -65.5F, 3.5F);
/*      */     
/* 2494 */     this.defaultScopeModel[122].addShapeBox(44.0F, -20.0F, -6.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2495 */     this.defaultScopeModel[122].setRotationPoint(154.0F, -65.5F, 7.5F);
/*      */     
/* 2497 */     this.defaultScopeModel[123].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/* 2498 */     this.defaultScopeModel[123].setRotationPoint(156.5F, -67.5F, 6.0F);
/*      */     
/* 2500 */     this.defaultScopeModel[124].addShapeBox(44.0F, -20.0F, -6.0F, 6, 4, 1, 0.0F, -1.35F, 0.5F, 0.0F, -1.35F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2501 */     this.defaultScopeModel[124].setRotationPoint(154.0F, -69.5F, 9.5F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2506 */     this.ammoModel[0] = new ModelRendererTurbo(this, 929, 233, this.textureX, this.textureY);
/* 2507 */     this.ammoModel[1] = new ModelRendererTurbo(this, 385, 241, this.textureX, this.textureY);
/* 2508 */     this.ammoModel[2] = new ModelRendererTurbo(this, 121, 241, this.textureX, this.textureY);
/* 2509 */     this.ammoModel[3] = new ModelRendererTurbo(this, 585, 241, this.textureX, this.textureY);
/* 2510 */     this.ammoModel[4] = new ModelRendererTurbo(this, 609, 241, this.textureX, this.textureY);
/* 2511 */     this.ammoModel[5] = new ModelRendererTurbo(this, 625, 241, this.textureX, this.textureY);
/* 2512 */     this.ammoModel[6] = new ModelRendererTurbo(this, 489, 201, this.textureX, this.textureY);
/* 2513 */     this.ammoModel[7] = new ModelRendererTurbo(this, 569, 225, this.textureX, this.textureY);
/* 2514 */     this.ammoModel[8] = new ModelRendererTurbo(this, 81, 241, this.textureX, this.textureY);
/* 2515 */     this.ammoModel[9] = new ModelRendererTurbo(this, 825, 249, this.textureX, this.textureY);
/* 2516 */     this.ammoModel[10] = new ModelRendererTurbo(this, 849, 249, this.textureX, this.textureY);
/* 2517 */     this.ammoModel[11] = new ModelRendererTurbo(this, 641, 257, this.textureX, this.textureY);
/* 2518 */     this.ammoModel[12] = new ModelRendererTurbo(this, 657, 257, this.textureX, this.textureY);
/* 2519 */     this.ammoModel[13] = new ModelRendererTurbo(this, 513, 201, this.textureX, this.textureY);
/*      */     
/* 2521 */     this.ammoModel[0].addShapeBox(44.0F, -20.0F, -6.0F, 34, 29, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2522 */     this.ammoModel[0].setRotationPoint(-14.0F, -3.0F, 1.0F);
/*      */     
/* 2524 */     this.ammoModel[1].addShapeBox(44.0F, -20.0F, -6.0F, 34, 17, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/* 2525 */     this.ammoModel[1].setRotationPoint(-14.0F, 26.0F, 1.0F);
/*      */     
/* 2527 */     this.ammoModel[2].addShapeBox(44.0F, -20.0F, -6.0F, 7, 44, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 1.25F, -0.5F);
/* 2528 */     this.ammoModel[2].setRotationPoint(13.0F, -3.0F, 0.5F);
/*      */     
/* 2530 */     this.ammoModel[3].addShapeBox(44.0F, -20.0F, -6.0F, 8, 46, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 1.6F, -0.5F);
/* 2531 */     this.ammoModel[3].setRotationPoint(2.0F, -3.0F, 0.5F);
/*      */     
/* 2533 */     this.ammoModel[4].addShapeBox(44.0F, -20.0F, -6.0F, 6, 48, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.45F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, -0.5F, -0.5F, 1.45F, -0.5F);
/* 2534 */     this.ammoModel[4].setRotationPoint(-7.0F, -3.0F, 0.5F);
/*      */     
/* 2536 */     this.ammoModel[5].addShapeBox(44.0F, -20.0F, -6.0F, 4, 51, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2537 */     this.ammoModel[5].setRotationPoint(-14.5F, -3.0F, 0.5F);
/*      */     
/* 2539 */     this.ammoModel[6].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.3F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -0.5F, -0.5F, 1.3F, -0.5F);
/* 2540 */     this.ammoModel[6].setRotationPoint(-1.5F, 42.0F, 0.5F);
/*      */     
/* 2542 */     this.ammoModel[7].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2543 */     this.ammoModel[7].setRotationPoint(-1.5F, 41.0F, 0.5F);
/*      */     
/* 2545 */     this.ammoModel[8].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2546 */     this.ammoModel[8].setRotationPoint(2.0F, 41.0F, 0.5F);
/*      */     
/* 2548 */     this.ammoModel[9].addShapeBox(44.0F, -20.0F, -6.0F, 7, 44, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.5F, 1.25F, -0.5F);
/* 2549 */     this.ammoModel[9].setRotationPoint(13.0F, -3.0F, 12.0F);
/*      */     
/* 2551 */     this.ammoModel[10].addShapeBox(44.0F, -20.0F, -6.0F, 8, 46, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 1.6F, -0.5F);
/* 2552 */     this.ammoModel[10].setRotationPoint(2.0F, -3.0F, 12.0F);
/*      */     
/* 2554 */     this.ammoModel[11].addShapeBox(44.0F, -20.0F, -6.0F, 6, 48, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.45F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, -0.5F, -0.5F, 1.45F, -0.5F);
/* 2555 */     this.ammoModel[11].setRotationPoint(-7.0F, -3.0F, 12.0F);
/*      */     
/* 2557 */     this.ammoModel[12].addShapeBox(44.0F, -20.0F, -6.0F, 4, 51, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.5F, 0.0F, -0.5F);
/* 2558 */     this.ammoModel[12].setRotationPoint(-14.5F, -3.0F, 12.0F);
/*      */     
/* 2560 */     this.ammoModel[13].addShapeBox(44.0F, -20.0F, -6.0F, 4, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.3F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -0.5F, -0.5F, 1.3F, -0.5F);
/* 2561 */     this.ammoModel[13].setRotationPoint(-1.5F, 42.0F, 12.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 2566 */     this.slideModel[0] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/* 2567 */     this.slideModel[1] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/* 2568 */     this.slideModel[2] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/* 2569 */     this.slideModel[3] = new ModelRendererTurbo(this, 921, 1, this.textureX, this.textureY);
/* 2570 */     this.slideModel[4] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 2571 */     this.slideModel[5] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/* 2572 */     this.slideModel[6] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 2573 */     this.slideModel[7] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/* 2574 */     this.slideModel[8] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/* 2575 */     this.slideModel[9] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/* 2576 */     this.slideModel[10] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/* 2577 */     this.slideModel[11] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/* 2578 */     this.slideModel[12] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/* 2579 */     this.slideModel[13] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/* 2580 */     this.slideModel[14] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/* 2581 */     this.slideModel[15] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/* 2582 */     this.slideModel[16] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/* 2583 */     this.slideModel[17] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 2584 */     this.slideModel[18] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/* 2585 */     this.slideModel[19] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 2586 */     this.slideModel[20] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/* 2587 */     this.slideModel[21] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/* 2588 */     this.slideModel[22] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/* 2589 */     this.slideModel[23] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/* 2590 */     this.slideModel[24] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/* 2591 */     this.slideModel[25] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/* 2592 */     this.slideModel[26] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/* 2593 */     this.slideModel[27] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/* 2594 */     this.slideModel[28] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/* 2595 */     this.slideModel[29] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/* 2596 */     this.slideModel[30] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/* 2597 */     this.slideModel[31] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 2598 */     this.slideModel[32] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/* 2599 */     this.slideModel[33] = new ModelRendererTurbo(this, 657, 9, this.textureX, this.textureY);
/* 2600 */     this.slideModel[34] = new ModelRendererTurbo(this, 833, 9, this.textureX, this.textureY);
/* 2601 */     this.slideModel[35] = new ModelRendererTurbo(this, 841, 9, this.textureX, this.textureY);
/* 2602 */     this.slideModel[36] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/*      */     
/* 2604 */     this.slideModel[0].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2605 */     this.slideModel[0].setRotationPoint(54.5F, -44.25F, 11.5F);
/*      */     
/* 2607 */     this.slideModel[1].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2608 */     this.slideModel[1].setRotationPoint(52.75F, -44.25F, 11.5F);
/*      */     
/* 2610 */     this.slideModel[2].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2611 */     this.slideModel[2].setRotationPoint(56.25F, -44.25F, 11.5F);
/*      */     
/* 2613 */     this.slideModel[3].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2614 */     this.slideModel[3].setRotationPoint(53.0F, -42.5F, 11.5F);
/*      */     
/* 2616 */     this.slideModel[4].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2617 */     this.slideModel[4].setRotationPoint(56.25F, -41.0F, 11.5F);
/*      */     
/* 2619 */     this.slideModel[5].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2620 */     this.slideModel[5].setRotationPoint(54.5F, -40.75F, 11.5F);
/*      */     
/* 2622 */     this.slideModel[6].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2623 */     this.slideModel[6].setRotationPoint(52.75F, -41.0F, 11.5F);
/*      */     
/* 2625 */     this.slideModel[7].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2626 */     this.slideModel[7].setRotationPoint(53.6F, -42.65F, 12.5F);
/*      */     
/* 2628 */     this.slideModel[8].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2629 */     this.slideModel[8].setRotationPoint(53.6F, -41.65F, 12.5F);
/*      */     
/* 2631 */     this.slideModel[9].addShapeBox(44.0F, -20.0F, -6.0F, 3, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2632 */     this.slideModel[9].setRotationPoint(53.6F, -43.65F, 12.5F);
/*      */     
/* 2634 */     this.slideModel[10].addShapeBox(44.0F, -20.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2635 */     this.slideModel[10].setRotationPoint(54.1F, -43.15F, 9.5F);
/*      */     
/* 2637 */     this.slideModel[11].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2638 */     this.slideModel[11].setRotationPoint(54.5F, -44.25F, 18.5F);
/*      */     
/* 2640 */     this.slideModel[12].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2641 */     this.slideModel[12].setRotationPoint(52.75F, -44.25F, 18.5F);
/*      */     
/* 2643 */     this.slideModel[13].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2644 */     this.slideModel[13].setRotationPoint(56.25F, -44.25F, 18.5F);
/*      */     
/* 2646 */     this.slideModel[14].addShapeBox(44.0F, -20.0F, -6.0F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2647 */     this.slideModel[14].setRotationPoint(53.0F, -42.5F, 18.5F);
/*      */     
/* 2649 */     this.slideModel[15].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2650 */     this.slideModel[15].setRotationPoint(56.25F, -41.0F, 18.5F);
/*      */     
/* 2652 */     this.slideModel[16].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2653 */     this.slideModel[16].setRotationPoint(54.5F, -40.75F, 18.5F);
/*      */     
/* 2655 */     this.slideModel[17].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2656 */     this.slideModel[17].setRotationPoint(52.75F, -41.0F, 18.5F);
/*      */     
/* 2658 */     this.slideModel[18].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2659 */     this.slideModel[18].setRotationPoint(54.5F, -44.25F, 17.5F);
/*      */     
/* 2661 */     this.slideModel[19].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2662 */     this.slideModel[19].setRotationPoint(52.75F, -44.25F, 17.5F);
/*      */     
/* 2664 */     this.slideModel[20].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2665 */     this.slideModel[20].setRotationPoint(56.25F, -44.25F, 17.5F);
/*      */     
/* 2667 */     this.slideModel[21].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2668 */     this.slideModel[21].setRotationPoint(56.25F, -41.0F, 17.5F);
/*      */     
/* 2670 */     this.slideModel[22].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2671 */     this.slideModel[22].setRotationPoint(54.5F, -40.75F, 17.5F);
/*      */     
/* 2673 */     this.slideModel[23].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2674 */     this.slideModel[23].setRotationPoint(52.75F, -41.0F, 17.5F);
/*      */     
/* 2676 */     this.slideModel[24].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2677 */     this.slideModel[24].setRotationPoint(54.5F, -42.5F, 16.5F);
/*      */     
/* 2679 */     this.slideModel[25].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2680 */     this.slideModel[25].setRotationPoint(52.75F, -42.5F, 17.5F);
/*      */     
/* 2682 */     this.slideModel[26].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2683 */     this.slideModel[26].setRotationPoint(56.5F, -42.5F, 17.5F);
/*      */     
/* 2685 */     this.slideModel[27].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F);
/* 2686 */     this.slideModel[27].setRotationPoint(56.5F, -42.5F, 12.5F);
/*      */     
/* 2688 */     this.slideModel[28].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F);
/* 2689 */     this.slideModel[28].setRotationPoint(56.25F, -44.25F, 12.5F);
/*      */     
/* 2691 */     this.slideModel[29].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2692 */     this.slideModel[29].setRotationPoint(54.5F, -42.5F, 12.5F);
/*      */     
/* 2694 */     this.slideModel[30].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2695 */     this.slideModel[30].setRotationPoint(52.75F, -44.25F, 12.5F);
/*      */     
/* 2697 */     this.slideModel[31].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2698 */     this.slideModel[31].setRotationPoint(54.5F, -44.25F, 12.5F);
/*      */     
/* 2700 */     this.slideModel[32].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2701 */     this.slideModel[32].setRotationPoint(52.75F, -42.5F, 12.5F);
/*      */     
/* 2703 */     this.slideModel[33].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F);
/* 2704 */     this.slideModel[33].setRotationPoint(52.75F, -41.0F, 12.5F);
/*      */     
/* 2706 */     this.slideModel[34].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/* 2707 */     this.slideModel[34].setRotationPoint(54.5F, -40.75F, 12.5F);
/*      */     
/* 2709 */     this.slideModel[35].addShapeBox(44.0F, -20.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F);
/* 2710 */     this.slideModel[35].setRotationPoint(56.25F, -41.0F, 12.5F);
/*      */     
/* 2712 */     this.slideModel[36].addBox(44.0F, -20.0F, -6.0F, 46, 8, 7, 0.0F);
/* 2713 */     this.slideModel[36].setRotationPoint(-25.0F, -34.0F, -1.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmk20ssr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */