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
/*      */ public class Modelhamr
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelhamr()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ȅ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[92];
/*   23 */     this.ammoModel = new ModelRendererTurbo[32];
/*   24 */     this.slideModel = new ModelRendererTurbo[44];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initgunModel_2();
/*   28 */     initdefaultScopeModel_1();
/*   29 */     initammoModel_1();
/*   30 */     initslideModel_1();
/*      */     
/*      */ 
/*   33 */     this.gripAttachPoint = new Vector3f(8.1875F, 3.5F, 0.0F);
/*   34 */     this.scopeAttachPoint = new Vector3f(0.625F, 5.4375F, 0.0F);
/*      */     
/*   36 */     translateAll(-0.5F, -11.5F, -0.35F);
/*   37 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.07F, 0.0F);
/*      */     
/*   39 */     this.gunSlideDistance = 2.75F;
/*   40 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   43 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   48 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[1] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[2] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[3] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[4] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[5] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[6] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[7] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[8] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[9] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[10] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[11] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*   60 */     this.gunModel[12] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*   61 */     this.gunModel[13] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/*   62 */     this.gunModel[14] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[15] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/*   64 */     this.gunModel[16] = new ModelRendererTurbo(this, 841, 17, this.textureX, this.textureY);
/*   65 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   66 */     this.gunModel[18] = new ModelRendererTurbo(this, 713, 17, this.textureX, this.textureY);
/*   67 */     this.gunModel[19] = new ModelRendererTurbo(this, 745, 17, this.textureX, this.textureY);
/*   68 */     this.gunModel[20] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*   69 */     this.gunModel[21] = new ModelRendererTurbo(this, 929, 17, this.textureX, this.textureY);
/*   70 */     this.gunModel[22] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*   71 */     this.gunModel[23] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[24] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[25] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*   74 */     this.gunModel[26] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[27] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[28] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/*   77 */     this.gunModel[29] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[30] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[31] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[32] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/*   81 */     this.gunModel[33] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[34] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[35] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[36] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[37] = new ModelRendererTurbo(this, 513, 17, this.textureX, this.textureY);
/*   86 */     this.gunModel[38] = new ModelRendererTurbo(this, 697, 17, this.textureX, this.textureY);
/*   87 */     this.gunModel[39] = new ModelRendererTurbo(this, 625, 9, this.textureX, this.textureY);
/*   88 */     this.gunModel[40] = new ModelRendererTurbo(this, 697, 25, this.textureX, this.textureY);
/*   89 */     this.gunModel[41] = new ModelRendererTurbo(this, 769, 25, this.textureX, this.textureY);
/*   90 */     this.gunModel[42] = new ModelRendererTurbo(this, 825, 25, this.textureX, this.textureY);
/*   91 */     this.gunModel[43] = new ModelRendererTurbo(this, 985, 25, this.textureX, this.textureY);
/*   92 */     this.gunModel[44] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*   93 */     this.gunModel[45] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*   94 */     this.gunModel[46] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*   95 */     this.gunModel[47] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*   96 */     this.gunModel[48] = new ModelRendererTurbo(this, 513, 33, this.textureX, this.textureY);
/*   97 */     this.gunModel[49] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*   98 */     this.gunModel[50] = new ModelRendererTurbo(this, 641, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[51] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
/*  100 */     this.gunModel[52] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  101 */     this.gunModel[53] = new ModelRendererTurbo(this, 817, 73, this.textureX, this.textureY);
/*  102 */     this.gunModel[54] = new ModelRendererTurbo(this, 193, 81, this.textureX, this.textureY);
/*  103 */     this.gunModel[55] = new ModelRendererTurbo(this, 817, 89, this.textureX, this.textureY);
/*  104 */     this.gunModel[56] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/*  105 */     this.gunModel[57] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*  106 */     this.gunModel[58] = new ModelRendererTurbo(this, 881, 41, this.textureX, this.textureY);
/*  107 */     this.gunModel[59] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  108 */     this.gunModel[60] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/*  109 */     this.gunModel[61] = new ModelRendererTurbo(this, 569, 97, this.textureX, this.textureY);
/*  110 */     this.gunModel[62] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  111 */     this.gunModel[63] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  112 */     this.gunModel[64] = new ModelRendererTurbo(this, 641, 33, this.textureX, this.textureY);
/*  113 */     this.gunModel[65] = new ModelRendererTurbo(this, 385, 113, this.textureX, this.textureY);
/*  114 */     this.gunModel[66] = new ModelRendererTurbo(this, 785, 105, this.textureX, this.textureY);
/*  115 */     this.gunModel[67] = new ModelRendererTurbo(this, 689, 97, this.textureX, this.textureY);
/*  116 */     this.gunModel[68] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  117 */     this.gunModel[69] = new ModelRendererTurbo(this, 665, 33, this.textureX, this.textureY);
/*  118 */     this.gunModel[70] = new ModelRendererTurbo(this, 737, 33, this.textureX, this.textureY);
/*  119 */     this.gunModel[71] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/*  120 */     this.gunModel[72] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/*  121 */     this.gunModel[73] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  122 */     this.gunModel[74] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/*  123 */     this.gunModel[75] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  124 */     this.gunModel[76] = new ModelRendererTurbo(this, 393, 161, this.textureX, this.textureY);
/*  125 */     this.gunModel[77] = new ModelRendererTurbo(this, 785, 121, this.textureX, this.textureY);
/*  126 */     this.gunModel[78] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  127 */     this.gunModel[79] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/*  128 */     this.gunModel[80] = new ModelRendererTurbo(this, 993, 65, this.textureX, this.textureY);
/*  129 */     this.gunModel[81] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/*  130 */     this.gunModel[82] = new ModelRendererTurbo(this, 1001, 81, this.textureX, this.textureY);
/*  131 */     this.gunModel[83] = new ModelRendererTurbo(this, 1001, 97, this.textureX, this.textureY);
/*  132 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  133 */     this.gunModel[85] = new ModelRendererTurbo(this, 953, 105, this.textureX, this.textureY);
/*  134 */     this.gunModel[86] = new ModelRendererTurbo(this, 729, 129, this.textureX, this.textureY);
/*  135 */     this.gunModel[87] = new ModelRendererTurbo(this, 953, 129, this.textureX, this.textureY);
/*  136 */     this.gunModel[88] = new ModelRendererTurbo(this, 817, 137, this.textureX, this.textureY);
/*  137 */     this.gunModel[89] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/*  138 */     this.gunModel[90] = new ModelRendererTurbo(this, 985, 113, this.textureX, this.textureY);
/*  139 */     this.gunModel[91] = new ModelRendererTurbo(this, 761, 129, this.textureX, this.textureY);
/*  140 */     this.gunModel[92] = new ModelRendererTurbo(this, 145, 121, this.textureX, this.textureY);
/*  141 */     this.gunModel[93] = new ModelRendererTurbo(this, 849, 137, this.textureX, this.textureY);
/*  142 */     this.gunModel[94] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*  143 */     this.gunModel[95] = new ModelRendererTurbo(this, 889, 137, this.textureX, this.textureY);
/*  144 */     this.gunModel[96] = new ModelRendererTurbo(this, 521, 17, this.textureX, this.textureY);
/*  145 */     this.gunModel[97] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/*  146 */     this.gunModel[98] = new ModelRendererTurbo(this, 873, 145, this.textureX, this.textureY);
/*  147 */     this.gunModel[99] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  148 */     this.gunModel[100] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*  149 */     this.gunModel[101] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  150 */     this.gunModel[102] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  151 */     this.gunModel[103] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  152 */     this.gunModel[104] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[105] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  154 */     this.gunModel[106] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  155 */     this.gunModel[107] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[108] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[109] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[110] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[111] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  160 */     this.gunModel[112] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  161 */     this.gunModel[113] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[114] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  163 */     this.gunModel[115] = new ModelRendererTurbo(this, 713, 17, this.textureX, this.textureY);
/*  164 */     this.gunModel[116] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  165 */     this.gunModel[117] = new ModelRendererTurbo(this, 929, 137, this.textureX, this.textureY);
/*  166 */     this.gunModel[118] = new ModelRendererTurbo(this, 953, 145, this.textureX, this.textureY);
/*  167 */     this.gunModel[119] = new ModelRendererTurbo(this, 817, 153, this.textureX, this.textureY);
/*  168 */     this.gunModel[120] = new ModelRendererTurbo(this, 897, 153, this.textureX, this.textureY);
/*  169 */     this.gunModel[121] = new ModelRendererTurbo(this, 977, 153, this.textureX, this.textureY);
/*  170 */     this.gunModel[122] = new ModelRendererTurbo(this, 769, 161, this.textureX, this.textureY);
/*  171 */     this.gunModel[123] = new ModelRendererTurbo(this, 857, 161, this.textureX, this.textureY);
/*  172 */     this.gunModel[124] = new ModelRendererTurbo(this, 921, 161, this.textureX, this.textureY);
/*  173 */     this.gunModel[125] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  174 */     this.gunModel[126] = new ModelRendererTurbo(this, 33, 169, this.textureX, this.textureY);
/*  175 */     this.gunModel[127] = new ModelRendererTurbo(this, 65, 169, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 169, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 169, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 169, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 169, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 169, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 17, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 801, 17, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 825, 17, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 17, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 929, 17, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 17, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 25, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 169, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 1001, 137, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 145, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 1001, 153, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 657, 33, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 681, 33, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 793, 161, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 169, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 689, 41, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 713, 41, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 169, this.textureX, this.textureY);
/*  208 */     this.gunModel[' '] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/*  209 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 457, 169, this.textureX, this.textureY);
/*  210 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 673, 169, this.textureX, this.textureY);
/*  211 */     this.gunModel['£'] = new ModelRendererTurbo(this, 705, 169, this.textureX, this.textureY);
/*  212 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 881, 161, this.textureX, this.textureY);
/*  213 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 737, 169, this.textureX, this.textureY);
/*  214 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 945, 169, this.textureX, this.textureY);
/*  215 */     this.gunModel['§'] = new ModelRendererTurbo(this, 753, 177, this.textureX, this.textureY);
/*  216 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 793, 177, this.textureX, this.textureY);
/*  217 */     this.gunModel['©'] = new ModelRendererTurbo(this, 153, 105, this.textureX, this.textureY);
/*  218 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 529, 169, this.textureX, this.textureY);
/*  219 */     this.gunModel['«'] = new ModelRendererTurbo(this, 825, 177, this.textureX, this.textureY);
/*  220 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 881, 177, this.textureX, this.textureY);
/*  221 */     this.gunModel['­'] = new ModelRendererTurbo(this, 337, 177, this.textureX, this.textureY);
/*  222 */     this.gunModel['®'] = new ModelRendererTurbo(this, 921, 177, this.textureX, this.textureY);
/*  223 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 385, 177, this.textureX, this.textureY);
/*  224 */     this.gunModel['°'] = new ModelRendererTurbo(this, 969, 177, this.textureX, this.textureY);
/*  225 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  226 */     this.gunModel['²'] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/*  227 */     this.gunModel['³'] = new ModelRendererTurbo(this, 81, 185, this.textureX, this.textureY);
/*  228 */     this.gunModel['´'] = new ModelRendererTurbo(this, 121, 185, this.textureX, this.textureY);
/*  229 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 161, 185, this.textureX, this.textureY);
/*  230 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 201, 185, this.textureX, this.textureY);
/*  231 */     this.gunModel['·'] = new ModelRendererTurbo(this, 241, 185, this.textureX, this.textureY);
/*  232 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 409, 185, this.textureX, this.textureY);
/*  233 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 545, 185, this.textureX, this.textureY);
/*  234 */     this.gunModel['º'] = new ModelRendererTurbo(this, 617, 185, this.textureX, this.textureY);
/*  235 */     this.gunModel['»'] = new ModelRendererTurbo(this, 313, 185, this.textureX, this.textureY);
/*  236 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 481, 185, this.textureX, this.textureY);
/*  237 */     this.gunModel['½'] = new ModelRendererTurbo(this, 865, 177, this.textureX, this.textureY);
/*  238 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 713, 129, this.textureX, this.textureY);
/*  239 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 673, 185, this.textureX, this.textureY);
/*  240 */     this.gunModel['À'] = new ModelRendererTurbo(this, 705, 185, this.textureX, this.textureY);
/*  241 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 337, 193, this.textureX, this.textureY);
/*  242 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 905, 177, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 1001, 177, this.textureX, this.textureY);
/*  244 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 729, 193, this.textureX, this.textureY);
/*  245 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 785, 193, this.textureX, this.textureY);
/*  246 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/*  247 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 25, 185, this.textureX, this.textureY);
/*  248 */     this.gunModel['È'] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  249 */     this.gunModel['É'] = new ModelRendererTurbo(this, 497, 185, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 65, 185, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 105, 185, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 145, 201, this.textureX, this.textureY);
/*  253 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 145, 185, this.textureX, this.textureY);
/*  254 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 185, 185, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 209, 201, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 241, 201, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 225, 185, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 297, 185, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 465, 185, this.textureX, this.textureY);
/*  261 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 313, 201, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 409, 201, this.textureX, this.textureY);
/*  263 */     this.gunModel['×'] = new ModelRendererTurbo(this, 449, 201, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 529, 201, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 569, 201, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 593, 201, this.textureX, this.textureY);
/*  267 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 1017, 65, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  270 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  271 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  272 */     this.gunModel['à'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  273 */     this.gunModel['á'] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  274 */     this.gunModel['â'] = new ModelRendererTurbo(this, 785, 33, this.textureX, this.textureY);
/*  275 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*  276 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 529, 65, this.textureX, this.textureY);
/*  277 */     this.gunModel['å'] = new ModelRendererTurbo(this, 409, 217, this.textureX, this.textureY);
/*  278 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 9, 81, this.textureX, this.textureY);
/*  279 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 945, 105, this.textureX, this.textureY);
/*  280 */     this.gunModel['è'] = new ModelRendererTurbo(this, 825, 33, this.textureX, this.textureY);
/*  281 */     this.gunModel['é'] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*  282 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  283 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  284 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  285 */     this.gunModel['í'] = new ModelRendererTurbo(this, 625, 65, this.textureX, this.textureY);
/*  286 */     this.gunModel['î'] = new ModelRendererTurbo(this, 897, 65, this.textureX, this.textureY);
/*  287 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 929, 65, this.textureX, this.textureY);
/*  288 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 753, 17, this.textureX, this.textureY);
/*  289 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  290 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  291 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 945, 65, this.textureX, this.textureY);
/*  292 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 969, 65, this.textureX, this.textureY);
/*  293 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/*  294 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 673, 97, this.textureX, this.textureY);
/*  295 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 785, 97, this.textureX, this.textureY);
/*  296 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 313, 121, this.textureX, this.textureY);
/*  297 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/*  298 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  299 */     this.gunModel['û'] = new ModelRendererTurbo(this, 33, 137, this.textureX, this.textureY);
/*  300 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  301 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 561, 97, this.textureX, this.textureY);
/*  302 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/*  303 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/*  305 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 929, 105, this.textureX, this.textureY);
/*  307 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/*  309 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  311 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 705, 25, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 1009, 113, this.textureX, this.textureY);
/*  313 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 97, 137, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  315 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  316 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*  317 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1001, 129, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 185, 137, this.textureX, this.textureY);
/*  319 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 209, 137, this.textureX, this.textureY);
/*  320 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/*  321 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 281, 137, this.textureX, this.textureY);
/*  323 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 841, 161, this.textureX, this.textureY);
/*  324 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 129, 137, this.textureX, this.textureY);
/*  325 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 641, 33, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*  327 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 705, 41, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 289, 201, this.textureX, this.textureY);
/*  329 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 689, 201, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 545, 201, this.textureX, this.textureY);
/*  331 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 705, 201, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 873, 201, this.textureX, this.textureY);
/*  333 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 657, 33, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  335 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 961, 201, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 345, 209, this.textureX, this.textureY);
/*  337 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 841, 209, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 881, 41, this.textureX, this.textureY);
/*  339 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1017, 41, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/*  341 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 193, 81, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  343 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 177, 217, this.textureX, this.textureY);
/*  345 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 593, 217, this.textureX, this.textureY);
/*  346 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 889, 209, this.textureX, this.textureY);
/*  347 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 17, 209, this.textureX, this.textureY);
/*  348 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 497, 217, this.textureX, this.textureY);
/*  349 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 937, 209, this.textureX, this.textureY);
/*  350 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 649, 225, this.textureX, this.textureY);
/*  351 */     this.gunModel['į'] = new ModelRendererTurbo(this, 49, 233, this.textureX, this.textureY);
/*  352 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 217, 233, this.textureX, this.textureY);
/*  353 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 337, 225, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 409, 233, this.textureX, this.textureY);
/*  355 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 785, 233, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 921, 233, this.textureX, this.textureY);
/*  357 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 337, 241, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 473, 241, this.textureX, this.textureY);
/*  359 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 993, 209, this.textureX, this.textureY);
/*  360 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 169, 241, this.textureX, this.textureY);
/*  362 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 561, 169, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 593, 169, this.textureX, this.textureY);
/*  364 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 625, 169, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 657, 169, this.textureX, this.textureY);
/*  366 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 193, 249, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 57, 257, this.textureX, this.textureY);
/*  368 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 401, 257, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 537, 257, this.textureX, this.textureY);
/*  370 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 297, 249, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 881, 249, this.textureX, this.textureY);
/*  372 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 769, 193, this.textureX, this.textureY);
/*  373 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 601, 185, this.textureX, this.textureY);
/*  374 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 617, 257, this.textureX, this.textureY);
/*  375 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 129, 201, this.textureX, this.textureY);
/*  376 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 217, 217, this.textureX, this.textureY);
/*  377 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 633, 217, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 65, 217, this.textureX, this.textureY);
/*  379 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 145, 257, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 633, 257, this.textureX, this.textureY);
/*  381 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 681, 257, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 433, 201, this.textureX, this.textureY);
/*  383 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 473, 201, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 713, 257, this.textureX, this.textureY);
/*  385 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 745, 257, this.textureX, this.textureY);
/*  386 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 777, 257, this.textureX, this.textureY);
/*  387 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 801, 257, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 913, 257, this.textureX, this.textureY);
/*  389 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 961, 257, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/*  391 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 169, 265, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 217, 265, this.textureX, this.textureY);
/*  393 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 833, 257, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 465, 265, this.textureX, this.textureY);
/*  395 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 49, 273, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 89, 273, this.textureX, this.textureY);
/*  397 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 249, 273, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 305, 137, this.textureX, this.textureY);
/*  399 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 793, 137, this.textureX, this.textureY);
/*  400 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 905, 137, this.textureX, this.textureY);
/*  401 */     this.gunModel['š'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 873, 137, this.textureX, this.textureY);
/*  403 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 929, 137, this.textureX, this.textureY);
/*  404 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 977, 145, this.textureX, this.textureY);
/*  405 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 953, 105, this.textureX, this.textureY);
/*  406 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 961, 217, this.textureX, this.textureY);
/*  407 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 753, 169, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 993, 201, this.textureX, this.textureY);
/*  409 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 329, 281, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 673, 281, this.textureX, this.textureY);
/*  411 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 793, 289, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/*  413 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 129, 289, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 281, 289, this.textureX, this.textureY);
/*  415 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 345, 297, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 609, 297, this.textureX, this.textureY);
/*  417 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 737, 297, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 865, 297, this.textureX, this.textureY);
/*  419 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 137, 305, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 465, 305, this.textureX, this.textureY);
/*  421 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 729, 305, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 1, 313, this.textureX, this.textureY);
/*  423 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 769, 225, this.textureX, this.textureY);
/*  424 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 369, 193, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 945, 257, this.textureX, this.textureY);
/*  426 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 897, 249, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 801, 97, this.textureX, this.textureY);
/*  428 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 809, 161, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 497, 209, this.textureX, this.textureY);
/*  430 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 489, 265, this.textureX, this.textureY);
/*  431 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 497, 281, this.textureX, this.textureY);
/*  432 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 593, 217, this.textureX, this.textureY);
/*  433 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 993, 257, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 601, 257, this.textureX, this.textureY);
/*  435 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 657, 217, this.textureX, this.textureY);
/*  436 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 737, 217, this.textureX, this.textureY);
/*  437 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 97, 225, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 617, 273, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 689, 169, this.textureX, this.textureY);
/*  440 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 777, 25, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 249, 305, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 953, 145, this.textureX, this.textureY);
/*  444 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  445 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 25, 169, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 897, 161, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 57, 169, this.textureX, this.textureY);
/*  450 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 665, 257, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 385, 169, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 729, 185, this.textureX, this.textureY);
/*  453 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 289, 249, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 945, 185, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 889, 137, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  459 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 873, 145, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 897, 201, this.textureX, this.textureY);
/*  462 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 337, 209, this.textureX, this.textureY);
/*  463 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 521, 209, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 681, 217, this.textureX, this.textureY);
/*  465 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 761, 217, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 961, 193, this.textureX, this.textureY);
/*  467 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  469 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 993, 65, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 817, 97, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  472 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/*  473 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 785, 137, this.textureX, this.textureY);
/*  474 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 809, 137, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 929, 145, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 817, 153, this.textureX, this.textureY);
/*  477 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 881, 161, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 921, 161, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  480 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 89, 169, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 129, 169, this.textureX, this.textureY);
/*  482 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 153, 169, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 193, 169, this.textureX, this.textureY);
/*  484 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 281, 169, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 841, 273, this.textureX, this.textureY);
/*  486 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 993, 273, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 465, 289, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 993, 289, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 289, 305, this.textureX, this.textureY);
/*  490 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 321, 305, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 569, 305, this.textureX, this.textureY);
/*  492 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 345, 169, this.textureX, this.textureY);
/*  493 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 841, 153, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 425, 169, this.textureX, this.textureY);
/*  495 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 449, 169, this.textureX, this.textureY);
/*  496 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 473, 169, this.textureX, this.textureY);
/*  497 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 505, 169, this.textureX, this.textureY);
/*  498 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 873, 217, this.textureX, this.textureY);
/*  499 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 1009, 65, this.textureX, this.textureY);
/*  500 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 993, 25, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  502 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 409, 185, this.textureX, this.textureY);
/*  503 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 129, 225, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 817, 73, this.textureX, this.textureY);
/*  506 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 1001, 81, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 729, 169, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 857, 169, this.textureX, this.textureY);
/*  509 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 945, 169, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/*  511 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 777, 33, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/*  513 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/*  514 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 729, 41, this.textureX, this.textureY);
/*  515 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 1017, 81, this.textureX, this.textureY);
/*  516 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 825, 177, this.textureX, this.textureY);
/*  517 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 1001, 97, this.textureX, this.textureY);
/*  518 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 585, 313, this.textureX, this.textureY);
/*  519 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 433, 313, this.textureX, this.textureY);
/*  520 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 857, 313, this.textureX, this.textureY);
/*  521 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 281, 329, this.textureX, this.textureY);
/*  522 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 313, 305, this.textureX, this.textureY);
/*  523 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 225, 313, this.textureX, this.textureY);
/*  524 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 545, 313, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 801, 313, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 969, 313, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 81, 185, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*  530 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 121, 185, this.textureX, this.textureY);
/*  531 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 161, 185, this.textureX, this.textureY);
/*  532 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 481, 233, this.textureX, this.textureY);
/*  533 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 353, 273, this.textureX, this.textureY);
/*  534 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 377, 273, this.textureX, this.textureY);
/*  535 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 73, 281, this.textureX, this.textureY);
/*  536 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 273, 281, this.textureX, this.textureY);
/*  537 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 441, 281, this.textureX, this.textureY);
/*  538 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 793, 281, this.textureX, this.textureY);
/*  539 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 801, 257, this.textureX, this.textureY);
/*  540 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 865, 257, this.textureX, this.textureY);
/*  541 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/*  542 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 969, 177, this.textureX, this.textureY);
/*  543 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 201, 185, this.textureX, this.textureY);
/*  544 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 241, 185, this.textureX, this.textureY);
/*  545 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 313, 185, this.textureX, this.textureY);
/*  546 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 481, 185, this.textureX, this.textureY);
/*  547 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 617, 185, this.textureX, this.textureY);
/*      */     
/*  549 */     this.gunModel[0].addBox(50.0F, -27.0F, -6.0F, 86, 5, 13, 0.0F);
/*  550 */     this.gunModel[0].setRotationPoint(-58.0F, -22.0F, 0.0F);
/*      */     
/*  552 */     this.gunModel[1].addShapeBox(50.0F, -27.0F, -6.0F, 1, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  553 */     this.gunModel[1].setRotationPoint(28.0F, -22.0F, 0.0F);
/*      */     
/*  555 */     this.gunModel[2].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  556 */     this.gunModel[2].setRotationPoint(28.0F, -17.0F, 0.0F);
/*      */     
/*  558 */     this.gunModel[3].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  559 */     this.gunModel[3].setRotationPoint(27.0F, -15.0F, 0.0F);
/*      */     
/*  561 */     this.gunModel[4].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F);
/*  562 */     this.gunModel[4].setRotationPoint(24.0F, -15.0F, 0.0F);
/*      */     
/*  564 */     this.gunModel[5].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  565 */     this.gunModel[5].setRotationPoint(23.0F, -15.0F, 0.0F);
/*      */     
/*  567 */     this.gunModel[6].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  568 */     this.gunModel[6].setRotationPoint(21.0F, -14.0F, 0.0F);
/*      */     
/*  570 */     this.gunModel[7].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.5F, 0.0F, 0.0F);
/*  571 */     this.gunModel[7].setRotationPoint(20.0F, -13.0F, 0.0F);
/*      */     
/*  573 */     this.gunModel[8].addShapeBox(50.0F, -27.0F, -6.0F, 86, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  574 */     this.gunModel[8].setRotationPoint(-58.0F, -17.0F, 0.0F);
/*      */     
/*  576 */     this.gunModel[9].addShapeBox(50.0F, -27.0F, -6.0F, 80, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  577 */     this.gunModel[9].setRotationPoint(-58.0F, -15.0F, 0.0F);
/*      */     
/*  579 */     this.gunModel[10].addShapeBox(50.0F, -27.0F, -6.0F, 78, 1, 13, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  580 */     this.gunModel[10].setRotationPoint(-57.0F, -14.0F, 0.0F);
/*      */     
/*  582 */     this.gunModel[11].addShapeBox(50.0F, -27.0F, -6.0F, 78, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  583 */     this.gunModel[11].setRotationPoint(-58.0F, -13.0F, 0.0F);
/*      */     
/*  585 */     this.gunModel[12].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  586 */     this.gunModel[12].setRotationPoint(18.5F, -11.0F, 0.0F);
/*      */     
/*  588 */     this.gunModel[13].addShapeBox(50.0F, -27.0F, -6.0F, 1, 10, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  589 */     this.gunModel[13].setRotationPoint(18.5F, -9.0F, 0.0F);
/*      */     
/*  591 */     this.gunModel[14].addShapeBox(50.0F, -27.0F, -6.0F, 33, 10, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 9.0F, 0.0F);
/*  592 */     this.gunModel[14].setRotationPoint(-15.0F, -9.0F, 0.0F);
/*      */     
/*  594 */     this.gunModel[15].addShapeBox(50.0F, -27.0F, -6.0F, 76, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  595 */     this.gunModel[15].setRotationPoint(-57.5F, -11.0F, 0.0F);
/*      */     
/*  597 */     this.gunModel[16].addShapeBox(50.0F, -27.0F, -6.0F, 33, 2, 15, 0.0F, 0.0F, -6.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, 5.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 5.5F, 0.0F);
/*  598 */     this.gunModel[16].setRotationPoint(-15.0F, 4.0F, -1.0F);
/*      */     
/*  600 */     this.gunModel[17].addShapeBox(50.0F, -27.0F, -6.0F, 33, 1, 15, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/*  601 */     this.gunModel[17].setRotationPoint(-15.0F, 5.0F, -1.0F);
/*      */     
/*  603 */     this.gunModel[18].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  604 */     this.gunModel[18].setRotationPoint(-17.0F, -1.0F, 0.0F);
/*      */     
/*  606 */     this.gunModel[19].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  607 */     this.gunModel[19].setRotationPoint(-19.0F, -2.0F, 0.0F);
/*      */     
/*  609 */     this.gunModel[20].addShapeBox(50.0F, -27.0F, -6.0F, 43, 7, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  610 */     this.gunModel[20].setRotationPoint(-58.0F, -9.0F, 0.0F);
/*      */     
/*  612 */     this.gunModel[21].addShapeBox(50.0F, -27.0F, -6.0F, 19, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  613 */     this.gunModel[21].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/*  615 */     this.gunModel[22].addBox(50.0F, -27.0F, -6.0F, 16, 9, 13, 0.0F);
/*  616 */     this.gunModel[22].setRotationPoint(-74.0F, -22.0F, 0.0F);
/*      */     
/*  618 */     this.gunModel[23].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  619 */     this.gunModel[23].setRotationPoint(-17.0F, 9.0F, 2.0F);
/*      */     
/*  621 */     this.gunModel[24].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  622 */     this.gunModel[24].setRotationPoint(-19.0F, 11.0F, 2.0F);
/*      */     
/*  624 */     this.gunModel[25].addShapeBox(50.0F, -27.0F, -6.0F, 25, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  625 */     this.gunModel[25].setRotationPoint(-44.0F, 11.0F, 2.0F);
/*      */     
/*  627 */     this.gunModel[26].addShapeBox(50.0F, -27.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  628 */     this.gunModel[26].setRotationPoint(-42.0F, 9.0F, 2.0F);
/*      */     
/*  630 */     this.gunModel[27].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[27].setRotationPoint(-41.0F, 11.0F, 2.0F);
/*      */     
/*  633 */     this.gunModel[28].addShapeBox(50.0F, -27.0F, -6.0F, 2, 11, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  634 */     this.gunModel[28].setRotationPoint(-44.0F, 1.0F, 2.0F);
/*      */     
/*  636 */     this.gunModel[29].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  637 */     this.gunModel[29].setRotationPoint(-42.0F, -1.0F, 2.0F);
/*      */     
/*  639 */     this.gunModel[30].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  640 */     this.gunModel[30].setRotationPoint(-44.0F, -1.0F, 2.0F);
/*      */     
/*  642 */     this.gunModel[31].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  643 */     this.gunModel[31].setRotationPoint(-45.0F, -1.0F, 2.0F);
/*      */     
/*  645 */     this.gunModel[32].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F);
/*  646 */     this.gunModel[32].setRotationPoint(-47.0F, -1.0F, 2.0F);
/*      */     
/*  648 */     this.gunModel[33].addShapeBox(50.0F, -27.0F, -6.0F, 9, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  649 */     this.gunModel[33].setRotationPoint(-36.0F, -2.0F, 5.0F);
/*      */     
/*  651 */     this.gunModel[34].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  652 */     this.gunModel[34].setRotationPoint(-35.0F, -1.0F, 5.0F);
/*      */     
/*  654 */     this.gunModel[35].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  655 */     this.gunModel[35].setRotationPoint(-35.0F, 1.0F, 5.0F);
/*      */     
/*  657 */     this.gunModel[36].addShapeBox(50.0F, -27.0F, -6.0F, 4, 3, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  658 */     this.gunModel[36].setRotationPoint(-35.0F, 3.0F, 5.0F);
/*      */     
/*  660 */     this.gunModel[37].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  661 */     this.gunModel[37].setRotationPoint(-35.0F, 6.0F, 5.0F);
/*      */     
/*  663 */     this.gunModel[38].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  664 */     this.gunModel[38].setRotationPoint(-34.0F, 8.0F, 5.0F);
/*      */     
/*  666 */     this.gunModel[39].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  667 */     this.gunModel[39].setRotationPoint(-33.0F, 10.0F, 5.0F);
/*      */     
/*  669 */     this.gunModel[40].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F);
/*  670 */     this.gunModel[40].setRotationPoint(18.5F, 1.0F, 0.0F);
/*      */     
/*  672 */     this.gunModel[41].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F);
/*  673 */     this.gunModel[41].setRotationPoint(19.5F, 3.0F, 0.0F);
/*      */     
/*  675 */     this.gunModel[42].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  676 */     this.gunModel[42].setRotationPoint(18.0F, 1.0F, 0.0F);
/*      */     
/*  678 */     this.gunModel[43].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  679 */     this.gunModel[43].setRotationPoint(18.0F, 3.0F, 0.0F);
/*      */     
/*  681 */     this.gunModel[44].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F);
/*  682 */     this.gunModel[44].setRotationPoint(18.0F, 5.0F, -1.0F);
/*      */     
/*  684 */     this.gunModel[45].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.5F, 1.0F);
/*  685 */     this.gunModel[45].setRotationPoint(18.0F, 4.0F, 0.0F);
/*      */     
/*  687 */     this.gunModel[46].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.2F, 0.5F, -0.5F, -2.0F, 0.5F, -0.5F, -2.0F, 0.0F, 0.1F, 0.2F);
/*  688 */     this.gunModel[46].setRotationPoint(19.0F, 4.0F, 0.0F);
/*      */     
/*  690 */     this.gunModel[47].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -1.0F, -2.0F, 0.5F, -1.0F, -2.0F, 0.0F, 0.0F, 0.25F);
/*  691 */     this.gunModel[47].setRotationPoint(19.0F, 4.5F, 0.0F);
/*      */     
/*  693 */     this.gunModel[48].addBox(50.0F, -27.0F, -6.0F, 52, 11, 17, 0.0F);
/*  694 */     this.gunModel[48].setRotationPoint(-77.0F, -34.0F, -2.0F);
/*      */     
/*  696 */     this.gunModel[49].addShapeBox(50.0F, -27.0F, -6.0F, 193, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  697 */     this.gunModel[49].setRotationPoint(-77.0F, -37.0F, -2.0F);
/*      */     
/*  699 */     this.gunModel[50].addShapeBox(50.0F, -27.0F, -6.0F, 108, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  700 */     this.gunModel[50].setRotationPoint(-77.0F, -23.0F, -2.0F);
/*      */     
/*  702 */     this.gunModel[51].addShapeBox(50.0F, -27.0F, -6.0F, 193, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  703 */     this.gunModel[51].setRotationPoint(-77.0F, -39.0F, -1.0F);
/*      */     
/*  705 */     this.gunModel[52].addShapeBox(50.0F, -27.0F, -6.0F, 84, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  706 */     this.gunModel[52].setRotationPoint(33.0F, -23.0F, -1.5F);
/*      */     
/*  708 */     this.gunModel[53].addShapeBox(50.0F, -27.0F, -6.0F, 84, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  709 */     this.gunModel[53].setRotationPoint(33.0F, -18.5F, 3.0F);
/*      */     
/*  711 */     this.gunModel[54].addShapeBox(50.0F, -27.0F, -6.0F, 84, 1, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[54].setRotationPoint(33.0F, -16.5F, 1.5F);
/*      */     
/*  714 */     this.gunModel[55].addShapeBox(50.0F, -27.0F, -6.0F, 84, 1, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  715 */     this.gunModel[55].setRotationPoint(33.0F, -20.0F, 1.0F);
/*      */     
/*  717 */     this.gunModel[56].addShapeBox(50.0F, -27.0F, -6.0F, 84, 2, 14, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  718 */     this.gunModel[56].setRotationPoint(33.0F, -22.0F, -0.5F);
/*      */     
/*  720 */     this.gunModel[57].addShapeBox(50.0F, -27.0F, -6.0F, 84, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  721 */     this.gunModel[57].setRotationPoint(33.0F, -15.5F, 1.5F);
/*      */     
/*  723 */     this.gunModel[58].addShapeBox(50.0F, -27.0F, -6.0F, 61, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  724 */     this.gunModel[58].setRotationPoint(-77.0F, -47.0F, 1.5F);
/*      */     
/*  726 */     this.gunModel[59].addShapeBox(50.0F, -27.0F, -6.0F, 14, 8, 10, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  727 */     this.gunModel[59].setRotationPoint(102.0F, -47.0F, 1.5F);
/*      */     
/*  729 */     this.gunModel[60].addShapeBox(50.0F, -27.0F, -6.0F, 46, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  730 */     this.gunModel[60].setRotationPoint(56.0F, -47.0F, 1.5F);
/*      */     
/*  732 */     this.gunModel[61].addShapeBox(50.0F, -27.0F, -6.0F, 46, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  733 */     this.gunModel[61].setRotationPoint(56.0F, -43.5F, 1.5F);
/*      */     
/*  735 */     this.gunModel[62].addShapeBox(50.0F, -27.0F, -6.0F, 72, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  736 */     this.gunModel[62].setRotationPoint(-16.0F, -47.0F, 1.5F);
/*      */     
/*  738 */     this.gunModel[63].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  739 */     this.gunModel[63].setRotationPoint(-16.0F, -44.5F, 1.5F);
/*      */     
/*  741 */     this.gunModel[64].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  742 */     this.gunModel[64].setRotationPoint(-16.0F, -40.5F, 1.5F);
/*      */     
/*  744 */     this.gunModel[65].addShapeBox(50.0F, -27.0F, -6.0F, 193, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  745 */     this.gunModel[65].setRotationPoint(-77.0F, -39.5F, 1.5F);
/*      */     
/*  747 */     this.gunModel[66].addShapeBox(50.0F, -27.0F, -6.0F, 66, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[66].setRotationPoint(-13.0F, -40.5F, 1.5F);
/*      */     
/*  750 */     this.gunModel[67].addShapeBox(50.0F, -27.0F, -6.0F, 44, 3, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  751 */     this.gunModel[67].setRotationPoint(59.75F, -43.5F, 3.0F);
/*      */     
/*  753 */     this.gunModel[68].addShapeBox(50.0F, -27.0F, -6.0F, 73, 5, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  754 */     this.gunModel[68].setRotationPoint(-16.25F, -44.5F, 3.0F);
/*      */     
/*  756 */     this.gunModel[69].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  757 */     this.gunModel[69].setRotationPoint(55.0F, -40.5F, 1.5F);
/*      */     
/*  759 */     this.gunModel[70].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[70].setRotationPoint(55.0F, -44.5F, 1.5F);
/*      */     
/*  762 */     this.gunModel[71].addShapeBox(50.0F, -27.0F, -6.0F, 66, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  763 */     this.gunModel[71].setRotationPoint(-13.0F, -44.5F, 1.5F);
/*      */     
/*  765 */     this.gunModel[72].addShapeBox(50.0F, -27.0F, -6.0F, 193, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  766 */     this.gunModel[72].setRotationPoint(-77.0F, -49.5F, 2.5F);
/*      */     
/*  768 */     this.gunModel[73].addShapeBox(50.0F, -27.0F, -6.0F, 193, 1, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  769 */     this.gunModel[73].setRotationPoint(-77.0F, -50.0F, 1.0F);
/*      */     
/*  771 */     this.gunModel[74].addShapeBox(50.0F, -27.0F, -6.0F, 193, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  772 */     this.gunModel[74].setRotationPoint(-77.0F, -51.0F, 1.0F);
/*      */     
/*  774 */     this.gunModel[75].addShapeBox(50.0F, -27.0F, -6.0F, 193, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  775 */     this.gunModel[75].setRotationPoint(-77.0F, -47.5F, 10.5F);
/*      */     
/*  777 */     this.gunModel[76].addShapeBox(50.0F, -27.0F, -6.0F, 193, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  778 */     this.gunModel[76].setRotationPoint(-77.0F, -47.5F, 1.5F);
/*      */     
/*  780 */     this.gunModel[77].addShapeBox(50.0F, -27.0F, -6.0F, 80, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  781 */     this.gunModel[77].setRotationPoint(116.0F, -31.0F, 3.0F);
/*      */     
/*  783 */     this.gunModel[78].addShapeBox(50.0F, -27.0F, -6.0F, 4, 7, 7, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  784 */     this.gunModel[78].setRotationPoint(118.0F, -31.0F, 3.0F);
/*      */     
/*  786 */     this.gunModel[79].addShapeBox(50.0F, -27.0F, -6.0F, 16, 7, 7, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F);
/*  787 */     this.gunModel[79].setRotationPoint(122.0F, -31.0F, 3.0F);
/*      */     
/*  789 */     this.gunModel[80].addShapeBox(50.0F, -27.0F, -6.0F, 2, 7, 7, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F);
/*  790 */     this.gunModel[80].setRotationPoint(138.0F, -31.0F, 3.0F);
/*      */     
/*  792 */     this.gunModel[81].addShapeBox(50.0F, -27.0F, -6.0F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/*  793 */     this.gunModel[81].setRotationPoint(120.0F, -31.0F, 3.0F);
/*      */     
/*  795 */     this.gunModel[82].addShapeBox(50.0F, -27.0F, -6.0F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 0.0F, 0.0F);
/*  796 */     this.gunModel[82].setRotationPoint(196.0F, -31.0F, 3.0F);
/*      */     
/*  798 */     this.gunModel[83].addShapeBox(50.0F, -27.0F, -6.0F, 3, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F);
/*  799 */     this.gunModel[83].setRotationPoint(198.0F, -31.0F, 3.0F);
/*      */     
/*  801 */     this.gunModel[84].addShapeBox(50.0F, -27.0F, -6.0F, 1, 7, 7, 0.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F, 0.0F, 1.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.5F, 1.5F);
/*  802 */     this.gunModel[84].setRotationPoint(201.0F, -31.0F, 3.0F);
/*      */     
/*  804 */     this.gunModel[85].addShapeBox(50.0F, -27.0F, -6.0F, 9, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  805 */     this.gunModel[85].setRotationPoint(202.0F, -32.0F, 2.0F);
/*      */     
/*  807 */     this.gunModel[86].addShapeBox(50.0F, -27.0F, -6.0F, 17, 6, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  808 */     this.gunModel[86].setRotationPoint(211.0F, -29.0F, 2.0F);
/*      */     
/*  810 */     this.gunModel[87].addShapeBox(50.0F, -27.0F, -6.0F, 17, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  811 */     this.gunModel[87].setRotationPoint(211.0F, -32.0F, 2.0F);
/*      */     
/*  813 */     this.gunModel[88].addShapeBox(50.0F, -27.0F, -6.0F, 17, 6, 4, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  814 */     this.gunModel[88].setRotationPoint(211.0F, -29.0F, 7.0F);
/*      */     
/*  816 */     this.gunModel[89].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  817 */     this.gunModel[89].setRotationPoint(109.0F, -45.0F, 1.0F);
/*      */     
/*  819 */     this.gunModel[90].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  820 */     this.gunModel[90].setRotationPoint(109.0F, -43.0F, 1.0F);
/*      */     
/*  822 */     this.gunModel[91].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  823 */     this.gunModel[91].setRotationPoint(109.0F, -44.0F, 1.0F);
/*      */     
/*  825 */     this.gunModel[92].addShapeBox(50.0F, -27.0F, -6.0F, 1, 3, 17, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel[92].setRotationPoint(116.0F, -37.0F, -2.0F);
/*      */     
/*  828 */     this.gunModel[93].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 15, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  829 */     this.gunModel[93].setRotationPoint(116.0F, -39.0F, -1.0F);
/*      */     
/*  831 */     this.gunModel[94].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  832 */     this.gunModel[94].setRotationPoint(116.0F, -39.5F, 1.5F);
/*      */     
/*  834 */     this.gunModel[95].addShapeBox(50.0F, -27.0F, -6.0F, 1, 8, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  835 */     this.gunModel[95].setRotationPoint(116.0F, -47.0F, 1.5F);
/*      */     
/*  837 */     this.gunModel[96].addShapeBox(50.0F, -27.0F, -6.0F, 1, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  838 */     this.gunModel[96].setRotationPoint(116.0F, -49.5F, 2.5F);
/*      */     
/*  840 */     this.gunModel[97].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 11, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  841 */     this.gunModel[97].setRotationPoint(116.0F, -50.0F, 1.0F);
/*      */     
/*  843 */     this.gunModel[98].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  844 */     this.gunModel[98].setRotationPoint(116.0F, -51.0F, 1.0F);
/*      */     
/*  846 */     this.gunModel[99].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  847 */     this.gunModel[99].setRotationPoint(116.0F, -47.5F, 10.5F);
/*      */     
/*  849 */     this.gunModel[100].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  850 */     this.gunModel[100].setRotationPoint(116.0F, -47.5F, 1.5F);
/*      */     
/*  852 */     this.gunModel[101].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  853 */     this.gunModel[101].setRotationPoint(114.5F, -45.25F, 14.5F);
/*      */     
/*  855 */     this.gunModel[102].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  856 */     this.gunModel[102].setRotationPoint(114.5F, -45.0F, 13.5F);
/*      */     
/*  858 */     this.gunModel[103].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  859 */     this.gunModel[103].setRotationPoint(114.5F, -42.0F, 12.0F);
/*      */     
/*  861 */     this.gunModel[104].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  862 */     this.gunModel[104].setRotationPoint(114.5F, -40.5F, 11.5F);
/*      */     
/*  864 */     this.gunModel[105].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  865 */     this.gunModel[105].setRotationPoint(114.5F, -45.25F, 12.75F);
/*      */     
/*  867 */     this.gunModel[106].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F);
/*  868 */     this.gunModel[106].setRotationPoint(114.5F, -46.5F, 10.0F);
/*      */     
/*  870 */     this.gunModel[107].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  871 */     this.gunModel[107].setRotationPoint(114.5F, -42.0F, 10.25F);
/*      */     
/*  873 */     this.gunModel[108].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  874 */     this.gunModel[108].setRotationPoint(114.5F, -45.25F, 11.5F);
/*      */     
/*  876 */     this.gunModel[109].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/*  877 */     this.gunModel[109].setRotationPoint(114.5F, -40.5F, -0.5F);
/*      */     
/*  879 */     this.gunModel[110].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  880 */     this.gunModel[110].setRotationPoint(114.5F, -42.0F, -2.0F);
/*      */     
/*  882 */     this.gunModel[111].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 1, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F);
/*  883 */     this.gunModel[111].setRotationPoint(114.5F, -45.0F, -2.5F);
/*      */     
/*  885 */     this.gunModel[112].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/*  886 */     this.gunModel[112].setRotationPoint(114.5F, -45.25F, -0.75F);
/*      */     
/*  888 */     this.gunModel[113].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
/*  889 */     this.gunModel[113].setRotationPoint(114.5F, -45.25F, -2.5F);
/*      */     
/*  891 */     this.gunModel[114].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F);
/*  892 */     this.gunModel[114].setRotationPoint(114.5F, -46.5F, -1.0F);
/*      */     
/*  894 */     this.gunModel[115].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 3, 0.0F, -0.5F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/*  895 */     this.gunModel[115].setRotationPoint(114.5F, -42.0F, -0.25F);
/*      */     
/*  897 */     this.gunModel[116].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  898 */     this.gunModel[116].setRotationPoint(114.5F, -45.25F, 0.5F);
/*      */     
/*  900 */     this.gunModel[117].addShapeBox(50.0F, -27.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  901 */     this.gunModel[117].setRotationPoint(-44.0F, -16.0F, -1.5F);
/*      */     
/*  903 */     this.gunModel[118].addShapeBox(50.0F, -27.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  904 */     this.gunModel[118].setRotationPoint(-48.0F, -16.0F, -1.5F);
/*      */     
/*  906 */     this.gunModel[119].addShapeBox(50.0F, -27.0F, -6.0F, 2, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  907 */     this.gunModel[119].setRotationPoint(-46.0F, -16.0F, -1.5F);
/*      */     
/*  909 */     this.gunModel[120].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 16, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  910 */     this.gunModel[120].setRotationPoint(-46.0F, -17.0F, -1.5F);
/*      */     
/*  912 */     this.gunModel[121].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  913 */     this.gunModel[121].setRotationPoint(-46.0F, -10.0F, -1.5F);
/*      */     
/*  915 */     this.gunModel[122].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  916 */     this.gunModel[122].setRotationPoint(-36.5F, -7.5F, -0.5F);
/*      */     
/*  918 */     this.gunModel[123].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  919 */     this.gunModel[123].setRotationPoint(-36.5F, -5.5F, -0.5F);
/*      */     
/*  921 */     this.gunModel[124].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  922 */     this.gunModel[124].setRotationPoint(-36.5F, -6.5F, -0.5F);
/*      */     
/*  924 */     this.gunModel[125].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  925 */     this.gunModel[125].setRotationPoint(-26.0F, -14.5F, 1.5F);
/*      */     
/*  927 */     this.gunModel[126].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  928 */     this.gunModel[126].setRotationPoint(-26.0F, -12.5F, 1.5F);
/*      */     
/*  930 */     this.gunModel[127].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  931 */     this.gunModel[127].setRotationPoint(-26.0F, -13.5F, 1.5F);
/*      */     
/*  933 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  934 */     this.gunModel[''].setRotationPoint(-52.5F, -20.0F, -0.5F);
/*      */     
/*  936 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  937 */     this.gunModel[''].setRotationPoint(-52.5F, -18.0F, -0.5F);
/*      */     
/*  939 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  940 */     this.gunModel[''].setRotationPoint(-52.5F, -19.0F, -0.5F);
/*      */     
/*  942 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 16, 1, 9, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  943 */     this.gunModel[''].setRotationPoint(122.0F, -33.0F, 2.0F);
/*      */     
/*  945 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 16, 1, 6, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/*  946 */     this.gunModel[''].setRotationPoint(122.0F, -35.0F, 3.5F);
/*      */     
/*  948 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 16, 1, 7, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  949 */     this.gunModel[''].setRotationPoint(122.0F, -34.0F, 3.0F);
/*      */     
/*  951 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  952 */     this.gunModel[''].setRotationPoint(128.0F, -32.0F, 2.0F);
/*      */     
/*  954 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.2F);
/*  955 */     this.gunModel[''].setRotationPoint(131.0F, -36.0F, 9.0F);
/*      */     
/*  957 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  958 */     this.gunModel[''].setRotationPoint(128.0F, -36.0F, 9.0F);
/*      */     
/*  960 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/*  961 */     this.gunModel[''].setRotationPoint(131.0F, -34.5F, 9.0F);
/*      */     
/*  963 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  964 */     this.gunModel[''].setRotationPoint(128.0F, -36.0F, 10.0F);
/*      */     
/*  966 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  967 */     this.gunModel[''].setRotationPoint(131.0F, -34.5F, 2.0F);
/*      */     
/*  969 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  970 */     this.gunModel[''].setRotationPoint(128.0F, -36.0F, 2.0F);
/*      */     
/*  972 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  973 */     this.gunModel[''].setRotationPoint(128.0F, -32.0F, 10.0F);
/*      */     
/*  975 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  976 */     this.gunModel[''].setRotationPoint(131.0F, -36.0F, 2.0F);
/*      */     
/*  978 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  979 */     this.gunModel[''].setRotationPoint(128.0F, -36.0F, 3.0F);
/*      */     
/*  981 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  982 */     this.gunModel[''].setRotationPoint(122.0F, -36.0F, 9.0F);
/*      */     
/*  984 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F);
/*  985 */     this.gunModel[''].setRotationPoint(122.0F, -36.0F, 3.0F);
/*      */     
/*  987 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 21, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  988 */     this.gunModel[''].setRotationPoint(118.0F, -42.0F, 3.0F);
/*      */     
/*  990 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  991 */     this.gunModel[''].setRotationPoint(117.0F, -41.5F, 3.5F);
/*      */     
/*  993 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  994 */     this.gunModel[''].setRotationPoint(139.0F, -37.0F, 3.0F);
/*      */     
/*  996 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 1, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  997 */     this.gunModel[''].setRotationPoint(139.0F, -42.0F, 3.0F);
/*      */     
/*  999 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1000 */     this.gunModel[''].setRotationPoint(140.0F, -42.0F, 3.0F);
/*      */     
/* 1002 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1003 */     this.gunModel[''].setRotationPoint(140.0F, -37.0F, 3.0F);
/*      */     
/* 1005 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 3.0F, -0.4F, 0.0F, 3.0F, -0.4F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1006 */     this.gunModel[''].setRotationPoint(132.0F, -43.0F, 3.0F);
/*      */     
/* 1008 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1009 */     this.gunModel[''].setRotationPoint(119.0F, -39.0F, 2.5F);
/*      */     
/* 1011 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1012 */     this.gunModel[''].setRotationPoint(136.0F, -39.0F, 2.5F);
/*      */     
/* 1014 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 11, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1015 */     this.gunModel[''].setRotationPoint(120.0F, -47.0F, 2.0F);
/*      */     
/* 1017 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1018 */     this.gunModel[''].setRotationPoint(120.5F, -44.5F, 10.0F);
/*      */     
/* 1020 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1021 */     this.gunModel[''].setRotationPoint(120.5F, -46.5F, 10.0F);
/*      */     
/* 1023 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1024 */     this.gunModel[''].setRotationPoint(120.5F, -42.5F, 10.0F);
/*      */     
/* 1026 */     this.gunModel[''].addShapeBox(50.0F, -27.0F, -6.0F, 4, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel[''].setRotationPoint(122.0F, -54.0F, 2.5F);
/*      */     
/* 1029 */     this.gunModel[' '].addShapeBox(50.0F, -27.0F, -6.0F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1030 */     this.gunModel[' '].setRotationPoint(128.0F, -53.0F, 2.5F);
/*      */     
/* 1032 */     this.gunModel['¡'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel['¡'].setRotationPoint(126.0F, -54.0F, 2.5F);
/*      */     
/* 1035 */     this.gunModel['¢'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1036 */     this.gunModel['¢'].setRotationPoint(124.5F, -52.5F, 1.5F);
/*      */     
/* 1038 */     this.gunModel['£'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['£'].setRotationPoint(124.5F, -53.5F, 1.5F);
/*      */     
/* 1041 */     this.gunModel['¤'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['¤'].setRotationPoint(123.0F, -29.0F, 1.5F);
/*      */     
/* 1044 */     this.gunModel['¥'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1045 */     this.gunModel['¥'].setRotationPoint(135.0F, -29.0F, 1.5F);
/*      */     
/* 1047 */     this.gunModel['¦'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1048 */     this.gunModel['¦'].setRotationPoint(-47.0F, -2.0F, 0.0F);
/*      */     
/* 1050 */     this.gunModel['§'].addShapeBox(50.0F, -27.0F, -6.0F, 11, 1, 13, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1051 */     this.gunModel['§'].setRotationPoint(-58.0F, -2.0F, 0.0F);
/*      */     
/* 1053 */     this.gunModel['¨'].addShapeBox(50.0F, -27.0F, -6.0F, 11, 1, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1054 */     this.gunModel['¨'].setRotationPoint(-58.0F, -2.5F, 2.0F);
/*      */     
/* 1056 */     this.gunModel['©'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1057 */     this.gunModel['©'].setRotationPoint(-45.0F, -0.5F, 0.0F);
/*      */     
/* 1059 */     this.gunModel['ª'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 13, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1060 */     this.gunModel['ª'].setRotationPoint(-45.0F, 1.0F, 0.0F);
/*      */     
/* 1062 */     this.gunModel['«'].addShapeBox(50.0F, -27.0F, -6.0F, 13, 15, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1063 */     this.gunModel['«'].setRotationPoint(-58.0F, -0.5F, 0.0F);
/*      */     
/* 1065 */     this.gunModel['¬'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 5, 13, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1066 */     this.gunModel['¬'].setRotationPoint(-61.0F, -1.0F, 0.0F);
/*      */     
/* 1068 */     this.gunModel['­'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 5, 9, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1069 */     this.gunModel['­'].setRotationPoint(-62.0F, -1.0F, 2.0F);
/*      */     
/* 1071 */     this.gunModel['®'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 35, 13, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 24.0F, 0.0F, -2.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -2.0F);
/* 1072 */     this.gunModel['®'].setRotationPoint(-61.0F, 4.5F, 0.0F);
/*      */     
/* 1074 */     this.gunModel['¯'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 35, 9, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 24.0F, 0.0F, -3.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -3.0F);
/* 1075 */     this.gunModel['¯'].setRotationPoint(-62.0F, 4.5F, 2.0F);
/*      */     
/* 1077 */     this.gunModel['°'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 10, 13, 0.0F, -7.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -7.0F, 0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1078 */     this.gunModel['°'].setRotationPoint(-65.0F, 4.5F, 0.0F);
/*      */     
/* 1080 */     this.gunModel['±'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 24, 13, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, -10.0F, 0.0F, -2.0F, -10.0F, 0.0F, -2.0F, 11.0F, 0.0F, 0.0F);
/* 1081 */     this.gunModel['±'].setRotationPoint(-51.5F, 14.5F, 0.0F);
/*      */     
/* 1083 */     this.gunModel['²'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 24, 13, 0.0F, -2.4F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 13.85F, 0.0F, 0.0F);
/* 1084 */     this.gunModel['²'].setRotationPoint(-67.5F, 14.5F, 0.0F);
/*      */     
/* 1086 */     this.gunModel['³'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1087 */     this.gunModel['³'].setRotationPoint(-62.5F, 38.5F, 0.0F);
/*      */     
/* 1089 */     this.gunModel['´'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F);
/* 1090 */     this.gunModel['´'].setRotationPoint(-62.5F, 39.5F, 0.0F);
/*      */     
/* 1092 */     this.gunModel['µ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1093 */     this.gunModel['µ'].setRotationPoint(-60.5F, 41.5F, 0.0F);
/*      */     
/* 1095 */     this.gunModel['¶'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/* 1096 */     this.gunModel['¶'].setRotationPoint(-60.5F, 43.5F, 0.0F);
/*      */     
/* 1098 */     this.gunModel['·'].addShapeBox(50.0F, -27.0F, -6.0F, 21, 2, 13, 0.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -4.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.5F, 0.0F);
/* 1099 */     this.gunModel['·'].setRotationPoint(-81.5F, 43.5F, 0.0F);
/*      */     
/* 1101 */     this.gunModel['¸'].addShapeBox(50.0F, -27.0F, -6.0F, 20, 2, 13, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 1102 */     this.gunModel['¸'].setRotationPoint(-80.5F, 41.5F, 0.0F);
/*      */     
/* 1104 */     this.gunModel['¹'].addShapeBox(50.0F, -27.0F, -6.0F, 20, 2, 13, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1105 */     this.gunModel['¹'].setRotationPoint(-80.5F, 39.5F, 0.0F);
/*      */     
/* 1107 */     this.gunModel['º'].addShapeBox(50.0F, -27.0F, -6.0F, 18, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1108 */     this.gunModel['º'].setRotationPoint(-80.5F, 38.5F, 0.0F);
/*      */     
/* 1110 */     this.gunModel['»'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 1111 */     this.gunModel['»'].setRotationPoint(-82.5F, 39.5F, 0.0F);
/*      */     
/* 1113 */     this.gunModel['¼'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 13, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, -2.0F);
/* 1114 */     this.gunModel['¼'].setRotationPoint(-85.0F, 39.5F, 0.0F);
/*      */     
/* 1116 */     this.gunModel['½'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.5F, -3.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -3.0F);
/* 1117 */     this.gunModel['½'].setRotationPoint(-86.0F, 39.5F, 2.0F);
/*      */     
/* 1119 */     this.gunModel['¾'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 13, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1120 */     this.gunModel['¾'].setRotationPoint(-81.5F, 38.5F, 0.0F);
/*      */     
/* 1122 */     this.gunModel['¿'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1123 */     this.gunModel['¿'].setRotationPoint(-52.5F, 21.0F, 2.0F);
/*      */     
/* 1125 */     this.gunModel['À'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1126 */     this.gunModel['À'].setRotationPoint(-52.5F, 23.0F, 2.0F);
/*      */     
/* 1128 */     this.gunModel['Á'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1129 */     this.gunModel['Á'].setRotationPoint(-52.5F, 25.0F, 2.0F);
/*      */     
/* 1131 */     this.gunModel['Â'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1132 */     this.gunModel['Â'].setRotationPoint(-52.5F, 26.0F, 2.0F);
/*      */     
/* 1134 */     this.gunModel['Ã'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1135 */     this.gunModel['Ã'].setRotationPoint(-49.5F, 20.0F, 2.0F);
/*      */     
/* 1137 */     this.gunModel['Ä'].addShapeBox(50.0F, -27.0F, -6.0F, 11, 4, 14, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1138 */     this.gunModel['Ä'].setRotationPoint(-62.0F, 8.5F, -0.5F);
/*      */     
/* 1140 */     this.gunModel['Å'].addShapeBox(50.0F, -27.0F, -6.0F, 11, 21, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 14.0F, 0.0F, 0.0F);
/* 1141 */     this.gunModel['Å'].setRotationPoint(-62.0F, 12.5F, -0.5F);
/*      */     
/* 1143 */     this.gunModel['Æ'].addShapeBox(50.0F, -27.0F, -6.0F, 16, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F);
/* 1144 */     this.gunModel['Æ'].setRotationPoint(-76.0F, 33.5F, -0.5F);
/*      */     
/* 1146 */     this.gunModel['Ç'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F);
/* 1147 */     this.gunModel['Ç'].setRotationPoint(-61.0F, -2.5F, 2.0F);
/*      */     
/* 1149 */     this.gunModel['È'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 5, 0.0F, -0.25F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, -2.0F, -0.25F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F);
/* 1150 */     this.gunModel['È'].setRotationPoint(-62.0F, -2.5F, 4.0F);
/*      */     
/* 1152 */     this.gunModel['É'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 17, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/* 1153 */     this.gunModel['É'].setRotationPoint(-61.0F, -4.5F, -2.0F);
/*      */     
/* 1155 */     this.gunModel['Ê'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 3, 9, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1156 */     this.gunModel['Ê'].setRotationPoint(-62.0F, -4.5F, 2.0F);
/*      */     
/* 1158 */     this.gunModel['Ë'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 9, 0.0F, 1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1159 */     this.gunModel['Ë'].setRotationPoint(-63.0F, -6.5F, 2.0F);
/*      */     
/* 1161 */     this.gunModel['Ì'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 17, 0.0F, 1.0F, 0.0F, -4.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 1.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -4.0F);
/* 1162 */     this.gunModel['Ì'].setRotationPoint(-62.0F, -6.5F, -2.0F);
/*      */     
/* 1164 */     this.gunModel['Í'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 9, 0.0F, 2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1165 */     this.gunModel['Í'].setRotationPoint(-64.5F, -7.5F, 2.0F);
/*      */     
/* 1167 */     this.gunModel['Î'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 9, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F);
/* 1168 */     this.gunModel['Î'].setRotationPoint(-63.5F, -7.5F, 2.0F);
/*      */     
/* 1170 */     this.gunModel['Ï'].addShapeBox(50.0F, -27.0F, -6.0F, 11, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1171 */     this.gunModel['Ï'].setRotationPoint(-76.5F, -10.5F, 0.0F);
/*      */     
/* 1173 */     this.gunModel['Ð'].addShapeBox(50.0F, -27.0F, -6.0F, 10, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1174 */     this.gunModel['Ð'].setRotationPoint(-76.5F, -8.5F, 2.0F);
/*      */     
/* 1176 */     this.gunModel['Ñ'].addShapeBox(50.0F, -27.0F, -6.0F, 19, 3, 13, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1177 */     this.gunModel['Ñ'].setRotationPoint(-76.5F, -13.5F, 0.0F);
/*      */     
/* 1179 */     this.gunModel['Ò'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1180 */     this.gunModel['Ò'].setRotationPoint(-67.0F, -8.5F, 2.0F);
/*      */     
/* 1182 */     this.gunModel['Ó'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1183 */     this.gunModel['Ó'].setRotationPoint(-65.5F, -8.5F, 2.0F);
/*      */     
/* 1185 */     this.gunModel['Ô'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 9, 0.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 1186 */     this.gunModel['Ô'].setRotationPoint(-65.5F, -10.5F, 2.0F);
/*      */     
/* 1188 */     this.gunModel['Õ'].addShapeBox(50.0F, -27.0F, -6.0F, 5, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1189 */     this.gunModel['Õ'].setRotationPoint(-63.5F, -10.5F, 0.0F);
/*      */     
/* 1191 */     this.gunModel['Ö'].addShapeBox(50.0F, -27.0F, -6.0F, 5, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1192 */     this.gunModel['Ö'].setRotationPoint(-63.5F, -7.5F, 0.0F);
/*      */     
/* 1194 */     this.gunModel['×'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1195 */     this.gunModel['×'].setRotationPoint(-61.5F, -6.5F, 0.0F);
/*      */     
/* 1197 */     this.gunModel['Ø'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 13, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1198 */     this.gunModel['Ø'].setRotationPoint(-61.5F, -4.5F, 0.0F);
/*      */     
/* 1200 */     this.gunModel['Ù'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1201 */     this.gunModel['Ù'].setRotationPoint(-65.5F, -10.5F, 0.0F);
/*      */     
/* 1203 */     this.gunModel['Ú'].addShapeBox(50.0F, -27.0F, -6.0F, 50, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1204 */     this.gunModel['Ú'].setRotationPoint(66.0F, -33.0F, 15.5F);
/*      */     
/* 1206 */     this.gunModel['Û'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1207 */     this.gunModel['Û'].setRotationPoint(65.0F, -33.0F, 15.5F);
/*      */     
/* 1209 */     this.gunModel['Ü'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1210 */     this.gunModel['Ü'].setRotationPoint(116.0F, -33.0F, 15.5F);
/*      */     
/* 1212 */     this.gunModel['Ý'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1213 */     this.gunModel['Ý'].setRotationPoint(110.0F, -29.5F, 16.0F);
/*      */     
/* 1215 */     this.gunModel['Þ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1216 */     this.gunModel['Þ'].setRotationPoint(110.0F, -27.5F, 16.0F);
/*      */     
/* 1218 */     this.gunModel['ß'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1219 */     this.gunModel['ß'].setRotationPoint(110.0F, -28.5F, 16.0F);
/*      */     
/* 1221 */     this.gunModel['à'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1222 */     this.gunModel['à'].setRotationPoint(70.0F, -29.5F, 16.0F);
/*      */     
/* 1224 */     this.gunModel['á'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1225 */     this.gunModel['á'].setRotationPoint(70.0F, -27.5F, 16.0F);
/*      */     
/* 1227 */     this.gunModel['â'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1228 */     this.gunModel['â'].setRotationPoint(70.0F, -28.5F, 16.0F);
/*      */     
/* 1230 */     this.gunModel['ã'].addShapeBox(50.0F, -27.0F, -6.0F, 42, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1231 */     this.gunModel['ã'].setRotationPoint(71.0F, -31.0F, 14.5F);
/*      */     
/* 1233 */     this.gunModel['ä'].addShapeBox(50.0F, -27.0F, -6.0F, 42, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1234 */     this.gunModel['ä'].setRotationPoint(71.0F, -31.0F, -2.5F);
/*      */     
/* 1236 */     this.gunModel['å'].addShapeBox(50.0F, -27.0F, -6.0F, 50, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1237 */     this.gunModel['å'].setRotationPoint(66.0F, -33.0F, -4.5F);
/*      */     
/* 1239 */     this.gunModel['æ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1240 */     this.gunModel['æ'].setRotationPoint(65.0F, -33.0F, -4.5F);
/*      */     
/* 1242 */     this.gunModel['ç'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1243 */     this.gunModel['ç'].setRotationPoint(116.0F, -33.0F, -4.5F);
/*      */     
/* 1245 */     this.gunModel['è'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1246 */     this.gunModel['è'].setRotationPoint(110.0F, -29.5F, -5.0F);
/*      */     
/* 1248 */     this.gunModel['é'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1249 */     this.gunModel['é'].setRotationPoint(110.0F, -27.5F, -5.0F);
/*      */     
/* 1251 */     this.gunModel['ê'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1252 */     this.gunModel['ê'].setRotationPoint(110.0F, -28.5F, -5.0F);
/*      */     
/* 1254 */     this.gunModel['ë'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.gunModel['ë'].setRotationPoint(68.0F, -29.5F, -5.0F);
/*      */     
/* 1257 */     this.gunModel['ì'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1258 */     this.gunModel['ì'].setRotationPoint(68.0F, -27.5F, -5.0F);
/*      */     
/* 1260 */     this.gunModel['í'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1261 */     this.gunModel['í'].setRotationPoint(68.0F, -28.5F, -5.0F);
/*      */     
/* 1263 */     this.gunModel['î'].addShapeBox(50.0F, -27.0F, -6.0F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1264 */     this.gunModel['î'].setRotationPoint(25.0F, -31.5F, 14.5F);
/*      */     
/* 1266 */     this.gunModel['ï'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1267 */     this.gunModel['ï'].setRotationPoint(22.0F, -31.5F, 14.5F);
/*      */     
/* 1269 */     this.gunModel['ð'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.gunModel['ð'].setRotationPoint(21.0F, -29.5F, 14.5F);
/*      */     
/* 1272 */     this.gunModel['ñ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1273 */     this.gunModel['ñ'].setRotationPoint(37.0F, -30.5F, 14.5F);
/*      */     
/* 1275 */     this.gunModel['ò'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1276 */     this.gunModel['ò'].setRotationPoint(39.0F, -29.5F, 14.5F);
/*      */     
/* 1278 */     this.gunModel['ó'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1279 */     this.gunModel['ó'].setRotationPoint(40.0F, -29.5F, 14.5F);
/*      */     
/* 1281 */     this.gunModel['ô'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 1282 */     this.gunModel['ô'].setRotationPoint(40.0F, -28.5F, 14.5F);
/*      */     
/* 1284 */     this.gunModel['õ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F);
/* 1285 */     this.gunModel['õ'].setRotationPoint(39.0F, -27.5F, 14.5F);
/*      */     
/* 1287 */     this.gunModel['ö'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.gunModel['ö'].setRotationPoint(37.0F, -32.5F, -3.5F);
/*      */     
/* 1290 */     this.gunModel['÷'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.gunModel['÷'].setRotationPoint(40.0F, -30.5F, 14.5F);
/*      */     
/* 1293 */     this.gunModel['ø'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1294 */     this.gunModel['ø'].setRotationPoint(39.0F, -31.5F, 14.5F);
/*      */     
/* 1296 */     this.gunModel['ù'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1297 */     this.gunModel['ù'].setRotationPoint(37.0F, -26.5F, 14.5F);
/*      */     
/* 1299 */     this.gunModel['ú'].addShapeBox(50.0F, -27.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1300 */     this.gunModel['ú'].setRotationPoint(25.0F, -32.5F, 14.5F);
/*      */     
/* 1302 */     this.gunModel['û'].addShapeBox(50.0F, -27.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1303 */     this.gunModel['û'].setRotationPoint(25.0F, -26.5F, 14.5F);
/*      */     
/* 1305 */     this.gunModel['ü'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1306 */     this.gunModel['ü'].setRotationPoint(22.0F, -32.5F, 14.5F);
/*      */     
/* 1308 */     this.gunModel['ý'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F);
/* 1309 */     this.gunModel['ý'].setRotationPoint(22.0F, -26.5F, 14.5F);
/*      */     
/* 1311 */     this.gunModel['þ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1312 */     this.gunModel['þ'].setRotationPoint(21.0F, -31.5F, 14.5F);
/*      */     
/* 1314 */     this.gunModel['ÿ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1315 */     this.gunModel['ÿ'].setRotationPoint(21.0F, -28.5F, 14.5F);
/*      */     
/* 1317 */     this.gunModel['Ā'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1318 */     this.gunModel['Ā'].setRotationPoint(30.0F, -30.5F, 15.0F);
/*      */     
/* 1320 */     this.gunModel['ā'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1321 */     this.gunModel['ā'].setRotationPoint(30.0F, -28.5F, 15.0F);
/*      */     
/* 1323 */     this.gunModel['Ă'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1324 */     this.gunModel['Ă'].setRotationPoint(30.0F, -29.5F, 15.0F);
/*      */     
/* 1326 */     this.gunModel['ă'].addShapeBox(50.0F, -27.0F, -6.0F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1327 */     this.gunModel['ă'].setRotationPoint(25.0F, -31.5F, -3.5F);
/*      */     
/* 1329 */     this.gunModel['Ą'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1330 */     this.gunModel['Ą'].setRotationPoint(22.0F, -31.5F, -3.5F);
/*      */     
/* 1332 */     this.gunModel['ą'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1333 */     this.gunModel['ą'].setRotationPoint(21.0F, -29.5F, -2.5F);
/*      */     
/* 1335 */     this.gunModel['Ć'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     this.gunModel['Ć'].setRotationPoint(21.0F, -31.5F, -2.5F);
/*      */     
/* 1338 */     this.gunModel['ć'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1339 */     this.gunModel['ć'].setRotationPoint(21.0F, -28.5F, -2.5F);
/*      */     
/* 1341 */     this.gunModel['Ĉ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1342 */     this.gunModel['Ĉ'].setRotationPoint(22.0F, -32.5F, -3.5F);
/*      */     
/* 1344 */     this.gunModel['ĉ'].addShapeBox(50.0F, -27.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1345 */     this.gunModel['ĉ'].setRotationPoint(25.0F, -32.5F, -3.5F);
/*      */     
/* 1347 */     this.gunModel['Ċ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1348 */     this.gunModel['Ċ'].setRotationPoint(37.0F, -30.5F, -3.5F);
/*      */     
/* 1350 */     this.gunModel['ċ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1351 */     this.gunModel['ċ'].setRotationPoint(39.0F, -29.5F, -3.5F);
/*      */     
/* 1353 */     this.gunModel['Č'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1354 */     this.gunModel['Č'].setRotationPoint(37.0F, -32.5F, 14.5F);
/*      */     
/* 1356 */     this.gunModel['č'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1357 */     this.gunModel['č'].setRotationPoint(39.0F, -31.5F, -3.5F);
/*      */     
/* 1359 */     this.gunModel['Ď'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1360 */     this.gunModel['Ď'].setRotationPoint(40.0F, -30.5F, -3.5F);
/*      */     
/* 1362 */     this.gunModel['ď'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1363 */     this.gunModel['ď'].setRotationPoint(40.0F, -29.5F, -3.5F);
/*      */     
/* 1365 */     this.gunModel['Đ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1366 */     this.gunModel['Đ'].setRotationPoint(40.0F, -28.5F, -3.5F);
/*      */     
/* 1368 */     this.gunModel['đ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1369 */     this.gunModel['đ'].setRotationPoint(39.0F, -27.5F, -3.5F);
/*      */     
/* 1371 */     this.gunModel['Ē'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1372 */     this.gunModel['Ē'].setRotationPoint(37.0F, -26.5F, -3.5F);
/*      */     
/* 1374 */     this.gunModel['ē'].addShapeBox(50.0F, -27.0F, -6.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1375 */     this.gunModel['ē'].setRotationPoint(25.0F, -26.5F, -3.5F);
/*      */     
/* 1377 */     this.gunModel['Ĕ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1378 */     this.gunModel['Ĕ'].setRotationPoint(22.0F, -26.5F, -3.5F);
/*      */     
/* 1380 */     this.gunModel['ĕ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.gunModel['ĕ'].setRotationPoint(30.0F, -30.5F, -4.0F);
/*      */     
/* 1383 */     this.gunModel['Ė'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1384 */     this.gunModel['Ė'].setRotationPoint(30.0F, -28.5F, -4.0F);
/*      */     
/* 1386 */     this.gunModel['ė'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1387 */     this.gunModel['ė'].setRotationPoint(30.0F, -29.5F, -4.0F);
/*      */     
/* 1389 */     this.gunModel['Ę'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 10, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1390 */     this.gunModel['Ę'].setRotationPoint(-76.5F, -23.0F, -2.5F);
/*      */     
/* 1392 */     this.gunModel['ę'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 13, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1393 */     this.gunModel['ę'].setRotationPoint(-76.5F, -14.0F, 0.0F);
/*      */     
/* 1395 */     this.gunModel['Ě'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 35, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1396 */     this.gunModel['Ě'].setRotationPoint(-78.5F, -47.0F, -2.5F);
/*      */     
/* 1398 */     this.gunModel['ě'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 5, 15, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1399 */     this.gunModel['ě'].setRotationPoint(-78.5F, -12.5F, -1.0F);
/*      */     
/* 1401 */     this.gunModel['Ĝ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1402 */     this.gunModel['Ĝ'].setRotationPoint(-78.5F, -48.5F, 0.5F);
/*      */     
/* 1404 */     this.gunModel['ĝ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1405 */     this.gunModel['ĝ'].setRotationPoint(-78.5F, -48.0F, 12.5F);
/*      */     
/* 1407 */     this.gunModel['Ğ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.gunModel['Ğ'].setRotationPoint(-78.5F, -48.0F, -0.5F);
/*      */     
/* 1410 */     this.gunModel['ğ'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 1, 12, 0.0F, 0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1411 */     this.gunModel['ğ'].setRotationPoint(-84.5F, -49.5F, 0.5F);
/*      */     
/* 1413 */     this.gunModel['Ġ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F);
/* 1414 */     this.gunModel['Ġ'].setRotationPoint(-83.5F, -51.5F, 0.5F);
/*      */     
/* 1416 */     this.gunModel['ġ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 1417 */     this.gunModel['ġ'].setRotationPoint(-83.5F, -50.5F, -0.5F);
/*      */     
/* 1419 */     this.gunModel['Ģ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.gunModel['Ģ'].setRotationPoint(-78.5F, -46.0F, 15.5F);
/*      */     
/* 1422 */     this.gunModel['ģ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1423 */     this.gunModel['ģ'].setRotationPoint(-78.5F, -45.0F, 16.5F);
/*      */     
/* 1425 */     this.gunModel['Ĥ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1426 */     this.gunModel['Ĥ'].setRotationPoint(-78.5F, -40.0F, 15.5F);
/*      */     
/* 1428 */     this.gunModel['ĥ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1429 */     this.gunModel['ĥ'].setRotationPoint(-78.5F, -32.0F, 15.5F);
/*      */     
/* 1431 */     this.gunModel['Ħ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1432 */     this.gunModel['Ħ'].setRotationPoint(-78.5F, -31.0F, 16.5F);
/*      */     
/* 1434 */     this.gunModel['ħ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1435 */     this.gunModel['ħ'].setRotationPoint(-78.5F, -26.0F, 15.5F);
/*      */     
/* 1437 */     this.gunModel['Ĩ'].addShapeBox(50.0F, -27.0F, -6.0F, 10, 5, 15, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1438 */     this.gunModel['Ĩ'].setRotationPoint(-88.5F, -12.5F, -1.0F);
/*      */     
/* 1440 */     this.gunModel['ĩ'].addShapeBox(50.0F, -27.0F, -6.0F, 9, 18, 18, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1441 */     this.gunModel['ĩ'].setRotationPoint(-87.5F, -30.0F, -2.5F);
/*      */     
/* 1443 */     this.gunModel['Ī'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 17, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1444 */     this.gunModel['Ī'].setRotationPoint(-81.5F, -47.0F, -2.5F);
/*      */     
/* 1446 */     this.gunModel['ī'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 15, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1447 */     this.gunModel['ī'].setRotationPoint(-83.5F, -47.0F, -2.5F);
/*      */     
/* 1449 */     this.gunModel['Ĭ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1450 */     this.gunModel['Ĭ'].setRotationPoint(-87.5F, -32.0F, -2.5F);
/*      */     
/* 1452 */     this.gunModel['ĭ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1453 */     this.gunModel['ĭ'].setRotationPoint(-83.5F, -32.0F, -2.5F);
/*      */     
/* 1455 */     this.gunModel['Į'].addShapeBox(50.0F, -27.0F, -6.0F, 52, 12, 14, 0.0F, 3.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1456 */     this.gunModel['Į'].setRotationPoint(-139.5F, -25.0F, -0.5F);
/*      */     
/* 1458 */     this.gunModel['į'].addShapeBox(50.0F, -27.0F, -6.0F, 52, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1459 */     this.gunModel['į'].setRotationPoint(-139.5F, -13.0F, -0.5F);
/*      */     
/* 1461 */     this.gunModel['İ'].addShapeBox(50.0F, -27.0F, -6.0F, 52, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1462 */     this.gunModel['İ'].setRotationPoint(-139.5F, -10.0F, 0.5F);
/*      */     
/* 1464 */     this.gunModel['ı'].addShapeBox(50.0F, -27.0F, -6.0F, 28, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1465 */     this.gunModel['ı'].setRotationPoint(-167.5F, -13.0F, 0.5F);
/*      */     
/* 1467 */     this.gunModel['Ĳ'].addShapeBox(50.0F, -27.0F, -6.0F, 28, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1468 */     this.gunModel['Ĳ'].setRotationPoint(-167.5F, -10.0F, 1.5F);
/*      */     
/* 1470 */     this.gunModel['ĳ'].addShapeBox(50.0F, -27.0F, -6.0F, 38, 11, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1471 */     this.gunModel['ĳ'].setRotationPoint(-177.5F, -24.0F, 0.5F);
/*      */     
/* 1473 */     this.gunModel['Ĵ'].addShapeBox(50.0F, -27.0F, -6.0F, 38, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1474 */     this.gunModel['Ĵ'].setRotationPoint(-177.5F, -32.0F, 0.5F);
/*      */     
/* 1476 */     this.gunModel['ĵ'].addShapeBox(50.0F, -27.0F, -6.0F, 24, 11, 13, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1477 */     this.gunModel['ĵ'].setRotationPoint(-198.5F, -24.0F, 0.0F);
/*      */     
/* 1479 */     this.gunModel['Ķ'].addShapeBox(50.0F, -27.0F, -6.0F, 22, 7, 13, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1480 */     this.gunModel['Ķ'].setRotationPoint(-199.5F, -31.0F, 0.0F);
/*      */     
/* 1482 */     this.gunModel['ķ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 13, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1483 */     this.gunModel['ķ'].setRotationPoint(-180.5F, -34.0F, 0.0F);
/*      */     
/* 1485 */     this.gunModel['ĸ'].addShapeBox(50.0F, -27.0F, -6.0F, 18, 2, 11, 0.0F, 0.0F, 0.5F, -3.0F, 2.25F, 0.5F, -3.0F, 2.25F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1486 */     this.gunModel['ĸ'].setRotationPoint(-197.0F, -36.0F, 1.0F);
/*      */     
/* 1488 */     this.gunModel['Ĺ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 13, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1489 */     this.gunModel['Ĺ'].setRotationPoint(-199.0F, -34.0F, 0.0F);
/*      */     
/* 1491 */     this.gunModel['ĺ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1492 */     this.gunModel['ĺ'].setRotationPoint(-181.5F, -33.0F, 0.0F);
/*      */     
/* 1494 */     this.gunModel['Ļ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1495 */     this.gunModel['Ļ'].setRotationPoint(-196.0F, -34.0F, 0.0F);
/*      */     
/* 1497 */     this.gunModel['ļ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 1498 */     this.gunModel['ļ'].setRotationPoint(-181.5F, -34.0F, 0.0F);
/*      */     
/* 1500 */     this.gunModel['Ľ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1501 */     this.gunModel['Ľ'].setRotationPoint(-196.0F, -33.0F, 0.0F);
/*      */     
/* 1503 */     this.gunModel['ľ'].addShapeBox(50.0F, -27.0F, -6.0F, 38, 2, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1504 */     this.gunModel['ľ'].setRotationPoint(-177.5F, -34.0F, 0.5F);
/*      */     
/* 1506 */     this.gunModel['Ŀ'].addShapeBox(50.0F, -27.0F, -6.0F, 38, 2, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1507 */     this.gunModel['Ŀ'].setRotationPoint(-177.5F, -36.0F, 1.5F);
/*      */     
/* 1509 */     this.gunModel['ŀ'].addShapeBox(50.0F, -27.0F, -6.0F, 24, 4, 13, 0.0F, 0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1510 */     this.gunModel['ŀ'].setRotationPoint(-198.5F, -13.0F, 0.0F);
/*      */     
/* 1512 */     this.gunModel['Ł'].addShapeBox(50.0F, -27.0F, -6.0F, 23, 30, 13, 0.0F, 0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1513 */     this.gunModel['Ł'].setRotationPoint(-200.5F, -9.0F, 0.0F);
/*      */     
/* 1515 */     this.gunModel['ł'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 28, 11, 0.0F, 0.15F, 0.0F, 1.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 1.0F, 16.0F, 0.0F, 1.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 16.0F, 0.0F, 1.0F);
/* 1516 */     this.gunModel['ł'].setRotationPoint(-174.5F, -7.0F, 1.0F);
/*      */     
/* 1518 */     this.gunModel['Ń'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 28, 11, 0.0F, 0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -3.0F, -0.15F, 0.0F, -3.0F, 0.15F, 0.0F, 0.0F, 16.0F, 0.0F, 0.0F, -16.0F, 0.0F, -3.0F, -16.0F, 0.0F, -3.0F, 16.0F, 0.0F, 0.0F);
/* 1519 */     this.gunModel['Ń'].setRotationPoint(-171.5F, -7.0F, 1.0F);
/*      */     
/* 1521 */     this.gunModel['ń'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 11, 0.0F, -2.15F, 0.0F, 0.0F, 2.15F, 0.0F, -3.5F, 2.15F, 0.0F, -3.5F, -2.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1522 */     this.gunModel['ń'].setRotationPoint(-171.65F, -9.0F, 1.0F);
/*      */     
/* 1524 */     this.gunModel['Ņ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 10, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F);
/* 1525 */     this.gunModel['Ņ'].setRotationPoint(-169.5F, -10.0F, 1.5F);
/*      */     
/* 1527 */     this.gunModel['ņ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 12, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F);
/* 1528 */     this.gunModel['ņ'].setRotationPoint(-170.5F, -13.0F, 0.5F);
/*      */     
/* 1530 */     this.gunModel['Ň'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 11, 0.0F, -2.15F, 0.0F, 1.0F, 2.15F, 0.0F, 0.0F, 2.15F, 0.0F, 0.0F, -2.15F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 1531 */     this.gunModel['Ň'].setRotationPoint(-174.65F, -9.0F, 1.0F);
/*      */     
/* 1533 */     this.gunModel['ň'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 11, 0.0F, -2.15F, -0.5F, 1.0F, 2.15F, -0.5F, -0.5F, 2.15F, -0.5F, -0.5F, -2.15F, -0.5F, 1.0F, -0.15F, 0.0F, 1.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 1.0F);
/* 1534 */     this.gunModel['ň'].setRotationPoint(-172.65F, -11.0F, 1.0F);
/*      */     
/* 1536 */     this.gunModel['ŉ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 11, 0.0F, -2.9F, -0.5F, 1.0F, 2.15F, -0.5F, 1.0F, 2.15F, -0.5F, 1.0F, -2.9F, -0.5F, 1.0F, -2.15F, 0.0F, 1.0F, 0.15F, 0.0F, 1.0F, 0.15F, 0.0F, 1.0F, -2.15F, 0.0F, 1.0F);
/* 1537 */     this.gunModel['ŉ'].setRotationPoint(-175.65F, -11.0F, 1.0F);
/*      */     
/* 1539 */     this.gunModel['Ŋ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 11, 0.0F, -2.15F, 0.0F, 1.0F, 2.15F, 0.0F, 1.0F, 2.15F, 0.0F, 1.0F, -2.15F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/* 1540 */     this.gunModel['Ŋ'].setRotationPoint(-175.65F, -9.0F, 1.0F);
/*      */     
/* 1542 */     this.gunModel['ŋ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 13, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1543 */     this.gunModel['ŋ'].setRotationPoint(-170.5F, -13.5F, 0.0F);
/*      */     
/* 1545 */     this.gunModel['Ō'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 8, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1546 */     this.gunModel['Ō'].setRotationPoint(-87.5F, -40.0F, -2.5F);
/*      */     
/* 1548 */     this.gunModel['ō'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -3.0F, -4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 0.0F);
/* 1549 */     this.gunModel['ō'].setRotationPoint(-187.5F, 21.0F, 1.0F);
/*      */     
/* 1551 */     this.gunModel['Ŏ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1552 */     this.gunModel['Ŏ'].setRotationPoint(-191.5F, 27.0F, 1.0F);
/*      */     
/* 1554 */     this.gunModel['ŏ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F);
/* 1555 */     this.gunModel['ŏ'].setRotationPoint(-194.5F, 27.0F, 1.0F);
/*      */     
/* 1557 */     this.gunModel['Ő'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 6, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 1.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F);
/* 1558 */     this.gunModel['Ő'].setRotationPoint(-190.5F, 21.0F, 1.0F);
/*      */     
/* 1560 */     this.gunModel['ő'].addShapeBox(50.0F, -27.0F, -6.0F, 9, 6, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1561 */     this.gunModel['ő'].setRotationPoint(-199.5F, 21.0F, 0.0F);
/*      */     
/* 1563 */     this.gunModel['Œ'].addShapeBox(50.0F, -27.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1564 */     this.gunModel['Œ'].setRotationPoint(-199.5F, 27.0F, 1.0F);
/*      */     
/* 1566 */     this.gunModel['œ'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 6, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1567 */     this.gunModel['œ'].setRotationPoint(-207.5F, 21.0F, -1.0F);
/*      */     
/* 1569 */     this.gunModel['Ŕ'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 21, 15, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1570 */     this.gunModel['Ŕ'].setRotationPoint(-207.5F, 0.0F, -1.0F);
/*      */     
/* 1572 */     this.gunModel['ŕ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 13, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1573 */     this.gunModel['ŕ'].setRotationPoint(-204.5F, -13.0F, -1.0F);
/*      */     
/* 1575 */     this.gunModel['Ŗ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 13, 15, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1576 */     this.gunModel['Ŗ'].setRotationPoint(-204.5F, -26.0F, -1.0F);
/*      */     
/* 1578 */     this.gunModel['ŗ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 7, 15, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1579 */     this.gunModel['ŗ'].setRotationPoint(-205.5F, -33.0F, -1.0F);
/*      */     
/* 1581 */     this.gunModel['Ř'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 3, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1582 */     this.gunModel['Ř'].setRotationPoint(-206.5F, -36.0F, -1.0F);
/*      */     
/* 1584 */     this.gunModel['ř'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 3, 11, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1585 */     this.gunModel['ř'].setRotationPoint(-206.5F, -39.0F, 1.0F);
/*      */     
/* 1587 */     this.gunModel['Ś'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1588 */     this.gunModel['Ś'].setRotationPoint(-198.5F, -36.0F, -1.0F);
/*      */     
/* 1590 */     this.gunModel['ś'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1591 */     this.gunModel['ś'].setRotationPoint(-198.5F, -33.0F, -1.0F);
/*      */     
/* 1593 */     this.gunModel['Ŝ'].addShapeBox(50.0F, -27.0F, -6.0F, 10, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1594 */     this.gunModel['Ŝ'].setRotationPoint(-208.0F, 27.0F, -1.0F);
/*      */     
/* 1596 */     this.gunModel['ŝ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 15, 0.0F, 0.5F, 0.0F, 0.0F, -4.5F, 2.0F, 0.0F, -4.5F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1597 */     this.gunModel['ŝ'].setRotationPoint(-199.0F, 25.0F, -1.0F);
/*      */     
/* 1599 */     this.gunModel['Ş'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 2, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/* 1600 */     this.gunModel['Ş'].setRotationPoint(-197.5F, -12.0F, 13.0F);
/*      */     
/* 1602 */     this.gunModel['ş'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 4, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F);
/* 1603 */     this.gunModel['ş'].setRotationPoint(-197.5F, -16.0F, 13.0F);
/*      */     
/* 1605 */     this.gunModel['Š'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 5, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1606 */     this.gunModel['Š'].setRotationPoint(-197.5F, -20.0F, 13.0F);
/*      */     
/* 1608 */     this.gunModel['š'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1609 */     this.gunModel['š'].setRotationPoint(-196.5F, -22.0F, 13.0F);
/*      */     
/* 1611 */     this.gunModel['Ţ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 4, 3, 0.0F, 0.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F);
/* 1612 */     this.gunModel['Ţ'].setRotationPoint(-184.5F, -16.0F, 13.0F);
/*      */     
/* 1614 */     this.gunModel['ţ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F);
/* 1615 */     this.gunModel['ţ'].setRotationPoint(-184.5F, -12.0F, 13.0F);
/*      */     
/* 1617 */     this.gunModel['Ť'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 5, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1618 */     this.gunModel['Ť'].setRotationPoint(-185.25F, -20.0F, 13.0F);
/*      */     
/* 1620 */     this.gunModel['ť'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1621 */     this.gunModel['ť'].setRotationPoint(-184.25F, -22.0F, 13.0F);
/*      */     
/* 1623 */     this.gunModel['Ŧ'].addShapeBox(50.0F, -27.0F, -6.0F, 11, 5, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1624 */     this.gunModel['Ŧ'].setRotationPoint(-195.5F, -20.0F, 12.5F);
/*      */     
/* 1626 */     this.gunModel['ŧ'].addShapeBox(50.0F, -27.0F, -6.0F, 10, 2, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1627 */     this.gunModel['ŧ'].setRotationPoint(-194.5F, -22.0F, 12.5F);
/*      */     
/* 1629 */     this.gunModel['Ũ'].addShapeBox(50.0F, -27.0F, -6.0F, 12, 4, 3, 0.0F, 0.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.5F, -0.25F, 0.5F, -2.5F);
/* 1630 */     this.gunModel['Ũ'].setRotationPoint(-195.5F, -16.0F, 12.5F);
/*      */     
/* 1632 */     this.gunModel['ũ'].addShapeBox(50.0F, -27.0F, -6.0F, 52, 9, 5, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1633 */     this.gunModel['ũ'].setRotationPoint(-146.5F, -34.0F, -2.5F);
/*      */     
/* 1635 */     this.gunModel['Ū'].addShapeBox(50.0F, -27.0F, -6.0F, 57, 3, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1636 */     this.gunModel['Ū'].setRotationPoint(-149.5F, -37.0F, -2.5F);
/*      */     
/* 1638 */     this.gunModel['ū'].addShapeBox(50.0F, -27.0F, -6.0F, 57, 2, 5, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1639 */     this.gunModel['ū'].setRotationPoint(-149.5F, -39.0F, -2.5F);
/*      */     
/* 1641 */     this.gunModel['Ŭ'].addShapeBox(50.0F, -27.0F, -6.0F, 56, 3, 10, 0.0F, -13.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1642 */     this.gunModel['Ŭ'].setRotationPoint(-148.5F, -42.0F, -2.0F);
/*      */     
/* 1644 */     this.gunModel['ŭ'].addShapeBox(50.0F, -27.0F, -6.0F, 51, 3, 12, 0.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/* 1645 */     this.gunModel['ŭ'].setRotationPoint(-135.5F, -45.0F, 0.5F);
/*      */     
/* 1647 */     this.gunModel['Ů'].addShapeBox(50.0F, -27.0F, -6.0F, 17, 1, 12, 0.0F, -17.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, -17.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1648 */     this.gunModel['Ů'].setRotationPoint(-111.5F, -46.0F, 0.5F);
/*      */     
/* 1650 */     this.gunModel['ů'].addShapeBox(50.0F, -27.0F, -6.0F, 53, 9, 5, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1651 */     this.gunModel['ů'].setRotationPoint(-146.5F, -34.0F, 10.5F);
/*      */     
/* 1653 */     this.gunModel['Ű'].addShapeBox(50.0F, -27.0F, -6.0F, 55, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1654 */     this.gunModel['Ű'].setRotationPoint(-149.5F, -37.0F, 10.5F);
/*      */     
/* 1656 */     this.gunModel['ű'].addShapeBox(50.0F, -27.0F, -6.0F, 55, 2, 5, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1657 */     this.gunModel['ű'].setRotationPoint(-149.5F, -39.0F, 10.5F);
/*      */     
/* 1659 */     this.gunModel['Ų'].addShapeBox(50.0F, -27.0F, -6.0F, 54, 3, 7, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -13.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1660 */     this.gunModel['Ų'].setRotationPoint(-148.5F, -42.0F, 8.0F);
/*      */     
/* 1662 */     this.gunModel['ų'].addShapeBox(50.0F, -27.0F, -6.0F, 55, 2, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1663 */     this.gunModel['ų'].setRotationPoint(-149.5F, -39.0F, 2.5F);
/*      */     
/* 1665 */     this.gunModel['Ŵ'].addShapeBox(50.0F, -27.0F, -6.0F, 55, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1666 */     this.gunModel['Ŵ'].setRotationPoint(-149.5F, -37.0F, 2.5F);
/*      */     
/* 1668 */     this.gunModel['ŵ'].addShapeBox(50.0F, -27.0F, -6.0F, 55, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1669 */     this.gunModel['ŵ'].setRotationPoint(-149.5F, -37.0F, 9.5F);
/*      */     
/* 1671 */     this.gunModel['Ŷ'].addShapeBox(50.0F, -27.0F, -6.0F, 55, 2, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1672 */     this.gunModel['Ŷ'].setRotationPoint(-149.5F, -39.0F, 6.5F);
/*      */     
/* 1674 */     this.gunModel['ŷ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1675 */     this.gunModel['ŷ'].setRotationPoint(-146.5F, -39.0F, 2.5F);
/*      */     
/* 1677 */     this.gunModel['Ÿ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 9, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1678 */     this.gunModel['Ÿ'].setRotationPoint(-94.5F, -34.0F, -2.5F);
/*      */     
/* 1680 */     this.gunModel['Ź'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1681 */     this.gunModel['Ź'].setRotationPoint(-92.5F, -34.0F, -2.5F);
/*      */     
/* 1683 */     this.gunModel['ź'].addShapeBox(50.0F, -27.0F, -6.0F, 5, 3, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1684 */     this.gunModel['ź'].setRotationPoint(-92.5F, -37.0F, -2.5F);
/*      */     
/* 1686 */     this.gunModel['Ż'].addShapeBox(50.0F, -27.0F, -6.0F, 5, 2, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1687 */     this.gunModel['Ż'].setRotationPoint(-92.5F, -39.0F, -2.5F);
/*      */     
/* 1689 */     this.gunModel['ż'].addShapeBox(50.0F, -27.0F, -6.0F, 5, 1, 5, 0.0F, 0.0F, 0.0F, -1.15F, 0.5F, 0.0F, -1.15F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1690 */     this.gunModel['ż'].setRotationPoint(-92.5F, -40.0F, -2.5F);
/*      */     
/* 1692 */     this.gunModel['Ž'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 2, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1693 */     this.gunModel['Ž'].setRotationPoint(-92.5F, -42.0F, -2.5F);
/*      */     
/* 1695 */     this.gunModel['ž'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -1.5F, 0.0F, 2.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1696 */     this.gunModel['ž'].setRotationPoint(-94.5F, -47.0F, 0.5F);
/*      */     
/* 1698 */     this.gunModel['ſ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1699 */     this.gunModel['ſ'].setRotationPoint(-88.5F, -49.0F, 0.5F);
/*      */     
/* 1701 */     this.gunModel['ƀ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 9, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1702 */     this.gunModel['ƀ'].setRotationPoint(-93.5F, -34.0F, 10.5F);
/*      */     
/* 1704 */     this.gunModel['Ɓ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1705 */     this.gunModel['Ɓ'].setRotationPoint(-91.5F, -34.0F, 10.5F);
/*      */     
/* 1707 */     this.gunModel['Ƃ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1708 */     this.gunModel['Ƃ'].setRotationPoint(-94.5F, -37.0F, 10.5F);
/*      */     
/* 1710 */     this.gunModel['ƃ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1711 */     this.gunModel['ƃ'].setRotationPoint(-94.5F, -39.0F, 10.5F);
/*      */     
/* 1713 */     this.gunModel['Ƅ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1714 */     this.gunModel['Ƅ'].setRotationPoint(-94.5F, -40.0F, 10.5F);
/*      */     
/* 1716 */     this.gunModel['ƅ'].addShapeBox(50.0F, -27.0F, -6.0F, 10, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F);
/* 1717 */     this.gunModel['ƅ'].setRotationPoint(-94.5F, -42.0F, 10.5F);
/*      */     
/* 1719 */     this.gunModel['Ɔ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1720 */     this.gunModel['Ɔ'].setRotationPoint(-84.75F, -48.5F, 0.5F);
/*      */     
/* 1722 */     this.gunModel['Ƈ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1723 */     this.gunModel['Ƈ'].setRotationPoint(-81.4F, -48.5F, 0.5F);
/*      */     
/* 1725 */     this.gunModel['ƈ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1726 */     this.gunModel['ƈ'].setRotationPoint(-81.4F, -48.0F, 12.5F);
/*      */     
/* 1728 */     this.gunModel['Ɖ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1729 */     this.gunModel['Ɖ'].setRotationPoint(-81.4F, -48.0F, -0.5F);
/*      */     
/* 1731 */     this.gunModel['Ɗ'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 18, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1732 */     this.gunModel['Ɗ'].setRotationPoint(-94.5F, -42.0F, 1.5F);
/*      */     
/* 1734 */     this.gunModel['Ƌ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1735 */     this.gunModel['Ƌ'].setRotationPoint(-91.5F, -28.0F, 12.5F);
/*      */     
/* 1737 */     this.gunModel['ƌ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 3, 4, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1738 */     this.gunModel['ƌ'].setRotationPoint(-92.5F, -27.0F, 12.5F);
/*      */     
/* 1740 */     this.gunModel['ƍ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1741 */     this.gunModel['ƍ'].setRotationPoint(-91.5F, -25.0F, 12.5F);
/*      */     
/* 1743 */     this.gunModel['Ǝ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 3, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -3.0F, 0.0F);
/* 1744 */     this.gunModel['Ǝ'].setRotationPoint(-92.5F, -22.0F, 12.5F);
/*      */     
/* 1746 */     this.gunModel['Ə'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F);
/* 1747 */     this.gunModel['Ə'].setRotationPoint(-91.5F, -21.0F, 12.5F);
/*      */     
/* 1749 */     this.gunModel['Ɛ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1750 */     this.gunModel['Ɛ'].setRotationPoint(-92.5F, -24.0F, 12.5F);
/*      */     
/* 1752 */     this.gunModel['Ƒ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1753 */     this.gunModel['Ƒ'].setRotationPoint(-92.5F, -26.0F, -2.5F);
/*      */     
/* 1755 */     this.gunModel['ƒ'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1756 */     this.gunModel['ƒ'].setRotationPoint(-98.5F, -40.5F, 13.5F);
/*      */     
/* 1758 */     this.gunModel['Ɠ'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1759 */     this.gunModel['Ɠ'].setRotationPoint(-98.5F, -41.5F, 13.0F);
/*      */     
/* 1761 */     this.gunModel['Ɣ'].addShapeBox(50.0F, -27.0F, -6.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1762 */     this.gunModel['Ɣ'].setRotationPoint(-98.5F, -34.5F, 13.5F);
/*      */     
/* 1764 */     this.gunModel['ƕ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1765 */     this.gunModel['ƕ'].setRotationPoint(-99.5F, -40.5F, 13.25F);
/*      */     
/* 1767 */     this.gunModel['Ɩ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F);
/* 1768 */     this.gunModel['Ɩ'].setRotationPoint(-105.5F, -40.5F, 13.25F);
/*      */     
/* 1770 */     this.gunModel['Ɨ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1771 */     this.gunModel['Ɨ'].setRotationPoint(-99.5F, -41.5F, 13.75F);
/*      */     
/* 1773 */     this.gunModel['Ƙ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1774 */     this.gunModel['Ƙ'].setRotationPoint(-98.5F, -42.5F, 12.75F);
/*      */     
/* 1776 */     this.gunModel['ƙ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1777 */     this.gunModel['ƙ'].setRotationPoint(-90.5F, -41.5F, 12.75F);
/*      */     
/* 1779 */     this.gunModel['ƚ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1780 */     this.gunModel['ƚ'].setRotationPoint(-90.5F, -40.5F, 13.25F);
/*      */     
/* 1782 */     this.gunModel['ƛ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1783 */     this.gunModel['ƛ'].setRotationPoint(-90.5F, -34.5F, 13.25F);
/*      */     
/* 1785 */     this.gunModel['Ɯ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1786 */     this.gunModel['Ɯ'].setRotationPoint(-99.5F, -34.5F, 13.25F);
/*      */     
/* 1788 */     this.gunModel['Ɲ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1789 */     this.gunModel['Ɲ'].setRotationPoint(-98.5F, -33.5F, 13.25F);
/*      */     
/* 1791 */     this.gunModel['ƞ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F);
/* 1792 */     this.gunModel['ƞ'].setRotationPoint(-105.5F, -34.5F, 13.25F);
/*      */     
/* 1794 */     this.gunModel['Ɵ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F);
/* 1795 */     this.gunModel['Ɵ'].setRotationPoint(-104.5F, -33.5F, 13.25F);
/*      */     
/* 1797 */     this.gunModel['Ơ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 1798 */     this.gunModel['Ơ'].setRotationPoint(-105.5F, -41.5F, 13.25F);
/*      */     
/* 1800 */     this.gunModel['ơ'].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F);
/* 1801 */     this.gunModel['ơ'].setRotationPoint(-104.5F, -42.5F, 13.25F);
/*      */     
/* 1803 */     this.gunModel['Ƣ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 18, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1804 */     this.gunModel['Ƣ'].setRotationPoint(-87.5F, -30.0F, 15.5F);
/*      */     
/* 1806 */     this.gunModel['ƣ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 18, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F);
/* 1807 */     this.gunModel['ƣ'].setRotationPoint(-87.5F, -30.0F, 16.5F);
/*      */     
/* 1809 */     this.gunModel['Ƥ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1810 */     this.gunModel['Ƥ'].setRotationPoint(-86.5F, -27.0F, 15.0F);
/*      */     
/* 1812 */     this.gunModel['ƥ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1813 */     this.gunModel['ƥ'].setRotationPoint(-87.0F, -21.0F, 15.0F);
/*      */     
/* 1815 */     this.gunModel['Ʀ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1816 */     this.gunModel['Ʀ'].setRotationPoint(-36.0F, -32.5F, 14.25F);
/*      */     
/* 1818 */     this.gunModel['Ƨ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1819 */     this.gunModel['Ƨ'].setRotationPoint(-36.0F, -30.5F, 14.25F);
/*      */     
/* 1821 */     this.gunModel['ƨ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1822 */     this.gunModel['ƨ'].setRotationPoint(-36.0F, -31.5F, 14.25F);
/*      */     
/* 1824 */     this.gunModel['Ʃ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1825 */     this.gunModel['Ʃ'].setRotationPoint(-64.0F, -32.5F, 14.25F);
/*      */     
/* 1827 */     this.gunModel['ƪ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1828 */     this.gunModel['ƪ'].setRotationPoint(-64.0F, -30.5F, 14.25F);
/*      */     
/* 1830 */     this.gunModel['ƫ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1831 */     this.gunModel['ƫ'].setRotationPoint(-64.0F, -31.5F, 14.25F);
/*      */     
/* 1833 */     this.gunModel['Ƭ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1834 */     this.gunModel['Ƭ'].setRotationPoint(-70.0F, -30.5F, 14.25F);
/*      */     
/* 1836 */     this.gunModel['ƭ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1837 */     this.gunModel['ƭ'].setRotationPoint(-70.0F, -28.5F, 14.25F);
/*      */     
/* 1839 */     this.gunModel['Ʈ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1840 */     this.gunModel['Ʈ'].setRotationPoint(-70.0F, -29.5F, 14.25F);
/*      */     
/* 1842 */     this.gunModel['Ư'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1843 */     this.gunModel['Ư'].setRotationPoint(-75.0F, -30.5F, 14.25F);
/*      */     
/* 1845 */     this.gunModel['ư'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1846 */     this.gunModel['ư'].setRotationPoint(-75.0F, -28.5F, 14.25F);
/*      */     
/* 1848 */     this.gunModel['Ʊ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1849 */     this.gunModel['Ʊ'].setRotationPoint(-75.0F, -29.5F, 14.25F);
/*      */     
/* 1851 */     this.gunModel['Ʋ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1852 */     this.gunModel['Ʋ'].setRotationPoint(-3.0F, -32.5F, 14.25F);
/*      */     
/* 1854 */     this.gunModel['Ƴ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1855 */     this.gunModel['Ƴ'].setRotationPoint(-3.0F, -30.5F, 14.25F);
/*      */     
/* 1857 */     this.gunModel['ƴ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1858 */     this.gunModel['ƴ'].setRotationPoint(-3.0F, -31.5F, 14.25F);
/*      */     
/* 1860 */     this.gunModel['Ƶ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 1861 */     this.gunModel['Ƶ'].setRotationPoint(24.75F, -18.5F, -0.5F);
/*      */     
/* 1863 */     this.gunModel['ƶ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1864 */     this.gunModel['ƶ'].setRotationPoint(25.0F, -17.75F, -0.5F);
/*      */     
/* 1866 */     this.gunModel['Ʒ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1867 */     this.gunModel['Ʒ'].setRotationPoint(25.0F, -19.25F, -0.5F);
/*      */     
/* 1869 */     this.gunModel['Ƹ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1870 */     this.gunModel['Ƹ'].setRotationPoint(24.25F, -19.25F, -0.5F);
/*      */     
/* 1872 */     this.gunModel['ƹ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 14, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1873 */     this.gunModel['ƹ'].setRotationPoint(25.5F, -19.25F, -0.5F);
/*      */     
/* 1875 */     this.gunModel['ƺ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1876 */     this.gunModel['ƺ'].setRotationPoint(24.25F, -18.0F, -0.5F);
/*      */     
/* 1878 */     this.gunModel['ƻ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 14, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1879 */     this.gunModel['ƻ'].setRotationPoint(25.5F, -18.0F, -0.5F);
/*      */     
/* 1881 */     this.gunModel['Ƽ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1882 */     this.gunModel['Ƽ'].setRotationPoint(-20.0F, -5.5F, 12.0F);
/*      */     
/* 1884 */     this.gunModel['ƽ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1885 */     this.gunModel['ƽ'].setRotationPoint(-16.0F, -5.5F, 12.0F);
/*      */     
/* 1887 */     this.gunModel['ƾ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1888 */     this.gunModel['ƾ'].setRotationPoint(-14.0F, -7.5F, 12.0F);
/*      */     
/* 1890 */     this.gunModel['ƿ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1891 */     this.gunModel['ƿ'].setRotationPoint(-14.0F, -15.5F, 12.0F);
/*      */     
/* 1893 */     this.gunModel['ǀ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1894 */     this.gunModel['ǀ'].setRotationPoint(-20.0F, -15.5F, 12.0F);
/*      */     
/* 1896 */     this.gunModel['ǁ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1897 */     this.gunModel['ǁ'].setRotationPoint(-16.0F, -15.5F, 12.0F);
/*      */     
/* 1899 */     this.gunModel['ǂ'].addShapeBox(50.0F, -27.0F, -6.0F, 10, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1900 */     this.gunModel['ǂ'].setRotationPoint(-13.0F, -11.5F, 12.5F);
/*      */     
/* 1902 */     this.gunModel['ǃ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1903 */     this.gunModel['ǃ'].setRotationPoint(-3.0F, -11.5F, 12.5F);
/*      */     
/* 1905 */     this.gunModel['Ǆ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1906 */     this.gunModel['Ǆ'].setRotationPoint(-1.5F, -11.0F, 12.5F);
/*      */     
/* 1908 */     this.gunModel['ǅ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1909 */     this.gunModel['ǅ'].setRotationPoint(-19.0F, -14.5F, 12.25F);
/*      */     
/* 1911 */     this.gunModel['ǆ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1912 */     this.gunModel['ǆ'].setRotationPoint(-16.0F, -14.5F, 12.25F);
/*      */     
/* 1914 */     this.gunModel['Ǉ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 9, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1915 */     this.gunModel['Ǉ'].setRotationPoint(-22.0F, -14.5F, 12.25F);
/*      */     
/* 1917 */     this.gunModel['ǈ'].addShapeBox(50.0F, -27.0F, -6.0F, 9, 2, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1918 */     this.gunModel['ǈ'].setRotationPoint(-12.0F, -20.0F, 12.5F);
/*      */     
/* 1920 */     this.gunModel['ǉ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1921 */     this.gunModel['ǉ'].setRotationPoint(-20.5F, -22.0F, 12.0F);
/*      */     
/* 1923 */     this.gunModel['Ǌ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1924 */     this.gunModel['Ǌ'].setRotationPoint(-15.5F, -22.0F, 12.0F);
/*      */     
/* 1926 */     this.gunModel['ǋ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1927 */     this.gunModel['ǋ'].setRotationPoint(-19.5F, -22.0F, 12.5F);
/*      */     
/* 1929 */     this.gunModel['ǌ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1930 */     this.gunModel['ǌ'].setRotationPoint(-19.5F, -18.0F, 12.5F);
/*      */     
/* 1932 */     this.gunModel['Ǎ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1933 */     this.gunModel['Ǎ'].setRotationPoint(-19.0F, -16.5F, 12.5F);
/*      */     
/* 1935 */     this.gunModel['ǎ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1936 */     this.gunModel['ǎ'].setRotationPoint(-18.0F, -18.0F, 14.25F);
/*      */     
/* 1938 */     this.gunModel['Ǐ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1939 */     this.gunModel['Ǐ'].setRotationPoint(-18.0F, -21.0F, 14.25F);
/*      */     
/* 1941 */     this.gunModel['ǐ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1942 */     this.gunModel['ǐ'].setRotationPoint(-18.0F, -19.0F, 14.25F);
/*      */     
/* 1944 */     this.gunModel['Ǒ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 1, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1945 */     this.gunModel['Ǒ'].setRotationPoint(-18.0F, -23.0F, 14.25F);
/*      */     
/* 1947 */     this.gunModel['ǒ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1948 */     this.gunModel['ǒ'].setRotationPoint(-18.5F, -24.0F, 14.5F);
/*      */     
/* 1950 */     this.gunModel['Ǔ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1951 */     this.gunModel['Ǔ'].setRotationPoint(-18.5F, -26.0F, 14.5F);
/*      */     
/* 1953 */     this.gunModel['ǔ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1954 */     this.gunModel['ǔ'].setRotationPoint(-19.5F, -29.0F, 14.5F);
/*      */     
/* 1956 */     this.gunModel['Ǖ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1957 */     this.gunModel['Ǖ'].setRotationPoint(-18.5F, -30.0F, 14.5F);
/*      */     
/* 1959 */     this.gunModel['ǖ'].addBox(50.0F, -27.0F, -6.0F, 96, 11, 17, 0.0F);
/* 1960 */     this.gunModel['ǖ'].setRotationPoint(21.0F, -34.0F, -2.0F);
/*      */     
/* 1962 */     this.gunModel['Ǘ'].addBox(50.0F, -27.0F, -6.0F, 46, 11, 9, 0.0F);
/* 1963 */     this.gunModel['Ǘ'].setRotationPoint(-25.0F, -34.0F, 6.0F);
/*      */     
/* 1965 */     this.gunModel['ǘ'].addBox(50.0F, -27.0F, -6.0F, 46, 3, 8, 0.0F);
/* 1966 */     this.gunModel['ǘ'].setRotationPoint(-25.0F, -26.0F, -2.0F);
/*      */     
/* 1968 */     this.gunModel['Ǚ'].addBox(50.0F, -27.0F, -6.0F, 46, 2, 8, 0.0F);
/* 1969 */     this.gunModel['Ǚ'].setRotationPoint(-25.0F, -34.0F, -2.0F);
/*      */     
/* 1971 */     this.gunModel['ǚ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1972 */     this.gunModel['ǚ'].setRotationPoint(-25.0F, -32.0F, -2.0F);
/*      */     
/* 1974 */     this.gunModel['Ǜ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1975 */     this.gunModel['Ǜ'].setRotationPoint(-25.0F, -27.0F, -2.0F);
/*      */     
/* 1977 */     this.gunModel['ǜ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 8, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1978 */     this.gunModel['ǜ'].setRotationPoint(19.0F, -27.0F, -2.0F);
/*      */     
/* 1980 */     this.gunModel['ǝ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1981 */     this.gunModel['ǝ'].setRotationPoint(19.0F, -32.0F, -2.0F);
/*      */     
/* 1983 */     this.gunModel['Ǟ'].addShapeBox(50.0F, -27.0F, -6.0F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1984 */     this.gunModel['Ǟ'].setRotationPoint(20.0F, -32.0F, -2.0F);
/*      */     
/* 1986 */     this.gunModel['ǟ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1987 */     this.gunModel['ǟ'].setRotationPoint(-14.5F, -6.5F, -2.5F);
/*      */     
/* 1989 */     this.gunModel['Ǡ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1990 */     this.gunModel['Ǡ'].setRotationPoint(-11.5F, -6.5F, -2.5F);
/*      */     
/* 1992 */     this.gunModel['ǡ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1993 */     this.gunModel['ǡ'].setRotationPoint(-11.5F, -14.5F, -2.5F);
/*      */     
/* 1995 */     this.gunModel['Ǣ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1996 */     this.gunModel['Ǣ'].setRotationPoint(-11.5F, -16.5F, -2.5F);
/*      */     
/* 1998 */     this.gunModel['ǣ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1999 */     this.gunModel['ǣ'].setRotationPoint(-14.5F, -16.5F, -2.5F);
/*      */     
/* 2001 */     this.gunModel['Ǥ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2002 */     this.gunModel['Ǥ'].setRotationPoint(-19.5F, -16.5F, -1.0F);
/*      */     
/* 2004 */     this.gunModel['ǥ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2005 */     this.gunModel['ǥ'].setRotationPoint(-25.5F, -16.5F, -1.0F);
/*      */     
/* 2007 */     this.gunModel['Ǧ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2008 */     this.gunModel['Ǧ'].setRotationPoint(-25.5F, -14.5F, -1.0F);
/*      */     
/* 2010 */     this.gunModel['ǧ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2011 */     this.gunModel['ǧ'].setRotationPoint(-25.5F, -11.5F, -1.0F);
/*      */     
/* 2013 */     this.gunModel['Ǩ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2014 */     this.gunModel['Ǩ'].setRotationPoint(-18.5F, -11.5F, -1.5F);
/*      */     
/* 2016 */     this.gunModel['ǩ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2017 */     this.gunModel['ǩ'].setRotationPoint(-18.5F, -13.5F, -1.5F);
/*      */     
/* 2019 */     this.gunModel['Ǫ'].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2020 */     this.gunModel['Ǫ'].setRotationPoint(-18.5F, -9.5F, -1.5F);
/*      */     
/* 2022 */     this.gunModel['ǫ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2023 */     this.gunModel['ǫ'].setRotationPoint(-24.0F, -14.5F, -1.5F);
/*      */     
/* 2025 */     this.gunModel['Ǭ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2026 */     this.gunModel['Ǭ'].setRotationPoint(-24.0F, -12.5F, -1.5F);
/*      */     
/* 2028 */     this.gunModel['ǭ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2029 */     this.gunModel['ǭ'].setRotationPoint(-24.0F, -13.5F, -1.5F);
/*      */     
/* 2031 */     this.gunModel['Ǯ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2032 */     this.gunModel['Ǯ'].setRotationPoint(-69.0F, -31.0F, -2.5F);
/*      */     
/* 2034 */     this.gunModel['ǯ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2035 */     this.gunModel['ǯ'].setRotationPoint(-69.0F, -29.0F, -2.5F);
/*      */     
/* 2037 */     this.gunModel['ǰ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2038 */     this.gunModel['ǰ'].setRotationPoint(-69.0F, -30.0F, -2.5F);
/*      */     
/* 2040 */     this.gunModel['Ǳ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2041 */     this.gunModel['Ǳ'].setRotationPoint(-74.5F, -31.0F, -2.5F);
/*      */     
/* 2043 */     this.gunModel['ǲ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2044 */     this.gunModel['ǲ'].setRotationPoint(-74.5F, -29.0F, -2.5F);
/*      */     
/* 2046 */     this.gunModel['ǳ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2047 */     this.gunModel['ǳ'].setRotationPoint(-74.5F, -30.0F, -2.5F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2052 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 753, 185, this.textureX, this.textureY);
/* 2053 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 969, 185, this.textureX, this.textureY);
/* 2054 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 361, 193, this.textureX, this.textureY);
/* 2055 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 769, 193, this.textureX, this.textureY);
/* 2056 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 785, 193, this.textureX, this.textureY);
/* 2057 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 129, 201, this.textureX, this.textureY);
/* 2058 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 865, 177, this.textureX, this.textureY);
/* 2059 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 905, 177, this.textureX, this.textureY);
/* 2060 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 1001, 177, this.textureX, this.textureY);
/* 2061 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 1017, 177, this.textureX, this.textureY);
/* 2062 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 193, 313, this.textureX, this.textureY);
/* 2063 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 241, 201, this.textureX, this.textureY);
/* 2064 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 561, 321, this.textureX, this.textureY);
/* 2065 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 313, 201, this.textureX, this.textureY);
/* 2066 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 817, 321, this.textureX, this.textureY);
/* 2067 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 585, 321, this.textureX, this.textureY);
/* 2068 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 409, 201, this.textureX, this.textureY);
/*      */     
/* 2070 */     this.gunModel['Ǵ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2071 */     this.gunModel['Ǵ'].setRotationPoint(-30.0F, -31.0F, -2.5F);
/*      */     
/* 2073 */     this.gunModel['ǵ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2074 */     this.gunModel['ǵ'].setRotationPoint(-30.0F, -29.0F, -2.5F);
/*      */     
/* 2076 */     this.gunModel['Ƕ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2077 */     this.gunModel['Ƕ'].setRotationPoint(-30.0F, -30.0F, -2.5F);
/*      */     
/* 2079 */     this.gunModel['Ƿ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2080 */     this.gunModel['Ƿ'].setRotationPoint(-35.5F, -31.0F, -2.5F);
/*      */     
/* 2082 */     this.gunModel['Ǹ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2083 */     this.gunModel['Ǹ'].setRotationPoint(-35.5F, -29.0F, -2.5F);
/*      */     
/* 2085 */     this.gunModel['ǹ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2086 */     this.gunModel['ǹ'].setRotationPoint(-35.5F, -30.0F, -2.5F);
/*      */     
/* 2088 */     this.gunModel['Ǻ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2089 */     this.gunModel['Ǻ'].setRotationPoint(-27.0F, -31.0F, -4.0F);
/*      */     
/* 2091 */     this.gunModel['ǻ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2092 */     this.gunModel['ǻ'].setRotationPoint(-27.0F, -33.0F, -4.0F);
/*      */     
/* 2094 */     this.gunModel['Ǽ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2095 */     this.gunModel['Ǽ'].setRotationPoint(-27.0F, -34.0F, -3.0F);
/*      */     
/* 2097 */     this.gunModel['ǽ'].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2098 */     this.gunModel['ǽ'].setRotationPoint(-27.0F, -27.0F, -3.0F);
/*      */     
/* 2100 */     this.gunModel['Ǿ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2101 */     this.gunModel['Ǿ'].setRotationPoint(-88.5F, -41.0F, -4.5F);
/* 2102 */     this.gunModel['Ǿ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2104 */     this.gunModel['ǿ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2105 */     this.gunModel['ǿ'].setRotationPoint(-88.35F, -37.0F, -4.0F);
/* 2106 */     this.gunModel['ǿ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2108 */     this.gunModel['Ȁ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2109 */     this.gunModel['Ȁ'].setRotationPoint(-89.1F, -35.0F, -4.5F);
/* 2110 */     this.gunModel['Ȁ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2112 */     this.gunModel['ȁ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2113 */     this.gunModel['ȁ'].setRotationPoint(-89.35F, -27.0F, -4.0F);
/* 2114 */     this.gunModel['ȁ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2116 */     this.gunModel['Ȃ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2117 */     this.gunModel['Ȃ'].setRotationPoint(-90.2F, -24.15F, -4.5F);
/* 2118 */     this.gunModel['Ȃ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2120 */     this.gunModel['ȃ'].addShapeBox(50.0F, -27.0F, -6.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2121 */     this.gunModel['ȃ'].setRotationPoint(-91.0F, -14.15F, -4.5F);
/* 2122 */     this.gunModel['ȃ'].rotateAngleZ = -0.08726646F;
/*      */     
/* 2124 */     this.gunModel['Ȅ'].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2125 */     this.gunModel['Ȅ'].setRotationPoint(-90.25F, -17.0F, -4.0F);
/* 2126 */     this.gunModel['Ȅ'].rotateAngleZ = -0.08726646F;
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2131 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 153, 169, this.textureX, this.textureY);
/* 2132 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 481, 169, this.textureX, this.textureY);
/* 2133 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 513, 169, this.textureX, this.textureY);
/* 2134 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 545, 169, this.textureX, this.textureY);
/* 2135 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 753, 33, this.textureX, this.textureY);
/* 2136 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 977, 33, this.textureX, this.textureY);
/* 2137 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 761, 41, this.textureX, this.textureY);
/* 2138 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 833, 41, this.textureX, this.textureY);
/* 2139 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 1001, 33, this.textureX, this.textureY);
/* 2140 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 857, 41, this.textureX, this.textureY);
/* 2141 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 513, 41, this.textureX, this.textureY);
/* 2142 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 17, 49, this.textureX, this.textureY);
/* 2143 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/* 2144 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/* 2145 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 2146 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/* 2147 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/* 2148 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/* 2149 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 2150 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 577, 169, this.textureX, this.textureY);
/* 2151 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 609, 169, this.textureX, this.textureY);
/* 2152 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 641, 169, this.textureX, this.textureY);
/* 2153 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 153, 225, this.textureX, this.textureY);
/* 2154 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 249, 225, this.textureX, this.textureY);
/* 2155 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 841, 225, this.textureX, this.textureY);
/* 2156 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 865, 225, this.textureX, this.textureY);
/* 2157 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 193, 241, this.textureX, this.textureY);
/* 2158 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 321, 249, this.textureX, this.textureY);
/* 2159 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 697, 185, this.textureX, this.textureY);
/* 2160 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 401, 249, this.textureX, this.textureY);
/* 2161 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 425, 249, this.textureX, this.textureY);
/* 2162 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 577, 169, this.textureX, this.textureY);
/* 2163 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 609, 169, this.textureX, this.textureY);
/* 2164 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 449, 249, this.textureX, this.textureY);
/* 2165 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 697, 257, this.textureX, this.textureY);
/* 2166 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 737, 257, this.textureX, this.textureY);
/* 2167 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 33, 265, this.textureX, this.textureY);
/* 2168 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 201, 265, this.textureX, this.textureY);
/* 2169 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 641, 169, this.textureX, this.textureY);
/* 2170 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 673, 169, this.textureX, this.textureY);
/* 2171 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 249, 265, this.textureX, this.textureY);
/* 2172 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 273, 265, this.textureX, this.textureY);
/* 2173 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 33, 273, this.textureX, this.textureY);
/* 2174 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 521, 265, this.textureX, this.textureY);
/* 2175 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 73, 273, this.textureX, this.textureY);
/* 2176 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 201, 273, this.textureX, this.textureY);
/* 2177 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 273, 273, this.textureX, this.textureY);
/* 2178 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 329, 273, this.textureX, this.textureY);
/* 2179 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 993, 305, this.textureX, this.textureY);
/* 2180 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 529, 225, this.textureX, this.textureY);
/* 2181 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 1009, 169, this.textureX, this.textureY);
/* 2182 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 833, 305, this.textureX, this.textureY);
/* 2183 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 201, 313, this.textureX, this.textureY);
/* 2184 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 345, 313, this.textureX, this.textureY);
/* 2185 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 129, 273, this.textureX, this.textureY);
/* 2186 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 705, 169, this.textureX, this.textureY);
/* 2187 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 385, 313, this.textureX, this.textureY);
/* 2188 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 409, 313, this.textureX, this.textureY);
/* 2189 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 881, 177, this.textureX, this.textureY);
/* 2190 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/* 2191 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 57, 177, this.textureX, this.textureY);
/* 2192 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 1017, 97, this.textureX, this.textureY);
/* 2193 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/* 2194 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 857, 137, this.textureX, this.textureY);
/* 2195 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 1017, 137, this.textureX, this.textureY);
/* 2196 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 401, 145, this.textureX, this.textureY);
/* 2197 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 993, 145, this.textureX, this.textureY);
/* 2198 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 457, 289, this.textureX, this.textureY);
/* 2199 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 985, 289, this.textureX, this.textureY);
/* 2200 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 281, 305, this.textureX, this.textureY);
/* 2201 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 945, 177, this.textureX, this.textureY);
/* 2202 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 921, 153, this.textureX, this.textureY);
/* 2203 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 1001, 153, this.textureX, this.textureY);
/* 2204 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 1017, 153, this.textureX, this.textureY);
/* 2205 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 793, 161, this.textureX, this.textureY);
/* 2206 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 89, 177, this.textureX, this.textureY);
/* 2207 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 825, 161, this.textureX, this.textureY);
/* 2208 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 945, 161, this.textureX, this.textureY);
/* 2209 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 177, 225, this.textureX, this.textureY);
/* 2210 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 273, 225, this.textureX, this.textureY);
/* 2211 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/* 2212 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 241, 169, this.textureX, this.textureY);
/* 2213 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 793, 177, this.textureX, this.textureY);
/* 2214 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 433, 169, this.textureX, this.textureY);
/* 2215 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 457, 169, this.textureX, this.textureY);
/* 2216 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/* 2217 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 721, 129, this.textureX, this.textureY);
/* 2218 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 969, 169, this.textureX, this.textureY);
/* 2219 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 809, 161, this.textureX, this.textureY);
/* 2220 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 57, 169, this.textureX, this.textureY);
/* 2221 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 177, 169, this.textureX, this.textureY);
/* 2222 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 513, 169, this.textureX, this.textureY);
/*      */     
/* 2224 */     this.defaultScopeModel[0].addShapeBox(50.0F, -27.0F, -6.0F, 5, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2225 */     this.defaultScopeModel[0].setRotationPoint(123.0F, -55.0F, 2.0F);
/*      */     
/* 2227 */     this.defaultScopeModel[1].addShapeBox(50.0F, -27.0F, -6.0F, 5, 4, 9, 0.0F, 0.0F, -0.5F, -1.5F, 2.0F, -0.5F, -1.5F, 2.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2228 */     this.defaultScopeModel[1].setRotationPoint(123.0F, -59.0F, 2.0F);
/*      */     
/* 2230 */     this.defaultScopeModel[2].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2231 */     this.defaultScopeModel[2].setRotationPoint(123.0F, -61.5F, 3.0F);
/*      */     
/* 2233 */     this.defaultScopeModel[3].addShapeBox(50.0F, -27.0F, -6.0F, 7, 5, 5, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2234 */     this.defaultScopeModel[3].setRotationPoint(123.0F, -66.5F, 4.0F);
/*      */     
/* 2236 */     this.defaultScopeModel[4].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F);
/* 2237 */     this.defaultScopeModel[4].setRotationPoint(123.0F, -66.5F, 9.0F);
/*      */     
/* 2239 */     this.defaultScopeModel[5].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 1, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.2F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
/* 2240 */     this.defaultScopeModel[5].setRotationPoint(123.0F, -66.5F, 3.0F);
/*      */     
/* 2242 */     this.defaultScopeModel[6].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2243 */     this.defaultScopeModel[6].setRotationPoint(123.0F, -69.5F, 9.0F);
/*      */     
/* 2245 */     this.defaultScopeModel[7].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2246 */     this.defaultScopeModel[7].setRotationPoint(123.0F, -69.5F, 2.0F);
/*      */     
/* 2248 */     this.defaultScopeModel[8].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 1, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F);
/* 2249 */     this.defaultScopeModel[8].setRotationPoint(123.0F, -72.5F, 9.0F);
/*      */     
/* 2251 */     this.defaultScopeModel[9].addShapeBox(50.0F, -27.0F, -6.0F, 7, 3, 1, 0.0F, 0.2F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2252 */     this.defaultScopeModel[9].setRotationPoint(123.0F, -72.5F, 3.0F);
/*      */     
/* 2254 */     this.defaultScopeModel[10].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F);
/* 2255 */     this.defaultScopeModel[10].setRotationPoint(123.0F, -73.5F, 7.0F);
/*      */     
/* 2257 */     this.defaultScopeModel[11].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 1, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2258 */     this.defaultScopeModel[11].setRotationPoint(123.0F, -73.5F, 5.0F);
/*      */     
/* 2260 */     this.defaultScopeModel[12].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2261 */     this.defaultScopeModel[12].setRotationPoint(123.0F, -73.5F, 6.0F);
/*      */     
/* 2263 */     this.defaultScopeModel[13].addShapeBox(50.0F, -27.0F, -6.0F, 7, 2, 1, 0.0F, 0.35F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2264 */     this.defaultScopeModel[13].setRotationPoint(123.0F, -71.0F, 8.0F);
/*      */     
/* 2266 */     this.defaultScopeModel[14].addShapeBox(50.0F, -27.0F, -6.0F, 7, 2, 1, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F);
/* 2267 */     this.defaultScopeModel[14].setRotationPoint(123.0F, -71.0F, 4.0F);
/*      */     
/* 2269 */     this.defaultScopeModel[15].addShapeBox(50.0F, -27.0F, -6.0F, 7, 1, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.35F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.35F, 0.5F, 0.0F);
/* 2270 */     this.defaultScopeModel[15].setRotationPoint(123.0F, -72.5F, 4.0F);
/*      */     
/* 2272 */     this.defaultScopeModel[16].addShapeBox(50.0F, -27.0F, -6.0F, 7, 2, 1, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/* 2273 */     this.defaultScopeModel[16].setRotationPoint(123.0F, -68.0F, 4.0F);
/*      */     
/* 2275 */     this.defaultScopeModel[17].addShapeBox(50.0F, -27.0F, -6.0F, 7, 2, 1, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2276 */     this.defaultScopeModel[17].setRotationPoint(123.0F, -68.0F, 8.0F);
/*      */     
/* 2278 */     this.defaultScopeModel[18].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2279 */     this.defaultScopeModel[18].setRotationPoint(124.5F, -69.0F, 6.0F);
/*      */     
/* 2281 */     this.defaultScopeModel[19].addShapeBox(50.0F, -27.0F, -6.0F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2282 */     this.defaultScopeModel[19].setRotationPoint(123.0F, -53.0F, 2.0F);
/*      */     
/* 2284 */     this.defaultScopeModel[20].addShapeBox(50.0F, -27.0F, -6.0F, 5, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2285 */     this.defaultScopeModel[20].setRotationPoint(123.0F, -52.0F, 2.0F);
/*      */     
/* 2287 */     this.defaultScopeModel[21].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2288 */     this.defaultScopeModel[21].setRotationPoint(124.5F, -54.5F, 1.5F);
/*      */     
/* 2290 */     this.defaultScopeModel[22].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2291 */     this.defaultScopeModel[22].setRotationPoint(-73.5F, -59.0F, 1.0F);
/*      */     
/* 2293 */     this.defaultScopeModel[23].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2294 */     this.defaultScopeModel[23].setRotationPoint(-73.5F, -56.0F, 1.0F);
/*      */     
/* 2296 */     this.defaultScopeModel[24].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2297 */     this.defaultScopeModel[24].setRotationPoint(-73.5F, -53.0F, 1.0F);
/*      */     
/* 2299 */     this.defaultScopeModel[25].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2300 */     this.defaultScopeModel[25].setRotationPoint(-73.5F, -59.0F, 11.0F);
/*      */     
/* 2302 */     this.defaultScopeModel[26].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2303 */     this.defaultScopeModel[26].setRotationPoint(-73.5F, -56.0F, 11.0F);
/*      */     
/* 2305 */     this.defaultScopeModel[27].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2306 */     this.defaultScopeModel[27].setRotationPoint(-73.5F, -53.0F, 11.0F);
/*      */     
/* 2308 */     this.defaultScopeModel[28].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2309 */     this.defaultScopeModel[28].setRotationPoint(-72.0F, -55.5F, 12.0F);
/*      */     
/* 2311 */     this.defaultScopeModel[29].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2312 */     this.defaultScopeModel[29].setRotationPoint(-72.0F, -57.5F, 12.0F);
/*      */     
/* 2314 */     this.defaultScopeModel[30].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2315 */     this.defaultScopeModel[30].setRotationPoint(-72.0F, -53.5F, 12.0F);
/*      */     
/* 2317 */     this.defaultScopeModel[31].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2318 */     this.defaultScopeModel[31].setRotationPoint(-70.0F, -58.5F, 12.0F);
/*      */     
/* 2320 */     this.defaultScopeModel[32].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2321 */     this.defaultScopeModel[32].setRotationPoint(-70.0F, -51.0F, 12.0F);
/*      */     
/* 2323 */     this.defaultScopeModel[33].addShapeBox(50.0F, -27.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2324 */     this.defaultScopeModel[33].setRotationPoint(-74.75F, -59.0F, 12.0F);
/*      */     
/* 2326 */     this.defaultScopeModel[34].addShapeBox(50.0F, -27.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2327 */     this.defaultScopeModel[34].setRotationPoint(-72.25F, -59.0F, 12.0F);
/*      */     
/* 2329 */     this.defaultScopeModel[35].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2330 */     this.defaultScopeModel[35].setRotationPoint(-72.0F, -55.5F, -1.0F);
/*      */     
/* 2332 */     this.defaultScopeModel[36].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2333 */     this.defaultScopeModel[36].setRotationPoint(-72.0F, -57.5F, -1.0F);
/*      */     
/* 2335 */     this.defaultScopeModel[37].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2336 */     this.defaultScopeModel[37].setRotationPoint(-72.0F, -53.5F, -1.0F);
/*      */     
/* 2338 */     this.defaultScopeModel[38].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2339 */     this.defaultScopeModel[38].setRotationPoint(-70.0F, -58.5F, -0.7F);
/*      */     
/* 2341 */     this.defaultScopeModel[39].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2342 */     this.defaultScopeModel[39].setRotationPoint(-70.0F, -51.0F, -0.7F);
/*      */     
/* 2344 */     this.defaultScopeModel[40].addShapeBox(50.0F, -27.0F, -6.0F, 9, 2, 2, 0.0F, -1.8F, -6.55F, 0.0F, -0.25F, -1.55F, 0.0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3.0F, 5.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, -0.25F, -3.0F, 5.75F, -0.25F);
/* 2345 */     this.defaultScopeModel[40].setRotationPoint(-74.75F, -59.0F, -0.7F);
/*      */     
/* 2347 */     this.defaultScopeModel[41].addShapeBox(50.0F, -27.0F, -6.0F, 9, 2, 2, 0.0F, -0.25F, -1.55F, 0.0F, -1.8F, -6.55F, 0.0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1.0F, 0.75F, 0.0F, -3.0F, 5.75F, 0.0F, -3.0F, 5.75F, -0.25F, 1.0F, 0.75F, -0.25F);
/* 2348 */     this.defaultScopeModel[41].setRotationPoint(-72.25F, -59.0F, -0.7F);
/*      */     
/* 2350 */     this.defaultScopeModel[42].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2351 */     this.defaultScopeModel[42].setRotationPoint(-73.5F, -58.0F, 9.0F);
/*      */     
/* 2353 */     this.defaultScopeModel[43].addShapeBox(50.0F, -27.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2354 */     this.defaultScopeModel[43].setRotationPoint(-73.5F, -55.0F, 9.0F);
/*      */     
/* 2356 */     this.defaultScopeModel[44].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2357 */     this.defaultScopeModel[44].setRotationPoint(-73.5F, -53.0F, 9.0F);
/*      */     
/* 2359 */     this.defaultScopeModel[45].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2360 */     this.defaultScopeModel[45].setRotationPoint(-73.5F, -58.0F, 2.0F);
/*      */     
/* 2362 */     this.defaultScopeModel[46].addShapeBox(50.0F, -27.0F, -6.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2363 */     this.defaultScopeModel[46].setRotationPoint(-73.5F, -55.0F, 2.0F);
/*      */     
/* 2365 */     this.defaultScopeModel[47].addShapeBox(50.0F, -27.0F, -6.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F);
/* 2366 */     this.defaultScopeModel[47].setRotationPoint(-73.5F, -53.0F, 2.0F);
/*      */     
/* 2368 */     this.defaultScopeModel[48].addShapeBox(50.0F, -27.0F, -6.0F, 6, 15, 2, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2369 */     this.defaultScopeModel[48].setRotationPoint(-72.0F, -66.0F, 3.5F);
/*      */     
/* 2371 */     this.defaultScopeModel[49].addShapeBox(50.0F, -27.0F, -6.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2372 */     this.defaultScopeModel[49].setRotationPoint(-65.5F, -55.0F, 3.5F);
/*      */     
/* 2374 */     this.defaultScopeModel[50].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2375 */     this.defaultScopeModel[50].setRotationPoint(-65.5F, -56.0F, 3.5F);
/*      */     
/* 2377 */     this.defaultScopeModel[51].addShapeBox(50.0F, -27.0F, -6.0F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2378 */     this.defaultScopeModel[51].setRotationPoint(-66.5F, -55.0F, 1.5F);
/*      */     
/* 2380 */     this.defaultScopeModel[52].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2381 */     this.defaultScopeModel[52].setRotationPoint(-63.5F, -55.0F, 1.5F);
/*      */     
/* 2383 */     this.defaultScopeModel[53].addShapeBox(50.0F, -27.0F, -6.0F, 6, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2384 */     this.defaultScopeModel[53].setRotationPoint(-63.5F, -53.0F, 1.5F);
/*      */     
/* 2386 */     this.defaultScopeModel[54].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2387 */     this.defaultScopeModel[54].setRotationPoint(-57.5F, -53.0F, 1.5F);
/*      */     
/* 2389 */     this.defaultScopeModel[55].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2390 */     this.defaultScopeModel[55].setRotationPoint(-57.5F, -53.0F, 9.5F);
/*      */     
/* 2392 */     this.defaultScopeModel[56].addShapeBox(50.0F, -27.0F, -6.0F, 6, 15, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2393 */     this.defaultScopeModel[56].setRotationPoint(-72.0F, -66.0F, 5.5F);
/*      */     
/* 2395 */     this.defaultScopeModel[57].addShapeBox(50.0F, -27.0F, -6.0F, 6, 15, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2396 */     this.defaultScopeModel[57].setRotationPoint(-72.0F, -66.0F, 7.5F);
/*      */     
/* 2398 */     this.defaultScopeModel[58].addShapeBox(50.0F, -27.0F, -6.0F, 3, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2399 */     this.defaultScopeModel[58].setRotationPoint(-62.0F, -54.0F, 10.5F);
/*      */     
/* 2401 */     this.defaultScopeModel[59].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2402 */     this.defaultScopeModel[59].setRotationPoint(-62.0F, -51.0F, 10.5F);
/*      */     
/* 2404 */     this.defaultScopeModel[60].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2405 */     this.defaultScopeModel[60].setRotationPoint(-61.15F, -53.25F, 11.0F);
/*      */     
/* 2407 */     this.defaultScopeModel[61].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2408 */     this.defaultScopeModel[61].setRotationPoint(-60.9F, -52.5F, 11.0F);
/*      */     
/* 2410 */     this.defaultScopeModel[62].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2411 */     this.defaultScopeModel[62].setRotationPoint(-60.9F, -54.0F, 11.0F);
/*      */     
/* 2413 */     this.defaultScopeModel[63].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2414 */     this.defaultScopeModel[63].setRotationPoint(-61.65F, -54.0F, 11.0F);
/*      */     
/* 2416 */     this.defaultScopeModel[64].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2417 */     this.defaultScopeModel[64].setRotationPoint(-60.4F, -54.0F, 11.0F);
/*      */     
/* 2419 */     this.defaultScopeModel[65].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2420 */     this.defaultScopeModel[65].setRotationPoint(-61.65F, -52.75F, 11.0F);
/*      */     
/* 2422 */     this.defaultScopeModel[66].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2423 */     this.defaultScopeModel[66].setRotationPoint(-60.4F, -52.75F, 11.0F);
/*      */     
/* 2425 */     this.defaultScopeModel[67].addShapeBox(50.0F, -27.0F, -6.0F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2426 */     this.defaultScopeModel[67].setRotationPoint(-72.15F, -63.0F, 5.35F);
/*      */     
/* 2428 */     this.defaultScopeModel[68].addShapeBox(50.0F, -27.0F, -6.0F, 6, 6, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F);
/* 2429 */     this.defaultScopeModel[68].setRotationPoint(-72.15F, -63.0F, 7.6F);
/*      */     
/* 2431 */     this.defaultScopeModel[69].addShapeBox(50.0F, -27.0F, -6.0F, 6, 6, 2, 0.0F, -1.75F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 2432 */     this.defaultScopeModel[69].setRotationPoint(-72.15F, -63.0F, 3.1F);
/*      */     
/* 2434 */     this.defaultScopeModel[70].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2435 */     this.defaultScopeModel[70].setRotationPoint(-71.0F, -67.5F, 5.0F);
/*      */     
/* 2437 */     this.defaultScopeModel[71].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2438 */     this.defaultScopeModel[71].setRotationPoint(-71.0F, -69.0F, 4.5F);
/*      */     
/* 2440 */     this.defaultScopeModel[72].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2441 */     this.defaultScopeModel[72].setRotationPoint(-71.0F, -70.0F, 4.5F);
/*      */     
/* 2443 */     this.defaultScopeModel[73].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2444 */     this.defaultScopeModel[73].setRotationPoint(-71.0F, -70.0F, 7.5F);
/*      */     
/* 2446 */     this.defaultScopeModel[74].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2447 */     this.defaultScopeModel[74].setRotationPoint(-71.0F, -69.0F, 7.5F);
/*      */     
/* 2449 */     this.defaultScopeModel[75].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2450 */     this.defaultScopeModel[75].setRotationPoint(-71.0F, -70.5F, 5.5F);
/*      */     
/* 2452 */     this.defaultScopeModel[76].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 2453 */     this.defaultScopeModel[76].setRotationPoint(-71.0F, -70.0F, 5.5F);
/*      */     
/* 2455 */     this.defaultScopeModel[77].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2456 */     this.defaultScopeModel[77].setRotationPoint(-71.0F, -70.0F, 6.5F);
/*      */     
/* 2458 */     this.defaultScopeModel[78].addShapeBox(50.0F, -27.0F, -6.0F, 6, 3, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2459 */     this.defaultScopeModel[78].setRotationPoint(-72.0F, -69.5F, 8.5F);
/*      */     
/* 2461 */     this.defaultScopeModel[79].addShapeBox(50.0F, -27.0F, -6.0F, 6, 3, 1, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2462 */     this.defaultScopeModel[79].setRotationPoint(-72.0F, -69.5F, 3.5F);
/*      */     
/* 2464 */     this.defaultScopeModel[80].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2465 */     this.defaultScopeModel[80].setRotationPoint(-71.0F, -68.0F, 6.5F);
/*      */     
/* 2467 */     this.defaultScopeModel[81].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 2468 */     this.defaultScopeModel[81].setRotationPoint(-71.0F, -68.0F, 5.5F);
/*      */     
/* 2470 */     this.defaultScopeModel[82].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 3, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 2471 */     this.defaultScopeModel[82].setRotationPoint(-69.25F, -67.5F, 5.0F);
/*      */     
/* 2473 */     this.defaultScopeModel[83].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2474 */     this.defaultScopeModel[83].setRotationPoint(-68.5F, -67.5F, 4.5F);
/*      */     
/* 2476 */     this.defaultScopeModel[84].addShapeBox(50.0F, -27.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2477 */     this.defaultScopeModel[84].setRotationPoint(-68.5F, -67.5F, 7.5F);
/*      */     
/* 2479 */     this.defaultScopeModel[85].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F);
/* 2480 */     this.defaultScopeModel[85].setRotationPoint(-67.0F, -67.5F, 7.5F);
/*      */     
/* 2482 */     this.defaultScopeModel[86].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2483 */     this.defaultScopeModel[86].setRotationPoint(-67.0F, -67.5F, 4.5F);
/*      */     
/* 2485 */     this.defaultScopeModel[87].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2486 */     this.defaultScopeModel[87].setRotationPoint(-67.0F, -67.5F, 5.5F);
/*      */     
/* 2488 */     this.defaultScopeModel[88].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2489 */     this.defaultScopeModel[88].setRotationPoint(-68.75F, -67.5F, 6.5F);
/*      */     
/* 2491 */     this.defaultScopeModel[89].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F);
/* 2492 */     this.defaultScopeModel[89].setRotationPoint(-68.75F, -67.5F, 5.5F);
/*      */     
/* 2494 */     this.defaultScopeModel[90].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2495 */     this.defaultScopeModel[90].setRotationPoint(-67.5F, -67.5F, 6.5F);
/*      */     
/* 2497 */     this.defaultScopeModel[91].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F);
/* 2498 */     this.defaultScopeModel[91].setRotationPoint(-67.5F, -67.5F, 5.5F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2503 */     this.ammoModel[0] = new ModelRendererTurbo(this, 113, 313, this.textureX, this.textureY);
/* 2504 */     this.ammoModel[1] = new ModelRendererTurbo(this, 785, 329, this.textureX, this.textureY);
/* 2505 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1, 337, this.textureX, this.textureY);
/* 2506 */     this.ammoModel[3] = new ModelRendererTurbo(this, 905, 329, this.textureX, this.textureY);
/* 2507 */     this.ammoModel[4] = new ModelRendererTurbo(this, 169, 337, this.textureX, this.textureY);
/* 2508 */     this.ammoModel[5] = new ModelRendererTurbo(this, 385, 337, this.textureX, this.textureY);
/* 2509 */     this.ammoModel[6] = new ModelRendererTurbo(this, 473, 337, this.textureX, this.textureY);
/* 2510 */     this.ammoModel[7] = new ModelRendererTurbo(this, 265, 345, this.textureX, this.textureY);
/* 2511 */     this.ammoModel[8] = new ModelRendererTurbo(this, 529, 345, this.textureX, this.textureY);
/* 2512 */     this.ammoModel[9] = new ModelRendererTurbo(this, 625, 345, this.textureX, this.textureY);
/* 2513 */     this.ammoModel[10] = new ModelRendererTurbo(this, 721, 345, this.textureX, this.textureY);
/* 2514 */     this.ammoModel[11] = new ModelRendererTurbo(this, 905, 353, this.textureX, this.textureY);
/* 2515 */     this.ammoModel[12] = new ModelRendererTurbo(this, 329, 361, this.textureX, this.textureY);
/* 2516 */     this.ammoModel[13] = new ModelRendererTurbo(this, 417, 361, this.textureX, this.textureY);
/* 2517 */     this.ammoModel[14] = new ModelRendererTurbo(this, 489, 369, this.textureX, this.textureY);
/* 2518 */     this.ammoModel[15] = new ModelRendererTurbo(this, 561, 369, this.textureX, this.textureY);
/* 2519 */     this.ammoModel[16] = new ModelRendererTurbo(this, 601, 369, this.textureX, this.textureY);
/* 2520 */     this.ammoModel[17] = new ModelRendererTurbo(this, 1, 385, this.textureX, this.textureY);
/* 2521 */     this.ammoModel[18] = new ModelRendererTurbo(this, 97, 385, this.textureX, this.textureY);
/* 2522 */     this.ammoModel[19] = new ModelRendererTurbo(this, 153, 385, this.textureX, this.textureY);
/* 2523 */     this.ammoModel[20] = new ModelRendererTurbo(this, 249, 385, this.textureX, this.textureY);
/* 2524 */     this.ammoModel[21] = new ModelRendererTurbo(this, 953, 377, this.textureX, this.textureY);
/* 2525 */     this.ammoModel[22] = new ModelRendererTurbo(this, 337, 385, this.textureX, this.textureY);
/* 2526 */     this.ammoModel[23] = new ModelRendererTurbo(this, 409, 385, this.textureX, this.textureY);
/* 2527 */     this.ammoModel[24] = new ModelRendererTurbo(this, 489, 393, this.textureX, this.textureY);
/* 2528 */     this.ammoModel[25] = new ModelRendererTurbo(this, 281, 409, this.textureX, this.textureY);
/* 2529 */     this.ammoModel[26] = new ModelRendererTurbo(this, 377, 409, this.textureX, this.textureY);
/* 2530 */     this.ammoModel[27] = new ModelRendererTurbo(this, 465, 417, this.textureX, this.textureY);
/* 2531 */     this.ammoModel[28] = new ModelRendererTurbo(this, 953, 401, this.textureX, this.textureY);
/* 2532 */     this.ammoModel[29] = new ModelRendererTurbo(this, 769, 417, this.textureX, this.textureY);
/* 2533 */     this.ammoModel[30] = new ModelRendererTurbo(this, 841, 417, this.textureX, this.textureY);
/* 2534 */     this.ammoModel[31] = new ModelRendererTurbo(this, 929, 425, this.textureX, this.textureY);
/*      */     
/* 2536 */     this.ammoModel[0].addShapeBox(50.0F, -27.0F, -6.0F, 31, 27, 11, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, -6.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2537 */     this.ammoModel[0].setRotationPoint(-12.0F, -3.0F, 1.0F);
/*      */     
/* 2539 */     this.ammoModel[1].addShapeBox(50.0F, -27.0F, -6.0F, 32, 30, 50, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2540 */     this.ammoModel[1].setRotationPoint(-8.0F, 21.5F, 9.0F);
/* 2541 */     this.ammoModel[1].rotateAngleZ = 0.13962634F;
/*      */     
/* 2543 */     this.ammoModel[2].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2544 */     this.ammoModel[2].setRotationPoint(-9.75F, 9.6F, 19.0F);
/* 2545 */     this.ammoModel[2].rotateAngleZ = 0.13962634F;
/*      */     
/* 2547 */     this.ammoModel[3].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2548 */     this.ammoModel[3].setRotationPoint(-9.7F, 9.65F, 9.0F);
/* 2549 */     this.ammoModel[3].rotateAngleZ = 0.13962634F;
/*      */     
/* 2551 */     this.ammoModel[4].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2552 */     this.ammoModel[4].setRotationPoint(-3.9F, 51.25F, 19.0F);
/* 2553 */     this.ammoModel[4].rotateAngleZ = 0.13962634F;
/*      */     
/* 2555 */     this.ammoModel[5].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2556 */     this.ammoModel[5].setRotationPoint(-3.9F, 51.25F, 9.0F);
/* 2557 */     this.ammoModel[5].rotateAngleZ = 0.13962634F;
/*      */     
/* 2559 */     this.ammoModel[6].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2560 */     this.ammoModel[6].setRotationPoint(-8.0F, 21.5F, 7.0F);
/* 2561 */     this.ammoModel[6].rotateAngleZ = 0.13962634F;
/*      */     
/* 2563 */     this.ammoModel[7].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2564 */     this.ammoModel[7].setRotationPoint(-5.95F, 36.4F, 7.0F);
/* 2565 */     this.ammoModel[7].rotateAngleZ = 0.13962634F;
/*      */     
/* 2567 */     this.ammoModel[8].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F);
/* 2568 */     this.ammoModel[8].setRotationPoint(-2.15F, 63.15F, 34.0F);
/* 2569 */     this.ammoModel[8].rotateAngleZ = 0.13962634F;
/*      */     
/* 2571 */     this.ammoModel[9].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2572 */     this.ammoModel[9].setRotationPoint(-2.15F, 63.15F, 19.0F);
/* 2573 */     this.ammoModel[9].rotateAngleZ = 0.13962634F;
/*      */     
/* 2575 */     this.ammoModel[10].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2576 */     this.ammoModel[10].setRotationPoint(-10.0F, 7.6F, 34.0F);
/* 2577 */     this.ammoModel[10].rotateAngleZ = 0.13962634F;
/*      */     
/* 2579 */     this.ammoModel[11].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2580 */     this.ammoModel[11].setRotationPoint(-10.0F, 7.6F, 19.0F);
/* 2581 */     this.ammoModel[11].rotateAngleZ = 0.13962634F;
/*      */     
/* 2583 */     this.ammoModel[12].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2584 */     this.ammoModel[12].setRotationPoint(-9.7F, 9.65F, 49.0F);
/* 2585 */     this.ammoModel[12].rotateAngleZ = 0.13962634F;
/*      */     
/* 2587 */     this.ammoModel[13].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2588 */     this.ammoModel[13].setRotationPoint(-8.0F, 21.5F, 59.0F);
/* 2589 */     this.ammoModel[13].rotateAngleZ = 0.13962634F;
/*      */     
/* 2591 */     this.ammoModel[14].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2592 */     this.ammoModel[14].setRotationPoint(-5.95F, 36.4F, 59.0F);
/* 2593 */     this.ammoModel[14].rotateAngleZ = 0.13962634F;
/*      */     
/* 2595 */     this.ammoModel[15].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F);
/* 2596 */     this.ammoModel[15].setRotationPoint(-3.9F, 51.25F, 49.0F);
/* 2597 */     this.ammoModel[15].rotateAngleZ = 0.13962634F;
/*      */     
/* 2599 */     this.ammoModel[16].addShapeBox(50.0F, -27.0F, -6.0F, 32, 30, 50, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2600 */     this.ammoModel[16].setRotationPoint(-8.0F, 21.5F, -47.0F);
/* 2601 */     this.ammoModel[16].rotateAngleZ = 0.13962634F;
/*      */     
/* 2603 */     this.ammoModel[17].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2604 */     this.ammoModel[17].setRotationPoint(-9.75F, 9.6F, -37.0F);
/* 2605 */     this.ammoModel[17].rotateAngleZ = 0.13962634F;
/*      */     
/* 2607 */     this.ammoModel[18].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2608 */     this.ammoModel[18].setRotationPoint(-9.7F, 9.65F, -47.0F);
/* 2609 */     this.ammoModel[18].rotateAngleZ = 0.13962634F;
/*      */     
/* 2611 */     this.ammoModel[19].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2612 */     this.ammoModel[19].setRotationPoint(-3.9F, 51.25F, -37.0F);
/* 2613 */     this.ammoModel[19].rotateAngleZ = 0.13962634F;
/*      */     
/* 2615 */     this.ammoModel[20].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2616 */     this.ammoModel[20].setRotationPoint(-3.9F, 51.25F, -47.0F);
/* 2617 */     this.ammoModel[20].rotateAngleZ = 0.13962634F;
/*      */     
/* 2619 */     this.ammoModel[21].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2620 */     this.ammoModel[21].setRotationPoint(-8.0F, 21.5F, -49.0F);
/* 2621 */     this.ammoModel[21].rotateAngleZ = 0.13962634F;
/*      */     
/* 2623 */     this.ammoModel[22].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2624 */     this.ammoModel[22].setRotationPoint(-5.95F, 36.4F, -49.0F);
/* 2625 */     this.ammoModel[22].rotateAngleZ = 0.13962634F;
/*      */     
/* 2627 */     this.ammoModel[23].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F);
/* 2628 */     this.ammoModel[23].setRotationPoint(-2.15F, 63.15F, -22.0F);
/* 2629 */     this.ammoModel[23].rotateAngleZ = 0.13962634F;
/*      */     
/* 2631 */     this.ammoModel[24].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2632 */     this.ammoModel[24].setRotationPoint(-2.15F, 63.15F, -37.0F);
/* 2633 */     this.ammoModel[24].rotateAngleZ = 0.13962634F;
/*      */     
/* 2635 */     this.ammoModel[25].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2636 */     this.ammoModel[25].setRotationPoint(-10.0F, 7.6F, -22.0F);
/* 2637 */     this.ammoModel[25].rotateAngleZ = 0.13962634F;
/*      */     
/* 2639 */     this.ammoModel[26].addShapeBox(50.0F, -27.0F, -6.0F, 32, 2, 15, 0.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, -15.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2640 */     this.ammoModel[26].setRotationPoint(-10.0F, 7.6F, -37.0F);
/* 2641 */     this.ammoModel[26].rotateAngleZ = 0.13962634F;
/*      */     
/* 2643 */     this.ammoModel[27].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2644 */     this.ammoModel[27].setRotationPoint(-9.7F, 9.65F, -7.0F);
/* 2645 */     this.ammoModel[27].rotateAngleZ = 0.13962634F;
/*      */     
/* 2647 */     this.ammoModel[28].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2648 */     this.ammoModel[28].setRotationPoint(-8.0F, 21.5F, 3.0F);
/* 2649 */     this.ammoModel[28].rotateAngleZ = 0.13962634F;
/*      */     
/* 2651 */     this.ammoModel[29].addShapeBox(50.0F, -27.0F, -6.0F, 32, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2652 */     this.ammoModel[29].setRotationPoint(-5.95F, 36.4F, 3.0F);
/* 2653 */     this.ammoModel[29].rotateAngleZ = 0.13962634F;
/*      */     
/* 2655 */     this.ammoModel[30].addShapeBox(50.0F, -27.0F, -6.0F, 32, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F);
/* 2656 */     this.ammoModel[30].setRotationPoint(-3.9F, 51.25F, -7.0F);
/* 2657 */     this.ammoModel[30].rotateAngleZ = 0.13962634F;
/*      */     
/* 2659 */     this.ammoModel[31].addShapeBox(50.0F, -27.0F, -6.0F, 31, 24, 11, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2660 */     this.ammoModel[31].setRotationPoint(-12.0F, 18.0F, 1.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 2665 */     this.slideModel[0] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/* 2666 */     this.slideModel[1] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/* 2667 */     this.slideModel[2] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 2668 */     this.slideModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 2669 */     this.slideModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 2670 */     this.slideModel[5] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 2671 */     this.slideModel[6] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 2672 */     this.slideModel[7] = new ModelRendererTurbo(this, 737, 17, this.textureX, this.textureY);
/* 2673 */     this.slideModel[8] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/* 2674 */     this.slideModel[9] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/* 2675 */     this.slideModel[10] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/* 2676 */     this.slideModel[11] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 2677 */     this.slideModel[12] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/* 2678 */     this.slideModel[13] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/* 2679 */     this.slideModel[14] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/* 2680 */     this.slideModel[15] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 2681 */     this.slideModel[16] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 2682 */     this.slideModel[17] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/* 2683 */     this.slideModel[18] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/* 2684 */     this.slideModel[19] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/* 2685 */     this.slideModel[20] = new ModelRendererTurbo(this, 641, 9, this.textureX, this.textureY);
/* 2686 */     this.slideModel[21] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/* 2687 */     this.slideModel[22] = new ModelRendererTurbo(this, 817, 9, this.textureX, this.textureY);
/* 2688 */     this.slideModel[23] = new ModelRendererTurbo(this, 825, 9, this.textureX, this.textureY);
/* 2689 */     this.slideModel[24] = new ModelRendererTurbo(this, 833, 9, this.textureX, this.textureY);
/* 2690 */     this.slideModel[25] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/* 2691 */     this.slideModel[26] = new ModelRendererTurbo(this, 1017, 9, this.textureX, this.textureY);
/* 2692 */     this.slideModel[27] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 2693 */     this.slideModel[28] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 2694 */     this.slideModel[29] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 2695 */     this.slideModel[30] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 2696 */     this.slideModel[31] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/* 2697 */     this.slideModel[32] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 2698 */     this.slideModel[33] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/* 2699 */     this.slideModel[34] = new ModelRendererTurbo(this, 721, 17, this.textureX, this.textureY);
/* 2700 */     this.slideModel[35] = new ModelRendererTurbo(this, 737, 17, this.textureX, this.textureY);
/* 2701 */     this.slideModel[36] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/* 2702 */     this.slideModel[37] = new ModelRendererTurbo(this, 513, 25, this.textureX, this.textureY);
/* 2703 */     this.slideModel[38] = new ModelRendererTurbo(this, 697, 25, this.textureX, this.textureY);
/* 2704 */     this.slideModel[39] = new ModelRendererTurbo(this, 713, 25, this.textureX, this.textureY);
/* 2705 */     this.slideModel[40] = new ModelRendererTurbo(this, 769, 25, this.textureX, this.textureY);
/* 2706 */     this.slideModel[41] = new ModelRendererTurbo(this, 929, 25, this.textureX, this.textureY);
/* 2707 */     this.slideModel[42] = new ModelRendererTurbo(this, 985, 25, this.textureX, this.textureY);
/* 2708 */     this.slideModel[43] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*      */     
/* 2710 */     this.slideModel[0].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2711 */     this.slideModel[0].setRotationPoint(53.5F, -44.25F, 11.5F);
/*      */     
/* 2713 */     this.slideModel[1].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2714 */     this.slideModel[1].setRotationPoint(51.75F, -44.25F, 11.5F);
/*      */     
/* 2716 */     this.slideModel[2].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2717 */     this.slideModel[2].setRotationPoint(55.25F, -44.25F, 11.5F);
/*      */     
/* 2719 */     this.slideModel[3].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2720 */     this.slideModel[3].setRotationPoint(52.0F, -42.5F, 11.5F);
/*      */     
/* 2722 */     this.slideModel[4].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2723 */     this.slideModel[4].setRotationPoint(55.25F, -41.0F, 11.5F);
/*      */     
/* 2725 */     this.slideModel[5].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2726 */     this.slideModel[5].setRotationPoint(53.5F, -40.75F, 11.5F);
/*      */     
/* 2728 */     this.slideModel[6].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2729 */     this.slideModel[6].setRotationPoint(51.75F, -41.0F, 11.5F);
/*      */     
/* 2731 */     this.slideModel[7].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2732 */     this.slideModel[7].setRotationPoint(52.6F, -42.65F, 12.5F);
/*      */     
/* 2734 */     this.slideModel[8].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2735 */     this.slideModel[8].setRotationPoint(52.6F, -41.65F, 12.5F);
/*      */     
/* 2737 */     this.slideModel[9].addShapeBox(50.0F, -27.0F, -6.0F, 3, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2738 */     this.slideModel[9].setRotationPoint(52.6F, -43.65F, 12.5F);
/*      */     
/* 2740 */     this.slideModel[10].addShapeBox(50.0F, -27.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2741 */     this.slideModel[10].setRotationPoint(53.1F, -43.15F, 9.5F);
/*      */     
/* 2743 */     this.slideModel[11].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2744 */     this.slideModel[11].setRotationPoint(53.5F, -44.25F, 18.5F);
/*      */     
/* 2746 */     this.slideModel[12].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2747 */     this.slideModel[12].setRotationPoint(51.75F, -44.25F, 18.5F);
/*      */     
/* 2749 */     this.slideModel[13].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2750 */     this.slideModel[13].setRotationPoint(55.25F, -44.25F, 18.5F);
/*      */     
/* 2752 */     this.slideModel[14].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2753 */     this.slideModel[14].setRotationPoint(52.0F, -42.5F, 18.5F);
/*      */     
/* 2755 */     this.slideModel[15].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2756 */     this.slideModel[15].setRotationPoint(55.25F, -41.0F, 18.5F);
/*      */     
/* 2758 */     this.slideModel[16].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2759 */     this.slideModel[16].setRotationPoint(53.5F, -40.75F, 18.5F);
/*      */     
/* 2761 */     this.slideModel[17].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2762 */     this.slideModel[17].setRotationPoint(51.75F, -41.0F, 18.5F);
/*      */     
/* 2764 */     this.slideModel[18].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2765 */     this.slideModel[18].setRotationPoint(53.5F, -44.25F, 17.5F);
/*      */     
/* 2767 */     this.slideModel[19].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2768 */     this.slideModel[19].setRotationPoint(51.75F, -44.25F, 17.5F);
/*      */     
/* 2770 */     this.slideModel[20].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2771 */     this.slideModel[20].setRotationPoint(55.25F, -44.25F, 17.5F);
/*      */     
/* 2773 */     this.slideModel[21].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, -1.0F, -1.25F, 0.5F, -1.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2774 */     this.slideModel[21].setRotationPoint(55.25F, -41.0F, 17.5F);
/*      */     
/* 2776 */     this.slideModel[22].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2777 */     this.slideModel[22].setRotationPoint(53.5F, -40.75F, 17.5F);
/*      */     
/* 2779 */     this.slideModel[23].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2780 */     this.slideModel[23].setRotationPoint(51.75F, -41.0F, 17.5F);
/*      */     
/* 2782 */     this.slideModel[24].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2783 */     this.slideModel[24].setRotationPoint(53.5F, -42.5F, 16.5F);
/*      */     
/* 2785 */     this.slideModel[25].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2786 */     this.slideModel[25].setRotationPoint(51.75F, -42.5F, 17.5F);
/*      */     
/* 2788 */     this.slideModel[26].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2789 */     this.slideModel[26].setRotationPoint(55.5F, -42.5F, 17.5F);
/*      */     
/* 2791 */     this.slideModel[27].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F);
/* 2792 */     this.slideModel[27].setRotationPoint(55.5F, -42.5F, 12.5F);
/*      */     
/* 2794 */     this.slideModel[28].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F);
/* 2795 */     this.slideModel[28].setRotationPoint(55.25F, -44.25F, 12.5F);
/*      */     
/* 2797 */     this.slideModel[29].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2798 */     this.slideModel[29].setRotationPoint(53.5F, -42.5F, 12.5F);
/*      */     
/* 2800 */     this.slideModel[30].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2801 */     this.slideModel[30].setRotationPoint(51.75F, -44.25F, 12.5F);
/*      */     
/* 2803 */     this.slideModel[31].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2804 */     this.slideModel[31].setRotationPoint(53.5F, -44.25F, 12.5F);
/*      */     
/* 2806 */     this.slideModel[32].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, -1.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F);
/* 2807 */     this.slideModel[32].setRotationPoint(51.75F, -42.5F, 12.5F);
/*      */     
/* 2809 */     this.slideModel[33].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -1.0F, -1.5F, 0.5F, -1.0F);
/* 2810 */     this.slideModel[33].setRotationPoint(51.75F, -41.0F, 12.5F);
/*      */     
/* 2812 */     this.slideModel[34].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F);
/* 2813 */     this.slideModel[34].setRotationPoint(53.5F, -40.75F, 12.5F);
/*      */     
/* 2815 */     this.slideModel[35].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, -1.0F, 0.25F, 0.5F, -1.0F);
/* 2816 */     this.slideModel[35].setRotationPoint(55.25F, -41.0F, 12.5F);
/*      */     
/* 2818 */     this.slideModel[36].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2819 */     this.slideModel[36].setRotationPoint(124.0F, -46.0F, 1.0F);
/*      */     
/* 2821 */     this.slideModel[37].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2822 */     this.slideModel[37].setRotationPoint(122.25F, -46.0F, 1.0F);
/*      */     
/* 2824 */     this.slideModel[38].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2825 */     this.slideModel[38].setRotationPoint(125.75F, -46.0F, 1.0F);
/*      */     
/* 2827 */     this.slideModel[39].addShapeBox(50.0F, -27.0F, -6.0F, 4, 1, 2, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 2828 */     this.slideModel[39].setRotationPoint(122.5F, -44.25F, 1.0F);
/*      */     
/* 2830 */     this.slideModel[40].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 2831 */     this.slideModel[40].setRotationPoint(125.75F, -42.75F, 1.0F);
/*      */     
/* 2833 */     this.slideModel[41].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 2834 */     this.slideModel[41].setRotationPoint(124.0F, -42.5F, 1.0F);
/*      */     
/* 2836 */     this.slideModel[42].addShapeBox(50.0F, -27.0F, -6.0F, 1, 1, 2, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F);
/* 2837 */     this.slideModel[42].setRotationPoint(122.25F, -42.75F, 1.0F);
/*      */     
/* 2839 */     this.slideModel[43].addBox(50.0F, -27.0F, -6.0F, 46, 8, 7, 0.0F);
/* 2840 */     this.slideModel[43].setRotationPoint(-25.0F, -34.0F, -1.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelhamr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */