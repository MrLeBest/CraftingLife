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
/*      */ public class Modelbizon
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelbizon()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ŗ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[48];
/*   23 */     this.ammoModel = new ModelRendererTurbo['¤'];
/*   24 */     this.slideModel = new ModelRendererTurbo[12];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initdefaultScopeModel_1();
/*   28 */     initammoModel_1();
/*   29 */     initslideModel_1();
/*   30 */     translateAll(0.0F, -30.0F, 0.0F);
/*   31 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/*   33 */     this.gunSlideDistance = 0.75F;
/*   34 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   37 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   42 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   43 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   44 */     this.gunModel[2] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[3] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[4] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[5] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[6] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[7] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[8] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[9] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[10] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[11] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[12] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[13] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[14] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[15] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[16] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[17] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[18] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[19] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[20] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[21] = new ModelRendererTurbo(this, 729, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[22] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[23] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[24] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[25] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[26] = new ModelRendererTurbo(this, 721, 9, this.textureX, this.textureY);
/*   69 */     this.gunModel[27] = new ModelRendererTurbo(this, 937, 9, this.textureX, this.textureY);
/*   70 */     this.gunModel[28] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   71 */     this.gunModel[29] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/*   72 */     this.gunModel[30] = new ModelRendererTurbo(this, 865, 17, this.textureX, this.textureY);
/*   73 */     this.gunModel[31] = new ModelRendererTurbo(this, 601, 17, this.textureX, this.textureY);
/*   74 */     this.gunModel[32] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*   75 */     this.gunModel[33] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/*   76 */     this.gunModel[34] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*   77 */     this.gunModel[35] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[36] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[37] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[38] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[39] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*   82 */     this.gunModel[40] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*   83 */     this.gunModel[41] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*   84 */     this.gunModel[42] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/*   85 */     this.gunModel[43] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*   86 */     this.gunModel[44] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   87 */     this.gunModel[45] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/*   88 */     this.gunModel[46] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*   89 */     this.gunModel[47] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/*   90 */     this.gunModel[48] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[49] = new ModelRendererTurbo(this, 625, 33, this.textureX, this.textureY);
/*   92 */     this.gunModel[50] = new ModelRendererTurbo(this, 809, 25, this.textureX, this.textureY);
/*   93 */     this.gunModel[51] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*   94 */     this.gunModel[52] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*   95 */     this.gunModel[53] = new ModelRendererTurbo(this, 737, 33, this.textureX, this.textureY);
/*   96 */     this.gunModel[54] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*   97 */     this.gunModel[55] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*   98 */     this.gunModel[56] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[57] = new ModelRendererTurbo(this, 601, 49, this.textureX, this.textureY);
/*  100 */     this.gunModel[58] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  101 */     this.gunModel[59] = new ModelRendererTurbo(this, 777, 33, this.textureX, this.textureY);
/*  102 */     this.gunModel[60] = new ModelRendererTurbo(this, 921, 49, this.textureX, this.textureY);
/*  103 */     this.gunModel[61] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  104 */     this.gunModel[62] = new ModelRendererTurbo(this, 585, 41, this.textureX, this.textureY);
/*  105 */     this.gunModel[63] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*  106 */     this.gunModel[64] = new ModelRendererTurbo(this, 705, 1, this.textureX, this.textureY);
/*  107 */     this.gunModel[65] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*  108 */     this.gunModel[66] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  109 */     this.gunModel[67] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*  110 */     this.gunModel[68] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[69] = new ModelRendererTurbo(this, 697, 9, this.textureX, this.textureY);
/*  112 */     this.gunModel[70] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*  113 */     this.gunModel[71] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  114 */     this.gunModel[72] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[73] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  116 */     this.gunModel[74] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  117 */     this.gunModel[75] = new ModelRendererTurbo(this, 849, 41, this.textureX, this.textureY);
/*  118 */     this.gunModel[76] = new ModelRendererTurbo(this, 801, 49, this.textureX, this.textureY);
/*  119 */     this.gunModel[77] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/*  120 */     this.gunModel[78] = new ModelRendererTurbo(this, 649, 41, this.textureX, this.textureY);
/*  121 */     this.gunModel[79] = new ModelRendererTurbo(this, 705, 41, this.textureX, this.textureY);
/*  122 */     this.gunModel[80] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  123 */     this.gunModel[81] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  124 */     this.gunModel[82] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  125 */     this.gunModel[83] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  126 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  127 */     this.gunModel[85] = new ModelRendererTurbo(this, 593, 17, this.textureX, this.textureY);
/*  128 */     this.gunModel[86] = new ModelRendererTurbo(this, 1001, 49, this.textureX, this.textureY);
/*  129 */     this.gunModel[87] = new ModelRendererTurbo(this, 1001, 17, this.textureX, this.textureY);
/*  130 */     this.gunModel[88] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  131 */     this.gunModel[89] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  132 */     this.gunModel[90] = new ModelRendererTurbo(this, 849, 25, this.textureX, this.textureY);
/*  133 */     this.gunModel[91] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  134 */     this.gunModel[92] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/*  135 */     this.gunModel[93] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  136 */     this.gunModel[94] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  137 */     this.gunModel[95] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  138 */     this.gunModel[96] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*  139 */     this.gunModel[97] = new ModelRendererTurbo(this, 801, 33, this.textureX, this.textureY);
/*  140 */     this.gunModel[98] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*  141 */     this.gunModel[99] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/*  142 */     this.gunModel[100] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*  143 */     this.gunModel[101] = new ModelRendererTurbo(this, 577, 57, this.textureX, this.textureY);
/*  144 */     this.gunModel[102] = new ModelRendererTurbo(this, 609, 57, this.textureX, this.textureY);
/*  145 */     this.gunModel[103] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  146 */     this.gunModel[104] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/*  147 */     this.gunModel[105] = new ModelRendererTurbo(this, 625, 73, this.textureX, this.textureY);
/*  148 */     this.gunModel[106] = new ModelRendererTurbo(this, 809, 73, this.textureX, this.textureY);
/*  149 */     this.gunModel[107] = new ModelRendererTurbo(this, 625, 81, this.textureX, this.textureY);
/*  150 */     this.gunModel[108] = new ModelRendererTurbo(this, 809, 81, this.textureX, this.textureY);
/*  151 */     this.gunModel[109] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  152 */     this.gunModel[110] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*  153 */     this.gunModel[111] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/*  154 */     this.gunModel[112] = new ModelRendererTurbo(this, 993, 73, this.textureX, this.textureY);
/*  155 */     this.gunModel[113] = new ModelRendererTurbo(this, 785, 57, this.textureX, this.textureY);
/*  156 */     this.gunModel[114] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  157 */     this.gunModel[115] = new ModelRendererTurbo(this, 865, 57, this.textureX, this.textureY);
/*  158 */     this.gunModel[116] = new ModelRendererTurbo(this, 889, 57, this.textureX, this.textureY);
/*  159 */     this.gunModel[117] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  160 */     this.gunModel[118] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  161 */     this.gunModel[119] = new ModelRendererTurbo(this, 769, 33, this.textureX, this.textureY);
/*  162 */     this.gunModel[120] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  163 */     this.gunModel[121] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/*  164 */     this.gunModel[122] = new ModelRendererTurbo(this, 929, 17, this.textureX, this.textureY);
/*  165 */     this.gunModel[123] = new ModelRendererTurbo(this, 529, 57, this.textureX, this.textureY);
/*  166 */     this.gunModel[124] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*  167 */     this.gunModel[125] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/*  168 */     this.gunModel[126] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/*  169 */     this.gunModel[127] = new ModelRendererTurbo(this, 561, 57, this.textureX, this.textureY);
/*  170 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/*  171 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 73, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 665, 1, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 593, 89, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 905, 57, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 921, 57, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 9, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 937, 9, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 937, 17, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 593, 25, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 521, 17, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 17, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 577, 57, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 849, 57, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 849, 33, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*  202 */     this.gunModel[' '] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*  203 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 825, 49, this.textureX, this.textureY);
/*  204 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/*  205 */     this.gunModel['£'] = new ModelRendererTurbo(this, 809, 89, this.textureX, this.textureY);
/*  206 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 1009, 73, this.textureX, this.textureY);
/*  207 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 889, 57, this.textureX, this.textureY);
/*  208 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 825, 89, this.textureX, this.textureY);
/*  209 */     this.gunModel['§'] = new ModelRendererTurbo(this, 841, 89, this.textureX, this.textureY);
/*  210 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 857, 89, this.textureX, this.textureY);
/*  211 */     this.gunModel['©'] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  212 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 873, 89, this.textureX, this.textureY);
/*  213 */     this.gunModel['«'] = new ModelRendererTurbo(this, 889, 89, this.textureX, this.textureY);
/*  214 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 905, 89, this.textureX, this.textureY);
/*  215 */     this.gunModel['­'] = new ModelRendererTurbo(this, 921, 89, this.textureX, this.textureY);
/*  216 */     this.gunModel['®'] = new ModelRendererTurbo(this, 385, 97, this.textureX, this.textureY);
/*  217 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 465, 97, this.textureX, this.textureY);
/*  218 */     this.gunModel['°'] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  219 */     this.gunModel['±'] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/*  220 */     this.gunModel['²'] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/*  221 */     this.gunModel['³'] = new ModelRendererTurbo(this, 521, 57, this.textureX, this.textureY);
/*  222 */     this.gunModel['´'] = new ModelRendererTurbo(this, 993, 73, this.textureX, this.textureY);
/*  223 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/*  224 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/*  225 */     this.gunModel['·'] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/*  226 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 161, 65, this.textureX, this.textureY);
/*  227 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 1017, 65, this.textureX, this.textureY);
/*  228 */     this.gunModel['º'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  229 */     this.gunModel['»'] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  230 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/*  231 */     this.gunModel['½'] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/*  232 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/*  233 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/*  234 */     this.gunModel['À'] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/*  235 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/*  236 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  237 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 609, 89, this.textureX, this.textureY);
/*  238 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 601, 97, this.textureX, this.textureY);
/*  239 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 937, 89, this.textureX, this.textureY);
/*  240 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 737, 97, this.textureX, this.textureY);
/*  241 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 185, 89, this.textureX, this.textureY);
/*  242 */     this.gunModel['È'] = new ModelRendererTurbo(this, 785, 97, this.textureX, this.textureY);
/*  243 */     this.gunModel['É'] = new ModelRendererTurbo(this, 993, 97, this.textureX, this.textureY);
/*  244 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  245 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 33, 105, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/*  247 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  248 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 113, 105, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 977, 89, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 297, 105, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 585, 97, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 321, 105, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 329, 105, this.textureX, this.textureY);
/*  255 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 465, 105, this.textureX, this.textureY);
/*  257 */     this.gunModel['×'] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  261 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 505, 105, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 513, 105, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 521, 105, this.textureX, this.textureY);
/*  264 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 529, 105, this.textureX, this.textureY);
/*  265 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 537, 105, this.textureX, this.textureY);
/*  266 */     this.gunModel['à'] = new ModelRendererTurbo(this, 545, 105, this.textureX, this.textureY);
/*  267 */     this.gunModel['á'] = new ModelRendererTurbo(this, 553, 105, this.textureX, this.textureY);
/*  268 */     this.gunModel['â'] = new ModelRendererTurbo(this, 561, 105, this.textureX, this.textureY);
/*  269 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 977, 97, this.textureX, this.textureY);
/*  270 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 817, 105, this.textureX, this.textureY);
/*  271 */     this.gunModel['å'] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/*  272 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  273 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 745, 113, this.textureX, this.textureY);
/*  274 */     this.gunModel['è'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  275 */     this.gunModel['é'] = new ModelRendererTurbo(this, 489, 113, this.textureX, this.textureY);
/*  276 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 569, 105, this.textureX, this.textureY);
/*  277 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 745, 105, this.textureX, this.textureY);
/*  278 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 969, 105, this.textureX, this.textureY);
/*  279 */     this.gunModel['í'] = new ModelRendererTurbo(this, 873, 105, this.textureX, this.textureY);
/*  280 */     this.gunModel['î'] = new ModelRendererTurbo(this, 889, 105, this.textureX, this.textureY);
/*  281 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 593, 105, this.textureX, this.textureY);
/*  282 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 777, 105, this.textureX, this.textureY);
/*  283 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/*  284 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 1009, 105, this.textureX, this.textureY);
/*  285 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  286 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 537, 113, this.textureX, this.textureY);
/*  287 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 1017, 105, this.textureX, this.textureY);
/*  288 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 553, 113, this.textureX, this.textureY);
/*  289 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 561, 113, this.textureX, this.textureY);
/*  290 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 593, 113, this.textureX, this.textureY);
/*  291 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 889, 113, this.textureX, this.textureY);
/*  292 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  293 */     this.gunModel['û'] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/*  294 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 953, 113, this.textureX, this.textureY);
/*  295 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 937, 113, this.textureX, this.textureY);
/*  296 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/*  297 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1001, 113, this.textureX, this.textureY);
/*  298 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 129, 121, this.textureX, this.textureY);
/*  299 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  301 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 1009, 113, this.textureX, this.textureY);
/*  303 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 849, 49, this.textureX, this.textureY);
/*  305 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 257, 121, this.textureX, this.textureY);
/*  307 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/*  309 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 313, 121, this.textureX, this.textureY);
/*  310 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/*  311 */     this.gunModel['č'] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 801, 65, this.textureX, this.textureY);
/*  313 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 809, 65, this.textureX, this.textureY);
/*  314 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 905, 65, this.textureX, this.textureY);
/*  315 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 913, 65, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  317 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 993, 81, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/*  321 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 593, 89, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 889, 89, this.textureX, this.textureY);
/*  323 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 905, 89, this.textureX, this.textureY);
/*  324 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 921, 89, this.textureX, this.textureY);
/*  325 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 937, 97, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 601, 105, this.textureX, this.textureY);
/*  327 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 737, 105, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/*  329 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 529, 113, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 377, 121, this.textureX, this.textureY);
/*  331 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 401, 121, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 425, 121, this.textureX, this.textureY);
/*  333 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 441, 121, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/*  335 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 41, 121, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/*  337 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 537, 121, this.textureX, this.textureY);
/*  339 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 545, 121, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 593, 121, this.textureX, this.textureY);
/*  341 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 609, 121, this.textureX, this.textureY);
/*  343 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 641, 121, this.textureX, this.textureY);
/*  344 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 649, 121, this.textureX, this.textureY);
/*  345 */     this.gunModel['į'] = new ModelRendererTurbo(this, 657, 121, this.textureX, this.textureY);
/*  346 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 665, 121, this.textureX, this.textureY);
/*  347 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 673, 121, this.textureX, this.textureY);
/*  348 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 689, 121, this.textureX, this.textureY);
/*  349 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 713, 121, this.textureX, this.textureY);
/*  350 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 745, 121, this.textureX, this.textureY);
/*  351 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 761, 41, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 409, 241, this.textureX, this.textureY);
/*  353 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 529, 241, this.textureX, this.textureY);
/*  354 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 33, 249, this.textureX, this.textureY);
/*  355 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 777, 313, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 361, 321, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  358 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 993, 129, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 793, 161, this.textureX, this.textureY);
/*  360 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 841, 161, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 1017, 129, this.textureX, this.textureY);
/*  362 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 129, 121, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 801, 121, this.textureX, this.textureY);
/*  364 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 889, 161, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 153, 137, this.textureX, this.textureY);
/*  366 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 729, 129, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/*  368 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 417, 177, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/*  370 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 969, 145, this.textureX, this.textureY);
/*  371 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 193, 153, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 985, 161, this.textureX, this.textureY);
/*  373 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 937, 161, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 193, 161, this.textureX, this.textureY);
/*  375 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 529, 137, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 9, 153, this.textureX, this.textureY);
/*  377 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 489, 145, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 505, 153, this.textureX, this.textureY);
/*  379 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 769, 161, this.textureX, this.textureY);
/*  380 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 817, 161, this.textureX, this.textureY);
/*  381 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 417, 161, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 441, 161, this.textureX, this.textureY);
/*  383 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 473, 161, this.textureX, this.textureY);
/*      */     
/*  385 */     this.gunModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  386 */     this.gunModel[0].setRotationPoint(13.5F, -35.75F, -12.0F);
/*      */     
/*  388 */     this.gunModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 46, 15, 16, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  389 */     this.gunModel[1].setRotationPoint(-80.5F, -20.75F, -15.0F);
/*      */     
/*  391 */     this.gunModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 20, 15, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  392 */     this.gunModel[2].setRotationPoint(-34.5F, -20.75F, -15.0F);
/*      */     
/*  394 */     this.gunModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  395 */     this.gunModel[3].setRotationPoint(-26.5F, -7.75F, -15.0F);
/*      */     
/*  397 */     this.gunModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 8, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  398 */     this.gunModel[4].setRotationPoint(-25.5F, -5.75F, -11.0F);
/*      */     
/*  400 */     this.gunModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  401 */     this.gunModel[5].setRotationPoint(-17.5F, -7.75F, -15.0F);
/*      */     
/*  403 */     this.gunModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  404 */     this.gunModel[6].setRotationPoint(-16.5F, -7.75F, -15.0F);
/*      */     
/*  406 */     this.gunModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 34, 7, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  407 */     this.gunModel[7].setRotationPoint(-14.5F, -20.75F, -15.0F);
/*      */     
/*  409 */     this.gunModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 82, 7, 7, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/*  410 */     this.gunModel[8].setRotationPoint(17.0F, -23.75F, -10.5F);
/*      */     
/*  412 */     this.gunModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 1, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  413 */     this.gunModel[9].setRotationPoint(93.75F, -41.75F, -7.5F);
/*      */     
/*  415 */     this.gunModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  416 */     this.gunModel[10].setRotationPoint(-25.5F, -0.75F, -11.0F);
/*      */     
/*  418 */     this.gunModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  419 */     this.gunModel[11].setRotationPoint(-25.5F, 1.25F, -11.0F);
/*      */     
/*  421 */     this.gunModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  422 */     this.gunModel[12].setRotationPoint(-25.5F, -7.75F, -15.0F);
/*      */     
/*  424 */     this.gunModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  425 */     this.gunModel[13].setRotationPoint(-20.5F, -0.75F, -9.0F);
/*      */     
/*  427 */     this.gunModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  428 */     this.gunModel[14].setRotationPoint(-21.0F, 1.25F, -9.0F);
/*      */     
/*  430 */     this.gunModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  431 */     this.gunModel[15].setRotationPoint(-21.0F, 2.25F, -9.0F);
/*      */     
/*  433 */     this.gunModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  434 */     this.gunModel[16].setRotationPoint(-19.0F, 3.25F, -9.0F);
/*      */     
/*  436 */     this.gunModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  437 */     this.gunModel[17].setRotationPoint(-19.0F, 4.25F, -9.0F);
/*      */     
/*  439 */     this.gunModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  440 */     this.gunModel[18].setRotationPoint(-23.0F, -6.75F, -9.0F);
/*      */     
/*  442 */     this.gunModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 1, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  443 */     this.gunModel[19].setRotationPoint(-26.0F, -6.75F, -9.5F);
/*      */     
/*  445 */     this.gunModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/*  446 */     this.gunModel[20].setRotationPoint(-26.0F, 5.25F, -9.5F);
/*      */     
/*  448 */     this.gunModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 20, 1, 5, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  449 */     this.gunModel[21].setRotationPoint(-45.75F, 7.25F, -9.5F);
/*      */     
/*  451 */     this.gunModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  452 */     this.gunModel[22].setRotationPoint(-47.5F, 5.25F, -9.5F);
/*      */     
/*  454 */     this.gunModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  455 */     this.gunModel[23].setRotationPoint(-47.75F, 1.25F, -9.5F);
/*      */     
/*  457 */     this.gunModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 26, 5, 12, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  458 */     this.gunModel[24].setRotationPoint(-72.5F, -6.75F, -13.0F);
/*      */     
/*  460 */     this.gunModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 24, 3, 12, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  461 */     this.gunModel[25].setRotationPoint(-71.5F, -1.75F, -13.0F);
/*      */     
/*  463 */     this.gunModel[26].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/*  464 */     this.gunModel[26].setRotationPoint(-71.5F, 1.25F, -13.0F);
/*      */     
/*  466 */     this.gunModel[27].addShapeBox(59.0F, -19.0F, 7.0F, 24, 1, 12, 0.0F, -1.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  467 */     this.gunModel[27].setRotationPoint(-71.5F, 3.25F, -13.0F);
/*      */     
/*  469 */     this.gunModel[28].addShapeBox(59.0F, -19.0F, 7.0F, 22, 1, 12, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/*  470 */     this.gunModel[28].setRotationPoint(-71.5F, 4.25F, -13.0F);
/*      */     
/*  472 */     this.gunModel[29].addShapeBox(59.0F, -19.0F, 7.0F, 22, 2, 12, 0.0F, -1.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  473 */     this.gunModel[29].setRotationPoint(-71.5F, 5.25F, -13.0F);
/*      */     
/*  475 */     this.gunModel[30].addShapeBox(59.0F, -19.0F, 7.0F, 22, 21, 12, 0.0F, -1.5F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 6.0F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, 6.0F, -0.25F, 0.0F);
/*  476 */     this.gunModel[30].setRotationPoint(-71.5F, 7.25F, -13.0F);
/*      */     
/*  478 */     this.gunModel[31].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  479 */     this.gunModel[31].setRotationPoint(-79.0F, 28.25F, -13.0F);
/*      */     
/*  481 */     this.gunModel[32].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F);
/*  482 */     this.gunModel[32].setRotationPoint(-79.0F, 30.25F, -13.0F);
/*      */     
/*  484 */     this.gunModel[33].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 12, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/*  485 */     this.gunModel[33].setRotationPoint(-79.0F, 32.25F, -13.0F);
/*      */     
/*  487 */     this.gunModel[34].addShapeBox(59.0F, -19.0F, 7.0F, 15, 1, 12, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/*  488 */     this.gunModel[34].setRotationPoint(-76.0F, 34.25F, -13.0F);
/*      */     
/*  490 */     this.gunModel[35].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  491 */     this.gunModel[35].setRotationPoint(-44.0F, -7.25F, -8.5F);
/*      */     
/*  493 */     this.gunModel[36].addShapeBox(59.0F, -19.0F, 7.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  494 */     this.gunModel[36].setRotationPoint(-44.0F, -6.25F, -8.5F);
/*      */     
/*  496 */     this.gunModel[37].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  497 */     this.gunModel[37].setRotationPoint(-43.75F, -5.25F, -8.5F);
/*      */     
/*  499 */     this.gunModel[38].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  500 */     this.gunModel[38].setRotationPoint(-43.75F, -4.25F, -8.5F);
/*      */     
/*  502 */     this.gunModel[39].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  503 */     this.gunModel[39].setRotationPoint(-43.75F, -3.25F, -8.5F);
/*      */     
/*  505 */     this.gunModel[40].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  506 */     this.gunModel[40].setRotationPoint(-43.75F, -2.25F, -8.5F);
/*      */     
/*  508 */     this.gunModel[41].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 3, 0.0F, -1.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/*  509 */     this.gunModel[41].setRotationPoint(-43.75F, -0.25F, -8.5F);
/*      */     
/*  511 */     this.gunModel[42].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 3, 0.0F, -2.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -5.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F);
/*  512 */     this.gunModel[42].setRotationPoint(-42.75F, 2.75F, -8.5F);
/*      */     
/*  514 */     this.gunModel[43].addShapeBox(59.0F, -19.0F, 7.0F, 79, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  515 */     this.gunModel[43].setRotationPoint(-82.5F, -21.75F, 1.0F);
/*      */     
/*  517 */     this.gunModel[44].addShapeBox(59.0F, -19.0F, 7.0F, 79, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  518 */     this.gunModel[44].setRotationPoint(-82.5F, -24.75F, 1.0F);
/*      */     
/*  520 */     this.gunModel[45].addShapeBox(59.0F, -19.0F, 7.0F, 17, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  521 */     this.gunModel[45].setRotationPoint(-3.5F, -24.75F, -1.0F);
/*      */     
/*  523 */     this.gunModel[46].addShapeBox(59.0F, -19.0F, 7.0F, 26, 3, 17, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  524 */     this.gunModel[46].setRotationPoint(-82.5F, -24.75F, -16.0F);
/*      */     
/*  526 */     this.gunModel[47].addShapeBox(59.0F, -19.0F, 7.0F, 23, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  527 */     this.gunModel[47].setRotationPoint(-82.5F, -21.75F, -16.0F);
/*      */     
/*  529 */     this.gunModel[48].addShapeBox(59.0F, -19.0F, 7.0F, 93, 2, 2, 0.0F, -2.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  530 */     this.gunModel[48].setRotationPoint(-79.5F, -26.75F, 0.0F);
/*      */     
/*  532 */     this.gunModel[49].addShapeBox(59.0F, -19.0F, 7.0F, 55, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -1.0F, 0.5F, 0.5F, -2.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  533 */     this.gunModel[49].setRotationPoint(-79.5F, -26.75F, -16.0F);
/*      */     
/*  535 */     this.gunModel[50].addShapeBox(59.0F, -19.0F, 7.0F, 10, 2, 14, 0.0F, -2.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  536 */     this.gunModel[50].setRotationPoint(-79.5F, -26.75F, -14.0F);
/*      */     
/*  538 */     this.gunModel[51].addShapeBox(59.0F, -19.0F, 7.0F, 91, 4, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/*  539 */     this.gunModel[51].setRotationPoint(-77.5F, -31.75F, -3.0F);
/*      */     
/*  541 */     this.gunModel[52].addShapeBox(59.0F, -19.0F, 7.0F, 52, 4, 3, 0.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  542 */     this.gunModel[52].setRotationPoint(-77.5F, -31.75F, -14.0F);
/*      */     
/*  544 */     this.gunModel[53].addShapeBox(59.0F, -19.0F, 7.0F, 8, 4, 8, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  545 */     this.gunModel[53].setRotationPoint(-77.5F, -31.75F, -11.0F);
/*      */     
/*  547 */     this.gunModel[54].addShapeBox(59.0F, -19.0F, 7.0F, 87, 3, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[54].setRotationPoint(-73.5F, -34.75F, -5.0F);
/*      */     
/*  550 */     this.gunModel[55].addShapeBox(59.0F, -19.0F, 7.0F, 87, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[55].setRotationPoint(-73.5F, -34.75F, -12.0F);
/*      */     
/*  553 */     this.gunModel[56].addShapeBox(59.0F, -19.0F, 7.0F, 87, 3, 4, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  554 */     this.gunModel[56].setRotationPoint(-73.5F, -34.75F, -9.0F);
/*      */     
/*  556 */     this.gunModel[57].addShapeBox(59.0F, -19.0F, 7.0F, 84, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  557 */     this.gunModel[57].setRotationPoint(-70.5F, -35.75F, -9.0F);
/*      */     
/*  559 */     this.gunModel[58].addShapeBox(59.0F, -19.0F, 7.0F, 84, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[58].setRotationPoint(-70.5F, -35.75F, -7.0F);
/*      */     
/*  562 */     this.gunModel[59].addShapeBox(59.0F, -19.0F, 7.0F, 6, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  563 */     this.gunModel[59].setRotationPoint(13.5F, -32.25F, -12.0F);
/*      */     
/*  565 */     this.gunModel[60].addShapeBox(59.0F, -19.0F, 7.0F, 31, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  566 */     this.gunModel[60].setRotationPoint(-59.5F, -24.75F, -15.0F);
/*      */     
/*  568 */     this.gunModel[61].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[61].setRotationPoint(-57.5F, -24.75F, -17.0F);
/*      */     
/*  571 */     this.gunModel[62].addShapeBox(59.0F, -19.0F, 7.0F, 30, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  572 */     this.gunModel[62].setRotationPoint(-55.5F, -24.75F, -17.0F);
/*      */     
/*  574 */     this.gunModel[63].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[63].setRotationPoint(-67.5F, -14.75F, -15.75F);
/*      */     
/*  577 */     this.gunModel[64].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[64].setRotationPoint(-64.5F, -17.75F, -15.75F);
/*      */     
/*  580 */     this.gunModel[65].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[65].setRotationPoint(-67.5F, -17.75F, -15.75F);
/*      */     
/*  583 */     this.gunModel[66].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  584 */     this.gunModel[66].setRotationPoint(-67.5F, -11.75F, -15.75F);
/*      */     
/*  586 */     this.gunModel[67].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  587 */     this.gunModel[67].setRotationPoint(-64.5F, -11.75F, -15.75F);
/*      */     
/*  589 */     this.gunModel[68].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  590 */     this.gunModel[68].setRotationPoint(-61.5F, -11.75F, -15.75F);
/*      */     
/*  592 */     this.gunModel[69].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[69].setRotationPoint(-61.5F, -14.75F, -15.75F);
/*      */     
/*  595 */     this.gunModel[70].addShapeBox(59.0F, -19.0F, 7.0F, 21, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[70].setRotationPoint(-58.5F, -16.75F, -15.75F);
/*      */     
/*  598 */     this.gunModel[71].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  599 */     this.gunModel[71].setRotationPoint(-61.5F, -17.75F, -15.75F);
/*      */     
/*  601 */     this.gunModel[72].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  602 */     this.gunModel[72].setRotationPoint(-65.0F, -14.25F, -16.0F);
/*      */     
/*  604 */     this.gunModel[73].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[73].setRotationPoint(-65.0F, -15.25F, -16.0F);
/*      */     
/*  607 */     this.gunModel[74].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  608 */     this.gunModel[74].setRotationPoint(-65.0F, -12.75F, -16.0F);
/*      */     
/*  610 */     this.gunModel[75].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, -1.35F, 2.0F, 0.0F, -1.35F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  611 */     this.gunModel[75].setRotationPoint(-25.5F, -29.75F, -14.0F);
/*      */     
/*  613 */     this.gunModel[76].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -1.0F, 6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 1.0F, 0.0F, -0.35F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[76].setRotationPoint(-25.5F, -31.75F, -13.0F);
/*      */     
/*  616 */     this.gunModel[77].addShapeBox(59.0F, -19.0F, 7.0F, 52, 2, 13, 0.0F, -1.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  617 */     this.gunModel[77].setRotationPoint(-77.5F, -26.75F, -14.0F);
/*      */     
/*  619 */     this.gunModel[78].addShapeBox(59.0F, -19.0F, 7.0F, 28, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[78].setRotationPoint(-55.5F, -24.75F, -16.0F);
/*      */     
/*  622 */     this.gunModel[79].addShapeBox(59.0F, -19.0F, 7.0F, 9, 3, 4, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[79].setRotationPoint(-80.0F, -30.75F, -9.0F);
/*      */     
/*  625 */     this.gunModel[80].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[80].setRotationPoint(-77.5F, -16.75F, -15.5F);
/*      */     
/*  628 */     this.gunModel[81].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[81].setRotationPoint(-67.5F, -8.75F, -15.5F);
/*      */     
/*  631 */     this.gunModel[82].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  632 */     this.gunModel[82].setRotationPoint(-33.5F, -12.75F, -15.5F);
/*      */     
/*  634 */     this.gunModel[83].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[83].setRotationPoint(-33.5F, -17.75F, -15.5F);
/*      */     
/*  637 */     this.gunModel[84].addShapeBox(59.0F, -19.0F, 7.0F, 18, 4, 1, 0.0F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[84].setRotationPoint(-55.5F, -20.75F, -16.0F);
/*      */     
/*  640 */     this.gunModel[85].addShapeBox(59.0F, -19.0F, 7.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, -2.0F, -0.5F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[85].setRotationPoint(-37.5F, -20.75F, -16.0F);
/*      */     
/*  643 */     this.gunModel[86].addShapeBox(59.0F, -19.0F, 7.0F, 8, 7, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 1.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.25F, -0.25F, -0.25F);
/*  644 */     this.gunModel[86].setRotationPoint(91.5F, -38.75F, -9.5F);
/*      */     
/*  646 */     this.gunModel[87].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -1.25F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, 1.0F, -1.25F, -0.25F, 1.0F, -0.75F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F);
/*  647 */     this.gunModel[87].setRotationPoint(91.5F, -39.75F, -6.5F);
/*      */     
/*  649 */     this.gunModel[88].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/*  650 */     this.gunModel[88].setRotationPoint(91.5F, -41.75F, -5.0F);
/*      */     
/*  652 */     this.gunModel[89].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -3.0F, 0.25F, 0.75F, -0.75F, 0.25F, 0.75F, -0.75F, 0.25F, -1.25F, -3.0F, 0.25F, -1.25F, -2.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  653 */     this.gunModel[89].setRotationPoint(91.5F, -42.75F, -5.25F);
/*      */     
/*  655 */     this.gunModel[90].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -1.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F);
/*  656 */     this.gunModel[90].setRotationPoint(91.5F, -40.75F, -5.25F);
/*      */     
/*  658 */     this.gunModel[91].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/*  659 */     this.gunModel[91].setRotationPoint(93.75F, -39.75F, -7.5F);
/*      */     
/*  661 */     this.gunModel[92].addShapeBox(59.0F, -19.0F, 7.0F, 8, 7, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 1.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.25F, -0.25F, -0.25F);
/*  662 */     this.gunModel[92].setRotationPoint(91.5F, -38.75F, -6.5F);
/*      */     
/*  664 */     this.gunModel[93].addShapeBox(59.0F, -19.0F, 7.0F, 7, 7, 2, 0.0F, -1.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F);
/*  665 */     this.gunModel[93].setRotationPoint(91.5F, -38.75F, -8.0F);
/*      */     
/*  667 */     this.gunModel[94].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/*  668 */     this.gunModel[94].setRotationPoint(94.0F, -34.75F, -9.5F);
/*      */     
/*  670 */     this.gunModel[95].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  671 */     this.gunModel[95].setRotationPoint(94.0F, -35.75F, -9.5F);
/*      */     
/*  673 */     this.gunModel[96].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 5, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  674 */     this.gunModel[96].setRotationPoint(94.0F, -36.75F, -9.5F);
/*      */     
/*  676 */     this.gunModel[97].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -1.25F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, -1.5F, -1.25F, -0.25F, -1.5F, -0.75F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F);
/*  677 */     this.gunModel[97].setRotationPoint(91.5F, -39.75F, -9.5F);
/*      */     
/*  679 */     this.gunModel[98].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -2.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/*  680 */     this.gunModel[98].setRotationPoint(91.5F, -41.75F, -11.0F);
/*      */     
/*  682 */     this.gunModel[99].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -3.0F, 0.25F, -1.25F, -0.75F, 0.25F, -1.25F, -0.75F, 0.25F, 0.75F, -3.0F, 0.25F, 0.75F, -2.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F);
/*  683 */     this.gunModel[99].setRotationPoint(91.5F, -42.75F, -10.75F);
/*      */     
/*  685 */     this.gunModel[100].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F);
/*  686 */     this.gunModel[100].setRotationPoint(91.5F, -40.75F, -10.75F);
/*      */     
/*  688 */     this.gunModel[101].addShapeBox(59.0F, -19.0F, 7.0F, 9, 15, 11, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  689 */     this.gunModel[101].setRotationPoint(-89.5F, -20.75F, -13.0F);
/*      */     
/*  691 */     this.gunModel[102].addShapeBox(59.0F, -19.0F, 7.0F, 88, 7, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  692 */     this.gunModel[102].setRotationPoint(-177.5F, -18.75F, -11.0F);
/*      */     
/*  694 */     this.gunModel[103].addShapeBox(59.0F, -19.0F, 7.0F, 88, 4, 8, 0.0F, -0.5F, -2.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, -0.5F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  695 */     this.gunModel[103].setRotationPoint(-177.5F, -19.75F, -11.0F);
/*      */     
/*  697 */     this.gunModel[104].addShapeBox(59.0F, -19.0F, 7.0F, 88, 7, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  698 */     this.gunModel[104].setRotationPoint(-177.5F, -18.75F, -5.0F);
/*      */     
/*  700 */     this.gunModel[105].addShapeBox(59.0F, -19.0F, 7.0F, 88, 2, 2, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  701 */     this.gunModel[105].setRotationPoint(-177.5F, -13.75F, -11.0F);
/*      */     
/*  703 */     this.gunModel[106].addShapeBox(59.0F, -19.0F, 7.0F, 88, 2, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  704 */     this.gunModel[106].setRotationPoint(-177.5F, -13.75F, -5.0F);
/*      */     
/*  706 */     this.gunModel[107].addShapeBox(59.0F, -19.0F, 7.0F, 88, 6, 2, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 21.0F, 0.0F, 0.0F, 21.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  707 */     this.gunModel[107].setRotationPoint(-177.5F, 14.25F, -11.0F);
/*      */     
/*  709 */     this.gunModel[108].addShapeBox(59.0F, -19.0F, 7.0F, 88, 5, 2, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, 21.0F, -0.5F, 0.0F, 21.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  710 */     this.gunModel[108].setRotationPoint(-177.5F, 12.25F, -11.0F);
/*      */     
/*  712 */     this.gunModel[109].addShapeBox(59.0F, -19.0F, 7.0F, 88, 1, 8, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, 21.0F, -2.0F, 0.0F, 21.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  713 */     this.gunModel[109].setRotationPoint(-177.5F, 19.25F, -11.0F);
/*      */     
/*  715 */     this.gunModel[110].addShapeBox(59.0F, -19.0F, 7.0F, 88, 6, 2, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 21.0F, 0.0F, 0.0F, 21.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  716 */     this.gunModel[110].setRotationPoint(-177.5F, 14.25F, -5.0F);
/*      */     
/*  718 */     this.gunModel[111].addShapeBox(59.0F, -19.0F, 7.0F, 88, 5, 2, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 21.0F, 0.0F, 0.0F, 21.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  719 */     this.gunModel[111].setRotationPoint(-177.5F, 12.25F, -5.0F);
/*      */     
/*  721 */     this.gunModel[112].addShapeBox(59.0F, -19.0F, 7.0F, 2, 11, 11, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F);
/*  722 */     this.gunModel[112].setRotationPoint(-183.5F, -11.75F, -12.5F);
/*      */     
/*  724 */     this.gunModel[113].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F);
/*  725 */     this.gunModel[113].setRotationPoint(-183.5F, 19.25F, -12.5F);
/*      */     
/*  727 */     this.gunModel[114].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -5.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -5.0F);
/*  728 */     this.gunModel[114].setRotationPoint(-183.5F, 22.25F, -12.5F);
/*      */     
/*  730 */     this.gunModel[115].addShapeBox(59.0F, -19.0F, 7.0F, 2, 8, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  731 */     this.gunModel[115].setRotationPoint(-182.5F, -0.75F, -7.5F);
/*      */     
/*  733 */     this.gunModel[116].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  734 */     this.gunModel[116].setRotationPoint(-183.5F, -15.75F, -12.5F);
/*      */     
/*  736 */     this.gunModel[117].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 11, 0.0F, -1.0F, 0.0F, -4.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, -2.5F, -1.0F, 0.0F, -4.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F);
/*  737 */     this.gunModel[117].setRotationPoint(-183.5F, -17.75F, -12.5F);
/*      */     
/*  739 */     this.gunModel[118].addShapeBox(59.0F, -19.0F, 7.0F, 4, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F);
/*  740 */     this.gunModel[118].setRotationPoint(-181.5F, 22.25F, -12.5F);
/*      */     
/*  742 */     this.gunModel[119].addShapeBox(59.0F, -19.0F, 7.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel[119].setRotationPoint(-181.5F, 19.25F, -12.5F);
/*      */     
/*  745 */     this.gunModel[120].addShapeBox(59.0F, -19.0F, 7.0F, 4, 12, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  746 */     this.gunModel[120].setRotationPoint(-181.5F, 7.25F, -12.5F);
/*      */     
/*  748 */     this.gunModel[121].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  749 */     this.gunModel[121].setRotationPoint(-180.5F, -0.75F, -12.5F);
/*      */     
/*  751 */     this.gunModel[122].addShapeBox(59.0F, -19.0F, 7.0F, 1, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  752 */     this.gunModel[122].setRotationPoint(-176.5F, -0.75F, -12.5F);
/*      */     
/*  754 */     this.gunModel[123].addShapeBox(59.0F, -19.0F, 7.0F, 4, 11, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  755 */     this.gunModel[123].setRotationPoint(-181.5F, -11.75F, -12.5F);
/*      */     
/*  757 */     this.gunModel[124].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  758 */     this.gunModel[124].setRotationPoint(-181.5F, -15.75F, -12.5F);
/*      */     
/*  760 */     this.gunModel[125].addShapeBox(59.0F, -19.0F, 7.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  761 */     this.gunModel[125].setRotationPoint(-181.5F, 19.25F, -5.5F);
/*      */     
/*  763 */     this.gunModel[126].addShapeBox(59.0F, -19.0F, 7.0F, 4, 12, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[126].setRotationPoint(-181.5F, 7.25F, -5.5F);
/*      */     
/*  766 */     this.gunModel[127].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel[127].setRotationPoint(-180.5F, -0.75F, -5.5F);
/*      */     
/*  769 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel[''].setRotationPoint(-176.5F, -0.75F, -5.5F);
/*      */     
/*  772 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 11, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel[''].setRotationPoint(-181.5F, -11.75F, -5.5F);
/*      */     
/*  775 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel[''].setRotationPoint(-181.5F, -15.75F, -5.5F);
/*      */     
/*  778 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 2, 11, 0.0F, -1.0F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  779 */     this.gunModel[''].setRotationPoint(-181.5F, -17.75F, -12.5F);
/*      */     
/*  781 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  782 */     this.gunModel[''].setRotationPoint(-3.5F, -24.75F, 1.0F);
/*      */     
/*  784 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  785 */     this.gunModel[''].setRotationPoint(-3.5F, -23.75F, 1.0F);
/*      */     
/*  787 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  788 */     this.gunModel[''].setRotationPoint(-83.75F, -20.75F, -2.5F);
/*      */     
/*  790 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  791 */     this.gunModel[''].setRotationPoint(-83.75F, -14.75F, -2.5F);
/*      */     
/*  793 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  794 */     this.gunModel[''].setRotationPoint(-83.75F, -7.75F, -2.5F);
/*      */     
/*  796 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  797 */     this.gunModel[''].setRotationPoint(-83.25F, -17.75F, -2.0F);
/*      */     
/*  799 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  800 */     this.gunModel[''].setRotationPoint(-83.25F, -10.75F, -2.0F);
/*      */     
/*  802 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  803 */     this.gunModel[''].setRotationPoint(-89.0F, -19.75F, -2.5F);
/*      */     
/*  805 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel[''].setRotationPoint(-89.0F, -18.75F, -2.5F);
/*      */     
/*  808 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel[''].setRotationPoint(-89.0F, -20.75F, -2.5F);
/*      */     
/*  811 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  812 */     this.gunModel[''].setRotationPoint(-89.0F, -4.75F, -2.5F);
/*      */     
/*  814 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  815 */     this.gunModel[''].setRotationPoint(-89.0F, -3.75F, -2.5F);
/*      */     
/*  817 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel[''].setRotationPoint(-89.0F, -5.75F, -2.5F);
/*      */     
/*  820 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  821 */     this.gunModel[''].setRotationPoint(-87.0F, -8.0F, -2.5F);
/*      */     
/*  823 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  824 */     this.gunModel[''].setRotationPoint(-87.0F, -9.0F, -2.5F);
/*      */     
/*  826 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  827 */     this.gunModel[''].setRotationPoint(-87.0F, -14.5F, -2.0F);
/*      */     
/*  829 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  830 */     this.gunModel[''].setRotationPoint(-87.0F, -15.0F, -2.5F);
/*      */     
/*  832 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  833 */     this.gunModel[''].setRotationPoint(-87.0F, -16.0F, -2.5F);
/*      */     
/*  835 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 7, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  836 */     this.gunModel[''].setRotationPoint(-91.5F, -19.75F, -13.0F);
/*      */     
/*  838 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 7, 3, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel[''].setRotationPoint(-91.5F, -9.75F, -13.0F);
/*      */     
/*  841 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  842 */     this.gunModel[''].setRotationPoint(-93.5F, -12.75F, -13.0F);
/*      */     
/*  844 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel[''].setRotationPoint(-91.0F, -12.25F, -13.5F);
/*      */     
/*  847 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel[''].setRotationPoint(-91.0F, -11.25F, -13.5F);
/*      */     
/*  850 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel[''].setRotationPoint(-91.0F, -13.25F, -13.5F);
/*      */     
/*  853 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  854 */     this.gunModel[''].setRotationPoint(-90.0F, -12.25F, -14.0F);
/*      */     
/*  856 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 11, 1, 1, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  857 */     this.gunModel[''].setRotationPoint(-95.0F, -12.25F, -15.0F);
/*      */     
/*  859 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 1.75F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  860 */     this.gunModel[''].setRotationPoint(-84.25F, -11.25F, -15.0F);
/*      */     
/*  862 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.75F, -1.0F, 0.0F, -1.75F, -1.0F, 0.0F, -1.75F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F);
/*  863 */     this.gunModel[''].setRotationPoint(-94.0F, -11.25F, -15.0F);
/*      */     
/*  865 */     this.gunModel[' '].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  866 */     this.gunModel[' '].setRotationPoint(-95.75F, -10.75F, -15.0F);
/*      */     
/*  868 */     this.gunModel['¡'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel['¡'].setRotationPoint(-84.25F, -10.75F, -15.0F);
/*      */     
/*  871 */     this.gunModel['¢'].addShapeBox(59.0F, -19.0F, 7.0F, 12, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel['¢'].setRotationPoint(-95.75F, -7.75F, -15.0F);
/*      */     
/*  874 */     this.gunModel['£'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 12, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel['£'].setRotationPoint(-181.5F, 7.25F, -10.5F);
/*      */     
/*  877 */     this.gunModel['¤'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  878 */     this.gunModel['¤'].setRotationPoint(-180.5F, -0.75F, -10.5F);
/*      */     
/*  880 */     this.gunModel['¥'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel['¥'].setRotationPoint(-176.5F, -0.75F, -10.5F);
/*      */     
/*  883 */     this.gunModel['¦'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 11, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  884 */     this.gunModel['¦'].setRotationPoint(-181.5F, -11.75F, -10.5F);
/*      */     
/*  886 */     this.gunModel['§'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 12, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  887 */     this.gunModel['§'].setRotationPoint(-181.5F, 7.25F, -3.5F);
/*      */     
/*  889 */     this.gunModel['¨'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  890 */     this.gunModel['¨'].setRotationPoint(-180.5F, -0.75F, -3.5F);
/*      */     
/*  892 */     this.gunModel['©'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  893 */     this.gunModel['©'].setRotationPoint(-176.5F, -0.75F, -3.5F);
/*      */     
/*  895 */     this.gunModel['ª'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 11, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  896 */     this.gunModel['ª'].setRotationPoint(-181.5F, -11.75F, -3.5F);
/*      */     
/*  898 */     this.gunModel['«'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 8, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  899 */     this.gunModel['«'].setRotationPoint(-182.5F, -0.75F, -12.5F);
/*      */     
/*  901 */     this.gunModel['¬'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 12, 5, 0.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  902 */     this.gunModel['¬'].setRotationPoint(-183.5F, 7.25F, -12.5F);
/*      */     
/*  904 */     this.gunModel['­'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 12, 5, 0.0F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  905 */     this.gunModel['­'].setRotationPoint(-183.5F, 7.25F, -6.5F);
/*      */     
/*  907 */     this.gunModel['®'].addShapeBox(59.0F, -19.0F, 7.0F, 36, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  908 */     this.gunModel['®'].setRotationPoint(43.5F, -24.75F, -3.0F);
/*      */     
/*  910 */     this.gunModel['¯'].addShapeBox(59.0F, -19.0F, 7.0F, 46, 5, 2, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  911 */     this.gunModel['¯'].setRotationPoint(43.5F, -32.75F, -3.0F);
/*      */     
/*  913 */     this.gunModel['°'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 4, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  914 */     this.gunModel['°'].setRotationPoint(84.5F, -27.75F, -3.0F);
/*      */     
/*  916 */     this.gunModel['±'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 2, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  917 */     this.gunModel['±'].setRotationPoint(79.5F, -22.75F, -3.0F);
/*      */     
/*  919 */     this.gunModel['²'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  920 */     this.gunModel['²'].setRotationPoint(79.5F, -20.75F, -3.0F);
/*      */     
/*  922 */     this.gunModel['³'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  923 */     this.gunModel['³'].setRotationPoint(79.5F, -19.75F, -3.0F);
/*      */     
/*  925 */     this.gunModel['´'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  926 */     this.gunModel['´'].setRotationPoint(43.5F, -28.75F, -3.0F);
/*      */     
/*  928 */     this.gunModel['µ'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  929 */     this.gunModel['µ'].setRotationPoint(53.5F, -28.75F, -3.0F);
/*      */     
/*  931 */     this.gunModel['¶'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  932 */     this.gunModel['¶'].setRotationPoint(69.0F, -28.75F, -3.0F);
/*      */     
/*  934 */     this.gunModel['·'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  935 */     this.gunModel['·'].setRotationPoint(52.0F, -26.25F, -3.0F);
/*      */     
/*  937 */     this.gunModel['¸'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  938 */     this.gunModel['¸'].setRotationPoint(52.0F, -28.75F, -3.0F);
/*      */     
/*  940 */     this.gunModel['¹'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  941 */     this.gunModel['¹'].setRotationPoint(45.5F, -26.25F, -3.0F);
/*      */     
/*  943 */     this.gunModel['º'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  944 */     this.gunModel['º'].setRotationPoint(45.5F, -28.75F, -3.0F);
/*      */     
/*  946 */     this.gunModel['»'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  947 */     this.gunModel['»'].setRotationPoint(67.5F, -26.25F, -3.0F);
/*      */     
/*  949 */     this.gunModel['¼'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  950 */     this.gunModel['¼'].setRotationPoint(67.5F, -28.75F, -3.0F);
/*      */     
/*  952 */     this.gunModel['½'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  953 */     this.gunModel['½'].setRotationPoint(61.0F, -26.25F, -3.0F);
/*      */     
/*  955 */     this.gunModel['¾'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  956 */     this.gunModel['¾'].setRotationPoint(61.0F, -28.75F, -3.0F);
/*      */     
/*  958 */     this.gunModel['¿'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  959 */     this.gunModel['¿'].setRotationPoint(83.0F, -26.25F, -3.0F);
/*      */     
/*  961 */     this.gunModel['À'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  962 */     this.gunModel['À'].setRotationPoint(83.0F, -28.75F, -3.0F);
/*      */     
/*  964 */     this.gunModel['Á'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  965 */     this.gunModel['Á'].setRotationPoint(76.5F, -26.25F, -3.0F);
/*      */     
/*  967 */     this.gunModel['Â'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  968 */     this.gunModel['Â'].setRotationPoint(76.5F, -28.75F, -3.0F);
/*      */     
/*  970 */     this.gunModel['Ã'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel['Ã'].setRotationPoint(79.5F, -24.75F, -3.0F);
/*      */     
/*  973 */     this.gunModel['Ä'].addShapeBox(59.0F, -19.0F, 7.0F, 59, 4, 12, 0.0F, 0.0F, -0.5F, -3.0F, 1.0F, -0.5F, -3.0F, 1.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  974 */     this.gunModel['Ä'].setRotationPoint(31.5F, -35.75F, -13.0F);
/*      */     
/*  976 */     this.gunModel['Å'].addShapeBox(59.0F, -19.0F, 7.0F, 12, 4, 12, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  977 */     this.gunModel['Å'].setRotationPoint(19.5F, -35.75F, -13.0F);
/*      */     
/*  979 */     this.gunModel['Æ'].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  980 */     this.gunModel['Æ'].setRotationPoint(19.5F, -32.75F, -3.0F);
/*      */     
/*  982 */     this.gunModel['Ç'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 11, 0.0F, 1.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  983 */     this.gunModel['Ç'].setRotationPoint(-0.5F, -29.75F, -14.0F);
/*      */     
/*  985 */     this.gunModel['È'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 10, 0.0F, 3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  986 */     this.gunModel['È'].setRotationPoint(-1.5F, -31.75F, -13.0F);
/*      */     
/*  988 */     this.gunModel['É'].addShapeBox(59.0F, -19.0F, 7.0F, 12, 4, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  989 */     this.gunModel['É'].setRotationPoint(1.5F, -31.75F, -14.0F);
/*      */     
/*  991 */     this.gunModel['Ê'].addShapeBox(59.0F, -19.0F, 7.0F, 13, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  992 */     this.gunModel['Ê'].setRotationPoint(0.5F, -26.75F, -16.0F);
/*      */     
/*  994 */     this.gunModel['Ë'].addShapeBox(59.0F, -19.0F, 7.0F, 13, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  995 */     this.gunModel['Ë'].setRotationPoint(0.5F, -24.75F, -17.0F);
/*      */     
/*  997 */     this.gunModel['Ì'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 2, 13, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  998 */     this.gunModel['Ì'].setRotationPoint(-27.5F, -26.75F, -14.0F);
/*      */     
/* 1000 */     this.gunModel['Í'].addShapeBox(59.0F, -19.0F, 7.0F, 13, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1001 */     this.gunModel['Í'].setRotationPoint(0.5F, -24.75F, -16.0F);
/*      */     
/* 1003 */     this.gunModel['Î'].addShapeBox(59.0F, -19.0F, 7.0F, 36, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1004 */     this.gunModel['Î'].setRotationPoint(43.5F, -24.75F, -13.0F);
/*      */     
/* 1006 */     this.gunModel['Ï'].addShapeBox(59.0F, -19.0F, 7.0F, 46, 5, 2, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1007 */     this.gunModel['Ï'].setRotationPoint(43.5F, -32.75F, -13.0F);
/*      */     
/* 1009 */     this.gunModel['Ð'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 4, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1010 */     this.gunModel['Ð'].setRotationPoint(84.5F, -27.75F, -13.0F);
/*      */     
/* 1012 */     this.gunModel['Ñ'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 2, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1013 */     this.gunModel['Ñ'].setRotationPoint(79.5F, -22.75F, -13.0F);
/*      */     
/* 1015 */     this.gunModel['Ò'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1016 */     this.gunModel['Ò'].setRotationPoint(79.5F, -20.75F, -13.0F);
/*      */     
/* 1018 */     this.gunModel['Ó'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1019 */     this.gunModel['Ó'].setRotationPoint(79.5F, -19.75F, -13.0F);
/*      */     
/* 1021 */     this.gunModel['Ô'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1022 */     this.gunModel['Ô'].setRotationPoint(43.5F, -28.75F, -13.0F);
/*      */     
/* 1024 */     this.gunModel['Õ'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1025 */     this.gunModel['Õ'].setRotationPoint(53.5F, -28.75F, -13.0F);
/*      */     
/* 1027 */     this.gunModel['Ö'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1028 */     this.gunModel['Ö'].setRotationPoint(69.0F, -28.75F, -13.0F);
/*      */     
/* 1030 */     this.gunModel['×'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1031 */     this.gunModel['×'].setRotationPoint(52.0F, -26.25F, -13.0F);
/*      */     
/* 1033 */     this.gunModel['Ø'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1034 */     this.gunModel['Ø'].setRotationPoint(52.0F, -28.75F, -13.0F);
/*      */     
/* 1036 */     this.gunModel['Ù'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1037 */     this.gunModel['Ù'].setRotationPoint(45.5F, -26.25F, -13.0F);
/*      */     
/* 1039 */     this.gunModel['Ú'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1040 */     this.gunModel['Ú'].setRotationPoint(45.5F, -28.75F, -13.0F);
/*      */     
/* 1042 */     this.gunModel['Û'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1043 */     this.gunModel['Û'].setRotationPoint(67.5F, -26.25F, -13.0F);
/*      */     
/* 1045 */     this.gunModel['Ü'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1046 */     this.gunModel['Ü'].setRotationPoint(67.5F, -28.75F, -13.0F);
/*      */     
/* 1048 */     this.gunModel['Ý'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1049 */     this.gunModel['Ý'].setRotationPoint(61.0F, -26.25F, -13.0F);
/*      */     
/* 1051 */     this.gunModel['Þ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1052 */     this.gunModel['Þ'].setRotationPoint(61.0F, -28.75F, -13.0F);
/*      */     
/* 1054 */     this.gunModel['ß'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1055 */     this.gunModel['ß'].setRotationPoint(83.0F, -26.25F, -13.0F);
/*      */     
/* 1057 */     this.gunModel['à'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1058 */     this.gunModel['à'].setRotationPoint(83.0F, -28.75F, -13.0F);
/*      */     
/* 1060 */     this.gunModel['á'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1061 */     this.gunModel['á'].setRotationPoint(76.5F, -26.25F, -13.0F);
/*      */     
/* 1063 */     this.gunModel['â'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1064 */     this.gunModel['â'].setRotationPoint(76.5F, -28.75F, -13.0F);
/*      */     
/* 1066 */     this.gunModel['ã'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1067 */     this.gunModel['ã'].setRotationPoint(79.5F, -24.75F, -13.0F);
/*      */     
/* 1069 */     this.gunModel['ä'].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1070 */     this.gunModel['ä'].setRotationPoint(19.5F, -32.75F, -13.0F);
/*      */     
/* 1072 */     this.gunModel['å'].addShapeBox(59.0F, -19.0F, 7.0F, 72, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1073 */     this.gunModel['å'].setRotationPoint(19.5F, -36.0F, -9.0F);
/*      */     
/* 1075 */     this.gunModel['æ'].addShapeBox(59.0F, -19.0F, 7.0F, 72, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1076 */     this.gunModel['æ'].setRotationPoint(19.5F, -36.25F, -10.0F);
/*      */     
/* 1078 */     this.gunModel['ç'].addShapeBox(59.0F, -19.0F, 7.0F, 72, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1079 */     this.gunModel['ç'].setRotationPoint(19.5F, -36.25F, -5.0F);
/*      */     
/* 1081 */     this.gunModel['è'].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1082 */     this.gunModel['è'].setRotationPoint(19.5F, -31.75F, -1.0F);
/*      */     
/* 1084 */     this.gunModel['é'].addShapeBox(59.0F, -19.0F, 7.0F, 17, 14, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1085 */     this.gunModel['é'].setRotationPoint(19.5F, -29.75F, -3.0F);
/*      */     
/* 1087 */     this.gunModel['ê'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 14, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F);
/* 1088 */     this.gunModel['ê'].setRotationPoint(36.5F, -29.75F, -3.0F);
/*      */     
/* 1090 */     this.gunModel['ë'].addShapeBox(59.0F, -19.0F, 7.0F, 11, 3, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -10.0F, -0.5F, 0.0F, -10.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1091 */     this.gunModel['ë'].setRotationPoint(19.5F, -15.75F, -3.0F);
/*      */     
/* 1093 */     this.gunModel['ì'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1094 */     this.gunModel['ì'].setRotationPoint(13.5F, -22.75F, -16.0F);
/*      */     
/* 1096 */     this.gunModel['í'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1097 */     this.gunModel['í'].setRotationPoint(17.5F, -24.75F, -2.0F);
/*      */     
/* 1099 */     this.gunModel['î'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1100 */     this.gunModel['î'].setRotationPoint(13.5F, -24.75F, -2.0F);
/*      */     
/* 1102 */     this.gunModel['ï'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1103 */     this.gunModel['ï'].setRotationPoint(13.5F, -28.75F, -2.0F);
/*      */     
/* 1105 */     this.gunModel['ð'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1106 */     this.gunModel['ð'].setRotationPoint(13.5F, -31.75F, -2.0F);
/*      */     
/* 1108 */     this.gunModel['ñ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1109 */     this.gunModel['ñ'].setRotationPoint(18.5F, -28.75F, -2.0F);
/*      */     
/* 1111 */     this.gunModel['ò'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1112 */     this.gunModel['ò'].setRotationPoint(18.5F, -31.75F, -2.0F);
/*      */     
/* 1114 */     this.gunModel['ó'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1115 */     this.gunModel['ó'].setRotationPoint(17.5F, -24.75F, -15.5F);
/*      */     
/* 1117 */     this.gunModel['ô'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1118 */     this.gunModel['ô'].setRotationPoint(13.5F, -24.75F, -15.5F);
/*      */     
/* 1120 */     this.gunModel['õ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1121 */     this.gunModel['õ'].setRotationPoint(13.5F, -28.75F, -14.0F);
/*      */     
/* 1123 */     this.gunModel['ö'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1124 */     this.gunModel['ö'].setRotationPoint(13.5F, -31.75F, -14.0F);
/*      */     
/* 1126 */     this.gunModel['÷'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1127 */     this.gunModel['÷'].setRotationPoint(18.5F, -28.75F, -14.0F);
/*      */     
/* 1129 */     this.gunModel['ø'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1130 */     this.gunModel['ø'].setRotationPoint(18.5F, -31.75F, -14.0F);
/*      */     
/* 1132 */     this.gunModel['ù'].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 4, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1133 */     this.gunModel['ù'].setRotationPoint(19.5F, -31.75F, -16.0F);
/*      */     
/* 1135 */     this.gunModel['ú'].addShapeBox(59.0F, -19.0F, 7.0F, 17, 14, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1136 */     this.gunModel['ú'].setRotationPoint(19.5F, -29.75F, -16.0F);
/*      */     
/* 1138 */     this.gunModel['û'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 14, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -3.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1139 */     this.gunModel['û'].setRotationPoint(36.5F, -29.75F, -16.0F);
/*      */     
/* 1141 */     this.gunModel['ü'].addShapeBox(59.0F, -19.0F, 7.0F, 11, 3, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -10.0F, -0.5F, 0.0F, -10.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1142 */     this.gunModel['ü'].setRotationPoint(19.5F, -15.75F, -16.0F);
/*      */     
/* 1144 */     this.gunModel['ý'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 9, 9, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1145 */     this.gunModel['ý'].setRotationPoint(99.0F, -24.75F, -11.5F);
/*      */     
/* 1147 */     this.gunModel['þ'].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 5, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, 1.75F, 0.0F, -1.25F, 1.75F, 0.0F, -1.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 1.75F, 1.75F, 0.0F, 1.75F, 1.75F, 0.0F, 0.25F, -0.25F);
/* 1148 */     this.gunModel['þ'].setRotationPoint(100.0F, -18.75F, -9.5F);
/*      */     
/* 1150 */     this.gunModel['ÿ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 1, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.25F, 1.5F);
/* 1151 */     this.gunModel['ÿ'].setRotationPoint(115.0F, -22.75F, -5.5F);
/*      */     
/* 1153 */     this.gunModel['Ā'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 5, 5, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.55F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.55F, 0.0F, 0.25F, 0.55F, 0.0F, 0.25F, -0.25F);
/* 1154 */     this.gunModel['Ā'].setRotationPoint(100.0F, -22.75F, -9.5F);
/*      */     
/* 1156 */     this.gunModel['ā'].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 1.75F, 1.75F, 0.0F, 1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, 1.75F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F);
/* 1157 */     this.gunModel['ā'].setRotationPoint(100.0F, -22.75F, -9.5F);
/*      */     
/* 1159 */     this.gunModel['Ă'].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 1.75F, 1.75F, 0.0F, 0.25F, -0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 1.75F, 0.0F, -1.25F, -0.25F);
/* 1160 */     this.gunModel['Ă'].setRotationPoint(100.0F, -22.75F, -5.5F);
/*      */     
/* 1162 */     this.gunModel['ă'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.85F, 0.25F, 0.0F, 0.85F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F);
/* 1163 */     this.gunModel['ă'].setRotationPoint(100.0F, -22.75F, -8.0F);
/*      */     
/* 1165 */     this.gunModel['Ą'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 2, 0.0F, 0.0F, 0.45F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.45F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F);
/* 1166 */     this.gunModel['Ą'].setRotationPoint(114.0F, -23.75F, -8.0F);
/*      */     
/* 1168 */     this.gunModel['ą'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 1.45F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F);
/* 1169 */     this.gunModel['ą'].setRotationPoint(107.0F, -18.25F, -9.5F);
/*      */     
/* 1171 */     this.gunModel['Ć'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, -1.0F, -0.25F, 0.8F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.8F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F);
/* 1172 */     this.gunModel['Ć'].setRotationPoint(114.0F, -19.0F, -10.0F);
/*      */     
/* 1174 */     this.gunModel['ć'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.95F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F);
/* 1175 */     this.gunModel['ć'].setRotationPoint(114.0F, -19.75F, -10.0F);
/*      */     
/* 1177 */     this.gunModel['Ĉ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 1, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.75F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.75F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/* 1178 */     this.gunModel['Ĉ'].setRotationPoint(115.0F, -22.75F, -9.5F);
/*      */     
/* 1180 */     this.gunModel['ĉ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 1.45F, 0.0F, 0.0F, 0.55F, 0.0F, -0.25F, -1.05F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.55F);
/* 1181 */     this.gunModel['ĉ'].setRotationPoint(107.0F, -18.25F, -5.5F);
/*      */     
/* 1183 */     this.gunModel['Ċ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 1, 0.0F, 0.0F, 0.75F, 0.55F, 0.0F, 0.75F, 1.45F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 1184 */     this.gunModel['Ċ'].setRotationPoint(107.0F, -20.25F, -9.5F);
/*      */     
/* 1186 */     this.gunModel['ċ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 1, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 1.45F, 0.0F, 0.75F, 0.55F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.55F);
/* 1187 */     this.gunModel['ċ'].setRotationPoint(107.0F, -20.25F, -5.5F);
/*      */     
/* 1189 */     this.gunModel['Č'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 1.45F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.4F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.2F);
/* 1190 */     this.gunModel['Č'].setRotationPoint(107.0F, -23.0F, -9.5F);
/*      */     
/* 1192 */     this.gunModel['č'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 1.45F, 0.0F, 0.0F, 0.55F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.55F);
/* 1193 */     this.gunModel['č'].setRotationPoint(107.0F, -23.0F, -5.5F);
/*      */     
/* 1195 */     this.gunModel['Ď'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F);
/* 1196 */     this.gunModel['Ď'].setRotationPoint(107.0F, -19.75F, -5.0F);
/*      */     
/* 1198 */     this.gunModel['ď'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.95F, -1.0F, -0.25F, 0.8F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, 0.8F);
/* 1199 */     this.gunModel['ď'].setRotationPoint(114.0F, -19.0F, -5.0F);
/*      */     
/* 1201 */     this.gunModel['Đ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.95F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 1.0F, -1.0F, -0.25F, 0.95F);
/* 1202 */     this.gunModel['Đ'].setRotationPoint(114.0F, -19.75F, -5.0F);
/*      */     
/* 1204 */     this.gunModel['đ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.05F);
/* 1205 */     this.gunModel['đ'].setRotationPoint(107.0F, -19.0F, -5.0F);
/*      */     
/* 1207 */     this.gunModel['Ē'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F);
/* 1208 */     this.gunModel['Ē'].setRotationPoint(107.0F, -22.5F, -5.0F);
/*      */     
/* 1210 */     this.gunModel['ē'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.95F, -1.0F, -0.25F, 0.8F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, 0.8F);
/* 1211 */     this.gunModel['ē'].setRotationPoint(114.0F, -21.75F, -5.0F);
/*      */     
/* 1213 */     this.gunModel['Ĕ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.95F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 1.0F, -1.0F, -0.25F, 0.95F);
/* 1214 */     this.gunModel['Ĕ'].setRotationPoint(114.0F, -22.5F, -5.0F);
/*      */     
/* 1216 */     this.gunModel['ĕ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, -0.55F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.05F);
/* 1217 */     this.gunModel['ĕ'].setRotationPoint(107.0F, -21.75F, -5.0F);
/*      */     
/* 1219 */     this.gunModel['Ė'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.35F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.45F, -1.0F, -0.25F, -0.45F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1220 */     this.gunModel['Ė'].setRotationPoint(107.0F, -19.75F, -10.5F);
/*      */     
/* 1222 */     this.gunModel['ė'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.45F, -1.0F, -0.25F, -0.45F, -1.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.35F, 0.0F, -0.25F, 0.2F, 0.0F, -0.25F, 0.25F);
/* 1223 */     this.gunModel['ė'].setRotationPoint(107.0F, -19.0F, -10.5F);
/*      */     
/* 1225 */     this.gunModel['Ę'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, -1.0F, -0.25F, 0.8F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.8F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F);
/* 1226 */     this.gunModel['Ę'].setRotationPoint(114.0F, -21.75F, -10.0F);
/*      */     
/* 1228 */     this.gunModel['ę'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.35F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.45F, -1.0F, -0.25F, -0.45F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1229 */     this.gunModel['ę'].setRotationPoint(107.0F, -22.5F, -10.5F);
/*      */     
/* 1231 */     this.gunModel['Ě'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.45F, -1.0F, -0.25F, -0.45F, -1.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.35F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1232 */     this.gunModel['Ě'].setRotationPoint(107.0F, -21.75F, -10.5F);
/*      */     
/* 1234 */     this.gunModel['ě'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.95F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.95F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F);
/* 1235 */     this.gunModel['ě'].setRotationPoint(114.0F, -22.5F, -10.0F);
/*      */     
/* 1237 */     this.gunModel['Ĝ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.4F, -1.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 1238 */     this.gunModel['Ĝ'].setRotationPoint(113.0F, -23.75F, -6.75F);
/*      */     
/* 1240 */     this.gunModel['ĝ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.4F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -1.0F);
/* 1241 */     this.gunModel['ĝ'].setRotationPoint(113.0F, -23.75F, -8.25F);
/*      */     
/* 1243 */     this.gunModel['Ğ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.45F, -1.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1244 */     this.gunModel['Ğ'].setRotationPoint(107.0F, -23.25F, -6.7F);
/*      */     
/* 1246 */     this.gunModel['ğ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, -1.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F);
/* 1247 */     this.gunModel['ğ'].setRotationPoint(107.0F, -23.25F, -8.25F);
/*      */     
/* 1249 */     this.gunModel['Ġ'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 8, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1250 */     this.gunModel['Ġ'].setRotationPoint(92.0F, -24.25F, -11.0F);
/*      */     
/* 1252 */     this.gunModel['ġ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 2, 0.0F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1253 */     this.gunModel['ġ'].setRotationPoint(91.0F, -32.0F, -6.75F);
/*      */     
/* 1255 */     this.gunModel['Ģ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1256 */     this.gunModel['Ģ'].setRotationPoint(96.0F, -31.0F, -6.75F);
/*      */     
/* 1258 */     this.gunModel['ģ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 1259 */     this.gunModel['ģ'].setRotationPoint(90.0F, -31.0F, -6.75F);
/*      */     
/* 1261 */     this.gunModel['Ĥ'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 3, 2, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1262 */     this.gunModel['Ĥ'].setRotationPoint(89.0F, -27.0F, -6.75F);
/*      */     
/* 1264 */     this.gunModel['ĥ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1265 */     this.gunModel['ĥ'].setRotationPoint(92.0F, -28.0F, -6.75F);
/*      */     
/* 1267 */     this.gunModel['Ħ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1268 */     this.gunModel['Ħ'].setRotationPoint(92.0F, -31.0F, -6.75F);
/*      */     
/* 1270 */     this.gunModel['ħ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1271 */     this.gunModel['ħ'].setRotationPoint(95.0F, -28.0F, -6.75F);
/*      */     
/* 1273 */     this.gunModel['Ĩ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1274 */     this.gunModel['Ĩ'].setRotationPoint(95.0F, -31.0F, -6.75F);
/*      */     
/* 1276 */     this.gunModel['ĩ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 1277 */     this.gunModel['ĩ'].setRotationPoint(91.0F, -32.0F, -9.75F);
/*      */     
/* 1279 */     this.gunModel['Ī'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1280 */     this.gunModel['Ī'].setRotationPoint(96.0F, -31.0F, -9.75F);
/*      */     
/* 1282 */     this.gunModel['ī'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 1.25F, 0.0F, 0.5F);
/* 1283 */     this.gunModel['ī'].setRotationPoint(90.0F, -31.0F, -9.75F);
/*      */     
/* 1285 */     this.gunModel['Ĭ'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 3, 2, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1286 */     this.gunModel['Ĭ'].setRotationPoint(89.0F, -27.0F, -9.75F);
/*      */     
/* 1288 */     this.gunModel['ĭ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1289 */     this.gunModel['ĭ'].setRotationPoint(92.0F, -28.0F, -9.75F);
/*      */     
/* 1291 */     this.gunModel['Į'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1292 */     this.gunModel['Į'].setRotationPoint(92.0F, -31.0F, -9.75F);
/*      */     
/* 1294 */     this.gunModel['į'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1295 */     this.gunModel['į'].setRotationPoint(95.0F, -28.0F, -9.75F);
/*      */     
/* 1297 */     this.gunModel['İ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1298 */     this.gunModel['İ'].setRotationPoint(95.0F, -31.0F, -9.75F);
/*      */     
/* 1300 */     this.gunModel['ı'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 2, 0.0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F);
/* 1301 */     this.gunModel['ı'].setRotationPoint(97.5F, -38.75F, -8.0F);
/*      */     
/* 1303 */     this.gunModel['Ĳ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 4, 2, 0.0F, -1.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F);
/* 1304 */     this.gunModel['Ĳ'].setRotationPoint(91.5F, -27.25F, -8.0F);
/*      */     
/* 1306 */     this.gunModel['ĳ'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 1, 2, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
/* 1307 */     this.gunModel['ĳ'].setRotationPoint(89.0F, -25.0F, -10.75F);
/*      */     
/* 1309 */     this.gunModel['Ĵ'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 1, 2, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1310 */     this.gunModel['Ĵ'].setRotationPoint(89.0F, -25.0F, -5.25F);
/*      */     
/* 1312 */     this.gunModel['ĵ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 13, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 1313 */     this.gunModel['ĵ'].setRotationPoint(87.0F, -17.0F, -13.5F);
/*      */     
/* 1315 */     this.gunModel['Ķ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1316 */     this.gunModel['Ķ'].setRotationPoint(15.0F, -24.25F, -12.5F);
/*      */     
/* 1318 */     this.gunModel['ķ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1319 */     this.gunModel['ķ'].setRotationPoint(15.0F, -26.25F, -12.5F);
/*      */     
/* 1321 */     this.gunModel['ĸ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1322 */     this.gunModel['ĸ'].setRotationPoint(15.0F, -25.25F, -12.5F);
/*      */     
/* 1324 */     this.gunModel['Ĺ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1325 */     this.gunModel['Ĺ'].setRotationPoint(-34.5F, -7.75F, -15.0F);
/*      */     
/* 1327 */     this.gunModel['ĺ'].addShapeBox(59.0F, -19.0F, 7.0F, 44, 4, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1328 */     this.gunModel['ĺ'].setRotationPoint(-61.5F, -17.75F, 0.5F);
/*      */     
/* 1330 */     this.gunModel['Ļ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 7, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1331 */     this.gunModel['Ļ'].setRotationPoint(-17.5F, -17.75F, 0.5F);
/*      */     
/* 1333 */     this.gunModel['ļ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1334 */     this.gunModel['ļ'].setRotationPoint(-46.5F, -11.75F, 0.5F);
/*      */     
/* 1336 */     this.gunModel['Ľ'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1337 */     this.gunModel['Ľ'].setRotationPoint(-27.5F, -13.75F, 0.5F);
/*      */     
/* 1339 */     this.gunModel['ľ'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 6, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1340 */     this.gunModel['ľ'].setRotationPoint(-42.5F, -13.75F, 0.5F);
/*      */     
/* 1342 */     this.gunModel['Ŀ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1343 */     this.gunModel['Ŀ'].setRotationPoint(-32.5F, -13.75F, 0.5F);
/*      */     
/* 1345 */     this.gunModel['ŀ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1346 */     this.gunModel['ŀ'].setRotationPoint(-44.5F, -9.75F, 0.5F);
/*      */     
/* 1348 */     this.gunModel['Ł'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1349 */     this.gunModel['Ł'].setRotationPoint(-44.5F, -13.75F, 0.5F);
/*      */     
/* 1351 */     this.gunModel['ł'].addShapeBox(59.0F, -19.0F, 7.0F, 17, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1352 */     this.gunModel['ł'].setRotationPoint(-61.5F, -13.75F, 0.5F);
/*      */     
/* 1354 */     this.gunModel['Ń'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 6, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1355 */     this.gunModel['Ń'].setRotationPoint(-63.5F, -18.25F, 0.5F);
/*      */     
/* 1357 */     this.gunModel['ń'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1358 */     this.gunModel['ń'].setRotationPoint(-64.5F, -18.25F, 0.5F);
/*      */     
/* 1360 */     this.gunModel['Ņ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1361 */     this.gunModel['Ņ'].setRotationPoint(-65.5F, -17.25F, 0.5F);
/*      */     
/* 1363 */     this.gunModel['ņ'].addShapeBox(59.0F, -19.0F, 7.0F, 19, 4, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1364 */     this.gunModel['ņ'].setRotationPoint(-60.5F, -16.75F, 1.5F);
/*      */     
/* 1366 */     this.gunModel['Ň'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1367 */     this.gunModel['Ň'].setRotationPoint(-46.5F, -12.75F, 1.5F);
/*      */     
/* 1369 */     this.gunModel['ň'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1370 */     this.gunModel['ň'].setRotationPoint(-44.5F, -10.75F, 1.5F);
/*      */     
/* 1372 */     this.gunModel['ŉ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1373 */     this.gunModel['ŉ'].setRotationPoint(-44.5F, -12.75F, 1.5F);
/*      */     
/* 1375 */     this.gunModel['Ŋ'].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1376 */     this.gunModel['Ŋ'].setRotationPoint(-35.5F, -16.75F, 1.5F);
/*      */     
/* 1378 */     this.gunModel['ŋ'].addShapeBox(59.0F, -19.0F, 7.0F, 10, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1379 */     this.gunModel['ŋ'].setRotationPoint(-28.0F, -14.75F, 1.5F);
/*      */     
/* 1381 */     this.gunModel['Ō'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 6, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1382 */     this.gunModel['Ō'].setRotationPoint(-36.5F, -14.75F, 1.5F);
/*      */     
/* 1384 */     this.gunModel['ō'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1385 */     this.gunModel['ō'].setRotationPoint(-33.5F, -14.75F, 1.5F);
/*      */     
/* 1387 */     this.gunModel['Ŏ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1388 */     this.gunModel['Ŏ'].setRotationPoint(-33.5F, -13.75F, 1.5F);
/*      */     
/* 1390 */     this.gunModel['ŏ'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 1391 */     this.gunModel['ŏ'].setRotationPoint(-37.0F, -16.75F, 1.5F);
/*      */     
/* 1393 */     this.gunModel['Ő'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1394 */     this.gunModel['Ő'].setRotationPoint(-41.0F, -16.75F, 1.5F);
/*      */     
/* 1396 */     this.gunModel['ő'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 1397 */     this.gunModel['ő'].setRotationPoint(-40.0F, -16.75F, 1.5F);
/*      */     
/* 1399 */     this.gunModel['Œ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 1400 */     this.gunModel['Œ'].setRotationPoint(-38.5F, -16.75F, 1.5F);
/*      */     
/* 1402 */     this.gunModel['œ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1403 */     this.gunModel['œ'].setRotationPoint(-40.0F, -15.0F, 1.5F);
/*      */     
/* 1405 */     this.gunModel['Ŕ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1406 */     this.gunModel['Ŕ'].setRotationPoint(-40.0F, -14.0F, 1.5F);
/*      */     
/* 1408 */     this.gunModel['ŕ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1409 */     this.gunModel['ŕ'].setRotationPoint(-40.0F, -13.0F, 1.5F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 1414 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 833, 313, this.textureX, this.textureY);
/* 1415 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 793, 121, this.textureX, this.textureY);
/* 1416 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 825, 121, this.textureX, this.textureY);
/* 1417 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 833, 121, this.textureX, this.textureY);
/* 1418 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 857, 121, this.textureX, this.textureY);
/* 1419 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 873, 121, this.textureX, this.textureY);
/* 1420 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 889, 121, this.textureX, this.textureY);
/* 1421 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/* 1422 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 953, 113, this.textureX, this.textureY);
/* 1423 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/* 1424 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 417, 129, this.textureX, this.textureY);
/* 1425 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 713, 129, this.textureX, this.textureY);
/* 1426 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/* 1427 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 905, 121, this.textureX, this.textureY);
/* 1428 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 921, 121, this.textureX, this.textureY);
/* 1429 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/* 1430 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 337, 129, this.textureX, this.textureY);
/* 1431 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 361, 129, this.textureX, this.textureY);
/* 1432 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 745, 129, this.textureX, this.textureY);
/* 1433 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/* 1434 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 937, 137, this.textureX, this.textureY);
/* 1435 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 377, 145, this.textureX, this.textureY);
/* 1436 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/* 1437 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 969, 129, this.textureX, this.textureY);
/* 1438 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 417, 169, this.textureX, this.textureY);
/* 1439 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 385, 161, this.textureX, this.textureY);
/* 1440 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/* 1441 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 417, 129, this.textureX, this.textureY);
/* 1442 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/* 1443 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/* 1444 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 337, 137, this.textureX, this.textureY);
/* 1445 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/* 1446 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 745, 137, this.textureX, this.textureY);
/* 1447 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/* 1448 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/* 1449 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 745, 161, this.textureX, this.textureY);
/* 1450 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 969, 137, this.textureX, this.textureY);
/* 1451 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 89, 145, this.textureX, this.textureY);
/* 1452 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/* 1453 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 441, 145, this.textureX, this.textureY);
/* 1454 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/* 1455 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 713, 145, this.textureX, this.textureY);
/* 1456 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 681, 169, this.textureX, this.textureY);
/* 1457 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 745, 145, this.textureX, this.textureY);
/* 1458 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 937, 145, this.textureX, this.textureY);
/* 1459 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 705, 17, this.textureX, this.textureY);
/* 1460 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 473, 129, this.textureX, this.textureY);
/* 1461 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 713, 129, this.textureX, this.textureY);
/*      */     
/* 1463 */     this.defaultScopeModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 17, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1464 */     this.defaultScopeModel[0].setRotationPoint(12.5F, -36.75F, -11.0F);
/*      */     
/* 1466 */     this.defaultScopeModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1467 */     this.defaultScopeModel[1].setRotationPoint(15.5F, -37.75F, -11.0F);
/*      */     
/* 1469 */     this.defaultScopeModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1470 */     this.defaultScopeModel[2].setRotationPoint(15.5F, -38.75F, -11.0F);
/*      */     
/* 1472 */     this.defaultScopeModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 1, 0.0F, -1.25F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1473 */     this.defaultScopeModel[3].setRotationPoint(21.5F, -38.75F, -11.0F);
/*      */     
/* 1475 */     this.defaultScopeModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1476 */     this.defaultScopeModel[4].setRotationPoint(23.0F, -40.25F, -11.0F);
/*      */     
/* 1478 */     this.defaultScopeModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1479 */     this.defaultScopeModel[5].setRotationPoint(22.5F, -39.75F, -11.0F);
/*      */     
/* 1481 */     this.defaultScopeModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1482 */     this.defaultScopeModel[6].setRotationPoint(28.5F, -40.75F, -11.0F);
/*      */     
/* 1484 */     this.defaultScopeModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 8, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1485 */     this.defaultScopeModel[7].setRotationPoint(28.5F, -38.75F, -11.0F);
/*      */     
/* 1487 */     this.defaultScopeModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1488 */     this.defaultScopeModel[8].setRotationPoint(28.0F, -39.25F, -11.0F);
/*      */     
/* 1490 */     this.defaultScopeModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1491 */     this.defaultScopeModel[9].setRotationPoint(27.25F, -39.25F, -11.0F);
/*      */     
/* 1493 */     this.defaultScopeModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1494 */     this.defaultScopeModel[10].setRotationPoint(30.0F, -35.75F, -11.0F);
/*      */     
/* 1496 */     this.defaultScopeModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1497 */     this.defaultScopeModel[11].setRotationPoint(11.5F, -36.75F, -11.0F);
/*      */     
/* 1499 */     this.defaultScopeModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 8, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1500 */     this.defaultScopeModel[12].setRotationPoint(10.5F, -36.75F, -11.0F);
/*      */     
/* 1502 */     this.defaultScopeModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1503 */     this.defaultScopeModel[13].setRotationPoint(17.75F, -41.25F, -11.5F);
/*      */     
/* 1505 */     this.defaultScopeModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1506 */     this.defaultScopeModel[14].setRotationPoint(17.75F, -40.25F, -11.5F);
/*      */     
/* 1508 */     this.defaultScopeModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1509 */     this.defaultScopeModel[15].setRotationPoint(17.75F, -39.25F, -11.5F);
/*      */     
/* 1511 */     this.defaultScopeModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1512 */     this.defaultScopeModel[16].setRotationPoint(17.25F, -40.25F, -11.0F);
/*      */     
/* 1514 */     this.defaultScopeModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F);
/* 1515 */     this.defaultScopeModel[17].setRotationPoint(17.25F, -38.75F, -11.0F);
/*      */     
/* 1517 */     this.defaultScopeModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1518 */     this.defaultScopeModel[18].setRotationPoint(17.25F, -41.75F, -11.0F);
/*      */     
/* 1520 */     this.defaultScopeModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1521 */     this.defaultScopeModel[19].setRotationPoint(6.5F, -40.75F, -9.5F);
/*      */     
/* 1523 */     this.defaultScopeModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 6, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1524 */     this.defaultScopeModel[20].setRotationPoint(26.75F, -40.25F, -10.0F);
/*      */     
/* 1526 */     this.defaultScopeModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 6, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1527 */     this.defaultScopeModel[21].setRotationPoint(26.75F, -41.25F, -10.0F);
/*      */     
/* 1529 */     this.defaultScopeModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 6, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1530 */     this.defaultScopeModel[22].setRotationPoint(26.75F, -41.75F, -10.0F);
/*      */     
/* 1532 */     this.defaultScopeModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1533 */     this.defaultScopeModel[23].setRotationPoint(5.0F, -42.75F, -10.5F);
/*      */     
/* 1535 */     this.defaultScopeModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1536 */     this.defaultScopeModel[24].setRotationPoint(6.5F, -40.75F, -6.5F);
/*      */     
/* 1538 */     this.defaultScopeModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1539 */     this.defaultScopeModel[25].setRotationPoint(5.0F, -40.75F, -10.5F);
/*      */     
/* 1541 */     this.defaultScopeModel[26].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1542 */     this.defaultScopeModel[26].setRotationPoint(5.0F, -42.75F, -5.5F);
/*      */     
/* 1544 */     this.defaultScopeModel[27].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1545 */     this.defaultScopeModel[27].setRotationPoint(15.5F, -37.75F, -4.0F);
/*      */     
/* 1547 */     this.defaultScopeModel[28].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1548 */     this.defaultScopeModel[28].setRotationPoint(15.5F, -38.75F, -4.0F);
/*      */     
/* 1550 */     this.defaultScopeModel[29].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 1, 0.0F, -1.25F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1551 */     this.defaultScopeModel[29].setRotationPoint(21.5F, -38.75F, -4.0F);
/*      */     
/* 1553 */     this.defaultScopeModel[30].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1554 */     this.defaultScopeModel[30].setRotationPoint(23.0F, -40.25F, -4.0F);
/*      */     
/* 1556 */     this.defaultScopeModel[31].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1557 */     this.defaultScopeModel[31].setRotationPoint(22.5F, -39.75F, -4.0F);
/*      */     
/* 1559 */     this.defaultScopeModel[32].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1560 */     this.defaultScopeModel[32].setRotationPoint(28.5F, -40.75F, -4.0F);
/*      */     
/* 1562 */     this.defaultScopeModel[33].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1563 */     this.defaultScopeModel[33].setRotationPoint(28.0F, -39.25F, -4.0F);
/*      */     
/* 1565 */     this.defaultScopeModel[34].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1566 */     this.defaultScopeModel[34].setRotationPoint(27.25F, -39.25F, -4.0F);
/*      */     
/* 1568 */     this.defaultScopeModel[35].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 6, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1569 */     this.defaultScopeModel[35].setRotationPoint(29.5F, -40.75F, -10.0F);
/*      */     
/* 1571 */     this.defaultScopeModel[36].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1572 */     this.defaultScopeModel[36].setRotationPoint(17.25F, -40.25F, -5.0F);
/*      */     
/* 1574 */     this.defaultScopeModel[37].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F);
/* 1575 */     this.defaultScopeModel[37].setRotationPoint(17.25F, -38.75F, -5.0F);
/*      */     
/* 1577 */     this.defaultScopeModel[38].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 1578 */     this.defaultScopeModel[38].setRotationPoint(17.25F, -41.75F, -5.0F);
/*      */     
/* 1580 */     this.defaultScopeModel[39].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1581 */     this.defaultScopeModel[39].setRotationPoint(17.75F, -41.25F, -3.5F);
/*      */     
/* 1583 */     this.defaultScopeModel[40].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1584 */     this.defaultScopeModel[40].setRotationPoint(17.75F, -40.25F, -3.5F);
/*      */     
/* 1586 */     this.defaultScopeModel[41].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1587 */     this.defaultScopeModel[41].setRotationPoint(17.75F, -39.25F, -3.5F);
/*      */     
/* 1589 */     this.defaultScopeModel[42].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1590 */     this.defaultScopeModel[42].setRotationPoint(6.5F, -40.75F, -7.5F);
/*      */     
/* 1592 */     this.defaultScopeModel[43].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 2, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1593 */     this.defaultScopeModel[43].setRotationPoint(5.0F, -41.75F, -5.5F);
/*      */     
/* 1595 */     this.defaultScopeModel[44].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1596 */     this.defaultScopeModel[44].setRotationPoint(5.0F, -42.25F, -10.5F);
/*      */     
/* 1598 */     this.defaultScopeModel[45].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1599 */     this.defaultScopeModel[45].setRotationPoint(5.0F, -41.25F, -8.5F);
/*      */     
/* 1601 */     this.defaultScopeModel[46].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1602 */     this.defaultScopeModel[46].setRotationPoint(5.0F, -41.75F, -6.5F);
/*      */     
/* 1604 */     this.defaultScopeModel[47].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 1605 */     this.defaultScopeModel[47].setRotationPoint(5.0F, -41.75F, -8.5F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 1610 */     this.ammoModel[0] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/* 1611 */     this.ammoModel[1] = new ModelRendererTurbo(this, 513, 129, this.textureX, this.textureY);
/* 1612 */     this.ammoModel[2] = new ModelRendererTurbo(this, 737, 129, this.textureX, this.textureY);
/* 1613 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 1614 */     this.ammoModel[4] = new ModelRendererTurbo(this, 185, 153, this.textureX, this.textureY);
/* 1615 */     this.ammoModel[5] = new ModelRendererTurbo(this, 385, 129, this.textureX, this.textureY);
/* 1616 */     this.ammoModel[6] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/* 1617 */     this.ammoModel[7] = new ModelRendererTurbo(this, 961, 129, this.textureX, this.textureY);
/* 1618 */     this.ammoModel[8] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/* 1619 */     this.ammoModel[9] = new ModelRendererTurbo(this, 385, 161, this.textureX, this.textureY);
/* 1620 */     this.ammoModel[10] = new ModelRendererTurbo(this, 441, 161, this.textureX, this.textureY);
/* 1621 */     this.ammoModel[11] = new ModelRendererTurbo(this, 57, 129, this.textureX, this.textureY);
/* 1622 */     this.ammoModel[12] = new ModelRendererTurbo(this, 329, 129, this.textureX, this.textureY);
/* 1623 */     this.ammoModel[13] = new ModelRendererTurbo(this, 713, 129, this.textureX, this.textureY);
/* 1624 */     this.ammoModel[14] = new ModelRendererTurbo(this, 937, 129, this.textureX, this.textureY);
/* 1625 */     this.ammoModel[15] = new ModelRendererTurbo(this, 713, 161, this.textureX, this.textureY);
/* 1626 */     this.ammoModel[16] = new ModelRendererTurbo(this, 761, 161, this.textureX, this.textureY);
/* 1627 */     this.ammoModel[17] = new ModelRendererTurbo(this, 809, 161, this.textureX, this.textureY);
/* 1628 */     this.ammoModel[18] = new ModelRendererTurbo(this, 857, 161, this.textureX, this.textureY);
/* 1629 */     this.ammoModel[19] = new ModelRendererTurbo(this, 905, 161, this.textureX, this.textureY);
/* 1630 */     this.ammoModel[20] = new ModelRendererTurbo(this, 953, 161, this.textureX, this.textureY);
/* 1631 */     this.ammoModel[21] = new ModelRendererTurbo(this, 505, 169, this.textureX, this.textureY);
/* 1632 */     this.ammoModel[22] = new ModelRendererTurbo(this, 553, 169, this.textureX, this.textureY);
/* 1633 */     this.ammoModel[23] = new ModelRendererTurbo(this, 601, 169, this.textureX, this.textureY);
/* 1634 */     this.ammoModel[24] = new ModelRendererTurbo(this, 649, 169, this.textureX, this.textureY);
/* 1635 */     this.ammoModel[25] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/* 1636 */     this.ammoModel[26] = new ModelRendererTurbo(this, 49, 177, this.textureX, this.textureY);
/* 1637 */     this.ammoModel[27] = new ModelRendererTurbo(this, 97, 177, this.textureX, this.textureY);
/* 1638 */     this.ammoModel[28] = new ModelRendererTurbo(this, 145, 177, this.textureX, this.textureY);
/* 1639 */     this.ammoModel[29] = new ModelRendererTurbo(this, 473, 177, this.textureX, this.textureY);
/* 1640 */     this.ammoModel[30] = new ModelRendererTurbo(this, 681, 177, this.textureX, this.textureY);
/* 1641 */     this.ammoModel[31] = new ModelRendererTurbo(this, 177, 185, this.textureX, this.textureY);
/* 1642 */     this.ammoModel[32] = new ModelRendererTurbo(this, 225, 185, this.textureX, this.textureY);
/* 1643 */     this.ammoModel[33] = new ModelRendererTurbo(this, 273, 185, this.textureX, this.textureY);
/* 1644 */     this.ammoModel[34] = new ModelRendererTurbo(this, 321, 185, this.textureX, this.textureY);
/* 1645 */     this.ammoModel[35] = new ModelRendererTurbo(this, 713, 185, this.textureX, this.textureY);
/* 1646 */     this.ammoModel[36] = new ModelRendererTurbo(this, 345, 185, this.textureX, this.textureY);
/* 1647 */     this.ammoModel[37] = new ModelRendererTurbo(this, 417, 121, this.textureX, this.textureY);
/* 1648 */     this.ammoModel[38] = new ModelRendererTurbo(this, 761, 185, this.textureX, this.textureY);
/* 1649 */     this.ammoModel[39] = new ModelRendererTurbo(this, 817, 185, this.textureX, this.textureY);
/* 1650 */     this.ammoModel[40] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/* 1651 */     this.ammoModel[41] = new ModelRendererTurbo(this, 873, 185, this.textureX, this.textureY);
/* 1652 */     this.ammoModel[42] = new ModelRendererTurbo(this, 929, 185, this.textureX, this.textureY);
/* 1653 */     this.ammoModel[43] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/* 1654 */     this.ammoModel[44] = new ModelRendererTurbo(this, 377, 193, this.textureX, this.textureY);
/* 1655 */     this.ammoModel[45] = new ModelRendererTurbo(this, 433, 193, this.textureX, this.textureY);
/* 1656 */     this.ammoModel[46] = new ModelRendererTurbo(this, 793, 185, this.textureX, this.textureY);
/* 1657 */     this.ammoModel[47] = new ModelRendererTurbo(this, 497, 193, this.textureX, this.textureY);
/* 1658 */     this.ammoModel[48] = new ModelRendererTurbo(this, 553, 193, this.textureX, this.textureY);
/* 1659 */     this.ammoModel[49] = new ModelRendererTurbo(this, 849, 185, this.textureX, this.textureY);
/* 1660 */     this.ammoModel[50] = new ModelRendererTurbo(this, 609, 193, this.textureX, this.textureY);
/* 1661 */     this.ammoModel[51] = new ModelRendererTurbo(this, 961, 193, this.textureX, this.textureY);
/* 1662 */     this.ammoModel[52] = new ModelRendererTurbo(this, 905, 185, this.textureX, this.textureY);
/* 1663 */     this.ammoModel[53] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/* 1664 */     this.ammoModel[54] = new ModelRendererTurbo(this, 57, 201, this.textureX, this.textureY);
/* 1665 */     this.ammoModel[55] = new ModelRendererTurbo(this, 409, 193, this.textureX, this.textureY);
/* 1666 */     this.ammoModel[56] = new ModelRendererTurbo(this, 113, 201, this.textureX, this.textureY);
/* 1667 */     this.ammoModel[57] = new ModelRendererTurbo(this, 465, 201, this.textureX, this.textureY);
/* 1668 */     this.ammoModel[58] = new ModelRendererTurbo(this, 529, 193, this.textureX, this.textureY);
/* 1669 */     this.ammoModel[59] = new ModelRendererTurbo(this, 641, 201, this.textureX, this.textureY);
/* 1670 */     this.ammoModel[60] = new ModelRendererTurbo(this, 145, 209, this.textureX, this.textureY);
/* 1671 */     this.ammoModel[61] = new ModelRendererTurbo(this, 585, 193, this.textureX, this.textureY);
/* 1672 */     this.ammoModel[62] = new ModelRendererTurbo(this, 201, 209, this.textureX, this.textureY);
/* 1673 */     this.ammoModel[63] = new ModelRendererTurbo(this, 257, 209, this.textureX, this.textureY);
/* 1674 */     this.ammoModel[64] = new ModelRendererTurbo(this, 33, 201, this.textureX, this.textureY);
/* 1675 */     this.ammoModel[65] = new ModelRendererTurbo(this, 313, 209, this.textureX, this.textureY);
/* 1676 */     this.ammoModel[66] = new ModelRendererTurbo(this, 673, 209, this.textureX, this.textureY);
/* 1677 */     this.ammoModel[67] = new ModelRendererTurbo(this, 89, 201, this.textureX, this.textureY);
/* 1678 */     this.ammoModel[68] = new ModelRendererTurbo(this, 729, 209, this.textureX, this.textureY);
/* 1679 */     this.ammoModel[69] = new ModelRendererTurbo(this, 345, 217, this.textureX, this.textureY);
/* 1680 */     this.ammoModel[70] = new ModelRendererTurbo(this, 177, 209, this.textureX, this.textureY);
/* 1681 */     this.ammoModel[71] = new ModelRendererTurbo(this, 761, 217, this.textureX, this.textureY);
/* 1682 */     this.ammoModel[72] = new ModelRendererTurbo(this, 817, 217, this.textureX, this.textureY);
/* 1683 */     this.ammoModel[73] = new ModelRendererTurbo(this, 233, 209, this.textureX, this.textureY);
/* 1684 */     this.ammoModel[74] = new ModelRendererTurbo(this, 873, 217, this.textureX, this.textureY);
/* 1685 */     this.ammoModel[75] = new ModelRendererTurbo(this, 929, 217, this.textureX, this.textureY);
/* 1686 */     this.ammoModel[76] = new ModelRendererTurbo(this, 289, 209, this.textureX, this.textureY);
/* 1687 */     this.ammoModel[77] = new ModelRendererTurbo(this, 377, 225, this.textureX, this.textureY);
/* 1688 */     this.ammoModel[78] = new ModelRendererTurbo(this, 433, 225, this.textureX, this.textureY);
/* 1689 */     this.ammoModel[79] = new ModelRendererTurbo(this, 705, 209, this.textureX, this.textureY);
/* 1690 */     this.ammoModel[80] = new ModelRendererTurbo(this, 497, 225, this.textureX, this.textureY);
/* 1691 */     this.ammoModel[81] = new ModelRendererTurbo(this, 553, 225, this.textureX, this.textureY);
/* 1692 */     this.ammoModel[82] = new ModelRendererTurbo(this, 793, 209, this.textureX, this.textureY);
/* 1693 */     this.ammoModel[83] = new ModelRendererTurbo(this, 609, 225, this.textureX, this.textureY);
/* 1694 */     this.ammoModel[84] = new ModelRendererTurbo(this, 961, 225, this.textureX, this.textureY);
/* 1695 */     this.ammoModel[85] = new ModelRendererTurbo(this, 849, 209, this.textureX, this.textureY);
/* 1696 */     this.ammoModel[86] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/* 1697 */     this.ammoModel[87] = new ModelRendererTurbo(this, 57, 233, this.textureX, this.textureY);
/* 1698 */     this.ammoModel[88] = new ModelRendererTurbo(this, 905, 209, this.textureX, this.textureY);
/* 1699 */     this.ammoModel[89] = new ModelRendererTurbo(this, 113, 233, this.textureX, this.textureY);
/* 1700 */     this.ammoModel[90] = new ModelRendererTurbo(this, 465, 233, this.textureX, this.textureY);
/* 1701 */     this.ammoModel[91] = new ModelRendererTurbo(this, 409, 217, this.textureX, this.textureY);
/* 1702 */     this.ammoModel[92] = new ModelRendererTurbo(this, 641, 233, this.textureX, this.textureY);
/* 1703 */     this.ammoModel[93] = new ModelRendererTurbo(this, 145, 241, this.textureX, this.textureY);
/* 1704 */     this.ammoModel[94] = new ModelRendererTurbo(this, 529, 217, this.textureX, this.textureY);
/* 1705 */     this.ammoModel[95] = new ModelRendererTurbo(this, 201, 241, this.textureX, this.textureY);
/* 1706 */     this.ammoModel[96] = new ModelRendererTurbo(this, 257, 241, this.textureX, this.textureY);
/* 1707 */     this.ammoModel[97] = new ModelRendererTurbo(this, 585, 217, this.textureX, this.textureY);
/* 1708 */     this.ammoModel[98] = new ModelRendererTurbo(this, 313, 241, this.textureX, this.textureY);
/* 1709 */     this.ammoModel[99] = new ModelRendererTurbo(this, 673, 241, this.textureX, this.textureY);
/* 1710 */     this.ammoModel[100] = new ModelRendererTurbo(this, 33, 225, this.textureX, this.textureY);
/* 1711 */     this.ammoModel[101] = new ModelRendererTurbo(this, 729, 241, this.textureX, this.textureY);
/* 1712 */     this.ammoModel[102] = new ModelRendererTurbo(this, 345, 249, this.textureX, this.textureY);
/* 1713 */     this.ammoModel[103] = new ModelRendererTurbo(this, 89, 225, this.textureX, this.textureY);
/* 1714 */     this.ammoModel[104] = new ModelRendererTurbo(this, 761, 249, this.textureX, this.textureY);
/* 1715 */     this.ammoModel[105] = new ModelRendererTurbo(this, 817, 249, this.textureX, this.textureY);
/* 1716 */     this.ammoModel[106] = new ModelRendererTurbo(this, 177, 233, this.textureX, this.textureY);
/* 1717 */     this.ammoModel[107] = new ModelRendererTurbo(this, 873, 249, this.textureX, this.textureY);
/* 1718 */     this.ammoModel[108] = new ModelRendererTurbo(this, 929, 249, this.textureX, this.textureY);
/* 1719 */     this.ammoModel[109] = new ModelRendererTurbo(this, 233, 233, this.textureX, this.textureY);
/* 1720 */     this.ammoModel[110] = new ModelRendererTurbo(this, 377, 257, this.textureX, this.textureY);
/* 1721 */     this.ammoModel[111] = new ModelRendererTurbo(this, 433, 257, this.textureX, this.textureY);
/* 1722 */     this.ammoModel[112] = new ModelRendererTurbo(this, 289, 233, this.textureX, this.textureY);
/* 1723 */     this.ammoModel[113] = new ModelRendererTurbo(this, 497, 257, this.textureX, this.textureY);
/* 1724 */     this.ammoModel[114] = new ModelRendererTurbo(this, 553, 257, this.textureX, this.textureY);
/* 1725 */     this.ammoModel[115] = new ModelRendererTurbo(this, 705, 233, this.textureX, this.textureY);
/* 1726 */     this.ammoModel[116] = new ModelRendererTurbo(this, 609, 257, this.textureX, this.textureY);
/* 1727 */     this.ammoModel[117] = new ModelRendererTurbo(this, 961, 257, this.textureX, this.textureY);
/* 1728 */     this.ammoModel[118] = new ModelRendererTurbo(this, 793, 233, this.textureX, this.textureY);
/* 1729 */     this.ammoModel[119] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/* 1730 */     this.ammoModel[120] = new ModelRendererTurbo(this, 57, 265, this.textureX, this.textureY);
/* 1731 */     this.ammoModel[121] = new ModelRendererTurbo(this, 113, 265, this.textureX, this.textureY);
/* 1732 */     this.ammoModel[122] = new ModelRendererTurbo(this, 465, 265, this.textureX, this.textureY);
/* 1733 */     this.ammoModel[123] = new ModelRendererTurbo(this, 641, 265, this.textureX, this.textureY);
/* 1734 */     this.ammoModel[124] = new ModelRendererTurbo(this, 145, 273, this.textureX, this.textureY);
/* 1735 */     this.ammoModel[125] = new ModelRendererTurbo(this, 201, 273, this.textureX, this.textureY);
/* 1736 */     this.ammoModel[126] = new ModelRendererTurbo(this, 257, 273, this.textureX, this.textureY);
/* 1737 */     this.ammoModel[127] = new ModelRendererTurbo(this, 313, 273, this.textureX, this.textureY);
/* 1738 */     this.ammoModel[''] = new ModelRendererTurbo(this, 673, 273, this.textureX, this.textureY);
/* 1739 */     this.ammoModel[''] = new ModelRendererTurbo(this, 729, 273, this.textureX, this.textureY);
/* 1740 */     this.ammoModel[''] = new ModelRendererTurbo(this, 345, 281, this.textureX, this.textureY);
/* 1741 */     this.ammoModel[''] = new ModelRendererTurbo(this, 761, 281, this.textureX, this.textureY);
/* 1742 */     this.ammoModel[''] = new ModelRendererTurbo(this, 817, 281, this.textureX, this.textureY);
/* 1743 */     this.ammoModel[''] = new ModelRendererTurbo(this, 873, 281, this.textureX, this.textureY);
/* 1744 */     this.ammoModel[''] = new ModelRendererTurbo(this, 929, 281, this.textureX, this.textureY);
/* 1745 */     this.ammoModel[''] = new ModelRendererTurbo(this, 377, 289, this.textureX, this.textureY);
/* 1746 */     this.ammoModel[''] = new ModelRendererTurbo(this, 433, 289, this.textureX, this.textureY);
/* 1747 */     this.ammoModel[''] = new ModelRendererTurbo(this, 497, 289, this.textureX, this.textureY);
/* 1748 */     this.ammoModel[''] = new ModelRendererTurbo(this, 553, 289, this.textureX, this.textureY);
/* 1749 */     this.ammoModel[''] = new ModelRendererTurbo(this, 609, 289, this.textureX, this.textureY);
/* 1750 */     this.ammoModel[''] = new ModelRendererTurbo(this, 961, 289, this.textureX, this.textureY);
/* 1751 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/* 1752 */     this.ammoModel[''] = new ModelRendererTurbo(this, 57, 297, this.textureX, this.textureY);
/* 1753 */     this.ammoModel[''] = new ModelRendererTurbo(this, 113, 297, this.textureX, this.textureY);
/* 1754 */     this.ammoModel[''] = new ModelRendererTurbo(this, 465, 297, this.textureX, this.textureY);
/* 1755 */     this.ammoModel[''] = new ModelRendererTurbo(this, 145, 305, this.textureX, this.textureY);
/* 1756 */     this.ammoModel[''] = new ModelRendererTurbo(this, 225, 305, this.textureX, this.textureY);
/* 1757 */     this.ammoModel[''] = new ModelRendererTurbo(this, 281, 305, this.textureX, this.textureY);
/* 1758 */     this.ammoModel[''] = new ModelRendererTurbo(this, 641, 305, this.textureX, this.textureY);
/* 1759 */     this.ammoModel[''] = new ModelRendererTurbo(this, 697, 305, this.textureX, this.textureY);
/* 1760 */     this.ammoModel[''] = new ModelRendererTurbo(this, 329, 313, this.textureX, this.textureY);
/* 1761 */     this.ammoModel[''] = new ModelRendererTurbo(this, 745, 313, this.textureX, this.textureY);
/* 1762 */     this.ammoModel[''] = new ModelRendererTurbo(this, 849, 233, this.textureX, this.textureY);
/* 1763 */     this.ammoModel[''] = new ModelRendererTurbo(this, 801, 313, this.textureX, this.textureY);
/* 1764 */     this.ammoModel[''] = new ModelRendererTurbo(this, 905, 233, this.textureX, this.textureY);
/* 1765 */     this.ammoModel[''] = new ModelRendererTurbo(this, 993, 177, this.textureX, this.textureY);
/* 1766 */     this.ammoModel[''] = new ModelRendererTurbo(this, 993, 129, this.textureX, this.textureY);
/* 1767 */     this.ammoModel[''] = new ModelRendererTurbo(this, 201, 305, this.textureX, this.textureY);
/* 1768 */     this.ammoModel[''] = new ModelRendererTurbo(this, 113, 137, this.textureX, this.textureY);
/* 1769 */     this.ammoModel[''] = new ModelRendererTurbo(this, 441, 129, this.textureX, this.textureY);
/* 1770 */     this.ammoModel[' '] = new ModelRendererTurbo(this, 769, 121, this.textureX, this.textureY);
/* 1771 */     this.ammoModel['¡'] = new ModelRendererTurbo(this, 505, 137, this.textureX, this.textureY);
/* 1772 */     this.ammoModel['¢'] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/* 1773 */     this.ammoModel['£'] = new ModelRendererTurbo(this, 801, 121, this.textureX, this.textureY);
/*      */     
/* 1775 */     this.ammoModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 86, 3, 16, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1776 */     this.ammoModel[0].setRotationPoint(-8.5F, -15.25F, -15.0F);
/*      */     
/* 1778 */     this.ammoModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 86, 8, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1779 */     this.ammoModel[1].setRotationPoint(-8.5F, -7.25F, -19.0F);
/*      */     
/* 1781 */     this.ammoModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 86, 5, 24, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1782 */     this.ammoModel[2].setRotationPoint(-8.5F, -12.25F, -19.0F);
/*      */     
/* 1784 */     this.ammoModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 86, 3, 16, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/* 1785 */     this.ammoModel[3].setRotationPoint(-8.5F, 5.75F, -15.0F);
/*      */     
/* 1787 */     this.ammoModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 86, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1788 */     this.ammoModel[4].setRotationPoint(-8.5F, 0.75F, -19.0F);
/*      */     
/* 1790 */     this.ammoModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1791 */     this.ammoModel[5].setRotationPoint(-6.5F, -11.25F, -19.0F);
/*      */     
/* 1793 */     this.ammoModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1794 */     this.ammoModel[6].setRotationPoint(-6.5F, -13.25F, -18.0F);
/*      */     
/* 1796 */     this.ammoModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1797 */     this.ammoModel[7].setRotationPoint(-0.5F, -11.25F, -19.0F);
/*      */     
/* 1799 */     this.ammoModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1800 */     this.ammoModel[8].setRotationPoint(-0.5F, -13.25F, -18.0F);
/*      */     
/* 1802 */     this.ammoModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1803 */     this.ammoModel[9].setRotationPoint(-3.5F, -11.25F, -19.0F);
/*      */     
/* 1805 */     this.ammoModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1806 */     this.ammoModel[10].setRotationPoint(-3.5F, -13.25F, -18.0F);
/*      */     
/* 1808 */     this.ammoModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1809 */     this.ammoModel[11].setRotationPoint(2.5F, -11.25F, -18.0F);
/*      */     
/* 1811 */     this.ammoModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1812 */     this.ammoModel[12].setRotationPoint(5.5F, -11.25F, -18.0F);
/*      */     
/* 1814 */     this.ammoModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1815 */     this.ammoModel[13].setRotationPoint(8.5F, -11.25F, -18.0F);
/*      */     
/* 1817 */     this.ammoModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1818 */     this.ammoModel[14].setRotationPoint(11.5F, -11.25F, -18.0F);
/*      */     
/* 1820 */     this.ammoModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1821 */     this.ammoModel[15].setRotationPoint(14.5F, -11.25F, -18.0F);
/*      */     
/* 1823 */     this.ammoModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1824 */     this.ammoModel[16].setRotationPoint(17.5F, -11.25F, -18.0F);
/*      */     
/* 1826 */     this.ammoModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1827 */     this.ammoModel[17].setRotationPoint(20.5F, -11.25F, -18.0F);
/*      */     
/* 1829 */     this.ammoModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1830 */     this.ammoModel[18].setRotationPoint(26.5F, -11.25F, -18.0F);
/*      */     
/* 1832 */     this.ammoModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1833 */     this.ammoModel[19].setRotationPoint(23.5F, -11.25F, -18.0F);
/*      */     
/* 1835 */     this.ammoModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1836 */     this.ammoModel[20].setRotationPoint(29.5F, -11.25F, -18.0F);
/*      */     
/* 1838 */     this.ammoModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1839 */     this.ammoModel[21].setRotationPoint(35.5F, -11.25F, -18.0F);
/*      */     
/* 1841 */     this.ammoModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1842 */     this.ammoModel[22].setRotationPoint(32.5F, -11.25F, -18.0F);
/*      */     
/* 1844 */     this.ammoModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1845 */     this.ammoModel[23].setRotationPoint(38.5F, -11.25F, -18.0F);
/*      */     
/* 1847 */     this.ammoModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1848 */     this.ammoModel[24].setRotationPoint(41.5F, -11.25F, -18.0F);
/*      */     
/* 1850 */     this.ammoModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1851 */     this.ammoModel[25].setRotationPoint(44.5F, -11.25F, -18.0F);
/*      */     
/* 1853 */     this.ammoModel[26].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1854 */     this.ammoModel[26].setRotationPoint(50.5F, -11.25F, -18.0F);
/*      */     
/* 1856 */     this.ammoModel[27].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1857 */     this.ammoModel[27].setRotationPoint(47.5F, -11.25F, -18.0F);
/*      */     
/* 1859 */     this.ammoModel[28].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1860 */     this.ammoModel[28].setRotationPoint(53.5F, -11.25F, -18.0F);
/*      */     
/* 1862 */     this.ammoModel[29].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1863 */     this.ammoModel[29].setRotationPoint(59.5F, -11.25F, -18.0F);
/*      */     
/* 1865 */     this.ammoModel[30].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1866 */     this.ammoModel[30].setRotationPoint(56.5F, -11.25F, -18.0F);
/*      */     
/* 1868 */     this.ammoModel[31].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1869 */     this.ammoModel[31].setRotationPoint(62.5F, -11.25F, -18.0F);
/*      */     
/* 1871 */     this.ammoModel[32].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1872 */     this.ammoModel[32].setRotationPoint(65.5F, -11.25F, -18.0F);
/*      */     
/* 1874 */     this.ammoModel[33].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1875 */     this.ammoModel[33].setRotationPoint(71.5F, -11.25F, -18.0F);
/*      */     
/* 1877 */     this.ammoModel[34].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1878 */     this.ammoModel[34].setRotationPoint(68.5F, -11.25F, -18.0F);
/*      */     
/* 1880 */     this.ammoModel[35].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 22, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1881 */     this.ammoModel[35].setRotationPoint(74.5F, -11.25F, -18.0F);
/*      */     
/* 1883 */     this.ammoModel[36].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1884 */     this.ammoModel[36].setRotationPoint(-6.5F, 0.75F, -19.0F);
/*      */     
/* 1886 */     this.ammoModel[37].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1887 */     this.ammoModel[37].setRotationPoint(-6.5F, 5.75F, -17.0F);
/*      */     
/* 1889 */     this.ammoModel[38].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1890 */     this.ammoModel[38].setRotationPoint(-6.5F, 3.75F, -18.5F);
/*      */     
/* 1892 */     this.ammoModel[39].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1893 */     this.ammoModel[39].setRotationPoint(-3.5F, 0.75F, -19.0F);
/*      */     
/* 1895 */     this.ammoModel[40].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1896 */     this.ammoModel[40].setRotationPoint(-3.5F, 5.75F, -17.0F);
/*      */     
/* 1898 */     this.ammoModel[41].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1899 */     this.ammoModel[41].setRotationPoint(-3.5F, 3.75F, -18.5F);
/*      */     
/* 1901 */     this.ammoModel[42].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1902 */     this.ammoModel[42].setRotationPoint(-0.5F, 0.75F, -19.0F);
/*      */     
/* 1904 */     this.ammoModel[43].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1905 */     this.ammoModel[43].setRotationPoint(-0.5F, 5.75F, -17.0F);
/*      */     
/* 1907 */     this.ammoModel[44].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1908 */     this.ammoModel[44].setRotationPoint(-0.5F, 3.75F, -18.5F);
/*      */     
/* 1910 */     this.ammoModel[45].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1911 */     this.ammoModel[45].setRotationPoint(2.5F, 0.75F, -19.0F);
/*      */     
/* 1913 */     this.ammoModel[46].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1914 */     this.ammoModel[46].setRotationPoint(2.5F, 5.75F, -17.0F);
/*      */     
/* 1916 */     this.ammoModel[47].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1917 */     this.ammoModel[47].setRotationPoint(2.5F, 3.75F, -18.5F);
/*      */     
/* 1919 */     this.ammoModel[48].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1920 */     this.ammoModel[48].setRotationPoint(5.5F, 0.75F, -19.0F);
/*      */     
/* 1922 */     this.ammoModel[49].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1923 */     this.ammoModel[49].setRotationPoint(5.5F, 5.75F, -17.0F);
/*      */     
/* 1925 */     this.ammoModel[50].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1926 */     this.ammoModel[50].setRotationPoint(5.5F, 3.75F, -18.5F);
/*      */     
/* 1928 */     this.ammoModel[51].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1929 */     this.ammoModel[51].setRotationPoint(8.5F, 0.75F, -19.0F);
/*      */     
/* 1931 */     this.ammoModel[52].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1932 */     this.ammoModel[52].setRotationPoint(8.5F, 5.75F, -17.0F);
/*      */     
/* 1934 */     this.ammoModel[53].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1935 */     this.ammoModel[53].setRotationPoint(8.5F, 3.75F, -18.5F);
/*      */     
/* 1937 */     this.ammoModel[54].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1938 */     this.ammoModel[54].setRotationPoint(11.5F, 0.75F, -19.0F);
/*      */     
/* 1940 */     this.ammoModel[55].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1941 */     this.ammoModel[55].setRotationPoint(11.5F, 5.75F, -17.0F);
/*      */     
/* 1943 */     this.ammoModel[56].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1944 */     this.ammoModel[56].setRotationPoint(11.5F, 3.75F, -18.5F);
/*      */     
/* 1946 */     this.ammoModel[57].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1947 */     this.ammoModel[57].setRotationPoint(14.5F, 0.75F, -19.0F);
/*      */     
/* 1949 */     this.ammoModel[58].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1950 */     this.ammoModel[58].setRotationPoint(14.5F, 5.75F, -17.0F);
/*      */     
/* 1952 */     this.ammoModel[59].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1953 */     this.ammoModel[59].setRotationPoint(14.5F, 3.75F, -18.5F);
/*      */     
/* 1955 */     this.ammoModel[60].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1956 */     this.ammoModel[60].setRotationPoint(17.5F, 0.75F, -19.0F);
/*      */     
/* 1958 */     this.ammoModel[61].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1959 */     this.ammoModel[61].setRotationPoint(17.5F, 5.75F, -17.0F);
/*      */     
/* 1961 */     this.ammoModel[62].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1962 */     this.ammoModel[62].setRotationPoint(17.5F, 3.75F, -18.5F);
/*      */     
/* 1964 */     this.ammoModel[63].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1965 */     this.ammoModel[63].setRotationPoint(20.5F, 0.75F, -19.0F);
/*      */     
/* 1967 */     this.ammoModel[64].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1968 */     this.ammoModel[64].setRotationPoint(20.5F, 5.75F, -17.0F);
/*      */     
/* 1970 */     this.ammoModel[65].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1971 */     this.ammoModel[65].setRotationPoint(20.5F, 3.75F, -18.5F);
/*      */     
/* 1973 */     this.ammoModel[66].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1974 */     this.ammoModel[66].setRotationPoint(23.5F, 0.75F, -19.0F);
/*      */     
/* 1976 */     this.ammoModel[67].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1977 */     this.ammoModel[67].setRotationPoint(23.5F, 5.75F, -17.0F);
/*      */     
/* 1979 */     this.ammoModel[68].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1980 */     this.ammoModel[68].setRotationPoint(23.5F, 3.75F, -18.5F);
/*      */     
/* 1982 */     this.ammoModel[69].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1983 */     this.ammoModel[69].setRotationPoint(26.5F, 0.75F, -19.0F);
/*      */     
/* 1985 */     this.ammoModel[70].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1986 */     this.ammoModel[70].setRotationPoint(26.5F, 5.75F, -17.0F);
/*      */     
/* 1988 */     this.ammoModel[71].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1989 */     this.ammoModel[71].setRotationPoint(26.5F, 3.75F, -18.5F);
/*      */     
/* 1991 */     this.ammoModel[72].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1992 */     this.ammoModel[72].setRotationPoint(29.5F, 0.75F, -19.0F);
/*      */     
/* 1994 */     this.ammoModel[73].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1995 */     this.ammoModel[73].setRotationPoint(29.5F, 5.75F, -17.0F);
/*      */     
/* 1997 */     this.ammoModel[74].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1998 */     this.ammoModel[74].setRotationPoint(29.5F, 3.75F, -18.5F);
/*      */     
/* 2000 */     this.ammoModel[75].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2001 */     this.ammoModel[75].setRotationPoint(32.5F, 0.75F, -19.0F);
/*      */     
/* 2003 */     this.ammoModel[76].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2004 */     this.ammoModel[76].setRotationPoint(32.5F, 5.75F, -17.0F);
/*      */     
/* 2006 */     this.ammoModel[77].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2007 */     this.ammoModel[77].setRotationPoint(32.5F, 3.75F, -18.5F);
/*      */     
/* 2009 */     this.ammoModel[78].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2010 */     this.ammoModel[78].setRotationPoint(35.5F, 0.75F, -19.0F);
/*      */     
/* 2012 */     this.ammoModel[79].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2013 */     this.ammoModel[79].setRotationPoint(35.5F, 5.75F, -17.0F);
/*      */     
/* 2015 */     this.ammoModel[80].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2016 */     this.ammoModel[80].setRotationPoint(35.5F, 3.75F, -18.5F);
/*      */     
/* 2018 */     this.ammoModel[81].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2019 */     this.ammoModel[81].setRotationPoint(38.5F, 0.75F, -19.0F);
/*      */     
/* 2021 */     this.ammoModel[82].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2022 */     this.ammoModel[82].setRotationPoint(38.5F, 5.75F, -17.0F);
/*      */     
/* 2024 */     this.ammoModel[83].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2025 */     this.ammoModel[83].setRotationPoint(38.5F, 3.75F, -18.5F);
/*      */     
/* 2027 */     this.ammoModel[84].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2028 */     this.ammoModel[84].setRotationPoint(41.5F, 0.75F, -19.0F);
/*      */     
/* 2030 */     this.ammoModel[85].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2031 */     this.ammoModel[85].setRotationPoint(41.5F, 5.75F, -17.0F);
/*      */     
/* 2033 */     this.ammoModel[86].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2034 */     this.ammoModel[86].setRotationPoint(41.5F, 3.75F, -18.5F);
/*      */     
/* 2036 */     this.ammoModel[87].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2037 */     this.ammoModel[87].setRotationPoint(44.5F, 0.75F, -19.0F);
/*      */     
/* 2039 */     this.ammoModel[88].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2040 */     this.ammoModel[88].setRotationPoint(44.5F, 5.75F, -17.0F);
/*      */     
/* 2042 */     this.ammoModel[89].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2043 */     this.ammoModel[89].setRotationPoint(44.5F, 3.75F, -18.5F);
/*      */     
/* 2045 */     this.ammoModel[90].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2046 */     this.ammoModel[90].setRotationPoint(47.5F, 0.75F, -19.0F);
/*      */     
/* 2048 */     this.ammoModel[91].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2049 */     this.ammoModel[91].setRotationPoint(47.5F, 5.75F, -17.0F);
/*      */     
/* 2051 */     this.ammoModel[92].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2052 */     this.ammoModel[92].setRotationPoint(47.5F, 3.75F, -18.5F);
/*      */     
/* 2054 */     this.ammoModel[93].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2055 */     this.ammoModel[93].setRotationPoint(50.5F, 0.75F, -19.0F);
/*      */     
/* 2057 */     this.ammoModel[94].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2058 */     this.ammoModel[94].setRotationPoint(50.5F, 5.75F, -17.0F);
/*      */     
/* 2060 */     this.ammoModel[95].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2061 */     this.ammoModel[95].setRotationPoint(50.5F, 3.75F, -18.5F);
/*      */     
/* 2063 */     this.ammoModel[96].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2064 */     this.ammoModel[96].setRotationPoint(53.5F, 0.75F, -19.0F);
/*      */     
/* 2066 */     this.ammoModel[97].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2067 */     this.ammoModel[97].setRotationPoint(53.5F, 5.75F, -17.0F);
/*      */     
/* 2069 */     this.ammoModel[98].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2070 */     this.ammoModel[98].setRotationPoint(53.5F, 3.75F, -18.5F);
/*      */     
/* 2072 */     this.ammoModel[99].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2073 */     this.ammoModel[99].setRotationPoint(56.5F, 0.75F, -19.0F);
/*      */     
/* 2075 */     this.ammoModel[100].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2076 */     this.ammoModel[100].setRotationPoint(56.5F, 5.75F, -17.0F);
/*      */     
/* 2078 */     this.ammoModel[101].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2079 */     this.ammoModel[101].setRotationPoint(56.5F, 3.75F, -18.5F);
/*      */     
/* 2081 */     this.ammoModel[102].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2082 */     this.ammoModel[102].setRotationPoint(59.5F, 0.75F, -19.0F);
/*      */     
/* 2084 */     this.ammoModel[103].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2085 */     this.ammoModel[103].setRotationPoint(59.5F, 5.75F, -17.0F);
/*      */     
/* 2087 */     this.ammoModel[104].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2088 */     this.ammoModel[104].setRotationPoint(59.5F, 3.75F, -18.5F);
/*      */     
/* 2090 */     this.ammoModel[105].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2091 */     this.ammoModel[105].setRotationPoint(62.5F, 0.75F, -19.0F);
/*      */     
/* 2093 */     this.ammoModel[106].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2094 */     this.ammoModel[106].setRotationPoint(62.5F, 5.75F, -17.0F);
/*      */     
/* 2096 */     this.ammoModel[107].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2097 */     this.ammoModel[107].setRotationPoint(62.5F, 3.75F, -18.5F);
/*      */     
/* 2099 */     this.ammoModel[108].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2100 */     this.ammoModel[108].setRotationPoint(65.5F, 0.75F, -19.0F);
/*      */     
/* 2102 */     this.ammoModel[109].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2103 */     this.ammoModel[109].setRotationPoint(65.5F, 5.75F, -17.0F);
/*      */     
/* 2105 */     this.ammoModel[110].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2106 */     this.ammoModel[110].setRotationPoint(65.5F, 3.75F, -18.5F);
/*      */     
/* 2108 */     this.ammoModel[111].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2109 */     this.ammoModel[111].setRotationPoint(68.5F, 0.75F, -19.0F);
/*      */     
/* 2111 */     this.ammoModel[112].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2112 */     this.ammoModel[112].setRotationPoint(68.5F, 5.75F, -17.0F);
/*      */     
/* 2114 */     this.ammoModel[113].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2115 */     this.ammoModel[113].setRotationPoint(68.5F, 3.75F, -18.5F);
/*      */     
/* 2117 */     this.ammoModel[114].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2118 */     this.ammoModel[114].setRotationPoint(71.5F, 0.75F, -19.0F);
/*      */     
/* 2120 */     this.ammoModel[115].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2121 */     this.ammoModel[115].setRotationPoint(71.5F, 5.75F, -17.0F);
/*      */     
/* 2123 */     this.ammoModel[116].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2124 */     this.ammoModel[116].setRotationPoint(71.5F, 3.75F, -18.5F);
/*      */     
/* 2126 */     this.ammoModel[117].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2127 */     this.ammoModel[117].setRotationPoint(74.5F, 0.75F, -19.0F);
/*      */     
/* 2129 */     this.ammoModel[118].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2130 */     this.ammoModel[118].setRotationPoint(74.5F, 5.75F, -17.0F);
/*      */     
/* 2132 */     this.ammoModel[119].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2133 */     this.ammoModel[119].setRotationPoint(74.5F, 3.75F, -18.5F);
/*      */     
/* 2135 */     this.ammoModel[120].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2136 */     this.ammoModel[120].setRotationPoint(2.5F, -10.25F, -19.0F);
/*      */     
/* 2138 */     this.ammoModel[121].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2139 */     this.ammoModel[121].setRotationPoint(8.5F, -10.25F, -19.0F);
/*      */     
/* 2141 */     this.ammoModel[122].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2142 */     this.ammoModel[122].setRotationPoint(5.5F, -10.25F, -19.0F);
/*      */     
/* 2144 */     this.ammoModel[123].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2145 */     this.ammoModel[123].setRotationPoint(11.5F, -10.25F, -19.0F);
/*      */     
/* 2147 */     this.ammoModel[124].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2148 */     this.ammoModel[124].setRotationPoint(17.5F, -10.25F, -19.0F);
/*      */     
/* 2150 */     this.ammoModel[125].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2151 */     this.ammoModel[125].setRotationPoint(14.5F, -10.25F, -19.0F);
/*      */     
/* 2153 */     this.ammoModel[126].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2154 */     this.ammoModel[126].setRotationPoint(20.5F, -10.25F, -19.0F);
/*      */     
/* 2156 */     this.ammoModel[127].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2157 */     this.ammoModel[127].setRotationPoint(26.5F, -10.25F, -19.0F);
/*      */     
/* 2159 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2160 */     this.ammoModel[''].setRotationPoint(23.5F, -10.25F, -19.0F);
/*      */     
/* 2162 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2163 */     this.ammoModel[''].setRotationPoint(29.5F, -10.25F, -19.0F);
/*      */     
/* 2165 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2166 */     this.ammoModel[''].setRotationPoint(35.5F, -10.25F, -19.0F);
/*      */     
/* 2168 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2169 */     this.ammoModel[''].setRotationPoint(32.5F, -10.25F, -19.0F);
/*      */     
/* 2171 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2172 */     this.ammoModel[''].setRotationPoint(38.5F, -10.25F, -19.0F);
/*      */     
/* 2174 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2175 */     this.ammoModel[''].setRotationPoint(44.5F, -10.25F, -19.0F);
/*      */     
/* 2177 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2178 */     this.ammoModel[''].setRotationPoint(41.5F, -10.25F, -19.0F);
/*      */     
/* 2180 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2181 */     this.ammoModel[''].setRotationPoint(47.5F, -10.25F, -19.0F);
/*      */     
/* 2183 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2184 */     this.ammoModel[''].setRotationPoint(53.5F, -10.25F, -19.0F);
/*      */     
/* 2186 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2187 */     this.ammoModel[''].setRotationPoint(50.5F, -10.25F, -19.0F);
/*      */     
/* 2189 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2190 */     this.ammoModel[''].setRotationPoint(56.5F, -10.25F, -19.0F);
/*      */     
/* 2192 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2193 */     this.ammoModel[''].setRotationPoint(62.5F, -10.25F, -19.0F);
/*      */     
/* 2195 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2196 */     this.ammoModel[''].setRotationPoint(59.5F, -10.25F, -19.0F);
/*      */     
/* 2198 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2199 */     this.ammoModel[''].setRotationPoint(65.5F, -10.25F, -19.0F);
/*      */     
/* 2201 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2202 */     this.ammoModel[''].setRotationPoint(71.5F, -10.25F, -19.0F);
/*      */     
/* 2204 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2205 */     this.ammoModel[''].setRotationPoint(68.5F, -10.25F, -19.0F);
/*      */     
/* 2207 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2208 */     this.ammoModel[''].setRotationPoint(74.5F, -10.25F, -19.0F);
/*      */     
/* 2210 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 14, 9, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2211 */     this.ammoModel[''].setRotationPoint(77.5F, -7.75F, -19.5F);
/*      */     
/* 2213 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 14, 5, 25, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2214 */     this.ammoModel[''].setRotationPoint(77.5F, -12.75F, -19.5F);
/*      */     
/* 2216 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 14, 3, 19, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2217 */     this.ammoModel[''].setRotationPoint(77.5F, -15.75F, -16.5F);
/*      */     
/* 2219 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 14, 5, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2220 */     this.ammoModel[''].setRotationPoint(77.5F, 1.25F, -19.5F);
/*      */     
/* 2222 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 14, 3, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/* 2223 */     this.ammoModel[''].setRotationPoint(77.5F, 6.25F, -16.5F);
/*      */     
/* 2225 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 9, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2226 */     this.ammoModel[''].setRotationPoint(-9.5F, -7.75F, -19.5F);
/*      */     
/* 2228 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 25, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2229 */     this.ammoModel[''].setRotationPoint(-9.5F, -12.75F, -19.5F);
/*      */     
/* 2231 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 19, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2232 */     this.ammoModel[''].setRotationPoint(-9.5F, -15.75F, -16.5F);
/*      */     
/* 2234 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2235 */     this.ammoModel[''].setRotationPoint(-9.5F, 1.25F, -19.5F);
/*      */     
/* 2237 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/* 2238 */     this.ammoModel[''].setRotationPoint(-9.5F, 6.25F, -16.5F);
/*      */     
/* 2240 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 17, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2241 */     this.ammoModel[''].setRotationPoint(-14.5F, -15.75F, -11.5F);
/*      */     
/* 2243 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 10, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 2244 */     this.ammoModel[''].setRotationPoint(-14.5F, 1.25F, -10.5F);
/*      */     
/* 2246 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 17, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2247 */     this.ammoModel[''].setRotationPoint(-9.5F, 8.25F, -10.5F);
/*      */     
/* 2249 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2250 */     this.ammoModel[''].setRotationPoint(83.5F, -15.75F, -3.5F);
/*      */     
/* 2252 */     this.ammoModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 2253 */     this.ammoModel[''].setRotationPoint(83.5F, -17.75F, -4.0F);
/*      */     
/* 2255 */     this.ammoModel[' '].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 2256 */     this.ammoModel[' '].setRotationPoint(83.5F, -18.75F, -4.0F);
/*      */     
/* 2258 */     this.ammoModel['¡'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2259 */     this.ammoModel['¡'].setRotationPoint(83.5F, -15.75F, -16.5F);
/*      */     
/* 2261 */     this.ammoModel['¢'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2262 */     this.ammoModel['¢'].setRotationPoint(83.5F, -17.75F, -17.0F);
/*      */     
/* 2264 */     this.ammoModel['£'].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 6, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2265 */     this.ammoModel['£'].setRotationPoint(83.5F, -18.75F, -16.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 2270 */     this.slideModel[0] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 2271 */     this.slideModel[1] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/* 2272 */     this.slideModel[2] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/* 2273 */     this.slideModel[3] = new ModelRendererTurbo(this, 817, 49, this.textureX, this.textureY);
/* 2274 */     this.slideModel[4] = new ModelRendererTurbo(this, 529, 57, this.textureX, this.textureY);
/* 2275 */     this.slideModel[5] = new ModelRendererTurbo(this, 521, 17, this.textureX, this.textureY);
/* 2276 */     this.slideModel[6] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/* 2277 */     this.slideModel[7] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/* 2278 */     this.slideModel[8] = new ModelRendererTurbo(this, 585, 89, this.textureX, this.textureY);
/* 2279 */     this.slideModel[9] = new ModelRendererTurbo(this, 729, 41, this.textureX, this.textureY);
/* 2280 */     this.slideModel[10] = new ModelRendererTurbo(this, 937, 89, this.textureX, this.textureY);
/* 2281 */     this.slideModel[11] = new ModelRendererTurbo(this, 865, 57, this.textureX, this.textureY);
/*      */     
/* 2283 */     this.slideModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 21, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2284 */     this.slideModel[0].setRotationPoint(-28.5F, -24.75F, -14.0F);
/*      */     
/* 2286 */     this.slideModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 21, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2287 */     this.slideModel[1].setRotationPoint(-28.5F, -25.75F, -13.0F);
/*      */     
/* 2289 */     this.slideModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 29, 5, 9, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2290 */     this.slideModel[2].setRotationPoint(-28.5F, -30.75F, -12.0F);
/*      */     
/* 2292 */     this.slideModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 8, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2293 */     this.slideModel[3].setRotationPoint(-7.5F, -24.75F, -14.0F);
/*      */     
/* 2295 */     this.slideModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2296 */     this.slideModel[4].setRotationPoint(-7.5F, -25.75F, -13.0F);
/*      */     
/* 2298 */     this.slideModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2299 */     this.slideModel[5].setRotationPoint(-24.5F, -25.75F, -16.0F);
/*      */     
/* 2301 */     this.slideModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2302 */     this.slideModel[6].setRotationPoint(-23.5F, -25.75F, -14.0F);
/*      */     
/* 2304 */     this.slideModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2305 */     this.slideModel[7].setRotationPoint(-23.5F, -25.75F, -16.0F);
/*      */     
/* 2307 */     this.slideModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2308 */     this.slideModel[8].setRotationPoint(-24.5F, -25.75F, -18.0F);
/*      */     
/* 2310 */     this.slideModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2311 */     this.slideModel[9].setRotationPoint(-24.5F, -23.75F, -18.0F);
/*      */     
/* 2313 */     this.slideModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2314 */     this.slideModel[10].setRotationPoint(-24.5F, -27.0F, -18.0F);
/*      */     
/* 2316 */     this.slideModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2317 */     this.slideModel[11].setRotationPoint(-24.5F, -25.75F, -19.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelbizon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */