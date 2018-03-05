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
/*      */ public class Modelspas12
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelspas12()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ˆ'];
/*   22 */     this.ammoModel = new ModelRendererTurbo[1];
/*   23 */     this.pumpModel = new ModelRendererTurbo['ħ'];
/*      */     
/*   25 */     initgunModel_1();
/*   26 */     initgunModel_2();
/*   27 */     initammoModel_1();
/*   28 */     initpumpModel_1();
/*      */     
/*      */ 
/*   31 */     translateAll(0.0F, -27.0F, 0.0F);
/*   32 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*      */     
/*   34 */     this.gunSlideDistance = 0.0F;
/*   35 */     this.animationType = EnumAnimationType.SHOTGUN;
/*   36 */     this.pumpDelayAfterReload = 100;this.pumpDelay = 5;
/*   37 */     this.pumpTime = 6;
/*   38 */     this.gripIsOnPump = true;
/*   39 */     this.pumpHandleDistance = 1.5F;
/*   40 */     this.numBulletsInReloadAnimation = 8.0F;
/*   41 */     this.tiltGunTime = 0.15F;
/*   42 */     this.unloadClipTime = 0.0F;
/*   43 */     this.loadClipTime = 0.775F;
/*   44 */     this.untiltGunTime = 0.15F;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*   49 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   54 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[1] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[2] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[3] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[4] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[5] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[6] = new ModelRendererTurbo(this, 841, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[7] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[8] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[9] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[10] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[11] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[12] = new ModelRendererTurbo(this, 713, 9, this.textureX, this.textureY);
/*   67 */     this.gunModel[13] = new ModelRendererTurbo(this, 913, 9, this.textureX, this.textureY);
/*   68 */     this.gunModel[14] = new ModelRendererTurbo(this, 961, 9, this.textureX, this.textureY);
/*   69 */     this.gunModel[15] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*   70 */     this.gunModel[16] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*   71 */     this.gunModel[17] = new ModelRendererTurbo(this, 545, 33, this.textureX, this.textureY);
/*   72 */     this.gunModel[18] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*   73 */     this.gunModel[19] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*   74 */     this.gunModel[20] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[21] = new ModelRendererTurbo(this, 889, 33, this.textureX, this.textureY);
/*   76 */     this.gunModel[22] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*   77 */     this.gunModel[23] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*   78 */     this.gunModel[24] = new ModelRendererTurbo(this, 937, 25, this.textureX, this.textureY);
/*   79 */     this.gunModel[25] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*   80 */     this.gunModel[26] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*   81 */     this.gunModel[27] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*   82 */     this.gunModel[28] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*   83 */     this.gunModel[29] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*   84 */     this.gunModel[30] = new ModelRendererTurbo(this, 937, 49, this.textureX, this.textureY);
/*   85 */     this.gunModel[31] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*   86 */     this.gunModel[32] = new ModelRendererTurbo(this, 529, 57, this.textureX, this.textureY);
/*   87 */     this.gunModel[33] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[34] = new ModelRendererTurbo(this, 985, 25, this.textureX, this.textureY);
/*   89 */     this.gunModel[35] = new ModelRendererTurbo(this, 985, 49, this.textureX, this.textureY);
/*   90 */     this.gunModel[36] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*   91 */     this.gunModel[37] = new ModelRendererTurbo(this, 577, 57, this.textureX, this.textureY);
/*   92 */     this.gunModel[38] = new ModelRendererTurbo(this, 617, 57, this.textureX, this.textureY);
/*   93 */     this.gunModel[39] = new ModelRendererTurbo(this, 657, 57, this.textureX, this.textureY);
/*   94 */     this.gunModel[40] = new ModelRendererTurbo(this, 697, 57, this.textureX, this.textureY);
/*   95 */     this.gunModel[41] = new ModelRendererTurbo(this, 737, 57, this.textureX, this.textureY);
/*   96 */     this.gunModel[42] = new ModelRendererTurbo(this, 777, 57, this.textureX, this.textureY);
/*   97 */     this.gunModel[43] = new ModelRendererTurbo(this, 817, 57, this.textureX, this.textureY);
/*   98 */     this.gunModel[44] = new ModelRendererTurbo(this, 857, 57, this.textureX, this.textureY);
/*   99 */     this.gunModel[45] = new ModelRendererTurbo(this, 897, 57, this.textureX, this.textureY);
/*  100 */     this.gunModel[46] = new ModelRendererTurbo(this, 961, 57, this.textureX, this.textureY);
/*  101 */     this.gunModel[47] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  102 */     this.gunModel[48] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/*  103 */     this.gunModel[49] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/*  104 */     this.gunModel[50] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/*  105 */     this.gunModel[51] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/*  106 */     this.gunModel[52] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  107 */     this.gunModel[53] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/*  108 */     this.gunModel[54] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*  109 */     this.gunModel[55] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/*  110 */     this.gunModel[56] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/*  111 */     this.gunModel[57] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/*  112 */     this.gunModel[58] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/*  113 */     this.gunModel[59] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/*  114 */     this.gunModel[60] = new ModelRendererTurbo(this, 921, 73, this.textureX, this.textureY);
/*  115 */     this.gunModel[61] = new ModelRendererTurbo(this, 985, 73, this.textureX, this.textureY);
/*  116 */     this.gunModel[62] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/*  117 */     this.gunModel[63] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/*  118 */     this.gunModel[64] = new ModelRendererTurbo(this, 529, 81, this.textureX, this.textureY);
/*  119 */     this.gunModel[65] = new ModelRendererTurbo(this, 569, 81, this.textureX, this.textureY);
/*  120 */     this.gunModel[66] = new ModelRendererTurbo(this, 617, 81, this.textureX, this.textureY);
/*  121 */     this.gunModel[67] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  122 */     this.gunModel[68] = new ModelRendererTurbo(this, 649, 97, this.textureX, this.textureY);
/*  123 */     this.gunModel[69] = new ModelRendererTurbo(this, 617, 113, this.textureX, this.textureY);
/*  124 */     this.gunModel[70] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  125 */     this.gunModel[71] = new ModelRendererTurbo(this, 641, 81, this.textureX, this.textureY);
/*  126 */     this.gunModel[72] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/*  127 */     this.gunModel[73] = new ModelRendererTurbo(this, 321, 121, this.textureX, this.textureY);
/*  128 */     this.gunModel[74] = new ModelRendererTurbo(this, 593, 81, this.textureX, this.textureY);
/*  129 */     this.gunModel[75] = new ModelRendererTurbo(this, 953, 81, this.textureX, this.textureY);
/*  130 */     this.gunModel[76] = new ModelRendererTurbo(this, 985, 97, this.textureX, this.textureY);
/*  131 */     this.gunModel[77] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*  132 */     this.gunModel[78] = new ModelRendererTurbo(this, 553, 25, this.textureX, this.textureY);
/*  133 */     this.gunModel[79] = new ModelRendererTurbo(this, 601, 25, this.textureX, this.textureY);
/*  134 */     this.gunModel[80] = new ModelRendererTurbo(this, 649, 25, this.textureX, this.textureY);
/*  135 */     this.gunModel[81] = new ModelRendererTurbo(this, 753, 25, this.textureX, this.textureY);
/*  136 */     this.gunModel[82] = new ModelRendererTurbo(this, 801, 25, this.textureX, this.textureY);
/*  137 */     this.gunModel[83] = new ModelRendererTurbo(this, 849, 25, this.textureX, this.textureY);
/*  138 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  139 */     this.gunModel[85] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  140 */     this.gunModel[86] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  141 */     this.gunModel[87] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*  142 */     this.gunModel[88] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  143 */     this.gunModel[89] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[90] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[91] = new ModelRendererTurbo(this, 809, 81, this.textureX, this.textureY);
/*  146 */     this.gunModel[92] = new ModelRendererTurbo(this, 857, 81, this.textureX, this.textureY);
/*  147 */     this.gunModel[93] = new ModelRendererTurbo(this, 513, 113, this.textureX, this.textureY);
/*  148 */     this.gunModel[94] = new ModelRendererTurbo(this, 561, 129, this.textureX, this.textureY);
/*  149 */     this.gunModel[95] = new ModelRendererTurbo(this, 945, 105, this.textureX, this.textureY);
/*  150 */     this.gunModel[96] = new ModelRendererTurbo(this, 913, 113, this.textureX, this.textureY);
/*  151 */     this.gunModel[97] = new ModelRendererTurbo(this, 297, 121, this.textureX, this.textureY);
/*  152 */     this.gunModel[98] = new ModelRendererTurbo(this, 481, 121, this.textureX, this.textureY);
/*  153 */     this.gunModel[99] = new ModelRendererTurbo(this, 969, 121, this.textureX, this.textureY);
/*  154 */     this.gunModel[100] = new ModelRendererTurbo(this, 889, 129, this.textureX, this.textureY);
/*  155 */     this.gunModel[101] = new ModelRendererTurbo(this, 937, 129, this.textureX, this.textureY);
/*  156 */     this.gunModel[102] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/*  157 */     this.gunModel[103] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/*  158 */     this.gunModel[104] = new ModelRendererTurbo(this, 81, 137, this.textureX, this.textureY);
/*  159 */     this.gunModel[105] = new ModelRendererTurbo(this, 121, 137, this.textureX, this.textureY);
/*  160 */     this.gunModel[106] = new ModelRendererTurbo(this, 169, 137, this.textureX, this.textureY);
/*  161 */     this.gunModel[107] = new ModelRendererTurbo(this, 209, 137, this.textureX, this.textureY);
/*  162 */     this.gunModel[108] = new ModelRendererTurbo(this, 249, 137, this.textureX, this.textureY);
/*  163 */     this.gunModel[109] = new ModelRendererTurbo(this, 321, 137, this.textureX, this.textureY);
/*  164 */     this.gunModel[110] = new ModelRendererTurbo(this, 361, 137, this.textureX, this.textureY);
/*  165 */     this.gunModel[111] = new ModelRendererTurbo(this, 409, 137, this.textureX, this.textureY);
/*  166 */     this.gunModel[112] = new ModelRendererTurbo(this, 449, 137, this.textureX, this.textureY);
/*  167 */     this.gunModel[113] = new ModelRendererTurbo(this, 505, 137, this.textureX, this.textureY);
/*  168 */     this.gunModel[114] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/*  169 */     this.gunModel[115] = new ModelRendererTurbo(this, 145, 145, this.textureX, this.textureY);
/*  170 */     this.gunModel[116] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/*  171 */     this.gunModel[117] = new ModelRendererTurbo(this, 385, 145, this.textureX, this.textureY);
/*  172 */     this.gunModel[118] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/*  173 */     this.gunModel[119] = new ModelRendererTurbo(this, 529, 145, this.textureX, this.textureY);
/*  174 */     this.gunModel[120] = new ModelRendererTurbo(this, 961, 145, this.textureX, this.textureY);
/*  175 */     this.gunModel[121] = new ModelRendererTurbo(this, 297, 153, this.textureX, this.textureY);
/*  176 */     this.gunModel[122] = new ModelRendererTurbo(this, 553, 153, this.textureX, this.textureY);
/*  177 */     this.gunModel[123] = new ModelRendererTurbo(this, 593, 153, this.textureX, this.textureY);
/*  178 */     this.gunModel[124] = new ModelRendererTurbo(this, 633, 153, this.textureX, this.textureY);
/*  179 */     this.gunModel[125] = new ModelRendererTurbo(this, 673, 153, this.textureX, this.textureY);
/*  180 */     this.gunModel[126] = new ModelRendererTurbo(this, 721, 153, this.textureX, this.textureY);
/*  181 */     this.gunModel[127] = new ModelRendererTurbo(this, 761, 153, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 801, 153, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 153, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 881, 153, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 937, 153, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 153, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 161, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 161, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 161, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 177, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 537, 177, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 545, 185, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 545, 193, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 905, 161, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 961, 169, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 177, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 177, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 929, 177, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 985, 177, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 185, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 897, 185, this.textureX, this.textureY);
/*  211 */     this.gunModel[''] = new ModelRendererTurbo(this, 953, 193, this.textureX, this.textureY);
/*  212 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 201, this.textureX, this.textureY);
/*  213 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 201, this.textureX, this.textureY);
/*  214 */     this.gunModel[' '] = new ModelRendererTurbo(this, 377, 201, this.textureX, this.textureY);
/*  215 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 417, 201, this.textureX, this.textureY);
/*  216 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 457, 201, this.textureX, this.textureY);
/*  217 */     this.gunModel['£'] = new ModelRendererTurbo(this, 505, 201, this.textureX, this.textureY);
/*  218 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 545, 201, this.textureX, this.textureY);
/*  219 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 585, 201, this.textureX, this.textureY);
/*  220 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 625, 201, this.textureX, this.textureY);
/*  221 */     this.gunModel['§'] = new ModelRendererTurbo(this, 665, 201, this.textureX, this.textureY);
/*  222 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 713, 201, this.textureX, this.textureY);
/*  223 */     this.gunModel['©'] = new ModelRendererTurbo(this, 753, 201, this.textureX, this.textureY);
/*  224 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 793, 201, this.textureX, this.textureY);
/*  225 */     this.gunModel['«'] = new ModelRendererTurbo(this, 865, 201, this.textureX, this.textureY);
/*  226 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 921, 201, this.textureX, this.textureY);
/*  227 */     this.gunModel['­'] = new ModelRendererTurbo(this, 977, 201, this.textureX, this.textureY);
/*  228 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/*  229 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 41, 209, this.textureX, this.textureY);
/*  230 */     this.gunModel['°'] = new ModelRendererTurbo(this, 81, 209, this.textureX, this.textureY);
/*  231 */     this.gunModel['±'] = new ModelRendererTurbo(this, 121, 209, this.textureX, this.textureY);
/*  232 */     this.gunModel['²'] = new ModelRendererTurbo(this, 169, 209, this.textureX, this.textureY);
/*  233 */     this.gunModel['³'] = new ModelRendererTurbo(this, 209, 209, this.textureX, this.textureY);
/*  234 */     this.gunModel['´'] = new ModelRendererTurbo(this, 249, 209, this.textureX, this.textureY);
/*  235 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 481, 209, this.textureX, this.textureY);
/*  236 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 689, 209, this.textureX, this.textureY);
/*  237 */     this.gunModel['·'] = new ModelRendererTurbo(this, 817, 209, this.textureX, this.textureY);
/*  238 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 889, 209, this.textureX, this.textureY);
/*  239 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 145, 217, this.textureX, this.textureY);
/*  240 */     this.gunModel['º'] = new ModelRendererTurbo(this, 273, 217, this.textureX, this.textureY);
/*  241 */     this.gunModel['»'] = new ModelRendererTurbo(this, 841, 217, this.textureX, this.textureY);
/*  242 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 297, 225, this.textureX, this.textureY);
/*  243 */     this.gunModel['½'] = new ModelRendererTurbo(this, 345, 233, this.textureX, this.textureY);
/*  244 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 945, 217, this.textureX, this.textureY);
/*  245 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 713, 225, this.textureX, this.textureY);
/*  246 */     this.gunModel['À'] = new ModelRendererTurbo(this, 761, 225, this.textureX, this.textureY);
/*  247 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 873, 9, this.textureX, this.textureY);
/*  248 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 201, 161, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 873, 33, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 865, 225, this.textureX, this.textureY);
/*  251 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*  252 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 337, 161, this.textureX, this.textureY);
/*  254 */     this.gunModel['È'] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*  255 */     this.gunModel['É'] = new ModelRendererTurbo(this, 561, 57, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 601, 57, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 641, 57, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 681, 57, this.textureX, this.textureY);
/*  259 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 913, 225, this.textureX, this.textureY);
/*  260 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 721, 57, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 761, 57, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 417, 161, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 801, 57, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 969, 225, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 841, 57, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/*  267 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/*  269 */     this.gunModel['×'] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/*  270 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/*  271 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/*  272 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*  273 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/*  274 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/*  275 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/*  276 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 57, 185, this.textureX, this.textureY);
/*  277 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/*  278 */     this.gunModel['à'] = new ModelRendererTurbo(this, 41, 233, this.textureX, this.textureY);
/*  279 */     this.gunModel['á'] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/*  280 */     this.gunModel['â'] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/*  281 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 65, 233, this.textureX, this.textureY);
/*  282 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 553, 81, this.textureX, this.textureY);
/*  283 */     this.gunModel['å'] = new ModelRendererTurbo(this, 889, 81, this.textureX, this.textureY);
/*  284 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 329, 97, this.textureX, this.textureY);
/*  285 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 993, 121, this.textureX, this.textureY);
/*  286 */     this.gunModel['è'] = new ModelRendererTurbo(this, 873, 129, this.textureX, this.textureY);
/*  287 */     this.gunModel['é'] = new ModelRendererTurbo(this, 105, 233, this.textureX, this.textureY);
/*  288 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 25, 137, this.textureX, this.textureY);
/*  289 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 841, 81, this.textureX, this.textureY);
/*  290 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 177, 233, this.textureX, this.textureY);
/*  291 */     this.gunModel['í'] = new ModelRendererTurbo(this, 969, 105, this.textureX, this.textureY);
/*  292 */     this.gunModel['î'] = new ModelRendererTurbo(this, 217, 233, this.textureX, this.textureY);
/*  293 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/*  294 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 105, 137, this.textureX, this.textureY);
/*  295 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 809, 241, this.textureX, this.textureY);
/*  296 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 193, 137, this.textureX, this.textureY);
/*  297 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/*  298 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 345, 137, this.textureX, this.textureY);
/*  299 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 433, 137, this.textureX, this.textureY);
/*  300 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 577, 153, this.textureX, this.textureY);
/*  301 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 889, 233, this.textureX, this.textureY);
/*  302 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 617, 153, this.textureX, this.textureY);
/*  303 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/*  304 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 217, 257, this.textureX, this.textureY);
/*  305 */     this.gunModel['û'] = new ModelRendererTurbo(this, 433, 257, this.textureX, this.textureY);
/*  306 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/*  307 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 521, 105, this.textureX, this.textureY);
/*  308 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 529, 137, this.textureX, this.textureY);
/*  309 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 137, 169, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 473, 169, this.textureX, this.textureY);
/*  311 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 345, 225, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 393, 225, this.textureX, this.textureY);
/*  313 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 521, 225, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 569, 225, this.textureX, this.textureY);
/*  315 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 697, 153, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 241, 233, this.textureX, this.textureY);
/*  317 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 681, 233, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 657, 153, this.textureX, this.textureY);
/*  319 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 745, 153, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 785, 153, this.textureX, this.textureY);
/*  321 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  322 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 961, 1, this.textureX, this.textureY);
/*  323 */     this.gunModel['č'] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  324 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/*  325 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  326 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  327 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 825, 153, this.textureX, this.textureY);
/*  329 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 865, 153, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 25, 161, this.textureX, this.textureY);
/*  331 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 761, 9, this.textureX, this.textureY);
/*  333 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 721, 9, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  335 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 737, 9, this.textureX, this.textureY);
/*  337 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 521, 9, this.textureX, this.textureY);
/*  339 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 889, 9, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 873, 9, this.textureX, this.textureY);
/*  341 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 913, 9, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  343 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 937, 9, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 961, 9, this.textureX, this.textureY);
/*  345 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 985, 9, this.textureX, this.textureY);
/*  346 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/*  347 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  348 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 721, 249, this.textureX, this.textureY);
/*  349 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 1009, 137, this.textureX, this.textureY);
/*  350 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1009, 225, this.textureX, this.textureY);
/*  351 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 953, 241, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 777, 249, this.textureX, this.textureY);
/*  353 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 969, 249, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 217, 273, this.textureX, this.textureY);
/*  355 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  356 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 793, 257, this.textureX, this.textureY);
/*  357 */     this.gunModel['į'] = new ModelRendererTurbo(this, 633, 257, this.textureX, this.textureY);
/*  358 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*  359 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 817, 89, this.textureX, this.textureY);
/*  360 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 857, 89, this.textureX, this.textureY);
/*  361 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 145, 137, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/*  363 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 921, 57, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/*  365 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 761, 9, this.textureX, this.textureY);
/*  366 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 785, 9, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 849, 9, this.textureX, this.textureY);
/*  368 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 513, 17, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 889, 33, this.textureX, this.textureY);
/*  370 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*  372 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 697, 25, this.textureX, this.textureY);
/*  373 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 705, 25, this.textureX, this.textureY);
/*  374 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 897, 25, this.textureX, this.textureY);
/*  375 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 897, 25, this.textureX, this.textureY);
/*  376 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 529, 49, this.textureX, this.textureY);
/*  377 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 1009, 25, this.textureX, this.textureY);
/*  378 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 1017, 25, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*  380 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 553, 33, this.textureX, this.textureY);
/*  382 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 873, 33, this.textureX, this.textureY);
/*  383 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 985, 33, this.textureX, this.textureY);
/*  385 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 385, 137, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 297, 145, this.textureX, this.textureY);
/*  387 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 257, 169, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 177, 193, this.textureX, this.textureY);
/*  389 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*  391 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 985, 33, this.textureX, this.textureY);
/*  392 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 1009, 33, this.textureX, this.textureY);
/*  393 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 1017, 33, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 873, 41, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 889, 41, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/*  397 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 897, 41, this.textureX, this.textureY);
/*  399 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  400 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
/*  401 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 481, 201, this.textureX, this.textureY);
/*  403 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 689, 201, this.textureX, this.textureY);
/*  404 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 145, 209, this.textureX, this.textureY);
/*  405 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 273, 209, this.textureX, this.textureY);
/*  406 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  407 */     this.gunModel['š'] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*  409 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/*  411 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  413 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/*  415 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 529, 49, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 1009, 49, this.textureX, this.textureY);
/*  417 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 1017, 49, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 617, 105, this.textureX, this.textureY);
/*  419 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 937, 113, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 505, 121, this.textureX, this.textureY);
/*  421 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 841, 209, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 441, 225, this.textureX, this.textureY);
/*  423 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 617, 225, this.textureX, this.textureY);
/*  424 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 801, 233, this.textureX, this.textureY);
/*  425 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 9, 57, this.textureX, this.textureY);
/*  427 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/*  429 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*  431 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  432 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*  433 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  434 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  436 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  437 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 961, 129, this.textureX, this.textureY);
/*  438 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 273, 137, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 497, 145, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 129, 241, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 145, 249, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 281, 249, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 897, 257, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/*  450 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 513, 57, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 529, 57, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 537, 57, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 561, 57, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 569, 57, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 585, 57, this.textureX, this.textureY);
/*  456 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 713, 265, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 985, 145, this.textureX, this.textureY);
/*  458 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 777, 57, this.textureX, this.textureY);
/*  459 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 409, 257, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 737, 265, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 433, 273, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 481, 273, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 521, 273, this.textureX, this.textureY);
/*  464 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 561, 273, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 601, 273, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 769, 273, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 809, 273, this.textureX, this.textureY);
/*  468 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 849, 273, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 905, 273, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 945, 273, this.textureX, this.textureY);
/*  471 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 985, 273, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 41, 281, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 81, 281, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 121, 281, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 201, 281, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 273, 281, this.textureX, this.textureY);
/*  478 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 353, 281, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 625, 281, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 681, 289, this.textureX, this.textureY);
/*  481 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 721, 289, this.textureX, this.textureY);
/*  482 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 417, 297, this.textureX, this.textureY);
/*  483 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 457, 297, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 497, 297, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 537, 297, this.textureX, this.textureY);
/*  486 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 329, 289, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 577, 297, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 745, 297, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 793, 297, this.textureX, this.textureY);
/*  490 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 833, 297, this.textureX, this.textureY);
/*  491 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 969, 297, this.textureX, this.textureY);
/*  492 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 1, 305, this.textureX, this.textureY);
/*  493 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 65, 305, this.textureX, this.textureY);
/*  494 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 105, 305, this.textureX, this.textureY);
/*  495 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 145, 305, this.textureX, this.textureY);
/*  496 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 185, 305, this.textureX, this.textureY);
/*  497 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 225, 305, this.textureX, this.textureY);
/*  498 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 265, 305, this.textureX, this.textureY);
/*  499 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 361, 305, this.textureX, this.textureY);
/*  500 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 609, 305, this.textureX, this.textureY);
/*  501 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 889, 305, this.textureX, this.textureY);
/*  502 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 305, 305, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 329, 313, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 649, 313, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 721, 313, this.textureX, this.textureY);
/*  506 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 937, 313, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 417, 321, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 457, 321, this.textureX, this.textureY);
/*  509 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 497, 321, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 561, 321, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 745, 321, this.textureX, this.textureY);
/*  512 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 833, 321, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 961, 321, this.textureX, this.textureY);
/*  514 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 1, 329, this.textureX, this.textureY);
/*  515 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 41, 329, this.textureX, this.textureY);
/*  516 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 81, 329, this.textureX, this.textureY);
/*  517 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 145, 329, this.textureX, this.textureY);
/*  518 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 217, 329, this.textureX, this.textureY);
/*  519 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 289, 329, this.textureX, this.textureY);
/*  520 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 353, 329, this.textureX, this.textureY);
/*  521 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 393, 329, this.textureX, this.textureY);
/*  522 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 585, 329, this.textureX, this.textureY);
/*  523 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 625, 329, this.textureX, this.textureY);
/*  524 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 769, 329, this.textureX, this.textureY);
/*  525 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 857, 329, this.textureX, this.textureY);
/*  526 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 649, 337, this.textureX, this.textureY);
/*  527 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 985, 329, this.textureX, this.textureY);
/*  528 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 313, 337, this.textureX, this.textureY);
/*  529 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 713, 337, this.textureX, this.textureY);
/*  530 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 913, 337, this.textureX, this.textureY);
/*  531 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 417, 345, this.textureX, this.textureY);
/*  532 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 457, 345, this.textureX, this.textureY);
/*  533 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 497, 345, this.textureX, this.textureY);
/*  534 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 561, 345, this.textureX, this.textureY);
/*  535 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 737, 345, this.textureX, this.textureY);
/*  536 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 793, 345, this.textureX, this.textureY);
/*  537 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 937, 345, this.textureX, this.textureY);
/*  538 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 1, 353, this.textureX, this.textureY);
/*  539 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 49, 353, this.textureX, this.textureY);
/*  540 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 97, 353, this.textureX, this.textureY);
/*  541 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 153, 353, this.textureX, this.textureY);
/*  542 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 201, 353, this.textureX, this.textureY);
/*  543 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 65, 161, this.textureX, this.textureY);
/*  544 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 241, 353, this.textureX, this.textureY);
/*  545 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 337, 353, this.textureX, this.textureY);
/*  546 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 585, 353, this.textureX, this.textureY);
/*  547 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 825, 353, this.textureX, this.textureY);
/*  548 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 273, 361, this.textureX, this.textureY);
/*  549 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 633, 361, this.textureX, this.textureY);
/*  550 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 385, 353, this.textureX, this.textureY);
/*  551 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 881, 353, this.textureX, this.textureY);
/*  552 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 417, 369, this.textureX, this.textureY);
/*  553 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 761, 353, this.textureX, this.textureY);
/*      */     
/*  555 */     this.gunModel[0].addShapeBox(86.0F, -60.0F, -8.0F, 88, 19, 12, 0.0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  556 */     this.gunModel[0].setRotationPoint(-93.0F, 13.0F, 4.0F);
/*      */     
/*  558 */     this.gunModel[1].addShapeBox(86.0F, -60.0F, -8.0F, 50, 4, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  559 */     this.gunModel[1].setRotationPoint(-93.0F, 9.0F, 0.0F);
/*      */     
/*  561 */     this.gunModel[2].addShapeBox(86.0F, -60.0F, -8.0F, 88, 3, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  562 */     this.gunModel[2].setRotationPoint(-93.0F, 6.0F, 2.0F);
/*      */     
/*  564 */     this.gunModel[3].addShapeBox(86.0F, -60.0F, -8.0F, 88, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  565 */     this.gunModel[3].setRotationPoint(-93.0F, 32.0F, 0.0F);
/*      */     
/*  567 */     this.gunModel[4].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  568 */     this.gunModel[4].setRotationPoint(-101.0F, 39.0F, 0.0F);
/*      */     
/*  570 */     this.gunModel[5].addShapeBox(86.0F, -60.0F, -8.0F, 13, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  571 */     this.gunModel[5].setRotationPoint(-112.0F, 42.0F, 0.0F);
/*      */     
/*  573 */     this.gunModel[6].addShapeBox(86.0F, -60.0F, -8.0F, 5, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  574 */     this.gunModel[6].setRotationPoint(-101.0F, 46.0F, 0.0F);
/*      */     
/*  576 */     this.gunModel[7].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  577 */     this.gunModel[7].setRotationPoint(-21.5F, 29.0F, 16.0F);
/*      */     
/*  579 */     this.gunModel[8].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  580 */     this.gunModel[8].setRotationPoint(-21.5F, 25.0F, 16.0F);
/*      */     
/*  582 */     this.gunModel[9].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  583 */     this.gunModel[9].setRotationPoint(-21.5F, 27.0F, 16.0F);
/*      */     
/*  585 */     this.gunModel[10].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  586 */     this.gunModel[10].setRotationPoint(-66.5F, 27.0F, -0.5F);
/*      */     
/*  588 */     this.gunModel[11].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  589 */     this.gunModel[11].setRotationPoint(-66.5F, 26.0F, -0.5F);
/*      */     
/*  591 */     this.gunModel[12].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  592 */     this.gunModel[12].setRotationPoint(-66.5F, 28.0F, -0.5F);
/*      */     
/*  594 */     this.gunModel[13].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[13].setRotationPoint(-88.5F, 27.0F, -0.5F);
/*      */     
/*  597 */     this.gunModel[14].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  598 */     this.gunModel[14].setRotationPoint(-88.5F, 26.0F, -0.5F);
/*      */     
/*  600 */     this.gunModel[15].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  601 */     this.gunModel[15].setRotationPoint(-88.5F, 28.0F, -0.5F);
/*      */     
/*  603 */     this.gunModel[16].addShapeBox(86.0F, -60.0F, -8.0F, 156, 7, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  604 */     this.gunModel[16].setRotationPoint(-3.0F, 14.0F, 0.0F);
/*      */     
/*  606 */     this.gunModel[17].addShapeBox(86.0F, -60.0F, -8.0F, 151, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  607 */     this.gunModel[17].setRotationPoint(-3.0F, 12.0F, -1.0F);
/*      */     
/*  609 */     this.gunModel[18].addShapeBox(86.0F, -60.0F, -8.0F, 92, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  610 */     this.gunModel[18].setRotationPoint(56.0F, 6.0F, 15.0F);
/*      */     
/*  612 */     this.gunModel[19].addShapeBox(86.0F, -60.0F, -8.0F, 92, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  613 */     this.gunModel[19].setRotationPoint(56.0F, 8.0F, -1.0F);
/*      */     
/*  615 */     this.gunModel[20].addShapeBox(86.0F, -60.0F, -8.0F, 12, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  616 */     this.gunModel[20].setRotationPoint(44.0F, 3.0F, 15.0F);
/*      */     
/*  618 */     this.gunModel[21].addShapeBox(86.0F, -60.0F, -8.0F, 12, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[21].setRotationPoint(44.0F, 5.0F, -1.0F);
/*      */     
/*  621 */     this.gunModel[22].addShapeBox(86.0F, -60.0F, -8.0F, 47, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  622 */     this.gunModel[22].setRotationPoint(-3.0F, 3.0F, -1.0F);
/*      */     
/*  624 */     this.gunModel[23].addShapeBox(86.0F, -60.0F, -8.0F, 47, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[23].setRotationPoint(-3.0F, 5.0F, -1.0F);
/*      */     
/*  627 */     this.gunModel[24].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  628 */     this.gunModel[24].setRotationPoint(34.5F, 9.0F, -1.0F);
/*      */     
/*  630 */     this.gunModel[25].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[25].setRotationPoint(16.5F, 9.0F, -1.0F);
/*      */     
/*  633 */     this.gunModel[26].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  634 */     this.gunModel[26].setRotationPoint(-3.5F, 9.0F, -1.0F);
/*      */     
/*  636 */     this.gunModel[27].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  637 */     this.gunModel[27].setRotationPoint(52.5F, 9.0F, -1.0F);
/*      */     
/*  639 */     this.gunModel[28].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  640 */     this.gunModel[28].setRotationPoint(70.5F, 9.0F, -1.0F);
/*      */     
/*  642 */     this.gunModel[29].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  643 */     this.gunModel[29].setRotationPoint(88.5F, 9.0F, -1.0F);
/*      */     
/*  645 */     this.gunModel[30].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  646 */     this.gunModel[30].setRotationPoint(106.5F, 9.0F, -1.0F);
/*      */     
/*  648 */     this.gunModel[31].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  649 */     this.gunModel[31].setRotationPoint(124.5F, 9.0F, -1.0F);
/*      */     
/*  651 */     this.gunModel[32].addShapeBox(86.0F, -60.0F, -8.0F, 5, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  652 */     this.gunModel[32].setRotationPoint(142.5F, 9.0F, -1.0F);
/*      */     
/*  654 */     this.gunModel[33].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  655 */     this.gunModel[33].setRotationPoint(0.5F, 9.0F, -1.0F);
/*      */     
/*  657 */     this.gunModel[34].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  658 */     this.gunModel[34].setRotationPoint(0.5F, 11.0F, -1.0F);
/*      */     
/*  660 */     this.gunModel[35].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  661 */     this.gunModel[35].setRotationPoint(15.5F, 9.0F, -1.0F);
/*      */     
/*  663 */     this.gunModel[36].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  664 */     this.gunModel[36].setRotationPoint(15.5F, 11.0F, -1.0F);
/*      */     
/*  666 */     this.gunModel[37].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  667 */     this.gunModel[37].setRotationPoint(18.5F, 9.0F, -1.0F);
/*      */     
/*  669 */     this.gunModel[38].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  670 */     this.gunModel[38].setRotationPoint(18.5F, 11.0F, -1.0F);
/*      */     
/*  672 */     this.gunModel[39].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  673 */     this.gunModel[39].setRotationPoint(33.5F, 9.0F, -1.0F);
/*      */     
/*  675 */     this.gunModel[40].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  676 */     this.gunModel[40].setRotationPoint(33.5F, 11.0F, -1.0F);
/*      */     
/*  678 */     this.gunModel[41].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  679 */     this.gunModel[41].setRotationPoint(36.5F, 9.0F, -1.0F);
/*      */     
/*  681 */     this.gunModel[42].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  682 */     this.gunModel[42].setRotationPoint(36.5F, 11.0F, -1.0F);
/*      */     
/*  684 */     this.gunModel[43].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[43].setRotationPoint(51.5F, 9.0F, -1.0F);
/*      */     
/*  687 */     this.gunModel[44].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  688 */     this.gunModel[44].setRotationPoint(51.5F, 11.0F, -1.0F);
/*      */     
/*  690 */     this.gunModel[45].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  691 */     this.gunModel[45].setRotationPoint(54.5F, 9.0F, -1.0F);
/*      */     
/*  693 */     this.gunModel[46].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  694 */     this.gunModel[46].setRotationPoint(54.5F, 11.0F, -1.0F);
/*      */     
/*  696 */     this.gunModel[47].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  697 */     this.gunModel[47].setRotationPoint(69.5F, 9.0F, -1.0F);
/*      */     
/*  699 */     this.gunModel[48].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  700 */     this.gunModel[48].setRotationPoint(69.5F, 11.0F, -1.0F);
/*      */     
/*  702 */     this.gunModel[49].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  703 */     this.gunModel[49].setRotationPoint(72.5F, 9.0F, -1.0F);
/*      */     
/*  705 */     this.gunModel[50].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  706 */     this.gunModel[50].setRotationPoint(72.5F, 11.0F, -1.0F);
/*      */     
/*  708 */     this.gunModel[51].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  709 */     this.gunModel[51].setRotationPoint(87.5F, 9.0F, -1.0F);
/*      */     
/*  711 */     this.gunModel[52].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  712 */     this.gunModel[52].setRotationPoint(87.5F, 11.0F, -1.0F);
/*      */     
/*  714 */     this.gunModel[53].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  715 */     this.gunModel[53].setRotationPoint(90.5F, 9.0F, -1.0F);
/*      */     
/*  717 */     this.gunModel[54].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  718 */     this.gunModel[54].setRotationPoint(90.5F, 11.0F, -1.0F);
/*      */     
/*  720 */     this.gunModel[55].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  721 */     this.gunModel[55].setRotationPoint(105.5F, 9.0F, -1.0F);
/*      */     
/*  723 */     this.gunModel[56].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  724 */     this.gunModel[56].setRotationPoint(105.5F, 11.0F, -1.0F);
/*      */     
/*  726 */     this.gunModel[57].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  727 */     this.gunModel[57].setRotationPoint(108.5F, 9.0F, -1.0F);
/*      */     
/*  729 */     this.gunModel[58].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  730 */     this.gunModel[58].setRotationPoint(108.5F, 11.0F, -1.0F);
/*      */     
/*  732 */     this.gunModel[59].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  733 */     this.gunModel[59].setRotationPoint(123.5F, 9.0F, -1.0F);
/*      */     
/*  735 */     this.gunModel[60].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  736 */     this.gunModel[60].setRotationPoint(123.5F, 11.0F, -1.0F);
/*      */     
/*  738 */     this.gunModel[61].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  739 */     this.gunModel[61].setRotationPoint(126.5F, 9.0F, -1.0F);
/*      */     
/*  741 */     this.gunModel[62].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  742 */     this.gunModel[62].setRotationPoint(126.5F, 11.0F, -1.0F);
/*      */     
/*  744 */     this.gunModel[63].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  745 */     this.gunModel[63].setRotationPoint(141.5F, 9.0F, -1.0F);
/*      */     
/*  747 */     this.gunModel[64].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  748 */     this.gunModel[64].setRotationPoint(141.5F, 11.0F, -1.0F);
/*      */     
/*  750 */     this.gunModel[65].addShapeBox(86.0F, -60.0F, -8.0F, 2, 26, 18, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  751 */     this.gunModel[65].setRotationPoint(-5.0F, 5.0F, -1.0F);
/*      */     
/*  753 */     this.gunModel[66].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  754 */     this.gunModel[66].setRotationPoint(-5.0F, 3.0F, -1.0F);
/*      */     
/*  756 */     this.gunModel[67].addShapeBox(86.0F, -60.0F, -8.0F, 154, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  757 */     this.gunModel[67].setRotationPoint(-3.0F, 21.0F, -1.0F);
/*      */     
/*  759 */     this.gunModel[68].addShapeBox(86.0F, -60.0F, -8.0F, 147, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  760 */     this.gunModel[68].setRotationPoint(0.0F, 10.0F, 3.5F);
/*      */     
/*  762 */     this.gunModel[69].addShapeBox(86.0F, -60.0F, -8.0F, 147, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  763 */     this.gunModel[69].setRotationPoint(0.0F, 13.0F, 3.5F);
/*      */     
/*  765 */     this.gunModel[70].addShapeBox(86.0F, -60.0F, -8.0F, 147, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  766 */     this.gunModel[70].setRotationPoint(0.0F, 16.0F, 3.5F);
/*      */     
/*  768 */     this.gunModel[71].addShapeBox(86.0F, -60.0F, -8.0F, 77, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  769 */     this.gunModel[71].setRotationPoint(147.0F, 10.0F, 3.5F);
/*      */     
/*  771 */     this.gunModel[72].addShapeBox(86.0F, -60.0F, -8.0F, 77, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  772 */     this.gunModel[72].setRotationPoint(147.0F, 13.0F, 3.5F);
/*      */     
/*  774 */     this.gunModel[73].addShapeBox(86.0F, -60.0F, -8.0F, 77, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  775 */     this.gunModel[73].setRotationPoint(147.0F, 16.0F, 3.5F);
/*      */     
/*  777 */     this.gunModel[74].addShapeBox(86.0F, -60.0F, -8.0F, 7, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  778 */     this.gunModel[74].setRotationPoint(232.0F, 12.5F, 2.0F);
/*      */     
/*  780 */     this.gunModel[75].addShapeBox(86.0F, -60.0F, -8.0F, 7, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  781 */     this.gunModel[75].setRotationPoint(232.0F, 8.5F, 2.0F);
/*      */     
/*  783 */     this.gunModel[76].addShapeBox(86.0F, -60.0F, -8.0F, 7, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/*  784 */     this.gunModel[76].setRotationPoint(232.0F, 16.5F, 2.0F);
/*      */     
/*  786 */     this.gunModel[77].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  787 */     this.gunModel[77].setRotationPoint(224.0F, 13.0F, 3.0F);
/*      */     
/*  789 */     this.gunModel[78].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  790 */     this.gunModel[78].setRotationPoint(224.0F, 9.5F, 3.0F);
/*      */     
/*  792 */     this.gunModel[79].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  793 */     this.gunModel[79].setRotationPoint(224.0F, 13.0F, 6.5F);
/*      */     
/*  795 */     this.gunModel[80].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  796 */     this.gunModel[80].setRotationPoint(224.0F, 13.0F, 10.0F);
/*      */     
/*  798 */     this.gunModel[81].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  799 */     this.gunModel[81].setRotationPoint(224.0F, 9.5F, 10.0F);
/*      */     
/*  801 */     this.gunModel[82].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  802 */     this.gunModel[82].setRotationPoint(224.0F, 9.5F, 6.5F);
/*      */     
/*  804 */     this.gunModel[83].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  805 */     this.gunModel[83].setRotationPoint(224.0F, 16.5F, 3.0F);
/*      */     
/*  807 */     this.gunModel[84].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F);
/*  808 */     this.gunModel[84].setRotationPoint(224.0F, 16.5F, 10.0F);
/*      */     
/*  810 */     this.gunModel[85].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  811 */     this.gunModel[85].setRotationPoint(224.0F, 16.5F, 6.5F);
/*      */     
/*  813 */     this.gunModel[86].addShapeBox(86.0F, -60.0F, -8.0F, 20, 2, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  814 */     this.gunModel[86].setRotationPoint(201.0F, 9.5F, 7.0F);
/*      */     
/*  816 */     this.gunModel[87].addShapeBox(86.0F, -60.0F, -8.0F, 8, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  817 */     this.gunModel[87].setRotationPoint(213.0F, 6.5F, 7.0F);
/*      */     
/*  819 */     this.gunModel[88].addShapeBox(86.0F, -60.0F, -8.0F, 8, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  820 */     this.gunModel[88].setRotationPoint(213.0F, -0.5F, 7.0F);
/*      */     
/*  822 */     this.gunModel[89].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  823 */     this.gunModel[89].setRotationPoint(213.0F, -2.5F, 7.0F);
/*      */     
/*  825 */     this.gunModel[90].addShapeBox(86.0F, -60.0F, -8.0F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  826 */     this.gunModel[90].setRotationPoint(213.0F, 8.5F, 7.0F);
/*      */     
/*  828 */     this.gunModel[91].addShapeBox(86.0F, -60.0F, -8.0F, 20, 2, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  829 */     this.gunModel[91].setRotationPoint(201.0F, 9.5F, 9.5F);
/*      */     
/*  831 */     this.gunModel[92].addShapeBox(86.0F, -60.0F, -8.0F, 20, 2, 1, 0.0F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  832 */     this.gunModel[92].setRotationPoint(201.0F, 9.5F, 5.5F);
/*      */     
/*  834 */     this.gunModel[93].addShapeBox(86.0F, -60.0F, -8.0F, 12, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  835 */     this.gunModel[93].setRotationPoint(-3.0F, 23.0F, -1.0F);
/*      */     
/*  837 */     this.gunModel[94].addShapeBox(86.0F, -60.0F, -8.0F, 144, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  838 */     this.gunModel[94].setRotationPoint(9.0F, 26.0F, -1.0F);
/*      */     
/*  840 */     this.gunModel[95].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  841 */     this.gunModel[95].setRotationPoint(25.0F, 23.0F, -1.0F);
/*      */     
/*  843 */     this.gunModel[96].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  844 */     this.gunModel[96].setRotationPoint(9.0F, 23.0F, -1.0F);
/*      */     
/*  846 */     this.gunModel[97].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  847 */     this.gunModel[97].setRotationPoint(24.0F, 23.0F, -1.0F);
/*      */     
/*  849 */     this.gunModel[98].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  850 */     this.gunModel[98].setRotationPoint(24.0F, 25.0F, -1.0F);
/*      */     
/*  852 */     this.gunModel[99].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  853 */     this.gunModel[99].setRotationPoint(9.0F, 25.0F, -1.0F);
/*      */     
/*  855 */     this.gunModel[100].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  856 */     this.gunModel[100].setRotationPoint(43.0F, 23.0F, -1.0F);
/*      */     
/*  858 */     this.gunModel[101].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  859 */     this.gunModel[101].setRotationPoint(27.0F, 23.0F, -1.0F);
/*      */     
/*  861 */     this.gunModel[102].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  862 */     this.gunModel[102].setRotationPoint(42.0F, 23.0F, -1.0F);
/*      */     
/*  864 */     this.gunModel[103].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  865 */     this.gunModel[103].setRotationPoint(42.0F, 25.0F, -1.0F);
/*      */     
/*  867 */     this.gunModel[104].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  868 */     this.gunModel[104].setRotationPoint(27.0F, 25.0F, -1.0F);
/*      */     
/*  870 */     this.gunModel[105].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  871 */     this.gunModel[105].setRotationPoint(61.0F, 23.0F, -1.0F);
/*      */     
/*  873 */     this.gunModel[106].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  874 */     this.gunModel[106].setRotationPoint(45.0F, 23.0F, -1.0F);
/*      */     
/*  876 */     this.gunModel[107].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  877 */     this.gunModel[107].setRotationPoint(60.0F, 23.0F, -1.0F);
/*      */     
/*  879 */     this.gunModel[108].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  880 */     this.gunModel[108].setRotationPoint(60.0F, 25.0F, -1.0F);
/*      */     
/*  882 */     this.gunModel[109].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  883 */     this.gunModel[109].setRotationPoint(45.0F, 25.0F, -1.0F);
/*      */     
/*  885 */     this.gunModel[110].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel[110].setRotationPoint(79.0F, 23.0F, -1.0F);
/*      */     
/*  888 */     this.gunModel[111].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  889 */     this.gunModel[111].setRotationPoint(63.0F, 23.0F, -1.0F);
/*      */     
/*  891 */     this.gunModel[112].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  892 */     this.gunModel[112].setRotationPoint(78.0F, 23.0F, -1.0F);
/*      */     
/*  894 */     this.gunModel[113].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  895 */     this.gunModel[113].setRotationPoint(78.0F, 25.0F, -1.0F);
/*      */     
/*  897 */     this.gunModel[114].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  898 */     this.gunModel[114].setRotationPoint(63.0F, 25.0F, -1.0F);
/*      */     
/*  900 */     this.gunModel[115].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  901 */     this.gunModel[115].setRotationPoint(97.0F, 23.0F, -1.0F);
/*      */     
/*  903 */     this.gunModel[116].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  904 */     this.gunModel[116].setRotationPoint(81.0F, 23.0F, -1.0F);
/*      */     
/*  906 */     this.gunModel[117].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  907 */     this.gunModel[117].setRotationPoint(96.0F, 23.0F, -1.0F);
/*      */     
/*  909 */     this.gunModel[118].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  910 */     this.gunModel[118].setRotationPoint(96.0F, 25.0F, -1.0F);
/*      */     
/*  912 */     this.gunModel[119].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  913 */     this.gunModel[119].setRotationPoint(81.0F, 25.0F, -1.0F);
/*      */     
/*  915 */     this.gunModel[120].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  916 */     this.gunModel[120].setRotationPoint(115.0F, 23.0F, -1.0F);
/*      */     
/*  918 */     this.gunModel[121].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  919 */     this.gunModel[121].setRotationPoint(99.0F, 23.0F, -1.0F);
/*      */     
/*  921 */     this.gunModel[122].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  922 */     this.gunModel[122].setRotationPoint(114.0F, 23.0F, -1.0F);
/*      */     
/*  924 */     this.gunModel[123].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  925 */     this.gunModel[123].setRotationPoint(114.0F, 25.0F, -1.0F);
/*      */     
/*  927 */     this.gunModel[124].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  928 */     this.gunModel[124].setRotationPoint(99.0F, 25.0F, -1.0F);
/*      */     
/*  930 */     this.gunModel[125].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  931 */     this.gunModel[125].setRotationPoint(133.0F, 23.0F, -1.0F);
/*      */     
/*  933 */     this.gunModel[126].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  934 */     this.gunModel[126].setRotationPoint(117.0F, 23.0F, -1.0F);
/*      */     
/*  936 */     this.gunModel[127].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  937 */     this.gunModel[127].setRotationPoint(132.0F, 23.0F, -1.0F);
/*      */     
/*  939 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  940 */     this.gunModel[''].setRotationPoint(132.0F, 25.0F, -1.0F);
/*      */     
/*  942 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  943 */     this.gunModel[''].setRotationPoint(117.0F, 25.0F, -1.0F);
/*      */     
/*  945 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  946 */     this.gunModel[''].setRotationPoint(151.0F, 21.0F, -1.0F);
/*      */     
/*  948 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  949 */     this.gunModel[''].setRotationPoint(135.0F, 23.0F, -1.0F);
/*      */     
/*  951 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  952 */     this.gunModel[''].setRotationPoint(150.0F, 23.0F, -1.0F);
/*      */     
/*  954 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  955 */     this.gunModel[''].setRotationPoint(150.0F, 25.0F, -1.0F);
/*      */     
/*  957 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  958 */     this.gunModel[''].setRotationPoint(135.0F, 25.0F, -1.0F);
/*      */     
/*  960 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 5, 5, 18, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  961 */     this.gunModel[''].setRotationPoint(148.0F, 9.0F, -1.0F);
/*      */     
/*  963 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 5, 8, 18, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F);
/*  964 */     this.gunModel[''].setRotationPoint(148.0F, 6.0F, -1.0F);
/*      */     
/*  966 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 151, 9, 10, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  967 */     this.gunModel[''].setRotationPoint(0.0F, 22.0F, 3.0F);
/*      */     
/*  969 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  970 */     this.gunModel[''].setRotationPoint(-3.0F, 14.0F, -1.0F);
/*      */     
/*  972 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  973 */     this.gunModel[''].setRotationPoint(-3.0F, 20.0F, -1.0F);
/*      */     
/*  975 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 155, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  976 */     this.gunModel[''].setRotationPoint(-2.0F, 20.0F, -1.0F);
/*      */     
/*  978 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  979 */     this.gunModel[''].setRotationPoint(-3.0F, 15.0F, -1.0F);
/*      */     
/*  981 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 155, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  982 */     this.gunModel[''].setRotationPoint(-2.0F, 20.0F, 16.0F);
/*      */     
/*  984 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  985 */     this.gunModel[''].setRotationPoint(-3.0F, 20.0F, 16.0F);
/*      */     
/*  987 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  988 */     this.gunModel[''].setRotationPoint(-3.0F, 15.0F, 16.0F);
/*      */     
/*  990 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  991 */     this.gunModel[''].setRotationPoint(-3.0F, 14.0F, 16.0F);
/*      */     
/*  993 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 155, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  994 */     this.gunModel[''].setRotationPoint(-2.0F, 14.0F, 16.0F);
/*      */     
/*  996 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 155, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  997 */     this.gunModel[''].setRotationPoint(-2.0F, 14.0F, -1.0F);
/*      */     
/*  999 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1000 */     this.gunModel[''].setRotationPoint(0.0F, 28.0F, -1.0F);
/*      */     
/* 1002 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1003 */     this.gunModel[''].setRotationPoint(15.0F, 28.0F, -1.0F);
/*      */     
/* 1005 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1006 */     this.gunModel[''].setRotationPoint(15.0F, 30.0F, -1.0F);
/*      */     
/* 1008 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1009 */     this.gunModel[''].setRotationPoint(0.0F, 30.0F, -1.0F);
/*      */     
/* 1011 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1012 */     this.gunModel[''].setRotationPoint(-3.0F, 28.0F, -1.0F);
/*      */     
/* 1014 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1015 */     this.gunModel[''].setRotationPoint(18.0F, 28.0F, -1.0F);
/*      */     
/* 1017 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1018 */     this.gunModel[''].setRotationPoint(33.0F, 28.0F, -1.0F);
/*      */     
/* 1020 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1021 */     this.gunModel[''].setRotationPoint(33.0F, 30.0F, -1.0F);
/*      */     
/* 1023 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1024 */     this.gunModel[''].setRotationPoint(18.0F, 30.0F, -1.0F);
/*      */     
/* 1026 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel[''].setRotationPoint(16.0F, 28.0F, -1.0F);
/*      */     
/* 1029 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1030 */     this.gunModel[''].setRotationPoint(36.0F, 28.0F, -1.0F);
/*      */     
/* 1032 */     this.gunModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel[''].setRotationPoint(51.0F, 28.0F, -1.0F);
/*      */     
/* 1035 */     this.gunModel[' '].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1036 */     this.gunModel[' '].setRotationPoint(51.0F, 30.0F, -1.0F);
/*      */     
/* 1038 */     this.gunModel['¡'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['¡'].setRotationPoint(36.0F, 30.0F, -1.0F);
/*      */     
/* 1041 */     this.gunModel['¢'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1042 */     this.gunModel['¢'].setRotationPoint(34.0F, 28.0F, -1.0F);
/*      */     
/* 1044 */     this.gunModel['£'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1045 */     this.gunModel['£'].setRotationPoint(54.0F, 28.0F, -1.0F);
/*      */     
/* 1047 */     this.gunModel['¤'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1048 */     this.gunModel['¤'].setRotationPoint(69.0F, 28.0F, -1.0F);
/*      */     
/* 1050 */     this.gunModel['¥'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1051 */     this.gunModel['¥'].setRotationPoint(69.0F, 30.0F, -1.0F);
/*      */     
/* 1053 */     this.gunModel['¦'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1054 */     this.gunModel['¦'].setRotationPoint(54.0F, 30.0F, -1.0F);
/*      */     
/* 1056 */     this.gunModel['§'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1057 */     this.gunModel['§'].setRotationPoint(52.0F, 28.0F, -1.0F);
/*      */     
/* 1059 */     this.gunModel['¨'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1060 */     this.gunModel['¨'].setRotationPoint(72.0F, 28.0F, -1.0F);
/*      */     
/* 1062 */     this.gunModel['©'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1063 */     this.gunModel['©'].setRotationPoint(87.0F, 28.0F, -1.0F);
/*      */     
/* 1065 */     this.gunModel['ª'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1066 */     this.gunModel['ª'].setRotationPoint(87.0F, 30.0F, -1.0F);
/*      */     
/* 1068 */     this.gunModel['«'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1069 */     this.gunModel['«'].setRotationPoint(72.0F, 30.0F, -1.0F);
/*      */     
/* 1071 */     this.gunModel['¬'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1072 */     this.gunModel['¬'].setRotationPoint(70.0F, 28.0F, -1.0F);
/*      */     
/* 1074 */     this.gunModel['­'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1075 */     this.gunModel['­'].setRotationPoint(90.0F, 28.0F, -1.0F);
/*      */     
/* 1077 */     this.gunModel['®'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1078 */     this.gunModel['®'].setRotationPoint(105.0F, 28.0F, -1.0F);
/*      */     
/* 1080 */     this.gunModel['¯'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1081 */     this.gunModel['¯'].setRotationPoint(105.0F, 30.0F, -1.0F);
/*      */     
/* 1083 */     this.gunModel['°'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1084 */     this.gunModel['°'].setRotationPoint(90.0F, 30.0F, -1.0F);
/*      */     
/* 1086 */     this.gunModel['±'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1087 */     this.gunModel['±'].setRotationPoint(88.0F, 28.0F, -1.0F);
/*      */     
/* 1089 */     this.gunModel['²'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1090 */     this.gunModel['²'].setRotationPoint(108.0F, 28.0F, -1.0F);
/*      */     
/* 1092 */     this.gunModel['³'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1093 */     this.gunModel['³'].setRotationPoint(123.0F, 28.0F, -1.0F);
/*      */     
/* 1095 */     this.gunModel['´'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1096 */     this.gunModel['´'].setRotationPoint(123.0F, 30.0F, -1.0F);
/*      */     
/* 1098 */     this.gunModel['µ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1099 */     this.gunModel['µ'].setRotationPoint(108.0F, 30.0F, -1.0F);
/*      */     
/* 1101 */     this.gunModel['¶'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1102 */     this.gunModel['¶'].setRotationPoint(106.0F, 28.0F, -1.0F);
/*      */     
/* 1104 */     this.gunModel['·'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1105 */     this.gunModel['·'].setRotationPoint(126.0F, 28.0F, -1.0F);
/*      */     
/* 1107 */     this.gunModel['¸'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1108 */     this.gunModel['¸'].setRotationPoint(141.0F, 28.0F, -1.0F);
/*      */     
/* 1110 */     this.gunModel['¹'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1111 */     this.gunModel['¹'].setRotationPoint(141.0F, 30.0F, -1.0F);
/*      */     
/* 1113 */     this.gunModel['º'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1114 */     this.gunModel['º'].setRotationPoint(126.0F, 30.0F, -1.0F);
/*      */     
/* 1116 */     this.gunModel['»'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1117 */     this.gunModel['»'].setRotationPoint(124.0F, 28.0F, -1.0F);
/*      */     
/* 1119 */     this.gunModel['¼'].addShapeBox(86.0F, -60.0F, -8.0F, 11, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1120 */     this.gunModel['¼'].setRotationPoint(142.0F, 28.0F, -1.0F);
/*      */     
/* 1122 */     this.gunModel['½'].addShapeBox(86.0F, -60.0F, -8.0F, 156, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1123 */     this.gunModel['½'].setRotationPoint(-3.0F, 31.0F, -1.0F);
/*      */     
/* 1125 */     this.gunModel['¾'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 18, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.5F);
/* 1126 */     this.gunModel['¾'].setRotationPoint(-5.0F, 31.0F, -1.0F);
/*      */     
/* 1128 */     this.gunModel['¿'].addShapeBox(86.0F, -60.0F, -8.0F, 12, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1129 */     this.gunModel['¿'].setRotationPoint(-3.0F, 32.5F, -0.5F);
/*      */     
/* 1131 */     this.gunModel['À'].addShapeBox(86.0F, -60.0F, -8.0F, 12, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1132 */     this.gunModel['À'].setRotationPoint(-3.0F, 34.5F, 1.0F);
/*      */     
/* 1134 */     this.gunModel['Á'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1135 */     this.gunModel['Á'].setRotationPoint(9.0F, 34.5F, 2.0F);
/*      */     
/* 1137 */     this.gunModel['Â'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1138 */     this.gunModel['Â'].setRotationPoint(9.0F, 35.5F, 3.0F);
/*      */     
/* 1140 */     this.gunModel['Ã'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1141 */     this.gunModel['Ã'].setRotationPoint(24.0F, 34.5F, 2.0F);
/*      */     
/* 1143 */     this.gunModel['Ä'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1144 */     this.gunModel['Ä'].setRotationPoint(25.0F, 32.5F, -0.5F);
/*      */     
/* 1146 */     this.gunModel['Å'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1147 */     this.gunModel['Å'].setRotationPoint(25.0F, 34.5F, 1.0F);
/*      */     
/* 1149 */     this.gunModel['Æ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1150 */     this.gunModel['Æ'].setRotationPoint(27.0F, 34.5F, 2.0F);
/*      */     
/* 1152 */     this.gunModel['Ç'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1153 */     this.gunModel['Ç'].setRotationPoint(27.0F, 35.5F, 3.0F);
/*      */     
/* 1155 */     this.gunModel['È'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1156 */     this.gunModel['È'].setRotationPoint(42.0F, 34.5F, 2.0F);
/*      */     
/* 1158 */     this.gunModel['É'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1159 */     this.gunModel['É'].setRotationPoint(9.0F, 32.5F, 1.0F);
/*      */     
/* 1161 */     this.gunModel['Ê'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1162 */     this.gunModel['Ê'].setRotationPoint(24.0F, 32.5F, 1.0F);
/*      */     
/* 1164 */     this.gunModel['Ë'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1165 */     this.gunModel['Ë'].setRotationPoint(27.0F, 32.5F, 1.0F);
/*      */     
/* 1167 */     this.gunModel['Ì'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1168 */     this.gunModel['Ì'].setRotationPoint(42.0F, 32.5F, 1.0F);
/*      */     
/* 1170 */     this.gunModel['Í'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1171 */     this.gunModel['Í'].setRotationPoint(43.0F, 32.5F, -0.5F);
/*      */     
/* 1173 */     this.gunModel['Î'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1174 */     this.gunModel['Î'].setRotationPoint(43.0F, 34.5F, 1.0F);
/*      */     
/* 1176 */     this.gunModel['Ï'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1177 */     this.gunModel['Ï'].setRotationPoint(45.0F, 34.5F, 2.0F);
/*      */     
/* 1179 */     this.gunModel['Ð'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1180 */     this.gunModel['Ð'].setRotationPoint(45.0F, 35.5F, 3.0F);
/*      */     
/* 1182 */     this.gunModel['Ñ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1183 */     this.gunModel['Ñ'].setRotationPoint(60.0F, 34.5F, 2.0F);
/*      */     
/* 1185 */     this.gunModel['Ò'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1186 */     this.gunModel['Ò'].setRotationPoint(61.0F, 32.5F, -0.5F);
/*      */     
/* 1188 */     this.gunModel['Ó'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1189 */     this.gunModel['Ó'].setRotationPoint(61.0F, 34.5F, 1.0F);
/*      */     
/* 1191 */     this.gunModel['Ô'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1192 */     this.gunModel['Ô'].setRotationPoint(63.0F, 34.5F, 2.0F);
/*      */     
/* 1194 */     this.gunModel['Õ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1195 */     this.gunModel['Õ'].setRotationPoint(63.0F, 35.5F, 3.0F);
/*      */     
/* 1197 */     this.gunModel['Ö'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1198 */     this.gunModel['Ö'].setRotationPoint(78.0F, 34.5F, 2.0F);
/*      */     
/* 1200 */     this.gunModel['×'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1201 */     this.gunModel['×'].setRotationPoint(45.0F, 32.5F, 1.0F);
/*      */     
/* 1203 */     this.gunModel['Ø'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1204 */     this.gunModel['Ø'].setRotationPoint(60.0F, 32.5F, 1.0F);
/*      */     
/* 1206 */     this.gunModel['Ù'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1207 */     this.gunModel['Ù'].setRotationPoint(63.0F, 32.5F, 1.0F);
/*      */     
/* 1209 */     this.gunModel['Ú'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1210 */     this.gunModel['Ú'].setRotationPoint(78.0F, 32.5F, 1.0F);
/*      */     
/* 1212 */     this.gunModel['Û'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1213 */     this.gunModel['Û'].setRotationPoint(79.0F, 32.5F, -0.5F);
/*      */     
/* 1215 */     this.gunModel['Ü'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1216 */     this.gunModel['Ü'].setRotationPoint(79.0F, 34.5F, 1.0F);
/*      */     
/* 1218 */     this.gunModel['Ý'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1219 */     this.gunModel['Ý'].setRotationPoint(81.0F, 34.5F, 2.0F);
/*      */     
/* 1221 */     this.gunModel['Þ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1222 */     this.gunModel['Þ'].setRotationPoint(81.0F, 35.5F, 3.0F);
/*      */     
/* 1224 */     this.gunModel['ß'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1225 */     this.gunModel['ß'].setRotationPoint(96.0F, 34.5F, 2.0F);
/*      */     
/* 1227 */     this.gunModel['à'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1228 */     this.gunModel['à'].setRotationPoint(97.0F, 32.5F, -0.5F);
/*      */     
/* 1230 */     this.gunModel['á'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1231 */     this.gunModel['á'].setRotationPoint(97.0F, 34.5F, 1.0F);
/*      */     
/* 1233 */     this.gunModel['â'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1234 */     this.gunModel['â'].setRotationPoint(99.0F, 34.5F, 2.0F);
/*      */     
/* 1236 */     this.gunModel['ã'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1237 */     this.gunModel['ã'].setRotationPoint(99.0F, 35.5F, 3.0F);
/*      */     
/* 1239 */     this.gunModel['ä'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1240 */     this.gunModel['ä'].setRotationPoint(114.0F, 34.5F, 2.0F);
/*      */     
/* 1242 */     this.gunModel['å'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1243 */     this.gunModel['å'].setRotationPoint(81.0F, 32.5F, 1.0F);
/*      */     
/* 1245 */     this.gunModel['æ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1246 */     this.gunModel['æ'].setRotationPoint(96.0F, 32.5F, 1.0F);
/*      */     
/* 1248 */     this.gunModel['ç'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1249 */     this.gunModel['ç'].setRotationPoint(99.0F, 32.5F, 1.0F);
/*      */     
/* 1251 */     this.gunModel['è'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1252 */     this.gunModel['è'].setRotationPoint(114.0F, 32.5F, 1.0F);
/*      */     
/* 1254 */     this.gunModel['é'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1255 */     this.gunModel['é'].setRotationPoint(115.0F, 32.5F, -0.5F);
/*      */     
/* 1257 */     this.gunModel['ê'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1258 */     this.gunModel['ê'].setRotationPoint(115.0F, 34.5F, 1.0F);
/*      */     
/* 1260 */     this.gunModel['ë'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1261 */     this.gunModel['ë'].setRotationPoint(117.0F, 34.5F, 2.0F);
/*      */     
/* 1263 */     this.gunModel['ì'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1264 */     this.gunModel['ì'].setRotationPoint(117.0F, 35.5F, 3.0F);
/*      */     
/* 1266 */     this.gunModel['í'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1267 */     this.gunModel['í'].setRotationPoint(132.0F, 34.5F, 2.0F);
/*      */     
/* 1269 */     this.gunModel['î'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1270 */     this.gunModel['î'].setRotationPoint(133.0F, 32.5F, -0.5F);
/*      */     
/* 1272 */     this.gunModel['ï'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1273 */     this.gunModel['ï'].setRotationPoint(133.0F, 34.5F, 1.0F);
/*      */     
/* 1275 */     this.gunModel['ð'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1276 */     this.gunModel['ð'].setRotationPoint(135.0F, 34.5F, 2.0F);
/*      */     
/* 1278 */     this.gunModel['ñ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 1, 10, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1279 */     this.gunModel['ñ'].setRotationPoint(135.0F, 35.5F, 3.0F);
/*      */     
/* 1281 */     this.gunModel['ò'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1282 */     this.gunModel['ò'].setRotationPoint(150.0F, 34.5F, 2.0F);
/*      */     
/* 1284 */     this.gunModel['ó'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1285 */     this.gunModel['ó'].setRotationPoint(117.0F, 32.5F, 1.0F);
/*      */     
/* 1287 */     this.gunModel['ô'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1288 */     this.gunModel['ô'].setRotationPoint(132.0F, 32.5F, 1.0F);
/*      */     
/* 1290 */     this.gunModel['õ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1291 */     this.gunModel['õ'].setRotationPoint(135.0F, 32.5F, 1.0F);
/*      */     
/* 1293 */     this.gunModel['ö'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F);
/* 1294 */     this.gunModel['ö'].setRotationPoint(150.0F, 32.5F, 1.0F);
/*      */     
/* 1296 */     this.gunModel['÷'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1297 */     this.gunModel['÷'].setRotationPoint(151.0F, 32.5F, -0.5F);
/*      */     
/* 1299 */     this.gunModel['ø'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 1300 */     this.gunModel['ø'].setRotationPoint(151.0F, 34.5F, 1.0F);
/*      */     
/* 1302 */     this.gunModel['ù'].addShapeBox(86.0F, -60.0F, -8.0F, 95, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.gunModel['ù'].setRotationPoint(147.0F, 24.0F, 3.5F);
/*      */     
/* 1305 */     this.gunModel['ú'].addShapeBox(86.0F, -60.0F, -8.0F, 95, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1306 */     this.gunModel['ú'].setRotationPoint(147.0F, 27.0F, 3.5F);
/*      */     
/* 1308 */     this.gunModel['û'].addShapeBox(86.0F, -60.0F, -8.0F, 95, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1309 */     this.gunModel['û'].setRotationPoint(147.0F, 30.0F, 3.5F);
/*      */     
/* 1311 */     this.gunModel['ü'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1312 */     this.gunModel['ü'].setRotationPoint(153.0F, 27.0F, 10.0F);
/*      */     
/* 1314 */     this.gunModel['ý'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1315 */     this.gunModel['ý'].setRotationPoint(153.0F, 23.5F, 10.0F);
/*      */     
/* 1317 */     this.gunModel['þ'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F);
/* 1318 */     this.gunModel['þ'].setRotationPoint(153.0F, 30.5F, 10.0F);
/*      */     
/* 1320 */     this.gunModel['ÿ'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1321 */     this.gunModel['ÿ'].setRotationPoint(153.0F, 27.0F, 3.0F);
/*      */     
/* 1323 */     this.gunModel['Ā'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1324 */     this.gunModel['Ā'].setRotationPoint(153.0F, 23.5F, 3.0F);
/*      */     
/* 1326 */     this.gunModel['ā'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1327 */     this.gunModel['ā'].setRotationPoint(153.0F, 27.0F, 6.5F);
/*      */     
/* 1329 */     this.gunModel['Ă'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1330 */     this.gunModel['Ă'].setRotationPoint(153.0F, 23.5F, 6.5F);
/*      */     
/* 1332 */     this.gunModel['ă'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1333 */     this.gunModel['ă'].setRotationPoint(153.0F, 30.5F, 3.0F);
/*      */     
/* 1335 */     this.gunModel['Ą'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 3, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1336 */     this.gunModel['Ą'].setRotationPoint(153.0F, 30.5F, 6.5F);
/*      */     
/* 1338 */     this.gunModel['ą'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1339 */     this.gunModel['ą'].setRotationPoint(164.0F, 26.5F, 2.0F);
/*      */     
/* 1341 */     this.gunModel['Ć'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1342 */     this.gunModel['Ć'].setRotationPoint(164.0F, 22.5F, 2.0F);
/*      */     
/* 1344 */     this.gunModel['ć'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1345 */     this.gunModel['ć'].setRotationPoint(164.0F, 30.5F, 2.0F);
/*      */     
/* 1347 */     this.gunModel['Ĉ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1348 */     this.gunModel['Ĉ'].setRotationPoint(172.0F, 26.5F, 2.0F);
/*      */     
/* 1350 */     this.gunModel['ĉ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1351 */     this.gunModel['ĉ'].setRotationPoint(172.0F, 22.5F, 2.0F);
/*      */     
/* 1353 */     this.gunModel['Ċ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1354 */     this.gunModel['Ċ'].setRotationPoint(172.0F, 30.5F, 2.0F);
/*      */     
/* 1356 */     this.gunModel['ċ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1357 */     this.gunModel['ċ'].setRotationPoint(172.0F, 33.5F, 5.0F);
/*      */     
/* 1359 */     this.gunModel['Č'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1360 */     this.gunModel['Č'].setRotationPoint(172.0F, 33.5F, 10.0F);
/*      */     
/* 1362 */     this.gunModel['č'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1363 */     this.gunModel['č'].setRotationPoint(172.0F, 35.5F, 10.0F);
/*      */     
/* 1365 */     this.gunModel['Ď'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1366 */     this.gunModel['Ď'].setRotationPoint(172.0F, 35.5F, 5.0F);
/*      */     
/* 1368 */     this.gunModel['ď'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1369 */     this.gunModel['ď'].setRotationPoint(172.0F, 34.5F, 9.0F);
/*      */     
/* 1371 */     this.gunModel['Đ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1372 */     this.gunModel['Đ'].setRotationPoint(172.0F, 34.5F, 6.0F);
/*      */     
/* 1374 */     this.gunModel['đ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1375 */     this.gunModel['đ'].setRotationPoint(172.0F, 37.0F, 6.0F);
/*      */     
/* 1377 */     this.gunModel['Ē'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1378 */     this.gunModel['Ē'].setRotationPoint(153.0F, 26.5F, 2.0F);
/*      */     
/* 1380 */     this.gunModel['ē'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.gunModel['ē'].setRotationPoint(153.0F, 22.5F, 2.0F);
/*      */     
/* 1383 */     this.gunModel['Ĕ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F);
/* 1384 */     this.gunModel['Ĕ'].setRotationPoint(153.0F, 30.5F, 2.0F);
/*      */     
/* 1386 */     this.gunModel['ĕ'].addShapeBox(86.0F, -60.0F, -8.0F, 10, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1387 */     this.gunModel['ĕ'].setRotationPoint(10.0F, 2.0F, 5.0F);
/*      */     
/* 1389 */     this.gunModel['Ė'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1390 */     this.gunModel['Ė'].setRotationPoint(10.0F, 0.5F, 5.0F);
/*      */     
/* 1392 */     this.gunModel['ė'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1393 */     this.gunModel['ė'].setRotationPoint(10.0F, -3.5F, 5.0F);
/*      */     
/* 1395 */     this.gunModel['Ę'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1396 */     this.gunModel['Ę'].setRotationPoint(13.0F, -1.5F, 5.0F);
/*      */     
/* 1398 */     this.gunModel['ę'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1399 */     this.gunModel['ę'].setRotationPoint(10.0F, -5.5F, 5.0F);
/*      */     
/* 1401 */     this.gunModel['Ě'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1402 */     this.gunModel['Ě'].setRotationPoint(10.0F, -3.5F, 10.0F);
/*      */     
/* 1404 */     this.gunModel['ě'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1405 */     this.gunModel['ě'].setRotationPoint(13.0F, -1.5F, 10.0F);
/*      */     
/* 1407 */     this.gunModel['Ĝ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.gunModel['Ĝ'].setRotationPoint(10.0F, -5.5F, 10.0F);
/*      */     
/* 1410 */     this.gunModel['ĝ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1411 */     this.gunModel['ĝ'].setRotationPoint(11.0F, -5.5F, 6.0F);
/*      */     
/* 1413 */     this.gunModel['Ğ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1414 */     this.gunModel['Ğ'].setRotationPoint(10.0F, -4.5F, 6.0F);
/*      */     
/* 1416 */     this.gunModel['ğ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1417 */     this.gunModel['ğ'].setRotationPoint(10.0F, -4.5F, 9.0F);
/*      */     
/* 1419 */     this.gunModel['Ġ'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1420 */     this.gunModel['Ġ'].setRotationPoint(10.0F, -0.5F, 6.0F);
/*      */     
/* 1422 */     this.gunModel['ġ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 4, 0.0F, -1.25F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -1.25F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1423 */     this.gunModel['ġ'].setRotationPoint(11.0F, -6.5F, 6.0F);
/*      */     
/* 1425 */     this.gunModel['Ģ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1426 */     this.gunModel['Ģ'].setRotationPoint(10.0F, -2.25F, 6.0F);
/*      */     
/* 1428 */     this.gunModel['ģ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1429 */     this.gunModel['ģ'].setRotationPoint(10.0F, -2.25F, 9.0F);
/*      */     
/* 1431 */     this.gunModel['Ĥ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 2, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1432 */     this.gunModel['Ĥ'].setRotationPoint(10.0F, -1.0F, 8.0F);
/*      */     
/* 1434 */     this.gunModel['ĥ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 1435 */     this.gunModel['ĥ'].setRotationPoint(10.0F, -1.0F, 6.0F);
/*      */     
/* 1437 */     this.gunModel['Ħ'].addShapeBox(86.0F, -60.0F, -8.0F, 24, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1438 */     this.gunModel['Ħ'].setRotationPoint(127.0F, 14.0F, 16.0F);
/*      */     
/* 1440 */     this.gunModel['ħ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1441 */     this.gunModel['ħ'].setRotationPoint(121.5F, 14.0F, 17.0F);
/*      */     
/* 1443 */     this.gunModel['Ĩ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1444 */     this.gunModel['Ĩ'].setRotationPoint(116.0F, 14.0F, 17.0F);
/*      */     
/* 1446 */     this.gunModel['ĩ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1447 */     this.gunModel['ĩ'].setRotationPoint(110.5F, 14.0F, 17.0F);
/*      */     
/* 1449 */     this.gunModel['Ī'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1450 */     this.gunModel['Ī'].setRotationPoint(105.0F, 14.0F, 17.0F);
/*      */     
/* 1452 */     this.gunModel['ī'].addShapeBox(86.0F, -60.0F, -8.0F, 24, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1453 */     this.gunModel['ī'].setRotationPoint(127.0F, 14.0F, -2.0F);
/*      */     
/* 1455 */     this.gunModel['Ĭ'].addShapeBox(86.0F, -60.0F, -8.0F, 92, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1456 */     this.gunModel['Ĭ'].setRotationPoint(56.0F, 6.0F, -1.0F);
/*      */     
/* 1458 */     this.gunModel['ĭ'].addShapeBox(86.0F, -60.0F, -8.0F, 12, 5, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1459 */     this.gunModel['ĭ'].setRotationPoint(44.0F, 3.0F, -1.0F);
/*      */     
/* 1461 */     this.gunModel['Į'].addShapeBox(86.0F, -60.0F, -8.0F, 47, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1462 */     this.gunModel['Į'].setRotationPoint(-3.0F, 3.0F, 15.0F);
/*      */     
/* 1464 */     this.gunModel['į'].addShapeBox(86.0F, -60.0F, -8.0F, 31, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1465 */     this.gunModel['į'].setRotationPoint(-3.0F, 3.0F, 1.0F);
/*      */     
/* 1467 */     this.gunModel['İ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1468 */     this.gunModel['İ'].setRotationPoint(28.0F, 3.0F, 5.5F);
/*      */     
/* 1470 */     this.gunModel['ı'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1471 */     this.gunModel['ı'].setRotationPoint(28.0F, 3.0F, 1.0F);
/*      */     
/* 1473 */     this.gunModel['Ĳ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1474 */     this.gunModel['Ĳ'].setRotationPoint(28.0F, 3.0F, 14.0F);
/*      */     
/* 1476 */     this.gunModel['ĳ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1477 */     this.gunModel['ĳ'].setRotationPoint(28.0F, 3.0F, 10.0F);
/*      */     
/* 1479 */     this.gunModel['Ĵ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1480 */     this.gunModel['Ĵ'].setRotationPoint(28.0F, 3.0F, 11.0F);
/*      */     
/* 1482 */     this.gunModel['ĵ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1483 */     this.gunModel['ĵ'].setRotationPoint(28.0F, 3.0F, 2.0F);
/*      */     
/* 1485 */     this.gunModel['Ķ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1486 */     this.gunModel['Ķ'].setRotationPoint(44.0F, 3.0F, 5.0F);
/*      */     
/* 1488 */     this.gunModel['ķ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1489 */     this.gunModel['ķ'].setRotationPoint(43.0F, 3.0F, 6.5F);
/*      */     
/* 1491 */     this.gunModel['ĸ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1492 */     this.gunModel['ĸ'].setRotationPoint(28.0F, 3.0F, 8.5F);
/*      */     
/* 1494 */     this.gunModel['Ĺ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1495 */     this.gunModel['Ĺ'].setRotationPoint(28.0F, 3.0F, 6.5F);
/*      */     
/* 1497 */     this.gunModel['ĺ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1498 */     this.gunModel['ĺ'].setRotationPoint(43.0F, 3.0F, 8.5F);
/*      */     
/* 1500 */     this.gunModel['Ļ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1501 */     this.gunModel['Ļ'].setRotationPoint(44.0F, 3.0F, 14.0F);
/*      */     
/* 1503 */     this.gunModel['ļ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1504 */     this.gunModel['ļ'].setRotationPoint(44.0F, 3.0F, 1.0F);
/*      */     
/* 1506 */     this.gunModel['Ľ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1507 */     this.gunModel['Ľ'].setRotationPoint(35.0F, 3.0F, 4.0F);
/*      */     
/* 1509 */     this.gunModel['ľ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1510 */     this.gunModel['ľ'].setRotationPoint(35.0F, 3.0F, 2.0F);
/*      */     
/* 1512 */     this.gunModel['Ŀ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1513 */     this.gunModel['Ŀ'].setRotationPoint(35.0F, 3.0F, 13.0F);
/*      */     
/* 1515 */     this.gunModel['ŀ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1516 */     this.gunModel['ŀ'].setRotationPoint(35.0F, 3.0F, 11.0F);
/*      */     
/* 1518 */     this.gunModel['Ł'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 2, 5, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1519 */     this.gunModel['Ł'].setRotationPoint(51.0F, 5.0F, 10.0F);
/*      */     
/* 1521 */     this.gunModel['ł'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 2, 5, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1522 */     this.gunModel['ł'].setRotationPoint(51.0F, 5.0F, 1.0F);
/*      */     
/* 1524 */     this.gunModel['Ń'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1525 */     this.gunModel['Ń'].setRotationPoint(50.0F, 4.0F, 13.0F);
/*      */     
/* 1527 */     this.gunModel['ń'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1528 */     this.gunModel['ń'].setRotationPoint(50.0F, 4.0F, 11.0F);
/*      */     
/* 1530 */     this.gunModel['Ņ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1531 */     this.gunModel['Ņ'].setRotationPoint(50.0F, 4.0F, 4.0F);
/*      */     
/* 1533 */     this.gunModel['ņ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1534 */     this.gunModel['ņ'].setRotationPoint(50.0F, 4.0F, 2.0F);
/*      */     
/* 1536 */     this.gunModel['Ň'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1537 */     this.gunModel['Ň'].setRotationPoint(51.0F, 5.0F, 6.5F);
/*      */     
/* 1539 */     this.gunModel['ň'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1540 */     this.gunModel['ň'].setRotationPoint(51.0F, 5.0F, 8.5F);
/*      */     
/* 1542 */     this.gunModel['ŉ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1543 */     this.gunModel['ŉ'].setRotationPoint(56.0F, 6.0F, 1.0F);
/*      */     
/* 1545 */     this.gunModel['Ŋ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1546 */     this.gunModel['Ŋ'].setRotationPoint(56.0F, 6.0F, 9.5F);
/*      */     
/* 1548 */     this.gunModel['ŋ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1549 */     this.gunModel['ŋ'].setRotationPoint(58.0F, 6.0F, 9.5F);
/*      */     
/* 1551 */     this.gunModel['Ō'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1552 */     this.gunModel['Ō'].setRotationPoint(58.0F, 6.0F, 5.0F);
/*      */     
/* 1554 */     this.gunModel['ō'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1555 */     this.gunModel['ō'].setRotationPoint(58.0F, 6.0F, 14.0F);
/*      */     
/* 1557 */     this.gunModel['Ŏ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1558 */     this.gunModel['Ŏ'].setRotationPoint(58.0F, 6.0F, 1.0F);
/*      */     
/* 1560 */     this.gunModel['ŏ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1561 */     this.gunModel['ŏ'].setRotationPoint(67.0F, 6.0F, 6.5F);
/*      */     
/* 1563 */     this.gunModel['Ő'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1564 */     this.gunModel['Ő'].setRotationPoint(66.0F, 6.0F, 6.5F);
/*      */     
/* 1566 */     this.gunModel['ő'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1567 */     this.gunModel['ő'].setRotationPoint(66.0F, 6.0F, 8.5F);
/*      */     
/* 1569 */     this.gunModel['Œ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1570 */     this.gunModel['Œ'].setRotationPoint(73.0F, 6.0F, 2.0F);
/*      */     
/* 1572 */     this.gunModel['œ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1573 */     this.gunModel['œ'].setRotationPoint(73.0F, 6.0F, 4.0F);
/*      */     
/* 1575 */     this.gunModel['Ŕ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1576 */     this.gunModel['Ŕ'].setRotationPoint(73.0F, 6.0F, 11.0F);
/*      */     
/* 1578 */     this.gunModel['ŕ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1579 */     this.gunModel['ŕ'].setRotationPoint(73.0F, 6.0F, 13.0F);
/*      */     
/* 1581 */     this.gunModel['Ŗ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1582 */     this.gunModel['Ŗ'].setRotationPoint(74.0F, 6.0F, 10.0F);
/*      */     
/* 1584 */     this.gunModel['ŗ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1585 */     this.gunModel['ŗ'].setRotationPoint(74.0F, 6.0F, 1.5F);
/*      */     
/* 1587 */     this.gunModel['Ř'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1588 */     this.gunModel['Ř'].setRotationPoint(58.0F, 6.0F, 13.0F);
/*      */     
/* 1590 */     this.gunModel['ř'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1591 */     this.gunModel['ř'].setRotationPoint(58.0F, 6.0F, 11.0F);
/*      */     
/* 1593 */     this.gunModel['Ś'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1594 */     this.gunModel['Ś'].setRotationPoint(58.0F, 6.0F, 4.0F);
/*      */     
/* 1596 */     this.gunModel['ś'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1597 */     this.gunModel['ś'].setRotationPoint(58.0F, 6.0F, 2.0F);
/*      */     
/* 1599 */     this.gunModel['Ŝ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1600 */     this.gunModel['Ŝ'].setRotationPoint(81.0F, 6.0F, 9.5F);
/*      */     
/* 1602 */     this.gunModel['ŝ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1603 */     this.gunModel['ŝ'].setRotationPoint(81.0F, 6.0F, 5.0F);
/*      */     
/* 1605 */     this.gunModel['Ş'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1606 */     this.gunModel['Ş'].setRotationPoint(81.0F, 6.0F, 14.0F);
/*      */     
/* 1608 */     this.gunModel['ş'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1609 */     this.gunModel['ş'].setRotationPoint(81.0F, 6.0F, 1.0F);
/*      */     
/* 1611 */     this.gunModel['Š'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1612 */     this.gunModel['Š'].setRotationPoint(96.0F, 6.0F, 2.0F);
/*      */     
/* 1614 */     this.gunModel['š'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1615 */     this.gunModel['š'].setRotationPoint(96.0F, 6.0F, 4.0F);
/*      */     
/* 1617 */     this.gunModel['Ţ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1618 */     this.gunModel['Ţ'].setRotationPoint(96.0F, 6.0F, 11.0F);
/*      */     
/* 1620 */     this.gunModel['ţ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1621 */     this.gunModel['ţ'].setRotationPoint(96.0F, 6.0F, 13.0F);
/*      */     
/* 1623 */     this.gunModel['Ť'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1624 */     this.gunModel['Ť'].setRotationPoint(81.0F, 6.0F, 13.0F);
/*      */     
/* 1626 */     this.gunModel['ť'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1627 */     this.gunModel['ť'].setRotationPoint(81.0F, 6.0F, 11.0F);
/*      */     
/* 1629 */     this.gunModel['Ŧ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1630 */     this.gunModel['Ŧ'].setRotationPoint(81.0F, 6.0F, 4.0F);
/*      */     
/* 1632 */     this.gunModel['ŧ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1633 */     this.gunModel['ŧ'].setRotationPoint(81.0F, 6.0F, 2.0F);
/*      */     
/* 1635 */     this.gunModel['Ũ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1636 */     this.gunModel['Ũ'].setRotationPoint(89.0F, 6.0F, 6.5F);
/*      */     
/* 1638 */     this.gunModel['ũ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1639 */     this.gunModel['ũ'].setRotationPoint(89.0F, 6.0F, 8.5F);
/*      */     
/* 1641 */     this.gunModel['Ū'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1642 */     this.gunModel['Ū'].setRotationPoint(74.0F, 6.0F, 8.5F);
/*      */     
/* 1644 */     this.gunModel['ū'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1645 */     this.gunModel['ū'].setRotationPoint(74.0F, 6.0F, 6.5F);
/*      */     
/* 1647 */     this.gunModel['Ŭ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1648 */     this.gunModel['Ŭ'].setRotationPoint(90.0F, 6.0F, 6.5F);
/*      */     
/* 1650 */     this.gunModel['ŭ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1651 */     this.gunModel['ŭ'].setRotationPoint(97.0F, 6.0F, 10.0F);
/*      */     
/* 1653 */     this.gunModel['Ů'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1654 */     this.gunModel['Ů'].setRotationPoint(97.0F, 6.0F, 1.5F);
/*      */     
/* 1656 */     this.gunModel['ů'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1657 */     this.gunModel['ů'].setRotationPoint(104.0F, 6.0F, 9.5F);
/*      */     
/* 1659 */     this.gunModel['Ű'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1660 */     this.gunModel['Ű'].setRotationPoint(104.0F, 6.0F, 5.0F);
/*      */     
/* 1662 */     this.gunModel['ű'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1663 */     this.gunModel['ű'].setRotationPoint(104.0F, 6.0F, 14.0F);
/*      */     
/* 1665 */     this.gunModel['Ų'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1666 */     this.gunModel['Ų'].setRotationPoint(104.0F, 6.0F, 1.0F);
/*      */     
/* 1668 */     this.gunModel['ų'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1669 */     this.gunModel['ų'].setRotationPoint(119.0F, 6.0F, 2.0F);
/*      */     
/* 1671 */     this.gunModel['Ŵ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1672 */     this.gunModel['Ŵ'].setRotationPoint(119.0F, 6.0F, 4.0F);
/*      */     
/* 1674 */     this.gunModel['ŵ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1675 */     this.gunModel['ŵ'].setRotationPoint(119.0F, 6.0F, 11.0F);
/*      */     
/* 1677 */     this.gunModel['Ŷ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1678 */     this.gunModel['Ŷ'].setRotationPoint(119.0F, 6.0F, 13.0F);
/*      */     
/* 1680 */     this.gunModel['ŷ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1681 */     this.gunModel['ŷ'].setRotationPoint(104.0F, 6.0F, 13.0F);
/*      */     
/* 1683 */     this.gunModel['Ÿ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1684 */     this.gunModel['Ÿ'].setRotationPoint(104.0F, 6.0F, 11.0F);
/*      */     
/* 1686 */     this.gunModel['Ź'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1687 */     this.gunModel['Ź'].setRotationPoint(104.0F, 6.0F, 4.0F);
/*      */     
/* 1689 */     this.gunModel['ź'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1690 */     this.gunModel['ź'].setRotationPoint(104.0F, 6.0F, 2.0F);
/*      */     
/* 1692 */     this.gunModel['Ż'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1693 */     this.gunModel['Ż'].setRotationPoint(112.0F, 6.0F, 6.5F);
/*      */     
/* 1695 */     this.gunModel['ż'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1696 */     this.gunModel['ż'].setRotationPoint(112.0F, 6.0F, 8.5F);
/*      */     
/* 1698 */     this.gunModel['Ž'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1699 */     this.gunModel['Ž'].setRotationPoint(97.0F, 6.0F, 8.5F);
/*      */     
/* 1701 */     this.gunModel['ž'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1702 */     this.gunModel['ž'].setRotationPoint(97.0F, 6.0F, 6.5F);
/*      */     
/* 1704 */     this.gunModel['ſ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1705 */     this.gunModel['ſ'].setRotationPoint(113.0F, 6.0F, 6.5F);
/*      */     
/* 1707 */     this.gunModel['ƀ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1708 */     this.gunModel['ƀ'].setRotationPoint(120.0F, 6.0F, 10.0F);
/*      */     
/* 1710 */     this.gunModel['Ɓ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1711 */     this.gunModel['Ɓ'].setRotationPoint(120.0F, 6.0F, 1.5F);
/*      */     
/* 1713 */     this.gunModel['Ƃ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1714 */     this.gunModel['Ƃ'].setRotationPoint(127.0F, 6.0F, 9.5F);
/*      */     
/* 1716 */     this.gunModel['ƃ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1717 */     this.gunModel['ƃ'].setRotationPoint(127.0F, 6.0F, 5.0F);
/*      */     
/* 1719 */     this.gunModel['Ƅ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1720 */     this.gunModel['Ƅ'].setRotationPoint(127.0F, 6.0F, 14.0F);
/*      */     
/* 1722 */     this.gunModel['ƅ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1723 */     this.gunModel['ƅ'].setRotationPoint(127.0F, 6.0F, 1.0F);
/*      */     
/* 1725 */     this.gunModel['Ɔ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1726 */     this.gunModel['Ɔ'].setRotationPoint(142.0F, 6.0F, 2.0F);
/*      */     
/* 1728 */     this.gunModel['Ƈ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1729 */     this.gunModel['Ƈ'].setRotationPoint(142.0F, 6.0F, 4.0F);
/*      */     
/* 1731 */     this.gunModel['ƈ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1732 */     this.gunModel['ƈ'].setRotationPoint(142.0F, 6.0F, 11.0F);
/*      */     
/* 1734 */     this.gunModel['Ɖ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1735 */     this.gunModel['Ɖ'].setRotationPoint(142.0F, 6.0F, 13.0F);
/*      */     
/* 1737 */     this.gunModel['Ɗ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1738 */     this.gunModel['Ɗ'].setRotationPoint(127.0F, 6.0F, 13.0F);
/*      */     
/* 1740 */     this.gunModel['Ƌ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1741 */     this.gunModel['Ƌ'].setRotationPoint(127.0F, 6.0F, 11.0F);
/*      */     
/* 1743 */     this.gunModel['ƌ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1744 */     this.gunModel['ƌ'].setRotationPoint(127.0F, 6.0F, 4.0F);
/*      */     
/* 1746 */     this.gunModel['ƍ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1747 */     this.gunModel['ƍ'].setRotationPoint(127.0F, 6.0F, 2.0F);
/*      */     
/* 1749 */     this.gunModel['Ǝ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1750 */     this.gunModel['Ǝ'].setRotationPoint(135.0F, 6.0F, 6.5F);
/*      */     
/* 1752 */     this.gunModel['Ə'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1753 */     this.gunModel['Ə'].setRotationPoint(135.0F, 6.0F, 8.5F);
/*      */     
/* 1755 */     this.gunModel['Ɛ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1756 */     this.gunModel['Ɛ'].setRotationPoint(120.0F, 6.0F, 8.5F);
/*      */     
/* 1758 */     this.gunModel['Ƒ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1759 */     this.gunModel['Ƒ'].setRotationPoint(120.0F, 6.0F, 6.5F);
/*      */     
/* 1761 */     this.gunModel['ƒ'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1762 */     this.gunModel['ƒ'].setRotationPoint(143.0F, 6.0F, 1.0F);
/*      */     
/* 1764 */     this.gunModel['Ɠ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1765 */     this.gunModel['Ɠ'].setRotationPoint(136.0F, 6.0F, 6.5F);
/*      */     
/* 1767 */     this.gunModel['Ɣ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1768 */     this.gunModel['Ɣ'].setRotationPoint(20.0F, 2.0F, 5.0F);
/*      */     
/* 1770 */     this.gunModel['ƕ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1771 */     this.gunModel['ƕ'].setRotationPoint(-107.0F, 42.0F, -0.5F);
/*      */     
/* 1773 */     this.gunModel['Ɩ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1774 */     this.gunModel['Ɩ'].setRotationPoint(-107.0F, 43.0F, -0.5F);
/*      */     
/* 1776 */     this.gunModel['Ɨ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1777 */     this.gunModel['Ɨ'].setRotationPoint(-107.0F, 44.0F, -0.5F);
/*      */     
/* 1779 */     this.gunModel['Ƙ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 6, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1780 */     this.gunModel['Ƙ'].setRotationPoint(-114.0F, 42.0F, 0.0F);
/*      */     
/* 1782 */     this.gunModel['ƙ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 16, 0.0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
/* 1783 */     this.gunModel['ƙ'].setRotationPoint(-113.0F, 38.0F, 0.0F);
/*      */     
/* 1785 */     this.gunModel['ƚ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 16, 0.0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1786 */     this.gunModel['ƚ'].setRotationPoint(-117.0F, 35.0F, 0.0F);
/*      */     
/* 1788 */     this.gunModel['ƛ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 16, 0.0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1789 */     this.gunModel['ƛ'].setRotationPoint(-121.0F, 33.0F, 0.0F);
/*      */     
/* 1791 */     this.gunModel['Ɯ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 16, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1792 */     this.gunModel['Ɯ'].setRotationPoint(-125.0F, 30.0F, 0.0F);
/*      */     
/* 1794 */     this.gunModel['Ɲ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F);
/* 1795 */     this.gunModel['Ɲ'].setRotationPoint(-114.0F, 48.0F, 0.0F);
/*      */     
/* 1797 */     this.gunModel['ƞ'].addShapeBox(86.0F, -60.0F, -8.0F, 11, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1798 */     this.gunModel['ƞ'].setRotationPoint(-112.0F, 46.0F, 0.0F);
/*      */     
/* 1800 */     this.gunModel['Ɵ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 8, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 5.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, -2.0F);
/* 1801 */     this.gunModel['Ɵ'].setRotationPoint(-116.0F, 52.0F, 0.0F);
/*      */     
/* 1803 */     this.gunModel['Ơ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 8, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 5.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, -2.0F);
/* 1804 */     this.gunModel['Ơ'].setRotationPoint(-121.0F, 60.0F, 0.0F);
/*      */     
/* 1806 */     this.gunModel['ơ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 7, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F);
/* 1807 */     this.gunModel['ơ'].setRotationPoint(-126.0F, 68.0F, 0.0F);
/*      */     
/* 1809 */     this.gunModel['Ƣ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 7, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1810 */     this.gunModel['Ƣ'].setRotationPoint(-130.0F, 75.0F, 0.0F);
/*      */     
/* 1812 */     this.gunModel['ƣ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F);
/* 1813 */     this.gunModel['ƣ'].setRotationPoint(-130.0F, 82.0F, 0.0F);
/*      */     
/* 1815 */     this.gunModel['Ƥ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F);
/* 1816 */     this.gunModel['Ƥ'].setRotationPoint(-128.0F, 86.0F, 0.0F);
/*      */     
/* 1818 */     this.gunModel['ƥ'].addShapeBox(86.0F, -60.0F, -8.0F, 21, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1819 */     this.gunModel['ƥ'].setRotationPoint(-126.0F, 86.0F, 0.0F);
/*      */     
/* 1821 */     this.gunModel['Ʀ'].addShapeBox(86.0F, -60.0F, -8.0F, 19, 4, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1822 */     this.gunModel['Ʀ'].setRotationPoint(-128.0F, 82.0F, 0.0F);
/*      */     
/* 1824 */     this.gunModel['Ƨ'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1825 */     this.gunModel['Ƨ'].setRotationPoint(-128.0F, 79.0F, 0.0F);
/*      */     
/* 1827 */     this.gunModel['ƨ'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1828 */     this.gunModel['ƨ'].setRotationPoint(-128.0F, 75.0F, 0.0F);
/*      */     
/* 1830 */     this.gunModel['Ʃ'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1831 */     this.gunModel['Ʃ'].setRotationPoint(-127.0F, 77.0F, 1.0F);
/*      */     
/* 1833 */     this.gunModel['ƪ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1834 */     this.gunModel['ƪ'].setRotationPoint(-128.0F, 77.0F, 0.0F);
/*      */     
/* 1836 */     this.gunModel['ƫ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1837 */     this.gunModel['ƫ'].setRotationPoint(-109.0F, 77.0F, 0.0F);
/*      */     
/* 1839 */     this.gunModel['Ƭ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1840 */     this.gunModel['Ƭ'].setRotationPoint(-127.0F, 78.0F, 0.0F);
/*      */     
/* 1842 */     this.gunModel['ƭ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1843 */     this.gunModel['ƭ'].setRotationPoint(-110.0F, 77.0F, 0.0F);
/*      */     
/* 1845 */     this.gunModel['Ʈ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1846 */     this.gunModel['Ʈ'].setRotationPoint(-110.0F, 78.0F, 0.0F);
/*      */     
/* 1848 */     this.gunModel['Ư'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1849 */     this.gunModel['Ư'].setRotationPoint(-127.0F, 77.0F, 0.0F);
/*      */     
/* 1851 */     this.gunModel['ư'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1852 */     this.gunModel['ư'].setRotationPoint(-118.5F, 73.25F, -0.5F);
/*      */     
/* 1854 */     this.gunModel['Ʊ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1855 */     this.gunModel['Ʊ'].setRotationPoint(-118.5F, 74.25F, -0.5F);
/*      */     
/* 1857 */     this.gunModel['Ʋ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1858 */     this.gunModel['Ʋ'].setRotationPoint(-118.5F, 75.25F, -0.5F);
/*      */     
/* 1860 */     this.gunModel['Ƴ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 26, 16, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F);
/* 1861 */     this.gunModel['Ƴ'].setRotationPoint(-99.0F, 49.0F, 0.0F);
/*      */     
/* 1863 */     this.gunModel['ƴ'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 2, 16, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1864 */     this.gunModel['ƴ'].setRotationPoint(-128.0F, 73.0F, 0.0F);
/*      */     
/* 1866 */     this.gunModel['Ƶ'].addShapeBox(86.0F, -60.0F, -8.0F, 11, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1867 */     this.gunModel['Ƶ'].setRotationPoint(-112.0F, 48.0F, 0.0F);
/*      */     
/* 1869 */     this.gunModel['ƶ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1870 */     this.gunModel['ƶ'].setRotationPoint(-126.0F, 71.0F, 1.0F);
/*      */     
/* 1872 */     this.gunModel['Ʒ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F);
/* 1873 */     this.gunModel['Ʒ'].setRotationPoint(-126.75F, 71.0F, 0.0F);
/*      */     
/* 1875 */     this.gunModel['Ƹ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1876 */     this.gunModel['Ƹ'].setRotationPoint(-110.0F, 71.0F, 0.0F);
/*      */     
/* 1878 */     this.gunModel['ƹ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1879 */     this.gunModel['ƹ'].setRotationPoint(-125.75F, 72.0F, 0.0F);
/*      */     
/* 1881 */     this.gunModel['ƺ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1882 */     this.gunModel['ƺ'].setRotationPoint(-125.75F, 71.0F, 0.0F);
/*      */     
/* 1884 */     this.gunModel['ƻ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1885 */     this.gunModel['ƻ'].setRotationPoint(-111.0F, 71.0F, 0.0F);
/*      */     
/* 1887 */     this.gunModel['Ƽ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1888 */     this.gunModel['Ƽ'].setRotationPoint(-111.0F, 72.0F, 0.0F);
/*      */     
/* 1890 */     this.gunModel['ƽ'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 3, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 1891 */     this.gunModel['ƽ'].setRotationPoint(-126.0F, 68.0F, 0.0F);
/*      */     
/* 1893 */     this.gunModel['ƾ'].addShapeBox(86.0F, -60.0F, -8.0F, 11, 4, 16, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1894 */     this.gunModel['ƾ'].setRotationPoint(-112.0F, 38.0F, 0.0F);
/*      */     
/* 1896 */     this.gunModel['ƿ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1897 */     this.gunModel['ƿ'].setRotationPoint(-123.0F, 66.0F, 1.0F);
/*      */     
/* 1899 */     this.gunModel['ǀ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1900 */     this.gunModel['ǀ'].setRotationPoint(-123.75F, 66.0F, 0.0F);
/*      */     
/* 1902 */     this.gunModel['ǁ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1903 */     this.gunModel['ǁ'].setRotationPoint(-107.5F, 66.0F, 0.0F);
/*      */     
/* 1905 */     this.gunModel['ǂ'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 3, 16, 0.0F, -2.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.1F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1906 */     this.gunModel['ǂ'].setRotationPoint(-123.0F, 63.0F, 0.0F);
/*      */     
/* 1908 */     this.gunModel['ǃ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1909 */     this.gunModel['ǃ'].setRotationPoint(-108.5F, 66.0F, 0.0F);
/*      */     
/* 1911 */     this.gunModel['Ǆ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1912 */     this.gunModel['Ǆ'].setRotationPoint(-108.5F, 67.0F, 0.0F);
/*      */     
/* 1914 */     this.gunModel['ǅ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1915 */     this.gunModel['ǅ'].setRotationPoint(-122.75F, 67.0F, 0.0F);
/*      */     
/* 1917 */     this.gunModel['ǆ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1918 */     this.gunModel['ǆ'].setRotationPoint(-122.75F, 66.0F, 0.0F);
/*      */     
/* 1920 */     this.gunModel['Ǉ'].addShapeBox(86.0F, -60.0F, -8.0F, 16, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1921 */     this.gunModel['Ǉ'].setRotationPoint(-120.0F, 61.0F, 1.0F);
/*      */     
/* 1923 */     this.gunModel['ǈ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1924 */     this.gunModel['ǈ'].setRotationPoint(-105.0F, 61.0F, 0.0F);
/*      */     
/* 1926 */     this.gunModel['ǉ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1927 */     this.gunModel['ǉ'].setRotationPoint(-120.65F, 61.0F, 0.0F);
/*      */     
/* 1929 */     this.gunModel['Ǌ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1930 */     this.gunModel['Ǌ'].setRotationPoint(-106.0F, 61.0F, 0.0F);
/*      */     
/* 1932 */     this.gunModel['ǋ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1933 */     this.gunModel['ǋ'].setRotationPoint(-106.0F, 62.0F, 0.0F);
/*      */     
/* 1935 */     this.gunModel['ǌ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1936 */     this.gunModel['ǌ'].setRotationPoint(-119.65F, 62.0F, 0.0F);
/*      */     
/* 1938 */     this.gunModel['Ǎ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1939 */     this.gunModel['Ǎ'].setRotationPoint(-119.65F, 61.0F, 0.0F);
/*      */     
/* 1941 */     this.gunModel['ǎ'].addShapeBox(86.0F, -60.0F, -8.0F, 15, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1942 */     this.gunModel['ǎ'].setRotationPoint(-117.0F, 56.0F, 1.0F);
/*      */     
/* 1944 */     this.gunModel['Ǐ'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 2, 16, 0.0F, -2.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1945 */     this.gunModel['Ǐ'].setRotationPoint(-120.0F, 58.0F, 0.0F);
/*      */     
/* 1947 */     this.gunModel['ǐ'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 1, 16, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F);
/* 1948 */     this.gunModel['ǐ'].setRotationPoint(-121.0F, 60.0F, 0.0F);
/*      */     
/* 1950 */     this.gunModel['Ǒ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1951 */     this.gunModel['Ǒ'].setRotationPoint(-117.5F, 56.0F, 0.0F);
/*      */     
/* 1953 */     this.gunModel['ǒ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1954 */     this.gunModel['ǒ'].setRotationPoint(-102.5F, 56.0F, 0.0F);
/*      */     
/* 1956 */     this.gunModel['Ǔ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1957 */     this.gunModel['Ǔ'].setRotationPoint(-103.5F, 56.0F, 0.0F);
/*      */     
/* 1959 */     this.gunModel['ǔ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1960 */     this.gunModel['ǔ'].setRotationPoint(-103.5F, 57.0F, 0.0F);
/*      */     
/* 1962 */     this.gunModel['Ǖ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1963 */     this.gunModel['Ǖ'].setRotationPoint(-116.5F, 57.0F, 0.0F);
/*      */     
/* 1965 */     this.gunModel['ǖ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1966 */     this.gunModel['ǖ'].setRotationPoint(-116.5F, 56.0F, 0.0F);
/*      */     
/* 1968 */     this.gunModel['Ǘ'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 4, 16, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1969 */     this.gunModel['Ǘ'].setRotationPoint(-116.0F, 52.0F, 0.0F);
/*      */     
/* 1971 */     this.gunModel['ǘ'].addShapeBox(86.0F, -60.0F, -8.0F, 15, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1972 */     this.gunModel['ǘ'].setRotationPoint(-113.0F, 49.0F, 1.0F);
/*      */     
/* 1974 */     this.gunModel['Ǚ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1975 */     this.gunModel['Ǚ'].setRotationPoint(-99.0F, 49.0F, 0.0F);
/*      */     
/* 1977 */     this.gunModel['ǚ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1978 */     this.gunModel['ǚ'].setRotationPoint(-100.0F, 49.0F, 0.0F);
/*      */     
/* 1980 */     this.gunModel['Ǜ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1981 */     this.gunModel['Ǜ'].setRotationPoint(-100.0F, 50.0F, 0.0F);
/*      */     
/* 1983 */     this.gunModel['ǜ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 16, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1984 */     this.gunModel['ǜ'].setRotationPoint(-113.5F, 49.0F, 0.0F);
/*      */     
/* 1986 */     this.gunModel['ǝ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1987 */     this.gunModel['ǝ'].setRotationPoint(-112.5F, 50.0F, 0.0F);
/*      */     
/* 1989 */     this.gunModel['Ǟ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1990 */     this.gunModel['Ǟ'].setRotationPoint(-112.5F, 49.0F, 0.0F);
/*      */     
/* 1992 */     this.gunModel['ǟ'].addShapeBox(86.0F, -60.0F, -8.0F, 14, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1993 */     this.gunModel['ǟ'].setRotationPoint(-113.5F, 51.0F, 0.0F);
/*      */     
/* 1995 */     this.gunModel['Ǡ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1996 */     this.gunModel['Ǡ'].setRotationPoint(-105.0F, 86.0F, 0.0F);
/*      */     
/* 1998 */     this.gunModel['ǡ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 4, 16, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, 2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1999 */     this.gunModel['ǡ'].setRotationPoint(-105.0F, 82.0F, 0.0F);
/*      */     
/* 2001 */     this.gunModel['Ǣ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 7, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 2002 */     this.gunModel['Ǣ'].setRotationPoint(-108.0F, 75.0F, 0.0F);
/*      */     
/* 2004 */     this.gunModel['ǣ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 26, 16, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, -12.0F, 0.0F, -3.0F, -12.0F, 0.0F, -3.0F, 12.0F, 0.0F, 0.0F);
/* 2005 */     this.gunModel['ǣ'].setRotationPoint(-96.0F, 49.0F, 0.0F);
/*      */     
/* 2007 */     this.gunModel['Ǥ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 16, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2008 */     this.gunModel['Ǥ'].setRotationPoint(-95.0F, 48.0F, 0.0F);
/*      */     
/* 2010 */     this.gunModel['ǥ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 16, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2011 */     this.gunModel['ǥ'].setRotationPoint(-96.0F, 46.0F, 0.0F);
/*      */     
/* 2013 */     this.gunModel['Ǧ'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 4, 16, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 2014 */     this.gunModel['Ǧ'].setRotationPoint(-98.0F, 42.0F, 0.0F);
/*      */     
/* 2016 */     this.gunModel['ǧ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 3, 16, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F);
/* 2017 */     this.gunModel['ǧ'].setRotationPoint(-99.0F, 39.0F, 0.0F);
/*      */     
/* 2019 */     this.gunModel['Ǩ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F);
/* 2020 */     this.gunModel['Ǩ'].setRotationPoint(-5.0F, 32.5F, 0.0F);
/*      */     
/* 2022 */     this.gunModel['ǩ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -2.0F, 0.0F, -2.5F);
/* 2023 */     this.gunModel['ǩ'].setRotationPoint(-5.0F, 34.5F, 1.0F);
/*      */     
/* 2025 */     this.gunModel['Ǫ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 5, 16, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F);
/* 2026 */     this.gunModel['Ǫ'].setRotationPoint(-100.0F, 34.0F, 0.0F);
/*      */     
/* 2028 */     this.gunModel['ǫ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 16, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 2029 */     this.gunModel['ǫ'].setRotationPoint(-100.0F, 32.0F, 0.0F);
/*      */     
/* 2031 */     this.gunModel['Ǭ'].addShapeBox(86.0F, -60.0F, -8.0F, 14, 3, 16, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2032 */     this.gunModel['Ǭ'].setRotationPoint(-115.0F, 35.0F, 0.0F);
/*      */     
/* 2034 */     this.gunModel['ǭ'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 2, 16, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2035 */     this.gunModel['ǭ'].setRotationPoint(-119.0F, 33.0F, 0.0F);
/*      */     
/* 2037 */     this.gunModel['Ǯ'].addShapeBox(86.0F, -60.0F, -8.0F, 22, 1, 16, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2038 */     this.gunModel['Ǯ'].setRotationPoint(-123.0F, 32.0F, 0.0F);
/*      */     
/* 2040 */     this.gunModel['ǯ'].addShapeBox(86.0F, -60.0F, -8.0F, 21, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F);
/* 2041 */     this.gunModel['ǯ'].setRotationPoint(-124.0F, 30.0F, 0.0F);
/*      */     
/* 2043 */     this.gunModel['ǰ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 4, 16, 0.0F, 2.25F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 2.25F, -2.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 2044 */     this.gunModel['ǰ'].setRotationPoint(-100.0F, 9.0F, 0.0F);
/*      */     
/* 2046 */     this.gunModel['Ǳ'].addShapeBox(86.0F, -60.0F, -8.0F, 9, 3, 12, 0.0F, 1.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 1.0F, -2.0F, -4.0F, 0.25F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 2.0F, 2.0F);
/* 2047 */     this.gunModel['Ǳ'].setRotationPoint(-102.0F, 6.0F, 2.0F);
/*      */     
/* 2049 */     this.gunModel['ǲ'].addShapeBox(86.0F, -60.0F, -8.0F, 10, 19, 16, 0.0F, 0.0F, 0.0F, 0.0F, -8.25F, 0.0F, 0.0F, -8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2050 */     this.gunModel['ǲ'].setRotationPoint(-103.0F, 13.0F, 0.0F);
/*      */     
/* 2052 */     this.gunModel['ǳ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2053 */     this.gunModel['ǳ'].setRotationPoint(-103.0F, 11.0F, 0.0F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2058 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 985, 353, this.textureX, this.textureY);
/* 2059 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 689, 361, this.textureX, this.textureY);
/* 2060 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 473, 369, this.textureX, this.textureY);
/* 2061 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 553, 369, this.textureX, this.textureY);
/* 2062 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 737, 369, this.textureX, this.textureY);
/* 2063 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 25, 361, this.textureX, this.textureY);
/* 2064 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 785, 369, this.textureX, this.textureY);
/* 2065 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 129, 361, this.textureX, this.textureY);
/* 2066 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 57, 377, this.textureX, this.textureY);
/* 2067 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 161, 377, this.textureX, this.textureY);
/* 2068 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 233, 385, this.textureX, this.textureY);
/* 2069 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 537, 393, this.textureX, this.textureY);
/* 2070 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 665, 393, this.textureX, this.textureY);
/* 2071 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 321, 201, this.textureX, this.textureY);
/* 2072 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 361, 201, this.textureX, this.textureY);
/* 2073 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 601, 57, this.textureX, this.textureY);
/* 2074 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 641, 57, this.textureX, this.textureY);
/* 2075 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 681, 57, this.textureX, this.textureY);
/* 2076 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 825, 377, this.textureX, this.textureY);
/* 2077 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 721, 57, this.textureX, this.textureY);
/* 2078 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 625, 57, this.textureX, this.textureY);
/* 2079 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 665, 57, this.textureX, this.textureY);
/* 2080 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 705, 57, this.textureX, this.textureY);
/* 2081 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 745, 57, this.textureX, this.textureY);
/* 2082 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 761, 57, this.textureX, this.textureY);
/* 2083 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 801, 57, this.textureX, this.textureY);
/* 2084 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 817, 57, this.textureX, this.textureY);
/* 2085 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 841, 57, this.textureX, this.textureY);
/* 2086 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 865, 57, this.textureX, this.textureY);
/* 2087 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/* 2088 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 897, 57, this.textureX, this.textureY);
/* 2089 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 945, 57, this.textureX, this.textureY);
/* 2090 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 961, 57, this.textureX, this.textureY);
/* 2091 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/* 2092 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 1009, 57, this.textureX, this.textureY);
/* 2093 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 561, 65, this.textureX, this.textureY);
/* 2094 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 401, 201, this.textureX, this.textureY);
/* 2095 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 441, 201, this.textureX, this.textureY);
/* 2096 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 529, 201, this.textureX, this.textureY);
/* 2097 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 569, 201, this.textureX, this.textureY);
/* 2098 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 321, 161, this.textureX, this.textureY);
/* 2099 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 2100 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/* 2101 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 921, 65, this.textureX, this.textureY);
/* 2102 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/* 2103 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/* 2104 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 609, 201, this.textureX, this.textureY);
/* 2105 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 945, 73, this.textureX, this.textureY);
/* 2106 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 649, 201, this.textureX, this.textureY);
/* 2107 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/* 2108 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 929, 161, this.textureX, this.textureY);
/* 2109 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 953, 177, this.textureX, this.textureY);
/* 2110 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 921, 185, this.textureX, this.textureY);
/* 2111 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 1, 377, this.textureX, this.textureY);
/* 2112 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 737, 201, this.textureX, this.textureY);
/* 2113 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 777, 201, this.textureX, this.textureY);
/* 2114 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 1001, 201, this.textureX, this.textureY);
/* 2115 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 25, 209, this.textureX, this.textureY);
/* 2116 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 2117 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/* 2118 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 721, 65, this.textureX, this.textureY);
/* 2119 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 921, 9, this.textureX, this.textureY);
/* 2120 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 113, 161, this.textureX, this.textureY);
/* 2121 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 249, 161, this.textureX, this.textureY);
/* 2122 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 521, 169, this.textureX, this.textureY);
/* 2123 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/* 2124 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 849, 177, this.textureX, this.textureY);
/* 2125 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 969, 9, this.textureX, this.textureY);
/* 2126 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 993, 9, this.textureX, this.textureY);
/* 2127 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 1009, 73, this.textureX, this.textureY);
/* 2128 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 2129 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/* 2130 */     this.gunModel['ȼ'] = new ModelRendererTurbo(this, 793, 393, this.textureX, this.textureY);
/* 2131 */     this.gunModel['Ƚ'] = new ModelRendererTurbo(this, 1, 401, this.textureX, this.textureY);
/* 2132 */     this.gunModel['Ⱦ'] = new ModelRendererTurbo(this, 585, 65, this.textureX, this.textureY);
/* 2133 */     this.gunModel['ȿ'] = new ModelRendererTurbo(this, 625, 65, this.textureX, this.textureY);
/* 2134 */     this.gunModel['ɀ'] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/* 2135 */     this.gunModel['Ɂ'] = new ModelRendererTurbo(this, 665, 65, this.textureX, this.textureY);
/* 2136 */     this.gunModel['ɂ'] = new ModelRendererTurbo(this, 705, 65, this.textureX, this.textureY);
/* 2137 */     this.gunModel['Ƀ'] = new ModelRendererTurbo(this, 761, 65, this.textureX, this.textureY);
/* 2138 */     this.gunModel['Ʉ'] = new ModelRendererTurbo(this, 777, 65, this.textureX, this.textureY);
/* 2139 */     this.gunModel['Ʌ'] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/* 2140 */     this.gunModel['Ɇ'] = new ModelRendererTurbo(this, 777, 57, this.textureX, this.textureY);
/* 2141 */     this.gunModel['ɇ'] = new ModelRendererTurbo(this, 729, 65, this.textureX, this.textureY);
/* 2142 */     this.gunModel['Ɉ'] = new ModelRendererTurbo(this, 745, 65, this.textureX, this.textureY);
/* 2143 */     this.gunModel['ɉ'] = new ModelRendererTurbo(this, 801, 65, this.textureX, this.textureY);
/* 2144 */     this.gunModel['Ɋ'] = new ModelRendererTurbo(this, 817, 65, this.textureX, this.textureY);
/* 2145 */     this.gunModel['ɋ'] = new ModelRendererTurbo(this, 897, 65, this.textureX, this.textureY);
/* 2146 */     this.gunModel['Ɍ'] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/* 2147 */     this.gunModel['ɍ'] = new ModelRendererTurbo(this, 361, 409, this.textureX, this.textureY);
/* 2148 */     this.gunModel['Ɏ'] = new ModelRendererTurbo(this, 665, 401, this.textureX, this.textureY);
/* 2149 */     this.gunModel['ɏ'] = new ModelRendererTurbo(this, 489, 417, this.textureX, this.textureY);
/* 2150 */     this.gunModel['ɐ'] = new ModelRendererTurbo(this, 65, 209, this.textureX, this.textureY);
/* 2151 */     this.gunModel['ɑ'] = new ModelRendererTurbo(this, 105, 209, this.textureX, this.textureY);
/* 2152 */     this.gunModel['ɒ'] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/* 2153 */     this.gunModel['ɓ'] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/* 2154 */     this.gunModel['ɔ'] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/* 2155 */     this.gunModel['ɕ'] = new ModelRendererTurbo(this, 593, 385, this.textureX, this.textureY);
/* 2156 */     this.gunModel['ɖ'] = new ModelRendererTurbo(this, 841, 65, this.textureX, this.textureY);
/* 2157 */     this.gunModel['ɗ'] = new ModelRendererTurbo(this, 865, 65, this.textureX, this.textureY);
/* 2158 */     this.gunModel['ɘ'] = new ModelRendererTurbo(this, 89, 73, this.textureX, this.textureY);
/* 2159 */     this.gunModel['ə'] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/* 2160 */     this.gunModel['ɚ'] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/* 2161 */     this.gunModel['ɛ'] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/* 2162 */     this.gunModel['ɜ'] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/* 2163 */     this.gunModel['ɝ'] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/* 2164 */     this.gunModel['ɞ'] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/* 2165 */     this.gunModel['ɟ'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 2166 */     this.gunModel['ɠ'] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 2167 */     this.gunModel['ɡ'] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/* 2168 */     this.gunModel['ɢ'] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY);
/* 2169 */     this.gunModel['ɣ'] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/* 2170 */     this.gunModel['ɤ'] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/* 2171 */     this.gunModel['ɥ'] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/* 2172 */     this.gunModel['ɦ'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/* 2173 */     this.gunModel['ɧ'] = new ModelRendererTurbo(this, 1009, 177, this.textureX, this.textureY);
/* 2174 */     this.gunModel['ɨ'] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/* 2175 */     this.gunModel['ɩ'] = new ModelRendererTurbo(this, 617, 417, this.textureX, this.textureY);
/* 2176 */     this.gunModel['ɪ'] = new ModelRendererTurbo(this, 121, 425, this.textureX, this.textureY);
/* 2177 */     this.gunModel['ɫ'] = new ModelRendererTurbo(this, 881, 65, this.textureX, this.textureY);
/* 2178 */     this.gunModel['ɬ'] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/* 2179 */     this.gunModel['ɭ'] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/* 2180 */     this.gunModel['ɮ'] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/* 2181 */     this.gunModel['ɯ'] = new ModelRendererTurbo(this, 241, 81, this.textureX, this.textureY);
/* 2182 */     this.gunModel['ɰ'] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/* 2183 */     this.gunModel['ɱ'] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/* 2184 */     this.gunModel['ɲ'] = new ModelRendererTurbo(this, 513, 81, this.textureX, this.textureY);
/* 2185 */     this.gunModel['ɳ'] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/* 2186 */     this.gunModel['ɴ'] = new ModelRendererTurbo(this, 945, 73, this.textureX, this.textureY);
/* 2187 */     this.gunModel['ɵ'] = new ModelRendererTurbo(this, 305, 81, this.textureX, this.textureY);
/* 2188 */     this.gunModel['ɶ'] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/* 2189 */     this.gunModel['ɷ'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/* 2190 */     this.gunModel['ɸ'] = new ModelRendererTurbo(this, 529, 81, this.textureX, this.textureY);
/* 2191 */     this.gunModel['ɹ'] = new ModelRendererTurbo(this, 569, 81, this.textureX, this.textureY);
/* 2192 */     this.gunModel['ɺ'] = new ModelRendererTurbo(this, 361, 377, this.textureX, this.textureY);
/* 2193 */     this.gunModel['ɻ'] = new ModelRendererTurbo(this, 913, 393, this.textureX, this.textureY);
/* 2194 */     this.gunModel['ɼ'] = new ModelRendererTurbo(this, 961, 377, this.textureX, this.textureY);
/* 2195 */     this.gunModel['ɽ'] = new ModelRendererTurbo(this, 121, 385, this.textureX, this.textureY);
/* 2196 */     this.gunModel['ɾ'] = new ModelRendererTurbo(this, 697, 289, this.textureX, this.textureY);
/* 2197 */     this.gunModel['ɿ'] = new ModelRendererTurbo(this, 433, 297, this.textureX, this.textureY);
/* 2198 */     this.gunModel['ʀ'] = new ModelRendererTurbo(this, 513, 297, this.textureX, this.textureY);
/* 2199 */     this.gunModel['ʁ'] = new ModelRendererTurbo(this, 81, 305, this.textureX, this.textureY);
/* 2200 */     this.gunModel['ʂ'] = new ModelRendererTurbo(this, 1009, 377, this.textureX, this.textureY);
/* 2201 */     this.gunModel['ʃ'] = new ModelRendererTurbo(this, 761, 401, this.textureX, this.textureY);
/* 2202 */     this.gunModel['ʄ'] = new ModelRendererTurbo(this, 961, 409, this.textureX, this.textureY);
/* 2203 */     this.gunModel['ʅ'] = new ModelRendererTurbo(this, 161, 401, this.textureX, this.textureY);
/* 2204 */     this.gunModel['ʆ'] = new ModelRendererTurbo(this, 985, 81, this.textureX, this.textureY);
/* 2205 */     this.gunModel['ʇ'] = new ModelRendererTurbo(this, 121, 137, this.textureX, this.textureY);
/* 2206 */     this.gunModel['ʈ'] = new ModelRendererTurbo(this, 897, 417, this.textureX, this.textureY);
/* 2207 */     this.gunModel['ʉ'] = new ModelRendererTurbo(this, 737, 409, this.textureX, this.textureY);
/* 2208 */     this.gunModel['ʊ'] = new ModelRendererTurbo(this, 913, 385, this.textureX, this.textureY);
/* 2209 */     this.gunModel['ʋ'] = new ModelRendererTurbo(this, 945, 417, this.textureX, this.textureY);
/* 2210 */     this.gunModel['ʌ'] = new ModelRendererTurbo(this, 193, 209, this.textureX, this.textureY);
/* 2211 */     this.gunModel['ʍ'] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/* 2212 */     this.gunModel['ʎ'] = new ModelRendererTurbo(this, 209, 137, this.textureX, this.textureY);
/* 2213 */     this.gunModel['ʏ'] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/* 2214 */     this.gunModel['ʐ'] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/* 2215 */     this.gunModel['ʑ'] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/* 2216 */     this.gunModel['ʒ'] = new ModelRendererTurbo(this, 553, 81, this.textureX, this.textureY);
/* 2217 */     this.gunModel['ʓ'] = new ModelRendererTurbo(this, 593, 81, this.textureX, this.textureY);
/* 2218 */     this.gunModel['ʔ'] = new ModelRendererTurbo(this, 329, 97, this.textureX, this.textureY);
/* 2219 */     this.gunModel['ʕ'] = new ModelRendererTurbo(this, 465, 97, this.textureX, this.textureY);
/* 2220 */     this.gunModel['ʖ'] = new ModelRendererTurbo(this, 625, 81, this.textureX, this.textureY);
/* 2221 */     this.gunModel['ʗ'] = new ModelRendererTurbo(this, 841, 385, this.textureX, this.textureY);
/* 2222 */     this.gunModel['ʘ'] = new ModelRendererTurbo(this, 473, 401, this.textureX, this.textureY);
/* 2223 */     this.gunModel['ʙ'] = new ModelRendererTurbo(this, 241, 425, this.textureX, this.textureY);
/* 2224 */     this.gunModel['ʚ'] = new ModelRendererTurbo(this, 329, 105, this.textureX, this.textureY);
/* 2225 */     this.gunModel['ʛ'] = new ModelRendererTurbo(this, 969, 105, this.textureX, this.textureY);
/* 2226 */     this.gunModel['ʜ'] = new ModelRendererTurbo(this, 993, 121, this.textureX, this.textureY);
/* 2227 */     this.gunModel['ʝ'] = new ModelRendererTurbo(this, 873, 129, this.textureX, this.textureY);
/* 2228 */     this.gunModel['ʞ'] = new ModelRendererTurbo(this, 993, 129, this.textureX, this.textureY);
/* 2229 */     this.gunModel['ʟ'] = new ModelRendererTurbo(this, 25, 137, this.textureX, this.textureY);
/* 2230 */     this.gunModel['ʠ'] = new ModelRendererTurbo(this, 201, 401, this.textureX, this.textureY);
/* 2231 */     this.gunModel['ʡ'] = new ModelRendererTurbo(this, 313, 425, this.textureX, this.textureY);
/* 2232 */     this.gunModel['ʢ'] = new ModelRendererTurbo(this, 489, 425, this.textureX, this.textureY);
/* 2233 */     this.gunModel['ʣ'] = new ModelRendererTurbo(this, 529, 425, this.textureX, this.textureY);
/* 2234 */     this.gunModel['ʤ'] = new ModelRendererTurbo(this, 233, 209, this.textureX, this.textureY);
/* 2235 */     this.gunModel['ʥ'] = new ModelRendererTurbo(this, 25, 233, this.textureX, this.textureY);
/* 2236 */     this.gunModel['ʦ'] = new ModelRendererTurbo(this, 921, 249, this.textureX, this.textureY);
/* 2237 */     this.gunModel['ʧ'] = new ModelRendererTurbo(this, 457, 273, this.textureX, this.textureY);
/* 2238 */     this.gunModel['ʨ'] = new ModelRendererTurbo(this, 505, 273, this.textureX, this.textureY);
/* 2239 */     this.gunModel['ʩ'] = new ModelRendererTurbo(this, 545, 273, this.textureX, this.textureY);
/* 2240 */     this.gunModel['ʪ'] = new ModelRendererTurbo(this, 585, 273, this.textureX, this.textureY);
/* 2241 */     this.gunModel['ʫ'] = new ModelRendererTurbo(this, 793, 273, this.textureX, this.textureY);
/* 2242 */     this.gunModel['ʬ'] = new ModelRendererTurbo(this, 569, 425, this.textureX, this.textureY);
/* 2243 */     this.gunModel['ʭ'] = new ModelRendererTurbo(this, 793, 425, this.textureX, this.textureY);
/* 2244 */     this.gunModel['ʮ'] = new ModelRendererTurbo(this, 841, 425, this.textureX, this.textureY);
/* 2245 */     this.gunModel['ʯ'] = new ModelRendererTurbo(this, 945, 201, this.textureX, this.textureY);
/* 2246 */     this.gunModel['ʰ'] = new ModelRendererTurbo(this, 913, 209, this.textureX, this.textureY);
/* 2247 */     this.gunModel['ʱ'] = new ModelRendererTurbo(this, 1, 433, this.textureX, this.textureY);
/* 2248 */     this.gunModel['ʲ'] = new ModelRendererTurbo(this, 241, 449, this.textureX, this.textureY);
/* 2249 */     this.gunModel['ʳ'] = new ModelRendererTurbo(this, 217, 377, this.textureX, this.textureY);
/* 2250 */     this.gunModel['ʴ'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/* 2251 */     this.gunModel['ʵ'] = new ModelRendererTurbo(this, 233, 137, this.textureX, this.textureY);
/* 2252 */     this.gunModel['ʶ'] = new ModelRendererTurbo(this, 833, 273, this.textureX, this.textureY);
/* 2253 */     this.gunModel['ʷ'] = new ModelRendererTurbo(this, 377, 449, this.textureX, this.textureY);
/* 2254 */     this.gunModel['ʸ'] = new ModelRendererTurbo(this, 73, 433, this.textureX, this.textureY);
/* 2255 */     this.gunModel['ʹ'] = new ModelRendererTurbo(this, 345, 137, this.textureX, this.textureY);
/* 2256 */     this.gunModel['ʺ'] = new ModelRendererTurbo(this, 825, 425, this.textureX, this.textureY);
/* 2257 */     this.gunModel['ʻ'] = new ModelRendererTurbo(this, 745, 441, this.textureX, this.textureY);
/* 2258 */     this.gunModel['ʼ'] = new ModelRendererTurbo(this, 433, 137, this.textureX, this.textureY);
/* 2259 */     this.gunModel['ʽ'] = new ModelRendererTurbo(this, 481, 449, this.textureX, this.textureY);
/* 2260 */     this.gunModel['ʾ'] = new ModelRendererTurbo(this, 513, 449, this.textureX, this.textureY);
/* 2261 */     this.gunModel['ʿ'] = new ModelRendererTurbo(this, 617, 449, this.textureX, this.textureY);
/* 2262 */     this.gunModel['ˀ'] = new ModelRendererTurbo(this, 97, 433, this.textureX, this.textureY);
/* 2263 */     this.gunModel['ˁ'] = new ModelRendererTurbo(this, 937, 137, this.textureX, this.textureY);
/* 2264 */     this.gunModel['˂'] = new ModelRendererTurbo(this, 145, 145, this.textureX, this.textureY);
/* 2265 */     this.gunModel['˃'] = new ModelRendererTurbo(this, 393, 169, this.textureX, this.textureY);
/* 2266 */     this.gunModel['˄'] = new ModelRendererTurbo(this, 113, 193, this.textureX, this.textureY);
/* 2267 */     this.gunModel['˅'] = new ModelRendererTurbo(this, 817, 201, this.textureX, this.textureY);
/*      */     
/* 2269 */     this.gunModel['Ǵ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2270 */     this.gunModel['Ǵ'].setRotationPoint(-104.0F, 8.0F, 0.0F);
/*      */     
/* 2272 */     this.gunModel['ǵ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 8, 20, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2273 */     this.gunModel['ǵ'].setRotationPoint(-126.0F, 22.0F, -2.0F);
/*      */     
/* 2275 */     this.gunModel['Ƕ'].addShapeBox(86.0F, -60.0F, -8.0F, 21, 10, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2276 */     this.gunModel['Ƕ'].setRotationPoint(-124.0F, 20.0F, 0.0F);
/*      */     
/* 2278 */     this.gunModel['Ƿ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 16, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2279 */     this.gunModel['Ƿ'].setRotationPoint(-126.0F, 17.0F, 0.0F);
/*      */     
/* 2281 */     this.gunModel['Ǹ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 16, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2282 */     this.gunModel['Ǹ'].setRotationPoint(-124.0F, 14.0F, 0.0F);
/*      */     
/* 2284 */     this.gunModel['ǹ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 18, 0.0F, -6.0F, 0.0F, -2.0F, 6.0F, 0.0F, -2.0F, 6.0F, 0.0F, -2.0F, -6.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2285 */     this.gunModel['ǹ'].setRotationPoint(-120.0F, 11.0F, -1.0F);
/*      */     
/* 2287 */     this.gunModel['Ǻ'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 4, 18, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2288 */     this.gunModel['Ǻ'].setRotationPoint(-112.0F, 8.0F, -1.0F);
/*      */     
/* 2290 */     this.gunModel['ǻ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 18, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2291 */     this.gunModel['ǻ'].setRotationPoint(-114.0F, 9.0F, -1.0F);
/*      */     
/* 2293 */     this.gunModel['Ǽ'].addShapeBox(86.0F, -60.0F, -8.0F, 21, 3, 16, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2294 */     this.gunModel['Ǽ'].setRotationPoint(-124.0F, 17.0F, 0.0F);
/*      */     
/* 2296 */     this.gunModel['ǽ'].addShapeBox(86.0F, -60.0F, -8.0F, 19, 3, 16, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2297 */     this.gunModel['ǽ'].setRotationPoint(-122.0F, 14.0F, 0.0F);
/*      */     
/* 2299 */     this.gunModel['Ǿ'].addShapeBox(86.0F, -60.0F, -8.0F, 60, 35, 2, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2300 */     this.gunModel['Ǿ'].setRotationPoint(-169.0F, 10.0F, -1.0F);
/*      */     
/* 2302 */     this.gunModel['ǿ'].addShapeBox(86.0F, -60.0F, -8.0F, 54, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2303 */     this.gunModel['ǿ'].setRotationPoint(-223.0F, 29.0F, -1.0F);
/*      */     
/* 2305 */     this.gunModel['Ȁ'].addShapeBox(86.0F, -60.0F, -8.0F, 60, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2306 */     this.gunModel['Ȁ'].setRotationPoint(-229.0F, 41.0F, -1.0F);
/*      */     
/* 2308 */     this.gunModel['ȁ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 10, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2309 */     this.gunModel['ȁ'].setRotationPoint(-176.0F, 31.0F, -1.0F);
/*      */     
/* 2311 */     this.gunModel['Ȃ'].addShapeBox(86.0F, -60.0F, -8.0F, 9, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2312 */     this.gunModel['Ȃ'].setRotationPoint(-229.0F, 31.0F, -1.0F);
/*      */     
/* 2314 */     this.gunModel['ȃ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2315 */     this.gunModel['ȃ'].setRotationPoint(-187.5F, 33.0F, -1.0F);
/*      */     
/* 2317 */     this.gunModel['Ȅ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2318 */     this.gunModel['Ȅ'].setRotationPoint(-199.5F, 33.0F, -1.0F);
/*      */     
/* 2320 */     this.gunModel['ȅ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2321 */     this.gunModel['ȅ'].setRotationPoint(-211.5F, 33.0F, -1.0F);
/*      */     
/* 2323 */     this.gunModel['Ȇ'].addShapeBox(86.0F, -60.0F, -8.0F, 44, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2324 */     this.gunModel['Ȇ'].setRotationPoint(-219.5F, 31.0F, -1.0F);
/*      */     
/* 2326 */     this.gunModel['ȇ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2327 */     this.gunModel['ȇ'].setRotationPoint(144.0F, 4.5F, 7.0F);
/*      */     
/* 2329 */     this.gunModel['Ȉ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2330 */     this.gunModel['Ȉ'].setRotationPoint(-195.5F, 33.0F, -1.0F);
/*      */     
/* 2332 */     this.gunModel['ȉ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2333 */     this.gunModel['ȉ'].setRotationPoint(-195.5F, 39.0F, -1.0F);
/*      */     
/* 2335 */     this.gunModel['Ȋ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2336 */     this.gunModel['Ȋ'].setRotationPoint(-189.5F, 33.0F, -1.0F);
/*      */     
/* 2338 */     this.gunModel['ȋ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2339 */     this.gunModel['ȋ'].setRotationPoint(-189.5F, 39.0F, -1.0F);
/*      */     
/* 2341 */     this.gunModel['Ȍ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2342 */     this.gunModel['Ȍ'].setRotationPoint(-207.5F, 33.0F, -1.0F);
/*      */     
/* 2344 */     this.gunModel['ȍ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2345 */     this.gunModel['ȍ'].setRotationPoint(-207.5F, 39.0F, -1.0F);
/*      */     
/* 2347 */     this.gunModel['Ȏ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2348 */     this.gunModel['Ȏ'].setRotationPoint(-201.5F, 33.0F, -1.0F);
/*      */     
/* 2350 */     this.gunModel['ȏ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2351 */     this.gunModel['ȏ'].setRotationPoint(-201.5F, 39.0F, -1.0F);
/*      */     
/* 2353 */     this.gunModel['Ȑ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2354 */     this.gunModel['Ȑ'].setRotationPoint(-219.5F, 33.0F, -1.0F);
/*      */     
/* 2356 */     this.gunModel['ȑ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2357 */     this.gunModel['ȑ'].setRotationPoint(-219.5F, 39.0F, -1.0F);
/*      */     
/* 2359 */     this.gunModel['Ȓ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2360 */     this.gunModel['Ȓ'].setRotationPoint(-213.5F, 33.0F, -1.0F);
/*      */     
/* 2362 */     this.gunModel['ȓ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2363 */     this.gunModel['ȓ'].setRotationPoint(-213.5F, 39.0F, -1.0F);
/*      */     
/* 2365 */     this.gunModel['Ȕ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2366 */     this.gunModel['Ȕ'].setRotationPoint(-183.5F, 33.0F, -1.0F);
/*      */     
/* 2368 */     this.gunModel['ȕ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2369 */     this.gunModel['ȕ'].setRotationPoint(-183.5F, 39.0F, -1.0F);
/*      */     
/* 2371 */     this.gunModel['Ȗ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2372 */     this.gunModel['Ȗ'].setRotationPoint(-177.5F, 33.0F, -1.0F);
/*      */     
/* 2374 */     this.gunModel['ȗ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2375 */     this.gunModel['ȗ'].setRotationPoint(-177.5F, 39.0F, -1.0F);
/*      */     
/* 2377 */     this.gunModel['Ș'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 7, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2378 */     this.gunModel['Ș'].setRotationPoint(-90.0F, 42.0F, 4.5F);
/*      */     
/* 2380 */     this.gunModel['ș'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2381 */     this.gunModel['ș'].setRotationPoint(-93.0F, 39.0F, 4.5F);
/*      */     
/* 2383 */     this.gunModel['Ț'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 7, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2384 */     this.gunModel['Ț'].setRotationPoint(-92.0F, 36.0F, 4.5F);
/*      */     
/* 2386 */     this.gunModel['ț'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 7, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2387 */     this.gunModel['ț'].setRotationPoint(-93.0F, 34.0F, 4.5F);
/*      */     
/* 2389 */     this.gunModel['Ȝ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2390 */     this.gunModel['Ȝ'].setRotationPoint(-90.0F, 46.0F, 4.5F);
/*      */     
/* 2392 */     this.gunModel['ȝ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 5, 4, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2393 */     this.gunModel['ȝ'].setRotationPoint(-87.0F, 34.0F, 6.0F);
/*      */     
/* 2395 */     this.gunModel['Ȟ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2396 */     this.gunModel['Ȟ'].setRotationPoint(-87.0F, 39.0F, 6.0F);
/*      */     
/* 2398 */     this.gunModel['ȟ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2399 */     this.gunModel['ȟ'].setRotationPoint(-86.5F, 41.0F, 6.0F);
/*      */     
/* 2401 */     this.gunModel['Ƞ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2402 */     this.gunModel['Ƞ'].setRotationPoint(-86.5F, 44.0F, 6.0F);
/*      */     
/* 2404 */     this.gunModel['ȡ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2405 */     this.gunModel['ȡ'].setRotationPoint(-86.0F, 46.0F, 6.0F);
/*      */     
/* 2407 */     this.gunModel['Ȣ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2408 */     this.gunModel['Ȣ'].setRotationPoint(-87.0F, 46.0F, 4.5F);
/*      */     
/* 2410 */     this.gunModel['ȣ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2411 */     this.gunModel['ȣ'].setRotationPoint(-81.0F, 50.0F, 4.5F);
/*      */     
/* 2413 */     this.gunModel['Ȥ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2414 */     this.gunModel['Ȥ'].setRotationPoint(-79.0F, 51.0F, 4.5F);
/*      */     
/* 2416 */     this.gunModel['ȥ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 2, 7, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 2417 */     this.gunModel['ȥ'].setRotationPoint(-73.0F, 50.0F, 4.5F);
/*      */     
/* 2419 */     this.gunModel['Ȧ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2420 */     this.gunModel['Ȧ'].setRotationPoint(-72.0F, 50.5F, 4.5F);
/*      */     
/* 2422 */     this.gunModel['ȧ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2423 */     this.gunModel['ȧ'].setRotationPoint(-69.0F, 47.5F, 4.5F);
/*      */     
/* 2425 */     this.gunModel['Ȩ'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2426 */     this.gunModel['Ȩ'].setRotationPoint(-67.0F, 44.5F, 4.5F);
/*      */     
/* 2428 */     this.gunModel['ȩ'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 11, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2429 */     this.gunModel['ȩ'].setRotationPoint(-62.0F, 33.5F, 4.5F);
/*      */     
/* 2431 */     this.gunModel['Ȫ'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 9, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 2432 */     this.gunModel['Ȫ'].setRotationPoint(-57.0F, 33.5F, 4.5F);
/*      */     
/* 2434 */     this.gunModel['ȫ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 2435 */     this.gunModel['ȫ'].setRotationPoint(-52.0F, 33.5F, 4.5F);
/*      */     
/* 2437 */     this.gunModel['Ȭ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2438 */     this.gunModel['Ȭ'].setRotationPoint(-65.0F, 33.5F, 4.5F);
/*      */     
/* 2440 */     this.gunModel['ȭ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 4, 7, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2441 */     this.gunModel['ȭ'].setRotationPoint(-68.0F, 40.5F, 4.5F);
/*      */     
/* 2443 */     this.gunModel['Ȯ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 2444 */     this.gunModel['Ȯ'].setRotationPoint(-50.0F, 33.5F, 4.5F);
/*      */     
/* 2446 */     this.gunModel['ȯ'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2447 */     this.gunModel['ȯ'].setRotationPoint(-70.0F, 34.5F, 11.0F);
/*      */     
/* 2449 */     this.gunModel['Ȱ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2450 */     this.gunModel['Ȱ'].setRotationPoint(-72.0F, 34.5F, 11.0F);
/*      */     
/* 2452 */     this.gunModel['ȱ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2453 */     this.gunModel['ȱ'].setRotationPoint(-71.0F, 39.5F, 11.0F);
/*      */     
/* 2455 */     this.gunModel['Ȳ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2456 */     this.gunModel['Ȳ'].setRotationPoint(-71.0F, 40.5F, 11.0F);
/*      */     
/* 2458 */     this.gunModel['ȳ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2459 */     this.gunModel['ȳ'].setRotationPoint(-71.0F, 42.5F, 11.0F);
/*      */     
/* 2461 */     this.gunModel['ȴ'].addShapeBox(86.0F, -60.0F, -8.0F, 9, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2462 */     this.gunModel['ȴ'].setRotationPoint(-72.0F, 33.5F, 11.0F);
/*      */     
/* 2464 */     this.gunModel['ȵ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2465 */     this.gunModel['ȵ'].setRotationPoint(-65.0F, 34.5F, 11.0F);
/*      */     
/* 2467 */     this.gunModel['ȶ'].addShapeBox(86.0F, -60.0F, -8.0F, 10, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2468 */     this.gunModel['ȶ'].setRotationPoint(-52.0F, 34.0F, 2.5F);
/*      */     
/* 2470 */     this.gunModel['ȷ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2471 */     this.gunModel['ȷ'].setRotationPoint(-42.0F, 34.0F, 2.5F);
/*      */     
/* 2473 */     this.gunModel['ȸ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 2474 */     this.gunModel['ȸ'].setRotationPoint(-53.0F, 34.0F, 2.5F);
/*      */     
/* 2476 */     this.gunModel['ȹ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2477 */     this.gunModel['ȹ'].setRotationPoint(-109.0F, 10.0F, -1.0F);
/*      */     
/* 2479 */     this.gunModel['Ⱥ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2480 */     this.gunModel['Ⱥ'].setRotationPoint(-105.0F, 9.0F, -1.0F);
/*      */     
/* 2482 */     this.gunModel['Ȼ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2483 */     this.gunModel['Ȼ'].setRotationPoint(-101.0F, 13.0F, -1.0F);
/*      */     
/* 2485 */     this.gunModel['ȼ'].addShapeBox(86.0F, -60.0F, -8.0F, 58, 23, 1, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -22.0F, 0.0F, 0.0F, -22.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2486 */     this.gunModel['ȼ'].setRotationPoint(-167.0F, 12.0F, -1.5F);
/*      */     
/* 2488 */     this.gunModel['Ƚ'].addShapeBox(86.0F, -60.0F, -8.0F, 58, 23, 1, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2489 */     this.gunModel['Ƚ'].setRotationPoint(-167.0F, 20.0F, -1.5F);
/*      */     
/* 2491 */     this.gunModel['Ⱦ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2492 */     this.gunModel['Ⱦ'].setRotationPoint(-169.0F, 39.0F, -1.5F);
/*      */     
/* 2494 */     this.gunModel['ȿ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 2495 */     this.gunModel['ȿ'].setRotationPoint(-169.0F, 31.0F, -1.5F);
/*      */     
/* 2497 */     this.gunModel['ɀ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 6, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2498 */     this.gunModel['ɀ'].setRotationPoint(-170.0F, 33.0F, -1.5F);
/*      */     
/* 2500 */     this.gunModel['Ɂ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2501 */     this.gunModel['Ɂ'].setRotationPoint(-105.0F, 19.0F, -1.5F);
/*      */     
/* 2503 */     this.gunModel['ɂ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2504 */     this.gunModel['ɂ'].setRotationPoint(-105.0F, 11.0F, -1.5F);
/*      */     
/* 2506 */     this.gunModel['Ƀ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2507 */     this.gunModel['Ƀ'].setRotationPoint(-109.0F, 11.0F, -1.5F);
/*      */     
/* 2509 */     this.gunModel['Ʉ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2510 */     this.gunModel['Ʉ'].setRotationPoint(-109.0F, 20.0F, -1.5F);
/*      */     
/* 2512 */     this.gunModel['Ʌ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2513 */     this.gunModel['Ʌ'].setRotationPoint(-102.0F, 12.5F, -1.5F);
/*      */     
/* 2515 */     this.gunModel['Ɇ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 2516 */     this.gunModel['Ɇ'].setRotationPoint(-103.0F, 14.5F, -1.5F);
/*      */     
/* 2518 */     this.gunModel['ɇ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2519 */     this.gunModel['ɇ'].setRotationPoint(-169.0F, 35.0F, -1.5F);
/*      */     
/* 2521 */     this.gunModel['Ɉ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2522 */     this.gunModel['Ɉ'].setRotationPoint(-169.0F, 36.0F, -1.5F);
/*      */     
/* 2524 */     this.gunModel['ɉ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2525 */     this.gunModel['ɉ'].setRotationPoint(-103.0F, 16.5F, -1.5F);
/*      */     
/* 2527 */     this.gunModel['Ɋ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2528 */     this.gunModel['Ɋ'].setRotationPoint(-102.7F, 27.85F, -1.5F);
/* 2529 */     this.gunModel['Ɋ'].rotateAngleZ = 0.17453294F;
/*      */     
/* 2531 */     this.gunModel['ɋ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2532 */     this.gunModel['ɋ'].setRotationPoint(-102.35F, 29.8F, -1.5F);
/* 2533 */     this.gunModel['ɋ'].rotateAngleZ = 0.17453294F;
/*      */     
/* 2535 */     this.gunModel['Ɍ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2536 */     this.gunModel['Ɍ'].setRotationPoint(-102.0F, 31.75F, -1.5F);
/* 2537 */     this.gunModel['Ɍ'].rotateAngleZ = 0.17453294F;
/*      */     
/* 2539 */     this.gunModel['ɍ'].addShapeBox(86.0F, -60.0F, -8.0F, 60, 35, 2, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2540 */     this.gunModel['ɍ'].setRotationPoint(-169.0F, 10.0F, 15.0F);
/*      */     
/* 2542 */     this.gunModel['Ɏ'].addShapeBox(86.0F, -60.0F, -8.0F, 54, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2543 */     this.gunModel['Ɏ'].setRotationPoint(-223.0F, 29.0F, 15.0F);
/*      */     
/* 2545 */     this.gunModel['ɏ'].addShapeBox(86.0F, -60.0F, -8.0F, 60, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2546 */     this.gunModel['ɏ'].setRotationPoint(-229.0F, 41.0F, 15.0F);
/*      */     
/* 2548 */     this.gunModel['ɐ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 10, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2549 */     this.gunModel['ɐ'].setRotationPoint(-176.0F, 31.0F, 15.0F);
/*      */     
/* 2551 */     this.gunModel['ɑ'].addShapeBox(86.0F, -60.0F, -8.0F, 9, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2552 */     this.gunModel['ɑ'].setRotationPoint(-229.0F, 31.0F, 15.0F);
/*      */     
/* 2554 */     this.gunModel['ɒ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2555 */     this.gunModel['ɒ'].setRotationPoint(-187.5F, 33.0F, 15.0F);
/*      */     
/* 2557 */     this.gunModel['ɓ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2558 */     this.gunModel['ɓ'].setRotationPoint(-199.5F, 33.0F, 15.0F);
/*      */     
/* 2560 */     this.gunModel['ɔ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2561 */     this.gunModel['ɔ'].setRotationPoint(-211.5F, 33.0F, 15.0F);
/*      */     
/* 2563 */     this.gunModel['ɕ'].addShapeBox(86.0F, -60.0F, -8.0F, 44, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2564 */     this.gunModel['ɕ'].setRotationPoint(-219.5F, 31.0F, 15.0F);
/*      */     
/* 2566 */     this.gunModel['ɖ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2567 */     this.gunModel['ɖ'].setRotationPoint(-195.5F, 33.0F, 15.0F);
/*      */     
/* 2569 */     this.gunModel['ɗ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2570 */     this.gunModel['ɗ'].setRotationPoint(-195.5F, 39.0F, 15.0F);
/*      */     
/* 2572 */     this.gunModel['ɘ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2573 */     this.gunModel['ɘ'].setRotationPoint(-189.5F, 33.0F, 15.0F);
/*      */     
/* 2575 */     this.gunModel['ə'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2576 */     this.gunModel['ə'].setRotationPoint(-189.5F, 39.0F, 15.0F);
/*      */     
/* 2578 */     this.gunModel['ɚ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2579 */     this.gunModel['ɚ'].setRotationPoint(-207.5F, 33.0F, 15.0F);
/*      */     
/* 2581 */     this.gunModel['ɛ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2582 */     this.gunModel['ɛ'].setRotationPoint(-207.5F, 39.0F, 15.0F);
/*      */     
/* 2584 */     this.gunModel['ɜ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2585 */     this.gunModel['ɜ'].setRotationPoint(-201.5F, 33.0F, 15.0F);
/*      */     
/* 2587 */     this.gunModel['ɝ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2588 */     this.gunModel['ɝ'].setRotationPoint(-201.5F, 39.0F, 15.0F);
/*      */     
/* 2590 */     this.gunModel['ɞ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2591 */     this.gunModel['ɞ'].setRotationPoint(-219.5F, 33.0F, 15.0F);
/*      */     
/* 2593 */     this.gunModel['ɟ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2594 */     this.gunModel['ɟ'].setRotationPoint(-219.5F, 39.0F, 15.0F);
/*      */     
/* 2596 */     this.gunModel['ɠ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2597 */     this.gunModel['ɠ'].setRotationPoint(-213.5F, 33.0F, 15.0F);
/*      */     
/* 2599 */     this.gunModel['ɡ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2600 */     this.gunModel['ɡ'].setRotationPoint(-213.5F, 39.0F, 15.0F);
/*      */     
/* 2602 */     this.gunModel['ɢ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2603 */     this.gunModel['ɢ'].setRotationPoint(-183.5F, 33.0F, 15.0F);
/*      */     
/* 2605 */     this.gunModel['ɣ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2606 */     this.gunModel['ɣ'].setRotationPoint(-183.5F, 39.0F, 15.0F);
/*      */     
/* 2608 */     this.gunModel['ɤ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2609 */     this.gunModel['ɤ'].setRotationPoint(-177.5F, 33.0F, 15.0F);
/*      */     
/* 2611 */     this.gunModel['ɥ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2612 */     this.gunModel['ɥ'].setRotationPoint(-177.5F, 39.0F, 15.0F);
/*      */     
/* 2614 */     this.gunModel['ɦ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2615 */     this.gunModel['ɦ'].setRotationPoint(-109.0F, 10.0F, 15.0F);
/*      */     
/* 2617 */     this.gunModel['ɧ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2618 */     this.gunModel['ɧ'].setRotationPoint(-105.0F, 9.0F, 15.0F);
/*      */     
/* 2620 */     this.gunModel['ɨ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2621 */     this.gunModel['ɨ'].setRotationPoint(-101.0F, 13.0F, 15.0F);
/*      */     
/* 2623 */     this.gunModel['ɩ'].addShapeBox(86.0F, -60.0F, -8.0F, 58, 23, 1, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -22.0F, 0.0F, 0.0F, -22.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2624 */     this.gunModel['ɩ'].setRotationPoint(-167.0F, 12.0F, 17.5F);
/*      */     
/* 2626 */     this.gunModel['ɪ'].addShapeBox(86.0F, -60.0F, -8.0F, 58, 23, 1, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2627 */     this.gunModel['ɪ'].setRotationPoint(-167.0F, 20.0F, 17.5F);
/*      */     
/* 2629 */     this.gunModel['ɫ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2630 */     this.gunModel['ɫ'].setRotationPoint(-169.0F, 39.0F, 17.5F);
/*      */     
/* 2632 */     this.gunModel['ɬ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 2633 */     this.gunModel['ɬ'].setRotationPoint(-169.0F, 31.0F, 17.5F);
/*      */     
/* 2635 */     this.gunModel['ɭ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 6, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2636 */     this.gunModel['ɭ'].setRotationPoint(-170.0F, 33.0F, 17.5F);
/*      */     
/* 2638 */     this.gunModel['ɮ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2639 */     this.gunModel['ɮ'].setRotationPoint(-105.0F, 19.0F, 17.5F);
/*      */     
/* 2641 */     this.gunModel['ɯ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2642 */     this.gunModel['ɯ'].setRotationPoint(-105.0F, 11.0F, 17.5F);
/*      */     
/* 2644 */     this.gunModel['ɰ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2645 */     this.gunModel['ɰ'].setRotationPoint(-109.0F, 11.0F, 17.5F);
/*      */     
/* 2647 */     this.gunModel['ɱ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2648 */     this.gunModel['ɱ'].setRotationPoint(-109.0F, 20.0F, 17.5F);
/*      */     
/* 2650 */     this.gunModel['ɲ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2651 */     this.gunModel['ɲ'].setRotationPoint(-102.0F, 12.5F, 17.5F);
/*      */     
/* 2653 */     this.gunModel['ɳ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 2654 */     this.gunModel['ɳ'].setRotationPoint(-103.0F, 14.5F, 17.5F);
/*      */     
/* 2656 */     this.gunModel['ɴ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2657 */     this.gunModel['ɴ'].setRotationPoint(-169.0F, 35.0F, 17.5F);
/*      */     
/* 2659 */     this.gunModel['ɵ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2660 */     this.gunModel['ɵ'].setRotationPoint(-169.0F, 36.0F, 17.5F);
/*      */     
/* 2662 */     this.gunModel['ɶ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2663 */     this.gunModel['ɶ'].setRotationPoint(-103.0F, 16.5F, 17.5F);
/*      */     
/* 2665 */     this.gunModel['ɷ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2666 */     this.gunModel['ɷ'].setRotationPoint(-102.7F, 27.85F, 17.5F);
/* 2667 */     this.gunModel['ɷ'].rotateAngleZ = 0.17453294F;
/*      */     
/* 2669 */     this.gunModel['ɸ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2670 */     this.gunModel['ɸ'].setRotationPoint(-102.35F, 29.8F, 17.5F);
/* 2671 */     this.gunModel['ɸ'].rotateAngleZ = 0.17453294F;
/*      */     
/* 2673 */     this.gunModel['ɹ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2674 */     this.gunModel['ɹ'].setRotationPoint(-102.0F, 31.75F, 17.5F);
/* 2675 */     this.gunModel['ɹ'].rotateAngleZ = 0.17453294F;
/*      */     
/* 2677 */     this.gunModel['ɺ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 8, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2678 */     this.gunModel['ɺ'].setRotationPoint(-242.0F, 33.0F, -2.0F);
/*      */     
/* 2680 */     this.gunModel['ɻ'].addShapeBox(86.0F, -60.0F, -8.0F, 12, 2, 20, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2681 */     this.gunModel['ɻ'].setRotationPoint(-242.0F, 31.0F, -2.0F);
/*      */     
/* 2683 */     this.gunModel['ɼ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 10, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2684 */     this.gunModel['ɼ'].setRotationPoint(-230.0F, 33.0F, -2.0F);
/*      */     
/* 2686 */     this.gunModel['ɽ'].addShapeBox(86.0F, -60.0F, -8.0F, 9, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2687 */     this.gunModel['ɽ'].setRotationPoint(-239.0F, 33.0F, -2.0F);
/*      */     
/* 2689 */     this.gunModel['ɾ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2690 */     this.gunModel['ɾ'].setRotationPoint(-233.0F, 34.0F, -2.0F);
/*      */     
/* 2692 */     this.gunModel['ɿ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2693 */     this.gunModel['ɿ'].setRotationPoint(-231.0F, 34.0F, -2.0F);
/*      */     
/* 2695 */     this.gunModel['ʀ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2696 */     this.gunModel['ʀ'].setRotationPoint(-231.0F, 36.0F, -2.0F);
/*      */     
/* 2698 */     this.gunModel['ʁ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2699 */     this.gunModel['ʁ'].setRotationPoint(-233.0F, 36.0F, -2.0F);
/*      */     
/* 2701 */     this.gunModel['ʂ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 38, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2702 */     this.gunModel['ʂ'].setRotationPoint(-233.0F, 37.0F, -2.0F);
/*      */     
/* 2704 */     this.gunModel['ʃ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 14, 20, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2705 */     this.gunModel['ʃ'].setRotationPoint(-242.0F, 41.0F, -2.0F);
/*      */     
/* 2707 */     this.gunModel['ʄ'].addShapeBox(86.0F, -60.0F, -8.0F, 9, 18, 20, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 2708 */     this.gunModel['ʄ'].setRotationPoint(-242.0F, 55.0F, -2.0F);
/*      */     
/* 2710 */     this.gunModel['ʅ'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 2, 20, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2711 */     this.gunModel['ʅ'].setRotationPoint(-241.0F, 73.0F, -2.0F);
/*      */     
/* 2713 */     this.gunModel['ʆ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2714 */     this.gunModel['ʆ'].setRotationPoint(-229.0F, 29.0F, 15.0F);
/*      */     
/* 2716 */     this.gunModel['ʇ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2717 */     this.gunModel['ʇ'].setRotationPoint(-229.0F, 29.0F, -1.0F);
/*      */     
/* 2719 */     this.gunModel['ʈ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 10, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2720 */     this.gunModel['ʈ'].setRotationPoint(-230.0F, 65.0F, -2.0F);
/*      */     
/* 2722 */     this.gunModel['ʉ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 38, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2723 */     this.gunModel['ʉ'].setRotationPoint(-233.0F, 37.0F, 14.0F);
/*      */     
/* 2725 */     this.gunModel['ʊ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2726 */     this.gunModel['ʊ'].setRotationPoint(-230.0F, 43.0F, -2.0F);
/*      */     
/* 2728 */     this.gunModel['ʋ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2729 */     this.gunModel['ʋ'].setRotationPoint(-230.0F, 43.0F, 14.0F);
/*      */     
/* 2731 */     this.gunModel['ʌ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2732 */     this.gunModel['ʌ'].setRotationPoint(-230.0F, 59.0F, 2.0F);
/*      */     
/* 2734 */     this.gunModel['ʍ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2735 */     this.gunModel['ʍ'].setRotationPoint(-230.0F, 62.0F, 6.5F);
/*      */     
/* 2737 */     this.gunModel['ʎ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2738 */     this.gunModel['ʎ'].setRotationPoint(-230.0F, 62.0F, 9.5F);
/*      */     
/* 2740 */     this.gunModel['ʏ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2741 */     this.gunModel['ʏ'].setRotationPoint(-230.0F, 62.0F, 2.0F);
/*      */     
/* 2743 */     this.gunModel['ʐ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2744 */     this.gunModel['ʐ'].setRotationPoint(-230.0F, 62.0F, 8.5F);
/*      */     
/* 2746 */     this.gunModel['ʑ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2747 */     this.gunModel['ʑ'].setRotationPoint(-230.0F, 64.0F, 8.5F);
/*      */     
/* 2749 */     this.gunModel['ʒ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2750 */     this.gunModel['ʒ'].setRotationPoint(-230.0F, 64.0F, 6.5F);
/*      */     
/* 2752 */     this.gunModel['ʓ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2753 */     this.gunModel['ʓ'].setRotationPoint(-225.0F, 29.0F, 13.0F);
/*      */     
/* 2755 */     this.gunModel['ʔ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 2, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2756 */     this.gunModel['ʔ'].setRotationPoint(-228.0F, 29.0F, 13.0F);
/*      */     
/* 2758 */     this.gunModel['ʕ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2759 */     this.gunModel['ʕ'].setRotationPoint(-228.0F, 29.0F, 1.0F);
/*      */     
/* 2761 */     this.gunModel['ʖ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
/* 2762 */     this.gunModel['ʖ'].setRotationPoint(-225.0F, 29.0F, 1.0F);
/*      */     
/* 2764 */     this.gunModel['ʗ'].addShapeBox(86.0F, -60.0F, -8.0F, 32, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2765 */     this.gunModel['ʗ'].setRotationPoint(-228.0F, 36.0F, 6.5F);
/*      */     
/* 2767 */     this.gunModel['ʘ'].addShapeBox(86.0F, -60.0F, -8.0F, 32, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2768 */     this.gunModel['ʘ'].setRotationPoint(-228.0F, 35.0F, 6.5F);
/*      */     
/* 2770 */     this.gunModel['ʙ'].addShapeBox(86.0F, -60.0F, -8.0F, 32, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2771 */     this.gunModel['ʙ'].setRotationPoint(-228.0F, 34.0F, 6.5F);
/*      */     
/* 2773 */     this.gunModel['ʚ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2774 */     this.gunModel['ʚ'].setRotationPoint(-195.5F, 34.0F, 6.5F);
/*      */     
/* 2776 */     this.gunModel['ʛ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2777 */     this.gunModel['ʛ'].setRotationPoint(-195.5F, 35.0F, 6.5F);
/*      */     
/* 2779 */     this.gunModel['ʜ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2780 */     this.gunModel['ʜ'].setRotationPoint(-195.5F, 36.0F, 6.5F);
/*      */     
/* 2782 */     this.gunModel['ʝ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2783 */     this.gunModel['ʝ'].setRotationPoint(-193.5F, 37.0F, 6.5F);
/*      */     
/* 2785 */     this.gunModel['ʞ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2786 */     this.gunModel['ʞ'].setRotationPoint(-193.5F, 36.0F, 6.5F);
/*      */     
/* 2788 */     this.gunModel['ʟ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2789 */     this.gunModel['ʟ'].setRotationPoint(-193.5F, 38.0F, 6.5F);
/*      */     
/* 2791 */     this.gunModel['ʠ'].addShapeBox(86.0F, -60.0F, -8.0F, 13, 17, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.1F, 0.0F, -6.0F, -0.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.15F, 0.0F, -6.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2792 */     this.gunModel['ʠ'].setRotationPoint(-169.0F, 26.0F, 1.0F);
/*      */     
/* 2794 */     this.gunModel['ʡ'].addShapeBox(86.0F, -60.0F, -8.0F, 13, 17, 2, 0.0F, 0.0F, -3.0F, 0.0F, -6.0F, -0.9F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -4.15F, 0.0F, 0.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2795 */     this.gunModel['ʡ'].setRotationPoint(-169.0F, 26.0F, 13.0F);
/*      */     
/* 2797 */     this.gunModel['ʢ'].addShapeBox(86.0F, -60.0F, -8.0F, 13, 17, 5, 0.0F, 0.0F, -3.0F, 0.0F, -13.0F, -2.9F, 0.0F, -6.0F, -0.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, -4.15F, 0.0F, -6.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2798 */     this.gunModel['ʢ'].setRotationPoint(-169.0F, 26.0F, 8.0F);
/*      */     
/* 2800 */     this.gunModel['ʣ'].addShapeBox(86.0F, -60.0F, -8.0F, 13, 17, 5, 0.0F, 0.0F, -3.0F, 0.0F, -6.0F, -0.9F, 0.0F, -13.0F, -2.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -4.15F, 0.0F, -12.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2801 */     this.gunModel['ʣ'].setRotationPoint(-169.0F, 26.0F, 3.0F);
/*      */     
/* 2803 */     this.gunModel['ʤ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2804 */     this.gunModel['ʤ'].setRotationPoint(-239.0F, 34.0F, 4.0F);
/*      */     
/* 2806 */     this.gunModel['ʥ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2807 */     this.gunModel['ʥ'].setRotationPoint(-237.0F, 34.0F, 4.0F);
/*      */     
/* 2809 */     this.gunModel['ʦ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2810 */     this.gunModel['ʦ'].setRotationPoint(-237.0F, 36.0F, 4.0F);
/*      */     
/* 2812 */     this.gunModel['ʧ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2813 */     this.gunModel['ʧ'].setRotationPoint(-239.0F, 36.0F, 4.0F);
/*      */     
/* 2815 */     this.gunModel['ʨ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2816 */     this.gunModel['ʨ'].setRotationPoint(-239.0F, 39.0F, 4.0F);
/*      */     
/* 2818 */     this.gunModel['ʩ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2819 */     this.gunModel['ʩ'].setRotationPoint(-237.0F, 39.0F, 4.0F);
/*      */     
/* 2821 */     this.gunModel['ʪ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2822 */     this.gunModel['ʪ'].setRotationPoint(-237.0F, 41.0F, 4.0F);
/*      */     
/* 2824 */     this.gunModel['ʫ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2825 */     this.gunModel['ʫ'].setRotationPoint(-239.0F, 41.0F, 4.0F);
/*      */     
/* 2827 */     this.gunModel['ʬ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 21, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2828 */     this.gunModel['ʬ'].setRotationPoint(-236.0F, 34.0F, -2.0F);
/*      */     
/* 2830 */     this.gunModel['ʭ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 13, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2831 */     this.gunModel['ʭ'].setRotationPoint(-239.0F, 42.0F, -2.0F);
/*      */     
/* 2833 */     this.gunModel['ʮ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2834 */     this.gunModel['ʮ'].setRotationPoint(-239.0F, 37.0F, -2.0F);
/*      */     
/* 2836 */     this.gunModel['ʯ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2837 */     this.gunModel['ʯ'].setRotationPoint(-239.0F, 34.0F, -2.0F);
/*      */     
/* 2839 */     this.gunModel['ʰ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2840 */     this.gunModel['ʰ'].setRotationPoint(-239.0F, 39.0F, -2.0F);
/*      */     
/* 2842 */     this.gunModel['ʱ'].addShapeBox(86.0F, -60.0F, -8.0F, 28, 19, 4, 0.0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2843 */     this.gunModel['ʱ'].setRotationPoint(-93.0F, 13.0F, 0.0F);
/*      */     
/* 2845 */     this.gunModel['ʲ'].addShapeBox(86.0F, -60.0F, -8.0F, 60, 11, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2846 */     this.gunModel['ʲ'].setRotationPoint(-65.0F, 21.0F, 0.0F);
/*      */     
/* 2848 */     this.gunModel['ʳ'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2849 */     this.gunModel['ʳ'].setRotationPoint(-65.0F, 13.0F, 0.0F);
/*      */     
/* 2851 */     this.gunModel['ʴ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 4, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2852 */     this.gunModel['ʴ'].setRotationPoint(-65.0F, 19.0F, 0.0F);
/*      */     
/* 2854 */     this.gunModel['ʵ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2855 */     this.gunModel['ʵ'].setRotationPoint(-65.0F, 16.0F, 0.0F);
/*      */     
/* 2857 */     this.gunModel['ʶ'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2858 */     this.gunModel['ʶ'].setRotationPoint(-11.0F, 13.0F, 0.0F);
/*      */     
/* 2860 */     this.gunModel['ʷ'].addShapeBox(86.0F, -60.0F, -8.0F, 38, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2861 */     this.gunModel['ʷ'].setRotationPoint(-43.0F, 9.0F, 4.0F);
/*      */     
/* 2863 */     this.gunModel['ʸ'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 4, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2864 */     this.gunModel['ʸ'].setRotationPoint(-12.0F, 9.0F, 0.0F);
/*      */     
/* 2866 */     this.gunModel['ʹ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2867 */     this.gunModel['ʹ'].setRotationPoint(-13.0F, 13.0F, 0.0F);
/*      */     
/* 2869 */     this.gunModel['ʺ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2870 */     this.gunModel['ʺ'].setRotationPoint(-43.0F, 9.0F, 0.0F);
/*      */     
/* 2872 */     this.gunModel['ʻ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2873 */     this.gunModel['ʻ'].setRotationPoint(-40.0F, 9.0F, 0.0F);
/*      */     
/* 2875 */     this.gunModel['ʼ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2876 */     this.gunModel['ʼ'].setRotationPoint(-45.0F, 13.0F, 0.0F);
/*      */     
/* 2878 */     this.gunModel['ʽ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2879 */     this.gunModel['ʽ'].setRotationPoint(-14.0F, 9.0F, 0.0F);
/*      */     
/* 2881 */     this.gunModel['ʾ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2882 */     this.gunModel['ʾ'].setRotationPoint(-17.0F, 9.0F, 0.0F);
/*      */     
/* 2884 */     this.gunModel['ʿ'].addShapeBox(86.0F, -60.0F, -8.0F, 20, 4, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 2885 */     this.gunModel['ʿ'].setRotationPoint(-37.0F, 9.0F, 0.0F);
/*      */     
/* 2887 */     this.gunModel['ˀ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2888 */     this.gunModel['ˀ'].setRotationPoint(-126.0F, 20.0F, -1.0F);
/*      */     
/* 2890 */     this.gunModel['ˁ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2891 */     this.gunModel['ˁ'].setRotationPoint(-104.0F, 8.0F, 1.0F);
/*      */     
/* 2893 */     this.gunModel['˂'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2894 */     this.gunModel['˂'].setRotationPoint(-104.0F, 8.0F, 10.0F);
/*      */     
/* 2896 */     this.gunModel['˃'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2897 */     this.gunModel['˃'].setRotationPoint(-14.5F, 30.0F, -1.0F);
/*      */     
/* 2899 */     this.gunModel['˄'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2900 */     this.gunModel['˄'].setRotationPoint(-14.5F, 29.0F, -1.0F);
/*      */     
/* 2902 */     this.gunModel['˅'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2903 */     this.gunModel['˅'].setRotationPoint(-14.5F, 28.0F, -1.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2908 */     this.ammoModel[0] = new ModelRendererTurbo(this, 833, 449, this.textureX, this.textureY);
/*      */     
/* 2910 */     this.ammoModel[0].addShapeBox(86.0F, -60.0F, -8.0F, 36, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2911 */     this.ammoModel[0].setRotationPoint(-43.0F, 23.0F, 3.0F);
/*      */   }
/*      */   
/*      */   private void initpumpModel_1()
/*      */   {
/* 2916 */     this.pumpModel[0] = new ModelRendererTurbo(this, 793, 265, this.textureX, this.textureY);
/* 2917 */     this.pumpModel[1] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 2918 */     this.pumpModel[2] = new ModelRendererTurbo(this, 929, 449, this.textureX, this.textureY);
/* 2919 */     this.pumpModel[3] = new ModelRendererTurbo(this, 105, 137, this.textureX, this.textureY);
/* 2920 */     this.pumpModel[4] = new ModelRendererTurbo(this, 1009, 265, this.textureX, this.textureY);
/* 2921 */     this.pumpModel[5] = new ModelRendererTurbo(this, 1009, 321, this.textureX, this.textureY);
/* 2922 */     this.pumpModel[6] = new ModelRendererTurbo(this, 721, 361, this.textureX, this.textureY);
/* 2923 */     this.pumpModel[7] = new ModelRendererTurbo(this, 345, 425, this.textureX, this.textureY);
/* 2924 */     this.pumpModel[8] = new ModelRendererTurbo(this, 777, 441, this.textureX, this.textureY);
/* 2925 */     this.pumpModel[9] = new ModelRendererTurbo(this, 545, 449, this.textureX, this.textureY);
/* 2926 */     this.pumpModel[10] = new ModelRendererTurbo(this, 689, 449, this.textureX, this.textureY);
/* 2927 */     this.pumpModel[11] = new ModelRendererTurbo(this, 705, 449, this.textureX, this.textureY);
/* 2928 */     this.pumpModel[12] = new ModelRendererTurbo(this, 721, 449, this.textureX, this.textureY);
/* 2929 */     this.pumpModel[13] = new ModelRendererTurbo(this, 1009, 449, this.textureX, this.textureY);
/* 2930 */     this.pumpModel[14] = new ModelRendererTurbo(this, 1017, 265, this.textureX, this.textureY);
/* 2931 */     this.pumpModel[15] = new ModelRendererTurbo(this, 705, 281, this.textureX, this.textureY);
/* 2932 */     this.pumpModel[16] = new ModelRendererTurbo(this, 961, 305, this.textureX, this.textureY);
/* 2933 */     this.pumpModel[17] = new ModelRendererTurbo(this, 929, 361, this.textureX, this.textureY);
/* 2934 */     this.pumpModel[18] = new ModelRendererTurbo(this, 409, 377, this.textureX, this.textureY);
/* 2935 */     this.pumpModel[19] = new ModelRendererTurbo(this, 753, 409, this.textureX, this.textureY);
/* 2936 */     this.pumpModel[20] = new ModelRendererTurbo(this, 889, 425, this.textureX, this.textureY);
/* 2937 */     this.pumpModel[21] = new ModelRendererTurbo(this, 561, 449, this.textureX, this.textureY);
/* 2938 */     this.pumpModel[22] = new ModelRendererTurbo(this, 1, 457, this.textureX, this.textureY);
/* 2939 */     this.pumpModel[23] = new ModelRendererTurbo(this, 9, 457, this.textureX, this.textureY);
/* 2940 */     this.pumpModel[24] = new ModelRendererTurbo(this, 17, 457, this.textureX, this.textureY);
/* 2941 */     this.pumpModel[25] = new ModelRendererTurbo(this, 25, 457, this.textureX, this.textureY);
/* 2942 */     this.pumpModel[26] = new ModelRendererTurbo(this, 33, 457, this.textureX, this.textureY);
/* 2943 */     this.pumpModel[27] = new ModelRendererTurbo(this, 41, 457, this.textureX, this.textureY);
/* 2944 */     this.pumpModel[28] = new ModelRendererTurbo(this, 121, 409, this.textureX, this.textureY);
/* 2945 */     this.pumpModel[29] = new ModelRendererTurbo(this, 657, 225, this.textureX, this.textureY);
/* 2946 */     this.pumpModel[30] = new ModelRendererTurbo(this, 241, 433, this.textureX, this.textureY);
/* 2947 */     this.pumpModel[31] = new ModelRendererTurbo(this, 57, 457, this.textureX, this.textureY);
/* 2948 */     this.pumpModel[32] = new ModelRendererTurbo(this, 73, 457, this.textureX, this.textureY);
/* 2949 */     this.pumpModel[33] = new ModelRendererTurbo(this, 89, 457, this.textureX, this.textureY);
/* 2950 */     this.pumpModel[34] = new ModelRendererTurbo(this, 105, 457, this.textureX, this.textureY);
/* 2951 */     this.pumpModel[35] = new ModelRendererTurbo(this, 113, 457, this.textureX, this.textureY);
/* 2952 */     this.pumpModel[36] = new ModelRendererTurbo(this, 129, 457, this.textureX, this.textureY);
/* 2953 */     this.pumpModel[37] = new ModelRendererTurbo(this, 145, 457, this.textureX, this.textureY);
/* 2954 */     this.pumpModel[38] = new ModelRendererTurbo(this, 161, 457, this.textureX, this.textureY);
/* 2955 */     this.pumpModel[39] = new ModelRendererTurbo(this, 177, 457, this.textureX, this.textureY);
/* 2956 */     this.pumpModel[40] = new ModelRendererTurbo(this, 193, 457, this.textureX, this.textureY);
/* 2957 */     this.pumpModel[41] = new ModelRendererTurbo(this, 209, 457, this.textureX, this.textureY);
/* 2958 */     this.pumpModel[42] = new ModelRendererTurbo(this, 225, 457, this.textureX, this.textureY);
/* 2959 */     this.pumpModel[43] = new ModelRendererTurbo(this, 241, 465, this.textureX, this.textureY);
/* 2960 */     this.pumpModel[44] = new ModelRendererTurbo(this, 257, 465, this.textureX, this.textureY);
/* 2961 */     this.pumpModel[45] = new ModelRendererTurbo(this, 737, 457, this.textureX, this.textureY);
/* 2962 */     this.pumpModel[46] = new ModelRendererTurbo(this, 273, 465, this.textureX, this.textureY);
/* 2963 */     this.pumpModel[47] = new ModelRendererTurbo(this, 281, 465, this.textureX, this.textureY);
/* 2964 */     this.pumpModel[48] = new ModelRendererTurbo(this, 289, 465, this.textureX, this.textureY);
/* 2965 */     this.pumpModel[49] = new ModelRendererTurbo(this, 297, 465, this.textureX, this.textureY);
/* 2966 */     this.pumpModel[50] = new ModelRendererTurbo(this, 305, 465, this.textureX, this.textureY);
/* 2967 */     this.pumpModel[51] = new ModelRendererTurbo(this, 313, 465, this.textureX, this.textureY);
/* 2968 */     this.pumpModel[52] = new ModelRendererTurbo(this, 321, 465, this.textureX, this.textureY);
/* 2969 */     this.pumpModel[53] = new ModelRendererTurbo(this, 329, 465, this.textureX, this.textureY);
/* 2970 */     this.pumpModel[54] = new ModelRendererTurbo(this, 337, 465, this.textureX, this.textureY);
/* 2971 */     this.pumpModel[55] = new ModelRendererTurbo(this, 345, 465, this.textureX, this.textureY);
/* 2972 */     this.pumpModel[56] = new ModelRendererTurbo(this, 353, 465, this.textureX, this.textureY);
/* 2973 */     this.pumpModel[57] = new ModelRendererTurbo(this, 361, 465, this.textureX, this.textureY);
/* 2974 */     this.pumpModel[58] = new ModelRendererTurbo(this, 745, 465, this.textureX, this.textureY);
/* 2975 */     this.pumpModel[59] = new ModelRendererTurbo(this, 761, 465, this.textureX, this.textureY);
/* 2976 */     this.pumpModel[60] = new ModelRendererTurbo(this, 777, 465, this.textureX, this.textureY);
/* 2977 */     this.pumpModel[61] = new ModelRendererTurbo(this, 793, 465, this.textureX, this.textureY);
/* 2978 */     this.pumpModel[62] = new ModelRendererTurbo(this, 809, 465, this.textureX, this.textureY);
/* 2979 */     this.pumpModel[63] = new ModelRendererTurbo(this, 929, 465, this.textureX, this.textureY);
/* 2980 */     this.pumpModel[64] = new ModelRendererTurbo(this, 945, 465, this.textureX, this.textureY);
/* 2981 */     this.pumpModel[65] = new ModelRendererTurbo(this, 961, 465, this.textureX, this.textureY);
/* 2982 */     this.pumpModel[66] = new ModelRendererTurbo(this, 977, 465, this.textureX, this.textureY);
/* 2983 */     this.pumpModel[67] = new ModelRendererTurbo(this, 993, 465, this.textureX, this.textureY);
/* 2984 */     this.pumpModel[68] = new ModelRendererTurbo(this, 369, 473, this.textureX, this.textureY);
/* 2985 */     this.pumpModel[69] = new ModelRendererTurbo(this, 385, 473, this.textureX, this.textureY);
/* 2986 */     this.pumpModel[70] = new ModelRendererTurbo(this, 401, 473, this.textureX, this.textureY);
/* 2987 */     this.pumpModel[71] = new ModelRendererTurbo(this, 417, 473, this.textureX, this.textureY);
/* 2988 */     this.pumpModel[72] = new ModelRendererTurbo(this, 433, 473, this.textureX, this.textureY);
/* 2989 */     this.pumpModel[73] = new ModelRendererTurbo(this, 937, 225, this.textureX, this.textureY);
/* 2990 */     this.pumpModel[74] = new ModelRendererTurbo(this, 705, 233, this.textureX, this.textureY);
/* 2991 */     this.pumpModel[75] = new ModelRendererTurbo(this, 449, 473, this.textureX, this.textureY);
/* 2992 */     this.pumpModel[76] = new ModelRendererTurbo(this, 193, 137, this.textureX, this.textureY);
/* 2993 */     this.pumpModel[77] = new ModelRendererTurbo(this, 529, 473, this.textureX, this.textureY);
/* 2994 */     this.pumpModel[78] = new ModelRendererTurbo(this, 585, 473, this.textureX, this.textureY);
/* 2995 */     this.pumpModel[79] = new ModelRendererTurbo(this, 601, 473, this.textureX, this.textureY);
/* 2996 */     this.pumpModel[80] = new ModelRendererTurbo(this, 617, 473, this.textureX, this.textureY);
/* 2997 */     this.pumpModel[81] = new ModelRendererTurbo(this, 633, 473, this.textureX, this.textureY);
/* 2998 */     this.pumpModel[82] = new ModelRendererTurbo(this, 649, 473, this.textureX, this.textureY);
/* 2999 */     this.pumpModel[83] = new ModelRendererTurbo(this, 665, 473, this.textureX, this.textureY);
/* 3000 */     this.pumpModel[84] = new ModelRendererTurbo(this, 681, 473, this.textureX, this.textureY);
/* 3001 */     this.pumpModel[85] = new ModelRendererTurbo(this, 697, 473, this.textureX, this.textureY);
/* 3002 */     this.pumpModel[86] = new ModelRendererTurbo(this, 713, 473, this.textureX, this.textureY);
/* 3003 */     this.pumpModel[87] = new ModelRendererTurbo(this, 825, 473, this.textureX, this.textureY);
/* 3004 */     this.pumpModel[88] = new ModelRendererTurbo(this, 841, 473, this.textureX, this.textureY);
/* 3005 */     this.pumpModel[89] = new ModelRendererTurbo(this, 857, 473, this.textureX, this.textureY);
/* 3006 */     this.pumpModel[90] = new ModelRendererTurbo(this, 873, 473, this.textureX, this.textureY);
/* 3007 */     this.pumpModel[91] = new ModelRendererTurbo(this, 889, 473, this.textureX, this.textureY);
/* 3008 */     this.pumpModel[92] = new ModelRendererTurbo(this, 81, 249, this.textureX, this.textureY);
/* 3009 */     this.pumpModel[93] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/* 3010 */     this.pumpModel[94] = new ModelRendererTurbo(this, 185, 249, this.textureX, this.textureY);
/* 3011 */     this.pumpModel[95] = new ModelRendererTurbo(this, 321, 249, this.textureX, this.textureY);
/* 3012 */     this.pumpModel[96] = new ModelRendererTurbo(this, 769, 297, this.textureX, this.textureY);
/* 3013 */     this.pumpModel[97] = new ModelRendererTurbo(this, 889, 273, this.textureX, this.textureY);
/* 3014 */     this.pumpModel[98] = new ModelRendererTurbo(this, 577, 377, this.textureX, this.textureY);
/* 3015 */     this.pumpModel[99] = new ModelRendererTurbo(this, 1, 481, this.textureX, this.textureY);
/* 3016 */     this.pumpModel[100] = new ModelRendererTurbo(this, 241, 441, this.textureX, this.textureY);
/* 3017 */     this.pumpModel[101] = new ModelRendererTurbo(this, 681, 409, this.textureX, this.textureY);
/* 3018 */     this.pumpModel[102] = new ModelRendererTurbo(this, 929, 273, this.textureX, this.textureY);
/* 3019 */     this.pumpModel[103] = new ModelRendererTurbo(this, 865, 249, this.textureX, this.textureY);
/* 3020 */     this.pumpModel[104] = new ModelRendererTurbo(this, 769, 305, this.textureX, this.textureY);
/* 3021 */     this.pumpModel[105] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/* 3022 */     this.pumpModel[106] = new ModelRendererTurbo(this, 873, 137, this.textureX, this.textureY);
/* 3023 */     this.pumpModel[107] = new ModelRendererTurbo(this, 25, 145, this.textureX, this.textureY);
/* 3024 */     this.pumpModel[108] = new ModelRendererTurbo(this, 65, 145, this.textureX, this.textureY);
/* 3025 */     this.pumpModel[109] = new ModelRendererTurbo(this, 265, 241, this.textureX, this.textureY);
/* 3026 */     this.pumpModel[110] = new ModelRendererTurbo(this, 641, 81, this.textureX, this.textureY);
/* 3027 */     this.pumpModel[111] = new ModelRendererTurbo(this, 553, 89, this.textureX, this.textureY);
/* 3028 */     this.pumpModel[112] = new ModelRendererTurbo(this, 121, 145, this.textureX, this.textureY);
/* 3029 */     this.pumpModel[113] = new ModelRendererTurbo(this, 233, 145, this.textureX, this.textureY);
/* 3030 */     this.pumpModel[114] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/* 3031 */     this.pumpModel[115] = new ModelRendererTurbo(this, 345, 145, this.textureX, this.textureY);
/* 3032 */     this.pumpModel[116] = new ModelRendererTurbo(this, 385, 145, this.textureX, this.textureY);
/* 3033 */     this.pumpModel[117] = new ModelRendererTurbo(this, 409, 145, this.textureX, this.textureY);
/* 3034 */     this.pumpModel[118] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/* 3035 */     this.pumpModel[119] = new ModelRendererTurbo(this, 473, 145, this.textureX, this.textureY);
/* 3036 */     this.pumpModel[120] = new ModelRendererTurbo(this, 201, 257, this.textureX, this.textureY);
/* 3037 */     this.pumpModel[121] = new ModelRendererTurbo(this, 529, 145, this.textureX, this.textureY);
/* 3038 */     this.pumpModel[122] = new ModelRendererTurbo(this, 297, 153, this.textureX, this.textureY);
/* 3039 */     this.pumpModel[123] = new ModelRendererTurbo(this, 553, 153, this.textureX, this.textureY);
/* 3040 */     this.pumpModel[124] = new ModelRendererTurbo(this, 577, 153, this.textureX, this.textureY);
/* 3041 */     this.pumpModel[125] = new ModelRendererTurbo(this, 617, 153, this.textureX, this.textureY);
/* 3042 */     this.pumpModel[126] = new ModelRendererTurbo(this, 721, 153, this.textureX, this.textureY);
/* 3043 */     this.pumpModel[127] = new ModelRendererTurbo(this, 961, 153, this.textureX, this.textureY);
/* 3044 */     this.pumpModel[''] = new ModelRendererTurbo(this, 985, 153, this.textureX, this.textureY);
/* 3045 */     this.pumpModel[''] = new ModelRendererTurbo(this, 761, 273, this.textureX, this.textureY);
/* 3046 */     this.pumpModel[''] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/* 3047 */     this.pumpModel[''] = new ModelRendererTurbo(this, 593, 89, this.textureX, this.textureY);
/* 3048 */     this.pumpModel[''] = new ModelRendererTurbo(this, 625, 89, this.textureX, this.textureY);
/* 3049 */     this.pumpModel[''] = new ModelRendererTurbo(this, 913, 89, this.textureX, this.textureY);
/* 3050 */     this.pumpModel[''] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 3051 */     this.pumpModel[''] = new ModelRendererTurbo(this, 521, 97, this.textureX, this.textureY);
/* 3052 */     this.pumpModel[''] = new ModelRendererTurbo(this, 1017, 97, this.textureX, this.textureY);
/* 3053 */     this.pumpModel[''] = new ModelRendererTurbo(this, 353, 105, this.textureX, this.textureY);
/* 3054 */     this.pumpModel[''] = new ModelRendererTurbo(this, 65, 161, this.textureX, this.textureY);
/* 3055 */     this.pumpModel[''] = new ModelRendererTurbo(this, 513, 161, this.textureX, this.textureY);
/* 3056 */     this.pumpModel[''] = new ModelRendererTurbo(this, 577, 161, this.textureX, this.textureY);
/* 3057 */     this.pumpModel[''] = new ModelRendererTurbo(this, 617, 161, this.textureX, this.textureY);
/* 3058 */     this.pumpModel[''] = new ModelRendererTurbo(this, 905, 161, this.textureX, this.textureY);
/* 3059 */     this.pumpModel[''] = new ModelRendererTurbo(this, 1009, 161, this.textureX, this.textureY);
/* 3060 */     this.pumpModel[''] = new ModelRendererTurbo(this, 65, 169, this.textureX, this.textureY);
/* 3061 */     this.pumpModel[''] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/* 3062 */     this.pumpModel[''] = new ModelRendererTurbo(this, 137, 177, this.textureX, this.textureY);
/* 3063 */     this.pumpModel[''] = new ModelRendererTurbo(this, 641, 105, this.textureX, this.textureY);
/* 3064 */     this.pumpModel[''] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/* 3065 */     this.pumpModel[''] = new ModelRendererTurbo(this, 1017, 105, this.textureX, this.textureY);
/* 3066 */     this.pumpModel[''] = new ModelRendererTurbo(this, 561, 113, this.textureX, this.textureY);
/* 3067 */     this.pumpModel[''] = new ModelRendererTurbo(this, 617, 113, this.textureX, this.textureY);
/* 3068 */     this.pumpModel[''] = new ModelRendererTurbo(this, 921, 113, this.textureX, this.textureY);
/* 3069 */     this.pumpModel[''] = new ModelRendererTurbo(this, 969, 113, this.textureX, this.textureY);
/* 3070 */     this.pumpModel[''] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/* 3071 */     this.pumpModel[''] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/* 3072 */     this.pumpModel[''] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/* 3073 */     this.pumpModel[''] = new ModelRendererTurbo(this, 897, 89, this.textureX, this.textureY);
/* 3074 */     this.pumpModel[''] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/* 3075 */     this.pumpModel[''] = new ModelRendererTurbo(this, 937, 113, this.textureX, this.textureY);
/* 3076 */     this.pumpModel[' '] = new ModelRendererTurbo(this, 305, 121, this.textureX, this.textureY);
/* 3077 */     this.pumpModel['¡'] = new ModelRendererTurbo(this, 321, 121, this.textureX, this.textureY);
/* 3078 */     this.pumpModel['¢'] = new ModelRendererTurbo(this, 489, 121, this.textureX, this.textureY);
/* 3079 */     this.pumpModel['£'] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/* 3080 */     this.pumpModel['¤'] = new ModelRendererTurbo(this, 993, 225, this.textureX, this.textureY);
/* 3081 */     this.pumpModel['¥'] = new ModelRendererTurbo(this, 657, 153, this.textureX, this.textureY);
/* 3082 */     this.pumpModel['¦'] = new ModelRendererTurbo(this, 561, 121, this.textureX, this.textureY);
/* 3083 */     this.pumpModel['§'] = new ModelRendererTurbo(this, 937, 121, this.textureX, this.textureY);
/* 3084 */     this.pumpModel['¨'] = new ModelRendererTurbo(this, 697, 153, this.textureX, this.textureY);
/* 3085 */     this.pumpModel['©'] = new ModelRendererTurbo(this, 985, 177, this.textureX, this.textureY);
/* 3086 */     this.pumpModel['ª'] = new ModelRendererTurbo(this, 1017, 121, this.textureX, this.textureY);
/* 3087 */     this.pumpModel['«'] = new ModelRendererTurbo(this, 745, 153, this.textureX, this.textureY);
/* 3088 */     this.pumpModel['¬'] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/* 3089 */     this.pumpModel['­'] = new ModelRendererTurbo(this, 785, 153, this.textureX, this.textureY);
/* 3090 */     this.pumpModel['®'] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/* 3091 */     this.pumpModel['¯'] = new ModelRendererTurbo(this, 897, 129, this.textureX, this.textureY);
/* 3092 */     this.pumpModel['°'] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/* 3093 */     this.pumpModel['±'] = new ModelRendererTurbo(this, 825, 153, this.textureX, this.textureY);
/* 3094 */     this.pumpModel['²'] = new ModelRendererTurbo(this, 1017, 129, this.textureX, this.textureY);
/* 3095 */     this.pumpModel['³'] = new ModelRendererTurbo(this, 969, 273, this.textureX, this.textureY);
/* 3096 */     this.pumpModel['´'] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/* 3097 */     this.pumpModel['µ'] = new ModelRendererTurbo(this, 505, 121, this.textureX, this.textureY);
/* 3098 */     this.pumpModel['¶'] = new ModelRendererTurbo(this, 49, 137, this.textureX, this.textureY);
/* 3099 */     this.pumpModel['·'] = new ModelRendererTurbo(this, 25, 281, this.textureX, this.textureY);
/* 3100 */     this.pumpModel['¸'] = new ModelRendererTurbo(this, 49, 185, this.textureX, this.textureY);
/* 3101 */     this.pumpModel['¹'] = new ModelRendererTurbo(this, 41, 481, this.textureX, this.textureY);
/* 3102 */     this.pumpModel['º'] = new ModelRendererTurbo(this, 65, 281, this.textureX, this.textureY);
/* 3103 */     this.pumpModel['»'] = new ModelRendererTurbo(this, 273, 353, this.textureX, this.textureY);
/* 3104 */     this.pumpModel['¼'] = new ModelRendererTurbo(this, 113, 481, this.textureX, this.textureY);
/* 3105 */     this.pumpModel['½'] = new ModelRendererTurbo(this, 105, 281, this.textureX, this.textureY);
/* 3106 */     this.pumpModel['¾'] = new ModelRendererTurbo(this, 185, 281, this.textureX, this.textureY);
/* 3107 */     this.pumpModel['¿'] = new ModelRendererTurbo(this, 761, 377, this.textureX, this.textureY);
/* 3108 */     this.pumpModel['À'] = new ModelRendererTurbo(this, 865, 185, this.textureX, this.textureY);
/* 3109 */     this.pumpModel['Á'] = new ModelRendererTurbo(this, 897, 185, this.textureX, this.textureY);
/* 3110 */     this.pumpModel['Â'] = new ModelRendererTurbo(this, 417, 201, this.textureX, this.textureY);
/* 3111 */     this.pumpModel['Ã'] = new ModelRendererTurbo(this, 457, 201, this.textureX, this.textureY);
/* 3112 */     this.pumpModel['Ä'] = new ModelRendererTurbo(this, 545, 201, this.textureX, this.textureY);
/* 3113 */     this.pumpModel['Å'] = new ModelRendererTurbo(this, 793, 201, this.textureX, this.textureY);
/* 3114 */     this.pumpModel['Æ'] = new ModelRendererTurbo(this, 977, 201, this.textureX, this.textureY);
/* 3115 */     this.pumpModel['Ç'] = new ModelRendererTurbo(this, 233, 209, this.textureX, this.textureY);
/* 3116 */     this.pumpModel['È'] = new ModelRendererTurbo(this, 257, 281, this.textureX, this.textureY);
/* 3117 */     this.pumpModel['É'] = new ModelRendererTurbo(this, 89, 137, this.textureX, this.textureY);
/* 3118 */     this.pumpModel['Ê'] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/* 3119 */     this.pumpModel['Ë'] = new ModelRendererTurbo(this, 369, 137, this.textureX, this.textureY);
/* 3120 */     this.pumpModel['Ì'] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/* 3121 */     this.pumpModel['Í'] = new ModelRendererTurbo(this, 473, 137, this.textureX, this.textureY);
/* 3122 */     this.pumpModel['Î'] = new ModelRendererTurbo(this, 897, 137, this.textureX, this.textureY);
/* 3123 */     this.pumpModel['Ï'] = new ModelRendererTurbo(this, 961, 137, this.textureX, this.textureY);
/* 3124 */     this.pumpModel['Ð'] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/* 3125 */     this.pumpModel['Ñ'] = new ModelRendererTurbo(this, 417, 281, this.textureX, this.textureY);
/* 3126 */     this.pumpModel['Ò'] = new ModelRendererTurbo(this, 169, 481, this.textureX, this.textureY);
/* 3127 */     this.pumpModel['Ó'] = new ModelRendererTurbo(this, 41, 489, this.textureX, this.textureY);
/* 3128 */     this.pumpModel['Ô'] = new ModelRendererTurbo(this, 481, 209, this.textureX, this.textureY);
/* 3129 */     this.pumpModel['Õ'] = new ModelRendererTurbo(this, 81, 489, this.textureX, this.textureY);
/* 3130 */     this.pumpModel['Ö'] = new ModelRendererTurbo(this, 89, 145, this.textureX, this.textureY);
/* 3131 */     this.pumpModel['×'] = new ModelRendererTurbo(this, 105, 145, this.textureX, this.textureY);
/* 3132 */     this.pumpModel['Ø'] = new ModelRendererTurbo(this, 721, 161, this.textureX, this.textureY);
/* 3133 */     this.pumpModel['Ù'] = new ModelRendererTurbo(this, 505, 209, this.textureX, this.textureY);
/* 3134 */     this.pumpModel['Ú'] = new ModelRendererTurbo(this, 689, 209, this.textureX, this.textureY);
/* 3135 */     this.pumpModel['Û'] = new ModelRendererTurbo(this, 713, 209, this.textureX, this.textureY);
/* 3136 */     this.pumpModel['Ü'] = new ModelRendererTurbo(this, 817, 209, this.textureX, this.textureY);
/* 3137 */     this.pumpModel['Ý'] = new ModelRendererTurbo(this, 889, 209, this.textureX, this.textureY);
/* 3138 */     this.pumpModel['Þ'] = new ModelRendererTurbo(this, 145, 217, this.textureX, this.textureY);
/* 3139 */     this.pumpModel['ß'] = new ModelRendererTurbo(this, 169, 217, this.textureX, this.textureY);
/* 3140 */     this.pumpModel['à'] = new ModelRendererTurbo(this, 233, 217, this.textureX, this.textureY);
/* 3141 */     this.pumpModel['á'] = new ModelRendererTurbo(this, 273, 217, this.textureX, this.textureY);
/* 3142 */     this.pumpModel['â'] = new ModelRendererTurbo(this, 841, 217, this.textureX, this.textureY);
/* 3143 */     this.pumpModel['ã'] = new ModelRendererTurbo(this, 297, 225, this.textureX, this.textureY);
/* 3144 */     this.pumpModel['ä'] = new ModelRendererTurbo(this, 761, 225, this.textureX, this.textureY);
/* 3145 */     this.pumpModel['å'] = new ModelRendererTurbo(this, 801, 225, this.textureX, this.textureY);
/* 3146 */     this.pumpModel['æ'] = new ModelRendererTurbo(this, 865, 225, this.textureX, this.textureY);
/* 3147 */     this.pumpModel['ç'] = new ModelRendererTurbo(this, 969, 225, this.textureX, this.textureY);
/* 3148 */     this.pumpModel['è'] = new ModelRendererTurbo(this, 25, 233, this.textureX, this.textureY);
/* 3149 */     this.pumpModel['é'] = new ModelRendererTurbo(this, 129, 233, this.textureX, this.textureY);
/* 3150 */     this.pumpModel['ê'] = new ModelRendererTurbo(this, 345, 233, this.textureX, this.textureY);
/* 3151 */     this.pumpModel['ë'] = new ModelRendererTurbo(this, 761, 233, this.textureX, this.textureY);
/* 3152 */     this.pumpModel['ì'] = new ModelRendererTurbo(this, 889, 233, this.textureX, this.textureY);
/* 3153 */     this.pumpModel['í'] = new ModelRendererTurbo(this, 913, 233, this.textureX, this.textureY);
/* 3154 */     this.pumpModel['î'] = new ModelRendererTurbo(this, 457, 273, this.textureX, this.textureY);
/* 3155 */     this.pumpModel['ï'] = new ModelRendererTurbo(this, 257, 145, this.textureX, this.textureY);
/* 3156 */     this.pumpModel['ð'] = new ModelRendererTurbo(this, 865, 153, this.textureX, this.textureY);
/* 3157 */     this.pumpModel['ñ'] = new ModelRendererTurbo(this, 25, 161, this.textureX, this.textureY);
/* 3158 */     this.pumpModel['ò'] = new ModelRendererTurbo(this, 193, 209, this.textureX, this.textureY);
/* 3159 */     this.pumpModel['ó'] = new ModelRendererTurbo(this, 497, 153, this.textureX, this.textureY);
/* 3160 */     this.pumpModel['ô'] = new ModelRendererTurbo(this, 601, 153, this.textureX, this.textureY);
/* 3161 */     this.pumpModel['õ'] = new ModelRendererTurbo(this, 241, 233, this.textureX, this.textureY);
/* 3162 */     this.pumpModel['ö'] = new ModelRendererTurbo(this, 369, 145, this.textureX, this.textureY);
/* 3163 */     this.pumpModel['÷'] = new ModelRendererTurbo(this, 481, 305, this.textureX, this.textureY);
/* 3164 */     this.pumpModel['ø'] = new ModelRendererTurbo(this, 561, 297, this.textureX, this.textureY);
/* 3165 */     this.pumpModel['ù'] = new ModelRendererTurbo(this, 601, 297, this.textureX, this.textureY);
/* 3166 */     this.pumpModel['ú'] = new ModelRendererTurbo(this, 1009, 33, this.textureX, this.textureY);
/* 3167 */     this.pumpModel['û'] = new ModelRendererTurbo(this, 193, 145, this.textureX, this.textureY);
/* 3168 */     this.pumpModel['ü'] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/* 3169 */     this.pumpModel['ý'] = new ModelRendererTurbo(this, 553, 145, this.textureX, this.textureY);
/* 3170 */     this.pumpModel['þ'] = new ModelRendererTurbo(this, 641, 153, this.textureX, this.textureY);
/* 3171 */     this.pumpModel['ÿ'] = new ModelRendererTurbo(this, 681, 153, this.textureX, this.textureY);
/* 3172 */     this.pumpModel['Ā'] = new ModelRendererTurbo(this, 769, 153, this.textureX, this.textureY);
/* 3173 */     this.pumpModel['ā'] = new ModelRendererTurbo(this, 809, 153, this.textureX, this.textureY);
/* 3174 */     this.pumpModel['Ă'] = new ModelRendererTurbo(this, 849, 153, this.textureX, this.textureY);
/* 3175 */     this.pumpModel['ă'] = new ModelRendererTurbo(this, 337, 281, this.textureX, this.textureY);
/* 3176 */     this.pumpModel['Ą'] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/* 3177 */     this.pumpModel['ą'] = new ModelRendererTurbo(this, 721, 289, this.textureX, this.textureY);
/* 3178 */     this.pumpModel['Ć'] = new ModelRendererTurbo(this, 889, 153, this.textureX, this.textureY);
/* 3179 */     this.pumpModel['ć'] = new ModelRendererTurbo(this, 1001, 121, this.textureX, this.textureY);
/* 3180 */     this.pumpModel['Ĉ'] = new ModelRendererTurbo(this, 209, 137, this.textureX, this.textureY);
/* 3181 */     this.pumpModel['ĉ'] = new ModelRendererTurbo(this, 905, 153, this.textureX, this.textureY);
/* 3182 */     this.pumpModel['Ċ'] = new ModelRendererTurbo(this, 49, 161, this.textureX, this.textureY);
/* 3183 */     this.pumpModel['ċ'] = new ModelRendererTurbo(this, 273, 137, this.textureX, this.textureY);
/* 3184 */     this.pumpModel['Č'] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/* 3185 */     this.pumpModel['č'] = new ModelRendererTurbo(this, 937, 137, this.textureX, this.textureY);
/* 3186 */     this.pumpModel['Ď'] = new ModelRendererTurbo(this, 145, 145, this.textureX, this.textureY);
/* 3187 */     this.pumpModel['ď'] = new ModelRendererTurbo(this, 497, 145, this.textureX, this.textureY);
/* 3188 */     this.pumpModel['Đ'] = new ModelRendererTurbo(this, 89, 161, this.textureX, this.textureY);
/* 3189 */     this.pumpModel['đ'] = new ModelRendererTurbo(this, 137, 161, this.textureX, this.textureY);
/* 3190 */     this.pumpModel['Ē'] = new ModelRendererTurbo(this, 201, 161, this.textureX, this.textureY);
/* 3191 */     this.pumpModel['ē'] = new ModelRendererTurbo(this, 33, 385, this.textureX, this.textureY);
/* 3192 */     this.pumpModel['Ĕ'] = new ModelRendererTurbo(this, 929, 281, this.textureX, this.textureY);
/* 3193 */     this.pumpModel['ĕ'] = new ModelRendererTurbo(this, 489, 409, this.textureX, this.textureY);
/* 3194 */     this.pumpModel['Ė'] = new ModelRendererTurbo(this, 153, 489, this.textureX, this.textureY);
/* 3195 */     this.pumpModel['ė'] = new ModelRendererTurbo(this, 201, 489, this.textureX, this.textureY);
/* 3196 */     this.pumpModel['Ę'] = new ModelRendererTurbo(this, 745, 289, this.textureX, this.textureY);
/* 3197 */     this.pumpModel['ę'] = new ModelRendererTurbo(this, 313, 489, this.textureX, this.textureY);
/* 3198 */     this.pumpModel['Ě'] = new ModelRendererTurbo(this, 449, 489, this.textureX, this.textureY);
/* 3199 */     this.pumpModel['ě'] = new ModelRendererTurbo(this, 497, 489, this.textureX, this.textureY);
/* 3200 */     this.pumpModel['Ĝ'] = new ModelRendererTurbo(this, 729, 489, this.textureX, this.textureY);
/* 3201 */     this.pumpModel['ĝ'] = new ModelRendererTurbo(this, 161, 185, this.textureX, this.textureY);
/* 3202 */     this.pumpModel['Ğ'] = new ModelRendererTurbo(this, 905, 489, this.textureX, this.textureY);
/* 3203 */     this.pumpModel['ğ'] = new ModelRendererTurbo(this, 81, 497, this.textureX, this.textureY);
/* 3204 */     this.pumpModel['Ġ'] = new ModelRendererTurbo(this, 465, 161, this.textureX, this.textureY);
/* 3205 */     this.pumpModel['ġ'] = new ModelRendererTurbo(this, 793, 249, this.textureX, this.textureY);
/* 3206 */     this.pumpModel['Ģ'] = new ModelRendererTurbo(this, 321, 161, this.textureX, this.textureY);
/* 3207 */     this.pumpModel['ģ'] = new ModelRendererTurbo(this, 337, 161, this.textureX, this.textureY);
/* 3208 */     this.pumpModel['Ĥ'] = new ModelRendererTurbo(this, 681, 233, this.textureX, this.textureY);
/* 3209 */     this.pumpModel['ĥ'] = new ModelRendererTurbo(this, 641, 161, this.textureX, this.textureY);
/* 3210 */     this.pumpModel['Ħ'] = new ModelRendererTurbo(this, 681, 161, this.textureX, this.textureY);
/*      */     
/* 3212 */     this.pumpModel[0].addShapeBox(86.0F, -60.0F, -8.0F, 105, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3213 */     this.pumpModel[0].setRotationPoint(46.0F, 13.0F, -2.0F);
/*      */     
/* 3215 */     this.pumpModel[1].addShapeBox(86.0F, -60.0F, -8.0F, 105, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3216 */     this.pumpModel[1].setRotationPoint(46.0F, 13.0F, 17.0F);
/*      */     
/* 3218 */     this.pumpModel[2].addShapeBox(86.0F, -60.0F, -8.0F, 35, 10, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3219 */     this.pumpModel[2].setRotationPoint(127.0F, 22.0F, -3.0F);
/*      */     
/* 3221 */     this.pumpModel[3].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3222 */     this.pumpModel[3].setRotationPoint(159.0F, 19.0F, -3.0F);
/*      */     
/* 3224 */     this.pumpModel[4].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3225 */     this.pumpModel[4].setRotationPoint(59.5F, 14.0F, 17.0F);
/*      */     
/* 3227 */     this.pumpModel[5].addShapeBox(86.0F, -60.0F, -8.0F, 4, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3228 */     this.pumpModel[5].setRotationPoint(99.5F, 14.0F, 17.0F);
/*      */     
/* 3230 */     this.pumpModel[6].addShapeBox(86.0F, -60.0F, -8.0F, 4, 18, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3231 */     this.pumpModel[6].setRotationPoint(94.0F, 14.0F, 17.0F);
/*      */     
/* 3233 */     this.pumpModel[7].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3234 */     this.pumpModel[7].setRotationPoint(88.5F, 14.0F, 17.0F);
/*      */     
/* 3236 */     this.pumpModel[8].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3237 */     this.pumpModel[8].setRotationPoint(83.0F, 14.0F, 17.0F);
/*      */     
/* 3239 */     this.pumpModel[9].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3240 */     this.pumpModel[9].setRotationPoint(77.5F, 14.0F, 17.0F);
/*      */     
/* 3242 */     this.pumpModel[10].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3243 */     this.pumpModel[10].setRotationPoint(72.0F, 14.0F, 17.0F);
/*      */     
/* 3245 */     this.pumpModel[11].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3246 */     this.pumpModel[11].setRotationPoint(66.5F, 14.0F, 17.0F);
/*      */     
/* 3248 */     this.pumpModel[12].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3249 */     this.pumpModel[12].setRotationPoint(61.0F, 14.0F, 17.0F);
/*      */     
/* 3251 */     this.pumpModel[13].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3252 */     this.pumpModel[13].setRotationPoint(55.5F, 14.0F, 17.0F);
/*      */     
/* 3254 */     this.pumpModel[14].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3255 */     this.pumpModel[14].setRotationPoint(65.0F, 14.0F, 17.0F);
/*      */     
/* 3257 */     this.pumpModel[15].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3258 */     this.pumpModel[15].setRotationPoint(70.5F, 14.0F, 17.0F);
/*      */     
/* 3260 */     this.pumpModel[16].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3261 */     this.pumpModel[16].setRotationPoint(76.0F, 14.0F, 17.0F);
/*      */     
/* 3263 */     this.pumpModel[17].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3264 */     this.pumpModel[17].setRotationPoint(81.5F, 14.0F, 17.0F);
/*      */     
/* 3266 */     this.pumpModel[18].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3267 */     this.pumpModel[18].setRotationPoint(87.0F, 14.0F, 17.0F);
/*      */     
/* 3269 */     this.pumpModel[19].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3270 */     this.pumpModel[19].setRotationPoint(92.5F, 14.0F, 17.0F);
/*      */     
/* 3272 */     this.pumpModel[20].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3273 */     this.pumpModel[20].setRotationPoint(98.0F, 14.0F, 17.0F);
/*      */     
/* 3275 */     this.pumpModel[21].addShapeBox(86.0F, -60.0F, -8.0F, 2, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3276 */     this.pumpModel[21].setRotationPoint(103.5F, 14.0F, 17.0F);
/*      */     
/* 3278 */     this.pumpModel[22].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3279 */     this.pumpModel[22].setRotationPoint(109.0F, 14.0F, 17.0F);
/*      */     
/* 3281 */     this.pumpModel[23].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3282 */     this.pumpModel[23].setRotationPoint(114.5F, 14.0F, 17.0F);
/*      */     
/* 3284 */     this.pumpModel[24].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3285 */     this.pumpModel[24].setRotationPoint(120.0F, 14.0F, 17.0F);
/*      */     
/* 3287 */     this.pumpModel[25].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3288 */     this.pumpModel[25].setRotationPoint(125.5F, 14.0F, 17.0F);
/*      */     
/* 3290 */     this.pumpModel[26].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3291 */     this.pumpModel[26].setRotationPoint(54.0F, 14.0F, 17.0F);
/*      */     
/* 3293 */     this.pumpModel[27].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3294 */     this.pumpModel[27].setRotationPoint(50.0F, 14.0F, 17.0F);
/*      */     
/* 3296 */     this.pumpModel[28].addShapeBox(86.0F, -60.0F, -8.0F, 24, 8, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3297 */     this.pumpModel[28].setRotationPoint(127.0F, 14.0F, -3.0F);
/*      */     
/* 3299 */     this.pumpModel[29].addShapeBox(86.0F, -60.0F, -8.0F, 8, 6, 1, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3300 */     this.pumpModel[29].setRotationPoint(151.0F, 16.0F, -2.0F);
/*      */     
/* 3302 */     this.pumpModel[30].addShapeBox(86.0F, -60.0F, -8.0F, 30, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3303 */     this.pumpModel[30].setRotationPoint(127.0F, 32.0F, 17.0F);
/*      */     
/* 3305 */     this.pumpModel[31].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3306 */     this.pumpModel[31].setRotationPoint(121.5F, 14.0F, -2.0F);
/*      */     
/* 3308 */     this.pumpModel[32].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3309 */     this.pumpModel[32].setRotationPoint(116.0F, 14.0F, -2.0F);
/*      */     
/* 3311 */     this.pumpModel[33].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3312 */     this.pumpModel[33].setRotationPoint(110.5F, 14.0F, -2.0F);
/*      */     
/* 3314 */     this.pumpModel[34].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3315 */     this.pumpModel[34].setRotationPoint(59.5F, 14.0F, -2.0F);
/*      */     
/* 3317 */     this.pumpModel[35].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3318 */     this.pumpModel[35].setRotationPoint(105.0F, 14.0F, -2.0F);
/*      */     
/* 3320 */     this.pumpModel[36].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3321 */     this.pumpModel[36].setRotationPoint(99.5F, 14.0F, -2.0F);
/*      */     
/* 3323 */     this.pumpModel[37].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3324 */     this.pumpModel[37].setRotationPoint(94.0F, 14.0F, -2.0F);
/*      */     
/* 3326 */     this.pumpModel[38].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3327 */     this.pumpModel[38].setRotationPoint(88.5F, 14.0F, -2.0F);
/*      */     
/* 3329 */     this.pumpModel[39].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3330 */     this.pumpModel[39].setRotationPoint(83.0F, 14.0F, -2.0F);
/*      */     
/* 3332 */     this.pumpModel[40].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3333 */     this.pumpModel[40].setRotationPoint(77.5F, 14.0F, -2.0F);
/*      */     
/* 3335 */     this.pumpModel[41].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3336 */     this.pumpModel[41].setRotationPoint(72.0F, 14.0F, -2.0F);
/*      */     
/* 3338 */     this.pumpModel[42].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3339 */     this.pumpModel[42].setRotationPoint(66.5F, 14.0F, -2.0F);
/*      */     
/* 3341 */     this.pumpModel[43].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3342 */     this.pumpModel[43].setRotationPoint(61.0F, 14.0F, -2.0F);
/*      */     
/* 3344 */     this.pumpModel[44].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3345 */     this.pumpModel[44].setRotationPoint(55.5F, 14.0F, -2.0F);
/*      */     
/* 3347 */     this.pumpModel[45].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3348 */     this.pumpModel[45].setRotationPoint(65.0F, 14.0F, -2.0F);
/*      */     
/* 3350 */     this.pumpModel[46].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3351 */     this.pumpModel[46].setRotationPoint(70.5F, 14.0F, -2.0F);
/*      */     
/* 3353 */     this.pumpModel[47].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3354 */     this.pumpModel[47].setRotationPoint(76.0F, 14.0F, -2.0F);
/*      */     
/* 3356 */     this.pumpModel[48].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3357 */     this.pumpModel[48].setRotationPoint(81.5F, 14.0F, -2.0F);
/*      */     
/* 3359 */     this.pumpModel[49].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3360 */     this.pumpModel[49].setRotationPoint(87.0F, 14.0F, -2.0F);
/*      */     
/* 3362 */     this.pumpModel[50].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3363 */     this.pumpModel[50].setRotationPoint(92.5F, 14.0F, -2.0F);
/*      */     
/* 3365 */     this.pumpModel[51].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3366 */     this.pumpModel[51].setRotationPoint(98.0F, 14.0F, -2.0F);
/*      */     
/* 3368 */     this.pumpModel[52].addShapeBox(86.0F, -60.0F, -8.0F, 2, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3369 */     this.pumpModel[52].setRotationPoint(103.5F, 14.0F, -2.0F);
/*      */     
/* 3371 */     this.pumpModel[53].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3372 */     this.pumpModel[53].setRotationPoint(109.0F, 14.0F, -2.0F);
/*      */     
/* 3374 */     this.pumpModel[54].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3375 */     this.pumpModel[54].setRotationPoint(114.5F, 14.0F, -2.0F);
/*      */     
/* 3377 */     this.pumpModel[55].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3378 */     this.pumpModel[55].setRotationPoint(120.0F, 14.0F, -2.0F);
/*      */     
/* 3380 */     this.pumpModel[56].addShapeBox(86.0F, -60.0F, -8.0F, 2, 22, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3381 */     this.pumpModel[56].setRotationPoint(125.5F, 14.0F, -2.0F);
/*      */     
/* 3383 */     this.pumpModel[57].addShapeBox(86.0F, -60.0F, -8.0F, 2, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3384 */     this.pumpModel[57].setRotationPoint(54.0F, 14.0F, -2.0F);
/*      */     
/* 3386 */     this.pumpModel[58].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3387 */     this.pumpModel[58].setRotationPoint(50.0F, 14.0F, -2.0F);
/*      */     
/* 3389 */     this.pumpModel[59].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3390 */     this.pumpModel[59].setRotationPoint(50.0F, 14.0F, -3.0F);
/*      */     
/* 3392 */     this.pumpModel[60].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3393 */     this.pumpModel[60].setRotationPoint(55.5F, 14.0F, -3.0F);
/*      */     
/* 3395 */     this.pumpModel[61].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3396 */     this.pumpModel[61].setRotationPoint(61.0F, 14.0F, -3.0F);
/*      */     
/* 3398 */     this.pumpModel[62].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3399 */     this.pumpModel[62].setRotationPoint(66.5F, 14.0F, -3.0F);
/*      */     
/* 3401 */     this.pumpModel[63].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3402 */     this.pumpModel[63].setRotationPoint(72.0F, 14.0F, -3.0F);
/*      */     
/* 3404 */     this.pumpModel[64].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3405 */     this.pumpModel[64].setRotationPoint(77.5F, 14.0F, -3.0F);
/*      */     
/* 3407 */     this.pumpModel[65].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3408 */     this.pumpModel[65].setRotationPoint(83.0F, 14.0F, -3.0F);
/*      */     
/* 3410 */     this.pumpModel[66].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3411 */     this.pumpModel[66].setRotationPoint(88.5F, 14.0F, -3.0F);
/*      */     
/* 3413 */     this.pumpModel[67].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3414 */     this.pumpModel[67].setRotationPoint(94.0F, 14.0F, -3.0F);
/*      */     
/* 3416 */     this.pumpModel[68].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3417 */     this.pumpModel[68].setRotationPoint(99.5F, 14.0F, -3.0F);
/*      */     
/* 3419 */     this.pumpModel[69].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3420 */     this.pumpModel[69].setRotationPoint(105.0F, 14.0F, -3.0F);
/*      */     
/* 3422 */     this.pumpModel[70].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3423 */     this.pumpModel[70].setRotationPoint(110.5F, 14.0F, -3.0F);
/*      */     
/* 3425 */     this.pumpModel[71].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3426 */     this.pumpModel[71].setRotationPoint(116.0F, 14.0F, -3.0F);
/*      */     
/* 3428 */     this.pumpModel[72].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3429 */     this.pumpModel[72].setRotationPoint(121.5F, 14.0F, -3.0F);
/*      */     
/* 3431 */     this.pumpModel[73].addShapeBox(86.0F, -60.0F, -8.0F, 8, 6, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3432 */     this.pumpModel[73].setRotationPoint(151.0F, 16.0F, -3.0F);
/*      */     
/* 3434 */     this.pumpModel[74].addShapeBox(86.0F, -60.0F, -8.0F, 8, 6, 1, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3435 */     this.pumpModel[74].setRotationPoint(151.0F, 16.0F, 17.0F);
/*      */     
/* 3437 */     this.pumpModel[75].addShapeBox(86.0F, -60.0F, -8.0F, 35, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3438 */     this.pumpModel[75].setRotationPoint(127.0F, 22.0F, 17.0F);
/*      */     
/* 3440 */     this.pumpModel[76].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3441 */     this.pumpModel[76].setRotationPoint(159.0F, 19.0F, 17.0F);
/*      */     
/* 3443 */     this.pumpModel[77].addShapeBox(86.0F, -60.0F, -8.0F, 24, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3444 */     this.pumpModel[77].setRotationPoint(127.0F, 14.0F, 18.0F);
/*      */     
/* 3446 */     this.pumpModel[78].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3447 */     this.pumpModel[78].setRotationPoint(50.0F, 14.0F, 18.0F);
/*      */     
/* 3449 */     this.pumpModel[79].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3450 */     this.pumpModel[79].setRotationPoint(55.5F, 14.0F, 18.0F);
/*      */     
/* 3452 */     this.pumpModel[80].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3453 */     this.pumpModel[80].setRotationPoint(61.0F, 14.0F, 18.0F);
/*      */     
/* 3455 */     this.pumpModel[81].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3456 */     this.pumpModel[81].setRotationPoint(66.5F, 14.0F, 18.0F);
/*      */     
/* 3458 */     this.pumpModel[82].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3459 */     this.pumpModel[82].setRotationPoint(72.0F, 14.0F, 18.0F);
/*      */     
/* 3461 */     this.pumpModel[83].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3462 */     this.pumpModel[83].setRotationPoint(77.5F, 14.0F, 18.0F);
/*      */     
/* 3464 */     this.pumpModel[84].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3465 */     this.pumpModel[84].setRotationPoint(83.0F, 14.0F, 18.0F);
/*      */     
/* 3467 */     this.pumpModel[85].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3468 */     this.pumpModel[85].setRotationPoint(88.5F, 14.0F, 18.0F);
/*      */     
/* 3470 */     this.pumpModel[86].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3471 */     this.pumpModel[86].setRotationPoint(94.0F, 14.0F, 18.0F);
/*      */     
/* 3473 */     this.pumpModel[87].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3474 */     this.pumpModel[87].setRotationPoint(99.5F, 14.0F, 18.0F);
/*      */     
/* 3476 */     this.pumpModel[88].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3477 */     this.pumpModel[88].setRotationPoint(105.0F, 14.0F, 18.0F);
/*      */     
/* 3479 */     this.pumpModel[89].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3480 */     this.pumpModel[89].setRotationPoint(110.5F, 14.0F, 18.0F);
/*      */     
/* 3482 */     this.pumpModel[90].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3483 */     this.pumpModel[90].setRotationPoint(116.0F, 14.0F, 18.0F);
/*      */     
/* 3485 */     this.pumpModel[91].addShapeBox(86.0F, -60.0F, -8.0F, 4, 21, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3486 */     this.pumpModel[91].setRotationPoint(121.5F, 14.0F, 18.0F);
/*      */     
/* 3488 */     this.pumpModel[92].addShapeBox(86.0F, -60.0F, -8.0F, 8, 6, 1, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3489 */     this.pumpModel[92].setRotationPoint(151.0F, 16.0F, 18.0F);
/*      */     
/* 3491 */     this.pumpModel[93].addShapeBox(86.0F, -60.0F, -8.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3492 */     this.pumpModel[93].setRotationPoint(157.0F, 32.0F, -3.0F);
/*      */     
/* 3494 */     this.pumpModel[94].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3495 */     this.pumpModel[94].setRotationPoint(157.0F, 34.0F, 17.5F);
/*      */     
/* 3497 */     this.pumpModel[95].addShapeBox(86.0F, -60.0F, -8.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3498 */     this.pumpModel[95].setRotationPoint(157.0F, 36.0F, 16.5F);
/*      */     
/* 3500 */     this.pumpModel[96].addShapeBox(86.0F, -60.0F, -8.0F, 17, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, -2.0F, 0.0F, -4.5F, -2.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3501 */     this.pumpModel[96].setRotationPoint(149.0F, 39.0F, -0.5F);
/*      */     
/* 3503 */     this.pumpModel[97].addShapeBox(86.0F, -60.0F, -8.0F, 12, 6, 2, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -3.0F, -4.5F, 0.0F, -3.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3504 */     this.pumpModel[97].setRotationPoint(137.0F, 39.0F, -0.5F);
/*      */     
/* 3506 */     this.pumpModel[98].addShapeBox(86.0F, -60.0F, -8.0F, 22, 5, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3507 */     this.pumpModel[98].setRotationPoint(115.0F, 40.0F, -0.5F);
/*      */     
/* 3509 */     this.pumpModel[99].addShapeBox(86.0F, -60.0F, -8.0F, 17, 6, 2, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, -4.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 5.0F, 0.0F, -4.0F, 5.0F);
/* 3510 */     this.pumpModel[99].setRotationPoint(98.0F, 39.0F, -0.5F);
/*      */     
/* 3512 */     this.pumpModel[100].addShapeBox(86.0F, -60.0F, -8.0F, 30, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3513 */     this.pumpModel[100].setRotationPoint(127.0F, 34.0F, 17.5F);
/*      */     
/* 3515 */     this.pumpModel[101].addShapeBox(86.0F, -60.0F, -8.0F, 22, 4, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3516 */     this.pumpModel[101].setRotationPoint(115.0F, 36.0F, -2.5F);
/*      */     
/* 3518 */     this.pumpModel[102].addShapeBox(86.0F, -60.0F, -8.0F, 12, 4, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3519 */     this.pumpModel[102].setRotationPoint(137.0F, 36.0F, -2.5F);
/*      */     
/* 3521 */     this.pumpModel[103].addShapeBox(86.0F, -60.0F, -8.0F, 8, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3522 */     this.pumpModel[103].setRotationPoint(149.0F, 36.0F, -2.5F);
/*      */     
/* 3524 */     this.pumpModel[104].addShapeBox(86.0F, -60.0F, -8.0F, 17, 4, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F);
/* 3525 */     this.pumpModel[104].setRotationPoint(98.0F, 36.0F, -2.5F);
/*      */     
/* 3527 */     this.pumpModel[105].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3528 */     this.pumpModel[105].setRotationPoint(121.5F, 35.0F, 17.5F);
/*      */     
/* 3530 */     this.pumpModel[106].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3531 */     this.pumpModel[106].setRotationPoint(116.0F, 35.0F, 17.5F);
/*      */     
/* 3533 */     this.pumpModel[107].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3534 */     this.pumpModel[107].setRotationPoint(110.5F, 35.0F, 17.5F);
/*      */     
/* 3536 */     this.pumpModel[108].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3537 */     this.pumpModel[108].setRotationPoint(105.0F, 35.0F, 17.5F);
/*      */     
/* 3539 */     this.pumpModel[109].addShapeBox(86.0F, -60.0F, -8.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3540 */     this.pumpModel[109].setRotationPoint(98.0F, 35.0F, 17.5F);
/*      */     
/* 3542 */     this.pumpModel[110].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3543 */     this.pumpModel[110].setRotationPoint(103.5F, 34.0F, 17.5F);
/*      */     
/* 3545 */     this.pumpModel[111].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3546 */     this.pumpModel[111].setRotationPoint(98.0F, 34.0F, 17.5F);
/*      */     
/* 3548 */     this.pumpModel[112].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3549 */     this.pumpModel[112].setRotationPoint(94.0F, 35.0F, 17.5F);
/*      */     
/* 3551 */     this.pumpModel[113].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3552 */     this.pumpModel[113].setRotationPoint(88.5F, 35.0F, 17.5F);
/*      */     
/* 3554 */     this.pumpModel[114].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3555 */     this.pumpModel[114].setRotationPoint(83.0F, 35.0F, 17.5F);
/*      */     
/* 3557 */     this.pumpModel[115].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3558 */     this.pumpModel[115].setRotationPoint(77.5F, 35.0F, 17.5F);
/*      */     
/* 3560 */     this.pumpModel[116].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3561 */     this.pumpModel[116].setRotationPoint(72.0F, 35.0F, 17.5F);
/*      */     
/* 3563 */     this.pumpModel[117].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3564 */     this.pumpModel[117].setRotationPoint(66.5F, 35.0F, 17.5F);
/*      */     
/* 3566 */     this.pumpModel[118].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3567 */     this.pumpModel[118].setRotationPoint(61.0F, 35.0F, 17.5F);
/*      */     
/* 3569 */     this.pumpModel[119].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3570 */     this.pumpModel[119].setRotationPoint(55.5F, 35.0F, 17.5F);
/*      */     
/* 3572 */     this.pumpModel[120].addShapeBox(86.0F, -60.0F, -8.0F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.35F);
/* 3573 */     this.pumpModel[120].setRotationPoint(46.0F, 35.0F, 17.5F);
/*      */     
/* 3575 */     this.pumpModel[121].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3576 */     this.pumpModel[121].setRotationPoint(94.0F, 36.0F, -2.5F);
/*      */     
/* 3578 */     this.pumpModel[122].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3579 */     this.pumpModel[122].setRotationPoint(88.5F, 36.0F, -2.5F);
/*      */     
/* 3581 */     this.pumpModel[123].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3582 */     this.pumpModel[123].setRotationPoint(83.0F, 36.0F, -2.5F);
/*      */     
/* 3584 */     this.pumpModel[124].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3585 */     this.pumpModel[124].setRotationPoint(77.5F, 36.0F, -2.5F);
/*      */     
/* 3587 */     this.pumpModel[125].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3588 */     this.pumpModel[125].setRotationPoint(72.0F, 36.0F, -2.5F);
/*      */     
/* 3590 */     this.pumpModel[126].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3591 */     this.pumpModel[126].setRotationPoint(66.5F, 36.0F, -2.5F);
/*      */     
/* 3593 */     this.pumpModel[127].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3594 */     this.pumpModel[127].setRotationPoint(61.0F, 36.0F, -2.5F);
/*      */     
/* 3596 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3597 */     this.pumpModel[''].setRotationPoint(55.5F, 36.0F, -2.5F);
/*      */     
/* 3599 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 8, 2, 2, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3600 */     this.pumpModel[''].setRotationPoint(46.0F, 36.0F, -2.5F);
/*      */     
/* 3602 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3603 */     this.pumpModel[''].setRotationPoint(92.5F, 35.0F, 17.0F);
/*      */     
/* 3605 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3606 */     this.pumpModel[''].setRotationPoint(87.0F, 35.0F, 17.0F);
/*      */     
/* 3608 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3609 */     this.pumpModel[''].setRotationPoint(81.5F, 35.0F, 17.0F);
/*      */     
/* 3611 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3612 */     this.pumpModel[''].setRotationPoint(76.0F, 35.0F, 17.0F);
/*      */     
/* 3614 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3615 */     this.pumpModel[''].setRotationPoint(70.5F, 35.0F, 17.0F);
/*      */     
/* 3617 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3618 */     this.pumpModel[''].setRotationPoint(65.0F, 35.0F, 17.0F);
/*      */     
/* 3620 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3621 */     this.pumpModel[''].setRotationPoint(59.5F, 35.0F, 17.0F);
/*      */     
/* 3623 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3624 */     this.pumpModel[''].setRotationPoint(54.0F, 35.0F, 17.0F);
/*      */     
/* 3626 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3627 */     this.pumpModel[''].setRotationPoint(94.0F, 38.0F, -0.5F);
/*      */     
/* 3629 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3630 */     this.pumpModel[''].setRotationPoint(88.5F, 38.0F, 14.5F);
/*      */     
/* 3632 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3633 */     this.pumpModel[''].setRotationPoint(83.0F, 38.0F, 14.5F);
/*      */     
/* 3635 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3636 */     this.pumpModel[''].setRotationPoint(77.5F, 38.0F, 14.5F);
/*      */     
/* 3638 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3639 */     this.pumpModel[''].setRotationPoint(72.0F, 38.0F, 14.5F);
/*      */     
/* 3641 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3642 */     this.pumpModel[''].setRotationPoint(66.5F, 38.0F, 14.5F);
/*      */     
/* 3644 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3645 */     this.pumpModel[''].setRotationPoint(61.0F, 38.0F, 14.5F);
/*      */     
/* 3647 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3648 */     this.pumpModel[''].setRotationPoint(55.5F, 38.0F, 14.5F);
/*      */     
/* 3650 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 6, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3651 */     this.pumpModel[''].setRotationPoint(48.0F, 38.0F, 14.5F);
/*      */     
/* 3653 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3654 */     this.pumpModel[''].setRotationPoint(92.5F, 36.0F, -1.5F);
/*      */     
/* 3656 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3657 */     this.pumpModel[''].setRotationPoint(87.0F, 36.0F, -1.5F);
/*      */     
/* 3659 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3660 */     this.pumpModel[''].setRotationPoint(81.5F, 36.0F, -1.5F);
/*      */     
/* 3662 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3663 */     this.pumpModel[''].setRotationPoint(76.0F, 36.0F, -1.5F);
/*      */     
/* 3665 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3666 */     this.pumpModel[''].setRotationPoint(70.5F, 36.0F, -1.5F);
/*      */     
/* 3668 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3669 */     this.pumpModel[''].setRotationPoint(65.0F, 36.0F, -1.5F);
/*      */     
/* 3671 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3672 */     this.pumpModel[''].setRotationPoint(59.5F, 36.0F, -1.5F);
/*      */     
/* 3674 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3675 */     this.pumpModel[''].setRotationPoint(54.0F, 36.0F, -1.5F);
/*      */     
/* 3677 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3678 */     this.pumpModel[''].setRotationPoint(93.0F, 38.0F, 14.5F);
/*      */     
/* 3680 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3681 */     this.pumpModel[''].setRotationPoint(87.5F, 38.0F, 14.5F);
/*      */     
/* 3683 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3684 */     this.pumpModel[''].setRotationPoint(82.0F, 38.0F, 14.5F);
/*      */     
/* 3686 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3687 */     this.pumpModel[''].setRotationPoint(76.5F, 38.0F, 14.5F);
/*      */     
/* 3689 */     this.pumpModel[''].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3690 */     this.pumpModel[''].setRotationPoint(71.0F, 38.0F, 14.5F);
/*      */     
/* 3692 */     this.pumpModel[' '].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3693 */     this.pumpModel[' '].setRotationPoint(65.5F, 38.0F, 14.5F);
/*      */     
/* 3695 */     this.pumpModel['¡'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3696 */     this.pumpModel['¡'].setRotationPoint(60.0F, 38.0F, 14.5F);
/*      */     
/* 3698 */     this.pumpModel['¢'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F);
/* 3699 */     this.pumpModel['¢'].setRotationPoint(54.5F, 38.0F, 14.5F);
/*      */     
/* 3701 */     this.pumpModel['£'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3702 */     this.pumpModel['£'].setRotationPoint(46.0F, 14.0F, 17.0F);
/*      */     
/* 3704 */     this.pumpModel['¤'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3705 */     this.pumpModel['¤'].setRotationPoint(46.0F, 14.0F, 18.0F);
/*      */     
/* 3707 */     this.pumpModel['¥'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 7, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3708 */     this.pumpModel['¥'].setRotationPoint(43.0F, 21.0F, -3.0F);
/*      */     
/* 3710 */     this.pumpModel['¦'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 7, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.75F);
/* 3711 */     this.pumpModel['¦'].setRotationPoint(42.0F, 21.0F, 17.0F);
/*      */     
/* 3713 */     this.pumpModel['§'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3714 */     this.pumpModel['§'].setRotationPoint(48.0F, 30.0F, 17.0F);
/*      */     
/* 3716 */     this.pumpModel['¨'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3717 */     this.pumpModel['¨'].setRotationPoint(46.0F, 28.0F, 18.0F);
/*      */     
/* 3719 */     this.pumpModel['©'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 3, 2, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.6F, 0.0F, -4.0F, 0.5F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 4.0F, -4.5F);
/* 3720 */     this.pumpModel['©'].setRotationPoint(43.0F, 38.0F, 14.5F);
/*      */     
/* 3722 */     this.pumpModel['ª'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, -1.0F, -4.5F);
/* 3723 */     this.pumpModel['ª'].setRotationPoint(42.0F, 42.0F, 14.5F);
/*      */     
/* 3725 */     this.pumpModel['«'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F);
/* 3726 */     this.pumpModel['«'].setRotationPoint(43.0F, 28.0F, 17.0F);
/*      */     
/* 3728 */     this.pumpModel['¬'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.5F);
/* 3729 */     this.pumpModel['¬'].setRotationPoint(42.0F, 28.0F, 17.0F);
/*      */     
/* 3731 */     this.pumpModel['­'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3732 */     this.pumpModel['­'].setRotationPoint(43.0F, 32.0F, -3.0F);
/*      */     
/* 3734 */     this.pumpModel['®'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.5F);
/* 3735 */     this.pumpModel['®'].setRotationPoint(42.0F, 32.0F, 17.0F);
/*      */     
/* 3737 */     this.pumpModel['¯'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.25F);
/* 3738 */     this.pumpModel['¯'].setRotationPoint(42.0F, 35.0F, 17.0F);
/*      */     
/* 3740 */     this.pumpModel['°'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F);
/* 3741 */     this.pumpModel['°'].setRotationPoint(42.0F, 38.0F, 11.0F);
/*      */     
/* 3743 */     this.pumpModel['±'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F);
/* 3744 */     this.pumpModel['±'].setRotationPoint(43.0F, 35.0F, 17.0F);
/*      */     
/* 3746 */     this.pumpModel['²'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 3.0F, 0.25F, 0.0F, 1.95F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3747 */     this.pumpModel['²'].setRotationPoint(43.0F, 38.0F, -2.0F);
/*      */     
/* 3749 */     this.pumpModel['³'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3750 */     this.pumpModel['³'].setRotationPoint(42.0F, 41.0F, 8.0F);
/*      */     
/* 3752 */     this.pumpModel['´'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3753 */     this.pumpModel['´'].setRotationPoint(43.0F, 41.0F, -1.0F);
/*      */     
/* 3755 */     this.pumpModel['µ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 2.95F, 0.75F, 0.0F, 1.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, -1.4F, 0.65F, 0.75F, -1.4F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3756 */     this.pumpModel['µ'].setRotationPoint(44.25F, 38.0F, -1.0F);
/*      */     
/* 3758 */     this.pumpModel['¶'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.65F, -2.0F, -0.4F, 0.65F, -2.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F);
/* 3759 */     this.pumpModel['¶'].setRotationPoint(46.0F, 38.0F, -1.0F);
/*      */     
/* 3761 */     this.pumpModel['·'].addShapeBox(86.0F, -60.0F, -8.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 3762 */     this.pumpModel['·'].setRotationPoint(157.0F, 36.0F, -2.5F);
/*      */     
/* 3764 */     this.pumpModel['¸'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3765 */     this.pumpModel['¸'].setRotationPoint(157.0F, 32.0F, 17.0F);
/*      */     
/* 3767 */     this.pumpModel['¹'].addShapeBox(86.0F, -60.0F, -8.0F, 30, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3768 */     this.pumpModel['¹'].setRotationPoint(127.0F, 32.0F, -3.0F);
/*      */     
/* 3770 */     this.pumpModel['º'].addShapeBox(86.0F, -60.0F, -8.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3771 */     this.pumpModel['º'].setRotationPoint(157.0F, 34.0F, -3.5F);
/*      */     
/* 3773 */     this.pumpModel['»'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, -2.0F, 0.0F, 5.0F, -2.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3774 */     this.pumpModel['»'].setRotationPoint(149.0F, 39.0F, 14.5F);
/*      */     
/* 3776 */     this.pumpModel['¼'].addShapeBox(86.0F, -60.0F, -8.0F, 22, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3777 */     this.pumpModel['¼'].setRotationPoint(115.0F, 36.0F, 16.5F);
/*      */     
/* 3779 */     this.pumpModel['½'].addShapeBox(86.0F, -60.0F, -8.0F, 12, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3780 */     this.pumpModel['½'].setRotationPoint(137.0F, 36.0F, 16.5F);
/*      */     
/* 3782 */     this.pumpModel['¾'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3783 */     this.pumpModel['¾'].setRotationPoint(149.0F, 36.0F, 16.5F);
/*      */     
/* 3785 */     this.pumpModel['¿'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3786 */     this.pumpModel['¿'].setRotationPoint(98.0F, 36.0F, 16.5F);
/*      */     
/* 3788 */     this.pumpModel['À'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3789 */     this.pumpModel['À'].setRotationPoint(94.0F, 36.0F, 16.5F);
/*      */     
/* 3791 */     this.pumpModel['Á'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3792 */     this.pumpModel['Á'].setRotationPoint(88.5F, 36.0F, 16.5F);
/*      */     
/* 3794 */     this.pumpModel['Â'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3795 */     this.pumpModel['Â'].setRotationPoint(83.0F, 36.0F, 16.5F);
/*      */     
/* 3797 */     this.pumpModel['Ã'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3798 */     this.pumpModel['Ã'].setRotationPoint(77.5F, 36.0F, 16.5F);
/*      */     
/* 3800 */     this.pumpModel['Ä'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3801 */     this.pumpModel['Ä'].setRotationPoint(72.0F, 36.0F, 16.5F);
/*      */     
/* 3803 */     this.pumpModel['Å'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3804 */     this.pumpModel['Å'].setRotationPoint(66.5F, 36.0F, 16.5F);
/*      */     
/* 3806 */     this.pumpModel['Æ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3807 */     this.pumpModel['Æ'].setRotationPoint(61.0F, 36.0F, 16.5F);
/*      */     
/* 3809 */     this.pumpModel['Ç'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3810 */     this.pumpModel['Ç'].setRotationPoint(55.5F, 36.0F, 16.5F);
/*      */     
/* 3812 */     this.pumpModel['È'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F);
/* 3813 */     this.pumpModel['È'].setRotationPoint(46.0F, 36.0F, 16.5F);
/*      */     
/* 3815 */     this.pumpModel['É'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3816 */     this.pumpModel['É'].setRotationPoint(92.5F, 36.0F, 16.5F);
/*      */     
/* 3818 */     this.pumpModel['Ê'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3819 */     this.pumpModel['Ê'].setRotationPoint(87.0F, 36.0F, 16.5F);
/*      */     
/* 3821 */     this.pumpModel['Ë'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3822 */     this.pumpModel['Ë'].setRotationPoint(81.5F, 36.0F, 16.5F);
/*      */     
/* 3824 */     this.pumpModel['Ì'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3825 */     this.pumpModel['Ì'].setRotationPoint(76.0F, 36.0F, 16.5F);
/*      */     
/* 3827 */     this.pumpModel['Í'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3828 */     this.pumpModel['Í'].setRotationPoint(70.5F, 36.0F, 16.5F);
/*      */     
/* 3830 */     this.pumpModel['Î'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3831 */     this.pumpModel['Î'].setRotationPoint(65.0F, 36.0F, 16.5F);
/*      */     
/* 3833 */     this.pumpModel['Ï'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3834 */     this.pumpModel['Ï'].setRotationPoint(59.5F, 36.0F, 16.5F);
/*      */     
/* 3836 */     this.pumpModel['Ð'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3837 */     this.pumpModel['Ð'].setRotationPoint(54.0F, 36.0F, 16.5F);
/*      */     
/* 3839 */     this.pumpModel['Ñ'].addShapeBox(86.0F, -60.0F, -8.0F, 12, 6, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, -3.0F, 5.0F, 0.0F, -3.0F, -4.5F, 0.0F, 0.0F, -1.5F);
/* 3840 */     this.pumpModel['Ñ'].setRotationPoint(137.0F, 39.0F, 14.5F);
/*      */     
/* 3842 */     this.pumpModel['Ò'].addShapeBox(86.0F, -60.0F, -8.0F, 22, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3843 */     this.pumpModel['Ò'].setRotationPoint(115.0F, 40.0F, 14.5F);
/*      */     
/* 3845 */     this.pumpModel['Ó'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 6, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -4.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.5F, 0.0F, -4.0F, -4.5F);
/* 3846 */     this.pumpModel['Ó'].setRotationPoint(98.0F, 39.0F, 14.5F);
/*      */     
/* 3848 */     this.pumpModel['Ô'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 3849 */     this.pumpModel['Ô'].setRotationPoint(94.0F, 38.0F, 14.5F);
/*      */     
/* 3851 */     this.pumpModel['Õ'].addShapeBox(86.0F, -60.0F, -8.0F, 30, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3852 */     this.pumpModel['Õ'].setRotationPoint(127.0F, 34.0F, -3.5F);
/*      */     
/* 3854 */     this.pumpModel['Ö'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3855 */     this.pumpModel['Ö'].setRotationPoint(103.5F, 34.0F, -3.5F);
/*      */     
/* 3857 */     this.pumpModel['×'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3858 */     this.pumpModel['×'].setRotationPoint(98.0F, 34.0F, -3.5F);
/*      */     
/* 3860 */     this.pumpModel['Ø'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3861 */     this.pumpModel['Ø'].setRotationPoint(121.5F, 35.0F, -3.5F);
/*      */     
/* 3863 */     this.pumpModel['Ù'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3864 */     this.pumpModel['Ù'].setRotationPoint(116.0F, 35.0F, -3.5F);
/*      */     
/* 3866 */     this.pumpModel['Ú'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3867 */     this.pumpModel['Ú'].setRotationPoint(110.5F, 35.0F, -3.5F);
/*      */     
/* 3869 */     this.pumpModel['Û'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F);
/* 3870 */     this.pumpModel['Û'].setRotationPoint(103.0F, 35.0F, -3.5F);
/*      */     
/* 3872 */     this.pumpModel['Ü'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3873 */     this.pumpModel['Ü'].setRotationPoint(99.5F, 35.0F, -3.5F);
/*      */     
/* 3875 */     this.pumpModel['Ý'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3876 */     this.pumpModel['Ý'].setRotationPoint(94.0F, 35.0F, -3.5F);
/*      */     
/* 3878 */     this.pumpModel['Þ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3879 */     this.pumpModel['Þ'].setRotationPoint(88.5F, 35.0F, -3.5F);
/*      */     
/* 3881 */     this.pumpModel['ß'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3882 */     this.pumpModel['ß'].setRotationPoint(83.0F, 35.0F, -3.5F);
/*      */     
/* 3884 */     this.pumpModel['à'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3885 */     this.pumpModel['à'].setRotationPoint(77.5F, 35.0F, -3.5F);
/*      */     
/* 3887 */     this.pumpModel['á'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3888 */     this.pumpModel['á'].setRotationPoint(72.0F, 35.0F, -3.5F);
/*      */     
/* 3890 */     this.pumpModel['â'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3891 */     this.pumpModel['â'].setRotationPoint(66.5F, 35.0F, -3.5F);
/*      */     
/* 3893 */     this.pumpModel['ã'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3894 */     this.pumpModel['ã'].setRotationPoint(61.0F, 35.0F, -3.5F);
/*      */     
/* 3896 */     this.pumpModel['ä'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3897 */     this.pumpModel['ä'].setRotationPoint(55.5F, 35.0F, -3.5F);
/*      */     
/* 3899 */     this.pumpModel['å'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3900 */     this.pumpModel['å'].setRotationPoint(88.5F, 38.0F, -0.5F);
/*      */     
/* 3902 */     this.pumpModel['æ'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3903 */     this.pumpModel['æ'].setRotationPoint(83.0F, 38.0F, -0.5F);
/*      */     
/* 3905 */     this.pumpModel['ç'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3906 */     this.pumpModel['ç'].setRotationPoint(77.5F, 38.0F, -0.5F);
/*      */     
/* 3908 */     this.pumpModel['è'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3909 */     this.pumpModel['è'].setRotationPoint(72.0F, 38.0F, -0.5F);
/*      */     
/* 3911 */     this.pumpModel['é'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3912 */     this.pumpModel['é'].setRotationPoint(66.5F, 38.0F, -0.5F);
/*      */     
/* 3914 */     this.pumpModel['ê'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3915 */     this.pumpModel['ê'].setRotationPoint(61.0F, 38.0F, -0.5F);
/*      */     
/* 3917 */     this.pumpModel['ë'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3918 */     this.pumpModel['ë'].setRotationPoint(55.5F, 38.0F, -0.5F);
/*      */     
/* 3920 */     this.pumpModel['ì'].addShapeBox(86.0F, -60.0F, -8.0F, 6, 3, 2, 0.0F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
/* 3921 */     this.pumpModel['ì'].setRotationPoint(48.0F, 38.0F, -0.5F);
/*      */     
/* 3923 */     this.pumpModel['í'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 3, 2, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 4.0F, 5.0F);
/* 3924 */     this.pumpModel['í'].setRotationPoint(43.0F, 38.0F, -0.5F);
/*      */     
/* 3926 */     this.pumpModel['î'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3927 */     this.pumpModel['î'].setRotationPoint(46.0F, 28.0F, -3.5F);
/*      */     
/* 3929 */     this.pumpModel['ï'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F);
/* 3930 */     this.pumpModel['ï'].setRotationPoint(42.0F, 32.0F, -3.0F);
/*      */     
/* 3932 */     this.pumpModel['ð'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F);
/* 3933 */     this.pumpModel['ð'].setRotationPoint(43.0F, 32.0F, 17.0F);
/*      */     
/* 3935 */     this.pumpModel['ñ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F);
/* 3936 */     this.pumpModel['ñ'].setRotationPoint(43.0F, 21.0F, 17.0F);
/*      */     
/* 3938 */     this.pumpModel['ò'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 4, 2, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3939 */     this.pumpModel['ò'].setRotationPoint(43.0F, 28.0F, -3.0F);
/*      */     
/* 3941 */     this.pumpModel['ó'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 4, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3942 */     this.pumpModel['ó'].setRotationPoint(42.0F, 28.0F, -5.0F);
/*      */     
/* 3944 */     this.pumpModel['ô'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 7, 2, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3945 */     this.pumpModel['ô'].setRotationPoint(42.0F, 21.0F, -3.0F);
/*      */     
/* 3947 */     this.pumpModel['õ'].addShapeBox(86.0F, -60.0F, -8.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3948 */     this.pumpModel['õ'].setRotationPoint(43.0F, 35.0F, -3.0F);
/*      */     
/* 3950 */     this.pumpModel['ö'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 6.5F);
/* 3951 */     this.pumpModel['ö'].setRotationPoint(42.0F, 35.0F, -3.0F);
/*      */     
/* 3953 */     this.pumpModel['÷'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 13, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3954 */     this.pumpModel['÷'].setRotationPoint(42.0F, 38.0F, -2.0F);
/*      */     
/* 3956 */     this.pumpModel['ø'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3957 */     this.pumpModel['ø'].setRotationPoint(42.0F, 37.0F, 4.0F);
/*      */     
/* 3959 */     this.pumpModel['ù'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3960 */     this.pumpModel['ù'].setRotationPoint(42.0F, 41.0F, -1.0F);
/*      */     
/* 3962 */     this.pumpModel['ú'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, -1.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, -1.0F, 5.0F);
/* 3963 */     this.pumpModel['ú'].setRotationPoint(42.0F, 42.0F, -0.5F);
/*      */     
/* 3965 */     this.pumpModel['û'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3966 */     this.pumpModel['û'].setRotationPoint(92.5F, 35.0F, -2.0F);
/*      */     
/* 3968 */     this.pumpModel['ü'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3969 */     this.pumpModel['ü'].setRotationPoint(87.0F, 35.0F, -2.0F);
/*      */     
/* 3971 */     this.pumpModel['ý'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3972 */     this.pumpModel['ý'].setRotationPoint(81.5F, 35.0F, -2.0F);
/*      */     
/* 3974 */     this.pumpModel['þ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3975 */     this.pumpModel['þ'].setRotationPoint(76.0F, 35.0F, -2.0F);
/*      */     
/* 3977 */     this.pumpModel['ÿ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3978 */     this.pumpModel['ÿ'].setRotationPoint(70.5F, 35.0F, -2.0F);
/*      */     
/* 3980 */     this.pumpModel['Ā'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3981 */     this.pumpModel['Ā'].setRotationPoint(65.0F, 35.0F, -2.0F);
/*      */     
/* 3983 */     this.pumpModel['ā'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3984 */     this.pumpModel['ā'].setRotationPoint(59.5F, 35.0F, -2.0F);
/*      */     
/* 3986 */     this.pumpModel['Ă'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3987 */     this.pumpModel['Ă'].setRotationPoint(54.0F, 35.0F, -2.0F);
/*      */     
/* 3989 */     this.pumpModel['ă'].addShapeBox(86.0F, -60.0F, -8.0F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3990 */     this.pumpModel['ă'].setRotationPoint(46.0F, 35.0F, -3.5F);
/*      */     
/* 3992 */     this.pumpModel['Ą'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 1, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3993 */     this.pumpModel['Ą'].setRotationPoint(46.0F, 14.0F, -3.0F);
/*      */     
/* 3995 */     this.pumpModel['ą'].addShapeBox(86.0F, -60.0F, -8.0F, 4, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3996 */     this.pumpModel['ą'].setRotationPoint(46.0F, 14.0F, -2.0F);
/*      */     
/* 3998 */     this.pumpModel['Ć'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.95F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F);
/* 3999 */     this.pumpModel['Ć'].setRotationPoint(43.0F, 38.0F, 16.0F);
/*      */     
/* 4001 */     this.pumpModel['ć'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F);
/* 4002 */     this.pumpModel['ć'].setRotationPoint(43.0F, 41.0F, 16.0F);
/*      */     
/* 4004 */     this.pumpModel['Ĉ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 1.5F, 0.0F, 0.0F, 2.95F, 0.0F, 0.0F, 0.0F, 0.75F, -1.4F, 0.0F, 0.75F, -1.4F, 0.65F, 0.0F, 0.0F, 0.25F);
/* 4005 */     this.pumpModel['Ĉ'].setRotationPoint(44.25F, 38.0F, 16.0F);
/*      */     
/* 4007 */     this.pumpModel['ĉ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, 1.5F, 0.0F, -0.4F, 0.0F, -2.0F, -0.4F, 0.0F, -2.0F, -0.4F, 0.65F, 0.0F, -0.4F, 0.65F);
/* 4008 */     this.pumpModel['ĉ'].setRotationPoint(46.0F, 38.0F, 16.0F);
/*      */     
/* 4010 */     this.pumpModel['Ċ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F);
/* 4011 */     this.pumpModel['Ċ'].setRotationPoint(97.5F, 35.0F, -3.5F);
/*      */     
/* 4013 */     this.pumpModel['ċ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4014 */     this.pumpModel['ċ'].setRotationPoint(93.0F, 38.0F, 0.5F);
/*      */     
/* 4016 */     this.pumpModel['Č'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4017 */     this.pumpModel['Č'].setRotationPoint(87.5F, 38.0F, 0.5F);
/*      */     
/* 4019 */     this.pumpModel['č'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4020 */     this.pumpModel['č'].setRotationPoint(82.0F, 38.0F, 0.5F);
/*      */     
/* 4022 */     this.pumpModel['Ď'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4023 */     this.pumpModel['Ď'].setRotationPoint(76.5F, 38.0F, 0.5F);
/*      */     
/* 4025 */     this.pumpModel['ď'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4026 */     this.pumpModel['ď'].setRotationPoint(71.0F, 38.0F, 0.5F);
/*      */     
/* 4028 */     this.pumpModel['Đ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4029 */     this.pumpModel['Đ'].setRotationPoint(65.5F, 38.0F, 0.5F);
/*      */     
/* 4031 */     this.pumpModel['đ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4032 */     this.pumpModel['đ'].setRotationPoint(60.0F, 38.0F, 0.5F);
/*      */     
/* 4034 */     this.pumpModel['Ē'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 3, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F);
/* 4035 */     this.pumpModel['Ē'].setRotationPoint(54.5F, 38.0F, 0.5F);
/*      */     
/* 4037 */     this.pumpModel['ē'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 3, 2, 0.0F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.5F, -2.0F, 0.0F, 5.5F, -2.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F);
/* 4038 */     this.pumpModel['ē'].setRotationPoint(149.0F, 39.0F, 12.0F);
/*      */     
/* 4040 */     this.pumpModel['Ĕ'].addShapeBox(86.0F, -60.0F, -8.0F, 12, 3, 3, 0.0F, 0.0F, -3.0F, 3.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, -3.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 4041 */     this.pumpModel['Ĕ'].setRotationPoint(137.0F, 39.0F, 6.5F);
/*      */     
/* 4043 */     this.pumpModel['ĕ'].addShapeBox(86.0F, -60.0F, -8.0F, 22, 3, 3, 0.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 4044 */     this.pumpModel['ĕ'].setRotationPoint(115.0F, 39.0F, 6.5F);
/*      */     
/* 4046 */     this.pumpModel['Ė'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4047 */     this.pumpModel['Ė'].setRotationPoint(98.0F, 38.0F, 6.5F);
/*      */     
/* 4049 */     this.pumpModel['ė'].addShapeBox(86.0F, -60.0F, -8.0F, 50, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4050 */     this.pumpModel['ė'].setRotationPoint(48.0F, 40.0F, 6.5F);
/*      */     
/* 4052 */     this.pumpModel['Ę'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 7, 3, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4053 */     this.pumpModel['Ę'].setRotationPoint(43.0F, 38.0F, 6.5F);
/*      */     
/* 4055 */     this.pumpModel['ę'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 1, 3, 0.0F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 4056 */     this.pumpModel['ę'].setRotationPoint(149.0F, 38.0F, 12.5F);
/*      */     
/* 4058 */     this.pumpModel['Ě'].addShapeBox(86.0F, -60.0F, -8.0F, 17, 1, 3, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4059 */     this.pumpModel['Ě'].setRotationPoint(149.0F, 38.0F, 0.5F);
/*      */     
/* 4061 */     this.pumpModel['ě'].addShapeBox(86.0F, -60.0F, -8.0F, 18, 5, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4062 */     this.pumpModel['ě'].setRotationPoint(-65.0F, 16.0F, 1.0F);
/*      */     
/* 4064 */     this.pumpModel['Ĝ'].addShapeBox(86.0F, -60.0F, -8.0F, 34, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4065 */     this.pumpModel['Ĝ'].setRotationPoint(-45.0F, 13.0F, 1.0F);
/*      */     
/* 4067 */     this.pumpModel['ĝ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4068 */     this.pumpModel['ĝ'].setRotationPoint(-47.0F, 16.0F, 1.0F);
/*      */     
/* 4070 */     this.pumpModel['Ğ'].addShapeBox(86.0F, -60.0F, -8.0F, 33, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4071 */     this.pumpModel['Ğ'].setRotationPoint(-44.0F, 13.5F, 0.5F);
/*      */     
/* 4073 */     this.pumpModel['ğ'].addShapeBox(86.0F, -60.0F, -8.0F, 34, 3, 3, 0.0F, -7.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4074 */     this.pumpModel['ğ'].setRotationPoint(-45.0F, 10.0F, 1.0F);
/*      */     
/* 4076 */     this.pumpModel['Ġ'].addShapeBox(86.0F, -60.0F, -8.0F, 1, 4, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4077 */     this.pumpModel['Ġ'].setRotationPoint(-45.0F, 13.5F, 0.5F);
/*      */     
/* 4079 */     this.pumpModel['ġ'].addShapeBox(86.0F, -60.0F, -8.0F, 5, 2, 2, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F);
/* 4080 */     this.pumpModel['ġ'].setRotationPoint(-20.0F, 18.25F, -1.0F);
/*      */     
/* 4082 */     this.pumpModel['Ģ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4083 */     this.pumpModel['Ģ'].setRotationPoint(-19.75F, 18.25F, -2.0F);
/*      */     
/* 4085 */     this.pumpModel['ģ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 1, 0.0F, 0.5F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 4086 */     this.pumpModel['ģ'].setRotationPoint(-19.75F, 17.75F, -3.0F);
/*      */     
/* 4088 */     this.pumpModel['Ĥ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 4, 3, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 4089 */     this.pumpModel['Ĥ'].setRotationPoint(-19.75F, 17.5F, -6.0F);
/*      */     
/* 4091 */     this.pumpModel['ĥ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F);
/* 4092 */     this.pumpModel['ĥ'].setRotationPoint(-19.75F, 17.75F, -7.0F);
/*      */     
/* 4094 */     this.pumpModel['Ħ'].addShapeBox(86.0F, -60.0F, -8.0F, 2, 2, 1, 0.0F, -0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, -1.25F, -0.5F, 0.5F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 4095 */     this.pumpModel['Ħ'].setRotationPoint(-19.75F, 18.5F, -8.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelspas12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */