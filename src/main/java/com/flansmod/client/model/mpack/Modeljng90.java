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
/*      */ public class Modeljng90
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modeljng90()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ʱ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[''];
/*   23 */     this.ammoModel = new ModelRendererTurbo[8];
/*   24 */     this.pumpModel = new ModelRendererTurbo[7];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initgunModel_2();
/*   28 */     initdefaultScopeModel_1();
/*   29 */     initammoModel_1();
/*   30 */     initpumpModel_1();
/*      */     
/*   32 */     translateAll(0.0F, -13.0F, 0.0F);
/*   33 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/*   35 */     this.gunSlideDistance = 0.0F;
/*   36 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*   37 */     this.pumpDelayAfterReload = 50;this.pumpDelay = 9;
/*   38 */     this.pumpTime = 30;
/*   39 */     this.gripIsOnPump = false;
/*   40 */     this.pumpHandleDistance = 0.5F;
/*      */     
/*      */ 
/*      */ 
/*   44 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   49 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[1] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[2] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[3] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[4] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[5] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[6] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[7] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[8] = new ModelRendererTurbo(this, 553, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[9] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[10] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[11] = new ModelRendererTurbo(this, 729, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[12] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[13] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[14] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[15] = new ModelRendererTurbo(this, 921, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[16] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[17] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/*   67 */     this.gunModel[18] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*   68 */     this.gunModel[19] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*   69 */     this.gunModel[20] = new ModelRendererTurbo(this, 609, 25, this.textureX, this.textureY);
/*   70 */     this.gunModel[21] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*   71 */     this.gunModel[22] = new ModelRendererTurbo(this, 705, 25, this.textureX, this.textureY);
/*   72 */     this.gunModel[23] = new ModelRendererTurbo(this, 753, 25, this.textureX, this.textureY);
/*   73 */     this.gunModel[24] = new ModelRendererTurbo(this, 801, 25, this.textureX, this.textureY);
/*   74 */     this.gunModel[25] = new ModelRendererTurbo(this, 849, 25, this.textureX, this.textureY);
/*   75 */     this.gunModel[26] = new ModelRendererTurbo(this, 897, 25, this.textureX, this.textureY);
/*   76 */     this.gunModel[27] = new ModelRendererTurbo(this, 945, 25, this.textureX, this.textureY);
/*   77 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   78 */     this.gunModel[29] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*   79 */     this.gunModel[30] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*   80 */     this.gunModel[31] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*   81 */     this.gunModel[32] = new ModelRendererTurbo(this, 585, 49, this.textureX, this.textureY);
/*   82 */     this.gunModel[33] = new ModelRendererTurbo(this, 737, 49, this.textureX, this.textureY);
/*   83 */     this.gunModel[34] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*   84 */     this.gunModel[35] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*   85 */     this.gunModel[36] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[37] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[38] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[39] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[40] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[41] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*   91 */     this.gunModel[42] = new ModelRendererTurbo(this, 529, 25, this.textureX, this.textureY);
/*   92 */     this.gunModel[43] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   93 */     this.gunModel[44] = new ModelRendererTurbo(this, 977, 33, this.textureX, this.textureY);
/*   94 */     this.gunModel[45] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*   95 */     this.gunModel[46] = new ModelRendererTurbo(this, 865, 49, this.textureX, this.textureY);
/*   96 */     this.gunModel[47] = new ModelRendererTurbo(this, 585, 57, this.textureX, this.textureY);
/*   97 */     this.gunModel[48] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[49] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[50] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  100 */     this.gunModel[51] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/*  101 */     this.gunModel[52] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/*  102 */     this.gunModel[53] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  103 */     this.gunModel[54] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  104 */     this.gunModel[55] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/*  105 */     this.gunModel[56] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  106 */     this.gunModel[57] = new ModelRendererTurbo(this, 529, 73, this.textureX, this.textureY);
/*  107 */     this.gunModel[58] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  108 */     this.gunModel[59] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  109 */     this.gunModel[60] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/*  110 */     this.gunModel[61] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[62] = new ModelRendererTurbo(this, 665, 1, this.textureX, this.textureY);
/*  112 */     this.gunModel[63] = new ModelRendererTurbo(this, 913, 49, this.textureX, this.textureY);
/*  113 */     this.gunModel[64] = new ModelRendererTurbo(this, 953, 49, this.textureX, this.textureY);
/*  114 */     this.gunModel[65] = new ModelRendererTurbo(this, 769, 57, this.textureX, this.textureY);
/*  115 */     this.gunModel[66] = new ModelRendererTurbo(this, 817, 57, this.textureX, this.textureY);
/*  116 */     this.gunModel[67] = new ModelRendererTurbo(this, 833, 81, this.textureX, this.textureY);
/*  117 */     this.gunModel[68] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  118 */     this.gunModel[69] = new ModelRendererTurbo(this, 113, 97, this.textureX, this.textureY);
/*  119 */     this.gunModel[70] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/*  120 */     this.gunModel[71] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  121 */     this.gunModel[72] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/*  122 */     this.gunModel[73] = new ModelRendererTurbo(this, 521, 105, this.textureX, this.textureY);
/*  123 */     this.gunModel[74] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/*  124 */     this.gunModel[75] = new ModelRendererTurbo(this, 969, 73, this.textureX, this.textureY);
/*  125 */     this.gunModel[76] = new ModelRendererTurbo(this, 929, 81, this.textureX, this.textureY);
/*  126 */     this.gunModel[77] = new ModelRendererTurbo(this, 809, 97, this.textureX, this.textureY);
/*  127 */     this.gunModel[78] = new ModelRendererTurbo(this, 953, 97, this.textureX, this.textureY);
/*  128 */     this.gunModel[79] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/*  129 */     this.gunModel[80] = new ModelRendererTurbo(this, 673, 105, this.textureX, this.textureY);
/*  130 */     this.gunModel[81] = new ModelRendererTurbo(this, 721, 105, this.textureX, this.textureY);
/*  131 */     this.gunModel[82] = new ModelRendererTurbo(this, 769, 105, this.textureX, this.textureY);
/*  132 */     this.gunModel[83] = new ModelRendererTurbo(this, 913, 105, this.textureX, this.textureY);
/*  133 */     this.gunModel[84] = new ModelRendererTurbo(this, 977, 105, this.textureX, this.textureY);
/*  134 */     this.gunModel[85] = new ModelRendererTurbo(this, 697, 113, this.textureX, this.textureY);
/*  135 */     this.gunModel[86] = new ModelRendererTurbo(this, 841, 113, this.textureX, this.textureY);
/*  136 */     this.gunModel[87] = new ModelRendererTurbo(this, 881, 113, this.textureX, this.textureY);
/*  137 */     this.gunModel[88] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  138 */     this.gunModel[89] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/*  139 */     this.gunModel[90] = new ModelRendererTurbo(this, 89, 121, this.textureX, this.textureY);
/*  140 */     this.gunModel[91] = new ModelRendererTurbo(this, 129, 121, this.textureX, this.textureY);
/*  141 */     this.gunModel[92] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/*  142 */     this.gunModel[93] = new ModelRendererTurbo(this, 209, 121, this.textureX, this.textureY);
/*  143 */     this.gunModel[94] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/*  144 */     this.gunModel[95] = new ModelRendererTurbo(this, 537, 121, this.textureX, this.textureY);
/*  145 */     this.gunModel[96] = new ModelRendererTurbo(this, 369, 129, this.textureX, this.textureY);
/*  146 */     this.gunModel[97] = new ModelRendererTurbo(this, 481, 129, this.textureX, this.textureY);
/*  147 */     this.gunModel[98] = new ModelRendererTurbo(this, 537, 137, this.textureX, this.textureY);
/*  148 */     this.gunModel[99] = new ModelRendererTurbo(this, 721, 129, this.textureX, this.textureY);
/*  149 */     this.gunModel[100] = new ModelRendererTurbo(this, 905, 129, this.textureX, this.textureY);
/*  150 */     this.gunModel[101] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/*  151 */     this.gunModel[102] = new ModelRendererTurbo(this, 777, 129, this.textureX, this.textureY);
/*  152 */     this.gunModel[103] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/*  153 */     this.gunModel[104] = new ModelRendererTurbo(this, 961, 129, this.textureX, this.textureY);
/*  154 */     this.gunModel[105] = new ModelRendererTurbo(this, 289, 137, this.textureX, this.textureY);
/*  155 */     this.gunModel[106] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  156 */     this.gunModel[107] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/*  157 */     this.gunModel[108] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[109] = new ModelRendererTurbo(this, 809, 129, this.textureX, this.textureY);
/*  159 */     this.gunModel[110] = new ModelRendererTurbo(this, 313, 137, this.textureX, this.textureY);
/*  160 */     this.gunModel[111] = new ModelRendererTurbo(this, 857, 137, this.textureX, this.textureY);
/*  161 */     this.gunModel[112] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[113] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/*  163 */     this.gunModel[114] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/*  164 */     this.gunModel[115] = new ModelRendererTurbo(this, 665, 1, this.textureX, this.textureY);
/*  165 */     this.gunModel[116] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[117] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/*  167 */     this.gunModel[118] = new ModelRendererTurbo(this, 345, 145, this.textureX, this.textureY);
/*  168 */     this.gunModel[119] = new ModelRendererTurbo(this, 561, 145, this.textureX, this.textureY);
/*  169 */     this.gunModel[120] = new ModelRendererTurbo(this, 385, 161, this.textureX, this.textureY);
/*  170 */     this.gunModel[121] = new ModelRendererTurbo(this, 649, 169, this.textureX, this.textureY);
/*  171 */     this.gunModel[122] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  172 */     this.gunModel[123] = new ModelRendererTurbo(this, 257, 185, this.textureX, this.textureY);
/*  173 */     this.gunModel[124] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
/*  174 */     this.gunModel[125] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*  175 */     this.gunModel[126] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*  176 */     this.gunModel[127] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 745, 105, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 633, 25, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 657, 145, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 681, 145, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 969, 153, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 905, 161, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 193, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 713, 73, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 1, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 145, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 169, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 937, 177, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 689, 25, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 769, 1, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 609, 9, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 705, 193, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 177, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 833, 25, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 209, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 225, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 33, this.textureX, this.textureY);
/*  209 */     this.gunModel[' '] = new ModelRendererTurbo(this, 257, 201, this.textureX, this.textureY);
/*  210 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  211 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 633, 9, this.textureX, this.textureY);
/*  212 */     this.gunModel['£'] = new ModelRendererTurbo(this, 713, 9, this.textureX, this.textureY);
/*  213 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/*  214 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1001, 9, this.textureX, this.textureY);
/*  215 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  216 */     this.gunModel['§'] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  217 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*  218 */     this.gunModel['©'] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  219 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*  220 */     this.gunModel['«'] = new ModelRendererTurbo(this, 881, 25, this.textureX, this.textureY);
/*  221 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 825, 193, this.textureX, this.textureY);
/*  222 */     this.gunModel['­'] = new ModelRendererTurbo(this, 753, 209, this.textureX, this.textureY);
/*  223 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/*  224 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 129, 241, this.textureX, this.textureY);
/*  225 */     this.gunModel['°'] = new ModelRendererTurbo(this, 241, 241, this.textureX, this.textureY);
/*  226 */     this.gunModel['±'] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/*  227 */     this.gunModel['²'] = new ModelRendererTurbo(this, 721, 161, this.textureX, this.textureY);
/*  228 */     this.gunModel['³'] = new ModelRendererTurbo(this, 377, 241, this.textureX, this.textureY);
/*  229 */     this.gunModel['´'] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/*  230 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 641, 25, this.textureX, this.textureY);
/*  231 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 929, 25, this.textureX, this.textureY);
/*  232 */     this.gunModel['·'] = new ModelRendererTurbo(this, 977, 25, this.textureX, this.textureY);
/*  233 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  234 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 993, 25, this.textureX, this.textureY);
/*  235 */     this.gunModel['º'] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  236 */     this.gunModel['»'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  237 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*  238 */     this.gunModel['½'] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  239 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*  240 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  241 */     this.gunModel['À'] = new ModelRendererTurbo(this, 937, 193, this.textureX, this.textureY);
/*  242 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 441, 241, this.textureX, this.textureY);
/*  243 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  244 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 953, 1, this.textureX, this.textureY);
/*  245 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  246 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  247 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*  249 */     this.gunModel['È'] = new ModelRendererTurbo(this, 497, 241, this.textureX, this.textureY);
/*  250 */     this.gunModel['É'] = new ModelRendererTurbo(this, 553, 241, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 601, 33, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 641, 33, this.textureX, this.textureY);
/*  254 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  255 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 657, 33, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 609, 241, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 737, 9, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 897, 33, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 929, 33, this.textureX, this.textureY);
/*  262 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 977, 33, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 1001, 33, this.textureX, this.textureY);
/*  264 */     this.gunModel['×'] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 833, 9, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/*  268 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 881, 9, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 897, 49, this.textureX, this.textureY);
/*  270 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  271 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 929, 9, this.textureX, this.textureY);
/*  272 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 937, 49, this.textureX, this.textureY);
/*  273 */     this.gunModel['à'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  274 */     this.gunModel['á'] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/*  275 */     this.gunModel['â'] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  276 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*  277 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/*  278 */     this.gunModel['å'] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/*  279 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/*  280 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  281 */     this.gunModel['è'] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/*  282 */     this.gunModel['é'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  283 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 801, 57, this.textureX, this.textureY);
/*  284 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 849, 57, this.textureX, this.textureY);
/*  285 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/*  286 */     this.gunModel['í'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  287 */     this.gunModel['î'] = new ModelRendererTurbo(this, 897, 57, this.textureX, this.textureY);
/*  288 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 913, 57, this.textureX, this.textureY);
/*  289 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 937, 57, this.textureX, this.textureY);
/*  290 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 665, 9, this.textureX, this.textureY);
/*  291 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 681, 9, this.textureX, this.textureY);
/*  292 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 761, 9, this.textureX, this.textureY);
/*  293 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/*  294 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 609, 33, this.textureX, this.textureY);
/*  295 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/*  296 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 1001, 57, this.textureX, this.textureY);
/*  297 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*  298 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 425, 65, this.textureX, this.textureY);
/*  299 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 801, 65, this.textureX, this.textureY);
/*  300 */     this.gunModel['û'] = new ModelRendererTurbo(this, 817, 65, this.textureX, this.textureY);
/*  301 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 993, 65, this.textureX, this.textureY);
/*  302 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 817, 81, this.textureX, this.textureY);
/*  303 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/*  304 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 97, 97, this.textureX, this.textureY);
/*  305 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/*  306 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  307 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 849, 65, this.textureX, this.textureY);
/*  308 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 985, 65, this.textureX, this.textureY);
/*  309 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 993, 81, this.textureX, this.textureY);
/*  310 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 953, 89, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1009, 65, this.textureX, this.textureY);
/*  312 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 753, 73, this.textureX, this.textureY);
/*  314 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 1009, 73, this.textureX, this.textureY);
/*  315 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 833, 81, this.textureX, this.textureY);
/*  316 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 1009, 81, this.textureX, this.textureY);
/*  317 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 833, 89, this.textureX, this.textureY);
/*  318 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1009, 89, this.textureX, this.textureY);
/*  319 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  320 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 977, 97, this.textureX, this.textureY);
/*  321 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 993, 97, this.textureX, this.textureY);
/*  322 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 1009, 97, this.textureX, this.textureY);
/*  323 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  324 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  326 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  328 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  330 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  332 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*  334 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 889, 137, this.textureX, this.textureY);
/*  336 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 865, 113, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 33, 121, this.textureX, this.textureY);
/*  338 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 697, 105, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 809, 81, this.textureX, this.textureY);
/*  340 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 721, 105, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 745, 105, this.textureX, this.textureY);
/*  342 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 769, 105, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 793, 105, this.textureX, this.textureY);
/*  344 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 937, 105, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 713, 105, this.textureX, this.textureY);
/*  346 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 809, 105, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 953, 105, this.textureX, this.textureY);
/*  348 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 977, 105, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/*  350 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/*  351 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 697, 113, this.textureX, this.textureY);
/*  352 */     this.gunModel['į'] = new ModelRendererTurbo(this, 745, 113, this.textureX, this.textureY);
/*  353 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 913, 113, this.textureX, this.textureY);
/*  354 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 1001, 113, this.textureX, this.textureY);
/*  355 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 113, 121, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  358 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 521, 105, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 129, 121, this.textureX, this.textureY);
/*  360 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/*  361 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 201, 145, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  363 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 425, 145, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 961, 121, this.textureX, this.textureY);
/*  365 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 777, 129, this.textureX, this.textureY);
/*  367 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 993, 153, this.textureX, this.textureY);
/*  369 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 1001, 129, this.textureX, this.textureY);
/*  371 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 289, 137, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 313, 137, this.textureX, this.textureY);
/*  373 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 113, 161, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 809, 121, this.textureX, this.textureY);
/*  375 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 345, 137, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 145, 161, this.textureX, this.textureY);
/*  377 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 825, 121, this.textureX, this.textureY);
/*  378 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 961, 137, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  380 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 929, 161, this.textureX, this.textureY);
/*  382 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 841, 121, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 449, 145, this.textureX, this.textureY);
/*  384 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 305, 169, this.textureX, this.textureY);
/*  385 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 137, 161, this.textureX, this.textureY);
/*  386 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 953, 121, this.textureX, this.textureY);
/*  387 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 905, 161, this.textureX, this.textureY);
/*  388 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 969, 201, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 329, 169, this.textureX, this.textureY);
/*  390 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 649, 169, this.textureX, this.textureY);
/*  392 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 473, 241, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 529, 241, this.textureX, this.textureY);
/*  394 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 665, 241, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 713, 241, this.textureX, this.textureY);
/*  396 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 585, 241, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 793, 241, this.textureX, this.textureY);
/*  398 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 841, 241, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 889, 241, this.textureX, this.textureY);
/*  400 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 937, 241, this.textureX, this.textureY);
/*  401 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  402 */     this.gunModel['š'] = new ModelRendererTurbo(this, 49, 257, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 97, 257, this.textureX, this.textureY);
/*  404 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 145, 257, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 193, 257, this.textureX, this.textureY);
/*  406 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 985, 241, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 641, 241, this.textureX, this.textureY);
/*  408 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 697, 241, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 377, 257, this.textureX, this.textureY);
/*  410 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 777, 241, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 825, 241, this.textureX, this.textureY);
/*  412 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 417, 257, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 873, 241, this.textureX, this.textureY);
/*  414 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 921, 241, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 665, 129, this.textureX, this.textureY);
/*  416 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 705, 145, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 841, 145, this.textureX, this.textureY);
/*  418 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 345, 153, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/*  420 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 513, 153, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 241, 265, this.textureX, this.textureY);
/*  422 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 305, 265, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 705, 265, this.textureX, this.textureY);
/*  424 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 345, 265, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 289, 265, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 33, 257, this.textureX, this.textureY);
/*  427 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 81, 257, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 753, 265, this.textureX, this.textureY);
/*  429 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 825, 265, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 873, 265, this.textureX, this.textureY);
/*  431 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 969, 265, this.textureX, this.textureY);
/*  432 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 425, 273, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 473, 273, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 521, 273, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 593, 273, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 641, 273, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 393, 265, this.textureX, this.textureY);
/*  438 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 1, 217, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 1, 289, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 689, 289, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 905, 273, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 233, 289, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 129, 257, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 313, 289, this.textureX, this.textureY);
/*  445 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 177, 257, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 945, 289, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 49, 297, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 89, 297, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 129, 297, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 393, 297, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 489, 297, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 577, 297, this.textureX, this.textureY);
/*  454 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 633, 297, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 881, 297, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 201, 313, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 273, 313, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/*  459 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 977, 297, this.textureX, this.textureY);
/*  460 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 521, 305, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 353, 313, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 905, 313, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 945, 313, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 129, 321, this.textureX, this.textureY);
/*  465 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 473, 321, this.textureX, this.textureY);
/*  466 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 865, 321, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 969, 321, this.textureX, this.textureY);
/*  468 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 153, 329, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 377, 329, this.textureX, this.textureY);
/*  470 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 417, 329, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 497, 329, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 673, 329, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 713, 329, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 753, 329, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 513, 185, this.textureX, this.textureY);
/*  476 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 769, 217, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 145, 281, this.textureX, this.textureY);
/*  478 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 273, 337, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 809, 329, this.textureX, this.textureY);
/*  480 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 857, 265, this.textureX, this.textureY);
/*  481 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 441, 337, this.textureX, this.textureY);
/*  482 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 889, 337, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 937, 337, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 1, 345, this.textureX, this.textureY);
/*  485 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 841, 337, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 65, 345, this.textureX, this.textureY);
/*  487 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 105, 345, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 273, 345, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 313, 345, this.textureX, this.textureY);
/*  490 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 129, 353, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 465, 353, this.textureX, this.textureY);
/*  492 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 529, 353, this.textureX, this.textureY);
/*  493 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 673, 353, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 737, 353, this.textureX, this.textureY);
/*  495 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 401, 361, this.textureX, this.textureY);
/*  496 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 785, 361, this.textureX, this.textureY);
/*  497 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 985, 345, this.textureX, this.textureY);
/*  498 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 457, 273, this.textureX, this.textureY);
/*  499 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 865, 361, this.textureX, this.textureY);
/*  500 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 337, 353, this.textureX, this.textureY);
/*  501 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 49, 369, this.textureX, this.textureY);
/*  502 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 177, 369, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 233, 369, this.textureX, this.textureY);
/*  504 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 273, 369, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 313, 369, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 361, 369, this.textureX, this.textureY);
/*  507 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 577, 369, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 833, 369, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 913, 369, this.textureX, this.textureY);
/*  510 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 961, 369, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 97, 377, this.textureX, this.textureY);
/*  512 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 449, 377, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 153, 377, this.textureX, this.textureY);
/*  514 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 337, 377, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 601, 377, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 673, 377, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 745, 377, this.textureX, this.textureY);
/*  518 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 1, 385, this.textureX, this.textureY);
/*  519 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 497, 377, this.textureX, this.textureY);
/*  520 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 985, 377, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 401, 385, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 521, 385, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 785, 385, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 857, 385, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 41, 393, this.textureX, this.textureY);
/*  526 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 177, 393, this.textureX, this.textureY);
/*  527 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 217, 393, this.textureX, this.textureY);
/*  528 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 257, 393, this.textureX, this.textureY);
/*  529 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 993, 209, this.textureX, this.textureY);
/*  530 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 969, 241, this.textureX, this.textureY);
/*  531 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 289, 393, this.textureX, this.textureY);
/*  532 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 361, 393, this.textureX, this.textureY);
/*  533 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 553, 393, this.textureX, this.textureY);
/*  534 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 809, 393, this.textureX, this.textureY);
/*  535 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 881, 393, this.textureX, this.textureY);
/*  536 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 929, 393, this.textureX, this.textureY);
/*  537 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 65, 401, this.textureX, this.textureY);
/*  538 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 105, 401, this.textureX, this.textureY);
/*  539 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 433, 401, this.textureX, this.textureY);
/*  540 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 481, 401, this.textureX, this.textureY);
/*  541 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 593, 401, this.textureX, this.textureY);
/*  542 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 633, 401, this.textureX, this.textureY);
/*  543 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 673, 401, this.textureX, this.textureY);
/*  544 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 713, 401, this.textureX, this.textureY);
/*  545 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 753, 401, this.textureX, this.textureY);
/*  546 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 961, 401, this.textureX, this.textureY);
/*  547 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 1, 409, this.textureX, this.textureY);
/*  548 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 153, 409, this.textureX, this.textureY);
/*      */     
/*  550 */     this.gunModel[0].addShapeBox(122.0F, -17.0F, -10.0F, 10, 9, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[0].setRotationPoint(-38.0F, -24.5F, 0.0F);
/*      */     
/*  553 */     this.gunModel[1].addShapeBox(122.0F, -17.0F, -10.0F, 10, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  554 */     this.gunModel[1].setRotationPoint(-38.0F, -25.5F, 0.0F);
/*      */     
/*  556 */     this.gunModel[2].addShapeBox(122.0F, -17.0F, -10.0F, 10, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  557 */     this.gunModel[2].setRotationPoint(-38.0F, -26.5F, 0.0F);
/*      */     
/*  559 */     this.gunModel[3].addShapeBox(122.0F, -17.0F, -10.0F, 21, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  560 */     this.gunModel[3].setRotationPoint(-38.0F, -28.0F, 0.0F);
/*      */     
/*  562 */     this.gunModel[4].addShapeBox(122.0F, -17.0F, -10.0F, 18, 21, 20, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  563 */     this.gunModel[4].setRotationPoint(-56.0F, -27.5F, 0.0F);
/*      */     
/*  565 */     this.gunModel[5].addShapeBox(122.0F, -17.0F, -10.0F, 11, 21, 20, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[5].setRotationPoint(-67.0F, -27.5F, 0.0F);
/*      */     
/*  568 */     this.gunModel[6].addShapeBox(122.0F, -17.0F, -10.0F, 16, 6, 20, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  569 */     this.gunModel[6].setRotationPoint(-83.0F, -27.5F, 0.0F);
/*      */     
/*  571 */     this.gunModel[7].addShapeBox(122.0F, -17.0F, -10.0F, 1, 21, 20, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  572 */     this.gunModel[7].setRotationPoint(-84.25F, -27.5F, 0.0F);
/*      */     
/*  574 */     this.gunModel[8].addShapeBox(122.0F, -17.0F, -10.0F, 16, 8, 20, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  575 */     this.gunModel[8].setRotationPoint(-83.0F, -14.5F, 0.0F);
/*      */     
/*  577 */     this.gunModel[9].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 20, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  578 */     this.gunModel[9].setRotationPoint(-69.0F, -17.5F, 0.0F);
/*      */     
/*  580 */     this.gunModel[10].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 20, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  581 */     this.gunModel[10].setRotationPoint(-71.0F, -15.5F, 0.0F);
/*      */     
/*  583 */     this.gunModel[11].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  584 */     this.gunModel[11].setRotationPoint(-83.5F, -17.5F, 0.0F);
/*      */     
/*  586 */     this.gunModel[12].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  587 */     this.gunModel[12].setRotationPoint(-81.5F, -15.5F, 0.0F);
/*      */     
/*  589 */     this.gunModel[13].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 20, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  590 */     this.gunModel[13].setRotationPoint(-83.5F, -21.75F, 0.0F);
/*      */     
/*  592 */     this.gunModel[14].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[14].setRotationPoint(-81.5F, -21.75F, 0.0F);
/*      */     
/*  595 */     this.gunModel[15].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 20, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  596 */     this.gunModel[15].setRotationPoint(-71.0F, -21.75F, 0.0F);
/*      */     
/*  598 */     this.gunModel[16].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 20, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  599 */     this.gunModel[16].setRotationPoint(-69.0F, -21.75F, 0.0F);
/*      */     
/*  601 */     this.gunModel[17].addShapeBox(122.0F, -17.0F, -10.0F, 18, 7, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  602 */     this.gunModel[17].setRotationPoint(-84.0F, -21.75F, 1.5F);
/*      */     
/*  604 */     this.gunModel[18].addShapeBox(122.0F, -17.0F, -10.0F, 27, 20, 18, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  605 */     this.gunModel[18].setRotationPoint(-111.25F, -26.5F, 1.0F);
/*      */     
/*  607 */     this.gunModel[19].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[19].setRotationPoint(-110.75F, -24.5F, 0.5F);
/*      */     
/*  610 */     this.gunModel[20].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[20].setRotationPoint(-110.75F, -23.5F, 0.5F);
/*      */     
/*  613 */     this.gunModel[21].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[21].setRotationPoint(-110.75F, -25.5F, 0.5F);
/*      */     
/*  616 */     this.gunModel[22].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[22].setRotationPoint(-87.75F, -24.5F, 0.5F);
/*      */     
/*  619 */     this.gunModel[23].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[23].setRotationPoint(-87.75F, -23.5F, 0.5F);
/*      */     
/*  622 */     this.gunModel[24].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[24].setRotationPoint(-87.75F, -25.5F, 0.5F);
/*      */     
/*  625 */     this.gunModel[25].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[25].setRotationPoint(-110.75F, -8.75F, 0.5F);
/*      */     
/*  628 */     this.gunModel[26].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[26].setRotationPoint(-110.75F, -7.75F, 0.5F);
/*      */     
/*  631 */     this.gunModel[27].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  632 */     this.gunModel[27].setRotationPoint(-110.75F, -9.75F, 0.5F);
/*      */     
/*  634 */     this.gunModel[28].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[28].setRotationPoint(-87.75F, -8.75F, 0.5F);
/*      */     
/*  637 */     this.gunModel[29].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[29].setRotationPoint(-87.75F, -7.75F, 0.5F);
/*      */     
/*  640 */     this.gunModel[30].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[30].setRotationPoint(-87.75F, -9.75F, 0.5F);
/*      */     
/*  643 */     this.gunModel[31].addShapeBox(122.0F, -17.0F, -10.0F, 62, 1, 19, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/*  644 */     this.gunModel[31].setRotationPoint(-83.0F, -29.0F, 0.5F);
/*      */     
/*  646 */     this.gunModel[32].addShapeBox(122.0F, -17.0F, -10.0F, 72, 4, 2, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  647 */     this.gunModel[32].setRotationPoint(-93.0F, -38.0F, 0.5F);
/*      */     
/*  649 */     this.gunModel[33].addShapeBox(122.0F, -17.0F, -10.0F, 72, 5, 1, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  650 */     this.gunModel[33].setRotationPoint(-93.0F, -34.0F, 1.5F);
/*      */     
/*  652 */     this.gunModel[34].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 19, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 1.0F, 0.0F);
/*  653 */     this.gunModel[34].setRotationPoint(-84.5F, -29.0F, 0.5F);
/*      */     
/*  655 */     this.gunModel[35].addShapeBox(122.0F, -17.0F, -10.0F, 10, 3, 19, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  656 */     this.gunModel[35].setRotationPoint(-93.5F, -29.0F, 0.5F);
/*      */     
/*  658 */     this.gunModel[36].addShapeBox(122.0F, -17.0F, -10.0F, 19, 12, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  659 */     this.gunModel[36].setRotationPoint(-112.5F, -38.0F, 0.5F);
/*      */     
/*  661 */     this.gunModel[37].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  662 */     this.gunModel[37].setRotationPoint(-93.5F, -34.5F, 0.5F);
/*      */     
/*  664 */     this.gunModel[38].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  665 */     this.gunModel[38].setRotationPoint(-93.5F, -30.0F, 0.5F);
/*      */     
/*  667 */     this.gunModel[39].addShapeBox(122.0F, -17.0F, -10.0F, 4, 12, 2, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  668 */     this.gunModel[39].setRotationPoint(-116.5F, -38.0F, 0.5F);
/*      */     
/*  670 */     this.gunModel[40].addShapeBox(122.0F, -17.0F, -10.0F, 1, 12, 2, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  671 */     this.gunModel[40].setRotationPoint(-117.5F, -38.0F, 0.5F);
/*      */     
/*  673 */     this.gunModel[41].addShapeBox(122.0F, -17.0F, -10.0F, 6, 5, 19, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  674 */     this.gunModel[41].setRotationPoint(-117.5F, -27.5F, 0.5F);
/*      */     
/*  676 */     this.gunModel[42].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 19, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  677 */     this.gunModel[42].setRotationPoint(-112.0F, -26.5F, 0.5F);
/*      */     
/*  679 */     this.gunModel[43].addShapeBox(122.0F, -17.0F, -10.0F, 14, 4, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/*  680 */     this.gunModel[43].setRotationPoint(-109.0F, -42.0F, 0.5F);
/*      */     
/*  682 */     this.gunModel[44].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 19, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F);
/*  683 */     this.gunModel[44].setRotationPoint(-23.0F, -34.5F, 0.5F);
/*      */     
/*  685 */     this.gunModel[45].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 19, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/*  686 */     this.gunModel[45].setRotationPoint(-23.0F, -30.0F, 0.5F);
/*      */     
/*  688 */     this.gunModel[46].addShapeBox(122.0F, -17.0F, -10.0F, 4, 11, 19, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  689 */     this.gunModel[46].setRotationPoint(-21.0F, -38.5F, 0.5F);
/*      */     
/*  691 */     this.gunModel[47].addShapeBox(122.0F, -17.0F, -10.0F, 92, 4, 5, 0.0F, -1.75F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, -1.75F, 0.25F, -1.5F, 0.5F, -0.25F, -3.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F);
/*  692 */     this.gunModel[47].setRotationPoint(-109.0F, -46.0F, 12.0F);
/*      */     
/*  694 */     this.gunModel[48].addShapeBox(122.0F, -17.0F, -10.0F, 14, 4, 5, 0.0F, -1.75F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, -1.75F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F);
/*  695 */     this.gunModel[48].setRotationPoint(-109.0F, -46.0F, 3.0F);
/*      */     
/*  697 */     this.gunModel[49].addShapeBox(122.0F, -17.0F, -10.0F, 14, 1, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/*  698 */     this.gunModel[49].setRotationPoint(-109.0F, -42.5F, 1.5F);
/*      */     
/*  700 */     this.gunModel[50].addShapeBox(122.0F, -17.0F, -10.0F, 72, 4, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.75F, -0.25F, -1.0F, 0.75F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -2.0F, 0.75F, -0.25F, -2.0F, 0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  701 */     this.gunModel[50].setRotationPoint(-109.0F, -42.0F, 15.5F);
/*      */     
/*  703 */     this.gunModel[51].addShapeBox(122.0F, -17.0F, -10.0F, 92, 1, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  704 */     this.gunModel[51].setRotationPoint(-109.0F, -42.5F, 14.5F);
/*      */     
/*  706 */     this.gunModel[52].addShapeBox(122.0F, -17.0F, -10.0F, 19, 12, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  707 */     this.gunModel[52].setRotationPoint(-112.5F, -38.0F, 17.5F);
/*      */     
/*  709 */     this.gunModel[53].addShapeBox(122.0F, -17.0F, -10.0F, 4, 12, 2, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  710 */     this.gunModel[53].setRotationPoint(-116.5F, -38.0F, 17.5F);
/*      */     
/*  712 */     this.gunModel[54].addShapeBox(122.0F, -17.0F, -10.0F, 1, 12, 2, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  713 */     this.gunModel[54].setRotationPoint(-117.5F, -38.0F, 17.5F);
/*      */     
/*  715 */     this.gunModel[55].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 16, 0.0F, 0.5F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F);
/*  716 */     this.gunModel[55].setRotationPoint(-105.0F, -42.0F, 2.0F);
/*      */     
/*  718 */     this.gunModel[56].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 10, 0.0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F);
/*  719 */     this.gunModel[56].setRotationPoint(-105.0F, -46.0F, 5.0F);
/*      */     
/*  721 */     this.gunModel[57].addShapeBox(122.0F, -17.0F, -10.0F, 88, 4, 5, 0.0F, 1.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 2.25F, -0.25F, -3.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, 0.5F, 2.25F, -0.25F, 0.5F);
/*  722 */     this.gunModel[57].setRotationPoint(-105.0F, -50.0F, 10.0F);
/*      */     
/*  724 */     this.gunModel[58].addShapeBox(122.0F, -17.0F, -10.0F, 10, 4, 5, 0.0F, 1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 1.0F, 0.0F, -3.75F, 2.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 2.25F, -0.25F, -3.5F);
/*  725 */     this.gunModel[58].setRotationPoint(-105.0F, -50.0F, 5.0F);
/*      */     
/*  727 */     this.gunModel[59].addShapeBox(122.0F, -17.0F, -10.0F, 196, 1, 12, 0.0F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  728 */     this.gunModel[59].setRotationPoint(-106.0F, -51.0F, 4.0F);
/*      */     
/*  730 */     this.gunModel[60].addShapeBox(122.0F, -17.0F, -10.0F, 196, 1, 12, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/*  731 */     this.gunModel[60].setRotationPoint(-106.0F, -51.75F, 4.0F);
/*      */     
/*  733 */     this.gunModel[61].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 10, 0.0F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.5F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F);
/*  734 */     this.gunModel[61].setRotationPoint(-105.0F, -50.0F, 5.0F);
/*      */     
/*  736 */     this.gunModel[62].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 13, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  737 */     this.gunModel[62].setRotationPoint(-105.0F, -42.5F, 3.5F);
/*      */     
/*  739 */     this.gunModel[63].addShapeBox(122.0F, -17.0F, -10.0F, 2, 12, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[63].setRotationPoint(-105.5F, -38.25F, 2.0F);
/*      */     
/*  742 */     this.gunModel[64].addShapeBox(122.0F, -17.0F, -10.0F, 1, 20, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  743 */     this.gunModel[64].setRotationPoint(-112.25F, -26.5F, 2.5F);
/*      */     
/*  745 */     this.gunModel[65].addShapeBox(122.0F, -17.0F, -10.0F, 6, 10, 16, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  746 */     this.gunModel[65].setRotationPoint(-118.25F, -22.5F, 2.0F);
/*      */     
/*  748 */     this.gunModel[66].addShapeBox(122.0F, -17.0F, -10.0F, 5, 1, 15, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  749 */     this.gunModel[66].setRotationPoint(-117.25F, -23.0F, 2.0F);
/*      */     
/*  751 */     this.gunModel[67].addShapeBox(122.0F, -17.0F, -10.0F, 30, 12, 16, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  752 */     this.gunModel[67].setRotationPoint(-148.25F, -24.5F, 2.0F);
/*      */     
/*  754 */     this.gunModel[68].addShapeBox(122.0F, -17.0F, -10.0F, 38, 2, 16, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  755 */     this.gunModel[68].setRotationPoint(-156.25F, -26.25F, 2.0F);
/*      */     
/*  757 */     this.gunModel[69].addShapeBox(122.0F, -17.0F, -10.0F, 71, 3, 16, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  758 */     this.gunModel[69].setRotationPoint(-156.25F, -6.5F, 2.0F);
/*      */     
/*  760 */     this.gunModel[70].addShapeBox(122.0F, -17.0F, -10.0F, 44, 7, 16, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  761 */     this.gunModel[70].setRotationPoint(-156.25F, -13.25F, 2.0F);
/*      */     
/*  763 */     this.gunModel[71].addShapeBox(122.0F, -17.0F, -10.0F, 1, 2, 15, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/*  764 */     this.gunModel[71].setRotationPoint(-117.25F, -24.5F, 2.0F);
/*      */     
/*  766 */     this.gunModel[72].addShapeBox(122.0F, -17.0F, -10.0F, 44, 1, 15, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  767 */     this.gunModel[72].setRotationPoint(-156.25F, -12.75F, 2.5F);
/*      */     
/*  769 */     this.gunModel[73].addShapeBox(122.0F, -17.0F, -10.0F, 71, 1, 13, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  770 */     this.gunModel[73].setRotationPoint(-156.25F, -6.5F, 2.5F);
/*      */     
/*  772 */     this.gunModel[74].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel[74].setRotationPoint(-154.25F, -8.5F, 1.5F);
/*      */     
/*  775 */     this.gunModel[75].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel[75].setRotationPoint(-154.25F, -9.5F, 1.5F);
/*      */     
/*  778 */     this.gunModel[76].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  779 */     this.gunModel[76].setRotationPoint(-154.25F, -10.5F, 1.5F);
/*      */     
/*  781 */     this.gunModel[77].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  782 */     this.gunModel[77].setRotationPoint(-143.25F, -8.5F, 1.5F);
/*      */     
/*  784 */     this.gunModel[78].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  785 */     this.gunModel[78].setRotationPoint(-143.25F, -9.5F, 1.5F);
/*      */     
/*  787 */     this.gunModel[79].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  788 */     this.gunModel[79].setRotationPoint(-143.25F, -10.5F, 1.5F);
/*      */     
/*  790 */     this.gunModel[80].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  791 */     this.gunModel[80].setRotationPoint(-132.25F, -8.5F, 1.5F);
/*      */     
/*  793 */     this.gunModel[81].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  794 */     this.gunModel[81].setRotationPoint(-132.25F, -9.5F, 1.5F);
/*      */     
/*  796 */     this.gunModel[82].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  797 */     this.gunModel[82].setRotationPoint(-132.25F, -10.5F, 1.5F);
/*      */     
/*  799 */     this.gunModel[83].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  800 */     this.gunModel[83].setRotationPoint(-121.25F, -8.5F, 1.5F);
/*      */     
/*  802 */     this.gunModel[84].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  803 */     this.gunModel[84].setRotationPoint(-121.25F, -9.5F, 1.5F);
/*      */     
/*  805 */     this.gunModel[85].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  806 */     this.gunModel[85].setRotationPoint(-121.25F, -10.5F, 1.5F);
/*      */     
/*  808 */     this.gunModel[86].addShapeBox(122.0F, -17.0F, -10.0F, 2, 12, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  809 */     this.gunModel[86].setRotationPoint(-156.25F, -24.5F, 2.0F);
/*      */     
/*  811 */     this.gunModel[87].addShapeBox(122.0F, -17.0F, -10.0F, 6, 3, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  812 */     this.gunModel[87].setRotationPoint(-153.5F, -24.5F, 2.0F);
/*      */     
/*  814 */     this.gunModel[88].addShapeBox(122.0F, -17.0F, -10.0F, 6, 4, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  815 */     this.gunModel[88].setRotationPoint(-153.5F, -16.5F, 2.0F);
/*      */     
/*  817 */     this.gunModel[89].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  818 */     this.gunModel[89].setRotationPoint(-149.5F, -18.0F, 2.0F);
/*      */     
/*  820 */     this.gunModel[90].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  821 */     this.gunModel[90].setRotationPoint(-153.5F, -18.0F, 2.0F);
/*      */     
/*  823 */     this.gunModel[91].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  824 */     this.gunModel[91].setRotationPoint(-149.5F, -22.0F, 2.0F);
/*      */     
/*  826 */     this.gunModel[92].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  827 */     this.gunModel[92].setRotationPoint(-153.5F, -22.0F, 2.0F);
/*      */     
/*  829 */     this.gunModel[93].addShapeBox(122.0F, -17.0F, -10.0F, 6, 6, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  830 */     this.gunModel[93].setRotationPoint(-153.5F, -22.0F, 2.5F);
/*      */     
/*  832 */     this.gunModel[94].addShapeBox(122.0F, -17.0F, -10.0F, 58, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  833 */     this.gunModel[94].setRotationPoint(33.0F, -30.25F, -2.0F);
/*      */     
/*  835 */     this.gunModel[95].addShapeBox(122.0F, -17.0F, -10.0F, 58, 5, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  836 */     this.gunModel[95].setRotationPoint(33.0F, -35.25F, 17.0F);
/*      */     
/*  838 */     this.gunModel[96].addShapeBox(122.0F, -17.0F, -10.0F, 58, 5, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel[96].setRotationPoint(33.0F, -40.25F, 17.5F);
/*      */     
/*  841 */     this.gunModel[97].addShapeBox(122.0F, -17.0F, -10.0F, 19, 3, 17, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  842 */     this.gunModel[97].setRotationPoint(72.0F, -45.25F, 1.5F);
/*      */     
/*  844 */     this.gunModel[98].addShapeBox(122.0F, -17.0F, -10.0F, 96, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel[98].setRotationPoint(-5.0F, -42.25F, 16.5F);
/*      */     
/*  847 */     this.gunModel[99].addShapeBox(122.0F, -17.0F, -10.0F, 14, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel[99].setRotationPoint(-17.0F, -30.25F, -2.0F);
/*      */     
/*  850 */     this.gunModel[100].addShapeBox(122.0F, -17.0F, -10.0F, 14, 5, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel[100].setRotationPoint(-17.0F, -35.25F, -2.0F);
/*      */     
/*  853 */     this.gunModel[101].addShapeBox(122.0F, -17.0F, -10.0F, 14, 5, 23, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  854 */     this.gunModel[101].setRotationPoint(-17.0F, -40.25F, -1.5F);
/*      */     
/*  856 */     this.gunModel[102].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 17, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  857 */     this.gunModel[102].setRotationPoint(-17.0F, -45.25F, 1.5F);
/*      */     
/*  859 */     this.gunModel[103].addShapeBox(122.0F, -17.0F, -10.0F, 13, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  860 */     this.gunModel[103].setRotationPoint(-17.0F, -46.25F, 5.0F);
/*      */     
/*  862 */     this.gunModel[104].addShapeBox(122.0F, -17.0F, -10.0F, 8, 2, 21, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  863 */     this.gunModel[104].setRotationPoint(-17.0F, -42.25F, -0.5F);
/*      */     
/*  865 */     this.gunModel[105].addShapeBox(122.0F, -17.0F, -10.0F, 1, 3, 17, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  866 */     this.gunModel[105].setRotationPoint(-5.0F, -45.25F, 1.5F);
/*      */     
/*  868 */     this.gunModel[106].addShapeBox(122.0F, -17.0F, -10.0F, 36, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel[106].setRotationPoint(-3.0F, -29.25F, -2.0F);
/*      */     
/*  871 */     this.gunModel[107].addShapeBox(122.0F, -17.0F, -10.0F, 36, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel[107].setRotationPoint(-3.0F, -40.25F, 17.5F);
/*      */     
/*  874 */     this.gunModel[108].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel[108].setRotationPoint(23.0F, -35.25F, 18.0F);
/*      */     
/*  877 */     this.gunModel[109].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F);
/*  878 */     this.gunModel[109].setRotationPoint(31.0F, -35.25F, -2.0F);
/*      */     
/*  880 */     this.gunModel[110].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
/*  881 */     this.gunModel[110].setRotationPoint(27.0F, -35.25F, -2.0F);
/*      */     
/*  883 */     this.gunModel[111].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
/*  884 */     this.gunModel[111].setRotationPoint(-3.0F, -35.25F, -2.0F);
/*      */     
/*  886 */     this.gunModel[112].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  887 */     this.gunModel[112].setRotationPoint(3.0F, -30.25F, -2.0F);
/*      */     
/*  889 */     this.gunModel[113].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  890 */     this.gunModel[113].setRotationPoint(13.0F, -30.25F, -2.0F);
/*      */     
/*  892 */     this.gunModel[114].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  893 */     this.gunModel[114].setRotationPoint(23.0F, -30.25F, -2.0F);
/*      */     
/*  895 */     this.gunModel[115].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  896 */     this.gunModel[115].setRotationPoint(31.0F, -30.25F, -2.0F);
/*      */     
/*  898 */     this.gunModel[116].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  899 */     this.gunModel[116].setRotationPoint(32.0F, -31.25F, -2.0F);
/*      */     
/*  901 */     this.gunModel[117].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  902 */     this.gunModel[117].setRotationPoint(-3.0F, -30.25F, -2.0F);
/*      */     
/*  904 */     this.gunModel[118].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 24, 0.0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel[118].setRotationPoint(-3.0F, -31.25F, -2.0F);
/*      */     
/*  907 */     this.gunModel[119].addShapeBox(122.0F, -17.0F, -10.0F, 54, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel[119].setRotationPoint(35.0F, -41.75F, 20.5F);
/*      */     
/*  910 */     this.gunModel[120].addShapeBox(122.0F, -17.0F, -10.0F, 121, 4, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  911 */     this.gunModel[120].setRotationPoint(-30.0F, -26.25F, 1.5F);
/*      */     
/*  913 */     this.gunModel[121].addShapeBox(122.0F, -17.0F, -10.0F, 119, 1, 17, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  914 */     this.gunModel[121].setRotationPoint(-30.0F, -22.25F, 1.5F);
/*      */     
/*  916 */     this.gunModel[122].addShapeBox(122.0F, -17.0F, -10.0F, 118, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  917 */     this.gunModel[122].setRotationPoint(-30.0F, -21.25F, 3.5F);
/*      */     
/*  919 */     this.gunModel[123].addShapeBox(122.0F, -17.0F, -10.0F, 118, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  920 */     this.gunModel[123].setRotationPoint(-30.0F, -18.75F, 3.5F);
/*      */     
/*  922 */     this.gunModel[124].addShapeBox(122.0F, -17.0F, -10.0F, 116, 2, 16, 0.0F, 0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/*  923 */     this.gunModel[124].setRotationPoint(-28.0F, -17.25F, 1.5F);
/*      */     
/*  925 */     this.gunModel[125].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  926 */     this.gunModel[125].setRotationPoint(2.0F, -45.25F, 14.5F);
/*      */     
/*  928 */     this.gunModel[126].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  929 */     this.gunModel[126].setRotationPoint(-4.0F, -44.25F, 14.5F);
/*      */     
/*  931 */     this.gunModel[127].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 21, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  932 */     this.gunModel[127].setRotationPoint(-6.0F, -41.25F, -0.5F);
/*      */     
/*  934 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 19, 0.0F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F);
/*  935 */     this.gunModel[''].setRotationPoint(-6.0F, -43.25F, 0.5F);
/*      */     
/*  937 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 21, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  938 */     this.gunModel[''].setRotationPoint(-9.0F, -41.25F, -0.5F);
/*      */     
/*  940 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 19, 0.0F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  941 */     this.gunModel[''].setRotationPoint(-9.0F, -43.25F, 0.5F);
/*      */     
/*  943 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F);
/*  944 */     this.gunModel[''].setRotationPoint(-9.0F, -45.25F, 2.5F);
/*      */     
/*  946 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 15, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  947 */     this.gunModel[''].setRotationPoint(-9.0F, -43.25F, 2.5F);
/*      */     
/*  949 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 7, 3, 5, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F);
/*  950 */     this.gunModel[''].setRotationPoint(-17.0F, -50.0F, 5.0F);
/*      */     
/*  952 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 7, 3, 5, 0.0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/*  953 */     this.gunModel[''].setRotationPoint(-17.0F, -50.0F, 10.0F);
/*      */     
/*  955 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 18, 3, 5, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F);
/*  956 */     this.gunModel[''].setRotationPoint(72.0F, -50.0F, 5.0F);
/*      */     
/*  958 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 17, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  959 */     this.gunModel[''].setRotationPoint(70.0F, -44.25F, 1.5F);
/*      */     
/*  961 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 82, 2, 12, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, -3.4F, 0.0F, -0.25F, -3.4F);
/*  962 */     this.gunModel[''].setRotationPoint(-10.0F, -50.0F, 5.0F);
/*      */     
/*  964 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 13, 1, 10, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  965 */     this.gunModel[''].setRotationPoint(-17.0F, -47.25F, 5.0F);
/*      */     
/*  967 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  968 */     this.gunModel[''].setRotationPoint(2.0F, -46.25F, 13.0F);
/*      */     
/*  970 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel[''].setRotationPoint(2.0F, -47.25F, 12.0F);
/*      */     
/*  973 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 18, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  974 */     this.gunModel[''].setRotationPoint(72.0F, -46.25F, 5.0F);
/*      */     
/*  976 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 18, 1, 10, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  977 */     this.gunModel[''].setRotationPoint(72.0F, -47.25F, 5.0F);
/*      */     
/*  979 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 18, 3, 10, 0.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, 0.55F);
/*  980 */     this.gunModel[''].setRotationPoint(72.0F, -50.0F, 3.0F);
/*      */     
/*  982 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/*  983 */     this.gunModel[''].setRotationPoint(2.0F, -48.25F, 5.0F);
/*      */     
/*  985 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F);
/*  986 */     this.gunModel[''].setRotationPoint(16.0F, -47.25F, 5.0F);
/*      */     
/*  988 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 14, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/*  989 */     this.gunModel[''].setRotationPoint(70.0F, -48.25F, 1.0F);
/*      */     
/*  991 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  992 */     this.gunModel[''].setRotationPoint(71.0F, -47.25F, 1.0F);
/*      */     
/*  994 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F);
/*  995 */     this.gunModel[''].setRotationPoint(0.0F, -48.25F, 5.0F);
/*      */     
/*  997 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F);
/*  998 */     this.gunModel[''].setRotationPoint(-4.0F, -48.25F, 5.0F);
/*      */     
/* 1000 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1001 */     this.gunModel[''].setRotationPoint(-4.0F, -47.25F, 5.0F);
/*      */     
/* 1003 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1004 */     this.gunModel[''].setRotationPoint(6.0F, -48.25F, 5.0F);
/*      */     
/* 1006 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 6, 1, 5, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F);
/* 1007 */     this.gunModel[''].setRotationPoint(-10.0F, -48.25F, 5.0F);
/*      */     
/* 1009 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 54, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1010 */     this.gunModel[''].setRotationPoint(35.0F, -41.75F, -3.5F);
/*      */     
/* 1012 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 5, 5, 18, 0.0F, 0.0F, -4.75F, -7.25F, -1.0F, -0.5F, -6.0F, -1.0F, -0.5F, -6.0F, 0.0F, -4.75F, -7.25F, 0.0F, 3.25F, -3.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, -3.75F);
/* 1013 */     this.gunModel[''].setRotationPoint(238.0F, -46.75F, 1.0F);
/*      */     
/* 1015 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 5, 3, 12, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 3.0F, 3.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 3.0F, 3.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.25F, -0.75F);
/* 1016 */     this.gunModel[''].setRotationPoint(238.0F, -38.25F, 4.0F);
/*      */     
/* 1018 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 242, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1019 */     this.gunModel[''].setRotationPoint(-4.0F, -38.25F, 5.0F);
/*      */     
/* 1021 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 242, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F);
/* 1022 */     this.gunModel[''].setRotationPoint(-4.0F, -34.75F, 5.0F);
/*      */     
/* 1024 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 242, 3, 10, 0.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1025 */     this.gunModel[''].setRotationPoint(-4.0F, -41.75F, 5.0F);
/*      */     
/* 1027 */     this.gunModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 18, 3, 5, 0.0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1028 */     this.gunModel[''].setRotationPoint(72.0F, -50.0F, 10.0F);
/*      */     
/* 1030 */     this.gunModel[' '].addShapeBox(122.0F, -17.0F, -10.0F, 82, 2, 5, 0.0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.6F, 0.0F, -0.25F, -3.6F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F);
/* 1031 */     this.gunModel[' '].setRotationPoint(-10.0F, -50.0F, 10.0F);
/*      */     
/* 1033 */     this.gunModel['¡'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1034 */     this.gunModel['¡'].setRotationPoint(2.0F, -48.25F, 10.0F);
/*      */     
/* 1036 */     this.gunModel['¢'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1037 */     this.gunModel['¢'].setRotationPoint(22.0F, -48.25F, 10.0F);
/*      */     
/* 1039 */     this.gunModel['£'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1040 */     this.gunModel['£'].setRotationPoint(32.0F, -48.25F, 10.0F);
/*      */     
/* 1042 */     this.gunModel['¤'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1043 */     this.gunModel['¤'].setRotationPoint(42.0F, -48.25F, 10.0F);
/*      */     
/* 1045 */     this.gunModel['¥'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1046 */     this.gunModel['¥'].setRotationPoint(16.0F, -47.25F, 10.0F);
/*      */     
/* 1048 */     this.gunModel['¦'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1049 */     this.gunModel['¦'].setRotationPoint(0.0F, -48.25F, 10.0F);
/*      */     
/* 1051 */     this.gunModel['§'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1052 */     this.gunModel['§'].setRotationPoint(6.0F, -47.25F, 8.0F);
/*      */     
/* 1054 */     this.gunModel['¨'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1055 */     this.gunModel['¨'].setRotationPoint(-4.0F, -48.25F, 10.0F);
/*      */     
/* 1057 */     this.gunModel['©'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1058 */     this.gunModel['©'].setRotationPoint(-4.0F, -47.25F, 10.0F);
/*      */     
/* 1060 */     this.gunModel['ª'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1061 */     this.gunModel['ª'].setRotationPoint(6.0F, -48.25F, 10.0F);
/*      */     
/* 1063 */     this.gunModel['«'].addShapeBox(122.0F, -17.0F, -10.0F, 6, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1064 */     this.gunModel['«'].setRotationPoint(-10.0F, -48.25F, 10.0F);
/*      */     
/* 1066 */     this.gunModel['¬'].addShapeBox(122.0F, -17.0F, -10.0F, 58, 5, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1067 */     this.gunModel['¬'].setRotationPoint(33.0F, -40.25F, -1.5F);
/*      */     
/* 1069 */     this.gunModel['­'].addShapeBox(122.0F, -17.0F, -10.0F, 96, 2, 4, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1070 */     this.gunModel['­'].setRotationPoint(-5.0F, -42.25F, -0.5F);
/*      */     
/* 1072 */     this.gunModel['®'].addShapeBox(122.0F, -17.0F, -10.0F, 58, 5, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1073 */     this.gunModel['®'].setRotationPoint(33.0F, -35.25F, -2.0F);
/*      */     
/* 1075 */     this.gunModel['¯'].addShapeBox(122.0F, -17.0F, -10.0F, 58, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1076 */     this.gunModel['¯'].setRotationPoint(33.0F, -30.25F, 18.0F);
/*      */     
/* 1078 */     this.gunModel['°'].addShapeBox(122.0F, -17.0F, -10.0F, 58, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1079 */     this.gunModel['°'].setRotationPoint(33.0F, -28.25F, 2.0F);
/*      */     
/* 1081 */     this.gunModel['±'].addShapeBox(122.0F, -17.0F, -10.0F, 58, 2, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1082 */     this.gunModel['±'].setRotationPoint(33.0F, -30.25F, 15.0F);
/*      */     
/* 1084 */     this.gunModel['²'].addShapeBox(122.0F, -17.0F, -10.0F, 58, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1085 */     this.gunModel['²'].setRotationPoint(33.0F, -30.25F, 2.0F);
/*      */     
/* 1087 */     this.gunModel['³'].addShapeBox(122.0F, -17.0F, -10.0F, 36, 5, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1088 */     this.gunModel['³'].setRotationPoint(-3.0F, -40.25F, -1.5F);
/*      */     
/* 1090 */     this.gunModel['´'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1091 */     this.gunModel['´'].setRotationPoint(0.0F, -44.25F, 1.5F);
/*      */     
/* 1093 */     this.gunModel['µ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1094 */     this.gunModel['µ'].setRotationPoint(-4.0F, -44.25F, 1.5F);
/*      */     
/* 1096 */     this.gunModel['¶'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1097 */     this.gunModel['¶'].setRotationPoint(2.0F, -45.25F, 1.5F);
/*      */     
/* 1099 */     this.gunModel['·'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1100 */     this.gunModel['·'].setRotationPoint(27.0F, -30.25F, -2.0F);
/*      */     
/* 1102 */     this.gunModel['¸'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1103 */     this.gunModel['¸'].setRotationPoint(27.0F, -31.25F, -2.0F);
/*      */     
/* 1105 */     this.gunModel['¹'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1106 */     this.gunModel['¹'].setRotationPoint(6.0F, -44.25F, 14.5F);
/*      */     
/* 1108 */     this.gunModel['º'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1109 */     this.gunModel['º'].setRotationPoint(6.0F, -44.25F, 1.5F);
/*      */     
/* 1111 */     this.gunModel['»'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1112 */     this.gunModel['»'].setRotationPoint(31.0F, -30.25F, 18.0F);
/*      */     
/* 1114 */     this.gunModel['¼'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1115 */     this.gunModel['¼'].setRotationPoint(32.0F, -31.25F, 18.0F);
/*      */     
/* 1117 */     this.gunModel['½'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1118 */     this.gunModel['½'].setRotationPoint(23.0F, -35.25F, -2.0F);
/*      */     
/* 1120 */     this.gunModel['¾'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1121 */     this.gunModel['¾'].setRotationPoint(27.0F, -30.25F, 18.0F);
/*      */     
/* 1123 */     this.gunModel['¿'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, 0.6F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1124 */     this.gunModel['¿'].setRotationPoint(27.0F, -31.25F, 19.0F);
/*      */     
/* 1126 */     this.gunModel['À'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F);
/* 1127 */     this.gunModel['À'].setRotationPoint(21.0F, -35.25F, -2.0F);
/*      */     
/* 1129 */     this.gunModel['Á'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
/* 1130 */     this.gunModel['Á'].setRotationPoint(17.0F, -35.25F, -2.0F);
/*      */     
/* 1132 */     this.gunModel['Â'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1133 */     this.gunModel['Â'].setRotationPoint(21.0F, -30.25F, -2.0F);
/*      */     
/* 1135 */     this.gunModel['Ã'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1136 */     this.gunModel['Ã'].setRotationPoint(22.0F, -31.25F, -2.0F);
/*      */     
/* 1138 */     this.gunModel['Ä'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1139 */     this.gunModel['Ä'].setRotationPoint(17.0F, -30.25F, -2.0F);
/*      */     
/* 1141 */     this.gunModel['Å'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1142 */     this.gunModel['Å'].setRotationPoint(17.0F, -31.25F, -2.0F);
/*      */     
/* 1144 */     this.gunModel['Æ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1145 */     this.gunModel['Æ'].setRotationPoint(17.0F, -30.25F, 18.0F);
/*      */     
/* 1147 */     this.gunModel['Ç'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, 0.6F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1148 */     this.gunModel['Ç'].setRotationPoint(17.0F, -31.25F, 19.0F);
/*      */     
/* 1150 */     this.gunModel['È'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F);
/* 1151 */     this.gunModel['È'].setRotationPoint(11.0F, -35.25F, -2.0F);
/*      */     
/* 1153 */     this.gunModel['É'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
/* 1154 */     this.gunModel['É'].setRotationPoint(7.0F, -35.25F, -2.0F);
/*      */     
/* 1156 */     this.gunModel['Ê'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1157 */     this.gunModel['Ê'].setRotationPoint(11.0F, -30.25F, -2.0F);
/*      */     
/* 1159 */     this.gunModel['Ë'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1160 */     this.gunModel['Ë'].setRotationPoint(12.0F, -31.25F, -2.0F);
/*      */     
/* 1162 */     this.gunModel['Ì'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1163 */     this.gunModel['Ì'].setRotationPoint(7.0F, -30.25F, -2.0F);
/*      */     
/* 1165 */     this.gunModel['Í'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1166 */     this.gunModel['Í'].setRotationPoint(7.0F, -31.25F, -2.0F);
/*      */     
/* 1168 */     this.gunModel['Î'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1169 */     this.gunModel['Î'].setRotationPoint(7.0F, -30.25F, 18.0F);
/*      */     
/* 1171 */     this.gunModel['Ï'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, 0.6F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1172 */     this.gunModel['Ï'].setRotationPoint(7.0F, -31.25F, 19.0F);
/*      */     
/* 1174 */     this.gunModel['Ð'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F);
/* 1175 */     this.gunModel['Ð'].setRotationPoint(1.0F, -35.25F, -2.0F);
/*      */     
/* 1177 */     this.gunModel['Ñ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1178 */     this.gunModel['Ñ'].setRotationPoint(1.0F, -30.25F, -2.0F);
/*      */     
/* 1180 */     this.gunModel['Ò'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1181 */     this.gunModel['Ò'].setRotationPoint(2.0F, -31.25F, -2.0F);
/*      */     
/* 1183 */     this.gunModel['Ó'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1184 */     this.gunModel['Ó'].setRotationPoint(13.0F, -35.25F, 18.0F);
/*      */     
/* 1186 */     this.gunModel['Ô'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1187 */     this.gunModel['Ô'].setRotationPoint(13.0F, -35.25F, -2.0F);
/*      */     
/* 1189 */     this.gunModel['Õ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1190 */     this.gunModel['Õ'].setRotationPoint(3.0F, -35.25F, 18.0F);
/*      */     
/* 1192 */     this.gunModel['Ö'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1193 */     this.gunModel['Ö'].setRotationPoint(3.0F, -35.25F, -2.0F);
/*      */     
/* 1195 */     this.gunModel['×'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1196 */     this.gunModel['×'].setRotationPoint(21.0F, -30.25F, 18.0F);
/*      */     
/* 1198 */     this.gunModel['Ø'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1199 */     this.gunModel['Ø'].setRotationPoint(22.0F, -31.25F, 18.0F);
/*      */     
/* 1201 */     this.gunModel['Ù'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1202 */     this.gunModel['Ù'].setRotationPoint(23.0F, -30.25F, 18.5F);
/*      */     
/* 1204 */     this.gunModel['Ú'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1205 */     this.gunModel['Ú'].setRotationPoint(11.0F, -30.25F, 18.0F);
/*      */     
/* 1207 */     this.gunModel['Û'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1208 */     this.gunModel['Û'].setRotationPoint(12.0F, -31.25F, 18.0F);
/*      */     
/* 1210 */     this.gunModel['Ü'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1211 */     this.gunModel['Ü'].setRotationPoint(13.0F, -30.25F, 18.5F);
/*      */     
/* 1213 */     this.gunModel['Ý'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 4, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1214 */     this.gunModel['Ý'].setRotationPoint(1.0F, -30.25F, 18.0F);
/*      */     
/* 1216 */     this.gunModel['Þ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1217 */     this.gunModel['Þ'].setRotationPoint(2.0F, -31.25F, 18.0F);
/*      */     
/* 1219 */     this.gunModel['ß'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1220 */     this.gunModel['ß'].setRotationPoint(3.0F, -30.25F, 18.5F);
/*      */     
/* 1222 */     this.gunModel['à'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1223 */     this.gunModel['à'].setRotationPoint(12.0F, -45.25F, 14.5F);
/*      */     
/* 1225 */     this.gunModel['á'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1226 */     this.gunModel['á'].setRotationPoint(12.0F, -45.25F, 1.5F);
/*      */     
/* 1228 */     this.gunModel['â'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1229 */     this.gunModel['â'].setRotationPoint(22.0F, -45.25F, 14.5F);
/*      */     
/* 1231 */     this.gunModel['ã'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1232 */     this.gunModel['ã'].setRotationPoint(22.0F, -45.25F, 1.5F);
/*      */     
/* 1234 */     this.gunModel['ä'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1235 */     this.gunModel['ä'].setRotationPoint(32.0F, -45.25F, 14.5F);
/*      */     
/* 1237 */     this.gunModel['å'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1238 */     this.gunModel['å'].setRotationPoint(32.0F, -45.25F, 1.5F);
/*      */     
/* 1240 */     this.gunModel['æ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1241 */     this.gunModel['æ'].setRotationPoint(42.0F, -45.25F, 14.5F);
/*      */     
/* 1243 */     this.gunModel['ç'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1244 */     this.gunModel['ç'].setRotationPoint(42.0F, -45.25F, 1.5F);
/*      */     
/* 1246 */     this.gunModel['è'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1247 */     this.gunModel['è'].setRotationPoint(52.0F, -45.25F, 14.5F);
/*      */     
/* 1249 */     this.gunModel['é'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1250 */     this.gunModel['é'].setRotationPoint(52.0F, -45.25F, 1.5F);
/*      */     
/* 1252 */     this.gunModel['ê'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1253 */     this.gunModel['ê'].setRotationPoint(62.0F, -45.25F, 14.5F);
/*      */     
/* 1255 */     this.gunModel['ë'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1256 */     this.gunModel['ë'].setRotationPoint(62.0F, -45.25F, 1.5F);
/*      */     
/* 1258 */     this.gunModel['ì'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1259 */     this.gunModel['ì'].setRotationPoint(10.0F, -44.25F, 14.5F);
/*      */     
/* 1261 */     this.gunModel['í'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1262 */     this.gunModel['í'].setRotationPoint(0.0F, -44.25F, 14.5F);
/*      */     
/* 1264 */     this.gunModel['î'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1265 */     this.gunModel['î'].setRotationPoint(16.0F, -44.25F, 14.5F);
/*      */     
/* 1267 */     this.gunModel['ï'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1268 */     this.gunModel['ï'].setRotationPoint(16.0F, -44.25F, 1.5F);
/*      */     
/* 1270 */     this.gunModel['ð'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1271 */     this.gunModel['ð'].setRotationPoint(20.0F, -44.25F, 14.5F);
/*      */     
/* 1273 */     this.gunModel['ñ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1274 */     this.gunModel['ñ'].setRotationPoint(2.0F, -46.25F, 5.0F);
/*      */     
/* 1276 */     this.gunModel['ò'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1277 */     this.gunModel['ò'].setRotationPoint(12.0F, -46.25F, 13.0F);
/*      */     
/* 1279 */     this.gunModel['ó'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1280 */     this.gunModel['ó'].setRotationPoint(12.0F, -46.25F, 5.0F);
/*      */     
/* 1282 */     this.gunModel['ô'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1283 */     this.gunModel['ô'].setRotationPoint(2.0F, -47.25F, 5.0F);
/*      */     
/* 1285 */     this.gunModel['õ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1286 */     this.gunModel['õ'].setRotationPoint(1.0F, -47.25F, 8.0F);
/*      */     
/* 1288 */     this.gunModel['ö'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1289 */     this.gunModel['ö'].setRotationPoint(30.0F, -44.25F, 1.5F);
/*      */     
/* 1291 */     this.gunModel['÷'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1292 */     this.gunModel['÷'].setRotationPoint(30.0F, -44.25F, 14.5F);
/*      */     
/* 1294 */     this.gunModel['ø'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1295 */     this.gunModel['ø'].setRotationPoint(40.0F, -44.25F, 1.5F);
/*      */     
/* 1297 */     this.gunModel['ù'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1298 */     this.gunModel['ù'].setRotationPoint(40.0F, -44.25F, 14.5F);
/*      */     
/* 1300 */     this.gunModel['ú'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1301 */     this.gunModel['ú'].setRotationPoint(12.0F, -47.25F, 12.0F);
/*      */     
/* 1303 */     this.gunModel['û'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1304 */     this.gunModel['û'].setRotationPoint(12.0F, -47.25F, 5.0F);
/*      */     
/* 1306 */     this.gunModel['ü'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F);
/* 1307 */     this.gunModel['ü'].setRotationPoint(11.0F, -47.25F, 5.0F);
/*      */     
/* 1309 */     this.gunModel['ý'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1310 */     this.gunModel['ý'].setRotationPoint(11.0F, -47.25F, 8.0F);
/*      */     
/* 1312 */     this.gunModel['þ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1313 */     this.gunModel['þ'].setRotationPoint(12.0F, -48.25F, 5.0F);
/*      */     
/* 1315 */     this.gunModel['ÿ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F);
/* 1316 */     this.gunModel['ÿ'].setRotationPoint(10.0F, -48.25F, 5.0F);
/*      */     
/* 1318 */     this.gunModel['Ā'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1319 */     this.gunModel['Ā'].setRotationPoint(16.0F, -48.25F, 5.0F);
/*      */     
/* 1321 */     this.gunModel['ā'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1322 */     this.gunModel['ā'].setRotationPoint(12.0F, -48.25F, 10.0F);
/*      */     
/* 1324 */     this.gunModel['Ă'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1325 */     this.gunModel['Ă'].setRotationPoint(10.0F, -48.25F, 10.0F);
/*      */     
/* 1327 */     this.gunModel['ă'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1328 */     this.gunModel['ă'].setRotationPoint(16.0F, -48.25F, 10.0F);
/*      */     
/* 1330 */     this.gunModel['Ą'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F);
/* 1331 */     this.gunModel['Ą'].setRotationPoint(1.0F, -47.25F, 5.0F);
/*      */     
/* 1333 */     this.gunModel['ą'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/* 1334 */     this.gunModel['ą'].setRotationPoint(6.0F, -47.25F, 5.0F);
/*      */     
/* 1336 */     this.gunModel['Ć'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1337 */     this.gunModel['Ć'].setRotationPoint(10.0F, -44.25F, 1.5F);
/*      */     
/* 1339 */     this.gunModel['ć'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1340 */     this.gunModel['ć'].setRotationPoint(50.0F, -44.25F, 1.5F);
/*      */     
/* 1342 */     this.gunModel['Ĉ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1343 */     this.gunModel['Ĉ'].setRotationPoint(56.0F, -44.25F, 14.5F);
/*      */     
/* 1345 */     this.gunModel['ĉ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1346 */     this.gunModel['ĉ'].setRotationPoint(56.0F, -44.25F, 1.5F);
/*      */     
/* 1348 */     this.gunModel['Ċ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1349 */     this.gunModel['Ċ'].setRotationPoint(60.0F, -44.25F, 14.5F);
/*      */     
/* 1351 */     this.gunModel['ċ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1352 */     this.gunModel['ċ'].setRotationPoint(50.0F, -44.25F, 14.5F);
/*      */     
/* 1354 */     this.gunModel['Č'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1355 */     this.gunModel['Č'].setRotationPoint(60.0F, -44.25F, 1.5F);
/*      */     
/* 1357 */     this.gunModel['č'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1358 */     this.gunModel['č'].setRotationPoint(66.0F, -44.25F, 14.5F);
/*      */     
/* 1360 */     this.gunModel['Ď'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1361 */     this.gunModel['Ď'].setRotationPoint(66.0F, -44.25F, 1.5F);
/*      */     
/* 1363 */     this.gunModel['ď'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1364 */     this.gunModel['ď'].setRotationPoint(20.0F, -44.25F, 1.5F);
/*      */     
/* 1366 */     this.gunModel['Đ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1367 */     this.gunModel['Đ'].setRotationPoint(26.0F, -44.25F, 14.5F);
/*      */     
/* 1369 */     this.gunModel['đ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1370 */     this.gunModel['đ'].setRotationPoint(26.0F, -44.25F, 1.5F);
/*      */     
/* 1372 */     this.gunModel['Ē'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1373 */     this.gunModel['Ē'].setRotationPoint(36.0F, -44.25F, 14.5F);
/*      */     
/* 1375 */     this.gunModel['ē'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1376 */     this.gunModel['ē'].setRotationPoint(36.0F, -44.25F, 1.5F);
/*      */     
/* 1378 */     this.gunModel['Ĕ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1379 */     this.gunModel['Ĕ'].setRotationPoint(22.0F, -46.25F, 13.0F);
/*      */     
/* 1381 */     this.gunModel['ĕ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1382 */     this.gunModel['ĕ'].setRotationPoint(22.0F, -46.25F, 5.0F);
/*      */     
/* 1384 */     this.gunModel['Ė'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1385 */     this.gunModel['Ė'].setRotationPoint(32.0F, -46.25F, 13.0F);
/*      */     
/* 1387 */     this.gunModel['ė'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1388 */     this.gunModel['ė'].setRotationPoint(32.0F, -46.25F, 5.0F);
/*      */     
/* 1390 */     this.gunModel['Ę'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1391 */     this.gunModel['Ę'].setRotationPoint(42.0F, -46.25F, 13.0F);
/*      */     
/* 1393 */     this.gunModel['ę'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1394 */     this.gunModel['ę'].setRotationPoint(42.0F, -46.25F, 5.0F);
/*      */     
/* 1396 */     this.gunModel['Ě'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1397 */     this.gunModel['Ě'].setRotationPoint(52.0F, -46.25F, 13.0F);
/*      */     
/* 1399 */     this.gunModel['ě'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1400 */     this.gunModel['ě'].setRotationPoint(52.0F, -46.25F, 5.0F);
/*      */     
/* 1402 */     this.gunModel['Ĝ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1403 */     this.gunModel['Ĝ'].setRotationPoint(62.0F, -46.25F, 13.0F);
/*      */     
/* 1405 */     this.gunModel['ĝ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1406 */     this.gunModel['ĝ'].setRotationPoint(62.0F, -46.25F, 5.0F);
/*      */     
/* 1408 */     this.gunModel['Ğ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1409 */     this.gunModel['Ğ'].setRotationPoint(62.0F, -48.25F, 5.0F);
/*      */     
/* 1411 */     this.gunModel['ğ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F);
/* 1412 */     this.gunModel['ğ'].setRotationPoint(60.0F, -48.25F, 5.0F);
/*      */     
/* 1414 */     this.gunModel['Ġ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1415 */     this.gunModel['Ġ'].setRotationPoint(66.0F, -48.25F, 5.0F);
/*      */     
/* 1417 */     this.gunModel['ġ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1418 */     this.gunModel['ġ'].setRotationPoint(62.0F, -48.25F, 10.0F);
/*      */     
/* 1420 */     this.gunModel['Ģ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1421 */     this.gunModel['Ģ'].setRotationPoint(60.0F, -48.25F, 10.0F);
/*      */     
/* 1423 */     this.gunModel['ģ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1424 */     this.gunModel['ģ'].setRotationPoint(66.0F, -47.25F, 8.0F);
/*      */     
/* 1426 */     this.gunModel['Ĥ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1427 */     this.gunModel['Ĥ'].setRotationPoint(66.0F, -48.25F, 10.0F);
/*      */     
/* 1429 */     this.gunModel['ĥ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1430 */     this.gunModel['ĥ'].setRotationPoint(61.0F, -47.25F, 8.0F);
/*      */     
/* 1432 */     this.gunModel['Ħ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F);
/* 1433 */     this.gunModel['Ħ'].setRotationPoint(61.0F, -47.25F, 5.0F);
/*      */     
/* 1435 */     this.gunModel['ħ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/* 1436 */     this.gunModel['ħ'].setRotationPoint(66.0F, -47.25F, 5.0F);
/*      */     
/* 1438 */     this.gunModel['Ĩ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1439 */     this.gunModel['Ĩ'].setRotationPoint(22.0F, -47.25F, 12.0F);
/*      */     
/* 1441 */     this.gunModel['ĩ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1442 */     this.gunModel['ĩ'].setRotationPoint(22.0F, -47.25F, 5.0F);
/*      */     
/* 1444 */     this.gunModel['Ī'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1445 */     this.gunModel['Ī'].setRotationPoint(32.0F, -47.25F, 12.0F);
/*      */     
/* 1447 */     this.gunModel['ī'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1448 */     this.gunModel['ī'].setRotationPoint(32.0F, -47.25F, 5.0F);
/*      */     
/* 1450 */     this.gunModel['Ĭ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1451 */     this.gunModel['Ĭ'].setRotationPoint(42.0F, -47.25F, 12.0F);
/*      */     
/* 1453 */     this.gunModel['ĭ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1454 */     this.gunModel['ĭ'].setRotationPoint(42.0F, -47.25F, 5.0F);
/*      */     
/* 1456 */     this.gunModel['Į'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1457 */     this.gunModel['Į'].setRotationPoint(52.0F, -47.25F, 12.0F);
/*      */     
/* 1459 */     this.gunModel['į'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1460 */     this.gunModel['į'].setRotationPoint(52.0F, -47.25F, 5.0F);
/*      */     
/* 1462 */     this.gunModel['İ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1463 */     this.gunModel['İ'].setRotationPoint(62.0F, -47.25F, 12.0F);
/*      */     
/* 1465 */     this.gunModel['ı'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1466 */     this.gunModel['ı'].setRotationPoint(62.0F, -47.25F, 5.0F);
/*      */     
/* 1468 */     this.gunModel['Ĳ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1469 */     this.gunModel['Ĳ'].setRotationPoint(46.0F, -48.25F, 5.0F);
/*      */     
/* 1471 */     this.gunModel['ĳ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1472 */     this.gunModel['ĳ'].setRotationPoint(46.0F, -47.25F, 8.0F);
/*      */     
/* 1474 */     this.gunModel['Ĵ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1475 */     this.gunModel['Ĵ'].setRotationPoint(46.0F, -48.25F, 10.0F);
/*      */     
/* 1477 */     this.gunModel['ĵ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1478 */     this.gunModel['ĵ'].setRotationPoint(46.0F, -44.25F, 14.5F);
/*      */     
/* 1480 */     this.gunModel['Ķ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1481 */     this.gunModel['Ķ'].setRotationPoint(46.0F, -44.25F, 1.5F);
/*      */     
/* 1483 */     this.gunModel['ķ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/* 1484 */     this.gunModel['ķ'].setRotationPoint(46.0F, -47.25F, 5.0F);
/*      */     
/* 1486 */     this.gunModel['ĸ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1487 */     this.gunModel['ĸ'].setRotationPoint(42.0F, -48.25F, 5.0F);
/*      */     
/* 1489 */     this.gunModel['Ĺ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1490 */     this.gunModel['Ĺ'].setRotationPoint(52.0F, -48.25F, 10.0F);
/*      */     
/* 1492 */     this.gunModel['ĺ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1493 */     this.gunModel['ĺ'].setRotationPoint(56.0F, -48.25F, 5.0F);
/*      */     
/* 1495 */     this.gunModel['Ļ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1496 */     this.gunModel['Ļ'].setRotationPoint(56.0F, -47.25F, 8.0F);
/*      */     
/* 1498 */     this.gunModel['ļ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1499 */     this.gunModel['ļ'].setRotationPoint(56.0F, -48.25F, 10.0F);
/*      */     
/* 1501 */     this.gunModel['Ľ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/* 1502 */     this.gunModel['Ľ'].setRotationPoint(56.0F, -47.25F, 5.0F);
/*      */     
/* 1504 */     this.gunModel['ľ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1505 */     this.gunModel['ľ'].setRotationPoint(52.0F, -48.25F, 5.0F);
/*      */     
/* 1507 */     this.gunModel['Ŀ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F);
/* 1508 */     this.gunModel['Ŀ'].setRotationPoint(20.0F, -48.25F, 5.0F);
/*      */     
/* 1510 */     this.gunModel['ŀ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1511 */     this.gunModel['ŀ'].setRotationPoint(20.0F, -48.25F, 10.0F);
/*      */     
/* 1513 */     this.gunModel['Ł'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1514 */     this.gunModel['Ł'].setRotationPoint(21.0F, -47.25F, 8.0F);
/*      */     
/* 1516 */     this.gunModel['ł'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F);
/* 1517 */     this.gunModel['ł'].setRotationPoint(31.0F, -47.25F, 5.0F);
/*      */     
/* 1519 */     this.gunModel['Ń'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1520 */     this.gunModel['Ń'].setRotationPoint(31.0F, -47.25F, 8.0F);
/*      */     
/* 1522 */     this.gunModel['ń'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F);
/* 1523 */     this.gunModel['ń'].setRotationPoint(30.0F, -48.25F, 5.0F);
/*      */     
/* 1525 */     this.gunModel['Ņ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1526 */     this.gunModel['Ņ'].setRotationPoint(30.0F, -48.25F, 10.0F);
/*      */     
/* 1528 */     this.gunModel['ņ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F);
/* 1529 */     this.gunModel['ņ'].setRotationPoint(21.0F, -47.25F, 5.0F);
/*      */     
/* 1531 */     this.gunModel['Ň'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F);
/* 1532 */     this.gunModel['Ň'].setRotationPoint(40.0F, -48.25F, 5.0F);
/*      */     
/* 1534 */     this.gunModel['ň'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1535 */     this.gunModel['ň'].setRotationPoint(40.0F, -48.25F, 10.0F);
/*      */     
/* 1537 */     this.gunModel['ŉ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1538 */     this.gunModel['ŉ'].setRotationPoint(41.0F, -47.25F, 8.0F);
/*      */     
/* 1540 */     this.gunModel['Ŋ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F);
/* 1541 */     this.gunModel['Ŋ'].setRotationPoint(51.0F, -47.25F, 5.0F);
/*      */     
/* 1543 */     this.gunModel['ŋ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1544 */     this.gunModel['ŋ'].setRotationPoint(51.0F, -47.25F, 8.0F);
/*      */     
/* 1546 */     this.gunModel['Ō'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F);
/* 1547 */     this.gunModel['Ō'].setRotationPoint(50.0F, -48.25F, 5.0F);
/*      */     
/* 1549 */     this.gunModel['ō'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1550 */     this.gunModel['ō'].setRotationPoint(50.0F, -48.25F, 10.0F);
/*      */     
/* 1552 */     this.gunModel['Ŏ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F);
/* 1553 */     this.gunModel['Ŏ'].setRotationPoint(41.0F, -47.25F, 5.0F);
/*      */     
/* 1555 */     this.gunModel['ŏ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1556 */     this.gunModel['ŏ'].setRotationPoint(36.0F, -48.25F, 5.0F);
/*      */     
/* 1558 */     this.gunModel['Ő'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1559 */     this.gunModel['Ő'].setRotationPoint(36.0F, -47.25F, 8.0F);
/*      */     
/* 1561 */     this.gunModel['ő'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1562 */     this.gunModel['ő'].setRotationPoint(36.0F, -48.25F, 10.0F);
/*      */     
/* 1564 */     this.gunModel['Œ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/* 1565 */     this.gunModel['Œ'].setRotationPoint(36.0F, -47.25F, 5.0F);
/*      */     
/* 1567 */     this.gunModel['œ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1568 */     this.gunModel['œ'].setRotationPoint(26.0F, -48.25F, 5.0F);
/*      */     
/* 1570 */     this.gunModel['Ŕ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1571 */     this.gunModel['Ŕ'].setRotationPoint(26.0F, -47.25F, 8.0F);
/*      */     
/* 1573 */     this.gunModel['ŕ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1574 */     this.gunModel['ŕ'].setRotationPoint(26.0F, -48.25F, 10.0F);
/*      */     
/* 1576 */     this.gunModel['Ŗ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F);
/* 1577 */     this.gunModel['Ŗ'].setRotationPoint(26.0F, -47.25F, 5.0F);
/*      */     
/* 1579 */     this.gunModel['ŗ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1580 */     this.gunModel['ŗ'].setRotationPoint(32.0F, -48.25F, 5.0F);
/*      */     
/* 1582 */     this.gunModel['Ř'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F);
/* 1583 */     this.gunModel['Ř'].setRotationPoint(22.0F, -48.25F, 5.0F);
/*      */     
/* 1585 */     this.gunModel['ř'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 9, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1586 */     this.gunModel['ř'].setRotationPoint(259.0F, -41.25F, 1.0F);
/*      */     
/* 1588 */     this.gunModel['Ś'].addShapeBox(122.0F, -17.0F, -10.0F, 20, 5, 18, 0.0F, 1.0F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, 1.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1589 */     this.gunModel['Ś'].setRotationPoint(243.0F, -46.25F, 1.0F);
/*      */     
/* 1591 */     this.gunModel['ś'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, -0.5F, 0.0F, -6.0F);
/* 1592 */     this.gunModel['ś'].setRotationPoint(259.0F, -32.25F, 1.0F);
/*      */     
/* 1594 */     this.gunModel['Ŝ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 9, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1595 */     this.gunModel['Ŝ'].setRotationPoint(266.0F, -41.25F, 1.0F);
/*      */     
/* 1597 */     this.gunModel['ŝ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F);
/* 1598 */     this.gunModel['ŝ'].setRotationPoint(266.0F, -32.25F, 1.0F);
/*      */     
/* 1600 */     this.gunModel['Ş'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 18, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1601 */     this.gunModel['Ş'].setRotationPoint(266.0F, -46.25F, 1.0F);
/*      */     
/* 1603 */     this.gunModel['ş'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 9, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1604 */     this.gunModel['ş'].setRotationPoint(273.0F, -41.25F, 1.0F);
/*      */     
/* 1606 */     this.gunModel['Š'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F);
/* 1607 */     this.gunModel['Š'].setRotationPoint(273.0F, -32.25F, 1.0F);
/*      */     
/* 1609 */     this.gunModel['š'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 18, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1610 */     this.gunModel['š'].setRotationPoint(273.0F, -46.25F, 1.0F);
/*      */     
/* 1612 */     this.gunModel['Ţ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 9, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1613 */     this.gunModel['Ţ'].setRotationPoint(281.0F, -41.25F, 1.0F);
/*      */     
/* 1615 */     this.gunModel['ţ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F);
/* 1616 */     this.gunModel['ţ'].setRotationPoint(281.0F, -32.25F, 1.0F);
/*      */     
/* 1618 */     this.gunModel['Ť'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 18, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1619 */     this.gunModel['Ť'].setRotationPoint(281.0F, -46.25F, 1.0F);
/*      */     
/* 1621 */     this.gunModel['ť'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1622 */     this.gunModel['ť'].setRotationPoint(263.0F, -41.25F, 3.5F);
/*      */     
/* 1624 */     this.gunModel['Ŧ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F);
/* 1625 */     this.gunModel['Ŧ'].setRotationPoint(263.0F, -32.25F, 3.5F);
/*      */     
/* 1627 */     this.gunModel['ŧ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 13, 0.0F, -1.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1628 */     this.gunModel['ŧ'].setRotationPoint(263.0F, -45.25F, 3.5F);
/*      */     
/* 1630 */     this.gunModel['Ũ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1631 */     this.gunModel['Ũ'].setRotationPoint(270.0F, -41.25F, 3.5F);
/*      */     
/* 1633 */     this.gunModel['ũ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.5F, 0.0F, -6.0F);
/* 1634 */     this.gunModel['ũ'].setRotationPoint(270.0F, -32.25F, 3.5F);
/*      */     
/* 1636 */     this.gunModel['Ū'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 13, 0.0F, -1.5F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.5F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1637 */     this.gunModel['Ū'].setRotationPoint(270.0F, -45.25F, 3.5F);
/*      */     
/* 1639 */     this.gunModel['ū'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1640 */     this.gunModel['ū'].setRotationPoint(280.0F, -41.25F, 4.0F);
/*      */     
/* 1642 */     this.gunModel['Ŭ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F);
/* 1643 */     this.gunModel['Ŭ'].setRotationPoint(280.0F, -32.25F, 4.0F);
/*      */     
/* 1645 */     this.gunModel['ŭ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 12, 0.0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1646 */     this.gunModel['ŭ'].setRotationPoint(280.0F, -45.25F, 4.0F);
/*      */     
/* 1648 */     this.gunModel['Ů'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1649 */     this.gunModel['Ů'].setRotationPoint(264.0F, -28.25F, 7.0F);
/*      */     
/* 1651 */     this.gunModel['ů'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1652 */     this.gunModel['ů'].setRotationPoint(271.0F, -28.25F, 7.0F);
/*      */     
/* 1654 */     this.gunModel['Ű'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1655 */     this.gunModel['Ű'].setRotationPoint(278.0F, -28.25F, 7.0F);
/*      */     
/* 1657 */     this.gunModel['ű'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1658 */     this.gunModel['ű'].setRotationPoint(278.0F, -46.25F, 7.0F);
/*      */     
/* 1660 */     this.gunModel['Ų'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1661 */     this.gunModel['Ų'].setRotationPoint(264.0F, -46.25F, 7.0F);
/*      */     
/* 1663 */     this.gunModel['ų'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1664 */     this.gunModel['ų'].setRotationPoint(271.0F, -46.25F, 7.0F);
/*      */     
/* 1666 */     this.gunModel['Ŵ'].addShapeBox(122.0F, -17.0F, -10.0F, 20, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1667 */     this.gunModel['Ŵ'].setRotationPoint(243.0F, -47.25F, 6.0F);
/*      */     
/* 1669 */     this.gunModel['ŵ'].addShapeBox(122.0F, -17.0F, -10.0F, 20, 1, 8, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1670 */     this.gunModel['ŵ'].setRotationPoint(243.0F, -48.25F, 6.0F);
/*      */     
/* 1672 */     this.gunModel['Ŷ'].addShapeBox(122.0F, -17.0F, -10.0F, 20, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1673 */     this.gunModel['Ŷ'].setRotationPoint(243.0F, -49.25F, 4.0F);
/*      */     
/* 1675 */     this.gunModel['ŷ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 5, 18, 0.0F, 0.0F, 3.25F, -3.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, -3.75F, 0.0F, -4.75F, -7.25F, -1.0F, -0.5F, -6.0F, -1.0F, -0.5F, -6.0F, 0.0F, -4.75F, -7.25F);
/* 1676 */     this.gunModel['ŷ'].setRotationPoint(238.0F, -31.75F, 1.0F);
/*      */     
/* 1678 */     this.gunModel['Ÿ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 10, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1679 */     this.gunModel['Ÿ'].setRotationPoint(276.5F, -41.75F, 4.0F);
/*      */     
/* 1681 */     this.gunModel['Ź'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F);
/* 1682 */     this.gunModel['Ź'].setRotationPoint(276.5F, -32.25F, 4.0F);
/*      */     
/* 1684 */     this.gunModel['ź'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 12, 0.0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1685 */     this.gunModel['ź'].setRotationPoint(276.5F, -45.25F, 4.0F);
/*      */     
/* 1687 */     this.gunModel['Ż'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1688 */     this.gunModel['Ż'].setRotationPoint(243.75F, -36.0F, 0.5F);
/*      */     
/* 1690 */     this.gunModel['ż'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1691 */     this.gunModel['ż'].setRotationPoint(243.75F, -37.0F, 0.5F);
/*      */     
/* 1693 */     this.gunModel['Ž'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1694 */     this.gunModel['Ž'].setRotationPoint(243.75F, -38.0F, 0.5F);
/*      */     
/* 1696 */     this.gunModel['ž'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1697 */     this.gunModel['ž'].setRotationPoint(254.75F, -36.0F, 0.5F);
/*      */     
/* 1699 */     this.gunModel['ſ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1700 */     this.gunModel['ſ'].setRotationPoint(254.75F, -37.0F, 0.5F);
/*      */     
/* 1702 */     this.gunModel['ƀ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 19, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1703 */     this.gunModel['ƀ'].setRotationPoint(254.75F, -38.0F, 0.5F);
/*      */     
/* 1705 */     this.gunModel['Ɓ'].addShapeBox(122.0F, -17.0F, -10.0F, 15, 9, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1706 */     this.gunModel['Ɓ'].setRotationPoint(243.0F, -41.25F, 1.0F);
/*      */     
/* 1708 */     this.gunModel['Ƃ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 1.0F, 0.0F, -6.0F);
/* 1709 */     this.gunModel['Ƃ'].setRotationPoint(243.0F, -32.25F, 1.0F);
/*      */     
/* 1711 */     this.gunModel['ƃ'].addShapeBox(122.0F, -17.0F, -10.0F, 12, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F);
/* 1712 */     this.gunModel['ƃ'].setRotationPoint(246.0F, -32.25F, 1.0F);
/*      */     
/* 1714 */     this.gunModel['Ƅ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 7, 18, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1715 */     this.gunModel['Ƅ'].setRotationPoint(258.5F, -41.25F, 1.0F);
/*      */     
/* 1717 */     this.gunModel['ƅ'].addShapeBox(122.0F, -17.0F, -10.0F, 118, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1718 */     this.gunModel['ƅ'].setRotationPoint(-30.0F, -18.75F, 15.5F);
/*      */     
/* 1720 */     this.gunModel['Ɔ'].addShapeBox(122.0F, -17.0F, -10.0F, 118, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1721 */     this.gunModel['Ɔ'].setRotationPoint(-30.0F, -18.75F, 1.5F);
/*      */     
/* 1723 */     this.gunModel['Ƈ'].addShapeBox(122.0F, -17.0F, -10.0F, 76, 19, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1724 */     this.gunModel['Ƈ'].setRotationPoint(-234.25F, -24.5F, 2.0F);
/*      */     
/* 1726 */     this.gunModel['ƈ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 19, 15, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1727 */     this.gunModel['ƈ'].setRotationPoint(-157.25F, -24.5F, 2.5F);
/*      */     
/* 1729 */     this.gunModel['Ɖ'].addShapeBox(122.0F, -17.0F, -10.0F, 23, 2, 16, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1730 */     this.gunModel['Ɖ'].setRotationPoint(-180.25F, -26.25F, 2.0F);
/*      */     
/* 1732 */     this.gunModel['Ɗ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 2, 15, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 1733 */     this.gunModel['Ɗ'].setRotationPoint(-157.25F, -5.5F, 2.5F);
/*      */     
/* 1735 */     this.gunModel['Ƌ'].addShapeBox(122.0F, -17.0F, -10.0F, 29, 3, 16, 0.0F, 0.0F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1736 */     this.gunModel['Ƌ'].setRotationPoint(-186.25F, -6.5F, 2.0F);
/*      */     
/* 1738 */     this.gunModel['ƌ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 2, 15, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1739 */     this.gunModel['ƌ'].setRotationPoint(-157.25F, -26.5F, 2.5F);
/*      */     
/* 1741 */     this.gunModel['ƍ'].addShapeBox(122.0F, -17.0F, -10.0F, 7, 3, 16, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 4.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 4.0F, -1.0F);
/* 1742 */     this.gunModel['ƍ'].setRotationPoint(-193.25F, -6.5F, 2.0F);
/*      */     
/* 1744 */     this.gunModel['Ǝ'].addShapeBox(122.0F, -17.0F, -10.0F, 6, 3, 16, 0.0F, 0.0F, -7.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -7.75F, 0.0F, 0.0F, 7.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 7.0F, -1.0F);
/* 1745 */     this.gunModel['Ǝ'].setRotationPoint(-199.25F, -2.5F, 2.0F);
/*      */     
/* 1747 */     this.gunModel['Ə'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 16, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1748 */     this.gunModel['Ə'].setRotationPoint(-237.25F, -26.25F, 2.0F);
/*      */     
/* 1750 */     this.gunModel['Ɛ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 16, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1751 */     this.gunModel['Ɛ'].setRotationPoint(-183.25F, -26.25F, 2.0F);
/*      */     
/* 1753 */     this.gunModel['Ƒ'].addShapeBox(122.0F, -17.0F, -10.0F, 27, 2, 16, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1754 */     this.gunModel['Ƒ'].setRotationPoint(-264.25F, -26.25F, 2.0F);
/*      */     
/* 1756 */     this.gunModel['ƒ'].addShapeBox(122.0F, -17.0F, -10.0F, 30, 8, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1757 */     this.gunModel['ƒ'].setRotationPoint(-264.25F, -24.5F, 2.0F);
/*      */     
/* 1759 */     this.gunModel['Ɠ'].addShapeBox(122.0F, -17.0F, -10.0F, 7, 3, 16, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 1.75F, 0.0F);
/* 1760 */     this.gunModel['Ɠ'].setRotationPoint(-193.25F, -6.5F, 2.0F);
/*      */     
/* 1762 */     this.gunModel['Ɣ'].addShapeBox(122.0F, -17.0F, -10.0F, 10, 48, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1763 */     this.gunModel['Ɣ'].setRotationPoint(-264.25F, -17.0F, 2.0F);
/*      */     
/* 1765 */     this.gunModel['ƕ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 56, 16, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1766 */     this.gunModel['ƕ'].setRotationPoint(-265.25F, -25.0F, 2.0F);
/*      */     
/* 1768 */     this.gunModel['Ɩ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1769 */     this.gunModel['Ɩ'].setRotationPoint(-218.25F, 30.75F, 2.0F);
/*      */     
/* 1771 */     this.gunModel['Ɨ'].addShapeBox(122.0F, -17.0F, -10.0F, 16, 37, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1772 */     this.gunModel['Ɨ'].setRotationPoint(-234.25F, -6.0F, 2.0F);
/*      */     
/* 1774 */     this.gunModel['Ƙ'].addShapeBox(122.0F, -17.0F, -10.0F, 20, 7, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1775 */     this.gunModel['Ƙ'].setRotationPoint(-254.25F, 24.0F, 2.0F);
/*      */     
/* 1777 */     this.gunModel['ƙ'].addShapeBox(122.0F, -17.0F, -10.0F, 46, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1778 */     this.gunModel['ƙ'].setRotationPoint(-264.25F, 30.75F, 2.0F);
/*      */     
/* 1780 */     this.gunModel['ƚ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 3, 16, 0.0F, -1.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1781 */     this.gunModel['ƚ'].setRotationPoint(-265.25F, -27.0F, 2.0F);
/*      */     
/* 1783 */     this.gunModel['ƛ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 19, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1784 */     this.gunModel['ƛ'].setRotationPoint(-236.25F, -6.0F, 2.0F);
/*      */     
/* 1786 */     this.gunModel['Ɯ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1787 */     this.gunModel['Ɯ'].setRotationPoint(-254.25F, -10.0F, 2.0F);
/*      */     
/* 1789 */     this.gunModel['Ɲ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F);
/* 1790 */     this.gunModel['Ɲ'].setRotationPoint(-254.25F, 13.0F, 2.0F);
/*      */     
/* 1792 */     this.gunModel['ƞ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1793 */     this.gunModel['ƞ'].setRotationPoint(-253.25F, -14.0F, 2.0F);
/*      */     
/* 1795 */     this.gunModel['Ɵ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F);
/* 1796 */     this.gunModel['Ɵ'].setRotationPoint(-253.25F, 17.0F, 2.0F);
/*      */     
/* 1798 */     this.gunModel['Ơ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F);
/* 1799 */     this.gunModel['Ơ'].setRotationPoint(-237.25F, 17.0F, 2.0F);
/*      */     
/* 1801 */     this.gunModel['ơ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1802 */     this.gunModel['ơ'].setRotationPoint(-236.25F, -10.0F, 2.0F);
/*      */     
/* 1804 */     this.gunModel['Ƣ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
/* 1805 */     this.gunModel['Ƣ'].setRotationPoint(-236.25F, 13.0F, 2.0F);
/*      */     
/* 1807 */     this.gunModel['ƣ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1808 */     this.gunModel['ƣ'].setRotationPoint(-237.25F, -14.0F, 2.0F);
/*      */     
/* 1810 */     this.gunModel['Ƥ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 19, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1811 */     this.gunModel['Ƥ'].setRotationPoint(-254.25F, -6.0F, 2.0F);
/*      */     
/* 1813 */     this.gunModel['ƥ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1814 */     this.gunModel['ƥ'].setRotationPoint(-240.75F, -15.5F, 2.0F);
/*      */     
/* 1816 */     this.gunModel['Ʀ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1817 */     this.gunModel['Ʀ'].setRotationPoint(-249.75F, -15.5F, 2.0F);
/*      */     
/* 1819 */     this.gunModel['Ƨ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F);
/* 1820 */     this.gunModel['Ƨ'].setRotationPoint(-240.75F, 20.5F, 2.0F);
/*      */     
/* 1822 */     this.gunModel['ƨ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.5F, -0.5F, 0.0F, 3.5F, -0.5F, -2.0F, 3.5F, -0.5F, -2.0F, -3.5F, -0.5F, 0.0F);
/* 1823 */     this.gunModel['ƨ'].setRotationPoint(-249.75F, 20.5F, 2.0F);
/*      */     
/* 1825 */     this.gunModel['Ʃ'].addShapeBox(122.0F, -17.0F, -10.0F, 9, 1, 16, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1826 */     this.gunModel['Ʃ'].setRotationPoint(-253.75F, 21.5F, 2.0F);
/*      */     
/* 1828 */     this.gunModel['ƪ'].addShapeBox(122.0F, -17.0F, -10.0F, 54, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1829 */     this.gunModel['ƪ'].setRotationPoint(35.0F, -42.25F, 20.5F);
/*      */     
/* 1831 */     this.gunModel['ƫ'].addShapeBox(122.0F, -17.0F, -10.0F, 54, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1832 */     this.gunModel['ƫ'].setRotationPoint(35.0F, -42.25F, -3.5F);
/*      */     
/* 1834 */     this.gunModel['Ƭ'].addShapeBox(122.0F, -17.0F, -10.0F, 54, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1835 */     this.gunModel['Ƭ'].setRotationPoint(35.0F, -33.25F, 20.5F);
/*      */     
/* 1837 */     this.gunModel['ƭ'].addShapeBox(122.0F, -17.0F, -10.0F, 54, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1838 */     this.gunModel['ƭ'].setRotationPoint(35.0F, -33.25F, -3.5F);
/*      */     
/* 1840 */     this.gunModel['Ʈ'].addShapeBox(122.0F, -17.0F, -10.0F, 6, 7, 16, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 4.75F, 0.0F);
/* 1841 */     this.gunModel['Ʈ'].setRotationPoint(-199.25F, -6.5F, 2.0F);
/*      */     
/* 1843 */     this.gunModel['Ư'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 2, 16, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, -1.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F);
/* 1844 */     this.gunModel['Ư'].setRotationPoint(-265.25F, 30.5F, 2.0F);
/*      */     
/* 1846 */     this.gunModel['ư'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1847 */     this.gunModel['ư'].setRotationPoint(-216.25F, 31.75F, 2.0F);
/*      */     
/* 1849 */     this.gunModel['Ʊ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 16, 0.0F, 0.0F, -9.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -9.75F, 0.0F, 0.0F, 9.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 9.0F, -1.0F);
/* 1850 */     this.gunModel['Ʊ'].setRotationPoint(-203.25F, 4.5F, 2.0F);
/*      */     
/* 1852 */     this.gunModel['Ʋ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 14, 16, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 6.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 6.75F, 0.0F);
/* 1853 */     this.gunModel['Ʋ'].setRotationPoint(-203.25F, -6.5F, 2.0F);
/*      */     
/* 1855 */     this.gunModel['Ƴ'].addShapeBox(122.0F, -17.0F, -10.0F, 15, 20, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1856 */     this.gunModel['Ƴ'].setRotationPoint(-218.25F, -6.0F, 2.0F);
/*      */     
/* 1858 */     this.gunModel['ƴ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 12, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1859 */     this.gunModel['ƴ'].setRotationPoint(-205.25F, 16.5F, 2.0F);
/*      */     
/* 1861 */     this.gunModel['Ƶ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F);
/* 1862 */     this.gunModel['Ƶ'].setRotationPoint(-205.25F, 28.5F, 2.0F);
/*      */     
/* 1864 */     this.gunModel['ƶ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.25F, 0.0F, 3.0F, 0.25F, -1.0F, 3.0F, 0.25F, -1.0F, -3.0F, 0.25F, 0.0F);
/* 1865 */     this.gunModel['ƶ'].setRotationPoint(-203.25F, 32.5F, 2.0F);
/*      */     
/* 1867 */     this.gunModel['Ʒ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.45F, 0.0F, 0.25F, -0.45F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1868 */     this.gunModel['Ʒ'].setRotationPoint(-205.25F, 15.5F, 2.0F);
/*      */     
/* 1870 */     this.gunModel['Ƹ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, -1.0F, 0.0F, 0.0F);
/* 1871 */     this.gunModel['Ƹ'].setRotationPoint(-205.25F, 14.25F, 2.0F);
/*      */     
/* 1873 */     this.gunModel['ƹ'].addShapeBox(122.0F, -17.0F, -10.0F, 15, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1874 */     this.gunModel['ƹ'].setRotationPoint(-218.25F, 14.25F, 2.0F);
/*      */     
/* 1876 */     this.gunModel['ƺ'].addShapeBox(122.0F, -17.0F, -10.0F, 15, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1877 */     this.gunModel['ƺ'].setRotationPoint(-218.25F, 15.25F, 2.0F);
/*      */     
/* 1879 */     this.gunModel['ƻ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 12, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1880 */     this.gunModel['ƻ'].setRotationPoint(-218.25F, 16.25F, 2.0F);
/*      */     
/* 1882 */     this.gunModel['Ƽ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 2, 16, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 1.15F, 0.5F, 0.0F, 1.15F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1883 */     this.gunModel['Ƽ'].setRotationPoint(-218.25F, 28.25F, 2.0F);
/*      */     
/* 1885 */     this.gunModel['ƽ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, 1.15F, -0.5F, 0.0F, 1.15F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 1.65F, 0.5F, 0.0F, 1.65F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F);
/* 1886 */     this.gunModel['ƽ'].setRotationPoint(-218.25F, 30.25F, 2.0F);
/*      */     
/* 1888 */     this.gunModel['ƾ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 1, 16, 0.0F, -1.0F, -0.5F, 0.0F, 0.65F, -0.5F, 0.0F, 0.65F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F);
/* 1889 */     this.gunModel['ƾ'].setRotationPoint(-217.25F, 31.25F, 2.0F);
/*      */     
/* 1891 */     this.gunModel['ƿ'].addShapeBox(122.0F, -17.0F, -10.0F, 12, 2, 16, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, 3.1F, 0.25F, 0.0F, 3.1F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F);
/* 1892 */     this.gunModel['ƿ'].setRotationPoint(-216.25F, 32.5F, 2.0F);
/*      */     
/* 1894 */     this.gunModel['ǀ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 16, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F);
/* 1895 */     this.gunModel['ǀ'].setRotationPoint(-214.25F, 35.75F, 2.0F);
/*      */     
/* 1897 */     this.gunModel['ǁ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1898 */     this.gunModel['ǁ'].setRotationPoint(-214.25F, 34.75F, 2.0F);
/*      */     
/* 1900 */     this.gunModel['ǂ'].addShapeBox(122.0F, -17.0F, -10.0F, 14, 1, 16, 0.0F, 1.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1901 */     this.gunModel['ǂ'].setRotationPoint(-213.25F, 34.75F, 2.0F);
/*      */     
/* 1903 */     this.gunModel['ǃ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F);
/* 1904 */     this.gunModel['ǃ'].setRotationPoint(-200.25F, 38.75F, 2.0F);
/*      */     
/* 1906 */     this.gunModel['Ǆ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1907 */     this.gunModel['Ǆ'].setRotationPoint(-213.25F, 35.75F, 2.0F);
/*      */     
/* 1909 */     this.gunModel['ǅ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 1, 16, 0.0F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1910 */     this.gunModel['ǅ'].setRotationPoint(-212.25F, 38.75F, 2.0F);
/*      */     
/* 1912 */     this.gunModel['ǆ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F);
/* 1913 */     this.gunModel['ǆ'].setRotationPoint(-200.25F, 35.75F, 2.0F);
/*      */     
/* 1915 */     this.gunModel['Ǉ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 16, 0.0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F);
/* 1916 */     this.gunModel['Ǉ'].setRotationPoint(-212.5F, 39.75F, 2.0F);
/*      */     
/* 1918 */     this.gunModel['ǈ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, 0.0F);
/* 1919 */     this.gunModel['ǈ'].setRotationPoint(-201.75F, 39.75F, 2.0F);
/*      */     
/* 1921 */     this.gunModel['ǉ'].addShapeBox(122.0F, -17.0F, -10.0F, 8, 1, 16, 0.0F, 2.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1922 */     this.gunModel['ǉ'].setRotationPoint(-209.75F, 39.75F, 2.0F);
/*      */     
/* 1924 */     this.gunModel['Ǌ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1925 */     this.gunModel['Ǌ'].setRotationPoint(-254.25F, 13.0F, 2.0F);
/*      */     
/* 1927 */     this.gunModel['ǋ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1928 */     this.gunModel['ǋ'].setRotationPoint(-255.25F, 17.0F, 2.0F);
/*      */     
/* 1930 */     this.gunModel['ǌ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 2, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1931 */     this.gunModel['ǌ'].setRotationPoint(-254.75F, 20.5F, 2.0F);
/*      */     
/* 1933 */     this.gunModel['Ǎ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1934 */     this.gunModel['Ǎ'].setRotationPoint(-244.25F, -16.0F, 2.0F);
/*      */     
/* 1936 */     this.gunModel['ǎ'].addShapeBox(122.0F, -17.0F, -10.0F, 9, 1, 16, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1937 */     this.gunModel['ǎ'].setRotationPoint(-243.75F, 21.5F, 2.0F);
/*      */     
/* 1939 */     this.gunModel['Ǐ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F);
/* 1940 */     this.gunModel['Ǐ'].setRotationPoint(-238.75F, 20.5F, 2.0F);
/*      */     
/* 1942 */     this.gunModel['ǐ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F);
/* 1943 */     this.gunModel['ǐ'].setRotationPoint(-235.25F, 17.0F, 2.0F);
/*      */     
/* 1945 */     this.gunModel['Ǒ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1946 */     this.gunModel['Ǒ'].setRotationPoint(-235.25F, 13.0F, 2.0F);
/*      */     
/* 1948 */     this.gunModel['ǒ'].addShapeBox(122.0F, -17.0F, -10.0F, 19, 2, 16, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1949 */     this.gunModel['ǒ'].setRotationPoint(-253.75F, 22.25F, 2.0F);
/*      */     
/* 1951 */     this.gunModel['Ǔ'].addShapeBox(122.0F, -17.0F, -10.0F, 19, 1, 16, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1952 */     this.gunModel['Ǔ'].setRotationPoint(-253.75F, -17.0F, 2.0F);
/*      */     
/* 1954 */     this.gunModel['ǔ'].addShapeBox(122.0F, -17.0F, -10.0F, 9, 1, 16, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1955 */     this.gunModel['ǔ'].setRotationPoint(-253.75F, -15.5F, 2.0F);
/*      */     
/* 1957 */     this.gunModel['Ǖ'].addShapeBox(122.0F, -17.0F, -10.0F, 9, 1, 16, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F);
/* 1958 */     this.gunModel['Ǖ'].setRotationPoint(-243.75F, -15.5F, 2.0F);
/*      */     
/* 1960 */     this.gunModel['ǖ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1961 */     this.gunModel['ǖ'].setRotationPoint(-254.25F, -10.0F, 2.0F);
/*      */     
/* 1963 */     this.gunModel['Ǘ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, -1.0F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1964 */     this.gunModel['Ǘ'].setRotationPoint(-255.25F, -14.0F, 2.0F);
/*      */     
/* 1966 */     this.gunModel['ǘ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 2, 16, 0.0F, -0.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1967 */     this.gunModel['ǘ'].setRotationPoint(-254.75F, -15.5F, 2.0F);
/*      */     
/* 1969 */     this.gunModel['Ǚ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 2, 16, 0.0F, 3.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1970 */     this.gunModel['Ǚ'].setRotationPoint(-238.75F, -15.5F, 2.0F);
/*      */     
/* 1972 */     this.gunModel['ǚ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 16, 0.0F, 3.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 3.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1973 */     this.gunModel['ǚ'].setRotationPoint(-235.25F, -14.0F, 2.0F);
/*      */     
/* 1975 */     this.gunModel['Ǜ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1976 */     this.gunModel['Ǜ'].setRotationPoint(-235.25F, -10.0F, 2.0F);
/*      */     
/* 1978 */     this.gunModel['ǜ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1979 */     this.gunModel['ǜ'].setRotationPoint(-246.25F, -16.0F, 2.0F);
/*      */     
/* 1981 */     this.gunModel['ǝ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1982 */     this.gunModel['ǝ'].setRotationPoint(-244.25F, 22.0F, 2.0F);
/*      */     
/* 1984 */     this.gunModel['Ǟ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1985 */     this.gunModel['Ǟ'].setRotationPoint(-246.25F, 22.0F, 2.0F);
/*      */     
/* 1987 */     this.gunModel['ǟ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 48, 10, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1988 */     this.gunModel['ǟ'].setRotationPoint(-268.25F, -21.0F, 4.0F);
/*      */     
/* 1990 */     this.gunModel['Ǡ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1991 */     this.gunModel['Ǡ'].setRotationPoint(-268.25F, 26.75F, 4.0F);
/*      */     
/* 1993 */     this.gunModel['ǡ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1994 */     this.gunModel['ǡ'].setRotationPoint(-268.25F, -22.75F, 4.0F);
/*      */     
/* 1996 */     this.gunModel['Ǣ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 59, 16, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 3.75F, 0.0F);
/* 1997 */     this.gunModel['Ǣ'].setRotationPoint(-281.25F, -27.0F, 2.0F);
/*      */     
/* 1999 */     this.gunModel['ǣ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F);
/* 2000 */     this.gunModel['ǣ'].setRotationPoint(-285.25F, 34.0F, 2.0F);
/*      */     
/* 2002 */     this.gunModel['Ǥ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 12, 16, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2003 */     this.gunModel['Ǥ'].setRotationPoint(-284.25F, 15.0F, 2.0F);
/*      */     
/* 2005 */     this.gunModel['ǥ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 12, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2006 */     this.gunModel['ǥ'].setRotationPoint(-284.25F, -18.0F, 2.0F);
/*      */     
/* 2008 */     this.gunModel['Ǧ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 12, 16, 0.0F, 1.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2009 */     this.gunModel['Ǧ'].setRotationPoint(-285.25F, -30.0F, 2.0F);
/*      */     
/* 2011 */     this.gunModel['ǧ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 7, 16, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2012 */     this.gunModel['ǧ'].setRotationPoint(-285.25F, 27.0F, 2.0F);
/*      */     
/* 2014 */     this.gunModel['Ǩ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 21, 16, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2015 */     this.gunModel['Ǩ'].setRotationPoint(-284.25F, -6.0F, 2.0F);
/*      */     
/* 2017 */     this.gunModel['ǩ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 3, 16, 0.0F, 0.0F, 2.5F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, 2.5F, -3.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 2018 */     this.gunModel['ǩ'].setRotationPoint(-281.25F, -31.0F, 2.0F);
/*      */     
/* 2020 */     this.gunModel['Ǫ'].addShapeBox(122.0F, -17.0F, -10.0F, 6, 3, 16, 0.0F, -1.5F, 0.75F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, -1.5F, 0.75F, -3.0F, -0.5F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 2021 */     this.gunModel['Ǫ'].setRotationPoint(-287.25F, -33.75F, 2.0F);
/*      */     
/* 2023 */     this.gunModel['ǫ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 5, 16, 0.0F, -4.0F, 0.0F, -4.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2024 */     this.gunModel['ǫ'].setRotationPoint(-145.25F, 9.5F, 2.0F);
/*      */     
/* 2026 */     this.gunModel['Ǭ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 16, 0.0F, -1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2027 */     this.gunModel['Ǭ'].setRotationPoint(-141.25F, 6.5F, 2.0F);
/*      */     
/* 2029 */     this.gunModel['ǭ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 16, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2030 */     this.gunModel['ǭ'].setRotationPoint(-140.25F, 2.5F, 2.0F);
/*      */     
/* 2032 */     this.gunModel['Ǯ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F);
/* 2033 */     this.gunModel['Ǯ'].setRotationPoint(-141.25F, -0.5F, 2.0F);
/*      */     
/* 2035 */     this.gunModel['ǯ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 16, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F);
/* 2036 */     this.gunModel['ǯ'].setRotationPoint(-145.25F, -3.5F, 2.0F);
/*      */     
/* 2038 */     this.gunModel['ǰ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 16, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -4.0F);
/* 2039 */     this.gunModel['ǰ'].setRotationPoint(-145.25F, 14.5F, 2.0F);
/*      */     
/* 2041 */     this.gunModel['Ǳ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 16, 0.0F, -2.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2042 */     this.gunModel['Ǳ'].setRotationPoint(-150.25F, 18.5F, 2.0F);
/*      */     
/* 2044 */     this.gunModel['ǲ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 7, 16, 0.0F, -2.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2045 */     this.gunModel['ǲ'].setRotationPoint(-152.25F, 22.5F, 2.0F);
/*      */     
/* 2047 */     this.gunModel['ǳ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 7, 16, 0.0F, -2.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2048 */     this.gunModel['ǳ'].setRotationPoint(-154.25F, 29.5F, 2.0F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2053 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 393, 409, this.textureX, this.textureY);
/* 2054 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 505, 409, this.textureX, this.textureY);
/* 2055 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 777, 409, this.textureX, this.textureY);
/* 2056 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 833, 409, this.textureX, this.textureY);
/* 2057 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 177, 417, this.textureX, this.textureY);
/* 2058 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 89, 425, this.textureX, this.textureY);
/* 2059 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 425, 425, this.textureX, this.textureY);
/* 2060 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 913, 417, this.textureX, this.textureY);
/* 2061 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 537, 425, this.textureX, this.textureY);
/* 2062 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 985, 409, this.textureX, this.textureY);
/* 2063 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 25, 425, this.textureX, this.textureY);
/* 2064 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 353, 425, this.textureX, this.textureY);
/* 2065 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 609, 425, this.textureX, this.textureY);
/* 2066 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 649, 425, this.textureX, this.textureY);
/* 2067 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 689, 425, this.textureX, this.textureY);
/* 2068 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 713, 433, this.textureX, this.textureY);
/* 2069 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 785, 433, this.textureX, this.textureY);
/* 2070 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 857, 433, this.textureX, this.textureY);
/* 2071 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 945, 433, this.textureX, this.textureY);
/* 2072 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 145, 441, this.textureX, this.textureY);
/* 2073 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 1, 449, this.textureX, this.textureY);
/* 2074 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 81, 449, this.textureX, this.textureY);
/* 2075 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 489, 433, this.textureX, this.textureY);
/* 2076 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 217, 441, this.textureX, this.textureY);
/* 2077 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 385, 441, this.textureX, this.textureY);
/* 2078 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 409, 449, this.textureX, this.textureY);
/* 2079 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 913, 441, this.textureX, this.textureY);
/* 2080 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 353, 449, this.textureX, this.textureY);
/* 2081 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 529, 449, this.textureX, this.textureY);
/* 2082 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 601, 449, this.textureX, this.textureY);
/* 2083 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 641, 449, this.textureX, this.textureY);
/* 2084 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 505, 273, this.textureX, this.textureY);
/* 2085 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 577, 273, this.textureX, this.textureY);
/* 2086 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 217, 161, this.textureX, this.textureY);
/* 2087 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 665, 449, this.textureX, this.textureY);
/* 2088 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 625, 273, this.textureX, this.textureY);
/* 2089 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 497, 233, this.textureX, this.textureY);
/* 2090 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 929, 305, this.textureX, this.textureY);
/* 2091 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 689, 273, this.textureX, this.textureY);
/* 2092 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 929, 273, this.textureX, this.textureY);
/* 2093 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 297, 289, this.textureX, this.textureY);
/* 2094 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 865, 289, this.textureX, this.textureY);
/* 2095 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 33, 297, this.textureX, this.textureY);
/* 2096 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 129, 129, this.textureX, this.textureY);
/* 2097 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 169, 129, this.textureX, this.textureY);
/* 2098 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 193, 129, this.textureX, this.textureY);
/* 2099 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 817, 129, this.textureX, this.textureY);
/* 2100 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/* 2101 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 681, 145, this.textureX, this.textureY);
/* 2102 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 457, 457, this.textureX, this.textureY);
/* 2103 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 721, 457, this.textureX, this.textureY);
/* 2104 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 785, 457, this.textureX, this.textureY);
/* 2105 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 153, 465, this.textureX, this.textureY);
/* 2106 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 849, 465, this.textureX, this.textureY);
/* 2107 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 1, 473, this.textureX, this.textureY);
/* 2108 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 1001, 265, this.textureX, this.textureY);
/* 2109 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 73, 297, this.textureX, this.textureY);
/* 2110 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 105, 473, this.textureX, this.textureY);
/* 2111 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 345, 177, this.textureX, this.textureY);
/* 2112 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 433, 201, this.textureX, this.textureY);
/* 2113 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/* 2114 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/* 2115 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 417, 481, this.textureX, this.textureY);
/* 2116 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 417, 489, this.textureX, this.textureY);
/* 2117 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/* 2118 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 729, 9, this.textureX, this.textureY);
/* 2119 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 185, 481, this.textureX, this.textureY);
/* 2120 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 721, 497, this.textureX, this.textureY);
/* 2121 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 801, 497, this.textureX, this.textureY);
/* 2122 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/* 2123 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 721, 473, this.textureX, this.textureY);
/* 2124 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 617, 473, this.textureX, this.textureY);
/* 2125 */     this.gunModel['ȼ'] = new ModelRendererTurbo(this, 553, 249, this.textureX, this.textureY);
/* 2126 */     this.gunModel['Ƚ'] = new ModelRendererTurbo(this, 225, 257, this.textureX, this.textureY);
/* 2127 */     this.gunModel['Ⱦ'] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
/* 2128 */     this.gunModel['ȿ'] = new ModelRendererTurbo(this, 897, 481, this.textureX, this.textureY);
/* 2129 */     this.gunModel['ɀ'] = new ModelRendererTurbo(this, 321, 505, this.textureX, this.textureY);
/* 2130 */     this.gunModel['Ɂ'] = new ModelRendererTurbo(this, 593, 497, this.textureX, this.textureY);
/* 2131 */     this.gunModel['ɂ'] = new ModelRendererTurbo(this, 865, 497, this.textureX, this.textureY);
/* 2132 */     this.gunModel['Ƀ'] = new ModelRendererTurbo(this, 785, 273, this.textureX, this.textureY);
/* 2133 */     this.gunModel['Ʉ'] = new ModelRendererTurbo(this, 945, 273, this.textureX, this.textureY);
/* 2134 */     this.gunModel['Ʌ'] = new ModelRendererTurbo(this, 529, 153, this.textureX, this.textureY);
/* 2135 */     this.gunModel['Ɇ'] = new ModelRendererTurbo(this, 729, 145, this.textureX, this.textureY);
/* 2136 */     this.gunModel['ɇ'] = new ModelRendererTurbo(this, 865, 145, this.textureX, this.textureY);
/* 2137 */     this.gunModel['Ɉ'] = new ModelRendererTurbo(this, 953, 57, this.textureX, this.textureY);
/* 2138 */     this.gunModel['ɉ'] = new ModelRendererTurbo(this, 1, 513, this.textureX, this.textureY);
/* 2139 */     this.gunModel['Ɋ'] = new ModelRendererTurbo(this, 689, 25, this.textureX, this.textureY);
/* 2140 */     this.gunModel['ɋ'] = new ModelRendererTurbo(this, 953, 25, this.textureX, this.textureY);
/* 2141 */     this.gunModel['Ɍ'] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/* 2142 */     this.gunModel['ɍ'] = new ModelRendererTurbo(this, 785, 9, this.textureX, this.textureY);
/* 2143 */     this.gunModel['Ɏ'] = new ModelRendererTurbo(this, 825, 9, this.textureX, this.textureY);
/* 2144 */     this.gunModel['ɏ'] = new ModelRendererTurbo(this, 585, 241, this.textureX, this.textureY);
/* 2145 */     this.gunModel['ɐ'] = new ModelRendererTurbo(this, 1001, 289, this.textureX, this.textureY);
/* 2146 */     this.gunModel['ɑ'] = new ModelRendererTurbo(this, 401, 513, this.textureX, this.textureY);
/* 2147 */     this.gunModel['ɒ'] = new ModelRendererTurbo(this, 673, 513, this.textureX, this.textureY);
/* 2148 */     this.gunModel['ɓ'] = new ModelRendererTurbo(this, 161, 521, this.textureX, this.textureY);
/* 2149 */     this.gunModel['ɔ'] = new ModelRendererTurbo(this, 417, 521, this.textureX, this.textureY);
/* 2150 */     this.gunModel['ɕ'] = new ModelRendererTurbo(this, 553, 521, this.textureX, this.textureY);
/* 2151 */     this.gunModel['ɖ'] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/* 2152 */     this.gunModel['ɗ'] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 2153 */     this.gunModel['ɘ'] = new ModelRendererTurbo(this, 657, 521, this.textureX, this.textureY);
/* 2154 */     this.gunModel['ə'] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/* 2155 */     this.gunModel['ɚ'] = new ModelRendererTurbo(this, 681, 105, this.textureX, this.textureY);
/* 2156 */     this.gunModel['ɛ'] = new ModelRendererTurbo(this, 761, 521, this.textureX, this.textureY);
/* 2157 */     this.gunModel['ɜ'] = new ModelRendererTurbo(this, 1, 529, this.textureX, this.textureY);
/* 2158 */     this.gunModel['ɝ'] = new ModelRendererTurbo(this, 137, 529, this.textureX, this.textureY);
/* 2159 */     this.gunModel['ɞ'] = new ModelRendererTurbo(this, 273, 529, this.textureX, this.textureY);
/* 2160 */     this.gunModel['ɟ'] = new ModelRendererTurbo(this, 657, 529, this.textureX, this.textureY);
/* 2161 */     this.gunModel['ɠ'] = new ModelRendererTurbo(this, 417, 529, this.textureX, this.textureY);
/* 2162 */     this.gunModel['ɡ'] = new ModelRendererTurbo(this, 177, 321, this.textureX, this.textureY);
/* 2163 */     this.gunModel['ɢ'] = new ModelRendererTurbo(this, 65, 441, this.textureX, this.textureY);
/* 2164 */     this.gunModel['ɣ'] = new ModelRendererTurbo(this, 305, 473, this.textureX, this.textureY);
/* 2165 */     this.gunModel['ɤ'] = new ModelRendererTurbo(this, 993, 497, this.textureX, this.textureY);
/* 2166 */     this.gunModel['ɥ'] = new ModelRendererTurbo(this, 961, 505, this.textureX, this.textureY);
/* 2167 */     this.gunModel['ɦ'] = new ModelRendererTurbo(this, 905, 513, this.textureX, this.textureY);
/* 2168 */     this.gunModel['ɧ'] = new ModelRendererTurbo(this, 201, 297, this.textureX, this.textureY);
/* 2169 */     this.gunModel['ɨ'] = new ModelRendererTurbo(this, 473, 297, this.textureX, this.textureY);
/* 2170 */     this.gunModel['ɩ'] = new ModelRendererTurbo(this, 617, 297, this.textureX, this.textureY);
/* 2171 */     this.gunModel['ɪ'] = new ModelRendererTurbo(this, 169, 161, this.textureX, this.textureY);
/* 2172 */     this.gunModel['ɫ'] = new ModelRendererTurbo(this, 201, 161, this.textureX, this.textureY);
/* 2173 */     this.gunModel['ɬ'] = new ModelRendererTurbo(this, 377, 161, this.textureX, this.textureY);
/* 2174 */     this.gunModel['ɭ'] = new ModelRendererTurbo(this, 953, 9, this.textureX, this.textureY);
/* 2175 */     this.gunModel['ɮ'] = new ModelRendererTurbo(this, 977, 9, this.textureX, this.textureY);
/* 2176 */     this.gunModel['ɯ'] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/* 2177 */     this.gunModel['ɰ'] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 2178 */     this.gunModel['ɱ'] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 2179 */     this.gunModel['ɲ'] = new ModelRendererTurbo(this, 513, 17, this.textureX, this.textureY);
/* 2180 */     this.gunModel['ɳ'] = new ModelRendererTurbo(this, 665, 241, this.textureX, this.textureY);
/* 2181 */     this.gunModel['ɴ'] = new ModelRendererTurbo(this, 889, 241, this.textureX, this.textureY);
/* 2182 */     this.gunModel['ɵ'] = new ModelRendererTurbo(this, 937, 241, this.textureX, this.textureY);
/* 2183 */     this.gunModel['ɶ'] = new ModelRendererTurbo(this, 1, 433, this.textureX, this.textureY);
/* 2184 */     this.gunModel['ɷ'] = new ModelRendererTurbo(this, 137, 481, this.textureX, this.textureY);
/* 2185 */     this.gunModel['ɸ'] = new ModelRendererTurbo(this, 185, 505, this.textureX, this.textureY);
/* 2186 */     this.gunModel['ɹ'] = new ModelRendererTurbo(this, 793, 153, this.textureX, this.textureY);
/* 2187 */     this.gunModel['ɺ'] = new ModelRendererTurbo(this, 889, 153, this.textureX, this.textureY);
/* 2188 */     this.gunModel['ɻ'] = new ModelRendererTurbo(this, 105, 161, this.textureX, this.textureY);
/* 2189 */     this.gunModel['ɼ'] = new ModelRendererTurbo(this, 841, 161, this.textureX, this.textureY);
/* 2190 */     this.gunModel['ɽ'] = new ModelRendererTurbo(this, 241, 169, this.textureX, this.textureY);
/* 2191 */     this.gunModel['ɾ'] = new ModelRendererTurbo(this, 953, 169, this.textureX, this.textureY);
/* 2192 */     this.gunModel['ɿ'] = new ModelRendererTurbo(this, 625, 185, this.textureX, this.textureY);
/* 2193 */     this.gunModel['ʀ'] = new ModelRendererTurbo(this, 921, 185, this.textureX, this.textureY);
/* 2194 */     this.gunModel['ʁ'] = new ModelRendererTurbo(this, 465, 201, this.textureX, this.textureY);
/* 2195 */     this.gunModel['ʂ'] = new ModelRendererTurbo(this, 489, 201, this.textureX, this.textureY);
/* 2196 */     this.gunModel['ʃ'] = new ModelRendererTurbo(this, 993, 201, this.textureX, this.textureY);
/* 2197 */     this.gunModel['ʄ'] = new ModelRendererTurbo(this, 241, 217, this.textureX, this.textureY);
/* 2198 */     this.gunModel['ʅ'] = new ModelRendererTurbo(this, 929, 521, this.textureX, this.textureY);
/* 2199 */     this.gunModel['ʆ'] = new ModelRendererTurbo(this, 969, 521, this.textureX, this.textureY);
/* 2200 */     this.gunModel['ʇ'] = new ModelRendererTurbo(this, 793, 529, this.textureX, this.textureY);
/* 2201 */     this.gunModel['ʈ'] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/* 2202 */     this.gunModel['ʉ'] = new ModelRendererTurbo(this, 657, 297, this.textureX, this.textureY);
/* 2203 */     this.gunModel['ʊ'] = new ModelRendererTurbo(this, 545, 305, this.textureX, this.textureY);
/* 2204 */     this.gunModel['ʋ'] = new ModelRendererTurbo(this, 257, 313, this.textureX, this.textureY);
/* 2205 */     this.gunModel['ʌ'] = new ModelRendererTurbo(this, 337, 313, this.textureX, this.textureY);
/* 2206 */     this.gunModel['ʍ'] = new ModelRendererTurbo(this, 377, 313, this.textureX, this.textureY);
/* 2207 */     this.gunModel['ʎ'] = new ModelRendererTurbo(this, 113, 321, this.textureX, this.textureY);
/* 2208 */     this.gunModel['ʏ'] = new ModelRendererTurbo(this, 881, 217, this.textureX, this.textureY);
/* 2209 */     this.gunModel['ʐ'] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/* 2210 */     this.gunModel['ʑ'] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/* 2211 */     this.gunModel['ʒ'] = new ModelRendererTurbo(this, 1017, 17, this.textureX, this.textureY);
/* 2212 */     this.gunModel['ʓ'] = new ModelRendererTurbo(this, 545, 17, this.textureX, this.textureY);
/* 2213 */     this.gunModel['ʔ'] = new ModelRendererTurbo(this, 553, 17, this.textureX, this.textureY);
/* 2214 */     this.gunModel['ʕ'] = new ModelRendererTurbo(this, 713, 25, this.textureX, this.textureY);
/* 2215 */     this.gunModel['ʖ'] = new ModelRendererTurbo(this, 993, 321, this.textureX, this.textureY);
/* 2216 */     this.gunModel['ʗ'] = new ModelRendererTurbo(this, 889, 321, this.textureX, this.textureY);
/* 2217 */     this.gunModel['ʘ'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 2218 */     this.gunModel['ʙ'] = new ModelRendererTurbo(this, 561, 17, this.textureX, this.textureY);
/* 2219 */     this.gunModel['ʚ'] = new ModelRendererTurbo(this, 609, 17, this.textureX, this.textureY);
/* 2220 */     this.gunModel['ʛ'] = new ModelRendererTurbo(this, 625, 17, this.textureX, this.textureY);
/* 2221 */     this.gunModel['ʜ'] = new ModelRendererTurbo(this, 641, 17, this.textureX, this.textureY);
/* 2222 */     this.gunModel['ʝ'] = new ModelRendererTurbo(this, 665, 17, this.textureX, this.textureY);
/* 2223 */     this.gunModel['ʞ'] = new ModelRendererTurbo(this, 681, 17, this.textureX, this.textureY);
/* 2224 */     this.gunModel['ʟ'] = new ModelRendererTurbo(this, 241, 145, this.textureX, this.textureY);
/* 2225 */     this.gunModel['ʠ'] = new ModelRendererTurbo(this, 713, 17, this.textureX, this.textureY);
/* 2226 */     this.gunModel['ʡ'] = new ModelRendererTurbo(this, 761, 17, this.textureX, this.textureY);
/* 2227 */     this.gunModel['ʢ'] = new ModelRendererTurbo(this, 777, 17, this.textureX, this.textureY);
/* 2228 */     this.gunModel['ʣ'] = new ModelRendererTurbo(this, 737, 17, this.textureX, this.textureY);
/* 2229 */     this.gunModel['ʤ'] = new ModelRendererTurbo(this, 809, 17, this.textureX, this.textureY);
/* 2230 */     this.gunModel['ʥ'] = new ModelRendererTurbo(this, 825, 17, this.textureX, this.textureY);
/* 2231 */     this.gunModel['ʦ'] = new ModelRendererTurbo(this, 857, 17, this.textureX, this.textureY);
/* 2232 */     this.gunModel['ʧ'] = new ModelRendererTurbo(this, 873, 17, this.textureX, this.textureY);
/* 2233 */     this.gunModel['ʨ'] = new ModelRendererTurbo(this, 905, 17, this.textureX, this.textureY);
/* 2234 */     this.gunModel['ʩ'] = new ModelRendererTurbo(this, 673, 561, this.textureX, this.textureY);
/* 2235 */     this.gunModel['ʪ'] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/* 2236 */     this.gunModel['ʫ'] = new ModelRendererTurbo(this, 761, 81, this.textureX, this.textureY);
/* 2237 */     this.gunModel['ʬ'] = new ModelRendererTurbo(this, 681, 129, this.textureX, this.textureY);
/* 2238 */     this.gunModel['ʭ'] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/* 2239 */     this.gunModel['ʮ'] = new ModelRendererTurbo(this, 713, 73, this.textureX, this.textureY);
/* 2240 */     this.gunModel['ʯ'] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 2241 */     this.gunModel['ʰ'] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*      */     
/* 2243 */     this.gunModel['Ǵ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 12, 16, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2244 */     this.gunModel['Ǵ'].setRotationPoint(-132.25F, 24.5F, 2.0F);
/*      */     
/* 2246 */     this.gunModel['ǵ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 5, 16, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -4.0F, 2.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2247 */     this.gunModel['ǵ'].setRotationPoint(-131.25F, 19.5F, 2.0F);
/*      */     
/* 2249 */     this.gunModel['Ƕ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -4.0F, 1.5F, 0.0F, -4.0F, -1.5F, 0.0F, 0.0F);
/* 2250 */     this.gunModel['Ƕ'].setRotationPoint(-128.25F, 15.5F, 2.0F);
/*      */     
/* 2252 */     this.gunModel['Ƿ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 16, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -4.0F, 2.5F, 0.0F, -4.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2253 */     this.gunModel['Ƿ'].setRotationPoint(-129.25F, 17.5F, 2.0F);
/*      */     
/* 2255 */     this.gunModel['Ǹ'].addShapeBox(122.0F, -17.0F, -10.0F, 18, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2256 */     this.gunModel['Ǹ'].setRotationPoint(-137.25F, 1.5F, 2.0F);
/*      */     
/* 2258 */     this.gunModel['ǹ'].addShapeBox(122.0F, -17.0F, -10.0F, 19, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2259 */     this.gunModel['ǹ'].setRotationPoint(-137.25F, -2.5F, 2.0F);
/*      */     
/* 2261 */     this.gunModel['Ǻ'].addShapeBox(122.0F, -17.0F, -10.0F, 21, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2262 */     this.gunModel['Ǻ'].setRotationPoint(-137.25F, -3.5F, 2.0F);
/*      */     
/* 2264 */     this.gunModel['ǻ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 16, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -6.0F, 1.0F, 0.0F, -6.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2265 */     this.gunModel['ǻ'].setRotationPoint(-127.25F, 11.5F, 2.0F);
/*      */     
/* 2267 */     this.gunModel['Ǽ'].addShapeBox(122.0F, -17.0F, -10.0F, 16, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2268 */     this.gunModel['Ǽ'].setRotationPoint(-137.25F, 6.5F, 2.0F);
/*      */     
/* 2270 */     this.gunModel['ǽ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 2271 */     this.gunModel['ǽ'].setRotationPoint(-121.25F, 7.5F, 2.0F);
/*      */     
/* 2273 */     this.gunModel['Ǿ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -5.0F, 0.0F, -1.0F, -5.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2274 */     this.gunModel['Ǿ'].setRotationPoint(-126.25F, 9.5F, 2.0F);
/*      */     
/* 2276 */     this.gunModel['ǿ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 16, 0.0F, -5.0F, 0.0F, 0.0F, 4.0F, 0.0F, -3.0F, 4.0F, 0.0F, -3.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -1.0F);
/* 2277 */     this.gunModel['ǿ'].setRotationPoint(-126.25F, 9.5F, 2.0F);
/*      */     
/* 2279 */     this.gunModel['Ȁ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 2280 */     this.gunModel['Ȁ'].setRotationPoint(-142.25F, -3.5F, 2.0F);
/*      */     
/* 2282 */     this.gunModel['ȁ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 3, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2283 */     this.gunModel['ȁ'].setRotationPoint(-138.25F, 6.5F, 2.0F);
/*      */     
/* 2285 */     this.gunModel['Ȃ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2286 */     this.gunModel['Ȃ'].setRotationPoint(-138.25F, -0.5F, 2.0F);
/*      */     
/* 2288 */     this.gunModel['ȃ'].addShapeBox(122.0F, -17.0F, -10.0F, 19, 7, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2289 */     this.gunModel['ȃ'].setRotationPoint(-151.25F, 29.5F, 2.0F);
/*      */     
/* 2291 */     this.gunModel['Ȅ'].addShapeBox(122.0F, -17.0F, -10.0F, 18, 5, 16, 0.0F, -1.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2292 */     this.gunModel['Ȅ'].setRotationPoint(-149.25F, 24.5F, 2.0F);
/*      */     
/* 2294 */     this.gunModel['ȅ'].addShapeBox(122.0F, -17.0F, -10.0F, 19, 2, 16, 0.0F, -2.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F);
/* 2295 */     this.gunModel['ȅ'].setRotationPoint(-149.25F, 22.5F, 2.0F);
/*      */     
/* 2297 */     this.gunModel['Ȇ'].addShapeBox(122.0F, -17.0F, -10.0F, 19, 3, 16, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2298 */     this.gunModel['Ȇ'].setRotationPoint(-148.25F, 19.5F, 2.0F);
/*      */     
/* 2300 */     this.gunModel['ȇ'].addShapeBox(122.0F, -17.0F, -10.0F, 19, 1, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2301 */     this.gunModel['ȇ'].setRotationPoint(-147.25F, 18.5F, 2.0F);
/*      */     
/* 2303 */     this.gunModel['Ȉ'].addShapeBox(122.0F, -17.0F, -10.0F, 20, 1, 16, 0.0F, -2.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2304 */     this.gunModel['Ȉ'].setRotationPoint(-147.25F, 17.5F, 2.0F);
/*      */     
/* 2306 */     this.gunModel['ȉ'].addShapeBox(122.0F, -17.0F, -10.0F, 20, 2, 16, 0.0F, -4.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 2307 */     this.gunModel['ȉ'].setRotationPoint(-147.25F, 15.5F, 2.0F);
/*      */     
/* 2309 */     this.gunModel['Ȋ'].addShapeBox(122.0F, -17.0F, -10.0F, 10, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2310 */     this.gunModel['Ȋ'].setRotationPoint(-138.25F, 9.5F, 2.0F);
/*      */     
/* 2312 */     this.gunModel['ȋ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 1, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2313 */     this.gunModel['ȋ'].setRotationPoint(-143.25F, 14.5F, 2.0F);
/*      */     
/* 2315 */     this.gunModel['Ȍ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 16, 0.0F, -1.4F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.4F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F);
/* 2316 */     this.gunModel['Ȍ'].setRotationPoint(-141.25F, 11.5F, 2.0F);
/*      */     
/* 2318 */     this.gunModel['ȍ'].addShapeBox(122.0F, -17.0F, -10.0F, 12, 4, 16, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2319 */     this.gunModel['ȍ'].setRotationPoint(-139.25F, 11.5F, 2.0F);
/*      */     
/* 2321 */     this.gunModel['Ȏ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2322 */     this.gunModel['Ȏ'].setRotationPoint(-128.25F, 9.5F, 2.0F);
/*      */     
/* 2324 */     this.gunModel['ȏ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F);
/* 2325 */     this.gunModel['ȏ'].setRotationPoint(-140.25F, 9.5F, 2.0F);
/*      */     
/* 2327 */     this.gunModel['Ȑ'].addShapeBox(122.0F, -17.0F, -10.0F, 16, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2328 */     this.gunModel['Ȑ'].setRotationPoint(-137.25F, 7.5F, 2.0F);
/*      */     
/* 2330 */     this.gunModel['ȑ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 2331 */     this.gunModel['ȑ'].setRotationPoint(-121.25F, 8.5F, 2.0F);
/*      */     
/* 2333 */     this.gunModel['Ȓ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2334 */     this.gunModel['Ȓ'].setRotationPoint(-121.25F, 6.5F, 2.0F);
/*      */     
/* 2336 */     this.gunModel['ȓ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2337 */     this.gunModel['ȓ'].setRotationPoint(-118.25F, 8.5F, 5.0F);
/*      */     
/* 2339 */     this.gunModel['Ȕ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 10, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2340 */     this.gunModel['Ȕ'].setRotationPoint(-115.25F, 9.5F, 5.0F);
/*      */     
/* 2342 */     this.gunModel['ȕ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 10, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 2343 */     this.gunModel['ȕ'].setRotationPoint(-92.25F, 11.5F, 5.0F);
/*      */     
/* 2345 */     this.gunModel['Ȗ'].addShapeBox(122.0F, -17.0F, -10.0F, 17, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2346 */     this.gunModel['Ȗ'].setRotationPoint(-109.25F, 13.0F, 5.0F);
/*      */     
/* 2348 */     this.gunModel['ȗ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2349 */     this.gunModel['ȗ'].setRotationPoint(-112.25F, 11.5F, 5.0F);
/*      */     
/* 2351 */     this.gunModel['Ș'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 6, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2352 */     this.gunModel['Ș'].setRotationPoint(-87.25F, -3.5F, 5.0F);
/*      */     
/* 2354 */     this.gunModel['ș'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2355 */     this.gunModel['ș'].setRotationPoint(-86.25F, -3.5F, 5.0F);
/*      */     
/* 2357 */     this.gunModel['Ț'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2358 */     this.gunModel['Ț'].setRotationPoint(-87.25F, 2.5F, 5.0F);
/*      */     
/* 2360 */     this.gunModel['ț'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 2361 */     this.gunModel['ț'].setRotationPoint(-88.5F, 6.5F, 5.0F);
/*      */     
/* 2363 */     this.gunModel['Ȝ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2364 */     this.gunModel['Ȝ'].setRotationPoint(-90.25F, 10.5F, 5.0F);
/*      */     
/* 2366 */     this.gunModel['ȝ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 10, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2367 */     this.gunModel['ȝ'].setRotationPoint(-90.25F, 11.5F, 5.0F);
/*      */     
/* 2369 */     this.gunModel['Ȟ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2370 */     this.gunModel['Ȟ'].setRotationPoint(-86.25F, -6.5F, 5.0F);
/*      */     
/* 2372 */     this.gunModel['ȟ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2373 */     this.gunModel['ȟ'].setRotationPoint(-107.5F, -3.5F, 7.5F);
/*      */     
/* 2375 */     this.gunModel['Ƞ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2376 */     this.gunModel['Ƞ'].setRotationPoint(-108.0F, -1.5F, 7.5F);
/*      */     
/* 2378 */     this.gunModel['ȡ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2379 */     this.gunModel['ȡ'].setRotationPoint(-108.0F, 0.5F, 7.5F);
/*      */     
/* 2381 */     this.gunModel['Ȣ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2382 */     this.gunModel['Ȣ'].setRotationPoint(-108.0F, 2.5F, 7.5F);
/*      */     
/* 2384 */     this.gunModel['ȣ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 2, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 2385 */     this.gunModel['ȣ'].setRotationPoint(-107.0F, 5.5F, 7.5F);
/*      */     
/* 2387 */     this.gunModel['Ȥ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 5, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 2.75F, -1.0F, 0.0F, 2.75F, -1.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/* 2388 */     this.gunModel['Ȥ'].setRotationPoint(-105.0F, 7.5F, 7.5F);
/*      */     
/* 2390 */     this.gunModel['ȥ'].addShapeBox(122.0F, -17.0F, -10.0F, 26, 4, 16, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F);
/* 2391 */     this.gunModel['ȥ'].setRotationPoint(-154.25F, 36.5F, 2.0F);
/*      */     
/* 2393 */     this.gunModel['Ȧ'].addShapeBox(122.0F, -17.0F, -10.0F, 26, 4, 5, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -7.0F, -4.0F, 0.0F, -7.0F, -4.0F, 0.0F, 8.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 2394 */     this.gunModel['Ȧ'].setRotationPoint(-154.25F, 36.5F, 18.0F);
/*      */     
/* 2396 */     this.gunModel['ȧ'].addShapeBox(122.0F, -17.0F, -10.0F, 26, 4, 5, 0.0F, -7.0F, -4.0F, 0.0F, -7.0F, -4.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F);
/* 2397 */     this.gunModel['ȧ'].setRotationPoint(-154.25F, 36.5F, -3.0F);
/*      */     
/* 2399 */     this.gunModel['Ȩ'].addShapeBox(122.0F, -17.0F, -10.0F, 45, 3, 5, 0.0F, -19.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 2400 */     this.gunModel['Ȩ'].setRotationPoint(-166.25F, 40.5F, -3.0F);
/*      */     
/* 2402 */     this.gunModel['ȩ'].addShapeBox(122.0F, -17.0F, -10.0F, 45, 3, 5, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F);
/* 2403 */     this.gunModel['ȩ'].setRotationPoint(-166.25F, 40.5F, 18.0F);
/*      */     
/* 2405 */     this.gunModel['Ȫ'].addShapeBox(122.0F, -17.0F, -10.0F, 41, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2406 */     this.gunModel['Ȫ'].setRotationPoint(-162.25F, 40.5F, 2.0F);
/*      */     
/* 2408 */     this.gunModel['ȫ'].addShapeBox(122.0F, -17.0F, -10.0F, 7, 10, 2, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2409 */     this.gunModel['ȫ'].setRotationPoint(-129.5F, -35.5F, 3.5F);
/*      */     
/* 2411 */     this.gunModel['Ȭ'].addShapeBox(122.0F, -17.0F, -10.0F, 12, 10, 2, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2412 */     this.gunModel['Ȭ'].setRotationPoint(-129.5F, -36.0F, 14.5F);
/*      */     
/* 2414 */     this.gunModel['ȭ'].addShapeBox(122.0F, -17.0F, -10.0F, 12, 6, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2415 */     this.gunModel['ȭ'].setRotationPoint(-129.5F, -32.0F, 5.5F);
/*      */     
/* 2417 */     this.gunModel['Ȯ'].addShapeBox(122.0F, -17.0F, -10.0F, 12, 4, 3, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2418 */     this.gunModel['Ȯ'].setRotationPoint(-129.5F, -35.25F, 11.5F);
/*      */     
/* 2420 */     this.gunModel['ȯ'].addShapeBox(122.0F, -17.0F, -10.0F, 12, 4, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2421 */     this.gunModel['ȯ'].setRotationPoint(-129.5F, -35.25F, 5.5F);
/*      */     
/* 2423 */     this.gunModel['Ȱ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 10, 3, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2424 */     this.gunModel['Ȱ'].setRotationPoint(-117.5F, -36.0F, 14.5F);
/*      */     
/* 2426 */     this.gunModel['ȱ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 10, 3, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2427 */     this.gunModel['ȱ'].setRotationPoint(-117.5F, -36.0F, 2.5F);
/*      */     
/* 2429 */     this.gunModel['Ȳ'].addShapeBox(122.0F, -17.0F, -10.0F, 72, 4, 2, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2430 */     this.gunModel['Ȳ'].setRotationPoint(-93.0F, -38.0F, 17.5F);
/*      */     
/* 2432 */     this.gunModel['ȳ'].addShapeBox(122.0F, -17.0F, -10.0F, 72, 5, 1, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2433 */     this.gunModel['ȳ'].setRotationPoint(-93.0F, -34.0F, 17.5F);
/*      */     
/* 2435 */     this.gunModel['ȴ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2436 */     this.gunModel['ȴ'].setRotationPoint(-93.5F, -34.5F, 16.5F);
/*      */     
/* 2438 */     this.gunModel['ȵ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2439 */     this.gunModel['ȵ'].setRotationPoint(-93.5F, -30.0F, 16.5F);
/*      */     
/* 2441 */     this.gunModel['ȶ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 3, 15, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2442 */     this.gunModel['ȶ'].setRotationPoint(-104.0F, -29.0F, 2.5F);
/*      */     
/* 2444 */     this.gunModel['ȷ'].addShapeBox(122.0F, -17.0F, -10.0F, 32, 4, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/* 2445 */     this.gunModel['ȷ'].setRotationPoint(-49.0F, -42.0F, 0.5F);
/*      */     
/* 2447 */     this.gunModel['ȸ'].addShapeBox(122.0F, -17.0F, -10.0F, 32, 4, 5, 0.0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F);
/* 2448 */     this.gunModel['ȸ'].setRotationPoint(-49.0F, -46.0F, 3.0F);
/*      */     
/* 2450 */     this.gunModel['ȹ'].addShapeBox(122.0F, -17.0F, -10.0F, 32, 1, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/* 2451 */     this.gunModel['ȹ'].setRotationPoint(-49.0F, -42.5F, 1.5F);
/*      */     
/* 2453 */     this.gunModel['Ⱥ'].addShapeBox(122.0F, -17.0F, -10.0F, 31, 2, 5, 0.0F, 0.0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F);
/* 2454 */     this.gunModel['Ⱥ'].setRotationPoint(-80.0F, -46.0F, 3.0F);
/*      */     
/* 2456 */     this.gunModel['Ȼ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 16, 0.0F, 0.5F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F);
/* 2457 */     this.gunModel['Ȼ'].setRotationPoint(-44.0F, -42.0F, 2.0F);
/*      */     
/* 2459 */     this.gunModel['ȼ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 10, 0.0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F);
/* 2460 */     this.gunModel['ȼ'].setRotationPoint(-44.0F, -46.0F, 5.0F);
/*      */     
/* 2462 */     this.gunModel['Ƚ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 10, 0.0F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.5F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F);
/* 2463 */     this.gunModel['Ƚ'].setRotationPoint(-44.0F, -50.0F, 5.0F);
/*      */     
/* 2465 */     this.gunModel['Ⱦ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 13, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 2466 */     this.gunModel['Ⱦ'].setRotationPoint(-44.0F, -42.5F, 3.5F);
/*      */     
/* 2468 */     this.gunModel['ȿ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 12, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2469 */     this.gunModel['ȿ'].setRotationPoint(-44.5F, -38.25F, 2.0F);
/*      */     
/* 2471 */     this.gunModel['ɀ'].addShapeBox(122.0F, -17.0F, -10.0F, 31, 2, 14, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F);
/* 2472 */     this.gunModel['ɀ'].setRotationPoint(-80.0F, -44.5F, 3.0F);
/*      */     
/* 2474 */     this.gunModel['Ɂ'].addShapeBox(122.0F, -17.0F, -10.0F, 24, 2, 14, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F);
/* 2475 */     this.gunModel['Ɂ'].setRotationPoint(-104.0F, -44.5F, 3.0F);
/*      */     
/* 2477 */     this.gunModel['ɂ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 2, 14, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F);
/* 2478 */     this.gunModel['ɂ'].setRotationPoint(-49.5F, -44.5F, 3.0F);
/*      */     
/* 2480 */     this.gunModel['Ƀ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 4, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/* 2481 */     this.gunModel['Ƀ'].setRotationPoint(-91.0F, -42.0F, 0.5F);
/*      */     
/* 2483 */     this.gunModel['Ʉ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 4, 5, 0.0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F);
/* 2484 */     this.gunModel['Ʉ'].setRotationPoint(-91.0F, -46.0F, 3.0F);
/*      */     
/* 2486 */     this.gunModel['Ʌ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 1, 4, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/* 2487 */     this.gunModel['Ʌ'].setRotationPoint(-91.0F, -42.5F, 1.5F);
/*      */     
/* 2489 */     this.gunModel['Ɇ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 3, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/* 2490 */     this.gunModel['Ɇ'].setRotationPoint(-94.5F, -42.0F, 1.5F);
/*      */     
/* 2492 */     this.gunModel['ɇ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 4, 4, 0.0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F);
/* 2493 */     this.gunModel['ɇ'].setRotationPoint(-94.5F, -46.0F, 4.0F);
/*      */     
/* 2495 */     this.gunModel['Ɉ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 3, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F);
/* 2496 */     this.gunModel['Ɉ'].setRotationPoint(-94.5F, -42.5F, 2.5F);
/*      */     
/* 2498 */     this.gunModel['ɉ'].addShapeBox(122.0F, -17.0F, -10.0F, 72, 4, 5, 0.0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 2.5F, 0.0F, -3.75F, 2.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 2.5F, -0.25F, -3.5F);
/* 2499 */     this.gunModel['ɉ'].setRotationPoint(-89.0F, -50.0F, 5.0F);
/*      */     
/* 2501 */     this.gunModel['Ɋ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 4, 0.0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 2.5F, 0.0F, -3.75F, 2.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 2.5F, -0.25F, -3.5F);
/* 2502 */     this.gunModel['Ɋ'].setRotationPoint(-92.5F, -50.0F, 6.0F);
/*      */     
/* 2504 */     this.gunModel['ɋ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 10, 2, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2505 */     this.gunModel['ɋ'].setRotationPoint(-118.5F, -36.0F, 3.5F);
/*      */     
/* 2507 */     this.gunModel['Ɍ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 3, 2, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2508 */     this.gunModel['Ɍ'].setRotationPoint(-123.0F, -29.0F, 3.5F);
/*      */     
/* 2510 */     this.gunModel['ɍ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 2, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2511 */     this.gunModel['ɍ'].setRotationPoint(-118.75F, -28.5F, 3.5F);
/*      */     
/* 2513 */     this.gunModel['Ɏ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2514 */     this.gunModel['Ɏ'].setRotationPoint(-123.25F, -28.5F, 3.5F);
/*      */     
/* 2516 */     this.gunModel['ɏ'].addShapeBox(122.0F, -17.0F, -10.0F, 6, 14, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2517 */     this.gunModel['ɏ'].setRotationPoint(-241.25F, -32.5F, 18.0F);
/*      */     
/* 2519 */     this.gunModel['ɐ'].addShapeBox(122.0F, -17.0F, -10.0F, 8, 14, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2520 */     this.gunModel['ɐ'].setRotationPoint(-185.25F, -32.5F, 18.0F);
/*      */     
/* 2522 */     this.gunModel['ɑ'].addShapeBox(122.0F, -17.0F, -10.0F, 49, 2, 2, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 2523 */     this.gunModel['ɑ'].setRotationPoint(-234.25F, -32.5F, 18.0F);
/*      */     
/* 2525 */     this.gunModel['ɒ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 3, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2526 */     this.gunModel['ɒ'].setRotationPoint(-241.25F, -35.25F, 18.0F);
/*      */     
/* 2528 */     this.gunModel['ɓ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 2, 2, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2529 */     this.gunModel['ɓ'].setRotationPoint(-241.25F, -37.25F, 17.0F);
/*      */     
/* 2531 */     this.gunModel['ɔ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 2, 2, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2532 */     this.gunModel['ɔ'].setRotationPoint(-241.25F, -39.25F, 3.0F);
/*      */     
/* 2534 */     this.gunModel['ɕ'].addShapeBox(122.0F, -17.0F, -10.0F, 49, 13, 1, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 2535 */     this.gunModel['ɕ'].setRotationPoint(-234.25F, -31.5F, 18.0F);
/*      */     
/* 2537 */     this.gunModel['ɖ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2538 */     this.gunModel['ɖ'].setRotationPoint(-186.25F, -29.75F, 19.0F);
/*      */     
/* 2540 */     this.gunModel['ɗ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2541 */     this.gunModel['ɗ'].setRotationPoint(-186.25F, -30.75F, 19.0F);
/*      */     
/* 2543 */     this.gunModel['ɘ'].addShapeBox(122.0F, -17.0F, -10.0F, 48, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2544 */     this.gunModel['ɘ'].setRotationPoint(-233.5F, -30.75F, 19.0F);
/*      */     
/* 2546 */     this.gunModel['ə'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 2547 */     this.gunModel['ə'].setRotationPoint(-234.5F, -30.75F, 19.0F);
/*      */     
/* 2549 */     this.gunModel['ɚ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 2550 */     this.gunModel['ɚ'].setRotationPoint(-234.5F, -29.75F, 19.0F);
/*      */     
/* 2552 */     this.gunModel['ɛ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 2, 2, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2553 */     this.gunModel['ɛ'].setRotationPoint(-241.25F, -39.25F, 15.0F);
/*      */     
/* 2555 */     this.gunModel['ɜ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 3, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2556 */     this.gunModel['ɜ'].setRotationPoint(-241.25F, -35.25F, 0.0F);
/*      */     
/* 2558 */     this.gunModel['ɝ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2559 */     this.gunModel['ɝ'].setRotationPoint(-241.25F, -37.25F, 1.0F);
/*      */     
/* 2561 */     this.gunModel['ɞ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2562 */     this.gunModel['ɞ'].setRotationPoint(-241.25F, -39.25F, 7.0F);
/*      */     
/* 2564 */     this.gunModel['ɟ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 1, 6, 0.0F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2565 */     this.gunModel['ɟ'].setRotationPoint(-241.25F, -40.25F, 7.0F);
/*      */     
/* 2567 */     this.gunModel['ɠ'].addShapeBox(122.0F, -17.0F, -10.0F, 65, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2568 */     this.gunModel['ɠ'].setRotationPoint(-241.25F, -32.25F, 0.0F);
/*      */     
/* 2570 */     this.gunModel['ɡ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 15, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2571 */     this.gunModel['ɡ'].setRotationPoint(-225.25F, -38.25F, 7.0F);
/*      */     
/* 2573 */     this.gunModel['ɢ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 15, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2574 */     this.gunModel['ɢ'].setRotationPoint(-227.25F, -38.25F, 7.0F);
/*      */     
/* 2576 */     this.gunModel['ɣ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 15, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2577 */     this.gunModel['ɣ'].setRotationPoint(-229.25F, -38.25F, 7.0F);
/*      */     
/* 2579 */     this.gunModel['ɤ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 15, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2580 */     this.gunModel['ɤ'].setRotationPoint(-210.25F, -38.25F, 7.0F);
/*      */     
/* 2582 */     this.gunModel['ɥ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 15, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2583 */     this.gunModel['ɥ'].setRotationPoint(-212.25F, -38.25F, 7.0F);
/*      */     
/* 2585 */     this.gunModel['ɦ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 15, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2586 */     this.gunModel['ɦ'].setRotationPoint(-214.25F, -38.25F, 7.0F);
/*      */     
/* 2588 */     this.gunModel['ɧ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 4, 4, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2589 */     this.gunModel['ɧ'].setRotationPoint(-224.25F, -23.5F, -1.5F);
/*      */     
/* 2591 */     this.gunModel['ɨ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2592 */     this.gunModel['ɨ'].setRotationPoint(-224.25F, -19.5F, -1.5F);
/*      */     
/* 2594 */     this.gunModel['ɩ'].addShapeBox(122.0F, -17.0F, -10.0F, 11, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 2595 */     this.gunModel['ɩ'].setRotationPoint(-224.25F, -15.5F, -1.5F);
/*      */     
/* 2597 */     this.gunModel['ɪ'].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2598 */     this.gunModel['ɪ'].setRotationPoint(-223.25F, -19.0F, -3.0F);
/*      */     
/* 2600 */     this.gunModel['ɫ'].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2601 */     this.gunModel['ɫ'].setRotationPoint(-223.25F, -16.0F, -3.0F);
/*      */     
/* 2603 */     this.gunModel['ɬ'].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 2, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2604 */     this.gunModel['ɬ'].setRotationPoint(-223.25F, -22.0F, -3.0F);
/*      */     
/* 2606 */     this.gunModel['ɭ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2607 */     this.gunModel['ɭ'].setRotationPoint(-182.25F, -23.5F, 18.5F);
/*      */     
/* 2609 */     this.gunModel['ɮ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2610 */     this.gunModel['ɮ'].setRotationPoint(-182.25F, -24.5F, 18.5F);
/*      */     
/* 2612 */     this.gunModel['ɯ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2613 */     this.gunModel['ɯ'].setRotationPoint(-182.25F, -25.5F, 18.5F);
/*      */     
/* 2615 */     this.gunModel['ɰ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2616 */     this.gunModel['ɰ'].setRotationPoint(-239.25F, -23.5F, 18.5F);
/*      */     
/* 2618 */     this.gunModel['ɱ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2619 */     this.gunModel['ɱ'].setRotationPoint(-239.25F, -24.5F, 18.5F);
/*      */     
/* 2621 */     this.gunModel['ɲ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2622 */     this.gunModel['ɲ'].setRotationPoint(-239.25F, -25.5F, 18.5F);
/*      */     
/* 2624 */     this.gunModel['ɳ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2625 */     this.gunModel['ɳ'].setRotationPoint(-231.75F, 31.75F, 6.5F);
/*      */     
/* 2627 */     this.gunModel['ɴ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2628 */     this.gunModel['ɴ'].setRotationPoint(-233.75F, 31.75F, 6.5F);
/*      */     
/* 2630 */     this.gunModel['ɵ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2631 */     this.gunModel['ɵ'].setRotationPoint(-235.75F, 31.75F, 6.5F);
/*      */     
/* 2633 */     this.gunModel['ɶ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2634 */     this.gunModel['ɶ'].setRotationPoint(-238.75F, 35.75F, 3.5F);
/*      */     
/* 2636 */     this.gunModel['ɷ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2637 */     this.gunModel['ɷ'].setRotationPoint(-234.75F, 35.75F, 3.5F);
/*      */     
/* 2639 */     this.gunModel['ɸ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2640 */     this.gunModel['ɸ'].setRotationPoint(-230.75F, 35.75F, 3.5F);
/*      */     
/* 2642 */     this.gunModel['ɹ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F);
/* 2643 */     this.gunModel['ɹ'].setRotationPoint(-231.75F, 40.75F, 6.5F);
/*      */     
/* 2645 */     this.gunModel['ɺ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F);
/* 2646 */     this.gunModel['ɺ'].setRotationPoint(-233.75F, 40.75F, 6.5F);
/*      */     
/* 2648 */     this.gunModel['ɻ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F);
/* 2649 */     this.gunModel['ɻ'].setRotationPoint(-235.75F, 40.75F, 6.5F);
/*      */     
/* 2651 */     this.gunModel['ɼ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F);
/* 2652 */     this.gunModel['ɼ'].setRotationPoint(-231.75F, 34.75F, 6.5F);
/*      */     
/* 2654 */     this.gunModel['ɽ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F);
/* 2655 */     this.gunModel['ɽ'].setRotationPoint(-233.75F, 34.75F, 6.5F);
/*      */     
/* 2657 */     this.gunModel['ɾ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F);
/* 2658 */     this.gunModel['ɾ'].setRotationPoint(-235.75F, 34.75F, 6.5F);
/*      */     
/* 2660 */     this.gunModel['ɿ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2661 */     this.gunModel['ɿ'].setRotationPoint(-231.75F, 39.75F, 6.5F);
/*      */     
/* 2663 */     this.gunModel['ʀ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2664 */     this.gunModel['ʀ'].setRotationPoint(-233.75F, 39.75F, 6.5F);
/*      */     
/* 2666 */     this.gunModel['ʁ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2667 */     this.gunModel['ʁ'].setRotationPoint(-235.75F, 39.75F, 6.5F);
/*      */     
/* 2669 */     this.gunModel['ʂ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2670 */     this.gunModel['ʂ'].setRotationPoint(-231.75F, 38.75F, 6.5F);
/*      */     
/* 2672 */     this.gunModel['ʃ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2673 */     this.gunModel['ʃ'].setRotationPoint(-233.75F, 38.75F, 6.5F);
/*      */     
/* 2675 */     this.gunModel['ʄ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2676 */     this.gunModel['ʄ'].setRotationPoint(-235.75F, 38.75F, 6.5F);
/*      */     
/* 2678 */     this.gunModel['ʅ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 2679 */     this.gunModel['ʅ'].setRotationPoint(-238.75F, 41.75F, 3.5F);
/*      */     
/* 2681 */     this.gunModel['ʆ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2682 */     this.gunModel['ʆ'].setRotationPoint(-234.75F, 41.75F, 3.5F);
/*      */     
/* 2684 */     this.gunModel['ʇ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2685 */     this.gunModel['ʇ'].setRotationPoint(-230.75F, 41.75F, 3.5F);
/*      */     
/* 2687 */     this.gunModel['ʈ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2688 */     this.gunModel['ʈ'].setRotationPoint(-231.75F, 43.75F, 6.5F);
/*      */     
/* 2690 */     this.gunModel['ʉ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 7, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2691 */     this.gunModel['ʉ'].setRotationPoint(-233.75F, 43.75F, 6.5F);
/*      */     
/* 2693 */     this.gunModel['ʊ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 7, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2694 */     this.gunModel['ʊ'].setRotationPoint(-235.75F, 43.75F, 6.5F);
/*      */     
/* 2696 */     this.gunModel['ʋ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 2697 */     this.gunModel['ʋ'].setRotationPoint(-231.25F, 47.75F, 5.0F);
/*      */     
/* 2699 */     this.gunModel['ʌ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2700 */     this.gunModel['ʌ'].setRotationPoint(-234.25F, 47.75F, 5.0F);
/*      */     
/* 2702 */     this.gunModel['ʍ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 2703 */     this.gunModel['ʍ'].setRotationPoint(-237.25F, 47.75F, 5.0F);
/*      */     
/* 2705 */     this.gunModel['ʎ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2706 */     this.gunModel['ʎ'].setRotationPoint(-254.75F, 31.75F, 6.5F);
/*      */     
/* 2708 */     this.gunModel['ʏ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F, -0.25F, 0.0F, 3.0F);
/* 2709 */     this.gunModel['ʏ'].setRotationPoint(-253.75F, 34.75F, 6.5F);
/*      */     
/* 2711 */     this.gunModel['ʐ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2712 */     this.gunModel['ʐ'].setRotationPoint(-253.75F, 39.75F, 14.5F);
/*      */     
/* 2714 */     this.gunModel['ʑ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F);
/* 2715 */     this.gunModel['ʑ'].setRotationPoint(-253.75F, 39.75F, 3.5F);
/*      */     
/* 2717 */     this.gunModel['ʒ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2718 */     this.gunModel['ʒ'].setRotationPoint(-253.75F, 36.75F, 14.5F);
/*      */     
/* 2720 */     this.gunModel['ʓ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2721 */     this.gunModel['ʓ'].setRotationPoint(-253.75F, 35.75F, 14.5F);
/*      */     
/* 2723 */     this.gunModel['ʔ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2724 */     this.gunModel['ʔ'].setRotationPoint(-253.75F, 35.75F, 3.5F);
/*      */     
/* 2726 */     this.gunModel['ʕ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2727 */     this.gunModel['ʕ'].setRotationPoint(-253.75F, 36.75F, 3.5F);
/*      */     
/* 2729 */     this.gunModel['ʖ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F);
/* 2730 */     this.gunModel['ʖ'].setRotationPoint(-253.75F, 40.75F, 3.5F);
/*      */     
/* 2732 */     this.gunModel['ʗ'].addShapeBox(122.0F, -17.0F, -10.0F, 13, 4, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2733 */     this.gunModel['ʗ'].setRotationPoint(-113.5F, -33.5F, 19.5F);
/*      */     
/* 2735 */     this.gunModel['ʘ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 4, 2, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.25F, 0.0F);
/* 2736 */     this.gunModel['ʘ'].setRotationPoint(-115.5F, -33.5F, 19.5F);
/*      */     
/* 2738 */     this.gunModel['ʙ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2739 */     this.gunModel['ʙ'].setRotationPoint(-113.25F, -31.25F, 21.0F);
/*      */     
/* 2741 */     this.gunModel['ʚ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2742 */     this.gunModel['ʚ'].setRotationPoint(-113.25F, -32.25F, 21.0F);
/*      */     
/* 2744 */     this.gunModel['ʛ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2745 */     this.gunModel['ʛ'].setRotationPoint(-113.25F, -33.25F, 21.0F);
/*      */     
/* 2747 */     this.gunModel['ʜ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2748 */     this.gunModel['ʜ'].setRotationPoint(-104.25F, -31.25F, 21.0F);
/*      */     
/* 2750 */     this.gunModel['ʝ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2751 */     this.gunModel['ʝ'].setRotationPoint(-104.25F, -32.25F, 21.0F);
/*      */     
/* 2753 */     this.gunModel['ʞ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2754 */     this.gunModel['ʞ'].setRotationPoint(-104.25F, -33.25F, 21.0F);
/*      */     
/* 2756 */     this.gunModel['ʟ'].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 2, 0.0F, -3.0F, 0.25F, 0.0F, 4.5F, 0.25F, 0.0F, 4.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F);
/* 2757 */     this.gunModel['ʟ'].setRotationPoint(-109.5F, -37.5F, 19.0F);
/*      */     
/* 2759 */     this.gunModel['ʠ'].addShapeBox(122.0F, -17.0F, -10.0F, 6, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2760 */     this.gunModel['ʠ'].setRotationPoint(-106.5F, -38.75F, 19.0F);
/*      */     
/* 2762 */     this.gunModel['ʡ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 1, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2763 */     this.gunModel['ʡ'].setRotationPoint(-106.0F, -39.75F, 19.0F);
/*      */     
/* 2765 */     this.gunModel['ʢ'].addShapeBox(122.0F, -17.0F, -10.0F, 5, 1, 2, 0.0F, -2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F);
/* 2766 */     this.gunModel['ʢ'].setRotationPoint(-106.0F, -40.25F, 19.0F);
/*      */     
/* 2768 */     this.gunModel['ʣ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2769 */     this.gunModel['ʣ'].setRotationPoint(-104.75F, -37.75F, 20.25F);
/*      */     
/* 2771 */     this.gunModel['ʤ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2772 */     this.gunModel['ʤ'].setRotationPoint(-104.75F, -38.75F, 20.25F);
/*      */     
/* 2774 */     this.gunModel['ʥ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2775 */     this.gunModel['ʥ'].setRotationPoint(-104.75F, -39.75F, 20.25F);
/*      */     
/* 2777 */     this.gunModel['ʦ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/* 2778 */     this.gunModel['ʦ'].setRotationPoint(-36.25F, -39.75F, 17.15F);
/*      */     
/* 2780 */     this.gunModel['ʧ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 2781 */     this.gunModel['ʧ'].setRotationPoint(-36.25F, -40.75F, 17.15F);
/*      */     
/* 2783 */     this.gunModel['ʨ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F);
/* 2784 */     this.gunModel['ʨ'].setRotationPoint(-36.25F, -41.75F, 17.15F);
/*      */     
/* 2786 */     this.gunModel['ʩ'].addShapeBox(122.0F, -17.0F, -10.0F, 15, 4, 4, 0.0F, 1.25F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 1.25F, -0.25F, -1.0F, 1.25F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F);
/* 2787 */     this.gunModel['ʩ'].setRotationPoint(-32.0F, -42.0F, 15.5F);
/*      */     
/* 2789 */     this.gunModel['ʪ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.3F, 0.0F, -0.25F, 0.3F);
/* 2790 */     this.gunModel['ʪ'].setRotationPoint(-36.25F, -41.5F, 15.5F);
/*      */     
/* 2792 */     this.gunModel['ʫ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, 0.0F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 2793 */     this.gunModel['ʫ'].setRotationPoint(-36.25F, -40.0F, 15.5F);
/*      */     
/* 2795 */     this.gunModel['ʬ'].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 4, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2796 */     this.gunModel['ʬ'].setRotationPoint(-36.25F, -39.0F, 15.5F);
/*      */     
/* 2798 */     this.gunModel['ʭ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 4, 0.0F, -1.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.45F, -1.0F, -0.25F, -0.45F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 2799 */     this.gunModel['ʭ'].setRotationPoint(-34.25F, -40.0F, 15.5F);
/*      */     
/* 2801 */     this.gunModel['ʮ'].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 3, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.3F, -1.0F, -0.25F, 0.3F);
/* 2802 */     this.gunModel['ʮ'].setRotationPoint(-34.25F, -41.5F, 15.5F);
/*      */     
/* 2804 */     this.gunModel['ʯ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2805 */     this.gunModel['ʯ'].setRotationPoint(-93.5F, -34.5F, 18.0F);
/*      */     
/* 2807 */     this.gunModel['ʰ'].addShapeBox(122.0F, -17.0F, -10.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2808 */     this.gunModel['ʰ'].setRotationPoint(-93.5F, -30.0F, 18.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2813 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 817, 529, this.textureX, this.textureY);
/* 2814 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 865, 529, this.textureX, this.textureY);
/* 2815 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 1, 537, this.textureX, this.textureY);
/* 2816 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 49, 537, this.textureX, this.textureY);
/* 2817 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 81, 537, this.textureX, this.textureY);
/* 2818 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 129, 537, this.textureX, this.textureY);
/* 2819 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 161, 537, this.textureX, this.textureY);
/* 2820 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 201, 537, this.textureX, this.textureY);
/* 2821 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 905, 521, this.textureX, this.textureY);
/* 2822 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 945, 529, this.textureX, this.textureY);
/* 2823 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 105, 537, this.textureX, this.textureY);
/* 2824 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 225, 537, this.textureX, this.textureY);
/* 2825 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 273, 537, this.textureX, this.textureY);
/* 2826 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 321, 537, this.textureX, this.textureY);
/* 2827 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 1001, 145, this.textureX, this.textureY);
/* 2828 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 953, 161, this.textureX, this.textureY);
/* 2829 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 897, 217, this.textureX, this.textureY);
/* 2830 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 497, 225, this.textureX, this.textureY);
/* 2831 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 553, 241, this.textureX, this.textureY);
/* 2832 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 249, 537, this.textureX, this.textureY);
/* 2833 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 401, 257, this.textureX, this.textureY);
/* 2834 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 297, 537, this.textureX, this.textureY);
/* 2835 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 369, 537, this.textureX, this.textureY);
/* 2836 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 417, 537, this.textureX, this.textureY);
/* 2837 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 465, 537, this.textureX, this.textureY);
/* 2838 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 513, 537, this.textureX, this.textureY);
/* 2839 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 545, 537, this.textureX, this.textureY);
/* 2840 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 673, 545, this.textureX, this.textureY);
/* 2841 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 801, 553, this.textureX, this.textureY);
/* 2842 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 137, 553, this.textureX, this.textureY);
/* 2843 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 553, 553, this.textureX, this.textureY);
/* 2844 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 609, 553, this.textureX, this.textureY);
/* 2845 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 937, 553, this.textureX, this.textureY);
/* 2846 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 1, 561, this.textureX, this.textureY);
/* 2847 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 193, 561, this.textureX, this.textureY);
/* 2848 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 345, 537, this.textureX, this.textureY);
/* 2849 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 89, 561, this.textureX, this.textureY);
/* 2850 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 281, 561, this.textureX, this.textureY);
/* 2851 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 401, 329, this.textureX, this.textureY);
/* 2852 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 697, 329, this.textureX, this.textureY);
/* 2853 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 737, 329, this.textureX, this.textureY);
/* 2854 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 793, 329, this.textureX, this.textureY);
/* 2855 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 921, 337, this.textureX, this.textureY);
/* 2856 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 49, 345, this.textureX, this.textureY);
/* 2857 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 553, 337, this.textureX, this.textureY);
/* 2858 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 89, 345, this.textureX, this.textureY);
/* 2859 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 297, 345, this.textureX, this.textureY);
/* 2860 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 513, 353, this.textureX, this.textureY);
/* 2861 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 721, 353, this.textureX, this.textureY);
/* 2862 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 321, 561, this.textureX, this.textureY);
/* 2863 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 385, 561, this.textureX, this.textureY);
/* 2864 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 449, 561, this.textureX, this.textureY);
/* 2865 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 257, 361, this.textureX, this.textureY);
/* 2866 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 217, 369, this.textureX, this.textureY);
/* 2867 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 297, 369, this.textureX, this.textureY);
/* 2868 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 945, 369, this.textureX, this.textureY);
/* 2869 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 137, 377, this.textureX, this.textureY);
/* 2870 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 481, 377, this.textureX, this.textureY);
/* 2871 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 657, 377, this.textureX, this.textureY);
/* 2872 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 729, 377, this.textureX, this.textureY);
/* 2873 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 201, 393, this.textureX, this.textureY);
/* 2874 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 577, 393, this.textureX, this.textureY);
/* 2875 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 913, 393, this.textureX, this.textureY);
/* 2876 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 89, 401, this.textureX, this.textureY);
/* 2877 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 465, 401, this.textureX, this.textureY);
/* 2878 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 617, 401, this.textureX, this.textureY);
/* 2879 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 657, 401, this.textureX, this.textureY);
/* 2880 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 697, 401, this.textureX, this.textureY);
/* 2881 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 49, 257, this.textureX, this.textureY);
/* 2882 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 97, 257, this.textureX, this.textureY);
/* 2883 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 177, 353, this.textureX, this.textureY);
/* 2884 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 241, 393, this.textureX, this.textureY);
/* 2885 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 281, 393, this.textureX, this.textureY);
/* 2886 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 833, 393, this.textureX, this.textureY);
/* 2887 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 737, 401, this.textureX, this.textureY);
/* 2888 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 25, 409, this.textureX, this.textureY);
/* 2889 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 233, 417, this.textureX, this.textureY);
/* 2890 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 593, 425, this.textureX, this.textureY);
/* 2891 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 633, 425, this.textureX, this.textureY);
/* 2892 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 673, 425, this.textureX, this.textureY);
/* 2893 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 769, 433, this.textureX, this.textureY);
/* 2894 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 841, 433, this.textureX, this.textureY);
/* 2895 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 1001, 433, this.textureX, this.textureY);
/* 2896 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 201, 441, this.textureX, this.textureY);
/* 2897 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 625, 449, this.textureX, this.textureY);
/* 2898 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 985, 457, this.textureX, this.textureY);
/* 2899 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 641, 473, this.textureX, this.textureY);
/* 2900 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 161, 481, this.textureX, this.textureY);
/* 2901 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 225, 481, this.textureX, this.textureY);
/* 2902 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 921, 481, this.textureX, this.textureY);
/* 2903 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 313, 497, this.textureX, this.textureY);
/* 2904 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 993, 521, this.textureX, this.textureY);
/* 2905 */     this.defaultScopeModel[92] = new ModelRendererTurbo(this, 849, 529, this.textureX, this.textureY);
/* 2906 */     this.defaultScopeModel[93] = new ModelRendererTurbo(this, 33, 537, this.textureX, this.textureY);
/* 2907 */     this.defaultScopeModel[94] = new ModelRendererTurbo(this, 193, 537, this.textureX, this.textureY);
/* 2908 */     this.defaultScopeModel[95] = new ModelRendererTurbo(this, 497, 537, this.textureX, this.textureY);
/* 2909 */     this.defaultScopeModel[96] = new ModelRendererTurbo(this, 969, 537, this.textureX, this.textureY);
/* 2910 */     this.defaultScopeModel[97] = new ModelRendererTurbo(this, 593, 553, this.textureX, this.textureY);
/* 2911 */     this.defaultScopeModel[98] = new ModelRendererTurbo(this, 433, 257, this.textureX, this.textureY);
/* 2912 */     this.defaultScopeModel[99] = new ModelRendererTurbo(this, 473, 257, this.textureX, this.textureY);
/* 2913 */     this.defaultScopeModel[100] = new ModelRendererTurbo(this, 497, 257, this.textureX, this.textureY);
/* 2914 */     this.defaultScopeModel[101] = new ModelRendererTurbo(this, 529, 257, this.textureX, this.textureY);
/* 2915 */     this.defaultScopeModel[102] = new ModelRendererTurbo(this, 905, 265, this.textureX, this.textureY);
/* 2916 */     this.defaultScopeModel[103] = new ModelRendererTurbo(this, 265, 281, this.textureX, this.textureY);
/* 2917 */     this.defaultScopeModel[104] = new ModelRendererTurbo(this, 945, 417, this.textureX, this.textureY);
/* 2918 */     this.defaultScopeModel[105] = new ModelRendererTurbo(this, 497, 553, this.textureX, this.textureY);
/* 2919 */     this.defaultScopeModel[106] = new ModelRendererTurbo(this, 513, 561, this.textureX, this.textureY);
/* 2920 */     this.defaultScopeModel[107] = new ModelRendererTurbo(this, 401, 537, this.textureX, this.textureY);
/* 2921 */     this.defaultScopeModel[108] = new ModelRendererTurbo(this, 449, 537, this.textureX, this.textureY);
/* 2922 */     this.defaultScopeModel[109] = new ModelRendererTurbo(this, 1001, 537, this.textureX, this.textureY);
/* 2923 */     this.defaultScopeModel[110] = new ModelRendererTurbo(this, 169, 481, this.textureX, this.textureY);
/* 2924 */     this.defaultScopeModel[111] = new ModelRendererTurbo(this, 177, 553, this.textureX, this.textureY);
/* 2925 */     this.defaultScopeModel[112] = new ModelRendererTurbo(this, 649, 553, this.textureX, this.textureY);
/* 2926 */     this.defaultScopeModel[113] = new ModelRendererTurbo(this, 305, 561, this.textureX, this.textureY);
/* 2927 */     this.defaultScopeModel[114] = new ModelRendererTurbo(this, 369, 561, this.textureX, this.textureY);
/* 2928 */     this.defaultScopeModel[115] = new ModelRendererTurbo(this, 433, 561, this.textureX, this.textureY);
/* 2929 */     this.defaultScopeModel[116] = new ModelRendererTurbo(this, 321, 281, this.textureX, this.textureY);
/* 2930 */     this.defaultScopeModel[117] = new ModelRendererTurbo(this, 721, 281, this.textureX, this.textureY);
/* 2931 */     this.defaultScopeModel[118] = new ModelRendererTurbo(this, 881, 289, this.textureX, this.textureY);
/* 2932 */     this.defaultScopeModel[119] = new ModelRendererTurbo(this, 977, 289, this.textureX, this.textureY);
/* 2933 */     this.defaultScopeModel[120] = new ModelRendererTurbo(this, 673, 297, this.textureX, this.textureY);
/* 2934 */     this.defaultScopeModel[121] = new ModelRendererTurbo(this, 561, 305, this.textureX, this.textureY);
/* 2935 */     this.defaultScopeModel[122] = new ModelRendererTurbo(this, 737, 25, this.textureX, this.textureY);
/* 2936 */     this.defaultScopeModel[123] = new ModelRendererTurbo(this, 761, 25, this.textureX, this.textureY);
/* 2937 */     this.defaultScopeModel[124] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/* 2938 */     this.defaultScopeModel[125] = new ModelRendererTurbo(this, 809, 25, this.textureX, this.textureY);
/* 2939 */     this.defaultScopeModel[126] = new ModelRendererTurbo(this, 833, 25, this.textureX, this.textureY);
/* 2940 */     this.defaultScopeModel[127] = new ModelRendererTurbo(this, 857, 25, this.textureX, this.textureY);
/* 2941 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 905, 25, this.textureX, this.textureY);
/* 2942 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 601, 41, this.textureX, this.textureY);
/* 2943 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 697, 41, this.textureX, this.textureY);
/* 2944 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/* 2945 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 1017, 41, this.textureX, this.textureY);
/* 2946 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 921, 49, this.textureX, this.textureY);
/* 2947 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/* 2948 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 825, 57, this.textureX, this.textureY);
/* 2949 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 873, 57, this.textureX, this.textureY);
/* 2950 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 745, 41, this.textureX, this.textureY);
/* 2951 */     this.defaultScopeModel[''] = new ModelRendererTurbo(this, 793, 41, this.textureX, this.textureY);
/*      */     
/* 2953 */     this.defaultScopeModel[0].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2954 */     this.defaultScopeModel[0].setRotationPoint(-85.0F, -54.25F, 2.5F);
/*      */     
/* 2956 */     this.defaultScopeModel[1].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2957 */     this.defaultScopeModel[1].setRotationPoint(-85.0F, -58.25F, 2.5F);
/*      */     
/* 2959 */     this.defaultScopeModel[2].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2960 */     this.defaultScopeModel[2].setRotationPoint(-39.0F, -54.25F, 2.5F);
/*      */     
/* 2962 */     this.defaultScopeModel[3].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2963 */     this.defaultScopeModel[3].setRotationPoint(-39.0F, -58.25F, 2.5F);
/*      */     
/* 2965 */     this.defaultScopeModel[4].addShapeBox(122.0F, -17.0F, -10.0F, 7, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2966 */     this.defaultScopeModel[4].setRotationPoint(-38.5F, -55.25F, 3.5F);
/*      */     
/* 2968 */     this.defaultScopeModel[5].addShapeBox(122.0F, -17.0F, -10.0F, 7, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2969 */     this.defaultScopeModel[5].setRotationPoint(-84.5F, -55.25F, 3.5F);
/*      */     
/* 2971 */     this.defaultScopeModel[6].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2972 */     this.defaultScopeModel[6].setRotationPoint(-85.0F, -60.75F, 5.5F);
/*      */     
/* 2974 */     this.defaultScopeModel[7].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2975 */     this.defaultScopeModel[7].setRotationPoint(-39.0F, -60.75F, 5.5F);
/*      */     
/* 2977 */     this.defaultScopeModel[8].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2978 */     this.defaultScopeModel[8].setRotationPoint(-82.5F, -52.0F, 1.5F);
/*      */     
/* 2980 */     this.defaultScopeModel[9].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2981 */     this.defaultScopeModel[9].setRotationPoint(-82.5F, -53.0F, 1.5F);
/*      */     
/* 2983 */     this.defaultScopeModel[10].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2984 */     this.defaultScopeModel[10].setRotationPoint(-82.5F, -54.0F, 1.5F);
/*      */     
/* 2986 */     this.defaultScopeModel[11].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2987 */     this.defaultScopeModel[11].setRotationPoint(-36.5F, -52.0F, 1.5F);
/*      */     
/* 2989 */     this.defaultScopeModel[12].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2990 */     this.defaultScopeModel[12].setRotationPoint(-36.5F, -53.0F, 1.5F);
/*      */     
/* 2992 */     this.defaultScopeModel[13].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2993 */     this.defaultScopeModel[13].setRotationPoint(-36.5F, -54.0F, 1.5F);
/*      */     
/* 2995 */     this.defaultScopeModel[14].addShapeBox(122.0F, -17.0F, -10.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2996 */     this.defaultScopeModel[14].setRotationPoint(-85.0F, -58.75F, 14.5F);
/*      */     
/* 2998 */     this.defaultScopeModel[15].addShapeBox(122.0F, -17.0F, -10.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2999 */     this.defaultScopeModel[15].setRotationPoint(-85.0F, -58.75F, 2.5F);
/*      */     
/* 3001 */     this.defaultScopeModel[16].addShapeBox(122.0F, -17.0F, -10.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3002 */     this.defaultScopeModel[16].setRotationPoint(-39.0F, -58.75F, 14.5F);
/*      */     
/* 3004 */     this.defaultScopeModel[17].addShapeBox(122.0F, -17.0F, -10.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3005 */     this.defaultScopeModel[17].setRotationPoint(-39.0F, -58.75F, 2.5F);
/*      */     
/* 3007 */     this.defaultScopeModel[18].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 3008 */     this.defaultScopeModel[18].setRotationPoint(-85.0F, -64.75F, 14.5F);
/*      */     
/* 3010 */     this.defaultScopeModel[19].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 3011 */     this.defaultScopeModel[19].setRotationPoint(-85.0F, -72.75F, 2.5F);
/*      */     
/* 3013 */     this.defaultScopeModel[20].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 3014 */     this.defaultScopeModel[20].setRotationPoint(-39.0F, -64.75F, 14.5F);
/*      */     
/* 3016 */     this.defaultScopeModel[21].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3017 */     this.defaultScopeModel[21].setRotationPoint(-39.0F, -64.75F, 2.5F);
/*      */     
/* 3019 */     this.defaultScopeModel[22].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3020 */     this.defaultScopeModel[22].setRotationPoint(-85.0F, -68.75F, 2.5F);
/*      */     
/* 3022 */     this.defaultScopeModel[23].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3023 */     this.defaultScopeModel[23].setRotationPoint(-85.0F, -64.75F, 2.5F);
/*      */     
/* 3025 */     this.defaultScopeModel[24].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 3026 */     this.defaultScopeModel[24].setRotationPoint(-39.0F, -72.75F, 2.5F);
/*      */     
/* 3028 */     this.defaultScopeModel[25].addShapeBox(122.0F, -17.0F, -10.0F, 8, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3029 */     this.defaultScopeModel[25].setRotationPoint(-39.0F, -68.75F, 2.5F);
/*      */     
/* 3031 */     this.defaultScopeModel[26].addShapeBox(122.0F, -17.0F, -10.0F, 58, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3032 */     this.defaultScopeModel[26].setRotationPoint(-85.0F, -67.25F, 5.5F);
/*      */     
/* 3034 */     this.defaultScopeModel[27].addShapeBox(122.0F, -17.0F, -10.0F, 58, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 3035 */     this.defaultScopeModel[27].setRotationPoint(-85.0F, -64.25F, 5.5F);
/*      */     
/* 3037 */     this.defaultScopeModel[28].addShapeBox(122.0F, -17.0F, -10.0F, 58, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3038 */     this.defaultScopeModel[28].setRotationPoint(-85.0F, -70.25F, 5.5F);
/*      */     
/* 3040 */     this.defaultScopeModel[29].addShapeBox(122.0F, -17.0F, -10.0F, 12, 4, 13, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3041 */     this.defaultScopeModel[29].setRotationPoint(16.25F, -67.75F, 3.0F);
/*      */     
/* 3043 */     this.defaultScopeModel[30].addShapeBox(122.0F, -17.0F, -10.0F, 12, 4, 13, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F);
/* 3044 */     this.defaultScopeModel[30].setRotationPoint(16.25F, -63.25F, 3.0F);
/*      */     
/* 3046 */     this.defaultScopeModel[31].addShapeBox(122.0F, -17.0F, -10.0F, 12, 4, 13, 0.0F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3047 */     this.defaultScopeModel[31].setRotationPoint(16.25F, -72.25F, 3.0F);
/*      */     
/* 3049 */     this.defaultScopeModel[32].addShapeBox(122.0F, -17.0F, -10.0F, 34, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 2.75F, 0.0F, 0.75F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 2.75F, 0.0F, 0.75F, 1.75F, 0.0F, 0.0F, 0.0F);
/* 3050 */     this.defaultScopeModel[32].setRotationPoint(-18.0F, -67.25F, 5.5F);
/*      */     
/* 3052 */     this.defaultScopeModel[33].addShapeBox(122.0F, -17.0F, -10.0F, 34, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 2.75F, 0.0F, -0.75F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 2.25F, -1.75F, 0.0F, 2.25F, -2.75F, 0.0F, 0.0F, -3.0F);
/* 3053 */     this.defaultScopeModel[33].setRotationPoint(-18.0F, -64.25F, 5.5F);
/*      */     
/* 3055 */     this.defaultScopeModel[34].addShapeBox(122.0F, -17.0F, -10.0F, 34, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 2.25F, -1.75F, 0.0F, 2.25F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 2.75F, 0.0F, -0.75F, 1.75F, 0.0F, 0.0F, 0.0F);
/* 3056 */     this.defaultScopeModel[34].setRotationPoint(-18.0F, -70.25F, 5.5F);
/*      */     
/* 3058 */     this.defaultScopeModel[35].addShapeBox(122.0F, -17.0F, -10.0F, 6, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 3059 */     this.defaultScopeModel[35].setRotationPoint(-95.0F, -67.25F, 5.0F);
/*      */     
/* 3061 */     this.defaultScopeModel[36].addShapeBox(122.0F, -17.0F, -10.0F, 6, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F);
/* 3062 */     this.defaultScopeModel[36].setRotationPoint(-95.0F, -63.75F, 5.0F);
/*      */     
/* 3064 */     this.defaultScopeModel[37].addShapeBox(122.0F, -17.0F, -10.0F, 6, 3, 10, 0.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 3065 */     this.defaultScopeModel[37].setRotationPoint(-95.0F, -70.75F, 5.0F);
/*      */     
/* 3067 */     this.defaultScopeModel[38].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 9, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F);
/* 3068 */     this.defaultScopeModel[38].setRotationPoint(-89.0F, -67.25F, 5.5F);
/*      */     
/* 3070 */     this.defaultScopeModel[39].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 9, 0.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F);
/* 3071 */     this.defaultScopeModel[39].setRotationPoint(-89.0F, -70.25F, 5.5F);
/*      */     
/* 3073 */     this.defaultScopeModel[40].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 9, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F);
/* 3074 */     this.defaultScopeModel[40].setRotationPoint(-89.0F, -64.25F, 5.5F);
/*      */     
/* 3076 */     this.defaultScopeModel[41].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F);
/* 3077 */     this.defaultScopeModel[41].setRotationPoint(-98.0F, -67.25F, 5.5F);
/*      */     
/* 3079 */     this.defaultScopeModel[42].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F);
/* 3080 */     this.defaultScopeModel[42].setRotationPoint(-98.0F, -70.25F, 5.5F);
/*      */     
/* 3082 */     this.defaultScopeModel[43].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F);
/* 3083 */     this.defaultScopeModel[43].setRotationPoint(-98.0F, -64.25F, 5.5F);
/*      */     
/* 3085 */     this.defaultScopeModel[44].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3086 */     this.defaultScopeModel[44].setRotationPoint(-100.0F, -67.25F, 5.5F);
/*      */     
/* 3088 */     this.defaultScopeModel[45].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 3089 */     this.defaultScopeModel[45].setRotationPoint(-100.0F, -64.25F, 5.5F);
/*      */     
/* 3091 */     this.defaultScopeModel[46].addShapeBox(122.0F, -17.0F, -10.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3092 */     this.defaultScopeModel[46].setRotationPoint(-100.0F, -70.25F, 5.5F);
/*      */     
/* 3094 */     this.defaultScopeModel[47].addShapeBox(122.0F, -17.0F, -10.0F, 5, 3, 9, 0.0F, 0.0F, 0.75F, 2.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.75F, 1.75F, 0.0F, 0.75F, 2.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.75F, 1.75F);
/* 3095 */     this.defaultScopeModel[47].setRotationPoint(-112.0F, -67.25F, 5.5F);
/*      */     
/* 3097 */     this.defaultScopeModel[48].addShapeBox(122.0F, -17.0F, -10.0F, 5, 3, 9, 0.0F, 0.0F, -0.75F, 2.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.75F, 1.75F, 0.0F, 2.25F, -1.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 2.25F, -2.75F);
/* 3098 */     this.defaultScopeModel[48].setRotationPoint(-112.0F, -64.25F, 5.5F);
/*      */     
/* 3100 */     this.defaultScopeModel[49].addShapeBox(122.0F, -17.0F, -10.0F, 16, 4, 13, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3101 */     this.defaultScopeModel[49].setRotationPoint(-128.25F, -67.75F, 3.0F);
/*      */     
/* 3103 */     this.defaultScopeModel[50].addShapeBox(122.0F, -17.0F, -10.0F, 16, 4, 13, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F);
/* 3104 */     this.defaultScopeModel[50].setRotationPoint(-128.25F, -63.25F, 3.0F);
/*      */     
/* 3106 */     this.defaultScopeModel[51].addShapeBox(122.0F, -17.0F, -10.0F, 16, 4, 13, 0.0F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, -4.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3107 */     this.defaultScopeModel[51].setRotationPoint(-128.25F, -72.25F, 3.0F);
/*      */     
/* 3109 */     this.defaultScopeModel[52].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F);
/* 3110 */     this.defaultScopeModel[52].setRotationPoint(-103.0F, -67.25F, 5.5F);
/*      */     
/* 3112 */     this.defaultScopeModel[53].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F);
/* 3113 */     this.defaultScopeModel[53].setRotationPoint(-103.0F, -70.25F, 5.5F);
/*      */     
/* 3115 */     this.defaultScopeModel[54].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F);
/* 3116 */     this.defaultScopeModel[54].setRotationPoint(-103.0F, -64.25F, 5.5F);
/*      */     
/* 3118 */     this.defaultScopeModel[55].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 3119 */     this.defaultScopeModel[55].setRotationPoint(-107.0F, -67.25F, 5.0F);
/*      */     
/* 3121 */     this.defaultScopeModel[56].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F);
/* 3122 */     this.defaultScopeModel[56].setRotationPoint(-107.0F, -63.75F, 5.0F);
/*      */     
/* 3124 */     this.defaultScopeModel[57].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 10, 0.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 3125 */     this.defaultScopeModel[57].setRotationPoint(-107.0F, -70.75F, 5.0F);
/*      */     
/* 3127 */     this.defaultScopeModel[58].addShapeBox(122.0F, -17.0F, -10.0F, 5, 3, 9, 0.0F, 0.0F, 2.25F, -1.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 2.25F, -2.75F, 0.0F, -0.75F, 2.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.75F, 1.75F);
/* 3128 */     this.defaultScopeModel[58].setRotationPoint(-112.0F, -70.25F, 5.5F);
/*      */     
/* 3130 */     this.defaultScopeModel[59].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F);
/* 3131 */     this.defaultScopeModel[59].setRotationPoint(-20.0F, -67.25F, 5.5F);
/*      */     
/* 3133 */     this.defaultScopeModel[60].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F);
/* 3134 */     this.defaultScopeModel[60].setRotationPoint(-20.0F, -70.25F, 5.5F);
/*      */     
/* 3136 */     this.defaultScopeModel[61].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F);
/* 3137 */     this.defaultScopeModel[61].setRotationPoint(-20.0F, -64.25F, 5.5F);
/*      */     
/* 3139 */     this.defaultScopeModel[62].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 3140 */     this.defaultScopeModel[62].setRotationPoint(-24.0F, -67.25F, 5.0F);
/*      */     
/* 3142 */     this.defaultScopeModel[63].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F);
/* 3143 */     this.defaultScopeModel[63].setRotationPoint(-24.0F, -63.75F, 5.0F);
/*      */     
/* 3145 */     this.defaultScopeModel[64].addShapeBox(122.0F, -17.0F, -10.0F, 4, 3, 10, 0.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 3146 */     this.defaultScopeModel[64].setRotationPoint(-24.0F, -70.75F, 5.0F);
/*      */     
/* 3148 */     this.defaultScopeModel[65].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F);
/* 3149 */     this.defaultScopeModel[65].setRotationPoint(-27.0F, -67.25F, 5.5F);
/*      */     
/* 3151 */     this.defaultScopeModel[66].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F);
/* 3152 */     this.defaultScopeModel[66].setRotationPoint(-27.0F, -70.25F, 5.5F);
/*      */     
/* 3154 */     this.defaultScopeModel[67].addShapeBox(122.0F, -17.0F, -10.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F);
/* 3155 */     this.defaultScopeModel[67].setRotationPoint(-27.0F, -64.25F, 5.5F);
/*      */     
/* 3157 */     this.defaultScopeModel[68].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3158 */     this.defaultScopeModel[68].setRotationPoint(-64.0F, -71.75F, 4.0F);
/*      */     
/* 3160 */     this.defaultScopeModel[69].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3161 */     this.defaultScopeModel[69].setRotationPoint(-60.0F, -71.75F, 4.0F);
/*      */     
/* 3163 */     this.defaultScopeModel[70].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3164 */     this.defaultScopeModel[70].setRotationPoint(-56.0F, -71.75F, 4.0F);
/*      */     
/* 3166 */     this.defaultScopeModel[71].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3167 */     this.defaultScopeModel[71].setRotationPoint(-64.0F, -67.75F, 4.0F);
/*      */     
/* 3169 */     this.defaultScopeModel[72].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3170 */     this.defaultScopeModel[72].setRotationPoint(-60.0F, -67.75F, 4.0F);
/*      */     
/* 3172 */     this.defaultScopeModel[73].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3173 */     this.defaultScopeModel[73].setRotationPoint(-56.0F, -67.75F, 4.0F);
/*      */     
/* 3175 */     this.defaultScopeModel[74].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3176 */     this.defaultScopeModel[74].setRotationPoint(-64.0F, -63.75F, 4.0F);
/*      */     
/* 3178 */     this.defaultScopeModel[75].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3179 */     this.defaultScopeModel[75].setRotationPoint(-60.0F, -63.75F, 4.0F);
/*      */     
/* 3181 */     this.defaultScopeModel[76].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3182 */     this.defaultScopeModel[76].setRotationPoint(-56.0F, -63.75F, 4.0F);
/*      */     
/* 3184 */     this.defaultScopeModel[77].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3185 */     this.defaultScopeModel[77].setRotationPoint(-64.0F, -71.75F, 8.0F);
/*      */     
/* 3187 */     this.defaultScopeModel[78].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3188 */     this.defaultScopeModel[78].setRotationPoint(-60.0F, -71.75F, 8.0F);
/*      */     
/* 3190 */     this.defaultScopeModel[79].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3191 */     this.defaultScopeModel[79].setRotationPoint(-56.0F, -71.75F, 8.0F);
/*      */     
/* 3193 */     this.defaultScopeModel[80].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3194 */     this.defaultScopeModel[80].setRotationPoint(-64.0F, -67.75F, 8.0F);
/*      */     
/* 3196 */     this.defaultScopeModel[81].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3197 */     this.defaultScopeModel[81].setRotationPoint(-60.0F, -67.75F, 8.0F);
/*      */     
/* 3199 */     this.defaultScopeModel[82].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3200 */     this.defaultScopeModel[82].setRotationPoint(-56.0F, -67.75F, 8.0F);
/*      */     
/* 3202 */     this.defaultScopeModel[83].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3203 */     this.defaultScopeModel[83].setRotationPoint(-64.0F, -63.75F, 8.0F);
/*      */     
/* 3205 */     this.defaultScopeModel[84].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3206 */     this.defaultScopeModel[84].setRotationPoint(-60.0F, -63.75F, 8.0F);
/*      */     
/* 3208 */     this.defaultScopeModel[85].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3209 */     this.defaultScopeModel[85].setRotationPoint(-56.0F, -63.75F, 8.0F);
/*      */     
/* 3211 */     this.defaultScopeModel[86].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3212 */     this.defaultScopeModel[86].setRotationPoint(-64.0F, -71.75F, 12.0F);
/*      */     
/* 3214 */     this.defaultScopeModel[87].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3215 */     this.defaultScopeModel[87].setRotationPoint(-60.0F, -71.75F, 12.0F);
/*      */     
/* 3217 */     this.defaultScopeModel[88].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3218 */     this.defaultScopeModel[88].setRotationPoint(-56.0F, -71.75F, 12.0F);
/*      */     
/* 3220 */     this.defaultScopeModel[89].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3221 */     this.defaultScopeModel[89].setRotationPoint(-64.0F, -67.75F, 12.0F);
/*      */     
/* 3223 */     this.defaultScopeModel[90].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3224 */     this.defaultScopeModel[90].setRotationPoint(-60.0F, -67.75F, 12.0F);
/*      */     
/* 3226 */     this.defaultScopeModel[91].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3227 */     this.defaultScopeModel[91].setRotationPoint(-56.0F, -67.75F, 12.0F);
/*      */     
/* 3229 */     this.defaultScopeModel[92].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 3230 */     this.defaultScopeModel[92].setRotationPoint(-64.0F, -63.75F, 12.0F);
/*      */     
/* 3232 */     this.defaultScopeModel[93].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3233 */     this.defaultScopeModel[93].setRotationPoint(-60.0F, -63.75F, 12.0F);
/*      */     
/* 3235 */     this.defaultScopeModel[94].addShapeBox(122.0F, -17.0F, -10.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3236 */     this.defaultScopeModel[94].setRotationPoint(-56.0F, -63.75F, 12.0F);
/*      */     
/* 3238 */     this.defaultScopeModel[95].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3239 */     this.defaultScopeModel[95].setRotationPoint(-62.5F, -67.25F, 15.5F);
/*      */     
/* 3241 */     this.defaultScopeModel[96].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 5, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3242 */     this.defaultScopeModel[96].setRotationPoint(-62.5F, -70.25F, 15.5F);
/*      */     
/* 3244 */     this.defaultScopeModel[97].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3245 */     this.defaultScopeModel[97].setRotationPoint(-62.5F, -64.25F, 15.5F);
/*      */     
/* 3247 */     this.defaultScopeModel[98].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3248 */     this.defaultScopeModel[98].setRotationPoint(-62.5F, -67.25F, 22.0F);
/*      */     
/* 3250 */     this.defaultScopeModel[99].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3251 */     this.defaultScopeModel[99].setRotationPoint(-62.5F, -70.25F, 22.0F);
/*      */     
/* 3253 */     this.defaultScopeModel[100].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3254 */     this.defaultScopeModel[100].setRotationPoint(-62.5F, -64.25F, 22.0F);
/*      */     
/* 3256 */     this.defaultScopeModel[101].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3257 */     this.defaultScopeModel[101].setRotationPoint(-62.0F, -67.25F, 20.0F);
/*      */     
/* 3259 */     this.defaultScopeModel[102].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F);
/* 3260 */     this.defaultScopeModel[102].setRotationPoint(-62.0F, -64.75F, 20.0F);
/*      */     
/* 3262 */     this.defaultScopeModel[103].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 2, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3263 */     this.defaultScopeModel[103].setRotationPoint(-62.0F, -69.75F, 20.0F);
/*      */     
/* 3265 */     this.defaultScopeModel[104].addShapeBox(122.0F, -17.0F, -10.0F, 3, 6, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3266 */     this.defaultScopeModel[104].setRotationPoint(-59.5F, -75.75F, 5.5F);
/*      */     
/* 3268 */     this.defaultScopeModel[105].addShapeBox(122.0F, -17.0F, -10.0F, 3, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 3269 */     this.defaultScopeModel[105].setRotationPoint(-56.5F, -75.75F, 5.5F);
/*      */     
/* 3271 */     this.defaultScopeModel[106].addShapeBox(122.0F, -17.0F, -10.0F, 3, 7, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 3272 */     this.defaultScopeModel[106].setRotationPoint(-62.5F, -75.75F, 5.5F);
/*      */     
/* 3274 */     this.defaultScopeModel[107].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 8, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 3275 */     this.defaultScopeModel[107].setRotationPoint(-59.5F, -76.75F, 6.0F);
/*      */     
/* 3277 */     this.defaultScopeModel[108].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 8, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F);
/* 3278 */     this.defaultScopeModel[108].setRotationPoint(-57.0F, -76.75F, 6.0F);
/*      */     
/* 3280 */     this.defaultScopeModel[109].addShapeBox(122.0F, -17.0F, -10.0F, 3, 1, 8, 0.0F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F);
/* 3281 */     this.defaultScopeModel[109].setRotationPoint(-62.0F, -76.75F, 6.0F);
/*      */     
/* 3283 */     this.defaultScopeModel[110].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3284 */     this.defaultScopeModel[110].setRotationPoint(-59.5F, -78.75F, 5.5F);
/*      */     
/* 3286 */     this.defaultScopeModel[111].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 3287 */     this.defaultScopeModel[111].setRotationPoint(-56.5F, -78.75F, 5.5F);
/*      */     
/* 3289 */     this.defaultScopeModel[112].addShapeBox(122.0F, -17.0F, -10.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 3290 */     this.defaultScopeModel[112].setRotationPoint(-62.5F, -78.75F, 5.5F);
/*      */     
/* 3292 */     this.defaultScopeModel[113].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3293 */     this.defaultScopeModel[113].setRotationPoint(-62.5F, -67.25F, -0.5F);
/*      */     
/* 3295 */     this.defaultScopeModel[114].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 5, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3296 */     this.defaultScopeModel[114].setRotationPoint(-62.5F, -70.25F, -0.5F);
/*      */     
/* 3298 */     this.defaultScopeModel[115].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3299 */     this.defaultScopeModel[115].setRotationPoint(-62.5F, -64.25F, -0.5F);
/*      */     
/* 3301 */     this.defaultScopeModel[116].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3302 */     this.defaultScopeModel[116].setRotationPoint(-62.0F, -67.25F, -2.0F);
/*      */     
/* 3304 */     this.defaultScopeModel[117].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F);
/* 3305 */     this.defaultScopeModel[117].setRotationPoint(-62.0F, -64.75F, -2.0F);
/*      */     
/* 3307 */     this.defaultScopeModel[118].addShapeBox(122.0F, -17.0F, -10.0F, 8, 3, 2, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3308 */     this.defaultScopeModel[118].setRotationPoint(-62.0F, -69.75F, -2.0F);
/*      */     
/* 3310 */     this.defaultScopeModel[119].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3311 */     this.defaultScopeModel[119].setRotationPoint(-62.5F, -67.25F, -3.0F);
/*      */     
/* 3313 */     this.defaultScopeModel[120].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3314 */     this.defaultScopeModel[120].setRotationPoint(-62.5F, -70.25F, -3.0F);
/*      */     
/* 3316 */     this.defaultScopeModel[121].addShapeBox(122.0F, -17.0F, -10.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 3317 */     this.defaultScopeModel[121].setRotationPoint(-62.5F, -64.25F, -3.0F);
/*      */     
/* 3319 */     this.defaultScopeModel[122].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3320 */     this.defaultScopeModel[122].setRotationPoint(-129.25F, -67.75F, 2.5F);
/*      */     
/* 3322 */     this.defaultScopeModel[123].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3323 */     this.defaultScopeModel[123].setRotationPoint(-129.25F, -67.75F, 2.5F);
/*      */     
/* 3325 */     this.defaultScopeModel[124].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 4.25F, -0.25F, 0.25F, 4.25F, -0.25F, 0.25F, -4.75F, 0.0F, 0.25F, -4.75F);
/* 3326 */     this.defaultScopeModel[124].setRotationPoint(-129.25F, -63.25F, 14.5F);
/*      */     
/* 3328 */     this.defaultScopeModel[125].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -4.75F, -0.25F, 0.25F, -4.75F, -0.25F, 0.25F, 4.25F, 0.0F, 0.25F, 4.25F);
/* 3329 */     this.defaultScopeModel[125].setRotationPoint(-129.25F, -63.25F, 2.5F);
/*      */     
/* 3331 */     this.defaultScopeModel[126].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3332 */     this.defaultScopeModel[126].setRotationPoint(-129.25F, -67.75F, 14.5F);
/*      */     
/* 3334 */     this.defaultScopeModel[127].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, 4.25F, -0.25F, 0.25F, 4.25F, -0.25F, 0.25F, -4.75F, 0.0F, 0.25F, -4.75F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3335 */     this.defaultScopeModel[127].setRotationPoint(-129.25F, -72.25F, 14.5F);
/*      */     
/* 3337 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -4.75F, -0.25F, 0.25F, -4.75F, -0.25F, 0.25F, 4.25F, 0.0F, 0.25F, 4.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3338 */     this.defaultScopeModel[''].setRotationPoint(-129.25F, -72.25F, 2.5F);
/*      */     
/* 3340 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 5, 0.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3341 */     this.defaultScopeModel[''].setRotationPoint(-129.25F, -72.25F, 7.0F);
/*      */     
/* 3343 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 5, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F);
/* 3344 */     this.defaultScopeModel[''].setRotationPoint(-129.25F, -60.25F, 7.0F);
/*      */     
/* 3346 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3347 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -67.75F, 2.5F);
/*      */     
/* 3349 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 4.25F, -0.25F, 0.25F, 4.25F, -0.25F, 0.25F, -4.75F, 0.0F, 0.25F, -4.75F);
/* 3350 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -63.25F, 14.5F);
/*      */     
/* 3352 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -4.75F, -0.25F, 0.25F, -4.75F, -0.25F, 0.25F, 4.25F, 0.0F, 0.25F, 4.25F);
/* 3353 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -63.25F, 2.5F);
/*      */     
/* 3355 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3356 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -67.75F, 14.5F);
/*      */     
/* 3358 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, 4.25F, -0.25F, 0.25F, 4.25F, -0.25F, 0.25F, -4.75F, 0.0F, 0.25F, -4.75F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3359 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -72.25F, 14.5F);
/*      */     
/* 3361 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, -4.75F, -0.25F, 0.25F, -4.75F, -0.25F, 0.25F, 4.25F, 0.0F, 0.25F, 4.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3362 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -72.25F, 2.5F);
/*      */     
/* 3364 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 5, 0.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3365 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -72.25F, 7.0F);
/*      */     
/* 3367 */     this.defaultScopeModel[''].addShapeBox(122.0F, -17.0F, -10.0F, 1, 1, 5, 0.0F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F);
/* 3368 */     this.defaultScopeModel[''].setRotationPoint(28.5F, -60.25F, 7.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 3373 */     this.ammoModel[0] = new ModelRendererTurbo(this, 257, 457, this.textureX, this.textureY);
/* 3374 */     this.ammoModel[1] = new ModelRendererTurbo(this, 953, 457, this.textureX, this.textureY);
/* 3375 */     this.ammoModel[2] = new ModelRendererTurbo(this, 665, 465, this.textureX, this.textureY);
/* 3376 */     this.ammoModel[3] = new ModelRendererTurbo(this, 377, 465, this.textureX, this.textureY);
/* 3377 */     this.ammoModel[4] = new ModelRendererTurbo(this, 585, 457, this.textureX, this.textureY);
/* 3378 */     this.ammoModel[5] = new ModelRendererTurbo(this, 993, 457, this.textureX, this.textureY);
/* 3379 */     this.ammoModel[6] = new ModelRendererTurbo(this, 337, 465, this.textureX, this.textureY);
/* 3380 */     this.ammoModel[7] = new ModelRendererTurbo(this, 225, 497, this.textureX, this.textureY);
/*      */     
/* 3382 */     this.ammoModel[0].addShapeBox(122.0F, -17.0F, -10.0F, 6, 23, 14, 0.0F, 1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F);
/* 3383 */     this.ammoModel[0].setRotationPoint(-51.0F, -15.5F, 3.0F);
/*      */     
/* 3385 */     this.ammoModel[1].addShapeBox(122.0F, -17.0F, -10.0F, 5, 26, 14, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 3386 */     this.ammoModel[1].setRotationPoint(-80.0F, -15.5F, 3.0F);
/*      */     
/* 3388 */     this.ammoModel[2].addShapeBox(122.0F, -17.0F, -10.0F, 13, 25, 14, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F);
/* 3389 */     this.ammoModel[2].setRotationPoint(-73.0F, -15.5F, 3.0F);
/*      */     
/* 3391 */     this.ammoModel[3].addShapeBox(122.0F, -17.0F, -10.0F, 4, 24, 14, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F);
/* 3392 */     this.ammoModel[3].setRotationPoint(-59.0F, -15.5F, 3.0F);
/*      */     
/* 3394 */     this.ammoModel[4].addShapeBox(122.0F, -17.0F, -10.0F, 2, 26, 11, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 3395 */     this.ammoModel[4].setRotationPoint(-75.0F, -15.5F, 4.5F);
/*      */     
/* 3397 */     this.ammoModel[5].addShapeBox(122.0F, -17.0F, -10.0F, 1, 25, 11, 0.0F, 0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 3398 */     this.ammoModel[5].setRotationPoint(-59.75F, -15.5F, 4.5F);
/*      */     
/* 3400 */     this.ammoModel[6].addShapeBox(122.0F, -17.0F, -10.0F, 2, 25, 11, 0.0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, 1.75F, -1.25F, 0.0F, 1.75F, -1.25F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 3401 */     this.ammoModel[6].setRotationPoint(-54.25F, -15.5F, 4.5F);
/*      */     
/* 3403 */     this.ammoModel[7].addShapeBox(122.0F, -17.0F, -10.0F, 36, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3404 */     this.ammoModel[7].setRotationPoint(-80.0F, 10.0F, 2.5F);
/*      */   }
/*      */   
/*      */   private void initpumpModel_1()
/*      */   {
/* 3409 */     this.pumpModel[0] = new ModelRendererTurbo(this, 721, 481, this.textureX, this.textureY);
/* 3410 */     this.pumpModel[1] = new ModelRendererTurbo(this, 1, 497, this.textureX, this.textureY);
/* 3411 */     this.pumpModel[2] = new ModelRendererTurbo(this, 409, 497, this.textureX, this.textureY);
/* 3412 */     this.pumpModel[3] = new ModelRendererTurbo(this, 817, 273, this.textureX, this.textureY);
/* 3413 */     this.pumpModel[4] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/* 3414 */     this.pumpModel[5] = new ModelRendererTurbo(this, 921, 497, this.textureX, this.textureY);
/* 3415 */     this.pumpModel[6] = new ModelRendererTurbo(this, 113, 297, this.textureX, this.textureY);
/*      */     
/* 3417 */     this.pumpModel[0].addShapeBox(122.0F, -17.0F, -10.0F, 86, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3418 */     this.pumpModel[0].setRotationPoint(-128.0F, -41.0F, 5.5F);
/*      */     
/* 3420 */     this.pumpModel[1].addShapeBox(122.0F, -17.0F, -10.0F, 86, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3421 */     this.pumpModel[1].setRotationPoint(-128.0F, -38.0F, 5.5F);
/*      */     
/* 3423 */     this.pumpModel[2].addShapeBox(122.0F, -17.0F, -10.0F, 86, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 3424 */     this.pumpModel[2].setRotationPoint(-128.0F, -35.0F, 5.5F);
/*      */     
/* 3426 */     this.pumpModel[3].addShapeBox(122.0F, -17.0F, -10.0F, 5, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 3427 */     this.pumpModel[3].setRotationPoint(-123.0F, -35.0F, 1.5F);
/*      */     
/* 3429 */     this.pumpModel[4].addShapeBox(122.0F, -17.0F, -10.0F, 5, 3, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3430 */     this.pumpModel[4].setRotationPoint(-123.0F, -38.0F, 1.5F);
/*      */     
/* 3432 */     this.pumpModel[5].addShapeBox(122.0F, -17.0F, -10.0F, 5, 5, 13, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.5F, 0.0F, 0.0F, 9.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3433 */     this.pumpModel[5].setRotationPoint(-123.0F, -36.0F, -11.5F);
/*      */     
/* 3435 */     this.pumpModel[6].addShapeBox(122.0F, -17.0F, -10.0F, 7, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3436 */     this.pumpModel[6].setRotationPoint(-124.0F, -33.5F, -9.25F);
/* 3437 */     this.pumpModel[6].rotateAngleX = 0.6981317F;
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modeljng90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */