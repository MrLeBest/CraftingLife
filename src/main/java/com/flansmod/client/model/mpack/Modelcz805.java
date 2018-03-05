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
/*      */ public class Modelcz805
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelcz805()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ˆ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[87];
/*   23 */     this.ammoModel = new ModelRendererTurbo[22];
/*   24 */     this.slideModel = new ModelRendererTurbo[13];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initgunModel_2();
/*   28 */     initdefaultScopeModel_1();
/*   29 */     initammoModel_1();
/*   30 */     initslideModel_1();
/*      */     
/*      */ 
/*   33 */     this.barrelAttachPoint = new Vector3f(18.75F, 1.375F, 0.0F);
/*      */     
/*   35 */     this.scopeAttachPoint = new Vector3f(0.3125F, 6.4375F, 0.0F);
/*      */     
/*   37 */     this.gripAttachPoint = new Vector3f(12.1875F, 3.0F, 0.0F);
/*      */     
/*      */ 
/*      */ 
/*   41 */     translateAll(2.0F, -9.0F, -0.2F);
/*   42 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.06F, 0.0F);
/*      */     
/*   44 */     this.gunSlideDistance = 5.0F;
/*   45 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   48 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   53 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[1] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[2] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[3] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[4] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[5] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[6] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[7] = new ModelRendererTurbo(this, 513, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[8] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[9] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[10] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[11] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[12] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[13] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[14] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[15] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[16] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[17] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[18] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[19] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[20] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[21] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[22] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*   76 */     this.gunModel[23] = new ModelRendererTurbo(this, 513, 33, this.textureX, this.textureY);
/*   77 */     this.gunModel[24] = new ModelRendererTurbo(this, 665, 57, this.textureX, this.textureY);
/*   78 */     this.gunModel[25] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[26] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[27] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[28] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[29] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[30] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[31] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[32] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[33] = new ModelRendererTurbo(this, 881, 9, this.textureX, this.textureY);
/*   87 */     this.gunModel[34] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*   88 */     this.gunModel[35] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[36] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/*   90 */     this.gunModel[37] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[38] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*   92 */     this.gunModel[39] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*   93 */     this.gunModel[40] = new ModelRendererTurbo(this, 641, 81, this.textureX, this.textureY);
/*   94 */     this.gunModel[41] = new ModelRendererTurbo(this, 697, 81, this.textureX, this.textureY);
/*   95 */     this.gunModel[42] = new ModelRendererTurbo(this, 57, 97, this.textureX, this.textureY);
/*   96 */     this.gunModel[43] = new ModelRendererTurbo(this, 601, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[44] = new ModelRendererTurbo(this, 753, 81, this.textureX, this.textureY);
/*   98 */     this.gunModel[45] = new ModelRendererTurbo(this, 817, 81, this.textureX, this.textureY);
/*   99 */     this.gunModel[46] = new ModelRendererTurbo(this, 417, 97, this.textureX, this.textureY);
/*  100 */     this.gunModel[47] = new ModelRendererTurbo(this, 593, 113, this.textureX, this.textureY);
/*  101 */     this.gunModel[48] = new ModelRendererTurbo(this, 729, 113, this.textureX, this.textureY);
/*  102 */     this.gunModel[49] = new ModelRendererTurbo(this, 809, 113, this.textureX, this.textureY);
/*  103 */     this.gunModel[50] = new ModelRendererTurbo(this, 865, 113, this.textureX, this.textureY);
/*  104 */     this.gunModel[51] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  105 */     this.gunModel[52] = new ModelRendererTurbo(this, 185, 145, this.textureX, this.textureY);
/*  106 */     this.gunModel[53] = new ModelRendererTurbo(this, 657, 145, this.textureX, this.textureY);
/*  107 */     this.gunModel[54] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*  108 */     this.gunModel[55] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/*  109 */     this.gunModel[56] = new ModelRendererTurbo(this, 769, 1, this.textureX, this.textureY);
/*  110 */     this.gunModel[57] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[58] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  112 */     this.gunModel[59] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  113 */     this.gunModel[60] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  114 */     this.gunModel[61] = new ModelRendererTurbo(this, 737, 33, this.textureX, this.textureY);
/*  115 */     this.gunModel[62] = new ModelRendererTurbo(this, 785, 33, this.textureX, this.textureY);
/*  116 */     this.gunModel[63] = new ModelRendererTurbo(this, 833, 33, this.textureX, this.textureY);
/*  117 */     this.gunModel[64] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  118 */     this.gunModel[65] = new ModelRendererTurbo(this, 225, 177, this.textureX, this.textureY);
/*  119 */     this.gunModel[66] = new ModelRendererTurbo(this, 345, 177, this.textureX, this.textureY);
/*  120 */     this.gunModel[67] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  121 */     this.gunModel[68] = new ModelRendererTurbo(this, 977, 41, this.textureX, this.textureY);
/*  122 */     this.gunModel[69] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  123 */     this.gunModel[70] = new ModelRendererTurbo(this, 793, 81, this.textureX, this.textureY);
/*  124 */     this.gunModel[71] = new ModelRendererTurbo(this, 785, 113, this.textureX, this.textureY);
/*  125 */     this.gunModel[72] = new ModelRendererTurbo(this, 945, 113, this.textureX, this.textureY);
/*  126 */     this.gunModel[73] = new ModelRendererTurbo(this, 841, 113, this.textureX, this.textureY);
/*  127 */     this.gunModel[74] = new ModelRendererTurbo(this, 977, 121, this.textureX, this.textureY);
/*  128 */     this.gunModel[75] = new ModelRendererTurbo(this, 961, 153, this.textureX, this.textureY);
/*  129 */     this.gunModel[76] = new ModelRendererTurbo(this, 537, 177, this.textureX, this.textureY);
/*  130 */     this.gunModel[77] = new ModelRendererTurbo(this, 585, 177, this.textureX, this.textureY);
/*  131 */     this.gunModel[78] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  132 */     this.gunModel[79] = new ModelRendererTurbo(this, 633, 177, this.textureX, this.textureY);
/*  133 */     this.gunModel[80] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[81] = new ModelRendererTurbo(this, 673, 81, this.textureX, this.textureY);
/*  135 */     this.gunModel[82] = new ModelRendererTurbo(this, 729, 81, this.textureX, this.textureY);
/*  136 */     this.gunModel[83] = new ModelRendererTurbo(this, 921, 113, this.textureX, this.textureY);
/*  137 */     this.gunModel[84] = new ModelRendererTurbo(this, 841, 177, this.textureX, this.textureY);
/*  138 */     this.gunModel[85] = new ModelRendererTurbo(this, 889, 177, this.textureX, this.textureY);
/*  139 */     this.gunModel[86] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  140 */     this.gunModel[87] = new ModelRendererTurbo(this, 633, 201, this.textureX, this.textureY);
/*  141 */     this.gunModel[88] = new ModelRendererTurbo(this, 913, 177, this.textureX, this.textureY);
/*  142 */     this.gunModel[89] = new ModelRendererTurbo(this, 945, 193, this.textureX, this.textureY);
/*  143 */     this.gunModel[90] = new ModelRendererTurbo(this, 601, 225, this.textureX, this.textureY);
/*  144 */     this.gunModel[91] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[92] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*  146 */     this.gunModel[93] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  147 */     this.gunModel[94] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  148 */     this.gunModel[95] = new ModelRendererTurbo(this, 873, 201, this.textureX, this.textureY);
/*  149 */     this.gunModel[96] = new ModelRendererTurbo(this, 905, 225, this.textureX, this.textureY);
/*  150 */     this.gunModel[97] = new ModelRendererTurbo(this, 97, 233, this.textureX, this.textureY);
/*  151 */     this.gunModel[98] = new ModelRendererTurbo(this, 153, 233, this.textureX, this.textureY);
/*  152 */     this.gunModel[99] = new ModelRendererTurbo(this, 209, 233, this.textureX, this.textureY);
/*  153 */     this.gunModel[100] = new ModelRendererTurbo(this, 265, 233, this.textureX, this.textureY);
/*  154 */     this.gunModel[101] = new ModelRendererTurbo(this, 297, 241, this.textureX, this.textureY);
/*  155 */     this.gunModel[102] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  156 */     this.gunModel[103] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[104] = new ModelRendererTurbo(this, 601, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[105] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[106] = new ModelRendererTurbo(this, 649, 33, this.textureX, this.textureY);
/*  160 */     this.gunModel[107] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*  161 */     this.gunModel[108] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[109] = new ModelRendererTurbo(this, 769, 1, this.textureX, this.textureY);
/*  163 */     this.gunModel[110] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  164 */     this.gunModel[111] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  165 */     this.gunModel[112] = new ModelRendererTurbo(this, 921, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[113] = new ModelRendererTurbo(this, 97, 265, this.textureX, this.textureY);
/*  167 */     this.gunModel[114] = new ModelRendererTurbo(this, 241, 273, this.textureX, this.textureY);
/*  168 */     this.gunModel[115] = new ModelRendererTurbo(this, 377, 121, this.textureX, this.textureY);
/*  169 */     this.gunModel[116] = new ModelRendererTurbo(this, 393, 273, this.textureX, this.textureY);
/*  170 */     this.gunModel[117] = new ModelRendererTurbo(this, 881, 41, this.textureX, this.textureY);
/*  171 */     this.gunModel[118] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*  172 */     this.gunModel[119] = new ModelRendererTurbo(this, 745, 1, this.textureX, this.textureY);
/*  173 */     this.gunModel[120] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  174 */     this.gunModel[121] = new ModelRendererTurbo(this, 769, 33, this.textureX, this.textureY);
/*  175 */     this.gunModel[122] = new ModelRendererTurbo(this, 545, 273, this.textureX, this.textureY);
/*  176 */     this.gunModel[123] = new ModelRendererTurbo(this, 697, 273, this.textureX, this.textureY);
/*  177 */     this.gunModel[124] = new ModelRendererTurbo(this, 633, 145, this.textureX, this.textureY);
/*  178 */     this.gunModel[125] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  179 */     this.gunModel[126] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*  180 */     this.gunModel[127] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 849, 273, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 289, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 313, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 345, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 361, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 177, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 793, 201, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 177, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 233, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 665, 289, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 33, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 777, 289, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 233, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 945, 241, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 273, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 921, 41, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 137, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 289, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 801, 1, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 65, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 601, 97, this.textureX, this.textureY);
/*  211 */     this.gunModel[''] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  212 */     this.gunModel[''] = new ModelRendererTurbo(this, 705, 129, this.textureX, this.textureY);
/*  213 */     this.gunModel[' '] = new ModelRendererTurbo(this, 921, 297, this.textureX, this.textureY);
/*  214 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 993, 73, this.textureX, this.textureY);
/*  215 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  216 */     this.gunModel['£'] = new ModelRendererTurbo(this, 865, 305, this.textureX, this.textureY);
/*  217 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 977, 305, this.textureX, this.textureY);
/*  218 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 329, 177, this.textureX, this.textureY);
/*  219 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 513, 177, this.textureX, this.textureY);
/*  220 */     this.gunModel['§'] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  221 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*  222 */     this.gunModel['©'] = new ModelRendererTurbo(this, 817, 177, this.textureX, this.textureY);
/*  223 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  224 */     this.gunModel['«'] = new ModelRendererTurbo(this, 601, 9, this.textureX, this.textureY);
/*  225 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 657, 313, this.textureX, this.textureY);
/*  226 */     this.gunModel['­'] = new ModelRendererTurbo(this, 569, 233, this.textureX, this.textureY);
/*  227 */     this.gunModel['®'] = new ModelRendererTurbo(this, 945, 177, this.textureX, this.textureY);
/*  228 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 185, 233, this.textureX, this.textureY);
/*  229 */     this.gunModel['°'] = new ModelRendererTurbo(this, 241, 233, this.textureX, this.textureY);
/*  230 */     this.gunModel['±'] = new ModelRendererTurbo(this, 985, 249, this.textureX, this.textureY);
/*  231 */     this.gunModel['²'] = new ModelRendererTurbo(this, 721, 313, this.textureX, this.textureY);
/*  232 */     this.gunModel['³'] = new ModelRendererTurbo(this, 745, 321, this.textureX, this.textureY);
/*  233 */     this.gunModel['´'] = new ModelRendererTurbo(this, 785, 321, this.textureX, this.textureY);
/*  234 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 825, 321, this.textureX, this.textureY);
/*  235 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 713, 9, this.textureX, this.textureY);
/*  236 */     this.gunModel['·'] = new ModelRendererTurbo(this, 737, 33, this.textureX, this.textureY);
/*  237 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 841, 25, this.textureX, this.textureY);
/*  238 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 769, 9, this.textureX, this.textureY);
/*  239 */     this.gunModel['º'] = new ModelRendererTurbo(this, 793, 33, this.textureX, this.textureY);
/*  240 */     this.gunModel['»'] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  241 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
/*  242 */     this.gunModel['½'] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  243 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  244 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  245 */     this.gunModel['À'] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  246 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  247 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  250 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*  251 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 801, 9, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 825, 9, this.textureX, this.textureY);
/*  253 */     this.gunModel['È'] = new ModelRendererTurbo(this, 857, 9, this.textureX, this.textureY);
/*  254 */     this.gunModel['É'] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 865, 33, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  258 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  259 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 1001, 17, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 873, 233, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 665, 337, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 729, 345, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 657, 361, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 657, 377, this.textureX, this.textureY);
/*  266 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 1, 385, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 929, 321, this.textureX, this.textureY);
/*  268 */     this.gunModel['×'] = new ModelRendererTurbo(this, 569, 177, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 977, 65, this.textureX, this.textureY);
/*  270 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  271 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 993, 145, this.textureX, this.textureY);
/*  272 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 873, 177, this.textureX, this.textureY);
/*  273 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 777, 201, this.textureX, this.textureY);
/*  274 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 889, 257, this.textureX, this.textureY);
/*  275 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 921, 257, this.textureX, this.textureY);
/*  276 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 57, 273, this.textureX, this.textureY);
/*  277 */     this.gunModel['à'] = new ModelRendererTurbo(this, 577, 305, this.textureX, this.textureY);
/*  278 */     this.gunModel['á'] = new ModelRendererTurbo(this, 609, 305, this.textureX, this.textureY);
/*  279 */     this.gunModel['â'] = new ModelRendererTurbo(this, 641, 305, this.textureX, this.textureY);
/*  280 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 937, 361, this.textureX, this.textureY);
/*  281 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  282 */     this.gunModel['å'] = new ModelRendererTurbo(this, 953, 361, this.textureX, this.textureY);
/*  283 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 249, 385, this.textureX, this.textureY);
/*  284 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 321, 385, this.textureX, this.textureY);
/*  285 */     this.gunModel['è'] = new ModelRendererTurbo(this, 921, 377, this.textureX, this.textureY);
/*  286 */     this.gunModel['é'] = new ModelRendererTurbo(this, 393, 385, this.textureX, this.textureY);
/*  287 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 449, 385, this.textureX, this.textureY);
/*  288 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 505, 385, this.textureX, this.textureY);
/*  289 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 561, 385, this.textureX, this.textureY);
/*  290 */     this.gunModel['í'] = new ModelRendererTurbo(this, 617, 385, this.textureX, this.textureY);
/*  291 */     this.gunModel['î'] = new ModelRendererTurbo(this, 953, 393, this.textureX, this.textureY);
/*  292 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 1, 401, this.textureX, this.textureY);
/*  293 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 57, 401, this.textureX, this.textureY);
/*  294 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 113, 401, this.textureX, this.textureY);
/*  295 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 185, 401, this.textureX, this.textureY);
/*  296 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 649, 401, this.textureX, this.textureY);
/*  297 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 705, 401, this.textureX, this.textureY);
/*  298 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 761, 401, this.textureX, this.textureY);
/*  299 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 817, 401, this.textureX, this.textureY);
/*  300 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 873, 401, this.textureX, this.textureY);
/*  301 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 913, 409, this.textureX, this.textureY);
/*  302 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 217, 417, this.textureX, this.textureY);
/*  303 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 281, 417, this.textureX, this.textureY);
/*  304 */     this.gunModel['û'] = new ModelRendererTurbo(this, 905, 321, this.textureX, this.textureY);
/*  305 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 329, 417, this.textureX, this.textureY);
/*  306 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 393, 417, this.textureX, this.textureY);
/*  307 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 297, 385, this.textureX, this.textureY);
/*  308 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 521, 33, this.textureX, this.textureY);
/*  309 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 1009, 41, this.textureX, this.textureY);
/*  310 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 545, 17, this.textureX, this.textureY);
/*  312 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 521, 17, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 569, 17, this.textureX, this.textureY);
/*  314 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 881, 17, this.textureX, this.textureY);
/*  315 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/*  316 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 985, 49, this.textureX, this.textureY);
/*  318 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 665, 57, this.textureX, this.textureY);
/*  319 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 377, 65, this.textureX, this.textureY);
/*  320 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  321 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/*  322 */     this.gunModel['č'] = new ModelRendererTurbo(this, 993, 65, this.textureX, this.textureY);
/*  323 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  324 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 665, 73, this.textureX, this.textureY);
/*  325 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  326 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 673, 81, this.textureX, this.textureY);
/*  328 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  330 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/*  332 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 697, 81, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 729, 81, this.textureX, this.textureY);
/*  334 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 753, 81, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 793, 81, this.textureX, this.textureY);
/*  336 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 825, 81, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/*  338 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/*  340 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 729, 89, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 753, 89, this.textureX, this.textureY);
/*  342 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 625, 97, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 649, 97, this.textureX, this.textureY);
/*  344 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/*  346 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 633, 17, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/*  348 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 689, 17, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 601, 97, this.textureX, this.textureY);
/*  350 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 713, 17, this.textureX, this.textureY);
/*  351 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 993, 97, this.textureX, this.textureY);
/*  352 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 985, 41, this.textureX, this.textureY);
/*  353 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*  354 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 425, 97, this.textureX, this.textureY);
/*  355 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 745, 17, this.textureX, this.textureY);
/*  356 */     this.gunModel['į'] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/*  357 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 801, 17, this.textureX, this.textureY);
/*  358 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 1009, 97, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 825, 17, this.textureX, this.textureY);
/*  360 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 601, 105, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 625, 105, this.textureX, this.textureY);
/*  362 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 785, 113, this.textureX, this.textureY);
/*  364 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 1001, 17, this.textureX, this.textureY);
/*  365 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1009, 57, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*  367 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 817, 113, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/*  369 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 841, 113, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 873, 113, this.textureX, this.textureY);
/*  371 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 529, 9, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 921, 113, this.textureX, this.textureY);
/*  373 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 873, 33, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 793, 97, this.textureX, this.textureY);
/*  375 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 841, 49, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 945, 113, this.textureX, this.textureY);
/*  377 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 825, 97, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 977, 113, this.textureX, this.textureY);
/*  379 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 993, 113, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 433, 417, this.textureX, this.textureY);
/*  381 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 465, 449, this.textureX, this.textureY);
/*  382 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 969, 457, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 641, 465, this.textureX, this.textureY);
/*  384 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 697, 465, this.textureX, this.textureY);
/*  385 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 1, 473, this.textureX, this.textureY);
/*  386 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 593, 385, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 33, 401, this.textureX, this.textureY);
/*  388 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 505, 473, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 585, 473, this.textureX, this.textureY);
/*  390 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 377, 473, this.textureX, this.textureY);
/*  391 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 169, 153, this.textureX, this.textureY);
/*  392 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 1009, 105, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  394 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 697, 121, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 729, 121, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 841, 121, this.textureX, this.textureY);
/*  398 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 729, 473, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 785, 473, this.textureX, this.textureY);
/*  400 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 841, 473, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 81, 481, this.textureX, this.textureY);
/*  402 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 137, 481, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 193, 481, this.textureX, this.textureY);
/*  404 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 425, 489, this.textureX, this.textureY);
/*  405 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 897, 489, this.textureX, this.textureY);
/*  406 */     this.gunModel['š'] = new ModelRendererTurbo(this, 233, 489, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 265, 497, this.textureX, this.textureY);
/*  408 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 649, 505, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 121, 513, this.textureX, this.textureY);
/*  410 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 321, 497, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 1, 505, this.textureX, this.textureY);
/*  412 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 465, 505, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 753, 505, this.textureX, this.textureY);
/*  414 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 353, 513, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 521, 513, this.textureX, this.textureY);
/*  416 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 577, 513, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 809, 513, this.textureX, this.textureY);
/*  418 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 33, 521, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 841, 521, this.textureX, this.textureY);
/*  420 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 209, 529, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 385, 529, this.textureX, this.textureY);
/*  422 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 921, 529, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 737, 537, this.textureX, this.textureY);
/*  424 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 121, 545, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 281, 545, this.textureX, this.textureY);
/*  426 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 457, 545, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 561, 545, this.textureX, this.textureY);
/*  428 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 825, 545, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 1, 553, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 369, 553, this.textureX, this.textureY);
/*  431 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 641, 553, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 905, 553, this.textureX, this.textureY);
/*  433 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 209, 561, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 89, 401, this.textureX, this.textureY);
/*  435 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 161, 401, this.textureX, this.textureY);
/*  436 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 681, 401, this.textureX, this.textureY);
/*  437 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 737, 401, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 793, 401, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 849, 401, this.textureX, this.textureY);
/*  440 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 505, 449, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 673, 465, this.textureX, this.textureY);
/*  442 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 561, 473, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 81, 561, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 721, 561, this.textureX, this.textureY);
/*  445 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 769, 561, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 977, 561, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 113, 569, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 161, 569, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 281, 569, this.textureX, this.textureY);
/*  450 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 329, 569, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 449, 569, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 497, 569, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 545, 569, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 593, 569, this.textureX, this.textureY);
/*  455 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 801, 569, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 849, 569, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 1, 577, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 49, 577, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 361, 577, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 625, 577, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 881, 577, this.textureX, this.textureY);
/*  462 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 193, 585, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 409, 577, this.textureX, this.textureY);
/*  464 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 697, 585, this.textureX, this.textureY);
/*  465 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 73, 593, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 145, 593, this.textureX, this.textureY);
/*  467 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 289, 593, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 441, 593, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 481, 137, this.textureX, this.textureY);
/*  470 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 537, 137, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 505, 593, this.textureX, this.textureY);
/*  472 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 961, 585, this.textureX, this.textureY);
/*  473 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 777, 593, this.textureX, this.textureY);
/*  474 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 593, 593, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 841, 593, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 1, 601, this.textureX, this.textureY);
/*  477 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 377, 601, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 33, 609, this.textureX, this.textureY);
/*  479 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 593, 409, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 625, 609, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 409, 609, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 873, 609, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 193, 617, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 249, 617, this.textureX, this.textureY);
/*  485 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 905, 609, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 889, 457, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 745, 593, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 465, 625, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 537, 625, this.textureX, this.textureY);
/*  490 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 673, 625, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 745, 625, this.textureX, this.textureY);
/*  492 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 817, 625, this.textureX, this.textureY);
/*  493 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 625, 641, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 865, 641, this.textureX, this.textureY);
/*  495 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 921, 641, this.textureX, this.textureY);
/*  496 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 25, 649, this.textureX, this.textureY);
/*  497 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 641, 433, this.textureX, this.textureY);
/*  498 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 185, 649, this.textureX, this.textureY);
/*  499 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 953, 649, this.textureX, this.textureY);
/*  500 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 81, 273, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 377, 273, this.textureX, this.textureY);
/*  502 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 681, 273, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 89, 657, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 281, 657, this.textureX, this.textureY);
/*  505 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 393, 657, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 513, 657, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 569, 657, this.textureX, this.textureY);
/*  508 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 681, 657, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 737, 657, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 793, 657, this.textureX, this.textureY);
/*  511 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 249, 665, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 313, 665, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 425, 673, this.textureX, this.textureY);
/*  514 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 129, 665, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 361, 673, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 489, 689, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 1, 689, this.textureX, this.textureY);
/*  518 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 897, 681, this.textureX, this.textureY);
/*  519 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 657, 689, this.textureX, this.textureY);
/*  520 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 729, 689, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 225, 697, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 313, 233, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 921, 185, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 73, 713, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 913, 713, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 1, 721, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 473, 721, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 625, 705, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 545, 721, this.textureX, this.textureY);
/*  530 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 657, 721, this.textureX, this.textureY);
/*  531 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 73, 689, this.textureX, this.textureY);
/*  532 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 217, 729, this.textureX, this.textureY);
/*  533 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 281, 729, this.textureX, this.textureY);
/*  534 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 777, 729, this.textureX, this.textureY);
/*  535 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 329, 737, this.textureX, this.textureY);
/*  536 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 417, 737, this.textureX, this.textureY);
/*  537 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 601, 737, this.textureX, this.textureY);
/*  538 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 73, 745, this.textureX, this.textureY);
/*  539 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 129, 745, this.textureX, this.textureY);
/*  540 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 865, 745, this.textureX, this.textureY);
/*  541 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 921, 745, this.textureX, this.textureY);
/*  542 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 1, 753, this.textureX, this.textureY);
/*  543 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 897, 641, this.textureX, this.textureY);
/*  544 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 545, 657, this.textureX, this.textureY);
/*  545 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 713, 657, this.textureX, this.textureY);
/*  546 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 769, 657, this.textureX, this.textureY);
/*  547 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 169, 753, this.textureX, this.textureY);
/*  548 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 481, 761, this.textureX, this.textureY);
/*  549 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 649, 753, this.textureX, this.textureY);
/*  550 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 705, 753, this.textureX, this.textureY);
/*  551 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 41, 753, this.textureX, this.textureY);
/*  552 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 961, 753, this.textureX, this.textureY);
/*      */     
/*  554 */     this.gunModel[0].addBox(71.0F, -39.0F, -12.0F, 10, 43, 23, 0.0F);
/*  555 */     this.gunModel[0].setRotationPoint(-27.0F, -9.0F, 0.5F);
/*      */     
/*  557 */     this.gunModel[1].addShapeBox(71.0F, -39.0F, -12.0F, 9, 11, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  558 */     this.gunModel[1].setRotationPoint(-17.0F, -9.0F, 0.5F);
/*      */     
/*  560 */     this.gunModel[2].addShapeBox(71.0F, -39.0F, -12.0F, 4, 11, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  561 */     this.gunModel[2].setRotationPoint(-8.0F, -9.0F, 0.5F);
/*      */     
/*  563 */     this.gunModel[3].addShapeBox(71.0F, -39.0F, -12.0F, 3, 8, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  564 */     this.gunModel[3].setRotationPoint(-4.0F, -9.0F, 0.5F);
/*      */     
/*  566 */     this.gunModel[4].addShapeBox(71.0F, -39.0F, -12.0F, 37, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  567 */     this.gunModel[4].setRotationPoint(-1.0F, -9.0F, 0.5F);
/*      */     
/*  569 */     this.gunModel[5].addShapeBox(71.0F, -39.0F, -12.0F, 5, 8, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  570 */     this.gunModel[5].setRotationPoint(-17.0F, 26.0F, 0.5F);
/*      */     
/*  572 */     this.gunModel[6].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  573 */     this.gunModel[6].setRotationPoint(-17.0F, 25.0F, 0.5F);
/*      */     
/*  575 */     this.gunModel[7].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  576 */     this.gunModel[7].setRotationPoint(-12.0F, 26.0F, 0.5F);
/*      */     
/*  578 */     this.gunModel[8].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  579 */     this.gunModel[8].setRotationPoint(-10.0F, 28.0F, 0.5F);
/*      */     
/*  581 */     this.gunModel[9].addShapeBox(71.0F, -39.0F, -12.0F, 3, 4, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  582 */     this.gunModel[9].setRotationPoint(-12.0F, 30.0F, 0.5F);
/*      */     
/*  584 */     this.gunModel[10].addShapeBox(71.0F, -39.0F, -12.0F, 3, 32, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  585 */     this.gunModel[10].setRotationPoint(36.0F, -9.0F, 0.5F);
/*      */     
/*  587 */     this.gunModel[11].addShapeBox(71.0F, -39.0F, -12.0F, 3, 6, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  588 */     this.gunModel[11].setRotationPoint(39.0F, 16.0F, 0.5F);
/*      */     
/*  590 */     this.gunModel[12].addShapeBox(71.0F, -39.0F, -12.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  591 */     this.gunModel[12].setRotationPoint(42.0F, 16.0F, 0.5F);
/*      */     
/*  593 */     this.gunModel[13].addShapeBox(71.0F, -39.0F, -12.0F, 3, 7, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  594 */     this.gunModel[13].setRotationPoint(41.0F, 9.0F, 0.5F);
/*      */     
/*  596 */     this.gunModel[14].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  597 */     this.gunModel[14].setRotationPoint(41.0F, 8.5F, 0.5F);
/*      */     
/*  599 */     this.gunModel[15].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  600 */     this.gunModel[15].setRotationPoint(39.0F, 7.5F, 0.5F);
/*      */     
/*  602 */     this.gunModel[16].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  603 */     this.gunModel[16].setRotationPoint(39.0F, 8.5F, 0.5F);
/*      */     
/*  605 */     this.gunModel[17].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  606 */     this.gunModel[17].setRotationPoint(39.0F, 6.5F, 0.5F);
/*      */     
/*  608 */     this.gunModel[18].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  609 */     this.gunModel[18].setRotationPoint(42.0F, 6.5F, 0.5F);
/*      */     
/*  611 */     this.gunModel[19].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  612 */     this.gunModel[19].setRotationPoint(42.0F, 4.5F, 0.5F);
/*      */     
/*  614 */     this.gunModel[20].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  615 */     this.gunModel[20].setRotationPoint(42.0F, 3.5F, 0.5F);
/*      */     
/*  617 */     this.gunModel[21].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  618 */     this.gunModel[21].setRotationPoint(43.5F, 1.5F, 0.5F);
/*      */     
/*  620 */     this.gunModel[22].addShapeBox(71.0F, -39.0F, -12.0F, 142, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  621 */     this.gunModel[22].setRotationPoint(-103.0F, -13.0F, 0.0F);
/*      */     
/*  623 */     this.gunModel[23].addShapeBox(71.0F, -39.0F, -12.0F, 55, 38, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  624 */     this.gunModel[23].setRotationPoint(-17.0F, -6.0F, 2.0F);
/*      */     
/*  626 */     this.gunModel[24].addShapeBox(71.0F, -39.0F, -12.0F, 142, 1, 22, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  627 */     this.gunModel[24].setRotationPoint(-103.0F, -10.0F, 1.0F);
/*      */     
/*  629 */     this.gunModel[25].addShapeBox(71.0F, -39.0F, -12.0F, 14, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  630 */     this.gunModel[25].setRotationPoint(-21.0F, -2.5F, 20.5F);
/*      */     
/*  632 */     this.gunModel[26].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  633 */     this.gunModel[26].setRotationPoint(-7.0F, -2.5F, 20.5F);
/*      */     
/*  635 */     this.gunModel[27].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 4.0F, 0.0F, 0.25F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -4.0F, 0.0F, 0.25F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  636 */     this.gunModel[27].setRotationPoint(-5.0F, -4.5F, 20.5F);
/*      */     
/*  638 */     this.gunModel[28].addShapeBox(71.0F, -39.0F, -12.0F, 10, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  639 */     this.gunModel[28].setRotationPoint(-18.0F, -8.0F, 20.0F);
/*      */     
/*  641 */     this.gunModel[29].addShapeBox(71.0F, -39.0F, -12.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  642 */     this.gunModel[29].setRotationPoint(-8.0F, -8.0F, 20.0F);
/*      */     
/*  644 */     this.gunModel[30].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 5, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/*  645 */     this.gunModel[30].setRotationPoint(-20.0F, -7.0F, 20.0F);
/*      */     
/*  647 */     this.gunModel[31].addShapeBox(71.0F, -39.0F, -12.0F, 1, 4, 5, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  648 */     this.gunModel[31].setRotationPoint(-19.0F, -8.0F, 20.0F);
/*      */     
/*  650 */     this.gunModel[32].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  651 */     this.gunModel[32].setRotationPoint(-7.0F, -7.0F, 20.0F);
/*      */     
/*  653 */     this.gunModel[33].addShapeBox(71.0F, -39.0F, -12.0F, 45, 1, 23, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 11.0F, -1.5F, 0.0F, 11.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  654 */     this.gunModel[33].setRotationPoint(-9.0F, 30.0F, 0.5F);
/*      */     
/*  656 */     this.gunModel[34].addShapeBox(71.0F, -39.0F, -12.0F, 148, 14, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  657 */     this.gunModel[34].setRotationPoint(-106.0F, -27.0F, 6.5F);
/*      */     
/*  659 */     this.gunModel[35].addShapeBox(71.0F, -39.0F, -12.0F, 4, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  660 */     this.gunModel[35].setRotationPoint(38.0F, -16.5F, 0.0F);
/*      */     
/*  662 */     this.gunModel[36].addShapeBox(71.0F, -39.0F, -12.0F, 4, 4, 24, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  663 */     this.gunModel[36].setRotationPoint(39.0F, -13.0F, 0.0F);
/*      */     
/*  665 */     this.gunModel[37].addShapeBox(71.0F, -39.0F, -12.0F, 8, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  666 */     this.gunModel[37].setRotationPoint(38.0F, -19.0F, 0.0F);
/*      */     
/*  668 */     this.gunModel[38].addShapeBox(71.0F, -39.0F, -12.0F, 12, 16, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  669 */     this.gunModel[38].setRotationPoint(46.0F, -29.5F, 0.0F);
/*      */     
/*  671 */     this.gunModel[39].addShapeBox(71.0F, -39.0F, -12.0F, 3, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  672 */     this.gunModel[39].setRotationPoint(43.0F, -16.5F, 0.0F);
/*      */     
/*  674 */     this.gunModel[40].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  675 */     this.gunModel[40].setRotationPoint(43.0F, -13.5F, 0.0F);
/*      */     
/*  677 */     this.gunModel[41].addShapeBox(71.0F, -39.0F, -12.0F, 5, 11, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  678 */     this.gunModel[41].setRotationPoint(42.0F, -27.0F, 1.5F);
/*      */     
/*  680 */     this.gunModel[42].addShapeBox(71.0F, -39.0F, -12.0F, 159, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  681 */     this.gunModel[42].setRotationPoint(-113.0F, -29.5F, 6.0F);
/*      */     
/*  683 */     this.gunModel[43].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/*  684 */     this.gunModel[43].setRotationPoint(44.0F, -27.0F, 4.0F);
/*      */     
/*  686 */     this.gunModel[44].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  687 */     this.gunModel[44].setRotationPoint(39.0F, -13.0F, 0.0F);
/*      */     
/*  689 */     this.gunModel[45].addShapeBox(71.0F, -39.0F, -12.0F, 74, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  690 */     this.gunModel[45].setRotationPoint(-107.0F, -32.5F, 0.0F);
/*      */     
/*  692 */     this.gunModel[46].addShapeBox(71.0F, -39.0F, -12.0F, 78, 15, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  693 */     this.gunModel[46].setRotationPoint(-107.0F, -47.5F, 2.0F);
/*      */     
/*  695 */     this.gunModel[47].addShapeBox(71.0F, -39.0F, -12.0F, 39, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  696 */     this.gunModel[47].setRotationPoint(-66.0F, 4.0F, 0.5F);
/*      */     
/*  698 */     this.gunModel[48].addShapeBox(71.0F, -39.0F, -12.0F, 16, 5, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  699 */     this.gunModel[48].setRotationPoint(-53.0F, -6.0F, 0.5F);
/*      */     
/*  701 */     this.gunModel[49].addShapeBox(71.0F, -39.0F, -12.0F, 2, 5, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  702 */     this.gunModel[49].setRotationPoint(-37.0F, -6.0F, 0.5F);
/*      */     
/*  704 */     this.gunModel[50].addShapeBox(71.0F, -39.0F, -12.0F, 16, 5, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  705 */     this.gunModel[50].setRotationPoint(-66.0F, -1.0F, 0.5F);
/*      */     
/*  707 */     this.gunModel[51].addBox(71.0F, -39.0F, -12.0F, 76, 1, 23, 0.0F);
/*  708 */     this.gunModel[51].setRotationPoint(-103.0F, -9.0F, 0.5F);
/*      */     
/*  710 */     this.gunModel[52].addShapeBox(71.0F, -39.0F, -12.0F, 213, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  711 */     this.gunModel[52].setRotationPoint(-29.0F, -47.5F, 2.0F);
/*      */     
/*  713 */     this.gunModel[53].addShapeBox(71.0F, -39.0F, -12.0F, 140, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  714 */     this.gunModel[53].setRotationPoint(-29.0F, -37.5F, 2.0F);
/*      */     
/*  716 */     this.gunModel[54].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  717 */     this.gunModel[54].setRotationPoint(-28.0F, -43.5F, 2.0F);
/*      */     
/*  719 */     this.gunModel[55].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  720 */     this.gunModel[55].setRotationPoint(-28.0F, -39.5F, 2.0F);
/*      */     
/*  722 */     this.gunModel[56].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  723 */     this.gunModel[56].setRotationPoint(-24.0F, -43.5F, 2.0F);
/*      */     
/*  725 */     this.gunModel[57].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  726 */     this.gunModel[57].setRotationPoint(-24.0F, -39.5F, 2.0F);
/*      */     
/*  728 */     this.gunModel[58].addShapeBox(71.0F, -39.0F, -12.0F, 1, 6, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  729 */     this.gunModel[58].setRotationPoint(-29.0F, -43.5F, 2.0F);
/*      */     
/*  731 */     this.gunModel[59].addShapeBox(71.0F, -39.0F, -12.0F, 89, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  732 */     this.gunModel[59].setRotationPoint(-22.0F, -39.5F, 2.0F);
/*      */     
/*  734 */     this.gunModel[60].addShapeBox(71.0F, -39.0F, -12.0F, 89, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  735 */     this.gunModel[60].setRotationPoint(-22.0F, -43.5F, 2.0F);
/*      */     
/*  737 */     this.gunModel[61].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  738 */     this.gunModel[61].setRotationPoint(67.0F, -43.5F, 2.0F);
/*      */     
/*  740 */     this.gunModel[62].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  741 */     this.gunModel[62].setRotationPoint(67.0F, -39.5F, 2.0F);
/*      */     
/*  743 */     this.gunModel[63].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  744 */     this.gunModel[63].setRotationPoint(71.0F, -43.5F, 2.0F);
/*      */     
/*  746 */     this.gunModel[64].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  747 */     this.gunModel[64].setRotationPoint(71.0F, -39.5F, 2.0F);
/*      */     
/*  749 */     this.gunModel[65].addShapeBox(71.0F, -39.0F, -12.0F, 38, 6, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  750 */     this.gunModel[65].setRotationPoint(73.0F, -43.5F, 2.0F);
/*      */     
/*  752 */     this.gunModel[66].addShapeBox(71.0F, -39.0F, -12.0F, 73, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  753 */     this.gunModel[66].setRotationPoint(111.0F, -43.5F, 2.0F);
/*      */     
/*  755 */     this.gunModel[67].addShapeBox(71.0F, -39.0F, -12.0F, 73, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  756 */     this.gunModel[67].setRotationPoint(111.0F, -34.5F, 2.0F);
/*      */     
/*  758 */     this.gunModel[68].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/*  759 */     this.gunModel[68].setRotationPoint(137.0F, -39.5F, 2.0F);
/*      */     
/*  761 */     this.gunModel[69].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  762 */     this.gunModel[69].setRotationPoint(137.0F, -36.5F, 2.0F);
/*      */     
/*  764 */     this.gunModel[70].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  765 */     this.gunModel[70].setRotationPoint(111.0F, -39.5F, 2.0F);
/*      */     
/*  767 */     this.gunModel[71].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  768 */     this.gunModel[71].setRotationPoint(111.0F, -36.5F, 2.0F);
/*      */     
/*  770 */     this.gunModel[72].addShapeBox(71.0F, -39.0F, -12.0F, 5, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  771 */     this.gunModel[72].setRotationPoint(139.0F, -39.5F, 2.0F);
/*      */     
/*  773 */     this.gunModel[73].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  774 */     this.gunModel[73].setRotationPoint(170.0F, -36.5F, 2.0F);
/*      */     
/*  776 */     this.gunModel[74].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/*  777 */     this.gunModel[74].setRotationPoint(170.0F, -39.5F, 2.0F);
/*      */     
/*  779 */     this.gunModel[75].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  780 */     this.gunModel[75].setRotationPoint(144.0F, -36.5F, 2.0F);
/*      */     
/*  782 */     this.gunModel[76].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  783 */     this.gunModel[76].setRotationPoint(144.0F, -39.5F, 2.0F);
/*      */     
/*  785 */     this.gunModel[77].addShapeBox(71.0F, -39.0F, -12.0F, 12, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  786 */     this.gunModel[77].setRotationPoint(172.0F, -39.5F, 2.0F);
/*      */     
/*  788 */     this.gunModel[78].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  789 */     this.gunModel[78].setRotationPoint(-22.0F, -41.5F, 3.5F);
/*      */     
/*  791 */     this.gunModel[79].addShapeBox(71.0F, -39.0F, -12.0F, 83, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  792 */     this.gunModel[79].setRotationPoint(-16.0F, -41.5F, 3.5F);
/*      */     
/*  794 */     this.gunModel[80].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  795 */     this.gunModel[80].setRotationPoint(-17.0F, -41.5F, 3.5F);
/*      */     
/*  797 */     this.gunModel[81].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 17, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  798 */     this.gunModel[81].setRotationPoint(-17.0F, -40.5F, 3.5F);
/*      */     
/*  800 */     this.gunModel[82].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  801 */     this.gunModel[82].setRotationPoint(-18.0F, -41.5F, 3.5F);
/*      */     
/*  803 */     this.gunModel[83].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 17, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  804 */     this.gunModel[83].setRotationPoint(-18.0F, -40.5F, 3.5F);
/*      */     
/*  806 */     this.gunModel[84].addShapeBox(71.0F, -39.0F, -12.0F, 6, 6, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  807 */     this.gunModel[84].setRotationPoint(-28.0F, -43.5F, 3.5F);
/*      */     
/*  809 */     this.gunModel[85].addShapeBox(71.0F, -39.0F, -12.0F, 6, 6, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  810 */     this.gunModel[85].setRotationPoint(67.0F, -43.5F, 3.5F);
/*      */     
/*  812 */     this.gunModel[86].addShapeBox(71.0F, -39.0F, -12.0F, 291, 2, 20, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  813 */     this.gunModel[86].setRotationPoint(-107.0F, -49.5F, 2.0F);
/*      */     
/*  815 */     this.gunModel[87].addShapeBox(71.0F, -39.0F, -12.0F, 62, 5, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  816 */     this.gunModel[87].setRotationPoint(111.0F, -39.5F, 3.5F);
/*      */     
/*  818 */     this.gunModel[88].addShapeBox(71.0F, -39.0F, -12.0F, 2, 16, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  819 */     this.gunModel[88].setRotationPoint(58.0F, -29.5F, 0.0F);
/*      */     
/*  821 */     this.gunModel[89].addShapeBox(71.0F, -39.0F, -12.0F, 3, 17, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  822 */     this.gunModel[89].setRotationPoint(60.0F, -30.5F, -2.0F);
/*      */     
/*  824 */     this.gunModel[90].addShapeBox(71.0F, -39.0F, -12.0F, 121, 15, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  825 */     this.gunModel[90].setRotationPoint(63.0F, -28.5F, -2.0F);
/*      */     
/*  827 */     this.gunModel[91].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/*  828 */     this.gunModel[91].setRotationPoint(168.0F, -13.5F, -2.0F);
/*      */     
/*  830 */     this.gunModel[92].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  831 */     this.gunModel[92].setRotationPoint(170.0F, -13.5F, -2.0F);
/*      */     
/*  833 */     this.gunModel[93].addShapeBox(71.0F, -39.0F, -12.0F, 12, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  834 */     this.gunModel[93].setRotationPoint(172.0F, -13.5F, -2.0F);
/*      */     
/*  836 */     this.gunModel[94].addShapeBox(71.0F, -39.0F, -12.0F, 25, 12, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  837 */     this.gunModel[94].setRotationPoint(-52.0F, -8.0F, 1.5F);
/*      */     
/*  839 */     this.gunModel[95].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  840 */     this.gunModel[95].setRotationPoint(-28.0F, -8.0F, 0.5F);
/*      */     
/*  842 */     this.gunModel[96].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  843 */     this.gunModel[96].setRotationPoint(-50.0F, -1.0F, 0.5F);
/*      */     
/*  845 */     this.gunModel[97].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  846 */     this.gunModel[97].setRotationPoint(-28.0F, 3.0F, 0.5F);
/*      */     
/*  848 */     this.gunModel[98].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  849 */     this.gunModel[98].setRotationPoint(-50.0F, 3.0F, 0.5F);
/*      */     
/*  851 */     this.gunModel[99].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  852 */     this.gunModel[99].setRotationPoint(58.0F, -32.5F, 0.0F);
/*      */     
/*  854 */     this.gunModel[100].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  855 */     this.gunModel[100].setRotationPoint(60.0F, -32.5F, 0.0F);
/*      */     
/*  857 */     this.gunModel[101].addShapeBox(71.0F, -39.0F, -12.0F, 121, 4, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  858 */     this.gunModel[101].setRotationPoint(63.0F, -32.5F, 0.0F);
/*      */     
/*  860 */     this.gunModel[102].addShapeBox(71.0F, -39.0F, -12.0F, 16, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  861 */     this.gunModel[102].setRotationPoint(71.0F, -27.5F, 26.0F);
/*      */     
/*  863 */     this.gunModel[103].addShapeBox(71.0F, -39.0F, -12.0F, 3, 10, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  864 */     this.gunModel[103].setRotationPoint(68.0F, -27.5F, 26.0F);
/*      */     
/*  866 */     this.gunModel[104].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  867 */     this.gunModel[104].setRotationPoint(101.0F, -23.5F, 28.5F);
/*      */     
/*  869 */     this.gunModel[105].addShapeBox(71.0F, -39.0F, -12.0F, 6, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  870 */     this.gunModel[105].setRotationPoint(87.0F, -27.5F, -4.0F);
/*      */     
/*  872 */     this.gunModel[106].addShapeBox(71.0F, -39.0F, -12.0F, 7, 14, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  873 */     this.gunModel[106].setRotationPoint(93.0F, -29.5F, 26.0F);
/*      */     
/*  875 */     this.gunModel[107].addShapeBox(71.0F, -39.0F, -12.0F, 2, 8, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  876 */     this.gunModel[107].setRotationPoint(66.0F, -26.5F, 26.0F);
/*      */     
/*  878 */     this.gunModel[108].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  879 */     this.gunModel[108].setRotationPoint(101.0F, -21.5F, 28.5F);
/*      */     
/*  881 */     this.gunModel[109].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  882 */     this.gunModel[109].setRotationPoint(101.0F, -25.5F, 28.5F);
/*      */     
/*  884 */     this.gunModel[110].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  885 */     this.gunModel[110].setRotationPoint(170.0F, -23.5F, 29.0F);
/*      */     
/*  887 */     this.gunModel[111].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  888 */     this.gunModel[111].setRotationPoint(170.0F, -21.5F, 29.0F);
/*      */     
/*  890 */     this.gunModel[112].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  891 */     this.gunModel[112].setRotationPoint(170.0F, -25.5F, 29.0F);
/*      */     
/*  893 */     this.gunModel[113].addShapeBox(71.0F, -39.0F, -12.0F, 68, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  894 */     this.gunModel[113].setRotationPoint(100.0F, -29.5F, 26.0F);
/*      */     
/*  896 */     this.gunModel[114].addShapeBox(71.0F, -39.0F, -12.0F, 68, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  897 */     this.gunModel[114].setRotationPoint(100.0F, -19.5F, 26.0F);
/*      */     
/*  899 */     this.gunModel[115].addShapeBox(71.0F, -39.0F, -12.0F, 15, 14, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  900 */     this.gunModel[115].setRotationPoint(168.0F, -29.5F, 26.0F);
/*      */     
/*  902 */     this.gunModel[116].addShapeBox(71.0F, -39.0F, -12.0F, 70, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  903 */     this.gunModel[116].setRotationPoint(98.0F, -25.5F, 26.0F);
/*      */     
/*  905 */     this.gunModel[117].addShapeBox(71.0F, -39.0F, -12.0F, 16, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  906 */     this.gunModel[117].setRotationPoint(71.0F, -27.5F, -4.0F);
/*      */     
/*  908 */     this.gunModel[118].addShapeBox(71.0F, -39.0F, -12.0F, 3, 10, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  909 */     this.gunModel[118].setRotationPoint(68.0F, -27.5F, -4.0F);
/*      */     
/*  911 */     this.gunModel[119].addShapeBox(71.0F, -39.0F, -12.0F, 2, 8, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  912 */     this.gunModel[119].setRotationPoint(66.0F, -26.5F, -4.0F);
/*      */     
/*  914 */     this.gunModel[120].addShapeBox(71.0F, -39.0F, -12.0F, 6, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/*  915 */     this.gunModel[120].setRotationPoint(87.0F, -27.5F, 26.0F);
/*      */     
/*  917 */     this.gunModel[121].addShapeBox(71.0F, -39.0F, -12.0F, 7, 14, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  918 */     this.gunModel[121].setRotationPoint(93.0F, -29.5F, -6.0F);
/*      */     
/*  920 */     this.gunModel[122].addShapeBox(71.0F, -39.0F, -12.0F, 68, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  921 */     this.gunModel[122].setRotationPoint(100.0F, -29.5F, -6.0F);
/*      */     
/*  923 */     this.gunModel[123].addShapeBox(71.0F, -39.0F, -12.0F, 68, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  924 */     this.gunModel[123].setRotationPoint(100.0F, -19.5F, -6.0F);
/*      */     
/*  926 */     this.gunModel[124].addShapeBox(71.0F, -39.0F, -12.0F, 15, 14, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  927 */     this.gunModel[124].setRotationPoint(168.0F, -29.5F, -6.0F);
/*      */     
/*  929 */     this.gunModel[125].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  930 */     this.gunModel[125].setRotationPoint(101.0F, -23.5F, -6.5F);
/*      */     
/*  932 */     this.gunModel[126].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  933 */     this.gunModel[126].setRotationPoint(101.0F, -21.5F, -6.5F);
/*      */     
/*  935 */     this.gunModel[127].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  936 */     this.gunModel[127].setRotationPoint(101.0F, -25.5F, -6.5F);
/*      */     
/*  938 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  939 */     this.gunModel[''].setRotationPoint(170.0F, -23.5F, -7.0F);
/*      */     
/*  941 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  942 */     this.gunModel[''].setRotationPoint(170.0F, -21.5F, -7.0F);
/*      */     
/*  944 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  945 */     this.gunModel[''].setRotationPoint(170.0F, -25.5F, -7.0F);
/*      */     
/*  947 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 68, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  948 */     this.gunModel[''].setRotationPoint(100.0F, -25.5F, -5.0F);
/*      */     
/*  950 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 316, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  951 */     this.gunModel[''].setRotationPoint(-132.0F, -52.5F, 6.0F);
/*      */     
/*  953 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 291, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  954 */     this.gunModel[''].setRotationPoint(-107.0F, -50.5F, 4.0F);
/*      */     
/*  956 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 291, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  957 */     this.gunModel[''].setRotationPoint(-107.0F, -50.5F, 18.0F);
/*      */     
/*  959 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 316, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  960 */     this.gunModel[''].setRotationPoint(-132.0F, -54.5F, 3.5F);
/*      */     
/*  962 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 316, 1, 12, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  963 */     this.gunModel[''].setRotationPoint(-132.0F, -53.5F, 6.0F);
/*      */     
/*  965 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 316, 1, 17, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  966 */     this.gunModel[''].setRotationPoint(-132.0F, -55.5F, 3.5F);
/*      */     
/*  968 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 2, 8, 16, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  969 */     this.gunModel[''].setRotationPoint(-29.0F, 22.0F, 4.0F);
/*      */     
/*  971 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 30, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  972 */     this.gunModel[''].setRotationPoint(-57.0F, 30.0F, 4.0F);
/*      */     
/*  974 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 16, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  975 */     this.gunModel[''].setRotationPoint(-33.0F, 27.0F, 4.0F);
/*      */     
/*  977 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 6, 4, 16, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  978 */     this.gunModel[''].setRotationPoint(-63.0F, 30.0F, 4.0F);
/*      */     
/*  980 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 46, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  981 */     this.gunModel[''].setRotationPoint(221.0F, -26.5F, 8.0F);
/*      */     
/*  983 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 2, 8, 8, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 2.0F, 2.0F);
/*  984 */     this.gunModel[''].setRotationPoint(219.0F, -26.0F, 8.5F);
/*      */     
/*  986 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 36, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  987 */     this.gunModel[''].setRotationPoint(183.0F, -28.0F, 6.5F);
/*      */     
/*  989 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 8, 11, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  990 */     this.gunModel[''].setRotationPoint(239.0F, -27.5F, 7.0F);
/*      */     
/*  992 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 13, 11, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  993 */     this.gunModel[''].setRotationPoint(265.0F, -27.5F, 7.0F);
/*      */     
/*  995 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 6, 13, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  996 */     this.gunModel[''].setRotationPoint(269.5F, -28.5F, 6.0F);
/*      */     
/*  998 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 27, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  999 */     this.gunModel[''].setRotationPoint(278.5F, -28.5F, 6.0F);
/*      */     
/* 1001 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 27, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1002 */     this.gunModel[''].setRotationPoint(278.5F, -19.5F, 6.0F);
/*      */     
/* 1004 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 27, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1005 */     this.gunModel[''].setRotationPoint(278.5F, -23.5F, 6.0F);
/*      */     
/* 1007 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 27, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1008 */     this.gunModel[''].setRotationPoint(278.5F, -19.5F, 14.0F);
/*      */     
/* 1010 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 27, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1011 */     this.gunModel[''].setRotationPoint(278.5F, -28.5F, 14.0F);
/*      */     
/* 1013 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1014 */     this.gunModel[''].setRotationPoint(278.5F, -28.5F, 11.0F);
/*      */     
/* 1016 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1017 */     this.gunModel[''].setRotationPoint(278.5F, -25.5F, 6.0F);
/*      */     
/* 1019 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1020 */     this.gunModel[''].setRotationPoint(301.5F, -28.5F, 11.0F);
/*      */     
/* 1022 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1023 */     this.gunModel[''].setRotationPoint(301.5F, -25.5F, 6.0F);
/*      */     
/* 1025 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1026 */     this.gunModel[''].setRotationPoint(301.5F, -21.5F, 6.0F);
/*      */     
/* 1028 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1029 */     this.gunModel[''].setRotationPoint(301.5F, -19.5F, 11.0F);
/*      */     
/* 1031 */     this.gunModel[''].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1032 */     this.gunModel[''].setRotationPoint(278.5F, -21.5F, 6.0F);
/*      */     
/* 1034 */     this.gunModel[' '].addShapeBox(71.0F, -39.0F, -12.0F, 23, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1035 */     this.gunModel[' '].setRotationPoint(183.0F, -41.5F, 7.5F);
/*      */     
/* 1037 */     this.gunModel['¡'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1038 */     this.gunModel['¡'].setRotationPoint(209.0F, -40.5F, 8.5F);
/*      */     
/* 1040 */     this.gunModel['¢'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1041 */     this.gunModel['¢'].setRotationPoint(213.0F, -38.5F, 10.5F);
/*      */     
/* 1043 */     this.gunModel['£'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 17, 14, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1044 */     this.gunModel['£'].setRotationPoint(192.0F, -32.0F, 5.5F);
/*      */     
/* 1046 */     this.gunModel['¤'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 13, 14, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1047 */     this.gunModel['¤'].setRotationPoint(207.0F, -28.0F, 5.5F);
/*      */     
/* 1049 */     this.gunModel['¥'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 14, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1050 */     this.gunModel['¥'].setRotationPoint(207.0F, -29.0F, 5.5F);
/*      */     
/* 1052 */     this.gunModel['¦'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1053 */     this.gunModel['¦'].setRotationPoint(192.0F, -15.0F, 9.5F);
/*      */     
/* 1055 */     this.gunModel['§'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1056 */     this.gunModel['§'].setRotationPoint(192.0F, -15.0F, 5.5F);
/*      */     
/* 1058 */     this.gunModel['¨'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1059 */     this.gunModel['¨'].setRotationPoint(192.0F, -15.0F, 15.5F);
/*      */     
/* 1061 */     this.gunModel['©'].addShapeBox(71.0F, -39.0F, -12.0F, 10, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1062 */     this.gunModel['©'].setRotationPoint(192.0F, -10.0F, 8.0F);
/*      */     
/* 1064 */     this.gunModel['ª'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1065 */     this.gunModel['ª'].setRotationPoint(204.0F, -10.0F, 8.0F);
/*      */     
/* 1067 */     this.gunModel['«'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1068 */     this.gunModel['«'].setRotationPoint(202.0F, -10.0F, 9.5F);
/*      */     
/* 1070 */     this.gunModel['¬'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 7, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1071 */     this.gunModel['¬'].setRotationPoint(196.0F, -39.0F, 5.0F);
/*      */     
/* 1073 */     this.gunModel['­'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 2, 15, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1074 */     this.gunModel['­'].setRotationPoint(196.0F, -41.0F, 5.0F);
/*      */     
/* 1076 */     this.gunModel['®'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 2, 11, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1077 */     this.gunModel['®'].setRotationPoint(196.0F, -43.0F, 7.0F);
/*      */     
/* 1079 */     this.gunModel['¯'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 15, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1080 */     this.gunModel['¯'].setRotationPoint(192.0F, -33.0F, 5.0F);
/*      */     
/* 1082 */     this.gunModel['°'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1083 */     this.gunModel['°'].setRotationPoint(194.0F, -22.0F, 5.0F);
/*      */     
/* 1085 */     this.gunModel['±'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1086 */     this.gunModel['±'].setRotationPoint(194.0F, -23.0F, 5.0F);
/*      */     
/* 1088 */     this.gunModel['²'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 15, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1089 */     this.gunModel['²'].setRotationPoint(194.0F, -24.0F, 5.0F);
/*      */     
/* 1091 */     this.gunModel['³'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1092 */     this.gunModel['³'].setRotationPoint(204.0F, -22.0F, 5.0F);
/*      */     
/* 1094 */     this.gunModel['´'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1095 */     this.gunModel['´'].setRotationPoint(204.0F, -23.0F, 5.0F);
/*      */     
/* 1097 */     this.gunModel['µ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 15, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1098 */     this.gunModel['µ'].setRotationPoint(204.0F, -24.0F, 5.0F);
/*      */     
/* 1100 */     this.gunModel['¶'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1101 */     this.gunModel['¶'].setRotationPoint(278.5F, -19.5F, 11.0F);
/*      */     
/* 1103 */     this.gunModel['·'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 14, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1104 */     this.gunModel['·'].setRotationPoint(182.0F, -44.5F, 23.5F);
/*      */     
/* 1106 */     this.gunModel['¸'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 16, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F);
/* 1107 */     this.gunModel['¸'].setRotationPoint(182.0F, -46.5F, 21.5F);
/*      */     
/* 1109 */     this.gunModel['¹'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 1110 */     this.gunModel['¹'].setRotationPoint(182.0F, -48.5F, 21.5F);
/*      */     
/* 1112 */     this.gunModel['º'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F);
/* 1113 */     this.gunModel['º'].setRotationPoint(182.0F, -46.5F, 25.5F);
/*      */     
/* 1115 */     this.gunModel['»'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1116 */     this.gunModel['»'].setRotationPoint(182.0F, -31.5F, 29.5F);
/*      */     
/* 1118 */     this.gunModel['¼'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1119 */     this.gunModel['¼'].setRotationPoint(182.0F, -30.5F, 29.5F);
/*      */     
/* 1121 */     this.gunModel['½'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1122 */     this.gunModel['½'].setRotationPoint(182.0F, -44.5F, 1.5F);
/*      */     
/* 1124 */     this.gunModel['¾'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1125 */     this.gunModel['¾'].setRotationPoint(182.0F, -42.5F, 1.5F);
/*      */     
/* 1127 */     this.gunModel['¿'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 11, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1128 */     this.gunModel['¿'].setRotationPoint(182.0F, -40.5F, -0.5F);
/*      */     
/* 1130 */     this.gunModel['À'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1131 */     this.gunModel['À'].setRotationPoint(182.0F, -46.5F, 1.5F);
/*      */     
/* 1133 */     this.gunModel['Á'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1134 */     this.gunModel['Á'].setRotationPoint(182.0F, -48.5F, -2.5F);
/*      */     
/* 1136 */     this.gunModel['Â'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1137 */     this.gunModel['Â'].setRotationPoint(182.0F, -46.5F, -5.0F);
/*      */     
/* 1139 */     this.gunModel['Ã'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 13, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1140 */     this.gunModel['Ã'].setRotationPoint(182.0F, -44.5F, -5.0F);
/*      */     
/* 1142 */     this.gunModel['Ä'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/* 1143 */     this.gunModel['Ä'].setRotationPoint(182.0F, -30.5F, -7.5F);
/*      */     
/* 1145 */     this.gunModel['Å'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1146 */     this.gunModel['Å'].setRotationPoint(182.0F, -29.5F, 25.0F);
/*      */     
/* 1148 */     this.gunModel['Æ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1149 */     this.gunModel['Æ'].setRotationPoint(182.0F, -31.5F, -7.5F);
/*      */     
/* 1151 */     this.gunModel['Ç'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1152 */     this.gunModel['Ç'].setRotationPoint(182.0F, -29.5F, -2.0F);
/*      */     
/* 1154 */     this.gunModel['È'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1155 */     this.gunModel['È'].setRotationPoint(182.0F, -40.5F, -0.5F);
/*      */     
/* 1157 */     this.gunModel['É'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1158 */     this.gunModel['É'].setRotationPoint(182.0F, -48.5F, 2.5F);
/*      */     
/* 1160 */     this.gunModel['Ê'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 15, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1161 */     this.gunModel['Ê'].setRotationPoint(183.0F, -29.5F, -6.0F);
/*      */     
/* 1163 */     this.gunModel['Ë'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 15, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1164 */     this.gunModel['Ë'].setRotationPoint(183.0F, -29.5F, 26.0F);
/*      */     
/* 1166 */     this.gunModel['Ì'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1167 */     this.gunModel['Ì'].setRotationPoint(182.0F, -30.5F, 23.5F);
/*      */     
/* 1169 */     this.gunModel['Í'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1170 */     this.gunModel['Í'].setRotationPoint(182.0F, -48.5F, 20.5F);
/*      */     
/* 1172 */     this.gunModel['Î'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/* 1173 */     this.gunModel['Î'].setRotationPoint(168.0F, -13.5F, 17.0F);
/*      */     
/* 1175 */     this.gunModel['Ï'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F);
/* 1176 */     this.gunModel['Ï'].setRotationPoint(170.0F, -13.5F, 17.0F);
/*      */     
/* 1178 */     this.gunModel['Ð'].addShapeBox(71.0F, -39.0F, -12.0F, 12, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1179 */     this.gunModel['Ð'].setRotationPoint(172.0F, -13.5F, 17.0F);
/*      */     
/* 1181 */     this.gunModel['Ñ'].addShapeBox(71.0F, -39.0F, -12.0F, 23, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1182 */     this.gunModel['Ñ'].setRotationPoint(161.0F, -13.5F, 7.0F);
/*      */     
/* 1184 */     this.gunModel['Ò'].addShapeBox(71.0F, -39.0F, -12.0F, 130, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1185 */     this.gunModel['Ò'].setRotationPoint(54.0F, -7.5F, 7.0F);
/*      */     
/* 1187 */     this.gunModel['Ó'].addShapeBox(71.0F, -39.0F, -12.0F, 125, 1, 14, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1188 */     this.gunModel['Ó'].setRotationPoint(59.0F, -1.5F, 5.0F);
/*      */     
/* 1190 */     this.gunModel['Ô'].addShapeBox(71.0F, -39.0F, -12.0F, 125, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1191 */     this.gunModel['Ô'].setRotationPoint(59.0F, -3.5F, 3.0F);
/*      */     
/* 1193 */     this.gunModel['Õ'].addShapeBox(71.0F, -39.0F, -12.0F, 125, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F);
/* 1194 */     this.gunModel['Õ'].setRotationPoint(59.0F, -4.5F, 7.0F);
/*      */     
/* 1196 */     this.gunModel['Ö'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 7, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1197 */     this.gunModel['Ö'].setRotationPoint(90.0F, -13.5F, 6.5F);
/*      */     
/* 1199 */     this.gunModel['×'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 7, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1200 */     this.gunModel['×'].setRotationPoint(68.0F, -13.5F, 6.5F);
/*      */     
/* 1202 */     this.gunModel['Ø'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1203 */     this.gunModel['Ø'].setRotationPoint(74.0F, -9.5F, 8.0F);
/*      */     
/* 1205 */     this.gunModel['Ù'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1206 */     this.gunModel['Ù'].setRotationPoint(65.0F, -9.5F, 8.0F);
/*      */     
/* 1208 */     this.gunModel['Ú'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1209 */     this.gunModel['Ú'].setRotationPoint(92.0F, -10.0F, 6.0F);
/*      */     
/* 1211 */     this.gunModel['Û'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1212 */     this.gunModel['Û'].setRotationPoint(92.0F, -11.0F, 6.0F);
/*      */     
/* 1214 */     this.gunModel['Ü'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1215 */     this.gunModel['Ü'].setRotationPoint(92.0F, -12.0F, 6.0F);
/*      */     
/* 1217 */     this.gunModel['Ý'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1218 */     this.gunModel['Ý'].setRotationPoint(69.5F, -10.0F, 6.0F);
/*      */     
/* 1220 */     this.gunModel['Þ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1221 */     this.gunModel['Þ'].setRotationPoint(69.5F, -11.0F, 6.0F);
/*      */     
/* 1223 */     this.gunModel['ß'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1224 */     this.gunModel['ß'].setRotationPoint(69.5F, -12.0F, 6.0F);
/*      */     
/* 1226 */     this.gunModel['à'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1227 */     this.gunModel['à'].setRotationPoint(165.0F, -10.0F, 6.0F);
/*      */     
/* 1229 */     this.gunModel['á'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1230 */     this.gunModel['á'].setRotationPoint(165.0F, -11.0F, 6.0F);
/*      */     
/* 1232 */     this.gunModel['â'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1233 */     this.gunModel['â'].setRotationPoint(165.0F, -12.0F, 6.0F);
/*      */     
/* 1235 */     this.gunModel['ã'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1236 */     this.gunModel['ã'].setRotationPoint(53.0F, -4.5F, 7.0F);
/*      */     
/* 1238 */     this.gunModel['ä'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1239 */     this.gunModel['ä'].setRotationPoint(46.5F, -0.5F, 0.5F);
/*      */     
/* 1241 */     this.gunModel['å'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 3, 23, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1242 */     this.gunModel['å'].setRotationPoint(42.0F, -9.5F, 0.5F);
/*      */     
/* 1244 */     this.gunModel['æ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1245 */     this.gunModel['æ'].setRotationPoint(42.0F, -6.5F, 0.5F);
/*      */     
/* 1247 */     this.gunModel['ç'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1248 */     this.gunModel['ç'].setRotationPoint(42.0F, -3.5F, 0.5F);
/*      */     
/* 1250 */     this.gunModel['è'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 23, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1251 */     this.gunModel['è'].setRotationPoint(50.5F, -2.5F, 0.5F);
/*      */     
/* 1253 */     this.gunModel['é'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 23, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1254 */     this.gunModel['é'].setRotationPoint(49.0F, -2.5F, 0.5F);
/*      */     
/* 1256 */     this.gunModel['ê'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 23, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1257 */     this.gunModel['ê'].setRotationPoint(52.5F, -7.5F, 0.5F);
/*      */     
/* 1259 */     this.gunModel['ë'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 23, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1260 */     this.gunModel['ë'].setRotationPoint(52.5F, -3.5F, 0.5F);
/*      */     
/* 1262 */     this.gunModel['ì'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1263 */     this.gunModel['ì'].setRotationPoint(51.5F, -3.5F, 0.5F);
/*      */     
/* 1265 */     this.gunModel['í'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 23, 0.0F, -4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1266 */     this.gunModel['í'].setRotationPoint(38.0F, -11.5F, 0.5F);
/*      */     
/* 1268 */     this.gunModel['î'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 23, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1269 */     this.gunModel['î'].setRotationPoint(41.5F, -9.5F, 0.5F);
/*      */     
/* 1271 */     this.gunModel['ï'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1272 */     this.gunModel['ï'].setRotationPoint(51.0F, -7.5F, 0.5F);
/*      */     
/* 1274 */     this.gunModel['ð'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1275 */     this.gunModel['ð'].setRotationPoint(50.0F, -7.5F, 0.5F);
/*      */     
/* 1277 */     this.gunModel['ñ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 1, 23, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1278 */     this.gunModel['ñ'].setRotationPoint(41.5F, -12.5F, 0.5F);
/*      */     
/* 1280 */     this.gunModel['ò'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 23, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1281 */     this.gunModel['ò'].setRotationPoint(48.5F, -9.5F, 0.5F);
/*      */     
/* 1283 */     this.gunModel['ó'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 23, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1284 */     this.gunModel['ó'].setRotationPoint(52.5F, -11.5F, 0.5F);
/*      */     
/* 1286 */     this.gunModel['ô'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 23, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F);
/* 1287 */     this.gunModel['ô'].setRotationPoint(47.5F, -11.5F, 0.5F);
/*      */     
/* 1289 */     this.gunModel['õ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 23, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 1290 */     this.gunModel['õ'].setRotationPoint(43.5F, -11.5F, 0.5F);
/*      */     
/* 1292 */     this.gunModel['ö'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 23, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1293 */     this.gunModel['ö'].setRotationPoint(39.5F, -7.5F, 0.5F);
/*      */     
/* 1295 */     this.gunModel['÷'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1296 */     this.gunModel['÷'].setRotationPoint(43.5F, -6.0F, 0.0F);
/*      */     
/* 1298 */     this.gunModel['ø'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1299 */     this.gunModel['ø'].setRotationPoint(43.5F, -4.0F, 0.0F);
/*      */     
/* 1301 */     this.gunModel['ù'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 24, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1302 */     this.gunModel['ù'].setRotationPoint(43.5F, -8.0F, 0.0F);
/*      */     
/* 1304 */     this.gunModel['ú'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 24, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1305 */     this.gunModel['ú'].setRotationPoint(39.0F, -7.0F, 2.5F);
/*      */     
/* 1307 */     this.gunModel['û'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1308 */     this.gunModel['û'].setRotationPoint(40.0F, -8.0F, 2.5F);
/*      */     
/* 1310 */     this.gunModel['ü'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 13, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1311 */     this.gunModel['ü'].setRotationPoint(42.0F, -8.0F, 2.5F);
/*      */     
/* 1313 */     this.gunModel['ý'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1314 */     this.gunModel['ý'].setRotationPoint(42.0F, -11.0F, 2.5F);
/*      */     
/* 1316 */     this.gunModel['þ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1317 */     this.gunModel['þ'].setRotationPoint(44.5F, -12.0F, 2.5F);
/*      */     
/* 1319 */     this.gunModel['ÿ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1320 */     this.gunModel['ÿ'].setRotationPoint(42.0F, 16.0F, 5.5F);
/*      */     
/* 1322 */     this.gunModel['Ā'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 7, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1323 */     this.gunModel['Ā'].setRotationPoint(41.0F, 9.0F, 5.5F);
/*      */     
/* 1325 */     this.gunModel['ā'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1326 */     this.gunModel['ā'].setRotationPoint(41.0F, 8.5F, 5.5F);
/*      */     
/* 1328 */     this.gunModel['Ă'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1329 */     this.gunModel['Ă'].setRotationPoint(39.0F, 7.5F, 5.5F);
/*      */     
/* 1331 */     this.gunModel['ă'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1332 */     this.gunModel['ă'].setRotationPoint(42.0F, 6.5F, 5.5F);
/*      */     
/* 1334 */     this.gunModel['Ą'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1335 */     this.gunModel['Ą'].setRotationPoint(42.0F, 4.5F, 5.5F);
/*      */     
/* 1337 */     this.gunModel['ą'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1338 */     this.gunModel['ą'].setRotationPoint(42.0F, 3.5F, 5.5F);
/*      */     
/* 1340 */     this.gunModel['Ć'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1341 */     this.gunModel['Ć'].setRotationPoint(43.5F, 1.5F, 5.5F);
/*      */     
/* 1343 */     this.gunModel['ć'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1344 */     this.gunModel['ć'].setRotationPoint(46.5F, -0.5F, 5.5F);
/*      */     
/* 1346 */     this.gunModel['Ĉ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1347 */     this.gunModel['Ĉ'].setRotationPoint(42.0F, 16.0F, 10.5F);
/*      */     
/* 1349 */     this.gunModel['ĉ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 7, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1350 */     this.gunModel['ĉ'].setRotationPoint(41.0F, 9.0F, 10.5F);
/*      */     
/* 1352 */     this.gunModel['Ċ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1353 */     this.gunModel['Ċ'].setRotationPoint(41.0F, 8.5F, 10.5F);
/*      */     
/* 1355 */     this.gunModel['ċ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1356 */     this.gunModel['ċ'].setRotationPoint(39.0F, 7.5F, 10.5F);
/*      */     
/* 1358 */     this.gunModel['Č'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1359 */     this.gunModel['Č'].setRotationPoint(42.0F, 6.5F, 10.5F);
/*      */     
/* 1361 */     this.gunModel['č'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1362 */     this.gunModel['č'].setRotationPoint(42.0F, 4.5F, 10.5F);
/*      */     
/* 1364 */     this.gunModel['Ď'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1365 */     this.gunModel['Ď'].setRotationPoint(42.0F, 3.5F, 10.5F);
/*      */     
/* 1367 */     this.gunModel['ď'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1368 */     this.gunModel['ď'].setRotationPoint(43.5F, 1.5F, 10.5F);
/*      */     
/* 1370 */     this.gunModel['Đ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1371 */     this.gunModel['Đ'].setRotationPoint(46.5F, -0.5F, 10.5F);
/*      */     
/* 1373 */     this.gunModel['đ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1374 */     this.gunModel['đ'].setRotationPoint(42.0F, 16.0F, 15.5F);
/*      */     
/* 1376 */     this.gunModel['Ē'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 7, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1377 */     this.gunModel['Ē'].setRotationPoint(41.0F, 9.0F, 15.5F);
/*      */     
/* 1379 */     this.gunModel['ē'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1380 */     this.gunModel['ē'].setRotationPoint(41.0F, 8.5F, 15.5F);
/*      */     
/* 1382 */     this.gunModel['Ĕ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1383 */     this.gunModel['Ĕ'].setRotationPoint(39.0F, 7.5F, 15.5F);
/*      */     
/* 1385 */     this.gunModel['ĕ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1386 */     this.gunModel['ĕ'].setRotationPoint(42.0F, 6.5F, 15.5F);
/*      */     
/* 1388 */     this.gunModel['Ė'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1389 */     this.gunModel['Ė'].setRotationPoint(42.0F, 4.5F, 15.5F);
/*      */     
/* 1391 */     this.gunModel['ė'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1392 */     this.gunModel['ė'].setRotationPoint(42.0F, 3.5F, 15.5F);
/*      */     
/* 1394 */     this.gunModel['Ę'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1395 */     this.gunModel['Ę'].setRotationPoint(43.5F, 1.5F, 15.5F);
/*      */     
/* 1397 */     this.gunModel['ę'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1398 */     this.gunModel['ę'].setRotationPoint(46.5F, -0.5F, 15.5F);
/*      */     
/* 1400 */     this.gunModel['Ě'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1401 */     this.gunModel['Ě'].setRotationPoint(42.0F, 16.0F, 20.5F);
/*      */     
/* 1403 */     this.gunModel['ě'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 7, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1404 */     this.gunModel['ě'].setRotationPoint(41.0F, 9.0F, 20.5F);
/*      */     
/* 1406 */     this.gunModel['Ĝ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1407 */     this.gunModel['Ĝ'].setRotationPoint(41.0F, 8.5F, 20.5F);
/*      */     
/* 1409 */     this.gunModel['ĝ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1410 */     this.gunModel['ĝ'].setRotationPoint(39.0F, 7.5F, 20.5F);
/*      */     
/* 1412 */     this.gunModel['Ğ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1413 */     this.gunModel['Ğ'].setRotationPoint(42.0F, 6.5F, 20.5F);
/*      */     
/* 1415 */     this.gunModel['ğ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1416 */     this.gunModel['ğ'].setRotationPoint(42.0F, 4.5F, 20.5F);
/*      */     
/* 1418 */     this.gunModel['Ġ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1419 */     this.gunModel['Ġ'].setRotationPoint(42.0F, 3.5F, 20.5F);
/*      */     
/* 1421 */     this.gunModel['ġ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 3, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1422 */     this.gunModel['ġ'].setRotationPoint(43.5F, 1.5F, 20.5F);
/*      */     
/* 1424 */     this.gunModel['Ģ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1425 */     this.gunModel['Ģ'].setRotationPoint(46.5F, -0.5F, 20.5F);
/*      */     
/* 1427 */     this.gunModel['ģ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1428 */     this.gunModel['ģ'].setRotationPoint(42.0F, 16.0F, 18.5F);
/*      */     
/* 1430 */     this.gunModel['Ĥ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 7, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1431 */     this.gunModel['Ĥ'].setRotationPoint(41.0F, 9.0F, 18.5F);
/*      */     
/* 1433 */     this.gunModel['ĥ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1434 */     this.gunModel['ĥ'].setRotationPoint(41.0F, 8.5F, 18.5F);
/*      */     
/* 1436 */     this.gunModel['Ħ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1437 */     this.gunModel['Ħ'].setRotationPoint(39.0F, 7.5F, 18.5F);
/*      */     
/* 1439 */     this.gunModel['ħ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1440 */     this.gunModel['ħ'].setRotationPoint(42.0F, 6.5F, 18.5F);
/*      */     
/* 1442 */     this.gunModel['Ĩ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1443 */     this.gunModel['Ĩ'].setRotationPoint(42.0F, 4.5F, 18.5F);
/*      */     
/* 1445 */     this.gunModel['ĩ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1446 */     this.gunModel['ĩ'].setRotationPoint(42.0F, 3.5F, 18.5F);
/*      */     
/* 1448 */     this.gunModel['Ī'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1449 */     this.gunModel['Ī'].setRotationPoint(43.5F, 1.5F, 18.5F);
/*      */     
/* 1451 */     this.gunModel['ī'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 2, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1452 */     this.gunModel['ī'].setRotationPoint(46.5F, -0.5F, 18.5F);
/*      */     
/* 1454 */     this.gunModel['Ĭ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1455 */     this.gunModel['Ĭ'].setRotationPoint(42.0F, 16.0F, 13.5F);
/*      */     
/* 1457 */     this.gunModel['ĭ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 7, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1458 */     this.gunModel['ĭ'].setRotationPoint(41.0F, 9.0F, 13.5F);
/*      */     
/* 1460 */     this.gunModel['Į'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1461 */     this.gunModel['Į'].setRotationPoint(41.0F, 8.5F, 13.5F);
/*      */     
/* 1463 */     this.gunModel['į'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1464 */     this.gunModel['į'].setRotationPoint(39.0F, 7.5F, 13.5F);
/*      */     
/* 1466 */     this.gunModel['İ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1467 */     this.gunModel['İ'].setRotationPoint(42.0F, 6.5F, 13.5F);
/*      */     
/* 1469 */     this.gunModel['ı'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1470 */     this.gunModel['ı'].setRotationPoint(42.0F, 4.5F, 13.5F);
/*      */     
/* 1472 */     this.gunModel['Ĳ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1473 */     this.gunModel['Ĳ'].setRotationPoint(42.0F, 3.5F, 13.5F);
/*      */     
/* 1475 */     this.gunModel['ĳ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1476 */     this.gunModel['ĳ'].setRotationPoint(43.5F, 1.5F, 13.5F);
/*      */     
/* 1478 */     this.gunModel['Ĵ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 2, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1479 */     this.gunModel['Ĵ'].setRotationPoint(46.5F, -0.5F, 13.5F);
/*      */     
/* 1481 */     this.gunModel['ĵ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1482 */     this.gunModel['ĵ'].setRotationPoint(42.0F, 16.0F, 8.5F);
/*      */     
/* 1484 */     this.gunModel['Ķ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 7, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1485 */     this.gunModel['Ķ'].setRotationPoint(41.0F, 9.0F, 8.5F);
/*      */     
/* 1487 */     this.gunModel['ķ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1488 */     this.gunModel['ķ'].setRotationPoint(41.0F, 8.5F, 8.5F);
/*      */     
/* 1490 */     this.gunModel['ĸ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1491 */     this.gunModel['ĸ'].setRotationPoint(39.0F, 7.5F, 8.5F);
/*      */     
/* 1493 */     this.gunModel['Ĺ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1494 */     this.gunModel['Ĺ'].setRotationPoint(42.0F, 6.5F, 8.5F);
/*      */     
/* 1496 */     this.gunModel['ĺ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1497 */     this.gunModel['ĺ'].setRotationPoint(42.0F, 4.5F, 8.5F);
/*      */     
/* 1499 */     this.gunModel['Ļ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1500 */     this.gunModel['Ļ'].setRotationPoint(42.0F, 3.5F, 8.5F);
/*      */     
/* 1502 */     this.gunModel['ļ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1503 */     this.gunModel['ļ'].setRotationPoint(43.5F, 1.5F, 8.5F);
/*      */     
/* 1505 */     this.gunModel['Ľ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 2, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1506 */     this.gunModel['Ľ'].setRotationPoint(46.5F, -0.5F, 8.5F);
/*      */     
/* 1508 */     this.gunModel['ľ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1509 */     this.gunModel['ľ'].setRotationPoint(42.0F, 16.0F, 3.5F);
/*      */     
/* 1511 */     this.gunModel['Ŀ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 7, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1512 */     this.gunModel['Ŀ'].setRotationPoint(41.0F, 9.0F, 3.5F);
/*      */     
/* 1514 */     this.gunModel['ŀ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1515 */     this.gunModel['ŀ'].setRotationPoint(41.0F, 8.5F, 3.5F);
/*      */     
/* 1517 */     this.gunModel['Ł'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1518 */     this.gunModel['Ł'].setRotationPoint(39.0F, 7.5F, 3.5F);
/*      */     
/* 1520 */     this.gunModel['ł'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1521 */     this.gunModel['ł'].setRotationPoint(42.0F, 6.5F, 3.5F);
/*      */     
/* 1523 */     this.gunModel['Ń'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1524 */     this.gunModel['Ń'].setRotationPoint(42.0F, 4.5F, 3.5F);
/*      */     
/* 1526 */     this.gunModel['ń'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1527 */     this.gunModel['ń'].setRotationPoint(42.0F, 3.5F, 3.5F);
/*      */     
/* 1529 */     this.gunModel['Ņ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 2, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1530 */     this.gunModel['Ņ'].setRotationPoint(43.5F, 1.5F, 3.5F);
/*      */     
/* 1532 */     this.gunModel['ņ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 2, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1533 */     this.gunModel['ņ'].setRotationPoint(46.5F, -0.5F, 3.5F);
/*      */     
/* 1535 */     this.gunModel['Ň'].addShapeBox(71.0F, -39.0F, -12.0F, 45, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1536 */     this.gunModel['Ň'].setRotationPoint(-9.0F, 31.0F, 0.5F);
/*      */     
/* 1538 */     this.gunModel['ň'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 17, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1539 */     this.gunModel['ň'].setRotationPoint(-113.0F, -27.0F, 0.0F);
/*      */     
/* 1541 */     this.gunModel['ŉ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1542 */     this.gunModel['ŉ'].setRotationPoint(-106.0F, -13.0F, 0.0F);
/*      */     
/* 1544 */     this.gunModel['Ŋ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1545 */     this.gunModel['Ŋ'].setRotationPoint(-106.0F, -14.5F, 0.0F);
/*      */     
/* 1547 */     this.gunModel['ŋ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1548 */     this.gunModel['ŋ'].setRotationPoint(-53.0F, -8.0F, 0.5F);
/*      */     
/* 1550 */     this.gunModel['Ō'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 7, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1551 */     this.gunModel['Ō'].setRotationPoint(-66.0F, -8.0F, 0.5F);
/*      */     
/* 1553 */     this.gunModel['ō'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 4, 16, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1554 */     this.gunModel['ō'].setRotationPoint(-67.0F, 28.5F, 4.0F);
/*      */     
/* 1556 */     this.gunModel['Ŏ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 4, 16, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F);
/* 1557 */     this.gunModel['Ŏ'].setRotationPoint(-71.0F, 27.0F, 4.0F);
/*      */     
/* 1559 */     this.gunModel['ŏ'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 15, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 1560 */     this.gunModel['ŏ'].setRotationPoint(-81.0F, -8.0F, 0.5F);
/*      */     
/* 1562 */     this.gunModel['Ő'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 10, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1563 */     this.gunModel['Ő'].setRotationPoint(-96.0F, -8.0F, 0.5F);
/*      */     
/* 1565 */     this.gunModel['ő'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 9, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1566 */     this.gunModel['ő'].setRotationPoint(-103.0F, -8.0F, 0.5F);
/*      */     
/* 1568 */     this.gunModel['Œ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1569 */     this.gunModel['Œ'].setRotationPoint(-58.0F, 7.0F, 8.5F);
/*      */     
/* 1571 */     this.gunModel['œ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1572 */     this.gunModel['œ'].setRotationPoint(-50.0F, 7.0F, 8.5F);
/*      */     
/* 1574 */     this.gunModel['Ŕ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1575 */     this.gunModel['Ŕ'].setRotationPoint(-49.0F, 7.0F, 8.5F);
/*      */     
/* 1577 */     this.gunModel['ŕ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1578 */     this.gunModel['ŕ'].setRotationPoint(-53.0F, 11.0F, 8.5F);
/*      */     
/* 1580 */     this.gunModel['Ŗ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1581 */     this.gunModel['Ŗ'].setRotationPoint(-53.0F, 18.0F, 8.5F);
/*      */     
/* 1583 */     this.gunModel['ŗ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1584 */     this.gunModel['ŗ'].setRotationPoint(-51.0F, 23.0F, 8.5F);
/*      */     
/* 1586 */     this.gunModel['Ř'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1587 */     this.gunModel['Ř'].setRotationPoint(-48.0F, 26.0F, 8.5F);
/*      */     
/* 1589 */     this.gunModel['ř'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/* 1590 */     this.gunModel['ř'].setRotationPoint(-66.0F, 7.0F, 2.0F);
/*      */     
/* 1592 */     this.gunModel['Ś'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 14, 20, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, -10.0F, 0.0F, -2.0F, -10.0F, 0.0F, -2.0F, 10.0F, 0.0F, 0.0F);
/* 1593 */     this.gunModel['Ś'].setRotationPoint(-66.0F, 12.0F, 2.0F);
/*      */     
/* 1595 */     this.gunModel['ś'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 16, 20, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, -10.0F, 0.0F, -2.0F, -10.0F, 0.0F, -2.0F, 10.0F, 0.0F, 0.0F);
/* 1596 */     this.gunModel['ś'].setRotationPoint(-75.0F, 26.0F, 2.0F);
/*      */     
/* 1598 */     this.gunModel['Ŝ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 16, 20, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -8.0F, 0.0F, -2.0F, -8.0F, 0.0F, -2.0F, 8.0F, 0.0F, 0.0F);
/* 1599 */     this.gunModel['Ŝ'].setRotationPoint(-84.0F, 42.0F, 2.0F);
/*      */     
/* 1601 */     this.gunModel['ŝ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/* 1602 */     this.gunModel['ŝ'].setRotationPoint(-92.0F, 58.0F, 2.0F);
/*      */     
/* 1604 */     this.gunModel['Ş'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1605 */     this.gunModel['Ş'].setRotationPoint(-93.5F, 63.0F, 2.0F);
/*      */     
/* 1607 */     this.gunModel['ş'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 12, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F);
/* 1608 */     this.gunModel['ş'].setRotationPoint(-93.5F, 67.0F, 2.0F);
/*      */     
/* 1610 */     this.gunModel['Š'].addShapeBox(71.0F, -39.0F, -12.0F, 31, 5, 20, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1611 */     this.gunModel['Š'].setRotationPoint(-97.0F, 7.0F, 2.0F);
/*      */     
/* 1613 */     this.gunModel['š'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 5, 20, 0.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F);
/* 1614 */     this.gunModel['š'].setRotationPoint(-104.0F, 7.0F, 2.0F);
/*      */     
/* 1616 */     this.gunModel['Ţ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 7, 20, 0.0F, 6.5F, -0.5F, -2.0F, -6.0F, -0.5F, 0.0F, -6.0F, -0.5F, 0.0F, 6.5F, -0.5F, -2.0F, -0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F);
/* 1617 */     this.gunModel['Ţ'].setRotationPoint(-106.0F, 0.0F, 2.0F);
/*      */     
/* 1619 */     this.gunModel['ţ'].addShapeBox(71.0F, -39.0F, -12.0F, 30, 12, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F);
/* 1620 */     this.gunModel['ţ'].setRotationPoint(-123.5F, 67.0F, 2.0F);
/*      */     
/* 1622 */     this.gunModel['Ť'].addShapeBox(71.0F, -39.0F, -12.0F, 30, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1623 */     this.gunModel['Ť'].setRotationPoint(-123.5F, 64.0F, 2.0F);
/*      */     
/* 1625 */     this.gunModel['ť'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 4, 20, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1626 */     this.gunModel['ť'].setRotationPoint(-128.5F, 63.0F, 2.0F);
/*      */     
/* 1628 */     this.gunModel['Ŧ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 8, 20, 0.0F, -3.5F, 0.0F, -2.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F);
/* 1629 */     this.gunModel['Ŧ'].setRotationPoint(-128.5F, 55.0F, 2.0F);
/*      */     
/* 1631 */     this.gunModel['ŧ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 9, 20, 0.0F, -6.0F, 0.0F, -2.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F);
/* 1632 */     this.gunModel['ŧ'].setRotationPoint(-125.5F, 46.0F, 2.0F);
/*      */     
/* 1634 */     this.gunModel['Ũ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 9, 20, 0.0F, -7.0F, 0.0F, -2.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1635 */     this.gunModel['Ũ'].setRotationPoint(-119.5F, 37.0F, 2.0F);
/*      */     
/* 1637 */     this.gunModel['ũ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 6, 20, 0.0F, -6.0F, 0.0F, -2.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1638 */     this.gunModel['ũ'].setRotationPoint(-112.5F, 31.0F, 2.0F);
/*      */     
/* 1640 */     this.gunModel['Ū'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 8, 20, 0.0F, -4.0F, 0.0F, -2.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1641 */     this.gunModel['Ū'].setRotationPoint(-106.5F, 23.0F, 2.0F);
/*      */     
/* 1643 */     this.gunModel['ū'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 8, 20, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1644 */     this.gunModel['ū'].setRotationPoint(-102.5F, 15.0F, 2.0F);
/*      */     
/* 1646 */     this.gunModel['Ŭ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 3, 20, 0.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1647 */     this.gunModel['Ŭ'].setRotationPoint(-102.5F, 12.0F, 2.0F);
/*      */     
/* 1649 */     this.gunModel['ŭ'].addShapeBox(71.0F, -39.0F, -12.0F, 32, 7, 20, 0.0F, 6.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 6.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1650 */     this.gunModel['ŭ'].setRotationPoint(-99.5F, 0.0F, 2.0F);
/*      */     
/* 1652 */     this.gunModel['Ů'].addShapeBox(71.0F, -39.0F, -12.0F, 29, 3, 20, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1653 */     this.gunModel['Ů'].setRotationPoint(-97.5F, 12.0F, 2.0F);
/*      */     
/* 1655 */     this.gunModel['ů'].addShapeBox(71.0F, -39.0F, -12.0F, 24, 8, 20, 0.0F, 0.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1656 */     this.gunModel['ů'].setRotationPoint(-97.5F, 15.0F, 2.0F);
/*      */     
/* 1658 */     this.gunModel['Ű'].addShapeBox(71.0F, -39.0F, -12.0F, 24, 3, 20, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1659 */     this.gunModel['Ű'].setRotationPoint(-99.5F, 23.0F, 2.0F);
/*      */     
/* 1661 */     this.gunModel['ű'].addShapeBox(71.0F, -39.0F, -12.0F, 22, 3, 20, 0.0F, -2.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1662 */     this.gunModel['ű'].setRotationPoint(-101.5F, 26.0F, 2.0F);
/*      */     
/* 1664 */     this.gunModel['Ų'].addShapeBox(71.0F, -39.0F, -12.0F, 30, 1, 20, 0.0F, -0.75F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F);
/* 1665 */     this.gunModel['Ų'].setRotationPoint(-123.5F, 61.0F, 2.0F);
/*      */     
/* 1667 */     this.gunModel['ų'].addShapeBox(71.0F, -39.0F, -12.0F, 30, 1, 20, 0.0F, -0.85F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1668 */     this.gunModel['ų'].setRotationPoint(-122.5F, 58.0F, 2.0F);
/*      */     
/* 1670 */     this.gunModel['Ŵ'].addShapeBox(71.0F, -39.0F, -12.0F, 30, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/* 1671 */     this.gunModel['Ŵ'].setRotationPoint(-121.5F, 55.0F, 2.0F);
/*      */     
/* 1673 */     this.gunModel['ŵ'].addShapeBox(71.0F, -39.0F, -12.0F, 29, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, 1.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F);
/* 1674 */     this.gunModel['ŵ'].setRotationPoint(-119.5F, 52.0F, 2.0F);
/*      */     
/* 1676 */     this.gunModel['Ŷ'].addShapeBox(71.0F, -39.0F, -12.0F, 28, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, 1.45F, 0.0F, 0.0F, 1.45F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 1677 */     this.gunModel['Ŷ'].setRotationPoint(-117.5F, 49.0F, 2.0F);
/*      */     
/* 1679 */     this.gunModel['ŷ'].addShapeBox(71.0F, -39.0F, -12.0F, 27, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 1680 */     this.gunModel['ŷ'].setRotationPoint(-115.5F, 46.0F, 2.0F);
/*      */     
/* 1682 */     this.gunModel['Ÿ'].addShapeBox(71.0F, -39.0F, -12.0F, 26, 1, 20, 0.0F, -1.35F, 0.0F, 0.0F, 2.05F, 0.0F, 0.0F, 2.05F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, 1.65F, 0.0F, 0.0F, 1.65F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F);
/* 1683 */     this.gunModel['Ÿ'].setRotationPoint(-113.5F, 43.0F, 2.0F);
/*      */     
/* 1685 */     this.gunModel['Ź'].addShapeBox(71.0F, -39.0F, -12.0F, 26, 1, 20, 0.0F, -1.65F, 0.0F, 0.0F, 1.65F, 0.0F, 0.0F, 1.65F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 1686 */     this.gunModel['Ź'].setRotationPoint(-111.5F, 40.0F, 2.0F);
/*      */     
/* 1688 */     this.gunModel['ź'].addShapeBox(71.0F, -39.0F, -12.0F, 26, 1, 20, 0.0F, -2.0F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F);
/* 1689 */     this.gunModel['ź'].setRotationPoint(-109.5F, 37.0F, 2.0F);
/*      */     
/* 1691 */     this.gunModel['Ż'].addShapeBox(71.0F, -39.0F, -12.0F, 25, 1, 20, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1692 */     this.gunModel['Ż'].setRotationPoint(-106.5F, 34.0F, 2.0F);
/*      */     
/* 1694 */     this.gunModel['ż'].addShapeBox(71.0F, -39.0F, -12.0F, 25, 1, 20, 0.0F, -3.0F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1695 */     this.gunModel['ż'].setRotationPoint(-104.5F, 31.0F, 2.0F);
/*      */     
/* 1697 */     this.gunModel['Ž'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.5F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1698 */     this.gunModel['Ž'].setRotationPoint(-82.5F, 29.0F, 2.0F);
/*      */     
/* 1700 */     this.gunModel['ž'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.75F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1701 */     this.gunModel['ž'].setRotationPoint(-84.2F, 32.0F, 2.0F);
/*      */     
/* 1703 */     this.gunModel['ſ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.75F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1704 */     this.gunModel['ſ'].setRotationPoint(-85.9F, 35.0F, 2.0F);
/*      */     
/* 1706 */     this.gunModel['ƀ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1707 */     this.gunModel['ƀ'].setRotationPoint(-87.6F, 38.0F, 2.0F);
/*      */     
/* 1709 */     this.gunModel['Ɓ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1710 */     this.gunModel['Ɓ'].setRotationPoint(-89.15F, 41.0F, 2.0F);
/*      */     
/* 1712 */     this.gunModel['Ƃ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1713 */     this.gunModel['Ƃ'].setRotationPoint(-90.65F, 44.0F, 2.0F);
/*      */     
/* 1715 */     this.gunModel['ƃ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1716 */     this.gunModel['ƃ'].setRotationPoint(-91.95F, 47.0F, 2.0F);
/*      */     
/* 1718 */     this.gunModel['Ƅ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1719 */     this.gunModel['Ƅ'].setRotationPoint(-93.3F, 50.0F, 2.0F);
/*      */     
/* 1721 */     this.gunModel['ƅ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1722 */     this.gunModel['ƅ'].setRotationPoint(-94.55F, 53.0F, 2.0F);
/*      */     
/* 1724 */     this.gunModel['Ɔ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F);
/* 1725 */     this.gunModel['Ɔ'].setRotationPoint(-95.9F, 56.0F, 2.0F);
/*      */     
/* 1727 */     this.gunModel['Ƈ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.6F, 0.0F, 0.0F, 2.6F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F);
/* 1728 */     this.gunModel['Ƈ'].setRotationPoint(-96.9F, 59.0F, 2.0F);
/*      */     
/* 1730 */     this.gunModel['ƈ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 20, 0.0F, -3.0F, 0.0F, 0.0F, 2.6F, 0.0F, 0.0F, 2.6F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.7F, 0.0F, 0.0F, 2.3F, 0.0F, 0.0F, 2.3F, 0.0F, 0.0F, -2.7F, 0.0F, 0.0F);
/* 1731 */     this.gunModel['ƈ'].setRotationPoint(-97.8F, 62.0F, 2.0F);
/*      */     
/* 1733 */     this.gunModel['Ɖ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 20, 0.0F, -2.7F, 0.0F, 0.0F, 2.3F, 0.0F, 0.0F, 2.3F, 0.0F, 0.0F, -2.7F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, 2.3F, 0.0F, 0.0F, 2.3F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F);
/* 1734 */     this.gunModel['Ɖ'].setRotationPoint(-97.8F, 63.0F, 2.0F);
/*      */     
/* 1736 */     this.gunModel['Ɗ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.5F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, 1.7F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1737 */     this.gunModel['Ɗ'].setRotationPoint(-103.0F, 29.0F, 2.0F);
/*      */     
/* 1739 */     this.gunModel['Ƌ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.5F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1740 */     this.gunModel['Ƌ'].setRotationPoint(-105.0F, 32.0F, 2.0F);
/*      */     
/* 1742 */     this.gunModel['ƌ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.5F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1743 */     this.gunModel['ƌ'].setRotationPoint(-108.0F, 35.0F, 2.0F);
/*      */     
/* 1745 */     this.gunModel['ƍ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.45F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 1746 */     this.gunModel['ƍ'].setRotationPoint(-110.75F, 38.0F, 2.0F);
/*      */     
/* 1748 */     this.gunModel['Ǝ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.45F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 1749 */     this.gunModel['Ǝ'].setRotationPoint(-113.05F, 41.0F, 2.0F);
/*      */     
/* 1751 */     this.gunModel['Ə'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.45F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, -2.45F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 1752 */     this.gunModel['Ə'].setRotationPoint(-115.4F, 44.0F, 2.0F);
/*      */     
/* 1754 */     this.gunModel['Ɛ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.25F, 0.0F, 0.0F, 2.7F, 0.0F, 0.0F, 2.7F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 1755 */     this.gunModel['Ɛ'].setRotationPoint(-117.4F, 47.0F, 2.0F);
/*      */     
/* 1757 */     this.gunModel['Ƒ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.25F, 0.0F, 0.0F, 2.7F, 0.0F, 0.0F, 2.7F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 1758 */     this.gunModel['Ƒ'].setRotationPoint(-119.4F, 50.0F, 2.0F);
/*      */     
/* 1760 */     this.gunModel['ƒ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -2.25F, 0.0F, 0.0F, 2.7F, 0.0F, 0.0F, 2.7F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 1761 */     this.gunModel['ƒ'].setRotationPoint(-121.4F, 53.0F, 2.0F);
/*      */     
/* 1763 */     this.gunModel['Ɠ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1764 */     this.gunModel['Ɠ'].setRotationPoint(-122.4F, 56.0F, 2.0F);
/*      */     
/* 1766 */     this.gunModel['Ɣ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1767 */     this.gunModel['Ɣ'].setRotationPoint(-123.5F, 59.0F, 2.0F);
/*      */     
/* 1769 */     this.gunModel['ƕ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 20, 0.0F, -1.4F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1770 */     this.gunModel['ƕ'].setRotationPoint(-124.5F, 62.0F, 2.0F);
/*      */     
/* 1772 */     this.gunModel['Ɩ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1773 */     this.gunModel['Ɩ'].setRotationPoint(-123.5F, 63.0F, 2.0F);
/*      */     
/* 1775 */     this.gunModel['Ɨ'].addShapeBox(71.0F, -39.0F, -12.0F, 31, 12, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1776 */     this.gunModel['Ɨ'].setRotationPoint(-122.5F, 52.0F, 4.0F);
/*      */     
/* 1778 */     this.gunModel['Ƙ'].addShapeBox(71.0F, -39.0F, -12.0F, 32, 12, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1779 */     this.gunModel['Ƙ'].setRotationPoint(-116.5F, 40.0F, 4.0F);
/*      */     
/* 1781 */     this.gunModel['ƙ'].addShapeBox(71.0F, -39.0F, -12.0F, 28, 12, 16, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1782 */     this.gunModel['ƙ'].setRotationPoint(-107.5F, 28.0F, 4.0F);
/*      */     
/* 1784 */     this.gunModel['ƚ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 11, 16, 0.0F, -5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1785 */     this.gunModel['ƚ'].setRotationPoint(-76.5F, 24.0F, 4.0F);
/*      */     
/* 1787 */     this.gunModel['ƛ'].addShapeBox(71.0F, -39.0F, -12.0F, 12, 10, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -11.0F, 0.5F, 0.0F, -11.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1788 */     this.gunModel['ƛ'].setRotationPoint(-116.0F, -9.5F, 0.0F);
/*      */     
/* 1790 */     this.gunModel['Ɯ'].addShapeBox(71.0F, -39.0F, -12.0F, 12, 10, 22, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -11.0F, 0.5F, 0.0F, -11.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1791 */     this.gunModel['Ɯ'].setRotationPoint(-115.0F, -9.5F, 1.0F);
/*      */     
/* 1793 */     this.gunModel['Ɲ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 10, 23, 0.0F, -8.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/* 1794 */     this.gunModel['Ɲ'].setRotationPoint(-112.0F, -9.0F, 0.5F);
/*      */     
/* 1796 */     this.gunModel['ƞ'].addShapeBox(71.0F, -39.0F, -12.0F, 22, 15, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1797 */     this.gunModel['ƞ'].setRotationPoint(-132.0F, -47.5F, 2.0F);
/*      */     
/* 1799 */     this.gunModel['Ɵ'].addShapeBox(71.0F, -39.0F, -12.0F, 22, 2, 20, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1800 */     this.gunModel['Ɵ'].setRotationPoint(-132.0F, -49.5F, 2.0F);
/*      */     
/* 1802 */     this.gunModel['Ơ'].addShapeBox(71.0F, -39.0F, -12.0F, 22, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1803 */     this.gunModel['Ơ'].setRotationPoint(-132.0F, -50.5F, 4.0F);
/*      */     
/* 1805 */     this.gunModel['ơ'].addShapeBox(71.0F, -39.0F, -12.0F, 22, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1806 */     this.gunModel['ơ'].setRotationPoint(-132.0F, -50.5F, 18.0F);
/*      */     
/* 1808 */     this.gunModel['Ƣ'].addShapeBox(71.0F, -39.0F, -12.0F, 18, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1809 */     this.gunModel['Ƣ'].setRotationPoint(-134.0F, -4.5F, 0.0F);
/*      */     
/* 1811 */     this.gunModel['ƣ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 25, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1812 */     this.gunModel['ƣ'].setRotationPoint(-134.0F, -29.5F, 0.0F);
/*      */     
/* 1814 */     this.gunModel['Ƥ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1815 */     this.gunModel['Ƥ'].setRotationPoint(-134.0F, -32.5F, 0.0F);
/*      */     
/* 1817 */     this.gunModel['ƥ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1818 */     this.gunModel['ƥ'].setRotationPoint(-113.0F, -32.5F, 0.0F);
/*      */     
/* 1820 */     this.gunModel['Ʀ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 24, 0.0F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1821 */     this.gunModel['Ʀ'].setRotationPoint(-110.0F, -30.5F, 0.0F);
/*      */     
/* 1823 */     this.gunModel['Ƨ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 1824 */     this.gunModel['Ƨ'].setRotationPoint(-108.0F, -31.0F, 0.5F);
/*      */     
/* 1826 */     this.gunModel['ƨ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F, -1.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 1827 */     this.gunModel['ƨ'].setRotationPoint(-110.0F, -31.0F, 0.5F);
/*      */     
/* 1829 */     this.gunModel['Ʃ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1830 */     this.gunModel['Ʃ'].setRotationPoint(-110.0F, -47.5F, 3.5F);
/*      */     
/* 1832 */     this.gunModel['ƪ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 17, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1833 */     this.gunModel['ƪ'].setRotationPoint(-110.0F, -49.5F, 3.5F);
/*      */     
/* 1835 */     this.gunModel['ƫ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 1836 */     this.gunModel['ƫ'].setRotationPoint(-125.0F, -32.5F, 0.0F);
/*      */     
/* 1838 */     this.gunModel['Ƭ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 20, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1839 */     this.gunModel['Ƭ'].setRotationPoint(-128.0F, -29.5F, 0.0F);
/*      */     
/* 1841 */     this.gunModel['ƭ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1842 */     this.gunModel['ƭ'].setRotationPoint(-128.0F, -32.5F, 0.0F);
/*      */     
/* 1844 */     this.gunModel['Ʈ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/* 1845 */     this.gunModel['Ʈ'].setRotationPoint(-116.0F, -32.5F, 0.0F);
/*      */     
/* 1847 */     this.gunModel['Ư'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 20, 24, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/* 1848 */     this.gunModel['Ư'].setRotationPoint(-116.0F, -29.5F, 0.0F);
/*      */     
/* 1850 */     this.gunModel['ư'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 3, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1851 */     this.gunModel['ư'].setRotationPoint(-125.0F, -29.5F, -2.0F);
/*      */     
/* 1853 */     this.gunModel['Ʊ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1854 */     this.gunModel['Ʊ'].setRotationPoint(-117.0F, -26.5F, -2.0F);
/*      */     
/* 1856 */     this.gunModel['Ʋ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1857 */     this.gunModel['Ʋ'].setRotationPoint(-125.0F, -26.5F, -2.0F);
/*      */     
/* 1859 */     this.gunModel['Ƴ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 17, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1860 */     this.gunModel['Ƴ'].setRotationPoint(-125.0F, -27.0F, 0.0F);
/*      */     
/* 1862 */     this.gunModel['ƴ'].addShapeBox(71.0F, -39.0F, -12.0F, 12, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1863 */     this.gunModel['ƴ'].setRotationPoint(-128.0F, -9.5F, 0.0F);
/*      */     
/* 1865 */     this.gunModel['Ƶ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1866 */     this.gunModel['Ƶ'].setRotationPoint(-123.5F, -11.0F, -1.0F);
/*      */     
/* 1868 */     this.gunModel['ƶ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 26, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1869 */     this.gunModel['ƶ'].setRotationPoint(-123.5F, -15.0F, -1.0F);
/*      */     
/* 1871 */     this.gunModel['Ʒ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1872 */     this.gunModel['Ʒ'].setRotationPoint(-123.5F, -13.0F, -1.0F);
/*      */     
/* 1874 */     this.gunModel['Ƹ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 34, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1875 */     this.gunModel['Ƹ'].setRotationPoint(-137.0F, -32.5F, 0.0F);
/*      */     
/* 1877 */     this.gunModel['ƹ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 34, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1878 */     this.gunModel['ƹ'].setRotationPoint(-143.0F, -32.5F, 0.0F);
/*      */     
/* 1880 */     this.gunModel['ƺ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1881 */     this.gunModel['ƺ'].setRotationPoint(-140.0F, -2.5F, 0.0F);
/*      */     
/* 1883 */     this.gunModel['ƻ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 11, 24, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1884 */     this.gunModel['ƻ'].setRotationPoint(-138.0F, -46.5F, 0.0F);
/*      */     
/* 1886 */     this.gunModel['Ƽ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 14, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1887 */     this.gunModel['Ƽ'].setRotationPoint(-138.0F, -49.5F, 5.0F);
/*      */     
/* 1889 */     this.gunModel['ƽ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 34, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1890 */     this.gunModel['ƽ'].setRotationPoint(-151.0F, -32.5F, 0.0F);
/*      */     
/* 1892 */     this.gunModel['ƾ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 9, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1893 */     this.gunModel['ƾ'].setRotationPoint(-147.0F, -7.5F, 0.0F);
/*      */     
/* 1895 */     this.gunModel['ƿ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1896 */     this.gunModel['ƿ'].setRotationPoint(-140.0F, -42.5F, 7.0F);
/*      */     
/* 1898 */     this.gunModel['ǀ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1899 */     this.gunModel['ǀ'].setRotationPoint(-140.0F, -45.5F, 7.0F);
/*      */     
/* 1901 */     this.gunModel['ǁ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1902 */     this.gunModel['ǁ'].setRotationPoint(-140.0F, -44.5F, 7.0F);
/*      */     
/* 1904 */     this.gunModel['ǂ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 7, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1905 */     this.gunModel['ǂ'].setRotationPoint(-147.0F, -32.5F, 0.0F);
/*      */     
/* 1907 */     this.gunModel['ǃ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1908 */     this.gunModel['ǃ'].setRotationPoint(-147.0F, -26.0F, 1.0F);
/*      */     
/* 1910 */     this.gunModel['Ǆ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1911 */     this.gunModel['Ǆ'].setRotationPoint(-147.0F, -8.5F, 1.0F);
/*      */     
/* 1913 */     this.gunModel['ǅ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1914 */     this.gunModel['ǅ'].setRotationPoint(-144.0F, -8.5F, 1.0F);
/*      */     
/* 1916 */     this.gunModel['ǆ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1917 */     this.gunModel['ǆ'].setRotationPoint(-144.0F, -26.0F, 1.0F);
/*      */     
/* 1919 */     this.gunModel['Ǉ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1920 */     this.gunModel['Ǉ'].setRotationPoint(-140.0F, -3.5F, 1.0F);
/*      */     
/* 1922 */     this.gunModel['ǈ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1923 */     this.gunModel['ǈ'].setRotationPoint(-138.0F, -3.5F, 1.0F);
/*      */     
/* 1925 */     this.gunModel['ǉ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1926 */     this.gunModel['ǉ'].setRotationPoint(-140.0F, -32.5F, 1.0F);
/*      */     
/* 1928 */     this.gunModel['Ǌ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1929 */     this.gunModel['Ǌ'].setRotationPoint(-138.0F, -32.5F, 1.0F);
/*      */     
/* 1931 */     this.gunModel['ǋ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 5, 24, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1932 */     this.gunModel['ǋ'].setRotationPoint(-172.0F, -36.5F, 0.0F);
/*      */     
/* 1934 */     this.gunModel['ǌ'].addShapeBox(71.0F, -39.0F, -12.0F, 17, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1935 */     this.gunModel['ǌ'].setRotationPoint(-151.0F, -36.0F, 0.0F);
/*      */     
/* 1937 */     this.gunModel['Ǎ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 24, 0.0F, -3.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -3.0F, 0.0F, -0.9F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1938 */     this.gunModel['Ǎ'].setRotationPoint(-142.0F, -37.5F, 0.0F);
/*      */     
/* 1940 */     this.gunModel['ǎ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 3, 24, 0.0F, 0.0F, -1.0F, -0.9F, 0.0F, 1.0F, -1.7F, 0.0F, 1.0F, -1.7F, 0.0F, -1.0F, -0.9F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1941 */     this.gunModel['ǎ'].setRotationPoint(-139.0F, -38.5F, 0.0F);
/*      */     
/* 1943 */     this.gunModel['Ǐ'].addShapeBox(71.0F, -39.0F, -12.0F, 54, 5, 24, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.5F, 0.0F);
/* 1944 */     this.gunModel['Ǐ'].setRotationPoint(-239.0F, -33.5F, 0.0F);
/*      */     
/* 1946 */     this.gunModel['ǐ'].addShapeBox(71.0F, -39.0F, -12.0F, 23, 5, 24, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1947 */     this.gunModel['ǐ'].setRotationPoint(-262.0F, -29.5F, 0.0F);
/*      */     
/* 1949 */     this.gunModel['Ǒ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 5, 24, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1950 */     this.gunModel['Ǒ'].setRotationPoint(-296.0F, -27.5F, 0.0F);
/*      */     
/* 1952 */     this.gunModel['ǒ'].addShapeBox(71.0F, -39.0F, -12.0F, 10, 5, 24, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1953 */     this.gunModel['ǒ'].setRotationPoint(-161.0F, -36.5F, 0.0F);
/*      */     
/* 1955 */     this.gunModel['Ǔ'].addShapeBox(71.0F, -39.0F, -12.0F, 10, 34, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1956 */     this.gunModel['Ǔ'].setRotationPoint(-147.0F, -32.5F, 1.0F);
/*      */     
/* 1958 */     this.gunModel['ǔ'].addShapeBox(71.0F, -39.0F, -12.0F, 54, 5, 24, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1959 */     this.gunModel['ǔ'].setRotationPoint(-239.0F, -29.0F, 0.0F);
/*      */     
/* 1961 */     this.gunModel['Ǖ'].addShapeBox(71.0F, -39.0F, -12.0F, 27, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1962 */     this.gunModel['Ǖ'].setRotationPoint(278.5F, -23.5F, 14.0F);
/*      */     
/* 1964 */     this.gunModel['ǖ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1965 */     this.gunModel['ǖ'].setRotationPoint(301.5F, -23.5F, 11.0F);
/*      */     
/* 1967 */     this.gunModel['Ǘ'].addShapeBox(71.0F, -39.0F, -12.0F, 57, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1968 */     this.gunModel['Ǘ'].setRotationPoint(-253.0F, -23.0F, 0.0F);
/*      */     
/* 1970 */     this.gunModel['ǘ'].addShapeBox(71.0F, -39.0F, -12.0F, 14, 3, 24, 0.0F, 0.0F, -3.15F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.15F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1971 */     this.gunModel['ǘ'].setRotationPoint(-253.0F, -27.0F, 0.0F);
/*      */     
/* 1973 */     this.gunModel['Ǚ'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1974 */     this.gunModel['Ǚ'].setRotationPoint(-276.0F, -23.0F, 0.0F);
/*      */     
/* 1976 */     this.gunModel['ǚ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 1977 */     this.gunModel['ǚ'].setRotationPoint(-261.0F, -23.0F, 0.0F);
/*      */     
/* 1979 */     this.gunModel['Ǜ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 6, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 1980 */     this.gunModel['Ǜ'].setRotationPoint(-279.0F, -23.0F, 0.0F);
/*      */     
/* 1982 */     this.gunModel['ǜ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 8, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 1983 */     this.gunModel['ǜ'].setRotationPoint(-282.0F, -23.0F, 0.0F);
/*      */     
/* 1985 */     this.gunModel['ǝ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 1, 24, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1986 */     this.gunModel['ǝ'].setRotationPoint(-262.0F, -24.0F, 0.0F);
/*      */     
/* 1988 */     this.gunModel['Ǟ'].addShapeBox(71.0F, -39.0F, -12.0F, 17, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1989 */     this.gunModel['Ǟ'].setRotationPoint(-257.0F, -18.0F, 5.0F);
/*      */     
/* 1991 */     this.gunModel['ǟ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 12, 24, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1992 */     this.gunModel['ǟ'].setRotationPoint(-287.0F, -23.0F, 0.0F);
/*      */     
/* 1994 */     this.gunModel['Ǡ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 7, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1995 */     this.gunModel['Ǡ'].setRotationPoint(-296.0F, -23.0F, 0.0F);
/*      */     
/* 1997 */     this.gunModel['ǡ'].addShapeBox(71.0F, -39.0F, -12.0F, 26, 5, 24, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1998 */     this.gunModel['ǡ'].setRotationPoint(-288.0F, -27.5F, 0.0F);
/*      */     
/* 2000 */     this.gunModel['Ǣ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 35, 24, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 2001 */     this.gunModel['Ǣ'].setRotationPoint(-296.0F, -16.0F, 0.0F);
/*      */     
/* 2003 */     this.gunModel['ǣ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 35, 24, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 2004 */     this.gunModel['ǣ'].setRotationPoint(-292.0F, 19.0F, 0.0F);
/*      */     
/* 2006 */     this.gunModel['Ǥ'].addShapeBox(71.0F, -39.0F, -12.0F, 12, 2, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2007 */     this.gunModel['Ǥ'].setRotationPoint(-255.0F, -15.0F, 5.0F);
/*      */     
/* 2009 */     this.gunModel['ǥ'].addShapeBox(71.0F, -39.0F, -12.0F, 10, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2010 */     this.gunModel['ǥ'].setRotationPoint(-253.5F, -13.0F, 5.0F);
/*      */     
/* 2012 */     this.gunModel['Ǧ'].addShapeBox(71.0F, -39.0F, -12.0F, 10, 2, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2013 */     this.gunModel['Ǧ'].setRotationPoint(-253.5F, -11.0F, 5.0F);
/*      */     
/* 2015 */     this.gunModel['ǧ'].addShapeBox(71.0F, -39.0F, -12.0F, 10, 3, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2016 */     this.gunModel['ǧ'].setRotationPoint(-253.5F, -9.0F, 5.0F);
/*      */     
/* 2018 */     this.gunModel['Ǩ'].addShapeBox(71.0F, -39.0F, -12.0F, 14, 6, 14, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.5F, 0.0F);
/* 2019 */     this.gunModel['Ǩ'].setRotationPoint(-253.5F, -6.0F, 5.0F);
/*      */     
/* 2021 */     this.gunModel['ǩ'].addShapeBox(71.0F, -39.0F, -12.0F, 14, 2, 14, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2022 */     this.gunModel['ǩ'].setRotationPoint(-229.0F, -20.0F, 5.0F);
/*      */     
/* 2024 */     this.gunModel['Ǫ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 2, 14, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2025 */     this.gunModel['Ǫ'].setRotationPoint(-227.0F, -18.0F, 5.0F);
/*      */     
/* 2027 */     this.gunModel['ǫ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 14, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2028 */     this.gunModel['ǫ'].setRotationPoint(-225.5F, -16.0F, 5.0F);
/*      */     
/* 2030 */     this.gunModel['Ǭ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2031 */     this.gunModel['Ǭ'].setRotationPoint(-225.5F, -14.0F, 5.0F);
/*      */     
/* 2033 */     this.gunModel['ǭ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 3, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2034 */     this.gunModel['ǭ'].setRotationPoint(-225.5F, -12.0F, 5.0F);
/*      */     
/* 2036 */     this.gunModel['Ǯ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F);
/* 2037 */     this.gunModel['Ǯ'].setRotationPoint(-225.5F, -9.0F, 5.0F);
/*      */     
/* 2039 */     this.gunModel['ǯ'].addShapeBox(71.0F, -39.0F, -12.0F, 61, 10, 20, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 2040 */     this.gunModel['ǯ'].setRotationPoint(-255.0F, 0.0F, 2.0F);
/*      */     
/* 2042 */     this.gunModel['ǰ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 12, 20, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F);
/* 2043 */     this.gunModel['ǰ'].setRotationPoint(-262.0F, 1.0F, 2.0F);
/*      */     
/* 2045 */     this.gunModel['Ǳ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 12, 20, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 16.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 16.0F, 0.0F);
/* 2046 */     this.gunModel['Ǳ'].setRotationPoint(-269.0F, 4.0F, 2.0F);
/*      */     
/* 2048 */     this.gunModel['ǲ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 21, 20, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 23.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 23.0F, 0.0F);
/* 2049 */     this.gunModel['ǲ'].setRotationPoint(-272.0F, 9.0F, 2.0F);
/*      */     
/* 2051 */     this.gunModel['ǳ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 21, 20, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F, 13.0F, 0.0F);
/* 2052 */     this.gunModel['ǳ'].setRotationPoint(-276.0F, 12.0F, 2.0F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2057 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 265, 761, this.textureX, this.textureY);
/* 2058 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 761, 761, this.textureX, this.textureY);
/* 2059 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 817, 761, this.textureX, this.textureY);
/* 2060 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 89, 769, this.textureX, this.textureY);
/* 2061 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 137, 769, this.textureX, this.textureY);
/* 2062 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 201, 769, this.textureX, this.textureY);
/* 2063 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 865, 769, this.textureX, this.textureY);
/* 2064 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 897, 769, this.textureX, this.textureY);
/* 2065 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 1, 777, this.textureX, this.textureY);
/* 2066 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 369, 777, this.textureX, this.textureY);
/* 2067 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 225, 785, this.textureX, this.textureY);
/* 2068 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 177, 785, this.textureX, this.textureY);
/* 2069 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 457, 793, this.textureX, this.textureY);
/* 2070 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 521, 793, this.textureX, this.textureY);
/* 2071 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 585, 793, this.textureX, this.textureY);
/* 2072 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 225, 649, this.textureX, this.textureY);
/* 2073 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 281, 793, this.textureX, this.textureY);
/* 2074 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 825, 657, this.textureX, this.textureY);
/* 2075 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 673, 793, this.textureX, this.textureY);
/* 2076 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 841, 793, this.textureX, this.textureY);
/* 2077 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 41, 801, this.textureX, this.textureY);
/* 2078 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 113, 801, this.textureX, this.textureY);
/* 2079 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 945, 801, this.textureX, this.textureY);
/* 2080 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 193, 801, this.textureX, this.textureY);
/* 2081 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 329, 801, this.textureX, this.textureY);
/* 2082 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 705, 689, this.textureX, this.textureY);
/* 2083 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 521, 721, this.textureX, this.textureY);
/* 2084 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 257, 729, this.textureX, this.textureY);
/* 2085 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 793, 761, this.textureX, this.textureY);
/* 2086 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 577, 721, this.textureX, this.textureY);
/* 2087 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 385, 809, this.textureX, this.textureY);
/* 2088 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 193, 433, this.textureX, this.textureY);
/* 2089 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 121, 481, this.textureX, this.textureY);
/* 2090 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 721, 801, this.textureX, this.textureY);
/* 2091 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 1, 817, this.textureX, this.textureY);
/* 2092 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 521, 817, this.textureX, this.textureY);
/* 2093 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 161, 817, this.textureX, this.textureY);
/* 2094 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 793, 817, this.textureX, this.textureY);
/* 2095 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 881, 817, this.textureX, this.textureY);
/* 2096 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 225, 825, this.textureX, this.textureY);
/* 2097 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 425, 817, this.textureX, this.textureY);
/* 2098 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 289, 825, this.textureX, this.textureY);
/* 2099 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 457, 825, this.textureX, this.textureY);
/* 2100 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 561, 825, this.textureX, this.textureY);
/* 2101 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 617, 825, this.textureX, this.textureY);
/* 2102 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 833, 825, this.textureX, this.textureY);
/* 2103 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 921, 825, this.textureX, this.textureY);
/* 2104 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 65, 833, this.textureX, this.textureY);
/* 2105 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 121, 833, this.textureX, this.textureY);
/* 2106 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 321, 833, this.textureX, this.textureY);
/* 2107 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 649, 833, this.textureX, this.textureY);
/* 2108 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 977, 825, this.textureX, this.textureY);
/* 2109 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 73, 233, this.textureX, this.textureY);
/* 2110 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 177, 849, this.textureX, this.textureY);
/* 2111 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 385, 849, this.textureX, this.textureY);
/* 2112 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 497, 849, this.textureX, this.textureY);
/* 2113 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 649, 793, this.textureX, this.textureY);
/* 2114 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 89, 801, this.textureX, this.textureY);
/* 2115 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 265, 825, this.textureX, this.textureY);
/* 2116 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 33, 505, this.textureX, this.textureY);
/* 2117 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 769, 849, this.textureX, this.textureY);
/* 2118 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 1009, 329, this.textureX, this.textureY);
/* 2119 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 1001, 361, this.textureX, this.textureY);
/* 2120 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 593, 825, this.textureX, this.textureY);
/* 2121 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 297, 385, this.textureX, this.textureY);
/* 2122 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 977, 57, this.textureX, this.textureY);
/* 2123 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/* 2124 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 721, 121, this.textureX, this.textureY);
/* 2125 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 929, 121, this.textureX, this.textureY);
/* 2126 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 425, 849, this.textureX, this.textureY);
/* 2127 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 265, 849, this.textureX, this.textureY);
/* 2128 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 329, 177, this.textureX, this.textureY);
/* 2129 */     this.gunModel['ȼ'] = new ModelRendererTurbo(this, 401, 385, this.textureX, this.textureY);
/* 2130 */     this.gunModel['Ƚ'] = new ModelRendererTurbo(this, 193, 153, this.textureX, this.textureY);
/* 2131 */     this.gunModel['Ⱦ'] = new ModelRendererTurbo(this, 329, 385, this.textureX, this.textureY);
/* 2132 */     this.gunModel['ȿ'] = new ModelRendererTurbo(this, 993, 153, this.textureX, this.textureY);
/* 2133 */     this.gunModel['ɀ'] = new ModelRendererTurbo(this, 353, 177, this.textureX, this.textureY);
/* 2134 */     this.gunModel['Ɂ'] = new ModelRendererTurbo(this, 329, 185, this.textureX, this.textureY);
/* 2135 */     this.gunModel['ɂ'] = new ModelRendererTurbo(this, 913, 257, this.textureX, this.textureY);
/* 2136 */     this.gunModel['Ƀ'] = new ModelRendererTurbo(this, 601, 305, this.textureX, this.textureY);
/* 2137 */     this.gunModel['Ʉ'] = new ModelRendererTurbo(this, 633, 209, this.textureX, this.textureY);
/* 2138 */     this.gunModel['Ʌ'] = new ModelRendererTurbo(this, 1009, 209, this.textureX, this.textureY);
/* 2139 */     this.gunModel['Ɇ'] = new ModelRendererTurbo(this, 105, 233, this.textureX, this.textureY);
/* 2140 */     this.gunModel['ɇ'] = new ModelRendererTurbo(this, 1009, 185, this.textureX, this.textureY);
/* 2141 */     this.gunModel['Ɉ'] = new ModelRendererTurbo(this, 1009, 225, this.textureX, this.textureY);
/* 2142 */     this.gunModel['ɉ'] = new ModelRendererTurbo(this, 161, 233, this.textureX, this.textureY);
/* 2143 */     this.gunModel['Ɋ'] = new ModelRendererTurbo(this, 185, 233, this.textureX, this.textureY);
/* 2144 */     this.gunModel['ɋ'] = new ModelRendererTurbo(this, 241, 233, this.textureX, this.textureY);
/* 2145 */     this.gunModel['Ɍ'] = new ModelRendererTurbo(this, 385, 233, this.textureX, this.textureY);
/* 2146 */     this.gunModel['ɍ'] = new ModelRendererTurbo(this, 401, 233, this.textureX, this.textureY);
/* 2147 */     this.gunModel['Ɏ'] = new ModelRendererTurbo(this, 417, 233, this.textureX, this.textureY);
/* 2148 */     this.gunModel['ɏ'] = new ModelRendererTurbo(this, 433, 233, this.textureX, this.textureY);
/* 2149 */     this.gunModel['ɐ'] = new ModelRendererTurbo(this, 449, 233, this.textureX, this.textureY);
/* 2150 */     this.gunModel['ɑ'] = new ModelRendererTurbo(this, 465, 233, this.textureX, this.textureY);
/* 2151 */     this.gunModel['ɒ'] = new ModelRendererTurbo(this, 481, 233, this.textureX, this.textureY);
/* 2152 */     this.gunModel['ɓ'] = new ModelRendererTurbo(this, 497, 233, this.textureX, this.textureY);
/* 2153 */     this.gunModel['ɔ'] = new ModelRendererTurbo(this, 513, 233, this.textureX, this.textureY);
/* 2154 */     this.gunModel['ɕ'] = new ModelRendererTurbo(this, 529, 233, this.textureX, this.textureY);
/* 2155 */     this.gunModel['ɖ'] = new ModelRendererTurbo(this, 545, 233, this.textureX, this.textureY);
/* 2156 */     this.gunModel['ɗ'] = new ModelRendererTurbo(this, 561, 233, this.textureX, this.textureY);
/* 2157 */     this.gunModel['ɘ'] = new ModelRendererTurbo(this, 913, 233, this.textureX, this.textureY);
/* 2158 */     this.gunModel['ə'] = new ModelRendererTurbo(this, 185, 241, this.textureX, this.textureY);
/* 2159 */     this.gunModel['ɚ'] = new ModelRendererTurbo(this, 241, 241, this.textureX, this.textureY);
/* 2160 */     this.gunModel['ɛ'] = new ModelRendererTurbo(this, 569, 241, this.textureX, this.textureY);
/* 2161 */     this.gunModel['ɜ'] = new ModelRendererTurbo(this, 937, 241, this.textureX, this.textureY);
/* 2162 */     this.gunModel['ɝ'] = new ModelRendererTurbo(this, 985, 241, this.textureX, this.textureY);
/* 2163 */     this.gunModel['ɞ'] = new ModelRendererTurbo(this, 297, 249, this.textureX, this.textureY);
/* 2164 */     this.gunModel['ɟ'] = new ModelRendererTurbo(this, 1009, 249, this.textureX, this.textureY);
/* 2165 */     this.gunModel['ɠ'] = new ModelRendererTurbo(this, 569, 257, this.textureX, this.textureY);
/* 2166 */     this.gunModel['ɡ'] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/* 2167 */     this.gunModel['ɢ'] = new ModelRendererTurbo(this, 873, 249, this.textureX, this.textureY);
/* 2168 */     this.gunModel['ɣ'] = new ModelRendererTurbo(this, 249, 265, this.textureX, this.textureY);
/* 2169 */     this.gunModel['ɤ'] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/* 2170 */     this.gunModel['ɥ'] = new ModelRendererTurbo(this, 569, 177, this.textureX, this.textureY);
/* 2171 */     this.gunModel['ɦ'] = new ModelRendererTurbo(this, 1009, 257, this.textureX, this.textureY);
/* 2172 */     this.gunModel['ɧ'] = new ModelRendererTurbo(this, 273, 265, this.textureX, this.textureY);
/* 2173 */     this.gunModel['ɨ'] = new ModelRendererTurbo(this, 593, 177, this.textureX, this.textureY);
/* 2174 */     this.gunModel['ɩ'] = new ModelRendererTurbo(this, 649, 385, this.textureX, this.textureY);
/* 2175 */     this.gunModel['ɪ'] = new ModelRendererTurbo(this, 633, 305, this.textureX, this.textureY);
/* 2176 */     this.gunModel['ɫ'] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/* 2177 */     this.gunModel['ɬ'] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/* 2178 */     this.gunModel['ɭ'] = new ModelRendererTurbo(this, 953, 265, this.textureX, this.textureY);
/* 2179 */     this.gunModel['ɮ'] = new ModelRendererTurbo(this, 969, 265, this.textureX, this.textureY);
/* 2180 */     this.gunModel['ɯ'] = new ModelRendererTurbo(this, 105, 281, this.textureX, this.textureY);
/* 2181 */     this.gunModel['ɰ'] = new ModelRendererTurbo(this, 873, 177, this.textureX, this.textureY);
/* 2182 */     this.gunModel['ɱ'] = new ModelRendererTurbo(this, 993, 425, this.textureX, this.textureY);
/* 2183 */     this.gunModel['ɲ'] = new ModelRendererTurbo(this, 449, 385, this.textureX, this.textureY);
/* 2184 */     this.gunModel['ɳ'] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/* 2185 */     this.gunModel['ɴ'] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/* 2186 */     this.gunModel['ɵ'] = new ModelRendererTurbo(this, 121, 281, this.textureX, this.textureY);
/* 2187 */     this.gunModel['ɶ'] = new ModelRendererTurbo(this, 137, 281, this.textureX, this.textureY);
/* 2188 */     this.gunModel['ɷ'] = new ModelRendererTurbo(this, 153, 281, this.textureX, this.textureY);
/* 2189 */     this.gunModel['ɸ'] = new ModelRendererTurbo(this, 825, 857, this.textureX, this.textureY);
/* 2190 */     this.gunModel['ɹ'] = new ModelRendererTurbo(this, 1, 401, this.textureX, this.textureY);
/* 2191 */     this.gunModel['ɺ'] = new ModelRendererTurbo(this, 385, 873, this.textureX, this.textureY);
/* 2192 */     this.gunModel['ɻ'] = new ModelRendererTurbo(this, 569, 857, this.textureX, this.textureY);
/* 2193 */     this.gunModel['ɼ'] = new ModelRendererTurbo(this, 697, 857, this.textureX, this.textureY);
/* 2194 */     this.gunModel['ɽ'] = new ModelRendererTurbo(this, 761, 433, this.textureX, this.textureY);
/* 2195 */     this.gunModel['ɾ'] = new ModelRendererTurbo(this, 385, 513, this.textureX, this.textureY);
/* 2196 */     this.gunModel['ɿ'] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/* 2197 */     this.gunModel['ʀ'] = new ModelRendererTurbo(this, 177, 873, this.textureX, this.textureY);
/* 2198 */     this.gunModel['ʁ'] = new ModelRendererTurbo(this, 257, 889, this.textureX, this.textureY);
/* 2199 */     this.gunModel['ʂ'] = new ModelRendererTurbo(this, 577, 417, this.textureX, this.textureY);
/* 2200 */     this.gunModel['ʃ'] = new ModelRendererTurbo(this, 169, 281, this.textureX, this.textureY);
/* 2201 */     this.gunModel['ʄ'] = new ModelRendererTurbo(this, 201, 281, this.textureX, this.textureY);
/* 2202 */     this.gunModel['ʅ'] = new ModelRendererTurbo(this, 649, 289, this.textureX, this.textureY);
/* 2203 */     this.gunModel['ʆ'] = new ModelRendererTurbo(this, 1017, 17, this.textureX, this.textureY);
/* 2204 */     this.gunModel['ʇ'] = new ModelRendererTurbo(this, 817, 33, this.textureX, this.textureY);
/* 2205 */     this.gunModel['ʈ'] = new ModelRendererTurbo(this, 929, 289, this.textureX, this.textureY);
/* 2206 */     this.gunModel['ʉ'] = new ModelRendererTurbo(this, 745, 313, this.textureX, this.textureY);
/* 2207 */     this.gunModel['ʊ'] = new ModelRendererTurbo(this, 761, 97, this.textureX, this.textureY);
/* 2208 */     this.gunModel['ʋ'] = new ModelRendererTurbo(this, 273, 249, this.textureX, this.textureY);
/* 2209 */     this.gunModel['ʌ'] = new ModelRendererTurbo(this, 833, 273, this.textureX, this.textureY);
/* 2210 */     this.gunModel['ʍ'] = new ModelRendererTurbo(this, 649, 345, this.textureX, this.textureY);
/* 2211 */     this.gunModel['ʎ'] = new ModelRendererTurbo(this, 505, 385, this.textureX, this.textureY);
/* 2212 */     this.gunModel['ʏ'] = new ModelRendererTurbo(this, 721, 889, this.textureX, this.textureY);
/* 2213 */     this.gunModel['ʐ'] = new ModelRendererTurbo(this, 817, 177, this.textureX, this.textureY);
/* 2214 */     this.gunModel['ʑ'] = new ModelRendererTurbo(this, 849, 177, this.textureX, this.textureY);
/* 2215 */     this.gunModel['ʒ'] = new ModelRendererTurbo(this, 897, 177, this.textureX, this.textureY);
/* 2216 */     this.gunModel['ʓ'] = new ModelRendererTurbo(this, 945, 177, this.textureX, this.textureY);
/* 2217 */     this.gunModel['ʔ'] = new ModelRendererTurbo(this, 233, 185, this.textureX, this.textureY);
/* 2218 */     this.gunModel['ʕ'] = new ModelRendererTurbo(this, 353, 185, this.textureX, this.textureY);
/* 2219 */     this.gunModel['ʖ'] = new ModelRendererTurbo(this, 569, 185, this.textureX, this.textureY);
/* 2220 */     this.gunModel['ʗ'] = new ModelRendererTurbo(this, 593, 185, this.textureX, this.textureY);
/* 2221 */     this.gunModel['ʘ'] = new ModelRendererTurbo(this, 873, 185, this.textureX, this.textureY);
/* 2222 */     this.gunModel['ʙ'] = new ModelRendererTurbo(this, 897, 185, this.textureX, this.textureY);
/* 2223 */     this.gunModel['ʚ'] = new ModelRendererTurbo(this, 945, 185, this.textureX, this.textureY);
/* 2224 */     this.gunModel['ʛ'] = new ModelRendererTurbo(this, 985, 185, this.textureX, this.textureY);
/* 2225 */     this.gunModel['ʜ'] = new ModelRendererTurbo(this, 353, 193, this.textureX, this.textureY);
/* 2226 */     this.gunModel['ʝ'] = new ModelRendererTurbo(this, 73, 201, this.textureX, this.textureY);
/* 2227 */     this.gunModel['ʞ'] = new ModelRendererTurbo(this, 777, 201, this.textureX, this.textureY);
/* 2228 */     this.gunModel['ʟ'] = new ModelRendererTurbo(this, 777, 209, this.textureX, this.textureY);
/* 2229 */     this.gunModel['ʠ'] = new ModelRendererTurbo(this, 985, 209, this.textureX, this.textureY);
/* 2230 */     this.gunModel['ʡ'] = new ModelRendererTurbo(this, 905, 217, this.textureX, this.textureY);
/* 2231 */     this.gunModel['ʢ'] = new ModelRendererTurbo(this, 609, 225, this.textureX, this.textureY);
/* 2232 */     this.gunModel['ʣ'] = new ModelRendererTurbo(this, 129, 233, this.textureX, this.textureY);
/* 2233 */     this.gunModel['ʤ'] = new ModelRendererTurbo(this, 265, 233, this.textureX, this.textureY);
/* 2234 */     this.gunModel['ʥ'] = new ModelRendererTurbo(this, 297, 233, this.textureX, this.textureY);
/* 2235 */     this.gunModel['ʦ'] = new ModelRendererTurbo(this, 377, 233, this.textureX, this.textureY);
/* 2236 */     this.gunModel['ʧ'] = new ModelRendererTurbo(this, 617, 233, this.textureX, this.textureY);
/* 2237 */     this.gunModel['ʨ'] = new ModelRendererTurbo(this, 769, 289, this.textureX, this.textureY);
/* 2238 */     this.gunModel['ʩ'] = new ModelRendererTurbo(this, 961, 289, this.textureX, this.textureY);
/* 2239 */     this.gunModel['ʪ'] = new ModelRendererTurbo(this, 865, 337, this.textureX, this.textureY);
/* 2240 */     this.gunModel['ʫ'] = new ModelRendererTurbo(this, 969, 337, this.textureX, this.textureY);
/* 2241 */     this.gunModel['ʬ'] = new ModelRendererTurbo(this, 953, 377, this.textureX, this.textureY);
/* 2242 */     this.gunModel['ʭ'] = new ModelRendererTurbo(this, 561, 385, this.textureX, this.textureY);
/* 2243 */     this.gunModel['ʮ'] = new ModelRendererTurbo(this, 225, 281, this.textureX, this.textureY);
/* 2244 */     this.gunModel['ʯ'] = new ModelRendererTurbo(this, 657, 321, this.textureX, this.textureY);
/* 2245 */     this.gunModel['ʰ'] = new ModelRendererTurbo(this, 873, 233, this.textureX, this.textureY);
/* 2246 */     this.gunModel['ʱ'] = new ModelRendererTurbo(this, 913, 409, this.textureX, this.textureY);
/* 2247 */     this.gunModel['ʲ'] = new ModelRendererTurbo(this, 849, 321, this.textureX, this.textureY);
/* 2248 */     this.gunModel['ʳ'] = new ModelRendererTurbo(this, 561, 393, this.textureX, this.textureY);
/* 2249 */     this.gunModel['ʴ'] = new ModelRendererTurbo(this, 433, 417, this.textureX, this.textureY);
/* 2250 */     this.gunModel['ʵ'] = new ModelRendererTurbo(this, 449, 449, this.textureX, this.textureY);
/* 2251 */     this.gunModel['ʶ'] = new ModelRendererTurbo(this, 1001, 441, this.textureX, this.textureY);
/* 2252 */     this.gunModel['ʷ'] = new ModelRendererTurbo(this, 865, 433, this.textureX, this.textureY);
/* 2253 */     this.gunModel['ʸ'] = new ModelRendererTurbo(this, 497, 513, this.textureX, this.textureY);
/* 2254 */     this.gunModel['ʹ'] = new ModelRendererTurbo(this, 409, 441, this.textureX, this.textureY);
/* 2255 */     this.gunModel['ʺ'] = new ModelRendererTurbo(this, 465, 457, this.textureX, this.textureY);
/* 2256 */     this.gunModel['ʻ'] = new ModelRendererTurbo(this, 969, 457, this.textureX, this.textureY);
/* 2257 */     this.gunModel['ʼ'] = new ModelRendererTurbo(this, 177, 481, this.textureX, this.textureY);
/* 2258 */     this.gunModel['ʽ'] = new ModelRendererTurbo(this, 305, 497, this.textureX, this.textureY);
/* 2259 */     this.gunModel['ʾ'] = new ModelRendererTurbo(this, 57, 873, this.textureX, this.textureY);
/* 2260 */     this.gunModel['ʿ'] = new ModelRendererTurbo(this, 729, 465, this.textureX, this.textureY);
/* 2261 */     this.gunModel['ˀ'] = new ModelRendererTurbo(this, 1, 537, this.textureX, this.textureY);
/* 2262 */     this.gunModel['ˁ'] = new ModelRendererTurbo(this, 737, 505, this.textureX, this.textureY);
/* 2263 */     this.gunModel['˂'] = new ModelRendererTurbo(this, 417, 481, this.textureX, this.textureY);
/* 2264 */     this.gunModel['˃'] = new ModelRendererTurbo(this, 753, 561, this.textureX, this.textureY);
/* 2265 */     this.gunModel['˄'] = new ModelRendererTurbo(this, 209, 513, this.textureX, this.textureY);
/* 2266 */     this.gunModel['˅'] = new ModelRendererTurbo(this, 145, 569, this.textureX, this.textureY);
/*      */     
/* 2268 */     this.gunModel['Ǵ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 7, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 2269 */     this.gunModel['Ǵ'].setRotationPoint(-276.0F, 46.0F, 2.0F);
/*      */     
/* 2271 */     this.gunModel['ǵ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 37, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 2272 */     this.gunModel['ǵ'].setRotationPoint(-282.0F, 12.0F, 2.0F);
/*      */     
/* 2274 */     this.gunModel['Ƕ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 32, 20, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2275 */     this.gunModel['Ƕ'].setRotationPoint(-278.0F, 15.0F, 2.0F);
/*      */     
/* 2277 */     this.gunModel['Ƿ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 10, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2278 */     this.gunModel['Ƿ'].setRotationPoint(-278.0F, 47.0F, 2.0F);
/*      */     
/* 2280 */     this.gunModel['Ǹ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2281 */     this.gunModel['Ǹ'].setRotationPoint(-194.0F, -23.0F, 0.0F);
/*      */     
/* 2283 */     this.gunModel['ǹ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 10, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2284 */     this.gunModel['ǹ'].setRotationPoint(-194.0F, -12.0F, 2.0F);
/*      */     
/* 2286 */     this.gunModel['Ǻ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 0, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 2287 */     this.gunModel['Ǻ'].setRotationPoint(-196.0F, -23.0F, 0.0F);
/*      */     
/* 2289 */     this.gunModel['ǻ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 21, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2290 */     this.gunModel['ǻ'].setRotationPoint(-192.0F, -23.0F, 0.0F);
/*      */     
/* 2292 */     this.gunModel['Ǽ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 9, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2293 */     this.gunModel['Ǽ'].setRotationPoint(-186.0F, -12.0F, 0.0F);
/*      */     
/* 2295 */     this.gunModel['ǽ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 9, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 2296 */     this.gunModel['ǽ'].setRotationPoint(-181.0F, -12.0F, 2.0F);
/*      */     
/* 2298 */     this.gunModel['Ǿ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 11, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2299 */     this.gunModel['Ǿ'].setRotationPoint(-172.0F, -12.0F, 2.0F);
/*      */     
/* 2301 */     this.gunModel['ǿ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 10, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2302 */     this.gunModel['ǿ'].setRotationPoint(-170.0F, -22.0F, 8.0F);
/*      */     
/* 2304 */     this.gunModel['Ȁ'].addShapeBox(71.0F, -39.0F, -12.0F, 18, 6, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2305 */     this.gunModel['Ȁ'].setRotationPoint(-185.0F, -29.0F, 0.0F);
/*      */     
/* 2307 */     this.gunModel['ȁ'].addShapeBox(71.0F, -39.0F, -12.0F, 19, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2308 */     this.gunModel['ȁ'].setRotationPoint(-186.0F, -23.0F, 2.0F);
/*      */     
/* 2310 */     this.gunModel['Ȃ'].addShapeBox(71.0F, -39.0F, -12.0F, 16, 7, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2311 */     this.gunModel['Ȃ'].setRotationPoint(-167.0F, -7.0F, 0.0F);
/*      */     
/* 2313 */     this.gunModel['ȃ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 2314 */     this.gunModel['ȃ'].setRotationPoint(-167.0F, -29.0F, 10.0F);
/*      */     
/* 2316 */     this.gunModel['Ȅ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2317 */     this.gunModel['Ȅ'].setRotationPoint(-163.0F, -29.0F, 0.0F);
/*      */     
/* 2319 */     this.gunModel['ȅ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 14, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2320 */     this.gunModel['ȅ'].setRotationPoint(-167.0F, -10.0F, 10.0F);
/*      */     
/* 2322 */     this.gunModel['Ȇ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2323 */     this.gunModel['Ȇ'].setRotationPoint(-163.0F, -10.0F, 0.0F);
/*      */     
/* 2325 */     this.gunModel['ȇ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2326 */     this.gunModel['ȇ'].setRotationPoint(-155.0F, -29.0F, 0.0F);
/*      */     
/* 2328 */     this.gunModel['Ȉ'].addShapeBox(71.0F, -39.0F, -12.0F, 10, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2329 */     this.gunModel['Ȉ'].setRotationPoint(-161.0F, -32.0F, 0.0F);
/*      */     
/* 2331 */     this.gunModel['ȉ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 3, 24, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2332 */     this.gunModel['ȉ'].setRotationPoint(-172.0F, -32.0F, 0.0F);
/*      */     
/* 2334 */     this.gunModel['Ȋ'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 6, 16, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2335 */     this.gunModel['Ȋ'].setRotationPoint(-185.0F, -35.0F, 4.0F);
/*      */     
/* 2337 */     this.gunModel['ȋ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 24, 0.0F, 0.0F, -0.5F, -1.35F, -2.0F, -0.5F, -1.35F, -2.0F, -0.5F, -1.35F, 0.0F, -0.5F, -1.35F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2338 */     this.gunModel['ȋ'].setRotationPoint(-185.0F, -31.0F, 0.0F);
/*      */     
/* 2340 */     this.gunModel['Ȍ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 24, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2341 */     this.gunModel['Ȍ'].setRotationPoint(-174.0F, -31.0F, 0.0F);
/*      */     
/* 2343 */     this.gunModel['ȍ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 16, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2344 */     this.gunModel['ȍ'].setRotationPoint(-175.5F, -14.0F, 8.0F);
/*      */     
/* 2346 */     this.gunModel['Ȏ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 16, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2347 */     this.gunModel['Ȏ'].setRotationPoint(-176.5F, -16.0F, 8.0F);
/*      */     
/* 2349 */     this.gunModel['ȏ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2350 */     this.gunModel['ȏ'].setRotationPoint(-177.0F, -18.0F, 8.0F);
/*      */     
/* 2352 */     this.gunModel['Ȑ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2353 */     this.gunModel['Ȑ'].setRotationPoint(-176.5F, -20.0F, 8.0F);
/*      */     
/* 2355 */     this.gunModel['ȑ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2356 */     this.gunModel['ȑ'].setRotationPoint(-175.5F, -22.0F, 8.0F);
/*      */     
/* 2358 */     this.gunModel['Ȓ'].addShapeBox(71.0F, -39.0F, -12.0F, 16, 10, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2359 */     this.gunModel['Ȓ'].setRotationPoint(-186.0F, -22.0F, 9.0F);
/*      */     
/* 2361 */     this.gunModel['ȓ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2362 */     this.gunModel['ȓ'].setRotationPoint(-186.0F, -22.0F, 8.0F);
/*      */     
/* 2364 */     this.gunModel['Ȕ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2365 */     this.gunModel['Ȕ'].setRotationPoint(-186.0F, -13.0F, 8.0F);
/*      */     
/* 2367 */     this.gunModel['ȕ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 27, 24, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 2368 */     this.gunModel['ȕ'].setRotationPoint(-287.0F, -11.0F, 0.0F);
/*      */     
/* 2370 */     this.gunModel['Ȗ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 34, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F);
/* 2371 */     this.gunModel['Ȗ'].setRotationPoint(-284.5F, 16.0F, 0.0F);
/*      */     
/* 2373 */     this.gunModel['ȗ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 7, 24, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2374 */     this.gunModel['ȗ'].setRotationPoint(-281.0F, 50.0F, 0.0F);
/*      */     
/* 2376 */     this.gunModel['Ș'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2377 */     this.gunModel['Ș'].setRotationPoint(-288.0F, -16.0F, 0.0F);
/*      */     
/* 2379 */     this.gunModel['ș'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 3, 24, 0.0F, 2.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2380 */     this.gunModel['ș'].setRotationPoint(-286.0F, 54.0F, 0.0F);
/*      */     
/* 2382 */     this.gunModel['Ț'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 24, 0.0F, 0.1F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2383 */     this.gunModel['Ț'].setRotationPoint(-288.0F, 18.0F, 0.0F);
/*      */     
/* 2385 */     this.gunModel['ț'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 24, 0.0F, 0.1F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 2386 */     this.gunModel['ț'].setRotationPoint(-287.9F, 19.0F, 0.0F);
/*      */     
/* 2388 */     this.gunModel['Ȝ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, -1.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 2389 */     this.gunModel['Ȝ'].setRotationPoint(-285.55F, 17.0F, 0.0F);
/*      */     
/* 2391 */     this.gunModel['ȝ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, -0.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
/* 2392 */     this.gunModel['ȝ'].setRotationPoint(-284.8F, 21.0F, 0.0F);
/*      */     
/* 2394 */     this.gunModel['Ȟ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, 0.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2395 */     this.gunModel['Ȟ'].setRotationPoint(-288.1F, 17.0F, 0.0F);
/*      */     
/* 2397 */     this.gunModel['ȟ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 2398 */     this.gunModel['ȟ'].setRotationPoint(-287.8F, 21.0F, 0.0F);
/*      */     
/* 2400 */     this.gunModel['Ƞ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, -1.25F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 2401 */     this.gunModel['Ƞ'].setRotationPoint(-282.05F, 53.0F, 0.0F);
/*      */     
/* 2403 */     this.gunModel['ȡ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, 0.05F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 2404 */     this.gunModel['ȡ'].setRotationPoint(-284.1F, 53.0F, 0.0F);
/*      */     
/* 2406 */     this.gunModel['Ȣ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2407 */     this.gunModel['Ȣ'].setRotationPoint(-288.8F, -16.0F, 0.0F);
/*      */     
/* 2409 */     this.gunModel['ȣ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 2410 */     this.gunModel['ȣ'].setRotationPoint(-292.0F, -16.0F, 0.0F);
/*      */     
/* 2412 */     this.gunModel['Ȥ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 70, 20, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 2413 */     this.gunModel['Ȥ'].setRotationPoint(-293.0F, -16.0F, 2.0F);
/*      */     
/* 2415 */     this.gunModel['ȥ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 21, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2416 */     this.gunModel['ȥ'].setRotationPoint(-155.0F, -28.0F, 0.0F);
/*      */     
/* 2418 */     this.gunModel['Ȧ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 21, 25, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2419 */     this.gunModel['Ȧ'].setRotationPoint(-163.0F, -28.0F, 0.0F);
/*      */     
/* 2421 */     this.gunModel['ȧ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 15, 15, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 2422 */     this.gunModel['ȧ'].setRotationPoint(-167.0F, -25.0F, 10.0F);
/*      */     
/* 2424 */     this.gunModel['Ȩ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 12, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2425 */     this.gunModel['Ȩ'].setRotationPoint(-169.0F, -24.0F, 24.0F);
/*      */     
/* 2427 */     this.gunModel['ȩ'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2428 */     this.gunModel['ȩ'].setRotationPoint(-282.0F, -18.0F, 5.0F);
/*      */     
/* 2430 */     this.gunModel['Ȫ'].addShapeBox(71.0F, -39.0F, -12.0F, 15, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2431 */     this.gunModel['Ȫ'].setRotationPoint(-283.0F, -14.0F, 5.0F);
/*      */     
/* 2433 */     this.gunModel['ȫ'].addShapeBox(71.0F, -39.0F, -12.0F, 12, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2434 */     this.gunModel['ȫ'].setRotationPoint(-283.0F, -10.0F, 5.0F);
/*      */     
/* 2436 */     this.gunModel['Ȭ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2437 */     this.gunModel['Ȭ'].setRotationPoint(-283.0F, -5.0F, 5.0F);
/*      */     
/* 2439 */     this.gunModel['ȭ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2440 */     this.gunModel['ȭ'].setRotationPoint(-283.0F, -3.0F, 5.0F);
/*      */     
/* 2442 */     this.gunModel['Ȯ'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2443 */     this.gunModel['Ȯ'].setRotationPoint(-283.0F, 0.0F, 5.0F);
/*      */     
/* 2445 */     this.gunModel['ȯ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2446 */     this.gunModel['ȯ'].setRotationPoint(-283.0F, 3.0F, 5.0F);
/*      */     
/* 2448 */     this.gunModel['Ȱ'].addShapeBox(71.0F, -39.0F, -12.0F, 22, 12, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2449 */     this.gunModel['Ȱ'].setRotationPoint(-283.0F, 4.0F, 5.0F);
/*      */     
/* 2451 */     this.gunModel['ȱ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 16, 4, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2452 */     this.gunModel['ȱ'].setRotationPoint(-134.0F, -52.0F, -1.5F);
/*      */     
/* 2454 */     this.gunModel['Ȳ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 19, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F);
/* 2455 */     this.gunModel['Ȳ'].setRotationPoint(-134.0F, -54.0F, 19.5F);
/*      */     
/* 2457 */     this.gunModel['ȳ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 20, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2458 */     this.gunModel['ȳ'].setRotationPoint(-134.0F, -56.0F, 0.5F);
/*      */     
/* 2460 */     this.gunModel['ȴ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/* 2461 */     this.gunModel['ȴ'].setRotationPoint(-134.0F, -53.0F, -2.5F);
/*      */     
/* 2463 */     this.gunModel['ȵ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2464 */     this.gunModel['ȵ'].setRotationPoint(-134.0F, -37.0F, 28.0F);
/*      */     
/* 2466 */     this.gunModel['ȶ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2467 */     this.gunModel['ȶ'].setRotationPoint(-134.0F, -36.0F, 28.0F);
/*      */     
/* 2469 */     this.gunModel['ȷ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2470 */     this.gunModel['ȷ'].setRotationPoint(-134.0F, -36.0F, -1.5F);
/*      */     
/* 2472 */     this.gunModel['ȸ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2473 */     this.gunModel['ȸ'].setRotationPoint(-134.0F, -54.0F, -2.5F);
/*      */     
/* 2475 */     this.gunModel['ȹ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2476 */     this.gunModel['ȹ'].setRotationPoint(-134.0F, -35.5F, 2.0F);
/*      */     
/* 2478 */     this.gunModel['Ⱥ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 20, 18, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F);
/* 2479 */     this.gunModel['Ⱥ'].setRotationPoint(-134.0F, -54.0F, 2.0F);
/*      */     
/* 2481 */     this.gunModel['Ȼ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F);
/* 2482 */     this.gunModel['Ȼ'].setRotationPoint(-134.0F, -56.0F, 19.5F);
/*      */     
/* 2484 */     this.gunModel['ȼ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 16, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2485 */     this.gunModel['ȼ'].setRotationPoint(-134.0F, -52.0F, 21.5F);
/*      */     
/* 2487 */     this.gunModel['Ƚ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2488 */     this.gunModel['Ƚ'].setRotationPoint(-134.0F, -54.0F, 24.5F);
/*      */     
/* 2490 */     this.gunModel['Ⱦ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F);
/* 2491 */     this.gunModel['Ⱦ'].setRotationPoint(-134.0F, -53.0F, 24.5F);
/*      */     
/* 2493 */     this.gunModel['ȿ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2494 */     this.gunModel['ȿ'].setRotationPoint(-134.0F, -37.0F, -6.0F);
/*      */     
/* 2496 */     this.gunModel['ɀ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/* 2497 */     this.gunModel['ɀ'].setRotationPoint(-134.0F, -36.0F, -6.0F);
/*      */     
/* 2499 */     this.gunModel['Ɂ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2500 */     this.gunModel['Ɂ'].setRotationPoint(-134.0F, -36.0F, 21.5F);
/*      */     
/* 2502 */     this.gunModel['ɂ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2503 */     this.gunModel['ɂ'].setRotationPoint(-134.0F, -35.0F, -4.5F);
/*      */     
/* 2505 */     this.gunModel['Ƀ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F);
/* 2506 */     this.gunModel['Ƀ'].setRotationPoint(-134.0F, -35.0F, 21.5F);
/*      */     
/* 2508 */     this.gunModel['Ʉ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2509 */     this.gunModel['Ʉ'].setRotationPoint(-134.75F, -51.25F, 9.0F);
/*      */     
/* 2511 */     this.gunModel['Ʌ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2512 */     this.gunModel['Ʌ'].setRotationPoint(-134.75F, -55.25F, 9.0F);
/*      */     
/* 2514 */     this.gunModel['Ɇ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2515 */     this.gunModel['Ɇ'].setRotationPoint(-134.75F, -53.25F, 9.0F);
/*      */     
/* 2517 */     this.gunModel['ɇ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2518 */     this.gunModel['ɇ'].setRotationPoint(-39.5F, -2.5F, 19.75F);
/*      */     
/* 2520 */     this.gunModel['Ɉ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2521 */     this.gunModel['Ɉ'].setRotationPoint(-39.5F, -3.5F, 19.75F);
/*      */     
/* 2523 */     this.gunModel['ɉ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2524 */     this.gunModel['ɉ'].setRotationPoint(-39.5F, -4.5F, 19.75F);
/*      */     
/* 2526 */     this.gunModel['Ɋ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2527 */     this.gunModel['Ɋ'].setRotationPoint(-44.0F, -2.5F, 19.75F);
/*      */     
/* 2529 */     this.gunModel['ɋ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2530 */     this.gunModel['ɋ'].setRotationPoint(-44.0F, -3.5F, 19.75F);
/*      */     
/* 2532 */     this.gunModel['Ɍ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2533 */     this.gunModel['Ɍ'].setRotationPoint(-44.0F, -4.5F, 19.75F);
/*      */     
/* 2535 */     this.gunModel['ɍ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2536 */     this.gunModel['ɍ'].setRotationPoint(-48.5F, -2.5F, 19.75F);
/*      */     
/* 2538 */     this.gunModel['Ɏ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2539 */     this.gunModel['Ɏ'].setRotationPoint(-48.5F, -3.5F, 19.75F);
/*      */     
/* 2541 */     this.gunModel['ɏ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2542 */     this.gunModel['ɏ'].setRotationPoint(-48.5F, -4.5F, 19.75F);
/*      */     
/* 2544 */     this.gunModel['ɐ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2545 */     this.gunModel['ɐ'].setRotationPoint(-53.0F, -2.5F, 19.75F);
/*      */     
/* 2547 */     this.gunModel['ɑ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2548 */     this.gunModel['ɑ'].setRotationPoint(-53.0F, -3.5F, 19.75F);
/*      */     
/* 2550 */     this.gunModel['ɒ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2551 */     this.gunModel['ɒ'].setRotationPoint(-53.0F, -4.5F, 19.75F);
/*      */     
/* 2553 */     this.gunModel['ɓ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2554 */     this.gunModel['ɓ'].setRotationPoint(-54.0F, 3.0F, 19.75F);
/*      */     
/* 2556 */     this.gunModel['ɔ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2557 */     this.gunModel['ɔ'].setRotationPoint(-54.0F, 2.0F, 19.75F);
/*      */     
/* 2559 */     this.gunModel['ɕ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2560 */     this.gunModel['ɕ'].setRotationPoint(-54.0F, 1.0F, 19.75F);
/*      */     
/* 2562 */     this.gunModel['ɖ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2563 */     this.gunModel['ɖ'].setRotationPoint(-60.0F, 3.0F, 19.75F);
/*      */     
/* 2565 */     this.gunModel['ɗ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2566 */     this.gunModel['ɗ'].setRotationPoint(-60.0F, 2.0F, 19.75F);
/*      */     
/* 2568 */     this.gunModel['ɘ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2569 */     this.gunModel['ɘ'].setRotationPoint(-60.0F, 1.0F, 19.75F);
/*      */     
/* 2571 */     this.gunModel['ə'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2572 */     this.gunModel['ə'].setRotationPoint(-57.0F, 0.0F, 19.75F);
/*      */     
/* 2574 */     this.gunModel['ɚ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2575 */     this.gunModel['ɚ'].setRotationPoint(-57.0F, -1.0F, 19.75F);
/*      */     
/* 2577 */     this.gunModel['ɛ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2578 */     this.gunModel['ɛ'].setRotationPoint(-57.0F, -2.0F, 19.75F);
/*      */     
/* 2580 */     this.gunModel['ɜ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2581 */     this.gunModel['ɜ'].setRotationPoint(-64.5F, 2.5F, 19.75F);
/*      */     
/* 2583 */     this.gunModel['ɝ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2584 */     this.gunModel['ɝ'].setRotationPoint(-64.5F, 1.5F, 19.75F);
/*      */     
/* 2586 */     this.gunModel['ɞ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2587 */     this.gunModel['ɞ'].setRotationPoint(-64.5F, 0.5F, 19.75F);
/*      */     
/* 2589 */     this.gunModel['ɟ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2590 */     this.gunModel['ɟ'].setRotationPoint(-65.0F, -3.0F, 23.0F);
/*      */     
/* 2592 */     this.gunModel['ɠ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 3, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2593 */     this.gunModel['ɠ'].setRotationPoint(-67.0F, -6.0F, 23.0F);
/*      */     
/* 2595 */     this.gunModel['ɡ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2596 */     this.gunModel['ɡ'].setRotationPoint(-67.0F, -8.0F, 23.0F);
/*      */     
/* 2598 */     this.gunModel['ɢ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2599 */     this.gunModel['ɢ'].setRotationPoint(-68.0F, -9.0F, 23.0F);
/*      */     
/* 2601 */     this.gunModel['ɣ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2602 */     this.gunModel['ɣ'].setRotationPoint(-68.0F, -11.0F, 23.0F);
/*      */     
/* 2604 */     this.gunModel['ɤ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2605 */     this.gunModel['ɤ'].setRotationPoint(-68.0F, -12.0F, 23.0F);
/*      */     
/* 2607 */     this.gunModel['ɥ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2608 */     this.gunModel['ɥ'].setRotationPoint(-70.5F, -12.0F, -1.0F);
/*      */     
/* 2610 */     this.gunModel['ɦ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2611 */     this.gunModel['ɦ'].setRotationPoint(-74.5F, -11.0F, 23.0F);
/*      */     
/* 2613 */     this.gunModel['ɧ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2614 */     this.gunModel['ɧ'].setRotationPoint(-74.5F, -12.0F, 23.0F);
/*      */     
/* 2616 */     this.gunModel['ɨ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2617 */     this.gunModel['ɨ'].setRotationPoint(-92.5F, -9.0F, 23.5F);
/*      */     
/* 2619 */     this.gunModel['ɩ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2620 */     this.gunModel['ɩ'].setRotationPoint(-103.5F, -9.0F, 23.5F);
/*      */     
/* 2622 */     this.gunModel['ɪ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 8, 1, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -8.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 2623 */     this.gunModel['ɪ'].setRotationPoint(-111.5F, -9.0F, 23.5F);
/*      */     
/* 2625 */     this.gunModel['ɫ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2626 */     this.gunModel['ɫ'].setRotationPoint(-92.5F, -3.0F, 23.5F);
/*      */     
/* 2628 */     this.gunModel['ɬ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2629 */     this.gunModel['ɬ'].setRotationPoint(-90.5F, -3.0F, 23.5F);
/*      */     
/* 2631 */     this.gunModel['ɭ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2632 */     this.gunModel['ɭ'].setRotationPoint(-98.5F, -4.5F, 20.25F);
/*      */     
/* 2634 */     this.gunModel['ɮ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2635 */     this.gunModel['ɮ'].setRotationPoint(-98.5F, -5.5F, 20.25F);
/*      */     
/* 2637 */     this.gunModel['ɯ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2638 */     this.gunModel['ɯ'].setRotationPoint(-98.5F, -6.5F, 20.25F);
/*      */     
/* 2640 */     this.gunModel['ɰ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2641 */     this.gunModel['ɰ'].setRotationPoint(-92.5F, -9.0F, 0.0F);
/*      */     
/* 2643 */     this.gunModel['ɱ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2644 */     this.gunModel['ɱ'].setRotationPoint(-103.5F, -9.0F, 0.0F);
/*      */     
/* 2646 */     this.gunModel['ɲ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 8, 1, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -8.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 2647 */     this.gunModel['ɲ'].setRotationPoint(-111.5F, -9.0F, 0.0F);
/*      */     
/* 2649 */     this.gunModel['ɳ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2650 */     this.gunModel['ɳ'].setRotationPoint(-92.5F, -3.0F, 0.0F);
/*      */     
/* 2652 */     this.gunModel['ɴ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2653 */     this.gunModel['ɴ'].setRotationPoint(-90.5F, -3.0F, 0.0F);
/*      */     
/* 2655 */     this.gunModel['ɵ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2656 */     this.gunModel['ɵ'].setRotationPoint(-98.5F, -4.5F, -0.25F);
/*      */     
/* 2658 */     this.gunModel['ɶ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2659 */     this.gunModel['ɶ'].setRotationPoint(-98.5F, -5.5F, -0.25F);
/*      */     
/* 2661 */     this.gunModel['ɷ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2662 */     this.gunModel['ɷ'].setRotationPoint(-98.5F, -6.5F, -0.25F);
/*      */     
/* 2664 */     this.gunModel['ɸ'].addShapeBox(71.0F, -39.0F, -12.0F, 67, 2, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2665 */     this.gunModel['ɸ'].setRotationPoint(-113.0F, -29.5F, 0.0F);
/*      */     
/* 2667 */     this.gunModel['ɹ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 14, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2668 */     this.gunModel['ɹ'].setRotationPoint(-50.0F, -27.0F, 0.0F);
/*      */     
/* 2670 */     this.gunModel['ɺ'].addShapeBox(71.0F, -39.0F, -12.0F, 84, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2671 */     this.gunModel['ɺ'].setRotationPoint(-46.0F, -20.0F, 0.0F);
/*      */     
/* 2673 */     this.gunModel['ɻ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 4, 24, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2674 */     this.gunModel['ɻ'].setRotationPoint(38.0F, -17.0F, 0.0F);
/*      */     
/* 2676 */     this.gunModel['ɼ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 3, 24, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2677 */     this.gunModel['ɼ'].setRotationPoint(42.0F, -19.5F, 0.0F);
/*      */     
/* 2679 */     this.gunModel['ɽ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 11, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2680 */     this.gunModel['ɽ'].setRotationPoint(38.0F, -29.5F, 0.0F);
/*      */     
/* 2682 */     this.gunModel['ɾ'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 9, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2683 */     this.gunModel['ɾ'].setRotationPoint(-46.0F, -29.0F, 0.0F);
/*      */     
/* 2685 */     this.gunModel['ɿ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 9, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2686 */     this.gunModel['ɿ'].setRotationPoint(36.0F, -29.0F, 0.0F);
/*      */     
/* 2688 */     this.gunModel['ʀ'].addShapeBox(71.0F, -39.0F, -12.0F, 22, 3, 24, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2689 */     this.gunModel['ʀ'].setRotationPoint(36.0F, -32.5F, 0.0F);
/*      */     
/* 2691 */     this.gunModel['ʁ'].addShapeBox(71.0F, -39.0F, -12.0F, 69, 3, 18, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2692 */     this.gunModel['ʁ'].setRotationPoint(-33.0F, -32.5F, 6.0F);
/*      */     
/* 2694 */     this.gunModel['ʂ'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 6, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2695 */     this.gunModel['ʂ'].setRotationPoint(-46.0F, -27.5F, -1.5F);
/*      */     
/* 2697 */     this.gunModel['ʃ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2698 */     this.gunModel['ʃ'].setRotationPoint(-45.0F, -21.5F, -2.5F);
/*      */     
/* 2700 */     this.gunModel['ʄ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 1, 1, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2701 */     this.gunModel['ʄ'].setRotationPoint(-45.0F, -29.0F, -2.5F);
/*      */     
/* 2703 */     this.gunModel['ʅ'].addShapeBox(71.0F, -39.0F, -12.0F, 11, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2704 */     this.gunModel['ʅ'].setRotationPoint(-45.0F, -28.0F, -2.5F);
/*      */     
/* 2706 */     this.gunModel['ʆ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2707 */     this.gunModel['ʆ'].setRotationPoint(-46.0F, -28.0F, -2.5F);
/*      */     
/* 2709 */     this.gunModel['ʇ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 2710 */     this.gunModel['ʇ'].setRotationPoint(-34.0F, -28.0F, -2.5F);
/*      */     
/* 2712 */     this.gunModel['ʈ'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F);
/* 2713 */     this.gunModel['ʈ'].setRotationPoint(-46.0F, -21.5F, -1.5F);
/*      */     
/* 2715 */     this.gunModel['ʉ'].addShapeBox(71.0F, -39.0F, -12.0F, 13, 1, 2, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2716 */     this.gunModel['ʉ'].setRotationPoint(-46.0F, -29.0F, -1.5F);
/*      */     
/* 2718 */     this.gunModel['ʊ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2719 */     this.gunModel['ʊ'].setRotationPoint(-33.0F, -21.0F, 0.0F);
/*      */     
/* 2721 */     this.gunModel['ʋ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 6, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2722 */     this.gunModel['ʋ'].setRotationPoint(35.0F, -21.0F, 0.0F);
/*      */     
/* 2724 */     this.gunModel['ʌ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2725 */     this.gunModel['ʌ'].setRotationPoint(-51.0F, -14.5F, 0.0F);
/*      */     
/* 2727 */     this.gunModel['ʍ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2728 */     this.gunModel['ʍ'].setRotationPoint(-106.0F, -26.5F, 0.0F);
/*      */     
/* 2730 */     this.gunModel['ʎ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2731 */     this.gunModel['ʎ'].setRotationPoint(-51.0F, -26.5F, 0.0F);
/*      */     
/* 2733 */     this.gunModel['ʏ'].addShapeBox(71.0F, -39.0F, -12.0F, 56, 14, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2734 */     this.gunModel['ʏ'].setRotationPoint(-106.0F, -27.0F, 1.0F);
/*      */     
/* 2736 */     this.gunModel['ʐ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2737 */     this.gunModel['ʐ'].setRotationPoint(-39.5F, -2.5F, 0.25F);
/*      */     
/* 2739 */     this.gunModel['ʑ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2740 */     this.gunModel['ʑ'].setRotationPoint(-39.5F, -3.5F, 0.25F);
/*      */     
/* 2742 */     this.gunModel['ʒ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2743 */     this.gunModel['ʒ'].setRotationPoint(-39.5F, -4.5F, 0.25F);
/*      */     
/* 2745 */     this.gunModel['ʓ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2746 */     this.gunModel['ʓ'].setRotationPoint(-44.0F, -2.5F, 0.25F);
/*      */     
/* 2748 */     this.gunModel['ʔ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2749 */     this.gunModel['ʔ'].setRotationPoint(-44.0F, -3.5F, 0.25F);
/*      */     
/* 2751 */     this.gunModel['ʕ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2752 */     this.gunModel['ʕ'].setRotationPoint(-44.0F, -4.5F, 0.25F);
/*      */     
/* 2754 */     this.gunModel['ʖ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2755 */     this.gunModel['ʖ'].setRotationPoint(-48.5F, -2.5F, 0.25F);
/*      */     
/* 2757 */     this.gunModel['ʗ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2758 */     this.gunModel['ʗ'].setRotationPoint(-48.5F, -3.5F, 0.25F);
/*      */     
/* 2760 */     this.gunModel['ʘ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2761 */     this.gunModel['ʘ'].setRotationPoint(-48.5F, -4.5F, 0.25F);
/*      */     
/* 2763 */     this.gunModel['ʙ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2764 */     this.gunModel['ʙ'].setRotationPoint(-53.0F, -2.5F, 0.25F);
/*      */     
/* 2766 */     this.gunModel['ʚ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2767 */     this.gunModel['ʚ'].setRotationPoint(-53.0F, -3.5F, 0.25F);
/*      */     
/* 2769 */     this.gunModel['ʛ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2770 */     this.gunModel['ʛ'].setRotationPoint(-53.0F, -4.5F, 0.25F);
/*      */     
/* 2772 */     this.gunModel['ʜ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2773 */     this.gunModel['ʜ'].setRotationPoint(-54.0F, 3.0F, 0.25F);
/*      */     
/* 2775 */     this.gunModel['ʝ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2776 */     this.gunModel['ʝ'].setRotationPoint(-54.0F, 2.0F, 0.25F);
/*      */     
/* 2778 */     this.gunModel['ʞ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2779 */     this.gunModel['ʞ'].setRotationPoint(-54.0F, 1.0F, 0.25F);
/*      */     
/* 2781 */     this.gunModel['ʟ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2782 */     this.gunModel['ʟ'].setRotationPoint(-60.0F, 3.0F, 0.25F);
/*      */     
/* 2784 */     this.gunModel['ʠ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2785 */     this.gunModel['ʠ'].setRotationPoint(-60.0F, 2.0F, 0.25F);
/*      */     
/* 2787 */     this.gunModel['ʡ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2788 */     this.gunModel['ʡ'].setRotationPoint(-60.0F, 1.0F, 0.25F);
/*      */     
/* 2790 */     this.gunModel['ʢ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2791 */     this.gunModel['ʢ'].setRotationPoint(-57.0F, 0.0F, 0.25F);
/*      */     
/* 2793 */     this.gunModel['ʣ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2794 */     this.gunModel['ʣ'].setRotationPoint(-57.0F, -1.0F, 0.25F);
/*      */     
/* 2796 */     this.gunModel['ʤ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2797 */     this.gunModel['ʤ'].setRotationPoint(-57.0F, -2.0F, 0.25F);
/*      */     
/* 2799 */     this.gunModel['ʥ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2800 */     this.gunModel['ʥ'].setRotationPoint(-64.5F, 2.5F, 0.25F);
/*      */     
/* 2802 */     this.gunModel['ʦ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2803 */     this.gunModel['ʦ'].setRotationPoint(-64.5F, 1.5F, 0.25F);
/*      */     
/* 2805 */     this.gunModel['ʧ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2806 */     this.gunModel['ʧ'].setRotationPoint(-64.5F, 0.5F, 0.25F);
/*      */     
/* 2808 */     this.gunModel['ʨ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2809 */     this.gunModel['ʨ'].setRotationPoint(-65.0F, -3.0F, -1.0F);
/*      */     
/* 2811 */     this.gunModel['ʩ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 3, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2812 */     this.gunModel['ʩ'].setRotationPoint(-67.0F, -6.0F, -1.0F);
/*      */     
/* 2814 */     this.gunModel['ʪ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2815 */     this.gunModel['ʪ'].setRotationPoint(-67.0F, -8.0F, -1.0F);
/*      */     
/* 2817 */     this.gunModel['ʫ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2818 */     this.gunModel['ʫ'].setRotationPoint(-68.0F, -9.0F, -1.0F);
/*      */     
/* 2820 */     this.gunModel['ʬ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2821 */     this.gunModel['ʬ'].setRotationPoint(-68.0F, -11.0F, -1.0F);
/*      */     
/* 2823 */     this.gunModel['ʭ'].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2824 */     this.gunModel['ʭ'].setRotationPoint(-68.0F, -12.0F, -1.0F);
/*      */     
/* 2826 */     this.gunModel['ʮ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2827 */     this.gunModel['ʮ'].setRotationPoint(-74.5F, -11.0F, -2.0F);
/*      */     
/* 2829 */     this.gunModel['ʯ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2830 */     this.gunModel['ʯ'].setRotationPoint(-74.5F, -12.0F, -2.0F);
/*      */     
/* 2832 */     this.gunModel['ʰ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 2833 */     this.gunModel['ʰ'].setRotationPoint(-70.5F, -12.0F, 23.0F);
/*      */     
/* 2835 */     this.gunModel['ʱ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 9, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 2836 */     this.gunModel['ʱ'].setRotationPoint(-181.0F, -12.0F, 0.0F);
/*      */     
/* 2838 */     this.gunModel['ʲ'].addShapeBox(71.0F, -39.0F, -12.0F, 5, 11, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2839 */     this.gunModel['ʲ'].setRotationPoint(-172.0F, -12.0F, 0.0F);
/*      */     
/* 2841 */     this.gunModel['ʳ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2842 */     this.gunModel['ʳ'].setRotationPoint(-164.0F, -24.0F, 0.0F);
/*      */     
/* 2844 */     this.gunModel['ʴ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2845 */     this.gunModel['ʴ'].setRotationPoint(-167.0F, -9.0F, 0.0F);
/*      */     
/* 2847 */     this.gunModel['ʵ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2848 */     this.gunModel['ʵ'].setRotationPoint(-166.0F, -9.0F, 0.0F);
/*      */     
/* 2850 */     this.gunModel['ʶ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2851 */     this.gunModel['ʶ'].setRotationPoint(-186.0F, -21.0F, 0.0F);
/*      */     
/* 2853 */     this.gunModel['ʷ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2854 */     this.gunModel['ʷ'].setRotationPoint(-186.0F, -23.0F, 0.0F);
/*      */     
/* 2856 */     this.gunModel['ʸ'].addShapeBox(71.0F, -39.0F, -12.0F, 9, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2857 */     this.gunModel['ʸ'].setRotationPoint(-184.0F, -23.0F, 0.0F);
/*      */     
/* 2859 */     this.gunModel['ʹ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2860 */     this.gunModel['ʹ'].setRotationPoint(-184.0F, -13.0F, 0.0F);
/*      */     
/* 2862 */     this.gunModel['ʺ'].addShapeBox(71.0F, -39.0F, -12.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2863 */     this.gunModel['ʺ'].setRotationPoint(-184.0F, -21.0F, 0.0F);
/*      */     
/* 2865 */     this.gunModel['ʻ'].addShapeBox(71.0F, -39.0F, -12.0F, 1, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2866 */     this.gunModel['ʻ'].setRotationPoint(-164.0F, -9.0F, 0.0F);
/*      */     
/* 2868 */     this.gunModel['ʼ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2869 */     this.gunModel['ʼ'].setRotationPoint(-167.0F, -24.0F, 0.0F);
/*      */     
/* 2871 */     this.gunModel['ʽ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2872 */     this.gunModel['ʽ'].setRotationPoint(-167.0F, -29.0F, 0.0F);
/*      */     
/* 2874 */     this.gunModel['ʾ'].addShapeBox(71.0F, -39.0F, -12.0F, 21, 17, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2875 */     this.gunModel['ʾ'].setRotationPoint(-184.0F, -24.0F, 1.5F);
/*      */     
/* 2877 */     this.gunModel['ʿ'].addShapeBox(71.0F, -39.0F, -12.0F, 4, 19, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2878 */     this.gunModel['ʿ'].setRotationPoint(-147.0F, -26.0F, 0.0F);
/*      */     
/* 2880 */     this.gunModel['ˀ'].addShapeBox(71.0F, -39.0F, -12.0F, 3, 30, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2881 */     this.gunModel['ˀ'].setRotationPoint(-140.0F, -32.5F, 0.0F);
/*      */     
/* 2883 */     this.gunModel['ˁ'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2884 */     this.gunModel['ˁ'].setRotationPoint(-149.5F, -44.5F, -4.0F);
/* 2885 */     this.gunModel['ˁ'].rotateAngleZ = -0.13962634F;
/*      */     
/* 2887 */     this.gunModel['˂'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2888 */     this.gunModel['˂'].setRotationPoint(-149.5F, -36.5F, -3.0F);
/* 2889 */     this.gunModel['˂'].rotateAngleZ = -0.13962634F;
/*      */     
/* 2891 */     this.gunModel['˃'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2892 */     this.gunModel['˃'].setRotationPoint(-151.5F, -30.5F, -4.0F);
/* 2893 */     this.gunModel['˃'].rotateAngleZ = -0.13962634F;
/*      */     
/* 2895 */     this.gunModel['˄'].addShapeBox(71.0F, -39.0F, -12.0F, 6, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2896 */     this.gunModel['˄'].setRotationPoint(-151.5F, -22.5F, -3.0F);
/* 2897 */     this.gunModel['˄'].rotateAngleZ = -0.13962634F;
/*      */     
/* 2899 */     this.gunModel['˅'].addShapeBox(71.0F, -39.0F, -12.0F, 8, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2900 */     this.gunModel['˅'].setRotationPoint(-153.5F, -16.5F, -4.0F);
/* 2901 */     this.gunModel['˅'].rotateAngleZ = -0.13962634F;
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2906 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 961, 145, this.textureX, this.textureY);
/* 2907 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 873, 201, this.textureX, this.textureY);
/* 2908 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 553, 513, this.textureX, this.textureY);
/* 2909 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 993, 161, this.textureX, this.textureY);
/* 2910 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 873, 121, this.textureX, this.textureY);
/* 2911 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 945, 121, this.textureX, this.textureY);
/* 2912 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 977, 121, this.textureX, this.textureY);
/* 2913 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 2914 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 609, 209, this.textureX, this.textureY);
/* 2915 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 985, 393, this.textureX, this.textureY);
/* 2916 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 537, 545, this.textureX, this.textureY);
/* 2917 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 121, 593, this.textureX, this.textureY);
/* 2918 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 569, 593, this.textureX, this.textureY);
/* 2919 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 817, 593, this.textureX, this.textureY);
/* 2920 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 945, 193, this.textureX, this.textureY);
/* 2921 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 2922 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 313, 417, this.textureX, this.textureY);
/* 2923 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/* 2924 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 833, 9, this.textureX, this.textureY);
/* 2925 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 985, 209, this.textureX, this.textureY);
/* 2926 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 377, 417, this.textureX, this.textureY);
/* 2927 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 705, 313, this.textureX, this.textureY);
/* 2928 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 225, 617, this.textureX, this.textureY);
/* 2929 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/* 2930 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/* 2931 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 209, 233, this.textureX, this.textureY);
/* 2932 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 25, 201, this.textureX, this.textureY);
/* 2933 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 593, 625, this.textureX, this.textureY);
/* 2934 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 713, 625, this.textureX, this.textureY);
/* 2935 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 785, 625, this.textureX, this.textureY);
/* 2936 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 785, 129, this.textureX, this.textureY);
/* 2937 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 817, 129, this.textureX, this.textureY);
/* 2938 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 873, 129, this.textureX, this.textureY);
/* 2939 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 977, 129, this.textureX, this.textureY);
/* 2940 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 1009, 129, this.textureX, this.textureY);
/* 2941 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 177, 137, this.textureX, this.textureY);
/* 2942 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 553, 417, this.textureX, this.textureY);
/* 2943 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/* 2944 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 985, 145, this.textureX, this.textureY);
/* 2945 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 201, 177, this.textureX, this.textureY);
/* 2946 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 1009, 137, this.textureX, this.textureY);
/* 2947 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 961, 161, this.textureX, this.textureY);
/* 2948 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/* 2949 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 169, 169, this.textureX, this.textureY);
/* 2950 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 265, 233, this.textureX, this.textureY);
/* 2951 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 297, 233, this.textureX, this.textureY);
/* 2952 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 1001, 233, this.textureX, this.textureY);
/* 2953 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 985, 489, this.textureX, this.textureY);
/* 2954 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 633, 177, this.textureX, this.textureY);
/* 2955 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 1001, 305, this.textureX, this.textureY);
/* 2956 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 513, 625, this.textureX, this.textureY);
/* 2957 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 769, 321, this.textureX, this.textureY);
/* 2958 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 921, 177, this.textureX, this.textureY);
/* 2959 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 985, 177, this.textureX, this.textureY);
/* 2960 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 1009, 177, this.textureX, this.textureY);
/* 2961 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/* 2962 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 809, 321, this.textureX, this.textureY);
/* 2963 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 993, 513, this.textureX, this.textureY);
/* 2964 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 81, 633, this.textureX, this.textureY);
/* 2965 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 1, 633, this.textureX, this.textureY);
/* 2966 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 129, 633, this.textureX, this.textureY);
/* 2967 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 305, 633, this.textureX, this.textureY);
/* 2968 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 49, 201, this.textureX, this.textureY);
/* 2969 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/* 2970 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 769, 473, this.textureX, this.textureY);
/* 2971 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 201, 185, this.textureX, this.textureY);
/* 2972 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/* 2973 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 825, 473, this.textureX, this.textureY);
/* 2974 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/* 2975 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 153, 633, this.textureX, this.textureY);
/* 2976 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 329, 633, this.textureX, this.textureY);
/* 2977 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 361, 641, this.textureX, this.textureY);
/* 2978 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 609, 513, this.textureX, this.textureY);
/* 2979 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 89, 433, this.textureX, this.textureY);
/* 2980 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 217, 401, this.textureX, this.textureY);
/* 2981 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 105, 201, this.textureX, this.textureY);
/* 2982 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 129, 201, this.textureX, this.textureY);
/* 2983 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 153, 201, this.textureX, this.textureY);
/* 2984 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 177, 201, this.textureX, this.textureY);
/* 2985 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 201, 201, this.textureX, this.textureY);
/* 2986 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 329, 193, this.textureX, this.textureY);
/* 2987 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 513, 193, this.textureX, this.textureY);
/* 2988 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 537, 201, this.textureX, this.textureY);
/* 2989 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 561, 201, this.textureX, this.textureY);
/* 2990 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 537, 193, this.textureX, this.textureY);
/* 2991 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 233, 177, this.textureX, this.textureY);
/* 2992 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 881, 473, this.textureX, this.textureY);
/*      */     
/* 2994 */     this.defaultScopeModel[0].addShapeBox(71.0F, -39.0F, -12.0F, 4, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2995 */     this.defaultScopeModel[0].setRotationPoint(-119.0F, -62.5F, 17.0F);
/*      */     
/* 2997 */     this.defaultScopeModel[1].addShapeBox(71.0F, -39.0F, -12.0F, 6, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2998 */     this.defaultScopeModel[1].setRotationPoint(-115.0F, -62.5F, 17.0F);
/*      */     
/* 3000 */     this.defaultScopeModel[2].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3001 */     this.defaultScopeModel[2].setRotationPoint(-119.0F, -64.5F, 3.0F);
/*      */     
/* 3003 */     this.defaultScopeModel[3].addShapeBox(71.0F, -39.0F, -12.0F, 10, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3004 */     this.defaultScopeModel[3].setRotationPoint(-129.0F, -64.5F, 17.0F);
/*      */     
/* 3006 */     this.defaultScopeModel[4].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3007 */     this.defaultScopeModel[4].setRotationPoint(-125.5F, -60.5F, 19.0F);
/*      */     
/* 3009 */     this.defaultScopeModel[5].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3010 */     this.defaultScopeModel[5].setRotationPoint(-125.5F, -62.5F, 19.0F);
/*      */     
/* 3012 */     this.defaultScopeModel[6].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3013 */     this.defaultScopeModel[6].setRotationPoint(-125.5F, -61.5F, 19.0F);
/*      */     
/* 3015 */     this.defaultScopeModel[7].addShapeBox(71.0F, -39.0F, -12.0F, 4, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3016 */     this.defaultScopeModel[7].setRotationPoint(-119.0F, -62.5F, 3.0F);
/*      */     
/* 3018 */     this.defaultScopeModel[8].addShapeBox(71.0F, -39.0F, -12.0F, 6, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3019 */     this.defaultScopeModel[8].setRotationPoint(-115.0F, -62.5F, 3.0F);
/*      */     
/* 3021 */     this.defaultScopeModel[9].addShapeBox(71.0F, -39.0F, -12.0F, 1, 7, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3022 */     this.defaultScopeModel[9].setRotationPoint(-120.0F, -64.5F, 3.0F);
/*      */     
/* 3024 */     this.defaultScopeModel[10].addShapeBox(71.0F, -39.0F, -12.0F, 11, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3025 */     this.defaultScopeModel[10].setRotationPoint(-130.0F, -61.5F, 7.0F);
/*      */     
/* 3027 */     this.defaultScopeModel[11].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 15, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3028 */     this.defaultScopeModel[11].setRotationPoint(-128.0F, -64.5F, 2.0F);
/*      */     
/* 3030 */     this.defaultScopeModel[12].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3031 */     this.defaultScopeModel[12].setRotationPoint(-128.0F, -62.5F, 2.0F);
/*      */     
/* 3033 */     this.defaultScopeModel[13].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3034 */     this.defaultScopeModel[13].setRotationPoint(-128.0F, -60.5F, 2.0F);
/*      */     
/* 3036 */     this.defaultScopeModel[14].addShapeBox(71.0F, -39.0F, -12.0F, 9, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3037 */     this.defaultScopeModel[14].setRotationPoint(-129.0F, -58.5F, 3.0F);
/*      */     
/* 3039 */     this.defaultScopeModel[15].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3040 */     this.defaultScopeModel[15].setRotationPoint(-124.0F, -60.5F, 3.0F);
/*      */     
/* 3042 */     this.defaultScopeModel[16].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3043 */     this.defaultScopeModel[16].setRotationPoint(-122.0F, -64.5F, 3.0F);
/*      */     
/* 3045 */     this.defaultScopeModel[17].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3046 */     this.defaultScopeModel[17].setRotationPoint(-129.0F, -60.5F, 3.0F);
/*      */     
/* 3048 */     this.defaultScopeModel[18].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3049 */     this.defaultScopeModel[18].setRotationPoint(-129.0F, -61.5F, 3.0F);
/*      */     
/* 3051 */     this.defaultScopeModel[19].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3052 */     this.defaultScopeModel[19].setRotationPoint(-127.0F, -66.5F, 7.5F);
/*      */     
/* 3054 */     this.defaultScopeModel[20].addShapeBox(71.0F, -39.0F, -12.0F, 7, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3055 */     this.defaultScopeModel[20].setRotationPoint(-127.0F, -70.5F, 7.5F);
/*      */     
/* 3057 */     this.defaultScopeModel[21].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3058 */     this.defaultScopeModel[21].setRotationPoint(-127.0F, -65.5F, 7.5F);
/*      */     
/* 3060 */     this.defaultScopeModel[22].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 3061 */     this.defaultScopeModel[22].setRotationPoint(-127.0F, -71.5F, 4.5F);
/*      */     
/* 3063 */     this.defaultScopeModel[23].addShapeBox(71.0F, -39.0F, -12.0F, 7, 11, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3064 */     this.defaultScopeModel[23].setRotationPoint(-127.0F, -82.5F, 4.5F);
/*      */     
/* 3066 */     this.defaultScopeModel[24].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3067 */     this.defaultScopeModel[24].setRotationPoint(-127.0F, -83.5F, 4.5F);
/*      */     
/* 3069 */     this.defaultScopeModel[25].addShapeBox(71.0F, -39.0F, -12.0F, 7, 11, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3070 */     this.defaultScopeModel[25].setRotationPoint(-127.0F, -82.5F, 16.5F);
/*      */     
/* 3072 */     this.defaultScopeModel[26].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3073 */     this.defaultScopeModel[26].setRotationPoint(-127.0F, -83.5F, 16.5F);
/*      */     
/* 3075 */     this.defaultScopeModel[27].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3076 */     this.defaultScopeModel[27].setRotationPoint(-117.5F, -57.0F, 2.5F);
/*      */     
/* 3078 */     this.defaultScopeModel[28].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 19, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3079 */     this.defaultScopeModel[28].setRotationPoint(-117.5F, -61.0F, 2.5F);
/*      */     
/* 3081 */     this.defaultScopeModel[29].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3082 */     this.defaultScopeModel[29].setRotationPoint(-117.5F, -59.0F, 2.5F);
/*      */     
/* 3084 */     this.defaultScopeModel[30].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3085 */     this.defaultScopeModel[30].setRotationPoint(-126.5F, -76.5F, 19.0F);
/*      */     
/* 3087 */     this.defaultScopeModel[31].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3088 */     this.defaultScopeModel[31].setRotationPoint(-126.5F, -80.5F, 19.0F);
/*      */     
/* 3090 */     this.defaultScopeModel[32].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3091 */     this.defaultScopeModel[32].setRotationPoint(-126.5F, -78.5F, 19.0F);
/*      */     
/* 3093 */     this.defaultScopeModel[33].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3094 */     this.defaultScopeModel[33].setRotationPoint(-126.5F, -76.5F, 4.0F);
/*      */     
/* 3096 */     this.defaultScopeModel[34].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3097 */     this.defaultScopeModel[34].setRotationPoint(-126.5F, -80.5F, 4.0F);
/*      */     
/* 3099 */     this.defaultScopeModel[35].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3100 */     this.defaultScopeModel[35].setRotationPoint(-126.5F, -78.5F, 4.0F);
/*      */     
/* 3102 */     this.defaultScopeModel[36].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3103 */     this.defaultScopeModel[36].setRotationPoint(-127.0F, -73.5F, 7.5F);
/*      */     
/* 3105 */     this.defaultScopeModel[37].addShapeBox(71.0F, -39.0F, -12.0F, 5, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3106 */     this.defaultScopeModel[37].setRotationPoint(-126.0F, -77.5F, 10.0F);
/*      */     
/* 3108 */     this.defaultScopeModel[38].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3109 */     this.defaultScopeModel[38].setRotationPoint(-126.0F, -79.5F, 12.0F);
/*      */     
/* 3111 */     this.defaultScopeModel[39].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3112 */     this.defaultScopeModel[39].setRotationPoint(-126.0F, -79.5F, 10.0F);
/*      */     
/* 3114 */     this.defaultScopeModel[40].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3115 */     this.defaultScopeModel[40].setRotationPoint(-126.0F, -80.5F, 12.0F);
/*      */     
/* 3117 */     this.defaultScopeModel[41].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3118 */     this.defaultScopeModel[41].setRotationPoint(-126.0F, -80.5F, 10.0F);
/*      */     
/* 3120 */     this.defaultScopeModel[42].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3121 */     this.defaultScopeModel[42].setRotationPoint(-126.0F, -81.5F, 12.0F);
/*      */     
/* 3123 */     this.defaultScopeModel[43].addShapeBox(71.0F, -39.0F, -12.0F, 5, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3124 */     this.defaultScopeModel[43].setRotationPoint(-126.0F, -81.5F, 10.0F);
/*      */     
/* 3126 */     this.defaultScopeModel[44].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 3127 */     this.defaultScopeModel[44].setRotationPoint(-124.5F, -75.0F, 7.5F);
/*      */     
/* 3129 */     this.defaultScopeModel[45].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 9, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3130 */     this.defaultScopeModel[45].setRotationPoint(-124.5F, -76.0F, 7.5F);
/*      */     
/* 3132 */     this.defaultScopeModel[46].addShapeBox(71.0F, -39.0F, -12.0F, 2, 1, 9, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3133 */     this.defaultScopeModel[46].setRotationPoint(-124.5F, -75.5F, 7.5F);
/*      */     
/* 3135 */     this.defaultScopeModel[47].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3136 */     this.defaultScopeModel[47].setRotationPoint(-120.0F, -57.5F, 3.0F);
/*      */     
/* 3138 */     this.defaultScopeModel[48].addShapeBox(71.0F, -39.0F, -12.0F, 4, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3139 */     this.defaultScopeModel[48].setRotationPoint(164.0F, -62.5F, 17.0F);
/*      */     
/* 3141 */     this.defaultScopeModel[49].addShapeBox(71.0F, -39.0F, -12.0F, 6, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3142 */     this.defaultScopeModel[49].setRotationPoint(168.0F, -62.5F, 17.0F);
/*      */     
/* 3144 */     this.defaultScopeModel[50].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3145 */     this.defaultScopeModel[50].setRotationPoint(164.0F, -64.5F, 3.0F);
/*      */     
/* 3147 */     this.defaultScopeModel[51].addShapeBox(71.0F, -39.0F, -12.0F, 10, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3148 */     this.defaultScopeModel[51].setRotationPoint(154.0F, -64.5F, 17.0F);
/*      */     
/* 3150 */     this.defaultScopeModel[52].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3151 */     this.defaultScopeModel[52].setRotationPoint(157.5F, -60.5F, 19.0F);
/*      */     
/* 3153 */     this.defaultScopeModel[53].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3154 */     this.defaultScopeModel[53].setRotationPoint(157.5F, -62.5F, 19.0F);
/*      */     
/* 3156 */     this.defaultScopeModel[54].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3157 */     this.defaultScopeModel[54].setRotationPoint(157.5F, -61.5F, 19.0F);
/*      */     
/* 3159 */     this.defaultScopeModel[55].addShapeBox(71.0F, -39.0F, -12.0F, 4, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3160 */     this.defaultScopeModel[55].setRotationPoint(164.0F, -62.5F, 3.0F);
/*      */     
/* 3162 */     this.defaultScopeModel[56].addShapeBox(71.0F, -39.0F, -12.0F, 6, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3163 */     this.defaultScopeModel[56].setRotationPoint(168.0F, -62.5F, 3.0F);
/*      */     
/* 3165 */     this.defaultScopeModel[57].addShapeBox(71.0F, -39.0F, -12.0F, 1, 7, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3166 */     this.defaultScopeModel[57].setRotationPoint(163.0F, -64.5F, 3.0F);
/*      */     
/* 3168 */     this.defaultScopeModel[58].addShapeBox(71.0F, -39.0F, -12.0F, 11, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3169 */     this.defaultScopeModel[58].setRotationPoint(153.0F, -61.5F, 7.0F);
/*      */     
/* 3171 */     this.defaultScopeModel[59].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 15, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3172 */     this.defaultScopeModel[59].setRotationPoint(155.0F, -64.5F, 2.0F);
/*      */     
/* 3174 */     this.defaultScopeModel[60].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3175 */     this.defaultScopeModel[60].setRotationPoint(155.0F, -62.5F, 2.0F);
/*      */     
/* 3177 */     this.defaultScopeModel[61].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3178 */     this.defaultScopeModel[61].setRotationPoint(155.0F, -60.5F, 2.0F);
/*      */     
/* 3180 */     this.defaultScopeModel[62].addShapeBox(71.0F, -39.0F, -12.0F, 9, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3181 */     this.defaultScopeModel[62].setRotationPoint(154.0F, -58.5F, 3.0F);
/*      */     
/* 3183 */     this.defaultScopeModel[63].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3184 */     this.defaultScopeModel[63].setRotationPoint(159.0F, -60.5F, 3.0F);
/*      */     
/* 3186 */     this.defaultScopeModel[64].addShapeBox(71.0F, -39.0F, -12.0F, 2, 4, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3187 */     this.defaultScopeModel[64].setRotationPoint(161.0F, -64.5F, 3.0F);
/*      */     
/* 3189 */     this.defaultScopeModel[65].addShapeBox(71.0F, -39.0F, -12.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3190 */     this.defaultScopeModel[65].setRotationPoint(154.0F, -60.5F, 3.0F);
/*      */     
/* 3192 */     this.defaultScopeModel[66].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3193 */     this.defaultScopeModel[66].setRotationPoint(154.0F, -61.5F, 3.0F);
/*      */     
/* 3195 */     this.defaultScopeModel[67].addShapeBox(71.0F, -39.0F, -12.0F, 7, 11, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3196 */     this.defaultScopeModel[67].setRotationPoint(156.0F, -75.5F, 8.5F);
/*      */     
/* 3198 */     this.defaultScopeModel[68].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 2, 0.0F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3199 */     this.defaultScopeModel[68].setRotationPoint(156.5F, -83.5F, 7.5F);
/*      */     
/* 3201 */     this.defaultScopeModel[69].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3202 */     this.defaultScopeModel[69].setRotationPoint(165.5F, -57.0F, 2.5F);
/*      */     
/* 3204 */     this.defaultScopeModel[70].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 19, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3205 */     this.defaultScopeModel[70].setRotationPoint(165.5F, -61.0F, 2.5F);
/*      */     
/* 3207 */     this.defaultScopeModel[71].addShapeBox(71.0F, -39.0F, -12.0F, 6, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3208 */     this.defaultScopeModel[71].setRotationPoint(165.5F, -59.0F, 2.5F);
/*      */     
/* 3210 */     this.defaultScopeModel[72].addShapeBox(71.0F, -39.0F, -12.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3211 */     this.defaultScopeModel[72].setRotationPoint(163.0F, -57.5F, 3.0F);
/*      */     
/* 3213 */     this.defaultScopeModel[73].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3214 */     this.defaultScopeModel[73].setRotationPoint(-127.0F, -64.5F, 7.5F);
/*      */     
/* 3216 */     this.defaultScopeModel[74].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3217 */     this.defaultScopeModel[74].setRotationPoint(156.0F, -64.5F, 8.5F);
/*      */     
/* 3219 */     this.defaultScopeModel[75].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3220 */     this.defaultScopeModel[75].setRotationPoint(156.0F, -77.5F, 13.5F);
/*      */     
/* 3222 */     this.defaultScopeModel[76].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3223 */     this.defaultScopeModel[76].setRotationPoint(156.0F, -77.5F, 8.5F);
/*      */     
/* 3225 */     this.defaultScopeModel[77].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3226 */     this.defaultScopeModel[77].setRotationPoint(156.0F, -79.5F, 7.0F);
/*      */     
/* 3228 */     this.defaultScopeModel[78].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3229 */     this.defaultScopeModel[78].setRotationPoint(156.0F, -79.5F, 15.0F);
/*      */     
/* 3231 */     this.defaultScopeModel[79].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3232 */     this.defaultScopeModel[79].setRotationPoint(156.0F, -76.5F, 10.5F);
/*      */     
/* 3234 */     this.defaultScopeModel[80].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3235 */     this.defaultScopeModel[80].setRotationPoint(156.0F, -80.5F, 15.5F);
/*      */     
/* 3237 */     this.defaultScopeModel[81].addShapeBox(71.0F, -39.0F, -12.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3238 */     this.defaultScopeModel[81].setRotationPoint(156.0F, -80.5F, 6.5F);
/*      */     
/* 3240 */     this.defaultScopeModel[82].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 2, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3241 */     this.defaultScopeModel[82].setRotationPoint(156.0F, -82.5F, 15.5F);
/*      */     
/* 3243 */     this.defaultScopeModel[83].addShapeBox(71.0F, -39.0F, -12.0F, 7, 2, 2, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3244 */     this.defaultScopeModel[83].setRotationPoint(156.0F, -82.5F, 6.5F);
/*      */     
/* 3246 */     this.defaultScopeModel[84].addShapeBox(71.0F, -39.0F, -12.0F, 6, 1, 2, 0.0F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3247 */     this.defaultScopeModel[84].setRotationPoint(156.5F, -83.5F, 14.5F);
/*      */     
/* 3249 */     this.defaultScopeModel[85].addShapeBox(71.0F, -39.0F, -12.0F, 3, 4, 2, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3250 */     this.defaultScopeModel[85].setRotationPoint(158.0F, -80.5F, 11.0F);
/*      */     
/* 3252 */     this.defaultScopeModel[86].addShapeBox(71.0F, -39.0F, -12.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3253 */     this.defaultScopeModel[86].setRotationPoint(158.0F, -63.5F, 8.5F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 3258 */     this.ammoModel[0] = new ModelRendererTurbo(this, 1, 433, this.textureX, this.textureY);
/* 3259 */     this.ammoModel[1] = new ModelRendererTurbo(this, 105, 433, this.textureX, this.textureY);
/* 3260 */     this.ammoModel[2] = new ModelRendererTurbo(this, 553, 433, this.textureX, this.textureY);
/* 3261 */     this.ammoModel[3] = new ModelRendererTurbo(this, 665, 433, this.textureX, this.textureY);
/* 3262 */     this.ammoModel[4] = new ModelRendererTurbo(this, 777, 433, this.textureX, this.textureY);
/* 3263 */     this.ammoModel[5] = new ModelRendererTurbo(this, 969, 425, this.textureX, this.textureY);
/* 3264 */     this.ammoModel[6] = new ModelRendererTurbo(this, 881, 433, this.textureX, this.textureY);
/* 3265 */     this.ammoModel[7] = new ModelRendererTurbo(this, 385, 441, this.textureX, this.textureY);
/* 3266 */     this.ammoModel[8] = new ModelRendererTurbo(this, 921, 441, this.textureX, this.textureY);
/* 3267 */     this.ammoModel[9] = new ModelRendererTurbo(this, 217, 449, this.textureX, this.textureY);
/* 3268 */     this.ammoModel[10] = new ModelRendererTurbo(this, 369, 385, this.textureX, this.textureY);
/* 3269 */     this.ammoModel[11] = new ModelRendererTurbo(this, 249, 449, this.textureX, this.textureY);
/* 3270 */     this.ammoModel[12] = new ModelRendererTurbo(this, 425, 385, this.textureX, this.textureY);
/* 3271 */     this.ammoModel[13] = new ModelRendererTurbo(this, 481, 385, this.textureX, this.textureY);
/* 3272 */     this.ammoModel[14] = new ModelRendererTurbo(this, 425, 449, this.textureX, this.textureY);
/* 3273 */     this.ammoModel[15] = new ModelRendererTurbo(this, 537, 385, this.textureX, this.textureY);
/* 3274 */     this.ammoModel[16] = new ModelRendererTurbo(this, 265, 465, this.textureX, this.textureY);
/* 3275 */     this.ammoModel[17] = new ModelRendererTurbo(this, 801, 689, this.textureX, this.textureY);
/* 3276 */     this.ammoModel[18] = new ModelRendererTurbo(this, 969, 689, this.textureX, this.textureY);
/* 3277 */     this.ammoModel[19] = new ModelRendererTurbo(this, 385, 705, this.textureX, this.textureY);
/* 3278 */     this.ammoModel[20] = new ModelRendererTurbo(this, 441, 705, this.textureX, this.textureY);
/* 3279 */     this.ammoModel[21] = new ModelRendererTurbo(this, 857, 705, this.textureX, this.textureY);
/*      */     
/* 3281 */     this.ammoModel[0].addShapeBox(71.0F, -39.0F, -12.0F, 33, 18, 18, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3282 */     this.ammoModel[0].setRotationPoint(-5.0F, 32.0F, 3.0F);
/*      */     
/* 3284 */     this.ammoModel[1].addShapeBox(71.0F, -39.0F, -12.0F, 34, 27, 18, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 3285 */     this.ammoModel[1].setRotationPoint(-1.0F, 50.0F, 3.0F);
/*      */     
/* 3287 */     this.ammoModel[2].addShapeBox(71.0F, -39.0F, -12.0F, 34, 18, 18, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 3288 */     this.ammoModel[2].setRotationPoint(5.0F, 77.0F, 3.0F);
/*      */     
/* 3290 */     this.ammoModel[3].addShapeBox(71.0F, -39.0F, -12.0F, 35, 12, 18, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -9.0F, 16.0F, 0.0F, 6.0F, 4.0F, 0.0F, 6.0F, 4.0F, 0.0F, -9.0F, 16.0F, 0.0F);
/* 3291 */     this.ammoModel[3].setRotationPoint(10.0F, 95.0F, 3.0F);
/*      */     
/* 3293 */     this.ammoModel[4].addShapeBox(71.0F, -39.0F, -12.0F, 33, 18, 18, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3294 */     this.ammoModel[4].setRotationPoint(-9.0F, 23.0F, 3.0F);
/*      */     
/* 3296 */     this.ammoModel[5].addShapeBox(71.0F, -39.0F, -12.0F, 3, 18, 12, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3297 */     this.ammoModel[5].setRotationPoint(-8.0F, 32.0F, 6.0F);
/*      */     
/* 3299 */     this.ammoModel[6].addShapeBox(71.0F, -39.0F, -12.0F, 4, 27, 12, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 3300 */     this.ammoModel[6].setRotationPoint(-4.0F, 50.0F, 6.0F);
/*      */     
/* 3302 */     this.ammoModel[7].addShapeBox(71.0F, -39.0F, -12.0F, 4, 18, 12, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 3303 */     this.ammoModel[7].setRotationPoint(2.0F, 77.0F, 6.0F);
/*      */     
/* 3305 */     this.ammoModel[8].addShapeBox(71.0F, -39.0F, -12.0F, 8, 29, 12, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F);
/* 3306 */     this.ammoModel[8].setRotationPoint(7.0F, 95.0F, 6.0F);
/*      */     
/* 3308 */     this.ammoModel[9].addShapeBox(71.0F, -39.0F, -12.0F, 3, 18, 12, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3309 */     this.ammoModel[9].setRotationPoint(-12.0F, 23.0F, 6.0F);
/*      */     
/* 3311 */     this.ammoModel[10].addShapeBox(71.0F, -39.0F, -12.0F, 1, 3, 14, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 3312 */     this.ammoModel[10].setRotationPoint(44.0F, 52.0F, 5.0F);
/*      */     
/* 3314 */     this.ammoModel[11].addShapeBox(71.0F, -39.0F, -12.0F, 2, 17, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 3315 */     this.ammoModel[11].setRotationPoint(41.0F, 35.0F, 5.0F);
/*      */     
/* 3317 */     this.ammoModel[12].addShapeBox(71.0F, -39.0F, -12.0F, 1, 3, 14, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
/* 3318 */     this.ammoModel[12].setRotationPoint(40.0F, 32.0F, 5.0F);
/*      */     
/* 3320 */     this.ammoModel[13].addShapeBox(71.0F, -39.0F, -12.0F, 1, 3, 14, 0.0F, 0.65F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 3321 */     this.ammoModel[13].setRotationPoint(56.0F, 93.0F, 5.0F);
/*      */     
/* 3323 */     this.ammoModel[14].addShapeBox(71.0F, -39.0F, -12.0F, 2, 17, 14, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 3324 */     this.ammoModel[14].setRotationPoint(52.0F, 76.0F, 5.0F);
/*      */     
/* 3326 */     this.ammoModel[15].addShapeBox(71.0F, -39.0F, -12.0F, 1, 3, 14, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
/* 3327 */     this.ammoModel[15].setRotationPoint(50.0F, 73.0F, 5.0F);
/*      */     
/* 3329 */     this.ammoModel[16].addShapeBox(71.0F, -39.0F, -12.0F, 47, 4, 20, 0.0F, 0.0F, -18.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -18.0F, 0.0F, -5.0F, 21.0F, 0.0F, 2.0F, 3.0F, 0.0F, 2.0F, 3.0F, 0.0F, -5.0F, 21.0F, 0.0F);
/* 3330 */     this.ammoModel[16].setRotationPoint(15.0F, 106.0F, 2.0F);
/*      */     
/* 3332 */     this.ammoModel[17].addShapeBox(71.0F, -39.0F, -12.0F, 10, 18, 14, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3333 */     this.ammoModel[17].setRotationPoint(29.0F, 32.0F, 5.0F);
/*      */     
/* 3335 */     this.ammoModel[18].addShapeBox(71.0F, -39.0F, -12.0F, 11, 27, 14, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 3336 */     this.ammoModel[18].setRotationPoint(33.0F, 50.0F, 5.0F);
/*      */     
/* 3338 */     this.ammoModel[19].addShapeBox(71.0F, -39.0F, -12.0F, 11, 18, 14, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 3339 */     this.ammoModel[19].setRotationPoint(39.0F, 77.0F, 5.0F);
/*      */     
/* 3341 */     this.ammoModel[20].addShapeBox(71.0F, -39.0F, -12.0F, 12, 12, 14, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -9.0F, 9.0F, 0.0F, 6.0F, 4.0F, 0.0F, 6.0F, 4.0F, 0.0F, -9.0F, 9.0F, 0.0F);
/* 3342 */     this.ammoModel[20].setRotationPoint(44.0F, 95.0F, 5.0F);
/*      */     
/* 3344 */     this.ammoModel[21].addShapeBox(71.0F, -39.0F, -12.0F, 10, 18, 14, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3345 */     this.ammoModel[21].setRotationPoint(25.0F, 14.0F, 5.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 3350 */     this.slideModel[0] = new ModelRendererTurbo(this, 257, 417, this.textureX, this.textureY);
/* 3351 */     this.slideModel[1] = new ModelRendererTurbo(this, 57, 473, this.textureX, this.textureY);
/* 3352 */     this.slideModel[2] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/* 3353 */     this.slideModel[3] = new ModelRendererTurbo(this, 561, 17, this.textureX, this.textureY);
/* 3354 */     this.slideModel[4] = new ModelRendererTurbo(this, 1009, 65, this.textureX, this.textureY);
/* 3355 */     this.slideModel[5] = new ModelRendererTurbo(this, 601, 113, this.textureX, this.textureY);
/* 3356 */     this.slideModel[6] = new ModelRendererTurbo(this, 713, 121, this.textureX, this.textureY);
/* 3357 */     this.slideModel[7] = new ModelRendererTurbo(this, 793, 121, this.textureX, this.textureY);
/* 3358 */     this.slideModel[8] = new ModelRendererTurbo(this, 817, 121, this.textureX, this.textureY);
/* 3359 */     this.slideModel[9] = new ModelRendererTurbo(this, 801, 81, this.textureX, this.textureY);
/* 3360 */     this.slideModel[10] = new ModelRendererTurbo(this, 641, 97, this.textureX, this.textureY);
/* 3361 */     this.slideModel[11] = new ModelRendererTurbo(this, 417, 889, this.textureX, this.textureY);
/* 3362 */     this.slideModel[12] = new ModelRendererTurbo(this, 569, 889, this.textureX, this.textureY);
/*      */     
/* 3364 */     this.slideModel[0].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 17, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3365 */     this.slideModel[0].setRotationPoint(68.0F, -42.5F, 22.5F);
/*      */     
/* 3367 */     this.slideModel[1].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 3368 */     this.slideModel[1].setRotationPoint(68.0F, -39.5F, 22.5F);
/*      */     
/* 3370 */     this.slideModel[2].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3371 */     this.slideModel[2].setRotationPoint(68.0F, -41.5F, 38.5F);
/*      */     
/* 3373 */     this.slideModel[3].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3374 */     this.slideModel[3].setRotationPoint(68.0F, -41.5F, 37.5F);
/*      */     
/* 3376 */     this.slideModel[4].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3377 */     this.slideModel[4].setRotationPoint(68.0F, -40.5F, 37.5F);
/*      */     
/* 3379 */     this.slideModel[5].addShapeBox(71.0F, -39.0F, -12.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3380 */     this.slideModel[5].setRotationPoint(68.0F, -41.5F, 22.5F);
/*      */     
/* 3382 */     this.slideModel[6].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3383 */     this.slideModel[6].setRotationPoint(68.5F, -40.0F, 20.5F);
/*      */     
/* 3385 */     this.slideModel[7].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3386 */     this.slideModel[7].setRotationPoint(68.5F, -41.0F, 20.5F);
/*      */     
/* 3388 */     this.slideModel[8].addShapeBox(71.0F, -39.0F, -12.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3389 */     this.slideModel[8].setRotationPoint(68.5F, -42.0F, 20.5F);
/*      */     
/* 3391 */     this.slideModel[9].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3392 */     this.slideModel[9].setRotationPoint(68.0F, -40.5F, 24.0F);
/*      */     
/* 3394 */     this.slideModel[10].addShapeBox(71.0F, -39.0F, -12.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 3395 */     this.slideModel[10].setRotationPoint(68.0F, -41.5F, 24.0F);
/*      */     
/* 3397 */     this.slideModel[11].addShapeBox(71.0F, -39.0F, -12.0F, 69, 9, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3398 */     this.slideModel[11].setRotationPoint(-33.0F, -29.0F, 1.5F);
/*      */     
/* 3400 */     this.slideModel[12].addShapeBox(71.0F, -39.0F, -12.0F, 69, 3, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3401 */     this.slideModel[12].setRotationPoint(-33.0F, -32.0F, 1.5F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelcz805.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */