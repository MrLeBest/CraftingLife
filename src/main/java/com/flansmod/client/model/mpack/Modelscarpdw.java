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
/*      */ public class Modelscarpdw
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelscarpdw()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ư'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[125];
/*   23 */     this.ammoModel = new ModelRendererTurbo[50];
/*   24 */     this.slideModel = new ModelRendererTurbo[37];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initdefaultScopeModel_1();
/*   28 */     initammoModel_1();
/*   29 */     initslideModel_1();
/*      */     
/*   31 */     this.gripAttachPoint = new Vector3f(8.1875F, 3.25F, 0.0F);
/*   32 */     this.scopeAttachPoint = new Vector3f(0.625F, 5.4375F, 0.0F);
/*      */     
/*   34 */     translateAll(-0.5F, -20.5F, -0.4F);
/*   35 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*      */     
/*   37 */     this.gunSlideDistance = 2.75F;
/*   38 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   41 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   46 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[1] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[2] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[3] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[4] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[5] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[6] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[7] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[8] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[9] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[10] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[11] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*   58 */     this.gunModel[12] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*   59 */     this.gunModel[13] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/*   60 */     this.gunModel[14] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*   61 */     this.gunModel[15] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/*   62 */     this.gunModel[16] = new ModelRendererTurbo(this, 841, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   64 */     this.gunModel[18] = new ModelRendererTurbo(this, 713, 17, this.textureX, this.textureY);
/*   65 */     this.gunModel[19] = new ModelRendererTurbo(this, 745, 17, this.textureX, this.textureY);
/*   66 */     this.gunModel[20] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*   67 */     this.gunModel[21] = new ModelRendererTurbo(this, 929, 17, this.textureX, this.textureY);
/*   68 */     this.gunModel[22] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*   69 */     this.gunModel[23] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[24] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[25] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*   72 */     this.gunModel[26] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[27] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[28] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/*   75 */     this.gunModel[29] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[30] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[31] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[32] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/*   79 */     this.gunModel[33] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[34] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[35] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[36] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[37] = new ModelRendererTurbo(this, 513, 17, this.textureX, this.textureY);
/*   84 */     this.gunModel[38] = new ModelRendererTurbo(this, 697, 17, this.textureX, this.textureY);
/*   85 */     this.gunModel[39] = new ModelRendererTurbo(this, 625, 9, this.textureX, this.textureY);
/*   86 */     this.gunModel[40] = new ModelRendererTurbo(this, 697, 25, this.textureX, this.textureY);
/*   87 */     this.gunModel[41] = new ModelRendererTurbo(this, 769, 25, this.textureX, this.textureY);
/*   88 */     this.gunModel[42] = new ModelRendererTurbo(this, 825, 25, this.textureX, this.textureY);
/*   89 */     this.gunModel[43] = new ModelRendererTurbo(this, 985, 25, this.textureX, this.textureY);
/*   90 */     this.gunModel[44] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*   91 */     this.gunModel[45] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*   92 */     this.gunModel[46] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/*   93 */     this.gunModel[47] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*   94 */     this.gunModel[48] = new ModelRendererTurbo(this, 513, 33, this.textureX, this.textureY);
/*   95 */     this.gunModel[49] = new ModelRendererTurbo(this, 641, 49, this.textureX, this.textureY);
/*   96 */     this.gunModel[50] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*   97 */     this.gunModel[51] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   98 */     this.gunModel[52] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[53] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  100 */     this.gunModel[54] = new ModelRendererTurbo(this, 513, 73, this.textureX, this.textureY);
/*  101 */     this.gunModel[55] = new ModelRendererTurbo(this, 681, 73, this.textureX, this.textureY);
/*  102 */     this.gunModel[56] = new ModelRendererTurbo(this, 833, 73, this.textureX, this.textureY);
/*  103 */     this.gunModel[57] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/*  104 */     this.gunModel[58] = new ModelRendererTurbo(this, 529, 89, this.textureX, this.textureY);
/*  105 */     this.gunModel[59] = new ModelRendererTurbo(this, 673, 89, this.textureX, this.textureY);
/*  106 */     this.gunModel[60] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  107 */     this.gunModel[61] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  108 */     this.gunModel[62] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  109 */     this.gunModel[63] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  110 */     this.gunModel[64] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/*  111 */     this.gunModel[65] = new ModelRendererTurbo(this, 753, 97, this.textureX, this.textureY);
/*  112 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  113 */     this.gunModel[67] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  114 */     this.gunModel[68] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/*  115 */     this.gunModel[69] = new ModelRendererTurbo(this, 513, 113, this.textureX, this.textureY);
/*  116 */     this.gunModel[70] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  117 */     this.gunModel[71] = new ModelRendererTurbo(this, 657, 121, this.textureX, this.textureY);
/*  118 */     this.gunModel[72] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  119 */     this.gunModel[73] = new ModelRendererTurbo(this, 657, 113, this.textureX, this.textureY);
/*  120 */     this.gunModel[74] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  121 */     this.gunModel[75] = new ModelRendererTurbo(this, 689, 137, this.textureX, this.textureY);
/*  122 */     this.gunModel[76] = new ModelRendererTurbo(this, 641, 33, this.textureX, this.textureY);
/*  123 */     this.gunModel[77] = new ModelRendererTurbo(this, 665, 33, this.textureX, this.textureY);
/*  124 */     this.gunModel[78] = new ModelRendererTurbo(this, 737, 33, this.textureX, this.textureY);
/*  125 */     this.gunModel[79] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*  126 */     this.gunModel[80] = new ModelRendererTurbo(this, 881, 137, this.textureX, this.textureY);
/*  127 */     this.gunModel[81] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*  128 */     this.gunModel[82] = new ModelRendererTurbo(this, 913, 97, this.textureX, this.textureY);
/*  129 */     this.gunModel[83] = new ModelRendererTurbo(this, 993, 73, this.textureX, this.textureY);
/*  130 */     this.gunModel[84] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*  131 */     this.gunModel[85] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*  132 */     this.gunModel[86] = new ModelRendererTurbo(this, 993, 89, this.textureX, this.textureY);
/*  133 */     this.gunModel[87] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[88] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  135 */     this.gunModel[89] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  136 */     this.gunModel[90] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  137 */     this.gunModel[91] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  138 */     this.gunModel[92] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  139 */     this.gunModel[93] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  140 */     this.gunModel[94] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  141 */     this.gunModel[95] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  142 */     this.gunModel[96] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  143 */     this.gunModel[97] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[98] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[99] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  146 */     this.gunModel[100] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  147 */     this.gunModel[101] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  148 */     this.gunModel[102] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  149 */     this.gunModel[103] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/*  150 */     this.gunModel[104] = new ModelRendererTurbo(this, 953, 137, this.textureX, this.textureY);
/*  151 */     this.gunModel[105] = new ModelRendererTurbo(this, 353, 145, this.textureX, this.textureY);
/*  152 */     this.gunModel[106] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/*  153 */     this.gunModel[107] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/*  154 */     this.gunModel[108] = new ModelRendererTurbo(this, 937, 97, this.textureX, this.textureY);
/*  155 */     this.gunModel[109] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/*  156 */     this.gunModel[110] = new ModelRendererTurbo(this, 977, 137, this.textureX, this.textureY);
/*  157 */     this.gunModel[111] = new ModelRendererTurbo(this, 961, 97, this.textureX, this.textureY);
/*  158 */     this.gunModel[112] = new ModelRendererTurbo(this, 937, 137, this.textureX, this.textureY);
/*  159 */     this.gunModel[113] = new ModelRendererTurbo(this, 377, 145, this.textureX, this.textureY);
/*  160 */     this.gunModel[114] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/*  161 */     this.gunModel[115] = new ModelRendererTurbo(this, 497, 145, this.textureX, this.textureY);
/*  162 */     this.gunModel[116] = new ModelRendererTurbo(this, 537, 145, this.textureX, this.textureY);
/*  163 */     this.gunModel[117] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/*  164 */     this.gunModel[118] = new ModelRendererTurbo(this, 577, 145, this.textureX, this.textureY);
/*  165 */     this.gunModel[119] = new ModelRendererTurbo(this, 617, 145, this.textureX, this.textureY);
/*  166 */     this.gunModel[120] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*  167 */     this.gunModel[121] = new ModelRendererTurbo(this, 649, 145, this.textureX, this.textureY);
/*  168 */     this.gunModel[122] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  169 */     this.gunModel[123] = new ModelRendererTurbo(this, 57, 153, this.textureX, this.textureY);
/*  170 */     this.gunModel[124] = new ModelRendererTurbo(this, 1001, 41, this.textureX, this.textureY);
/*  171 */     this.gunModel[125] = new ModelRendererTurbo(this, 97, 153, this.textureX, this.textureY);
/*  172 */     this.gunModel[126] = new ModelRendererTurbo(this, 137, 153, this.textureX, this.textureY);
/*  173 */     this.gunModel[127] = new ModelRendererTurbo(this, 161, 153, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 153, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 153, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 681, 153, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 721, 153, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 761, 153, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 801, 153, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 161, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 529, 161, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 857, 161, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 153, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 161, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 1001, 137, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 585, 161, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 617, 161, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 913, 161, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 145, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 521, 145, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 937, 161, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 169, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 169, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 561, 145, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 169, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 665, 145, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 153, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 665, 169, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 153, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 153, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 689, 169, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 169, this.textureX, this.textureY);
/*  206 */     this.gunModel[' '] = new ModelRendererTurbo(this, 761, 169, this.textureX, this.textureY);
/*  207 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 233, 153, this.textureX, this.textureY);
/*  208 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 273, 153, this.textureX, this.textureY);
/*  209 */     this.gunModel['£'] = new ModelRendererTurbo(this, 705, 153, this.textureX, this.textureY);
/*  210 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 833, 169, this.textureX, this.textureY);
/*  211 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 977, 169, this.textureX, this.textureY);
/*  212 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 41, 177, this.textureX, this.textureY);
/*  213 */     this.gunModel['§'] = new ModelRendererTurbo(this, 161, 177, this.textureX, this.textureY);
/*  214 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 441, 177, this.textureX, this.textureY);
/*  215 */     this.gunModel['©'] = new ModelRendererTurbo(this, 465, 177, this.textureX, this.textureY);
/*  216 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 713, 17, this.textureX, this.textureY);
/*  217 */     this.gunModel['«'] = new ModelRendererTurbo(this, 793, 17, this.textureX, this.textureY);
/*  218 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 801, 17, this.textureX, this.textureY);
/*  219 */     this.gunModel['­'] = new ModelRendererTurbo(this, 825, 17, this.textureX, this.textureY);
/*  220 */     this.gunModel['®'] = new ModelRendererTurbo(this, 841, 17, this.textureX, this.textureY);
/*  221 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 929, 17, this.textureX, this.textureY);
/*  222 */     this.gunModel['°'] = new ModelRendererTurbo(this, 985, 17, this.textureX, this.textureY);
/*  223 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  224 */     this.gunModel['²'] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*  225 */     this.gunModel['³'] = new ModelRendererTurbo(this, 841, 41, this.textureX, this.textureY);
/*  226 */     this.gunModel['´'] = new ModelRendererTurbo(this, 553, 177, this.textureX, this.textureY);
/*  227 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  228 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*  229 */     this.gunModel['·'] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  230 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*  231 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*  232 */     this.gunModel['º'] = new ModelRendererTurbo(this, 513, 25, this.textureX, this.textureY);
/*  233 */     this.gunModel['»'] = new ModelRendererTurbo(this, 529, 25, this.textureX, this.textureY);
/*  234 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 697, 25, this.textureX, this.textureY);
/*  235 */     this.gunModel['½'] = new ModelRendererTurbo(this, 689, 41, this.textureX, this.textureY);
/*  236 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*  237 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 721, 17, this.textureX, this.textureY);
/*  238 */     this.gunModel['À'] = new ModelRendererTurbo(this, 841, 25, this.textureX, this.textureY);
/*  239 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 785, 17, this.textureX, this.textureY);
/*  240 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/*  241 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 681, 33, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 753, 33, this.textureX, this.textureY);
/*  243 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 953, 33, this.textureX, this.textureY);
/*  244 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 1001, 33, this.textureX, this.textureY);
/*  245 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/*  246 */     this.gunModel['È'] = new ModelRendererTurbo(this, 761, 41, this.textureX, this.textureY);
/*  247 */     this.gunModel['É'] = new ModelRendererTurbo(this, 513, 65, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 545, 65, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 769, 25, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 929, 25, this.textureX, this.textureY);
/*  251 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 737, 17, this.textureX, this.textureY);
/*  252 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 753, 17, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 985, 25, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 577, 65, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/*  259 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 817, 17, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  261 */     this.gunModel['×'] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 609, 65, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  265 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 1001, 57, this.textureX, this.textureY);
/*  268 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 673, 73, this.textureX, this.textureY);
/*  269 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 753, 89, this.textureX, this.textureY);
/*  270 */     this.gunModel['à'] = new ModelRendererTurbo(this, 777, 89, this.textureX, this.textureY);
/*  271 */     this.gunModel['á'] = new ModelRendererTurbo(this, 801, 89, this.textureX, this.textureY);
/*  272 */     this.gunModel['â'] = new ModelRendererTurbo(this, 161, 97, this.textureX, this.textureY);
/*  273 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 657, 33, this.textureX, this.textureY);
/*  274 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  275 */     this.gunModel['å'] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*  276 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 825, 33, this.textureX, this.textureY);
/*  277 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 985, 33, this.textureX, this.textureY);
/*  278 */     this.gunModel['è'] = new ModelRendererTurbo(this, 721, 41, this.textureX, this.textureY);
/*  279 */     this.gunModel['é'] = new ModelRendererTurbo(this, 825, 41, this.textureX, this.textureY);
/*  280 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 961, 41, this.textureX, this.textureY);
/*  281 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 985, 41, this.textureX, this.textureY);
/*  282 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 1001, 41, this.textureX, this.textureY);
/*  283 */     this.gunModel['í'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  284 */     this.gunModel['î'] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  285 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  286 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/*  287 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  288 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  289 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 513, 73, this.textureX, this.textureY);
/*  290 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  291 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 681, 81, this.textureX, this.textureY);
/*  292 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 633, 177, this.textureX, this.textureY);
/*  293 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 857, 177, this.textureX, this.textureY);
/*  294 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 889, 177, this.textureX, this.textureY);
/*  295 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  296 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 65, 185, this.textureX, this.textureY);
/*  297 */     this.gunModel['û'] = new ModelRendererTurbo(this, 185, 185, this.textureX, this.textureY);
/*  298 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 697, 185, this.textureX, this.textureY);
/*  299 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 521, 89, this.textureX, this.textureY);
/*  300 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 993, 41, this.textureX, this.textureY);
/*  301 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 665, 89, this.textureX, this.textureY);
/*  303 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 825, 89, this.textureX, this.textureY);
/*  305 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 641, 33, this.textureX, this.textureY);
/*  307 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1009, 105, this.textureX, this.textureY);
/*  309 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 977, 137, this.textureX, this.textureY);
/*  311 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 793, 33, this.textureX, this.textureY);
/*  313 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*  314 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 257, 97, this.textureX, this.textureY);
/*  315 */     this.gunModel['č'] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/*  317 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 721, 25, this.textureX, this.textureY);
/*  318 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  319 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 705, 33, this.textureX, this.textureY);
/*  321 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 1017, 41, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/*  323 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  324 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  325 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 1, 217, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 625, 209, this.textureX, this.textureY);
/*  327 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 177, 217, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 737, 217, this.textureX, this.textureY);
/*  329 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 65, 201, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 145, 201, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 329, 209, this.textureX, this.textureY);
/*  333 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 353, 209, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 209, 153, this.textureX, this.textureY);
/*  335 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 249, 153, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 689, 169, this.textureX, this.textureY);
/*  337 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 721, 153, this.textureX, this.textureY);
/*  339 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 25, 185, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 185, 201, this.textureX, this.textureY);
/*  341 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 705, 201, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  343 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 1001, 177, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/*  345 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 89, 209, this.textureX, this.textureY);
/*  346 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 833, 193, this.textureX, this.textureY);
/*  347 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 897, 193, this.textureX, this.textureY);
/*  348 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 161, 201, this.textureX, this.textureY);
/*  349 */     this.gunModel['į'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  350 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 161, 161, this.textureX, this.textureY);
/*  351 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 313, 161, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 681, 161, this.textureX, this.textureY);
/*  353 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 857, 161, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 977, 161, this.textureX, this.textureY);
/*  355 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 313, 169, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 337, 169, this.textureX, this.textureY);
/*  357 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 457, 169, this.textureX, this.textureY);
/*  358 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 761, 169, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 857, 169, this.textureX, this.textureY);
/*  360 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 977, 169, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 193, 153, this.textureX, this.textureY);
/*  362 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 233, 153, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 273, 153, this.textureX, this.textureY);
/*  364 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 441, 153, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 889, 209, this.textureX, this.textureY);
/*  366 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 849, 225, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  368 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 177, 233, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 353, 233, this.textureX, this.textureY);
/*  370 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 529, 233, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 697, 233, this.textureX, this.textureY);
/*  372 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/*  373 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 913, 217, this.textureX, this.textureY);
/*  374 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 89, 241, this.textureX, this.textureY);
/*  375 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 177, 241, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 993, 209, this.textureX, this.textureY);
/*  377 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 561, 209, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 345, 209, this.textureX, this.textureY);
/*  379 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 593, 217, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 793, 209, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 265, 241, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 353, 241, this.textureX, this.textureY);
/*  383 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 441, 241, this.textureX, this.textureY);
/*  384 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 377, 217, this.textureX, this.textureY);
/*  385 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 809, 209, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 825, 209, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 281, 217, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 1009, 209, this.textureX, this.textureY);
/*  389 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 529, 241, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 617, 241, this.textureX, this.textureY);
/*  391 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 785, 233, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 817, 233, this.textureX, this.textureY);
/*  393 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 841, 241, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 865, 241, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 617, 249, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 873, 249, this.textureX, this.textureY);
/*  397 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  398 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 905, 105, this.textureX, this.textureY);
/*  399 */     this.gunModel['š'] = new ModelRendererTurbo(this, 929, 177, this.textureX, this.textureY);
/*  400 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 121, 257, this.textureX, this.textureY);
/*  401 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 241, 257, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 361, 257, this.textureX, this.textureY);
/*  403 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 481, 257, this.textureX, this.textureY);
/*  404 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 25, 209, this.textureX, this.textureY);
/*  405 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 57, 209, this.textureX, this.textureY);
/*  406 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 713, 249, this.textureX, this.textureY);
/*  407 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 777, 249, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 577, 257, this.textureX, this.textureY);
/*  409 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 985, 241, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 753, 249, this.textureX, this.textureY);
/*  411 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 641, 257, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 841, 257, this.textureX, this.textureY);
/*  413 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 817, 249, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 873, 257, this.textureX, this.textureY);
/*  415 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 617, 257, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 929, 257, this.textureX, this.textureY);
/*  417 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 961, 257, this.textureX, this.textureY);
/*  419 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 209, 249, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 25, 265, this.textureX, this.textureY);
/*  421 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 89, 265, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 153, 265, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 241, 265, this.textureX, this.textureY);
/*  424 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 305, 265, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 681, 257, this.textureX, this.textureY);
/*  426 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 705, 257, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 905, 257, this.textureX, this.textureY);
/*  428 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 993, 257, this.textureX, this.textureY);
/*  429 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 857, 201, this.textureX, this.textureY);
/*  430 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 57, 265, this.textureX, this.textureY);
/*  431 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 121, 265, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 273, 265, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 369, 265, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 65, 265, this.textureX, this.textureY);
/*  435 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 625, 257, this.textureX, this.textureY);
/*  436 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 337, 265, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 185, 265, this.textureX, this.textureY);
/*  438 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 433, 265, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 769, 249, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 473, 265, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 513, 265, this.textureX, this.textureY);
/*  442 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 545, 265, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 209, 281, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 465, 281, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 305, 201, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 513, 281, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 553, 281, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 689, 273, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 593, 281, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 601, 217, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 841, 217, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 857, 217, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 873, 217, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 329, 225, this.textureX, this.textureY);
/*  455 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 177, 249, this.textureX, this.textureY);
/*  456 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 441, 249, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 841, 209, this.textureX, this.textureY);
/*  458 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 809, 233, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 649, 257, this.textureX, this.textureY);
/*  460 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 353, 225, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 777, 233, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 209, 249, this.textureX, this.textureY);
/*  463 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 81, 241, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 169, 241, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 257, 241, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 241, 249, this.textureX, this.textureY);
/*  467 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 473, 249, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 409, 265, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 321, 217, this.textureX, this.textureY);
/*  470 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 841, 257, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 873, 257, this.textureX, this.textureY);
/*  472 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 345, 241, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 505, 249, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 1009, 249, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 921, 257, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 537, 281, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 577, 281, this.textureX, this.textureY);
/*      */     
/*  479 */     this.gunModel[0].addBox(53.0F, -18.0F, -6.0F, 86, 5, 13, 0.0F);
/*  480 */     this.gunModel[0].setRotationPoint(-58.0F, -22.0F, 0.0F);
/*      */     
/*  482 */     this.gunModel[1].addShapeBox(53.0F, -18.0F, -6.0F, 1, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  483 */     this.gunModel[1].setRotationPoint(28.0F, -22.0F, 0.0F);
/*      */     
/*  485 */     this.gunModel[2].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  486 */     this.gunModel[2].setRotationPoint(28.0F, -17.0F, 0.0F);
/*      */     
/*  488 */     this.gunModel[3].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  489 */     this.gunModel[3].setRotationPoint(27.0F, -15.0F, 0.0F);
/*      */     
/*  491 */     this.gunModel[4].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  492 */     this.gunModel[4].setRotationPoint(24.0F, -15.0F, 0.0F);
/*      */     
/*  494 */     this.gunModel[5].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  495 */     this.gunModel[5].setRotationPoint(23.0F, -15.0F, 0.0F);
/*      */     
/*  497 */     this.gunModel[6].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  498 */     this.gunModel[6].setRotationPoint(21.0F, -14.0F, 0.0F);
/*      */     
/*  500 */     this.gunModel[7].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  501 */     this.gunModel[7].setRotationPoint(20.0F, -13.0F, 0.0F);
/*      */     
/*  503 */     this.gunModel[8].addShapeBox(53.0F, -18.0F, -6.0F, 86, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  504 */     this.gunModel[8].setRotationPoint(-58.0F, -17.0F, 0.0F);
/*      */     
/*  506 */     this.gunModel[9].addShapeBox(53.0F, -18.0F, -6.0F, 80, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  507 */     this.gunModel[9].setRotationPoint(-58.0F, -15.0F, 0.0F);
/*      */     
/*  509 */     this.gunModel[10].addShapeBox(53.0F, -18.0F, -6.0F, 78, 1, 13, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  510 */     this.gunModel[10].setRotationPoint(-57.0F, -14.0F, 0.0F);
/*      */     
/*  512 */     this.gunModel[11].addShapeBox(53.0F, -18.0F, -6.0F, 78, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  513 */     this.gunModel[11].setRotationPoint(-58.0F, -13.0F, 0.0F);
/*      */     
/*  515 */     this.gunModel[12].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  516 */     this.gunModel[12].setRotationPoint(18.5F, -11.0F, 0.0F);
/*      */     
/*  518 */     this.gunModel[13].addShapeBox(53.0F, -18.0F, -6.0F, 1, 10, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  519 */     this.gunModel[13].setRotationPoint(18.5F, -9.0F, 0.0F);
/*      */     
/*  521 */     this.gunModel[14].addShapeBox(53.0F, -18.0F, -6.0F, 33, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 9.0F, 0.0F);
/*  522 */     this.gunModel[14].setRotationPoint(-15.0F, -9.0F, 0.0F);
/*      */     
/*  524 */     this.gunModel[15].addShapeBox(53.0F, -18.0F, -6.0F, 76, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  525 */     this.gunModel[15].setRotationPoint(-57.5F, -11.0F, 0.0F);
/*      */     
/*  527 */     this.gunModel[16].addShapeBox(53.0F, -18.0F, -6.0F, 33, 2, 15, 0.0F, 0.0F, -6.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, 5.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 5.5F, 0.0F);
/*  528 */     this.gunModel[16].setRotationPoint(-15.0F, 4.0F, -1.0F);
/*      */     
/*  530 */     this.gunModel[17].addShapeBox(53.0F, -18.0F, -6.0F, 33, 1, 15, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/*  531 */     this.gunModel[17].setRotationPoint(-15.0F, 5.0F, -1.0F);
/*      */     
/*  533 */     this.gunModel[18].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  534 */     this.gunModel[18].setRotationPoint(-17.0F, -1.0F, 0.0F);
/*      */     
/*  536 */     this.gunModel[19].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  537 */     this.gunModel[19].setRotationPoint(-19.0F, -2.0F, 0.0F);
/*      */     
/*  539 */     this.gunModel[20].addShapeBox(53.0F, -18.0F, -6.0F, 43, 7, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  540 */     this.gunModel[20].setRotationPoint(-58.0F, -9.0F, 0.0F);
/*      */     
/*  542 */     this.gunModel[21].addShapeBox(53.0F, -18.0F, -6.0F, 19, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  543 */     this.gunModel[21].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/*  545 */     this.gunModel[22].addBox(53.0F, -18.0F, -6.0F, 19, 9, 13, 0.0F);
/*  546 */     this.gunModel[22].setRotationPoint(-77.0F, -22.0F, 0.0F);
/*      */     
/*  548 */     this.gunModel[23].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  549 */     this.gunModel[23].setRotationPoint(-17.0F, 9.0F, 2.0F);
/*      */     
/*  551 */     this.gunModel[24].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  552 */     this.gunModel[24].setRotationPoint(-19.0F, 11.0F, 2.0F);
/*      */     
/*  554 */     this.gunModel[25].addShapeBox(53.0F, -18.0F, -6.0F, 25, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  555 */     this.gunModel[25].setRotationPoint(-44.0F, 11.0F, 2.0F);
/*      */     
/*  557 */     this.gunModel[26].addShapeBox(53.0F, -18.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  558 */     this.gunModel[26].setRotationPoint(-42.0F, 9.0F, 2.0F);
/*      */     
/*  560 */     this.gunModel[27].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  561 */     this.gunModel[27].setRotationPoint(-41.0F, 11.0F, 2.0F);
/*      */     
/*  563 */     this.gunModel[28].addShapeBox(53.0F, -18.0F, -6.0F, 2, 11, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  564 */     this.gunModel[28].setRotationPoint(-44.0F, 1.0F, 2.0F);
/*      */     
/*  566 */     this.gunModel[29].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  567 */     this.gunModel[29].setRotationPoint(-42.0F, -1.0F, 2.0F);
/*      */     
/*  569 */     this.gunModel[30].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  570 */     this.gunModel[30].setRotationPoint(-44.0F, -1.0F, 2.0F);
/*      */     
/*  572 */     this.gunModel[31].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  573 */     this.gunModel[31].setRotationPoint(-45.0F, -1.0F, 2.0F);
/*      */     
/*  575 */     this.gunModel[32].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  576 */     this.gunModel[32].setRotationPoint(-47.0F, -1.0F, 2.0F);
/*      */     
/*  578 */     this.gunModel[33].addShapeBox(53.0F, -18.0F, -6.0F, 9, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  579 */     this.gunModel[33].setRotationPoint(-36.0F, -2.0F, 5.0F);
/*      */     
/*  581 */     this.gunModel[34].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  582 */     this.gunModel[34].setRotationPoint(-35.0F, -1.0F, 5.0F);
/*      */     
/*  584 */     this.gunModel[35].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  585 */     this.gunModel[35].setRotationPoint(-35.0F, 1.0F, 5.0F);
/*      */     
/*  587 */     this.gunModel[36].addShapeBox(53.0F, -18.0F, -6.0F, 4, 3, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  588 */     this.gunModel[36].setRotationPoint(-35.0F, 3.0F, 5.0F);
/*      */     
/*  590 */     this.gunModel[37].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  591 */     this.gunModel[37].setRotationPoint(-35.0F, 6.0F, 5.0F);
/*      */     
/*  593 */     this.gunModel[38].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  594 */     this.gunModel[38].setRotationPoint(-34.0F, 8.0F, 5.0F);
/*      */     
/*  596 */     this.gunModel[39].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  597 */     this.gunModel[39].setRotationPoint(-33.0F, 10.0F, 5.0F);
/*      */     
/*  599 */     this.gunModel[40].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F);
/*  600 */     this.gunModel[40].setRotationPoint(18.5F, 1.0F, 0.0F);
/*      */     
/*  602 */     this.gunModel[41].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  603 */     this.gunModel[41].setRotationPoint(19.5F, 3.0F, 0.0F);
/*      */     
/*  605 */     this.gunModel[42].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  606 */     this.gunModel[42].setRotationPoint(18.0F, 1.0F, 0.0F);
/*      */     
/*  608 */     this.gunModel[43].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  609 */     this.gunModel[43].setRotationPoint(18.0F, 3.0F, 0.0F);
/*      */     
/*  611 */     this.gunModel[44].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F);
/*  612 */     this.gunModel[44].setRotationPoint(18.0F, 5.0F, -1.0F);
/*      */     
/*  614 */     this.gunModel[45].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.5F, 1.0F);
/*  615 */     this.gunModel[45].setRotationPoint(18.0F, 4.0F, 0.0F);
/*      */     
/*  617 */     this.gunModel[46].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.2F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.0F, 0.1F, 0.2F);
/*  618 */     this.gunModel[46].setRotationPoint(19.0F, 4.0F, 0.0F);
/*      */     
/*  620 */     this.gunModel[47].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -1.0F, -2.0F, 0.5F, -1.0F, -2.0F, 0.0F, 0.0F, 0.25F);
/*  621 */     this.gunModel[47].setRotationPoint(19.0F, 4.5F, 0.0F);
/*      */     
/*  623 */     this.gunModel[48].addBox(53.0F, -18.0F, -6.0F, 52, 11, 17, 0.0F);
/*  624 */     this.gunModel[48].setRotationPoint(-77.0F, -34.0F, -2.0F);
/*      */     
/*  626 */     this.gunModel[49].addShapeBox(53.0F, -18.0F, -6.0F, 169, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  627 */     this.gunModel[49].setRotationPoint(-77.0F, -37.0F, -2.0F);
/*      */     
/*  629 */     this.gunModel[50].addShapeBox(53.0F, -18.0F, -6.0F, 108, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  630 */     this.gunModel[50].setRotationPoint(-77.0F, -23.0F, -2.0F);
/*      */     
/*  632 */     this.gunModel[51].addShapeBox(53.0F, -18.0F, -6.0F, 169, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  633 */     this.gunModel[51].setRotationPoint(-77.0F, -39.0F, -1.0F);
/*      */     
/*  635 */     this.gunModel[52].addShapeBox(53.0F, -18.0F, -6.0F, 71, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  636 */     this.gunModel[52].setRotationPoint(33.0F, -23.0F, -1.5F);
/*      */     
/*  638 */     this.gunModel[53].addShapeBox(53.0F, -18.0F, -6.0F, 71, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  639 */     this.gunModel[53].setRotationPoint(33.0F, -18.5F, 3.0F);
/*      */     
/*  641 */     this.gunModel[54].addShapeBox(53.0F, -18.0F, -6.0F, 71, 1, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  642 */     this.gunModel[54].setRotationPoint(33.0F, -16.5F, 1.5F);
/*      */     
/*  644 */     this.gunModel[55].addShapeBox(53.0F, -18.0F, -6.0F, 71, 1, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  645 */     this.gunModel[55].setRotationPoint(33.0F, -20.0F, 1.0F);
/*      */     
/*  647 */     this.gunModel[56].addShapeBox(53.0F, -18.0F, -6.0F, 71, 2, 14, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  648 */     this.gunModel[56].setRotationPoint(33.0F, -22.0F, -0.5F);
/*      */     
/*  650 */     this.gunModel[57].addShapeBox(53.0F, -18.0F, -6.0F, 71, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  651 */     this.gunModel[57].setRotationPoint(33.0F, -15.5F, 1.5F);
/*      */     
/*  653 */     this.gunModel[58].addShapeBox(53.0F, -18.0F, -6.0F, 61, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  654 */     this.gunModel[58].setRotationPoint(-77.0F, -47.0F, 1.5F);
/*      */     
/*  656 */     this.gunModel[59].addShapeBox(53.0F, -18.0F, -6.0F, 32, 7, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  657 */     this.gunModel[59].setRotationPoint(60.0F, -47.0F, 1.5F);
/*      */     
/*  659 */     this.gunModel[60].addShapeBox(53.0F, -18.0F, -6.0F, 3, 7, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[60].setRotationPoint(56.0F, -46.5F, 1.5F);
/*      */     
/*  662 */     this.gunModel[61].addShapeBox(53.0F, -18.0F, -6.0F, 72, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  663 */     this.gunModel[61].setRotationPoint(-16.0F, -47.0F, 1.5F);
/*      */     
/*  665 */     this.gunModel[62].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  666 */     this.gunModel[62].setRotationPoint(-16.0F, -44.5F, 1.5F);
/*      */     
/*  668 */     this.gunModel[63].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  669 */     this.gunModel[63].setRotationPoint(-16.0F, -40.5F, 1.5F);
/*      */     
/*  671 */     this.gunModel[64].addShapeBox(53.0F, -18.0F, -6.0F, 169, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  672 */     this.gunModel[64].setRotationPoint(-77.0F, -39.5F, 1.5F);
/*      */     
/*  674 */     this.gunModel[65].addShapeBox(53.0F, -18.0F, -6.0F, 66, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  675 */     this.gunModel[65].setRotationPoint(-13.0F, -40.5F, 1.5F);
/*      */     
/*  677 */     this.gunModel[66].addShapeBox(53.0F, -18.0F, -6.0F, 73, 5, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  678 */     this.gunModel[66].setRotationPoint(-16.25F, -44.5F, 3.0F);
/*      */     
/*  680 */     this.gunModel[67].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  681 */     this.gunModel[67].setRotationPoint(55.0F, -40.5F, 1.5F);
/*      */     
/*  683 */     this.gunModel[68].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  684 */     this.gunModel[68].setRotationPoint(55.0F, -44.5F, 1.5F);
/*      */     
/*  686 */     this.gunModel[69].addShapeBox(53.0F, -18.0F, -6.0F, 66, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  687 */     this.gunModel[69].setRotationPoint(-13.0F, -44.5F, 1.5F);
/*      */     
/*  689 */     this.gunModel[70].addShapeBox(53.0F, -18.0F, -6.0F, 169, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  690 */     this.gunModel[70].setRotationPoint(-77.0F, -49.5F, 2.5F);
/*      */     
/*  692 */     this.gunModel[71].addShapeBox(53.0F, -18.0F, -6.0F, 169, 1, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  693 */     this.gunModel[71].setRotationPoint(-77.0F, -50.0F, 1.0F);
/*      */     
/*  695 */     this.gunModel[72].addShapeBox(53.0F, -18.0F, -6.0F, 169, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  696 */     this.gunModel[72].setRotationPoint(-77.0F, -51.0F, 1.0F);
/*      */     
/*  698 */     this.gunModel[73].addShapeBox(53.0F, -18.0F, -6.0F, 169, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  699 */     this.gunModel[73].setRotationPoint(-77.0F, -47.5F, 10.5F);
/*      */     
/*  701 */     this.gunModel[74].addShapeBox(53.0F, -18.0F, -6.0F, 169, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  702 */     this.gunModel[74].setRotationPoint(-77.0F, -47.5F, 1.5F);
/*      */     
/*  704 */     this.gunModel[75].addShapeBox(53.0F, -18.0F, -6.0F, 88, 7, 7, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F);
/*  705 */     this.gunModel[75].setRotationPoint(19.0F, -31.0F, 3.0F);
/*      */     
/*  707 */     this.gunModel[76].addShapeBox(53.0F, -18.0F, -6.0F, 2, 7, 7, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 1.0F, 1.0F);
/*  708 */     this.gunModel[76].setRotationPoint(107.0F, -31.0F, 3.0F);
/*      */     
/*  710 */     this.gunModel[77].addShapeBox(53.0F, -18.0F, -6.0F, 2, 7, 7, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.25F, 0.25F);
/*  711 */     this.gunModel[77].setRotationPoint(110.0F, -31.0F, 3.0F);
/*      */     
/*  713 */     this.gunModel[78].addShapeBox(53.0F, -18.0F, -6.0F, 3, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F);
/*  714 */     this.gunModel[78].setRotationPoint(112.0F, -31.0F, 3.0F);
/*      */     
/*  716 */     this.gunModel[79].addShapeBox(53.0F, -18.0F, -6.0F, 1, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F);
/*  717 */     this.gunModel[79].setRotationPoint(115.0F, -31.0F, 3.0F);
/*      */     
/*  719 */     this.gunModel[80].addShapeBox(53.0F, -18.0F, -6.0F, 6, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  720 */     this.gunModel[80].setRotationPoint(116.0F, -32.0F, 2.0F);
/*      */     
/*  722 */     this.gunModel[81].addShapeBox(53.0F, -18.0F, -6.0F, 8, 6, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  723 */     this.gunModel[81].setRotationPoint(122.0F, -29.0F, 2.0F);
/*      */     
/*  725 */     this.gunModel[82].addShapeBox(53.0F, -18.0F, -6.0F, 8, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  726 */     this.gunModel[82].setRotationPoint(122.0F, -32.0F, 2.0F);
/*      */     
/*  728 */     this.gunModel[83].addShapeBox(53.0F, -18.0F, -6.0F, 8, 6, 4, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  729 */     this.gunModel[83].setRotationPoint(122.0F, -29.0F, 7.0F);
/*      */     
/*  731 */     this.gunModel[84].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  732 */     this.gunModel[84].setRotationPoint(68.0F, -45.0F, 1.0F);
/*      */     
/*  734 */     this.gunModel[85].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  735 */     this.gunModel[85].setRotationPoint(68.0F, -43.0F, 1.0F);
/*      */     
/*  737 */     this.gunModel[86].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  738 */     this.gunModel[86].setRotationPoint(68.0F, -44.0F, 1.0F);
/*      */     
/*  740 */     this.gunModel[87].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  741 */     this.gunModel[87].setRotationPoint(75.5F, -45.25F, 14.5F);
/*      */     
/*  743 */     this.gunModel[88].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  744 */     this.gunModel[88].setRotationPoint(75.5F, -45.0F, 13.5F);
/*      */     
/*  746 */     this.gunModel[89].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  747 */     this.gunModel[89].setRotationPoint(75.5F, -42.0F, 12.0F);
/*      */     
/*  749 */     this.gunModel[90].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  750 */     this.gunModel[90].setRotationPoint(75.5F, -40.5F, 11.5F);
/*      */     
/*  752 */     this.gunModel[91].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  753 */     this.gunModel[91].setRotationPoint(75.5F, -45.25F, 12.75F);
/*      */     
/*  755 */     this.gunModel[92].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F);
/*  756 */     this.gunModel[92].setRotationPoint(75.5F, -46.5F, 10.0F);
/*      */     
/*  758 */     this.gunModel[93].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  759 */     this.gunModel[93].setRotationPoint(75.5F, -42.0F, 10.25F);
/*      */     
/*  761 */     this.gunModel[94].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  762 */     this.gunModel[94].setRotationPoint(75.5F, -45.25F, 11.5F);
/*      */     
/*  764 */     this.gunModel[95].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/*  765 */     this.gunModel[95].setRotationPoint(75.5F, -40.5F, -0.5F);
/*      */     
/*  767 */     this.gunModel[96].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  768 */     this.gunModel[96].setRotationPoint(75.5F, -42.0F, -2.0F);
/*      */     
/*  770 */     this.gunModel[97].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  771 */     this.gunModel[97].setRotationPoint(75.5F, -45.0F, -2.5F);
/*      */     
/*  773 */     this.gunModel[98].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  774 */     this.gunModel[98].setRotationPoint(75.5F, -45.25F, -0.75F);
/*      */     
/*  776 */     this.gunModel[99].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/*  777 */     this.gunModel[99].setRotationPoint(75.5F, -45.25F, -2.5F);
/*      */     
/*  779 */     this.gunModel[100].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/*  780 */     this.gunModel[100].setRotationPoint(75.5F, -46.5F, -1.0F);
/*      */     
/*  782 */     this.gunModel[101].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  783 */     this.gunModel[101].setRotationPoint(75.5F, -42.0F, -0.25F);
/*      */     
/*  785 */     this.gunModel[102].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  786 */     this.gunModel[102].setRotationPoint(75.5F, -45.25F, 0.5F);
/*      */     
/*  788 */     this.gunModel[103].addShapeBox(53.0F, -18.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  789 */     this.gunModel[103].setRotationPoint(-44.0F, -16.0F, -1.5F);
/*      */     
/*  791 */     this.gunModel[104].addShapeBox(53.0F, -18.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  792 */     this.gunModel[104].setRotationPoint(-48.0F, -16.0F, -1.5F);
/*      */     
/*  794 */     this.gunModel[105].addShapeBox(53.0F, -18.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  795 */     this.gunModel[105].setRotationPoint(-46.0F, -16.0F, -1.5F);
/*      */     
/*  797 */     this.gunModel[106].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 16, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  798 */     this.gunModel[106].setRotationPoint(-46.0F, -17.0F, -1.5F);
/*      */     
/*  800 */     this.gunModel[107].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  801 */     this.gunModel[107].setRotationPoint(-46.0F, -10.0F, -1.5F);
/*      */     
/*  803 */     this.gunModel[108].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  804 */     this.gunModel[108].setRotationPoint(-36.5F, -7.5F, -0.5F);
/*      */     
/*  806 */     this.gunModel[109].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  807 */     this.gunModel[109].setRotationPoint(-36.5F, -5.5F, -0.5F);
/*      */     
/*  809 */     this.gunModel[110].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  810 */     this.gunModel[110].setRotationPoint(-36.5F, -6.5F, -0.5F);
/*      */     
/*  812 */     this.gunModel[111].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  813 */     this.gunModel[111].setRotationPoint(-26.0F, -14.5F, 1.5F);
/*      */     
/*  815 */     this.gunModel[112].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  816 */     this.gunModel[112].setRotationPoint(-26.0F, -12.5F, 1.5F);
/*      */     
/*  818 */     this.gunModel[113].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  819 */     this.gunModel[113].setRotationPoint(-26.0F, -13.5F, 1.5F);
/*      */     
/*  821 */     this.gunModel[114].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  822 */     this.gunModel[114].setRotationPoint(-52.5F, -20.0F, -0.5F);
/*      */     
/*  824 */     this.gunModel[115].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  825 */     this.gunModel[115].setRotationPoint(-52.5F, -18.0F, -0.5F);
/*      */     
/*  827 */     this.gunModel[116].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  828 */     this.gunModel[116].setRotationPoint(-52.5F, -19.0F, -0.5F);
/*      */     
/*  830 */     this.gunModel[117].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  831 */     this.gunModel[117].setRotationPoint(-47.0F, -2.0F, 0.0F);
/*      */     
/*  833 */     this.gunModel[118].addShapeBox(53.0F, -18.0F, -6.0F, 11, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  834 */     this.gunModel[118].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/*  836 */     this.gunModel[119].addShapeBox(53.0F, -18.0F, -6.0F, 11, 1, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  837 */     this.gunModel[119].setRotationPoint(-58.0F, -2.5F, 2.0F);
/*      */     
/*  839 */     this.gunModel[120].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  840 */     this.gunModel[120].setRotationPoint(-45.0F, -0.5F, 0.0F);
/*      */     
/*  842 */     this.gunModel[121].addShapeBox(53.0F, -18.0F, -6.0F, 1, 13, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  843 */     this.gunModel[121].setRotationPoint(-45.0F, 1.0F, 0.0F);
/*      */     
/*  845 */     this.gunModel[122].addShapeBox(53.0F, -18.0F, -6.0F, 13, 15, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  846 */     this.gunModel[122].setRotationPoint(-58.0F, -0.5F, 0.0F);
/*      */     
/*  848 */     this.gunModel[123].addShapeBox(53.0F, -18.0F, -6.0F, 3, 5, 13, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  849 */     this.gunModel[123].setRotationPoint(-61.0F, -1.0F, 0.0F);
/*      */     
/*  851 */     this.gunModel[124].addShapeBox(53.0F, -18.0F, -6.0F, 1, 5, 9, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/*  852 */     this.gunModel[124].setRotationPoint(-62.0F, -1.0F, 2.0F);
/*      */     
/*  854 */     this.gunModel[125].addShapeBox(53.0F, -18.0F, -6.0F, 3, 35, 13, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 24.0F, 0.0F, -2.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -2.0F);
/*  855 */     this.gunModel[125].setRotationPoint(-61.0F, 4.5F, 0.0F);
/*      */     
/*  857 */     this.gunModel[126].addShapeBox(53.0F, -18.0F, -6.0F, 1, 35, 9, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 24.0F, 0.0F, -3.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -3.0F);
/*  858 */     this.gunModel[126].setRotationPoint(-62.0F, 4.5F, 2.0F);
/*      */     
/*  860 */     this.gunModel[127].addShapeBox(53.0F, -18.0F, -6.0F, 7, 10, 13, 0.0F, -7.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -7.0F, 0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/*  861 */     this.gunModel[127].setRotationPoint(-65.0F, 4.5F, 0.0F);
/*      */     
/*  863 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 3, 24, 13, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, -10.0F, 0.0F, -2.0F, -10.0F, 0.0F, -2.0F, 11.0F, 0.0F, 0.0F);
/*  864 */     this.gunModel[''].setRotationPoint(-51.5F, 14.5F, 0.0F);
/*      */     
/*  866 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 3, 24, 13, 0.0F, -2.4F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F);
/*  867 */     this.gunModel[''].setRotationPoint(-67.5F, 14.5F, 0.0F);
/*      */     
/*  869 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  870 */     this.gunModel[''].setRotationPoint(-62.5F, 38.5F, 0.0F);
/*      */     
/*  872 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F);
/*  873 */     this.gunModel[''].setRotationPoint(-62.5F, 39.5F, 0.0F);
/*      */     
/*  875 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  876 */     this.gunModel[''].setRotationPoint(-60.5F, 41.5F, 0.0F);
/*      */     
/*  878 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  879 */     this.gunModel[''].setRotationPoint(-60.5F, 43.5F, 0.0F);
/*      */     
/*  881 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 21, 2, 13, 0.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -4.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.5F, 0.0F);
/*  882 */     this.gunModel[''].setRotationPoint(-81.5F, 43.5F, 0.0F);
/*      */     
/*  884 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 20, 2, 13, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/*  885 */     this.gunModel[''].setRotationPoint(-80.5F, 41.5F, 0.0F);
/*      */     
/*  887 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 20, 2, 13, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  888 */     this.gunModel[''].setRotationPoint(-80.5F, 39.5F, 0.0F);
/*      */     
/*  890 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 18, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  891 */     this.gunModel[''].setRotationPoint(-80.5F, 38.5F, 0.0F);
/*      */     
/*  893 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  894 */     this.gunModel[''].setRotationPoint(-82.5F, 39.5F, 0.0F);
/*      */     
/*  896 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 3, 2, 13, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, -2.0F);
/*  897 */     this.gunModel[''].setRotationPoint(-85.0F, 39.5F, 0.0F);
/*      */     
/*  899 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.5F, -3.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -3.0F);
/*  900 */     this.gunModel[''].setRotationPoint(-86.0F, 39.5F, 2.0F);
/*      */     
/*  902 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 13, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  903 */     this.gunModel[''].setRotationPoint(-81.5F, 38.5F, 0.0F);
/*      */     
/*  905 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  906 */     this.gunModel[''].setRotationPoint(-52.5F, 21.0F, 2.0F);
/*      */     
/*  908 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  909 */     this.gunModel[''].setRotationPoint(-52.5F, 23.0F, 2.0F);
/*      */     
/*  911 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 6, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  912 */     this.gunModel[''].setRotationPoint(-52.5F, 25.0F, 2.0F);
/*      */     
/*  914 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  915 */     this.gunModel[''].setRotationPoint(-52.5F, 26.0F, 2.0F);
/*      */     
/*  917 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  918 */     this.gunModel[''].setRotationPoint(-49.5F, 20.0F, 2.0F);
/*      */     
/*  920 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 11, 4, 14, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  921 */     this.gunModel[''].setRotationPoint(-62.0F, 8.5F, -0.5F);
/*      */     
/*  923 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 11, 21, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F);
/*  924 */     this.gunModel[''].setRotationPoint(-62.0F, 12.5F, -0.5F);
/*      */     
/*  926 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 16, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F);
/*  927 */     this.gunModel[''].setRotationPoint(-76.0F, 33.5F, -0.5F);
/*      */     
/*  929 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F);
/*  930 */     this.gunModel[''].setRotationPoint(-61.0F, -2.5F, 2.0F);
/*      */     
/*  932 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 5, 0.0F, -0.25F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, -2.0F, -0.25F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F);
/*  933 */     this.gunModel[''].setRotationPoint(-62.0F, -2.5F, 4.0F);
/*      */     
/*  935 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 3, 3, 17, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/*  936 */     this.gunModel[''].setRotationPoint(-61.0F, -4.5F, -2.0F);
/*      */     
/*  938 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 1, 3, 9, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/*  939 */     this.gunModel[''].setRotationPoint(-62.0F, -4.5F, 2.0F);
/*      */     
/*  941 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 9, 0.0F, 1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/*  942 */     this.gunModel[''].setRotationPoint(-63.0F, -6.5F, 2.0F);
/*      */     
/*  944 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 3, 2, 17, 0.0F, 1.0F, 0.0F, -4.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 1.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/*  945 */     this.gunModel[''].setRotationPoint(-62.0F, -6.5F, -2.0F);
/*      */     
/*  947 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 9, 0.0F, 2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/*  948 */     this.gunModel[''].setRotationPoint(-64.5F, -7.5F, 2.0F);
/*      */     
/*  950 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 9, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F);
/*  951 */     this.gunModel[''].setRotationPoint(-63.5F, -7.5F, 2.0F);
/*      */     
/*  953 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 12, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F);
/*  954 */     this.gunModel[''].setRotationPoint(-77.5F, -10.5F, 0.0F);
/*      */     
/*  956 */     this.gunModel[''].addShapeBox(53.0F, -18.0F, -6.0F, 11, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F);
/*  957 */     this.gunModel[''].setRotationPoint(-77.5F, -8.5F, 2.0F);
/*      */     
/*  959 */     this.gunModel[' '].addShapeBox(53.0F, -18.0F, -6.0F, 19, 3, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  960 */     this.gunModel[' '].setRotationPoint(-77.0F, -13.5F, 0.0F);
/*      */     
/*  962 */     this.gunModel['¡'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/*  963 */     this.gunModel['¡'].setRotationPoint(-67.0F, -8.5F, 2.0F);
/*      */     
/*  965 */     this.gunModel['¢'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  966 */     this.gunModel['¢'].setRotationPoint(-65.5F, -8.5F, 2.0F);
/*      */     
/*  968 */     this.gunModel['£'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 9, 0.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  969 */     this.gunModel['£'].setRotationPoint(-65.5F, -10.5F, 2.0F);
/*      */     
/*  971 */     this.gunModel['¤'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  972 */     this.gunModel['¤'].setRotationPoint(-63.5F, -10.5F, 0.0F);
/*      */     
/*  974 */     this.gunModel['¥'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/*  975 */     this.gunModel['¥'].setRotationPoint(-63.5F, -7.5F, 0.0F);
/*      */     
/*  977 */     this.gunModel['¦'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  978 */     this.gunModel['¦'].setRotationPoint(-61.5F, -6.5F, 0.0F);
/*      */     
/*  980 */     this.gunModel['§'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 3, 13, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  981 */     this.gunModel['§'].setRotationPoint(-61.5F, -4.5F, 0.0F);
/*      */     
/*  983 */     this.gunModel['¨'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  984 */     this.gunModel['¨'].setRotationPoint(-65.5F, -10.5F, 0.0F);
/*      */     
/*  986 */     this.gunModel['©'].addShapeBox(53.0F, -18.0F, -6.0F, 41, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  987 */     this.gunModel['©'].setRotationPoint(60.0F, -33.0F, 15.5F);
/*      */     
/*  989 */     this.gunModel['ª'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  990 */     this.gunModel['ª'].setRotationPoint(59.0F, -33.0F, 15.5F);
/*      */     
/*  992 */     this.gunModel['«'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  993 */     this.gunModel['«'].setRotationPoint(101.0F, -33.0F, 15.5F);
/*      */     
/*  995 */     this.gunModel['¬'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  996 */     this.gunModel['¬'].setRotationPoint(98.0F, -29.5F, 16.0F);
/*      */     
/*  998 */     this.gunModel['­'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  999 */     this.gunModel['­'].setRotationPoint(98.0F, -27.5F, 16.0F);
/*      */     
/* 1001 */     this.gunModel['®'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1002 */     this.gunModel['®'].setRotationPoint(98.0F, -28.5F, 16.0F);
/*      */     
/* 1004 */     this.gunModel['¯'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1005 */     this.gunModel['¯'].setRotationPoint(60.0F, -29.5F, 16.0F);
/*      */     
/* 1007 */     this.gunModel['°'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1008 */     this.gunModel['°'].setRotationPoint(60.0F, -27.5F, 16.0F);
/*      */     
/* 1010 */     this.gunModel['±'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1011 */     this.gunModel['±'].setRotationPoint(60.0F, -28.5F, 16.0F);
/*      */     
/* 1013 */     this.gunModel['²'].addShapeBox(53.0F, -18.0F, -6.0F, 39, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1014 */     this.gunModel['²'].setRotationPoint(61.0F, -31.0F, 14.5F);
/*      */     
/* 1016 */     this.gunModel['³'].addShapeBox(53.0F, -18.0F, -6.0F, 43, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1017 */     this.gunModel['³'].setRotationPoint(59.0F, -31.0F, -2.5F);
/*      */     
/* 1019 */     this.gunModel['´'].addShapeBox(53.0F, -18.0F, -6.0F, 41, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1020 */     this.gunModel['´'].setRotationPoint(60.0F, -33.0F, -4.5F);
/*      */     
/* 1022 */     this.gunModel['µ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1023 */     this.gunModel['µ'].setRotationPoint(59.0F, -33.0F, -4.5F);
/*      */     
/* 1025 */     this.gunModel['¶'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1026 */     this.gunModel['¶'].setRotationPoint(101.0F, -33.0F, -4.5F);
/*      */     
/* 1028 */     this.gunModel['·'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1029 */     this.gunModel['·'].setRotationPoint(98.0F, -29.5F, -5.0F);
/*      */     
/* 1031 */     this.gunModel['¸'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1032 */     this.gunModel['¸'].setRotationPoint(98.0F, -27.5F, -5.0F);
/*      */     
/* 1034 */     this.gunModel['¹'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1035 */     this.gunModel['¹'].setRotationPoint(98.0F, -28.5F, -5.0F);
/*      */     
/* 1037 */     this.gunModel['º'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1038 */     this.gunModel['º'].setRotationPoint(60.0F, -29.5F, -5.0F);
/*      */     
/* 1040 */     this.gunModel['»'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1041 */     this.gunModel['»'].setRotationPoint(60.0F, -27.5F, -5.0F);
/*      */     
/* 1043 */     this.gunModel['¼'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1044 */     this.gunModel['¼'].setRotationPoint(60.0F, -28.5F, -5.0F);
/*      */     
/* 1046 */     this.gunModel['½'].addShapeBox(53.0F, -18.0F, -6.0F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1047 */     this.gunModel['½'].setRotationPoint(25.0F, -31.5F, 14.5F);
/*      */     
/* 1049 */     this.gunModel['¾'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1050 */     this.gunModel['¾'].setRotationPoint(22.0F, -31.5F, 14.5F);
/*      */     
/* 1052 */     this.gunModel['¿'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1053 */     this.gunModel['¿'].setRotationPoint(21.0F, -29.5F, 14.5F);
/*      */     
/* 1055 */     this.gunModel['À'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1056 */     this.gunModel['À'].setRotationPoint(37.0F, -30.5F, 14.5F);
/*      */     
/* 1058 */     this.gunModel['Á'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1059 */     this.gunModel['Á'].setRotationPoint(39.0F, -29.5F, 14.5F);
/*      */     
/* 1061 */     this.gunModel['Â'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1062 */     this.gunModel['Â'].setRotationPoint(40.0F, -29.5F, 14.5F);
/*      */     
/* 1064 */     this.gunModel['Ã'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 1065 */     this.gunModel['Ã'].setRotationPoint(40.0F, -28.5F, 14.5F);
/*      */     
/* 1067 */     this.gunModel['Ä'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F);
/* 1068 */     this.gunModel['Ä'].setRotationPoint(39.0F, -27.5F, 14.5F);
/*      */     
/* 1070 */     this.gunModel['Å'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1071 */     this.gunModel['Å'].setRotationPoint(37.0F, -32.5F, -3.5F);
/*      */     
/* 1073 */     this.gunModel['Æ'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1074 */     this.gunModel['Æ'].setRotationPoint(40.0F, -30.5F, 14.5F);
/*      */     
/* 1076 */     this.gunModel['Ç'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1077 */     this.gunModel['Ç'].setRotationPoint(39.0F, -31.5F, 14.5F);
/*      */     
/* 1079 */     this.gunModel['È'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1080 */     this.gunModel['È'].setRotationPoint(37.0F, -26.5F, 14.5F);
/*      */     
/* 1082 */     this.gunModel['É'].addShapeBox(53.0F, -18.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1083 */     this.gunModel['É'].setRotationPoint(25.0F, -32.5F, 14.5F);
/*      */     
/* 1085 */     this.gunModel['Ê'].addShapeBox(53.0F, -18.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1086 */     this.gunModel['Ê'].setRotationPoint(25.0F, -26.5F, 14.5F);
/*      */     
/* 1088 */     this.gunModel['Ë'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1089 */     this.gunModel['Ë'].setRotationPoint(22.0F, -32.5F, 14.5F);
/*      */     
/* 1091 */     this.gunModel['Ì'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/* 1092 */     this.gunModel['Ì'].setRotationPoint(22.0F, -26.5F, 14.5F);
/*      */     
/* 1094 */     this.gunModel['Í'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1095 */     this.gunModel['Í'].setRotationPoint(21.0F, -31.5F, 14.5F);
/*      */     
/* 1097 */     this.gunModel['Î'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1098 */     this.gunModel['Î'].setRotationPoint(21.0F, -28.5F, 14.5F);
/*      */     
/* 1100 */     this.gunModel['Ï'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1101 */     this.gunModel['Ï'].setRotationPoint(30.0F, -30.5F, 15.0F);
/*      */     
/* 1103 */     this.gunModel['Ð'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1104 */     this.gunModel['Ð'].setRotationPoint(30.0F, -28.5F, 15.0F);
/*      */     
/* 1106 */     this.gunModel['Ñ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1107 */     this.gunModel['Ñ'].setRotationPoint(30.0F, -29.5F, 15.0F);
/*      */     
/* 1109 */     this.gunModel['Ò'].addShapeBox(53.0F, -18.0F, -6.0F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1110 */     this.gunModel['Ò'].setRotationPoint(25.0F, -31.5F, -3.5F);
/*      */     
/* 1112 */     this.gunModel['Ó'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1113 */     this.gunModel['Ó'].setRotationPoint(22.0F, -31.5F, -3.5F);
/*      */     
/* 1115 */     this.gunModel['Ô'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1116 */     this.gunModel['Ô'].setRotationPoint(21.0F, -29.5F, -2.5F);
/*      */     
/* 1118 */     this.gunModel['Õ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1119 */     this.gunModel['Õ'].setRotationPoint(21.0F, -31.5F, -2.5F);
/*      */     
/* 1121 */     this.gunModel['Ö'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1122 */     this.gunModel['Ö'].setRotationPoint(21.0F, -28.5F, -2.5F);
/*      */     
/* 1124 */     this.gunModel['×'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1125 */     this.gunModel['×'].setRotationPoint(22.0F, -32.5F, -3.5F);
/*      */     
/* 1127 */     this.gunModel['Ø'].addShapeBox(53.0F, -18.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1128 */     this.gunModel['Ø'].setRotationPoint(25.0F, -32.5F, -3.5F);
/*      */     
/* 1130 */     this.gunModel['Ù'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1131 */     this.gunModel['Ù'].setRotationPoint(37.0F, -30.5F, -3.5F);
/*      */     
/* 1133 */     this.gunModel['Ú'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1134 */     this.gunModel['Ú'].setRotationPoint(39.0F, -29.5F, -3.5F);
/*      */     
/* 1136 */     this.gunModel['Û'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1137 */     this.gunModel['Û'].setRotationPoint(37.0F, -32.5F, 14.5F);
/*      */     
/* 1139 */     this.gunModel['Ü'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1140 */     this.gunModel['Ü'].setRotationPoint(39.0F, -31.5F, -3.5F);
/*      */     
/* 1142 */     this.gunModel['Ý'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1143 */     this.gunModel['Ý'].setRotationPoint(40.0F, -30.5F, -3.5F);
/*      */     
/* 1145 */     this.gunModel['Þ'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1146 */     this.gunModel['Þ'].setRotationPoint(40.0F, -29.5F, -3.5F);
/*      */     
/* 1148 */     this.gunModel['ß'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1149 */     this.gunModel['ß'].setRotationPoint(40.0F, -28.5F, -3.5F);
/*      */     
/* 1151 */     this.gunModel['à'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1152 */     this.gunModel['à'].setRotationPoint(39.0F, -27.5F, -3.5F);
/*      */     
/* 1154 */     this.gunModel['á'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1155 */     this.gunModel['á'].setRotationPoint(37.0F, -26.5F, -3.5F);
/*      */     
/* 1157 */     this.gunModel['â'].addShapeBox(53.0F, -18.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1158 */     this.gunModel['â'].setRotationPoint(25.0F, -26.5F, -3.5F);
/*      */     
/* 1160 */     this.gunModel['ã'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1161 */     this.gunModel['ã'].setRotationPoint(22.0F, -26.5F, -3.5F);
/*      */     
/* 1163 */     this.gunModel['ä'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1164 */     this.gunModel['ä'].setRotationPoint(30.0F, -30.5F, -4.0F);
/*      */     
/* 1166 */     this.gunModel['å'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1167 */     this.gunModel['å'].setRotationPoint(30.0F, -28.5F, -4.0F);
/*      */     
/* 1169 */     this.gunModel['æ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1170 */     this.gunModel['æ'].setRotationPoint(30.0F, -29.5F, -4.0F);
/*      */     
/* 1172 */     this.gunModel['ç'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1173 */     this.gunModel['ç'].setRotationPoint(-36.0F, -32.5F, 14.25F);
/*      */     
/* 1175 */     this.gunModel['è'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1176 */     this.gunModel['è'].setRotationPoint(-36.0F, -30.5F, 14.25F);
/*      */     
/* 1178 */     this.gunModel['é'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1179 */     this.gunModel['é'].setRotationPoint(-36.0F, -31.5F, 14.25F);
/*      */     
/* 1181 */     this.gunModel['ê'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1182 */     this.gunModel['ê'].setRotationPoint(-62.0F, -30.5F, 14.25F);
/*      */     
/* 1184 */     this.gunModel['ë'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1185 */     this.gunModel['ë'].setRotationPoint(-62.0F, -28.5F, 14.25F);
/*      */     
/* 1187 */     this.gunModel['ì'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1188 */     this.gunModel['ì'].setRotationPoint(-62.0F, -29.5F, 14.25F);
/*      */     
/* 1190 */     this.gunModel['í'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1191 */     this.gunModel['í'].setRotationPoint(-70.0F, -30.5F, 14.25F);
/*      */     
/* 1193 */     this.gunModel['î'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1194 */     this.gunModel['î'].setRotationPoint(-70.0F, -28.5F, 14.25F);
/*      */     
/* 1196 */     this.gunModel['ï'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1197 */     this.gunModel['ï'].setRotationPoint(-70.0F, -29.5F, 14.25F);
/*      */     
/* 1199 */     this.gunModel['ð'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1200 */     this.gunModel['ð'].setRotationPoint(-75.0F, -30.5F, 14.25F);
/*      */     
/* 1202 */     this.gunModel['ñ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1203 */     this.gunModel['ñ'].setRotationPoint(-75.0F, -28.5F, 14.25F);
/*      */     
/* 1205 */     this.gunModel['ò'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1206 */     this.gunModel['ò'].setRotationPoint(-75.0F, -29.5F, 14.25F);
/*      */     
/* 1208 */     this.gunModel['ó'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1209 */     this.gunModel['ó'].setRotationPoint(-3.0F, -32.5F, 14.25F);
/*      */     
/* 1211 */     this.gunModel['ô'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1212 */     this.gunModel['ô'].setRotationPoint(-3.0F, -30.5F, 14.25F);
/*      */     
/* 1214 */     this.gunModel['õ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1215 */     this.gunModel['õ'].setRotationPoint(-3.0F, -31.5F, 14.25F);
/*      */     
/* 1217 */     this.gunModel['ö'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1218 */     this.gunModel['ö'].setRotationPoint(24.75F, -18.5F, -0.5F);
/*      */     
/* 1220 */     this.gunModel['÷'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1221 */     this.gunModel['÷'].setRotationPoint(25.0F, -17.75F, -0.5F);
/*      */     
/* 1223 */     this.gunModel['ø'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1224 */     this.gunModel['ø'].setRotationPoint(25.0F, -19.25F, -0.5F);
/*      */     
/* 1226 */     this.gunModel['ù'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1227 */     this.gunModel['ù'].setRotationPoint(24.25F, -19.25F, -0.5F);
/*      */     
/* 1229 */     this.gunModel['ú'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 14, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1230 */     this.gunModel['ú'].setRotationPoint(25.5F, -19.25F, -0.5F);
/*      */     
/* 1232 */     this.gunModel['û'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1233 */     this.gunModel['û'].setRotationPoint(24.25F, -18.0F, -0.5F);
/*      */     
/* 1235 */     this.gunModel['ü'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 14, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1236 */     this.gunModel['ü'].setRotationPoint(25.5F, -18.0F, -0.5F);
/*      */     
/* 1238 */     this.gunModel['ý'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1239 */     this.gunModel['ý'].setRotationPoint(-20.0F, -5.5F, 12.0F);
/*      */     
/* 1241 */     this.gunModel['þ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1242 */     this.gunModel['þ'].setRotationPoint(-16.0F, -5.5F, 12.0F);
/*      */     
/* 1244 */     this.gunModel['ÿ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1245 */     this.gunModel['ÿ'].setRotationPoint(-14.0F, -7.5F, 12.0F);
/*      */     
/* 1247 */     this.gunModel['Ā'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1248 */     this.gunModel['Ā'].setRotationPoint(-14.0F, -15.5F, 12.0F);
/*      */     
/* 1250 */     this.gunModel['ā'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1251 */     this.gunModel['ā'].setRotationPoint(-20.0F, -15.5F, 12.0F);
/*      */     
/* 1253 */     this.gunModel['Ă'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1254 */     this.gunModel['Ă'].setRotationPoint(-16.0F, -15.5F, 12.0F);
/*      */     
/* 1256 */     this.gunModel['ă'].addShapeBox(53.0F, -18.0F, -6.0F, 10, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1257 */     this.gunModel['ă'].setRotationPoint(-13.0F, -11.5F, 12.5F);
/*      */     
/* 1259 */     this.gunModel['Ą'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1260 */     this.gunModel['Ą'].setRotationPoint(-3.0F, -11.5F, 12.5F);
/*      */     
/* 1262 */     this.gunModel['ą'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1263 */     this.gunModel['ą'].setRotationPoint(-1.5F, -11.0F, 12.5F);
/*      */     
/* 1265 */     this.gunModel['Ć'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1266 */     this.gunModel['Ć'].setRotationPoint(-19.0F, -14.5F, 12.25F);
/*      */     
/* 1268 */     this.gunModel['ć'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1269 */     this.gunModel['ć'].setRotationPoint(-16.0F, -14.5F, 12.25F);
/*      */     
/* 1271 */     this.gunModel['Ĉ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1272 */     this.gunModel['Ĉ'].setRotationPoint(-22.0F, -14.5F, 12.25F);
/*      */     
/* 1274 */     this.gunModel['ĉ'].addShapeBox(53.0F, -18.0F, -6.0F, 9, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1275 */     this.gunModel['ĉ'].setRotationPoint(-12.0F, -20.0F, 12.5F);
/*      */     
/* 1277 */     this.gunModel['Ċ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1278 */     this.gunModel['Ċ'].setRotationPoint(-20.5F, -22.0F, 12.0F);
/*      */     
/* 1280 */     this.gunModel['ċ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1281 */     this.gunModel['ċ'].setRotationPoint(-15.5F, -22.0F, 12.0F);
/*      */     
/* 1283 */     this.gunModel['Č'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1284 */     this.gunModel['Č'].setRotationPoint(-19.5F, -22.0F, 12.5F);
/*      */     
/* 1286 */     this.gunModel['č'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1287 */     this.gunModel['č'].setRotationPoint(-19.5F, -18.0F, 12.5F);
/*      */     
/* 1289 */     this.gunModel['Ď'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1290 */     this.gunModel['Ď'].setRotationPoint(-19.0F, -16.5F, 12.5F);
/*      */     
/* 1292 */     this.gunModel['ď'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1293 */     this.gunModel['ď'].setRotationPoint(-18.0F, -18.0F, 14.25F);
/*      */     
/* 1295 */     this.gunModel['Đ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1296 */     this.gunModel['Đ'].setRotationPoint(-18.0F, -21.0F, 14.25F);
/*      */     
/* 1298 */     this.gunModel['đ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1299 */     this.gunModel['đ'].setRotationPoint(-18.0F, -19.0F, 14.25F);
/*      */     
/* 1301 */     this.gunModel['Ē'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1302 */     this.gunModel['Ē'].setRotationPoint(-18.0F, -23.0F, 14.25F);
/*      */     
/* 1304 */     this.gunModel['ē'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1305 */     this.gunModel['ē'].setRotationPoint(-18.5F, -24.0F, 14.5F);
/*      */     
/* 1307 */     this.gunModel['Ĕ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1308 */     this.gunModel['Ĕ'].setRotationPoint(-18.5F, -26.0F, 14.5F);
/*      */     
/* 1310 */     this.gunModel['ĕ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1311 */     this.gunModel['ĕ'].setRotationPoint(-19.5F, -29.0F, 14.5F);
/*      */     
/* 1313 */     this.gunModel['Ė'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1314 */     this.gunModel['Ė'].setRotationPoint(-18.5F, -30.0F, 14.5F);
/*      */     
/* 1316 */     this.gunModel['ė'].addBox(53.0F, -18.0F, -6.0F, 84, 11, 3, 0.0F);
/* 1317 */     this.gunModel['ė'].setRotationPoint(21.0F, -34.0F, -2.0F);
/*      */     
/* 1319 */     this.gunModel['Ę'].addBox(53.0F, -18.0F, -6.0F, 46, 11, 9, 0.0F);
/* 1320 */     this.gunModel['Ę'].setRotationPoint(-25.0F, -34.0F, 6.0F);
/*      */     
/* 1322 */     this.gunModel['ę'].addBox(53.0F, -18.0F, -6.0F, 46, 3, 8, 0.0F);
/* 1323 */     this.gunModel['ę'].setRotationPoint(-25.0F, -26.0F, -2.0F);
/*      */     
/* 1325 */     this.gunModel['Ě'].addBox(53.0F, -18.0F, -6.0F, 46, 2, 8, 0.0F);
/* 1326 */     this.gunModel['Ě'].setRotationPoint(-25.0F, -34.0F, -2.0F);
/*      */     
/* 1328 */     this.gunModel['ě'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1329 */     this.gunModel['ě'].setRotationPoint(-25.0F, -32.0F, -2.0F);
/*      */     
/* 1331 */     this.gunModel['Ĝ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1332 */     this.gunModel['Ĝ'].setRotationPoint(-25.0F, -27.0F, -2.0F);
/*      */     
/* 1334 */     this.gunModel['ĝ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1335 */     this.gunModel['ĝ'].setRotationPoint(19.0F, -27.0F, -2.0F);
/*      */     
/* 1337 */     this.gunModel['Ğ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1338 */     this.gunModel['Ğ'].setRotationPoint(19.0F, -32.0F, -2.0F);
/*      */     
/* 1340 */     this.gunModel['ğ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1341 */     this.gunModel['ğ'].setRotationPoint(20.0F, -32.0F, -2.0F);
/*      */     
/* 1343 */     this.gunModel['Ġ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1344 */     this.gunModel['Ġ'].setRotationPoint(-14.5F, -6.5F, -2.5F);
/*      */     
/* 1346 */     this.gunModel['ġ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1347 */     this.gunModel['ġ'].setRotationPoint(-11.5F, -6.5F, -2.5F);
/*      */     
/* 1349 */     this.gunModel['Ģ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1350 */     this.gunModel['Ģ'].setRotationPoint(-11.5F, -14.5F, -2.5F);
/*      */     
/* 1352 */     this.gunModel['ģ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1353 */     this.gunModel['ģ'].setRotationPoint(-11.5F, -16.5F, -2.5F);
/*      */     
/* 1355 */     this.gunModel['Ĥ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1356 */     this.gunModel['Ĥ'].setRotationPoint(-14.5F, -16.5F, -2.5F);
/*      */     
/* 1358 */     this.gunModel['ĥ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1359 */     this.gunModel['ĥ'].setRotationPoint(-19.5F, -16.5F, -1.0F);
/*      */     
/* 1361 */     this.gunModel['Ħ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1362 */     this.gunModel['Ħ'].setRotationPoint(-25.5F, -16.5F, -1.0F);
/*      */     
/* 1364 */     this.gunModel['ħ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1365 */     this.gunModel['ħ'].setRotationPoint(-25.5F, -14.5F, -1.0F);
/*      */     
/* 1367 */     this.gunModel['Ĩ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1368 */     this.gunModel['Ĩ'].setRotationPoint(-25.5F, -11.5F, -1.0F);
/*      */     
/* 1370 */     this.gunModel['ĩ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1371 */     this.gunModel['ĩ'].setRotationPoint(-18.5F, -11.5F, -1.5F);
/*      */     
/* 1373 */     this.gunModel['Ī'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1374 */     this.gunModel['Ī'].setRotationPoint(-18.5F, -13.5F, -1.5F);
/*      */     
/* 1376 */     this.gunModel['ī'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1377 */     this.gunModel['ī'].setRotationPoint(-18.5F, -9.5F, -1.5F);
/*      */     
/* 1379 */     this.gunModel['Ĭ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1380 */     this.gunModel['Ĭ'].setRotationPoint(-24.0F, -14.5F, -1.5F);
/*      */     
/* 1382 */     this.gunModel['ĭ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1383 */     this.gunModel['ĭ'].setRotationPoint(-24.0F, -12.5F, -1.5F);
/*      */     
/* 1385 */     this.gunModel['Į'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1386 */     this.gunModel['Į'].setRotationPoint(-24.0F, -13.5F, -1.5F);
/*      */     
/* 1388 */     this.gunModel['į'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1389 */     this.gunModel['į'].setRotationPoint(-69.0F, -31.0F, -2.5F);
/*      */     
/* 1391 */     this.gunModel['İ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1392 */     this.gunModel['İ'].setRotationPoint(-69.0F, -29.0F, -2.5F);
/*      */     
/* 1394 */     this.gunModel['ı'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1395 */     this.gunModel['ı'].setRotationPoint(-69.0F, -30.0F, -2.5F);
/*      */     
/* 1397 */     this.gunModel['Ĳ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1398 */     this.gunModel['Ĳ'].setRotationPoint(-74.5F, -31.0F, -2.5F);
/*      */     
/* 1400 */     this.gunModel['ĳ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1401 */     this.gunModel['ĳ'].setRotationPoint(-74.5F, -29.0F, -2.5F);
/*      */     
/* 1403 */     this.gunModel['Ĵ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1404 */     this.gunModel['Ĵ'].setRotationPoint(-74.5F, -30.0F, -2.5F);
/*      */     
/* 1406 */     this.gunModel['ĵ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1407 */     this.gunModel['ĵ'].setRotationPoint(-30.0F, -31.0F, -2.5F);
/*      */     
/* 1409 */     this.gunModel['Ķ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1410 */     this.gunModel['Ķ'].setRotationPoint(-30.0F, -29.0F, -2.5F);
/*      */     
/* 1412 */     this.gunModel['ķ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1413 */     this.gunModel['ķ'].setRotationPoint(-30.0F, -30.0F, -2.5F);
/*      */     
/* 1415 */     this.gunModel['ĸ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1416 */     this.gunModel['ĸ'].setRotationPoint(-35.5F, -31.0F, -2.5F);
/*      */     
/* 1418 */     this.gunModel['Ĺ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1419 */     this.gunModel['Ĺ'].setRotationPoint(-35.5F, -29.0F, -2.5F);
/*      */     
/* 1421 */     this.gunModel['ĺ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1422 */     this.gunModel['ĺ'].setRotationPoint(-35.5F, -30.0F, -2.5F);
/*      */     
/* 1424 */     this.gunModel['Ļ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1425 */     this.gunModel['Ļ'].setRotationPoint(-27.0F, -31.0F, -4.0F);
/*      */     
/* 1427 */     this.gunModel['ļ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1428 */     this.gunModel['ļ'].setRotationPoint(-27.0F, -33.0F, -4.0F);
/*      */     
/* 1430 */     this.gunModel['Ľ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1431 */     this.gunModel['Ľ'].setRotationPoint(-27.0F, -34.0F, -3.0F);
/*      */     
/* 1433 */     this.gunModel['ľ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1434 */     this.gunModel['ľ'].setRotationPoint(-27.0F, -27.0F, -3.0F);
/*      */     
/* 1436 */     this.gunModel['Ŀ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 7, 7, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1437 */     this.gunModel['Ŀ'].setRotationPoint(109.0F, -31.0F, 3.0F);
/*      */     
/* 1439 */     this.gunModel['ŀ'].addBox(53.0F, -18.0F, -6.0F, 84, 11, 3, 0.0F);
/* 1440 */     this.gunModel['ŀ'].setRotationPoint(21.0F, -34.0F, 12.0F);
/*      */     
/* 1442 */     this.gunModel['Ł'].addShapeBox(53.0F, -18.0F, -6.0F, 84, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1443 */     this.gunModel['Ł'].setRotationPoint(21.0F, -24.0F, 1.0F);
/*      */     
/* 1445 */     this.gunModel['ł'].addShapeBox(53.0F, -18.0F, -6.0F, 84, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1446 */     this.gunModel['ł'].setRotationPoint(21.0F, -34.0F, 1.0F);
/*      */     
/* 1448 */     this.gunModel['Ń'].addShapeBox(53.0F, -18.0F, -6.0F, 84, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1449 */     this.gunModel['Ń'].setRotationPoint(21.0F, -24.0F, 11.0F);
/*      */     
/* 1451 */     this.gunModel['ń'].addShapeBox(53.0F, -18.0F, -6.0F, 84, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1452 */     this.gunModel['ń'].setRotationPoint(21.0F, -34.0F, 11.0F);
/*      */     
/* 1454 */     this.gunModel['Ņ'].addBox(53.0F, -18.0F, -6.0F, 35, 6, 7, 0.0F);
/* 1455 */     this.gunModel['Ņ'].setRotationPoint(-99.0F, -31.0F, -6.0F);
/*      */     
/* 1457 */     this.gunModel['ņ'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1458 */     this.gunModel['ņ'].setRotationPoint(-99.0F, -25.0F, -6.0F);
/*      */     
/* 1460 */     this.gunModel['Ň'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1461 */     this.gunModel['Ň'].setRotationPoint(-99.0F, -24.0F, -5.0F);
/*      */     
/* 1463 */     this.gunModel['ň'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 2, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1464 */     this.gunModel['ň'].setRotationPoint(-99.0F, -33.0F, -6.0F);
/*      */     
/* 1466 */     this.gunModel['ŉ'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1467 */     this.gunModel['ŉ'].setRotationPoint(-99.0F, -34.0F, -5.0F);
/*      */     
/* 1469 */     this.gunModel['Ŋ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1470 */     this.gunModel['Ŋ'].setRotationPoint(-64.0F, -31.0F, -6.0F);
/*      */     
/* 1472 */     this.gunModel['ŋ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1473 */     this.gunModel['ŋ'].setRotationPoint(-64.0F, -25.0F, -6.0F);
/*      */     
/* 1475 */     this.gunModel['Ō'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1476 */     this.gunModel['Ō'].setRotationPoint(-64.0F, -34.0F, -5.0F);
/*      */     
/* 1478 */     this.gunModel['ō'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1479 */     this.gunModel['ō'].setRotationPoint(-64.0F, -33.0F, -6.0F);
/*      */     
/* 1481 */     this.gunModel['Ŏ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1482 */     this.gunModel['Ŏ'].setRotationPoint(-64.0F, -24.0F, -5.0F);
/*      */     
/* 1484 */     this.gunModel['ŏ'].addBox(53.0F, -18.0F, -6.0F, 35, 6, 7, 0.0F);
/* 1485 */     this.gunModel['ŏ'].setRotationPoint(-99.0F, -31.0F, 12.0F);
/*      */     
/* 1487 */     this.gunModel['Ő'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1488 */     this.gunModel['Ő'].setRotationPoint(-99.0F, -25.0F, 12.0F);
/*      */     
/* 1490 */     this.gunModel['ő'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1491 */     this.gunModel['ő'].setRotationPoint(-99.0F, -24.0F, 12.0F);
/*      */     
/* 1493 */     this.gunModel['Œ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1494 */     this.gunModel['Œ'].setRotationPoint(-64.0F, -31.0F, 14.0F);
/*      */     
/* 1496 */     this.gunModel['œ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, -1.0F);
/* 1497 */     this.gunModel['œ'].setRotationPoint(-64.0F, -25.0F, 14.0F);
/*      */     
/* 1499 */     this.gunModel['Ŕ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1500 */     this.gunModel['Ŕ'].setRotationPoint(-64.0F, -34.0F, 14.0F);
/*      */     
/* 1502 */     this.gunModel['ŕ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1503 */     this.gunModel['ŕ'].setRotationPoint(-64.0F, -33.0F, 14.0F);
/*      */     
/* 1505 */     this.gunModel['Ŗ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -2.0F);
/* 1506 */     this.gunModel['Ŗ'].setRotationPoint(-64.0F, -24.0F, 14.0F);
/*      */     
/* 1508 */     this.gunModel['ŗ'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1509 */     this.gunModel['ŗ'].setRotationPoint(-99.0F, -33.0F, 12.0F);
/*      */     
/* 1511 */     this.gunModel['Ř'].addShapeBox(53.0F, -18.0F, -6.0F, 35, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1512 */     this.gunModel['Ř'].setRotationPoint(-99.0F, -34.0F, 12.0F);
/*      */     
/* 1514 */     this.gunModel['ř'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1515 */     this.gunModel['ř'].setRotationPoint(87.0F, -45.0F, 1.0F);
/*      */     
/* 1517 */     this.gunModel['Ś'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1518 */     this.gunModel['Ś'].setRotationPoint(87.0F, -43.0F, 1.0F);
/*      */     
/* 1520 */     this.gunModel['ś'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1521 */     this.gunModel['ś'].setRotationPoint(87.0F, -44.0F, 1.0F);
/*      */     
/* 1523 */     this.gunModel['Ŝ'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1524 */     this.gunModel['Ŝ'].setRotationPoint(-152.0F, -30.5F, 12.0F);
/*      */     
/* 1526 */     this.gunModel['ŝ'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1527 */     this.gunModel['ŝ'].setRotationPoint(-152.0F, -32.0F, 12.0F);
/*      */     
/* 1529 */     this.gunModel['Ş'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1530 */     this.gunModel['Ş'].setRotationPoint(-152.0F, -27.5F, 12.0F);
/*      */     
/* 1532 */     this.gunModel['ş'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1533 */     this.gunModel['ş'].setRotationPoint(-152.0F, -33.0F, 12.0F);
/*      */     
/* 1535 */     this.gunModel['Š'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 4, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1536 */     this.gunModel['Š'].setRotationPoint(-152.0F, -28.5F, 12.0F);
/*      */     
/* 1538 */     this.gunModel['š'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1539 */     this.gunModel['š'].setRotationPoint(-152.0F, -30.0F, 12.0F);
/*      */     
/* 1541 */     this.gunModel['Ţ'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1542 */     this.gunModel['Ţ'].setRotationPoint(-152.0F, -30.5F, -2.0F);
/*      */     
/* 1544 */     this.gunModel['ţ'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1545 */     this.gunModel['ţ'].setRotationPoint(-152.0F, -32.0F, -3.0F);
/*      */     
/* 1547 */     this.gunModel['Ť'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1548 */     this.gunModel['Ť'].setRotationPoint(-152.0F, -27.5F, -3.0F);
/*      */     
/* 1550 */     this.gunModel['ť'].addShapeBox(53.0F, -18.0F, -6.0F, 53, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1551 */     this.gunModel['ť'].setRotationPoint(-152.0F, -33.0F, -3.0F);
/*      */     
/* 1553 */     this.gunModel['Ŧ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 4, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1554 */     this.gunModel['Ŧ'].setRotationPoint(-152.0F, -28.5F, -3.0F);
/*      */     
/* 1556 */     this.gunModel['ŧ'].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1557 */     this.gunModel['ŧ'].setRotationPoint(-152.0F, -30.0F, -3.0F);
/*      */     
/* 1559 */     this.gunModel['Ũ'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 14, 24, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1560 */     this.gunModel['Ũ'].setRotationPoint(-159.0F, -31.5F, -5.5F);
/*      */     
/* 1562 */     this.gunModel['ũ'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 24, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1563 */     this.gunModel['ũ'].setRotationPoint(-159.0F, -32.0F, -5.5F);
/*      */     
/* 1565 */     this.gunModel['Ū'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1566 */     this.gunModel['Ū'].setRotationPoint(-159.0F, -17.5F, -4.0F);
/*      */     
/* 1568 */     this.gunModel['ū'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1569 */     this.gunModel['ū'].setRotationPoint(-159.0F, -34.0F, -4.5F);
/*      */     
/* 1571 */     this.gunModel['Ŭ'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1572 */     this.gunModel['Ŭ'].setRotationPoint(-159.0F, -37.0F, -4.5F);
/*      */     
/* 1574 */     this.gunModel['ŭ'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 2, 22, 0.0F, -1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1575 */     this.gunModel['ŭ'].setRotationPoint(-159.0F, -39.0F, -4.5F);
/*      */     
/* 1577 */     this.gunModel['Ů'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 2, 16, 0.0F, -3.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, -3.0F, -0.5F, -4.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1578 */     this.gunModel['Ů'].setRotationPoint(-159.0F, -41.0F, -1.5F);
/*      */     
/* 1580 */     this.gunModel['ů'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 14, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1581 */     this.gunModel['ů'].setRotationPoint(-157.0F, -18.0F, -4.5F);
/*      */     
/* 1583 */     this.gunModel['Ű'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 14, 22, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1584 */     this.gunModel['Ű'].setRotationPoint(-159.0F, -18.0F, -4.5F);
/*      */     
/* 1586 */     this.gunModel['ű'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 4, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1587 */     this.gunModel['ű'].setRotationPoint(-157.0F, -4.5F, 11.5F);
/*      */     
/* 1589 */     this.gunModel['Ų'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 4, 22, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F);
/* 1590 */     this.gunModel['Ų'].setRotationPoint(-159.0F, -4.5F, -4.5F);
/*      */     
/* 1592 */     this.gunModel['ų'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 22, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -2.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F);
/* 1593 */     this.gunModel['ų'].setRotationPoint(-159.0F, -0.5F, -4.5F);
/*      */     
/* 1595 */     this.gunModel['Ŵ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1596 */     this.gunModel['Ŵ'].setRotationPoint(-157.0F, -0.5F, -2.5F);
/*      */     
/* 1598 */     this.gunModel['ŵ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 25, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1599 */     this.gunModel['ŵ'].setRotationPoint(-156.5F, -22.0F, -6.0F);
/*      */     
/* 1601 */     this.gunModel['Ŷ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1602 */     this.gunModel['Ŷ'].setRotationPoint(-156.5F, -20.0F, -6.0F);
/*      */     
/* 1604 */     this.gunModel['ŷ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1605 */     this.gunModel['ŷ'].setRotationPoint(-156.5F, -21.0F, -6.0F);
/*      */     
/* 1607 */     this.gunModel['Ÿ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 25, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1608 */     this.gunModel['Ÿ'].setRotationPoint(-156.5F, -31.0F, -6.0F);
/*      */     
/* 1610 */     this.gunModel['Ź'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1611 */     this.gunModel['Ź'].setRotationPoint(-156.5F, -29.0F, -6.0F);
/*      */     
/* 1613 */     this.gunModel['ź'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1614 */     this.gunModel['ź'].setRotationPoint(-156.5F, -30.0F, -6.0F);
/*      */     
/* 1616 */     this.gunModel['Ż'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 14, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1617 */     this.gunModel['Ż'].setRotationPoint(-157.0F, -18.0F, 11.5F);
/*      */     
/* 1619 */     this.gunModel['ż'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 4, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 1620 */     this.gunModel['ż'].setRotationPoint(-157.0F, -4.5F, -4.5F);
/*      */     
/* 1622 */     this.gunModel['Ž'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1623 */     this.gunModel['Ž'].setRotationPoint(-159.0F, -34.0F, 11.5F);
/*      */     
/* 1625 */     this.gunModel['ž'].addShapeBox(53.0F, -18.0F, -6.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1626 */     this.gunModel['ž'].setRotationPoint(-159.0F, -37.0F, 11.5F);
/*      */     
/* 1628 */     this.gunModel['ſ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1629 */     this.gunModel['ſ'].setRotationPoint(-159.0F, -34.0F, 1.5F);
/*      */     
/* 1631 */     this.gunModel['ƀ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1632 */     this.gunModel['ƀ'].setRotationPoint(-159.0F, -37.0F, 1.5F);
/*      */     
/* 1634 */     this.gunModel['Ɓ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 6, 10, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 1.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F);
/* 1635 */     this.gunModel['Ɓ'].setRotationPoint(-88.0F, -15.0F, 1.5F);
/*      */     
/* 1637 */     this.gunModel['Ƃ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 9, 10, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1638 */     this.gunModel['Ƃ'].setRotationPoint(-88.0F, -24.0F, 1.5F);
/*      */     
/* 1640 */     this.gunModel['ƃ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 11, 17, 0.0F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1641 */     this.gunModel['ƃ'].setRotationPoint(-88.0F, -35.0F, -2.0F);
/*      */     
/* 1643 */     this.gunModel['Ƅ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 1, 17, 0.0F, -3.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -3.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 1644 */     this.gunModel['Ƅ'].setRotationPoint(-82.0F, -35.5F, -2.0F);
/*      */     
/* 1646 */     this.gunModel['ƅ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 15, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F);
/* 1647 */     this.gunModel['ƅ'].setRotationPoint(-79.0F, -37.5F, -1.0F);
/*      */     
/* 1649 */     this.gunModel['Ɔ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 9, 10, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -4.0F, 1.0F);
/* 1650 */     this.gunModel['Ɔ'].setRotationPoint(-91.0F, -24.0F, 1.5F);
/*      */     
/* 1652 */     this.gunModel['Ƈ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 5, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 1653 */     this.gunModel['Ƈ'].setRotationPoint(-96.0F, -24.0F, 1.0F);
/*      */     
/* 1655 */     this.gunModel['ƈ'].addShapeBox(53.0F, -18.0F, -6.0F, 8, 10, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1656 */     this.gunModel['ƈ'].setRotationPoint(-96.0F, -34.0F, 1.0F);
/*      */     
/* 1658 */     this.gunModel['Ɖ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1659 */     this.gunModel['Ɖ'].setRotationPoint(-84.0F, -49.0F, 1.0F);
/*      */     
/* 1661 */     this.gunModel['Ɗ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 2, 11, 0.0F, 0.0F, -2.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.5F, -3.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 1662 */     this.gunModel['Ɗ'].setRotationPoint(-89.0F, -49.0F, 1.0F);
/*      */     
/* 1664 */     this.gunModel['Ƌ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -1.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.5F, -3.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1665 */     this.gunModel['Ƌ'].setRotationPoint(-93.0F, -46.5F, 1.0F);
/*      */     
/* 1667 */     this.gunModel['ƌ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1668 */     this.gunModel['ƌ'].setRotationPoint(-97.0F, -45.0F, 1.0F);
/*      */     
/* 1670 */     this.gunModel['ƍ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1671 */     this.gunModel['ƍ'].setRotationPoint(-103.0F, -44.0F, 1.0F);
/*      */     
/* 1673 */     this.gunModel['Ǝ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 2, 11, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1674 */     this.gunModel['Ǝ'].setRotationPoint(-114.0F, -43.5F, 1.0F);
/*      */     
/* 1676 */     this.gunModel['Ə'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 11, 0.0F, -0.5F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, -2.0F, -3.0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F);
/* 1677 */     this.gunModel['Ə'].setRotationPoint(-115.5F, -43.5F, 1.0F);
/*      */     
/* 1679 */     this.gunModel['Ɛ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 3, 13, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1680 */     this.gunModel['Ɛ'].setRotationPoint(-84.0F, -47.0F, 0.0F);
/*      */     
/* 1682 */     this.gunModel['Ƒ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1683 */     this.gunModel['Ƒ'].setRotationPoint(-84.0F, -44.0F, 0.0F);
/*      */     
/* 1685 */     this.gunModel['ƒ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 11, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1686 */     this.gunModel['ƒ'].setRotationPoint(-81.0F, -44.5F, -1.0F);
/*      */     
/* 1688 */     this.gunModel['Ɠ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 3, 15, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1689 */     this.gunModel['Ɠ'].setRotationPoint(-81.0F, -47.5F, -1.0F);
/*      */     
/* 1691 */     this.gunModel['Ɣ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1692 */     this.gunModel['Ɣ'].setRotationPoint(-81.0F, -48.5F, 0.0F);
/*      */     
/* 1694 */     this.gunModel['ƕ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 3, 2, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 1695 */     this.gunModel['ƕ'].setRotationPoint(-89.0F, -47.0F, 0.0F);
/*      */     
/* 1697 */     this.gunModel['Ɩ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 3, 2, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1698 */     this.gunModel['Ɩ'].setRotationPoint(-93.0F, -44.5F, 0.0F);
/*      */     
/* 1700 */     this.gunModel['Ɨ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 3, 2, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1701 */     this.gunModel['Ɨ'].setRotationPoint(-97.0F, -43.0F, 0.0F);
/*      */     
/* 1703 */     this.gunModel['Ƙ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 3, 2, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1704 */     this.gunModel['Ƙ'].setRotationPoint(-103.0F, -42.0F, 0.0F);
/*      */     
/* 1706 */     this.gunModel['ƙ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 3, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1707 */     this.gunModel['ƙ'].setRotationPoint(-114.0F, -41.5F, 0.0F);
/*      */     
/* 1709 */     this.gunModel['ƚ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 4, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1710 */     this.gunModel['ƚ'].setRotationPoint(-114.0F, -38.5F, 0.0F);
/*      */     
/* 1712 */     this.gunModel['ƛ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 2, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F);
/* 1713 */     this.gunModel['ƛ'].setRotationPoint(-115.5F, -38.5F, 0.0F);
/*      */     
/* 1715 */     this.gunModel['Ɯ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 7, 2, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 1716 */     this.gunModel['Ɯ'].setRotationPoint(-89.0F, -44.0F, 0.0F);
/*      */     
/* 1718 */     this.gunModel['Ɲ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 6, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1719 */     this.gunModel['Ɲ'].setRotationPoint(-93.0F, -41.5F, 0.0F);
/*      */     
/* 1721 */     this.gunModel['ƞ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 4, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1722 */     this.gunModel['ƞ'].setRotationPoint(-97.0F, -40.0F, 0.0F);
/*      */     
/* 1724 */     this.gunModel['Ɵ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1725 */     this.gunModel['Ɵ'].setRotationPoint(-103.0F, -39.0F, 0.0F);
/*      */     
/* 1727 */     this.gunModel['Ơ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 4, 0.0F, -0.5F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -2.0F, -1.0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 2.0F, -2.0F);
/* 1728 */     this.gunModel['Ơ'].setRotationPoint(-115.5F, -41.5F, 0.0F);
/*      */     
/* 1730 */     this.gunModel['ơ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 3, 2, 0.0F, 0.0F, -2.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.5F, -1.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 1731 */     this.gunModel['ơ'].setRotationPoint(-89.0F, -47.0F, 11.0F);
/*      */     
/* 1733 */     this.gunModel['Ƣ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 3, 2, 0.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1734 */     this.gunModel['Ƣ'].setRotationPoint(-93.0F, -44.5F, 11.0F);
/*      */     
/* 1736 */     this.gunModel['ƣ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 3, 2, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1737 */     this.gunModel['ƣ'].setRotationPoint(-97.0F, -43.0F, 11.0F);
/*      */     
/* 1739 */     this.gunModel['Ƥ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 3, 2, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1740 */     this.gunModel['Ƥ'].setRotationPoint(-103.0F, -42.0F, 11.0F);
/*      */     
/* 1742 */     this.gunModel['ƥ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 3, 2, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1743 */     this.gunModel['ƥ'].setRotationPoint(-114.0F, -41.5F, 11.0F);
/*      */     
/* 1745 */     this.gunModel['Ʀ'].addShapeBox(53.0F, -18.0F, -6.0F, 11, 4, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1746 */     this.gunModel['Ʀ'].setRotationPoint(-114.0F, -38.5F, 11.0F);
/*      */     
/* 1748 */     this.gunModel['Ƨ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 2, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F);
/* 1749 */     this.gunModel['Ƨ'].setRotationPoint(-115.5F, -38.5F, 11.0F);
/*      */     
/* 1751 */     this.gunModel['ƨ'].addShapeBox(53.0F, -18.0F, -6.0F, 5, 7, 2, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 1752 */     this.gunModel['ƨ'].setRotationPoint(-89.0F, -44.0F, 11.0F);
/*      */     
/* 1754 */     this.gunModel['Ʃ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 6, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1755 */     this.gunModel['Ʃ'].setRotationPoint(-93.0F, -41.5F, 11.0F);
/*      */     
/* 1757 */     this.gunModel['ƪ'].addShapeBox(53.0F, -18.0F, -6.0F, 4, 4, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1758 */     this.gunModel['ƪ'].setRotationPoint(-97.0F, -40.0F, 11.0F);
/*      */     
/* 1760 */     this.gunModel['ƫ'].addShapeBox(53.0F, -18.0F, -6.0F, 6, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1761 */     this.gunModel['ƫ'].setRotationPoint(-103.0F, -39.0F, 11.0F);
/*      */     
/* 1763 */     this.gunModel['Ƭ'].addShapeBox(53.0F, -18.0F, -6.0F, 2, 3, 4, 0.0F, -0.5F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -2.0F, -1.0F, -0.5F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F);
/* 1764 */     this.gunModel['Ƭ'].setRotationPoint(-115.5F, -41.5F, 9.0F);
/*      */     
/* 1766 */     this.gunModel['ƭ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1767 */     this.gunModel['ƭ'].setRotationPoint(-73.0F, -45.0F, 1.0F);
/*      */     
/* 1769 */     this.gunModel['Ʈ'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1770 */     this.gunModel['Ʈ'].setRotationPoint(-73.0F, -43.0F, 1.0F);
/*      */     
/* 1772 */     this.gunModel['Ư'].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1773 */     this.gunModel['Ư'].setRotationPoint(-73.0F, -44.0F, 1.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 1778 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 521, 129, this.textureX, this.textureY);
/* 1779 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 545, 129, this.textureX, this.textureY);
/* 1780 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 569, 129, this.textureX, this.textureY);
/* 1781 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 593, 129, this.textureX, this.textureY);
/* 1782 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 617, 129, this.textureX, this.textureY);
/* 1783 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 121, 153, this.textureX, this.textureY);
/* 1784 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 873, 137, this.textureX, this.textureY);
/* 1785 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 153, 153, this.textureX, this.textureY);
/* 1786 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 313, 153, this.textureX, this.textureY);
/* 1787 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 641, 129, this.textureX, this.textureY);
/* 1788 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 1001, 137, this.textureX, this.textureY);
/* 1789 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 745, 153, this.textureX, this.textureY);
/* 1790 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 785, 153, this.textureX, this.textureY);
/* 1791 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 857, 153, this.textureX, this.textureY);
/* 1792 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 513, 161, this.textureX, this.textureY);
/* 1793 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 609, 161, this.textureX, this.textureY);
/* 1794 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 481, 145, this.textureX, this.textureY);
/* 1795 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 521, 145, this.textureX, this.textureY);
/* 1796 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 745, 161, this.textureX, this.textureY);
/* 1797 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 785, 161, this.textureX, this.textureY);
/* 1798 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 817, 169, this.textureX, this.textureY);
/* 1799 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 513, 169, this.textureX, this.textureY);
/* 1800 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 1001, 169, this.textureX, this.textureY);
/* 1801 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 65, 177, this.textureX, this.textureY);
/* 1802 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 185, 177, this.textureX, this.textureY);
/* 1803 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 313, 177, this.textureX, this.textureY);
/* 1804 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 753, 193, this.textureX, this.textureY);
/* 1805 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 657, 177, this.textureX, this.textureY);
/* 1806 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/* 1807 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 777, 193, this.textureX, this.textureY);
/* 1808 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 649, 193, this.textureX, this.textureY);
/* 1809 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 809, 193, this.textureX, this.textureY);
/* 1810 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 681, 193, this.textureX, this.textureY);
/* 1811 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 561, 145, this.textureX, this.textureY);
/* 1812 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 849, 193, this.textureX, this.textureY);
/* 1813 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 873, 193, this.textureX, this.textureY);
/* 1814 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 577, 145, this.textureX, this.textureY);
/* 1815 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 649, 145, this.textureX, this.textureY);
/* 1816 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 617, 145, this.textureX, this.textureY);
/* 1817 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/* 1818 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 1017, 89, this.textureX, this.textureY);
/* 1819 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/* 1820 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 905, 137, this.textureX, this.textureY);
/* 1821 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 1017, 137, this.textureX, this.textureY);
/* 1822 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 441, 145, this.textureX, this.textureY);
/* 1823 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 473, 193, this.textureX, this.textureY);
/* 1824 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 801, 193, this.textureX, this.textureY);
/* 1825 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/* 1826 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 1827 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 673, 89, this.textureX, this.textureY);
/* 1828 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 993, 97, this.textureX, this.textureY);
/* 1829 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 1017, 97, this.textureX, this.textureY);
/* 1830 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 657, 129, this.textureX, this.textureY);
/* 1831 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 665, 145, this.textureX, this.textureY);
/* 1832 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 353, 145, this.textureX, this.textureY);
/* 1833 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 361, 145, this.textureX, this.textureY);
/* 1834 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 353, 153, this.textureX, this.textureY);
/* 1835 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 121, 161, this.textureX, this.textureY);
/* 1836 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 537, 145, this.textureX, this.textureY);
/* 1837 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 681, 145, this.textureX, this.textureY);
/* 1838 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 41, 153, this.textureX, this.textureY);
/* 1839 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 57, 153, this.textureX, this.textureY);
/* 1840 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 81, 153, this.textureX, this.textureY);
/* 1841 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 777, 33, this.textureX, this.textureY);
/* 1842 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/* 1843 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 97, 153, this.textureX, this.textureY);
/* 1844 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/* 1845 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 817, 41, this.textureX, this.textureY);
/* 1846 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 841, 73, this.textureX, this.textureY);
/* 1847 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 841, 81, this.textureX, this.textureY);
/* 1848 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 289, 217, this.textureX, this.textureY);
/* 1849 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 113, 209, this.textureX, this.textureY);
/* 1850 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 897, 201, this.textureX, this.textureY);
/* 1851 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 777, 41, this.textureX, this.textureY);
/* 1852 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 161, 177, this.textureX, this.textureY);
/* 1853 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 705, 153, this.textureX, this.textureY);
/* 1854 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 585, 161, this.textureX, this.textureY);
/* 1855 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 337, 177, this.textureX, this.textureY);
/* 1856 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 185, 209, this.textureX, this.textureY);
/* 1857 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 817, 177, this.textureX, this.textureY);
/* 1858 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 833, 177, this.textureX, this.textureY);
/* 1859 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 1001, 153, this.textureX, this.textureY);
/* 1860 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 945, 97, this.textureX, this.textureY);
/* 1861 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 993, 105, this.textureX, this.textureY);
/* 1862 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 505, 145, this.textureX, this.textureY);
/* 1863 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/* 1864 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 369, 209, this.textureX, this.textureY);
/* 1865 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 913, 161, this.textureX, this.textureY);
/* 1866 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 857, 177, this.textureX, this.textureY);
/* 1867 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/* 1868 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 65, 185, this.textureX, this.textureY);
/* 1869 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 161, 185, this.textureX, this.textureY);
/* 1870 */     this.defaultScopeModel[92] = new ModelRendererTurbo(this, 393, 193, this.textureX, this.textureY);
/* 1871 */     this.defaultScopeModel[93] = new ModelRendererTurbo(this, 633, 193, this.textureX, this.textureY);
/* 1872 */     this.defaultScopeModel[94] = new ModelRendererTurbo(this, 65, 153, this.textureX, this.textureY);
/* 1873 */     this.defaultScopeModel[95] = new ModelRendererTurbo(this, 9, 153, this.textureX, this.textureY);
/* 1874 */     this.defaultScopeModel[96] = new ModelRendererTurbo(this, 105, 153, this.textureX, this.textureY);
/* 1875 */     this.defaultScopeModel[97] = new ModelRendererTurbo(this, 689, 153, this.textureX, this.textureY);
/* 1876 */     this.defaultScopeModel[98] = new ModelRendererTurbo(this, 585, 209, this.textureX, this.textureY);
/* 1877 */     this.defaultScopeModel[99] = new ModelRendererTurbo(this, 769, 89, this.textureX, this.textureY);
/* 1878 */     this.defaultScopeModel[100] = new ModelRendererTurbo(this, 769, 153, this.textureX, this.textureY);
/* 1879 */     this.defaultScopeModel[101] = new ModelRendererTurbo(this, 809, 153, this.textureX, this.textureY);
/* 1880 */     this.defaultScopeModel[102] = new ModelRendererTurbo(this, 257, 153, this.textureX, this.textureY);
/* 1881 */     this.defaultScopeModel[103] = new ModelRendererTurbo(this, 297, 153, this.textureX, this.textureY);
/* 1882 */     this.defaultScopeModel[104] = new ModelRendererTurbo(this, 65, 161, this.textureX, this.textureY);
/* 1883 */     this.defaultScopeModel[105] = new ModelRendererTurbo(this, 641, 161, this.textureX, this.textureY);
/* 1884 */     this.defaultScopeModel[106] = new ModelRendererTurbo(this, 937, 161, this.textureX, this.textureY);
/* 1885 */     this.defaultScopeModel[107] = new ModelRendererTurbo(this, 185, 185, this.textureX, this.textureY);
/* 1886 */     this.defaultScopeModel[108] = new ModelRendererTurbo(this, 729, 169, this.textureX, this.textureY);
/* 1887 */     this.defaultScopeModel[109] = new ModelRendererTurbo(this, 65, 193, this.textureX, this.textureY);
/* 1888 */     this.defaultScopeModel[110] = new ModelRendererTurbo(this, 793, 89, this.textureX, this.textureY);
/* 1889 */     this.defaultScopeModel[111] = new ModelRendererTurbo(this, 697, 193, this.textureX, this.textureY);
/* 1890 */     this.defaultScopeModel[112] = new ModelRendererTurbo(this, 673, 177, this.textureX, this.textureY);
/* 1891 */     this.defaultScopeModel[113] = new ModelRendererTurbo(this, 209, 193, this.textureX, this.textureY);
/* 1892 */     this.defaultScopeModel[114] = new ModelRendererTurbo(this, 753, 185, this.textureX, this.textureY);
/* 1893 */     this.defaultScopeModel[115] = new ModelRendererTurbo(this, 649, 193, this.textureX, this.textureY);
/* 1894 */     this.defaultScopeModel[116] = new ModelRendererTurbo(this, 777, 193, this.textureX, this.textureY);
/* 1895 */     this.defaultScopeModel[117] = new ModelRendererTurbo(this, 913, 193, this.textureX, this.textureY);
/* 1896 */     this.defaultScopeModel[118] = new ModelRendererTurbo(this, 137, 201, this.textureX, this.textureY);
/* 1897 */     this.defaultScopeModel[119] = new ModelRendererTurbo(this, 209, 201, this.textureX, this.textureY);
/* 1898 */     this.defaultScopeModel[120] = new ModelRendererTurbo(this, 129, 209, this.textureX, this.textureY);
/* 1899 */     this.defaultScopeModel[121] = new ModelRendererTurbo(this, 729, 209, this.textureX, this.textureY);
/* 1900 */     this.defaultScopeModel[122] = new ModelRendererTurbo(this, 769, 209, this.textureX, this.textureY);
/* 1901 */     this.defaultScopeModel[123] = new ModelRendererTurbo(this, 105, 161, this.textureX, this.textureY);
/* 1902 */     this.defaultScopeModel[124] = new ModelRendererTurbo(this, 217, 161, this.textureX, this.textureY);
/*      */     
/* 1904 */     this.defaultScopeModel[0].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1905 */     this.defaultScopeModel[0].setRotationPoint(-73.5F, -59.0F, 1.0F);
/*      */     
/* 1907 */     this.defaultScopeModel[1].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1908 */     this.defaultScopeModel[1].setRotationPoint(-73.5F, -56.0F, 1.0F);
/*      */     
/* 1910 */     this.defaultScopeModel[2].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1911 */     this.defaultScopeModel[2].setRotationPoint(-73.5F, -53.0F, 1.0F);
/*      */     
/* 1913 */     this.defaultScopeModel[3].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1914 */     this.defaultScopeModel[3].setRotationPoint(-73.5F, -59.0F, 11.0F);
/*      */     
/* 1916 */     this.defaultScopeModel[4].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1917 */     this.defaultScopeModel[4].setRotationPoint(-73.5F, -56.0F, 11.0F);
/*      */     
/* 1919 */     this.defaultScopeModel[5].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1920 */     this.defaultScopeModel[5].setRotationPoint(-73.5F, -53.0F, 11.0F);
/*      */     
/* 1922 */     this.defaultScopeModel[6].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1923 */     this.defaultScopeModel[6].setRotationPoint(-72.0F, -55.5F, 12.0F);
/*      */     
/* 1925 */     this.defaultScopeModel[7].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1926 */     this.defaultScopeModel[7].setRotationPoint(-72.0F, -57.5F, 12.0F);
/*      */     
/* 1928 */     this.defaultScopeModel[8].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1929 */     this.defaultScopeModel[8].setRotationPoint(-72.0F, -53.5F, 12.0F);
/*      */     
/* 1931 */     this.defaultScopeModel[9].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1932 */     this.defaultScopeModel[9].setRotationPoint(-70.0F, -58.5F, 12.0F);
/*      */     
/* 1934 */     this.defaultScopeModel[10].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1935 */     this.defaultScopeModel[10].setRotationPoint(-70.0F, -51.0F, 12.0F);
/*      */     
/* 1937 */     this.defaultScopeModel[11].addShapeBox(53.0F, -18.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 1938 */     this.defaultScopeModel[11].setRotationPoint(-74.75F, -59.0F, 12.0F);
/*      */     
/* 1940 */     this.defaultScopeModel[12].addShapeBox(53.0F, -18.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 1941 */     this.defaultScopeModel[12].setRotationPoint(-72.25F, -59.0F, 12.0F);
/*      */     
/* 1943 */     this.defaultScopeModel[13].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1944 */     this.defaultScopeModel[13].setRotationPoint(-72.0F, -55.5F, -1.0F);
/*      */     
/* 1946 */     this.defaultScopeModel[14].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1947 */     this.defaultScopeModel[14].setRotationPoint(-72.0F, -57.5F, -1.0F);
/*      */     
/* 1949 */     this.defaultScopeModel[15].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1950 */     this.defaultScopeModel[15].setRotationPoint(-72.0F, -53.5F, -1.0F);
/*      */     
/* 1952 */     this.defaultScopeModel[16].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1953 */     this.defaultScopeModel[16].setRotationPoint(-70.0F, -58.5F, -0.7F);
/*      */     
/* 1955 */     this.defaultScopeModel[17].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 1956 */     this.defaultScopeModel[17].setRotationPoint(-70.0F, -51.0F, -0.7F);
/*      */     
/* 1958 */     this.defaultScopeModel[18].addShapeBox(53.0F, -18.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 1959 */     this.defaultScopeModel[18].setRotationPoint(-74.75F, -59.0F, -0.7F);
/*      */     
/* 1961 */     this.defaultScopeModel[19].addShapeBox(53.0F, -18.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 1962 */     this.defaultScopeModel[19].setRotationPoint(-72.25F, -59.0F, -0.7F);
/*      */     
/* 1964 */     this.defaultScopeModel[20].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1965 */     this.defaultScopeModel[20].setRotationPoint(-73.5F, -58.0F, 9.0F);
/*      */     
/* 1967 */     this.defaultScopeModel[21].addShapeBox(53.0F, -18.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1968 */     this.defaultScopeModel[21].setRotationPoint(-73.5F, -55.0F, 9.0F);
/*      */     
/* 1970 */     this.defaultScopeModel[22].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1971 */     this.defaultScopeModel[22].setRotationPoint(-73.5F, -53.0F, 9.0F);
/*      */     
/* 1973 */     this.defaultScopeModel[23].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1974 */     this.defaultScopeModel[23].setRotationPoint(-73.5F, -58.0F, 2.0F);
/*      */     
/* 1976 */     this.defaultScopeModel[24].addShapeBox(53.0F, -18.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1977 */     this.defaultScopeModel[24].setRotationPoint(-73.5F, -55.0F, 2.0F);
/*      */     
/* 1979 */     this.defaultScopeModel[25].addShapeBox(53.0F, -18.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F);
/* 1980 */     this.defaultScopeModel[25].setRotationPoint(-73.5F, -53.0F, 2.0F);
/*      */     
/* 1982 */     this.defaultScopeModel[26].addShapeBox(53.0F, -18.0F, -6.0F, 6, 14, 2, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1983 */     this.defaultScopeModel[26].setRotationPoint(-72.0F, -65.0F, 3.5F);
/*      */     
/* 1985 */     this.defaultScopeModel[27].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1986 */     this.defaultScopeModel[27].setRotationPoint(-65.5F, -55.0F, 3.5F);
/*      */     
/* 1988 */     this.defaultScopeModel[28].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1989 */     this.defaultScopeModel[28].setRotationPoint(-65.5F, -56.0F, 3.5F);
/*      */     
/* 1991 */     this.defaultScopeModel[29].addShapeBox(53.0F, -18.0F, -6.0F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1992 */     this.defaultScopeModel[29].setRotationPoint(-66.5F, -55.0F, 1.5F);
/*      */     
/* 1994 */     this.defaultScopeModel[30].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1995 */     this.defaultScopeModel[30].setRotationPoint(-63.5F, -55.0F, 1.5F);
/*      */     
/* 1997 */     this.defaultScopeModel[31].addShapeBox(53.0F, -18.0F, -6.0F, 6, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1998 */     this.defaultScopeModel[31].setRotationPoint(-63.5F, -53.0F, 1.5F);
/*      */     
/* 2000 */     this.defaultScopeModel[32].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2001 */     this.defaultScopeModel[32].setRotationPoint(-57.5F, -53.0F, 1.5F);
/*      */     
/* 2003 */     this.defaultScopeModel[33].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2004 */     this.defaultScopeModel[33].setRotationPoint(-57.5F, -53.0F, 9.5F);
/*      */     
/* 2006 */     this.defaultScopeModel[34].addShapeBox(53.0F, -18.0F, -6.0F, 6, 14, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2007 */     this.defaultScopeModel[34].setRotationPoint(-72.0F, -65.0F, 5.5F);
/*      */     
/* 2009 */     this.defaultScopeModel[35].addShapeBox(53.0F, -18.0F, -6.0F, 6, 14, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2010 */     this.defaultScopeModel[35].setRotationPoint(-72.0F, -65.0F, 7.5F);
/*      */     
/* 2012 */     this.defaultScopeModel[36].addShapeBox(53.0F, -18.0F, -6.0F, 3, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2013 */     this.defaultScopeModel[36].setRotationPoint(-62.0F, -54.0F, 10.5F);
/*      */     
/* 2015 */     this.defaultScopeModel[37].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2016 */     this.defaultScopeModel[37].setRotationPoint(-62.0F, -51.0F, 10.5F);
/*      */     
/* 2018 */     this.defaultScopeModel[38].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2019 */     this.defaultScopeModel[38].setRotationPoint(-61.15F, -53.25F, 11.0F);
/*      */     
/* 2021 */     this.defaultScopeModel[39].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2022 */     this.defaultScopeModel[39].setRotationPoint(-60.9F, -52.5F, 11.0F);
/*      */     
/* 2024 */     this.defaultScopeModel[40].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2025 */     this.defaultScopeModel[40].setRotationPoint(-60.9F, -54.0F, 11.0F);
/*      */     
/* 2027 */     this.defaultScopeModel[41].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2028 */     this.defaultScopeModel[41].setRotationPoint(-61.65F, -54.0F, 11.0F);
/*      */     
/* 2030 */     this.defaultScopeModel[42].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2031 */     this.defaultScopeModel[42].setRotationPoint(-60.4F, -54.0F, 11.0F);
/*      */     
/* 2033 */     this.defaultScopeModel[43].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2034 */     this.defaultScopeModel[43].setRotationPoint(-61.65F, -52.75F, 11.0F);
/*      */     
/* 2036 */     this.defaultScopeModel[44].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2037 */     this.defaultScopeModel[44].setRotationPoint(-60.4F, -52.75F, 11.0F);
/*      */     
/* 2039 */     this.defaultScopeModel[45].addShapeBox(53.0F, -18.0F, -6.0F, 6, 5, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2040 */     this.defaultScopeModel[45].setRotationPoint(-72.15F, -61.5F, 5.35F);
/*      */     
/* 2042 */     this.defaultScopeModel[46].addShapeBox(53.0F, -18.0F, -6.0F, 6, 5, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F);
/* 2043 */     this.defaultScopeModel[46].setRotationPoint(-72.15F, -61.5F, 7.6F);
/*      */     
/* 2045 */     this.defaultScopeModel[47].addShapeBox(53.0F, -18.0F, -6.0F, 6, 5, 2, 0.0F, -1.75F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2046 */     this.defaultScopeModel[47].setRotationPoint(-72.15F, -61.5F, 3.1F);
/*      */     
/* 2048 */     this.defaultScopeModel[48].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2049 */     this.defaultScopeModel[48].setRotationPoint(-71.0F, -66.5F, 5.0F);
/*      */     
/* 2051 */     this.defaultScopeModel[49].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2052 */     this.defaultScopeModel[49].setRotationPoint(-71.0F, -68.0F, 4.5F);
/*      */     
/* 2054 */     this.defaultScopeModel[50].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2055 */     this.defaultScopeModel[50].setRotationPoint(-71.0F, -69.0F, 4.5F);
/*      */     
/* 2057 */     this.defaultScopeModel[51].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2058 */     this.defaultScopeModel[51].setRotationPoint(-71.0F, -69.0F, 7.5F);
/*      */     
/* 2060 */     this.defaultScopeModel[52].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2061 */     this.defaultScopeModel[52].setRotationPoint(-71.0F, -68.0F, 7.5F);
/*      */     
/* 2063 */     this.defaultScopeModel[53].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2064 */     this.defaultScopeModel[53].setRotationPoint(-71.0F, -69.5F, 5.5F);
/*      */     
/* 2066 */     this.defaultScopeModel[54].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 2067 */     this.defaultScopeModel[54].setRotationPoint(-71.0F, -69.0F, 5.5F);
/*      */     
/* 2069 */     this.defaultScopeModel[55].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2070 */     this.defaultScopeModel[55].setRotationPoint(-71.0F, -69.0F, 6.5F);
/*      */     
/* 2072 */     this.defaultScopeModel[56].addShapeBox(53.0F, -18.0F, -6.0F, 6, 3, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2073 */     this.defaultScopeModel[56].setRotationPoint(-72.0F, -68.5F, 8.5F);
/*      */     
/* 2075 */     this.defaultScopeModel[57].addShapeBox(53.0F, -18.0F, -6.0F, 6, 3, 1, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2076 */     this.defaultScopeModel[57].setRotationPoint(-72.0F, -68.5F, 3.5F);
/*      */     
/* 2078 */     this.defaultScopeModel[58].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2079 */     this.defaultScopeModel[58].setRotationPoint(-71.0F, -67.0F, 6.5F);
/*      */     
/* 2081 */     this.defaultScopeModel[59].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 2082 */     this.defaultScopeModel[59].setRotationPoint(-71.0F, -67.0F, 5.5F);
/*      */     
/* 2084 */     this.defaultScopeModel[60].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2085 */     this.defaultScopeModel[60].setRotationPoint(-69.25F, -66.5F, 5.0F);
/*      */     
/* 2087 */     this.defaultScopeModel[61].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2088 */     this.defaultScopeModel[61].setRotationPoint(-68.5F, -66.5F, 4.5F);
/*      */     
/* 2090 */     this.defaultScopeModel[62].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2091 */     this.defaultScopeModel[62].setRotationPoint(-68.5F, -66.5F, 7.5F);
/*      */     
/* 2093 */     this.defaultScopeModel[63].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F);
/* 2094 */     this.defaultScopeModel[63].setRotationPoint(-67.0F, -66.5F, 7.5F);
/*      */     
/* 2096 */     this.defaultScopeModel[64].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2097 */     this.defaultScopeModel[64].setRotationPoint(-67.0F, -66.5F, 4.5F);
/*      */     
/* 2099 */     this.defaultScopeModel[65].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2100 */     this.defaultScopeModel[65].setRotationPoint(-67.0F, -66.5F, 5.5F);
/*      */     
/* 2102 */     this.defaultScopeModel[66].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2103 */     this.defaultScopeModel[66].setRotationPoint(-68.75F, -66.5F, 6.5F);
/*      */     
/* 2105 */     this.defaultScopeModel[67].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F);
/* 2106 */     this.defaultScopeModel[67].setRotationPoint(-68.75F, -66.5F, 5.5F);
/*      */     
/* 2108 */     this.defaultScopeModel[68].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2109 */     this.defaultScopeModel[68].setRotationPoint(-67.5F, -66.5F, 6.5F);
/*      */     
/* 2111 */     this.defaultScopeModel[69].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F);
/* 2112 */     this.defaultScopeModel[69].setRotationPoint(-67.5F, -66.5F, 5.5F);
/*      */     
/* 2114 */     this.defaultScopeModel[70].addShapeBox(53.0F, -18.0F, -6.0F, 8, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2115 */     this.defaultScopeModel[70].setRotationPoint(79.5F, -58.0F, 2.5F);
/*      */     
/* 2117 */     this.defaultScopeModel[71].addShapeBox(53.0F, -18.0F, -6.0F, 8, 2, 2, 0.0F, -2.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2118 */     this.defaultScopeModel[71].setRotationPoint(79.5F, -60.0F, 2.5F);
/*      */     
/* 2120 */     this.defaultScopeModel[72].addShapeBox(53.0F, -18.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F);
/* 2121 */     this.defaultScopeModel[72].setRotationPoint(75.5F, -57.5F, 4.5F);
/*      */     
/* 2123 */     this.defaultScopeModel[73].addShapeBox(53.0F, -18.0F, -6.0F, 1, 3, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2124 */     this.defaultScopeModel[73].setRotationPoint(74.5F, -57.5F, 4.5F);
/*      */     
/* 2126 */     this.defaultScopeModel[74].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F);
/* 2127 */     this.defaultScopeModel[74].setRotationPoint(75.5F, -54.5F, 4.5F);
/*      */     
/* 2129 */     this.defaultScopeModel[75].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 1, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 2130 */     this.defaultScopeModel[75].setRotationPoint(84.5F, -56.0F, 10.5F);
/*      */     
/* 2132 */     this.defaultScopeModel[76].addShapeBox(53.0F, -18.0F, -6.0F, 3, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2133 */     this.defaultScopeModel[76].setRotationPoint(82.5F, -65.0F, 7.5F);
/*      */     
/* 2135 */     this.defaultScopeModel[77].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2136 */     this.defaultScopeModel[77].setRotationPoint(82.0F, -68.0F, 8.5F);
/*      */     
/* 2138 */     this.defaultScopeModel[78].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2139 */     this.defaultScopeModel[78].setRotationPoint(82.0F, -65.5F, 4.5F);
/*      */     
/* 2141 */     this.defaultScopeModel[79].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 1, 0.0F, -0.75F, -1.0F, 0.25F, -0.75F, -1.0F, 0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2142 */     this.defaultScopeModel[79].setRotationPoint(82.0F, -70.0F, 8.5F);
/*      */     
/* 2144 */     this.defaultScopeModel[80].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 1, 0.0F, -1.75F, -0.5F, 0.5F, -1.75F, -0.5F, 0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 2145 */     this.defaultScopeModel[80].setRotationPoint(82.0F, -70.0F, 8.25F);
/*      */     
/* 2147 */     this.defaultScopeModel[81].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2148 */     this.defaultScopeModel[81].setRotationPoint(80.5F, -56.0F, 10.5F);
/*      */     
/* 2150 */     this.defaultScopeModel[82].addShapeBox(53.0F, -18.0F, -6.0F, 1, 6, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2151 */     this.defaultScopeModel[82].setRotationPoint(83.5F, -58.0F, 10.5F);
/*      */     
/* 2153 */     this.defaultScopeModel[83].addShapeBox(53.0F, -18.0F, -6.0F, 1, 6, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2154 */     this.defaultScopeModel[83].setRotationPoint(82.0F, -58.0F, 10.5F);
/*      */     
/* 2156 */     this.defaultScopeModel[84].addShapeBox(53.0F, -18.0F, -6.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2157 */     this.defaultScopeModel[84].setRotationPoint(83.0F, -58.0F, 10.5F);
/*      */     
/* 2159 */     this.defaultScopeModel[85].addShapeBox(53.0F, -18.0F, -6.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F);
/* 2160 */     this.defaultScopeModel[85].setRotationPoint(78.5F, -57.5F, 4.5F);
/*      */     
/* 2162 */     this.defaultScopeModel[86].addShapeBox(53.0F, -18.0F, -6.0F, 8, 2, 2, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F, -2.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2163 */     this.defaultScopeModel[86].setRotationPoint(79.5F, -60.0F, 8.5F);
/*      */     
/* 2165 */     this.defaultScopeModel[87].addShapeBox(53.0F, -18.0F, -6.0F, 3, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2166 */     this.defaultScopeModel[87].setRotationPoint(82.5F, -65.0F, 4.5F);
/*      */     
/* 2168 */     this.defaultScopeModel[88].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2169 */     this.defaultScopeModel[88].setRotationPoint(82.0F, -65.5F, 7.5F);
/*      */     
/* 2171 */     this.defaultScopeModel[89].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2172 */     this.defaultScopeModel[89].setRotationPoint(82.0F, -68.0F, 3.5F);
/*      */     
/* 2174 */     this.defaultScopeModel[90].addShapeBox(53.0F, -18.0F, -6.0F, 4, 2, 1, 0.0F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, 0.25F, -0.75F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2175 */     this.defaultScopeModel[90].setRotationPoint(82.0F, -70.0F, 3.5F);
/*      */     
/* 2177 */     this.defaultScopeModel[91].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 1, 0.0F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.5F, -1.75F, -0.5F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 2178 */     this.defaultScopeModel[91].setRotationPoint(82.0F, -70.0F, 3.75F);
/*      */     
/* 2180 */     this.defaultScopeModel[92].addShapeBox(53.0F, -18.0F, -6.0F, 2, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2181 */     this.defaultScopeModel[92].setRotationPoint(83.0F, -65.0F, 5.5F);
/*      */     
/* 2183 */     this.defaultScopeModel[93].addShapeBox(53.0F, -18.0F, -6.0F, 1, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2184 */     this.defaultScopeModel[93].setRotationPoint(87.5F, -58.0F, 2.5F);
/*      */     
/* 2186 */     this.defaultScopeModel[94].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2187 */     this.defaultScopeModel[94].setRotationPoint(81.5F, -60.0F, 4.5F);
/*      */     
/* 2189 */     this.defaultScopeModel[95].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2190 */     this.defaultScopeModel[95].setRotationPoint(80.5F, -59.0F, 4.5F);
/*      */     
/* 2192 */     this.defaultScopeModel[96].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2193 */     this.defaultScopeModel[96].setRotationPoint(80.5F, -59.0F, 7.5F);
/*      */     
/* 2195 */     this.defaultScopeModel[97].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2196 */     this.defaultScopeModel[97].setRotationPoint(81.5F, -60.0F, 7.5F);
/*      */     
/* 2198 */     this.defaultScopeModel[98].addShapeBox(53.0F, -18.0F, -6.0F, 1, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2199 */     this.defaultScopeModel[98].setRotationPoint(87.5F, -58.0F, 7.5F);
/*      */     
/* 2201 */     this.defaultScopeModel[99].addShapeBox(53.0F, -18.0F, -6.0F, 1, 3, 4, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -2.0F, -0.5F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F);
/* 2202 */     this.defaultScopeModel[99].setRotationPoint(78.5F, -54.0F, 2.5F);
/*      */     
/* 2204 */     this.defaultScopeModel[100].addShapeBox(53.0F, -18.0F, -6.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2205 */     this.defaultScopeModel[100].setRotationPoint(87.5F, -58.0F, 6.0F);
/*      */     
/* 2207 */     this.defaultScopeModel[101].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2208 */     this.defaultScopeModel[101].setRotationPoint(85.5F, -60.0F, 4.5F);
/*      */     
/* 2210 */     this.defaultScopeModel[102].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2211 */     this.defaultScopeModel[102].setRotationPoint(86.5F, -59.0F, 4.5F);
/*      */     
/* 2213 */     this.defaultScopeModel[103].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2214 */     this.defaultScopeModel[103].setRotationPoint(86.5F, -59.0F, 7.5F);
/*      */     
/* 2216 */     this.defaultScopeModel[104].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2217 */     this.defaultScopeModel[104].setRotationPoint(85.5F, -60.0F, 7.5F);
/*      */     
/* 2219 */     this.defaultScopeModel[105].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2220 */     this.defaultScopeModel[105].setRotationPoint(86.0F, -59.0F, 5.5F);
/*      */     
/* 2222 */     this.defaultScopeModel[106].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2223 */     this.defaultScopeModel[106].setRotationPoint(85.0F, -60.0F, 5.5F);
/*      */     
/* 2225 */     this.defaultScopeModel[107].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2226 */     this.defaultScopeModel[107].setRotationPoint(82.0F, -66.25F, 7.75F);
/*      */     
/* 2228 */     this.defaultScopeModel[108].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2229 */     this.defaultScopeModel[108].setRotationPoint(82.5F, -65.25F, 6.75F);
/*      */     
/* 2231 */     this.defaultScopeModel[109].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F);
/* 2232 */     this.defaultScopeModel[109].setRotationPoint(77.5F, -52.0F, 2.5F);
/*      */     
/* 2234 */     this.defaultScopeModel[110].addShapeBox(53.0F, -18.0F, -6.0F, 1, 3, 4, 0.0F, 0.5F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F);
/* 2235 */     this.defaultScopeModel[110].setRotationPoint(78.5F, -54.0F, 6.5F);
/*      */     
/* 2237 */     this.defaultScopeModel[111].addShapeBox(53.0F, -18.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2238 */     this.defaultScopeModel[111].setRotationPoint(77.5F, -52.0F, 6.5F);
/*      */     
/* 2240 */     this.defaultScopeModel[112].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 2241 */     this.defaultScopeModel[112].setRotationPoint(82.5F, -65.25F, 5.25F);
/*      */     
/* 2243 */     this.defaultScopeModel[113].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2244 */     this.defaultScopeModel[113].setRotationPoint(82.0F, -66.25F, 4.25F);
/*      */     
/* 2246 */     this.defaultScopeModel[114].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2247 */     this.defaultScopeModel[114].setRotationPoint(82.5F, -64.0F, 8.5F);
/*      */     
/* 2249 */     this.defaultScopeModel[115].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F);
/* 2250 */     this.defaultScopeModel[115].setRotationPoint(82.5F, -62.0F, 8.5F);
/*      */     
/* 2252 */     this.defaultScopeModel[116].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2253 */     this.defaultScopeModel[116].setRotationPoint(82.5F, -63.0F, 8.5F);
/*      */     
/* 2255 */     this.defaultScopeModel[117].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2256 */     this.defaultScopeModel[117].setRotationPoint(82.5F, -64.0F, 4.0F);
/*      */     
/* 2258 */     this.defaultScopeModel[118].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F);
/* 2259 */     this.defaultScopeModel[118].setRotationPoint(82.5F, -62.0F, 4.0F);
/*      */     
/* 2261 */     this.defaultScopeModel[119].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2262 */     this.defaultScopeModel[119].setRotationPoint(82.5F, -63.0F, 4.0F);
/*      */     
/* 2264 */     this.defaultScopeModel[120].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2265 */     this.defaultScopeModel[120].setRotationPoint(75.0F, -57.0F, 4.0F);
/*      */     
/* 2267 */     this.defaultScopeModel[121].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2268 */     this.defaultScopeModel[121].setRotationPoint(75.0F, -55.0F, 4.0F);
/*      */     
/* 2270 */     this.defaultScopeModel[122].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2271 */     this.defaultScopeModel[122].setRotationPoint(75.0F, -56.0F, 4.0F);
/*      */     
/* 2273 */     this.defaultScopeModel[123].addShapeBox(53.0F, -18.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2274 */     this.defaultScopeModel[123].setRotationPoint(83.5F, -68.5F, 6.0F);
/*      */     
/* 2276 */     this.defaultScopeModel[124].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/* 2277 */     this.defaultScopeModel[124].setRotationPoint(83.5F, -66.5F, 6.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2282 */     this.ammoModel[0] = new ModelRendererTurbo(this, 913, 185, this.textureX, this.textureY);
/* 2283 */     this.ammoModel[1] = new ModelRendererTurbo(this, 209, 193, this.textureX, this.textureY);
/* 2284 */     this.ammoModel[2] = new ModelRendererTurbo(this, 393, 193, this.textureX, this.textureY);
/* 2285 */     this.ammoModel[3] = new ModelRendererTurbo(this, 481, 193, this.textureX, this.textureY);
/* 2286 */     this.ammoModel[4] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 2287 */     this.ammoModel[5] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/* 2288 */     this.ammoModel[6] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/* 2289 */     this.ammoModel[7] = new ModelRendererTurbo(this, 961, 97, this.textureX, this.textureY);
/* 2290 */     this.ammoModel[8] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/* 2291 */     this.ammoModel[9] = new ModelRendererTurbo(this, 729, 185, this.textureX, this.textureY);
/* 2292 */     this.ammoModel[10] = new ModelRendererTurbo(this, 289, 169, this.textureX, this.textureY);
/* 2293 */     this.ammoModel[11] = new ModelRendererTurbo(this, 937, 137, this.textureX, this.textureY);
/* 2294 */     this.ammoModel[12] = new ModelRendererTurbo(this, 1009, 153, this.textureX, this.textureY);
/* 2295 */     this.ammoModel[13] = new ModelRendererTurbo(this, 1001, 185, this.textureX, this.textureY);
/* 2296 */     this.ammoModel[14] = new ModelRendererTurbo(this, 897, 97, this.textureX, this.textureY);
/* 2297 */     this.ammoModel[15] = new ModelRendererTurbo(this, 377, 169, this.textureX, this.textureY);
/* 2298 */     this.ammoModel[16] = new ModelRendererTurbo(this, 1017, 65, this.textureX, this.textureY);
/* 2299 */     this.ammoModel[17] = new ModelRendererTurbo(this, 465, 145, this.textureX, this.textureY);
/* 2300 */     this.ammoModel[18] = new ModelRendererTurbo(this, 33, 193, this.textureX, this.textureY);
/* 2301 */     this.ammoModel[19] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 2302 */     this.ammoModel[20] = new ModelRendererTurbo(this, 393, 169, this.textureX, this.textureY);
/* 2303 */     this.ammoModel[21] = new ModelRendererTurbo(this, 985, 97, this.textureX, this.textureY);
/* 2304 */     this.ammoModel[22] = new ModelRendererTurbo(this, 545, 145, this.textureX, this.textureY);
/* 2305 */     this.ammoModel[23] = new ModelRendererTurbo(this, 49, 193, this.textureX, this.textureY);
/* 2306 */     this.ammoModel[24] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/* 2307 */     this.ammoModel[25] = new ModelRendererTurbo(this, 57, 129, this.textureX, this.textureY);
/* 2308 */     this.ammoModel[26] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/* 2309 */     this.ammoModel[27] = new ModelRendererTurbo(this, 881, 177, this.textureX, this.textureY);
/* 2310 */     this.ammoModel[28] = new ModelRendererTurbo(this, 377, 145, this.textureX, this.textureY);
/* 2311 */     this.ammoModel[29] = new ModelRendererTurbo(this, 1017, 153, this.textureX, this.textureY);
/* 2312 */     this.ammoModel[30] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/* 2313 */     this.ammoModel[31] = new ModelRendererTurbo(this, 569, 193, this.textureX, this.textureY);
/* 2314 */     this.ammoModel[32] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/* 2315 */     this.ammoModel[33] = new ModelRendererTurbo(this, 441, 169, this.textureX, this.textureY);
/* 2316 */     this.ammoModel[34] = new ModelRendererTurbo(this, 593, 193, this.textureX, this.textureY);
/* 2317 */     this.ammoModel[35] = new ModelRendererTurbo(this, 513, 105, this.textureX, this.textureY);
/* 2318 */     this.ammoModel[36] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/* 2319 */     this.ammoModel[37] = new ModelRendererTurbo(this, 961, 137, this.textureX, this.textureY);
/* 2320 */     this.ammoModel[38] = new ModelRendererTurbo(this, 945, 161, this.textureX, this.textureY);
/* 2321 */     this.ammoModel[39] = new ModelRendererTurbo(this, 321, 193, this.textureX, this.textureY);
/* 2322 */     this.ammoModel[40] = new ModelRendererTurbo(this, 913, 97, this.textureX, this.textureY);
/* 2323 */     this.ammoModel[41] = new ModelRendererTurbo(this, 913, 177, this.textureX, this.textureY);
/* 2324 */     this.ammoModel[42] = new ModelRendererTurbo(this, 401, 145, this.textureX, this.textureY);
/* 2325 */     this.ammoModel[43] = new ModelRendererTurbo(this, 449, 169, this.textureX, this.textureY);
/* 2326 */     this.ammoModel[44] = new ModelRendererTurbo(this, 617, 193, this.textureX, this.textureY);
/* 2327 */     this.ammoModel[45] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 2328 */     this.ammoModel[46] = new ModelRendererTurbo(this, 817, 177, this.textureX, this.textureY);
/* 2329 */     this.ammoModel[47] = new ModelRendererTurbo(this, 121, 193, this.textureX, this.textureY);
/* 2330 */     this.ammoModel[48] = new ModelRendererTurbo(this, 633, 193, this.textureX, this.textureY);
/* 2331 */     this.ammoModel[49] = new ModelRendererTurbo(this, 665, 193, this.textureX, this.textureY);
/*      */     
/* 2333 */     this.ammoModel[0].addShapeBox(53.0F, -18.0F, -6.0F, 31, 17, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2334 */     this.ammoModel[0].setRotationPoint(-13.0F, -3.0F, 1.0F);
/*      */     
/* 2336 */     this.ammoModel[1].addShapeBox(53.0F, -18.0F, -6.0F, 31, 12, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2337 */     this.ammoModel[1].setRotationPoint(-13.0F, 14.0F, 1.0F);
/*      */     
/* 2339 */     this.ammoModel[2].addShapeBox(53.0F, -18.0F, -6.0F, 31, 21, 11, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -6.0F, 4.0F, 0.0F, 5.0F, -3.5F, 0.0F, 5.0F, -3.5F, 0.0F, -6.0F, 4.0F, 0.0F);
/* 2340 */     this.ammoModel[2].setRotationPoint(-10.0F, 36.0F, 1.0F);
/*      */     
/* 2342 */     this.ammoModel[3].addShapeBox(53.0F, -18.0F, -6.0F, 31, 10, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2343 */     this.ammoModel[3].setRotationPoint(-12.0F, 26.0F, 1.0F);
/*      */     
/* 2345 */     this.ammoModel[4].addShapeBox(53.0F, -18.0F, -6.0F, 24, 5, 1, 0.0F, 2.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, -0.5F, 0.0F, 2.5F, -0.5F);
/* 2346 */     this.ammoModel[4].setRotationPoint(2.0F, 52.0F, 0.5F);
/*      */     
/* 2348 */     this.ammoModel[5].addShapeBox(53.0F, -18.0F, -6.0F, 17, 4, 1, 0.0F, 1.35F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, 1.35F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2349 */     this.ammoModel[5].setRotationPoint(8.0F, 48.0F, 0.5F);
/*      */     
/* 2351 */     this.ammoModel[6].addShapeBox(53.0F, -18.0F, -6.0F, 6, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2352 */     this.ammoModel[6].setRotationPoint(17.0F, 36.0F, 0.5F);
/*      */     
/* 2354 */     this.ammoModel[7].addShapeBox(53.0F, -18.0F, -6.0F, 3, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2355 */     this.ammoModel[7].setRotationPoint(17.0F, 26.0F, 0.5F);
/*      */     
/* 2357 */     this.ammoModel[8].addShapeBox(53.0F, -18.0F, -6.0F, 1, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2358 */     this.ammoModel[8].setRotationPoint(17.0F, 14.0F, 0.5F);
/*      */     
/* 2360 */     this.ammoModel[9].addShapeBox(53.0F, -18.0F, -6.0F, 7, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2361 */     this.ammoModel[9].setRotationPoint(11.0F, -3.0F, 0.5F);
/*      */     
/* 2363 */     this.ammoModel[10].addShapeBox(53.0F, -18.0F, -6.0F, 7, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2364 */     this.ammoModel[10].setRotationPoint(6.0F, 36.0F, 0.5F);
/*      */     
/* 2366 */     this.ammoModel[11].addShapeBox(53.0F, -18.0F, -6.0F, 4, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2367 */     this.ammoModel[11].setRotationPoint(6.0F, 26.0F, 0.5F);
/*      */     
/* 2369 */     this.ammoModel[12].addShapeBox(53.0F, -18.0F, -6.0F, 2, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2370 */     this.ammoModel[12].setRotationPoint(6.0F, 14.0F, 0.5F);
/*      */     
/* 2372 */     this.ammoModel[13].addShapeBox(53.0F, -18.0F, -6.0F, 8, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2373 */     this.ammoModel[13].setRotationPoint(0.0F, -3.0F, 0.5F);
/*      */     
/* 2375 */     this.ammoModel[14].addShapeBox(53.0F, -18.0F, -6.0F, 5, 4, 1, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F);
/* 2376 */     this.ammoModel[14].setRotationPoint(-1.0F, 48.0F, 0.5F);
/*      */     
/* 2378 */     this.ammoModel[15].addShapeBox(53.0F, -18.0F, -6.0F, 5, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2379 */     this.ammoModel[15].setRotationPoint(-2.0F, 36.0F, 0.5F);
/*      */     
/* 2381 */     this.ammoModel[16].addShapeBox(53.0F, -18.0F, -6.0F, 2, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2382 */     this.ammoModel[16].setRotationPoint(-2.0F, 26.0F, 0.5F);
/*      */     
/* 2384 */     this.ammoModel[17].addShapeBox(53.0F, -18.0F, -6.0F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2385 */     this.ammoModel[17].setRotationPoint(-3.0F, 14.0F, 0.5F);
/*      */     
/* 2387 */     this.ammoModel[18].addShapeBox(53.0F, -18.0F, -6.0F, 6, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2388 */     this.ammoModel[18].setRotationPoint(-8.0F, -3.0F, 0.5F);
/*      */     
/* 2390 */     this.ammoModel[19].addShapeBox(53.0F, -18.0F, -6.0F, 3, 4, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F);
/* 2391 */     this.ammoModel[19].setRotationPoint(-6.5F, 48.0F, 0.5F);
/*      */     
/* 2393 */     this.ammoModel[20].addShapeBox(53.0F, -18.0F, -6.0F, 3, 12, 1, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 2394 */     this.ammoModel[20].setRotationPoint(-7.5F, 36.0F, 0.5F);
/*      */     
/* 2396 */     this.ammoModel[21].addShapeBox(53.0F, -18.0F, -6.0F, 1, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F);
/* 2397 */     this.ammoModel[21].setRotationPoint(-7.5F, 26.0F, 0.5F);
/*      */     
/* 2399 */     this.ammoModel[22].addShapeBox(53.0F, -18.0F, -6.0F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2400 */     this.ammoModel[22].setRotationPoint(-8.5F, 14.0F, 0.5F);
/*      */     
/* 2402 */     this.ammoModel[23].addShapeBox(53.0F, -18.0F, -6.0F, 4, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2403 */     this.ammoModel[23].setRotationPoint(-13.5F, -3.0F, 0.5F);
/*      */     
/* 2405 */     this.ammoModel[24].addShapeBox(53.0F, -18.0F, -6.0F, 3, 9, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 3.25F, -1.2F, 0.0F, 3.25F, -1.2F, -0.5F, -1.5F, 0.0F, -0.5F);
/* 2406 */     this.ammoModel[24].setRotationPoint(-5.5F, 52.0F, 0.5F);
/*      */     
/* 2408 */     this.ammoModel[25].addShapeBox(53.0F, -18.0F, -6.0F, 24, 5, 1, 0.0F, 2.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 2.25F, 0.0F, -0.5F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, -0.5F, 0.0F, 2.5F, -0.5F);
/* 2409 */     this.ammoModel[25].setRotationPoint(2.0F, 52.0F, 12.0F);
/*      */     
/* 2411 */     this.ammoModel[26].addShapeBox(53.0F, -18.0F, -6.0F, 17, 4, 1, 0.0F, 1.35F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, 1.35F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2412 */     this.ammoModel[26].setRotationPoint(8.0F, 48.0F, 12.0F);
/*      */     
/* 2414 */     this.ammoModel[27].addShapeBox(53.0F, -18.0F, -6.0F, 6, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2415 */     this.ammoModel[27].setRotationPoint(17.0F, 36.0F, 12.0F);
/*      */     
/* 2417 */     this.ammoModel[28].addShapeBox(53.0F, -18.0F, -6.0F, 3, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2418 */     this.ammoModel[28].setRotationPoint(17.0F, 26.0F, 12.0F);
/*      */     
/* 2420 */     this.ammoModel[29].addShapeBox(53.0F, -18.0F, -6.0F, 1, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2421 */     this.ammoModel[29].setRotationPoint(17.0F, 14.0F, 12.0F);
/*      */     
/* 2423 */     this.ammoModel[30].addShapeBox(53.0F, -18.0F, -6.0F, 7, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2424 */     this.ammoModel[30].setRotationPoint(11.0F, -3.0F, 12.0F);
/*      */     
/* 2426 */     this.ammoModel[31].addShapeBox(53.0F, -18.0F, -6.0F, 7, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2427 */     this.ammoModel[31].setRotationPoint(6.0F, 36.0F, 12.0F);
/*      */     
/* 2429 */     this.ammoModel[32].addShapeBox(53.0F, -18.0F, -6.0F, 4, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2430 */     this.ammoModel[32].setRotationPoint(6.0F, 26.0F, 12.0F);
/*      */     
/* 2432 */     this.ammoModel[33].addShapeBox(53.0F, -18.0F, -6.0F, 2, 12, 1, 0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 5.5F, 0.0F, -0.5F, 4.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F);
/* 2433 */     this.ammoModel[33].setRotationPoint(6.0F, 14.0F, 12.0F);
/*      */     
/* 2435 */     this.ammoModel[34].addShapeBox(53.0F, -18.0F, -6.0F, 8, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2436 */     this.ammoModel[34].setRotationPoint(0.0F, -3.0F, 12.0F);
/*      */     
/* 2438 */     this.ammoModel[35].addShapeBox(53.0F, -18.0F, -6.0F, 5, 4, 1, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F);
/* 2439 */     this.ammoModel[35].setRotationPoint(-1.0F, 48.0F, 12.0F);
/*      */     
/* 2441 */     this.ammoModel[36].addShapeBox(53.0F, -18.0F, -6.0F, 5, 12, 1, 0.0F, 2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F);
/* 2442 */     this.ammoModel[36].setRotationPoint(-2.0F, 36.0F, 12.0F);
/*      */     
/* 2444 */     this.ammoModel[37].addShapeBox(53.0F, -18.0F, -6.0F, 2, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F);
/* 2445 */     this.ammoModel[37].setRotationPoint(-2.0F, 26.0F, 12.0F);
/*      */     
/* 2447 */     this.ammoModel[38].addShapeBox(53.0F, -18.0F, -6.0F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2448 */     this.ammoModel[38].setRotationPoint(-3.0F, 14.0F, 12.0F);
/*      */     
/* 2450 */     this.ammoModel[39].addShapeBox(53.0F, -18.0F, -6.0F, 6, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2451 */     this.ammoModel[39].setRotationPoint(-8.0F, -3.0F, 12.0F);
/*      */     
/* 2453 */     this.ammoModel[40].addShapeBox(53.0F, -18.0F, -6.0F, 3, 4, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F);
/* 2454 */     this.ammoModel[40].setRotationPoint(-6.5F, 48.0F, 12.0F);
/*      */     
/* 2456 */     this.ammoModel[41].addShapeBox(53.0F, -18.0F, -6.0F, 3, 12, 1, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 2457 */     this.ammoModel[41].setRotationPoint(-7.5F, 36.0F, 12.0F);
/*      */     
/* 2459 */     this.ammoModel[42].addShapeBox(53.0F, -18.0F, -6.0F, 1, 10, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F);
/* 2460 */     this.ammoModel[42].setRotationPoint(-7.5F, 26.0F, 12.0F);
/*      */     
/* 2462 */     this.ammoModel[43].addShapeBox(53.0F, -18.0F, -6.0F, 1, 12, 1, 0.0F, 4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 4.5F, 0.0F, -0.5F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F);
/* 2463 */     this.ammoModel[43].setRotationPoint(-8.5F, 14.0F, 12.0F);
/*      */     
/* 2465 */     this.ammoModel[44].addShapeBox(53.0F, -18.0F, -6.0F, 4, 17, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 2466 */     this.ammoModel[44].setRotationPoint(-13.5F, -3.0F, 12.0F);
/*      */     
/* 2468 */     this.ammoModel[45].addShapeBox(53.0F, -18.0F, -6.0F, 3, 9, 1, 0.0F, 0.9F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.9F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 3.25F, -1.2F, 0.0F, 3.25F, -1.2F, -0.5F, -1.5F, 0.0F, -0.5F);
/* 2469 */     this.ammoModel[45].setRotationPoint(-5.5F, 52.0F, 12.0F);
/*      */     
/* 2471 */     this.ammoModel[46].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 12, 0.0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2472 */     this.ammoModel[46].setRotationPoint(5.5F, 51.0F, 0.5F);
/*      */     
/* 2474 */     this.ammoModel[47].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 12, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2475 */     this.ammoModel[47].setRotationPoint(7.25F, 51.0F, 0.5F);
/*      */     
/* 2477 */     this.ammoModel[48].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 12, 0.0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 2478 */     this.ammoModel[48].setRotationPoint(14.25F, 47.0F, 0.5F);
/*      */     
/* 2480 */     this.ammoModel[49].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 12, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2481 */     this.ammoModel[49].setRotationPoint(17.0F, 47.0F, 0.5F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 2486 */     this.slideModel[0] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/* 2487 */     this.slideModel[1] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/* 2488 */     this.slideModel[2] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/* 2489 */     this.slideModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 2490 */     this.slideModel[4] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 2491 */     this.slideModel[5] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 2492 */     this.slideModel[6] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 2493 */     this.slideModel[7] = new ModelRendererTurbo(this, 737, 17, this.textureX, this.textureY);
/* 2494 */     this.slideModel[8] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/* 2495 */     this.slideModel[9] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/* 2496 */     this.slideModel[10] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/* 2497 */     this.slideModel[11] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 2498 */     this.slideModel[12] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/* 2499 */     this.slideModel[13] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
/* 2500 */     this.slideModel[14] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/* 2501 */     this.slideModel[15] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/* 2502 */     this.slideModel[16] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 2503 */     this.slideModel[17] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 2504 */     this.slideModel[18] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/* 2505 */     this.slideModel[19] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/* 2506 */     this.slideModel[20] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/* 2507 */     this.slideModel[21] = new ModelRendererTurbo(this, 641, 9, this.textureX, this.textureY);
/* 2508 */     this.slideModel[22] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/* 2509 */     this.slideModel[23] = new ModelRendererTurbo(this, 817, 9, this.textureX, this.textureY);
/* 2510 */     this.slideModel[24] = new ModelRendererTurbo(this, 825, 9, this.textureX, this.textureY);
/* 2511 */     this.slideModel[25] = new ModelRendererTurbo(this, 833, 9, this.textureX, this.textureY);
/* 2512 */     this.slideModel[26] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/* 2513 */     this.slideModel[27] = new ModelRendererTurbo(this, 1017, 9, this.textureX, this.textureY);
/* 2514 */     this.slideModel[28] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 2515 */     this.slideModel[29] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 2516 */     this.slideModel[30] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 2517 */     this.slideModel[31] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 2518 */     this.slideModel[32] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/* 2519 */     this.slideModel[33] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 2520 */     this.slideModel[34] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/* 2521 */     this.slideModel[35] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/* 2522 */     this.slideModel[36] = new ModelRendererTurbo(this, 481, 217, this.textureX, this.textureY);
/*      */     
/* 2524 */     this.slideModel[0].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2525 */     this.slideModel[0].setRotationPoint(53.5F, -44.25F, 11.5F);
/*      */     
/* 2527 */     this.slideModel[1].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2528 */     this.slideModel[1].setRotationPoint(51.75F, -44.25F, 11.5F);
/*      */     
/* 2530 */     this.slideModel[2].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2531 */     this.slideModel[2].setRotationPoint(55.25F, -44.25F, 11.5F);
/*      */     
/* 2533 */     this.slideModel[3].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2534 */     this.slideModel[3].setRotationPoint(52.0F, -42.5F, 11.5F);
/*      */     
/* 2536 */     this.slideModel[4].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2537 */     this.slideModel[4].setRotationPoint(55.25F, -41.0F, 11.5F);
/*      */     
/* 2539 */     this.slideModel[5].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2540 */     this.slideModel[5].setRotationPoint(53.5F, -40.75F, 11.5F);
/*      */     
/* 2542 */     this.slideModel[6].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2543 */     this.slideModel[6].setRotationPoint(51.75F, -41.0F, 11.5F);
/*      */     
/* 2545 */     this.slideModel[7].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2546 */     this.slideModel[7].setRotationPoint(52.6F, -42.65F, 12.5F);
/*      */     
/* 2548 */     this.slideModel[8].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2549 */     this.slideModel[8].setRotationPoint(52.6F, -41.65F, 12.5F);
/*      */     
/* 2551 */     this.slideModel[9].addShapeBox(53.0F, -18.0F, -6.0F, 3, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2552 */     this.slideModel[9].setRotationPoint(52.6F, -43.65F, 12.5F);
/*      */     
/* 2554 */     this.slideModel[10].addShapeBox(53.0F, -18.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2555 */     this.slideModel[10].setRotationPoint(53.1F, -43.15F, 9.5F);
/*      */     
/* 2557 */     this.slideModel[11].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2558 */     this.slideModel[11].setRotationPoint(53.5F, -44.25F, 18.5F);
/*      */     
/* 2560 */     this.slideModel[12].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2561 */     this.slideModel[12].setRotationPoint(51.75F, -44.25F, 18.5F);
/*      */     
/* 2563 */     this.slideModel[13].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2564 */     this.slideModel[13].setRotationPoint(55.25F, -44.25F, 18.5F);
/*      */     
/* 2566 */     this.slideModel[14].addShapeBox(53.0F, -18.0F, -6.0F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2567 */     this.slideModel[14].setRotationPoint(52.0F, -42.5F, 18.5F);
/*      */     
/* 2569 */     this.slideModel[15].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2570 */     this.slideModel[15].setRotationPoint(55.25F, -41.0F, 18.5F);
/*      */     
/* 2572 */     this.slideModel[16].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2573 */     this.slideModel[16].setRotationPoint(53.5F, -40.75F, 18.5F);
/*      */     
/* 2575 */     this.slideModel[17].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2576 */     this.slideModel[17].setRotationPoint(51.75F, -41.0F, 18.5F);
/*      */     
/* 2578 */     this.slideModel[18].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2579 */     this.slideModel[18].setRotationPoint(53.5F, -44.25F, 17.5F);
/*      */     
/* 2581 */     this.slideModel[19].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2582 */     this.slideModel[19].setRotationPoint(51.75F, -44.25F, 17.5F);
/*      */     
/* 2584 */     this.slideModel[20].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2585 */     this.slideModel[20].setRotationPoint(55.25F, -44.25F, 17.5F);
/*      */     
/* 2587 */     this.slideModel[21].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2588 */     this.slideModel[21].setRotationPoint(55.25F, -41.0F, 17.5F);
/*      */     
/* 2590 */     this.slideModel[22].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2591 */     this.slideModel[22].setRotationPoint(53.5F, -40.75F, 17.5F);
/*      */     
/* 2593 */     this.slideModel[23].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2594 */     this.slideModel[23].setRotationPoint(51.75F, -41.0F, 17.5F);
/*      */     
/* 2596 */     this.slideModel[24].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2597 */     this.slideModel[24].setRotationPoint(53.5F, -42.5F, 16.5F);
/*      */     
/* 2599 */     this.slideModel[25].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2600 */     this.slideModel[25].setRotationPoint(51.75F, -42.5F, 17.5F);
/*      */     
/* 2602 */     this.slideModel[26].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2603 */     this.slideModel[26].setRotationPoint(55.5F, -42.5F, 17.5F);
/*      */     
/* 2605 */     this.slideModel[27].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F);
/* 2606 */     this.slideModel[27].setRotationPoint(55.5F, -42.5F, 12.5F);
/*      */     
/* 2608 */     this.slideModel[28].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F);
/* 2609 */     this.slideModel[28].setRotationPoint(55.25F, -44.25F, 12.5F);
/*      */     
/* 2611 */     this.slideModel[29].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2612 */     this.slideModel[29].setRotationPoint(53.5F, -42.5F, 12.5F);
/*      */     
/* 2614 */     this.slideModel[30].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2615 */     this.slideModel[30].setRotationPoint(51.75F, -44.25F, 12.5F);
/*      */     
/* 2617 */     this.slideModel[31].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2618 */     this.slideModel[31].setRotationPoint(53.5F, -44.25F, 12.5F);
/*      */     
/* 2620 */     this.slideModel[32].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2621 */     this.slideModel[32].setRotationPoint(51.75F, -42.5F, 12.5F);
/*      */     
/* 2623 */     this.slideModel[33].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F);
/* 2624 */     this.slideModel[33].setRotationPoint(51.75F, -41.0F, 12.5F);
/*      */     
/* 2626 */     this.slideModel[34].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/* 2627 */     this.slideModel[34].setRotationPoint(53.5F, -40.75F, 12.5F);
/*      */     
/* 2629 */     this.slideModel[35].addShapeBox(53.0F, -18.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F);
/* 2630 */     this.slideModel[35].setRotationPoint(55.25F, -41.0F, 12.5F);
/*      */     
/* 2632 */     this.slideModel[36].addBox(53.0F, -18.0F, -6.0F, 46, 8, 7, 0.0F);
/* 2633 */     this.slideModel[36].setRotationPoint(-25.0F, -34.0F, -1.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelscarpdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */