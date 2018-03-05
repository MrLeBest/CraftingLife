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
/*      */ public class Modeldsr
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modeldsr()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ȩ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[94];
/*   23 */     this.ammoModel = new ModelRendererTurbo[16];
/*   24 */     this.pumpModel = new ModelRendererTurbo[23];
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
/*   36 */     this.animationType = EnumAnimationType.CUSTOM;this.tiltGun = 5.0F;
/*   37 */     this.rotateGunVertical = 40.0F;
/*   38 */     this.rotateGunHorizontal = 0.0F;
/*   39 */     this.translateGun = new Vector3f(0.5F, 0.0F, 0.0F);
/*      */     
/*   41 */     this.rotateClipVertical = 5.0F;
/*   42 */     this.translateClip = new Vector3f(-5.0F, -22.0F, 0.0F);
/*   43 */     this.pumpDelayAfterReload = 50;this.pumpDelay = 10;
/*   44 */     this.pumpTime = 33;
/*   45 */     this.gripIsOnPump = false;
/*   46 */     this.pumpHandleDistance = 0.5F;
/*      */     
/*   48 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   53 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[1] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[2] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[3] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[4] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[5] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[6] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[7] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[8] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[9] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[10] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[11] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[12] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[13] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[14] = new ModelRendererTurbo(this, 537, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[15] = new ModelRendererTurbo(this, 665, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[16] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[17] = new ModelRendererTurbo(this, 729, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[18] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[19] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[20] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[21] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/*   75 */     this.gunModel[22] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*   76 */     this.gunModel[23] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*   77 */     this.gunModel[24] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[25] = new ModelRendererTurbo(this, 689, 17, this.textureX, this.textureY);
/*   79 */     this.gunModel[26] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*   80 */     this.gunModel[27] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*   81 */     this.gunModel[28] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*   82 */     this.gunModel[29] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   83 */     this.gunModel[30] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*   84 */     this.gunModel[31] = new ModelRendererTurbo(this, 585, 25, this.textureX, this.textureY);
/*   85 */     this.gunModel[32] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*   86 */     this.gunModel[33] = new ModelRendererTurbo(this, 537, 25, this.textureX, this.textureY);
/*   87 */     this.gunModel[34] = new ModelRendererTurbo(this, 633, 25, this.textureX, this.textureY);
/*   88 */     this.gunModel[35] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*   89 */     this.gunModel[36] = new ModelRendererTurbo(this, 657, 33, this.textureX, this.textureY);
/*   90 */     this.gunModel[37] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[38] = new ModelRendererTurbo(this, 849, 33, this.textureX, this.textureY);
/*   92 */     this.gunModel[39] = new ModelRendererTurbo(this, 905, 33, this.textureX, this.textureY);
/*   93 */     this.gunModel[40] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*   94 */     this.gunModel[41] = new ModelRendererTurbo(this, 681, 41, this.textureX, this.textureY);
/*   95 */     this.gunModel[42] = new ModelRendererTurbo(this, 737, 41, this.textureX, this.textureY);
/*   96 */     this.gunModel[43] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/*   97 */     this.gunModel[44] = new ModelRendererTurbo(this, 617, 41, this.textureX, this.textureY);
/*   98 */     this.gunModel[45] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*   99 */     this.gunModel[46] = new ModelRendererTurbo(this, 585, 49, this.textureX, this.textureY);
/*  100 */     this.gunModel[47] = new ModelRendererTurbo(this, 649, 49, this.textureX, this.textureY);
/*  101 */     this.gunModel[48] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  102 */     this.gunModel[49] = new ModelRendererTurbo(this, 785, 49, this.textureX, this.textureY);
/*  103 */     this.gunModel[50] = new ModelRendererTurbo(this, 889, 49, this.textureX, this.textureY);
/*  104 */     this.gunModel[51] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  105 */     this.gunModel[52] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  106 */     this.gunModel[53] = new ModelRendererTurbo(this, 953, 49, this.textureX, this.textureY);
/*  107 */     this.gunModel[54] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  108 */     this.gunModel[55] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  109 */     this.gunModel[56] = new ModelRendererTurbo(this, 825, 49, this.textureX, this.textureY);
/*  110 */     this.gunModel[57] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/*  111 */     this.gunModel[58] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/*  112 */     this.gunModel[59] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/*  113 */     this.gunModel[60] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/*  114 */     this.gunModel[61] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*  115 */     this.gunModel[62] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  116 */     this.gunModel[63] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*  117 */     this.gunModel[64] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  118 */     this.gunModel[65] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*  119 */     this.gunModel[66] = new ModelRendererTurbo(this, 521, 57, this.textureX, this.textureY);
/*  120 */     this.gunModel[67] = new ModelRendererTurbo(this, 681, 57, this.textureX, this.textureY);
/*  121 */     this.gunModel[68] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  122 */     this.gunModel[69] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  123 */     this.gunModel[70] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  124 */     this.gunModel[71] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  125 */     this.gunModel[72] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  126 */     this.gunModel[73] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  127 */     this.gunModel[74] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[75] = new ModelRendererTurbo(this, 561, 57, this.textureX, this.textureY);
/*  129 */     this.gunModel[76] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[77] = new ModelRendererTurbo(this, 617, 57, this.textureX, this.textureY);
/*  131 */     this.gunModel[78] = new ModelRendererTurbo(this, 729, 57, this.textureX, this.textureY);
/*  132 */     this.gunModel[79] = new ModelRendererTurbo(this, 761, 57, this.textureX, this.textureY);
/*  133 */     this.gunModel[80] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  134 */     this.gunModel[81] = new ModelRendererTurbo(this, 849, 57, this.textureX, this.textureY);
/*  135 */     this.gunModel[82] = new ModelRendererTurbo(this, 1001, 49, this.textureX, this.textureY);
/*  136 */     this.gunModel[83] = new ModelRendererTurbo(this, 809, 57, this.textureX, this.textureY);
/*  137 */     this.gunModel[84] = new ModelRendererTurbo(this, 937, 57, this.textureX, this.textureY);
/*  138 */     this.gunModel[85] = new ModelRendererTurbo(this, 161, 65, this.textureX, this.textureY);
/*  139 */     this.gunModel[86] = new ModelRendererTurbo(this, 633, 65, this.textureX, this.textureY);
/*  140 */     this.gunModel[87] = new ModelRendererTurbo(this, 585, 65, this.textureX, this.textureY);
/*  141 */     this.gunModel[88] = new ModelRendererTurbo(this, 873, 65, this.textureX, this.textureY);
/*  142 */     this.gunModel[89] = new ModelRendererTurbo(this, 785, 65, this.textureX, this.textureY);
/*  143 */     this.gunModel[90] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  144 */     this.gunModel[91] = new ModelRendererTurbo(this, 905, 65, this.textureX, this.textureY);
/*  145 */     this.gunModel[92] = new ModelRendererTurbo(this, 961, 65, this.textureX, this.textureY);
/*  146 */     this.gunModel[93] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/*  147 */     this.gunModel[94] = new ModelRendererTurbo(this, 521, 17, this.textureX, this.textureY);
/*  148 */     this.gunModel[95] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/*  149 */     this.gunModel[96] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  150 */     this.gunModel[97] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/*  151 */     this.gunModel[98] = new ModelRendererTurbo(this, 425, 65, this.textureX, this.textureY);
/*  152 */     this.gunModel[99] = new ModelRendererTurbo(this, 745, 65, this.textureX, this.textureY);
/*  153 */     this.gunModel[100] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  154 */     this.gunModel[101] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/*  155 */     this.gunModel[102] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/*  156 */     this.gunModel[103] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/*  157 */     this.gunModel[104] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/*  158 */     this.gunModel[105] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/*  159 */     this.gunModel[106] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/*  160 */     this.gunModel[107] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/*  161 */     this.gunModel[108] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/*  162 */     this.gunModel[109] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  163 */     this.gunModel[110] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  164 */     this.gunModel[111] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/*  165 */     this.gunModel[112] = new ModelRendererTurbo(this, 537, 73, this.textureX, this.textureY);
/*  166 */     this.gunModel[113] = new ModelRendererTurbo(this, 569, 73, this.textureX, this.textureY);
/*  167 */     this.gunModel[114] = new ModelRendererTurbo(this, 673, 73, this.textureX, this.textureY);
/*  168 */     this.gunModel[115] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  169 */     this.gunModel[116] = new ModelRendererTurbo(this, 705, 81, this.textureX, this.textureY);
/*  170 */     this.gunModel[117] = new ModelRendererTurbo(this, 825, 73, this.textureX, this.textureY);
/*  171 */     this.gunModel[118] = new ModelRendererTurbo(this, 609, 73, this.textureX, this.textureY);
/*  172 */     this.gunModel[119] = new ModelRendererTurbo(this, 913, 73, this.textureX, this.textureY);
/*  173 */     this.gunModel[120] = new ModelRendererTurbo(this, 937, 81, this.textureX, this.textureY);
/*  174 */     this.gunModel[121] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  175 */     this.gunModel[122] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/*  176 */     this.gunModel[123] = new ModelRendererTurbo(this, 633, 81, this.textureX, this.textureY);
/*  177 */     this.gunModel[124] = new ModelRendererTurbo(this, 801, 81, this.textureX, this.textureY);
/*  178 */     this.gunModel[125] = new ModelRendererTurbo(this, 889, 81, this.textureX, this.textureY);
/*  179 */     this.gunModel[126] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/*  180 */     this.gunModel[127] = new ModelRendererTurbo(this, 177, 89, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 89, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 857, 73, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 521, 81, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 81, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 769, 81, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 537, 89, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 89, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 825, 89, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 585, 97, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 97, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 673, 97, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 97, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 97, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 97, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 913, 97, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 105, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 529, 105, this.textureX, this.textureY);
/*  211 */     this.gunModel[''] = new ModelRendererTurbo(this, 569, 105, this.textureX, this.textureY);
/*  212 */     this.gunModel[''] = new ModelRendererTurbo(this, 625, 105, this.textureX, this.textureY);
/*  213 */     this.gunModel[' '] = new ModelRendererTurbo(this, 657, 105, this.textureX, this.textureY);
/*  214 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 769, 105, this.textureX, this.textureY);
/*  215 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 825, 105, this.textureX, this.textureY);
/*  216 */     this.gunModel['£'] = new ModelRendererTurbo(this, 713, 105, this.textureX, this.textureY);
/*  217 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 881, 105, this.textureX, this.textureY);
/*  218 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 929, 105, this.textureX, this.textureY);
/*  219 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 961, 105, this.textureX, this.textureY);
/*  220 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  221 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/*  222 */     this.gunModel['©'] = new ModelRendererTurbo(this, 993, 105, this.textureX, this.textureY);
/*  223 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 113, 113, this.textureX, this.textureY);
/*  224 */     this.gunModel['«'] = new ModelRendererTurbo(this, 145, 113, this.textureX, this.textureY);
/*  225 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*  226 */     this.gunModel['­'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/*  227 */     this.gunModel['®'] = new ModelRendererTurbo(this, 265, 113, this.textureX, this.textureY);
/*  228 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/*  229 */     this.gunModel['°'] = new ModelRendererTurbo(this, 585, 113, this.textureX, this.textureY);
/*  230 */     this.gunModel['±'] = new ModelRendererTurbo(this, 673, 113, this.textureX, this.textureY);
/*  231 */     this.gunModel['²'] = new ModelRendererTurbo(this, 729, 113, this.textureX, this.textureY);
/*  232 */     this.gunModel['³'] = new ModelRendererTurbo(this, 345, 121, this.textureX, this.textureY);
/*  233 */     this.gunModel['´'] = new ModelRendererTurbo(this, 393, 113, this.textureX, this.textureY);
/*  234 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  235 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 505, 113, this.textureX, this.textureY);
/*  236 */     this.gunModel['·'] = new ModelRendererTurbo(this, 545, 113, this.textureX, this.textureY);
/*  237 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 641, 113, this.textureX, this.textureY);
/*  238 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 809, 113, this.textureX, this.textureY);
/*  239 */     this.gunModel['º'] = new ModelRendererTurbo(this, 865, 113, this.textureX, this.textureY);
/*  240 */     this.gunModel['»'] = new ModelRendererTurbo(this, 897, 113, this.textureX, this.textureY);
/*  241 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 409, 121, this.textureX, this.textureY);
/*  242 */     this.gunModel['½'] = new ModelRendererTurbo(this, 465, 121, this.textureX, this.textureY);
/*  243 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 521, 121, this.textureX, this.textureY);
/*  244 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 769, 121, this.textureX, this.textureY);
/*  245 */     this.gunModel['À'] = new ModelRendererTurbo(this, 825, 121, this.textureX, this.textureY);
/*  246 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 561, 121, this.textureX, this.textureY);
/*  247 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 921, 121, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 969, 121, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  250 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 33, 129, this.textureX, this.textureY);
/*  251 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 65, 129, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/*  253 */     this.gunModel['È'] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  254 */     this.gunModel['É'] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 593, 129, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 633, 129, this.textureX, this.textureY);
/*  258 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 673, 129, this.textureX, this.textureY);
/*  259 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 713, 129, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 865, 129, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 313, 137, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*  266 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 921, 1, this.textureX, this.textureY);
/*  268 */     this.gunModel['×'] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*  270 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/*  271 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  272 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  273 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 617, 25, this.textureX, this.textureY);
/*  274 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 385, 129, this.textureX, this.textureY);
/*  275 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 449, 129, this.textureX, this.textureY);
/*  276 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/*  277 */     this.gunModel['à'] = new ModelRendererTurbo(this, 545, 129, this.textureX, this.textureY);
/*  278 */     this.gunModel['á'] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/*  279 */     this.gunModel['â'] = new ModelRendererTurbo(this, 617, 129, this.textureX, this.textureY);
/*  280 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 657, 129, this.textureX, this.textureY);
/*  281 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 465, 137, this.textureX, this.textureY);
/*  282 */     this.gunModel['å'] = new ModelRendererTurbo(this, 737, 137, this.textureX, this.textureY);
/*  283 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 697, 129, this.textureX, this.textureY);
/*  284 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 809, 129, this.textureX, this.textureY);
/*  285 */     this.gunModel['è'] = new ModelRendererTurbo(this, 161, 137, this.textureX, this.textureY);
/*  286 */     this.gunModel['é'] = new ModelRendererTurbo(this, 337, 137, this.textureX, this.textureY);
/*  287 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 825, 137, this.textureX, this.textureY);
/*  288 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 889, 137, this.textureX, this.textureY);
/*  289 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 785, 137, this.textureX, this.textureY);
/*  290 */     this.gunModel['í'] = new ModelRendererTurbo(this, 937, 137, this.textureX, this.textureY);
/*  291 */     this.gunModel['î'] = new ModelRendererTurbo(this, 969, 137, this.textureX, this.textureY);
/*  292 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 89, 145, this.textureX, this.textureY);
/*  293 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/*  294 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/*  295 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 121, 145, this.textureX, this.textureY);
/*  296 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/*  297 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 377, 145, this.textureX, this.textureY);
/*  298 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 441, 145, this.textureX, this.textureY);
/*  299 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 505, 145, this.textureX, this.textureY);
/*  300 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 553, 145, this.textureX, this.textureY);
/*  301 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 601, 145, this.textureX, this.textureY);
/*  302 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 633, 145, this.textureX, this.textureY);
/*  303 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 665, 145, this.textureX, this.textureY);
/*  304 */     this.gunModel['û'] = new ModelRendererTurbo(this, 697, 145, this.textureX, this.textureY);
/*  305 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 801, 145, this.textureX, this.textureY);
/*  306 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 865, 145, this.textureX, this.textureY);
/*  307 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 953, 145, this.textureX, this.textureY);
/*  308 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 985, 145, this.textureX, this.textureY);
/*  309 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  310 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 33, 153, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 137, 153, this.textureX, this.textureY);
/*  312 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 65, 153, this.textureX, this.textureY);
/*  314 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 105, 153, this.textureX, this.textureY);
/*  315 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 337, 153, this.textureX, this.textureY);
/*  316 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 393, 153, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 425, 153, this.textureX, this.textureY);
/*  318 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 457, 153, this.textureX, this.textureY);
/*  319 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/*  320 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 617, 153, this.textureX, this.textureY);
/*  321 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 713, 153, this.textureX, this.textureY);
/*  322 */     this.gunModel['č'] = new ModelRendererTurbo(this, 761, 153, this.textureX, this.textureY);
/*  323 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 649, 153, this.textureX, this.textureY);
/*  324 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 681, 153, this.textureX, this.textureY);
/*  325 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 817, 153, this.textureX, this.textureY);
/*  326 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 849, 153, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  328 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 1001, 73, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 1001, 89, this.textureX, this.textureY);
/*  330 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 889, 153, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 921, 153, this.textureX, this.textureY);
/*  332 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 833, 33, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 233, 161, this.textureX, this.textureY);
/*  334 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  336 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 273, 169, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 489, 169, this.textureX, this.textureY);
/*  338 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 705, 169, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 241, 177, this.textureX, this.textureY);
/*  340 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 457, 177, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 673, 177, this.textureX, this.textureY);
/*  342 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 945, 161, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1001, 137, this.textureX, this.textureY);
/*  344 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 977, 161, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1001, 161, this.textureX, this.textureY);
/*  346 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 913, 169, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 881, 177, this.textureX, this.textureY);
/*  348 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 25, 185, this.textureX, this.textureY);
/*  350 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 49, 185, this.textureX, this.textureY);
/*  351 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  352 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  353 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  354 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  355 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  356 */     this.gunModel['į'] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*  357 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 73, 185, this.textureX, this.textureY);
/*  358 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 97, 185, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 105, 185, this.textureX, this.textureY);
/*  360 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 177, 185, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 233, 185, this.textureX, this.textureY);
/*  362 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 281, 185, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 921, 177, this.textureX, this.textureY);
/*  364 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 417, 185, this.textureX, this.textureY);
/*  365 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 457, 185, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 497, 185, this.textureX, this.textureY);
/*  367 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 537, 185, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 577, 185, this.textureX, this.textureY);
/*  369 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 617, 185, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 657, 185, this.textureX, this.textureY);
/*  371 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 697, 185, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 737, 185, this.textureX, this.textureY);
/*  373 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 801, 185, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 841, 185, this.textureX, this.textureY);
/*  375 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 945, 185, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 57, 201, this.textureX, this.textureY);
/*  377 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 865, 201, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  379 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 97, 209, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 953, 161, this.textureX, this.textureY);
/*  381 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 209, 185, this.textureX, this.textureY);
/*  382 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 393, 185, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 473, 185, this.textureX, this.textureY);
/*  384 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 553, 185, this.textureX, this.textureY);
/*  385 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 633, 185, this.textureX, this.textureY);
/*  386 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 153, 193, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 433, 193, this.textureX, this.textureY);
/*  388 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 185, 209, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 225, 209, this.textureX, this.textureY);
/*  390 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 513, 193, this.textureX, this.textureY);
/*  391 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 593, 193, this.textureX, this.textureY);
/*  392 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 673, 193, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 969, 193, this.textureX, this.textureY);
/*  394 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 265, 185, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 905, 201, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 273, 209, this.textureX, this.textureY);
/*  398 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 721, 185, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 713, 209, this.textureX, this.textureY);
/*  400 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 993, 185, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 785, 185, this.textureX, this.textureY);
/*  402 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 409, 209, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 825, 185, this.textureX, this.textureY);
/*  404 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 465, 209, this.textureX, this.textureY);
/*  405 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 545, 209, this.textureX, this.textureY);
/*  406 */     this.gunModel['š'] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 625, 209, this.textureX, this.textureY);
/*  408 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 353, 153, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 577, 209, this.textureX, this.textureY);
/*  410 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 865, 185, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 937, 209, this.textureX, this.textureY);
/*  412 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 505, 217, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 657, 217, this.textureX, this.textureY);
/*  414 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 281, 225, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 673, 225, this.textureX, this.textureY);
/*  416 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 833, 217, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 161, 217, this.textureX, this.textureY);
/*  418 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 913, 217, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 441, 217, this.textureX, this.textureY);
/*  420 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 969, 217, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 57, 225, this.textureX, this.textureY);
/*  422 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 609, 217, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 361, 225, this.textureX, this.textureY);
/*  424 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 521, 225, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 625, 225, this.textureX, this.textureY);
/*  426 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 753, 225, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  428 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 81, 233, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 801, 225, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  431 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 193, 233, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 873, 225, this.textureX, this.textureY);
/*  433 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 993, 225, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 129, 233, this.textureX, this.textureY);
/*  435 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 537, 225, this.textureX, this.textureY);
/*  436 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 945, 105, this.textureX, this.textureY);
/*  437 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 977, 105, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 233, 233, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 41, 113, this.textureX, this.textureY);
/*  440 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*  442 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 265, 241, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 609, 241, this.textureX, this.textureY);
/*  445 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 505, 241, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 945, 241, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 193, 249, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 713, 249, this.textureX, this.textureY);
/*  450 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 113, 257, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 873, 249, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 241, 257, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 497, 257, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 913, 257, this.textureX, this.textureY);
/*  455 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 345, 257, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 777, 257, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 369, 241, this.textureX, this.textureY);
/*  462 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 433, 257, this.textureX, this.textureY);
/*  464 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/*  465 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 73, 265, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 169, 265, this.textureX, this.textureY);
/*  467 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 577, 25, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*  470 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  472 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*  473 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  474 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 225, 209, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  477 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 889, 33, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 953, 33, this.textureX, this.textureY);
/*  479 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 729, 41, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 785, 41, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 809, 49, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 937, 49, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 993, 49, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/*  485 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 209, 265, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 393, 265, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 457, 265, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 1009, 33, this.textureX, this.textureY);
/*  490 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  492 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/*  493 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 177, 185, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  495 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 585, 265, this.textureX, this.textureY);
/*  496 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 625, 265, this.textureX, this.textureY);
/*  497 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 657, 265, this.textureX, this.textureY);
/*  498 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 825, 265, this.textureX, this.textureY);
/*  499 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 97, 273, this.textureX, this.textureY);
/*  500 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 337, 273, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 521, 161, this.textureX, this.textureY);
/*  502 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 481, 273, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 153, 281, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/*  505 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 513, 57, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 753, 281, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 417, 273, this.textureX, this.textureY);
/*  508 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 969, 273, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  511 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 785, 241, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 393, 249, this.textureX, this.textureY);
/*  514 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 1, 289, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 441, 281, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 393, 281, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 1001, 273, this.textureX, this.textureY);
/*  518 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 81, 281, this.textureX, this.textureY);
/*  519 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 921, 281, this.textureX, this.textureY);
/*  520 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 97, 289, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 129, 289, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 177, 289, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 209, 289, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 249, 289, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 289, 289, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 745, 289, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 785, 289, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 553, 273, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 561, 289, this.textureX, this.textureY);
/*  530 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  531 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 553, 73, this.textureX, this.textureY);
/*  532 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 825, 289, this.textureX, this.textureY);
/*  533 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 857, 289, this.textureX, this.textureY);
/*  534 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 393, 337, this.textureX, this.textureY);
/*  535 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  536 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  537 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  538 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  539 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  540 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  541 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/*  542 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  543 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 809, 17, this.textureX, this.textureY);
/*  544 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  545 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  546 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  547 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 681, 25, this.textureX, this.textureY);
/*  548 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/*  549 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  550 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  551 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 17, 153, this.textureX, this.textureY);
/*  552 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 553, 329, this.textureX, this.textureY);
/*      */     
/*  554 */     this.gunModel[0].addShapeBox(42.0F, 0.0F, -6.0F, 34, 5, 12, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/*  555 */     this.gunModel[0].setRotationPoint(-19.0F, -36.5F, 0.0F);
/*      */     
/*  557 */     this.gunModel[1].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 12, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F);
/*  558 */     this.gunModel[1].setRotationPoint(-17.9F, -33.75F, -0.25F);
/*      */     
/*  560 */     this.gunModel[2].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F);
/*  561 */     this.gunModel[2].setRotationPoint(-18.9F, -33.75F, -0.25F);
/*      */     
/*  563 */     this.gunModel[3].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F);
/*  564 */     this.gunModel[3].setRotationPoint(-18.9F, -32.85F, -0.25F);
/*      */     
/*  566 */     this.gunModel[4].addShapeBox(42.0F, 0.0F, -6.0F, 4, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 3.5F, 0.0F);
/*  567 */     this.gunModel[4].setRotationPoint(-23.0F, -36.5F, 0.0F);
/*      */     
/*  569 */     this.gunModel[5].addShapeBox(42.0F, 0.0F, -6.0F, 4, 5, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, -0.5F, 0.25F, 0.0F);
/*  570 */     this.gunModel[5].setRotationPoint(-31.0F, -36.5F, 0.0F);
/*      */     
/*  572 */     this.gunModel[6].addShapeBox(42.0F, 0.0F, -6.0F, 4, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  573 */     this.gunModel[6].setRotationPoint(-27.0F, -36.5F, 0.0F);
/*      */     
/*  575 */     this.gunModel[7].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F);
/*  576 */     this.gunModel[7].setRotationPoint(-33.3F, -32.85F, -0.25F);
/*      */     
/*  578 */     this.gunModel[8].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.5F, 0.5F, -1.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -1.75F, -0.25F, 0.5F);
/*  579 */     this.gunModel[8].setRotationPoint(-33.55F, -33.35F, -0.25F);
/*      */     
/*  581 */     this.gunModel[9].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F);
/*  582 */     this.gunModel[9].setRotationPoint(-33.3F, -33.85F, -0.25F);
/*      */     
/*  584 */     this.gunModel[10].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -1.75F, -0.2F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.5F, -1.75F, -0.2F, 0.5F, -1.75F, -0.1F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.5F, -1.75F, -0.1F, 0.5F);
/*  585 */     this.gunModel[10].setRotationPoint(-34.55F, -32.75F, -0.25F);
/*      */     
/*  587 */     this.gunModel[11].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F);
/*  588 */     this.gunModel[11].setRotationPoint(-33.3F, -31.85F, -0.25F);
/*      */     
/*  590 */     this.gunModel[12].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -1.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, -1.25F, 0.25F, 0.5F, -1.25F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.5F, -1.25F, -0.75F, 0.5F);
/*  591 */     this.gunModel[12].setRotationPoint(-33.05F, -31.85F, -0.25F);
/*      */     
/*  593 */     this.gunModel[13].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 12, 0.0F, -0.5F, -1.0F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F);
/*  594 */     this.gunModel[13].setRotationPoint(-33.3F, -34.6F, -0.25F);
/*      */     
/*  596 */     this.gunModel[14].addShapeBox(42.0F, 0.0F, -6.0F, 50, 5, 12, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/*  597 */     this.gunModel[14].setRotationPoint(-80.0F, -36.5F, 0.0F);
/*      */     
/*  599 */     this.gunModel[15].addShapeBox(42.0F, 0.0F, -6.0F, 1, 5, 13, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  600 */     this.gunModel[15].setRotationPoint(-25.5F, -34.5F, -0.25F);
/*      */     
/*  602 */     this.gunModel[16].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 12, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  603 */     this.gunModel[16].setRotationPoint(-26.5F, -29.5F, 0.75F);
/*      */     
/*  605 */     this.gunModel[17].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  606 */     this.gunModel[17].setRotationPoint(-26.5F, -28.5F, 0.75F);
/*      */     
/*  608 */     this.gunModel[18].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  609 */     this.gunModel[18].setRotationPoint(-26.5F, -27.5F, 0.75F);
/*      */     
/*  611 */     this.gunModel[19].addShapeBox(42.0F, 0.0F, -6.0F, 1, 5, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F);
/*  612 */     this.gunModel[19].setRotationPoint(-25.5F, -34.5F, 12.75F);
/*      */     
/*  614 */     this.gunModel[20].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F);
/*  615 */     this.gunModel[20].setRotationPoint(-25.5F, -34.25F, 3.25F);
/*      */     
/*  617 */     this.gunModel[21].addShapeBox(42.0F, 0.0F, -6.0F, 95, 5, 12, 0.0F, 0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  618 */     this.gunModel[21].setRotationPoint(-80.0F, -41.5F, 0.0F);
/*      */     
/*  620 */     this.gunModel[22].addShapeBox(42.0F, 0.0F, -6.0F, 113, 1, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  621 */     this.gunModel[22].setRotationPoint(-70.75F, -42.5F, 4.0F);
/*      */     
/*  623 */     this.gunModel[23].addShapeBox(42.0F, 0.0F, -6.0F, 72, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  624 */     this.gunModel[23].setRotationPoint(-70.75F, -44.0F, 2.0F);
/*      */     
/*  626 */     this.gunModel[24].addShapeBox(42.0F, 0.0F, -6.0F, 27, 1, 4, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/*  627 */     this.gunModel[24].setRotationPoint(15.25F, -41.5F, 4.0F);
/*      */     
/*  629 */     this.gunModel[25].addShapeBox(42.0F, 0.0F, -6.0F, 53, 9, 12, 0.0F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/*  630 */     this.gunModel[25].setRotationPoint(-19.0F, -31.25F, 0.0F);
/*      */     
/*  632 */     this.gunModel[26].addShapeBox(42.0F, 0.0F, -6.0F, 4, 9, 12, 0.0F, 0.0F, -3.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  633 */     this.gunModel[26].setRotationPoint(-23.0F, -31.25F, 0.0F);
/*      */     
/*  635 */     this.gunModel[27].addShapeBox(42.0F, 0.0F, -6.0F, 4, 9, 12, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  636 */     this.gunModel[27].setRotationPoint(-31.0F, -31.25F, 0.0F);
/*      */     
/*  638 */     this.gunModel[28].addShapeBox(42.0F, 0.0F, -6.0F, 4, 9, 12, 0.0F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  639 */     this.gunModel[28].setRotationPoint(-27.0F, -31.25F, 0.0F);
/*      */     
/*  641 */     this.gunModel[29].addShapeBox(42.0F, 0.0F, -6.0F, 74, 9, 12, 0.0F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 18.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 18.5F, 0.0F, 0.5F);
/*  642 */     this.gunModel[29].setRotationPoint(-104.0F, -31.25F, 0.0F);
/*      */     
/*  644 */     this.gunModel[30].addShapeBox(42.0F, 0.0F, -6.0F, 156, 2, 12, 0.0F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F);
/*  645 */     this.gunModel[30].setRotationPoint(-122.0F, -22.25F, 0.0F);
/*      */     
/*  647 */     this.gunModel[31].addBox(42.0F, 0.0F, -6.0F, 9, 5, 11, 0.0F);
/*  648 */     this.gunModel[31].setRotationPoint(-48.0F, -2.0F, 0.5F);
/*      */     
/*  650 */     this.gunModel[32].addShapeBox(42.0F, 0.0F, -6.0F, 9, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  651 */     this.gunModel[32].setRotationPoint(-48.0F, 3.0F, 0.5F);
/*      */     
/*  653 */     this.gunModel[33].addShapeBox(42.0F, 0.0F, -6.0F, 12, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  654 */     this.gunModel[33].setRotationPoint(-48.0F, -5.0F, 0.5F);
/*      */     
/*  656 */     this.gunModel[34].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  657 */     this.gunModel[34].setRotationPoint(-35.25F, -6.0F, 0.5F);
/*      */     
/*  659 */     this.gunModel[35].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, -1.0F, -0.25F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[35].setRotationPoint(-35.25F, -7.0F, 0.5F);
/*      */     
/*  662 */     this.gunModel[36].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  663 */     this.gunModel[36].setRotationPoint(-35.25F, -8.5F, 0.5F);
/*      */     
/*  665 */     this.gunModel[37].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, -4.5F, 0.5F, 0.0F, -4.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  666 */     this.gunModel[37].setRotationPoint(-35.25F, -10.5F, 0.5F);
/*      */     
/*  668 */     this.gunModel[38].addShapeBox(42.0F, 0.0F, -6.0F, 13, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  669 */     this.gunModel[38].setRotationPoint(-48.0F, -11.0F, 0.5F);
/*      */     
/*  671 */     this.gunModel[39].addShapeBox(42.0F, 0.0F, -6.0F, 15, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, -2.75F, 0.5F, 0.0F, -2.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  672 */     this.gunModel[39].setRotationPoint(-47.25F, -12.5F, 0.5F);
/*      */     
/*  674 */     this.gunModel[40].addShapeBox(42.0F, 0.0F, -6.0F, 15, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.75F, 0.5F, 0.0F, -2.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  675 */     this.gunModel[40].setRotationPoint(-47.25F, -14.5F, 0.5F);
/*      */     
/*  677 */     this.gunModel[41].addShapeBox(42.0F, 0.0F, -6.0F, 16, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  678 */     this.gunModel[41].setRotationPoint(-47.25F, -16.5F, 0.5F);
/*      */     
/*  680 */     this.gunModel[42].addShapeBox(42.0F, 0.0F, -6.0F, 16, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  681 */     this.gunModel[42].setRotationPoint(-47.25F, -18.5F, 0.5F);
/*      */     
/*  683 */     this.gunModel[43].addShapeBox(42.0F, 0.0F, -6.0F, 16, 1, 11, 0.0F, 0.0F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  684 */     this.gunModel[43].setRotationPoint(-47.25F, -20.5F, 0.5F);
/*      */     
/*  686 */     this.gunModel[44].addShapeBox(42.0F, 0.0F, -6.0F, 8, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  687 */     this.gunModel[44].setRotationPoint(-48.0F, 6.0F, 0.5F);
/*      */     
/*  689 */     this.gunModel[45].addShapeBox(42.0F, 0.0F, -6.0F, 8, 7, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  690 */     this.gunModel[45].setRotationPoint(-48.0F, 9.0F, 0.5F);
/*      */     
/*  692 */     this.gunModel[46].addShapeBox(42.0F, 0.0F, -6.0F, 8, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  693 */     this.gunModel[46].setRotationPoint(-48.0F, 16.0F, 0.5F);
/*      */     
/*  695 */     this.gunModel[47].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  696 */     this.gunModel[47].setRotationPoint(-48.0F, 18.0F, 0.5F);
/*      */     
/*  698 */     this.gunModel[48].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  699 */     this.gunModel[48].setRotationPoint(-41.0F, 19.0F, 0.5F);
/*      */     
/*  701 */     this.gunModel[49].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  702 */     this.gunModel[49].setRotationPoint(-46.0F, 19.0F, 0.5F);
/*      */     
/*  704 */     this.gunModel[50].addShapeBox(42.0F, 0.0F, -6.0F, 17, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/*  705 */     this.gunModel[50].setRotationPoint(-63.0F, 19.0F, 0.5F);
/*      */     
/*  707 */     this.gunModel[51].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  708 */     this.gunModel[51].setRotationPoint(-65.0F, 19.0F, 0.5F);
/*      */     
/*  710 */     this.gunModel[52].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 11, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  711 */     this.gunModel[52].setRotationPoint(-65.0F, 17.0F, 0.5F);
/*      */     
/*  713 */     this.gunModel[53].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 11, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  714 */     this.gunModel[53].setRotationPoint(-59.25F, -20.5F, 0.5F);
/*      */     
/*  716 */     this.gunModel[54].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 11, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/*  717 */     this.gunModel[54].setRotationPoint(-59.25F, -18.5F, 0.5F);
/*      */     
/*  719 */     this.gunModel[55].addShapeBox(42.0F, 0.0F, -6.0F, 9, 2, 11, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -3.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F);
/*  720 */     this.gunModel[55].setRotationPoint(-56.25F, -17.0F, 0.5F);
/*      */     
/*  722 */     this.gunModel[56].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 11, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  723 */     this.gunModel[56].setRotationPoint(-52.25F, -14.5F, 0.5F);
/*      */     
/*  725 */     this.gunModel[57].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 11, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  726 */     this.gunModel[57].setRotationPoint(-52.25F, -12.0F, 0.5F);
/*      */     
/*  728 */     this.gunModel[58].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 11, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  729 */     this.gunModel[58].setRotationPoint(-52.25F, -10.5F, 0.5F);
/*      */     
/*  731 */     this.gunModel[59].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 11, 0.0F, -0.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  732 */     this.gunModel[59].setRotationPoint(-52.25F, -9.0F, 0.5F);
/*      */     
/*  734 */     this.gunModel[60].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 11, 0.0F, 1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 2.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F);
/*  735 */     this.gunModel[60].setRotationPoint(-52.25F, -6.5F, 0.5F);
/*      */     
/*  737 */     this.gunModel[61].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 11, 0.0F, 1.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 3.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F);
/*  738 */     this.gunModel[61].setRotationPoint(-53.25F, -4.0F, 0.5F);
/*      */     
/*  740 */     this.gunModel[62].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 11, 0.0F, 3.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 3.75F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/*  741 */     this.gunModel[62].setRotationPoint(-53.25F, -1.5F, 0.5F);
/*      */     
/*  743 */     this.gunModel[63].addShapeBox(42.0F, 0.0F, -6.0F, 5, 6, 11, 0.0F, 5.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 5.0F, 0.5F, 0.0F, 7.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 7.25F, 0.0F, 0.0F);
/*  744 */     this.gunModel[63].setRotationPoint(-53.25F, 1.0F, 0.5F);
/*      */     
/*  746 */     this.gunModel[64].addShapeBox(42.0F, 0.0F, -6.0F, 7, 6, 11, 0.0F, 5.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 5.25F, 0.5F, 0.0F, 6.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 6.75F, 0.0F, 0.0F);
/*  747 */     this.gunModel[64].setRotationPoint(-55.25F, 7.5F, 0.5F);
/*      */     
/*  749 */     this.gunModel[65].addShapeBox(42.0F, 0.0F, -6.0F, 7, 2, 11, 0.0F, 6.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 6.75F, 0.5F, 0.0F, 7.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 7.75F, 0.25F, 0.0F);
/*  750 */     this.gunModel[65].setRotationPoint(-55.25F, 14.0F, 0.5F);
/*      */     
/*  752 */     this.gunModel[66].addShapeBox(42.0F, 0.0F, -6.0F, 7, 2, 11, 0.0F, 7.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 7.75F, 0.5F, 0.0F, 7.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 7.75F, 0.25F, 0.0F);
/*  753 */     this.gunModel[66].setRotationPoint(-55.25F, 16.75F, 0.5F);
/*      */     
/*  755 */     this.gunModel[67].addShapeBox(42.0F, 0.0F, -6.0F, 13, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  756 */     this.gunModel[67].setRotationPoint(-30.5F, -7.0F, 0.5F);
/*      */     
/*  758 */     this.gunModel[68].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  759 */     this.gunModel[68].setRotationPoint(-28.0F, -20.0F, 4.0F);
/*      */     
/*  761 */     this.gunModel[69].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  762 */     this.gunModel[69].setRotationPoint(-28.0F, -18.5F, 4.0F);
/*      */     
/*  764 */     this.gunModel[70].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 4, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  765 */     this.gunModel[70].setRotationPoint(-28.0F, -16.5F, 4.0F);
/*      */     
/*  767 */     this.gunModel[71].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 4, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  768 */     this.gunModel[71].setRotationPoint(-26.0F, -16.5F, 4.0F);
/*      */     
/*  770 */     this.gunModel[72].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 4, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  771 */     this.gunModel[72].setRotationPoint(-25.5F, -16.5F, 4.0F);
/*      */     
/*  773 */     this.gunModel[73].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 4, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, -2.25F, -0.25F, 0.0F);
/*  774 */     this.gunModel[73].setRotationPoint(-28.5F, -13.0F, 4.0F);
/*      */     
/*  776 */     this.gunModel[74].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  777 */     this.gunModel[74].setRotationPoint(-17.75F, -7.0F, 0.5F);
/*      */     
/*  779 */     this.gunModel[75].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  780 */     this.gunModel[75].setRotationPoint(-18.25F, -9.0F, 0.5F);
/*      */     
/*  782 */     this.gunModel[76].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  783 */     this.gunModel[76].setRotationPoint(-17.25F, -10.5F, 0.5F);
/*      */     
/*  785 */     this.gunModel[77].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  786 */     this.gunModel[77].setRotationPoint(-16.25F, -13.0F, 0.5F);
/*      */     
/*  788 */     this.gunModel[78].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  789 */     this.gunModel[78].setRotationPoint(-16.25F, -15.5F, 0.5F);
/*      */     
/*  791 */     this.gunModel[79].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  792 */     this.gunModel[79].setRotationPoint(-16.25F, -17.5F, 0.5F);
/*      */     
/*  794 */     this.gunModel[80].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  795 */     this.gunModel[80].setRotationPoint(-17.25F, -19.0F, 0.5F);
/*      */     
/*  797 */     this.gunModel[81].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/*  798 */     this.gunModel[81].setRotationPoint(-18.25F, -20.0F, 0.5F);
/*      */     
/*  800 */     this.gunModel[82].addShapeBox(42.0F, 0.0F, -6.0F, 2, 13, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  801 */     this.gunModel[82].setRotationPoint(-14.25F, -20.0F, 1.5F);
/*      */     
/*  803 */     this.gunModel[83].addShapeBox(42.0F, 0.0F, -6.0F, 3, 13, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  804 */     this.gunModel[83].setRotationPoint(-12.25F, -20.0F, 1.5F);
/*      */     
/*  806 */     this.gunModel[84].addShapeBox(42.0F, 0.0F, -6.0F, 2, 14, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  807 */     this.gunModel[84].setRotationPoint(-9.25F, -20.0F, 1.5F);
/*      */     
/*  809 */     this.gunModel[85].addShapeBox(42.0F, 0.0F, -6.0F, 22, 14, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  810 */     this.gunModel[85].setRotationPoint(-7.25F, -20.0F, 1.5F);
/*      */     
/*  812 */     this.gunModel[86].addShapeBox(42.0F, 0.0F, -6.0F, 14, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  813 */     this.gunModel[86].setRotationPoint(14.75F, -20.0F, 1.5F);
/*      */     
/*  815 */     this.gunModel[87].addShapeBox(42.0F, 0.0F, -6.0F, 6, 9, 8, 0.0F, 0.0F, 0.75F, 0.5F, 1.0F, 3.15F, 0.0F, 1.0F, 3.15F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 1.25F, 0.5F, 1.0F, -6.0F, 0.0F, 1.0F, -6.0F, 0.0F, 0.0F, 1.25F, 0.5F);
/*  816 */     this.gunModel[87].setRotationPoint(14.75F, -15.0F, 2.0F);
/*      */     
/*  818 */     this.gunModel[88].addShapeBox(42.0F, 0.0F, -6.0F, 4, 9, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  819 */     this.gunModel[88].setRotationPoint(21.75F, -21.0F, 2.0F);
/*      */     
/*  821 */     this.gunModel[89].addShapeBox(42.0F, 0.0F, -6.0F, 2, 9, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  822 */     this.gunModel[89].setRotationPoint(25.75F, -21.0F, 2.0F);
/*      */     
/*  824 */     this.gunModel[90].addShapeBox(42.0F, 0.0F, -6.0F, 1, 9, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  825 */     this.gunModel[90].setRotationPoint(27.75F, -21.0F, 2.0F);
/*      */     
/*  827 */     this.gunModel[91].addShapeBox(42.0F, 0.0F, -6.0F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  828 */     this.gunModel[91].setRotationPoint(28.75F, -21.0F, 2.0F);
/*      */     
/*  830 */     this.gunModel[92].addShapeBox(42.0F, 0.0F, -6.0F, 10, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  831 */     this.gunModel[92].setRotationPoint(-2.25F, -10.0F, 1.0F);
/*      */     
/*  833 */     this.gunModel[93].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  834 */     this.gunModel[93].setRotationPoint(7.75F, -10.0F, 1.0F);
/*      */     
/*  836 */     this.gunModel[94].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  837 */     this.gunModel[94].setRotationPoint(9.75F, -9.0F, 1.0F);
/*      */     
/*  839 */     this.gunModel[95].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  840 */     this.gunModel[95].setRotationPoint(-4.25F, -10.0F, 1.0F);
/*      */     
/*  842 */     this.gunModel[96].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 10, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  843 */     this.gunModel[96].setRotationPoint(-5.25F, -9.0F, 1.0F);
/*      */     
/*  845 */     this.gunModel[97].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  846 */     this.gunModel[97].setRotationPoint(-2.5F, -9.0F, 0.75F);
/*      */     
/*  848 */     this.gunModel[98].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  849 */     this.gunModel[98].setRotationPoint(-2.5F, -9.5F, 0.75F);
/*      */     
/*  851 */     this.gunModel[99].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  852 */     this.gunModel[99].setRotationPoint(-2.5F, -8.5F, 0.75F);
/*      */     
/*  854 */     this.gunModel[100].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  855 */     this.gunModel[100].setRotationPoint(7.0F, -9.0F, 0.75F);
/*      */     
/*  857 */     this.gunModel[101].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  858 */     this.gunModel[101].setRotationPoint(7.0F, -9.5F, 0.75F);
/*      */     
/*  860 */     this.gunModel[102].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  861 */     this.gunModel[102].setRotationPoint(7.0F, -8.5F, 0.75F);
/*      */     
/*  863 */     this.gunModel[103].addShapeBox(42.0F, 0.0F, -6.0F, 10, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  864 */     this.gunModel[103].setRotationPoint(-103.25F, -15.5F, 1.0F);
/*      */     
/*  866 */     this.gunModel[104].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/*  867 */     this.gunModel[104].setRotationPoint(-93.25F, -15.5F, 1.0F);
/*      */     
/*  869 */     this.gunModel[105].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  870 */     this.gunModel[105].setRotationPoint(-91.25F, -14.5F, 1.0F);
/*      */     
/*  872 */     this.gunModel[106].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  873 */     this.gunModel[106].setRotationPoint(-105.25F, -15.5F, 1.0F);
/*      */     
/*  875 */     this.gunModel[107].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 10, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  876 */     this.gunModel[107].setRotationPoint(-106.25F, -14.5F, 1.0F);
/*      */     
/*  878 */     this.gunModel[108].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  879 */     this.gunModel[108].setRotationPoint(-103.5F, -14.5F, 0.75F);
/*      */     
/*  881 */     this.gunModel[109].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  882 */     this.gunModel[109].setRotationPoint(-103.5F, -15.0F, 0.75F);
/*      */     
/*  884 */     this.gunModel[110].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  885 */     this.gunModel[110].setRotationPoint(-103.5F, -14.0F, 0.75F);
/*      */     
/*  887 */     this.gunModel[111].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  888 */     this.gunModel[111].setRotationPoint(-94.0F, -14.5F, 0.75F);
/*      */     
/*  890 */     this.gunModel[112].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F);
/*  891 */     this.gunModel[112].setRotationPoint(-94.0F, -15.0F, 0.75F);
/*      */     
/*  893 */     this.gunModel[113].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  894 */     this.gunModel[113].setRotationPoint(-94.0F, -14.0F, 0.75F);
/*      */     
/*  896 */     this.gunModel[114].addShapeBox(42.0F, 0.0F, -6.0F, 11, 7, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F);
/*  897 */     this.gunModel[114].setRotationPoint(-86.25F, -18.0F, 1.5F);
/*      */     
/*  899 */     this.gunModel[115].addShapeBox(42.0F, 0.0F, -6.0F, 28, 7, 9, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.25F, 1.25F, 0.0F);
/*  900 */     this.gunModel[115].setRotationPoint(-114.25F, -18.0F, 1.5F);
/*      */     
/*  902 */     this.gunModel[116].addShapeBox(42.0F, 0.0F, -6.0F, 28, 1, 9, 0.0F, 2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/*  903 */     this.gunModel[116].setRotationPoint(-114.25F, -20.0F, 1.5F);
/*      */     
/*  905 */     this.gunModel[117].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 9, 0.0F, 0.25F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.0F);
/*  906 */     this.gunModel[117].setRotationPoint(-86.0F, -20.0F, 1.5F);
/*      */     
/*  908 */     this.gunModel[118].addBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F);
/*  909 */     this.gunModel[118].setRotationPoint(120.5F, -36.0F, 0.0F);
/*      */     
/*  911 */     this.gunModel[119].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  912 */     this.gunModel[119].setRotationPoint(112.0F, -40.0F, 0.0F);
/*      */     
/*  914 */     this.gunModel[120].addShapeBox(42.0F, 0.0F, -6.0F, 24, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  915 */     this.gunModel[120].setRotationPoint(14.5F, -32.0F, 0.0F);
/*      */     
/*  917 */     this.gunModel[121].addShapeBox(42.0F, 0.0F, -6.0F, 18, 4, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  918 */     this.gunModel[121].setRotationPoint(14.0F, -36.0F, 0.0F);
/*      */     
/*  920 */     this.gunModel[122].addShapeBox(42.0F, 0.0F, -6.0F, 24, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  921 */     this.gunModel[122].setRotationPoint(14.5F, -40.0F, 0.0F);
/*      */     
/*  923 */     this.gunModel[123].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  924 */     this.gunModel[123].setRotationPoint(44.0F, -36.0F, 0.0F);
/*      */     
/*  926 */     this.gunModel[124].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  927 */     this.gunModel[124].setRotationPoint(59.5F, -36.0F, 0.0F);
/*      */     
/*  929 */     this.gunModel[125].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  930 */     this.gunModel[125].setRotationPoint(74.75F, -36.0F, 0.0F);
/*      */     
/*  932 */     this.gunModel[126].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  933 */     this.gunModel[126].setRotationPoint(90.0F, -36.0F, 0.0F);
/*      */     
/*  935 */     this.gunModel[127].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  936 */     this.gunModel[127].setRotationPoint(105.25F, -36.0F, 0.0F);
/*      */     
/*  938 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  939 */     this.gunModel[''].setRotationPoint(128.0F, -40.0F, 0.0F);
/*      */     
/*  941 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  942 */     this.gunModel[''].setRotationPoint(128.0F, -32.0F, 0.0F);
/*      */     
/*  944 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  945 */     this.gunModel[''].setRotationPoint(129.0F, -36.0F, 0.0F);
/*      */     
/*  947 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  948 */     this.gunModel[''].setRotationPoint(82.0F, -40.0F, 0.0F);
/*      */     
/*  950 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  951 */     this.gunModel[''].setRotationPoint(82.0F, -32.0F, 0.0F);
/*      */     
/*  953 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  954 */     this.gunModel[''].setRotationPoint(123.5F, -36.0F, 0.0F);
/*      */     
/*  956 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  957 */     this.gunModel[''].setRotationPoint(123.5F, -32.5F, 0.0F);
/*      */     
/*  959 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  960 */     this.gunModel[''].setRotationPoint(123.5F, -33.5F, 0.0F);
/*      */     
/*  962 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  963 */     this.gunModel[''].setRotationPoint(123.5F, -35.5F, 0.0F);
/*      */     
/*  965 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  966 */     this.gunModel[''].setRotationPoint(128.0F, -35.5F, 0.0F);
/*      */     
/*  968 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  969 */     this.gunModel[''].setRotationPoint(128.0F, -33.5F, 0.0F);
/*      */     
/*  971 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  972 */     this.gunModel[''].setRotationPoint(108.25F, -33.5F, 0.0F);
/*      */     
/*  974 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  975 */     this.gunModel[''].setRotationPoint(108.25F, -35.5F, 0.0F);
/*      */     
/*  977 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  978 */     this.gunModel[''].setRotationPoint(119.5F, -35.5F, 0.0F);
/*      */     
/*  980 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  981 */     this.gunModel[''].setRotationPoint(119.5F, -33.5F, 0.0F);
/*      */     
/*  983 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  984 */     this.gunModel[''].setRotationPoint(108.5F, -36.0F, 0.0F);
/*      */     
/*  986 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  987 */     this.gunModel[''].setRotationPoint(108.5F, -32.5F, 0.0F);
/*      */     
/*  989 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  990 */     this.gunModel[''].setRotationPoint(93.0F, -33.5F, 0.0F);
/*      */     
/*  992 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  993 */     this.gunModel[''].setRotationPoint(93.0F, -35.5F, 0.0F);
/*      */     
/*  995 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/*  996 */     this.gunModel[''].setRotationPoint(104.75F, -35.5F, 0.0F);
/*      */     
/*  998 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  999 */     this.gunModel[''].setRotationPoint(104.75F, -33.5F, 0.0F);
/*      */     
/* 1001 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1002 */     this.gunModel[''].setRotationPoint(93.5F, -36.0F, 0.0F);
/*      */     
/* 1004 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 1005 */     this.gunModel[''].setRotationPoint(93.5F, -32.5F, 0.0F);
/*      */     
/* 1007 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1008 */     this.gunModel[''].setRotationPoint(77.75F, -33.5F, 0.0F);
/*      */     
/* 1010 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1011 */     this.gunModel[''].setRotationPoint(77.75F, -35.5F, 0.0F);
/*      */     
/* 1013 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 1014 */     this.gunModel[''].setRotationPoint(89.5F, -35.5F, 0.0F);
/*      */     
/* 1016 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1017 */     this.gunModel[''].setRotationPoint(89.5F, -33.5F, 0.0F);
/*      */     
/* 1019 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1020 */     this.gunModel[''].setRotationPoint(78.0F, -36.0F, 0.0F);
/*      */     
/* 1022 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1023 */     this.gunModel[''].setRotationPoint(78.0F, -32.5F, 0.0F);
/*      */     
/* 1025 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1026 */     this.gunModel[''].setRotationPoint(62.5F, -33.5F, 0.0F);
/*      */     
/* 1028 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1029 */     this.gunModel[''].setRotationPoint(62.5F, -35.5F, 0.0F);
/*      */     
/* 1031 */     this.gunModel[''].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 1032 */     this.gunModel[''].setRotationPoint(74.25F, -35.5F, 0.0F);
/*      */     
/* 1034 */     this.gunModel[' '].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1035 */     this.gunModel[' '].setRotationPoint(74.25F, -33.5F, 0.0F);
/*      */     
/* 1037 */     this.gunModel['¡'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1038 */     this.gunModel['¡'].setRotationPoint(62.75F, -36.0F, 0.0F);
/*      */     
/* 1040 */     this.gunModel['¢'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1041 */     this.gunModel['¢'].setRotationPoint(62.75F, -32.5F, 0.0F);
/*      */     
/* 1043 */     this.gunModel['£'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1044 */     this.gunModel['£'].setRotationPoint(47.0F, -33.5F, 0.0F);
/*      */     
/* 1046 */     this.gunModel['¤'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1047 */     this.gunModel['¤'].setRotationPoint(47.0F, -35.5F, 0.0F);
/*      */     
/* 1049 */     this.gunModel['¥'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 1050 */     this.gunModel['¥'].setRotationPoint(59.0F, -35.5F, 0.0F);
/*      */     
/* 1052 */     this.gunModel['¦'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1053 */     this.gunModel['¦'].setRotationPoint(59.0F, -33.5F, 0.0F);
/*      */     
/* 1055 */     this.gunModel['§'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1056 */     this.gunModel['§'].setRotationPoint(47.25F, -36.0F, 0.0F);
/*      */     
/* 1058 */     this.gunModel['¨'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1059 */     this.gunModel['¨'].setRotationPoint(47.25F, -32.5F, 0.0F);
/*      */     
/* 1061 */     this.gunModel['©'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1062 */     this.gunModel['©'].setRotationPoint(32.0F, -33.5F, 0.0F);
/*      */     
/* 1064 */     this.gunModel['ª'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1065 */     this.gunModel['ª'].setRotationPoint(32.0F, -35.5F, 0.0F);
/*      */     
/* 1067 */     this.gunModel['«'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 1068 */     this.gunModel['«'].setRotationPoint(43.5F, -35.5F, 0.0F);
/*      */     
/* 1070 */     this.gunModel['¬'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1071 */     this.gunModel['¬'].setRotationPoint(43.5F, -33.5F, 0.0F);
/*      */     
/* 1073 */     this.gunModel['­'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1074 */     this.gunModel['­'].setRotationPoint(32.25F, -36.0F, 0.0F);
/*      */     
/* 1076 */     this.gunModel['®'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1077 */     this.gunModel['®'].setRotationPoint(32.25F, -32.5F, 0.0F);
/*      */     
/* 1079 */     this.gunModel['¯'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1080 */     this.gunModel['¯'].setRotationPoint(112.0F, -32.0F, 0.0F);
/*      */     
/* 1082 */     this.gunModel['°'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1083 */     this.gunModel['°'].setRotationPoint(116.0F, -32.0F, 0.0F);
/*      */     
/* 1085 */     this.gunModel['±'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1086 */     this.gunModel['±'].setRotationPoint(116.0F, -29.0F, 0.0F);
/*      */     
/* 1088 */     this.gunModel['²'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1089 */     this.gunModel['²'].setRotationPoint(116.0F, -37.0F, 0.0F);
/*      */     
/* 1091 */     this.gunModel['³'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1092 */     this.gunModel['³'].setRotationPoint(116.0F, -40.0F, 0.0F);
/*      */     
/* 1094 */     this.gunModel['´'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F);
/* 1095 */     this.gunModel['´'].setRotationPoint(115.0F, -32.0F, 0.0F);
/*      */     
/* 1097 */     this.gunModel['µ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1098 */     this.gunModel['µ'].setRotationPoint(127.0F, -32.0F, 0.0F);
/*      */     
/* 1100 */     this.gunModel['¶'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1101 */     this.gunModel['¶'].setRotationPoint(115.0F, -29.0F, 0.0F);
/*      */     
/* 1103 */     this.gunModel['·'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1104 */     this.gunModel['·'].setRotationPoint(127.0F, -29.0F, 0.0F);
/*      */     
/* 1106 */     this.gunModel['¸'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1107 */     this.gunModel['¸'].setRotationPoint(127.0F, -37.0F, 0.0F);
/*      */     
/* 1109 */     this.gunModel['¹'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 1110 */     this.gunModel['¹'].setRotationPoint(115.0F, -40.0F, 0.0F);
/*      */     
/* 1112 */     this.gunModel['º'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F);
/* 1113 */     this.gunModel['º'].setRotationPoint(127.0F, -40.0F, 0.0F);
/*      */     
/* 1115 */     this.gunModel['»'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1116 */     this.gunModel['»'].setRotationPoint(97.0F, -32.0F, 0.0F);
/*      */     
/* 1118 */     this.gunModel['¼'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1119 */     this.gunModel['¼'].setRotationPoint(101.0F, -32.0F, 0.0F);
/*      */     
/* 1121 */     this.gunModel['½'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1122 */     this.gunModel['½'].setRotationPoint(101.0F, -29.0F, 0.0F);
/*      */     
/* 1124 */     this.gunModel['¾'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1125 */     this.gunModel['¾'].setRotationPoint(66.0F, -32.0F, 0.0F);
/*      */     
/* 1127 */     this.gunModel['¿'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1128 */     this.gunModel['¿'].setRotationPoint(70.0F, -32.0F, 0.0F);
/*      */     
/* 1130 */     this.gunModel['À'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1131 */     this.gunModel['À'].setRotationPoint(70.0F, -29.0F, 0.0F);
/*      */     
/* 1133 */     this.gunModel['Á'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1134 */     this.gunModel['Á'].setRotationPoint(51.5F, -32.0F, 0.0F);
/*      */     
/* 1136 */     this.gunModel['Â'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F);
/* 1137 */     this.gunModel['Â'].setRotationPoint(55.0F, -32.0F, 0.0F);
/*      */     
/* 1139 */     this.gunModel['Ã'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F);
/* 1140 */     this.gunModel['Ã'].setRotationPoint(55.0F, -29.0F, 0.0F);
/*      */     
/* 1142 */     this.gunModel['Ä'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1143 */     this.gunModel['Ä'].setRotationPoint(51.5F, -40.0F, 0.0F);
/*      */     
/* 1145 */     this.gunModel['Å'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1146 */     this.gunModel['Å'].setRotationPoint(66.0F, -40.0F, 0.0F);
/*      */     
/* 1148 */     this.gunModel['Æ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1149 */     this.gunModel['Æ'].setRotationPoint(97.0F, -40.0F, 0.0F);
/*      */     
/* 1151 */     this.gunModel['Ç'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1152 */     this.gunModel['Ç'].setRotationPoint(101.0F, -37.0F, 0.0F);
/*      */     
/* 1154 */     this.gunModel['È'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1155 */     this.gunModel['È'].setRotationPoint(111.0F, -37.0F, 0.0F);
/*      */     
/* 1157 */     this.gunModel['É'].addShapeBox(42.0F, 0.0F, -6.0F, 38, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1158 */     this.gunModel['É'].setRotationPoint(1.25F, -44.0F, 2.0F);
/*      */     
/* 1160 */     this.gunModel['Ê'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1161 */     this.gunModel['Ê'].setRotationPoint(40.25F, -44.0F, 2.0F);
/*      */     
/* 1163 */     this.gunModel['Ë'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1164 */     this.gunModel['Ë'].setRotationPoint(50.25F, -44.0F, 2.0F);
/*      */     
/* 1166 */     this.gunModel['Ì'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1167 */     this.gunModel['Ì'].setRotationPoint(60.25F, -44.0F, 2.0F);
/*      */     
/* 1169 */     this.gunModel['Í'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1170 */     this.gunModel['Í'].setRotationPoint(70.25F, -44.0F, 2.0F);
/*      */     
/* 1172 */     this.gunModel['Î'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1173 */     this.gunModel['Î'].setRotationPoint(80.25F, -44.0F, 2.0F);
/*      */     
/* 1175 */     this.gunModel['Ï'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1176 */     this.gunModel['Ï'].setRotationPoint(90.25F, -44.0F, 2.0F);
/*      */     
/* 1178 */     this.gunModel['Ð'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1179 */     this.gunModel['Ð'].setRotationPoint(100.25F, -44.0F, 2.0F);
/*      */     
/* 1181 */     this.gunModel['Ñ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1182 */     this.gunModel['Ñ'].setRotationPoint(110.25F, -44.0F, 2.0F);
/*      */     
/* 1184 */     this.gunModel['Ò'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1185 */     this.gunModel['Ò'].setRotationPoint(120.25F, -44.0F, 2.0F);
/*      */     
/* 1187 */     this.gunModel['Ó'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 8, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1188 */     this.gunModel['Ó'].setRotationPoint(130.25F, -44.0F, 2.0F);
/*      */     
/* 1190 */     this.gunModel['Ô'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1191 */     this.gunModel['Ô'].setRotationPoint(47.25F, -41.5F, 4.0F);
/*      */     
/* 1193 */     this.gunModel['Õ'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1194 */     this.gunModel['Õ'].setRotationPoint(57.25F, -41.5F, 4.0F);
/*      */     
/* 1196 */     this.gunModel['Ö'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1197 */     this.gunModel['Ö'].setRotationPoint(67.25F, -41.5F, 4.0F);
/*      */     
/* 1199 */     this.gunModel['×'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1200 */     this.gunModel['×'].setRotationPoint(77.25F, -41.5F, 4.0F);
/*      */     
/* 1202 */     this.gunModel['Ø'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1203 */     this.gunModel['Ø'].setRotationPoint(87.25F, -41.5F, 4.0F);
/*      */     
/* 1205 */     this.gunModel['Ù'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1206 */     this.gunModel['Ù'].setRotationPoint(97.25F, -41.5F, 4.0F);
/*      */     
/* 1208 */     this.gunModel['Ú'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1209 */     this.gunModel['Ú'].setRotationPoint(107.25F, -41.5F, 4.0F);
/*      */     
/* 1211 */     this.gunModel['Û'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1212 */     this.gunModel['Û'].setRotationPoint(117.25F, -41.5F, 4.0F);
/*      */     
/* 1214 */     this.gunModel['Ü'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 4, 0.0F, 0.75F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1215 */     this.gunModel['Ü'].setRotationPoint(127.25F, -41.5F, 4.0F);
/*      */     
/* 1217 */     this.gunModel['Ý'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1218 */     this.gunModel['Ý'].setRotationPoint(115.0F, -37.0F, 0.0F);
/*      */     
/* 1220 */     this.gunModel['Þ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F);
/* 1221 */     this.gunModel['Þ'].setRotationPoint(111.0F, -40.0F, 0.0F);
/*      */     
/* 1223 */     this.gunModel['ß'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 1224 */     this.gunModel['ß'].setRotationPoint(100.0F, -40.0F, 0.0F);
/*      */     
/* 1226 */     this.gunModel['à'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1227 */     this.gunModel['à'].setRotationPoint(100.0F, -37.0F, 0.0F);
/*      */     
/* 1229 */     this.gunModel['á'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1230 */     this.gunModel['á'].setRotationPoint(101.0F, -40.0F, 0.0F);
/*      */     
/* 1232 */     this.gunModel['â'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1233 */     this.gunModel['â'].setRotationPoint(96.0F, -37.0F, 0.0F);
/*      */     
/* 1235 */     this.gunModel['ã'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F);
/* 1236 */     this.gunModel['ã'].setRotationPoint(96.0F, -40.0F, 0.0F);
/*      */     
/* 1238 */     this.gunModel['ä'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1239 */     this.gunModel['ä'].setRotationPoint(86.0F, -37.0F, 0.0F);
/*      */     
/* 1241 */     this.gunModel['å'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1242 */     this.gunModel['å'].setRotationPoint(86.0F, -40.0F, 0.0F);
/*      */     
/* 1244 */     this.gunModel['æ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 1245 */     this.gunModel['æ'].setRotationPoint(85.0F, -40.0F, 0.0F);
/*      */     
/* 1247 */     this.gunModel['ç'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1248 */     this.gunModel['ç'].setRotationPoint(85.0F, -37.0F, 0.0F);
/*      */     
/* 1250 */     this.gunModel['è'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1251 */     this.gunModel['è'].setRotationPoint(81.0F, -37.0F, 0.0F);
/*      */     
/* 1253 */     this.gunModel['é'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F);
/* 1254 */     this.gunModel['é'].setRotationPoint(81.0F, -40.0F, 0.0F);
/*      */     
/* 1256 */     this.gunModel['ê'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1257 */     this.gunModel['ê'].setRotationPoint(70.0F, -37.0F, 0.0F);
/*      */     
/* 1259 */     this.gunModel['ë'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1260 */     this.gunModel['ë'].setRotationPoint(70.0F, -40.0F, 0.0F);
/*      */     
/* 1262 */     this.gunModel['ì'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 1263 */     this.gunModel['ì'].setRotationPoint(69.0F, -40.0F, 0.0F);
/*      */     
/* 1265 */     this.gunModel['í'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1266 */     this.gunModel['í'].setRotationPoint(69.0F, -37.0F, 0.0F);
/*      */     
/* 1268 */     this.gunModel['î'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1269 */     this.gunModel['î'].setRotationPoint(65.0F, -37.0F, 0.0F);
/*      */     
/* 1271 */     this.gunModel['ï'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F);
/* 1272 */     this.gunModel['ï'].setRotationPoint(65.0F, -40.0F, 0.0F);
/*      */     
/* 1274 */     this.gunModel['ð'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1275 */     this.gunModel['ð'].setRotationPoint(55.0F, -37.0F, 0.0F);
/*      */     
/* 1277 */     this.gunModel['ñ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F);
/* 1278 */     this.gunModel['ñ'].setRotationPoint(55.0F, -40.0F, 0.0F);
/*      */     
/* 1280 */     this.gunModel['ò'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 1281 */     this.gunModel['ò'].setRotationPoint(54.5F, -40.0F, 0.0F);
/*      */     
/* 1283 */     this.gunModel['ó'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1284 */     this.gunModel['ó'].setRotationPoint(54.5F, -37.0F, 0.0F);
/*      */     
/* 1286 */     this.gunModel['ô'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1287 */     this.gunModel['ô'].setRotationPoint(50.5F, -37.0F, 0.0F);
/*      */     
/* 1289 */     this.gunModel['õ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F);
/* 1290 */     this.gunModel['õ'].setRotationPoint(50.5F, -40.0F, 0.0F);
/*      */     
/* 1292 */     this.gunModel['ö'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1293 */     this.gunModel['ö'].setRotationPoint(39.0F, -37.0F, 0.0F);
/*      */     
/* 1295 */     this.gunModel['÷'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, -0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F);
/* 1296 */     this.gunModel['÷'].setRotationPoint(39.0F, -40.0F, 0.0F);
/*      */     
/* 1298 */     this.gunModel['ø'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 1299 */     this.gunModel['ø'].setRotationPoint(38.5F, -40.0F, 0.0F);
/*      */     
/* 1301 */     this.gunModel['ù'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1302 */     this.gunModel['ù'].setRotationPoint(38.5F, -37.0F, 0.0F);
/*      */     
/* 1304 */     this.gunModel['ú'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1305 */     this.gunModel['ú'].setRotationPoint(111.0F, -32.0F, 0.0F);
/*      */     
/* 1307 */     this.gunModel['û'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1308 */     this.gunModel['û'].setRotationPoint(111.0F, -29.0F, 0.0F);
/*      */     
/* 1310 */     this.gunModel['ü'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F);
/* 1311 */     this.gunModel['ü'].setRotationPoint(100.0F, -32.0F, 0.0F);
/*      */     
/* 1313 */     this.gunModel['ý'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1314 */     this.gunModel['ý'].setRotationPoint(100.0F, -29.0F, 0.0F);
/*      */     
/* 1316 */     this.gunModel['þ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1317 */     this.gunModel['þ'].setRotationPoint(96.0F, -32.0F, 0.0F);
/*      */     
/* 1319 */     this.gunModel['ÿ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1320 */     this.gunModel['ÿ'].setRotationPoint(96.0F, -29.0F, 0.0F);
/*      */     
/* 1322 */     this.gunModel['Ā'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F);
/* 1323 */     this.gunModel['Ā'].setRotationPoint(85.0F, -32.0F, 0.0F);
/*      */     
/* 1325 */     this.gunModel['ā'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1326 */     this.gunModel['ā'].setRotationPoint(85.0F, -29.0F, 0.0F);
/*      */     
/* 1328 */     this.gunModel['Ă'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1329 */     this.gunModel['Ă'].setRotationPoint(86.0F, -32.0F, 0.0F);
/*      */     
/* 1331 */     this.gunModel['ă'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1332 */     this.gunModel['ă'].setRotationPoint(86.0F, -29.0F, 0.0F);
/*      */     
/* 1334 */     this.gunModel['Ą'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1335 */     this.gunModel['Ą'].setRotationPoint(81.0F, -32.0F, 0.0F);
/*      */     
/* 1337 */     this.gunModel['ą'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1338 */     this.gunModel['ą'].setRotationPoint(81.0F, -29.0F, 0.0F);
/*      */     
/* 1340 */     this.gunModel['Ć'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F);
/* 1341 */     this.gunModel['Ć'].setRotationPoint(69.0F, -32.0F, 0.0F);
/*      */     
/* 1343 */     this.gunModel['ć'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1344 */     this.gunModel['ć'].setRotationPoint(69.0F, -29.0F, 0.0F);
/*      */     
/* 1346 */     this.gunModel['Ĉ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1347 */     this.gunModel['Ĉ'].setRotationPoint(65.0F, -32.0F, 0.0F);
/*      */     
/* 1349 */     this.gunModel['ĉ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1350 */     this.gunModel['ĉ'].setRotationPoint(65.0F, -29.0F, 0.0F);
/*      */     
/* 1352 */     this.gunModel['Ċ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F);
/* 1353 */     this.gunModel['Ċ'].setRotationPoint(54.5F, -32.0F, 0.0F);
/*      */     
/* 1355 */     this.gunModel['ċ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1356 */     this.gunModel['ċ'].setRotationPoint(54.5F, -29.0F, 0.0F);
/*      */     
/* 1358 */     this.gunModel['Č'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F);
/* 1359 */     this.gunModel['Č'].setRotationPoint(39.0F, -32.0F, 0.0F);
/*      */     
/* 1361 */     this.gunModel['č'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 12, 0.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F);
/* 1362 */     this.gunModel['č'].setRotationPoint(39.0F, -29.0F, 0.0F);
/*      */     
/* 1364 */     this.gunModel['Ď'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1365 */     this.gunModel['Ď'].setRotationPoint(50.5F, -32.0F, 0.0F);
/*      */     
/* 1367 */     this.gunModel['ď'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1368 */     this.gunModel['ď'].setRotationPoint(50.5F, -29.0F, 0.0F);
/*      */     
/* 1370 */     this.gunModel['Đ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F);
/* 1371 */     this.gunModel['Đ'].setRotationPoint(38.5F, -32.0F, 0.0F);
/*      */     
/* 1373 */     this.gunModel['đ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1374 */     this.gunModel['đ'].setRotationPoint(38.5F, -29.0F, 0.0F);
/*      */     
/* 1376 */     this.gunModel['Ē'].addShapeBox(42.0F, 0.0F, -6.0F, 111, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1377 */     this.gunModel['Ē'].setRotationPoint(31.0F, -37.0F, 2.5F);
/*      */     
/* 1379 */     this.gunModel['ē'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, -2.5F, -1.0F, 1.0F, -2.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1380 */     this.gunModel['ē'].setRotationPoint(132.25F, -44.0F, 1.5F);
/*      */     
/* 1382 */     this.gunModel['Ĕ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 2.75F, 0.5F, 0.0F, 2.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1383 */     this.gunModel['Ĕ'].setRotationPoint(132.25F, -41.5F, 1.5F);
/*      */     
/* 1385 */     this.gunModel['ĕ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 6, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1386 */     this.gunModel['ĕ'].setRotationPoint(132.25F, -39.0F, 1.5F);
/*      */     
/* 1388 */     this.gunModel['Ė'].addShapeBox(42.0F, 0.0F, -6.0F, 5, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1389 */     this.gunModel['Ė'].setRotationPoint(132.25F, -33.0F, 1.5F);
/*      */     
/* 1391 */     this.gunModel['ė'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1392 */     this.gunModel['ė'].setRotationPoint(132.25F, -29.0F, 3.0F);
/*      */     
/* 1394 */     this.gunModel['Ę'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1395 */     this.gunModel['Ę'].setRotationPoint(132.25F, -26.0F, 1.5F);
/*      */     
/* 1397 */     this.gunModel['ę'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, -0.25F, 0.5F, 1.75F, -0.25F, 0.5F, 1.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1398 */     this.gunModel['ę'].setRotationPoint(132.25F, -27.0F, 9.5F);
/*      */     
/* 1400 */     this.gunModel['Ě'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1401 */     this.gunModel['Ě'].setRotationPoint(132.25F, -27.0F, 1.5F);
/*      */     
/* 1403 */     this.gunModel['ě'].addShapeBox(42.0F, 0.0F, -6.0F, 104, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1404 */     this.gunModel['ě'].setRotationPoint(30.25F, -24.5F, 7.0F);
/*      */     
/* 1406 */     this.gunModel['Ĝ'].addShapeBox(42.0F, 0.0F, -6.0F, 104, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1407 */     this.gunModel['Ĝ'].setRotationPoint(30.25F, -23.5F, 7.0F);
/*      */     
/* 1409 */     this.gunModel['ĝ'].addShapeBox(42.0F, 0.0F, -6.0F, 104, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1410 */     this.gunModel['ĝ'].setRotationPoint(30.25F, -22.5F, 7.0F);
/*      */     
/* 1412 */     this.gunModel['Ğ'].addShapeBox(42.0F, 0.0F, -6.0F, 104, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1413 */     this.gunModel['Ğ'].setRotationPoint(30.25F, -24.5F, 2.0F);
/*      */     
/* 1415 */     this.gunModel['ğ'].addShapeBox(42.0F, 0.0F, -6.0F, 104, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1416 */     this.gunModel['ğ'].setRotationPoint(30.25F, -23.5F, 2.0F);
/*      */     
/* 1418 */     this.gunModel['Ġ'].addShapeBox(42.0F, 0.0F, -6.0F, 104, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1419 */     this.gunModel['Ġ'].setRotationPoint(30.25F, -22.5F, 2.0F);
/*      */     
/* 1421 */     this.gunModel['ġ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1422 */     this.gunModel['ġ'].setRotationPoint(139.0F, -38.0F, 2.0F);
/*      */     
/* 1424 */     this.gunModel['Ģ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1425 */     this.gunModel['Ģ'].setRotationPoint(143.0F, -37.5F, 2.5F);
/*      */     
/* 1427 */     this.gunModel['ģ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1428 */     this.gunModel['ģ'].setRotationPoint(144.0F, -38.0F, 2.0F);
/*      */     
/* 1430 */     this.gunModel['Ĥ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 8, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1431 */     this.gunModel['Ĥ'].setRotationPoint(147.0F, -38.0F, 2.0F);
/*      */     
/* 1433 */     this.gunModel['ĥ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 8, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1434 */     this.gunModel['ĥ'].setRotationPoint(146.0F, -38.0F, 2.0F);
/*      */     
/* 1436 */     this.gunModel['Ħ'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1437 */     this.gunModel['Ħ'].setRotationPoint(149.0F, -38.0F, 2.0F);
/*      */     
/* 1439 */     this.gunModel['ħ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1440 */     this.gunModel['ħ'].setRotationPoint(159.0F, -38.0F, 2.0F);
/*      */     
/* 1442 */     this.gunModel['Ĩ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1443 */     this.gunModel['Ĩ'].setRotationPoint(164.0F, -38.0F, 2.0F);
/*      */     
/* 1445 */     this.gunModel['ĩ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1446 */     this.gunModel['ĩ'].setRotationPoint(169.0F, -38.0F, 2.0F);
/*      */     
/* 1448 */     this.gunModel['Ī'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1449 */     this.gunModel['Ī'].setRotationPoint(156.0F, -38.0F, 3.0F);
/*      */     
/* 1451 */     this.gunModel['ī'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1452 */     this.gunModel['ī'].setRotationPoint(156.0F, -32.0F, 3.0F);
/*      */     
/* 1454 */     this.gunModel['Ĭ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1455 */     this.gunModel['Ĭ'].setRotationPoint(161.0F, -38.0F, 3.0F);
/*      */     
/* 1457 */     this.gunModel['ĭ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1458 */     this.gunModel['ĭ'].setRotationPoint(161.0F, -32.0F, 3.0F);
/*      */     
/* 1460 */     this.gunModel['Į'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1461 */     this.gunModel['Į'].setRotationPoint(166.0F, -38.0F, 3.0F);
/*      */     
/* 1463 */     this.gunModel['į'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1464 */     this.gunModel['į'].setRotationPoint(166.0F, -32.0F, 3.0F);
/*      */     
/* 1466 */     this.gunModel['İ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1467 */     this.gunModel['İ'].setRotationPoint(170.5F, -38.0F, 2.0F);
/*      */     
/* 1469 */     this.gunModel['ı'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1470 */     this.gunModel['ı'].setRotationPoint(170.5F, -34.0F, 2.0F);
/*      */     
/* 1472 */     this.gunModel['Ĳ'].addShapeBox(42.0F, 0.0F, -6.0F, 16, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1473 */     this.gunModel['Ĳ'].setRotationPoint(33.25F, -25.0F, -2.0F);
/*      */     
/* 1475 */     this.gunModel['ĳ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 3, 16, 0.0F, -2.25F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, -2.25F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1476 */     this.gunModel['ĳ'].setRotationPoint(33.25F, -28.0F, -2.0F);
/*      */     
/* 1478 */     this.gunModel['Ĵ'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 2, 16, 0.0F, -3.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -3.5F, 0.0F, -2.0F, -0.25F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, -0.25F, 0.0F, -1.2F);
/* 1479 */     this.gunModel['Ĵ'].setRotationPoint(35.25F, -30.0F, -2.0F);
/*      */     
/* 1481 */     this.gunModel['ĵ'].addShapeBox(42.0F, 0.0F, -6.0F, 49, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F);
/* 1482 */     this.gunModel['ĵ'].setRotationPoint(33.25F, -21.0F, -2.0F);
/*      */     
/* 1484 */     this.gunModel['Ķ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1485 */     this.gunModel['Ķ'].setRotationPoint(49.25F, -25.0F, -2.0F);
/*      */     
/* 1487 */     this.gunModel['ķ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1488 */     this.gunModel['ķ'].setRotationPoint(49.25F, -23.0F, -2.0F);
/*      */     
/* 1490 */     this.gunModel['ĸ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1491 */     this.gunModel['ĸ'].setRotationPoint(57.25F, -23.0F, -2.0F);
/*      */     
/* 1493 */     this.gunModel['Ĺ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1494 */     this.gunModel['Ĺ'].setRotationPoint(57.25F, -25.0F, -2.0F);
/*      */     
/* 1496 */     this.gunModel['ĺ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1497 */     this.gunModel['ĺ'].setRotationPoint(61.25F, -25.0F, -2.0F);
/*      */     
/* 1499 */     this.gunModel['Ļ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1500 */     this.gunModel['Ļ'].setRotationPoint(61.25F, -23.0F, -2.0F);
/*      */     
/* 1502 */     this.gunModel['ļ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1503 */     this.gunModel['ļ'].setRotationPoint(69.25F, -23.0F, -2.0F);
/*      */     
/* 1505 */     this.gunModel['Ľ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1506 */     this.gunModel['Ľ'].setRotationPoint(69.25F, -25.0F, -2.0F);
/*      */     
/* 1508 */     this.gunModel['ľ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1509 */     this.gunModel['ľ'].setRotationPoint(58.25F, -25.0F, -2.0F);
/*      */     
/* 1511 */     this.gunModel['Ŀ'].addShapeBox(42.0F, 0.0F, -6.0F, 15, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1512 */     this.gunModel['Ŀ'].setRotationPoint(70.25F, -25.0F, -2.0F);
/*      */     
/* 1514 */     this.gunModel['ŀ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1515 */     this.gunModel['ŀ'].setRotationPoint(51.75F, -30.0F, -2.0F);
/*      */     
/* 1517 */     this.gunModel['Ł'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1518 */     this.gunModel['Ł'].setRotationPoint(64.25F, -30.0F, -2.0F);
/*      */     
/* 1520 */     this.gunModel['ł'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1521 */     this.gunModel['ł'].setRotationPoint(76.75F, -30.0F, -2.0F);
/*      */     
/* 1523 */     this.gunModel['Ń'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 16, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0.0F, 0.5F, -1.4F);
/* 1524 */     this.gunModel['Ń'].setRotationPoint(42.25F, -30.0F, -2.0F);
/*      */     
/* 1526 */     this.gunModel['ń'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 16, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0.0F, 0.5F, -1.4F);
/* 1527 */     this.gunModel['ń'].setRotationPoint(67.25F, -30.0F, -2.0F);
/*      */     
/* 1529 */     this.gunModel['Ņ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 20, 0.0F, 0.0F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1530 */     this.gunModel['Ņ'].setRotationPoint(67.25F, -26.0F, -4.0F);
/*      */     
/* 1532 */     this.gunModel['ņ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 20, 0.0F, 0.0F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1533 */     this.gunModel['ņ'].setRotationPoint(42.25F, -26.0F, -4.0F);
/*      */     
/* 1535 */     this.gunModel['Ň'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F);
/* 1536 */     this.gunModel['Ň'].setRotationPoint(67.25F, -28.5F, -4.0F);
/*      */     
/* 1538 */     this.gunModel['ň'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F);
/* 1539 */     this.gunModel['ň'].setRotationPoint(67.25F, -27.0F, -4.0F);
/*      */     
/* 1541 */     this.gunModel['ŉ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F);
/* 1542 */     this.gunModel['ŉ'].setRotationPoint(75.75F, -27.0F, -4.0F);
/*      */     
/* 1544 */     this.gunModel['Ŋ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F);
/* 1545 */     this.gunModel['Ŋ'].setRotationPoint(75.75F, -28.5F, -4.0F);
/*      */     
/* 1547 */     this.gunModel['ŋ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F);
/* 1548 */     this.gunModel['ŋ'].setRotationPoint(42.25F, -28.5F, -4.0F);
/*      */     
/* 1550 */     this.gunModel['Ō'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F);
/* 1551 */     this.gunModel['Ō'].setRotationPoint(42.25F, -27.0F, -4.0F);
/*      */     
/* 1553 */     this.gunModel['ō'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F);
/* 1554 */     this.gunModel['ō'].setRotationPoint(50.75F, -27.0F, -4.0F);
/*      */     
/* 1556 */     this.gunModel['Ŏ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F);
/* 1557 */     this.gunModel['Ŏ'].setRotationPoint(50.75F, -28.5F, -4.0F);
/*      */     
/* 1559 */     this.gunModel['ŏ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 16, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0.0F, 0.5F, -1.4F);
/* 1560 */     this.gunModel['ŏ'].setRotationPoint(54.75F, -30.0F, -2.0F);
/*      */     
/* 1562 */     this.gunModel['Ő'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 1, 20, 0.0F, 0.0F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1563 */     this.gunModel['Ő'].setRotationPoint(54.75F, -26.0F, -4.0F);
/*      */     
/* 1565 */     this.gunModel['ő'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F);
/* 1566 */     this.gunModel['ő'].setRotationPoint(54.75F, -28.5F, -4.0F);
/*      */     
/* 1568 */     this.gunModel['Œ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F);
/* 1569 */     this.gunModel['Œ'].setRotationPoint(54.75F, -27.0F, -4.0F);
/*      */     
/* 1571 */     this.gunModel['œ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F);
/* 1572 */     this.gunModel['œ'].setRotationPoint(63.25F, -27.0F, -4.0F);
/*      */     
/* 1574 */     this.gunModel['Ŕ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F);
/* 1575 */     this.gunModel['Ŕ'].setRotationPoint(63.25F, -28.5F, -4.0F);
/*      */     
/* 1577 */     this.gunModel['ŕ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 5, 2, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 1578 */     this.gunModel['ŕ'].setRotationPoint(-25.5F, -34.5F, -2.75F);
/*      */     
/* 1580 */     this.gunModel['Ŗ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F);
/* 1581 */     this.gunModel['Ŗ'].setRotationPoint(-25.5F, -34.25F, -3.25F);
/*      */     
/* 1583 */     this.gunModel['ŗ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 5, 8, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 1584 */     this.gunModel['ŗ'].setRotationPoint(-111.0F, -31.5F, 4.0F);
/*      */     
/* 1586 */     this.gunModel['Ř'].addShapeBox(42.0F, 0.0F, -6.0F, 55, 5, 9, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1587 */     this.gunModel['Ř'].setRotationPoint(-164.0F, -41.5F, 3.0F);
/*      */     
/* 1589 */     this.gunModel['ř'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 5, 9, 0.0F, 1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 1.0F, 0.0F, -3.5F, 1.0F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1590 */     this.gunModel['ř'].setRotationPoint(-166.0F, -41.5F, 3.0F);
/*      */     
/* 1592 */     this.gunModel['Ś'].addShapeBox(42.0F, 0.0F, -6.0F, 55, 5, 9, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 1593 */     this.gunModel['Ś'].setRotationPoint(-164.0F, -36.5F, 3.0F);
/*      */     
/* 1595 */     this.gunModel['ś'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 14, 12, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/* 1596 */     this.gunModel['ś'].setRotationPoint(-166.0F, -36.5F, 0.0F);
/*      */     
/* 1598 */     this.gunModel['Ŝ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 5, 9, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1599 */     this.gunModel['Ŝ'].setRotationPoint(-168.5F, -41.5F, 3.0F);
/*      */     
/* 1601 */     this.gunModel['ŝ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 39, 12, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 1602 */     this.gunModel['ŝ'].setRotationPoint(-168.5F, -36.5F, 0.0F);
/*      */     
/* 1604 */     this.gunModel['Ş'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 5, 9, 0.0F, 1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 1.0F, 0.0F, -3.5F, 2.0F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1605 */     this.gunModel['Ş'].setRotationPoint(-172.5F, -41.5F, 3.0F);
/*      */     
/* 1607 */     this.gunModel['ş'].addShapeBox(42.0F, 0.0F, -6.0F, 5, 39, 12, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/* 1608 */     this.gunModel['ş'].setRotationPoint(-173.5F, -36.5F, 0.0F);
/*      */     
/* 1610 */     this.gunModel['Š'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 12, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F);
/* 1611 */     this.gunModel['Š'].setRotationPoint(-168.5F, 2.5F, 0.0F);
/*      */     
/* 1613 */     this.gunModel['š'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 1, 9, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F);
/* 1614 */     this.gunModel['š'].setRotationPoint(-168.5F, 4.25F, 1.5F);
/*      */     
/* 1616 */     this.gunModel['Ţ'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 12, 0.0F, 0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F);
/* 1617 */     this.gunModel['Ţ'].setRotationPoint(-174.0F, 2.5F, 0.0F);
/*      */     
/* 1619 */     this.gunModel['ţ'].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 9, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F);
/* 1620 */     this.gunModel['ţ'].setRotationPoint(-174.0F, 4.25F, 1.5F);
/*      */     
/* 1622 */     this.gunModel['Ť'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 33, 12, 0.0F, 1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/* 1623 */     this.gunModel['Ť'].setRotationPoint(-166.0F, -22.5F, 0.0F);
/*      */     
/* 1625 */     this.gunModel['ť'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1626 */     this.gunModel['ť'].setRotationPoint(-165.5F, -22.25F, 0.0F);
/*      */     
/* 1628 */     this.gunModel['Ŧ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 7, 9, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1629 */     this.gunModel['Ŧ'].setRotationPoint(-164.0F, -31.0F, 3.0F);
/*      */     
/* 1631 */     this.gunModel['ŧ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 9, 0.0F, 0.5F, 0.75F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1632 */     this.gunModel['ŧ'].setRotationPoint(-154.0F, -28.0F, 2.0F);
/*      */     
/* 1634 */     this.gunModel['Ũ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 3, 9, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, -3.0F, -0.5F, -0.5F, -3.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1635 */     this.gunModel['Ũ'].setRotationPoint(-151.0F, -27.0F, 3.0F);
/*      */     
/* 1637 */     this.gunModel['ũ'].addShapeBox(42.0F, 0.0F, -6.0F, 26, 1, 12, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/* 1638 */     this.gunModel['ũ'].setRotationPoint(-163.5F, -23.5F, 0.0F);
/*      */     
/* 1640 */     this.gunModel['Ū'].addShapeBox(42.0F, 0.0F, -6.0F, 26, 3, 12, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F);
/* 1641 */     this.gunModel['Ū'].setRotationPoint(-164.0F, 7.5F, 0.0F);
/*      */     
/* 1643 */     this.gunModel['ū'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 30, 12, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F);
/* 1644 */     this.gunModel['ū'].setRotationPoint(-145.0F, -22.5F, 0.0F);
/*      */     
/* 1646 */     this.gunModel['Ŭ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 30, 12, 0.0F, 1.25F, -0.25F, -3.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, 0.25F, -3.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -3.0F);
/* 1647 */     this.gunModel['Ŭ'].setRotationPoint(-148.0F, -22.5F, 0.0F);
/*      */     
/* 1649 */     this.gunModel['ŭ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 23, 12, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -2.0F, 1.25F, -0.25F, -2.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -2.0F, 1.25F, 0.25F, -2.0F, -0.25F, 0.25F, 0.0F);
/* 1650 */     this.gunModel['ŭ'].setRotationPoint(-138.5F, -15.5F, 0.0F);
/*      */     
/* 1652 */     this.gunModel['Ů'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 25, 8, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, -0.25F, -3.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -3.0F, 1.25F, 0.25F, -3.0F, -0.25F, 0.25F, 0.0F);
/* 1653 */     this.gunModel['Ů'].setRotationPoint(-135.5F, -17.5F, 2.0F);
/*      */     
/* 1655 */     this.gunModel['ů'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 12, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F);
/* 1656 */     this.gunModel['ů'].setRotationPoint(-137.0F, -22.5F, 0.0F);
/*      */     
/* 1658 */     this.gunModel['Ű'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 4, 12, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F);
/* 1659 */     this.gunModel['Ű'].setRotationPoint(-133.0F, -22.5F, 0.0F);
/*      */     
/* 1661 */     this.gunModel['ű'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 5, 12, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F);
/* 1662 */     this.gunModel['ű'].setRotationPoint(-135.0F, -22.5F, 0.0F);
/*      */     
/* 1664 */     this.gunModel['Ų'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 12, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, -1.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, 1.25F, 0.25F, -1.0F);
/* 1665 */     this.gunModel['Ų'].setRotationPoint(-133.0F, -18.5F, 0.0F);
/*      */     
/* 1667 */     this.gunModel['ų'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 12, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, 0.25F, 0.25F, 0.0F);
/* 1668 */     this.gunModel['ų'].setRotationPoint(-135.0F, -18.5F, 0.0F);
/*      */     
/* 1670 */     this.gunModel['Ŵ'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 12, 0.0F, 1.25F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F, 1.25F, -0.25F, -2.0F);
/* 1671 */     this.gunModel['Ŵ'].setRotationPoint(-129.0F, -18.5F, 0.0F);
/*      */     
/* 1673 */     this.gunModel['ŵ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 4, 12, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F);
/* 1674 */     this.gunModel['ŵ'].setRotationPoint(-129.0F, -22.5F, 0.0F);
/*      */     
/* 1676 */     this.gunModel['Ŷ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 2, 12, 0.0F, 2.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 2.25F, -0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F);
/* 1677 */     this.gunModel['Ŷ'].setRotationPoint(-164.0F, 10.5F, 0.0F);
/*      */     
/* 1679 */     this.gunModel['ŷ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 2, 12, 0.0F, 1.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F);
/* 1680 */     this.gunModel['ŷ'].setRotationPoint(-164.0F, 12.5F, 0.0F);
/*      */     
/* 1682 */     this.gunModel['Ÿ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 10, 12, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -2.0F, 1.25F, -0.25F, -2.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, -0.25F, 0.25F, 0.0F);
/* 1683 */     this.gunModel['Ÿ'].setRotationPoint(-138.5F, 7.5F, 0.0F);
/*      */     
/* 1685 */     this.gunModel['Ź'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 10, 8, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, -0.25F, -3.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, -0.25F, -3.0F, -0.25F, 0.0F, 0.0F);
/* 1686 */     this.gunModel['Ź'].setRotationPoint(-135.5F, 7.5F, 2.0F);
/*      */     
/* 1688 */     this.gunModel['ź'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 2, 12, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/* 1689 */     this.gunModel['ź'].setRotationPoint(-151.5F, 15.5F, 0.0F);
/*      */     
/* 1691 */     this.gunModel['Ż'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1692 */     this.gunModel['Ż'].setRotationPoint(-153.25F, 15.75F, 0.0F);
/*      */     
/* 1694 */     this.gunModel['ż'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1695 */     this.gunModel['ż'].setRotationPoint(-153.25F, 13.75F, 0.0F);
/*      */     
/* 1697 */     this.gunModel['Ž'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1698 */     this.gunModel['Ž'].setRotationPoint(-155.25F, 13.75F, 0.0F);
/*      */     
/* 1700 */     this.gunModel['ž'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 2, 9, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1701 */     this.gunModel['ž'].setRotationPoint(-150.5F, 11.25F, 1.5F);
/*      */     
/* 1703 */     this.gunModel['ſ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -0.25F, -2.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, -2.0F, -0.25F, 0.0F, -2.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F);
/* 1704 */     this.gunModel['ſ'].setRotationPoint(-152.5F, 11.25F, 1.5F);
/*      */     
/* 1706 */     this.gunModel['ƀ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 9, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, 1.25F, 0.0F, 0.0F);
/* 1707 */     this.gunModel['ƀ'].setRotationPoint(-139.5F, 11.25F, 1.5F);
/*      */     
/* 1709 */     this.gunModel['Ɓ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 2, 9, 0.0F, -0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/* 1710 */     this.gunModel['Ɓ'].setRotationPoint(-150.5F, 13.25F, 1.5F);
/*      */     
/* 1712 */     this.gunModel['Ƃ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -0.5F, -2.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, -2.0F, -0.25F, 0.25F, -2.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F);
/* 1713 */     this.gunModel['Ƃ'].setRotationPoint(-152.5F, 13.25F, 1.5F);
/*      */     
/* 1715 */     this.gunModel['ƃ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 2, 9, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, -2.0F, -0.25F, -0.5F, -2.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F, -0.25F, 0.25F, -2.0F, 1.25F, 0.25F, 0.0F);
/* 1716 */     this.gunModel['ƃ'].setRotationPoint(-139.5F, 13.25F, 1.5F);
/*      */     
/* 1718 */     this.gunModel['Ƅ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1719 */     this.gunModel['Ƅ'].setRotationPoint(-146.25F, 9.25F, 4.0F);
/*      */     
/* 1721 */     this.gunModel['ƅ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1722 */     this.gunModel['ƅ'].setRotationPoint(-142.25F, 9.25F, 4.0F);
/*      */     
/* 1724 */     this.gunModel['Ɔ'].addShapeBox(42.0F, 0.0F, -6.0F, 46, 5, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -7.5F, -1.5F, 0.0F, -7.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1725 */     this.gunModel['Ɔ'].setRotationPoint(-154.0F, -41.5F, 4.5F);
/*      */     
/* 1727 */     this.gunModel['Ƈ'].addShapeBox(42.0F, 0.0F, -6.0F, 46, 7, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F);
/* 1728 */     this.gunModel['Ƈ'].setRotationPoint(-154.0F, -36.5F, 8.0F);
/*      */     
/* 1730 */     this.gunModel['ƈ'].addShapeBox(42.0F, 0.0F, -6.0F, 46, 1, 11, 0.0F, 0.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1731 */     this.gunModel['ƈ'].setRotationPoint(-154.0F, -42.5F, -1.0F);
/*      */     
/* 1733 */     this.gunModel['Ɖ'].addShapeBox(42.0F, 0.0F, -6.0F, 23, 3, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -2.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4.0F, -2.5F, -0.25F, -4.0F);
/* 1734 */     this.gunModel['Ɖ'].setRotationPoint(-154.0F, -29.5F, 8.0F);
/*      */     
/* 1736 */     this.gunModel['Ɗ'].addShapeBox(42.0F, 0.0F, -6.0F, 24, 3, 9, 0.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, -0.25F, -3.5F, -2.5F, -0.25F, -3.5F, -2.5F, -0.25F, -4.0F, -1.5F, -0.25F, -4.0F);
/* 1737 */     this.gunModel['Ɗ'].setRotationPoint(-134.0F, -29.5F, 8.0F);
/*      */     
/* 1739 */     this.gunModel['Ƌ'].addShapeBox(42.0F, 0.0F, -6.0F, 17, 3, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -3.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4.0F, -3.5F, -0.25F, -4.0F);
/* 1740 */     this.gunModel['Ƌ'].setRotationPoint(-151.0F, -26.75F, 8.0F);
/*      */     
/* 1742 */     this.gunModel['ƌ'].addShapeBox(42.0F, 0.0F, -6.0F, 24, 3, 9, 0.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, -0.25F, -3.5F, -3.5F, -0.25F, -3.5F, -3.5F, -0.25F, -4.0F, -1.5F, -0.25F, -4.0F);
/* 1743 */     this.gunModel['ƌ'].setRotationPoint(-137.0F, -26.75F, 8.0F);
/*      */     
/* 1745 */     this.gunModel['ƍ'].addShapeBox(42.0F, 0.0F, -6.0F, 18, 2, 9, 0.0F, -1.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, -1.5F, 0.25F, -4.0F, -1.5F, -0.25F, -3.5F, -6.5F, -0.25F, -3.5F, -6.5F, -0.25F, -4.0F, -1.5F, -0.25F, -4.0F);
/* 1746 */     this.gunModel['ƍ'].setRotationPoint(-135.0F, -23.75F, 8.0F);
/*      */     
/* 1748 */     this.gunModel['Ǝ'].addShapeBox(42.0F, 0.0F, -6.0F, 15, 2, 9, 0.0F, 0.5F, 0.25F, -4.0F, -1.5F, 0.25F, -4.0F, -1.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, -6.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4.0F, -6.5F, -0.25F, -4.0F);
/* 1749 */     this.gunModel['Ǝ'].setRotationPoint(-147.0F, -23.75F, 8.0F);
/*      */     
/* 1751 */     this.gunModel['Ə'].addShapeBox(42.0F, 0.0F, -6.0F, 40, 7, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, -0.5F, -4.0F, -1.5F, -0.5F, -4.0F, -1.5F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F);
/* 1752 */     this.gunModel['Ə'].setRotationPoint(-151.0F, -36.5F, 8.5F);
/*      */     
/* 1754 */     this.gunModel['Ɛ'].addShapeBox(42.0F, 0.0F, -6.0F, 40, 5, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -7.5F, -1.5F, 0.0F, -7.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1755 */     this.gunModel['Ɛ'].setRotationPoint(-151.0F, -41.5F, 5.0F);
/*      */     
/* 1757 */     this.gunModel['Ƒ'].addShapeBox(42.0F, 0.0F, -6.0F, 40, 1, 11, 0.0F, 0.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, 0.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1758 */     this.gunModel['Ƒ'].setRotationPoint(-151.0F, -42.5F, -0.5F);
/*      */     
/* 1760 */     this.gunModel['ƒ'].addShapeBox(42.0F, 0.0F, -6.0F, 18, 3, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -3.75F, 0.5F, 0.0F, -3.75F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -3.75F, 0.5F, 0.0F, -3.75F);
/* 1761 */     this.gunModel['ƒ'].setRotationPoint(-140.0F, -29.0F, 8.5F);
/*      */     
/* 1763 */     this.gunModel['Ɠ'].addShapeBox(42.0F, 0.0F, -6.0F, 18, 2, 9, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -3.75F, 0.5F, 0.0F, -3.75F, -2.5F, 0.5F, -4.0F, -4.5F, 0.5F, -4.0F, -4.5F, 0.5F, -3.75F, -2.5F, 0.5F, -3.75F);
/* 1764 */     this.gunModel['Ɠ'].setRotationPoint(-140.0F, -26.0F, 8.5F);
/*      */     
/* 1766 */     this.gunModel['Ɣ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1767 */     this.gunModel['Ɣ'].setRotationPoint(-138.0F, -28.0F, 13.0F);
/*      */     
/* 1769 */     this.gunModel['ƕ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1770 */     this.gunModel['ƕ'].setRotationPoint(-127.5F, -28.0F, 13.0F);
/*      */     
/* 1772 */     this.gunModel['Ɩ'].addShapeBox(42.0F, 0.0F, -6.0F, 29, 5, 9, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 1773 */     this.gunModel['Ɩ'].setRotationPoint(-109.0F, -36.5F, 3.0F);
/*      */     
/* 1775 */     this.gunModel['Ɨ'].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1776 */     this.gunModel['Ɨ'].setRotationPoint(-145.0F, 17.5F, 3.5F);
/*      */     
/* 1778 */     this.gunModel['Ƙ'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1779 */     this.gunModel['Ƙ'].setRotationPoint(-146.0F, 19.5F, 2.5F);
/*      */     
/* 1781 */     this.gunModel['ƙ'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1782 */     this.gunModel['ƙ'].setRotationPoint(-145.5F, 20.5F, 3.0F);
/*      */     
/* 1784 */     this.gunModel['ƚ'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1785 */     this.gunModel['ƚ'].setRotationPoint(-146.0F, 21.5F, 2.5F);
/*      */     
/* 1787 */     this.gunModel['ƛ'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1788 */     this.gunModel['ƛ'].setRotationPoint(-145.5F, 22.5F, 3.0F);
/*      */     
/* 1790 */     this.gunModel['Ɯ'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1791 */     this.gunModel['Ɯ'].setRotationPoint(-146.0F, 23.5F, 2.5F);
/*      */     
/* 1793 */     this.gunModel['Ɲ'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1794 */     this.gunModel['Ɲ'].setRotationPoint(-150.0F, 24.5F, 3.0F);
/*      */     
/* 1796 */     this.gunModel['ƞ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1797 */     this.gunModel['ƞ'].setRotationPoint(-150.0F, 20.5F, 3.0F);
/*      */     
/* 1799 */     this.gunModel['Ɵ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1800 */     this.gunModel['Ɵ'].setRotationPoint(-156.0F, 20.5F, 3.0F);
/*      */     
/* 1802 */     this.gunModel['Ơ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1803 */     this.gunModel['Ơ'].setRotationPoint(-154.0F, 20.5F, 3.0F);
/*      */     
/* 1805 */     this.gunModel['ơ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, 1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1806 */     this.gunModel['ơ'].setRotationPoint(-154.0F, 25.5F, 3.0F);
/*      */     
/* 1808 */     this.gunModel['Ƣ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1809 */     this.gunModel['Ƣ'].setRotationPoint(-154.0F, 21.5F, 3.0F);
/*      */     
/* 1811 */     this.gunModel['ƣ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1812 */     this.gunModel['ƣ'].setRotationPoint(-154.0F, 24.0F, 3.0F);
/*      */     
/* 1814 */     this.gunModel['Ƥ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1815 */     this.gunModel['Ƥ'].setRotationPoint(-151.0F, 24.0F, 3.0F);
/*      */     
/* 1817 */     this.gunModel['ƥ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1818 */     this.gunModel['ƥ'].setRotationPoint(-151.0F, 21.5F, 3.0F);
/*      */     
/* 1820 */     this.gunModel['Ʀ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1821 */     this.gunModel['Ʀ'].setRotationPoint(-144.5F, 26.5F, 4.0F);
/*      */     
/* 1823 */     this.gunModel['Ƨ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1824 */     this.gunModel['Ƨ'].setRotationPoint(-148.5F, 34.5F, 0.0F);
/*      */     
/* 1826 */     this.gunModel['ƨ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1827 */     this.gunModel['ƨ'].setRotationPoint(-148.5F, 34.5F, 4.0F);
/*      */     
/* 1829 */     this.gunModel['Ʃ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 1830 */     this.gunModel['Ʃ'].setRotationPoint(-148.5F, 34.5F, 8.0F);
/*      */     
/* 1832 */     this.gunModel['ƪ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1833 */     this.gunModel['ƪ'].setRotationPoint(-144.5F, 34.5F, 0.0F);
/*      */     
/* 1835 */     this.gunModel['ƫ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1836 */     this.gunModel['ƫ'].setRotationPoint(-144.5F, 34.5F, 4.0F);
/*      */     
/* 1838 */     this.gunModel['Ƭ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1839 */     this.gunModel['Ƭ'].setRotationPoint(-144.5F, 34.5F, 8.0F);
/*      */     
/* 1841 */     this.gunModel['ƭ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1842 */     this.gunModel['ƭ'].setRotationPoint(-140.5F, 34.5F, 0.0F);
/*      */     
/* 1844 */     this.gunModel['Ʈ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1845 */     this.gunModel['Ʈ'].setRotationPoint(-140.5F, 34.5F, 4.0F);
/*      */     
/* 1847 */     this.gunModel['Ư'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 1848 */     this.gunModel['Ư'].setRotationPoint(-140.5F, 34.5F, 8.0F);
/*      */     
/* 1850 */     this.gunModel['ư'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 3, 8, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/* 1851 */     this.gunModel['ư'].setRotationPoint(-164.5F, -22.5F, 2.0F);
/*      */     
/* 1853 */     this.gunModel['Ʊ'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 4, 8, 0.0F, 1.0F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/* 1854 */     this.gunModel['Ʊ'].setRotationPoint(-164.5F, -19.5F, 2.0F);
/*      */     
/* 1856 */     this.gunModel['Ʋ'].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 8, 0.0F, 1.0F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.25F, -1.0F, -2.75F, 0.25F, -1.0F, -2.75F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F);
/* 1857 */     this.gunModel['Ʋ'].setRotationPoint(-164.5F, -15.5F, 2.0F);
/*      */     
/* 1859 */     this.gunModel['Ƴ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1860 */     this.gunModel['Ƴ'].setRotationPoint(-161.0F, -15.5F, 4.0F);
/*      */     
/* 1862 */     this.gunModel['ƴ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1863 */     this.gunModel['ƴ'].setRotationPoint(-161.0F, -17.5F, 4.0F);
/*      */     
/* 1865 */     this.gunModel['Ƶ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1866 */     this.gunModel['Ƶ'].setRotationPoint(-161.0F, -16.5F, 4.0F);
/*      */     
/* 1868 */     this.gunModel['ƶ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1869 */     this.gunModel['ƶ'].setRotationPoint(-161.0F, -14.5F, 4.0F);
/*      */     
/* 1871 */     this.gunModel['Ʒ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F);
/* 1872 */     this.gunModel['Ʒ'].setRotationPoint(-161.0F, -12.5F, 4.0F);
/*      */     
/* 1874 */     this.gunModel['Ƹ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 10, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1875 */     this.gunModel['Ƹ'].setRotationPoint(-163.0F, -9.5F, 4.0F);
/*      */     
/* 1877 */     this.gunModel['ƹ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1878 */     this.gunModel['ƹ'].setRotationPoint(-162.0F, -17.0F, 5.0F);
/*      */     
/* 1880 */     this.gunModel['ƺ'].addShapeBox(42.0F, 0.0F, -6.0F, 5, 12, 12, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F);
/* 1881 */     this.gunModel['ƺ'].setRotationPoint(-163.5F, -36.5F, 0.0F);
/*      */     
/* 1883 */     this.gunModel['ƻ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1884 */     this.gunModel['ƻ'].setRotationPoint(-159.0F, -36.5F, 0.0F);
/*      */     
/* 1886 */     this.gunModel['Ƽ'].addShapeBox(42.0F, 0.0F, -6.0F, 34, 12, 12, 0.0F, 2.0F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1887 */     this.gunModel['Ƽ'].setRotationPoint(-153.75F, -33.5F, 0.0F);
/*      */     
/* 1889 */     this.gunModel['ƽ'].addShapeBox(42.0F, 0.0F, -6.0F, 35, 3, 12, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F);
/* 1890 */     this.gunModel['ƽ'].setRotationPoint(-153.75F, -38.5F, 0.0F);
/*      */     
/* 1892 */     this.gunModel['ƾ'].addShapeBox(42.0F, 0.0F, -6.0F, 19, 1, 8, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F);
/* 1893 */     this.gunModel['ƾ'].setRotationPoint(-137.5F, -23.5F, 0.0F);
/*      */     
/* 1895 */     this.gunModel['ƿ'].addShapeBox(42.0F, 0.0F, -6.0F, 18, 9, 9, 0.0F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -9.0F, 0.5F, 0.0F, -9.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1896 */     this.gunModel['ƿ'].setRotationPoint(-122.5F, -31.25F, 0.0F);
/*      */     
/* 1898 */     this.gunModel['ǀ'].addShapeBox(42.0F, 0.0F, -6.0F, 35, 3, 4, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1899 */     this.gunModel['ǀ'].setRotationPoint(-118.5F, -31.5F, 0.0F);
/*      */     
/* 1901 */     this.gunModel['ǁ'].addShapeBox(42.0F, 0.0F, -6.0F, 29, 5, 12, 0.0F, 0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1902 */     this.gunModel['ǁ'].setRotationPoint(-109.0F, -41.5F, 0.0F);
/*      */     
/* 1904 */     this.gunModel['ǂ'].addShapeBox(42.0F, 0.0F, -6.0F, 84, 1, 1, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F);
/* 1905 */     this.gunModel['ǂ'].setRotationPoint(-163.5F, -41.5F, 3.0F);
/*      */     
/* 1907 */     this.gunModel['ǃ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1908 */     this.gunModel['ǃ'].setRotationPoint(-83.5F, -34.25F, 1.75F);
/*      */     
/* 1910 */     this.gunModel['Ǆ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1911 */     this.gunModel['Ǆ'].setRotationPoint(-83.5F, -31.25F, 0.25F);
/*      */     
/* 1913 */     this.gunModel['ǅ'].addShapeBox(42.0F, 0.0F, -6.0F, 84, 1, 1, 0.0F, 1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F);
/* 1914 */     this.gunModel['ǅ'].setRotationPoint(-163.5F, -39.5F, 3.0F);
/*      */     
/* 1916 */     this.gunModel['ǆ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1917 */     this.gunModel['ǆ'].setRotationPoint(-151.0F, -28.5F, -0.5F);
/*      */     
/* 1919 */     this.gunModel['Ǉ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1920 */     this.gunModel['Ǉ'].setRotationPoint(-126.0F, -28.5F, -0.5F);
/*      */     
/* 1922 */     this.gunModel['ǈ'].addShapeBox(42.0F, 0.0F, -6.0F, 8, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1923 */     this.gunModel['ǈ'].setRotationPoint(-141.5F, -30.0F, -0.5F);
/*      */     
/* 1925 */     this.gunModel['ǉ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 5, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1926 */     this.gunModel['ǉ'].setRotationPoint(-143.5F, -30.0F, -0.5F);
/*      */     
/* 1928 */     this.gunModel['Ǌ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1929 */     this.gunModel['Ǌ'].setRotationPoint(-133.5F, -30.0F, -0.5F);
/*      */     
/* 1931 */     this.gunModel['ǋ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1932 */     this.gunModel['ǋ'].setRotationPoint(-143.0F, -28.0F, -0.75F);
/*      */     
/* 1934 */     this.gunModel['ǌ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1935 */     this.gunModel['ǌ'].setRotationPoint(-133.0F, -28.0F, -0.75F);
/*      */     
/* 1937 */     this.gunModel['Ǎ'].addShapeBox(42.0F, 0.0F, -6.0F, 35, 15, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/* 1938 */     this.gunModel['Ǎ'].setRotationPoint(-12.25F, -20.0F, 2.5F);
/*      */     
/* 1940 */     this.gunModel['ǎ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1941 */     this.gunModel['ǎ'].setRotationPoint(-13.25F, -3.75F, 2.0F);
/*      */     
/* 1943 */     this.gunModel['Ǐ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1944 */     this.gunModel['Ǐ'].setRotationPoint(-6.25F, -1.75F, 2.0F);
/*      */     
/* 1946 */     this.gunModel['ǐ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 6, 8, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1947 */     this.gunModel['ǐ'].setRotationPoint(-2.25F, 3.25F, 2.0F);
/*      */     
/* 1949 */     this.gunModel['Ǒ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 6, 8, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1950 */     this.gunModel['Ǒ'].setRotationPoint(8.75F, 3.25F, 2.0F);
/*      */     
/* 1952 */     this.gunModel['ǒ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1953 */     this.gunModel['ǒ'].setRotationPoint(-0.75F, 3.75F, 2.0F);
/*      */     
/* 1955 */     this.gunModel['Ǔ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1956 */     this.gunModel['Ǔ'].setRotationPoint(9.75F, -1.75F, 2.0F);
/*      */     
/* 1958 */     this.gunModel['ǔ'].addShapeBox(42.0F, 0.0F, -6.0F, 14, 2, 7, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1959 */     this.gunModel['ǔ'].setRotationPoint(9.75F, -3.75F, 3.0F);
/*      */     
/* 1961 */     this.gunModel['Ǖ'].addShapeBox(42.0F, 0.0F, -6.0F, 7, 11, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1962 */     this.gunModel['Ǖ'].setRotationPoint(-13.25F, -1.75F, 2.5F);
/*      */     
/* 1964 */     this.gunModel['ǖ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1965 */     this.gunModel['ǖ'].setRotationPoint(-1.25F, 4.25F, 2.5F);
/*      */     
/* 1967 */     this.gunModel['Ǘ'].addShapeBox(42.0F, 0.0F, -6.0F, 10, 11, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1968 */     this.gunModel['Ǘ'].setRotationPoint(13.75F, -1.75F, 2.5F);
/*      */     
/* 1970 */     this.gunModel['ǘ'].addShapeBox(42.0F, 0.0F, -6.0F, 12, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1971 */     this.gunModel['ǘ'].setRotationPoint(-2.25F, -3.75F, 2.5F);
/*      */     
/* 1973 */     this.gunModel['Ǚ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1974 */     this.gunModel['Ǚ'].setRotationPoint(-0.75F, -3.25F, 3.0F);
/*      */     
/* 1976 */     this.gunModel['ǚ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1977 */     this.gunModel['ǚ'].setRotationPoint(-0.75F, -1.25F, 3.0F);
/*      */     
/* 1979 */     this.gunModel['Ǜ'].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1980 */     this.gunModel['Ǜ'].setRotationPoint(-0.25F, -1.25F, 3.35F);
/*      */     
/* 1982 */     this.gunModel['ǜ'].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1983 */     this.gunModel['ǜ'].setRotationPoint(-0.25F, 0.75F, 3.35F);
/*      */     
/* 1985 */     this.gunModel['ǝ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1986 */     this.gunModel['ǝ'].setRotationPoint(-0.75F, -3.25F, 2.0F);
/*      */     
/* 1988 */     this.gunModel['Ǟ'].addShapeBox(42.0F, 0.0F, -6.0F, 9, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1989 */     this.gunModel['Ǟ'].setRotationPoint(-0.75F, -1.25F, 2.0F);
/*      */     
/* 1991 */     this.gunModel['ǟ'].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1992 */     this.gunModel['ǟ'].setRotationPoint(-0.25F, -1.25F, 1.65F);
/*      */     
/* 1994 */     this.gunModel['Ǡ'].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1995 */     this.gunModel['Ǡ'].setRotationPoint(-0.25F, 0.75F, 1.65F);
/*      */     
/* 1997 */     this.gunModel['ǡ'].addShapeBox(42.0F, 0.0F, -6.0F, 18, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1998 */     this.gunModel['ǡ'].setRotationPoint(67.25F, -50.0F, 1.5F);
/*      */     
/* 2000 */     this.gunModel['Ǣ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/* 2001 */     this.gunModel['Ǣ'].setRotationPoint(67.25F, -50.0F, 10.5F);
/*      */     
/* 2003 */     this.gunModel['ǣ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2004 */     this.gunModel['ǣ'].setRotationPoint(67.25F, -48.0F, 12.5F);
/*      */     
/* 2006 */     this.gunModel['Ǥ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2007 */     this.gunModel['Ǥ'].setRotationPoint(67.25F, -48.0F, 11.5F);
/*      */     
/* 2009 */     this.gunModel['ǥ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2010 */     this.gunModel['ǥ'].setRotationPoint(67.25F, -47.0F, 11.5F);
/*      */     
/* 2012 */     this.gunModel['Ǧ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2013 */     this.gunModel['Ǧ'].setRotationPoint(67.25F, -47.0F, 12.5F);
/*      */     
/* 2015 */     this.gunModel['ǧ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2016 */     this.gunModel['ǧ'].setRotationPoint(67.25F, -46.0F, 12.0F);
/*      */     
/* 2018 */     this.gunModel['Ǩ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2019 */     this.gunModel['Ǩ'].setRotationPoint(67.25F, -46.0F, 13.0F);
/*      */     
/* 2021 */     this.gunModel['ǩ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2022 */     this.gunModel['ǩ'].setRotationPoint(67.25F, -48.0F, 10.5F);
/*      */     
/* 2024 */     this.gunModel['Ǫ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2025 */     this.gunModel['Ǫ'].setRotationPoint(67.25F, -50.0F, 0.5F);
/*      */     
/* 2027 */     this.gunModel['ǫ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2028 */     this.gunModel['ǫ'].setRotationPoint(67.25F, -48.0F, -1.5F);
/*      */     
/* 2030 */     this.gunModel['Ǭ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2031 */     this.gunModel['Ǭ'].setRotationPoint(67.25F, -48.0F, -0.5F);
/*      */     
/* 2033 */     this.gunModel['ǭ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2034 */     this.gunModel['ǭ'].setRotationPoint(67.25F, -48.0F, 0.5F);
/*      */     
/* 2036 */     this.gunModel['Ǯ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2037 */     this.gunModel['Ǯ'].setRotationPoint(67.25F, -47.0F, -0.5F);
/*      */     
/* 2039 */     this.gunModel['ǯ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2040 */     this.gunModel['ǯ'].setRotationPoint(67.25F, -47.0F, -2.0F);
/*      */     
/* 2042 */     this.gunModel['ǰ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2043 */     this.gunModel['ǰ'].setRotationPoint(67.25F, -46.0F, -1.0F);
/*      */     
/* 2045 */     this.gunModel['Ǳ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2046 */     this.gunModel['Ǳ'].setRotationPoint(67.25F, -46.0F, -2.0F);
/*      */     
/* 2048 */     this.gunModel['ǲ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2049 */     this.gunModel['ǲ'].setRotationPoint(80.25F, -48.0F, 3.0F);
/*      */     
/* 2051 */     this.gunModel['ǳ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 3, 9, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 2052 */     this.gunModel['ǳ'].setRotationPoint(85.75F, -50.0F, 1.5F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2057 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 449, 337, this.textureX, this.textureY);
/* 2058 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/* 2059 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/* 2060 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 953, 137, this.textureX, this.textureY);
/* 2061 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/* 2062 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 985, 329, this.textureX, this.textureY);
/* 2063 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/* 2064 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/* 2065 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 537, 33, this.textureX, this.textureY);
/* 2066 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 617, 33, this.textureX, this.textureY);
/* 2067 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 633, 33, this.textureX, this.textureY);
/* 2068 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 657, 33, this.textureX, this.textureY);
/* 2069 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 905, 33, this.textureX, this.textureY);
/* 2070 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/* 2071 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 49, 153, this.textureX, this.textureY);
/* 2072 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 409, 153, this.textureX, this.textureY);
/* 2073 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 473, 153, this.textureX, this.textureY);
/* 2074 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 625, 329, this.textureX, this.textureY);
/* 2075 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 601, 337, this.textureX, this.textureY);
/* 2076 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 641, 337, this.textureX, this.textureY);
/* 2077 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 233, 185, this.textureX, this.textureY);
/* 2078 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 417, 185, this.textureX, this.textureY);
/* 2079 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 457, 185, this.textureX, this.textureY);
/* 2080 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 497, 185, this.textureX, this.textureY);
/* 2081 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 537, 185, this.textureX, this.textureY);
/* 2082 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 577, 185, this.textureX, this.textureY);
/* 2083 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 617, 185, this.textureX, this.textureY);
/* 2084 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 657, 185, this.textureX, this.textureY);
/* 2085 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 697, 185, this.textureX, this.textureY);
/* 2086 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 2087 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/* 2088 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 393, 225, this.textureX, this.textureY);
/* 2089 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 1009, 249, this.textureX, this.textureY);
/* 2090 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 321, 281, this.textureX, this.textureY);
/* 2091 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 657, 337, this.textureX, this.textureY);
/* 2092 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 673, 337, this.textureX, this.textureY);
/* 2093 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 689, 337, this.textureX, this.textureY);
/* 2094 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 337, 329, this.textureX, this.textureY);
/* 2095 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 841, 329, this.textureX, this.textureY);
/* 2096 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 953, 329, this.textureX, this.textureY);
/* 2097 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 833, 153, this.textureX, this.textureY);
/* 2098 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 489, 209, this.textureX, this.textureY);
/* 2099 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 145, 217, this.textureX, this.textureY);
/* 2100 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 377, 337, this.textureX, this.textureY);
/* 2101 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 705, 337, this.textureX, this.textureY);
/* 2102 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 721, 337, this.textureX, this.textureY);
/* 2103 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/* 2104 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 1017, 9, this.textureX, this.textureY);
/* 2105 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 2106 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 2107 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/* 2108 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*      */     
/* 2110 */     this.gunModel['Ǵ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 4, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2111 */     this.gunModel['Ǵ'].setRotationPoint(85.25F, -46.0F, 1.5F);
/*      */     
/* 2113 */     this.gunModel['ǵ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 4, 2, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2114 */     this.gunModel['ǵ'].setRotationPoint(85.75F, -47.0F, 13.5F);
/*      */     
/* 2116 */     this.gunModel['Ƕ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 2, 2, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F);
/* 2117 */     this.gunModel['Ƕ'].setRotationPoint(85.75F, -43.0F, 15.75F);
/*      */     
/* 2119 */     this.gunModel['Ƿ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 4, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2120 */     this.gunModel['Ƿ'].setRotationPoint(85.75F, -47.0F, -3.5F);
/*      */     
/* 2122 */     this.gunModel['Ǹ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F);
/* 2123 */     this.gunModel['Ǹ'].setRotationPoint(85.75F, -43.0F, -5.75F);
/*      */     
/* 2125 */     this.gunModel['ǹ'].addShapeBox(42.0F, 0.0F, -6.0F, 11, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2126 */     this.gunModel['ǹ'].setRotationPoint(85.25F, -47.0F, 2.0F);
/*      */     
/* 2128 */     this.gunModel['Ǻ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2129 */     this.gunModel['Ǻ'].setRotationPoint(67.25F, -45.0F, 12.5F);
/*      */     
/* 2131 */     this.gunModel['ǻ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2132 */     this.gunModel['ǻ'].setRotationPoint(67.25F, -45.0F, 13.5F);
/*      */     
/* 2134 */     this.gunModel['Ǽ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2135 */     this.gunModel['Ǽ'].setRotationPoint(67.25F, -44.0F, 13.0F);
/*      */     
/* 2137 */     this.gunModel['ǽ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2138 */     this.gunModel['ǽ'].setRotationPoint(67.25F, -44.0F, 14.0F);
/*      */     
/* 2140 */     this.gunModel['Ǿ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2141 */     this.gunModel['Ǿ'].setRotationPoint(67.25F, -45.0F, -1.5F);
/*      */     
/* 2143 */     this.gunModel['ǿ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2144 */     this.gunModel['ǿ'].setRotationPoint(67.25F, -45.0F, -2.5F);
/*      */     
/* 2146 */     this.gunModel['Ȁ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2147 */     this.gunModel['Ȁ'].setRotationPoint(67.25F, -44.0F, -2.0F);
/*      */     
/* 2149 */     this.gunModel['ȁ'].addShapeBox(42.0F, 0.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2150 */     this.gunModel['ȁ'].setRotationPoint(67.25F, -44.0F, -3.0F);
/*      */     
/* 2152 */     this.gunModel['Ȃ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2153 */     this.gunModel['Ȃ'].setRotationPoint(86.75F, 29.0F, 26.75F);
/*      */     
/* 2155 */     this.gunModel['ȃ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2156 */     this.gunModel['ȃ'].setRotationPoint(89.75F, 29.0F, 26.75F);
/*      */     
/* 2158 */     this.gunModel['Ȅ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2159 */     this.gunModel['Ȅ'].setRotationPoint(92.75F, 29.0F, 26.75F);
/*      */     
/* 2161 */     this.gunModel['ȅ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 68, 3, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -17.75F, 0.25F, 0.0F, -17.75F, 0.25F, 0.0F, 18.25F, 0.25F, 0.0F, 18.25F);
/* 2162 */     this.gunModel['ȅ'].setRotationPoint(90.75F, -39.25F, 12.25F);
/*      */     
/* 2164 */     this.gunModel['Ȇ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 68, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -17.75F, 0.25F, 0.0F, -19.0F, 0.25F, 0.0F, 17.0F, 0.0F, 0.0F, 18.25F);
/* 2165 */     this.gunModel['Ȇ'].setRotationPoint(92.0F, -39.25F, 12.25F);
/*      */     
/* 2167 */     this.gunModel['ȇ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 68, 3, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -19.0F, 0.0F, 0.0F, -17.75F, 0.0F, 0.0F, 18.25F, 0.25F, 0.0F, 17.0F);
/* 2168 */     this.gunModel['ȇ'].setRotationPoint(89.5F, -39.25F, 12.25F);
/*      */     
/* 2170 */     this.gunModel['Ȉ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F);
/* 2171 */     this.gunModel['Ȉ'].setRotationPoint(90.25F, -46.0F, 9.25F);
/*      */     
/* 2173 */     this.gunModel['ȉ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F);
/* 2174 */     this.gunModel['ȉ'].setRotationPoint(91.75F, -46.0F, 9.25F);
/*      */     
/* 2176 */     this.gunModel['Ȋ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F);
/* 2177 */     this.gunModel['Ȋ'].setRotationPoint(88.75F, -46.0F, 9.25F);
/*      */     
/* 2179 */     this.gunModel['ȋ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F);
/* 2180 */     this.gunModel['ȋ'].setRotationPoint(90.25F, -19.0F, 16.75F);
/*      */     
/* 2182 */     this.gunModel['Ȍ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F);
/* 2183 */     this.gunModel['Ȍ'].setRotationPoint(91.75F, -19.0F, 16.75F);
/*      */     
/* 2185 */     this.gunModel['ȍ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F);
/* 2186 */     this.gunModel['ȍ'].setRotationPoint(88.75F, -19.0F, 16.75F);
/*      */     
/* 2188 */     this.gunModel['Ȏ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F);
/* 2189 */     this.gunModel['Ȏ'].setRotationPoint(90.25F, 22.25F, 27.5F);
/*      */     
/* 2191 */     this.gunModel['ȏ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F);
/* 2192 */     this.gunModel['ȏ'].setRotationPoint(91.75F, 22.25F, 27.5F);
/*      */     
/* 2194 */     this.gunModel['Ȑ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F);
/* 2195 */     this.gunModel['Ȑ'].setRotationPoint(88.75F, 22.25F, 27.5F);
/*      */     
/* 2197 */     this.gunModel['ȑ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 2, 0.0F, -0.25F, -5.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 2.0F);
/* 2198 */     this.gunModel['ȑ'].setRotationPoint(87.25F, 22.25F, 29.0F);
/*      */     
/* 2200 */     this.gunModel['Ȓ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 4, 1, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2201 */     this.gunModel['Ȓ'].setRotationPoint(87.25F, 23.0F, 30.0F);
/*      */     
/* 2203 */     this.gunModel['ȓ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F);
/* 2204 */     this.gunModel['ȓ'].setRotationPoint(90.25F, -46.0F, -2.25F);
/*      */     
/* 2206 */     this.gunModel['Ȕ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F);
/* 2207 */     this.gunModel['Ȕ'].setRotationPoint(91.75F, -46.0F, -2.25F);
/*      */     
/* 2209 */     this.gunModel['ȕ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F);
/* 2210 */     this.gunModel['ȕ'].setRotationPoint(88.75F, -46.0F, -2.25F);
/*      */     
/* 2212 */     this.gunModel['Ȗ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 68, 3, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 18.25F, 0.25F, 0.0F, 18.25F, 0.25F, 0.0F, -17.75F, 0.25F, 0.0F, -17.75F);
/* 2213 */     this.gunModel['Ȗ'].setRotationPoint(90.75F, -39.25F, -3.25F);
/*      */     
/* 2215 */     this.gunModel['ȗ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 68, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 18.25F, 0.25F, 0.0F, 17.0F, 0.25F, 0.0F, -19.0F, 0.0F, 0.0F, -17.75F);
/* 2216 */     this.gunModel['ȗ'].setRotationPoint(92.0F, -39.25F, -3.25F);
/*      */     
/* 2218 */     this.gunModel['Ș'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 68, 3, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 17.0F, 0.0F, 0.0F, 18.25F, 0.0F, 0.0F, -17.75F, 0.25F, 0.0F, -19.0F);
/* 2219 */     this.gunModel['Ș'].setRotationPoint(89.5F, -39.25F, -3.25F);
/*      */     
/* 2221 */     this.gunModel['ș'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F);
/* 2222 */     this.gunModel['ș'].setRotationPoint(90.25F, -19.0F, -9.75F);
/*      */     
/* 2224 */     this.gunModel['Ț'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F);
/* 2225 */     this.gunModel['Ț'].setRotationPoint(91.75F, -19.0F, -9.75F);
/*      */     
/* 2227 */     this.gunModel['ț'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F);
/* 2228 */     this.gunModel['ț'].setRotationPoint(88.75F, -19.0F, -9.75F);
/*      */     
/* 2230 */     this.gunModel['Ȝ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 2231 */     this.gunModel['Ȝ'].setRotationPoint(86.75F, 29.0F, -23.75F);
/*      */     
/* 2233 */     this.gunModel['ȝ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2234 */     this.gunModel['ȝ'].setRotationPoint(89.75F, 29.0F, -23.75F);
/*      */     
/* 2236 */     this.gunModel['Ȟ'].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 2237 */     this.gunModel['Ȟ'].setRotationPoint(92.75F, 29.0F, -23.75F);
/*      */     
/* 2239 */     this.gunModel['ȟ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F);
/* 2240 */     this.gunModel['ȟ'].setRotationPoint(90.25F, 22.25F, -20.5F);
/*      */     
/* 2242 */     this.gunModel['Ƞ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F);
/* 2243 */     this.gunModel['Ƞ'].setRotationPoint(91.75F, 22.25F, -20.5F);
/*      */     
/* 2245 */     this.gunModel['ȡ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 5, 0.0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F);
/* 2246 */     this.gunModel['ȡ'].setRotationPoint(88.75F, 22.25F, -20.5F);
/*      */     
/* 2248 */     this.gunModel['Ȣ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 7, 2, 0.0F, -0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, -0.75F, -0.25F, -0.25F, 2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -1.5F);
/* 2249 */     this.gunModel['Ȣ'].setRotationPoint(87.25F, 22.25F, -19.0F);
/*      */     
/* 2251 */     this.gunModel['ȣ'].addShapeBox(42.0F, 0.0F, -6.0F, 2, 4, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2252 */     this.gunModel['ȣ'].setRotationPoint(87.25F, 23.0F, -19.0F);
/*      */     
/* 2254 */     this.gunModel['Ȥ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2255 */     this.gunModel['Ȥ'].setRotationPoint(95.0F, -49.0F, 12.0F);
/*      */     
/* 2257 */     this.gunModel['ȥ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2258 */     this.gunModel['ȥ'].setRotationPoint(86.5F, -49.0F, 12.0F);
/*      */     
/* 2260 */     this.gunModel['Ȧ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2261 */     this.gunModel['Ȧ'].setRotationPoint(86.5F, -49.0F, -1.0F);
/*      */     
/* 2263 */     this.gunModel['ȧ'].addShapeBox(42.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2264 */     this.gunModel['ȧ'].setRotationPoint(95.0F, -49.0F, -1.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2269 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 145, 305, this.textureX, this.textureY);
/* 2270 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 377, 305, this.textureX, this.textureY);
/* 2271 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 745, 305, this.textureX, this.textureY);
/* 2272 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/* 2273 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 857, 305, this.textureX, this.textureY);
/* 2274 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 1, 313, this.textureX, this.textureY);
/* 2275 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 305, 313, this.textureX, this.textureY);
/* 2276 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 977, 305, this.textureX, this.textureY);
/* 2277 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 73, 313, this.textureX, this.textureY);
/* 2278 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 233, 313, this.textureX, this.textureY);
/* 2279 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 585, 89, this.textureX, this.textureY);
/* 2280 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 561, 313, this.textureX, this.textureY);
/* 2281 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 585, 313, this.textureX, this.textureY);
/* 2282 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 617, 313, this.textureX, this.textureY);
/* 2283 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 921, 313, this.textureX, this.textureY);
/* 2284 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 105, 321, this.textureX, this.textureY);
/* 2285 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 161, 321, this.textureX, this.textureY);
/* 2286 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 705, 313, this.textureX, this.textureY);
/* 2287 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 641, 313, this.textureX, this.textureY);
/* 2288 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 257, 321, this.textureX, this.textureY);
/* 2289 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 873, 57, this.textureX, this.textureY);
/* 2290 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 897, 65, this.textureX, this.textureY);
/* 2291 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 921, 65, this.textureX, this.textureY);
/* 2292 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/* 2293 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 657, 81, this.textureX, this.textureY);
/* 2294 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
/* 2295 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/* 2296 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/* 2297 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/* 2298 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 2299 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/* 2300 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 2301 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 521, 17, this.textureX, this.textureY);
/* 2302 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/* 2303 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/* 2304 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/* 2305 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/* 2306 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 761, 57, this.textureX, this.textureY);
/* 2307 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 2308 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/* 2309 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 2310 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/* 2311 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/* 2312 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 313, 89, this.textureX, this.textureY);
/* 2313 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 961, 65, this.textureX, this.textureY);
/* 2314 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 2315 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/* 2316 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/* 2317 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/* 2318 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/* 2319 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/* 2320 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/* 2321 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 537, 73, this.textureX, this.textureY);
/* 2322 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/* 2323 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/* 2324 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 1009, 105, this.textureX, this.textureY);
/* 2325 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 1001, 297, this.textureX, this.textureY);
/* 2326 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/* 2327 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/* 2328 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 305, 113, this.textureX, this.textureY);
/* 2329 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 865, 89, this.textureX, this.textureY);
/* 2330 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 713, 97, this.textureX, this.textureY);
/* 2331 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/* 2332 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 281, 321, this.textureX, this.textureY);
/* 2333 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/* 2334 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 641, 105, this.textureX, this.textureY);
/* 2335 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 809, 105, this.textureX, this.textureY);
/* 2336 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 521, 313, this.textureX, this.textureY);
/* 2337 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 841, 313, this.textureX, this.textureY);
/* 2338 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 217, 321, this.textureX, this.textureY);
/* 2339 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 369, 321, this.textureX, this.textureY);
/* 2340 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 401, 321, this.textureX, this.textureY);
/* 2341 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 433, 321, this.textureX, this.textureY);
/* 2342 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 1001, 313, this.textureX, this.textureY);
/* 2343 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 465, 321, this.textureX, this.textureY);
/* 2344 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 489, 321, this.textureX, this.textureY);
/* 2345 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 673, 321, this.textureX, this.textureY);
/* 2346 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 729, 321, this.textureX, this.textureY);
/* 2347 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 777, 321, this.textureX, this.textureY);
/* 2348 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 537, 321, this.textureX, this.textureY);
/* 2349 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 825, 321, this.textureX, this.textureY);
/* 2350 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 857, 321, this.textureX, this.textureY);
/* 2351 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 881, 321, this.textureX, this.textureY);
/* 2352 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 905, 321, this.textureX, this.textureY);
/* 2353 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 969, 321, this.textureX, this.textureY);
/* 2354 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 1, 329, this.textureX, this.textureY);
/* 2355 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 33, 329, this.textureX, this.textureY);
/* 2356 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 233, 329, this.textureX, this.textureY);
/* 2357 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 57, 337, this.textureX, this.textureY);
/* 2358 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 153, 337, this.textureX, this.textureY);
/* 2359 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 257, 337, this.textureX, this.textureY);
/* 2360 */     this.defaultScopeModel[91] = new ModelRendererTurbo(this, 497, 329, this.textureX, this.textureY);
/* 2361 */     this.defaultScopeModel[92] = new ModelRendererTurbo(this, 913, 329, this.textureX, this.textureY);
/* 2362 */     this.defaultScopeModel[93] = new ModelRendererTurbo(this, 337, 337, this.textureX, this.textureY);
/*      */     
/* 2364 */     this.defaultScopeModel[0].addShapeBox(42.0F, 0.0F, -6.0F, 8, 5, 10, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 2365 */     this.defaultScopeModel[0].setRotationPoint(-47.75F, -47.0F, 1.0F);
/*      */     
/* 2367 */     this.defaultScopeModel[1].addShapeBox(42.0F, 0.0F, -6.0F, 8, 5, 10, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 2368 */     this.defaultScopeModel[1].setRotationPoint(-22.75F, -47.0F, 1.0F);
/*      */     
/* 2370 */     this.defaultScopeModel[2].addShapeBox(42.0F, 0.0F, -6.0F, 42, 5, 10, 0.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2371 */     this.defaultScopeModel[2].setRotationPoint(-52.75F, -52.0F, 1.0F);
/*      */     
/* 2373 */     this.defaultScopeModel[3].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 6, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 2374 */     this.defaultScopeModel[3].setRotationPoint(-48.75F, -53.5F, 3.0F);
/*      */     
/* 2376 */     this.defaultScopeModel[4].addShapeBox(42.0F, 0.0F, -6.0F, 25, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2377 */     this.defaultScopeModel[4].setRotationPoint(-59.75F, -63.5F, 1.5F);
/*      */     
/* 2379 */     this.defaultScopeModel[5].addShapeBox(42.0F, 0.0F, -6.0F, 25, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2380 */     this.defaultScopeModel[5].setRotationPoint(-59.75F, -60.5F, 1.5F);
/*      */     
/* 2382 */     this.defaultScopeModel[6].addShapeBox(42.0F, 0.0F, -6.0F, 25, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2383 */     this.defaultScopeModel[6].setRotationPoint(-59.75F, -57.5F, 1.5F);
/*      */     
/* 2385 */     this.defaultScopeModel[7].addShapeBox(42.0F, 0.0F, -6.0F, 8, 3, 6, 0.0F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F);
/* 2386 */     this.defaultScopeModel[7].setRotationPoint(-48.75F, -57.0F, 3.0F);
/*      */     
/* 2388 */     this.defaultScopeModel[8].addShapeBox(42.0F, 0.0F, -6.0F, 8, 4, 12, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 2389 */     this.defaultScopeModel[8].setRotationPoint(-48.75F, -61.5F, 0.0F);
/*      */     
/* 2391 */     this.defaultScopeModel[9].addShapeBox(42.0F, 0.0F, -6.0F, 8, 3, 6, 0.0F, 0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F);
/* 2392 */     this.defaultScopeModel[9].setRotationPoint(-48.75F, -64.5F, 3.0F);
/*      */     
/* 2394 */     this.defaultScopeModel[10].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 6, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 2395 */     this.defaultScopeModel[10].setRotationPoint(-21.75F, -53.5F, 3.0F);
/*      */     
/* 2397 */     this.defaultScopeModel[11].addShapeBox(42.0F, 0.0F, -6.0F, 8, 3, 6, 0.0F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F);
/* 2398 */     this.defaultScopeModel[11].setRotationPoint(-21.75F, -57.0F, 3.0F);
/*      */     
/* 2400 */     this.defaultScopeModel[12].addShapeBox(42.0F, 0.0F, -6.0F, 8, 4, 12, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 2401 */     this.defaultScopeModel[12].setRotationPoint(-21.75F, -61.5F, 0.0F);
/*      */     
/* 2403 */     this.defaultScopeModel[13].addShapeBox(42.0F, 0.0F, -6.0F, 8, 3, 6, 0.0F, 0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F);
/* 2404 */     this.defaultScopeModel[13].setRotationPoint(-21.75F, -64.5F, 3.0F);
/*      */     
/* 2406 */     this.defaultScopeModel[14].addShapeBox(42.0F, 0.0F, -6.0F, 18, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2407 */     this.defaultScopeModel[14].setRotationPoint(-28.75F, -63.5F, 1.5F);
/*      */     
/* 2409 */     this.defaultScopeModel[15].addShapeBox(42.0F, 0.0F, -6.0F, 18, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2410 */     this.defaultScopeModel[15].setRotationPoint(-28.75F, -60.5F, 1.5F);
/*      */     
/* 2412 */     this.defaultScopeModel[16].addShapeBox(42.0F, 0.0F, -6.0F, 18, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2413 */     this.defaultScopeModel[16].setRotationPoint(-28.75F, -57.5F, 1.5F);
/*      */     
/* 2415 */     this.defaultScopeModel[17].addShapeBox(42.0F, 0.0F, -6.0F, 9, 3, 6, 0.0F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F, -0.5F, 0.5F, 1.0F, -1.5F, 0.5F, 1.0F, -1.5F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F);
/* 2416 */     this.defaultScopeModel[17].setRotationPoint(-35.75F, -57.0F, 3.0F);
/*      */     
/* 2418 */     this.defaultScopeModel[18].addShapeBox(42.0F, 0.0F, -6.0F, 9, 4, 12, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 2419 */     this.defaultScopeModel[18].setRotationPoint(-35.75F, -61.5F, 0.0F);
/*      */     
/* 2421 */     this.defaultScopeModel[19].addShapeBox(42.0F, 0.0F, -6.0F, 9, 3, 6, 0.0F, -0.5F, 0.5F, 1.0F, -1.5F, 0.5F, 1.0F, -1.5F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, 0.5F, 0.0F, 3.0F);
/* 2422 */     this.defaultScopeModel[19].setRotationPoint(-35.75F, -64.5F, 3.0F);
/*      */     
/* 2424 */     this.defaultScopeModel[20].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -2.75F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2425 */     this.defaultScopeModel[20].setRotationPoint(-35.75F, -63.0F, 12.0F);
/*      */     
/* 2427 */     this.defaultScopeModel[21].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2428 */     this.defaultScopeModel[21].setRotationPoint(-33.25F, -63.0F, 12.0F);
/*      */     
/* 2430 */     this.defaultScopeModel[22].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 1.0F, -2.75F, -0.25F, 1.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2431 */     this.defaultScopeModel[22].setRotationPoint(-30.75F, -63.0F, 12.0F);
/*      */     
/* 2433 */     this.defaultScopeModel[23].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2434 */     this.defaultScopeModel[23].setRotationPoint(-33.25F, -60.5F, 12.0F);
/*      */     
/* 2436 */     this.defaultScopeModel[24].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2437 */     this.defaultScopeModel[24].setRotationPoint(-35.75F, -60.5F, 12.0F);
/*      */     
/* 2439 */     this.defaultScopeModel[25].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2440 */     this.defaultScopeModel[25].setRotationPoint(-30.75F, -60.5F, 12.0F);
/*      */     
/* 2442 */     this.defaultScopeModel[26].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.0F, -2.75F, -0.25F, 1.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2443 */     this.defaultScopeModel[26].setRotationPoint(-30.75F, -58.0F, 12.0F);
/*      */     
/* 2445 */     this.defaultScopeModel[27].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F);
/* 2446 */     this.defaultScopeModel[27].setRotationPoint(-35.75F, -58.0F, 12.0F);
/*      */     
/* 2448 */     this.defaultScopeModel[28].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2449 */     this.defaultScopeModel[28].setRotationPoint(-33.25F, -58.0F, 12.0F);
/*      */     
/* 2451 */     this.defaultScopeModel[29].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2452 */     this.defaultScopeModel[29].setRotationPoint(-35.75F, -63.0F, 16.0F);
/*      */     
/* 2454 */     this.defaultScopeModel[30].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2455 */     this.defaultScopeModel[30].setRotationPoint(-33.25F, -63.0F, 16.0F);
/*      */     
/* 2457 */     this.defaultScopeModel[31].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2458 */     this.defaultScopeModel[31].setRotationPoint(-30.75F, -63.0F, 16.0F);
/*      */     
/* 2460 */     this.defaultScopeModel[32].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2461 */     this.defaultScopeModel[32].setRotationPoint(-33.25F, -60.5F, 16.0F);
/*      */     
/* 2463 */     this.defaultScopeModel[33].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2464 */     this.defaultScopeModel[33].setRotationPoint(-35.75F, -60.5F, 16.0F);
/*      */     
/* 2466 */     this.defaultScopeModel[34].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2467 */     this.defaultScopeModel[34].setRotationPoint(-30.75F, -60.5F, 16.0F);
/*      */     
/* 2469 */     this.defaultScopeModel[35].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2470 */     this.defaultScopeModel[35].setRotationPoint(-30.75F, -58.0F, 16.0F);
/*      */     
/* 2472 */     this.defaultScopeModel[36].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F);
/* 2473 */     this.defaultScopeModel[36].setRotationPoint(-35.75F, -58.0F, 16.0F);
/*      */     
/* 2475 */     this.defaultScopeModel[37].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2476 */     this.defaultScopeModel[37].setRotationPoint(-33.25F, -58.0F, 16.0F);
/*      */     
/* 2478 */     this.defaultScopeModel[38].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2479 */     this.defaultScopeModel[38].setRotationPoint(-34.75F, -62.25F, 15.0F);
/*      */     
/* 2481 */     this.defaultScopeModel[39].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2482 */     this.defaultScopeModel[39].setRotationPoint(-34.75F, -60.25F, 15.0F);
/*      */     
/* 2484 */     this.defaultScopeModel[40].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2485 */     this.defaultScopeModel[40].setRotationPoint(-34.75F, -58.25F, 15.0F);
/*      */     
/* 2487 */     this.defaultScopeModel[41].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2488 */     this.defaultScopeModel[41].setRotationPoint(-34.75F, -62.25F, -2.0F);
/*      */     
/* 2490 */     this.defaultScopeModel[42].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2491 */     this.defaultScopeModel[42].setRotationPoint(-34.75F, -60.25F, -2.0F);
/*      */     
/* 2493 */     this.defaultScopeModel[43].addShapeBox(42.0F, 0.0F, -6.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2494 */     this.defaultScopeModel[43].setRotationPoint(-34.75F, -58.25F, -2.0F);
/*      */     
/* 2496 */     this.defaultScopeModel[44].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2497 */     this.defaultScopeModel[44].setRotationPoint(-35.75F, -63.0F, -3.0F);
/*      */     
/* 2499 */     this.defaultScopeModel[45].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2500 */     this.defaultScopeModel[45].setRotationPoint(-33.25F, -63.0F, -3.0F);
/*      */     
/* 2502 */     this.defaultScopeModel[46].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2503 */     this.defaultScopeModel[46].setRotationPoint(-30.75F, -63.0F, -3.0F);
/*      */     
/* 2505 */     this.defaultScopeModel[47].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2506 */     this.defaultScopeModel[47].setRotationPoint(-33.25F, -60.5F, -3.0F);
/*      */     
/* 2508 */     this.defaultScopeModel[48].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2509 */     this.defaultScopeModel[48].setRotationPoint(-35.75F, -60.5F, -3.0F);
/*      */     
/* 2511 */     this.defaultScopeModel[49].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2512 */     this.defaultScopeModel[49].setRotationPoint(-30.75F, -60.5F, -3.0F);
/*      */     
/* 2514 */     this.defaultScopeModel[50].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2515 */     this.defaultScopeModel[50].setRotationPoint(-30.75F, -58.0F, -3.0F);
/*      */     
/* 2517 */     this.defaultScopeModel[51].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F);
/* 2518 */     this.defaultScopeModel[51].setRotationPoint(-35.75F, -58.0F, -3.0F);
/*      */     
/* 2520 */     this.defaultScopeModel[52].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2521 */     this.defaultScopeModel[52].setRotationPoint(-33.25F, -58.0F, -3.0F);
/*      */     
/* 2523 */     this.defaultScopeModel[53].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2524 */     this.defaultScopeModel[53].setRotationPoint(-35.75F, -70.0F, 4.5F);
/*      */     
/* 2526 */     this.defaultScopeModel[54].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2527 */     this.defaultScopeModel[54].setRotationPoint(-35.75F, -70.0F, 2.0F);
/*      */     
/* 2529 */     this.defaultScopeModel[55].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F);
/* 2530 */     this.defaultScopeModel[55].setRotationPoint(-35.75F, -70.0F, 7.0F);
/*      */     
/* 2532 */     this.defaultScopeModel[56].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 8, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2533 */     this.defaultScopeModel[56].setRotationPoint(-33.25F, -70.0F, 2.0F);
/*      */     
/* 2535 */     this.defaultScopeModel[57].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2536 */     this.defaultScopeModel[57].setRotationPoint(-30.75F, -70.0F, 2.0F);
/*      */     
/* 2538 */     this.defaultScopeModel[58].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2539 */     this.defaultScopeModel[58].setRotationPoint(-30.75F, -70.0F, 4.5F);
/*      */     
/* 2541 */     this.defaultScopeModel[59].addShapeBox(42.0F, 0.0F, -6.0F, 3, 5, 3, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -0.25F);
/* 2542 */     this.defaultScopeModel[59].setRotationPoint(-30.75F, -70.0F, 7.0F);
/*      */     
/* 2544 */     this.defaultScopeModel[60].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 4, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2545 */     this.defaultScopeModel[60].setRotationPoint(-37.25F, -72.0F, 4.0F);
/*      */     
/* 2547 */     this.defaultScopeModel[61].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 4, 0.0F, -0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -3.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2548 */     this.defaultScopeModel[61].setRotationPoint(-37.25F, -72.0F, 0.5F);
/*      */     
/* 2550 */     this.defaultScopeModel[62].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 4, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -3.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -3.75F);
/* 2551 */     this.defaultScopeModel[62].setRotationPoint(-37.25F, -72.0F, 7.5F);
/*      */     
/* 2553 */     this.defaultScopeModel[63].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 11, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2554 */     this.defaultScopeModel[63].setRotationPoint(-33.75F, -72.0F, 0.5F);
/*      */     
/* 2556 */     this.defaultScopeModel[64].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 4, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -3.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2557 */     this.defaultScopeModel[64].setRotationPoint(-30.25F, -72.0F, 0.5F);
/*      */     
/* 2559 */     this.defaultScopeModel[65].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 4, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 2560 */     this.defaultScopeModel[65].setRotationPoint(-30.25F, -72.0F, 4.0F);
/*      */     
/* 2562 */     this.defaultScopeModel[66].addShapeBox(42.0F, 0.0F, -6.0F, 4, 2, 4, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -3.75F, -0.25F, 0.0F, -0.25F);
/* 2563 */     this.defaultScopeModel[66].setRotationPoint(-30.25F, -72.0F, 7.5F);
/*      */     
/* 2565 */     this.defaultScopeModel[67].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 9, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 2566 */     this.defaultScopeModel[67].setRotationPoint(-62.75F, -63.5F, 1.5F);
/*      */     
/* 2568 */     this.defaultScopeModel[68].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 2569 */     this.defaultScopeModel[68].setRotationPoint(-62.75F, -60.5F, 1.5F);
/*      */     
/* 2571 */     this.defaultScopeModel[69].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 2572 */     this.defaultScopeModel[69].setRotationPoint(-62.75F, -57.5F, 1.5F);
/*      */     
/* 2574 */     this.defaultScopeModel[70].addShapeBox(42.0F, 0.0F, -6.0F, 4, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2575 */     this.defaultScopeModel[70].setRotationPoint(-66.75F, -60.5F, 0.5F);
/*      */     
/* 2577 */     this.defaultScopeModel[71].addShapeBox(42.0F, 0.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2578 */     this.defaultScopeModel[71].setRotationPoint(-66.75F, -64.5F, 0.5F);
/*      */     
/* 2580 */     this.defaultScopeModel[72].addShapeBox(42.0F, 0.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2581 */     this.defaultScopeModel[72].setRotationPoint(-66.75F, -57.5F, 0.5F);
/*      */     
/* 2583 */     this.defaultScopeModel[73].addShapeBox(42.0F, 0.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2584 */     this.defaultScopeModel[73].setRotationPoint(-79.75F, -60.5F, 1.5F);
/*      */     
/* 2586 */     this.defaultScopeModel[74].addShapeBox(42.0F, 0.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2587 */     this.defaultScopeModel[74].setRotationPoint(-79.75F, -63.5F, 1.5F);
/*      */     
/* 2589 */     this.defaultScopeModel[75].addShapeBox(42.0F, 0.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2590 */     this.defaultScopeModel[75].setRotationPoint(-79.75F, -57.5F, 1.5F);
/*      */     
/* 2592 */     this.defaultScopeModel[76].addShapeBox(42.0F, 0.0F, -6.0F, 10, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2593 */     this.defaultScopeModel[76].setRotationPoint(-76.75F, -60.5F, 0.5F);
/*      */     
/* 2595 */     this.defaultScopeModel[77].addShapeBox(42.0F, 0.0F, -6.0F, 10, 4, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2596 */     this.defaultScopeModel[77].setRotationPoint(-76.75F, -64.5F, 0.5F);
/*      */     
/* 2598 */     this.defaultScopeModel[78].addShapeBox(42.0F, 0.0F, -6.0F, 10, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2599 */     this.defaultScopeModel[78].setRotationPoint(-76.75F, -57.5F, 0.5F);
/*      */     
/* 2601 */     this.defaultScopeModel[79].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/* 2602 */     this.defaultScopeModel[79].setRotationPoint(-77.75F, -63.5F, 1.5F);
/*      */     
/* 2604 */     this.defaultScopeModel[80].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F);
/* 2605 */     this.defaultScopeModel[80].setRotationPoint(-77.75F, -57.5F, 1.5F);
/*      */     
/* 2607 */     this.defaultScopeModel[81].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
/* 2608 */     this.defaultScopeModel[81].setRotationPoint(-77.75F, -60.5F, 1.5F);
/*      */     
/* 2610 */     this.defaultScopeModel[82].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F);
/* 2611 */     this.defaultScopeModel[82].setRotationPoint(-80.75F, -57.5F, 1.5F);
/*      */     
/* 2613 */     this.defaultScopeModel[83].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 2614 */     this.defaultScopeModel[83].setRotationPoint(-80.75F, -60.5F, 1.5F);
/*      */     
/* 2616 */     this.defaultScopeModel[84].addShapeBox(42.0F, 0.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 2617 */     this.defaultScopeModel[84].setRotationPoint(-80.75F, -63.5F, 1.5F);
/*      */     
/* 2619 */     this.defaultScopeModel[85].addShapeBox(42.0F, 0.0F, -6.0F, 4, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2620 */     this.defaultScopeModel[85].setRotationPoint(-84.75F, -60.5F, 0.5F);
/*      */     
/* 2622 */     this.defaultScopeModel[86].addShapeBox(42.0F, 0.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2623 */     this.defaultScopeModel[86].setRotationPoint(-84.75F, -64.5F, 0.5F);
/*      */     
/* 2625 */     this.defaultScopeModel[87].addShapeBox(42.0F, 0.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2626 */     this.defaultScopeModel[87].setRotationPoint(-84.75F, -57.5F, 0.5F);
/*      */     
/* 2628 */     this.defaultScopeModel[88].addShapeBox(42.0F, 0.0F, -6.0F, 35, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 3.5F, -3.0F, 0.0F, 3.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, 0.0F, 0.0F);
/* 2629 */     this.defaultScopeModel[88].setRotationPoint(-10.75F, -63.5F, 1.5F);
/*      */     
/* 2631 */     this.defaultScopeModel[89].addShapeBox(42.0F, 0.0F, -6.0F, 35, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.5F, 0.0F, 1.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.5F, 0.0F, 1.0F, 3.5F, 0.0F, 0.0F, 0.0F);
/* 2632 */     this.defaultScopeModel[89].setRotationPoint(-10.75F, -60.5F, 1.5F);
/*      */     
/* 2634 */     this.defaultScopeModel[90].addShapeBox(42.0F, 0.0F, -6.0F, 35, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 3.5F, 0.0F, -1.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 3.5F, -3.0F, 0.0F, 3.5F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2635 */     this.defaultScopeModel[90].setRotationPoint(-10.75F, -57.5F, 1.5F);
/*      */     
/* 2637 */     this.defaultScopeModel[91].addShapeBox(42.0F, 0.0F, -6.0F, 10, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2638 */     this.defaultScopeModel[91].setRotationPoint(24.25F, -61.5F, -2.0F);
/*      */     
/* 2640 */     this.defaultScopeModel[92].addShapeBox(42.0F, 0.0F, -6.0F, 10, 5, 16, 0.0F, 0.0F, 0.5F, -6.5F, 0.0F, 0.5F, -6.5F, 0.0F, 0.5F, -6.5F, 0.0F, 0.5F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2641 */     this.defaultScopeModel[92].setRotationPoint(24.25F, -66.5F, -2.0F);
/*      */     
/* 2643 */     this.defaultScopeModel[93].addShapeBox(42.0F, 0.0F, -6.0F, 10, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -6.5F, 0.0F, 0.5F, -6.5F, 0.0F, 0.5F, -6.5F, 0.0F, 0.5F, -6.5F);
/* 2644 */     this.defaultScopeModel[93].setRotationPoint(24.25F, -56.5F, -2.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2649 */     this.ammoModel[0] = new ModelRendererTurbo(this, 417, 297, this.textureX, this.textureY);
/* 2650 */     this.ammoModel[1] = new ModelRendererTurbo(this, 889, 289, this.textureX, this.textureY);
/* 2651 */     this.ammoModel[2] = new ModelRendererTurbo(this, 953, 289, this.textureX, this.textureY);
/* 2652 */     this.ammoModel[3] = new ModelRendererTurbo(this, 985, 289, this.textureX, this.textureY);
/* 2653 */     this.ammoModel[4] = new ModelRendererTurbo(this, 321, 297, this.textureX, this.textureY);
/* 2654 */     this.ammoModel[5] = new ModelRendererTurbo(this, 345, 297, this.textureX, this.textureY);
/* 2655 */     this.ammoModel[6] = new ModelRendererTurbo(this, 505, 297, this.textureX, this.textureY);
/* 2656 */     this.ammoModel[7] = new ModelRendererTurbo(this, 585, 297, this.textureX, this.textureY);
/* 2657 */     this.ammoModel[8] = new ModelRendererTurbo(this, 537, 297, this.textureX, this.textureY);
/* 2658 */     this.ammoModel[9] = new ModelRendererTurbo(this, 633, 297, this.textureX, this.textureY);
/* 2659 */     this.ammoModel[10] = new ModelRendererTurbo(this, 673, 297, this.textureX, this.textureY);
/* 2660 */     this.ammoModel[11] = new ModelRendererTurbo(this, 713, 297, this.textureX, this.textureY);
/* 2661 */     this.ammoModel[12] = new ModelRendererTurbo(this, 121, 305, this.textureX, this.textureY);
/* 2662 */     this.ammoModel[13] = new ModelRendererTurbo(this, 201, 305, this.textureX, this.textureY);
/* 2663 */     this.ammoModel[14] = new ModelRendererTurbo(this, 921, 297, this.textureX, this.textureY);
/* 2664 */     this.ammoModel[15] = new ModelRendererTurbo(this, 281, 305, this.textureX, this.textureY);
/*      */     
/* 2666 */     this.ammoModel[0].addShapeBox(42.0F, 0.0F, -6.0F, 35, 15, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F);
/* 2667 */     this.ammoModel[0].setRotationPoint(-112.25F, -25.5F, 2.5F);
/*      */     
/* 2669 */     this.ammoModel[1].addShapeBox(42.0F, 0.0F, -6.0F, 11, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2670 */     this.ammoModel[1].setRotationPoint(-113.25F, -9.25F, 2.0F);
/*      */     
/* 2672 */     this.ammoModel[2].addShapeBox(42.0F, 0.0F, -6.0F, 4, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2673 */     this.ammoModel[2].setRotationPoint(-106.25F, -7.25F, 2.0F);
/*      */     
/* 2675 */     this.ammoModel[3].addShapeBox(42.0F, 0.0F, -6.0F, 1, 6, 8, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2676 */     this.ammoModel[3].setRotationPoint(-102.25F, -2.25F, 2.0F);
/*      */     
/* 2678 */     this.ammoModel[4].addShapeBox(42.0F, 0.0F, -6.0F, 1, 6, 8, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2679 */     this.ammoModel[4].setRotationPoint(-91.25F, -2.25F, 2.0F);
/*      */     
/* 2681 */     this.ammoModel[5].addShapeBox(42.0F, 0.0F, -6.0F, 9, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2682 */     this.ammoModel[5].setRotationPoint(-100.75F, -1.75F, 2.0F);
/*      */     
/* 2684 */     this.ammoModel[6].addShapeBox(42.0F, 0.0F, -6.0F, 4, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2685 */     this.ammoModel[6].setRotationPoint(-90.25F, -7.25F, 2.0F);
/*      */     
/* 2687 */     this.ammoModel[7].addShapeBox(42.0F, 0.0F, -6.0F, 14, 2, 7, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2688 */     this.ammoModel[7].setRotationPoint(-90.25F, -9.25F, 3.0F);
/*      */     
/* 2690 */     this.ammoModel[8].addShapeBox(42.0F, 0.0F, -6.0F, 7, 11, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2691 */     this.ammoModel[8].setRotationPoint(-113.25F, -7.25F, 2.5F);
/*      */     
/* 2693 */     this.ammoModel[9].addShapeBox(42.0F, 0.0F, -6.0F, 10, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2694 */     this.ammoModel[9].setRotationPoint(-101.25F, -1.25F, 2.5F);
/*      */     
/* 2696 */     this.ammoModel[10].addShapeBox(42.0F, 0.0F, -6.0F, 10, 11, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2697 */     this.ammoModel[10].setRotationPoint(-86.25F, -7.25F, 2.5F);
/*      */     
/* 2699 */     this.ammoModel[11].addShapeBox(42.0F, 0.0F, -6.0F, 12, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2700 */     this.ammoModel[11].setRotationPoint(-102.25F, -9.25F, 2.5F);
/*      */     
/* 2702 */     this.ammoModel[12].addShapeBox(42.0F, 0.0F, -6.0F, 9, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2703 */     this.ammoModel[12].setRotationPoint(-100.75F, -8.75F, 3.0F);
/*      */     
/* 2705 */     this.ammoModel[13].addShapeBox(42.0F, 0.0F, -6.0F, 9, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2706 */     this.ammoModel[13].setRotationPoint(-100.75F, -6.75F, 3.0F);
/*      */     
/* 2708 */     this.ammoModel[14].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2709 */     this.ammoModel[14].setRotationPoint(-100.25F, -6.75F, 3.35F);
/*      */     
/* 2711 */     this.ammoModel[15].addShapeBox(42.0F, 0.0F, -6.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2712 */     this.ammoModel[15].setRotationPoint(-100.25F, -4.75F, 3.35F);
/*      */   }
/*      */   
/*      */   private void initpumpModel_1()
/*      */   {
/* 2717 */     this.pumpModel[0] = new ModelRendererTurbo(this, 753, 273, this.textureX, this.textureY);
/* 2718 */     this.pumpModel[1] = new ModelRendererTurbo(this, 921, 273, this.textureX, this.textureY);
/* 2719 */     this.pumpModel[2] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/* 2720 */     this.pumpModel[3] = new ModelRendererTurbo(this, 705, 73, this.textureX, this.textureY);
/* 2721 */     this.pumpModel[4] = new ModelRendererTurbo(this, 185, 161, this.textureX, this.textureY);
/* 2722 */     this.pumpModel[5] = new ModelRendererTurbo(this, 833, 209, this.textureX, this.textureY);
/* 2723 */     this.pumpModel[6] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 2724 */     this.pumpModel[7] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 2725 */     this.pumpModel[8] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/* 2726 */     this.pumpModel[9] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/* 2727 */     this.pumpModel[10] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 2728 */     this.pumpModel[11] = new ModelRendererTurbo(this, 553, 57, this.textureX, this.textureY);
/* 2729 */     this.pumpModel[12] = new ModelRendererTurbo(this, 633, 57, this.textureX, this.textureY);
/* 2730 */     this.pumpModel[13] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/* 2731 */     this.pumpModel[14] = new ModelRendererTurbo(this, 721, 57, this.textureX, this.textureY);
/* 2732 */     this.pumpModel[15] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/* 2733 */     this.pumpModel[16] = new ModelRendererTurbo(this, 745, 57, this.textureX, this.textureY);
/* 2734 */     this.pumpModel[17] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/* 2735 */     this.pumpModel[18] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/* 2736 */     this.pumpModel[19] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/* 2737 */     this.pumpModel[20] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/* 2738 */     this.pumpModel[21] = new ModelRendererTurbo(this, 489, 73, this.textureX, this.textureY);
/* 2739 */     this.pumpModel[22] = new ModelRendererTurbo(this, 521, 73, this.textureX, this.textureY);
/*      */     
/* 2741 */     this.pumpModel[0].addShapeBox(42.0F, 0.0F, -6.0F, 25, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2742 */     this.pumpModel[0].setRotationPoint(-123.5F, -40.0F, 0.25F);
/*      */     
/* 2744 */     this.pumpModel[1].addShapeBox(42.0F, 0.0F, -6.0F, 25, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2745 */     this.pumpModel[1].setRotationPoint(-123.5F, -37.0F, 0.25F);
/*      */     
/* 2747 */     this.pumpModel[2].addShapeBox(42.0F, 0.0F, -6.0F, 25, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2748 */     this.pumpModel[2].setRotationPoint(-123.5F, -34.0F, 0.25F);
/*      */     
/* 2750 */     this.pumpModel[3].addShapeBox(42.0F, 0.0F, -6.0F, 12, 3, 4, 0.0F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2751 */     this.pumpModel[3].setRotationPoint(-98.5F, -39.5F, 0.25F);
/*      */     
/* 2753 */     this.pumpModel[4].addShapeBox(42.0F, 0.0F, -6.0F, 12, 3, 4, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2754 */     this.pumpModel[4].setRotationPoint(-98.5F, -37.0F, 0.25F);
/*      */     
/* 2756 */     this.pumpModel[5].addShapeBox(42.0F, 0.0F, -6.0F, 12, 3, 4, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2757 */     this.pumpModel[5].setRotationPoint(-98.5F, -34.5F, 0.25F);
/*      */     
/* 2759 */     this.pumpModel[6].addShapeBox(42.0F, 0.0F, -6.0F, 6, 3, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2760 */     this.pumpModel[6].setRotationPoint(-86.5F, -40.0F, 0.25F);
/*      */     
/* 2762 */     this.pumpModel[7].addShapeBox(42.0F, 0.0F, -6.0F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2763 */     this.pumpModel[7].setRotationPoint(-86.5F, -37.0F, 0.25F);
/*      */     
/* 2765 */     this.pumpModel[8].addShapeBox(42.0F, 0.0F, -6.0F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2766 */     this.pumpModel[8].setRotationPoint(-86.5F, -34.0F, 0.25F);
/*      */     
/* 2768 */     this.pumpModel[9].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2769 */     this.pumpModel[9].setRotationPoint(-83.5F, -35.75F, -2.75F);
/*      */     
/* 2771 */     this.pumpModel[10].addShapeBox(42.0F, 0.0F, -6.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2772 */     this.pumpModel[10].setRotationPoint(-83.5F, -32.75F, -2.75F);
/*      */     
/* 2774 */     this.pumpModel[11].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2775 */     this.pumpModel[11].setRotationPoint(-83.5F, -31.75F, -2.75F);
/*      */     
/* 2777 */     this.pumpModel[12].addShapeBox(42.0F, 0.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2778 */     this.pumpModel[12].setRotationPoint(-83.5F, -35.75F, 0.25F);
/*      */     
/* 2780 */     this.pumpModel[13].addShapeBox(42.0F, 0.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2781 */     this.pumpModel[13].setRotationPoint(-83.5F, -32.75F, 0.25F);
/*      */     
/* 2783 */     this.pumpModel[14].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2784 */     this.pumpModel[14].setRotationPoint(-84.5F, -37.68F, -3.75F);
/* 2785 */     this.pumpModel[14].rotateAngleX = 0.57595867F;
/*      */     
/* 2787 */     this.pumpModel[15].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2788 */     this.pumpModel[15].setRotationPoint(-84.5F, -36.0F, -2.65F);
/* 2789 */     this.pumpModel[15].rotateAngleX = 0.57595867F;
/*      */     
/* 2791 */     this.pumpModel[16].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2792 */     this.pumpModel[16].setRotationPoint(-84.5F, -35.17F, -2.1F);
/* 2793 */     this.pumpModel[16].rotateAngleX = 0.57595867F;
/*      */     
/* 2795 */     this.pumpModel[17].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 5, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2796 */     this.pumpModel[17].setRotationPoint(-84.5F, -34.95F, -7.91F);
/* 2797 */     this.pumpModel[17].rotateAngleX = 0.57595867F;
/*      */     
/* 2799 */     this.pumpModel[18].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 5, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2800 */     this.pumpModel[18].setRotationPoint(-84.48F, -33.28F, -6.83F);
/* 2801 */     this.pumpModel[18].rotateAngleX = 0.57595867F;
/*      */     
/* 2803 */     this.pumpModel[19].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 5, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2804 */     this.pumpModel[19].setRotationPoint(-84.5F, -32.45F, -6.3F);
/* 2805 */     this.pumpModel[19].rotateAngleX = 0.57595867F;
/*      */     
/* 2807 */     this.pumpModel[20].addShapeBox(42.0F, 0.0F, -6.0F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2808 */     this.pumpModel[20].setRotationPoint(-84.5F, -30.55F, -11.03F);
/* 2809 */     this.pumpModel[20].rotateAngleX = 0.57595867F;
/*      */     
/* 2811 */     this.pumpModel[21].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 5, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2812 */     this.pumpModel[21].setRotationPoint(-84.5F, -32.25F, -12.1F);
/* 2813 */     this.pumpModel[21].rotateAngleX = 0.57595867F;
/*      */     
/* 2815 */     this.pumpModel[22].addShapeBox(42.0F, 0.0F, -6.0F, 5, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F);
/* 2816 */     this.pumpModel[22].setRotationPoint(-84.5F, -29.72F, -10.48F);
/* 2817 */     this.pumpModel[22].rotateAngleX = 0.57595867F;
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modeldsr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */